package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn25_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12996MetPieDfID = (short)(GXutil.lval( httpContext.GetPar( "MetPieDfID"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A12996MetPieDfID) ;
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
            A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            AV33Fascod = httpContext.GetPar( "Fascod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Fascod", AV33Fascod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pruebas tabla DEFECTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMetPieKil_Internalname ;
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
      A12994MetPieDfUl = (short)(GXutil.lval( httpContext.GetPar( "MetPieDfUl"))) ;
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

   public ttrn25_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn25_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn25_impl.class ));
   }

   public ttrn25_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn25.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Pieza", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod), GXutil.rtrim( localUtil.format( A2813MetPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieKil_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMet_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDfUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDfUl_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieDfUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn25.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn25.htm");
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
         nBlankRcdCount1781 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1781 = (short)(1) ;
            scanStart1MA1781( ) ;
            while ( RcdFound1781 != 0 )
            {
               init_level_properties1781( ) ;
               getByPrimaryKey1MA1781( ) ;
               addRow1MA1781( ) ;
               scanNext1MA1781( ) ;
            }
            scanEnd1MA1781( ) ;
            nBlankRcdCount1781 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12994MetPieDfUl = A12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         standaloneNotModal1MA1781( ) ;
         standaloneModal1MA1781( ) ;
         sMode1781 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1MA1781( ) ;
            edtavnRcdDeleted_1781_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1781_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1781_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1781_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFLI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFID_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFDC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfDc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFMI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFFA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfFa_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_1781 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1MA1781( ) ;
            }
            sendRow1MA1781( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode1781 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12994MetPieDfUl = B12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1781 = (short)(5) ;
         nRcdExists_1781 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1MA1781( ) ;
            while ( RcdFound1781 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_751781( ) ;
               init_level_properties1781( ) ;
               standaloneNotModal1MA1781( ) ;
               getByPrimaryKey1MA1781( ) ;
               standaloneModal1MA1781( ) ;
               addRow1MA1781( ) ;
               scanNext1MA1781( ) ;
            }
            scanEnd1MA1781( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1781 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_751781( ) ;
      initAll1MA1781( ) ;
      init_level_properties1781( ) ;
      B12994MetPieDfUl = A12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      nRcdExists_1781 = (short)(0) ;
      nIsMod_1781 = (short)(0) ;
      nRcdDeleted_1781 = (short)(0) ;
      nBlankRcdCount1781 = (short)(nBlankRcdUsr1781+nBlankRcdCount1781) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1781 > 0 )
      {
         standaloneNotModal1MA1781( ) ;
         standaloneModal1MA1781( ) ;
         addRow1MA1781( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMetPieDfLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1781 = (short)(nBlankRcdCount1781-1) ;
      }
      Gx_mode = sMode1781 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12994MetPieDfUl = B12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn25.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn25.htm");
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
      e111MA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2809MetTerCod = httpContext.cgiGet( "Z2809MetTerCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2813MetPieCod = httpContext.cgiGet( "Z2813MetPieCod") ;
            Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( "Z2814MetPieKil")) ;
            Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( "Z2815MetPieMet")) ;
            Z12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z12994MetPieDfUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( "O12994MetPieDfUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEKIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2814MetPieKil = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
            }
            else
            {
               A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEMET");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2815MetPieMet = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
            }
            else
            {
               A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
            }
            A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
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
               A2809MetTerCod = httpContext.GetPar( "MetTerCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
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
                        e111MA2 ();
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
            initAll1MA413( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1781_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1781_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1MA413( ) ;
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

   public void confirm_1MA0( )
   {
      beforeValidate1MA413( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1MA413( ) ;
         }
         else
         {
            checkExtendedTable1MA413( ) ;
            if ( AnyError == 0 )
            {
               zm1MA413( 6) ;
               zm1MA413( 7) ;
               zm1MA413( 8) ;
            }
            closeExtendedTableCursors1MA413( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode413 = Gx_mode ;
         confirm_1MA1781( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode413 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1MA0( ) ;
      }
   }

   public void confirm_1MA1781( )
   {
      s12994MetPieDfUl = O12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1MA1781( ) ;
         if ( ( nRcdExists_1781 != 0 ) || ( nIsMod_1781 != 0 ) )
         {
            getKey1MA1781( ) ;
            if ( ( nRcdExists_1781 == 0 ) && ( nRcdDeleted_1781 == 0 ) )
            {
               if ( RcdFound1781 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1MA1781( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1MA1781( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1MA1781( 10) ;
                     }
                     closeExtendedTableCursors1MA1781( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12994MetPieDfUl = A12994MetPieDfUl ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "METPIEDFLI_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMetPieDfLi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1781 != 0 )
               {
                  if ( nRcdDeleted_1781 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1MA1781( ) ;
                     load1MA1781( ) ;
                     beforeValidate1MA1781( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1MA1781( ) ;
                        O12994MetPieDfUl = A12994MetPieDfUl ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1781 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1MA1781( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1MA1781( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1MA1781( 10) ;
                           }
                           closeExtendedTableCursors1MA1781( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12994MetPieDfUl = A12994MetPieDfUl ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1781 == 0 )
                  {
                     GXCCtl = "METPIEDFLI_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieDfLi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1781_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfID_Internalname, GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfDc_Internalname, GXutil.rtrim( A12997MetPieDfDc)) ;
         httpContext.changePostValue( edtMetPieDfMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfFa_Internalname, GXutil.rtrim( A13000MetPieDfFa)) ;
         httpContext.changePostValue( "ZT_"+"Z12995MetPieDfLi_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12998MetPieDfMi_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13000MetPieDfFa_"+sGXsfl_75_idx, GXutil.rtrim( Z13000MetPieDfFa)) ;
         httpContext.changePostValue( "ZT_"+"Z12996MetPieDfID_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1781 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1781_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1781_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFLI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFID_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFDC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFMI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFFA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12994MetPieDfUl = s12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1MA0( )
   {
   }

   public void e111MA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn25_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      ttrn25_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn25_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn25_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn25_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn25_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1MA413( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01MA6_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01MA6_A2815MetPieMet[0] ;
            Z12994MetPieDfUl = T01MA6_A12994MetPieDfUl[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z12994MetPieDfUl = A12994MetPieDfUl ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z12994MetPieDfUl = A12994MetPieDfUl ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z407EmprNom = A407EmprNom ;
         Z228BarUniMed = A228BarUniMed ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
      AV35Pgmname = "TTrn25" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
      /* Using cursor T01MA7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MA7_A407EmprNom[0] ;
      n407EmprNom = T01MA7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01MA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T01MA8_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(6);
      /* Using cursor T01MA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
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

   public void load1MA413( )
   {
      /* Using cursor T01MA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A407EmprNom = T01MA10_A407EmprNom[0] ;
         n407EmprNom = T01MA10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A2814MetPieKil = T01MA10_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01MA10_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A12994MetPieDfUl = T01MA10_A12994MetPieDfUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         A228BarUniMed = T01MA10_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         zm1MA413( -5) ;
      }
      pr_default.close(8);
      onLoadActions1MA413( ) ;
   }

   public void onLoadActions1MA413( )
   {
   }

   public void checkExtendedTable1MA413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1MA413( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1MA413( )
   {
      /* Using cursor T01MA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01MA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01MA6_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01MA6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01MA6_A129BarCod[0] == A129BarCod ) && ( T01MA6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA6_A2809MetTerCod[0], A2809MetTerCod) == 0 ) )
      {
         zm1MA413( 5) ;
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01MA6_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01MA6_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A12994MetPieDfUl = T01MA6_A12994MetPieDfUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         O12994MetPieDfUl = A12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1MA413( ) ;
         if ( AnyError == 1 )
         {
            RcdFound413 = (short)(0) ;
            initializeNonKey1MA413( ) ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1MA413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1MA413( ) ;
      if ( RcdFound413 == 0 )
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
      RcdFound413 = (short)(0) ;
      /* Using cursor T01MA12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01MA12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01MA12_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01MA12_A129BarCod[0] == A129BarCod ) && ( T01MA12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA12_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01MA12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01MA12_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01MA12_A129BarCod[0] == A129BarCod ) && ( T01MA12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA12_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound413 = (short)(0) ;
      /* Using cursor T01MA13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01MA13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01MA13_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01MA13_A129BarCod[0] == A129BarCod ) && ( T01MA13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA13_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01MA13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01MA13_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01MA13_A129BarCod[0] == A129BarCod ) && ( T01MA13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA13_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1MA413( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12994MetPieDfUl = O12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         GX_FocusControl = edtMetPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1MA413( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound413 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12994MetPieDfUl = O12994MetPieDfUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMetPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12994MetPieDfUl = O12994MetPieDfUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
               update1MA413( ) ;
               GX_FocusControl = edtMetPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12994MetPieDfUl = O12994MetPieDfUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
               GX_FocusControl = edtMetPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1MA413( ) ;
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
                  A12994MetPieDfUl = O12994MetPieDfUl ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
                  GX_FocusControl = edtMetPieKil_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1MA413( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12994MetPieDfUl = O12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMetPieKil_Internalname ;
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
      getKey1MA413( ) ;
      if ( RcdFound413 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A2813MetPieCod, Z2813MetPieCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn25");
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1MA0( ) ;
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1MA413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1MA413( ) ;
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
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
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
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
      scanStart1MA413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound413 != 0 )
         {
            scanNext1MA413( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1MA413( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1MA413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MA5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01MA5_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01MA5_A2815MetPieMet[0]) != 0 ) || ( Z12994MetPieDfUl != T01MA5_A12994MetPieDfUl[0] ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01MA5_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01MA5_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01MA5_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01MA5_A2815MetPieMet[0]);
            }
            if ( Z12994MetPieDfUl != T01MA5_A12994MetPieDfUl[0] )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieDfUl");
               GXutil.writeLogRaw("Old: ",Z12994MetPieDfUl);
               GXutil.writeLogRaw("Current: ",T01MA5_A12994MetPieDfUl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MA413( )
   {
      beforeValidate1MA413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MA413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MA413( 0) ;
         checkOptimisticConcurrency1MA413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MA413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MA413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MA14 */
                  pr_default.execute(12, new Object[] {A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, Short.valueOf(A12994MetPieDfUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
                        processLevel1MA413( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1MA0( ) ;
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
            load1MA413( ) ;
         }
         endLevel1MA413( ) ;
      }
      closeExtendedTableCursors1MA413( ) ;
   }

   public void update1MA413( )
   {
      beforeValidate1MA413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MA413( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MA413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MA413( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1MA413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MA15 */
                  pr_default.execute(13, new Object[] {A2814MetPieKil, A2815MetPieMet, Short.valueOf(A12994MetPieDfUl), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1MA413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1MA413( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1MA0( ) ;
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
         endLevel1MA413( ) ;
      }
      closeExtendedTableCursors1MA413( ) ;
   }

   public void deferredUpdate1MA413( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MA413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MA413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MA413( ) ;
         afterConfirm1MA413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MA413( ) ;
            if ( AnyError == 0 )
            {
               A12994MetPieDfUl = O12994MetPieDfUl ;
               httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
               scanStart1MA1781( ) ;
               while ( RcdFound1781 != 0 )
               {
                  getByPrimaryKey1MA1781( ) ;
                  delete1MA1781( ) ;
                  scanNext1MA1781( ) ;
                  O12994MetPieDfUl = A12994MetPieDfUl ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
               }
               scanEnd1MA1781( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MA16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound413 == 0 )
                        {
                           initAll1MA413( ) ;
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
                        resetCaption1MA0( ) ;
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MA413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MA413( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1MA1781( )
   {
      s12994MetPieDfUl = O12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1MA1781( ) ;
         if ( ( nRcdExists_1781 != 0 ) || ( nIsMod_1781 != 0 ) )
         {
            standaloneNotModal1MA1781( ) ;
            getKey1MA1781( ) ;
            if ( ( nRcdExists_1781 == 0 ) && ( nRcdDeleted_1781 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1MA1781( ) ;
            }
            else
            {
               if ( RcdFound1781 != 0 )
               {
                  if ( ( nRcdDeleted_1781 != 0 ) && ( nRcdExists_1781 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1MA1781( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1781 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1MA1781( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1781 == 0 )
                  {
                     GXCCtl = "METPIEDFLI_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieDfLi_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12994MetPieDfUl = A12994MetPieDfUl ;
            httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1781_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfID_Internalname, GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfDc_Internalname, GXutil.rtrim( A12997MetPieDfDc)) ;
         httpContext.changePostValue( edtMetPieDfMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDfFa_Internalname, GXutil.rtrim( A13000MetPieDfFa)) ;
         httpContext.changePostValue( "ZT_"+"Z12995MetPieDfLi_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12998MetPieDfMi_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13000MetPieDfFa_"+sGXsfl_75_idx, GXutil.rtrim( Z13000MetPieDfFa)) ;
         httpContext.changePostValue( "ZT_"+"Z12996MetPieDfID_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1781_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1781 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1781_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1781_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFLI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFID_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFDC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFMI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFFA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1MA1781( ) ;
      if ( AnyError != 0 )
      {
         O12994MetPieDfUl = s12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      }
      nRcdExists_1781 = (short)(0) ;
      nIsMod_1781 = (short)(0) ;
      nRcdDeleted_1781 = (short)(0) ;
   }

   public void processLevel1MA413( )
   {
      /* Save parent mode. */
      sMode413 = Gx_mode ;
      processNestedLevel1MA1781( ) ;
      if ( AnyError != 0 )
      {
         O12994MetPieDfUl = s12994MetPieDfUl ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01MA17 */
      pr_default.execute(15, new Object[] {Short.valueOf(A12994MetPieDfUl), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
   }

   public void endLevel1MA413( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1MA413( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn25");
         if ( AnyError == 0 )
         {
            confirmValues1MA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn25");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1MA413( )
   {
      /* Scan By routine */
      /* Using cursor T01MA18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MA413( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
   }

   public void scanEnd1MA413( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1MA413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MA413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MA413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MA413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MA413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MA413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MA413( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), true);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), true);
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
   }

   public void zm1MA1781( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12998MetPieDfMi = T01MA3_A12998MetPieDfMi[0] ;
            Z13000MetPieDfFa = T01MA3_A13000MetPieDfFa[0] ;
            Z12996MetPieDfID = T01MA3_A12996MetPieDfID[0] ;
         }
         else
         {
            Z12998MetPieDfMi = A12998MetPieDfMi ;
            Z13000MetPieDfFa = A13000MetPieDfFa ;
            Z12996MetPieDfID = A12996MetPieDfID ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z12995MetPieDfLi = A12995MetPieDfLi ;
         Z12998MetPieDfMi = A12998MetPieDfMi ;
         Z13000MetPieDfFa = A13000MetPieDfFa ;
         Z396EmprCod = A396EmprCod ;
         Z12996MetPieDfID = A12996MetPieDfID ;
         Z12997MetPieDfDc = A12997MetPieDfDc ;
      }
   }

   public void standaloneNotModal1MA1781( )
   {
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), true);
   }

   public void standaloneModal1MA1781( )
   {
      if ( isIns( )  )
      {
         A12994MetPieDfUl = (short)(O12994MetPieDfUl+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12995MetPieDfLi = A12994MetPieDfUl ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieDfLi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtMetPieDfLi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1MA1781( )
   {
      /* Using cursor T01MA19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A12997MetPieDfDc = T01MA19_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = T01MA19_n12997MetPieDfDc[0] ;
         A12998MetPieDfMi = T01MA19_A12998MetPieDfMi[0] ;
         A13000MetPieDfFa = T01MA19_A13000MetPieDfFa[0] ;
         A12996MetPieDfID = T01MA19_A12996MetPieDfID[0] ;
         zm1MA1781( -9) ;
      }
      pr_default.close(17);
      onLoadActions1MA1781( ) ;
   }

   public void onLoadActions1MA1781( )
   {
   }

   public void checkExtendedTable1MA1781( )
   {
      nIsDirty_1781 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1MA1781( ) ;
      /* Using cursor T01MA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "METPIEDFID_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12997MetPieDfDc = T01MA4_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01MA4_n12997MetPieDfDc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1MA1781( )
   {
      pr_default.close(2);
   }

   public void enableDisable1MA1781( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          short A12996MetPieDfID )
   {
      /* Using cursor T01MA20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "METPIEDFID_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A12997MetPieDfDc = T01MA20_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01MA20_n12997MetPieDfDc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12997MetPieDfDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1MA1781( )
   {
      /* Using cursor T01MA21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1781 = (short)(1) ;
      }
      else
      {
         RcdFound1781 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1MA1781( )
   {
      /* Using cursor T01MA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01MA3_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01MA3_A129BarCod[0] == A129BarCod ) && ( T01MA3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01MA3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01MA3_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01MA3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1MA1781( 9) ;
         RcdFound1781 = (short)(1) ;
         initializeNonKey1MA1781( ) ;
         A12995MetPieDfLi = T01MA3_A12995MetPieDfLi[0] ;
         A12998MetPieDfMi = T01MA3_A12998MetPieDfMi[0] ;
         A13000MetPieDfFa = T01MA3_A13000MetPieDfFa[0] ;
         A12996MetPieDfID = T01MA3_A12996MetPieDfID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z12995MetPieDfLi = A12995MetPieDfLi ;
         sMode1781 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MA1781( ) ;
         load1MA1781( ) ;
         Gx_mode = sMode1781 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1781 = (short)(0) ;
         initializeNonKey1MA1781( ) ;
         sMode1781 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1MA1781( ) ;
         Gx_mode = sMode1781 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1MA1781( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1MA1781( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01MA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMETPID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12998MetPieDfMi, T01MA2_A12998MetPieDfMi[0]) != 0 ) || ( GXutil.strcmp(Z13000MetPieDfFa, T01MA2_A13000MetPieDfFa[0]) != 0 ) || ( Z12996MetPieDfID != T01MA2_A12996MetPieDfID[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12998MetPieDfMi, T01MA2_A12998MetPieDfMi[0]) != 0 )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieDfMi");
               GXutil.writeLogRaw("Old: ",Z12998MetPieDfMi);
               GXutil.writeLogRaw("Current: ",T01MA2_A12998MetPieDfMi[0]);
            }
            if ( GXutil.strcmp(Z13000MetPieDfFa, T01MA2_A13000MetPieDfFa[0]) != 0 )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieDfFa");
               GXutil.writeLogRaw("Old: ",Z13000MetPieDfFa);
               GXutil.writeLogRaw("Current: ",T01MA2_A13000MetPieDfFa[0]);
            }
            if ( Z12996MetPieDfID != T01MA2_A12996MetPieDfID[0] )
            {
               GXutil.writeLogln("ttrn25:[seudo value changed for attri]"+"MetPieDfID");
               GXutil.writeLogRaw("Old: ",Z12996MetPieDfID);
               GXutil.writeLogRaw("Current: ",T01MA2_A12996MetPieDfID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMETPID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1MA1781( )
   {
      beforeValidate1MA1781( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MA1781( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1MA1781( 0) ;
         checkOptimisticConcurrency1MA1781( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1MA1781( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1MA1781( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01MA22 */
                  pr_default.execute(20, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi), A12998MetPieDfMi, A13000MetPieDfFa, A396EmprCod, Short.valueOf(A12996MetPieDfID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
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
            load1MA1781( ) ;
         }
         endLevel1MA1781( ) ;
      }
      closeExtendedTableCursors1MA1781( ) ;
   }

   public void update1MA1781( )
   {
      beforeValidate1MA1781( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1MA1781( ) ;
      }
      if ( ( nIsMod_1781 != 0 ) || ( nIsDirty_1781 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1MA1781( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1MA1781( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1MA1781( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01MA23 */
                     pr_default.execute(21, new Object[] {A12998MetPieDfMi, A13000MetPieDfFa, Short.valueOf(A12996MetPieDfID), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMETPID"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1MA1781( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1MA1781( ) ;
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
            endLevel1MA1781( ) ;
         }
      }
      closeExtendedTableCursors1MA1781( ) ;
   }

   public void deferredUpdate1MA1781( )
   {
   }

   public void delete1MA1781( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1MA1781( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1MA1781( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1MA1781( ) ;
         afterConfirm1MA1781( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1MA1781( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01MA24 */
               pr_default.execute(22, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, Short.valueOf(A12995MetPieDfLi)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETPID");
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
      sMode1781 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1MA1781( ) ;
      Gx_mode = sMode1781 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1MA1781( )
   {
      standaloneModal1MA1781( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01MA25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
         A12997MetPieDfDc = T01MA25_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = T01MA25_n12997MetPieDfDc[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel1MA1781( )
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

   public void scanStart1MA1781( )
   {
      /* Scan By routine */
      /* Using cursor T01MA26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      RcdFound1781 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A12995MetPieDfLi = T01MA26_A12995MetPieDfLi[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1MA1781( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1781 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1781 = (short)(1) ;
         A12995MetPieDfLi = T01MA26_A12995MetPieDfLi[0] ;
      }
   }

   public void scanEnd1MA1781( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1MA1781( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1MA1781( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1MA1781( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1MA1781( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1MA1781( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1MA1781( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1MA1781( )
   {
      edtMetPieDfLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDfID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfID_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDfDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfDc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDfMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfMi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDfFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfFa_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1MA1781( )
   {
   }

   public void send_integrity_lvl_hashes1MA413( )
   {
   }

   public void subsflControlProps_751781( )
   {
      edtavnRcdDeleted_1781_Internalname = "vNRCDDELETED_1781_"+sGXsfl_75_idx ;
      edtMetPieDfLi_Internalname = "METPIEDFLI_"+sGXsfl_75_idx ;
      edtMetPieDfID_Internalname = "METPIEDFID_"+sGXsfl_75_idx ;
      edtMetPieDfDc_Internalname = "METPIEDFDC_"+sGXsfl_75_idx ;
      edtMetPieDfMi_Internalname = "METPIEDFMI_"+sGXsfl_75_idx ;
      edtMetPieDfFa_Internalname = "METPIEDFFA_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_751781( )
   {
      edtavnRcdDeleted_1781_Internalname = "vNRCDDELETED_1781_"+sGXsfl_75_fel_idx ;
      edtMetPieDfLi_Internalname = "METPIEDFLI_"+sGXsfl_75_fel_idx ;
      edtMetPieDfID_Internalname = "METPIEDFID_"+sGXsfl_75_fel_idx ;
      edtMetPieDfDc_Internalname = "METPIEDFDC_"+sGXsfl_75_fel_idx ;
      edtMetPieDfMi_Internalname = "METPIEDFMI_"+sGXsfl_75_fel_idx ;
      edtMetPieDfFa_Internalname = "METPIEDFFA_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1MA1781( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751781( ) ;
      sendRow1MA1781( ) ;
   }

   public void sendRow1MA1781( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1781_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1781_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1781_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1781), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1781), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1781_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1781_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1781_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfLi_Internalname,GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12995MetPieDfLi), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfLi_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1781_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfID_Internalname,GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDfID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12996MetPieDfID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12996MetPieDfID), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfID_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfDc_Internalname,GXutil.rtrim( A12997MetPieDfDc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfDc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1781_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfMi_Internalname,GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDfMi_Enabled!=0) ? localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99") : localUtil.format( A12998MetPieDfMi, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfMi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1781_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfFa_Internalname,GXutil.rtrim( A13000MetPieDfFa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfFa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfFa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1MA1781( ) ;
      GXCCtl = "Z12995MetPieDfLi_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12995MetPieDfLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12998MetPieDfMi_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12998MetPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13000MetPieDfFa_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13000MetPieDfFa));
      GXCCtl = "Z12996MetPieDfID_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12996MetPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1781_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1781_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1781_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1781, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFASCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33Fascod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1781_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1781_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFLI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFID_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFDC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFMI_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFFA_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1MA1781( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751781( ) ;
      edtavnRcdDeleted_1781_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1781_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFLI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFID_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFDC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFMI_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFFA_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1781_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1781_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1781");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1781_Internalname ;
         wbErr = true ;
         nRcdDeleted_1781 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1781 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1781_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "METPIEDFLI_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfLi_Internalname ;
         wbErr = true ;
         A12995MetPieDfLi = (short)(0) ;
      }
      else
      {
         A12995MetPieDfLi = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "METPIEDFID_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfID_Internalname ;
         wbErr = true ;
         A12996MetPieDfID = (short)(0) ;
      }
      else
      {
         A12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12997MetPieDfDc = httpContext.cgiGet( edtMetPieDfDc_Internalname) ;
      n12997MetPieDfDc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEDFMI_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfMi_Internalname ;
         wbErr = true ;
         A12998MetPieDfMi = DecimalUtil.ZERO ;
      }
      else
      {
         A12998MetPieDfMi = localUtil.ctond( httpContext.cgiGet( edtMetPieDfMi_Internalname)) ;
      }
      A13000MetPieDfFa = httpContext.cgiGet( edtMetPieDfFa_Internalname) ;
      GXCCtl = "Z12995MetPieDfLi_" + sGXsfl_75_idx ;
      Z12995MetPieDfLi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12998MetPieDfMi_" + sGXsfl_75_idx ;
      Z12998MetPieDfMi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13000MetPieDfFa_" + sGXsfl_75_idx ;
      Z13000MetPieDfFa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12996MetPieDfID_" + sGXsfl_75_idx ;
      Z12996MetPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1781_" + sGXsfl_75_idx ;
      nRcdDeleted_1781 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1781_" + sGXsfl_75_idx ;
      nRcdExists_1781 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1781_" + sGXsfl_75_idx ;
      nIsMod_1781 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieDfLi_Enabled = edtMetPieDfLi_Enabled ;
   }

   public void confirmValues1MA0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_751781( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751781( ) ;
         httpContext.changePostValue( "Z12995MetPieDfLi_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z12995MetPieDfLi_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12995MetPieDfLi_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z12998MetPieDfMi_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z12998MetPieDfMi_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12998MetPieDfMi_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13000MetPieDfFa_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13000MetPieDfFa_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13000MetPieDfFa_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z12996MetPieDfID_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z12996MetPieDfID_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12996MetPieDfID_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( O12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV33Fascod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn25" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pruebas tabla DEFECTOS", "") ;
   }

   public void initializeNonKey1MA413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
      A2815MetPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
      A12994MetPieDfUl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      O12994MetPieDfUl = A12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z12994MetPieDfUl = (short)(0) ;
   }

   public void initAll1MA413( )
   {
      initializeNonKey1MA413( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1MA1781( )
   {
      A12996MetPieDfID = (short)(0) ;
      A12997MetPieDfDc = "" ;
      n12997MetPieDfDc = false ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      Z12998MetPieDfMi = DecimalUtil.ZERO ;
      Z13000MetPieDfFa = "" ;
      Z12996MetPieDfID = (short)(0) ;
   }

   public void initAll1MA1781( )
   {
      A12995MetPieDfLi = (short)(0) ;
      initializeNonKey1MA1781( ) ;
   }

   public void standaloneModalInsert1MA1781( )
   {
      A12994MetPieDfUl = i12994MetPieDfUl ;
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12994MetPieDfUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241595169", true, true);
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
      httpContext.AddJavascriptSource("ttrn25.js", "?20268241595169", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1781( )
   {
      edtMetPieDfLi_Enabled = defedtMetPieDfLi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfLi_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1781, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1781_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12995MetPieDfLi, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12996MetPieDfID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12997MetPieDfDc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12998MetPieDfMi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13000MetPieDfFa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfFa_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMetPieDfUl_Internalname = "METPIEDFUL" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      edtavnRcdDeleted_1781_Internalname = "vNRCDDELETED_1781" ;
      edtMetPieDfLi_Internalname = "METPIEDFLI" ;
      edtMetPieDfID_Internalname = "METPIEDFID" ;
      edtMetPieDfDc_Internalname = "METPIEDFDC" ;
      edtMetPieDfMi_Internalname = "METPIEDFMI" ;
      edtMetPieDfFa_Internalname = "METPIEDFFA" ;
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
      Form.setCaption( httpContext.getMessage( "Pruebas tabla DEFECTOS", "") );
      edtMetPieDfFa_Jsonclick = "" ;
      edtMetPieDfMi_Jsonclick = "" ;
      edtMetPieDfDc_Jsonclick = "" ;
      edtMetPieDfID_Jsonclick = "" ;
      edtMetPieDfLi_Jsonclick = "" ;
      edtavnRcdDeleted_1781_Jsonclick = "" ;
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
      edtMetPieDfFa_Enabled = 1 ;
      edtMetPieDfMi_Enabled = 1 ;
      edtMetPieDfDc_Enabled = 0 ;
      edtMetPieDfID_Enabled = 1 ;
      edtMetPieDfLi_Enabled = 1 ;
      edtavnRcdDeleted_1781_Enabled = 1 ;
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtBarUniMed_Enabled = 0 ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieDfUl_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieDfUl_Enabled = 0 ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieMet_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieKil_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieKil_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMetPieCod_Jsonclick = "" ;
      edtMetPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
      edtMetTerCod_Jsonclick = "" ;
      edtMetTerCod_Backcolor = (int)(0xFFFFFF) ;
      edtMetTerCod_Enabled = 0 ;
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
      subsflControlProps_751781( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1MA1781( ) ;
         standaloneModal1MA1781( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1MA1781( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_751781( ) ;
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
      /* Using cursor T01MA27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01MA27_A407EmprNom[0] ;
      n407EmprNom = T01MA27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01MA28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T01MA28_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(26);
      /* Using cursor T01MA29 */
      pr_default.execute(27, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(27);
      GX_FocusControl = edtMetPieKil_Internalname ;
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

   public void valid_Metpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", GXutil.rtrim( A228BarUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z228BarUniMed", GXutil.rtrim( Z228BarUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "O12994MetPieDfUl", GXutil.ltrim( localUtil.ntoc( O12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Metpiedfid( )
   {
      n12997MetPieDfDc = false ;
      /* Using cursor T01MA25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A12996MetPieDfID)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Defectos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METPIEDFID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfID_Internalname ;
      }
      A12997MetPieDfDc = T01MA25_A12997MetPieDfDc[0] ;
      n12997MetPieDfDc = T01MA25_n12997MetPieDfDc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12997MetPieDfDc", GXutil.rtrim( A12997MetPieDfDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV33Fascod',fld:'vFASCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12994MetPieDfUl',fld:'METPIEDFUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_METPIECOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A12994MetPieDfUl',fld:'METPIEDFUL',pic:'ZZZ9'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2813MetPieCod'},{av:'Z407EmprNom'},{av:'Z2814MetPieKil'},{av:'Z2815MetPieMet'},{av:'Z12994MetPieDfUl'},{av:'Z228BarUniMed'},{av:'O12994MetPieDfUl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_METPIEDFUL","{handler:'valid_Metpiedful',iparms:[]");
      setEventMetadata("VALID_METPIEDFUL",",oparms:[]}");
      setEventMetadata("VALID_METPIEDFLI","{handler:'valid_Metpiedfli',iparms:[]");
      setEventMetadata("VALID_METPIEDFLI",",oparms:[]}");
      setEventMetadata("VALID_METPIEDFID","{handler:'valid_Metpiedfid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12996MetPieDfID',fld:'METPIEDFID',pic:'ZZZ9'},{av:'A12997MetPieDfDc',fld:'METPIEDFDC',pic:''}]");
      setEventMetadata("VALID_METPIEDFID",",oparms:[{av:'A12997MetPieDfDc',fld:'METPIEDFDC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Metpiedffa',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2809MetTerCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA2813MetPieCod = "" ;
      wcpOAV33Fascod = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z12998MetPieDfMi = DecimalUtil.ZERO ;
      Z13000MetPieDfFa = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      AV33Fascod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A228BarUniMed = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1781 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode413 = "" ;
      GXCCtl = "" ;
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z228BarUniMed = "" ;
      T01MA7_A407EmprNom = new String[] {""} ;
      T01MA7_n407EmprNom = new boolean[] {false} ;
      T01MA8_A228BarUniMed = new String[] {""} ;
      T01MA9_A396EmprCod = new String[] {""} ;
      T01MA10_A2813MetPieCod = new String[] {""} ;
      T01MA10_A407EmprNom = new String[] {""} ;
      T01MA10_n407EmprNom = new boolean[] {false} ;
      T01MA10_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA10_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA10_A12994MetPieDfUl = new short[1] ;
      T01MA10_A228BarUniMed = new String[] {""} ;
      T01MA10_A396EmprCod = new String[] {""} ;
      T01MA10_A129BarCod = new int[1] ;
      T01MA10_A132BarCodReo = new byte[1] ;
      T01MA10_A130BarCodPar = new String[] {""} ;
      T01MA10_A2809MetTerCod = new String[] {""} ;
      T01MA11_A396EmprCod = new String[] {""} ;
      T01MA11_A2809MetTerCod = new String[] {""} ;
      T01MA11_A129BarCod = new int[1] ;
      T01MA11_A132BarCodReo = new byte[1] ;
      T01MA11_A130BarCodPar = new String[] {""} ;
      T01MA11_A2813MetPieCod = new String[] {""} ;
      T01MA6_A2813MetPieCod = new String[] {""} ;
      T01MA6_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA6_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA6_A12994MetPieDfUl = new short[1] ;
      T01MA6_A396EmprCod = new String[] {""} ;
      T01MA6_A129BarCod = new int[1] ;
      T01MA6_A132BarCodReo = new byte[1] ;
      T01MA6_A130BarCodPar = new String[] {""} ;
      T01MA6_A2809MetTerCod = new String[] {""} ;
      T01MA12_A396EmprCod = new String[] {""} ;
      T01MA12_A2809MetTerCod = new String[] {""} ;
      T01MA12_A129BarCod = new int[1] ;
      T01MA12_A132BarCodReo = new byte[1] ;
      T01MA12_A130BarCodPar = new String[] {""} ;
      T01MA12_A2813MetPieCod = new String[] {""} ;
      T01MA13_A396EmprCod = new String[] {""} ;
      T01MA13_A2809MetTerCod = new String[] {""} ;
      T01MA13_A129BarCod = new int[1] ;
      T01MA13_A132BarCodReo = new byte[1] ;
      T01MA13_A130BarCodPar = new String[] {""} ;
      T01MA13_A2813MetPieCod = new String[] {""} ;
      T01MA5_A2813MetPieCod = new String[] {""} ;
      T01MA5_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA5_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA5_A12994MetPieDfUl = new short[1] ;
      T01MA5_A396EmprCod = new String[] {""} ;
      T01MA5_A129BarCod = new int[1] ;
      T01MA5_A132BarCodReo = new byte[1] ;
      T01MA5_A130BarCodPar = new String[] {""} ;
      T01MA5_A2809MetTerCod = new String[] {""} ;
      T01MA18_A396EmprCod = new String[] {""} ;
      T01MA18_A2809MetTerCod = new String[] {""} ;
      T01MA18_A129BarCod = new int[1] ;
      T01MA18_A132BarCodReo = new byte[1] ;
      T01MA18_A130BarCodPar = new String[] {""} ;
      T01MA18_A2813MetPieCod = new String[] {""} ;
      Z12997MetPieDfDc = "" ;
      T01MA19_A2809MetTerCod = new String[] {""} ;
      T01MA19_A129BarCod = new int[1] ;
      T01MA19_A132BarCodReo = new byte[1] ;
      T01MA19_A130BarCodPar = new String[] {""} ;
      T01MA19_A2813MetPieCod = new String[] {""} ;
      T01MA19_A12995MetPieDfLi = new short[1] ;
      T01MA19_A12997MetPieDfDc = new String[] {""} ;
      T01MA19_n12997MetPieDfDc = new boolean[] {false} ;
      T01MA19_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA19_A13000MetPieDfFa = new String[] {""} ;
      T01MA19_A396EmprCod = new String[] {""} ;
      T01MA19_A12996MetPieDfID = new short[1] ;
      T01MA4_A12997MetPieDfDc = new String[] {""} ;
      T01MA4_n12997MetPieDfDc = new boolean[] {false} ;
      T01MA20_A12997MetPieDfDc = new String[] {""} ;
      T01MA20_n12997MetPieDfDc = new boolean[] {false} ;
      T01MA21_A396EmprCod = new String[] {""} ;
      T01MA21_A2809MetTerCod = new String[] {""} ;
      T01MA21_A129BarCod = new int[1] ;
      T01MA21_A132BarCodReo = new byte[1] ;
      T01MA21_A130BarCodPar = new String[] {""} ;
      T01MA21_A2813MetPieCod = new String[] {""} ;
      T01MA21_A12995MetPieDfLi = new short[1] ;
      T01MA3_A2809MetTerCod = new String[] {""} ;
      T01MA3_A129BarCod = new int[1] ;
      T01MA3_A132BarCodReo = new byte[1] ;
      T01MA3_A130BarCodPar = new String[] {""} ;
      T01MA3_A2813MetPieCod = new String[] {""} ;
      T01MA3_A12995MetPieDfLi = new short[1] ;
      T01MA3_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA3_A13000MetPieDfFa = new String[] {""} ;
      T01MA3_A396EmprCod = new String[] {""} ;
      T01MA3_A12996MetPieDfID = new short[1] ;
      T01MA2_A2809MetTerCod = new String[] {""} ;
      T01MA2_A129BarCod = new int[1] ;
      T01MA2_A132BarCodReo = new byte[1] ;
      T01MA2_A130BarCodPar = new String[] {""} ;
      T01MA2_A2813MetPieCod = new String[] {""} ;
      T01MA2_A12995MetPieDfLi = new short[1] ;
      T01MA2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01MA2_A13000MetPieDfFa = new String[] {""} ;
      T01MA2_A396EmprCod = new String[] {""} ;
      T01MA2_A12996MetPieDfID = new short[1] ;
      T01MA25_A12997MetPieDfDc = new String[] {""} ;
      T01MA25_n12997MetPieDfDc = new boolean[] {false} ;
      T01MA26_A396EmprCod = new String[] {""} ;
      T01MA26_A2809MetTerCod = new String[] {""} ;
      T01MA26_A129BarCod = new int[1] ;
      T01MA26_A132BarCodReo = new byte[1] ;
      T01MA26_A130BarCodPar = new String[] {""} ;
      T01MA26_A2813MetPieCod = new String[] {""} ;
      T01MA26_A12995MetPieDfLi = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01MA27_A407EmprNom = new String[] {""} ;
      T01MA27_n407EmprNom = new boolean[] {false} ;
      T01MA28_A228BarUniMed = new String[] {""} ;
      T01MA29_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2813MetPieCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ2814MetPieKil = DecimalUtil.ZERO ;
      ZZ2815MetPieMet = DecimalUtil.ZERO ;
      ZZ228BarUniMed = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn25__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn25__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn25__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn25__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn25__default(),
         new Object[] {
             new Object[] {
            T01MA2_A2809MetTerCod, T01MA2_A129BarCod, T01MA2_A132BarCodReo, T01MA2_A130BarCodPar, T01MA2_A2813MetPieCod, T01MA2_A12995MetPieDfLi, T01MA2_A12998MetPieDfMi, T01MA2_A13000MetPieDfFa, T01MA2_A396EmprCod, T01MA2_A12996MetPieDfID
            }
            , new Object[] {
            T01MA3_A2809MetTerCod, T01MA3_A129BarCod, T01MA3_A132BarCodReo, T01MA3_A130BarCodPar, T01MA3_A2813MetPieCod, T01MA3_A12995MetPieDfLi, T01MA3_A12998MetPieDfMi, T01MA3_A13000MetPieDfFa, T01MA3_A396EmprCod, T01MA3_A12996MetPieDfID
            }
            , new Object[] {
            T01MA4_A12997MetPieDfDc, T01MA4_n12997MetPieDfDc
            }
            , new Object[] {
            T01MA5_A2813MetPieCod, T01MA5_A2814MetPieKil, T01MA5_A2815MetPieMet, T01MA5_A12994MetPieDfUl, T01MA5_A396EmprCod, T01MA5_A129BarCod, T01MA5_A132BarCodReo, T01MA5_A130BarCodPar, T01MA5_A2809MetTerCod
            }
            , new Object[] {
            T01MA6_A2813MetPieCod, T01MA6_A2814MetPieKil, T01MA6_A2815MetPieMet, T01MA6_A12994MetPieDfUl, T01MA6_A396EmprCod, T01MA6_A129BarCod, T01MA6_A132BarCodReo, T01MA6_A130BarCodPar, T01MA6_A2809MetTerCod
            }
            , new Object[] {
            T01MA7_A407EmprNom, T01MA7_n407EmprNom
            }
            , new Object[] {
            T01MA8_A228BarUniMed
            }
            , new Object[] {
            T01MA9_A396EmprCod
            }
            , new Object[] {
            T01MA10_A2813MetPieCod, T01MA10_A407EmprNom, T01MA10_n407EmprNom, T01MA10_A2814MetPieKil, T01MA10_A2815MetPieMet, T01MA10_A12994MetPieDfUl, T01MA10_A228BarUniMed, T01MA10_A396EmprCod, T01MA10_A129BarCod, T01MA10_A132BarCodReo,
            T01MA10_A130BarCodPar, T01MA10_A2809MetTerCod
            }
            , new Object[] {
            T01MA11_A396EmprCod, T01MA11_A2809MetTerCod, T01MA11_A129BarCod, T01MA11_A132BarCodReo, T01MA11_A130BarCodPar, T01MA11_A2813MetPieCod
            }
            , new Object[] {
            T01MA12_A396EmprCod, T01MA12_A2809MetTerCod, T01MA12_A129BarCod, T01MA12_A132BarCodReo, T01MA12_A130BarCodPar, T01MA12_A2813MetPieCod
            }
            , new Object[] {
            T01MA13_A396EmprCod, T01MA13_A2809MetTerCod, T01MA13_A129BarCod, T01MA13_A132BarCodReo, T01MA13_A130BarCodPar, T01MA13_A2813MetPieCod
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
            T01MA18_A396EmprCod, T01MA18_A2809MetTerCod, T01MA18_A129BarCod, T01MA18_A132BarCodReo, T01MA18_A130BarCodPar, T01MA18_A2813MetPieCod
            }
            , new Object[] {
            T01MA19_A2809MetTerCod, T01MA19_A129BarCod, T01MA19_A132BarCodReo, T01MA19_A130BarCodPar, T01MA19_A2813MetPieCod, T01MA19_A12995MetPieDfLi, T01MA19_A12997MetPieDfDc, T01MA19_n12997MetPieDfDc, T01MA19_A12998MetPieDfMi, T01MA19_A13000MetPieDfFa,
            T01MA19_A396EmprCod, T01MA19_A12996MetPieDfID
            }
            , new Object[] {
            T01MA20_A12997MetPieDfDc, T01MA20_n12997MetPieDfDc
            }
            , new Object[] {
            T01MA21_A396EmprCod, T01MA21_A2809MetTerCod, T01MA21_A129BarCod, T01MA21_A132BarCodReo, T01MA21_A130BarCodPar, T01MA21_A2813MetPieCod, T01MA21_A12995MetPieDfLi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01MA25_A12997MetPieDfDc, T01MA25_n12997MetPieDfDc
            }
            , new Object[] {
            T01MA26_A396EmprCod, T01MA26_A2809MetTerCod, T01MA26_A129BarCod, T01MA26_A132BarCodReo, T01MA26_A130BarCodPar, T01MA26_A2813MetPieCod, T01MA26_A12995MetPieDfLi
            }
            , new Object[] {
            T01MA27_A407EmprNom, T01MA27_n407EmprNom
            }
            , new Object[] {
            T01MA28_A228BarUniMed
            }
            , new Object[] {
            T01MA29_A396EmprCod
            }
         }
      );
      Z2813MetPieCod = "" ;
      A2813MetPieCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z2809MetTerCod = "" ;
      A2809MetTerCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TTrn25" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z12994MetPieDfUl ;
   private short O12994MetPieDfUl ;
   private short Z12995MetPieDfLi ;
   private short Z12996MetPieDfID ;
   private short nRcdDeleted_1781 ;
   private short nRcdExists_1781 ;
   private short nIsMod_1781 ;
   private short A12996MetPieDfID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12994MetPieDfUl ;
   private short nBlankRcdCount1781 ;
   private short RcdFound1781 ;
   private short B12994MetPieDfUl ;
   private short nBlankRcdUsr1781 ;
   private short s12994MetPieDfUl ;
   private short A12995MetPieDfLi ;
   private short RcdFound413 ;
   private short nIsDirty_413 ;
   private short nIsDirty_1781 ;
   private short i12994MetPieDfUl ;
   private short ZZ12994MetPieDfUl ;
   private short ZO12994MetPieDfUl ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieDfUl_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int edtavnRcdDeleted_1781_Enabled ;
   private int edtMetPieDfLi_Enabled ;
   private int edtMetPieDfID_Enabled ;
   private int edtMetPieDfDc_Enabled ;
   private int edtMetPieDfMi_Enabled ;
   private int edtMetPieDfFa_Enabled ;
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
   private int defedtMetPieDfLi_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarUniMed_Backcolor ;
   private int edtMetPieDfUl_Backcolor ;
   private int edtMetPieMet_Backcolor ;
   private int edtMetPieKil_Backcolor ;
   private int edtMetPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtMetTerCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z12998MetPieDfMi ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal ZZ2814MetPieKil ;
   private java.math.BigDecimal ZZ2815MetPieMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2809MetTerCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA2813MetPieCod ;
   private String wcpOAV33Fascod ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z13000MetPieDfFa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV33Fascod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMetPieKil_Internalname ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieMet_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMetPieDfUl_Internalname ;
   private String edtMetPieDfUl_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String sMode1781 ;
   private String edtavnRcdDeleted_1781_Internalname ;
   private String edtMetPieDfLi_Internalname ;
   private String edtMetPieDfID_Internalname ;
   private String edtMetPieDfDc_Internalname ;
   private String edtMetPieDfMi_Internalname ;
   private String edtMetPieDfFa_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode413 ;
   private String GXCCtl ;
   private String A12997MetPieDfDc ;
   private String A13000MetPieDfFa ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z228BarUniMed ;
   private String Z12997MetPieDfDc ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1781_Jsonclick ;
   private String edtMetPieDfLi_Jsonclick ;
   private String edtMetPieDfID_Jsonclick ;
   private String edtMetPieDfDc_Jsonclick ;
   private String edtMetPieDfMi_Jsonclick ;
   private String edtMetPieDfFa_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2813MetPieCod ;
   private String ZZ407EmprNom ;
   private String ZZ228BarUniMed ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n12997MetPieDfDc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01MA7_A407EmprNom ;
   private boolean[] T01MA7_n407EmprNom ;
   private String[] T01MA8_A228BarUniMed ;
   private String[] T01MA9_A396EmprCod ;
   private String[] T01MA10_A2813MetPieCod ;
   private String[] T01MA10_A407EmprNom ;
   private boolean[] T01MA10_n407EmprNom ;
   private java.math.BigDecimal[] T01MA10_A2814MetPieKil ;
   private java.math.BigDecimal[] T01MA10_A2815MetPieMet ;
   private short[] T01MA10_A12994MetPieDfUl ;
   private String[] T01MA10_A228BarUniMed ;
   private String[] T01MA10_A396EmprCod ;
   private int[] T01MA10_A129BarCod ;
   private byte[] T01MA10_A132BarCodReo ;
   private String[] T01MA10_A130BarCodPar ;
   private String[] T01MA10_A2809MetTerCod ;
   private String[] T01MA11_A396EmprCod ;
   private String[] T01MA11_A2809MetTerCod ;
   private int[] T01MA11_A129BarCod ;
   private byte[] T01MA11_A132BarCodReo ;
   private String[] T01MA11_A130BarCodPar ;
   private String[] T01MA11_A2813MetPieCod ;
   private String[] T01MA6_A2813MetPieCod ;
   private java.math.BigDecimal[] T01MA6_A2814MetPieKil ;
   private java.math.BigDecimal[] T01MA6_A2815MetPieMet ;
   private short[] T01MA6_A12994MetPieDfUl ;
   private String[] T01MA6_A396EmprCod ;
   private int[] T01MA6_A129BarCod ;
   private byte[] T01MA6_A132BarCodReo ;
   private String[] T01MA6_A130BarCodPar ;
   private String[] T01MA6_A2809MetTerCod ;
   private String[] T01MA12_A396EmprCod ;
   private String[] T01MA12_A2809MetTerCod ;
   private int[] T01MA12_A129BarCod ;
   private byte[] T01MA12_A132BarCodReo ;
   private String[] T01MA12_A130BarCodPar ;
   private String[] T01MA12_A2813MetPieCod ;
   private String[] T01MA13_A396EmprCod ;
   private String[] T01MA13_A2809MetTerCod ;
   private int[] T01MA13_A129BarCod ;
   private byte[] T01MA13_A132BarCodReo ;
   private String[] T01MA13_A130BarCodPar ;
   private String[] T01MA13_A2813MetPieCod ;
   private String[] T01MA5_A2813MetPieCod ;
   private java.math.BigDecimal[] T01MA5_A2814MetPieKil ;
   private java.math.BigDecimal[] T01MA5_A2815MetPieMet ;
   private short[] T01MA5_A12994MetPieDfUl ;
   private String[] T01MA5_A396EmprCod ;
   private int[] T01MA5_A129BarCod ;
   private byte[] T01MA5_A132BarCodReo ;
   private String[] T01MA5_A130BarCodPar ;
   private String[] T01MA5_A2809MetTerCod ;
   private String[] T01MA18_A396EmprCod ;
   private String[] T01MA18_A2809MetTerCod ;
   private int[] T01MA18_A129BarCod ;
   private byte[] T01MA18_A132BarCodReo ;
   private String[] T01MA18_A130BarCodPar ;
   private String[] T01MA18_A2813MetPieCod ;
   private String[] T01MA19_A2809MetTerCod ;
   private int[] T01MA19_A129BarCod ;
   private byte[] T01MA19_A132BarCodReo ;
   private String[] T01MA19_A130BarCodPar ;
   private String[] T01MA19_A2813MetPieCod ;
   private short[] T01MA19_A12995MetPieDfLi ;
   private String[] T01MA19_A12997MetPieDfDc ;
   private boolean[] T01MA19_n12997MetPieDfDc ;
   private java.math.BigDecimal[] T01MA19_A12998MetPieDfMi ;
   private String[] T01MA19_A13000MetPieDfFa ;
   private String[] T01MA19_A396EmprCod ;
   private short[] T01MA19_A12996MetPieDfID ;
   private String[] T01MA4_A12997MetPieDfDc ;
   private boolean[] T01MA4_n12997MetPieDfDc ;
   private String[] T01MA20_A12997MetPieDfDc ;
   private boolean[] T01MA20_n12997MetPieDfDc ;
   private String[] T01MA21_A396EmprCod ;
   private String[] T01MA21_A2809MetTerCod ;
   private int[] T01MA21_A129BarCod ;
   private byte[] T01MA21_A132BarCodReo ;
   private String[] T01MA21_A130BarCodPar ;
   private String[] T01MA21_A2813MetPieCod ;
   private short[] T01MA21_A12995MetPieDfLi ;
   private String[] T01MA3_A2809MetTerCod ;
   private int[] T01MA3_A129BarCod ;
   private byte[] T01MA3_A132BarCodReo ;
   private String[] T01MA3_A130BarCodPar ;
   private String[] T01MA3_A2813MetPieCod ;
   private short[] T01MA3_A12995MetPieDfLi ;
   private java.math.BigDecimal[] T01MA3_A12998MetPieDfMi ;
   private String[] T01MA3_A13000MetPieDfFa ;
   private String[] T01MA3_A396EmprCod ;
   private short[] T01MA3_A12996MetPieDfID ;
   private String[] T01MA2_A2809MetTerCod ;
   private int[] T01MA2_A129BarCod ;
   private byte[] T01MA2_A132BarCodReo ;
   private String[] T01MA2_A130BarCodPar ;
   private String[] T01MA2_A2813MetPieCod ;
   private short[] T01MA2_A12995MetPieDfLi ;
   private java.math.BigDecimal[] T01MA2_A12998MetPieDfMi ;
   private String[] T01MA2_A13000MetPieDfFa ;
   private String[] T01MA2_A396EmprCod ;
   private short[] T01MA2_A12996MetPieDfID ;
   private String[] T01MA25_A12997MetPieDfDc ;
   private boolean[] T01MA25_n12997MetPieDfDc ;
   private String[] T01MA26_A396EmprCod ;
   private String[] T01MA26_A2809MetTerCod ;
   private int[] T01MA26_A129BarCod ;
   private byte[] T01MA26_A132BarCodReo ;
   private String[] T01MA26_A130BarCodPar ;
   private String[] T01MA26_A2813MetPieCod ;
   private short[] T01MA26_A12995MetPieDfLi ;
   private String[] T01MA27_A407EmprNom ;
   private boolean[] T01MA27_n407EmprNom ;
   private String[] T01MA28_A228BarUniMed ;
   private String[] T01MA29_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn25__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn25__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn25__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn25__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn25__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01MA2", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi, MetPieDfMi, MetPieDfFa, EmprCod, MetPieDfID FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?  FOR UPDATE OF MetPieDfMi, MetPieDfFa, MetPieDfID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MA3", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi, MetPieDfMi, MetPieDfFa, EmprCod, MetPieDfID FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MA4", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA5", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieDfUl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA6", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA8", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA9", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA10", "SELECT /*+ FIRST_ROWS(1) */ TM1.MetPieCod, T2.EmprNom, TM1.MetPieKil, TM1.MetPieMet, TM1.MetPieDfUl, T3.BarUniMed, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetTerCod FROM ((TXPLMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MetPieCod = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetPieCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01MA14", "INSERT INTO TXPLMETPI(MetPieCod, MetPieKil, MetPieMet, MetPieDfUl, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01MA15", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieDfUl=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01MA16", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01MA17", "UPDATE TXPLMETPI SET MetPieDfUl=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01MA18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA19", "SELECT T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfMi, T1.MetPieDfFa, T1.EmprCod, T1.MetPieDfID AS MetPieDfID FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID) WHERE T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ? and T1.MetPieDfLi = ? ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MA20", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA21", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01MA22", "INSERT INTO TXPMETPID(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi, MetPieDfMi, MetPieDfFa, EmprCod, MetPieDfID, MetPieDfMa) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMETPID")
         ,new UpdateCursor("T01MA23", "UPDATE TXPMETPID SET MetPieDfMi=?, MetPieDfFa=?, MetPieDfID=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?", GX_NOMASK, "TXPMETPID")
         ,new UpdateCursor("T01MA24", "DELETE FROM TXPMETPID  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? AND MetPieDfLi = ?", GX_NOMASK, "TXPMETPID")
         ,new ForEachCursor("T01MA25", "SELECT TipDefDsc AS MetPieDfDc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA26", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01MA27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA28", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01MA29", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 27 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 10);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

