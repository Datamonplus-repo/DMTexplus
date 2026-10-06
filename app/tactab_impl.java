package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactab_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO ACTIVIDAD ABRIR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAb_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactab_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactab_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactab_impl.class ));
   }

   public tactab_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTAB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Seccion Actividad", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_cod_Internalname, GXutil.rtrim( A9940Ab_cod), GXutil.rtrim( localUtil.format( A9940Ab_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_cod_Jsonclick, 0, "", "", "", "", "", 1, edtAb_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N pdas destino RAM", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npdr_Internalname, GXutil.ltrim( localUtil.ntoc( A9941Ab_npdr, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npdr_Enabled!=0) ? localUtil.format( A9941Ab_npdr, "ZZ9.99999") : localUtil.format( A9941Ab_npdr, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npdr_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npdr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N pdas destino PERCHA", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npdp_Internalname, GXutil.ltrim( localUtil.ntoc( A9942Ab_npdp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npdp_Enabled!=0) ? localUtil.format( A9942Ab_npdp, "ZZ9.99999") : localUtil.format( A9942Ab_npdp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npdp_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npdp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N Piezas Ab en Seco", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzas_Internalname, GXutil.ltrim( localUtil.ntoc( A9958Ab_npzas, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzas_Enabled!=0) ? localUtil.format( A9958Ab_npzas, "ZZ9.99999") : localUtil.format( A9958Ab_npzas, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzas_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzas_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "N Piezas Ab en mojado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzam_Internalname, GXutil.ltrim( localUtil.ntoc( A9959Ab_npzam, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzam_Enabled!=0) ? localUtil.format( A9959Ab_npzam, "ZZ9.99999") : localUtil.format( A9959Ab_npzam, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzam_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzam_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N Piezas Abrir seco CC", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzasc_Internalname, GXutil.ltrim( localUtil.ntoc( A9943Ab_npzasc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzasc_Enabled!=0) ? localUtil.format( A9943Ab_npzasc, "ZZ9.99999") : localUtil.format( A9943Ab_npzasc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzasc_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzasc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N Piezas Abrir Mojado CC", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzamc_Internalname, GXutil.ltrim( localUtil.ntoc( A9944Ab_npzamc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzamc_Enabled!=0) ? localUtil.format( A9944Ab_npzamc, "ZZ9.99999") : localUtil.format( A9944Ab_npzamc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzamc_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzamc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "N Pzs Cos Ab Mojado", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzcam_Internalname, GXutil.ltrim( localUtil.ntoc( A9945Ab_npzcam, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzcam_Enabled!=0) ? localUtil.format( A9945Ab_npzcam, "ZZ9.99999") : localUtil.format( A9945Ab_npzcam, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzcam_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzcam_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "N Pzs cos Ab  moj mq 4", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzcam4_Internalname, GXutil.ltrim( localUtil.ntoc( A9946Ab_npzcam4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzcam4_Enabled!=0) ? localUtil.format( A9946Ab_npzcam4, "ZZ9.99999") : localUtil.format( A9946Ab_npzcam4, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzcam4_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzcam4_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N Pzs cos Ab  moj cc mq 4", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzcamc_Internalname, GXutil.ltrim( localUtil.ntoc( A9947Ab_npzcamc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzcamc_Enabled!=0) ? localUtil.format( A9947Ab_npzcamc, "ZZ9.99999") : localUtil.format( A9947Ab_npzcamc, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzcamc_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzcamc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "N Piezas Desplegar", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_npzd_Internalname, GXutil.ltrim( localUtil.ntoc( A9948Ab_npzd, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_npzd_Enabled!=0) ? localUtil.format( A9948Ab_npzd, "ZZ9.99999") : localUtil.format( A9948Ab_npzd, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_npzd_Jsonclick, 0, "", "", "", "", "", 1, edtAb_npzd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "N Limpiezas (Oscuro a claro)", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nl_Internalname, GXutil.ltrim( localUtil.ntoc( A9949Ab_nl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nl_Enabled!=0) ? localUtil.format( A9949Ab_nl, "ZZ9.99999") : localUtil.format( A9949Ab_nl, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nl_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nl_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "N mts Maq 1 Pes 100", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm1pes_Internalname, GXutil.ltrim( localUtil.ntoc( A9950Ab_nmm1pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm1pes_Enabled!=0) ? localUtil.format( A9950Ab_nmm1pes, "ZZ9.99999") : localUtil.format( A9950Ab_nmm1pes, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm1pes_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm1pes_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "N mts Maq 2 Pes 100", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm2pes_Internalname, GXutil.ltrim( localUtil.ntoc( A9951Ab_nmm2pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm2pes_Enabled!=0) ? localUtil.format( A9951Ab_nmm2pes, "ZZ9.99999") : localUtil.format( A9951Ab_nmm2pes, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm2pes_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm2pes_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "N mts Maq 3 Pes 100", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm3pes_Internalname, GXutil.ltrim( localUtil.ntoc( A9952Ab_nmm3pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm3pes_Enabled!=0) ? localUtil.format( A9952Ab_nmm3pes, "ZZ9.99999") : localUtil.format( A9952Ab_nmm3pes, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm3pes_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm3pes_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "N mts Maq 1 Resto Tej", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm1rt_Internalname, GXutil.ltrim( localUtil.ntoc( A9953Ab_nmm1rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm1rt_Enabled!=0) ? localUtil.format( A9953Ab_nmm1rt, "ZZ9.99999") : localUtil.format( A9953Ab_nmm1rt, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm1rt_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm1rt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "N mts Maq 2 Resto Tej", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm2rt_Internalname, GXutil.ltrim( localUtil.ntoc( A9954Ab_nmm2rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm2rt_Enabled!=0) ? localUtil.format( A9954Ab_nmm2rt, "ZZ9.99999") : localUtil.format( A9954Ab_nmm2rt, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm2rt_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm2rt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "N mts Maq 3 Resto Tej", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm3rt_Internalname, GXutil.ltrim( localUtil.ntoc( A9955Ab_nmm3rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm3rt_Enabled!=0) ? localUtil.format( A9955Ab_nmm3rt, "ZZ9.99999") : localUtil.format( A9955Ab_nmm3rt, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm3rt_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm3rt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "N mts Maq 4 Resto Tej", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmm4rt_Internalname, GXutil.ltrim( localUtil.ntoc( A9956Ab_nmm4rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmm4rt_Enabled!=0) ? localUtil.format( A9956Ab_nmm4rt, "ZZ9.99999") : localUtil.format( A9956Ab_nmm4rt, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmm4rt_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmm4rt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ab nmp", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTAB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAb_nmp_Internalname, GXutil.ltrim( localUtil.ntoc( A9957Ab_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAb_nmp_Enabled!=0) ? localUtil.format( A9957Ab_nmp, "ZZ9.99999") : localUtil.format( A9957Ab_nmp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAb_nmp_Jsonclick, 0, "", "", "", "", "", 1, edtAb_nmp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTAB.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTAB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTAB.htm");
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
      e1115X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9940Ab_cod = httpContext.cgiGet( "Z9940Ab_cod") ;
            Z9941Ab_npdr = localUtil.ctond( httpContext.cgiGet( "Z9941Ab_npdr")) ;
            Z9942Ab_npdp = localUtil.ctond( httpContext.cgiGet( "Z9942Ab_npdp")) ;
            Z9958Ab_npzas = localUtil.ctond( httpContext.cgiGet( "Z9958Ab_npzas")) ;
            Z9959Ab_npzam = localUtil.ctond( httpContext.cgiGet( "Z9959Ab_npzam")) ;
            Z9943Ab_npzasc = localUtil.ctond( httpContext.cgiGet( "Z9943Ab_npzasc")) ;
            Z9944Ab_npzamc = localUtil.ctond( httpContext.cgiGet( "Z9944Ab_npzamc")) ;
            Z9945Ab_npzcam = localUtil.ctond( httpContext.cgiGet( "Z9945Ab_npzcam")) ;
            Z9946Ab_npzcam4 = localUtil.ctond( httpContext.cgiGet( "Z9946Ab_npzcam4")) ;
            Z9947Ab_npzcamc = localUtil.ctond( httpContext.cgiGet( "Z9947Ab_npzcamc")) ;
            Z9948Ab_npzd = localUtil.ctond( httpContext.cgiGet( "Z9948Ab_npzd")) ;
            Z9949Ab_nl = localUtil.ctond( httpContext.cgiGet( "Z9949Ab_nl")) ;
            Z9950Ab_nmm1pes = localUtil.ctond( httpContext.cgiGet( "Z9950Ab_nmm1pes")) ;
            Z9951Ab_nmm2pes = localUtil.ctond( httpContext.cgiGet( "Z9951Ab_nmm2pes")) ;
            Z9952Ab_nmm3pes = localUtil.ctond( httpContext.cgiGet( "Z9952Ab_nmm3pes")) ;
            Z9953Ab_nmm1rt = localUtil.ctond( httpContext.cgiGet( "Z9953Ab_nmm1rt")) ;
            Z9954Ab_nmm2rt = localUtil.ctond( httpContext.cgiGet( "Z9954Ab_nmm2rt")) ;
            Z9955Ab_nmm3rt = localUtil.ctond( httpContext.cgiGet( "Z9955Ab_nmm3rt")) ;
            Z9956Ab_nmm4rt = localUtil.ctond( httpContext.cgiGet( "Z9956Ab_nmm4rt")) ;
            Z9957Ab_nmp = localUtil.ctond( httpContext.cgiGet( "Z9957Ab_nmp")) ;
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
            A9940Ab_cod = httpContext.cgiGet( edtAb_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npdr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npdr_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9941Ab_npdr = DecimalUtil.ZERO ;
               n9941Ab_npdr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrimstr( A9941Ab_npdr, 9, 5));
            }
            else
            {
               A9941Ab_npdr = localUtil.ctond( httpContext.cgiGet( edtAb_npdr_Internalname)) ;
               n9941Ab_npdr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrimstr( A9941Ab_npdr, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npdp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npdp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPDP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npdp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9942Ab_npdp = DecimalUtil.ZERO ;
               n9942Ab_npdp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrimstr( A9942Ab_npdp, 9, 5));
            }
            else
            {
               A9942Ab_npdp = localUtil.ctond( httpContext.cgiGet( edtAb_npdp_Internalname)) ;
               n9942Ab_npdp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrimstr( A9942Ab_npdp, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzas_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9958Ab_npzas = DecimalUtil.ZERO ;
               n9958Ab_npzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrimstr( A9958Ab_npzas, 9, 5));
            }
            else
            {
               A9958Ab_npzas = localUtil.ctond( httpContext.cgiGet( edtAb_npzas_Internalname)) ;
               n9958Ab_npzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrimstr( A9958Ab_npzas, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzam_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzam_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9959Ab_npzam = DecimalUtil.ZERO ;
               n9959Ab_npzam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrimstr( A9959Ab_npzam, 9, 5));
            }
            else
            {
               A9959Ab_npzam = localUtil.ctond( httpContext.cgiGet( edtAb_npzam_Internalname)) ;
               n9959Ab_npzam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrimstr( A9959Ab_npzam, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzasc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzasc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZASC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzasc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9943Ab_npzasc = DecimalUtil.ZERO ;
               n9943Ab_npzasc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrimstr( A9943Ab_npzasc, 9, 5));
            }
            else
            {
               A9943Ab_npzasc = localUtil.ctond( httpContext.cgiGet( edtAb_npzasc_Internalname)) ;
               n9943Ab_npzasc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrimstr( A9943Ab_npzasc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzamc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzamc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZAMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzamc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9944Ab_npzamc = DecimalUtil.ZERO ;
               n9944Ab_npzamc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrimstr( A9944Ab_npzamc, 9, 5));
            }
            else
            {
               A9944Ab_npzamc = localUtil.ctond( httpContext.cgiGet( edtAb_npzamc_Internalname)) ;
               n9944Ab_npzamc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrimstr( A9944Ab_npzamc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzcam_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzcam_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZCAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzcam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9945Ab_npzcam = DecimalUtil.ZERO ;
               n9945Ab_npzcam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrimstr( A9945Ab_npzcam, 9, 5));
            }
            else
            {
               A9945Ab_npzcam = localUtil.ctond( httpContext.cgiGet( edtAb_npzcam_Internalname)) ;
               n9945Ab_npzcam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrimstr( A9945Ab_npzcam, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzcam4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzcam4_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZCAM4");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzcam4_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9946Ab_npzcam4 = DecimalUtil.ZERO ;
               n9946Ab_npzcam4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrimstr( A9946Ab_npzcam4, 9, 5));
            }
            else
            {
               A9946Ab_npzcam4 = localUtil.ctond( httpContext.cgiGet( edtAb_npzcam4_Internalname)) ;
               n9946Ab_npzcam4 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrimstr( A9946Ab_npzcam4, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzcamc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzcamc_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZCAMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzcamc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9947Ab_npzcamc = DecimalUtil.ZERO ;
               n9947Ab_npzcamc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrimstr( A9947Ab_npzcamc, 9, 5));
            }
            else
            {
               A9947Ab_npzcamc = localUtil.ctond( httpContext.cgiGet( edtAb_npzcamc_Internalname)) ;
               n9947Ab_npzcamc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrimstr( A9947Ab_npzcamc, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_npzd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_npzd_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NPZD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_npzd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9948Ab_npzd = DecimalUtil.ZERO ;
               n9948Ab_npzd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrimstr( A9948Ab_npzd, 9, 5));
            }
            else
            {
               A9948Ab_npzd = localUtil.ctond( httpContext.cgiGet( edtAb_npzd_Internalname)) ;
               n9948Ab_npzd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrimstr( A9948Ab_npzd, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nl_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nl_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9949Ab_nl = DecimalUtil.ZERO ;
               n9949Ab_nl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrimstr( A9949Ab_nl, 9, 5));
            }
            else
            {
               A9949Ab_nl = localUtil.ctond( httpContext.cgiGet( edtAb_nl_Internalname)) ;
               n9949Ab_nl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrimstr( A9949Ab_nl, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm1pes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm1pes_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM1PES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm1pes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9950Ab_nmm1pes = DecimalUtil.ZERO ;
               n9950Ab_nmm1pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrimstr( A9950Ab_nmm1pes, 9, 5));
            }
            else
            {
               A9950Ab_nmm1pes = localUtil.ctond( httpContext.cgiGet( edtAb_nmm1pes_Internalname)) ;
               n9950Ab_nmm1pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrimstr( A9950Ab_nmm1pes, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm2pes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm2pes_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM2PES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm2pes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9951Ab_nmm2pes = DecimalUtil.ZERO ;
               n9951Ab_nmm2pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrimstr( A9951Ab_nmm2pes, 9, 5));
            }
            else
            {
               A9951Ab_nmm2pes = localUtil.ctond( httpContext.cgiGet( edtAb_nmm2pes_Internalname)) ;
               n9951Ab_nmm2pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrimstr( A9951Ab_nmm2pes, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm3pes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm3pes_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM3PES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm3pes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9952Ab_nmm3pes = DecimalUtil.ZERO ;
               n9952Ab_nmm3pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrimstr( A9952Ab_nmm3pes, 9, 5));
            }
            else
            {
               A9952Ab_nmm3pes = localUtil.ctond( httpContext.cgiGet( edtAb_nmm3pes_Internalname)) ;
               n9952Ab_nmm3pes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrimstr( A9952Ab_nmm3pes, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm1rt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm1rt_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM1RT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm1rt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9953Ab_nmm1rt = DecimalUtil.ZERO ;
               n9953Ab_nmm1rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrimstr( A9953Ab_nmm1rt, 9, 5));
            }
            else
            {
               A9953Ab_nmm1rt = localUtil.ctond( httpContext.cgiGet( edtAb_nmm1rt_Internalname)) ;
               n9953Ab_nmm1rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrimstr( A9953Ab_nmm1rt, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm2rt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm2rt_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM2RT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm2rt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9954Ab_nmm2rt = DecimalUtil.ZERO ;
               n9954Ab_nmm2rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrimstr( A9954Ab_nmm2rt, 9, 5));
            }
            else
            {
               A9954Ab_nmm2rt = localUtil.ctond( httpContext.cgiGet( edtAb_nmm2rt_Internalname)) ;
               n9954Ab_nmm2rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrimstr( A9954Ab_nmm2rt, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm3rt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm3rt_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM3RT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm3rt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9955Ab_nmm3rt = DecimalUtil.ZERO ;
               n9955Ab_nmm3rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrimstr( A9955Ab_nmm3rt, 9, 5));
            }
            else
            {
               A9955Ab_nmm3rt = localUtil.ctond( httpContext.cgiGet( edtAb_nmm3rt_Internalname)) ;
               n9955Ab_nmm3rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrimstr( A9955Ab_nmm3rt, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmm4rt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmm4rt_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMM4RT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmm4rt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9956Ab_nmm4rt = DecimalUtil.ZERO ;
               n9956Ab_nmm4rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrimstr( A9956Ab_nmm4rt, 9, 5));
            }
            else
            {
               A9956Ab_nmm4rt = localUtil.ctond( httpContext.cgiGet( edtAb_nmm4rt_Internalname)) ;
               n9956Ab_nmm4rt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrimstr( A9956Ab_nmm4rt, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAb_nmp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAb_nmp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AB_NMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAb_nmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9957Ab_nmp = DecimalUtil.ZERO ;
               n9957Ab_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrimstr( A9957Ab_nmp, 9, 5));
            }
            else
            {
               A9957Ab_nmp = localUtil.ctond( httpContext.cgiGet( edtAb_nmp_Internalname)) ;
               n9957Ab_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrimstr( A9957Ab_nmp, 9, 5));
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
               A9940Ab_cod = httpContext.GetPar( "Ab_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
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
                        e1115X2 ();
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
            initAll15X1321( ) ;
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
      disableAttributes15X1321( ) ;
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

   public void confirm_15X0( )
   {
      beforeValidate15X1321( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15X1321( ) ;
         }
         else
         {
            checkExtendedTable15X1321( ) ;
            if ( AnyError == 0 )
            {
               zm15X1321( 4) ;
            }
            closeExtendedTableCursors15X1321( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues15X0( ) ;
      }
   }

   public void resetCaption15X0( )
   {
   }

   public void e1115X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactab_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tactab_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactab_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactab_impl.this.A396EmprCod = GXv_char2[0] ;
      tactab_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactab_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV34Codigo ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACAB", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactab_impl.this.A396EmprCod = GXv_char4[0] ;
      tactab_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV34Codigo = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Codigo", AV34Codigo);
      if ( GXutil.strcmp(AV34Codigo, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACAB", ""));
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

   public void zm15X1321( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9941Ab_npdr = T015X3_A9941Ab_npdr[0] ;
            Z9942Ab_npdp = T015X3_A9942Ab_npdp[0] ;
            Z9958Ab_npzas = T015X3_A9958Ab_npzas[0] ;
            Z9959Ab_npzam = T015X3_A9959Ab_npzam[0] ;
            Z9943Ab_npzasc = T015X3_A9943Ab_npzasc[0] ;
            Z9944Ab_npzamc = T015X3_A9944Ab_npzamc[0] ;
            Z9945Ab_npzcam = T015X3_A9945Ab_npzcam[0] ;
            Z9946Ab_npzcam4 = T015X3_A9946Ab_npzcam4[0] ;
            Z9947Ab_npzcamc = T015X3_A9947Ab_npzcamc[0] ;
            Z9948Ab_npzd = T015X3_A9948Ab_npzd[0] ;
            Z9949Ab_nl = T015X3_A9949Ab_nl[0] ;
            Z9950Ab_nmm1pes = T015X3_A9950Ab_nmm1pes[0] ;
            Z9951Ab_nmm2pes = T015X3_A9951Ab_nmm2pes[0] ;
            Z9952Ab_nmm3pes = T015X3_A9952Ab_nmm3pes[0] ;
            Z9953Ab_nmm1rt = T015X3_A9953Ab_nmm1rt[0] ;
            Z9954Ab_nmm2rt = T015X3_A9954Ab_nmm2rt[0] ;
            Z9955Ab_nmm3rt = T015X3_A9955Ab_nmm3rt[0] ;
            Z9956Ab_nmm4rt = T015X3_A9956Ab_nmm4rt[0] ;
            Z9957Ab_nmp = T015X3_A9957Ab_nmp[0] ;
         }
         else
         {
            Z9941Ab_npdr = A9941Ab_npdr ;
            Z9942Ab_npdp = A9942Ab_npdp ;
            Z9958Ab_npzas = A9958Ab_npzas ;
            Z9959Ab_npzam = A9959Ab_npzam ;
            Z9943Ab_npzasc = A9943Ab_npzasc ;
            Z9944Ab_npzamc = A9944Ab_npzamc ;
            Z9945Ab_npzcam = A9945Ab_npzcam ;
            Z9946Ab_npzcam4 = A9946Ab_npzcam4 ;
            Z9947Ab_npzcamc = A9947Ab_npzcamc ;
            Z9948Ab_npzd = A9948Ab_npzd ;
            Z9949Ab_nl = A9949Ab_nl ;
            Z9950Ab_nmm1pes = A9950Ab_nmm1pes ;
            Z9951Ab_nmm2pes = A9951Ab_nmm2pes ;
            Z9952Ab_nmm3pes = A9952Ab_nmm3pes ;
            Z9953Ab_nmm1rt = A9953Ab_nmm1rt ;
            Z9954Ab_nmm2rt = A9954Ab_nmm2rt ;
            Z9955Ab_nmm3rt = A9955Ab_nmm3rt ;
            Z9956Ab_nmm4rt = A9956Ab_nmm4rt ;
            Z9957Ab_nmp = A9957Ab_nmp ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9940Ab_cod = A9940Ab_cod ;
         Z9941Ab_npdr = A9941Ab_npdr ;
         Z9942Ab_npdp = A9942Ab_npdp ;
         Z9958Ab_npzas = A9958Ab_npzas ;
         Z9959Ab_npzam = A9959Ab_npzam ;
         Z9943Ab_npzasc = A9943Ab_npzasc ;
         Z9944Ab_npzamc = A9944Ab_npzamc ;
         Z9945Ab_npzcam = A9945Ab_npzcam ;
         Z9946Ab_npzcam4 = A9946Ab_npzcam4 ;
         Z9947Ab_npzcamc = A9947Ab_npzcamc ;
         Z9948Ab_npzd = A9948Ab_npzd ;
         Z9949Ab_nl = A9949Ab_nl ;
         Z9950Ab_nmm1pes = A9950Ab_nmm1pes ;
         Z9951Ab_nmm2pes = A9951Ab_nmm2pes ;
         Z9952Ab_nmm3pes = A9952Ab_nmm3pes ;
         Z9953Ab_nmm1rt = A9953Ab_nmm1rt ;
         Z9954Ab_nmm2rt = A9954Ab_nmm2rt ;
         Z9955Ab_nmm3rt = A9955Ab_nmm3rt ;
         Z9956Ab_nmm4rt = A9956Ab_nmm4rt ;
         Z9957Ab_nmp = A9957Ab_nmp ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV35Pgmname = "TACTAB" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      /* Using cursor T015X4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015X4_A407EmprNom[0] ;
      n407EmprNom = T015X4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A9940Ab_cod = AV34Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
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

   public void load15X1321( )
   {
      /* Using cursor T015X5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9940Ab_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1321 = (short)(1) ;
         A407EmprNom = T015X5_A407EmprNom[0] ;
         n407EmprNom = T015X5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9941Ab_npdr = T015X5_A9941Ab_npdr[0] ;
         n9941Ab_npdr = T015X5_n9941Ab_npdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrimstr( A9941Ab_npdr, 9, 5));
         A9942Ab_npdp = T015X5_A9942Ab_npdp[0] ;
         n9942Ab_npdp = T015X5_n9942Ab_npdp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrimstr( A9942Ab_npdp, 9, 5));
         A9958Ab_npzas = T015X5_A9958Ab_npzas[0] ;
         n9958Ab_npzas = T015X5_n9958Ab_npzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrimstr( A9958Ab_npzas, 9, 5));
         A9959Ab_npzam = T015X5_A9959Ab_npzam[0] ;
         n9959Ab_npzam = T015X5_n9959Ab_npzam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrimstr( A9959Ab_npzam, 9, 5));
         A9943Ab_npzasc = T015X5_A9943Ab_npzasc[0] ;
         n9943Ab_npzasc = T015X5_n9943Ab_npzasc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrimstr( A9943Ab_npzasc, 9, 5));
         A9944Ab_npzamc = T015X5_A9944Ab_npzamc[0] ;
         n9944Ab_npzamc = T015X5_n9944Ab_npzamc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrimstr( A9944Ab_npzamc, 9, 5));
         A9945Ab_npzcam = T015X5_A9945Ab_npzcam[0] ;
         n9945Ab_npzcam = T015X5_n9945Ab_npzcam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrimstr( A9945Ab_npzcam, 9, 5));
         A9946Ab_npzcam4 = T015X5_A9946Ab_npzcam4[0] ;
         n9946Ab_npzcam4 = T015X5_n9946Ab_npzcam4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrimstr( A9946Ab_npzcam4, 9, 5));
         A9947Ab_npzcamc = T015X5_A9947Ab_npzcamc[0] ;
         n9947Ab_npzcamc = T015X5_n9947Ab_npzcamc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrimstr( A9947Ab_npzcamc, 9, 5));
         A9948Ab_npzd = T015X5_A9948Ab_npzd[0] ;
         n9948Ab_npzd = T015X5_n9948Ab_npzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrimstr( A9948Ab_npzd, 9, 5));
         A9949Ab_nl = T015X5_A9949Ab_nl[0] ;
         n9949Ab_nl = T015X5_n9949Ab_nl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrimstr( A9949Ab_nl, 9, 5));
         A9950Ab_nmm1pes = T015X5_A9950Ab_nmm1pes[0] ;
         n9950Ab_nmm1pes = T015X5_n9950Ab_nmm1pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrimstr( A9950Ab_nmm1pes, 9, 5));
         A9951Ab_nmm2pes = T015X5_A9951Ab_nmm2pes[0] ;
         n9951Ab_nmm2pes = T015X5_n9951Ab_nmm2pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrimstr( A9951Ab_nmm2pes, 9, 5));
         A9952Ab_nmm3pes = T015X5_A9952Ab_nmm3pes[0] ;
         n9952Ab_nmm3pes = T015X5_n9952Ab_nmm3pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrimstr( A9952Ab_nmm3pes, 9, 5));
         A9953Ab_nmm1rt = T015X5_A9953Ab_nmm1rt[0] ;
         n9953Ab_nmm1rt = T015X5_n9953Ab_nmm1rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrimstr( A9953Ab_nmm1rt, 9, 5));
         A9954Ab_nmm2rt = T015X5_A9954Ab_nmm2rt[0] ;
         n9954Ab_nmm2rt = T015X5_n9954Ab_nmm2rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrimstr( A9954Ab_nmm2rt, 9, 5));
         A9955Ab_nmm3rt = T015X5_A9955Ab_nmm3rt[0] ;
         n9955Ab_nmm3rt = T015X5_n9955Ab_nmm3rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrimstr( A9955Ab_nmm3rt, 9, 5));
         A9956Ab_nmm4rt = T015X5_A9956Ab_nmm4rt[0] ;
         n9956Ab_nmm4rt = T015X5_n9956Ab_nmm4rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrimstr( A9956Ab_nmm4rt, 9, 5));
         A9957Ab_nmp = T015X5_A9957Ab_nmp[0] ;
         n9957Ab_nmp = T015X5_n9957Ab_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrimstr( A9957Ab_nmp, 9, 5));
         zm15X1321( -3) ;
      }
      pr_default.close(3);
      onLoadActions15X1321( ) ;
   }

   public void onLoadActions15X1321( )
   {
   }

   public void checkExtendedTable15X1321( )
   {
      nIsDirty_1321 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A9940Ab_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "AB_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAb_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15X1321( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15X1321( )
   {
      /* Using cursor T015X6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A9940Ab_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1321 = (short)(1) ;
      }
      else
      {
         RcdFound1321 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9940Ab_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015X3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15X1321( 3) ;
         RcdFound1321 = (short)(1) ;
         A9940Ab_cod = T015X3_A9940Ab_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
         A9941Ab_npdr = T015X3_A9941Ab_npdr[0] ;
         n9941Ab_npdr = T015X3_n9941Ab_npdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrimstr( A9941Ab_npdr, 9, 5));
         A9942Ab_npdp = T015X3_A9942Ab_npdp[0] ;
         n9942Ab_npdp = T015X3_n9942Ab_npdp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrimstr( A9942Ab_npdp, 9, 5));
         A9958Ab_npzas = T015X3_A9958Ab_npzas[0] ;
         n9958Ab_npzas = T015X3_n9958Ab_npzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrimstr( A9958Ab_npzas, 9, 5));
         A9959Ab_npzam = T015X3_A9959Ab_npzam[0] ;
         n9959Ab_npzam = T015X3_n9959Ab_npzam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrimstr( A9959Ab_npzam, 9, 5));
         A9943Ab_npzasc = T015X3_A9943Ab_npzasc[0] ;
         n9943Ab_npzasc = T015X3_n9943Ab_npzasc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrimstr( A9943Ab_npzasc, 9, 5));
         A9944Ab_npzamc = T015X3_A9944Ab_npzamc[0] ;
         n9944Ab_npzamc = T015X3_n9944Ab_npzamc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrimstr( A9944Ab_npzamc, 9, 5));
         A9945Ab_npzcam = T015X3_A9945Ab_npzcam[0] ;
         n9945Ab_npzcam = T015X3_n9945Ab_npzcam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrimstr( A9945Ab_npzcam, 9, 5));
         A9946Ab_npzcam4 = T015X3_A9946Ab_npzcam4[0] ;
         n9946Ab_npzcam4 = T015X3_n9946Ab_npzcam4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrimstr( A9946Ab_npzcam4, 9, 5));
         A9947Ab_npzcamc = T015X3_A9947Ab_npzcamc[0] ;
         n9947Ab_npzcamc = T015X3_n9947Ab_npzcamc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrimstr( A9947Ab_npzcamc, 9, 5));
         A9948Ab_npzd = T015X3_A9948Ab_npzd[0] ;
         n9948Ab_npzd = T015X3_n9948Ab_npzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrimstr( A9948Ab_npzd, 9, 5));
         A9949Ab_nl = T015X3_A9949Ab_nl[0] ;
         n9949Ab_nl = T015X3_n9949Ab_nl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrimstr( A9949Ab_nl, 9, 5));
         A9950Ab_nmm1pes = T015X3_A9950Ab_nmm1pes[0] ;
         n9950Ab_nmm1pes = T015X3_n9950Ab_nmm1pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrimstr( A9950Ab_nmm1pes, 9, 5));
         A9951Ab_nmm2pes = T015X3_A9951Ab_nmm2pes[0] ;
         n9951Ab_nmm2pes = T015X3_n9951Ab_nmm2pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrimstr( A9951Ab_nmm2pes, 9, 5));
         A9952Ab_nmm3pes = T015X3_A9952Ab_nmm3pes[0] ;
         n9952Ab_nmm3pes = T015X3_n9952Ab_nmm3pes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrimstr( A9952Ab_nmm3pes, 9, 5));
         A9953Ab_nmm1rt = T015X3_A9953Ab_nmm1rt[0] ;
         n9953Ab_nmm1rt = T015X3_n9953Ab_nmm1rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrimstr( A9953Ab_nmm1rt, 9, 5));
         A9954Ab_nmm2rt = T015X3_A9954Ab_nmm2rt[0] ;
         n9954Ab_nmm2rt = T015X3_n9954Ab_nmm2rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrimstr( A9954Ab_nmm2rt, 9, 5));
         A9955Ab_nmm3rt = T015X3_A9955Ab_nmm3rt[0] ;
         n9955Ab_nmm3rt = T015X3_n9955Ab_nmm3rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrimstr( A9955Ab_nmm3rt, 9, 5));
         A9956Ab_nmm4rt = T015X3_A9956Ab_nmm4rt[0] ;
         n9956Ab_nmm4rt = T015X3_n9956Ab_nmm4rt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrimstr( A9956Ab_nmm4rt, 9, 5));
         A9957Ab_nmp = T015X3_A9957Ab_nmp[0] ;
         n9957Ab_nmp = T015X3_n9957Ab_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrimstr( A9957Ab_nmp, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z9940Ab_cod = A9940Ab_cod ;
         sMode1321 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15X1321( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1321 = (short)(0) ;
            initializeNonKey15X1321( ) ;
         }
         Gx_mode = sMode1321 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1321 = (short)(0) ;
         initializeNonKey15X1321( ) ;
         sMode1321 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1321 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey15X1321( ) ;
      if ( RcdFound1321 == 0 )
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
      RcdFound1321 = (short)(0) ;
      /* Using cursor T015X7 */
      pr_default.execute(5, new Object[] {A9940Ab_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015X7_A9940Ab_cod[0], A9940Ab_cod) < 0 ) ) && ( GXutil.strcmp(T015X7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015X7_A9940Ab_cod[0], A9940Ab_cod) > 0 ) ) && ( GXutil.strcmp(T015X7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9940Ab_cod = T015X7_A9940Ab_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
            RcdFound1321 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1321 = (short)(0) ;
      /* Using cursor T015X8 */
      pr_default.execute(6, new Object[] {A9940Ab_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015X8_A9940Ab_cod[0], A9940Ab_cod) > 0 ) ) && ( GXutil.strcmp(T015X8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015X8_A9940Ab_cod[0], A9940Ab_cod) < 0 ) ) && ( GXutil.strcmp(T015X8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9940Ab_cod = T015X8_A9940Ab_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
            RcdFound1321 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15X1321( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAb_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15X1321( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1321 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
            {
               A9940Ab_cod = Z9940Ab_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAb_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15X1321( ) ;
               GX_FocusControl = edtAb_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAb_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15X1321( ) ;
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
                  GX_FocusControl = edtAb_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15X1321( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
      {
         A9940Ab_cod = Z9940Ab_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAb_cod_Internalname ;
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
      getKey15X1321( ) ;
      if ( RcdFound1321 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
         {
            A9940Ab_cod = Z9940Ab_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9940Ab_cod, Z9940Ab_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactab");
      GX_FocusControl = edtAb_npdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15X0( ) ;
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
      if ( RcdFound1321 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAb_npdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15X1321( ) ;
      if ( RcdFound1321 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_npdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15X1321( ) ;
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
      if ( RcdFound1321 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_npdr_Internalname ;
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
      if ( RcdFound1321 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_npdr_Internalname ;
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
      scanStart15X1321( ) ;
      if ( RcdFound1321 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1321 != 0 )
         {
            scanNext15X1321( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAb_npdr_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15X1321( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15X1321( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9940Ab_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTAB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9941Ab_npdr, T015X2_A9941Ab_npdr[0]) != 0 ) || ( DecimalUtil.compareTo(Z9942Ab_npdp, T015X2_A9942Ab_npdp[0]) != 0 ) || ( DecimalUtil.compareTo(Z9958Ab_npzas, T015X2_A9958Ab_npzas[0]) != 0 ) || ( DecimalUtil.compareTo(Z9959Ab_npzam, T015X2_A9959Ab_npzam[0]) != 0 ) || ( DecimalUtil.compareTo(Z9943Ab_npzasc, T015X2_A9943Ab_npzasc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9944Ab_npzamc, T015X2_A9944Ab_npzamc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9945Ab_npzcam, T015X2_A9945Ab_npzcam[0]) != 0 ) || ( DecimalUtil.compareTo(Z9946Ab_npzcam4, T015X2_A9946Ab_npzcam4[0]) != 0 ) || ( DecimalUtil.compareTo(Z9947Ab_npzcamc, T015X2_A9947Ab_npzcamc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9948Ab_npzd, T015X2_A9948Ab_npzd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9949Ab_nl, T015X2_A9949Ab_nl[0]) != 0 ) || ( DecimalUtil.compareTo(Z9950Ab_nmm1pes, T015X2_A9950Ab_nmm1pes[0]) != 0 ) || ( DecimalUtil.compareTo(Z9951Ab_nmm2pes, T015X2_A9951Ab_nmm2pes[0]) != 0 ) || ( DecimalUtil.compareTo(Z9952Ab_nmm3pes, T015X2_A9952Ab_nmm3pes[0]) != 0 ) || ( DecimalUtil.compareTo(Z9953Ab_nmm1rt, T015X2_A9953Ab_nmm1rt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9954Ab_nmm2rt, T015X2_A9954Ab_nmm2rt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9955Ab_nmm3rt, T015X2_A9955Ab_nmm3rt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9956Ab_nmm4rt, T015X2_A9956Ab_nmm4rt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9957Ab_nmp, T015X2_A9957Ab_nmp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9941Ab_npdr, T015X2_A9941Ab_npdr[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npdr");
               GXutil.writeLogRaw("Old: ",Z9941Ab_npdr);
               GXutil.writeLogRaw("Current: ",T015X2_A9941Ab_npdr[0]);
            }
            if ( DecimalUtil.compareTo(Z9942Ab_npdp, T015X2_A9942Ab_npdp[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npdp");
               GXutil.writeLogRaw("Old: ",Z9942Ab_npdp);
               GXutil.writeLogRaw("Current: ",T015X2_A9942Ab_npdp[0]);
            }
            if ( DecimalUtil.compareTo(Z9958Ab_npzas, T015X2_A9958Ab_npzas[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzas");
               GXutil.writeLogRaw("Old: ",Z9958Ab_npzas);
               GXutil.writeLogRaw("Current: ",T015X2_A9958Ab_npzas[0]);
            }
            if ( DecimalUtil.compareTo(Z9959Ab_npzam, T015X2_A9959Ab_npzam[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzam");
               GXutil.writeLogRaw("Old: ",Z9959Ab_npzam);
               GXutil.writeLogRaw("Current: ",T015X2_A9959Ab_npzam[0]);
            }
            if ( DecimalUtil.compareTo(Z9943Ab_npzasc, T015X2_A9943Ab_npzasc[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzasc");
               GXutil.writeLogRaw("Old: ",Z9943Ab_npzasc);
               GXutil.writeLogRaw("Current: ",T015X2_A9943Ab_npzasc[0]);
            }
            if ( DecimalUtil.compareTo(Z9944Ab_npzamc, T015X2_A9944Ab_npzamc[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzamc");
               GXutil.writeLogRaw("Old: ",Z9944Ab_npzamc);
               GXutil.writeLogRaw("Current: ",T015X2_A9944Ab_npzamc[0]);
            }
            if ( DecimalUtil.compareTo(Z9945Ab_npzcam, T015X2_A9945Ab_npzcam[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzcam");
               GXutil.writeLogRaw("Old: ",Z9945Ab_npzcam);
               GXutil.writeLogRaw("Current: ",T015X2_A9945Ab_npzcam[0]);
            }
            if ( DecimalUtil.compareTo(Z9946Ab_npzcam4, T015X2_A9946Ab_npzcam4[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzcam4");
               GXutil.writeLogRaw("Old: ",Z9946Ab_npzcam4);
               GXutil.writeLogRaw("Current: ",T015X2_A9946Ab_npzcam4[0]);
            }
            if ( DecimalUtil.compareTo(Z9947Ab_npzcamc, T015X2_A9947Ab_npzcamc[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzcamc");
               GXutil.writeLogRaw("Old: ",Z9947Ab_npzcamc);
               GXutil.writeLogRaw("Current: ",T015X2_A9947Ab_npzcamc[0]);
            }
            if ( DecimalUtil.compareTo(Z9948Ab_npzd, T015X2_A9948Ab_npzd[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_npzd");
               GXutil.writeLogRaw("Old: ",Z9948Ab_npzd);
               GXutil.writeLogRaw("Current: ",T015X2_A9948Ab_npzd[0]);
            }
            if ( DecimalUtil.compareTo(Z9949Ab_nl, T015X2_A9949Ab_nl[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nl");
               GXutil.writeLogRaw("Old: ",Z9949Ab_nl);
               GXutil.writeLogRaw("Current: ",T015X2_A9949Ab_nl[0]);
            }
            if ( DecimalUtil.compareTo(Z9950Ab_nmm1pes, T015X2_A9950Ab_nmm1pes[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm1pes");
               GXutil.writeLogRaw("Old: ",Z9950Ab_nmm1pes);
               GXutil.writeLogRaw("Current: ",T015X2_A9950Ab_nmm1pes[0]);
            }
            if ( DecimalUtil.compareTo(Z9951Ab_nmm2pes, T015X2_A9951Ab_nmm2pes[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm2pes");
               GXutil.writeLogRaw("Old: ",Z9951Ab_nmm2pes);
               GXutil.writeLogRaw("Current: ",T015X2_A9951Ab_nmm2pes[0]);
            }
            if ( DecimalUtil.compareTo(Z9952Ab_nmm3pes, T015X2_A9952Ab_nmm3pes[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm3pes");
               GXutil.writeLogRaw("Old: ",Z9952Ab_nmm3pes);
               GXutil.writeLogRaw("Current: ",T015X2_A9952Ab_nmm3pes[0]);
            }
            if ( DecimalUtil.compareTo(Z9953Ab_nmm1rt, T015X2_A9953Ab_nmm1rt[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm1rt");
               GXutil.writeLogRaw("Old: ",Z9953Ab_nmm1rt);
               GXutil.writeLogRaw("Current: ",T015X2_A9953Ab_nmm1rt[0]);
            }
            if ( DecimalUtil.compareTo(Z9954Ab_nmm2rt, T015X2_A9954Ab_nmm2rt[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm2rt");
               GXutil.writeLogRaw("Old: ",Z9954Ab_nmm2rt);
               GXutil.writeLogRaw("Current: ",T015X2_A9954Ab_nmm2rt[0]);
            }
            if ( DecimalUtil.compareTo(Z9955Ab_nmm3rt, T015X2_A9955Ab_nmm3rt[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm3rt");
               GXutil.writeLogRaw("Old: ",Z9955Ab_nmm3rt);
               GXutil.writeLogRaw("Current: ",T015X2_A9955Ab_nmm3rt[0]);
            }
            if ( DecimalUtil.compareTo(Z9956Ab_nmm4rt, T015X2_A9956Ab_nmm4rt[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmm4rt");
               GXutil.writeLogRaw("Old: ",Z9956Ab_nmm4rt);
               GXutil.writeLogRaw("Current: ",T015X2_A9956Ab_nmm4rt[0]);
            }
            if ( DecimalUtil.compareTo(Z9957Ab_nmp, T015X2_A9957Ab_nmp[0]) != 0 )
            {
               GXutil.writeLogln("tactab:[seudo value changed for attri]"+"Ab_nmp");
               GXutil.writeLogRaw("Old: ",Z9957Ab_nmp);
               GXutil.writeLogRaw("Current: ",T015X2_A9957Ab_nmp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTAB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15X1321( )
   {
      beforeValidate15X1321( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15X1321( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15X1321( 0) ;
         checkOptimisticConcurrency15X1321( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15X1321( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15X1321( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015X9 */
                  pr_default.execute(7, new Object[] {A9940Ab_cod, Boolean.valueOf(n9941Ab_npdr), A9941Ab_npdr, Boolean.valueOf(n9942Ab_npdp), A9942Ab_npdp, Boolean.valueOf(n9958Ab_npzas), A9958Ab_npzas, Boolean.valueOf(n9959Ab_npzam), A9959Ab_npzam, Boolean.valueOf(n9943Ab_npzasc), A9943Ab_npzasc, Boolean.valueOf(n9944Ab_npzamc), A9944Ab_npzamc, Boolean.valueOf(n9945Ab_npzcam), A9945Ab_npzcam, Boolean.valueOf(n9946Ab_npzcam4), A9946Ab_npzcam4, Boolean.valueOf(n9947Ab_npzcamc), A9947Ab_npzcamc, Boolean.valueOf(n9948Ab_npzd), A9948Ab_npzd, Boolean.valueOf(n9949Ab_nl), A9949Ab_nl, Boolean.valueOf(n9950Ab_nmm1pes), A9950Ab_nmm1pes, Boolean.valueOf(n9951Ab_nmm2pes), A9951Ab_nmm2pes, Boolean.valueOf(n9952Ab_nmm3pes), A9952Ab_nmm3pes, Boolean.valueOf(n9953Ab_nmm1rt), A9953Ab_nmm1rt, Boolean.valueOf(n9954Ab_nmm2rt), A9954Ab_nmm2rt, Boolean.valueOf(n9955Ab_nmm3rt), A9955Ab_nmm3rt, Boolean.valueOf(n9956Ab_nmm4rt), A9956Ab_nmm4rt, Boolean.valueOf(n9957Ab_nmp), A9957Ab_nmp, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTAB");
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
                        resetCaption15X0( ) ;
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
            load15X1321( ) ;
         }
         endLevel15X1321( ) ;
      }
      closeExtendedTableCursors15X1321( ) ;
   }

   public void update15X1321( )
   {
      beforeValidate15X1321( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15X1321( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15X1321( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15X1321( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15X1321( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015X10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n9941Ab_npdr), A9941Ab_npdr, Boolean.valueOf(n9942Ab_npdp), A9942Ab_npdp, Boolean.valueOf(n9958Ab_npzas), A9958Ab_npzas, Boolean.valueOf(n9959Ab_npzam), A9959Ab_npzam, Boolean.valueOf(n9943Ab_npzasc), A9943Ab_npzasc, Boolean.valueOf(n9944Ab_npzamc), A9944Ab_npzamc, Boolean.valueOf(n9945Ab_npzcam), A9945Ab_npzcam, Boolean.valueOf(n9946Ab_npzcam4), A9946Ab_npzcam4, Boolean.valueOf(n9947Ab_npzcamc), A9947Ab_npzcamc, Boolean.valueOf(n9948Ab_npzd), A9948Ab_npzd, Boolean.valueOf(n9949Ab_nl), A9949Ab_nl, Boolean.valueOf(n9950Ab_nmm1pes), A9950Ab_nmm1pes, Boolean.valueOf(n9951Ab_nmm2pes), A9951Ab_nmm2pes, Boolean.valueOf(n9952Ab_nmm3pes), A9952Ab_nmm3pes, Boolean.valueOf(n9953Ab_nmm1rt), A9953Ab_nmm1rt, Boolean.valueOf(n9954Ab_nmm2rt), A9954Ab_nmm2rt, Boolean.valueOf(n9955Ab_nmm3rt), A9955Ab_nmm3rt, Boolean.valueOf(n9956Ab_nmm4rt), A9956Ab_nmm4rt, Boolean.valueOf(n9957Ab_nmp), A9957Ab_nmp, A396EmprCod, A9940Ab_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTAB");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTAB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15X1321( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption15X0( ) ;
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
         endLevel15X1321( ) ;
      }
      closeExtendedTableCursors15X1321( ) ;
   }

   public void deferredUpdate15X1321( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15X1321( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15X1321( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15X1321( ) ;
         afterConfirm15X1321( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15X1321( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015X11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A9940Ab_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTAB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1321 == 0 )
                     {
                        initAll15X1321( ) ;
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
                     resetCaption15X0( ) ;
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
      sMode1321 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15X1321( ) ;
      Gx_mode = sMode1321 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15X1321( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015X12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A9940Ab_cod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel15X1321( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15X1321( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactab");
         if ( AnyError == 0 )
         {
            confirmValues15X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactab");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15X1321( )
   {
      /* Scan By routine */
      /* Using cursor T015X13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1321 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1321 = (short)(1) ;
         A9940Ab_cod = T015X13_A9940Ab_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15X1321( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1321 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1321 = (short)(1) ;
         A9940Ab_cod = T015X13_A9940Ab_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
      }
   }

   public void scanEnd15X1321( )
   {
      pr_default.close(11);
   }

   public void afterConfirm15X1321( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15X1321( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15X1321( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15X1321( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15X1321( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15X1321( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15X1321( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAb_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_cod_Enabled), 5, 0), true);
      edtAb_npdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npdr_Enabled), 5, 0), true);
      edtAb_npdp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npdp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npdp_Enabled), 5, 0), true);
      edtAb_npzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzas_Enabled), 5, 0), true);
      edtAb_npzam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzam_Enabled), 5, 0), true);
      edtAb_npzasc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzasc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzasc_Enabled), 5, 0), true);
      edtAb_npzamc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzamc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzamc_Enabled), 5, 0), true);
      edtAb_npzcam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzcam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzcam_Enabled), 5, 0), true);
      edtAb_npzcam4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzcam4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzcam4_Enabled), 5, 0), true);
      edtAb_npzcamc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzcamc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzcamc_Enabled), 5, 0), true);
      edtAb_npzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_npzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_npzd_Enabled), 5, 0), true);
      edtAb_nl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nl_Enabled), 5, 0), true);
      edtAb_nmm1pes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm1pes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm1pes_Enabled), 5, 0), true);
      edtAb_nmm2pes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm2pes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm2pes_Enabled), 5, 0), true);
      edtAb_nmm3pes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm3pes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm3pes_Enabled), 5, 0), true);
      edtAb_nmm1rt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm1rt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm1rt_Enabled), 5, 0), true);
      edtAb_nmm2rt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm2rt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm2rt_Enabled), 5, 0), true);
      edtAb_nmm3rt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm3rt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm3rt_Enabled), 5, 0), true);
      edtAb_nmm4rt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmm4rt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmm4rt_Enabled), 5, 0), true);
      edtAb_nmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAb_nmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAb_nmp_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes15X1321( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues15X0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactab", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9940Ab_cod", GXutil.rtrim( Z9940Ab_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9941Ab_npdr", GXutil.ltrim( localUtil.ntoc( Z9941Ab_npdr, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9942Ab_npdp", GXutil.ltrim( localUtil.ntoc( Z9942Ab_npdp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9958Ab_npzas", GXutil.ltrim( localUtil.ntoc( Z9958Ab_npzas, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9959Ab_npzam", GXutil.ltrim( localUtil.ntoc( Z9959Ab_npzam, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9943Ab_npzasc", GXutil.ltrim( localUtil.ntoc( Z9943Ab_npzasc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9944Ab_npzamc", GXutil.ltrim( localUtil.ntoc( Z9944Ab_npzamc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9945Ab_npzcam", GXutil.ltrim( localUtil.ntoc( Z9945Ab_npzcam, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9946Ab_npzcam4", GXutil.ltrim( localUtil.ntoc( Z9946Ab_npzcam4, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9947Ab_npzcamc", GXutil.ltrim( localUtil.ntoc( Z9947Ab_npzcamc, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9948Ab_npzd", GXutil.ltrim( localUtil.ntoc( Z9948Ab_npzd, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9949Ab_nl", GXutil.ltrim( localUtil.ntoc( Z9949Ab_nl, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9950Ab_nmm1pes", GXutil.ltrim( localUtil.ntoc( Z9950Ab_nmm1pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9951Ab_nmm2pes", GXutil.ltrim( localUtil.ntoc( Z9951Ab_nmm2pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9952Ab_nmm3pes", GXutil.ltrim( localUtil.ntoc( Z9952Ab_nmm3pes, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9953Ab_nmm1rt", GXutil.ltrim( localUtil.ntoc( Z9953Ab_nmm1rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9954Ab_nmm2rt", GXutil.ltrim( localUtil.ntoc( Z9954Ab_nmm2rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9955Ab_nmm3rt", GXutil.ltrim( localUtil.ntoc( Z9955Ab_nmm3rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9956Ab_nmm4rt", GXutil.ltrim( localUtil.ntoc( Z9956Ab_nmm4rt, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9957Ab_nmp", GXutil.ltrim( localUtil.ntoc( Z9957Ab_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tactab", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTAB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO ACTIVIDAD ABRIR", "") ;
   }

   public void initializeNonKey15X1321( )
   {
      A9941Ab_npdr = DecimalUtil.ZERO ;
      n9941Ab_npdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrimstr( A9941Ab_npdr, 9, 5));
      A9942Ab_npdp = DecimalUtil.ZERO ;
      n9942Ab_npdp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrimstr( A9942Ab_npdp, 9, 5));
      A9958Ab_npzas = DecimalUtil.ZERO ;
      n9958Ab_npzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrimstr( A9958Ab_npzas, 9, 5));
      A9959Ab_npzam = DecimalUtil.ZERO ;
      n9959Ab_npzam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrimstr( A9959Ab_npzam, 9, 5));
      A9943Ab_npzasc = DecimalUtil.ZERO ;
      n9943Ab_npzasc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrimstr( A9943Ab_npzasc, 9, 5));
      A9944Ab_npzamc = DecimalUtil.ZERO ;
      n9944Ab_npzamc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrimstr( A9944Ab_npzamc, 9, 5));
      A9945Ab_npzcam = DecimalUtil.ZERO ;
      n9945Ab_npzcam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrimstr( A9945Ab_npzcam, 9, 5));
      A9946Ab_npzcam4 = DecimalUtil.ZERO ;
      n9946Ab_npzcam4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrimstr( A9946Ab_npzcam4, 9, 5));
      A9947Ab_npzcamc = DecimalUtil.ZERO ;
      n9947Ab_npzcamc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrimstr( A9947Ab_npzcamc, 9, 5));
      A9948Ab_npzd = DecimalUtil.ZERO ;
      n9948Ab_npzd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrimstr( A9948Ab_npzd, 9, 5));
      A9949Ab_nl = DecimalUtil.ZERO ;
      n9949Ab_nl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrimstr( A9949Ab_nl, 9, 5));
      A9950Ab_nmm1pes = DecimalUtil.ZERO ;
      n9950Ab_nmm1pes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrimstr( A9950Ab_nmm1pes, 9, 5));
      A9951Ab_nmm2pes = DecimalUtil.ZERO ;
      n9951Ab_nmm2pes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrimstr( A9951Ab_nmm2pes, 9, 5));
      A9952Ab_nmm3pes = DecimalUtil.ZERO ;
      n9952Ab_nmm3pes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrimstr( A9952Ab_nmm3pes, 9, 5));
      A9953Ab_nmm1rt = DecimalUtil.ZERO ;
      n9953Ab_nmm1rt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrimstr( A9953Ab_nmm1rt, 9, 5));
      A9954Ab_nmm2rt = DecimalUtil.ZERO ;
      n9954Ab_nmm2rt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrimstr( A9954Ab_nmm2rt, 9, 5));
      A9955Ab_nmm3rt = DecimalUtil.ZERO ;
      n9955Ab_nmm3rt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrimstr( A9955Ab_nmm3rt, 9, 5));
      A9956Ab_nmm4rt = DecimalUtil.ZERO ;
      n9956Ab_nmm4rt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrimstr( A9956Ab_nmm4rt, 9, 5));
      A9957Ab_nmp = DecimalUtil.ZERO ;
      n9957Ab_nmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrimstr( A9957Ab_nmp, 9, 5));
      Z9941Ab_npdr = DecimalUtil.ZERO ;
      Z9942Ab_npdp = DecimalUtil.ZERO ;
      Z9958Ab_npzas = DecimalUtil.ZERO ;
      Z9959Ab_npzam = DecimalUtil.ZERO ;
      Z9943Ab_npzasc = DecimalUtil.ZERO ;
      Z9944Ab_npzamc = DecimalUtil.ZERO ;
      Z9945Ab_npzcam = DecimalUtil.ZERO ;
      Z9946Ab_npzcam4 = DecimalUtil.ZERO ;
      Z9947Ab_npzcamc = DecimalUtil.ZERO ;
      Z9948Ab_npzd = DecimalUtil.ZERO ;
      Z9949Ab_nl = DecimalUtil.ZERO ;
      Z9950Ab_nmm1pes = DecimalUtil.ZERO ;
      Z9951Ab_nmm2pes = DecimalUtil.ZERO ;
      Z9952Ab_nmm3pes = DecimalUtil.ZERO ;
      Z9953Ab_nmm1rt = DecimalUtil.ZERO ;
      Z9954Ab_nmm2rt = DecimalUtil.ZERO ;
      Z9955Ab_nmm3rt = DecimalUtil.ZERO ;
      Z9956Ab_nmm4rt = DecimalUtil.ZERO ;
      Z9957Ab_nmp = DecimalUtil.ZERO ;
   }

   public void initAll15X1321( )
   {
      A9940Ab_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9940Ab_cod", A9940Ab_cod);
      initializeNonKey15X1321( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241543656", true, true);
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
      httpContext.AddJavascriptSource("tactab.js", "?20268241543656", false, true);
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
      edtAb_cod_Internalname = "AB_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAb_npdr_Internalname = "AB_NPDR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAb_npdp_Internalname = "AB_NPDP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAb_npzas_Internalname = "AB_NPZAS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtAb_npzam_Internalname = "AB_NPZAM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAb_npzasc_Internalname = "AB_NPZASC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAb_npzamc_Internalname = "AB_NPZAMC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAb_npzcam_Internalname = "AB_NPZCAM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAb_npzcam4_Internalname = "AB_NPZCAM4" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAb_npzcamc_Internalname = "AB_NPZCAMC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAb_npzd_Internalname = "AB_NPZD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAb_nl_Internalname = "AB_NL" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtAb_nmm1pes_Internalname = "AB_NMM1PES" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAb_nmm2pes_Internalname = "AB_NMM2PES" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAb_nmm3pes_Internalname = "AB_NMM3PES" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAb_nmm1rt_Internalname = "AB_NMM1RT" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtAb_nmm2rt_Internalname = "AB_NMM2RT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtAb_nmm3rt_Internalname = "AB_NMM3RT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAb_nmm4rt_Internalname = "AB_NMM4RT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAb_nmp_Internalname = "AB_NMP" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO ACTIVIDAD ABRIR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAb_nmp_Jsonclick = "" ;
      edtAb_nmp_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmp_Enabled = 1 ;
      edtAb_nmm4rt_Jsonclick = "" ;
      edtAb_nmm4rt_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm4rt_Enabled = 1 ;
      edtAb_nmm3rt_Jsonclick = "" ;
      edtAb_nmm3rt_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm3rt_Enabled = 1 ;
      edtAb_nmm2rt_Jsonclick = "" ;
      edtAb_nmm2rt_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm2rt_Enabled = 1 ;
      edtAb_nmm1rt_Jsonclick = "" ;
      edtAb_nmm1rt_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm1rt_Enabled = 1 ;
      edtAb_nmm3pes_Jsonclick = "" ;
      edtAb_nmm3pes_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm3pes_Enabled = 1 ;
      edtAb_nmm2pes_Jsonclick = "" ;
      edtAb_nmm2pes_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm2pes_Enabled = 1 ;
      edtAb_nmm1pes_Jsonclick = "" ;
      edtAb_nmm1pes_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nmm1pes_Enabled = 1 ;
      edtAb_nl_Jsonclick = "" ;
      edtAb_nl_Backcolor = (int)(0xFFFFFF) ;
      edtAb_nl_Enabled = 1 ;
      edtAb_npzd_Jsonclick = "" ;
      edtAb_npzd_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzd_Enabled = 1 ;
      edtAb_npzcamc_Jsonclick = "" ;
      edtAb_npzcamc_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzcamc_Enabled = 1 ;
      edtAb_npzcam4_Jsonclick = "" ;
      edtAb_npzcam4_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzcam4_Enabled = 1 ;
      edtAb_npzcam_Jsonclick = "" ;
      edtAb_npzcam_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzcam_Enabled = 1 ;
      edtAb_npzamc_Jsonclick = "" ;
      edtAb_npzamc_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzamc_Enabled = 1 ;
      edtAb_npzasc_Jsonclick = "" ;
      edtAb_npzasc_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzasc_Enabled = 1 ;
      edtAb_npzam_Jsonclick = "" ;
      edtAb_npzam_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzam_Enabled = 1 ;
      edtAb_npzas_Jsonclick = "" ;
      edtAb_npzas_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npzas_Enabled = 1 ;
      edtAb_npdp_Jsonclick = "" ;
      edtAb_npdp_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npdp_Enabled = 1 ;
      edtAb_npdr_Jsonclick = "" ;
      edtAb_npdr_Backcolor = (int)(0xFFFFFF) ;
      edtAb_npdr_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAb_cod_Jsonclick = "" ;
      edtAb_cod_Backcolor = (int)(0xFFFFFF) ;
      edtAb_cod_Enabled = 1 ;
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
      /* Using cursor T015X14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015X14_A407EmprNom[0] ;
      n407EmprNom = T015X14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      GX_FocusControl = edtAb_npdr_Internalname ;
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

   public void valid_Ab_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A9940Ab_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "AB_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAb_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9941Ab_npdr", GXutil.ltrim( localUtil.ntoc( A9941Ab_npdr, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9942Ab_npdp", GXutil.ltrim( localUtil.ntoc( A9942Ab_npdp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9958Ab_npzas", GXutil.ltrim( localUtil.ntoc( A9958Ab_npzas, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9959Ab_npzam", GXutil.ltrim( localUtil.ntoc( A9959Ab_npzam, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9943Ab_npzasc", GXutil.ltrim( localUtil.ntoc( A9943Ab_npzasc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9944Ab_npzamc", GXutil.ltrim( localUtil.ntoc( A9944Ab_npzamc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9945Ab_npzcam", GXutil.ltrim( localUtil.ntoc( A9945Ab_npzcam, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9946Ab_npzcam4", GXutil.ltrim( localUtil.ntoc( A9946Ab_npzcam4, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9947Ab_npzcamc", GXutil.ltrim( localUtil.ntoc( A9947Ab_npzcamc, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9948Ab_npzd", GXutil.ltrim( localUtil.ntoc( A9948Ab_npzd, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9949Ab_nl", GXutil.ltrim( localUtil.ntoc( A9949Ab_nl, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9950Ab_nmm1pes", GXutil.ltrim( localUtil.ntoc( A9950Ab_nmm1pes, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9951Ab_nmm2pes", GXutil.ltrim( localUtil.ntoc( A9951Ab_nmm2pes, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9952Ab_nmm3pes", GXutil.ltrim( localUtil.ntoc( A9952Ab_nmm3pes, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9953Ab_nmm1rt", GXutil.ltrim( localUtil.ntoc( A9953Ab_nmm1rt, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9954Ab_nmm2rt", GXutil.ltrim( localUtil.ntoc( A9954Ab_nmm2rt, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9955Ab_nmm3rt", GXutil.ltrim( localUtil.ntoc( A9955Ab_nmm3rt, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9956Ab_nmm4rt", GXutil.ltrim( localUtil.ntoc( A9956Ab_nmm4rt, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9957Ab_nmp", GXutil.ltrim( localUtil.ntoc( A9957Ab_nmp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9940Ab_cod", GXutil.rtrim( Z9940Ab_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9941Ab_npdr", GXutil.ltrim( localUtil.ntoc( Z9941Ab_npdr, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9942Ab_npdp", GXutil.ltrim( localUtil.ntoc( Z9942Ab_npdp, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9958Ab_npzas", GXutil.ltrim( localUtil.ntoc( Z9958Ab_npzas, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9959Ab_npzam", GXutil.ltrim( localUtil.ntoc( Z9959Ab_npzam, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9943Ab_npzasc", GXutil.ltrim( localUtil.ntoc( Z9943Ab_npzasc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9944Ab_npzamc", GXutil.ltrim( localUtil.ntoc( Z9944Ab_npzamc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9945Ab_npzcam", GXutil.ltrim( localUtil.ntoc( Z9945Ab_npzcam, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9946Ab_npzcam4", GXutil.ltrim( localUtil.ntoc( Z9946Ab_npzcam4, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9947Ab_npzcamc", GXutil.ltrim( localUtil.ntoc( Z9947Ab_npzcamc, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9948Ab_npzd", GXutil.ltrim( localUtil.ntoc( Z9948Ab_npzd, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9949Ab_nl", GXutil.ltrim( localUtil.ntoc( Z9949Ab_nl, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9950Ab_nmm1pes", GXutil.ltrim( localUtil.ntoc( Z9950Ab_nmm1pes, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9951Ab_nmm2pes", GXutil.ltrim( localUtil.ntoc( Z9951Ab_nmm2pes, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9952Ab_nmm3pes", GXutil.ltrim( localUtil.ntoc( Z9952Ab_nmm3pes, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9953Ab_nmm1rt", GXutil.ltrim( localUtil.ntoc( Z9953Ab_nmm1rt, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9954Ab_nmm2rt", GXutil.ltrim( localUtil.ntoc( Z9954Ab_nmm2rt, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9955Ab_nmm3rt", GXutil.ltrim( localUtil.ntoc( Z9955Ab_nmm3rt, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9956Ab_nmm4rt", GXutil.ltrim( localUtil.ntoc( Z9956Ab_nmm4rt, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9957Ab_nmp", GXutil.ltrim( localUtil.ntoc( Z9957Ab_nmp, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_AB_COD","{handler:'valid_Ab_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9940Ab_cod',fld:'AB_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV34Codigo',fld:'vCODIGO',pic:''}]");
      setEventMetadata("VALID_AB_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9941Ab_npdr',fld:'AB_NPDR',pic:'ZZ9.99999'},{av:'A9942Ab_npdp',fld:'AB_NPDP',pic:'ZZ9.99999'},{av:'A9958Ab_npzas',fld:'AB_NPZAS',pic:'ZZ9.99999'},{av:'A9959Ab_npzam',fld:'AB_NPZAM',pic:'ZZ9.99999'},{av:'A9943Ab_npzasc',fld:'AB_NPZASC',pic:'ZZ9.99999'},{av:'A9944Ab_npzamc',fld:'AB_NPZAMC',pic:'ZZ9.99999'},{av:'A9945Ab_npzcam',fld:'AB_NPZCAM',pic:'ZZ9.99999'},{av:'A9946Ab_npzcam4',fld:'AB_NPZCAM4',pic:'ZZ9.99999'},{av:'A9947Ab_npzcamc',fld:'AB_NPZCAMC',pic:'ZZ9.99999'},{av:'A9948Ab_npzd',fld:'AB_NPZD',pic:'ZZ9.99999'},{av:'A9949Ab_nl',fld:'AB_NL',pic:'ZZ9.99999'},{av:'A9950Ab_nmm1pes',fld:'AB_NMM1PES',pic:'ZZ9.99999'},{av:'A9951Ab_nmm2pes',fld:'AB_NMM2PES',pic:'ZZ9.99999'},{av:'A9952Ab_nmm3pes',fld:'AB_NMM3PES',pic:'ZZ9.99999'},{av:'A9953Ab_nmm1rt',fld:'AB_NMM1RT',pic:'ZZ9.99999'},{av:'A9954Ab_nmm2rt',fld:'AB_NMM2RT',pic:'ZZ9.99999'},{av:'A9955Ab_nmm3rt',fld:'AB_NMM3RT',pic:'ZZ9.99999'},{av:'A9956Ab_nmm4rt',fld:'AB_NMM4RT',pic:'ZZ9.99999'},{av:'A9957Ab_nmp',fld:'AB_NMP',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9940Ab_cod'},{av:'Z407EmprNom'},{av:'Z9941Ab_npdr'},{av:'Z9942Ab_npdp'},{av:'Z9958Ab_npzas'},{av:'Z9959Ab_npzam'},{av:'Z9943Ab_npzasc'},{av:'Z9944Ab_npzamc'},{av:'Z9945Ab_npzcam'},{av:'Z9946Ab_npzcam4'},{av:'Z9947Ab_npzcamc'},{av:'Z9948Ab_npzd'},{av:'Z9949Ab_nl'},{av:'Z9950Ab_nmm1pes'},{av:'Z9951Ab_nmm2pes'},{av:'Z9952Ab_nmm3pes'},{av:'Z9953Ab_nmm1rt'},{av:'Z9954Ab_nmm2rt'},{av:'Z9955Ab_nmm3rt'},{av:'Z9956Ab_nmm4rt'},{av:'Z9957Ab_nmp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z9940Ab_cod = "" ;
      Z9941Ab_npdr = DecimalUtil.ZERO ;
      Z9942Ab_npdp = DecimalUtil.ZERO ;
      Z9958Ab_npzas = DecimalUtil.ZERO ;
      Z9959Ab_npzam = DecimalUtil.ZERO ;
      Z9943Ab_npzasc = DecimalUtil.ZERO ;
      Z9944Ab_npzamc = DecimalUtil.ZERO ;
      Z9945Ab_npzcam = DecimalUtil.ZERO ;
      Z9946Ab_npzcam4 = DecimalUtil.ZERO ;
      Z9947Ab_npzcamc = DecimalUtil.ZERO ;
      Z9948Ab_npzd = DecimalUtil.ZERO ;
      Z9949Ab_nl = DecimalUtil.ZERO ;
      Z9950Ab_nmm1pes = DecimalUtil.ZERO ;
      Z9951Ab_nmm2pes = DecimalUtil.ZERO ;
      Z9952Ab_nmm3pes = DecimalUtil.ZERO ;
      Z9953Ab_nmm1rt = DecimalUtil.ZERO ;
      Z9954Ab_nmm2rt = DecimalUtil.ZERO ;
      Z9955Ab_nmm3rt = DecimalUtil.ZERO ;
      Z9956Ab_nmm4rt = DecimalUtil.ZERO ;
      Z9957Ab_nmp = DecimalUtil.ZERO ;
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
      A9940Ab_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A9941Ab_npdr = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A9942Ab_npdp = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A9958Ab_npzas = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A9959Ab_npzam = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A9943Ab_npzasc = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A9944Ab_npzamc = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A9945Ab_npzcam = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A9946Ab_npzcam4 = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A9947Ab_npzcamc = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A9948Ab_npzd = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A9949Ab_nl = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A9950Ab_nmm1pes = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A9951Ab_nmm2pes = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A9952Ab_nmm3pes = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A9953Ab_nmm1rt = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A9954Ab_nmm2rt = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A9955Ab_nmm3rt = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A9956Ab_nmm4rt = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A9957Ab_nmp = DecimalUtil.ZERO ;
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
      T015X4_A407EmprNom = new String[] {""} ;
      T015X4_n407EmprNom = new boolean[] {false} ;
      T015X5_A9940Ab_cod = new String[] {""} ;
      T015X5_A407EmprNom = new String[] {""} ;
      T015X5_n407EmprNom = new boolean[] {false} ;
      T015X5_A9941Ab_npdr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9941Ab_npdr = new boolean[] {false} ;
      T015X5_A9942Ab_npdp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9942Ab_npdp = new boolean[] {false} ;
      T015X5_A9958Ab_npzas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9958Ab_npzas = new boolean[] {false} ;
      T015X5_A9959Ab_npzam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9959Ab_npzam = new boolean[] {false} ;
      T015X5_A9943Ab_npzasc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9943Ab_npzasc = new boolean[] {false} ;
      T015X5_A9944Ab_npzamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9944Ab_npzamc = new boolean[] {false} ;
      T015X5_A9945Ab_npzcam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9945Ab_npzcam = new boolean[] {false} ;
      T015X5_A9946Ab_npzcam4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9946Ab_npzcam4 = new boolean[] {false} ;
      T015X5_A9947Ab_npzcamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9947Ab_npzcamc = new boolean[] {false} ;
      T015X5_A9948Ab_npzd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9948Ab_npzd = new boolean[] {false} ;
      T015X5_A9949Ab_nl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9949Ab_nl = new boolean[] {false} ;
      T015X5_A9950Ab_nmm1pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9950Ab_nmm1pes = new boolean[] {false} ;
      T015X5_A9951Ab_nmm2pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9951Ab_nmm2pes = new boolean[] {false} ;
      T015X5_A9952Ab_nmm3pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9952Ab_nmm3pes = new boolean[] {false} ;
      T015X5_A9953Ab_nmm1rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9953Ab_nmm1rt = new boolean[] {false} ;
      T015X5_A9954Ab_nmm2rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9954Ab_nmm2rt = new boolean[] {false} ;
      T015X5_A9955Ab_nmm3rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9955Ab_nmm3rt = new boolean[] {false} ;
      T015X5_A9956Ab_nmm4rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9956Ab_nmm4rt = new boolean[] {false} ;
      T015X5_A9957Ab_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X5_n9957Ab_nmp = new boolean[] {false} ;
      T015X5_A396EmprCod = new String[] {""} ;
      T015X6_A396EmprCod = new String[] {""} ;
      T015X6_A9940Ab_cod = new String[] {""} ;
      T015X3_A9940Ab_cod = new String[] {""} ;
      T015X3_A9941Ab_npdr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9941Ab_npdr = new boolean[] {false} ;
      T015X3_A9942Ab_npdp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9942Ab_npdp = new boolean[] {false} ;
      T015X3_A9958Ab_npzas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9958Ab_npzas = new boolean[] {false} ;
      T015X3_A9959Ab_npzam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9959Ab_npzam = new boolean[] {false} ;
      T015X3_A9943Ab_npzasc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9943Ab_npzasc = new boolean[] {false} ;
      T015X3_A9944Ab_npzamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9944Ab_npzamc = new boolean[] {false} ;
      T015X3_A9945Ab_npzcam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9945Ab_npzcam = new boolean[] {false} ;
      T015X3_A9946Ab_npzcam4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9946Ab_npzcam4 = new boolean[] {false} ;
      T015X3_A9947Ab_npzcamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9947Ab_npzcamc = new boolean[] {false} ;
      T015X3_A9948Ab_npzd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9948Ab_npzd = new boolean[] {false} ;
      T015X3_A9949Ab_nl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9949Ab_nl = new boolean[] {false} ;
      T015X3_A9950Ab_nmm1pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9950Ab_nmm1pes = new boolean[] {false} ;
      T015X3_A9951Ab_nmm2pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9951Ab_nmm2pes = new boolean[] {false} ;
      T015X3_A9952Ab_nmm3pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9952Ab_nmm3pes = new boolean[] {false} ;
      T015X3_A9953Ab_nmm1rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9953Ab_nmm1rt = new boolean[] {false} ;
      T015X3_A9954Ab_nmm2rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9954Ab_nmm2rt = new boolean[] {false} ;
      T015X3_A9955Ab_nmm3rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9955Ab_nmm3rt = new boolean[] {false} ;
      T015X3_A9956Ab_nmm4rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9956Ab_nmm4rt = new boolean[] {false} ;
      T015X3_A9957Ab_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X3_n9957Ab_nmp = new boolean[] {false} ;
      T015X3_A396EmprCod = new String[] {""} ;
      sMode1321 = "" ;
      T015X7_A396EmprCod = new String[] {""} ;
      T015X7_A9940Ab_cod = new String[] {""} ;
      T015X8_A396EmprCod = new String[] {""} ;
      T015X8_A9940Ab_cod = new String[] {""} ;
      T015X2_A9940Ab_cod = new String[] {""} ;
      T015X2_A9941Ab_npdr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9941Ab_npdr = new boolean[] {false} ;
      T015X2_A9942Ab_npdp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9942Ab_npdp = new boolean[] {false} ;
      T015X2_A9958Ab_npzas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9958Ab_npzas = new boolean[] {false} ;
      T015X2_A9959Ab_npzam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9959Ab_npzam = new boolean[] {false} ;
      T015X2_A9943Ab_npzasc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9943Ab_npzasc = new boolean[] {false} ;
      T015X2_A9944Ab_npzamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9944Ab_npzamc = new boolean[] {false} ;
      T015X2_A9945Ab_npzcam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9945Ab_npzcam = new boolean[] {false} ;
      T015X2_A9946Ab_npzcam4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9946Ab_npzcam4 = new boolean[] {false} ;
      T015X2_A9947Ab_npzcamc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9947Ab_npzcamc = new boolean[] {false} ;
      T015X2_A9948Ab_npzd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9948Ab_npzd = new boolean[] {false} ;
      T015X2_A9949Ab_nl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9949Ab_nl = new boolean[] {false} ;
      T015X2_A9950Ab_nmm1pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9950Ab_nmm1pes = new boolean[] {false} ;
      T015X2_A9951Ab_nmm2pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9951Ab_nmm2pes = new boolean[] {false} ;
      T015X2_A9952Ab_nmm3pes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9952Ab_nmm3pes = new boolean[] {false} ;
      T015X2_A9953Ab_nmm1rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9953Ab_nmm1rt = new boolean[] {false} ;
      T015X2_A9954Ab_nmm2rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9954Ab_nmm2rt = new boolean[] {false} ;
      T015X2_A9955Ab_nmm3rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9955Ab_nmm3rt = new boolean[] {false} ;
      T015X2_A9956Ab_nmm4rt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9956Ab_nmm4rt = new boolean[] {false} ;
      T015X2_A9957Ab_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015X2_n9957Ab_nmp = new boolean[] {false} ;
      T015X2_A396EmprCod = new String[] {""} ;
      T015X12_A396EmprCod = new String[] {""} ;
      T015X12_A129BarCod = new int[1] ;
      T015X12_A132BarCodReo = new byte[1] ;
      T015X12_A130BarCodPar = new String[] {""} ;
      T015X12_A758ProCod = new String[] {""} ;
      T015X12_A194BarOrdLin = new short[1] ;
      T015X12_A9940Ab_cod = new String[] {""} ;
      T015X13_A396EmprCod = new String[] {""} ;
      T015X13_A9940Ab_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T015X14_A407EmprNom = new String[] {""} ;
      T015X14_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9940Ab_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9941Ab_npdr = DecimalUtil.ZERO ;
      ZZ9942Ab_npdp = DecimalUtil.ZERO ;
      ZZ9958Ab_npzas = DecimalUtil.ZERO ;
      ZZ9959Ab_npzam = DecimalUtil.ZERO ;
      ZZ9943Ab_npzasc = DecimalUtil.ZERO ;
      ZZ9944Ab_npzamc = DecimalUtil.ZERO ;
      ZZ9945Ab_npzcam = DecimalUtil.ZERO ;
      ZZ9946Ab_npzcam4 = DecimalUtil.ZERO ;
      ZZ9947Ab_npzcamc = DecimalUtil.ZERO ;
      ZZ9948Ab_npzd = DecimalUtil.ZERO ;
      ZZ9949Ab_nl = DecimalUtil.ZERO ;
      ZZ9950Ab_nmm1pes = DecimalUtil.ZERO ;
      ZZ9951Ab_nmm2pes = DecimalUtil.ZERO ;
      ZZ9952Ab_nmm3pes = DecimalUtil.ZERO ;
      ZZ9953Ab_nmm1rt = DecimalUtil.ZERO ;
      ZZ9954Ab_nmm2rt = DecimalUtil.ZERO ;
      ZZ9955Ab_nmm3rt = DecimalUtil.ZERO ;
      ZZ9956Ab_nmm4rt = DecimalUtil.ZERO ;
      ZZ9957Ab_nmp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactab__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactab__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactab__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactab__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactab__default(),
         new Object[] {
             new Object[] {
            T015X2_A9940Ab_cod, T015X2_A9941Ab_npdr, T015X2_n9941Ab_npdr, T015X2_A9942Ab_npdp, T015X2_n9942Ab_npdp, T015X2_A9958Ab_npzas, T015X2_n9958Ab_npzas, T015X2_A9959Ab_npzam, T015X2_n9959Ab_npzam, T015X2_A9943Ab_npzasc,
            T015X2_n9943Ab_npzasc, T015X2_A9944Ab_npzamc, T015X2_n9944Ab_npzamc, T015X2_A9945Ab_npzcam, T015X2_n9945Ab_npzcam, T015X2_A9946Ab_npzcam4, T015X2_n9946Ab_npzcam4, T015X2_A9947Ab_npzcamc, T015X2_n9947Ab_npzcamc, T015X2_A9948Ab_npzd,
            T015X2_n9948Ab_npzd, T015X2_A9949Ab_nl, T015X2_n9949Ab_nl, T015X2_A9950Ab_nmm1pes, T015X2_n9950Ab_nmm1pes, T015X2_A9951Ab_nmm2pes, T015X2_n9951Ab_nmm2pes, T015X2_A9952Ab_nmm3pes, T015X2_n9952Ab_nmm3pes, T015X2_A9953Ab_nmm1rt,
            T015X2_n9953Ab_nmm1rt, T015X2_A9954Ab_nmm2rt, T015X2_n9954Ab_nmm2rt, T015X2_A9955Ab_nmm3rt, T015X2_n9955Ab_nmm3rt, T015X2_A9956Ab_nmm4rt, T015X2_n9956Ab_nmm4rt, T015X2_A9957Ab_nmp, T015X2_n9957Ab_nmp, T015X2_A396EmprCod
            }
            , new Object[] {
            T015X3_A9940Ab_cod, T015X3_A9941Ab_npdr, T015X3_n9941Ab_npdr, T015X3_A9942Ab_npdp, T015X3_n9942Ab_npdp, T015X3_A9958Ab_npzas, T015X3_n9958Ab_npzas, T015X3_A9959Ab_npzam, T015X3_n9959Ab_npzam, T015X3_A9943Ab_npzasc,
            T015X3_n9943Ab_npzasc, T015X3_A9944Ab_npzamc, T015X3_n9944Ab_npzamc, T015X3_A9945Ab_npzcam, T015X3_n9945Ab_npzcam, T015X3_A9946Ab_npzcam4, T015X3_n9946Ab_npzcam4, T015X3_A9947Ab_npzcamc, T015X3_n9947Ab_npzcamc, T015X3_A9948Ab_npzd,
            T015X3_n9948Ab_npzd, T015X3_A9949Ab_nl, T015X3_n9949Ab_nl, T015X3_A9950Ab_nmm1pes, T015X3_n9950Ab_nmm1pes, T015X3_A9951Ab_nmm2pes, T015X3_n9951Ab_nmm2pes, T015X3_A9952Ab_nmm3pes, T015X3_n9952Ab_nmm3pes, T015X3_A9953Ab_nmm1rt,
            T015X3_n9953Ab_nmm1rt, T015X3_A9954Ab_nmm2rt, T015X3_n9954Ab_nmm2rt, T015X3_A9955Ab_nmm3rt, T015X3_n9955Ab_nmm3rt, T015X3_A9956Ab_nmm4rt, T015X3_n9956Ab_nmm4rt, T015X3_A9957Ab_nmp, T015X3_n9957Ab_nmp, T015X3_A396EmprCod
            }
            , new Object[] {
            T015X4_A407EmprNom, T015X4_n407EmprNom
            }
            , new Object[] {
            T015X5_A9940Ab_cod, T015X5_A407EmprNom, T015X5_n407EmprNom, T015X5_A9941Ab_npdr, T015X5_n9941Ab_npdr, T015X5_A9942Ab_npdp, T015X5_n9942Ab_npdp, T015X5_A9958Ab_npzas, T015X5_n9958Ab_npzas, T015X5_A9959Ab_npzam,
            T015X5_n9959Ab_npzam, T015X5_A9943Ab_npzasc, T015X5_n9943Ab_npzasc, T015X5_A9944Ab_npzamc, T015X5_n9944Ab_npzamc, T015X5_A9945Ab_npzcam, T015X5_n9945Ab_npzcam, T015X5_A9946Ab_npzcam4, T015X5_n9946Ab_npzcam4, T015X5_A9947Ab_npzcamc,
            T015X5_n9947Ab_npzcamc, T015X5_A9948Ab_npzd, T015X5_n9948Ab_npzd, T015X5_A9949Ab_nl, T015X5_n9949Ab_nl, T015X5_A9950Ab_nmm1pes, T015X5_n9950Ab_nmm1pes, T015X5_A9951Ab_nmm2pes, T015X5_n9951Ab_nmm2pes, T015X5_A9952Ab_nmm3pes,
            T015X5_n9952Ab_nmm3pes, T015X5_A9953Ab_nmm1rt, T015X5_n9953Ab_nmm1rt, T015X5_A9954Ab_nmm2rt, T015X5_n9954Ab_nmm2rt, T015X5_A9955Ab_nmm3rt, T015X5_n9955Ab_nmm3rt, T015X5_A9956Ab_nmm4rt, T015X5_n9956Ab_nmm4rt, T015X5_A9957Ab_nmp,
            T015X5_n9957Ab_nmp, T015X5_A396EmprCod
            }
            , new Object[] {
            T015X6_A396EmprCod, T015X6_A9940Ab_cod
            }
            , new Object[] {
            T015X7_A396EmprCod, T015X7_A9940Ab_cod
            }
            , new Object[] {
            T015X8_A396EmprCod, T015X8_A9940Ab_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015X12_A396EmprCod, T015X12_A129BarCod, T015X12_A132BarCodReo, T015X12_A130BarCodPar, T015X12_A758ProCod, T015X12_A194BarOrdLin, T015X12_A9940Ab_cod
            }
            , new Object[] {
            T015X13_A396EmprCod, T015X13_A9940Ab_cod
            }
            , new Object[] {
            T015X14_A407EmprNom, T015X14_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TACTAB" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1321 ;
   private short nIsDirty_1321 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAb_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAb_npdr_Enabled ;
   private int edtAb_npdp_Enabled ;
   private int edtAb_npzas_Enabled ;
   private int edtAb_npzam_Enabled ;
   private int edtAb_npzasc_Enabled ;
   private int edtAb_npzamc_Enabled ;
   private int edtAb_npzcam_Enabled ;
   private int edtAb_npzcam4_Enabled ;
   private int edtAb_npzcamc_Enabled ;
   private int edtAb_npzd_Enabled ;
   private int edtAb_nl_Enabled ;
   private int edtAb_nmm1pes_Enabled ;
   private int edtAb_nmm2pes_Enabled ;
   private int edtAb_nmm3pes_Enabled ;
   private int edtAb_nmm1rt_Enabled ;
   private int edtAb_nmm2rt_Enabled ;
   private int edtAb_nmm3rt_Enabled ;
   private int edtAb_nmm4rt_Enabled ;
   private int edtAb_nmp_Enabled ;
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
   private int edtAb_nmp_Backcolor ;
   private int edtAb_nmm4rt_Backcolor ;
   private int edtAb_nmm3rt_Backcolor ;
   private int edtAb_nmm2rt_Backcolor ;
   private int edtAb_nmm1rt_Backcolor ;
   private int edtAb_nmm3pes_Backcolor ;
   private int edtAb_nmm2pes_Backcolor ;
   private int edtAb_nmm1pes_Backcolor ;
   private int edtAb_nl_Backcolor ;
   private int edtAb_npzd_Backcolor ;
   private int edtAb_npzcamc_Backcolor ;
   private int edtAb_npzcam4_Backcolor ;
   private int edtAb_npzcam_Backcolor ;
   private int edtAb_npzamc_Backcolor ;
   private int edtAb_npzasc_Backcolor ;
   private int edtAb_npzam_Backcolor ;
   private int edtAb_npzas_Backcolor ;
   private int edtAb_npdp_Backcolor ;
   private int edtAb_npdr_Backcolor ;
   private int edtAb_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z9941Ab_npdr ;
   private java.math.BigDecimal Z9942Ab_npdp ;
   private java.math.BigDecimal Z9958Ab_npzas ;
   private java.math.BigDecimal Z9959Ab_npzam ;
   private java.math.BigDecimal Z9943Ab_npzasc ;
   private java.math.BigDecimal Z9944Ab_npzamc ;
   private java.math.BigDecimal Z9945Ab_npzcam ;
   private java.math.BigDecimal Z9946Ab_npzcam4 ;
   private java.math.BigDecimal Z9947Ab_npzcamc ;
   private java.math.BigDecimal Z9948Ab_npzd ;
   private java.math.BigDecimal Z9949Ab_nl ;
   private java.math.BigDecimal Z9950Ab_nmm1pes ;
   private java.math.BigDecimal Z9951Ab_nmm2pes ;
   private java.math.BigDecimal Z9952Ab_nmm3pes ;
   private java.math.BigDecimal Z9953Ab_nmm1rt ;
   private java.math.BigDecimal Z9954Ab_nmm2rt ;
   private java.math.BigDecimal Z9955Ab_nmm3rt ;
   private java.math.BigDecimal Z9956Ab_nmm4rt ;
   private java.math.BigDecimal Z9957Ab_nmp ;
   private java.math.BigDecimal A9941Ab_npdr ;
   private java.math.BigDecimal A9942Ab_npdp ;
   private java.math.BigDecimal A9958Ab_npzas ;
   private java.math.BigDecimal A9959Ab_npzam ;
   private java.math.BigDecimal A9943Ab_npzasc ;
   private java.math.BigDecimal A9944Ab_npzamc ;
   private java.math.BigDecimal A9945Ab_npzcam ;
   private java.math.BigDecimal A9946Ab_npzcam4 ;
   private java.math.BigDecimal A9947Ab_npzcamc ;
   private java.math.BigDecimal A9948Ab_npzd ;
   private java.math.BigDecimal A9949Ab_nl ;
   private java.math.BigDecimal A9950Ab_nmm1pes ;
   private java.math.BigDecimal A9951Ab_nmm2pes ;
   private java.math.BigDecimal A9952Ab_nmm3pes ;
   private java.math.BigDecimal A9953Ab_nmm1rt ;
   private java.math.BigDecimal A9954Ab_nmm2rt ;
   private java.math.BigDecimal A9955Ab_nmm3rt ;
   private java.math.BigDecimal A9956Ab_nmm4rt ;
   private java.math.BigDecimal A9957Ab_nmp ;
   private java.math.BigDecimal ZZ9941Ab_npdr ;
   private java.math.BigDecimal ZZ9942Ab_npdp ;
   private java.math.BigDecimal ZZ9958Ab_npzas ;
   private java.math.BigDecimal ZZ9959Ab_npzam ;
   private java.math.BigDecimal ZZ9943Ab_npzasc ;
   private java.math.BigDecimal ZZ9944Ab_npzamc ;
   private java.math.BigDecimal ZZ9945Ab_npzcam ;
   private java.math.BigDecimal ZZ9946Ab_npzcam4 ;
   private java.math.BigDecimal ZZ9947Ab_npzcamc ;
   private java.math.BigDecimal ZZ9948Ab_npzd ;
   private java.math.BigDecimal ZZ9949Ab_nl ;
   private java.math.BigDecimal ZZ9950Ab_nmm1pes ;
   private java.math.BigDecimal ZZ9951Ab_nmm2pes ;
   private java.math.BigDecimal ZZ9952Ab_nmm3pes ;
   private java.math.BigDecimal ZZ9953Ab_nmm1rt ;
   private java.math.BigDecimal ZZ9954Ab_nmm2rt ;
   private java.math.BigDecimal ZZ9955Ab_nmm3rt ;
   private java.math.BigDecimal ZZ9956Ab_nmm4rt ;
   private java.math.BigDecimal ZZ9957Ab_nmp ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9940Ab_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAb_cod_Internalname ;
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
   private String A9940Ab_cod ;
   private String edtAb_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAb_npdr_Internalname ;
   private String edtAb_npdr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAb_npdp_Internalname ;
   private String edtAb_npdp_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAb_npzas_Internalname ;
   private String edtAb_npzas_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtAb_npzam_Internalname ;
   private String edtAb_npzam_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAb_npzasc_Internalname ;
   private String edtAb_npzasc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAb_npzamc_Internalname ;
   private String edtAb_npzamc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAb_npzcam_Internalname ;
   private String edtAb_npzcam_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAb_npzcam4_Internalname ;
   private String edtAb_npzcam4_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAb_npzcamc_Internalname ;
   private String edtAb_npzcamc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAb_npzd_Internalname ;
   private String edtAb_npzd_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAb_nl_Internalname ;
   private String edtAb_nl_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtAb_nmm1pes_Internalname ;
   private String edtAb_nmm1pes_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAb_nmm2pes_Internalname ;
   private String edtAb_nmm2pes_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAb_nmm3pes_Internalname ;
   private String edtAb_nmm3pes_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAb_nmm1rt_Internalname ;
   private String edtAb_nmm1rt_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtAb_nmm2rt_Internalname ;
   private String edtAb_nmm2rt_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtAb_nmm3rt_Internalname ;
   private String edtAb_nmm3rt_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAb_nmm4rt_Internalname ;
   private String edtAb_nmm4rt_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAb_nmp_Internalname ;
   private String edtAb_nmp_Jsonclick ;
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
   private String sMode1321 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9940Ab_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9941Ab_npdr ;
   private boolean n9942Ab_npdp ;
   private boolean n9958Ab_npzas ;
   private boolean n9959Ab_npzam ;
   private boolean n9943Ab_npzasc ;
   private boolean n9944Ab_npzamc ;
   private boolean n9945Ab_npzcam ;
   private boolean n9946Ab_npzcam4 ;
   private boolean n9947Ab_npzcamc ;
   private boolean n9948Ab_npzd ;
   private boolean n9949Ab_nl ;
   private boolean n9950Ab_nmm1pes ;
   private boolean n9951Ab_nmm2pes ;
   private boolean n9952Ab_nmm3pes ;
   private boolean n9953Ab_nmm1rt ;
   private boolean n9954Ab_nmm2rt ;
   private boolean n9955Ab_nmm3rt ;
   private boolean n9956Ab_nmm4rt ;
   private boolean n9957Ab_nmp ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T015X4_A407EmprNom ;
   private boolean[] T015X4_n407EmprNom ;
   private String[] T015X5_A9940Ab_cod ;
   private String[] T015X5_A407EmprNom ;
   private boolean[] T015X5_n407EmprNom ;
   private java.math.BigDecimal[] T015X5_A9941Ab_npdr ;
   private boolean[] T015X5_n9941Ab_npdr ;
   private java.math.BigDecimal[] T015X5_A9942Ab_npdp ;
   private boolean[] T015X5_n9942Ab_npdp ;
   private java.math.BigDecimal[] T015X5_A9958Ab_npzas ;
   private boolean[] T015X5_n9958Ab_npzas ;
   private java.math.BigDecimal[] T015X5_A9959Ab_npzam ;
   private boolean[] T015X5_n9959Ab_npzam ;
   private java.math.BigDecimal[] T015X5_A9943Ab_npzasc ;
   private boolean[] T015X5_n9943Ab_npzasc ;
   private java.math.BigDecimal[] T015X5_A9944Ab_npzamc ;
   private boolean[] T015X5_n9944Ab_npzamc ;
   private java.math.BigDecimal[] T015X5_A9945Ab_npzcam ;
   private boolean[] T015X5_n9945Ab_npzcam ;
   private java.math.BigDecimal[] T015X5_A9946Ab_npzcam4 ;
   private boolean[] T015X5_n9946Ab_npzcam4 ;
   private java.math.BigDecimal[] T015X5_A9947Ab_npzcamc ;
   private boolean[] T015X5_n9947Ab_npzcamc ;
   private java.math.BigDecimal[] T015X5_A9948Ab_npzd ;
   private boolean[] T015X5_n9948Ab_npzd ;
   private java.math.BigDecimal[] T015X5_A9949Ab_nl ;
   private boolean[] T015X5_n9949Ab_nl ;
   private java.math.BigDecimal[] T015X5_A9950Ab_nmm1pes ;
   private boolean[] T015X5_n9950Ab_nmm1pes ;
   private java.math.BigDecimal[] T015X5_A9951Ab_nmm2pes ;
   private boolean[] T015X5_n9951Ab_nmm2pes ;
   private java.math.BigDecimal[] T015X5_A9952Ab_nmm3pes ;
   private boolean[] T015X5_n9952Ab_nmm3pes ;
   private java.math.BigDecimal[] T015X5_A9953Ab_nmm1rt ;
   private boolean[] T015X5_n9953Ab_nmm1rt ;
   private java.math.BigDecimal[] T015X5_A9954Ab_nmm2rt ;
   private boolean[] T015X5_n9954Ab_nmm2rt ;
   private java.math.BigDecimal[] T015X5_A9955Ab_nmm3rt ;
   private boolean[] T015X5_n9955Ab_nmm3rt ;
   private java.math.BigDecimal[] T015X5_A9956Ab_nmm4rt ;
   private boolean[] T015X5_n9956Ab_nmm4rt ;
   private java.math.BigDecimal[] T015X5_A9957Ab_nmp ;
   private boolean[] T015X5_n9957Ab_nmp ;
   private String[] T015X5_A396EmprCod ;
   private String[] T015X6_A396EmprCod ;
   private String[] T015X6_A9940Ab_cod ;
   private String[] T015X3_A9940Ab_cod ;
   private java.math.BigDecimal[] T015X3_A9941Ab_npdr ;
   private boolean[] T015X3_n9941Ab_npdr ;
   private java.math.BigDecimal[] T015X3_A9942Ab_npdp ;
   private boolean[] T015X3_n9942Ab_npdp ;
   private java.math.BigDecimal[] T015X3_A9958Ab_npzas ;
   private boolean[] T015X3_n9958Ab_npzas ;
   private java.math.BigDecimal[] T015X3_A9959Ab_npzam ;
   private boolean[] T015X3_n9959Ab_npzam ;
   private java.math.BigDecimal[] T015X3_A9943Ab_npzasc ;
   private boolean[] T015X3_n9943Ab_npzasc ;
   private java.math.BigDecimal[] T015X3_A9944Ab_npzamc ;
   private boolean[] T015X3_n9944Ab_npzamc ;
   private java.math.BigDecimal[] T015X3_A9945Ab_npzcam ;
   private boolean[] T015X3_n9945Ab_npzcam ;
   private java.math.BigDecimal[] T015X3_A9946Ab_npzcam4 ;
   private boolean[] T015X3_n9946Ab_npzcam4 ;
   private java.math.BigDecimal[] T015X3_A9947Ab_npzcamc ;
   private boolean[] T015X3_n9947Ab_npzcamc ;
   private java.math.BigDecimal[] T015X3_A9948Ab_npzd ;
   private boolean[] T015X3_n9948Ab_npzd ;
   private java.math.BigDecimal[] T015X3_A9949Ab_nl ;
   private boolean[] T015X3_n9949Ab_nl ;
   private java.math.BigDecimal[] T015X3_A9950Ab_nmm1pes ;
   private boolean[] T015X3_n9950Ab_nmm1pes ;
   private java.math.BigDecimal[] T015X3_A9951Ab_nmm2pes ;
   private boolean[] T015X3_n9951Ab_nmm2pes ;
   private java.math.BigDecimal[] T015X3_A9952Ab_nmm3pes ;
   private boolean[] T015X3_n9952Ab_nmm3pes ;
   private java.math.BigDecimal[] T015X3_A9953Ab_nmm1rt ;
   private boolean[] T015X3_n9953Ab_nmm1rt ;
   private java.math.BigDecimal[] T015X3_A9954Ab_nmm2rt ;
   private boolean[] T015X3_n9954Ab_nmm2rt ;
   private java.math.BigDecimal[] T015X3_A9955Ab_nmm3rt ;
   private boolean[] T015X3_n9955Ab_nmm3rt ;
   private java.math.BigDecimal[] T015X3_A9956Ab_nmm4rt ;
   private boolean[] T015X3_n9956Ab_nmm4rt ;
   private java.math.BigDecimal[] T015X3_A9957Ab_nmp ;
   private boolean[] T015X3_n9957Ab_nmp ;
   private String[] T015X3_A396EmprCod ;
   private String[] T015X7_A396EmprCod ;
   private String[] T015X7_A9940Ab_cod ;
   private String[] T015X8_A396EmprCod ;
   private String[] T015X8_A9940Ab_cod ;
   private String[] T015X2_A9940Ab_cod ;
   private java.math.BigDecimal[] T015X2_A9941Ab_npdr ;
   private boolean[] T015X2_n9941Ab_npdr ;
   private java.math.BigDecimal[] T015X2_A9942Ab_npdp ;
   private boolean[] T015X2_n9942Ab_npdp ;
   private java.math.BigDecimal[] T015X2_A9958Ab_npzas ;
   private boolean[] T015X2_n9958Ab_npzas ;
   private java.math.BigDecimal[] T015X2_A9959Ab_npzam ;
   private boolean[] T015X2_n9959Ab_npzam ;
   private java.math.BigDecimal[] T015X2_A9943Ab_npzasc ;
   private boolean[] T015X2_n9943Ab_npzasc ;
   private java.math.BigDecimal[] T015X2_A9944Ab_npzamc ;
   private boolean[] T015X2_n9944Ab_npzamc ;
   private java.math.BigDecimal[] T015X2_A9945Ab_npzcam ;
   private boolean[] T015X2_n9945Ab_npzcam ;
   private java.math.BigDecimal[] T015X2_A9946Ab_npzcam4 ;
   private boolean[] T015X2_n9946Ab_npzcam4 ;
   private java.math.BigDecimal[] T015X2_A9947Ab_npzcamc ;
   private boolean[] T015X2_n9947Ab_npzcamc ;
   private java.math.BigDecimal[] T015X2_A9948Ab_npzd ;
   private boolean[] T015X2_n9948Ab_npzd ;
   private java.math.BigDecimal[] T015X2_A9949Ab_nl ;
   private boolean[] T015X2_n9949Ab_nl ;
   private java.math.BigDecimal[] T015X2_A9950Ab_nmm1pes ;
   private boolean[] T015X2_n9950Ab_nmm1pes ;
   private java.math.BigDecimal[] T015X2_A9951Ab_nmm2pes ;
   private boolean[] T015X2_n9951Ab_nmm2pes ;
   private java.math.BigDecimal[] T015X2_A9952Ab_nmm3pes ;
   private boolean[] T015X2_n9952Ab_nmm3pes ;
   private java.math.BigDecimal[] T015X2_A9953Ab_nmm1rt ;
   private boolean[] T015X2_n9953Ab_nmm1rt ;
   private java.math.BigDecimal[] T015X2_A9954Ab_nmm2rt ;
   private boolean[] T015X2_n9954Ab_nmm2rt ;
   private java.math.BigDecimal[] T015X2_A9955Ab_nmm3rt ;
   private boolean[] T015X2_n9955Ab_nmm3rt ;
   private java.math.BigDecimal[] T015X2_A9956Ab_nmm4rt ;
   private boolean[] T015X2_n9956Ab_nmm4rt ;
   private java.math.BigDecimal[] T015X2_A9957Ab_nmp ;
   private boolean[] T015X2_n9957Ab_nmp ;
   private String[] T015X2_A396EmprCod ;
   private String[] T015X12_A396EmprCod ;
   private int[] T015X12_A129BarCod ;
   private byte[] T015X12_A132BarCodReo ;
   private String[] T015X12_A130BarCodPar ;
   private String[] T015X12_A758ProCod ;
   private short[] T015X12_A194BarOrdLin ;
   private String[] T015X12_A9940Ab_cod ;
   private String[] T015X13_A396EmprCod ;
   private String[] T015X13_A9940Ab_cod ;
   private String[] T015X14_A407EmprNom ;
   private boolean[] T015X14_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactab__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactab__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactab__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactab__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015X2", "SELECT Ab_cod, Ab_npdr, Ab_npdp, Ab_npzas, Ab_npzam, Ab_npzasc, Ab_npzamc, Ab_npzcam, Ab_npzcam4, Ab_npzcamc, Ab_npzd, Ab_nl, Ab_nmm1pes, Ab_nmm2pes, Ab_nmm3pes, Ab_nmm1rt, Ab_nmm2rt, Ab_nmm3rt, Ab_nmm4rt, Ab_nmp, EmprCod FROM TXPACTAB WHERE EmprCod = ? AND Ab_cod = ?  FOR UPDATE OF Ab_npdr, Ab_npdp, Ab_npzas, Ab_npzam, Ab_npzasc, Ab_npzamc, Ab_npzcam, Ab_npzcam4, Ab_npzcamc, Ab_npzd, Ab_nl, Ab_nmm1pes, Ab_nmm2pes, Ab_nmm3pes, Ab_nmm1rt, Ab_nmm2rt, Ab_nmm3rt, Ab_nmm4rt, Ab_nmp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X3", "SELECT Ab_cod, Ab_npdr, Ab_npdp, Ab_npzas, Ab_npzam, Ab_npzasc, Ab_npzamc, Ab_npzcam, Ab_npzcam4, Ab_npzcamc, Ab_npzd, Ab_nl, Ab_nmm1pes, Ab_nmm2pes, Ab_nmm3pes, Ab_nmm1rt, Ab_nmm2rt, Ab_nmm3rt, Ab_nmm4rt, Ab_nmp, EmprCod FROM TXPACTAB WHERE EmprCod = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ab_cod, T2.EmprNom, TM1.Ab_npdr, TM1.Ab_npdp, TM1.Ab_npzas, TM1.Ab_npzam, TM1.Ab_npzasc, TM1.Ab_npzamc, TM1.Ab_npzcam, TM1.Ab_npzcam4, TM1.Ab_npzcamc, TM1.Ab_npzd, TM1.Ab_nl, TM1.Ab_nmm1pes, TM1.Ab_nmm2pes, TM1.Ab_nmm3pes, TM1.Ab_nmm1rt, TM1.Ab_nmm2rt, TM1.Ab_nmm3rt, TM1.Ab_nmm4rt, TM1.Ab_nmp, TM1.EmprCod FROM (TXPACTAB TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Ab_cod = ? ORDER BY TM1.EmprCod, TM1.Ab_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ab_cod FROM TXPACTAB WHERE EmprCod = ? AND Ab_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ab_cod FROM TXPACTAB WHERE ( Ab_cod > ?) and EmprCod = ? ORDER BY EmprCod, Ab_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015X8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ab_cod FROM TXPACTAB WHERE ( Ab_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Ab_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015X9", "INSERT INTO TXPACTAB(Ab_cod, Ab_npdr, Ab_npdp, Ab_npzas, Ab_npzam, Ab_npzasc, Ab_npzamc, Ab_npzcam, Ab_npzcam4, Ab_npzcamc, Ab_npzd, Ab_nl, Ab_nmm1pes, Ab_nmm2pes, Ab_nmm3pes, Ab_nmm1rt, Ab_nmm2rt, Ab_nmm3rt, Ab_nmm4rt, Ab_nmp, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTAB")
         ,new UpdateCursor("T015X10", "UPDATE TXPACTAB SET Ab_npdr=?, Ab_npdp=?, Ab_npzas=?, Ab_npzam=?, Ab_npzasc=?, Ab_npzamc=?, Ab_npzcam=?, Ab_npzcam4=?, Ab_npzcamc=?, Ab_npzd=?, Ab_nl=?, Ab_nmm1pes=?, Ab_nmm2pes=?, Ab_nmm3pes=?, Ab_nmm1rt=?, Ab_nmm2rt=?, Ab_nmm3rt=?, Ab_nmm4rt=?, Ab_nmp=?  WHERE EmprCod = ? AND Ab_cod = ?", GX_NOMASK, "TXPACTAB")
         ,new UpdateCursor("T015X11", "DELETE FROM TXPACTAB  WHERE EmprCod = ? AND Ab_cod = ?", GX_NOMASK, "TXPACTAB")
         ,new ForEachCursor("T015X12", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND Ab_cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015X13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ab_cod FROM TXPACTAB WHERE EmprCod = ? ORDER BY EmprCod, Ab_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015X14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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

