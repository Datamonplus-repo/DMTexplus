package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmetpi3_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Defectos de piezas", ""), (short)(0)) ;
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

   public tmetpi3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmetpi3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmetpi3_impl.class ));
   }

   public tmetpi3_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMETPI3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Terminal", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetTerCod_Internalname, GXutil.rtrim( A2809MetTerCod), GXutil.rtrim( localUtil.format( A2809MetTerCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetTerCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetTerCod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Pieza", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCod_Internalname, GXutil.rtrim( A2813MetPieCod), GXutil.rtrim( localUtil.format( A2813MetPieCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Fecha Generacion Barcada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtBarFecGen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecGen_Internalname, localUtil.format(A159BarFecGen, "99/99/99"), localUtil.format( A159BarFecGen, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecGen_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecGen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecGen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecGen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMETPI3.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieKil_Enabled!=0) ? localUtil.format( A2814MetPieKil, "ZZZZZ9.99") : localUtil.format( A2814MetPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieKil_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMet_Enabled!=0) ? localUtil.format( A2815MetPieMet, "ZZZZZ9.99") : localUtil.format( A2815MetPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMet_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieEst_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Descripcion Pieza", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDsc_Internalname, GXutil.rtrim( A2846MetPieDsc), GXutil.rtrim( localUtil.format( A2846MetPieDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieDsc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Defecto", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDef_Internalname, GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ") : localUtil.format( DecimalUtil.doubleToDec(A4909MetPieDef), "ZZZ"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDef_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieDef_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Mts afectados x defecto", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMtD_Internalname, GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPieMtD_Enabled!=0) ? localUtil.format( A4910MetPieMtD, "ZZZZ9.99") : localUtil.format( A4910MetPieMtD, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMtD_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieMtD_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieCol_Internalname, GXutil.rtrim( A4911MetPieCol), GXutil.rtrim( localUtil.format( A4911MetPieCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieCol_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Por donde", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPiePDo_Internalname, GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetPiePDo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4912MetPiePDo), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPiePDo_Jsonclick, 0, "", "", "", "", "", 1, edtMetPiePDo_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Localización", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieLoc_Internalname, GXutil.rtrim( A4913MetPieLoc), GXutil.rtrim( localUtil.format( A4913MetPieLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieLoc_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Raport", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieRap_Internalname, GXutil.rtrim( A4914MetPieRap), GXutil.rtrim( localUtil.format( A4914MetPieRap, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieRap_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieRap_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "S=Calidad 1, N=Calidad 2", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieDCP_Internalname, GXutil.rtrim( A4915MetPieDCP), GXutil.rtrim( localUtil.format( A4915MetPieDCP, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieDCP_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieDCP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Muestra?", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetPieMue_Internalname, GXutil.rtrim( A4916MetPieMue), GXutil.rtrim( localUtil.format( A4916MetPieMue, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetPieMue_Jsonclick, 0, "", "", "", "", "", 1, edtMetPieMue_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtMetPieObs_Internalname, A4917MetPieObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", (short)(0), 1, edtMetPieObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TMETPI3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMETPI3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMETPI3.htm");
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
      e111F22 ();
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
            Z2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2816MetPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2846MetPieDsc = httpContext.cgiGet( "Z2846MetPieDsc") ;
            Z4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( "Z4909MetPieDef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( "Z4910MetPieMtD")) ;
            Z4911MetPieCol = httpContext.cgiGet( "Z4911MetPieCol") ;
            Z4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( "Z4912MetPiePDo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z4913MetPieLoc = httpContext.cgiGet( "Z4913MetPieLoc") ;
            Z4914MetPieRap = httpContext.cgiGet( "Z4914MetPieRap") ;
            Z4915MetPieDCP = httpContext.cgiGet( "Z4915MetPieDCP") ;
            Z4916MetPieMue = httpContext.cgiGet( "Z4916MetPieMue") ;
            Z4917MetPieObs = httpContext.cgiGet( "Z4917MetPieObs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
            A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A159BarFecGen", localUtil.format(A159BarFecGen, "99/99/99"));
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2816MetPieEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
            }
            else
            {
               A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
            }
            A2846MetPieDsc = httpContext.cgiGet( edtMetPieDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEDEF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieDef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4909MetPieDef = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
            }
            else
            {
               A4909MetPieDef = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEMTD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPieMtD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4910MetPieMtD = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
            }
            else
            {
               A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
            }
            A4911MetPieCol = httpContext.cgiGet( edtMetPieCol_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4911MetPieCol", A4911MetPieCol);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METPIEPDO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetPiePDo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4912MetPiePDo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4912MetPiePDo), 10, 0));
            }
            else
            {
               A4912MetPiePDo = localUtil.ctol( httpContext.cgiGet( edtMetPiePDo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4912MetPiePDo), 10, 0));
            }
            A4913MetPieLoc = httpContext.cgiGet( edtMetPieLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4913MetPieLoc", A4913MetPieLoc);
            A4914MetPieRap = GXutil.upper( httpContext.cgiGet( edtMetPieRap_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4914MetPieRap", A4914MetPieRap);
            A4915MetPieDCP = GXutil.upper( httpContext.cgiGet( edtMetPieDCP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4915MetPieDCP", A4915MetPieDCP);
            A4916MetPieMue = GXutil.upper( httpContext.cgiGet( edtMetPieMue_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4916MetPieMue", A4916MetPieMue);
            A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
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
                        e111F22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'HOJAS DE RUTA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Hojas de Ruta' */
                        e121F22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar' */
                        e131F22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141F22 ();
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
         /* Execute user event: After Trn */
         e141F22 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1F2413( ) ;
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
      disableAttributes1F2413( ) ;
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

   public void confirm_1F20( )
   {
      beforeValidate1F2413( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F2413( ) ;
         }
         else
         {
            checkExtendedTable1F2413( ) ;
            if ( AnyError == 0 )
            {
               zm1F2413( 6) ;
               zm1F2413( 7) ;
               zm1F2413( 8) ;
               zm1F2413( 9) ;
            }
            closeExtendedTableCursors1F2413( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1F20( ) ;
      }
   }

   public void resetCaption1F20( )
   {
   }

   public void e111F22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV35LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35LitFe", AV35LitFe);
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV21Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit5", AV21Lit5);
      GXt_char1 = AV22Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit6", AV22Lit6);
      GXt_char1 = AV23Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit7", AV23Lit7);
      GXt_char1 = AV24Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit8", AV24Lit8);
      GXt_char1 = AV25Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit9", AV25Lit9);
      GXt_char1 = AV26Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit10", AV26Lit10);
      GXt_char1 = AV27Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1306_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit11", AV27Lit11);
      GXt_char1 = AV28Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN144_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit12", AV28Lit12);
      GXt_char1 = AV29Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN600_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit13", AV29Lit13);
      GXt_char1 = AV30Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit14", AV30Lit14);
      GXt_char1 = AV31Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit15", AV31Lit15);
      GXt_char1 = AV32Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit16", AV32Lit16);
      GXt_char1 = AV33Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT75_", ""), (byte)(99), GXv_char2) ;
      tmetpi3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit17", AV33Lit17);
      AV36lit18 = httpContext.getMessage( "Consulta de Metraje de Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36lit18", AV36lit18);
      AV37Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV34UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmetpi3_impl.this.A396EmprCod = GXv_char2[0] ;
      tmetpi3_impl.this.AV39EmprNom = GXv_char3[0] ;
      tmetpi3_impl.this.AV34UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprNom", AV39EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV34UsurCod", AV34UsurCod);
   }

   public void e121F22( )
   {
      /* 'Hojas de Ruta' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e131F22( )
   {
      /* 'Eliminar' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A2809MetTerCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      GXv_char7[0] = A2813MetPieCod ;
      new app.pbordef(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_char7) ;
      tmetpi3_impl.this.A396EmprCod = GXv_char4[0] ;
      tmetpi3_impl.this.A2809MetTerCod = GXv_char3[0] ;
      tmetpi3_impl.this.A129BarCod = GXv_int5[0] ;
      tmetpi3_impl.this.A132BarCodReo = GXv_int6[0] ;
      tmetpi3_impl.this.A130BarCodPar = GXv_char2[0] ;
      tmetpi3_impl.this.A2813MetPieCod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A2809MetTerCod", A2809MetTerCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A2813MetPieCod", A2813MetPieCod);
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,A2809MetTerCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A2813MetPieCod});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A2809MetTerCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2813MetPieCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e141F22( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,A2809MetTerCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A2813MetPieCod});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A2809MetTerCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2813MetPieCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1F2413( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2814MetPieKil = T01F23_A2814MetPieKil[0] ;
            Z2815MetPieMet = T01F23_A2815MetPieMet[0] ;
            Z2816MetPieEst = T01F23_A2816MetPieEst[0] ;
            Z2846MetPieDsc = T01F23_A2846MetPieDsc[0] ;
            Z4909MetPieDef = T01F23_A4909MetPieDef[0] ;
            Z4910MetPieMtD = T01F23_A4910MetPieMtD[0] ;
            Z4911MetPieCol = T01F23_A4911MetPieCol[0] ;
            Z4912MetPiePDo = T01F23_A4912MetPiePDo[0] ;
            Z4913MetPieLoc = T01F23_A4913MetPieLoc[0] ;
            Z4914MetPieRap = T01F23_A4914MetPieRap[0] ;
            Z4915MetPieDCP = T01F23_A4915MetPieDCP[0] ;
            Z4916MetPieMue = T01F23_A4916MetPieMue[0] ;
            Z4917MetPieObs = T01F23_A4917MetPieObs[0] ;
         }
         else
         {
            Z2814MetPieKil = A2814MetPieKil ;
            Z2815MetPieMet = A2815MetPieMet ;
            Z2816MetPieEst = A2816MetPieEst ;
            Z2846MetPieDsc = A2846MetPieDsc ;
            Z4909MetPieDef = A4909MetPieDef ;
            Z4910MetPieMtD = A4910MetPieMtD ;
            Z4911MetPieCol = A4911MetPieCol ;
            Z4912MetPiePDo = A4912MetPiePDo ;
            Z4913MetPieLoc = A4913MetPieLoc ;
            Z4914MetPieRap = A4914MetPieRap ;
            Z4915MetPieDCP = A4915MetPieDCP ;
            Z4916MetPieMue = A4916MetPieMue ;
            Z4917MetPieObs = A4917MetPieObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z2813MetPieCod = A2813MetPieCod ;
         Z2814MetPieKil = A2814MetPieKil ;
         Z2815MetPieMet = A2815MetPieMet ;
         Z2816MetPieEst = A2816MetPieEst ;
         Z2846MetPieDsc = A2846MetPieDsc ;
         Z4909MetPieDef = A4909MetPieDef ;
         Z4910MetPieMtD = A4910MetPieMtD ;
         Z4911MetPieCol = A4911MetPieCol ;
         Z4912MetPiePDo = A4912MetPiePDo ;
         Z4913MetPieLoc = A4913MetPieLoc ;
         Z4914MetPieRap = A4914MetPieRap ;
         Z4915MetPieDCP = A4915MetPieDCP ;
         Z4916MetPieMue = A4916MetPieMue ;
         Z4917MetPieObs = A4917MetPieObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2809MetTerCod = A2809MetTerCod ;
         Z407EmprNom = A407EmprNom ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z159BarFecGen = A159BarFecGen ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01F24 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01F24_A407EmprNom[0] ;
      n407EmprNom = T01F24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01F25 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01F25_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01F25_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01F25_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01F25_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A159BarFecGen = T01F25_A159BarFecGen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A159BarFecGen", localUtil.format(A159BarFecGen, "99/99/99"));
      A252CliCod = T01F25_A252CliCod[0] ;
      n252CliCod = T01F25_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      /* Using cursor T01F27 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T01F27_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01F26 */
      pr_default.execute(4, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilice el botón \"Eliminar\" ", ""), 1, "");
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

   public void load1F2413( )
   {
      /* Using cursor T01F28 */
      pr_default.execute(6, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound413 = (short)(1) ;
         A279CliNom = T01F28_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T01F28_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01F28_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01F28_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01F28_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A407EmprNom = T01F28_A407EmprNom[0] ;
         n407EmprNom = T01F28_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A159BarFecGen = T01F28_A159BarFecGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A159BarFecGen", localUtil.format(A159BarFecGen, "99/99/99"));
         A2814MetPieKil = T01F28_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01F28_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A2816MetPieEst = T01F28_A2816MetPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         A2846MetPieDsc = T01F28_A2846MetPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
         A4909MetPieDef = T01F28_A4909MetPieDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         A4910MetPieMtD = T01F28_A4910MetPieMtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
         A4911MetPieCol = T01F28_A4911MetPieCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4911MetPieCol", A4911MetPieCol);
         A4912MetPiePDo = T01F28_A4912MetPiePDo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4912MetPiePDo), 10, 0));
         A4913MetPieLoc = T01F28_A4913MetPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4913MetPieLoc", A4913MetPieLoc);
         A4914MetPieRap = T01F28_A4914MetPieRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4914MetPieRap", A4914MetPieRap);
         A4915MetPieDCP = T01F28_A4915MetPieDCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4915MetPieDCP", A4915MetPieDCP);
         A4916MetPieMue = T01F28_A4916MetPieMue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4916MetPieMue", A4916MetPieMue);
         A4917MetPieObs = T01F28_A4917MetPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
         A252CliCod = T01F28_A252CliCod[0] ;
         n252CliCod = T01F28_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1F2413( -5) ;
      }
      pr_default.close(6);
      onLoadActions1F2413( ) ;
   }

   public void onLoadActions1F2413( )
   {
   }

   public void checkExtendedTable1F2413( )
   {
      nIsDirty_413 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A4914MetPieRap, "S") == 0 ) || ( GXutil.strcmp(A4914MetPieRap, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Raport", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "METPIERAP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieRap_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4915MetPieDCP, "S") == 0 ) || ( GXutil.strcmp(A4915MetPieDCP, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "S=Calidad 1, N=Calidad 2", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "METPIEDCP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieDCP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4916MetPieMue, "S") == 0 ) || ( GXutil.strcmp(A4916MetPieMue, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Muestra?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "METPIEMUE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetPieMue_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1F2413( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F2413( )
   {
      /* Using cursor T01F29 */
      pr_default.execute(7, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      else
      {
         RcdFound413 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F23 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01F23_A2813MetPieCod[0], A2813MetPieCod) == 0 ) && ( GXutil.strcmp(T01F23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F23_A129BarCod[0] == A129BarCod ) && ( T01F23_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01F23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01F23_A2809MetTerCod[0], A2809MetTerCod) == 0 ) )
      {
         zm1F2413( 5) ;
         RcdFound413 = (short)(1) ;
         A2814MetPieKil = T01F23_A2814MetPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
         A2815MetPieMet = T01F23_A2815MetPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
         A2816MetPieEst = T01F23_A2816MetPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
         A2846MetPieDsc = T01F23_A2846MetPieDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
         A4909MetPieDef = T01F23_A4909MetPieDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
         A4910MetPieMtD = T01F23_A4910MetPieMtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
         A4911MetPieCol = T01F23_A4911MetPieCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4911MetPieCol", A4911MetPieCol);
         A4912MetPiePDo = T01F23_A4912MetPiePDo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4912MetPiePDo), 10, 0));
         A4913MetPieLoc = T01F23_A4913MetPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4913MetPieLoc", A4913MetPieLoc);
         A4914MetPieRap = T01F23_A4914MetPieRap[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4914MetPieRap", A4914MetPieRap);
         A4915MetPieDCP = T01F23_A4915MetPieDCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4915MetPieDCP", A4915MetPieDCP);
         A4916MetPieMue = T01F23_A4916MetPieMue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4916MetPieMue", A4916MetPieMue);
         A4917MetPieObs = T01F23_A4917MetPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
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
         load1F2413( ) ;
         if ( AnyError == 1 )
         {
            RcdFound413 = (short)(0) ;
            initializeNonKey1F2413( ) ;
         }
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound413 = (short)(0) ;
         initializeNonKey1F2413( ) ;
         sMode413 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode413 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1F2413( ) ;
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
      /* Using cursor T01F210 */
      pr_default.execute(8, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F210_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F210_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01F210_A129BarCod[0] == A129BarCod ) && ( T01F210_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01F210_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01F210_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F210_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F210_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01F210_A129BarCod[0] == A129BarCod ) && ( T01F210_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01F210_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01F210_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound413 = (short)(0) ;
      /* Using cursor T01F211 */
      pr_default.execute(9, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F211_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F211_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01F211_A129BarCod[0] == A129BarCod ) && ( T01F211_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01F211_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01F211_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F211_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01F211_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( T01F211_A129BarCod[0] == A129BarCod ) && ( T01F211_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01F211_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01F211_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            RcdFound413 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F2413( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMetPieKil_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F2413( ) ;
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
               update1F2413( ) ;
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
               GX_FocusControl = edtMetPieKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F2413( ) ;
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
                  GX_FocusControl = edtMetPieKil_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F2413( ) ;
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
      getKey1F2413( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmetpi3");
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1F20( ) ;
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
      scanStart1F2413( ) ;
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
      scanEnd1F2413( ) ;
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
      scanStart1F2413( ) ;
      if ( RcdFound413 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound413 != 0 )
         {
            scanNext1F2413( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMetPieKil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F2413( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F2413( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F22 */
         pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2814MetPieKil, T01F22_A2814MetPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z2815MetPieMet, T01F22_A2815MetPieMet[0]) != 0 ) || ( Z2816MetPieEst != T01F22_A2816MetPieEst[0] ) || ( GXutil.strcmp(Z2846MetPieDsc, T01F22_A2846MetPieDsc[0]) != 0 ) || ( Z4909MetPieDef != T01F22_A4909MetPieDef[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4910MetPieMtD, T01F22_A4910MetPieMtD[0]) != 0 ) || ( GXutil.strcmp(Z4911MetPieCol, T01F22_A4911MetPieCol[0]) != 0 ) || ( Z4912MetPiePDo != T01F22_A4912MetPiePDo[0] ) || ( GXutil.strcmp(Z4913MetPieLoc, T01F22_A4913MetPieLoc[0]) != 0 ) || ( GXutil.strcmp(Z4914MetPieRap, T01F22_A4914MetPieRap[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4915MetPieDCP, T01F22_A4915MetPieDCP[0]) != 0 ) || ( GXutil.strcmp(Z4916MetPieMue, T01F22_A4916MetPieMue[0]) != 0 ) || ( GXutil.strcmp(Z4917MetPieObs, T01F22_A4917MetPieObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2814MetPieKil, T01F22_A2814MetPieKil[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieKil");
               GXutil.writeLogRaw("Old: ",Z2814MetPieKil);
               GXutil.writeLogRaw("Current: ",T01F22_A2814MetPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z2815MetPieMet, T01F22_A2815MetPieMet[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieMet");
               GXutil.writeLogRaw("Old: ",Z2815MetPieMet);
               GXutil.writeLogRaw("Current: ",T01F22_A2815MetPieMet[0]);
            }
            if ( Z2816MetPieEst != T01F22_A2816MetPieEst[0] )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieEst");
               GXutil.writeLogRaw("Old: ",Z2816MetPieEst);
               GXutil.writeLogRaw("Current: ",T01F22_A2816MetPieEst[0]);
            }
            if ( GXutil.strcmp(Z2846MetPieDsc, T01F22_A2846MetPieDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieDsc");
               GXutil.writeLogRaw("Old: ",Z2846MetPieDsc);
               GXutil.writeLogRaw("Current: ",T01F22_A2846MetPieDsc[0]);
            }
            if ( Z4909MetPieDef != T01F22_A4909MetPieDef[0] )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieDef");
               GXutil.writeLogRaw("Old: ",Z4909MetPieDef);
               GXutil.writeLogRaw("Current: ",T01F22_A4909MetPieDef[0]);
            }
            if ( DecimalUtil.compareTo(Z4910MetPieMtD, T01F22_A4910MetPieMtD[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieMtD");
               GXutil.writeLogRaw("Old: ",Z4910MetPieMtD);
               GXutil.writeLogRaw("Current: ",T01F22_A4910MetPieMtD[0]);
            }
            if ( GXutil.strcmp(Z4911MetPieCol, T01F22_A4911MetPieCol[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieCol");
               GXutil.writeLogRaw("Old: ",Z4911MetPieCol);
               GXutil.writeLogRaw("Current: ",T01F22_A4911MetPieCol[0]);
            }
            if ( Z4912MetPiePDo != T01F22_A4912MetPiePDo[0] )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPiePDo");
               GXutil.writeLogRaw("Old: ",Z4912MetPiePDo);
               GXutil.writeLogRaw("Current: ",T01F22_A4912MetPiePDo[0]);
            }
            if ( GXutil.strcmp(Z4913MetPieLoc, T01F22_A4913MetPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieLoc");
               GXutil.writeLogRaw("Old: ",Z4913MetPieLoc);
               GXutil.writeLogRaw("Current: ",T01F22_A4913MetPieLoc[0]);
            }
            if ( GXutil.strcmp(Z4914MetPieRap, T01F22_A4914MetPieRap[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieRap");
               GXutil.writeLogRaw("Old: ",Z4914MetPieRap);
               GXutil.writeLogRaw("Current: ",T01F22_A4914MetPieRap[0]);
            }
            if ( GXutil.strcmp(Z4915MetPieDCP, T01F22_A4915MetPieDCP[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieDCP");
               GXutil.writeLogRaw("Old: ",Z4915MetPieDCP);
               GXutil.writeLogRaw("Current: ",T01F22_A4915MetPieDCP[0]);
            }
            if ( GXutil.strcmp(Z4916MetPieMue, T01F22_A4916MetPieMue[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieMue");
               GXutil.writeLogRaw("Old: ",Z4916MetPieMue);
               GXutil.writeLogRaw("Current: ",T01F22_A4916MetPieMue[0]);
            }
            if ( GXutil.strcmp(Z4917MetPieObs, T01F22_A4917MetPieObs[0]) != 0 )
            {
               GXutil.writeLogln("tmetpi3:[seudo value changed for attri]"+"MetPieObs");
               GXutil.writeLogRaw("Old: ",Z4917MetPieObs);
               GXutil.writeLogRaw("Current: ",T01F22_A4917MetPieObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMETPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F2413( )
   {
      beforeValidate1F2413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F2413( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F2413( 0) ;
         checkOptimisticConcurrency1F2413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F2413( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F2413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F212 */
                  pr_default.execute(10, new Object[] {A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A2846MetPieDsc, Short.valueOf(A4909MetPieDef), A4910MetPieMtD, A4911MetPieCol, Long.valueOf(A4912MetPiePDo), A4913MetPieLoc, A4914MetPieRap, A4915MetPieDCP, A4916MetPieMue, A4917MetPieObs, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1F20( ) ;
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
            load1F2413( ) ;
         }
         endLevel1F2413( ) ;
      }
      closeExtendedTableCursors1F2413( ) ;
   }

   public void update1F2413( )
   {
      beforeValidate1F2413( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F2413( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F2413( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F2413( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F2413( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F213 */
                  pr_default.execute(11, new Object[] {A2814MetPieKil, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A2846MetPieDsc, Short.valueOf(A4909MetPieDef), A4910MetPieMtD, A4911MetPieCol, Long.valueOf(A4912MetPiePDo), A4913MetPieLoc, A4914MetPieRap, A4915MetPieDCP, A4916MetPieMue, A4917MetPieObs, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMETPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F2413( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1F20( ) ;
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
         endLevel1F2413( ) ;
      }
      closeExtendedTableCursors1F2413( ) ;
   }

   public void deferredUpdate1F2413( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F2413( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F2413( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F2413( ) ;
         afterConfirm1F2413( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F2413( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F214 */
               pr_default.execute(12, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
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
                        initAll1F2413( ) ;
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
                     resetCaption1F20( ) ;
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
      sMode413 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F2413( ) ;
      Gx_mode = sMode413 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F2413( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1F2413( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F2413( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmetpi3");
         if ( AnyError == 0 )
         {
            confirmValues1F20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmetpi3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F2413( )
   {
      /* Scan By routine */
      /* Using cursor T01F215 */
      pr_default.execute(13, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F2413( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound413 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound413 = (short)(1) ;
      }
   }

   public void scanEnd1F2413( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1F2413( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F2413( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F2413( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F2413( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F2413( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F2413( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F2413( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMetTerCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetTerCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Enabled), 5, 0), true);
      edtMetPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarFecGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecGen_Enabled), 5, 0), true);
      edtMetPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Enabled), 5, 0), true);
      edtMetPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Enabled), 5, 0), true);
      edtMetPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Enabled), 5, 0), true);
      edtMetPieDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDsc_Enabled), 5, 0), true);
      edtMetPieDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDef_Enabled), 5, 0), true);
      edtMetPieMtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Enabled), 5, 0), true);
      edtMetPieCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCol_Enabled), 5, 0), true);
      edtMetPiePDo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPiePDo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPiePDo_Enabled), 5, 0), true);
      edtMetPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieLoc_Enabled), 5, 0), true);
      edtMetPieRap_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieRap_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieRap_Enabled), 5, 0), true);
      edtMetPieDCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieDCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDCP_Enabled), 5, 0), true);
      edtMetPieMue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieMue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMue_Enabled), 5, 0), true);
      edtMetPieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1F2413( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1F20( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmetpi3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2846MetPieDsc", GXutil.rtrim( Z2846MetPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4909MetPieDef", GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4911MetPieCol", GXutil.rtrim( Z4911MetPieCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4912MetPiePDo", GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4913MetPieLoc", GXutil.rtrim( Z4913MetPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4914MetPieRap", GXutil.rtrim( Z4914MetPieRap));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4915MetPieDCP", GXutil.rtrim( Z4915MetPieDCP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4916MetPieMue", GXutil.rtrim( Z4916MetPieMue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4917MetPieObs", Z4917MetPieObs);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tmetpi3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A2809MetTerCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod))}, new String[] {"EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","MetPieCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMETPI3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Defectos de piezas", "") ;
   }

   public void initializeNonKey1F2413( )
   {
      A2814MetPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrimstr( A2814MetPieKil, 9, 2));
      A2815MetPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrimstr( A2815MetPieMet, 9, 2));
      A2816MetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.str( A2816MetPieEst, 1, 0));
      A2846MetPieDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", A2846MetPieDsc);
      A4909MetPieDef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4909MetPieDef), 3, 0));
      A4910MetPieMtD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrimstr( A4910MetPieMtD, 8, 2));
      A4911MetPieCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4911MetPieCol", A4911MetPieCol);
      A4912MetPiePDo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4912MetPiePDo), 10, 0));
      A4913MetPieLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4913MetPieLoc", A4913MetPieLoc);
      A4914MetPieRap = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4914MetPieRap", A4914MetPieRap);
      A4915MetPieDCP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4915MetPieDCP", A4915MetPieDCP);
      A4916MetPieMue = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4916MetPieMue", A4916MetPieMue);
      A4917MetPieObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z2816MetPieEst = (byte)(0) ;
      Z2846MetPieDsc = "" ;
      Z4909MetPieDef = (short)(0) ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z4911MetPieCol = "" ;
      Z4912MetPiePDo = 0 ;
      Z4913MetPieLoc = "" ;
      Z4914MetPieRap = "" ;
      Z4915MetPieDCP = "" ;
      Z4916MetPieMue = "" ;
      Z4917MetPieObs = "" ;
   }

   public void initAll1F2413( )
   {
      initializeNonKey1F2413( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824157237", true, true);
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
      httpContext.AddJavascriptSource("tmetpi3.js", "?2026824157237", false, true);
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
      edtMetTerCod_Internalname = "METTERCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMetPieCod_Internalname = "METPIECOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtMetPieKil_Internalname = "METPIEKIL" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtMetPieMet_Internalname = "METPIEMET" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtMetPieEst_Internalname = "METPIEEST" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtMetPieDsc_Internalname = "METPIEDSC" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtMetPieDef_Internalname = "METPIEDEF" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtMetPieMtD_Internalname = "METPIEMTD" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtMetPieCol_Internalname = "METPIECOL" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtMetPiePDo_Internalname = "METPIEPDO" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtMetPieLoc_Internalname = "METPIELOC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtMetPieRap_Internalname = "METPIERAP" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtMetPieDCP_Internalname = "METPIEDCP" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtMetPieMue_Internalname = "METPIEMUE" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtMetPieObs_Internalname = "METPIEOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Defectos de piezas", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMetPieObs_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieObs_Enabled = 1 ;
      edtMetPieMue_Jsonclick = "" ;
      edtMetPieMue_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieMue_Enabled = 1 ;
      edtMetPieDCP_Jsonclick = "" ;
      edtMetPieDCP_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieDCP_Enabled = 1 ;
      edtMetPieRap_Jsonclick = "" ;
      edtMetPieRap_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieRap_Enabled = 1 ;
      edtMetPieLoc_Jsonclick = "" ;
      edtMetPieLoc_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieLoc_Enabled = 1 ;
      edtMetPiePDo_Jsonclick = "" ;
      edtMetPiePDo_Backcolor = (int)(0xFFFFFF) ;
      edtMetPiePDo_Enabled = 1 ;
      edtMetPieCol_Jsonclick = "" ;
      edtMetPieCol_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieCol_Enabled = 1 ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieMtD_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieMtD_Enabled = 1 ;
      edtMetPieDef_Jsonclick = "" ;
      edtMetPieDef_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieDef_Enabled = 1 ;
      edtMetPieDsc_Jsonclick = "" ;
      edtMetPieDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieDsc_Enabled = 1 ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieEst_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieEst_Enabled = 1 ;
      edtMetPieMet_Jsonclick = "" ;
      edtMetPieMet_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieMet_Enabled = 1 ;
      edtMetPieKil_Jsonclick = "" ;
      edtMetPieKil_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieKil_Enabled = 1 ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarFecGen_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecGen_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      edtMetPieCod_Jsonclick = "" ;
      edtMetPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtMetPieCod_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01F216 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01F216_A407EmprNom[0] ;
      n407EmprNom = T01F216_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T01F217 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A212BarSer = T01F217_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01F217_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01F217_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01F217_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A159BarFecGen = T01F217_A159BarFecGen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A159BarFecGen", localUtil.format(A159BarFecGen, "99/99/99"));
      A252CliCod = T01F217_A252CliCod[0] ;
      n252CliCod = T01F217_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(15);
      /* Using cursor T01F218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
         }
      }
      A279CliNom = T01F218_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01F219 */
      pr_default.execute(17, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CMETPI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(17);
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

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A159BarFecGen", localUtil.format(A159BarFecGen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2814MetPieKil", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2815MetPieMet", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2816MetPieEst", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2846MetPieDsc", GXutil.rtrim( A2846MetPieDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4909MetPieDef", GXutil.ltrim( localUtil.ntoc( A4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4911MetPieCol", GXutil.rtrim( A4911MetPieCol));
      httpContext.ajax_rsp_assign_attri("", false, "A4912MetPiePDo", GXutil.ltrim( localUtil.ntoc( A4912MetPiePDo, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4913MetPieLoc", GXutil.rtrim( A4913MetPieLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A4914MetPieRap", GXutil.rtrim( A4914MetPieRap));
      httpContext.ajax_rsp_assign_attri("", false, "A4915MetPieDCP", GXutil.rtrim( A4915MetPieDCP));
      httpContext.ajax_rsp_assign_attri("", false, "A4916MetPieMue", GXutil.rtrim( A4916MetPieMue));
      httpContext.ajax_rsp_assign_attri("", false, "A4917MetPieObs", A4917MetPieObs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2809MetTerCod", GXutil.rtrim( Z2809MetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2813MetPieCod", GXutil.rtrim( Z2813MetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z159BarFecGen", localUtil.format(Z159BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2814MetPieKil", GXutil.ltrim( localUtil.ntoc( Z2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2815MetPieMet", GXutil.ltrim( localUtil.ntoc( Z2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2816MetPieEst", GXutil.ltrim( localUtil.ntoc( Z2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2846MetPieDsc", GXutil.rtrim( Z2846MetPieDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4909MetPieDef", GXutil.ltrim( localUtil.ntoc( Z4909MetPieDef, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4910MetPieMtD", GXutil.ltrim( localUtil.ntoc( Z4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4911MetPieCol", GXutil.rtrim( Z4911MetPieCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4912MetPiePDo", GXutil.ltrim( localUtil.ntoc( Z4912MetPiePDo, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4913MetPieLoc", GXutil.rtrim( Z4913MetPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4914MetPieRap", GXutil.rtrim( Z4914MetPieRap));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4915MetPieDCP", GXutil.rtrim( Z4915MetPieDCP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4916MetPieMue", GXutil.rtrim( Z4916MetPieMue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4917MetPieObs", Z4917MetPieObs);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'HOJAS DE RUTA'","{handler:'e121F22',iparms:[{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'HOJAS DE RUTA'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ELIMINAR'","{handler:'e131F22',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("'ELIMINAR'",",oparms:[{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e141F22',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A2846MetPieDsc',fld:'METPIEDSC',pic:''},{av:'A4909MetPieDef',fld:'METPIEDEF',pic:'ZZZ'},{av:'A4910MetPieMtD',fld:'METPIEMTD',pic:'ZZZZ9.99'},{av:'A4911MetPieCol',fld:'METPIECOL',pic:''},{av:'A4912MetPiePDo',fld:'METPIEPDO',pic:'ZZZZZZZZZ9'},{av:'A4913MetPieLoc',fld:'METPIELOC',pic:''},{av:'A4914MetPieRap',fld:'METPIERAP',pic:'@!'},{av:'A4915MetPieDCP',fld:'METPIEDCP',pic:'@!'},{av:'A4916MetPieMue',fld:'METPIEMUE',pic:'@!'},{av:'A4917MetPieObs',fld:'METPIEOBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2809MetTerCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2813MetPieCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z212BarSer'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z407EmprNom'},{av:'Z159BarFecGen'},{av:'Z2814MetPieKil'},{av:'Z2815MetPieMet'},{av:'Z2816MetPieEst'},{av:'Z2846MetPieDsc'},{av:'Z4909MetPieDef'},{av:'Z4910MetPieMtD'},{av:'Z4911MetPieCol'},{av:'Z4912MetPiePDo'},{av:'Z4913MetPieLoc'},{av:'Z4914MetPieRap'},{av:'Z4915MetPieDCP'},{av:'Z4916MetPieMue'},{av:'Z4917MetPieObs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_METPIERAP","{handler:'valid_Metpierap',iparms:[]");
      setEventMetadata("VALID_METPIERAP",",oparms:[]}");
      setEventMetadata("VALID_METPIEDCP","{handler:'valid_Metpiedcp',iparms:[]");
      setEventMetadata("VALID_METPIEDCP",",oparms:[]}");
      setEventMetadata("VALID_METPIEMUE","{handler:'valid_Metpiemue',iparms:[]");
      setEventMetadata("VALID_METPIEMUE",",oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2809MetTerCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA2813MetPieCod = "" ;
      Z396EmprCod = "" ;
      Z2809MetTerCod = "" ;
      Z130BarCodPar = "" ;
      Z2813MetPieCod = "" ;
      Z2814MetPieKil = DecimalUtil.ZERO ;
      Z2815MetPieMet = DecimalUtil.ZERO ;
      Z2846MetPieDsc = "" ;
      Z4910MetPieMtD = DecimalUtil.ZERO ;
      Z4911MetPieCol = "" ;
      Z4913MetPieLoc = "" ;
      Z4914MetPieRap = "" ;
      Z4915MetPieDCP = "" ;
      Z4916MetPieMue = "" ;
      Z4917MetPieObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      lblTextblock15_Jsonclick = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A2846MetPieDsc = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A4911MetPieCol = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A4913MetPieLoc = "" ;
      lblTextblock24_Jsonclick = "" ;
      A4914MetPieRap = "" ;
      lblTextblock25_Jsonclick = "" ;
      A4915MetPieDCP = "" ;
      lblTextblock26_Jsonclick = "" ;
      A4916MetPieMue = "" ;
      lblTextblock27_Jsonclick = "" ;
      A4917MetPieObs = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV35LitFe = "" ;
      AV16Lit0 = "" ;
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
      GXt_char1 = "" ;
      AV36lit18 = "" ;
      AV37Station = "" ;
      AV39EmprNom = "" ;
      AV34UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      Z407EmprNom = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z159BarFecGen = GXutil.nullDate() ;
      Z279CliNom = "" ;
      T01F24_A407EmprNom = new String[] {""} ;
      T01F24_n407EmprNom = new boolean[] {false} ;
      T01F25_A212BarSer = new String[] {""} ;
      T01F25_A135BarColNom = new String[] {""} ;
      T01F25_A136BarColNum = new int[1] ;
      T01F25_A218BarTipCol = new byte[1] ;
      T01F25_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T01F25_A252CliCod = new int[1] ;
      T01F25_n252CliCod = new boolean[] {false} ;
      T01F27_A279CliNom = new String[] {""} ;
      T01F26_A396EmprCod = new String[] {""} ;
      T01F28_A2813MetPieCod = new String[] {""} ;
      T01F28_A279CliNom = new String[] {""} ;
      T01F28_A212BarSer = new String[] {""} ;
      T01F28_A135BarColNom = new String[] {""} ;
      T01F28_A136BarColNum = new int[1] ;
      T01F28_A218BarTipCol = new byte[1] ;
      T01F28_A407EmprNom = new String[] {""} ;
      T01F28_n407EmprNom = new boolean[] {false} ;
      T01F28_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T01F28_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F28_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F28_A2816MetPieEst = new byte[1] ;
      T01F28_A2846MetPieDsc = new String[] {""} ;
      T01F28_A4909MetPieDef = new short[1] ;
      T01F28_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F28_A4911MetPieCol = new String[] {""} ;
      T01F28_A4912MetPiePDo = new long[1] ;
      T01F28_A4913MetPieLoc = new String[] {""} ;
      T01F28_A4914MetPieRap = new String[] {""} ;
      T01F28_A4915MetPieDCP = new String[] {""} ;
      T01F28_A4916MetPieMue = new String[] {""} ;
      T01F28_A4917MetPieObs = new String[] {""} ;
      T01F28_A396EmprCod = new String[] {""} ;
      T01F28_A129BarCod = new int[1] ;
      T01F28_A132BarCodReo = new byte[1] ;
      T01F28_A130BarCodPar = new String[] {""} ;
      T01F28_A2809MetTerCod = new String[] {""} ;
      T01F28_A252CliCod = new int[1] ;
      T01F28_n252CliCod = new boolean[] {false} ;
      T01F29_A396EmprCod = new String[] {""} ;
      T01F29_A2809MetTerCod = new String[] {""} ;
      T01F29_A129BarCod = new int[1] ;
      T01F29_A132BarCodReo = new byte[1] ;
      T01F29_A130BarCodPar = new String[] {""} ;
      T01F29_A2813MetPieCod = new String[] {""} ;
      T01F23_A2813MetPieCod = new String[] {""} ;
      T01F23_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F23_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F23_A2816MetPieEst = new byte[1] ;
      T01F23_A2846MetPieDsc = new String[] {""} ;
      T01F23_A4909MetPieDef = new short[1] ;
      T01F23_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F23_A4911MetPieCol = new String[] {""} ;
      T01F23_A4912MetPiePDo = new long[1] ;
      T01F23_A4913MetPieLoc = new String[] {""} ;
      T01F23_A4914MetPieRap = new String[] {""} ;
      T01F23_A4915MetPieDCP = new String[] {""} ;
      T01F23_A4916MetPieMue = new String[] {""} ;
      T01F23_A4917MetPieObs = new String[] {""} ;
      T01F23_A396EmprCod = new String[] {""} ;
      T01F23_A129BarCod = new int[1] ;
      T01F23_A132BarCodReo = new byte[1] ;
      T01F23_A130BarCodPar = new String[] {""} ;
      T01F23_A2809MetTerCod = new String[] {""} ;
      sMode413 = "" ;
      T01F210_A396EmprCod = new String[] {""} ;
      T01F210_A2809MetTerCod = new String[] {""} ;
      T01F210_A129BarCod = new int[1] ;
      T01F210_A132BarCodReo = new byte[1] ;
      T01F210_A130BarCodPar = new String[] {""} ;
      T01F210_A2813MetPieCod = new String[] {""} ;
      T01F211_A396EmprCod = new String[] {""} ;
      T01F211_A2809MetTerCod = new String[] {""} ;
      T01F211_A129BarCod = new int[1] ;
      T01F211_A132BarCodReo = new byte[1] ;
      T01F211_A130BarCodPar = new String[] {""} ;
      T01F211_A2813MetPieCod = new String[] {""} ;
      T01F22_A2813MetPieCod = new String[] {""} ;
      T01F22_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F22_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F22_A2816MetPieEst = new byte[1] ;
      T01F22_A2846MetPieDsc = new String[] {""} ;
      T01F22_A4909MetPieDef = new short[1] ;
      T01F22_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F22_A4911MetPieCol = new String[] {""} ;
      T01F22_A4912MetPiePDo = new long[1] ;
      T01F22_A4913MetPieLoc = new String[] {""} ;
      T01F22_A4914MetPieRap = new String[] {""} ;
      T01F22_A4915MetPieDCP = new String[] {""} ;
      T01F22_A4916MetPieMue = new String[] {""} ;
      T01F22_A4917MetPieObs = new String[] {""} ;
      T01F22_A396EmprCod = new String[] {""} ;
      T01F22_A129BarCod = new int[1] ;
      T01F22_A132BarCodReo = new byte[1] ;
      T01F22_A130BarCodPar = new String[] {""} ;
      T01F22_A2809MetTerCod = new String[] {""} ;
      T01F215_A396EmprCod = new String[] {""} ;
      T01F215_A2809MetTerCod = new String[] {""} ;
      T01F215_A129BarCod = new int[1] ;
      T01F215_A132BarCodReo = new byte[1] ;
      T01F215_A130BarCodPar = new String[] {""} ;
      T01F215_A2813MetPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01F216_A407EmprNom = new String[] {""} ;
      T01F216_n407EmprNom = new boolean[] {false} ;
      T01F217_A212BarSer = new String[] {""} ;
      T01F217_A135BarColNom = new String[] {""} ;
      T01F217_A136BarColNum = new int[1] ;
      T01F217_A218BarTipCol = new byte[1] ;
      T01F217_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T01F217_A252CliCod = new int[1] ;
      T01F217_n252CliCod = new boolean[] {false} ;
      T01F218_A279CliNom = new String[] {""} ;
      T01F219_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2809MetTerCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2813MetPieCod = "" ;
      ZZ279CliNom = "" ;
      ZZ212BarSer = "" ;
      ZZ135BarColNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ159BarFecGen = GXutil.nullDate() ;
      ZZ2814MetPieKil = DecimalUtil.ZERO ;
      ZZ2815MetPieMet = DecimalUtil.ZERO ;
      ZZ2846MetPieDsc = "" ;
      ZZ4910MetPieMtD = DecimalUtil.ZERO ;
      ZZ4911MetPieCol = "" ;
      ZZ4913MetPieLoc = "" ;
      ZZ4914MetPieRap = "" ;
      ZZ4915MetPieDCP = "" ;
      ZZ4916MetPieMue = "" ;
      ZZ4917MetPieObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmetpi3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmetpi3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmetpi3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmetpi3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmetpi3__default(),
         new Object[] {
             new Object[] {
            T01F22_A2813MetPieCod, T01F22_A2814MetPieKil, T01F22_A2815MetPieMet, T01F22_A2816MetPieEst, T01F22_A2846MetPieDsc, T01F22_A4909MetPieDef, T01F22_A4910MetPieMtD, T01F22_A4911MetPieCol, T01F22_A4912MetPiePDo, T01F22_A4913MetPieLoc,
            T01F22_A4914MetPieRap, T01F22_A4915MetPieDCP, T01F22_A4916MetPieMue, T01F22_A4917MetPieObs, T01F22_A396EmprCod, T01F22_A129BarCod, T01F22_A132BarCodReo, T01F22_A130BarCodPar, T01F22_A2809MetTerCod
            }
            , new Object[] {
            T01F23_A2813MetPieCod, T01F23_A2814MetPieKil, T01F23_A2815MetPieMet, T01F23_A2816MetPieEst, T01F23_A2846MetPieDsc, T01F23_A4909MetPieDef, T01F23_A4910MetPieMtD, T01F23_A4911MetPieCol, T01F23_A4912MetPiePDo, T01F23_A4913MetPieLoc,
            T01F23_A4914MetPieRap, T01F23_A4915MetPieDCP, T01F23_A4916MetPieMue, T01F23_A4917MetPieObs, T01F23_A396EmprCod, T01F23_A129BarCod, T01F23_A132BarCodReo, T01F23_A130BarCodPar, T01F23_A2809MetTerCod
            }
            , new Object[] {
            T01F24_A407EmprNom, T01F24_n407EmprNom
            }
            , new Object[] {
            T01F25_A212BarSer, T01F25_A135BarColNom, T01F25_A136BarColNum, T01F25_A218BarTipCol, T01F25_A159BarFecGen, T01F25_A252CliCod, T01F25_n252CliCod
            }
            , new Object[] {
            T01F26_A396EmprCod
            }
            , new Object[] {
            T01F27_A279CliNom
            }
            , new Object[] {
            T01F28_A2813MetPieCod, T01F28_A279CliNom, T01F28_A212BarSer, T01F28_A135BarColNom, T01F28_A136BarColNum, T01F28_A218BarTipCol, T01F28_A407EmprNom, T01F28_n407EmprNom, T01F28_A159BarFecGen, T01F28_A2814MetPieKil,
            T01F28_A2815MetPieMet, T01F28_A2816MetPieEst, T01F28_A2846MetPieDsc, T01F28_A4909MetPieDef, T01F28_A4910MetPieMtD, T01F28_A4911MetPieCol, T01F28_A4912MetPiePDo, T01F28_A4913MetPieLoc, T01F28_A4914MetPieRap, T01F28_A4915MetPieDCP,
            T01F28_A4916MetPieMue, T01F28_A4917MetPieObs, T01F28_A396EmprCod, T01F28_A129BarCod, T01F28_A132BarCodReo, T01F28_A130BarCodPar, T01F28_A2809MetTerCod, T01F28_A252CliCod, T01F28_n252CliCod
            }
            , new Object[] {
            T01F29_A396EmprCod, T01F29_A2809MetTerCod, T01F29_A129BarCod, T01F29_A132BarCodReo, T01F29_A130BarCodPar, T01F29_A2813MetPieCod
            }
            , new Object[] {
            T01F210_A396EmprCod, T01F210_A2809MetTerCod, T01F210_A129BarCod, T01F210_A132BarCodReo, T01F210_A130BarCodPar, T01F210_A2813MetPieCod
            }
            , new Object[] {
            T01F211_A396EmprCod, T01F211_A2809MetTerCod, T01F211_A129BarCod, T01F211_A132BarCodReo, T01F211_A130BarCodPar, T01F211_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F215_A396EmprCod, T01F215_A2809MetTerCod, T01F215_A129BarCod, T01F215_A132BarCodReo, T01F215_A130BarCodPar, T01F215_A2813MetPieCod
            }
            , new Object[] {
            T01F216_A407EmprNom, T01F216_n407EmprNom
            }
            , new Object[] {
            T01F217_A212BarSer, T01F217_A135BarColNom, T01F217_A136BarColNum, T01F217_A218BarTipCol, T01F217_A159BarFecGen, T01F217_A252CliCod, T01F217_n252CliCod
            }
            , new Object[] {
            T01F218_A279CliNom
            }
            , new Object[] {
            T01F219_A396EmprCod
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
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z2816MetPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A2816MetPieEst ;
   private byte GXv_int6[] ;
   private byte Z218BarTipCol ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ2816MetPieEst ;
   private short Z4909MetPieDef ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4909MetPieDef ;
   private short RcdFound413 ;
   private short nIsDirty_413 ;
   private short ZZ4909MetPieDef ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMetTerCod_Enabled ;
   private int edtMetPieCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarFecGen_Enabled ;
   private int edtMetPieKil_Enabled ;
   private int edtMetPieMet_Enabled ;
   private int edtMetPieEst_Enabled ;
   private int edtMetPieDsc_Enabled ;
   private int edtMetPieDef_Enabled ;
   private int edtMetPieMtD_Enabled ;
   private int edtMetPieCol_Enabled ;
   private int edtMetPiePDo_Enabled ;
   private int edtMetPieLoc_Enabled ;
   private int edtMetPieRap_Enabled ;
   private int edtMetPieDCP_Enabled ;
   private int edtMetPieMue_Enabled ;
   private int edtMetPieObs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int idxLst ;
   private int edtMetPieObs_Backcolor ;
   private int edtMetPieMue_Backcolor ;
   private int edtMetPieDCP_Backcolor ;
   private int edtMetPieRap_Backcolor ;
   private int edtMetPieLoc_Backcolor ;
   private int edtMetPiePDo_Backcolor ;
   private int edtMetPieCol_Backcolor ;
   private int edtMetPieMtD_Backcolor ;
   private int edtMetPieDef_Backcolor ;
   private int edtMetPieDsc_Backcolor ;
   private int edtMetPieEst_Backcolor ;
   private int edtMetPieMet_Backcolor ;
   private int edtMetPieKil_Backcolor ;
   private int edtBarFecGen_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtMetPieCod_Backcolor ;
   private int edtMetTerCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ252CliCod ;
   private int ZZ136BarColNum ;
   private long Z4912MetPiePDo ;
   private long A4912MetPiePDo ;
   private long ZZ4912MetPiePDo ;
   private java.math.BigDecimal Z2814MetPieKil ;
   private java.math.BigDecimal Z2815MetPieMet ;
   private java.math.BigDecimal Z4910MetPieMtD ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal ZZ2814MetPieKil ;
   private java.math.BigDecimal ZZ2815MetPieMet ;
   private java.math.BigDecimal ZZ4910MetPieMtD ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2809MetTerCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA2813MetPieCod ;
   private String Z396EmprCod ;
   private String Z2809MetTerCod ;
   private String Z130BarCodPar ;
   private String Z2813MetPieCod ;
   private String Z2846MetPieDsc ;
   private String Z4911MetPieCol ;
   private String Z4913MetPieLoc ;
   private String Z4914MetPieRap ;
   private String Z4915MetPieDCP ;
   private String Z4916MetPieMue ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMetPieKil_Internalname ;
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
   private String edtMetPieCod_Internalname ;
   private String edtMetPieCod_Jsonclick ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
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
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecGen_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtMetPieMet_Internalname ;
   private String edtMetPieMet_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieEst_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtMetPieDsc_Internalname ;
   private String A2846MetPieDsc ;
   private String edtMetPieDsc_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtMetPieDef_Internalname ;
   private String edtMetPieDef_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieMtD_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtMetPieCol_Internalname ;
   private String A4911MetPieCol ;
   private String edtMetPieCol_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtMetPiePDo_Internalname ;
   private String edtMetPiePDo_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtMetPieLoc_Internalname ;
   private String A4913MetPieLoc ;
   private String edtMetPieLoc_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtMetPieRap_Internalname ;
   private String A4914MetPieRap ;
   private String edtMetPieRap_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtMetPieDCP_Internalname ;
   private String A4915MetPieDCP ;
   private String edtMetPieDCP_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtMetPieMue_Internalname ;
   private String A4916MetPieMue ;
   private String edtMetPieMue_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtMetPieObs_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV35LitFe ;
   private String AV16Lit0 ;
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
   private String GXt_char1 ;
   private String AV36lit18 ;
   private String AV37Station ;
   private String AV39EmprNom ;
   private String AV34UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z279CliNom ;
   private String sMode413 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ2809MetTerCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2813MetPieCod ;
   private String ZZ279CliNom ;
   private String ZZ212BarSer ;
   private String ZZ135BarColNom ;
   private String ZZ407EmprNom ;
   private String ZZ2846MetPieDsc ;
   private String ZZ4911MetPieCol ;
   private String ZZ4913MetPieLoc ;
   private String ZZ4914MetPieRap ;
   private String ZZ4915MetPieDCP ;
   private String ZZ4916MetPieMue ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date Z159BarFecGen ;
   private java.util.Date ZZ159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z4917MetPieObs ;
   private String A4917MetPieObs ;
   private String ZZ4917MetPieObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01F24_A407EmprNom ;
   private boolean[] T01F24_n407EmprNom ;
   private String[] T01F25_A212BarSer ;
   private String[] T01F25_A135BarColNom ;
   private int[] T01F25_A136BarColNum ;
   private byte[] T01F25_A218BarTipCol ;
   private java.util.Date[] T01F25_A159BarFecGen ;
   private int[] T01F25_A252CliCod ;
   private boolean[] T01F25_n252CliCod ;
   private String[] T01F27_A279CliNom ;
   private String[] T01F26_A396EmprCod ;
   private String[] T01F28_A2813MetPieCod ;
   private String[] T01F28_A279CliNom ;
   private String[] T01F28_A212BarSer ;
   private String[] T01F28_A135BarColNom ;
   private int[] T01F28_A136BarColNum ;
   private byte[] T01F28_A218BarTipCol ;
   private String[] T01F28_A407EmprNom ;
   private boolean[] T01F28_n407EmprNom ;
   private java.util.Date[] T01F28_A159BarFecGen ;
   private java.math.BigDecimal[] T01F28_A2814MetPieKil ;
   private java.math.BigDecimal[] T01F28_A2815MetPieMet ;
   private byte[] T01F28_A2816MetPieEst ;
   private String[] T01F28_A2846MetPieDsc ;
   private short[] T01F28_A4909MetPieDef ;
   private java.math.BigDecimal[] T01F28_A4910MetPieMtD ;
   private String[] T01F28_A4911MetPieCol ;
   private long[] T01F28_A4912MetPiePDo ;
   private String[] T01F28_A4913MetPieLoc ;
   private String[] T01F28_A4914MetPieRap ;
   private String[] T01F28_A4915MetPieDCP ;
   private String[] T01F28_A4916MetPieMue ;
   private String[] T01F28_A4917MetPieObs ;
   private String[] T01F28_A396EmprCod ;
   private int[] T01F28_A129BarCod ;
   private byte[] T01F28_A132BarCodReo ;
   private String[] T01F28_A130BarCodPar ;
   private String[] T01F28_A2809MetTerCod ;
   private int[] T01F28_A252CliCod ;
   private boolean[] T01F28_n252CliCod ;
   private String[] T01F29_A396EmprCod ;
   private String[] T01F29_A2809MetTerCod ;
   private int[] T01F29_A129BarCod ;
   private byte[] T01F29_A132BarCodReo ;
   private String[] T01F29_A130BarCodPar ;
   private String[] T01F29_A2813MetPieCod ;
   private String[] T01F23_A2813MetPieCod ;
   private java.math.BigDecimal[] T01F23_A2814MetPieKil ;
   private java.math.BigDecimal[] T01F23_A2815MetPieMet ;
   private byte[] T01F23_A2816MetPieEst ;
   private String[] T01F23_A2846MetPieDsc ;
   private short[] T01F23_A4909MetPieDef ;
   private java.math.BigDecimal[] T01F23_A4910MetPieMtD ;
   private String[] T01F23_A4911MetPieCol ;
   private long[] T01F23_A4912MetPiePDo ;
   private String[] T01F23_A4913MetPieLoc ;
   private String[] T01F23_A4914MetPieRap ;
   private String[] T01F23_A4915MetPieDCP ;
   private String[] T01F23_A4916MetPieMue ;
   private String[] T01F23_A4917MetPieObs ;
   private String[] T01F23_A396EmprCod ;
   private int[] T01F23_A129BarCod ;
   private byte[] T01F23_A132BarCodReo ;
   private String[] T01F23_A130BarCodPar ;
   private String[] T01F23_A2809MetTerCod ;
   private String[] T01F210_A396EmprCod ;
   private String[] T01F210_A2809MetTerCod ;
   private int[] T01F210_A129BarCod ;
   private byte[] T01F210_A132BarCodReo ;
   private String[] T01F210_A130BarCodPar ;
   private String[] T01F210_A2813MetPieCod ;
   private String[] T01F211_A396EmprCod ;
   private String[] T01F211_A2809MetTerCod ;
   private int[] T01F211_A129BarCod ;
   private byte[] T01F211_A132BarCodReo ;
   private String[] T01F211_A130BarCodPar ;
   private String[] T01F211_A2813MetPieCod ;
   private String[] T01F22_A2813MetPieCod ;
   private java.math.BigDecimal[] T01F22_A2814MetPieKil ;
   private java.math.BigDecimal[] T01F22_A2815MetPieMet ;
   private byte[] T01F22_A2816MetPieEst ;
   private String[] T01F22_A2846MetPieDsc ;
   private short[] T01F22_A4909MetPieDef ;
   private java.math.BigDecimal[] T01F22_A4910MetPieMtD ;
   private String[] T01F22_A4911MetPieCol ;
   private long[] T01F22_A4912MetPiePDo ;
   private String[] T01F22_A4913MetPieLoc ;
   private String[] T01F22_A4914MetPieRap ;
   private String[] T01F22_A4915MetPieDCP ;
   private String[] T01F22_A4916MetPieMue ;
   private String[] T01F22_A4917MetPieObs ;
   private String[] T01F22_A396EmprCod ;
   private int[] T01F22_A129BarCod ;
   private byte[] T01F22_A132BarCodReo ;
   private String[] T01F22_A130BarCodPar ;
   private String[] T01F22_A2809MetTerCod ;
   private String[] T01F215_A396EmprCod ;
   private String[] T01F215_A2809MetTerCod ;
   private int[] T01F215_A129BarCod ;
   private byte[] T01F215_A132BarCodReo ;
   private String[] T01F215_A130BarCodPar ;
   private String[] T01F215_A2813MetPieCod ;
   private String[] T01F216_A407EmprNom ;
   private boolean[] T01F216_n407EmprNom ;
   private String[] T01F217_A212BarSer ;
   private String[] T01F217_A135BarColNom ;
   private int[] T01F217_A136BarColNum ;
   private byte[] T01F217_A218BarTipCol ;
   private java.util.Date[] T01F217_A159BarFecGen ;
   private int[] T01F217_A252CliCod ;
   private boolean[] T01F217_n252CliCod ;
   private String[] T01F218_A279CliNom ;
   private String[] T01F219_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmetpi3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmetpi3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F22", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?  FOR UPDATE OF MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F23", "SELECT MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F25", "SELECT BarSer, BarColNom, BarColNum, BarTipCol, BarFecGen, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F26", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F27", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F28", "SELECT /*+ FIRST_ROWS(1) */ TM1.MetPieCod, T4.CliNom, T3.BarSer, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T2.EmprNom, T3.BarFecGen, TM1.MetPieKil, TM1.MetPieMet, TM1.MetPieEst, TM1.MetPieDsc, TM1.MetPieDef, TM1.MetPieMtD, TM1.MetPieCol, TM1.MetPiePDo, TM1.MetPieLoc, TM1.MetPieRap, TM1.MetPieDCP, TM1.MetPieMue, TM1.MetPieObs, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetTerCod, T3.CliCod FROM (((TXPLMETPI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) WHERE TM1.EmprCod = ? and TM1.MetTerCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MetPieCod = ? ORDER BY TM1.EmprCod, TM1.MetTerCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MetPieCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F29", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F210", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod DESC, MetTerCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F212", "INSERT INTO TXPLMETPI(MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01F213", "UPDATE TXPLMETPI SET MetPieKil=?, MetPieMet=?, MetPieEst=?, MetPieDsc=?, MetPieDef=?, MetPieMtD=?, MetPieCol=?, MetPiePDo=?, MetPieLoc=?, MetPieRap=?, MetPieDCP=?, MetPieMue=?, MetPieObs=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new UpdateCursor("T01F214", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK, "TXPLMETPI")
         ,new ForEachCursor("T01F215", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F216", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F217", "SELECT BarSer, BarColNom, BarColNum, BarTipCol, BarFecGen, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F218", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F219", "SELECT EmprCod FROM TXPCMETPI WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((long[]) buf[16])[0] = rslt.getLong(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 10);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 10);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
               stmt.setString(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setVarchar(14, (String)parms[13], 1024, false);
               stmt.setString(15, (String)parms[14], 3);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 10);
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 1024, false);
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 10);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

