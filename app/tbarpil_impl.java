package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbarpil_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action31") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_31_1B318( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1B318( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A252CliCod) ;
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
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO PIEZAS LAVANDERIAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarTipCol_Internalname ;
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
      nRC_GXsfl_140 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_140"))) ;
      nGXsfl_140_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_140_idx"))) ;
      sGXsfl_140_idx = httpContext.GetPar( "sGXsfl_140_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      n396EmprCod = false ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A898BarPieNDes = (int)(GXutil.lval( httpContext.GetPar( "BarPieNDes"))) ;
      A365DisDes = httpContext.GetPar( "DisDes") ;
      A199BarPie1 = (short)(GXutil.lval( httpContext.GetPar( "BarPie1"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tbarpil_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbarpil_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbarpil_impl.class ));
   }

   public tbarpil_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbREst = new HTMLChoice();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARPIL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Materia", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMat_Internalname, GXutil.rtrim( A182BarMat), GXutil.rtrim( localUtil.format( A182BarMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMat_Jsonclick, 0, "", "", "", "", "", 1, edtBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilogramos", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtr_Enabled!=0) ? localUtil.format( A184BarMtr, "ZZZZZ9.99") : localUtil.format( A184BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtr_Jsonclick, 0, "", "", "", "", "", 1, edtBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "BarPie1", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie1_Internalname, GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A199BarPie1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A199BarPie1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie1_Jsonclick, 0, "", "", "", "", "", 1, edtBarPie1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "BarPes", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPes_Internalname, GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPes_Jsonclick, 0, "", "", "", "", "", 1, edtBarPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Piezas Dispos. sin desglose", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieNDes_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieNDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Descripción Serie", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPIL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol140( ) ;
      nGXsfl_140_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount18 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_18 = (short)(1) ;
            scanStart1B318( ) ;
            while ( RcdFound18 != 0 )
            {
               init_level_properties18( ) ;
               getByPrimaryKey1B318( ) ;
               addRow1B318( ) ;
               scanNext1B318( ) ;
            }
            scanEnd1B318( ) ;
            nBlankRcdCount18 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B184BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         B166BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         standaloneNotModal1B318( ) ;
         standaloneModal1B318( ) ;
         sMode18 = Gx_mode ;
         while ( nGXsfl_140_idx < nRC_GXsfl_140 )
         {
            bGXsfl_140_Refreshing = true ;
            readRow1B318( ) ;
            edtavnRcdDeleted_18_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_18_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_18_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPieCod_Title = httpContext.cgiGet( "BARPIECOD_"+sGXsfl_140_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Title", edtBarPieCod_Title, !bGXsfl_140_Refreshing);
            edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRecCod_Title = httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_140_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Title", edtAlbRecCod_Title, !bGXsfl_140_Refreshing);
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPieKil_Title = httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_140_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Title", edtBarPieKil_Title, !bGXsfl_140_Refreshing);
            edtBarPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEMET_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEEST_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarKilLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKILLAN_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarMetLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMETLAN_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtPieOriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEORICOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPieLzd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELZD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtBarPiePie_Title = httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_140_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Title", edtBarPiePie_Title, !bGXsfl_140_Refreshing);
            edtBarPiePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtAlbREnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtClasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLASCOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtClasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLASDSC_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtProceCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCECOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            edtProceNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCENOM_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), !bGXsfl_140_Refreshing);
            if ( ( nRcdExists_18 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1B318( ) ;
            }
            sendRow1B318( ) ;
            bGXsfl_140_Refreshing = false ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A184BarMtr = B184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = B166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount18 = (short)(5) ;
         nRcdExists_18 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1B318( ) ;
            while ( RcdFound18 != 0 )
            {
               sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_14018( ) ;
               init_level_properties18( ) ;
               standaloneNotModal1B318( ) ;
               getByPrimaryKey1B318( ) ;
               standaloneModal1B318( ) ;
               addRow1B318( ) ;
               scanNext1B318( ) ;
            }
            scanEnd1B318( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode18 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_14018( ) ;
      initAll1B318( ) ;
      init_level_properties18( ) ;
      B184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      B166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      nRcdExists_18 = (short)(0) ;
      nIsMod_18 = (short)(0) ;
      nRcdDeleted_18 = (short)(0) ;
      nBlankRcdCount18 = (short)(nBlankRcdUsr18+nBlankRcdCount18) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount18 > 0 )
      {
         standaloneNotModal1B318( ) ;
         standaloneModal1B318( ) ;
         addRow1B318( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarPieCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount18 = (short)(nBlankRcdCount18-1) ;
      }
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A184BarMtr = B184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      A166BarKgm = B166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPIL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARPIL.htm");
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
      e111B32 ();
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
            Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
            Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
            Z182BarMat = httpContext.cgiGet( "Z182BarMat") ;
            Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
            Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z218BarTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( "Z864BarPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
            Z1652BarSerDsc = httpContext.cgiGet( "Z1652BarSerDsc") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
            A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
            O184BarMtr = localUtil.ctond( httpContext.cgiGet( "O184BarMtr")) ;
            O166BarKgm = localUtil.ctond( httpContext.cgiGet( "O166BarKgm")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_140 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_140"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A365DisDes = httpContext.cgiGet( "DISDES") ;
            AV33Lit12 = httpContext.cgiGet( "vLIT12") ;
            AV34Lit13 = httpContext.cgiGet( "vLIT13") ;
            AV35Lit14 = httpContext.cgiGet( "vLIT14") ;
            AV37Lit16 = httpContext.cgiGet( "vLIT16") ;
            AV17KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV18MtrAnt = localUtil.ctond( httpContext.cgiGet( "vMTRANT")) ;
            AV19BarPieAnt = (int)(localUtil.ctol( httpContext.cgiGet( "vBARPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIPCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A218BarTipCol = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            }
            else
            {
               A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A361DisCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            else
            {
               A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
            A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPie1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
            A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarSit_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213BarSit = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            else
            {
               A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            }
            A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARPIL");
            forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
            forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
            A182BarMat = httpContext.cgiGet( edtBarMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
            forbiddenHiddens.add("BarMat", GXutil.rtrim( localUtil.format( A182BarMat, "")));
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( A135BarColNom, "")));
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"));
            A864BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
            forbiddenHiddens.add("BarPes", localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbarpil:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               n396EmprCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               n129BarCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               n132BarCodReo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               n130BarCodPar = false ;
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
                        e111B32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ALTA PIEZA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Alta Pieza' */
                        e121B32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'MODIFICAR TIPO PIEZA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Modificar Tipo Pieza' */
                        e131B32 ();
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
            initAll1B312( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_18_Enabled), 5, 0), !bGXsfl_140_Refreshing);
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
      disableAttributes1B312( ) ;
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

   public void confirm_1B30( )
   {
      beforeValidate1B312( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1B312( ) ;
         }
         else
         {
            checkExtendedTable1B312( ) ;
            if ( AnyError == 0 )
            {
               zm1B312( 34) ;
               zm1B312( 35) ;
               zm1B312( 36) ;
               zm1B312( 37) ;
            }
            closeExtendedTableCursors1B312( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1B318( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1B30( ) ;
      }
   }

   public void confirm_1B318( )
   {
      s184BarMtr = O184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      s166BarKgm = O166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      s198BarPie = O198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      nGXsfl_140_idx = 0 ;
      while ( nGXsfl_140_idx < nRC_GXsfl_140 )
      {
         readRow1B318( ) ;
         if ( ( nRcdExists_18 != 0 ) || ( nIsMod_18 != 0 ) )
         {
            getKey1B318( ) ;
            if ( ( nRcdExists_18 == 0 ) && ( nRcdDeleted_18 == 0 ) )
            {
               if ( RcdFound18 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1B318( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1B318( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1B318( 39) ;
                        zm1B318( 40) ;
                        zm1B318( 41) ;
                        zm1B318( 42) ;
                     }
                     closeExtendedTableCursors1B318( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O184BarMtr = A184BarMtr ;
                     httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                     O166BarKgm = A166BarKgm ;
                     httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                     O198BarPie = A198BarPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                  }
               }
               else
               {
                  GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound18 != 0 )
               {
                  if ( nRcdDeleted_18 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1B318( ) ;
                     load1B318( ) ;
                     beforeValidate1B318( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1B318( ) ;
                        O184BarMtr = A184BarMtr ;
                        httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                        O166BarKgm = A166BarKgm ;
                        httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                        O198BarPie = A198BarPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_18 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1B318( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1B318( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1B318( 39) ;
                              zm1B318( 40) ;
                              zm1B318( 41) ;
                              zm1B318( 42) ;
                           }
                           closeExtendedTableCursors1B318( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O184BarMtr = A184BarMtr ;
                           httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                           O166BarKgm = A166BarKgm ;
                           httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                           O198BarPie = A198BarPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_18 == 0 )
                  {
                     GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_18_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod)) ;
         httpContext.changePostValue( edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt)) ;
         httpContext.changePostValue( edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc)) ;
         httpContext.changePostValue( edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProceNom_Internalname, GXutil.rtrim( A971ProceNom)) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_140_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_140_idx, GXutil.rtrim( Z908PieOriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1501BarPiePie_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T205BarPieMet_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T203BarPieKil_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_18 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_18_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_18_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieCod_Title)) ;
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtAlbRecCod_Title)) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieKil_Title)) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEMET_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEEST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKILLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMETLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEORICOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELZD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPiePie_Title)) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLASCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLASDSC_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCENOM_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O184BarMtr = s184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = s166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      O198BarPie = s198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      /* Start of After( level) rules */
      /* Using cursor T01B38 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A199BarPie1 = T01B38_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T01B38_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1B30( )
   {
   }

   public void e111B32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV40LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40LitFe", AV40LitFe);
      GXt_char1 = AV21Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit0", AV21Lit0);
      GXt_char1 = AV22Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit1", AV22Lit1);
      GXt_char1 = AV23Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit2", AV23Lit2);
      GXt_char1 = AV24Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit3", AV24Lit3);
      GXt_char1 = AV25Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit4", AV25Lit4);
      GXt_char1 = AV26Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit5", AV26Lit5);
      GXt_char1 = AV27Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit6", AV27Lit6);
      GXt_char1 = AV28Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit7", AV28Lit7);
      GXt_char1 = AV29Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit8", AV29Lit8);
      GXt_char1 = AV30Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit9", AV30Lit9);
      GXt_char1 = AV31Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit10", AV31Lit10);
      GXt_char1 = AV32Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1306_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit11", AV32Lit11);
      GXt_char1 = AV33Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN144_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit12", AV33Lit12);
      GXt_char1 = AV34Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN838_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit13", AV34Lit13);
      GXt_char1 = AV35Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit14", AV35Lit14);
      GXt_char1 = AV36Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit15", AV36Lit15);
      GXt_char1 = AV37Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit16", AV37Lit16);
      GXt_char1 = AV38Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT75_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit17", AV38Lit17);
      GXt_char1 = AV41lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT245_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41lit18", AV41lit18);
      GXt_char1 = AV48Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
      tbarpil_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lit21", AV48Lit21);
      AV42Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Station", AV42Station);
      GXv_char2[0] = AV43EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbarpil_impl.this.AV43EmprCod = GXv_char2[0] ;
      tbarpil_impl.this.AV44EmprNom = GXv_char3[0] ;
      tbarpil_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV44EmprNom", AV44EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39UsurCod", AV39UsurCod);
   }

   public void e121B32( )
   {
      /* 'Alta Pieza' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e131B32( )
   {
      /* 'Modificar Tipo Pieza' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1B312( int GX_JID )
   {
      if ( ( GX_JID == 33 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2759BarMaqGru = T01B310_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01B310_A180BarMaqCod[0] ;
            Z143BarDisNum = T01B310_A143BarDisNum[0] ;
            Z212BarSer = T01B310_A212BarSer[0] ;
            Z182BarMat = T01B310_A182BarMat[0] ;
            Z135BarColNom = T01B310_A135BarColNom[0] ;
            Z136BarColNum = T01B310_A136BarColNum[0] ;
            Z218BarTipCol = T01B310_A218BarTipCol[0] ;
            Z864BarPes = T01B310_A864BarPes[0] ;
            Z213BarSit = T01B310_A213BarSit[0] ;
            Z120BarAgrEst = T01B310_A120BarAgrEst[0] ;
            Z1652BarSerDsc = T01B310_A1652BarSerDsc[0] ;
            Z361DisCod = T01B310_A361DisCod[0] ;
         }
         else
         {
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z143BarDisNum = A143BarDisNum ;
            Z212BarSer = A212BarSer ;
            Z182BarMat = A182BarMat ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
            Z218BarTipCol = A218BarTipCol ;
            Z864BarPes = A864BarPes ;
            Z213BarSit = A213BarSit ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z1652BarSerDsc = A1652BarSerDsc ;
            Z361DisCod = A361DisCod ;
         }
      }
      if ( GX_JID == -33 )
      {
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z143BarDisNum = A143BarDisNum ;
         Z252CliCod = A252CliCod ;
         Z212BarSer = A212BarSer ;
         Z182BarMat = A182BarMat ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z864BarPes = A864BarPes ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z407EmprNom = A407EmprNom ;
         Z166BarKgm = A166BarKgm ;
         Z184BarMtr = A184BarMtr ;
         Z199BarPie1 = A199BarPie1 ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z392DisUniMed = A392DisUniMed ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      /* Using cursor T01B311 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01B311_A407EmprNom[0] ;
      n407EmprNom = T01B311_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T01B38 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A166BarKgm = T01B38_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = T01B38_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T01B38_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T01B38_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      pr_default.close(5);
      edtBarPieCod_Title = AV33Lit12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Title", edtBarPieCod_Title, !bGXsfl_140_Refreshing);
      edtAlbRecCod_Title = AV34Lit13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Title", edtAlbRecCod_Title, !bGXsfl_140_Refreshing);
      edtBarPieKil_Title = AV35Lit14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Title", edtBarPieKil_Title, !bGXsfl_140_Refreshing);
      edtBarPiePie_Title = AV37Lit16 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Title", edtBarPiePie_Title, !bGXsfl_140_Refreshing);
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
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1B312( )
   {
      /* Using cursor T01B315 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T01B315_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01B315_A180BarMaqCod[0] ;
         A143BarDisNum = T01B315_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A252CliCod = T01B315_A252CliCod[0] ;
         n252CliCod = T01B315_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01B315_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T01B315_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A182BarMat = T01B315_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T01B315_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01B315_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01B315_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A392DisUniMed = T01B315_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A864BarPes = T01B315_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T01B315_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01B315_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A407EmprNom = T01B315_A407EmprNom[0] ;
         n407EmprNom = T01B315_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1652BarSerDsc = T01B315_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A365DisDes = T01B315_A365DisDes[0] ;
         A361DisCod = T01B315_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A166BarKgm = T01B315_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = T01B315_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T01B315_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T01B315_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         zm1B312( -33) ;
      }
      pr_default.close(11);
      onLoadActions1B312( ) ;
   }

   public void onLoadActions1B312( )
   {
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void checkExtendedTable1B312( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01B312 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01B312_A252CliCod[0] ;
      n252CliCod = T01B312_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A392DisUniMed = T01B312_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T01B312_A365DisDes[0] ;
      pr_default.close(9);
      /* Using cursor T01B313 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01B313_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(10);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void closeExtendedTableCursors1B312( )
   {
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_35( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01B316 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01B316_A252CliCod[0] ;
      n252CliCod = T01B316_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A392DisUniMed = T01B316_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A365DisDes = T01B316_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_36( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01B317 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01B317_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1B312( )
   {
      /* Using cursor T01B318 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01B310 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) && ( T01B310_A129BarCod[0] == A129BarCod ) && ( T01B310_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B310_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01B310_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1B312( 33) ;
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T01B310_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01B310_A180BarMaqCod[0] ;
         A143BarDisNum = T01B310_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A212BarSer = T01B310_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A182BarMat = T01B310_A182BarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
         A135BarColNom = T01B310_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01B310_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01B310_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A864BarPes = T01B310_A864BarPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
         A213BarSit = T01B310_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01B310_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A1652BarSerDsc = T01B310_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A361DisCod = T01B310_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1B312( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1B312( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1B312( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1B312( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01B319 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01B319_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01B319_A129BarCod[0] == A129BarCod ) && ( T01B319_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B319_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01B319_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01B319_A129BarCod[0] == A129BarCod ) && ( T01B319_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B319_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01B320 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01B320_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01B320_A129BarCod[0] == A129BarCod ) && ( T01B320_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B320_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01B320_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01B320_A129BarCod[0] == A129BarCod ) && ( T01B320_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B320_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1B312( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A184BarMtr = O184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = O166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A198BarPie = O198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         GX_FocusControl = edtBarTipCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1B312( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               update1B312( ) ;
               GX_FocusControl = edtBarTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               GX_FocusControl = edtBarTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1B312( ) ;
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
                  A184BarMtr = O184BarMtr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                  A166BarKgm = O166BarKgm ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                  A198BarPie = O198BarPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
                  GX_FocusControl = edtBarTipCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1B312( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A184BarMtr = O184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A166BarKgm = O166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A198BarPie = O198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarTipCol_Internalname ;
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
      getKey1B312( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarpil");
      GX_FocusControl = edtBarTipCol_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1B30( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarTipCol_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1B312( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTipCol_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B312( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTipCol_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTipCol_Internalname ;
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
      scanStart1B312( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1B312( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTipCol_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B312( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1B312( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01B39 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z2759BarMaqGru, T01B39_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01B39_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z143BarDisNum, T01B39_A143BarDisNum[0]) != 0 ) || ( GXutil.strcmp(Z212BarSer, T01B39_A212BarSer[0]) != 0 ) || ( GXutil.strcmp(Z182BarMat, T01B39_A182BarMat[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z135BarColNom, T01B39_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T01B39_A136BarColNum[0] ) || ( Z218BarTipCol != T01B39_A218BarTipCol[0] ) || ( Z864BarPes != T01B39_A864BarPes[0] ) || ( Z213BarSit != T01B39_A213BarSit[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z120BarAgrEst, T01B39_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z1652BarSerDsc, T01B39_A1652BarSerDsc[0]) != 0 ) || ( Z361DisCod != T01B39_A361DisCod[0] ) )
         {
            if ( GXutil.strcmp(Z2759BarMaqGru, T01B39_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01B39_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01B39_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01B39_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T01B39_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T01B39_A143BarDisNum[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T01B39_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T01B39_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z182BarMat, T01B39_A182BarMat[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarMat");
               GXutil.writeLogRaw("Old: ",Z182BarMat);
               GXutil.writeLogRaw("Current: ",T01B39_A182BarMat[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T01B39_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T01B39_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T01B39_A136BarColNum[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T01B39_A136BarColNum[0]);
            }
            if ( Z218BarTipCol != T01B39_A218BarTipCol[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarTipCol");
               GXutil.writeLogRaw("Old: ",Z218BarTipCol);
               GXutil.writeLogRaw("Current: ",T01B39_A218BarTipCol[0]);
            }
            if ( Z864BarPes != T01B39_A864BarPes[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPes");
               GXutil.writeLogRaw("Old: ",Z864BarPes);
               GXutil.writeLogRaw("Current: ",T01B39_A864BarPes[0]);
            }
            if ( Z213BarSit != T01B39_A213BarSit[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T01B39_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T01B39_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T01B39_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z1652BarSerDsc, T01B39_A1652BarSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarSerDsc");
               GXutil.writeLogRaw("Old: ",Z1652BarSerDsc);
               GXutil.writeLogRaw("Current: ",T01B39_A1652BarSerDsc[0]);
            }
            if ( Z361DisCod != T01B39_A361DisCod[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01B39_A361DisCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1B312( )
   {
      beforeValidate1B312( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B312( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1B312( 0) ;
         checkOptimisticConcurrency1B312( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B312( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1B312( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B321 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A143BarDisNum, A212BarSer, A182BarMat, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A864BarPes), Byte.valueOf(A213BarSit), A120BarAgrEst, A1652BarSerDsc, Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11B312( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1B312( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1B30( ) ;
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
            load1B312( ) ;
         }
         endLevel1B312( ) ;
      }
      closeExtendedTableCursors1B312( ) ;
   }

   public void update1B312( )
   {
      beforeValidate1B312( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B312( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B312( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B312( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1B312( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B322 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, A180BarMaqCod, A143BarDisNum, A212BarSer, A182BarMat, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Short.valueOf(A864BarPes), Byte.valueOf(A213BarSit), A120BarAgrEst, A1652BarSerDsc, Integer.valueOf(A361DisCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1B312( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A129BarCod ;
                     GXv_int6[0] = A132BarCodReo ;
                     GXv_char3[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                     tbarpil_impl.this.A396EmprCod = GXv_char4[0] ;
                     tbarpil_impl.this.A129BarCod = GXv_int5[0] ;
                     tbarpil_impl.this.A132BarCodReo = GXv_int6[0] ;
                     tbarpil_impl.this.A130BarCodPar = GXv_char3[0] ;
                     updateTablesN11B312( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1B312( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1B30( ) ;
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
         endLevel1B312( ) ;
      }
      closeExtendedTableCursors1B312( ) ;
   }

   public void deferredUpdate1B312( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1B312( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B312( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1B312( ) ;
         afterConfirm1B312( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1B312( ) ;
            if ( AnyError == 0 )
            {
               A184BarMtr = O184BarMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               A166BarKgm = O166BarKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A198BarPie = O198BarPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               scanStart1B318( ) ;
               while ( RcdFound18 != 0 )
               {
                  getByPrimaryKey1B318( ) ;
                  delete1B318( ) ;
                  scanNext1B318( ) ;
                  O184BarMtr = A184BarMtr ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
                  O166BarKgm = A166BarKgm ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
                  O198BarPie = A198BarPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
               }
               scanEnd1B318( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B323 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11B312( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1B312( ) ;
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
                        resetCaption1B30( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1B312( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1B312( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01B324 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01B324_A252CliCod[0] ;
         n252CliCod = T01B324_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A392DisUniMed = T01B324_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A365DisDes = T01B324_A365DisDes[0] ;
         pr_default.close(20);
         /* Using cursor T01B325 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01B325_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(21);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01B326 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01B327 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01B328 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01B329 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01B330 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01B331 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01B332 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01B333 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01B334 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01B335 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01B336 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01B337 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01B338 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01B339 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01B340 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01B341 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01B342 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01B343 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01B344 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01B345 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01B346 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01B347 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01B348 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01B349 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01B350 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01B351 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01B352 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01B353 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01B354 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01B355 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01B356 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01B357 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01B358 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01B359 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01B360 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01B361 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01B362 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01B363 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01B364 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01B365 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01B366 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01B367 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01B368 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01B369 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01B370 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01B371 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01B372 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01B373 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01B374 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01B375 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01B376 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01B377 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01B378 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01B379 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01B380 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01B381 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01B382 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01B383 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01B384 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01B385 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01B386 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01B387 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01B388 */
         pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
      }
   }

   public void processNestedLevel1B318( )
   {
      s184BarMtr = O184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      s166BarKgm = O166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      s198BarPie = O198BarPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      nGXsfl_140_idx = 0 ;
      while ( nGXsfl_140_idx < nRC_GXsfl_140 )
      {
         readRow1B318( ) ;
         if ( ( nRcdExists_18 != 0 ) || ( nIsMod_18 != 0 ) )
         {
            standaloneNotModal1B318( ) ;
            getKey1B318( ) ;
            if ( ( nRcdExists_18 == 0 ) && ( nRcdDeleted_18 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1B318( ) ;
            }
            else
            {
               if ( RcdFound18 != 0 )
               {
                  if ( ( nRcdDeleted_18 != 0 ) && ( nRcdExists_18 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1B318( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_18 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1B318( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_18 == 0 )
                  {
                     GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O184BarMtr = A184BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            O166BarKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            O198BarPie = A198BarPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_18_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod)) ;
         httpContext.changePostValue( edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt)) ;
         httpContext.changePostValue( edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc)) ;
         httpContext.changePostValue( edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProceNom_Internalname, GXutil.rtrim( A971ProceNom)) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_140_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_140_idx, GXutil.rtrim( Z908PieOriCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1501BarPiePie_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T205BarPieMet_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T203BarPieKil_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_18_"+sGXsfl_140_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_18 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_18_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_18_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieCod_Title)) ;
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtAlbRecCod_Title)) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieKil_Title)) ;
            httpContext.changePostValue( "BARPIEKIL_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEMET_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEEST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARKILLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARMETLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PIEORICOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELZD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPiePie_Title)) ;
            httpContext.changePostValue( "BARPIEPIE_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLASCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLASDSC_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCENOM_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01B390 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(85) != 101) )
      {
         A199BarPie1 = T01B390_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T01B390_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      /* End of After( level) rules */
      initAll1B318( ) ;
      if ( AnyError != 0 )
      {
         O184BarMtr = s184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         O166BarKgm = s166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         O198BarPie = s198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      nRcdExists_18 = (short)(0) ;
      nIsMod_18 = (short)(0) ;
      nRcdDeleted_18 = (short)(0) ;
   }

   public void processLevel1B312( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1B318( ) ;
      if ( AnyError != 0 )
      {
         O184BarMtr = s184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         O166BarKgm = s166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         O198BarPie = s198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11B312( )
   {
      /* Using cursor T01B391 */
      pr_default.execute(86, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1B312( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1B312( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbarpil");
         if ( AnyError == 0 )
         {
            confirmValues1B30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarpil");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1B312( )
   {
      /* Scan By routine */
      /* Using cursor T01B392 */
      pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1B312( )
   {
      /* Scan next routine */
      pr_default.readNext(87);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd1B312( )
   {
      pr_default.close(87);
   }

   public void afterConfirm1B312( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1B312( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1B312( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1B312( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1B312( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1B312( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1B312( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMat_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Enabled), 5, 0), true);
      edtBarMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), true);
      edtBarPie1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie1_Enabled), 5, 0), true);
      edtBarPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPes_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarPieNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieNDes_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
   }

   public void zm1B318( int GX_JID )
   {
      if ( ( GX_JID == 38 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z203BarPieKil = T01B33_A203BarPieKil[0] ;
            Z205BarPieMet = T01B33_A205BarPieMet[0] ;
            Z201BarPieEst = T01B33_A201BarPieEst[0] ;
            Z170BarKilLan = T01B33_A170BarKilLan[0] ;
            Z183BarMetLan = T01B33_A183BarMetLan[0] ;
            Z197BarPConTro = T01B33_A197BarPConTro[0] ;
            Z908PieOriCod = T01B33_A908PieOriCod[0] ;
            Z1271BarPieLzd = T01B33_A1271BarPieLzd[0] ;
            Z1501BarPiePie = T01B33_A1501BarPiePie[0] ;
            Z44AlbRecCod = T01B33_A44AlbRecCod[0] ;
         }
         else
         {
            Z203BarPieKil = A203BarPieKil ;
            Z205BarPieMet = A205BarPieMet ;
            Z201BarPieEst = A201BarPieEst ;
            Z170BarKilLan = A170BarKilLan ;
            Z183BarMetLan = A183BarMetLan ;
            Z197BarPConTro = A197BarPConTro ;
            Z908PieOriCod = A908PieOriCod ;
            Z1271BarPieLzd = A1271BarPieLzd ;
            Z1501BarPiePie = A1501BarPiePie ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -38 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z203BarPieKil = A203BarPieKil ;
         Z205BarPieMet = A205BarPieMet ;
         Z201BarPieEst = A201BarPieEst ;
         Z170BarKilLan = A170BarKilLan ;
         Z183BarMetLan = A183BarMetLan ;
         Z197BarPConTro = A197BarPConTro ;
         Z908PieOriCod = A908PieOriCod ;
         Z1271BarPieLzd = A1271BarPieLzd ;
         Z1501BarPiePie = A1501BarPiePie ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z47AlbREst = A47AlbREst ;
         Z46AlbREnt = A46AlbREnt ;
         Z970ProceCod = A970ProceCod ;
         Z4295ClasCod = A4295ClasCod ;
         Z971ProceNom = A971ProceNom ;
         Z4296ClasDsc = A4296ClasDsc ;
      }
   }

   public void standaloneNotModal1B318( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void standaloneModal1B318( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar F2 para dar de alta una linea", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01B34 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A60AlbRUniUti = T01B34_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01B34_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01B34_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01B34_A52AlbRPieEnt[0] ;
      A47AlbREst = T01B34_A47AlbREst[0] ;
      A46AlbREnt = T01B34_A46AlbREnt[0] ;
      A970ProceCod = T01B34_A970ProceCod[0] ;
      n970ProceCod = T01B34_n970ProceCod[0] ;
      A4295ClasCod = T01B34_A4295ClasCod[0] ;
      n4295ClasCod = T01B34_n4295ClasCod[0] ;
      pr_default.close(2);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      /* Using cursor T01B35 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            GXCCtl = "PROCECOD_" + sGXsfl_140_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
         }
      }
      A971ProceNom = T01B35_A971ProceNom[0] ;
      n971ProceNom = T01B35_n971ProceNom[0] ;
      pr_default.close(3);
      /* Using cursor T01B36 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "CLASCOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
      }
      A4296ClasDsc = T01B36_A4296ClasDsc[0] ;
      n4296ClasDsc = T01B36_n4296ClasDsc[0] ;
      pr_default.close(4);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      }
      else
      {
         edtBarPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      }
   }

   public void load1B318( )
   {
      /* Using cursor T01B393 */
      pr_default.execute(88, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A60AlbRUniUti = T01B393_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01B393_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01B393_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01B393_A52AlbRPieEnt[0] ;
         A47AlbREst = T01B393_A47AlbREst[0] ;
         A203BarPieKil = T01B393_A203BarPieKil[0] ;
         A205BarPieMet = T01B393_A205BarPieMet[0] ;
         A201BarPieEst = T01B393_A201BarPieEst[0] ;
         A170BarKilLan = T01B393_A170BarKilLan[0] ;
         A183BarMetLan = T01B393_A183BarMetLan[0] ;
         A197BarPConTro = T01B393_A197BarPConTro[0] ;
         A908PieOriCod = T01B393_A908PieOriCod[0] ;
         A1271BarPieLzd = T01B393_A1271BarPieLzd[0] ;
         A1501BarPiePie = T01B393_A1501BarPiePie[0] ;
         A46AlbREnt = T01B393_A46AlbREnt[0] ;
         A4296ClasDsc = T01B393_A4296ClasDsc[0] ;
         n4296ClasDsc = T01B393_n4296ClasDsc[0] ;
         A971ProceNom = T01B393_A971ProceNom[0] ;
         n971ProceNom = T01B393_n971ProceNom[0] ;
         A44AlbRecCod = T01B393_A44AlbRecCod[0] ;
         A970ProceCod = T01B393_A970ProceCod[0] ;
         n970ProceCod = T01B393_n970ProceCod[0] ;
         A4295ClasCod = T01B393_A4295ClasCod[0] ;
         n4295ClasCod = T01B393_n4295ClasCod[0] ;
         zm1B318( -38) ;
      }
      pr_default.close(88);
      onLoadActions1B318( ) ;
   }

   public void onLoadActions1B318( )
   {
      if ( isIns( )  )
      {
         A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
         }
      }
      AV17KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      if ( isIns( )  )
      {
         A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
         }
      }
      AV18MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
   }

   public void checkExtendedTable1B318( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1B318( ) ;
      if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta Agrupada", ""), 0, GXCCtl);
      }
      if ( ( A213BarSit > 8 ) && true /* After */ )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta cerrada", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A213BarSit == 4 ) && true /* After */ )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de Ruta con receta", ""), 0, GXCCtl);
      }
      if ( (GXutil.strcmp("", A200BarPieCod)==0) )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código de pieza nulo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_18 = (short)(1) ;
         A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_18 = (short)(1) ;
            A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_18 = (short)(1) ;
               A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
         }
      }
      AV17KilAnt = O203BarPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      if ( isIns( )  )
      {
         nIsDirty_18 = (short)(1) ;
         A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_18 = (short)(1) ;
            A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_18 = (short)(1) ;
               A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
         }
      }
      AV18MtrAnt = O205BarPieMet ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = O1501BarPiePie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      if ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt )
      {
         GXCCtl = "BARPIEPIE_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1B318( )
   {
   }

   public void enableDisable1B318( )
   {
   }

   public void getKey1B318( )
   {
      /* Using cursor T01B394 */
      pr_default.execute(89, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(89);
   }

   public void getByPrimaryKey1B318( )
   {
      /* Using cursor T01B33 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01B33_A129BarCod[0] == A129BarCod ) && ( T01B33_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01B33_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01B33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1B318( 38) ;
         RcdFound18 = (short)(1) ;
         initializeNonKey1B318( ) ;
         A200BarPieCod = T01B33_A200BarPieCod[0] ;
         A203BarPieKil = T01B33_A203BarPieKil[0] ;
         A205BarPieMet = T01B33_A205BarPieMet[0] ;
         A201BarPieEst = T01B33_A201BarPieEst[0] ;
         A170BarKilLan = T01B33_A170BarKilLan[0] ;
         A183BarMetLan = T01B33_A183BarMetLan[0] ;
         A197BarPConTro = T01B33_A197BarPConTro[0] ;
         A908PieOriCod = T01B33_A908PieOriCod[0] ;
         A1271BarPieLzd = T01B33_A1271BarPieLzd[0] ;
         A1501BarPiePie = T01B33_A1501BarPiePie[0] ;
         A44AlbRecCod = T01B33_A44AlbRecCod[0] ;
         O1501BarPiePie = A1501BarPiePie ;
         O205BarPieMet = A205BarPieMet ;
         O203BarPieKil = A203BarPieKil ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1B318( ) ;
         load1B318( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1B318( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1B318( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1B318( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1B318( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01B32 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z203BarPieKil, T01B32_A203BarPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z205BarPieMet, T01B32_A205BarPieMet[0]) != 0 ) || ( Z201BarPieEst != T01B32_A201BarPieEst[0] ) || ( DecimalUtil.compareTo(Z170BarKilLan, T01B32_A170BarKilLan[0]) != 0 ) || ( DecimalUtil.compareTo(Z183BarMetLan, T01B32_A183BarMetLan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z197BarPConTro != T01B32_A197BarPConTro[0] ) || ( GXutil.strcmp(Z908PieOriCod, T01B32_A908PieOriCod[0]) != 0 ) || ( Z1271BarPieLzd != T01B32_A1271BarPieLzd[0] ) || ( Z1501BarPiePie != T01B32_A1501BarPiePie[0] ) || ( Z44AlbRecCod != T01B32_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z203BarPieKil, T01B32_A203BarPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPieKil");
               GXutil.writeLogRaw("Old: ",Z203BarPieKil);
               GXutil.writeLogRaw("Current: ",T01B32_A203BarPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z205BarPieMet, T01B32_A205BarPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPieMet");
               GXutil.writeLogRaw("Old: ",Z205BarPieMet);
               GXutil.writeLogRaw("Current: ",T01B32_A205BarPieMet[0]);
            }
            if ( Z201BarPieEst != T01B32_A201BarPieEst[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPieEst");
               GXutil.writeLogRaw("Old: ",Z201BarPieEst);
               GXutil.writeLogRaw("Current: ",T01B32_A201BarPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z170BarKilLan, T01B32_A170BarKilLan[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarKilLan");
               GXutil.writeLogRaw("Old: ",Z170BarKilLan);
               GXutil.writeLogRaw("Current: ",T01B32_A170BarKilLan[0]);
            }
            if ( DecimalUtil.compareTo(Z183BarMetLan, T01B32_A183BarMetLan[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarMetLan");
               GXutil.writeLogRaw("Old: ",Z183BarMetLan);
               GXutil.writeLogRaw("Current: ",T01B32_A183BarMetLan[0]);
            }
            if ( Z197BarPConTro != T01B32_A197BarPConTro[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01B32_A197BarPConTro[0]);
            }
            if ( GXutil.strcmp(Z908PieOriCod, T01B32_A908PieOriCod[0]) != 0 )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"PieOriCod");
               GXutil.writeLogRaw("Old: ",Z908PieOriCod);
               GXutil.writeLogRaw("Current: ",T01B32_A908PieOriCod[0]);
            }
            if ( Z1271BarPieLzd != T01B32_A1271BarPieLzd[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPieLzd");
               GXutil.writeLogRaw("Old: ",Z1271BarPieLzd);
               GXutil.writeLogRaw("Current: ",T01B32_A1271BarPieLzd[0]);
            }
            if ( Z1501BarPiePie != T01B32_A1501BarPiePie[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"BarPiePie");
               GXutil.writeLogRaw("Old: ",Z1501BarPiePie);
               GXutil.writeLogRaw("Current: ",T01B32_A1501BarPiePie[0]);
            }
            if ( Z44AlbRecCod != T01B32_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tbarpil:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01B32_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1B318( )
   {
      beforeValidate1B318( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B318( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1B318( 0) ;
         checkOptimisticConcurrency1B318( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B318( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1B318( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B395 */
                  pr_default.execute(90, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod, A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(90) == 1) )
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
            load1B318( ) ;
         }
         endLevel1B318( ) ;
      }
      closeExtendedTableCursors1B318( ) ;
   }

   public void update1B318( )
   {
      beforeValidate1B318( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B318( ) ;
      }
      if ( ( nIsMod_18 != 0 ) || ( nIsDirty_18 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1B318( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1B318( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1B318( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01B396 */
                     pr_default.execute(91, new Object[] {A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                     if ( (pr_default.getStatus(91) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1B318( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A129BarCod ;
                        GXv_int6[0] = A132BarCodReo ;
                        GXv_char3[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3) ;
                        tbarpil_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbarpil_impl.this.A129BarCod = GXv_int5[0] ;
                        tbarpil_impl.this.A132BarCodReo = GXv_int6[0] ;
                        tbarpil_impl.this.A130BarCodPar = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        if ( true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int5[0] = A361DisCod ;
                           GXv_int7[0] = A44AlbRecCod ;
                           GXv_char3[0] = A200BarPieCod ;
                           GXv_decimal8[0] = A203BarPieKil ;
                           GXv_decimal9[0] = AV17KilAnt ;
                           GXv_decimal10[0] = A205BarPieMet ;
                           GXv_decimal11[0] = AV18MtrAnt ;
                           GXv_int12[0] = A1501BarPiePie ;
                           GXv_int13[0] = AV19BarPieAnt ;
                           GXv_char2[0] = httpContext.getMessage( "N", "") ;
                           new app.pmodpdi2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int7, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int12, GXv_int13, GXv_char2) ;
                           tbarpil_impl.this.A396EmprCod = GXv_char4[0] ;
                           tbarpil_impl.this.A361DisCod = GXv_int5[0] ;
                           tbarpil_impl.this.A44AlbRecCod = GXv_int7[0] ;
                           tbarpil_impl.this.A200BarPieCod = GXv_char3[0] ;
                           tbarpil_impl.this.A203BarPieKil = GXv_decimal8[0] ;
                           tbarpil_impl.this.AV17KilAnt = GXv_decimal9[0] ;
                           tbarpil_impl.this.A205BarPieMet = GXv_decimal10[0] ;
                           tbarpil_impl.this.AV18MtrAnt = GXv_decimal11[0] ;
                           tbarpil_impl.this.A1501BarPiePie = GXv_int12[0] ;
                           tbarpil_impl.this.AV19BarPieAnt = GXv_int13[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
                           httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1B318( ) ;
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
            endLevel1B318( ) ;
         }
      }
      closeExtendedTableCursors1B318( ) ;
   }

   public void deferredUpdate1B318( )
   {
   }

   public void delete1B318( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1B318( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B318( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1B318( ) ;
         afterConfirm1B318( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1B318( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01B397 */
               pr_default.execute(92, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1B318( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1B318( )
   {
      standaloneModal1B318( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A166BarKgm = O166BarKgm.add(A203BarPieKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A166BarKgm = O166BarKgm.add(A203BarPieKil).subtract(O203BarPieKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A166BarKgm = O166BarKgm.subtract(O203BarPieKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               }
            }
         }
         AV17KilAnt = O203BarPieKil ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
         if ( isIns( )  )
         {
            A184BarMtr = O184BarMtr.add(A205BarPieMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A184BarMtr = O184BarMtr.add(A205BarPieMet).subtract(O205BarPieMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A184BarMtr = O184BarMtr.subtract(O205BarPieMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
               }
            }
         }
         AV18MtrAnt = O205BarPieMet ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
         AV19BarPieAnt = O1501BarPiePie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01B398 */
         pr_default.execute(93, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T01B399 */
         pr_default.execute(94, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T01B3100 */
         pr_default.execute(95, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
      }
   }

   public void endLevel1B318( )
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

   public void scanStart1B318( )
   {
      /* Scan By routine */
      /* Using cursor T01B3101 */
      pr_default.execute(96, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01B3101_A200BarPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1B318( )
   {
      /* Scan next routine */
      pr_default.readNext(96);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(96) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01B3101_A200BarPieCod[0] ;
      }
   }

   public void scanEnd1B318( )
   {
      pr_default.close(96);
   }

   public void afterConfirm1B318( )
   {
      /* After Confirm Rules */
      if ( isDlt( )  && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A361DisCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A200BarPieCod ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         GXv_decimal11[0] = A203BarPieKil ;
         GXv_decimal10[0] = A205BarPieMet ;
         GXv_int7[0] = A1501BarPiePie ;
         new app.pdelpdi2(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int12, GXv_char3, GXv_char2, GXv_decimal11, GXv_decimal10, GXv_int7) ;
         tbarpil_impl.this.A396EmprCod = GXv_char4[0] ;
         tbarpil_impl.this.A361DisCod = GXv_int13[0] ;
         tbarpil_impl.this.A44AlbRecCod = GXv_int12[0] ;
         tbarpil_impl.this.A200BarPieCod = GXv_char3[0] ;
         tbarpil_impl.this.A203BarPieKil = GXv_decimal11[0] ;
         tbarpil_impl.this.A205BarPieMet = GXv_decimal10[0] ;
         tbarpil_impl.this.A1501BarPiePie = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void beforeInsert1B318( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1B318( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1B318( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1B318( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1B318( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1B318( )
   {
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtPieOriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPieLzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtClasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), !bGXsfl_140_Refreshing);
   }

   public void send_integrity_lvl_hashes1B318( )
   {
   }

   public void send_integrity_lvl_hashes1B312( )
   {
   }

   public void subsflControlProps_14018( )
   {
      edtavnRcdDeleted_18_Internalname = "vNRCDDELETED_18_"+sGXsfl_140_idx ;
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_140_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_140_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_140_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_140_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_140_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_140_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_140_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_140_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_140_idx );
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_140_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_140_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_140_idx ;
      edtBarKilLan_Internalname = "BARKILLAN_"+sGXsfl_140_idx ;
      edtBarMetLan_Internalname = "BARMETLAN_"+sGXsfl_140_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_140_idx ;
      edtPieOriCod_Internalname = "PIEORICOD_"+sGXsfl_140_idx ;
      edtBarPieLzd_Internalname = "BARPIELZD_"+sGXsfl_140_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_140_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_140_idx ;
      edtClasCod_Internalname = "CLASCOD_"+sGXsfl_140_idx ;
      edtClasDsc_Internalname = "CLASDSC_"+sGXsfl_140_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_140_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_140_idx ;
   }

   public void subsflControlProps_fel_14018( )
   {
      edtavnRcdDeleted_18_Internalname = "vNRCDDELETED_18_"+sGXsfl_140_fel_idx ;
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_140_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_140_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_140_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_140_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_140_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_140_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_140_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_140_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_140_fel_idx );
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_140_fel_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_140_fel_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_140_fel_idx ;
      edtBarKilLan_Internalname = "BARKILLAN_"+sGXsfl_140_fel_idx ;
      edtBarMetLan_Internalname = "BARMETLAN_"+sGXsfl_140_fel_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_140_fel_idx ;
      edtPieOriCod_Internalname = "PIEORICOD_"+sGXsfl_140_fel_idx ;
      edtBarPieLzd_Internalname = "BARPIELZD_"+sGXsfl_140_fel_idx ;
      edtBarPiePie_Internalname = "BARPIEPIE_"+sGXsfl_140_fel_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_140_fel_idx ;
      edtClasCod_Internalname = "CLASCOD_"+sGXsfl_140_fel_idx ;
      edtClasDsc_Internalname = "CLASDSC_"+sGXsfl_140_fel_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_140_fel_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_140_fel_idx ;
   }

   public void addRow1B318( )
   {
      nGXsfl_140_idx = (int)(nGXsfl_140_idx+1) ;
      sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_14018( ) ;
      sendRow1B318( ) ;
   }

   public void sendRow1B318( )
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
         if ( ((int)((nGXsfl_140_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_18_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_18_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_18), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_18), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_18_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,142);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_140_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_140_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieKil_Enabled!=0) ? localUtil.format( A203BarPieKil, "ZZZZZ9.99") : localUtil.format( A203BarPieKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,151);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieMet_Enabled!=0) ? localUtil.format( A205BarPieMet, "ZZZZZ9.99") : localUtil.format( A205BarPieMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,152);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,153);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKilLan_Internalname,GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarKilLan_Enabled!=0) ? localUtil.format( A170BarKilLan, "ZZZZZ9.99") : localUtil.format( A170BarKilLan, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKilLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarKilLan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMetLan_Internalname,GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarMetLan_Enabled!=0) ? localUtil.format( A183BarMetLan, "ZZZZZ9.99") : localUtil.format( A183BarMetLan, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,155);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMetLan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarMetLan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 156,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPConTro_Internalname,GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPConTro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPConTro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPieOriCod_Internalname,GXutil.rtrim( A908PieOriCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPieOriCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPieOriCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieLzd_Internalname,GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieLzd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieLzd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieLzd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_18_" + sGXsfl_140_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 159,'',false,'" + sGXsfl_140_idx + "',140)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPiePie_Internalname,GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPiePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPiePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbREnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtClasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClasCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClasDsc_Internalname,GXutil.rtrim( A4296ClasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtClasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceCod_Internalname,GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProceCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProceNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(140),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1B318( ) ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z200BarPieCod));
      GXCCtl = "Z203BarPieKil_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z205BarPieMet_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z201BarPieEst_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z170BarKilLan_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z183BarMetLan_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z197BarPConTro_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z908PieOriCod_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z908PieOriCod));
      GXCCtl = "Z1271BarPieLzd_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1501BarPiePie_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1501BarPiePie_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O205BarPieMet_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O203BarPieKil_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_18_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_18_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_18_" + sGXsfl_140_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_18, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_18_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_18_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtAlbRecCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPieKil_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEMET_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKILLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMETLAN_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPCONTRO_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEORICOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELZD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEPIE_"+sGXsfl_140_idx+"Title", GXutil.rtrim( edtBarPiePie_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEPIE_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRENT_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLASCOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLASDSC_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtClasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCECOD_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCENOM_"+sGXsfl_140_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProceNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1B318( )
   {
      nGXsfl_140_idx = (int)(nGXsfl_140_idx+1) ;
      sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_14018( ) ;
      edtavnRcdDeleted_18_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_18_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieCod_Title = httpContext.cgiGet( "BARPIECOD_"+sGXsfl_140_idx+"Title") ;
      edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCod_Title = httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_140_idx+"Title") ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIDIS_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBREST_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtBarPieKil_Title = httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_140_idx+"Title") ;
      edtBarPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEKIL_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEMET_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEEST_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarKilLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARKILLAN_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarMetLan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARMETLAN_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPieOriCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PIEORICOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieLzd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELZD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPiePie_Title = httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_140_idx+"Title") ;
      edtBarPiePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEPIE_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbREnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRENT_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLASCOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtClasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLASDSC_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProceCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCECOD_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProceNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCENOM_"+sGXsfl_140_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_18_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_18_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_18");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_18_Internalname ;
         wbErr = true ;
         nRcdDeleted_18 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_18 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_18_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
      A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbREst.setName( cmbAlbREst.getInternalname() );
      cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
      A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEKIL_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
         wbErr = true ;
         A203BarPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEMET_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieMet_Internalname ;
         wbErr = true ;
         A205BarPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARPIEEST_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieEst_Internalname ;
         wbErr = true ;
         A201BarPieEst = (byte)(0) ;
      }
      else
      {
         A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARKILLAN_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarKilLan_Internalname ;
         wbErr = true ;
         A170BarKilLan = DecimalUtil.ZERO ;
      }
      else
      {
         A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARMETLAN_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarMetLan_Internalname ;
         wbErr = true ;
         A183BarMetLan = DecimalUtil.ZERO ;
      }
      else
      {
         A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "BARPCONTRO_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPConTro_Internalname ;
         wbErr = true ;
         A197BarPConTro = (short)(0) ;
      }
      else
      {
         A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A908PieOriCod = httpContext.cgiGet( edtPieOriCod_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARPIELZD_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieLzd_Internalname ;
         wbErr = true ;
         A1271BarPieLzd = 0 ;
      }
      else
      {
         A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARPIEPIE_" + sGXsfl_140_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
         wbErr = true ;
         A1501BarPiePie = 0 ;
      }
      else
      {
         A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
      A4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n4295ClasCod = false ;
      A4296ClasDsc = httpContext.cgiGet( edtClasDsc_Internalname) ;
      n4296ClasDsc = false ;
      A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n970ProceCod = false ;
      A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
      n971ProceNom = false ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_140_idx ;
      Z200BarPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z203BarPieKil_" + sGXsfl_140_idx ;
      Z203BarPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z205BarPieMet_" + sGXsfl_140_idx ;
      Z205BarPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z201BarPieEst_" + sGXsfl_140_idx ;
      Z201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z170BarKilLan_" + sGXsfl_140_idx ;
      Z170BarKilLan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z183BarMetLan_" + sGXsfl_140_idx ;
      Z183BarMetLan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z197BarPConTro_" + sGXsfl_140_idx ;
      Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z908PieOriCod_" + sGXsfl_140_idx ;
      Z908PieOriCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1271BarPieLzd_" + sGXsfl_140_idx ;
      Z1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1501BarPiePie_" + sGXsfl_140_idx ;
      Z1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_140_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1501BarPiePie_" + sGXsfl_140_idx ;
      O1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O205BarPieMet_" + sGXsfl_140_idx ;
      O205BarPieMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O203BarPieKil_" + sGXsfl_140_idx ;
      O203BarPieKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_18_" + sGXsfl_140_idx ;
      nRcdDeleted_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_18_" + sGXsfl_140_idx ;
      nRcdExists_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_18_" + sGXsfl_140_idx ;
      nIsMod_18 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecCod_Enabled = edtAlbRecCod_Enabled ;
      defedtBarPieCod_Enabled = edtBarPieCod_Enabled ;
   }

   public void confirmValues1B30( )
   {
      nGXsfl_140_idx = 0 ;
      sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_14018( ) ;
      while ( nGXsfl_140_idx < nRC_GXsfl_140 )
      {
         nGXsfl_140_idx = (int)(nGXsfl_140_idx+1) ;
         sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_14018( ) ;
         httpContext.changePostValue( "Z200BarPieCod_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z200BarPieCod_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z203BarPieKil_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z203BarPieKil_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z203BarPieKil_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z205BarPieMet_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z205BarPieMet_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z205BarPieMet_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z201BarPieEst_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z201BarPieEst_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z201BarPieEst_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z170BarKilLan_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z170BarKilLan_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z170BarKilLan_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z183BarMetLan_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z183BarMetLan_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z183BarMetLan_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z197BarPConTro_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z197BarPConTro_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z908PieOriCod_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z908PieOriCod_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z908PieOriCod_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z1271BarPieLzd_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1271BarPieLzd_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z1501BarPiePie_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z1501BarPiePie_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1501BarPiePie_"+sGXsfl_140_idx) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_140_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_140_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_140_idx) ;
      }
      httpContext.changePostValue( "O1501BarPiePie", httpContext.cgiGet( "T1501BarPiePie")) ;
      httpContext.deletePostValue( "T1501BarPiePie") ;
      httpContext.changePostValue( "O205BarPieMet", httpContext.cgiGet( "T205BarPieMet")) ;
      httpContext.deletePostValue( "T205BarPieMet") ;
      httpContext.changePostValue( "O203BarPieKil", httpContext.cgiGet( "T203BarPieKil")) ;
      httpContext.deletePostValue( "T203BarPieKil") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbarpil", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARPIL");
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      forbiddenHiddens.add("BarMat", GXutil.rtrim( localUtil.format( A182BarMat, "")));
      forbiddenHiddens.add("BarColNom", GXutil.rtrim( localUtil.format( A135BarColNom, "")));
      forbiddenHiddens.add("BarColNum", localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"));
      forbiddenHiddens.add("BarPes", localUtil.format( DecimalUtil.doubleToDec(A864BarPes), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbarpil:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z182BarMat", GXutil.rtrim( Z182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z864BarPes", GXutil.ltrim( localUtil.ntoc( Z864BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O184BarMtr", GXutil.ltrim( localUtil.ntoc( O184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O166BarKgm", GXutil.ltrim( localUtil.ntoc( O166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_140", GXutil.ltrim( localUtil.ntoc( nGXsfl_140_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT12", GXutil.rtrim( AV33Lit12));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT13", GXutil.rtrim( AV34Lit13));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT14", GXutil.rtrim( AV35Lit14));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT16", GXutil.rtrim( AV37Lit16));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV17KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRANT", GXutil.ltrim( localUtil.ntoc( AV18MtrAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIEANT", GXutil.ltrim( localUtil.ntoc( AV19BarPieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tbarpil", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TBARPIL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO PIEZAS LAVANDERIAS", "") ;
   }

   public void initializeNonKey1B312( )
   {
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A182BarMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", A182BarMat);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A864BarPes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A864BarPes), 4, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O184BarMtr = A184BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
      O166BarKgm = A166BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z218BarTipCol = (byte)(0) ;
      Z864BarPes = (short)(0) ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z1652BarSerDsc = "" ;
      Z361DisCod = 0 ;
   }

   public void initAll1B312( )
   {
      initializeNonKey1B312( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1B318( )
   {
      AV17KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
      AV18MtrAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
      AV19BarPieAnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A44AlbRecCod = 0 ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A47AlbREst = (byte)(0) ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A201BarPieEst = (byte)(0) ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A197BarPConTro = (short)(0) ;
      A908PieOriCod = "" ;
      A1271BarPieLzd = 0 ;
      A1501BarPiePie = 0 ;
      A46AlbREnt = "" ;
      A4295ClasCod = (short)(0) ;
      n4295ClasCod = false ;
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      A971ProceNom = "" ;
      n971ProceNom = false ;
      O1501BarPiePie = A1501BarPiePie ;
      O205BarPieMet = A205BarPieMet ;
      O203BarPieKil = A203BarPieKil ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z201BarPieEst = (byte)(0) ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z197BarPConTro = (short)(0) ;
      Z908PieOriCod = "" ;
      Z1271BarPieLzd = 0 ;
      Z1501BarPiePie = 0 ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1B318( )
   {
      A200BarPieCod = "" ;
      initializeNonKey1B318( ) ;
   }

   public void standaloneModalInsert1B318( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415797", true, true);
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
      httpContext.AddJavascriptSource("tbarpil.js", "?202682415797", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties18( )
   {
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
      edtBarPieCod_Enabled = defedtBarPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_140_Refreshing);
   }

   public void startgridcontrol140( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_18, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_18_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtBarPieCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtAlbRecCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtBarPieKil_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarKilLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarMetLan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A908PieOriCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPieOriCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLzd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtBarPiePie_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPiePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4296ClasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtClasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProceCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProceNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarMat_Internalname = "BARMAT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarKgm_Internalname = "BARKGM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarMtr_Internalname = "BARMTR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarPie_Internalname = "BARPIE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarPie1_Internalname = "BARPIE1" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarPes_Internalname = "BARPES" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarPieNDes_Internalname = "BARPIENDES" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtavnRcdDeleted_18_Internalname = "vNRCDDELETED_18" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPieEst_Internalname = "BARPIEEST" ;
      edtBarKilLan_Internalname = "BARKILLAN" ;
      edtBarMetLan_Internalname = "BARMETLAN" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      edtPieOriCod_Internalname = "PIEORICOD" ;
      edtBarPieLzd_Internalname = "BARPIELZD" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      edtClasCod_Internalname = "CLASCOD" ;
      edtClasDsc_Internalname = "CLASDSC" ;
      edtProceCod_Internalname = "PROCECOD" ;
      edtProceNom_Internalname = "PROCENOM" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO PIEZAS LAVANDERIAS", "") );
      edtProceNom_Jsonclick = "" ;
      edtProceCod_Jsonclick = "" ;
      edtClasDsc_Jsonclick = "" ;
      edtClasCod_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPieLzd_Jsonclick = "" ;
      edtPieOriCod_Jsonclick = "" ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarKilLan_Jsonclick = "" ;
      edtBarPieEst_Jsonclick = "" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieKil_Jsonclick = "" ;
      cmbAlbREst.setJsonclick( "" );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      edtavnRcdDeleted_18_Jsonclick = "" ;
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
      edtProceNom_Enabled = 0 ;
      edtProceCod_Enabled = 0 ;
      edtClasDsc_Enabled = 0 ;
      edtClasCod_Enabled = 0 ;
      edtAlbREnt_Enabled = 0 ;
      edtBarPiePie_Enabled = 1 ;
      edtBarPiePie_Title = httpContext.getMessage( "Piezas no desglose", "") ;
      edtBarPieLzd_Enabled = 1 ;
      edtPieOriCod_Enabled = 1 ;
      edtBarPConTro_Enabled = 1 ;
      edtBarMetLan_Enabled = 1 ;
      edtBarKilLan_Enabled = 1 ;
      edtBarPieEst_Enabled = 1 ;
      edtBarPieMet_Enabled = 1 ;
      edtBarPieKil_Enabled = 1 ;
      edtBarPieKil_Title = httpContext.getMessage( "Kilos", "") ;
      cmbAlbREst.setEnabled( 0 );
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRecCod_Enabled = 0 ;
      edtAlbRecCod_Title = httpContext.getMessage( "N Recepcion ID", "") ;
      edtBarPieCod_Enabled = 1 ;
      edtBarPieCod_Title = httpContext.getMessage( "Codigo Pieza", "") ;
      edtavnRcdDeleted_18_Enabled = 1 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtBarSerDsc_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarPieNDes_Jsonclick = "" ;
      edtBarPieNDes_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieNDes_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 1 ;
      edtBarPes_Jsonclick = "" ;
      edtBarPes_Backcolor = (int)(0xFFFFFF) ;
      edtBarPes_Enabled = 0 ;
      edtBarPie1_Jsonclick = "" ;
      edtBarPie1_Backcolor = (int)(0xFFFFFF) ;
      edtBarPie1_Enabled = 0 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Backcolor = (int)(0xFFFFFF) ;
      edtBarPie_Enabled = 0 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtDisUniMed_Enabled = 0 ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Backcolor = (int)(0xFFFFFF) ;
      edtBarMtr_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Backcolor = (int)(0xFFFFFF) ;
      edtBarKgm_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 1 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarMat_Jsonclick = "" ;
      edtBarMat_Backcolor = (int)(0xFFFFFF) ;
      edtBarMat_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 0 ;
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

   public void xc_31_1B318( )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A361DisCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A200BarPieCod ;
         GXv_decimal11[0] = A203BarPieKil ;
         GXv_decimal10[0] = AV17KilAnt ;
         GXv_decimal9[0] = A205BarPieMet ;
         GXv_decimal8[0] = AV18MtrAnt ;
         GXv_int7[0] = A1501BarPiePie ;
         GXv_int5[0] = AV19BarPieAnt ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         new app.pmodpdi2(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int12, GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_int7, GXv_int5, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A361DisCod = GXv_int13[0] ;
         A44AlbRecCod = GXv_int12[0] ;
         A200BarPieCod = GXv_char3[0] ;
         A203BarPieKil = GXv_decimal11[0] ;
         AV17KilAnt = GXv_decimal10[0] ;
         A205BarPieMet = GXv_decimal9[0] ;
         AV18MtrAnt = GXv_decimal8[0] ;
         A1501BarPiePie = GXv_int7[0] ;
         AV19BarPieAnt = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrimstr( AV17KilAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrimstr( AV18MtrAnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarPieAnt), 6, 0));
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

   public void xc_32_1B318( )
   {
      if ( isDlt( )  && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int13[0] = A361DisCod ;
         GXv_int12[0] = A44AlbRecCod ;
         GXv_char3[0] = A200BarPieCod ;
         GXv_char2[0] = httpContext.getMessage( "N", "") ;
         GXv_decimal11[0] = A203BarPieKil ;
         GXv_decimal10[0] = A205BarPieMet ;
         GXv_int7[0] = A1501BarPiePie ;
         new app.pdelpdi2(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_int12, GXv_char3, GXv_char2, GXv_decimal11, GXv_decimal10, GXv_int7) ;
         A396EmprCod = GXv_char4[0] ;
         A361DisCod = GXv_int13[0] ;
         A44AlbRecCod = GXv_int12[0] ;
         A200BarPieCod = GXv_char3[0] ;
         A203BarPieKil = GXv_decimal11[0] ;
         A205BarPieMet = GXv_decimal10[0] ;
         A1501BarPiePie = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
      subsflControlProps_14018( ) ;
      while ( nGXsfl_140_idx <= nRC_GXsfl_140 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1B318( ) ;
         standaloneModal1B318( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1B318( ) ;
         nGXsfl_140_idx = (int)(nGXsfl_140_idx+1) ;
         sGXsfl_140_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_140_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_14018( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "ALBREST_" + sGXsfl_140_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01B3102 */
      pr_default.execute(97, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(97) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01B3102_A407EmprNom[0] ;
      n407EmprNom = T01B3102_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(97);
      /* Using cursor T01B390 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(85) != 101) )
      {
         A199BarPie1 = T01B390_A199BarPie1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = T01B390_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      }
      pr_default.close(85);
      GX_FocusControl = edtBarTipCol_Internalname ;
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
      n4295ClasCod = false ;
      n970ProceCod = false ;
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A182BarMat", GXutil.rtrim( A182BarMat));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A864BarPes", GXutil.ltrim( localUtil.ntoc( A864BarPes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z182BarMat", GXutil.rtrim( Z182BarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z166BarKgm", GXutil.ltrim( localUtil.ntoc( Z166BarKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z184BarMtr", GXutil.ltrim( localUtil.ntoc( Z184BarMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z199BarPie1", GXutil.ltrim( localUtil.ntoc( Z199BarPie1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z864BarPes", GXutil.ltrim( localUtil.ntoc( Z864BarPes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z898BarPieNDes", GXutil.ltrim( localUtil.ntoc( Z898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z198BarPie", GXutil.ltrim( localUtil.ntoc( Z198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O184BarMtr", GXutil.ltrim( localUtil.ntoc( O184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O166BarKgm", GXutil.ltrim( localUtil.ntoc( O166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n396EmprCod = false ;
      n252CliCod = false ;
      /* Using cursor T01B325 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01B325_A279CliNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Discod( )
   {
      n396EmprCod = false ;
      n252CliCod = false ;
      /* Using cursor T01B324 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      A252CliCod = T01B324_A252CliCod[0] ;
      n252CliCod = T01B324_n252CliCod[0] ;
      A392DisUniMed = T01B324_A392DisUniMed[0] ;
      A365DisDes = T01B324_A365DisDes[0] ;
      pr_default.close(20);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Barpiekil( )
   {
      AV17KilAnt = O203BarPieKil ;
      if ( DecimalUtil.compareTo((A60AlbRUniUti.subtract(O203BarPieKil).add(A203BarPieKil)), A58AlbRUniEnt) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades dispuestas superior a la disponible", ""), 1, "BARPIEKIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieKil_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV17KilAnt", GXutil.ltrim( localUtil.ntoc( AV17KilAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Barpiemet( )
   {
      AV18MtrAnt = O205BarPieMet ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18MtrAnt", GXutil.ltrim( localUtil.ntoc( AV18MtrAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Barpiepie( )
   {
      AV19BarPieAnt = O1501BarPiePie ;
      if ( ( A54AlbRPieUti - O1501BarPiePie + A1501BarPiePie ) > A52AlbRPieEnt )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas dispuestas superior a la disponible", ""), 1, "BARPIEPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPiePie_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarPieAnt", GXutil.ltrim( localUtil.ntoc( AV19BarPieAnt, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ALTA PIEZA'","{handler:'e121B32',iparms:[{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'ALTA PIEZA'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'MODIFICAR TIPO PIEZA'","{handler:'e131B32',iparms:[{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("'MODIFICAR TIPO PIEZA'",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV33Lit12',fld:'vLIT12',pic:''},{av:'AV34Lit13',fld:'vLIT13',pic:''},{av:'AV35Lit14',fld:'vLIT14',pic:''},{av:'AV37Lit16',fld:'vLIT16',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A182BarMat',fld:'BARMAT',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A864BarPes',fld:'BARPES',pic:'ZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z143BarDisNum'},{av:'Z212BarSer'},{av:'Z182BarMat'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z361DisCod'},{av:'Z166BarKgm'},{av:'Z184BarMtr'},{av:'Z199BarPie1'},{av:'Z864BarPes'},{av:'Z213BarSit'},{av:'Z898BarPieNDes'},{av:'Z120BarAgrEst'},{av:'Z407EmprNom'},{av:'Z1652BarSerDsc'},{av:'Z252CliCod'},{av:'Z392DisUniMed'},{av:'Z365DisDes'},{av:'Z279CliNom'},{av:'Z198BarPie'},{av:'O184BarMtr'},{av:'O166BarKgm'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_BARPIE1","{handler:'valid_Barpie1',iparms:[]");
      setEventMetadata("VALID_BARPIE1",",oparms:[]}");
      setEventMetadata("VALID_BARPIENDES","{handler:'valid_Barpiendes',iparms:[]");
      setEventMetadata("VALID_BARPIENDES",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_BARPIEKIL","{handler:'valid_Barpiekil',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O203BarPieKil'},{av:'O166BarKgm'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV17KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARPIEKIL",",oparms:[{av:'AV17KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPIEMET","{handler:'valid_Barpiemet',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O205BarPieMet'},{av:'O184BarMtr'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'AV18MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARPIEMET",",oparms:[{av:'AV18MtrAnt',fld:'vMTRANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPIEPIE","{handler:'valid_Barpiepie',iparms:[{av:'O1501BarPiePie'},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV19BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARPIEPIE",",oparms:[{av:'AV19BarPieAnt',fld:'vBARPIEANT',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_CLASCOD","{handler:'valid_Clascod',iparms:[]");
      setEventMetadata("VALID_CLASCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Procenom',iparms:[]");
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
      pr_default.close(97);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(85);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z143BarDisNum = "" ;
      Z212BarSer = "" ;
      Z182BarMat = "" ;
      Z135BarColNom = "" ;
      Z120BarAgrEst = "" ;
      Z1652BarSerDsc = "" ;
      O184BarMtr = DecimalUtil.ZERO ;
      O166BarKgm = DecimalUtil.ZERO ;
      Z200BarPieCod = "" ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z908PieOriCod = "" ;
      O205BarPieMet = DecimalUtil.ZERO ;
      O203BarPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A365DisDes = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A143BarDisNum = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      A182BarMat = "" ;
      lblTextblock10_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A392DisUniMed = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock23_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock24_Jsonclick = "" ;
      A1652BarSerDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B184BarMtr = DecimalUtil.ZERO ;
      B166BarKgm = DecimalUtil.ZERO ;
      sMode18 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      AV33Lit12 = "" ;
      AV34Lit13 = "" ;
      AV35Lit14 = "" ;
      AV37Lit16 = "" ;
      AV17KilAnt = DecimalUtil.ZERO ;
      AV18MtrAnt = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      s184BarMtr = DecimalUtil.ZERO ;
      s166BarKgm = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A200BarPieCod = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A908PieOriCod = "" ;
      A46AlbREnt = "" ;
      A4296ClasDsc = "" ;
      A971ProceNom = "" ;
      T205BarPieMet = DecimalUtil.ZERO ;
      T203BarPieKil = DecimalUtil.ZERO ;
      T01B38_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B38_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B38_A199BarPie1 = new short[1] ;
      T01B38_A898BarPieNDes = new int[1] ;
      AV40LitFe = "" ;
      AV21Lit0 = "" ;
      AV22Lit1 = "" ;
      AV23Lit2 = "" ;
      AV24Lit3 = "" ;
      AV25Lit4 = "" ;
      AV26Lit5 = "" ;
      AV27Lit6 = "" ;
      AV28Lit7 = "" ;
      AV29Lit8 = "" ;
      AV30Lit9 = "" ;
      AV31Lit10 = "" ;
      AV32Lit11 = "" ;
      AV36Lit15 = "" ;
      AV38Lit17 = "" ;
      AV41lit18 = "" ;
      AV48Lit21 = "" ;
      GXt_char1 = "" ;
      AV42Station = "" ;
      AV43EmprCod = "" ;
      AV44EmprNom = "" ;
      AV39UsurCod = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z166BarKgm = DecimalUtil.ZERO ;
      Z184BarMtr = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z279CliNom = "" ;
      T01B311_A407EmprNom = new String[] {""} ;
      T01B311_n407EmprNom = new boolean[] {false} ;
      T01B315_A2759BarMaqGru = new String[] {""} ;
      T01B315_A129BarCod = new int[1] ;
      T01B315_n129BarCod = new boolean[] {false} ;
      T01B315_A132BarCodReo = new byte[1] ;
      T01B315_n132BarCodReo = new boolean[] {false} ;
      T01B315_A130BarCodPar = new String[] {""} ;
      T01B315_n130BarCodPar = new boolean[] {false} ;
      T01B315_A180BarMaqCod = new String[] {""} ;
      T01B315_A143BarDisNum = new String[] {""} ;
      T01B315_A252CliCod = new int[1] ;
      T01B315_n252CliCod = new boolean[] {false} ;
      T01B315_A279CliNom = new String[] {""} ;
      T01B315_A212BarSer = new String[] {""} ;
      T01B315_A182BarMat = new String[] {""} ;
      T01B315_A135BarColNom = new String[] {""} ;
      T01B315_A136BarColNum = new int[1] ;
      T01B315_A218BarTipCol = new byte[1] ;
      T01B315_A392DisUniMed = new String[] {""} ;
      T01B315_A864BarPes = new short[1] ;
      T01B315_A213BarSit = new byte[1] ;
      T01B315_A120BarAgrEst = new String[] {""} ;
      T01B315_A407EmprNom = new String[] {""} ;
      T01B315_n407EmprNom = new boolean[] {false} ;
      T01B315_A1652BarSerDsc = new String[] {""} ;
      T01B315_A365DisDes = new String[] {""} ;
      T01B315_A396EmprCod = new String[] {""} ;
      T01B315_n396EmprCod = new boolean[] {false} ;
      T01B315_A361DisCod = new int[1] ;
      T01B315_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B315_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B315_A199BarPie1 = new short[1] ;
      T01B315_A898BarPieNDes = new int[1] ;
      T01B312_A252CliCod = new int[1] ;
      T01B312_n252CliCod = new boolean[] {false} ;
      T01B312_A392DisUniMed = new String[] {""} ;
      T01B312_A365DisDes = new String[] {""} ;
      T01B313_A279CliNom = new String[] {""} ;
      T01B316_A252CliCod = new int[1] ;
      T01B316_n252CliCod = new boolean[] {false} ;
      T01B316_A392DisUniMed = new String[] {""} ;
      T01B316_A365DisDes = new String[] {""} ;
      T01B317_A279CliNom = new String[] {""} ;
      T01B318_A396EmprCod = new String[] {""} ;
      T01B318_n396EmprCod = new boolean[] {false} ;
      T01B318_A129BarCod = new int[1] ;
      T01B318_n129BarCod = new boolean[] {false} ;
      T01B318_A132BarCodReo = new byte[1] ;
      T01B318_n132BarCodReo = new boolean[] {false} ;
      T01B318_A130BarCodPar = new String[] {""} ;
      T01B318_n130BarCodPar = new boolean[] {false} ;
      T01B310_A2759BarMaqGru = new String[] {""} ;
      T01B310_A129BarCod = new int[1] ;
      T01B310_n129BarCod = new boolean[] {false} ;
      T01B310_A132BarCodReo = new byte[1] ;
      T01B310_n132BarCodReo = new boolean[] {false} ;
      T01B310_A130BarCodPar = new String[] {""} ;
      T01B310_n130BarCodPar = new boolean[] {false} ;
      T01B310_A180BarMaqCod = new String[] {""} ;
      T01B310_A143BarDisNum = new String[] {""} ;
      T01B310_A212BarSer = new String[] {""} ;
      T01B310_A182BarMat = new String[] {""} ;
      T01B310_A135BarColNom = new String[] {""} ;
      T01B310_A136BarColNum = new int[1] ;
      T01B310_A218BarTipCol = new byte[1] ;
      T01B310_A864BarPes = new short[1] ;
      T01B310_A213BarSit = new byte[1] ;
      T01B310_A120BarAgrEst = new String[] {""} ;
      T01B310_A1652BarSerDsc = new String[] {""} ;
      T01B310_A396EmprCod = new String[] {""} ;
      T01B310_n396EmprCod = new boolean[] {false} ;
      T01B310_A361DisCod = new int[1] ;
      T01B310_A252CliCod = new int[1] ;
      T01B310_n252CliCod = new boolean[] {false} ;
      T01B310_A365DisDes = new String[] {""} ;
      T01B319_A396EmprCod = new String[] {""} ;
      T01B319_n396EmprCod = new boolean[] {false} ;
      T01B319_A129BarCod = new int[1] ;
      T01B319_n129BarCod = new boolean[] {false} ;
      T01B319_A132BarCodReo = new byte[1] ;
      T01B319_n132BarCodReo = new boolean[] {false} ;
      T01B319_A130BarCodPar = new String[] {""} ;
      T01B319_n130BarCodPar = new boolean[] {false} ;
      T01B320_A396EmprCod = new String[] {""} ;
      T01B320_n396EmprCod = new boolean[] {false} ;
      T01B320_A129BarCod = new int[1] ;
      T01B320_n129BarCod = new boolean[] {false} ;
      T01B320_A132BarCodReo = new byte[1] ;
      T01B320_n132BarCodReo = new boolean[] {false} ;
      T01B320_A130BarCodPar = new String[] {""} ;
      T01B320_n130BarCodPar = new boolean[] {false} ;
      T01B39_A2759BarMaqGru = new String[] {""} ;
      T01B39_A129BarCod = new int[1] ;
      T01B39_n129BarCod = new boolean[] {false} ;
      T01B39_A132BarCodReo = new byte[1] ;
      T01B39_n132BarCodReo = new boolean[] {false} ;
      T01B39_A130BarCodPar = new String[] {""} ;
      T01B39_n130BarCodPar = new boolean[] {false} ;
      T01B39_A180BarMaqCod = new String[] {""} ;
      T01B39_A143BarDisNum = new String[] {""} ;
      T01B39_A212BarSer = new String[] {""} ;
      T01B39_A182BarMat = new String[] {""} ;
      T01B39_A135BarColNom = new String[] {""} ;
      T01B39_A136BarColNum = new int[1] ;
      T01B39_A218BarTipCol = new byte[1] ;
      T01B39_A864BarPes = new short[1] ;
      T01B39_A213BarSit = new byte[1] ;
      T01B39_A120BarAgrEst = new String[] {""} ;
      T01B39_A1652BarSerDsc = new String[] {""} ;
      T01B39_A396EmprCod = new String[] {""} ;
      T01B39_n396EmprCod = new boolean[] {false} ;
      T01B39_A361DisCod = new int[1] ;
      T01B39_A252CliCod = new int[1] ;
      T01B39_n252CliCod = new boolean[] {false} ;
      T01B39_A365DisDes = new String[] {""} ;
      T01B324_A252CliCod = new int[1] ;
      T01B324_n252CliCod = new boolean[] {false} ;
      T01B324_A392DisUniMed = new String[] {""} ;
      T01B324_A365DisDes = new String[] {""} ;
      T01B325_A279CliNom = new String[] {""} ;
      T01B326_A14681MRPrId = new long[1] ;
      T01B327_A5921XCjaDis = new String[] {""} ;
      T01B327_A5922XCjaCod = new long[1] ;
      T01B328_A396EmprCod = new String[] {""} ;
      T01B328_n396EmprCod = new boolean[] {false} ;
      T01B328_A129BarCod = new int[1] ;
      T01B328_n129BarCod = new boolean[] {false} ;
      T01B328_A132BarCodReo = new byte[1] ;
      T01B328_n132BarCodReo = new boolean[] {false} ;
      T01B328_A130BarCodPar = new String[] {""} ;
      T01B328_n130BarCodPar = new boolean[] {false} ;
      T01B328_A14152MEnvOrd = new short[1] ;
      T01B329_A396EmprCod = new String[] {""} ;
      T01B329_n396EmprCod = new boolean[] {false} ;
      T01B329_A129BarCod = new int[1] ;
      T01B329_n129BarCod = new boolean[] {false} ;
      T01B329_A132BarCodReo = new byte[1] ;
      T01B329_n132BarCodReo = new boolean[] {false} ;
      T01B329_A130BarCodPar = new String[] {""} ;
      T01B329_n130BarCodPar = new boolean[] {false} ;
      T01B329_A13905BarTraID = new String[] {""} ;
      T01B330_A396EmprCod = new String[] {""} ;
      T01B330_n396EmprCod = new boolean[] {false} ;
      T01B330_A129BarCod = new int[1] ;
      T01B330_n129BarCod = new boolean[] {false} ;
      T01B330_A132BarCodReo = new byte[1] ;
      T01B330_n132BarCodReo = new boolean[] {false} ;
      T01B330_A130BarCodPar = new String[] {""} ;
      T01B330_n130BarCodPar = new boolean[] {false} ;
      T01B330_A13093BarDGLin = new byte[1] ;
      T01B330_A13094BarDGDibCl = new String[] {""} ;
      T01B330_A13095BarDGDibIn = new int[1] ;
      T01B330_A13096BarDGComb = new String[] {""} ;
      T01B330_A13097BarDGFOndo = new String[] {""} ;
      T01B331_A396EmprCod = new String[] {""} ;
      T01B331_n396EmprCod = new boolean[] {false} ;
      T01B331_A11917Ebd_numero = new int[1] ;
      T01B332_A396EmprCod = new String[] {""} ;
      T01B332_n396EmprCod = new boolean[] {false} ;
      T01B332_A11898Prd_numero = new int[1] ;
      T01B333_A396EmprCod = new String[] {""} ;
      T01B333_n396EmprCod = new boolean[] {false} ;
      T01B333_A11849Cte_numero = new int[1] ;
      T01B334_A396EmprCod = new String[] {""} ;
      T01B334_n396EmprCod = new boolean[] {false} ;
      T01B334_A11791Ap_numero = new int[1] ;
      T01B335_A396EmprCod = new String[] {""} ;
      T01B335_n396EmprCod = new boolean[] {false} ;
      T01B335_A3985CalBarCod = new int[1] ;
      T01B335_A3986CalBarCodR = new byte[1] ;
      T01B335_A3987CalBarCodP = new String[] {""} ;
      T01B336_A396EmprCod = new String[] {""} ;
      T01B336_n396EmprCod = new boolean[] {false} ;
      T01B336_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01B336_A652OpeCod = new int[1] ;
      T01B337_A396EmprCod = new String[] {""} ;
      T01B337_n396EmprCod = new boolean[] {false} ;
      T01B337_A129BarCod = new int[1] ;
      T01B337_n129BarCod = new boolean[] {false} ;
      T01B337_A132BarCodReo = new byte[1] ;
      T01B337_n132BarCodReo = new boolean[] {false} ;
      T01B337_A130BarCodPar = new String[] {""} ;
      T01B337_n130BarCodPar = new boolean[] {false} ;
      T01B337_A4118tinagrcod = new int[1] ;
      T01B337_A4119tinagrreo = new byte[1] ;
      T01B337_A4120tinagrpar = new String[] {""} ;
      T01B338_A396EmprCod = new String[] {""} ;
      T01B338_n396EmprCod = new boolean[] {false} ;
      T01B338_A129BarCod = new int[1] ;
      T01B338_n129BarCod = new boolean[] {false} ;
      T01B338_A132BarCodReo = new byte[1] ;
      T01B338_n132BarCodReo = new boolean[] {false} ;
      T01B338_A130BarCodPar = new String[] {""} ;
      T01B338_n130BarCodPar = new boolean[] {false} ;
      T01B338_A4080estagrcod = new int[1] ;
      T01B338_A4081estagrreo = new byte[1] ;
      T01B338_A4082estagrpar = new String[] {""} ;
      T01B339_A396EmprCod = new String[] {""} ;
      T01B339_n396EmprCod = new boolean[] {false} ;
      T01B339_A129BarCod = new int[1] ;
      T01B339_n129BarCod = new boolean[] {false} ;
      T01B339_A132BarCodReo = new byte[1] ;
      T01B339_n132BarCodReo = new boolean[] {false} ;
      T01B339_A130BarCodPar = new String[] {""} ;
      T01B339_n130BarCodPar = new boolean[] {false} ;
      T01B339_A4075recestncol = new byte[1] ;
      T01B339_A4076recestnpro = new byte[1] ;
      T01B340_A396EmprCod = new String[] {""} ;
      T01B340_n396EmprCod = new boolean[] {false} ;
      T01B340_A602MaqCod = new String[] {""} ;
      T01B340_A1142MaqFCod = new String[] {""} ;
      T01B340_A3068PlaEtaOrd = new short[1] ;
      T01B340_A3069PlaEtaOrdA = new byte[1] ;
      T01B340_A129BarCod = new int[1] ;
      T01B340_n129BarCod = new boolean[] {false} ;
      T01B340_A132BarCodReo = new byte[1] ;
      T01B340_n132BarCodReo = new boolean[] {false} ;
      T01B340_A130BarCodPar = new String[] {""} ;
      T01B340_n130BarCodPar = new boolean[] {false} ;
      T01B341_A396EmprCod = new String[] {""} ;
      T01B341_n396EmprCod = new boolean[] {false} ;
      T01B341_A129BarCod = new int[1] ;
      T01B341_n129BarCod = new boolean[] {false} ;
      T01B341_A132BarCodReo = new byte[1] ;
      T01B341_n132BarCodReo = new boolean[] {false} ;
      T01B341_A130BarCodPar = new String[] {""} ;
      T01B341_n130BarCodPar = new boolean[] {false} ;
      T01B341_A4846BarAudLin = new short[1] ;
      T01B342_A396EmprCod = new String[] {""} ;
      T01B342_n396EmprCod = new boolean[] {false} ;
      T01B342_A129BarCod = new int[1] ;
      T01B342_n129BarCod = new boolean[] {false} ;
      T01B342_A132BarCodReo = new byte[1] ;
      T01B342_n132BarCodReo = new boolean[] {false} ;
      T01B342_A130BarCodPar = new String[] {""} ;
      T01B342_n130BarCodPar = new boolean[] {false} ;
      T01B342_A3940BarEnsLin = new short[1] ;
      T01B343_A396EmprCod = new String[] {""} ;
      T01B343_n396EmprCod = new boolean[] {false} ;
      T01B343_A129BarCod = new int[1] ;
      T01B343_n129BarCod = new boolean[] {false} ;
      T01B343_A132BarCodReo = new byte[1] ;
      T01B343_n132BarCodReo = new boolean[] {false} ;
      T01B343_A130BarCodPar = new String[] {""} ;
      T01B343_n130BarCodPar = new boolean[] {false} ;
      T01B343_A3384RefBarCod = new int[1] ;
      T01B343_A3385RefBarReo = new byte[1] ;
      T01B343_A3386RefBarPar = new String[] {""} ;
      T01B344_A396EmprCod = new String[] {""} ;
      T01B344_n396EmprCod = new boolean[] {false} ;
      T01B344_A10914SolSalCod = new int[1] ;
      T01B345_A396EmprCod = new String[] {""} ;
      T01B345_n396EmprCod = new boolean[] {false} ;
      T01B345_A10364Ph_numero = new int[1] ;
      T01B346_A396EmprCod = new String[] {""} ;
      T01B346_n396EmprCod = new boolean[] {false} ;
      T01B346_A129BarCod = new int[1] ;
      T01B346_n129BarCod = new boolean[] {false} ;
      T01B346_A132BarCodReo = new byte[1] ;
      T01B346_n132BarCodReo = new boolean[] {false} ;
      T01B346_A130BarCodPar = new String[] {""} ;
      T01B346_n130BarCodPar = new boolean[] {false} ;
      T01B346_A10197ProEspCod = new String[] {""} ;
      T01B347_A396EmprCod = new String[] {""} ;
      T01B347_n396EmprCod = new boolean[] {false} ;
      T01B347_A129BarCod = new int[1] ;
      T01B347_n129BarCod = new boolean[] {false} ;
      T01B347_A132BarCodReo = new byte[1] ;
      T01B347_n132BarCodReo = new boolean[] {false} ;
      T01B347_A130BarCodPar = new String[] {""} ;
      T01B347_n130BarCodPar = new boolean[] {false} ;
      T01B347_A5322Dp_Nrecep = new int[1] ;
      T01B348_A396EmprCod = new String[] {""} ;
      T01B348_n396EmprCod = new boolean[] {false} ;
      T01B348_A129BarCod = new int[1] ;
      T01B348_n129BarCod = new boolean[] {false} ;
      T01B348_A132BarCodReo = new byte[1] ;
      T01B348_n132BarCodReo = new boolean[] {false} ;
      T01B348_A130BarCodPar = new String[] {""} ;
      T01B348_n130BarCodPar = new boolean[] {false} ;
      T01B348_A8569EntSecLn = new int[1] ;
      T01B349_A396EmprCod = new String[] {""} ;
      T01B349_n396EmprCod = new boolean[] {false} ;
      T01B349_A7434PLLNro = new int[1] ;
      T01B349_A7443LPLNro = new short[1] ;
      T01B349_A7459CPLCom = new short[1] ;
      T01B349_A129BarCod = new int[1] ;
      T01B349_n129BarCod = new boolean[] {false} ;
      T01B349_A132BarCodReo = new byte[1] ;
      T01B349_n132BarCodReo = new boolean[] {false} ;
      T01B349_A130BarCodPar = new String[] {""} ;
      T01B349_n130BarCodPar = new boolean[] {false} ;
      T01B350_A396EmprCod = new String[] {""} ;
      T01B350_n396EmprCod = new boolean[] {false} ;
      T01B350_A7145OSSCod = new int[1] ;
      T01B351_A396EmprCod = new String[] {""} ;
      T01B351_n396EmprCod = new boolean[] {false} ;
      T01B351_A7049OGSCod = new int[1] ;
      T01B352_A396EmprCod = new String[] {""} ;
      T01B352_n396EmprCod = new boolean[] {false} ;
      T01B352_A129BarCod = new int[1] ;
      T01B352_n129BarCod = new boolean[] {false} ;
      T01B352_A132BarCodReo = new byte[1] ;
      T01B352_n132BarCodReo = new boolean[] {false} ;
      T01B352_A130BarCodPar = new String[] {""} ;
      T01B352_n130BarCodPar = new boolean[] {false} ;
      T01B352_A6031Ac_Barcod = new int[1] ;
      T01B352_A6032Ac_BarReo = new byte[1] ;
      T01B352_A6033Ac_BarPar = new String[] {""} ;
      T01B353_A396EmprCod = new String[] {""} ;
      T01B353_n396EmprCod = new boolean[] {false} ;
      T01B353_A129BarCod = new int[1] ;
      T01B353_n129BarCod = new boolean[] {false} ;
      T01B353_A132BarCodReo = new byte[1] ;
      T01B353_n132BarCodReo = new boolean[] {false} ;
      T01B353_A130BarCodPar = new String[] {""} ;
      T01B353_n130BarCodPar = new boolean[] {false} ;
      T01B353_A5908PartPal = new int[1] ;
      T01B354_A396EmprCod = new String[] {""} ;
      T01B354_n396EmprCod = new boolean[] {false} ;
      T01B354_A129BarCod = new int[1] ;
      T01B354_n129BarCod = new boolean[] {false} ;
      T01B354_A132BarCodReo = new byte[1] ;
      T01B354_n132BarCodReo = new boolean[] {false} ;
      T01B354_A130BarCodPar = new String[] {""} ;
      T01B354_n130BarCodPar = new boolean[] {false} ;
      T01B354_A2524DisComLin = new byte[1] ;
      T01B354_A1056DisComCod = new String[] {""} ;
      T01B354_A1032FonCod = new String[] {""} ;
      T01B355_A396EmprCod = new String[] {""} ;
      T01B355_n396EmprCod = new boolean[] {false} ;
      T01B355_A1736AlbExtCod = new long[1] ;
      T01B355_A129BarCod = new int[1] ;
      T01B355_n129BarCod = new boolean[] {false} ;
      T01B355_A132BarCodReo = new byte[1] ;
      T01B355_n132BarCodReo = new boolean[] {false} ;
      T01B355_A130BarCodPar = new String[] {""} ;
      T01B355_n130BarCodPar = new boolean[] {false} ;
      T01B356_A396EmprCod = new String[] {""} ;
      T01B356_n396EmprCod = new boolean[] {false} ;
      T01B356_A129BarCod = new int[1] ;
      T01B356_n129BarCod = new boolean[] {false} ;
      T01B356_A132BarCodReo = new byte[1] ;
      T01B356_n132BarCodReo = new boolean[] {false} ;
      T01B356_A130BarCodPar = new String[] {""} ;
      T01B356_n130BarCodPar = new boolean[] {false} ;
      T01B356_A3753BarFoaCod = new int[1] ;
      T01B356_A3754BarFoaReo = new byte[1] ;
      T01B356_A3755BarFoaPar = new String[] {""} ;
      T01B357_A396EmprCod = new String[] {""} ;
      T01B357_n396EmprCod = new boolean[] {false} ;
      T01B357_A129BarCod = new int[1] ;
      T01B357_n129BarCod = new boolean[] {false} ;
      T01B357_A132BarCodReo = new byte[1] ;
      T01B357_n132BarCodReo = new boolean[] {false} ;
      T01B357_A130BarCodPar = new String[] {""} ;
      T01B357_n130BarCodPar = new boolean[] {false} ;
      T01B357_A3747BarPegCod = new int[1] ;
      T01B357_A3748BarPegReo = new byte[1] ;
      T01B357_A3749BarPegPar = new String[] {""} ;
      T01B358_A396EmprCod = new String[] {""} ;
      T01B358_n396EmprCod = new boolean[] {false} ;
      T01B358_A3253SolTraCod = new int[1] ;
      T01B359_A396EmprCod = new String[] {""} ;
      T01B359_n396EmprCod = new boolean[] {false} ;
      T01B359_A3235SolSubCod = new int[1] ;
      T01B360_A396EmprCod = new String[] {""} ;
      T01B360_n396EmprCod = new boolean[] {false} ;
      T01B360_A3218SolLuzCod = new int[1] ;
      T01B361_A396EmprCod = new String[] {""} ;
      T01B361_n396EmprCod = new boolean[] {false} ;
      T01B361_A3196SolFriCod = new int[1] ;
      T01B362_A396EmprCod = new String[] {""} ;
      T01B362_n396EmprCod = new boolean[] {false} ;
      T01B362_A3165SolPilCod = new int[1] ;
      T01B363_A396EmprCod = new String[] {""} ;
      T01B363_n396EmprCod = new boolean[] {false} ;
      T01B363_A129BarCod = new int[1] ;
      T01B363_n129BarCod = new boolean[] {false} ;
      T01B363_A132BarCodReo = new byte[1] ;
      T01B363_n132BarCodReo = new boolean[] {false} ;
      T01B363_A130BarCodPar = new String[] {""} ;
      T01B363_n130BarCodPar = new boolean[] {false} ;
      T01B363_A2872HAnRLinMaq = new short[1] ;
      T01B363_A2873HAnRLinPro = new byte[1] ;
      T01B363_A2874HAnRLin = new short[1] ;
      T01B363_A2875HAnNumAny = new byte[1] ;
      T01B364_A396EmprCod = new String[] {""} ;
      T01B364_n396EmprCod = new boolean[] {false} ;
      T01B364_A2817PlaTer = new String[] {""} ;
      T01B364_A2818PlaOrd = new short[1] ;
      T01B365_A396EmprCod = new String[] {""} ;
      T01B365_n396EmprCod = new boolean[] {false} ;
      T01B365_A2809MetTerCod = new String[] {""} ;
      T01B365_A129BarCod = new int[1] ;
      T01B365_n129BarCod = new boolean[] {false} ;
      T01B365_A132BarCodReo = new byte[1] ;
      T01B365_n132BarCodReo = new boolean[] {false} ;
      T01B365_A130BarCodPar = new String[] {""} ;
      T01B365_n130BarCodPar = new boolean[] {false} ;
      T01B366_A396EmprCod = new String[] {""} ;
      T01B366_n396EmprCod = new boolean[] {false} ;
      T01B366_A129BarCod = new int[1] ;
      T01B366_n129BarCod = new boolean[] {false} ;
      T01B366_A132BarCodReo = new byte[1] ;
      T01B366_n132BarCodReo = new boolean[] {false} ;
      T01B366_A130BarCodPar = new String[] {""} ;
      T01B366_n130BarCodPar = new boolean[] {false} ;
      T01B366_A2808RecLinMAL = new short[1] ;
      T01B366_A1377RecNumAny = new byte[1] ;
      T01B366_A719PrdNum = new String[] {""} ;
      T01B367_A396EmprCod = new String[] {""} ;
      T01B367_n396EmprCod = new boolean[] {false} ;
      T01B367_A129BarCod = new int[1] ;
      T01B367_n129BarCod = new boolean[] {false} ;
      T01B367_A132BarCodReo = new byte[1] ;
      T01B367_n132BarCodReo = new boolean[] {false} ;
      T01B367_A130BarCodPar = new String[] {""} ;
      T01B367_n130BarCodPar = new boolean[] {false} ;
      T01B367_A2804RecLinMaq = new short[1] ;
      T01B368_A396EmprCod = new String[] {""} ;
      T01B368_n396EmprCod = new boolean[] {false} ;
      T01B368_A2792TermiCod = new String[] {""} ;
      T01B368_A129BarCod = new int[1] ;
      T01B368_n129BarCod = new boolean[] {false} ;
      T01B368_A132BarCodReo = new byte[1] ;
      T01B368_n132BarCodReo = new boolean[] {false} ;
      T01B368_A130BarCodPar = new String[] {""} ;
      T01B368_n130BarCodPar = new boolean[] {false} ;
      T01B369_A396EmprCod = new String[] {""} ;
      T01B369_n396EmprCod = new boolean[] {false} ;
      T01B369_A2248ManCod = new short[1] ;
      T01B369_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01B369_A2713RpExHdLi = new short[1] ;
      T01B370_A396EmprCod = new String[] {""} ;
      T01B370_n396EmprCod = new boolean[] {false} ;
      T01B370_A2248ManCod = new short[1] ;
      T01B370_A2689ExHdrFas = new String[] {""} ;
      T01B370_A2692ExHdrLin = new int[1] ;
      T01B371_A396EmprCod = new String[] {""} ;
      T01B371_n396EmprCod = new boolean[] {false} ;
      T01B371_A129BarCod = new int[1] ;
      T01B371_n129BarCod = new boolean[] {false} ;
      T01B371_A132BarCodReo = new byte[1] ;
      T01B371_n132BarCodReo = new boolean[] {false} ;
      T01B371_A130BarCodPar = new String[] {""} ;
      T01B371_n130BarCodPar = new boolean[] {false} ;
      T01B371_A2494BarDosPro = new String[] {""} ;
      T01B371_A719PrdNum = new String[] {""} ;
      T01B372_A396EmprCod = new String[] {""} ;
      T01B372_n396EmprCod = new boolean[] {false} ;
      T01B372_A602MaqCod = new String[] {""} ;
      T01B372_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01B372_A129BarCod = new int[1] ;
      T01B372_n129BarCod = new boolean[] {false} ;
      T01B372_A132BarCodReo = new byte[1] ;
      T01B372_n132BarCodReo = new boolean[] {false} ;
      T01B372_A130BarCodPar = new String[] {""} ;
      T01B372_n130BarCodPar = new boolean[] {false} ;
      T01B373_A396EmprCod = new String[] {""} ;
      T01B373_n396EmprCod = new boolean[] {false} ;
      T01B373_A129BarCod = new int[1] ;
      T01B373_n129BarCod = new boolean[] {false} ;
      T01B373_A132BarCodReo = new byte[1] ;
      T01B373_n132BarCodReo = new boolean[] {false} ;
      T01B373_A130BarCodPar = new String[] {""} ;
      T01B373_n130BarCodPar = new boolean[] {false} ;
      T01B373_A2457BarObLin = new short[1] ;
      T01B374_A396EmprCod = new String[] {""} ;
      T01B374_n396EmprCod = new boolean[] {false} ;
      T01B374_A129BarCod = new int[1] ;
      T01B374_n129BarCod = new boolean[] {false} ;
      T01B374_A132BarCodReo = new byte[1] ;
      T01B374_n132BarCodReo = new boolean[] {false} ;
      T01B374_A130BarCodPar = new String[] {""} ;
      T01B374_n130BarCodPar = new boolean[] {false} ;
      T01B374_A2444BarEnLin = new short[1] ;
      T01B375_A396EmprCod = new String[] {""} ;
      T01B375_n396EmprCod = new boolean[] {false} ;
      T01B375_A2406ExhAlbCod = new int[1] ;
      T01B375_A129BarCod = new int[1] ;
      T01B375_n129BarCod = new boolean[] {false} ;
      T01B375_A132BarCodReo = new byte[1] ;
      T01B375_n132BarCodReo = new boolean[] {false} ;
      T01B375_A130BarCodPar = new String[] {""} ;
      T01B375_n130BarCodPar = new boolean[] {false} ;
      T01B376_A396EmprCod = new String[] {""} ;
      T01B376_n396EmprCod = new boolean[] {false} ;
      T01B376_A2253SalExtAlb = new int[1] ;
      T01B376_A129BarCod = new int[1] ;
      T01B376_n129BarCod = new boolean[] {false} ;
      T01B376_A132BarCodReo = new byte[1] ;
      T01B376_n132BarCodReo = new boolean[] {false} ;
      T01B376_A130BarCodPar = new String[] {""} ;
      T01B376_n130BarCodPar = new boolean[] {false} ;
      T01B377_A396EmprCod = new String[] {""} ;
      T01B377_n396EmprCod = new boolean[] {false} ;
      T01B377_A30AlbProCod = new long[1] ;
      T01B377_A129BarCod = new int[1] ;
      T01B377_n129BarCod = new boolean[] {false} ;
      T01B377_A132BarCodReo = new byte[1] ;
      T01B377_n132BarCodReo = new boolean[] {false} ;
      T01B377_A130BarCodPar = new String[] {""} ;
      T01B377_n130BarCodPar = new boolean[] {false} ;
      T01B378_A396EmprCod = new String[] {""} ;
      T01B378_n396EmprCod = new boolean[] {false} ;
      T01B378_A1348SolColCod = new int[1] ;
      T01B379_A396EmprCod = new String[] {""} ;
      T01B379_n396EmprCod = new boolean[] {false} ;
      T01B379_A1333EstDimCod = new int[1] ;
      T01B380_A396EmprCod = new String[] {""} ;
      T01B380_n396EmprCod = new boolean[] {false} ;
      T01B380_A1314EnsLabCod = new int[1] ;
      T01B381_A396EmprCod = new String[] {""} ;
      T01B381_n396EmprCod = new boolean[] {false} ;
      T01B381_A129BarCod = new int[1] ;
      T01B381_n129BarCod = new boolean[] {false} ;
      T01B381_A132BarCodReo = new byte[1] ;
      T01B381_n132BarCodReo = new boolean[] {false} ;
      T01B381_A130BarCodPar = new String[] {""} ;
      T01B381_n130BarCodPar = new boolean[] {false} ;
      T01B381_A906ObsReoLin = new byte[1] ;
      T01B382_A396EmprCod = new String[] {""} ;
      T01B382_n396EmprCod = new boolean[] {false} ;
      T01B382_A859CumCodCont = new int[1] ;
      T01B383_A396EmprCod = new String[] {""} ;
      T01B383_n396EmprCod = new boolean[] {false} ;
      T01B383_A602MaqCod = new String[] {""} ;
      T01B383_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B383_A561HisProLin = new int[1] ;
      T01B384_A396EmprCod = new String[] {""} ;
      T01B384_n396EmprCod = new boolean[] {false} ;
      T01B384_A252CliCod = new int[1] ;
      T01B384_n252CliCod = new boolean[] {false} ;
      T01B384_A494ForSer = new String[] {""} ;
      T01B384_A482ForColNom = new String[] {""} ;
      T01B384_A483ForColNum = new int[1] ;
      T01B384_A831TipColCod = new byte[1] ;
      T01B385_A396EmprCod = new String[] {""} ;
      T01B385_n396EmprCod = new boolean[] {false} ;
      T01B385_A30AlbProCod = new long[1] ;
      T01B385_A129BarCod = new int[1] ;
      T01B385_n129BarCod = new boolean[] {false} ;
      T01B385_A132BarCodReo = new byte[1] ;
      T01B385_n132BarCodReo = new boolean[] {false} ;
      T01B385_A130BarCodPar = new String[] {""} ;
      T01B385_n130BarCodPar = new boolean[] {false} ;
      T01B385_A200BarPieCod = new String[] {""} ;
      T01B386_A396EmprCod = new String[] {""} ;
      T01B386_n396EmprCod = new boolean[] {false} ;
      T01B386_A129BarCod = new int[1] ;
      T01B386_n129BarCod = new boolean[] {false} ;
      T01B386_A132BarCodReo = new byte[1] ;
      T01B386_n132BarCodReo = new boolean[] {false} ;
      T01B386_A130BarCodPar = new String[] {""} ;
      T01B386_n130BarCodPar = new boolean[] {false} ;
      T01B386_A188BarNotLin = new byte[1] ;
      T01B387_A396EmprCod = new String[] {""} ;
      T01B387_n396EmprCod = new boolean[] {false} ;
      T01B387_A129BarCod = new int[1] ;
      T01B387_n129BarCod = new boolean[] {false} ;
      T01B387_A132BarCodReo = new byte[1] ;
      T01B387_n132BarCodReo = new boolean[] {false} ;
      T01B387_A130BarCodPar = new String[] {""} ;
      T01B387_n130BarCodPar = new boolean[] {false} ;
      T01B387_A758ProCod = new String[] {""} ;
      T01B388_A396EmprCod = new String[] {""} ;
      T01B388_n396EmprCod = new boolean[] {false} ;
      T01B388_A129BarCod = new int[1] ;
      T01B388_n129BarCod = new boolean[] {false} ;
      T01B388_A132BarCodReo = new byte[1] ;
      T01B388_n132BarCodReo = new boolean[] {false} ;
      T01B388_A130BarCodPar = new String[] {""} ;
      T01B388_n130BarCodPar = new boolean[] {false} ;
      T01B388_A119BarAgrCod = new int[1] ;
      T01B388_A124BarAgrReo = new byte[1] ;
      T01B388_A122BarAgrPar = new String[] {""} ;
      T01B390_A199BarPie1 = new short[1] ;
      T01B390_A898BarPieNDes = new int[1] ;
      T01B392_A396EmprCod = new String[] {""} ;
      T01B392_n396EmprCod = new boolean[] {false} ;
      T01B392_A129BarCod = new int[1] ;
      T01B392_n129BarCod = new boolean[] {false} ;
      T01B392_A132BarCodReo = new byte[1] ;
      T01B392_n132BarCodReo = new boolean[] {false} ;
      T01B392_A130BarCodPar = new String[] {""} ;
      T01B392_n130BarCodPar = new boolean[] {false} ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      Z971ProceNom = "" ;
      Z4296ClasDsc = "" ;
      T01B34_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B34_A54AlbRPieUti = new int[1] ;
      T01B34_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B34_A52AlbRPieEnt = new int[1] ;
      T01B34_A47AlbREst = new byte[1] ;
      T01B34_A46AlbREnt = new String[] {""} ;
      T01B34_A970ProceCod = new short[1] ;
      T01B34_n970ProceCod = new boolean[] {false} ;
      T01B34_A4295ClasCod = new short[1] ;
      T01B34_n4295ClasCod = new boolean[] {false} ;
      T01B35_A971ProceNom = new String[] {""} ;
      T01B35_n971ProceNom = new boolean[] {false} ;
      T01B36_A4296ClasDsc = new String[] {""} ;
      T01B36_n4296ClasDsc = new boolean[] {false} ;
      T01B393_A129BarCod = new int[1] ;
      T01B393_n129BarCod = new boolean[] {false} ;
      T01B393_A132BarCodReo = new byte[1] ;
      T01B393_n132BarCodReo = new boolean[] {false} ;
      T01B393_A130BarCodPar = new String[] {""} ;
      T01B393_n130BarCodPar = new boolean[] {false} ;
      T01B393_A200BarPieCod = new String[] {""} ;
      T01B393_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A54AlbRPieUti = new int[1] ;
      T01B393_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A52AlbRPieEnt = new int[1] ;
      T01B393_A47AlbREst = new byte[1] ;
      T01B393_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A201BarPieEst = new byte[1] ;
      T01B393_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B393_A197BarPConTro = new short[1] ;
      T01B393_A908PieOriCod = new String[] {""} ;
      T01B393_A1271BarPieLzd = new int[1] ;
      T01B393_A1501BarPiePie = new int[1] ;
      T01B393_A46AlbREnt = new String[] {""} ;
      T01B393_A4296ClasDsc = new String[] {""} ;
      T01B393_n4296ClasDsc = new boolean[] {false} ;
      T01B393_A971ProceNom = new String[] {""} ;
      T01B393_n971ProceNom = new boolean[] {false} ;
      T01B393_A396EmprCod = new String[] {""} ;
      T01B393_n396EmprCod = new boolean[] {false} ;
      T01B393_A44AlbRecCod = new int[1] ;
      T01B393_A970ProceCod = new short[1] ;
      T01B393_n970ProceCod = new boolean[] {false} ;
      T01B393_A4295ClasCod = new short[1] ;
      T01B393_n4295ClasCod = new boolean[] {false} ;
      T01B394_A396EmprCod = new String[] {""} ;
      T01B394_n396EmprCod = new boolean[] {false} ;
      T01B394_A129BarCod = new int[1] ;
      T01B394_n129BarCod = new boolean[] {false} ;
      T01B394_A132BarCodReo = new byte[1] ;
      T01B394_n132BarCodReo = new boolean[] {false} ;
      T01B394_A130BarCodPar = new String[] {""} ;
      T01B394_n130BarCodPar = new boolean[] {false} ;
      T01B394_A200BarPieCod = new String[] {""} ;
      T01B33_A129BarCod = new int[1] ;
      T01B33_n129BarCod = new boolean[] {false} ;
      T01B33_A132BarCodReo = new byte[1] ;
      T01B33_n132BarCodReo = new boolean[] {false} ;
      T01B33_A130BarCodPar = new String[] {""} ;
      T01B33_n130BarCodPar = new boolean[] {false} ;
      T01B33_A200BarPieCod = new String[] {""} ;
      T01B33_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B33_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B33_A201BarPieEst = new byte[1] ;
      T01B33_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B33_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B33_A197BarPConTro = new short[1] ;
      T01B33_A908PieOriCod = new String[] {""} ;
      T01B33_A1271BarPieLzd = new int[1] ;
      T01B33_A1501BarPiePie = new int[1] ;
      T01B33_A396EmprCod = new String[] {""} ;
      T01B33_n396EmprCod = new boolean[] {false} ;
      T01B33_A44AlbRecCod = new int[1] ;
      T01B32_A129BarCod = new int[1] ;
      T01B32_n129BarCod = new boolean[] {false} ;
      T01B32_A132BarCodReo = new byte[1] ;
      T01B32_n132BarCodReo = new boolean[] {false} ;
      T01B32_A130BarCodPar = new String[] {""} ;
      T01B32_n130BarCodPar = new boolean[] {false} ;
      T01B32_A200BarPieCod = new String[] {""} ;
      T01B32_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B32_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B32_A201BarPieEst = new byte[1] ;
      T01B32_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B32_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B32_A197BarPConTro = new short[1] ;
      T01B32_A908PieOriCod = new String[] {""} ;
      T01B32_A1271BarPieLzd = new int[1] ;
      T01B32_A1501BarPiePie = new int[1] ;
      T01B32_A396EmprCod = new String[] {""} ;
      T01B32_n396EmprCod = new boolean[] {false} ;
      T01B32_A44AlbRecCod = new int[1] ;
      GXv_int6 = new byte[1] ;
      T01B398_A396EmprCod = new String[] {""} ;
      T01B398_n396EmprCod = new boolean[] {false} ;
      T01B398_A129BarCod = new int[1] ;
      T01B398_n129BarCod = new boolean[] {false} ;
      T01B398_A132BarCodReo = new byte[1] ;
      T01B398_n132BarCodReo = new boolean[] {false} ;
      T01B398_A130BarCodPar = new String[] {""} ;
      T01B398_n130BarCodPar = new boolean[] {false} ;
      T01B398_A200BarPieCod = new String[] {""} ;
      T01B398_A12913BarPieLDf = new short[1] ;
      T01B399_A396EmprCod = new String[] {""} ;
      T01B399_n396EmprCod = new boolean[] {false} ;
      T01B399_A129BarCod = new int[1] ;
      T01B399_n129BarCod = new boolean[] {false} ;
      T01B399_A132BarCodReo = new byte[1] ;
      T01B399_n132BarCodReo = new boolean[] {false} ;
      T01B399_A130BarCodPar = new String[] {""} ;
      T01B399_n130BarCodPar = new boolean[] {false} ;
      T01B399_A200BarPieCod = new String[] {""} ;
      T01B399_A3858BarTroCod = new short[1] ;
      T01B3100_A396EmprCod = new String[] {""} ;
      T01B3100_n396EmprCod = new boolean[] {false} ;
      T01B3100_A30AlbProCod = new long[1] ;
      T01B3100_A129BarCod = new int[1] ;
      T01B3100_n129BarCod = new boolean[] {false} ;
      T01B3100_A132BarCodReo = new byte[1] ;
      T01B3100_n132BarCodReo = new boolean[] {false} ;
      T01B3100_A130BarCodPar = new String[] {""} ;
      T01B3100_n130BarCodPar = new boolean[] {false} ;
      T01B3100_A200BarPieCod = new String[] {""} ;
      T01B3101_A396EmprCod = new String[] {""} ;
      T01B3101_n396EmprCod = new boolean[] {false} ;
      T01B3101_A129BarCod = new int[1] ;
      T01B3101_n129BarCod = new boolean[] {false} ;
      T01B3101_A132BarCodReo = new byte[1] ;
      T01B3101_n132BarCodReo = new boolean[] {false} ;
      T01B3101_A130BarCodPar = new String[] {""} ;
      T01B3101_n130BarCodPar = new boolean[] {false} ;
      T01B3101_A200BarPieCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      T01B3102_A407EmprNom = new String[] {""} ;
      T01B3102_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ143BarDisNum = "" ;
      ZZ212BarSer = "" ;
      ZZ182BarMat = "" ;
      ZZ135BarColNom = "" ;
      ZZ166BarKgm = DecimalUtil.ZERO ;
      ZZ184BarMtr = DecimalUtil.ZERO ;
      ZZ120BarAgrEst = "" ;
      ZZ407EmprNom = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ392DisUniMed = "" ;
      ZZ365DisDes = "" ;
      ZZ279CliNom = "" ;
      ZO184BarMtr = DecimalUtil.ZERO ;
      ZO166BarKgm = DecimalUtil.ZERO ;
      ZV17KilAnt = DecimalUtil.ZERO ;
      ZV18MtrAnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbarpil__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbarpil__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbarpil__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbarpil__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbarpil__default(),
         new Object[] {
             new Object[] {
            T01B32_A129BarCod, T01B32_A132BarCodReo, T01B32_A130BarCodPar, T01B32_A200BarPieCod, T01B32_A203BarPieKil, T01B32_A205BarPieMet, T01B32_A201BarPieEst, T01B32_A170BarKilLan, T01B32_A183BarMetLan, T01B32_A197BarPConTro,
            T01B32_A908PieOriCod, T01B32_A1271BarPieLzd, T01B32_A1501BarPiePie, T01B32_A396EmprCod, T01B32_A44AlbRecCod
            }
            , new Object[] {
            T01B33_A129BarCod, T01B33_A132BarCodReo, T01B33_A130BarCodPar, T01B33_A200BarPieCod, T01B33_A203BarPieKil, T01B33_A205BarPieMet, T01B33_A201BarPieEst, T01B33_A170BarKilLan, T01B33_A183BarMetLan, T01B33_A197BarPConTro,
            T01B33_A908PieOriCod, T01B33_A1271BarPieLzd, T01B33_A1501BarPiePie, T01B33_A396EmprCod, T01B33_A44AlbRecCod
            }
            , new Object[] {
            T01B34_A60AlbRUniUti, T01B34_A54AlbRPieUti, T01B34_A58AlbRUniEnt, T01B34_A52AlbRPieEnt, T01B34_A47AlbREst, T01B34_A46AlbREnt, T01B34_A970ProceCod, T01B34_n970ProceCod, T01B34_A4295ClasCod, T01B34_n4295ClasCod
            }
            , new Object[] {
            T01B35_A971ProceNom, T01B35_n971ProceNom
            }
            , new Object[] {
            T01B36_A4296ClasDsc, T01B36_n4296ClasDsc
            }
            , new Object[] {
            T01B38_A166BarKgm, T01B38_A184BarMtr, T01B38_A199BarPie1, T01B38_A898BarPieNDes
            }
            , new Object[] {
            T01B39_A2759BarMaqGru, T01B39_A129BarCod, T01B39_A132BarCodReo, T01B39_A130BarCodPar, T01B39_A180BarMaqCod, T01B39_A143BarDisNum, T01B39_A212BarSer, T01B39_A182BarMat, T01B39_A135BarColNom, T01B39_A136BarColNum,
            T01B39_A218BarTipCol, T01B39_A864BarPes, T01B39_A213BarSit, T01B39_A120BarAgrEst, T01B39_A1652BarSerDsc, T01B39_A396EmprCod, T01B39_A361DisCod, T01B39_A252CliCod, T01B39_n252CliCod, T01B39_A365DisDes
            }
            , new Object[] {
            T01B310_A2759BarMaqGru, T01B310_A129BarCod, T01B310_A132BarCodReo, T01B310_A130BarCodPar, T01B310_A180BarMaqCod, T01B310_A143BarDisNum, T01B310_A212BarSer, T01B310_A182BarMat, T01B310_A135BarColNom, T01B310_A136BarColNum,
            T01B310_A218BarTipCol, T01B310_A864BarPes, T01B310_A213BarSit, T01B310_A120BarAgrEst, T01B310_A1652BarSerDsc, T01B310_A396EmprCod, T01B310_A361DisCod, T01B310_A252CliCod, T01B310_n252CliCod, T01B310_A365DisDes
            }
            , new Object[] {
            T01B311_A407EmprNom, T01B311_n407EmprNom
            }
            , new Object[] {
            T01B312_A252CliCod, T01B312_A392DisUniMed, T01B312_A365DisDes
            }
            , new Object[] {
            T01B313_A279CliNom
            }
            , new Object[] {
            T01B315_A2759BarMaqGru, T01B315_A129BarCod, T01B315_A132BarCodReo, T01B315_A130BarCodPar, T01B315_A180BarMaqCod, T01B315_A143BarDisNum, T01B315_A252CliCod, T01B315_n252CliCod, T01B315_A279CliNom, T01B315_A212BarSer,
            T01B315_A182BarMat, T01B315_A135BarColNom, T01B315_A136BarColNum, T01B315_A218BarTipCol, T01B315_A392DisUniMed, T01B315_A864BarPes, T01B315_A213BarSit, T01B315_A120BarAgrEst, T01B315_A407EmprNom, T01B315_n407EmprNom,
            T01B315_A1652BarSerDsc, T01B315_A365DisDes, T01B315_A396EmprCod, T01B315_A361DisCod, T01B315_A166BarKgm, T01B315_A184BarMtr, T01B315_A199BarPie1, T01B315_A898BarPieNDes
            }
            , new Object[] {
            T01B316_A252CliCod, T01B316_A392DisUniMed, T01B316_A365DisDes
            }
            , new Object[] {
            T01B317_A279CliNom
            }
            , new Object[] {
            T01B318_A396EmprCod, T01B318_A129BarCod, T01B318_A132BarCodReo, T01B318_A130BarCodPar
            }
            , new Object[] {
            T01B319_A396EmprCod, T01B319_A129BarCod, T01B319_A132BarCodReo, T01B319_A130BarCodPar
            }
            , new Object[] {
            T01B320_A396EmprCod, T01B320_A129BarCod, T01B320_A132BarCodReo, T01B320_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01B324_A252CliCod, T01B324_A392DisUniMed, T01B324_A365DisDes
            }
            , new Object[] {
            T01B325_A279CliNom
            }
            , new Object[] {
            T01B326_A14681MRPrId
            }
            , new Object[] {
            T01B327_A5921XCjaDis, T01B327_A5922XCjaCod
            }
            , new Object[] {
            T01B328_A396EmprCod, T01B328_A129BarCod, T01B328_A132BarCodReo, T01B328_A130BarCodPar, T01B328_A14152MEnvOrd
            }
            , new Object[] {
            T01B329_A396EmprCod, T01B329_A129BarCod, T01B329_A132BarCodReo, T01B329_A130BarCodPar, T01B329_A13905BarTraID
            }
            , new Object[] {
            T01B330_A396EmprCod, T01B330_A129BarCod, T01B330_A132BarCodReo, T01B330_A130BarCodPar, T01B330_A13093BarDGLin, T01B330_A13094BarDGDibCl, T01B330_A13095BarDGDibIn, T01B330_A13096BarDGComb, T01B330_A13097BarDGFOndo
            }
            , new Object[] {
            T01B331_A396EmprCod, T01B331_A11917Ebd_numero
            }
            , new Object[] {
            T01B332_A396EmprCod, T01B332_A11898Prd_numero
            }
            , new Object[] {
            T01B333_A396EmprCod, T01B333_A11849Cte_numero
            }
            , new Object[] {
            T01B334_A396EmprCod, T01B334_A11791Ap_numero
            }
            , new Object[] {
            T01B335_A396EmprCod, T01B335_A3985CalBarCod, T01B335_A3986CalBarCodR, T01B335_A3987CalBarCodP
            }
            , new Object[] {
            T01B336_A396EmprCod, T01B336_A5294InPTime, T01B336_A652OpeCod
            }
            , new Object[] {
            T01B337_A396EmprCod, T01B337_A129BarCod, T01B337_A132BarCodReo, T01B337_A130BarCodPar, T01B337_A4118tinagrcod, T01B337_A4119tinagrreo, T01B337_A4120tinagrpar
            }
            , new Object[] {
            T01B338_A396EmprCod, T01B338_A129BarCod, T01B338_A132BarCodReo, T01B338_A130BarCodPar, T01B338_A4080estagrcod, T01B338_A4081estagrreo, T01B338_A4082estagrpar
            }
            , new Object[] {
            T01B339_A396EmprCod, T01B339_A129BarCod, T01B339_A132BarCodReo, T01B339_A130BarCodPar, T01B339_A4075recestncol, T01B339_A4076recestnpro
            }
            , new Object[] {
            T01B340_A396EmprCod, T01B340_A602MaqCod, T01B340_A1142MaqFCod, T01B340_A3068PlaEtaOrd, T01B340_A3069PlaEtaOrdA, T01B340_A129BarCod, T01B340_A132BarCodReo, T01B340_A130BarCodPar
            }
            , new Object[] {
            T01B341_A396EmprCod, T01B341_A129BarCod, T01B341_A132BarCodReo, T01B341_A130BarCodPar, T01B341_A4846BarAudLin
            }
            , new Object[] {
            T01B342_A396EmprCod, T01B342_A129BarCod, T01B342_A132BarCodReo, T01B342_A130BarCodPar, T01B342_A3940BarEnsLin
            }
            , new Object[] {
            T01B343_A396EmprCod, T01B343_A129BarCod, T01B343_A132BarCodReo, T01B343_A130BarCodPar, T01B343_A3384RefBarCod, T01B343_A3385RefBarReo, T01B343_A3386RefBarPar
            }
            , new Object[] {
            T01B344_A396EmprCod, T01B344_A10914SolSalCod
            }
            , new Object[] {
            T01B345_A396EmprCod, T01B345_A10364Ph_numero
            }
            , new Object[] {
            T01B346_A396EmprCod, T01B346_A129BarCod, T01B346_A132BarCodReo, T01B346_A130BarCodPar, T01B346_A10197ProEspCod
            }
            , new Object[] {
            T01B347_A396EmprCod, T01B347_A129BarCod, T01B347_A132BarCodReo, T01B347_A130BarCodPar, T01B347_A5322Dp_Nrecep
            }
            , new Object[] {
            T01B348_A396EmprCod, T01B348_A129BarCod, T01B348_A132BarCodReo, T01B348_A130BarCodPar, T01B348_A8569EntSecLn
            }
            , new Object[] {
            T01B349_A396EmprCod, T01B349_A7434PLLNro, T01B349_A7443LPLNro, T01B349_A7459CPLCom, T01B349_A129BarCod, T01B349_A132BarCodReo, T01B349_A130BarCodPar
            }
            , new Object[] {
            T01B350_A396EmprCod, T01B350_A7145OSSCod
            }
            , new Object[] {
            T01B351_A396EmprCod, T01B351_A7049OGSCod
            }
            , new Object[] {
            T01B352_A396EmprCod, T01B352_A129BarCod, T01B352_A132BarCodReo, T01B352_A130BarCodPar, T01B352_A6031Ac_Barcod, T01B352_A6032Ac_BarReo, T01B352_A6033Ac_BarPar
            }
            , new Object[] {
            T01B353_A396EmprCod, T01B353_A129BarCod, T01B353_A132BarCodReo, T01B353_A130BarCodPar, T01B353_A5908PartPal
            }
            , new Object[] {
            T01B354_A396EmprCod, T01B354_A129BarCod, T01B354_A132BarCodReo, T01B354_A130BarCodPar, T01B354_A2524DisComLin, T01B354_A1056DisComCod, T01B354_A1032FonCod
            }
            , new Object[] {
            T01B355_A396EmprCod, T01B355_A1736AlbExtCod, T01B355_A129BarCod, T01B355_A132BarCodReo, T01B355_A130BarCodPar
            }
            , new Object[] {
            T01B356_A396EmprCod, T01B356_A129BarCod, T01B356_A132BarCodReo, T01B356_A130BarCodPar, T01B356_A3753BarFoaCod, T01B356_A3754BarFoaReo, T01B356_A3755BarFoaPar
            }
            , new Object[] {
            T01B357_A396EmprCod, T01B357_A129BarCod, T01B357_A132BarCodReo, T01B357_A130BarCodPar, T01B357_A3747BarPegCod, T01B357_A3748BarPegReo, T01B357_A3749BarPegPar
            }
            , new Object[] {
            T01B358_A396EmprCod, T01B358_A3253SolTraCod
            }
            , new Object[] {
            T01B359_A396EmprCod, T01B359_A3235SolSubCod
            }
            , new Object[] {
            T01B360_A396EmprCod, T01B360_A3218SolLuzCod
            }
            , new Object[] {
            T01B361_A396EmprCod, T01B361_A3196SolFriCod
            }
            , new Object[] {
            T01B362_A396EmprCod, T01B362_A3165SolPilCod
            }
            , new Object[] {
            T01B363_A396EmprCod, T01B363_A129BarCod, T01B363_A132BarCodReo, T01B363_A130BarCodPar, T01B363_A2872HAnRLinMaq, T01B363_A2873HAnRLinPro, T01B363_A2874HAnRLin, T01B363_A2875HAnNumAny
            }
            , new Object[] {
            T01B364_A396EmprCod, T01B364_A2817PlaTer, T01B364_A2818PlaOrd
            }
            , new Object[] {
            T01B365_A396EmprCod, T01B365_A2809MetTerCod, T01B365_A129BarCod, T01B365_A132BarCodReo, T01B365_A130BarCodPar
            }
            , new Object[] {
            T01B366_A396EmprCod, T01B366_A129BarCod, T01B366_A132BarCodReo, T01B366_A130BarCodPar, T01B366_A2808RecLinMAL, T01B366_A1377RecNumAny, T01B366_A719PrdNum
            }
            , new Object[] {
            T01B367_A396EmprCod, T01B367_A129BarCod, T01B367_A132BarCodReo, T01B367_A130BarCodPar, T01B367_A2804RecLinMaq
            }
            , new Object[] {
            T01B368_A396EmprCod, T01B368_A2792TermiCod, T01B368_A129BarCod, T01B368_A132BarCodReo, T01B368_A130BarCodPar
            }
            , new Object[] {
            T01B369_A396EmprCod, T01B369_A2248ManCod, T01B369_A2711RpExHdFe, T01B369_A2713RpExHdLi
            }
            , new Object[] {
            T01B370_A396EmprCod, T01B370_A2248ManCod, T01B370_A2689ExHdrFas, T01B370_A2692ExHdrLin
            }
            , new Object[] {
            T01B371_A396EmprCod, T01B371_A129BarCod, T01B371_A132BarCodReo, T01B371_A130BarCodPar, T01B371_A2494BarDosPro, T01B371_A719PrdNum
            }
            , new Object[] {
            T01B372_A396EmprCod, T01B372_A602MaqCod, T01B372_A2461PlaFecTin, T01B372_A129BarCod, T01B372_A132BarCodReo, T01B372_A130BarCodPar
            }
            , new Object[] {
            T01B373_A396EmprCod, T01B373_A129BarCod, T01B373_A132BarCodReo, T01B373_A130BarCodPar, T01B373_A2457BarObLin
            }
            , new Object[] {
            T01B374_A396EmprCod, T01B374_A129BarCod, T01B374_A132BarCodReo, T01B374_A130BarCodPar, T01B374_A2444BarEnLin
            }
            , new Object[] {
            T01B375_A396EmprCod, T01B375_A2406ExhAlbCod, T01B375_A129BarCod, T01B375_A132BarCodReo, T01B375_A130BarCodPar
            }
            , new Object[] {
            T01B376_A396EmprCod, T01B376_A2253SalExtAlb, T01B376_A129BarCod, T01B376_A132BarCodReo, T01B376_A130BarCodPar
            }
            , new Object[] {
            T01B377_A396EmprCod, T01B377_A30AlbProCod, T01B377_A129BarCod, T01B377_A132BarCodReo, T01B377_A130BarCodPar
            }
            , new Object[] {
            T01B378_A396EmprCod, T01B378_A1348SolColCod
            }
            , new Object[] {
            T01B379_A396EmprCod, T01B379_A1333EstDimCod
            }
            , new Object[] {
            T01B380_A396EmprCod, T01B380_A1314EnsLabCod
            }
            , new Object[] {
            T01B381_A396EmprCod, T01B381_A129BarCod, T01B381_A132BarCodReo, T01B381_A130BarCodPar, T01B381_A906ObsReoLin
            }
            , new Object[] {
            T01B382_A396EmprCod, T01B382_A859CumCodCont
            }
            , new Object[] {
            T01B383_A396EmprCod, T01B383_A602MaqCod, T01B383_A558HisProFec, T01B383_A561HisProLin
            }
            , new Object[] {
            T01B384_A396EmprCod, T01B384_A252CliCod, T01B384_A494ForSer, T01B384_A482ForColNom, T01B384_A483ForColNum, T01B384_A831TipColCod
            }
            , new Object[] {
            T01B385_A396EmprCod, T01B385_A30AlbProCod, T01B385_A129BarCod, T01B385_A132BarCodReo, T01B385_A130BarCodPar, T01B385_A200BarPieCod
            }
            , new Object[] {
            T01B386_A396EmprCod, T01B386_A129BarCod, T01B386_A132BarCodReo, T01B386_A130BarCodPar, T01B386_A188BarNotLin
            }
            , new Object[] {
            T01B387_A396EmprCod, T01B387_A129BarCod, T01B387_A132BarCodReo, T01B387_A130BarCodPar, T01B387_A758ProCod
            }
            , new Object[] {
            T01B388_A396EmprCod, T01B388_A129BarCod, T01B388_A132BarCodReo, T01B388_A130BarCodPar, T01B388_A119BarAgrCod, T01B388_A124BarAgrReo, T01B388_A122BarAgrPar
            }
            , new Object[] {
            T01B390_A199BarPie1, T01B390_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            T01B392_A396EmprCod, T01B392_A129BarCod, T01B392_A132BarCodReo, T01B392_A130BarCodPar
            }
            , new Object[] {
            T01B393_A129BarCod, T01B393_A132BarCodReo, T01B393_A130BarCodPar, T01B393_A200BarPieCod, T01B393_A60AlbRUniUti, T01B393_A54AlbRPieUti, T01B393_A58AlbRUniEnt, T01B393_A52AlbRPieEnt, T01B393_A47AlbREst, T01B393_A203BarPieKil,
            T01B393_A205BarPieMet, T01B393_A201BarPieEst, T01B393_A170BarKilLan, T01B393_A183BarMetLan, T01B393_A197BarPConTro, T01B393_A908PieOriCod, T01B393_A1271BarPieLzd, T01B393_A1501BarPiePie, T01B393_A46AlbREnt, T01B393_A4296ClasDsc,
            T01B393_n4296ClasDsc, T01B393_A971ProceNom, T01B393_n971ProceNom, T01B393_A396EmprCod, T01B393_A44AlbRecCod, T01B393_A970ProceCod, T01B393_n970ProceCod, T01B393_A4295ClasCod, T01B393_n4295ClasCod
            }
            , new Object[] {
            T01B394_A396EmprCod, T01B394_A129BarCod, T01B394_A132BarCodReo, T01B394_A130BarCodPar, T01B394_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01B398_A396EmprCod, T01B398_A129BarCod, T01B398_A132BarCodReo, T01B398_A130BarCodPar, T01B398_A200BarPieCod, T01B398_A12913BarPieLDf
            }
            , new Object[] {
            T01B399_A396EmprCod, T01B399_A129BarCod, T01B399_A132BarCodReo, T01B399_A130BarCodPar, T01B399_A200BarPieCod, T01B399_A3858BarTroCod
            }
            , new Object[] {
            T01B3100_A396EmprCod, T01B3100_A30AlbProCod, T01B3100_A129BarCod, T01B3100_A132BarCodReo, T01B3100_A130BarCodPar, T01B3100_A200BarPieCod
            }
            , new Object[] {
            T01B3101_A396EmprCod, T01B3101_A129BarCod, T01B3101_A132BarCodReo, T01B3101_A130BarCodPar, T01B3101_A200BarPieCod
            }
            , new Object[] {
            T01B3102_A407EmprNom, T01B3102_n407EmprNom
            }
         }
      );
      Z130BarCodPar = "" ;
      n130BarCodPar = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      Z132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      Z129BarCod = 0 ;
      n129BarCod = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Z201BarPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A47AlbREst ;
   private byte A201BarPieEst ;
   private byte Gx_BScreen ;
   private byte Z47AlbREst ;
   private byte GXv_int6[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ213BarSit ;
   private short Z864BarPes ;
   private short Z197BarPConTro ;
   private short nRcdDeleted_18 ;
   private short nRcdExists_18 ;
   private short nIsMod_18 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A199BarPie1 ;
   private short A864BarPes ;
   private short nBlankRcdCount18 ;
   private short RcdFound18 ;
   private short nBlankRcdUsr18 ;
   private short A197BarPConTro ;
   private short A4295ClasCod ;
   private short A970ProceCod ;
   private short Z199BarPie1 ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short Z970ProceCod ;
   private short Z4295ClasCod ;
   private short nIsDirty_18 ;
   private short ZZ199BarPie1 ;
   private short ZZ864BarPes ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z136BarColNum ;
   private int Z361DisCod ;
   private int nRC_GXsfl_140 ;
   private int nGXsfl_140_idx=1 ;
   private int Z1271BarPieLzd ;
   private int Z1501BarPiePie ;
   private int Z44AlbRecCod ;
   private int O1501BarPiePie ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int A898BarPieNDes ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarMat_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtBarMtr_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtBarPie1_Enabled ;
   private int edtBarPes_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarPieNDes_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtavnRcdDeleted_18_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtBarPieKil_Enabled ;
   private int edtBarPieMet_Enabled ;
   private int edtBarPieEst_Enabled ;
   private int edtBarKilLan_Enabled ;
   private int edtBarMetLan_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtPieOriCod_Enabled ;
   private int edtBarPieLzd_Enabled ;
   private int edtBarPiePie_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int edtClasCod_Enabled ;
   private int edtClasDsc_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV19BarPieAnt ;
   private int s198BarPie ;
   private int O198BarPie ;
   private int A44AlbRecCod ;
   private int A51AlbRPieDis ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A1271BarPieLzd ;
   private int A1501BarPiePie ;
   private int T1501BarPiePie ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int Z54AlbRPieUti ;
   private int Z52AlbRPieEnt ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbRecCod_Enabled ;
   private int defedtBarPieCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarSerDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtBarPieNDes_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtBarPes_Backcolor ;
   private int edtBarPie1_Backcolor ;
   private int edtBarPie_Backcolor ;
   private int edtDisUniMed_Backcolor ;
   private int edtBarMtr_Backcolor ;
   private int edtBarKgm_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarMat_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int5[] ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int GXv_int7[] ;
   private int Z198BarPie ;
   private int ZZ129BarCod ;
   private int ZZ136BarColNum ;
   private int ZZ361DisCod ;
   private int ZZ898BarPieNDes ;
   private int ZZ252CliCod ;
   private int ZZ198BarPie ;
   private int ZV19BarPieAnt ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O184BarMtr ;
   private java.math.BigDecimal O166BarKgm ;
   private java.math.BigDecimal Z203BarPieKil ;
   private java.math.BigDecimal Z205BarPieMet ;
   private java.math.BigDecimal Z170BarKilLan ;
   private java.math.BigDecimal Z183BarMetLan ;
   private java.math.BigDecimal O205BarPieMet ;
   private java.math.BigDecimal O203BarPieKil ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal B184BarMtr ;
   private java.math.BigDecimal B166BarKgm ;
   private java.math.BigDecimal AV17KilAnt ;
   private java.math.BigDecimal AV18MtrAnt ;
   private java.math.BigDecimal s184BarMtr ;
   private java.math.BigDecimal s166BarKgm ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal T205BarPieMet ;
   private java.math.BigDecimal T203BarPieKil ;
   private java.math.BigDecimal Z166BarKgm ;
   private java.math.BigDecimal Z184BarMtr ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZZ166BarKgm ;
   private java.math.BigDecimal ZZ184BarMtr ;
   private java.math.BigDecimal ZO184BarMtr ;
   private java.math.BigDecimal ZO166BarKgm ;
   private java.math.BigDecimal ZV17KilAnt ;
   private java.math.BigDecimal ZV18MtrAnt ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z143BarDisNum ;
   private String Z212BarSer ;
   private String Z182BarMat ;
   private String Z135BarColNom ;
   private String Z120BarAgrEst ;
   private String Z1652BarSerDsc ;
   private String Z200BarPieCod ;
   private String Z908PieOriCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarTipCol_Internalname ;
   private String sGXsfl_140_idx="0001" ;
   private String Gx_mode ;
   private String A365DisDes ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarMat_Internalname ;
   private String A182BarMat ;
   private String edtBarMat_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarKgm_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarMtr_Internalname ;
   private String edtBarMtr_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarPie1_Internalname ;
   private String edtBarPie1_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarPes_Internalname ;
   private String edtBarPes_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarPieNDes_Internalname ;
   private String edtBarPieNDes_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String sMode18 ;
   private String edtavnRcdDeleted_18_Internalname ;
   private String edtBarPieCod_Title ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbRecCod_Title ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtBarPieKil_Title ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPieEst_Internalname ;
   private String edtBarKilLan_Internalname ;
   private String edtBarMetLan_Internalname ;
   private String edtBarPConTro_Internalname ;
   private String edtPieOriCod_Internalname ;
   private String edtBarPieLzd_Internalname ;
   private String edtBarPiePie_Title ;
   private String edtBarPiePie_Internalname ;
   private String edtAlbREnt_Internalname ;
   private String edtClasCod_Internalname ;
   private String edtClasDsc_Internalname ;
   private String edtProceCod_Internalname ;
   private String edtProceNom_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String AV33Lit12 ;
   private String AV34Lit13 ;
   private String AV35Lit14 ;
   private String AV37Lit16 ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A200BarPieCod ;
   private String A908PieOriCod ;
   private String A46AlbREnt ;
   private String A4296ClasDsc ;
   private String A971ProceNom ;
   private String AV40LitFe ;
   private String AV21Lit0 ;
   private String AV22Lit1 ;
   private String AV23Lit2 ;
   private String AV24Lit3 ;
   private String AV25Lit4 ;
   private String AV26Lit5 ;
   private String AV27Lit6 ;
   private String AV28Lit7 ;
   private String AV29Lit8 ;
   private String AV30Lit9 ;
   private String AV31Lit10 ;
   private String AV32Lit11 ;
   private String AV36Lit15 ;
   private String AV38Lit17 ;
   private String AV41lit18 ;
   private String AV48Lit21 ;
   private String GXt_char1 ;
   private String AV42Station ;
   private String AV43EmprCod ;
   private String AV44EmprNom ;
   private String AV39UsurCod ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z392DisUniMed ;
   private String Z279CliNom ;
   private String Z46AlbREnt ;
   private String Z971ProceNom ;
   private String Z4296ClasDsc ;
   private String sGXsfl_140_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_18_Jsonclick ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPieEst_Jsonclick ;
   private String edtBarKilLan_Jsonclick ;
   private String edtBarMetLan_Jsonclick ;
   private String edtBarPConTro_Jsonclick ;
   private String edtPieOriCod_Jsonclick ;
   private String edtBarPieLzd_Jsonclick ;
   private String edtBarPiePie_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtClasCod_Jsonclick ;
   private String edtClasDsc_Jsonclick ;
   private String edtProceCod_Jsonclick ;
   private String edtProceNom_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ143BarDisNum ;
   private String ZZ212BarSer ;
   private String ZZ182BarMat ;
   private String ZZ135BarColNom ;
   private String ZZ120BarAgrEst ;
   private String ZZ407EmprNom ;
   private String ZZ1652BarSerDsc ;
   private String ZZ392DisUniMed ;
   private String ZZ365DisDes ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_140_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n970ProceCod ;
   private boolean n4295ClasCod ;
   private boolean n971ProceNom ;
   private boolean n4296ClasDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T01B38_A166BarKgm ;
   private java.math.BigDecimal[] T01B38_A184BarMtr ;
   private short[] T01B38_A199BarPie1 ;
   private int[] T01B38_A898BarPieNDes ;
   private String[] T01B311_A407EmprNom ;
   private boolean[] T01B311_n407EmprNom ;
   private String[] T01B315_A2759BarMaqGru ;
   private int[] T01B315_A129BarCod ;
   private boolean[] T01B315_n129BarCod ;
   private byte[] T01B315_A132BarCodReo ;
   private boolean[] T01B315_n132BarCodReo ;
   private String[] T01B315_A130BarCodPar ;
   private boolean[] T01B315_n130BarCodPar ;
   private String[] T01B315_A180BarMaqCod ;
   private String[] T01B315_A143BarDisNum ;
   private int[] T01B315_A252CliCod ;
   private boolean[] T01B315_n252CliCod ;
   private String[] T01B315_A279CliNom ;
   private String[] T01B315_A212BarSer ;
   private String[] T01B315_A182BarMat ;
   private String[] T01B315_A135BarColNom ;
   private int[] T01B315_A136BarColNum ;
   private byte[] T01B315_A218BarTipCol ;
   private String[] T01B315_A392DisUniMed ;
   private short[] T01B315_A864BarPes ;
   private byte[] T01B315_A213BarSit ;
   private String[] T01B315_A120BarAgrEst ;
   private String[] T01B315_A407EmprNom ;
   private boolean[] T01B315_n407EmprNom ;
   private String[] T01B315_A1652BarSerDsc ;
   private String[] T01B315_A365DisDes ;
   private String[] T01B315_A396EmprCod ;
   private boolean[] T01B315_n396EmprCod ;
   private int[] T01B315_A361DisCod ;
   private java.math.BigDecimal[] T01B315_A166BarKgm ;
   private java.math.BigDecimal[] T01B315_A184BarMtr ;
   private short[] T01B315_A199BarPie1 ;
   private int[] T01B315_A898BarPieNDes ;
   private int[] T01B312_A252CliCod ;
   private boolean[] T01B312_n252CliCod ;
   private String[] T01B312_A392DisUniMed ;
   private String[] T01B312_A365DisDes ;
   private String[] T01B313_A279CliNom ;
   private int[] T01B316_A252CliCod ;
   private boolean[] T01B316_n252CliCod ;
   private String[] T01B316_A392DisUniMed ;
   private String[] T01B316_A365DisDes ;
   private String[] T01B317_A279CliNom ;
   private String[] T01B318_A396EmprCod ;
   private boolean[] T01B318_n396EmprCod ;
   private int[] T01B318_A129BarCod ;
   private boolean[] T01B318_n129BarCod ;
   private byte[] T01B318_A132BarCodReo ;
   private boolean[] T01B318_n132BarCodReo ;
   private String[] T01B318_A130BarCodPar ;
   private boolean[] T01B318_n130BarCodPar ;
   private String[] T01B310_A2759BarMaqGru ;
   private int[] T01B310_A129BarCod ;
   private boolean[] T01B310_n129BarCod ;
   private byte[] T01B310_A132BarCodReo ;
   private boolean[] T01B310_n132BarCodReo ;
   private String[] T01B310_A130BarCodPar ;
   private boolean[] T01B310_n130BarCodPar ;
   private String[] T01B310_A180BarMaqCod ;
   private String[] T01B310_A143BarDisNum ;
   private String[] T01B310_A212BarSer ;
   private String[] T01B310_A182BarMat ;
   private String[] T01B310_A135BarColNom ;
   private int[] T01B310_A136BarColNum ;
   private byte[] T01B310_A218BarTipCol ;
   private short[] T01B310_A864BarPes ;
   private byte[] T01B310_A213BarSit ;
   private String[] T01B310_A120BarAgrEst ;
   private String[] T01B310_A1652BarSerDsc ;
   private String[] T01B310_A396EmprCod ;
   private boolean[] T01B310_n396EmprCod ;
   private int[] T01B310_A361DisCod ;
   private int[] T01B310_A252CliCod ;
   private boolean[] T01B310_n252CliCod ;
   private String[] T01B310_A365DisDes ;
   private String[] T01B319_A396EmprCod ;
   private boolean[] T01B319_n396EmprCod ;
   private int[] T01B319_A129BarCod ;
   private boolean[] T01B319_n129BarCod ;
   private byte[] T01B319_A132BarCodReo ;
   private boolean[] T01B319_n132BarCodReo ;
   private String[] T01B319_A130BarCodPar ;
   private boolean[] T01B319_n130BarCodPar ;
   private String[] T01B320_A396EmprCod ;
   private boolean[] T01B320_n396EmprCod ;
   private int[] T01B320_A129BarCod ;
   private boolean[] T01B320_n129BarCod ;
   private byte[] T01B320_A132BarCodReo ;
   private boolean[] T01B320_n132BarCodReo ;
   private String[] T01B320_A130BarCodPar ;
   private boolean[] T01B320_n130BarCodPar ;
   private String[] T01B39_A2759BarMaqGru ;
   private int[] T01B39_A129BarCod ;
   private boolean[] T01B39_n129BarCod ;
   private byte[] T01B39_A132BarCodReo ;
   private boolean[] T01B39_n132BarCodReo ;
   private String[] T01B39_A130BarCodPar ;
   private boolean[] T01B39_n130BarCodPar ;
   private String[] T01B39_A180BarMaqCod ;
   private String[] T01B39_A143BarDisNum ;
   private String[] T01B39_A212BarSer ;
   private String[] T01B39_A182BarMat ;
   private String[] T01B39_A135BarColNom ;
   private int[] T01B39_A136BarColNum ;
   private byte[] T01B39_A218BarTipCol ;
   private short[] T01B39_A864BarPes ;
   private byte[] T01B39_A213BarSit ;
   private String[] T01B39_A120BarAgrEst ;
   private String[] T01B39_A1652BarSerDsc ;
   private String[] T01B39_A396EmprCod ;
   private boolean[] T01B39_n396EmprCod ;
   private int[] T01B39_A361DisCod ;
   private int[] T01B39_A252CliCod ;
   private boolean[] T01B39_n252CliCod ;
   private String[] T01B39_A365DisDes ;
   private int[] T01B324_A252CliCod ;
   private boolean[] T01B324_n252CliCod ;
   private String[] T01B324_A392DisUniMed ;
   private String[] T01B324_A365DisDes ;
   private String[] T01B325_A279CliNom ;
   private long[] T01B326_A14681MRPrId ;
   private String[] T01B327_A5921XCjaDis ;
   private long[] T01B327_A5922XCjaCod ;
   private String[] T01B328_A396EmprCod ;
   private boolean[] T01B328_n396EmprCod ;
   private int[] T01B328_A129BarCod ;
   private boolean[] T01B328_n129BarCod ;
   private byte[] T01B328_A132BarCodReo ;
   private boolean[] T01B328_n132BarCodReo ;
   private String[] T01B328_A130BarCodPar ;
   private boolean[] T01B328_n130BarCodPar ;
   private short[] T01B328_A14152MEnvOrd ;
   private String[] T01B329_A396EmprCod ;
   private boolean[] T01B329_n396EmprCod ;
   private int[] T01B329_A129BarCod ;
   private boolean[] T01B329_n129BarCod ;
   private byte[] T01B329_A132BarCodReo ;
   private boolean[] T01B329_n132BarCodReo ;
   private String[] T01B329_A130BarCodPar ;
   private boolean[] T01B329_n130BarCodPar ;
   private String[] T01B329_A13905BarTraID ;
   private String[] T01B330_A396EmprCod ;
   private boolean[] T01B330_n396EmprCod ;
   private int[] T01B330_A129BarCod ;
   private boolean[] T01B330_n129BarCod ;
   private byte[] T01B330_A132BarCodReo ;
   private boolean[] T01B330_n132BarCodReo ;
   private String[] T01B330_A130BarCodPar ;
   private boolean[] T01B330_n130BarCodPar ;
   private byte[] T01B330_A13093BarDGLin ;
   private String[] T01B330_A13094BarDGDibCl ;
   private int[] T01B330_A13095BarDGDibIn ;
   private String[] T01B330_A13096BarDGComb ;
   private String[] T01B330_A13097BarDGFOndo ;
   private String[] T01B331_A396EmprCod ;
   private boolean[] T01B331_n396EmprCod ;
   private int[] T01B331_A11917Ebd_numero ;
   private String[] T01B332_A396EmprCod ;
   private boolean[] T01B332_n396EmprCod ;
   private int[] T01B332_A11898Prd_numero ;
   private String[] T01B333_A396EmprCod ;
   private boolean[] T01B333_n396EmprCod ;
   private int[] T01B333_A11849Cte_numero ;
   private String[] T01B334_A396EmprCod ;
   private boolean[] T01B334_n396EmprCod ;
   private int[] T01B334_A11791Ap_numero ;
   private String[] T01B335_A396EmprCod ;
   private boolean[] T01B335_n396EmprCod ;
   private int[] T01B335_A3985CalBarCod ;
   private byte[] T01B335_A3986CalBarCodR ;
   private String[] T01B335_A3987CalBarCodP ;
   private String[] T01B336_A396EmprCod ;
   private boolean[] T01B336_n396EmprCod ;
   private java.util.Date[] T01B336_A5294InPTime ;
   private int[] T01B336_A652OpeCod ;
   private String[] T01B337_A396EmprCod ;
   private boolean[] T01B337_n396EmprCod ;
   private int[] T01B337_A129BarCod ;
   private boolean[] T01B337_n129BarCod ;
   private byte[] T01B337_A132BarCodReo ;
   private boolean[] T01B337_n132BarCodReo ;
   private String[] T01B337_A130BarCodPar ;
   private boolean[] T01B337_n130BarCodPar ;
   private int[] T01B337_A4118tinagrcod ;
   private byte[] T01B337_A4119tinagrreo ;
   private String[] T01B337_A4120tinagrpar ;
   private String[] T01B338_A396EmprCod ;
   private boolean[] T01B338_n396EmprCod ;
   private int[] T01B338_A129BarCod ;
   private boolean[] T01B338_n129BarCod ;
   private byte[] T01B338_A132BarCodReo ;
   private boolean[] T01B338_n132BarCodReo ;
   private String[] T01B338_A130BarCodPar ;
   private boolean[] T01B338_n130BarCodPar ;
   private int[] T01B338_A4080estagrcod ;
   private byte[] T01B338_A4081estagrreo ;
   private String[] T01B338_A4082estagrpar ;
   private String[] T01B339_A396EmprCod ;
   private boolean[] T01B339_n396EmprCod ;
   private int[] T01B339_A129BarCod ;
   private boolean[] T01B339_n129BarCod ;
   private byte[] T01B339_A132BarCodReo ;
   private boolean[] T01B339_n132BarCodReo ;
   private String[] T01B339_A130BarCodPar ;
   private boolean[] T01B339_n130BarCodPar ;
   private byte[] T01B339_A4075recestncol ;
   private byte[] T01B339_A4076recestnpro ;
   private String[] T01B340_A396EmprCod ;
   private boolean[] T01B340_n396EmprCod ;
   private String[] T01B340_A602MaqCod ;
   private String[] T01B340_A1142MaqFCod ;
   private short[] T01B340_A3068PlaEtaOrd ;
   private byte[] T01B340_A3069PlaEtaOrdA ;
   private int[] T01B340_A129BarCod ;
   private boolean[] T01B340_n129BarCod ;
   private byte[] T01B340_A132BarCodReo ;
   private boolean[] T01B340_n132BarCodReo ;
   private String[] T01B340_A130BarCodPar ;
   private boolean[] T01B340_n130BarCodPar ;
   private String[] T01B341_A396EmprCod ;
   private boolean[] T01B341_n396EmprCod ;
   private int[] T01B341_A129BarCod ;
   private boolean[] T01B341_n129BarCod ;
   private byte[] T01B341_A132BarCodReo ;
   private boolean[] T01B341_n132BarCodReo ;
   private String[] T01B341_A130BarCodPar ;
   private boolean[] T01B341_n130BarCodPar ;
   private short[] T01B341_A4846BarAudLin ;
   private String[] T01B342_A396EmprCod ;
   private boolean[] T01B342_n396EmprCod ;
   private int[] T01B342_A129BarCod ;
   private boolean[] T01B342_n129BarCod ;
   private byte[] T01B342_A132BarCodReo ;
   private boolean[] T01B342_n132BarCodReo ;
   private String[] T01B342_A130BarCodPar ;
   private boolean[] T01B342_n130BarCodPar ;
   private short[] T01B342_A3940BarEnsLin ;
   private String[] T01B343_A396EmprCod ;
   private boolean[] T01B343_n396EmprCod ;
   private int[] T01B343_A129BarCod ;
   private boolean[] T01B343_n129BarCod ;
   private byte[] T01B343_A132BarCodReo ;
   private boolean[] T01B343_n132BarCodReo ;
   private String[] T01B343_A130BarCodPar ;
   private boolean[] T01B343_n130BarCodPar ;
   private int[] T01B343_A3384RefBarCod ;
   private byte[] T01B343_A3385RefBarReo ;
   private String[] T01B343_A3386RefBarPar ;
   private String[] T01B344_A396EmprCod ;
   private boolean[] T01B344_n396EmprCod ;
   private int[] T01B344_A10914SolSalCod ;
   private String[] T01B345_A396EmprCod ;
   private boolean[] T01B345_n396EmprCod ;
   private int[] T01B345_A10364Ph_numero ;
   private String[] T01B346_A396EmprCod ;
   private boolean[] T01B346_n396EmprCod ;
   private int[] T01B346_A129BarCod ;
   private boolean[] T01B346_n129BarCod ;
   private byte[] T01B346_A132BarCodReo ;
   private boolean[] T01B346_n132BarCodReo ;
   private String[] T01B346_A130BarCodPar ;
   private boolean[] T01B346_n130BarCodPar ;
   private String[] T01B346_A10197ProEspCod ;
   private String[] T01B347_A396EmprCod ;
   private boolean[] T01B347_n396EmprCod ;
   private int[] T01B347_A129BarCod ;
   private boolean[] T01B347_n129BarCod ;
   private byte[] T01B347_A132BarCodReo ;
   private boolean[] T01B347_n132BarCodReo ;
   private String[] T01B347_A130BarCodPar ;
   private boolean[] T01B347_n130BarCodPar ;
   private int[] T01B347_A5322Dp_Nrecep ;
   private String[] T01B348_A396EmprCod ;
   private boolean[] T01B348_n396EmprCod ;
   private int[] T01B348_A129BarCod ;
   private boolean[] T01B348_n129BarCod ;
   private byte[] T01B348_A132BarCodReo ;
   private boolean[] T01B348_n132BarCodReo ;
   private String[] T01B348_A130BarCodPar ;
   private boolean[] T01B348_n130BarCodPar ;
   private int[] T01B348_A8569EntSecLn ;
   private String[] T01B349_A396EmprCod ;
   private boolean[] T01B349_n396EmprCod ;
   private int[] T01B349_A7434PLLNro ;
   private short[] T01B349_A7443LPLNro ;
   private short[] T01B349_A7459CPLCom ;
   private int[] T01B349_A129BarCod ;
   private boolean[] T01B349_n129BarCod ;
   private byte[] T01B349_A132BarCodReo ;
   private boolean[] T01B349_n132BarCodReo ;
   private String[] T01B349_A130BarCodPar ;
   private boolean[] T01B349_n130BarCodPar ;
   private String[] T01B350_A396EmprCod ;
   private boolean[] T01B350_n396EmprCod ;
   private int[] T01B350_A7145OSSCod ;
   private String[] T01B351_A396EmprCod ;
   private boolean[] T01B351_n396EmprCod ;
   private int[] T01B351_A7049OGSCod ;
   private String[] T01B352_A396EmprCod ;
   private boolean[] T01B352_n396EmprCod ;
   private int[] T01B352_A129BarCod ;
   private boolean[] T01B352_n129BarCod ;
   private byte[] T01B352_A132BarCodReo ;
   private boolean[] T01B352_n132BarCodReo ;
   private String[] T01B352_A130BarCodPar ;
   private boolean[] T01B352_n130BarCodPar ;
   private int[] T01B352_A6031Ac_Barcod ;
   private byte[] T01B352_A6032Ac_BarReo ;
   private String[] T01B352_A6033Ac_BarPar ;
   private String[] T01B353_A396EmprCod ;
   private boolean[] T01B353_n396EmprCod ;
   private int[] T01B353_A129BarCod ;
   private boolean[] T01B353_n129BarCod ;
   private byte[] T01B353_A132BarCodReo ;
   private boolean[] T01B353_n132BarCodReo ;
   private String[] T01B353_A130BarCodPar ;
   private boolean[] T01B353_n130BarCodPar ;
   private int[] T01B353_A5908PartPal ;
   private String[] T01B354_A396EmprCod ;
   private boolean[] T01B354_n396EmprCod ;
   private int[] T01B354_A129BarCod ;
   private boolean[] T01B354_n129BarCod ;
   private byte[] T01B354_A132BarCodReo ;
   private boolean[] T01B354_n132BarCodReo ;
   private String[] T01B354_A130BarCodPar ;
   private boolean[] T01B354_n130BarCodPar ;
   private byte[] T01B354_A2524DisComLin ;
   private String[] T01B354_A1056DisComCod ;
   private String[] T01B354_A1032FonCod ;
   private String[] T01B355_A396EmprCod ;
   private boolean[] T01B355_n396EmprCod ;
   private long[] T01B355_A1736AlbExtCod ;
   private int[] T01B355_A129BarCod ;
   private boolean[] T01B355_n129BarCod ;
   private byte[] T01B355_A132BarCodReo ;
   private boolean[] T01B355_n132BarCodReo ;
   private String[] T01B355_A130BarCodPar ;
   private boolean[] T01B355_n130BarCodPar ;
   private String[] T01B356_A396EmprCod ;
   private boolean[] T01B356_n396EmprCod ;
   private int[] T01B356_A129BarCod ;
   private boolean[] T01B356_n129BarCod ;
   private byte[] T01B356_A132BarCodReo ;
   private boolean[] T01B356_n132BarCodReo ;
   private String[] T01B356_A130BarCodPar ;
   private boolean[] T01B356_n130BarCodPar ;
   private int[] T01B356_A3753BarFoaCod ;
   private byte[] T01B356_A3754BarFoaReo ;
   private String[] T01B356_A3755BarFoaPar ;
   private String[] T01B357_A396EmprCod ;
   private boolean[] T01B357_n396EmprCod ;
   private int[] T01B357_A129BarCod ;
   private boolean[] T01B357_n129BarCod ;
   private byte[] T01B357_A132BarCodReo ;
   private boolean[] T01B357_n132BarCodReo ;
   private String[] T01B357_A130BarCodPar ;
   private boolean[] T01B357_n130BarCodPar ;
   private int[] T01B357_A3747BarPegCod ;
   private byte[] T01B357_A3748BarPegReo ;
   private String[] T01B357_A3749BarPegPar ;
   private String[] T01B358_A396EmprCod ;
   private boolean[] T01B358_n396EmprCod ;
   private int[] T01B358_A3253SolTraCod ;
   private String[] T01B359_A396EmprCod ;
   private boolean[] T01B359_n396EmprCod ;
   private int[] T01B359_A3235SolSubCod ;
   private String[] T01B360_A396EmprCod ;
   private boolean[] T01B360_n396EmprCod ;
   private int[] T01B360_A3218SolLuzCod ;
   private String[] T01B361_A396EmprCod ;
   private boolean[] T01B361_n396EmprCod ;
   private int[] T01B361_A3196SolFriCod ;
   private String[] T01B362_A396EmprCod ;
   private boolean[] T01B362_n396EmprCod ;
   private int[] T01B362_A3165SolPilCod ;
   private String[] T01B363_A396EmprCod ;
   private boolean[] T01B363_n396EmprCod ;
   private int[] T01B363_A129BarCod ;
   private boolean[] T01B363_n129BarCod ;
   private byte[] T01B363_A132BarCodReo ;
   private boolean[] T01B363_n132BarCodReo ;
   private String[] T01B363_A130BarCodPar ;
   private boolean[] T01B363_n130BarCodPar ;
   private short[] T01B363_A2872HAnRLinMaq ;
   private byte[] T01B363_A2873HAnRLinPro ;
   private short[] T01B363_A2874HAnRLin ;
   private byte[] T01B363_A2875HAnNumAny ;
   private String[] T01B364_A396EmprCod ;
   private boolean[] T01B364_n396EmprCod ;
   private String[] T01B364_A2817PlaTer ;
   private short[] T01B364_A2818PlaOrd ;
   private String[] T01B365_A396EmprCod ;
   private boolean[] T01B365_n396EmprCod ;
   private String[] T01B365_A2809MetTerCod ;
   private int[] T01B365_A129BarCod ;
   private boolean[] T01B365_n129BarCod ;
   private byte[] T01B365_A132BarCodReo ;
   private boolean[] T01B365_n132BarCodReo ;
   private String[] T01B365_A130BarCodPar ;
   private boolean[] T01B365_n130BarCodPar ;
   private String[] T01B366_A396EmprCod ;
   private boolean[] T01B366_n396EmprCod ;
   private int[] T01B366_A129BarCod ;
   private boolean[] T01B366_n129BarCod ;
   private byte[] T01B366_A132BarCodReo ;
   private boolean[] T01B366_n132BarCodReo ;
   private String[] T01B366_A130BarCodPar ;
   private boolean[] T01B366_n130BarCodPar ;
   private short[] T01B366_A2808RecLinMAL ;
   private byte[] T01B366_A1377RecNumAny ;
   private String[] T01B366_A719PrdNum ;
   private String[] T01B367_A396EmprCod ;
   private boolean[] T01B367_n396EmprCod ;
   private int[] T01B367_A129BarCod ;
   private boolean[] T01B367_n129BarCod ;
   private byte[] T01B367_A132BarCodReo ;
   private boolean[] T01B367_n132BarCodReo ;
   private String[] T01B367_A130BarCodPar ;
   private boolean[] T01B367_n130BarCodPar ;
   private short[] T01B367_A2804RecLinMaq ;
   private String[] T01B368_A396EmprCod ;
   private boolean[] T01B368_n396EmprCod ;
   private String[] T01B368_A2792TermiCod ;
   private int[] T01B368_A129BarCod ;
   private boolean[] T01B368_n129BarCod ;
   private byte[] T01B368_A132BarCodReo ;
   private boolean[] T01B368_n132BarCodReo ;
   private String[] T01B368_A130BarCodPar ;
   private boolean[] T01B368_n130BarCodPar ;
   private String[] T01B369_A396EmprCod ;
   private boolean[] T01B369_n396EmprCod ;
   private short[] T01B369_A2248ManCod ;
   private java.util.Date[] T01B369_A2711RpExHdFe ;
   private short[] T01B369_A2713RpExHdLi ;
   private String[] T01B370_A396EmprCod ;
   private boolean[] T01B370_n396EmprCod ;
   private short[] T01B370_A2248ManCod ;
   private String[] T01B370_A2689ExHdrFas ;
   private int[] T01B370_A2692ExHdrLin ;
   private String[] T01B371_A396EmprCod ;
   private boolean[] T01B371_n396EmprCod ;
   private int[] T01B371_A129BarCod ;
   private boolean[] T01B371_n129BarCod ;
   private byte[] T01B371_A132BarCodReo ;
   private boolean[] T01B371_n132BarCodReo ;
   private String[] T01B371_A130BarCodPar ;
   private boolean[] T01B371_n130BarCodPar ;
   private String[] T01B371_A2494BarDosPro ;
   private String[] T01B371_A719PrdNum ;
   private String[] T01B372_A396EmprCod ;
   private boolean[] T01B372_n396EmprCod ;
   private String[] T01B372_A602MaqCod ;
   private java.util.Date[] T01B372_A2461PlaFecTin ;
   private int[] T01B372_A129BarCod ;
   private boolean[] T01B372_n129BarCod ;
   private byte[] T01B372_A132BarCodReo ;
   private boolean[] T01B372_n132BarCodReo ;
   private String[] T01B372_A130BarCodPar ;
   private boolean[] T01B372_n130BarCodPar ;
   private String[] T01B373_A396EmprCod ;
   private boolean[] T01B373_n396EmprCod ;
   private int[] T01B373_A129BarCod ;
   private boolean[] T01B373_n129BarCod ;
   private byte[] T01B373_A132BarCodReo ;
   private boolean[] T01B373_n132BarCodReo ;
   private String[] T01B373_A130BarCodPar ;
   private boolean[] T01B373_n130BarCodPar ;
   private short[] T01B373_A2457BarObLin ;
   private String[] T01B374_A396EmprCod ;
   private boolean[] T01B374_n396EmprCod ;
   private int[] T01B374_A129BarCod ;
   private boolean[] T01B374_n129BarCod ;
   private byte[] T01B374_A132BarCodReo ;
   private boolean[] T01B374_n132BarCodReo ;
   private String[] T01B374_A130BarCodPar ;
   private boolean[] T01B374_n130BarCodPar ;
   private short[] T01B374_A2444BarEnLin ;
   private String[] T01B375_A396EmprCod ;
   private boolean[] T01B375_n396EmprCod ;
   private int[] T01B375_A2406ExhAlbCod ;
   private int[] T01B375_A129BarCod ;
   private boolean[] T01B375_n129BarCod ;
   private byte[] T01B375_A132BarCodReo ;
   private boolean[] T01B375_n132BarCodReo ;
   private String[] T01B375_A130BarCodPar ;
   private boolean[] T01B375_n130BarCodPar ;
   private String[] T01B376_A396EmprCod ;
   private boolean[] T01B376_n396EmprCod ;
   private int[] T01B376_A2253SalExtAlb ;
   private int[] T01B376_A129BarCod ;
   private boolean[] T01B376_n129BarCod ;
   private byte[] T01B376_A132BarCodReo ;
   private boolean[] T01B376_n132BarCodReo ;
   private String[] T01B376_A130BarCodPar ;
   private boolean[] T01B376_n130BarCodPar ;
   private String[] T01B377_A396EmprCod ;
   private boolean[] T01B377_n396EmprCod ;
   private long[] T01B377_A30AlbProCod ;
   private int[] T01B377_A129BarCod ;
   private boolean[] T01B377_n129BarCod ;
   private byte[] T01B377_A132BarCodReo ;
   private boolean[] T01B377_n132BarCodReo ;
   private String[] T01B377_A130BarCodPar ;
   private boolean[] T01B377_n130BarCodPar ;
   private String[] T01B378_A396EmprCod ;
   private boolean[] T01B378_n396EmprCod ;
   private int[] T01B378_A1348SolColCod ;
   private String[] T01B379_A396EmprCod ;
   private boolean[] T01B379_n396EmprCod ;
   private int[] T01B379_A1333EstDimCod ;
   private String[] T01B380_A396EmprCod ;
   private boolean[] T01B380_n396EmprCod ;
   private int[] T01B380_A1314EnsLabCod ;
   private String[] T01B381_A396EmprCod ;
   private boolean[] T01B381_n396EmprCod ;
   private int[] T01B381_A129BarCod ;
   private boolean[] T01B381_n129BarCod ;
   private byte[] T01B381_A132BarCodReo ;
   private boolean[] T01B381_n132BarCodReo ;
   private String[] T01B381_A130BarCodPar ;
   private boolean[] T01B381_n130BarCodPar ;
   private byte[] T01B381_A906ObsReoLin ;
   private String[] T01B382_A396EmprCod ;
   private boolean[] T01B382_n396EmprCod ;
   private int[] T01B382_A859CumCodCont ;
   private String[] T01B383_A396EmprCod ;
   private boolean[] T01B383_n396EmprCod ;
   private String[] T01B383_A602MaqCod ;
   private java.util.Date[] T01B383_A558HisProFec ;
   private int[] T01B383_A561HisProLin ;
   private String[] T01B384_A396EmprCod ;
   private boolean[] T01B384_n396EmprCod ;
   private int[] T01B384_A252CliCod ;
   private boolean[] T01B384_n252CliCod ;
   private String[] T01B384_A494ForSer ;
   private String[] T01B384_A482ForColNom ;
   private int[] T01B384_A483ForColNum ;
   private byte[] T01B384_A831TipColCod ;
   private String[] T01B385_A396EmprCod ;
   private boolean[] T01B385_n396EmprCod ;
   private long[] T01B385_A30AlbProCod ;
   private int[] T01B385_A129BarCod ;
   private boolean[] T01B385_n129BarCod ;
   private byte[] T01B385_A132BarCodReo ;
   private boolean[] T01B385_n132BarCodReo ;
   private String[] T01B385_A130BarCodPar ;
   private boolean[] T01B385_n130BarCodPar ;
   private String[] T01B385_A200BarPieCod ;
   private String[] T01B386_A396EmprCod ;
   private boolean[] T01B386_n396EmprCod ;
   private int[] T01B386_A129BarCod ;
   private boolean[] T01B386_n129BarCod ;
   private byte[] T01B386_A132BarCodReo ;
   private boolean[] T01B386_n132BarCodReo ;
   private String[] T01B386_A130BarCodPar ;
   private boolean[] T01B386_n130BarCodPar ;
   private byte[] T01B386_A188BarNotLin ;
   private String[] T01B387_A396EmprCod ;
   private boolean[] T01B387_n396EmprCod ;
   private int[] T01B387_A129BarCod ;
   private boolean[] T01B387_n129BarCod ;
   private byte[] T01B387_A132BarCodReo ;
   private boolean[] T01B387_n132BarCodReo ;
   private String[] T01B387_A130BarCodPar ;
   private boolean[] T01B387_n130BarCodPar ;
   private String[] T01B387_A758ProCod ;
   private String[] T01B388_A396EmprCod ;
   private boolean[] T01B388_n396EmprCod ;
   private int[] T01B388_A129BarCod ;
   private boolean[] T01B388_n129BarCod ;
   private byte[] T01B388_A132BarCodReo ;
   private boolean[] T01B388_n132BarCodReo ;
   private String[] T01B388_A130BarCodPar ;
   private boolean[] T01B388_n130BarCodPar ;
   private int[] T01B388_A119BarAgrCod ;
   private byte[] T01B388_A124BarAgrReo ;
   private String[] T01B388_A122BarAgrPar ;
   private short[] T01B390_A199BarPie1 ;
   private int[] T01B390_A898BarPieNDes ;
   private String[] T01B392_A396EmprCod ;
   private boolean[] T01B392_n396EmprCod ;
   private int[] T01B392_A129BarCod ;
   private boolean[] T01B392_n129BarCod ;
   private byte[] T01B392_A132BarCodReo ;
   private boolean[] T01B392_n132BarCodReo ;
   private String[] T01B392_A130BarCodPar ;
   private boolean[] T01B392_n130BarCodPar ;
   private java.math.BigDecimal[] T01B34_A60AlbRUniUti ;
   private int[] T01B34_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01B34_A58AlbRUniEnt ;
   private int[] T01B34_A52AlbRPieEnt ;
   private byte[] T01B34_A47AlbREst ;
   private String[] T01B34_A46AlbREnt ;
   private short[] T01B34_A970ProceCod ;
   private boolean[] T01B34_n970ProceCod ;
   private short[] T01B34_A4295ClasCod ;
   private boolean[] T01B34_n4295ClasCod ;
   private String[] T01B35_A971ProceNom ;
   private boolean[] T01B35_n971ProceNom ;
   private String[] T01B36_A4296ClasDsc ;
   private boolean[] T01B36_n4296ClasDsc ;
   private int[] T01B393_A129BarCod ;
   private boolean[] T01B393_n129BarCod ;
   private byte[] T01B393_A132BarCodReo ;
   private boolean[] T01B393_n132BarCodReo ;
   private String[] T01B393_A130BarCodPar ;
   private boolean[] T01B393_n130BarCodPar ;
   private String[] T01B393_A200BarPieCod ;
   private java.math.BigDecimal[] T01B393_A60AlbRUniUti ;
   private int[] T01B393_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01B393_A58AlbRUniEnt ;
   private int[] T01B393_A52AlbRPieEnt ;
   private byte[] T01B393_A47AlbREst ;
   private java.math.BigDecimal[] T01B393_A203BarPieKil ;
   private java.math.BigDecimal[] T01B393_A205BarPieMet ;
   private byte[] T01B393_A201BarPieEst ;
   private java.math.BigDecimal[] T01B393_A170BarKilLan ;
   private java.math.BigDecimal[] T01B393_A183BarMetLan ;
   private short[] T01B393_A197BarPConTro ;
   private String[] T01B393_A908PieOriCod ;
   private int[] T01B393_A1271BarPieLzd ;
   private int[] T01B393_A1501BarPiePie ;
   private String[] T01B393_A46AlbREnt ;
   private String[] T01B393_A4296ClasDsc ;
   private boolean[] T01B393_n4296ClasDsc ;
   private String[] T01B393_A971ProceNom ;
   private boolean[] T01B393_n971ProceNom ;
   private String[] T01B393_A396EmprCod ;
   private boolean[] T01B393_n396EmprCod ;
   private int[] T01B393_A44AlbRecCod ;
   private short[] T01B393_A970ProceCod ;
   private boolean[] T01B393_n970ProceCod ;
   private short[] T01B393_A4295ClasCod ;
   private boolean[] T01B393_n4295ClasCod ;
   private String[] T01B394_A396EmprCod ;
   private boolean[] T01B394_n396EmprCod ;
   private int[] T01B394_A129BarCod ;
   private boolean[] T01B394_n129BarCod ;
   private byte[] T01B394_A132BarCodReo ;
   private boolean[] T01B394_n132BarCodReo ;
   private String[] T01B394_A130BarCodPar ;
   private boolean[] T01B394_n130BarCodPar ;
   private String[] T01B394_A200BarPieCod ;
   private int[] T01B33_A129BarCod ;
   private boolean[] T01B33_n129BarCod ;
   private byte[] T01B33_A132BarCodReo ;
   private boolean[] T01B33_n132BarCodReo ;
   private String[] T01B33_A130BarCodPar ;
   private boolean[] T01B33_n130BarCodPar ;
   private String[] T01B33_A200BarPieCod ;
   private java.math.BigDecimal[] T01B33_A203BarPieKil ;
   private java.math.BigDecimal[] T01B33_A205BarPieMet ;
   private byte[] T01B33_A201BarPieEst ;
   private java.math.BigDecimal[] T01B33_A170BarKilLan ;
   private java.math.BigDecimal[] T01B33_A183BarMetLan ;
   private short[] T01B33_A197BarPConTro ;
   private String[] T01B33_A908PieOriCod ;
   private int[] T01B33_A1271BarPieLzd ;
   private int[] T01B33_A1501BarPiePie ;
   private String[] T01B33_A396EmprCod ;
   private boolean[] T01B33_n396EmprCod ;
   private int[] T01B33_A44AlbRecCod ;
   private int[] T01B32_A129BarCod ;
   private boolean[] T01B32_n129BarCod ;
   private byte[] T01B32_A132BarCodReo ;
   private boolean[] T01B32_n132BarCodReo ;
   private String[] T01B32_A130BarCodPar ;
   private boolean[] T01B32_n130BarCodPar ;
   private String[] T01B32_A200BarPieCod ;
   private java.math.BigDecimal[] T01B32_A203BarPieKil ;
   private java.math.BigDecimal[] T01B32_A205BarPieMet ;
   private byte[] T01B32_A201BarPieEst ;
   private java.math.BigDecimal[] T01B32_A170BarKilLan ;
   private java.math.BigDecimal[] T01B32_A183BarMetLan ;
   private short[] T01B32_A197BarPConTro ;
   private String[] T01B32_A908PieOriCod ;
   private int[] T01B32_A1271BarPieLzd ;
   private int[] T01B32_A1501BarPiePie ;
   private String[] T01B32_A396EmprCod ;
   private boolean[] T01B32_n396EmprCod ;
   private int[] T01B32_A44AlbRecCod ;
   private String[] T01B398_A396EmprCod ;
   private boolean[] T01B398_n396EmprCod ;
   private int[] T01B398_A129BarCod ;
   private boolean[] T01B398_n129BarCod ;
   private byte[] T01B398_A132BarCodReo ;
   private boolean[] T01B398_n132BarCodReo ;
   private String[] T01B398_A130BarCodPar ;
   private boolean[] T01B398_n130BarCodPar ;
   private String[] T01B398_A200BarPieCod ;
   private short[] T01B398_A12913BarPieLDf ;
   private String[] T01B399_A396EmprCod ;
   private boolean[] T01B399_n396EmprCod ;
   private int[] T01B399_A129BarCod ;
   private boolean[] T01B399_n129BarCod ;
   private byte[] T01B399_A132BarCodReo ;
   private boolean[] T01B399_n132BarCodReo ;
   private String[] T01B399_A130BarCodPar ;
   private boolean[] T01B399_n130BarCodPar ;
   private String[] T01B399_A200BarPieCod ;
   private short[] T01B399_A3858BarTroCod ;
   private String[] T01B3100_A396EmprCod ;
   private boolean[] T01B3100_n396EmprCod ;
   private long[] T01B3100_A30AlbProCod ;
   private int[] T01B3100_A129BarCod ;
   private boolean[] T01B3100_n129BarCod ;
   private byte[] T01B3100_A132BarCodReo ;
   private boolean[] T01B3100_n132BarCodReo ;
   private String[] T01B3100_A130BarCodPar ;
   private boolean[] T01B3100_n130BarCodPar ;
   private String[] T01B3100_A200BarPieCod ;
   private String[] T01B3101_A396EmprCod ;
   private boolean[] T01B3101_n396EmprCod ;
   private int[] T01B3101_A129BarCod ;
   private boolean[] T01B3101_n129BarCod ;
   private byte[] T01B3101_A132BarCodReo ;
   private boolean[] T01B3101_n132BarCodReo ;
   private String[] T01B3101_A130BarCodPar ;
   private boolean[] T01B3101_n130BarCodPar ;
   private String[] T01B3101_A200BarPieCod ;
   private String[] T01B3102_A407EmprNom ;
   private boolean[] T01B3102_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbarpil__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpil__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpil__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpil__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01B32", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B33", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B34", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbREst, AlbREnt, ProceCod, ClasCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B35", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B36", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B38", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B39", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarSerDsc, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarMaqGru, BarMaqCod, BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarSerDsc, DisCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B310", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarSerDsc, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B311", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B312", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B313", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B315", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.BarDisNum, TM1.CliCod, T5.CliNom, TM1.BarSer, TM1.BarMat, TM1.BarColNom, TM1.BarColNum, TM1.BarTipCol, T4.DisUniMed, TM1.BarPes, TM1.BarSit, TM1.BarAgrEst, T2.EmprNom, TM1.BarSerDsc, TM1.DisDes, TM1.EmprCod, TM1.DisCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) INNER JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = TM1.DisCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B316", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B317", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B318", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B319", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B320", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01B321", "INSERT INTO TXPBARCAD(CliCod, DisDes, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarSer, BarMat, BarColNom, BarColNum, BarTipCol, BarPes, BarSit, BarAgrEst, BarSerDsc, EmprCod, DisCod, BarVolMaq, BarTipArt, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01B322", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, BarMaqGru=?, BarMaqCod=?, BarDisNum=?, BarSer=?, BarMat=?, BarColNom=?, BarColNum=?, BarTipCol=?, BarPes=?, BarSit=?, BarAgrEst=?, BarSerDsc=?, DisCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01B323", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01B324", "SELECT CliCod, DisUniMed, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B325", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B326", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B327", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B328", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B329", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B330", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B331", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B332", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B333", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B334", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B335", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B336", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B337", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B338", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B339", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B340", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B341", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B342", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B343", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B344", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B345", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B346", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B347", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B348", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B349", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B350", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B351", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B352", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B353", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B354", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B355", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B356", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B357", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B358", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B359", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B360", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B361", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B362", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B363", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B364", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B365", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B366", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B367", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B368", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B369", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B370", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B371", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B372", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B373", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B374", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B375", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B376", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B377", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B378", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B379", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B380", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B381", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B382", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B383", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B384", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B385", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B386", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B387", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B388", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B390", "SELECT COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1, SUM(BarPiePie) AS BarPieNDes FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01B391", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01B392", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B393", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T2.AlbRUniUti, T2.AlbRPieUti, T2.AlbRUniEnt, T2.AlbRPieEnt, T2.AlbREst, T1.BarPieKil, T1.BarPieMet, T1.BarPieEst, T1.BarKilLan, T1.BarMetLan, T1.BarPConTro, T1.PieOriCod, T1.BarPieLzd, T1.BarPiePie, T2.AlbREnt, T4.ClasDsc, T3.ProceNom, T1.EmprCod, T1.AlbRecCod, T2.ProceCod, T2.ClasCod FROM (((TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) LEFT JOIN TXPCLAPEN T4 ON T4.EmprCod = T1.EmprCod AND T4.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B394", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01B395", "INSERT INTO TXPBARPIE(BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, EmprCod, AlbRecCod, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01B396", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?, BarPieEst=?, BarKilLan=?, BarMetLan=?, BarPConTro=?, PieOriCod=?, BarPieLzd=?, BarPiePie=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01B397", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01B398", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B399", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B3100", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B3101", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B3102", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 9);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 26);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 26);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 26);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((int[]) buf[27])[0] = rslt.getInt(26);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 85 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 88 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 9);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 3);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 97 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               stmt.setString(7, (String)parms[10], 6);
               stmt.setString(8, (String)parms[11], 8);
               stmt.setString(9, (String)parms[12], 16);
               stmt.setString(10, (String)parms[13], 16);
               stmt.setString(11, (String)parms[14], 13);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setByte(13, ((Number) parms[16]).byteValue());
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               stmt.setByte(15, ((Number) parms[18]).byteValue());
               stmt.setString(16, (String)parms[19], 1);
               stmt.setString(17, (String)parms[20], 26);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[22], 3);
               }
               stmt.setInt(19, ((Number) parms[23]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setString(5, (String)parms[5], 8);
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 13);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 26);
               stmt.setInt(15, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[23], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 86 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 88 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 89 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setString(11, (String)parms[13], 9);
               stmt.setInt(12, ((Number) parms[14]).intValue());
               stmt.setInt(13, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 3);
               }
               stmt.setInt(15, ((Number) parms[18]).intValue());
               return;
            case 91 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 1);
               }
               stmt.setString(15, (String)parms[18], 9);
               return;
            case 92 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 93 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 94 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 95 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 9);
               return;
            case 96 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 97 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

