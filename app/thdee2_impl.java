package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdee2_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTREGA TINTADAS A ENCONAR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarSer_Internalname ;
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
      nRC_GXsfl_120 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_120"))) ;
      nGXsfl_120_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_120_idx"))) ;
      sGXsfl_120_idx = httpContext.GetPar( "sGXsfl_120_idx") ;
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

   public thdee2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdee2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdee2_impl.class ));
   }

   public thdee2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDEE2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero metrico", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNMtr_Internalname, GXutil.rtrim( A1500BarNMtr), GXutil.rtrim( localUtil.format( A1500BarNMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNMtr_Jsonclick, 0, "", "", "", "", "", 1, edtBarNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Kilogramos", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Código de Partido", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPartCod_Internalname, GXutil.rtrim( A966PartCod), GXutil.rtrim( localUtil.format( A966PartCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPartCod_Jsonclick, 0, "", "", "", "", "", 1, edtPartCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Manufacturador en H.R", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2400BarManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarManCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2400BarManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2400BarManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarManCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarManCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fecha Entrega Enco.", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecEnE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecEnE_Internalname, localUtil.format(A2447BarFecEnE, "99/99/99"), localUtil.format( A2447BarFecEnE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecEnE_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecEnE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecEnE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecEnE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THDEE2.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Bultos Entrega Enco.", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarBulEnE_Internalname, GXutil.ltrim( localUtil.ntoc( A2442BarBulEnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarBulEnE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2442BarBulEnE), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2442BarBulEnE), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarBulEnE_Jsonclick, 0, "", "", "", "", "", 1, edtBarBulEnE_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Kgs.Entrega Enco.", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgEnE_Internalname, GXutil.ltrim( localUtil.ntoc( A2449BarKgEnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgEnE_Enabled!=0) ? localUtil.format( A2449BarKgEnE, "ZZZZZ9.99") : localUtil.format( A2449BarKgEnE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgEnE_Jsonclick, 0, "", "", "", "", "", 1, edtBarKgEnE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "BarEntEnE", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEntEnE_Internalname, GXutil.rtrim( A2445BarEntEnE), GXutil.rtrim( localUtil.format( A2445BarEntEnE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEntEnE_Jsonclick, 0, "", "", "", "", "", 1, edtBarEntEnE_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "BarEnULin", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEnULin_Internalname, GXutil.ltrim( localUtil.ntoc( A2446BarEnULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEnULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2446BarEnULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2446BarEnULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEnULin_Jsonclick, 0, "", "", "", "", "", 1, edtBarEnULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDEE2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol120( ) ;
      nGXsfl_120_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount331 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_331 = (short)(1) ;
            scanStart8B331( ) ;
            while ( RcdFound331 != 0 )
            {
               init_level_properties331( ) ;
               getByPrimaryKey8B331( ) ;
               addRow8B331( ) ;
               scanNext8B331( ) ;
            }
            scanEnd8B331( ) ;
            nBlankRcdCount331 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal8B331( ) ;
         standaloneModal8B331( ) ;
         sMode331 = Gx_mode ;
         while ( nGXsfl_120_idx < nRC_GXsfl_120 )
         {
            bGXsfl_120_Refreshing = true ;
            readRow8B331( ) ;
            edtavnRcdDeleted_331_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_331_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_331_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_331_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtBarEnLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENLIN_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarEnLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnLin_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            edtBarObsEnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAROBSENE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarObsEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsEnE_Enabled), 5, 0), !bGXsfl_120_Refreshing);
            if ( ( nRcdExists_331 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal8B331( ) ;
            }
            sendRow8B331( ) ;
            bGXsfl_120_Refreshing = false ;
         }
         Gx_mode = sMode331 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount331 = (short)(5) ;
         nRcdExists_331 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart8B331( ) ;
            while ( RcdFound331 != 0 )
            {
               sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_120331( ) ;
               init_level_properties331( ) ;
               standaloneNotModal8B331( ) ;
               getByPrimaryKey8B331( ) ;
               standaloneModal8B331( ) ;
               addRow8B331( ) ;
               scanNext8B331( ) ;
            }
            scanEnd8B331( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode331 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_120331( ) ;
      initAll8B331( ) ;
      init_level_properties331( ) ;
      nRcdExists_331 = (short)(0) ;
      nIsMod_331 = (short)(0) ;
      nRcdDeleted_331 = (short)(0) ;
      nBlankRcdCount331 = (short)(nBlankRcdUsr331+nBlankRcdCount331) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount331 > 0 )
      {
         standaloneNotModal8B331( ) ;
         standaloneModal8B331( ) ;
         addRow8B331( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarEnLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount331 = (short)(nBlankRcdCount331-1) ;
      }
      Gx_mode = sMode331 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDEE2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDEE2.htm");
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
         Z1500BarNMtr = httpContext.cgiGet( "Z1500BarNMtr") ;
         Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
         Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z218BarTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
         Z2400BarManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2400BarManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2447BarFecEnE = localUtil.ctod( httpContext.cgiGet( "Z2447BarFecEnE"), 0) ;
         Z2442BarBulEnE = (short)(localUtil.ctol( httpContext.cgiGet( "Z2442BarBulEnE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2449BarKgEnE = localUtil.ctond( httpContext.cgiGet( "Z2449BarKgEnE")) ;
         Z2445BarEntEnE = httpContext.cgiGet( "Z2445BarEntEnE") ;
         Z2446BarEnULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2446BarEnULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_120 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_120"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
         A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
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
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1500BarNMtr = httpContext.cgiGet( edtBarNMtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", A1500BarNMtr);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A136BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
         else
         {
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
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
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         n166BarKgm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A966PartCod = httpContext.cgiGet( edtPartCod_Internalname) ;
         n966PartCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", A966PartCod);
         A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2400BarManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2400BarManCod), 4, 0));
         }
         else
         {
            A2400BarManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2400BarManCod), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecEnE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECENE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecEnE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2447BarFecEnE = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
         }
         else
         {
            A2447BarFecEnE = localUtil.ctod( httpContext.cgiGet( edtBarFecEnE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarBulEnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarBulEnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARBULENE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarBulEnE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2442BarBulEnE = (short)(0) ;
            n2442BarBulEnE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2442BarBulEnE), 4, 0));
         }
         else
         {
            A2442BarBulEnE = (short)(localUtil.ctol( httpContext.cgiGet( edtBarBulEnE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2442BarBulEnE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2442BarBulEnE), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgEnE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgEnE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKGENE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKgEnE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2449BarKgEnE = DecimalUtil.ZERO ;
            n2449BarKgEnE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrimstr( A2449BarKgEnE, 9, 2));
         }
         else
         {
            A2449BarKgEnE = localUtil.ctond( httpContext.cgiGet( edtBarKgEnE_Internalname)) ;
            n2449BarKgEnE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrimstr( A2449BarKgEnE, 9, 2));
         }
         A2445BarEntEnE = httpContext.cgiGet( edtBarEntEnE_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2445BarEntEnE", A2445BarEntEnE);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARENULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarEnULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2446BarEnULin = (short)(0) ;
            n2446BarEnULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2446BarEnULin), 4, 0));
         }
         else
         {
            A2446BarEnULin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarEnULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2446BarEnULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2446BarEnULin), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"THDEE2");
         forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
         forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
         forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("thdee2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            initAll8B12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_331_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_331_Enabled), 5, 0), !bGXsfl_120_Refreshing);
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
      disableAttributes8B12( ) ;
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

   public void confirm_8B0( )
   {
      beforeValidate8B12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls8B12( ) ;
         }
         else
         {
            checkExtendedTable8B12( ) ;
            if ( AnyError == 0 )
            {
               zm8B12( 3) ;
               zm8B12( 4) ;
               zm8B12( 5) ;
            }
            closeExtendedTableCursors8B12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_8B331( ) ;
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
         confirmValues8B0( ) ;
      }
   }

   public void confirm_8B331( )
   {
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow8B331( ) ;
         if ( ( nRcdExists_331 != 0 ) || ( nIsMod_331 != 0 ) )
         {
            getKey8B331( ) ;
            if ( ( nRcdExists_331 == 0 ) && ( nRcdDeleted_331 == 0 ) )
            {
               if ( RcdFound331 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate8B331( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable8B331( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors8B331( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARENLIN_" + sGXsfl_120_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarEnLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound331 != 0 )
               {
                  if ( nRcdDeleted_331 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey8B331( ) ;
                     load8B331( ) ;
                     beforeValidate8B331( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls8B331( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_331 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate8B331( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable8B331( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors8B331( ) ;
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
                  if ( nRcdDeleted_331 == 0 )
                  {
                     GXCCtl = "BARENLIN_" + sGXsfl_120_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarEnLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_331_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarObsEnE_Internalname, GXutil.rtrim( A2451BarObsEnE)) ;
         httpContext.changePostValue( "ZT_"+"Z2444BarEnLin_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2451BarObsEnE_"+sGXsfl_120_idx, GXutil.rtrim( Z2451BarObsEnE)) ;
         httpContext.changePostValue( "nRcdDeleted_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_331 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_331_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_331_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENLIN_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAROBSENE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarObsEnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption8B0( )
   {
   }

   public void zm8B12( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T008B5_A361DisCod[0] ;
            Z2759BarMaqGru = T008B5_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T008B5_A180BarMaqCod[0] ;
            Z212BarSer = T008B5_A212BarSer[0] ;
            Z1500BarNMtr = T008B5_A1500BarNMtr[0] ;
            Z135BarColNom = T008B5_A135BarColNom[0] ;
            Z136BarColNum = T008B5_A136BarColNum[0] ;
            Z218BarTipCol = T008B5_A218BarTipCol[0] ;
            Z143BarDisNum = T008B5_A143BarDisNum[0] ;
            Z2400BarManCod = T008B5_A2400BarManCod[0] ;
            Z2447BarFecEnE = T008B5_A2447BarFecEnE[0] ;
            Z2442BarBulEnE = T008B5_A2442BarBulEnE[0] ;
            Z2449BarKgEnE = T008B5_A2449BarKgEnE[0] ;
            Z2445BarEntEnE = T008B5_A2445BarEntEnE[0] ;
            Z2446BarEnULin = T008B5_A2446BarEnULin[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z212BarSer = A212BarSer ;
            Z1500BarNMtr = A1500BarNMtr ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
            Z218BarTipCol = A218BarTipCol ;
            Z143BarDisNum = A143BarDisNum ;
            Z2400BarManCod = A2400BarManCod ;
            Z2447BarFecEnE = A2447BarFecEnE ;
            Z2442BarBulEnE = A2442BarBulEnE ;
            Z2449BarKgEnE = A2449BarKgEnE ;
            Z2445BarEntEnE = A2445BarEntEnE ;
            Z2446BarEnULin = A2446BarEnULin ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z212BarSer = A212BarSer ;
         Z1500BarNMtr = A1500BarNMtr ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z143BarDisNum = A143BarDisNum ;
         Z2400BarManCod = A2400BarManCod ;
         Z2447BarFecEnE = A2447BarFecEnE ;
         Z2442BarBulEnE = A2442BarBulEnE ;
         Z2449BarKgEnE = A2449BarKgEnE ;
         Z2445BarEntEnE = A2445BarEntEnE ;
         Z2446BarEnULin = A2446BarEnULin ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z966PartCod = A966PartCod ;
         Z166BarKgm = A166BarKgm ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T008B6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T008B6_A407EmprNom[0] ;
      n407EmprNom = T008B6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T008B9 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A166BarKgm = T008B9_A166BarKgm[0] ;
         n166BarKgm = T008B9_n166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         n166BarKgm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      pr_default.close(6);
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
      /* Using cursor T008B7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T008B7_A252CliCod[0] ;
      n252CliCod = T008B7_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T008B7_A365DisDes[0] ;
      A966PartCod = T008B7_A966PartCod[0] ;
      n966PartCod = T008B7_n966PartCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", A966PartCod);
      pr_default.close(5);
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

   public void load8B12( )
   {
      /* Using cursor T008B11 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T008B11_A361DisCod[0] ;
         A2759BarMaqGru = T008B11_A2759BarMaqGru[0] ;
         A180BarMaqCod = T008B11_A180BarMaqCod[0] ;
         A407EmprNom = T008B11_A407EmprNom[0] ;
         n407EmprNom = T008B11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = T008B11_A252CliCod[0] ;
         n252CliCod = T008B11_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A212BarSer = T008B11_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1500BarNMtr = T008B11_A1500BarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", A1500BarNMtr);
         A135BarColNom = T008B11_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T008B11_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T008B11_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A143BarDisNum = T008B11_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A2400BarManCod = T008B11_A2400BarManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2400BarManCod), 4, 0));
         A2447BarFecEnE = T008B11_A2447BarFecEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
         A2442BarBulEnE = T008B11_A2442BarBulEnE[0] ;
         n2442BarBulEnE = T008B11_n2442BarBulEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2442BarBulEnE), 4, 0));
         A2449BarKgEnE = T008B11_A2449BarKgEnE[0] ;
         n2449BarKgEnE = T008B11_n2449BarKgEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrimstr( A2449BarKgEnE, 9, 2));
         A2445BarEntEnE = T008B11_A2445BarEntEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2445BarEntEnE", A2445BarEntEnE);
         A2446BarEnULin = T008B11_A2446BarEnULin[0] ;
         n2446BarEnULin = T008B11_n2446BarEnULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2446BarEnULin), 4, 0));
         A365DisDes = T008B11_A365DisDes[0] ;
         A966PartCod = T008B11_A966PartCod[0] ;
         n966PartCod = T008B11_n966PartCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", A966PartCod);
         A166BarKgm = T008B11_A166BarKgm[0] ;
         n166BarKgm = T008B11_n166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         zm8B12( -2) ;
      }
      pr_default.close(7);
      onLoadActions8B12( ) ;
   }

   public void onLoadActions8B12( )
   {
   }

   public void checkExtendedTable8B12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors8B12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey8B12( )
   {
      /* Using cursor T008B12 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T008B5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( T008B5_A129BarCod[0] == A129BarCod ) && ( T008B5_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B5_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T008B5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm8B12( 2) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T008B5_A361DisCod[0] ;
         A2759BarMaqGru = T008B5_A2759BarMaqGru[0] ;
         A180BarMaqCod = T008B5_A180BarMaqCod[0] ;
         A212BarSer = T008B5_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1500BarNMtr = T008B5_A1500BarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", A1500BarNMtr);
         A135BarColNom = T008B5_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T008B5_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T008B5_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A143BarDisNum = T008B5_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A2400BarManCod = T008B5_A2400BarManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2400BarManCod), 4, 0));
         A2447BarFecEnE = T008B5_A2447BarFecEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
         A2442BarBulEnE = T008B5_A2442BarBulEnE[0] ;
         n2442BarBulEnE = T008B5_n2442BarBulEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2442BarBulEnE), 4, 0));
         A2449BarKgEnE = T008B5_A2449BarKgEnE[0] ;
         n2449BarKgEnE = T008B5_n2449BarKgEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrimstr( A2449BarKgEnE, 9, 2));
         A2445BarEntEnE = T008B5_A2445BarEntEnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2445BarEntEnE", A2445BarEntEnE);
         A2446BarEnULin = T008B5_A2446BarEnULin[0] ;
         n2446BarEnULin = T008B5_n2446BarEnULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2446BarEnULin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load8B12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey8B12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey8B12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey8B12( ) ;
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
      /* Using cursor T008B13 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T008B13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008B13_A129BarCod[0] == A129BarCod ) && ( T008B13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B13_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T008B13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008B13_A129BarCod[0] == A129BarCod ) && ( T008B13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B13_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T008B14 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T008B14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008B14_A129BarCod[0] == A129BarCod ) && ( T008B14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T008B14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008B14_A129BarCod[0] == A129BarCod ) && ( T008B14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B14_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey8B12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarSer_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert8B12( ) ;
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
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarSer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update8B12( ) ;
               GX_FocusControl = edtBarSer_Internalname ;
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
               GX_FocusControl = edtBarSer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert8B12( ) ;
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
                  GX_FocusControl = edtBarSer_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert8B12( ) ;
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
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarSer_Internalname ;
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
      getKey8B12( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdee2");
      GX_FocusControl = edtBarSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_8B0( ) ;
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
      GX_FocusControl = edtBarSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart8B12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd8B12( ) ;
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
      GX_FocusControl = edtBarSer_Internalname ;
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
      GX_FocusControl = edtBarSer_Internalname ;
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
      scanStart8B12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext8B12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd8B12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency8B12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T008B4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z361DisCod != T008B4_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T008B4_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T008B4_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z212BarSer, T008B4_A212BarSer[0]) != 0 ) || ( GXutil.strcmp(Z1500BarNMtr, T008B4_A1500BarNMtr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z135BarColNom, T008B4_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T008B4_A136BarColNum[0] ) || ( Z218BarTipCol != T008B4_A218BarTipCol[0] ) || ( GXutil.strcmp(Z143BarDisNum, T008B4_A143BarDisNum[0]) != 0 ) || ( Z2400BarManCod != T008B4_A2400BarManCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z2447BarFecEnE), GXutil.resetTime(T008B4_A2447BarFecEnE[0])) ) || ( Z2442BarBulEnE != T008B4_A2442BarBulEnE[0] ) || ( DecimalUtil.compareTo(Z2449BarKgEnE, T008B4_A2449BarKgEnE[0]) != 0 ) || ( GXutil.strcmp(Z2445BarEntEnE, T008B4_A2445BarEntEnE[0]) != 0 ) || ( Z2446BarEnULin != T008B4_A2446BarEnULin[0] ) )
         {
            if ( Z361DisCod != T008B4_A361DisCod[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T008B4_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T008B4_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T008B4_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T008B4_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T008B4_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T008B4_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T008B4_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z1500BarNMtr, T008B4_A1500BarNMtr[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarNMtr");
               GXutil.writeLogRaw("Old: ",Z1500BarNMtr);
               GXutil.writeLogRaw("Current: ",T008B4_A1500BarNMtr[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T008B4_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T008B4_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T008B4_A136BarColNum[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T008B4_A136BarColNum[0]);
            }
            if ( Z218BarTipCol != T008B4_A218BarTipCol[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarTipCol");
               GXutil.writeLogRaw("Old: ",Z218BarTipCol);
               GXutil.writeLogRaw("Current: ",T008B4_A218BarTipCol[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T008B4_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T008B4_A143BarDisNum[0]);
            }
            if ( Z2400BarManCod != T008B4_A2400BarManCod[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarManCod");
               GXutil.writeLogRaw("Old: ",Z2400BarManCod);
               GXutil.writeLogRaw("Current: ",T008B4_A2400BarManCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2447BarFecEnE), GXutil.resetTime(T008B4_A2447BarFecEnE[0])) ) )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarFecEnE");
               GXutil.writeLogRaw("Old: ",Z2447BarFecEnE);
               GXutil.writeLogRaw("Current: ",T008B4_A2447BarFecEnE[0]);
            }
            if ( Z2442BarBulEnE != T008B4_A2442BarBulEnE[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarBulEnE");
               GXutil.writeLogRaw("Old: ",Z2442BarBulEnE);
               GXutil.writeLogRaw("Current: ",T008B4_A2442BarBulEnE[0]);
            }
            if ( DecimalUtil.compareTo(Z2449BarKgEnE, T008B4_A2449BarKgEnE[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarKgEnE");
               GXutil.writeLogRaw("Old: ",Z2449BarKgEnE);
               GXutil.writeLogRaw("Current: ",T008B4_A2449BarKgEnE[0]);
            }
            if ( GXutil.strcmp(Z2445BarEntEnE, T008B4_A2445BarEntEnE[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarEntEnE");
               GXutil.writeLogRaw("Old: ",Z2445BarEntEnE);
               GXutil.writeLogRaw("Current: ",T008B4_A2445BarEntEnE[0]);
            }
            if ( Z2446BarEnULin != T008B4_A2446BarEnULin[0] )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarEnULin");
               GXutil.writeLogRaw("Old: ",Z2446BarEnULin);
               GXutil.writeLogRaw("Current: ",T008B4_A2446BarEnULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert8B12( )
   {
      beforeValidate8B12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8B12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm8B12( 0) ;
         checkOptimisticConcurrency8B12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8B12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert8B12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008B15 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A212BarSer, A1500BarNMtr, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A143BarDisNum, Short.valueOf(A2400BarManCod), A2447BarFecEnE, Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), Boolean.valueOf(n2449BarKgEnE), A2449BarKgEnE, A2445BarEntEnE, Boolean.valueOf(n2446BarEnULin), Short.valueOf(A2446BarEnULin), Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN18B12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel8B12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption8B0( ) ;
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
            load8B12( ) ;
         }
         endLevel8B12( ) ;
      }
      closeExtendedTableCursors8B12( ) ;
   }

   public void update8B12( )
   {
      beforeValidate8B12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8B12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8B12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8B12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate8B12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008B16 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, A212BarSer, A1500BarNMtr, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A143BarDisNum, Short.valueOf(A2400BarManCod), A2447BarFecEnE, Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), Boolean.valueOf(n2449BarKgEnE), A2449BarKgEnE, A2445BarEntEnE, Boolean.valueOf(n2446BarEnULin), Short.valueOf(A2446BarEnULin), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate8B12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A129BarCod ;
                     GXv_int3[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
                     thdee2_impl.this.A396EmprCod = GXv_char1[0] ;
                     thdee2_impl.this.A129BarCod = GXv_int2[0] ;
                     thdee2_impl.this.A132BarCodReo = GXv_int3[0] ;
                     thdee2_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN18B12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel8B12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption8B0( ) ;
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
         endLevel8B12( ) ;
      }
      closeExtendedTableCursors8B12( ) ;
   }

   public void deferredUpdate8B12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate8B12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8B12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls8B12( ) ;
         afterConfirm8B12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete8B12( ) ;
            if ( AnyError == 0 )
            {
               scanStart8B331( ) ;
               while ( RcdFound331 != 0 )
               {
                  getByPrimaryKey8B331( ) ;
                  delete8B331( ) ;
                  scanNext8B331( ) ;
               }
               scanEnd8B331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008B17 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN18B12( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll8B12( ) ;
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
                        resetCaption8B0( ) ;
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
      endLevel8B12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls8B12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T008B18 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T008B19 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T008B20 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T008B21 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T008B22 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T008B23 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T008B24 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T008B25 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T008B26 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T008B27 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T008B28 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T008B29 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T008B30 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T008B31 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T008B32 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T008B33 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T008B34 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T008B35 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T008B36 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T008B37 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T008B38 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T008B39 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T008B40 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T008B41 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T008B42 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T008B43 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T008B44 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T008B45 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T008B46 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T008B47 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T008B48 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T008B49 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T008B50 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T008B51 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T008B52 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T008B53 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T008B54 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T008B55 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T008B56 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T008B57 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T008B58 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T008B59 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T008B60 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T008B61 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T008B62 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T008B63 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T008B64 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T008B65 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T008B66 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T008B67 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T008B68 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T008B69 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T008B70 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T008B71 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T008B72 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T008B73 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T008B74 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T008B75 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T008B76 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T008B77 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T008B78 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T008B79 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
      }
   }

   public void processNestedLevel8B331( )
   {
      nGXsfl_120_idx = 0 ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         readRow8B331( ) ;
         if ( ( nRcdExists_331 != 0 ) || ( nIsMod_331 != 0 ) )
         {
            standaloneNotModal8B331( ) ;
            getKey8B331( ) ;
            if ( ( nRcdExists_331 == 0 ) && ( nRcdDeleted_331 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert8B331( ) ;
            }
            else
            {
               if ( RcdFound331 != 0 )
               {
                  if ( ( nRcdDeleted_331 != 0 ) && ( nRcdExists_331 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete8B331( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_331 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update8B331( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_331 == 0 )
                  {
                     GXCCtl = "BARENLIN_" + sGXsfl_120_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarEnLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_331_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarEnLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarObsEnE_Internalname, GXutil.rtrim( A2451BarObsEnE)) ;
         httpContext.changePostValue( "ZT_"+"Z2444BarEnLin_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( Z2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2451BarObsEnE_"+sGXsfl_120_idx, GXutil.rtrim( Z2451BarObsEnE)) ;
         httpContext.changePostValue( "nRcdDeleted_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_331_"+sGXsfl_120_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_331 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_331_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_331_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARENLIN_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAROBSENE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarObsEnE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll8B331( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_331 = (short)(0) ;
      nIsMod_331 = (short)(0) ;
      nRcdDeleted_331 = (short)(0) ;
   }

   public void processLevel8B12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel8B331( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN18B12( )
   {
      /* Using cursor T008B80 */
      pr_default.execute(76, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel8B12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete8B12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdee2");
         if ( AnyError == 0 )
         {
            confirmValues8B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdee2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart8B12( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      /* Scan By routine */
      /* Using cursor T008B81 */
      pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext8B12( )
   {
      /* Scan next routine */
      pr_default.readNext(77);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd8B12( )
   {
      pr_default.close(77);
   }

   public void afterConfirm8B12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert8B12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate8B12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete8B12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete8B12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate8B12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes8B12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
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
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNMtr_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Enabled), 5, 0), true);
      edtPartCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPartCod_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarManCod_Enabled), 5, 0), true);
      edtBarFecEnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecEnE_Enabled), 5, 0), true);
      edtBarBulEnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarBulEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarBulEnE_Enabled), 5, 0), true);
      edtBarKgEnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgEnE_Enabled), 5, 0), true);
      edtBarEntEnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEntEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEntEnE_Enabled), 5, 0), true);
      edtBarEnULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnULin_Enabled), 5, 0), true);
   }

   public void zm8B331( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2451BarObsEnE = T008B3_A2451BarObsEnE[0] ;
         }
         else
         {
            Z2451BarObsEnE = A2451BarObsEnE ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2444BarEnLin = A2444BarEnLin ;
         Z2451BarObsEnE = A2451BarObsEnE ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal8B331( )
   {
   }

   public void standaloneModal8B331( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarEnLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarEnLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnLin_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
      else
      {
         edtBarEnLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarEnLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnLin_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      }
   }

   public void load8B331( )
   {
      /* Using cursor T008B82 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound331 = (short)(1) ;
         A2451BarObsEnE = T008B82_A2451BarObsEnE[0] ;
         n2451BarObsEnE = T008B82_n2451BarObsEnE[0] ;
         zm8B331( -6) ;
      }
      pr_default.close(78);
      onLoadActions8B331( ) ;
   }

   public void onLoadActions8B331( )
   {
   }

   public void checkExtendedTable8B331( )
   {
      nIsDirty_331 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal8B331( ) ;
   }

   public void closeExtendedTableCursors8B331( )
   {
   }

   public void enableDisable8B331( )
   {
   }

   public void getKey8B331( )
   {
      /* Using cursor T008B83 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound331 = (short)(1) ;
      }
      else
      {
         RcdFound331 = (short)(0) ;
      }
      pr_default.close(79);
   }

   public void getByPrimaryKey8B331( )
   {
      /* Using cursor T008B3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T008B3_A129BarCod[0] == A129BarCod ) && ( T008B3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T008B3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T008B3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm8B331( 6) ;
         RcdFound331 = (short)(1) ;
         initializeNonKey8B331( ) ;
         A2444BarEnLin = T008B3_A2444BarEnLin[0] ;
         A2451BarObsEnE = T008B3_A2451BarObsEnE[0] ;
         n2451BarObsEnE = T008B3_n2451BarObsEnE[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2444BarEnLin = A2444BarEnLin ;
         sMode331 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal8B331( ) ;
         load8B331( ) ;
         Gx_mode = sMode331 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound331 = (short)(0) ;
         initializeNonKey8B331( ) ;
         sMode331 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal8B331( ) ;
         Gx_mode = sMode331 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes8B331( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency8B331( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T008B2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBAROBE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2451BarObsEnE, T008B2_A2451BarObsEnE[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2451BarObsEnE, T008B2_A2451BarObsEnE[0]) != 0 )
            {
               GXutil.writeLogln("thdee2:[seudo value changed for attri]"+"BarObsEnE");
               GXutil.writeLogRaw("Old: ",Z2451BarObsEnE);
               GXutil.writeLogRaw("Current: ",T008B2_A2451BarObsEnE[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBAROBE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert8B331( )
   {
      beforeValidate8B331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8B331( ) ;
      }
      if ( AnyError == 0 )
      {
         zm8B331( 0) ;
         checkOptimisticConcurrency8B331( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8B331( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert8B331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008B84 */
                  pr_default.execute(80, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin), Boolean.valueOf(n2451BarObsEnE), A2451BarObsEnE, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBAROBE");
                  if ( (pr_default.getStatus(80) == 1) )
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
            load8B331( ) ;
         }
         endLevel8B331( ) ;
      }
      closeExtendedTableCursors8B331( ) ;
   }

   public void update8B331( )
   {
      beforeValidate8B331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8B331( ) ;
      }
      if ( ( nIsMod_331 != 0 ) || ( nIsDirty_331 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency8B331( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm8B331( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate8B331( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T008B85 */
                     pr_default.execute(81, new Object[] {Boolean.valueOf(n2451BarObsEnE), A2451BarObsEnE, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBAROBE");
                     if ( (pr_default.getStatus(81) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBAROBE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate8B331( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        thdee2_impl.this.A396EmprCod = GXv_char4[0] ;
                        thdee2_impl.this.A129BarCod = GXv_int2[0] ;
                        thdee2_impl.this.A132BarCodReo = GXv_int3[0] ;
                        thdee2_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey8B331( ) ;
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
            endLevel8B331( ) ;
         }
      }
      closeExtendedTableCursors8B331( ) ;
   }

   public void deferredUpdate8B331( )
   {
   }

   public void delete8B331( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate8B331( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8B331( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls8B331( ) ;
         afterConfirm8B331( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete8B331( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T008B86 */
               pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2444BarEnLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBAROBE");
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
      sMode331 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel8B331( ) ;
      Gx_mode = sMode331 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls8B331( )
   {
      standaloneModal8B331( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel8B331( )
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

   public void scanStart8B331( )
   {
      /* Scan By routine */
      /* Using cursor T008B87 */
      pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound331 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound331 = (short)(1) ;
         A2444BarEnLin = T008B87_A2444BarEnLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext8B331( )
   {
      /* Scan next routine */
      pr_default.readNext(83);
      RcdFound331 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound331 = (short)(1) ;
         A2444BarEnLin = T008B87_A2444BarEnLin[0] ;
      }
   }

   public void scanEnd8B331( )
   {
      pr_default.close(83);
   }

   public void afterConfirm8B331( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert8B331( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate8B331( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete8B331( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete8B331( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate8B331( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes8B331( )
   {
      edtBarEnLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnLin_Enabled), 5, 0), !bGXsfl_120_Refreshing);
      edtBarObsEnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarObsEnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarObsEnE_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void send_integrity_lvl_hashes8B331( )
   {
   }

   public void send_integrity_lvl_hashes8B12( )
   {
   }

   public void subsflControlProps_120331( )
   {
      edtavnRcdDeleted_331_Internalname = "vNRCDDELETED_331_"+sGXsfl_120_idx ;
      edtBarEnLin_Internalname = "BARENLIN_"+sGXsfl_120_idx ;
      edtBarObsEnE_Internalname = "BAROBSENE_"+sGXsfl_120_idx ;
   }

   public void subsflControlProps_fel_120331( )
   {
      edtavnRcdDeleted_331_Internalname = "vNRCDDELETED_331_"+sGXsfl_120_fel_idx ;
      edtBarEnLin_Internalname = "BARENLIN_"+sGXsfl_120_fel_idx ;
      edtBarObsEnE_Internalname = "BAROBSENE_"+sGXsfl_120_fel_idx ;
   }

   public void addRow8B331( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_120331( ) ;
      sendRow8B331( ) ;
   }

   public void sendRow8B331( )
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
         if ( ((int)((nGXsfl_120_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_331_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_331_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_331_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_331), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_331), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_331_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_331_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_331_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarEnLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2444BarEnLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarEnLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarEnLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_331_" + sGXsfl_120_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_120_idx + "',120)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarObsEnE_Internalname,GXutil.rtrim( A2451BarObsEnE),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarObsEnE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarObsEnE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes8B331( ) ;
      GXCCtl = "Z2444BarEnLin_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2444BarEnLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2451BarObsEnE_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2451BarObsEnE));
      GXCCtl = "nRcdDeleted_331_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_331_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_331_" + sGXsfl_120_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_331, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_331_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_331_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENLIN_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAROBSENE_"+sGXsfl_120_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarObsEnE_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow8B331( )
   {
      nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_120331( ) ;
      edtavnRcdDeleted_331_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_331_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarEnLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARENLIN_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarObsEnE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAROBSENE_"+sGXsfl_120_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_331_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_331_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_331");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_331_Internalname ;
         wbErr = true ;
         nRcdDeleted_331 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_331 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_331_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEnLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARENLIN_" + sGXsfl_120_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarEnLin_Internalname ;
         wbErr = true ;
         A2444BarEnLin = (short)(0) ;
      }
      else
      {
         A2444BarEnLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarEnLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2451BarObsEnE = httpContext.cgiGet( edtBarObsEnE_Internalname) ;
      n2451BarObsEnE = false ;
      GXCCtl = "Z2444BarEnLin_" + sGXsfl_120_idx ;
      Z2444BarEnLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2451BarObsEnE_" + sGXsfl_120_idx ;
      Z2451BarObsEnE = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_331_" + sGXsfl_120_idx ;
      nRcdDeleted_331 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_331_" + sGXsfl_120_idx ;
      nRcdExists_331 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_331_" + sGXsfl_120_idx ;
      nIsMod_331 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarEnLin_Enabled = edtBarEnLin_Enabled ;
   }

   public void confirmValues8B0( )
   {
      nGXsfl_120_idx = 0 ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_120331( ) ;
      while ( nGXsfl_120_idx < nRC_GXsfl_120 )
      {
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_120331( ) ;
         httpContext.changePostValue( "Z2444BarEnLin_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z2444BarEnLin_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2444BarEnLin_"+sGXsfl_120_idx) ;
         httpContext.changePostValue( "Z2451BarObsEnE_"+sGXsfl_120_idx, httpContext.cgiGet( "ZT_"+"Z2451BarObsEnE_"+sGXsfl_120_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2451BarObsEnE_"+sGXsfl_120_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdee2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THDEE2");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thdee2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1500BarNMtr", GXutil.rtrim( Z1500BarNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2400BarManCod", GXutil.ltrim( localUtil.ntoc( Z2400BarManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2447BarFecEnE", localUtil.dtoc( Z2447BarFecEnE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2442BarBulEnE", GXutil.ltrim( localUtil.ntoc( Z2442BarBulEnE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2449BarKgEnE", GXutil.ltrim( localUtil.ntoc( Z2449BarKgEnE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2445BarEntEnE", GXutil.rtrim( Z2445BarEntEnE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2446BarEnULin", GXutil.ltrim( localUtil.ntoc( Z2446BarEnULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_120", GXutil.ltrim( localUtil.ntoc( nGXsfl_120_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.thdee2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "THDEE2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTREGA TINTADAS A ENCONAR", "") ;
   }

   public void initializeNonKey8B12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1500BarNMtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", A1500BarNMtr);
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A966PartCod = "" ;
      n966PartCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", A966PartCod);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A2400BarManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2400BarManCod), 4, 0));
      A2447BarFecEnE = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
      A2442BarBulEnE = (short)(0) ;
      n2442BarBulEnE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2442BarBulEnE), 4, 0));
      A2449BarKgEnE = DecimalUtil.ZERO ;
      n2449BarKgEnE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrimstr( A2449BarKgEnE, 9, 2));
      A2445BarEntEnE = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2445BarEntEnE", A2445BarEntEnE);
      A2446BarEnULin = (short)(0) ;
      n2446BarEnULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2446BarEnULin), 4, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z212BarSer = "" ;
      Z1500BarNMtr = "" ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z218BarTipCol = (byte)(0) ;
      Z143BarDisNum = "" ;
      Z2400BarManCod = (short)(0) ;
      Z2447BarFecEnE = GXutil.nullDate() ;
      Z2442BarBulEnE = (short)(0) ;
      Z2449BarKgEnE = DecimalUtil.ZERO ;
      Z2445BarEntEnE = "" ;
      Z2446BarEnULin = (short)(0) ;
   }

   public void initAll8B12( )
   {
      initializeNonKey8B12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey8B331( )
   {
      A2451BarObsEnE = "" ;
      n2451BarObsEnE = false ;
      Z2451BarObsEnE = "" ;
   }

   public void initAll8B331( )
   {
      A2444BarEnLin = (short)(0) ;
      initializeNonKey8B331( ) ;
   }

   public void standaloneModalInsert8B331( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513664", true, true);
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
      httpContext.AddJavascriptSource("thdee2.js", "?20268241513665", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties331( )
   {
      edtBarEnLin_Enabled = defedtBarEnLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEnLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEnLin_Enabled), 5, 0), !bGXsfl_120_Refreshing);
   }

   public void startgridcontrol120( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_331, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_331_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2444BarEnLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarEnLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2451BarObsEnE));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarObsEnE_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarNMtr_Internalname = "BARNMTR" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarKgm_Internalname = "BARKGM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPartCod_Internalname = "PARTCOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarManCod_Internalname = "BARMANCOD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarFecEnE_Internalname = "BARFECENE" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarBulEnE_Internalname = "BARBULENE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarKgEnE_Internalname = "BARKGENE" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarEntEnE_Internalname = "BARENTENE" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarEnULin_Internalname = "BARENULIN" ;
      edtavnRcdDeleted_331_Internalname = "vNRCDDELETED_331" ;
      edtBarEnLin_Internalname = "BARENLIN" ;
      edtBarObsEnE_Internalname = "BAROBSENE" ;
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
      Form.setCaption( httpContext.getMessage( "ENTREGA TINTADAS A ENCONAR", "") );
      edtBarObsEnE_Jsonclick = "" ;
      edtBarEnLin_Jsonclick = "" ;
      edtavnRcdDeleted_331_Jsonclick = "" ;
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
      edtBarObsEnE_Enabled = 1 ;
      edtBarEnLin_Enabled = 1 ;
      edtavnRcdDeleted_331_Enabled = 1 ;
      edtBarEnULin_Jsonclick = "" ;
      edtBarEnULin_Backcolor = (int)(0xFFFFFF) ;
      edtBarEnULin_Enabled = 1 ;
      edtBarEntEnE_Jsonclick = "" ;
      edtBarEntEnE_Backcolor = (int)(0xFFFFFF) ;
      edtBarEntEnE_Enabled = 1 ;
      edtBarKgEnE_Jsonclick = "" ;
      edtBarKgEnE_Backcolor = (int)(0xFFFFFF) ;
      edtBarKgEnE_Enabled = 1 ;
      edtBarBulEnE_Jsonclick = "" ;
      edtBarBulEnE_Backcolor = (int)(0xFFFFFF) ;
      edtBarBulEnE_Enabled = 1 ;
      edtBarFecEnE_Jsonclick = "" ;
      edtBarFecEnE_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecEnE_Enabled = 1 ;
      edtBarManCod_Jsonclick = "" ;
      edtBarManCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarManCod_Enabled = 1 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 1 ;
      edtPartCod_Jsonclick = "" ;
      edtPartCod_Backcolor = (int)(0xFFFFFF) ;
      edtPartCod_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Backcolor = (int)(0xFFFFFF) ;
      edtBarKgm_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 1 ;
      edtBarNMtr_Jsonclick = "" ;
      edtBarNMtr_Backcolor = (int)(0xFFFFFF) ;
      edtBarNMtr_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 1 ;
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
      subsflControlProps_120331( ) ;
      while ( nGXsfl_120_idx <= nRC_GXsfl_120 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal8B331( ) ;
         standaloneModal8B331( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow8B331( ) ;
         nGXsfl_120_idx = (int)(nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_120331( ) ;
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
      /* Using cursor T008B88 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(84) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T008B88_A407EmprNom[0] ;
      n407EmprNom = T008B88_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(84);
      /* Using cursor T008B90 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(85) != 101) )
      {
         A166BarKgm = T008B90_A166BarKgm[0] ;
         n166BarKgm = T008B90_n166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         n166BarKgm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      pr_default.close(85);
      GX_FocusControl = edtBarSer_Internalname ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1500BarNMtr", GXutil.rtrim( A1500BarNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A966PartCod", GXutil.rtrim( A966PartCod));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A2400BarManCod", GXutil.ltrim( localUtil.ntoc( A2400BarManCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2447BarFecEnE", localUtil.format(A2447BarFecEnE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2442BarBulEnE", GXutil.ltrim( localUtil.ntoc( A2442BarBulEnE, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2449BarKgEnE", GXutil.ltrim( localUtil.ntoc( A2449BarKgEnE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2445BarEntEnE", GXutil.rtrim( A2445BarEntEnE));
      httpContext.ajax_rsp_assign_attri("", false, "A2446BarEnULin", GXutil.ltrim( localUtil.ntoc( A2446BarEnULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1500BarNMtr", GXutil.rtrim( Z1500BarNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z166BarKgm", GXutil.ltrim( localUtil.ntoc( Z166BarKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z966PartCod", GXutil.rtrim( Z966PartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2400BarManCod", GXutil.ltrim( localUtil.ntoc( Z2400BarManCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2447BarFecEnE", localUtil.format(Z2447BarFecEnE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2442BarBulEnE", GXutil.ltrim( localUtil.ntoc( Z2442BarBulEnE, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2449BarKgEnE", GXutil.ltrim( localUtil.ntoc( Z2449BarKgEnE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2445BarEntEnE", GXutil.rtrim( Z2445BarEntEnE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2446BarEnULin", GXutil.ltrim( localUtil.ntoc( Z2446BarEnULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1500BarNMtr',fld:'BARNMTR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A966PartCod',fld:'PARTCOD',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A2400BarManCod',fld:'BARMANCOD',pic:'ZZZ9'},{av:'A2447BarFecEnE',fld:'BARFECENE',pic:''},{av:'A2442BarBulEnE',fld:'BARBULENE',pic:'ZZZ9'},{av:'A2449BarKgEnE',fld:'BARKGENE',pic:'ZZZZZ9.99'},{av:'A2445BarEntEnE',fld:'BARENTENE',pic:''},{av:'A2446BarEnULin',fld:'BARENULIN',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z212BarSer'},{av:'Z1500BarNMtr'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z166BarKgm'},{av:'Z966PartCod'},{av:'Z143BarDisNum'},{av:'Z2400BarManCod'},{av:'Z2447BarFecEnE'},{av:'Z2442BarBulEnE'},{av:'Z2449BarKgEnE'},{av:'Z2445BarEntEnE'},{av:'Z2446BarEnULin'},{av:'Z365DisDes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARENLIN","{handler:'valid_Barenlin',iparms:[]");
      setEventMetadata("VALID_BARENLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barobsene',iparms:[]");
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
      pr_default.close(84);
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
      Z212BarSer = "" ;
      Z1500BarNMtr = "" ;
      Z135BarColNom = "" ;
      Z143BarDisNum = "" ;
      Z2447BarFecEnE = GXutil.nullDate() ;
      Z2449BarKgEnE = DecimalUtil.ZERO ;
      Z2445BarEntEnE = "" ;
      Z2451BarObsEnE = "" ;
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
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1500BarNMtr = "" ;
      lblTextblock9_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A966PartCod = "" ;
      lblTextblock14_Jsonclick = "" ;
      A143BarDisNum = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A2447BarFecEnE = GXutil.nullDate() ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A2449BarKgEnE = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A2445BarEntEnE = "" ;
      lblTextblock20_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode331 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      A2451BarObsEnE = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z966PartCod = "" ;
      Z166BarKgm = DecimalUtil.ZERO ;
      T008B6_A407EmprNom = new String[] {""} ;
      T008B6_n407EmprNom = new boolean[] {false} ;
      T008B9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B9_n166BarKgm = new boolean[] {false} ;
      T008B7_A252CliCod = new int[1] ;
      T008B7_n252CliCod = new boolean[] {false} ;
      T008B7_A365DisDes = new String[] {""} ;
      T008B7_A966PartCod = new String[] {""} ;
      T008B7_n966PartCod = new boolean[] {false} ;
      T008B11_A361DisCod = new int[1] ;
      T008B11_A2759BarMaqGru = new String[] {""} ;
      T008B11_A129BarCod = new int[1] ;
      T008B11_n129BarCod = new boolean[] {false} ;
      T008B11_A132BarCodReo = new byte[1] ;
      T008B11_n132BarCodReo = new boolean[] {false} ;
      T008B11_A130BarCodPar = new String[] {""} ;
      T008B11_n130BarCodPar = new boolean[] {false} ;
      T008B11_A180BarMaqCod = new String[] {""} ;
      T008B11_A407EmprNom = new String[] {""} ;
      T008B11_n407EmprNom = new boolean[] {false} ;
      T008B11_A252CliCod = new int[1] ;
      T008B11_n252CliCod = new boolean[] {false} ;
      T008B11_A212BarSer = new String[] {""} ;
      T008B11_A1500BarNMtr = new String[] {""} ;
      T008B11_A135BarColNom = new String[] {""} ;
      T008B11_A136BarColNum = new int[1] ;
      T008B11_A218BarTipCol = new byte[1] ;
      T008B11_A143BarDisNum = new String[] {""} ;
      T008B11_A2400BarManCod = new short[1] ;
      T008B11_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      T008B11_A2442BarBulEnE = new short[1] ;
      T008B11_n2442BarBulEnE = new boolean[] {false} ;
      T008B11_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B11_n2449BarKgEnE = new boolean[] {false} ;
      T008B11_A2445BarEntEnE = new String[] {""} ;
      T008B11_A2446BarEnULin = new short[1] ;
      T008B11_n2446BarEnULin = new boolean[] {false} ;
      T008B11_A365DisDes = new String[] {""} ;
      T008B11_A396EmprCod = new String[] {""} ;
      T008B11_n396EmprCod = new boolean[] {false} ;
      T008B11_A966PartCod = new String[] {""} ;
      T008B11_n966PartCod = new boolean[] {false} ;
      T008B11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B11_n166BarKgm = new boolean[] {false} ;
      T008B12_A396EmprCod = new String[] {""} ;
      T008B12_n396EmprCod = new boolean[] {false} ;
      T008B12_A129BarCod = new int[1] ;
      T008B12_n129BarCod = new boolean[] {false} ;
      T008B12_A132BarCodReo = new byte[1] ;
      T008B12_n132BarCodReo = new boolean[] {false} ;
      T008B12_A130BarCodPar = new String[] {""} ;
      T008B12_n130BarCodPar = new boolean[] {false} ;
      T008B5_A361DisCod = new int[1] ;
      T008B5_A2759BarMaqGru = new String[] {""} ;
      T008B5_A129BarCod = new int[1] ;
      T008B5_n129BarCod = new boolean[] {false} ;
      T008B5_A132BarCodReo = new byte[1] ;
      T008B5_n132BarCodReo = new boolean[] {false} ;
      T008B5_A130BarCodPar = new String[] {""} ;
      T008B5_n130BarCodPar = new boolean[] {false} ;
      T008B5_A180BarMaqCod = new String[] {""} ;
      T008B5_A212BarSer = new String[] {""} ;
      T008B5_A1500BarNMtr = new String[] {""} ;
      T008B5_A135BarColNom = new String[] {""} ;
      T008B5_A136BarColNum = new int[1] ;
      T008B5_A218BarTipCol = new byte[1] ;
      T008B5_A143BarDisNum = new String[] {""} ;
      T008B5_A2400BarManCod = new short[1] ;
      T008B5_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      T008B5_A2442BarBulEnE = new short[1] ;
      T008B5_n2442BarBulEnE = new boolean[] {false} ;
      T008B5_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B5_n2449BarKgEnE = new boolean[] {false} ;
      T008B5_A2445BarEntEnE = new String[] {""} ;
      T008B5_A2446BarEnULin = new short[1] ;
      T008B5_n2446BarEnULin = new boolean[] {false} ;
      T008B5_A396EmprCod = new String[] {""} ;
      T008B5_n396EmprCod = new boolean[] {false} ;
      T008B5_A252CliCod = new int[1] ;
      T008B5_n252CliCod = new boolean[] {false} ;
      T008B5_A365DisDes = new String[] {""} ;
      T008B13_A396EmprCod = new String[] {""} ;
      T008B13_n396EmprCod = new boolean[] {false} ;
      T008B13_A129BarCod = new int[1] ;
      T008B13_n129BarCod = new boolean[] {false} ;
      T008B13_A132BarCodReo = new byte[1] ;
      T008B13_n132BarCodReo = new boolean[] {false} ;
      T008B13_A130BarCodPar = new String[] {""} ;
      T008B13_n130BarCodPar = new boolean[] {false} ;
      T008B14_A396EmprCod = new String[] {""} ;
      T008B14_n396EmprCod = new boolean[] {false} ;
      T008B14_A129BarCod = new int[1] ;
      T008B14_n129BarCod = new boolean[] {false} ;
      T008B14_A132BarCodReo = new byte[1] ;
      T008B14_n132BarCodReo = new boolean[] {false} ;
      T008B14_A130BarCodPar = new String[] {""} ;
      T008B14_n130BarCodPar = new boolean[] {false} ;
      T008B4_A361DisCod = new int[1] ;
      T008B4_A2759BarMaqGru = new String[] {""} ;
      T008B4_A129BarCod = new int[1] ;
      T008B4_n129BarCod = new boolean[] {false} ;
      T008B4_A132BarCodReo = new byte[1] ;
      T008B4_n132BarCodReo = new boolean[] {false} ;
      T008B4_A130BarCodPar = new String[] {""} ;
      T008B4_n130BarCodPar = new boolean[] {false} ;
      T008B4_A180BarMaqCod = new String[] {""} ;
      T008B4_A212BarSer = new String[] {""} ;
      T008B4_A1500BarNMtr = new String[] {""} ;
      T008B4_A135BarColNom = new String[] {""} ;
      T008B4_A136BarColNum = new int[1] ;
      T008B4_A218BarTipCol = new byte[1] ;
      T008B4_A143BarDisNum = new String[] {""} ;
      T008B4_A2400BarManCod = new short[1] ;
      T008B4_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      T008B4_A2442BarBulEnE = new short[1] ;
      T008B4_n2442BarBulEnE = new boolean[] {false} ;
      T008B4_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B4_n2449BarKgEnE = new boolean[] {false} ;
      T008B4_A2445BarEntEnE = new String[] {""} ;
      T008B4_A2446BarEnULin = new short[1] ;
      T008B4_n2446BarEnULin = new boolean[] {false} ;
      T008B4_A396EmprCod = new String[] {""} ;
      T008B4_n396EmprCod = new boolean[] {false} ;
      T008B4_A252CliCod = new int[1] ;
      T008B4_n252CliCod = new boolean[] {false} ;
      T008B4_A365DisDes = new String[] {""} ;
      T008B18_A14681MRPrId = new long[1] ;
      T008B19_A5921XCjaDis = new String[] {""} ;
      T008B19_A5922XCjaCod = new long[1] ;
      T008B20_A396EmprCod = new String[] {""} ;
      T008B20_n396EmprCod = new boolean[] {false} ;
      T008B20_A129BarCod = new int[1] ;
      T008B20_n129BarCod = new boolean[] {false} ;
      T008B20_A132BarCodReo = new byte[1] ;
      T008B20_n132BarCodReo = new boolean[] {false} ;
      T008B20_A130BarCodPar = new String[] {""} ;
      T008B20_n130BarCodPar = new boolean[] {false} ;
      T008B20_A14152MEnvOrd = new short[1] ;
      T008B21_A396EmprCod = new String[] {""} ;
      T008B21_n396EmprCod = new boolean[] {false} ;
      T008B21_A129BarCod = new int[1] ;
      T008B21_n129BarCod = new boolean[] {false} ;
      T008B21_A132BarCodReo = new byte[1] ;
      T008B21_n132BarCodReo = new boolean[] {false} ;
      T008B21_A130BarCodPar = new String[] {""} ;
      T008B21_n130BarCodPar = new boolean[] {false} ;
      T008B21_A13905BarTraID = new String[] {""} ;
      T008B22_A396EmprCod = new String[] {""} ;
      T008B22_n396EmprCod = new boolean[] {false} ;
      T008B22_A129BarCod = new int[1] ;
      T008B22_n129BarCod = new boolean[] {false} ;
      T008B22_A132BarCodReo = new byte[1] ;
      T008B22_n132BarCodReo = new boolean[] {false} ;
      T008B22_A130BarCodPar = new String[] {""} ;
      T008B22_n130BarCodPar = new boolean[] {false} ;
      T008B22_A13093BarDGLin = new byte[1] ;
      T008B22_A13094BarDGDibCl = new String[] {""} ;
      T008B22_A13095BarDGDibIn = new int[1] ;
      T008B22_A13096BarDGComb = new String[] {""} ;
      T008B22_A13097BarDGFOndo = new String[] {""} ;
      T008B23_A396EmprCod = new String[] {""} ;
      T008B23_n396EmprCod = new boolean[] {false} ;
      T008B23_A11917Ebd_numero = new int[1] ;
      T008B24_A396EmprCod = new String[] {""} ;
      T008B24_n396EmprCod = new boolean[] {false} ;
      T008B24_A11898Prd_numero = new int[1] ;
      T008B25_A396EmprCod = new String[] {""} ;
      T008B25_n396EmprCod = new boolean[] {false} ;
      T008B25_A11849Cte_numero = new int[1] ;
      T008B26_A396EmprCod = new String[] {""} ;
      T008B26_n396EmprCod = new boolean[] {false} ;
      T008B26_A11791Ap_numero = new int[1] ;
      T008B27_A396EmprCod = new String[] {""} ;
      T008B27_n396EmprCod = new boolean[] {false} ;
      T008B27_A3985CalBarCod = new int[1] ;
      T008B27_A3986CalBarCodR = new byte[1] ;
      T008B27_A3987CalBarCodP = new String[] {""} ;
      T008B28_A396EmprCod = new String[] {""} ;
      T008B28_n396EmprCod = new boolean[] {false} ;
      T008B28_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T008B28_A652OpeCod = new int[1] ;
      T008B29_A396EmprCod = new String[] {""} ;
      T008B29_n396EmprCod = new boolean[] {false} ;
      T008B29_A129BarCod = new int[1] ;
      T008B29_n129BarCod = new boolean[] {false} ;
      T008B29_A132BarCodReo = new byte[1] ;
      T008B29_n132BarCodReo = new boolean[] {false} ;
      T008B29_A130BarCodPar = new String[] {""} ;
      T008B29_n130BarCodPar = new boolean[] {false} ;
      T008B29_A4118tinagrcod = new int[1] ;
      T008B29_A4119tinagrreo = new byte[1] ;
      T008B29_A4120tinagrpar = new String[] {""} ;
      T008B30_A396EmprCod = new String[] {""} ;
      T008B30_n396EmprCod = new boolean[] {false} ;
      T008B30_A129BarCod = new int[1] ;
      T008B30_n129BarCod = new boolean[] {false} ;
      T008B30_A132BarCodReo = new byte[1] ;
      T008B30_n132BarCodReo = new boolean[] {false} ;
      T008B30_A130BarCodPar = new String[] {""} ;
      T008B30_n130BarCodPar = new boolean[] {false} ;
      T008B30_A4080estagrcod = new int[1] ;
      T008B30_A4081estagrreo = new byte[1] ;
      T008B30_A4082estagrpar = new String[] {""} ;
      T008B31_A396EmprCod = new String[] {""} ;
      T008B31_n396EmprCod = new boolean[] {false} ;
      T008B31_A129BarCod = new int[1] ;
      T008B31_n129BarCod = new boolean[] {false} ;
      T008B31_A132BarCodReo = new byte[1] ;
      T008B31_n132BarCodReo = new boolean[] {false} ;
      T008B31_A130BarCodPar = new String[] {""} ;
      T008B31_n130BarCodPar = new boolean[] {false} ;
      T008B31_A4075recestncol = new byte[1] ;
      T008B31_A4076recestnpro = new byte[1] ;
      T008B32_A396EmprCod = new String[] {""} ;
      T008B32_n396EmprCod = new boolean[] {false} ;
      T008B32_A602MaqCod = new String[] {""} ;
      T008B32_A1142MaqFCod = new String[] {""} ;
      T008B32_A3068PlaEtaOrd = new short[1] ;
      T008B32_A3069PlaEtaOrdA = new byte[1] ;
      T008B32_A129BarCod = new int[1] ;
      T008B32_n129BarCod = new boolean[] {false} ;
      T008B32_A132BarCodReo = new byte[1] ;
      T008B32_n132BarCodReo = new boolean[] {false} ;
      T008B32_A130BarCodPar = new String[] {""} ;
      T008B32_n130BarCodPar = new boolean[] {false} ;
      T008B33_A396EmprCod = new String[] {""} ;
      T008B33_n396EmprCod = new boolean[] {false} ;
      T008B33_A129BarCod = new int[1] ;
      T008B33_n129BarCod = new boolean[] {false} ;
      T008B33_A132BarCodReo = new byte[1] ;
      T008B33_n132BarCodReo = new boolean[] {false} ;
      T008B33_A130BarCodPar = new String[] {""} ;
      T008B33_n130BarCodPar = new boolean[] {false} ;
      T008B33_A4846BarAudLin = new short[1] ;
      T008B34_A396EmprCod = new String[] {""} ;
      T008B34_n396EmprCod = new boolean[] {false} ;
      T008B34_A129BarCod = new int[1] ;
      T008B34_n129BarCod = new boolean[] {false} ;
      T008B34_A132BarCodReo = new byte[1] ;
      T008B34_n132BarCodReo = new boolean[] {false} ;
      T008B34_A130BarCodPar = new String[] {""} ;
      T008B34_n130BarCodPar = new boolean[] {false} ;
      T008B34_A3940BarEnsLin = new short[1] ;
      T008B35_A396EmprCod = new String[] {""} ;
      T008B35_n396EmprCod = new boolean[] {false} ;
      T008B35_A129BarCod = new int[1] ;
      T008B35_n129BarCod = new boolean[] {false} ;
      T008B35_A132BarCodReo = new byte[1] ;
      T008B35_n132BarCodReo = new boolean[] {false} ;
      T008B35_A130BarCodPar = new String[] {""} ;
      T008B35_n130BarCodPar = new boolean[] {false} ;
      T008B35_A3384RefBarCod = new int[1] ;
      T008B35_A3385RefBarReo = new byte[1] ;
      T008B35_A3386RefBarPar = new String[] {""} ;
      T008B36_A396EmprCod = new String[] {""} ;
      T008B36_n396EmprCod = new boolean[] {false} ;
      T008B36_A10914SolSalCod = new int[1] ;
      T008B37_A396EmprCod = new String[] {""} ;
      T008B37_n396EmprCod = new boolean[] {false} ;
      T008B37_A10364Ph_numero = new int[1] ;
      T008B38_A396EmprCod = new String[] {""} ;
      T008B38_n396EmprCod = new boolean[] {false} ;
      T008B38_A129BarCod = new int[1] ;
      T008B38_n129BarCod = new boolean[] {false} ;
      T008B38_A132BarCodReo = new byte[1] ;
      T008B38_n132BarCodReo = new boolean[] {false} ;
      T008B38_A130BarCodPar = new String[] {""} ;
      T008B38_n130BarCodPar = new boolean[] {false} ;
      T008B38_A10197ProEspCod = new String[] {""} ;
      T008B39_A396EmprCod = new String[] {""} ;
      T008B39_n396EmprCod = new boolean[] {false} ;
      T008B39_A129BarCod = new int[1] ;
      T008B39_n129BarCod = new boolean[] {false} ;
      T008B39_A132BarCodReo = new byte[1] ;
      T008B39_n132BarCodReo = new boolean[] {false} ;
      T008B39_A130BarCodPar = new String[] {""} ;
      T008B39_n130BarCodPar = new boolean[] {false} ;
      T008B39_A5322Dp_Nrecep = new int[1] ;
      T008B40_A396EmprCod = new String[] {""} ;
      T008B40_n396EmprCod = new boolean[] {false} ;
      T008B40_A129BarCod = new int[1] ;
      T008B40_n129BarCod = new boolean[] {false} ;
      T008B40_A132BarCodReo = new byte[1] ;
      T008B40_n132BarCodReo = new boolean[] {false} ;
      T008B40_A130BarCodPar = new String[] {""} ;
      T008B40_n130BarCodPar = new boolean[] {false} ;
      T008B40_A8569EntSecLn = new int[1] ;
      T008B41_A396EmprCod = new String[] {""} ;
      T008B41_n396EmprCod = new boolean[] {false} ;
      T008B41_A7434PLLNro = new int[1] ;
      T008B41_A7443LPLNro = new short[1] ;
      T008B41_A7459CPLCom = new short[1] ;
      T008B41_A129BarCod = new int[1] ;
      T008B41_n129BarCod = new boolean[] {false} ;
      T008B41_A132BarCodReo = new byte[1] ;
      T008B41_n132BarCodReo = new boolean[] {false} ;
      T008B41_A130BarCodPar = new String[] {""} ;
      T008B41_n130BarCodPar = new boolean[] {false} ;
      T008B42_A396EmprCod = new String[] {""} ;
      T008B42_n396EmprCod = new boolean[] {false} ;
      T008B42_A7145OSSCod = new int[1] ;
      T008B43_A396EmprCod = new String[] {""} ;
      T008B43_n396EmprCod = new boolean[] {false} ;
      T008B43_A7049OGSCod = new int[1] ;
      T008B44_A396EmprCod = new String[] {""} ;
      T008B44_n396EmprCod = new boolean[] {false} ;
      T008B44_A129BarCod = new int[1] ;
      T008B44_n129BarCod = new boolean[] {false} ;
      T008B44_A132BarCodReo = new byte[1] ;
      T008B44_n132BarCodReo = new boolean[] {false} ;
      T008B44_A130BarCodPar = new String[] {""} ;
      T008B44_n130BarCodPar = new boolean[] {false} ;
      T008B44_A6031Ac_Barcod = new int[1] ;
      T008B44_A6032Ac_BarReo = new byte[1] ;
      T008B44_A6033Ac_BarPar = new String[] {""} ;
      T008B45_A396EmprCod = new String[] {""} ;
      T008B45_n396EmprCod = new boolean[] {false} ;
      T008B45_A129BarCod = new int[1] ;
      T008B45_n129BarCod = new boolean[] {false} ;
      T008B45_A132BarCodReo = new byte[1] ;
      T008B45_n132BarCodReo = new boolean[] {false} ;
      T008B45_A130BarCodPar = new String[] {""} ;
      T008B45_n130BarCodPar = new boolean[] {false} ;
      T008B45_A5908PartPal = new int[1] ;
      T008B46_A396EmprCod = new String[] {""} ;
      T008B46_n396EmprCod = new boolean[] {false} ;
      T008B46_A129BarCod = new int[1] ;
      T008B46_n129BarCod = new boolean[] {false} ;
      T008B46_A132BarCodReo = new byte[1] ;
      T008B46_n132BarCodReo = new boolean[] {false} ;
      T008B46_A130BarCodPar = new String[] {""} ;
      T008B46_n130BarCodPar = new boolean[] {false} ;
      T008B46_A2524DisComLin = new byte[1] ;
      T008B46_A1056DisComCod = new String[] {""} ;
      T008B46_A1032FonCod = new String[] {""} ;
      T008B47_A396EmprCod = new String[] {""} ;
      T008B47_n396EmprCod = new boolean[] {false} ;
      T008B47_A1736AlbExtCod = new long[1] ;
      T008B47_A129BarCod = new int[1] ;
      T008B47_n129BarCod = new boolean[] {false} ;
      T008B47_A132BarCodReo = new byte[1] ;
      T008B47_n132BarCodReo = new boolean[] {false} ;
      T008B47_A130BarCodPar = new String[] {""} ;
      T008B47_n130BarCodPar = new boolean[] {false} ;
      T008B48_A396EmprCod = new String[] {""} ;
      T008B48_n396EmprCod = new boolean[] {false} ;
      T008B48_A129BarCod = new int[1] ;
      T008B48_n129BarCod = new boolean[] {false} ;
      T008B48_A132BarCodReo = new byte[1] ;
      T008B48_n132BarCodReo = new boolean[] {false} ;
      T008B48_A130BarCodPar = new String[] {""} ;
      T008B48_n130BarCodPar = new boolean[] {false} ;
      T008B48_A3753BarFoaCod = new int[1] ;
      T008B48_A3754BarFoaReo = new byte[1] ;
      T008B48_A3755BarFoaPar = new String[] {""} ;
      T008B49_A396EmprCod = new String[] {""} ;
      T008B49_n396EmprCod = new boolean[] {false} ;
      T008B49_A129BarCod = new int[1] ;
      T008B49_n129BarCod = new boolean[] {false} ;
      T008B49_A132BarCodReo = new byte[1] ;
      T008B49_n132BarCodReo = new boolean[] {false} ;
      T008B49_A130BarCodPar = new String[] {""} ;
      T008B49_n130BarCodPar = new boolean[] {false} ;
      T008B49_A3747BarPegCod = new int[1] ;
      T008B49_A3748BarPegReo = new byte[1] ;
      T008B49_A3749BarPegPar = new String[] {""} ;
      T008B50_A396EmprCod = new String[] {""} ;
      T008B50_n396EmprCod = new boolean[] {false} ;
      T008B50_A3253SolTraCod = new int[1] ;
      T008B51_A396EmprCod = new String[] {""} ;
      T008B51_n396EmprCod = new boolean[] {false} ;
      T008B51_A3235SolSubCod = new int[1] ;
      T008B52_A396EmprCod = new String[] {""} ;
      T008B52_n396EmprCod = new boolean[] {false} ;
      T008B52_A3218SolLuzCod = new int[1] ;
      T008B53_A396EmprCod = new String[] {""} ;
      T008B53_n396EmprCod = new boolean[] {false} ;
      T008B53_A3196SolFriCod = new int[1] ;
      T008B54_A396EmprCod = new String[] {""} ;
      T008B54_n396EmprCod = new boolean[] {false} ;
      T008B54_A3165SolPilCod = new int[1] ;
      T008B55_A396EmprCod = new String[] {""} ;
      T008B55_n396EmprCod = new boolean[] {false} ;
      T008B55_A129BarCod = new int[1] ;
      T008B55_n129BarCod = new boolean[] {false} ;
      T008B55_A132BarCodReo = new byte[1] ;
      T008B55_n132BarCodReo = new boolean[] {false} ;
      T008B55_A130BarCodPar = new String[] {""} ;
      T008B55_n130BarCodPar = new boolean[] {false} ;
      T008B55_A2872HAnRLinMaq = new short[1] ;
      T008B55_A2873HAnRLinPro = new byte[1] ;
      T008B55_A2874HAnRLin = new short[1] ;
      T008B55_A2875HAnNumAny = new byte[1] ;
      T008B56_A396EmprCod = new String[] {""} ;
      T008B56_n396EmprCod = new boolean[] {false} ;
      T008B56_A2817PlaTer = new String[] {""} ;
      T008B56_A2818PlaOrd = new short[1] ;
      T008B57_A396EmprCod = new String[] {""} ;
      T008B57_n396EmprCod = new boolean[] {false} ;
      T008B57_A2809MetTerCod = new String[] {""} ;
      T008B57_A129BarCod = new int[1] ;
      T008B57_n129BarCod = new boolean[] {false} ;
      T008B57_A132BarCodReo = new byte[1] ;
      T008B57_n132BarCodReo = new boolean[] {false} ;
      T008B57_A130BarCodPar = new String[] {""} ;
      T008B57_n130BarCodPar = new boolean[] {false} ;
      T008B58_A396EmprCod = new String[] {""} ;
      T008B58_n396EmprCod = new boolean[] {false} ;
      T008B58_A129BarCod = new int[1] ;
      T008B58_n129BarCod = new boolean[] {false} ;
      T008B58_A132BarCodReo = new byte[1] ;
      T008B58_n132BarCodReo = new boolean[] {false} ;
      T008B58_A130BarCodPar = new String[] {""} ;
      T008B58_n130BarCodPar = new boolean[] {false} ;
      T008B58_A2808RecLinMAL = new short[1] ;
      T008B58_A1377RecNumAny = new byte[1] ;
      T008B58_A719PrdNum = new String[] {""} ;
      T008B59_A396EmprCod = new String[] {""} ;
      T008B59_n396EmprCod = new boolean[] {false} ;
      T008B59_A129BarCod = new int[1] ;
      T008B59_n129BarCod = new boolean[] {false} ;
      T008B59_A132BarCodReo = new byte[1] ;
      T008B59_n132BarCodReo = new boolean[] {false} ;
      T008B59_A130BarCodPar = new String[] {""} ;
      T008B59_n130BarCodPar = new boolean[] {false} ;
      T008B59_A2804RecLinMaq = new short[1] ;
      T008B60_A396EmprCod = new String[] {""} ;
      T008B60_n396EmprCod = new boolean[] {false} ;
      T008B60_A2792TermiCod = new String[] {""} ;
      T008B60_A129BarCod = new int[1] ;
      T008B60_n129BarCod = new boolean[] {false} ;
      T008B60_A132BarCodReo = new byte[1] ;
      T008B60_n132BarCodReo = new boolean[] {false} ;
      T008B60_A130BarCodPar = new String[] {""} ;
      T008B60_n130BarCodPar = new boolean[] {false} ;
      T008B61_A396EmprCod = new String[] {""} ;
      T008B61_n396EmprCod = new boolean[] {false} ;
      T008B61_A2248ManCod = new short[1] ;
      T008B61_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T008B61_A2713RpExHdLi = new short[1] ;
      T008B62_A396EmprCod = new String[] {""} ;
      T008B62_n396EmprCod = new boolean[] {false} ;
      T008B62_A2248ManCod = new short[1] ;
      T008B62_A2689ExHdrFas = new String[] {""} ;
      T008B62_A2692ExHdrLin = new int[1] ;
      T008B63_A396EmprCod = new String[] {""} ;
      T008B63_n396EmprCod = new boolean[] {false} ;
      T008B63_A129BarCod = new int[1] ;
      T008B63_n129BarCod = new boolean[] {false} ;
      T008B63_A132BarCodReo = new byte[1] ;
      T008B63_n132BarCodReo = new boolean[] {false} ;
      T008B63_A130BarCodPar = new String[] {""} ;
      T008B63_n130BarCodPar = new boolean[] {false} ;
      T008B63_A2494BarDosPro = new String[] {""} ;
      T008B63_A719PrdNum = new String[] {""} ;
      T008B64_A396EmprCod = new String[] {""} ;
      T008B64_n396EmprCod = new boolean[] {false} ;
      T008B64_A602MaqCod = new String[] {""} ;
      T008B64_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T008B64_A129BarCod = new int[1] ;
      T008B64_n129BarCod = new boolean[] {false} ;
      T008B64_A132BarCodReo = new byte[1] ;
      T008B64_n132BarCodReo = new boolean[] {false} ;
      T008B64_A130BarCodPar = new String[] {""} ;
      T008B64_n130BarCodPar = new boolean[] {false} ;
      T008B65_A396EmprCod = new String[] {""} ;
      T008B65_n396EmprCod = new boolean[] {false} ;
      T008B65_A129BarCod = new int[1] ;
      T008B65_n129BarCod = new boolean[] {false} ;
      T008B65_A132BarCodReo = new byte[1] ;
      T008B65_n132BarCodReo = new boolean[] {false} ;
      T008B65_A130BarCodPar = new String[] {""} ;
      T008B65_n130BarCodPar = new boolean[] {false} ;
      T008B65_A2457BarObLin = new short[1] ;
      T008B66_A396EmprCod = new String[] {""} ;
      T008B66_n396EmprCod = new boolean[] {false} ;
      T008B66_A2406ExhAlbCod = new int[1] ;
      T008B66_A129BarCod = new int[1] ;
      T008B66_n129BarCod = new boolean[] {false} ;
      T008B66_A132BarCodReo = new byte[1] ;
      T008B66_n132BarCodReo = new boolean[] {false} ;
      T008B66_A130BarCodPar = new String[] {""} ;
      T008B66_n130BarCodPar = new boolean[] {false} ;
      T008B67_A396EmprCod = new String[] {""} ;
      T008B67_n396EmprCod = new boolean[] {false} ;
      T008B67_A2253SalExtAlb = new int[1] ;
      T008B67_A129BarCod = new int[1] ;
      T008B67_n129BarCod = new boolean[] {false} ;
      T008B67_A132BarCodReo = new byte[1] ;
      T008B67_n132BarCodReo = new boolean[] {false} ;
      T008B67_A130BarCodPar = new String[] {""} ;
      T008B67_n130BarCodPar = new boolean[] {false} ;
      T008B68_A396EmprCod = new String[] {""} ;
      T008B68_n396EmprCod = new boolean[] {false} ;
      T008B68_A30AlbProCod = new long[1] ;
      T008B68_A129BarCod = new int[1] ;
      T008B68_n129BarCod = new boolean[] {false} ;
      T008B68_A132BarCodReo = new byte[1] ;
      T008B68_n132BarCodReo = new boolean[] {false} ;
      T008B68_A130BarCodPar = new String[] {""} ;
      T008B68_n130BarCodPar = new boolean[] {false} ;
      T008B69_A396EmprCod = new String[] {""} ;
      T008B69_n396EmprCod = new boolean[] {false} ;
      T008B69_A1348SolColCod = new int[1] ;
      T008B70_A396EmprCod = new String[] {""} ;
      T008B70_n396EmprCod = new boolean[] {false} ;
      T008B70_A1333EstDimCod = new int[1] ;
      T008B71_A396EmprCod = new String[] {""} ;
      T008B71_n396EmprCod = new boolean[] {false} ;
      T008B71_A1314EnsLabCod = new int[1] ;
      T008B72_A396EmprCod = new String[] {""} ;
      T008B72_n396EmprCod = new boolean[] {false} ;
      T008B72_A129BarCod = new int[1] ;
      T008B72_n129BarCod = new boolean[] {false} ;
      T008B72_A132BarCodReo = new byte[1] ;
      T008B72_n132BarCodReo = new boolean[] {false} ;
      T008B72_A130BarCodPar = new String[] {""} ;
      T008B72_n130BarCodPar = new boolean[] {false} ;
      T008B72_A906ObsReoLin = new byte[1] ;
      T008B73_A396EmprCod = new String[] {""} ;
      T008B73_n396EmprCod = new boolean[] {false} ;
      T008B73_A859CumCodCont = new int[1] ;
      T008B74_A396EmprCod = new String[] {""} ;
      T008B74_n396EmprCod = new boolean[] {false} ;
      T008B74_A602MaqCod = new String[] {""} ;
      T008B74_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T008B74_A561HisProLin = new int[1] ;
      T008B75_A396EmprCod = new String[] {""} ;
      T008B75_n396EmprCod = new boolean[] {false} ;
      T008B75_A252CliCod = new int[1] ;
      T008B75_n252CliCod = new boolean[] {false} ;
      T008B75_A494ForSer = new String[] {""} ;
      T008B75_A482ForColNom = new String[] {""} ;
      T008B75_A483ForColNum = new int[1] ;
      T008B75_A831TipColCod = new byte[1] ;
      T008B76_A396EmprCod = new String[] {""} ;
      T008B76_n396EmprCod = new boolean[] {false} ;
      T008B76_A129BarCod = new int[1] ;
      T008B76_n129BarCod = new boolean[] {false} ;
      T008B76_A132BarCodReo = new byte[1] ;
      T008B76_n132BarCodReo = new boolean[] {false} ;
      T008B76_A130BarCodPar = new String[] {""} ;
      T008B76_n130BarCodPar = new boolean[] {false} ;
      T008B76_A200BarPieCod = new String[] {""} ;
      T008B77_A396EmprCod = new String[] {""} ;
      T008B77_n396EmprCod = new boolean[] {false} ;
      T008B77_A129BarCod = new int[1] ;
      T008B77_n129BarCod = new boolean[] {false} ;
      T008B77_A132BarCodReo = new byte[1] ;
      T008B77_n132BarCodReo = new boolean[] {false} ;
      T008B77_A130BarCodPar = new String[] {""} ;
      T008B77_n130BarCodPar = new boolean[] {false} ;
      T008B77_A188BarNotLin = new byte[1] ;
      T008B78_A396EmprCod = new String[] {""} ;
      T008B78_n396EmprCod = new boolean[] {false} ;
      T008B78_A129BarCod = new int[1] ;
      T008B78_n129BarCod = new boolean[] {false} ;
      T008B78_A132BarCodReo = new byte[1] ;
      T008B78_n132BarCodReo = new boolean[] {false} ;
      T008B78_A130BarCodPar = new String[] {""} ;
      T008B78_n130BarCodPar = new boolean[] {false} ;
      T008B78_A758ProCod = new String[] {""} ;
      T008B79_A396EmprCod = new String[] {""} ;
      T008B79_n396EmprCod = new boolean[] {false} ;
      T008B79_A129BarCod = new int[1] ;
      T008B79_n129BarCod = new boolean[] {false} ;
      T008B79_A132BarCodReo = new byte[1] ;
      T008B79_n132BarCodReo = new boolean[] {false} ;
      T008B79_A130BarCodPar = new String[] {""} ;
      T008B79_n130BarCodPar = new boolean[] {false} ;
      T008B79_A119BarAgrCod = new int[1] ;
      T008B79_A124BarAgrReo = new byte[1] ;
      T008B79_A122BarAgrPar = new String[] {""} ;
      T008B81_A396EmprCod = new String[] {""} ;
      T008B81_n396EmprCod = new boolean[] {false} ;
      T008B81_A129BarCod = new int[1] ;
      T008B81_n129BarCod = new boolean[] {false} ;
      T008B81_A132BarCodReo = new byte[1] ;
      T008B81_n132BarCodReo = new boolean[] {false} ;
      T008B81_A130BarCodPar = new String[] {""} ;
      T008B81_n130BarCodPar = new boolean[] {false} ;
      T008B82_A129BarCod = new int[1] ;
      T008B82_n129BarCod = new boolean[] {false} ;
      T008B82_A132BarCodReo = new byte[1] ;
      T008B82_n132BarCodReo = new boolean[] {false} ;
      T008B82_A130BarCodPar = new String[] {""} ;
      T008B82_n130BarCodPar = new boolean[] {false} ;
      T008B82_A2444BarEnLin = new short[1] ;
      T008B82_A2451BarObsEnE = new String[] {""} ;
      T008B82_n2451BarObsEnE = new boolean[] {false} ;
      T008B82_A396EmprCod = new String[] {""} ;
      T008B82_n396EmprCod = new boolean[] {false} ;
      T008B83_A396EmprCod = new String[] {""} ;
      T008B83_n396EmprCod = new boolean[] {false} ;
      T008B83_A129BarCod = new int[1] ;
      T008B83_n129BarCod = new boolean[] {false} ;
      T008B83_A132BarCodReo = new byte[1] ;
      T008B83_n132BarCodReo = new boolean[] {false} ;
      T008B83_A130BarCodPar = new String[] {""} ;
      T008B83_n130BarCodPar = new boolean[] {false} ;
      T008B83_A2444BarEnLin = new short[1] ;
      T008B3_A129BarCod = new int[1] ;
      T008B3_n129BarCod = new boolean[] {false} ;
      T008B3_A132BarCodReo = new byte[1] ;
      T008B3_n132BarCodReo = new boolean[] {false} ;
      T008B3_A130BarCodPar = new String[] {""} ;
      T008B3_n130BarCodPar = new boolean[] {false} ;
      T008B3_A2444BarEnLin = new short[1] ;
      T008B3_A2451BarObsEnE = new String[] {""} ;
      T008B3_n2451BarObsEnE = new boolean[] {false} ;
      T008B3_A396EmprCod = new String[] {""} ;
      T008B3_n396EmprCod = new boolean[] {false} ;
      T008B2_A129BarCod = new int[1] ;
      T008B2_n129BarCod = new boolean[] {false} ;
      T008B2_A132BarCodReo = new byte[1] ;
      T008B2_n132BarCodReo = new boolean[] {false} ;
      T008B2_A130BarCodPar = new String[] {""} ;
      T008B2_n130BarCodPar = new boolean[] {false} ;
      T008B2_A2444BarEnLin = new short[1] ;
      T008B2_A2451BarObsEnE = new String[] {""} ;
      T008B2_n2451BarObsEnE = new boolean[] {false} ;
      T008B2_A396EmprCod = new String[] {""} ;
      T008B2_n396EmprCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      T008B87_A396EmprCod = new String[] {""} ;
      T008B87_n396EmprCod = new boolean[] {false} ;
      T008B87_A129BarCod = new int[1] ;
      T008B87_n129BarCod = new boolean[] {false} ;
      T008B87_A132BarCodReo = new byte[1] ;
      T008B87_n132BarCodReo = new boolean[] {false} ;
      T008B87_A130BarCodPar = new String[] {""} ;
      T008B87_n130BarCodPar = new boolean[] {false} ;
      T008B87_A2444BarEnLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T008B88_A407EmprNom = new String[] {""} ;
      T008B88_n407EmprNom = new boolean[] {false} ;
      T008B90_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T008B90_n166BarKgm = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ212BarSer = "" ;
      ZZ1500BarNMtr = "" ;
      ZZ135BarColNom = "" ;
      ZZ166BarKgm = DecimalUtil.ZERO ;
      ZZ966PartCod = "" ;
      ZZ143BarDisNum = "" ;
      ZZ2447BarFecEnE = GXutil.nullDate() ;
      ZZ2449BarKgEnE = DecimalUtil.ZERO ;
      ZZ2445BarEntEnE = "" ;
      ZZ365DisDes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdee2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdee2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdee2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdee2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdee2__default(),
         new Object[] {
             new Object[] {
            T008B2_A129BarCod, T008B2_A132BarCodReo, T008B2_A130BarCodPar, T008B2_A2444BarEnLin, T008B2_A2451BarObsEnE, T008B2_n2451BarObsEnE, T008B2_A396EmprCod
            }
            , new Object[] {
            T008B3_A129BarCod, T008B3_A132BarCodReo, T008B3_A130BarCodPar, T008B3_A2444BarEnLin, T008B3_A2451BarObsEnE, T008B3_n2451BarObsEnE, T008B3_A396EmprCod
            }
            , new Object[] {
            T008B4_A361DisCod, T008B4_A2759BarMaqGru, T008B4_A129BarCod, T008B4_A132BarCodReo, T008B4_A130BarCodPar, T008B4_A180BarMaqCod, T008B4_A212BarSer, T008B4_A1500BarNMtr, T008B4_A135BarColNom, T008B4_A136BarColNum,
            T008B4_A218BarTipCol, T008B4_A143BarDisNum, T008B4_A2400BarManCod, T008B4_A2447BarFecEnE, T008B4_A2442BarBulEnE, T008B4_n2442BarBulEnE, T008B4_A2449BarKgEnE, T008B4_n2449BarKgEnE, T008B4_A2445BarEntEnE, T008B4_A2446BarEnULin,
            T008B4_n2446BarEnULin, T008B4_A396EmprCod, T008B4_A252CliCod, T008B4_n252CliCod, T008B4_A365DisDes
            }
            , new Object[] {
            T008B5_A361DisCod, T008B5_A2759BarMaqGru, T008B5_A129BarCod, T008B5_A132BarCodReo, T008B5_A130BarCodPar, T008B5_A180BarMaqCod, T008B5_A212BarSer, T008B5_A1500BarNMtr, T008B5_A135BarColNom, T008B5_A136BarColNum,
            T008B5_A218BarTipCol, T008B5_A143BarDisNum, T008B5_A2400BarManCod, T008B5_A2447BarFecEnE, T008B5_A2442BarBulEnE, T008B5_n2442BarBulEnE, T008B5_A2449BarKgEnE, T008B5_n2449BarKgEnE, T008B5_A2445BarEntEnE, T008B5_A2446BarEnULin,
            T008B5_n2446BarEnULin, T008B5_A396EmprCod, T008B5_A252CliCod, T008B5_n252CliCod, T008B5_A365DisDes
            }
            , new Object[] {
            T008B6_A407EmprNom, T008B6_n407EmprNom
            }
            , new Object[] {
            T008B7_A252CliCod, T008B7_A365DisDes, T008B7_A966PartCod, T008B7_n966PartCod
            }
            , new Object[] {
            T008B9_A166BarKgm, T008B9_n166BarKgm
            }
            , new Object[] {
            T008B11_A361DisCod, T008B11_A2759BarMaqGru, T008B11_A129BarCod, T008B11_A132BarCodReo, T008B11_A130BarCodPar, T008B11_A180BarMaqCod, T008B11_A407EmprNom, T008B11_n407EmprNom, T008B11_A252CliCod, T008B11_n252CliCod,
            T008B11_A212BarSer, T008B11_A1500BarNMtr, T008B11_A135BarColNom, T008B11_A136BarColNum, T008B11_A218BarTipCol, T008B11_A143BarDisNum, T008B11_A2400BarManCod, T008B11_A2447BarFecEnE, T008B11_A2442BarBulEnE, T008B11_n2442BarBulEnE,
            T008B11_A2449BarKgEnE, T008B11_n2449BarKgEnE, T008B11_A2445BarEntEnE, T008B11_A2446BarEnULin, T008B11_n2446BarEnULin, T008B11_A365DisDes, T008B11_A396EmprCod, T008B11_A966PartCod, T008B11_n966PartCod, T008B11_A166BarKgm,
            T008B11_n166BarKgm
            }
            , new Object[] {
            T008B12_A396EmprCod, T008B12_A129BarCod, T008B12_A132BarCodReo, T008B12_A130BarCodPar
            }
            , new Object[] {
            T008B13_A396EmprCod, T008B13_A129BarCod, T008B13_A132BarCodReo, T008B13_A130BarCodPar
            }
            , new Object[] {
            T008B14_A396EmprCod, T008B14_A129BarCod, T008B14_A132BarCodReo, T008B14_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008B18_A14681MRPrId
            }
            , new Object[] {
            T008B19_A5921XCjaDis, T008B19_A5922XCjaCod
            }
            , new Object[] {
            T008B20_A396EmprCod, T008B20_A129BarCod, T008B20_A132BarCodReo, T008B20_A130BarCodPar, T008B20_A14152MEnvOrd
            }
            , new Object[] {
            T008B21_A396EmprCod, T008B21_A129BarCod, T008B21_A132BarCodReo, T008B21_A130BarCodPar, T008B21_A13905BarTraID
            }
            , new Object[] {
            T008B22_A396EmprCod, T008B22_A129BarCod, T008B22_A132BarCodReo, T008B22_A130BarCodPar, T008B22_A13093BarDGLin, T008B22_A13094BarDGDibCl, T008B22_A13095BarDGDibIn, T008B22_A13096BarDGComb, T008B22_A13097BarDGFOndo
            }
            , new Object[] {
            T008B23_A396EmprCod, T008B23_A11917Ebd_numero
            }
            , new Object[] {
            T008B24_A396EmprCod, T008B24_A11898Prd_numero
            }
            , new Object[] {
            T008B25_A396EmprCod, T008B25_A11849Cte_numero
            }
            , new Object[] {
            T008B26_A396EmprCod, T008B26_A11791Ap_numero
            }
            , new Object[] {
            T008B27_A396EmprCod, T008B27_A3985CalBarCod, T008B27_A3986CalBarCodR, T008B27_A3987CalBarCodP
            }
            , new Object[] {
            T008B28_A396EmprCod, T008B28_A5294InPTime, T008B28_A652OpeCod
            }
            , new Object[] {
            T008B29_A396EmprCod, T008B29_A129BarCod, T008B29_A132BarCodReo, T008B29_A130BarCodPar, T008B29_A4118tinagrcod, T008B29_A4119tinagrreo, T008B29_A4120tinagrpar
            }
            , new Object[] {
            T008B30_A396EmprCod, T008B30_A129BarCod, T008B30_A132BarCodReo, T008B30_A130BarCodPar, T008B30_A4080estagrcod, T008B30_A4081estagrreo, T008B30_A4082estagrpar
            }
            , new Object[] {
            T008B31_A396EmprCod, T008B31_A129BarCod, T008B31_A132BarCodReo, T008B31_A130BarCodPar, T008B31_A4075recestncol, T008B31_A4076recestnpro
            }
            , new Object[] {
            T008B32_A396EmprCod, T008B32_A602MaqCod, T008B32_A1142MaqFCod, T008B32_A3068PlaEtaOrd, T008B32_A3069PlaEtaOrdA, T008B32_A129BarCod, T008B32_A132BarCodReo, T008B32_A130BarCodPar
            }
            , new Object[] {
            T008B33_A396EmprCod, T008B33_A129BarCod, T008B33_A132BarCodReo, T008B33_A130BarCodPar, T008B33_A4846BarAudLin
            }
            , new Object[] {
            T008B34_A396EmprCod, T008B34_A129BarCod, T008B34_A132BarCodReo, T008B34_A130BarCodPar, T008B34_A3940BarEnsLin
            }
            , new Object[] {
            T008B35_A396EmprCod, T008B35_A129BarCod, T008B35_A132BarCodReo, T008B35_A130BarCodPar, T008B35_A3384RefBarCod, T008B35_A3385RefBarReo, T008B35_A3386RefBarPar
            }
            , new Object[] {
            T008B36_A396EmprCod, T008B36_A10914SolSalCod
            }
            , new Object[] {
            T008B37_A396EmprCod, T008B37_A10364Ph_numero
            }
            , new Object[] {
            T008B38_A396EmprCod, T008B38_A129BarCod, T008B38_A132BarCodReo, T008B38_A130BarCodPar, T008B38_A10197ProEspCod
            }
            , new Object[] {
            T008B39_A396EmprCod, T008B39_A129BarCod, T008B39_A132BarCodReo, T008B39_A130BarCodPar, T008B39_A5322Dp_Nrecep
            }
            , new Object[] {
            T008B40_A396EmprCod, T008B40_A129BarCod, T008B40_A132BarCodReo, T008B40_A130BarCodPar, T008B40_A8569EntSecLn
            }
            , new Object[] {
            T008B41_A396EmprCod, T008B41_A7434PLLNro, T008B41_A7443LPLNro, T008B41_A7459CPLCom, T008B41_A129BarCod, T008B41_A132BarCodReo, T008B41_A130BarCodPar
            }
            , new Object[] {
            T008B42_A396EmprCod, T008B42_A7145OSSCod
            }
            , new Object[] {
            T008B43_A396EmprCod, T008B43_A7049OGSCod
            }
            , new Object[] {
            T008B44_A396EmprCod, T008B44_A129BarCod, T008B44_A132BarCodReo, T008B44_A130BarCodPar, T008B44_A6031Ac_Barcod, T008B44_A6032Ac_BarReo, T008B44_A6033Ac_BarPar
            }
            , new Object[] {
            T008B45_A396EmprCod, T008B45_A129BarCod, T008B45_A132BarCodReo, T008B45_A130BarCodPar, T008B45_A5908PartPal
            }
            , new Object[] {
            T008B46_A396EmprCod, T008B46_A129BarCod, T008B46_A132BarCodReo, T008B46_A130BarCodPar, T008B46_A2524DisComLin, T008B46_A1056DisComCod, T008B46_A1032FonCod
            }
            , new Object[] {
            T008B47_A396EmprCod, T008B47_A1736AlbExtCod, T008B47_A129BarCod, T008B47_A132BarCodReo, T008B47_A130BarCodPar
            }
            , new Object[] {
            T008B48_A396EmprCod, T008B48_A129BarCod, T008B48_A132BarCodReo, T008B48_A130BarCodPar, T008B48_A3753BarFoaCod, T008B48_A3754BarFoaReo, T008B48_A3755BarFoaPar
            }
            , new Object[] {
            T008B49_A396EmprCod, T008B49_A129BarCod, T008B49_A132BarCodReo, T008B49_A130BarCodPar, T008B49_A3747BarPegCod, T008B49_A3748BarPegReo, T008B49_A3749BarPegPar
            }
            , new Object[] {
            T008B50_A396EmprCod, T008B50_A3253SolTraCod
            }
            , new Object[] {
            T008B51_A396EmprCod, T008B51_A3235SolSubCod
            }
            , new Object[] {
            T008B52_A396EmprCod, T008B52_A3218SolLuzCod
            }
            , new Object[] {
            T008B53_A396EmprCod, T008B53_A3196SolFriCod
            }
            , new Object[] {
            T008B54_A396EmprCod, T008B54_A3165SolPilCod
            }
            , new Object[] {
            T008B55_A396EmprCod, T008B55_A129BarCod, T008B55_A132BarCodReo, T008B55_A130BarCodPar, T008B55_A2872HAnRLinMaq, T008B55_A2873HAnRLinPro, T008B55_A2874HAnRLin, T008B55_A2875HAnNumAny
            }
            , new Object[] {
            T008B56_A396EmprCod, T008B56_A2817PlaTer, T008B56_A2818PlaOrd
            }
            , new Object[] {
            T008B57_A396EmprCod, T008B57_A2809MetTerCod, T008B57_A129BarCod, T008B57_A132BarCodReo, T008B57_A130BarCodPar
            }
            , new Object[] {
            T008B58_A396EmprCod, T008B58_A129BarCod, T008B58_A132BarCodReo, T008B58_A130BarCodPar, T008B58_A2808RecLinMAL, T008B58_A1377RecNumAny, T008B58_A719PrdNum
            }
            , new Object[] {
            T008B59_A396EmprCod, T008B59_A129BarCod, T008B59_A132BarCodReo, T008B59_A130BarCodPar, T008B59_A2804RecLinMaq
            }
            , new Object[] {
            T008B60_A396EmprCod, T008B60_A2792TermiCod, T008B60_A129BarCod, T008B60_A132BarCodReo, T008B60_A130BarCodPar
            }
            , new Object[] {
            T008B61_A396EmprCod, T008B61_A2248ManCod, T008B61_A2711RpExHdFe, T008B61_A2713RpExHdLi
            }
            , new Object[] {
            T008B62_A396EmprCod, T008B62_A2248ManCod, T008B62_A2689ExHdrFas, T008B62_A2692ExHdrLin
            }
            , new Object[] {
            T008B63_A396EmprCod, T008B63_A129BarCod, T008B63_A132BarCodReo, T008B63_A130BarCodPar, T008B63_A2494BarDosPro, T008B63_A719PrdNum
            }
            , new Object[] {
            T008B64_A396EmprCod, T008B64_A602MaqCod, T008B64_A2461PlaFecTin, T008B64_A129BarCod, T008B64_A132BarCodReo, T008B64_A130BarCodPar
            }
            , new Object[] {
            T008B65_A396EmprCod, T008B65_A129BarCod, T008B65_A132BarCodReo, T008B65_A130BarCodPar, T008B65_A2457BarObLin
            }
            , new Object[] {
            T008B66_A396EmprCod, T008B66_A2406ExhAlbCod, T008B66_A129BarCod, T008B66_A132BarCodReo, T008B66_A130BarCodPar
            }
            , new Object[] {
            T008B67_A396EmprCod, T008B67_A2253SalExtAlb, T008B67_A129BarCod, T008B67_A132BarCodReo, T008B67_A130BarCodPar
            }
            , new Object[] {
            T008B68_A396EmprCod, T008B68_A30AlbProCod, T008B68_A129BarCod, T008B68_A132BarCodReo, T008B68_A130BarCodPar
            }
            , new Object[] {
            T008B69_A396EmprCod, T008B69_A1348SolColCod
            }
            , new Object[] {
            T008B70_A396EmprCod, T008B70_A1333EstDimCod
            }
            , new Object[] {
            T008B71_A396EmprCod, T008B71_A1314EnsLabCod
            }
            , new Object[] {
            T008B72_A396EmprCod, T008B72_A129BarCod, T008B72_A132BarCodReo, T008B72_A130BarCodPar, T008B72_A906ObsReoLin
            }
            , new Object[] {
            T008B73_A396EmprCod, T008B73_A859CumCodCont
            }
            , new Object[] {
            T008B74_A396EmprCod, T008B74_A602MaqCod, T008B74_A558HisProFec, T008B74_A561HisProLin
            }
            , new Object[] {
            T008B75_A396EmprCod, T008B75_A252CliCod, T008B75_A494ForSer, T008B75_A482ForColNom, T008B75_A483ForColNum, T008B75_A831TipColCod
            }
            , new Object[] {
            T008B76_A396EmprCod, T008B76_A129BarCod, T008B76_A132BarCodReo, T008B76_A130BarCodPar, T008B76_A200BarPieCod
            }
            , new Object[] {
            T008B77_A396EmprCod, T008B77_A129BarCod, T008B77_A132BarCodReo, T008B77_A130BarCodPar, T008B77_A188BarNotLin
            }
            , new Object[] {
            T008B78_A396EmprCod, T008B78_A129BarCod, T008B78_A132BarCodReo, T008B78_A130BarCodPar, T008B78_A758ProCod
            }
            , new Object[] {
            T008B79_A396EmprCod, T008B79_A129BarCod, T008B79_A132BarCodReo, T008B79_A130BarCodPar, T008B79_A119BarAgrCod, T008B79_A124BarAgrReo, T008B79_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T008B81_A396EmprCod, T008B81_A129BarCod, T008B81_A132BarCodReo, T008B81_A130BarCodPar
            }
            , new Object[] {
            T008B82_A129BarCod, T008B82_A132BarCodReo, T008B82_A130BarCodPar, T008B82_A2444BarEnLin, T008B82_A2451BarObsEnE, T008B82_n2451BarObsEnE, T008B82_A396EmprCod
            }
            , new Object[] {
            T008B83_A396EmprCod, T008B83_A129BarCod, T008B83_A132BarCodReo, T008B83_A130BarCodPar, T008B83_A2444BarEnLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008B87_A396EmprCod, T008B87_A129BarCod, T008B87_A132BarCodReo, T008B87_A130BarCodPar, T008B87_A2444BarEnLin
            }
            , new Object[] {
            T008B88_A407EmprNom, T008B88_n407EmprNom
            }
            , new Object[] {
            T008B90_A166BarKgm, T008B90_n166BarKgm
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
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte Gx_BScreen ;
   private byte GXv_int3[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private short Z2400BarManCod ;
   private short Z2442BarBulEnE ;
   private short Z2446BarEnULin ;
   private short Z2444BarEnLin ;
   private short nRcdDeleted_331 ;
   private short nRcdExists_331 ;
   private short nIsMod_331 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2400BarManCod ;
   private short A2442BarBulEnE ;
   private short A2446BarEnULin ;
   private short nBlankRcdCount331 ;
   private short RcdFound331 ;
   private short nBlankRcdUsr331 ;
   private short A2444BarEnLin ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_331 ;
   private short ZZ2400BarManCod ;
   private short ZZ2442BarBulEnE ;
   private short ZZ2446BarEnULin ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z136BarColNum ;
   private int nRC_GXsfl_120 ;
   private int nGXsfl_120_idx=1 ;
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
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarNMtr_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtPartCod_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarManCod_Enabled ;
   private int edtBarFecEnE_Enabled ;
   private int edtBarBulEnE_Enabled ;
   private int edtBarKgEnE_Enabled ;
   private int edtBarEntEnE_Enabled ;
   private int edtBarEnULin_Enabled ;
   private int edtavnRcdDeleted_331_Enabled ;
   private int edtBarEnLin_Enabled ;
   private int edtBarObsEnE_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarEnLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarEnULin_Backcolor ;
   private int edtBarEntEnE_Backcolor ;
   private int edtBarKgEnE_Backcolor ;
   private int edtBarBulEnE_Backcolor ;
   private int edtBarFecEnE_Backcolor ;
   private int edtBarManCod_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtPartCod_Backcolor ;
   private int edtBarKgm_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarNMtr_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ136BarColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2449BarKgEnE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A2449BarKgEnE ;
   private java.math.BigDecimal Z166BarKgm ;
   private java.math.BigDecimal ZZ166BarKgm ;
   private java.math.BigDecimal ZZ2449BarKgEnE ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z212BarSer ;
   private String Z1500BarNMtr ;
   private String Z135BarColNom ;
   private String Z143BarDisNum ;
   private String Z2445BarEntEnE ;
   private String Z2451BarObsEnE ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarSer_Internalname ;
   private String sGXsfl_120_idx="0001" ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarNMtr_Internalname ;
   private String A1500BarNMtr ;
   private String edtBarNMtr_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarKgm_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPartCod_Internalname ;
   private String A966PartCod ;
   private String edtPartCod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarManCod_Internalname ;
   private String edtBarManCod_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarFecEnE_Internalname ;
   private String edtBarFecEnE_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarBulEnE_Internalname ;
   private String edtBarBulEnE_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarKgEnE_Internalname ;
   private String edtBarKgEnE_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarEntEnE_Internalname ;
   private String A2445BarEntEnE ;
   private String edtBarEntEnE_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarEnULin_Internalname ;
   private String edtBarEnULin_Jsonclick ;
   private String sMode331 ;
   private String edtavnRcdDeleted_331_Internalname ;
   private String edtBarEnLin_Internalname ;
   private String edtBarObsEnE_Internalname ;
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
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A2451BarObsEnE ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z966PartCod ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String sGXsfl_120_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_331_Jsonclick ;
   private String edtBarEnLin_Jsonclick ;
   private String edtBarObsEnE_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ212BarSer ;
   private String ZZ1500BarNMtr ;
   private String ZZ135BarColNom ;
   private String ZZ966PartCod ;
   private String ZZ143BarDisNum ;
   private String ZZ2445BarEntEnE ;
   private String ZZ365DisDes ;
   private java.util.Date Z2447BarFecEnE ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date ZZ2447BarFecEnE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_120_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean n966PartCod ;
   private boolean n2442BarBulEnE ;
   private boolean n2449BarKgEnE ;
   private boolean n2446BarEnULin ;
   private boolean Gx_longc ;
   private boolean n2451BarObsEnE ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T008B6_A407EmprNom ;
   private boolean[] T008B6_n407EmprNom ;
   private java.math.BigDecimal[] T008B9_A166BarKgm ;
   private boolean[] T008B9_n166BarKgm ;
   private int[] T008B7_A252CliCod ;
   private boolean[] T008B7_n252CliCod ;
   private String[] T008B7_A365DisDes ;
   private String[] T008B7_A966PartCod ;
   private boolean[] T008B7_n966PartCod ;
   private int[] T008B11_A361DisCod ;
   private String[] T008B11_A2759BarMaqGru ;
   private int[] T008B11_A129BarCod ;
   private boolean[] T008B11_n129BarCod ;
   private byte[] T008B11_A132BarCodReo ;
   private boolean[] T008B11_n132BarCodReo ;
   private String[] T008B11_A130BarCodPar ;
   private boolean[] T008B11_n130BarCodPar ;
   private String[] T008B11_A180BarMaqCod ;
   private String[] T008B11_A407EmprNom ;
   private boolean[] T008B11_n407EmprNom ;
   private int[] T008B11_A252CliCod ;
   private boolean[] T008B11_n252CliCod ;
   private String[] T008B11_A212BarSer ;
   private String[] T008B11_A1500BarNMtr ;
   private String[] T008B11_A135BarColNom ;
   private int[] T008B11_A136BarColNum ;
   private byte[] T008B11_A218BarTipCol ;
   private String[] T008B11_A143BarDisNum ;
   private short[] T008B11_A2400BarManCod ;
   private java.util.Date[] T008B11_A2447BarFecEnE ;
   private short[] T008B11_A2442BarBulEnE ;
   private boolean[] T008B11_n2442BarBulEnE ;
   private java.math.BigDecimal[] T008B11_A2449BarKgEnE ;
   private boolean[] T008B11_n2449BarKgEnE ;
   private String[] T008B11_A2445BarEntEnE ;
   private short[] T008B11_A2446BarEnULin ;
   private boolean[] T008B11_n2446BarEnULin ;
   private String[] T008B11_A365DisDes ;
   private String[] T008B11_A396EmprCod ;
   private boolean[] T008B11_n396EmprCod ;
   private String[] T008B11_A966PartCod ;
   private boolean[] T008B11_n966PartCod ;
   private java.math.BigDecimal[] T008B11_A166BarKgm ;
   private boolean[] T008B11_n166BarKgm ;
   private String[] T008B12_A396EmprCod ;
   private boolean[] T008B12_n396EmprCod ;
   private int[] T008B12_A129BarCod ;
   private boolean[] T008B12_n129BarCod ;
   private byte[] T008B12_A132BarCodReo ;
   private boolean[] T008B12_n132BarCodReo ;
   private String[] T008B12_A130BarCodPar ;
   private boolean[] T008B12_n130BarCodPar ;
   private int[] T008B5_A361DisCod ;
   private String[] T008B5_A2759BarMaqGru ;
   private int[] T008B5_A129BarCod ;
   private boolean[] T008B5_n129BarCod ;
   private byte[] T008B5_A132BarCodReo ;
   private boolean[] T008B5_n132BarCodReo ;
   private String[] T008B5_A130BarCodPar ;
   private boolean[] T008B5_n130BarCodPar ;
   private String[] T008B5_A180BarMaqCod ;
   private String[] T008B5_A212BarSer ;
   private String[] T008B5_A1500BarNMtr ;
   private String[] T008B5_A135BarColNom ;
   private int[] T008B5_A136BarColNum ;
   private byte[] T008B5_A218BarTipCol ;
   private String[] T008B5_A143BarDisNum ;
   private short[] T008B5_A2400BarManCod ;
   private java.util.Date[] T008B5_A2447BarFecEnE ;
   private short[] T008B5_A2442BarBulEnE ;
   private boolean[] T008B5_n2442BarBulEnE ;
   private java.math.BigDecimal[] T008B5_A2449BarKgEnE ;
   private boolean[] T008B5_n2449BarKgEnE ;
   private String[] T008B5_A2445BarEntEnE ;
   private short[] T008B5_A2446BarEnULin ;
   private boolean[] T008B5_n2446BarEnULin ;
   private String[] T008B5_A396EmprCod ;
   private boolean[] T008B5_n396EmprCod ;
   private int[] T008B5_A252CliCod ;
   private boolean[] T008B5_n252CliCod ;
   private String[] T008B5_A365DisDes ;
   private String[] T008B13_A396EmprCod ;
   private boolean[] T008B13_n396EmprCod ;
   private int[] T008B13_A129BarCod ;
   private boolean[] T008B13_n129BarCod ;
   private byte[] T008B13_A132BarCodReo ;
   private boolean[] T008B13_n132BarCodReo ;
   private String[] T008B13_A130BarCodPar ;
   private boolean[] T008B13_n130BarCodPar ;
   private String[] T008B14_A396EmprCod ;
   private boolean[] T008B14_n396EmprCod ;
   private int[] T008B14_A129BarCod ;
   private boolean[] T008B14_n129BarCod ;
   private byte[] T008B14_A132BarCodReo ;
   private boolean[] T008B14_n132BarCodReo ;
   private String[] T008B14_A130BarCodPar ;
   private boolean[] T008B14_n130BarCodPar ;
   private int[] T008B4_A361DisCod ;
   private String[] T008B4_A2759BarMaqGru ;
   private int[] T008B4_A129BarCod ;
   private boolean[] T008B4_n129BarCod ;
   private byte[] T008B4_A132BarCodReo ;
   private boolean[] T008B4_n132BarCodReo ;
   private String[] T008B4_A130BarCodPar ;
   private boolean[] T008B4_n130BarCodPar ;
   private String[] T008B4_A180BarMaqCod ;
   private String[] T008B4_A212BarSer ;
   private String[] T008B4_A1500BarNMtr ;
   private String[] T008B4_A135BarColNom ;
   private int[] T008B4_A136BarColNum ;
   private byte[] T008B4_A218BarTipCol ;
   private String[] T008B4_A143BarDisNum ;
   private short[] T008B4_A2400BarManCod ;
   private java.util.Date[] T008B4_A2447BarFecEnE ;
   private short[] T008B4_A2442BarBulEnE ;
   private boolean[] T008B4_n2442BarBulEnE ;
   private java.math.BigDecimal[] T008B4_A2449BarKgEnE ;
   private boolean[] T008B4_n2449BarKgEnE ;
   private String[] T008B4_A2445BarEntEnE ;
   private short[] T008B4_A2446BarEnULin ;
   private boolean[] T008B4_n2446BarEnULin ;
   private String[] T008B4_A396EmprCod ;
   private boolean[] T008B4_n396EmprCod ;
   private int[] T008B4_A252CliCod ;
   private boolean[] T008B4_n252CliCod ;
   private String[] T008B4_A365DisDes ;
   private long[] T008B18_A14681MRPrId ;
   private String[] T008B19_A5921XCjaDis ;
   private long[] T008B19_A5922XCjaCod ;
   private String[] T008B20_A396EmprCod ;
   private boolean[] T008B20_n396EmprCod ;
   private int[] T008B20_A129BarCod ;
   private boolean[] T008B20_n129BarCod ;
   private byte[] T008B20_A132BarCodReo ;
   private boolean[] T008B20_n132BarCodReo ;
   private String[] T008B20_A130BarCodPar ;
   private boolean[] T008B20_n130BarCodPar ;
   private short[] T008B20_A14152MEnvOrd ;
   private String[] T008B21_A396EmprCod ;
   private boolean[] T008B21_n396EmprCod ;
   private int[] T008B21_A129BarCod ;
   private boolean[] T008B21_n129BarCod ;
   private byte[] T008B21_A132BarCodReo ;
   private boolean[] T008B21_n132BarCodReo ;
   private String[] T008B21_A130BarCodPar ;
   private boolean[] T008B21_n130BarCodPar ;
   private String[] T008B21_A13905BarTraID ;
   private String[] T008B22_A396EmprCod ;
   private boolean[] T008B22_n396EmprCod ;
   private int[] T008B22_A129BarCod ;
   private boolean[] T008B22_n129BarCod ;
   private byte[] T008B22_A132BarCodReo ;
   private boolean[] T008B22_n132BarCodReo ;
   private String[] T008B22_A130BarCodPar ;
   private boolean[] T008B22_n130BarCodPar ;
   private byte[] T008B22_A13093BarDGLin ;
   private String[] T008B22_A13094BarDGDibCl ;
   private int[] T008B22_A13095BarDGDibIn ;
   private String[] T008B22_A13096BarDGComb ;
   private String[] T008B22_A13097BarDGFOndo ;
   private String[] T008B23_A396EmprCod ;
   private boolean[] T008B23_n396EmprCod ;
   private int[] T008B23_A11917Ebd_numero ;
   private String[] T008B24_A396EmprCod ;
   private boolean[] T008B24_n396EmprCod ;
   private int[] T008B24_A11898Prd_numero ;
   private String[] T008B25_A396EmprCod ;
   private boolean[] T008B25_n396EmprCod ;
   private int[] T008B25_A11849Cte_numero ;
   private String[] T008B26_A396EmprCod ;
   private boolean[] T008B26_n396EmprCod ;
   private int[] T008B26_A11791Ap_numero ;
   private String[] T008B27_A396EmprCod ;
   private boolean[] T008B27_n396EmprCod ;
   private int[] T008B27_A3985CalBarCod ;
   private byte[] T008B27_A3986CalBarCodR ;
   private String[] T008B27_A3987CalBarCodP ;
   private String[] T008B28_A396EmprCod ;
   private boolean[] T008B28_n396EmprCod ;
   private java.util.Date[] T008B28_A5294InPTime ;
   private int[] T008B28_A652OpeCod ;
   private String[] T008B29_A396EmprCod ;
   private boolean[] T008B29_n396EmprCod ;
   private int[] T008B29_A129BarCod ;
   private boolean[] T008B29_n129BarCod ;
   private byte[] T008B29_A132BarCodReo ;
   private boolean[] T008B29_n132BarCodReo ;
   private String[] T008B29_A130BarCodPar ;
   private boolean[] T008B29_n130BarCodPar ;
   private int[] T008B29_A4118tinagrcod ;
   private byte[] T008B29_A4119tinagrreo ;
   private String[] T008B29_A4120tinagrpar ;
   private String[] T008B30_A396EmprCod ;
   private boolean[] T008B30_n396EmprCod ;
   private int[] T008B30_A129BarCod ;
   private boolean[] T008B30_n129BarCod ;
   private byte[] T008B30_A132BarCodReo ;
   private boolean[] T008B30_n132BarCodReo ;
   private String[] T008B30_A130BarCodPar ;
   private boolean[] T008B30_n130BarCodPar ;
   private int[] T008B30_A4080estagrcod ;
   private byte[] T008B30_A4081estagrreo ;
   private String[] T008B30_A4082estagrpar ;
   private String[] T008B31_A396EmprCod ;
   private boolean[] T008B31_n396EmprCod ;
   private int[] T008B31_A129BarCod ;
   private boolean[] T008B31_n129BarCod ;
   private byte[] T008B31_A132BarCodReo ;
   private boolean[] T008B31_n132BarCodReo ;
   private String[] T008B31_A130BarCodPar ;
   private boolean[] T008B31_n130BarCodPar ;
   private byte[] T008B31_A4075recestncol ;
   private byte[] T008B31_A4076recestnpro ;
   private String[] T008B32_A396EmprCod ;
   private boolean[] T008B32_n396EmprCod ;
   private String[] T008B32_A602MaqCod ;
   private String[] T008B32_A1142MaqFCod ;
   private short[] T008B32_A3068PlaEtaOrd ;
   private byte[] T008B32_A3069PlaEtaOrdA ;
   private int[] T008B32_A129BarCod ;
   private boolean[] T008B32_n129BarCod ;
   private byte[] T008B32_A132BarCodReo ;
   private boolean[] T008B32_n132BarCodReo ;
   private String[] T008B32_A130BarCodPar ;
   private boolean[] T008B32_n130BarCodPar ;
   private String[] T008B33_A396EmprCod ;
   private boolean[] T008B33_n396EmprCod ;
   private int[] T008B33_A129BarCod ;
   private boolean[] T008B33_n129BarCod ;
   private byte[] T008B33_A132BarCodReo ;
   private boolean[] T008B33_n132BarCodReo ;
   private String[] T008B33_A130BarCodPar ;
   private boolean[] T008B33_n130BarCodPar ;
   private short[] T008B33_A4846BarAudLin ;
   private String[] T008B34_A396EmprCod ;
   private boolean[] T008B34_n396EmprCod ;
   private int[] T008B34_A129BarCod ;
   private boolean[] T008B34_n129BarCod ;
   private byte[] T008B34_A132BarCodReo ;
   private boolean[] T008B34_n132BarCodReo ;
   private String[] T008B34_A130BarCodPar ;
   private boolean[] T008B34_n130BarCodPar ;
   private short[] T008B34_A3940BarEnsLin ;
   private String[] T008B35_A396EmprCod ;
   private boolean[] T008B35_n396EmprCod ;
   private int[] T008B35_A129BarCod ;
   private boolean[] T008B35_n129BarCod ;
   private byte[] T008B35_A132BarCodReo ;
   private boolean[] T008B35_n132BarCodReo ;
   private String[] T008B35_A130BarCodPar ;
   private boolean[] T008B35_n130BarCodPar ;
   private int[] T008B35_A3384RefBarCod ;
   private byte[] T008B35_A3385RefBarReo ;
   private String[] T008B35_A3386RefBarPar ;
   private String[] T008B36_A396EmprCod ;
   private boolean[] T008B36_n396EmprCod ;
   private int[] T008B36_A10914SolSalCod ;
   private String[] T008B37_A396EmprCod ;
   private boolean[] T008B37_n396EmprCod ;
   private int[] T008B37_A10364Ph_numero ;
   private String[] T008B38_A396EmprCod ;
   private boolean[] T008B38_n396EmprCod ;
   private int[] T008B38_A129BarCod ;
   private boolean[] T008B38_n129BarCod ;
   private byte[] T008B38_A132BarCodReo ;
   private boolean[] T008B38_n132BarCodReo ;
   private String[] T008B38_A130BarCodPar ;
   private boolean[] T008B38_n130BarCodPar ;
   private String[] T008B38_A10197ProEspCod ;
   private String[] T008B39_A396EmprCod ;
   private boolean[] T008B39_n396EmprCod ;
   private int[] T008B39_A129BarCod ;
   private boolean[] T008B39_n129BarCod ;
   private byte[] T008B39_A132BarCodReo ;
   private boolean[] T008B39_n132BarCodReo ;
   private String[] T008B39_A130BarCodPar ;
   private boolean[] T008B39_n130BarCodPar ;
   private int[] T008B39_A5322Dp_Nrecep ;
   private String[] T008B40_A396EmprCod ;
   private boolean[] T008B40_n396EmprCod ;
   private int[] T008B40_A129BarCod ;
   private boolean[] T008B40_n129BarCod ;
   private byte[] T008B40_A132BarCodReo ;
   private boolean[] T008B40_n132BarCodReo ;
   private String[] T008B40_A130BarCodPar ;
   private boolean[] T008B40_n130BarCodPar ;
   private int[] T008B40_A8569EntSecLn ;
   private String[] T008B41_A396EmprCod ;
   private boolean[] T008B41_n396EmprCod ;
   private int[] T008B41_A7434PLLNro ;
   private short[] T008B41_A7443LPLNro ;
   private short[] T008B41_A7459CPLCom ;
   private int[] T008B41_A129BarCod ;
   private boolean[] T008B41_n129BarCod ;
   private byte[] T008B41_A132BarCodReo ;
   private boolean[] T008B41_n132BarCodReo ;
   private String[] T008B41_A130BarCodPar ;
   private boolean[] T008B41_n130BarCodPar ;
   private String[] T008B42_A396EmprCod ;
   private boolean[] T008B42_n396EmprCod ;
   private int[] T008B42_A7145OSSCod ;
   private String[] T008B43_A396EmprCod ;
   private boolean[] T008B43_n396EmprCod ;
   private int[] T008B43_A7049OGSCod ;
   private String[] T008B44_A396EmprCod ;
   private boolean[] T008B44_n396EmprCod ;
   private int[] T008B44_A129BarCod ;
   private boolean[] T008B44_n129BarCod ;
   private byte[] T008B44_A132BarCodReo ;
   private boolean[] T008B44_n132BarCodReo ;
   private String[] T008B44_A130BarCodPar ;
   private boolean[] T008B44_n130BarCodPar ;
   private int[] T008B44_A6031Ac_Barcod ;
   private byte[] T008B44_A6032Ac_BarReo ;
   private String[] T008B44_A6033Ac_BarPar ;
   private String[] T008B45_A396EmprCod ;
   private boolean[] T008B45_n396EmprCod ;
   private int[] T008B45_A129BarCod ;
   private boolean[] T008B45_n129BarCod ;
   private byte[] T008B45_A132BarCodReo ;
   private boolean[] T008B45_n132BarCodReo ;
   private String[] T008B45_A130BarCodPar ;
   private boolean[] T008B45_n130BarCodPar ;
   private int[] T008B45_A5908PartPal ;
   private String[] T008B46_A396EmprCod ;
   private boolean[] T008B46_n396EmprCod ;
   private int[] T008B46_A129BarCod ;
   private boolean[] T008B46_n129BarCod ;
   private byte[] T008B46_A132BarCodReo ;
   private boolean[] T008B46_n132BarCodReo ;
   private String[] T008B46_A130BarCodPar ;
   private boolean[] T008B46_n130BarCodPar ;
   private byte[] T008B46_A2524DisComLin ;
   private String[] T008B46_A1056DisComCod ;
   private String[] T008B46_A1032FonCod ;
   private String[] T008B47_A396EmprCod ;
   private boolean[] T008B47_n396EmprCod ;
   private long[] T008B47_A1736AlbExtCod ;
   private int[] T008B47_A129BarCod ;
   private boolean[] T008B47_n129BarCod ;
   private byte[] T008B47_A132BarCodReo ;
   private boolean[] T008B47_n132BarCodReo ;
   private String[] T008B47_A130BarCodPar ;
   private boolean[] T008B47_n130BarCodPar ;
   private String[] T008B48_A396EmprCod ;
   private boolean[] T008B48_n396EmprCod ;
   private int[] T008B48_A129BarCod ;
   private boolean[] T008B48_n129BarCod ;
   private byte[] T008B48_A132BarCodReo ;
   private boolean[] T008B48_n132BarCodReo ;
   private String[] T008B48_A130BarCodPar ;
   private boolean[] T008B48_n130BarCodPar ;
   private int[] T008B48_A3753BarFoaCod ;
   private byte[] T008B48_A3754BarFoaReo ;
   private String[] T008B48_A3755BarFoaPar ;
   private String[] T008B49_A396EmprCod ;
   private boolean[] T008B49_n396EmprCod ;
   private int[] T008B49_A129BarCod ;
   private boolean[] T008B49_n129BarCod ;
   private byte[] T008B49_A132BarCodReo ;
   private boolean[] T008B49_n132BarCodReo ;
   private String[] T008B49_A130BarCodPar ;
   private boolean[] T008B49_n130BarCodPar ;
   private int[] T008B49_A3747BarPegCod ;
   private byte[] T008B49_A3748BarPegReo ;
   private String[] T008B49_A3749BarPegPar ;
   private String[] T008B50_A396EmprCod ;
   private boolean[] T008B50_n396EmprCod ;
   private int[] T008B50_A3253SolTraCod ;
   private String[] T008B51_A396EmprCod ;
   private boolean[] T008B51_n396EmprCod ;
   private int[] T008B51_A3235SolSubCod ;
   private String[] T008B52_A396EmprCod ;
   private boolean[] T008B52_n396EmprCod ;
   private int[] T008B52_A3218SolLuzCod ;
   private String[] T008B53_A396EmprCod ;
   private boolean[] T008B53_n396EmprCod ;
   private int[] T008B53_A3196SolFriCod ;
   private String[] T008B54_A396EmprCod ;
   private boolean[] T008B54_n396EmprCod ;
   private int[] T008B54_A3165SolPilCod ;
   private String[] T008B55_A396EmprCod ;
   private boolean[] T008B55_n396EmprCod ;
   private int[] T008B55_A129BarCod ;
   private boolean[] T008B55_n129BarCod ;
   private byte[] T008B55_A132BarCodReo ;
   private boolean[] T008B55_n132BarCodReo ;
   private String[] T008B55_A130BarCodPar ;
   private boolean[] T008B55_n130BarCodPar ;
   private short[] T008B55_A2872HAnRLinMaq ;
   private byte[] T008B55_A2873HAnRLinPro ;
   private short[] T008B55_A2874HAnRLin ;
   private byte[] T008B55_A2875HAnNumAny ;
   private String[] T008B56_A396EmprCod ;
   private boolean[] T008B56_n396EmprCod ;
   private String[] T008B56_A2817PlaTer ;
   private short[] T008B56_A2818PlaOrd ;
   private String[] T008B57_A396EmprCod ;
   private boolean[] T008B57_n396EmprCod ;
   private String[] T008B57_A2809MetTerCod ;
   private int[] T008B57_A129BarCod ;
   private boolean[] T008B57_n129BarCod ;
   private byte[] T008B57_A132BarCodReo ;
   private boolean[] T008B57_n132BarCodReo ;
   private String[] T008B57_A130BarCodPar ;
   private boolean[] T008B57_n130BarCodPar ;
   private String[] T008B58_A396EmprCod ;
   private boolean[] T008B58_n396EmprCod ;
   private int[] T008B58_A129BarCod ;
   private boolean[] T008B58_n129BarCod ;
   private byte[] T008B58_A132BarCodReo ;
   private boolean[] T008B58_n132BarCodReo ;
   private String[] T008B58_A130BarCodPar ;
   private boolean[] T008B58_n130BarCodPar ;
   private short[] T008B58_A2808RecLinMAL ;
   private byte[] T008B58_A1377RecNumAny ;
   private String[] T008B58_A719PrdNum ;
   private String[] T008B59_A396EmprCod ;
   private boolean[] T008B59_n396EmprCod ;
   private int[] T008B59_A129BarCod ;
   private boolean[] T008B59_n129BarCod ;
   private byte[] T008B59_A132BarCodReo ;
   private boolean[] T008B59_n132BarCodReo ;
   private String[] T008B59_A130BarCodPar ;
   private boolean[] T008B59_n130BarCodPar ;
   private short[] T008B59_A2804RecLinMaq ;
   private String[] T008B60_A396EmprCod ;
   private boolean[] T008B60_n396EmprCod ;
   private String[] T008B60_A2792TermiCod ;
   private int[] T008B60_A129BarCod ;
   private boolean[] T008B60_n129BarCod ;
   private byte[] T008B60_A132BarCodReo ;
   private boolean[] T008B60_n132BarCodReo ;
   private String[] T008B60_A130BarCodPar ;
   private boolean[] T008B60_n130BarCodPar ;
   private String[] T008B61_A396EmprCod ;
   private boolean[] T008B61_n396EmprCod ;
   private short[] T008B61_A2248ManCod ;
   private java.util.Date[] T008B61_A2711RpExHdFe ;
   private short[] T008B61_A2713RpExHdLi ;
   private String[] T008B62_A396EmprCod ;
   private boolean[] T008B62_n396EmprCod ;
   private short[] T008B62_A2248ManCod ;
   private String[] T008B62_A2689ExHdrFas ;
   private int[] T008B62_A2692ExHdrLin ;
   private String[] T008B63_A396EmprCod ;
   private boolean[] T008B63_n396EmprCod ;
   private int[] T008B63_A129BarCod ;
   private boolean[] T008B63_n129BarCod ;
   private byte[] T008B63_A132BarCodReo ;
   private boolean[] T008B63_n132BarCodReo ;
   private String[] T008B63_A130BarCodPar ;
   private boolean[] T008B63_n130BarCodPar ;
   private String[] T008B63_A2494BarDosPro ;
   private String[] T008B63_A719PrdNum ;
   private String[] T008B64_A396EmprCod ;
   private boolean[] T008B64_n396EmprCod ;
   private String[] T008B64_A602MaqCod ;
   private java.util.Date[] T008B64_A2461PlaFecTin ;
   private int[] T008B64_A129BarCod ;
   private boolean[] T008B64_n129BarCod ;
   private byte[] T008B64_A132BarCodReo ;
   private boolean[] T008B64_n132BarCodReo ;
   private String[] T008B64_A130BarCodPar ;
   private boolean[] T008B64_n130BarCodPar ;
   private String[] T008B65_A396EmprCod ;
   private boolean[] T008B65_n396EmprCod ;
   private int[] T008B65_A129BarCod ;
   private boolean[] T008B65_n129BarCod ;
   private byte[] T008B65_A132BarCodReo ;
   private boolean[] T008B65_n132BarCodReo ;
   private String[] T008B65_A130BarCodPar ;
   private boolean[] T008B65_n130BarCodPar ;
   private short[] T008B65_A2457BarObLin ;
   private String[] T008B66_A396EmprCod ;
   private boolean[] T008B66_n396EmprCod ;
   private int[] T008B66_A2406ExhAlbCod ;
   private int[] T008B66_A129BarCod ;
   private boolean[] T008B66_n129BarCod ;
   private byte[] T008B66_A132BarCodReo ;
   private boolean[] T008B66_n132BarCodReo ;
   private String[] T008B66_A130BarCodPar ;
   private boolean[] T008B66_n130BarCodPar ;
   private String[] T008B67_A396EmprCod ;
   private boolean[] T008B67_n396EmprCod ;
   private int[] T008B67_A2253SalExtAlb ;
   private int[] T008B67_A129BarCod ;
   private boolean[] T008B67_n129BarCod ;
   private byte[] T008B67_A132BarCodReo ;
   private boolean[] T008B67_n132BarCodReo ;
   private String[] T008B67_A130BarCodPar ;
   private boolean[] T008B67_n130BarCodPar ;
   private String[] T008B68_A396EmprCod ;
   private boolean[] T008B68_n396EmprCod ;
   private long[] T008B68_A30AlbProCod ;
   private int[] T008B68_A129BarCod ;
   private boolean[] T008B68_n129BarCod ;
   private byte[] T008B68_A132BarCodReo ;
   private boolean[] T008B68_n132BarCodReo ;
   private String[] T008B68_A130BarCodPar ;
   private boolean[] T008B68_n130BarCodPar ;
   private String[] T008B69_A396EmprCod ;
   private boolean[] T008B69_n396EmprCod ;
   private int[] T008B69_A1348SolColCod ;
   private String[] T008B70_A396EmprCod ;
   private boolean[] T008B70_n396EmprCod ;
   private int[] T008B70_A1333EstDimCod ;
   private String[] T008B71_A396EmprCod ;
   private boolean[] T008B71_n396EmprCod ;
   private int[] T008B71_A1314EnsLabCod ;
   private String[] T008B72_A396EmprCod ;
   private boolean[] T008B72_n396EmprCod ;
   private int[] T008B72_A129BarCod ;
   private boolean[] T008B72_n129BarCod ;
   private byte[] T008B72_A132BarCodReo ;
   private boolean[] T008B72_n132BarCodReo ;
   private String[] T008B72_A130BarCodPar ;
   private boolean[] T008B72_n130BarCodPar ;
   private byte[] T008B72_A906ObsReoLin ;
   private String[] T008B73_A396EmprCod ;
   private boolean[] T008B73_n396EmprCod ;
   private int[] T008B73_A859CumCodCont ;
   private String[] T008B74_A396EmprCod ;
   private boolean[] T008B74_n396EmprCod ;
   private String[] T008B74_A602MaqCod ;
   private java.util.Date[] T008B74_A558HisProFec ;
   private int[] T008B74_A561HisProLin ;
   private String[] T008B75_A396EmprCod ;
   private boolean[] T008B75_n396EmprCod ;
   private int[] T008B75_A252CliCod ;
   private boolean[] T008B75_n252CliCod ;
   private String[] T008B75_A494ForSer ;
   private String[] T008B75_A482ForColNom ;
   private int[] T008B75_A483ForColNum ;
   private byte[] T008B75_A831TipColCod ;
   private String[] T008B76_A396EmprCod ;
   private boolean[] T008B76_n396EmprCod ;
   private int[] T008B76_A129BarCod ;
   private boolean[] T008B76_n129BarCod ;
   private byte[] T008B76_A132BarCodReo ;
   private boolean[] T008B76_n132BarCodReo ;
   private String[] T008B76_A130BarCodPar ;
   private boolean[] T008B76_n130BarCodPar ;
   private String[] T008B76_A200BarPieCod ;
   private String[] T008B77_A396EmprCod ;
   private boolean[] T008B77_n396EmprCod ;
   private int[] T008B77_A129BarCod ;
   private boolean[] T008B77_n129BarCod ;
   private byte[] T008B77_A132BarCodReo ;
   private boolean[] T008B77_n132BarCodReo ;
   private String[] T008B77_A130BarCodPar ;
   private boolean[] T008B77_n130BarCodPar ;
   private byte[] T008B77_A188BarNotLin ;
   private String[] T008B78_A396EmprCod ;
   private boolean[] T008B78_n396EmprCod ;
   private int[] T008B78_A129BarCod ;
   private boolean[] T008B78_n129BarCod ;
   private byte[] T008B78_A132BarCodReo ;
   private boolean[] T008B78_n132BarCodReo ;
   private String[] T008B78_A130BarCodPar ;
   private boolean[] T008B78_n130BarCodPar ;
   private String[] T008B78_A758ProCod ;
   private String[] T008B79_A396EmprCod ;
   private boolean[] T008B79_n396EmprCod ;
   private int[] T008B79_A129BarCod ;
   private boolean[] T008B79_n129BarCod ;
   private byte[] T008B79_A132BarCodReo ;
   private boolean[] T008B79_n132BarCodReo ;
   private String[] T008B79_A130BarCodPar ;
   private boolean[] T008B79_n130BarCodPar ;
   private int[] T008B79_A119BarAgrCod ;
   private byte[] T008B79_A124BarAgrReo ;
   private String[] T008B79_A122BarAgrPar ;
   private String[] T008B81_A396EmprCod ;
   private boolean[] T008B81_n396EmprCod ;
   private int[] T008B81_A129BarCod ;
   private boolean[] T008B81_n129BarCod ;
   private byte[] T008B81_A132BarCodReo ;
   private boolean[] T008B81_n132BarCodReo ;
   private String[] T008B81_A130BarCodPar ;
   private boolean[] T008B81_n130BarCodPar ;
   private int[] T008B82_A129BarCod ;
   private boolean[] T008B82_n129BarCod ;
   private byte[] T008B82_A132BarCodReo ;
   private boolean[] T008B82_n132BarCodReo ;
   private String[] T008B82_A130BarCodPar ;
   private boolean[] T008B82_n130BarCodPar ;
   private short[] T008B82_A2444BarEnLin ;
   private String[] T008B82_A2451BarObsEnE ;
   private boolean[] T008B82_n2451BarObsEnE ;
   private String[] T008B82_A396EmprCod ;
   private boolean[] T008B82_n396EmprCod ;
   private String[] T008B83_A396EmprCod ;
   private boolean[] T008B83_n396EmprCod ;
   private int[] T008B83_A129BarCod ;
   private boolean[] T008B83_n129BarCod ;
   private byte[] T008B83_A132BarCodReo ;
   private boolean[] T008B83_n132BarCodReo ;
   private String[] T008B83_A130BarCodPar ;
   private boolean[] T008B83_n130BarCodPar ;
   private short[] T008B83_A2444BarEnLin ;
   private int[] T008B3_A129BarCod ;
   private boolean[] T008B3_n129BarCod ;
   private byte[] T008B3_A132BarCodReo ;
   private boolean[] T008B3_n132BarCodReo ;
   private String[] T008B3_A130BarCodPar ;
   private boolean[] T008B3_n130BarCodPar ;
   private short[] T008B3_A2444BarEnLin ;
   private String[] T008B3_A2451BarObsEnE ;
   private boolean[] T008B3_n2451BarObsEnE ;
   private String[] T008B3_A396EmprCod ;
   private boolean[] T008B3_n396EmprCod ;
   private int[] T008B2_A129BarCod ;
   private boolean[] T008B2_n129BarCod ;
   private byte[] T008B2_A132BarCodReo ;
   private boolean[] T008B2_n132BarCodReo ;
   private String[] T008B2_A130BarCodPar ;
   private boolean[] T008B2_n130BarCodPar ;
   private short[] T008B2_A2444BarEnLin ;
   private String[] T008B2_A2451BarObsEnE ;
   private boolean[] T008B2_n2451BarObsEnE ;
   private String[] T008B2_A396EmprCod ;
   private boolean[] T008B2_n396EmprCod ;
   private String[] T008B87_A396EmprCod ;
   private boolean[] T008B87_n396EmprCod ;
   private int[] T008B87_A129BarCod ;
   private boolean[] T008B87_n129BarCod ;
   private byte[] T008B87_A132BarCodReo ;
   private boolean[] T008B87_n132BarCodReo ;
   private String[] T008B87_A130BarCodPar ;
   private boolean[] T008B87_n130BarCodPar ;
   private short[] T008B87_A2444BarEnLin ;
   private String[] T008B88_A407EmprNom ;
   private boolean[] T008B88_n407EmprNom ;
   private java.math.BigDecimal[] T008B90_A166BarKgm ;
   private boolean[] T008B90_n166BarKgm ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdee2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdee2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdee2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdee2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdee2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T008B2", "SELECT BarCod, BarCodReo, BarCodPar, BarEnLin, BarObsEnE, EmprCod FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnLin = ?  FOR UPDATE OF BarObsEnE NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008B3", "SELECT BarCod, BarCodReo, BarCodPar, BarEnLin, BarObsEnE, EmprCod FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008B4", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarSer, BarNMtr, BarColNom, BarColNum, BarTipCol, BarDisNum, BarManCod, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, BarSer, BarNMtr, BarColNom, BarColNum, BarTipCol, BarDisNum, BarManCod, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarSer, BarNMtr, BarColNom, BarColNum, BarTipCol, BarDisNum, BarManCod, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B7", "SELECT CliCod, DisDes, PartCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B9", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B11", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.CliCod, TM1.BarSer, TM1.BarNMtr, TM1.BarColNom, TM1.BarColNum, TM1.BarTipCol, TM1.BarDisNum, TM1.BarManCod, TM1.BarFecEnE, TM1.BarBulEnE, TM1.BarKgEnE, TM1.BarEntEnE, TM1.BarEnULin, TM1.DisDes, TM1.EmprCod, T3.PartCod, COALESCE( T4.BarKgm, 0) AS BarKgm FROM (((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T008B15", "INSERT INTO TXPBARCAD(CliCod, DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarSer, BarNMtr, BarColNom, BarColNum, BarTipCol, BarDisNum, BarManCod, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, EmprCod, BarAgrEst, BarVolMaq, BarTipArt, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarNumPas, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T008B16", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, BarSer=?, BarNMtr=?, BarColNom=?, BarColNum=?, BarTipCol=?, BarDisNum=?, BarManCod=?, BarFecEnE=?, BarBulEnE=?, BarKgEnE=?, BarEntEnE=?, BarEnULin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T008B17", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T008B18", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B19", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B23", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B24", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B25", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B26", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B27", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B28", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B32", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B36", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B37", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B38", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B41", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B42", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B43", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B44", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B47", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B50", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B51", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B52", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B53", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B54", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B56", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B57", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B60", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B61", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B62", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B64", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B65", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B66", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B67", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B68", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B69", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B70", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B71", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B73", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B74", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B75", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T008B80", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T008B81", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008B82", "SELECT BarCod, BarCodReo, BarCodPar, BarEnLin, BarObsEnE, EmprCod FROM TXPBAROBE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarEnLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008B83", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T008B84", "INSERT INTO TXPBAROBE(BarCod, BarCodReo, BarCodPar, BarEnLin, BarObsEnE, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBAROBE")
         ,new UpdateCursor("T008B85", "UPDATE TXPBAROBE SET BarObsEnE=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnLin = ?", GX_NOMASK, "TXPBAROBE")
         ,new UpdateCursor("T008B86", "DELETE FROM TXPBAROBE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarEnLin = ?", GX_NOMASK, "TXPBAROBE")
         ,new ForEachCursor("T008B87", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008B88", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008B90", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 8);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(19, 30);
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(21, 1);
               ((String[]) buf[26])[0] = rslt.getString(22, 3);
               ((String[]) buf[27])[0] = rslt.getString(23, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 18 :
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
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 78 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 85 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
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
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
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
            case 9 :
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               stmt.setString(8, (String)parms[11], 6);
               stmt.setString(9, (String)parms[12], 16);
               stmt.setString(10, (String)parms[13], 10);
               stmt.setString(11, (String)parms[14], 13);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setByte(13, ((Number) parms[16]).byteValue());
               stmt.setString(14, (String)parms[17], 8);
               stmt.setShort(15, ((Number) parms[18]).shortValue());
               stmt.setDate(16, (java.util.Date)parms[19]);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[23], 2);
               }
               stmt.setString(19, (String)parms[24], 30);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[28], 3);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 4);
               stmt.setString(5, (String)parms[5], 6);
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 10);
               stmt.setString(8, (String)parms[8], 13);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               stmt.setString(11, (String)parms[11], 8);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setDate(13, (java.util.Date)parms[13]);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(16, (String)parms[18], 30);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[22], 3);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[24]).intValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[26]).byteValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[28], 1);
               }
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
            case 18 :
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 80 :
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
               stmt.setShort(4, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 30);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 3);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
               stmt.setShort(6, ((Number) parms[10]).shortValue());
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
               stmt.setShort(5, ((Number) parms[8]).shortValue());
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
      }
   }

}

