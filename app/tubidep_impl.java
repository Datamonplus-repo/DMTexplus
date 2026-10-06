package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tubidep_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "SALIDAS DE UBICACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tubidep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tubidep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tubidep_impl.class ));
   }

   public tubidep_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TUBIDEP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Recepcion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Nrecep_Internalname, GXutil.ltrim( localUtil.ntoc( A5322Dp_Nrecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Nrecep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5322Dp_Nrecep), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5322Dp_Nrecep), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Nrecep_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Nrecep_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Piezas HDR por Recepcion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_pzs_Internalname, GXutil.ltrim( localUtil.ntoc( A5891Dp_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_pzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5891Dp_pzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5891Dp_pzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_pzs_Jsonclick, 0, "", "", "", "", "", 1, edtDp_pzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kgs", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6008Dp_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Kgs_Enabled!=0) ? localUtil.format( A6008Dp_Kgs, "ZZZZZ9.99") : localUtil.format( A6008Dp_Kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Kgs_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Mts", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDp_Mts_Internalname, GXutil.ltrim( localUtil.ntoc( A5323Dp_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDp_Mts_Enabled!=0) ? localUtil.format( A5323Dp_Mts, "ZZZZZ9.99") : localUtil.format( A5323Dp_Mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDp_Mts_Jsonclick, 0, "", "", "", "", "", 1, edtDp_Mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TUBIDEP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TUBIDEP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TUBIDEP.htm");
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
      e1116J2 ();
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
            Z5322Dp_Nrecep = (int)(localUtil.ctol( httpContext.cgiGet( "Z5322Dp_Nrecep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5891Dp_pzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z5891Dp_pzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6008Dp_Kgs = localUtil.ctond( httpContext.cgiGet( "Z6008Dp_Kgs")) ;
            Z5323Dp_Mts = localUtil.ctond( httpContext.cgiGet( "Z5323Dp_Mts")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDp_Nrecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDp_Nrecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_NRECEP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_Nrecep_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5322Dp_Nrecep = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
            }
            else
            {
               A5322Dp_Nrecep = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_Nrecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_PZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_pzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5891Dp_pzs = 0 ;
               n5891Dp_pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
            }
            else
            {
               A5891Dp_pzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDp_pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5891Dp_pzs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_Kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6008Dp_Kgs = DecimalUtil.ZERO ;
               n6008Dp_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
            }
            else
            {
               A6008Dp_Kgs = localUtil.ctond( httpContext.cgiGet( edtDp_Kgs_Internalname)) ;
               n6008Dp_Kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DP_MTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDp_Mts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5323Dp_Mts = DecimalUtil.ZERO ;
               n5323Dp_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
            }
            else
            {
               A5323Dp_Mts = localUtil.ctond( httpContext.cgiGet( edtDp_Mts_Internalname)) ;
               n5323Dp_Mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A5322Dp_Nrecep = (int)(GXutil.lval( httpContext.GetPar( "Dp_Nrecep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
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
                        e1116J2 ();
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
            initAll16J1342( ) ;
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
      disableAttributes16J1342( ) ;
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

   public void confirm_16J0( )
   {
      beforeValidate16J1342( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16J1342( ) ;
         }
         else
         {
            checkExtendedTable16J1342( ) ;
            if ( AnyError == 0 )
            {
               zm16J1342( 2) ;
               zm16J1342( 3) ;
            }
            closeExtendedTableCursors16J1342( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues16J0( ) ;
      }
   }

   public void resetCaption16J0( )
   {
   }

   public void e1116J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tubidep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tubidep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tubidep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tubidep_impl.this.A396EmprCod = GXv_char2[0] ;
      tubidep_impl.this.AV11EmprNom = GXv_char3[0] ;
      tubidep_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm16J1342( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5891Dp_pzs = T016J3_A5891Dp_pzs[0] ;
            Z6008Dp_Kgs = T016J3_A6008Dp_Kgs[0] ;
            Z5323Dp_Mts = T016J3_A5323Dp_Mts[0] ;
         }
         else
         {
            Z5891Dp_pzs = A5891Dp_pzs ;
            Z6008Dp_Kgs = A6008Dp_Kgs ;
            Z5323Dp_Mts = A5323Dp_Mts ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         Z5891Dp_pzs = A5891Dp_pzs ;
         Z6008Dp_Kgs = A6008Dp_Kgs ;
         Z5323Dp_Mts = A5323Dp_Mts ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TUBIDEP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T016J4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016J4_A407EmprNom[0] ;
      n407EmprNom = T016J4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load16J1342( )
   {
      /* Using cursor T016J6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1342 = (short)(1) ;
         A5891Dp_pzs = T016J6_A5891Dp_pzs[0] ;
         n5891Dp_pzs = T016J6_n5891Dp_pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
         A6008Dp_Kgs = T016J6_A6008Dp_Kgs[0] ;
         n6008Dp_Kgs = T016J6_n6008Dp_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
         A5323Dp_Mts = T016J6_A5323Dp_Mts[0] ;
         n5323Dp_Mts = T016J6_n5323Dp_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
         A407EmprNom = T016J6_A407EmprNom[0] ;
         n407EmprNom = T016J6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm16J1342( -1) ;
      }
      pr_default.close(4);
      onLoadActions16J1342( ) ;
   }

   public void onLoadActions16J1342( )
   {
   }

   public void checkExtendedTable16J1342( )
   {
      nIsDirty_1342 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T016J5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors16J1342( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T016J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey16J1342( )
   {
      /* Using cursor T016J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1342 = (short)(1) ;
      }
      else
      {
         RcdFound1342 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16J1342( 1) ;
         RcdFound1342 = (short)(1) ;
         A5322Dp_Nrecep = T016J3_A5322Dp_Nrecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         A5891Dp_pzs = T016J3_A5891Dp_pzs[0] ;
         n5891Dp_pzs = T016J3_n5891Dp_pzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
         A6008Dp_Kgs = T016J3_A6008Dp_Kgs[0] ;
         n6008Dp_Kgs = T016J3_n6008Dp_Kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
         A5323Dp_Mts = T016J3_A5323Dp_Mts[0] ;
         n5323Dp_Mts = T016J3_n5323Dp_Mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
         A129BarCod = T016J3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T016J3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T016J3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z5322Dp_Nrecep = A5322Dp_Nrecep ;
         sMode1342 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16J1342( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1342 = (short)(0) ;
            initializeNonKey16J1342( ) ;
         }
         Gx_mode = sMode1342 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1342 = (short)(0) ;
         initializeNonKey16J1342( ) ;
         sMode1342 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1342 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey16J1342( ) ;
      if ( RcdFound1342 == 0 )
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
      RcdFound1342 = (short)(0) ;
      /* Using cursor T016J9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A5322Dp_Nrecep), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T016J9_A129BarCod[0] < A129BarCod ) || ( T016J9_A129BarCod[0] == A129BarCod ) && ( T016J9_A132BarCodReo[0] < A132BarCodReo ) || ( T016J9_A132BarCodReo[0] == A132BarCodReo ) && ( T016J9_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T016J9_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T016J9_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016J9_A132BarCodReo[0] == A132BarCodReo ) && ( T016J9_A129BarCod[0] == A129BarCod ) && ( T016J9_A5322Dp_Nrecep[0] < A5322Dp_Nrecep ) ) && ( GXutil.strcmp(T016J9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T016J9_A129BarCod[0] > A129BarCod ) || ( T016J9_A129BarCod[0] == A129BarCod ) && ( T016J9_A132BarCodReo[0] > A132BarCodReo ) || ( T016J9_A132BarCodReo[0] == A132BarCodReo ) && ( T016J9_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T016J9_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T016J9_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016J9_A132BarCodReo[0] == A132BarCodReo ) && ( T016J9_A129BarCod[0] == A129BarCod ) && ( T016J9_A5322Dp_Nrecep[0] > A5322Dp_Nrecep ) ) && ( GXutil.strcmp(T016J9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T016J9_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T016J9_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T016J9_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A5322Dp_Nrecep = T016J9_A5322Dp_Nrecep[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
            RcdFound1342 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1342 = (short)(0) ;
      /* Using cursor T016J10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Integer.valueOf(A5322Dp_Nrecep), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T016J10_A129BarCod[0] > A129BarCod ) || ( T016J10_A129BarCod[0] == A129BarCod ) && ( T016J10_A132BarCodReo[0] > A132BarCodReo ) || ( T016J10_A132BarCodReo[0] == A132BarCodReo ) && ( T016J10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T016J10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T016J10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016J10_A132BarCodReo[0] == A132BarCodReo ) && ( T016J10_A129BarCod[0] == A129BarCod ) && ( T016J10_A5322Dp_Nrecep[0] > A5322Dp_Nrecep ) ) && ( GXutil.strcmp(T016J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T016J10_A129BarCod[0] < A129BarCod ) || ( T016J10_A129BarCod[0] == A129BarCod ) && ( T016J10_A132BarCodReo[0] < A132BarCodReo ) || ( T016J10_A132BarCodReo[0] == A132BarCodReo ) && ( T016J10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T016J10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T016J10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T016J10_A132BarCodReo[0] == A132BarCodReo ) && ( T016J10_A129BarCod[0] == A129BarCod ) && ( T016J10_A5322Dp_Nrecep[0] < A5322Dp_Nrecep ) ) && ( GXutil.strcmp(T016J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T016J10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T016J10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T016J10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A5322Dp_Nrecep = T016J10_A5322Dp_Nrecep[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
            RcdFound1342 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16J1342( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16J1342( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1342 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A5322Dp_Nrecep = Z5322Dp_Nrecep ;
               httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16J1342( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16J1342( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16J1342( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A5322Dp_Nrecep = Z5322Dp_Nrecep ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey16J1342( ) ;
      if ( RcdFound1342 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A5322Dp_Nrecep = Z5322Dp_Nrecep ;
            httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A5322Dp_Nrecep != Z5322Dp_Nrecep ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tubidep");
      GX_FocusControl = edtDp_pzs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_16J0( ) ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDp_pzs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16J1342( ) ;
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_pzs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16J1342( ) ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_pzs_Internalname ;
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
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_pzs_Internalname ;
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
      scanStart16J1342( ) ;
      if ( RcdFound1342 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1342 != 0 )
         {
            scanNext16J1342( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDp_pzs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16J1342( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16J1342( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDEP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z5891Dp_pzs != T016J2_A5891Dp_pzs[0] ) || ( DecimalUtil.compareTo(Z6008Dp_Kgs, T016J2_A6008Dp_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z5323Dp_Mts, T016J2_A5323Dp_Mts[0]) != 0 ) )
         {
            if ( Z5891Dp_pzs != T016J2_A5891Dp_pzs[0] )
            {
               GXutil.writeLogln("tubidep:[seudo value changed for attri]"+"Dp_pzs");
               GXutil.writeLogRaw("Old: ",Z5891Dp_pzs);
               GXutil.writeLogRaw("Current: ",T016J2_A5891Dp_pzs[0]);
            }
            if ( DecimalUtil.compareTo(Z6008Dp_Kgs, T016J2_A6008Dp_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("tubidep:[seudo value changed for attri]"+"Dp_Kgs");
               GXutil.writeLogRaw("Old: ",Z6008Dp_Kgs);
               GXutil.writeLogRaw("Current: ",T016J2_A6008Dp_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z5323Dp_Mts, T016J2_A5323Dp_Mts[0]) != 0 )
            {
               GXutil.writeLogln("tubidep:[seudo value changed for attri]"+"Dp_Mts");
               GXutil.writeLogRaw("Old: ",Z5323Dp_Mts);
               GXutil.writeLogRaw("Current: ",T016J2_A5323Dp_Mts[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUBIDEP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16J1342( )
   {
      beforeValidate16J1342( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16J1342( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16J1342( 0) ;
         checkOptimisticConcurrency16J1342( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16J1342( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16J1342( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016J11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A5322Dp_Nrecep), Boolean.valueOf(n5891Dp_pzs), Integer.valueOf(A5891Dp_pzs), Boolean.valueOf(n6008Dp_Kgs), A6008Dp_Kgs, Boolean.valueOf(n5323Dp_Mts), A5323Dp_Mts, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption16J0( ) ;
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
            load16J1342( ) ;
         }
         endLevel16J1342( ) ;
      }
      closeExtendedTableCursors16J1342( ) ;
   }

   public void update16J1342( )
   {
      beforeValidate16J1342( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16J1342( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16J1342( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16J1342( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16J1342( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016J12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n5891Dp_pzs), Integer.valueOf(A5891Dp_pzs), Boolean.valueOf(n6008Dp_Kgs), A6008Dp_Kgs, Boolean.valueOf(n5323Dp_Mts), A5323Dp_Mts, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUBIDEP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16J1342( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption16J0( ) ;
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
         endLevel16J1342( ) ;
      }
      closeExtendedTableCursors16J1342( ) ;
   }

   public void deferredUpdate16J1342( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16J1342( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16J1342( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16J1342( ) ;
         afterConfirm16J1342( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16J1342( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016J13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1342 == 0 )
                     {
                        initAll16J1342( ) ;
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
                     resetCaption16J0( ) ;
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
      sMode1342 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16J1342( ) ;
      Gx_mode = sMode1342 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16J1342( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016J14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDPG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel16J1342( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16J1342( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tubidep");
         if ( AnyError == 0 )
         {
            confirmValues16J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tubidep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16J1342( )
   {
      /* Scan By routine */
      /* Using cursor T016J15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1342 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1342 = (short)(1) ;
         A129BarCod = T016J15_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T016J15_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T016J15_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A5322Dp_Nrecep = T016J15_A5322Dp_Nrecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16J1342( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1342 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1342 = (short)(1) ;
         A129BarCod = T016J15_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T016J15_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T016J15_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A5322Dp_Nrecep = T016J15_A5322Dp_Nrecep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      }
   }

   public void scanEnd16J1342( )
   {
      pr_default.close(13);
   }

   public void afterConfirm16J1342( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16J1342( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16J1342( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16J1342( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16J1342( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16J1342( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16J1342( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtDp_Nrecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Nrecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Nrecep_Enabled), 5, 0), true);
      edtDp_pzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_pzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_pzs_Enabled), 5, 0), true);
      edtDp_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Kgs_Enabled), 5, 0), true);
      edtDp_Mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDp_Mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDp_Mts_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes16J1342( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues16J0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tubidep", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5322Dp_Nrecep", GXutil.ltrim( localUtil.ntoc( Z5322Dp_Nrecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( Z5891Dp_pzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( Z6008Dp_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( Z5323Dp_Mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tubidep", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TUBIDEP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "SALIDAS DE UBICACIONES", "") ;
   }

   public void initializeNonKey16J1342( )
   {
      A5891Dp_pzs = 0 ;
      n5891Dp_pzs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5891Dp_pzs), 6, 0));
      A6008Dp_Kgs = DecimalUtil.ZERO ;
      n6008Dp_Kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrimstr( A6008Dp_Kgs, 9, 2));
      A5323Dp_Mts = DecimalUtil.ZERO ;
      n5323Dp_Mts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrimstr( A5323Dp_Mts, 9, 2));
      Z5891Dp_pzs = 0 ;
      Z6008Dp_Kgs = DecimalUtil.ZERO ;
      Z5323Dp_Mts = DecimalUtil.ZERO ;
   }

   public void initAll16J1342( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A5322Dp_Nrecep = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5322Dp_Nrecep", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5322Dp_Nrecep), 8, 0));
      initializeNonKey16J1342( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241544755", true, true);
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
      httpContext.AddJavascriptSource("tubidep.js", "?20268241544756", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDp_Nrecep_Internalname = "DP_NRECEP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDp_pzs_Internalname = "DP_PZS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtDp_Kgs_Internalname = "DP_KGS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtDp_Mts_Internalname = "DP_MTS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "SALIDAS DE UBICACIONES", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtDp_Mts_Jsonclick = "" ;
      edtDp_Mts_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Mts_Enabled = 1 ;
      edtDp_Kgs_Jsonclick = "" ;
      edtDp_Kgs_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Kgs_Enabled = 1 ;
      edtDp_pzs_Jsonclick = "" ;
      edtDp_pzs_Backcolor = (int)(0xFFFFFF) ;
      edtDp_pzs_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDp_Nrecep_Jsonclick = "" ;
      edtDp_Nrecep_Backcolor = (int)(0xFFFFFF) ;
      edtDp_Nrecep_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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
      /* Using cursor T016J16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016J16_A407EmprNom[0] ;
      n407EmprNom = T016J16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T016J17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtDp_pzs_Internalname ;
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
      /* Using cursor T016J17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Dp_nrecep( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( A5891Dp_pzs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( A6008Dp_Kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( A5323Dp_Mts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5322Dp_Nrecep", GXutil.ltrim( localUtil.ntoc( Z5322Dp_Nrecep, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5891Dp_pzs", GXutil.ltrim( localUtil.ntoc( Z5891Dp_pzs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6008Dp_Kgs", GXutil.ltrim( localUtil.ntoc( Z6008Dp_Kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5323Dp_Mts", GXutil.ltrim( localUtil.ntoc( Z5323Dp_Mts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_DP_NRECEP","{handler:'valid_Dp_nrecep',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A5322Dp_Nrecep',fld:'DP_NRECEP',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_DP_NRECEP",",oparms:[{av:'A5891Dp_pzs',fld:'DP_PZS',pic:'ZZZZZ9'},{av:'A6008Dp_Kgs',fld:'DP_KGS',pic:'ZZZZZ9.99'},{av:'A5323Dp_Mts',fld:'DP_MTS',pic:'ZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z5322Dp_Nrecep'},{av:'Z5891Dp_pzs'},{av:'Z6008Dp_Kgs'},{av:'Z5323Dp_Mts'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z6008Dp_Kgs = DecimalUtil.ZERO ;
      Z5323Dp_Mts = DecimalUtil.ZERO ;
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
      lblTextblock7_Jsonclick = "" ;
      A6008Dp_Kgs = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A5323Dp_Mts = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A407EmprNom = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      T016J4_A407EmprNom = new String[] {""} ;
      T016J4_n407EmprNom = new boolean[] {false} ;
      T016J6_A5322Dp_Nrecep = new int[1] ;
      T016J6_A5891Dp_pzs = new int[1] ;
      T016J6_n5891Dp_pzs = new boolean[] {false} ;
      T016J6_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J6_n6008Dp_Kgs = new boolean[] {false} ;
      T016J6_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J6_n5323Dp_Mts = new boolean[] {false} ;
      T016J6_A407EmprNom = new String[] {""} ;
      T016J6_n407EmprNom = new boolean[] {false} ;
      T016J6_A396EmprCod = new String[] {""} ;
      T016J6_A129BarCod = new int[1] ;
      T016J6_A132BarCodReo = new byte[1] ;
      T016J6_A130BarCodPar = new String[] {""} ;
      T016J5_A396EmprCod = new String[] {""} ;
      T016J7_A396EmprCod = new String[] {""} ;
      T016J8_A396EmprCod = new String[] {""} ;
      T016J8_A129BarCod = new int[1] ;
      T016J8_A132BarCodReo = new byte[1] ;
      T016J8_A130BarCodPar = new String[] {""} ;
      T016J8_A5322Dp_Nrecep = new int[1] ;
      T016J3_A5322Dp_Nrecep = new int[1] ;
      T016J3_A5891Dp_pzs = new int[1] ;
      T016J3_n5891Dp_pzs = new boolean[] {false} ;
      T016J3_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J3_n6008Dp_Kgs = new boolean[] {false} ;
      T016J3_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J3_n5323Dp_Mts = new boolean[] {false} ;
      T016J3_A396EmprCod = new String[] {""} ;
      T016J3_A129BarCod = new int[1] ;
      T016J3_A132BarCodReo = new byte[1] ;
      T016J3_A130BarCodPar = new String[] {""} ;
      sMode1342 = "" ;
      T016J9_A396EmprCod = new String[] {""} ;
      T016J9_A129BarCod = new int[1] ;
      T016J9_A132BarCodReo = new byte[1] ;
      T016J9_A130BarCodPar = new String[] {""} ;
      T016J9_A5322Dp_Nrecep = new int[1] ;
      T016J10_A396EmprCod = new String[] {""} ;
      T016J10_A129BarCod = new int[1] ;
      T016J10_A132BarCodReo = new byte[1] ;
      T016J10_A130BarCodPar = new String[] {""} ;
      T016J10_A5322Dp_Nrecep = new int[1] ;
      T016J2_A5322Dp_Nrecep = new int[1] ;
      T016J2_A5891Dp_pzs = new int[1] ;
      T016J2_n5891Dp_pzs = new boolean[] {false} ;
      T016J2_A6008Dp_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J2_n6008Dp_Kgs = new boolean[] {false} ;
      T016J2_A5323Dp_Mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016J2_n5323Dp_Mts = new boolean[] {false} ;
      T016J2_A396EmprCod = new String[] {""} ;
      T016J2_A129BarCod = new int[1] ;
      T016J2_A132BarCodReo = new byte[1] ;
      T016J2_A130BarCodPar = new String[] {""} ;
      T016J14_A396EmprCod = new String[] {""} ;
      T016J14_A129BarCod = new int[1] ;
      T016J14_A132BarCodReo = new byte[1] ;
      T016J14_A130BarCodPar = new String[] {""} ;
      T016J14_A5322Dp_Nrecep = new int[1] ;
      T016J14_A4978Dp_Ubi = new String[] {""} ;
      T016J14_A4979Dp_Plg = new short[1] ;
      T016J15_A396EmprCod = new String[] {""} ;
      T016J15_A129BarCod = new int[1] ;
      T016J15_A132BarCodReo = new byte[1] ;
      T016J15_A130BarCodPar = new String[] {""} ;
      T016J15_A5322Dp_Nrecep = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T016J16_A407EmprNom = new String[] {""} ;
      T016J16_n407EmprNom = new boolean[] {false} ;
      T016J17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ6008Dp_Kgs = DecimalUtil.ZERO ;
      ZZ5323Dp_Mts = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tubidep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tubidep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tubidep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tubidep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tubidep__default(),
         new Object[] {
             new Object[] {
            T016J2_A5322Dp_Nrecep, T016J2_A5891Dp_pzs, T016J2_n5891Dp_pzs, T016J2_A6008Dp_Kgs, T016J2_n6008Dp_Kgs, T016J2_A5323Dp_Mts, T016J2_n5323Dp_Mts, T016J2_A396EmprCod, T016J2_A129BarCod, T016J2_A132BarCodReo,
            T016J2_A130BarCodPar
            }
            , new Object[] {
            T016J3_A5322Dp_Nrecep, T016J3_A5891Dp_pzs, T016J3_n5891Dp_pzs, T016J3_A6008Dp_Kgs, T016J3_n6008Dp_Kgs, T016J3_A5323Dp_Mts, T016J3_n5323Dp_Mts, T016J3_A396EmprCod, T016J3_A129BarCod, T016J3_A132BarCodReo,
            T016J3_A130BarCodPar
            }
            , new Object[] {
            T016J4_A407EmprNom, T016J4_n407EmprNom
            }
            , new Object[] {
            T016J5_A396EmprCod
            }
            , new Object[] {
            T016J6_A5322Dp_Nrecep, T016J6_A5891Dp_pzs, T016J6_n5891Dp_pzs, T016J6_A6008Dp_Kgs, T016J6_n6008Dp_Kgs, T016J6_A5323Dp_Mts, T016J6_n5323Dp_Mts, T016J6_A407EmprNom, T016J6_n407EmprNom, T016J6_A396EmprCod,
            T016J6_A129BarCod, T016J6_A132BarCodReo, T016J6_A130BarCodPar
            }
            , new Object[] {
            T016J7_A396EmprCod
            }
            , new Object[] {
            T016J8_A396EmprCod, T016J8_A129BarCod, T016J8_A132BarCodReo, T016J8_A130BarCodPar, T016J8_A5322Dp_Nrecep
            }
            , new Object[] {
            T016J9_A396EmprCod, T016J9_A129BarCod, T016J9_A132BarCodReo, T016J9_A130BarCodPar, T016J9_A5322Dp_Nrecep
            }
            , new Object[] {
            T016J10_A396EmprCod, T016J10_A129BarCod, T016J10_A132BarCodReo, T016J10_A130BarCodPar, T016J10_A5322Dp_Nrecep
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016J14_A396EmprCod, T016J14_A129BarCod, T016J14_A132BarCodReo, T016J14_A130BarCodPar, T016J14_A5322Dp_Nrecep, T016J14_A4978Dp_Ubi, T016J14_A4979Dp_Plg
            }
            , new Object[] {
            T016J15_A396EmprCod, T016J15_A129BarCod, T016J15_A132BarCodReo, T016J15_A130BarCodPar, T016J15_A5322Dp_Nrecep
            }
            , new Object[] {
            T016J16_A407EmprNom, T016J16_n407EmprNom
            }
            , new Object[] {
            T016J17_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TUBIDEP" ;
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1342 ;
   private short nIsDirty_1342 ;
   private int Z129BarCod ;
   private int Z5322Dp_Nrecep ;
   private int Z5891Dp_pzs ;
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
   private int A5322Dp_Nrecep ;
   private int edtDp_Nrecep_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A5891Dp_pzs ;
   private int edtDp_pzs_Enabled ;
   private int edtDp_Kgs_Enabled ;
   private int edtDp_Mts_Enabled ;
   private int edtEmprNom_Enabled ;
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
   private int edtEmprNom_Backcolor ;
   private int edtDp_Mts_Backcolor ;
   private int edtDp_Kgs_Backcolor ;
   private int edtDp_pzs_Backcolor ;
   private int edtDp_Nrecep_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ5322Dp_Nrecep ;
   private int ZZ5891Dp_pzs ;
   private java.math.BigDecimal Z6008Dp_Kgs ;
   private java.math.BigDecimal Z5323Dp_Mts ;
   private java.math.BigDecimal A6008Dp_Kgs ;
   private java.math.BigDecimal A5323Dp_Mts ;
   private java.math.BigDecimal ZZ6008Dp_Kgs ;
   private java.math.BigDecimal ZZ5323Dp_Mts ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
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
   private String edtDp_Nrecep_Internalname ;
   private String edtDp_Nrecep_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDp_pzs_Internalname ;
   private String edtDp_pzs_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtDp_Kgs_Internalname ;
   private String edtDp_Kgs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtDp_Mts_Internalname ;
   private String edtDp_Mts_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String sMode1342 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5891Dp_pzs ;
   private boolean n6008Dp_Kgs ;
   private boolean n5323Dp_Mts ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T016J4_A407EmprNom ;
   private boolean[] T016J4_n407EmprNom ;
   private int[] T016J6_A5322Dp_Nrecep ;
   private int[] T016J6_A5891Dp_pzs ;
   private boolean[] T016J6_n5891Dp_pzs ;
   private java.math.BigDecimal[] T016J6_A6008Dp_Kgs ;
   private boolean[] T016J6_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016J6_A5323Dp_Mts ;
   private boolean[] T016J6_n5323Dp_Mts ;
   private String[] T016J6_A407EmprNom ;
   private boolean[] T016J6_n407EmprNom ;
   private String[] T016J6_A396EmprCod ;
   private int[] T016J6_A129BarCod ;
   private byte[] T016J6_A132BarCodReo ;
   private String[] T016J6_A130BarCodPar ;
   private String[] T016J5_A396EmprCod ;
   private String[] T016J7_A396EmprCod ;
   private String[] T016J8_A396EmprCod ;
   private int[] T016J8_A129BarCod ;
   private byte[] T016J8_A132BarCodReo ;
   private String[] T016J8_A130BarCodPar ;
   private int[] T016J8_A5322Dp_Nrecep ;
   private int[] T016J3_A5322Dp_Nrecep ;
   private int[] T016J3_A5891Dp_pzs ;
   private boolean[] T016J3_n5891Dp_pzs ;
   private java.math.BigDecimal[] T016J3_A6008Dp_Kgs ;
   private boolean[] T016J3_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016J3_A5323Dp_Mts ;
   private boolean[] T016J3_n5323Dp_Mts ;
   private String[] T016J3_A396EmprCod ;
   private int[] T016J3_A129BarCod ;
   private byte[] T016J3_A132BarCodReo ;
   private String[] T016J3_A130BarCodPar ;
   private String[] T016J9_A396EmprCod ;
   private int[] T016J9_A129BarCod ;
   private byte[] T016J9_A132BarCodReo ;
   private String[] T016J9_A130BarCodPar ;
   private int[] T016J9_A5322Dp_Nrecep ;
   private String[] T016J10_A396EmprCod ;
   private int[] T016J10_A129BarCod ;
   private byte[] T016J10_A132BarCodReo ;
   private String[] T016J10_A130BarCodPar ;
   private int[] T016J10_A5322Dp_Nrecep ;
   private int[] T016J2_A5322Dp_Nrecep ;
   private int[] T016J2_A5891Dp_pzs ;
   private boolean[] T016J2_n5891Dp_pzs ;
   private java.math.BigDecimal[] T016J2_A6008Dp_Kgs ;
   private boolean[] T016J2_n6008Dp_Kgs ;
   private java.math.BigDecimal[] T016J2_A5323Dp_Mts ;
   private boolean[] T016J2_n5323Dp_Mts ;
   private String[] T016J2_A396EmprCod ;
   private int[] T016J2_A129BarCod ;
   private byte[] T016J2_A132BarCodReo ;
   private String[] T016J2_A130BarCodPar ;
   private String[] T016J14_A396EmprCod ;
   private int[] T016J14_A129BarCod ;
   private byte[] T016J14_A132BarCodReo ;
   private String[] T016J14_A130BarCodPar ;
   private int[] T016J14_A5322Dp_Nrecep ;
   private String[] T016J14_A4978Dp_Ubi ;
   private short[] T016J14_A4979Dp_Plg ;
   private String[] T016J15_A396EmprCod ;
   private int[] T016J15_A129BarCod ;
   private byte[] T016J15_A132BarCodReo ;
   private String[] T016J15_A130BarCodPar ;
   private int[] T016J15_A5322Dp_Nrecep ;
   private String[] T016J16_A407EmprNom ;
   private boolean[] T016J16_n407EmprNom ;
   private String[] T016J17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tubidep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tubidep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016J2", "SELECT Dp_Nrecep, Dp_pzs, Dp_Kgs, Dp_Mts, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?  FOR UPDATE OF Dp_pzs, Dp_Kgs, Dp_Mts NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J3", "SELECT Dp_Nrecep, Dp_pzs, Dp_Kgs, Dp_Mts, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J5", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Dp_Nrecep, TM1.Dp_pzs, TM1.Dp_Kgs, TM1.Dp_Mts, T2.EmprNom, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPUBIDEP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.Dp_Nrecep = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.Dp_Nrecep ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and Dp_Nrecep > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016J10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and Dp_Nrecep < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, Dp_Nrecep DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016J11", "INSERT INTO TXPUBIDEP(Dp_Nrecep, Dp_pzs, Dp_Kgs, Dp_Mts, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPUBIDEP")
         ,new UpdateCursor("T016J12", "UPDATE TXPUBIDEP SET Dp_pzs=?, Dp_Kgs=?, Dp_Mts=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK, "TXPUBIDEP")
         ,new UpdateCursor("T016J13", "DELETE FROM TXPUBIDEP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK, "TXPUBIDEP")
         ,new ForEachCursor("T016J14", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg FROM TXPUBIDPG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016J15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016J17", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               return;
            case 10 :
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
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
      }
   }

}

