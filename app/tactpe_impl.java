package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tactpe_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CALCULO DE LA ACTIVIDAD EN PER", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tactpe_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tactpe_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tactpe_impl.class ));
   }

   public tactpe_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TACTPE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo actividad seccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_cod_Internalname, GXutil.rtrim( A9878Pe_cod), GXutil.rtrim( localUtil.format( A9878Pe_cod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_cod_Jsonclick, 0, "", "", "", "", "", 1, edtPe_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "número de partidas", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_np_Internalname, GXutil.ltrim( localUtil.ntoc( A9879Pe_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_np_Enabled!=0) ? localUtil.format( A9879Pe_np, "ZZ9.99999") : localUtil.format( A9879Pe_np, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_np_Jsonclick, 0, "", "", "", "", "", 1, edtPe_np_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "numero de piezas", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_npz_Internalname, GXutil.ltrim( localUtil.ntoc( A9880Pe_npz, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_npz_Enabled!=0) ? localUtil.format( A9880Pe_npz, "ZZ9.99999") : localUtil.format( A9880Pe_npz, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_npz_Jsonclick, 0, "", "", "", "", "", 1, edtPe_npz_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "numero de cambios de abierto a", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_ncaat_Internalname, GXutil.ltrim( localUtil.ntoc( A9881Pe_ncaat, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_ncaat_Enabled!=0) ? localUtil.format( A9881Pe_ncaat, "ZZ9.99999") : localUtil.format( A9881Pe_ncaat, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_ncaat_Jsonclick, 0, "", "", "", "", "", 1, edtPe_ncaat_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "numero de cambios de tubular a", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_nctaa_Internalname, GXutil.ltrim( localUtil.ntoc( A9882Pe_nctaa, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_nctaa_Enabled!=0) ? localUtil.format( A9882Pe_nctaa, "ZZ9.99999") : localUtil.format( A9882Pe_nctaa, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_nctaa_Jsonclick, 0, "", "", "", "", "", 1, edtPe_nctaa_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N de cambios de 1 a 2 camas o", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_nc1221_Internalname, GXutil.ltrim( localUtil.ntoc( A9883Pe_nc1221, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_nc1221_Enabled!=0) ? localUtil.format( A9883Pe_nc1221, "ZZ9.99999") : localUtil.format( A9883Pe_nc1221, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_nc1221_Jsonclick, 0, "", "", "", "", "", 1, edtPe_nc1221_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "N mts pda nº 1/Vel FT/60*1,05", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TACTPE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPe_nmp_Internalname, GXutil.ltrim( localUtil.ntoc( A9884Pe_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPe_nmp_Enabled!=0) ? localUtil.format( A9884Pe_nmp, "ZZ9.99999") : localUtil.format( A9884Pe_nmp, "ZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPe_nmp_Jsonclick, 0, "", "", "", "", "", 1, edtPe_nmp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TACTPE.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TACTPE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TACTPE.htm");
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
      e1115P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9878Pe_cod = httpContext.cgiGet( "Z9878Pe_cod") ;
            Z9879Pe_np = localUtil.ctond( httpContext.cgiGet( "Z9879Pe_np")) ;
            Z9880Pe_npz = localUtil.ctond( httpContext.cgiGet( "Z9880Pe_npz")) ;
            Z9881Pe_ncaat = localUtil.ctond( httpContext.cgiGet( "Z9881Pe_ncaat")) ;
            Z9882Pe_nctaa = localUtil.ctond( httpContext.cgiGet( "Z9882Pe_nctaa")) ;
            Z9883Pe_nc1221 = localUtil.ctond( httpContext.cgiGet( "Z9883Pe_nc1221")) ;
            Z9884Pe_nmp = localUtil.ctond( httpContext.cgiGet( "Z9884Pe_nmp")) ;
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
            A9878Pe_cod = httpContext.cgiGet( edtPe_cod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_np_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_np_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_np_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9879Pe_np = DecimalUtil.ZERO ;
               n9879Pe_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrimstr( A9879Pe_np, 9, 5));
            }
            else
            {
               A9879Pe_np = localUtil.ctond( httpContext.cgiGet( edtPe_np_Internalname)) ;
               n9879Pe_np = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrimstr( A9879Pe_np, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_npz_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_npz_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NPZ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_npz_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9880Pe_npz = DecimalUtil.ZERO ;
               n9880Pe_npz = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrimstr( A9880Pe_npz, 9, 5));
            }
            else
            {
               A9880Pe_npz = localUtil.ctond( httpContext.cgiGet( edtPe_npz_Internalname)) ;
               n9880Pe_npz = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrimstr( A9880Pe_npz, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_ncaat_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_ncaat_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NCAAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_ncaat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9881Pe_ncaat = DecimalUtil.ZERO ;
               n9881Pe_ncaat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrimstr( A9881Pe_ncaat, 9, 5));
            }
            else
            {
               A9881Pe_ncaat = localUtil.ctond( httpContext.cgiGet( edtPe_ncaat_Internalname)) ;
               n9881Pe_ncaat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrimstr( A9881Pe_ncaat, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_nctaa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_nctaa_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NCTAA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_nctaa_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9882Pe_nctaa = DecimalUtil.ZERO ;
               n9882Pe_nctaa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrimstr( A9882Pe_nctaa, 9, 5));
            }
            else
            {
               A9882Pe_nctaa = localUtil.ctond( httpContext.cgiGet( edtPe_nctaa_Internalname)) ;
               n9882Pe_nctaa = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrimstr( A9882Pe_nctaa, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_nc1221_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_nc1221_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NC1221");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_nc1221_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9883Pe_nc1221 = DecimalUtil.ZERO ;
               n9883Pe_nc1221 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrimstr( A9883Pe_nc1221, 9, 5));
            }
            else
            {
               A9883Pe_nc1221 = localUtil.ctond( httpContext.cgiGet( edtPe_nc1221_Internalname)) ;
               n9883Pe_nc1221 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrimstr( A9883Pe_nc1221, 9, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPe_nmp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPe_nmp_Internalname)), DecimalUtil.stringToDec("999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PE_NMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPe_nmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9884Pe_nmp = DecimalUtil.ZERO ;
               n9884Pe_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrimstr( A9884Pe_nmp, 9, 5));
            }
            else
            {
               A9884Pe_nmp = localUtil.ctond( httpContext.cgiGet( edtPe_nmp_Internalname)) ;
               n9884Pe_nmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrimstr( A9884Pe_nmp, 9, 5));
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
               A9878Pe_cod = httpContext.GetPar( "Pe_cod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
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
                        e1115P2 ();
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
            initAll15P1307( ) ;
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
      disableAttributes15P1307( ) ;
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

   public void confirm_15P0( )
   {
      beforeValidate15P1307( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls15P1307( ) ;
         }
         else
         {
            checkExtendedTable15P1307( ) ;
            if ( AnyError == 0 )
            {
               zm15P1307( 4) ;
            }
            closeExtendedTableCursors15P1307( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues15P0( ) ;
      }
   }

   public void resetCaption15P0( )
   {
   }

   public void e1115P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tactpe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tactpe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tactpe_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tactpe_impl.this.A396EmprCod = GXv_char2[0] ;
      tactpe_impl.this.AV11EmprNom = GXv_char3[0] ;
      tactpe_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV33Pe_cod ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CACPE", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tactpe_impl.this.A396EmprCod = GXv_char4[0] ;
      tactpe_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV33Pe_cod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pe_cod", AV33Pe_cod);
      if ( GXutil.strcmp(AV33Pe_cod, " ") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta valor en DESCRIPCION, Contador=CACPE", ""));
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

   public void zm15P1307( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9879Pe_np = T015P3_A9879Pe_np[0] ;
            Z9880Pe_npz = T015P3_A9880Pe_npz[0] ;
            Z9881Pe_ncaat = T015P3_A9881Pe_ncaat[0] ;
            Z9882Pe_nctaa = T015P3_A9882Pe_nctaa[0] ;
            Z9883Pe_nc1221 = T015P3_A9883Pe_nc1221[0] ;
            Z9884Pe_nmp = T015P3_A9884Pe_nmp[0] ;
         }
         else
         {
            Z9879Pe_np = A9879Pe_np ;
            Z9880Pe_npz = A9880Pe_npz ;
            Z9881Pe_ncaat = A9881Pe_ncaat ;
            Z9882Pe_nctaa = A9882Pe_nctaa ;
            Z9883Pe_nc1221 = A9883Pe_nc1221 ;
            Z9884Pe_nmp = A9884Pe_nmp ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9878Pe_cod = A9878Pe_cod ;
         Z9879Pe_np = A9879Pe_np ;
         Z9880Pe_npz = A9880Pe_npz ;
         Z9881Pe_ncaat = A9881Pe_ncaat ;
         Z9882Pe_nctaa = A9882Pe_nctaa ;
         Z9883Pe_nc1221 = A9883Pe_nc1221 ;
         Z9884Pe_nmp = A9884Pe_nmp ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TACTPE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T015P4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015P4_A407EmprNom[0] ;
      n407EmprNom = T015P4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      A9878Pe_cod = AV33Pe_cod ;
      httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
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

   public void load15P1307( )
   {
      /* Using cursor T015P5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9878Pe_cod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1307 = (short)(1) ;
         A407EmprNom = T015P5_A407EmprNom[0] ;
         n407EmprNom = T015P5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9879Pe_np = T015P5_A9879Pe_np[0] ;
         n9879Pe_np = T015P5_n9879Pe_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrimstr( A9879Pe_np, 9, 5));
         A9880Pe_npz = T015P5_A9880Pe_npz[0] ;
         n9880Pe_npz = T015P5_n9880Pe_npz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrimstr( A9880Pe_npz, 9, 5));
         A9881Pe_ncaat = T015P5_A9881Pe_ncaat[0] ;
         n9881Pe_ncaat = T015P5_n9881Pe_ncaat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrimstr( A9881Pe_ncaat, 9, 5));
         A9882Pe_nctaa = T015P5_A9882Pe_nctaa[0] ;
         n9882Pe_nctaa = T015P5_n9882Pe_nctaa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrimstr( A9882Pe_nctaa, 9, 5));
         A9883Pe_nc1221 = T015P5_A9883Pe_nc1221[0] ;
         n9883Pe_nc1221 = T015P5_n9883Pe_nc1221[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrimstr( A9883Pe_nc1221, 9, 5));
         A9884Pe_nmp = T015P5_A9884Pe_nmp[0] ;
         n9884Pe_nmp = T015P5_n9884Pe_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrimstr( A9884Pe_nmp, 9, 5));
         zm15P1307( -3) ;
      }
      pr_default.close(3);
      onLoadActions15P1307( ) ;
   }

   public void onLoadActions15P1307( )
   {
   }

   public void checkExtendedTable15P1307( )
   {
      nIsDirty_1307 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A9878Pe_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "PE_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors15P1307( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey15P1307( )
   {
      /* Using cursor T015P6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A9878Pe_cod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1307 = (short)(1) ;
      }
      else
      {
         RcdFound1307 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T015P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9878Pe_cod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T015P3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm15P1307( 3) ;
         RcdFound1307 = (short)(1) ;
         A9878Pe_cod = T015P3_A9878Pe_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
         A9879Pe_np = T015P3_A9879Pe_np[0] ;
         n9879Pe_np = T015P3_n9879Pe_np[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrimstr( A9879Pe_np, 9, 5));
         A9880Pe_npz = T015P3_A9880Pe_npz[0] ;
         n9880Pe_npz = T015P3_n9880Pe_npz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrimstr( A9880Pe_npz, 9, 5));
         A9881Pe_ncaat = T015P3_A9881Pe_ncaat[0] ;
         n9881Pe_ncaat = T015P3_n9881Pe_ncaat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrimstr( A9881Pe_ncaat, 9, 5));
         A9882Pe_nctaa = T015P3_A9882Pe_nctaa[0] ;
         n9882Pe_nctaa = T015P3_n9882Pe_nctaa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrimstr( A9882Pe_nctaa, 9, 5));
         A9883Pe_nc1221 = T015P3_A9883Pe_nc1221[0] ;
         n9883Pe_nc1221 = T015P3_n9883Pe_nc1221[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrimstr( A9883Pe_nc1221, 9, 5));
         A9884Pe_nmp = T015P3_A9884Pe_nmp[0] ;
         n9884Pe_nmp = T015P3_n9884Pe_nmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrimstr( A9884Pe_nmp, 9, 5));
         Z396EmprCod = A396EmprCod ;
         Z9878Pe_cod = A9878Pe_cod ;
         sMode1307 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load15P1307( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1307 = (short)(0) ;
            initializeNonKey15P1307( ) ;
         }
         Gx_mode = sMode1307 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1307 = (short)(0) ;
         initializeNonKey15P1307( ) ;
         sMode1307 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1307 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey15P1307( ) ;
      if ( RcdFound1307 == 0 )
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
      RcdFound1307 = (short)(0) ;
      /* Using cursor T015P7 */
      pr_default.execute(5, new Object[] {A9878Pe_cod, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015P7_A9878Pe_cod[0], A9878Pe_cod) < 0 ) ) && ( GXutil.strcmp(T015P7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T015P7_A9878Pe_cod[0], A9878Pe_cod) > 0 ) ) && ( GXutil.strcmp(T015P7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9878Pe_cod = T015P7_A9878Pe_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
            RcdFound1307 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1307 = (short)(0) ;
      /* Using cursor T015P8 */
      pr_default.execute(6, new Object[] {A9878Pe_cod, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015P8_A9878Pe_cod[0], A9878Pe_cod) > 0 ) ) && ( GXutil.strcmp(T015P8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T015P8_A9878Pe_cod[0], A9878Pe_cod) < 0 ) ) && ( GXutil.strcmp(T015P8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9878Pe_cod = T015P8_A9878Pe_cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
            RcdFound1307 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey15P1307( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPe_cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert15P1307( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1307 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
            {
               A9878Pe_cod = Z9878Pe_cod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update15P1307( ) ;
               GX_FocusControl = edtPe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPe_cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert15P1307( ) ;
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
                  GX_FocusControl = edtPe_cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert15P1307( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
      {
         A9878Pe_cod = Z9878Pe_cod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPe_cod_Internalname ;
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
      getKey15P1307( ) ;
      if ( RcdFound1307 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
         {
            A9878Pe_cod = Z9878Pe_cod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9878Pe_cod, Z9878Pe_cod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tactpe");
      GX_FocusControl = edtPe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_15P0( ) ;
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
      if ( RcdFound1307 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart15P1307( ) ;
      if ( RcdFound1307 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15P1307( ) ;
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
      if ( RcdFound1307 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_np_Internalname ;
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
      if ( RcdFound1307 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_np_Internalname ;
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
      scanStart15P1307( ) ;
      if ( RcdFound1307 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1307 != 0 )
         {
            scanNext15P1307( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPe_np_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd15P1307( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency15P1307( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T015P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9878Pe_cod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTPE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9879Pe_np, T015P2_A9879Pe_np[0]) != 0 ) || ( DecimalUtil.compareTo(Z9880Pe_npz, T015P2_A9880Pe_npz[0]) != 0 ) || ( DecimalUtil.compareTo(Z9881Pe_ncaat, T015P2_A9881Pe_ncaat[0]) != 0 ) || ( DecimalUtil.compareTo(Z9882Pe_nctaa, T015P2_A9882Pe_nctaa[0]) != 0 ) || ( DecimalUtil.compareTo(Z9883Pe_nc1221, T015P2_A9883Pe_nc1221[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9884Pe_nmp, T015P2_A9884Pe_nmp[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9879Pe_np, T015P2_A9879Pe_np[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_np");
               GXutil.writeLogRaw("Old: ",Z9879Pe_np);
               GXutil.writeLogRaw("Current: ",T015P2_A9879Pe_np[0]);
            }
            if ( DecimalUtil.compareTo(Z9880Pe_npz, T015P2_A9880Pe_npz[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_npz");
               GXutil.writeLogRaw("Old: ",Z9880Pe_npz);
               GXutil.writeLogRaw("Current: ",T015P2_A9880Pe_npz[0]);
            }
            if ( DecimalUtil.compareTo(Z9881Pe_ncaat, T015P2_A9881Pe_ncaat[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_ncaat");
               GXutil.writeLogRaw("Old: ",Z9881Pe_ncaat);
               GXutil.writeLogRaw("Current: ",T015P2_A9881Pe_ncaat[0]);
            }
            if ( DecimalUtil.compareTo(Z9882Pe_nctaa, T015P2_A9882Pe_nctaa[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_nctaa");
               GXutil.writeLogRaw("Old: ",Z9882Pe_nctaa);
               GXutil.writeLogRaw("Current: ",T015P2_A9882Pe_nctaa[0]);
            }
            if ( DecimalUtil.compareTo(Z9883Pe_nc1221, T015P2_A9883Pe_nc1221[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_nc1221");
               GXutil.writeLogRaw("Old: ",Z9883Pe_nc1221);
               GXutil.writeLogRaw("Current: ",T015P2_A9883Pe_nc1221[0]);
            }
            if ( DecimalUtil.compareTo(Z9884Pe_nmp, T015P2_A9884Pe_nmp[0]) != 0 )
            {
               GXutil.writeLogln("tactpe:[seudo value changed for attri]"+"Pe_nmp");
               GXutil.writeLogRaw("Old: ",Z9884Pe_nmp);
               GXutil.writeLogRaw("Current: ",T015P2_A9884Pe_nmp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPACTPE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert15P1307( )
   {
      beforeValidate15P1307( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15P1307( ) ;
      }
      if ( AnyError == 0 )
      {
         zm15P1307( 0) ;
         checkOptimisticConcurrency15P1307( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15P1307( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert15P1307( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015P9 */
                  pr_default.execute(7, new Object[] {A9878Pe_cod, Boolean.valueOf(n9879Pe_np), A9879Pe_np, Boolean.valueOf(n9880Pe_npz), A9880Pe_npz, Boolean.valueOf(n9881Pe_ncaat), A9881Pe_ncaat, Boolean.valueOf(n9882Pe_nctaa), A9882Pe_nctaa, Boolean.valueOf(n9883Pe_nc1221), A9883Pe_nc1221, Boolean.valueOf(n9884Pe_nmp), A9884Pe_nmp, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTPE");
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
                        resetCaption15P0( ) ;
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
            load15P1307( ) ;
         }
         endLevel15P1307( ) ;
      }
      closeExtendedTableCursors15P1307( ) ;
   }

   public void update15P1307( )
   {
      beforeValidate15P1307( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable15P1307( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15P1307( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm15P1307( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate15P1307( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015P10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n9879Pe_np), A9879Pe_np, Boolean.valueOf(n9880Pe_npz), A9880Pe_npz, Boolean.valueOf(n9881Pe_ncaat), A9881Pe_ncaat, Boolean.valueOf(n9882Pe_nctaa), A9882Pe_nctaa, Boolean.valueOf(n9883Pe_nc1221), A9883Pe_nc1221, Boolean.valueOf(n9884Pe_nmp), A9884Pe_nmp, A396EmprCod, A9878Pe_cod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTPE");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPACTPE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate15P1307( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption15P0( ) ;
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
         endLevel15P1307( ) ;
      }
      closeExtendedTableCursors15P1307( ) ;
   }

   public void deferredUpdate15P1307( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate15P1307( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency15P1307( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls15P1307( ) ;
         afterConfirm15P1307( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete15P1307( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015P11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A9878Pe_cod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPACTPE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1307 == 0 )
                     {
                        initAll15P1307( ) ;
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
                     resetCaption15P0( ) ;
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
      sMode1307 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel15P1307( ) ;
      Gx_mode = sMode1307 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls15P1307( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015P12 */
         pr_default.execute(10, new Object[] {A396EmprCod, A9878Pe_cod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel15P1307( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete15P1307( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tactpe");
         if ( AnyError == 0 )
         {
            confirmValues15P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tactpe");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart15P1307( )
   {
      /* Scan By routine */
      /* Using cursor T015P13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1307 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1307 = (short)(1) ;
         A9878Pe_cod = T015P13_A9878Pe_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext15P1307( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1307 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1307 = (short)(1) ;
         A9878Pe_cod = T015P13_A9878Pe_cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
      }
   }

   public void scanEnd15P1307( )
   {
      pr_default.close(11);
   }

   public void afterConfirm15P1307( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert15P1307( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate15P1307( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete15P1307( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete15P1307( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate15P1307( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes15P1307( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPe_cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_cod_Enabled), 5, 0), true);
      edtPe_np_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_np_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_np_Enabled), 5, 0), true);
      edtPe_npz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_npz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_npz_Enabled), 5, 0), true);
      edtPe_ncaat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_ncaat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_ncaat_Enabled), 5, 0), true);
      edtPe_nctaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_nctaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_nctaa_Enabled), 5, 0), true);
      edtPe_nc1221_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_nc1221_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_nc1221_Enabled), 5, 0), true);
      edtPe_nmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPe_nmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPe_nmp_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes15P1307( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues15P0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tactpe", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9878Pe_cod", GXutil.rtrim( Z9878Pe_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9879Pe_np", GXutil.ltrim( localUtil.ntoc( Z9879Pe_np, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9880Pe_npz", GXutil.ltrim( localUtil.ntoc( Z9880Pe_npz, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9881Pe_ncaat", GXutil.ltrim( localUtil.ntoc( Z9881Pe_ncaat, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9882Pe_nctaa", GXutil.ltrim( localUtil.ntoc( Z9882Pe_nctaa, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9883Pe_nc1221", GXutil.ltrim( localUtil.ntoc( Z9883Pe_nc1221, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9884Pe_nmp", GXutil.ltrim( localUtil.ntoc( Z9884Pe_nmp, (byte)(9), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tactpe", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TACTPE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CALCULO DE LA ACTIVIDAD EN PER", "") ;
   }

   public void initializeNonKey15P1307( )
   {
      A9879Pe_np = DecimalUtil.ZERO ;
      n9879Pe_np = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrimstr( A9879Pe_np, 9, 5));
      A9880Pe_npz = DecimalUtil.ZERO ;
      n9880Pe_npz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrimstr( A9880Pe_npz, 9, 5));
      A9881Pe_ncaat = DecimalUtil.ZERO ;
      n9881Pe_ncaat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrimstr( A9881Pe_ncaat, 9, 5));
      A9882Pe_nctaa = DecimalUtil.ZERO ;
      n9882Pe_nctaa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrimstr( A9882Pe_nctaa, 9, 5));
      A9883Pe_nc1221 = DecimalUtil.ZERO ;
      n9883Pe_nc1221 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrimstr( A9883Pe_nc1221, 9, 5));
      A9884Pe_nmp = DecimalUtil.ZERO ;
      n9884Pe_nmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrimstr( A9884Pe_nmp, 9, 5));
      Z9879Pe_np = DecimalUtil.ZERO ;
      Z9880Pe_npz = DecimalUtil.ZERO ;
      Z9881Pe_ncaat = DecimalUtil.ZERO ;
      Z9882Pe_nctaa = DecimalUtil.ZERO ;
      Z9883Pe_nc1221 = DecimalUtil.ZERO ;
      Z9884Pe_nmp = DecimalUtil.ZERO ;
   }

   public void initAll15P1307( )
   {
      A9878Pe_cod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9878Pe_cod", A9878Pe_cod);
      initializeNonKey15P1307( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241542895", true, true);
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
      httpContext.AddJavascriptSource("tactpe.js", "?20268241542895", false, true);
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
      edtPe_cod_Internalname = "PE_COD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPe_np_Internalname = "PE_NP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPe_npz_Internalname = "PE_NPZ" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPe_ncaat_Internalname = "PE_NCAAT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPe_nctaa_Internalname = "PE_NCTAA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPe_nc1221_Internalname = "PE_NC1221" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPe_nmp_Internalname = "PE_NMP" ;
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
      Form.setCaption( httpContext.getMessage( "CALCULO DE LA ACTIVIDAD EN PER", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPe_nmp_Jsonclick = "" ;
      edtPe_nmp_Backcolor = (int)(0xFFFFFF) ;
      edtPe_nmp_Enabled = 1 ;
      edtPe_nc1221_Jsonclick = "" ;
      edtPe_nc1221_Backcolor = (int)(0xFFFFFF) ;
      edtPe_nc1221_Enabled = 1 ;
      edtPe_nctaa_Jsonclick = "" ;
      edtPe_nctaa_Backcolor = (int)(0xFFFFFF) ;
      edtPe_nctaa_Enabled = 1 ;
      edtPe_ncaat_Jsonclick = "" ;
      edtPe_ncaat_Backcolor = (int)(0xFFFFFF) ;
      edtPe_ncaat_Enabled = 1 ;
      edtPe_npz_Jsonclick = "" ;
      edtPe_npz_Backcolor = (int)(0xFFFFFF) ;
      edtPe_npz_Enabled = 1 ;
      edtPe_np_Jsonclick = "" ;
      edtPe_np_Backcolor = (int)(0xFFFFFF) ;
      edtPe_np_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPe_cod_Jsonclick = "" ;
      edtPe_cod_Backcolor = (int)(0xFFFFFF) ;
      edtPe_cod_Enabled = 1 ;
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
      /* Using cursor T015P14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T015P14_A407EmprNom[0] ;
      n407EmprNom = T015P14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      GX_FocusControl = edtPe_np_Internalname ;
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

   public void valid_Pe_cod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( GXutil.strcmp(A9878Pe_cod, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "PE_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPe_cod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9879Pe_np", GXutil.ltrim( localUtil.ntoc( A9879Pe_np, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9880Pe_npz", GXutil.ltrim( localUtil.ntoc( A9880Pe_npz, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9881Pe_ncaat", GXutil.ltrim( localUtil.ntoc( A9881Pe_ncaat, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9882Pe_nctaa", GXutil.ltrim( localUtil.ntoc( A9882Pe_nctaa, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9883Pe_nc1221", GXutil.ltrim( localUtil.ntoc( A9883Pe_nc1221, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9884Pe_nmp", GXutil.ltrim( localUtil.ntoc( A9884Pe_nmp, (byte)(9), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9878Pe_cod", GXutil.rtrim( Z9878Pe_cod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9879Pe_np", GXutil.ltrim( localUtil.ntoc( Z9879Pe_np, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9880Pe_npz", GXutil.ltrim( localUtil.ntoc( Z9880Pe_npz, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9881Pe_ncaat", GXutil.ltrim( localUtil.ntoc( Z9881Pe_ncaat, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9882Pe_nctaa", GXutil.ltrim( localUtil.ntoc( Z9882Pe_nctaa, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9883Pe_nc1221", GXutil.ltrim( localUtil.ntoc( Z9883Pe_nc1221, (byte)(9), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9884Pe_nmp", GXutil.ltrim( localUtil.ntoc( Z9884Pe_nmp, (byte)(9), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_PE_COD","{handler:'valid_Pe_cod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9878Pe_cod',fld:'PE_COD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV33Pe_cod',fld:'vPE_COD',pic:''}]");
      setEventMetadata("VALID_PE_COD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9879Pe_np',fld:'PE_NP',pic:'ZZ9.99999'},{av:'A9880Pe_npz',fld:'PE_NPZ',pic:'ZZ9.99999'},{av:'A9881Pe_ncaat',fld:'PE_NCAAT',pic:'ZZ9.99999'},{av:'A9882Pe_nctaa',fld:'PE_NCTAA',pic:'ZZ9.99999'},{av:'A9883Pe_nc1221',fld:'PE_NC1221',pic:'ZZ9.99999'},{av:'A9884Pe_nmp',fld:'PE_NMP',pic:'ZZ9.99999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9878Pe_cod'},{av:'Z407EmprNom'},{av:'Z9879Pe_np'},{av:'Z9880Pe_npz'},{av:'Z9881Pe_ncaat'},{av:'Z9882Pe_nctaa'},{av:'Z9883Pe_nc1221'},{av:'Z9884Pe_nmp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z9878Pe_cod = "" ;
      Z9879Pe_np = DecimalUtil.ZERO ;
      Z9880Pe_npz = DecimalUtil.ZERO ;
      Z9881Pe_ncaat = DecimalUtil.ZERO ;
      Z9882Pe_nctaa = DecimalUtil.ZERO ;
      Z9883Pe_nc1221 = DecimalUtil.ZERO ;
      Z9884Pe_nmp = DecimalUtil.ZERO ;
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
      A9878Pe_cod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A9879Pe_np = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A9880Pe_npz = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A9881Pe_ncaat = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A9882Pe_nctaa = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A9883Pe_nc1221 = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A9884Pe_nmp = DecimalUtil.ZERO ;
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
      T015P4_A407EmprNom = new String[] {""} ;
      T015P4_n407EmprNom = new boolean[] {false} ;
      T015P5_A9878Pe_cod = new String[] {""} ;
      T015P5_A407EmprNom = new String[] {""} ;
      T015P5_n407EmprNom = new boolean[] {false} ;
      T015P5_A9879Pe_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9879Pe_np = new boolean[] {false} ;
      T015P5_A9880Pe_npz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9880Pe_npz = new boolean[] {false} ;
      T015P5_A9881Pe_ncaat = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9881Pe_ncaat = new boolean[] {false} ;
      T015P5_A9882Pe_nctaa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9882Pe_nctaa = new boolean[] {false} ;
      T015P5_A9883Pe_nc1221 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9883Pe_nc1221 = new boolean[] {false} ;
      T015P5_A9884Pe_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P5_n9884Pe_nmp = new boolean[] {false} ;
      T015P5_A396EmprCod = new String[] {""} ;
      T015P6_A396EmprCod = new String[] {""} ;
      T015P6_A9878Pe_cod = new String[] {""} ;
      T015P3_A9878Pe_cod = new String[] {""} ;
      T015P3_A9879Pe_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9879Pe_np = new boolean[] {false} ;
      T015P3_A9880Pe_npz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9880Pe_npz = new boolean[] {false} ;
      T015P3_A9881Pe_ncaat = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9881Pe_ncaat = new boolean[] {false} ;
      T015P3_A9882Pe_nctaa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9882Pe_nctaa = new boolean[] {false} ;
      T015P3_A9883Pe_nc1221 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9883Pe_nc1221 = new boolean[] {false} ;
      T015P3_A9884Pe_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P3_n9884Pe_nmp = new boolean[] {false} ;
      T015P3_A396EmprCod = new String[] {""} ;
      sMode1307 = "" ;
      T015P7_A396EmprCod = new String[] {""} ;
      T015P7_A9878Pe_cod = new String[] {""} ;
      T015P8_A396EmprCod = new String[] {""} ;
      T015P8_A9878Pe_cod = new String[] {""} ;
      T015P2_A9878Pe_cod = new String[] {""} ;
      T015P2_A9879Pe_np = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9879Pe_np = new boolean[] {false} ;
      T015P2_A9880Pe_npz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9880Pe_npz = new boolean[] {false} ;
      T015P2_A9881Pe_ncaat = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9881Pe_ncaat = new boolean[] {false} ;
      T015P2_A9882Pe_nctaa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9882Pe_nctaa = new boolean[] {false} ;
      T015P2_A9883Pe_nc1221 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9883Pe_nc1221 = new boolean[] {false} ;
      T015P2_A9884Pe_nmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015P2_n9884Pe_nmp = new boolean[] {false} ;
      T015P2_A396EmprCod = new String[] {""} ;
      T015P12_A396EmprCod = new String[] {""} ;
      T015P12_A129BarCod = new int[1] ;
      T015P12_A132BarCodReo = new byte[1] ;
      T015P12_A130BarCodPar = new String[] {""} ;
      T015P12_A758ProCod = new String[] {""} ;
      T015P12_A194BarOrdLin = new short[1] ;
      T015P12_A9878Pe_cod = new String[] {""} ;
      T015P13_A396EmprCod = new String[] {""} ;
      T015P13_A9878Pe_cod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T015P14_A407EmprNom = new String[] {""} ;
      T015P14_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9878Pe_cod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9879Pe_np = DecimalUtil.ZERO ;
      ZZ9880Pe_npz = DecimalUtil.ZERO ;
      ZZ9881Pe_ncaat = DecimalUtil.ZERO ;
      ZZ9882Pe_nctaa = DecimalUtil.ZERO ;
      ZZ9883Pe_nc1221 = DecimalUtil.ZERO ;
      ZZ9884Pe_nmp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tactpe__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tactpe__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tactpe__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tactpe__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tactpe__default(),
         new Object[] {
             new Object[] {
            T015P2_A9878Pe_cod, T015P2_A9879Pe_np, T015P2_n9879Pe_np, T015P2_A9880Pe_npz, T015P2_n9880Pe_npz, T015P2_A9881Pe_ncaat, T015P2_n9881Pe_ncaat, T015P2_A9882Pe_nctaa, T015P2_n9882Pe_nctaa, T015P2_A9883Pe_nc1221,
            T015P2_n9883Pe_nc1221, T015P2_A9884Pe_nmp, T015P2_n9884Pe_nmp, T015P2_A396EmprCod
            }
            , new Object[] {
            T015P3_A9878Pe_cod, T015P3_A9879Pe_np, T015P3_n9879Pe_np, T015P3_A9880Pe_npz, T015P3_n9880Pe_npz, T015P3_A9881Pe_ncaat, T015P3_n9881Pe_ncaat, T015P3_A9882Pe_nctaa, T015P3_n9882Pe_nctaa, T015P3_A9883Pe_nc1221,
            T015P3_n9883Pe_nc1221, T015P3_A9884Pe_nmp, T015P3_n9884Pe_nmp, T015P3_A396EmprCod
            }
            , new Object[] {
            T015P4_A407EmprNom, T015P4_n407EmprNom
            }
            , new Object[] {
            T015P5_A9878Pe_cod, T015P5_A407EmprNom, T015P5_n407EmprNom, T015P5_A9879Pe_np, T015P5_n9879Pe_np, T015P5_A9880Pe_npz, T015P5_n9880Pe_npz, T015P5_A9881Pe_ncaat, T015P5_n9881Pe_ncaat, T015P5_A9882Pe_nctaa,
            T015P5_n9882Pe_nctaa, T015P5_A9883Pe_nc1221, T015P5_n9883Pe_nc1221, T015P5_A9884Pe_nmp, T015P5_n9884Pe_nmp, T015P5_A396EmprCod
            }
            , new Object[] {
            T015P6_A396EmprCod, T015P6_A9878Pe_cod
            }
            , new Object[] {
            T015P7_A396EmprCod, T015P7_A9878Pe_cod
            }
            , new Object[] {
            T015P8_A396EmprCod, T015P8_A9878Pe_cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015P12_A396EmprCod, T015P12_A129BarCod, T015P12_A132BarCodReo, T015P12_A130BarCodPar, T015P12_A758ProCod, T015P12_A194BarOrdLin, T015P12_A9878Pe_cod
            }
            , new Object[] {
            T015P13_A396EmprCod, T015P13_A9878Pe_cod
            }
            , new Object[] {
            T015P14_A407EmprNom, T015P14_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TACTPE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1307 ;
   private short nIsDirty_1307 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPe_cod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPe_np_Enabled ;
   private int edtPe_npz_Enabled ;
   private int edtPe_ncaat_Enabled ;
   private int edtPe_nctaa_Enabled ;
   private int edtPe_nc1221_Enabled ;
   private int edtPe_nmp_Enabled ;
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
   private int edtPe_nmp_Backcolor ;
   private int edtPe_nc1221_Backcolor ;
   private int edtPe_nctaa_Backcolor ;
   private int edtPe_ncaat_Backcolor ;
   private int edtPe_npz_Backcolor ;
   private int edtPe_np_Backcolor ;
   private int edtPe_cod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z9879Pe_np ;
   private java.math.BigDecimal Z9880Pe_npz ;
   private java.math.BigDecimal Z9881Pe_ncaat ;
   private java.math.BigDecimal Z9882Pe_nctaa ;
   private java.math.BigDecimal Z9883Pe_nc1221 ;
   private java.math.BigDecimal Z9884Pe_nmp ;
   private java.math.BigDecimal A9879Pe_np ;
   private java.math.BigDecimal A9880Pe_npz ;
   private java.math.BigDecimal A9881Pe_ncaat ;
   private java.math.BigDecimal A9882Pe_nctaa ;
   private java.math.BigDecimal A9883Pe_nc1221 ;
   private java.math.BigDecimal A9884Pe_nmp ;
   private java.math.BigDecimal ZZ9879Pe_np ;
   private java.math.BigDecimal ZZ9880Pe_npz ;
   private java.math.BigDecimal ZZ9881Pe_ncaat ;
   private java.math.BigDecimal ZZ9882Pe_nctaa ;
   private java.math.BigDecimal ZZ9883Pe_nc1221 ;
   private java.math.BigDecimal ZZ9884Pe_nmp ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9878Pe_cod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPe_cod_Internalname ;
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
   private String A9878Pe_cod ;
   private String edtPe_cod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPe_np_Internalname ;
   private String edtPe_np_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPe_npz_Internalname ;
   private String edtPe_npz_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPe_ncaat_Internalname ;
   private String edtPe_ncaat_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPe_nctaa_Internalname ;
   private String edtPe_nctaa_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPe_nc1221_Internalname ;
   private String edtPe_nc1221_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPe_nmp_Internalname ;
   private String edtPe_nmp_Jsonclick ;
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
   private String sMode1307 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ9878Pe_cod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9879Pe_np ;
   private boolean n9880Pe_npz ;
   private boolean n9881Pe_ncaat ;
   private boolean n9882Pe_nctaa ;
   private boolean n9883Pe_nc1221 ;
   private boolean n9884Pe_nmp ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T015P4_A407EmprNom ;
   private boolean[] T015P4_n407EmprNom ;
   private String[] T015P5_A9878Pe_cod ;
   private String[] T015P5_A407EmprNom ;
   private boolean[] T015P5_n407EmprNom ;
   private java.math.BigDecimal[] T015P5_A9879Pe_np ;
   private boolean[] T015P5_n9879Pe_np ;
   private java.math.BigDecimal[] T015P5_A9880Pe_npz ;
   private boolean[] T015P5_n9880Pe_npz ;
   private java.math.BigDecimal[] T015P5_A9881Pe_ncaat ;
   private boolean[] T015P5_n9881Pe_ncaat ;
   private java.math.BigDecimal[] T015P5_A9882Pe_nctaa ;
   private boolean[] T015P5_n9882Pe_nctaa ;
   private java.math.BigDecimal[] T015P5_A9883Pe_nc1221 ;
   private boolean[] T015P5_n9883Pe_nc1221 ;
   private java.math.BigDecimal[] T015P5_A9884Pe_nmp ;
   private boolean[] T015P5_n9884Pe_nmp ;
   private String[] T015P5_A396EmprCod ;
   private String[] T015P6_A396EmprCod ;
   private String[] T015P6_A9878Pe_cod ;
   private String[] T015P3_A9878Pe_cod ;
   private java.math.BigDecimal[] T015P3_A9879Pe_np ;
   private boolean[] T015P3_n9879Pe_np ;
   private java.math.BigDecimal[] T015P3_A9880Pe_npz ;
   private boolean[] T015P3_n9880Pe_npz ;
   private java.math.BigDecimal[] T015P3_A9881Pe_ncaat ;
   private boolean[] T015P3_n9881Pe_ncaat ;
   private java.math.BigDecimal[] T015P3_A9882Pe_nctaa ;
   private boolean[] T015P3_n9882Pe_nctaa ;
   private java.math.BigDecimal[] T015P3_A9883Pe_nc1221 ;
   private boolean[] T015P3_n9883Pe_nc1221 ;
   private java.math.BigDecimal[] T015P3_A9884Pe_nmp ;
   private boolean[] T015P3_n9884Pe_nmp ;
   private String[] T015P3_A396EmprCod ;
   private String[] T015P7_A396EmprCod ;
   private String[] T015P7_A9878Pe_cod ;
   private String[] T015P8_A396EmprCod ;
   private String[] T015P8_A9878Pe_cod ;
   private String[] T015P2_A9878Pe_cod ;
   private java.math.BigDecimal[] T015P2_A9879Pe_np ;
   private boolean[] T015P2_n9879Pe_np ;
   private java.math.BigDecimal[] T015P2_A9880Pe_npz ;
   private boolean[] T015P2_n9880Pe_npz ;
   private java.math.BigDecimal[] T015P2_A9881Pe_ncaat ;
   private boolean[] T015P2_n9881Pe_ncaat ;
   private java.math.BigDecimal[] T015P2_A9882Pe_nctaa ;
   private boolean[] T015P2_n9882Pe_nctaa ;
   private java.math.BigDecimal[] T015P2_A9883Pe_nc1221 ;
   private boolean[] T015P2_n9883Pe_nc1221 ;
   private java.math.BigDecimal[] T015P2_A9884Pe_nmp ;
   private boolean[] T015P2_n9884Pe_nmp ;
   private String[] T015P2_A396EmprCod ;
   private String[] T015P12_A396EmprCod ;
   private int[] T015P12_A129BarCod ;
   private byte[] T015P12_A132BarCodReo ;
   private String[] T015P12_A130BarCodPar ;
   private String[] T015P12_A758ProCod ;
   private short[] T015P12_A194BarOrdLin ;
   private String[] T015P12_A9878Pe_cod ;
   private String[] T015P13_A396EmprCod ;
   private String[] T015P13_A9878Pe_cod ;
   private String[] T015P14_A407EmprNom ;
   private boolean[] T015P14_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tactpe__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactpe__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactpe__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactpe__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tactpe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T015P2", "SELECT Pe_cod, Pe_np, Pe_npz, Pe_ncaat, Pe_nctaa, Pe_nc1221, Pe_nmp, EmprCod FROM TXPACTPE WHERE EmprCod = ? AND Pe_cod = ?  FOR UPDATE OF Pe_np, Pe_npz, Pe_ncaat, Pe_nctaa, Pe_nc1221, Pe_nmp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P3", "SELECT Pe_cod, Pe_np, Pe_npz, Pe_ncaat, Pe_nctaa, Pe_nc1221, Pe_nmp, EmprCod FROM TXPACTPE WHERE EmprCod = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pe_cod, T2.EmprNom, TM1.Pe_np, TM1.Pe_npz, TM1.Pe_ncaat, TM1.Pe_nctaa, TM1.Pe_nc1221, TM1.Pe_nmp, TM1.EmprCod FROM (TXPACTPE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Pe_cod = ? ORDER BY TM1.EmprCod, TM1.Pe_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pe_cod FROM TXPACTPE WHERE EmprCod = ? AND Pe_cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pe_cod FROM TXPACTPE WHERE ( Pe_cod > ?) and EmprCod = ? ORDER BY EmprCod, Pe_cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015P8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pe_cod FROM TXPACTPE WHERE ( Pe_cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Pe_cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015P9", "INSERT INTO TXPACTPE(Pe_cod, Pe_np, Pe_npz, Pe_ncaat, Pe_nctaa, Pe_nc1221, Pe_nmp, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPACTPE")
         ,new UpdateCursor("T015P10", "UPDATE TXPACTPE SET Pe_np=?, Pe_npz=?, Pe_ncaat=?, Pe_nctaa=?, Pe_nc1221=?, Pe_nmp=?  WHERE EmprCod = ? AND Pe_cod = ?", GX_NOMASK, "TXPACTPE")
         ,new UpdateCursor("T015P11", "DELETE FROM TXPACTPE  WHERE EmprCod = ? AND Pe_cod = ?", GX_NOMASK, "TXPACTPE")
         ,new ForEachCursor("T015P12", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND Pe_cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015P13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Pe_cod FROM TXPACTPE WHERE EmprCod = ? ORDER BY EmprCod, Pe_cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015P14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
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
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
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
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
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
               stmt.setString(8, (String)parms[13], 3);
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
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 6);
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

