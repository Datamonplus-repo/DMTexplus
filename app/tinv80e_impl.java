package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinv80e_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tinv80e_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinv80e_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinv80e_impl.class ));
   }

   public tinv80e_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINV80E.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EArtID_Internalname, GXutil.rtrim( A12959IV80EArtID), GXutil.rtrim( localUtil.format( A12959IV80EArtID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EArtID_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EArtID_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Color+Numero", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EColNI_Internalname, GXutil.rtrim( A12960IV80EColNI), GXutil.rtrim( localUtil.format( A12960IV80EColNI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EColNI_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EColNI_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Tipo Inventario", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80ETpIVI_Internalname, GXutil.rtrim( A12961IV80ETpIVI), GXutil.rtrim( localUtil.format( A12961IV80ETpIVI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80ETpIVI_Jsonclick, 0, "", "", "", "", "", 1, edtIV80ETpIVI_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Metros Stock", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EMtStk_Internalname, GXutil.ltrim( localUtil.ntoc( A12962IV80EMtStk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIV80EMtStk_Enabled!=0) ? localUtil.format( A12962IV80EMtStk, "ZZZZZZ9.99") : localUtil.format( A12962IV80EMtStk, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EMtStk_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EMtStk_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Metros Programados", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EMtPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A12963IV80EMtPrg, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIV80EMtPrg_Enabled!=0) ? localUtil.format( A12963IV80EMtPrg, "ZZZZZZ9.99") : localUtil.format( A12963IV80EMtPrg, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EMtPrg_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EMtPrg_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros Reservados", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EMtRes_Internalname, GXutil.ltrim( localUtil.ntoc( A12964IV80EMtRes, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIV80EMtRes_Enabled!=0) ? localUtil.format( A12964IV80EMtRes, "ZZZZZZ9.99") : localUtil.format( A12964IV80EMtRes, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EMtRes_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EMtRes_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Metros en Produccion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EMtsOE_Internalname, GXutil.ltrim( localUtil.ntoc( A12975IV80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIV80EMtsOE_Enabled!=0) ? localUtil.format( A12975IV80EMtsOE, "ZZZZZZ9.99") : localUtil.format( A12975IV80EMtsOE, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EMtsOE_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EMtsOE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINV80E.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIV80EArtDs_Internalname, GXutil.rtrim( A12983IV80EArtDs), GXutil.rtrim( localUtil.format( A12983IV80EArtDs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIV80EArtDs_Jsonclick, 0, "", "", "", "", "", 1, edtIV80EArtDs_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINV80E.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINV80E.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TINV80E.htm");
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
      e111M42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12959IV80EArtID = httpContext.cgiGet( "Z12959IV80EArtID") ;
            Z12960IV80EColNI = httpContext.cgiGet( "Z12960IV80EColNI") ;
            Z12961IV80ETpIVI = httpContext.cgiGet( "Z12961IV80ETpIVI") ;
            Z12962IV80EMtStk = localUtil.ctond( httpContext.cgiGet( "Z12962IV80EMtStk")) ;
            Z12963IV80EMtPrg = localUtil.ctond( httpContext.cgiGet( "Z12963IV80EMtPrg")) ;
            Z12964IV80EMtRes = localUtil.ctond( httpContext.cgiGet( "Z12964IV80EMtRes")) ;
            Z12975IV80EMtsOE = localUtil.ctond( httpContext.cgiGet( "Z12975IV80EMtsOE")) ;
            Z12983IV80EArtDs = httpContext.cgiGet( "Z12983IV80EArtDs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A12959IV80EArtID = httpContext.cgiGet( edtIV80EArtID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
            A12960IV80EColNI = httpContext.cgiGet( edtIV80EColNI_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
            A12961IV80ETpIVI = httpContext.cgiGet( edtIV80ETpIVI_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIV80EMtStk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIV80EMtStk_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IV80EMTSTK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIV80EMtStk_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12962IV80EMtStk = DecimalUtil.ZERO ;
               n12962IV80EMtStk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrimstr( A12962IV80EMtStk, 10, 2));
            }
            else
            {
               A12962IV80EMtStk = localUtil.ctond( httpContext.cgiGet( edtIV80EMtStk_Internalname)) ;
               n12962IV80EMtStk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrimstr( A12962IV80EMtStk, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIV80EMtPrg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIV80EMtPrg_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IV80EMTPRG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIV80EMtPrg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12963IV80EMtPrg = DecimalUtil.ZERO ;
               n12963IV80EMtPrg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrimstr( A12963IV80EMtPrg, 10, 2));
            }
            else
            {
               A12963IV80EMtPrg = localUtil.ctond( httpContext.cgiGet( edtIV80EMtPrg_Internalname)) ;
               n12963IV80EMtPrg = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrimstr( A12963IV80EMtPrg, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIV80EMtRes_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIV80EMtRes_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IV80EMTRES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIV80EMtRes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12964IV80EMtRes = DecimalUtil.ZERO ;
               n12964IV80EMtRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrimstr( A12964IV80EMtRes, 10, 2));
            }
            else
            {
               A12964IV80EMtRes = localUtil.ctond( httpContext.cgiGet( edtIV80EMtRes_Internalname)) ;
               n12964IV80EMtRes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrimstr( A12964IV80EMtRes, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIV80EMtsOE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIV80EMtsOE_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IV80EMTSOE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIV80EMtsOE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12975IV80EMtsOE = DecimalUtil.ZERO ;
               n12975IV80EMtsOE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrimstr( A12975IV80EMtsOE, 10, 2));
            }
            else
            {
               A12975IV80EMtsOE = localUtil.ctond( httpContext.cgiGet( edtIV80EMtsOE_Internalname)) ;
               n12975IV80EMtsOE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrimstr( A12975IV80EMtsOE, 10, 2));
            }
            A12983IV80EArtDs = httpContext.cgiGet( edtIV80EArtDs_Internalname) ;
            n12983IV80EArtDs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12983IV80EArtDs", A12983IV80EArtDs);
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
               A12959IV80EArtID = httpContext.GetPar( "IV80EArtID") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
               A12960IV80EColNI = httpContext.GetPar( "IV80EColNI") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
               A12961IV80ETpIVI = httpContext.GetPar( "IV80ETpIVI") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
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
                        e111M42 ();
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
            initAll1M41776( ) ;
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
      disableAttributes1M41776( ) ;
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

   public void confirm_1M40( )
   {
      beforeValidate1M41776( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M41776( ) ;
         }
         else
         {
            checkExtendedTable1M41776( ) ;
            if ( AnyError == 0 )
            {
               zm1M41776( 2) ;
            }
            closeExtendedTableCursors1M41776( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1M40( ) ;
      }
   }

   public void resetCaption1M40( )
   {
   }

   public void e111M42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tinv80e_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tinv80e_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tinv80e_impl.this.AV10EmprCod = GXv_char2[0] ;
      tinv80e_impl.this.AV11EmprNom = GXv_char3[0] ;
      tinv80e_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1M41776( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12962IV80EMtStk = T01M43_A12962IV80EMtStk[0] ;
            Z12963IV80EMtPrg = T01M43_A12963IV80EMtPrg[0] ;
            Z12964IV80EMtRes = T01M43_A12964IV80EMtRes[0] ;
            Z12975IV80EMtsOE = T01M43_A12975IV80EMtsOE[0] ;
            Z12983IV80EArtDs = T01M43_A12983IV80EArtDs[0] ;
         }
         else
         {
            Z12962IV80EMtStk = A12962IV80EMtStk ;
            Z12963IV80EMtPrg = A12963IV80EMtPrg ;
            Z12964IV80EMtRes = A12964IV80EMtRes ;
            Z12975IV80EMtsOE = A12975IV80EMtsOE ;
            Z12983IV80EArtDs = A12983IV80EArtDs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12959IV80EArtID = A12959IV80EArtID ;
         Z12960IV80EColNI = A12960IV80EColNI ;
         Z12961IV80ETpIVI = A12961IV80ETpIVI ;
         Z12962IV80EMtStk = A12962IV80EMtStk ;
         Z12963IV80EMtPrg = A12963IV80EMtPrg ;
         Z12964IV80EMtRes = A12964IV80EMtRes ;
         Z12975IV80EMtsOE = A12975IV80EMtsOE ;
         Z12983IV80EArtDs = A12983IV80EArtDs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1M41776( )
   {
      /* Using cursor T01M45 */
      pr_default.execute(3, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1776 = (short)(1) ;
         A407EmprNom = T01M45_A407EmprNom[0] ;
         n407EmprNom = T01M45_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12962IV80EMtStk = T01M45_A12962IV80EMtStk[0] ;
         n12962IV80EMtStk = T01M45_n12962IV80EMtStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrimstr( A12962IV80EMtStk, 10, 2));
         A12963IV80EMtPrg = T01M45_A12963IV80EMtPrg[0] ;
         n12963IV80EMtPrg = T01M45_n12963IV80EMtPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrimstr( A12963IV80EMtPrg, 10, 2));
         A12964IV80EMtRes = T01M45_A12964IV80EMtRes[0] ;
         n12964IV80EMtRes = T01M45_n12964IV80EMtRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrimstr( A12964IV80EMtRes, 10, 2));
         A12975IV80EMtsOE = T01M45_A12975IV80EMtsOE[0] ;
         n12975IV80EMtsOE = T01M45_n12975IV80EMtsOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrimstr( A12975IV80EMtsOE, 10, 2));
         A12983IV80EArtDs = T01M45_A12983IV80EArtDs[0] ;
         n12983IV80EArtDs = T01M45_n12983IV80EArtDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12983IV80EArtDs", A12983IV80EArtDs);
         zm1M41776( -1) ;
      }
      pr_default.close(3);
      onLoadActions1M41776( ) ;
   }

   public void onLoadActions1M41776( )
   {
   }

   public void checkExtendedTable1M41776( )
   {
      nIsDirty_1776 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01M44 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M44_A407EmprNom[0] ;
      n407EmprNom = T01M44_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1M41776( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01M46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M46_A407EmprNom[0] ;
      n407EmprNom = T01M46_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1M41776( )
   {
      /* Using cursor T01M47 */
      pr_default.execute(5, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1776 = (short)(1) ;
      }
      else
      {
         RcdFound1776 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M43 */
      pr_default.execute(1, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1M41776( 1) ;
         RcdFound1776 = (short)(1) ;
         A12959IV80EArtID = T01M43_A12959IV80EArtID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
         A12960IV80EColNI = T01M43_A12960IV80EColNI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
         A12961IV80ETpIVI = T01M43_A12961IV80ETpIVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
         A12962IV80EMtStk = T01M43_A12962IV80EMtStk[0] ;
         n12962IV80EMtStk = T01M43_n12962IV80EMtStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrimstr( A12962IV80EMtStk, 10, 2));
         A12963IV80EMtPrg = T01M43_A12963IV80EMtPrg[0] ;
         n12963IV80EMtPrg = T01M43_n12963IV80EMtPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrimstr( A12963IV80EMtPrg, 10, 2));
         A12964IV80EMtRes = T01M43_A12964IV80EMtRes[0] ;
         n12964IV80EMtRes = T01M43_n12964IV80EMtRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrimstr( A12964IV80EMtRes, 10, 2));
         A12975IV80EMtsOE = T01M43_A12975IV80EMtsOE[0] ;
         n12975IV80EMtsOE = T01M43_n12975IV80EMtsOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrimstr( A12975IV80EMtsOE, 10, 2));
         A12983IV80EArtDs = T01M43_A12983IV80EArtDs[0] ;
         n12983IV80EArtDs = T01M43_n12983IV80EArtDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12983IV80EArtDs", A12983IV80EArtDs);
         A396EmprCod = T01M43_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z12959IV80EArtID = A12959IV80EArtID ;
         Z12960IV80EColNI = A12960IV80EColNI ;
         Z12961IV80ETpIVI = A12961IV80ETpIVI ;
         sMode1776 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M41776( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1776 = (short)(0) ;
            initializeNonKey1M41776( ) ;
         }
         Gx_mode = sMode1776 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1776 = (short)(0) ;
         initializeNonKey1M41776( ) ;
         sMode1776 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1776 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1M41776( ) ;
      if ( RcdFound1776 == 0 )
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
      RcdFound1776 = (short)(0) ;
      /* Using cursor T01M48 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, A12959IV80EArtID, A12959IV80EArtID, A396EmprCod, A12960IV80EColNI, A12960IV80EColNI, A12959IV80EArtID, A396EmprCod, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) < 0 ) || ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12960IV80EColNI[0], A12960IV80EColNI) < 0 ) || ( GXutil.strcmp(T01M48_A12960IV80EColNI[0], A12960IV80EColNI) == 0 ) && ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12961IV80ETpIVI[0], A12961IV80ETpIVI) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) > 0 ) || ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12960IV80EColNI[0], A12960IV80EColNI) > 0 ) || ( GXutil.strcmp(T01M48_A12960IV80EColNI[0], A12960IV80EColNI) == 0 ) && ( GXutil.strcmp(T01M48_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M48_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M48_A12961IV80ETpIVI[0], A12961IV80ETpIVI) > 0 ) ) )
         {
            A396EmprCod = T01M48_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12959IV80EArtID = T01M48_A12959IV80EArtID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
            A12960IV80EColNI = T01M48_A12960IV80EColNI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
            A12961IV80ETpIVI = T01M48_A12961IV80ETpIVI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
            RcdFound1776 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1776 = (short)(0) ;
      /* Using cursor T01M49 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A12959IV80EArtID, A12959IV80EArtID, A396EmprCod, A12960IV80EColNI, A12960IV80EColNI, A12959IV80EArtID, A396EmprCod, A12961IV80ETpIVI});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) > 0 ) || ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12960IV80EColNI[0], A12960IV80EColNI) > 0 ) || ( GXutil.strcmp(T01M49_A12960IV80EColNI[0], A12960IV80EColNI) == 0 ) && ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12961IV80ETpIVI[0], A12961IV80ETpIVI) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) < 0 ) || ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12960IV80EColNI[0], A12960IV80EColNI) < 0 ) || ( GXutil.strcmp(T01M49_A12960IV80EColNI[0], A12960IV80EColNI) == 0 ) && ( GXutil.strcmp(T01M49_A12959IV80EArtID[0], A12959IV80EArtID) == 0 ) && ( GXutil.strcmp(T01M49_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01M49_A12961IV80ETpIVI[0], A12961IV80ETpIVI) < 0 ) ) )
         {
            A396EmprCod = T01M49_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12959IV80EArtID = T01M49_A12959IV80EArtID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
            A12960IV80EColNI = T01M49_A12960IV80EColNI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
            A12961IV80ETpIVI = T01M49_A12961IV80ETpIVI[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
            RcdFound1776 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M41776( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M41776( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1776 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12959IV80EArtID, Z12959IV80EArtID) != 0 ) || ( GXutil.strcmp(A12960IV80EColNI, Z12960IV80EColNI) != 0 ) || ( GXutil.strcmp(A12961IV80ETpIVI, Z12961IV80ETpIVI) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A12959IV80EArtID = Z12959IV80EArtID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
               A12960IV80EColNI = Z12960IV80EColNI ;
               httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
               A12961IV80ETpIVI = Z12961IV80ETpIVI ;
               httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1M41776( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12959IV80EArtID, Z12959IV80EArtID) != 0 ) || ( GXutil.strcmp(A12960IV80EColNI, Z12960IV80EColNI) != 0 ) || ( GXutil.strcmp(A12961IV80ETpIVI, Z12961IV80ETpIVI) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M41776( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M41776( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12959IV80EArtID, Z12959IV80EArtID) != 0 ) || ( GXutil.strcmp(A12960IV80EColNI, Z12960IV80EColNI) != 0 ) || ( GXutil.strcmp(A12961IV80ETpIVI, Z12961IV80ETpIVI) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12959IV80EArtID = Z12959IV80EArtID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
         A12960IV80EColNI = Z12960IV80EColNI ;
         httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
         A12961IV80ETpIVI = Z12961IV80ETpIVI ;
         httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1M41776( ) ;
      if ( RcdFound1776 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12959IV80EArtID, Z12959IV80EArtID) != 0 ) || ( GXutil.strcmp(A12960IV80EColNI, Z12960IV80EColNI) != 0 ) || ( GXutil.strcmp(A12961IV80ETpIVI, Z12961IV80ETpIVI) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A12959IV80EArtID = Z12959IV80EArtID ;
            httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
            A12960IV80EColNI = Z12960IV80EColNI ;
            httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
            A12961IV80ETpIVI = Z12961IV80ETpIVI ;
            httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12959IV80EArtID, Z12959IV80EArtID) != 0 ) || ( GXutil.strcmp(A12960IV80EColNI, Z12960IV80EColNI) != 0 ) || ( GXutil.strcmp(A12961IV80ETpIVI, Z12961IV80ETpIVI) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tinv80e");
      GX_FocusControl = edtIV80EMtStk_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1M40( ) ;
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
      if ( RcdFound1776 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtIV80EMtStk_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1M41776( ) ;
      if ( RcdFound1776 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIV80EMtStk_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M41776( ) ;
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
      if ( RcdFound1776 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIV80EMtStk_Internalname ;
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
      if ( RcdFound1776 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIV80EMtStk_Internalname ;
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
      scanStart1M41776( ) ;
      if ( RcdFound1776 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1776 != 0 )
         {
            scanNext1M41776( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIV80EMtStk_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M41776( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M41776( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M42 */
         pr_default.execute(0, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINV80E"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12962IV80EMtStk, T01M42_A12962IV80EMtStk[0]) != 0 ) || ( DecimalUtil.compareTo(Z12963IV80EMtPrg, T01M42_A12963IV80EMtPrg[0]) != 0 ) || ( DecimalUtil.compareTo(Z12964IV80EMtRes, T01M42_A12964IV80EMtRes[0]) != 0 ) || ( DecimalUtil.compareTo(Z12975IV80EMtsOE, T01M42_A12975IV80EMtsOE[0]) != 0 ) || ( GXutil.strcmp(Z12983IV80EArtDs, T01M42_A12983IV80EArtDs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12962IV80EMtStk, T01M42_A12962IV80EMtStk[0]) != 0 )
            {
               GXutil.writeLogln("tinv80e:[seudo value changed for attri]"+"IV80EMtStk");
               GXutil.writeLogRaw("Old: ",Z12962IV80EMtStk);
               GXutil.writeLogRaw("Current: ",T01M42_A12962IV80EMtStk[0]);
            }
            if ( DecimalUtil.compareTo(Z12963IV80EMtPrg, T01M42_A12963IV80EMtPrg[0]) != 0 )
            {
               GXutil.writeLogln("tinv80e:[seudo value changed for attri]"+"IV80EMtPrg");
               GXutil.writeLogRaw("Old: ",Z12963IV80EMtPrg);
               GXutil.writeLogRaw("Current: ",T01M42_A12963IV80EMtPrg[0]);
            }
            if ( DecimalUtil.compareTo(Z12964IV80EMtRes, T01M42_A12964IV80EMtRes[0]) != 0 )
            {
               GXutil.writeLogln("tinv80e:[seudo value changed for attri]"+"IV80EMtRes");
               GXutil.writeLogRaw("Old: ",Z12964IV80EMtRes);
               GXutil.writeLogRaw("Current: ",T01M42_A12964IV80EMtRes[0]);
            }
            if ( DecimalUtil.compareTo(Z12975IV80EMtsOE, T01M42_A12975IV80EMtsOE[0]) != 0 )
            {
               GXutil.writeLogln("tinv80e:[seudo value changed for attri]"+"IV80EMtsOE");
               GXutil.writeLogRaw("Old: ",Z12975IV80EMtsOE);
               GXutil.writeLogRaw("Current: ",T01M42_A12975IV80EMtsOE[0]);
            }
            if ( GXutil.strcmp(Z12983IV80EArtDs, T01M42_A12983IV80EArtDs[0]) != 0 )
            {
               GXutil.writeLogln("tinv80e:[seudo value changed for attri]"+"IV80EArtDs");
               GXutil.writeLogRaw("Old: ",Z12983IV80EArtDs);
               GXutil.writeLogRaw("Current: ",T01M42_A12983IV80EArtDs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINV80E"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M41776( )
   {
      beforeValidate1M41776( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M41776( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M41776( 0) ;
         checkOptimisticConcurrency1M41776( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M41776( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M41776( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M410 */
                  pr_default.execute(8, new Object[] {A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI, Boolean.valueOf(n12962IV80EMtStk), A12962IV80EMtStk, Boolean.valueOf(n12963IV80EMtPrg), A12963IV80EMtPrg, Boolean.valueOf(n12964IV80EMtRes), A12964IV80EMtRes, Boolean.valueOf(n12975IV80EMtsOE), A12975IV80EMtsOE, Boolean.valueOf(n12983IV80EArtDs), A12983IV80EArtDs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINV80E");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        resetCaption1M40( ) ;
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
            load1M41776( ) ;
         }
         endLevel1M41776( ) ;
      }
      closeExtendedTableCursors1M41776( ) ;
   }

   public void update1M41776( )
   {
      beforeValidate1M41776( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M41776( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M41776( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M41776( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M41776( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M411 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12962IV80EMtStk), A12962IV80EMtStk, Boolean.valueOf(n12963IV80EMtPrg), A12963IV80EMtPrg, Boolean.valueOf(n12964IV80EMtRes), A12964IV80EMtRes, Boolean.valueOf(n12975IV80EMtsOE), A12975IV80EMtsOE, Boolean.valueOf(n12983IV80EArtDs), A12983IV80EArtDs, A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINV80E");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINV80E"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M41776( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1M40( ) ;
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
         endLevel1M41776( ) ;
      }
      closeExtendedTableCursors1M41776( ) ;
   }

   public void deferredUpdate1M41776( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M41776( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M41776( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M41776( ) ;
         afterConfirm1M41776( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M41776( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M412 */
               pr_default.execute(10, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINV80E");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1776 == 0 )
                     {
                        initAll1M41776( ) ;
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
                     resetCaption1M40( ) ;
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
      sMode1776 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M41776( ) ;
      Gx_mode = sMode1776 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M41776( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01M413 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         A407EmprNom = T01M413_A407EmprNom[0] ;
         n407EmprNom = T01M413_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01M414 */
         pr_default.execute(12, new Object[] {A396EmprCod, A12959IV80EArtID, A12960IV80EColNI, A12961IV80ETpIVI});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1M41776( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1M41776( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tinv80e");
         if ( AnyError == 0 )
         {
            confirmValues1M40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tinv80e");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M41776( )
   {
      /* Scan By routine */
      /* Using cursor T01M415 */
      pr_default.execute(13);
      RcdFound1776 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1776 = (short)(1) ;
         A396EmprCod = T01M415_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12959IV80EArtID = T01M415_A12959IV80EArtID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
         A12960IV80EColNI = T01M415_A12960IV80EColNI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
         A12961IV80ETpIVI = T01M415_A12961IV80ETpIVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M41776( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1776 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1776 = (short)(1) ;
         A396EmprCod = T01M415_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12959IV80EArtID = T01M415_A12959IV80EArtID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
         A12960IV80EColNI = T01M415_A12960IV80EColNI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
         A12961IV80ETpIVI = T01M415_A12961IV80ETpIVI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
      }
   }

   public void scanEnd1M41776( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1M41776( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M41776( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M41776( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M41776( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M41776( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M41776( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M41776( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtIV80EArtID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EArtID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EArtID_Enabled), 5, 0), true);
      edtIV80EColNI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EColNI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EColNI_Enabled), 5, 0), true);
      edtIV80ETpIVI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80ETpIVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80ETpIVI_Enabled), 5, 0), true);
      edtIV80EMtStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EMtStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EMtStk_Enabled), 5, 0), true);
      edtIV80EMtPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EMtPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EMtPrg_Enabled), 5, 0), true);
      edtIV80EMtRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EMtRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EMtRes_Enabled), 5, 0), true);
      edtIV80EMtsOE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EMtsOE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EMtsOE_Enabled), 5, 0), true);
      edtIV80EArtDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIV80EArtDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIV80EArtDs_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1M41776( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1M40( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tinv80e", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12959IV80EArtID", GXutil.rtrim( Z12959IV80EArtID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12960IV80EColNI", GXutil.rtrim( Z12960IV80EColNI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12961IV80ETpIVI", GXutil.rtrim( Z12961IV80ETpIVI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12962IV80EMtStk", GXutil.ltrim( localUtil.ntoc( Z12962IV80EMtStk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12963IV80EMtPrg", GXutil.ltrim( localUtil.ntoc( Z12963IV80EMtPrg, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12964IV80EMtRes", GXutil.ltrim( localUtil.ntoc( Z12964IV80EMtRes, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12975IV80EMtsOE", GXutil.ltrim( localUtil.ntoc( Z12975IV80EMtsOE, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12983IV80EArtDs", GXutil.rtrim( Z12983IV80EArtDs));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tinv80e", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TINV80E" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", "") ;
   }

   public void initializeNonKey1M41776( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A12962IV80EMtStk = DecimalUtil.ZERO ;
      n12962IV80EMtStk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrimstr( A12962IV80EMtStk, 10, 2));
      A12963IV80EMtPrg = DecimalUtil.ZERO ;
      n12963IV80EMtPrg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrimstr( A12963IV80EMtPrg, 10, 2));
      A12964IV80EMtRes = DecimalUtil.ZERO ;
      n12964IV80EMtRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrimstr( A12964IV80EMtRes, 10, 2));
      A12975IV80EMtsOE = DecimalUtil.ZERO ;
      n12975IV80EMtsOE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrimstr( A12975IV80EMtsOE, 10, 2));
      A12983IV80EArtDs = "" ;
      n12983IV80EArtDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12983IV80EArtDs", A12983IV80EArtDs);
      Z12962IV80EMtStk = DecimalUtil.ZERO ;
      Z12963IV80EMtPrg = DecimalUtil.ZERO ;
      Z12964IV80EMtRes = DecimalUtil.ZERO ;
      Z12975IV80EMtsOE = DecimalUtil.ZERO ;
      Z12983IV80EArtDs = "" ;
   }

   public void initAll1M41776( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A12959IV80EArtID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12959IV80EArtID", A12959IV80EArtID);
      A12960IV80EColNI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12960IV80EColNI", A12960IV80EColNI);
      A12961IV80ETpIVI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12961IV80ETpIVI", A12961IV80ETpIVI);
      initializeNonKey1M41776( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241592395", true, true);
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
      httpContext.AddJavascriptSource("tinv80e.js", "?20268241592395", false, true);
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
      edtIV80EArtID_Internalname = "IV80EARTID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtIV80EColNI_Internalname = "IV80ECOLNI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtIV80ETpIVI_Internalname = "IV80ETPIVI" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtIV80EMtStk_Internalname = "IV80EMTSTK" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtIV80EMtPrg_Internalname = "IV80EMTPRG" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtIV80EMtRes_Internalname = "IV80EMTRES" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtIV80EMtsOE_Internalname = "IV80EMTSOE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtIV80EArtDs_Internalname = "IV80EARTDS" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA INVENTARIO 80 ESTAMPACION", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtIV80EArtDs_Jsonclick = "" ;
      edtIV80EArtDs_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EArtDs_Enabled = 1 ;
      edtIV80EMtsOE_Jsonclick = "" ;
      edtIV80EMtsOE_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EMtsOE_Enabled = 1 ;
      edtIV80EMtRes_Jsonclick = "" ;
      edtIV80EMtRes_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EMtRes_Enabled = 1 ;
      edtIV80EMtPrg_Jsonclick = "" ;
      edtIV80EMtPrg_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EMtPrg_Enabled = 1 ;
      edtIV80EMtStk_Jsonclick = "" ;
      edtIV80EMtStk_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EMtStk_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtIV80ETpIVI_Jsonclick = "" ;
      edtIV80ETpIVI_Backcolor = (int)(0xFFFFFF) ;
      edtIV80ETpIVI_Enabled = 1 ;
      edtIV80EColNI_Jsonclick = "" ;
      edtIV80EColNI_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EColNI_Enabled = 1 ;
      edtIV80EArtID_Jsonclick = "" ;
      edtIV80EArtID_Backcolor = (int)(0xFFFFFF) ;
      edtIV80EArtID_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      /* Using cursor T01M413 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01M413_A407EmprNom[0] ;
      n407EmprNom = T01M413_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtIV80EMtStk_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01M413 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01M413_A407EmprNom[0] ;
      n407EmprNom = T01M413_n407EmprNom[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Iv80etpivi( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12962IV80EMtStk", GXutil.ltrim( localUtil.ntoc( A12962IV80EMtStk, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12963IV80EMtPrg", GXutil.ltrim( localUtil.ntoc( A12963IV80EMtPrg, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12964IV80EMtRes", GXutil.ltrim( localUtil.ntoc( A12964IV80EMtRes, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12975IV80EMtsOE", GXutil.ltrim( localUtil.ntoc( A12975IV80EMtsOE, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12983IV80EArtDs", GXutil.rtrim( A12983IV80EArtDs));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12959IV80EArtID", GXutil.rtrim( Z12959IV80EArtID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12960IV80EColNI", GXutil.rtrim( Z12960IV80EColNI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12961IV80ETpIVI", GXutil.rtrim( Z12961IV80ETpIVI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12962IV80EMtStk", GXutil.ltrim( localUtil.ntoc( Z12962IV80EMtStk, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12963IV80EMtPrg", GXutil.ltrim( localUtil.ntoc( Z12963IV80EMtPrg, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12964IV80EMtRes", GXutil.ltrim( localUtil.ntoc( Z12964IV80EMtRes, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12975IV80EMtsOE", GXutil.ltrim( localUtil.ntoc( Z12975IV80EMtsOE, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12983IV80EArtDs", GXutil.rtrim( Z12983IV80EArtDs));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_IV80EARTID","{handler:'valid_Iv80eartid',iparms:[]");
      setEventMetadata("VALID_IV80EARTID",",oparms:[]}");
      setEventMetadata("VALID_IV80ECOLNI","{handler:'valid_Iv80ecolni',iparms:[]");
      setEventMetadata("VALID_IV80ECOLNI",",oparms:[]}");
      setEventMetadata("VALID_IV80ETPIVI","{handler:'valid_Iv80etpivi',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12959IV80EArtID',fld:'IV80EARTID',pic:''},{av:'A12960IV80EColNI',fld:'IV80ECOLNI',pic:''},{av:'A12961IV80ETpIVI',fld:'IV80ETPIVI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_IV80ETPIVI",",oparms:[{av:'A12962IV80EMtStk',fld:'IV80EMTSTK',pic:'ZZZZZZ9.99'},{av:'A12963IV80EMtPrg',fld:'IV80EMTPRG',pic:'ZZZZZZ9.99'},{av:'A12964IV80EMtRes',fld:'IV80EMTRES',pic:'ZZZZZZ9.99'},{av:'A12975IV80EMtsOE',fld:'IV80EMTSOE',pic:'ZZZZZZ9.99'},{av:'A12983IV80EArtDs',fld:'IV80EARTDS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12959IV80EArtID'},{av:'Z12960IV80EColNI'},{av:'Z12961IV80ETpIVI'},{av:'Z12962IV80EMtStk'},{av:'Z12963IV80EMtPrg'},{av:'Z12964IV80EMtRes'},{av:'Z12975IV80EMtsOE'},{av:'Z12983IV80EArtDs'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z12959IV80EArtID = "" ;
      Z12960IV80EColNI = "" ;
      Z12961IV80ETpIVI = "" ;
      Z12962IV80EMtStk = DecimalUtil.ZERO ;
      Z12963IV80EMtPrg = DecimalUtil.ZERO ;
      Z12964IV80EMtRes = DecimalUtil.ZERO ;
      Z12975IV80EMtsOE = DecimalUtil.ZERO ;
      Z12983IV80EArtDs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12959IV80EArtID = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12960IV80EColNI = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12961IV80ETpIVI = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12962IV80EMtStk = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A12963IV80EMtPrg = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A12964IV80EMtRes = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A12975IV80EMtsOE = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A12983IV80EArtDs = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T01M45_A12959IV80EArtID = new String[] {""} ;
      T01M45_A12960IV80EColNI = new String[] {""} ;
      T01M45_A12961IV80ETpIVI = new String[] {""} ;
      T01M45_A407EmprNom = new String[] {""} ;
      T01M45_n407EmprNom = new boolean[] {false} ;
      T01M45_A12962IV80EMtStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M45_n12962IV80EMtStk = new boolean[] {false} ;
      T01M45_A12963IV80EMtPrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M45_n12963IV80EMtPrg = new boolean[] {false} ;
      T01M45_A12964IV80EMtRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M45_n12964IV80EMtRes = new boolean[] {false} ;
      T01M45_A12975IV80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M45_n12975IV80EMtsOE = new boolean[] {false} ;
      T01M45_A12983IV80EArtDs = new String[] {""} ;
      T01M45_n12983IV80EArtDs = new boolean[] {false} ;
      T01M45_A396EmprCod = new String[] {""} ;
      T01M44_A407EmprNom = new String[] {""} ;
      T01M44_n407EmprNom = new boolean[] {false} ;
      T01M46_A407EmprNom = new String[] {""} ;
      T01M46_n407EmprNom = new boolean[] {false} ;
      T01M47_A396EmprCod = new String[] {""} ;
      T01M47_A12959IV80EArtID = new String[] {""} ;
      T01M47_A12960IV80EColNI = new String[] {""} ;
      T01M47_A12961IV80ETpIVI = new String[] {""} ;
      T01M43_A12959IV80EArtID = new String[] {""} ;
      T01M43_A12960IV80EColNI = new String[] {""} ;
      T01M43_A12961IV80ETpIVI = new String[] {""} ;
      T01M43_A12962IV80EMtStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M43_n12962IV80EMtStk = new boolean[] {false} ;
      T01M43_A12963IV80EMtPrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M43_n12963IV80EMtPrg = new boolean[] {false} ;
      T01M43_A12964IV80EMtRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M43_n12964IV80EMtRes = new boolean[] {false} ;
      T01M43_A12975IV80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M43_n12975IV80EMtsOE = new boolean[] {false} ;
      T01M43_A12983IV80EArtDs = new String[] {""} ;
      T01M43_n12983IV80EArtDs = new boolean[] {false} ;
      T01M43_A396EmprCod = new String[] {""} ;
      sMode1776 = "" ;
      T01M48_A396EmprCod = new String[] {""} ;
      T01M48_A12959IV80EArtID = new String[] {""} ;
      T01M48_A12960IV80EColNI = new String[] {""} ;
      T01M48_A12961IV80ETpIVI = new String[] {""} ;
      T01M49_A396EmprCod = new String[] {""} ;
      T01M49_A12959IV80EArtID = new String[] {""} ;
      T01M49_A12960IV80EColNI = new String[] {""} ;
      T01M49_A12961IV80ETpIVI = new String[] {""} ;
      T01M42_A12959IV80EArtID = new String[] {""} ;
      T01M42_A12960IV80EColNI = new String[] {""} ;
      T01M42_A12961IV80ETpIVI = new String[] {""} ;
      T01M42_A12962IV80EMtStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M42_n12962IV80EMtStk = new boolean[] {false} ;
      T01M42_A12963IV80EMtPrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M42_n12963IV80EMtPrg = new boolean[] {false} ;
      T01M42_A12964IV80EMtRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M42_n12964IV80EMtRes = new boolean[] {false} ;
      T01M42_A12975IV80EMtsOE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M42_n12975IV80EMtsOE = new boolean[] {false} ;
      T01M42_A12983IV80EArtDs = new String[] {""} ;
      T01M42_n12983IV80EArtDs = new boolean[] {false} ;
      T01M42_A396EmprCod = new String[] {""} ;
      T01M413_A407EmprNom = new String[] {""} ;
      T01M413_n407EmprNom = new boolean[] {false} ;
      T01M414_A396EmprCod = new String[] {""} ;
      T01M414_A12965AS80EPedID = new String[] {""} ;
      T01M414_A12966AS80EDibID = new String[] {""} ;
      T01M414_A12967AS80EVarID = new String[] {""} ;
      T01M414_A12970AS80ELinea = new short[1] ;
      T01M415_A396EmprCod = new String[] {""} ;
      T01M415_A12959IV80EArtID = new String[] {""} ;
      T01M415_A12960IV80EColNI = new String[] {""} ;
      T01M415_A12961IV80ETpIVI = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ12959IV80EArtID = "" ;
      ZZ12960IV80EColNI = "" ;
      ZZ12961IV80ETpIVI = "" ;
      ZZ12962IV80EMtStk = DecimalUtil.ZERO ;
      ZZ12963IV80EMtPrg = DecimalUtil.ZERO ;
      ZZ12964IV80EMtRes = DecimalUtil.ZERO ;
      ZZ12975IV80EMtsOE = DecimalUtil.ZERO ;
      ZZ12983IV80EArtDs = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tinv80e__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tinv80e__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tinv80e__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tinv80e__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tinv80e__default(),
         new Object[] {
             new Object[] {
            T01M42_A12959IV80EArtID, T01M42_A12960IV80EColNI, T01M42_A12961IV80ETpIVI, T01M42_A12962IV80EMtStk, T01M42_n12962IV80EMtStk, T01M42_A12963IV80EMtPrg, T01M42_n12963IV80EMtPrg, T01M42_A12964IV80EMtRes, T01M42_n12964IV80EMtRes, T01M42_A12975IV80EMtsOE,
            T01M42_n12975IV80EMtsOE, T01M42_A12983IV80EArtDs, T01M42_n12983IV80EArtDs, T01M42_A396EmprCod
            }
            , new Object[] {
            T01M43_A12959IV80EArtID, T01M43_A12960IV80EColNI, T01M43_A12961IV80ETpIVI, T01M43_A12962IV80EMtStk, T01M43_n12962IV80EMtStk, T01M43_A12963IV80EMtPrg, T01M43_n12963IV80EMtPrg, T01M43_A12964IV80EMtRes, T01M43_n12964IV80EMtRes, T01M43_A12975IV80EMtsOE,
            T01M43_n12975IV80EMtsOE, T01M43_A12983IV80EArtDs, T01M43_n12983IV80EArtDs, T01M43_A396EmprCod
            }
            , new Object[] {
            T01M44_A407EmprNom, T01M44_n407EmprNom
            }
            , new Object[] {
            T01M45_A12959IV80EArtID, T01M45_A12960IV80EColNI, T01M45_A12961IV80ETpIVI, T01M45_A407EmprNom, T01M45_n407EmprNom, T01M45_A12962IV80EMtStk, T01M45_n12962IV80EMtStk, T01M45_A12963IV80EMtPrg, T01M45_n12963IV80EMtPrg, T01M45_A12964IV80EMtRes,
            T01M45_n12964IV80EMtRes, T01M45_A12975IV80EMtsOE, T01M45_n12975IV80EMtsOE, T01M45_A12983IV80EArtDs, T01M45_n12983IV80EArtDs, T01M45_A396EmprCod
            }
            , new Object[] {
            T01M46_A407EmprNom, T01M46_n407EmprNom
            }
            , new Object[] {
            T01M47_A396EmprCod, T01M47_A12959IV80EArtID, T01M47_A12960IV80EColNI, T01M47_A12961IV80ETpIVI
            }
            , new Object[] {
            T01M48_A396EmprCod, T01M48_A12959IV80EArtID, T01M48_A12960IV80EColNI, T01M48_A12961IV80ETpIVI
            }
            , new Object[] {
            T01M49_A396EmprCod, T01M49_A12959IV80EArtID, T01M49_A12960IV80EColNI, T01M49_A12961IV80ETpIVI
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M413_A407EmprNom, T01M413_n407EmprNom
            }
            , new Object[] {
            T01M414_A396EmprCod, T01M414_A12965AS80EPedID, T01M414_A12966AS80EDibID, T01M414_A12967AS80EVarID, T01M414_A12970AS80ELinea
            }
            , new Object[] {
            T01M415_A396EmprCod, T01M415_A12959IV80EArtID, T01M415_A12960IV80EColNI, T01M415_A12961IV80ETpIVI
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1776 ;
   private short nIsDirty_1776 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtIV80EArtID_Enabled ;
   private int edtIV80EColNI_Enabled ;
   private int edtIV80ETpIVI_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtIV80EMtStk_Enabled ;
   private int edtIV80EMtPrg_Enabled ;
   private int edtIV80EMtRes_Enabled ;
   private int edtIV80EMtsOE_Enabled ;
   private int edtIV80EArtDs_Enabled ;
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
   private int edtIV80EArtDs_Backcolor ;
   private int edtIV80EMtsOE_Backcolor ;
   private int edtIV80EMtRes_Backcolor ;
   private int edtIV80EMtPrg_Backcolor ;
   private int edtIV80EMtStk_Backcolor ;
   private int edtIV80ETpIVI_Backcolor ;
   private int edtIV80EColNI_Backcolor ;
   private int edtIV80EArtID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z12962IV80EMtStk ;
   private java.math.BigDecimal Z12963IV80EMtPrg ;
   private java.math.BigDecimal Z12964IV80EMtRes ;
   private java.math.BigDecimal Z12975IV80EMtsOE ;
   private java.math.BigDecimal A12962IV80EMtStk ;
   private java.math.BigDecimal A12963IV80EMtPrg ;
   private java.math.BigDecimal A12964IV80EMtRes ;
   private java.math.BigDecimal A12975IV80EMtsOE ;
   private java.math.BigDecimal ZZ12962IV80EMtStk ;
   private java.math.BigDecimal ZZ12963IV80EMtPrg ;
   private java.math.BigDecimal ZZ12964IV80EMtRes ;
   private java.math.BigDecimal ZZ12975IV80EMtsOE ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12959IV80EArtID ;
   private String Z12960IV80EColNI ;
   private String Z12961IV80ETpIVI ;
   private String Z12983IV80EArtDs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtIV80EArtID_Internalname ;
   private String A12959IV80EArtID ;
   private String edtIV80EArtID_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtIV80EColNI_Internalname ;
   private String A12960IV80EColNI ;
   private String edtIV80EColNI_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtIV80ETpIVI_Internalname ;
   private String A12961IV80ETpIVI ;
   private String edtIV80ETpIVI_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtIV80EMtStk_Internalname ;
   private String edtIV80EMtStk_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtIV80EMtPrg_Internalname ;
   private String edtIV80EMtPrg_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtIV80EMtRes_Internalname ;
   private String edtIV80EMtRes_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtIV80EMtsOE_Internalname ;
   private String edtIV80EMtsOE_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtIV80EArtDs_Internalname ;
   private String A12983IV80EArtDs ;
   private String edtIV80EArtDs_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode1776 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ12959IV80EArtID ;
   private String ZZ12960IV80EColNI ;
   private String ZZ12961IV80ETpIVI ;
   private String ZZ12983IV80EArtDs ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n12962IV80EMtStk ;
   private boolean n12963IV80EMtPrg ;
   private boolean n12964IV80EMtRes ;
   private boolean n12975IV80EMtsOE ;
   private boolean n12983IV80EArtDs ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01M45_A12959IV80EArtID ;
   private String[] T01M45_A12960IV80EColNI ;
   private String[] T01M45_A12961IV80ETpIVI ;
   private String[] T01M45_A407EmprNom ;
   private boolean[] T01M45_n407EmprNom ;
   private java.math.BigDecimal[] T01M45_A12962IV80EMtStk ;
   private boolean[] T01M45_n12962IV80EMtStk ;
   private java.math.BigDecimal[] T01M45_A12963IV80EMtPrg ;
   private boolean[] T01M45_n12963IV80EMtPrg ;
   private java.math.BigDecimal[] T01M45_A12964IV80EMtRes ;
   private boolean[] T01M45_n12964IV80EMtRes ;
   private java.math.BigDecimal[] T01M45_A12975IV80EMtsOE ;
   private boolean[] T01M45_n12975IV80EMtsOE ;
   private String[] T01M45_A12983IV80EArtDs ;
   private boolean[] T01M45_n12983IV80EArtDs ;
   private String[] T01M45_A396EmprCod ;
   private String[] T01M44_A407EmprNom ;
   private boolean[] T01M44_n407EmprNom ;
   private String[] T01M46_A407EmprNom ;
   private boolean[] T01M46_n407EmprNom ;
   private String[] T01M47_A396EmprCod ;
   private String[] T01M47_A12959IV80EArtID ;
   private String[] T01M47_A12960IV80EColNI ;
   private String[] T01M47_A12961IV80ETpIVI ;
   private String[] T01M43_A12959IV80EArtID ;
   private String[] T01M43_A12960IV80EColNI ;
   private String[] T01M43_A12961IV80ETpIVI ;
   private java.math.BigDecimal[] T01M43_A12962IV80EMtStk ;
   private boolean[] T01M43_n12962IV80EMtStk ;
   private java.math.BigDecimal[] T01M43_A12963IV80EMtPrg ;
   private boolean[] T01M43_n12963IV80EMtPrg ;
   private java.math.BigDecimal[] T01M43_A12964IV80EMtRes ;
   private boolean[] T01M43_n12964IV80EMtRes ;
   private java.math.BigDecimal[] T01M43_A12975IV80EMtsOE ;
   private boolean[] T01M43_n12975IV80EMtsOE ;
   private String[] T01M43_A12983IV80EArtDs ;
   private boolean[] T01M43_n12983IV80EArtDs ;
   private String[] T01M43_A396EmprCod ;
   private String[] T01M48_A396EmprCod ;
   private String[] T01M48_A12959IV80EArtID ;
   private String[] T01M48_A12960IV80EColNI ;
   private String[] T01M48_A12961IV80ETpIVI ;
   private String[] T01M49_A396EmprCod ;
   private String[] T01M49_A12959IV80EArtID ;
   private String[] T01M49_A12960IV80EColNI ;
   private String[] T01M49_A12961IV80ETpIVI ;
   private String[] T01M42_A12959IV80EArtID ;
   private String[] T01M42_A12960IV80EColNI ;
   private String[] T01M42_A12961IV80ETpIVI ;
   private java.math.BigDecimal[] T01M42_A12962IV80EMtStk ;
   private boolean[] T01M42_n12962IV80EMtStk ;
   private java.math.BigDecimal[] T01M42_A12963IV80EMtPrg ;
   private boolean[] T01M42_n12963IV80EMtPrg ;
   private java.math.BigDecimal[] T01M42_A12964IV80EMtRes ;
   private boolean[] T01M42_n12964IV80EMtRes ;
   private java.math.BigDecimal[] T01M42_A12975IV80EMtsOE ;
   private boolean[] T01M42_n12975IV80EMtsOE ;
   private String[] T01M42_A12983IV80EArtDs ;
   private boolean[] T01M42_n12983IV80EArtDs ;
   private String[] T01M42_A396EmprCod ;
   private String[] T01M413_A407EmprNom ;
   private boolean[] T01M413_n407EmprNom ;
   private String[] T01M414_A396EmprCod ;
   private String[] T01M414_A12965AS80EPedID ;
   private String[] T01M414_A12966AS80EDibID ;
   private String[] T01M414_A12967AS80EVarID ;
   private short[] T01M414_A12970AS80ELinea ;
   private String[] T01M415_A396EmprCod ;
   private String[] T01M415_A12959IV80EArtID ;
   private String[] T01M415_A12960IV80EColNI ;
   private String[] T01M415_A12961IV80ETpIVI ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tinv80e__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinv80e__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinv80e__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinv80e__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinv80e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M42", "SELECT IV80EArtID, IV80EColNI, IV80ETpIVI, IV80EMtStk, IV80EMtPrg, IV80EMtRes, IV80EMtsOE, IV80EArtDs, EmprCod FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ?  FOR UPDATE OF IV80EMtStk, IV80EMtPrg, IV80EMtRes, IV80EMtsOE, IV80EArtDs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M43", "SELECT IV80EArtID, IV80EColNI, IV80ETpIVI, IV80EMtStk, IV80EMtPrg, IV80EMtRes, IV80EMtsOE, IV80EArtDs, EmprCod FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M44", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M45", "SELECT /*+ FIRST_ROWS(100) */ TM1.IV80EArtID, TM1.IV80EColNI, TM1.IV80ETpIVI, T2.EmprNom, TM1.IV80EMtStk, TM1.IV80EMtPrg, TM1.IV80EMtRes, TM1.IV80EMtsOE, TM1.IV80EArtDs, TM1.EmprCod FROM (TXPINV80E TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.IV80EArtID = ? and TM1.IV80EColNI = ? and TM1.IV80ETpIVI = ? ORDER BY TM1.EmprCod, TM1.IV80EArtID, TM1.IV80EColNI, TM1.IV80ETpIVI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M47", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPINV80E WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M48", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPINV80E WHERE ( EmprCod > ? or EmprCod = ? and IV80EArtID > ? or IV80EArtID = ? and EmprCod = ? and IV80EColNI > ? or IV80EColNI = ? and IV80EArtID = ? and EmprCod = ? and IV80ETpIVI > ?) ORDER BY EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M49", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPINV80E WHERE ( EmprCod < ? or EmprCod = ? and IV80EArtID < ? or IV80EArtID = ? and EmprCod = ? and IV80EColNI < ? or IV80EColNI = ? and IV80EArtID = ? and EmprCod = ? and IV80ETpIVI < ?) ORDER BY EmprCod DESC, IV80EArtID DESC, IV80EColNI DESC, IV80ETpIVI DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M410", "INSERT INTO TXPINV80E(IV80EArtID, IV80EColNI, IV80ETpIVI, IV80EMtStk, IV80EMtPrg, IV80EMtRes, IV80EMtsOE, IV80EArtDs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINV80E")
         ,new UpdateCursor("T01M411", "UPDATE TXPINV80E SET IV80EMtStk=?, IV80EMtPrg=?, IV80EMtRes=?, IV80EMtsOE=?, IV80EArtDs=?  WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ?", GX_NOMASK, "TXPINV80E")
         ,new UpdateCursor("T01M412", "DELETE FROM TXPINV80E  WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ?", GX_NOMASK, "TXPINV80E")
         ,new ForEachCursor("T01M413", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M414", "SELECT * FROM (SELECT EmprCod, AS80EPedID, AS80EDibID, AS80EVarID, AS80ELinea FROM TXPASI801 WHERE EmprCod = ? AND IV80EArtID = ? AND IV80EColNI = ? AND IV80ETpIVI = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M415", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI FROM TXPINV80E ORDER BY EmprCod, IV80EArtID, IV80EColNI, IV80ETpIVI ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 40);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 40);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 26);
               }
               stmt.setString(9, (String)parms[13], 3);
               return;
            case 9 :
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 26);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setString(7, (String)parms[11], 16);
               stmt.setString(8, (String)parms[12], 40);
               stmt.setString(9, (String)parms[13], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 4);
               return;
      }
   }

}

