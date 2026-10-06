package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactse_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO ACTIVIDAD SECAR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactse_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactse_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactse_impl.class ));
   }

   public tactse_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTSE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Seccion Actividad", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_cod_Internalname, GXutil.rtrim( A9932Se_cod), GXutil.rtrim( localUtil.format( A9932Se_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_cod_Jsonclick, 0, "", "", "", "", "", 1, edtSe_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_np_Internalname, GXutil.ltrim( localUtil.ntoc( A9934Se_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_np_Enabled!=0) ? localUtil.format( A9934Se_np, "ZZ9.99999") : localUtil.format( A9934Se_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_np_Jsonclick, 0, "", "", "", "", "", 1, edtSe_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N piezas calandra / Percha", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_npzcp_Internalname, GXutil.ltrim( localUtil.ntoc( A9935Se_npzcp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_npzcp_Enabled!=0) ? localUtil.format( A9935Se_npzcp, "ZZ9.99999") : localUtil.format( A9935Se_npzcp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_npzcp_Jsonclick, 0, "", "", "", "", "", 1, edtSe_npzcp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N piezas calandra / Percha 2 O", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_npzcp2_Internalname, GXutil.ltrim( localUtil.ntoc( A9936Se_npzcp2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_npzcp2_Enabled!=0) ? localUtil.format( A9936Se_npzcp2, "ZZ9.99999") : localUtil.format( A9936Se_npzcp2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_npzcp2_Jsonclick, 0, "", "", "", "", "", 1, edtSe_npzcp2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N piezas embolsadas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_npze_Internalname, GXutil.ltrim( localUtil.ntoc( A9937Se_npze, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_npze_Enabled!=0) ? localUtil.format( A9937Se_npze, "ZZ9.99999") : localUtil.format( A9937Se_npze, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_npze_Jsonclick, 0, "", "", "", "", "", 1, edtSe_npze_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N piezas embolsadas 2 Ope", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_npze2_Internalname, GXutil.ltrim( localUtil.ntoc( A9938Se_npze2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_npze2_Enabled!=0) ? localUtil.format( A9938Se_npze2, "ZZ9.99999") : localUtil.format( A9938Se_npze2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_npze2_Jsonclick, 0, "", "", "", "", "", 1, edtSe_npze2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N Camas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_nc_Internalname, GXutil.ltrim( localUtil.ntoc( A9939Se_nc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_nc_Enabled!=0) ? localUtil.format( A9939Se_nc, "ZZ9.99999") : localUtil.format( A9939Se_nc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_nc_Jsonclick, 0, "", "", "", "", "", 1, edtSe_nc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Metros p/cama / V FT /60 x1,05", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSe_nmp_Internalname, GXutil.ltrim( localUtil.ntoc( A9933Se_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSe_nmp_Enabled!=0) ? localUtil.format( A9933Se_nmp, "ZZ9.99999") : localUtil.format( A9933Se_nmp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSe_nmp_Jsonclick, 0, "", "", "", "", "", 1, edtSe_nmp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTSE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTSE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTSE.htm");
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
      e1115W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9932Se_cod = httpContext.cgiGet( "Z9932Se_cod") ;
            Z9934Se_np = localUtil.ctond( httpContext.cgiGet( "Z9934Se_np")) ;
            Z9935Se_npzcp = localUtil.ctond( httpContext.cgiGet( "Z9935Se_npzcp")) ;
            Z9936Se_npzcp2 = localUtil.ctond( httpContext.cgiGet( "Z9936Se_npzcp2")) ;
            Z9937Se_npze = localUtil.ctond( httpContext.cgiGet( "Z9937Se_npze")) ;
            Z9938Se_npze2 = localUtil.ctond( httpContext.cgiGet( "Z9938Se_npze2")) ;
            Z9939Se_nc = localUtil.ctond( httpContext.cgiGet( "Z9939Se_nc")) ;
            Z9933Se_nmp = localUtil.ctond( httpContext.cgiGet( "Z9933Se_nmp")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV34Codigo = httpContext.cgiGet( "vCODIGO") ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9932Se_cod = httpContext.cgiGet( edtSe_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9934Se_np = DecimalUtil.ZERO ;
               n9934Se_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrimstr( A9934Se_np, 9, 5));
            }
            else
            {
               A9934Se_np = localUtil.ctond( httpContext.cgiGet( edtSe_np_Internalname)) ;
               n9934Se_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrimstr( A9934Se_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_npzcp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_npzcp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NPZCP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_npzcp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9935Se_npzcp = DecimalUtil.ZERO ;
               n9935Se_npzcp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrimstr( A9935Se_npzcp, 9, 5));
            }
            else
            {
               A9935Se_npzcp = localUtil.ctond( httpContext.cgiGet( edtSe_npzcp_Internalname)) ;
               n9935Se_npzcp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrimstr( A9935Se_npzcp, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_npzcp2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_npzcp2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NPZCP2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_npzcp2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9936Se_npzcp2 = DecimalUtil.ZERO ;
               n9936Se_npzcp2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrimstr( A9936Se_npzcp2, 9, 5));
            }
            else
            {
               A9936Se_npzcp2 = localUtil.ctond( httpContext.cgiGet( edtSe_npzcp2_Internalname)) ;
               n9936Se_npzcp2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrimstr( A9936Se_npzcp2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_npze_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_npze_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NPZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_npze_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9937Se_npze = DecimalUtil.ZERO ;
               n9937Se_npze = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrimstr( A9937Se_npze, 9, 5));
            }
            else
            {
               A9937Se_npze = localUtil.ctond( httpContext.cgiGet( edtSe_npze_Internalname)) ;
               n9937Se_npze = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrimstr( A9937Se_npze, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_npze2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_npze2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NPZE2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_npze2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9938Se_npze2 = DecimalUtil.ZERO ;
               n9938Se_npze2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrimstr( A9938Se_npze2, 9, 5));
            }
            else
            {
               A9938Se_npze2 = localUtil.ctond( httpContext.cgiGet( edtSe_npze2_Internalname)) ;
               n9938Se_npze2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrimstr( A9938Se_npze2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_nc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_nc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_nc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9939Se_nc = DecimalUtil.ZERO ;
               n9939Se_nc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrimstr( A9939Se_nc, 9, 5));
            }
            else
            {
               A9939Se_nc = localUtil.ctond( httpContext.cgiGet( edtSe_nc_Internalname)) ;
               n9939Se_nc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrimstr( A9939Se_nc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSe_nmp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSe_nmp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SE_NMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSe_nmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9933Se_nmp = DecimalUtil.ZERO ;
               n9933Se_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrimstr( A9933Se_nmp, 9, 5));
            }
            else
            {
               A9933Se_nmp = localUtil.ctond( httpContext.cgiGet( edtSe_nmp_Internalname)) ;
               n9933Se_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrimstr( A9933Se_nmp, 9, 5));
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
               A9932Se_cod = httpContext.GetPar( "Se_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
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
                        e1115W2 ();
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
            initAll15W1320( ) ;
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
      disableAttributes15W1320( ) ;
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

   public void confirm_15W0( )
   {
      beforeValidate15W1320( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15W1320( ) ;
         }
         else
         {
            checkExtendedTable15W1320( ) ;
            if ( AnyError == 0 )
            {
               zm15W1320( 4) ;
            }
            closeExtendedTableCursors15W1320( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues15W0( ) ;
      }
   }

   public void resetCaption15W0( )
   {
   }

   public void e1115W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactse_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tactse_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactse_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactse_impl.this.A396EmprCod = GXv_char2[0] ;
      tactse_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactse_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV34Codigo ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACSE", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactse_impl.this.A396EmprCod = GXv_char4[0] ;
      tactse_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV34Codigo = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Codigo", AV34Codigo);
      if ( GXutil.strcmp(AV34Codigo, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACSE", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void zm15W1320( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9934Se_np = T015W3_A9934Se_np[0] ;
            Z9935Se_npzcp = T015W3_A9935Se_npzcp[0] ;
            Z9936Se_npzcp2 = T015W3_A9936Se_npzcp2[0] ;
            Z9937Se_npze = T015W3_A9937Se_npze[0] ;
            Z9938Se_npze2 = T015W3_A9938Se_npze2[0] ;
            Z9939Se_nc = T015W3_A9939Se_nc[0] ;
            Z9933Se_nmp = T015W3_A9933Se_nmp[0] ;
         }
         else
         {
            Z9934Se_np = A9934Se_np ;
            Z9935Se_npzcp = A9935Se_npzcp ;
            Z9936Se_npzcp2 = A9936Se_npzcp2 ;
            Z9937Se_npze = A9937Se_npze ;
            Z9938Se_npze2 = A9938Se_npze2 ;
            Z9939Se_nc = A9939Se_nc ;
            Z9933Se_nmp = A9933Se_nmp ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9932Se_cod = A9932Se_cod ;
         Z9934Se_np = A9934Se_np ;
         Z9935Se_npzcp = A9935Se_npzcp ;
         Z9936Se_npzcp2 = A9936Se_npzcp2 ;
         Z9937Se_npze = A9937Se_npze ;
         Z9938Se_npze2 = A9938Se_npze2 ;
         Z9939Se_nc = A9939Se_nc ;
         Z9933Se_nmp = A9933Se_nmp ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TACTSE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T015W4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015W4_A407EmprNom[0] ;
      n407EmprNom = T015W4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A9932Se_cod = AV34Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
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
      }
   }

   public void load15W1320( )
   {
      /* Using cursor T015W5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9932Se_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1320 = (short)(1) ;
         A407EmprNom = T015W5_A407EmprNom[0] ;
         n407EmprNom = T015W5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9934Se_np = T015W5_A9934Se_np[0] ;
         n9934Se_np = T015W5_n9934Se_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrimstr( A9934Se_np, 9, 5));
         A9935Se_npzcp = T015W5_A9935Se_npzcp[0] ;
         n9935Se_npzcp = T015W5_n9935Se_npzcp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrimstr( A9935Se_npzcp, 9, 5));
         A9936Se_npzcp2 = T015W5_A9936Se_npzcp2[0] ;
         n9936Se_npzcp2 = T015W5_n9936Se_npzcp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrimstr( A9936Se_npzcp2, 9, 5));
         A9937Se_npze = T015W5_A9937Se_npze[0] ;
         n9937Se_npze = T015W5_n9937Se_npze[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrimstr( A9937Se_npze, 9, 5));
         A9938Se_npze2 = T015W5_A9938Se_npze2[0] ;
         n9938Se_npze2 = T015W5_n9938Se_npze2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrimstr( A9938Se_npze2, 9, 5));
         A9939Se_nc = T015W5_A9939Se_nc[0] ;
         n9939Se_nc = T015W5_n9939Se_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrimstr( A9939Se_nc, 9, 5));
         A9933Se_nmp = T015W5_A9933Se_nmp[0] ;
         n9933Se_nmp = T015W5_n9933Se_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrimstr( A9933Se_nmp, 9, 5));
         zm15W1320( -3) ;
      }
      pr_default.close(3);
      onLoadActions15W1320( ) ;
   }

   public void onLoadActions15W1320( )
   {
   }

   public void checkExtendedTable15W1320( )
   {
      nIsDirty_1320 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A9932Se_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "SE_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15W1320( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15W1320( )
   {
      /* Using cursor T015W6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A9932Se_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1320 = (short)(1) ;
      }
      else
      {
         RcdFound1320 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9932Se_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015W3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15W1320( 3) ;
         RcdFound1320 = (short)(1) ;
         A9932Se_cod = T015W3_A9932Se_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
         A9934Se_np = T015W3_A9934Se_np[0] ;
         n9934Se_np = T015W3_n9934Se_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrimstr( A9934Se_np, 9, 5));
         A9935Se_npzcp = T015W3_A9935Se_npzcp[0] ;
         n9935Se_npzcp = T015W3_n9935Se_npzcp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrimstr( A9935Se_npzcp, 9, 5));
         A9936Se_npzcp2 = T015W3_A9936Se_npzcp2[0] ;
         n9936Se_npzcp2 = T015W3_n9936Se_npzcp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrimstr( A9936Se_npzcp2, 9, 5));
         A9937Se_npze = T015W3_A9937Se_npze[0] ;
         n9937Se_npze = T015W3_n9937Se_npze[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrimstr( A9937Se_npze, 9, 5));
         A9938Se_npze2 = T015W3_A9938Se_npze2[0] ;
         n9938Se_npze2 = T015W3_n9938Se_npze2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrimstr( A9938Se_npze2, 9, 5));
         A9939Se_nc = T015W3_A9939Se_nc[0] ;
         n9939Se_nc = T015W3_n9939Se_nc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrimstr( A9939Se_nc, 9, 5));
         A9933Se_nmp = T015W3_A9933Se_nmp[0] ;
         n9933Se_nmp = T015W3_n9933Se_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrimstr( A9933Se_nmp, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z9932Se_cod = A9932Se_cod ;
         sMode1320 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15W1320( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1320 = (short)(0) ;
            initializeNonKey15W1320( ) ;
         }
         Gx_mode = sMode1320 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1320 = (short)(0) ;
         initializeNonKey15W1320( ) ;
         sMode1320 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1320 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey15W1320( ) ;
      if ( RcdFound1320 == 0 )
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
      RcdFound1320 = (short)(0) ;
      /* Using cursor T015W7 */
      pr_default.execute(5, new Object[] {A9932Se_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015W7_A9932Se_cod[0], A9932Se_cod) < 0 ) ) && ( GXutil.strcmp(T015W7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015W7_A9932Se_cod[0], A9932Se_cod) > 0 ) ) && ( GXutil.strcmp(T015W7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9932Se_cod = T015W7_A9932Se_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
            RcdFound1320 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1320 = (short)(0) ;
      /* Using cursor T015W8 */
      pr_default.execute(6, new Object[] {A9932Se_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015W8_A9932Se_cod[0], A9932Se_cod) > 0 ) ) && ( GXutil.strcmp(T015W8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015W8_A9932Se_cod[0], A9932Se_cod) < 0 ) ) && ( GXutil.strcmp(T015W8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9932Se_cod = T015W8_A9932Se_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
            RcdFound1320 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15W1320( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15W1320( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1320 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9932Se_cod, Z9932Se_cod) != 0 ) )
            {
               A9932Se_cod = Z9932Se_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15W1320( ) ;
               GX_FocusControl = edtSe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9932Se_cod, Z9932Se_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtSe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15W1320( ) ;
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
                  GX_FocusControl = edtSe_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15W1320( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9932Se_cod, Z9932Se_cod) != 0 ) )
      {
         A9932Se_cod = Z9932Se_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSe_cod_Internalname ;
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
      getKey15W1320( ) ;
      if ( RcdFound1320 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9932Se_cod, Z9932Se_cod) != 0 ) )
         {
            A9932Se_cod = Z9932Se_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9932Se_cod, Z9932Se_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactse");
      GX_FocusControl = edtSe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15W0( ) ;
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
      if ( RcdFound1320 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtSe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15W1320( ) ;
      if ( RcdFound1320 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15W1320( ) ;
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
      if ( RcdFound1320 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSe_np_Internalname ;
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
      if ( RcdFound1320 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSe_np_Internalname ;
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
      scanStart15W1320( ) ;
      if ( RcdFound1320 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1320 != 0 )
         {
            scanNext15W1320( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtSe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15W1320( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15W1320( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9932Se_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTSE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9934Se_np, T015W2_A9934Se_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z9935Se_npzcp, T015W2_A9935Se_npzcp[0]) != 0 ) || ( DecimalUtil.compareTo(Z9936Se_npzcp2, T015W2_A9936Se_npzcp2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9937Se_npze, T015W2_A9937Se_npze[0]) != 0 ) || ( DecimalUtil.compareTo(Z9938Se_npze2, T015W2_A9938Se_npze2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9939Se_nc, T015W2_A9939Se_nc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9933Se_nmp, T015W2_A9933Se_nmp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9934Se_np, T015W2_A9934Se_np[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_np");
               GXutil.writeLogRaw("Old: ",Z9934Se_np);
               GXutil.writeLogRaw("Current: ",T015W2_A9934Se_np[0]);
            }
            if ( DecimalUtil.compareTo(Z9935Se_npzcp, T015W2_A9935Se_npzcp[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_npzcp");
               GXutil.writeLogRaw("Old: ",Z9935Se_npzcp);
               GXutil.writeLogRaw("Current: ",T015W2_A9935Se_npzcp[0]);
            }
            if ( DecimalUtil.compareTo(Z9936Se_npzcp2, T015W2_A9936Se_npzcp2[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_npzcp2");
               GXutil.writeLogRaw("Old: ",Z9936Se_npzcp2);
               GXutil.writeLogRaw("Current: ",T015W2_A9936Se_npzcp2[0]);
            }
            if ( DecimalUtil.compareTo(Z9937Se_npze, T015W2_A9937Se_npze[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_npze");
               GXutil.writeLogRaw("Old: ",Z9937Se_npze);
               GXutil.writeLogRaw("Current: ",T015W2_A9937Se_npze[0]);
            }
            if ( DecimalUtil.compareTo(Z9938Se_npze2, T015W2_A9938Se_npze2[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_npze2");
               GXutil.writeLogRaw("Old: ",Z9938Se_npze2);
               GXutil.writeLogRaw("Current: ",T015W2_A9938Se_npze2[0]);
            }
            if ( DecimalUtil.compareTo(Z9939Se_nc, T015W2_A9939Se_nc[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_nc");
               GXutil.writeLogRaw("Old: ",Z9939Se_nc);
               GXutil.writeLogRaw("Current: ",T015W2_A9939Se_nc[0]);
            }
            if ( DecimalUtil.compareTo(Z9933Se_nmp, T015W2_A9933Se_nmp[0]) != 0 )
            {
               GXutil.writeLogln("tactse:[seudo value changed for attri]"+"Se_nmp");
               GXutil.writeLogRaw("Old: ",Z9933Se_nmp);
               GXutil.writeLogRaw("Current: ",T015W2_A9933Se_nmp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTSE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15W1320( )
   {
      beforeValidate15W1320( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15W1320( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15W1320( 0) ;
         checkOptimisticConcurrency15W1320( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15W1320( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15W1320( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015W9 */
                  pr_default.execute(7, new Object[] {A9932Se_cod, Boolean.valueOf(n9934Se_np), A9934Se_np, Boolean.valueOf(n9935Se_npzcp), A9935Se_npzcp, Boolean.valueOf(n9936Se_npzcp2), A9936Se_npzcp2, Boolean.valueOf(n9937Se_npze), A9937Se_npze, Boolean.valueOf(n9938Se_npze2), A9938Se_npze2, Boolean.valueOf(n9939Se_nc), A9939Se_nc, Boolean.valueOf(n9933Se_nmp), A9933Se_nmp, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTSE");
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
                        resetCaption15W0( ) ;
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
            load15W1320( ) ;
         }
         endLevel15W1320( ) ;
      }
      closeExtendedTableCursors15W1320( ) ;
   }

   public void update15W1320( )
   {
      beforeValidate15W1320( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15W1320( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15W1320( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15W1320( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15W1320( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015W10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n9934Se_np), A9934Se_np, Boolean.valueOf(n9935Se_npzcp), A9935Se_npzcp, Boolean.valueOf(n9936Se_npzcp2), A9936Se_npzcp2, Boolean.valueOf(n9937Se_npze), A9937Se_npze, Boolean.valueOf(n9938Se_npze2), A9938Se_npze2, Boolean.valueOf(n9939Se_nc), A9939Se_nc, Boolean.valueOf(n9933Se_nmp), A9933Se_nmp, A396EmprCod, A9932Se_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTSE");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTSE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15W1320( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption15W0( ) ;
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
         endLevel15W1320( ) ;
      }
      closeExtendedTableCursors15W1320( ) ;
   }

   public void deferredUpdate15W1320( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15W1320( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15W1320( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15W1320( ) ;
         afterConfirm15W1320( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15W1320( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015W11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A9932Se_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTSE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1320 == 0 )
                     {
                        initAll15W1320( ) ;
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
                     resetCaption15W0( ) ;
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
      sMode1320 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15W1320( ) ;
      Gx_mode = sMode1320 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15W1320( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel15W1320( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15W1320( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactse");
         if ( AnyError == 0 )
         {
            confirmValues15W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactse");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15W1320( )
   {
      /* Scan By routine */
      /* Using cursor T015W12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1320 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1320 = (short)(1) ;
         A9932Se_cod = T015W12_A9932Se_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15W1320( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1320 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1320 = (short)(1) ;
         A9932Se_cod = T015W12_A9932Se_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
      }
   }

   public void scanEnd15W1320( )
   {
      pr_default.close(10);
   }

   public void afterConfirm15W1320( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15W1320( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15W1320( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15W1320( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15W1320( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15W1320( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15W1320( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtSe_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_cod_Enabled), 5, 0), true);
      edtSe_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_np_Enabled), 5, 0), true);
      edtSe_npzcp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_npzcp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_npzcp_Enabled), 5, 0), true);
      edtSe_npzcp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_npzcp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_npzcp2_Enabled), 5, 0), true);
      edtSe_npze_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_npze_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_npze_Enabled), 5, 0), true);
      edtSe_npze2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_npze2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_npze2_Enabled), 5, 0), true);
      edtSe_nc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_nc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_nc_Enabled), 5, 0), true);
      edtSe_nmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSe_nmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSe_nmp_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes15W1320( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues15W0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactse", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9932Se_cod", GXutil.rtrim( Z9932Se_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9934Se_np", GXutil.ltrim( localUtil.ntoc( Z9934Se_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9935Se_npzcp", GXutil.ltrim( localUtil.ntoc( Z9935Se_npzcp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9936Se_npzcp2", GXutil.ltrim( localUtil.ntoc( Z9936Se_npzcp2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9937Se_npze", GXutil.ltrim( localUtil.ntoc( Z9937Se_npze, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9938Se_npze2", GXutil.ltrim( localUtil.ntoc( Z9938Se_npze2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9939Se_nc", GXutil.ltrim( localUtil.ntoc( Z9939Se_nc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9933Se_nmp", GXutil.ltrim( localUtil.ntoc( Z9933Se_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODIGO", GXutil.rtrim( AV34Codigo));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.tactse", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTSE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO ACTIVIDAD SECAR", "") ;
   }

   public void initializeNonKey15W1320( )
   {
      A9934Se_np = DecimalUtil.ZERO ;
      n9934Se_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrimstr( A9934Se_np, 9, 5));
      A9935Se_npzcp = DecimalUtil.ZERO ;
      n9935Se_npzcp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrimstr( A9935Se_npzcp, 9, 5));
      A9936Se_npzcp2 = DecimalUtil.ZERO ;
      n9936Se_npzcp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrimstr( A9936Se_npzcp2, 9, 5));
      A9937Se_npze = DecimalUtil.ZERO ;
      n9937Se_npze = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrimstr( A9937Se_npze, 9, 5));
      A9938Se_npze2 = DecimalUtil.ZERO ;
      n9938Se_npze2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrimstr( A9938Se_npze2, 9, 5));
      A9939Se_nc = DecimalUtil.ZERO ;
      n9939Se_nc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrimstr( A9939Se_nc, 9, 5));
      A9933Se_nmp = DecimalUtil.ZERO ;
      n9933Se_nmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrimstr( A9933Se_nmp, 9, 5));
      Z9934Se_np = DecimalUtil.ZERO ;
      Z9935Se_npzcp = DecimalUtil.ZERO ;
      Z9936Se_npzcp2 = DecimalUtil.ZERO ;
      Z9937Se_npze = DecimalUtil.ZERO ;
      Z9938Se_npze2 = DecimalUtil.ZERO ;
      Z9939Se_nc = DecimalUtil.ZERO ;
      Z9933Se_nmp = DecimalUtil.ZERO ;
   }

   public void initAll15W1320( )
   {
      A9932Se_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9932Se_cod", A9932Se_cod);
      initializeNonKey15W1320( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543515", true, true);
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
      httpContext.AddJavascriptSource("tactse.js", "?20268241543515", false, true);
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
      edtSe_cod_Internalname = "SE_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtSe_np_Internalname = "SE_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtSe_npzcp_Internalname = "SE_NPZCP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtSe_npzcp2_Internalname = "SE_NPZCP2" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtSe_npze_Internalname = "SE_NPZE" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtSe_npze2_Internalname = "SE_NPZE2" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtSe_nc_Internalname = "SE_NC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtSe_nmp_Internalname = "SE_NMP" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO ACTIVIDAD SECAR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtSe_nmp_Jsonclick = "" ;
      edtSe_nmp_Backcolor = (int)(0xFFFFFF) ;
      edtSe_nmp_Enabled = 1 ;
      edtSe_nc_Jsonclick = "" ;
      edtSe_nc_Backcolor = (int)(0xFFFFFF) ;
      edtSe_nc_Enabled = 1 ;
      edtSe_npze2_Jsonclick = "" ;
      edtSe_npze2_Backcolor = (int)(0xFFFFFF) ;
      edtSe_npze2_Enabled = 1 ;
      edtSe_npze_Jsonclick = "" ;
      edtSe_npze_Backcolor = (int)(0xFFFFFF) ;
      edtSe_npze_Enabled = 1 ;
      edtSe_npzcp2_Jsonclick = "" ;
      edtSe_npzcp2_Backcolor = (int)(0xFFFFFF) ;
      edtSe_npzcp2_Enabled = 1 ;
      edtSe_npzcp_Jsonclick = "" ;
      edtSe_npzcp_Backcolor = (int)(0xFFFFFF) ;
      edtSe_npzcp_Enabled = 1 ;
      edtSe_np_Jsonclick = "" ;
      edtSe_np_Backcolor = (int)(0xFFFFFF) ;
      edtSe_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtSe_cod_Jsonclick = "" ;
      edtSe_cod_Backcolor = (int)(0xFFFFFF) ;
      edtSe_cod_Enabled = 1 ;
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
      /* Using cursor T015W13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015W13_A407EmprNom[0] ;
      n407EmprNom = T015W13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtSe_np_Internalname ;
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

   public void valid_Se_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A9932Se_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "SE_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSe_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9934Se_np", GXutil.ltrim( localUtil.ntoc( A9934Se_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9935Se_npzcp", GXutil.ltrim( localUtil.ntoc( A9935Se_npzcp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9936Se_npzcp2", GXutil.ltrim( localUtil.ntoc( A9936Se_npzcp2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9937Se_npze", GXutil.ltrim( localUtil.ntoc( A9937Se_npze, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9938Se_npze2", GXutil.ltrim( localUtil.ntoc( A9938Se_npze2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9939Se_nc", GXutil.ltrim( localUtil.ntoc( A9939Se_nc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9933Se_nmp", GXutil.ltrim( localUtil.ntoc( A9933Se_nmp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9932Se_cod", GXutil.rtrim( Z9932Se_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9934Se_np", GXutil.ltrim( localUtil.ntoc( Z9934Se_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9935Se_npzcp", GXutil.ltrim( localUtil.ntoc( Z9935Se_npzcp, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9936Se_npzcp2", GXutil.ltrim( localUtil.ntoc( Z9936Se_npzcp2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9937Se_npze", GXutil.ltrim( localUtil.ntoc( Z9937Se_npze, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9938Se_npze2", GXutil.ltrim( localUtil.ntoc( Z9938Se_npze2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9939Se_nc", GXutil.ltrim( localUtil.ntoc( Z9939Se_nc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9933Se_nmp", GXutil.ltrim( localUtil.ntoc( Z9933Se_nmp, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_SE_COD","{handler:'valid_Se_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9932Se_cod',fld:'SE_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV34Codigo',fld:'vCODIGO',pic:''}]");
      setEventMetadata("VALID_SE_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9934Se_np',fld:'SE_NP',pic:'ZZ9.99999'},{av:'A9935Se_npzcp',fld:'SE_NPZCP',pic:'ZZ9.99999'},{av:'A9936Se_npzcp2',fld:'SE_NPZCP2',pic:'ZZ9.99999'},{av:'A9937Se_npze',fld:'SE_NPZE',pic:'ZZ9.99999'},{av:'A9938Se_npze2',fld:'SE_NPZE2',pic:'ZZ9.99999'},{av:'A9939Se_nc',fld:'SE_NC',pic:'ZZ9.99999'},{av:'A9933Se_nmp',fld:'SE_NMP',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9932Se_cod'},{av:'Z407EmprNom'},{av:'Z9934Se_np'},{av:'Z9935Se_npzcp'},{av:'Z9936Se_npzcp2'},{av:'Z9937Se_npze'},{av:'Z9938Se_npze2'},{av:'Z9939Se_nc'},{av:'Z9933Se_nmp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9932Se_cod = "" ;
      Z9934Se_np = DecimalUtil.ZERO ;
      Z9935Se_npzcp = DecimalUtil.ZERO ;
      Z9936Se_npzcp2 = DecimalUtil.ZERO ;
      Z9937Se_npze = DecimalUtil.ZERO ;
      Z9938Se_npze2 = DecimalUtil.ZERO ;
      Z9939Se_nc = DecimalUtil.ZERO ;
      Z9933Se_nmp = DecimalUtil.ZERO ;
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
      A9932Se_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A9934Se_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A9935Se_npzcp = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A9936Se_npzcp2 = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A9937Se_npze = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A9938Se_npze2 = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A9939Se_nc = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A9933Se_nmp = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV34Codigo = "" ;
      AV35Pgmname = "" ;
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
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      T015W4_A407EmprNom = new String[] {""} ;
      T015W4_n407EmprNom = new boolean[] {false} ;
      T015W5_A9932Se_cod = new String[] {""} ;
      T015W5_A407EmprNom = new String[] {""} ;
      T015W5_n407EmprNom = new boolean[] {false} ;
      T015W5_A9934Se_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9934Se_np = new boolean[] {false} ;
      T015W5_A9935Se_npzcp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9935Se_npzcp = new boolean[] {false} ;
      T015W5_A9936Se_npzcp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9936Se_npzcp2 = new boolean[] {false} ;
      T015W5_A9937Se_npze = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9937Se_npze = new boolean[] {false} ;
      T015W5_A9938Se_npze2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9938Se_npze2 = new boolean[] {false} ;
      T015W5_A9939Se_nc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9939Se_nc = new boolean[] {false} ;
      T015W5_A9933Se_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W5_n9933Se_nmp = new boolean[] {false} ;
      T015W5_A396EmprCod = new String[] {""} ;
      T015W6_A396EmprCod = new String[] {""} ;
      T015W6_A9932Se_cod = new String[] {""} ;
      T015W3_A9932Se_cod = new String[] {""} ;
      T015W3_A9934Se_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9934Se_np = new boolean[] {false} ;
      T015W3_A9935Se_npzcp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9935Se_npzcp = new boolean[] {false} ;
      T015W3_A9936Se_npzcp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9936Se_npzcp2 = new boolean[] {false} ;
      T015W3_A9937Se_npze = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9937Se_npze = new boolean[] {false} ;
      T015W3_A9938Se_npze2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9938Se_npze2 = new boolean[] {false} ;
      T015W3_A9939Se_nc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9939Se_nc = new boolean[] {false} ;
      T015W3_A9933Se_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W3_n9933Se_nmp = new boolean[] {false} ;
      T015W3_A396EmprCod = new String[] {""} ;
      sMode1320 = "" ;
      T015W7_A396EmprCod = new String[] {""} ;
      T015W7_A9932Se_cod = new String[] {""} ;
      T015W8_A396EmprCod = new String[] {""} ;
      T015W8_A9932Se_cod = new String[] {""} ;
      T015W2_A9932Se_cod = new String[] {""} ;
      T015W2_A9934Se_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9934Se_np = new boolean[] {false} ;
      T015W2_A9935Se_npzcp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9935Se_npzcp = new boolean[] {false} ;
      T015W2_A9936Se_npzcp2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9936Se_npzcp2 = new boolean[] {false} ;
      T015W2_A9937Se_npze = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9937Se_npze = new boolean[] {false} ;
      T015W2_A9938Se_npze2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9938Se_npze2 = new boolean[] {false} ;
      T015W2_A9939Se_nc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9939Se_nc = new boolean[] {false} ;
      T015W2_A9933Se_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015W2_n9933Se_nmp = new boolean[] {false} ;
      T015W2_A396EmprCod = new String[] {""} ;
      T015W12_A396EmprCod = new String[] {""} ;
      T015W12_A9932Se_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T015W13_A407EmprNom = new String[] {""} ;
      T015W13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9932Se_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9934Se_np = DecimalUtil.ZERO ;
      ZZ9935Se_npzcp = DecimalUtil.ZERO ;
      ZZ9936Se_npzcp2 = DecimalUtil.ZERO ;
      ZZ9937Se_npze = DecimalUtil.ZERO ;
      ZZ9938Se_npze2 = DecimalUtil.ZERO ;
      ZZ9939Se_nc = DecimalUtil.ZERO ;
      ZZ9933Se_nmp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactse__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactse__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactse__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactse__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactse__default(),
         new Object[] {
             new Object[] {
            T015W2_A9932Se_cod, T015W2_A9934Se_np, T015W2_n9934Se_np, T015W2_A9935Se_npzcp, T015W2_n9935Se_npzcp, T015W2_A9936Se_npzcp2, T015W2_n9936Se_npzcp2, T015W2_A9937Se_npze, T015W2_n9937Se_npze, T015W2_A9938Se_npze2,
            T015W2_n9938Se_npze2, T015W2_A9939Se_nc, T015W2_n9939Se_nc, T015W2_A9933Se_nmp, T015W2_n9933Se_nmp, T015W2_A396EmprCod
            }
            , new Object[] {
            T015W3_A9932Se_cod, T015W3_A9934Se_np, T015W3_n9934Se_np, T015W3_A9935Se_npzcp, T015W3_n9935Se_npzcp, T015W3_A9936Se_npzcp2, T015W3_n9936Se_npzcp2, T015W3_A9937Se_npze, T015W3_n9937Se_npze, T015W3_A9938Se_npze2,
            T015W3_n9938Se_npze2, T015W3_A9939Se_nc, T015W3_n9939Se_nc, T015W3_A9933Se_nmp, T015W3_n9933Se_nmp, T015W3_A396EmprCod
            }
            , new Object[] {
            T015W4_A407EmprNom, T015W4_n407EmprNom
            }
            , new Object[] {
            T015W5_A9932Se_cod, T015W5_A407EmprNom, T015W5_n407EmprNom, T015W5_A9934Se_np, T015W5_n9934Se_np, T015W5_A9935Se_npzcp, T015W5_n9935Se_npzcp, T015W5_A9936Se_npzcp2, T015W5_n9936Se_npzcp2, T015W5_A9937Se_npze,
            T015W5_n9937Se_npze, T015W5_A9938Se_npze2, T015W5_n9938Se_npze2, T015W5_A9939Se_nc, T015W5_n9939Se_nc, T015W5_A9933Se_nmp, T015W5_n9933Se_nmp, T015W5_A396EmprCod
            }
            , new Object[] {
            T015W6_A396EmprCod, T015W6_A9932Se_cod
            }
            , new Object[] {
            T015W7_A396EmprCod, T015W7_A9932Se_cod
            }
            , new Object[] {
            T015W8_A396EmprCod, T015W8_A9932Se_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015W12_A396EmprCod, T015W12_A9932Se_cod
            }
            , new Object[] {
            T015W13_A407EmprNom, T015W13_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TACTSE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1320 ;
   private short nIsDirty_1320 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtSe_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtSe_np_Enabled ;
   private int edtSe_npzcp_Enabled ;
   private int edtSe_npzcp2_Enabled ;
   private int edtSe_npze_Enabled ;
   private int edtSe_npze2_Enabled ;
   private int edtSe_nc_Enabled ;
   private int edtSe_nmp_Enabled ;
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
   private int edtSe_nmp_Backcolor ;
   private int edtSe_nc_Backcolor ;
   private int edtSe_npze2_Backcolor ;
   private int edtSe_npze_Backcolor ;
   private int edtSe_npzcp2_Backcolor ;
   private int edtSe_npzcp_Backcolor ;
   private int edtSe_np_Backcolor ;
   private int edtSe_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z9934Se_np ;
   private java.math.BigDecimal Z9935Se_npzcp ;
   private java.math.BigDecimal Z9936Se_npzcp2 ;
   private java.math.BigDecimal Z9937Se_npze ;
   private java.math.BigDecimal Z9938Se_npze2 ;
   private java.math.BigDecimal Z9939Se_nc ;
   private java.math.BigDecimal Z9933Se_nmp ;
   private java.math.BigDecimal A9934Se_np ;
   private java.math.BigDecimal A9935Se_npzcp ;
   private java.math.BigDecimal A9936Se_npzcp2 ;
   private java.math.BigDecimal A9937Se_npze ;
   private java.math.BigDecimal A9938Se_npze2 ;
   private java.math.BigDecimal A9939Se_nc ;
   private java.math.BigDecimal A9933Se_nmp ;
   private java.math.BigDecimal ZZ9934Se_np ;
   private java.math.BigDecimal ZZ9935Se_npzcp ;
   private java.math.BigDecimal ZZ9936Se_npzcp2 ;
   private java.math.BigDecimal ZZ9937Se_npze ;
   private java.math.BigDecimal ZZ9938Se_npze2 ;
   private java.math.BigDecimal ZZ9939Se_nc ;
   private java.math.BigDecimal ZZ9933Se_nmp ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9932Se_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSe_cod_Internalname ;
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
   private String A9932Se_cod ;
   private String edtSe_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtSe_np_Internalname ;
   private String edtSe_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtSe_npzcp_Internalname ;
   private String edtSe_npzcp_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtSe_npzcp2_Internalname ;
   private String edtSe_npzcp2_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtSe_npze_Internalname ;
   private String edtSe_npze_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtSe_npze2_Internalname ;
   private String edtSe_npze2_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtSe_nc_Internalname ;
   private String edtSe_nc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtSe_nmp_Internalname ;
   private String edtSe_nmp_Jsonclick ;
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
   private String AV34Codigo ;
   private String AV35Pgmname ;
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
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sMode1320 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9932Se_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9934Se_np ;
   private boolean n9935Se_npzcp ;
   private boolean n9936Se_npzcp2 ;
   private boolean n9937Se_npze ;
   private boolean n9938Se_npze2 ;
   private boolean n9939Se_nc ;
   private boolean n9933Se_nmp ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T015W4_A407EmprNom ;
   private boolean[] T015W4_n407EmprNom ;
   private String[] T015W5_A9932Se_cod ;
   private String[] T015W5_A407EmprNom ;
   private boolean[] T015W5_n407EmprNom ;
   private java.math.BigDecimal[] T015W5_A9934Se_np ;
   private boolean[] T015W5_n9934Se_np ;
   private java.math.BigDecimal[] T015W5_A9935Se_npzcp ;
   private boolean[] T015W5_n9935Se_npzcp ;
   private java.math.BigDecimal[] T015W5_A9936Se_npzcp2 ;
   private boolean[] T015W5_n9936Se_npzcp2 ;
   private java.math.BigDecimal[] T015W5_A9937Se_npze ;
   private boolean[] T015W5_n9937Se_npze ;
   private java.math.BigDecimal[] T015W5_A9938Se_npze2 ;
   private boolean[] T015W5_n9938Se_npze2 ;
   private java.math.BigDecimal[] T015W5_A9939Se_nc ;
   private boolean[] T015W5_n9939Se_nc ;
   private java.math.BigDecimal[] T015W5_A9933Se_nmp ;
   private boolean[] T015W5_n9933Se_nmp ;
   private String[] T015W5_A396EmprCod ;
   private String[] T015W6_A396EmprCod ;
   private String[] T015W6_A9932Se_cod ;
   private String[] T015W3_A9932Se_cod ;
   private java.math.BigDecimal[] T015W3_A9934Se_np ;
   private boolean[] T015W3_n9934Se_np ;
   private java.math.BigDecimal[] T015W3_A9935Se_npzcp ;
   private boolean[] T015W3_n9935Se_npzcp ;
   private java.math.BigDecimal[] T015W3_A9936Se_npzcp2 ;
   private boolean[] T015W3_n9936Se_npzcp2 ;
   private java.math.BigDecimal[] T015W3_A9937Se_npze ;
   private boolean[] T015W3_n9937Se_npze ;
   private java.math.BigDecimal[] T015W3_A9938Se_npze2 ;
   private boolean[] T015W3_n9938Se_npze2 ;
   private java.math.BigDecimal[] T015W3_A9939Se_nc ;
   private boolean[] T015W3_n9939Se_nc ;
   private java.math.BigDecimal[] T015W3_A9933Se_nmp ;
   private boolean[] T015W3_n9933Se_nmp ;
   private String[] T015W3_A396EmprCod ;
   private String[] T015W7_A396EmprCod ;
   private String[] T015W7_A9932Se_cod ;
   private String[] T015W8_A396EmprCod ;
   private String[] T015W8_A9932Se_cod ;
   private String[] T015W2_A9932Se_cod ;
   private java.math.BigDecimal[] T015W2_A9934Se_np ;
   private boolean[] T015W2_n9934Se_np ;
   private java.math.BigDecimal[] T015W2_A9935Se_npzcp ;
   private boolean[] T015W2_n9935Se_npzcp ;
   private java.math.BigDecimal[] T015W2_A9936Se_npzcp2 ;
   private boolean[] T015W2_n9936Se_npzcp2 ;
   private java.math.BigDecimal[] T015W2_A9937Se_npze ;
   private boolean[] T015W2_n9937Se_npze ;
   private java.math.BigDecimal[] T015W2_A9938Se_npze2 ;
   private boolean[] T015W2_n9938Se_npze2 ;
   private java.math.BigDecimal[] T015W2_A9939Se_nc ;
   private boolean[] T015W2_n9939Se_nc ;
   private java.math.BigDecimal[] T015W2_A9933Se_nmp ;
   private boolean[] T015W2_n9933Se_nmp ;
   private String[] T015W2_A396EmprCod ;
   private String[] T015W12_A396EmprCod ;
   private String[] T015W12_A9932Se_cod ;
   private String[] T015W13_A407EmprNom ;
   private boolean[] T015W13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactse__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactse__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactse__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactse__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactse__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015W2", "SELECT Se_cod, Se_np, Se_npzcp, Se_npzcp2, Se_npze, Se_npze2, Se_nc, Se_nmp, EmprCod FROM TXPACTSE WHERE EmprCod = ? AND Se_cod = ?  FOR UPDATE OF Se_np, Se_npzcp, Se_npzcp2, Se_npze, Se_npze2, Se_nc, Se_nmp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W3", "SELECT Se_cod, Se_np, Se_npzcp, Se_npzcp2, Se_npze, Se_npze2, Se_nc, Se_nmp, EmprCod FROM TXPACTSE WHERE EmprCod = ? AND Se_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Se_cod, T2.EmprNom, TM1.Se_np, TM1.Se_npzcp, TM1.Se_npzcp2, TM1.Se_npze, TM1.Se_npze2, TM1.Se_nc, TM1.Se_nmp, TM1.EmprCod FROM (TXPACTSE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Se_cod = ? ORDER BY TM1.EmprCod, TM1.Se_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Se_cod FROM TXPACTSE WHERE EmprCod = ? AND Se_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Se_cod FROM TXPACTSE WHERE ( Se_cod > ?) and EmprCod = ? ORDER BY EmprCod, Se_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015W8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Se_cod FROM TXPACTSE WHERE ( Se_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Se_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015W9", "INSERT INTO TXPACTSE(Se_cod, Se_np, Se_npzcp, Se_npzcp2, Se_npze, Se_npze2, Se_nc, Se_nmp, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTSE")
         ,new UpdateCursor("T015W10", "UPDATE TXPACTSE SET Se_np=?, Se_npzcp=?, Se_npzcp2=?, Se_npze=?, Se_npze2=?, Se_nc=?, Se_nmp=?  WHERE EmprCod = ? AND Se_cod = ?", GX_NOMASK, "TXPACTSE")
         ,new UpdateCursor("T015W11", "DELETE FROM TXPACTSE  WHERE EmprCod = ? AND Se_cod = ?", GX_NOMASK, "TXPACTSE")
         ,new ForEachCursor("T015W12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Se_cod FROM TXPACTSE WHERE EmprCod = ? ORDER BY EmprCod, Se_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015W13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 5);
               }
               stmt.setString(9, (String)parms[15], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setString(9, (String)parms[15], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

