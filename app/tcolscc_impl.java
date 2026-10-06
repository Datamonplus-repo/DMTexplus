package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcolscc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A9713Tb1_Cod = (short)(GXutil.lval( httpContext.GetPar( "Tb1_Cod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
         A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
         A11745CCArtdsc = httpContext.GetPar( "CCArtdsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
         A11748TipArtiId = (short)(GXutil.lval( httpContext.GetPar( "TipArtiId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
         A11746TipArtiDs = httpContext.GetPar( "TipArtiDs") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
         A11737CCColNom = httpContext.GetPar( "CCColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = (int)(GXutil.lval( httpContext.GetPar( "CCColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = (byte)(GXutil.lval( httpContext.GetPar( "CCCTc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_5_1HO1649( A396EmprCod, A252CliCod, A9713Tb1_Cod, A11736CCArtCod, A11745CCArtdsc, A11748TipArtiId, A11746TipArtiDs, A11737CCColNom, A11738CCColNum, A11749CCCTc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"TIPARTIDS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11748TipArtiId = (short)(GXutil.lval( httpContext.GetPar( "TipArtiId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asatipartids1HO1649( A396EmprCod, A11748TipArtiId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"CCARTDSC") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asaccartdsc1HO1649( A396EmprCod, A252CliCod, A11736CCArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"vOKCOL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
         A11737CCColNom = httpContext.GetPar( "CCColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = (int)(GXutil.lval( httpContext.GetPar( "CCColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = (byte)(GXutil.lval( httpContext.GetPar( "CCCTc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asaokcol1HO1649( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc) ;
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
            A9713Tb1_Cod = (short)(GXutil.lval( httpContext.GetPar( "Tb1_Cod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
            A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
            A11745CCArtdsc = httpContext.GetPar( "CCArtdsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
            A11748TipArtiId = (short)(GXutil.lval( httpContext.GetPar( "TipArtiId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
            A11746TipArtiDs = httpContext.GetPar( "TipArtiDs") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Colores Cuardeno Encargo CC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCColNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcolscc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcolscc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcolscc_impl.class ));
   }

   public tcolscc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TColsCC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTb1_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTb1_Cod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9713Tb1_Cod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9713Tb1_Cod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTb1_Cod_Jsonclick, 0, "", "", "", "", "", 1, edtTb1_Cod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTb1_Dsc_Internalname, GXutil.rtrim( A9715Tb1_Dsc), GXutil.rtrim( localUtil.format( A9715Tb1_Dsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTb1_Dsc_Jsonclick, 0, "", "", "", "", "", 1, edtTb1_Dsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCArtCod_Internalname, GXutil.rtrim( A11736CCArtCod), GXutil.rtrim( localUtil.format( A11736CCArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtCCArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCArtdsc_Internalname, GXutil.rtrim( A11745CCArtdsc), GXutil.rtrim( localUtil.format( A11745CCArtdsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCArtdsc_Jsonclick, 0, "", "", "", "", "", 1, edtCCArtdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtiId_Internalname, GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtiId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11748TipArtiId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11748TipArtiId), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtiId_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtiId_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtiDs_Internalname, GXutil.rtrim( A11746TipArtiDs), GXutil.rtrim( localUtil.format( A11746TipArtiDs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtiDs_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtiDs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11738CCColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11738CCColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCColNum_Jsonclick, 0, "", "", "", "", "", 1, edtCCColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCColNom_Internalname, GXutil.rtrim( A11737CCColNom), GXutil.rtrim( localUtil.format( A11737CCColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCColNom_Jsonclick, 0, "", "", "", "", "", 1, edtCCColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tc", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TColsCC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCCTc_Internalname, GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCCTc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11749CCCTc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A11749CCCTc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCCTc_Jsonclick, 0, "", "", "", "", "", 1, edtCCCTc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TColsCC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TColsCC.htm");
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
      e111HO2 ();
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
            Z9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "Z9713Tb1_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11736CCArtCod = httpContext.cgiGet( "Z11736CCArtCod") ;
            Z11748TipArtiId = (short)(localUtil.ctol( httpContext.cgiGet( "Z11748TipArtiId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11737CCColNom = httpContext.cgiGet( "Z11737CCColNom") ;
            Z11738CCColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z11738CCColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11749CCCTc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11749CCCTc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33OkCol = (byte)(localUtil.ctol( httpContext.cgiGet( "vOKCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtTb1_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
            A9715Tb1_Dsc = httpContext.cgiGet( edtTb1_Dsc_Internalname) ;
            n9715Tb1_Dsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", A9715Tb1_Dsc);
            A11736CCArtCod = httpContext.cgiGet( edtCCArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
            A11745CCArtdsc = httpContext.cgiGet( edtCCArtdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
            A11748TipArtiId = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtiId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
            A11746TipArtiDs = httpContext.cgiGet( edtTipArtiDs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11738CCColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
            }
            else
            {
               A11738CCColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtCCColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
            }
            A11737CCColNom = httpContext.cgiGet( edtCCColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCCTC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCCTc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11749CCCTc = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
            }
            else
            {
               A11749CCCTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCCTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A9713Tb1_Cod = (short)(GXutil.lval( httpContext.GetPar( "Tb1_Cod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
               A11736CCArtCod = httpContext.GetPar( "CCArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
               A11748TipArtiId = (short)(GXutil.lval( httpContext.GetPar( "TipArtiId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
               A11737CCColNom = httpContext.GetPar( "CCColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
               A11738CCColNum = (int)(GXutil.lval( httpContext.GetPar( "CCColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
               A11749CCCTc = (byte)(GXutil.lval( httpContext.GetPar( "CCCTc"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
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
                        e111HO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'INTENSIDAD'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Intensidad' */
                        e121HO2 ();
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
            initAll1HO1649( ) ;
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
      disableAttributes1HO1649( ) ;
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

   public void confirm_1HO0( )
   {
      beforeValidate1HO1649( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HO1649( ) ;
         }
         else
         {
            checkExtendedTable1HO1649( ) ;
            if ( AnyError == 0 )
            {
               zm1HO1649( 7) ;
               zm1HO1649( 8) ;
               zm1HO1649( 9) ;
               zm1HO1649( 10) ;
            }
            closeExtendedTableCursors1HO1649( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HO0( ) ;
      }
   }

   public void resetCaption1HO0( )
   {
   }

   public void e111HO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcolscc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tcolscc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcolscc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcolscc_impl.this.A396EmprCod = GXv_char2[0] ;
      tcolscc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcolscc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121HO2( )
   {
      /* 'Intensidad' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A252CliCod ;
         GXv_int6[0] = A9713Tb1_Cod ;
         GXv_char3[0] = A11736CCArtCod ;
         GXv_char2[0] = A11745CCArtdsc ;
         GXv_int7[0] = A11748TipArtiId ;
         GXv_char8[0] = A11746TipArtiDs ;
         GXv_char9[0] = A11737CCColNom ;
         GXv_int10[0] = A11738CCColNum ;
         GXv_int11[0] = A11749CCCTc ;
         new app.ppintcc(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11) ;
         tcolscc_impl.this.A396EmprCod = GXv_char4[0] ;
         tcolscc_impl.this.A252CliCod = GXv_int5[0] ;
         tcolscc_impl.this.A9713Tb1_Cod = GXv_int6[0] ;
         tcolscc_impl.this.A11736CCArtCod = GXv_char3[0] ;
         tcolscc_impl.this.A11745CCArtdsc = GXv_char2[0] ;
         tcolscc_impl.this.A11748TipArtiId = GXv_int7[0] ;
         tcolscc_impl.this.A11746TipArtiDs = GXv_char8[0] ;
         tcolscc_impl.this.A11737CCColNom = GXv_char9[0] ;
         tcolscc_impl.this.A11738CCColNum = GXv_int10[0] ;
         tcolscc_impl.this.A11749CCCTc = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
      }
      /*  Sending Event outputs  */
   }

   public void zm1HO1649( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -6 )
      {
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z9715Tb1_Dsc = A9715Tb1_Dsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TColsCC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T01HO4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HO4_A407EmprNom[0] ;
      n407EmprNom = T01HO4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01HO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01HO5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01HO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TB1_COD");
         AnyError = (short)(1) ;
      }
      A9715Tb1_Dsc = T01HO6_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01HO6_n9715Tb1_Dsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", A9715Tb1_Dsc);
      pr_default.close(4);
      /* Using cursor T01HO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTIID");
         AnyError = (short)(1) ;
      }
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_char1 = A11745CCArtdsc ;
         GXv_char9[0] = GXt_char1 ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
         tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
         A11745CCArtdsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
         GXt_char1 = A11746TipArtiDs ;
         GXv_char9[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
         tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
         A11746TipArtiDs = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
      }
   }

   public void load1HO1649( )
   {
      /* Using cursor T01HO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         A407EmprNom = T01HO8_A407EmprNom[0] ;
         n407EmprNom = T01HO8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01HO8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A9715Tb1_Dsc = T01HO8_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = T01HO8_n9715Tb1_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", A9715Tb1_Dsc);
         zm1HO1649( -6) ;
      }
      pr_default.close(6);
      onLoadActions1HO1649( ) ;
   }

   public void onLoadActions1HO1649( )
   {
      GXt_char1 = A11745CCArtdsc ;
      GXv_char9[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11745CCArtdsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
      GXt_char1 = A11746TipArtiDs ;
      GXv_char9[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11746TipArtiDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
      GXt_int12 = AV33OkCol ;
      GXv_int11[0] = GXt_int12 ;
      new app.pchkcolcc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc, GXv_int11) ;
      tcolscc_impl.this.GXt_int12 = GXv_int11[0] ;
      AV33OkCol = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.str( AV33OkCol, 1, 0));
   }

   public void checkExtendedTable1HO1649( )
   {
      nIsDirty_1649 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1649 = (short)(1) ;
      GXt_char1 = A11745CCArtdsc ;
      GXv_char9[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11745CCArtdsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
      nIsDirty_1649 = (short)(1) ;
      GXt_char1 = A11746TipArtiDs ;
      GXv_char9[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11746TipArtiDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
      GXt_int12 = AV33OkCol ;
      GXv_int11[0] = GXt_int12 ;
      new app.pchkcolcc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc, GXv_int11) ;
      tcolscc_impl.this.GXt_int12 = GXv_int11[0] ;
      AV33OkCol = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.str( AV33OkCol, 1, 0));
   }

   public void closeExtendedTableCursors1HO1649( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1HO1649( )
   {
      /* Using cursor T01HO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1649 = (short)(1) ;
      }
      else
      {
         RcdFound1649 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01HO3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HO3_A252CliCod[0] == A252CliCod ) && ( T01HO3_A9713Tb1_Cod[0] == A9713Tb1_Cod ) && ( GXutil.strcmp(T01HO3_A11736CCArtCod[0], A11736CCArtCod) == 0 ) && ( T01HO3_A11748TipArtiId[0] == A11748TipArtiId ) )
      {
         zm1HO1649( 6) ;
         RcdFound1649 = (short)(1) ;
         A11737CCColNom = T01HO3_A11737CCColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = T01HO3_A11738CCColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = T01HO3_A11749CCCTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z11736CCArtCod = A11736CCArtCod ;
         Z11748TipArtiId = A11748TipArtiId ;
         Z11737CCColNom = A11737CCColNom ;
         Z11738CCColNum = A11738CCColNum ;
         Z11749CCCTc = A11749CCCTc ;
         sMode1649 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HO1649( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1649 = (short)(0) ;
            initializeNonKey1HO1649( ) ;
         }
         Gx_mode = sMode1649 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1649 = (short)(0) ;
         initializeNonKey1HO1649( ) ;
         sMode1649 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1649 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HO1649( ) ;
      if ( RcdFound1649 == 0 )
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
      RcdFound1649 = (short)(0) ;
      /* Using cursor T01HO10 */
      pr_default.execute(8, new Object[] {A11737CCColNom, A11737CCColNom, Integer.valueOf(A11738CCColNum), Integer.valueOf(A11738CCColNum), A11737CCColNom, Byte.valueOf(A11749CCCTc), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) < 0 ) || ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO10_A11738CCColNum[0] < A11738CCColNum ) || ( T01HO10_A11738CCColNum[0] == A11738CCColNum ) && ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO10_A11749CCCTc[0] < A11749CCCTc ) ) && ( GXutil.strcmp(T01HO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HO10_A252CliCod[0] == A252CliCod ) && ( T01HO10_A9713Tb1_Cod[0] == A9713Tb1_Cod ) && ( GXutil.strcmp(T01HO10_A11736CCArtCod[0], A11736CCArtCod) == 0 ) && ( T01HO10_A11748TipArtiId[0] == A11748TipArtiId ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) > 0 ) || ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO10_A11738CCColNum[0] > A11738CCColNum ) || ( T01HO10_A11738CCColNum[0] == A11738CCColNum ) && ( GXutil.strcmp(T01HO10_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO10_A11749CCCTc[0] > A11749CCCTc ) ) && ( GXutil.strcmp(T01HO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HO10_A252CliCod[0] == A252CliCod ) && ( T01HO10_A9713Tb1_Cod[0] == A9713Tb1_Cod ) && ( GXutil.strcmp(T01HO10_A11736CCArtCod[0], A11736CCArtCod) == 0 ) && ( T01HO10_A11748TipArtiId[0] == A11748TipArtiId ) )
         {
            A11737CCColNom = T01HO10_A11737CCColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
            A11738CCColNum = T01HO10_A11738CCColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
            A11749CCCTc = T01HO10_A11749CCCTc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
            RcdFound1649 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1649 = (short)(0) ;
      /* Using cursor T01HO11 */
      pr_default.execute(9, new Object[] {A11737CCColNom, A11737CCColNom, Integer.valueOf(A11738CCColNum), Integer.valueOf(A11738CCColNum), A11737CCColNom, Byte.valueOf(A11749CCCTc), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) > 0 ) || ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO11_A11738CCColNum[0] > A11738CCColNum ) || ( T01HO11_A11738CCColNum[0] == A11738CCColNum ) && ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO11_A11749CCCTc[0] > A11749CCCTc ) ) && ( GXutil.strcmp(T01HO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HO11_A252CliCod[0] == A252CliCod ) && ( T01HO11_A9713Tb1_Cod[0] == A9713Tb1_Cod ) && ( GXutil.strcmp(T01HO11_A11736CCArtCod[0], A11736CCArtCod) == 0 ) && ( T01HO11_A11748TipArtiId[0] == A11748TipArtiId ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) < 0 ) || ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO11_A11738CCColNum[0] < A11738CCColNum ) || ( T01HO11_A11738CCColNum[0] == A11738CCColNum ) && ( GXutil.strcmp(T01HO11_A11737CCColNom[0], A11737CCColNom) == 0 ) && ( T01HO11_A11749CCCTc[0] < A11749CCCTc ) ) && ( GXutil.strcmp(T01HO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HO11_A252CliCod[0] == A252CliCod ) && ( T01HO11_A9713Tb1_Cod[0] == A9713Tb1_Cod ) && ( GXutil.strcmp(T01HO11_A11736CCArtCod[0], A11736CCArtCod) == 0 ) && ( T01HO11_A11748TipArtiId[0] == A11748TipArtiId ) )
         {
            A11737CCColNom = T01HO11_A11737CCColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
            A11738CCColNum = T01HO11_A11738CCColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
            A11749CCCTc = T01HO11_A11749CCCTc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
            RcdFound1649 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HO1649( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCColNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HO1649( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1649 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A9713Tb1_Cod != Z9713Tb1_Cod ) || ( GXutil.strcmp(A11736CCArtCod, Z11736CCArtCod) != 0 ) || ( A11748TipArtiId != Z11748TipArtiId ) || ( GXutil.strcmp(A11737CCColNom, Z11737CCColNom) != 0 ) || ( A11738CCColNum != Z11738CCColNum ) || ( A11749CCCTc != Z11749CCCTc ) )
            {
               A11737CCColNom = Z11737CCColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
               A11738CCColNum = Z11738CCColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
               A11749CCCTc = Z11749CCCTc ;
               httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1HO1649( ) ;
               GX_FocusControl = edtCCColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A9713Tb1_Cod != Z9713Tb1_Cod ) || ( GXutil.strcmp(A11736CCArtCod, Z11736CCArtCod) != 0 ) || ( A11748TipArtiId != Z11748TipArtiId ) || ( GXutil.strcmp(A11737CCColNom, Z11737CCColNom) != 0 ) || ( A11738CCColNum != Z11738CCColNum ) || ( A11749CCCTc != Z11749CCCTc ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCCColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HO1649( ) ;
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
                  GX_FocusControl = edtCCColNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1HO1649( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A9713Tb1_Cod != Z9713Tb1_Cod ) || ( GXutil.strcmp(A11736CCArtCod, Z11736CCArtCod) != 0 ) || ( A11748TipArtiId != Z11748TipArtiId ) || ( GXutil.strcmp(A11737CCColNom, Z11737CCColNom) != 0 ) || ( A11738CCColNum != Z11738CCColNum ) || ( A11749CCCTc != Z11749CCCTc ) )
      {
         A11737CCColNom = Z11737CCColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = Z11738CCColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = Z11749CCCTc ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCColNum_Internalname ;
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
      getKey1HO1649( ) ;
      if ( RcdFound1649 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A9713Tb1_Cod != Z9713Tb1_Cod ) || ( GXutil.strcmp(A11736CCArtCod, Z11736CCArtCod) != 0 ) || ( A11748TipArtiId != Z11748TipArtiId ) || ( GXutil.strcmp(A11737CCColNom, Z11737CCColNom) != 0 ) || ( A11738CCColNum != Z11738CCColNum ) || ( A11749CCCTc != Z11749CCCTc ) )
         {
            A11737CCColNom = Z11737CCColNom ;
            httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
            A11738CCColNum = Z11738CCColNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
            A11749CCCTc = Z11749CCCTc ;
            httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A9713Tb1_Cod != Z9713Tb1_Cod ) || ( GXutil.strcmp(A11736CCArtCod, Z11736CCArtCod) != 0 ) || ( A11748TipArtiId != Z11748TipArtiId ) || ( GXutil.strcmp(A11737CCColNom, Z11737CCColNom) != 0 ) || ( A11738CCColNum != Z11738CCColNum ) || ( A11749CCCTc != Z11749CCCTc ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcolscc");
   }

   public void insert_check( )
   {
      confirm_1HO0( ) ;
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
      if ( RcdFound1649 == 0 )
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
      scanStart1HO1649( ) ;
      if ( RcdFound1649 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HO1649( ) ;
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
      if ( RcdFound1649 == 0 )
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
      if ( RcdFound1649 == 0 )
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
      scanStart1HO1649( ) ;
      if ( RcdFound1649 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1649 != 0 )
         {
            scanNext1HO1649( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1HO1649( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HO1649( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCCno3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCCno3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HO1649( )
   {
      beforeValidate1HO1649( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HO1649( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HO1649( 0) ;
         checkOptimisticConcurrency1HO1649( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HO1649( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HO1649( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HO12 */
                  pr_default.execute(10, new Object[] {A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc), A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char9[0] = A396EmprCod ;
                        GXv_int10[0] = A252CliCod ;
                        GXv_int7[0] = A9713Tb1_Cod ;
                        GXv_char8[0] = A11736CCArtCod ;
                        GXv_char4[0] = A11745CCArtdsc ;
                        GXv_int6[0] = A11748TipArtiId ;
                        GXv_char3[0] = A11746TipArtiDs ;
                        GXv_char2[0] = A11737CCColNom ;
                        GXv_int5[0] = A11738CCColNum ;
                        GXv_int11[0] = A11749CCCTc ;
                        new app.ppintcc(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int7, GXv_char8, GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int11) ;
                        tcolscc_impl.this.A396EmprCod = GXv_char9[0] ;
                        tcolscc_impl.this.A252CliCod = GXv_int10[0] ;
                        tcolscc_impl.this.A9713Tb1_Cod = GXv_int7[0] ;
                        tcolscc_impl.this.A11736CCArtCod = GXv_char8[0] ;
                        tcolscc_impl.this.A11745CCArtdsc = GXv_char4[0] ;
                        tcolscc_impl.this.A11748TipArtiId = GXv_int6[0] ;
                        tcolscc_impl.this.A11746TipArtiDs = GXv_char3[0] ;
                        tcolscc_impl.this.A11737CCColNom = GXv_char2[0] ;
                        tcolscc_impl.this.A11738CCColNum = GXv_int5[0] ;
                        tcolscc_impl.this.A11749CCCTc = GXv_int11[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
                        httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
                        httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
                        httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1HO0( ) ;
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
            load1HO1649( ) ;
         }
         endLevel1HO1649( ) ;
      }
      closeExtendedTableCursors1HO1649( ) ;
   }

   public void update1HO1649( )
   {
      beforeValidate1HO1649( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HO1649( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HO1649( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HO1649( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HO1649( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCCCno3 */
                  deferredUpdate1HO1649( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char9[0] = A396EmprCod ;
                        GXv_int10[0] = A252CliCod ;
                        GXv_int7[0] = A9713Tb1_Cod ;
                        GXv_char8[0] = A11736CCArtCod ;
                        GXv_char4[0] = A11745CCArtdsc ;
                        GXv_int6[0] = A11748TipArtiId ;
                        GXv_char3[0] = A11746TipArtiDs ;
                        GXv_char2[0] = A11737CCColNom ;
                        GXv_int5[0] = A11738CCColNum ;
                        GXv_int11[0] = A11749CCCTc ;
                        new app.ppintcc(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int7, GXv_char8, GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int11) ;
                        tcolscc_impl.this.A396EmprCod = GXv_char9[0] ;
                        tcolscc_impl.this.A252CliCod = GXv_int10[0] ;
                        tcolscc_impl.this.A9713Tb1_Cod = GXv_int7[0] ;
                        tcolscc_impl.this.A11736CCArtCod = GXv_char8[0] ;
                        tcolscc_impl.this.A11745CCArtdsc = GXv_char4[0] ;
                        tcolscc_impl.this.A11748TipArtiId = GXv_int6[0] ;
                        tcolscc_impl.this.A11746TipArtiDs = GXv_char3[0] ;
                        tcolscc_impl.this.A11737CCColNom = GXv_char2[0] ;
                        tcolscc_impl.this.A11738CCColNum = GXv_int5[0] ;
                        tcolscc_impl.this.A11749CCCTc = GXv_int11[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
                        httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
                        httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
                        httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HO0( ) ;
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
         endLevel1HO1649( ) ;
      }
      closeExtendedTableCursors1HO1649( ) ;
   }

   public void deferredUpdate1HO1649( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HO1649( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HO1649( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HO1649( ) ;
         afterConfirm1HO1649( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HO1649( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HO13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCCno3");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1649 == 0 )
                     {
                        initAll1HO1649( ) ;
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
                     resetCaption1HO0( ) ;
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
      sMode1649 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HO1649( ) ;
      Gx_mode = sMode1649 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HO1649( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11745CCArtdsc ;
         GXv_char9[0] = GXt_char1 ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
         tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
         A11745CCArtdsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
         GXt_char1 = A11746TipArtiDs ;
         GXv_char9[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
         tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
         A11746TipArtiDs = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
         GXt_int12 = AV33OkCol ;
         GXv_int11[0] = GXt_int12 ;
         new app.pchkcolcc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc, GXv_int11) ;
         tcolscc_impl.this.GXt_int12 = GXv_int11[0] ;
         AV33OkCol = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.str( AV33OkCol, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01HO14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId), A11737CCColNom, Integer.valueOf(A11738CCColNum), Byte.valueOf(A11749CCCTc)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intensidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1HO1649( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HO1649( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcolscc");
         if ( AnyError == 0 )
         {
            confirmValues1HO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcolscc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HO1649( )
   {
      /* Scan By routine */
      /* Using cursor T01HO15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      RcdFound1649 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         A11737CCColNom = T01HO15_A11737CCColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = T01HO15_A11738CCColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = T01HO15_A11749CCCTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HO1649( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1649 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1649 = (short)(1) ;
         A11737CCColNom = T01HO15_A11737CCColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         A11738CCColNum = T01HO15_A11738CCColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         A11749CCCTc = T01HO15_A11749CCCTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
      }
   }

   public void scanEnd1HO1649( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1HO1649( )
   {
      /* After Confirm Rules */
      if ( ( AV33OkCol == 0 ) && true /* After */ && ( ( GXutil.strcmp(A11737CCColNom, " ") != 0 ) || ( A11738CCColNum > 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe COLOR", ""), 1, "CCCOLNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCColNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1HO1649( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HO1649( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HO1649( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HO1649( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HO1649( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HO1649( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTb1_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), true);
      edtTb1_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Dsc_Enabled), 5, 0), true);
      edtCCArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtCod_Enabled), 5, 0), true);
      edtCCArtdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCArtdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCArtdsc_Enabled), 5, 0), true);
      edtTipArtiId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtiId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiId_Enabled), 5, 0), true);
      edtTipArtiDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtiDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtiDs_Enabled), 5, 0), true);
      edtCCColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNum_Enabled), 5, 0), true);
      edtCCColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCColNom_Enabled), 5, 0), true);
      edtCCCTc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCCTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCCTc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HO1649( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HO0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcolscc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A9713Tb1_Cod,4,0)),GXutil.URLEncode(GXutil.rtrim(A11736CCArtCod)),GXutil.URLEncode(GXutil.rtrim(A11745CCArtdsc)),GXutil.URLEncode(GXutil.ltrimstr(A11748TipArtiId,4,0)),GXutil.URLEncode(GXutil.rtrim(A11746TipArtiDs))}, new String[] {"EmprCod","CliCod","Tb1_Cod","CCArtCod","CCArtdsc","TipArtiId","TipArtiDs"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9713Tb1_Cod", GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11736CCArtCod", GXutil.rtrim( Z11736CCArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11748TipArtiId", GXutil.ltrim( localUtil.ntoc( Z11748TipArtiId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11737CCColNom", GXutil.rtrim( Z11737CCColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11738CCColNum", GXutil.ltrim( localUtil.ntoc( Z11738CCColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11749CCCTc", GXutil.ltrim( localUtil.ntoc( Z11749CCCTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKCOL", GXutil.ltrim( localUtil.ntoc( AV33OkCol, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.tcolscc", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A9713Tb1_Cod,4,0)),GXutil.URLEncode(GXutil.rtrim(A11736CCArtCod)),GXutil.URLEncode(GXutil.rtrim(A11745CCArtdsc)),GXutil.URLEncode(GXutil.ltrimstr(A11748TipArtiId,4,0)),GXutil.URLEncode(GXutil.rtrim(A11746TipArtiDs))}, new String[] {"EmprCod","CliCod","Tb1_Cod","CCArtCod","CCArtdsc","TipArtiId","TipArtiDs"})  ;
   }

   public String getPgmname( )
   {
      return "TColsCC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Colores Cuardeno Encargo CC", "") ;
   }

   public void initializeNonKey1HO1649( )
   {
      AV33OkCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.str( AV33OkCol, 1, 0));
   }

   public void initAll1HO1649( )
   {
      A11737CCColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
      A11738CCColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
      A11749CCCTc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
      initializeNonKey1HO1649( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824158458", true, true);
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
      httpContext.AddJavascriptSource("tcolscc.js", "?2026824158458", false, true);
      /* End function include_jscripts */
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
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTb1_Cod_Internalname = "TB1_COD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTb1_Dsc_Internalname = "TB1_DSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCCArtCod_Internalname = "CCARTCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCCArtdsc_Internalname = "CCARTDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipArtiId_Internalname = "TIPARTIID" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTipArtiDs_Internalname = "TIPARTIDS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCCColNum_Internalname = "CCCOLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCCColNom_Internalname = "CCCOLNOM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCCCTc_Internalname = "CCCTC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Colores Cuardeno Encargo CC", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCCCTc_Jsonclick = "" ;
      edtCCCTc_Backcolor = (int)(0xFFFFFF) ;
      edtCCCTc_Enabled = 1 ;
      edtCCColNom_Jsonclick = "" ;
      edtCCColNom_Backcolor = (int)(0xFFFFFF) ;
      edtCCColNom_Enabled = 1 ;
      edtCCColNum_Jsonclick = "" ;
      edtCCColNum_Backcolor = (int)(0xFFFFFF) ;
      edtCCColNum_Enabled = 1 ;
      edtTipArtiDs_Jsonclick = "" ;
      edtTipArtiDs_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtiDs_Enabled = 0 ;
      edtTipArtiId_Jsonclick = "" ;
      edtTipArtiId_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtiId_Enabled = 0 ;
      edtCCArtdsc_Jsonclick = "" ;
      edtCCArtdsc_Backcolor = (int)(0xFFFFFF) ;
      edtCCArtdsc_Enabled = 0 ;
      edtCCArtCod_Jsonclick = "" ;
      edtCCArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtCCArtCod_Enabled = 0 ;
      edtTb1_Dsc_Jsonclick = "" ;
      edtTb1_Dsc_Backcolor = (int)(0xFFFFFF) ;
      edtTb1_Dsc_Enabled = 0 ;
      edtTb1_Cod_Jsonclick = "" ;
      edtTb1_Cod_Backcolor = (int)(0xFFFFFF) ;
      edtTb1_Cod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
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

   public void gx1asatipartids1HO1649( String A396EmprCod ,
                                       short A11748TipArtiId )
   {
      GXt_char1 = A11746TipArtiDs ;
      GXv_char9[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11746TipArtiDs = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11746TipArtiDs))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asaccartdsc1HO1649( String A396EmprCod ,
                                      int A252CliCod ,
                                      String A11736CCArtCod )
   {
      GXt_char1 = A11745CCArtdsc ;
      GXv_char9[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11745CCArtdsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11745CCArtdsc))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx3asaokcol1HO1649( String A396EmprCod ,
                                   int A252CliCod ,
                                   String A11736CCArtCod ,
                                   String A11737CCColNom ,
                                   int A11738CCColNum ,
                                   byte A11749CCCTc )
   {
      GXt_int12 = AV33OkCol ;
      GXv_int11[0] = GXt_int12 ;
      new app.pchkcolcc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc, GXv_int11) ;
      tcolscc_impl.this.GXt_int12 = GXv_int11[0] ;
      AV33OkCol = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.str( AV33OkCol, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33OkCol, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_5_1HO1649( String A396EmprCod ,
                             int A252CliCod ,
                             short A9713Tb1_Cod ,
                             String A11736CCArtCod ,
                             String A11745CCArtdsc ,
                             short A11748TipArtiId ,
                             String A11746TipArtiDs ,
                             String A11737CCColNom ,
                             int A11738CCColNum ,
                             byte A11749CCCTc )
   {
      if ( true /* After */ || true /* After */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_int7[0] = A9713Tb1_Cod ;
         GXv_char8[0] = A11736CCArtCod ;
         GXv_char4[0] = A11745CCArtdsc ;
         GXv_int6[0] = A11748TipArtiId ;
         GXv_char3[0] = A11746TipArtiDs ;
         GXv_char2[0] = A11737CCColNom ;
         GXv_int5[0] = A11738CCColNum ;
         GXv_int11[0] = A11749CCCTc ;
         new app.ppintcc(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int7, GXv_char8, GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int11) ;
         A396EmprCod = GXv_char9[0] ;
         A252CliCod = GXv_int10[0] ;
         A9713Tb1_Cod = GXv_int7[0] ;
         A11736CCArtCod = GXv_char8[0] ;
         A11745CCArtdsc = GXv_char4[0] ;
         A11748TipArtiId = GXv_int6[0] ;
         A11746TipArtiDs = GXv_char3[0] ;
         A11737CCColNom = GXv_char2[0] ;
         A11738CCColNum = GXv_int5[0] ;
         A11749CCCTc = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9713Tb1_Cod), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11736CCArtCod", A11736CCArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", A11745CCArtdsc);
         httpContext.ajax_rsp_assign_attri("", false, "A11748TipArtiId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11748TipArtiId), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", A11746TipArtiDs);
         httpContext.ajax_rsp_assign_attri("", false, "A11737CCColNom", A11737CCColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A11738CCColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11738CCColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A11749CCCTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11749CCCTc), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11736CCArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11745CCArtdsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11748TipArtiId, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11746TipArtiDs))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11737CCColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11738CCColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11749CCCTc, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01HO16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HO16_A407EmprNom[0] ;
      n407EmprNom = T01HO16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T01HO17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01HO17_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(15);
      /* Using cursor T01HO18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TB1_COD");
         AnyError = (short)(1) ;
      }
      A9715Tb1_Dsc = T01HO18_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01HO18_n9715Tb1_Dsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", A9715Tb1_Dsc);
      pr_default.close(16);
      /* Using cursor T01HO19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod), A11736CCArtCod, Short.valueOf(A11748TipArtiId)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTIID");
         AnyError = (short)(1) ;
      }
      pr_default.close(17);
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

   public void valid_Emprcod( )
   {
      GXt_char1 = A11746TipArtiDs ;
      GXv_char9[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11748TipArtiId, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11746TipArtiDs = GXt_char1 ;
      GXt_char1 = A11745CCArtdsc ;
      GXv_char9[0] = GXt_char1 ;
      new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, GXv_char9) ;
      tcolscc_impl.this.GXt_char1 = GXv_char9[0] ;
      A11745CCArtdsc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", GXutil.rtrim( A11746TipArtiDs));
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", GXutil.rtrim( A11745CCArtdsc));
   }

   public void valid_Ccctc( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_int12 = AV33OkCol ;
      GXv_int11[0] = GXt_int12 ;
      new app.pchkcolcc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A11736CCArtCod, A11737CCColNom, A11738CCColNum, A11749CCCTc, GXv_int11) ;
      tcolscc_impl.this.GXt_int12 = GXv_int11[0] ;
      AV33OkCol = GXt_int12 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", GXutil.rtrim( A9715Tb1_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11745CCArtdsc", GXutil.rtrim( A11745CCArtdsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11746TipArtiDs", GXutil.rtrim( A11746TipArtiDs));
      httpContext.ajax_rsp_assign_attri("", false, "AV33OkCol", GXutil.ltrim( localUtil.ntoc( AV33OkCol, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9713Tb1_Cod", GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11736CCArtCod", GXutil.rtrim( Z11736CCArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11748TipArtiId", GXutil.ltrim( localUtil.ntoc( Z11748TipArtiId, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11737CCColNom", GXutil.rtrim( Z11737CCColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11738CCColNum", GXutil.ltrim( localUtil.ntoc( Z11738CCColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11749CCCTc", GXutil.ltrim( localUtil.ntoc( Z11749CCCTc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9715Tb1_Dsc", GXutil.rtrim( Z9715Tb1_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11745CCArtdsc", GXutil.rtrim( Z11745CCArtdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11746TipArtiDs", GXutil.rtrim( Z11746TipArtiDs));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV33OkCol", GXutil.ltrim( localUtil.ntoc( ZV33OkCol, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'INTENSIDAD'","{handler:'e121HO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'A11737CCColNom',fld:'CCCOLNOM',pic:''},{av:'A11738CCColNum',fld:'CCCOLNUM',pic:'ZZZZZ9'},{av:'A11749CCCTc',fld:'CCCTC',pic:'Z9'}]");
      setEventMetadata("'INTENSIDAD'",",oparms:[{av:'A11749CCCTc',fld:'CCCTC',pic:'Z9'},{av:'A11738CCColNum',fld:'CCCOLNUM',pic:'ZZZZZ9'},{av:'A11737CCColNom',fld:'CCCOLNOM',pic:''},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TB1_COD","{handler:'valid_Tb1_cod',iparms:[]");
      setEventMetadata("VALID_TB1_COD",",oparms:[]}");
      setEventMetadata("VALID_CCARTCOD","{handler:'valid_Ccartcod',iparms:[]");
      setEventMetadata("VALID_CCARTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCARTDSC","{handler:'valid_Ccartdsc',iparms:[]");
      setEventMetadata("VALID_CCARTDSC",",oparms:[]}");
      setEventMetadata("VALID_TIPARTIID","{handler:'valid_Tipartiid',iparms:[]");
      setEventMetadata("VALID_TIPARTIID",",oparms:[]}");
      setEventMetadata("VALID_TIPARTIDS","{handler:'valid_Tipartids',iparms:[]");
      setEventMetadata("VALID_TIPARTIDS",",oparms:[]}");
      setEventMetadata("VALID_CCCOLNUM","{handler:'valid_Cccolnum',iparms:[]");
      setEventMetadata("VALID_CCCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_CCCOLNOM","{handler:'valid_Cccolnom',iparms:[]");
      setEventMetadata("VALID_CCCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_CCCTC","{handler:'valid_Ccctc',iparms:[{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A11736CCArtCod',fld:'CCARTCOD',pic:''},{av:'A11748TipArtiId',fld:'TIPARTIID',pic:'ZZZ9'},{av:'A11737CCColNom',fld:'CCCOLNOM',pic:''},{av:'A11738CCColNum',fld:'CCCOLNUM',pic:'ZZZZZ9'},{av:'A11749CCCTc',fld:'CCCTC',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV33OkCol',fld:'vOKCOL',pic:'9'}]");
      setEventMetadata("VALID_CCCTC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A9715Tb1_Dsc',fld:'TB1_DSC',pic:''},{av:'A11745CCArtdsc',fld:'CCARTDSC',pic:''},{av:'A11746TipArtiDs',fld:'TIPARTIDS',pic:''},{av:'AV33OkCol',fld:'vOKCOL',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z9713Tb1_Cod'},{av:'Z11736CCArtCod'},{av:'Z11748TipArtiId'},{av:'Z11737CCColNom'},{av:'Z11738CCColNum'},{av:'Z11749CCCTc'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z9715Tb1_Dsc'},{av:'Z11745CCArtdsc'},{av:'Z11746TipArtiDs'},{av:'ZV33OkCol'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA11736CCArtCod = "" ;
      wcpOA11745CCArtdsc = "" ;
      wcpOA11746TipArtiDs = "" ;
      Z396EmprCod = "" ;
      Z11736CCArtCod = "" ;
      Z11737CCColNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11736CCArtCod = "" ;
      A11745CCArtdsc = "" ;
      A11746TipArtiDs = "" ;
      A11737CCColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A9715Tb1_Dsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z9715Tb1_Dsc = "" ;
      T01HO4_A407EmprNom = new String[] {""} ;
      T01HO4_n407EmprNom = new boolean[] {false} ;
      T01HO5_A279CliNom = new String[] {""} ;
      T01HO6_A9715Tb1_Dsc = new String[] {""} ;
      T01HO6_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HO7_A396EmprCod = new String[] {""} ;
      T01HO8_A11737CCColNom = new String[] {""} ;
      T01HO8_A11738CCColNum = new int[1] ;
      T01HO8_A11749CCCTc = new byte[1] ;
      T01HO8_A407EmprNom = new String[] {""} ;
      T01HO8_n407EmprNom = new boolean[] {false} ;
      T01HO8_A279CliNom = new String[] {""} ;
      T01HO8_A9715Tb1_Dsc = new String[] {""} ;
      T01HO8_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HO8_A396EmprCod = new String[] {""} ;
      T01HO8_A252CliCod = new int[1] ;
      T01HO8_A9713Tb1_Cod = new short[1] ;
      T01HO8_A11736CCArtCod = new String[] {""} ;
      T01HO8_A11748TipArtiId = new short[1] ;
      T01HO9_A396EmprCod = new String[] {""} ;
      T01HO9_A252CliCod = new int[1] ;
      T01HO9_A9713Tb1_Cod = new short[1] ;
      T01HO9_A11736CCArtCod = new String[] {""} ;
      T01HO9_A11748TipArtiId = new short[1] ;
      T01HO9_A11737CCColNom = new String[] {""} ;
      T01HO9_A11738CCColNum = new int[1] ;
      T01HO9_A11749CCCTc = new byte[1] ;
      T01HO3_A11737CCColNom = new String[] {""} ;
      T01HO3_A11738CCColNum = new int[1] ;
      T01HO3_A11749CCCTc = new byte[1] ;
      T01HO3_A396EmprCod = new String[] {""} ;
      T01HO3_A252CliCod = new int[1] ;
      T01HO3_A9713Tb1_Cod = new short[1] ;
      T01HO3_A11736CCArtCod = new String[] {""} ;
      T01HO3_A11748TipArtiId = new short[1] ;
      sMode1649 = "" ;
      T01HO10_A396EmprCod = new String[] {""} ;
      T01HO10_A252CliCod = new int[1] ;
      T01HO10_A9713Tb1_Cod = new short[1] ;
      T01HO10_A11736CCArtCod = new String[] {""} ;
      T01HO10_A11748TipArtiId = new short[1] ;
      T01HO10_A11737CCColNom = new String[] {""} ;
      T01HO10_A11738CCColNum = new int[1] ;
      T01HO10_A11749CCCTc = new byte[1] ;
      T01HO11_A396EmprCod = new String[] {""} ;
      T01HO11_A252CliCod = new int[1] ;
      T01HO11_A9713Tb1_Cod = new short[1] ;
      T01HO11_A11736CCArtCod = new String[] {""} ;
      T01HO11_A11748TipArtiId = new short[1] ;
      T01HO11_A11737CCColNom = new String[] {""} ;
      T01HO11_A11738CCColNum = new int[1] ;
      T01HO11_A11749CCCTc = new byte[1] ;
      T01HO2_A11737CCColNom = new String[] {""} ;
      T01HO2_A11738CCColNum = new int[1] ;
      T01HO2_A11749CCCTc = new byte[1] ;
      T01HO2_A396EmprCod = new String[] {""} ;
      T01HO2_A252CliCod = new int[1] ;
      T01HO2_A9713Tb1_Cod = new short[1] ;
      T01HO2_A11736CCArtCod = new String[] {""} ;
      T01HO2_A11748TipArtiId = new short[1] ;
      T01HO14_A396EmprCod = new String[] {""} ;
      T01HO14_A252CliCod = new int[1] ;
      T01HO14_A9713Tb1_Cod = new short[1] ;
      T01HO14_A11736CCArtCod = new String[] {""} ;
      T01HO14_A11748TipArtiId = new short[1] ;
      T01HO14_A11737CCColNom = new String[] {""} ;
      T01HO14_A11738CCColNum = new int[1] ;
      T01HO14_A11749CCCTc = new byte[1] ;
      T01HO14_A11750IntId = new short[1] ;
      T01HO15_A396EmprCod = new String[] {""} ;
      T01HO15_A252CliCod = new int[1] ;
      T01HO15_A9713Tb1_Cod = new short[1] ;
      T01HO15_A11736CCArtCod = new String[] {""} ;
      T01HO15_A11748TipArtiId = new short[1] ;
      T01HO15_A11737CCColNom = new String[] {""} ;
      T01HO15_A11738CCColNum = new int[1] ;
      T01HO15_A11749CCCTc = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int10 = new int[1] ;
      GXv_int7 = new short[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      T01HO16_A407EmprNom = new String[] {""} ;
      T01HO16_n407EmprNom = new boolean[] {false} ;
      T01HO17_A279CliNom = new String[] {""} ;
      T01HO18_A9715Tb1_Dsc = new String[] {""} ;
      T01HO18_n9715Tb1_Dsc = new boolean[] {false} ;
      T01HO19_A396EmprCod = new String[] {""} ;
      Z11745CCArtdsc = "" ;
      Z11746TipArtiDs = "" ;
      GXt_char1 = "" ;
      GXv_char9 = new String[1] ;
      GXv_int11 = new byte[1] ;
      ZZ396EmprCod = "" ;
      ZZ11736CCArtCod = "" ;
      ZZ11737CCColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ9715Tb1_Dsc = "" ;
      ZZ11745CCArtdsc = "" ;
      ZZ11746TipArtiDs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcolscc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcolscc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcolscc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcolscc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcolscc__default(),
         new Object[] {
             new Object[] {
            T01HO2_A11737CCColNom, T01HO2_A11738CCColNum, T01HO2_A11749CCCTc, T01HO2_A396EmprCod, T01HO2_A252CliCod, T01HO2_A9713Tb1_Cod, T01HO2_A11736CCArtCod, T01HO2_A11748TipArtiId
            }
            , new Object[] {
            T01HO3_A11737CCColNom, T01HO3_A11738CCColNum, T01HO3_A11749CCCTc, T01HO3_A396EmprCod, T01HO3_A252CliCod, T01HO3_A9713Tb1_Cod, T01HO3_A11736CCArtCod, T01HO3_A11748TipArtiId
            }
            , new Object[] {
            T01HO4_A407EmprNom, T01HO4_n407EmprNom
            }
            , new Object[] {
            T01HO5_A279CliNom
            }
            , new Object[] {
            T01HO6_A9715Tb1_Dsc, T01HO6_n9715Tb1_Dsc
            }
            , new Object[] {
            T01HO7_A396EmprCod
            }
            , new Object[] {
            T01HO8_A11737CCColNom, T01HO8_A11738CCColNum, T01HO8_A11749CCCTc, T01HO8_A407EmprNom, T01HO8_n407EmprNom, T01HO8_A279CliNom, T01HO8_A9715Tb1_Dsc, T01HO8_n9715Tb1_Dsc, T01HO8_A396EmprCod, T01HO8_A252CliCod,
            T01HO8_A9713Tb1_Cod, T01HO8_A11736CCArtCod, T01HO8_A11748TipArtiId
            }
            , new Object[] {
            T01HO9_A396EmprCod, T01HO9_A252CliCod, T01HO9_A9713Tb1_Cod, T01HO9_A11736CCArtCod, T01HO9_A11748TipArtiId, T01HO9_A11737CCColNom, T01HO9_A11738CCColNum, T01HO9_A11749CCCTc
            }
            , new Object[] {
            T01HO10_A396EmprCod, T01HO10_A252CliCod, T01HO10_A9713Tb1_Cod, T01HO10_A11736CCArtCod, T01HO10_A11748TipArtiId, T01HO10_A11737CCColNom, T01HO10_A11738CCColNum, T01HO10_A11749CCCTc
            }
            , new Object[] {
            T01HO11_A396EmprCod, T01HO11_A252CliCod, T01HO11_A9713Tb1_Cod, T01HO11_A11736CCArtCod, T01HO11_A11748TipArtiId, T01HO11_A11737CCColNom, T01HO11_A11738CCColNum, T01HO11_A11749CCCTc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HO14_A396EmprCod, T01HO14_A252CliCod, T01HO14_A9713Tb1_Cod, T01HO14_A11736CCArtCod, T01HO14_A11748TipArtiId, T01HO14_A11737CCColNom, T01HO14_A11738CCColNum, T01HO14_A11749CCCTc, T01HO14_A11750IntId
            }
            , new Object[] {
            T01HO15_A396EmprCod, T01HO15_A252CliCod, T01HO15_A9713Tb1_Cod, T01HO15_A11736CCArtCod, T01HO15_A11748TipArtiId, T01HO15_A11737CCColNom, T01HO15_A11738CCColNum, T01HO15_A11749CCCTc
            }
            , new Object[] {
            T01HO16_A407EmprNom, T01HO16_n407EmprNom
            }
            , new Object[] {
            T01HO17_A279CliNom
            }
            , new Object[] {
            T01HO18_A9715Tb1_Dsc, T01HO18_n9715Tb1_Dsc
            }
            , new Object[] {
            T01HO19_A396EmprCod
            }
         }
      );
      Z11746TipArtiDs = "" ;
      A11746TipArtiDs = "" ;
      Z11748TipArtiId = (short)(0) ;
      A11748TipArtiId = (short)(0) ;
      Z11745CCArtdsc = "" ;
      A11745CCArtdsc = "" ;
      Z11736CCArtCod = "" ;
      A11736CCArtCod = "" ;
      Z9713Tb1_Cod = (short)(0) ;
      A9713Tb1_Cod = (short)(0) ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TColsCC" ;
   }

   private byte Z11749CCCTc ;
   private byte GxWebError ;
   private byte A11749CCCTc ;
   private byte nKeyPressed ;
   private byte AV33OkCol ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZV33OkCol ;
   private byte GXt_int12 ;
   private byte GXv_int11[] ;
   private byte ZZ11749CCCTc ;
   private byte ZZV33OkCol ;
   private short wcpOA9713Tb1_Cod ;
   private short wcpOA11748TipArtiId ;
   private short Z9713Tb1_Cod ;
   private short Z11748TipArtiId ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1649 ;
   private short nIsDirty_1649 ;
   private short GXv_int7[] ;
   private short GXv_int6[] ;
   private short ZZ9713Tb1_Cod ;
   private short ZZ11748TipArtiId ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int Z11738CCColNum ;
   private int A252CliCod ;
   private int A11738CCColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTb1_Cod_Enabled ;
   private int edtTb1_Dsc_Enabled ;
   private int edtCCArtCod_Enabled ;
   private int edtCCArtdsc_Enabled ;
   private int edtTipArtiId_Enabled ;
   private int edtTipArtiDs_Enabled ;
   private int edtCCColNum_Enabled ;
   private int edtCCColNom_Enabled ;
   private int edtCCCTc_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtCCCTc_Backcolor ;
   private int edtCCColNom_Backcolor ;
   private int edtCCColNum_Backcolor ;
   private int edtTipArtiDs_Backcolor ;
   private int edtTipArtiId_Backcolor ;
   private int edtCCArtdsc_Backcolor ;
   private int edtCCArtCod_Backcolor ;
   private int edtTb1_Dsc_Backcolor ;
   private int edtTb1_Cod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int10[] ;
   private int GXv_int5[] ;
   private int ZZ252CliCod ;
   private int ZZ11738CCColNum ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA11736CCArtCod ;
   private String wcpOA11745CCArtdsc ;
   private String wcpOA11746TipArtiDs ;
   private String Z396EmprCod ;
   private String Z11736CCArtCod ;
   private String Z11737CCColNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String A11745CCArtdsc ;
   private String A11746TipArtiDs ;
   private String A11737CCColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCColNum_Internalname ;
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
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTb1_Cod_Internalname ;
   private String edtTb1_Cod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTb1_Dsc_Internalname ;
   private String A9715Tb1_Dsc ;
   private String edtTb1_Dsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCCArtCod_Internalname ;
   private String edtCCArtCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCCArtdsc_Internalname ;
   private String edtCCArtdsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipArtiId_Internalname ;
   private String edtTipArtiId_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTipArtiDs_Internalname ;
   private String edtTipArtiDs_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCCColNum_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCCColNom_Internalname ;
   private String edtCCColNom_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCCCTc_Internalname ;
   private String edtCCCTc_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
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
   private String Gx_mode ;
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z9715Tb1_Dsc ;
   private String sMode1649 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z11745CCArtdsc ;
   private String Z11746TipArtiDs ;
   private String GXt_char1 ;
   private String GXv_char9[] ;
   private String ZZ396EmprCod ;
   private String ZZ11736CCArtCod ;
   private String ZZ11737CCColNom ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ9715Tb1_Dsc ;
   private String ZZ11745CCArtdsc ;
   private String ZZ11746TipArtiDs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9715Tb1_Dsc ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01HO4_A407EmprNom ;
   private boolean[] T01HO4_n407EmprNom ;
   private String[] T01HO5_A279CliNom ;
   private String[] T01HO6_A9715Tb1_Dsc ;
   private boolean[] T01HO6_n9715Tb1_Dsc ;
   private String[] T01HO7_A396EmprCod ;
   private String[] T01HO8_A11737CCColNom ;
   private int[] T01HO8_A11738CCColNum ;
   private byte[] T01HO8_A11749CCCTc ;
   private String[] T01HO8_A407EmprNom ;
   private boolean[] T01HO8_n407EmprNom ;
   private String[] T01HO8_A279CliNom ;
   private String[] T01HO8_A9715Tb1_Dsc ;
   private boolean[] T01HO8_n9715Tb1_Dsc ;
   private String[] T01HO8_A396EmprCod ;
   private int[] T01HO8_A252CliCod ;
   private short[] T01HO8_A9713Tb1_Cod ;
   private String[] T01HO8_A11736CCArtCod ;
   private short[] T01HO8_A11748TipArtiId ;
   private String[] T01HO9_A396EmprCod ;
   private int[] T01HO9_A252CliCod ;
   private short[] T01HO9_A9713Tb1_Cod ;
   private String[] T01HO9_A11736CCArtCod ;
   private short[] T01HO9_A11748TipArtiId ;
   private String[] T01HO9_A11737CCColNom ;
   private int[] T01HO9_A11738CCColNum ;
   private byte[] T01HO9_A11749CCCTc ;
   private String[] T01HO3_A11737CCColNom ;
   private int[] T01HO3_A11738CCColNum ;
   private byte[] T01HO3_A11749CCCTc ;
   private String[] T01HO3_A396EmprCod ;
   private int[] T01HO3_A252CliCod ;
   private short[] T01HO3_A9713Tb1_Cod ;
   private String[] T01HO3_A11736CCArtCod ;
   private short[] T01HO3_A11748TipArtiId ;
   private String[] T01HO10_A396EmprCod ;
   private int[] T01HO10_A252CliCod ;
   private short[] T01HO10_A9713Tb1_Cod ;
   private String[] T01HO10_A11736CCArtCod ;
   private short[] T01HO10_A11748TipArtiId ;
   private String[] T01HO10_A11737CCColNom ;
   private int[] T01HO10_A11738CCColNum ;
   private byte[] T01HO10_A11749CCCTc ;
   private String[] T01HO11_A396EmprCod ;
   private int[] T01HO11_A252CliCod ;
   private short[] T01HO11_A9713Tb1_Cod ;
   private String[] T01HO11_A11736CCArtCod ;
   private short[] T01HO11_A11748TipArtiId ;
   private String[] T01HO11_A11737CCColNom ;
   private int[] T01HO11_A11738CCColNum ;
   private byte[] T01HO11_A11749CCCTc ;
   private String[] T01HO2_A11737CCColNom ;
   private int[] T01HO2_A11738CCColNum ;
   private byte[] T01HO2_A11749CCCTc ;
   private String[] T01HO2_A396EmprCod ;
   private int[] T01HO2_A252CliCod ;
   private short[] T01HO2_A9713Tb1_Cod ;
   private String[] T01HO2_A11736CCArtCod ;
   private short[] T01HO2_A11748TipArtiId ;
   private String[] T01HO14_A396EmprCod ;
   private int[] T01HO14_A252CliCod ;
   private short[] T01HO14_A9713Tb1_Cod ;
   private String[] T01HO14_A11736CCArtCod ;
   private short[] T01HO14_A11748TipArtiId ;
   private String[] T01HO14_A11737CCColNom ;
   private int[] T01HO14_A11738CCColNum ;
   private byte[] T01HO14_A11749CCCTc ;
   private short[] T01HO14_A11750IntId ;
   private String[] T01HO15_A396EmprCod ;
   private int[] T01HO15_A252CliCod ;
   private short[] T01HO15_A9713Tb1_Cod ;
   private String[] T01HO15_A11736CCArtCod ;
   private short[] T01HO15_A11748TipArtiId ;
   private String[] T01HO15_A11737CCColNom ;
   private int[] T01HO15_A11738CCColNum ;
   private byte[] T01HO15_A11749CCCTc ;
   private String[] T01HO16_A407EmprNom ;
   private boolean[] T01HO16_n407EmprNom ;
   private String[] T01HO17_A279CliNom ;
   private String[] T01HO18_A9715Tb1_Dsc ;
   private boolean[] T01HO18_n9715Tb1_Dsc ;
   private String[] T01HO19_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcolscc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolscc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolscc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolscc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolscc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HO2", "SELECT CCColNom, CCColNum, CCCTc, EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?  FOR UPDATE OF CCColNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO3", "SELECT CCColNom, CCColNum, CCCTc, EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO6", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO7", "SELECT EmprCod FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCColNom, TM1.CCColNum, TM1.CCCTc, T2.EmprNom, T3.CliNom, T4.Tb1_Dsc, TM1.EmprCod, TM1.CliCod, TM1.Tb1_Cod, TM1.CCArtCod, TM1.TipArtiId FROM (((TXPCCCno3 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTABLE1 T4 ON T4.EmprCod = TM1.EmprCod AND T4.Tb1_Cod = TM1.Tb1_Cod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.Tb1_Cod = ? and TM1.CCArtCod = ? and TM1.TipArtiId = ? and TM1.CCColNom = ? and TM1.CCColNum = ? and TM1.CCCTc = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.Tb1_Cod, TM1.CCArtCod, TM1.TipArtiId, TM1.CCColNom, TM1.CCColNum, TM1.CCCTc ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE ( CCColNom > ? or CCColNom = ? and CCColNum > ? or CCColNum = ? and CCColNom = ? and CCCTc > ?) and EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE ( CCColNom < ? or CCColNom = ? and CCColNum < ? or CCColNum = ? and CCColNom = ? and CCCTc < ?) and EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod DESC, CliCod DESC, Tb1_Cod DESC, CCArtCod DESC, TipArtiId DESC, CCColNom DESC, CCColNum DESC, CCCTc DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HO12", "INSERT INTO TXPCCCno3(CCColNom, CCColNum, CCCTc, EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCCno3")
         ,new UpdateCursor("T01HO13", "DELETE FROM TXPCCCno3  WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?", GX_NOMASK, "TXPCCCno3")
         ,new ForEachCursor("T01HO14", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId FROM TXPCCCno4 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? AND CCColNom = ? AND CCColNum = ? AND CCCTc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HO15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc FROM TXPCCCno3 WHERE EmprCod = ? and CliCod = ? and Tb1_Cod = ? and CCArtCod = ? and TipArtiId = ? ORDER BY EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO17", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO18", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HO19", "SELECT EmprCod FROM TXPCCCno1 WHERE EmprCod = ? AND CliCod = ? AND Tb1_Cod = ? AND CCArtCod = ? AND TipArtiId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 80);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 16);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 16);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

