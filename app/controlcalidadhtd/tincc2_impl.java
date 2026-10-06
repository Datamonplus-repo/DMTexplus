package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tincc2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"CCTVALD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asacctvaldT6620( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4034CCTLin = (short)(GXutil.lval( httpContext.GetPar( "CCTLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A4031CCTCod, A4034CCTLin) ;
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
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "IN CC CON COMMIT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCOpeCod_Internalname ;
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
      nRC_GXsfl_195 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_195"))) ;
      nGXsfl_195_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_195_idx"))) ;
      sGXsfl_195_idx = httpContext.GetPar( "sGXsfl_195_idx") ;
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

   public tincc2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tincc2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tincc2_impl.class ));
   }

   public tincc2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TInCC2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Código", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCFch_Internalname, localUtil.format(A4033CCFch, "99/99/99"), localUtil.format( A4033CCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Disparador", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcDisp_Internalname, GXutil.rtrim( A4405CcDisp), GXutil.rtrim( localUtil.format( A4405CcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcDisp_Jsonclick, 0, "", "", "", "", "", 1, edtCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Obs", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCcObs_Internalname, A3281CcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtCcObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Fase", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Descripción del Test", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncAnh_Enabled!=0) ? localUtil.format( A1224BarEncAnh, "999.99") : localUtil.format( A1224BarEncAnh, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncAnh_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEncCom_Enabled!=0) ? localUtil.format( A1223BarEncCom, "999.99") : localUtil.format( A1223BarEncCom, "999.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCom_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarRdoA_Enabled!=0) ? localUtil.format( A1911BarRdoA, "ZZ9.99") : localUtil.format( A1911BarRdoA, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRdoA_Jsonclick, 0, "", "", "", "", "", 1, edtBarRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ancho Acabado 1", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca1_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ancho Acabado 2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca2_Jsonclick, 0, "", "", "", "", "", 1, edtBarAncAca2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "MaqCodBis", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodBis_Internalname, GXutil.rtrim( A603MaqCodBis), GXutil.rtrim( localUtil.format( A603MaqCodBis, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodBis_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodBis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Descripción Serie", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Codigo Tipo Articulo", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarItem5_Internalname, GXutil.rtrim( A9789BarItem5), GXutil.rtrim( localUtil.format( A9789BarItem5, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarItem5_Jsonclick, 0, "", "", "", "", "", 1, edtBarItem5_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Caderno encargos", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAcaAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaAnh_Jsonclick, 0, "", "", "", "", "", 1, edtBarAcaAnh_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\TInCC2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol195( ) ;
      nGXsfl_195_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount620 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_620 = (short)(1) ;
            scanStartT6620( ) ;
            while ( RcdFound620 != 0 )
            {
               init_level_properties620( ) ;
               getByPrimaryKeyT6620( ) ;
               addRowT6620( ) ;
               scanNextT6620( ) ;
            }
            scanEndT6620( ) ;
            nBlankRcdCount620 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalT6620( ) ;
         standaloneModalT6620( ) ;
         sMode620 = Gx_mode ;
         while ( nGXsfl_195_idx < nRC_GXsfl_195 )
         {
            bGXsfl_195_Refreshing = true ;
            readRowT6620( ) ;
            edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCMetodo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCMETODO_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCMetodo_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            edtCCEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCESPECIF_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCEspecif_Enabled), 5, 0), !bGXsfl_195_Refreshing);
            if ( ( nRcdExists_620 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalT6620( ) ;
            }
            sendRowT6620( ) ;
            bGXsfl_195_Refreshing = false ;
         }
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount620 = (short)(5) ;
         nRcdExists_620 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartT6620( ) ;
            while ( RcdFound620 != 0 )
            {
               sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_195620( ) ;
               init_level_properties620( ) ;
               standaloneNotModalT6620( ) ;
               getByPrimaryKeyT6620( ) ;
               standaloneModalT6620( ) ;
               addRowT6620( ) ;
               scanNextT6620( ) ;
            }
            scanEndT6620( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode620 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_195620( ) ;
      initAllT6620( ) ;
      init_level_properties620( ) ;
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
      nBlankRcdCount620 = (short)(nBlankRcdUsr620+nBlankRcdCount620) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount620 > 0 )
      {
         standaloneNotModalT6620( ) ;
         standaloneModalT6620( ) ;
         addRowT6620( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCCTLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount620 = (short)(nBlankRcdCount620-1) ;
      }
      Gx_mode = sMode620 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\TInCC2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\TInCC2.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
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
         Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4032CCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4033CCFch = localUtil.ctod( httpContext.cgiGet( "Z4033CCFch"), 0) ;
         Z4405CcDisp = httpContext.cgiGet( "Z4405CcDisp") ;
         Z3281CcObs = httpContext.cgiGet( "Z3281CcObs") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_195 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_195"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOPECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCOpeCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4032CCOpeCod = 0 ;
            n4032CCOpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         }
         else
         {
            A4032CCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4032CCOpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtCCFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CCFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCCFch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4033CCFch = GXutil.nullDate() ;
            n4033CCFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         }
         else
         {
            A4033CCFch = localUtil.ctod( httpContext.cgiGet( edtCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4033CCFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         }
         A4405CcDisp = httpContext.cgiGet( edtCcDisp_Internalname) ;
         n4405CcDisp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = httpContext.cgiGet( edtCcObs_Internalname) ;
         n3281CcObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = localUtil.ctond( httpContext.cgiGet( edtBarEncAnh_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = localUtil.ctond( httpContext.cgiGet( edtBarEncCom_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = localUtil.ctond( httpContext.cgiGet( edtBarRdoA_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n217BarTipArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A9789BarItem5 = httpContext.cgiGet( edtBarItem5_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
         A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
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
            A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
            initAllT6619( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_620_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_620_Enabled), 5, 0), !bGXsfl_195_Refreshing);
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
      disableAttributesT6619( ) ;
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

   public void confirm_T60( )
   {
      beforeValidateT6619( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsT6619( ) ;
         }
         else
         {
            checkExtendedTableT6619( ) ;
            if ( AnyError == 0 )
            {
               zmT6619( 3) ;
               zmT6619( 4) ;
               zmT6619( 5) ;
               zmT6619( 6) ;
               zmT6619( 7) ;
               zmT6619( 8) ;
               zmT6619( 9) ;
            }
            closeExtendedTableCursorsT6619( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode619 = Gx_mode ;
         confirm_T6620( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode619 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesT60( ) ;
      }
   }

   public void confirm_T6620( )
   {
      nGXsfl_195_idx = 0 ;
      while ( nGXsfl_195_idx < nRC_GXsfl_195 )
      {
         readRowT6620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            getKeyT6620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               if ( RcdFound620 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateT6620( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableT6620( ) ;
                     if ( AnyError == 0 )
                     {
                        zmT6620( 11) ;
                     }
                     closeExtendedTableCursorsT6620( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( nRcdDeleted_620 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyT6620( ) ;
                     loadT6620( ) ;
                     beforeValidateT6620( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsT6620( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateT6620( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableT6620( ) ;
                           if ( AnyError == 0 )
                           {
                              zmT6620( 11) ;
                           }
                           closeExtendedTableCursorsT6620( ) ;
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
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( edtCCMetodo_Internalname, GXutil.rtrim( A13251CCMetodo)) ;
         httpContext.changePostValue( edtCCEspecif_Internalname, GXutil.rtrim( A13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_195_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_195_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_195_idx, GXutil.rtrim( Z13251CCMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_195_idx, GXutil.rtrim( Z13252CCEspecif)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCMETODO_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCESPECIF_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionT60( )
   {
   }

   public void zmT6619( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4032CCOpeCod = T00T66_A4032CCOpeCod[0] ;
            Z4033CCFch = T00T66_A4033CCFch[0] ;
            Z4405CcDisp = T00T66_A4405CcDisp[0] ;
            Z3281CcObs = T00T66_A3281CcObs[0] ;
         }
         else
         {
            Z4032CCOpeCod = A4032CCOpeCod ;
            Z4033CCFch = A4033CCFch ;
            Z4405CcDisp = A4405CcDisp ;
            Z3281CcObs = A3281CcObs ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4032CCOpeCod = A4032CCOpeCod ;
         Z4033CCFch = A4033CCFch ;
         Z4405CcDisp = A4405CcDisp ;
         Z3281CcObs = A3281CcObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z3137BarGraAca2 = A3137BarGraAca2 ;
         Z1224BarEncAnh = A1224BarEncAnh ;
         Z1223BarEncCom = A1223BarEncCom ;
         Z1911BarRdoA = A1911BarRdoA ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z126BarAncAca2 = A126BarAncAca2 ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z9789BarItem5 = A9789BarItem5 ;
         Z4466BarAcaAnh = A4466BarAcaAnh ;
         Z252CliCod = A252CliCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z279CliNom = A279CliNom ;
         Z759ProDsc = A759ProDsc ;
         Z457FasCod = A457FasCod ;
         Z603MaqCodBis = A603MaqCodBis ;
         Z460FasDsc = A460FasDsc ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00T67 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T67_A407EmprNom[0] ;
      n407EmprNom = T00T67_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00T68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1909BarGraAca = T00T68_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T00T68_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T00T68_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T00T68_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T00T68_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T00T68_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T00T68_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A212BarSer = T00T68_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T00T68_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T00T68_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T00T68_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T00T68_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A4812BarEncCli = T00T68_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A9789BarItem5 = T00T68_A9789BarItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
      A4466BarAcaAnh = T00T68_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T00T68_A252CliCod[0] ;
      n252CliCod = T00T68_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T00T68_A217BarTipArt[0] ;
      n217BarTipArt = T00T68_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      pr_default.close(6);
      /* Using cursor T00T613 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T00T613_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(11);
      /* Using cursor T00T69 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00T69_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
      /* Using cursor T00T610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T00T610_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = T00T610_A603MaqCodBis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      pr_default.close(8);
      /* Using cursor T00T612 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00T612_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(10);
      /* Using cursor T00T611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T00T611_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(9);
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

   public void loadT6619( )
   {
      /* Using cursor T00T614 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound619 = (short)(1) ;
         A407EmprNom = T00T614_A407EmprNom[0] ;
         n407EmprNom = T00T614_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4032CCOpeCod = T00T614_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T00T614_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T00T614_A4033CCFch[0] ;
         n4033CCFch = T00T614_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T00T614_A4405CcDisp[0] ;
         n4405CcDisp = T00T614_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T00T614_A3281CcObs[0] ;
         n3281CcObs = T00T614_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         A460FasDsc = T00T614_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A759ProDsc = T00T614_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4036CCTDsc = T00T614_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A1909BarGraAca = T00T614_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A3137BarGraAca2 = T00T614_A3137BarGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
         A1224BarEncAnh = T00T614_A1224BarEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
         A1223BarEncCom = T00T614_A1223BarEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
         A1911BarRdoA = T00T614_A1911BarRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
         A125BarAncAca1 = T00T614_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A126BarAncAca2 = T00T614_A126BarAncAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
         A212BarSer = T00T614_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T00T614_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T00T614_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T00T614_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T00T614_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A4812BarEncCli = T00T614_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A279CliNom = T00T614_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A9789BarItem5 = T00T614_A9789BarItem5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
         A4466BarAcaAnh = T00T614_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A457FasCod = T00T614_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A603MaqCodBis = T00T614_A603MaqCodBis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         A252CliCod = T00T614_A252CliCod[0] ;
         n252CliCod = T00T614_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T00T614_A217BarTipArt[0] ;
         n217BarTipArt = T00T614_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         zmT6619( -2) ;
      }
      pr_default.close(12);
      onLoadActionsT6619( ) ;
   }

   public void onLoadActionsT6619( )
   {
   }

   public void checkExtendedTableT6619( )
   {
      nIsDirty_619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsT6619( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyT6619( )
   {
      /* Using cursor T00T615 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      else
      {
         RcdFound619 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00T66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00T66_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T66_A129BarCod[0] == A129BarCod ) && ( T00T66_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T66_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00T66_A758ProCod[0], A758ProCod) == 0 ) && ( T00T66_A194BarOrdLin[0] == A194BarOrdLin ) && ( T00T66_A4031CCTCod[0] == A4031CCTCod ) )
      {
         zmT6619( 2) ;
         RcdFound619 = (short)(1) ;
         A4032CCOpeCod = T00T66_A4032CCOpeCod[0] ;
         n4032CCOpeCod = T00T66_n4032CCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
         A4033CCFch = T00T66_A4033CCFch[0] ;
         n4033CCFch = T00T66_n4033CCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
         A4405CcDisp = T00T66_A4405CcDisp[0] ;
         n4405CcDisp = T00T66_n4405CcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
         A3281CcObs = T00T66_A3281CcObs[0] ;
         n3281CcObs = T00T66_n3281CcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadT6619( ) ;
         if ( AnyError == 1 )
         {
            RcdFound619 = (short)(0) ;
            initializeNonKeyT6619( ) ;
         }
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound619 = (short)(0) ;
         initializeNonKeyT6619( ) ;
         sMode619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyT6619( ) ;
      if ( RcdFound619 == 0 )
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
      RcdFound619 = (short)(0) ;
      /* Using cursor T00T616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T00T616_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T616_A129BarCod[0] == A129BarCod ) && ( T00T616_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T616_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00T616_A758ProCod[0], A758ProCod) == 0 ) && ( T00T616_A194BarOrdLin[0] == A194BarOrdLin ) && ( T00T616_A4031CCTCod[0] == A4031CCTCod ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T00T616_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T616_A129BarCod[0] == A129BarCod ) && ( T00T616_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T616_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00T616_A758ProCod[0], A758ProCod) == 0 ) && ( T00T616_A194BarOrdLin[0] == A194BarOrdLin ) && ( T00T616_A4031CCTCod[0] == A4031CCTCod ) )
         {
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound619 = (short)(0) ;
      /* Using cursor T00T617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T617_A129BarCod[0] == A129BarCod ) && ( T00T617_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T617_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00T617_A758ProCod[0], A758ProCod) == 0 ) && ( T00T617_A194BarOrdLin[0] == A194BarOrdLin ) && ( T00T617_A4031CCTCod[0] == A4031CCTCod ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00T617_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T617_A129BarCod[0] == A129BarCod ) && ( T00T617_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T617_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00T617_A758ProCod[0], A758ProCod) == 0 ) && ( T00T617_A194BarOrdLin[0] == A194BarOrdLin ) && ( T00T617_A4031CCTCod[0] == A4031CCTCod ) )
         {
            RcdFound619 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyT6619( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertT6619( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound619 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateT6619( ) ;
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertT6619( ) ;
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
                  GX_FocusControl = edtCCOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertT6619( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
         GX_FocusControl = edtCCOpeCod_Internalname ;
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
      getKeyT6619( ) ;
      if ( RcdFound619 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) || ( A4031CCTCod != Z4031CCTCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tincc2");
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_T60( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartT6619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndT6619( ) ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
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
      scanStartT6619( ) ;
      if ( RcdFound619 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound619 != 0 )
         {
            scanNextT6619( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndT6619( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyT6619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z4032CCOpeCod != T00T65_A4032CCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T00T65_A4033CCFch[0])) ) || ( GXutil.strcmp(Z4405CcDisp, T00T65_A4405CcDisp[0]) != 0 ) || ( GXutil.strcmp(Z3281CcObs, T00T65_A3281CcObs[0]) != 0 ) )
         {
            if ( Z4032CCOpeCod != T00T65_A4032CCOpeCod[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCOpeCod");
               GXutil.writeLogRaw("Old: ",Z4032CCOpeCod);
               GXutil.writeLogRaw("Current: ",T00T65_A4032CCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4033CCFch), GXutil.resetTime(T00T65_A4033CCFch[0])) ) )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCFch");
               GXutil.writeLogRaw("Old: ",Z4033CCFch);
               GXutil.writeLogRaw("Current: ",T00T65_A4033CCFch[0]);
            }
            if ( GXutil.strcmp(Z4405CcDisp, T00T65_A4405CcDisp[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CcDisp");
               GXutil.writeLogRaw("Old: ",Z4405CcDisp);
               GXutil.writeLogRaw("Current: ",T00T65_A4405CcDisp[0]);
            }
            if ( GXutil.strcmp(Z3281CcObs, T00T65_A3281CcObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CcObs");
               GXutil.writeLogRaw("Old: ",Z3281CcObs);
               GXutil.writeLogRaw("Current: ",T00T65_A3281CcObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT6619( )
   {
      beforeValidateT6619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT6619( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT6619( 0) ;
         checkOptimisticConcurrencyT6619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT6619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT6619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T618 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(16) == 1) )
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
                        processLevelT6619( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionT60( ) ;
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
            loadT6619( ) ;
         }
         endLevelT6619( ) ;
      }
      closeExtendedTableCursorsT6619( ) ;
   }

   public void updateT6619( )
   {
      beforeValidateT6619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT6619( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT6619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT6619( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateT6619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T619 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n3281CcObs), A3281CcObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateT6619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelT6619( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionT60( ) ;
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
         endLevelT6619( ) ;
      }
      closeExtendedTableCursorsT6619( ) ;
   }

   public void deferredUpdateT6619( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT6619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT6619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT6619( ) ;
         afterConfirmT6619( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT6619( ) ;
            if ( AnyError == 0 )
            {
               scanStartT6620( ) ;
               while ( RcdFound620 != 0 )
               {
                  getByPrimaryKeyT6620( ) ;
                  deleteT6620( ) ;
                  scanNextT6620( ) ;
               }
               scanEndT6620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T620 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound619 == 0 )
                        {
                           initAllT6619( ) ;
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
                        resetCaptionT60( ) ;
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
      sMode619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT6619( ) ;
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT6619( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00T621 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Nveces Test", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevelT6620( )
   {
      nGXsfl_195_idx = 0 ;
      while ( nGXsfl_195_idx < nRC_GXsfl_195 )
      {
         readRowT6620( ) ;
         if ( ( nRcdExists_620 != 0 ) || ( nIsMod_620 != 0 ) )
         {
            standaloneNotModalT6620( ) ;
            getKeyT6620( ) ;
            if ( ( nRcdExists_620 == 0 ) && ( nRcdDeleted_620 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertT6620( ) ;
            }
            else
            {
               if ( RcdFound620 != 0 )
               {
                  if ( ( nRcdDeleted_620 != 0 ) && ( nRcdExists_620 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteT6620( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_620 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateT6620( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_620 == 0 )
                  {
                     GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_620_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTLinDsc_Internalname, GXutil.rtrim( A4043CCTLinDsc)) ;
         httpContext.changePostValue( edtCCVal_Internalname, GXutil.rtrim( A4035CCVal)) ;
         httpContext.changePostValue( edtCCTValD_Internalname, A5627CCTValD) ;
         httpContext.changePostValue( edtCCOkLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCOkDsc_Internalname, A12751CCOkDsc) ;
         httpContext.changePostValue( edtCCMetodo_Internalname, GXutil.rtrim( A13251CCMetodo)) ;
         httpContext.changePostValue( edtCCEspecif_Internalname, GXutil.rtrim( A13252CCEspecif)) ;
         httpContext.changePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_195_idx, GXutil.rtrim( Z4035CCVal)) ;
         httpContext.changePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_195_idx, Z12751CCOkDsc) ;
         httpContext.changePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_195_idx, GXutil.rtrim( Z13251CCMetodo)) ;
         httpContext.changePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_195_idx, GXutil.rtrim( Z13252CCEspecif)) ;
         httpContext.changePostValue( "nRcdDeleted_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_620_"+sGXsfl_195_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_620 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_620_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTLINDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCVAL_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTVALD_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCOKDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCMETODO_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCESPECIF_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllT6620( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_620 = (short)(0) ;
      nIsMod_620 = (short)(0) ;
      nRcdDeleted_620 = (short)(0) ;
   }

   public void processLevelT6619( )
   {
      /* Save parent mode. */
      sMode619 = Gx_mode ;
      processNestedLevelT6620( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelT6619( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteT6619( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tincc2");
         if ( AnyError == 0 )
         {
            confirmValuesT60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.tincc2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartT6619( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      this.A758ProCod = A758ProCod ;
      this.A194BarOrdLin = A194BarOrdLin ;
      this.A4031CCTCod = A4031CCTCod ;
      /* Scan By routine */
      /* Using cursor T00T622 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT6619( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound619 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound619 = (short)(1) ;
      }
   }

   public void scanEndT6619( )
   {
      pr_default.close(20);
   }

   public void afterConfirmT6619( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT6619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT6619( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT6619( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT6619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT6619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT6619( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
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
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOpeCod_Enabled), 5, 0), true);
      edtCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCFch_Enabled), 5, 0), true);
      edtCcDisp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcDisp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcDisp_Enabled), 5, 0), true);
      edtCcObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcObs_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      edtBarGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca2_Enabled), 5, 0), true);
      edtBarEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncAnh_Enabled), 5, 0), true);
      edtBarEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCom_Enabled), 5, 0), true);
      edtBarRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdoA_Enabled), 5, 0), true);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarAncAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca2_Enabled), 5, 0), true);
      edtMaqCodBis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodBis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodBis_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarItem5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarItem5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarItem5_Enabled), 5, 0), true);
      edtBarAcaAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), true);
   }

   public void zmT6620( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4035CCVal = T00T63_A4035CCVal[0] ;
            Z12750CCOkLin = T00T63_A12750CCOkLin[0] ;
            Z12751CCOkDsc = T00T63_A12751CCOkDsc[0] ;
            Z13251CCMetodo = T00T63_A13251CCMetodo[0] ;
            Z13252CCEspecif = T00T63_A13252CCEspecif[0] ;
         }
         else
         {
            Z4035CCVal = A4035CCVal ;
            Z12750CCOkLin = A12750CCOkLin ;
            Z12751CCOkDsc = A12751CCOkDsc ;
            Z13251CCMetodo = A13251CCMetodo ;
            Z13252CCEspecif = A13252CCEspecif ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4035CCVal = A4035CCVal ;
         Z12750CCOkLin = A12750CCOkLin ;
         Z12751CCOkDsc = A12751CCOkDsc ;
         Z13251CCMetodo = A13251CCMetodo ;
         Z13252CCEspecif = A13252CCEspecif ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         Z758ProCod = A758ProCod ;
         Z4043CCTLinDsc = A4043CCTLinDsc ;
      }
   }

   public void standaloneNotModalT6620( )
   {
   }

   public void standaloneModalT6620( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      }
      else
      {
         edtCCTLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      }
   }

   public void loadT6620( )
   {
      /* Using cursor T00T623 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4043CCTLinDsc = T00T623_A4043CCTLinDsc[0] ;
         A4035CCVal = T00T623_A4035CCVal[0] ;
         A12750CCOkLin = T00T623_A12750CCOkLin[0] ;
         A12751CCOkDsc = T00T623_A12751CCOkDsc[0] ;
         A13251CCMetodo = T00T623_A13251CCMetodo[0] ;
         A13252CCEspecif = T00T623_A13252CCEspecif[0] ;
         zmT6620( -10) ;
      }
      pr_default.close(21);
      onLoadActionsT6620( ) ;
   }

   public void onLoadActionsT6620( )
   {
      GXt_char1 = A5627CCTValD ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A4031CCTCod ;
      GXv_int4[0] = A4034CCTLin ;
      GXv_char5[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5) ;
      tincc2_impl.this.A396EmprCod = GXv_char2[0] ;
      tincc2_impl.this.A4031CCTCod = GXv_int3[0] ;
      tincc2_impl.this.A4034CCTLin = GXv_int4[0] ;
      tincc2_impl.this.GXt_char1 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
   }

   public void checkExtendedTableT6620( )
   {
      nIsDirty_620 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalT6620( ) ;
      /* Using cursor T00T64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T00T64_A4043CCTLinDsc[0] ;
      pr_default.close(2);
      nIsDirty_620 = (short)(1) ;
      GXt_char1 = A5627CCTValD ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A4031CCTCod ;
      GXv_int4[0] = A4034CCTLin ;
      GXv_char2[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2) ;
      tincc2_impl.this.A396EmprCod = GXv_char5[0] ;
      tincc2_impl.this.A4031CCTCod = GXv_int3[0] ;
      tincc2_impl.this.A4034CCTLin = GXv_int4[0] ;
      tincc2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
   }

   public void closeExtendedTableCursorsT6620( )
   {
      pr_default.close(2);
   }

   public void enableDisableT6620( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          int A4031CCTCod ,
                          short A4034CCTLin )
   {
      /* Using cursor T00T624 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4043CCTLinDsc = T00T624_A4043CCTLinDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4043CCTLinDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKeyT6620( )
   {
      /* Using cursor T00T625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound620 = (short)(1) ;
      }
      else
      {
         RcdFound620 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKeyT6620( )
   {
      /* Using cursor T00T63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00T63_A129BarCod[0] == A129BarCod ) && ( T00T63_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00T63_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00T63_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00T63_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T63_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T00T63_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zmT6620( 10) ;
         RcdFound620 = (short)(1) ;
         initializeNonKeyT6620( ) ;
         A4035CCVal = T00T63_A4035CCVal[0] ;
         A12750CCOkLin = T00T63_A12750CCOkLin[0] ;
         A12751CCOkDsc = T00T63_A12751CCOkDsc[0] ;
         A13251CCMetodo = T00T63_A13251CCMetodo[0] ;
         A13252CCEspecif = T00T63_A13252CCEspecif[0] ;
         A4034CCTLin = T00T63_A4034CCTLin[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z4031CCTCod = A4031CCTCod ;
         Z4034CCTLin = A4034CCTLin ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT6620( ) ;
         loadT6620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound620 = (short)(0) ;
         initializeNonKeyT6620( ) ;
         sMode620 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT6620( ) ;
         Gx_mode = sMode620 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesT6620( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyT6620( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4035CCVal, T00T62_A4035CCVal[0]) != 0 ) || ( Z12750CCOkLin != T00T62_A12750CCOkLin[0] ) || ( GXutil.strcmp(Z12751CCOkDsc, T00T62_A12751CCOkDsc[0]) != 0 ) || ( GXutil.strcmp(Z13251CCMetodo, T00T62_A13251CCMetodo[0]) != 0 ) || ( GXutil.strcmp(Z13252CCEspecif, T00T62_A13252CCEspecif[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4035CCVal, T00T62_A4035CCVal[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCVal");
               GXutil.writeLogRaw("Old: ",Z4035CCVal);
               GXutil.writeLogRaw("Current: ",T00T62_A4035CCVal[0]);
            }
            if ( Z12750CCOkLin != T00T62_A12750CCOkLin[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCOkLin");
               GXutil.writeLogRaw("Old: ",Z12750CCOkLin);
               GXutil.writeLogRaw("Current: ",T00T62_A12750CCOkLin[0]);
            }
            if ( GXutil.strcmp(Z12751CCOkDsc, T00T62_A12751CCOkDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCOkDsc");
               GXutil.writeLogRaw("Old: ",Z12751CCOkDsc);
               GXutil.writeLogRaw("Current: ",T00T62_A12751CCOkDsc[0]);
            }
            if ( GXutil.strcmp(Z13251CCMetodo, T00T62_A13251CCMetodo[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCMetodo");
               GXutil.writeLogRaw("Old: ",Z13251CCMetodo);
               GXutil.writeLogRaw("Current: ",T00T62_A13251CCMetodo[0]);
            }
            if ( GXutil.strcmp(Z13252CCEspecif, T00T62_A13252CCEspecif[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.tincc2:[seudo value changed for attri]"+"CCEspecif");
               GXutil.writeLogRaw("Old: ",Z13252CCEspecif);
               GXutil.writeLogRaw("Current: ",T00T62_A13252CCEspecif[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCC1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT6620( )
   {
      beforeValidateT6620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT6620( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT6620( 0) ;
         checkOptimisticConcurrencyT6620( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT6620( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT6620( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T626 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                  if ( (pr_default.getStatus(24) == 1) )
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
            loadT6620( ) ;
         }
         endLevelT6620( ) ;
      }
      closeExtendedTableCursorsT6620( ) ;
   }

   public void updateT6620( )
   {
      beforeValidateT6620( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT6620( ) ;
      }
      if ( ( nIsMod_620 != 0 ) || ( nIsDirty_620 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyT6620( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmT6620( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateT6620( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00T627 */
                     pr_default.execute(25, new Object[] {A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCC1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateT6620( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyT6620( ) ;
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
            endLevelT6620( ) ;
         }
      }
      closeExtendedTableCursorsT6620( ) ;
   }

   public void deferredUpdateT6620( )
   {
   }

   public void deleteT6620( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT6620( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT6620( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT6620( ) ;
         afterConfirmT6620( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT6620( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00T628 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
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
      sMode620 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT6620( ) ;
      Gx_mode = sMode620 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT6620( )
   {
      standaloneModalT6620( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00T629 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         A4043CCTLinDsc = T00T629_A4043CCTLinDsc[0] ;
         pr_default.close(27);
         GXt_char1 = A5627CCTValD ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A4031CCTCod ;
         GXv_int4[0] = A4034CCTLin ;
         GXv_char2[0] = GXt_char1 ;
         new app.pccdef2(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2) ;
         tincc2_impl.this.A396EmprCod = GXv_char5[0] ;
         tincc2_impl.this.A4031CCTCod = GXv_int3[0] ;
         tincc2_impl.this.A4034CCTLin = GXv_int4[0] ;
         tincc2_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A5627CCTValD = GXt_char1 ;
      }
   }

   public void endLevelT6620( )
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

   public void scanStartT6620( )
   {
      /* Scan By routine */
      /* Using cursor T00T630 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T00T630_A4034CCTLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT6620( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound620 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound620 = (short)(1) ;
         A4034CCTLin = T00T630_A4034CCTLin[0] ;
      }
   }

   public void scanEndT6620( )
   {
      pr_default.close(28);
   }

   public void afterConfirmT6620( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT6620( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT6620( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT6620( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT6620( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT6620( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT6620( )
   {
      edtCCTLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCTLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLinDsc_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCVal_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCTValD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTValD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTValD_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCOkLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCOkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCOkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCOkDsc_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCMetodo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCMetodo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCMetodo_Enabled), 5, 0), !bGXsfl_195_Refreshing);
      edtCCEspecif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCEspecif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCEspecif_Enabled), 5, 0), !bGXsfl_195_Refreshing);
   }

   public void send_integrity_lvl_hashesT6620( )
   {
   }

   public void send_integrity_lvl_hashesT6619( )
   {
   }

   public void subsflControlProps_195620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_195_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_195_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_195_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_195_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_195_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_195_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_195_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_195_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_195_idx ;
   }

   public void subsflControlProps_fel_195620( )
   {
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620_"+sGXsfl_195_fel_idx ;
      edtCCTLin_Internalname = "CCTLIN_"+sGXsfl_195_fel_idx ;
      edtCCTLinDsc_Internalname = "CCTLINDSC_"+sGXsfl_195_fel_idx ;
      edtCCVal_Internalname = "CCVAL_"+sGXsfl_195_fel_idx ;
      edtCCTValD_Internalname = "CCTVALD_"+sGXsfl_195_fel_idx ;
      edtCCOkLin_Internalname = "CCOKLIN_"+sGXsfl_195_fel_idx ;
      edtCCOkDsc_Internalname = "CCOKDSC_"+sGXsfl_195_fel_idx ;
      edtCCMetodo_Internalname = "CCMETODO_"+sGXsfl_195_fel_idx ;
      edtCCEspecif_Internalname = "CCESPECIF_"+sGXsfl_195_fel_idx ;
   }

   public void addRowT6620( )
   {
      nGXsfl_195_idx = (int)(nGXsfl_195_idx+1) ;
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_195620( ) ;
      sendRowT6620( ) ;
   }

   public void sendRowT6620( )
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
         if ( ((int)((nGXsfl_195_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 196,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_620_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_620_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_620), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_620_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_620_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,197);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTLinDsc_Internalname,GXutil.rtrim( A4043CCTLinDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTLinDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTLinDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 199,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCVal_Internalname,GXutil.rtrim( A4035CCVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTValD_Internalname,A5627CCTValD,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTValD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTValD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 201,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCCOkLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A12750CCOkLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCOkLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCOkDsc_Internalname,A12751CCOkDsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,202);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCOkDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCOkDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 203,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCMetodo_Internalname,GXutil.rtrim( A13251CCMetodo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,203);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCMetodo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCMetodo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_620_" + sGXsfl_195_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_195_idx + "',195)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCEspecif_Internalname,GXutil.rtrim( A13252CCEspecif),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCEspecif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCEspecif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(195),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesT6620( ) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4034CCTLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4035CCVal_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4035CCVal));
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12750CCOkLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z12751CCOkDsc);
      GXCCtl = "Z13251CCMetodo_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13251CCMetodo));
      GXCCtl = "Z13252CCEspecif_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13252CCEspecif));
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_620_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_620_" + sGXsfl_195_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_620, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_620_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTLINDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCVAL_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTVALD_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKLIN_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCOKDSC_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCMETODO_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCESPECIF_"+sGXsfl_195_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowT6620( )
   {
      nGXsfl_195_idx = (int)(nGXsfl_195_idx+1) ;
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_195620( ) ;
      edtavnRcdDeleted_620_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_620_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLIN_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTLinDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTLINDSC_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCVAL_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTValD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTVALD_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKLIN_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCOkDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCOKDSC_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCMetodo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCMETODO_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCEspecif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCESPECIF_"+sGXsfl_195_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_620");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_620_Internalname ;
         wbErr = true ;
         nRcdDeleted_620 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_620_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CCTLIN_" + sGXsfl_195_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
         wbErr = true ;
         A4034CCTLin = (short)(0) ;
      }
      else
      {
         A4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4043CCTLinDsc = httpContext.cgiGet( edtCCTLinDsc_Internalname) ;
      A4035CCVal = httpContext.cgiGet( edtCCVal_Internalname) ;
      A5627CCTValD = httpContext.cgiGet( edtCCTValD_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "CCOKLIN_" + sGXsfl_195_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCOkLin_Internalname ;
         wbErr = true ;
         A12750CCOkLin = (byte)(0) ;
      }
      else
      {
         A12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCOkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12751CCOkDsc = httpContext.cgiGet( edtCCOkDsc_Internalname) ;
      A13251CCMetodo = httpContext.cgiGet( edtCCMetodo_Internalname) ;
      A13252CCEspecif = httpContext.cgiGet( edtCCEspecif_Internalname) ;
      GXCCtl = "Z4034CCTLin_" + sGXsfl_195_idx ;
      Z4034CCTLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4035CCVal_" + sGXsfl_195_idx ;
      Z4035CCVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12750CCOkLin_" + sGXsfl_195_idx ;
      Z12750CCOkLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12751CCOkDsc_" + sGXsfl_195_idx ;
      Z12751CCOkDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13251CCMetodo_" + sGXsfl_195_idx ;
      Z13251CCMetodo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13252CCEspecif_" + sGXsfl_195_idx ;
      Z13252CCEspecif = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_620_" + sGXsfl_195_idx ;
      nRcdDeleted_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_620_" + sGXsfl_195_idx ;
      nRcdExists_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_620_" + sGXsfl_195_idx ;
      nIsMod_620 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTLin_Enabled = edtCCTLin_Enabled ;
   }

   public void confirmValuesT60( )
   {
      nGXsfl_195_idx = 0 ;
      sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_195620( ) ;
      while ( nGXsfl_195_idx < nRC_GXsfl_195 )
      {
         nGXsfl_195_idx = (int)(nGXsfl_195_idx+1) ;
         sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_195620( ) ;
         httpContext.changePostValue( "Z4034CCTLin_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z4034CCTLin_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4034CCTLin_"+sGXsfl_195_idx) ;
         httpContext.changePostValue( "Z4035CCVal_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z4035CCVal_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4035CCVal_"+sGXsfl_195_idx) ;
         httpContext.changePostValue( "Z12750CCOkLin_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z12750CCOkLin_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12750CCOkLin_"+sGXsfl_195_idx) ;
         httpContext.changePostValue( "Z12751CCOkDsc_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12751CCOkDsc_"+sGXsfl_195_idx) ;
         httpContext.changePostValue( "Z13251CCMetodo_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z13251CCMetodo_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13251CCMetodo_"+sGXsfl_195_idx) ;
         httpContext.changePostValue( "Z13252CCEspecif_"+sGXsfl_195_idx, httpContext.cgiGet( "ZT_"+"Z13252CCEspecif_"+sGXsfl_195_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13252CCEspecif_"+sGXsfl_195_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.tincc2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.dtoc( Z4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_195", GXutil.ltrim( localUtil.ntoc( nGXsfl_195_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.controlcalidadhtd.tincc2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","CCTCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.TInCC2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "IN CC CON COMMIT", "") ;
   }

   public void initializeNonKeyT6619( )
   {
      A4032CCOpeCod = 0 ;
      n4032CCOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4032CCOpeCod), 6, 0));
      A4033CCFch = GXutil.nullDate() ;
      n4033CCFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      A4405CcDisp = "" ;
      n4405CcDisp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", A4405CcDisp);
      A3281CcObs = "" ;
      n3281CcObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      Z4032CCOpeCod = 0 ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
   }

   public void initAllT6619( )
   {
      initializeNonKeyT6619( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyT6620( )
   {
      A5627CCTValD = "" ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      A12750CCOkLin = (byte)(0) ;
      A12751CCOkDsc = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      Z4035CCVal = "" ;
      Z12750CCOkLin = (byte)(0) ;
      Z12751CCOkDsc = "" ;
      Z13251CCMetodo = "" ;
      Z13252CCEspecif = "" ;
   }

   public void initAllT6620( )
   {
      A4034CCTLin = (short)(0) ;
      initializeNonKeyT6620( ) ;
   }

   public void standaloneModalInsertT6620( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525778", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/tincc2.js", "?20268241525779", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties620( )
   {
      edtCCTLin_Enabled = defedtCCTLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTLin_Enabled), 5, 0), !bGXsfl_195_Refreshing);
   }

   public void startgridcontrol195( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_620, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_620_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4034CCTLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4043CCTLinDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTLinDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4035CCVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A5627CCTValD);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTValD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12750CCOkLin, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A12751CCOkDsc);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCOkDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13251CCMetodo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCMetodo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13252CCEspecif));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCEspecif_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProCod_Internalname = "PROCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCCOpeCod_Internalname = "CCOPECOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCCFch_Internalname = "CCFCH" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCcDisp_Internalname = "CCDISP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCcObs_Internalname = "CCOBS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarGraAca2_Internalname = "BARGRAACA2" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarEncAnh_Internalname = "BARENCANH" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarEncCom_Internalname = "BARENCCOM" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarRdoA_Internalname = "BARRDOA" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarAncAca2_Internalname = "BARANCACA2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBarItem5_Internalname = "BARITEM5" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtBarAcaAnh_Internalname = "BARACAANH" ;
      edtavnRcdDeleted_620_Internalname = "vNRCDDELETED_620" ;
      edtCCTLin_Internalname = "CCTLIN" ;
      edtCCTLinDsc_Internalname = "CCTLINDSC" ;
      edtCCVal_Internalname = "CCVAL" ;
      edtCCTValD_Internalname = "CCTVALD" ;
      edtCCOkLin_Internalname = "CCOKLIN" ;
      edtCCOkDsc_Internalname = "CCOKDSC" ;
      edtCCMetodo_Internalname = "CCMETODO" ;
      edtCCEspecif_Internalname = "CCESPECIF" ;
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
      Form.setCaption( httpContext.getMessage( "IN CC CON COMMIT", "") );
      edtCCEspecif_Jsonclick = "" ;
      edtCCMetodo_Jsonclick = "" ;
      edtCCOkDsc_Jsonclick = "" ;
      edtCCOkLin_Jsonclick = "" ;
      edtCCTValD_Jsonclick = "" ;
      edtCCVal_Jsonclick = "" ;
      edtCCTLinDsc_Jsonclick = "" ;
      edtCCTLin_Jsonclick = "" ;
      edtavnRcdDeleted_620_Jsonclick = "" ;
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
      edtCCEspecif_Enabled = 1 ;
      edtCCMetodo_Enabled = 1 ;
      edtCCOkDsc_Enabled = 1 ;
      edtCCOkLin_Enabled = 1 ;
      edtCCTValD_Enabled = 0 ;
      edtCCVal_Enabled = 1 ;
      edtCCTLinDsc_Enabled = 0 ;
      edtCCTLin_Enabled = 1 ;
      edtavnRcdDeleted_620_Enabled = 1 ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarAcaAnh_Backcolor = (int)(0xFFFFFF) ;
      edtBarAcaAnh_Enabled = 0 ;
      edtBarItem5_Jsonclick = "" ;
      edtBarItem5_Backcolor = (int)(0xFFFFFF) ;
      edtBarItem5_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipArt_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCli_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtMaqCodBis_Jsonclick = "" ;
      edtMaqCodBis_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodBis_Enabled = 0 ;
      edtBarAncAca2_Jsonclick = "" ;
      edtBarAncAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca2_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAncAca1_Backcolor = (int)(0xFFFFFF) ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarRdoA_Jsonclick = "" ;
      edtBarRdoA_Backcolor = (int)(0xFFFFFF) ;
      edtBarRdoA_Enabled = 0 ;
      edtBarEncCom_Jsonclick = "" ;
      edtBarEncCom_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncCom_Enabled = 0 ;
      edtBarEncAnh_Jsonclick = "" ;
      edtBarEncAnh_Backcolor = (int)(0xFFFFFF) ;
      edtBarEncAnh_Enabled = 0 ;
      edtBarGraAca2_Jsonclick = "" ;
      edtBarGraAca2_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca2_Enabled = 0 ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarGraAca_Backcolor = (int)(0xFFFFFF) ;
      edtBarGraAca_Enabled = 0 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCTDsc_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtProDsc_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Backcolor = (int)(0xFFFFFF) ;
      edtFasCod_Enabled = 0 ;
      edtCcObs_Backcolor = (int)(0xFFFFFF) ;
      edtCcObs_Enabled = 1 ;
      edtCcDisp_Jsonclick = "" ;
      edtCcDisp_Backcolor = (int)(0xFFFFFF) ;
      edtCcDisp_Enabled = 1 ;
      edtCCFch_Jsonclick = "" ;
      edtCCFch_Backcolor = (int)(0xFFFFFF) ;
      edtCCFch_Enabled = 1 ;
      edtCCOpeCod_Jsonclick = "" ;
      edtCCOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCOpeCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCTCod_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtBarOrdLin_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Backcolor = (int)(0xFFFFFF) ;
      edtProCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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

   public void gx1asacctvaldT6620( String A396EmprCod ,
                                   int A4031CCTCod ,
                                   short A4034CCTLin )
   {
      GXt_char1 = A5627CCTValD ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A4031CCTCod ;
      GXv_int4[0] = A4034CCTLin ;
      GXv_char2[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2) ;
      tincc2_impl.this.A396EmprCod = GXv_char5[0] ;
      tincc2_impl.this.A4031CCTCod = GXv_int3[0] ;
      tincc2_impl.this.A4034CCTLin = GXv_int4[0] ;
      tincc2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A5627CCTValD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A5627CCTValD)+"\"") ;
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
      subsflControlProps_195620( ) ;
      while ( nGXsfl_195_idx <= nRC_GXsfl_195 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalT6620( ) ;
         standaloneModalT6620( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowT6620( ) ;
         nGXsfl_195_idx = (int)(nGXsfl_195_idx+1) ;
         sGXsfl_195_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_195_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_195620( ) ;
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
      /* Using cursor T00T631 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T631_A407EmprNom[0] ;
      n407EmprNom = T00T631_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(29);
      /* Using cursor T00T632 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A1909BarGraAca = T00T632_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A3137BarGraAca2 = T00T632_A3137BarGraAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3137BarGraAca2), 4, 0));
      A1224BarEncAnh = T00T632_A1224BarEncAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrimstr( A1224BarEncAnh, 6, 2));
      A1223BarEncCom = T00T632_A1223BarEncCom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrimstr( A1223BarEncCom, 6, 2));
      A1911BarRdoA = T00T632_A1911BarRdoA[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrimstr( A1911BarRdoA, 6, 2));
      A125BarAncAca1 = T00T632_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A126BarAncAca2 = T00T632_A126BarAncAca2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A126BarAncAca2), 3, 0));
      A212BarSer = T00T632_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T00T632_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T00T632_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T00T632_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T00T632_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A4812BarEncCli = T00T632_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A9789BarItem5 = T00T632_A9789BarItem5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", A9789BarItem5);
      A4466BarAcaAnh = T00T632_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T00T632_A252CliCod[0] ;
      n252CliCod = T00T632_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T00T632_A217BarTipArt[0] ;
      n217BarTipArt = T00T632_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      pr_default.close(30);
      /* Using cursor T00T633 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T00T633_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(31);
      /* Using cursor T00T634 */
      pr_default.execute(32, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00T634_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(32);
      /* Using cursor T00T635 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARORDLIN");
         AnyError = (short)(1) ;
      }
      A457FasCod = T00T635_A457FasCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A603MaqCodBis = T00T635_A603MaqCodBis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
      pr_default.close(33);
      /* Using cursor T00T636 */
      pr_default.execute(34, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00T636_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(34);
      /* Using cursor T00T637 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
      }
      A4036CCTDsc = T00T637_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(35);
      GX_FocusControl = edtCCOpeCod_Internalname ;
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

   public void valid_Cctcod( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( A4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4033CCFch", localUtil.format(A4033CCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4405CcDisp", GXutil.rtrim( A4405CcDisp));
      httpContext.ajax_rsp_assign_attri("", false, "A3281CcObs", A3281CcObs);
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( A3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( A1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1223BarEncCom", GXutil.ltrim( localUtil.ntoc( A1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1911BarRdoA", GXutil.ltrim( localUtil.ntoc( A1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A126BarAncAca2", GXutil.ltrim( localUtil.ntoc( A126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", GXutil.rtrim( A603MaqCodBis));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9789BarItem5", GXutil.rtrim( A9789BarItem5));
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4032CCOpeCod", GXutil.ltrim( localUtil.ntoc( Z4032CCOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4033CCFch", localUtil.format(Z4033CCFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4405CcDisp", GXutil.rtrim( Z4405CcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3281CcObs", Z3281CcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1909BarGraAca", GXutil.ltrim( localUtil.ntoc( Z1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3137BarGraAca2", GXutil.ltrim( localUtil.ntoc( Z3137BarGraAca2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1224BarEncAnh", GXutil.ltrim( localUtil.ntoc( Z1224BarEncAnh, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1223BarEncCom", GXutil.ltrim( localUtil.ntoc( Z1223BarEncCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1911BarRdoA", GXutil.ltrim( localUtil.ntoc( Z1911BarRdoA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z125BarAncAca1", GXutil.ltrim( localUtil.ntoc( Z125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z126BarAncAca2", GXutil.ltrim( localUtil.ntoc( Z126BarAncAca2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z603MaqCodBis", GXutil.rtrim( Z603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9789BarItem5", GXutil.rtrim( Z9789BarItem5));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( Z4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cctlin( )
   {
      /* Using cursor T00T629 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTLin_Internalname ;
      }
      A4043CCTLinDsc = T00T629_A4043CCTLinDsc[0] ;
      pr_default.close(27);
      GXt_char1 = A5627CCTValD ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A4031CCTCod ;
      GXv_int4[0] = A4034CCTLin ;
      GXv_char2[0] = GXt_char1 ;
      new app.pccdef2(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_char2) ;
      tincc2_impl.this.A396EmprCod = GXv_char5[0] ;
      tincc2_impl.this.A4031CCTCod = GXv_int3[0] ;
      tincc2_impl.this.A4034CCTLin = GXv_int4[0] ;
      tincc2_impl.this.GXt_char1 = GXv_char2[0] ;
      A5627CCTValD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4043CCTLinDsc", GXutil.rtrim( A4043CCTLinDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5627CCTValD", A5627CCTValD);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4032CCOpeCod',fld:'CCOPECOD',pic:'ZZZZZ9'},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A4405CcDisp',fld:'CCDISP',pic:''},{av:'A3281CcObs',fld:'CCOBS',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A3137BarGraAca2',fld:'BARGRAACA2',pic:'ZZZ9'},{av:'A1224BarEncAnh',fld:'BARENCANH',pic:'999.99'},{av:'A1223BarEncCom',fld:'BARENCCOM',pic:'999.99'},{av:'A1911BarRdoA',fld:'BARRDOA',pic:'ZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A126BarAncAca2',fld:'BARANCACA2',pic:'ZZ9'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A9789BarItem5',fld:'BARITEM5',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z4031CCTCod'},{av:'Z407EmprNom'},{av:'Z4032CCOpeCod'},{av:'Z4033CCFch'},{av:'Z4405CcDisp'},{av:'Z3281CcObs'},{av:'Z457FasCod'},{av:'Z460FasDsc'},{av:'Z759ProDsc'},{av:'Z4036CCTDsc'},{av:'Z1909BarGraAca'},{av:'Z3137BarGraAca2'},{av:'Z1224BarEncAnh'},{av:'Z1223BarEncCom'},{av:'Z1911BarRdoA'},{av:'Z125BarAncAca1'},{av:'Z126BarAncAca2'},{av:'Z603MaqCodBis'},{av:'Z212BarSer'},{av:'Z1652BarSerDsc'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z4812BarEncCli'},{av:'Z217BarTipArt'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z9789BarItem5'},{av:'Z4466BarAcaAnh'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CCTLIN","{handler:'valid_Cctlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4034CCTLin',fld:'CCTLIN',pic:'ZZZ9'},{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]");
      setEventMetadata("VALID_CCTLIN",",oparms:[{av:'A4043CCTLinDsc',fld:'CCTLINDSC',pic:''},{av:'A5627CCTValD',fld:'CCTVALD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ccespecif',iparms:[]");
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
      pr_default.close(27);
      pr_default.close(33);
      pr_default.close(30);
      pr_default.close(29);
      pr_default.close(32);
      pr_default.close(35);
      pr_default.close(34);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z4033CCFch = GXutil.nullDate() ;
      Z4405CcDisp = "" ;
      Z3281CcObs = "" ;
      Z4035CCVal = "" ;
      Z12751CCOkDsc = "" ;
      Z13251CCMetodo = "" ;
      Z13252CCEspecif = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
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
      lblTextblock10_Jsonclick = "" ;
      A4033CCFch = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A4405CcDisp = "" ;
      lblTextblock12_Jsonclick = "" ;
      A3281CcObs = "" ;
      lblTextblock13_Jsonclick = "" ;
      A457FasCod = "" ;
      lblTextblock14_Jsonclick = "" ;
      A460FasDsc = "" ;
      lblTextblock15_Jsonclick = "" ;
      A759ProDsc = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4036CCTDsc = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A603MaqCodBis = "" ;
      lblTextblock25_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock26_Jsonclick = "" ;
      A1652BarSerDsc = "" ;
      lblTextblock27_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A4812BarEncCli = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock34_Jsonclick = "" ;
      A9789BarItem5 = "" ;
      lblTextblock35_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode620 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode619 = "" ;
      GXCCtl = "" ;
      A4043CCTLinDsc = "" ;
      A4035CCVal = "" ;
      A5627CCTValD = "" ;
      A12751CCOkDsc = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      Z407EmprNom = "" ;
      Z1224BarEncAnh = DecimalUtil.ZERO ;
      Z1223BarEncCom = DecimalUtil.ZERO ;
      Z1911BarRdoA = DecimalUtil.ZERO ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z4812BarEncCli = "" ;
      Z9789BarItem5 = "" ;
      Z279CliNom = "" ;
      Z759ProDsc = "" ;
      Z457FasCod = "" ;
      Z603MaqCodBis = "" ;
      Z460FasDsc = "" ;
      Z4036CCTDsc = "" ;
      T00T67_A407EmprNom = new String[] {""} ;
      T00T67_n407EmprNom = new boolean[] {false} ;
      T00T68_A1909BarGraAca = new short[1] ;
      T00T68_A3137BarGraAca2 = new short[1] ;
      T00T68_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T68_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T68_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T68_A125BarAncAca1 = new short[1] ;
      T00T68_A126BarAncAca2 = new short[1] ;
      T00T68_A212BarSer = new String[] {""} ;
      T00T68_A1652BarSerDsc = new String[] {""} ;
      T00T68_A135BarColNom = new String[] {""} ;
      T00T68_A136BarColNum = new int[1] ;
      T00T68_A218BarTipCol = new byte[1] ;
      T00T68_A4812BarEncCli = new String[] {""} ;
      T00T68_A9789BarItem5 = new String[] {""} ;
      T00T68_A4466BarAcaAnh = new short[1] ;
      T00T68_A252CliCod = new int[1] ;
      T00T68_n252CliCod = new boolean[] {false} ;
      T00T68_A217BarTipArt = new short[1] ;
      T00T68_n217BarTipArt = new boolean[] {false} ;
      T00T613_A279CliNom = new String[] {""} ;
      T00T69_A759ProDsc = new String[] {""} ;
      T00T610_A457FasCod = new String[] {""} ;
      T00T610_A603MaqCodBis = new String[] {""} ;
      T00T612_A460FasDsc = new String[] {""} ;
      T00T611_A4036CCTDsc = new String[] {""} ;
      T00T614_A407EmprNom = new String[] {""} ;
      T00T614_n407EmprNom = new boolean[] {false} ;
      T00T614_A4032CCOpeCod = new int[1] ;
      T00T614_n4032CCOpeCod = new boolean[] {false} ;
      T00T614_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00T614_n4033CCFch = new boolean[] {false} ;
      T00T614_A4405CcDisp = new String[] {""} ;
      T00T614_n4405CcDisp = new boolean[] {false} ;
      T00T614_A3281CcObs = new String[] {""} ;
      T00T614_n3281CcObs = new boolean[] {false} ;
      T00T614_A460FasDsc = new String[] {""} ;
      T00T614_A759ProDsc = new String[] {""} ;
      T00T614_A4036CCTDsc = new String[] {""} ;
      T00T614_A1909BarGraAca = new short[1] ;
      T00T614_A3137BarGraAca2 = new short[1] ;
      T00T614_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T614_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T614_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T614_A125BarAncAca1 = new short[1] ;
      T00T614_A126BarAncAca2 = new short[1] ;
      T00T614_A212BarSer = new String[] {""} ;
      T00T614_A1652BarSerDsc = new String[] {""} ;
      T00T614_A135BarColNom = new String[] {""} ;
      T00T614_A136BarColNum = new int[1] ;
      T00T614_A218BarTipCol = new byte[1] ;
      T00T614_A4812BarEncCli = new String[] {""} ;
      T00T614_A279CliNom = new String[] {""} ;
      T00T614_A9789BarItem5 = new String[] {""} ;
      T00T614_A4466BarAcaAnh = new short[1] ;
      T00T614_A396EmprCod = new String[] {""} ;
      T00T614_A129BarCod = new int[1] ;
      T00T614_A132BarCodReo = new byte[1] ;
      T00T614_A130BarCodPar = new String[] {""} ;
      T00T614_A758ProCod = new String[] {""} ;
      T00T614_A194BarOrdLin = new short[1] ;
      T00T614_A4031CCTCod = new int[1] ;
      T00T614_A457FasCod = new String[] {""} ;
      T00T614_A603MaqCodBis = new String[] {""} ;
      T00T614_A252CliCod = new int[1] ;
      T00T614_n252CliCod = new boolean[] {false} ;
      T00T614_A217BarTipArt = new short[1] ;
      T00T614_n217BarTipArt = new boolean[] {false} ;
      T00T615_A396EmprCod = new String[] {""} ;
      T00T615_A129BarCod = new int[1] ;
      T00T615_A132BarCodReo = new byte[1] ;
      T00T615_A130BarCodPar = new String[] {""} ;
      T00T615_A758ProCod = new String[] {""} ;
      T00T615_A194BarOrdLin = new short[1] ;
      T00T615_A4031CCTCod = new int[1] ;
      T00T66_A4032CCOpeCod = new int[1] ;
      T00T66_n4032CCOpeCod = new boolean[] {false} ;
      T00T66_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00T66_n4033CCFch = new boolean[] {false} ;
      T00T66_A4405CcDisp = new String[] {""} ;
      T00T66_n4405CcDisp = new boolean[] {false} ;
      T00T66_A3281CcObs = new String[] {""} ;
      T00T66_n3281CcObs = new boolean[] {false} ;
      T00T66_A396EmprCod = new String[] {""} ;
      T00T66_A129BarCod = new int[1] ;
      T00T66_A132BarCodReo = new byte[1] ;
      T00T66_A130BarCodPar = new String[] {""} ;
      T00T66_A758ProCod = new String[] {""} ;
      T00T66_A194BarOrdLin = new short[1] ;
      T00T66_A4031CCTCod = new int[1] ;
      T00T616_A396EmprCod = new String[] {""} ;
      T00T616_A129BarCod = new int[1] ;
      T00T616_A132BarCodReo = new byte[1] ;
      T00T616_A130BarCodPar = new String[] {""} ;
      T00T616_A758ProCod = new String[] {""} ;
      T00T616_A194BarOrdLin = new short[1] ;
      T00T616_A4031CCTCod = new int[1] ;
      T00T617_A396EmprCod = new String[] {""} ;
      T00T617_A129BarCod = new int[1] ;
      T00T617_A132BarCodReo = new byte[1] ;
      T00T617_A130BarCodPar = new String[] {""} ;
      T00T617_A758ProCod = new String[] {""} ;
      T00T617_A194BarOrdLin = new short[1] ;
      T00T617_A4031CCTCod = new int[1] ;
      T00T65_A4032CCOpeCod = new int[1] ;
      T00T65_n4032CCOpeCod = new boolean[] {false} ;
      T00T65_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00T65_n4033CCFch = new boolean[] {false} ;
      T00T65_A4405CcDisp = new String[] {""} ;
      T00T65_n4405CcDisp = new boolean[] {false} ;
      T00T65_A3281CcObs = new String[] {""} ;
      T00T65_n3281CcObs = new boolean[] {false} ;
      T00T65_A396EmprCod = new String[] {""} ;
      T00T65_A129BarCod = new int[1] ;
      T00T65_A132BarCodReo = new byte[1] ;
      T00T65_A130BarCodPar = new String[] {""} ;
      T00T65_A758ProCod = new String[] {""} ;
      T00T65_A194BarOrdLin = new short[1] ;
      T00T65_A4031CCTCod = new int[1] ;
      T00T621_A396EmprCod = new String[] {""} ;
      T00T621_A129BarCod = new int[1] ;
      T00T621_A132BarCodReo = new byte[1] ;
      T00T621_A130BarCodPar = new String[] {""} ;
      T00T621_A758ProCod = new String[] {""} ;
      T00T621_A194BarOrdLin = new short[1] ;
      T00T621_A4031CCTCod = new int[1] ;
      T00T621_A11294CcLn = new short[1] ;
      T00T622_A396EmprCod = new String[] {""} ;
      T00T622_A129BarCod = new int[1] ;
      T00T622_A132BarCodReo = new byte[1] ;
      T00T622_A130BarCodPar = new String[] {""} ;
      T00T622_A758ProCod = new String[] {""} ;
      T00T622_A194BarOrdLin = new short[1] ;
      T00T622_A4031CCTCod = new int[1] ;
      Z4043CCTLinDsc = "" ;
      T00T623_A129BarCod = new int[1] ;
      T00T623_A132BarCodReo = new byte[1] ;
      T00T623_A130BarCodPar = new String[] {""} ;
      T00T623_A194BarOrdLin = new short[1] ;
      T00T623_A4043CCTLinDsc = new String[] {""} ;
      T00T623_A4035CCVal = new String[] {""} ;
      T00T623_A12750CCOkLin = new byte[1] ;
      T00T623_A12751CCOkDsc = new String[] {""} ;
      T00T623_A13251CCMetodo = new String[] {""} ;
      T00T623_A13252CCEspecif = new String[] {""} ;
      T00T623_A396EmprCod = new String[] {""} ;
      T00T623_A4031CCTCod = new int[1] ;
      T00T623_A4034CCTLin = new short[1] ;
      T00T623_A758ProCod = new String[] {""} ;
      T00T64_A4043CCTLinDsc = new String[] {""} ;
      T00T624_A4043CCTLinDsc = new String[] {""} ;
      T00T625_A396EmprCod = new String[] {""} ;
      T00T625_A129BarCod = new int[1] ;
      T00T625_A132BarCodReo = new byte[1] ;
      T00T625_A130BarCodPar = new String[] {""} ;
      T00T625_A758ProCod = new String[] {""} ;
      T00T625_A194BarOrdLin = new short[1] ;
      T00T625_A4031CCTCod = new int[1] ;
      T00T625_A4034CCTLin = new short[1] ;
      T00T63_A129BarCod = new int[1] ;
      T00T63_A132BarCodReo = new byte[1] ;
      T00T63_A130BarCodPar = new String[] {""} ;
      T00T63_A194BarOrdLin = new short[1] ;
      T00T63_A4035CCVal = new String[] {""} ;
      T00T63_A12750CCOkLin = new byte[1] ;
      T00T63_A12751CCOkDsc = new String[] {""} ;
      T00T63_A13251CCMetodo = new String[] {""} ;
      T00T63_A13252CCEspecif = new String[] {""} ;
      T00T63_A396EmprCod = new String[] {""} ;
      T00T63_A4031CCTCod = new int[1] ;
      T00T63_A4034CCTLin = new short[1] ;
      T00T63_A758ProCod = new String[] {""} ;
      T00T62_A129BarCod = new int[1] ;
      T00T62_A132BarCodReo = new byte[1] ;
      T00T62_A130BarCodPar = new String[] {""} ;
      T00T62_A194BarOrdLin = new short[1] ;
      T00T62_A4035CCVal = new String[] {""} ;
      T00T62_A12750CCOkLin = new byte[1] ;
      T00T62_A12751CCOkDsc = new String[] {""} ;
      T00T62_A13251CCMetodo = new String[] {""} ;
      T00T62_A13252CCEspecif = new String[] {""} ;
      T00T62_A396EmprCod = new String[] {""} ;
      T00T62_A4031CCTCod = new int[1] ;
      T00T62_A4034CCTLin = new short[1] ;
      T00T62_A758ProCod = new String[] {""} ;
      T00T629_A4043CCTLinDsc = new String[] {""} ;
      T00T630_A396EmprCod = new String[] {""} ;
      T00T630_A129BarCod = new int[1] ;
      T00T630_A132BarCodReo = new byte[1] ;
      T00T630_A130BarCodPar = new String[] {""} ;
      T00T630_A758ProCod = new String[] {""} ;
      T00T630_A194BarOrdLin = new short[1] ;
      T00T630_A4031CCTCod = new int[1] ;
      T00T630_A4034CCTLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00T631_A407EmprNom = new String[] {""} ;
      T00T631_n407EmprNom = new boolean[] {false} ;
      T00T632_A1909BarGraAca = new short[1] ;
      T00T632_A3137BarGraAca2 = new short[1] ;
      T00T632_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T632_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T632_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T632_A125BarAncAca1 = new short[1] ;
      T00T632_A126BarAncAca2 = new short[1] ;
      T00T632_A212BarSer = new String[] {""} ;
      T00T632_A1652BarSerDsc = new String[] {""} ;
      T00T632_A135BarColNom = new String[] {""} ;
      T00T632_A136BarColNum = new int[1] ;
      T00T632_A218BarTipCol = new byte[1] ;
      T00T632_A4812BarEncCli = new String[] {""} ;
      T00T632_A9789BarItem5 = new String[] {""} ;
      T00T632_A4466BarAcaAnh = new short[1] ;
      T00T632_A252CliCod = new int[1] ;
      T00T632_n252CliCod = new boolean[] {false} ;
      T00T632_A217BarTipArt = new short[1] ;
      T00T632_n217BarTipArt = new boolean[] {false} ;
      T00T633_A279CliNom = new String[] {""} ;
      T00T634_A759ProDsc = new String[] {""} ;
      T00T635_A457FasCod = new String[] {""} ;
      T00T635_A603MaqCodBis = new String[] {""} ;
      T00T636_A460FasDsc = new String[] {""} ;
      T00T637_A4036CCTDsc = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4033CCFch = GXutil.nullDate() ;
      ZZ4405CcDisp = "" ;
      ZZ3281CcObs = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      ZZ759ProDsc = "" ;
      ZZ4036CCTDsc = "" ;
      ZZ1224BarEncAnh = DecimalUtil.ZERO ;
      ZZ1223BarEncCom = DecimalUtil.ZERO ;
      ZZ1911BarRdoA = DecimalUtil.ZERO ;
      ZZ603MaqCodBis = "" ;
      ZZ212BarSer = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ135BarColNom = "" ;
      ZZ4812BarEncCli = "" ;
      ZZ279CliNom = "" ;
      ZZ9789BarItem5 = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new short[1] ;
      GXv_char2 = new String[1] ;
      Z5627CCTValD = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tincc2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tincc2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tincc2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tincc2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tincc2__default(),
         new Object[] {
             new Object[] {
            T00T62_A129BarCod, T00T62_A132BarCodReo, T00T62_A130BarCodPar, T00T62_A194BarOrdLin, T00T62_A4035CCVal, T00T62_A12750CCOkLin, T00T62_A12751CCOkDsc, T00T62_A13251CCMetodo, T00T62_A13252CCEspecif, T00T62_A396EmprCod,
            T00T62_A4031CCTCod, T00T62_A4034CCTLin, T00T62_A758ProCod
            }
            , new Object[] {
            T00T63_A129BarCod, T00T63_A132BarCodReo, T00T63_A130BarCodPar, T00T63_A194BarOrdLin, T00T63_A4035CCVal, T00T63_A12750CCOkLin, T00T63_A12751CCOkDsc, T00T63_A13251CCMetodo, T00T63_A13252CCEspecif, T00T63_A396EmprCod,
            T00T63_A4031CCTCod, T00T63_A4034CCTLin, T00T63_A758ProCod
            }
            , new Object[] {
            T00T64_A4043CCTLinDsc
            }
            , new Object[] {
            T00T65_A4032CCOpeCod, T00T65_n4032CCOpeCod, T00T65_A4033CCFch, T00T65_n4033CCFch, T00T65_A4405CcDisp, T00T65_n4405CcDisp, T00T65_A3281CcObs, T00T65_n3281CcObs, T00T65_A396EmprCod, T00T65_A129BarCod,
            T00T65_A132BarCodReo, T00T65_A130BarCodPar, T00T65_A758ProCod, T00T65_A194BarOrdLin, T00T65_A4031CCTCod
            }
            , new Object[] {
            T00T66_A4032CCOpeCod, T00T66_n4032CCOpeCod, T00T66_A4033CCFch, T00T66_n4033CCFch, T00T66_A4405CcDisp, T00T66_n4405CcDisp, T00T66_A3281CcObs, T00T66_n3281CcObs, T00T66_A396EmprCod, T00T66_A129BarCod,
            T00T66_A132BarCodReo, T00T66_A130BarCodPar, T00T66_A758ProCod, T00T66_A194BarOrdLin, T00T66_A4031CCTCod
            }
            , new Object[] {
            T00T67_A407EmprNom, T00T67_n407EmprNom
            }
            , new Object[] {
            T00T68_A1909BarGraAca, T00T68_A3137BarGraAca2, T00T68_A1224BarEncAnh, T00T68_A1223BarEncCom, T00T68_A1911BarRdoA, T00T68_A125BarAncAca1, T00T68_A126BarAncAca2, T00T68_A212BarSer, T00T68_A1652BarSerDsc, T00T68_A135BarColNom,
            T00T68_A136BarColNum, T00T68_A218BarTipCol, T00T68_A4812BarEncCli, T00T68_A9789BarItem5, T00T68_A4466BarAcaAnh, T00T68_A252CliCod, T00T68_n252CliCod, T00T68_A217BarTipArt, T00T68_n217BarTipArt
            }
            , new Object[] {
            T00T69_A759ProDsc
            }
            , new Object[] {
            T00T610_A457FasCod, T00T610_A603MaqCodBis
            }
            , new Object[] {
            T00T611_A4036CCTDsc
            }
            , new Object[] {
            T00T612_A460FasDsc
            }
            , new Object[] {
            T00T613_A279CliNom
            }
            , new Object[] {
            T00T614_A407EmprNom, T00T614_n407EmprNom, T00T614_A4032CCOpeCod, T00T614_n4032CCOpeCod, T00T614_A4033CCFch, T00T614_n4033CCFch, T00T614_A4405CcDisp, T00T614_n4405CcDisp, T00T614_A3281CcObs, T00T614_n3281CcObs,
            T00T614_A460FasDsc, T00T614_A759ProDsc, T00T614_A4036CCTDsc, T00T614_A1909BarGraAca, T00T614_A3137BarGraAca2, T00T614_A1224BarEncAnh, T00T614_A1223BarEncCom, T00T614_A1911BarRdoA, T00T614_A125BarAncAca1, T00T614_A126BarAncAca2,
            T00T614_A212BarSer, T00T614_A1652BarSerDsc, T00T614_A135BarColNom, T00T614_A136BarColNum, T00T614_A218BarTipCol, T00T614_A4812BarEncCli, T00T614_A279CliNom, T00T614_A9789BarItem5, T00T614_A4466BarAcaAnh, T00T614_A396EmprCod,
            T00T614_A129BarCod, T00T614_A132BarCodReo, T00T614_A130BarCodPar, T00T614_A758ProCod, T00T614_A194BarOrdLin, T00T614_A4031CCTCod, T00T614_A457FasCod, T00T614_A603MaqCodBis, T00T614_A252CliCod, T00T614_n252CliCod,
            T00T614_A217BarTipArt, T00T614_n217BarTipArt
            }
            , new Object[] {
            T00T615_A396EmprCod, T00T615_A129BarCod, T00T615_A132BarCodReo, T00T615_A130BarCodPar, T00T615_A758ProCod, T00T615_A194BarOrdLin, T00T615_A4031CCTCod
            }
            , new Object[] {
            T00T616_A396EmprCod, T00T616_A129BarCod, T00T616_A132BarCodReo, T00T616_A130BarCodPar, T00T616_A758ProCod, T00T616_A194BarOrdLin, T00T616_A4031CCTCod
            }
            , new Object[] {
            T00T617_A396EmprCod, T00T617_A129BarCod, T00T617_A132BarCodReo, T00T617_A130BarCodPar, T00T617_A758ProCod, T00T617_A194BarOrdLin, T00T617_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T621_A396EmprCod, T00T621_A129BarCod, T00T621_A132BarCodReo, T00T621_A130BarCodPar, T00T621_A758ProCod, T00T621_A194BarOrdLin, T00T621_A4031CCTCod, T00T621_A11294CcLn
            }
            , new Object[] {
            T00T622_A396EmprCod, T00T622_A129BarCod, T00T622_A132BarCodReo, T00T622_A130BarCodPar, T00T622_A758ProCod, T00T622_A194BarOrdLin, T00T622_A4031CCTCod
            }
            , new Object[] {
            T00T623_A129BarCod, T00T623_A132BarCodReo, T00T623_A130BarCodPar, T00T623_A194BarOrdLin, T00T623_A4043CCTLinDsc, T00T623_A4035CCVal, T00T623_A12750CCOkLin, T00T623_A12751CCOkDsc, T00T623_A13251CCMetodo, T00T623_A13252CCEspecif,
            T00T623_A396EmprCod, T00T623_A4031CCTCod, T00T623_A4034CCTLin, T00T623_A758ProCod
            }
            , new Object[] {
            T00T624_A4043CCTLinDsc
            }
            , new Object[] {
            T00T625_A396EmprCod, T00T625_A129BarCod, T00T625_A132BarCodReo, T00T625_A130BarCodPar, T00T625_A758ProCod, T00T625_A194BarOrdLin, T00T625_A4031CCTCod, T00T625_A4034CCTLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T629_A4043CCTLinDsc
            }
            , new Object[] {
            T00T630_A396EmprCod, T00T630_A129BarCod, T00T630_A132BarCodReo, T00T630_A130BarCodPar, T00T630_A758ProCod, T00T630_A194BarOrdLin, T00T630_A4031CCTCod, T00T630_A4034CCTLin
            }
            , new Object[] {
            T00T631_A407EmprNom, T00T631_n407EmprNom
            }
            , new Object[] {
            T00T632_A1909BarGraAca, T00T632_A3137BarGraAca2, T00T632_A1224BarEncAnh, T00T632_A1223BarEncCom, T00T632_A1911BarRdoA, T00T632_A125BarAncAca1, T00T632_A126BarAncAca2, T00T632_A212BarSer, T00T632_A1652BarSerDsc, T00T632_A135BarColNom,
            T00T632_A136BarColNum, T00T632_A218BarTipCol, T00T632_A4812BarEncCli, T00T632_A9789BarItem5, T00T632_A4466BarAcaAnh, T00T632_A252CliCod, T00T632_n252CliCod, T00T632_A217BarTipArt, T00T632_n217BarTipArt
            }
            , new Object[] {
            T00T633_A279CliNom
            }
            , new Object[] {
            T00T634_A759ProDsc
            }
            , new Object[] {
            T00T635_A457FasCod, T00T635_A603MaqCodBis
            }
            , new Object[] {
            T00T636_A460FasDsc
            }
            , new Object[] {
            T00T637_A4036CCTDsc
            }
         }
      );
      Z4031CCTCod = 0 ;
      A4031CCTCod = 0 ;
      Z194BarOrdLin = (short)(0) ;
      A194BarOrdLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
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
   private byte Z12750CCOkLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A12750CCOkLin ;
   private byte Z218BarTipCol ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z4034CCTLin ;
   private short nRcdDeleted_620 ;
   private short nRcdExists_620 ;
   private short nIsMod_620 ;
   private short A4034CCTLin ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short nBlankRcdCount620 ;
   private short RcdFound620 ;
   private short nBlankRcdUsr620 ;
   private short Z1909BarGraAca ;
   private short Z3137BarGraAca2 ;
   private short Z125BarAncAca1 ;
   private short Z126BarAncAca2 ;
   private short Z4466BarAcaAnh ;
   private short Z217BarTipArt ;
   private short RcdFound619 ;
   private short nIsDirty_619 ;
   private short nIsDirty_620 ;
   private short ZZ194BarOrdLin ;
   private short ZZ1909BarGraAca ;
   private short ZZ3137BarGraAca2 ;
   private short ZZ125BarAncAca1 ;
   private short ZZ126BarAncAca2 ;
   private short ZZ217BarTipArt ;
   private short ZZ4466BarAcaAnh ;
   private short GXv_int4[] ;
   private int wcpOA129BarCod ;
   private int wcpOA4031CCTCod ;
   private int Z129BarCod ;
   private int Z4031CCTCod ;
   private int Z4032CCOpeCod ;
   private int nRC_GXsfl_195 ;
   private int nGXsfl_195_idx=1 ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtCCTCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A4032CCOpeCod ;
   private int edtCCOpeCod_Enabled ;
   private int edtCCFch_Enabled ;
   private int edtCcDisp_Enabled ;
   private int edtCcObs_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtBarGraAca2_Enabled ;
   private int edtBarEncAnh_Enabled ;
   private int edtBarEncCom_Enabled ;
   private int edtBarRdoA_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarAncAca2_Enabled ;
   private int edtMaqCodBis_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarItem5_Enabled ;
   private int edtBarAcaAnh_Enabled ;
   private int edtavnRcdDeleted_620_Enabled ;
   private int edtCCTLin_Enabled ;
   private int edtCCTLinDsc_Enabled ;
   private int edtCCVal_Enabled ;
   private int edtCCTValD_Enabled ;
   private int edtCCOkLin_Enabled ;
   private int edtCCOkDsc_Enabled ;
   private int edtCCMetodo_Enabled ;
   private int edtCCEspecif_Enabled ;
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
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCCTLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarAcaAnh_Backcolor ;
   private int edtBarItem5_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarTipArt_Backcolor ;
   private int edtBarEncCli_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarSerDsc_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtMaqCodBis_Backcolor ;
   private int edtBarAncAca2_Backcolor ;
   private int edtBarAncAca1_Backcolor ;
   private int edtBarRdoA_Backcolor ;
   private int edtBarEncCom_Backcolor ;
   private int edtBarEncAnh_Backcolor ;
   private int edtBarGraAca2_Backcolor ;
   private int edtBarGraAca_Backcolor ;
   private int edtCCTDsc_Backcolor ;
   private int edtProDsc_Backcolor ;
   private int edtFasDsc_Backcolor ;
   private int edtFasCod_Backcolor ;
   private int edtCcObs_Backcolor ;
   private int edtCcDisp_Backcolor ;
   private int edtCCFch_Backcolor ;
   private int edtCCOpeCod_Backcolor ;
   private int edtCCTCod_Backcolor ;
   private int edtBarOrdLin_Backcolor ;
   private int edtProCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ4031CCTCod ;
   private int ZZ4032CCOpeCod ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private int GXv_int3[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal Z1224BarEncAnh ;
   private java.math.BigDecimal Z1223BarEncCom ;
   private java.math.BigDecimal Z1911BarRdoA ;
   private java.math.BigDecimal ZZ1224BarEncAnh ;
   private java.math.BigDecimal ZZ1223BarEncCom ;
   private java.math.BigDecimal ZZ1911BarRdoA ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z4405CcDisp ;
   private String Z4035CCVal ;
   private String Z13251CCMetodo ;
   private String Z13252CCEspecif ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCOpeCod_Internalname ;
   private String sGXsfl_195_idx="0001" ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCCOpeCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCCFch_Internalname ;
   private String edtCCFch_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCcDisp_Internalname ;
   private String A4405CcDisp ;
   private String edtCcDisp_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCcObs_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarGraAca_Internalname ;
   private String edtBarGraAca_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarGraAca2_Internalname ;
   private String edtBarGraAca2_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarEncAnh_Internalname ;
   private String edtBarEncAnh_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarEncCom_Internalname ;
   private String edtBarEncCom_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarRdoA_Internalname ;
   private String edtBarRdoA_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarAncAca1_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarAncAca2_Internalname ;
   private String edtBarAncAca2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtMaqCodBis_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarTipArt_Internalname ;
   private String edtBarTipArt_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBarItem5_Internalname ;
   private String A9789BarItem5 ;
   private String edtBarItem5_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtBarAcaAnh_Internalname ;
   private String edtBarAcaAnh_Jsonclick ;
   private String sMode620 ;
   private String edtavnRcdDeleted_620_Internalname ;
   private String edtCCTLin_Internalname ;
   private String edtCCTLinDsc_Internalname ;
   private String edtCCVal_Internalname ;
   private String edtCCTValD_Internalname ;
   private String edtCCOkLin_Internalname ;
   private String edtCCOkDsc_Internalname ;
   private String edtCCMetodo_Internalname ;
   private String edtCCEspecif_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode619 ;
   private String GXCCtl ;
   private String A4043CCTLinDsc ;
   private String A4035CCVal ;
   private String A13251CCMetodo ;
   private String A13252CCEspecif ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z4812BarEncCli ;
   private String Z9789BarItem5 ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z457FasCod ;
   private String Z603MaqCodBis ;
   private String Z460FasDsc ;
   private String Z4036CCTDsc ;
   private String Z4043CCTLinDsc ;
   private String sGXsfl_195_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_620_Jsonclick ;
   private String edtCCTLin_Jsonclick ;
   private String edtCCTLinDsc_Jsonclick ;
   private String edtCCVal_Jsonclick ;
   private String edtCCTValD_Jsonclick ;
   private String edtCCOkLin_Jsonclick ;
   private String edtCCOkDsc_Jsonclick ;
   private String edtCCMetodo_Jsonclick ;
   private String edtCCEspecif_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ4405CcDisp ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String ZZ759ProDsc ;
   private String ZZ4036CCTDsc ;
   private String ZZ603MaqCodBis ;
   private String ZZ212BarSer ;
   private String ZZ1652BarSerDsc ;
   private String ZZ135BarColNom ;
   private String ZZ4812BarEncCli ;
   private String ZZ279CliNom ;
   private String ZZ9789BarItem5 ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private java.util.Date Z4033CCFch ;
   private java.util.Date A4033CCFch ;
   private java.util.Date ZZ4033CCFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_195_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4032CCOpeCod ;
   private boolean n4033CCFch ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private String Z3281CcObs ;
   private String Z12751CCOkDsc ;
   private String A3281CcObs ;
   private String A5627CCTValD ;
   private String A12751CCOkDsc ;
   private String ZZ3281CcObs ;
   private String Z5627CCTValD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00T67_A407EmprNom ;
   private boolean[] T00T67_n407EmprNom ;
   private short[] T00T68_A1909BarGraAca ;
   private short[] T00T68_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T00T68_A1224BarEncAnh ;
   private java.math.BigDecimal[] T00T68_A1223BarEncCom ;
   private java.math.BigDecimal[] T00T68_A1911BarRdoA ;
   private short[] T00T68_A125BarAncAca1 ;
   private short[] T00T68_A126BarAncAca2 ;
   private String[] T00T68_A212BarSer ;
   private String[] T00T68_A1652BarSerDsc ;
   private String[] T00T68_A135BarColNom ;
   private int[] T00T68_A136BarColNum ;
   private byte[] T00T68_A218BarTipCol ;
   private String[] T00T68_A4812BarEncCli ;
   private String[] T00T68_A9789BarItem5 ;
   private short[] T00T68_A4466BarAcaAnh ;
   private int[] T00T68_A252CliCod ;
   private boolean[] T00T68_n252CliCod ;
   private short[] T00T68_A217BarTipArt ;
   private boolean[] T00T68_n217BarTipArt ;
   private String[] T00T613_A279CliNom ;
   private String[] T00T69_A759ProDsc ;
   private String[] T00T610_A457FasCod ;
   private String[] T00T610_A603MaqCodBis ;
   private String[] T00T612_A460FasDsc ;
   private String[] T00T611_A4036CCTDsc ;
   private String[] T00T614_A407EmprNom ;
   private boolean[] T00T614_n407EmprNom ;
   private int[] T00T614_A4032CCOpeCod ;
   private boolean[] T00T614_n4032CCOpeCod ;
   private java.util.Date[] T00T614_A4033CCFch ;
   private boolean[] T00T614_n4033CCFch ;
   private String[] T00T614_A4405CcDisp ;
   private boolean[] T00T614_n4405CcDisp ;
   private String[] T00T614_A3281CcObs ;
   private boolean[] T00T614_n3281CcObs ;
   private String[] T00T614_A460FasDsc ;
   private String[] T00T614_A759ProDsc ;
   private String[] T00T614_A4036CCTDsc ;
   private short[] T00T614_A1909BarGraAca ;
   private short[] T00T614_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T00T614_A1224BarEncAnh ;
   private java.math.BigDecimal[] T00T614_A1223BarEncCom ;
   private java.math.BigDecimal[] T00T614_A1911BarRdoA ;
   private short[] T00T614_A125BarAncAca1 ;
   private short[] T00T614_A126BarAncAca2 ;
   private String[] T00T614_A212BarSer ;
   private String[] T00T614_A1652BarSerDsc ;
   private String[] T00T614_A135BarColNom ;
   private int[] T00T614_A136BarColNum ;
   private byte[] T00T614_A218BarTipCol ;
   private String[] T00T614_A4812BarEncCli ;
   private String[] T00T614_A279CliNom ;
   private String[] T00T614_A9789BarItem5 ;
   private short[] T00T614_A4466BarAcaAnh ;
   private String[] T00T614_A396EmprCod ;
   private int[] T00T614_A129BarCod ;
   private byte[] T00T614_A132BarCodReo ;
   private String[] T00T614_A130BarCodPar ;
   private String[] T00T614_A758ProCod ;
   private short[] T00T614_A194BarOrdLin ;
   private int[] T00T614_A4031CCTCod ;
   private String[] T00T614_A457FasCod ;
   private String[] T00T614_A603MaqCodBis ;
   private int[] T00T614_A252CliCod ;
   private boolean[] T00T614_n252CliCod ;
   private short[] T00T614_A217BarTipArt ;
   private boolean[] T00T614_n217BarTipArt ;
   private String[] T00T615_A396EmprCod ;
   private int[] T00T615_A129BarCod ;
   private byte[] T00T615_A132BarCodReo ;
   private String[] T00T615_A130BarCodPar ;
   private String[] T00T615_A758ProCod ;
   private short[] T00T615_A194BarOrdLin ;
   private int[] T00T615_A4031CCTCod ;
   private int[] T00T66_A4032CCOpeCod ;
   private boolean[] T00T66_n4032CCOpeCod ;
   private java.util.Date[] T00T66_A4033CCFch ;
   private boolean[] T00T66_n4033CCFch ;
   private String[] T00T66_A4405CcDisp ;
   private boolean[] T00T66_n4405CcDisp ;
   private String[] T00T66_A3281CcObs ;
   private boolean[] T00T66_n3281CcObs ;
   private String[] T00T66_A396EmprCod ;
   private int[] T00T66_A129BarCod ;
   private byte[] T00T66_A132BarCodReo ;
   private String[] T00T66_A130BarCodPar ;
   private String[] T00T66_A758ProCod ;
   private short[] T00T66_A194BarOrdLin ;
   private int[] T00T66_A4031CCTCod ;
   private String[] T00T616_A396EmprCod ;
   private int[] T00T616_A129BarCod ;
   private byte[] T00T616_A132BarCodReo ;
   private String[] T00T616_A130BarCodPar ;
   private String[] T00T616_A758ProCod ;
   private short[] T00T616_A194BarOrdLin ;
   private int[] T00T616_A4031CCTCod ;
   private String[] T00T617_A396EmprCod ;
   private int[] T00T617_A129BarCod ;
   private byte[] T00T617_A132BarCodReo ;
   private String[] T00T617_A130BarCodPar ;
   private String[] T00T617_A758ProCod ;
   private short[] T00T617_A194BarOrdLin ;
   private int[] T00T617_A4031CCTCod ;
   private int[] T00T65_A4032CCOpeCod ;
   private boolean[] T00T65_n4032CCOpeCod ;
   private java.util.Date[] T00T65_A4033CCFch ;
   private boolean[] T00T65_n4033CCFch ;
   private String[] T00T65_A4405CcDisp ;
   private boolean[] T00T65_n4405CcDisp ;
   private String[] T00T65_A3281CcObs ;
   private boolean[] T00T65_n3281CcObs ;
   private String[] T00T65_A396EmprCod ;
   private int[] T00T65_A129BarCod ;
   private byte[] T00T65_A132BarCodReo ;
   private String[] T00T65_A130BarCodPar ;
   private String[] T00T65_A758ProCod ;
   private short[] T00T65_A194BarOrdLin ;
   private int[] T00T65_A4031CCTCod ;
   private String[] T00T621_A396EmprCod ;
   private int[] T00T621_A129BarCod ;
   private byte[] T00T621_A132BarCodReo ;
   private String[] T00T621_A130BarCodPar ;
   private String[] T00T621_A758ProCod ;
   private short[] T00T621_A194BarOrdLin ;
   private int[] T00T621_A4031CCTCod ;
   private short[] T00T621_A11294CcLn ;
   private String[] T00T622_A396EmprCod ;
   private int[] T00T622_A129BarCod ;
   private byte[] T00T622_A132BarCodReo ;
   private String[] T00T622_A130BarCodPar ;
   private String[] T00T622_A758ProCod ;
   private short[] T00T622_A194BarOrdLin ;
   private int[] T00T622_A4031CCTCod ;
   private int[] T00T623_A129BarCod ;
   private byte[] T00T623_A132BarCodReo ;
   private String[] T00T623_A130BarCodPar ;
   private short[] T00T623_A194BarOrdLin ;
   private String[] T00T623_A4043CCTLinDsc ;
   private String[] T00T623_A4035CCVal ;
   private byte[] T00T623_A12750CCOkLin ;
   private String[] T00T623_A12751CCOkDsc ;
   private String[] T00T623_A13251CCMetodo ;
   private String[] T00T623_A13252CCEspecif ;
   private String[] T00T623_A396EmprCod ;
   private int[] T00T623_A4031CCTCod ;
   private short[] T00T623_A4034CCTLin ;
   private String[] T00T623_A758ProCod ;
   private String[] T00T64_A4043CCTLinDsc ;
   private String[] T00T624_A4043CCTLinDsc ;
   private String[] T00T625_A396EmprCod ;
   private int[] T00T625_A129BarCod ;
   private byte[] T00T625_A132BarCodReo ;
   private String[] T00T625_A130BarCodPar ;
   private String[] T00T625_A758ProCod ;
   private short[] T00T625_A194BarOrdLin ;
   private int[] T00T625_A4031CCTCod ;
   private short[] T00T625_A4034CCTLin ;
   private int[] T00T63_A129BarCod ;
   private byte[] T00T63_A132BarCodReo ;
   private String[] T00T63_A130BarCodPar ;
   private short[] T00T63_A194BarOrdLin ;
   private String[] T00T63_A4035CCVal ;
   private byte[] T00T63_A12750CCOkLin ;
   private String[] T00T63_A12751CCOkDsc ;
   private String[] T00T63_A13251CCMetodo ;
   private String[] T00T63_A13252CCEspecif ;
   private String[] T00T63_A396EmprCod ;
   private int[] T00T63_A4031CCTCod ;
   private short[] T00T63_A4034CCTLin ;
   private String[] T00T63_A758ProCod ;
   private int[] T00T62_A129BarCod ;
   private byte[] T00T62_A132BarCodReo ;
   private String[] T00T62_A130BarCodPar ;
   private short[] T00T62_A194BarOrdLin ;
   private String[] T00T62_A4035CCVal ;
   private byte[] T00T62_A12750CCOkLin ;
   private String[] T00T62_A12751CCOkDsc ;
   private String[] T00T62_A13251CCMetodo ;
   private String[] T00T62_A13252CCEspecif ;
   private String[] T00T62_A396EmprCod ;
   private int[] T00T62_A4031CCTCod ;
   private short[] T00T62_A4034CCTLin ;
   private String[] T00T62_A758ProCod ;
   private String[] T00T629_A4043CCTLinDsc ;
   private String[] T00T630_A396EmprCod ;
   private int[] T00T630_A129BarCod ;
   private byte[] T00T630_A132BarCodReo ;
   private String[] T00T630_A130BarCodPar ;
   private String[] T00T630_A758ProCod ;
   private short[] T00T630_A194BarOrdLin ;
   private int[] T00T630_A4031CCTCod ;
   private short[] T00T630_A4034CCTLin ;
   private String[] T00T631_A407EmprNom ;
   private boolean[] T00T631_n407EmprNom ;
   private short[] T00T632_A1909BarGraAca ;
   private short[] T00T632_A3137BarGraAca2 ;
   private java.math.BigDecimal[] T00T632_A1224BarEncAnh ;
   private java.math.BigDecimal[] T00T632_A1223BarEncCom ;
   private java.math.BigDecimal[] T00T632_A1911BarRdoA ;
   private short[] T00T632_A125BarAncAca1 ;
   private short[] T00T632_A126BarAncAca2 ;
   private String[] T00T632_A212BarSer ;
   private String[] T00T632_A1652BarSerDsc ;
   private String[] T00T632_A135BarColNom ;
   private int[] T00T632_A136BarColNum ;
   private byte[] T00T632_A218BarTipCol ;
   private String[] T00T632_A4812BarEncCli ;
   private String[] T00T632_A9789BarItem5 ;
   private short[] T00T632_A4466BarAcaAnh ;
   private int[] T00T632_A252CliCod ;
   private boolean[] T00T632_n252CliCod ;
   private short[] T00T632_A217BarTipArt ;
   private boolean[] T00T632_n217BarTipArt ;
   private String[] T00T633_A279CliNom ;
   private String[] T00T634_A759ProDsc ;
   private String[] T00T635_A457FasCod ;
   private String[] T00T635_A603MaqCodBis ;
   private String[] T00T636_A460FasDsc ;
   private String[] T00T637_A4036CCTDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tincc2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincc2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincc2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincc2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tincc2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00T62", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?  FOR UPDATE OF CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T63", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, EmprCod, CCTCod, CCTLin, ProCod FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T64", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T65", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?  FOR UPDATE OF CCOpeCod, CCFch, CcDisp, CcObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T66", "SELECT CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T67", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T68", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarEncCli, BarItem5, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T69", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T610", "SELECT FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T611", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T612", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T613", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T614", "SELECT /*+ FIRST_ROWS(1) */ T2.EmprNom, TM1.CCOpeCod, TM1.CCFch, TM1.CcDisp, TM1.CcObs, T7.FasDsc, T5.ProDsc, T8.CCTDsc, T3.BarGraAca, T3.BarGraAca2, T3.BarEncAnh, T3.BarEncCom, T3.BarRdoA, T3.BarAncAca1, T3.BarAncAca2, T3.BarSer, T3.BarSerDsc, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T3.BarEncCli, T4.CliNom, T3.BarItem5, T3.BarAcaAnh, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod, T6.FasCod, T6.MaqCodBis, T3.CliCod, T3.BarTipArt FROM (((((((TXPCC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) INNER JOIN TXPBARFAS T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar AND T6.ProCod = TM1.ProCod AND T6.BarOrdLin = TM1.BarOrdLin) LEFT JOIN TXPFASPRO T7 ON T7.EmprCod = TM1.EmprCod AND T7.FasCod = T6.FasCod) INNER JOIN TXPCCDef T8 ON T8.EmprCod = TM1.EmprCod AND T8.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin, TM1.CCTCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T615", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T616", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T617", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00T618", "INSERT INTO TXPCC(CCOpeCod, CCFch, CcDisp, CcObs, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCFchUti, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T00T619", "UPDATE TXPCC SET CCOpeCod=?, CCFch=?, CcDisp=?, CcObs=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new UpdateCursor("T00T620", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK, "TXPCC")
         ,new ForEachCursor("T00T621", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T622", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T623", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T2.CCTLinDsc, T1.CCVal, T1.CCOkLin, T1.CCOkDsc, T1.CCMetodo, T1.CCEspecif, T1.EmprCod, T1.CCTCod, T1.CCTLin, T1.ProCod FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T624", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T625", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00T626", "INSERT INTO TXPCC1(BarCod, BarCodReo, BarCodPar, BarOrdLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, EmprCod, CCTCod, CCTLin, ProCod, CCEspecif2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T00T627", "UPDATE TXPCC1 SET CCVal=?, CCOkLin=?, CCOkDsc=?, CCMetodo=?, CCEspecif=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new UpdateCursor("T00T628", "DELETE FROM TXPCC1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK, "TXPCC1")
         ,new ForEachCursor("T00T629", "SELECT CCTLinDsc FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T630", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T631", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T632", "SELECT BarGraAca, BarGraAca2, BarEncAnh, BarEncCom, BarRdoA, BarAncAca1, BarAncAca2, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarEncCli, BarItem5, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T633", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T634", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T635", "SELECT FasCod, MaqCodBis FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T636", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T637", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 3);
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((String[]) buf[12])[0] = rslt.getString(9, 8);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 28);
               ((String[]) buf[11])[0] = rslt.getString(7, 40);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 16);
               ((String[]) buf[21])[0] = rslt.getString(17, 26);
               ((String[]) buf[22])[0] = rslt.getString(18, 13);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               ((String[]) buf[25])[0] = rslt.getString(21, 20);
               ((String[]) buf[26])[0] = rslt.getString(22, 30);
               ((String[]) buf[27])[0] = rslt.getString(23, 20);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 3);
               ((int[]) buf[30])[0] = rslt.getInt(26);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((String[]) buf[32])[0] = rslt.getString(28, 1);
               ((String[]) buf[33])[0] = rslt.getString(29, 8);
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((int[]) buf[35])[0] = rslt.getInt(31);
               ((String[]) buf[36])[0] = rslt.getString(32, 8);
               ((String[]) buf[37])[0] = rslt.getString(33, 6);
               ((int[]) buf[38])[0] = rslt.getInt(34);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 8);
               stmt.setShort(10, ((Number) parms[13]).shortValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               return;
            case 17 :
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
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 400);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 1);
               stmt.setString(9, (String)parms[12], 8);
               stmt.setShort(10, ((Number) parms[13]).shortValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 40);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 200, false);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 31 :
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
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

