package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxarti_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Artículos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxarti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxarti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxarti_impl.class ));
   }

   public tvxarti_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxArti.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Artículo", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCod_Internalname, GXutil.rtrim( A7420VxArtCod), GXutil.rtrim( localUtil.format( A7420VxArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtDsc_Internalname, GXutil.rtrim( A7524VxArtDsc), GXutil.rtrim( localUtil.format( A7524VxArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Título del Hilo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtHiTit_Internalname, GXutil.ltrim( localUtil.ntoc( A12280VxArtHiTit, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtHiTit_Enabled!=0) ? localUtil.format( A12280VxArtHiTit, "ZZ9.9999") : localUtil.format( A12280VxArtHiTit, "ZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtHiTit_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtHiTit_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Unidad del Título", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTHiUn_Internalname, GXutil.rtrim( A12281VxArtTHiUn), GXutil.rtrim( localUtil.format( A12281VxArtTHiUn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTHiUn_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTHiUn_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Número Métrico", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtHiNm_Internalname, GXutil.ltrim( localUtil.ntoc( A12282VxArtHiNm, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtHiNm_Enabled!=0) ? localUtil.format( A12282VxArtHiNm, "ZZ9.99") : localUtil.format( A12282VxArtHiNm, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtHiNm_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtHiNm_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Master Tipo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtMTipo_Internalname, GXutil.rtrim( A12585VxArtMTipo), GXutil.rtrim( localUtil.format( A12585VxArtMTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtMTipo_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtMTipo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tipo Artículo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTipo_Internalname, GXutil.rtrim( A12586VxArtTipo), GXutil.rtrim( localUtil.format( A12586VxArtTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTipo_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTipo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Subtipo Articulo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtSTipo_Internalname, GXutil.rtrim( A12587VxArtSTipo), GXutil.rtrim( localUtil.format( A12587VxArtSTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtSTipo_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtSTipo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Crudo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCDsc_Internalname, GXutil.rtrim( A12588VxArtCDsc), GXutil.rtrim( localUtil.format( A12588VxArtCDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCDsc_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Empresa TXP", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtETXP_Internalname, GXutil.rtrim( A12589VxArtETXP), GXutil.rtrim( localUtil.format( A12589VxArtETXP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtETXP_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtETXP_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Artículo TXP", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtATXP_Internalname, GXutil.rtrim( A12590VxArtATXP), GXutil.rtrim( localUtil.format( A12590VxArtATXP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtATXP_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtATXP_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Cliente TXP", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtCTXP_Internalname, GXutil.ltrim( localUtil.ntoc( A12591VxArtCTXP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtCTXP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12591VxArtCTXP), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12591VxArtCTXP), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtCTXP_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtCTXP_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Artículo activo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtAct_Internalname, GXutil.ltrim( localUtil.ntoc( A12592VxArtAct, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtAct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12592VxArtAct), "9") : localUtil.format( DecimalUtil.doubleToDec(A12592VxArtAct), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtAct_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtAct_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Usuario ultima modificación", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtUsMo_Internalname, GXutil.rtrim( A12593VxArtUsMo), GXutil.rtrim( localUtil.format( A12593VxArtUsMo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtUsMo_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtUsMo_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha ultima modificación", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVxArtFeMo_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtFeMo_Internalname, localUtil.ttoc( A12594VxArtFeMo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12594VxArtFeMo, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtFeMo_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtFeMo_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVxArtFeMo_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVxArtFeMo_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVxArti.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cliente en TEXPLUS", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAcaCli_Internalname, GXutil.ltrim( localUtil.ntoc( A12976VxAcaCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxAcaCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12976VxAcaCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12976VxAcaCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAcaCli_Jsonclick, 0, "", "", "", "", "", 1, edtVxAcaCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Artículo en TEXPLUS", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXAcaArt_Internalname, GXutil.rtrim( A12977VXAcaArt), GXutil.rtrim( localUtil.format( A12977VXAcaArt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXAcaArt_Jsonclick, 0, "", "", "", "", "", 1, edtVXAcaArt_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArti.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArti.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxArti.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z7420VxArtCod = httpContext.cgiGet( "Z7420VxArtCod") ;
         Z7524VxArtDsc = httpContext.cgiGet( "Z7524VxArtDsc") ;
         Z12280VxArtHiTit = localUtil.ctond( httpContext.cgiGet( "Z12280VxArtHiTit")) ;
         Z12281VxArtTHiUn = httpContext.cgiGet( "Z12281VxArtTHiUn") ;
         Z12585VxArtMTipo = httpContext.cgiGet( "Z12585VxArtMTipo") ;
         Z12586VxArtTipo = httpContext.cgiGet( "Z12586VxArtTipo") ;
         Z12587VxArtSTipo = httpContext.cgiGet( "Z12587VxArtSTipo") ;
         Z12588VxArtCDsc = httpContext.cgiGet( "Z12588VxArtCDsc") ;
         Z12589VxArtETXP = httpContext.cgiGet( "Z12589VxArtETXP") ;
         Z12590VxArtATXP = httpContext.cgiGet( "Z12590VxArtATXP") ;
         Z12591VxArtCTXP = (int)(localUtil.ctol( httpContext.cgiGet( "Z12591VxArtCTXP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12592VxArtAct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12592VxArtAct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12593VxArtUsMo = httpContext.cgiGet( "Z12593VxArtUsMo") ;
         Z12594VxArtFeMo = localUtil.ctot( httpContext.cgiGet( "Z12594VxArtFeMo"), 0) ;
         Z12976VxAcaCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z12976VxAcaCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12977VXAcaArt = httpContext.cgiGet( "Z12977VXAcaArt") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A7420VxArtCod = httpContext.cgiGet( edtVxArtCod_Internalname) ;
         n7420VxArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A7524VxArtDsc = httpContext.cgiGet( edtVxArtDsc_Internalname) ;
         n7524VxArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArtHiTit_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArtHiTit_Internalname)), DecimalUtil.stringToDec("999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTHITIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtHiTit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12280VxArtHiTit = DecimalUtil.ZERO ;
            n12280VxArtHiTit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrimstr( A12280VxArtHiTit, 8, 4));
         }
         else
         {
            A12280VxArtHiTit = localUtil.ctond( httpContext.cgiGet( edtVxArtHiTit_Internalname)) ;
            n12280VxArtHiTit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrimstr( A12280VxArtHiTit, 8, 4));
         }
         A12281VxArtTHiUn = httpContext.cgiGet( edtVxArtTHiUn_Internalname) ;
         n12281VxArtTHiUn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12281VxArtTHiUn", A12281VxArtTHiUn);
         A12282VxArtHiNm = localUtil.ctond( httpContext.cgiGet( edtVxArtHiNm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
         A12585VxArtMTipo = httpContext.cgiGet( edtVxArtMTipo_Internalname) ;
         n12585VxArtMTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12585VxArtMTipo", A12585VxArtMTipo);
         A12586VxArtTipo = httpContext.cgiGet( edtVxArtTipo_Internalname) ;
         n12586VxArtTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12586VxArtTipo", A12586VxArtTipo);
         A12587VxArtSTipo = httpContext.cgiGet( edtVxArtSTipo_Internalname) ;
         n12587VxArtSTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12587VxArtSTipo", A12587VxArtSTipo);
         A12588VxArtCDsc = httpContext.cgiGet( edtVxArtCDsc_Internalname) ;
         n12588VxArtCDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12588VxArtCDsc", A12588VxArtCDsc);
         A12589VxArtETXP = httpContext.cgiGet( edtVxArtETXP_Internalname) ;
         n12589VxArtETXP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12589VxArtETXP", A12589VxArtETXP);
         A12590VxArtATXP = httpContext.cgiGet( edtVxArtATXP_Internalname) ;
         n12590VxArtATXP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12590VxArtATXP", A12590VxArtATXP);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtCTXP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtCTXP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTCTXP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtCTXP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12591VxArtCTXP = 0 ;
            n12591VxArtCTXP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12591VxArtCTXP), 6, 0));
         }
         else
         {
            A12591VxArtCTXP = (int)(localUtil.ctol( httpContext.cgiGet( edtVxArtCTXP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12591VxArtCTXP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12591VxArtCTXP), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTACT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtAct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12592VxArtAct = (byte)(0) ;
            n12592VxArtAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.str( A12592VxArtAct, 1, 0));
         }
         else
         {
            A12592VxArtAct = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxArtAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12592VxArtAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.str( A12592VxArtAct, 1, 0));
         }
         A12593VxArtUsMo = httpContext.cgiGet( edtVxArtUsMo_Internalname) ;
         n12593VxArtUsMo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12593VxArtUsMo", A12593VxArtUsMo);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtVxArtFeMo_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "VXARTFEMO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtFeMo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
            n12594VxArtFeMo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A12594VxArtFeMo = localUtil.ctot( httpContext.cgiGet( edtVxArtFeMo_Internalname)) ;
            n12594VxArtFeMo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxAcaCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxAcaCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXACACLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAcaCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12976VxAcaCli = 0 ;
            n12976VxAcaCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12976VxAcaCli), 6, 0));
         }
         else
         {
            A12976VxAcaCli = (int)(localUtil.ctol( httpContext.cgiGet( edtVxAcaCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12976VxAcaCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12976VxAcaCli), 6, 0));
         }
         A12977VXAcaArt = httpContext.cgiGet( edtVXAcaArt_Internalname) ;
         n12977VXAcaArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", A12977VXAcaArt);
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
            A7420VxArtCod = httpContext.GetPar( "VxArtCod") ;
            n7420VxArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAllZH1056( ) ;
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
      disableAttributesZH1056( ) ;
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

   public void confirm_ZH0( )
   {
      beforeValidateZH1056( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsZH1056( ) ;
         }
         else
         {
            checkExtendedTableZH1056( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursorsZH1056( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesZH0( ) ;
      }
   }

   public void resetCaptionZH0( )
   {
   }

   public void zmZH1056( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7524VxArtDsc = T00ZH3_A7524VxArtDsc[0] ;
            Z12280VxArtHiTit = T00ZH3_A12280VxArtHiTit[0] ;
            Z12281VxArtTHiUn = T00ZH3_A12281VxArtTHiUn[0] ;
            Z12585VxArtMTipo = T00ZH3_A12585VxArtMTipo[0] ;
            Z12586VxArtTipo = T00ZH3_A12586VxArtTipo[0] ;
            Z12587VxArtSTipo = T00ZH3_A12587VxArtSTipo[0] ;
            Z12588VxArtCDsc = T00ZH3_A12588VxArtCDsc[0] ;
            Z12589VxArtETXP = T00ZH3_A12589VxArtETXP[0] ;
            Z12590VxArtATXP = T00ZH3_A12590VxArtATXP[0] ;
            Z12591VxArtCTXP = T00ZH3_A12591VxArtCTXP[0] ;
            Z12592VxArtAct = T00ZH3_A12592VxArtAct[0] ;
            Z12593VxArtUsMo = T00ZH3_A12593VxArtUsMo[0] ;
            Z12594VxArtFeMo = T00ZH3_A12594VxArtFeMo[0] ;
            Z12976VxAcaCli = T00ZH3_A12976VxAcaCli[0] ;
            Z12977VXAcaArt = T00ZH3_A12977VXAcaArt[0] ;
         }
         else
         {
            Z7524VxArtDsc = A7524VxArtDsc ;
            Z12280VxArtHiTit = A12280VxArtHiTit ;
            Z12281VxArtTHiUn = A12281VxArtTHiUn ;
            Z12585VxArtMTipo = A12585VxArtMTipo ;
            Z12586VxArtTipo = A12586VxArtTipo ;
            Z12587VxArtSTipo = A12587VxArtSTipo ;
            Z12588VxArtCDsc = A12588VxArtCDsc ;
            Z12589VxArtETXP = A12589VxArtETXP ;
            Z12590VxArtATXP = A12590VxArtATXP ;
            Z12591VxArtCTXP = A12591VxArtCTXP ;
            Z12592VxArtAct = A12592VxArtAct ;
            Z12593VxArtUsMo = A12593VxArtUsMo ;
            Z12594VxArtFeMo = A12594VxArtFeMo ;
            Z12976VxAcaCli = A12976VxAcaCli ;
            Z12977VXAcaArt = A12977VXAcaArt ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z7420VxArtCod = A7420VxArtCod ;
         Z7524VxArtDsc = A7524VxArtDsc ;
         Z12280VxArtHiTit = A12280VxArtHiTit ;
         Z12281VxArtTHiUn = A12281VxArtTHiUn ;
         Z12585VxArtMTipo = A12585VxArtMTipo ;
         Z12586VxArtTipo = A12586VxArtTipo ;
         Z12587VxArtSTipo = A12587VxArtSTipo ;
         Z12588VxArtCDsc = A12588VxArtCDsc ;
         Z12589VxArtETXP = A12589VxArtETXP ;
         Z12590VxArtATXP = A12590VxArtATXP ;
         Z12591VxArtCTXP = A12591VxArtCTXP ;
         Z12592VxArtAct = A12592VxArtAct ;
         Z12593VxArtUsMo = A12593VxArtUsMo ;
         Z12594VxArtFeMo = A12594VxArtFeMo ;
         Z12976VxAcaCli = A12976VxAcaCli ;
         Z12977VXAcaArt = A12977VXAcaArt ;
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

   public void loadZH1056( )
   {
      /* Using cursor T00ZH4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1056 = (short)(1) ;
         A7524VxArtDsc = T00ZH4_A7524VxArtDsc[0] ;
         n7524VxArtDsc = T00ZH4_n7524VxArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         A12280VxArtHiTit = T00ZH4_A12280VxArtHiTit[0] ;
         n12280VxArtHiTit = T00ZH4_n12280VxArtHiTit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrimstr( A12280VxArtHiTit, 8, 4));
         A12281VxArtTHiUn = T00ZH4_A12281VxArtTHiUn[0] ;
         n12281VxArtTHiUn = T00ZH4_n12281VxArtTHiUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12281VxArtTHiUn", A12281VxArtTHiUn);
         A12585VxArtMTipo = T00ZH4_A12585VxArtMTipo[0] ;
         n12585VxArtMTipo = T00ZH4_n12585VxArtMTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12585VxArtMTipo", A12585VxArtMTipo);
         A12586VxArtTipo = T00ZH4_A12586VxArtTipo[0] ;
         n12586VxArtTipo = T00ZH4_n12586VxArtTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12586VxArtTipo", A12586VxArtTipo);
         A12587VxArtSTipo = T00ZH4_A12587VxArtSTipo[0] ;
         n12587VxArtSTipo = T00ZH4_n12587VxArtSTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12587VxArtSTipo", A12587VxArtSTipo);
         A12588VxArtCDsc = T00ZH4_A12588VxArtCDsc[0] ;
         n12588VxArtCDsc = T00ZH4_n12588VxArtCDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12588VxArtCDsc", A12588VxArtCDsc);
         A12589VxArtETXP = T00ZH4_A12589VxArtETXP[0] ;
         n12589VxArtETXP = T00ZH4_n12589VxArtETXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12589VxArtETXP", A12589VxArtETXP);
         A12590VxArtATXP = T00ZH4_A12590VxArtATXP[0] ;
         n12590VxArtATXP = T00ZH4_n12590VxArtATXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12590VxArtATXP", A12590VxArtATXP);
         A12591VxArtCTXP = T00ZH4_A12591VxArtCTXP[0] ;
         n12591VxArtCTXP = T00ZH4_n12591VxArtCTXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12591VxArtCTXP), 6, 0));
         A12592VxArtAct = T00ZH4_A12592VxArtAct[0] ;
         n12592VxArtAct = T00ZH4_n12592VxArtAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.str( A12592VxArtAct, 1, 0));
         A12593VxArtUsMo = T00ZH4_A12593VxArtUsMo[0] ;
         n12593VxArtUsMo = T00ZH4_n12593VxArtUsMo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12593VxArtUsMo", A12593VxArtUsMo);
         A12594VxArtFeMo = T00ZH4_A12594VxArtFeMo[0] ;
         n12594VxArtFeMo = T00ZH4_n12594VxArtFeMo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12976VxAcaCli = T00ZH4_A12976VxAcaCli[0] ;
         n12976VxAcaCli = T00ZH4_n12976VxAcaCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12976VxAcaCli), 6, 0));
         A12977VXAcaArt = T00ZH4_A12977VXAcaArt[0] ;
         n12977VXAcaArt = T00ZH4_n12977VXAcaArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", A12977VXAcaArt);
         zmZH1056( -2) ;
      }
      pr_default.close(2);
      onLoadActionsZH1056( ) ;
   }

   public void onLoadActionsZH1056( )
   {
      if ( A12280VxArtHiTit.doubleValue() == 0 )
      {
         A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
      }
      else
      {
         if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NM", "")) == 0 )
         {
            A12282VxArtHiNm = A12280VxArtHiTit ;
            httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
         }
         else
         {
            if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TD", "")) == 0 )
            {
               A12282VxArtHiNm = DecimalUtil.doubleToDec(9000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
            }
            else
            {
               if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TT", "")) == 0 )
               {
                  A12282VxArtHiNm = DecimalUtil.doubleToDec(1000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
               }
               else
               {
                  if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NE", "")) == 0 )
                  {
                     A12282VxArtHiNm = A12280VxArtHiTit.divide(DecimalUtil.stringToDec("0.59"), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                  }
                  else
                  {
                     if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "LI", "")) == 0 )
                     {
                        A12282VxArtHiNm = A12280VxArtHiTit.multiply(DecimalUtil.stringToDec("0.3486309")) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                     }
                     else
                     {
                        A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                     }
                  }
               }
            }
         }
      }
   }

   public void checkExtendedTableZH1056( )
   {
      nIsDirty_1056 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( A12280VxArtHiTit.doubleValue() == 0 )
      {
         nIsDirty_1056 = (short)(1) ;
         A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
      }
      else
      {
         if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NM", "")) == 0 )
         {
            nIsDirty_1056 = (short)(1) ;
            A12282VxArtHiNm = A12280VxArtHiTit ;
            httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
         }
         else
         {
            if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TD", "")) == 0 )
            {
               nIsDirty_1056 = (short)(1) ;
               A12282VxArtHiNm = DecimalUtil.doubleToDec(9000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
            }
            else
            {
               if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TT", "")) == 0 )
               {
                  nIsDirty_1056 = (short)(1) ;
                  A12282VxArtHiNm = DecimalUtil.doubleToDec(1000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
               }
               else
               {
                  if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NE", "")) == 0 )
                  {
                     nIsDirty_1056 = (short)(1) ;
                     A12282VxArtHiNm = A12280VxArtHiTit.divide(DecimalUtil.stringToDec("0.59"), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                  }
                  else
                  {
                     if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "LI", "")) == 0 )
                     {
                        nIsDirty_1056 = (short)(1) ;
                        A12282VxArtHiNm = A12280VxArtHiTit.multiply(DecimalUtil.stringToDec("0.3486309")) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                     }
                     else
                     {
                        nIsDirty_1056 = (short)(1) ;
                        A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                     }
                  }
               }
            }
         }
      }
   }

   public void closeExtendedTableCursorsZH1056( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyZH1056( )
   {
      /* Using cursor T00ZH5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1056 = (short)(1) ;
      }
      else
      {
         RcdFound1056 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00ZH3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmZH1056( 2) ;
         RcdFound1056 = (short)(1) ;
         A7420VxArtCod = T00ZH3_A7420VxArtCod[0] ;
         n7420VxArtCod = T00ZH3_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         A7524VxArtDsc = T00ZH3_A7524VxArtDsc[0] ;
         n7524VxArtDsc = T00ZH3_n7524VxArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
         A12280VxArtHiTit = T00ZH3_A12280VxArtHiTit[0] ;
         n12280VxArtHiTit = T00ZH3_n12280VxArtHiTit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrimstr( A12280VxArtHiTit, 8, 4));
         A12281VxArtTHiUn = T00ZH3_A12281VxArtTHiUn[0] ;
         n12281VxArtTHiUn = T00ZH3_n12281VxArtTHiUn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12281VxArtTHiUn", A12281VxArtTHiUn);
         A12585VxArtMTipo = T00ZH3_A12585VxArtMTipo[0] ;
         n12585VxArtMTipo = T00ZH3_n12585VxArtMTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12585VxArtMTipo", A12585VxArtMTipo);
         A12586VxArtTipo = T00ZH3_A12586VxArtTipo[0] ;
         n12586VxArtTipo = T00ZH3_n12586VxArtTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12586VxArtTipo", A12586VxArtTipo);
         A12587VxArtSTipo = T00ZH3_A12587VxArtSTipo[0] ;
         n12587VxArtSTipo = T00ZH3_n12587VxArtSTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12587VxArtSTipo", A12587VxArtSTipo);
         A12588VxArtCDsc = T00ZH3_A12588VxArtCDsc[0] ;
         n12588VxArtCDsc = T00ZH3_n12588VxArtCDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12588VxArtCDsc", A12588VxArtCDsc);
         A12589VxArtETXP = T00ZH3_A12589VxArtETXP[0] ;
         n12589VxArtETXP = T00ZH3_n12589VxArtETXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12589VxArtETXP", A12589VxArtETXP);
         A12590VxArtATXP = T00ZH3_A12590VxArtATXP[0] ;
         n12590VxArtATXP = T00ZH3_n12590VxArtATXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12590VxArtATXP", A12590VxArtATXP);
         A12591VxArtCTXP = T00ZH3_A12591VxArtCTXP[0] ;
         n12591VxArtCTXP = T00ZH3_n12591VxArtCTXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12591VxArtCTXP), 6, 0));
         A12592VxArtAct = T00ZH3_A12592VxArtAct[0] ;
         n12592VxArtAct = T00ZH3_n12592VxArtAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.str( A12592VxArtAct, 1, 0));
         A12593VxArtUsMo = T00ZH3_A12593VxArtUsMo[0] ;
         n12593VxArtUsMo = T00ZH3_n12593VxArtUsMo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12593VxArtUsMo", A12593VxArtUsMo);
         A12594VxArtFeMo = T00ZH3_A12594VxArtFeMo[0] ;
         n12594VxArtFeMo = T00ZH3_n12594VxArtFeMo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12976VxAcaCli = T00ZH3_A12976VxAcaCli[0] ;
         n12976VxAcaCli = T00ZH3_n12976VxAcaCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12976VxAcaCli), 6, 0));
         A12977VXAcaArt = T00ZH3_A12977VXAcaArt[0] ;
         n12977VXAcaArt = T00ZH3_n12977VXAcaArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", A12977VXAcaArt);
         Z7420VxArtCod = A7420VxArtCod ;
         sMode1056 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadZH1056( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1056 = (short)(0) ;
            initializeNonKeyZH1056( ) ;
         }
         Gx_mode = sMode1056 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1056 = (short)(0) ;
         initializeNonKeyZH1056( ) ;
         sMode1056 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1056 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyZH1056( ) ;
      if ( RcdFound1056 == 0 )
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
      RcdFound1056 = (short)(0) ;
      /* Using cursor T00ZH6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00ZH6_A7420VxArtCod[0], A7420VxArtCod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00ZH6_A7420VxArtCod[0], A7420VxArtCod) > 0 ) ) )
         {
            A7420VxArtCod = T00ZH6_A7420VxArtCod[0] ;
            n7420VxArtCod = T00ZH6_n7420VxArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            RcdFound1056 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1056 = (short)(0) ;
      /* Using cursor T00ZH7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00ZH7_A7420VxArtCod[0], A7420VxArtCod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00ZH7_A7420VxArtCod[0], A7420VxArtCod) < 0 ) ) )
         {
            A7420VxArtCod = T00ZH7_A7420VxArtCod[0] ;
            n7420VxArtCod = T00ZH7_n7420VxArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            RcdFound1056 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyZH1056( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertZH1056( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1056 == 1 )
         {
            if ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 )
            {
               A7420VxArtCod = Z7420VxArtCod ;
               n7420VxArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateZH1056( ) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertZH1056( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertZH1056( ) ;
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
      if ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 )
      {
         A7420VxArtCod = Z7420VxArtCod ;
         n7420VxArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
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
      getKeyZH1056( ) ;
      if ( RcdFound1056 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 )
         {
            A7420VxArtCod = Z7420VxArtCod ;
            n7420VxArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXARTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtCod_Internalname ;
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
         if ( GXutil.strcmp(A7420VxArtCod, Z7420VxArtCod) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArtCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxarti");
      GX_FocusControl = edtVxArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_ZH0( ) ;
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
      if ( RcdFound1056 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartZH1056( ) ;
      if ( RcdFound1056 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndZH1056( ) ;
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
      if ( RcdFound1056 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtDsc_Internalname ;
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
      if ( RcdFound1056 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtDsc_Internalname ;
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
      scanStartZH1056( ) ;
      if ( RcdFound1056 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1056 != 0 )
         {
            scanNextZH1056( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndZH1056( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyZH1056( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00ZH2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXARTIC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7524VxArtDsc, T00ZH2_A7524VxArtDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12280VxArtHiTit, T00ZH2_A12280VxArtHiTit[0]) != 0 ) || ( GXutil.strcmp(Z12281VxArtTHiUn, T00ZH2_A12281VxArtTHiUn[0]) != 0 ) || ( GXutil.strcmp(Z12585VxArtMTipo, T00ZH2_A12585VxArtMTipo[0]) != 0 ) || ( GXutil.strcmp(Z12586VxArtTipo, T00ZH2_A12586VxArtTipo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12587VxArtSTipo, T00ZH2_A12587VxArtSTipo[0]) != 0 ) || ( GXutil.strcmp(Z12588VxArtCDsc, T00ZH2_A12588VxArtCDsc[0]) != 0 ) || ( GXutil.strcmp(Z12589VxArtETXP, T00ZH2_A12589VxArtETXP[0]) != 0 ) || ( GXutil.strcmp(Z12590VxArtATXP, T00ZH2_A12590VxArtATXP[0]) != 0 ) || ( Z12591VxArtCTXP != T00ZH2_A12591VxArtCTXP[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12592VxArtAct != T00ZH2_A12592VxArtAct[0] ) || ( GXutil.strcmp(Z12593VxArtUsMo, T00ZH2_A12593VxArtUsMo[0]) != 0 ) || !( GXutil.dateCompare(Z12594VxArtFeMo, T00ZH2_A12594VxArtFeMo[0]) ) || ( Z12976VxAcaCli != T00ZH2_A12976VxAcaCli[0] ) || ( GXutil.strcmp(Z12977VXAcaArt, T00ZH2_A12977VXAcaArt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7524VxArtDsc, T00ZH2_A7524VxArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtDsc");
               GXutil.writeLogRaw("Old: ",Z7524VxArtDsc);
               GXutil.writeLogRaw("Current: ",T00ZH2_A7524VxArtDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z12280VxArtHiTit, T00ZH2_A12280VxArtHiTit[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtHiTit");
               GXutil.writeLogRaw("Old: ",Z12280VxArtHiTit);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12280VxArtHiTit[0]);
            }
            if ( GXutil.strcmp(Z12281VxArtTHiUn, T00ZH2_A12281VxArtTHiUn[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtTHiUn");
               GXutil.writeLogRaw("Old: ",Z12281VxArtTHiUn);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12281VxArtTHiUn[0]);
            }
            if ( GXutil.strcmp(Z12585VxArtMTipo, T00ZH2_A12585VxArtMTipo[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtMTipo");
               GXutil.writeLogRaw("Old: ",Z12585VxArtMTipo);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12585VxArtMTipo[0]);
            }
            if ( GXutil.strcmp(Z12586VxArtTipo, T00ZH2_A12586VxArtTipo[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtTipo");
               GXutil.writeLogRaw("Old: ",Z12586VxArtTipo);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12586VxArtTipo[0]);
            }
            if ( GXutil.strcmp(Z12587VxArtSTipo, T00ZH2_A12587VxArtSTipo[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtSTipo");
               GXutil.writeLogRaw("Old: ",Z12587VxArtSTipo);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12587VxArtSTipo[0]);
            }
            if ( GXutil.strcmp(Z12588VxArtCDsc, T00ZH2_A12588VxArtCDsc[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtCDsc");
               GXutil.writeLogRaw("Old: ",Z12588VxArtCDsc);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12588VxArtCDsc[0]);
            }
            if ( GXutil.strcmp(Z12589VxArtETXP, T00ZH2_A12589VxArtETXP[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtETXP");
               GXutil.writeLogRaw("Old: ",Z12589VxArtETXP);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12589VxArtETXP[0]);
            }
            if ( GXutil.strcmp(Z12590VxArtATXP, T00ZH2_A12590VxArtATXP[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtATXP");
               GXutil.writeLogRaw("Old: ",Z12590VxArtATXP);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12590VxArtATXP[0]);
            }
            if ( Z12591VxArtCTXP != T00ZH2_A12591VxArtCTXP[0] )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtCTXP");
               GXutil.writeLogRaw("Old: ",Z12591VxArtCTXP);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12591VxArtCTXP[0]);
            }
            if ( Z12592VxArtAct != T00ZH2_A12592VxArtAct[0] )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtAct");
               GXutil.writeLogRaw("Old: ",Z12592VxArtAct);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12592VxArtAct[0]);
            }
            if ( GXutil.strcmp(Z12593VxArtUsMo, T00ZH2_A12593VxArtUsMo[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtUsMo");
               GXutil.writeLogRaw("Old: ",Z12593VxArtUsMo);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12593VxArtUsMo[0]);
            }
            if ( !( GXutil.dateCompare(Z12594VxArtFeMo, T00ZH2_A12594VxArtFeMo[0]) ) )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxArtFeMo");
               GXutil.writeLogRaw("Old: ",Z12594VxArtFeMo);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12594VxArtFeMo[0]);
            }
            if ( Z12976VxAcaCli != T00ZH2_A12976VxAcaCli[0] )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VxAcaCli");
               GXutil.writeLogRaw("Old: ",Z12976VxAcaCli);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12976VxAcaCli[0]);
            }
            if ( GXutil.strcmp(Z12977VXAcaArt, T00ZH2_A12977VXAcaArt[0]) != 0 )
            {
               GXutil.writeLogln("tvxarti:[seudo value changed for attri]"+"VXAcaArt");
               GXutil.writeLogRaw("Old: ",Z12977VXAcaArt);
               GXutil.writeLogRaw("Current: ",T00ZH2_A12977VXAcaArt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXARTIC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZH1056( )
   {
      beforeValidateZH1056( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZH1056( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZH1056( 0) ;
         checkOptimisticConcurrencyZH1056( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZH1056( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZH1056( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZH8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod, Boolean.valueOf(n7524VxArtDsc), A7524VxArtDsc, Boolean.valueOf(n12280VxArtHiTit), A12280VxArtHiTit, Boolean.valueOf(n12281VxArtTHiUn), A12281VxArtTHiUn, Boolean.valueOf(n12585VxArtMTipo), A12585VxArtMTipo, Boolean.valueOf(n12586VxArtTipo), A12586VxArtTipo, Boolean.valueOf(n12587VxArtSTipo), A12587VxArtSTipo, Boolean.valueOf(n12588VxArtCDsc), A12588VxArtCDsc, Boolean.valueOf(n12589VxArtETXP), A12589VxArtETXP, Boolean.valueOf(n12590VxArtATXP), A12590VxArtATXP, Boolean.valueOf(n12591VxArtCTXP), Integer.valueOf(A12591VxArtCTXP), Boolean.valueOf(n12592VxArtAct), Byte.valueOf(A12592VxArtAct), Boolean.valueOf(n12593VxArtUsMo), A12593VxArtUsMo, Boolean.valueOf(n12594VxArtFeMo), A12594VxArtFeMo, Boolean.valueOf(n12976VxAcaCli), Integer.valueOf(A12976VxAcaCli), Boolean.valueOf(n12977VXAcaArt), A12977VXAcaArt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTIC");
                  if ( (pr_default.getStatus(6) == 1) )
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
                        resetCaptionZH0( ) ;
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
            loadZH1056( ) ;
         }
         endLevelZH1056( ) ;
      }
      closeExtendedTableCursorsZH1056( ) ;
   }

   public void updateZH1056( )
   {
      beforeValidateZH1056( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZH1056( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZH1056( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZH1056( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateZH1056( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZH9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n7524VxArtDsc), A7524VxArtDsc, Boolean.valueOf(n12280VxArtHiTit), A12280VxArtHiTit, Boolean.valueOf(n12281VxArtTHiUn), A12281VxArtTHiUn, Boolean.valueOf(n12585VxArtMTipo), A12585VxArtMTipo, Boolean.valueOf(n12586VxArtTipo), A12586VxArtTipo, Boolean.valueOf(n12587VxArtSTipo), A12587VxArtSTipo, Boolean.valueOf(n12588VxArtCDsc), A12588VxArtCDsc, Boolean.valueOf(n12589VxArtETXP), A12589VxArtETXP, Boolean.valueOf(n12590VxArtATXP), A12590VxArtATXP, Boolean.valueOf(n12591VxArtCTXP), Integer.valueOf(A12591VxArtCTXP), Boolean.valueOf(n12592VxArtAct), Byte.valueOf(A12592VxArtAct), Boolean.valueOf(n12593VxArtUsMo), A12593VxArtUsMo, Boolean.valueOf(n12594VxArtFeMo), A12594VxArtFeMo, Boolean.valueOf(n12976VxAcaCli), Integer.valueOf(A12976VxAcaCli), Boolean.valueOf(n12977VXAcaArt), A12977VXAcaArt, Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTIC");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXARTIC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateZH1056( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionZH0( ) ;
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
         endLevelZH1056( ) ;
      }
      closeExtendedTableCursorsZH1056( ) ;
   }

   public void deferredUpdateZH1056( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZH1056( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZH1056( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZH1056( ) ;
         afterConfirmZH1056( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZH1056( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00ZH10 */
               pr_default.execute(8, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTIC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1056 == 0 )
                     {
                        initAllZH1056( ) ;
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
                     resetCaptionZH0( ) ;
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
      sMode1056 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZH1056( ) ;
      Gx_mode = sMode1056 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZH1056( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( A12280VxArtHiTit.doubleValue() == 0 )
         {
            A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
         }
         else
         {
            if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NM", "")) == 0 )
            {
               A12282VxArtHiNm = A12280VxArtHiTit ;
               httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
            }
            else
            {
               if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TD", "")) == 0 )
               {
                  A12282VxArtHiNm = DecimalUtil.doubleToDec(9000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
               }
               else
               {
                  if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "TT", "")) == 0 )
                  {
                     A12282VxArtHiNm = DecimalUtil.doubleToDec(1000).divide(A12280VxArtHiTit, 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                  }
                  else
                  {
                     if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "NE", "")) == 0 )
                     {
                        A12282VxArtHiNm = A12280VxArtHiTit.divide(DecimalUtil.stringToDec("0.59"), 18, java.math.RoundingMode.DOWN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                     }
                     else
                     {
                        if ( GXutil.strcmp(A12281VxArtTHiUn, httpContext.getMessage( "LI", "")) == 0 )
                        {
                           A12282VxArtHiNm = A12280VxArtHiTit.multiply(DecimalUtil.stringToDec("0.3486309")) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                        }
                        else
                        {
                           A12282VxArtHiNm = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
                        }
                     }
                  }
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00ZH11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla VERTEX.OSERVI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T00ZH12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "VxOSerCo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00ZH13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla F.Técnica/Componentes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00ZH14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - Artículos/Grupos de Máquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00ZH15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n7420VxArtCod), A7420VxArtCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - Componentes Crudo de", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevelZH1056( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteZH1056( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxarti");
         if ( AnyError == 0 )
         {
            confirmValuesZH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxarti");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZH1056( )
   {
      /* Using cursor T00ZH16 */
      pr_default.execute(14);
      RcdFound1056 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1056 = (short)(1) ;
         A7420VxArtCod = T00ZH16_A7420VxArtCod[0] ;
         n7420VxArtCod = T00ZH16_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZH1056( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1056 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1056 = (short)(1) ;
         A7420VxArtCod = T00ZH16_A7420VxArtCod[0] ;
         n7420VxArtCod = T00ZH16_n7420VxArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      }
   }

   public void scanEndZH1056( )
   {
      pr_default.close(14);
   }

   public void afterConfirmZH1056( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertZH1056( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZH1056( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZH1056( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZH1056( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZH1056( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZH1056( )
   {
      edtVxArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCod_Enabled), 5, 0), true);
      edtVxArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtDsc_Enabled), 5, 0), true);
      edtVxArtHiTit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtHiTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtHiTit_Enabled), 5, 0), true);
      edtVxArtTHiUn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTHiUn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTHiUn_Enabled), 5, 0), true);
      edtVxArtHiNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtHiNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtHiNm_Enabled), 5, 0), true);
      edtVxArtMTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtMTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtMTipo_Enabled), 5, 0), true);
      edtVxArtTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTipo_Enabled), 5, 0), true);
      edtVxArtSTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtSTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtSTipo_Enabled), 5, 0), true);
      edtVxArtCDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCDsc_Enabled), 5, 0), true);
      edtVxArtETXP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtETXP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtETXP_Enabled), 5, 0), true);
      edtVxArtATXP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtATXP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtATXP_Enabled), 5, 0), true);
      edtVxArtCTXP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtCTXP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtCTXP_Enabled), 5, 0), true);
      edtVxArtAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtAct_Enabled), 5, 0), true);
      edtVxArtUsMo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtUsMo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtUsMo_Enabled), 5, 0), true);
      edtVxArtFeMo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtFeMo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtFeMo_Enabled), 5, 0), true);
      edtVxAcaCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAcaCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAcaCli_Enabled), 5, 0), true);
      edtVXAcaArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXAcaArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXAcaArt_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesZH1056( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesZH0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxarti", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7524VxArtDsc", GXutil.rtrim( Z7524VxArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12280VxArtHiTit", GXutil.ltrim( localUtil.ntoc( Z12280VxArtHiTit, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12281VxArtTHiUn", GXutil.rtrim( Z12281VxArtTHiUn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12585VxArtMTipo", GXutil.rtrim( Z12585VxArtMTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12586VxArtTipo", GXutil.rtrim( Z12586VxArtTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12587VxArtSTipo", GXutil.rtrim( Z12587VxArtSTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12588VxArtCDsc", GXutil.rtrim( Z12588VxArtCDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12589VxArtETXP", GXutil.rtrim( Z12589VxArtETXP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12590VxArtATXP", GXutil.rtrim( Z12590VxArtATXP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12591VxArtCTXP", GXutil.ltrim( localUtil.ntoc( Z12591VxArtCTXP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12592VxArtAct", GXutil.ltrim( localUtil.ntoc( Z12592VxArtAct, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12593VxArtUsMo", GXutil.rtrim( Z12593VxArtUsMo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12594VxArtFeMo", localUtil.ttoc( Z12594VxArtFeMo, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12976VxAcaCli", GXutil.ltrim( localUtil.ntoc( Z12976VxAcaCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12977VXAcaArt", GXutil.rtrim( Z12977VXAcaArt));
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
      return formatLink("app.tvxarti", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxArti" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Artículos", "") ;
   }

   public void initializeNonKeyZH1056( )
   {
      A12282VxArtHiNm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrimstr( A12282VxArtHiNm, 6, 2));
      A7524VxArtDsc = "" ;
      n7524VxArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", A7524VxArtDsc);
      A12280VxArtHiTit = DecimalUtil.ZERO ;
      n12280VxArtHiTit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrimstr( A12280VxArtHiTit, 8, 4));
      A12281VxArtTHiUn = "" ;
      n12281VxArtTHiUn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12281VxArtTHiUn", A12281VxArtTHiUn);
      A12585VxArtMTipo = "" ;
      n12585VxArtMTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12585VxArtMTipo", A12585VxArtMTipo);
      A12586VxArtTipo = "" ;
      n12586VxArtTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12586VxArtTipo", A12586VxArtTipo);
      A12587VxArtSTipo = "" ;
      n12587VxArtSTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12587VxArtSTipo", A12587VxArtSTipo);
      A12588VxArtCDsc = "" ;
      n12588VxArtCDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12588VxArtCDsc", A12588VxArtCDsc);
      A12589VxArtETXP = "" ;
      n12589VxArtETXP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12589VxArtETXP", A12589VxArtETXP);
      A12590VxArtATXP = "" ;
      n12590VxArtATXP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12590VxArtATXP", A12590VxArtATXP);
      A12591VxArtCTXP = 0 ;
      n12591VxArtCTXP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12591VxArtCTXP), 6, 0));
      A12592VxArtAct = (byte)(0) ;
      n12592VxArtAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.str( A12592VxArtAct, 1, 0));
      A12593VxArtUsMo = "" ;
      n12593VxArtUsMo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12593VxArtUsMo", A12593VxArtUsMo);
      A12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
      n12594VxArtFeMo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12976VxAcaCli = 0 ;
      n12976VxAcaCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12976VxAcaCli), 6, 0));
      A12977VXAcaArt = "" ;
      n12977VXAcaArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", A12977VXAcaArt);
      Z7524VxArtDsc = "" ;
      Z12280VxArtHiTit = DecimalUtil.ZERO ;
      Z12281VxArtTHiUn = "" ;
      Z12585VxArtMTipo = "" ;
      Z12586VxArtTipo = "" ;
      Z12587VxArtSTipo = "" ;
      Z12588VxArtCDsc = "" ;
      Z12589VxArtETXP = "" ;
      Z12590VxArtATXP = "" ;
      Z12591VxArtCTXP = 0 ;
      Z12592VxArtAct = (byte)(0) ;
      Z12593VxArtUsMo = "" ;
      Z12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
      Z12976VxAcaCli = 0 ;
      Z12977VXAcaArt = "" ;
   }

   public void initAllZH1056( )
   {
      A7420VxArtCod = "" ;
      n7420VxArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7420VxArtCod", A7420VxArtCod);
      initializeNonKeyZH1056( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518594779", true, true);
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
      httpContext.AddJavascriptSource("tvxarti.js", "?202612518594779", false, true);
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
      edtVxArtCod_Internalname = "VXARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxArtDsc_Internalname = "VXARTDSC" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxArtHiTit_Internalname = "VXARTHITIT" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxArtTHiUn_Internalname = "VXARTTHIUN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxArtHiNm_Internalname = "VXARTHINM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxArtMTipo_Internalname = "VXARTMTIPO" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxArtTipo_Internalname = "VXARTTIPO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxArtSTipo_Internalname = "VXARTSTIPO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVxArtCDsc_Internalname = "VXARTCDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtVxArtETXP_Internalname = "VXARTETXP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtVxArtATXP_Internalname = "VXARTATXP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtVxArtCTXP_Internalname = "VXARTCTXP" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtVxArtAct_Internalname = "VXARTACT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtVxArtUsMo_Internalname = "VXARTUSMO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtVxArtFeMo_Internalname = "VXARTFEMO" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtVxAcaCli_Internalname = "VXACACLI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtVXAcaArt_Internalname = "VXACAART" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Artículos", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVXAcaArt_Jsonclick = "" ;
      edtVXAcaArt_Backcolor = (int)(0xFFFFFF) ;
      edtVXAcaArt_Enabled = 1 ;
      edtVxAcaCli_Jsonclick = "" ;
      edtVxAcaCli_Backcolor = (int)(0xFFFFFF) ;
      edtVxAcaCli_Enabled = 1 ;
      edtVxArtFeMo_Jsonclick = "" ;
      edtVxArtFeMo_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtFeMo_Enabled = 1 ;
      edtVxArtUsMo_Jsonclick = "" ;
      edtVxArtUsMo_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtUsMo_Enabled = 1 ;
      edtVxArtAct_Jsonclick = "" ;
      edtVxArtAct_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtAct_Enabled = 1 ;
      edtVxArtCTXP_Jsonclick = "" ;
      edtVxArtCTXP_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCTXP_Enabled = 1 ;
      edtVxArtATXP_Jsonclick = "" ;
      edtVxArtATXP_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtATXP_Enabled = 1 ;
      edtVxArtETXP_Jsonclick = "" ;
      edtVxArtETXP_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtETXP_Enabled = 1 ;
      edtVxArtCDsc_Jsonclick = "" ;
      edtVxArtCDsc_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCDsc_Enabled = 1 ;
      edtVxArtSTipo_Jsonclick = "" ;
      edtVxArtSTipo_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtSTipo_Enabled = 1 ;
      edtVxArtTipo_Jsonclick = "" ;
      edtVxArtTipo_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTipo_Enabled = 1 ;
      edtVxArtMTipo_Jsonclick = "" ;
      edtVxArtMTipo_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtMTipo_Enabled = 1 ;
      edtVxArtHiNm_Jsonclick = "" ;
      edtVxArtHiNm_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtHiNm_Enabled = 0 ;
      edtVxArtTHiUn_Jsonclick = "" ;
      edtVxArtTHiUn_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTHiUn_Enabled = 1 ;
      edtVxArtHiTit_Jsonclick = "" ;
      edtVxArtHiTit_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtHiTit_Enabled = 1 ;
      edtVxArtDsc_Jsonclick = "" ;
      edtVxArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxArtCod_Jsonclick = "" ;
      edtVxArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtCod_Enabled = 1 ;
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
      GX_FocusControl = edtVxArtDsc_Internalname ;
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

   public void valid_Vxartcod( )
   {
      n7420VxArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7524VxArtDsc", GXutil.rtrim( A7524VxArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12280VxArtHiTit", GXutil.ltrim( localUtil.ntoc( A12280VxArtHiTit, (byte)(8), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12281VxArtTHiUn", GXutil.rtrim( A12281VxArtTHiUn));
      httpContext.ajax_rsp_assign_attri("", false, "A12585VxArtMTipo", GXutil.rtrim( A12585VxArtMTipo));
      httpContext.ajax_rsp_assign_attri("", false, "A12586VxArtTipo", GXutil.rtrim( A12586VxArtTipo));
      httpContext.ajax_rsp_assign_attri("", false, "A12587VxArtSTipo", GXutil.rtrim( A12587VxArtSTipo));
      httpContext.ajax_rsp_assign_attri("", false, "A12588VxArtCDsc", GXutil.rtrim( A12588VxArtCDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12589VxArtETXP", GXutil.rtrim( A12589VxArtETXP));
      httpContext.ajax_rsp_assign_attri("", false, "A12590VxArtATXP", GXutil.rtrim( A12590VxArtATXP));
      httpContext.ajax_rsp_assign_attri("", false, "A12591VxArtCTXP", GXutil.ltrim( localUtil.ntoc( A12591VxArtCTXP, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12592VxArtAct", GXutil.ltrim( localUtil.ntoc( A12592VxArtAct, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12593VxArtUsMo", GXutil.rtrim( A12593VxArtUsMo));
      httpContext.ajax_rsp_assign_attri("", false, "A12594VxArtFeMo", localUtil.ttoc( A12594VxArtFeMo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12976VxAcaCli", GXutil.ltrim( localUtil.ntoc( A12976VxAcaCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12977VXAcaArt", GXutil.rtrim( A12977VXAcaArt));
      httpContext.ajax_rsp_assign_attri("", false, "A12282VxArtHiNm", GXutil.ltrim( localUtil.ntoc( A12282VxArtHiNm, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7420VxArtCod", GXutil.rtrim( Z7420VxArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7524VxArtDsc", GXutil.rtrim( Z7524VxArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12280VxArtHiTit", GXutil.ltrim( localUtil.ntoc( Z12280VxArtHiTit, (byte)(8), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12281VxArtTHiUn", GXutil.rtrim( Z12281VxArtTHiUn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12585VxArtMTipo", GXutil.rtrim( Z12585VxArtMTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12586VxArtTipo", GXutil.rtrim( Z12586VxArtTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12587VxArtSTipo", GXutil.rtrim( Z12587VxArtSTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12588VxArtCDsc", GXutil.rtrim( Z12588VxArtCDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12589VxArtETXP", GXutil.rtrim( Z12589VxArtETXP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12590VxArtATXP", GXutil.rtrim( Z12590VxArtATXP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12591VxArtCTXP", GXutil.ltrim( localUtil.ntoc( Z12591VxArtCTXP, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12592VxArtAct", GXutil.ltrim( localUtil.ntoc( Z12592VxArtAct, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12593VxArtUsMo", GXutil.rtrim( Z12593VxArtUsMo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12594VxArtFeMo", localUtil.ttoc( Z12594VxArtFeMo, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12976VxAcaCli", GXutil.ltrim( localUtil.ntoc( Z12976VxAcaCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12977VXAcaArt", GXutil.rtrim( Z12977VXAcaArt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12282VxArtHiNm", GXutil.ltrim( localUtil.ntoc( Z12282VxArtHiNm, (byte)(6), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_VXARTCOD","{handler:'valid_Vxartcod',iparms:[{av:'A7420VxArtCod',fld:'VXARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXARTCOD",",oparms:[{av:'A7524VxArtDsc',fld:'VXARTDSC',pic:''},{av:'A12280VxArtHiTit',fld:'VXARTHITIT',pic:'ZZ9.9999'},{av:'A12281VxArtTHiUn',fld:'VXARTTHIUN',pic:''},{av:'A12585VxArtMTipo',fld:'VXARTMTIPO',pic:''},{av:'A12586VxArtTipo',fld:'VXARTTIPO',pic:''},{av:'A12587VxArtSTipo',fld:'VXARTSTIPO',pic:''},{av:'A12588VxArtCDsc',fld:'VXARTCDSC',pic:''},{av:'A12589VxArtETXP',fld:'VXARTETXP',pic:''},{av:'A12590VxArtATXP',fld:'VXARTATXP',pic:''},{av:'A12591VxArtCTXP',fld:'VXARTCTXP',pic:'ZZZZZ9'},{av:'A12592VxArtAct',fld:'VXARTACT',pic:'9'},{av:'A12593VxArtUsMo',fld:'VXARTUSMO',pic:''},{av:'A12594VxArtFeMo',fld:'VXARTFEMO',pic:'99/99/99 99:99'},{av:'A12976VxAcaCli',fld:'VXACACLI',pic:'ZZZZZ9'},{av:'A12977VXAcaArt',fld:'VXACAART',pic:''},{av:'A12282VxArtHiNm',fld:'VXARTHINM',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7420VxArtCod'},{av:'Z7524VxArtDsc'},{av:'Z12280VxArtHiTit'},{av:'Z12281VxArtTHiUn'},{av:'Z12585VxArtMTipo'},{av:'Z12586VxArtTipo'},{av:'Z12587VxArtSTipo'},{av:'Z12588VxArtCDsc'},{av:'Z12589VxArtETXP'},{av:'Z12590VxArtATXP'},{av:'Z12591VxArtCTXP'},{av:'Z12592VxArtAct'},{av:'Z12593VxArtUsMo'},{av:'Z12594VxArtFeMo'},{av:'Z12976VxAcaCli'},{av:'Z12977VXAcaArt'},{av:'Z12282VxArtHiNm'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXARTHITIT","{handler:'valid_Vxarthitit',iparms:[]");
      setEventMetadata("VALID_VXARTHITIT",",oparms:[]}");
      setEventMetadata("VALID_VXARTTHIUN","{handler:'valid_Vxartthiun',iparms:[]");
      setEventMetadata("VALID_VXARTTHIUN",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z7420VxArtCod = "" ;
      Z7524VxArtDsc = "" ;
      Z12280VxArtHiTit = DecimalUtil.ZERO ;
      Z12281VxArtTHiUn = "" ;
      Z12585VxArtMTipo = "" ;
      Z12586VxArtTipo = "" ;
      Z12587VxArtSTipo = "" ;
      Z12588VxArtCDsc = "" ;
      Z12589VxArtETXP = "" ;
      Z12590VxArtATXP = "" ;
      Z12593VxArtUsMo = "" ;
      Z12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
      Z12977VXAcaArt = "" ;
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
      A7420VxArtCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A7524VxArtDsc = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12280VxArtHiTit = DecimalUtil.ZERO ;
      lblTextblock4_Jsonclick = "" ;
      A12281VxArtTHiUn = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12282VxArtHiNm = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A12585VxArtMTipo = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12586VxArtTipo = "" ;
      lblTextblock8_Jsonclick = "" ;
      A12587VxArtSTipo = "" ;
      lblTextblock9_Jsonclick = "" ;
      A12588VxArtCDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12589VxArtETXP = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12590VxArtATXP = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A12593VxArtUsMo = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A12977VXAcaArt = "" ;
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
      T00ZH4_A7420VxArtCod = new String[] {""} ;
      T00ZH4_n7420VxArtCod = new boolean[] {false} ;
      T00ZH4_A7524VxArtDsc = new String[] {""} ;
      T00ZH4_n7524VxArtDsc = new boolean[] {false} ;
      T00ZH4_A12280VxArtHiTit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZH4_n12280VxArtHiTit = new boolean[] {false} ;
      T00ZH4_A12281VxArtTHiUn = new String[] {""} ;
      T00ZH4_n12281VxArtTHiUn = new boolean[] {false} ;
      T00ZH4_A12585VxArtMTipo = new String[] {""} ;
      T00ZH4_n12585VxArtMTipo = new boolean[] {false} ;
      T00ZH4_A12586VxArtTipo = new String[] {""} ;
      T00ZH4_n12586VxArtTipo = new boolean[] {false} ;
      T00ZH4_A12587VxArtSTipo = new String[] {""} ;
      T00ZH4_n12587VxArtSTipo = new boolean[] {false} ;
      T00ZH4_A12588VxArtCDsc = new String[] {""} ;
      T00ZH4_n12588VxArtCDsc = new boolean[] {false} ;
      T00ZH4_A12589VxArtETXP = new String[] {""} ;
      T00ZH4_n12589VxArtETXP = new boolean[] {false} ;
      T00ZH4_A12590VxArtATXP = new String[] {""} ;
      T00ZH4_n12590VxArtATXP = new boolean[] {false} ;
      T00ZH4_A12591VxArtCTXP = new int[1] ;
      T00ZH4_n12591VxArtCTXP = new boolean[] {false} ;
      T00ZH4_A12592VxArtAct = new byte[1] ;
      T00ZH4_n12592VxArtAct = new boolean[] {false} ;
      T00ZH4_A12593VxArtUsMo = new String[] {""} ;
      T00ZH4_n12593VxArtUsMo = new boolean[] {false} ;
      T00ZH4_A12594VxArtFeMo = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZH4_n12594VxArtFeMo = new boolean[] {false} ;
      T00ZH4_A12976VxAcaCli = new int[1] ;
      T00ZH4_n12976VxAcaCli = new boolean[] {false} ;
      T00ZH4_A12977VXAcaArt = new String[] {""} ;
      T00ZH4_n12977VXAcaArt = new boolean[] {false} ;
      T00ZH5_A7420VxArtCod = new String[] {""} ;
      T00ZH5_n7420VxArtCod = new boolean[] {false} ;
      T00ZH3_A7420VxArtCod = new String[] {""} ;
      T00ZH3_n7420VxArtCod = new boolean[] {false} ;
      T00ZH3_A7524VxArtDsc = new String[] {""} ;
      T00ZH3_n7524VxArtDsc = new boolean[] {false} ;
      T00ZH3_A12280VxArtHiTit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZH3_n12280VxArtHiTit = new boolean[] {false} ;
      T00ZH3_A12281VxArtTHiUn = new String[] {""} ;
      T00ZH3_n12281VxArtTHiUn = new boolean[] {false} ;
      T00ZH3_A12585VxArtMTipo = new String[] {""} ;
      T00ZH3_n12585VxArtMTipo = new boolean[] {false} ;
      T00ZH3_A12586VxArtTipo = new String[] {""} ;
      T00ZH3_n12586VxArtTipo = new boolean[] {false} ;
      T00ZH3_A12587VxArtSTipo = new String[] {""} ;
      T00ZH3_n12587VxArtSTipo = new boolean[] {false} ;
      T00ZH3_A12588VxArtCDsc = new String[] {""} ;
      T00ZH3_n12588VxArtCDsc = new boolean[] {false} ;
      T00ZH3_A12589VxArtETXP = new String[] {""} ;
      T00ZH3_n12589VxArtETXP = new boolean[] {false} ;
      T00ZH3_A12590VxArtATXP = new String[] {""} ;
      T00ZH3_n12590VxArtATXP = new boolean[] {false} ;
      T00ZH3_A12591VxArtCTXP = new int[1] ;
      T00ZH3_n12591VxArtCTXP = new boolean[] {false} ;
      T00ZH3_A12592VxArtAct = new byte[1] ;
      T00ZH3_n12592VxArtAct = new boolean[] {false} ;
      T00ZH3_A12593VxArtUsMo = new String[] {""} ;
      T00ZH3_n12593VxArtUsMo = new boolean[] {false} ;
      T00ZH3_A12594VxArtFeMo = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZH3_n12594VxArtFeMo = new boolean[] {false} ;
      T00ZH3_A12976VxAcaCli = new int[1] ;
      T00ZH3_n12976VxAcaCli = new boolean[] {false} ;
      T00ZH3_A12977VXAcaArt = new String[] {""} ;
      T00ZH3_n12977VXAcaArt = new boolean[] {false} ;
      sMode1056 = "" ;
      T00ZH6_A7420VxArtCod = new String[] {""} ;
      T00ZH6_n7420VxArtCod = new boolean[] {false} ;
      T00ZH7_A7420VxArtCod = new String[] {""} ;
      T00ZH7_n7420VxArtCod = new boolean[] {false} ;
      T00ZH2_A7420VxArtCod = new String[] {""} ;
      T00ZH2_n7420VxArtCod = new boolean[] {false} ;
      T00ZH2_A7524VxArtDsc = new String[] {""} ;
      T00ZH2_n7524VxArtDsc = new boolean[] {false} ;
      T00ZH2_A12280VxArtHiTit = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZH2_n12280VxArtHiTit = new boolean[] {false} ;
      T00ZH2_A12281VxArtTHiUn = new String[] {""} ;
      T00ZH2_n12281VxArtTHiUn = new boolean[] {false} ;
      T00ZH2_A12585VxArtMTipo = new String[] {""} ;
      T00ZH2_n12585VxArtMTipo = new boolean[] {false} ;
      T00ZH2_A12586VxArtTipo = new String[] {""} ;
      T00ZH2_n12586VxArtTipo = new boolean[] {false} ;
      T00ZH2_A12587VxArtSTipo = new String[] {""} ;
      T00ZH2_n12587VxArtSTipo = new boolean[] {false} ;
      T00ZH2_A12588VxArtCDsc = new String[] {""} ;
      T00ZH2_n12588VxArtCDsc = new boolean[] {false} ;
      T00ZH2_A12589VxArtETXP = new String[] {""} ;
      T00ZH2_n12589VxArtETXP = new boolean[] {false} ;
      T00ZH2_A12590VxArtATXP = new String[] {""} ;
      T00ZH2_n12590VxArtATXP = new boolean[] {false} ;
      T00ZH2_A12591VxArtCTXP = new int[1] ;
      T00ZH2_n12591VxArtCTXP = new boolean[] {false} ;
      T00ZH2_A12592VxArtAct = new byte[1] ;
      T00ZH2_n12592VxArtAct = new boolean[] {false} ;
      T00ZH2_A12593VxArtUsMo = new String[] {""} ;
      T00ZH2_n12593VxArtUsMo = new boolean[] {false} ;
      T00ZH2_A12594VxArtFeMo = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZH2_n12594VxArtFeMo = new boolean[] {false} ;
      T00ZH2_A12976VxAcaCli = new int[1] ;
      T00ZH2_n12976VxAcaCli = new boolean[] {false} ;
      T00ZH2_A12977VXAcaArt = new String[] {""} ;
      T00ZH2_n12977VXAcaArt = new boolean[] {false} ;
      T00ZH11_A7525VxOFabTip = new String[] {""} ;
      T00ZH11_A12372VxOSCod = new int[1] ;
      T00ZH12_A7525VxOFabTip = new String[] {""} ;
      T00ZH12_A6274VxBarcod = new int[1] ;
      T00ZH12_A7526VxOsCoLin = new byte[1] ;
      T00ZH13_A7420VxArtCod = new String[] {""} ;
      T00ZH13_n7420VxArtCod = new boolean[] {false} ;
      T00ZH13_A11764VxFTecNr = new short[1] ;
      T00ZH13_A11772VxFTCoL = new byte[1] ;
      T00ZH14_A7420VxArtCod = new String[] {""} ;
      T00ZH14_n7420VxArtCod = new boolean[] {false} ;
      T00ZH14_A11764VxFTecNr = new short[1] ;
      T00ZH14_A11765VxMaqGrp = new long[1] ;
      T00ZH15_A7420VxArtCod = new String[] {""} ;
      T00ZH15_n7420VxArtCod = new boolean[] {false} ;
      T00ZH15_A7421VxArTCCod = new String[] {""} ;
      T00ZH16_A7420VxArtCod = new String[] {""} ;
      T00ZH16_n7420VxArtCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z12282VxArtHiNm = DecimalUtil.ZERO ;
      ZZ7420VxArtCod = "" ;
      ZZ7524VxArtDsc = "" ;
      ZZ12280VxArtHiTit = DecimalUtil.ZERO ;
      ZZ12281VxArtTHiUn = "" ;
      ZZ12585VxArtMTipo = "" ;
      ZZ12586VxArtTipo = "" ;
      ZZ12587VxArtSTipo = "" ;
      ZZ12588VxArtCDsc = "" ;
      ZZ12589VxArtETXP = "" ;
      ZZ12590VxArtATXP = "" ;
      ZZ12593VxArtUsMo = "" ;
      ZZ12594VxArtFeMo = GXutil.resetTime( GXutil.nullDate() );
      ZZ12977VXAcaArt = "" ;
      ZZ12282VxArtHiNm = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxarti__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxarti__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxarti__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxarti__default(),
         new Object[] {
             new Object[] {
            T00ZH2_A7420VxArtCod, T00ZH2_A7524VxArtDsc, T00ZH2_n7524VxArtDsc, T00ZH2_A12280VxArtHiTit, T00ZH2_n12280VxArtHiTit, T00ZH2_A12281VxArtTHiUn, T00ZH2_n12281VxArtTHiUn, T00ZH2_A12585VxArtMTipo, T00ZH2_n12585VxArtMTipo, T00ZH2_A12586VxArtTipo,
            T00ZH2_n12586VxArtTipo, T00ZH2_A12587VxArtSTipo, T00ZH2_n12587VxArtSTipo, T00ZH2_A12588VxArtCDsc, T00ZH2_n12588VxArtCDsc, T00ZH2_A12589VxArtETXP, T00ZH2_n12589VxArtETXP, T00ZH2_A12590VxArtATXP, T00ZH2_n12590VxArtATXP, T00ZH2_A12591VxArtCTXP,
            T00ZH2_n12591VxArtCTXP, T00ZH2_A12592VxArtAct, T00ZH2_n12592VxArtAct, T00ZH2_A12593VxArtUsMo, T00ZH2_n12593VxArtUsMo, T00ZH2_A12594VxArtFeMo, T00ZH2_n12594VxArtFeMo, T00ZH2_A12976VxAcaCli, T00ZH2_n12976VxAcaCli, T00ZH2_A12977VXAcaArt,
            T00ZH2_n12977VXAcaArt
            }
            , new Object[] {
            T00ZH3_A7420VxArtCod, T00ZH3_A7524VxArtDsc, T00ZH3_n7524VxArtDsc, T00ZH3_A12280VxArtHiTit, T00ZH3_n12280VxArtHiTit, T00ZH3_A12281VxArtTHiUn, T00ZH3_n12281VxArtTHiUn, T00ZH3_A12585VxArtMTipo, T00ZH3_n12585VxArtMTipo, T00ZH3_A12586VxArtTipo,
            T00ZH3_n12586VxArtTipo, T00ZH3_A12587VxArtSTipo, T00ZH3_n12587VxArtSTipo, T00ZH3_A12588VxArtCDsc, T00ZH3_n12588VxArtCDsc, T00ZH3_A12589VxArtETXP, T00ZH3_n12589VxArtETXP, T00ZH3_A12590VxArtATXP, T00ZH3_n12590VxArtATXP, T00ZH3_A12591VxArtCTXP,
            T00ZH3_n12591VxArtCTXP, T00ZH3_A12592VxArtAct, T00ZH3_n12592VxArtAct, T00ZH3_A12593VxArtUsMo, T00ZH3_n12593VxArtUsMo, T00ZH3_A12594VxArtFeMo, T00ZH3_n12594VxArtFeMo, T00ZH3_A12976VxAcaCli, T00ZH3_n12976VxAcaCli, T00ZH3_A12977VXAcaArt,
            T00ZH3_n12977VXAcaArt
            }
            , new Object[] {
            T00ZH4_A7420VxArtCod, T00ZH4_A7524VxArtDsc, T00ZH4_n7524VxArtDsc, T00ZH4_A12280VxArtHiTit, T00ZH4_n12280VxArtHiTit, T00ZH4_A12281VxArtTHiUn, T00ZH4_n12281VxArtTHiUn, T00ZH4_A12585VxArtMTipo, T00ZH4_n12585VxArtMTipo, T00ZH4_A12586VxArtTipo,
            T00ZH4_n12586VxArtTipo, T00ZH4_A12587VxArtSTipo, T00ZH4_n12587VxArtSTipo, T00ZH4_A12588VxArtCDsc, T00ZH4_n12588VxArtCDsc, T00ZH4_A12589VxArtETXP, T00ZH4_n12589VxArtETXP, T00ZH4_A12590VxArtATXP, T00ZH4_n12590VxArtATXP, T00ZH4_A12591VxArtCTXP,
            T00ZH4_n12591VxArtCTXP, T00ZH4_A12592VxArtAct, T00ZH4_n12592VxArtAct, T00ZH4_A12593VxArtUsMo, T00ZH4_n12593VxArtUsMo, T00ZH4_A12594VxArtFeMo, T00ZH4_n12594VxArtFeMo, T00ZH4_A12976VxAcaCli, T00ZH4_n12976VxAcaCli, T00ZH4_A12977VXAcaArt,
            T00ZH4_n12977VXAcaArt
            }
            , new Object[] {
            T00ZH5_A7420VxArtCod
            }
            , new Object[] {
            T00ZH6_A7420VxArtCod
            }
            , new Object[] {
            T00ZH7_A7420VxArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00ZH11_A7525VxOFabTip, T00ZH11_A12372VxOSCod
            }
            , new Object[] {
            T00ZH12_A7525VxOFabTip, T00ZH12_A6274VxBarcod, T00ZH12_A7526VxOsCoLin
            }
            , new Object[] {
            T00ZH13_A7420VxArtCod, T00ZH13_A11764VxFTecNr, T00ZH13_A11772VxFTCoL
            }
            , new Object[] {
            T00ZH14_A7420VxArtCod, T00ZH14_A11764VxFTecNr, T00ZH14_A11765VxMaqGrp
            }
            , new Object[] {
            T00ZH15_A7420VxArtCod, T00ZH15_A7421VxArTCCod
            }
            , new Object[] {
            T00ZH16_A7420VxArtCod
            }
         }
      );
   }

   private byte Z12592VxArtAct ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12592VxArtAct ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12592VxArtAct ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1056 ;
   private short nIsDirty_1056 ;
   private int Z12591VxArtCTXP ;
   private int Z12976VxAcaCli ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxArtDsc_Enabled ;
   private int edtVxArtHiTit_Enabled ;
   private int edtVxArtTHiUn_Enabled ;
   private int edtVxArtHiNm_Enabled ;
   private int edtVxArtMTipo_Enabled ;
   private int edtVxArtTipo_Enabled ;
   private int edtVxArtSTipo_Enabled ;
   private int edtVxArtCDsc_Enabled ;
   private int edtVxArtETXP_Enabled ;
   private int edtVxArtATXP_Enabled ;
   private int A12591VxArtCTXP ;
   private int edtVxArtCTXP_Enabled ;
   private int edtVxArtAct_Enabled ;
   private int edtVxArtUsMo_Enabled ;
   private int edtVxArtFeMo_Enabled ;
   private int A12976VxAcaCli ;
   private int edtVxAcaCli_Enabled ;
   private int edtVXAcaArt_Enabled ;
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
   private int edtVXAcaArt_Backcolor ;
   private int edtVxAcaCli_Backcolor ;
   private int edtVxArtFeMo_Backcolor ;
   private int edtVxArtUsMo_Backcolor ;
   private int edtVxArtAct_Backcolor ;
   private int edtVxArtCTXP_Backcolor ;
   private int edtVxArtATXP_Backcolor ;
   private int edtVxArtETXP_Backcolor ;
   private int edtVxArtCDsc_Backcolor ;
   private int edtVxArtSTipo_Backcolor ;
   private int edtVxArtTipo_Backcolor ;
   private int edtVxArtMTipo_Backcolor ;
   private int edtVxArtHiNm_Backcolor ;
   private int edtVxArtTHiUn_Backcolor ;
   private int edtVxArtHiTit_Backcolor ;
   private int edtVxArtDsc_Backcolor ;
   private int edtVxArtCod_Backcolor ;
   private int ZZ12591VxArtCTXP ;
   private int ZZ12976VxAcaCli ;
   private java.math.BigDecimal Z12280VxArtHiTit ;
   private java.math.BigDecimal A12280VxArtHiTit ;
   private java.math.BigDecimal A12282VxArtHiNm ;
   private java.math.BigDecimal Z12282VxArtHiNm ;
   private java.math.BigDecimal ZZ12280VxArtHiTit ;
   private java.math.BigDecimal ZZ12282VxArtHiNm ;
   private String sPrefix ;
   private String Z7420VxArtCod ;
   private String Z7524VxArtDsc ;
   private String Z12281VxArtTHiUn ;
   private String Z12585VxArtMTipo ;
   private String Z12586VxArtTipo ;
   private String Z12587VxArtSTipo ;
   private String Z12588VxArtCDsc ;
   private String Z12589VxArtETXP ;
   private String Z12590VxArtATXP ;
   private String Z12593VxArtUsMo ;
   private String Z12977VXAcaArt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxArtCod_Internalname ;
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
   private String A7420VxArtCod ;
   private String edtVxArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxArtDsc_Internalname ;
   private String A7524VxArtDsc ;
   private String edtVxArtDsc_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxArtHiTit_Internalname ;
   private String edtVxArtHiTit_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxArtTHiUn_Internalname ;
   private String A12281VxArtTHiUn ;
   private String edtVxArtTHiUn_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxArtHiNm_Internalname ;
   private String edtVxArtHiNm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxArtMTipo_Internalname ;
   private String A12585VxArtMTipo ;
   private String edtVxArtMTipo_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxArtTipo_Internalname ;
   private String A12586VxArtTipo ;
   private String edtVxArtTipo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxArtSTipo_Internalname ;
   private String A12587VxArtSTipo ;
   private String edtVxArtSTipo_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVxArtCDsc_Internalname ;
   private String A12588VxArtCDsc ;
   private String edtVxArtCDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtVxArtETXP_Internalname ;
   private String A12589VxArtETXP ;
   private String edtVxArtETXP_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtVxArtATXP_Internalname ;
   private String A12590VxArtATXP ;
   private String edtVxArtATXP_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtVxArtCTXP_Internalname ;
   private String edtVxArtCTXP_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtVxArtAct_Internalname ;
   private String edtVxArtAct_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtVxArtUsMo_Internalname ;
   private String A12593VxArtUsMo ;
   private String edtVxArtUsMo_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtVxArtFeMo_Internalname ;
   private String edtVxArtFeMo_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtVxAcaCli_Internalname ;
   private String edtVxAcaCli_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtVXAcaArt_Internalname ;
   private String A12977VXAcaArt ;
   private String edtVXAcaArt_Jsonclick ;
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
   private String sMode1056 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ7420VxArtCod ;
   private String ZZ7524VxArtDsc ;
   private String ZZ12281VxArtTHiUn ;
   private String ZZ12585VxArtMTipo ;
   private String ZZ12586VxArtTipo ;
   private String ZZ12587VxArtSTipo ;
   private String ZZ12588VxArtCDsc ;
   private String ZZ12589VxArtETXP ;
   private String ZZ12590VxArtATXP ;
   private String ZZ12593VxArtUsMo ;
   private String ZZ12977VXAcaArt ;
   private java.util.Date Z12594VxArtFeMo ;
   private java.util.Date A12594VxArtFeMo ;
   private java.util.Date ZZ12594VxArtFeMo ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n7420VxArtCod ;
   private boolean n7524VxArtDsc ;
   private boolean n12280VxArtHiTit ;
   private boolean n12281VxArtTHiUn ;
   private boolean n12585VxArtMTipo ;
   private boolean n12586VxArtTipo ;
   private boolean n12587VxArtSTipo ;
   private boolean n12588VxArtCDsc ;
   private boolean n12589VxArtETXP ;
   private boolean n12590VxArtATXP ;
   private boolean n12591VxArtCTXP ;
   private boolean n12592VxArtAct ;
   private boolean n12593VxArtUsMo ;
   private boolean n12594VxArtFeMo ;
   private boolean n12976VxAcaCli ;
   private boolean n12977VXAcaArt ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T00ZH4_A7420VxArtCod ;
   private boolean[] T00ZH4_n7420VxArtCod ;
   private String[] T00ZH4_A7524VxArtDsc ;
   private boolean[] T00ZH4_n7524VxArtDsc ;
   private java.math.BigDecimal[] T00ZH4_A12280VxArtHiTit ;
   private boolean[] T00ZH4_n12280VxArtHiTit ;
   private String[] T00ZH4_A12281VxArtTHiUn ;
   private boolean[] T00ZH4_n12281VxArtTHiUn ;
   private String[] T00ZH4_A12585VxArtMTipo ;
   private boolean[] T00ZH4_n12585VxArtMTipo ;
   private String[] T00ZH4_A12586VxArtTipo ;
   private boolean[] T00ZH4_n12586VxArtTipo ;
   private String[] T00ZH4_A12587VxArtSTipo ;
   private boolean[] T00ZH4_n12587VxArtSTipo ;
   private String[] T00ZH4_A12588VxArtCDsc ;
   private boolean[] T00ZH4_n12588VxArtCDsc ;
   private String[] T00ZH4_A12589VxArtETXP ;
   private boolean[] T00ZH4_n12589VxArtETXP ;
   private String[] T00ZH4_A12590VxArtATXP ;
   private boolean[] T00ZH4_n12590VxArtATXP ;
   private int[] T00ZH4_A12591VxArtCTXP ;
   private boolean[] T00ZH4_n12591VxArtCTXP ;
   private byte[] T00ZH4_A12592VxArtAct ;
   private boolean[] T00ZH4_n12592VxArtAct ;
   private String[] T00ZH4_A12593VxArtUsMo ;
   private boolean[] T00ZH4_n12593VxArtUsMo ;
   private java.util.Date[] T00ZH4_A12594VxArtFeMo ;
   private boolean[] T00ZH4_n12594VxArtFeMo ;
   private int[] T00ZH4_A12976VxAcaCli ;
   private boolean[] T00ZH4_n12976VxAcaCli ;
   private String[] T00ZH4_A12977VXAcaArt ;
   private boolean[] T00ZH4_n12977VXAcaArt ;
   private String[] T00ZH5_A7420VxArtCod ;
   private boolean[] T00ZH5_n7420VxArtCod ;
   private String[] T00ZH3_A7420VxArtCod ;
   private boolean[] T00ZH3_n7420VxArtCod ;
   private String[] T00ZH3_A7524VxArtDsc ;
   private boolean[] T00ZH3_n7524VxArtDsc ;
   private java.math.BigDecimal[] T00ZH3_A12280VxArtHiTit ;
   private boolean[] T00ZH3_n12280VxArtHiTit ;
   private String[] T00ZH3_A12281VxArtTHiUn ;
   private boolean[] T00ZH3_n12281VxArtTHiUn ;
   private String[] T00ZH3_A12585VxArtMTipo ;
   private boolean[] T00ZH3_n12585VxArtMTipo ;
   private String[] T00ZH3_A12586VxArtTipo ;
   private boolean[] T00ZH3_n12586VxArtTipo ;
   private String[] T00ZH3_A12587VxArtSTipo ;
   private boolean[] T00ZH3_n12587VxArtSTipo ;
   private String[] T00ZH3_A12588VxArtCDsc ;
   private boolean[] T00ZH3_n12588VxArtCDsc ;
   private String[] T00ZH3_A12589VxArtETXP ;
   private boolean[] T00ZH3_n12589VxArtETXP ;
   private String[] T00ZH3_A12590VxArtATXP ;
   private boolean[] T00ZH3_n12590VxArtATXP ;
   private int[] T00ZH3_A12591VxArtCTXP ;
   private boolean[] T00ZH3_n12591VxArtCTXP ;
   private byte[] T00ZH3_A12592VxArtAct ;
   private boolean[] T00ZH3_n12592VxArtAct ;
   private String[] T00ZH3_A12593VxArtUsMo ;
   private boolean[] T00ZH3_n12593VxArtUsMo ;
   private java.util.Date[] T00ZH3_A12594VxArtFeMo ;
   private boolean[] T00ZH3_n12594VxArtFeMo ;
   private int[] T00ZH3_A12976VxAcaCli ;
   private boolean[] T00ZH3_n12976VxAcaCli ;
   private String[] T00ZH3_A12977VXAcaArt ;
   private boolean[] T00ZH3_n12977VXAcaArt ;
   private String[] T00ZH6_A7420VxArtCod ;
   private boolean[] T00ZH6_n7420VxArtCod ;
   private String[] T00ZH7_A7420VxArtCod ;
   private boolean[] T00ZH7_n7420VxArtCod ;
   private String[] T00ZH2_A7420VxArtCod ;
   private boolean[] T00ZH2_n7420VxArtCod ;
   private String[] T00ZH2_A7524VxArtDsc ;
   private boolean[] T00ZH2_n7524VxArtDsc ;
   private java.math.BigDecimal[] T00ZH2_A12280VxArtHiTit ;
   private boolean[] T00ZH2_n12280VxArtHiTit ;
   private String[] T00ZH2_A12281VxArtTHiUn ;
   private boolean[] T00ZH2_n12281VxArtTHiUn ;
   private String[] T00ZH2_A12585VxArtMTipo ;
   private boolean[] T00ZH2_n12585VxArtMTipo ;
   private String[] T00ZH2_A12586VxArtTipo ;
   private boolean[] T00ZH2_n12586VxArtTipo ;
   private String[] T00ZH2_A12587VxArtSTipo ;
   private boolean[] T00ZH2_n12587VxArtSTipo ;
   private String[] T00ZH2_A12588VxArtCDsc ;
   private boolean[] T00ZH2_n12588VxArtCDsc ;
   private String[] T00ZH2_A12589VxArtETXP ;
   private boolean[] T00ZH2_n12589VxArtETXP ;
   private String[] T00ZH2_A12590VxArtATXP ;
   private boolean[] T00ZH2_n12590VxArtATXP ;
   private int[] T00ZH2_A12591VxArtCTXP ;
   private boolean[] T00ZH2_n12591VxArtCTXP ;
   private byte[] T00ZH2_A12592VxArtAct ;
   private boolean[] T00ZH2_n12592VxArtAct ;
   private String[] T00ZH2_A12593VxArtUsMo ;
   private boolean[] T00ZH2_n12593VxArtUsMo ;
   private java.util.Date[] T00ZH2_A12594VxArtFeMo ;
   private boolean[] T00ZH2_n12594VxArtFeMo ;
   private int[] T00ZH2_A12976VxAcaCli ;
   private boolean[] T00ZH2_n12976VxAcaCli ;
   private String[] T00ZH2_A12977VXAcaArt ;
   private boolean[] T00ZH2_n12977VXAcaArt ;
   private String[] T00ZH11_A7525VxOFabTip ;
   private int[] T00ZH11_A12372VxOSCod ;
   private String[] T00ZH12_A7525VxOFabTip ;
   private int[] T00ZH12_A6274VxBarcod ;
   private byte[] T00ZH12_A7526VxOsCoLin ;
   private String[] T00ZH13_A7420VxArtCod ;
   private boolean[] T00ZH13_n7420VxArtCod ;
   private short[] T00ZH13_A11764VxFTecNr ;
   private byte[] T00ZH13_A11772VxFTCoL ;
   private String[] T00ZH14_A7420VxArtCod ;
   private boolean[] T00ZH14_n7420VxArtCod ;
   private short[] T00ZH14_A11764VxFTecNr ;
   private long[] T00ZH14_A11765VxMaqGrp ;
   private String[] T00ZH15_A7420VxArtCod ;
   private boolean[] T00ZH15_n7420VxArtCod ;
   private String[] T00ZH15_A7421VxArTCCod ;
   private String[] T00ZH16_A7420VxArtCod ;
   private boolean[] T00ZH16_n7420VxArtCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxarti__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxarti__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxarti__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxarti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00ZH2", "SELECT ArtCod AS VxArtCod, artdsc, ArtHilTit, ArtHilUnTi, ArtMTipo, ArtTipo, ArtSTipo, ArtDscTe, AcaEmprCod, AcaArtCod AS VxArtATXP, AcaCliCod AS VxArtCTXP, ArtActivo, ArtUltUsu, ArtUltMod, AcaCliCod AS VxAcaCli, AcaArtCod AS VXAcaArt FROM VTXARTIC WHERE ArtCod = ?  FOR UPDATE OF artdsc, ArtHilTit, ArtHilUnTi, ArtMTipo, ArtTipo, ArtSTipo, ArtDscTe, AcaEmprCod, AcaArtCod, AcaCliCod, ArtActivo, ArtUltUsu, ArtUltMod, AcaCliCod, AcaArtCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZH3", "SELECT ArtCod AS VxArtCod, artdsc, ArtHilTit, ArtHilUnTi, ArtMTipo, ArtTipo, ArtSTipo, ArtDscTe, AcaEmprCod, AcaArtCod AS VxArtATXP, AcaCliCod AS VxArtCTXP, ArtActivo, ArtUltUsu, ArtUltMod, AcaCliCod AS VxAcaCli, AcaArtCod AS VXAcaArt FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZH4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtCod AS VxArtCod, TM1.artdsc, TM1.ArtHilTit, TM1.ArtHilUnTi, TM1.ArtMTipo, TM1.ArtTipo, TM1.ArtSTipo, TM1.ArtDscTe, TM1.AcaEmprCod, TM1.AcaArtCod AS VxArtATXP, TM1.AcaCliCod AS VxArtCTXP, TM1.ArtActivo, TM1.ArtUltUsu, TM1.ArtUltMod, TM1.AcaCliCod AS VxAcaCli, TM1.AcaArtCod AS VXAcaArt FROM VTXARTIC TM1 WHERE TM1.ArtCod = ? ORDER BY TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZH5", "SELECT /*+ FIRST_ROWS(1) */ ArtCod AS VxArtCod FROM VTXARTIC WHERE ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZH6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtCod AS VxArtCod FROM VTXARTIC WHERE ( ArtCod > ?) ORDER BY ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtCod AS VxArtCod FROM VTXARTIC WHERE ( ArtCod < ?) ORDER BY ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00ZH8", "INSERT INTO VTXARTIC(ArtCod, artdsc, ArtHilTit, ArtHilUnTi, ArtMTipo, ArtTipo, ArtSTipo, ArtDscTe, AcaEmprCod, AcaArtCod, AcaCliCod, ArtActivo, ArtUltUsu, ArtUltMod, AcaCliCod, AcaArtCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXARTIC")
         ,new UpdateCursor("T00ZH9", "UPDATE VTXARTIC SET artdsc=?, ArtHilTit=?, ArtHilUnTi=?, ArtMTipo=?, ArtTipo=?, ArtSTipo=?, ArtDscTe=?, AcaEmprCod=?, AcaArtCod=?, AcaCliCod=?, ArtActivo=?, ArtUltUsu=?, ArtUltMod=?, AcaCliCod=?, AcaArtCod=?  WHERE ArtCod = ?", GX_NOMASK, "VTXARTIC")
         ,new UpdateCursor("T00ZH10", "DELETE FROM VTXARTIC  WHERE ArtCod = ?", GX_NOMASK, "VTXARTIC")
         ,new ForEachCursor("T00ZH11", "SELECT * FROM (SELECT OFabTip, OSCod FROM VTXOSERVI WHERE ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH12", "SELECT * FROM (SELECT ofabtip, oscod, oscolin FROM VTXOSERCO WHERE OsCoArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH13", "SELECT * FROM (SELECT ArtCod AS VxArtCod, FtecNro, FTCoLin FROM VTXFTECCOM WHERE ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH14", "SELECT * FROM (SELECT VxArtCod, VxFTecNr, VxMaqGrp FROM TXPVxArtM WHERE VxArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH15", "SELECT * FROM (SELECT artcod AS VxArtCod, artccod FROM VTXARTECRU WHERE artcod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZH16", "SELECT /*+ FIRST_ROWS(100) */ ArtCod AS VxArtCod FROM VTXARTIC ORDER BY ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 26);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 3);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 16);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 8);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 16);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 16);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 16);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 16);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
      }
   }

}

