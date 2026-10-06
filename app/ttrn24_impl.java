package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn24_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action9") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
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
         A2814MetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "MetPieKil"), ".") ;
         A2815MetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "MetPieMet"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_9_1M9413( Gx_mode, A396EmprCod, A2809MetTerCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_1M9413( ) ;
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
            AV33Fascod = httpContext.GetPar( "Fascod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Fascod", AV33Fascod);
            AV34Turno = (byte)(GXutil.lval( httpContext.GetPar( "Turno"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Turno", GXutil.str( AV34Turno, 1, 0));
            AV35Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Opecod), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pruebas CMETPI/LMETPI/METPID", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMetPieNum_Internalname ;
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
      AV35Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
      AV34Turno = (byte)(GXutil.lval( httpContext.GetPar( "Turno"))) ;
      A13008MetPieFcUl = localUtil.parseDateParm( httpContext.GetPar( "MetPieFcUl")) ;
      n13008MetPieFcUl = false ;
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

   public ttrn24_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn24_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn24_impl.class ));
   }

   public ttrn24_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn24.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultimo Numeracion Pieza", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieNum_Internalname, GXutil.ltrim( localUtil.ntoc( A13007MetPieNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13007MetPieNum), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13007MetPieNum), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieNum_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieNum_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultima Fecha Revista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMetPieFcUl_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieFcUl_Internalname, localUtil.format(A13008MetPieFcUl, "99/99/99"), localUtil.format( A13008MetPieFcUl, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieFcUl_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieFcUl_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn24.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMetPieFcUl_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMetPieFcUl_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn24.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieFase_Internalname, GXutil.rtrim( A13009MetPieFase), GXutil.rtrim( localUtil.format( A13009MetPieFase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieFase_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Defeitos Continuos", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn24.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMetPieDfCo_Internalname, A13011MetPieDfCo, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtMetPieDfCo_Enabled, 0, 80, "chr", 8, "row", (byte)(0), StyleString, ClassString, "", "", "600", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TTrn24.htm");
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
         nBlankRcdCount413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_413 = (short)(1) ;
            scanStart1M9413( ) ;
            while ( RcdFound413 != 0 )
            {
               init_level_properties413( ) ;
               getByPrimaryKey1M9413( ) ;
               addRow1M9413( ) ;
               scanNext1M9413( ) ;
            }
            scanEnd1M9413( ) ;
            nBlankRcdCount413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1M9413( ) ;
         standaloneModal1M9413( ) ;
         sMode413 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRow1M9413( ) ;
            edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDfUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFUL_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieOpe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOPE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieTurn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIETURN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOBS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPiePDo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEPDO_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPiePDo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiePDo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIELOC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieLoc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMetPieDCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDCP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDCP_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M9413( ) ;
            }
            sendRow1M9413( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount413 = (short)(5) ;
         nRcdExists_413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M9413( ) ;
            while ( RcdFound413 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75413( ) ;
               init_level_properties413( ) ;
               standaloneNotModal1M9413( ) ;
               getByPrimaryKey1M9413( ) ;
               standaloneModal1M9413( ) ;
               addRow1M9413( ) ;
               scanNext1M9413( ) ;
            }
            scanEnd1M9413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode413 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75413( ) ;
      initAll1M9413( ) ;
      init_level_properties413( ) ;
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
      nBlankRcdCount413 = (short)(nBlankRcdUsr413+nBlankRcdCount413) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount413 > 0 )
      {
         standaloneNotModal1M9413( ) ;
         standaloneModal1M9413( ) ;
         addRow1M9413( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMetPieCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount413 = (short)(nBlankRcdCount413-1) ;
      }
      Gx_mode = sMode413 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn24.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn24.htm");
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
      e111M92 ();
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
            Z13007MetPieNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z13007MetPieNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13008MetPieFcUl = localUtil.ctod( httpContext.cgiGet( "Z13008MetPieFcUl"), 0) ;
            Z13009MetPieFase = httpContext.cgiGet( "Z13009MetPieFase") ;
            Z13011MetPieDfCo = httpContext.cgiGet( "Z13011MetPieDfCo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A13789MaqcodForm = httpContext.cgiGet( "MAQCODFORM") ;
            AV34Turno = (byte)(localUtil.ctol( httpContext.cgiGet( "vTURNO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Opecod = (int)(localUtil.ctol( httpContext.cgiGet( "vOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Fascod = httpContext.cgiGet( "vFASCOD") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIENUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13007MetPieNum = 0 ;
               n13007MetPieNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13007MetPieNum), 9, 0));
            }
            else
            {
               A13007MetPieNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMetPieNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13007MetPieNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13007MetPieNum), 9, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtMetPieFcUl_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "METPIEFCUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieFcUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13008MetPieFcUl = GXutil.nullDate() ;
               n13008MetPieFcUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
            }
            else
            {
               A13008MetPieFcUl = localUtil.ctod( httpContext.cgiGet( edtMetPieFcUl_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13008MetPieFcUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
            }
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
            A13009MetPieFase = httpContext.cgiGet( edtMetPieFase_Internalname) ;
            n13009MetPieFase = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13009MetPieFase", A13009MetPieFase);
            A13011MetPieDfCo = httpContext.cgiGet( edtMetPieDfCo_Internalname) ;
            n13011MetPieDfCo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13011MetPieDfCo", A13011MetPieDfCo);
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
                        e111M92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DEFECTOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Defectos' */
                        e121M92 ();
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
            initAll1M9412( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributes1M9412( ) ;
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

   public void confirm_1M90( )
   {
      beforeValidate1M9412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M9412( ) ;
         }
         else
         {
            checkExtendedTable1M9412( ) ;
            if ( AnyError == 0 )
            {
               zm1M9412( 12) ;
               zm1M9412( 13) ;
            }
            closeExtendedTableCursors1M9412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode412 = Gx_mode ;
         confirm_1M9413( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode412 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1M90( ) ;
      }
   }

   public void confirm_1M9413( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1M9413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            getKey1M9413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               if ( RcdFound413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M9413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M9413( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1M9413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "METPIECOD_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMetPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( nRcdDeleted_413 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M9413( ) ;
                     load1M9413( ) ;
                     beforeValidate1M9413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M9413( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M9413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M9413( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1M9413( ) ;
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
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieTurn_Internalname, GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieObs_Internalname, A4917MetPieObs) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPiePDo_Internalname, GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieLoc_Internalname, GXutil.rtrim( A4913MetPieLoc)) ;
         httpContext.changePostValue( edtMetPieDCP_Internalname, GXutil.rtrim( A4915MetPieDCP)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_75_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_75_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_75_idx, Z4917MetPieObs) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_75_idx, GXutil.rtrim( Z4913MetPieLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_75_idx, GXutil.rtrim( Z4915MetPieDCP)) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFUL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOPE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIETURN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEPDO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIELOC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M90( )
   {
   }

   public void e111M92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn24_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      ttrn24_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn24_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn24_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn24_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn24_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121M92( )
   {
      /* 'Defectos' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) && ( GXutil.strcmp(A2813MetPieCod, " ") != 0 ) )
      {
         callWebObject(formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm1M9412( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13007MetPieNum = T01M95_A13007MetPieNum[0] ;
            Z13008MetPieFcUl = T01M95_A13008MetPieFcUl[0] ;
            Z13009MetPieFase = T01M95_A13009MetPieFase[0] ;
            Z13011MetPieDfCo = T01M95_A13011MetPieDfCo[0] ;
         }
         else
         {
            Z13007MetPieNum = A13007MetPieNum ;
            Z13008MetPieFcUl = A13008MetPieFcUl ;
            Z13009MetPieFase = A13009MetPieFase ;
            Z13011MetPieDfCo = A13011MetPieDfCo ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z13007MetPieNum = A13007MetPieNum ;
         Z13008MetPieFcUl = A13008MetPieFcUl ;
         Z13009MetPieFase = A13009MetPieFase ;
         Z13011MetPieDfCo = A13011MetPieDfCo ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z228BarUniMed = A228BarUniMed ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TTrn24" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T01M96 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01M96_A407EmprNom[0] ;
      n407EmprNom = T01M96_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01M97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T01M97_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
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

   public void load1M9412( )
   {
      /* Using cursor T01M98 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A407EmprNom = T01M98_A407EmprNom[0] ;
         n407EmprNom = T01M98_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13007MetPieNum = T01M98_A13007MetPieNum[0] ;
         n13007MetPieNum = T01M98_n13007MetPieNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13007MetPieNum), 9, 0));
         A13008MetPieFcUl = T01M98_A13008MetPieFcUl[0] ;
         n13008MetPieFcUl = T01M98_n13008MetPieFcUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
         A228BarUniMed = T01M98_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A13009MetPieFase = T01M98_A13009MetPieFase[0] ;
         n13009MetPieFase = T01M98_n13009MetPieFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13009MetPieFase", A13009MetPieFase);
         A13011MetPieDfCo = T01M98_A13011MetPieDfCo[0] ;
         n13011MetPieDfCo = T01M98_n13011MetPieDfCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13011MetPieDfCo", A13011MetPieDfCo);
         zm1M9412( -11) ;
      }
      pr_default.close(6);
      onLoadActions1M9412( ) ;
   }

   public void onLoadActions1M9412( )
   {
   }

   public void checkExtendedTable1M9412( )
   {
      nIsDirty_412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1M9412( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1M9412( )
   {
      /* Using cursor T01M99 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      else
      {
         RcdFound412 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M95 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01M95_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T01M95_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01M95_A129BarCod[0] == A129BarCod ) && ( T01M95_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M95_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1M9412( 11) ;
         RcdFound412 = (short)(1) ;
         A13007MetPieNum = T01M95_A13007MetPieNum[0] ;
         n13007MetPieNum = T01M95_n13007MetPieNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13007MetPieNum), 9, 0));
         A13008MetPieFcUl = T01M95_A13008MetPieFcUl[0] ;
         n13008MetPieFcUl = T01M95_n13008MetPieFcUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
         A13009MetPieFase = T01M95_A13009MetPieFase[0] ;
         n13009MetPieFase = T01M95_n13009MetPieFase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13009MetPieFase", A13009MetPieFase);
         A13011MetPieDfCo = T01M95_A13011MetPieDfCo[0] ;
         n13011MetPieDfCo = T01M95_n13011MetPieDfCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13011MetPieDfCo", A13011MetPieDfCo);
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M9412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound412 = (short)(0) ;
            initializeNonKey1M9412( ) ;
         }
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound412 = (short)(0) ;
         initializeNonKey1M9412( ) ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1M9412( ) ;
      if ( RcdFound412 == 0 )
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
      RcdFound412 = (short)(0) ;
      /* Using cursor T01M910 */
      pr_default.execute(8, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01M910_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M910_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01M910_A129BarCod[0] == A129BarCod ) && ( T01M910_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M910_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01M910_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M910_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01M910_A129BarCod[0] == A129BarCod ) && ( T01M910_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M910_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T01M911 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01M911_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M911_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01M911_A129BarCod[0] == A129BarCod ) && ( T01M911_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M911_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01M911_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M911_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01M911_A129BarCod[0] == A129BarCod ) && ( T01M911_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M911_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M9412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMetPieNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M9412( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound412 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
               GX_FocusControl = edtMetPieNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1M9412( ) ;
               GX_FocusControl = edtMetPieNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMetPieNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M9412( ) ;
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
                  GX_FocusControl = edtMetPieNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M9412( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         GX_FocusControl = edtMetPieNum_Internalname ;
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
      getKey1M9412( ) ;
      if ( RcdFound412 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn24");
      GX_FocusControl = edtMetPieNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1M90( ) ;
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMetPieNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1M9412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M9412( ) ;
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieNum_Internalname ;
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
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieNum_Internalname ;
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
      scanStart1M9412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound412 != 0 )
         {
            scanNext1M9412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M9412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M9412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M94 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z13007MetPieNum != T01M94_A13007MetPieNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13008MetPieFcUl), GXutil.resetTime(T01M94_A13008MetPieFcUl[0])) ) || ( GXutil.strcmp(Z13009MetPieFase, T01M94_A13009MetPieFase[0]) != 0 ) || ( GXutil.strcmp(Z13011MetPieDfCo, T01M94_A13011MetPieDfCo[0]) != 0 ) )
         {
            if ( Z13007MetPieNum != T01M94_A13007MetPieNum[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieNum");
               GXutil.writeLogRaw("Old: ",Z13007MetPieNum);
               GXutil.writeLogRaw("Current: ",T01M94_A13007MetPieNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13008MetPieFcUl), GXutil.resetTime(T01M94_A13008MetPieFcUl[0])) ) )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieFcUl");
               GXutil.writeLogRaw("Old: ",Z13008MetPieFcUl);
               GXutil.writeLogRaw("Current: ",T01M94_A13008MetPieFcUl[0]);
            }
            if ( GXutil.strcmp(Z13009MetPieFase, T01M94_A13009MetPieFase[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieFase");
               GXutil.writeLogRaw("Old: ",Z13009MetPieFase);
               GXutil.writeLogRaw("Current: ",T01M94_A13009MetPieFase[0]);
            }
            if ( GXutil.strcmp(Z13011MetPieDfCo, T01M94_A13011MetPieDfCo[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieDfCo");
               GXutil.writeLogRaw("Old: ",Z13011MetPieDfCo);
               GXutil.writeLogRaw("Current: ",T01M94_A13011MetPieDfCo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M9412( )
   {
      beforeValidate1M9412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M9412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M9412( 0) ;
         checkOptimisticConcurrency1M9412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M9412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M9412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M912 */
                  pr_default.execute(10, new Object[] {A2809MetTerCod, Boolean.valueOf(n13007MetPieNum), Integer.valueOf(A13007MetPieNum), Boolean.valueOf(n13008MetPieFcUl), A13008MetPieFcUl, Boolean.valueOf(n13009MetPieFase), A13009MetPieFase, Boolean.valueOf(n13011MetPieDfCo), A13011MetPieDfCo, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1M9412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1M90( ) ;
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
            load1M9412( ) ;
         }
         endLevel1M9412( ) ;
      }
      closeExtendedTableCursors1M9412( ) ;
   }

   public void update1M9412( )
   {
      beforeValidate1M9412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M9412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M9412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M9412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M9412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M913 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13007MetPieNum), Integer.valueOf(A13007MetPieNum), Boolean.valueOf(n13008MetPieFcUl), A13008MetPieFcUl, Boolean.valueOf(n13009MetPieFase), A13009MetPieFase, Boolean.valueOf(n13011MetPieDfCo), A13011MetPieDfCo, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M9412( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M9412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1M90( ) ;
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
         endLevel1M9412( ) ;
      }
      closeExtendedTableCursors1M9412( ) ;
   }

   public void deferredUpdate1M9412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M9412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M9412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M9412( ) ;
         afterConfirm1M9412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M9412( ) ;
            if ( AnyError == 0 )
            {
               scanStart1M9413( ) ;
               while ( RcdFound413 != 0 )
               {
                  getByPrimaryKey1M9413( ) ;
                  delete1M9413( ) ;
                  scanNext1M9413( ) ;
               }
               scanEnd1M9413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M914 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound412 == 0 )
                        {
                           initAll1M9412( ) ;
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
                        resetCaption1M90( ) ;
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
      sMode412 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M9412( ) ;
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M9412( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01M915 */
         pr_default.execute(13, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1M9413( )
   {
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRow1M9413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            standaloneNotModal1M9413( ) ;
            getKey1M9413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M9413( ) ;
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( ( nRcdDeleted_413 != 0 ) && ( nRcdExists_413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M9413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M9413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieDfUl_Internalname, GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieTurn_Internalname, GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieObs_Internalname, A4917MetPieObs) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPiePDo_Internalname, GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieLoc_Internalname, GXutil.rtrim( A4913MetPieLoc)) ;
         httpContext.changePostValue( edtMetPieDCP_Internalname, GXutil.rtrim( A4915MetPieDCP)) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_75_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_75_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_75_idx, Z4917MetPieObs) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_75_idx, GXutil.rtrim( Z4913MetPieLoc)) ;
         httpContext.changePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_75_idx, GXutil.rtrim( Z4915MetPieDCP)) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDFUL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOPE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIETURN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEPDO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIELOC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M9413( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
   }

   public void processLevel1M9412( )
   {
      /* Save parent mode. */
      sMode412 = Gx_mode ;
      processNestedLevel1M9413( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1M9412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1M9412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn24");
         if ( AnyError == 0 )
         {
            confirmValues1M90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn24");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M9412( )
   {
      /* Scan By routine */
      /* Using cursor T01M916 */
      pr_default.execute(14, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M9412( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
   }

   public void scanEnd1M9412( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1M9412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M9412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M9412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M9412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M9412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M9412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M9412( )
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
      edtMetPieNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieNum_Enabled), 5, 0), true);
      edtMetPieFcUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFcUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFcUl_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtMetPieFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFase_Enabled), 5, 0), true);
      edtMetPieDfCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfCo_Enabled), 5, 0), true);
   }

   public void zm1M9413( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5136MetPieFch = T01M93_A5136MetPieFch[0] ;
            Z13006MetPieTurn = T01M93_A13006MetPieTurn[0] ;
            Z13005MetPieOpe = T01M93_A13005MetPieOpe[0] ;
            Z2814MetPieKil = T01M93_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01M93_A2815MetPieMet[0] ;
            Z12994MetPieDfUl = T01M93_A12994MetPieDfUl[0] ;
            Z4917MetPieObs = T01M93_A4917MetPieObs[0] ;
            Z4909MetPieDef = T01M93_A4909MetPieDef[0] ;
            Z4912MetPiePDo = T01M93_A4912MetPiePDo[0] ;
            Z6635MetPieAnc = T01M93_A6635MetPieAnc[0] ;
            Z4913MetPieLoc = T01M93_A4913MetPieLoc[0] ;
            Z4915MetPieDCP = T01M93_A4915MetPieDCP[0] ;
         }
         else
         {
            Z5136MetPieFch = A5136MetPieFch ;
            Z13006MetPieTurn = A13006MetPieTurn ;
            Z13005MetPieOpe = A13005MetPieOpe ;
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z12994MetPieDfUl = A12994MetPieDfUl ;
            Z4917MetPieObs = A4917MetPieObs ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z4912MetPiePDo = A4912MetPiePDo ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z4913MetPieLoc = A4913MetPieLoc ;
            Z4915MetPieDCP = A4915MetPieDCP ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z13006MetPieTurn = A13006MetPieTurn ;
         Z13005MetPieOpe = A13005MetPieOpe ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z12994MetPieDfUl = A12994MetPieDfUl ;
         Z4917MetPieObs = A4917MetPieObs ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z4912MetPiePDo = A4912MetPiePDo ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z4913MetPieLoc = A4913MetPieLoc ;
         Z4915MetPieDCP = A4915MetPieDCP ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1M9413( )
   {
      edtMetPieOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieTurn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void standaloneModal1M9413( )
   {
      A13005MetPieOpe = AV35Opecod ;
      A13006MetPieTurn = AV34Turno ;
      A5136MetPieFch = A13008MetPieFcUl ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void load1M9413( )
   {
      /* Using cursor T01M917 */
      pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A5136MetPieFch = T01M917_A5136MetPieFch[0] ;
         A13006MetPieTurn = T01M917_A13006MetPieTurn[0] ;
         A13005MetPieOpe = T01M917_A13005MetPieOpe[0] ;
         A2814MetPieKil = T01M917_A2814MetPieKil[0] ;
         A2815MetPieMet = T01M917_A2815MetPieMet[0] ;
         A12994MetPieDfUl = T01M917_A12994MetPieDfUl[0] ;
         A4917MetPieObs = T01M917_A4917MetPieObs[0] ;
         A4909MetPieDef = T01M917_A4909MetPieDef[0] ;
         A4912MetPiePDo = T01M917_A4912MetPiePDo[0] ;
         A6635MetPieAnc = T01M917_A6635MetPieAnc[0] ;
         A4913MetPieLoc = T01M917_A4913MetPieLoc[0] ;
         A4915MetPieDCP = T01M917_A4915MetPieDCP[0] ;
         zm1M9413( -14) ;
      }
      pr_default.close(15);
      onLoadActions1M9413( ) ;
   }

   public void onLoadActions1M9413( )
   {
      A13789MaqcodForm = GXutil.trim( GXutil.substring( A4917MetPieObs, 4, 6)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13789MaqcodForm", A13789MaqcodForm);
   }

   public void checkExtendedTable1M9413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1M9413( ) ;
      nIsDirty_413 = (short)(1) ;
      A13789MaqcodForm = GXutil.trim( GXutil.substring( A4917MetPieObs, 4, 6)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13789MaqcodForm", A13789MaqcodForm);
      if ( ! ( ( GXutil.strcmp(A4915MetPieDCP, "S") == 0 ) || ( GXutil.strcmp(A4915MetPieDCP, "N") == 0 ) ) )
      {
         GXCCtl = "METPIEDCP_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "S=Calidad 1, N=Calidad 2", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDCP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1M9413( )
   {
   }

   public void enableDisable1M9413( )
   {
   }

   public void getKey1M9413( )
   {
      /* Using cursor T01M918 */
      pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1M9413( )
   {
      /* Using cursor T01M93 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01M93_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01M93_A129BarCod[0] == A129BarCod ) && ( T01M93_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01M93_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01M93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1M9413( 14) ;
         RcdFound413 = (short)(1) ;
         initializeNonKey1M9413( ) ;
         A2813MetPieCod = T01M93_A2813MetPieCod[0] ;
         A5136MetPieFch = T01M93_A5136MetPieFch[0] ;
         A13006MetPieTurn = T01M93_A13006MetPieTurn[0] ;
         A13005MetPieOpe = T01M93_A13005MetPieOpe[0] ;
         A2814MetPieKil = T01M93_A2814MetPieKil[0] ;
         A2815MetPieMet = T01M93_A2815MetPieMet[0] ;
         A12994MetPieDfUl = T01M93_A12994MetPieDfUl[0] ;
         A4917MetPieObs = T01M93_A4917MetPieObs[0] ;
         A4909MetPieDef = T01M93_A4909MetPieDef[0] ;
         A4912MetPiePDo = T01M93_A4912MetPiePDo[0] ;
         A6635MetPieAnc = T01M93_A6635MetPieAnc[0] ;
         A4913MetPieLoc = T01M93_A4913MetPieLoc[0] ;
         A4915MetPieDCP = T01M93_A4915MetPieDCP[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M9413( ) ;
         load1M9413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1M9413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M9413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M9413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M9413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M92 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01M92_A5136MetPieFch[0])) ) || ( Z13006MetPieTurn != T01M92_A13006MetPieTurn[0] ) || ( Z13005MetPieOpe != T01M92_A13005MetPieOpe[0] ) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01M92_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01M92_A2815MetPieMet[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12994MetPieDfUl != T01M92_A12994MetPieDfUl[0] ) || ( GXutil.strcmp(Z4917MetPieObs, T01M92_A4917MetPieObs[0]) != 0 ) || ( Z4909MetPieDef != T01M92_A4909MetPieDef[0] ) || ( Z4912MetPiePDo != T01M92_A4912MetPiePDo[0] ) || ( Z6635MetPieAnc != T01M92_A6635MetPieAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4913MetPieLoc, T01M92_A4913MetPieLoc[0]) != 0 ) || ( GXutil.strcmp(Z4915MetPieDCP, T01M92_A4915MetPieDCP[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T01M92_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T01M92_A5136MetPieFch[0]);
            }
            if ( Z13006MetPieTurn != T01M92_A13006MetPieTurn[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieTurn");
               GXutil.writeLogRaw("Old: ",Z13006MetPieTurn);
               GXutil.writeLogRaw("Current: ",T01M92_A13006MetPieTurn[0]);
            }
            if ( Z13005MetPieOpe != T01M92_A13005MetPieOpe[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieOpe");
               GXutil.writeLogRaw("Old: ",Z13005MetPieOpe);
               GXutil.writeLogRaw("Current: ",T01M92_A13005MetPieOpe[0]);
            }
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01M92_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01M92_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01M92_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01M92_A2815MetPieMet[0]);
            }
            if ( Z12994MetPieDfUl != T01M92_A12994MetPieDfUl[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieDfUl");
               GXutil.writeLogRaw("Old: ",Z12994MetPieDfUl);
               GXutil.writeLogRaw("Current: ",T01M92_A12994MetPieDfUl[0]);
            }
            if ( GXutil.strcmp(Z4917MetPieObs, T01M92_A4917MetPieObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieObs");
               GXutil.writeLogRaw("Old: ",Z4917MetPieObs);
               GXutil.writeLogRaw("Current: ",T01M92_A4917MetPieObs[0]);
            }
            if ( Z4909MetPieDef != T01M92_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01M92_A4909MetPieDef[0]);
            }
            if ( Z4912MetPiePDo != T01M92_A4912MetPiePDo[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPiePDo");
               GXutil.writeLogRaw("Old: ",Z4912MetPiePDo);
               GXutil.writeLogRaw("Current: ",T01M92_A4912MetPiePDo[0]);
            }
            if ( Z6635MetPieAnc != T01M92_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T01M92_A6635MetPieAnc[0]);
            }
            if ( GXutil.strcmp(Z4913MetPieLoc, T01M92_A4913MetPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieLoc");
               GXutil.writeLogRaw("Old: ",Z4913MetPieLoc);
               GXutil.writeLogRaw("Current: ",T01M92_A4913MetPieLoc[0]);
            }
            if ( GXutil.strcmp(Z4915MetPieDCP, T01M92_A4915MetPieDCP[0]) != 0 )
            {
               GXutil.writeLogln("ttrn24:[seudo value changed for attri]"+"MetPieDCP");
               GXutil.writeLogRaw("Old: ",Z4915MetPieDCP);
               GXutil.writeLogRaw("Current: ",T01M92_A4915MetPieDCP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M9413( )
   {
      beforeValidate1M9413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M9413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M9413( 0) ;
         checkOptimisticConcurrency1M9413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M9413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M9413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M919 */
                  pr_default.execute(17, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A5136MetPieFch, Byte.valueOf(A13006MetPieTurn), Integer.valueOf(A13005MetPieOpe), A2814MetPieKil, A2815MetPieMet, Short.valueOf(A12994MetPieDfUl), A4917MetPieObs, Short.valueOf(A4909MetPieDef), Long.valueOf(A4912MetPiePDo), Short.valueOf(A6635MetPieAnc), A4913MetPieLoc, A4915MetPieDCP, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        httpContext.wjLoc = formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"})  ;
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
            load1M9413( ) ;
         }
         endLevel1M9413( ) ;
      }
      closeExtendedTableCursors1M9413( ) ;
   }

   public void update1M9413( )
   {
      beforeValidate1M9413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M9413( ) ;
      }
      if ( ( nIsMod_413 != 0 ) || ( nIsDirty_413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M9413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M9413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M9413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M920 */
                     pr_default.execute(18, new Object[] {A5136MetPieFch, Byte.valueOf(A13006MetPieTurn), Integer.valueOf(A13005MetPieOpe), A2814MetPieKil, A2815MetPieMet, Short.valueOf(A12994MetPieDfUl), A4917MetPieObs, Short.valueOf(A4909MetPieDef), Long.valueOf(A4912MetPiePDo), Short.valueOf(A6635MetPieAnc), A4913MetPieLoc, A4915MetPieDCP, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M9413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ || true /* After */ )
                        {
                           httpContext.wjLoc = formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"})  ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M9413( ) ;
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
            endLevel1M9413( ) ;
         }
      }
      closeExtendedTableCursors1M9413( ) ;
   }

   public void deferredUpdate1M9413( )
   {
   }

   public void delete1M9413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M9413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M9413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M9413( ) ;
         afterConfirm1M9413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M9413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M921 */
               pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M9413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M9413( )
   {
      standaloneModal1M9413( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13789MaqcodForm = GXutil.trim( GXutil.substring( A4917MetPieObs, 4, 6)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13789MaqcodForm", A13789MaqcodForm);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01M922 */
         pr_default.execute(20, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel1M9413( )
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

   public void scanStart1M9413( )
   {
      /* Scan By routine */
      /* Using cursor T01M923 */
      pr_default.execute(21, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01M923_A2813MetPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M9413( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T01M923_A2813MetPieCod[0] ;
      }
   }

   public void scanEnd1M9413( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1M9413( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* Level */ && true /* After */ && ( ( A2814MetPieKil.doubleValue() > 0 ) || ( A2815MetPieMet.doubleValue() > 0 ) ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A2809MetTerCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char7[0] = A2813MetPieCod ;
         new app.pprc152(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char7) ;
         ttrn24_impl.this.A396EmprCod = GXv_char4[0] ;
         ttrn24_impl.this.A2809MetTerCod = GXv_char3[0] ;
         ttrn24_impl.this.A129BarCod = GXv_int5[0] ;
         ttrn24_impl.this.A132BarCodReo = GXv_int6[0] ;
         ttrn24_impl.this.A130BarCodPar = GXv_char2[0] ;
         ttrn24_impl.this.A2813MetPieCod = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void beforeInsert1M9413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M9413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M9413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M9413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M9413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M9413( )
   {
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDfUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDfUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieTurn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPiePDo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiePDo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiePDo_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieLoc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieDCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDCP_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashes1M9413( )
   {
   }

   public void send_integrity_lvl_hashes1M9412( )
   {
   }

   public void subsflControlProps_75413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_75_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_75_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_75_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_75_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_75_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_75_idx ;
      edtMetPieOpe_Internalname = "METPIEOPE_"+sGXsfl_75_idx ;
      edtMetPieTurn_Internalname = "METPIETURN_"+sGXsfl_75_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_75_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_75_idx ;
      edtMetPiePDo_Internalname = "METPIEPDO_"+sGXsfl_75_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_75_idx ;
      edtMetPieLoc_Internalname = "METPIELOC_"+sGXsfl_75_idx ;
      edtMetPieDCP_Internalname = "METPIEDCP_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_75_fel_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_75_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_75_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_75_fel_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_75_fel_idx ;
      edtMetPieDfUl_Internalname = "METPIEDFUL_"+sGXsfl_75_fel_idx ;
      edtMetPieOpe_Internalname = "METPIEOPE_"+sGXsfl_75_fel_idx ;
      edtMetPieTurn_Internalname = "METPIETURN_"+sGXsfl_75_fel_idx ;
      edtMetPieObs_Internalname = "METPIEOBS_"+sGXsfl_75_fel_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_75_fel_idx ;
      edtMetPiePDo_Internalname = "METPIEPDO_"+sGXsfl_75_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_75_fel_idx ;
      edtMetPieLoc_Internalname = "METPIELOC_"+sGXsfl_75_fel_idx ;
      edtMetPieDCP_Internalname = "METPIEDCP_"+sGXsfl_75_fel_idx ;
   }

   public void addRow1M9413( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75413( ) ;
      sendRow1M9413( ) ;
   }

   public void sendRow1M9413( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_413_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_413_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_413_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_413_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieFch_Internalname,localUtil.format(A5136MetPieFch, "99/99/99"),localUtil.format( A5136MetPieFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfUl_Internalname,GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDfUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfUl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDfUl_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieOpe_Internalname,GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieOpe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13005MetPieOpe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13005MetPieOpe), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieOpe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieOpe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieTurn_Internalname,GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieTurn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13006MetPieTurn), "9") : localUtil.format( DecimalUtil.doubleToDec(A13006MetPieTurn), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieTurn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieTurn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPiePDo_Internalname,GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPiePDo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPiePDo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPiePDo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieLoc_Internalname,GXutil.rtrim( A4913MetPieLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDCP_Internalname,GXutil.rtrim( A4915MetPieDCP),GXutil.rtrim( localUtil.format( A4915MetPieDCP, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDCP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDCP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M9413( ) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2813MetPieCod));
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      GXCCtl = "Z13006MetPieTurn_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13006MetPieTurn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13005MetPieOpe_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13005MetPieOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12994MetPieDfUl_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4917MetPieObs_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z4917MetPieObs);
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4912MetPiePDo_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4913MetPieLoc_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4913MetPieLoc));
      GXCCtl = "Z4915MetPieDCP_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4915MetPieDCP));
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_413_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_413_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vFASCOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33Fascod));
      GXCCtl = "vTURNO_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV34Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vOPECOD_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_413_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOD_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEKIL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMET_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEFCH_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDFUL_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOPE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIETURN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDEF_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEPDO_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIELOC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDCP_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M9413( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75413( ) ;
      edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDfUl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDFUL_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieOpe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOPE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieTurn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIETURN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEOBS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPiePDo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEPDO_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIELOC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDCP_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_413");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_413_Internalname ;
         wbErr = true ;
         nRcdDeleted_413 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_413_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEKIL_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieKil_Internalname ;
         wbErr = true ;
         A2814MetPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMET_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMet_Internalname ;
         wbErr = true ;
         A2815MetPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
      }
      A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( edtMetPieFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "METPIEDFUL_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDfUl_Internalname ;
         wbErr = true ;
         A12994MetPieDfUl = (short)(0) ;
      }
      else
      {
         A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13005MetPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( edtMetPieOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13006MetPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieTurn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEDEF_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDef_Internalname ;
         wbErr = true ;
         A4909MetPieDef = (short)(0) ;
      }
      else
      {
         A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "METPIEPDO_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPiePDo_Internalname ;
         wbErr = true ;
         A4912MetPiePDo = 0 ;
      }
      else
      {
         A4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEANC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieAnc_Internalname ;
         wbErr = true ;
         A6635MetPieAnc = (short)(0) ;
      }
      else
      {
         A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4913MetPieLoc = httpContext.cgiGet( edtMetPieLoc_Internalname) ;
      A4915MetPieDCP = GXutil.upper( httpContext.cgiGet( edtMetPieDCP_Internalname)) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_75_idx ;
      Z2813MetPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_75_idx ;
      Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13006MetPieTurn_" + sGXsfl_75_idx ;
      Z13006MetPieTurn = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13005MetPieOpe_" + sGXsfl_75_idx ;
      Z13005MetPieOpe = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_75_idx ;
      Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_75_idx ;
      Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12994MetPieDfUl_" + sGXsfl_75_idx ;
      Z12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4917MetPieObs_" + sGXsfl_75_idx ;
      Z4917MetPieObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_75_idx ;
      Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4912MetPiePDo_" + sGXsfl_75_idx ;
      Z4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_75_idx ;
      Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4913MetPieLoc_" + sGXsfl_75_idx ;
      Z4913MetPieLoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4915MetPieDCP_" + sGXsfl_75_idx ;
      Z4915MetPieDCP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_75_idx ;
      nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_413_" + sGXsfl_75_idx ;
      nRcdExists_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_413_" + sGXsfl_75_idx ;
      nIsMod_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieTurn_Enabled = edtMetPieTurn_Enabled ;
      defedtMetPieOpe_Enabled = edtMetPieOpe_Enabled ;
      defedtMetPieFch_Enabled = edtMetPieFch_Enabled ;
      defedtMetPieCod_Enabled = edtMetPieCod_Enabled ;
   }

   public void confirmValues1M90( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75413( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75413( ) ;
         httpContext.changePostValue( "Z2813MetPieCod_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2813MetPieCod_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z5136MetPieFch_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z5136MetPieFch_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13006MetPieTurn_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13006MetPieTurn_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z13005MetPieOpe_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13005MetPieOpe_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2814MetPieKil_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2814MetPieKil_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z2815MetPieMet_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z2815MetPieMet_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z12994MetPieDfUl_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12994MetPieDfUl_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4917MetPieObs_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4917MetPieObs_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4917MetPieObs_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4909MetPieDef_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4909MetPieDef_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4912MetPiePDo_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4912MetPiePDo_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6635MetPieAnc_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4913MetPieLoc_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4913MetPieLoc_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z4915MetPieDCP_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4915MetPieDCP_"+sGXsfl_75_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn24", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Turno,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Opecod,6,0))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","Fascod","Turno","Opecod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13007MetPieNum", GXutil.ltrim( localUtil.ntoc( Z13007MetPieNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13008MetPieFcUl", localUtil.dtoc( Z13008MetPieFcUl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13009MetPieFase", GXutil.rtrim( Z13009MetPieFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13011MetPieDfCo", Z13011MetPieDfCo);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODFORM", GXutil.rtrim( A13789MaqcodForm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV34Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV35Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV33Fascod));
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
      return formatLink("app.ttrn24", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod)),GXutil.URLEncode(GXutil.ltrimstr(AV34Turno,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35Opecod,6,0))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","Fascod","Turno","Opecod"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn24" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pruebas CMETPI/LMETPI/METPID", "") ;
   }

   public void initializeNonKey1M9412( )
   {
      A13007MetPieNum = 0 ;
      n13007MetPieNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13007MetPieNum), 9, 0));
      A13008MetPieFcUl = GXutil.nullDate() ;
      n13008MetPieFcUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
      A13009MetPieFase = "" ;
      n13009MetPieFase = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13009MetPieFase", A13009MetPieFase);
      A13011MetPieDfCo = "" ;
      n13011MetPieDfCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13011MetPieDfCo", A13011MetPieDfCo);
      Z13007MetPieNum = 0 ;
      Z13008MetPieFcUl = GXutil.nullDate() ;
      Z13009MetPieFase = "" ;
      Z13011MetPieDfCo = "" ;
   }

   public void initAll1M9412( )
   {
      initializeNonKey1M9412( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M9413( )
   {
      A5136MetPieFch = GXutil.nullDate() ;
      A13006MetPieTurn = (byte)(0) ;
      A13005MetPieOpe = 0 ;
      A13789MaqcodForm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13789MaqcodForm", A13789MaqcodForm);
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A12994MetPieDfUl = (short)(0) ;
      A4917MetPieObs = "" ;
      A4909MetPieDef = (short)(0) ;
      A4912MetPiePDo = 0 ;
      A6635MetPieAnc = (short)(0) ;
      A4913MetPieLoc = "" ;
      A4915MetPieDCP = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z13006MetPieTurn = (byte)(0) ;
      Z13005MetPieOpe = 0 ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z12994MetPieDfUl = (short)(0) ;
      Z4917MetPieObs = "" ;
      Z4909MetPieDef = (short)(0) ;
      Z4912MetPiePDo = 0 ;
      Z6635MetPieAnc = (short)(0) ;
      Z4913MetPieLoc = "" ;
      Z4915MetPieDCP = "" ;
   }

   public void initAll1M9413( )
   {
      A2813MetPieCod = "" ;
      initializeNonKey1M9413( ) ;
   }

   public void standaloneModalInsert1M9413( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241595454", true, true);
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
      httpContext.AddJavascriptSource("ttrn24.js", "?20268241595454", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties413( )
   {
      edtMetPieTurn_Enabled = defedtMetPieTurn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieTurn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieTurn_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieOpe_Enabled = defedtMetPieOpe_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieOpe_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieFch_Enabled = defedtMetPieFch_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMetPieCod_Enabled = defedtMetPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A5136MetPieFch, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13005MetPieOpe, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieOpe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13006MetPieTurn, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieTurn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A4917MetPieObs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPiePDo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4913MetPieLoc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4915MetPieDCP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDCP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMetPieNum_Internalname = "METPIENUM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMetPieFcUl_Internalname = "METPIEFCUL" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMetPieFase_Internalname = "METPIEFASE" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMetPieDfCo_Internalname = "METPIEDFCO" ;
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieFch_Internalname = "METPIEFCH" ;
      edtMetPieDfUl_Internalname = "METPIEDFUL" ;
      edtMetPieOpe_Internalname = "METPIEOPE" ;
      edtMetPieTurn_Internalname = "METPIETURN" ;
      edtMetPieObs_Internalname = "METPIEOBS" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      edtMetPiePDo_Internalname = "METPIEPDO" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieLoc_Internalname = "METPIELOC" ;
      edtMetPieDCP_Internalname = "METPIEDCP" ;
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
      Form.setCaption( httpContext.getMessage( "Pruebas CMETPI/LMETPI/METPID", "") );
      edtMetPieDCP_Jsonclick = "" ;
      edtMetPieLoc_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPiePDo_Jsonclick = "" ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieTurn_Jsonclick = "" ;
      edtMetPieOpe_Jsonclick = "" ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieFch_Jsonclick = "" ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieCod_Jsonclick = "" ;
      edtavnRcdDeleted_413_Jsonclick = "" ;
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
      edtMetPieDCP_Enabled = 1 ;
      edtMetPieLoc_Enabled = 1 ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPiePDo_Enabled = 1 ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieObs_Enabled = 1 ;
      edtMetPieTurn_Enabled = 0 ;
      edtMetPieOpe_Enabled = 0 ;
      edtMetPieDfUl_Enabled = 1 ;
      edtMetPieFch_Enabled = 0 ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Enabled = 1 ;
      edtavnRcdDeleted_413_Enabled = 1 ;
      edtMetPieDfCo_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieDfCo_Enabled = 1 ;
      edtMetPieFase_Jsonclick = "" ;
      edtMetPieFase_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieFase_Enabled = 1 ;
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtBarUniMed_Enabled = 0 ;
      edtMetPieFcUl_Jsonclick = "" ;
      edtMetPieFcUl_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieFcUl_Enabled = 1 ;
      edtMetPieNum_Jsonclick = "" ;
      edtMetPieNum_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieNum_Enabled = 1 ;
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

   public void xc_9_1M9413( String Gx_mode ,
                            String A396EmprCod ,
                            String A2809MetTerCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A2813MetPieCod ,
                            java.math.BigDecimal A2814MetPieKil ,
                            java.math.BigDecimal A2815MetPieMet )
   {
      if ( isIns( )  && true /* Level */ && true /* After */ && ( ( A2814MetPieKil.doubleValue() > 0 ) || ( A2815MetPieMet.doubleValue() > 0 ) ) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = A2809MetTerCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A2813MetPieCod ;
         new app.pprc152(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A2809MetTerCod = GXv_char4[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char3[0] ;
         A2813MetPieCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2809MetTerCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2813MetPieCod))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_10_1M9413( )
   {
      if ( true /* After */ || true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.ttrn25", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(GXutil.rtrim(AV33Fascod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod","Fascod"})  ;
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
      subsflControlProps_75413( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M9413( ) ;
         standaloneModal1M9413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M9413( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75413( ) ;
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
      /* Using cursor T01M924 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01M924_A407EmprNom[0] ;
      n407EmprNom = T01M924_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T01M925 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A228BarUniMed = T01M925_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(23);
      GX_FocusControl = edtMetPieNum_Internalname ;
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
      n13008MetPieFcUl = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13007MetPieNum", GXutil.ltrim( localUtil.ntoc( A13007MetPieNum, (byte)(9), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13008MetPieFcUl", localUtil.format(A13008MetPieFcUl, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", GXutil.rtrim( A228BarUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A13009MetPieFase", GXutil.rtrim( A13009MetPieFase));
      httpContext.ajax_rsp_assign_attri("", false, "A13011MetPieDfCo", A13011MetPieDfCo);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13007MetPieNum", GXutil.ltrim( localUtil.ntoc( Z13007MetPieNum, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13008MetPieFcUl", localUtil.format(Z13008MetPieFcUl, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z228BarUniMed", GXutil.rtrim( Z228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13009MetPieFase", GXutil.rtrim( Z13009MetPieFase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13011MetPieDfCo", Z13011MetPieDfCo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV33Fascod',fld:'vFASCOD',pic:'@!'},{av:'AV34Turno',fld:'vTURNO',pic:'9'},{av:'AV35Opecod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DEFECTOS'","{handler:'e121M92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV33Fascod',fld:'vFASCOD',pic:'@!'}]");
      setEventMetadata("'DEFECTOS'",",oparms:[{av:'AV33Fascod',fld:'vFASCOD',pic:'@!'},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A13008MetPieFcUl',fld:'METPIEFCUL',pic:''},{av:'AV35Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV34Turno',fld:'vTURNO',pic:'9'},{av:'AV33Fascod',fld:'vFASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13007MetPieNum',fld:'METPIENUM',pic:'ZZZZZZZZ9'},{av:'A13008MetPieFcUl',fld:'METPIEFCUL',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A13009MetPieFase',fld:'METPIEFASE',pic:''},{av:'A13011MetPieDfCo',fld:'METPIEDFCO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z407EmprNom'},{av:'Z13007MetPieNum'},{av:'Z13008MetPieFcUl'},{av:'Z228BarUniMed'},{av:'Z13009MetPieFase'},{av:'Z13011MetPieDfCo'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_METPIEFCUL","{handler:'valid_Metpiefcul',iparms:[]");
      setEventMetadata("VALID_METPIEFCUL",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("VALID_METPIEKIL","{handler:'valid_Metpiekil',iparms:[]");
      setEventMetadata("VALID_METPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_METPIEMET","{handler:'valid_Metpiemet',iparms:[]");
      setEventMetadata("VALID_METPIEMET",",oparms:[]}");
      setEventMetadata("VALID_METPIEOBS","{handler:'valid_Metpieobs',iparms:[]");
      setEventMetadata("VALID_METPIEOBS",",oparms:[]}");
      setEventMetadata("VALID_METPIEDCP","{handler:'valid_Metpiedcp',iparms:[]");
      setEventMetadata("VALID_METPIEDCP",",oparms:[]}");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2809MetTerCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV33Fascod = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z13008MetPieFcUl = GXutil.nullDate() ;
      Z13009MetPieFase = "" ;
      Z13011MetPieDfCo = "" ;
      Z2813MetPieCod = "" ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z4917MetPieObs = "" ;
      Z4913MetPieLoc = "" ;
      Z4915MetPieDCP = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      AV33Fascod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13008MetPieFcUl = GXutil.nullDate() ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A228BarUniMed = "" ;
      lblTextblock10_Jsonclick = "" ;
      A13009MetPieFase = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13011MetPieDfCo = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode413 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      A13789MaqcodForm = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode412 = "" ;
      GXCCtl = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A4917MetPieObs = "" ;
      A4913MetPieLoc = "" ;
      A4915MetPieDCP = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z228BarUniMed = "" ;
      T01M96_A407EmprNom = new String[] {""} ;
      T01M96_n407EmprNom = new boolean[] {false} ;
      T01M97_A228BarUniMed = new String[] {""} ;
      T01M98_A2809MetTerCod = new String[] {""} ;
      T01M98_A407EmprNom = new String[] {""} ;
      T01M98_n407EmprNom = new boolean[] {false} ;
      T01M98_A13007MetPieNum = new int[1] ;
      T01M98_n13007MetPieNum = new boolean[] {false} ;
      T01M98_A13008MetPieFcUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01M98_n13008MetPieFcUl = new boolean[] {false} ;
      T01M98_A228BarUniMed = new String[] {""} ;
      T01M98_A13009MetPieFase = new String[] {""} ;
      T01M98_n13009MetPieFase = new boolean[] {false} ;
      T01M98_A13011MetPieDfCo = new String[] {""} ;
      T01M98_n13011MetPieDfCo = new boolean[] {false} ;
      T01M98_A396EmprCod = new String[] {""} ;
      T01M98_A129BarCod = new int[1] ;
      T01M98_A132BarCodReo = new byte[1] ;
      T01M98_A130BarCodPar = new String[] {""} ;
      T01M99_A396EmprCod = new String[] {""} ;
      T01M99_A2809MetTerCod = new String[] {""} ;
      T01M99_A129BarCod = new int[1] ;
      T01M99_A132BarCodReo = new byte[1] ;
      T01M99_A130BarCodPar = new String[] {""} ;
      T01M95_A2809MetTerCod = new String[] {""} ;
      T01M95_A13007MetPieNum = new int[1] ;
      T01M95_n13007MetPieNum = new boolean[] {false} ;
      T01M95_A13008MetPieFcUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01M95_n13008MetPieFcUl = new boolean[] {false} ;
      T01M95_A13009MetPieFase = new String[] {""} ;
      T01M95_n13009MetPieFase = new boolean[] {false} ;
      T01M95_A13011MetPieDfCo = new String[] {""} ;
      T01M95_n13011MetPieDfCo = new boolean[] {false} ;
      T01M95_A396EmprCod = new String[] {""} ;
      T01M95_A129BarCod = new int[1] ;
      T01M95_A132BarCodReo = new byte[1] ;
      T01M95_A130BarCodPar = new String[] {""} ;
      T01M910_A396EmprCod = new String[] {""} ;
      T01M910_A2809MetTerCod = new String[] {""} ;
      T01M910_A129BarCod = new int[1] ;
      T01M910_A132BarCodReo = new byte[1] ;
      T01M910_A130BarCodPar = new String[] {""} ;
      T01M911_A396EmprCod = new String[] {""} ;
      T01M911_A2809MetTerCod = new String[] {""} ;
      T01M911_A129BarCod = new int[1] ;
      T01M911_A132BarCodReo = new byte[1] ;
      T01M911_A130BarCodPar = new String[] {""} ;
      T01M94_A2809MetTerCod = new String[] {""} ;
      T01M94_A13007MetPieNum = new int[1] ;
      T01M94_n13007MetPieNum = new boolean[] {false} ;
      T01M94_A13008MetPieFcUl = new java.util.Date[] {GXutil.nullDate()} ;
      T01M94_n13008MetPieFcUl = new boolean[] {false} ;
      T01M94_A13009MetPieFase = new String[] {""} ;
      T01M94_n13009MetPieFase = new boolean[] {false} ;
      T01M94_A13011MetPieDfCo = new String[] {""} ;
      T01M94_n13011MetPieDfCo = new boolean[] {false} ;
      T01M94_A396EmprCod = new String[] {""} ;
      T01M94_A129BarCod = new int[1] ;
      T01M94_A132BarCodReo = new byte[1] ;
      T01M94_A130BarCodPar = new String[] {""} ;
      T01M915_A396EmprCod = new String[] {""} ;
      T01M915_A2809MetTerCod = new String[] {""} ;
      T01M915_A129BarCod = new int[1] ;
      T01M915_A132BarCodReo = new byte[1] ;
      T01M915_A130BarCodPar = new String[] {""} ;
      T01M915_A2813MetPieCod = new String[] {""} ;
      T01M915_A12995MetPieDfLi = new short[1] ;
      T01M916_A396EmprCod = new String[] {""} ;
      T01M916_A2809MetTerCod = new String[] {""} ;
      T01M916_A129BarCod = new int[1] ;
      T01M916_A132BarCodReo = new byte[1] ;
      T01M916_A130BarCodPar = new String[] {""} ;
      T01M917_A2809MetTerCod = new String[] {""} ;
      T01M917_A129BarCod = new int[1] ;
      T01M917_A132BarCodReo = new byte[1] ;
      T01M917_A130BarCodPar = new String[] {""} ;
      T01M917_A2813MetPieCod = new String[] {""} ;
      T01M917_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01M917_A13006MetPieTurn = new byte[1] ;
      T01M917_A13005MetPieOpe = new int[1] ;
      T01M917_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M917_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M917_A12994MetPieDfUl = new short[1] ;
      T01M917_A4917MetPieObs = new String[] {""} ;
      T01M917_A4909MetPieDef = new short[1] ;
      T01M917_A4912MetPiePDo = new long[1] ;
      T01M917_A6635MetPieAnc = new short[1] ;
      T01M917_A4913MetPieLoc = new String[] {""} ;
      T01M917_A4915MetPieDCP = new String[] {""} ;
      T01M917_A396EmprCod = new String[] {""} ;
      T01M918_A396EmprCod = new String[] {""} ;
      T01M918_A2809MetTerCod = new String[] {""} ;
      T01M918_A129BarCod = new int[1] ;
      T01M918_A132BarCodReo = new byte[1] ;
      T01M918_A130BarCodPar = new String[] {""} ;
      T01M918_A2813MetPieCod = new String[] {""} ;
      T01M93_A2809MetTerCod = new String[] {""} ;
      T01M93_A129BarCod = new int[1] ;
      T01M93_A132BarCodReo = new byte[1] ;
      T01M93_A130BarCodPar = new String[] {""} ;
      T01M93_A2813MetPieCod = new String[] {""} ;
      T01M93_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01M93_A13006MetPieTurn = new byte[1] ;
      T01M93_A13005MetPieOpe = new int[1] ;
      T01M93_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M93_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M93_A12994MetPieDfUl = new short[1] ;
      T01M93_A4917MetPieObs = new String[] {""} ;
      T01M93_A4909MetPieDef = new short[1] ;
      T01M93_A4912MetPiePDo = new long[1] ;
      T01M93_A6635MetPieAnc = new short[1] ;
      T01M93_A4913MetPieLoc = new String[] {""} ;
      T01M93_A4915MetPieDCP = new String[] {""} ;
      T01M93_A396EmprCod = new String[] {""} ;
      T01M92_A2809MetTerCod = new String[] {""} ;
      T01M92_A129BarCod = new int[1] ;
      T01M92_A132BarCodReo = new byte[1] ;
      T01M92_A130BarCodPar = new String[] {""} ;
      T01M92_A2813MetPieCod = new String[] {""} ;
      T01M92_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01M92_A13006MetPieTurn = new byte[1] ;
      T01M92_A13005MetPieOpe = new int[1] ;
      T01M92_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M92_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M92_A12994MetPieDfUl = new short[1] ;
      T01M92_A4917MetPieObs = new String[] {""} ;
      T01M92_A4909MetPieDef = new short[1] ;
      T01M92_A4912MetPiePDo = new long[1] ;
      T01M92_A6635MetPieAnc = new short[1] ;
      T01M92_A4913MetPieLoc = new String[] {""} ;
      T01M92_A4915MetPieDCP = new String[] {""} ;
      T01M92_A396EmprCod = new String[] {""} ;
      T01M922_A396EmprCod = new String[] {""} ;
      T01M922_A2809MetTerCod = new String[] {""} ;
      T01M922_A129BarCod = new int[1] ;
      T01M922_A132BarCodReo = new byte[1] ;
      T01M922_A130BarCodPar = new String[] {""} ;
      T01M922_A2813MetPieCod = new String[] {""} ;
      T01M922_A12995MetPieDfLi = new short[1] ;
      T01M923_A396EmprCod = new String[] {""} ;
      T01M923_A2809MetTerCod = new String[] {""} ;
      T01M923_A129BarCod = new int[1] ;
      T01M923_A132BarCodReo = new byte[1] ;
      T01M923_A130BarCodPar = new String[] {""} ;
      T01M923_A2813MetPieCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T01M924_A407EmprNom = new String[] {""} ;
      T01M924_n407EmprNom = new boolean[] {false} ;
      T01M925_A228BarUniMed = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ13008MetPieFcUl = GXutil.nullDate() ;
      ZZ228BarUniMed = "" ;
      ZZ13009MetPieFase = "" ;
      ZZ13011MetPieDfCo = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn24__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn24__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn24__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn24__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn24__default(),
         new Object[] {
             new Object[] {
            T01M92_A2809MetTerCod, T01M92_A129BarCod, T01M92_A132BarCodReo, T01M92_A130BarCodPar, T01M92_A2813MetPieCod, T01M92_A5136MetPieFch, T01M92_A13006MetPieTurn, T01M92_A13005MetPieOpe, T01M92_A2814MetPieKil, T01M92_A2815MetPieMet,
            T01M92_A12994MetPieDfUl, T01M92_A4917MetPieObs, T01M92_A4909MetPieDef, T01M92_A4912MetPiePDo, T01M92_A6635MetPieAnc, T01M92_A4913MetPieLoc, T01M92_A4915MetPieDCP, T01M92_A396EmprCod
            }
            , new Object[] {
            T01M93_A2809MetTerCod, T01M93_A129BarCod, T01M93_A132BarCodReo, T01M93_A130BarCodPar, T01M93_A2813MetPieCod, T01M93_A5136MetPieFch, T01M93_A13006MetPieTurn, T01M93_A13005MetPieOpe, T01M93_A2814MetPieKil, T01M93_A2815MetPieMet,
            T01M93_A12994MetPieDfUl, T01M93_A4917MetPieObs, T01M93_A4909MetPieDef, T01M93_A4912MetPiePDo, T01M93_A6635MetPieAnc, T01M93_A4913MetPieLoc, T01M93_A4915MetPieDCP, T01M93_A396EmprCod
            }
            , new Object[] {
            T01M94_A2809MetTerCod, T01M94_A13007MetPieNum, T01M94_n13007MetPieNum, T01M94_A13008MetPieFcUl, T01M94_n13008MetPieFcUl, T01M94_A13009MetPieFase, T01M94_n13009MetPieFase, T01M94_A13011MetPieDfCo, T01M94_n13011MetPieDfCo, T01M94_A396EmprCod,
            T01M94_A129BarCod, T01M94_A132BarCodReo, T01M94_A130BarCodPar
            }
            , new Object[] {
            T01M95_A2809MetTerCod, T01M95_A13007MetPieNum, T01M95_n13007MetPieNum, T01M95_A13008MetPieFcUl, T01M95_n13008MetPieFcUl, T01M95_A13009MetPieFase, T01M95_n13009MetPieFase, T01M95_A13011MetPieDfCo, T01M95_n13011MetPieDfCo, T01M95_A396EmprCod,
            T01M95_A129BarCod, T01M95_A132BarCodReo, T01M95_A130BarCodPar
            }
            , new Object[] {
            T01M96_A407EmprNom, T01M96_n407EmprNom
            }
            , new Object[] {
            T01M97_A228BarUniMed
            }
            , new Object[] {
            T01M98_A2809MetTerCod, T01M98_A407EmprNom, T01M98_n407EmprNom, T01M98_A13007MetPieNum, T01M98_n13007MetPieNum, T01M98_A13008MetPieFcUl, T01M98_n13008MetPieFcUl, T01M98_A228BarUniMed, T01M98_A13009MetPieFase, T01M98_n13009MetPieFase,
            T01M98_A13011MetPieDfCo, T01M98_n13011MetPieDfCo, T01M98_A396EmprCod, T01M98_A129BarCod, T01M98_A132BarCodReo, T01M98_A130BarCodPar
            }
            , new Object[] {
            T01M99_A396EmprCod, T01M99_A2809MetTerCod, T01M99_A129BarCod, T01M99_A132BarCodReo, T01M99_A130BarCodPar
            }
            , new Object[] {
            T01M910_A396EmprCod, T01M910_A2809MetTerCod, T01M910_A129BarCod, T01M910_A132BarCodReo, T01M910_A130BarCodPar
            }
            , new Object[] {
            T01M911_A396EmprCod, T01M911_A2809MetTerCod, T01M911_A129BarCod, T01M911_A132BarCodReo, T01M911_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M915_A396EmprCod, T01M915_A2809MetTerCod, T01M915_A129BarCod, T01M915_A132BarCodReo, T01M915_A130BarCodPar, T01M915_A2813MetPieCod, T01M915_A12995MetPieDfLi
            }
            , new Object[] {
            T01M916_A396EmprCod, T01M916_A2809MetTerCod, T01M916_A129BarCod, T01M916_A132BarCodReo, T01M916_A130BarCodPar
            }
            , new Object[] {
            T01M917_A2809MetTerCod, T01M917_A129BarCod, T01M917_A132BarCodReo, T01M917_A130BarCodPar, T01M917_A2813MetPieCod, T01M917_A5136MetPieFch, T01M917_A13006MetPieTurn, T01M917_A13005MetPieOpe, T01M917_A2814MetPieKil, T01M917_A2815MetPieMet,
            T01M917_A12994MetPieDfUl, T01M917_A4917MetPieObs, T01M917_A4909MetPieDef, T01M917_A4912MetPiePDo, T01M917_A6635MetPieAnc, T01M917_A4913MetPieLoc, T01M917_A4915MetPieDCP, T01M917_A396EmprCod
            }
            , new Object[] {
            T01M918_A396EmprCod, T01M918_A2809MetTerCod, T01M918_A129BarCod, T01M918_A132BarCodReo, T01M918_A130BarCodPar, T01M918_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M922_A396EmprCod, T01M922_A2809MetTerCod, T01M922_A129BarCod, T01M922_A132BarCodReo, T01M922_A130BarCodPar, T01M922_A2813MetPieCod, T01M922_A12995MetPieDfLi
            }
            , new Object[] {
            T01M923_A396EmprCod, T01M923_A2809MetTerCod, T01M923_A129BarCod, T01M923_A132BarCodReo, T01M923_A130BarCodPar, T01M923_A2813MetPieCod
            }
            , new Object[] {
            T01M924_A407EmprNom, T01M924_n407EmprNom
            }
            , new Object[] {
            T01M925_A228BarUniMed
            }
         }
      );
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
      AV36Pgmname = "TTrn24" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte wcpOAV34Turno ;
   private byte Z132BarCodReo ;
   private byte Z13006MetPieTurn ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV34Turno ;
   private byte nKeyPressed ;
   private byte A13006MetPieTurn ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZZ132BarCodReo ;
   private short Z12994MetPieDfUl ;
   private short Z4909MetPieDef ;
   private short Z6635MetPieAnc ;
   private short nRcdDeleted_413 ;
   private short nRcdExists_413 ;
   private short nIsMod_413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount413 ;
   private short RcdFound413 ;
   private short nBlankRcdUsr413 ;
   private short A12994MetPieDfUl ;
   private short A4909MetPieDef ;
   private short A6635MetPieAnc ;
   private short RcdFound412 ;
   private short nIsDirty_412 ;
   private short nIsDirty_413 ;
   private int wcpOA129BarCod ;
   private int wcpOAV35Opecod ;
   private int Z129BarCod ;
   private int Z13007MetPieNum ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z13005MetPieOpe ;
   private int A129BarCod ;
   private int AV35Opecod ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A13007MetPieNum ;
   private int edtMetPieNum_Enabled ;
   private int edtMetPieFcUl_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int edtMetPieFase_Enabled ;
   private int edtMetPieDfCo_Enabled ;
   private int edtavnRcdDeleted_413_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieFch_Enabled ;
   private int edtMetPieDfUl_Enabled ;
   private int edtMetPieOpe_Enabled ;
   private int edtMetPieTurn_Enabled ;
   private int edtMetPieObs_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPiePDo_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieLoc_Enabled ;
   private int edtMetPieDCP_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A13005MetPieOpe ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMetPieTurn_Enabled ;
   private int defedtMetPieOpe_Enabled ;
   private int defedtMetPieFch_Enabled ;
   private int defedtMetPieCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMetPieDfCo_Backcolor ;
   private int edtMetPieFase_Backcolor ;
   private int edtBarUniMed_Backcolor ;
   private int edtMetPieFcUl_Backcolor ;
   private int edtMetPieNum_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtMetTerCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int5[] ;
   private int ZZ129BarCod ;
   private int ZZ13007MetPieNum ;
   private long Z4912MetPiePDo ;
   private long GRID1_nFirstRecordOnPage ;
   private long A4912MetPiePDo ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2809MetTerCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV33Fascod ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z13009MetPieFase ;
   private String Z2813MetPieCod ;
   private String Z4913MetPieLoc ;
   private String Z4915MetPieDCP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String AV33Fascod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMetPieNum_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMetPieNum_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMetPieFcUl_Internalname ;
   private String edtMetPieFcUl_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMetPieFase_Internalname ;
   private String A13009MetPieFase ;
   private String edtMetPieFase_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMetPieDfCo_Internalname ;
   private String sMode413 ;
   private String edtavnRcdDeleted_413_Internalname ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieFch_Internalname ;
   private String edtMetPieDfUl_Internalname ;
   private String edtMetPieOpe_Internalname ;
   private String edtMetPieTurn_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPiePDo_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieLoc_Internalname ;
   private String edtMetPieDCP_Internalname ;
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
   private String A13789MaqcodForm ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode412 ;
   private String GXCCtl ;
   private String A4913MetPieLoc ;
   private String A4915MetPieDCP ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z228BarUniMed ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_413_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieFch_Jsonclick ;
   private String edtMetPieDfUl_Jsonclick ;
   private String edtMetPieOpe_Jsonclick ;
   private String edtMetPieTurn_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
   private String edtMetPieDef_Jsonclick ;
   private String edtMetPiePDo_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieLoc_Jsonclick ;
   private String edtMetPieDCP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ228BarUniMed ;
   private String ZZ13009MetPieFase ;
   private java.util.Date Z13008MetPieFcUl ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date A13008MetPieFcUl ;
   private java.util.Date A5136MetPieFch ;
   private java.util.Date ZZ13008MetPieFcUl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n13008MetPieFcUl ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13007MetPieNum ;
   private boolean n13009MetPieFase ;
   private boolean n13011MetPieDfCo ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13011MetPieDfCo ;
   private String Z4917MetPieObs ;
   private String A13011MetPieDfCo ;
   private String A4917MetPieObs ;
   private String ZZ13011MetPieDfCo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01M96_A407EmprNom ;
   private boolean[] T01M96_n407EmprNom ;
   private String[] T01M97_A228BarUniMed ;
   private String[] T01M98_A2809MetTerCod ;
   private String[] T01M98_A407EmprNom ;
   private boolean[] T01M98_n407EmprNom ;
   private int[] T01M98_A13007MetPieNum ;
   private boolean[] T01M98_n13007MetPieNum ;
   private java.util.Date[] T01M98_A13008MetPieFcUl ;
   private boolean[] T01M98_n13008MetPieFcUl ;
   private String[] T01M98_A228BarUniMed ;
   private String[] T01M98_A13009MetPieFase ;
   private boolean[] T01M98_n13009MetPieFase ;
   private String[] T01M98_A13011MetPieDfCo ;
   private boolean[] T01M98_n13011MetPieDfCo ;
   private String[] T01M98_A396EmprCod ;
   private int[] T01M98_A129BarCod ;
   private byte[] T01M98_A132BarCodReo ;
   private String[] T01M98_A130BarCodPar ;
   private String[] T01M99_A396EmprCod ;
   private String[] T01M99_A2809MetTerCod ;
   private int[] T01M99_A129BarCod ;
   private byte[] T01M99_A132BarCodReo ;
   private String[] T01M99_A130BarCodPar ;
   private String[] T01M95_A2809MetTerCod ;
   private int[] T01M95_A13007MetPieNum ;
   private boolean[] T01M95_n13007MetPieNum ;
   private java.util.Date[] T01M95_A13008MetPieFcUl ;
   private boolean[] T01M95_n13008MetPieFcUl ;
   private String[] T01M95_A13009MetPieFase ;
   private boolean[] T01M95_n13009MetPieFase ;
   private String[] T01M95_A13011MetPieDfCo ;
   private boolean[] T01M95_n13011MetPieDfCo ;
   private String[] T01M95_A396EmprCod ;
   private int[] T01M95_A129BarCod ;
   private byte[] T01M95_A132BarCodReo ;
   private String[] T01M95_A130BarCodPar ;
   private String[] T01M910_A396EmprCod ;
   private String[] T01M910_A2809MetTerCod ;
   private int[] T01M910_A129BarCod ;
   private byte[] T01M910_A132BarCodReo ;
   private String[] T01M910_A130BarCodPar ;
   private String[] T01M911_A396EmprCod ;
   private String[] T01M911_A2809MetTerCod ;
   private int[] T01M911_A129BarCod ;
   private byte[] T01M911_A132BarCodReo ;
   private String[] T01M911_A130BarCodPar ;
   private String[] T01M94_A2809MetTerCod ;
   private int[] T01M94_A13007MetPieNum ;
   private boolean[] T01M94_n13007MetPieNum ;
   private java.util.Date[] T01M94_A13008MetPieFcUl ;
   private boolean[] T01M94_n13008MetPieFcUl ;
   private String[] T01M94_A13009MetPieFase ;
   private boolean[] T01M94_n13009MetPieFase ;
   private String[] T01M94_A13011MetPieDfCo ;
   private boolean[] T01M94_n13011MetPieDfCo ;
   private String[] T01M94_A396EmprCod ;
   private int[] T01M94_A129BarCod ;
   private byte[] T01M94_A132BarCodReo ;
   private String[] T01M94_A130BarCodPar ;
   private String[] T01M915_A396EmprCod ;
   private String[] T01M915_A2809MetTerCod ;
   private int[] T01M915_A129BarCod ;
   private byte[] T01M915_A132BarCodReo ;
   private String[] T01M915_A130BarCodPar ;
   private String[] T01M915_A2813MetPieCod ;
   private short[] T01M915_A12995MetPieDfLi ;
   private String[] T01M916_A396EmprCod ;
   private String[] T01M916_A2809MetTerCod ;
   private int[] T01M916_A129BarCod ;
   private byte[] T01M916_A132BarCodReo ;
   private String[] T01M916_A130BarCodPar ;
   private String[] T01M917_A2809MetTerCod ;
   private int[] T01M917_A129BarCod ;
   private byte[] T01M917_A132BarCodReo ;
   private String[] T01M917_A130BarCodPar ;
   private String[] T01M917_A2813MetPieCod ;
   private java.util.Date[] T01M917_A5136MetPieFch ;
   private byte[] T01M917_A13006MetPieTurn ;
   private int[] T01M917_A13005MetPieOpe ;
   private java.math.BigDecimal[] T01M917_A2814MetPieKil ;
   private java.math.BigDecimal[] T01M917_A2815MetPieMet ;
   private short[] T01M917_A12994MetPieDfUl ;
   private String[] T01M917_A4917MetPieObs ;
   private short[] T01M917_A4909MetPieDef ;
   private long[] T01M917_A4912MetPiePDo ;
   private short[] T01M917_A6635MetPieAnc ;
   private String[] T01M917_A4913MetPieLoc ;
   private String[] T01M917_A4915MetPieDCP ;
   private String[] T01M917_A396EmprCod ;
   private String[] T01M918_A396EmprCod ;
   private String[] T01M918_A2809MetTerCod ;
   private int[] T01M918_A129BarCod ;
   private byte[] T01M918_A132BarCodReo ;
   private String[] T01M918_A130BarCodPar ;
   private String[] T01M918_A2813MetPieCod ;
   private String[] T01M93_A2809MetTerCod ;
   private int[] T01M93_A129BarCod ;
   private byte[] T01M93_A132BarCodReo ;
   private String[] T01M93_A130BarCodPar ;
   private String[] T01M93_A2813MetPieCod ;
   private java.util.Date[] T01M93_A5136MetPieFch ;
   private byte[] T01M93_A13006MetPieTurn ;
   private int[] T01M93_A13005MetPieOpe ;
   private java.math.BigDecimal[] T01M93_A2814MetPieKil ;
   private java.math.BigDecimal[] T01M93_A2815MetPieMet ;
   private short[] T01M93_A12994MetPieDfUl ;
   private String[] T01M93_A4917MetPieObs ;
   private short[] T01M93_A4909MetPieDef ;
   private long[] T01M93_A4912MetPiePDo ;
   private short[] T01M93_A6635MetPieAnc ;
   private String[] T01M93_A4913MetPieLoc ;
   private String[] T01M93_A4915MetPieDCP ;
   private String[] T01M93_A396EmprCod ;
   private String[] T01M92_A2809MetTerCod ;
   private int[] T01M92_A129BarCod ;
   private byte[] T01M92_A132BarCodReo ;
   private String[] T01M92_A130BarCodPar ;
   private String[] T01M92_A2813MetPieCod ;
   private java.util.Date[] T01M92_A5136MetPieFch ;
   private byte[] T01M92_A13006MetPieTurn ;
   private int[] T01M92_A13005MetPieOpe ;
   private java.math.BigDecimal[] T01M92_A2814MetPieKil ;
   private java.math.BigDecimal[] T01M92_A2815MetPieMet ;
   private short[] T01M92_A12994MetPieDfUl ;
   private String[] T01M92_A4917MetPieObs ;
   private short[] T01M92_A4909MetPieDef ;
   private long[] T01M92_A4912MetPiePDo ;
   private short[] T01M92_A6635MetPieAnc ;
   private String[] T01M92_A4913MetPieLoc ;
   private String[] T01M92_A4915MetPieDCP ;
   private String[] T01M92_A396EmprCod ;
   private String[] T01M922_A396EmprCod ;
   private String[] T01M922_A2809MetTerCod ;
   private int[] T01M922_A129BarCod ;
   private byte[] T01M922_A132BarCodReo ;
   private String[] T01M922_A130BarCodPar ;
   private String[] T01M922_A2813MetPieCod ;
   private short[] T01M922_A12995MetPieDfLi ;
   private String[] T01M923_A396EmprCod ;
   private String[] T01M923_A2809MetTerCod ;
   private int[] T01M923_A129BarCod ;
   private byte[] T01M923_A132BarCodReo ;
   private String[] T01M923_A130BarCodPar ;
   private String[] T01M923_A2813MetPieCod ;
   private String[] T01M924_A407EmprNom ;
   private boolean[] T01M924_n407EmprNom ;
   private String[] T01M925_A228BarUniMed ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn24__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn24__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn24__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn24__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn24__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M92", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieFch, MetPieTurn, MetPieOpe, MetPieKil, MetPieMet, MetPieDfUl, MetPieObs, MetPieDef, MetPiePDo, MetPieAnc, MetPieLoc, MetPieDCP, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieFch, MetPieTurn, MetPieOpe, MetPieKil, MetPieMet, MetPieDfUl, MetPieObs, MetPieDef, MetPiePDo, MetPieAnc, MetPieLoc, MetPieDCP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M93", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieFch, MetPieTurn, MetPieOpe, MetPieKil, MetPieMet, MetPieDfUl, MetPieObs, MetPieDef, MetPiePDo, MetPieAnc, MetPieLoc, MetPieDCP, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M94", "SELECT MetTerCod, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M95", "SELECT MetTerCod, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M96", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M97", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M98", "SELECT /*+ FIRST_ROWS(1) */ TM1.MetTerCod, T2.EmprNom, TM1.MetPieNum, TM1.MetPieFcUl, T3.BarUniMed, TM1.MetPieFase, TM1.MetPieDfCo, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM ((TXPCMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M99", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M910", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M912", "INSERT INTO TXPCMETPI(MetTerCod, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T01M913", "UPDATE TXPCMETPI SET MetPieNum=?, MetPieFcUl=?, MetPieFase=?, MetPieDfCo=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T01M914", "DELETE FROM TXPCMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new ForEachCursor("T01M915", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M916", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M917", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieFch, MetPieTurn, MetPieOpe, MetPieKil, MetPieMet, MetPieDfUl, MetPieObs, MetPieDef, MetPiePDo, MetPieAnc, MetPieLoc, MetPieDCP, EmprCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M918", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M919", "INSERT INTO TXPLMETPI(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieFch, MetPieTurn, MetPieOpe, MetPieKil, MetPieMet, MetPieDfUl, MetPieObs, MetPieDef, MetPiePDo, MetPieAnc, MetPieLoc, MetPieDCP, EmprCod, MetPieEst, MetPieDsc, MetPieMtD, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPieRap, MetPieMue) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01M920", "UPDATE TXPLMETPI SET MetPieFch=?, MetPieTurn=?, MetPieOpe=?, MetPieKil=?, MetPieMet=?, MetPieDfUl=?, MetPieObs=?, MetPieDef=?, MetPiePDo=?, MetPieAnc=?, MetPieLoc=?, MetPieDCP=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01M921", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01M922", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M923", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M924", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M925", "SELECT BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 10);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 10);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 10);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
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
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 600);
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               return;
            case 11 :
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 600);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 10);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               stmt.setString(9, (String)parms[12], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setVarchar(12, (String)parms[11], 1024, false);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setLong(14, ((Number) parms[13]).longValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 10);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 3);
               return;
            case 18 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1024, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 10);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setString(14, (String)parms[13], 10);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

