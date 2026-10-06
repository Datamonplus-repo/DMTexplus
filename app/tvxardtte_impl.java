package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxardtte_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Artìculos/Datos Técnicos en Tejeduría", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxArTECod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxardtte_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxardtte_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxardtte_impl.class ));
   }

   public tvxardtte_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxArDTTe.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código de Artículo (Es subtipo)", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArTECod_Internalname, GXutil.rtrim( A11769VxArTECod), GXutil.rtrim( localUtil.format( A11769VxArTECod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArTECod_Jsonclick, 0, "", "", "", "", "", 1, edtVxArTECod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Mallas x Cm", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArTEMxcm_Internalname, GXutil.ltrim( localUtil.ntoc( A11768VxArTEMxcm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArTEMxcm_Enabled!=0) ? localUtil.format( A11768VxArTEMxcm, "Z9.99") : localUtil.format( A11768VxArTEMxcm, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArTEMxcm_Jsonclick, 0, "", "", "", "", "", 1, edtVxArTEMxcm_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Baretas x cm", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArTEBxcm_Internalname, GXutil.ltrim( localUtil.ntoc( A12298VxArTEBxcm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArTEBxcm_Enabled!=0) ? localUtil.format( A12298VxArTEBxcm, "Z9.99") : localUtil.format( A12298VxArTEBxcm, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArTEBxcm_Jsonclick, 0, "", "", "", "", "", 1, edtVxArTEBxcm_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Torsión", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTETor_Internalname, GXutil.ltrim( localUtil.ntoc( A12297VxArtTETor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTETor_Enabled!=0) ? localUtil.format( A12297VxArtTETor, "ZZ9.99") : localUtil.format( A12297VxArtTETor, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTETor_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTETor_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArTERdto_Internalname, GXutil.ltrim( localUtil.ntoc( A12299VxArTERdto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArTERdto_Enabled!=0) ? localUtil.format( A12299VxArTERdto, "Z9.99") : localUtil.format( A12299VxArTERdto, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArTERdto_Jsonclick, 0, "", "", "", "", "", 1, edtVxArTERdto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTEAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A13018VxArtTEAnc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTEAnc_Enabled!=0) ? localUtil.format( A13018VxArtTEAnc, "ZZ9.99") : localUtil.format( A13018VxArtTEAnc, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTEAnc_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTEAnc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Gr m2", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTeGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A13019VxArtTeGrm, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTeGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13019VxArtTeGrm), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13019VxArtTeGrm), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTeGrm_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTeGrm_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Peso Metro lineal", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTEPml_Internalname, GXutil.ltrim( localUtil.ntoc( A13210VxArtTEPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTEPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13210VxArtTEPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13210VxArtTEPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTEPml_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTEPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Elongación Transversal", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTeElT_Internalname, GXutil.ltrim( localUtil.ntoc( A13523VxArtTeElT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTeElT_Enabled!=0) ? localUtil.format( A13523VxArtTeElT, "ZZ9.99") : localUtil.format( A13523VxArtTeElT, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTeElT_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTeElT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Elongación Longitudinal", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxArDTTe.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTeElL_Internalname, GXutil.ltrim( localUtil.ntoc( A13522VxArtTeElL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxArtTeElL_Enabled!=0) ? localUtil.format( A13522VxArtTeElL, "ZZ9.99") : localUtil.format( A13522VxArtTeElL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTeElL_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTeElL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxArDTTe.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxArDTTe.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxArDTTe.htm");
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
         Z11769VxArTECod = httpContext.cgiGet( "Z11769VxArTECod") ;
         Z11768VxArTEMxcm = localUtil.ctond( httpContext.cgiGet( "Z11768VxArTEMxcm")) ;
         Z12298VxArTEBxcm = localUtil.ctond( httpContext.cgiGet( "Z12298VxArTEBxcm")) ;
         Z12297VxArtTETor = localUtil.ctond( httpContext.cgiGet( "Z12297VxArtTETor")) ;
         Z12299VxArTERdto = localUtil.ctond( httpContext.cgiGet( "Z12299VxArTERdto")) ;
         Z13018VxArtTEAnc = localUtil.ctond( httpContext.cgiGet( "Z13018VxArtTEAnc")) ;
         Z13019VxArtTeGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z13019VxArtTeGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13210VxArtTEPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z13210VxArtTEPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13523VxArtTeElT = localUtil.ctond( httpContext.cgiGet( "Z13523VxArtTeElT")) ;
         Z13522VxArtTeElL = localUtil.ctond( httpContext.cgiGet( "Z13522VxArtTeElL")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A11769VxArTECod = httpContext.cgiGet( edtVxArTECod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArTEMxcm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArTEMxcm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTEMXCM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArTEMxcm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11768VxArTEMxcm = DecimalUtil.ZERO ;
            n11768VxArTEMxcm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrimstr( A11768VxArTEMxcm, 5, 2));
         }
         else
         {
            A11768VxArTEMxcm = localUtil.ctond( httpContext.cgiGet( edtVxArTEMxcm_Internalname)) ;
            n11768VxArTEMxcm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrimstr( A11768VxArTEMxcm, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArTEBxcm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArTEBxcm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTEBXCM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArTEBxcm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12298VxArTEBxcm = DecimalUtil.ZERO ;
            n12298VxArTEBxcm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrimstr( A12298VxArTEBxcm, 5, 2));
         }
         else
         {
            A12298VxArTEBxcm = localUtil.ctond( httpContext.cgiGet( edtVxArTEBxcm_Internalname)) ;
            n12298VxArTEBxcm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrimstr( A12298VxArTEBxcm, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArtTETor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArtTETor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTETOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTETor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12297VxArtTETor = DecimalUtil.ZERO ;
            n12297VxArtTETor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrimstr( A12297VxArtTETor, 6, 2));
         }
         else
         {
            A12297VxArtTETor = localUtil.ctond( httpContext.cgiGet( edtVxArtTETor_Internalname)) ;
            n12297VxArtTETor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrimstr( A12297VxArtTETor, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArTERdto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArTERdto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTERDTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArTERdto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12299VxArTERdto = DecimalUtil.ZERO ;
            n12299VxArTERdto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrimstr( A12299VxArTERdto, 5, 2));
         }
         else
         {
            A12299VxArTERdto = localUtil.ctond( httpContext.cgiGet( edtVxArTERdto_Internalname)) ;
            n12299VxArTERdto = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrimstr( A12299VxArTERdto, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArtTEAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArtTEAnc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTEANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTEAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13018VxArtTEAnc = DecimalUtil.ZERO ;
            n13018VxArtTEAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrimstr( A13018VxArtTEAnc, 6, 2));
         }
         else
         {
            A13018VxArtTEAnc = localUtil.ctond( httpContext.cgiGet( edtVxArtTEAnc_Internalname)) ;
            n13018VxArtTEAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrimstr( A13018VxArtTEAnc, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtTeGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtTeGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTEGRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTeGrm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13019VxArtTeGrm = (short)(0) ;
            n13019VxArtTeGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13019VxArtTeGrm), 3, 0));
         }
         else
         {
            A13019VxArtTeGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtVxArtTeGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13019VxArtTeGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13019VxArtTeGrm), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtTEPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxArtTEPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTEPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTEPml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13210VxArtTEPml = (short)(0) ;
            n13210VxArtTEPml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13210VxArtTEPml), 4, 0));
         }
         else
         {
            A13210VxArtTEPml = (short)(localUtil.ctol( httpContext.cgiGet( edtVxArtTEPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13210VxArtTEPml = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13210VxArtTEPml), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArtTeElT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArtTeElT_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTEELT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTeElT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13523VxArtTeElT = DecimalUtil.ZERO ;
            n13523VxArtTeElT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrimstr( A13523VxArtTeElT, 6, 2));
         }
         else
         {
            A13523VxArtTeElT = localUtil.ctond( httpContext.cgiGet( edtVxArtTeElT_Internalname)) ;
            n13523VxArtTeElT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrimstr( A13523VxArtTeElT, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxArtTeElL_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxArtTeElL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXARTTEELL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArtTeElL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13522VxArtTeElL = DecimalUtil.ZERO ;
            n13522VxArtTeElL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrimstr( A13522VxArtTeElL, 6, 2));
         }
         else
         {
            A13522VxArtTeElL = localUtil.ctond( httpContext.cgiGet( edtVxArtTeElL_Internalname)) ;
            n13522VxArtTeElL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrimstr( A13522VxArtTeElL, 6, 2));
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
            A11769VxArTECod = httpContext.GetPar( "VxArTECod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
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
            initAll1HZ1656( ) ;
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
      disableAttributes1HZ1656( ) ;
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

   public void confirm_1HZ0( )
   {
      beforeValidate1HZ1656( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HZ1656( ) ;
         }
         else
         {
            checkExtendedTable1HZ1656( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1HZ1656( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HZ0( ) ;
      }
   }

   public void resetCaption1HZ0( )
   {
   }

   public void zm1HZ1656( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11768VxArTEMxcm = T01HZ3_A11768VxArTEMxcm[0] ;
            Z12298VxArTEBxcm = T01HZ3_A12298VxArTEBxcm[0] ;
            Z12297VxArtTETor = T01HZ3_A12297VxArtTETor[0] ;
            Z12299VxArTERdto = T01HZ3_A12299VxArTERdto[0] ;
            Z13018VxArtTEAnc = T01HZ3_A13018VxArtTEAnc[0] ;
            Z13019VxArtTeGrm = T01HZ3_A13019VxArtTeGrm[0] ;
            Z13210VxArtTEPml = T01HZ3_A13210VxArtTEPml[0] ;
            Z13523VxArtTeElT = T01HZ3_A13523VxArtTeElT[0] ;
            Z13522VxArtTeElL = T01HZ3_A13522VxArtTeElL[0] ;
         }
         else
         {
            Z11768VxArTEMxcm = A11768VxArTEMxcm ;
            Z12298VxArTEBxcm = A12298VxArTEBxcm ;
            Z12297VxArtTETor = A12297VxArtTETor ;
            Z12299VxArTERdto = A12299VxArTERdto ;
            Z13018VxArtTEAnc = A13018VxArtTEAnc ;
            Z13019VxArtTeGrm = A13019VxArtTeGrm ;
            Z13210VxArtTEPml = A13210VxArtTEPml ;
            Z13523VxArtTeElT = A13523VxArtTeElT ;
            Z13522VxArtTeElL = A13522VxArtTeElL ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11769VxArTECod = A11769VxArTECod ;
         Z11768VxArTEMxcm = A11768VxArTEMxcm ;
         Z12298VxArTEBxcm = A12298VxArTEBxcm ;
         Z12297VxArtTETor = A12297VxArtTETor ;
         Z12299VxArTERdto = A12299VxArTERdto ;
         Z13018VxArtTEAnc = A13018VxArtTEAnc ;
         Z13019VxArtTeGrm = A13019VxArtTeGrm ;
         Z13210VxArtTEPml = A13210VxArtTEPml ;
         Z13523VxArtTeElT = A13523VxArtTeElT ;
         Z13522VxArtTeElL = A13522VxArtTeElL ;
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

   public void load1HZ1656( )
   {
      /* Using cursor T01HZ4 */
      pr_default.execute(2, new Object[] {A11769VxArTECod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1656 = (short)(1) ;
         A11768VxArTEMxcm = T01HZ4_A11768VxArTEMxcm[0] ;
         n11768VxArTEMxcm = T01HZ4_n11768VxArTEMxcm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrimstr( A11768VxArTEMxcm, 5, 2));
         A12298VxArTEBxcm = T01HZ4_A12298VxArTEBxcm[0] ;
         n12298VxArTEBxcm = T01HZ4_n12298VxArTEBxcm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrimstr( A12298VxArTEBxcm, 5, 2));
         A12297VxArtTETor = T01HZ4_A12297VxArtTETor[0] ;
         n12297VxArtTETor = T01HZ4_n12297VxArtTETor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrimstr( A12297VxArtTETor, 6, 2));
         A12299VxArTERdto = T01HZ4_A12299VxArTERdto[0] ;
         n12299VxArTERdto = T01HZ4_n12299VxArTERdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrimstr( A12299VxArTERdto, 5, 2));
         A13018VxArtTEAnc = T01HZ4_A13018VxArtTEAnc[0] ;
         n13018VxArtTEAnc = T01HZ4_n13018VxArtTEAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrimstr( A13018VxArtTEAnc, 6, 2));
         A13019VxArtTeGrm = T01HZ4_A13019VxArtTeGrm[0] ;
         n13019VxArtTeGrm = T01HZ4_n13019VxArtTeGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13019VxArtTeGrm), 3, 0));
         A13210VxArtTEPml = T01HZ4_A13210VxArtTEPml[0] ;
         n13210VxArtTEPml = T01HZ4_n13210VxArtTEPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13210VxArtTEPml), 4, 0));
         A13523VxArtTeElT = T01HZ4_A13523VxArtTeElT[0] ;
         n13523VxArtTeElT = T01HZ4_n13523VxArtTeElT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrimstr( A13523VxArtTeElT, 6, 2));
         A13522VxArtTeElL = T01HZ4_A13522VxArtTeElL[0] ;
         n13522VxArtTeElL = T01HZ4_n13522VxArtTeElL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrimstr( A13522VxArtTeElL, 6, 2));
         zm1HZ1656( -1) ;
      }
      pr_default.close(2);
      onLoadActions1HZ1656( ) ;
   }

   public void onLoadActions1HZ1656( )
   {
   }

   public void checkExtendedTable1HZ1656( )
   {
      nIsDirty_1656 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1HZ1656( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1HZ1656( )
   {
      /* Using cursor T01HZ5 */
      pr_default.execute(3, new Object[] {A11769VxArTECod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1656 = (short)(1) ;
      }
      else
      {
         RcdFound1656 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HZ3 */
      pr_default.execute(1, new Object[] {A11769VxArTECod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HZ1656( 1) ;
         RcdFound1656 = (short)(1) ;
         A11769VxArTECod = T01HZ3_A11769VxArTECod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
         A11768VxArTEMxcm = T01HZ3_A11768VxArTEMxcm[0] ;
         n11768VxArTEMxcm = T01HZ3_n11768VxArTEMxcm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrimstr( A11768VxArTEMxcm, 5, 2));
         A12298VxArTEBxcm = T01HZ3_A12298VxArTEBxcm[0] ;
         n12298VxArTEBxcm = T01HZ3_n12298VxArTEBxcm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrimstr( A12298VxArTEBxcm, 5, 2));
         A12297VxArtTETor = T01HZ3_A12297VxArtTETor[0] ;
         n12297VxArtTETor = T01HZ3_n12297VxArtTETor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrimstr( A12297VxArtTETor, 6, 2));
         A12299VxArTERdto = T01HZ3_A12299VxArTERdto[0] ;
         n12299VxArTERdto = T01HZ3_n12299VxArTERdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrimstr( A12299VxArTERdto, 5, 2));
         A13018VxArtTEAnc = T01HZ3_A13018VxArtTEAnc[0] ;
         n13018VxArtTEAnc = T01HZ3_n13018VxArtTEAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrimstr( A13018VxArtTEAnc, 6, 2));
         A13019VxArtTeGrm = T01HZ3_A13019VxArtTeGrm[0] ;
         n13019VxArtTeGrm = T01HZ3_n13019VxArtTeGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13019VxArtTeGrm), 3, 0));
         A13210VxArtTEPml = T01HZ3_A13210VxArtTEPml[0] ;
         n13210VxArtTEPml = T01HZ3_n13210VxArtTEPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13210VxArtTEPml), 4, 0));
         A13523VxArtTeElT = T01HZ3_A13523VxArtTeElT[0] ;
         n13523VxArtTeElT = T01HZ3_n13523VxArtTeElT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrimstr( A13523VxArtTeElT, 6, 2));
         A13522VxArtTeElL = T01HZ3_A13522VxArtTeElL[0] ;
         n13522VxArtTeElL = T01HZ3_n13522VxArtTeElL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrimstr( A13522VxArtTeElL, 6, 2));
         Z11769VxArTECod = A11769VxArTECod ;
         sMode1656 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HZ1656( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1656 = (short)(0) ;
            initializeNonKey1HZ1656( ) ;
         }
         Gx_mode = sMode1656 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1656 = (short)(0) ;
         initializeNonKey1HZ1656( ) ;
         sMode1656 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1656 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HZ1656( ) ;
      if ( RcdFound1656 == 0 )
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
      RcdFound1656 = (short)(0) ;
      /* Using cursor T01HZ6 */
      pr_default.execute(4, new Object[] {A11769VxArTECod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01HZ6_A11769VxArTECod[0], A11769VxArTECod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01HZ6_A11769VxArTECod[0], A11769VxArTECod) > 0 ) ) )
         {
            A11769VxArTECod = T01HZ6_A11769VxArTECod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
            RcdFound1656 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1656 = (short)(0) ;
      /* Using cursor T01HZ7 */
      pr_default.execute(5, new Object[] {A11769VxArTECod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01HZ7_A11769VxArTECod[0], A11769VxArTECod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01HZ7_A11769VxArTECod[0], A11769VxArTECod) < 0 ) ) )
         {
            A11769VxArTECod = T01HZ7_A11769VxArTECod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
            RcdFound1656 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HZ1656( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxArTECod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HZ1656( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1656 == 1 )
         {
            if ( GXutil.strcmp(A11769VxArTECod, Z11769VxArTECod) != 0 )
            {
               A11769VxArTECod = Z11769VxArTECod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXARTECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArTECod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxArTECod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1HZ1656( ) ;
               GX_FocusControl = edtVxArTECod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A11769VxArTECod, Z11769VxArTECod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxArTECod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HZ1656( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxArTECod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxArTECod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1HZ1656( ) ;
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
      if ( GXutil.strcmp(A11769VxArTECod, Z11769VxArTECod) != 0 )
      {
         A11769VxArTECod = Z11769VxArTECod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXARTECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArTECod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxArTECod_Internalname ;
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
      getKey1HZ1656( ) ;
      if ( RcdFound1656 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXARTECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArTECod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A11769VxArTECod, Z11769VxArTECod) != 0 )
         {
            A11769VxArTECod = Z11769VxArTECod ;
            httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXARTECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxArTECod_Internalname ;
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
         if ( GXutil.strcmp(A11769VxArTECod, Z11769VxArTECod) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXARTECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxArTECod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxardtte");
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HZ0( ) ;
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
      if ( RcdFound1656 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXARTECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxArTECod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HZ1656( ) ;
      if ( RcdFound1656 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HZ1656( ) ;
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
      if ( RcdFound1656 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
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
      if ( RcdFound1656 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
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
      scanStart1HZ1656( ) ;
      if ( RcdFound1656 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1656 != 0 )
         {
            scanNext1HZ1656( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HZ1656( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HZ1656( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HZ2 */
         pr_default.execute(0, new Object[] {A11769VxArTECod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXARTDATEJ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11768VxArTEMxcm, T01HZ2_A11768VxArTEMxcm[0]) != 0 ) || ( DecimalUtil.compareTo(Z12298VxArTEBxcm, T01HZ2_A12298VxArTEBxcm[0]) != 0 ) || ( DecimalUtil.compareTo(Z12297VxArtTETor, T01HZ2_A12297VxArtTETor[0]) != 0 ) || ( DecimalUtil.compareTo(Z12299VxArTERdto, T01HZ2_A12299VxArTERdto[0]) != 0 ) || ( DecimalUtil.compareTo(Z13018VxArtTEAnc, T01HZ2_A13018VxArtTEAnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13019VxArtTeGrm != T01HZ2_A13019VxArtTeGrm[0] ) || ( Z13210VxArtTEPml != T01HZ2_A13210VxArtTEPml[0] ) || ( DecimalUtil.compareTo(Z13523VxArtTeElT, T01HZ2_A13523VxArtTeElT[0]) != 0 ) || ( DecimalUtil.compareTo(Z13522VxArtTeElL, T01HZ2_A13522VxArtTeElL[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11768VxArTEMxcm, T01HZ2_A11768VxArTEMxcm[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArTEMxcm");
               GXutil.writeLogRaw("Old: ",Z11768VxArTEMxcm);
               GXutil.writeLogRaw("Current: ",T01HZ2_A11768VxArTEMxcm[0]);
            }
            if ( DecimalUtil.compareTo(Z12298VxArTEBxcm, T01HZ2_A12298VxArTEBxcm[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArTEBxcm");
               GXutil.writeLogRaw("Old: ",Z12298VxArTEBxcm);
               GXutil.writeLogRaw("Current: ",T01HZ2_A12298VxArTEBxcm[0]);
            }
            if ( DecimalUtil.compareTo(Z12297VxArtTETor, T01HZ2_A12297VxArtTETor[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTETor");
               GXutil.writeLogRaw("Old: ",Z12297VxArtTETor);
               GXutil.writeLogRaw("Current: ",T01HZ2_A12297VxArtTETor[0]);
            }
            if ( DecimalUtil.compareTo(Z12299VxArTERdto, T01HZ2_A12299VxArTERdto[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArTERdto");
               GXutil.writeLogRaw("Old: ",Z12299VxArTERdto);
               GXutil.writeLogRaw("Current: ",T01HZ2_A12299VxArTERdto[0]);
            }
            if ( DecimalUtil.compareTo(Z13018VxArtTEAnc, T01HZ2_A13018VxArtTEAnc[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTEAnc");
               GXutil.writeLogRaw("Old: ",Z13018VxArtTEAnc);
               GXutil.writeLogRaw("Current: ",T01HZ2_A13018VxArtTEAnc[0]);
            }
            if ( Z13019VxArtTeGrm != T01HZ2_A13019VxArtTeGrm[0] )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTeGrm");
               GXutil.writeLogRaw("Old: ",Z13019VxArtTeGrm);
               GXutil.writeLogRaw("Current: ",T01HZ2_A13019VxArtTeGrm[0]);
            }
            if ( Z13210VxArtTEPml != T01HZ2_A13210VxArtTEPml[0] )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTEPml");
               GXutil.writeLogRaw("Old: ",Z13210VxArtTEPml);
               GXutil.writeLogRaw("Current: ",T01HZ2_A13210VxArtTEPml[0]);
            }
            if ( DecimalUtil.compareTo(Z13523VxArtTeElT, T01HZ2_A13523VxArtTeElT[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTeElT");
               GXutil.writeLogRaw("Old: ",Z13523VxArtTeElT);
               GXutil.writeLogRaw("Current: ",T01HZ2_A13523VxArtTeElT[0]);
            }
            if ( DecimalUtil.compareTo(Z13522VxArtTeElL, T01HZ2_A13522VxArtTeElL[0]) != 0 )
            {
               GXutil.writeLogln("tvxardtte:[seudo value changed for attri]"+"VxArtTeElL");
               GXutil.writeLogRaw("Old: ",Z13522VxArtTeElL);
               GXutil.writeLogRaw("Current: ",T01HZ2_A13522VxArtTeElL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXARTDATEJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HZ1656( )
   {
      beforeValidate1HZ1656( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HZ1656( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HZ1656( 0) ;
         checkOptimisticConcurrency1HZ1656( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HZ1656( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HZ1656( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HZ8 */
                  pr_default.execute(6, new Object[] {A11769VxArTECod, Boolean.valueOf(n11768VxArTEMxcm), A11768VxArTEMxcm, Boolean.valueOf(n12298VxArTEBxcm), A12298VxArTEBxcm, Boolean.valueOf(n12297VxArtTETor), A12297VxArtTETor, Boolean.valueOf(n12299VxArTERdto), A12299VxArTERdto, Boolean.valueOf(n13018VxArtTEAnc), A13018VxArtTEAnc, Boolean.valueOf(n13019VxArtTeGrm), Short.valueOf(A13019VxArtTeGrm), Boolean.valueOf(n13210VxArtTEPml), Short.valueOf(A13210VxArtTEPml), Boolean.valueOf(n13523VxArtTeElT), A13523VxArtTeElT, Boolean.valueOf(n13522VxArtTeElL), A13522VxArtTeElL});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTDATEJ");
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
                        resetCaption1HZ0( ) ;
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
            load1HZ1656( ) ;
         }
         endLevel1HZ1656( ) ;
      }
      closeExtendedTableCursors1HZ1656( ) ;
   }

   public void update1HZ1656( )
   {
      beforeValidate1HZ1656( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HZ1656( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HZ1656( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HZ1656( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HZ1656( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HZ9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n11768VxArTEMxcm), A11768VxArTEMxcm, Boolean.valueOf(n12298VxArTEBxcm), A12298VxArTEBxcm, Boolean.valueOf(n12297VxArtTETor), A12297VxArtTETor, Boolean.valueOf(n12299VxArTERdto), A12299VxArTERdto, Boolean.valueOf(n13018VxArtTEAnc), A13018VxArtTEAnc, Boolean.valueOf(n13019VxArtTeGrm), Short.valueOf(A13019VxArtTeGrm), Boolean.valueOf(n13210VxArtTEPml), Short.valueOf(A13210VxArtTEPml), Boolean.valueOf(n13523VxArtTeElT), A13523VxArtTeElT, Boolean.valueOf(n13522VxArtTeElL), A13522VxArtTeElL, A11769VxArTECod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTDATEJ");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXARTDATEJ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HZ1656( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HZ0( ) ;
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
         endLevel1HZ1656( ) ;
      }
      closeExtendedTableCursors1HZ1656( ) ;
   }

   public void deferredUpdate1HZ1656( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HZ1656( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HZ1656( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HZ1656( ) ;
         afterConfirm1HZ1656( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HZ1656( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HZ10 */
               pr_default.execute(8, new Object[] {A11769VxArTECod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXARTDATEJ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1656 == 0 )
                     {
                        initAll1HZ1656( ) ;
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
                     resetCaption1HZ0( ) ;
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
      sMode1656 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HZ1656( ) ;
      Gx_mode = sMode1656 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HZ1656( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1HZ1656( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HZ1656( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxardtte");
         if ( AnyError == 0 )
         {
            confirmValues1HZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxardtte");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HZ1656( )
   {
      /* Using cursor T01HZ11 */
      pr_default.execute(9);
      RcdFound1656 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1656 = (short)(1) ;
         A11769VxArTECod = T01HZ11_A11769VxArTECod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HZ1656( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1656 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1656 = (short)(1) ;
         A11769VxArTECod = T01HZ11_A11769VxArTECod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
      }
   }

   public void scanEnd1HZ1656( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1HZ1656( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HZ1656( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HZ1656( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HZ1656( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HZ1656( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HZ1656( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HZ1656( )
   {
      edtVxArTECod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArTECod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArTECod_Enabled), 5, 0), true);
      edtVxArTEMxcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArTEMxcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArTEMxcm_Enabled), 5, 0), true);
      edtVxArTEBxcm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArTEBxcm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArTEBxcm_Enabled), 5, 0), true);
      edtVxArtTETor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTETor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTETor_Enabled), 5, 0), true);
      edtVxArTERdto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArTERdto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArTERdto_Enabled), 5, 0), true);
      edtVxArtTEAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTEAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTEAnc_Enabled), 5, 0), true);
      edtVxArtTeGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTeGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTeGrm_Enabled), 5, 0), true);
      edtVxArtTEPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTEPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTEPml_Enabled), 5, 0), true);
      edtVxArtTeElT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTeElT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTeElT_Enabled), 5, 0), true);
      edtVxArtTeElL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTeElL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTeElL_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HZ1656( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxardtte", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11769VxArTECod", GXutil.rtrim( Z11769VxArTECod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11768VxArTEMxcm", GXutil.ltrim( localUtil.ntoc( Z11768VxArTEMxcm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12298VxArTEBxcm", GXutil.ltrim( localUtil.ntoc( Z12298VxArTEBxcm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12297VxArtTETor", GXutil.ltrim( localUtil.ntoc( Z12297VxArtTETor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12299VxArTERdto", GXutil.ltrim( localUtil.ntoc( Z12299VxArTERdto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13018VxArtTEAnc", GXutil.ltrim( localUtil.ntoc( Z13018VxArtTEAnc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13019VxArtTeGrm", GXutil.ltrim( localUtil.ntoc( Z13019VxArtTeGrm, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13210VxArtTEPml", GXutil.ltrim( localUtil.ntoc( Z13210VxArtTEPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13523VxArtTeElT", GXutil.ltrim( localUtil.ntoc( Z13523VxArtTeElT, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13522VxArtTeElL", GXutil.ltrim( localUtil.ntoc( Z13522VxArtTeElL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxardtte", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxArDTTe" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Artìculos/Datos Técnicos en Tejeduría", "") ;
   }

   public void initializeNonKey1HZ1656( )
   {
      A11768VxArTEMxcm = DecimalUtil.ZERO ;
      n11768VxArTEMxcm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrimstr( A11768VxArTEMxcm, 5, 2));
      A12298VxArTEBxcm = DecimalUtil.ZERO ;
      n12298VxArTEBxcm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrimstr( A12298VxArTEBxcm, 5, 2));
      A12297VxArtTETor = DecimalUtil.ZERO ;
      n12297VxArtTETor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrimstr( A12297VxArtTETor, 6, 2));
      A12299VxArTERdto = DecimalUtil.ZERO ;
      n12299VxArTERdto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrimstr( A12299VxArTERdto, 5, 2));
      A13018VxArtTEAnc = DecimalUtil.ZERO ;
      n13018VxArtTEAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrimstr( A13018VxArtTEAnc, 6, 2));
      A13019VxArtTeGrm = (short)(0) ;
      n13019VxArtTeGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13019VxArtTeGrm), 3, 0));
      A13210VxArtTEPml = (short)(0) ;
      n13210VxArtTEPml = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13210VxArtTEPml), 4, 0));
      A13523VxArtTeElT = DecimalUtil.ZERO ;
      n13523VxArtTeElT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrimstr( A13523VxArtTeElT, 6, 2));
      A13522VxArtTeElL = DecimalUtil.ZERO ;
      n13522VxArtTeElL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrimstr( A13522VxArtTeElL, 6, 2));
      Z11768VxArTEMxcm = DecimalUtil.ZERO ;
      Z12298VxArTEBxcm = DecimalUtil.ZERO ;
      Z12297VxArtTETor = DecimalUtil.ZERO ;
      Z12299VxArTERdto = DecimalUtil.ZERO ;
      Z13018VxArtTEAnc = DecimalUtil.ZERO ;
      Z13019VxArtTeGrm = (short)(0) ;
      Z13210VxArtTEPml = (short)(0) ;
      Z13523VxArtTeElT = DecimalUtil.ZERO ;
      Z13522VxArtTeElL = DecimalUtil.ZERO ;
   }

   public void initAll1HZ1656( )
   {
      A11769VxArTECod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11769VxArTECod", A11769VxArTECod);
      initializeNonKey1HZ1656( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251944560", true, true);
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
      httpContext.AddJavascriptSource("tvxardtte.js", "?20261251944561", false, true);
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
      edtVxArTECod_Internalname = "VXARTECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxArTEMxcm_Internalname = "VXARTEMXCM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxArTEBxcm_Internalname = "VXARTEBXCM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxArtTETor_Internalname = "VXARTTETOR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxArTERdto_Internalname = "VXARTERDTO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxArtTEAnc_Internalname = "VXARTTEANC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxArtTeGrm_Internalname = "VXARTTEGRM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxArtTEPml_Internalname = "VXARTTEPML" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVxArtTeElT_Internalname = "VXARTTEELT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtVxArtTeElL_Internalname = "VXARTTEELL" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Artìculos/Datos Técnicos en Tejeduría", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxArtTeElL_Jsonclick = "" ;
      edtVxArtTeElL_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTeElL_Enabled = 1 ;
      edtVxArtTeElT_Jsonclick = "" ;
      edtVxArtTeElT_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTeElT_Enabled = 1 ;
      edtVxArtTEPml_Jsonclick = "" ;
      edtVxArtTEPml_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTEPml_Enabled = 1 ;
      edtVxArtTeGrm_Jsonclick = "" ;
      edtVxArtTeGrm_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTeGrm_Enabled = 1 ;
      edtVxArtTEAnc_Jsonclick = "" ;
      edtVxArtTEAnc_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTEAnc_Enabled = 1 ;
      edtVxArTERdto_Jsonclick = "" ;
      edtVxArTERdto_Backcolor = (int)(0xFFFFFF) ;
      edtVxArTERdto_Enabled = 1 ;
      edtVxArtTETor_Jsonclick = "" ;
      edtVxArtTETor_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTETor_Enabled = 1 ;
      edtVxArTEBxcm_Jsonclick = "" ;
      edtVxArTEBxcm_Backcolor = (int)(0xFFFFFF) ;
      edtVxArTEBxcm_Enabled = 1 ;
      edtVxArTEMxcm_Jsonclick = "" ;
      edtVxArTEMxcm_Backcolor = (int)(0xFFFFFF) ;
      edtVxArTEMxcm_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxArTECod_Jsonclick = "" ;
      edtVxArTECod_Backcolor = (int)(0xFFFFFF) ;
      edtVxArTECod_Enabled = 1 ;
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
      GX_FocusControl = edtVxArTEMxcm_Internalname ;
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

   public void valid_Vxartecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11768VxArTEMxcm", GXutil.ltrim( localUtil.ntoc( A11768VxArTEMxcm, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12298VxArTEBxcm", GXutil.ltrim( localUtil.ntoc( A12298VxArTEBxcm, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12297VxArtTETor", GXutil.ltrim( localUtil.ntoc( A12297VxArtTETor, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12299VxArTERdto", GXutil.ltrim( localUtil.ntoc( A12299VxArTERdto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13018VxArtTEAnc", GXutil.ltrim( localUtil.ntoc( A13018VxArtTEAnc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13019VxArtTeGrm", GXutil.ltrim( localUtil.ntoc( A13019VxArtTeGrm, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13210VxArtTEPml", GXutil.ltrim( localUtil.ntoc( A13210VxArtTEPml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13523VxArtTeElT", GXutil.ltrim( localUtil.ntoc( A13523VxArtTeElT, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13522VxArtTeElL", GXutil.ltrim( localUtil.ntoc( A13522VxArtTeElL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11769VxArTECod", GXutil.rtrim( Z11769VxArTECod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11768VxArTEMxcm", GXutil.ltrim( localUtil.ntoc( Z11768VxArTEMxcm, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12298VxArTEBxcm", GXutil.ltrim( localUtil.ntoc( Z12298VxArTEBxcm, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12297VxArtTETor", GXutil.ltrim( localUtil.ntoc( Z12297VxArtTETor, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12299VxArTERdto", GXutil.ltrim( localUtil.ntoc( Z12299VxArTERdto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13018VxArtTEAnc", GXutil.ltrim( localUtil.ntoc( Z13018VxArtTEAnc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13019VxArtTeGrm", GXutil.ltrim( localUtil.ntoc( Z13019VxArtTeGrm, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13210VxArtTEPml", GXutil.ltrim( localUtil.ntoc( Z13210VxArtTEPml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13523VxArtTeElT", GXutil.ltrim( localUtil.ntoc( Z13523VxArtTeElT, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13522VxArtTeElL", GXutil.ltrim( localUtil.ntoc( Z13522VxArtTeElL, (byte)(6), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_VXARTECOD","{handler:'valid_Vxartecod',iparms:[{av:'A11769VxArTECod',fld:'VXARTECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXARTECOD",",oparms:[{av:'A11768VxArTEMxcm',fld:'VXARTEMXCM',pic:'Z9.99'},{av:'A12298VxArTEBxcm',fld:'VXARTEBXCM',pic:'Z9.99'},{av:'A12297VxArtTETor',fld:'VXARTTETOR',pic:'ZZ9.99'},{av:'A12299VxArTERdto',fld:'VXARTERDTO',pic:'Z9.99'},{av:'A13018VxArtTEAnc',fld:'VXARTTEANC',pic:'ZZ9.99'},{av:'A13019VxArtTeGrm',fld:'VXARTTEGRM',pic:'ZZ9'},{av:'A13210VxArtTEPml',fld:'VXARTTEPML',pic:'ZZZ9'},{av:'A13523VxArtTeElT',fld:'VXARTTEELT',pic:'ZZ9.99'},{av:'A13522VxArtTeElL',fld:'VXARTTEELL',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z11769VxArTECod'},{av:'Z11768VxArTEMxcm'},{av:'Z12298VxArTEBxcm'},{av:'Z12297VxArtTETor'},{av:'Z12299VxArTERdto'},{av:'Z13018VxArtTEAnc'},{av:'Z13019VxArtTeGrm'},{av:'Z13210VxArtTEPml'},{av:'Z13523VxArtTeElT'},{av:'Z13522VxArtTeElL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z11769VxArTECod = "" ;
      Z11768VxArTEMxcm = DecimalUtil.ZERO ;
      Z12298VxArTEBxcm = DecimalUtil.ZERO ;
      Z12297VxArtTETor = DecimalUtil.ZERO ;
      Z12299VxArTERdto = DecimalUtil.ZERO ;
      Z13018VxArtTEAnc = DecimalUtil.ZERO ;
      Z13523VxArtTeElT = DecimalUtil.ZERO ;
      Z13522VxArtTeElL = DecimalUtil.ZERO ;
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
      A11769VxArTECod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A11768VxArTEMxcm = DecimalUtil.ZERO ;
      lblTextblock3_Jsonclick = "" ;
      A12298VxArTEBxcm = DecimalUtil.ZERO ;
      lblTextblock4_Jsonclick = "" ;
      A12297VxArtTETor = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A12299VxArTERdto = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A13018VxArtTEAnc = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A13523VxArtTeElT = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A13522VxArtTeElL = DecimalUtil.ZERO ;
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
      T01HZ4_A11769VxArTECod = new String[] {""} ;
      T01HZ4_A11768VxArTEMxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n11768VxArTEMxcm = new boolean[] {false} ;
      T01HZ4_A12298VxArTEBxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n12298VxArTEBxcm = new boolean[] {false} ;
      T01HZ4_A12297VxArtTETor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n12297VxArtTETor = new boolean[] {false} ;
      T01HZ4_A12299VxArTERdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n12299VxArTERdto = new boolean[] {false} ;
      T01HZ4_A13018VxArtTEAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n13018VxArtTEAnc = new boolean[] {false} ;
      T01HZ4_A13019VxArtTeGrm = new short[1] ;
      T01HZ4_n13019VxArtTeGrm = new boolean[] {false} ;
      T01HZ4_A13210VxArtTEPml = new short[1] ;
      T01HZ4_n13210VxArtTEPml = new boolean[] {false} ;
      T01HZ4_A13523VxArtTeElT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n13523VxArtTeElT = new boolean[] {false} ;
      T01HZ4_A13522VxArtTeElL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ4_n13522VxArtTeElL = new boolean[] {false} ;
      T01HZ5_A11769VxArTECod = new String[] {""} ;
      T01HZ3_A11769VxArTECod = new String[] {""} ;
      T01HZ3_A11768VxArTEMxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n11768VxArTEMxcm = new boolean[] {false} ;
      T01HZ3_A12298VxArTEBxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n12298VxArTEBxcm = new boolean[] {false} ;
      T01HZ3_A12297VxArtTETor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n12297VxArtTETor = new boolean[] {false} ;
      T01HZ3_A12299VxArTERdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n12299VxArTERdto = new boolean[] {false} ;
      T01HZ3_A13018VxArtTEAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n13018VxArtTEAnc = new boolean[] {false} ;
      T01HZ3_A13019VxArtTeGrm = new short[1] ;
      T01HZ3_n13019VxArtTeGrm = new boolean[] {false} ;
      T01HZ3_A13210VxArtTEPml = new short[1] ;
      T01HZ3_n13210VxArtTEPml = new boolean[] {false} ;
      T01HZ3_A13523VxArtTeElT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n13523VxArtTeElT = new boolean[] {false} ;
      T01HZ3_A13522VxArtTeElL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ3_n13522VxArtTeElL = new boolean[] {false} ;
      sMode1656 = "" ;
      T01HZ6_A11769VxArTECod = new String[] {""} ;
      T01HZ7_A11769VxArTECod = new String[] {""} ;
      T01HZ2_A11769VxArTECod = new String[] {""} ;
      T01HZ2_A11768VxArTEMxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n11768VxArTEMxcm = new boolean[] {false} ;
      T01HZ2_A12298VxArTEBxcm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n12298VxArTEBxcm = new boolean[] {false} ;
      T01HZ2_A12297VxArtTETor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n12297VxArtTETor = new boolean[] {false} ;
      T01HZ2_A12299VxArTERdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n12299VxArTERdto = new boolean[] {false} ;
      T01HZ2_A13018VxArtTEAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n13018VxArtTEAnc = new boolean[] {false} ;
      T01HZ2_A13019VxArtTeGrm = new short[1] ;
      T01HZ2_n13019VxArtTeGrm = new boolean[] {false} ;
      T01HZ2_A13210VxArtTEPml = new short[1] ;
      T01HZ2_n13210VxArtTEPml = new boolean[] {false} ;
      T01HZ2_A13523VxArtTeElT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n13523VxArtTeElT = new boolean[] {false} ;
      T01HZ2_A13522VxArtTeElL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HZ2_n13522VxArtTeElL = new boolean[] {false} ;
      T01HZ11_A11769VxArTECod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ11769VxArTECod = "" ;
      ZZ11768VxArTEMxcm = DecimalUtil.ZERO ;
      ZZ12298VxArTEBxcm = DecimalUtil.ZERO ;
      ZZ12297VxArtTETor = DecimalUtil.ZERO ;
      ZZ12299VxArTERdto = DecimalUtil.ZERO ;
      ZZ13018VxArtTEAnc = DecimalUtil.ZERO ;
      ZZ13523VxArtTeElT = DecimalUtil.ZERO ;
      ZZ13522VxArtTeElL = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxardtte__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxardtte__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxardtte__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxardtte__default(),
         new Object[] {
             new Object[] {
            T01HZ2_A11769VxArTECod, T01HZ2_A11768VxArTEMxcm, T01HZ2_n11768VxArTEMxcm, T01HZ2_A12298VxArTEBxcm, T01HZ2_n12298VxArTEBxcm, T01HZ2_A12297VxArtTETor, T01HZ2_n12297VxArtTETor, T01HZ2_A12299VxArTERdto, T01HZ2_n12299VxArTERdto, T01HZ2_A13018VxArtTEAnc,
            T01HZ2_n13018VxArtTEAnc, T01HZ2_A13019VxArtTeGrm, T01HZ2_n13019VxArtTeGrm, T01HZ2_A13210VxArtTEPml, T01HZ2_n13210VxArtTEPml, T01HZ2_A13523VxArtTeElT, T01HZ2_n13523VxArtTeElT, T01HZ2_A13522VxArtTeElL, T01HZ2_n13522VxArtTeElL
            }
            , new Object[] {
            T01HZ3_A11769VxArTECod, T01HZ3_A11768VxArTEMxcm, T01HZ3_n11768VxArTEMxcm, T01HZ3_A12298VxArTEBxcm, T01HZ3_n12298VxArTEBxcm, T01HZ3_A12297VxArtTETor, T01HZ3_n12297VxArtTETor, T01HZ3_A12299VxArTERdto, T01HZ3_n12299VxArTERdto, T01HZ3_A13018VxArtTEAnc,
            T01HZ3_n13018VxArtTEAnc, T01HZ3_A13019VxArtTeGrm, T01HZ3_n13019VxArtTeGrm, T01HZ3_A13210VxArtTEPml, T01HZ3_n13210VxArtTEPml, T01HZ3_A13523VxArtTeElT, T01HZ3_n13523VxArtTeElT, T01HZ3_A13522VxArtTeElL, T01HZ3_n13522VxArtTeElL
            }
            , new Object[] {
            T01HZ4_A11769VxArTECod, T01HZ4_A11768VxArTEMxcm, T01HZ4_n11768VxArTEMxcm, T01HZ4_A12298VxArTEBxcm, T01HZ4_n12298VxArTEBxcm, T01HZ4_A12297VxArtTETor, T01HZ4_n12297VxArtTETor, T01HZ4_A12299VxArTERdto, T01HZ4_n12299VxArTERdto, T01HZ4_A13018VxArtTEAnc,
            T01HZ4_n13018VxArtTEAnc, T01HZ4_A13019VxArtTeGrm, T01HZ4_n13019VxArtTeGrm, T01HZ4_A13210VxArtTEPml, T01HZ4_n13210VxArtTEPml, T01HZ4_A13523VxArtTeElT, T01HZ4_n13523VxArtTeElT, T01HZ4_A13522VxArtTeElL, T01HZ4_n13522VxArtTeElL
            }
            , new Object[] {
            T01HZ5_A11769VxArTECod
            }
            , new Object[] {
            T01HZ6_A11769VxArTECod
            }
            , new Object[] {
            T01HZ7_A11769VxArTECod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HZ11_A11769VxArTECod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13019VxArtTeGrm ;
   private short Z13210VxArtTEPml ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13019VxArtTeGrm ;
   private short A13210VxArtTEPml ;
   private short RcdFound1656 ;
   private short nIsDirty_1656 ;
   private short ZZ13019VxArtTeGrm ;
   private short ZZ13210VxArtTEPml ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxArTECod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxArTEMxcm_Enabled ;
   private int edtVxArTEBxcm_Enabled ;
   private int edtVxArtTETor_Enabled ;
   private int edtVxArTERdto_Enabled ;
   private int edtVxArtTEAnc_Enabled ;
   private int edtVxArtTeGrm_Enabled ;
   private int edtVxArtTEPml_Enabled ;
   private int edtVxArtTeElT_Enabled ;
   private int edtVxArtTeElL_Enabled ;
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
   private int edtVxArtTeElL_Backcolor ;
   private int edtVxArtTeElT_Backcolor ;
   private int edtVxArtTEPml_Backcolor ;
   private int edtVxArtTeGrm_Backcolor ;
   private int edtVxArtTEAnc_Backcolor ;
   private int edtVxArTERdto_Backcolor ;
   private int edtVxArtTETor_Backcolor ;
   private int edtVxArTEBxcm_Backcolor ;
   private int edtVxArTEMxcm_Backcolor ;
   private int edtVxArTECod_Backcolor ;
   private java.math.BigDecimal Z11768VxArTEMxcm ;
   private java.math.BigDecimal Z12298VxArTEBxcm ;
   private java.math.BigDecimal Z12297VxArtTETor ;
   private java.math.BigDecimal Z12299VxArTERdto ;
   private java.math.BigDecimal Z13018VxArtTEAnc ;
   private java.math.BigDecimal Z13523VxArtTeElT ;
   private java.math.BigDecimal Z13522VxArtTeElL ;
   private java.math.BigDecimal A11768VxArTEMxcm ;
   private java.math.BigDecimal A12298VxArTEBxcm ;
   private java.math.BigDecimal A12297VxArtTETor ;
   private java.math.BigDecimal A12299VxArTERdto ;
   private java.math.BigDecimal A13018VxArtTEAnc ;
   private java.math.BigDecimal A13523VxArtTeElT ;
   private java.math.BigDecimal A13522VxArtTeElL ;
   private java.math.BigDecimal ZZ11768VxArTEMxcm ;
   private java.math.BigDecimal ZZ12298VxArTEBxcm ;
   private java.math.BigDecimal ZZ12297VxArtTETor ;
   private java.math.BigDecimal ZZ12299VxArTERdto ;
   private java.math.BigDecimal ZZ13018VxArtTEAnc ;
   private java.math.BigDecimal ZZ13523VxArtTeElT ;
   private java.math.BigDecimal ZZ13522VxArtTeElL ;
   private String sPrefix ;
   private String Z11769VxArTECod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxArTECod_Internalname ;
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
   private String A11769VxArTECod ;
   private String edtVxArTECod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxArTEMxcm_Internalname ;
   private String edtVxArTEMxcm_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxArTEBxcm_Internalname ;
   private String edtVxArTEBxcm_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxArtTETor_Internalname ;
   private String edtVxArtTETor_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxArTERdto_Internalname ;
   private String edtVxArTERdto_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxArtTEAnc_Internalname ;
   private String edtVxArtTEAnc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxArtTeGrm_Internalname ;
   private String edtVxArtTeGrm_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxArtTEPml_Internalname ;
   private String edtVxArtTEPml_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVxArtTeElT_Internalname ;
   private String edtVxArtTeElT_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtVxArtTeElL_Internalname ;
   private String edtVxArtTeElL_Jsonclick ;
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
   private String sMode1656 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ11769VxArTECod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11768VxArTEMxcm ;
   private boolean n12298VxArTEBxcm ;
   private boolean n12297VxArtTETor ;
   private boolean n12299VxArTERdto ;
   private boolean n13018VxArtTEAnc ;
   private boolean n13019VxArtTeGrm ;
   private boolean n13210VxArtTEPml ;
   private boolean n13523VxArtTeElT ;
   private boolean n13522VxArtTeElL ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01HZ4_A11769VxArTECod ;
   private java.math.BigDecimal[] T01HZ4_A11768VxArTEMxcm ;
   private boolean[] T01HZ4_n11768VxArTEMxcm ;
   private java.math.BigDecimal[] T01HZ4_A12298VxArTEBxcm ;
   private boolean[] T01HZ4_n12298VxArTEBxcm ;
   private java.math.BigDecimal[] T01HZ4_A12297VxArtTETor ;
   private boolean[] T01HZ4_n12297VxArtTETor ;
   private java.math.BigDecimal[] T01HZ4_A12299VxArTERdto ;
   private boolean[] T01HZ4_n12299VxArTERdto ;
   private java.math.BigDecimal[] T01HZ4_A13018VxArtTEAnc ;
   private boolean[] T01HZ4_n13018VxArtTEAnc ;
   private short[] T01HZ4_A13019VxArtTeGrm ;
   private boolean[] T01HZ4_n13019VxArtTeGrm ;
   private short[] T01HZ4_A13210VxArtTEPml ;
   private boolean[] T01HZ4_n13210VxArtTEPml ;
   private java.math.BigDecimal[] T01HZ4_A13523VxArtTeElT ;
   private boolean[] T01HZ4_n13523VxArtTeElT ;
   private java.math.BigDecimal[] T01HZ4_A13522VxArtTeElL ;
   private boolean[] T01HZ4_n13522VxArtTeElL ;
   private String[] T01HZ5_A11769VxArTECod ;
   private String[] T01HZ3_A11769VxArTECod ;
   private java.math.BigDecimal[] T01HZ3_A11768VxArTEMxcm ;
   private boolean[] T01HZ3_n11768VxArTEMxcm ;
   private java.math.BigDecimal[] T01HZ3_A12298VxArTEBxcm ;
   private boolean[] T01HZ3_n12298VxArTEBxcm ;
   private java.math.BigDecimal[] T01HZ3_A12297VxArtTETor ;
   private boolean[] T01HZ3_n12297VxArtTETor ;
   private java.math.BigDecimal[] T01HZ3_A12299VxArTERdto ;
   private boolean[] T01HZ3_n12299VxArTERdto ;
   private java.math.BigDecimal[] T01HZ3_A13018VxArtTEAnc ;
   private boolean[] T01HZ3_n13018VxArtTEAnc ;
   private short[] T01HZ3_A13019VxArtTeGrm ;
   private boolean[] T01HZ3_n13019VxArtTeGrm ;
   private short[] T01HZ3_A13210VxArtTEPml ;
   private boolean[] T01HZ3_n13210VxArtTEPml ;
   private java.math.BigDecimal[] T01HZ3_A13523VxArtTeElT ;
   private boolean[] T01HZ3_n13523VxArtTeElT ;
   private java.math.BigDecimal[] T01HZ3_A13522VxArtTeElL ;
   private boolean[] T01HZ3_n13522VxArtTeElL ;
   private String[] T01HZ6_A11769VxArTECod ;
   private String[] T01HZ7_A11769VxArTECod ;
   private String[] T01HZ2_A11769VxArTECod ;
   private java.math.BigDecimal[] T01HZ2_A11768VxArTEMxcm ;
   private boolean[] T01HZ2_n11768VxArTEMxcm ;
   private java.math.BigDecimal[] T01HZ2_A12298VxArTEBxcm ;
   private boolean[] T01HZ2_n12298VxArTEBxcm ;
   private java.math.BigDecimal[] T01HZ2_A12297VxArtTETor ;
   private boolean[] T01HZ2_n12297VxArtTETor ;
   private java.math.BigDecimal[] T01HZ2_A12299VxArTERdto ;
   private boolean[] T01HZ2_n12299VxArTERdto ;
   private java.math.BigDecimal[] T01HZ2_A13018VxArtTEAnc ;
   private boolean[] T01HZ2_n13018VxArtTEAnc ;
   private short[] T01HZ2_A13019VxArtTeGrm ;
   private boolean[] T01HZ2_n13019VxArtTeGrm ;
   private short[] T01HZ2_A13210VxArtTEPml ;
   private boolean[] T01HZ2_n13210VxArtTEPml ;
   private java.math.BigDecimal[] T01HZ2_A13523VxArtTeElT ;
   private boolean[] T01HZ2_n13523VxArtTeElT ;
   private java.math.BigDecimal[] T01HZ2_A13522VxArtTeElL ;
   private boolean[] T01HZ2_n13522VxArtTeElL ;
   private String[] T01HZ11_A11769VxArTECod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxardtte__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxardtte__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxardtte__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxardtte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HZ2", "SELECT ArtTeCod, ArftTeMalxc, ArtTeBarxc, ArtTeTors, ArtTeRdto, ArtTeAnc, ArtTeGrm2, ArtTePml, ArtTeElonT, ArtTeElonL FROM VTXARTDATEJ WHERE ArtTeCod = ?  FOR UPDATE OF ArftTeMalxc, ArtTeBarxc, ArtTeTors, ArtTeRdto, ArtTeAnc, ArtTeGrm2, ArtTePml, ArtTeElonT, ArtTeElonL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HZ3", "SELECT ArtTeCod, ArftTeMalxc, ArtTeBarxc, ArtTeTors, ArtTeRdto, ArtTeAnc, ArtTeGrm2, ArtTePml, ArtTeElonT, ArtTeElonL FROM VTXARTDATEJ WHERE ArtTeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HZ4", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtTeCod, TM1.ArftTeMalxc, TM1.ArtTeBarxc, TM1.ArtTeTors, TM1.ArtTeRdto, TM1.ArtTeAnc, TM1.ArtTeGrm2, TM1.ArtTePml, TM1.ArtTeElonT, TM1.ArtTeElonL FROM VTXARTDATEJ TM1 WHERE TM1.ArtTeCod = ? ORDER BY TM1.ArtTeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HZ5", "SELECT /*+ FIRST_ROWS(1) */ ArtTeCod FROM VTXARTDATEJ WHERE ArtTeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HZ6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtTeCod FROM VTXARTDATEJ WHERE ( ArtTeCod > ?) ORDER BY ArtTeCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HZ7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ ArtTeCod FROM VTXARTDATEJ WHERE ( ArtTeCod < ?) ORDER BY ArtTeCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HZ8", "INSERT INTO VTXARTDATEJ(ArtTeCod, ArftTeMalxc, ArtTeBarxc, ArtTeTors, ArtTeRdto, ArtTeAnc, ArtTeGrm2, ArtTePml, ArtTeElonT, ArtTeElonL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXARTDATEJ")
         ,new UpdateCursor("T01HZ9", "UPDATE VTXARTDATEJ SET ArftTeMalxc=?, ArtTeBarxc=?, ArtTeTors=?, ArtTeRdto=?, ArtTeAnc=?, ArtTeGrm2=?, ArtTePml=?, ArtTeElonT=?, ArtTeElonL=?  WHERE ArtTeCod = ?", GX_NOMASK, "VTXARTDATEJ")
         ,new UpdateCursor("T01HZ10", "DELETE FROM VTXARTDATEJ  WHERE ArtTeCod = ?", GX_NOMASK, "VTXARTDATEJ")
         ,new ForEachCursor("T01HZ11", "SELECT /*+ FIRST_ROWS(100) */ ArtTeCod FROM VTXARTDATEJ ORDER BY ArtTeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               return;
            case 7 :
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               stmt.setString(10, (String)parms[18], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 16);
               return;
      }
   }

}

