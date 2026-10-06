package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpckhrb_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2813MetPieCod = httpContext.GetPar( "MetPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_11J413( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2813MetPieCod) ;
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
            AV36CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCod), 6, 0));
            AV35CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35CliNom", AV35CliNom);
            AV37BarMat = httpContext.GetPar( "BarMat") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarMat", AV37BarMat);
            AV38BarNmtr = httpContext.GetPar( "BarNmtr") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarNmtr", AV38BarNmtr);
            AV39BarColNom = httpContext.GetPar( "BarColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarColNom", AV39BarColNom);
            AV40BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40BarColNum), 6, 0));
            AV41PartCod = httpContext.GetPar( "PartCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41PartCod", AV41PartCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PACKING HOJA RUTA", ""), (short)(0)) ;
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
      nRC_GXsfl_125 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_125"))) ;
      nGXsfl_125_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_125_idx"))) ;
      sGXsfl_125_idx = httpContext.GetPar( "sGXsfl_125_idx") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
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

   public tpckhrb_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpckhrb_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpckhrb_impl.class ));
   }

   public tpckhrb_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPCKHRB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cliente Destino", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A2311BarCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCliDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2311BarCliDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2311BarCliDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCliDes_Jsonclick, 0, "", "", "", "", "", 1, edtBarCliDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Fin", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtBarFecFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecFin_Internalname, localUtil.format(A2496BarFecFin, "99/99/99"), localUtil.format( A2496BarFecFin, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecFin_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecFin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPCKHRB.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Ult.Linea Piezas Auditoria", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudULin_Internalname, GXutil.ltrim( localUtil.ntoc( A4844BarAudULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4844BarAudULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4844BarAudULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudULin_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Suma N.Cajas Packing", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieSuCa_Internalname, GXutil.ltrim( localUtil.ntoc( A8355MetPieSuCa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieSuCa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8355MetPieSuCa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8355MetPieSuCa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieSuCa_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieSuCa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Suma Peso Bruto Packing", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieSuPB_Internalname, GXutil.ltrim( localUtil.ntoc( A8356MetPieSuPB, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieSuPB_Enabled!=0) ? localUtil.format( A8356MetPieSuPB, "ZZZZZZ9.99") : localUtil.format( A8356MetPieSuPB, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieSuPB_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieSuPB_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Suma Tara Packing", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieSuTA_Internalname, GXutil.ltrim( localUtil.ntoc( A8357MetPieSuTA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieSuTA_Enabled!=0) ? localUtil.format( A8357MetPieSuTA, "ZZZZZZ9.99") : localUtil.format( A8357MetPieSuTA, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieSuTA_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieSuTA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Suma Peso Neto Packing", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieSuPN_Internalname, GXutil.ltrim( localUtil.ntoc( A8358MetPieSuPN, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieSuPN_Enabled!=0) ? localUtil.format( A8358MetPieSuPN, "ZZZZZZ9.99") : localUtil.format( A8358MetPieSuPN, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieSuPN_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieSuPN_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Suma Conos Packing", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieSuCo_Internalname, GXutil.ltrim( localUtil.ntoc( A8359MetPieSuCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieSuCo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8359MetPieSuCo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8359MetPieSuCo), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieSuCo_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieSuCo_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCKHRB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol125( ) ;
      nGXsfl_125_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount413 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_413 = (short)(1) ;
            scanStart11J413( ) ;
            while ( RcdFound413 != 0 )
            {
               init_level_properties413( ) ;
               getByPrimaryKey11J413( ) ;
               addRow11J413( ) ;
               scanNext11J413( ) ;
            }
            scanEnd11J413( ) ;
            nBlankRcdCount413 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B8357MetPieSuTA = A8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         B8359MetPieSuCo = A8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         B8358MetPieSuPN = A8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         B8355MetPieSuCa = A8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         B8356MetPieSuPB = A8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         standaloneNotModal11J413( ) ;
         standaloneModal11J413( ) ;
         sMode413 = Gx_mode ;
         while ( nGXsfl_125_idx < nRC_GXsfl_125 )
         {
            bGXsfl_125_Refreshing = true ;
            readRow11J413( ) ;
            edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
            if ( ( nRcdExists_413 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal11J413( ) ;
            }
            sendRow11J413( ) ;
            bGXsfl_125_Refreshing = false ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A8357MetPieSuTA = B8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8359MetPieSuCo = B8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         A8358MetPieSuPN = B8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8355MetPieSuCa = B8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = B8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount413 = (short)(5) ;
         nRcdExists_413 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart11J413( ) ;
            while ( RcdFound413 != 0 )
            {
               sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_125413( ) ;
               init_level_properties413( ) ;
               standaloneNotModal11J413( ) ;
               getByPrimaryKey11J413( ) ;
               standaloneModal11J413( ) ;
               addRow11J413( ) ;
               scanNext11J413( ) ;
            }
            scanEnd11J413( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode413 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_125413( ) ;
      initAll11J413( ) ;
      init_level_properties413( ) ;
      B8357MetPieSuTA = A8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      B8359MetPieSuCo = A8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      B8358MetPieSuPN = A8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      B8355MetPieSuCa = A8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      B8356MetPieSuPB = A8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
      nBlankRcdCount413 = (short)(nBlankRcdUsr413+nBlankRcdCount413) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount413 > 0 )
      {
         standaloneNotModal11J413( ) ;
         standaloneModal11J413( ) ;
         addRow11J413( ) ;
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
      A8357MetPieSuTA = B8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      A8359MetPieSuCo = B8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      A8358MetPieSuPN = B8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      A8355MetPieSuCa = B8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      A8356MetPieSuPB = B8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCKHRB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPCKHRB.htm");
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
      e1111J2 ();
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
            Z2496BarFecFin = localUtil.ctod( httpContext.cgiGet( "Z2496BarFecFin"), 0) ;
            Z2311BarCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z2311BarCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
            Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1234BarNomCli = httpContext.cgiGet( "Z1234BarNomCli") ;
            Z1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1235BarNumCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4844BarAudULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4844BarAudULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O8357MetPieSuTA = localUtil.ctond( httpContext.cgiGet( "O8357MetPieSuTA")) ;
            O8359MetPieSuCo = (int)(localUtil.ctol( httpContext.cgiGet( "O8359MetPieSuCo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O8358MetPieSuPN = localUtil.ctond( httpContext.cgiGet( "O8358MetPieSuPN")) ;
            O8355MetPieSuCa = (short)(localUtil.ctol( httpContext.cgiGet( "O8355MetPieSuCa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O8356MetPieSuPB = localUtil.ctond( httpContext.cgiGet( "O8356MetPieSuPB")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_125 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_125"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            AV52Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A2311BarCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
            A2496BarFecFin = localUtil.ctod( httpContext.cgiGet( edtBarFecFin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
            A4844BarAudULin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAudULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4844BarAudULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
            A8355MetPieSuCa = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieSuCa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
            A8356MetPieSuPB = localUtil.ctond( httpContext.cgiGet( edtMetPieSuPB_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
            A8357MetPieSuTA = localUtil.ctond( httpContext.cgiGet( edtMetPieSuTA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
            A8358MetPieSuPN = localUtil.ctond( httpContext.cgiGet( edtMetPieSuPN_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
            A8359MetPieSuCo = (int)(localUtil.ctol( httpContext.cgiGet( edtMetPieSuCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
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
                        e1111J2 ();
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
            initAll11J412( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_413_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_413_Enabled), 5, 0), !bGXsfl_125_Refreshing);
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
      disableAttributes11J412( ) ;
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

   public void confirm_11J0( )
   {
      beforeValidate11J412( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls11J412( ) ;
         }
         else
         {
            checkExtendedTable11J412( ) ;
            if ( AnyError == 0 )
            {
               zm11J412( 17) ;
               zm11J412( 18) ;
               zm11J412( 19) ;
               zm11J412( 20) ;
            }
            closeExtendedTableCursors11J412( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode412 = Gx_mode ;
         confirm_11J413( ) ;
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
         confirmValues11J0( ) ;
      }
   }

   public void confirm_11J413( )
   {
      s8357MetPieSuTA = O8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      s8359MetPieSuCo = O8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      s8358MetPieSuPN = O8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      s8355MetPieSuCa = O8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      s8356MetPieSuPB = O8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow11J413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            getKey11J413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               if ( RcdFound413 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate11J413( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable11J413( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors11J413( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O8357MetPieSuTA = A8357MetPieSuTA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
                     O8359MetPieSuCo = A8359MetPieSuCo ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
                     O8358MetPieSuPN = A8358MetPieSuPN ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
                     O8355MetPieSuCa = A8355MetPieSuCa ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
                     O8356MetPieSuPB = A8356MetPieSuPB ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
                  }
               }
               else
               {
                  GXCCtl = "METPIECOD_" + sGXsfl_125_idx ;
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
                     getByPrimaryKey11J413( ) ;
                     load11J413( ) ;
                     beforeValidate11J413( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls11J413( ) ;
                        O8357MetPieSuTA = A8357MetPieSuTA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
                        O8359MetPieSuCo = A8359MetPieSuCo ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
                        O8358MetPieSuPN = A8358MetPieSuPN ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
                        O8355MetPieSuCa = A8355MetPieSuCa ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
                        O8356MetPieSuPB = A8356MetPieSuPB ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate11J413( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable11J413( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors11J413( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O8357MetPieSuTA = A8357MetPieSuTA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
                           O8359MetPieSuCo = A8359MetPieSuCo ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
                           O8358MetPieSuPN = A8358MetPieSuPN ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
                           O8355MetPieSuCa = A8355MetPieSuCa ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
                           O8356MetPieSuPB = A8356MetPieSuPB ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_125_idx ;
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
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_125_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_125_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_125_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4910MetPieMtD_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6635MetPieAnc_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O8357MetPieSuTA = s8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      O8359MetPieSuCo = s8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      O8358MetPieSuPN = s8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      O8355MetPieSuCa = s8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      O8356MetPieSuPB = s8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption11J0( )
   {
   }

   public void e1111J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpckhrb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV52Pgmname, (byte)(99), GXv_char2) ;
      tpckhrb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpckhrb_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Terminal", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Hdr", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Materia", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV18Lit6 = httpContext.getMessage( "Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV19Lit7 = httpContext.getMessage( "Partido", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      AV20Lit8 = httpContext.getMessage( "N.Hilo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpckhrb_impl.this.A396EmprCod = GXv_char2[0] ;
      tpckhrb_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpckhrb_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm11J412( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         Z2496BarFecFin = T011J8_A2496BarFecFin[0] ;
         Z2311BarCliDes = T011J8_A2311BarCliDes[0] ;
         Z212BarSer = T011J8_A212BarSer[0] ;
         Z135BarColNom = T011J8_A135BarColNom[0] ;
         Z136BarColNum = T011J8_A136BarColNum[0] ;
         Z1234BarNomCli = T011J8_A1234BarNomCli[0] ;
         Z1235BarNumCli = T011J8_A1235BarNumCli[0] ;
         Z4844BarAudULin = T011J8_A4844BarAudULin[0] ;
         Z252CliCod = T011J8_A252CliCod[0] ;
      }
      if ( GX_JID == -16 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z2496BarFecFin = A2496BarFecFin ;
         Z2311BarCliDes = A2311BarCliDes ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z4844BarAudULin = A4844BarAudULin ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z8355MetPieSuCa = A8355MetPieSuCa ;
         Z8356MetPieSuPB = A8356MetPieSuPB ;
         Z8357MetPieSuTA = A8357MetPieSuTA ;
         Z8358MetPieSuPN = A8358MetPieSuPN ;
         Z8359MetPieSuCo = A8359MetPieSuCo ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMetPieCod_Inputmask = "999999999" ;
      AV52Pgmname = "TPCKHRB" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T011J6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T011J6_A407EmprNom[0] ;
      n407EmprNom = T011J6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T011J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      zm11J412( 18) ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A2496BarFecFin = T011J8_A2496BarFecFin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
      A2311BarCliDes = T011J8_A2311BarCliDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
      A212BarSer = T011J8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T011J8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T011J8_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T011J8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T011J8_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A4844BarAudULin = T011J8_A4844BarAudULin[0] ;
      n4844BarAudULin = T011J8_n4844BarAudULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
      A252CliCod = T011J8_A252CliCod[0] ;
      n252CliCod = T011J8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(5);
      /* Using cursor T011J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T011J9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T011J11 */
      pr_default.execute(8, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A8355MetPieSuCa = T011J11_A8355MetPieSuCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = T011J11_A8356MetPieSuPB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         A8357MetPieSuTA = T011J11_A8357MetPieSuTA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8358MetPieSuPN = T011J11_A8358MetPieSuPN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8359MetPieSuCo = T011J11_A8359MetPieSuCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      else
      {
         A8355MetPieSuCa = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         A8357MetPieSuTA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8358MetPieSuPN = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8359MetPieSuCo = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      O8355MetPieSuCa = A8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      O8356MetPieSuPB = A8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      O8357MetPieSuTA = A8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      O8358MetPieSuPN = A8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      O8359MetPieSuCo = A8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      pr_default.close(8);
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
      if ( true /* Level */ && isIns( )  )
      {
         A2496BarFecFin = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
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

   public void load11J412( )
   {
      /* Using cursor T011J13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound412 = (short)(1) ;
         A2496BarFecFin = T011J13_A2496BarFecFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
         A407EmprNom = T011J13_A407EmprNom[0] ;
         n407EmprNom = T011J13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T011J13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A2311BarCliDes = T011J13_A2311BarCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
         A212BarSer = T011J13_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T011J13_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T011J13_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1234BarNomCli = T011J13_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = T011J13_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A4844BarAudULin = T011J13_A4844BarAudULin[0] ;
         n4844BarAudULin = T011J13_n4844BarAudULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
         A252CliCod = T011J13_A252CliCod[0] ;
         n252CliCod = T011J13_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A8355MetPieSuCa = T011J13_A8355MetPieSuCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = T011J13_A8356MetPieSuPB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         A8357MetPieSuTA = T011J13_A8357MetPieSuTA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8358MetPieSuPN = T011J13_A8358MetPieSuPN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8359MetPieSuCo = T011J13_A8359MetPieSuCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         zm11J412( -16) ;
      }
      pr_default.close(9);
      onLoadActions11J412( ) ;
   }

   public void onLoadActions11J412( )
   {
      O8357MetPieSuTA = A8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      O8359MetPieSuCo = A8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      O8358MetPieSuPN = A8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      O8355MetPieSuCa = A8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      O8356MetPieSuPB = A8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
   }

   public void checkExtendedTable11J412( )
   {
      nIsDirty_412 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors11J412( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey11J412( )
   {
      /* Using cursor T011J14 */
      pr_default.execute(10, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      else
      {
         RcdFound412 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T011J5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T011J5_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( GXutil.strcmp(T011J5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T011J5_A129BarCod[0] == A129BarCod ) && ( T011J5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J5_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm11J412( 16) ;
         RcdFound412 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode412 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load11J412( ) ;
         if ( AnyError == 1 )
         {
            RcdFound412 = (short)(0) ;
            initializeNonKey11J412( ) ;
         }
         Gx_mode = sMode412 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound412 = (short)(0) ;
         initializeNonKey11J412( ) ;
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
      getKey11J412( ) ;
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
      /* Using cursor T011J15 */
      pr_default.execute(11, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T011J15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T011J15_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T011J15_A129BarCod[0] == A129BarCod ) && ( T011J15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T011J15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T011J15_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T011J15_A129BarCod[0] == A129BarCod ) && ( T011J15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound412 = (short)(0) ;
      /* Using cursor T011J16 */
      pr_default.execute(12, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T011J16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T011J16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T011J16_A129BarCod[0] == A129BarCod ) && ( T011J16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T011J16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T011J16_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T011J16_A129BarCod[0] == A129BarCod ) && ( T011J16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound412 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey11J412( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A8357MetPieSuTA = O8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8359MetPieSuCo = O8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         A8358MetPieSuPN = O8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8355MetPieSuCa = O8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = O8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         insert11J412( ) ;
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
               A8357MetPieSuTA = O8357MetPieSuTA ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
               A8359MetPieSuCo = O8359MetPieSuCo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
               A8358MetPieSuPN = O8358MetPieSuPN ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
               A8355MetPieSuCa = O8355MetPieSuCa ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
               A8356MetPieSuPB = O8356MetPieSuPB ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A8357MetPieSuTA = O8357MetPieSuTA ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
               A8359MetPieSuCo = O8359MetPieSuCo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
               A8358MetPieSuPN = O8358MetPieSuPN ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
               A8355MetPieSuCa = O8355MetPieSuCa ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
               A8356MetPieSuPB = O8356MetPieSuPB ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               update11J412( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A2809MetTerCod, Z2809MetTerCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A8357MetPieSuTA = O8357MetPieSuTA ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
               A8359MetPieSuCo = O8359MetPieSuCo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
               A8358MetPieSuPN = O8358MetPieSuPN ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
               A8355MetPieSuCa = O8355MetPieSuCa ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
               A8356MetPieSuPB = O8356MetPieSuPB ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               insert11J412( ) ;
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
                  A8357MetPieSuTA = O8357MetPieSuTA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
                  A8359MetPieSuCo = O8359MetPieSuCo ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
                  A8358MetPieSuPN = O8358MetPieSuPN ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
                  A8355MetPieSuCa = O8355MetPieSuCa ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
                  A8356MetPieSuPB = O8356MetPieSuPB ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
                  insert11J412( ) ;
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
         A8357MetPieSuTA = O8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8359MetPieSuCo = O8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         A8358MetPieSuPN = O8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8355MetPieSuCa = O8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = O8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
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
      getKey11J412( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpckhrb");
   }

   public void insert_check( )
   {
      confirm_11J0( ) ;
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
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart11J412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd11J412( ) ;
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
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart11J412( ) ;
      if ( RcdFound412 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound412 != 0 )
         {
            scanNext11J412( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd11J412( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency11J412( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011J4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T011J17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || !( GXutil.dateCompare(GXutil.resetTime(Z2496BarFecFin), GXutil.resetTime(T011J17_A2496BarFecFin[0])) ) || ( Z2311BarCliDes != T011J17_A2311BarCliDes[0] ) || ( GXutil.strcmp(Z212BarSer, T011J17_A212BarSer[0]) != 0 ) || ( GXutil.strcmp(Z135BarColNom, T011J17_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T011J17_A136BarColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1234BarNomCli, T011J17_A1234BarNomCli[0]) != 0 ) || ( Z1235BarNumCli != T011J17_A1235BarNumCli[0] ) || ( Z4844BarAudULin != T011J17_A4844BarAudULin[0] ) || ( Z252CliCod != T011J17_A252CliCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2496BarFecFin), GXutil.resetTime(T011J17_A2496BarFecFin[0])) ) )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarFecFin");
               GXutil.writeLogRaw("Old: ",Z2496BarFecFin);
               GXutil.writeLogRaw("Current: ",T011J17_A2496BarFecFin[0]);
            }
            if ( Z2311BarCliDes != T011J17_A2311BarCliDes[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarCliDes");
               GXutil.writeLogRaw("Old: ",Z2311BarCliDes);
               GXutil.writeLogRaw("Current: ",T011J17_A2311BarCliDes[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T011J17_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T011J17_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T011J17_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T011J17_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T011J17_A136BarColNum[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T011J17_A136BarColNum[0]);
            }
            if ( GXutil.strcmp(Z1234BarNomCli, T011J17_A1234BarNomCli[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarNomCli");
               GXutil.writeLogRaw("Old: ",Z1234BarNomCli);
               GXutil.writeLogRaw("Current: ",T011J17_A1234BarNomCli[0]);
            }
            if ( Z1235BarNumCli != T011J17_A1235BarNumCli[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarNumCli");
               GXutil.writeLogRaw("Old: ",Z1235BarNumCli);
               GXutil.writeLogRaw("Current: ",T011J17_A1235BarNumCli[0]);
            }
            if ( Z4844BarAudULin != T011J17_A4844BarAudULin[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"BarAudULin");
               GXutil.writeLogRaw("Old: ",Z4844BarAudULin);
               GXutil.writeLogRaw("Current: ",T011J17_A4844BarAudULin[0]);
            }
            if ( Z252CliCod != T011J17_A252CliCod[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T011J17_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11J412( )
   {
      beforeValidate11J412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11J412( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11J412( 0) ;
         checkOptimisticConcurrency11J412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11J412( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11J412( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011J18 */
                  pr_default.execute(14, new Object[] {A2809MetTerCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN111J412( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel11J412( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption11J0( ) ;
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
            load11J412( ) ;
         }
         endLevel11J412( ) ;
      }
      closeExtendedTableCursors11J412( ) ;
   }

   public void update11J412( )
   {
      beforeValidate11J412( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11J412( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11J412( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11J412( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate11J412( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCMETPI */
                  deferredUpdate11J412( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN111J412( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel11J412( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption11J0( ) ;
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
         endLevel11J412( ) ;
      }
      closeExtendedTableCursors11J412( ) ;
   }

   public void deferredUpdate11J412( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11J412( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11J412( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11J412( ) ;
         afterConfirm11J412( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11J412( ) ;
            if ( AnyError == 0 )
            {
               A8357MetPieSuTA = O8357MetPieSuTA ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
               A8359MetPieSuCo = O8359MetPieSuCo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
               A8358MetPieSuPN = O8358MetPieSuPN ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
               A8355MetPieSuCa = O8355MetPieSuCa ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
               A8356MetPieSuPB = O8356MetPieSuPB ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               scanStart11J413( ) ;
               while ( RcdFound413 != 0 )
               {
                  getByPrimaryKey11J413( ) ;
                  delete11J413( ) ;
                  scanNext11J413( ) ;
                  O8357MetPieSuTA = A8357MetPieSuTA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
                  O8359MetPieSuCo = A8359MetPieSuCo ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
                  O8358MetPieSuPN = A8358MetPieSuPN ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
                  O8355MetPieSuCa = A8355MetPieSuCa ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
                  O8356MetPieSuPB = A8356MetPieSuPB ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               }
               scanEnd11J413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011J19 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
                  if ( AnyError == 0 )
                  {
                     updateTablesN111J412( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound412 == 0 )
                        {
                           initAll11J412( ) ;
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
                        resetCaption11J0( ) ;
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
      endLevel11J412( ) ;
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11J412( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T011J20 */
         pr_default.execute(16, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel11J413( )
   {
      s8357MetPieSuTA = O8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      s8359MetPieSuCo = O8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      s8358MetPieSuPN = O8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      s8355MetPieSuCa = O8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      s8356MetPieSuPB = O8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      nGXsfl_125_idx = 0 ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         readRow11J413( ) ;
         if ( ( nRcdExists_413 != 0 ) || ( nIsMod_413 != 0 ) )
         {
            standaloneNotModal11J413( ) ;
            getKey11J413( ) ;
            if ( ( nRcdExists_413 == 0 ) && ( nRcdDeleted_413 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert11J413( ) ;
            }
            else
            {
               if ( RcdFound413 != 0 )
               {
                  if ( ( nRcdDeleted_413 != 0 ) && ( nRcdExists_413 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete11J413( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_413 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update11J413( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_413 == 0 )
                  {
                     GXCCtl = "METPIECOD_" + sGXsfl_125_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMetPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O8357MetPieSuTA = A8357MetPieSuTA ;
            httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
            O8359MetPieSuCo = A8359MetPieSuCo ;
            httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
            O8358MetPieSuPN = A8358MetPieSuPN ;
            httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
            O8355MetPieSuCa = A8355MetPieSuCa ;
            httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
            O8356MetPieSuPB = A8356MetPieSuPB ;
            httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_413_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod)) ;
         httpContext.changePostValue( edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc)) ;
         httpContext.changePostValue( edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieFch_Internalname, localUtil.format(A5136MetPieFch, "99/99/99")) ;
         httpContext.changePostValue( edtMetPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_125_idx, GXutil.rtrim( Z2813MetPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_125_idx, localUtil.dtoc( Z5136MetPieFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_125_idx, GXutil.rtrim( Z2846MetPieDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4910MetPieMtD_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6635MetPieAnc_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2815MetPieMet_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2814MetPieKil_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_413_"+sGXsfl_125_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_413 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_413_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIECOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEKIL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMET_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEEST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEDEF_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEANC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "METPIEMTD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll11J413( ) ;
      if ( AnyError != 0 )
      {
         O8357MetPieSuTA = s8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         O8359MetPieSuCo = s8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         O8358MetPieSuPN = s8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         O8355MetPieSuCa = s8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         O8356MetPieSuPB = s8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      }
      nRcdExists_413 = (short)(0) ;
      nIsMod_413 = (short)(0) ;
      nRcdDeleted_413 = (short)(0) ;
   }

   public void processLevel11J412( )
   {
      /* Save parent mode. */
      sMode412 = Gx_mode ;
      processNestedLevel11J413( ) ;
      if ( AnyError != 0 )
      {
         O8357MetPieSuTA = s8357MetPieSuTA ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         O8359MetPieSuCo = s8359MetPieSuCo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         O8358MetPieSuPN = s8358MetPieSuPN ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         O8355MetPieSuCa = s8355MetPieSuCa ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         O8356MetPieSuPB = s8356MetPieSuPB ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode412 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN111J412( )
   {
      /* Using cursor T011J21 */
      pr_default.execute(17, new Object[] {A2496BarFecFin, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
   }

   public void endLevel11J412( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      pr_default.close(13);
      if ( AnyError == 0 )
      {
         beforeComplete11J412( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpckhrb");
         if ( AnyError == 0 )
         {
            confirmValues11J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpckhrb");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart11J412( )
   {
      /* Scan By routine */
      /* Using cursor T011J22 */
      pr_default.execute(18, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11J412( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound412 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound412 = (short)(1) ;
      }
   }

   public void scanEnd11J412( )
   {
      pr_default.close(18);
   }

   public void afterConfirm11J412( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert11J412( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11J412( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11J412( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11J412( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11J412( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11J412( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCliDes_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtBarFecFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFin_Enabled), 5, 0), true);
      edtBarAudULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudULin_Enabled), 5, 0), true);
      edtMetPieSuCa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieSuCa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieSuCa_Enabled), 5, 0), true);
      edtMetPieSuPB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieSuPB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieSuPB_Enabled), 5, 0), true);
      edtMetPieSuTA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieSuTA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieSuTA_Enabled), 5, 0), true);
      edtMetPieSuPN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieSuPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieSuPN_Enabled), 5, 0), true);
      edtMetPieSuCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieSuCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieSuCo_Enabled), 5, 0), true);
   }

   public void zm11J413( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2815MetPieMet = T011J3_A2815MetPieMet[0] ;
            Z2816MetPieEst = T011J3_A2816MetPieEst[0] ;
            Z5136MetPieFch = T011J3_A5136MetPieFch[0] ;
            Z4909MetPieDef = T011J3_A4909MetPieDef[0] ;
            Z2846MetPieDsc = T011J3_A2846MetPieDsc[0] ;
            Z2814MetPieKil = T011J3_A2814MetPieKil[0] ;
            Z6635MetPieAnc = T011J3_A6635MetPieAnc[0] ;
            Z4910MetPieMtD = T011J3_A4910MetPieMtD[0] ;
         }
         else
         {
            Z2815MetPieMet = A2815MetPieMet ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z5136MetPieFch = A5136MetPieFch ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z2814MetPieKil = A2814MetPieKil ;
            Z6635MetPieAnc = A6635MetPieAnc ;
            Z4910MetPieMtD = A4910MetPieMtD ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z5136MetPieFch = A5136MetPieFch ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z6635MetPieAnc = A6635MetPieAnc ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal11J413( )
   {
   }

   public void standaloneModal11J413( )
   {
      A2846MetPieDsc = "" ;
      if ( true /* Level */ && isIns( )  )
      {
         A5136MetPieFch = Gx_date ;
      }
      if ( isIns( )  && (0==A2816MetPieEst) && ( Gx_BScreen == 0 ) )
      {
         A2816MetPieEst = (byte)(0) ;
      }
      if ( isIns( )  && (0==A4909MetPieDef) && ( Gx_BScreen == 0 ) )
      {
         A4909MetPieDef = (short)(0) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMetPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
      else
      {
         edtMetPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      }
   }

   public void load11J413( )
   {
      /* Using cursor T011J23 */
      pr_default.execute(19, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2815MetPieMet = T011J23_A2815MetPieMet[0] ;
         A2816MetPieEst = T011J23_A2816MetPieEst[0] ;
         A5136MetPieFch = T011J23_A5136MetPieFch[0] ;
         A4909MetPieDef = T011J23_A4909MetPieDef[0] ;
         A2846MetPieDsc = T011J23_A2846MetPieDsc[0] ;
         A2814MetPieKil = T011J23_A2814MetPieKil[0] ;
         A6635MetPieAnc = T011J23_A6635MetPieAnc[0] ;
         A4910MetPieMtD = T011J23_A4910MetPieMtD[0] ;
         zm11J413( -21) ;
      }
      pr_default.close(19);
      onLoadActions11J413( ) ;
   }

   public void onLoadActions11J413( )
   {
      if ( isIns( )  )
      {
         A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8356MetPieSuPB = O8356MetPieSuPB.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A8355MetPieSuCa = (short)(O8355MetPieSuCa+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8355MetPieSuCa = O8355MetPieSuCa ;
            httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8355MetPieSuCa = (short)(O8355MetPieSuCa-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc-O6635MetPieAnc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8359MetPieSuCo = (int)(O8359MetPieSuCo-O6635MetPieAnc) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD).subtract(O4910MetPieMtD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8357MetPieSuTA = O8357MetPieSuTA.subtract(O4910MetPieMtD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
            }
         }
      }
      if ( true /* Level */ && true /* After */ )
      {
         A2815MetPieMet = A2814MetPieKil.subtract(A4910MetPieMtD) ;
      }
      if ( isIns( )  )
      {
         A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A8358MetPieSuPN = O8358MetPieSuPN.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
            }
         }
      }
   }

   public void checkExtendedTable11J413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal11J413( ) ;
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2813MetPieCod)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = "1" ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_char7[0] = A2813MetPieCod ;
         new app.pultcaj(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char7) ;
         tpckhrb_impl.this.A396EmprCod = GXv_char4[0] ;
         tpckhrb_impl.this.A129BarCod = GXv_int5[0] ;
         tpckhrb_impl.this.A132BarCodReo = GXv_int6[0] ;
         tpckhrb_impl.this.A130BarCodPar = GXv_char2[0] ;
         tpckhrb_impl.this.A2813MetPieCod = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A8356MetPieSuPB = O8356MetPieSuPB.subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A8355MetPieSuCa = (short)(O8355MetPieSuCa+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A8355MetPieSuCa = O8355MetPieSuCa ;
            httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A8355MetPieSuCa = (short)(O8355MetPieSuCa-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc-O6635MetPieAnc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A8359MetPieSuCo = (int)(O8359MetPieSuCo-O6635MetPieAnc) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD).subtract(O4910MetPieMtD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A8357MetPieSuTA = O8357MetPieSuTA.subtract(O4910MetPieMtD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
            }
         }
      }
      if ( true /* Level */ && true /* After */ )
      {
         nIsDirty_413 = (short)(1) ;
         A2815MetPieMet = A2814MetPieKil.subtract(A4910MetPieMtD) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_413 = (short)(1) ;
         A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_413 = (short)(1) ;
            A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_413 = (short)(1) ;
               A8358MetPieSuPN = O8358MetPieSuPN.subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors11J413( )
   {
   }

   public void enableDisable11J413( )
   {
   }

   public void getKey11J413( )
   {
      /* Using cursor T011J24 */
      pr_default.execute(20, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey11J413( )
   {
      /* Using cursor T011J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T011J3_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T011J3_A129BarCod[0] == A129BarCod ) && ( T011J3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T011J3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T011J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm11J413( 21) ;
         RcdFound413 = (short)(1) ;
         initializeNonKey11J413( ) ;
         A2813MetPieCod = T011J3_A2813MetPieCod[0] ;
         A2815MetPieMet = T011J3_A2815MetPieMet[0] ;
         A2816MetPieEst = T011J3_A2816MetPieEst[0] ;
         A5136MetPieFch = T011J3_A5136MetPieFch[0] ;
         A4909MetPieDef = T011J3_A4909MetPieDef[0] ;
         A2846MetPieDsc = T011J3_A2846MetPieDsc[0] ;
         A2814MetPieKil = T011J3_A2814MetPieKil[0] ;
         A6635MetPieAnc = T011J3_A6635MetPieAnc[0] ;
         A4910MetPieMtD = T011J3_A4910MetPieMtD[0] ;
         O4910MetPieMtD = A4910MetPieMtD ;
         O6635MetPieAnc = A6635MetPieAnc ;
         O2815MetPieMet = A2815MetPieMet ;
         O2814MetPieKil = A2814MetPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2813MetPieCod = A2813MetPieCod ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11J413( ) ;
         load11J413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey11J413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal11J413( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes11J413( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency11J413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T011J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2815MetPieMet, T011J2_A2815MetPieMet[0]) != 0 ) || ( Z2816MetPieEst != T011J2_A2816MetPieEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T011J2_A5136MetPieFch[0])) ) || ( Z4909MetPieDef != T011J2_A4909MetPieDef[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T011J2_A2846MetPieDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2814MetPieKil, T011J2_A2814MetPieKil[0]) != 0 ) || ( Z6635MetPieAnc != T011J2_A6635MetPieAnc[0] ) || ( DecimalUtil.compareTo(Z4910MetPieMtD, T011J2_A4910MetPieMtD[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T011J2_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T011J2_A2815MetPieMet[0]);
            }
            if ( Z2816MetPieEst != T011J2_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T011J2_A2816MetPieEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5136MetPieFch), GXutil.resetTime(T011J2_A5136MetPieFch[0])) ) )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieFch");
               GXutil.writeLogRaw("Old: ",Z5136MetPieFch);
               GXutil.writeLogRaw("Current: ",T011J2_A5136MetPieFch[0]);
            }
            if ( Z4909MetPieDef != T011J2_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T011J2_A4909MetPieDef[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T011J2_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T011J2_A2846MetPieDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T011J2_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T011J2_A2814MetPieKil[0]);
            }
            if ( Z6635MetPieAnc != T011J2_A6635MetPieAnc[0] )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieAnc");
               GXutil.writeLogRaw("Old: ",Z6635MetPieAnc);
               GXutil.writeLogRaw("Current: ",T011J2_A6635MetPieAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T011J2_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("tpckhrb:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T011J2_A4910MetPieMtD[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert11J413( )
   {
      beforeValidate11J413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11J413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm11J413( 0) ;
         checkOptimisticConcurrency11J413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm11J413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert11J413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011J25 */
                  pr_default.execute(21, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, A2814MetPieKil, Short.valueOf(A6635MetPieAnc), A4910MetPieMtD, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
            load11J413( ) ;
         }
         endLevel11J413( ) ;
      }
      closeExtendedTableCursors11J413( ) ;
   }

   public void update11J413( )
   {
      beforeValidate11J413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable11J413( ) ;
      }
      if ( ( nIsMod_413 != 0 ) || ( nIsDirty_413 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency11J413( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm11J413( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate11J413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011J26 */
                     pr_default.execute(22, new Object[] {A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A5136MetPieFch, Short.valueOf(A4909MetPieDef), A2846MetPieDsc, A2814MetPieKil, Short.valueOf(A6635MetPieAnc), A4910MetPieMtD, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate11J413( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey11J413( ) ;
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
            endLevel11J413( ) ;
         }
      }
      closeExtendedTableCursors11J413( ) ;
   }

   public void deferredUpdate11J413( )
   {
   }

   public void delete11J413( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate11J413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency11J413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls11J413( ) ;
         afterConfirm11J413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete11J413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011J27 */
               pr_default.execute(23, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
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
      endLevel11J413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls11J413( )
   {
      standaloneModal11J413( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8356MetPieSuPB = O8356MetPieSuPB.add(A2814MetPieKil).subtract(O2814MetPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8356MetPieSuPB = O8356MetPieSuPB.subtract(O2814MetPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A8355MetPieSuCa = (short)(O8355MetPieSuCa+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8355MetPieSuCa = O8355MetPieSuCa ;
               httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8355MetPieSuCa = (short)(O8355MetPieSuCa-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8358MetPieSuPN = O8358MetPieSuPN.add(A2815MetPieMet).subtract(O2815MetPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8358MetPieSuPN = O8358MetPieSuPN.subtract(O2815MetPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8359MetPieSuCo = (int)(O8359MetPieSuCo+A6635MetPieAnc-O6635MetPieAnc) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8359MetPieSuCo = (int)(O8359MetPieSuCo-O6635MetPieAnc) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A8357MetPieSuTA = O8357MetPieSuTA.add(A4910MetPieMtD).subtract(O4910MetPieMtD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A8357MetPieSuTA = O8357MetPieSuTA.subtract(O4910MetPieMtD) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T011J28 */
         pr_default.execute(24, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void endLevel11J413( )
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

   public void scanStart11J413( )
   {
      /* Scan By routine */
      /* Using cursor T011J29 */
      pr_default.execute(25, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T011J29_A2813MetPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext11J413( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A2813MetPieCod = T011J29_A2813MetPieCod[0] ;
      }
   }

   public void scanEnd11J413( )
   {
      pr_default.close(25);
   }

   public void afterConfirm11J413( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         A4909MetPieDef = A6635MetPieAnc ;
      }
   }

   public void beforeInsert11J413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate11J413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete11J413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete11J413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate11J413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes11J413( )
   {
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieFch_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Enabled), 5, 0), !bGXsfl_125_Refreshing);
      edtMetPieMtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void send_integrity_lvl_hashes11J413( )
   {
   }

   public void send_integrity_lvl_hashes11J412( )
   {
   }

   public void subsflControlProps_125413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_125_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_125_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_125_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_125_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_125_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_125_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_125_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_125_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_125_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_125_idx ;
   }

   public void subsflControlProps_fel_125413( )
   {
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413_"+sGXsfl_125_fel_idx ;
      edtMetPieCod_Internalname = "METPIECOD_"+sGXsfl_125_fel_idx ;
      edtMetPieKil_Internalname = "METPIEKIL_"+sGXsfl_125_fel_idx ;
      edtMetPieMet_Internalname = "METPIEMET_"+sGXsfl_125_fel_idx ;
      edtMetPieEst_Internalname = "METPIEEST_"+sGXsfl_125_fel_idx ;
      edtMetPieDsc_Internalname = "METPIEDSC_"+sGXsfl_125_fel_idx ;
      edtMetPieDef_Internalname = "METPIEDEF_"+sGXsfl_125_fel_idx ;
      edtMetPieFch_Internalname = "METPIEFCH_"+sGXsfl_125_fel_idx ;
      edtMetPieAnc_Internalname = "METPIEANC_"+sGXsfl_125_fel_idx ;
      edtMetPieMtD_Internalname = "METPIEMTD_"+sGXsfl_125_fel_idx ;
   }

   public void addRow11J413( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_125413( ) ;
      sendRow11J413( ) ;
   }

   public void sendRow11J413( )
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
         if ( ((int)((nGXsfl_125_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_413_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_413_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_413), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_413_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_413_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDsc_Internalname,GXutil.rtrim( A2846MetPieDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDef_Internalname,GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieDef_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieFch_Internalname,localUtil.format(A5136MetPieFch, "99/99/99"),localUtil.format( A5136MetPieFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_413_" + sGXsfl_125_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_125_idx + "',125)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetPieMtD_Enabled!=0) ? localUtil.format( A4910MetPieMtD, "ZZZZ9.99") : localUtil.format( A4910MetPieMtD, "ZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMetPieMtD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(125),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes11J413( ) ;
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2813MetPieCod));
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z5136MetPieFch, 0, "/"));
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2846MetPieDsc));
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4910MetPieMtD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6635MetPieAnc_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2815MetPieMet_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2814MetPieKil_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_413_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_413_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_413, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLICOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCLINOM_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV35CliNom));
      GXCCtl = "vBARMAT_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV37BarMat));
      GXCCtl = "vBARNMTR_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV38BarNmtr));
      GXCCtl = "vBARCOLNOM_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV39BarColNom));
      GXCCtl = "vBARCOLNUM_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV40BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPARTCOD_" + sGXsfl_125_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV41PartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_413_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_413_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIECOD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEKIL_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMET_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEEST_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDSC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEDEF_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEFCH_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEANC_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METPIEMTD_"+sGXsfl_125_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow11J413( )
   {
      nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_125413( ) ;
      edtavnRcdDeleted_413_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_413_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIECOD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEKIL_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMET_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEEST_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDSC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieDef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEDEF_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEFCH_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEANC_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetPieMtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "METPIEMTD_"+sGXsfl_125_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "METPIEKIL_" + sGXsfl_125_idx ;
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
         GXCCtl = "METPIEMET_" + sGXsfl_125_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "METPIEEST_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieEst_Internalname ;
         wbErr = true ;
         A2816MetPieEst = (byte)(0) ;
      }
      else
      {
         A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2846MetPieDsc = httpContext.cgiGet( edtMetPieDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEDEF_" + sGXsfl_125_idx ;
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
      if ( localUtil.vcdate( httpContext.cgiGet( edtMetPieFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "METPIEFCH_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieFch_Internalname ;
         wbErr = true ;
         A5136MetPieFch = GXutil.nullDate() ;
      }
      else
      {
         A5136MetPieFch = localUtil.ctod( httpContext.cgiGet( edtMetPieFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "METPIEANC_" + sGXsfl_125_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
      {
         GXCCtl = "METPIEMTD_" + sGXsfl_125_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMtD_Internalname ;
         wbErr = true ;
         A4910MetPieMtD = DecimalUtil.ZERO ;
      }
      else
      {
         A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
      }
      GXCCtl = "Z2813MetPieCod_" + sGXsfl_125_idx ;
      Z2813MetPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2815MetPieMet_" + sGXsfl_125_idx ;
      Z2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2816MetPieEst_" + sGXsfl_125_idx ;
      Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5136MetPieFch_" + sGXsfl_125_idx ;
      Z5136MetPieFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4909MetPieDef_" + sGXsfl_125_idx ;
      Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2846MetPieDsc_" + sGXsfl_125_idx ;
      Z2846MetPieDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2814MetPieKil_" + sGXsfl_125_idx ;
      Z2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6635MetPieAnc_" + sGXsfl_125_idx ;
      Z6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4910MetPieMtD_" + sGXsfl_125_idx ;
      Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4910MetPieMtD_" + sGXsfl_125_idx ;
      O4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6635MetPieAnc_" + sGXsfl_125_idx ;
      O6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2815MetPieMet_" + sGXsfl_125_idx ;
      O2815MetPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2814MetPieKil_" + sGXsfl_125_idx ;
      O2814MetPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_413_" + sGXsfl_125_idx ;
      nRcdDeleted_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_413_" + sGXsfl_125_idx ;
      nRcdExists_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_413_" + sGXsfl_125_idx ;
      nIsMod_413 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMetPieCod_Enabled = edtMetPieCod_Enabled ;
   }

   public void confirmValues11J0( )
   {
      nGXsfl_125_idx = 0 ;
      sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_125413( ) ;
      while ( nGXsfl_125_idx < nRC_GXsfl_125 )
      {
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_125413( ) ;
         httpContext.changePostValue( "Z2813MetPieCod_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z2813MetPieCod_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2813MetPieCod_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z2815MetPieMet_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z2815MetPieMet_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2815MetPieMet_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z2816MetPieEst_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z2816MetPieEst_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2816MetPieEst_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z5136MetPieFch_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z5136MetPieFch_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5136MetPieFch_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z4909MetPieDef_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z4909MetPieDef_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4909MetPieDef_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z2846MetPieDsc_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2846MetPieDsc_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z2814MetPieKil_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z2814MetPieKil_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2814MetPieKil_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z6635MetPieAnc_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6635MetPieAnc_"+sGXsfl_125_idx) ;
         httpContext.changePostValue( "Z4910MetPieMtD_"+sGXsfl_125_idx, httpContext.cgiGet( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_125_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4910MetPieMtD_"+sGXsfl_125_idx) ;
      }
      httpContext.changePostValue( "O4910MetPieMtD", httpContext.cgiGet( "T4910MetPieMtD")) ;
      httpContext.deletePostValue( "T4910MetPieMtD") ;
      httpContext.changePostValue( "O6635MetPieAnc", httpContext.cgiGet( "T6635MetPieAnc")) ;
      httpContext.deletePostValue( "T6635MetPieAnc") ;
      httpContext.changePostValue( "O2815MetPieMet", httpContext.cgiGet( "T2815MetPieMet")) ;
      httpContext.deletePostValue( "T2815MetPieMet") ;
      httpContext.changePostValue( "O2814MetPieKil", httpContext.cgiGet( "T2814MetPieKil")) ;
      httpContext.deletePostValue( "T2814MetPieKil") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpckhrb", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35CliNom)),GXutil.URLEncode(GXutil.rtrim(AV37BarMat)),GXutil.URLEncode(GXutil.rtrim(AV38BarNmtr)),GXutil.URLEncode(GXutil.rtrim(AV39BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41PartCod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarMat","BarNmtr","BarColNom","BarColNum","PartCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2496BarFecFin", localUtil.dtoc( Z2496BarFecFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2311BarCliDes", GXutil.ltrim( localUtil.ntoc( Z2311BarCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4844BarAudULin", GXutil.ltrim( localUtil.ntoc( Z4844BarAudULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8357MetPieSuTA", GXutil.ltrim( localUtil.ntoc( O8357MetPieSuTA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8359MetPieSuCo", GXutil.ltrim( localUtil.ntoc( O8359MetPieSuCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8358MetPieSuPN", GXutil.ltrim( localUtil.ntoc( O8358MetPieSuPN, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8355MetPieSuCa", GXutil.ltrim( localUtil.ntoc( O8355MetPieSuCa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O8356MetPieSuPB", GXutil.ltrim( localUtil.ntoc( O8356MetPieSuPB, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_125", GXutil.ltrim( localUtil.ntoc( nGXsfl_125_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV35CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAT", GXutil.rtrim( AV37BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNMTR", GXutil.rtrim( AV38BarNmtr));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM", GXutil.rtrim( AV39BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV40BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARTCOD", GXutil.rtrim( AV41PartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV52Pgmname));
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
      return formatLink("app.tpckhrb", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV35CliNom)),GXutil.URLEncode(GXutil.rtrim(AV37BarMat)),GXutil.URLEncode(GXutil.rtrim(AV38BarNmtr)),GXutil.URLEncode(GXutil.rtrim(AV39BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41PartCod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","BarMat","BarNmtr","BarColNom","BarColNum","PartCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPCKHRB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PACKING HOJA RUTA", "") ;
   }

   public void initializeNonKey11J412( )
   {
      O8357MetPieSuTA = A8357MetPieSuTA ;
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
      O8359MetPieSuCo = A8359MetPieSuCo ;
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      O8358MetPieSuPN = A8358MetPieSuPN ;
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
      O8355MetPieSuCa = A8355MetPieSuCa ;
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
      O8356MetPieSuPB = A8356MetPieSuPB ;
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
      Z2496BarFecFin = GXutil.nullDate() ;
      Z2311BarCliDes = 0 ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z1234BarNomCli = "" ;
      Z1235BarNumCli = 0 ;
      Z4844BarAudULin = (short)(0) ;
      Z252CliCod = 0 ;
   }

   public void initAll11J412( )
   {
      initializeNonKey11J412( ) ;
   }

   public void standaloneModalInsert( )
   {
      A2496BarFecFin = i2496BarFecFin ;
      httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
   }

   public void initializeNonKey11J413( )
   {
      A2815MetPieMet = DecimalUtil.ZERO ;
      A5136MetPieFch = GXutil.nullDate() ;
      A2846MetPieDsc = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A6635MetPieAnc = (short)(0) ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A2816MetPieEst = (byte)(0) ;
      A4909MetPieDef = (short)(0) ;
      O4910MetPieMtD = A4910MetPieMtD ;
      O6635MetPieAnc = A6635MetPieAnc ;
      O2815MetPieMet = A2815MetPieMet ;
      O2814MetPieKil = A2814MetPieKil ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z2816MetPieEst = (byte)(0) ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z4909MetPieDef = (short)(0) ;
      Z2846MetPieDsc = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z6635MetPieAnc = (short)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
   }

   public void initAll11J413( )
   {
      A2813MetPieCod = "" ;
      initializeNonKey11J413( ) ;
   }

   public void standaloneModalInsert11J413( )
   {
      A2846MetPieDsc = i2846MetPieDsc ;
      A5136MetPieFch = i5136MetPieFch ;
      A2816MetPieEst = i2816MetPieEst ;
      A4909MetPieDef = i4909MetPieDef ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154415", true, true);
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
      httpContext.AddJavascriptSource("tpckhrb.js", "?2026824154416", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties413( )
   {
      edtMetPieCod_Enabled = defedtMetPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), !bGXsfl_125_Refreshing);
   }

   public void startgridcontrol125( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2846MetPieDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieDef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A5136MetPieFch, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarCliDes_Internalname = "BARCLIDES" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarFecFin_Internalname = "BARFECFIN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarAudULin_Internalname = "BARAUDULIN" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtMetPieSuCa_Internalname = "METPIESUCA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtMetPieSuPB_Internalname = "METPIESUPB" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtMetPieSuTA_Internalname = "METPIESUTA" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtMetPieSuPN_Internalname = "METPIESUPN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtMetPieSuCo_Internalname = "METPIESUCO" ;
      edtavnRcdDeleted_413_Internalname = "vNRCDDELETED_413" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      edtMetPieDsc_Internalname = "METPIEDSC" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      edtMetPieFch_Internalname = "METPIEFCH" ;
      edtMetPieAnc_Internalname = "METPIEANC" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
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
      Form.setCaption( httpContext.getMessage( "PACKING HOJA RUTA", "") );
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtMetPieFch_Jsonclick = "" ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieDsc_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
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
      edtMetPieMtD_Enabled = 1 ;
      edtMetPieAnc_Enabled = 1 ;
      edtMetPieFch_Enabled = 1 ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieDsc_Enabled = 1 ;
      edtMetPieEst_Enabled = 1 ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Enabled = 1 ;
      edtMetPieCod_Enabled = 1 ;
      edtavnRcdDeleted_413_Enabled = 1 ;
      edtMetPieSuCo_Jsonclick = "" ;
      edtMetPieSuCo_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieSuCo_Enabled = 0 ;
      edtMetPieSuPN_Jsonclick = "" ;
      edtMetPieSuPN_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieSuPN_Enabled = 0 ;
      edtMetPieSuTA_Jsonclick = "" ;
      edtMetPieSuTA_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieSuTA_Enabled = 0 ;
      edtMetPieSuPB_Jsonclick = "" ;
      edtMetPieSuPB_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieSuPB_Enabled = 0 ;
      edtMetPieSuCa_Jsonclick = "" ;
      edtMetPieSuCa_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieSuCa_Enabled = 0 ;
      edtBarAudULin_Jsonclick = "" ;
      edtBarAudULin_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudULin_Enabled = 0 ;
      edtBarFecFin_Jsonclick = "" ;
      edtBarFecFin_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecFin_Enabled = 0 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumCli_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtBarCliDes_Jsonclick = "" ;
      edtBarCliDes_Backcolor = (int)(0xFFFFFF) ;
      edtBarCliDes_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void xc_15_11J413( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A2813MetPieCod )
   {
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2813MetPieCod)==0) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = "1" ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A2813MetPieCod ;
         new app.pultcaj(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char7[0] ;
         A129BarCod = GXv_int5[0] ;
         A132BarCodReo = GXv_int6[0] ;
         A130BarCodPar = GXv_char3[0] ;
         A2813MetPieCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2813MetPieCod))+"\"") ;
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
      subsflControlProps_125413( ) ;
      while ( nGXsfl_125_idx <= nRC_GXsfl_125 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal11J413( ) ;
         standaloneModal11J413( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow11J413( ) ;
         nGXsfl_125_idx = (int)(nGXsfl_125_idx+1) ;
         sGXsfl_125_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_125_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_125413( ) ;
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
      /* Using cursor T011J30 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T011J30_A407EmprNom[0] ;
      n407EmprNom = T011J30_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T011J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A2496BarFecFin = T011J8_A2496BarFecFin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
      A2311BarCliDes = T011J8_A2311BarCliDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2311BarCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2311BarCliDes), 6, 0));
      A212BarSer = T011J8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T011J8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T011J8_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A1234BarNomCli = T011J8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T011J8_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A4844BarAudULin = T011J8_A4844BarAudULin[0] ;
      n4844BarAudULin = T011J8_n4844BarAudULin[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
      A252CliCod = T011J8_A252CliCod[0] ;
      n252CliCod = T011J8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(6);
      /* Using cursor T011J31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T011J31_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(27);
      /* Using cursor T011J33 */
      pr_default.execute(28, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A8355MetPieSuCa = T011J33_A8355MetPieSuCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = T011J33_A8356MetPieSuPB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         A8357MetPieSuTA = T011J33_A8357MetPieSuTA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8358MetPieSuPN = T011J33_A8358MetPieSuPN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8359MetPieSuCo = T011J33_A8359MetPieSuCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      else
      {
         A8355MetPieSuCa = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8355MetPieSuCa), 4, 0));
         A8356MetPieSuPB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrimstr( A8356MetPieSuPB, 10, 2));
         A8357MetPieSuTA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrimstr( A8357MetPieSuTA, 10, 2));
         A8358MetPieSuPN = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrimstr( A8358MetPieSuPN, 10, 2));
         A8359MetPieSuCo = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8359MetPieSuCo), 6, 0));
      }
      pr_default.close(28);
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

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2496BarFecFin", localUtil.format(A2496BarFecFin, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2311BarCliDes", GXutil.ltrim( localUtil.ntoc( A2311BarCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrim( localUtil.ntoc( A4844BarAudULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8355MetPieSuCa", GXutil.ltrim( localUtil.ntoc( A8355MetPieSuCa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8356MetPieSuPB", GXutil.ltrim( localUtil.ntoc( A8356MetPieSuPB, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8357MetPieSuTA", GXutil.ltrim( localUtil.ntoc( A8357MetPieSuTA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8358MetPieSuPN", GXutil.ltrim( localUtil.ntoc( A8358MetPieSuPN, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8359MetPieSuCo", GXutil.ltrim( localUtil.ntoc( A8359MetPieSuCo, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2496BarFecFin", localUtil.format(Z2496BarFecFin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2311BarCliDes", GXutil.ltrim( localUtil.ntoc( Z2311BarCliDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4844BarAudULin", GXutil.ltrim( localUtil.ntoc( Z4844BarAudULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8355MetPieSuCa", GXutil.ltrim( localUtil.ntoc( Z8355MetPieSuCa, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8356MetPieSuPB", GXutil.ltrim( localUtil.ntoc( Z8356MetPieSuPB, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8357MetPieSuTA", GXutil.ltrim( localUtil.ntoc( Z8357MetPieSuTA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8358MetPieSuPN", GXutil.ltrim( localUtil.ntoc( Z8358MetPieSuPN, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8359MetPieSuCo", GXutil.ltrim( localUtil.ntoc( Z8359MetPieSuCo, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8357MetPieSuTA", GXutil.ltrim( localUtil.ntoc( O8357MetPieSuTA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8359MetPieSuCo", GXutil.ltrim( localUtil.ntoc( O8359MetPieSuCo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8358MetPieSuPN", GXutil.ltrim( localUtil.ntoc( O8358MetPieSuPN, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8355MetPieSuCa", GXutil.ltrim( localUtil.ntoc( O8355MetPieSuCa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O8356MetPieSuPB", GXutil.ltrim( localUtil.ntoc( O8356MetPieSuPB, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Metpiecod( )
   {
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2813MetPieCod)==0) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char4[0] = "1" ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = A2813MetPieCod ;
         new app.pultcaj(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2) ;
         tpckhrb_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpckhrb_impl.this.A129BarCod = GXv_int5[0] ;
         A129BarCod = this.A129BarCod ;
         tpckhrb_impl.this.A132BarCodReo = GXv_int6[0] ;
         A132BarCodReo = this.A132BarCodReo ;
         tpckhrb_impl.this.A130BarCodPar = GXv_char3[0] ;
         A130BarCodPar = this.A130BarCodPar ;
         tpckhrb_impl.this.A2813MetPieCod = GXv_char2[0] ;
         A2813MetPieCod = this.A2813MetPieCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", GXutil.rtrim( A2813MetPieCod));
   }

   public void valid_Metpiemtd( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         A2815MetPieMet = A2814MetPieKil.subtract(A4910MetPieMtD) ;
      }
      O4910MetPieMtD = A4910MetPieMtD ;
      O8357MetPieSuTA = A8357MetPieSuTA ;
      O6635MetPieAnc = A6635MetPieAnc ;
      O8359MetPieSuCo = A8359MetPieSuCo ;
      O2815MetPieMet = A2815MetPieMet ;
      O8358MetPieSuPN = A8358MetPieSuPN ;
      O8355MetPieSuCa = A8355MetPieSuCa ;
      O2814MetPieKil = A2814MetPieKil ;
      O8356MetPieSuPB = A8356MetPieSuPB ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV35CliNom',fld:'vCLINOM',pic:''},{av:'AV37BarMat',fld:'vBARMAT',pic:''},{av:'AV38BarNmtr',fld:'vBARNMTR',pic:''},{av:'AV39BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV40BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV41PartCod',fld:'vPARTCOD',pic:''}]");
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
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'A2496BarFecFin',fld:'BARFECFIN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2496BarFecFin',fld:'BARFECFIN',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2311BarCliDes',fld:'BARCLIDES',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A4844BarAudULin',fld:'BARAUDULIN',pic:'ZZZ9'},{av:'A8355MetPieSuCa',fld:'METPIESUCA',pic:'ZZZ9'},{av:'A8356MetPieSuPB',fld:'METPIESUPB',pic:'ZZZZZZ9.99'},{av:'A8357MetPieSuTA',fld:'METPIESUTA',pic:'ZZZZZZ9.99'},{av:'A8358MetPieSuPN',fld:'METPIESUPN',pic:'ZZZZZZ9.99'},{av:'A8359MetPieSuCo',fld:'METPIESUCO',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2496BarFecFin'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z2311BarCliDes'},{av:'Z212BarSer'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z1234BarNomCli'},{av:'Z1235BarNumCli'},{av:'Z4844BarAudULin'},{av:'Z8355MetPieSuCa'},{av:'Z8356MetPieSuPB'},{av:'Z8357MetPieSuTA'},{av:'Z8358MetPieSuPN'},{av:'Z8359MetPieSuCo'},{av:'O8357MetPieSuTA'},{av:'O8359MetPieSuCo'},{av:'O8358MetPieSuPN'},{av:'O8355MetPieSuCa'},{av:'O8356MetPieSuPB'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARFECFIN","{handler:'valid_Barfecfin',iparms:[]");
      setEventMetadata("VALID_BARFECFIN",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("VALID_METPIECOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]}");
      setEventMetadata("VALID_METPIEKIL","{handler:'valid_Metpiekil',iparms:[]");
      setEventMetadata("VALID_METPIEKIL",",oparms:[]}");
      setEventMetadata("VALID_METPIEMET","{handler:'valid_Metpiemet',iparms:[]");
      setEventMetadata("VALID_METPIEMET",",oparms:[]}");
      setEventMetadata("VALID_METPIEANC","{handler:'valid_Metpieanc',iparms:[]");
      setEventMetadata("VALID_METPIEANC",",oparms:[]}");
      setEventMetadata("VALID_METPIEMTD","{handler:'valid_Metpiemtd',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A8356MetPieSuPB',fld:'METPIESUPB',pic:'ZZZZZZ9.99'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A8355MetPieSuCa',fld:'METPIESUCA',pic:'ZZZ9'},{av:'A8358MetPieSuPN',fld:'METPIESUPN',pic:'ZZZZZZ9.99'},{av:'A8359MetPieSuCo',fld:'METPIESUCO',pic:'ZZZZZ9'},{av:'A6635MetPieAnc',fld:'METPIEANC',pic:'ZZ9'},{av:'A8357MetPieSuTA',fld:'METPIESUTA',pic:'ZZZZZZ9.99'},{av:'O2815MetPieMet'},{av:'O8358MetPieSuPN'},{av:'O4910MetPieMtD'},{av:'O8357MetPieSuTA'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_METPIEMTD",",oparms:[{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]}");
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
      pr_default.close(6);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2809MetTerCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV35CliNom = "" ;
      wcpOAV37BarMat = "" ;
      wcpOAV38BarNmtr = "" ;
      wcpOAV39BarColNom = "" ;
      wcpOAV41PartCod = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z2496BarFecFin = GXutil.nullDate() ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      O8357MetPieSuTA = DecimalUtil.ZERO ;
      O8358MetPieSuPN = DecimalUtil.ZERO ;
      O8356MetPieSuPB = DecimalUtil.ZERO ;
      Z2813MetPieCod = "" ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z5136MetPieFch = GXutil.nullDate() ;
      Z2846MetPieDsc = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      O4910MetPieMtD = DecimalUtil.ZERO ;
      O2815MetPieMet = DecimalUtil.ZERO ;
      O2814MetPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV35CliNom = "" ;
      AV37BarMat = "" ;
      AV38BarNmtr = "" ;
      AV39BarColNom = "" ;
      AV41PartCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      Gx_date = GXutil.nullDate() ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock11_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A1234BarNomCli = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A2496BarFecFin = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A8356MetPieSuPB = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A8357MetPieSuTA = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A8358MetPieSuPN = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B8357MetPieSuTA = DecimalUtil.ZERO ;
      B8358MetPieSuPN = DecimalUtil.ZERO ;
      B8356MetPieSuPB = DecimalUtil.ZERO ;
      sMode413 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV52Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode412 = "" ;
      s8357MetPieSuTA = DecimalUtil.ZERO ;
      s8358MetPieSuPN = DecimalUtil.ZERO ;
      s8356MetPieSuPB = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2846MetPieDsc = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      T4910MetPieMtD = DecimalUtil.ZERO ;
      T2815MetPieMet = DecimalUtil.ZERO ;
      T2814MetPieKil = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z8356MetPieSuPB = DecimalUtil.ZERO ;
      Z8357MetPieSuTA = DecimalUtil.ZERO ;
      Z8358MetPieSuPN = DecimalUtil.ZERO ;
      edtMetPieCod_Inputmask = "" ;
      T011J6_A407EmprNom = new String[] {""} ;
      T011J6_n407EmprNom = new boolean[] {false} ;
      T011J8_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T011J8_A2311BarCliDes = new int[1] ;
      T011J8_A212BarSer = new String[] {""} ;
      T011J8_A135BarColNom = new String[] {""} ;
      T011J8_A136BarColNum = new int[1] ;
      T011J8_A1234BarNomCli = new String[] {""} ;
      T011J8_A1235BarNumCli = new int[1] ;
      T011J8_A4844BarAudULin = new short[1] ;
      T011J8_n4844BarAudULin = new boolean[] {false} ;
      T011J8_A252CliCod = new int[1] ;
      T011J8_n252CliCod = new boolean[] {false} ;
      T011J9_A279CliNom = new String[] {""} ;
      T011J11_A8355MetPieSuCa = new short[1] ;
      T011J11_A8356MetPieSuPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J11_A8357MetPieSuTA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J11_A8358MetPieSuPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J11_A8359MetPieSuCo = new int[1] ;
      T011J13_A2809MetTerCod = new String[] {""} ;
      T011J13_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T011J13_A407EmprNom = new String[] {""} ;
      T011J13_n407EmprNom = new boolean[] {false} ;
      T011J13_A279CliNom = new String[] {""} ;
      T011J13_A2311BarCliDes = new int[1] ;
      T011J13_A212BarSer = new String[] {""} ;
      T011J13_A135BarColNom = new String[] {""} ;
      T011J13_A136BarColNum = new int[1] ;
      T011J13_A1234BarNomCli = new String[] {""} ;
      T011J13_A1235BarNumCli = new int[1] ;
      T011J13_A4844BarAudULin = new short[1] ;
      T011J13_n4844BarAudULin = new boolean[] {false} ;
      T011J13_A396EmprCod = new String[] {""} ;
      T011J13_A129BarCod = new int[1] ;
      T011J13_A132BarCodReo = new byte[1] ;
      T011J13_A130BarCodPar = new String[] {""} ;
      T011J13_A252CliCod = new int[1] ;
      T011J13_n252CliCod = new boolean[] {false} ;
      T011J13_A8355MetPieSuCa = new short[1] ;
      T011J13_A8356MetPieSuPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J13_A8357MetPieSuTA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J13_A8358MetPieSuPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J13_A8359MetPieSuCo = new int[1] ;
      T011J14_A396EmprCod = new String[] {""} ;
      T011J14_A2809MetTerCod = new String[] {""} ;
      T011J14_A129BarCod = new int[1] ;
      T011J14_A132BarCodReo = new byte[1] ;
      T011J14_A130BarCodPar = new String[] {""} ;
      T011J5_A2809MetTerCod = new String[] {""} ;
      T011J5_A396EmprCod = new String[] {""} ;
      T011J5_A129BarCod = new int[1] ;
      T011J5_A132BarCodReo = new byte[1] ;
      T011J5_A130BarCodPar = new String[] {""} ;
      T011J15_A396EmprCod = new String[] {""} ;
      T011J15_A2809MetTerCod = new String[] {""} ;
      T011J15_A129BarCod = new int[1] ;
      T011J15_A132BarCodReo = new byte[1] ;
      T011J15_A130BarCodPar = new String[] {""} ;
      T011J16_A396EmprCod = new String[] {""} ;
      T011J16_A2809MetTerCod = new String[] {""} ;
      T011J16_A129BarCod = new int[1] ;
      T011J16_A132BarCodReo = new byte[1] ;
      T011J16_A130BarCodPar = new String[] {""} ;
      T011J4_A2809MetTerCod = new String[] {""} ;
      T011J4_A396EmprCod = new String[] {""} ;
      T011J4_A129BarCod = new int[1] ;
      T011J4_A132BarCodReo = new byte[1] ;
      T011J4_A130BarCodPar = new String[] {""} ;
      T011J17_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      T011J17_A2311BarCliDes = new int[1] ;
      T011J17_A212BarSer = new String[] {""} ;
      T011J17_A135BarColNom = new String[] {""} ;
      T011J17_A136BarColNum = new int[1] ;
      T011J17_A1234BarNomCli = new String[] {""} ;
      T011J17_A1235BarNumCli = new int[1] ;
      T011J17_A4844BarAudULin = new short[1] ;
      T011J17_n4844BarAudULin = new boolean[] {false} ;
      T011J17_A252CliCod = new int[1] ;
      T011J17_n252CliCod = new boolean[] {false} ;
      T011J20_A396EmprCod = new String[] {""} ;
      T011J20_A2809MetTerCod = new String[] {""} ;
      T011J20_A129BarCod = new int[1] ;
      T011J20_A132BarCodReo = new byte[1] ;
      T011J20_A130BarCodPar = new String[] {""} ;
      T011J20_A2813MetPieCod = new String[] {""} ;
      T011J20_A12995MetPieDfLi = new short[1] ;
      T011J22_A396EmprCod = new String[] {""} ;
      T011J22_A2809MetTerCod = new String[] {""} ;
      T011J22_A129BarCod = new int[1] ;
      T011J22_A132BarCodReo = new byte[1] ;
      T011J22_A130BarCodPar = new String[] {""} ;
      T011J23_A2809MetTerCod = new String[] {""} ;
      T011J23_A129BarCod = new int[1] ;
      T011J23_A132BarCodReo = new byte[1] ;
      T011J23_A130BarCodPar = new String[] {""} ;
      T011J23_A2813MetPieCod = new String[] {""} ;
      T011J23_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J23_A2816MetPieEst = new byte[1] ;
      T011J23_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011J23_A4909MetPieDef = new short[1] ;
      T011J23_A2846MetPieDsc = new String[] {""} ;
      T011J23_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J23_A6635MetPieAnc = new short[1] ;
      T011J23_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J23_A396EmprCod = new String[] {""} ;
      T011J24_A396EmprCod = new String[] {""} ;
      T011J24_A2809MetTerCod = new String[] {""} ;
      T011J24_A129BarCod = new int[1] ;
      T011J24_A132BarCodReo = new byte[1] ;
      T011J24_A130BarCodPar = new String[] {""} ;
      T011J24_A2813MetPieCod = new String[] {""} ;
      T011J3_A2809MetTerCod = new String[] {""} ;
      T011J3_A129BarCod = new int[1] ;
      T011J3_A132BarCodReo = new byte[1] ;
      T011J3_A130BarCodPar = new String[] {""} ;
      T011J3_A2813MetPieCod = new String[] {""} ;
      T011J3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J3_A2816MetPieEst = new byte[1] ;
      T011J3_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011J3_A4909MetPieDef = new short[1] ;
      T011J3_A2846MetPieDsc = new String[] {""} ;
      T011J3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J3_A6635MetPieAnc = new short[1] ;
      T011J3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J3_A396EmprCod = new String[] {""} ;
      T011J2_A2809MetTerCod = new String[] {""} ;
      T011J2_A129BarCod = new int[1] ;
      T011J2_A132BarCodReo = new byte[1] ;
      T011J2_A130BarCodPar = new String[] {""} ;
      T011J2_A2813MetPieCod = new String[] {""} ;
      T011J2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J2_A2816MetPieEst = new byte[1] ;
      T011J2_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      T011J2_A4909MetPieDef = new short[1] ;
      T011J2_A2846MetPieDsc = new String[] {""} ;
      T011J2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J2_A6635MetPieAnc = new short[1] ;
      T011J2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J2_A396EmprCod = new String[] {""} ;
      T011J28_A396EmprCod = new String[] {""} ;
      T011J28_A2809MetTerCod = new String[] {""} ;
      T011J28_A129BarCod = new int[1] ;
      T011J28_A132BarCodReo = new byte[1] ;
      T011J28_A130BarCodPar = new String[] {""} ;
      T011J28_A2813MetPieCod = new String[] {""} ;
      T011J28_A12995MetPieDfLi = new short[1] ;
      T011J29_A396EmprCod = new String[] {""} ;
      T011J29_A2809MetTerCod = new String[] {""} ;
      T011J29_A129BarCod = new int[1] ;
      T011J29_A132BarCodReo = new byte[1] ;
      T011J29_A130BarCodPar = new String[] {""} ;
      T011J29_A2813MetPieCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i2496BarFecFin = GXutil.nullDate() ;
      i2846MetPieDsc = "" ;
      i5136MetPieFch = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T011J30_A407EmprNom = new String[] {""} ;
      T011J30_n407EmprNom = new boolean[] {false} ;
      T011J31_A279CliNom = new String[] {""} ;
      T011J33_A8355MetPieSuCa = new short[1] ;
      T011J33_A8356MetPieSuPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J33_A8357MetPieSuTA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J33_A8358MetPieSuPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011J33_A8359MetPieSuCo = new int[1] ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2496BarFecFin = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ212BarSer = "" ;
      ZZ135BarColNom = "" ;
      ZZ1234BarNomCli = "" ;
      ZZ8356MetPieSuPB = DecimalUtil.ZERO ;
      ZZ8357MetPieSuTA = DecimalUtil.ZERO ;
      ZZ8358MetPieSuPN = DecimalUtil.ZERO ;
      ZO8357MetPieSuTA = DecimalUtil.ZERO ;
      ZO8358MetPieSuPN = DecimalUtil.ZERO ;
      ZO8356MetPieSuPB = DecimalUtil.ZERO ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpckhrb__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpckhrb__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpckhrb__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpckhrb__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpckhrb__default(),
         new Object[] {
             new Object[] {
            T011J2_A2809MetTerCod, T011J2_A129BarCod, T011J2_A132BarCodReo, T011J2_A130BarCodPar, T011J2_A2813MetPieCod, T011J2_A2815MetPieMet, T011J2_A2816MetPieEst, T011J2_A5136MetPieFch, T011J2_A4909MetPieDef, T011J2_A2846MetPieDsc,
            T011J2_A2814MetPieKil, T011J2_A6635MetPieAnc, T011J2_A4910MetPieMtD, T011J2_A396EmprCod
            }
            , new Object[] {
            T011J3_A2809MetTerCod, T011J3_A129BarCod, T011J3_A132BarCodReo, T011J3_A130BarCodPar, T011J3_A2813MetPieCod, T011J3_A2815MetPieMet, T011J3_A2816MetPieEst, T011J3_A5136MetPieFch, T011J3_A4909MetPieDef, T011J3_A2846MetPieDsc,
            T011J3_A2814MetPieKil, T011J3_A6635MetPieAnc, T011J3_A4910MetPieMtD, T011J3_A396EmprCod
            }
            , new Object[] {
            T011J4_A2809MetTerCod, T011J4_A396EmprCod, T011J4_A129BarCod, T011J4_A132BarCodReo, T011J4_A130BarCodPar
            }
            , new Object[] {
            T011J5_A2809MetTerCod, T011J5_A396EmprCod, T011J5_A129BarCod, T011J5_A132BarCodReo, T011J5_A130BarCodPar
            }
            , new Object[] {
            T011J6_A407EmprNom, T011J6_n407EmprNom
            }
            , new Object[] {
            T011J7_A2496BarFecFin, T011J7_A2311BarCliDes, T011J7_A212BarSer, T011J7_A135BarColNom, T011J7_A136BarColNum, T011J7_A1234BarNomCli, T011J7_A1235BarNumCli, T011J7_A4844BarAudULin, T011J7_n4844BarAudULin, T011J7_A252CliCod,
            T011J7_n252CliCod
            }
            , new Object[] {
            T011J8_A2496BarFecFin, T011J8_A2311BarCliDes, T011J8_A212BarSer, T011J8_A135BarColNom, T011J8_A136BarColNum, T011J8_A1234BarNomCli, T011J8_A1235BarNumCli, T011J8_A4844BarAudULin, T011J8_n4844BarAudULin, T011J8_A252CliCod,
            T011J8_n252CliCod
            }
            , new Object[] {
            T011J9_A279CliNom
            }
            , new Object[] {
            T011J11_A8355MetPieSuCa, T011J11_A8356MetPieSuPB, T011J11_A8357MetPieSuTA, T011J11_A8358MetPieSuPN, T011J11_A8359MetPieSuCo
            }
            , new Object[] {
            T011J13_A2809MetTerCod, T011J13_A2496BarFecFin, T011J13_A407EmprNom, T011J13_n407EmprNom, T011J13_A279CliNom, T011J13_A2311BarCliDes, T011J13_A212BarSer, T011J13_A135BarColNom, T011J13_A136BarColNum, T011J13_A1234BarNomCli,
            T011J13_A1235BarNumCli, T011J13_A4844BarAudULin, T011J13_n4844BarAudULin, T011J13_A396EmprCod, T011J13_A129BarCod, T011J13_A132BarCodReo, T011J13_A130BarCodPar, T011J13_A252CliCod, T011J13_n252CliCod, T011J13_A8355MetPieSuCa,
            T011J13_A8356MetPieSuPB, T011J13_A8357MetPieSuTA, T011J13_A8358MetPieSuPN, T011J13_A8359MetPieSuCo
            }
            , new Object[] {
            T011J14_A396EmprCod, T011J14_A2809MetTerCod, T011J14_A129BarCod, T011J14_A132BarCodReo, T011J14_A130BarCodPar
            }
            , new Object[] {
            T011J15_A396EmprCod, T011J15_A2809MetTerCod, T011J15_A129BarCod, T011J15_A132BarCodReo, T011J15_A130BarCodPar
            }
            , new Object[] {
            T011J16_A396EmprCod, T011J16_A2809MetTerCod, T011J16_A129BarCod, T011J16_A132BarCodReo, T011J16_A130BarCodPar
            }
            , new Object[] {
            T011J17_A2496BarFecFin, T011J17_A2311BarCliDes, T011J17_A212BarSer, T011J17_A135BarColNom, T011J17_A136BarColNum, T011J17_A1234BarNomCli, T011J17_A1235BarNumCli, T011J17_A4844BarAudULin, T011J17_n4844BarAudULin, T011J17_A252CliCod,
            T011J17_n252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011J20_A396EmprCod, T011J20_A2809MetTerCod, T011J20_A129BarCod, T011J20_A132BarCodReo, T011J20_A130BarCodPar, T011J20_A2813MetPieCod, T011J20_A12995MetPieDfLi
            }
            , new Object[] {
            }
            , new Object[] {
            T011J22_A396EmprCod, T011J22_A2809MetTerCod, T011J22_A129BarCod, T011J22_A132BarCodReo, T011J22_A130BarCodPar
            }
            , new Object[] {
            T011J23_A2809MetTerCod, T011J23_A129BarCod, T011J23_A132BarCodReo, T011J23_A130BarCodPar, T011J23_A2813MetPieCod, T011J23_A2815MetPieMet, T011J23_A2816MetPieEst, T011J23_A5136MetPieFch, T011J23_A4909MetPieDef, T011J23_A2846MetPieDsc,
            T011J23_A2814MetPieKil, T011J23_A6635MetPieAnc, T011J23_A4910MetPieMtD, T011J23_A396EmprCod
            }
            , new Object[] {
            T011J24_A396EmprCod, T011J24_A2809MetTerCod, T011J24_A129BarCod, T011J24_A132BarCodReo, T011J24_A130BarCodPar, T011J24_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011J28_A396EmprCod, T011J28_A2809MetTerCod, T011J28_A129BarCod, T011J28_A132BarCodReo, T011J28_A130BarCodPar, T011J28_A2813MetPieCod, T011J28_A12995MetPieDfLi
            }
            , new Object[] {
            T011J29_A396EmprCod, T011J29_A2809MetTerCod, T011J29_A129BarCod, T011J29_A132BarCodReo, T011J29_A130BarCodPar, T011J29_A2813MetPieCod
            }
            , new Object[] {
            T011J30_A407EmprNom, T011J30_n407EmprNom
            }
            , new Object[] {
            T011J31_A279CliNom
            }
            , new Object[] {
            T011J33_A8355MetPieSuCa, T011J33_A8356MetPieSuPB, T011J33_A8357MetPieSuTA, T011J33_A8358MetPieSuPN, T011J33_A8359MetPieSuCo
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
      AV52Pgmname = "TPCKHRB" ;
      Z4909MetPieDef = (short)(0) ;
      A4909MetPieDef = (short)(0) ;
      i4909MetPieDef = (short)(0) ;
      Z2816MetPieEst = (byte)(0) ;
      A2816MetPieEst = (byte)(0) ;
      i2816MetPieEst = (byte)(0) ;
      Gx_date = GXutil.today( ) ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A2816MetPieEst ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2816MetPieEst ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte GXv_int6[] ;
   private short Z4844BarAudULin ;
   private short O8355MetPieSuCa ;
   private short Z4909MetPieDef ;
   private short Z6635MetPieAnc ;
   private short O6635MetPieAnc ;
   private short nRcdDeleted_413 ;
   private short nRcdExists_413 ;
   private short nIsMod_413 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4844BarAudULin ;
   private short A8355MetPieSuCa ;
   private short nBlankRcdCount413 ;
   private short RcdFound413 ;
   private short B8355MetPieSuCa ;
   private short nBlankRcdUsr413 ;
   private short s8355MetPieSuCa ;
   private short A4909MetPieDef ;
   private short A6635MetPieAnc ;
   private short T6635MetPieAnc ;
   private short Z8355MetPieSuCa ;
   private short RcdFound412 ;
   private short nIsDirty_412 ;
   private short nIsDirty_413 ;
   private short i4909MetPieDef ;
   private short ZZ4844BarAudULin ;
   private short ZZ8355MetPieSuCa ;
   private short ZO8355MetPieSuCa ;
   private int wcpOA129BarCod ;
   private int wcpOAV36CliCod ;
   private int wcpOAV40BarColNum ;
   private int Z129BarCod ;
   private int Z2311BarCliDes ;
   private int Z136BarColNum ;
   private int Z1235BarNumCli ;
   private int Z252CliCod ;
   private int O8359MetPieSuCo ;
   private int nRC_GXsfl_125 ;
   private int nGXsfl_125_idx=1 ;
   private int A129BarCod ;
   private int AV36CliCod ;
   private int AV40BarColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int A2311BarCliDes ;
   private int edtBarCliDes_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtBarFecFin_Enabled ;
   private int edtBarAudULin_Enabled ;
   private int edtMetPieSuCa_Enabled ;
   private int edtMetPieSuPB_Enabled ;
   private int edtMetPieSuTA_Enabled ;
   private int edtMetPieSuPN_Enabled ;
   private int A8359MetPieSuCo ;
   private int edtMetPieSuCo_Enabled ;
   private int B8359MetPieSuCo ;
   private int edtavnRcdDeleted_413_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieEst_Enabled ;
   private int edtMetPieDsc_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPieFch_Enabled ;
   private int edtMetPieAnc_Enabled ;
   private int edtMetPieMtD_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s8359MetPieSuCo ;
   private int GX_JID ;
   private int Z8359MetPieSuCo ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMetPieCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMetPieSuCo_Backcolor ;
   private int edtMetPieSuPN_Backcolor ;
   private int edtMetPieSuTA_Backcolor ;
   private int edtMetPieSuPB_Backcolor ;
   private int edtMetPieSuCa_Backcolor ;
   private int edtBarAudULin_Backcolor ;
   private int edtBarFecFin_Backcolor ;
   private int edtBarNumCli_Backcolor ;
   private int edtBarNomCli_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtBarCliDes_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtMetTerCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ252CliCod ;
   private int ZZ2311BarCliDes ;
   private int ZZ136BarColNum ;
   private int ZZ1235BarNumCli ;
   private int ZZ8359MetPieSuCo ;
   private int ZO8359MetPieSuCo ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O8357MetPieSuTA ;
   private java.math.BigDecimal O8358MetPieSuPN ;
   private java.math.BigDecimal O8356MetPieSuPB ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z4910MetPieMtD ;
   private java.math.BigDecimal O4910MetPieMtD ;
   private java.math.BigDecimal O2815MetPieMet ;
   private java.math.BigDecimal O2814MetPieKil ;
   private java.math.BigDecimal A8356MetPieSuPB ;
   private java.math.BigDecimal A8357MetPieSuTA ;
   private java.math.BigDecimal A8358MetPieSuPN ;
   private java.math.BigDecimal B8357MetPieSuTA ;
   private java.math.BigDecimal B8358MetPieSuPN ;
   private java.math.BigDecimal B8356MetPieSuPB ;
   private java.math.BigDecimal s8357MetPieSuTA ;
   private java.math.BigDecimal s8358MetPieSuPN ;
   private java.math.BigDecimal s8356MetPieSuPB ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal T4910MetPieMtD ;
   private java.math.BigDecimal T2815MetPieMet ;
   private java.math.BigDecimal T2814MetPieKil ;
   private java.math.BigDecimal Z8356MetPieSuPB ;
   private java.math.BigDecimal Z8357MetPieSuTA ;
   private java.math.BigDecimal Z8358MetPieSuPN ;
   private java.math.BigDecimal ZZ8356MetPieSuPB ;
   private java.math.BigDecimal ZZ8357MetPieSuTA ;
   private java.math.BigDecimal ZZ8358MetPieSuPN ;
   private java.math.BigDecimal ZO8357MetPieSuTA ;
   private java.math.BigDecimal ZO8358MetPieSuPN ;
   private java.math.BigDecimal ZO8356MetPieSuPB ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2809MetTerCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV35CliNom ;
   private String wcpOAV37BarMat ;
   private String wcpOAV38BarNmtr ;
   private String wcpOAV39BarColNom ;
   private String wcpOAV41PartCod ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String Z2813MetPieCod ;
   private String Z2846MetPieDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV35CliNom ;
   private String AV37BarMat ;
   private String AV38BarNmtr ;
   private String AV39BarColNom ;
   private String AV41PartCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_125_idx="0001" ;
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
   private String edtMetTerCod_Internalname ;
   private String edtMetTerCod_Jsonclick ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarCliDes_Internalname ;
   private String edtBarCliDes_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarFecFin_Internalname ;
   private String edtBarFecFin_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarAudULin_Internalname ;
   private String edtBarAudULin_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtMetPieSuCa_Internalname ;
   private String edtMetPieSuCa_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtMetPieSuPB_Internalname ;
   private String edtMetPieSuPB_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtMetPieSuTA_Internalname ;
   private String edtMetPieSuTA_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtMetPieSuPN_Internalname ;
   private String edtMetPieSuPN_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtMetPieSuCo_Internalname ;
   private String edtMetPieSuCo_Jsonclick ;
   private String sMode413 ;
   private String edtavnRcdDeleted_413_Internalname ;
   private String edtMetPieCod_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieDsc_Internalname ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPieFch_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
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
   private String AV52Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode412 ;
   private String GXCCtl ;
   private String A2846MetPieDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String edtMetPieCod_Inputmask ;
   private String sGXsfl_125_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_413_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieDsc_Jsonclick ;
   private String edtMetPieDef_Jsonclick ;
   private String edtMetPieFch_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i2846MetPieDsc ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ212BarSer ;
   private String ZZ135BarColNom ;
   private String ZZ1234BarNomCli ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z2496BarFecFin ;
   private java.util.Date Z5136MetPieFch ;
   private java.util.Date Gx_date ;
   private java.util.Date A2496BarFecFin ;
   private java.util.Date A5136MetPieFch ;
   private java.util.Date i2496BarFecFin ;
   private java.util.Date i5136MetPieFch ;
   private java.util.Date ZZ2496BarFecFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_125_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n4844BarAudULin ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T011J6_A407EmprNom ;
   private boolean[] T011J6_n407EmprNom ;
   private java.util.Date[] T011J8_A2496BarFecFin ;
   private int[] T011J8_A2311BarCliDes ;
   private String[] T011J8_A212BarSer ;
   private String[] T011J8_A135BarColNom ;
   private int[] T011J8_A136BarColNum ;
   private String[] T011J8_A1234BarNomCli ;
   private int[] T011J8_A1235BarNumCli ;
   private short[] T011J8_A4844BarAudULin ;
   private boolean[] T011J8_n4844BarAudULin ;
   private int[] T011J8_A252CliCod ;
   private boolean[] T011J8_n252CliCod ;
   private String[] T011J9_A279CliNom ;
   private short[] T011J11_A8355MetPieSuCa ;
   private java.math.BigDecimal[] T011J11_A8356MetPieSuPB ;
   private java.math.BigDecimal[] T011J11_A8357MetPieSuTA ;
   private java.math.BigDecimal[] T011J11_A8358MetPieSuPN ;
   private int[] T011J11_A8359MetPieSuCo ;
   private String[] T011J13_A2809MetTerCod ;
   private java.util.Date[] T011J13_A2496BarFecFin ;
   private String[] T011J13_A407EmprNom ;
   private boolean[] T011J13_n407EmprNom ;
   private String[] T011J13_A279CliNom ;
   private int[] T011J13_A2311BarCliDes ;
   private String[] T011J13_A212BarSer ;
   private String[] T011J13_A135BarColNom ;
   private int[] T011J13_A136BarColNum ;
   private String[] T011J13_A1234BarNomCli ;
   private int[] T011J13_A1235BarNumCli ;
   private short[] T011J13_A4844BarAudULin ;
   private boolean[] T011J13_n4844BarAudULin ;
   private String[] T011J13_A396EmprCod ;
   private int[] T011J13_A129BarCod ;
   private byte[] T011J13_A132BarCodReo ;
   private String[] T011J13_A130BarCodPar ;
   private int[] T011J13_A252CliCod ;
   private boolean[] T011J13_n252CliCod ;
   private short[] T011J13_A8355MetPieSuCa ;
   private java.math.BigDecimal[] T011J13_A8356MetPieSuPB ;
   private java.math.BigDecimal[] T011J13_A8357MetPieSuTA ;
   private java.math.BigDecimal[] T011J13_A8358MetPieSuPN ;
   private int[] T011J13_A8359MetPieSuCo ;
   private String[] T011J14_A396EmprCod ;
   private String[] T011J14_A2809MetTerCod ;
   private int[] T011J14_A129BarCod ;
   private byte[] T011J14_A132BarCodReo ;
   private String[] T011J14_A130BarCodPar ;
   private String[] T011J5_A2809MetTerCod ;
   private String[] T011J5_A396EmprCod ;
   private int[] T011J5_A129BarCod ;
   private byte[] T011J5_A132BarCodReo ;
   private String[] T011J5_A130BarCodPar ;
   private String[] T011J15_A396EmprCod ;
   private String[] T011J15_A2809MetTerCod ;
   private int[] T011J15_A129BarCod ;
   private byte[] T011J15_A132BarCodReo ;
   private String[] T011J15_A130BarCodPar ;
   private String[] T011J16_A396EmprCod ;
   private String[] T011J16_A2809MetTerCod ;
   private int[] T011J16_A129BarCod ;
   private byte[] T011J16_A132BarCodReo ;
   private String[] T011J16_A130BarCodPar ;
   private String[] T011J4_A2809MetTerCod ;
   private String[] T011J4_A396EmprCod ;
   private int[] T011J4_A129BarCod ;
   private byte[] T011J4_A132BarCodReo ;
   private String[] T011J4_A130BarCodPar ;
   private java.util.Date[] T011J17_A2496BarFecFin ;
   private int[] T011J17_A2311BarCliDes ;
   private String[] T011J17_A212BarSer ;
   private String[] T011J17_A135BarColNom ;
   private int[] T011J17_A136BarColNum ;
   private String[] T011J17_A1234BarNomCli ;
   private int[] T011J17_A1235BarNumCli ;
   private short[] T011J17_A4844BarAudULin ;
   private boolean[] T011J17_n4844BarAudULin ;
   private int[] T011J17_A252CliCod ;
   private boolean[] T011J17_n252CliCod ;
   private String[] T011J20_A396EmprCod ;
   private String[] T011J20_A2809MetTerCod ;
   private int[] T011J20_A129BarCod ;
   private byte[] T011J20_A132BarCodReo ;
   private String[] T011J20_A130BarCodPar ;
   private String[] T011J20_A2813MetPieCod ;
   private short[] T011J20_A12995MetPieDfLi ;
   private String[] T011J22_A396EmprCod ;
   private String[] T011J22_A2809MetTerCod ;
   private int[] T011J22_A129BarCod ;
   private byte[] T011J22_A132BarCodReo ;
   private String[] T011J22_A130BarCodPar ;
   private String[] T011J23_A2809MetTerCod ;
   private int[] T011J23_A129BarCod ;
   private byte[] T011J23_A132BarCodReo ;
   private String[] T011J23_A130BarCodPar ;
   private String[] T011J23_A2813MetPieCod ;
   private java.math.BigDecimal[] T011J23_A2815MetPieMet ;
   private byte[] T011J23_A2816MetPieEst ;
   private java.util.Date[] T011J23_A5136MetPieFch ;
   private short[] T011J23_A4909MetPieDef ;
   private String[] T011J23_A2846MetPieDsc ;
   private java.math.BigDecimal[] T011J23_A2814MetPieKil ;
   private short[] T011J23_A6635MetPieAnc ;
   private java.math.BigDecimal[] T011J23_A4910MetPieMtD ;
   private String[] T011J23_A396EmprCod ;
   private String[] T011J24_A396EmprCod ;
   private String[] T011J24_A2809MetTerCod ;
   private int[] T011J24_A129BarCod ;
   private byte[] T011J24_A132BarCodReo ;
   private String[] T011J24_A130BarCodPar ;
   private String[] T011J24_A2813MetPieCod ;
   private String[] T011J3_A2809MetTerCod ;
   private int[] T011J3_A129BarCod ;
   private byte[] T011J3_A132BarCodReo ;
   private String[] T011J3_A130BarCodPar ;
   private String[] T011J3_A2813MetPieCod ;
   private java.math.BigDecimal[] T011J3_A2815MetPieMet ;
   private byte[] T011J3_A2816MetPieEst ;
   private java.util.Date[] T011J3_A5136MetPieFch ;
   private short[] T011J3_A4909MetPieDef ;
   private String[] T011J3_A2846MetPieDsc ;
   private java.math.BigDecimal[] T011J3_A2814MetPieKil ;
   private short[] T011J3_A6635MetPieAnc ;
   private java.math.BigDecimal[] T011J3_A4910MetPieMtD ;
   private String[] T011J3_A396EmprCod ;
   private String[] T011J2_A2809MetTerCod ;
   private int[] T011J2_A129BarCod ;
   private byte[] T011J2_A132BarCodReo ;
   private String[] T011J2_A130BarCodPar ;
   private String[] T011J2_A2813MetPieCod ;
   private java.math.BigDecimal[] T011J2_A2815MetPieMet ;
   private byte[] T011J2_A2816MetPieEst ;
   private java.util.Date[] T011J2_A5136MetPieFch ;
   private short[] T011J2_A4909MetPieDef ;
   private String[] T011J2_A2846MetPieDsc ;
   private java.math.BigDecimal[] T011J2_A2814MetPieKil ;
   private short[] T011J2_A6635MetPieAnc ;
   private java.math.BigDecimal[] T011J2_A4910MetPieMtD ;
   private String[] T011J2_A396EmprCod ;
   private String[] T011J28_A396EmprCod ;
   private String[] T011J28_A2809MetTerCod ;
   private int[] T011J28_A129BarCod ;
   private byte[] T011J28_A132BarCodReo ;
   private String[] T011J28_A130BarCodPar ;
   private String[] T011J28_A2813MetPieCod ;
   private short[] T011J28_A12995MetPieDfLi ;
   private String[] T011J29_A396EmprCod ;
   private String[] T011J29_A2809MetTerCod ;
   private int[] T011J29_A129BarCod ;
   private byte[] T011J29_A132BarCodReo ;
   private String[] T011J29_A130BarCodPar ;
   private String[] T011J29_A2813MetPieCod ;
   private String[] T011J30_A407EmprNom ;
   private boolean[] T011J30_n407EmprNom ;
   private String[] T011J31_A279CliNom ;
   private short[] T011J33_A8355MetPieSuCa ;
   private java.math.BigDecimal[] T011J33_A8356MetPieSuPB ;
   private java.math.BigDecimal[] T011J33_A8357MetPieSuTA ;
   private java.math.BigDecimal[] T011J33_A8358MetPieSuPN ;
   private int[] T011J33_A8359MetPieSuCo ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.util.Date[] T011J7_A2496BarFecFin ;
   private int[] T011J7_A2311BarCliDes ;
   private String[] T011J7_A212BarSer ;
   private String[] T011J7_A135BarColNom ;
   private int[] T011J7_A136BarColNum ;
   private String[] T011J7_A1234BarNomCli ;
   private int[] T011J7_A1235BarNumCli ;
   private short[] T011J7_A4844BarAudULin ;
   private int[] T011J7_A252CliCod ;
   private boolean[] T011J7_n4844BarAudULin ;
   private boolean[] T011J7_n252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpckhrb__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpckhrb__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpckhrb__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpckhrb__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpckhrb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T011J2", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieMet, MetPieEst, MetPieFch, MetPieDef, MetPieDsc, MetPieKil, MetPieAnc, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieMet, MetPieEst, MetPieFch, MetPieDef, MetPieDsc, MetPieKil, MetPieAnc, MetPieMtD NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J3", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieMet, MetPieEst, MetPieFch, MetPieDef, MetPieDsc, MetPieKil, MetPieAnc, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J4", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF MetTerCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J5", "SELECT MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J7", "SELECT BarFecFin, BarCliDes, BarSer, BarColNom, BarColNum, BarNomCli, BarNumCli, BarAudULin, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarFecFin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J8", "SELECT BarFecFin, BarCliDes, BarSer, BarColNom, BarColNum, BarNomCli, BarNumCli, BarAudULin, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J11", "SELECT COALESCE( T1.MetPieSuCa, 0) AS MetPieSuCa, COALESCE( T1.MetPieSuPB, 0) AS MetPieSuPB, COALESCE( T1.MetPieSuTA, 0) AS MetPieSuTA, COALESCE( T1.MetPieSuPN, 0) AS MetPieSuPN, COALESCE( T1.MetPieSuCo, 0) AS MetPieSuCo FROM (SELECT COUNT(*) AS MetPieSuCa, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetPieSuPB, SUM(MetPieMtD) AS MetPieSuTA, SUM(MetPieMet) AS MetPieSuPN, SUM(MetPieAnc) AS MetPieSuCo FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J13", "SELECT /*+ FIRST_ROWS(1) */ TM1.MetTerCod, T3.BarFecFin, T2.EmprNom, T4.CliNom, T3.BarCliDes, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarNomCli, T3.BarNumCli, T3.BarAudULin, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, COALESCE( T5.MetPieSuCa, 0) AS MetPieSuCa, COALESCE( T5.MetPieSuPB, 0) AS MetPieSuPB, COALESCE( T5.MetPieSuTA, 0) AS MetPieSuTA, COALESCE( T5.MetPieSuPN, 0) AS MetPieSuPN, COALESCE( T5.MetPieSuCo, 0) AS MetPieSuCo FROM ((((TXPCMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT COUNT(*) AS MetPieSuCa, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetPieSuPB, SUM(MetPieMtD) AS MetPieSuTA, SUM(MetPieMet) AS MetPieSuPN, SUM(MetPieAnc) AS MetPieSuCo FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.MetTerCod = TM1.MetTerCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J17", "SELECT BarFecFin, BarCliDes, BarSer, BarColNom, BarColNum, BarNomCli, BarNumCli, BarAudULin, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarFecFin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011J18", "INSERT INTO TXPCMETPI(MetTerCod, EmprCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPCMETPI")
         ,new UpdateCursor("T011J19", "DELETE FROM TXPCMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPCMETPI")
         ,new ForEachCursor("T011J20", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011J21", "UPDATE TXPBARCAD SET BarFecFin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T011J22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J23", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieMet, MetPieEst, MetPieFch, MetPieDef, MetPieDsc, MetPieKil, MetPieAnc, MetPieMtD, EmprCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J24", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011J25", "INSERT INTO TXPLMETPI(MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieMet, MetPieEst, MetPieFch, MetPieDef, MetPieDsc, MetPieKil, MetPieAnc, MetPieMtD, EmprCod, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T011J26", "UPDATE TXPLMETPI SET MetPieMet=?, MetPieEst=?, MetPieFch=?, MetPieDef=?, MetPieDsc=?, MetPieKil=?, MetPieAnc=?, MetPieMtD=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T011J27", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T011J28", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieDfLi FROM TXPMETPID WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011J29", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J30", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J31", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011J33", "SELECT COALESCE( T1.MetPieSuCa, 0) AS MetPieSuCa, COALESCE( T1.MetPieSuPB, 0) AS MetPieSuPB, COALESCE( T1.MetPieSuTA, 0) AS MetPieSuTA, COALESCE( T1.MetPieSuPN, 0) AS MetPieSuPN, COALESCE( T1.MetPieSuCo, 0) AS MetPieSuCo FROM (SELECT COUNT(*) AS MetPieSuCa, EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, SUM(MetPieKil) AS MetPieSuPB, SUM(MetPieMtD) AS MetPieSuTA, SUM(MetPieMet) AS MetPieSuPN, SUM(MetPieAnc) AS MetPieSuCo FROM TXPLMETPI GROUP BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.MetTerCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 13 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
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
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 17 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 20);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(14, (String)parms[13], 3);
               return;
            case 22 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
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
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

