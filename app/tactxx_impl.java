package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactxx_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO ACTIVIDA PREPARACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAl_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactxx_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactxx_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactxx_impl.class ));
   }

   public tactxx_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTXX.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Maq GENERAL ALXX", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_cod_Internalname, GXutil.rtrim( A10004Al_cod), GXutil.rtrim( localUtil.format( A10004Al_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_cod_Jsonclick, 0, "", "", "", "", "", 1, edtAl_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_np_Internalname, GXutil.ltrim( localUtil.ntoc( A10005Al_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_np_Enabled!=0) ? localUtil.format( A10005Al_np, "ZZ9.99999") : localUtil.format( A10005Al_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_np_Jsonclick, 0, "", "", "", "", "", 1, edtAl_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "número de piezas giradas maq2", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_npsg2_Internalname, GXutil.ltrim( localUtil.ntoc( A10006Al_npsg2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_npsg2_Enabled!=0) ? localUtil.format( A10006Al_npsg2, "ZZ9.99999") : localUtil.format( A10006Al_npsg2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_npsg2_Jsonclick, 0, "", "", "", "", "", 1, edtAl_npsg2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "número de piezas giradas maq3", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_npsg3_Internalname, GXutil.ltrim( localUtil.ntoc( A10007Al_npsg3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_npsg3_Enabled!=0) ? localUtil.format( A10007Al_npsg3, "ZZ9.99999") : localUtil.format( A10007Al_npsg3, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_npsg3_Jsonclick, 0, "", "", "", "", "", 1, edtAl_npsg3_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "número de piezas deshacer", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_npsd_Internalname, GXutil.ltrim( localUtil.ntoc( A10008Al_npsd, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_npsd_Enabled!=0) ? localUtil.format( A10008Al_npsd, "ZZ9.99999") : localUtil.format( A10008Al_npsd, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_npsd_Jsonclick, 0, "", "", "", "", "", 1, edtAl_npsd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "número de piezas coser a maq", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_npsc_Internalname, GXutil.ltrim( localUtil.ntoc( A10009Al_npsc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_npsc_Enabled!=0) ? localUtil.format( A10009Al_npsc, "ZZ9.99999") : localUtil.format( A10009Al_npsc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_npsc_Jsonclick, 0, "", "", "", "", "", 1, edtAl_npsc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "número de metros  girar maq2", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_mtsg2_Internalname, GXutil.ltrim( localUtil.ntoc( A10010Al_mtsg2, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_mtsg2_Enabled!=0) ? localUtil.format( A10010Al_mtsg2, "ZZ9.999999") : localUtil.format( A10010Al_mtsg2, "ZZ9.999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_mtsg2_Jsonclick, 0, "", "", "", "", "", 1, edtAl_mtsg2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "número de metros  girar maq3", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_mtsg3_Internalname, GXutil.ltrim( localUtil.ntoc( A10011Al_mtsg3, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_mtsg3_Enabled!=0) ? localUtil.format( A10011Al_mtsg3, "ZZ9.999999") : localUtil.format( A10011Al_mtsg3, "ZZ9.999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_mtsg3_Jsonclick, 0, "", "", "", "", "", 1, edtAl_mtsg3_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "número de metros  deshacer", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_mtsd_Internalname, GXutil.ltrim( localUtil.ntoc( A10012Al_mtsd, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_mtsd_Enabled!=0) ? localUtil.format( A10012Al_mtsd, "ZZ9.999999") : localUtil.format( A10012Al_mtsd, "ZZ9.999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_mtsd_Jsonclick, 0, "", "", "", "", "", 1, edtAl_mtsd_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero de Metros coser Jota", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_mtscj_Internalname, GXutil.ltrim( localUtil.ntoc( A10478Al_mtscj, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_mtscj_Enabled!=0) ? localUtil.format( A10478Al_mtscj, "ZZ9.999999") : localUtil.format( A10478Al_mtscj, "ZZ9.999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_mtscj_Jsonclick, 0, "", "", "", "", "", 1, edtAl_mtscj_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Numero de partidas coser Jota", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTXX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAl_npcj_Internalname, GXutil.ltrim( localUtil.ntoc( A10479Al_npcj, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAl_npcj_Enabled!=0) ? localUtil.format( A10479Al_npcj, "ZZ9.999999") : localUtil.format( A10479Al_npcj, "ZZ9.999999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'6');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAl_npcj_Jsonclick, 0, "", "", "", "", "", 1, edtAl_npcj_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTXX.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTXX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTXX.htm");
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
      e1116S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10004Al_cod = httpContext.cgiGet( "Z10004Al_cod") ;
            Z10005Al_np = localUtil.ctond( httpContext.cgiGet( "Z10005Al_np")) ;
            Z10006Al_npsg2 = localUtil.ctond( httpContext.cgiGet( "Z10006Al_npsg2")) ;
            Z10007Al_npsg3 = localUtil.ctond( httpContext.cgiGet( "Z10007Al_npsg3")) ;
            Z10008Al_npsd = localUtil.ctond( httpContext.cgiGet( "Z10008Al_npsd")) ;
            Z10009Al_npsc = localUtil.ctond( httpContext.cgiGet( "Z10009Al_npsc")) ;
            Z10010Al_mtsg2 = localUtil.ctond( httpContext.cgiGet( "Z10010Al_mtsg2")) ;
            Z10011Al_mtsg3 = localUtil.ctond( httpContext.cgiGet( "Z10011Al_mtsg3")) ;
            Z10012Al_mtsd = localUtil.ctond( httpContext.cgiGet( "Z10012Al_mtsd")) ;
            Z10478Al_mtscj = localUtil.ctond( httpContext.cgiGet( "Z10478Al_mtscj")) ;
            Z10479Al_npcj = localUtil.ctond( httpContext.cgiGet( "Z10479Al_npcj")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV35Al_cod = httpContext.cgiGet( "vAL_COD") ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10004Al_cod = httpContext.cgiGet( edtAl_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10005Al_np = DecimalUtil.ZERO ;
               n10005Al_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrimstr( A10005Al_np, 9, 5));
            }
            else
            {
               A10005Al_np = localUtil.ctond( httpContext.cgiGet( edtAl_np_Internalname)) ;
               n10005Al_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrimstr( A10005Al_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_npsg2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_npsg2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NPSG2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_npsg2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10006Al_npsg2 = DecimalUtil.ZERO ;
               n10006Al_npsg2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrimstr( A10006Al_npsg2, 9, 5));
            }
            else
            {
               A10006Al_npsg2 = localUtil.ctond( httpContext.cgiGet( edtAl_npsg2_Internalname)) ;
               n10006Al_npsg2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrimstr( A10006Al_npsg2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_npsg3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_npsg3_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NPSG3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_npsg3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10007Al_npsg3 = DecimalUtil.ZERO ;
               n10007Al_npsg3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrimstr( A10007Al_npsg3, 9, 5));
            }
            else
            {
               A10007Al_npsg3 = localUtil.ctond( httpContext.cgiGet( edtAl_npsg3_Internalname)) ;
               n10007Al_npsg3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrimstr( A10007Al_npsg3, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_npsd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_npsd_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NPSD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_npsd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10008Al_npsd = DecimalUtil.ZERO ;
               n10008Al_npsd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrimstr( A10008Al_npsd, 9, 5));
            }
            else
            {
               A10008Al_npsd = localUtil.ctond( httpContext.cgiGet( edtAl_npsd_Internalname)) ;
               n10008Al_npsd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrimstr( A10008Al_npsd, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_npsc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_npsc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NPSC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_npsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10009Al_npsc = DecimalUtil.ZERO ;
               n10009Al_npsc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrimstr( A10009Al_npsc, 9, 5));
            }
            else
            {
               A10009Al_npsc = localUtil.ctond( httpContext.cgiGet( edtAl_npsc_Internalname)) ;
               n10009Al_npsc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrimstr( A10009Al_npsc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_mtsg2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_mtsg2_Internalname)), DecimalUtil.stringToDec("999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_MTSG2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_mtsg2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10010Al_mtsg2 = DecimalUtil.ZERO ;
               n10010Al_mtsg2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrimstr( A10010Al_mtsg2, 10, 6));
            }
            else
            {
               A10010Al_mtsg2 = localUtil.ctond( httpContext.cgiGet( edtAl_mtsg2_Internalname)) ;
               n10010Al_mtsg2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrimstr( A10010Al_mtsg2, 10, 6));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_mtsg3_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_mtsg3_Internalname)), DecimalUtil.stringToDec("999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_MTSG3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_mtsg3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10011Al_mtsg3 = DecimalUtil.ZERO ;
               n10011Al_mtsg3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrimstr( A10011Al_mtsg3, 10, 6));
            }
            else
            {
               A10011Al_mtsg3 = localUtil.ctond( httpContext.cgiGet( edtAl_mtsg3_Internalname)) ;
               n10011Al_mtsg3 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrimstr( A10011Al_mtsg3, 10, 6));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_mtsd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_mtsd_Internalname)), DecimalUtil.stringToDec("999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_MTSD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_mtsd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10012Al_mtsd = DecimalUtil.ZERO ;
               n10012Al_mtsd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrimstr( A10012Al_mtsd, 10, 6));
            }
            else
            {
               A10012Al_mtsd = localUtil.ctond( httpContext.cgiGet( edtAl_mtsd_Internalname)) ;
               n10012Al_mtsd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrimstr( A10012Al_mtsd, 10, 6));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_mtscj_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_mtscj_Internalname)), DecimalUtil.stringToDec("999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_MTSCJ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_mtscj_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10478Al_mtscj = DecimalUtil.ZERO ;
               n10478Al_mtscj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrimstr( A10478Al_mtscj, 10, 6));
            }
            else
            {
               A10478Al_mtscj = localUtil.ctond( httpContext.cgiGet( edtAl_mtscj_Internalname)) ;
               n10478Al_mtscj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrimstr( A10478Al_mtscj, 10, 6));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAl_npcj_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAl_npcj_Internalname)), DecimalUtil.stringToDec("999.999999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AL_NPCJ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAl_npcj_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10479Al_npcj = DecimalUtil.ZERO ;
               n10479Al_npcj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrimstr( A10479Al_npcj, 10, 6));
            }
            else
            {
               A10479Al_npcj = localUtil.ctond( httpContext.cgiGet( edtAl_npcj_Internalname)) ;
               n10479Al_npcj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrimstr( A10479Al_npcj, 10, 6));
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
               A10004Al_cod = httpContext.GetPar( "Al_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
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
                        e1116S2 ();
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
            initAll16S1362( ) ;
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
      disableAttributes16S1362( ) ;
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

   public void confirm_16S0( )
   {
      beforeValidate16S1362( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16S1362( ) ;
         }
         else
         {
            checkExtendedTable16S1362( ) ;
            if ( AnyError == 0 )
            {
               zm16S1362( 4) ;
            }
            closeExtendedTableCursors16S1362( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues16S0( ) ;
      }
   }

   public void resetCaption16S0( )
   {
   }

   public void e1116S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactxx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tactxx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactxx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactxx_impl.this.A396EmprCod = GXv_char2[0] ;
      tactxx_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactxx_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV35Al_cod ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACAL", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactxx_impl.this.A396EmprCod = GXv_char4[0] ;
      tactxx_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV35Al_cod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Al_cod", AV35Al_cod);
      if ( GXutil.strcmp(AV35Al_cod, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACAL", ""));
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

   public void zm16S1362( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10005Al_np = T016S3_A10005Al_np[0] ;
            Z10006Al_npsg2 = T016S3_A10006Al_npsg2[0] ;
            Z10007Al_npsg3 = T016S3_A10007Al_npsg3[0] ;
            Z10008Al_npsd = T016S3_A10008Al_npsd[0] ;
            Z10009Al_npsc = T016S3_A10009Al_npsc[0] ;
            Z10010Al_mtsg2 = T016S3_A10010Al_mtsg2[0] ;
            Z10011Al_mtsg3 = T016S3_A10011Al_mtsg3[0] ;
            Z10012Al_mtsd = T016S3_A10012Al_mtsd[0] ;
            Z10478Al_mtscj = T016S3_A10478Al_mtscj[0] ;
            Z10479Al_npcj = T016S3_A10479Al_npcj[0] ;
         }
         else
         {
            Z10005Al_np = A10005Al_np ;
            Z10006Al_npsg2 = A10006Al_npsg2 ;
            Z10007Al_npsg3 = A10007Al_npsg3 ;
            Z10008Al_npsd = A10008Al_npsd ;
            Z10009Al_npsc = A10009Al_npsc ;
            Z10010Al_mtsg2 = A10010Al_mtsg2 ;
            Z10011Al_mtsg3 = A10011Al_mtsg3 ;
            Z10012Al_mtsd = A10012Al_mtsd ;
            Z10478Al_mtscj = A10478Al_mtscj ;
            Z10479Al_npcj = A10479Al_npcj ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z10004Al_cod = A10004Al_cod ;
         Z10005Al_np = A10005Al_np ;
         Z10006Al_npsg2 = A10006Al_npsg2 ;
         Z10007Al_npsg3 = A10007Al_npsg3 ;
         Z10008Al_npsd = A10008Al_npsd ;
         Z10009Al_npsc = A10009Al_npsc ;
         Z10010Al_mtsg2 = A10010Al_mtsg2 ;
         Z10011Al_mtsg3 = A10011Al_mtsg3 ;
         Z10012Al_mtsd = A10012Al_mtsd ;
         Z10478Al_mtscj = A10478Al_mtscj ;
         Z10479Al_npcj = A10479Al_npcj ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TACTXX" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T016S4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016S4_A407EmprNom[0] ;
      n407EmprNom = T016S4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A10004Al_cod = AV35Al_cod ;
      httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
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

   public void load16S1362( )
   {
      /* Using cursor T016S5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10004Al_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1362 = (short)(1) ;
         A407EmprNom = T016S5_A407EmprNom[0] ;
         n407EmprNom = T016S5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10005Al_np = T016S5_A10005Al_np[0] ;
         n10005Al_np = T016S5_n10005Al_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrimstr( A10005Al_np, 9, 5));
         A10006Al_npsg2 = T016S5_A10006Al_npsg2[0] ;
         n10006Al_npsg2 = T016S5_n10006Al_npsg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrimstr( A10006Al_npsg2, 9, 5));
         A10007Al_npsg3 = T016S5_A10007Al_npsg3[0] ;
         n10007Al_npsg3 = T016S5_n10007Al_npsg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrimstr( A10007Al_npsg3, 9, 5));
         A10008Al_npsd = T016S5_A10008Al_npsd[0] ;
         n10008Al_npsd = T016S5_n10008Al_npsd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrimstr( A10008Al_npsd, 9, 5));
         A10009Al_npsc = T016S5_A10009Al_npsc[0] ;
         n10009Al_npsc = T016S5_n10009Al_npsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrimstr( A10009Al_npsc, 9, 5));
         A10010Al_mtsg2 = T016S5_A10010Al_mtsg2[0] ;
         n10010Al_mtsg2 = T016S5_n10010Al_mtsg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrimstr( A10010Al_mtsg2, 10, 6));
         A10011Al_mtsg3 = T016S5_A10011Al_mtsg3[0] ;
         n10011Al_mtsg3 = T016S5_n10011Al_mtsg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrimstr( A10011Al_mtsg3, 10, 6));
         A10012Al_mtsd = T016S5_A10012Al_mtsd[0] ;
         n10012Al_mtsd = T016S5_n10012Al_mtsd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrimstr( A10012Al_mtsd, 10, 6));
         A10478Al_mtscj = T016S5_A10478Al_mtscj[0] ;
         n10478Al_mtscj = T016S5_n10478Al_mtscj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrimstr( A10478Al_mtscj, 10, 6));
         A10479Al_npcj = T016S5_A10479Al_npcj[0] ;
         n10479Al_npcj = T016S5_n10479Al_npcj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrimstr( A10479Al_npcj, 10, 6));
         zm16S1362( -3) ;
      }
      pr_default.close(3);
      onLoadActions16S1362( ) ;
   }

   public void onLoadActions16S1362( )
   {
   }

   public void checkExtendedTable16S1362( )
   {
      nIsDirty_1362 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A10004Al_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "AL_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAl_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors16S1362( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16S1362( )
   {
      /* Using cursor T016S6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A10004Al_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1362 = (short)(1) ;
      }
      else
      {
         RcdFound1362 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10004Al_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016S3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16S1362( 3) ;
         RcdFound1362 = (short)(1) ;
         A10004Al_cod = T016S3_A10004Al_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
         A10005Al_np = T016S3_A10005Al_np[0] ;
         n10005Al_np = T016S3_n10005Al_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrimstr( A10005Al_np, 9, 5));
         A10006Al_npsg2 = T016S3_A10006Al_npsg2[0] ;
         n10006Al_npsg2 = T016S3_n10006Al_npsg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrimstr( A10006Al_npsg2, 9, 5));
         A10007Al_npsg3 = T016S3_A10007Al_npsg3[0] ;
         n10007Al_npsg3 = T016S3_n10007Al_npsg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrimstr( A10007Al_npsg3, 9, 5));
         A10008Al_npsd = T016S3_A10008Al_npsd[0] ;
         n10008Al_npsd = T016S3_n10008Al_npsd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrimstr( A10008Al_npsd, 9, 5));
         A10009Al_npsc = T016S3_A10009Al_npsc[0] ;
         n10009Al_npsc = T016S3_n10009Al_npsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrimstr( A10009Al_npsc, 9, 5));
         A10010Al_mtsg2 = T016S3_A10010Al_mtsg2[0] ;
         n10010Al_mtsg2 = T016S3_n10010Al_mtsg2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrimstr( A10010Al_mtsg2, 10, 6));
         A10011Al_mtsg3 = T016S3_A10011Al_mtsg3[0] ;
         n10011Al_mtsg3 = T016S3_n10011Al_mtsg3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrimstr( A10011Al_mtsg3, 10, 6));
         A10012Al_mtsd = T016S3_A10012Al_mtsd[0] ;
         n10012Al_mtsd = T016S3_n10012Al_mtsd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrimstr( A10012Al_mtsd, 10, 6));
         A10478Al_mtscj = T016S3_A10478Al_mtscj[0] ;
         n10478Al_mtscj = T016S3_n10478Al_mtscj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrimstr( A10478Al_mtscj, 10, 6));
         A10479Al_npcj = T016S3_A10479Al_npcj[0] ;
         n10479Al_npcj = T016S3_n10479Al_npcj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrimstr( A10479Al_npcj, 10, 6));
         Z396EmprCod = A396EmprCod ;
         Z10004Al_cod = A10004Al_cod ;
         sMode1362 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16S1362( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1362 = (short)(0) ;
            initializeNonKey16S1362( ) ;
         }
         Gx_mode = sMode1362 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1362 = (short)(0) ;
         initializeNonKey16S1362( ) ;
         sMode1362 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1362 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey16S1362( ) ;
      if ( RcdFound1362 == 0 )
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
      RcdFound1362 = (short)(0) ;
      /* Using cursor T016S7 */
      pr_default.execute(5, new Object[] {A10004Al_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T016S7_A10004Al_cod[0], A10004Al_cod) < 0 ) ) && ( GXutil.strcmp(T016S7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T016S7_A10004Al_cod[0], A10004Al_cod) > 0 ) ) && ( GXutil.strcmp(T016S7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10004Al_cod = T016S7_A10004Al_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
            RcdFound1362 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1362 = (short)(0) ;
      /* Using cursor T016S8 */
      pr_default.execute(6, new Object[] {A10004Al_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T016S8_A10004Al_cod[0], A10004Al_cod) > 0 ) ) && ( GXutil.strcmp(T016S8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T016S8_A10004Al_cod[0], A10004Al_cod) < 0 ) ) && ( GXutil.strcmp(T016S8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10004Al_cod = T016S8_A10004Al_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
            RcdFound1362 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16S1362( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAl_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16S1362( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1362 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10004Al_cod, Z10004Al_cod) != 0 ) )
            {
               A10004Al_cod = Z10004Al_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAl_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16S1362( ) ;
               GX_FocusControl = edtAl_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10004Al_cod, Z10004Al_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAl_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16S1362( ) ;
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
                  GX_FocusControl = edtAl_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16S1362( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10004Al_cod, Z10004Al_cod) != 0 ) )
      {
         A10004Al_cod = Z10004Al_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAl_cod_Internalname ;
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
      getKey16S1362( ) ;
      if ( RcdFound1362 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10004Al_cod, Z10004Al_cod) != 0 ) )
         {
            A10004Al_cod = Z10004Al_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10004Al_cod, Z10004Al_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactxx");
      GX_FocusControl = edtAl_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_16S0( ) ;
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
      if ( RcdFound1362 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAl_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16S1362( ) ;
      if ( RcdFound1362 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAl_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16S1362( ) ;
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
      if ( RcdFound1362 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAl_np_Internalname ;
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
      if ( RcdFound1362 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAl_np_Internalname ;
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
      scanStart16S1362( ) ;
      if ( RcdFound1362 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1362 != 0 )
         {
            scanNext16S1362( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAl_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16S1362( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16S1362( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10004Al_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTXX"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10005Al_np, T016S2_A10005Al_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z10006Al_npsg2, T016S2_A10006Al_npsg2[0]) != 0 ) || ( DecimalUtil.compareTo(Z10007Al_npsg3, T016S2_A10007Al_npsg3[0]) != 0 ) || ( DecimalUtil.compareTo(Z10008Al_npsd, T016S2_A10008Al_npsd[0]) != 0 ) || ( DecimalUtil.compareTo(Z10009Al_npsc, T016S2_A10009Al_npsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10010Al_mtsg2, T016S2_A10010Al_mtsg2[0]) != 0 ) || ( DecimalUtil.compareTo(Z10011Al_mtsg3, T016S2_A10011Al_mtsg3[0]) != 0 ) || ( DecimalUtil.compareTo(Z10012Al_mtsd, T016S2_A10012Al_mtsd[0]) != 0 ) || ( DecimalUtil.compareTo(Z10478Al_mtscj, T016S2_A10478Al_mtscj[0]) != 0 ) || ( DecimalUtil.compareTo(Z10479Al_npcj, T016S2_A10479Al_npcj[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10005Al_np, T016S2_A10005Al_np[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_np");
               GXutil.writeLogRaw("Old: ",Z10005Al_np);
               GXutil.writeLogRaw("Current: ",T016S2_A10005Al_np[0]);
            }
            if ( DecimalUtil.compareTo(Z10006Al_npsg2, T016S2_A10006Al_npsg2[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_npsg2");
               GXutil.writeLogRaw("Old: ",Z10006Al_npsg2);
               GXutil.writeLogRaw("Current: ",T016S2_A10006Al_npsg2[0]);
            }
            if ( DecimalUtil.compareTo(Z10007Al_npsg3, T016S2_A10007Al_npsg3[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_npsg3");
               GXutil.writeLogRaw("Old: ",Z10007Al_npsg3);
               GXutil.writeLogRaw("Current: ",T016S2_A10007Al_npsg3[0]);
            }
            if ( DecimalUtil.compareTo(Z10008Al_npsd, T016S2_A10008Al_npsd[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_npsd");
               GXutil.writeLogRaw("Old: ",Z10008Al_npsd);
               GXutil.writeLogRaw("Current: ",T016S2_A10008Al_npsd[0]);
            }
            if ( DecimalUtil.compareTo(Z10009Al_npsc, T016S2_A10009Al_npsc[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_npsc");
               GXutil.writeLogRaw("Old: ",Z10009Al_npsc);
               GXutil.writeLogRaw("Current: ",T016S2_A10009Al_npsc[0]);
            }
            if ( DecimalUtil.compareTo(Z10010Al_mtsg2, T016S2_A10010Al_mtsg2[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_mtsg2");
               GXutil.writeLogRaw("Old: ",Z10010Al_mtsg2);
               GXutil.writeLogRaw("Current: ",T016S2_A10010Al_mtsg2[0]);
            }
            if ( DecimalUtil.compareTo(Z10011Al_mtsg3, T016S2_A10011Al_mtsg3[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_mtsg3");
               GXutil.writeLogRaw("Old: ",Z10011Al_mtsg3);
               GXutil.writeLogRaw("Current: ",T016S2_A10011Al_mtsg3[0]);
            }
            if ( DecimalUtil.compareTo(Z10012Al_mtsd, T016S2_A10012Al_mtsd[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_mtsd");
               GXutil.writeLogRaw("Old: ",Z10012Al_mtsd);
               GXutil.writeLogRaw("Current: ",T016S2_A10012Al_mtsd[0]);
            }
            if ( DecimalUtil.compareTo(Z10478Al_mtscj, T016S2_A10478Al_mtscj[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_mtscj");
               GXutil.writeLogRaw("Old: ",Z10478Al_mtscj);
               GXutil.writeLogRaw("Current: ",T016S2_A10478Al_mtscj[0]);
            }
            if ( DecimalUtil.compareTo(Z10479Al_npcj, T016S2_A10479Al_npcj[0]) != 0 )
            {
               GXutil.writeLogln("tactxx:[seudo value changed for attri]"+"Al_npcj");
               GXutil.writeLogRaw("Old: ",Z10479Al_npcj);
               GXutil.writeLogRaw("Current: ",T016S2_A10479Al_npcj[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTXX"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16S1362( )
   {
      beforeValidate16S1362( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16S1362( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16S1362( 0) ;
         checkOptimisticConcurrency16S1362( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16S1362( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16S1362( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016S9 */
                  pr_default.execute(7, new Object[] {A10004Al_cod, Boolean.valueOf(n10005Al_np), A10005Al_np, Boolean.valueOf(n10006Al_npsg2), A10006Al_npsg2, Boolean.valueOf(n10007Al_npsg3), A10007Al_npsg3, Boolean.valueOf(n10008Al_npsd), A10008Al_npsd, Boolean.valueOf(n10009Al_npsc), A10009Al_npsc, Boolean.valueOf(n10010Al_mtsg2), A10010Al_mtsg2, Boolean.valueOf(n10011Al_mtsg3), A10011Al_mtsg3, Boolean.valueOf(n10012Al_mtsd), A10012Al_mtsd, Boolean.valueOf(n10478Al_mtscj), A10478Al_mtscj, Boolean.valueOf(n10479Al_npcj), A10479Al_npcj, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTXX");
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
                        resetCaption16S0( ) ;
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
            load16S1362( ) ;
         }
         endLevel16S1362( ) ;
      }
      closeExtendedTableCursors16S1362( ) ;
   }

   public void update16S1362( )
   {
      beforeValidate16S1362( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16S1362( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16S1362( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16S1362( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16S1362( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016S10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10005Al_np), A10005Al_np, Boolean.valueOf(n10006Al_npsg2), A10006Al_npsg2, Boolean.valueOf(n10007Al_npsg3), A10007Al_npsg3, Boolean.valueOf(n10008Al_npsd), A10008Al_npsd, Boolean.valueOf(n10009Al_npsc), A10009Al_npsc, Boolean.valueOf(n10010Al_mtsg2), A10010Al_mtsg2, Boolean.valueOf(n10011Al_mtsg3), A10011Al_mtsg3, Boolean.valueOf(n10012Al_mtsd), A10012Al_mtsd, Boolean.valueOf(n10478Al_mtscj), A10478Al_mtscj, Boolean.valueOf(n10479Al_npcj), A10479Al_npcj, A396EmprCod, A10004Al_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTXX");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTXX"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16S1362( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption16S0( ) ;
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
         endLevel16S1362( ) ;
      }
      closeExtendedTableCursors16S1362( ) ;
   }

   public void deferredUpdate16S1362( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16S1362( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16S1362( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16S1362( ) ;
         afterConfirm16S1362( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16S1362( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016S11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A10004Al_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTXX");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1362 == 0 )
                     {
                        initAll16S1362( ) ;
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
                     resetCaption16S0( ) ;
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
      sMode1362 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16S1362( ) ;
      Gx_mode = sMode1362 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16S1362( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel16S1362( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16S1362( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactxx");
         if ( AnyError == 0 )
         {
            confirmValues16S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactxx");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16S1362( )
   {
      /* Scan By routine */
      /* Using cursor T016S12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1362 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1362 = (short)(1) ;
         A10004Al_cod = T016S12_A10004Al_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16S1362( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1362 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1362 = (short)(1) ;
         A10004Al_cod = T016S12_A10004Al_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
      }
   }

   public void scanEnd16S1362( )
   {
      pr_default.close(10);
   }

   public void afterConfirm16S1362( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16S1362( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16S1362( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16S1362( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16S1362( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16S1362( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16S1362( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAl_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_cod_Enabled), 5, 0), true);
      edtAl_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_np_Enabled), 5, 0), true);
      edtAl_npsg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_npsg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_npsg2_Enabled), 5, 0), true);
      edtAl_npsg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_npsg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_npsg3_Enabled), 5, 0), true);
      edtAl_npsd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_npsd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_npsd_Enabled), 5, 0), true);
      edtAl_npsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_npsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_npsc_Enabled), 5, 0), true);
      edtAl_mtsg2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_mtsg2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_mtsg2_Enabled), 5, 0), true);
      edtAl_mtsg3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_mtsg3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_mtsg3_Enabled), 5, 0), true);
      edtAl_mtsd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_mtsd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_mtsd_Enabled), 5, 0), true);
      edtAl_mtscj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_mtscj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_mtscj_Enabled), 5, 0), true);
      edtAl_npcj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAl_npcj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAl_npcj_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes16S1362( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues16S0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactxx", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10004Al_cod", GXutil.rtrim( Z10004Al_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10005Al_np", GXutil.ltrim( localUtil.ntoc( Z10005Al_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10006Al_npsg2", GXutil.ltrim( localUtil.ntoc( Z10006Al_npsg2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10007Al_npsg3", GXutil.ltrim( localUtil.ntoc( Z10007Al_npsg3, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10008Al_npsd", GXutil.ltrim( localUtil.ntoc( Z10008Al_npsd, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10009Al_npsc", GXutil.ltrim( localUtil.ntoc( Z10009Al_npsc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10010Al_mtsg2", GXutil.ltrim( localUtil.ntoc( Z10010Al_mtsg2, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10011Al_mtsg3", GXutil.ltrim( localUtil.ntoc( Z10011Al_mtsg3, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10012Al_mtsd", GXutil.ltrim( localUtil.ntoc( Z10012Al_mtsd, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10478Al_mtscj", GXutil.ltrim( localUtil.ntoc( Z10478Al_mtscj, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10479Al_npcj", GXutil.ltrim( localUtil.ntoc( Z10479Al_npcj, (byte)(10), (byte)(6), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vAL_COD", GXutil.rtrim( AV35Al_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.tactxx", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTXX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO ACTIVIDA PREPARACION", "") ;
   }

   public void initializeNonKey16S1362( )
   {
      A10005Al_np = DecimalUtil.ZERO ;
      n10005Al_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrimstr( A10005Al_np, 9, 5));
      A10006Al_npsg2 = DecimalUtil.ZERO ;
      n10006Al_npsg2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrimstr( A10006Al_npsg2, 9, 5));
      A10007Al_npsg3 = DecimalUtil.ZERO ;
      n10007Al_npsg3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrimstr( A10007Al_npsg3, 9, 5));
      A10008Al_npsd = DecimalUtil.ZERO ;
      n10008Al_npsd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrimstr( A10008Al_npsd, 9, 5));
      A10009Al_npsc = DecimalUtil.ZERO ;
      n10009Al_npsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrimstr( A10009Al_npsc, 9, 5));
      A10010Al_mtsg2 = DecimalUtil.ZERO ;
      n10010Al_mtsg2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrimstr( A10010Al_mtsg2, 10, 6));
      A10011Al_mtsg3 = DecimalUtil.ZERO ;
      n10011Al_mtsg3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrimstr( A10011Al_mtsg3, 10, 6));
      A10012Al_mtsd = DecimalUtil.ZERO ;
      n10012Al_mtsd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrimstr( A10012Al_mtsd, 10, 6));
      A10478Al_mtscj = DecimalUtil.ZERO ;
      n10478Al_mtscj = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrimstr( A10478Al_mtscj, 10, 6));
      A10479Al_npcj = DecimalUtil.ZERO ;
      n10479Al_npcj = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrimstr( A10479Al_npcj, 10, 6));
      Z10005Al_np = DecimalUtil.ZERO ;
      Z10006Al_npsg2 = DecimalUtil.ZERO ;
      Z10007Al_npsg3 = DecimalUtil.ZERO ;
      Z10008Al_npsd = DecimalUtil.ZERO ;
      Z10009Al_npsc = DecimalUtil.ZERO ;
      Z10010Al_mtsg2 = DecimalUtil.ZERO ;
      Z10011Al_mtsg3 = DecimalUtil.ZERO ;
      Z10012Al_mtsd = DecimalUtil.ZERO ;
      Z10478Al_mtscj = DecimalUtil.ZERO ;
      Z10479Al_npcj = DecimalUtil.ZERO ;
   }

   public void initAll16S1362( )
   {
      A10004Al_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10004Al_cod", A10004Al_cod);
      initializeNonKey16S1362( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241545054", true, true);
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
      httpContext.AddJavascriptSource("tactxx.js", "?20268241545054", false, true);
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
      edtAl_cod_Internalname = "AL_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAl_np_Internalname = "AL_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAl_npsg2_Internalname = "AL_NPSG2" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAl_npsg3_Internalname = "AL_NPSG3" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAl_npsd_Internalname = "AL_NPSD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAl_npsc_Internalname = "AL_NPSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAl_mtsg2_Internalname = "AL_MTSG2" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAl_mtsg3_Internalname = "AL_MTSG3" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAl_mtsd_Internalname = "AL_MTSD" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAl_mtscj_Internalname = "AL_MTSCJ" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAl_npcj_Internalname = "AL_NPCJ" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO ACTIVIDA PREPARACION", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAl_npcj_Jsonclick = "" ;
      edtAl_npcj_Backcolor = (int)(0xFFFFFF) ;
      edtAl_npcj_Enabled = 1 ;
      edtAl_mtscj_Jsonclick = "" ;
      edtAl_mtscj_Backcolor = (int)(0xFFFFFF) ;
      edtAl_mtscj_Enabled = 1 ;
      edtAl_mtsd_Jsonclick = "" ;
      edtAl_mtsd_Backcolor = (int)(0xFFFFFF) ;
      edtAl_mtsd_Enabled = 1 ;
      edtAl_mtsg3_Jsonclick = "" ;
      edtAl_mtsg3_Backcolor = (int)(0xFFFFFF) ;
      edtAl_mtsg3_Enabled = 1 ;
      edtAl_mtsg2_Jsonclick = "" ;
      edtAl_mtsg2_Backcolor = (int)(0xFFFFFF) ;
      edtAl_mtsg2_Enabled = 1 ;
      edtAl_npsc_Jsonclick = "" ;
      edtAl_npsc_Backcolor = (int)(0xFFFFFF) ;
      edtAl_npsc_Enabled = 1 ;
      edtAl_npsd_Jsonclick = "" ;
      edtAl_npsd_Backcolor = (int)(0xFFFFFF) ;
      edtAl_npsd_Enabled = 1 ;
      edtAl_npsg3_Jsonclick = "" ;
      edtAl_npsg3_Backcolor = (int)(0xFFFFFF) ;
      edtAl_npsg3_Enabled = 1 ;
      edtAl_npsg2_Jsonclick = "" ;
      edtAl_npsg2_Backcolor = (int)(0xFFFFFF) ;
      edtAl_npsg2_Enabled = 1 ;
      edtAl_np_Jsonclick = "" ;
      edtAl_np_Backcolor = (int)(0xFFFFFF) ;
      edtAl_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAl_cod_Jsonclick = "" ;
      edtAl_cod_Backcolor = (int)(0xFFFFFF) ;
      edtAl_cod_Enabled = 1 ;
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
      /* Using cursor T016S13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016S13_A407EmprNom[0] ;
      n407EmprNom = T016S13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtAl_np_Internalname ;
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

   public void valid_Al_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A10004Al_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "AL_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAl_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10005Al_np", GXutil.ltrim( localUtil.ntoc( A10005Al_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10006Al_npsg2", GXutil.ltrim( localUtil.ntoc( A10006Al_npsg2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10007Al_npsg3", GXutil.ltrim( localUtil.ntoc( A10007Al_npsg3, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10008Al_npsd", GXutil.ltrim( localUtil.ntoc( A10008Al_npsd, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10009Al_npsc", GXutil.ltrim( localUtil.ntoc( A10009Al_npsc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10010Al_mtsg2", GXutil.ltrim( localUtil.ntoc( A10010Al_mtsg2, (byte)(10), (byte)(6), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10011Al_mtsg3", GXutil.ltrim( localUtil.ntoc( A10011Al_mtsg3, (byte)(10), (byte)(6), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10012Al_mtsd", GXutil.ltrim( localUtil.ntoc( A10012Al_mtsd, (byte)(10), (byte)(6), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10478Al_mtscj", GXutil.ltrim( localUtil.ntoc( A10478Al_mtscj, (byte)(10), (byte)(6), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10479Al_npcj", GXutil.ltrim( localUtil.ntoc( A10479Al_npcj, (byte)(10), (byte)(6), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10004Al_cod", GXutil.rtrim( Z10004Al_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10005Al_np", GXutil.ltrim( localUtil.ntoc( Z10005Al_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10006Al_npsg2", GXutil.ltrim( localUtil.ntoc( Z10006Al_npsg2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10007Al_npsg3", GXutil.ltrim( localUtil.ntoc( Z10007Al_npsg3, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10008Al_npsd", GXutil.ltrim( localUtil.ntoc( Z10008Al_npsd, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10009Al_npsc", GXutil.ltrim( localUtil.ntoc( Z10009Al_npsc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10010Al_mtsg2", GXutil.ltrim( localUtil.ntoc( Z10010Al_mtsg2, (byte)(10), (byte)(6), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10011Al_mtsg3", GXutil.ltrim( localUtil.ntoc( Z10011Al_mtsg3, (byte)(10), (byte)(6), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10012Al_mtsd", GXutil.ltrim( localUtil.ntoc( Z10012Al_mtsd, (byte)(10), (byte)(6), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10478Al_mtscj", GXutil.ltrim( localUtil.ntoc( Z10478Al_mtscj, (byte)(10), (byte)(6), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10479Al_npcj", GXutil.ltrim( localUtil.ntoc( Z10479Al_npcj, (byte)(10), (byte)(6), ".", "")));
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
      setEventMetadata("VALID_AL_COD","{handler:'valid_Al_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10004Al_cod',fld:'AL_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV35Al_cod',fld:'vAL_COD',pic:''}]");
      setEventMetadata("VALID_AL_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10005Al_np',fld:'AL_NP',pic:'ZZ9.99999'},{av:'A10006Al_npsg2',fld:'AL_NPSG2',pic:'ZZ9.99999'},{av:'A10007Al_npsg3',fld:'AL_NPSG3',pic:'ZZ9.99999'},{av:'A10008Al_npsd',fld:'AL_NPSD',pic:'ZZ9.99999'},{av:'A10009Al_npsc',fld:'AL_NPSC',pic:'ZZ9.99999'},{av:'A10010Al_mtsg2',fld:'AL_MTSG2',pic:'ZZ9.999999'},{av:'A10011Al_mtsg3',fld:'AL_MTSG3',pic:'ZZ9.999999'},{av:'A10012Al_mtsd',fld:'AL_MTSD',pic:'ZZ9.999999'},{av:'A10478Al_mtscj',fld:'AL_MTSCJ',pic:'ZZ9.999999'},{av:'A10479Al_npcj',fld:'AL_NPCJ',pic:'ZZ9.999999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10004Al_cod'},{av:'Z407EmprNom'},{av:'Z10005Al_np'},{av:'Z10006Al_npsg2'},{av:'Z10007Al_npsg3'},{av:'Z10008Al_npsd'},{av:'Z10009Al_npsc'},{av:'Z10010Al_mtsg2'},{av:'Z10011Al_mtsg3'},{av:'Z10012Al_mtsd'},{av:'Z10478Al_mtscj'},{av:'Z10479Al_npcj'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z10004Al_cod = "" ;
      Z10005Al_np = DecimalUtil.ZERO ;
      Z10006Al_npsg2 = DecimalUtil.ZERO ;
      Z10007Al_npsg3 = DecimalUtil.ZERO ;
      Z10008Al_npsd = DecimalUtil.ZERO ;
      Z10009Al_npsc = DecimalUtil.ZERO ;
      Z10010Al_mtsg2 = DecimalUtil.ZERO ;
      Z10011Al_mtsg3 = DecimalUtil.ZERO ;
      Z10012Al_mtsd = DecimalUtil.ZERO ;
      Z10478Al_mtscj = DecimalUtil.ZERO ;
      Z10479Al_npcj = DecimalUtil.ZERO ;
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
      A10004Al_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10005Al_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A10006Al_npsg2 = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A10007Al_npsg3 = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A10008Al_npsd = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A10009Al_npsc = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A10010Al_mtsg2 = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A10011Al_mtsg3 = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A10012Al_mtsd = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A10478Al_mtscj = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A10479Al_npcj = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV35Al_cod = "" ;
      AV36Pgmname = "" ;
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
      T016S4_A407EmprNom = new String[] {""} ;
      T016S4_n407EmprNom = new boolean[] {false} ;
      T016S5_A10004Al_cod = new String[] {""} ;
      T016S5_A407EmprNom = new String[] {""} ;
      T016S5_n407EmprNom = new boolean[] {false} ;
      T016S5_A10005Al_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10005Al_np = new boolean[] {false} ;
      T016S5_A10006Al_npsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10006Al_npsg2 = new boolean[] {false} ;
      T016S5_A10007Al_npsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10007Al_npsg3 = new boolean[] {false} ;
      T016S5_A10008Al_npsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10008Al_npsd = new boolean[] {false} ;
      T016S5_A10009Al_npsc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10009Al_npsc = new boolean[] {false} ;
      T016S5_A10010Al_mtsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10010Al_mtsg2 = new boolean[] {false} ;
      T016S5_A10011Al_mtsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10011Al_mtsg3 = new boolean[] {false} ;
      T016S5_A10012Al_mtsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10012Al_mtsd = new boolean[] {false} ;
      T016S5_A10478Al_mtscj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10478Al_mtscj = new boolean[] {false} ;
      T016S5_A10479Al_npcj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S5_n10479Al_npcj = new boolean[] {false} ;
      T016S5_A396EmprCod = new String[] {""} ;
      T016S6_A396EmprCod = new String[] {""} ;
      T016S6_A10004Al_cod = new String[] {""} ;
      T016S3_A10004Al_cod = new String[] {""} ;
      T016S3_A10005Al_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10005Al_np = new boolean[] {false} ;
      T016S3_A10006Al_npsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10006Al_npsg2 = new boolean[] {false} ;
      T016S3_A10007Al_npsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10007Al_npsg3 = new boolean[] {false} ;
      T016S3_A10008Al_npsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10008Al_npsd = new boolean[] {false} ;
      T016S3_A10009Al_npsc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10009Al_npsc = new boolean[] {false} ;
      T016S3_A10010Al_mtsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10010Al_mtsg2 = new boolean[] {false} ;
      T016S3_A10011Al_mtsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10011Al_mtsg3 = new boolean[] {false} ;
      T016S3_A10012Al_mtsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10012Al_mtsd = new boolean[] {false} ;
      T016S3_A10478Al_mtscj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10478Al_mtscj = new boolean[] {false} ;
      T016S3_A10479Al_npcj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S3_n10479Al_npcj = new boolean[] {false} ;
      T016S3_A396EmprCod = new String[] {""} ;
      sMode1362 = "" ;
      T016S7_A396EmprCod = new String[] {""} ;
      T016S7_A10004Al_cod = new String[] {""} ;
      T016S8_A396EmprCod = new String[] {""} ;
      T016S8_A10004Al_cod = new String[] {""} ;
      T016S2_A10004Al_cod = new String[] {""} ;
      T016S2_A10005Al_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10005Al_np = new boolean[] {false} ;
      T016S2_A10006Al_npsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10006Al_npsg2 = new boolean[] {false} ;
      T016S2_A10007Al_npsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10007Al_npsg3 = new boolean[] {false} ;
      T016S2_A10008Al_npsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10008Al_npsd = new boolean[] {false} ;
      T016S2_A10009Al_npsc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10009Al_npsc = new boolean[] {false} ;
      T016S2_A10010Al_mtsg2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10010Al_mtsg2 = new boolean[] {false} ;
      T016S2_A10011Al_mtsg3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10011Al_mtsg3 = new boolean[] {false} ;
      T016S2_A10012Al_mtsd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10012Al_mtsd = new boolean[] {false} ;
      T016S2_A10478Al_mtscj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10478Al_mtscj = new boolean[] {false} ;
      T016S2_A10479Al_npcj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016S2_n10479Al_npcj = new boolean[] {false} ;
      T016S2_A396EmprCod = new String[] {""} ;
      T016S12_A396EmprCod = new String[] {""} ;
      T016S12_A10004Al_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T016S13_A407EmprNom = new String[] {""} ;
      T016S13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10004Al_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ10005Al_np = DecimalUtil.ZERO ;
      ZZ10006Al_npsg2 = DecimalUtil.ZERO ;
      ZZ10007Al_npsg3 = DecimalUtil.ZERO ;
      ZZ10008Al_npsd = DecimalUtil.ZERO ;
      ZZ10009Al_npsc = DecimalUtil.ZERO ;
      ZZ10010Al_mtsg2 = DecimalUtil.ZERO ;
      ZZ10011Al_mtsg3 = DecimalUtil.ZERO ;
      ZZ10012Al_mtsd = DecimalUtil.ZERO ;
      ZZ10478Al_mtscj = DecimalUtil.ZERO ;
      ZZ10479Al_npcj = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactxx__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactxx__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactxx__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactxx__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactxx__default(),
         new Object[] {
             new Object[] {
            T016S2_A10004Al_cod, T016S2_A10005Al_np, T016S2_n10005Al_np, T016S2_A10006Al_npsg2, T016S2_n10006Al_npsg2, T016S2_A10007Al_npsg3, T016S2_n10007Al_npsg3, T016S2_A10008Al_npsd, T016S2_n10008Al_npsd, T016S2_A10009Al_npsc,
            T016S2_n10009Al_npsc, T016S2_A10010Al_mtsg2, T016S2_n10010Al_mtsg2, T016S2_A10011Al_mtsg3, T016S2_n10011Al_mtsg3, T016S2_A10012Al_mtsd, T016S2_n10012Al_mtsd, T016S2_A10478Al_mtscj, T016S2_n10478Al_mtscj, T016S2_A10479Al_npcj,
            T016S2_n10479Al_npcj, T016S2_A396EmprCod
            }
            , new Object[] {
            T016S3_A10004Al_cod, T016S3_A10005Al_np, T016S3_n10005Al_np, T016S3_A10006Al_npsg2, T016S3_n10006Al_npsg2, T016S3_A10007Al_npsg3, T016S3_n10007Al_npsg3, T016S3_A10008Al_npsd, T016S3_n10008Al_npsd, T016S3_A10009Al_npsc,
            T016S3_n10009Al_npsc, T016S3_A10010Al_mtsg2, T016S3_n10010Al_mtsg2, T016S3_A10011Al_mtsg3, T016S3_n10011Al_mtsg3, T016S3_A10012Al_mtsd, T016S3_n10012Al_mtsd, T016S3_A10478Al_mtscj, T016S3_n10478Al_mtscj, T016S3_A10479Al_npcj,
            T016S3_n10479Al_npcj, T016S3_A396EmprCod
            }
            , new Object[] {
            T016S4_A407EmprNom, T016S4_n407EmprNom
            }
            , new Object[] {
            T016S5_A10004Al_cod, T016S5_A407EmprNom, T016S5_n407EmprNom, T016S5_A10005Al_np, T016S5_n10005Al_np, T016S5_A10006Al_npsg2, T016S5_n10006Al_npsg2, T016S5_A10007Al_npsg3, T016S5_n10007Al_npsg3, T016S5_A10008Al_npsd,
            T016S5_n10008Al_npsd, T016S5_A10009Al_npsc, T016S5_n10009Al_npsc, T016S5_A10010Al_mtsg2, T016S5_n10010Al_mtsg2, T016S5_A10011Al_mtsg3, T016S5_n10011Al_mtsg3, T016S5_A10012Al_mtsd, T016S5_n10012Al_mtsd, T016S5_A10478Al_mtscj,
            T016S5_n10478Al_mtscj, T016S5_A10479Al_npcj, T016S5_n10479Al_npcj, T016S5_A396EmprCod
            }
            , new Object[] {
            T016S6_A396EmprCod, T016S6_A10004Al_cod
            }
            , new Object[] {
            T016S7_A396EmprCod, T016S7_A10004Al_cod
            }
            , new Object[] {
            T016S8_A396EmprCod, T016S8_A10004Al_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016S12_A396EmprCod, T016S12_A10004Al_cod
            }
            , new Object[] {
            T016S13_A407EmprNom, T016S13_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TACTXX" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1362 ;
   private short nIsDirty_1362 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAl_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAl_np_Enabled ;
   private int edtAl_npsg2_Enabled ;
   private int edtAl_npsg3_Enabled ;
   private int edtAl_npsd_Enabled ;
   private int edtAl_npsc_Enabled ;
   private int edtAl_mtsg2_Enabled ;
   private int edtAl_mtsg3_Enabled ;
   private int edtAl_mtsd_Enabled ;
   private int edtAl_mtscj_Enabled ;
   private int edtAl_npcj_Enabled ;
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
   private int edtAl_npcj_Backcolor ;
   private int edtAl_mtscj_Backcolor ;
   private int edtAl_mtsd_Backcolor ;
   private int edtAl_mtsg3_Backcolor ;
   private int edtAl_mtsg2_Backcolor ;
   private int edtAl_npsc_Backcolor ;
   private int edtAl_npsd_Backcolor ;
   private int edtAl_npsg3_Backcolor ;
   private int edtAl_npsg2_Backcolor ;
   private int edtAl_np_Backcolor ;
   private int edtAl_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z10005Al_np ;
   private java.math.BigDecimal Z10006Al_npsg2 ;
   private java.math.BigDecimal Z10007Al_npsg3 ;
   private java.math.BigDecimal Z10008Al_npsd ;
   private java.math.BigDecimal Z10009Al_npsc ;
   private java.math.BigDecimal Z10010Al_mtsg2 ;
   private java.math.BigDecimal Z10011Al_mtsg3 ;
   private java.math.BigDecimal Z10012Al_mtsd ;
   private java.math.BigDecimal Z10478Al_mtscj ;
   private java.math.BigDecimal Z10479Al_npcj ;
   private java.math.BigDecimal A10005Al_np ;
   private java.math.BigDecimal A10006Al_npsg2 ;
   private java.math.BigDecimal A10007Al_npsg3 ;
   private java.math.BigDecimal A10008Al_npsd ;
   private java.math.BigDecimal A10009Al_npsc ;
   private java.math.BigDecimal A10010Al_mtsg2 ;
   private java.math.BigDecimal A10011Al_mtsg3 ;
   private java.math.BigDecimal A10012Al_mtsd ;
   private java.math.BigDecimal A10478Al_mtscj ;
   private java.math.BigDecimal A10479Al_npcj ;
   private java.math.BigDecimal ZZ10005Al_np ;
   private java.math.BigDecimal ZZ10006Al_npsg2 ;
   private java.math.BigDecimal ZZ10007Al_npsg3 ;
   private java.math.BigDecimal ZZ10008Al_npsd ;
   private java.math.BigDecimal ZZ10009Al_npsc ;
   private java.math.BigDecimal ZZ10010Al_mtsg2 ;
   private java.math.BigDecimal ZZ10011Al_mtsg3 ;
   private java.math.BigDecimal ZZ10012Al_mtsd ;
   private java.math.BigDecimal ZZ10478Al_mtscj ;
   private java.math.BigDecimal ZZ10479Al_npcj ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10004Al_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAl_cod_Internalname ;
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
   private String A10004Al_cod ;
   private String edtAl_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAl_np_Internalname ;
   private String edtAl_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAl_npsg2_Internalname ;
   private String edtAl_npsg2_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAl_npsg3_Internalname ;
   private String edtAl_npsg3_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAl_npsd_Internalname ;
   private String edtAl_npsd_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAl_npsc_Internalname ;
   private String edtAl_npsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAl_mtsg2_Internalname ;
   private String edtAl_mtsg2_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAl_mtsg3_Internalname ;
   private String edtAl_mtsg3_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAl_mtsd_Internalname ;
   private String edtAl_mtsd_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAl_mtscj_Internalname ;
   private String edtAl_mtscj_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAl_npcj_Internalname ;
   private String edtAl_npcj_Jsonclick ;
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
   private String AV35Al_cod ;
   private String AV36Pgmname ;
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
   private String sMode1362 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10004Al_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10005Al_np ;
   private boolean n10006Al_npsg2 ;
   private boolean n10007Al_npsg3 ;
   private boolean n10008Al_npsd ;
   private boolean n10009Al_npsc ;
   private boolean n10010Al_mtsg2 ;
   private boolean n10011Al_mtsg3 ;
   private boolean n10012Al_mtsd ;
   private boolean n10478Al_mtscj ;
   private boolean n10479Al_npcj ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T016S4_A407EmprNom ;
   private boolean[] T016S4_n407EmprNom ;
   private String[] T016S5_A10004Al_cod ;
   private String[] T016S5_A407EmprNom ;
   private boolean[] T016S5_n407EmprNom ;
   private java.math.BigDecimal[] T016S5_A10005Al_np ;
   private boolean[] T016S5_n10005Al_np ;
   private java.math.BigDecimal[] T016S5_A10006Al_npsg2 ;
   private boolean[] T016S5_n10006Al_npsg2 ;
   private java.math.BigDecimal[] T016S5_A10007Al_npsg3 ;
   private boolean[] T016S5_n10007Al_npsg3 ;
   private java.math.BigDecimal[] T016S5_A10008Al_npsd ;
   private boolean[] T016S5_n10008Al_npsd ;
   private java.math.BigDecimal[] T016S5_A10009Al_npsc ;
   private boolean[] T016S5_n10009Al_npsc ;
   private java.math.BigDecimal[] T016S5_A10010Al_mtsg2 ;
   private boolean[] T016S5_n10010Al_mtsg2 ;
   private java.math.BigDecimal[] T016S5_A10011Al_mtsg3 ;
   private boolean[] T016S5_n10011Al_mtsg3 ;
   private java.math.BigDecimal[] T016S5_A10012Al_mtsd ;
   private boolean[] T016S5_n10012Al_mtsd ;
   private java.math.BigDecimal[] T016S5_A10478Al_mtscj ;
   private boolean[] T016S5_n10478Al_mtscj ;
   private java.math.BigDecimal[] T016S5_A10479Al_npcj ;
   private boolean[] T016S5_n10479Al_npcj ;
   private String[] T016S5_A396EmprCod ;
   private String[] T016S6_A396EmprCod ;
   private String[] T016S6_A10004Al_cod ;
   private String[] T016S3_A10004Al_cod ;
   private java.math.BigDecimal[] T016S3_A10005Al_np ;
   private boolean[] T016S3_n10005Al_np ;
   private java.math.BigDecimal[] T016S3_A10006Al_npsg2 ;
   private boolean[] T016S3_n10006Al_npsg2 ;
   private java.math.BigDecimal[] T016S3_A10007Al_npsg3 ;
   private boolean[] T016S3_n10007Al_npsg3 ;
   private java.math.BigDecimal[] T016S3_A10008Al_npsd ;
   private boolean[] T016S3_n10008Al_npsd ;
   private java.math.BigDecimal[] T016S3_A10009Al_npsc ;
   private boolean[] T016S3_n10009Al_npsc ;
   private java.math.BigDecimal[] T016S3_A10010Al_mtsg2 ;
   private boolean[] T016S3_n10010Al_mtsg2 ;
   private java.math.BigDecimal[] T016S3_A10011Al_mtsg3 ;
   private boolean[] T016S3_n10011Al_mtsg3 ;
   private java.math.BigDecimal[] T016S3_A10012Al_mtsd ;
   private boolean[] T016S3_n10012Al_mtsd ;
   private java.math.BigDecimal[] T016S3_A10478Al_mtscj ;
   private boolean[] T016S3_n10478Al_mtscj ;
   private java.math.BigDecimal[] T016S3_A10479Al_npcj ;
   private boolean[] T016S3_n10479Al_npcj ;
   private String[] T016S3_A396EmprCod ;
   private String[] T016S7_A396EmprCod ;
   private String[] T016S7_A10004Al_cod ;
   private String[] T016S8_A396EmprCod ;
   private String[] T016S8_A10004Al_cod ;
   private String[] T016S2_A10004Al_cod ;
   private java.math.BigDecimal[] T016S2_A10005Al_np ;
   private boolean[] T016S2_n10005Al_np ;
   private java.math.BigDecimal[] T016S2_A10006Al_npsg2 ;
   private boolean[] T016S2_n10006Al_npsg2 ;
   private java.math.BigDecimal[] T016S2_A10007Al_npsg3 ;
   private boolean[] T016S2_n10007Al_npsg3 ;
   private java.math.BigDecimal[] T016S2_A10008Al_npsd ;
   private boolean[] T016S2_n10008Al_npsd ;
   private java.math.BigDecimal[] T016S2_A10009Al_npsc ;
   private boolean[] T016S2_n10009Al_npsc ;
   private java.math.BigDecimal[] T016S2_A10010Al_mtsg2 ;
   private boolean[] T016S2_n10010Al_mtsg2 ;
   private java.math.BigDecimal[] T016S2_A10011Al_mtsg3 ;
   private boolean[] T016S2_n10011Al_mtsg3 ;
   private java.math.BigDecimal[] T016S2_A10012Al_mtsd ;
   private boolean[] T016S2_n10012Al_mtsd ;
   private java.math.BigDecimal[] T016S2_A10478Al_mtscj ;
   private boolean[] T016S2_n10478Al_mtscj ;
   private java.math.BigDecimal[] T016S2_A10479Al_npcj ;
   private boolean[] T016S2_n10479Al_npcj ;
   private String[] T016S2_A396EmprCod ;
   private String[] T016S12_A396EmprCod ;
   private String[] T016S12_A10004Al_cod ;
   private String[] T016S13_A407EmprNom ;
   private boolean[] T016S13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactxx__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactxx__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactxx__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactxx__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactxx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016S2", "SELECT Al_cod, Al_np, Al_npsg2, Al_npsg3, Al_npsd, Al_npsc, Al_mtsg2, Al_mtsg3, Al_mtsd, Al_mtscj, Al_npcj, EmprCod FROM TXPACTXX WHERE EmprCod = ? AND Al_cod = ?  FOR UPDATE OF Al_np, Al_npsg2, Al_npsg3, Al_npsd, Al_npsc, Al_mtsg2, Al_mtsg3, Al_mtsd, Al_mtscj, Al_npcj NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S3", "SELECT Al_cod, Al_np, Al_npsg2, Al_npsg3, Al_npsd, Al_npsc, Al_mtsg2, Al_mtsg3, Al_mtsd, Al_mtscj, Al_npcj, EmprCod FROM TXPACTXX WHERE EmprCod = ? AND Al_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Al_cod, T2.EmprNom, TM1.Al_np, TM1.Al_npsg2, TM1.Al_npsg3, TM1.Al_npsd, TM1.Al_npsc, TM1.Al_mtsg2, TM1.Al_mtsg3, TM1.Al_mtsd, TM1.Al_mtscj, TM1.Al_npcj, TM1.EmprCod FROM (TXPACTXX TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Al_cod = ? ORDER BY TM1.EmprCod, TM1.Al_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Al_cod FROM TXPACTXX WHERE EmprCod = ? AND Al_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Al_cod FROM TXPACTXX WHERE ( Al_cod > ?) and EmprCod = ? ORDER BY EmprCod, Al_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016S8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Al_cod FROM TXPACTXX WHERE ( Al_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Al_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016S9", "INSERT INTO TXPACTXX(Al_cod, Al_np, Al_npsg2, Al_npsg3, Al_npsd, Al_npsc, Al_mtsg2, Al_mtsg3, Al_mtsd, Al_mtscj, Al_npcj, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTXX")
         ,new UpdateCursor("T016S10", "UPDATE TXPACTXX SET Al_np=?, Al_npsg2=?, Al_npsg3=?, Al_npsd=?, Al_npsc=?, Al_mtsg2=?, Al_mtsg3=?, Al_mtsd=?, Al_mtscj=?, Al_npcj=?  WHERE EmprCod = ? AND Al_cod = ?", GX_NOMASK, "TXPACTXX")
         ,new UpdateCursor("T016S11", "DELETE FROM TXPACTXX  WHERE EmprCod = ? AND Al_cod = ?", GX_NOMASK, "TXPACTXX")
         ,new ForEachCursor("T016S12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Al_cod FROM TXPACTXX WHERE EmprCod = ? ORDER BY EmprCod, Al_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016S13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
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
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 6);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 6);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 6);
               }
               stmt.setString(12, (String)parms[21], 3);
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
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 6);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 6);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 6);
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setString(12, (String)parms[21], 6);
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

