package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactem_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO ACTIVIDAD EMPAQUETAR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEm_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactem_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactem_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactem_impl.class ));
   }

   public tactem_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTEM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Seccion Actividad", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_cod_Internalname, GXutil.rtrim( A9966Em_cod), GXutil.rtrim( localUtil.format( A9966Em_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_cod_Jsonclick, 0, "", "", "", "", "", 1, edtEm_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_np_Internalname, GXutil.ltrim( localUtil.ntoc( A9967Em_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_np_Enabled!=0) ? localUtil.format( A9967Em_np, "ZZ9.99999") : localUtil.format( A9967Em_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_np_Jsonclick, 0, "", "", "", "", "", 1, edtEm_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N Piezas Empaq Rollo&lt;15kg", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzer1_Internalname, GXutil.ltrim( localUtil.ntoc( A9968Em_npzer1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzer1_Enabled!=0) ? localUtil.format( A9968Em_npzer1, "ZZ9.99999") : localUtil.format( A9968Em_npzer1, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzer1_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzer1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N Piezas Empaq Rollo&gt;15kg", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzer2_Internalname, GXutil.ltrim( localUtil.ntoc( A9969Em_npzer2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzer2_Enabled!=0) ? localUtil.format( A9969Em_npzer2, "ZZ9.99999") : localUtil.format( A9969Em_npzer2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzer2_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzer2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N Piezas Empaq Rollo doble fun", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzerdf_Internalname, GXutil.ltrim( localUtil.ntoc( A9970Em_npzerdf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzerdf_Enabled!=0) ? localUtil.format( A9970Em_npzerdf, "ZZ9.99999") : localUtil.format( A9970Em_npzerdf, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzerdf_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzerdf_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N Piezas Empaq Libro&lt;15Kg", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzel1_Internalname, GXutil.ltrim( localUtil.ntoc( A9971Em_npzel1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzel1_Enabled!=0) ? localUtil.format( A9971Em_npzel1, "ZZ9.99999") : localUtil.format( A9971Em_npzel1, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzel1_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzel1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N Piezas Empaq Libro&gt;15Kg", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzel2_Internalname, GXutil.ltrim( localUtil.ntoc( A9972Em_npzel2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzel2_Enabled!=0) ? localUtil.format( A9972Em_npzel2, "ZZ9.99999") : localUtil.format( A9972Em_npzel2, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzel2_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzel2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "N Piezas Empaq Libro doble fun", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzeldf_Internalname, GXutil.ltrim( localUtil.ntoc( A9973Em_npzeldf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzeldf_Enabled!=0) ? localUtil.format( A9973Em_npzeldf, "ZZ9.99999") : localUtil.format( A9973Em_npzeldf, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzeldf_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzeldf_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "N piezas poner Lazos", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_npzpl_Internalname, GXutil.ltrim( localUtil.ntoc( A9974Em_npzpl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_npzpl_Enabled!=0) ? localUtil.format( A9974Em_npzpl, "ZZ9.99999") : localUtil.format( A9974Em_npzpl, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_npzpl_Jsonclick, 0, "", "", "", "", "", 1, edtEm_npzpl_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N de carros vacios a llevar", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTEM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEm_ncvl_Internalname, GXutil.ltrim( localUtil.ntoc( A9975Em_ncvl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEm_ncvl_Enabled!=0) ? localUtil.format( A9975Em_ncvl, "ZZ9.99999") : localUtil.format( A9975Em_ncvl, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEm_ncvl_Jsonclick, 0, "", "", "", "", "", 1, edtEm_ncvl_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTEM.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTEM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTEM.htm");
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
      e1115Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9966Em_cod = httpContext.cgiGet( "Z9966Em_cod") ;
            Z9967Em_np = localUtil.ctond( httpContext.cgiGet( "Z9967Em_np")) ;
            Z9968Em_npzer1 = localUtil.ctond( httpContext.cgiGet( "Z9968Em_npzer1")) ;
            Z9969Em_npzer2 = localUtil.ctond( httpContext.cgiGet( "Z9969Em_npzer2")) ;
            Z9970Em_npzerdf = localUtil.ctond( httpContext.cgiGet( "Z9970Em_npzerdf")) ;
            Z9971Em_npzel1 = localUtil.ctond( httpContext.cgiGet( "Z9971Em_npzel1")) ;
            Z9972Em_npzel2 = localUtil.ctond( httpContext.cgiGet( "Z9972Em_npzel2")) ;
            Z9973Em_npzeldf = localUtil.ctond( httpContext.cgiGet( "Z9973Em_npzeldf")) ;
            Z9974Em_npzpl = localUtil.ctond( httpContext.cgiGet( "Z9974Em_npzpl")) ;
            Z9975Em_ncvl = localUtil.ctond( httpContext.cgiGet( "Z9975Em_ncvl")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pe_cod = httpContext.cgiGet( "vPE_COD") ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9966Em_cod = httpContext.cgiGet( edtEm_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9967Em_np = DecimalUtil.ZERO ;
               n9967Em_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrimstr( A9967Em_np, 9, 5));
            }
            else
            {
               A9967Em_np = localUtil.ctond( httpContext.cgiGet( edtEm_np_Internalname)) ;
               n9967Em_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrimstr( A9967Em_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzer1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzer1_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZER1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzer1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9968Em_npzer1 = DecimalUtil.ZERO ;
               n9968Em_npzer1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrimstr( A9968Em_npzer1, 9, 5));
            }
            else
            {
               A9968Em_npzer1 = localUtil.ctond( httpContext.cgiGet( edtEm_npzer1_Internalname)) ;
               n9968Em_npzer1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrimstr( A9968Em_npzer1, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzer2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzer2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZER2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzer2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9969Em_npzer2 = DecimalUtil.ZERO ;
               n9969Em_npzer2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrimstr( A9969Em_npzer2, 9, 5));
            }
            else
            {
               A9969Em_npzer2 = localUtil.ctond( httpContext.cgiGet( edtEm_npzer2_Internalname)) ;
               n9969Em_npzer2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrimstr( A9969Em_npzer2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzerdf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzerdf_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZERDF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzerdf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9970Em_npzerdf = DecimalUtil.ZERO ;
               n9970Em_npzerdf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrimstr( A9970Em_npzerdf, 9, 5));
            }
            else
            {
               A9970Em_npzerdf = localUtil.ctond( httpContext.cgiGet( edtEm_npzerdf_Internalname)) ;
               n9970Em_npzerdf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrimstr( A9970Em_npzerdf, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzel1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzel1_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZEL1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzel1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9971Em_npzel1 = DecimalUtil.ZERO ;
               n9971Em_npzel1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrimstr( A9971Em_npzel1, 9, 5));
            }
            else
            {
               A9971Em_npzel1 = localUtil.ctond( httpContext.cgiGet( edtEm_npzel1_Internalname)) ;
               n9971Em_npzel1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrimstr( A9971Em_npzel1, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzel2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzel2_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZEL2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzel2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9972Em_npzel2 = DecimalUtil.ZERO ;
               n9972Em_npzel2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrimstr( A9972Em_npzel2, 9, 5));
            }
            else
            {
               A9972Em_npzel2 = localUtil.ctond( httpContext.cgiGet( edtEm_npzel2_Internalname)) ;
               n9972Em_npzel2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrimstr( A9972Em_npzel2, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzeldf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzeldf_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZELDF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzeldf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9973Em_npzeldf = DecimalUtil.ZERO ;
               n9973Em_npzeldf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrimstr( A9973Em_npzeldf, 9, 5));
            }
            else
            {
               A9973Em_npzeldf = localUtil.ctond( httpContext.cgiGet( edtEm_npzeldf_Internalname)) ;
               n9973Em_npzeldf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrimstr( A9973Em_npzeldf, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_npzpl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_npzpl_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NPZPL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_npzpl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9974Em_npzpl = DecimalUtil.ZERO ;
               n9974Em_npzpl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrimstr( A9974Em_npzpl, 9, 5));
            }
            else
            {
               A9974Em_npzpl = localUtil.ctond( httpContext.cgiGet( edtEm_npzpl_Internalname)) ;
               n9974Em_npzpl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrimstr( A9974Em_npzpl, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEm_ncvl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEm_ncvl_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EM_NCVL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEm_ncvl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9975Em_ncvl = DecimalUtil.ZERO ;
               n9975Em_ncvl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrimstr( A9975Em_ncvl, 9, 5));
            }
            else
            {
               A9975Em_ncvl = localUtil.ctond( httpContext.cgiGet( edtEm_ncvl_Internalname)) ;
               n9975Em_ncvl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrimstr( A9975Em_ncvl, 9, 5));
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
               A9966Em_cod = httpContext.GetPar( "Em_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
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
                        e1115Z2 ();
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
            initAll15Z1324( ) ;
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
      disableAttributes15Z1324( ) ;
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

   public void confirm_15Z0( )
   {
      beforeValidate15Z1324( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15Z1324( ) ;
         }
         else
         {
            checkExtendedTable15Z1324( ) ;
            if ( AnyError == 0 )
            {
               zm15Z1324( 4) ;
            }
            closeExtendedTableCursors15Z1324( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues15Z0( ) ;
      }
   }

   public void resetCaption15Z0( )
   {
   }

   public void e1115Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactem_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tactem_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactem_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactem_impl.this.A396EmprCod = GXv_char2[0] ;
      tactem_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactem_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV33Pe_cod ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACEM", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactem_impl.this.A396EmprCod = GXv_char4[0] ;
      tactem_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV33Pe_cod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pe_cod", AV33Pe_cod);
      if ( GXutil.strcmp(AV33Pe_cod, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACEM", ""));
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

   public void zm15Z1324( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9967Em_np = T015Z3_A9967Em_np[0] ;
            Z9968Em_npzer1 = T015Z3_A9968Em_npzer1[0] ;
            Z9969Em_npzer2 = T015Z3_A9969Em_npzer2[0] ;
            Z9970Em_npzerdf = T015Z3_A9970Em_npzerdf[0] ;
            Z9971Em_npzel1 = T015Z3_A9971Em_npzel1[0] ;
            Z9972Em_npzel2 = T015Z3_A9972Em_npzel2[0] ;
            Z9973Em_npzeldf = T015Z3_A9973Em_npzeldf[0] ;
            Z9974Em_npzpl = T015Z3_A9974Em_npzpl[0] ;
            Z9975Em_ncvl = T015Z3_A9975Em_ncvl[0] ;
         }
         else
         {
            Z9967Em_np = A9967Em_np ;
            Z9968Em_npzer1 = A9968Em_npzer1 ;
            Z9969Em_npzer2 = A9969Em_npzer2 ;
            Z9970Em_npzerdf = A9970Em_npzerdf ;
            Z9971Em_npzel1 = A9971Em_npzel1 ;
            Z9972Em_npzel2 = A9972Em_npzel2 ;
            Z9973Em_npzeldf = A9973Em_npzeldf ;
            Z9974Em_npzpl = A9974Em_npzpl ;
            Z9975Em_ncvl = A9975Em_ncvl ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9966Em_cod = A9966Em_cod ;
         Z9967Em_np = A9967Em_np ;
         Z9968Em_npzer1 = A9968Em_npzer1 ;
         Z9969Em_npzer2 = A9969Em_npzer2 ;
         Z9970Em_npzerdf = A9970Em_npzerdf ;
         Z9971Em_npzel1 = A9971Em_npzel1 ;
         Z9972Em_npzel2 = A9972Em_npzel2 ;
         Z9973Em_npzeldf = A9973Em_npzeldf ;
         Z9974Em_npzpl = A9974Em_npzpl ;
         Z9975Em_ncvl = A9975Em_ncvl ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TACTEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T015Z4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015Z4_A407EmprNom[0] ;
      n407EmprNom = T015Z4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A9966Em_cod = AV33Pe_cod ;
      httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
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

   public void load15Z1324( )
   {
      /* Using cursor T015Z5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9966Em_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1324 = (short)(1) ;
         A407EmprNom = T015Z5_A407EmprNom[0] ;
         n407EmprNom = T015Z5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9967Em_np = T015Z5_A9967Em_np[0] ;
         n9967Em_np = T015Z5_n9967Em_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrimstr( A9967Em_np, 9, 5));
         A9968Em_npzer1 = T015Z5_A9968Em_npzer1[0] ;
         n9968Em_npzer1 = T015Z5_n9968Em_npzer1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrimstr( A9968Em_npzer1, 9, 5));
         A9969Em_npzer2 = T015Z5_A9969Em_npzer2[0] ;
         n9969Em_npzer2 = T015Z5_n9969Em_npzer2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrimstr( A9969Em_npzer2, 9, 5));
         A9970Em_npzerdf = T015Z5_A9970Em_npzerdf[0] ;
         n9970Em_npzerdf = T015Z5_n9970Em_npzerdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrimstr( A9970Em_npzerdf, 9, 5));
         A9971Em_npzel1 = T015Z5_A9971Em_npzel1[0] ;
         n9971Em_npzel1 = T015Z5_n9971Em_npzel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrimstr( A9971Em_npzel1, 9, 5));
         A9972Em_npzel2 = T015Z5_A9972Em_npzel2[0] ;
         n9972Em_npzel2 = T015Z5_n9972Em_npzel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrimstr( A9972Em_npzel2, 9, 5));
         A9973Em_npzeldf = T015Z5_A9973Em_npzeldf[0] ;
         n9973Em_npzeldf = T015Z5_n9973Em_npzeldf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrimstr( A9973Em_npzeldf, 9, 5));
         A9974Em_npzpl = T015Z5_A9974Em_npzpl[0] ;
         n9974Em_npzpl = T015Z5_n9974Em_npzpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrimstr( A9974Em_npzpl, 9, 5));
         A9975Em_ncvl = T015Z5_A9975Em_ncvl[0] ;
         n9975Em_ncvl = T015Z5_n9975Em_ncvl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrimstr( A9975Em_ncvl, 9, 5));
         zm15Z1324( -3) ;
      }
      pr_default.close(3);
      onLoadActions15Z1324( ) ;
   }

   public void onLoadActions15Z1324( )
   {
   }

   public void checkExtendedTable15Z1324( )
   {
      nIsDirty_1324 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A9966Em_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "EM_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEm_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15Z1324( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15Z1324( )
   {
      /* Using cursor T015Z6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A9966Em_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1324 = (short)(1) ;
      }
      else
      {
         RcdFound1324 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015Z3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9966Em_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015Z3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15Z1324( 3) ;
         RcdFound1324 = (short)(1) ;
         A9966Em_cod = T015Z3_A9966Em_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
         A9967Em_np = T015Z3_A9967Em_np[0] ;
         n9967Em_np = T015Z3_n9967Em_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrimstr( A9967Em_np, 9, 5));
         A9968Em_npzer1 = T015Z3_A9968Em_npzer1[0] ;
         n9968Em_npzer1 = T015Z3_n9968Em_npzer1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrimstr( A9968Em_npzer1, 9, 5));
         A9969Em_npzer2 = T015Z3_A9969Em_npzer2[0] ;
         n9969Em_npzer2 = T015Z3_n9969Em_npzer2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrimstr( A9969Em_npzer2, 9, 5));
         A9970Em_npzerdf = T015Z3_A9970Em_npzerdf[0] ;
         n9970Em_npzerdf = T015Z3_n9970Em_npzerdf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrimstr( A9970Em_npzerdf, 9, 5));
         A9971Em_npzel1 = T015Z3_A9971Em_npzel1[0] ;
         n9971Em_npzel1 = T015Z3_n9971Em_npzel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrimstr( A9971Em_npzel1, 9, 5));
         A9972Em_npzel2 = T015Z3_A9972Em_npzel2[0] ;
         n9972Em_npzel2 = T015Z3_n9972Em_npzel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrimstr( A9972Em_npzel2, 9, 5));
         A9973Em_npzeldf = T015Z3_A9973Em_npzeldf[0] ;
         n9973Em_npzeldf = T015Z3_n9973Em_npzeldf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrimstr( A9973Em_npzeldf, 9, 5));
         A9974Em_npzpl = T015Z3_A9974Em_npzpl[0] ;
         n9974Em_npzpl = T015Z3_n9974Em_npzpl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrimstr( A9974Em_npzpl, 9, 5));
         A9975Em_ncvl = T015Z3_A9975Em_ncvl[0] ;
         n9975Em_ncvl = T015Z3_n9975Em_ncvl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrimstr( A9975Em_ncvl, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z9966Em_cod = A9966Em_cod ;
         sMode1324 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15Z1324( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1324 = (short)(0) ;
            initializeNonKey15Z1324( ) ;
         }
         Gx_mode = sMode1324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1324 = (short)(0) ;
         initializeNonKey15Z1324( ) ;
         sMode1324 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey15Z1324( ) ;
      if ( RcdFound1324 == 0 )
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
      RcdFound1324 = (short)(0) ;
      /* Using cursor T015Z7 */
      pr_default.execute(5, new Object[] {A9966Em_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015Z7_A9966Em_cod[0], A9966Em_cod) < 0 ) ) && ( GXutil.strcmp(T015Z7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015Z7_A9966Em_cod[0], A9966Em_cod) > 0 ) ) && ( GXutil.strcmp(T015Z7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9966Em_cod = T015Z7_A9966Em_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
            RcdFound1324 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1324 = (short)(0) ;
      /* Using cursor T015Z8 */
      pr_default.execute(6, new Object[] {A9966Em_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015Z8_A9966Em_cod[0], A9966Em_cod) > 0 ) ) && ( GXutil.strcmp(T015Z8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015Z8_A9966Em_cod[0], A9966Em_cod) < 0 ) ) && ( GXutil.strcmp(T015Z8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9966Em_cod = T015Z8_A9966Em_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
            RcdFound1324 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15Z1324( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEm_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15Z1324( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1324 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9966Em_cod, Z9966Em_cod) != 0 ) )
            {
               A9966Em_cod = Z9966Em_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEm_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15Z1324( ) ;
               GX_FocusControl = edtEm_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9966Em_cod, Z9966Em_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEm_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15Z1324( ) ;
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
                  GX_FocusControl = edtEm_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15Z1324( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9966Em_cod, Z9966Em_cod) != 0 ) )
      {
         A9966Em_cod = Z9966Em_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEm_cod_Internalname ;
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
      getKey15Z1324( ) ;
      if ( RcdFound1324 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9966Em_cod, Z9966Em_cod) != 0 ) )
         {
            A9966Em_cod = Z9966Em_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9966Em_cod, Z9966Em_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactem");
      GX_FocusControl = edtEm_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15Z0( ) ;
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
      if ( RcdFound1324 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEm_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15Z1324( ) ;
      if ( RcdFound1324 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEm_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15Z1324( ) ;
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
      if ( RcdFound1324 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEm_np_Internalname ;
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
      if ( RcdFound1324 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEm_np_Internalname ;
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
      scanStart15Z1324( ) ;
      if ( RcdFound1324 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1324 != 0 )
         {
            scanNext15Z1324( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEm_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15Z1324( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15Z1324( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015Z2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9966Em_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9967Em_np, T015Z2_A9967Em_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z9968Em_npzer1, T015Z2_A9968Em_npzer1[0]) != 0 ) || ( DecimalUtil.compareTo(Z9969Em_npzer2, T015Z2_A9969Em_npzer2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9970Em_npzerdf, T015Z2_A9970Em_npzerdf[0]) != 0 ) || ( DecimalUtil.compareTo(Z9971Em_npzel1, T015Z2_A9971Em_npzel1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9972Em_npzel2, T015Z2_A9972Em_npzel2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9973Em_npzeldf, T015Z2_A9973Em_npzeldf[0]) != 0 ) || ( DecimalUtil.compareTo(Z9974Em_npzpl, T015Z2_A9974Em_npzpl[0]) != 0 ) || ( DecimalUtil.compareTo(Z9975Em_ncvl, T015Z2_A9975Em_ncvl[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9967Em_np, T015Z2_A9967Em_np[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_np");
               GXutil.writeLogRaw("Old: ",Z9967Em_np);
               GXutil.writeLogRaw("Current: ",T015Z2_A9967Em_np[0]);
            }
            if ( DecimalUtil.compareTo(Z9968Em_npzer1, T015Z2_A9968Em_npzer1[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzer1");
               GXutil.writeLogRaw("Old: ",Z9968Em_npzer1);
               GXutil.writeLogRaw("Current: ",T015Z2_A9968Em_npzer1[0]);
            }
            if ( DecimalUtil.compareTo(Z9969Em_npzer2, T015Z2_A9969Em_npzer2[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzer2");
               GXutil.writeLogRaw("Old: ",Z9969Em_npzer2);
               GXutil.writeLogRaw("Current: ",T015Z2_A9969Em_npzer2[0]);
            }
            if ( DecimalUtil.compareTo(Z9970Em_npzerdf, T015Z2_A9970Em_npzerdf[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzerdf");
               GXutil.writeLogRaw("Old: ",Z9970Em_npzerdf);
               GXutil.writeLogRaw("Current: ",T015Z2_A9970Em_npzerdf[0]);
            }
            if ( DecimalUtil.compareTo(Z9971Em_npzel1, T015Z2_A9971Em_npzel1[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzel1");
               GXutil.writeLogRaw("Old: ",Z9971Em_npzel1);
               GXutil.writeLogRaw("Current: ",T015Z2_A9971Em_npzel1[0]);
            }
            if ( DecimalUtil.compareTo(Z9972Em_npzel2, T015Z2_A9972Em_npzel2[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzel2");
               GXutil.writeLogRaw("Old: ",Z9972Em_npzel2);
               GXutil.writeLogRaw("Current: ",T015Z2_A9972Em_npzel2[0]);
            }
            if ( DecimalUtil.compareTo(Z9973Em_npzeldf, T015Z2_A9973Em_npzeldf[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzeldf");
               GXutil.writeLogRaw("Old: ",Z9973Em_npzeldf);
               GXutil.writeLogRaw("Current: ",T015Z2_A9973Em_npzeldf[0]);
            }
            if ( DecimalUtil.compareTo(Z9974Em_npzpl, T015Z2_A9974Em_npzpl[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_npzpl");
               GXutil.writeLogRaw("Old: ",Z9974Em_npzpl);
               GXutil.writeLogRaw("Current: ",T015Z2_A9974Em_npzpl[0]);
            }
            if ( DecimalUtil.compareTo(Z9975Em_ncvl, T015Z2_A9975Em_ncvl[0]) != 0 )
            {
               GXutil.writeLogln("tactem:[seudo value changed for attri]"+"Em_ncvl");
               GXutil.writeLogRaw("Old: ",Z9975Em_ncvl);
               GXutil.writeLogRaw("Current: ",T015Z2_A9975Em_ncvl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15Z1324( )
   {
      beforeValidate15Z1324( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Z1324( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15Z1324( 0) ;
         checkOptimisticConcurrency15Z1324( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15Z1324( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15Z1324( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Z9 */
                  pr_default.execute(7, new Object[] {A9966Em_cod, Boolean.valueOf(n9967Em_np), A9967Em_np, Boolean.valueOf(n9968Em_npzer1), A9968Em_npzer1, Boolean.valueOf(n9969Em_npzer2), A9969Em_npzer2, Boolean.valueOf(n9970Em_npzerdf), A9970Em_npzerdf, Boolean.valueOf(n9971Em_npzel1), A9971Em_npzel1, Boolean.valueOf(n9972Em_npzel2), A9972Em_npzel2, Boolean.valueOf(n9973Em_npzeldf), A9973Em_npzeldf, Boolean.valueOf(n9974Em_npzpl), A9974Em_npzpl, Boolean.valueOf(n9975Em_ncvl), A9975Em_ncvl, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTEM");
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
                        resetCaption15Z0( ) ;
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
            load15Z1324( ) ;
         }
         endLevel15Z1324( ) ;
      }
      closeExtendedTableCursors15Z1324( ) ;
   }

   public void update15Z1324( )
   {
      beforeValidate15Z1324( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15Z1324( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15Z1324( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15Z1324( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15Z1324( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015Z10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n9967Em_np), A9967Em_np, Boolean.valueOf(n9968Em_npzer1), A9968Em_npzer1, Boolean.valueOf(n9969Em_npzer2), A9969Em_npzer2, Boolean.valueOf(n9970Em_npzerdf), A9970Em_npzerdf, Boolean.valueOf(n9971Em_npzel1), A9971Em_npzel1, Boolean.valueOf(n9972Em_npzel2), A9972Em_npzel2, Boolean.valueOf(n9973Em_npzeldf), A9973Em_npzeldf, Boolean.valueOf(n9974Em_npzpl), A9974Em_npzpl, Boolean.valueOf(n9975Em_ncvl), A9975Em_ncvl, A396EmprCod, A9966Em_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTEM");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15Z1324( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption15Z0( ) ;
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
         endLevel15Z1324( ) ;
      }
      closeExtendedTableCursors15Z1324( ) ;
   }

   public void deferredUpdate15Z1324( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15Z1324( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15Z1324( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15Z1324( ) ;
         afterConfirm15Z1324( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15Z1324( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015Z11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A9966Em_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTEM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1324 == 0 )
                     {
                        initAll15Z1324( ) ;
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
                     resetCaption15Z0( ) ;
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
      sMode1324 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15Z1324( ) ;
      Gx_mode = sMode1324 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15Z1324( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015Z12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A9966Em_cod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel15Z1324( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15Z1324( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactem");
         if ( AnyError == 0 )
         {
            confirmValues15Z0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactem");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15Z1324( )
   {
      /* Scan By routine */
      /* Using cursor T015Z13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1324 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1324 = (short)(1) ;
         A9966Em_cod = T015Z13_A9966Em_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15Z1324( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1324 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1324 = (short)(1) ;
         A9966Em_cod = T015Z13_A9966Em_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
      }
   }

   public void scanEnd15Z1324( )
   {
      pr_default.close(11);
   }

   public void afterConfirm15Z1324( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15Z1324( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15Z1324( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15Z1324( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15Z1324( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15Z1324( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15Z1324( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEm_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_cod_Enabled), 5, 0), true);
      edtEm_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_np_Enabled), 5, 0), true);
      edtEm_npzer1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzer1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzer1_Enabled), 5, 0), true);
      edtEm_npzer2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzer2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzer2_Enabled), 5, 0), true);
      edtEm_npzerdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzerdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzerdf_Enabled), 5, 0), true);
      edtEm_npzel1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzel1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzel1_Enabled), 5, 0), true);
      edtEm_npzel2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzel2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzel2_Enabled), 5, 0), true);
      edtEm_npzeldf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzeldf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzeldf_Enabled), 5, 0), true);
      edtEm_npzpl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_npzpl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_npzpl_Enabled), 5, 0), true);
      edtEm_ncvl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEm_ncvl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEm_ncvl_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes15Z1324( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues15Z0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactem", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9966Em_cod", GXutil.rtrim( Z9966Em_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9967Em_np", GXutil.ltrim( localUtil.ntoc( Z9967Em_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9968Em_npzer1", GXutil.ltrim( localUtil.ntoc( Z9968Em_npzer1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9969Em_npzer2", GXutil.ltrim( localUtil.ntoc( Z9969Em_npzer2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9970Em_npzerdf", GXutil.ltrim( localUtil.ntoc( Z9970Em_npzerdf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9971Em_npzel1", GXutil.ltrim( localUtil.ntoc( Z9971Em_npzel1, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9972Em_npzel2", GXutil.ltrim( localUtil.ntoc( Z9972Em_npzel2, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9973Em_npzeldf", GXutil.ltrim( localUtil.ntoc( Z9973Em_npzeldf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9974Em_npzpl", GXutil.ltrim( localUtil.ntoc( Z9974Em_npzpl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9975Em_ncvl", GXutil.ltrim( localUtil.ntoc( Z9975Em_ncvl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPE_COD", GXutil.rtrim( AV33Pe_cod));
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
      return formatLink("app.tactem", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTEM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO ACTIVIDAD EMPAQUETAR", "") ;
   }

   public void initializeNonKey15Z1324( )
   {
      A9967Em_np = DecimalUtil.ZERO ;
      n9967Em_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrimstr( A9967Em_np, 9, 5));
      A9968Em_npzer1 = DecimalUtil.ZERO ;
      n9968Em_npzer1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrimstr( A9968Em_npzer1, 9, 5));
      A9969Em_npzer2 = DecimalUtil.ZERO ;
      n9969Em_npzer2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrimstr( A9969Em_npzer2, 9, 5));
      A9970Em_npzerdf = DecimalUtil.ZERO ;
      n9970Em_npzerdf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrimstr( A9970Em_npzerdf, 9, 5));
      A9971Em_npzel1 = DecimalUtil.ZERO ;
      n9971Em_npzel1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrimstr( A9971Em_npzel1, 9, 5));
      A9972Em_npzel2 = DecimalUtil.ZERO ;
      n9972Em_npzel2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrimstr( A9972Em_npzel2, 9, 5));
      A9973Em_npzeldf = DecimalUtil.ZERO ;
      n9973Em_npzeldf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrimstr( A9973Em_npzeldf, 9, 5));
      A9974Em_npzpl = DecimalUtil.ZERO ;
      n9974Em_npzpl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrimstr( A9974Em_npzpl, 9, 5));
      A9975Em_ncvl = DecimalUtil.ZERO ;
      n9975Em_ncvl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrimstr( A9975Em_ncvl, 9, 5));
      Z9967Em_np = DecimalUtil.ZERO ;
      Z9968Em_npzer1 = DecimalUtil.ZERO ;
      Z9969Em_npzer2 = DecimalUtil.ZERO ;
      Z9970Em_npzerdf = DecimalUtil.ZERO ;
      Z9971Em_npzel1 = DecimalUtil.ZERO ;
      Z9972Em_npzel2 = DecimalUtil.ZERO ;
      Z9973Em_npzeldf = DecimalUtil.ZERO ;
      Z9974Em_npzpl = DecimalUtil.ZERO ;
      Z9975Em_ncvl = DecimalUtil.ZERO ;
   }

   public void initAll15Z1324( )
   {
      A9966Em_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9966Em_cod", A9966Em_cod);
      initializeNonKey15Z1324( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543716", true, true);
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
      httpContext.AddJavascriptSource("tactem.js", "?20268241543716", false, true);
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
      edtEm_cod_Internalname = "EM_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEm_np_Internalname = "EM_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEm_npzer1_Internalname = "EM_NPZER1" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEm_npzer2_Internalname = "EM_NPZER2" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEm_npzerdf_Internalname = "EM_NPZERDF" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEm_npzel1_Internalname = "EM_NPZEL1" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEm_npzel2_Internalname = "EM_NPZEL2" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEm_npzeldf_Internalname = "EM_NPZELDF" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEm_npzpl_Internalname = "EM_NPZPL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEm_ncvl_Internalname = "EM_NCVL" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO ACTIVIDAD EMPAQUETAR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEm_ncvl_Jsonclick = "" ;
      edtEm_ncvl_Backcolor = (int)(0xFFFFFF) ;
      edtEm_ncvl_Enabled = 1 ;
      edtEm_npzpl_Jsonclick = "" ;
      edtEm_npzpl_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzpl_Enabled = 1 ;
      edtEm_npzeldf_Jsonclick = "" ;
      edtEm_npzeldf_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzeldf_Enabled = 1 ;
      edtEm_npzel2_Jsonclick = "" ;
      edtEm_npzel2_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzel2_Enabled = 1 ;
      edtEm_npzel1_Jsonclick = "" ;
      edtEm_npzel1_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzel1_Enabled = 1 ;
      edtEm_npzerdf_Jsonclick = "" ;
      edtEm_npzerdf_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzerdf_Enabled = 1 ;
      edtEm_npzer2_Jsonclick = "" ;
      edtEm_npzer2_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzer2_Enabled = 1 ;
      edtEm_npzer1_Jsonclick = "" ;
      edtEm_npzer1_Backcolor = (int)(0xFFFFFF) ;
      edtEm_npzer1_Enabled = 1 ;
      edtEm_np_Jsonclick = "" ;
      edtEm_np_Backcolor = (int)(0xFFFFFF) ;
      edtEm_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEm_cod_Jsonclick = "" ;
      edtEm_cod_Backcolor = (int)(0xFFFFFF) ;
      edtEm_cod_Enabled = 1 ;
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
      /* Using cursor T015Z14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015Z14_A407EmprNom[0] ;
      n407EmprNom = T015Z14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      GX_FocusControl = edtEm_np_Internalname ;
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

   public void valid_Em_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A9966Em_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "EM_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEm_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9967Em_np", GXutil.ltrim( localUtil.ntoc( A9967Em_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9968Em_npzer1", GXutil.ltrim( localUtil.ntoc( A9968Em_npzer1, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9969Em_npzer2", GXutil.ltrim( localUtil.ntoc( A9969Em_npzer2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9970Em_npzerdf", GXutil.ltrim( localUtil.ntoc( A9970Em_npzerdf, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9971Em_npzel1", GXutil.ltrim( localUtil.ntoc( A9971Em_npzel1, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9972Em_npzel2", GXutil.ltrim( localUtil.ntoc( A9972Em_npzel2, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9973Em_npzeldf", GXutil.ltrim( localUtil.ntoc( A9973Em_npzeldf, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9974Em_npzpl", GXutil.ltrim( localUtil.ntoc( A9974Em_npzpl, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9975Em_ncvl", GXutil.ltrim( localUtil.ntoc( A9975Em_ncvl, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9966Em_cod", GXutil.rtrim( Z9966Em_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9967Em_np", GXutil.ltrim( localUtil.ntoc( Z9967Em_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9968Em_npzer1", GXutil.ltrim( localUtil.ntoc( Z9968Em_npzer1, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9969Em_npzer2", GXutil.ltrim( localUtil.ntoc( Z9969Em_npzer2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9970Em_npzerdf", GXutil.ltrim( localUtil.ntoc( Z9970Em_npzerdf, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9971Em_npzel1", GXutil.ltrim( localUtil.ntoc( Z9971Em_npzel1, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9972Em_npzel2", GXutil.ltrim( localUtil.ntoc( Z9972Em_npzel2, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9973Em_npzeldf", GXutil.ltrim( localUtil.ntoc( Z9973Em_npzeldf, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9974Em_npzpl", GXutil.ltrim( localUtil.ntoc( Z9974Em_npzpl, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9975Em_ncvl", GXutil.ltrim( localUtil.ntoc( Z9975Em_ncvl, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_EM_COD","{handler:'valid_Em_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9966Em_cod',fld:'EM_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV33Pe_cod',fld:'vPE_COD',pic:''}]");
      setEventMetadata("VALID_EM_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9967Em_np',fld:'EM_NP',pic:'ZZ9.99999'},{av:'A9968Em_npzer1',fld:'EM_NPZER1',pic:'ZZ9.99999'},{av:'A9969Em_npzer2',fld:'EM_NPZER2',pic:'ZZ9.99999'},{av:'A9970Em_npzerdf',fld:'EM_NPZERDF',pic:'ZZ9.99999'},{av:'A9971Em_npzel1',fld:'EM_NPZEL1',pic:'ZZ9.99999'},{av:'A9972Em_npzel2',fld:'EM_NPZEL2',pic:'ZZ9.99999'},{av:'A9973Em_npzeldf',fld:'EM_NPZELDF',pic:'ZZ9.99999'},{av:'A9974Em_npzpl',fld:'EM_NPZPL',pic:'ZZ9.99999'},{av:'A9975Em_ncvl',fld:'EM_NCVL',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9966Em_cod'},{av:'Z407EmprNom'},{av:'Z9967Em_np'},{av:'Z9968Em_npzer1'},{av:'Z9969Em_npzer2'},{av:'Z9970Em_npzerdf'},{av:'Z9971Em_npzel1'},{av:'Z9972Em_npzel2'},{av:'Z9973Em_npzeldf'},{av:'Z9974Em_npzpl'},{av:'Z9975Em_ncvl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9966Em_cod = "" ;
      Z9967Em_np = DecimalUtil.ZERO ;
      Z9968Em_npzer1 = DecimalUtil.ZERO ;
      Z9969Em_npzer2 = DecimalUtil.ZERO ;
      Z9970Em_npzerdf = DecimalUtil.ZERO ;
      Z9971Em_npzel1 = DecimalUtil.ZERO ;
      Z9972Em_npzel2 = DecimalUtil.ZERO ;
      Z9973Em_npzeldf = DecimalUtil.ZERO ;
      Z9974Em_npzpl = DecimalUtil.ZERO ;
      Z9975Em_ncvl = DecimalUtil.ZERO ;
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
      A9966Em_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A9967Em_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A9968Em_npzer1 = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A9969Em_npzer2 = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A9970Em_npzerdf = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A9971Em_npzel1 = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A9972Em_npzel2 = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A9973Em_npzeldf = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A9974Em_npzpl = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A9975Em_ncvl = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pe_cod = "" ;
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
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      T015Z4_A407EmprNom = new String[] {""} ;
      T015Z4_n407EmprNom = new boolean[] {false} ;
      T015Z5_A9966Em_cod = new String[] {""} ;
      T015Z5_A407EmprNom = new String[] {""} ;
      T015Z5_n407EmprNom = new boolean[] {false} ;
      T015Z5_A9967Em_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9967Em_np = new boolean[] {false} ;
      T015Z5_A9968Em_npzer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9968Em_npzer1 = new boolean[] {false} ;
      T015Z5_A9969Em_npzer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9969Em_npzer2 = new boolean[] {false} ;
      T015Z5_A9970Em_npzerdf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9970Em_npzerdf = new boolean[] {false} ;
      T015Z5_A9971Em_npzel1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9971Em_npzel1 = new boolean[] {false} ;
      T015Z5_A9972Em_npzel2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9972Em_npzel2 = new boolean[] {false} ;
      T015Z5_A9973Em_npzeldf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9973Em_npzeldf = new boolean[] {false} ;
      T015Z5_A9974Em_npzpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9974Em_npzpl = new boolean[] {false} ;
      T015Z5_A9975Em_ncvl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z5_n9975Em_ncvl = new boolean[] {false} ;
      T015Z5_A396EmprCod = new String[] {""} ;
      T015Z6_A396EmprCod = new String[] {""} ;
      T015Z6_A9966Em_cod = new String[] {""} ;
      T015Z3_A9966Em_cod = new String[] {""} ;
      T015Z3_A9967Em_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9967Em_np = new boolean[] {false} ;
      T015Z3_A9968Em_npzer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9968Em_npzer1 = new boolean[] {false} ;
      T015Z3_A9969Em_npzer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9969Em_npzer2 = new boolean[] {false} ;
      T015Z3_A9970Em_npzerdf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9970Em_npzerdf = new boolean[] {false} ;
      T015Z3_A9971Em_npzel1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9971Em_npzel1 = new boolean[] {false} ;
      T015Z3_A9972Em_npzel2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9972Em_npzel2 = new boolean[] {false} ;
      T015Z3_A9973Em_npzeldf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9973Em_npzeldf = new boolean[] {false} ;
      T015Z3_A9974Em_npzpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9974Em_npzpl = new boolean[] {false} ;
      T015Z3_A9975Em_ncvl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z3_n9975Em_ncvl = new boolean[] {false} ;
      T015Z3_A396EmprCod = new String[] {""} ;
      sMode1324 = "" ;
      T015Z7_A396EmprCod = new String[] {""} ;
      T015Z7_A9966Em_cod = new String[] {""} ;
      T015Z8_A396EmprCod = new String[] {""} ;
      T015Z8_A9966Em_cod = new String[] {""} ;
      T015Z2_A9966Em_cod = new String[] {""} ;
      T015Z2_A9967Em_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9967Em_np = new boolean[] {false} ;
      T015Z2_A9968Em_npzer1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9968Em_npzer1 = new boolean[] {false} ;
      T015Z2_A9969Em_npzer2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9969Em_npzer2 = new boolean[] {false} ;
      T015Z2_A9970Em_npzerdf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9970Em_npzerdf = new boolean[] {false} ;
      T015Z2_A9971Em_npzel1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9971Em_npzel1 = new boolean[] {false} ;
      T015Z2_A9972Em_npzel2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9972Em_npzel2 = new boolean[] {false} ;
      T015Z2_A9973Em_npzeldf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9973Em_npzeldf = new boolean[] {false} ;
      T015Z2_A9974Em_npzpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9974Em_npzpl = new boolean[] {false} ;
      T015Z2_A9975Em_ncvl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015Z2_n9975Em_ncvl = new boolean[] {false} ;
      T015Z2_A396EmprCod = new String[] {""} ;
      T015Z12_A396EmprCod = new String[] {""} ;
      T015Z12_A129BarCod = new int[1] ;
      T015Z12_A132BarCodReo = new byte[1] ;
      T015Z12_A130BarCodPar = new String[] {""} ;
      T015Z12_A758ProCod = new String[] {""} ;
      T015Z12_A194BarOrdLin = new short[1] ;
      T015Z12_A9966Em_cod = new String[] {""} ;
      T015Z13_A396EmprCod = new String[] {""} ;
      T015Z13_A9966Em_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T015Z14_A407EmprNom = new String[] {""} ;
      T015Z14_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9966Em_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9967Em_np = DecimalUtil.ZERO ;
      ZZ9968Em_npzer1 = DecimalUtil.ZERO ;
      ZZ9969Em_npzer2 = DecimalUtil.ZERO ;
      ZZ9970Em_npzerdf = DecimalUtil.ZERO ;
      ZZ9971Em_npzel1 = DecimalUtil.ZERO ;
      ZZ9972Em_npzel2 = DecimalUtil.ZERO ;
      ZZ9973Em_npzeldf = DecimalUtil.ZERO ;
      ZZ9974Em_npzpl = DecimalUtil.ZERO ;
      ZZ9975Em_ncvl = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactem__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactem__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactem__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactem__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactem__default(),
         new Object[] {
             new Object[] {
            T015Z2_A9966Em_cod, T015Z2_A9967Em_np, T015Z2_n9967Em_np, T015Z2_A9968Em_npzer1, T015Z2_n9968Em_npzer1, T015Z2_A9969Em_npzer2, T015Z2_n9969Em_npzer2, T015Z2_A9970Em_npzerdf, T015Z2_n9970Em_npzerdf, T015Z2_A9971Em_npzel1,
            T015Z2_n9971Em_npzel1, T015Z2_A9972Em_npzel2, T015Z2_n9972Em_npzel2, T015Z2_A9973Em_npzeldf, T015Z2_n9973Em_npzeldf, T015Z2_A9974Em_npzpl, T015Z2_n9974Em_npzpl, T015Z2_A9975Em_ncvl, T015Z2_n9975Em_ncvl, T015Z2_A396EmprCod
            }
            , new Object[] {
            T015Z3_A9966Em_cod, T015Z3_A9967Em_np, T015Z3_n9967Em_np, T015Z3_A9968Em_npzer1, T015Z3_n9968Em_npzer1, T015Z3_A9969Em_npzer2, T015Z3_n9969Em_npzer2, T015Z3_A9970Em_npzerdf, T015Z3_n9970Em_npzerdf, T015Z3_A9971Em_npzel1,
            T015Z3_n9971Em_npzel1, T015Z3_A9972Em_npzel2, T015Z3_n9972Em_npzel2, T015Z3_A9973Em_npzeldf, T015Z3_n9973Em_npzeldf, T015Z3_A9974Em_npzpl, T015Z3_n9974Em_npzpl, T015Z3_A9975Em_ncvl, T015Z3_n9975Em_ncvl, T015Z3_A396EmprCod
            }
            , new Object[] {
            T015Z4_A407EmprNom, T015Z4_n407EmprNom
            }
            , new Object[] {
            T015Z5_A9966Em_cod, T015Z5_A407EmprNom, T015Z5_n407EmprNom, T015Z5_A9967Em_np, T015Z5_n9967Em_np, T015Z5_A9968Em_npzer1, T015Z5_n9968Em_npzer1, T015Z5_A9969Em_npzer2, T015Z5_n9969Em_npzer2, T015Z5_A9970Em_npzerdf,
            T015Z5_n9970Em_npzerdf, T015Z5_A9971Em_npzel1, T015Z5_n9971Em_npzel1, T015Z5_A9972Em_npzel2, T015Z5_n9972Em_npzel2, T015Z5_A9973Em_npzeldf, T015Z5_n9973Em_npzeldf, T015Z5_A9974Em_npzpl, T015Z5_n9974Em_npzpl, T015Z5_A9975Em_ncvl,
            T015Z5_n9975Em_ncvl, T015Z5_A396EmprCod
            }
            , new Object[] {
            T015Z6_A396EmprCod, T015Z6_A9966Em_cod
            }
            , new Object[] {
            T015Z7_A396EmprCod, T015Z7_A9966Em_cod
            }
            , new Object[] {
            T015Z8_A396EmprCod, T015Z8_A9966Em_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015Z12_A396EmprCod, T015Z12_A129BarCod, T015Z12_A132BarCodReo, T015Z12_A130BarCodPar, T015Z12_A758ProCod, T015Z12_A194BarOrdLin, T015Z12_A9966Em_cod
            }
            , new Object[] {
            T015Z13_A396EmprCod, T015Z13_A9966Em_cod
            }
            , new Object[] {
            T015Z14_A407EmprNom, T015Z14_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TACTEM" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1324 ;
   private short nIsDirty_1324 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEm_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEm_np_Enabled ;
   private int edtEm_npzer1_Enabled ;
   private int edtEm_npzer2_Enabled ;
   private int edtEm_npzerdf_Enabled ;
   private int edtEm_npzel1_Enabled ;
   private int edtEm_npzel2_Enabled ;
   private int edtEm_npzeldf_Enabled ;
   private int edtEm_npzpl_Enabled ;
   private int edtEm_ncvl_Enabled ;
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
   private int edtEm_ncvl_Backcolor ;
   private int edtEm_npzpl_Backcolor ;
   private int edtEm_npzeldf_Backcolor ;
   private int edtEm_npzel2_Backcolor ;
   private int edtEm_npzel1_Backcolor ;
   private int edtEm_npzerdf_Backcolor ;
   private int edtEm_npzer2_Backcolor ;
   private int edtEm_npzer1_Backcolor ;
   private int edtEm_np_Backcolor ;
   private int edtEm_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z9967Em_np ;
   private java.math.BigDecimal Z9968Em_npzer1 ;
   private java.math.BigDecimal Z9969Em_npzer2 ;
   private java.math.BigDecimal Z9970Em_npzerdf ;
   private java.math.BigDecimal Z9971Em_npzel1 ;
   private java.math.BigDecimal Z9972Em_npzel2 ;
   private java.math.BigDecimal Z9973Em_npzeldf ;
   private java.math.BigDecimal Z9974Em_npzpl ;
   private java.math.BigDecimal Z9975Em_ncvl ;
   private java.math.BigDecimal A9967Em_np ;
   private java.math.BigDecimal A9968Em_npzer1 ;
   private java.math.BigDecimal A9969Em_npzer2 ;
   private java.math.BigDecimal A9970Em_npzerdf ;
   private java.math.BigDecimal A9971Em_npzel1 ;
   private java.math.BigDecimal A9972Em_npzel2 ;
   private java.math.BigDecimal A9973Em_npzeldf ;
   private java.math.BigDecimal A9974Em_npzpl ;
   private java.math.BigDecimal A9975Em_ncvl ;
   private java.math.BigDecimal ZZ9967Em_np ;
   private java.math.BigDecimal ZZ9968Em_npzer1 ;
   private java.math.BigDecimal ZZ9969Em_npzer2 ;
   private java.math.BigDecimal ZZ9970Em_npzerdf ;
   private java.math.BigDecimal ZZ9971Em_npzel1 ;
   private java.math.BigDecimal ZZ9972Em_npzel2 ;
   private java.math.BigDecimal ZZ9973Em_npzeldf ;
   private java.math.BigDecimal ZZ9974Em_npzpl ;
   private java.math.BigDecimal ZZ9975Em_ncvl ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9966Em_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEm_cod_Internalname ;
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
   private String A9966Em_cod ;
   private String edtEm_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEm_np_Internalname ;
   private String edtEm_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEm_npzer1_Internalname ;
   private String edtEm_npzer1_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEm_npzer2_Internalname ;
   private String edtEm_npzer2_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEm_npzerdf_Internalname ;
   private String edtEm_npzerdf_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEm_npzel1_Internalname ;
   private String edtEm_npzel1_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEm_npzel2_Internalname ;
   private String edtEm_npzel2_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEm_npzeldf_Internalname ;
   private String edtEm_npzeldf_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEm_npzpl_Internalname ;
   private String edtEm_npzpl_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEm_ncvl_Internalname ;
   private String edtEm_ncvl_Jsonclick ;
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
   private String AV33Pe_cod ;
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
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sMode1324 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9966Em_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9967Em_np ;
   private boolean n9968Em_npzer1 ;
   private boolean n9969Em_npzer2 ;
   private boolean n9970Em_npzerdf ;
   private boolean n9971Em_npzel1 ;
   private boolean n9972Em_npzel2 ;
   private boolean n9973Em_npzeldf ;
   private boolean n9974Em_npzpl ;
   private boolean n9975Em_ncvl ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T015Z4_A407EmprNom ;
   private boolean[] T015Z4_n407EmprNom ;
   private String[] T015Z5_A9966Em_cod ;
   private String[] T015Z5_A407EmprNom ;
   private boolean[] T015Z5_n407EmprNom ;
   private java.math.BigDecimal[] T015Z5_A9967Em_np ;
   private boolean[] T015Z5_n9967Em_np ;
   private java.math.BigDecimal[] T015Z5_A9968Em_npzer1 ;
   private boolean[] T015Z5_n9968Em_npzer1 ;
   private java.math.BigDecimal[] T015Z5_A9969Em_npzer2 ;
   private boolean[] T015Z5_n9969Em_npzer2 ;
   private java.math.BigDecimal[] T015Z5_A9970Em_npzerdf ;
   private boolean[] T015Z5_n9970Em_npzerdf ;
   private java.math.BigDecimal[] T015Z5_A9971Em_npzel1 ;
   private boolean[] T015Z5_n9971Em_npzel1 ;
   private java.math.BigDecimal[] T015Z5_A9972Em_npzel2 ;
   private boolean[] T015Z5_n9972Em_npzel2 ;
   private java.math.BigDecimal[] T015Z5_A9973Em_npzeldf ;
   private boolean[] T015Z5_n9973Em_npzeldf ;
   private java.math.BigDecimal[] T015Z5_A9974Em_npzpl ;
   private boolean[] T015Z5_n9974Em_npzpl ;
   private java.math.BigDecimal[] T015Z5_A9975Em_ncvl ;
   private boolean[] T015Z5_n9975Em_ncvl ;
   private String[] T015Z5_A396EmprCod ;
   private String[] T015Z6_A396EmprCod ;
   private String[] T015Z6_A9966Em_cod ;
   private String[] T015Z3_A9966Em_cod ;
   private java.math.BigDecimal[] T015Z3_A9967Em_np ;
   private boolean[] T015Z3_n9967Em_np ;
   private java.math.BigDecimal[] T015Z3_A9968Em_npzer1 ;
   private boolean[] T015Z3_n9968Em_npzer1 ;
   private java.math.BigDecimal[] T015Z3_A9969Em_npzer2 ;
   private boolean[] T015Z3_n9969Em_npzer2 ;
   private java.math.BigDecimal[] T015Z3_A9970Em_npzerdf ;
   private boolean[] T015Z3_n9970Em_npzerdf ;
   private java.math.BigDecimal[] T015Z3_A9971Em_npzel1 ;
   private boolean[] T015Z3_n9971Em_npzel1 ;
   private java.math.BigDecimal[] T015Z3_A9972Em_npzel2 ;
   private boolean[] T015Z3_n9972Em_npzel2 ;
   private java.math.BigDecimal[] T015Z3_A9973Em_npzeldf ;
   private boolean[] T015Z3_n9973Em_npzeldf ;
   private java.math.BigDecimal[] T015Z3_A9974Em_npzpl ;
   private boolean[] T015Z3_n9974Em_npzpl ;
   private java.math.BigDecimal[] T015Z3_A9975Em_ncvl ;
   private boolean[] T015Z3_n9975Em_ncvl ;
   private String[] T015Z3_A396EmprCod ;
   private String[] T015Z7_A396EmprCod ;
   private String[] T015Z7_A9966Em_cod ;
   private String[] T015Z8_A396EmprCod ;
   private String[] T015Z8_A9966Em_cod ;
   private String[] T015Z2_A9966Em_cod ;
   private java.math.BigDecimal[] T015Z2_A9967Em_np ;
   private boolean[] T015Z2_n9967Em_np ;
   private java.math.BigDecimal[] T015Z2_A9968Em_npzer1 ;
   private boolean[] T015Z2_n9968Em_npzer1 ;
   private java.math.BigDecimal[] T015Z2_A9969Em_npzer2 ;
   private boolean[] T015Z2_n9969Em_npzer2 ;
   private java.math.BigDecimal[] T015Z2_A9970Em_npzerdf ;
   private boolean[] T015Z2_n9970Em_npzerdf ;
   private java.math.BigDecimal[] T015Z2_A9971Em_npzel1 ;
   private boolean[] T015Z2_n9971Em_npzel1 ;
   private java.math.BigDecimal[] T015Z2_A9972Em_npzel2 ;
   private boolean[] T015Z2_n9972Em_npzel2 ;
   private java.math.BigDecimal[] T015Z2_A9973Em_npzeldf ;
   private boolean[] T015Z2_n9973Em_npzeldf ;
   private java.math.BigDecimal[] T015Z2_A9974Em_npzpl ;
   private boolean[] T015Z2_n9974Em_npzpl ;
   private java.math.BigDecimal[] T015Z2_A9975Em_ncvl ;
   private boolean[] T015Z2_n9975Em_ncvl ;
   private String[] T015Z2_A396EmprCod ;
   private String[] T015Z12_A396EmprCod ;
   private int[] T015Z12_A129BarCod ;
   private byte[] T015Z12_A132BarCodReo ;
   private String[] T015Z12_A130BarCodPar ;
   private String[] T015Z12_A758ProCod ;
   private short[] T015Z12_A194BarOrdLin ;
   private String[] T015Z12_A9966Em_cod ;
   private String[] T015Z13_A396EmprCod ;
   private String[] T015Z13_A9966Em_cod ;
   private String[] T015Z14_A407EmprNom ;
   private boolean[] T015Z14_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactem__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactem__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactem__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactem__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactem__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015Z2", "SELECT Em_cod, Em_np, Em_npzer1, Em_npzer2, Em_npzerdf, Em_npzel1, Em_npzel2, Em_npzeldf, Em_npzpl, Em_ncvl, EmprCod FROM TXPACTEM WHERE EmprCod = ? AND Em_cod = ?  FOR UPDATE OF Em_np, Em_npzer1, Em_npzer2, Em_npzerdf, Em_npzel1, Em_npzel2, Em_npzeldf, Em_npzpl, Em_ncvl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z3", "SELECT Em_cod, Em_np, Em_npzer1, Em_npzer2, Em_npzerdf, Em_npzel1, Em_npzel2, Em_npzeldf, Em_npzpl, Em_ncvl, EmprCod FROM TXPACTEM WHERE EmprCod = ? AND Em_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Em_cod, T2.EmprNom, TM1.Em_np, TM1.Em_npzer1, TM1.Em_npzer2, TM1.Em_npzerdf, TM1.Em_npzel1, TM1.Em_npzel2, TM1.Em_npzeldf, TM1.Em_npzpl, TM1.Em_ncvl, TM1.EmprCod FROM (TXPACTEM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Em_cod = ? ORDER BY TM1.EmprCod, TM1.Em_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Em_cod FROM TXPACTEM WHERE EmprCod = ? AND Em_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Em_cod FROM TXPACTEM WHERE ( Em_cod > ?) and EmprCod = ? ORDER BY EmprCod, Em_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Z8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Em_cod FROM TXPACTEM WHERE ( Em_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Em_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015Z9", "INSERT INTO TXPACTEM(Em_cod, Em_np, Em_npzer1, Em_npzer2, Em_npzerdf, Em_npzel1, Em_npzel2, Em_npzeldf, Em_npzpl, Em_ncvl, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTEM")
         ,new UpdateCursor("T015Z10", "UPDATE TXPACTEM SET Em_np=?, Em_npzer1=?, Em_npzer2=?, Em_npzerdf=?, Em_npzel1=?, Em_npzel2=?, Em_npzeldf=?, Em_npzpl=?, Em_ncvl=?  WHERE EmprCod = ? AND Em_cod = ?", GX_NOMASK, "TXPACTEM")
         ,new UpdateCursor("T015Z11", "DELETE FROM TXPACTEM  WHERE EmprCod = ? AND Em_cod = ?", GX_NOMASK, "TXPACTEM")
         ,new ForEachCursor("T015Z12", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND Em_cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015Z13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Em_cod FROM TXPACTEM WHERE EmprCod = ? ORDER BY EmprCod, Em_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015Z14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
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
               stmt.setString(11, (String)parms[19], 3);
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
               stmt.setString(10, (String)parms[18], 3);
               stmt.setString(11, (String)parms[19], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

