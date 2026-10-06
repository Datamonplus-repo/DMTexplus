package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasmaq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAQUINAS POR FASE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProCod_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
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

   public tfasmaq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasmaq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasmaq_impl.class ));
   }

   public tfasmaq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASMAQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "MaqCodBis", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis), GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodBis_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodBis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ultimo Numero Lote p/Fase", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUltNlot_Internalname, GXutil.ltrim( localUtil.ntoc( A4638BarUltNlot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUltNlot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4638BarUltNlot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4638BarUltNlot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUltNlot_Jsonclick, 0, "", "", "", "", "", 1, edtBarUltNlot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASMAQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount688 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_688 = (short)(1) ;
            scanStartK0688( ) ;
            while ( RcdFound688 != 0 )
            {
               init_level_properties688( ) ;
               getByPrimaryKeyK0688( ) ;
               addRowK0688( ) ;
               scanNextK0688( ) ;
            }
            scanEndK0688( ) ;
            nBlankRcdCount688 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalK0688( ) ;
         standaloneModalK0688( ) ;
         sMode688 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRowK0688( ) ;
            edtavnRcdDeleted_688_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_688_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_688_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_688_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASLOT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasNPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASNPRD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasNPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasNPrd_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASKGS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASMTS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMts_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarMaqFas1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAQFAS1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMaqFas1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqFas1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasEst1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFecRIn1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECRIN1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIn1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIn1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFecRea1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarTieTeo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarUni1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarUni1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarHorIni1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarHorFin1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarTieRea1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasMtr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASMTR1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasMtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtr1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasKgm1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASKGM1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgm1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasNPr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASNPR1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasNPr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasNPr1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasPri1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASPRI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasPri1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasPri1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasBot1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASBOT1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasBot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasBot1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarNumBot1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMBOT1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarNumBot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumBot1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasRecu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASRECU_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasRecu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasRecu_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasDti1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASDTI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasDti1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDti1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasDtf1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASDTF1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasDtf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDtf1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarFasInc1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASINC1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarFasInc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasInc1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtBarEstPec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTPEC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEstPec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstPec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_688 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalK0688( ) ;
            }
            sendRowK0688( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount688 = (short)(5) ;
         nRcdExists_688 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartK0688( ) ;
            while ( RcdFound688 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75688( ) ;
               init_level_properties688( ) ;
               standaloneNotModalK0688( ) ;
               getByPrimaryKeyK0688( ) ;
               standaloneModalK0688( ) ;
               addRowK0688( ) ;
               scanNextK0688( ) ;
            }
            scanEndK0688( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode688 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75688( ) ;
      initAllK0688( ) ;
      init_level_properties688( ) ;
      nRcdExists_688 = (short)(0) ;
      nIsMod_688 = (short)(0) ;
      nRcdDeleted_688 = (short)(0) ;
      nBlankRcdCount688 = (short)(nBlankRcdUsr688+nBlankRcdCount688) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount688 > 0 )
      {
         standaloneNotModalK0688( ) ;
         standaloneModalK0688( ) ;
         addRowK0688( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarFasLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount688 = (short)(nBlankRcdCount688-1) ;
      }
      Gx_mode = sMode688 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASMAQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFASMAQ.htm");
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
      e11K02 ();
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
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4638BarUltNlot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4638BarUltNlot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z603MaqCodBis = httpContext.cgiGet( "Z603MaqCodBis") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194BarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            else
            {
               A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarUltNlot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarUltNlot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARULTNLOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarUltNlot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4638BarUltNlot = 0 ;
               n4638BarUltNlot = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4638BarUltNlot), 6, 0));
            }
            else
            {
               A4638BarUltNlot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarUltNlot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4638BarUltNlot = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4638BarUltNlot), 6, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFASMAQ");
            A457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
            forbiddenHiddens.add("MaqCodBis", GXutil.rtrim( localUtil.format( A603MaqCodBis, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tfasmaq:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
                        e11K02 ();
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
            initAllK015( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_688_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_688_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributesK015( ) ;
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

   public void confirm_K00( )
   {
      beforeValidateK015( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsK015( ) ;
         }
         else
         {
            checkExtendedTableK015( ) ;
            if ( AnyError == 0 )
            {
               zmK015( 4) ;
               zmK015( 5) ;
               zmK015( 6) ;
               zmK015( 7) ;
               zmK015( 8) ;
            }
            closeExtendedTableCursorsK015( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode15 = Gx_mode ;
         confirm_K0688( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode15 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesK00( ) ;
      }
   }

   public void confirm_K0688( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowK0688( ) ;
         if ( ( nRcdExists_688 != 0 ) || ( nIsMod_688 != 0 ) )
         {
            getKeyK0688( ) ;
            if ( ( nRcdExists_688 == 0 ) && ( nRcdDeleted_688 == 0 ) )
            {
               if ( RcdFound688 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateK0688( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableK0688( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsK0688( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARFASLOT_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarFasLot_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound688 != 0 )
               {
                  if ( nRcdDeleted_688 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyK0688( ) ;
                     loadK0688( ) ;
                     beforeValidateK0688( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsK0688( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_688 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateK0688( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableK0688( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsK0688( ) ;
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
                  if ( nRcdDeleted_688 == 0 )
                  {
                     GXCCtl = "BARFASLOT_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarFasLot_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_688_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasNPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMaqFas1_Internalname, GXutil.rtrim( A4302BarMaqFas1)) ;
         httpContext.changePostValue( edtBarFasEst1_Internalname, GXutil.ltrim( localUtil.ntoc( A4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecRIn1_Internalname, localUtil.format(A4304BarFecRIn1, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea1_Internalname, localUtil.format(A4305BarFecRea1, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo1_Internalname, GXutil.ltrim( localUtil.ntoc( A4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni1_Internalname, GXutil.ltrim( localUtil.ntoc( A4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorIni1_Internalname, GXutil.ltrim( localUtil.ntoc( A4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin1_Internalname, GXutil.ltrim( localUtil.ntoc( A4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea1_Internalname, GXutil.ltrim( localUtil.ntoc( A4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasMtr1_Internalname, GXutil.ltrim( localUtil.ntoc( A4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasKgm1_Internalname, GXutil.ltrim( localUtil.ntoc( A4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasNPr1_Internalname, GXutil.ltrim( localUtil.ntoc( A4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasPri1_Internalname, GXutil.ltrim( localUtil.ntoc( A4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasBot1_Internalname, GXutil.rtrim( A4314BarFasBot1)) ;
         httpContext.changePostValue( edtBarNumBot1_Internalname, GXutil.ltrim( localUtil.ntoc( A4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasRecu_Internalname, GXutil.ltrim( localUtil.ntoc( A4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasDti1_Internalname, localUtil.ttoc( A4927BarFasDti1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFasDtf1_Internalname, localUtil.ttoc( A4928BarFasDtf1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFasInc1_Internalname, GXutil.ltrim( localUtil.ntoc( A4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstPec_Internalname, GXutil.rtrim( A6662BarEstPec)) ;
         httpContext.changePostValue( "ZT_"+"Z4643BarFasLot_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4644BarFasNPrd_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4645BarFasKgs_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4646BarFasMts_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4302BarMaqFas1_"+sGXsfl_75_idx, GXutil.rtrim( Z4302BarMaqFas1)) ;
         httpContext.changePostValue( "ZT_"+"Z4303BarFasEst1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4304BarFecRIn1_"+sGXsfl_75_idx, localUtil.dtoc( Z4304BarFecRIn1, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4305BarFecRea1_"+sGXsfl_75_idx, localUtil.dtoc( Z4305BarFecRea1, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4306BarTieTeo1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4307BarUni1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4308BarHorIni1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4309BarHorFin1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4310BarTieRea1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4311BarFasMtr1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4312BarFasKgm1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4647BarFasNPr1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4313BarFasPri1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4314BarFasBot1_"+sGXsfl_75_idx, GXutil.rtrim( Z4314BarFasBot1)) ;
         httpContext.changePostValue( "ZT_"+"Z4315BarNumBot1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4648BarFasRecu_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4927BarFasDti1_"+sGXsfl_75_idx, localUtil.ttoc( Z4927BarFasDti1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4928BarFasDtf1_"+sGXsfl_75_idx, localUtil.ttoc( Z4928BarFasDtf1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4939BarFasInc1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6662BarEstPec_"+sGXsfl_75_idx, GXutil.rtrim( Z6662BarEstPec)) ;
         httpContext.changePostValue( "nRcdDeleted_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_688 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_688_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_688_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASLOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASNPRD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASKGS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASMTS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAQFAS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqFas1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECRIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIn1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASMTR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASKGM1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASNPR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASPRI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasPri1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasBot1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumBot1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASRECU_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasRecu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASDTI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDti1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASDTF1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDtf1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASINC1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasInc1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTPEC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstPec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionK00( )
   {
   }

   public void e11K02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV36LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36LitFe", AV36LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      AV38Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Station", AV38Station);
      GXv_char2[0] = AV39emprcod ;
      GXv_char3[0] = AV40emprnom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfasmaq_impl.this.AV39emprcod = GXv_char2[0] ;
      tfasmaq_impl.this.AV40emprnom = GXv_char3[0] ;
      tfasmaq_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39emprcod", AV39emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV40emprnom", AV40emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV35UsurCod", AV35UsurCod);
      GXt_char1 = AV17Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV21Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit5", AV21Lit5);
      GXt_char1 = AV22Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1027_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit6", AV22Lit6);
      GXt_char1 = AV23Lit7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit7", AV23Lit7);
      GXt_char1 = AV24Lit8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN619_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit8", AV24Lit8);
      GXt_char1 = AV25Lit9 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN748_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit9", AV25Lit9);
      GXt_char1 = AV26Lit10 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN437_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit10", AV26Lit10);
      GXt_char1 = AV27Lit11 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1106_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit11", AV27Lit11);
      GXt_char1 = AV28Lit12 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1074_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit12", AV28Lit12);
      GXt_char1 = AV29Lit13 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1245_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit13", AV29Lit13);
      GXt_char1 = AV30Lit14 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN467_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit14", AV30Lit14);
      GXt_char1 = AV31Lit15 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1141_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit15", AV31Lit15);
      GXt_char1 = AV32Lit16 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1139_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit16", AV32Lit16);
      GXt_char1 = AV33Lit17 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1365_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit17", AV33Lit17);
      GXt_char1 = AV34Lit18 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit18", AV34Lit18);
      GXt_char1 = AV37lit19 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT240_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37lit19", AV37lit19);
      GXt_char1 = AV42Lit20 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT23_", ""), (byte)(99), GXv_char4) ;
      tfasmaq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit20", AV42Lit20);
   }

   public void zmK015( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4638BarUltNlot = T00K05_A4638BarUltNlot[0] ;
            Z457FasCod = T00K05_A457FasCod[0] ;
            Z603MaqCodBis = T00K05_A603MaqCodBis[0] ;
         }
         else
         {
            Z4638BarUltNlot = A4638BarUltNlot ;
            Z457FasCod = A457FasCod ;
            Z603MaqCodBis = A603MaqCodBis ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z4638BarUltNlot = A4638BarUltNlot ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z407EmprNom = A407EmprNom ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      /* Using cursor T00K06 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00K06_A407EmprNom[0] ;
      n407EmprNom = T00K06_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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
      /* Using cursor T00K09 */
      pr_default.execute(7, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T00K010 */
      pr_default.execute(8, new Object[] {A396EmprCod, A603MaqCodBis});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODBIS");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
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

   public void loadK015( )
   {
      /* Using cursor T00K011 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T00K011_A407EmprNom[0] ;
         n407EmprNom = T00K011_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T00K011_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4638BarUltNlot = T00K011_A4638BarUltNlot[0] ;
         n4638BarUltNlot = T00K011_n4638BarUltNlot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4638BarUltNlot), 6, 0));
         A457FasCod = T00K011_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T00K011_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         zmK015( -3) ;
      }
      pr_default.close(9);
      onLoadActionsK015( ) ;
   }

   public void onLoadActionsK015( )
   {
   }

   public void checkExtendedTableK015( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00K07 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00K07_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(5);
      /* Using cursor T00K08 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursorsK015( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A758ProCod )
   {
      /* Using cursor T00K012 */
      pr_default.execute(10, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00K012_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A758ProCod )
   {
      /* Using cursor T00K013 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKeyK015( )
   {
      /* Using cursor T00K014 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00K05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00K05_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00K05_A129BarCod[0] == A129BarCod ) && ( T00K05_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K05_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmK015( 3) ;
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00K05_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4638BarUltNlot = T00K05_A4638BarUltNlot[0] ;
         n4638BarUltNlot = T00K05_n4638BarUltNlot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4638BarUltNlot), 6, 0));
         A758ProCod = T00K05_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T00K05_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T00K05_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadK015( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKeyK015( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyK015( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyK015( ) ;
      if ( RcdFound15 == 0 )
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
      RcdFound15 = (short)(0) ;
      /* Using cursor T00K015 */
      pr_default.execute(13, new Object[] {Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00K015_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00K015_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00K015_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T00K015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00K015_A129BarCod[0] == A129BarCod ) && ( T00K015_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K015_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00K015_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00K015_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00K015_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T00K015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00K015_A129BarCod[0] == A129BarCod ) && ( T00K015_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K015_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A194BarOrdLin = T00K015_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A758ProCod = T00K015_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T00K016 */
      pr_default.execute(14, new Object[] {Short.valueOf(A194BarOrdLin), Short.valueOf(A194BarOrdLin), A758ProCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T00K016_A194BarOrdLin[0] > A194BarOrdLin ) || ( T00K016_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00K016_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T00K016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00K016_A129BarCod[0] == A129BarCod ) && ( T00K016_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K016_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T00K016_A194BarOrdLin[0] < A194BarOrdLin ) || ( T00K016_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00K016_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T00K016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00K016_A129BarCod[0] == A129BarCod ) && ( T00K016_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K016_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A194BarOrdLin = T00K016_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A758ProCod = T00K016_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyK015( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertK015( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateK015( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertK015( ) ;
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
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertK015( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProCod_Internalname ;
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
      getKeyK015( ) ;
      if ( RcdFound15 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
         {
            A758ProCod = Z758ProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = Z194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasmaq");
      GX_FocusControl = edtBarUltNlot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_K00( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarUltNlot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartK015( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarUltNlot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndK015( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarUltNlot_Internalname ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarUltNlot_Internalname ;
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
      scanStartK015( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNextK015( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarUltNlot_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndK015( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyK015( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00K04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4638BarUltNlot != T00K04_A4638BarUltNlot[0] ) || ( GXutil.strcmp(Z457FasCod, T00K04_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z603MaqCodBis, T00K04_A603MaqCodBis[0]) != 0 ) )
         {
            if ( Z4638BarUltNlot != T00K04_A4638BarUltNlot[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarUltNlot");
               GXutil.writeLogRaw("Old: ",Z4638BarUltNlot);
               GXutil.writeLogRaw("Current: ",T00K04_A4638BarUltNlot[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00K04_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00K04_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z603MaqCodBis, T00K04_A603MaqCodBis[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"MaqCodBis");
               GXutil.writeLogRaw("Old: ",Z603MaqCodBis);
               GXutil.writeLogRaw("Current: ",T00K04_A603MaqCodBis[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertK015( )
   {
      beforeValidateK015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableK015( ) ;
      }
      if ( AnyError == 0 )
      {
         zmK015( 0) ;
         checkOptimisticConcurrencyK015( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmK015( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertK015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00K017 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A194BarOrdLin), Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod, A603MaqCodBis});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevelK015( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionK00( ) ;
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
            loadK015( ) ;
         }
         endLevelK015( ) ;
      }
      closeExtendedTableCursorsK015( ) ;
   }

   public void updateK015( )
   {
      beforeValidateK015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableK015( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyK015( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmK015( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateK015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00K018 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A457FasCod, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateK015( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelK015( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionK00( ) ;
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
         endLevelK015( ) ;
      }
      closeExtendedTableCursorsK015( ) ;
   }

   public void deferredUpdateK015( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateK015( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyK015( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsK015( ) ;
         afterConfirmK015( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteK015( ) ;
            if ( AnyError == 0 )
            {
               scanStartK0688( ) ;
               while ( RcdFound688 != 0 )
               {
                  getByPrimaryKeyK0688( ) ;
                  deleteK0688( ) ;
                  scanNextK0688( ) ;
               }
               scanEndK0688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00K019 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound15 == 0 )
                        {
                           initAllK015( ) ;
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
                        resetCaptionK00( ) ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelK015( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsK015( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00K020 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T00K020_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00K021 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00K022 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00K023 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00K024 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00K025 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00K026 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00K027 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00K028 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00K029 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00K030 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00K031 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00K032 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00K033 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00K034 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00K035 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00K036 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00K037 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00K038 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00K039 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGHDFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00K040 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00K041 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void processNestedLevelK0688( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowK0688( ) ;
         if ( ( nRcdExists_688 != 0 ) || ( nIsMod_688 != 0 ) )
         {
            standaloneNotModalK0688( ) ;
            getKeyK0688( ) ;
            if ( ( nRcdExists_688 == 0 ) && ( nRcdDeleted_688 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertK0688( ) ;
            }
            else
            {
               if ( RcdFound688 != 0 )
               {
                  if ( ( nRcdDeleted_688 != 0 ) && ( nRcdExists_688 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteK0688( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_688 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateK0688( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_688 == 0 )
                  {
                     GXCCtl = "BARFASLOT_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarFasLot_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_688_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasLot_Internalname, GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasNPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMaqFas1_Internalname, GXutil.rtrim( A4302BarMaqFas1)) ;
         httpContext.changePostValue( edtBarFasEst1_Internalname, GXutil.ltrim( localUtil.ntoc( A4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFecRIn1_Internalname, localUtil.format(A4304BarFecRIn1, "99/99/99")) ;
         httpContext.changePostValue( edtBarFecRea1_Internalname, localUtil.format(A4305BarFecRea1, "99/99/99")) ;
         httpContext.changePostValue( edtBarTieTeo1_Internalname, GXutil.ltrim( localUtil.ntoc( A4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarUni1_Internalname, GXutil.ltrim( localUtil.ntoc( A4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorIni1_Internalname, GXutil.ltrim( localUtil.ntoc( A4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarHorFin1_Internalname, GXutil.ltrim( localUtil.ntoc( A4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTieRea1_Internalname, GXutil.ltrim( localUtil.ntoc( A4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasMtr1_Internalname, GXutil.ltrim( localUtil.ntoc( A4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasKgm1_Internalname, GXutil.ltrim( localUtil.ntoc( A4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasNPr1_Internalname, GXutil.ltrim( localUtil.ntoc( A4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasPri1_Internalname, GXutil.ltrim( localUtil.ntoc( A4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasBot1_Internalname, GXutil.rtrim( A4314BarFasBot1)) ;
         httpContext.changePostValue( edtBarNumBot1_Internalname, GXutil.ltrim( localUtil.ntoc( A4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasRecu_Internalname, GXutil.ltrim( localUtil.ntoc( A4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarFasDti1_Internalname, localUtil.ttoc( A4927BarFasDti1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFasDtf1_Internalname, localUtil.ttoc( A4928BarFasDtf1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBarFasInc1_Internalname, GXutil.ltrim( localUtil.ntoc( A4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEstPec_Internalname, GXutil.rtrim( A6662BarEstPec)) ;
         httpContext.changePostValue( "ZT_"+"Z4643BarFasLot_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4644BarFasNPrd_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4645BarFasKgs_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4646BarFasMts_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4302BarMaqFas1_"+sGXsfl_75_idx, GXutil.rtrim( Z4302BarMaqFas1)) ;
         httpContext.changePostValue( "ZT_"+"Z4303BarFasEst1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4304BarFecRIn1_"+sGXsfl_75_idx, localUtil.dtoc( Z4304BarFecRIn1, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4305BarFecRea1_"+sGXsfl_75_idx, localUtil.dtoc( Z4305BarFecRea1, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4306BarTieTeo1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4307BarUni1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4308BarHorIni1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4309BarHorFin1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4310BarTieRea1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4311BarFasMtr1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4312BarFasKgm1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4647BarFasNPr1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4313BarFasPri1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4314BarFasBot1_"+sGXsfl_75_idx, GXutil.rtrim( Z4314BarFasBot1)) ;
         httpContext.changePostValue( "ZT_"+"Z4315BarNumBot1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4648BarFasRecu_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4927BarFasDti1_"+sGXsfl_75_idx, localUtil.ttoc( Z4927BarFasDti1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4928BarFasDtf1_"+sGXsfl_75_idx, localUtil.ttoc( Z4928BarFasDtf1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4939BarFasInc1_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6662BarEstPec_"+sGXsfl_75_idx, GXutil.rtrim( Z6662BarEstPec)) ;
         httpContext.changePostValue( "nRcdDeleted_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_688_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_688 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_688_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_688_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASLOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASNPRD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASKGS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASMTS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMAQFAS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqFas1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASEST1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECRIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIn1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFECREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIETEO1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARUNI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORINI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARHORFIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTIEREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASMTR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASKGM1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASNPR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASPRI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasPri1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasBot1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARNUMBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumBot1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASRECU_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasRecu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASDTI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDti1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASDTF1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDtf1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARFASINC1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasInc1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARESTPEC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstPec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllK0688( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_688 = (short)(0) ;
      nIsMod_688 = (short)(0) ;
      nRcdDeleted_688 = (short)(0) ;
   }

   public void processLevelK015( )
   {
      /* Save parent mode. */
      sMode15 = Gx_mode ;
      processNestedLevelK0688( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelK015( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteK015( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfasmaq");
         if ( AnyError == 0 )
         {
            confirmValuesK00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasmaq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartK015( )
   {
      /* Scan By routine */
      /* Using cursor T00K042 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A758ProCod = T00K042_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00K042_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextK015( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A758ProCod = T00K042_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = T00K042_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void scanEndK015( )
   {
      pr_default.close(40);
   }

   public void afterConfirmK015( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertK015( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateK015( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteK015( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteK015( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateK015( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesK015( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarUltNlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUltNlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUltNlot_Enabled), 5, 0), true);
   }

   public void zmK0688( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4644BarFasNPrd = T00K03_A4644BarFasNPrd[0] ;
            Z4645BarFasKgs = T00K03_A4645BarFasKgs[0] ;
            Z4646BarFasMts = T00K03_A4646BarFasMts[0] ;
            Z4302BarMaqFas1 = T00K03_A4302BarMaqFas1[0] ;
            Z4303BarFasEst1 = T00K03_A4303BarFasEst1[0] ;
            Z4304BarFecRIn1 = T00K03_A4304BarFecRIn1[0] ;
            Z4305BarFecRea1 = T00K03_A4305BarFecRea1[0] ;
            Z4306BarTieTeo1 = T00K03_A4306BarTieTeo1[0] ;
            Z4307BarUni1 = T00K03_A4307BarUni1[0] ;
            Z4308BarHorIni1 = T00K03_A4308BarHorIni1[0] ;
            Z4309BarHorFin1 = T00K03_A4309BarHorFin1[0] ;
            Z4310BarTieRea1 = T00K03_A4310BarTieRea1[0] ;
            Z4311BarFasMtr1 = T00K03_A4311BarFasMtr1[0] ;
            Z4312BarFasKgm1 = T00K03_A4312BarFasKgm1[0] ;
            Z4647BarFasNPr1 = T00K03_A4647BarFasNPr1[0] ;
            Z4313BarFasPri1 = T00K03_A4313BarFasPri1[0] ;
            Z4314BarFasBot1 = T00K03_A4314BarFasBot1[0] ;
            Z4315BarNumBot1 = T00K03_A4315BarNumBot1[0] ;
            Z4648BarFasRecu = T00K03_A4648BarFasRecu[0] ;
            Z4927BarFasDti1 = T00K03_A4927BarFasDti1[0] ;
            Z4928BarFasDtf1 = T00K03_A4928BarFasDtf1[0] ;
            Z4939BarFasInc1 = T00K03_A4939BarFasInc1[0] ;
            Z6662BarEstPec = T00K03_A6662BarEstPec[0] ;
         }
         else
         {
            Z4644BarFasNPrd = A4644BarFasNPrd ;
            Z4645BarFasKgs = A4645BarFasKgs ;
            Z4646BarFasMts = A4646BarFasMts ;
            Z4302BarMaqFas1 = A4302BarMaqFas1 ;
            Z4303BarFasEst1 = A4303BarFasEst1 ;
            Z4304BarFecRIn1 = A4304BarFecRIn1 ;
            Z4305BarFecRea1 = A4305BarFecRea1 ;
            Z4306BarTieTeo1 = A4306BarTieTeo1 ;
            Z4307BarUni1 = A4307BarUni1 ;
            Z4308BarHorIni1 = A4308BarHorIni1 ;
            Z4309BarHorFin1 = A4309BarHorFin1 ;
            Z4310BarTieRea1 = A4310BarTieRea1 ;
            Z4311BarFasMtr1 = A4311BarFasMtr1 ;
            Z4312BarFasKgm1 = A4312BarFasKgm1 ;
            Z4647BarFasNPr1 = A4647BarFasNPr1 ;
            Z4313BarFasPri1 = A4313BarFasPri1 ;
            Z4314BarFasBot1 = A4314BarFasBot1 ;
            Z4315BarNumBot1 = A4315BarNumBot1 ;
            Z4648BarFasRecu = A4648BarFasRecu ;
            Z4927BarFasDti1 = A4927BarFasDti1 ;
            Z4928BarFasDtf1 = A4928BarFasDtf1 ;
            Z4939BarFasInc1 = A4939BarFasInc1 ;
            Z6662BarEstPec = A6662BarEstPec ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         Z4644BarFasNPrd = A4644BarFasNPrd ;
         Z4645BarFasKgs = A4645BarFasKgs ;
         Z4646BarFasMts = A4646BarFasMts ;
         Z4302BarMaqFas1 = A4302BarMaqFas1 ;
         Z4303BarFasEst1 = A4303BarFasEst1 ;
         Z4304BarFecRIn1 = A4304BarFecRIn1 ;
         Z4305BarFecRea1 = A4305BarFecRea1 ;
         Z4306BarTieTeo1 = A4306BarTieTeo1 ;
         Z4307BarUni1 = A4307BarUni1 ;
         Z4308BarHorIni1 = A4308BarHorIni1 ;
         Z4309BarHorFin1 = A4309BarHorFin1 ;
         Z4310BarTieRea1 = A4310BarTieRea1 ;
         Z4311BarFasMtr1 = A4311BarFasMtr1 ;
         Z4312BarFasKgm1 = A4312BarFasKgm1 ;
         Z4647BarFasNPr1 = A4647BarFasNPr1 ;
         Z4313BarFasPri1 = A4313BarFasPri1 ;
         Z4314BarFasBot1 = A4314BarFasBot1 ;
         Z4315BarNumBot1 = A4315BarNumBot1 ;
         Z4648BarFasRecu = A4648BarFasRecu ;
         Z4927BarFasDti1 = A4927BarFasDti1 ;
         Z4928BarFasDtf1 = A4928BarFasDtf1 ;
         Z4939BarFasInc1 = A4939BarFasInc1 ;
         Z6662BarEstPec = A6662BarEstPec ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
      }
   }

   public void standaloneNotModalK0688( )
   {
   }

   public void standaloneModalK0688( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarFasLot_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtBarFasLot_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void loadK0688( )
   {
      /* Using cursor T00K043 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A4644BarFasNPrd = T00K043_A4644BarFasNPrd[0] ;
         n4644BarFasNPrd = T00K043_n4644BarFasNPrd[0] ;
         A4645BarFasKgs = T00K043_A4645BarFasKgs[0] ;
         n4645BarFasKgs = T00K043_n4645BarFasKgs[0] ;
         A4646BarFasMts = T00K043_A4646BarFasMts[0] ;
         n4646BarFasMts = T00K043_n4646BarFasMts[0] ;
         A4302BarMaqFas1 = T00K043_A4302BarMaqFas1[0] ;
         n4302BarMaqFas1 = T00K043_n4302BarMaqFas1[0] ;
         A4303BarFasEst1 = T00K043_A4303BarFasEst1[0] ;
         n4303BarFasEst1 = T00K043_n4303BarFasEst1[0] ;
         A4304BarFecRIn1 = T00K043_A4304BarFecRIn1[0] ;
         n4304BarFecRIn1 = T00K043_n4304BarFecRIn1[0] ;
         A4305BarFecRea1 = T00K043_A4305BarFecRea1[0] ;
         n4305BarFecRea1 = T00K043_n4305BarFecRea1[0] ;
         A4306BarTieTeo1 = T00K043_A4306BarTieTeo1[0] ;
         n4306BarTieTeo1 = T00K043_n4306BarTieTeo1[0] ;
         A4307BarUni1 = T00K043_A4307BarUni1[0] ;
         n4307BarUni1 = T00K043_n4307BarUni1[0] ;
         A4308BarHorIni1 = T00K043_A4308BarHorIni1[0] ;
         n4308BarHorIni1 = T00K043_n4308BarHorIni1[0] ;
         A4309BarHorFin1 = T00K043_A4309BarHorFin1[0] ;
         n4309BarHorFin1 = T00K043_n4309BarHorFin1[0] ;
         A4310BarTieRea1 = T00K043_A4310BarTieRea1[0] ;
         n4310BarTieRea1 = T00K043_n4310BarTieRea1[0] ;
         A4311BarFasMtr1 = T00K043_A4311BarFasMtr1[0] ;
         n4311BarFasMtr1 = T00K043_n4311BarFasMtr1[0] ;
         A4312BarFasKgm1 = T00K043_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = T00K043_n4312BarFasKgm1[0] ;
         A4647BarFasNPr1 = T00K043_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = T00K043_n4647BarFasNPr1[0] ;
         A4313BarFasPri1 = T00K043_A4313BarFasPri1[0] ;
         n4313BarFasPri1 = T00K043_n4313BarFasPri1[0] ;
         A4314BarFasBot1 = T00K043_A4314BarFasBot1[0] ;
         n4314BarFasBot1 = T00K043_n4314BarFasBot1[0] ;
         A4315BarNumBot1 = T00K043_A4315BarNumBot1[0] ;
         n4315BarNumBot1 = T00K043_n4315BarNumBot1[0] ;
         A4648BarFasRecu = T00K043_A4648BarFasRecu[0] ;
         n4648BarFasRecu = T00K043_n4648BarFasRecu[0] ;
         A4927BarFasDti1 = T00K043_A4927BarFasDti1[0] ;
         n4927BarFasDti1 = T00K043_n4927BarFasDti1[0] ;
         A4928BarFasDtf1 = T00K043_A4928BarFasDtf1[0] ;
         n4928BarFasDtf1 = T00K043_n4928BarFasDtf1[0] ;
         A4939BarFasInc1 = T00K043_A4939BarFasInc1[0] ;
         n4939BarFasInc1 = T00K043_n4939BarFasInc1[0] ;
         A6662BarEstPec = T00K043_A6662BarEstPec[0] ;
         n6662BarEstPec = T00K043_n6662BarEstPec[0] ;
         zmK0688( -9) ;
      }
      pr_default.close(41);
      onLoadActionsK0688( ) ;
   }

   public void onLoadActionsK0688( )
   {
   }

   public void checkExtendedTableK0688( )
   {
      nIsDirty_688 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalK0688( ) ;
   }

   public void closeExtendedTableCursorsK0688( )
   {
   }

   public void enableDisableK0688( )
   {
   }

   public void getKeyK0688( )
   {
      /* Using cursor T00K044 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound688 = (short)(1) ;
      }
      else
      {
         RcdFound688 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKeyK0688( )
   {
      /* Using cursor T00K03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      if ( (pr_default.getStatus(1) != 101) && ( T00K03_A129BarCod[0] == A129BarCod ) && ( T00K03_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00K03_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00K03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmK0688( 9) ;
         RcdFound688 = (short)(1) ;
         initializeNonKeyK0688( ) ;
         A4643BarFasLot = T00K03_A4643BarFasLot[0] ;
         A4644BarFasNPrd = T00K03_A4644BarFasNPrd[0] ;
         n4644BarFasNPrd = T00K03_n4644BarFasNPrd[0] ;
         A4645BarFasKgs = T00K03_A4645BarFasKgs[0] ;
         n4645BarFasKgs = T00K03_n4645BarFasKgs[0] ;
         A4646BarFasMts = T00K03_A4646BarFasMts[0] ;
         n4646BarFasMts = T00K03_n4646BarFasMts[0] ;
         A4302BarMaqFas1 = T00K03_A4302BarMaqFas1[0] ;
         n4302BarMaqFas1 = T00K03_n4302BarMaqFas1[0] ;
         A4303BarFasEst1 = T00K03_A4303BarFasEst1[0] ;
         n4303BarFasEst1 = T00K03_n4303BarFasEst1[0] ;
         A4304BarFecRIn1 = T00K03_A4304BarFecRIn1[0] ;
         n4304BarFecRIn1 = T00K03_n4304BarFecRIn1[0] ;
         A4305BarFecRea1 = T00K03_A4305BarFecRea1[0] ;
         n4305BarFecRea1 = T00K03_n4305BarFecRea1[0] ;
         A4306BarTieTeo1 = T00K03_A4306BarTieTeo1[0] ;
         n4306BarTieTeo1 = T00K03_n4306BarTieTeo1[0] ;
         A4307BarUni1 = T00K03_A4307BarUni1[0] ;
         n4307BarUni1 = T00K03_n4307BarUni1[0] ;
         A4308BarHorIni1 = T00K03_A4308BarHorIni1[0] ;
         n4308BarHorIni1 = T00K03_n4308BarHorIni1[0] ;
         A4309BarHorFin1 = T00K03_A4309BarHorFin1[0] ;
         n4309BarHorFin1 = T00K03_n4309BarHorFin1[0] ;
         A4310BarTieRea1 = T00K03_A4310BarTieRea1[0] ;
         n4310BarTieRea1 = T00K03_n4310BarTieRea1[0] ;
         A4311BarFasMtr1 = T00K03_A4311BarFasMtr1[0] ;
         n4311BarFasMtr1 = T00K03_n4311BarFasMtr1[0] ;
         A4312BarFasKgm1 = T00K03_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = T00K03_n4312BarFasKgm1[0] ;
         A4647BarFasNPr1 = T00K03_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = T00K03_n4647BarFasNPr1[0] ;
         A4313BarFasPri1 = T00K03_A4313BarFasPri1[0] ;
         n4313BarFasPri1 = T00K03_n4313BarFasPri1[0] ;
         A4314BarFasBot1 = T00K03_A4314BarFasBot1[0] ;
         n4314BarFasBot1 = T00K03_n4314BarFasBot1[0] ;
         A4315BarNumBot1 = T00K03_A4315BarNumBot1[0] ;
         n4315BarNumBot1 = T00K03_n4315BarNumBot1[0] ;
         A4648BarFasRecu = T00K03_A4648BarFasRecu[0] ;
         n4648BarFasRecu = T00K03_n4648BarFasRecu[0] ;
         A4927BarFasDti1 = T00K03_A4927BarFasDti1[0] ;
         n4927BarFasDti1 = T00K03_n4927BarFasDti1[0] ;
         A4928BarFasDtf1 = T00K03_A4928BarFasDtf1[0] ;
         n4928BarFasDtf1 = T00K03_n4928BarFasDtf1[0] ;
         A4939BarFasInc1 = T00K03_A4939BarFasInc1[0] ;
         n4939BarFasInc1 = T00K03_n4939BarFasInc1[0] ;
         A6662BarEstPec = T00K03_A6662BarEstPec[0] ;
         n6662BarEstPec = T00K03_n6662BarEstPec[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4643BarFasLot = A4643BarFasLot ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalK0688( ) ;
         loadK0688( ) ;
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound688 = (short)(0) ;
         initializeNonKeyK0688( ) ;
         sMode688 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalK0688( ) ;
         Gx_mode = sMode688 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesK0688( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyK0688( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00K02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASMAQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z4644BarFasNPrd != T00K02_A4644BarFasNPrd[0] ) || ( DecimalUtil.compareTo(Z4645BarFasKgs, T00K02_A4645BarFasKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z4646BarFasMts, T00K02_A4646BarFasMts[0]) != 0 ) || ( GXutil.strcmp(Z4302BarMaqFas1, T00K02_A4302BarMaqFas1[0]) != 0 ) || ( Z4303BarFasEst1 != T00K02_A4303BarFasEst1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4304BarFecRIn1), GXutil.resetTime(T00K02_A4304BarFecRIn1[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4305BarFecRea1), GXutil.resetTime(T00K02_A4305BarFecRea1[0])) ) || ( DecimalUtil.compareTo(Z4306BarTieTeo1, T00K02_A4306BarTieTeo1[0]) != 0 ) || ( DecimalUtil.compareTo(Z4307BarUni1, T00K02_A4307BarUni1[0]) != 0 ) || ( Z4308BarHorIni1 != T00K02_A4308BarHorIni1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4309BarHorFin1 != T00K02_A4309BarHorFin1[0] ) || ( DecimalUtil.compareTo(Z4310BarTieRea1, T00K02_A4310BarTieRea1[0]) != 0 ) || ( DecimalUtil.compareTo(Z4311BarFasMtr1, T00K02_A4311BarFasMtr1[0]) != 0 ) || ( DecimalUtil.compareTo(Z4312BarFasKgm1, T00K02_A4312BarFasKgm1[0]) != 0 ) || ( Z4647BarFasNPr1 != T00K02_A4647BarFasNPr1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4313BarFasPri1 != T00K02_A4313BarFasPri1[0] ) || ( GXutil.strcmp(Z4314BarFasBot1, T00K02_A4314BarFasBot1[0]) != 0 ) || ( Z4315BarNumBot1 != T00K02_A4315BarNumBot1[0] ) || ( Z4648BarFasRecu != T00K02_A4648BarFasRecu[0] ) || !( GXutil.dateCompare(Z4927BarFasDti1, T00K02_A4927BarFasDti1[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4928BarFasDtf1, T00K02_A4928BarFasDtf1[0]) ) || ( Z4939BarFasInc1 != T00K02_A4939BarFasInc1[0] ) || ( GXutil.strcmp(Z6662BarEstPec, T00K02_A6662BarEstPec[0]) != 0 ) )
         {
            if ( Z4644BarFasNPrd != T00K02_A4644BarFasNPrd[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasNPrd");
               GXutil.writeLogRaw("Old: ",Z4644BarFasNPrd);
               GXutil.writeLogRaw("Current: ",T00K02_A4644BarFasNPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z4645BarFasKgs, T00K02_A4645BarFasKgs[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasKgs");
               GXutil.writeLogRaw("Old: ",Z4645BarFasKgs);
               GXutil.writeLogRaw("Current: ",T00K02_A4645BarFasKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z4646BarFasMts, T00K02_A4646BarFasMts[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasMts");
               GXutil.writeLogRaw("Old: ",Z4646BarFasMts);
               GXutil.writeLogRaw("Current: ",T00K02_A4646BarFasMts[0]);
            }
            if ( GXutil.strcmp(Z4302BarMaqFas1, T00K02_A4302BarMaqFas1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarMaqFas1");
               GXutil.writeLogRaw("Old: ",Z4302BarMaqFas1);
               GXutil.writeLogRaw("Current: ",T00K02_A4302BarMaqFas1[0]);
            }
            if ( Z4303BarFasEst1 != T00K02_A4303BarFasEst1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasEst1");
               GXutil.writeLogRaw("Old: ",Z4303BarFasEst1);
               GXutil.writeLogRaw("Current: ",T00K02_A4303BarFasEst1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4304BarFecRIn1), GXutil.resetTime(T00K02_A4304BarFecRIn1[0])) ) )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFecRIn1");
               GXutil.writeLogRaw("Old: ",Z4304BarFecRIn1);
               GXutil.writeLogRaw("Current: ",T00K02_A4304BarFecRIn1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4305BarFecRea1), GXutil.resetTime(T00K02_A4305BarFecRea1[0])) ) )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFecRea1");
               GXutil.writeLogRaw("Old: ",Z4305BarFecRea1);
               GXutil.writeLogRaw("Current: ",T00K02_A4305BarFecRea1[0]);
            }
            if ( DecimalUtil.compareTo(Z4306BarTieTeo1, T00K02_A4306BarTieTeo1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarTieTeo1");
               GXutil.writeLogRaw("Old: ",Z4306BarTieTeo1);
               GXutil.writeLogRaw("Current: ",T00K02_A4306BarTieTeo1[0]);
            }
            if ( DecimalUtil.compareTo(Z4307BarUni1, T00K02_A4307BarUni1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarUni1");
               GXutil.writeLogRaw("Old: ",Z4307BarUni1);
               GXutil.writeLogRaw("Current: ",T00K02_A4307BarUni1[0]);
            }
            if ( Z4308BarHorIni1 != T00K02_A4308BarHorIni1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarHorIni1");
               GXutil.writeLogRaw("Old: ",Z4308BarHorIni1);
               GXutil.writeLogRaw("Current: ",T00K02_A4308BarHorIni1[0]);
            }
            if ( Z4309BarHorFin1 != T00K02_A4309BarHorFin1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarHorFin1");
               GXutil.writeLogRaw("Old: ",Z4309BarHorFin1);
               GXutil.writeLogRaw("Current: ",T00K02_A4309BarHorFin1[0]);
            }
            if ( DecimalUtil.compareTo(Z4310BarTieRea1, T00K02_A4310BarTieRea1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarTieRea1");
               GXutil.writeLogRaw("Old: ",Z4310BarTieRea1);
               GXutil.writeLogRaw("Current: ",T00K02_A4310BarTieRea1[0]);
            }
            if ( DecimalUtil.compareTo(Z4311BarFasMtr1, T00K02_A4311BarFasMtr1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasMtr1");
               GXutil.writeLogRaw("Old: ",Z4311BarFasMtr1);
               GXutil.writeLogRaw("Current: ",T00K02_A4311BarFasMtr1[0]);
            }
            if ( DecimalUtil.compareTo(Z4312BarFasKgm1, T00K02_A4312BarFasKgm1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasKgm1");
               GXutil.writeLogRaw("Old: ",Z4312BarFasKgm1);
               GXutil.writeLogRaw("Current: ",T00K02_A4312BarFasKgm1[0]);
            }
            if ( Z4647BarFasNPr1 != T00K02_A4647BarFasNPr1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasNPr1");
               GXutil.writeLogRaw("Old: ",Z4647BarFasNPr1);
               GXutil.writeLogRaw("Current: ",T00K02_A4647BarFasNPr1[0]);
            }
            if ( Z4313BarFasPri1 != T00K02_A4313BarFasPri1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasPri1");
               GXutil.writeLogRaw("Old: ",Z4313BarFasPri1);
               GXutil.writeLogRaw("Current: ",T00K02_A4313BarFasPri1[0]);
            }
            if ( GXutil.strcmp(Z4314BarFasBot1, T00K02_A4314BarFasBot1[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasBot1");
               GXutil.writeLogRaw("Old: ",Z4314BarFasBot1);
               GXutil.writeLogRaw("Current: ",T00K02_A4314BarFasBot1[0]);
            }
            if ( Z4315BarNumBot1 != T00K02_A4315BarNumBot1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarNumBot1");
               GXutil.writeLogRaw("Old: ",Z4315BarNumBot1);
               GXutil.writeLogRaw("Current: ",T00K02_A4315BarNumBot1[0]);
            }
            if ( Z4648BarFasRecu != T00K02_A4648BarFasRecu[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasRecu");
               GXutil.writeLogRaw("Old: ",Z4648BarFasRecu);
               GXutil.writeLogRaw("Current: ",T00K02_A4648BarFasRecu[0]);
            }
            if ( !( GXutil.dateCompare(Z4927BarFasDti1, T00K02_A4927BarFasDti1[0]) ) )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasDti1");
               GXutil.writeLogRaw("Old: ",Z4927BarFasDti1);
               GXutil.writeLogRaw("Current: ",T00K02_A4927BarFasDti1[0]);
            }
            if ( !( GXutil.dateCompare(Z4928BarFasDtf1, T00K02_A4928BarFasDtf1[0]) ) )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasDtf1");
               GXutil.writeLogRaw("Old: ",Z4928BarFasDtf1);
               GXutil.writeLogRaw("Current: ",T00K02_A4928BarFasDtf1[0]);
            }
            if ( Z4939BarFasInc1 != T00K02_A4939BarFasInc1[0] )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarFasInc1");
               GXutil.writeLogRaw("Old: ",Z4939BarFasInc1);
               GXutil.writeLogRaw("Current: ",T00K02_A4939BarFasInc1[0]);
            }
            if ( GXutil.strcmp(Z6662BarEstPec, T00K02_A6662BarEstPec[0]) != 0 )
            {
               GXutil.writeLogln("tfasmaq:[seudo value changed for attri]"+"BarEstPec");
               GXutil.writeLogRaw("Old: ",Z6662BarEstPec);
               GXutil.writeLogRaw("Current: ",T00K02_A6662BarEstPec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASMAQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertK0688( )
   {
      beforeValidateK0688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableK0688( ) ;
      }
      if ( AnyError == 0 )
      {
         zmK0688( 0) ;
         checkOptimisticConcurrencyK0688( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmK0688( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertK0688( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00K045 */
                  pr_default.execute(43, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Boolean.valueOf(n4644BarFasNPrd), Short.valueOf(A4644BarFasNPrd), Boolean.valueOf(n4645BarFasKgs), A4645BarFasKgs, Boolean.valueOf(n4646BarFasMts), A4646BarFasMts, Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4306BarTieTeo1), A4306BarTieTeo1, Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), Boolean.valueOf(n4313BarFasPri1), Byte.valueOf(A4313BarFasPri1), Boolean.valueOf(n4314BarFasBot1), A4314BarFasBot1, Boolean.valueOf(n4315BarNumBot1), Integer.valueOf(A4315BarNumBot1), Boolean.valueOf(n4648BarFasRecu), Integer.valueOf(A4648BarFasRecu), Boolean.valueOf(n4927BarFasDti1), A4927BarFasDti1, Boolean.valueOf(n4928BarFasDtf1), A4928BarFasDtf1, Boolean.valueOf(n4939BarFasInc1), Byte.valueOf(A4939BarFasInc1), Boolean.valueOf(n6662BarEstPec), A6662BarEstPec, A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  if ( (pr_default.getStatus(43) == 1) )
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
            loadK0688( ) ;
         }
         endLevelK0688( ) ;
      }
      closeExtendedTableCursorsK0688( ) ;
   }

   public void updateK0688( )
   {
      beforeValidateK0688( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableK0688( ) ;
      }
      if ( ( nIsMod_688 != 0 ) || ( nIsDirty_688 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyK0688( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmK0688( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateK0688( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00K046 */
                     pr_default.execute(44, new Object[] {Boolean.valueOf(n4644BarFasNPrd), Short.valueOf(A4644BarFasNPrd), Boolean.valueOf(n4645BarFasKgs), A4645BarFasKgs, Boolean.valueOf(n4646BarFasMts), A4646BarFasMts, Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4306BarTieTeo1), A4306BarTieTeo1, Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), Boolean.valueOf(n4313BarFasPri1), Byte.valueOf(A4313BarFasPri1), Boolean.valueOf(n4314BarFasBot1), A4314BarFasBot1, Boolean.valueOf(n4315BarNumBot1), Integer.valueOf(A4315BarNumBot1), Boolean.valueOf(n4648BarFasRecu), Integer.valueOf(A4648BarFasRecu), Boolean.valueOf(n4927BarFasDti1), A4927BarFasDti1, Boolean.valueOf(n4928BarFasDtf1), A4928BarFasDtf1, Boolean.valueOf(n4939BarFasInc1), Byte.valueOf(A4939BarFasInc1), Boolean.valueOf(n6662BarEstPec), A6662BarEstPec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASMAQ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateK0688( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyK0688( ) ;
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
            endLevelK0688( ) ;
         }
      }
      closeExtendedTableCursorsK0688( ) ;
   }

   public void deferredUpdateK0688( )
   {
   }

   public void deleteK0688( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateK0688( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyK0688( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsK0688( ) ;
         afterConfirmK0688( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteK0688( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00K047 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
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
      sMode688 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelK0688( ) ;
      Gx_mode = sMode688 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsK0688( )
   {
      standaloneModalK0688( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00K048 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00K049 */
         pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ContPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00K050 */
         pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGHDFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
      }
   }

   public void endLevelK0688( )
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

   public void scanStartK0688( )
   {
      /* Scan By routine */
      /* Using cursor T00K051 */
      pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A4643BarFasLot = T00K051_A4643BarFasLot[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextK0688( )
   {
      /* Scan next routine */
      pr_default.readNext(49);
      RcdFound688 = (short)(0) ;
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound688 = (short)(1) ;
         A4643BarFasLot = T00K051_A4643BarFasLot[0] ;
      }
   }

   public void scanEndK0688( )
   {
      pr_default.close(49);
   }

   public void afterConfirmK0688( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertK0688( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateK0688( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteK0688( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteK0688( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateK0688( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesK0688( )
   {
      edtBarFasLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasNPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasNPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasNPrd_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMts_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarMaqFas1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqFas1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqFas1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasEst1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasEst1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasEst1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFecRIn1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRIn1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRIn1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFecRea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecRea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecRea1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarTieTeo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieTeo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieTeo1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarUni1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUni1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUni1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarHorIni1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorIni1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorIni1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarHorFin1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarHorFin1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarHorFin1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarTieRea1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTieRea1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTieRea1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasMtr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasMtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasMtr1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasKgm1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasKgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasKgm1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasNPr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasNPr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasNPr1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasPri1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasPri1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasPri1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasBot1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasBot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasBot1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarNumBot1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumBot1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumBot1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasRecu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasRecu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasRecu_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasDti1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDti1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDti1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasDtf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasDtf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDtf1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarFasInc1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasInc1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasInc1_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtBarEstPec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstPec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstPec_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashesK0688( )
   {
   }

   public void send_integrity_lvl_hashesK015( )
   {
   }

   public void subsflControlProps_75688( )
   {
      edtavnRcdDeleted_688_Internalname = "vNRCDDELETED_688_"+sGXsfl_75_idx ;
      edtBarFasLot_Internalname = "BARFASLOT_"+sGXsfl_75_idx ;
      edtBarFasNPrd_Internalname = "BARFASNPRD_"+sGXsfl_75_idx ;
      edtBarFasKgs_Internalname = "BARFASKGS_"+sGXsfl_75_idx ;
      edtBarFasMts_Internalname = "BARFASMTS_"+sGXsfl_75_idx ;
      edtBarMaqFas1_Internalname = "BARMAQFAS1_"+sGXsfl_75_idx ;
      edtBarFasEst1_Internalname = "BARFASEST1_"+sGXsfl_75_idx ;
      edtBarFecRIn1_Internalname = "BARFECRIN1_"+sGXsfl_75_idx ;
      edtBarFecRea1_Internalname = "BARFECREA1_"+sGXsfl_75_idx ;
      edtBarTieTeo1_Internalname = "BARTIETEO1_"+sGXsfl_75_idx ;
      edtBarUni1_Internalname = "BARUNI1_"+sGXsfl_75_idx ;
      edtBarHorIni1_Internalname = "BARHORINI1_"+sGXsfl_75_idx ;
      edtBarHorFin1_Internalname = "BARHORFIN1_"+sGXsfl_75_idx ;
      edtBarTieRea1_Internalname = "BARTIEREA1_"+sGXsfl_75_idx ;
      edtBarFasMtr1_Internalname = "BARFASMTR1_"+sGXsfl_75_idx ;
      edtBarFasKgm1_Internalname = "BARFASKGM1_"+sGXsfl_75_idx ;
      edtBarFasNPr1_Internalname = "BARFASNPR1_"+sGXsfl_75_idx ;
      edtBarFasPri1_Internalname = "BARFASPRI1_"+sGXsfl_75_idx ;
      edtBarFasBot1_Internalname = "BARFASBOT1_"+sGXsfl_75_idx ;
      edtBarNumBot1_Internalname = "BARNUMBOT1_"+sGXsfl_75_idx ;
      edtBarFasRecu_Internalname = "BARFASRECU_"+sGXsfl_75_idx ;
      edtBarFasDti1_Internalname = "BARFASDTI1_"+sGXsfl_75_idx ;
      edtBarFasDtf1_Internalname = "BARFASDTF1_"+sGXsfl_75_idx ;
      edtBarFasInc1_Internalname = "BARFASINC1_"+sGXsfl_75_idx ;
      edtBarEstPec_Internalname = "BARESTPEC_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75688( )
   {
      edtavnRcdDeleted_688_Internalname = "vNRCDDELETED_688_"+sGXsfl_75_fel_idx ;
      edtBarFasLot_Internalname = "BARFASLOT_"+sGXsfl_75_fel_idx ;
      edtBarFasNPrd_Internalname = "BARFASNPRD_"+sGXsfl_75_fel_idx ;
      edtBarFasKgs_Internalname = "BARFASKGS_"+sGXsfl_75_fel_idx ;
      edtBarFasMts_Internalname = "BARFASMTS_"+sGXsfl_75_fel_idx ;
      edtBarMaqFas1_Internalname = "BARMAQFAS1_"+sGXsfl_75_fel_idx ;
      edtBarFasEst1_Internalname = "BARFASEST1_"+sGXsfl_75_fel_idx ;
      edtBarFecRIn1_Internalname = "BARFECRIN1_"+sGXsfl_75_fel_idx ;
      edtBarFecRea1_Internalname = "BARFECREA1_"+sGXsfl_75_fel_idx ;
      edtBarTieTeo1_Internalname = "BARTIETEO1_"+sGXsfl_75_fel_idx ;
      edtBarUni1_Internalname = "BARUNI1_"+sGXsfl_75_fel_idx ;
      edtBarHorIni1_Internalname = "BARHORINI1_"+sGXsfl_75_fel_idx ;
      edtBarHorFin1_Internalname = "BARHORFIN1_"+sGXsfl_75_fel_idx ;
      edtBarTieRea1_Internalname = "BARTIEREA1_"+sGXsfl_75_fel_idx ;
      edtBarFasMtr1_Internalname = "BARFASMTR1_"+sGXsfl_75_fel_idx ;
      edtBarFasKgm1_Internalname = "BARFASKGM1_"+sGXsfl_75_fel_idx ;
      edtBarFasNPr1_Internalname = "BARFASNPR1_"+sGXsfl_75_fel_idx ;
      edtBarFasPri1_Internalname = "BARFASPRI1_"+sGXsfl_75_fel_idx ;
      edtBarFasBot1_Internalname = "BARFASBOT1_"+sGXsfl_75_fel_idx ;
      edtBarNumBot1_Internalname = "BARNUMBOT1_"+sGXsfl_75_fel_idx ;
      edtBarFasRecu_Internalname = "BARFASRECU_"+sGXsfl_75_fel_idx ;
      edtBarFasDti1_Internalname = "BARFASDTI1_"+sGXsfl_75_fel_idx ;
      edtBarFasDtf1_Internalname = "BARFASDTF1_"+sGXsfl_75_fel_idx ;
      edtBarFasInc1_Internalname = "BARFASINC1_"+sGXsfl_75_fel_idx ;
      edtBarEstPec_Internalname = "BARESTPEC_"+sGXsfl_75_fel_idx ;
   }

   public void addRowK0688( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75688( ) ;
      sendRowK0688( ) ;
   }

   public void sendRowK0688( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_688_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_688_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_688), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_688), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_688_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_688_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasLot_Internalname,GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4643BarFasLot), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasLot_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasNPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasNPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4644BarFasNPrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4644BarFasNPrd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasNPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasNPrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasKgs_Enabled!=0) ? localUtil.format( A4645BarFasKgs, "ZZZZZ9.99") : localUtil.format( A4645BarFasKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasMts_Enabled!=0) ? localUtil.format( A4646BarFasMts, "ZZZZZ9.99") : localUtil.format( A4646BarFasMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqFas1_Internalname,GXutil.rtrim( A4302BarMaqFas1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqFas1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMaqFas1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst1_Internalname,GXutil.ltrim( localUtil.ntoc( A4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasEst1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4303BarFasEst1), "9") : localUtil.format( DecimalUtil.doubleToDec(A4303BarFasEst1), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasEst1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRIn1_Internalname,localUtil.format(A4304BarFecRIn1, "99/99/99"),localUtil.format( A4304BarFecRIn1, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRIn1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecRIn1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRea1_Internalname,localUtil.format(A4305BarFecRea1, "99/99/99"),localUtil.format( A4305BarFecRea1, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRea1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFecRea1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo1_Internalname,GXutil.ltrim( localUtil.ntoc( A4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTieTeo1_Enabled!=0) ? localUtil.format( A4306BarTieTeo1, "9.99") : localUtil.format( A4306BarTieTeo1, "9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieTeo1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUni1_Internalname,GXutil.ltrim( localUtil.ntoc( A4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarUni1_Enabled!=0) ? localUtil.format( A4307BarUni1, "ZZZZZ9.99") : localUtil.format( A4307BarUni1, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarUni1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarUni1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorIni1_Internalname,GXutil.ltrim( localUtil.ntoc( A4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorIni1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4308BarHorIni1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4308BarHorIni1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorIni1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorIni1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarHorFin1_Internalname,GXutil.ltrim( localUtil.ntoc( A4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarHorFin1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4309BarHorFin1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4309BarHorFin1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarHorFin1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarHorFin1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea1_Internalname,GXutil.ltrim( localUtil.ntoc( A4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarTieRea1_Enabled!=0) ? localUtil.format( A4310BarTieRea1, "Z9.99") : localUtil.format( A4310BarTieRea1, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTieRea1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr1_Internalname,GXutil.ltrim( localUtil.ntoc( A4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasMtr1_Enabled!=0) ? localUtil.format( A4311BarFasMtr1, "ZZZZZ9.99") : localUtil.format( A4311BarFasMtr1, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasMtr1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm1_Internalname,GXutil.ltrim( localUtil.ntoc( A4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasKgm1_Enabled!=0) ? localUtil.format( A4312BarFasKgm1, "ZZZZZ9.99") : localUtil.format( A4312BarFasKgm1, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasKgm1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasNPr1_Internalname,GXutil.ltrim( localUtil.ntoc( A4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasNPr1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4647BarFasNPr1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4647BarFasNPr1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasNPr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasNPr1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasPri1_Internalname,GXutil.ltrim( localUtil.ntoc( A4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasPri1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4313BarFasPri1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4313BarFasPri1), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasPri1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasPri1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasBot1_Internalname,GXutil.rtrim( A4314BarFasBot1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasBot1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasBot1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumBot1_Internalname,GXutil.ltrim( localUtil.ntoc( A4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarNumBot1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4315BarNumBot1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4315BarNumBot1), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNumBot1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarNumBot1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasRecu_Internalname,GXutil.ltrim( localUtil.ntoc( A4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasRecu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4648BarFasRecu), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4648BarFasRecu), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasRecu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasRecu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDti1_Internalname,localUtil.ttoc( A4927BarFasDti1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4927BarFasDti1, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDti1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasDti1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDtf1_Internalname,localUtil.ttoc( A4928BarFasDtf1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4928BarFasDtf1, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDtf1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasDtf1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasInc1_Internalname,GXutil.ltrim( localUtil.ntoc( A4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarFasInc1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4939BarFasInc1), "9") : localUtil.format( DecimalUtil.doubleToDec(A4939BarFasInc1), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasInc1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarFasInc1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_688_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEstPec_Internalname,GXutil.rtrim( A6662BarEstPec),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEstPec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEstPec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesK0688( ) ;
      GXCCtl = "Z4643BarFasLot_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4643BarFasLot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4644BarFasNPrd_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4644BarFasNPrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4645BarFasKgs_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4645BarFasKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4646BarFasMts_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4646BarFasMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4302BarMaqFas1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4302BarMaqFas1));
      GXCCtl = "Z4303BarFasEst1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4303BarFasEst1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4304BarFecRIn1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4304BarFecRIn1, 0, "/"));
      GXCCtl = "Z4305BarFecRea1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4305BarFecRea1, 0, "/"));
      GXCCtl = "Z4306BarTieTeo1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4306BarTieTeo1, (byte)(4), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4307BarUni1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4307BarUni1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4308BarHorIni1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4308BarHorIni1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4309BarHorFin1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4309BarHorFin1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4310BarTieRea1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4310BarTieRea1, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4311BarFasMtr1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4311BarFasMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4312BarFasKgm1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4312BarFasKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4647BarFasNPr1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4647BarFasNPr1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4313BarFasPri1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4313BarFasPri1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4314BarFasBot1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4314BarFasBot1));
      GXCCtl = "Z4315BarNumBot1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4315BarNumBot1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4648BarFasRecu_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4648BarFasRecu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4927BarFasDti1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4927BarFasDti1, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4928BarFasDtf1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4928BarFasDtf1, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4939BarFasInc1_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4939BarFasInc1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6662BarEstPec_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6662BarEstPec));
      GXCCtl = "nRcdDeleted_688_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_688_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_688_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_688, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_688_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_688_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASLOT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASNPRD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASKGS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASMTS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQFAS1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqFas1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECRIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIn1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASMTR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASKGM1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASNPR1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASPRI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasPri1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasBot1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMBOT1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumBot1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASRECU_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasRecu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTI1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDti1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTF1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDtf1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASINC1_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasInc1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARESTPEC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstPec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowK0688( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75688( ) ;
      edtavnRcdDeleted_688_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_688_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASLOT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasNPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASNPRD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASKGS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASMTS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMaqFas1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMAQFAS1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasEst1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASEST1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecRIn1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECRIN1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFecRea1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFECREA1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieTeo1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIETEO1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarUni1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARUNI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorIni1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORINI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarHorFin1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARHORFIN1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTieRea1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTIEREA1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasMtr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASMTR1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasKgm1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASKGM1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasNPr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASNPR1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasPri1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASPRI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasBot1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASBOT1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarNumBot1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARNUMBOT1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasRecu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASRECU_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasDti1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASDTI1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasDtf1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASDTF1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarFasInc1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARFASINC1_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEstPec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARESTPEC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_688_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_688_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_688");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_688_Internalname ;
         wbErr = true ;
         nRcdDeleted_688 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_688 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_688_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARFASLOT_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasLot_Internalname ;
         wbErr = true ;
         A4643BarFasLot = 0 ;
      }
      else
      {
         A4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( edtBarFasLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARFASNPRD_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasNPrd_Internalname ;
         wbErr = true ;
         A4644BarFasNPrd = (short)(0) ;
         n4644BarFasNPrd = false ;
      }
      else
      {
         A4644BarFasNPrd = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasNPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4644BarFasNPrd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARFASKGS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasKgs_Internalname ;
         wbErr = true ;
         A4645BarFasKgs = DecimalUtil.ZERO ;
         n4645BarFasKgs = false ;
      }
      else
      {
         A4645BarFasKgs = localUtil.ctond( httpContext.cgiGet( edtBarFasKgs_Internalname)) ;
         n4645BarFasKgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARFASMTS_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasMts_Internalname ;
         wbErr = true ;
         A4646BarFasMts = DecimalUtil.ZERO ;
         n4646BarFasMts = false ;
      }
      else
      {
         A4646BarFasMts = localUtil.ctond( httpContext.cgiGet( edtBarFasMts_Internalname)) ;
         n4646BarFasMts = false ;
      }
      A4302BarMaqFas1 = httpContext.cgiGet( edtBarMaqFas1_Internalname) ;
      n4302BarMaqFas1 = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasEst1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARFASEST1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasEst1_Internalname ;
         wbErr = true ;
         A4303BarFasEst1 = (byte)(0) ;
         n4303BarFasEst1 = false ;
      }
      else
      {
         A4303BarFasEst1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4303BarFasEst1 = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRIn1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECRIN1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecRIn1_Internalname ;
         wbErr = true ;
         A4304BarFecRIn1 = GXutil.nullDate() ;
         n4304BarFecRIn1 = false ;
      }
      else
      {
         A4304BarFecRIn1 = localUtil.ctod( httpContext.cgiGet( edtBarFecRIn1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4304BarFecRIn1 = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecRea1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "BARFECREA1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFecRea1_Internalname ;
         wbErr = true ;
         A4305BarFecRea1 = GXutil.nullDate() ;
         n4305BarFecRea1 = false ;
      }
      else
      {
         A4305BarFecRea1 = localUtil.ctod( httpContext.cgiGet( edtBarFecRea1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4305BarFecRea1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieTeo1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieTeo1_Internalname)), DecimalUtil.stringToDec("9.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIETEO1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieTeo1_Internalname ;
         wbErr = true ;
         A4306BarTieTeo1 = DecimalUtil.ZERO ;
         n4306BarTieTeo1 = false ;
      }
      else
      {
         A4306BarTieTeo1 = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo1_Internalname)) ;
         n4306BarTieTeo1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUni1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUni1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARUNI1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarUni1_Internalname ;
         wbErr = true ;
         A4307BarUni1 = DecimalUtil.ZERO ;
         n4307BarUni1 = false ;
      }
      else
      {
         A4307BarUni1 = localUtil.ctond( httpContext.cgiGet( edtBarUni1_Internalname)) ;
         n4307BarUni1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorIni1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORINI1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorIni1_Internalname ;
         wbErr = true ;
         A4308BarHorIni1 = (short)(0) ;
         n4308BarHorIni1 = false ;
      }
      else
      {
         A4308BarHorIni1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorIni1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4308BarHorIni1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarHorFin1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARHORFIN1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarHorFin1_Internalname ;
         wbErr = true ;
         A4309BarHorFin1 = (short)(0) ;
         n4309BarHorFin1 = false ;
      }
      else
      {
         A4309BarHorFin1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarHorFin1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4309BarHorFin1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTieRea1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTieRea1_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "BARTIEREA1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTieRea1_Internalname ;
         wbErr = true ;
         A4310BarTieRea1 = DecimalUtil.ZERO ;
         n4310BarTieRea1 = false ;
      }
      else
      {
         A4310BarTieRea1 = localUtil.ctond( httpContext.cgiGet( edtBarTieRea1_Internalname)) ;
         n4310BarTieRea1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasMtr1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasMtr1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARFASMTR1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasMtr1_Internalname ;
         wbErr = true ;
         A4311BarFasMtr1 = DecimalUtil.ZERO ;
         n4311BarFasMtr1 = false ;
      }
      else
      {
         A4311BarFasMtr1 = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr1_Internalname)) ;
         n4311BarFasMtr1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarFasKgm1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarFasKgm1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARFASKGM1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasKgm1_Internalname ;
         wbErr = true ;
         A4312BarFasKgm1 = DecimalUtil.ZERO ;
         n4312BarFasKgm1 = false ;
      }
      else
      {
         A4312BarFasKgm1 = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm1_Internalname)) ;
         n4312BarFasKgm1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasNPr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARFASNPR1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasNPr1_Internalname ;
         wbErr = true ;
         A4647BarFasNPr1 = (short)(0) ;
         n4647BarFasNPr1 = false ;
      }
      else
      {
         A4647BarFasNPr1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFasNPr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4647BarFasNPr1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPri1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasPri1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARFASPRI1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasPri1_Internalname ;
         wbErr = true ;
         A4313BarFasPri1 = (byte)(0) ;
         n4313BarFasPri1 = false ;
      }
      else
      {
         A4313BarFasPri1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4313BarFasPri1 = false ;
      }
      A4314BarFasBot1 = httpContext.cgiGet( edtBarFasBot1_Internalname) ;
      n4314BarFasBot1 = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumBot1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARNUMBOT1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarNumBot1_Internalname ;
         wbErr = true ;
         A4315BarNumBot1 = 0 ;
         n4315BarNumBot1 = false ;
      }
      else
      {
         A4315BarNumBot1 = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumBot1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4315BarNumBot1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasRecu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasRecu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARFASRECU_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasRecu_Internalname ;
         wbErr = true ;
         A4648BarFasRecu = 0 ;
         n4648BarFasRecu = false ;
      }
      else
      {
         A4648BarFasRecu = (int)(localUtil.ctol( httpContext.cgiGet( edtBarFasRecu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4648BarFasRecu = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFasDti1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "BARFASDTI1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasDti1_Internalname ;
         wbErr = true ;
         A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
         n4927BarFasDti1 = false ;
      }
      else
      {
         A4927BarFasDti1 = localUtil.ctot( httpContext.cgiGet( edtBarFasDti1_Internalname)) ;
         n4927BarFasDti1 = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFasDtf1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "BARFASDTF1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasDtf1_Internalname ;
         wbErr = true ;
         A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
         n4928BarFasDtf1 = false ;
      }
      else
      {
         A4928BarFasDtf1 = localUtil.ctot( httpContext.cgiGet( edtBarFasDtf1_Internalname)) ;
         n4928BarFasDtf1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasInc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFasInc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARFASINC1_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarFasInc1_Internalname ;
         wbErr = true ;
         A4939BarFasInc1 = (byte)(0) ;
         n4939BarFasInc1 = false ;
      }
      else
      {
         A4939BarFasInc1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasInc1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4939BarFasInc1 = false ;
      }
      A6662BarEstPec = httpContext.cgiGet( edtBarEstPec_Internalname) ;
      n6662BarEstPec = false ;
      GXCCtl = "Z4643BarFasLot_" + sGXsfl_75_idx ;
      Z4643BarFasLot = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4644BarFasNPrd_" + sGXsfl_75_idx ;
      Z4644BarFasNPrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4645BarFasKgs_" + sGXsfl_75_idx ;
      Z4645BarFasKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4646BarFasMts_" + sGXsfl_75_idx ;
      Z4646BarFasMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4302BarMaqFas1_" + sGXsfl_75_idx ;
      Z4302BarMaqFas1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4303BarFasEst1_" + sGXsfl_75_idx ;
      Z4303BarFasEst1 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4304BarFecRIn1_" + sGXsfl_75_idx ;
      Z4304BarFecRIn1 = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4305BarFecRea1_" + sGXsfl_75_idx ;
      Z4305BarFecRea1 = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4306BarTieTeo1_" + sGXsfl_75_idx ;
      Z4306BarTieTeo1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4307BarUni1_" + sGXsfl_75_idx ;
      Z4307BarUni1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4308BarHorIni1_" + sGXsfl_75_idx ;
      Z4308BarHorIni1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4309BarHorFin1_" + sGXsfl_75_idx ;
      Z4309BarHorFin1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4310BarTieRea1_" + sGXsfl_75_idx ;
      Z4310BarTieRea1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4311BarFasMtr1_" + sGXsfl_75_idx ;
      Z4311BarFasMtr1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4312BarFasKgm1_" + sGXsfl_75_idx ;
      Z4312BarFasKgm1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4647BarFasNPr1_" + sGXsfl_75_idx ;
      Z4647BarFasNPr1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4313BarFasPri1_" + sGXsfl_75_idx ;
      Z4313BarFasPri1 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4314BarFasBot1_" + sGXsfl_75_idx ;
      Z4314BarFasBot1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4315BarNumBot1_" + sGXsfl_75_idx ;
      Z4315BarNumBot1 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4648BarFasRecu_" + sGXsfl_75_idx ;
      Z4648BarFasRecu = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4927BarFasDti1_" + sGXsfl_75_idx ;
      Z4927BarFasDti1 = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4928BarFasDtf1_" + sGXsfl_75_idx ;
      Z4928BarFasDtf1 = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4939BarFasInc1_" + sGXsfl_75_idx ;
      Z4939BarFasInc1 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6662BarEstPec_" + sGXsfl_75_idx ;
      Z6662BarEstPec = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_688_" + sGXsfl_75_idx ;
      nRcdDeleted_688 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_688_" + sGXsfl_75_idx ;
      nRcdExists_688 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_688_" + sGXsfl_75_idx ;
      nIsMod_688 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarFasLot_Enabled = edtBarFasLot_Enabled ;
   }

   public void confirmValuesK00( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75688( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75688( ) ;
         httpContext.changePostValue( "Z4643BarFasLot_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4643BarFasLot_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4643BarFasLot_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4644BarFasNPrd_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4644BarFasNPrd_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4644BarFasNPrd_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4645BarFasKgs_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4645BarFasKgs_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4645BarFasKgs_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4646BarFasMts_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4646BarFasMts_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4646BarFasMts_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4302BarMaqFas1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4302BarMaqFas1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4302BarMaqFas1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4303BarFasEst1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4303BarFasEst1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4303BarFasEst1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4304BarFecRIn1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4304BarFecRIn1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4304BarFecRIn1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4305BarFecRea1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4305BarFecRea1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4305BarFecRea1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4306BarTieTeo1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4306BarTieTeo1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4306BarTieTeo1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4307BarUni1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4307BarUni1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4307BarUni1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4308BarHorIni1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4308BarHorIni1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4308BarHorIni1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4309BarHorFin1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4309BarHorFin1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4309BarHorFin1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4310BarTieRea1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4310BarTieRea1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4310BarTieRea1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4311BarFasMtr1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4311BarFasMtr1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4311BarFasMtr1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4312BarFasKgm1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4312BarFasKgm1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4312BarFasKgm1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4647BarFasNPr1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4647BarFasNPr1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4647BarFasNPr1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4313BarFasPri1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4313BarFasPri1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4313BarFasPri1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4314BarFasBot1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4314BarFasBot1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4314BarFasBot1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4315BarNumBot1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4315BarNumBot1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4315BarNumBot1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4648BarFasRecu_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4648BarFasRecu_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4648BarFasRecu_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4927BarFasDti1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4927BarFasDti1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4927BarFasDti1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4928BarFasDtf1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4928BarFasDtf1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4928BarFasDtf1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4939BarFasInc1_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4939BarFasInc1_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4939BarFasInc1_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6662BarEstPec_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6662BarEstPec_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6662BarEstPec_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfasmaq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFASMAQ");
      forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      forbiddenHiddens.add("MaqCodBis", GXutil.rtrim( localUtil.format( A603MaqCodBis, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfasmaq:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4638BarUltNlot", GXutil.ltrim( localUtil.ntoc( Z4638BarUltNlot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tfasmaq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TFASMAQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAQUINAS POR FASE", "") ;
   }

   public void initializeNonKeyK015( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4638BarUltNlot = 0 ;
      n4638BarUltNlot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4638BarUltNlot), 6, 0));
      Z4638BarUltNlot = 0 ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
   }

   public void initAllK015( )
   {
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      initializeNonKeyK015( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyK0688( )
   {
      A4644BarFasNPrd = (short)(0) ;
      n4644BarFasNPrd = false ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      n4645BarFasKgs = false ;
      A4646BarFasMts = DecimalUtil.ZERO ;
      n4646BarFasMts = false ;
      A4302BarMaqFas1 = "" ;
      n4302BarMaqFas1 = false ;
      A4303BarFasEst1 = (byte)(0) ;
      n4303BarFasEst1 = false ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      n4304BarFecRIn1 = false ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      n4305BarFecRea1 = false ;
      A4306BarTieTeo1 = DecimalUtil.ZERO ;
      n4306BarTieTeo1 = false ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      n4307BarUni1 = false ;
      A4308BarHorIni1 = (short)(0) ;
      n4308BarHorIni1 = false ;
      A4309BarHorFin1 = (short)(0) ;
      n4309BarHorFin1 = false ;
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      n4310BarTieRea1 = false ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      n4311BarFasMtr1 = false ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      n4312BarFasKgm1 = false ;
      A4647BarFasNPr1 = (short)(0) ;
      n4647BarFasNPr1 = false ;
      A4313BarFasPri1 = (byte)(0) ;
      n4313BarFasPri1 = false ;
      A4314BarFasBot1 = "" ;
      n4314BarFasBot1 = false ;
      A4315BarNumBot1 = 0 ;
      n4315BarNumBot1 = false ;
      A4648BarFasRecu = 0 ;
      n4648BarFasRecu = false ;
      A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      n4927BarFasDti1 = false ;
      A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      n4928BarFasDtf1 = false ;
      A4939BarFasInc1 = (byte)(0) ;
      n4939BarFasInc1 = false ;
      A6662BarEstPec = "" ;
      n6662BarEstPec = false ;
      Z4644BarFasNPrd = (short)(0) ;
      Z4645BarFasKgs = DecimalUtil.ZERO ;
      Z4646BarFasMts = DecimalUtil.ZERO ;
      Z4302BarMaqFas1 = "" ;
      Z4303BarFasEst1 = (byte)(0) ;
      Z4304BarFecRIn1 = GXutil.nullDate() ;
      Z4305BarFecRea1 = GXutil.nullDate() ;
      Z4306BarTieTeo1 = DecimalUtil.ZERO ;
      Z4307BarUni1 = DecimalUtil.ZERO ;
      Z4308BarHorIni1 = (short)(0) ;
      Z4309BarHorFin1 = (short)(0) ;
      Z4310BarTieRea1 = DecimalUtil.ZERO ;
      Z4311BarFasMtr1 = DecimalUtil.ZERO ;
      Z4312BarFasKgm1 = DecimalUtil.ZERO ;
      Z4647BarFasNPr1 = (short)(0) ;
      Z4313BarFasPri1 = (byte)(0) ;
      Z4314BarFasBot1 = "" ;
      Z4315BarNumBot1 = 0 ;
      Z4648BarFasRecu = 0 ;
      Z4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      Z4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      Z4939BarFasInc1 = (byte)(0) ;
      Z6662BarEstPec = "" ;
   }

   public void initAllK0688( )
   {
      A4643BarFasLot = 0 ;
      initializeNonKeyK0688( ) ;
   }

   public void standaloneModalInsertK0688( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241515765", true, true);
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
      httpContext.AddJavascriptSource("tfasmaq.js", "?20268241515765", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties688( )
   {
      edtBarFasLot_Enabled = defedtBarFasLot_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasLot_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_688, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_688_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4643BarFasLot, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4644BarFasNPrd, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4645BarFasKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4646BarFasMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4302BarMaqFas1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMaqFas1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4303BarFasEst1, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasEst1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A4304BarFecRIn1, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRIn1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A4305BarFecRea1, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFecRea1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4306BarTieTeo1, (byte)(4), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieTeo1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4307BarUni1, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarUni1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4308BarHorIni1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorIni1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4309BarHorFin1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarHorFin1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4310BarTieRea1, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTieRea1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4311BarFasMtr1, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasMtr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4312BarFasKgm1, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasKgm1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4647BarFasNPr1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasNPr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4313BarFasPri1, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasPri1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4314BarFasBot1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasBot1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4315BarNumBot1, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarNumBot1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4648BarFasRecu, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasRecu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4927BarFasDti1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDti1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4928BarFasDtf1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasDtf1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4939BarFasInc1, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarFasInc1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6662BarEstPec));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEstPec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarUltNlot_Internalname = "BARULTNLOT" ;
      edtavnRcdDeleted_688_Internalname = "vNRCDDELETED_688" ;
      edtBarFasLot_Internalname = "BARFASLOT" ;
      edtBarFasNPrd_Internalname = "BARFASNPRD" ;
      edtBarFasKgs_Internalname = "BARFASKGS" ;
      edtBarFasMts_Internalname = "BARFASMTS" ;
      edtBarMaqFas1_Internalname = "BARMAQFAS1" ;
      edtBarFasEst1_Internalname = "BARFASEST1" ;
      edtBarFecRIn1_Internalname = "BARFECRIN1" ;
      edtBarFecRea1_Internalname = "BARFECREA1" ;
      edtBarTieTeo1_Internalname = "BARTIETEO1" ;
      edtBarUni1_Internalname = "BARUNI1" ;
      edtBarHorIni1_Internalname = "BARHORINI1" ;
      edtBarHorFin1_Internalname = "BARHORFIN1" ;
      edtBarTieRea1_Internalname = "BARTIEREA1" ;
      edtBarFasMtr1_Internalname = "BARFASMTR1" ;
      edtBarFasKgm1_Internalname = "BARFASKGM1" ;
      edtBarFasNPr1_Internalname = "BARFASNPR1" ;
      edtBarFasPri1_Internalname = "BARFASPRI1" ;
      edtBarFasBot1_Internalname = "BARFASBOT1" ;
      edtBarNumBot1_Internalname = "BARNUMBOT1" ;
      edtBarFasRecu_Internalname = "BARFASRECU" ;
      edtBarFasDti1_Internalname = "BARFASDTI1" ;
      edtBarFasDtf1_Internalname = "BARFASDTF1" ;
      edtBarFasInc1_Internalname = "BARFASINC1" ;
      edtBarEstPec_Internalname = "BARESTPEC" ;
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
      Form.setCaption( httpContext.getMessage( "MAQUINAS POR FASE", "") );
      edtBarEstPec_Jsonclick = "" ;
      edtBarFasInc1_Jsonclick = "" ;
      edtBarFasDtf1_Jsonclick = "" ;
      edtBarFasDti1_Jsonclick = "" ;
      edtBarFasRecu_Jsonclick = "" ;
      edtBarNumBot1_Jsonclick = "" ;
      edtBarFasBot1_Jsonclick = "" ;
      edtBarFasPri1_Jsonclick = "" ;
      edtBarFasNPr1_Jsonclick = "" ;
      edtBarFasKgm1_Jsonclick = "" ;
      edtBarFasMtr1_Jsonclick = "" ;
      edtBarTieRea1_Jsonclick = "" ;
      edtBarHorFin1_Jsonclick = "" ;
      edtBarHorIni1_Jsonclick = "" ;
      edtBarUni1_Jsonclick = "" ;
      edtBarTieTeo1_Jsonclick = "" ;
      edtBarFecRea1_Jsonclick = "" ;
      edtBarFecRIn1_Jsonclick = "" ;
      edtBarFasEst1_Jsonclick = "" ;
      edtBarMaqFas1_Jsonclick = "" ;
      edtBarFasMts_Jsonclick = "" ;
      edtBarFasKgs_Jsonclick = "" ;
      edtBarFasNPrd_Jsonclick = "" ;
      edtBarFasLot_Jsonclick = "" ;
      edtavnRcdDeleted_688_Jsonclick = "" ;
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
      edtBarEstPec_Enabled = 1 ;
      edtBarFasInc1_Enabled = 1 ;
      edtBarFasDtf1_Enabled = 1 ;
      edtBarFasDti1_Enabled = 1 ;
      edtBarFasRecu_Enabled = 1 ;
      edtBarNumBot1_Enabled = 1 ;
      edtBarFasBot1_Enabled = 1 ;
      edtBarFasPri1_Enabled = 1 ;
      edtBarFasNPr1_Enabled = 1 ;
      edtBarFasKgm1_Enabled = 1 ;
      edtBarFasMtr1_Enabled = 1 ;
      edtBarTieRea1_Enabled = 1 ;
      edtBarHorFin1_Enabled = 1 ;
      edtBarHorIni1_Enabled = 1 ;
      edtBarUni1_Enabled = 1 ;
      edtBarTieTeo1_Enabled = 1 ;
      edtBarFecRea1_Enabled = 1 ;
      edtBarFecRIn1_Enabled = 1 ;
      edtBarFasEst1_Enabled = 1 ;
      edtBarMaqFas1_Enabled = 1 ;
      edtBarFasMts_Enabled = 1 ;
      edtBarFasKgs_Enabled = 1 ;
      edtBarFasNPrd_Enabled = 1 ;
      edtBarFasLot_Enabled = 1 ;
      edtavnRcdDeleted_688_Enabled = 1 ;
      edtBarUltNlot_Jsonclick = "" ;
      edtBarUltNlot_Backcolor = (int)(0xFFFFFF) ;
      edtBarUltNlot_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodBis_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_75688( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalK0688( ) ;
         standaloneModalK0688( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowK0688( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75688( ) ;
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
      /* Using cursor T00K052 */
      pr_default.execute(50, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(50) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00K052_A407EmprNom[0] ;
      n407EmprNom = T00K052_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(50);
      /* Using cursor T00K020 */
      pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00K020_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(18);
      /* Using cursor T00K053 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(51) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(51);
      GX_FocusControl = edtBarUltNlot_Internalname ;
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

   public void valid_Procod( )
   {
      /* Using cursor T00K020 */
      pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00K020_A759ProDsc[0] ;
      pr_default.close(18);
      /* Using cursor T00K053 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(51) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      pr_default.close(51);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Barordlin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "A4638BarUltNlot", GXutil.ltrim( localUtil.ntoc( A4638BarUltNlot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4638BarUltNlot", GXutil.ltrim( localUtil.ntoc( Z4638BarUltNlot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A4638BarUltNlot',fld:'BARULTNLOT',pic:'ZZZZZ9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z602MaqCod'},{av:'Z407EmprNom'},{av:'Z457FasCod'},{av:'Z603MaqCodBis'},{av:'Z4638BarUltNlot'},{av:'Z759ProDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCODBIS","{handler:'valid_Maqcodbis',iparms:[]");
      setEventMetadata("VALID_MAQCODBIS",",oparms:[]}");
      setEventMetadata("VALID_BARFASLOT","{handler:'valid_Barfaslot',iparms:[]");
      setEventMetadata("VALID_BARFASLOT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barestpec',iparms:[]");
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
      pr_default.close(51);
      pr_default.close(50);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      Z4645BarFasKgs = DecimalUtil.ZERO ;
      Z4646BarFasMts = DecimalUtil.ZERO ;
      Z4302BarMaqFas1 = "" ;
      Z4304BarFecRIn1 = GXutil.nullDate() ;
      Z4305BarFecRea1 = GXutil.nullDate() ;
      Z4306BarTieTeo1 = DecimalUtil.ZERO ;
      Z4307BarUni1 = DecimalUtil.ZERO ;
      Z4310BarTieRea1 = DecimalUtil.ZERO ;
      Z4311BarFasMtr1 = DecimalUtil.ZERO ;
      Z4312BarFasKgm1 = DecimalUtil.ZERO ;
      Z4314BarFasBot1 = "" ;
      Z4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      Z4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      Z6662BarEstPec = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A457FasCod = "" ;
      lblTextblock9_Jsonclick = "" ;
      A603MaqCodBis = "" ;
      lblTextblock10_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode688 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode15 = "" ;
      GXCCtl = "" ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A4646BarFasMts = DecimalUtil.ZERO ;
      A4302BarMaqFas1 = "" ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      A4306BarTieTeo1 = DecimalUtil.ZERO ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A4314BarFasBot1 = "" ;
      A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      A6662BarEstPec = "" ;
      AV36LitFe = "" ;
      AV16Lit0 = "" ;
      AV38Station = "" ;
      AV39emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV40emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV35UsurCod = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV21Lit5 = "" ;
      AV22Lit6 = "" ;
      AV23Lit7 = "" ;
      AV24Lit8 = "" ;
      AV25Lit9 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      AV28Lit12 = "" ;
      AV29Lit13 = "" ;
      AV30Lit14 = "" ;
      AV31Lit15 = "" ;
      AV32Lit16 = "" ;
      AV33Lit17 = "" ;
      AV34Lit18 = "" ;
      AV37lit19 = "" ;
      AV42Lit20 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z759ProDsc = "" ;
      T00K06_A407EmprNom = new String[] {""} ;
      T00K06_n407EmprNom = new boolean[] {false} ;
      T00K09_A396EmprCod = new String[] {""} ;
      T00K010_A602MaqCod = new String[] {""} ;
      T00K011_A194BarOrdLin = new short[1] ;
      T00K011_A407EmprNom = new String[] {""} ;
      T00K011_n407EmprNom = new boolean[] {false} ;
      T00K011_A759ProDsc = new String[] {""} ;
      T00K011_A4638BarUltNlot = new int[1] ;
      T00K011_n4638BarUltNlot = new boolean[] {false} ;
      T00K011_A396EmprCod = new String[] {""} ;
      T00K011_A129BarCod = new int[1] ;
      T00K011_A132BarCodReo = new byte[1] ;
      T00K011_A130BarCodPar = new String[] {""} ;
      T00K011_A758ProCod = new String[] {""} ;
      T00K011_A457FasCod = new String[] {""} ;
      T00K011_A603MaqCodBis = new String[] {""} ;
      T00K07_A759ProDsc = new String[] {""} ;
      T00K08_A396EmprCod = new String[] {""} ;
      T00K012_A759ProDsc = new String[] {""} ;
      T00K013_A396EmprCod = new String[] {""} ;
      T00K014_A396EmprCod = new String[] {""} ;
      T00K014_A129BarCod = new int[1] ;
      T00K014_A132BarCodReo = new byte[1] ;
      T00K014_A130BarCodPar = new String[] {""} ;
      T00K014_A758ProCod = new String[] {""} ;
      T00K014_A194BarOrdLin = new short[1] ;
      T00K05_A194BarOrdLin = new short[1] ;
      T00K05_A4638BarUltNlot = new int[1] ;
      T00K05_n4638BarUltNlot = new boolean[] {false} ;
      T00K05_A396EmprCod = new String[] {""} ;
      T00K05_A129BarCod = new int[1] ;
      T00K05_A132BarCodReo = new byte[1] ;
      T00K05_A130BarCodPar = new String[] {""} ;
      T00K05_A758ProCod = new String[] {""} ;
      T00K05_A457FasCod = new String[] {""} ;
      T00K05_A603MaqCodBis = new String[] {""} ;
      T00K015_A194BarOrdLin = new short[1] ;
      T00K015_A396EmprCod = new String[] {""} ;
      T00K015_A129BarCod = new int[1] ;
      T00K015_A132BarCodReo = new byte[1] ;
      T00K015_A130BarCodPar = new String[] {""} ;
      T00K015_A758ProCod = new String[] {""} ;
      T00K016_A194BarOrdLin = new short[1] ;
      T00K016_A396EmprCod = new String[] {""} ;
      T00K016_A129BarCod = new int[1] ;
      T00K016_A132BarCodReo = new byte[1] ;
      T00K016_A130BarCodPar = new String[] {""} ;
      T00K016_A758ProCod = new String[] {""} ;
      T00K04_A194BarOrdLin = new short[1] ;
      T00K04_A4638BarUltNlot = new int[1] ;
      T00K04_n4638BarUltNlot = new boolean[] {false} ;
      T00K04_A396EmprCod = new String[] {""} ;
      T00K04_A129BarCod = new int[1] ;
      T00K04_A132BarCodReo = new byte[1] ;
      T00K04_A130BarCodPar = new String[] {""} ;
      T00K04_A758ProCod = new String[] {""} ;
      T00K04_A457FasCod = new String[] {""} ;
      T00K04_A603MaqCodBis = new String[] {""} ;
      T00K020_A759ProDsc = new String[] {""} ;
      T00K021_A396EmprCod = new String[] {""} ;
      T00K021_A129BarCod = new int[1] ;
      T00K021_A132BarCodReo = new byte[1] ;
      T00K021_A130BarCodPar = new String[] {""} ;
      T00K021_A758ProCod = new String[] {""} ;
      T00K021_A194BarOrdLin = new short[1] ;
      T00K021_A12517SolAfLn = new short[1] ;
      T00K022_A396EmprCod = new String[] {""} ;
      T00K022_A129BarCod = new int[1] ;
      T00K022_A132BarCodReo = new byte[1] ;
      T00K022_A130BarCodPar = new String[] {""} ;
      T00K022_A758ProCod = new String[] {""} ;
      T00K022_A194BarOrdLin = new short[1] ;
      T00K022_A12516SolLzLn = new short[1] ;
      T00K023_A396EmprCod = new String[] {""} ;
      T00K023_A129BarCod = new int[1] ;
      T00K023_A132BarCodReo = new byte[1] ;
      T00K023_A130BarCodPar = new String[] {""} ;
      T00K023_A758ProCod = new String[] {""} ;
      T00K023_A194BarOrdLin = new short[1] ;
      T00K023_A12515SolPlLn = new short[1] ;
      T00K024_A396EmprCod = new String[] {""} ;
      T00K024_A129BarCod = new int[1] ;
      T00K024_A132BarCodReo = new byte[1] ;
      T00K024_A130BarCodPar = new String[] {""} ;
      T00K024_A758ProCod = new String[] {""} ;
      T00K024_A194BarOrdLin = new short[1] ;
      T00K024_A12514SolSAlLn = new short[1] ;
      T00K025_A396EmprCod = new String[] {""} ;
      T00K025_A129BarCod = new int[1] ;
      T00K025_A132BarCodReo = new byte[1] ;
      T00K025_A130BarCodPar = new String[] {""} ;
      T00K025_A758ProCod = new String[] {""} ;
      T00K025_A194BarOrdLin = new short[1] ;
      T00K025_A12513SolSAcLn = new short[1] ;
      T00K026_A396EmprCod = new String[] {""} ;
      T00K026_A129BarCod = new int[1] ;
      T00K026_A132BarCodReo = new byte[1] ;
      T00K026_A130BarCodPar = new String[] {""} ;
      T00K026_A758ProCod = new String[] {""} ;
      T00K026_A194BarOrdLin = new short[1] ;
      T00K026_A12512SolFrLn = new short[1] ;
      T00K027_A396EmprCod = new String[] {""} ;
      T00K027_A129BarCod = new int[1] ;
      T00K027_A132BarCodReo = new byte[1] ;
      T00K027_A130BarCodPar = new String[] {""} ;
      T00K027_A758ProCod = new String[] {""} ;
      T00K027_A194BarOrdLin = new short[1] ;
      T00K027_A12511SolAgLn = new short[1] ;
      T00K028_A396EmprCod = new String[] {""} ;
      T00K028_A129BarCod = new int[1] ;
      T00K028_A132BarCodReo = new byte[1] ;
      T00K028_A130BarCodPar = new String[] {""} ;
      T00K028_A758ProCod = new String[] {""} ;
      T00K028_A194BarOrdLin = new short[1] ;
      T00K028_A12510SolLvLn = new short[1] ;
      T00K029_A396EmprCod = new String[] {""} ;
      T00K029_A129BarCod = new int[1] ;
      T00K029_A132BarCodReo = new byte[1] ;
      T00K029_A130BarCodPar = new String[] {""} ;
      T00K029_A758ProCod = new String[] {""} ;
      T00K029_A194BarOrdLin = new short[1] ;
      T00K029_A10781BarFasNb = new int[1] ;
      T00K030_A396EmprCod = new String[] {""} ;
      T00K030_A129BarCod = new int[1] ;
      T00K030_A132BarCodReo = new byte[1] ;
      T00K030_A130BarCodPar = new String[] {""} ;
      T00K030_A758ProCod = new String[] {""} ;
      T00K030_A194BarOrdLin = new short[1] ;
      T00K030_A719PrdNum = new String[] {""} ;
      T00K031_A396EmprCod = new String[] {""} ;
      T00K031_A129BarCod = new int[1] ;
      T00K031_A132BarCodReo = new byte[1] ;
      T00K031_A130BarCodPar = new String[] {""} ;
      T00K031_A758ProCod = new String[] {""} ;
      T00K031_A194BarOrdLin = new short[1] ;
      T00K031_A9966Em_cod = new String[] {""} ;
      T00K032_A396EmprCod = new String[] {""} ;
      T00K032_A129BarCod = new int[1] ;
      T00K032_A132BarCodReo = new byte[1] ;
      T00K032_A130BarCodPar = new String[] {""} ;
      T00K032_A758ProCod = new String[] {""} ;
      T00K032_A194BarOrdLin = new short[1] ;
      T00K032_A9940Ab_cod = new String[] {""} ;
      T00K033_A396EmprCod = new String[] {""} ;
      T00K033_A129BarCod = new int[1] ;
      T00K033_A132BarCodReo = new byte[1] ;
      T00K033_A130BarCodPar = new String[] {""} ;
      T00K033_A758ProCod = new String[] {""} ;
      T00K033_A194BarOrdLin = new short[1] ;
      T00K033_A9911Ca_cod = new String[] {""} ;
      T00K034_A396EmprCod = new String[] {""} ;
      T00K034_A129BarCod = new int[1] ;
      T00K034_A132BarCodReo = new byte[1] ;
      T00K034_A130BarCodPar = new String[] {""} ;
      T00K034_A758ProCod = new String[] {""} ;
      T00K034_A194BarOrdLin = new short[1] ;
      T00K034_A9878Pe_cod = new String[] {""} ;
      T00K035_A396EmprCod = new String[] {""} ;
      T00K035_A129BarCod = new int[1] ;
      T00K035_A132BarCodReo = new byte[1] ;
      T00K035_A130BarCodPar = new String[] {""} ;
      T00K035_A758ProCod = new String[] {""} ;
      T00K035_A194BarOrdLin = new short[1] ;
      T00K035_A9870Rm_cod = new String[] {""} ;
      T00K036_A396EmprCod = new String[] {""} ;
      T00K036_A129BarCod = new int[1] ;
      T00K036_A132BarCodReo = new byte[1] ;
      T00K036_A130BarCodPar = new String[] {""} ;
      T00K036_A758ProCod = new String[] {""} ;
      T00K036_A194BarOrdLin = new short[1] ;
      T00K036_A7934Dtb_Ordl = new short[1] ;
      T00K037_A396EmprCod = new String[] {""} ;
      T00K037_A129BarCod = new int[1] ;
      T00K037_A132BarCodReo = new byte[1] ;
      T00K037_A130BarCodPar = new String[] {""} ;
      T00K037_A758ProCod = new String[] {""} ;
      T00K037_A194BarOrdLin = new short[1] ;
      T00K037_A5371FasQuiLin = new short[1] ;
      T00K038_A396EmprCod = new String[] {""} ;
      T00K038_A129BarCod = new int[1] ;
      T00K038_A132BarCodReo = new byte[1] ;
      T00K038_A130BarCodPar = new String[] {""} ;
      T00K038_A758ProCod = new String[] {""} ;
      T00K038_A194BarOrdLin = new short[1] ;
      T00K038_A4940A_Barcod = new int[1] ;
      T00K038_A4941A_BarReo = new byte[1] ;
      T00K038_A4942A_BarPar = new String[] {""} ;
      T00K038_A4943A_ProCod = new String[] {""} ;
      T00K038_A4944A_BarOrd = new short[1] ;
      T00K039_A396EmprCod = new String[] {""} ;
      T00K039_A129BarCod = new int[1] ;
      T00K039_A132BarCodReo = new byte[1] ;
      T00K039_A130BarCodPar = new String[] {""} ;
      T00K039_A758ProCod = new String[] {""} ;
      T00K039_A194BarOrdLin = new short[1] ;
      T00K039_A4643BarFasLot = new int[1] ;
      T00K039_A5954Ap_Barcod = new int[1] ;
      T00K039_A5955Ap_BarReo = new byte[1] ;
      T00K039_A5956Ap_BarPar = new String[] {""} ;
      T00K039_A5957Ap_ProCod = new String[] {""} ;
      T00K039_A5958Ap_BarOrd = new short[1] ;
      T00K040_A396EmprCod = new String[] {""} ;
      T00K040_A129BarCod = new int[1] ;
      T00K040_A132BarCodReo = new byte[1] ;
      T00K040_A130BarCodPar = new String[] {""} ;
      T00K040_A758ProCod = new String[] {""} ;
      T00K040_A194BarOrdLin = new short[1] ;
      T00K040_A4031CCTCod = new int[1] ;
      T00K041_A396EmprCod = new String[] {""} ;
      T00K041_A129BarCod = new int[1] ;
      T00K041_A132BarCodReo = new byte[1] ;
      T00K041_A130BarCodPar = new String[] {""} ;
      T00K041_A758ProCod = new String[] {""} ;
      T00K041_A194BarOrdLin = new short[1] ;
      T00K041_A1664ParFasCod = new short[1] ;
      T00K042_A396EmprCod = new String[] {""} ;
      T00K042_A129BarCod = new int[1] ;
      T00K042_A132BarCodReo = new byte[1] ;
      T00K042_A130BarCodPar = new String[] {""} ;
      T00K042_A758ProCod = new String[] {""} ;
      T00K042_A194BarOrdLin = new short[1] ;
      T00K043_A129BarCod = new int[1] ;
      T00K043_A132BarCodReo = new byte[1] ;
      T00K043_A130BarCodPar = new String[] {""} ;
      T00K043_A194BarOrdLin = new short[1] ;
      T00K043_A4643BarFasLot = new int[1] ;
      T00K043_A4644BarFasNPrd = new short[1] ;
      T00K043_n4644BarFasNPrd = new boolean[] {false} ;
      T00K043_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4645BarFasKgs = new boolean[] {false} ;
      T00K043_A4646BarFasMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4646BarFasMts = new boolean[] {false} ;
      T00K043_A4302BarMaqFas1 = new String[] {""} ;
      T00K043_n4302BarMaqFas1 = new boolean[] {false} ;
      T00K043_A4303BarFasEst1 = new byte[1] ;
      T00K043_n4303BarFasEst1 = new boolean[] {false} ;
      T00K043_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K043_n4304BarFecRIn1 = new boolean[] {false} ;
      T00K043_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K043_n4305BarFecRea1 = new boolean[] {false} ;
      T00K043_A4306BarTieTeo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4306BarTieTeo1 = new boolean[] {false} ;
      T00K043_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4307BarUni1 = new boolean[] {false} ;
      T00K043_A4308BarHorIni1 = new short[1] ;
      T00K043_n4308BarHorIni1 = new boolean[] {false} ;
      T00K043_A4309BarHorFin1 = new short[1] ;
      T00K043_n4309BarHorFin1 = new boolean[] {false} ;
      T00K043_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4310BarTieRea1 = new boolean[] {false} ;
      T00K043_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4311BarFasMtr1 = new boolean[] {false} ;
      T00K043_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K043_n4312BarFasKgm1 = new boolean[] {false} ;
      T00K043_A4647BarFasNPr1 = new short[1] ;
      T00K043_n4647BarFasNPr1 = new boolean[] {false} ;
      T00K043_A4313BarFasPri1 = new byte[1] ;
      T00K043_n4313BarFasPri1 = new boolean[] {false} ;
      T00K043_A4314BarFasBot1 = new String[] {""} ;
      T00K043_n4314BarFasBot1 = new boolean[] {false} ;
      T00K043_A4315BarNumBot1 = new int[1] ;
      T00K043_n4315BarNumBot1 = new boolean[] {false} ;
      T00K043_A4648BarFasRecu = new int[1] ;
      T00K043_n4648BarFasRecu = new boolean[] {false} ;
      T00K043_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K043_n4927BarFasDti1 = new boolean[] {false} ;
      T00K043_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K043_n4928BarFasDtf1 = new boolean[] {false} ;
      T00K043_A4939BarFasInc1 = new byte[1] ;
      T00K043_n4939BarFasInc1 = new boolean[] {false} ;
      T00K043_A6662BarEstPec = new String[] {""} ;
      T00K043_n6662BarEstPec = new boolean[] {false} ;
      T00K043_A396EmprCod = new String[] {""} ;
      T00K043_A758ProCod = new String[] {""} ;
      T00K044_A396EmprCod = new String[] {""} ;
      T00K044_A129BarCod = new int[1] ;
      T00K044_A132BarCodReo = new byte[1] ;
      T00K044_A130BarCodPar = new String[] {""} ;
      T00K044_A758ProCod = new String[] {""} ;
      T00K044_A194BarOrdLin = new short[1] ;
      T00K044_A4643BarFasLot = new int[1] ;
      T00K03_A129BarCod = new int[1] ;
      T00K03_A132BarCodReo = new byte[1] ;
      T00K03_A130BarCodPar = new String[] {""} ;
      T00K03_A194BarOrdLin = new short[1] ;
      T00K03_A4643BarFasLot = new int[1] ;
      T00K03_A4644BarFasNPrd = new short[1] ;
      T00K03_n4644BarFasNPrd = new boolean[] {false} ;
      T00K03_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4645BarFasKgs = new boolean[] {false} ;
      T00K03_A4646BarFasMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4646BarFasMts = new boolean[] {false} ;
      T00K03_A4302BarMaqFas1 = new String[] {""} ;
      T00K03_n4302BarMaqFas1 = new boolean[] {false} ;
      T00K03_A4303BarFasEst1 = new byte[1] ;
      T00K03_n4303BarFasEst1 = new boolean[] {false} ;
      T00K03_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K03_n4304BarFecRIn1 = new boolean[] {false} ;
      T00K03_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K03_n4305BarFecRea1 = new boolean[] {false} ;
      T00K03_A4306BarTieTeo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4306BarTieTeo1 = new boolean[] {false} ;
      T00K03_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4307BarUni1 = new boolean[] {false} ;
      T00K03_A4308BarHorIni1 = new short[1] ;
      T00K03_n4308BarHorIni1 = new boolean[] {false} ;
      T00K03_A4309BarHorFin1 = new short[1] ;
      T00K03_n4309BarHorFin1 = new boolean[] {false} ;
      T00K03_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4310BarTieRea1 = new boolean[] {false} ;
      T00K03_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4311BarFasMtr1 = new boolean[] {false} ;
      T00K03_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K03_n4312BarFasKgm1 = new boolean[] {false} ;
      T00K03_A4647BarFasNPr1 = new short[1] ;
      T00K03_n4647BarFasNPr1 = new boolean[] {false} ;
      T00K03_A4313BarFasPri1 = new byte[1] ;
      T00K03_n4313BarFasPri1 = new boolean[] {false} ;
      T00K03_A4314BarFasBot1 = new String[] {""} ;
      T00K03_n4314BarFasBot1 = new boolean[] {false} ;
      T00K03_A4315BarNumBot1 = new int[1] ;
      T00K03_n4315BarNumBot1 = new boolean[] {false} ;
      T00K03_A4648BarFasRecu = new int[1] ;
      T00K03_n4648BarFasRecu = new boolean[] {false} ;
      T00K03_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K03_n4927BarFasDti1 = new boolean[] {false} ;
      T00K03_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K03_n4928BarFasDtf1 = new boolean[] {false} ;
      T00K03_A4939BarFasInc1 = new byte[1] ;
      T00K03_n4939BarFasInc1 = new boolean[] {false} ;
      T00K03_A6662BarEstPec = new String[] {""} ;
      T00K03_n6662BarEstPec = new boolean[] {false} ;
      T00K03_A396EmprCod = new String[] {""} ;
      T00K03_A758ProCod = new String[] {""} ;
      T00K02_A129BarCod = new int[1] ;
      T00K02_A132BarCodReo = new byte[1] ;
      T00K02_A130BarCodPar = new String[] {""} ;
      T00K02_A194BarOrdLin = new short[1] ;
      T00K02_A4643BarFasLot = new int[1] ;
      T00K02_A4644BarFasNPrd = new short[1] ;
      T00K02_n4644BarFasNPrd = new boolean[] {false} ;
      T00K02_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4645BarFasKgs = new boolean[] {false} ;
      T00K02_A4646BarFasMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4646BarFasMts = new boolean[] {false} ;
      T00K02_A4302BarMaqFas1 = new String[] {""} ;
      T00K02_n4302BarMaqFas1 = new boolean[] {false} ;
      T00K02_A4303BarFasEst1 = new byte[1] ;
      T00K02_n4303BarFasEst1 = new boolean[] {false} ;
      T00K02_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K02_n4304BarFecRIn1 = new boolean[] {false} ;
      T00K02_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K02_n4305BarFecRea1 = new boolean[] {false} ;
      T00K02_A4306BarTieTeo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4306BarTieTeo1 = new boolean[] {false} ;
      T00K02_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4307BarUni1 = new boolean[] {false} ;
      T00K02_A4308BarHorIni1 = new short[1] ;
      T00K02_n4308BarHorIni1 = new boolean[] {false} ;
      T00K02_A4309BarHorFin1 = new short[1] ;
      T00K02_n4309BarHorFin1 = new boolean[] {false} ;
      T00K02_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4310BarTieRea1 = new boolean[] {false} ;
      T00K02_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4311BarFasMtr1 = new boolean[] {false} ;
      T00K02_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00K02_n4312BarFasKgm1 = new boolean[] {false} ;
      T00K02_A4647BarFasNPr1 = new short[1] ;
      T00K02_n4647BarFasNPr1 = new boolean[] {false} ;
      T00K02_A4313BarFasPri1 = new byte[1] ;
      T00K02_n4313BarFasPri1 = new boolean[] {false} ;
      T00K02_A4314BarFasBot1 = new String[] {""} ;
      T00K02_n4314BarFasBot1 = new boolean[] {false} ;
      T00K02_A4315BarNumBot1 = new int[1] ;
      T00K02_n4315BarNumBot1 = new boolean[] {false} ;
      T00K02_A4648BarFasRecu = new int[1] ;
      T00K02_n4648BarFasRecu = new boolean[] {false} ;
      T00K02_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K02_n4927BarFasDti1 = new boolean[] {false} ;
      T00K02_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      T00K02_n4928BarFasDtf1 = new boolean[] {false} ;
      T00K02_A4939BarFasInc1 = new byte[1] ;
      T00K02_n4939BarFasInc1 = new boolean[] {false} ;
      T00K02_A6662BarEstPec = new String[] {""} ;
      T00K02_n6662BarEstPec = new boolean[] {false} ;
      T00K02_A396EmprCod = new String[] {""} ;
      T00K02_A758ProCod = new String[] {""} ;
      T00K048_A396EmprCod = new String[] {""} ;
      T00K048_A129BarCod = new int[1] ;
      T00K048_A132BarCodReo = new byte[1] ;
      T00K048_A130BarCodPar = new String[] {""} ;
      T00K048_A758ProCod = new String[] {""} ;
      T00K048_A194BarOrdLin = new short[1] ;
      T00K048_A4643BarFasLot = new int[1] ;
      T00K048_A10084BarPFcod = new short[1] ;
      T00K049_A396EmprCod = new String[] {""} ;
      T00K049_A129BarCod = new int[1] ;
      T00K049_A132BarCodReo = new byte[1] ;
      T00K049_A130BarCodPar = new String[] {""} ;
      T00K049_A758ProCod = new String[] {""} ;
      T00K049_A194BarOrdLin = new short[1] ;
      T00K049_A4643BarFasLot = new int[1] ;
      T00K049_A6579DataReg = new java.util.Date[] {GXutil.nullDate()} ;
      T00K049_A6574Turno = new byte[1] ;
      T00K049_A6580Seccao = new byte[1] ;
      T00K049_A6577FuncCod = new int[1] ;
      T00K050_A396EmprCod = new String[] {""} ;
      T00K050_A129BarCod = new int[1] ;
      T00K050_A132BarCodReo = new byte[1] ;
      T00K050_A130BarCodPar = new String[] {""} ;
      T00K050_A758ProCod = new String[] {""} ;
      T00K050_A194BarOrdLin = new short[1] ;
      T00K050_A4643BarFasLot = new int[1] ;
      T00K050_A5954Ap_Barcod = new int[1] ;
      T00K050_A5955Ap_BarReo = new byte[1] ;
      T00K050_A5956Ap_BarPar = new String[] {""} ;
      T00K050_A5957Ap_ProCod = new String[] {""} ;
      T00K050_A5958Ap_BarOrd = new short[1] ;
      T00K051_A396EmprCod = new String[] {""} ;
      T00K051_A129BarCod = new int[1] ;
      T00K051_A132BarCodReo = new byte[1] ;
      T00K051_A130BarCodPar = new String[] {""} ;
      T00K051_A758ProCod = new String[] {""} ;
      T00K051_A194BarOrdLin = new short[1] ;
      T00K051_A4643BarFasLot = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A602MaqCod = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00K052_A407EmprNom = new String[] {""} ;
      T00K052_n407EmprNom = new boolean[] {false} ;
      T00K053_A396EmprCod = new String[] {""} ;
      Z602MaqCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ457FasCod = "" ;
      ZZ603MaqCodBis = "" ;
      ZZ759ProDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfasmaq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfasmaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfasmaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfasmaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasmaq__default(),
         new Object[] {
             new Object[] {
            T00K02_A129BarCod, T00K02_A132BarCodReo, T00K02_A130BarCodPar, T00K02_A194BarOrdLin, T00K02_A4643BarFasLot, T00K02_A4644BarFasNPrd, T00K02_n4644BarFasNPrd, T00K02_A4645BarFasKgs, T00K02_n4645BarFasKgs, T00K02_A4646BarFasMts,
            T00K02_n4646BarFasMts, T00K02_A4302BarMaqFas1, T00K02_n4302BarMaqFas1, T00K02_A4303BarFasEst1, T00K02_n4303BarFasEst1, T00K02_A4304BarFecRIn1, T00K02_n4304BarFecRIn1, T00K02_A4305BarFecRea1, T00K02_n4305BarFecRea1, T00K02_A4306BarTieTeo1,
            T00K02_n4306BarTieTeo1, T00K02_A4307BarUni1, T00K02_n4307BarUni1, T00K02_A4308BarHorIni1, T00K02_n4308BarHorIni1, T00K02_A4309BarHorFin1, T00K02_n4309BarHorFin1, T00K02_A4310BarTieRea1, T00K02_n4310BarTieRea1, T00K02_A4311BarFasMtr1,
            T00K02_n4311BarFasMtr1, T00K02_A4312BarFasKgm1, T00K02_n4312BarFasKgm1, T00K02_A4647BarFasNPr1, T00K02_n4647BarFasNPr1, T00K02_A4313BarFasPri1, T00K02_n4313BarFasPri1, T00K02_A4314BarFasBot1, T00K02_n4314BarFasBot1, T00K02_A4315BarNumBot1,
            T00K02_n4315BarNumBot1, T00K02_A4648BarFasRecu, T00K02_n4648BarFasRecu, T00K02_A4927BarFasDti1, T00K02_n4927BarFasDti1, T00K02_A4928BarFasDtf1, T00K02_n4928BarFasDtf1, T00K02_A4939BarFasInc1, T00K02_n4939BarFasInc1, T00K02_A6662BarEstPec,
            T00K02_n6662BarEstPec, T00K02_A396EmprCod, T00K02_A758ProCod
            }
            , new Object[] {
            T00K03_A129BarCod, T00K03_A132BarCodReo, T00K03_A130BarCodPar, T00K03_A194BarOrdLin, T00K03_A4643BarFasLot, T00K03_A4644BarFasNPrd, T00K03_n4644BarFasNPrd, T00K03_A4645BarFasKgs, T00K03_n4645BarFasKgs, T00K03_A4646BarFasMts,
            T00K03_n4646BarFasMts, T00K03_A4302BarMaqFas1, T00K03_n4302BarMaqFas1, T00K03_A4303BarFasEst1, T00K03_n4303BarFasEst1, T00K03_A4304BarFecRIn1, T00K03_n4304BarFecRIn1, T00K03_A4305BarFecRea1, T00K03_n4305BarFecRea1, T00K03_A4306BarTieTeo1,
            T00K03_n4306BarTieTeo1, T00K03_A4307BarUni1, T00K03_n4307BarUni1, T00K03_A4308BarHorIni1, T00K03_n4308BarHorIni1, T00K03_A4309BarHorFin1, T00K03_n4309BarHorFin1, T00K03_A4310BarTieRea1, T00K03_n4310BarTieRea1, T00K03_A4311BarFasMtr1,
            T00K03_n4311BarFasMtr1, T00K03_A4312BarFasKgm1, T00K03_n4312BarFasKgm1, T00K03_A4647BarFasNPr1, T00K03_n4647BarFasNPr1, T00K03_A4313BarFasPri1, T00K03_n4313BarFasPri1, T00K03_A4314BarFasBot1, T00K03_n4314BarFasBot1, T00K03_A4315BarNumBot1,
            T00K03_n4315BarNumBot1, T00K03_A4648BarFasRecu, T00K03_n4648BarFasRecu, T00K03_A4927BarFasDti1, T00K03_n4927BarFasDti1, T00K03_A4928BarFasDtf1, T00K03_n4928BarFasDtf1, T00K03_A4939BarFasInc1, T00K03_n4939BarFasInc1, T00K03_A6662BarEstPec,
            T00K03_n6662BarEstPec, T00K03_A396EmprCod, T00K03_A758ProCod
            }
            , new Object[] {
            T00K04_A194BarOrdLin, T00K04_A4638BarUltNlot, T00K04_n4638BarUltNlot, T00K04_A396EmprCod, T00K04_A129BarCod, T00K04_A132BarCodReo, T00K04_A130BarCodPar, T00K04_A758ProCod, T00K04_A457FasCod, T00K04_A603MaqCodBis
            }
            , new Object[] {
            T00K05_A194BarOrdLin, T00K05_A4638BarUltNlot, T00K05_n4638BarUltNlot, T00K05_A396EmprCod, T00K05_A129BarCod, T00K05_A132BarCodReo, T00K05_A130BarCodPar, T00K05_A758ProCod, T00K05_A457FasCod, T00K05_A603MaqCodBis
            }
            , new Object[] {
            T00K06_A407EmprNom, T00K06_n407EmprNom
            }
            , new Object[] {
            T00K07_A759ProDsc
            }
            , new Object[] {
            T00K08_A396EmprCod
            }
            , new Object[] {
            T00K09_A396EmprCod
            }
            , new Object[] {
            T00K010_A602MaqCod
            }
            , new Object[] {
            T00K011_A194BarOrdLin, T00K011_A407EmprNom, T00K011_n407EmprNom, T00K011_A759ProDsc, T00K011_A4638BarUltNlot, T00K011_n4638BarUltNlot, T00K011_A396EmprCod, T00K011_A129BarCod, T00K011_A132BarCodReo, T00K011_A130BarCodPar,
            T00K011_A758ProCod, T00K011_A457FasCod, T00K011_A603MaqCodBis
            }
            , new Object[] {
            T00K012_A759ProDsc
            }
            , new Object[] {
            T00K013_A396EmprCod
            }
            , new Object[] {
            T00K014_A396EmprCod, T00K014_A129BarCod, T00K014_A132BarCodReo, T00K014_A130BarCodPar, T00K014_A758ProCod, T00K014_A194BarOrdLin
            }
            , new Object[] {
            T00K015_A194BarOrdLin, T00K015_A396EmprCod, T00K015_A129BarCod, T00K015_A132BarCodReo, T00K015_A130BarCodPar, T00K015_A758ProCod
            }
            , new Object[] {
            T00K016_A194BarOrdLin, T00K016_A396EmprCod, T00K016_A129BarCod, T00K016_A132BarCodReo, T00K016_A130BarCodPar, T00K016_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00K020_A759ProDsc
            }
            , new Object[] {
            T00K021_A396EmprCod, T00K021_A129BarCod, T00K021_A132BarCodReo, T00K021_A130BarCodPar, T00K021_A758ProCod, T00K021_A194BarOrdLin, T00K021_A12517SolAfLn
            }
            , new Object[] {
            T00K022_A396EmprCod, T00K022_A129BarCod, T00K022_A132BarCodReo, T00K022_A130BarCodPar, T00K022_A758ProCod, T00K022_A194BarOrdLin, T00K022_A12516SolLzLn
            }
            , new Object[] {
            T00K023_A396EmprCod, T00K023_A129BarCod, T00K023_A132BarCodReo, T00K023_A130BarCodPar, T00K023_A758ProCod, T00K023_A194BarOrdLin, T00K023_A12515SolPlLn
            }
            , new Object[] {
            T00K024_A396EmprCod, T00K024_A129BarCod, T00K024_A132BarCodReo, T00K024_A130BarCodPar, T00K024_A758ProCod, T00K024_A194BarOrdLin, T00K024_A12514SolSAlLn
            }
            , new Object[] {
            T00K025_A396EmprCod, T00K025_A129BarCod, T00K025_A132BarCodReo, T00K025_A130BarCodPar, T00K025_A758ProCod, T00K025_A194BarOrdLin, T00K025_A12513SolSAcLn
            }
            , new Object[] {
            T00K026_A396EmprCod, T00K026_A129BarCod, T00K026_A132BarCodReo, T00K026_A130BarCodPar, T00K026_A758ProCod, T00K026_A194BarOrdLin, T00K026_A12512SolFrLn
            }
            , new Object[] {
            T00K027_A396EmprCod, T00K027_A129BarCod, T00K027_A132BarCodReo, T00K027_A130BarCodPar, T00K027_A758ProCod, T00K027_A194BarOrdLin, T00K027_A12511SolAgLn
            }
            , new Object[] {
            T00K028_A396EmprCod, T00K028_A129BarCod, T00K028_A132BarCodReo, T00K028_A130BarCodPar, T00K028_A758ProCod, T00K028_A194BarOrdLin, T00K028_A12510SolLvLn
            }
            , new Object[] {
            T00K029_A396EmprCod, T00K029_A129BarCod, T00K029_A132BarCodReo, T00K029_A130BarCodPar, T00K029_A758ProCod, T00K029_A194BarOrdLin, T00K029_A10781BarFasNb
            }
            , new Object[] {
            T00K030_A396EmprCod, T00K030_A129BarCod, T00K030_A132BarCodReo, T00K030_A130BarCodPar, T00K030_A758ProCod, T00K030_A194BarOrdLin, T00K030_A719PrdNum
            }
            , new Object[] {
            T00K031_A396EmprCod, T00K031_A129BarCod, T00K031_A132BarCodReo, T00K031_A130BarCodPar, T00K031_A758ProCod, T00K031_A194BarOrdLin, T00K031_A9966Em_cod
            }
            , new Object[] {
            T00K032_A396EmprCod, T00K032_A129BarCod, T00K032_A132BarCodReo, T00K032_A130BarCodPar, T00K032_A758ProCod, T00K032_A194BarOrdLin, T00K032_A9940Ab_cod
            }
            , new Object[] {
            T00K033_A396EmprCod, T00K033_A129BarCod, T00K033_A132BarCodReo, T00K033_A130BarCodPar, T00K033_A758ProCod, T00K033_A194BarOrdLin, T00K033_A9911Ca_cod
            }
            , new Object[] {
            T00K034_A396EmprCod, T00K034_A129BarCod, T00K034_A132BarCodReo, T00K034_A130BarCodPar, T00K034_A758ProCod, T00K034_A194BarOrdLin, T00K034_A9878Pe_cod
            }
            , new Object[] {
            T00K035_A396EmprCod, T00K035_A129BarCod, T00K035_A132BarCodReo, T00K035_A130BarCodPar, T00K035_A758ProCod, T00K035_A194BarOrdLin, T00K035_A9870Rm_cod
            }
            , new Object[] {
            T00K036_A396EmprCod, T00K036_A129BarCod, T00K036_A132BarCodReo, T00K036_A130BarCodPar, T00K036_A758ProCod, T00K036_A194BarOrdLin, T00K036_A7934Dtb_Ordl
            }
            , new Object[] {
            T00K037_A396EmprCod, T00K037_A129BarCod, T00K037_A132BarCodReo, T00K037_A130BarCodPar, T00K037_A758ProCod, T00K037_A194BarOrdLin, T00K037_A5371FasQuiLin
            }
            , new Object[] {
            T00K038_A396EmprCod, T00K038_A129BarCod, T00K038_A132BarCodReo, T00K038_A130BarCodPar, T00K038_A758ProCod, T00K038_A194BarOrdLin, T00K038_A4940A_Barcod, T00K038_A4941A_BarReo, T00K038_A4942A_BarPar, T00K038_A4943A_ProCod,
            T00K038_A4944A_BarOrd
            }
            , new Object[] {
            T00K039_A396EmprCod, T00K039_A129BarCod, T00K039_A132BarCodReo, T00K039_A130BarCodPar, T00K039_A758ProCod, T00K039_A194BarOrdLin, T00K039_A4643BarFasLot, T00K039_A5954Ap_Barcod, T00K039_A5955Ap_BarReo, T00K039_A5956Ap_BarPar,
            T00K039_A5957Ap_ProCod, T00K039_A5958Ap_BarOrd
            }
            , new Object[] {
            T00K040_A396EmprCod, T00K040_A129BarCod, T00K040_A132BarCodReo, T00K040_A130BarCodPar, T00K040_A758ProCod, T00K040_A194BarOrdLin, T00K040_A4031CCTCod
            }
            , new Object[] {
            T00K041_A396EmprCod, T00K041_A129BarCod, T00K041_A132BarCodReo, T00K041_A130BarCodPar, T00K041_A758ProCod, T00K041_A194BarOrdLin, T00K041_A1664ParFasCod
            }
            , new Object[] {
            T00K042_A396EmprCod, T00K042_A129BarCod, T00K042_A132BarCodReo, T00K042_A130BarCodPar, T00K042_A758ProCod, T00K042_A194BarOrdLin
            }
            , new Object[] {
            T00K043_A129BarCod, T00K043_A132BarCodReo, T00K043_A130BarCodPar, T00K043_A194BarOrdLin, T00K043_A4643BarFasLot, T00K043_A4644BarFasNPrd, T00K043_n4644BarFasNPrd, T00K043_A4645BarFasKgs, T00K043_n4645BarFasKgs, T00K043_A4646BarFasMts,
            T00K043_n4646BarFasMts, T00K043_A4302BarMaqFas1, T00K043_n4302BarMaqFas1, T00K043_A4303BarFasEst1, T00K043_n4303BarFasEst1, T00K043_A4304BarFecRIn1, T00K043_n4304BarFecRIn1, T00K043_A4305BarFecRea1, T00K043_n4305BarFecRea1, T00K043_A4306BarTieTeo1,
            T00K043_n4306BarTieTeo1, T00K043_A4307BarUni1, T00K043_n4307BarUni1, T00K043_A4308BarHorIni1, T00K043_n4308BarHorIni1, T00K043_A4309BarHorFin1, T00K043_n4309BarHorFin1, T00K043_A4310BarTieRea1, T00K043_n4310BarTieRea1, T00K043_A4311BarFasMtr1,
            T00K043_n4311BarFasMtr1, T00K043_A4312BarFasKgm1, T00K043_n4312BarFasKgm1, T00K043_A4647BarFasNPr1, T00K043_n4647BarFasNPr1, T00K043_A4313BarFasPri1, T00K043_n4313BarFasPri1, T00K043_A4314BarFasBot1, T00K043_n4314BarFasBot1, T00K043_A4315BarNumBot1,
            T00K043_n4315BarNumBot1, T00K043_A4648BarFasRecu, T00K043_n4648BarFasRecu, T00K043_A4927BarFasDti1, T00K043_n4927BarFasDti1, T00K043_A4928BarFasDtf1, T00K043_n4928BarFasDtf1, T00K043_A4939BarFasInc1, T00K043_n4939BarFasInc1, T00K043_A6662BarEstPec,
            T00K043_n6662BarEstPec, T00K043_A396EmprCod, T00K043_A758ProCod
            }
            , new Object[] {
            T00K044_A396EmprCod, T00K044_A129BarCod, T00K044_A132BarCodReo, T00K044_A130BarCodPar, T00K044_A758ProCod, T00K044_A194BarOrdLin, T00K044_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00K048_A396EmprCod, T00K048_A129BarCod, T00K048_A132BarCodReo, T00K048_A130BarCodPar, T00K048_A758ProCod, T00K048_A194BarOrdLin, T00K048_A4643BarFasLot, T00K048_A10084BarPFcod
            }
            , new Object[] {
            T00K049_A396EmprCod, T00K049_A129BarCod, T00K049_A132BarCodReo, T00K049_A130BarCodPar, T00K049_A758ProCod, T00K049_A194BarOrdLin, T00K049_A4643BarFasLot, T00K049_A6579DataReg, T00K049_A6574Turno, T00K049_A6580Seccao,
            T00K049_A6577FuncCod
            }
            , new Object[] {
            T00K050_A396EmprCod, T00K050_A129BarCod, T00K050_A132BarCodReo, T00K050_A130BarCodPar, T00K050_A758ProCod, T00K050_A194BarOrdLin, T00K050_A4643BarFasLot, T00K050_A5954Ap_Barcod, T00K050_A5955Ap_BarReo, T00K050_A5956Ap_BarPar,
            T00K050_A5957Ap_ProCod, T00K050_A5958Ap_BarOrd
            }
            , new Object[] {
            T00K051_A396EmprCod, T00K051_A129BarCod, T00K051_A132BarCodReo, T00K051_A130BarCodPar, T00K051_A758ProCod, T00K051_A194BarOrdLin, T00K051_A4643BarFasLot
            }
            , new Object[] {
            T00K052_A407EmprNom, T00K052_n407EmprNom
            }
            , new Object[] {
            T00K053_A396EmprCod
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
   private byte Z4303BarFasEst1 ;
   private byte Z4313BarFasPri1 ;
   private byte Z4939BarFasInc1 ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A4303BarFasEst1 ;
   private byte A4313BarFasPri1 ;
   private byte A4939BarFasInc1 ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z194BarOrdLin ;
   private short Z4644BarFasNPrd ;
   private short Z4308BarHorIni1 ;
   private short Z4309BarHorFin1 ;
   private short Z4647BarFasNPr1 ;
   private short nRcdDeleted_688 ;
   private short nRcdExists_688 ;
   private short nIsMod_688 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A194BarOrdLin ;
   private short nBlankRcdCount688 ;
   private short RcdFound688 ;
   private short nBlankRcdUsr688 ;
   private short A4644BarFasNPrd ;
   private short A4308BarHorIni1 ;
   private short A4309BarHorFin1 ;
   private short A4647BarFasNPr1 ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private short nIsDirty_688 ;
   private short ZZ194BarOrdLin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z4638BarUltNlot ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z4643BarFasLot ;
   private int Z4315BarNumBot1 ;
   private int Z4648BarFasRecu ;
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
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtProDsc_Enabled ;
   private int A4638BarUltNlot ;
   private int edtBarUltNlot_Enabled ;
   private int edtavnRcdDeleted_688_Enabled ;
   private int edtBarFasLot_Enabled ;
   private int edtBarFasNPrd_Enabled ;
   private int edtBarFasKgs_Enabled ;
   private int edtBarFasMts_Enabled ;
   private int edtBarMaqFas1_Enabled ;
   private int edtBarFasEst1_Enabled ;
   private int edtBarFecRIn1_Enabled ;
   private int edtBarFecRea1_Enabled ;
   private int edtBarTieTeo1_Enabled ;
   private int edtBarUni1_Enabled ;
   private int edtBarHorIni1_Enabled ;
   private int edtBarHorFin1_Enabled ;
   private int edtBarTieRea1_Enabled ;
   private int edtBarFasMtr1_Enabled ;
   private int edtBarFasKgm1_Enabled ;
   private int edtBarFasNPr1_Enabled ;
   private int edtBarFasPri1_Enabled ;
   private int edtBarFasBot1_Enabled ;
   private int edtBarNumBot1_Enabled ;
   private int edtBarFasRecu_Enabled ;
   private int edtBarFasDti1_Enabled ;
   private int edtBarFasDtf1_Enabled ;
   private int edtBarFasInc1_Enabled ;
   private int edtBarEstPec_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A4643BarFasLot ;
   private int A4315BarNumBot1 ;
   private int A4648BarFasRecu ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarFasLot_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarUltNlot_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtMaqCodBis_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4638BarUltNlot ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4645BarFasKgs ;
   private java.math.BigDecimal Z4646BarFasMts ;
   private java.math.BigDecimal Z4306BarTieTeo1 ;
   private java.math.BigDecimal Z4307BarUni1 ;
   private java.math.BigDecimal Z4310BarTieRea1 ;
   private java.math.BigDecimal Z4311BarFasMtr1 ;
   private java.math.BigDecimal Z4312BarFasKgm1 ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal A4646BarFasMts ;
   private java.math.BigDecimal A4306BarTieTeo1 ;
   private java.math.BigDecimal A4307BarUni1 ;
   private java.math.BigDecimal A4310BarTieRea1 ;
   private java.math.BigDecimal A4311BarFasMtr1 ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String Z4302BarMaqFas1 ;
   private String Z4314BarFasBot1 ;
   private String Z6662BarEstPec ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProCod_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMaqCodBis_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarUltNlot_Internalname ;
   private String edtBarUltNlot_Jsonclick ;
   private String sMode688 ;
   private String edtavnRcdDeleted_688_Internalname ;
   private String edtBarFasLot_Internalname ;
   private String edtBarFasNPrd_Internalname ;
   private String edtBarFasKgs_Internalname ;
   private String edtBarFasMts_Internalname ;
   private String edtBarMaqFas1_Internalname ;
   private String edtBarFasEst1_Internalname ;
   private String edtBarFecRIn1_Internalname ;
   private String edtBarFecRea1_Internalname ;
   private String edtBarTieTeo1_Internalname ;
   private String edtBarUni1_Internalname ;
   private String edtBarHorIni1_Internalname ;
   private String edtBarHorFin1_Internalname ;
   private String edtBarTieRea1_Internalname ;
   private String edtBarFasMtr1_Internalname ;
   private String edtBarFasKgm1_Internalname ;
   private String edtBarFasNPr1_Internalname ;
   private String edtBarFasPri1_Internalname ;
   private String edtBarFasBot1_Internalname ;
   private String edtBarNumBot1_Internalname ;
   private String edtBarFasRecu_Internalname ;
   private String edtBarFasDti1_Internalname ;
   private String edtBarFasDtf1_Internalname ;
   private String edtBarFasInc1_Internalname ;
   private String edtBarEstPec_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode15 ;
   private String GXCCtl ;
   private String A4302BarMaqFas1 ;
   private String A4314BarFasBot1 ;
   private String A6662BarEstPec ;
   private String AV36LitFe ;
   private String AV16Lit0 ;
   private String AV38Station ;
   private String AV39emprcod ;
   private String GXv_char2[] ;
   private String AV40emprnom ;
   private String GXv_char3[] ;
   private String AV35UsurCod ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV21Lit5 ;
   private String AV22Lit6 ;
   private String AV23Lit7 ;
   private String AV24Lit8 ;
   private String AV25Lit9 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String AV28Lit12 ;
   private String AV29Lit13 ;
   private String AV30Lit14 ;
   private String AV31Lit15 ;
   private String AV32Lit16 ;
   private String AV33Lit17 ;
   private String AV34Lit18 ;
   private String AV37lit19 ;
   private String AV42Lit20 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z759ProDsc ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_688_Jsonclick ;
   private String edtBarFasLot_Jsonclick ;
   private String edtBarFasNPrd_Jsonclick ;
   private String edtBarFasKgs_Jsonclick ;
   private String edtBarFasMts_Jsonclick ;
   private String edtBarMaqFas1_Jsonclick ;
   private String edtBarFasEst1_Jsonclick ;
   private String edtBarFecRIn1_Jsonclick ;
   private String edtBarFecRea1_Jsonclick ;
   private String edtBarTieTeo1_Jsonclick ;
   private String edtBarUni1_Jsonclick ;
   private String edtBarHorIni1_Jsonclick ;
   private String edtBarHorFin1_Jsonclick ;
   private String edtBarTieRea1_Jsonclick ;
   private String edtBarFasMtr1_Jsonclick ;
   private String edtBarFasKgm1_Jsonclick ;
   private String edtBarFasNPr1_Jsonclick ;
   private String edtBarFasPri1_Jsonclick ;
   private String edtBarFasBot1_Jsonclick ;
   private String edtBarNumBot1_Jsonclick ;
   private String edtBarFasRecu_Jsonclick ;
   private String edtBarFasDti1_Jsonclick ;
   private String edtBarFasDtf1_Jsonclick ;
   private String edtBarFasInc1_Jsonclick ;
   private String edtBarEstPec_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A602MaqCod ;
   private String subGrid1_Header ;
   private String Z602MaqCod ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ457FasCod ;
   private String ZZ603MaqCodBis ;
   private String ZZ759ProDsc ;
   private java.util.Date Z4927BarFasDti1 ;
   private java.util.Date Z4928BarFasDtf1 ;
   private java.util.Date A4927BarFasDti1 ;
   private java.util.Date A4928BarFasDtf1 ;
   private java.util.Date Z4304BarFecRIn1 ;
   private java.util.Date Z4305BarFecRea1 ;
   private java.util.Date A4304BarFecRIn1 ;
   private java.util.Date A4305BarFecRea1 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4638BarUltNlot ;
   private boolean returnInSub ;
   private boolean n4644BarFasNPrd ;
   private boolean n4645BarFasKgs ;
   private boolean n4646BarFasMts ;
   private boolean n4302BarMaqFas1 ;
   private boolean n4303BarFasEst1 ;
   private boolean n4304BarFecRIn1 ;
   private boolean n4305BarFecRea1 ;
   private boolean n4306BarTieTeo1 ;
   private boolean n4307BarUni1 ;
   private boolean n4308BarHorIni1 ;
   private boolean n4309BarHorFin1 ;
   private boolean n4310BarTieRea1 ;
   private boolean n4311BarFasMtr1 ;
   private boolean n4312BarFasKgm1 ;
   private boolean n4647BarFasNPr1 ;
   private boolean n4313BarFasPri1 ;
   private boolean n4314BarFasBot1 ;
   private boolean n4315BarNumBot1 ;
   private boolean n4648BarFasRecu ;
   private boolean n4927BarFasDti1 ;
   private boolean n4928BarFasDtf1 ;
   private boolean n4939BarFasInc1 ;
   private boolean n6662BarEstPec ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00K06_A407EmprNom ;
   private boolean[] T00K06_n407EmprNom ;
   private String[] T00K09_A396EmprCod ;
   private String[] T00K010_A602MaqCod ;
   private short[] T00K011_A194BarOrdLin ;
   private String[] T00K011_A407EmprNom ;
   private boolean[] T00K011_n407EmprNom ;
   private String[] T00K011_A759ProDsc ;
   private int[] T00K011_A4638BarUltNlot ;
   private boolean[] T00K011_n4638BarUltNlot ;
   private String[] T00K011_A396EmprCod ;
   private int[] T00K011_A129BarCod ;
   private byte[] T00K011_A132BarCodReo ;
   private String[] T00K011_A130BarCodPar ;
   private String[] T00K011_A758ProCod ;
   private String[] T00K011_A457FasCod ;
   private String[] T00K011_A603MaqCodBis ;
   private String[] T00K07_A759ProDsc ;
   private String[] T00K08_A396EmprCod ;
   private String[] T00K012_A759ProDsc ;
   private String[] T00K013_A396EmprCod ;
   private String[] T00K014_A396EmprCod ;
   private int[] T00K014_A129BarCod ;
   private byte[] T00K014_A132BarCodReo ;
   private String[] T00K014_A130BarCodPar ;
   private String[] T00K014_A758ProCod ;
   private short[] T00K014_A194BarOrdLin ;
   private short[] T00K05_A194BarOrdLin ;
   private int[] T00K05_A4638BarUltNlot ;
   private boolean[] T00K05_n4638BarUltNlot ;
   private String[] T00K05_A396EmprCod ;
   private int[] T00K05_A129BarCod ;
   private byte[] T00K05_A132BarCodReo ;
   private String[] T00K05_A130BarCodPar ;
   private String[] T00K05_A758ProCod ;
   private String[] T00K05_A457FasCod ;
   private String[] T00K05_A603MaqCodBis ;
   private short[] T00K015_A194BarOrdLin ;
   private String[] T00K015_A396EmprCod ;
   private int[] T00K015_A129BarCod ;
   private byte[] T00K015_A132BarCodReo ;
   private String[] T00K015_A130BarCodPar ;
   private String[] T00K015_A758ProCod ;
   private short[] T00K016_A194BarOrdLin ;
   private String[] T00K016_A396EmprCod ;
   private int[] T00K016_A129BarCod ;
   private byte[] T00K016_A132BarCodReo ;
   private String[] T00K016_A130BarCodPar ;
   private String[] T00K016_A758ProCod ;
   private short[] T00K04_A194BarOrdLin ;
   private int[] T00K04_A4638BarUltNlot ;
   private boolean[] T00K04_n4638BarUltNlot ;
   private String[] T00K04_A396EmprCod ;
   private int[] T00K04_A129BarCod ;
   private byte[] T00K04_A132BarCodReo ;
   private String[] T00K04_A130BarCodPar ;
   private String[] T00K04_A758ProCod ;
   private String[] T00K04_A457FasCod ;
   private String[] T00K04_A603MaqCodBis ;
   private String[] T00K020_A759ProDsc ;
   private String[] T00K021_A396EmprCod ;
   private int[] T00K021_A129BarCod ;
   private byte[] T00K021_A132BarCodReo ;
   private String[] T00K021_A130BarCodPar ;
   private String[] T00K021_A758ProCod ;
   private short[] T00K021_A194BarOrdLin ;
   private short[] T00K021_A12517SolAfLn ;
   private String[] T00K022_A396EmprCod ;
   private int[] T00K022_A129BarCod ;
   private byte[] T00K022_A132BarCodReo ;
   private String[] T00K022_A130BarCodPar ;
   private String[] T00K022_A758ProCod ;
   private short[] T00K022_A194BarOrdLin ;
   private short[] T00K022_A12516SolLzLn ;
   private String[] T00K023_A396EmprCod ;
   private int[] T00K023_A129BarCod ;
   private byte[] T00K023_A132BarCodReo ;
   private String[] T00K023_A130BarCodPar ;
   private String[] T00K023_A758ProCod ;
   private short[] T00K023_A194BarOrdLin ;
   private short[] T00K023_A12515SolPlLn ;
   private String[] T00K024_A396EmprCod ;
   private int[] T00K024_A129BarCod ;
   private byte[] T00K024_A132BarCodReo ;
   private String[] T00K024_A130BarCodPar ;
   private String[] T00K024_A758ProCod ;
   private short[] T00K024_A194BarOrdLin ;
   private short[] T00K024_A12514SolSAlLn ;
   private String[] T00K025_A396EmprCod ;
   private int[] T00K025_A129BarCod ;
   private byte[] T00K025_A132BarCodReo ;
   private String[] T00K025_A130BarCodPar ;
   private String[] T00K025_A758ProCod ;
   private short[] T00K025_A194BarOrdLin ;
   private short[] T00K025_A12513SolSAcLn ;
   private String[] T00K026_A396EmprCod ;
   private int[] T00K026_A129BarCod ;
   private byte[] T00K026_A132BarCodReo ;
   private String[] T00K026_A130BarCodPar ;
   private String[] T00K026_A758ProCod ;
   private short[] T00K026_A194BarOrdLin ;
   private short[] T00K026_A12512SolFrLn ;
   private String[] T00K027_A396EmprCod ;
   private int[] T00K027_A129BarCod ;
   private byte[] T00K027_A132BarCodReo ;
   private String[] T00K027_A130BarCodPar ;
   private String[] T00K027_A758ProCod ;
   private short[] T00K027_A194BarOrdLin ;
   private short[] T00K027_A12511SolAgLn ;
   private String[] T00K028_A396EmprCod ;
   private int[] T00K028_A129BarCod ;
   private byte[] T00K028_A132BarCodReo ;
   private String[] T00K028_A130BarCodPar ;
   private String[] T00K028_A758ProCod ;
   private short[] T00K028_A194BarOrdLin ;
   private short[] T00K028_A12510SolLvLn ;
   private String[] T00K029_A396EmprCod ;
   private int[] T00K029_A129BarCod ;
   private byte[] T00K029_A132BarCodReo ;
   private String[] T00K029_A130BarCodPar ;
   private String[] T00K029_A758ProCod ;
   private short[] T00K029_A194BarOrdLin ;
   private int[] T00K029_A10781BarFasNb ;
   private String[] T00K030_A396EmprCod ;
   private int[] T00K030_A129BarCod ;
   private byte[] T00K030_A132BarCodReo ;
   private String[] T00K030_A130BarCodPar ;
   private String[] T00K030_A758ProCod ;
   private short[] T00K030_A194BarOrdLin ;
   private String[] T00K030_A719PrdNum ;
   private String[] T00K031_A396EmprCod ;
   private int[] T00K031_A129BarCod ;
   private byte[] T00K031_A132BarCodReo ;
   private String[] T00K031_A130BarCodPar ;
   private String[] T00K031_A758ProCod ;
   private short[] T00K031_A194BarOrdLin ;
   private String[] T00K031_A9966Em_cod ;
   private String[] T00K032_A396EmprCod ;
   private int[] T00K032_A129BarCod ;
   private byte[] T00K032_A132BarCodReo ;
   private String[] T00K032_A130BarCodPar ;
   private String[] T00K032_A758ProCod ;
   private short[] T00K032_A194BarOrdLin ;
   private String[] T00K032_A9940Ab_cod ;
   private String[] T00K033_A396EmprCod ;
   private int[] T00K033_A129BarCod ;
   private byte[] T00K033_A132BarCodReo ;
   private String[] T00K033_A130BarCodPar ;
   private String[] T00K033_A758ProCod ;
   private short[] T00K033_A194BarOrdLin ;
   private String[] T00K033_A9911Ca_cod ;
   private String[] T00K034_A396EmprCod ;
   private int[] T00K034_A129BarCod ;
   private byte[] T00K034_A132BarCodReo ;
   private String[] T00K034_A130BarCodPar ;
   private String[] T00K034_A758ProCod ;
   private short[] T00K034_A194BarOrdLin ;
   private String[] T00K034_A9878Pe_cod ;
   private String[] T00K035_A396EmprCod ;
   private int[] T00K035_A129BarCod ;
   private byte[] T00K035_A132BarCodReo ;
   private String[] T00K035_A130BarCodPar ;
   private String[] T00K035_A758ProCod ;
   private short[] T00K035_A194BarOrdLin ;
   private String[] T00K035_A9870Rm_cod ;
   private String[] T00K036_A396EmprCod ;
   private int[] T00K036_A129BarCod ;
   private byte[] T00K036_A132BarCodReo ;
   private String[] T00K036_A130BarCodPar ;
   private String[] T00K036_A758ProCod ;
   private short[] T00K036_A194BarOrdLin ;
   private short[] T00K036_A7934Dtb_Ordl ;
   private String[] T00K037_A396EmprCod ;
   private int[] T00K037_A129BarCod ;
   private byte[] T00K037_A132BarCodReo ;
   private String[] T00K037_A130BarCodPar ;
   private String[] T00K037_A758ProCod ;
   private short[] T00K037_A194BarOrdLin ;
   private short[] T00K037_A5371FasQuiLin ;
   private String[] T00K038_A396EmprCod ;
   private int[] T00K038_A129BarCod ;
   private byte[] T00K038_A132BarCodReo ;
   private String[] T00K038_A130BarCodPar ;
   private String[] T00K038_A758ProCod ;
   private short[] T00K038_A194BarOrdLin ;
   private int[] T00K038_A4940A_Barcod ;
   private byte[] T00K038_A4941A_BarReo ;
   private String[] T00K038_A4942A_BarPar ;
   private String[] T00K038_A4943A_ProCod ;
   private short[] T00K038_A4944A_BarOrd ;
   private String[] T00K039_A396EmprCod ;
   private int[] T00K039_A129BarCod ;
   private byte[] T00K039_A132BarCodReo ;
   private String[] T00K039_A130BarCodPar ;
   private String[] T00K039_A758ProCod ;
   private short[] T00K039_A194BarOrdLin ;
   private int[] T00K039_A4643BarFasLot ;
   private int[] T00K039_A5954Ap_Barcod ;
   private byte[] T00K039_A5955Ap_BarReo ;
   private String[] T00K039_A5956Ap_BarPar ;
   private String[] T00K039_A5957Ap_ProCod ;
   private short[] T00K039_A5958Ap_BarOrd ;
   private String[] T00K040_A396EmprCod ;
   private int[] T00K040_A129BarCod ;
   private byte[] T00K040_A132BarCodReo ;
   private String[] T00K040_A130BarCodPar ;
   private String[] T00K040_A758ProCod ;
   private short[] T00K040_A194BarOrdLin ;
   private int[] T00K040_A4031CCTCod ;
   private String[] T00K041_A396EmprCod ;
   private int[] T00K041_A129BarCod ;
   private byte[] T00K041_A132BarCodReo ;
   private String[] T00K041_A130BarCodPar ;
   private String[] T00K041_A758ProCod ;
   private short[] T00K041_A194BarOrdLin ;
   private short[] T00K041_A1664ParFasCod ;
   private String[] T00K042_A396EmprCod ;
   private int[] T00K042_A129BarCod ;
   private byte[] T00K042_A132BarCodReo ;
   private String[] T00K042_A130BarCodPar ;
   private String[] T00K042_A758ProCod ;
   private short[] T00K042_A194BarOrdLin ;
   private int[] T00K043_A129BarCod ;
   private byte[] T00K043_A132BarCodReo ;
   private String[] T00K043_A130BarCodPar ;
   private short[] T00K043_A194BarOrdLin ;
   private int[] T00K043_A4643BarFasLot ;
   private short[] T00K043_A4644BarFasNPrd ;
   private boolean[] T00K043_n4644BarFasNPrd ;
   private java.math.BigDecimal[] T00K043_A4645BarFasKgs ;
   private boolean[] T00K043_n4645BarFasKgs ;
   private java.math.BigDecimal[] T00K043_A4646BarFasMts ;
   private boolean[] T00K043_n4646BarFasMts ;
   private String[] T00K043_A4302BarMaqFas1 ;
   private boolean[] T00K043_n4302BarMaqFas1 ;
   private byte[] T00K043_A4303BarFasEst1 ;
   private boolean[] T00K043_n4303BarFasEst1 ;
   private java.util.Date[] T00K043_A4304BarFecRIn1 ;
   private boolean[] T00K043_n4304BarFecRIn1 ;
   private java.util.Date[] T00K043_A4305BarFecRea1 ;
   private boolean[] T00K043_n4305BarFecRea1 ;
   private java.math.BigDecimal[] T00K043_A4306BarTieTeo1 ;
   private boolean[] T00K043_n4306BarTieTeo1 ;
   private java.math.BigDecimal[] T00K043_A4307BarUni1 ;
   private boolean[] T00K043_n4307BarUni1 ;
   private short[] T00K043_A4308BarHorIni1 ;
   private boolean[] T00K043_n4308BarHorIni1 ;
   private short[] T00K043_A4309BarHorFin1 ;
   private boolean[] T00K043_n4309BarHorFin1 ;
   private java.math.BigDecimal[] T00K043_A4310BarTieRea1 ;
   private boolean[] T00K043_n4310BarTieRea1 ;
   private java.math.BigDecimal[] T00K043_A4311BarFasMtr1 ;
   private boolean[] T00K043_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] T00K043_A4312BarFasKgm1 ;
   private boolean[] T00K043_n4312BarFasKgm1 ;
   private short[] T00K043_A4647BarFasNPr1 ;
   private boolean[] T00K043_n4647BarFasNPr1 ;
   private byte[] T00K043_A4313BarFasPri1 ;
   private boolean[] T00K043_n4313BarFasPri1 ;
   private String[] T00K043_A4314BarFasBot1 ;
   private boolean[] T00K043_n4314BarFasBot1 ;
   private int[] T00K043_A4315BarNumBot1 ;
   private boolean[] T00K043_n4315BarNumBot1 ;
   private int[] T00K043_A4648BarFasRecu ;
   private boolean[] T00K043_n4648BarFasRecu ;
   private java.util.Date[] T00K043_A4927BarFasDti1 ;
   private boolean[] T00K043_n4927BarFasDti1 ;
   private java.util.Date[] T00K043_A4928BarFasDtf1 ;
   private boolean[] T00K043_n4928BarFasDtf1 ;
   private byte[] T00K043_A4939BarFasInc1 ;
   private boolean[] T00K043_n4939BarFasInc1 ;
   private String[] T00K043_A6662BarEstPec ;
   private boolean[] T00K043_n6662BarEstPec ;
   private String[] T00K043_A396EmprCod ;
   private String[] T00K043_A758ProCod ;
   private String[] T00K044_A396EmprCod ;
   private int[] T00K044_A129BarCod ;
   private byte[] T00K044_A132BarCodReo ;
   private String[] T00K044_A130BarCodPar ;
   private String[] T00K044_A758ProCod ;
   private short[] T00K044_A194BarOrdLin ;
   private int[] T00K044_A4643BarFasLot ;
   private int[] T00K03_A129BarCod ;
   private byte[] T00K03_A132BarCodReo ;
   private String[] T00K03_A130BarCodPar ;
   private short[] T00K03_A194BarOrdLin ;
   private int[] T00K03_A4643BarFasLot ;
   private short[] T00K03_A4644BarFasNPrd ;
   private boolean[] T00K03_n4644BarFasNPrd ;
   private java.math.BigDecimal[] T00K03_A4645BarFasKgs ;
   private boolean[] T00K03_n4645BarFasKgs ;
   private java.math.BigDecimal[] T00K03_A4646BarFasMts ;
   private boolean[] T00K03_n4646BarFasMts ;
   private String[] T00K03_A4302BarMaqFas1 ;
   private boolean[] T00K03_n4302BarMaqFas1 ;
   private byte[] T00K03_A4303BarFasEst1 ;
   private boolean[] T00K03_n4303BarFasEst1 ;
   private java.util.Date[] T00K03_A4304BarFecRIn1 ;
   private boolean[] T00K03_n4304BarFecRIn1 ;
   private java.util.Date[] T00K03_A4305BarFecRea1 ;
   private boolean[] T00K03_n4305BarFecRea1 ;
   private java.math.BigDecimal[] T00K03_A4306BarTieTeo1 ;
   private boolean[] T00K03_n4306BarTieTeo1 ;
   private java.math.BigDecimal[] T00K03_A4307BarUni1 ;
   private boolean[] T00K03_n4307BarUni1 ;
   private short[] T00K03_A4308BarHorIni1 ;
   private boolean[] T00K03_n4308BarHorIni1 ;
   private short[] T00K03_A4309BarHorFin1 ;
   private boolean[] T00K03_n4309BarHorFin1 ;
   private java.math.BigDecimal[] T00K03_A4310BarTieRea1 ;
   private boolean[] T00K03_n4310BarTieRea1 ;
   private java.math.BigDecimal[] T00K03_A4311BarFasMtr1 ;
   private boolean[] T00K03_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] T00K03_A4312BarFasKgm1 ;
   private boolean[] T00K03_n4312BarFasKgm1 ;
   private short[] T00K03_A4647BarFasNPr1 ;
   private boolean[] T00K03_n4647BarFasNPr1 ;
   private byte[] T00K03_A4313BarFasPri1 ;
   private boolean[] T00K03_n4313BarFasPri1 ;
   private String[] T00K03_A4314BarFasBot1 ;
   private boolean[] T00K03_n4314BarFasBot1 ;
   private int[] T00K03_A4315BarNumBot1 ;
   private boolean[] T00K03_n4315BarNumBot1 ;
   private int[] T00K03_A4648BarFasRecu ;
   private boolean[] T00K03_n4648BarFasRecu ;
   private java.util.Date[] T00K03_A4927BarFasDti1 ;
   private boolean[] T00K03_n4927BarFasDti1 ;
   private java.util.Date[] T00K03_A4928BarFasDtf1 ;
   private boolean[] T00K03_n4928BarFasDtf1 ;
   private byte[] T00K03_A4939BarFasInc1 ;
   private boolean[] T00K03_n4939BarFasInc1 ;
   private String[] T00K03_A6662BarEstPec ;
   private boolean[] T00K03_n6662BarEstPec ;
   private String[] T00K03_A396EmprCod ;
   private String[] T00K03_A758ProCod ;
   private int[] T00K02_A129BarCod ;
   private byte[] T00K02_A132BarCodReo ;
   private String[] T00K02_A130BarCodPar ;
   private short[] T00K02_A194BarOrdLin ;
   private int[] T00K02_A4643BarFasLot ;
   private short[] T00K02_A4644BarFasNPrd ;
   private boolean[] T00K02_n4644BarFasNPrd ;
   private java.math.BigDecimal[] T00K02_A4645BarFasKgs ;
   private boolean[] T00K02_n4645BarFasKgs ;
   private java.math.BigDecimal[] T00K02_A4646BarFasMts ;
   private boolean[] T00K02_n4646BarFasMts ;
   private String[] T00K02_A4302BarMaqFas1 ;
   private boolean[] T00K02_n4302BarMaqFas1 ;
   private byte[] T00K02_A4303BarFasEst1 ;
   private boolean[] T00K02_n4303BarFasEst1 ;
   private java.util.Date[] T00K02_A4304BarFecRIn1 ;
   private boolean[] T00K02_n4304BarFecRIn1 ;
   private java.util.Date[] T00K02_A4305BarFecRea1 ;
   private boolean[] T00K02_n4305BarFecRea1 ;
   private java.math.BigDecimal[] T00K02_A4306BarTieTeo1 ;
   private boolean[] T00K02_n4306BarTieTeo1 ;
   private java.math.BigDecimal[] T00K02_A4307BarUni1 ;
   private boolean[] T00K02_n4307BarUni1 ;
   private short[] T00K02_A4308BarHorIni1 ;
   private boolean[] T00K02_n4308BarHorIni1 ;
   private short[] T00K02_A4309BarHorFin1 ;
   private boolean[] T00K02_n4309BarHorFin1 ;
   private java.math.BigDecimal[] T00K02_A4310BarTieRea1 ;
   private boolean[] T00K02_n4310BarTieRea1 ;
   private java.math.BigDecimal[] T00K02_A4311BarFasMtr1 ;
   private boolean[] T00K02_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] T00K02_A4312BarFasKgm1 ;
   private boolean[] T00K02_n4312BarFasKgm1 ;
   private short[] T00K02_A4647BarFasNPr1 ;
   private boolean[] T00K02_n4647BarFasNPr1 ;
   private byte[] T00K02_A4313BarFasPri1 ;
   private boolean[] T00K02_n4313BarFasPri1 ;
   private String[] T00K02_A4314BarFasBot1 ;
   private boolean[] T00K02_n4314BarFasBot1 ;
   private int[] T00K02_A4315BarNumBot1 ;
   private boolean[] T00K02_n4315BarNumBot1 ;
   private int[] T00K02_A4648BarFasRecu ;
   private boolean[] T00K02_n4648BarFasRecu ;
   private java.util.Date[] T00K02_A4927BarFasDti1 ;
   private boolean[] T00K02_n4927BarFasDti1 ;
   private java.util.Date[] T00K02_A4928BarFasDtf1 ;
   private boolean[] T00K02_n4928BarFasDtf1 ;
   private byte[] T00K02_A4939BarFasInc1 ;
   private boolean[] T00K02_n4939BarFasInc1 ;
   private String[] T00K02_A6662BarEstPec ;
   private boolean[] T00K02_n6662BarEstPec ;
   private String[] T00K02_A396EmprCod ;
   private String[] T00K02_A758ProCod ;
   private String[] T00K048_A396EmprCod ;
   private int[] T00K048_A129BarCod ;
   private byte[] T00K048_A132BarCodReo ;
   private String[] T00K048_A130BarCodPar ;
   private String[] T00K048_A758ProCod ;
   private short[] T00K048_A194BarOrdLin ;
   private int[] T00K048_A4643BarFasLot ;
   private short[] T00K048_A10084BarPFcod ;
   private String[] T00K049_A396EmprCod ;
   private int[] T00K049_A129BarCod ;
   private byte[] T00K049_A132BarCodReo ;
   private String[] T00K049_A130BarCodPar ;
   private String[] T00K049_A758ProCod ;
   private short[] T00K049_A194BarOrdLin ;
   private int[] T00K049_A4643BarFasLot ;
   private java.util.Date[] T00K049_A6579DataReg ;
   private byte[] T00K049_A6574Turno ;
   private byte[] T00K049_A6580Seccao ;
   private int[] T00K049_A6577FuncCod ;
   private String[] T00K050_A396EmprCod ;
   private int[] T00K050_A129BarCod ;
   private byte[] T00K050_A132BarCodReo ;
   private String[] T00K050_A130BarCodPar ;
   private String[] T00K050_A758ProCod ;
   private short[] T00K050_A194BarOrdLin ;
   private int[] T00K050_A4643BarFasLot ;
   private int[] T00K050_A5954Ap_Barcod ;
   private byte[] T00K050_A5955Ap_BarReo ;
   private String[] T00K050_A5956Ap_BarPar ;
   private String[] T00K050_A5957Ap_ProCod ;
   private short[] T00K050_A5958Ap_BarOrd ;
   private String[] T00K051_A396EmprCod ;
   private int[] T00K051_A129BarCod ;
   private byte[] T00K051_A132BarCodReo ;
   private String[] T00K051_A130BarCodPar ;
   private String[] T00K051_A758ProCod ;
   private short[] T00K051_A194BarOrdLin ;
   private int[] T00K051_A4643BarFasLot ;
   private String[] T00K052_A407EmprNom ;
   private boolean[] T00K052_n407EmprNom ;
   private String[] T00K053_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfasmaq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasmaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasmaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasmaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00K02", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec, EmprCod, ProCod FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?  FOR UPDATE OF BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K03", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec, EmprCod, ProCod FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K04", "SELECT BarOrdLin, BarUltNlot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF BarUltNlot, FasCod, MaqCodBis NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K05", "SELECT BarOrdLin, BarUltNlot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K06", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K07", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K08", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K09", "SELECT EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K010", "SELECT MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K011", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarOrdLin, T2.EmprNom, T3.ProDsc, TM1.BarUltNlot, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod, TM1.MaqCodBis FROM ((TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K012", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K013", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K014", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K015", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE ( BarOrdLin > ? or BarOrdLin = ? and ProCod > ?) and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K016", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE ( BarOrdLin < ? or BarOrdLin = ? and ProCod < ?) and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00K017", "INSERT INTO TXPBARFAS(BarOrdLin, BarUltNlot, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, MaqCodBis, BarFasCon, BarFasEst, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00K018", "UPDATE TXPBARFAS SET BarUltNlot=?, FasCod=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00K019", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00K020", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K021", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K022", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K023", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K024", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K025", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K026", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K027", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K028", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K029", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K030", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K031", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K032", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K033", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K034", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K035", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K036", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K037", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K038", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K039", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K040", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K041", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K042", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K043", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec, EmprCod, ProCod FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K044", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00K045", "INSERT INTO TXPFASMAQ(BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec, EmprCod, ProCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFASMAQ")
         ,new UpdateCursor("T00K046", "UPDATE TXPFASMAQ SET BarFasNPrd=?, BarFasKgs=?, BarFasMts=?, BarMaqFas1=?, BarFasEst1=?, BarFecRIn1=?, BarFecRea1=?, BarTieTeo1=?, BarUni1=?, BarHorIni1=?, BarHorFin1=?, BarTieRea1=?, BarFasMtr1=?, BarFasKgm1=?, BarFasNPr1=?, BarFasPri1=?, BarFasBot1=?, BarNumBot1=?, BarFasRecu=?, BarFasDti1=?, BarFasDtf1=?, BarFasInc1=?, BarEstPec=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK, "TXPFASMAQ")
         ,new UpdateCursor("T00K047", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK, "TXPFASMAQ")
         ,new ForEachCursor("T00K048", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K049", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, DataReg, Turno, Seccao, FuncCod FROM TXPContPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K050", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, Ap_Barcod, Ap_BarReo, Ap_BarPar, Ap_ProCod, Ap_BarOrd FROM TXPAGHDFP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00K051", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K052", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00K053", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((String[]) buf[52])[0] = rslt.getString(30, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((String[]) buf[52])[0] = rslt.getString(30, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 3);
               ((String[]) buf[52])[0] = rslt.getString(30, 8);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 51 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setString(8, (String)parms[8], 8);
               stmt.setString(9, (String)parms[9], 6);
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
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 8);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 43 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[44], false);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[46], false);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[50], 1);
               }
               stmt.setString(29, (String)parms[51], 3);
               stmt.setString(30, (String)parms[52], 8);
               return;
            case 44 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[41], false);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[43]).byteValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 1);
               }
               stmt.setString(24, (String)parms[46], 3);
               stmt.setInt(25, ((Number) parms[47]).intValue());
               stmt.setByte(26, ((Number) parms[48]).byteValue());
               stmt.setString(27, (String)parms[49], 1);
               stmt.setString(28, (String)parms[50], 8);
               stmt.setShort(29, ((Number) parms[51]).shortValue());
               stmt.setInt(30, ((Number) parms[52]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

