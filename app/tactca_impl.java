package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactca_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO  ACTIVIDAD CALANDRA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCa_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactca_impl.class ));
   }

   public tactca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTCA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Actividad Seccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_cod_Internalname, GXutil.rtrim( A9911Ca_cod), GXutil.rtrim( localUtil.format( A9911Ca_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_cod_Jsonclick, 0, "", "", "", "", "", 1, edtCa_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Numero Partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_np_Internalname, GXutil.ltrim( localUtil.ntoc( A9912Ca_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_np_Enabled!=0) ? localUtil.format( A9912Ca_np, "ZZ9.99999") : localUtil.format( A9912Ca_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_np_Jsonclick, 0, "", "", "", "", "", 1, edtCa_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N Piezas Caladra Rollo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzcr_Internalname, GXutil.ltrim( localUtil.ntoc( A9913Ca_pzcr, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzcr_Enabled!=0) ? localUtil.format( A9913Ca_pzcr, "ZZ9.99999") : localUtil.format( A9913Ca_pzcr, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzcr_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzcr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N Piezas Caladra Libro", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzcl_Internalname, GXutil.ltrim( localUtil.ntoc( A9914Ca_pzcl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzcl_Enabled!=0) ? localUtil.format( A9914Ca_pzcl, "ZZ9.99999") : localUtil.format( A9914Ca_pzcl, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzcl_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzcl_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N Piezas Caladra Rollo Carrera", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzcrc_Internalname, GXutil.ltrim( localUtil.ntoc( A9915Ca_pzcrc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzcrc_Enabled!=0) ? localUtil.format( A9915Ca_pzcrc, "ZZ9.99999") : localUtil.format( A9915Ca_pzcrc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzcrc_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzcrc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N Piezas Caladra Libro Carrera", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzclc_Internalname, GXutil.ltrim( localUtil.ntoc( A9916Ca_pzclc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzclc_Enabled!=0) ? localUtil.format( A9916Ca_pzclc, "ZZ9.99999") : localUtil.format( A9916Ca_pzclc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzclc_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzclc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N Piezas Caladra Rollo Cosidas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzcrco_Internalname, GXutil.ltrim( localUtil.ntoc( A9917Ca_pzcrco, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzcrco_Enabled!=0) ? localUtil.format( A9917Ca_pzcrco, "ZZ9.99999") : localUtil.format( A9917Ca_pzcrco, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzcrco_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzcrco_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "N Piezas Caladra Libro Cosidas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_pzclco_Internalname, GXutil.ltrim( localUtil.ntoc( A9918Ca_pzclco, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_pzclco_Enabled!=0) ? localUtil.format( A9918Ca_pzclco, "ZZ9.99999") : localUtil.format( A9918Ca_pzclco, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_pzclco_Jsonclick, 0, "", "", "", "", "", 1, edtCa_pzclco_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Cambios de Ensanchador", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_ce_Internalname, GXutil.ltrim( localUtil.ntoc( A9919Ca_ce, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_ce_Enabled!=0) ? localUtil.format( A9919Ca_ce, "ZZ9.99999") : localUtil.format( A9919Ca_ce, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_ce_Jsonclick, 0, "", "", "", "", "", 1, edtCa_ce_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N Limpiezas maquina Superficia", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_nlms_Internalname, GXutil.ltrim( localUtil.ntoc( A9920Ca_nlms, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_nlms_Enabled!=0) ? localUtil.format( A9920Ca_nlms, "ZZ9.99999") : localUtil.format( A9920Ca_nlms, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_nlms_Jsonclick, 0, "", "", "", "", "", 1, edtCa_nlms_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "N Limpiezas maquina Fondo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_nlmf_Internalname, GXutil.ltrim( localUtil.ntoc( A9921Ca_nlmf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_nlmf_Enabled!=0) ? localUtil.format( A9921Ca_nlmf, "ZZ9.99999") : localUtil.format( A9921Ca_nlmf, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_nlmf_Jsonclick, 0, "", "", "", "", "", 1, edtCa_nlmf_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Metros Pda / V FT /60 x 1,05", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCa_nmp_Internalname, GXutil.ltrim( localUtil.ntoc( A9922Ca_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCa_nmp_Enabled!=0) ? localUtil.format( A9922Ca_nmp, "ZZ9.99999") : localUtil.format( A9922Ca_nmp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCa_nmp_Jsonclick, 0, "", "", "", "", "", 1, edtCa_nmp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTCA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTCA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTCA.htm");
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
      e1115T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9911Ca_cod = httpContext.cgiGet( "Z9911Ca_cod") ;
            Z9912Ca_np = localUtil.ctond( httpContext.cgiGet( "Z9912Ca_np")) ;
            Z9913Ca_pzcr = localUtil.ctond( httpContext.cgiGet( "Z9913Ca_pzcr")) ;
            Z9914Ca_pzcl = localUtil.ctond( httpContext.cgiGet( "Z9914Ca_pzcl")) ;
            Z9915Ca_pzcrc = localUtil.ctond( httpContext.cgiGet( "Z9915Ca_pzcrc")) ;
            Z9916Ca_pzclc = localUtil.ctond( httpContext.cgiGet( "Z9916Ca_pzclc")) ;
            Z9917Ca_pzcrco = localUtil.ctond( httpContext.cgiGet( "Z9917Ca_pzcrco")) ;
            Z9918Ca_pzclco = localUtil.ctond( httpContext.cgiGet( "Z9918Ca_pzclco")) ;
            Z9919Ca_ce = localUtil.ctond( httpContext.cgiGet( "Z9919Ca_ce")) ;
            Z9920Ca_nlms = localUtil.ctond( httpContext.cgiGet( "Z9920Ca_nlms")) ;
            Z9921Ca_nlmf = localUtil.ctond( httpContext.cgiGet( "Z9921Ca_nlmf")) ;
            Z9922Ca_nmp = localUtil.ctond( httpContext.cgiGet( "Z9922Ca_nmp")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV34Ca_cod = httpContext.cgiGet( "vCA_COD") ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9911Ca_cod = httpContext.cgiGet( edtCa_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9912Ca_np = DecimalUtil.ZERO ;
               n9912Ca_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrimstr( A9912Ca_np, 9, 5));
            }
            else
            {
               A9912Ca_np = localUtil.ctond( httpContext.cgiGet( edtCa_np_Internalname)) ;
               n9912Ca_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrimstr( A9912Ca_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzcr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzcr_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzcr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9913Ca_pzcr = DecimalUtil.ZERO ;
               n9913Ca_pzcr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrimstr( A9913Ca_pzcr, 9, 5));
            }
            else
            {
               A9913Ca_pzcr = localUtil.ctond( httpContext.cgiGet( edtCa_pzcr_Internalname)) ;
               n9913Ca_pzcr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrimstr( A9913Ca_pzcr, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzcl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzcl_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzcl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9914Ca_pzcl = DecimalUtil.ZERO ;
               n9914Ca_pzcl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrimstr( A9914Ca_pzcl, 9, 5));
            }
            else
            {
               A9914Ca_pzcl = localUtil.ctond( httpContext.cgiGet( edtCa_pzcl_Internalname)) ;
               n9914Ca_pzcl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrimstr( A9914Ca_pzcl, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzcrc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzcrc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCRC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzcrc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9915Ca_pzcrc = DecimalUtil.ZERO ;
               n9915Ca_pzcrc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrimstr( A9915Ca_pzcrc, 9, 5));
            }
            else
            {
               A9915Ca_pzcrc = localUtil.ctond( httpContext.cgiGet( edtCa_pzcrc_Internalname)) ;
               n9915Ca_pzcrc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrimstr( A9915Ca_pzcrc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzclc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzclc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCLC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzclc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9916Ca_pzclc = DecimalUtil.ZERO ;
               n9916Ca_pzclc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrimstr( A9916Ca_pzclc, 9, 5));
            }
            else
            {
               A9916Ca_pzclc = localUtil.ctond( httpContext.cgiGet( edtCa_pzclc_Internalname)) ;
               n9916Ca_pzclc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrimstr( A9916Ca_pzclc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzcrco_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzcrco_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCRCO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzcrco_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9917Ca_pzcrco = DecimalUtil.ZERO ;
               n9917Ca_pzcrco = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrimstr( A9917Ca_pzcrco, 9, 5));
            }
            else
            {
               A9917Ca_pzcrco = localUtil.ctond( httpContext.cgiGet( edtCa_pzcrco_Internalname)) ;
               n9917Ca_pzcrco = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrimstr( A9917Ca_pzcrco, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_pzclco_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_pzclco_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_PZCLCO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_pzclco_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9918Ca_pzclco = DecimalUtil.ZERO ;
               n9918Ca_pzclco = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrimstr( A9918Ca_pzclco, 9, 5));
            }
            else
            {
               A9918Ca_pzclco = localUtil.ctond( httpContext.cgiGet( edtCa_pzclco_Internalname)) ;
               n9918Ca_pzclco = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrimstr( A9918Ca_pzclco, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_ce_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_ce_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_CE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_ce_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9919Ca_ce = DecimalUtil.ZERO ;
               n9919Ca_ce = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrimstr( A9919Ca_ce, 9, 5));
            }
            else
            {
               A9919Ca_ce = localUtil.ctond( httpContext.cgiGet( edtCa_ce_Internalname)) ;
               n9919Ca_ce = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrimstr( A9919Ca_ce, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_nlms_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_nlms_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_NLMS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_nlms_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9920Ca_nlms = DecimalUtil.ZERO ;
               n9920Ca_nlms = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrimstr( A9920Ca_nlms, 9, 5));
            }
            else
            {
               A9920Ca_nlms = localUtil.ctond( httpContext.cgiGet( edtCa_nlms_Internalname)) ;
               n9920Ca_nlms = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrimstr( A9920Ca_nlms, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_nlmf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_nlmf_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_NLMF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_nlmf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9921Ca_nlmf = DecimalUtil.ZERO ;
               n9921Ca_nlmf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrimstr( A9921Ca_nlmf, 9, 5));
            }
            else
            {
               A9921Ca_nlmf = localUtil.ctond( httpContext.cgiGet( edtCa_nlmf_Internalname)) ;
               n9921Ca_nlmf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrimstr( A9921Ca_nlmf, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCa_nmp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCa_nmp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CA_NMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCa_nmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9922Ca_nmp = DecimalUtil.ZERO ;
               n9922Ca_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrimstr( A9922Ca_nmp, 9, 5));
            }
            else
            {
               A9922Ca_nmp = localUtil.ctond( httpContext.cgiGet( edtCa_nmp_Internalname)) ;
               n9922Ca_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrimstr( A9922Ca_nmp, 9, 5));
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
               A9911Ca_cod = httpContext.GetPar( "Ca_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
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
                        e1115T2 ();
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
            initAll15T1316( ) ;
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
      disableAttributes15T1316( ) ;
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

   public void confirm_15T0( )
   {
      beforeValidate15T1316( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15T1316( ) ;
         }
         else
         {
            checkExtendedTable15T1316( ) ;
            if ( AnyError == 0 )
            {
               zm15T1316( 4) ;
            }
            closeExtendedTableCursors15T1316( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues15T0( ) ;
      }
   }

   public void resetCaption15T0( )
   {
   }

   public void e1115T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tactca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactca_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactca_impl.this.A396EmprCod = GXv_char2[0] ;
      tactca_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactca_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV34Ca_cod ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACCA", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactca_impl.this.A396EmprCod = GXv_char4[0] ;
      tactca_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV34Ca_cod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Ca_cod", AV34Ca_cod);
      if ( GXutil.strcmp(AV34Ca_cod, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACCA", ""));
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

   public void zm15T1316( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9912Ca_np = T015T3_A9912Ca_np[0] ;
            Z9913Ca_pzcr = T015T3_A9913Ca_pzcr[0] ;
            Z9914Ca_pzcl = T015T3_A9914Ca_pzcl[0] ;
            Z9915Ca_pzcrc = T015T3_A9915Ca_pzcrc[0] ;
            Z9916Ca_pzclc = T015T3_A9916Ca_pzclc[0] ;
            Z9917Ca_pzcrco = T015T3_A9917Ca_pzcrco[0] ;
            Z9918Ca_pzclco = T015T3_A9918Ca_pzclco[0] ;
            Z9919Ca_ce = T015T3_A9919Ca_ce[0] ;
            Z9920Ca_nlms = T015T3_A9920Ca_nlms[0] ;
            Z9921Ca_nlmf = T015T3_A9921Ca_nlmf[0] ;
            Z9922Ca_nmp = T015T3_A9922Ca_nmp[0] ;
         }
         else
         {
            Z9912Ca_np = A9912Ca_np ;
            Z9913Ca_pzcr = A9913Ca_pzcr ;
            Z9914Ca_pzcl = A9914Ca_pzcl ;
            Z9915Ca_pzcrc = A9915Ca_pzcrc ;
            Z9916Ca_pzclc = A9916Ca_pzclc ;
            Z9917Ca_pzcrco = A9917Ca_pzcrco ;
            Z9918Ca_pzclco = A9918Ca_pzclco ;
            Z9919Ca_ce = A9919Ca_ce ;
            Z9920Ca_nlms = A9920Ca_nlms ;
            Z9921Ca_nlmf = A9921Ca_nlmf ;
            Z9922Ca_nmp = A9922Ca_nmp ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9911Ca_cod = A9911Ca_cod ;
         Z9912Ca_np = A9912Ca_np ;
         Z9913Ca_pzcr = A9913Ca_pzcr ;
         Z9914Ca_pzcl = A9914Ca_pzcl ;
         Z9915Ca_pzcrc = A9915Ca_pzcrc ;
         Z9916Ca_pzclc = A9916Ca_pzclc ;
         Z9917Ca_pzcrco = A9917Ca_pzcrco ;
         Z9918Ca_pzclco = A9918Ca_pzclco ;
         Z9919Ca_ce = A9919Ca_ce ;
         Z9920Ca_nlms = A9920Ca_nlms ;
         Z9921Ca_nlmf = A9921Ca_nlmf ;
         Z9922Ca_nmp = A9922Ca_nmp ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TACTCA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T015T4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015T4_A407EmprNom[0] ;
      n407EmprNom = T015T4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A9911Ca_cod = AV34Ca_cod ;
      httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
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

   public void load15T1316( )
   {
      /* Using cursor T015T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9911Ca_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1316 = (short)(1) ;
         A407EmprNom = T015T5_A407EmprNom[0] ;
         n407EmprNom = T015T5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9912Ca_np = T015T5_A9912Ca_np[0] ;
         n9912Ca_np = T015T5_n9912Ca_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrimstr( A9912Ca_np, 9, 5));
         A9913Ca_pzcr = T015T5_A9913Ca_pzcr[0] ;
         n9913Ca_pzcr = T015T5_n9913Ca_pzcr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrimstr( A9913Ca_pzcr, 9, 5));
         A9914Ca_pzcl = T015T5_A9914Ca_pzcl[0] ;
         n9914Ca_pzcl = T015T5_n9914Ca_pzcl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrimstr( A9914Ca_pzcl, 9, 5));
         A9915Ca_pzcrc = T015T5_A9915Ca_pzcrc[0] ;
         n9915Ca_pzcrc = T015T5_n9915Ca_pzcrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrimstr( A9915Ca_pzcrc, 9, 5));
         A9916Ca_pzclc = T015T5_A9916Ca_pzclc[0] ;
         n9916Ca_pzclc = T015T5_n9916Ca_pzclc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrimstr( A9916Ca_pzclc, 9, 5));
         A9917Ca_pzcrco = T015T5_A9917Ca_pzcrco[0] ;
         n9917Ca_pzcrco = T015T5_n9917Ca_pzcrco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrimstr( A9917Ca_pzcrco, 9, 5));
         A9918Ca_pzclco = T015T5_A9918Ca_pzclco[0] ;
         n9918Ca_pzclco = T015T5_n9918Ca_pzclco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrimstr( A9918Ca_pzclco, 9, 5));
         A9919Ca_ce = T015T5_A9919Ca_ce[0] ;
         n9919Ca_ce = T015T5_n9919Ca_ce[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrimstr( A9919Ca_ce, 9, 5));
         A9920Ca_nlms = T015T5_A9920Ca_nlms[0] ;
         n9920Ca_nlms = T015T5_n9920Ca_nlms[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrimstr( A9920Ca_nlms, 9, 5));
         A9921Ca_nlmf = T015T5_A9921Ca_nlmf[0] ;
         n9921Ca_nlmf = T015T5_n9921Ca_nlmf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrimstr( A9921Ca_nlmf, 9, 5));
         A9922Ca_nmp = T015T5_A9922Ca_nmp[0] ;
         n9922Ca_nmp = T015T5_n9922Ca_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrimstr( A9922Ca_nmp, 9, 5));
         zm15T1316( -3) ;
      }
      pr_default.close(3);
      onLoadActions15T1316( ) ;
   }

   public void onLoadActions15T1316( )
   {
   }

   public void checkExtendedTable15T1316( )
   {
      nIsDirty_1316 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A9911Ca_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "CA_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCa_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15T1316( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15T1316( )
   {
      /* Using cursor T015T6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A9911Ca_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1316 = (short)(1) ;
      }
      else
      {
         RcdFound1316 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9911Ca_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015T3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15T1316( 3) ;
         RcdFound1316 = (short)(1) ;
         A9911Ca_cod = T015T3_A9911Ca_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
         A9912Ca_np = T015T3_A9912Ca_np[0] ;
         n9912Ca_np = T015T3_n9912Ca_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrimstr( A9912Ca_np, 9, 5));
         A9913Ca_pzcr = T015T3_A9913Ca_pzcr[0] ;
         n9913Ca_pzcr = T015T3_n9913Ca_pzcr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrimstr( A9913Ca_pzcr, 9, 5));
         A9914Ca_pzcl = T015T3_A9914Ca_pzcl[0] ;
         n9914Ca_pzcl = T015T3_n9914Ca_pzcl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrimstr( A9914Ca_pzcl, 9, 5));
         A9915Ca_pzcrc = T015T3_A9915Ca_pzcrc[0] ;
         n9915Ca_pzcrc = T015T3_n9915Ca_pzcrc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrimstr( A9915Ca_pzcrc, 9, 5));
         A9916Ca_pzclc = T015T3_A9916Ca_pzclc[0] ;
         n9916Ca_pzclc = T015T3_n9916Ca_pzclc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrimstr( A9916Ca_pzclc, 9, 5));
         A9917Ca_pzcrco = T015T3_A9917Ca_pzcrco[0] ;
         n9917Ca_pzcrco = T015T3_n9917Ca_pzcrco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrimstr( A9917Ca_pzcrco, 9, 5));
         A9918Ca_pzclco = T015T3_A9918Ca_pzclco[0] ;
         n9918Ca_pzclco = T015T3_n9918Ca_pzclco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrimstr( A9918Ca_pzclco, 9, 5));
         A9919Ca_ce = T015T3_A9919Ca_ce[0] ;
         n9919Ca_ce = T015T3_n9919Ca_ce[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrimstr( A9919Ca_ce, 9, 5));
         A9920Ca_nlms = T015T3_A9920Ca_nlms[0] ;
         n9920Ca_nlms = T015T3_n9920Ca_nlms[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrimstr( A9920Ca_nlms, 9, 5));
         A9921Ca_nlmf = T015T3_A9921Ca_nlmf[0] ;
         n9921Ca_nlmf = T015T3_n9921Ca_nlmf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrimstr( A9921Ca_nlmf, 9, 5));
         A9922Ca_nmp = T015T3_A9922Ca_nmp[0] ;
         n9922Ca_nmp = T015T3_n9922Ca_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrimstr( A9922Ca_nmp, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z9911Ca_cod = A9911Ca_cod ;
         sMode1316 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15T1316( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1316 = (short)(0) ;
            initializeNonKey15T1316( ) ;
         }
         Gx_mode = sMode1316 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1316 = (short)(0) ;
         initializeNonKey15T1316( ) ;
         sMode1316 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1316 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey15T1316( ) ;
      if ( RcdFound1316 == 0 )
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
      RcdFound1316 = (short)(0) ;
      /* Using cursor T015T7 */
      pr_default.execute(5, new Object[] {A9911Ca_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015T7_A9911Ca_cod[0], A9911Ca_cod) < 0 ) ) && ( GXutil.strcmp(T015T7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015T7_A9911Ca_cod[0], A9911Ca_cod) > 0 ) ) && ( GXutil.strcmp(T015T7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9911Ca_cod = T015T7_A9911Ca_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
            RcdFound1316 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1316 = (short)(0) ;
      /* Using cursor T015T8 */
      pr_default.execute(6, new Object[] {A9911Ca_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015T8_A9911Ca_cod[0], A9911Ca_cod) > 0 ) ) && ( GXutil.strcmp(T015T8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015T8_A9911Ca_cod[0], A9911Ca_cod) < 0 ) ) && ( GXutil.strcmp(T015T8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9911Ca_cod = T015T8_A9911Ca_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
            RcdFound1316 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15T1316( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCa_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15T1316( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1316 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9911Ca_cod, Z9911Ca_cod) != 0 ) )
            {
               A9911Ca_cod = Z9911Ca_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCa_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15T1316( ) ;
               GX_FocusControl = edtCa_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9911Ca_cod, Z9911Ca_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCa_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15T1316( ) ;
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
                  GX_FocusControl = edtCa_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15T1316( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9911Ca_cod, Z9911Ca_cod) != 0 ) )
      {
         A9911Ca_cod = Z9911Ca_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCa_cod_Internalname ;
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
      getKey15T1316( ) ;
      if ( RcdFound1316 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9911Ca_cod, Z9911Ca_cod) != 0 ) )
         {
            A9911Ca_cod = Z9911Ca_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9911Ca_cod, Z9911Ca_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactca");
      GX_FocusControl = edtCa_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15T0( ) ;
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
      if ( RcdFound1316 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCa_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15T1316( ) ;
      if ( RcdFound1316 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCa_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15T1316( ) ;
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
      if ( RcdFound1316 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCa_np_Internalname ;
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
      if ( RcdFound1316 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCa_np_Internalname ;
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
      scanStart15T1316( ) ;
      if ( RcdFound1316 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1316 != 0 )
         {
            scanNext15T1316( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCa_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15T1316( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15T1316( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9911Ca_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTCA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9912Ca_np, T015T2_A9912Ca_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z9913Ca_pzcr, T015T2_A9913Ca_pzcr[0]) != 0 ) || ( DecimalUtil.compareTo(Z9914Ca_pzcl, T015T2_A9914Ca_pzcl[0]) != 0 ) || ( DecimalUtil.compareTo(Z9915Ca_pzcrc, T015T2_A9915Ca_pzcrc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9916Ca_pzclc, T015T2_A9916Ca_pzclc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9917Ca_pzcrco, T015T2_A9917Ca_pzcrco[0]) != 0 ) || ( DecimalUtil.compareTo(Z9918Ca_pzclco, T015T2_A9918Ca_pzclco[0]) != 0 ) || ( DecimalUtil.compareTo(Z9919Ca_ce, T015T2_A9919Ca_ce[0]) != 0 ) || ( DecimalUtil.compareTo(Z9920Ca_nlms, T015T2_A9920Ca_nlms[0]) != 0 ) || ( DecimalUtil.compareTo(Z9921Ca_nlmf, T015T2_A9921Ca_nlmf[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9922Ca_nmp, T015T2_A9922Ca_nmp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9912Ca_np, T015T2_A9912Ca_np[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_np");
               GXutil.writeLogRaw("Old: ",Z9912Ca_np);
               GXutil.writeLogRaw("Current: ",T015T2_A9912Ca_np[0]);
            }
            if ( DecimalUtil.compareTo(Z9913Ca_pzcr, T015T2_A9913Ca_pzcr[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzcr");
               GXutil.writeLogRaw("Old: ",Z9913Ca_pzcr);
               GXutil.writeLogRaw("Current: ",T015T2_A9913Ca_pzcr[0]);
            }
            if ( DecimalUtil.compareTo(Z9914Ca_pzcl, T015T2_A9914Ca_pzcl[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzcl");
               GXutil.writeLogRaw("Old: ",Z9914Ca_pzcl);
               GXutil.writeLogRaw("Current: ",T015T2_A9914Ca_pzcl[0]);
            }
            if ( DecimalUtil.compareTo(Z9915Ca_pzcrc, T015T2_A9915Ca_pzcrc[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzcrc");
               GXutil.writeLogRaw("Old: ",Z9915Ca_pzcrc);
               GXutil.writeLogRaw("Current: ",T015T2_A9915Ca_pzcrc[0]);
            }
            if ( DecimalUtil.compareTo(Z9916Ca_pzclc, T015T2_A9916Ca_pzclc[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzclc");
               GXutil.writeLogRaw("Old: ",Z9916Ca_pzclc);
               GXutil.writeLogRaw("Current: ",T015T2_A9916Ca_pzclc[0]);
            }
            if ( DecimalUtil.compareTo(Z9917Ca_pzcrco, T015T2_A9917Ca_pzcrco[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzcrco");
               GXutil.writeLogRaw("Old: ",Z9917Ca_pzcrco);
               GXutil.writeLogRaw("Current: ",T015T2_A9917Ca_pzcrco[0]);
            }
            if ( DecimalUtil.compareTo(Z9918Ca_pzclco, T015T2_A9918Ca_pzclco[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_pzclco");
               GXutil.writeLogRaw("Old: ",Z9918Ca_pzclco);
               GXutil.writeLogRaw("Current: ",T015T2_A9918Ca_pzclco[0]);
            }
            if ( DecimalUtil.compareTo(Z9919Ca_ce, T015T2_A9919Ca_ce[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_ce");
               GXutil.writeLogRaw("Old: ",Z9919Ca_ce);
               GXutil.writeLogRaw("Current: ",T015T2_A9919Ca_ce[0]);
            }
            if ( DecimalUtil.compareTo(Z9920Ca_nlms, T015T2_A9920Ca_nlms[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_nlms");
               GXutil.writeLogRaw("Old: ",Z9920Ca_nlms);
               GXutil.writeLogRaw("Current: ",T015T2_A9920Ca_nlms[0]);
            }
            if ( DecimalUtil.compareTo(Z9921Ca_nlmf, T015T2_A9921Ca_nlmf[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_nlmf");
               GXutil.writeLogRaw("Old: ",Z9921Ca_nlmf);
               GXutil.writeLogRaw("Current: ",T015T2_A9921Ca_nlmf[0]);
            }
            if ( DecimalUtil.compareTo(Z9922Ca_nmp, T015T2_A9922Ca_nmp[0]) != 0 )
            {
               GXutil.writeLogln("tactca:[seudo value changed for attri]"+"Ca_nmp");
               GXutil.writeLogRaw("Old: ",Z9922Ca_nmp);
               GXutil.writeLogRaw("Current: ",T015T2_A9922Ca_nmp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTCA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15T1316( )
   {
      beforeValidate15T1316( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15T1316( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15T1316( 0) ;
         checkOptimisticConcurrency15T1316( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15T1316( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15T1316( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015T9 */
                  pr_default.execute(7, new Object[] {A9911Ca_cod, Boolean.valueOf(n9912Ca_np), A9912Ca_np, Boolean.valueOf(n9913Ca_pzcr), A9913Ca_pzcr, Boolean.valueOf(n9914Ca_pzcl), A9914Ca_pzcl, Boolean.valueOf(n9915Ca_pzcrc), A9915Ca_pzcrc, Boolean.valueOf(n9916Ca_pzclc), A9916Ca_pzclc, Boolean.valueOf(n9917Ca_pzcrco), A9917Ca_pzcrco, Boolean.valueOf(n9918Ca_pzclco), A9918Ca_pzclco, Boolean.valueOf(n9919Ca_ce), A9919Ca_ce, Boolean.valueOf(n9920Ca_nlms), A9920Ca_nlms, Boolean.valueOf(n9921Ca_nlmf), A9921Ca_nlmf, Boolean.valueOf(n9922Ca_nmp), A9922Ca_nmp, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTCA");
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
                        resetCaption15T0( ) ;
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
            load15T1316( ) ;
         }
         endLevel15T1316( ) ;
      }
      closeExtendedTableCursors15T1316( ) ;
   }

   public void update15T1316( )
   {
      beforeValidate15T1316( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15T1316( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15T1316( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15T1316( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15T1316( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015T10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n9912Ca_np), A9912Ca_np, Boolean.valueOf(n9913Ca_pzcr), A9913Ca_pzcr, Boolean.valueOf(n9914Ca_pzcl), A9914Ca_pzcl, Boolean.valueOf(n9915Ca_pzcrc), A9915Ca_pzcrc, Boolean.valueOf(n9916Ca_pzclc), A9916Ca_pzclc, Boolean.valueOf(n9917Ca_pzcrco), A9917Ca_pzcrco, Boolean.valueOf(n9918Ca_pzclco), A9918Ca_pzclco, Boolean.valueOf(n9919Ca_ce), A9919Ca_ce, Boolean.valueOf(n9920Ca_nlms), A9920Ca_nlms, Boolean.valueOf(n9921Ca_nlmf), A9921Ca_nlmf, Boolean.valueOf(n9922Ca_nmp), A9922Ca_nmp, A396EmprCod, A9911Ca_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTCA");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTCA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15T1316( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption15T0( ) ;
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
         endLevel15T1316( ) ;
      }
      closeExtendedTableCursors15T1316( ) ;
   }

   public void deferredUpdate15T1316( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15T1316( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15T1316( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15T1316( ) ;
         afterConfirm15T1316( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15T1316( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015T11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A9911Ca_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTCA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1316 == 0 )
                     {
                        initAll15T1316( ) ;
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
                     resetCaption15T0( ) ;
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
      sMode1316 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15T1316( ) ;
      Gx_mode = sMode1316 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15T1316( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015T12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A9911Ca_cod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel15T1316( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15T1316( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactca");
         if ( AnyError == 0 )
         {
            confirmValues15T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15T1316( )
   {
      /* Scan By routine */
      /* Using cursor T015T13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1316 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1316 = (short)(1) ;
         A9911Ca_cod = T015T13_A9911Ca_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15T1316( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1316 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1316 = (short)(1) ;
         A9911Ca_cod = T015T13_A9911Ca_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
      }
   }

   public void scanEnd15T1316( )
   {
      pr_default.close(11);
   }

   public void afterConfirm15T1316( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15T1316( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15T1316( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15T1316( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15T1316( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15T1316( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15T1316( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCa_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_cod_Enabled), 5, 0), true);
      edtCa_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_np_Enabled), 5, 0), true);
      edtCa_pzcr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzcr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzcr_Enabled), 5, 0), true);
      edtCa_pzcl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzcl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzcl_Enabled), 5, 0), true);
      edtCa_pzcrc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzcrc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzcrc_Enabled), 5, 0), true);
      edtCa_pzclc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzclc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzclc_Enabled), 5, 0), true);
      edtCa_pzcrco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzcrco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzcrco_Enabled), 5, 0), true);
      edtCa_pzclco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_pzclco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_pzclco_Enabled), 5, 0), true);
      edtCa_ce_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_ce_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_ce_Enabled), 5, 0), true);
      edtCa_nlms_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_nlms_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_nlms_Enabled), 5, 0), true);
      edtCa_nlmf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_nlmf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_nlmf_Enabled), 5, 0), true);
      edtCa_nmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCa_nmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCa_nmp_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes15T1316( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues15T0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactca", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9911Ca_cod", GXutil.rtrim( Z9911Ca_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9912Ca_np", GXutil.ltrim( localUtil.ntoc( Z9912Ca_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9913Ca_pzcr", GXutil.ltrim( localUtil.ntoc( Z9913Ca_pzcr, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9914Ca_pzcl", GXutil.ltrim( localUtil.ntoc( Z9914Ca_pzcl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9915Ca_pzcrc", GXutil.ltrim( localUtil.ntoc( Z9915Ca_pzcrc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9916Ca_pzclc", GXutil.ltrim( localUtil.ntoc( Z9916Ca_pzclc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9917Ca_pzcrco", GXutil.ltrim( localUtil.ntoc( Z9917Ca_pzcrco, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9918Ca_pzclco", GXutil.ltrim( localUtil.ntoc( Z9918Ca_pzclco, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9919Ca_ce", GXutil.ltrim( localUtil.ntoc( Z9919Ca_ce, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9920Ca_nlms", GXutil.ltrim( localUtil.ntoc( Z9920Ca_nlms, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9921Ca_nlmf", GXutil.ltrim( localUtil.ntoc( Z9921Ca_nlmf, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9922Ca_nmp", GXutil.ltrim( localUtil.ntoc( Z9922Ca_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vCA_COD", GXutil.rtrim( AV34Ca_cod));
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
      return formatLink("app.tactca", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTCA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO  ACTIVIDAD CALANDRA", "") ;
   }

   public void initializeNonKey15T1316( )
   {
      A9912Ca_np = DecimalUtil.ZERO ;
      n9912Ca_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrimstr( A9912Ca_np, 9, 5));
      A9913Ca_pzcr = DecimalUtil.ZERO ;
      n9913Ca_pzcr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrimstr( A9913Ca_pzcr, 9, 5));
      A9914Ca_pzcl = DecimalUtil.ZERO ;
      n9914Ca_pzcl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrimstr( A9914Ca_pzcl, 9, 5));
      A9915Ca_pzcrc = DecimalUtil.ZERO ;
      n9915Ca_pzcrc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrimstr( A9915Ca_pzcrc, 9, 5));
      A9916Ca_pzclc = DecimalUtil.ZERO ;
      n9916Ca_pzclc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrimstr( A9916Ca_pzclc, 9, 5));
      A9917Ca_pzcrco = DecimalUtil.ZERO ;
      n9917Ca_pzcrco = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrimstr( A9917Ca_pzcrco, 9, 5));
      A9918Ca_pzclco = DecimalUtil.ZERO ;
      n9918Ca_pzclco = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrimstr( A9918Ca_pzclco, 9, 5));
      A9919Ca_ce = DecimalUtil.ZERO ;
      n9919Ca_ce = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrimstr( A9919Ca_ce, 9, 5));
      A9920Ca_nlms = DecimalUtil.ZERO ;
      n9920Ca_nlms = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrimstr( A9920Ca_nlms, 9, 5));
      A9921Ca_nlmf = DecimalUtil.ZERO ;
      n9921Ca_nlmf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrimstr( A9921Ca_nlmf, 9, 5));
      A9922Ca_nmp = DecimalUtil.ZERO ;
      n9922Ca_nmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrimstr( A9922Ca_nmp, 9, 5));
      Z9912Ca_np = DecimalUtil.ZERO ;
      Z9913Ca_pzcr = DecimalUtil.ZERO ;
      Z9914Ca_pzcl = DecimalUtil.ZERO ;
      Z9915Ca_pzcrc = DecimalUtil.ZERO ;
      Z9916Ca_pzclc = DecimalUtil.ZERO ;
      Z9917Ca_pzcrco = DecimalUtil.ZERO ;
      Z9918Ca_pzclco = DecimalUtil.ZERO ;
      Z9919Ca_ce = DecimalUtil.ZERO ;
      Z9920Ca_nlms = DecimalUtil.ZERO ;
      Z9921Ca_nlmf = DecimalUtil.ZERO ;
      Z9922Ca_nmp = DecimalUtil.ZERO ;
   }

   public void initAll15T1316( )
   {
      A9911Ca_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9911Ca_cod", A9911Ca_cod);
      initializeNonKey15T1316( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543288", true, true);
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
      httpContext.AddJavascriptSource("tactca.js", "?20268241543288", false, true);
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
      edtCa_cod_Internalname = "CA_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCa_np_Internalname = "CA_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCa_pzcr_Internalname = "CA_PZCR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCa_pzcl_Internalname = "CA_PZCL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCa_pzcrc_Internalname = "CA_PZCRC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCa_pzclc_Internalname = "CA_PZCLC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCa_pzcrco_Internalname = "CA_PZCRCO" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCa_pzclco_Internalname = "CA_PZCLCO" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtCa_ce_Internalname = "CA_CE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCa_nlms_Internalname = "CA_NLMS" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtCa_nlmf_Internalname = "CA_NLMF" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCa_nmp_Internalname = "CA_NMP" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO  ACTIVIDAD CALANDRA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCa_nmp_Jsonclick = "" ;
      edtCa_nmp_Backcolor = (int)(0xFFFFFF) ;
      edtCa_nmp_Enabled = 1 ;
      edtCa_nlmf_Jsonclick = "" ;
      edtCa_nlmf_Backcolor = (int)(0xFFFFFF) ;
      edtCa_nlmf_Enabled = 1 ;
      edtCa_nlms_Jsonclick = "" ;
      edtCa_nlms_Backcolor = (int)(0xFFFFFF) ;
      edtCa_nlms_Enabled = 1 ;
      edtCa_ce_Jsonclick = "" ;
      edtCa_ce_Backcolor = (int)(0xFFFFFF) ;
      edtCa_ce_Enabled = 1 ;
      edtCa_pzclco_Jsonclick = "" ;
      edtCa_pzclco_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzclco_Enabled = 1 ;
      edtCa_pzcrco_Jsonclick = "" ;
      edtCa_pzcrco_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzcrco_Enabled = 1 ;
      edtCa_pzclc_Jsonclick = "" ;
      edtCa_pzclc_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzclc_Enabled = 1 ;
      edtCa_pzcrc_Jsonclick = "" ;
      edtCa_pzcrc_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzcrc_Enabled = 1 ;
      edtCa_pzcl_Jsonclick = "" ;
      edtCa_pzcl_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzcl_Enabled = 1 ;
      edtCa_pzcr_Jsonclick = "" ;
      edtCa_pzcr_Backcolor = (int)(0xFFFFFF) ;
      edtCa_pzcr_Enabled = 1 ;
      edtCa_np_Jsonclick = "" ;
      edtCa_np_Backcolor = (int)(0xFFFFFF) ;
      edtCa_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCa_cod_Jsonclick = "" ;
      edtCa_cod_Backcolor = (int)(0xFFFFFF) ;
      edtCa_cod_Enabled = 1 ;
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
      /* Using cursor T015T14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015T14_A407EmprNom[0] ;
      n407EmprNom = T015T14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      GX_FocusControl = edtCa_np_Internalname ;
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

   public void valid_Ca_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A9911Ca_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "CA_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCa_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9912Ca_np", GXutil.ltrim( localUtil.ntoc( A9912Ca_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9913Ca_pzcr", GXutil.ltrim( localUtil.ntoc( A9913Ca_pzcr, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9914Ca_pzcl", GXutil.ltrim( localUtil.ntoc( A9914Ca_pzcl, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9915Ca_pzcrc", GXutil.ltrim( localUtil.ntoc( A9915Ca_pzcrc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9916Ca_pzclc", GXutil.ltrim( localUtil.ntoc( A9916Ca_pzclc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9917Ca_pzcrco", GXutil.ltrim( localUtil.ntoc( A9917Ca_pzcrco, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9918Ca_pzclco", GXutil.ltrim( localUtil.ntoc( A9918Ca_pzclco, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9919Ca_ce", GXutil.ltrim( localUtil.ntoc( A9919Ca_ce, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9920Ca_nlms", GXutil.ltrim( localUtil.ntoc( A9920Ca_nlms, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9921Ca_nlmf", GXutil.ltrim( localUtil.ntoc( A9921Ca_nlmf, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9922Ca_nmp", GXutil.ltrim( localUtil.ntoc( A9922Ca_nmp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9911Ca_cod", GXutil.rtrim( Z9911Ca_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9912Ca_np", GXutil.ltrim( localUtil.ntoc( Z9912Ca_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9913Ca_pzcr", GXutil.ltrim( localUtil.ntoc( Z9913Ca_pzcr, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9914Ca_pzcl", GXutil.ltrim( localUtil.ntoc( Z9914Ca_pzcl, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9915Ca_pzcrc", GXutil.ltrim( localUtil.ntoc( Z9915Ca_pzcrc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9916Ca_pzclc", GXutil.ltrim( localUtil.ntoc( Z9916Ca_pzclc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9917Ca_pzcrco", GXutil.ltrim( localUtil.ntoc( Z9917Ca_pzcrco, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9918Ca_pzclco", GXutil.ltrim( localUtil.ntoc( Z9918Ca_pzclco, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9919Ca_ce", GXutil.ltrim( localUtil.ntoc( Z9919Ca_ce, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9920Ca_nlms", GXutil.ltrim( localUtil.ntoc( Z9920Ca_nlms, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9921Ca_nlmf", GXutil.ltrim( localUtil.ntoc( Z9921Ca_nlmf, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9922Ca_nmp", GXutil.ltrim( localUtil.ntoc( Z9922Ca_nmp, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_CA_COD","{handler:'valid_Ca_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9911Ca_cod',fld:'CA_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV34Ca_cod',fld:'vCA_COD',pic:''}]");
      setEventMetadata("VALID_CA_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9912Ca_np',fld:'CA_NP',pic:'ZZ9.99999'},{av:'A9913Ca_pzcr',fld:'CA_PZCR',pic:'ZZ9.99999'},{av:'A9914Ca_pzcl',fld:'CA_PZCL',pic:'ZZ9.99999'},{av:'A9915Ca_pzcrc',fld:'CA_PZCRC',pic:'ZZ9.99999'},{av:'A9916Ca_pzclc',fld:'CA_PZCLC',pic:'ZZ9.99999'},{av:'A9917Ca_pzcrco',fld:'CA_PZCRCO',pic:'ZZ9.99999'},{av:'A9918Ca_pzclco',fld:'CA_PZCLCO',pic:'ZZ9.99999'},{av:'A9919Ca_ce',fld:'CA_CE',pic:'ZZ9.99999'},{av:'A9920Ca_nlms',fld:'CA_NLMS',pic:'ZZ9.99999'},{av:'A9921Ca_nlmf',fld:'CA_NLMF',pic:'ZZ9.99999'},{av:'A9922Ca_nmp',fld:'CA_NMP',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9911Ca_cod'},{av:'Z407EmprNom'},{av:'Z9912Ca_np'},{av:'Z9913Ca_pzcr'},{av:'Z9914Ca_pzcl'},{av:'Z9915Ca_pzcrc'},{av:'Z9916Ca_pzclc'},{av:'Z9917Ca_pzcrco'},{av:'Z9918Ca_pzclco'},{av:'Z9919Ca_ce'},{av:'Z9920Ca_nlms'},{av:'Z9921Ca_nlmf'},{av:'Z9922Ca_nmp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z9911Ca_cod = "" ;
      Z9912Ca_np = DecimalUtil.ZERO ;
      Z9913Ca_pzcr = DecimalUtil.ZERO ;
      Z9914Ca_pzcl = DecimalUtil.ZERO ;
      Z9915Ca_pzcrc = DecimalUtil.ZERO ;
      Z9916Ca_pzclc = DecimalUtil.ZERO ;
      Z9917Ca_pzcrco = DecimalUtil.ZERO ;
      Z9918Ca_pzclco = DecimalUtil.ZERO ;
      Z9919Ca_ce = DecimalUtil.ZERO ;
      Z9920Ca_nlms = DecimalUtil.ZERO ;
      Z9921Ca_nlmf = DecimalUtil.ZERO ;
      Z9922Ca_nmp = DecimalUtil.ZERO ;
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
      A9911Ca_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A9912Ca_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A9913Ca_pzcr = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A9914Ca_pzcl = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A9915Ca_pzcrc = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A9916Ca_pzclc = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A9917Ca_pzcrco = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A9918Ca_pzclco = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A9919Ca_ce = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A9920Ca_nlms = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A9921Ca_nlmf = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A9922Ca_nmp = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV34Ca_cod = "" ;
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
      T015T4_A407EmprNom = new String[] {""} ;
      T015T4_n407EmprNom = new boolean[] {false} ;
      T015T5_A9911Ca_cod = new String[] {""} ;
      T015T5_A407EmprNom = new String[] {""} ;
      T015T5_n407EmprNom = new boolean[] {false} ;
      T015T5_A9912Ca_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9912Ca_np = new boolean[] {false} ;
      T015T5_A9913Ca_pzcr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9913Ca_pzcr = new boolean[] {false} ;
      T015T5_A9914Ca_pzcl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9914Ca_pzcl = new boolean[] {false} ;
      T015T5_A9915Ca_pzcrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9915Ca_pzcrc = new boolean[] {false} ;
      T015T5_A9916Ca_pzclc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9916Ca_pzclc = new boolean[] {false} ;
      T015T5_A9917Ca_pzcrco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9917Ca_pzcrco = new boolean[] {false} ;
      T015T5_A9918Ca_pzclco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9918Ca_pzclco = new boolean[] {false} ;
      T015T5_A9919Ca_ce = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9919Ca_ce = new boolean[] {false} ;
      T015T5_A9920Ca_nlms = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9920Ca_nlms = new boolean[] {false} ;
      T015T5_A9921Ca_nlmf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9921Ca_nlmf = new boolean[] {false} ;
      T015T5_A9922Ca_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T5_n9922Ca_nmp = new boolean[] {false} ;
      T015T5_A396EmprCod = new String[] {""} ;
      T015T6_A396EmprCod = new String[] {""} ;
      T015T6_A9911Ca_cod = new String[] {""} ;
      T015T3_A9911Ca_cod = new String[] {""} ;
      T015T3_A9912Ca_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9912Ca_np = new boolean[] {false} ;
      T015T3_A9913Ca_pzcr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9913Ca_pzcr = new boolean[] {false} ;
      T015T3_A9914Ca_pzcl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9914Ca_pzcl = new boolean[] {false} ;
      T015T3_A9915Ca_pzcrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9915Ca_pzcrc = new boolean[] {false} ;
      T015T3_A9916Ca_pzclc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9916Ca_pzclc = new boolean[] {false} ;
      T015T3_A9917Ca_pzcrco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9917Ca_pzcrco = new boolean[] {false} ;
      T015T3_A9918Ca_pzclco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9918Ca_pzclco = new boolean[] {false} ;
      T015T3_A9919Ca_ce = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9919Ca_ce = new boolean[] {false} ;
      T015T3_A9920Ca_nlms = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9920Ca_nlms = new boolean[] {false} ;
      T015T3_A9921Ca_nlmf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9921Ca_nlmf = new boolean[] {false} ;
      T015T3_A9922Ca_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T3_n9922Ca_nmp = new boolean[] {false} ;
      T015T3_A396EmprCod = new String[] {""} ;
      sMode1316 = "" ;
      T015T7_A396EmprCod = new String[] {""} ;
      T015T7_A9911Ca_cod = new String[] {""} ;
      T015T8_A396EmprCod = new String[] {""} ;
      T015T8_A9911Ca_cod = new String[] {""} ;
      T015T2_A9911Ca_cod = new String[] {""} ;
      T015T2_A9912Ca_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9912Ca_np = new boolean[] {false} ;
      T015T2_A9913Ca_pzcr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9913Ca_pzcr = new boolean[] {false} ;
      T015T2_A9914Ca_pzcl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9914Ca_pzcl = new boolean[] {false} ;
      T015T2_A9915Ca_pzcrc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9915Ca_pzcrc = new boolean[] {false} ;
      T015T2_A9916Ca_pzclc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9916Ca_pzclc = new boolean[] {false} ;
      T015T2_A9917Ca_pzcrco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9917Ca_pzcrco = new boolean[] {false} ;
      T015T2_A9918Ca_pzclco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9918Ca_pzclco = new boolean[] {false} ;
      T015T2_A9919Ca_ce = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9919Ca_ce = new boolean[] {false} ;
      T015T2_A9920Ca_nlms = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9920Ca_nlms = new boolean[] {false} ;
      T015T2_A9921Ca_nlmf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9921Ca_nlmf = new boolean[] {false} ;
      T015T2_A9922Ca_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015T2_n9922Ca_nmp = new boolean[] {false} ;
      T015T2_A396EmprCod = new String[] {""} ;
      T015T12_A396EmprCod = new String[] {""} ;
      T015T12_A129BarCod = new int[1] ;
      T015T12_A132BarCodReo = new byte[1] ;
      T015T12_A130BarCodPar = new String[] {""} ;
      T015T12_A758ProCod = new String[] {""} ;
      T015T12_A194BarOrdLin = new short[1] ;
      T015T12_A9911Ca_cod = new String[] {""} ;
      T015T13_A396EmprCod = new String[] {""} ;
      T015T13_A9911Ca_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T015T14_A407EmprNom = new String[] {""} ;
      T015T14_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9911Ca_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9912Ca_np = DecimalUtil.ZERO ;
      ZZ9913Ca_pzcr = DecimalUtil.ZERO ;
      ZZ9914Ca_pzcl = DecimalUtil.ZERO ;
      ZZ9915Ca_pzcrc = DecimalUtil.ZERO ;
      ZZ9916Ca_pzclc = DecimalUtil.ZERO ;
      ZZ9917Ca_pzcrco = DecimalUtil.ZERO ;
      ZZ9918Ca_pzclco = DecimalUtil.ZERO ;
      ZZ9919Ca_ce = DecimalUtil.ZERO ;
      ZZ9920Ca_nlms = DecimalUtil.ZERO ;
      ZZ9921Ca_nlmf = DecimalUtil.ZERO ;
      ZZ9922Ca_nmp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactca__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactca__default(),
         new Object[] {
             new Object[] {
            T015T2_A9911Ca_cod, T015T2_A9912Ca_np, T015T2_n9912Ca_np, T015T2_A9913Ca_pzcr, T015T2_n9913Ca_pzcr, T015T2_A9914Ca_pzcl, T015T2_n9914Ca_pzcl, T015T2_A9915Ca_pzcrc, T015T2_n9915Ca_pzcrc, T015T2_A9916Ca_pzclc,
            T015T2_n9916Ca_pzclc, T015T2_A9917Ca_pzcrco, T015T2_n9917Ca_pzcrco, T015T2_A9918Ca_pzclco, T015T2_n9918Ca_pzclco, T015T2_A9919Ca_ce, T015T2_n9919Ca_ce, T015T2_A9920Ca_nlms, T015T2_n9920Ca_nlms, T015T2_A9921Ca_nlmf,
            T015T2_n9921Ca_nlmf, T015T2_A9922Ca_nmp, T015T2_n9922Ca_nmp, T015T2_A396EmprCod
            }
            , new Object[] {
            T015T3_A9911Ca_cod, T015T3_A9912Ca_np, T015T3_n9912Ca_np, T015T3_A9913Ca_pzcr, T015T3_n9913Ca_pzcr, T015T3_A9914Ca_pzcl, T015T3_n9914Ca_pzcl, T015T3_A9915Ca_pzcrc, T015T3_n9915Ca_pzcrc, T015T3_A9916Ca_pzclc,
            T015T3_n9916Ca_pzclc, T015T3_A9917Ca_pzcrco, T015T3_n9917Ca_pzcrco, T015T3_A9918Ca_pzclco, T015T3_n9918Ca_pzclco, T015T3_A9919Ca_ce, T015T3_n9919Ca_ce, T015T3_A9920Ca_nlms, T015T3_n9920Ca_nlms, T015T3_A9921Ca_nlmf,
            T015T3_n9921Ca_nlmf, T015T3_A9922Ca_nmp, T015T3_n9922Ca_nmp, T015T3_A396EmprCod
            }
            , new Object[] {
            T015T4_A407EmprNom, T015T4_n407EmprNom
            }
            , new Object[] {
            T015T5_A9911Ca_cod, T015T5_A407EmprNom, T015T5_n407EmprNom, T015T5_A9912Ca_np, T015T5_n9912Ca_np, T015T5_A9913Ca_pzcr, T015T5_n9913Ca_pzcr, T015T5_A9914Ca_pzcl, T015T5_n9914Ca_pzcl, T015T5_A9915Ca_pzcrc,
            T015T5_n9915Ca_pzcrc, T015T5_A9916Ca_pzclc, T015T5_n9916Ca_pzclc, T015T5_A9917Ca_pzcrco, T015T5_n9917Ca_pzcrco, T015T5_A9918Ca_pzclco, T015T5_n9918Ca_pzclco, T015T5_A9919Ca_ce, T015T5_n9919Ca_ce, T015T5_A9920Ca_nlms,
            T015T5_n9920Ca_nlms, T015T5_A9921Ca_nlmf, T015T5_n9921Ca_nlmf, T015T5_A9922Ca_nmp, T015T5_n9922Ca_nmp, T015T5_A396EmprCod
            }
            , new Object[] {
            T015T6_A396EmprCod, T015T6_A9911Ca_cod
            }
            , new Object[] {
            T015T7_A396EmprCod, T015T7_A9911Ca_cod
            }
            , new Object[] {
            T015T8_A396EmprCod, T015T8_A9911Ca_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015T12_A396EmprCod, T015T12_A129BarCod, T015T12_A132BarCodReo, T015T12_A130BarCodPar, T015T12_A758ProCod, T015T12_A194BarOrdLin, T015T12_A9911Ca_cod
            }
            , new Object[] {
            T015T13_A396EmprCod, T015T13_A9911Ca_cod
            }
            , new Object[] {
            T015T14_A407EmprNom, T015T14_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TACTCA" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1316 ;
   private short nIsDirty_1316 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCa_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCa_np_Enabled ;
   private int edtCa_pzcr_Enabled ;
   private int edtCa_pzcl_Enabled ;
   private int edtCa_pzcrc_Enabled ;
   private int edtCa_pzclc_Enabled ;
   private int edtCa_pzcrco_Enabled ;
   private int edtCa_pzclco_Enabled ;
   private int edtCa_ce_Enabled ;
   private int edtCa_nlms_Enabled ;
   private int edtCa_nlmf_Enabled ;
   private int edtCa_nmp_Enabled ;
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
   private int edtCa_nmp_Backcolor ;
   private int edtCa_nlmf_Backcolor ;
   private int edtCa_nlms_Backcolor ;
   private int edtCa_ce_Backcolor ;
   private int edtCa_pzclco_Backcolor ;
   private int edtCa_pzcrco_Backcolor ;
   private int edtCa_pzclc_Backcolor ;
   private int edtCa_pzcrc_Backcolor ;
   private int edtCa_pzcl_Backcolor ;
   private int edtCa_pzcr_Backcolor ;
   private int edtCa_np_Backcolor ;
   private int edtCa_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z9912Ca_np ;
   private java.math.BigDecimal Z9913Ca_pzcr ;
   private java.math.BigDecimal Z9914Ca_pzcl ;
   private java.math.BigDecimal Z9915Ca_pzcrc ;
   private java.math.BigDecimal Z9916Ca_pzclc ;
   private java.math.BigDecimal Z9917Ca_pzcrco ;
   private java.math.BigDecimal Z9918Ca_pzclco ;
   private java.math.BigDecimal Z9919Ca_ce ;
   private java.math.BigDecimal Z9920Ca_nlms ;
   private java.math.BigDecimal Z9921Ca_nlmf ;
   private java.math.BigDecimal Z9922Ca_nmp ;
   private java.math.BigDecimal A9912Ca_np ;
   private java.math.BigDecimal A9913Ca_pzcr ;
   private java.math.BigDecimal A9914Ca_pzcl ;
   private java.math.BigDecimal A9915Ca_pzcrc ;
   private java.math.BigDecimal A9916Ca_pzclc ;
   private java.math.BigDecimal A9917Ca_pzcrco ;
   private java.math.BigDecimal A9918Ca_pzclco ;
   private java.math.BigDecimal A9919Ca_ce ;
   private java.math.BigDecimal A9920Ca_nlms ;
   private java.math.BigDecimal A9921Ca_nlmf ;
   private java.math.BigDecimal A9922Ca_nmp ;
   private java.math.BigDecimal ZZ9912Ca_np ;
   private java.math.BigDecimal ZZ9913Ca_pzcr ;
   private java.math.BigDecimal ZZ9914Ca_pzcl ;
   private java.math.BigDecimal ZZ9915Ca_pzcrc ;
   private java.math.BigDecimal ZZ9916Ca_pzclc ;
   private java.math.BigDecimal ZZ9917Ca_pzcrco ;
   private java.math.BigDecimal ZZ9918Ca_pzclco ;
   private java.math.BigDecimal ZZ9919Ca_ce ;
   private java.math.BigDecimal ZZ9920Ca_nlms ;
   private java.math.BigDecimal ZZ9921Ca_nlmf ;
   private java.math.BigDecimal ZZ9922Ca_nmp ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9911Ca_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCa_cod_Internalname ;
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
   private String A9911Ca_cod ;
   private String edtCa_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCa_np_Internalname ;
   private String edtCa_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCa_pzcr_Internalname ;
   private String edtCa_pzcr_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCa_pzcl_Internalname ;
   private String edtCa_pzcl_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCa_pzcrc_Internalname ;
   private String edtCa_pzcrc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCa_pzclc_Internalname ;
   private String edtCa_pzclc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCa_pzcrco_Internalname ;
   private String edtCa_pzcrco_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCa_pzclco_Internalname ;
   private String edtCa_pzclco_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtCa_ce_Internalname ;
   private String edtCa_ce_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCa_nlms_Internalname ;
   private String edtCa_nlms_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtCa_nlmf_Internalname ;
   private String edtCa_nlmf_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCa_nmp_Internalname ;
   private String edtCa_nmp_Jsonclick ;
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
   private String AV34Ca_cod ;
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
   private String sMode1316 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9911Ca_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9912Ca_np ;
   private boolean n9913Ca_pzcr ;
   private boolean n9914Ca_pzcl ;
   private boolean n9915Ca_pzcrc ;
   private boolean n9916Ca_pzclc ;
   private boolean n9917Ca_pzcrco ;
   private boolean n9918Ca_pzclco ;
   private boolean n9919Ca_ce ;
   private boolean n9920Ca_nlms ;
   private boolean n9921Ca_nlmf ;
   private boolean n9922Ca_nmp ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T015T4_A407EmprNom ;
   private boolean[] T015T4_n407EmprNom ;
   private String[] T015T5_A9911Ca_cod ;
   private String[] T015T5_A407EmprNom ;
   private boolean[] T015T5_n407EmprNom ;
   private java.math.BigDecimal[] T015T5_A9912Ca_np ;
   private boolean[] T015T5_n9912Ca_np ;
   private java.math.BigDecimal[] T015T5_A9913Ca_pzcr ;
   private boolean[] T015T5_n9913Ca_pzcr ;
   private java.math.BigDecimal[] T015T5_A9914Ca_pzcl ;
   private boolean[] T015T5_n9914Ca_pzcl ;
   private java.math.BigDecimal[] T015T5_A9915Ca_pzcrc ;
   private boolean[] T015T5_n9915Ca_pzcrc ;
   private java.math.BigDecimal[] T015T5_A9916Ca_pzclc ;
   private boolean[] T015T5_n9916Ca_pzclc ;
   private java.math.BigDecimal[] T015T5_A9917Ca_pzcrco ;
   private boolean[] T015T5_n9917Ca_pzcrco ;
   private java.math.BigDecimal[] T015T5_A9918Ca_pzclco ;
   private boolean[] T015T5_n9918Ca_pzclco ;
   private java.math.BigDecimal[] T015T5_A9919Ca_ce ;
   private boolean[] T015T5_n9919Ca_ce ;
   private java.math.BigDecimal[] T015T5_A9920Ca_nlms ;
   private boolean[] T015T5_n9920Ca_nlms ;
   private java.math.BigDecimal[] T015T5_A9921Ca_nlmf ;
   private boolean[] T015T5_n9921Ca_nlmf ;
   private java.math.BigDecimal[] T015T5_A9922Ca_nmp ;
   private boolean[] T015T5_n9922Ca_nmp ;
   private String[] T015T5_A396EmprCod ;
   private String[] T015T6_A396EmprCod ;
   private String[] T015T6_A9911Ca_cod ;
   private String[] T015T3_A9911Ca_cod ;
   private java.math.BigDecimal[] T015T3_A9912Ca_np ;
   private boolean[] T015T3_n9912Ca_np ;
   private java.math.BigDecimal[] T015T3_A9913Ca_pzcr ;
   private boolean[] T015T3_n9913Ca_pzcr ;
   private java.math.BigDecimal[] T015T3_A9914Ca_pzcl ;
   private boolean[] T015T3_n9914Ca_pzcl ;
   private java.math.BigDecimal[] T015T3_A9915Ca_pzcrc ;
   private boolean[] T015T3_n9915Ca_pzcrc ;
   private java.math.BigDecimal[] T015T3_A9916Ca_pzclc ;
   private boolean[] T015T3_n9916Ca_pzclc ;
   private java.math.BigDecimal[] T015T3_A9917Ca_pzcrco ;
   private boolean[] T015T3_n9917Ca_pzcrco ;
   private java.math.BigDecimal[] T015T3_A9918Ca_pzclco ;
   private boolean[] T015T3_n9918Ca_pzclco ;
   private java.math.BigDecimal[] T015T3_A9919Ca_ce ;
   private boolean[] T015T3_n9919Ca_ce ;
   private java.math.BigDecimal[] T015T3_A9920Ca_nlms ;
   private boolean[] T015T3_n9920Ca_nlms ;
   private java.math.BigDecimal[] T015T3_A9921Ca_nlmf ;
   private boolean[] T015T3_n9921Ca_nlmf ;
   private java.math.BigDecimal[] T015T3_A9922Ca_nmp ;
   private boolean[] T015T3_n9922Ca_nmp ;
   private String[] T015T3_A396EmprCod ;
   private String[] T015T7_A396EmprCod ;
   private String[] T015T7_A9911Ca_cod ;
   private String[] T015T8_A396EmprCod ;
   private String[] T015T8_A9911Ca_cod ;
   private String[] T015T2_A9911Ca_cod ;
   private java.math.BigDecimal[] T015T2_A9912Ca_np ;
   private boolean[] T015T2_n9912Ca_np ;
   private java.math.BigDecimal[] T015T2_A9913Ca_pzcr ;
   private boolean[] T015T2_n9913Ca_pzcr ;
   private java.math.BigDecimal[] T015T2_A9914Ca_pzcl ;
   private boolean[] T015T2_n9914Ca_pzcl ;
   private java.math.BigDecimal[] T015T2_A9915Ca_pzcrc ;
   private boolean[] T015T2_n9915Ca_pzcrc ;
   private java.math.BigDecimal[] T015T2_A9916Ca_pzclc ;
   private boolean[] T015T2_n9916Ca_pzclc ;
   private java.math.BigDecimal[] T015T2_A9917Ca_pzcrco ;
   private boolean[] T015T2_n9917Ca_pzcrco ;
   private java.math.BigDecimal[] T015T2_A9918Ca_pzclco ;
   private boolean[] T015T2_n9918Ca_pzclco ;
   private java.math.BigDecimal[] T015T2_A9919Ca_ce ;
   private boolean[] T015T2_n9919Ca_ce ;
   private java.math.BigDecimal[] T015T2_A9920Ca_nlms ;
   private boolean[] T015T2_n9920Ca_nlms ;
   private java.math.BigDecimal[] T015T2_A9921Ca_nlmf ;
   private boolean[] T015T2_n9921Ca_nlmf ;
   private java.math.BigDecimal[] T015T2_A9922Ca_nmp ;
   private boolean[] T015T2_n9922Ca_nmp ;
   private String[] T015T2_A396EmprCod ;
   private String[] T015T12_A396EmprCod ;
   private int[] T015T12_A129BarCod ;
   private byte[] T015T12_A132BarCodReo ;
   private String[] T015T12_A130BarCodPar ;
   private String[] T015T12_A758ProCod ;
   private short[] T015T12_A194BarOrdLin ;
   private String[] T015T12_A9911Ca_cod ;
   private String[] T015T13_A396EmprCod ;
   private String[] T015T13_A9911Ca_cod ;
   private String[] T015T14_A407EmprNom ;
   private boolean[] T015T14_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactca__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015T2", "SELECT Ca_cod, Ca_np, Ca_pzcr, Ca_pzcl, Ca_pzcrc, Ca_pzclc, Ca_pzcrco, Ca_pzclco, Ca_ce, Ca_nlms, Ca_nlmf, Ca_nmp, EmprCod FROM TXPACTCA WHERE EmprCod = ? AND Ca_cod = ?  FOR UPDATE OF Ca_np, Ca_pzcr, Ca_pzcl, Ca_pzcrc, Ca_pzclc, Ca_pzcrco, Ca_pzclco, Ca_ce, Ca_nlms, Ca_nlmf, Ca_nmp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T3", "SELECT Ca_cod, Ca_np, Ca_pzcr, Ca_pzcl, Ca_pzcrc, Ca_pzclc, Ca_pzcrco, Ca_pzclco, Ca_ce, Ca_nlms, Ca_nlmf, Ca_nmp, EmprCod FROM TXPACTCA WHERE EmprCod = ? AND Ca_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ca_cod, T2.EmprNom, TM1.Ca_np, TM1.Ca_pzcr, TM1.Ca_pzcl, TM1.Ca_pzcrc, TM1.Ca_pzclc, TM1.Ca_pzcrco, TM1.Ca_pzclco, TM1.Ca_ce, TM1.Ca_nlms, TM1.Ca_nlmf, TM1.Ca_nmp, TM1.EmprCod FROM (TXPACTCA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Ca_cod = ? ORDER BY TM1.EmprCod, TM1.Ca_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ca_cod FROM TXPACTCA WHERE EmprCod = ? AND Ca_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ca_cod FROM TXPACTCA WHERE ( Ca_cod > ?) and EmprCod = ? ORDER BY EmprCod, Ca_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015T8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ca_cod FROM TXPACTCA WHERE ( Ca_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Ca_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015T9", "INSERT INTO TXPACTCA(Ca_cod, Ca_np, Ca_pzcr, Ca_pzcl, Ca_pzcrc, Ca_pzclc, Ca_pzcrco, Ca_pzclco, Ca_ce, Ca_nlms, Ca_nlmf, Ca_nmp, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTCA")
         ,new UpdateCursor("T015T10", "UPDATE TXPACTCA SET Ca_np=?, Ca_pzcr=?, Ca_pzcl=?, Ca_pzcrc=?, Ca_pzclc=?, Ca_pzcrco=?, Ca_pzclco=?, Ca_ce=?, Ca_nlms=?, Ca_nlmf=?, Ca_nmp=?  WHERE EmprCod = ? AND Ca_cod = ?", GX_NOMASK, "TXPACTCA")
         ,new UpdateCursor("T015T11", "DELETE FROM TXPACTCA  WHERE EmprCod = ? AND Ca_cod = ?", GX_NOMASK, "TXPACTCA")
         ,new ForEachCursor("T015T12", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND Ca_cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015T13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ca_cod FROM TXPACTCA WHERE EmprCod = ? ORDER BY EmprCod, Ca_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015T14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
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
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
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
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
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
               stmt.setString(13, (String)parms[23], 3);
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
               stmt.setString(12, (String)parms[22], 3);
               stmt.setString(13, (String)parms[23], 6);
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

