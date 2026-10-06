package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrntipcol_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttrntipcol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrntipcol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrntipcol_impl.class ));
   }

   public ttrntipcol_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrnTIPCOL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Merma 4", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMer4_Internalname, GXutil.ltrim( localUtil.ntoc( A3811TipMer4, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMer4_Enabled!=0) ? localUtil.format( A3811TipMer4, "ZZ9.99") : localUtil.format( A3811TipMer4, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMer4_Jsonclick, 0, "", "", "", "", "", 1, edtTipMer4_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Merma 3", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMer3_Internalname, GXutil.ltrim( localUtil.ntoc( A3810TipMer3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMer3_Enabled!=0) ? localUtil.format( A3810TipMer3, "ZZ9.99") : localUtil.format( A3810TipMer3, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMer3_Jsonclick, 0, "", "", "", "", "", 1, edtTipMer3_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Merma Anti olio", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMer2_Internalname, GXutil.ltrim( localUtil.ntoc( A3809TipMer2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMer2_Enabled!=0) ? localUtil.format( A3809TipMer2, "ZZ9.99") : localUtil.format( A3809TipMer2, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMer2_Jsonclick, 0, "", "", "", "", "", 1, edtTipMer2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Merma Pilling", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMer1_Internalname, GXutil.ltrim( localUtil.ntoc( A3808TipMer1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMer1_Enabled!=0) ? localUtil.format( A3808TipMer1, "ZZ9.99") : localUtil.format( A3808TipMer1, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMer1_Jsonclick, 0, "", "", "", "", "", 1, edtTipMer1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Merma", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMer_Internalname, GXutil.ltrim( localUtil.ntoc( A3593TipMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMer_Enabled!=0) ? localUtil.format( A3593TipMer, "ZZ9.99") : localUtil.format( A3593TipMer, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMer_Jsonclick, 0, "", "", "", "", "", 1, edtTipMer_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Margen Comercial", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMarCom_Internalname, GXutil.ltrim( localUtil.ntoc( A3592TipMarCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMarCom_Enabled!=0) ? localUtil.format( A3592TipMarCom, "ZZ9.99") : localUtil.format( A3592TipMarCom, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMarCom_Jsonclick, 0, "", "", "", "", "", 1, edtTipMarCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Precio Maximo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipPreMax_Internalname, GXutil.ltrim( localUtil.ntoc( A3591TipPreMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipPreMax_Enabled!=0) ? localUtil.format( A3591TipPreMax, "ZZZZZ9.999") : localUtil.format( A3591TipPreMax, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPreMax_Jsonclick, 0, "", "", "", "", "", 1, edtTipPreMax_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Precio Minimo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipPreMin_Internalname, GXutil.ltrim( localUtil.ntoc( A3590TipPreMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipPreMin_Enabled!=0) ? localUtil.format( A3590TipPreMin, "ZZZZZ9.999") : localUtil.format( A3590TipPreMin, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPreMin_Jsonclick, 0, "", "", "", "", "", 1, edtTipPreMin_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Opcion Cliente", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipOpcCli_Internalname, GXutil.rtrim( A3561TipOpcCli), GXutil.rtrim( localUtil.format( A3561TipOpcCli, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipOpcCli_Jsonclick, 0, "", "", "", "", "", 1, edtTipOpcCli_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnTIPCOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnTIPCOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrnTIPCOL.htm");
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
      e111FB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3811TipMer4 = localUtil.ctond( httpContext.cgiGet( "Z3811TipMer4")) ;
            Z3810TipMer3 = localUtil.ctond( httpContext.cgiGet( "Z3810TipMer3")) ;
            Z3809TipMer2 = localUtil.ctond( httpContext.cgiGet( "Z3809TipMer2")) ;
            Z3808TipMer1 = localUtil.ctond( httpContext.cgiGet( "Z3808TipMer1")) ;
            Z3593TipMer = localUtil.ctond( httpContext.cgiGet( "Z3593TipMer")) ;
            Z3592TipMarCom = localUtil.ctond( httpContext.cgiGet( "Z3592TipMarCom")) ;
            Z3591TipPreMax = localUtil.ctond( httpContext.cgiGet( "Z3591TipPreMax")) ;
            Z3590TipPreMin = localUtil.ctond( httpContext.cgiGet( "Z3590TipPreMin")) ;
            Z3561TipOpcCli = httpContext.cgiGet( "Z3561TipOpcCli") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMer4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMer4_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMER4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMer4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3811TipMer4 = DecimalUtil.ZERO ;
               n3811TipMer4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrimstr( A3811TipMer4, 6, 2));
            }
            else
            {
               A3811TipMer4 = localUtil.ctond( httpContext.cgiGet( edtTipMer4_Internalname)) ;
               n3811TipMer4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrimstr( A3811TipMer4, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMer3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMer3_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMER3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMer3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3810TipMer3 = DecimalUtil.ZERO ;
               n3810TipMer3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrimstr( A3810TipMer3, 6, 2));
            }
            else
            {
               A3810TipMer3 = localUtil.ctond( httpContext.cgiGet( edtTipMer3_Internalname)) ;
               n3810TipMer3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrimstr( A3810TipMer3, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMer2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMer2_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMER2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMer2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3809TipMer2 = DecimalUtil.ZERO ;
               n3809TipMer2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrimstr( A3809TipMer2, 6, 2));
            }
            else
            {
               A3809TipMer2 = localUtil.ctond( httpContext.cgiGet( edtTipMer2_Internalname)) ;
               n3809TipMer2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrimstr( A3809TipMer2, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMer1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMer1_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMER1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMer1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3808TipMer1 = DecimalUtil.ZERO ;
               n3808TipMer1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrimstr( A3808TipMer1, 6, 2));
            }
            else
            {
               A3808TipMer1 = localUtil.ctond( httpContext.cgiGet( edtTipMer1_Internalname)) ;
               n3808TipMer1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrimstr( A3808TipMer1, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMer_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMer_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3593TipMer = DecimalUtil.ZERO ;
               n3593TipMer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrimstr( A3593TipMer, 6, 2));
            }
            else
            {
               A3593TipMer = localUtil.ctond( httpContext.cgiGet( edtTipMer_Internalname)) ;
               n3593TipMer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrimstr( A3593TipMer, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipMarCom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipMarCom_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPMARCOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMarCom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3592TipMarCom = DecimalUtil.ZERO ;
               n3592TipMarCom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrimstr( A3592TipMarCom, 6, 2));
            }
            else
            {
               A3592TipMarCom = localUtil.ctond( httpContext.cgiGet( edtTipMarCom_Internalname)) ;
               n3592TipMarCom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrimstr( A3592TipMarCom, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipPreMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipPreMax_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPPREMAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipPreMax_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3591TipPreMax = DecimalUtil.ZERO ;
               n3591TipPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrimstr( A3591TipPreMax, 12, 5));
            }
            else
            {
               A3591TipPreMax = localUtil.ctond( httpContext.cgiGet( edtTipPreMax_Internalname)) ;
               n3591TipPreMax = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrimstr( A3591TipPreMax, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTipPreMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTipPreMin_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPPREMIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipPreMin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3590TipPreMin = DecimalUtil.ZERO ;
               n3590TipPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrimstr( A3590TipPreMin, 12, 5));
            }
            else
            {
               A3590TipPreMin = localUtil.ctond( httpContext.cgiGet( edtTipPreMin_Internalname)) ;
               n3590TipPreMin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrimstr( A3590TipPreMin, 12, 5));
            }
            A3561TipOpcCli = GXutil.upper( httpContext.cgiGet( edtTipOpcCli_Internalname)) ;
            n3561TipOpcCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3561TipOpcCli", A3561TipOpcCli);
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
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
                        e111FB2 ();
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
            initAll1FB101( ) ;
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
      disableAttributes1FB101( ) ;
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

   public void confirm_1FB0( )
   {
      beforeValidate1FB101( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FB101( ) ;
         }
         else
         {
            checkExtendedTable1FB101( ) ;
            if ( AnyError == 0 )
            {
               zm1FB101( 3) ;
            }
            closeExtendedTableCursors1FB101( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1FB0( ) ;
      }
   }

   public void resetCaption1FB0( )
   {
   }

   public void e111FB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrntipcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttrntipcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrntipcol_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrntipcol_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrntipcol_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrntipcol_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FB101( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3811TipMer4 = T01FB3_A3811TipMer4[0] ;
            Z3810TipMer3 = T01FB3_A3810TipMer3[0] ;
            Z3809TipMer2 = T01FB3_A3809TipMer2[0] ;
            Z3808TipMer1 = T01FB3_A3808TipMer1[0] ;
            Z3593TipMer = T01FB3_A3593TipMer[0] ;
            Z3592TipMarCom = T01FB3_A3592TipMarCom[0] ;
            Z3591TipPreMax = T01FB3_A3591TipPreMax[0] ;
            Z3590TipPreMin = T01FB3_A3590TipPreMin[0] ;
            Z3561TipOpcCli = T01FB3_A3561TipOpcCli[0] ;
         }
         else
         {
            Z3811TipMer4 = A3811TipMer4 ;
            Z3810TipMer3 = A3810TipMer3 ;
            Z3809TipMer2 = A3809TipMer2 ;
            Z3808TipMer1 = A3808TipMer1 ;
            Z3593TipMer = A3593TipMer ;
            Z3592TipMarCom = A3592TipMarCom ;
            Z3591TipPreMax = A3591TipPreMax ;
            Z3590TipPreMin = A3590TipPreMin ;
            Z3561TipOpcCli = A3561TipOpcCli ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z831TipColCod = A831TipColCod ;
         Z3811TipMer4 = A3811TipMer4 ;
         Z3810TipMer3 = A3810TipMer3 ;
         Z3809TipMer2 = A3809TipMer2 ;
         Z3808TipMer1 = A3808TipMer1 ;
         Z3593TipMer = A3593TipMer ;
         Z3592TipMarCom = A3592TipMarCom ;
         Z3591TipPreMax = A3591TipPreMax ;
         Z3590TipPreMin = A3590TipPreMin ;
         Z3561TipOpcCli = A3561TipOpcCli ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTrnTIPCOL" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01FB4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FB4_A407EmprNom[0] ;
      n407EmprNom = T01FB4_n407EmprNom[0] ;
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

   public void load1FB101( )
   {
      /* Using cursor T01FB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A407EmprNom = T01FB5_A407EmprNom[0] ;
         n407EmprNom = T01FB5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3811TipMer4 = T01FB5_A3811TipMer4[0] ;
         n3811TipMer4 = T01FB5_n3811TipMer4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrimstr( A3811TipMer4, 6, 2));
         A3810TipMer3 = T01FB5_A3810TipMer3[0] ;
         n3810TipMer3 = T01FB5_n3810TipMer3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrimstr( A3810TipMer3, 6, 2));
         A3809TipMer2 = T01FB5_A3809TipMer2[0] ;
         n3809TipMer2 = T01FB5_n3809TipMer2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrimstr( A3809TipMer2, 6, 2));
         A3808TipMer1 = T01FB5_A3808TipMer1[0] ;
         n3808TipMer1 = T01FB5_n3808TipMer1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrimstr( A3808TipMer1, 6, 2));
         A3593TipMer = T01FB5_A3593TipMer[0] ;
         n3593TipMer = T01FB5_n3593TipMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrimstr( A3593TipMer, 6, 2));
         A3592TipMarCom = T01FB5_A3592TipMarCom[0] ;
         n3592TipMarCom = T01FB5_n3592TipMarCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrimstr( A3592TipMarCom, 6, 2));
         A3591TipPreMax = T01FB5_A3591TipPreMax[0] ;
         n3591TipPreMax = T01FB5_n3591TipPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrimstr( A3591TipPreMax, 12, 5));
         A3590TipPreMin = T01FB5_A3590TipPreMin[0] ;
         n3590TipPreMin = T01FB5_n3590TipPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrimstr( A3590TipPreMin, 12, 5));
         A3561TipOpcCli = T01FB5_A3561TipOpcCli[0] ;
         n3561TipOpcCli = T01FB5_n3561TipOpcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3561TipOpcCli", A3561TipOpcCli);
         zm1FB101( -2) ;
      }
      pr_default.close(3);
      onLoadActions1FB101( ) ;
   }

   public void onLoadActions1FB101( )
   {
   }

   public void checkExtendedTable1FB101( )
   {
      nIsDirty_101 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A3561TipOpcCli, "S") == 0 ) || ( GXutil.strcmp(A3561TipOpcCli, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Opcion Cliente", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "TIPOPCCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipOpcCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1FB101( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FB101( )
   {
      /* Using cursor T01FB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound101 = (short)(1) ;
      }
      else
      {
         RcdFound101 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FB101( 2) ;
         RcdFound101 = (short)(1) ;
         A831TipColCod = T01FB3_A831TipColCod[0] ;
         n831TipColCod = T01FB3_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A3811TipMer4 = T01FB3_A3811TipMer4[0] ;
         n3811TipMer4 = T01FB3_n3811TipMer4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrimstr( A3811TipMer4, 6, 2));
         A3810TipMer3 = T01FB3_A3810TipMer3[0] ;
         n3810TipMer3 = T01FB3_n3810TipMer3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrimstr( A3810TipMer3, 6, 2));
         A3809TipMer2 = T01FB3_A3809TipMer2[0] ;
         n3809TipMer2 = T01FB3_n3809TipMer2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrimstr( A3809TipMer2, 6, 2));
         A3808TipMer1 = T01FB3_A3808TipMer1[0] ;
         n3808TipMer1 = T01FB3_n3808TipMer1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrimstr( A3808TipMer1, 6, 2));
         A3593TipMer = T01FB3_A3593TipMer[0] ;
         n3593TipMer = T01FB3_n3593TipMer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrimstr( A3593TipMer, 6, 2));
         A3592TipMarCom = T01FB3_A3592TipMarCom[0] ;
         n3592TipMarCom = T01FB3_n3592TipMarCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrimstr( A3592TipMarCom, 6, 2));
         A3591TipPreMax = T01FB3_A3591TipPreMax[0] ;
         n3591TipPreMax = T01FB3_n3591TipPreMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrimstr( A3591TipPreMax, 12, 5));
         A3590TipPreMin = T01FB3_A3590TipPreMin[0] ;
         n3590TipPreMin = T01FB3_n3590TipPreMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrimstr( A3590TipPreMin, 12, 5));
         A3561TipOpcCli = T01FB3_A3561TipOpcCli[0] ;
         n3561TipOpcCli = T01FB3_n3561TipOpcCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3561TipOpcCli", A3561TipOpcCli);
         Z396EmprCod = A396EmprCod ;
         Z831TipColCod = A831TipColCod ;
         sMode101 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FB101( ) ;
         if ( AnyError == 1 )
         {
            RcdFound101 = (short)(0) ;
            initializeNonKey1FB101( ) ;
         }
         Gx_mode = sMode101 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound101 = (short)(0) ;
         initializeNonKey1FB101( ) ;
         sMode101 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode101 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1FB101( ) ;
      if ( RcdFound101 == 0 )
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
      RcdFound101 = (short)(0) ;
      /* Using cursor T01FB7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01FB7_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T01FB7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01FB7_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T01FB7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A831TipColCod = T01FB7_A831TipColCod[0] ;
            n831TipColCod = T01FB7_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound101 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound101 = (short)(0) ;
      /* Using cursor T01FB8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01FB8_A831TipColCod[0] > A831TipColCod ) ) && ( GXutil.strcmp(T01FB8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01FB8_A831TipColCod[0] < A831TipColCod ) ) && ( GXutil.strcmp(T01FB8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A831TipColCod = T01FB8_A831TipColCod[0] ;
            n831TipColCod = T01FB8_n831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            RcdFound101 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FB101( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipColCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FB101( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound101 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               A831TipColCod = Z831TipColCod ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FB101( ) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FB101( ) ;
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
                  GX_FocusControl = edtTipColCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FB101( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
      {
         A831TipColCod = Z831TipColCod ;
         n831TipColCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipColCod_Internalname ;
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
      getKey1FB101( ) ;
      if ( RcdFound101 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
         {
            A831TipColCod = Z831TipColCod ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A831TipColCod != Z831TipColCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrntipcol");
      GX_FocusControl = edtTipMer4_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FB0( ) ;
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
      if ( RcdFound101 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTipMer4_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FB101( ) ;
      if ( RcdFound101 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipMer4_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FB101( ) ;
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
      if ( RcdFound101 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipMer4_Internalname ;
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
      if ( RcdFound101 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipMer4_Internalname ;
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
      scanStart1FB101( ) ;
      if ( RcdFound101 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound101 != 0 )
         {
            scanNext1FB101( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTipMer4_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FB101( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FB101( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCOL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3811TipMer4, T01FB2_A3811TipMer4[0]) != 0 ) || ( DecimalUtil.compareTo(Z3810TipMer3, T01FB2_A3810TipMer3[0]) != 0 ) || ( DecimalUtil.compareTo(Z3809TipMer2, T01FB2_A3809TipMer2[0]) != 0 ) || ( DecimalUtil.compareTo(Z3808TipMer1, T01FB2_A3808TipMer1[0]) != 0 ) || ( DecimalUtil.compareTo(Z3593TipMer, T01FB2_A3593TipMer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3592TipMarCom, T01FB2_A3592TipMarCom[0]) != 0 ) || ( DecimalUtil.compareTo(Z3591TipPreMax, T01FB2_A3591TipPreMax[0]) != 0 ) || ( DecimalUtil.compareTo(Z3590TipPreMin, T01FB2_A3590TipPreMin[0]) != 0 ) || ( GXutil.strcmp(Z3561TipOpcCli, T01FB2_A3561TipOpcCli[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3811TipMer4, T01FB2_A3811TipMer4[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMer4");
               GXutil.writeLogRaw("Old: ",Z3811TipMer4);
               GXutil.writeLogRaw("Current: ",T01FB2_A3811TipMer4[0]);
            }
            if ( DecimalUtil.compareTo(Z3810TipMer3, T01FB2_A3810TipMer3[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMer3");
               GXutil.writeLogRaw("Old: ",Z3810TipMer3);
               GXutil.writeLogRaw("Current: ",T01FB2_A3810TipMer3[0]);
            }
            if ( DecimalUtil.compareTo(Z3809TipMer2, T01FB2_A3809TipMer2[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMer2");
               GXutil.writeLogRaw("Old: ",Z3809TipMer2);
               GXutil.writeLogRaw("Current: ",T01FB2_A3809TipMer2[0]);
            }
            if ( DecimalUtil.compareTo(Z3808TipMer1, T01FB2_A3808TipMer1[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMer1");
               GXutil.writeLogRaw("Old: ",Z3808TipMer1);
               GXutil.writeLogRaw("Current: ",T01FB2_A3808TipMer1[0]);
            }
            if ( DecimalUtil.compareTo(Z3593TipMer, T01FB2_A3593TipMer[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMer");
               GXutil.writeLogRaw("Old: ",Z3593TipMer);
               GXutil.writeLogRaw("Current: ",T01FB2_A3593TipMer[0]);
            }
            if ( DecimalUtil.compareTo(Z3592TipMarCom, T01FB2_A3592TipMarCom[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipMarCom");
               GXutil.writeLogRaw("Old: ",Z3592TipMarCom);
               GXutil.writeLogRaw("Current: ",T01FB2_A3592TipMarCom[0]);
            }
            if ( DecimalUtil.compareTo(Z3591TipPreMax, T01FB2_A3591TipPreMax[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipPreMax");
               GXutil.writeLogRaw("Old: ",Z3591TipPreMax);
               GXutil.writeLogRaw("Current: ",T01FB2_A3591TipPreMax[0]);
            }
            if ( DecimalUtil.compareTo(Z3590TipPreMin, T01FB2_A3590TipPreMin[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipPreMin");
               GXutil.writeLogRaw("Old: ",Z3590TipPreMin);
               GXutil.writeLogRaw("Current: ",T01FB2_A3590TipPreMin[0]);
            }
            if ( GXutil.strcmp(Z3561TipOpcCli, T01FB2_A3561TipOpcCli[0]) != 0 )
            {
               GXutil.writeLogln("ttrntipcol:[seudo value changed for attri]"+"TipOpcCli");
               GXutil.writeLogRaw("Old: ",Z3561TipOpcCli);
               GXutil.writeLogRaw("Current: ",T01FB2_A3561TipOpcCli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPCOL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FB101( )
   {
      beforeValidate1FB101( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FB101( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FB101( 0) ;
         checkOptimisticConcurrency1FB101( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FB101( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FB101( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FB9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Boolean.valueOf(n3811TipMer4), A3811TipMer4, Boolean.valueOf(n3810TipMer3), A3810TipMer3, Boolean.valueOf(n3809TipMer2), A3809TipMer2, Boolean.valueOf(n3808TipMer1), A3808TipMer1, Boolean.valueOf(n3593TipMer), A3593TipMer, Boolean.valueOf(n3592TipMarCom), A3592TipMarCom, Boolean.valueOf(n3591TipPreMax), A3591TipPreMax, Boolean.valueOf(n3590TipPreMin), A3590TipPreMin, Boolean.valueOf(n3561TipOpcCli), A3561TipOpcCli, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption1FB0( ) ;
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
            load1FB101( ) ;
         }
         endLevel1FB101( ) ;
      }
      closeExtendedTableCursors1FB101( ) ;
   }

   public void update1FB101( )
   {
      beforeValidate1FB101( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FB101( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FB101( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FB101( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FB101( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FB10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n3811TipMer4), A3811TipMer4, Boolean.valueOf(n3810TipMer3), A3810TipMer3, Boolean.valueOf(n3809TipMer2), A3809TipMer2, Boolean.valueOf(n3808TipMer1), A3808TipMer1, Boolean.valueOf(n3593TipMer), A3593TipMer, Boolean.valueOf(n3592TipMarCom), A3592TipMarCom, Boolean.valueOf(n3591TipPreMax), A3591TipPreMax, Boolean.valueOf(n3590TipPreMin), A3590TipPreMin, Boolean.valueOf(n3561TipOpcCli), A3561TipOpcCli, A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPCOL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FB101( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1FB0( ) ;
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
         endLevel1FB101( ) ;
      }
      closeExtendedTableCursors1FB101( ) ;
   }

   public void deferredUpdate1FB101( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FB101( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FB101( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FB101( ) ;
         afterConfirm1FB101( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FB101( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FB11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPCOL");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound101 == 0 )
                     {
                        initAll1FB101( ) ;
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
                     resetCaption1FB0( ) ;
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
      sMode101 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FB101( ) ;
      Gx_mode = sMode101 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FB101( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FB12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GFMTC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01FB13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01FB14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FB15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01FB16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01FB17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01FB18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01FB19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01FB20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel1FB101( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FB101( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrntipcol");
         if ( AnyError == 0 )
         {
            confirmValues1FB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrntipcol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FB101( )
   {
      /* Scan By routine */
      /* Using cursor T01FB21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound101 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A831TipColCod = T01FB21_A831TipColCod[0] ;
         n831TipColCod = T01FB21_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FB101( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound101 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound101 = (short)(1) ;
         A831TipColCod = T01FB21_A831TipColCod[0] ;
         n831TipColCod = T01FB21_n831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
   }

   public void scanEnd1FB101( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1FB101( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FB101( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FB101( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FB101( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FB101( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FB101( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FB101( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtTipMer4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMer4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMer4_Enabled), 5, 0), true);
      edtTipMer3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMer3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMer3_Enabled), 5, 0), true);
      edtTipMer2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMer2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMer2_Enabled), 5, 0), true);
      edtTipMer1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMer1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMer1_Enabled), 5, 0), true);
      edtTipMer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMer_Enabled), 5, 0), true);
      edtTipMarCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMarCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMarCom_Enabled), 5, 0), true);
      edtTipPreMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipPreMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPreMax_Enabled), 5, 0), true);
      edtTipPreMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipPreMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPreMin_Enabled), 5, 0), true);
      edtTipOpcCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipOpcCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipOpcCli_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1FB101( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1FB0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrntipcol", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3811TipMer4", GXutil.ltrim( localUtil.ntoc( Z3811TipMer4, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3810TipMer3", GXutil.ltrim( localUtil.ntoc( Z3810TipMer3, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3809TipMer2", GXutil.ltrim( localUtil.ntoc( Z3809TipMer2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3808TipMer1", GXutil.ltrim( localUtil.ntoc( Z3808TipMer1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3593TipMer", GXutil.ltrim( localUtil.ntoc( Z3593TipMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3592TipMarCom", GXutil.ltrim( localUtil.ntoc( Z3592TipMarCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3591TipPreMax", GXutil.ltrim( localUtil.ntoc( Z3591TipPreMax, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3590TipPreMin", GXutil.ltrim( localUtil.ntoc( Z3590TipPreMin, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3561TipOpcCli", GXutil.rtrim( Z3561TipOpcCli));
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
      return formatLink("app.ttrntipcol", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrnTIPCOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") ;
   }

   public void initializeNonKey1FB101( )
   {
      A3811TipMer4 = DecimalUtil.ZERO ;
      n3811TipMer4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrimstr( A3811TipMer4, 6, 2));
      A3810TipMer3 = DecimalUtil.ZERO ;
      n3810TipMer3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrimstr( A3810TipMer3, 6, 2));
      A3809TipMer2 = DecimalUtil.ZERO ;
      n3809TipMer2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrimstr( A3809TipMer2, 6, 2));
      A3808TipMer1 = DecimalUtil.ZERO ;
      n3808TipMer1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrimstr( A3808TipMer1, 6, 2));
      A3593TipMer = DecimalUtil.ZERO ;
      n3593TipMer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrimstr( A3593TipMer, 6, 2));
      A3592TipMarCom = DecimalUtil.ZERO ;
      n3592TipMarCom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrimstr( A3592TipMarCom, 6, 2));
      A3591TipPreMax = DecimalUtil.ZERO ;
      n3591TipPreMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrimstr( A3591TipPreMax, 12, 5));
      A3590TipPreMin = DecimalUtil.ZERO ;
      n3590TipPreMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrimstr( A3590TipPreMin, 12, 5));
      A3561TipOpcCli = "" ;
      n3561TipOpcCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3561TipOpcCli", A3561TipOpcCli);
      Z3811TipMer4 = DecimalUtil.ZERO ;
      Z3810TipMer3 = DecimalUtil.ZERO ;
      Z3809TipMer2 = DecimalUtil.ZERO ;
      Z3808TipMer1 = DecimalUtil.ZERO ;
      Z3593TipMer = DecimalUtil.ZERO ;
      Z3592TipMarCom = DecimalUtil.ZERO ;
      Z3591TipPreMax = DecimalUtil.ZERO ;
      Z3590TipPreMin = DecimalUtil.ZERO ;
      Z3561TipOpcCli = "" ;
   }

   public void initAll1FB101( )
   {
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      initializeNonKey1FB101( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241571167", true, true);
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
      httpContext.AddJavascriptSource("ttrntipcol.js", "?20268241571167", false, true);
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
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTipMer4_Internalname = "TIPMER4" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTipMer3_Internalname = "TIPMER3" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipMer2_Internalname = "TIPMER2" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipMer1_Internalname = "TIPMER1" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTipMer_Internalname = "TIPMER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipMarCom_Internalname = "TIPMARCOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTipPreMax_Internalname = "TIPPREMAX" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtTipPreMin_Internalname = "TIPPREMIN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtTipOpcCli_Internalname = "TIPOPCCLI" ;
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
      Form.setCaption( httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTipOpcCli_Jsonclick = "" ;
      edtTipOpcCli_Backcolor = (int)(0xFFFFFF) ;
      edtTipOpcCli_Enabled = 1 ;
      edtTipPreMin_Jsonclick = "" ;
      edtTipPreMin_Backcolor = (int)(0xFFFFFF) ;
      edtTipPreMin_Enabled = 1 ;
      edtTipPreMax_Jsonclick = "" ;
      edtTipPreMax_Backcolor = (int)(0xFFFFFF) ;
      edtTipPreMax_Enabled = 1 ;
      edtTipMarCom_Jsonclick = "" ;
      edtTipMarCom_Backcolor = (int)(0xFFFFFF) ;
      edtTipMarCom_Enabled = 1 ;
      edtTipMer_Jsonclick = "" ;
      edtTipMer_Backcolor = (int)(0xFFFFFF) ;
      edtTipMer_Enabled = 1 ;
      edtTipMer1_Jsonclick = "" ;
      edtTipMer1_Backcolor = (int)(0xFFFFFF) ;
      edtTipMer1_Enabled = 1 ;
      edtTipMer2_Jsonclick = "" ;
      edtTipMer2_Backcolor = (int)(0xFFFFFF) ;
      edtTipMer2_Enabled = 1 ;
      edtTipMer3_Jsonclick = "" ;
      edtTipMer3_Backcolor = (int)(0xFFFFFF) ;
      edtTipMer3_Enabled = 1 ;
      edtTipMer4_Jsonclick = "" ;
      edtTipMer4_Backcolor = (int)(0xFFFFFF) ;
      edtTipMer4_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01FB22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FB22_A407EmprNom[0] ;
      n407EmprNom = T01FB22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      GX_FocusControl = edtTipMer4_Internalname ;
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

   public void valid_Tipcolcod( )
   {
      n831TipColCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3811TipMer4", GXutil.ltrim( localUtil.ntoc( A3811TipMer4, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3810TipMer3", GXutil.ltrim( localUtil.ntoc( A3810TipMer3, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3809TipMer2", GXutil.ltrim( localUtil.ntoc( A3809TipMer2, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3808TipMer1", GXutil.ltrim( localUtil.ntoc( A3808TipMer1, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3593TipMer", GXutil.ltrim( localUtil.ntoc( A3593TipMer, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3592TipMarCom", GXutil.ltrim( localUtil.ntoc( A3592TipMarCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3591TipPreMax", GXutil.ltrim( localUtil.ntoc( A3591TipPreMax, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3590TipPreMin", GXutil.ltrim( localUtil.ntoc( A3590TipPreMin, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3561TipOpcCli", GXutil.rtrim( A3561TipOpcCli));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3811TipMer4", GXutil.ltrim( localUtil.ntoc( Z3811TipMer4, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3810TipMer3", GXutil.ltrim( localUtil.ntoc( Z3810TipMer3, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3809TipMer2", GXutil.ltrim( localUtil.ntoc( Z3809TipMer2, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3808TipMer1", GXutil.ltrim( localUtil.ntoc( Z3808TipMer1, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3593TipMer", GXutil.ltrim( localUtil.ntoc( Z3593TipMer, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3592TipMarCom", GXutil.ltrim( localUtil.ntoc( Z3592TipMarCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3591TipPreMax", GXutil.ltrim( localUtil.ntoc( Z3591TipPreMax, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3590TipPreMin", GXutil.ltrim( localUtil.ntoc( Z3590TipPreMin, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3561TipOpcCli", GXutil.rtrim( Z3561TipOpcCli));
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
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3811TipMer4',fld:'TIPMER4',pic:'ZZ9.99'},{av:'A3810TipMer3',fld:'TIPMER3',pic:'ZZ9.99'},{av:'A3809TipMer2',fld:'TIPMER2',pic:'ZZ9.99'},{av:'A3808TipMer1',fld:'TIPMER1',pic:'ZZ9.99'},{av:'A3593TipMer',fld:'TIPMER',pic:'ZZ9.99'},{av:'A3592TipMarCom',fld:'TIPMARCOM',pic:'ZZ9.99'},{av:'A3591TipPreMax',fld:'TIPPREMAX',pic:'ZZZZZ9.999'},{av:'A3590TipPreMin',fld:'TIPPREMIN',pic:'ZZZZZ9.999'},{av:'A3561TipOpcCli',fld:'TIPOPCCLI',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z831TipColCod'},{av:'Z407EmprNom'},{av:'Z3811TipMer4'},{av:'Z3810TipMer3'},{av:'Z3809TipMer2'},{av:'Z3808TipMer1'},{av:'Z3593TipMer'},{av:'Z3592TipMarCom'},{av:'Z3591TipPreMax'},{av:'Z3590TipPreMin'},{av:'Z3561TipOpcCli'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TIPOPCCLI","{handler:'valid_Tipopccli',iparms:[]");
      setEventMetadata("VALID_TIPOPCCLI",",oparms:[]}");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3811TipMer4 = DecimalUtil.ZERO ;
      Z3810TipMer3 = DecimalUtil.ZERO ;
      Z3809TipMer2 = DecimalUtil.ZERO ;
      Z3808TipMer1 = DecimalUtil.ZERO ;
      Z3593TipMer = DecimalUtil.ZERO ;
      Z3592TipMarCom = DecimalUtil.ZERO ;
      Z3591TipPreMax = DecimalUtil.ZERO ;
      Z3590TipPreMin = DecimalUtil.ZERO ;
      Z3561TipOpcCli = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A3811TipMer4 = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A3810TipMer3 = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A3809TipMer2 = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A3808TipMer1 = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A3593TipMer = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A3592TipMarCom = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A3591TipPreMax = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A3590TipPreMin = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A3561TipOpcCli = "" ;
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
      T01FB4_A407EmprNom = new String[] {""} ;
      T01FB4_n407EmprNom = new boolean[] {false} ;
      T01FB5_A831TipColCod = new byte[1] ;
      T01FB5_n831TipColCod = new boolean[] {false} ;
      T01FB5_A407EmprNom = new String[] {""} ;
      T01FB5_n407EmprNom = new boolean[] {false} ;
      T01FB5_A3811TipMer4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3811TipMer4 = new boolean[] {false} ;
      T01FB5_A3810TipMer3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3810TipMer3 = new boolean[] {false} ;
      T01FB5_A3809TipMer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3809TipMer2 = new boolean[] {false} ;
      T01FB5_A3808TipMer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3808TipMer1 = new boolean[] {false} ;
      T01FB5_A3593TipMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3593TipMer = new boolean[] {false} ;
      T01FB5_A3592TipMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3592TipMarCom = new boolean[] {false} ;
      T01FB5_A3591TipPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3591TipPreMax = new boolean[] {false} ;
      T01FB5_A3590TipPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB5_n3590TipPreMin = new boolean[] {false} ;
      T01FB5_A3561TipOpcCli = new String[] {""} ;
      T01FB5_n3561TipOpcCli = new boolean[] {false} ;
      T01FB5_A396EmprCod = new String[] {""} ;
      T01FB6_A396EmprCod = new String[] {""} ;
      T01FB6_A831TipColCod = new byte[1] ;
      T01FB6_n831TipColCod = new boolean[] {false} ;
      T01FB3_A831TipColCod = new byte[1] ;
      T01FB3_n831TipColCod = new boolean[] {false} ;
      T01FB3_A3811TipMer4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3811TipMer4 = new boolean[] {false} ;
      T01FB3_A3810TipMer3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3810TipMer3 = new boolean[] {false} ;
      T01FB3_A3809TipMer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3809TipMer2 = new boolean[] {false} ;
      T01FB3_A3808TipMer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3808TipMer1 = new boolean[] {false} ;
      T01FB3_A3593TipMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3593TipMer = new boolean[] {false} ;
      T01FB3_A3592TipMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3592TipMarCom = new boolean[] {false} ;
      T01FB3_A3591TipPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3591TipPreMax = new boolean[] {false} ;
      T01FB3_A3590TipPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB3_n3590TipPreMin = new boolean[] {false} ;
      T01FB3_A3561TipOpcCli = new String[] {""} ;
      T01FB3_n3561TipOpcCli = new boolean[] {false} ;
      T01FB3_A396EmprCod = new String[] {""} ;
      sMode101 = "" ;
      T01FB7_A396EmprCod = new String[] {""} ;
      T01FB7_A831TipColCod = new byte[1] ;
      T01FB7_n831TipColCod = new boolean[] {false} ;
      T01FB8_A396EmprCod = new String[] {""} ;
      T01FB8_A831TipColCod = new byte[1] ;
      T01FB8_n831TipColCod = new boolean[] {false} ;
      T01FB2_A831TipColCod = new byte[1] ;
      T01FB2_n831TipColCod = new boolean[] {false} ;
      T01FB2_A3811TipMer4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3811TipMer4 = new boolean[] {false} ;
      T01FB2_A3810TipMer3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3810TipMer3 = new boolean[] {false} ;
      T01FB2_A3809TipMer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3809TipMer2 = new boolean[] {false} ;
      T01FB2_A3808TipMer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3808TipMer1 = new boolean[] {false} ;
      T01FB2_A3593TipMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3593TipMer = new boolean[] {false} ;
      T01FB2_A3592TipMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3592TipMarCom = new boolean[] {false} ;
      T01FB2_A3591TipPreMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3591TipPreMax = new boolean[] {false} ;
      T01FB2_A3590TipPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FB2_n3590TipPreMin = new boolean[] {false} ;
      T01FB2_A3561TipOpcCli = new String[] {""} ;
      T01FB2_n3561TipOpcCli = new boolean[] {false} ;
      T01FB2_A396EmprCod = new String[] {""} ;
      T01FB12_A396EmprCod = new String[] {""} ;
      T01FB12_A8564Gf_Cod = new short[1] ;
      T01FB12_A831TipColCod = new byte[1] ;
      T01FB12_n831TipColCod = new boolean[] {false} ;
      T01FB13_A396EmprCod = new String[] {""} ;
      T01FB13_A252CliCod = new int[1] ;
      T01FB13_A829TipArtCod = new short[1] ;
      T01FB13_A831TipColCod = new byte[1] ;
      T01FB13_n831TipColCod = new boolean[] {false} ;
      T01FB13_A583IntCod = new byte[1] ;
      T01FB13_A5098TipDisCod = new String[] {""} ;
      T01FB13_A6603Est1_anyo = new short[1] ;
      T01FB13_A6604Est1_mes = new byte[1] ;
      T01FB13_A6605Est1_dia = new byte[1] ;
      T01FB14_A396EmprCod = new String[] {""} ;
      T01FB14_A5532Lb_numero = new int[1] ;
      T01FB15_A396EmprCod = new String[] {""} ;
      T01FB15_A831TipColCod = new byte[1] ;
      T01FB15_n831TipColCod = new boolean[] {false} ;
      T01FB15_A5162TipColLin = new short[1] ;
      T01FB16_A396EmprCod = new String[] {""} ;
      T01FB16_A2720TarSec = new String[] {""} ;
      T01FB16_A252CliCod = new int[1] ;
      T01FB16_A829TipArtCod = new short[1] ;
      T01FB16_A831TipColCod = new byte[1] ;
      T01FB16_n831TipColCod = new boolean[] {false} ;
      T01FB17_A396EmprCod = new String[] {""} ;
      T01FB17_A252CliCod = new int[1] ;
      T01FB17_A65ArtCod = new String[] {""} ;
      T01FB17_A831TipColCod = new byte[1] ;
      T01FB17_n831TipColCod = new boolean[] {false} ;
      T01FB18_A396EmprCod = new String[] {""} ;
      T01FB18_A539HisBarCod = new int[1] ;
      T01FB18_A545HisCodReo = new byte[1] ;
      T01FB18_A544HisCodPar = new String[] {""} ;
      T01FB18_A833TipDefCod = new short[1] ;
      T01FB19_A396EmprCod = new String[] {""} ;
      T01FB19_A252CliCod = new int[1] ;
      T01FB19_A494ForSer = new String[] {""} ;
      T01FB19_A482ForColNom = new String[] {""} ;
      T01FB19_A483ForColNum = new int[1] ;
      T01FB19_A831TipColCod = new byte[1] ;
      T01FB19_n831TipColCod = new boolean[] {false} ;
      T01FB20_A396EmprCod = new String[] {""} ;
      T01FB20_A361DisCod = new int[1] ;
      T01FB21_A396EmprCod = new String[] {""} ;
      T01FB21_A831TipColCod = new byte[1] ;
      T01FB21_n831TipColCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01FB22_A407EmprNom = new String[] {""} ;
      T01FB22_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3811TipMer4 = DecimalUtil.ZERO ;
      ZZ3810TipMer3 = DecimalUtil.ZERO ;
      ZZ3809TipMer2 = DecimalUtil.ZERO ;
      ZZ3808TipMer1 = DecimalUtil.ZERO ;
      ZZ3593TipMer = DecimalUtil.ZERO ;
      ZZ3592TipMarCom = DecimalUtil.ZERO ;
      ZZ3591TipPreMax = DecimalUtil.ZERO ;
      ZZ3590TipPreMin = DecimalUtil.ZERO ;
      ZZ3561TipOpcCli = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrntipcol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrntipcol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrntipcol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrntipcol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrntipcol__default(),
         new Object[] {
             new Object[] {
            T01FB2_A831TipColCod, T01FB2_A3811TipMer4, T01FB2_n3811TipMer4, T01FB2_A3810TipMer3, T01FB2_n3810TipMer3, T01FB2_A3809TipMer2, T01FB2_n3809TipMer2, T01FB2_A3808TipMer1, T01FB2_n3808TipMer1, T01FB2_A3593TipMer,
            T01FB2_n3593TipMer, T01FB2_A3592TipMarCom, T01FB2_n3592TipMarCom, T01FB2_A3591TipPreMax, T01FB2_n3591TipPreMax, T01FB2_A3590TipPreMin, T01FB2_n3590TipPreMin, T01FB2_A3561TipOpcCli, T01FB2_n3561TipOpcCli, T01FB2_A396EmprCod
            }
            , new Object[] {
            T01FB3_A831TipColCod, T01FB3_A3811TipMer4, T01FB3_n3811TipMer4, T01FB3_A3810TipMer3, T01FB3_n3810TipMer3, T01FB3_A3809TipMer2, T01FB3_n3809TipMer2, T01FB3_A3808TipMer1, T01FB3_n3808TipMer1, T01FB3_A3593TipMer,
            T01FB3_n3593TipMer, T01FB3_A3592TipMarCom, T01FB3_n3592TipMarCom, T01FB3_A3591TipPreMax, T01FB3_n3591TipPreMax, T01FB3_A3590TipPreMin, T01FB3_n3590TipPreMin, T01FB3_A3561TipOpcCli, T01FB3_n3561TipOpcCli, T01FB3_A396EmprCod
            }
            , new Object[] {
            T01FB4_A407EmprNom, T01FB4_n407EmprNom
            }
            , new Object[] {
            T01FB5_A831TipColCod, T01FB5_A407EmprNom, T01FB5_n407EmprNom, T01FB5_A3811TipMer4, T01FB5_n3811TipMer4, T01FB5_A3810TipMer3, T01FB5_n3810TipMer3, T01FB5_A3809TipMer2, T01FB5_n3809TipMer2, T01FB5_A3808TipMer1,
            T01FB5_n3808TipMer1, T01FB5_A3593TipMer, T01FB5_n3593TipMer, T01FB5_A3592TipMarCom, T01FB5_n3592TipMarCom, T01FB5_A3591TipPreMax, T01FB5_n3591TipPreMax, T01FB5_A3590TipPreMin, T01FB5_n3590TipPreMin, T01FB5_A3561TipOpcCli,
            T01FB5_n3561TipOpcCli, T01FB5_A396EmprCod
            }
            , new Object[] {
            T01FB6_A396EmprCod, T01FB6_A831TipColCod
            }
            , new Object[] {
            T01FB7_A396EmprCod, T01FB7_A831TipColCod
            }
            , new Object[] {
            T01FB8_A396EmprCod, T01FB8_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FB12_A396EmprCod, T01FB12_A8564Gf_Cod, T01FB12_A831TipColCod
            }
            , new Object[] {
            T01FB13_A396EmprCod, T01FB13_A252CliCod, T01FB13_A829TipArtCod, T01FB13_A831TipColCod, T01FB13_A583IntCod, T01FB13_A5098TipDisCod, T01FB13_A6603Est1_anyo, T01FB13_A6604Est1_mes, T01FB13_A6605Est1_dia
            }
            , new Object[] {
            T01FB14_A396EmprCod, T01FB14_A5532Lb_numero
            }
            , new Object[] {
            T01FB15_A396EmprCod, T01FB15_A831TipColCod, T01FB15_A5162TipColLin
            }
            , new Object[] {
            T01FB16_A396EmprCod, T01FB16_A2720TarSec, T01FB16_A252CliCod, T01FB16_A829TipArtCod, T01FB16_A831TipColCod
            }
            , new Object[] {
            T01FB17_A396EmprCod, T01FB17_A252CliCod, T01FB17_A65ArtCod, T01FB17_A831TipColCod
            }
            , new Object[] {
            T01FB18_A396EmprCod, T01FB18_A539HisBarCod, T01FB18_A545HisCodReo, T01FB18_A544HisCodPar, T01FB18_A833TipDefCod
            }
            , new Object[] {
            T01FB19_A396EmprCod, T01FB19_A252CliCod, T01FB19_A494ForSer, T01FB19_A482ForColNom, T01FB19_A483ForColNum, T01FB19_A831TipColCod
            }
            , new Object[] {
            T01FB20_A396EmprCod, T01FB20_A361DisCod
            }
            , new Object[] {
            T01FB21_A396EmprCod, T01FB21_A831TipColCod
            }
            , new Object[] {
            T01FB22_A407EmprNom, T01FB22_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTrnTIPCOL" ;
   }

   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A831TipColCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ831TipColCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound101 ;
   private short nIsDirty_101 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTipMer4_Enabled ;
   private int edtTipMer3_Enabled ;
   private int edtTipMer2_Enabled ;
   private int edtTipMer1_Enabled ;
   private int edtTipMer_Enabled ;
   private int edtTipMarCom_Enabled ;
   private int edtTipPreMax_Enabled ;
   private int edtTipPreMin_Enabled ;
   private int edtTipOpcCli_Enabled ;
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
   private int edtTipOpcCli_Backcolor ;
   private int edtTipPreMin_Backcolor ;
   private int edtTipPreMax_Backcolor ;
   private int edtTipMarCom_Backcolor ;
   private int edtTipMer_Backcolor ;
   private int edtTipMer1_Backcolor ;
   private int edtTipMer2_Backcolor ;
   private int edtTipMer3_Backcolor ;
   private int edtTipMer4_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z3811TipMer4 ;
   private java.math.BigDecimal Z3810TipMer3 ;
   private java.math.BigDecimal Z3809TipMer2 ;
   private java.math.BigDecimal Z3808TipMer1 ;
   private java.math.BigDecimal Z3593TipMer ;
   private java.math.BigDecimal Z3592TipMarCom ;
   private java.math.BigDecimal Z3591TipPreMax ;
   private java.math.BigDecimal Z3590TipPreMin ;
   private java.math.BigDecimal A3811TipMer4 ;
   private java.math.BigDecimal A3810TipMer3 ;
   private java.math.BigDecimal A3809TipMer2 ;
   private java.math.BigDecimal A3808TipMer1 ;
   private java.math.BigDecimal A3593TipMer ;
   private java.math.BigDecimal A3592TipMarCom ;
   private java.math.BigDecimal A3591TipPreMax ;
   private java.math.BigDecimal A3590TipPreMin ;
   private java.math.BigDecimal ZZ3811TipMer4 ;
   private java.math.BigDecimal ZZ3810TipMer3 ;
   private java.math.BigDecimal ZZ3809TipMer2 ;
   private java.math.BigDecimal ZZ3808TipMer1 ;
   private java.math.BigDecimal ZZ3593TipMer ;
   private java.math.BigDecimal ZZ3592TipMarCom ;
   private java.math.BigDecimal ZZ3591TipPreMax ;
   private java.math.BigDecimal ZZ3590TipPreMin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3561TipOpcCli ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipColCod_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTipMer4_Internalname ;
   private String edtTipMer4_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTipMer3_Internalname ;
   private String edtTipMer3_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipMer2_Internalname ;
   private String edtTipMer2_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipMer1_Internalname ;
   private String edtTipMer1_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTipMer_Internalname ;
   private String edtTipMer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipMarCom_Internalname ;
   private String edtTipMarCom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTipPreMax_Internalname ;
   private String edtTipPreMax_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtTipPreMin_Internalname ;
   private String edtTipPreMin_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtTipOpcCli_Internalname ;
   private String A3561TipOpcCli ;
   private String edtTipOpcCli_Jsonclick ;
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
   private String sMode101 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ3561TipOpcCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n831TipColCod ;
   private boolean n3811TipMer4 ;
   private boolean n3810TipMer3 ;
   private boolean n3809TipMer2 ;
   private boolean n3808TipMer1 ;
   private boolean n3593TipMer ;
   private boolean n3592TipMarCom ;
   private boolean n3591TipPreMax ;
   private boolean n3590TipPreMin ;
   private boolean n3561TipOpcCli ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01FB4_A407EmprNom ;
   private boolean[] T01FB4_n407EmprNom ;
   private byte[] T01FB5_A831TipColCod ;
   private boolean[] T01FB5_n831TipColCod ;
   private String[] T01FB5_A407EmprNom ;
   private boolean[] T01FB5_n407EmprNom ;
   private java.math.BigDecimal[] T01FB5_A3811TipMer4 ;
   private boolean[] T01FB5_n3811TipMer4 ;
   private java.math.BigDecimal[] T01FB5_A3810TipMer3 ;
   private boolean[] T01FB5_n3810TipMer3 ;
   private java.math.BigDecimal[] T01FB5_A3809TipMer2 ;
   private boolean[] T01FB5_n3809TipMer2 ;
   private java.math.BigDecimal[] T01FB5_A3808TipMer1 ;
   private boolean[] T01FB5_n3808TipMer1 ;
   private java.math.BigDecimal[] T01FB5_A3593TipMer ;
   private boolean[] T01FB5_n3593TipMer ;
   private java.math.BigDecimal[] T01FB5_A3592TipMarCom ;
   private boolean[] T01FB5_n3592TipMarCom ;
   private java.math.BigDecimal[] T01FB5_A3591TipPreMax ;
   private boolean[] T01FB5_n3591TipPreMax ;
   private java.math.BigDecimal[] T01FB5_A3590TipPreMin ;
   private boolean[] T01FB5_n3590TipPreMin ;
   private String[] T01FB5_A3561TipOpcCli ;
   private boolean[] T01FB5_n3561TipOpcCli ;
   private String[] T01FB5_A396EmprCod ;
   private String[] T01FB6_A396EmprCod ;
   private byte[] T01FB6_A831TipColCod ;
   private boolean[] T01FB6_n831TipColCod ;
   private byte[] T01FB3_A831TipColCod ;
   private boolean[] T01FB3_n831TipColCod ;
   private java.math.BigDecimal[] T01FB3_A3811TipMer4 ;
   private boolean[] T01FB3_n3811TipMer4 ;
   private java.math.BigDecimal[] T01FB3_A3810TipMer3 ;
   private boolean[] T01FB3_n3810TipMer3 ;
   private java.math.BigDecimal[] T01FB3_A3809TipMer2 ;
   private boolean[] T01FB3_n3809TipMer2 ;
   private java.math.BigDecimal[] T01FB3_A3808TipMer1 ;
   private boolean[] T01FB3_n3808TipMer1 ;
   private java.math.BigDecimal[] T01FB3_A3593TipMer ;
   private boolean[] T01FB3_n3593TipMer ;
   private java.math.BigDecimal[] T01FB3_A3592TipMarCom ;
   private boolean[] T01FB3_n3592TipMarCom ;
   private java.math.BigDecimal[] T01FB3_A3591TipPreMax ;
   private boolean[] T01FB3_n3591TipPreMax ;
   private java.math.BigDecimal[] T01FB3_A3590TipPreMin ;
   private boolean[] T01FB3_n3590TipPreMin ;
   private String[] T01FB3_A3561TipOpcCli ;
   private boolean[] T01FB3_n3561TipOpcCli ;
   private String[] T01FB3_A396EmprCod ;
   private String[] T01FB7_A396EmprCod ;
   private byte[] T01FB7_A831TipColCod ;
   private boolean[] T01FB7_n831TipColCod ;
   private String[] T01FB8_A396EmprCod ;
   private byte[] T01FB8_A831TipColCod ;
   private boolean[] T01FB8_n831TipColCod ;
   private byte[] T01FB2_A831TipColCod ;
   private boolean[] T01FB2_n831TipColCod ;
   private java.math.BigDecimal[] T01FB2_A3811TipMer4 ;
   private boolean[] T01FB2_n3811TipMer4 ;
   private java.math.BigDecimal[] T01FB2_A3810TipMer3 ;
   private boolean[] T01FB2_n3810TipMer3 ;
   private java.math.BigDecimal[] T01FB2_A3809TipMer2 ;
   private boolean[] T01FB2_n3809TipMer2 ;
   private java.math.BigDecimal[] T01FB2_A3808TipMer1 ;
   private boolean[] T01FB2_n3808TipMer1 ;
   private java.math.BigDecimal[] T01FB2_A3593TipMer ;
   private boolean[] T01FB2_n3593TipMer ;
   private java.math.BigDecimal[] T01FB2_A3592TipMarCom ;
   private boolean[] T01FB2_n3592TipMarCom ;
   private java.math.BigDecimal[] T01FB2_A3591TipPreMax ;
   private boolean[] T01FB2_n3591TipPreMax ;
   private java.math.BigDecimal[] T01FB2_A3590TipPreMin ;
   private boolean[] T01FB2_n3590TipPreMin ;
   private String[] T01FB2_A3561TipOpcCli ;
   private boolean[] T01FB2_n3561TipOpcCli ;
   private String[] T01FB2_A396EmprCod ;
   private String[] T01FB12_A396EmprCod ;
   private short[] T01FB12_A8564Gf_Cod ;
   private byte[] T01FB12_A831TipColCod ;
   private boolean[] T01FB12_n831TipColCod ;
   private String[] T01FB13_A396EmprCod ;
   private int[] T01FB13_A252CliCod ;
   private short[] T01FB13_A829TipArtCod ;
   private byte[] T01FB13_A831TipColCod ;
   private boolean[] T01FB13_n831TipColCod ;
   private byte[] T01FB13_A583IntCod ;
   private String[] T01FB13_A5098TipDisCod ;
   private short[] T01FB13_A6603Est1_anyo ;
   private byte[] T01FB13_A6604Est1_mes ;
   private byte[] T01FB13_A6605Est1_dia ;
   private String[] T01FB14_A396EmprCod ;
   private int[] T01FB14_A5532Lb_numero ;
   private String[] T01FB15_A396EmprCod ;
   private byte[] T01FB15_A831TipColCod ;
   private boolean[] T01FB15_n831TipColCod ;
   private short[] T01FB15_A5162TipColLin ;
   private String[] T01FB16_A396EmprCod ;
   private String[] T01FB16_A2720TarSec ;
   private int[] T01FB16_A252CliCod ;
   private short[] T01FB16_A829TipArtCod ;
   private byte[] T01FB16_A831TipColCod ;
   private boolean[] T01FB16_n831TipColCod ;
   private String[] T01FB17_A396EmprCod ;
   private int[] T01FB17_A252CliCod ;
   private String[] T01FB17_A65ArtCod ;
   private byte[] T01FB17_A831TipColCod ;
   private boolean[] T01FB17_n831TipColCod ;
   private String[] T01FB18_A396EmprCod ;
   private int[] T01FB18_A539HisBarCod ;
   private byte[] T01FB18_A545HisCodReo ;
   private String[] T01FB18_A544HisCodPar ;
   private short[] T01FB18_A833TipDefCod ;
   private String[] T01FB19_A396EmprCod ;
   private int[] T01FB19_A252CliCod ;
   private String[] T01FB19_A494ForSer ;
   private String[] T01FB19_A482ForColNom ;
   private int[] T01FB19_A483ForColNum ;
   private byte[] T01FB19_A831TipColCod ;
   private boolean[] T01FB19_n831TipColCod ;
   private String[] T01FB20_A396EmprCod ;
   private int[] T01FB20_A361DisCod ;
   private String[] T01FB21_A396EmprCod ;
   private byte[] T01FB21_A831TipColCod ;
   private boolean[] T01FB21_n831TipColCod ;
   private String[] T01FB22_A407EmprNom ;
   private boolean[] T01FB22_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrntipcol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrntipcol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrntipcol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrntipcol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrntipcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FB2", "SELECT TipColCod, TipMer4, TipMer3, TipMer2, TipMer1, TipMer, TipMarCom, TipPreMax, TipPreMin, TipOpcCli, EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ?  FOR UPDATE OF TipMer4, TipMer3, TipMer2, TipMer1, TipMer, TipMarCom, TipPreMax, TipPreMin, TipOpcCli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB3", "SELECT TipColCod, TipMer4, TipMer3, TipMer2, TipMer1, TipMer, TipMarCom, TipPreMax, TipPreMin, TipOpcCli, EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB5", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipColCod, T2.EmprNom, TM1.TipMer4, TM1.TipMer3, TM1.TipMer2, TM1.TipMer1, TM1.TipMer, TM1.TipMarCom, TM1.TipPreMax, TM1.TipPreMin, TM1.TipOpcCli, TM1.EmprCod FROM (TXPTIPCOL TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE ( TipColCod > ?) and EmprCod = ? ORDER BY EmprCod, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE ( TipColCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FB9", "INSERT INTO TXPTIPCOL(TipColCod, TipMer4, TipMer3, TipMer2, TipMer1, TipMer, TipMarCom, TipPreMax, TipPreMin, TipOpcCli, EmprCod, TipColDsc, TipColTie, TipColUl, TipColCtb, TipArtFam) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPTIPCOL")
         ,new UpdateCursor("T01FB10", "UPDATE TXPTIPCOL SET TipMer4=?, TipMer3=?, TipMer2=?, TipMer1=?, TipMer=?, TipMarCom=?, TipPreMax=?, TipPreMin=?, TipOpcCli=?  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK, "TXPTIPCOL")
         ,new UpdateCursor("T01FB11", "DELETE FROM TXPTIPCOL  WHERE EmprCod = ? AND TipColCod = ?", GX_NOMASK, "TXPTIPCOL")
         ,new ForEachCursor("T01FB12", "SELECT * FROM (SELECT EmprCod, Gf_Cod, TipColCod FROM TXPGFMTC1 WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB13", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB14", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB15", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB16", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB18", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND HisTipCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB19", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB20", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisTipCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FB21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY EmprCod, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FB22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 20 :
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               stmt.setString(11, (String)parms[20], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
               }
               stmt.setString(10, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

