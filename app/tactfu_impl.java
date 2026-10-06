package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactfu_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO ACTIVIDAD FOULARD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFu_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactfu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactfu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactfu_impl.class ));
   }

   public tactfu_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTFU.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_cod_Internalname, GXutil.rtrim( A10157Fu_cod), GXutil.rtrim( localUtil.format( A10157Fu_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_cod_Jsonclick, 0, "", "", "", "", "", 1, edtFu_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_np_Internalname, GXutil.ltrim( localUtil.ntoc( A10158Fu_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_np_Enabled!=0) ? localUtil.format( A10158Fu_np, "ZZ9.99999") : localUtil.format( A10158Fu_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_np_Jsonclick, 0, "", "", "", "", "", 1, edtFu_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N de Baños", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nb1_Internalname, GXutil.ltrim( localUtil.ntoc( A10159Fu_nb1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nb1_Enabled!=0) ? localUtil.format( A10159Fu_nb1, "ZZ9.99999") : localUtil.format( A10159Fu_nb1, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nb1_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nb1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N Formulas Distintas", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nfd1_Internalname, GXutil.ltrim( localUtil.ntoc( A10160Fu_nfd1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nfd1_Enabled!=0) ? localUtil.format( A10160Fu_nfd1, "ZZ9.99999") : localUtil.format( A10160Fu_nfd1, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nfd1_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nfd1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N Piezas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_npz1_Internalname, GXutil.ltrim( localUtil.ntoc( A10161Fu_npz1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_npz1_Enabled!=0) ? localUtil.format( A10161Fu_npz1, "ZZ9.99999") : localUtil.format( A10161Fu_npz1, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_npz1_Jsonclick, 0, "", "", "", "", "", 1, edtFu_npz1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N de Banos", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nb2_Internalname, GXutil.ltrim( localUtil.ntoc( A10162Fu_nb2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nb2_Enabled!=0) ? localUtil.format( A10162Fu_nb2, "ZZ9.99999") : localUtil.format( A10162Fu_nb2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nb2_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nb2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N formulas distsintas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nfd2_Internalname, GXutil.ltrim( localUtil.ntoc( A10163Fu_nfd2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nfd2_Enabled!=0) ? localUtil.format( A10163Fu_nfd2, "ZZ9.99999") : localUtil.format( A10163Fu_nfd2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nfd2_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nfd2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "N de Piezas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_npz2_Internalname, GXutil.ltrim( localUtil.ntoc( A10164Fu_npz2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_npz2_Enabled!=0) ? localUtil.format( A10164Fu_npz2, "ZZ9.99999") : localUtil.format( A10164Fu_npz2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_npz2_Jsonclick, 0, "", "", "", "", "", 1, edtFu_npz2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "N de Piezas", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nb3_Internalname, GXutil.ltrim( localUtil.ntoc( A10165Fu_nb3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nb3_Enabled!=0) ? localUtil.format( A10165Fu_nb3, "ZZ9.99999") : localUtil.format( A10165Fu_nb3, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nb3_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nb3_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N de Baños", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nfd3_Internalname, GXutil.ltrim( localUtil.ntoc( A10166Fu_nfd3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nfd3_Enabled!=0) ? localUtil.format( A10166Fu_nfd3, "ZZ9.99999") : localUtil.format( A10166Fu_nfd3, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nfd3_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nfd3_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "N Formulas Disitintas", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_npz3_Internalname, GXutil.ltrim( localUtil.ntoc( A10167Fu_npz3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_npz3_Enabled!=0) ? localUtil.format( A10167Fu_npz3, "ZZ9.99999") : localUtil.format( A10167Fu_npz3, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_npz3_Jsonclick, 0, "", "", "", "", "", 1, edtFu_npz3_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "N de Aux en Form x Bans", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nax3_Internalname, GXutil.ltrim( localUtil.ntoc( A10168Fu_nax3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nax3_Enabled!=0) ? localUtil.format( A10168Fu_nax3, "ZZ9.99999") : localUtil.format( A10168Fu_nax3, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nax3_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nax3_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "N de Baños", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nb4_Internalname, GXutil.ltrim( localUtil.ntoc( A10169Fu_nb4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nb4_Enabled!=0) ? localUtil.format( A10169Fu_nb4, "ZZ9.99999") : localUtil.format( A10169Fu_nb4, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nb4_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nb4_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "N Formulas Distintas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nfd4_Internalname, GXutil.ltrim( localUtil.ntoc( A10170Fu_nfd4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nfd4_Enabled!=0) ? localUtil.format( A10170Fu_nfd4, "ZZ9.99999") : localUtil.format( A10170Fu_nfd4, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nfd4_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nfd4_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "N de Piezas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_npz4_Internalname, GXutil.ltrim( localUtil.ntoc( A10171Fu_npz4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_npz4_Enabled!=0) ? localUtil.format( A10171Fu_npz4, "ZZ9.99999") : localUtil.format( A10171Fu_npz4, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_npz4_Jsonclick, 0, "", "", "", "", "", 1, edtFu_npz4_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "N de Aux en Form x Bans", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_nax4_Internalname, GXutil.ltrim( localUtil.ntoc( A10172Fu_nax4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_nax4_Enabled!=0) ? localUtil.format( A10172Fu_nax4, "ZZ9.99999") : localUtil.format( A10172Fu_nax4, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_nax4_Jsonclick, 0, "", "", "", "", "", 1, edtFu_nax4_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "N pzs coser cab braz", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_pzccb_Internalname, GXutil.ltrim( localUtil.ntoc( A10173Fu_pzccb, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_pzccb_Enabled!=0) ? localUtil.format( A10173Fu_pzccb, "ZZ9.99999") : localUtil.format( A10173Fu_pzccb, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_pzccb_Jsonclick, 0, "", "", "", "", "", 1, edtFu_pzccb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "N pzs coser cab Tint", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_pzcct_Internalname, GXutil.ltrim( localUtil.ntoc( A10174Fu_pzcct, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_pzcct_Enabled!=0) ? localUtil.format( A10174Fu_pzcct, "ZZ9.99999") : localUtil.format( A10174Fu_pzcct, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_pzcct_Jsonclick, 0, "", "", "", "", "", 1, edtFu_pzcct_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "N Pzs secar desde Braz", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_pzsb_Internalname, GXutil.ltrim( localUtil.ntoc( A10175Fu_pzsb, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_pzsb_Enabled!=0) ? localUtil.format( A10175Fu_pzsb, "ZZ9.99999") : localUtil.format( A10175Fu_pzsb, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_pzsb_Jsonclick, 0, "", "", "", "", "", 1, edtFu_pzsb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "N Pzs secar desde Tint", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFu_pzst_Internalname, GXutil.ltrim( localUtil.ntoc( A10176Fu_pzst, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFu_pzst_Enabled!=0) ? localUtil.format( A10176Fu_pzst, "ZZ9.99999") : localUtil.format( A10176Fu_pzst, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFu_pzst_Jsonclick, 0, "", "", "", "", "", 1, edtFu_pzst_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTFU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTFU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTFU.htm");
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
      e111732 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10157Fu_cod = httpContext.cgiGet( "Z10157Fu_cod") ;
            Z10158Fu_np = localUtil.ctond( httpContext.cgiGet( "Z10158Fu_np")) ;
            Z10159Fu_nb1 = localUtil.ctond( httpContext.cgiGet( "Z10159Fu_nb1")) ;
            Z10160Fu_nfd1 = localUtil.ctond( httpContext.cgiGet( "Z10160Fu_nfd1")) ;
            Z10161Fu_npz1 = localUtil.ctond( httpContext.cgiGet( "Z10161Fu_npz1")) ;
            Z10162Fu_nb2 = localUtil.ctond( httpContext.cgiGet( "Z10162Fu_nb2")) ;
            Z10163Fu_nfd2 = localUtil.ctond( httpContext.cgiGet( "Z10163Fu_nfd2")) ;
            Z10164Fu_npz2 = localUtil.ctond( httpContext.cgiGet( "Z10164Fu_npz2")) ;
            Z10165Fu_nb3 = localUtil.ctond( httpContext.cgiGet( "Z10165Fu_nb3")) ;
            Z10166Fu_nfd3 = localUtil.ctond( httpContext.cgiGet( "Z10166Fu_nfd3")) ;
            Z10167Fu_npz3 = localUtil.ctond( httpContext.cgiGet( "Z10167Fu_npz3")) ;
            Z10168Fu_nax3 = localUtil.ctond( httpContext.cgiGet( "Z10168Fu_nax3")) ;
            Z10169Fu_nb4 = localUtil.ctond( httpContext.cgiGet( "Z10169Fu_nb4")) ;
            Z10170Fu_nfd4 = localUtil.ctond( httpContext.cgiGet( "Z10170Fu_nfd4")) ;
            Z10171Fu_npz4 = localUtil.ctond( httpContext.cgiGet( "Z10171Fu_npz4")) ;
            Z10172Fu_nax4 = localUtil.ctond( httpContext.cgiGet( "Z10172Fu_nax4")) ;
            Z10173Fu_pzccb = localUtil.ctond( httpContext.cgiGet( "Z10173Fu_pzccb")) ;
            Z10174Fu_pzcct = localUtil.ctond( httpContext.cgiGet( "Z10174Fu_pzcct")) ;
            Z10175Fu_pzsb = localUtil.ctond( httpContext.cgiGet( "Z10175Fu_pzsb")) ;
            Z10176Fu_pzst = localUtil.ctond( httpContext.cgiGet( "Z10176Fu_pzst")) ;
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
            A10157Fu_cod = httpContext.cgiGet( edtFu_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10158Fu_np = DecimalUtil.ZERO ;
               n10158Fu_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrimstr( A10158Fu_np, 9, 5));
            }
            else
            {
               A10158Fu_np = localUtil.ctond( httpContext.cgiGet( edtFu_np_Internalname)) ;
               n10158Fu_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrimstr( A10158Fu_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nb1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nb1_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NB1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nb1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10159Fu_nb1 = DecimalUtil.ZERO ;
               n10159Fu_nb1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrimstr( A10159Fu_nb1, 9, 5));
            }
            else
            {
               A10159Fu_nb1 = localUtil.ctond( httpContext.cgiGet( edtFu_nb1_Internalname)) ;
               n10159Fu_nb1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrimstr( A10159Fu_nb1, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nfd1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nfd1_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NFD1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nfd1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10160Fu_nfd1 = DecimalUtil.ZERO ;
               n10160Fu_nfd1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrimstr( A10160Fu_nfd1, 9, 5));
            }
            else
            {
               A10160Fu_nfd1 = localUtil.ctond( httpContext.cgiGet( edtFu_nfd1_Internalname)) ;
               n10160Fu_nfd1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrimstr( A10160Fu_nfd1, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_npz1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_npz1_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NPZ1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_npz1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10161Fu_npz1 = DecimalUtil.ZERO ;
               n10161Fu_npz1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrimstr( A10161Fu_npz1, 9, 5));
            }
            else
            {
               A10161Fu_npz1 = localUtil.ctond( httpContext.cgiGet( edtFu_npz1_Internalname)) ;
               n10161Fu_npz1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrimstr( A10161Fu_npz1, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nb2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nb2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NB2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nb2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10162Fu_nb2 = DecimalUtil.ZERO ;
               n10162Fu_nb2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrimstr( A10162Fu_nb2, 9, 5));
            }
            else
            {
               A10162Fu_nb2 = localUtil.ctond( httpContext.cgiGet( edtFu_nb2_Internalname)) ;
               n10162Fu_nb2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrimstr( A10162Fu_nb2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nfd2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nfd2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NFD2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nfd2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10163Fu_nfd2 = DecimalUtil.ZERO ;
               n10163Fu_nfd2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrimstr( A10163Fu_nfd2, 9, 5));
            }
            else
            {
               A10163Fu_nfd2 = localUtil.ctond( httpContext.cgiGet( edtFu_nfd2_Internalname)) ;
               n10163Fu_nfd2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrimstr( A10163Fu_nfd2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_npz2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_npz2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NPZ2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_npz2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10164Fu_npz2 = DecimalUtil.ZERO ;
               n10164Fu_npz2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrimstr( A10164Fu_npz2, 9, 5));
            }
            else
            {
               A10164Fu_npz2 = localUtil.ctond( httpContext.cgiGet( edtFu_npz2_Internalname)) ;
               n10164Fu_npz2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrimstr( A10164Fu_npz2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nb3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nb3_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NB3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nb3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10165Fu_nb3 = DecimalUtil.ZERO ;
               n10165Fu_nb3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrimstr( A10165Fu_nb3, 9, 5));
            }
            else
            {
               A10165Fu_nb3 = localUtil.ctond( httpContext.cgiGet( edtFu_nb3_Internalname)) ;
               n10165Fu_nb3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrimstr( A10165Fu_nb3, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nfd3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nfd3_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NFD3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nfd3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10166Fu_nfd3 = DecimalUtil.ZERO ;
               n10166Fu_nfd3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrimstr( A10166Fu_nfd3, 9, 5));
            }
            else
            {
               A10166Fu_nfd3 = localUtil.ctond( httpContext.cgiGet( edtFu_nfd3_Internalname)) ;
               n10166Fu_nfd3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrimstr( A10166Fu_nfd3, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_npz3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_npz3_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NPZ3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_npz3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10167Fu_npz3 = DecimalUtil.ZERO ;
               n10167Fu_npz3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrimstr( A10167Fu_npz3, 9, 5));
            }
            else
            {
               A10167Fu_npz3 = localUtil.ctond( httpContext.cgiGet( edtFu_npz3_Internalname)) ;
               n10167Fu_npz3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrimstr( A10167Fu_npz3, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nax3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nax3_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NAX3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nax3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10168Fu_nax3 = DecimalUtil.ZERO ;
               n10168Fu_nax3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrimstr( A10168Fu_nax3, 9, 5));
            }
            else
            {
               A10168Fu_nax3 = localUtil.ctond( httpContext.cgiGet( edtFu_nax3_Internalname)) ;
               n10168Fu_nax3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrimstr( A10168Fu_nax3, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nb4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nb4_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NB4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nb4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10169Fu_nb4 = DecimalUtil.ZERO ;
               n10169Fu_nb4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrimstr( A10169Fu_nb4, 9, 5));
            }
            else
            {
               A10169Fu_nb4 = localUtil.ctond( httpContext.cgiGet( edtFu_nb4_Internalname)) ;
               n10169Fu_nb4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrimstr( A10169Fu_nb4, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nfd4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nfd4_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NFD4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nfd4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10170Fu_nfd4 = DecimalUtil.ZERO ;
               n10170Fu_nfd4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrimstr( A10170Fu_nfd4, 9, 5));
            }
            else
            {
               A10170Fu_nfd4 = localUtil.ctond( httpContext.cgiGet( edtFu_nfd4_Internalname)) ;
               n10170Fu_nfd4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrimstr( A10170Fu_nfd4, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_npz4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_npz4_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NPZ4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_npz4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10171Fu_npz4 = DecimalUtil.ZERO ;
               n10171Fu_npz4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrimstr( A10171Fu_npz4, 9, 5));
            }
            else
            {
               A10171Fu_npz4 = localUtil.ctond( httpContext.cgiGet( edtFu_npz4_Internalname)) ;
               n10171Fu_npz4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrimstr( A10171Fu_npz4, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_nax4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_nax4_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_NAX4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_nax4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10172Fu_nax4 = DecimalUtil.ZERO ;
               n10172Fu_nax4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrimstr( A10172Fu_nax4, 9, 5));
            }
            else
            {
               A10172Fu_nax4 = localUtil.ctond( httpContext.cgiGet( edtFu_nax4_Internalname)) ;
               n10172Fu_nax4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrimstr( A10172Fu_nax4, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_pzccb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_pzccb_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_PZCCB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_pzccb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10173Fu_pzccb = DecimalUtil.ZERO ;
               n10173Fu_pzccb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrimstr( A10173Fu_pzccb, 9, 5));
            }
            else
            {
               A10173Fu_pzccb = localUtil.ctond( httpContext.cgiGet( edtFu_pzccb_Internalname)) ;
               n10173Fu_pzccb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrimstr( A10173Fu_pzccb, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_pzcct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_pzcct_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_PZCCT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_pzcct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10174Fu_pzcct = DecimalUtil.ZERO ;
               n10174Fu_pzcct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrimstr( A10174Fu_pzcct, 9, 5));
            }
            else
            {
               A10174Fu_pzcct = localUtil.ctond( httpContext.cgiGet( edtFu_pzcct_Internalname)) ;
               n10174Fu_pzcct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrimstr( A10174Fu_pzcct, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_pzsb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_pzsb_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_PZSB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_pzsb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10175Fu_pzsb = DecimalUtil.ZERO ;
               n10175Fu_pzsb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrimstr( A10175Fu_pzsb, 9, 5));
            }
            else
            {
               A10175Fu_pzsb = localUtil.ctond( httpContext.cgiGet( edtFu_pzsb_Internalname)) ;
               n10175Fu_pzsb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrimstr( A10175Fu_pzsb, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFu_pzst_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFu_pzst_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FU_PZST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFu_pzst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10176Fu_pzst = DecimalUtil.ZERO ;
               n10176Fu_pzst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrimstr( A10176Fu_pzst, 9, 5));
            }
            else
            {
               A10176Fu_pzst = localUtil.ctond( httpContext.cgiGet( edtFu_pzst_Internalname)) ;
               n10176Fu_pzst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrimstr( A10176Fu_pzst, 9, 5));
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
               A10157Fu_cod = httpContext.GetPar( "Fu_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
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
                        e111732 ();
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
            initAll1731375( ) ;
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
      disableAttributes1731375( ) ;
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

   public void confirm_1730( )
   {
      beforeValidate1731375( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1731375( ) ;
         }
         else
         {
            checkExtendedTable1731375( ) ;
            if ( AnyError == 0 )
            {
               zm1731375( 4) ;
            }
            closeExtendedTableCursors1731375( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1730( ) ;
      }
   }

   public void resetCaption1730( )
   {
   }

   public void e111732( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactfu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tactfu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactfu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactfu_impl.this.A396EmprCod = GXv_char2[0] ;
      tactfu_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactfu_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV34Codigo ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CTACFU", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactfu_impl.this.A396EmprCod = GXv_char4[0] ;
      tactfu_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV34Codigo = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Codigo", AV34Codigo);
      if ( GXutil.strcmp(AV34Codigo, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CTACFU", ""));
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

   public void zm1731375( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10158Fu_np = T01733_A10158Fu_np[0] ;
            Z10159Fu_nb1 = T01733_A10159Fu_nb1[0] ;
            Z10160Fu_nfd1 = T01733_A10160Fu_nfd1[0] ;
            Z10161Fu_npz1 = T01733_A10161Fu_npz1[0] ;
            Z10162Fu_nb2 = T01733_A10162Fu_nb2[0] ;
            Z10163Fu_nfd2 = T01733_A10163Fu_nfd2[0] ;
            Z10164Fu_npz2 = T01733_A10164Fu_npz2[0] ;
            Z10165Fu_nb3 = T01733_A10165Fu_nb3[0] ;
            Z10166Fu_nfd3 = T01733_A10166Fu_nfd3[0] ;
            Z10167Fu_npz3 = T01733_A10167Fu_npz3[0] ;
            Z10168Fu_nax3 = T01733_A10168Fu_nax3[0] ;
            Z10169Fu_nb4 = T01733_A10169Fu_nb4[0] ;
            Z10170Fu_nfd4 = T01733_A10170Fu_nfd4[0] ;
            Z10171Fu_npz4 = T01733_A10171Fu_npz4[0] ;
            Z10172Fu_nax4 = T01733_A10172Fu_nax4[0] ;
            Z10173Fu_pzccb = T01733_A10173Fu_pzccb[0] ;
            Z10174Fu_pzcct = T01733_A10174Fu_pzcct[0] ;
            Z10175Fu_pzsb = T01733_A10175Fu_pzsb[0] ;
            Z10176Fu_pzst = T01733_A10176Fu_pzst[0] ;
         }
         else
         {
            Z10158Fu_np = A10158Fu_np ;
            Z10159Fu_nb1 = A10159Fu_nb1 ;
            Z10160Fu_nfd1 = A10160Fu_nfd1 ;
            Z10161Fu_npz1 = A10161Fu_npz1 ;
            Z10162Fu_nb2 = A10162Fu_nb2 ;
            Z10163Fu_nfd2 = A10163Fu_nfd2 ;
            Z10164Fu_npz2 = A10164Fu_npz2 ;
            Z10165Fu_nb3 = A10165Fu_nb3 ;
            Z10166Fu_nfd3 = A10166Fu_nfd3 ;
            Z10167Fu_npz3 = A10167Fu_npz3 ;
            Z10168Fu_nax3 = A10168Fu_nax3 ;
            Z10169Fu_nb4 = A10169Fu_nb4 ;
            Z10170Fu_nfd4 = A10170Fu_nfd4 ;
            Z10171Fu_npz4 = A10171Fu_npz4 ;
            Z10172Fu_nax4 = A10172Fu_nax4 ;
            Z10173Fu_pzccb = A10173Fu_pzccb ;
            Z10174Fu_pzcct = A10174Fu_pzcct ;
            Z10175Fu_pzsb = A10175Fu_pzsb ;
            Z10176Fu_pzst = A10176Fu_pzst ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z10157Fu_cod = A10157Fu_cod ;
         Z10158Fu_np = A10158Fu_np ;
         Z10159Fu_nb1 = A10159Fu_nb1 ;
         Z10160Fu_nfd1 = A10160Fu_nfd1 ;
         Z10161Fu_npz1 = A10161Fu_npz1 ;
         Z10162Fu_nb2 = A10162Fu_nb2 ;
         Z10163Fu_nfd2 = A10163Fu_nfd2 ;
         Z10164Fu_npz2 = A10164Fu_npz2 ;
         Z10165Fu_nb3 = A10165Fu_nb3 ;
         Z10166Fu_nfd3 = A10166Fu_nfd3 ;
         Z10167Fu_npz3 = A10167Fu_npz3 ;
         Z10168Fu_nax3 = A10168Fu_nax3 ;
         Z10169Fu_nb4 = A10169Fu_nb4 ;
         Z10170Fu_nfd4 = A10170Fu_nfd4 ;
         Z10171Fu_npz4 = A10171Fu_npz4 ;
         Z10172Fu_nax4 = A10172Fu_nax4 ;
         Z10173Fu_pzccb = A10173Fu_pzccb ;
         Z10174Fu_pzcct = A10174Fu_pzcct ;
         Z10175Fu_pzsb = A10175Fu_pzsb ;
         Z10176Fu_pzst = A10176Fu_pzst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TACTFU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T01734 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01734_A407EmprNom[0] ;
      n407EmprNom = T01734_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A10157Fu_cod = AV34Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
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

   public void load1731375( )
   {
      /* Using cursor T01735 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10157Fu_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1375 = (short)(1) ;
         A407EmprNom = T01735_A407EmprNom[0] ;
         n407EmprNom = T01735_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10158Fu_np = T01735_A10158Fu_np[0] ;
         n10158Fu_np = T01735_n10158Fu_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrimstr( A10158Fu_np, 9, 5));
         A10159Fu_nb1 = T01735_A10159Fu_nb1[0] ;
         n10159Fu_nb1 = T01735_n10159Fu_nb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrimstr( A10159Fu_nb1, 9, 5));
         A10160Fu_nfd1 = T01735_A10160Fu_nfd1[0] ;
         n10160Fu_nfd1 = T01735_n10160Fu_nfd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrimstr( A10160Fu_nfd1, 9, 5));
         A10161Fu_npz1 = T01735_A10161Fu_npz1[0] ;
         n10161Fu_npz1 = T01735_n10161Fu_npz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrimstr( A10161Fu_npz1, 9, 5));
         A10162Fu_nb2 = T01735_A10162Fu_nb2[0] ;
         n10162Fu_nb2 = T01735_n10162Fu_nb2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrimstr( A10162Fu_nb2, 9, 5));
         A10163Fu_nfd2 = T01735_A10163Fu_nfd2[0] ;
         n10163Fu_nfd2 = T01735_n10163Fu_nfd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrimstr( A10163Fu_nfd2, 9, 5));
         A10164Fu_npz2 = T01735_A10164Fu_npz2[0] ;
         n10164Fu_npz2 = T01735_n10164Fu_npz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrimstr( A10164Fu_npz2, 9, 5));
         A10165Fu_nb3 = T01735_A10165Fu_nb3[0] ;
         n10165Fu_nb3 = T01735_n10165Fu_nb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrimstr( A10165Fu_nb3, 9, 5));
         A10166Fu_nfd3 = T01735_A10166Fu_nfd3[0] ;
         n10166Fu_nfd3 = T01735_n10166Fu_nfd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrimstr( A10166Fu_nfd3, 9, 5));
         A10167Fu_npz3 = T01735_A10167Fu_npz3[0] ;
         n10167Fu_npz3 = T01735_n10167Fu_npz3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrimstr( A10167Fu_npz3, 9, 5));
         A10168Fu_nax3 = T01735_A10168Fu_nax3[0] ;
         n10168Fu_nax3 = T01735_n10168Fu_nax3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrimstr( A10168Fu_nax3, 9, 5));
         A10169Fu_nb4 = T01735_A10169Fu_nb4[0] ;
         n10169Fu_nb4 = T01735_n10169Fu_nb4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrimstr( A10169Fu_nb4, 9, 5));
         A10170Fu_nfd4 = T01735_A10170Fu_nfd4[0] ;
         n10170Fu_nfd4 = T01735_n10170Fu_nfd4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrimstr( A10170Fu_nfd4, 9, 5));
         A10171Fu_npz4 = T01735_A10171Fu_npz4[0] ;
         n10171Fu_npz4 = T01735_n10171Fu_npz4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrimstr( A10171Fu_npz4, 9, 5));
         A10172Fu_nax4 = T01735_A10172Fu_nax4[0] ;
         n10172Fu_nax4 = T01735_n10172Fu_nax4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrimstr( A10172Fu_nax4, 9, 5));
         A10173Fu_pzccb = T01735_A10173Fu_pzccb[0] ;
         n10173Fu_pzccb = T01735_n10173Fu_pzccb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrimstr( A10173Fu_pzccb, 9, 5));
         A10174Fu_pzcct = T01735_A10174Fu_pzcct[0] ;
         n10174Fu_pzcct = T01735_n10174Fu_pzcct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrimstr( A10174Fu_pzcct, 9, 5));
         A10175Fu_pzsb = T01735_A10175Fu_pzsb[0] ;
         n10175Fu_pzsb = T01735_n10175Fu_pzsb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrimstr( A10175Fu_pzsb, 9, 5));
         A10176Fu_pzst = T01735_A10176Fu_pzst[0] ;
         n10176Fu_pzst = T01735_n10176Fu_pzst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrimstr( A10176Fu_pzst, 9, 5));
         zm1731375( -3) ;
      }
      pr_default.close(3);
      onLoadActions1731375( ) ;
   }

   public void onLoadActions1731375( )
   {
   }

   public void checkExtendedTable1731375( )
   {
      nIsDirty_1375 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A10157Fu_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "FU_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFu_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1731375( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1731375( )
   {
      /* Using cursor T01736 */
      pr_default.execute(4, new Object[] {A396EmprCod, A10157Fu_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1375 = (short)(1) ;
      }
      else
      {
         RcdFound1375 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01733 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10157Fu_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01733_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1731375( 3) ;
         RcdFound1375 = (short)(1) ;
         A10157Fu_cod = T01733_A10157Fu_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
         A10158Fu_np = T01733_A10158Fu_np[0] ;
         n10158Fu_np = T01733_n10158Fu_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrimstr( A10158Fu_np, 9, 5));
         A10159Fu_nb1 = T01733_A10159Fu_nb1[0] ;
         n10159Fu_nb1 = T01733_n10159Fu_nb1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrimstr( A10159Fu_nb1, 9, 5));
         A10160Fu_nfd1 = T01733_A10160Fu_nfd1[0] ;
         n10160Fu_nfd1 = T01733_n10160Fu_nfd1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrimstr( A10160Fu_nfd1, 9, 5));
         A10161Fu_npz1 = T01733_A10161Fu_npz1[0] ;
         n10161Fu_npz1 = T01733_n10161Fu_npz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrimstr( A10161Fu_npz1, 9, 5));
         A10162Fu_nb2 = T01733_A10162Fu_nb2[0] ;
         n10162Fu_nb2 = T01733_n10162Fu_nb2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrimstr( A10162Fu_nb2, 9, 5));
         A10163Fu_nfd2 = T01733_A10163Fu_nfd2[0] ;
         n10163Fu_nfd2 = T01733_n10163Fu_nfd2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrimstr( A10163Fu_nfd2, 9, 5));
         A10164Fu_npz2 = T01733_A10164Fu_npz2[0] ;
         n10164Fu_npz2 = T01733_n10164Fu_npz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrimstr( A10164Fu_npz2, 9, 5));
         A10165Fu_nb3 = T01733_A10165Fu_nb3[0] ;
         n10165Fu_nb3 = T01733_n10165Fu_nb3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrimstr( A10165Fu_nb3, 9, 5));
         A10166Fu_nfd3 = T01733_A10166Fu_nfd3[0] ;
         n10166Fu_nfd3 = T01733_n10166Fu_nfd3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrimstr( A10166Fu_nfd3, 9, 5));
         A10167Fu_npz3 = T01733_A10167Fu_npz3[0] ;
         n10167Fu_npz3 = T01733_n10167Fu_npz3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrimstr( A10167Fu_npz3, 9, 5));
         A10168Fu_nax3 = T01733_A10168Fu_nax3[0] ;
         n10168Fu_nax3 = T01733_n10168Fu_nax3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrimstr( A10168Fu_nax3, 9, 5));
         A10169Fu_nb4 = T01733_A10169Fu_nb4[0] ;
         n10169Fu_nb4 = T01733_n10169Fu_nb4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrimstr( A10169Fu_nb4, 9, 5));
         A10170Fu_nfd4 = T01733_A10170Fu_nfd4[0] ;
         n10170Fu_nfd4 = T01733_n10170Fu_nfd4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrimstr( A10170Fu_nfd4, 9, 5));
         A10171Fu_npz4 = T01733_A10171Fu_npz4[0] ;
         n10171Fu_npz4 = T01733_n10171Fu_npz4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrimstr( A10171Fu_npz4, 9, 5));
         A10172Fu_nax4 = T01733_A10172Fu_nax4[0] ;
         n10172Fu_nax4 = T01733_n10172Fu_nax4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrimstr( A10172Fu_nax4, 9, 5));
         A10173Fu_pzccb = T01733_A10173Fu_pzccb[0] ;
         n10173Fu_pzccb = T01733_n10173Fu_pzccb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrimstr( A10173Fu_pzccb, 9, 5));
         A10174Fu_pzcct = T01733_A10174Fu_pzcct[0] ;
         n10174Fu_pzcct = T01733_n10174Fu_pzcct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrimstr( A10174Fu_pzcct, 9, 5));
         A10175Fu_pzsb = T01733_A10175Fu_pzsb[0] ;
         n10175Fu_pzsb = T01733_n10175Fu_pzsb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrimstr( A10175Fu_pzsb, 9, 5));
         A10176Fu_pzst = T01733_A10176Fu_pzst[0] ;
         n10176Fu_pzst = T01733_n10176Fu_pzst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrimstr( A10176Fu_pzst, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z10157Fu_cod = A10157Fu_cod ;
         sMode1375 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1731375( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1375 = (short)(0) ;
            initializeNonKey1731375( ) ;
         }
         Gx_mode = sMode1375 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1375 = (short)(0) ;
         initializeNonKey1731375( ) ;
         sMode1375 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1375 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1731375( ) ;
      if ( RcdFound1375 == 0 )
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
      RcdFound1375 = (short)(0) ;
      /* Using cursor T01737 */
      pr_default.execute(5, new Object[] {A10157Fu_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01737_A10157Fu_cod[0], A10157Fu_cod) < 0 ) ) && ( GXutil.strcmp(T01737_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01737_A10157Fu_cod[0], A10157Fu_cod) > 0 ) ) && ( GXutil.strcmp(T01737_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10157Fu_cod = T01737_A10157Fu_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
            RcdFound1375 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1375 = (short)(0) ;
      /* Using cursor T01738 */
      pr_default.execute(6, new Object[] {A10157Fu_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01738_A10157Fu_cod[0], A10157Fu_cod) > 0 ) ) && ( GXutil.strcmp(T01738_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01738_A10157Fu_cod[0], A10157Fu_cod) < 0 ) ) && ( GXutil.strcmp(T01738_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10157Fu_cod = T01738_A10157Fu_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
            RcdFound1375 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1731375( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFu_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1731375( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1375 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10157Fu_cod, Z10157Fu_cod) != 0 ) )
            {
               A10157Fu_cod = Z10157Fu_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFu_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1731375( ) ;
               GX_FocusControl = edtFu_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10157Fu_cod, Z10157Fu_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtFu_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1731375( ) ;
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
                  GX_FocusControl = edtFu_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1731375( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10157Fu_cod, Z10157Fu_cod) != 0 ) )
      {
         A10157Fu_cod = Z10157Fu_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFu_cod_Internalname ;
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
      getKey1731375( ) ;
      if ( RcdFound1375 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10157Fu_cod, Z10157Fu_cod) != 0 ) )
         {
            A10157Fu_cod = Z10157Fu_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10157Fu_cod, Z10157Fu_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactfu");
      GX_FocusControl = edtFu_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1730( ) ;
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
      if ( RcdFound1375 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFu_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1731375( ) ;
      if ( RcdFound1375 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFu_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1731375( ) ;
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
      if ( RcdFound1375 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFu_np_Internalname ;
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
      if ( RcdFound1375 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFu_np_Internalname ;
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
      scanStart1731375( ) ;
      if ( RcdFound1375 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1375 != 0 )
         {
            scanNext1731375( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFu_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1731375( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1731375( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01732 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10157Fu_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTFU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10158Fu_np, T01732_A10158Fu_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z10159Fu_nb1, T01732_A10159Fu_nb1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10160Fu_nfd1, T01732_A10160Fu_nfd1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10161Fu_npz1, T01732_A10161Fu_npz1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10162Fu_nb2, T01732_A10162Fu_nb2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10163Fu_nfd2, T01732_A10163Fu_nfd2[0]) != 0 ) || ( DecimalUtil.compareTo(Z10164Fu_npz2, T01732_A10164Fu_npz2[0]) != 0 ) || ( DecimalUtil.compareTo(Z10165Fu_nb3, T01732_A10165Fu_nb3[0]) != 0 ) || ( DecimalUtil.compareTo(Z10166Fu_nfd3, T01732_A10166Fu_nfd3[0]) != 0 ) || ( DecimalUtil.compareTo(Z10167Fu_npz3, T01732_A10167Fu_npz3[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10168Fu_nax3, T01732_A10168Fu_nax3[0]) != 0 ) || ( DecimalUtil.compareTo(Z10169Fu_nb4, T01732_A10169Fu_nb4[0]) != 0 ) || ( DecimalUtil.compareTo(Z10170Fu_nfd4, T01732_A10170Fu_nfd4[0]) != 0 ) || ( DecimalUtil.compareTo(Z10171Fu_npz4, T01732_A10171Fu_npz4[0]) != 0 ) || ( DecimalUtil.compareTo(Z10172Fu_nax4, T01732_A10172Fu_nax4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10173Fu_pzccb, T01732_A10173Fu_pzccb[0]) != 0 ) || ( DecimalUtil.compareTo(Z10174Fu_pzcct, T01732_A10174Fu_pzcct[0]) != 0 ) || ( DecimalUtil.compareTo(Z10175Fu_pzsb, T01732_A10175Fu_pzsb[0]) != 0 ) || ( DecimalUtil.compareTo(Z10176Fu_pzst, T01732_A10176Fu_pzst[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10158Fu_np, T01732_A10158Fu_np[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_np");
               GXutil.writeLogRaw("Old: ",Z10158Fu_np);
               GXutil.writeLogRaw("Current: ",T01732_A10158Fu_np[0]);
            }
            if ( DecimalUtil.compareTo(Z10159Fu_nb1, T01732_A10159Fu_nb1[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nb1");
               GXutil.writeLogRaw("Old: ",Z10159Fu_nb1);
               GXutil.writeLogRaw("Current: ",T01732_A10159Fu_nb1[0]);
            }
            if ( DecimalUtil.compareTo(Z10160Fu_nfd1, T01732_A10160Fu_nfd1[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nfd1");
               GXutil.writeLogRaw("Old: ",Z10160Fu_nfd1);
               GXutil.writeLogRaw("Current: ",T01732_A10160Fu_nfd1[0]);
            }
            if ( DecimalUtil.compareTo(Z10161Fu_npz1, T01732_A10161Fu_npz1[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_npz1");
               GXutil.writeLogRaw("Old: ",Z10161Fu_npz1);
               GXutil.writeLogRaw("Current: ",T01732_A10161Fu_npz1[0]);
            }
            if ( DecimalUtil.compareTo(Z10162Fu_nb2, T01732_A10162Fu_nb2[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nb2");
               GXutil.writeLogRaw("Old: ",Z10162Fu_nb2);
               GXutil.writeLogRaw("Current: ",T01732_A10162Fu_nb2[0]);
            }
            if ( DecimalUtil.compareTo(Z10163Fu_nfd2, T01732_A10163Fu_nfd2[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nfd2");
               GXutil.writeLogRaw("Old: ",Z10163Fu_nfd2);
               GXutil.writeLogRaw("Current: ",T01732_A10163Fu_nfd2[0]);
            }
            if ( DecimalUtil.compareTo(Z10164Fu_npz2, T01732_A10164Fu_npz2[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_npz2");
               GXutil.writeLogRaw("Old: ",Z10164Fu_npz2);
               GXutil.writeLogRaw("Current: ",T01732_A10164Fu_npz2[0]);
            }
            if ( DecimalUtil.compareTo(Z10165Fu_nb3, T01732_A10165Fu_nb3[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nb3");
               GXutil.writeLogRaw("Old: ",Z10165Fu_nb3);
               GXutil.writeLogRaw("Current: ",T01732_A10165Fu_nb3[0]);
            }
            if ( DecimalUtil.compareTo(Z10166Fu_nfd3, T01732_A10166Fu_nfd3[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nfd3");
               GXutil.writeLogRaw("Old: ",Z10166Fu_nfd3);
               GXutil.writeLogRaw("Current: ",T01732_A10166Fu_nfd3[0]);
            }
            if ( DecimalUtil.compareTo(Z10167Fu_npz3, T01732_A10167Fu_npz3[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_npz3");
               GXutil.writeLogRaw("Old: ",Z10167Fu_npz3);
               GXutil.writeLogRaw("Current: ",T01732_A10167Fu_npz3[0]);
            }
            if ( DecimalUtil.compareTo(Z10168Fu_nax3, T01732_A10168Fu_nax3[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nax3");
               GXutil.writeLogRaw("Old: ",Z10168Fu_nax3);
               GXutil.writeLogRaw("Current: ",T01732_A10168Fu_nax3[0]);
            }
            if ( DecimalUtil.compareTo(Z10169Fu_nb4, T01732_A10169Fu_nb4[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nb4");
               GXutil.writeLogRaw("Old: ",Z10169Fu_nb4);
               GXutil.writeLogRaw("Current: ",T01732_A10169Fu_nb4[0]);
            }
            if ( DecimalUtil.compareTo(Z10170Fu_nfd4, T01732_A10170Fu_nfd4[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nfd4");
               GXutil.writeLogRaw("Old: ",Z10170Fu_nfd4);
               GXutil.writeLogRaw("Current: ",T01732_A10170Fu_nfd4[0]);
            }
            if ( DecimalUtil.compareTo(Z10171Fu_npz4, T01732_A10171Fu_npz4[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_npz4");
               GXutil.writeLogRaw("Old: ",Z10171Fu_npz4);
               GXutil.writeLogRaw("Current: ",T01732_A10171Fu_npz4[0]);
            }
            if ( DecimalUtil.compareTo(Z10172Fu_nax4, T01732_A10172Fu_nax4[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_nax4");
               GXutil.writeLogRaw("Old: ",Z10172Fu_nax4);
               GXutil.writeLogRaw("Current: ",T01732_A10172Fu_nax4[0]);
            }
            if ( DecimalUtil.compareTo(Z10173Fu_pzccb, T01732_A10173Fu_pzccb[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_pzccb");
               GXutil.writeLogRaw("Old: ",Z10173Fu_pzccb);
               GXutil.writeLogRaw("Current: ",T01732_A10173Fu_pzccb[0]);
            }
            if ( DecimalUtil.compareTo(Z10174Fu_pzcct, T01732_A10174Fu_pzcct[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_pzcct");
               GXutil.writeLogRaw("Old: ",Z10174Fu_pzcct);
               GXutil.writeLogRaw("Current: ",T01732_A10174Fu_pzcct[0]);
            }
            if ( DecimalUtil.compareTo(Z10175Fu_pzsb, T01732_A10175Fu_pzsb[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_pzsb");
               GXutil.writeLogRaw("Old: ",Z10175Fu_pzsb);
               GXutil.writeLogRaw("Current: ",T01732_A10175Fu_pzsb[0]);
            }
            if ( DecimalUtil.compareTo(Z10176Fu_pzst, T01732_A10176Fu_pzst[0]) != 0 )
            {
               GXutil.writeLogln("tactfu:[seudo value changed for attri]"+"Fu_pzst");
               GXutil.writeLogRaw("Old: ",Z10176Fu_pzst);
               GXutil.writeLogRaw("Current: ",T01732_A10176Fu_pzst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTFU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1731375( )
   {
      beforeValidate1731375( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1731375( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1731375( 0) ;
         checkOptimisticConcurrency1731375( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1731375( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1731375( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01739 */
                  pr_default.execute(7, new Object[] {A10157Fu_cod, Boolean.valueOf(n10158Fu_np), A10158Fu_np, Boolean.valueOf(n10159Fu_nb1), A10159Fu_nb1, Boolean.valueOf(n10160Fu_nfd1), A10160Fu_nfd1, Boolean.valueOf(n10161Fu_npz1), A10161Fu_npz1, Boolean.valueOf(n10162Fu_nb2), A10162Fu_nb2, Boolean.valueOf(n10163Fu_nfd2), A10163Fu_nfd2, Boolean.valueOf(n10164Fu_npz2), A10164Fu_npz2, Boolean.valueOf(n10165Fu_nb3), A10165Fu_nb3, Boolean.valueOf(n10166Fu_nfd3), A10166Fu_nfd3, Boolean.valueOf(n10167Fu_npz3), A10167Fu_npz3, Boolean.valueOf(n10168Fu_nax3), A10168Fu_nax3, Boolean.valueOf(n10169Fu_nb4), A10169Fu_nb4, Boolean.valueOf(n10170Fu_nfd4), A10170Fu_nfd4, Boolean.valueOf(n10171Fu_npz4), A10171Fu_npz4, Boolean.valueOf(n10172Fu_nax4), A10172Fu_nax4, Boolean.valueOf(n10173Fu_pzccb), A10173Fu_pzccb, Boolean.valueOf(n10174Fu_pzcct), A10174Fu_pzcct, Boolean.valueOf(n10175Fu_pzsb), A10175Fu_pzsb, Boolean.valueOf(n10176Fu_pzst), A10176Fu_pzst, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTFU");
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
                        resetCaption1730( ) ;
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
            load1731375( ) ;
         }
         endLevel1731375( ) ;
      }
      closeExtendedTableCursors1731375( ) ;
   }

   public void update1731375( )
   {
      beforeValidate1731375( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1731375( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1731375( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1731375( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1731375( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017310 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10158Fu_np), A10158Fu_np, Boolean.valueOf(n10159Fu_nb1), A10159Fu_nb1, Boolean.valueOf(n10160Fu_nfd1), A10160Fu_nfd1, Boolean.valueOf(n10161Fu_npz1), A10161Fu_npz1, Boolean.valueOf(n10162Fu_nb2), A10162Fu_nb2, Boolean.valueOf(n10163Fu_nfd2), A10163Fu_nfd2, Boolean.valueOf(n10164Fu_npz2), A10164Fu_npz2, Boolean.valueOf(n10165Fu_nb3), A10165Fu_nb3, Boolean.valueOf(n10166Fu_nfd3), A10166Fu_nfd3, Boolean.valueOf(n10167Fu_npz3), A10167Fu_npz3, Boolean.valueOf(n10168Fu_nax3), A10168Fu_nax3, Boolean.valueOf(n10169Fu_nb4), A10169Fu_nb4, Boolean.valueOf(n10170Fu_nfd4), A10170Fu_nfd4, Boolean.valueOf(n10171Fu_npz4), A10171Fu_npz4, Boolean.valueOf(n10172Fu_nax4), A10172Fu_nax4, Boolean.valueOf(n10173Fu_pzccb), A10173Fu_pzccb, Boolean.valueOf(n10174Fu_pzcct), A10174Fu_pzcct, Boolean.valueOf(n10175Fu_pzsb), A10175Fu_pzsb, Boolean.valueOf(n10176Fu_pzst), A10176Fu_pzst, A396EmprCod, A10157Fu_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTFU");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTFU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1731375( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1730( ) ;
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
         endLevel1731375( ) ;
      }
      closeExtendedTableCursors1731375( ) ;
   }

   public void deferredUpdate1731375( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1731375( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1731375( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1731375( ) ;
         afterConfirm1731375( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1731375( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017311 */
               pr_default.execute(9, new Object[] {A396EmprCod, A10157Fu_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTFU");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1375 == 0 )
                     {
                        initAll1731375( ) ;
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
                     resetCaption1730( ) ;
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
      sMode1375 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1731375( ) ;
      Gx_mode = sMode1375 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1731375( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1731375( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1731375( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactfu");
         if ( AnyError == 0 )
         {
            confirmValues1730( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactfu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1731375( )
   {
      /* Scan By routine */
      /* Using cursor T017312 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1375 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1375 = (short)(1) ;
         A10157Fu_cod = T017312_A10157Fu_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1731375( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1375 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1375 = (short)(1) ;
         A10157Fu_cod = T017312_A10157Fu_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
      }
   }

   public void scanEnd1731375( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1731375( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1731375( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1731375( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1731375( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1731375( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1731375( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1731375( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFu_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_cod_Enabled), 5, 0), true);
      edtFu_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_np_Enabled), 5, 0), true);
      edtFu_nb1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nb1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nb1_Enabled), 5, 0), true);
      edtFu_nfd1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nfd1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nfd1_Enabled), 5, 0), true);
      edtFu_npz1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_npz1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_npz1_Enabled), 5, 0), true);
      edtFu_nb2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nb2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nb2_Enabled), 5, 0), true);
      edtFu_nfd2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nfd2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nfd2_Enabled), 5, 0), true);
      edtFu_npz2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_npz2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_npz2_Enabled), 5, 0), true);
      edtFu_nb3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nb3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nb3_Enabled), 5, 0), true);
      edtFu_nfd3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nfd3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nfd3_Enabled), 5, 0), true);
      edtFu_npz3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_npz3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_npz3_Enabled), 5, 0), true);
      edtFu_nax3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nax3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nax3_Enabled), 5, 0), true);
      edtFu_nb4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nb4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nb4_Enabled), 5, 0), true);
      edtFu_nfd4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nfd4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nfd4_Enabled), 5, 0), true);
      edtFu_npz4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_npz4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_npz4_Enabled), 5, 0), true);
      edtFu_nax4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_nax4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_nax4_Enabled), 5, 0), true);
      edtFu_pzccb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_pzccb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_pzccb_Enabled), 5, 0), true);
      edtFu_pzcct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_pzcct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_pzcct_Enabled), 5, 0), true);
      edtFu_pzsb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_pzsb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_pzsb_Enabled), 5, 0), true);
      edtFu_pzst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFu_pzst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFu_pzst_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1731375( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1730( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactfu", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10157Fu_cod", GXutil.rtrim( Z10157Fu_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10158Fu_np", GXutil.ltrim( localUtil.ntoc( Z10158Fu_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10159Fu_nb1", GXutil.ltrim( localUtil.ntoc( Z10159Fu_nb1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10160Fu_nfd1", GXutil.ltrim( localUtil.ntoc( Z10160Fu_nfd1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10161Fu_npz1", GXutil.ltrim( localUtil.ntoc( Z10161Fu_npz1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10162Fu_nb2", GXutil.ltrim( localUtil.ntoc( Z10162Fu_nb2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10163Fu_nfd2", GXutil.ltrim( localUtil.ntoc( Z10163Fu_nfd2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10164Fu_npz2", GXutil.ltrim( localUtil.ntoc( Z10164Fu_npz2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10165Fu_nb3", GXutil.ltrim( localUtil.ntoc( Z10165Fu_nb3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10166Fu_nfd3", GXutil.ltrim( localUtil.ntoc( Z10166Fu_nfd3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10167Fu_npz3", GXutil.ltrim( localUtil.ntoc( Z10167Fu_npz3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10168Fu_nax3", GXutil.ltrim( localUtil.ntoc( Z10168Fu_nax3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10169Fu_nb4", GXutil.ltrim( localUtil.ntoc( Z10169Fu_nb4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10170Fu_nfd4", GXutil.ltrim( localUtil.ntoc( Z10170Fu_nfd4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10171Fu_npz4", GXutil.ltrim( localUtil.ntoc( Z10171Fu_npz4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10172Fu_nax4", GXutil.ltrim( localUtil.ntoc( Z10172Fu_nax4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10173Fu_pzccb", GXutil.ltrim( localUtil.ntoc( Z10173Fu_pzccb, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10174Fu_pzcct", GXutil.ltrim( localUtil.ntoc( Z10174Fu_pzcct, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10175Fu_pzsb", GXutil.ltrim( localUtil.ntoc( Z10175Fu_pzsb, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10176Fu_pzst", GXutil.ltrim( localUtil.ntoc( Z10176Fu_pzst, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tactfu", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTFU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO ACTIVIDAD FOULARD", "") ;
   }

   public void initializeNonKey1731375( )
   {
      A10158Fu_np = DecimalUtil.ZERO ;
      n10158Fu_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrimstr( A10158Fu_np, 9, 5));
      A10159Fu_nb1 = DecimalUtil.ZERO ;
      n10159Fu_nb1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrimstr( A10159Fu_nb1, 9, 5));
      A10160Fu_nfd1 = DecimalUtil.ZERO ;
      n10160Fu_nfd1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrimstr( A10160Fu_nfd1, 9, 5));
      A10161Fu_npz1 = DecimalUtil.ZERO ;
      n10161Fu_npz1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrimstr( A10161Fu_npz1, 9, 5));
      A10162Fu_nb2 = DecimalUtil.ZERO ;
      n10162Fu_nb2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrimstr( A10162Fu_nb2, 9, 5));
      A10163Fu_nfd2 = DecimalUtil.ZERO ;
      n10163Fu_nfd2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrimstr( A10163Fu_nfd2, 9, 5));
      A10164Fu_npz2 = DecimalUtil.ZERO ;
      n10164Fu_npz2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrimstr( A10164Fu_npz2, 9, 5));
      A10165Fu_nb3 = DecimalUtil.ZERO ;
      n10165Fu_nb3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrimstr( A10165Fu_nb3, 9, 5));
      A10166Fu_nfd3 = DecimalUtil.ZERO ;
      n10166Fu_nfd3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrimstr( A10166Fu_nfd3, 9, 5));
      A10167Fu_npz3 = DecimalUtil.ZERO ;
      n10167Fu_npz3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrimstr( A10167Fu_npz3, 9, 5));
      A10168Fu_nax3 = DecimalUtil.ZERO ;
      n10168Fu_nax3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrimstr( A10168Fu_nax3, 9, 5));
      A10169Fu_nb4 = DecimalUtil.ZERO ;
      n10169Fu_nb4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrimstr( A10169Fu_nb4, 9, 5));
      A10170Fu_nfd4 = DecimalUtil.ZERO ;
      n10170Fu_nfd4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrimstr( A10170Fu_nfd4, 9, 5));
      A10171Fu_npz4 = DecimalUtil.ZERO ;
      n10171Fu_npz4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrimstr( A10171Fu_npz4, 9, 5));
      A10172Fu_nax4 = DecimalUtil.ZERO ;
      n10172Fu_nax4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrimstr( A10172Fu_nax4, 9, 5));
      A10173Fu_pzccb = DecimalUtil.ZERO ;
      n10173Fu_pzccb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrimstr( A10173Fu_pzccb, 9, 5));
      A10174Fu_pzcct = DecimalUtil.ZERO ;
      n10174Fu_pzcct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrimstr( A10174Fu_pzcct, 9, 5));
      A10175Fu_pzsb = DecimalUtil.ZERO ;
      n10175Fu_pzsb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrimstr( A10175Fu_pzsb, 9, 5));
      A10176Fu_pzst = DecimalUtil.ZERO ;
      n10176Fu_pzst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrimstr( A10176Fu_pzst, 9, 5));
      Z10158Fu_np = DecimalUtil.ZERO ;
      Z10159Fu_nb1 = DecimalUtil.ZERO ;
      Z10160Fu_nfd1 = DecimalUtil.ZERO ;
      Z10161Fu_npz1 = DecimalUtil.ZERO ;
      Z10162Fu_nb2 = DecimalUtil.ZERO ;
      Z10163Fu_nfd2 = DecimalUtil.ZERO ;
      Z10164Fu_npz2 = DecimalUtil.ZERO ;
      Z10165Fu_nb3 = DecimalUtil.ZERO ;
      Z10166Fu_nfd3 = DecimalUtil.ZERO ;
      Z10167Fu_npz3 = DecimalUtil.ZERO ;
      Z10168Fu_nax3 = DecimalUtil.ZERO ;
      Z10169Fu_nb4 = DecimalUtil.ZERO ;
      Z10170Fu_nfd4 = DecimalUtil.ZERO ;
      Z10171Fu_npz4 = DecimalUtil.ZERO ;
      Z10172Fu_nax4 = DecimalUtil.ZERO ;
      Z10173Fu_pzccb = DecimalUtil.ZERO ;
      Z10174Fu_pzcct = DecimalUtil.ZERO ;
      Z10175Fu_pzsb = DecimalUtil.ZERO ;
      Z10176Fu_pzst = DecimalUtil.ZERO ;
   }

   public void initAll1731375( )
   {
      A10157Fu_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10157Fu_cod", A10157Fu_cod);
      initializeNonKey1731375( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155267", true, true);
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
      httpContext.AddJavascriptSource("tactfu.js", "?2026824155268", false, true);
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
      edtFu_cod_Internalname = "FU_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFu_np_Internalname = "FU_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFu_nb1_Internalname = "FU_NB1" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtFu_nfd1_Internalname = "FU_NFD1" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtFu_npz1_Internalname = "FU_NPZ1" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtFu_nb2_Internalname = "FU_NB2" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtFu_nfd2_Internalname = "FU_NFD2" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtFu_npz2_Internalname = "FU_NPZ2" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFu_nb3_Internalname = "FU_NB3" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtFu_nfd3_Internalname = "FU_NFD3" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtFu_npz3_Internalname = "FU_NPZ3" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtFu_nax3_Internalname = "FU_NAX3" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtFu_nb4_Internalname = "FU_NB4" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtFu_nfd4_Internalname = "FU_NFD4" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtFu_npz4_Internalname = "FU_NPZ4" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtFu_nax4_Internalname = "FU_NAX4" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtFu_pzccb_Internalname = "FU_PZCCB" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtFu_pzcct_Internalname = "FU_PZCCT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtFu_pzsb_Internalname = "FU_PZSB" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtFu_pzst_Internalname = "FU_PZST" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO ACTIVIDAD FOULARD", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFu_pzst_Jsonclick = "" ;
      edtFu_pzst_Backcolor = (int)(0xFFFFFF) ;
      edtFu_pzst_Enabled = 1 ;
      edtFu_pzsb_Jsonclick = "" ;
      edtFu_pzsb_Backcolor = (int)(0xFFFFFF) ;
      edtFu_pzsb_Enabled = 1 ;
      edtFu_pzcct_Jsonclick = "" ;
      edtFu_pzcct_Backcolor = (int)(0xFFFFFF) ;
      edtFu_pzcct_Enabled = 1 ;
      edtFu_pzccb_Jsonclick = "" ;
      edtFu_pzccb_Backcolor = (int)(0xFFFFFF) ;
      edtFu_pzccb_Enabled = 1 ;
      edtFu_nax4_Jsonclick = "" ;
      edtFu_nax4_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nax4_Enabled = 1 ;
      edtFu_npz4_Jsonclick = "" ;
      edtFu_npz4_Backcolor = (int)(0xFFFFFF) ;
      edtFu_npz4_Enabled = 1 ;
      edtFu_nfd4_Jsonclick = "" ;
      edtFu_nfd4_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nfd4_Enabled = 1 ;
      edtFu_nb4_Jsonclick = "" ;
      edtFu_nb4_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nb4_Enabled = 1 ;
      edtFu_nax3_Jsonclick = "" ;
      edtFu_nax3_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nax3_Enabled = 1 ;
      edtFu_npz3_Jsonclick = "" ;
      edtFu_npz3_Backcolor = (int)(0xFFFFFF) ;
      edtFu_npz3_Enabled = 1 ;
      edtFu_nfd3_Jsonclick = "" ;
      edtFu_nfd3_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nfd3_Enabled = 1 ;
      edtFu_nb3_Jsonclick = "" ;
      edtFu_nb3_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nb3_Enabled = 1 ;
      edtFu_npz2_Jsonclick = "" ;
      edtFu_npz2_Backcolor = (int)(0xFFFFFF) ;
      edtFu_npz2_Enabled = 1 ;
      edtFu_nfd2_Jsonclick = "" ;
      edtFu_nfd2_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nfd2_Enabled = 1 ;
      edtFu_nb2_Jsonclick = "" ;
      edtFu_nb2_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nb2_Enabled = 1 ;
      edtFu_npz1_Jsonclick = "" ;
      edtFu_npz1_Backcolor = (int)(0xFFFFFF) ;
      edtFu_npz1_Enabled = 1 ;
      edtFu_nfd1_Jsonclick = "" ;
      edtFu_nfd1_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nfd1_Enabled = 1 ;
      edtFu_nb1_Jsonclick = "" ;
      edtFu_nb1_Backcolor = (int)(0xFFFFFF) ;
      edtFu_nb1_Enabled = 1 ;
      edtFu_np_Jsonclick = "" ;
      edtFu_np_Backcolor = (int)(0xFFFFFF) ;
      edtFu_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFu_cod_Jsonclick = "" ;
      edtFu_cod_Backcolor = (int)(0xFFFFFF) ;
      edtFu_cod_Enabled = 1 ;
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
      /* Using cursor T017313 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017313_A407EmprNom[0] ;
      n407EmprNom = T017313_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtFu_np_Internalname ;
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

   public void valid_Fu_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A10157Fu_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "FU_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFu_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10158Fu_np", GXutil.ltrim( localUtil.ntoc( A10158Fu_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10159Fu_nb1", GXutil.ltrim( localUtil.ntoc( A10159Fu_nb1, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10160Fu_nfd1", GXutil.ltrim( localUtil.ntoc( A10160Fu_nfd1, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10161Fu_npz1", GXutil.ltrim( localUtil.ntoc( A10161Fu_npz1, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10162Fu_nb2", GXutil.ltrim( localUtil.ntoc( A10162Fu_nb2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10163Fu_nfd2", GXutil.ltrim( localUtil.ntoc( A10163Fu_nfd2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10164Fu_npz2", GXutil.ltrim( localUtil.ntoc( A10164Fu_npz2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10165Fu_nb3", GXutil.ltrim( localUtil.ntoc( A10165Fu_nb3, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10166Fu_nfd3", GXutil.ltrim( localUtil.ntoc( A10166Fu_nfd3, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10167Fu_npz3", GXutil.ltrim( localUtil.ntoc( A10167Fu_npz3, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10168Fu_nax3", GXutil.ltrim( localUtil.ntoc( A10168Fu_nax3, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10169Fu_nb4", GXutil.ltrim( localUtil.ntoc( A10169Fu_nb4, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10170Fu_nfd4", GXutil.ltrim( localUtil.ntoc( A10170Fu_nfd4, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10171Fu_npz4", GXutil.ltrim( localUtil.ntoc( A10171Fu_npz4, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10172Fu_nax4", GXutil.ltrim( localUtil.ntoc( A10172Fu_nax4, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10173Fu_pzccb", GXutil.ltrim( localUtil.ntoc( A10173Fu_pzccb, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10174Fu_pzcct", GXutil.ltrim( localUtil.ntoc( A10174Fu_pzcct, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10175Fu_pzsb", GXutil.ltrim( localUtil.ntoc( A10175Fu_pzsb, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10176Fu_pzst", GXutil.ltrim( localUtil.ntoc( A10176Fu_pzst, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10157Fu_cod", GXutil.rtrim( Z10157Fu_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10158Fu_np", GXutil.ltrim( localUtil.ntoc( Z10158Fu_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10159Fu_nb1", GXutil.ltrim( localUtil.ntoc( Z10159Fu_nb1, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10160Fu_nfd1", GXutil.ltrim( localUtil.ntoc( Z10160Fu_nfd1, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10161Fu_npz1", GXutil.ltrim( localUtil.ntoc( Z10161Fu_npz1, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10162Fu_nb2", GXutil.ltrim( localUtil.ntoc( Z10162Fu_nb2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10163Fu_nfd2", GXutil.ltrim( localUtil.ntoc( Z10163Fu_nfd2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10164Fu_npz2", GXutil.ltrim( localUtil.ntoc( Z10164Fu_npz2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10165Fu_nb3", GXutil.ltrim( localUtil.ntoc( Z10165Fu_nb3, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10166Fu_nfd3", GXutil.ltrim( localUtil.ntoc( Z10166Fu_nfd3, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10167Fu_npz3", GXutil.ltrim( localUtil.ntoc( Z10167Fu_npz3, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10168Fu_nax3", GXutil.ltrim( localUtil.ntoc( Z10168Fu_nax3, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10169Fu_nb4", GXutil.ltrim( localUtil.ntoc( Z10169Fu_nb4, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10170Fu_nfd4", GXutil.ltrim( localUtil.ntoc( Z10170Fu_nfd4, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10171Fu_npz4", GXutil.ltrim( localUtil.ntoc( Z10171Fu_npz4, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10172Fu_nax4", GXutil.ltrim( localUtil.ntoc( Z10172Fu_nax4, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10173Fu_pzccb", GXutil.ltrim( localUtil.ntoc( Z10173Fu_pzccb, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10174Fu_pzcct", GXutil.ltrim( localUtil.ntoc( Z10174Fu_pzcct, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10175Fu_pzsb", GXutil.ltrim( localUtil.ntoc( Z10175Fu_pzsb, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10176Fu_pzst", GXutil.ltrim( localUtil.ntoc( Z10176Fu_pzst, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_FU_COD","{handler:'valid_Fu_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10157Fu_cod',fld:'FU_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV34Codigo',fld:'vCODIGO',pic:''}]");
      setEventMetadata("VALID_FU_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10158Fu_np',fld:'FU_NP',pic:'ZZ9.99999'},{av:'A10159Fu_nb1',fld:'FU_NB1',pic:'ZZ9.99999'},{av:'A10160Fu_nfd1',fld:'FU_NFD1',pic:'ZZ9.99999'},{av:'A10161Fu_npz1',fld:'FU_NPZ1',pic:'ZZ9.99999'},{av:'A10162Fu_nb2',fld:'FU_NB2',pic:'ZZ9.99999'},{av:'A10163Fu_nfd2',fld:'FU_NFD2',pic:'ZZ9.99999'},{av:'A10164Fu_npz2',fld:'FU_NPZ2',pic:'ZZ9.99999'},{av:'A10165Fu_nb3',fld:'FU_NB3',pic:'ZZ9.99999'},{av:'A10166Fu_nfd3',fld:'FU_NFD3',pic:'ZZ9.99999'},{av:'A10167Fu_npz3',fld:'FU_NPZ3',pic:'ZZ9.99999'},{av:'A10168Fu_nax3',fld:'FU_NAX3',pic:'ZZ9.99999'},{av:'A10169Fu_nb4',fld:'FU_NB4',pic:'ZZ9.99999'},{av:'A10170Fu_nfd4',fld:'FU_NFD4',pic:'ZZ9.99999'},{av:'A10171Fu_npz4',fld:'FU_NPZ4',pic:'ZZ9.99999'},{av:'A10172Fu_nax4',fld:'FU_NAX4',pic:'ZZ9.99999'},{av:'A10173Fu_pzccb',fld:'FU_PZCCB',pic:'ZZ9.99999'},{av:'A10174Fu_pzcct',fld:'FU_PZCCT',pic:'ZZ9.99999'},{av:'A10175Fu_pzsb',fld:'FU_PZSB',pic:'ZZ9.99999'},{av:'A10176Fu_pzst',fld:'FU_PZST',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10157Fu_cod'},{av:'Z407EmprNom'},{av:'Z10158Fu_np'},{av:'Z10159Fu_nb1'},{av:'Z10160Fu_nfd1'},{av:'Z10161Fu_npz1'},{av:'Z10162Fu_nb2'},{av:'Z10163Fu_nfd2'},{av:'Z10164Fu_npz2'},{av:'Z10165Fu_nb3'},{av:'Z10166Fu_nfd3'},{av:'Z10167Fu_npz3'},{av:'Z10168Fu_nax3'},{av:'Z10169Fu_nb4'},{av:'Z10170Fu_nfd4'},{av:'Z10171Fu_npz4'},{av:'Z10172Fu_nax4'},{av:'Z10173Fu_pzccb'},{av:'Z10174Fu_pzcct'},{av:'Z10175Fu_pzsb'},{av:'Z10176Fu_pzst'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z10157Fu_cod = "" ;
      Z10158Fu_np = DecimalUtil.ZERO ;
      Z10159Fu_nb1 = DecimalUtil.ZERO ;
      Z10160Fu_nfd1 = DecimalUtil.ZERO ;
      Z10161Fu_npz1 = DecimalUtil.ZERO ;
      Z10162Fu_nb2 = DecimalUtil.ZERO ;
      Z10163Fu_nfd2 = DecimalUtil.ZERO ;
      Z10164Fu_npz2 = DecimalUtil.ZERO ;
      Z10165Fu_nb3 = DecimalUtil.ZERO ;
      Z10166Fu_nfd3 = DecimalUtil.ZERO ;
      Z10167Fu_npz3 = DecimalUtil.ZERO ;
      Z10168Fu_nax3 = DecimalUtil.ZERO ;
      Z10169Fu_nb4 = DecimalUtil.ZERO ;
      Z10170Fu_nfd4 = DecimalUtil.ZERO ;
      Z10171Fu_npz4 = DecimalUtil.ZERO ;
      Z10172Fu_nax4 = DecimalUtil.ZERO ;
      Z10173Fu_pzccb = DecimalUtil.ZERO ;
      Z10174Fu_pzcct = DecimalUtil.ZERO ;
      Z10175Fu_pzsb = DecimalUtil.ZERO ;
      Z10176Fu_pzst = DecimalUtil.ZERO ;
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
      A10157Fu_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10158Fu_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A10159Fu_nb1 = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A10160Fu_nfd1 = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A10161Fu_npz1 = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A10162Fu_nb2 = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A10163Fu_nfd2 = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A10164Fu_npz2 = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A10165Fu_nb3 = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A10166Fu_nfd3 = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A10167Fu_npz3 = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A10168Fu_nax3 = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A10169Fu_nb4 = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A10170Fu_nfd4 = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A10171Fu_npz4 = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A10172Fu_nax4 = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A10173Fu_pzccb = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A10174Fu_pzcct = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A10175Fu_pzsb = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A10176Fu_pzst = DecimalUtil.ZERO ;
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
      T01734_A407EmprNom = new String[] {""} ;
      T01734_n407EmprNom = new boolean[] {false} ;
      T01735_A10157Fu_cod = new String[] {""} ;
      T01735_A407EmprNom = new String[] {""} ;
      T01735_n407EmprNom = new boolean[] {false} ;
      T01735_A10158Fu_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10158Fu_np = new boolean[] {false} ;
      T01735_A10159Fu_nb1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10159Fu_nb1 = new boolean[] {false} ;
      T01735_A10160Fu_nfd1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10160Fu_nfd1 = new boolean[] {false} ;
      T01735_A10161Fu_npz1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10161Fu_npz1 = new boolean[] {false} ;
      T01735_A10162Fu_nb2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10162Fu_nb2 = new boolean[] {false} ;
      T01735_A10163Fu_nfd2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10163Fu_nfd2 = new boolean[] {false} ;
      T01735_A10164Fu_npz2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10164Fu_npz2 = new boolean[] {false} ;
      T01735_A10165Fu_nb3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10165Fu_nb3 = new boolean[] {false} ;
      T01735_A10166Fu_nfd3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10166Fu_nfd3 = new boolean[] {false} ;
      T01735_A10167Fu_npz3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10167Fu_npz3 = new boolean[] {false} ;
      T01735_A10168Fu_nax3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10168Fu_nax3 = new boolean[] {false} ;
      T01735_A10169Fu_nb4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10169Fu_nb4 = new boolean[] {false} ;
      T01735_A10170Fu_nfd4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10170Fu_nfd4 = new boolean[] {false} ;
      T01735_A10171Fu_npz4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10171Fu_npz4 = new boolean[] {false} ;
      T01735_A10172Fu_nax4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10172Fu_nax4 = new boolean[] {false} ;
      T01735_A10173Fu_pzccb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10173Fu_pzccb = new boolean[] {false} ;
      T01735_A10174Fu_pzcct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10174Fu_pzcct = new boolean[] {false} ;
      T01735_A10175Fu_pzsb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10175Fu_pzsb = new boolean[] {false} ;
      T01735_A10176Fu_pzst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01735_n10176Fu_pzst = new boolean[] {false} ;
      T01735_A396EmprCod = new String[] {""} ;
      T01736_A396EmprCod = new String[] {""} ;
      T01736_A10157Fu_cod = new String[] {""} ;
      T01733_A10157Fu_cod = new String[] {""} ;
      T01733_A10158Fu_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10158Fu_np = new boolean[] {false} ;
      T01733_A10159Fu_nb1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10159Fu_nb1 = new boolean[] {false} ;
      T01733_A10160Fu_nfd1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10160Fu_nfd1 = new boolean[] {false} ;
      T01733_A10161Fu_npz1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10161Fu_npz1 = new boolean[] {false} ;
      T01733_A10162Fu_nb2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10162Fu_nb2 = new boolean[] {false} ;
      T01733_A10163Fu_nfd2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10163Fu_nfd2 = new boolean[] {false} ;
      T01733_A10164Fu_npz2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10164Fu_npz2 = new boolean[] {false} ;
      T01733_A10165Fu_nb3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10165Fu_nb3 = new boolean[] {false} ;
      T01733_A10166Fu_nfd3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10166Fu_nfd3 = new boolean[] {false} ;
      T01733_A10167Fu_npz3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10167Fu_npz3 = new boolean[] {false} ;
      T01733_A10168Fu_nax3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10168Fu_nax3 = new boolean[] {false} ;
      T01733_A10169Fu_nb4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10169Fu_nb4 = new boolean[] {false} ;
      T01733_A10170Fu_nfd4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10170Fu_nfd4 = new boolean[] {false} ;
      T01733_A10171Fu_npz4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10171Fu_npz4 = new boolean[] {false} ;
      T01733_A10172Fu_nax4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10172Fu_nax4 = new boolean[] {false} ;
      T01733_A10173Fu_pzccb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10173Fu_pzccb = new boolean[] {false} ;
      T01733_A10174Fu_pzcct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10174Fu_pzcct = new boolean[] {false} ;
      T01733_A10175Fu_pzsb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10175Fu_pzsb = new boolean[] {false} ;
      T01733_A10176Fu_pzst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01733_n10176Fu_pzst = new boolean[] {false} ;
      T01733_A396EmprCod = new String[] {""} ;
      sMode1375 = "" ;
      T01737_A396EmprCod = new String[] {""} ;
      T01737_A10157Fu_cod = new String[] {""} ;
      T01738_A396EmprCod = new String[] {""} ;
      T01738_A10157Fu_cod = new String[] {""} ;
      T01732_A10157Fu_cod = new String[] {""} ;
      T01732_A10158Fu_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10158Fu_np = new boolean[] {false} ;
      T01732_A10159Fu_nb1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10159Fu_nb1 = new boolean[] {false} ;
      T01732_A10160Fu_nfd1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10160Fu_nfd1 = new boolean[] {false} ;
      T01732_A10161Fu_npz1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10161Fu_npz1 = new boolean[] {false} ;
      T01732_A10162Fu_nb2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10162Fu_nb2 = new boolean[] {false} ;
      T01732_A10163Fu_nfd2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10163Fu_nfd2 = new boolean[] {false} ;
      T01732_A10164Fu_npz2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10164Fu_npz2 = new boolean[] {false} ;
      T01732_A10165Fu_nb3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10165Fu_nb3 = new boolean[] {false} ;
      T01732_A10166Fu_nfd3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10166Fu_nfd3 = new boolean[] {false} ;
      T01732_A10167Fu_npz3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10167Fu_npz3 = new boolean[] {false} ;
      T01732_A10168Fu_nax3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10168Fu_nax3 = new boolean[] {false} ;
      T01732_A10169Fu_nb4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10169Fu_nb4 = new boolean[] {false} ;
      T01732_A10170Fu_nfd4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10170Fu_nfd4 = new boolean[] {false} ;
      T01732_A10171Fu_npz4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10171Fu_npz4 = new boolean[] {false} ;
      T01732_A10172Fu_nax4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10172Fu_nax4 = new boolean[] {false} ;
      T01732_A10173Fu_pzccb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10173Fu_pzccb = new boolean[] {false} ;
      T01732_A10174Fu_pzcct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10174Fu_pzcct = new boolean[] {false} ;
      T01732_A10175Fu_pzsb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10175Fu_pzsb = new boolean[] {false} ;
      T01732_A10176Fu_pzst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01732_n10176Fu_pzst = new boolean[] {false} ;
      T01732_A396EmprCod = new String[] {""} ;
      T017312_A396EmprCod = new String[] {""} ;
      T017312_A10157Fu_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T017313_A407EmprNom = new String[] {""} ;
      T017313_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10157Fu_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10158Fu_np = DecimalUtil.ZERO ;
      ZZ10159Fu_nb1 = DecimalUtil.ZERO ;
      ZZ10160Fu_nfd1 = DecimalUtil.ZERO ;
      ZZ10161Fu_npz1 = DecimalUtil.ZERO ;
      ZZ10162Fu_nb2 = DecimalUtil.ZERO ;
      ZZ10163Fu_nfd2 = DecimalUtil.ZERO ;
      ZZ10164Fu_npz2 = DecimalUtil.ZERO ;
      ZZ10165Fu_nb3 = DecimalUtil.ZERO ;
      ZZ10166Fu_nfd3 = DecimalUtil.ZERO ;
      ZZ10167Fu_npz3 = DecimalUtil.ZERO ;
      ZZ10168Fu_nax3 = DecimalUtil.ZERO ;
      ZZ10169Fu_nb4 = DecimalUtil.ZERO ;
      ZZ10170Fu_nfd4 = DecimalUtil.ZERO ;
      ZZ10171Fu_npz4 = DecimalUtil.ZERO ;
      ZZ10172Fu_nax4 = DecimalUtil.ZERO ;
      ZZ10173Fu_pzccb = DecimalUtil.ZERO ;
      ZZ10174Fu_pzcct = DecimalUtil.ZERO ;
      ZZ10175Fu_pzsb = DecimalUtil.ZERO ;
      ZZ10176Fu_pzst = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactfu__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactfu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactfu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactfu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactfu__default(),
         new Object[] {
             new Object[] {
            T01732_A10157Fu_cod, T01732_A10158Fu_np, T01732_n10158Fu_np, T01732_A10159Fu_nb1, T01732_n10159Fu_nb1, T01732_A10160Fu_nfd1, T01732_n10160Fu_nfd1, T01732_A10161Fu_npz1, T01732_n10161Fu_npz1, T01732_A10162Fu_nb2,
            T01732_n10162Fu_nb2, T01732_A10163Fu_nfd2, T01732_n10163Fu_nfd2, T01732_A10164Fu_npz2, T01732_n10164Fu_npz2, T01732_A10165Fu_nb3, T01732_n10165Fu_nb3, T01732_A10166Fu_nfd3, T01732_n10166Fu_nfd3, T01732_A10167Fu_npz3,
            T01732_n10167Fu_npz3, T01732_A10168Fu_nax3, T01732_n10168Fu_nax3, T01732_A10169Fu_nb4, T01732_n10169Fu_nb4, T01732_A10170Fu_nfd4, T01732_n10170Fu_nfd4, T01732_A10171Fu_npz4, T01732_n10171Fu_npz4, T01732_A10172Fu_nax4,
            T01732_n10172Fu_nax4, T01732_A10173Fu_pzccb, T01732_n10173Fu_pzccb, T01732_A10174Fu_pzcct, T01732_n10174Fu_pzcct, T01732_A10175Fu_pzsb, T01732_n10175Fu_pzsb, T01732_A10176Fu_pzst, T01732_n10176Fu_pzst, T01732_A396EmprCod
            }
            , new Object[] {
            T01733_A10157Fu_cod, T01733_A10158Fu_np, T01733_n10158Fu_np, T01733_A10159Fu_nb1, T01733_n10159Fu_nb1, T01733_A10160Fu_nfd1, T01733_n10160Fu_nfd1, T01733_A10161Fu_npz1, T01733_n10161Fu_npz1, T01733_A10162Fu_nb2,
            T01733_n10162Fu_nb2, T01733_A10163Fu_nfd2, T01733_n10163Fu_nfd2, T01733_A10164Fu_npz2, T01733_n10164Fu_npz2, T01733_A10165Fu_nb3, T01733_n10165Fu_nb3, T01733_A10166Fu_nfd3, T01733_n10166Fu_nfd3, T01733_A10167Fu_npz3,
            T01733_n10167Fu_npz3, T01733_A10168Fu_nax3, T01733_n10168Fu_nax3, T01733_A10169Fu_nb4, T01733_n10169Fu_nb4, T01733_A10170Fu_nfd4, T01733_n10170Fu_nfd4, T01733_A10171Fu_npz4, T01733_n10171Fu_npz4, T01733_A10172Fu_nax4,
            T01733_n10172Fu_nax4, T01733_A10173Fu_pzccb, T01733_n10173Fu_pzccb, T01733_A10174Fu_pzcct, T01733_n10174Fu_pzcct, T01733_A10175Fu_pzsb, T01733_n10175Fu_pzsb, T01733_A10176Fu_pzst, T01733_n10176Fu_pzst, T01733_A396EmprCod
            }
            , new Object[] {
            T01734_A407EmprNom, T01734_n407EmprNom
            }
            , new Object[] {
            T01735_A10157Fu_cod, T01735_A407EmprNom, T01735_n407EmprNom, T01735_A10158Fu_np, T01735_n10158Fu_np, T01735_A10159Fu_nb1, T01735_n10159Fu_nb1, T01735_A10160Fu_nfd1, T01735_n10160Fu_nfd1, T01735_A10161Fu_npz1,
            T01735_n10161Fu_npz1, T01735_A10162Fu_nb2, T01735_n10162Fu_nb2, T01735_A10163Fu_nfd2, T01735_n10163Fu_nfd2, T01735_A10164Fu_npz2, T01735_n10164Fu_npz2, T01735_A10165Fu_nb3, T01735_n10165Fu_nb3, T01735_A10166Fu_nfd3,
            T01735_n10166Fu_nfd3, T01735_A10167Fu_npz3, T01735_n10167Fu_npz3, T01735_A10168Fu_nax3, T01735_n10168Fu_nax3, T01735_A10169Fu_nb4, T01735_n10169Fu_nb4, T01735_A10170Fu_nfd4, T01735_n10170Fu_nfd4, T01735_A10171Fu_npz4,
            T01735_n10171Fu_npz4, T01735_A10172Fu_nax4, T01735_n10172Fu_nax4, T01735_A10173Fu_pzccb, T01735_n10173Fu_pzccb, T01735_A10174Fu_pzcct, T01735_n10174Fu_pzcct, T01735_A10175Fu_pzsb, T01735_n10175Fu_pzsb, T01735_A10176Fu_pzst,
            T01735_n10176Fu_pzst, T01735_A396EmprCod
            }
            , new Object[] {
            T01736_A396EmprCod, T01736_A10157Fu_cod
            }
            , new Object[] {
            T01737_A396EmprCod, T01737_A10157Fu_cod
            }
            , new Object[] {
            T01738_A396EmprCod, T01738_A10157Fu_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017312_A396EmprCod, T017312_A10157Fu_cod
            }
            , new Object[] {
            T017313_A407EmprNom, T017313_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TACTFU" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1375 ;
   private short nIsDirty_1375 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFu_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFu_np_Enabled ;
   private int edtFu_nb1_Enabled ;
   private int edtFu_nfd1_Enabled ;
   private int edtFu_npz1_Enabled ;
   private int edtFu_nb2_Enabled ;
   private int edtFu_nfd2_Enabled ;
   private int edtFu_npz2_Enabled ;
   private int edtFu_nb3_Enabled ;
   private int edtFu_nfd3_Enabled ;
   private int edtFu_npz3_Enabled ;
   private int edtFu_nax3_Enabled ;
   private int edtFu_nb4_Enabled ;
   private int edtFu_nfd4_Enabled ;
   private int edtFu_npz4_Enabled ;
   private int edtFu_nax4_Enabled ;
   private int edtFu_pzccb_Enabled ;
   private int edtFu_pzcct_Enabled ;
   private int edtFu_pzsb_Enabled ;
   private int edtFu_pzst_Enabled ;
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
   private int edtFu_pzst_Backcolor ;
   private int edtFu_pzsb_Backcolor ;
   private int edtFu_pzcct_Backcolor ;
   private int edtFu_pzccb_Backcolor ;
   private int edtFu_nax4_Backcolor ;
   private int edtFu_npz4_Backcolor ;
   private int edtFu_nfd4_Backcolor ;
   private int edtFu_nb4_Backcolor ;
   private int edtFu_nax3_Backcolor ;
   private int edtFu_npz3_Backcolor ;
   private int edtFu_nfd3_Backcolor ;
   private int edtFu_nb3_Backcolor ;
   private int edtFu_npz2_Backcolor ;
   private int edtFu_nfd2_Backcolor ;
   private int edtFu_nb2_Backcolor ;
   private int edtFu_npz1_Backcolor ;
   private int edtFu_nfd1_Backcolor ;
   private int edtFu_nb1_Backcolor ;
   private int edtFu_np_Backcolor ;
   private int edtFu_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z10158Fu_np ;
   private java.math.BigDecimal Z10159Fu_nb1 ;
   private java.math.BigDecimal Z10160Fu_nfd1 ;
   private java.math.BigDecimal Z10161Fu_npz1 ;
   private java.math.BigDecimal Z10162Fu_nb2 ;
   private java.math.BigDecimal Z10163Fu_nfd2 ;
   private java.math.BigDecimal Z10164Fu_npz2 ;
   private java.math.BigDecimal Z10165Fu_nb3 ;
   private java.math.BigDecimal Z10166Fu_nfd3 ;
   private java.math.BigDecimal Z10167Fu_npz3 ;
   private java.math.BigDecimal Z10168Fu_nax3 ;
   private java.math.BigDecimal Z10169Fu_nb4 ;
   private java.math.BigDecimal Z10170Fu_nfd4 ;
   private java.math.BigDecimal Z10171Fu_npz4 ;
   private java.math.BigDecimal Z10172Fu_nax4 ;
   private java.math.BigDecimal Z10173Fu_pzccb ;
   private java.math.BigDecimal Z10174Fu_pzcct ;
   private java.math.BigDecimal Z10175Fu_pzsb ;
   private java.math.BigDecimal Z10176Fu_pzst ;
   private java.math.BigDecimal A10158Fu_np ;
   private java.math.BigDecimal A10159Fu_nb1 ;
   private java.math.BigDecimal A10160Fu_nfd1 ;
   private java.math.BigDecimal A10161Fu_npz1 ;
   private java.math.BigDecimal A10162Fu_nb2 ;
   private java.math.BigDecimal A10163Fu_nfd2 ;
   private java.math.BigDecimal A10164Fu_npz2 ;
   private java.math.BigDecimal A10165Fu_nb3 ;
   private java.math.BigDecimal A10166Fu_nfd3 ;
   private java.math.BigDecimal A10167Fu_npz3 ;
   private java.math.BigDecimal A10168Fu_nax3 ;
   private java.math.BigDecimal A10169Fu_nb4 ;
   private java.math.BigDecimal A10170Fu_nfd4 ;
   private java.math.BigDecimal A10171Fu_npz4 ;
   private java.math.BigDecimal A10172Fu_nax4 ;
   private java.math.BigDecimal A10173Fu_pzccb ;
   private java.math.BigDecimal A10174Fu_pzcct ;
   private java.math.BigDecimal A10175Fu_pzsb ;
   private java.math.BigDecimal A10176Fu_pzst ;
   private java.math.BigDecimal ZZ10158Fu_np ;
   private java.math.BigDecimal ZZ10159Fu_nb1 ;
   private java.math.BigDecimal ZZ10160Fu_nfd1 ;
   private java.math.BigDecimal ZZ10161Fu_npz1 ;
   private java.math.BigDecimal ZZ10162Fu_nb2 ;
   private java.math.BigDecimal ZZ10163Fu_nfd2 ;
   private java.math.BigDecimal ZZ10164Fu_npz2 ;
   private java.math.BigDecimal ZZ10165Fu_nb3 ;
   private java.math.BigDecimal ZZ10166Fu_nfd3 ;
   private java.math.BigDecimal ZZ10167Fu_npz3 ;
   private java.math.BigDecimal ZZ10168Fu_nax3 ;
   private java.math.BigDecimal ZZ10169Fu_nb4 ;
   private java.math.BigDecimal ZZ10170Fu_nfd4 ;
   private java.math.BigDecimal ZZ10171Fu_npz4 ;
   private java.math.BigDecimal ZZ10172Fu_nax4 ;
   private java.math.BigDecimal ZZ10173Fu_pzccb ;
   private java.math.BigDecimal ZZ10174Fu_pzcct ;
   private java.math.BigDecimal ZZ10175Fu_pzsb ;
   private java.math.BigDecimal ZZ10176Fu_pzst ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10157Fu_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFu_cod_Internalname ;
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
   private String A10157Fu_cod ;
   private String edtFu_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtFu_np_Internalname ;
   private String edtFu_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtFu_nb1_Internalname ;
   private String edtFu_nb1_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtFu_nfd1_Internalname ;
   private String edtFu_nfd1_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtFu_npz1_Internalname ;
   private String edtFu_npz1_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtFu_nb2_Internalname ;
   private String edtFu_nb2_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtFu_nfd2_Internalname ;
   private String edtFu_nfd2_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtFu_npz2_Internalname ;
   private String edtFu_npz2_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFu_nb3_Internalname ;
   private String edtFu_nb3_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtFu_nfd3_Internalname ;
   private String edtFu_nfd3_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtFu_npz3_Internalname ;
   private String edtFu_npz3_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtFu_nax3_Internalname ;
   private String edtFu_nax3_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtFu_nb4_Internalname ;
   private String edtFu_nb4_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtFu_nfd4_Internalname ;
   private String edtFu_nfd4_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtFu_npz4_Internalname ;
   private String edtFu_npz4_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtFu_nax4_Internalname ;
   private String edtFu_nax4_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtFu_pzccb_Internalname ;
   private String edtFu_pzccb_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtFu_pzcct_Internalname ;
   private String edtFu_pzcct_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtFu_pzsb_Internalname ;
   private String edtFu_pzsb_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtFu_pzst_Internalname ;
   private String edtFu_pzst_Jsonclick ;
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
   private String sMode1375 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10157Fu_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10158Fu_np ;
   private boolean n10159Fu_nb1 ;
   private boolean n10160Fu_nfd1 ;
   private boolean n10161Fu_npz1 ;
   private boolean n10162Fu_nb2 ;
   private boolean n10163Fu_nfd2 ;
   private boolean n10164Fu_npz2 ;
   private boolean n10165Fu_nb3 ;
   private boolean n10166Fu_nfd3 ;
   private boolean n10167Fu_npz3 ;
   private boolean n10168Fu_nax3 ;
   private boolean n10169Fu_nb4 ;
   private boolean n10170Fu_nfd4 ;
   private boolean n10171Fu_npz4 ;
   private boolean n10172Fu_nax4 ;
   private boolean n10173Fu_pzccb ;
   private boolean n10174Fu_pzcct ;
   private boolean n10175Fu_pzsb ;
   private boolean n10176Fu_pzst ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01734_A407EmprNom ;
   private boolean[] T01734_n407EmprNom ;
   private String[] T01735_A10157Fu_cod ;
   private String[] T01735_A407EmprNom ;
   private boolean[] T01735_n407EmprNom ;
   private java.math.BigDecimal[] T01735_A10158Fu_np ;
   private boolean[] T01735_n10158Fu_np ;
   private java.math.BigDecimal[] T01735_A10159Fu_nb1 ;
   private boolean[] T01735_n10159Fu_nb1 ;
   private java.math.BigDecimal[] T01735_A10160Fu_nfd1 ;
   private boolean[] T01735_n10160Fu_nfd1 ;
   private java.math.BigDecimal[] T01735_A10161Fu_npz1 ;
   private boolean[] T01735_n10161Fu_npz1 ;
   private java.math.BigDecimal[] T01735_A10162Fu_nb2 ;
   private boolean[] T01735_n10162Fu_nb2 ;
   private java.math.BigDecimal[] T01735_A10163Fu_nfd2 ;
   private boolean[] T01735_n10163Fu_nfd2 ;
   private java.math.BigDecimal[] T01735_A10164Fu_npz2 ;
   private boolean[] T01735_n10164Fu_npz2 ;
   private java.math.BigDecimal[] T01735_A10165Fu_nb3 ;
   private boolean[] T01735_n10165Fu_nb3 ;
   private java.math.BigDecimal[] T01735_A10166Fu_nfd3 ;
   private boolean[] T01735_n10166Fu_nfd3 ;
   private java.math.BigDecimal[] T01735_A10167Fu_npz3 ;
   private boolean[] T01735_n10167Fu_npz3 ;
   private java.math.BigDecimal[] T01735_A10168Fu_nax3 ;
   private boolean[] T01735_n10168Fu_nax3 ;
   private java.math.BigDecimal[] T01735_A10169Fu_nb4 ;
   private boolean[] T01735_n10169Fu_nb4 ;
   private java.math.BigDecimal[] T01735_A10170Fu_nfd4 ;
   private boolean[] T01735_n10170Fu_nfd4 ;
   private java.math.BigDecimal[] T01735_A10171Fu_npz4 ;
   private boolean[] T01735_n10171Fu_npz4 ;
   private java.math.BigDecimal[] T01735_A10172Fu_nax4 ;
   private boolean[] T01735_n10172Fu_nax4 ;
   private java.math.BigDecimal[] T01735_A10173Fu_pzccb ;
   private boolean[] T01735_n10173Fu_pzccb ;
   private java.math.BigDecimal[] T01735_A10174Fu_pzcct ;
   private boolean[] T01735_n10174Fu_pzcct ;
   private java.math.BigDecimal[] T01735_A10175Fu_pzsb ;
   private boolean[] T01735_n10175Fu_pzsb ;
   private java.math.BigDecimal[] T01735_A10176Fu_pzst ;
   private boolean[] T01735_n10176Fu_pzst ;
   private String[] T01735_A396EmprCod ;
   private String[] T01736_A396EmprCod ;
   private String[] T01736_A10157Fu_cod ;
   private String[] T01733_A10157Fu_cod ;
   private java.math.BigDecimal[] T01733_A10158Fu_np ;
   private boolean[] T01733_n10158Fu_np ;
   private java.math.BigDecimal[] T01733_A10159Fu_nb1 ;
   private boolean[] T01733_n10159Fu_nb1 ;
   private java.math.BigDecimal[] T01733_A10160Fu_nfd1 ;
   private boolean[] T01733_n10160Fu_nfd1 ;
   private java.math.BigDecimal[] T01733_A10161Fu_npz1 ;
   private boolean[] T01733_n10161Fu_npz1 ;
   private java.math.BigDecimal[] T01733_A10162Fu_nb2 ;
   private boolean[] T01733_n10162Fu_nb2 ;
   private java.math.BigDecimal[] T01733_A10163Fu_nfd2 ;
   private boolean[] T01733_n10163Fu_nfd2 ;
   private java.math.BigDecimal[] T01733_A10164Fu_npz2 ;
   private boolean[] T01733_n10164Fu_npz2 ;
   private java.math.BigDecimal[] T01733_A10165Fu_nb3 ;
   private boolean[] T01733_n10165Fu_nb3 ;
   private java.math.BigDecimal[] T01733_A10166Fu_nfd3 ;
   private boolean[] T01733_n10166Fu_nfd3 ;
   private java.math.BigDecimal[] T01733_A10167Fu_npz3 ;
   private boolean[] T01733_n10167Fu_npz3 ;
   private java.math.BigDecimal[] T01733_A10168Fu_nax3 ;
   private boolean[] T01733_n10168Fu_nax3 ;
   private java.math.BigDecimal[] T01733_A10169Fu_nb4 ;
   private boolean[] T01733_n10169Fu_nb4 ;
   private java.math.BigDecimal[] T01733_A10170Fu_nfd4 ;
   private boolean[] T01733_n10170Fu_nfd4 ;
   private java.math.BigDecimal[] T01733_A10171Fu_npz4 ;
   private boolean[] T01733_n10171Fu_npz4 ;
   private java.math.BigDecimal[] T01733_A10172Fu_nax4 ;
   private boolean[] T01733_n10172Fu_nax4 ;
   private java.math.BigDecimal[] T01733_A10173Fu_pzccb ;
   private boolean[] T01733_n10173Fu_pzccb ;
   private java.math.BigDecimal[] T01733_A10174Fu_pzcct ;
   private boolean[] T01733_n10174Fu_pzcct ;
   private java.math.BigDecimal[] T01733_A10175Fu_pzsb ;
   private boolean[] T01733_n10175Fu_pzsb ;
   private java.math.BigDecimal[] T01733_A10176Fu_pzst ;
   private boolean[] T01733_n10176Fu_pzst ;
   private String[] T01733_A396EmprCod ;
   private String[] T01737_A396EmprCod ;
   private String[] T01737_A10157Fu_cod ;
   private String[] T01738_A396EmprCod ;
   private String[] T01738_A10157Fu_cod ;
   private String[] T01732_A10157Fu_cod ;
   private java.math.BigDecimal[] T01732_A10158Fu_np ;
   private boolean[] T01732_n10158Fu_np ;
   private java.math.BigDecimal[] T01732_A10159Fu_nb1 ;
   private boolean[] T01732_n10159Fu_nb1 ;
   private java.math.BigDecimal[] T01732_A10160Fu_nfd1 ;
   private boolean[] T01732_n10160Fu_nfd1 ;
   private java.math.BigDecimal[] T01732_A10161Fu_npz1 ;
   private boolean[] T01732_n10161Fu_npz1 ;
   private java.math.BigDecimal[] T01732_A10162Fu_nb2 ;
   private boolean[] T01732_n10162Fu_nb2 ;
   private java.math.BigDecimal[] T01732_A10163Fu_nfd2 ;
   private boolean[] T01732_n10163Fu_nfd2 ;
   private java.math.BigDecimal[] T01732_A10164Fu_npz2 ;
   private boolean[] T01732_n10164Fu_npz2 ;
   private java.math.BigDecimal[] T01732_A10165Fu_nb3 ;
   private boolean[] T01732_n10165Fu_nb3 ;
   private java.math.BigDecimal[] T01732_A10166Fu_nfd3 ;
   private boolean[] T01732_n10166Fu_nfd3 ;
   private java.math.BigDecimal[] T01732_A10167Fu_npz3 ;
   private boolean[] T01732_n10167Fu_npz3 ;
   private java.math.BigDecimal[] T01732_A10168Fu_nax3 ;
   private boolean[] T01732_n10168Fu_nax3 ;
   private java.math.BigDecimal[] T01732_A10169Fu_nb4 ;
   private boolean[] T01732_n10169Fu_nb4 ;
   private java.math.BigDecimal[] T01732_A10170Fu_nfd4 ;
   private boolean[] T01732_n10170Fu_nfd4 ;
   private java.math.BigDecimal[] T01732_A10171Fu_npz4 ;
   private boolean[] T01732_n10171Fu_npz4 ;
   private java.math.BigDecimal[] T01732_A10172Fu_nax4 ;
   private boolean[] T01732_n10172Fu_nax4 ;
   private java.math.BigDecimal[] T01732_A10173Fu_pzccb ;
   private boolean[] T01732_n10173Fu_pzccb ;
   private java.math.BigDecimal[] T01732_A10174Fu_pzcct ;
   private boolean[] T01732_n10174Fu_pzcct ;
   private java.math.BigDecimal[] T01732_A10175Fu_pzsb ;
   private boolean[] T01732_n10175Fu_pzsb ;
   private java.math.BigDecimal[] T01732_A10176Fu_pzst ;
   private boolean[] T01732_n10176Fu_pzst ;
   private String[] T01732_A396EmprCod ;
   private String[] T017312_A396EmprCod ;
   private String[] T017312_A10157Fu_cod ;
   private String[] T017313_A407EmprNom ;
   private boolean[] T017313_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactfu__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactfu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactfu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactfu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactfu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01732", "SELECT Fu_cod, Fu_np, Fu_nb1, Fu_nfd1, Fu_npz1, Fu_nb2, Fu_nfd2, Fu_npz2, Fu_nb3, Fu_nfd3, Fu_npz3, Fu_nax3, Fu_nb4, Fu_nfd4, Fu_npz4, Fu_nax4, Fu_pzccb, Fu_pzcct, Fu_pzsb, Fu_pzst, EmprCod FROM TXPACTFU WHERE EmprCod = ? AND Fu_cod = ?  FOR UPDATE OF Fu_np, Fu_nb1, Fu_nfd1, Fu_npz1, Fu_nb2, Fu_nfd2, Fu_npz2, Fu_nb3, Fu_nfd3, Fu_npz3, Fu_nax3, Fu_nb4, Fu_nfd4, Fu_npz4, Fu_nax4, Fu_pzccb, Fu_pzcct, Fu_pzsb, Fu_pzst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01733", "SELECT Fu_cod, Fu_np, Fu_nb1, Fu_nfd1, Fu_npz1, Fu_nb2, Fu_nfd2, Fu_npz2, Fu_nb3, Fu_nfd3, Fu_npz3, Fu_nax3, Fu_nb4, Fu_nfd4, Fu_npz4, Fu_nax4, Fu_pzccb, Fu_pzcct, Fu_pzsb, Fu_pzst, EmprCod FROM TXPACTFU WHERE EmprCod = ? AND Fu_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01734", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01735", "SELECT /*+ FIRST_ROWS(100) */ TM1.Fu_cod, T2.EmprNom, TM1.Fu_np, TM1.Fu_nb1, TM1.Fu_nfd1, TM1.Fu_npz1, TM1.Fu_nb2, TM1.Fu_nfd2, TM1.Fu_npz2, TM1.Fu_nb3, TM1.Fu_nfd3, TM1.Fu_npz3, TM1.Fu_nax3, TM1.Fu_nb4, TM1.Fu_nfd4, TM1.Fu_npz4, TM1.Fu_nax4, TM1.Fu_pzccb, TM1.Fu_pzcct, TM1.Fu_pzsb, TM1.Fu_pzst, TM1.EmprCod FROM (TXPACTFU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Fu_cod = ? ORDER BY TM1.EmprCod, TM1.Fu_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01736", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Fu_cod FROM TXPACTFU WHERE EmprCod = ? AND Fu_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01737", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Fu_cod FROM TXPACTFU WHERE ( Fu_cod > ?) and EmprCod = ? ORDER BY EmprCod, Fu_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01738", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Fu_cod FROM TXPACTFU WHERE ( Fu_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Fu_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01739", "INSERT INTO TXPACTFU(Fu_cod, Fu_np, Fu_nb1, Fu_nfd1, Fu_npz1, Fu_nb2, Fu_nfd2, Fu_npz2, Fu_nb3, Fu_nfd3, Fu_npz3, Fu_nax3, Fu_nb4, Fu_nfd4, Fu_npz4, Fu_nax4, Fu_pzccb, Fu_pzcct, Fu_pzsb, Fu_pzst, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTFU")
         ,new UpdateCursor("T017310", "UPDATE TXPACTFU SET Fu_np=?, Fu_nb1=?, Fu_nfd1=?, Fu_npz1=?, Fu_nb2=?, Fu_nfd2=?, Fu_npz2=?, Fu_nb3=?, Fu_nfd3=?, Fu_npz3=?, Fu_nax3=?, Fu_nb4=?, Fu_nfd4=?, Fu_npz4=?, Fu_nax4=?, Fu_pzccb=?, Fu_pzcct=?, Fu_pzsb=?, Fu_pzst=?  WHERE EmprCod = ? AND Fu_cod = ?", GX_NOMASK, "TXPACTFU")
         ,new UpdateCursor("T017311", "DELETE FROM TXPACTFU  WHERE EmprCod = ? AND Fu_cod = ?", GX_NOMASK, "TXPACTFU")
         ,new ForEachCursor("T017312", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Fu_cod FROM TXPACTFU WHERE EmprCod = ? ORDER BY EmprCod, Fu_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017313", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
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
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 3);
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
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,5);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,5);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 3);
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
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 5);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 5);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 5);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[38], 5);
               }
               stmt.setString(21, (String)parms[39], 3);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 5);
               }
               stmt.setString(20, (String)parms[38], 3);
               stmt.setString(21, (String)parms[39], 6);
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

