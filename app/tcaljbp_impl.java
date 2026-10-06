package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcaljbp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3985CalBarCod = (int)(GXutil.lval( httpContext.GetPar( "CalBarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         A3986CalBarCodR = (byte)(GXutil.lval( httpContext.GetPar( "CalBarCodR"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         A3987CalBarCodP = httpContext.GetPar( "CalBarCodP") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A3985CalBarCod, A3986CalBarCodR, A3987CalBarCodP) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Calidad HDR (JBP)", ""), (short)(0)) ;
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

   public tcaljbp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcaljbp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcaljbp_impl.class ));
   }

   public tcaljbp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCALJBP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código de HDR", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3985CalBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3985CalBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3985CalBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtCalBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Código de Reoperado", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalBarCodR_Internalname, GXutil.ltrim( localUtil.ntoc( A3986CalBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalBarCodR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3986CalBarCodR), "9") : localUtil.format( DecimalUtil.doubleToDec(A3986CalBarCodR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalBarCodR_Jsonclick, 0, "", "", "", "", "", 1, edtCalBarCodR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Código de Partición", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalBarCodP_Internalname, GXutil.rtrim( A3987CalBarCodP), GXutil.rtrim( localUtil.format( A3987CalBarCodP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalBarCodP_Jsonclick, 0, "", "", "", "", "", 1, edtCalBarCodP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Porcentaje de Urdido", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalPorUrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3988CalPorUrd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalPorUrd_Enabled!=0) ? localUtil.format( A3988CalPorUrd, "ZZ9.99") : localUtil.format( A3988CalPorUrd, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalPorUrd_Jsonclick, 0, "", "", "", "", "", 1, edtCalPorUrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Porcentaje de Trama", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalProTra_Internalname, GXutil.ltrim( localUtil.ntoc( A3989CalProTra, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalProTra_Enabled!=0) ? localUtil.format( A3989CalProTra, "ZZ9.99") : localUtil.format( A3989CalProTra, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalProTra_Jsonclick, 0, "", "", "", "", "", 1, edtCalProTra_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Rodado", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalRodado_Internalname, GXutil.ltrim( localUtil.ntoc( A3990CalRodado, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalRodado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3990CalRodado), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3990CalRodado), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalRodado_Jsonclick, 0, "", "", "", "", "", 1, edtCalRodado_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Columna de Agua", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalColAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A3991CalColAgua, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCalColAgua_Enabled!=0) ? localUtil.format( A3991CalColAgua, "ZZ9.99") : localUtil.format( A3991CalColAgua, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalColAgua_Jsonclick, 0, "", "", "", "", "", 1, edtCalColAgua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Tono", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALJBP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCalTono_Internalname, GXutil.rtrim( A3992CalTono), GXutil.rtrim( localUtil.format( A3992CalTono, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCalTono_Jsonclick, 0, "", "", "", "", "", 1, edtCalTono_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALJBP.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALJBP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCALJBP.htm");
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
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z3985CalBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3985CalBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3986CalBarCodR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3986CalBarCodR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3987CalBarCodP = httpContext.cgiGet( "Z3987CalBarCodP") ;
         Z3988CalPorUrd = localUtil.ctond( httpContext.cgiGet( "Z3988CalPorUrd")) ;
         Z3989CalProTra = localUtil.ctond( httpContext.cgiGet( "Z3989CalProTra")) ;
         Z3990CalRodado = (short)(localUtil.ctol( httpContext.cgiGet( "Z3990CalRodado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3991CalColAgua = localUtil.ctond( httpContext.cgiGet( "Z3991CalColAgua")) ;
         Z3992CalTono = httpContext.cgiGet( "Z3992CalTono") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCalBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCalBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALBARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3985CalBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         }
         else
         {
            A3985CalBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCalBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCalBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCalBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALBARCODR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalBarCodR_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3986CalBarCodR = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         }
         else
         {
            A3986CalBarCodR = (byte)(localUtil.ctol( httpContext.cgiGet( edtCalBarCodR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         }
         A3987CalBarCodP = httpContext.cgiGet( edtCalBarCodP_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCalPorUrd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCalPorUrd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPORURD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalPorUrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3988CalPorUrd = DecimalUtil.ZERO ;
            n3988CalPorUrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrimstr( A3988CalPorUrd, 6, 2));
         }
         else
         {
            A3988CalPorUrd = localUtil.ctond( httpContext.cgiGet( edtCalPorUrd_Internalname)) ;
            n3988CalPorUrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrimstr( A3988CalPorUrd, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCalProTra_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCalProTra_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPROTRA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalProTra_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3989CalProTra = DecimalUtil.ZERO ;
            n3989CalProTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrimstr( A3989CalProTra, 6, 2));
         }
         else
         {
            A3989CalProTra = localUtil.ctond( httpContext.cgiGet( edtCalProTra_Internalname)) ;
            n3989CalProTra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrimstr( A3989CalProTra, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCalRodado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCalRodado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALRODADO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalRodado_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3990CalRodado = (short)(0) ;
            n3990CalRodado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3990CalRodado), 4, 0));
         }
         else
         {
            A3990CalRodado = (short)(localUtil.ctol( httpContext.cgiGet( edtCalRodado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3990CalRodado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3990CalRodado), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCalColAgua_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCalColAgua_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALCOLAGUA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCalColAgua_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3991CalColAgua = DecimalUtil.ZERO ;
            n3991CalColAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrimstr( A3991CalColAgua, 6, 2));
         }
         else
         {
            A3991CalColAgua = localUtil.ctond( httpContext.cgiGet( edtCalColAgua_Internalname)) ;
            n3991CalColAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrimstr( A3991CalColAgua, 6, 2));
         }
         A3992CalTono = httpContext.cgiGet( edtCalTono_Internalname) ;
         n3992CalTono = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3992CalTono", A3992CalTono);
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
            A3985CalBarCod = (int)(GXutil.lval( httpContext.GetPar( "CalBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
            A3986CalBarCodR = (byte)(GXutil.lval( httpContext.GetPar( "CalBarCodR"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
            A3987CalBarCodP = httpContext.GetPar( "CalBarCodP") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
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
            initAll1GI1610( ) ;
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
      disableAttributes1GI1610( ) ;
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

   public void confirm_1GI0( )
   {
      beforeValidate1GI1610( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GI1610( ) ;
         }
         else
         {
            checkExtendedTable1GI1610( ) ;
            if ( AnyError == 0 )
            {
               zm1GI1610( 2) ;
               zm1GI1610( 3) ;
            }
            closeExtendedTableCursors1GI1610( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GI0( ) ;
      }
   }

   public void resetCaption1GI0( )
   {
   }

   public void zm1GI1610( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3988CalPorUrd = T01GI3_A3988CalPorUrd[0] ;
            Z3989CalProTra = T01GI3_A3989CalProTra[0] ;
            Z3990CalRodado = T01GI3_A3990CalRodado[0] ;
            Z3991CalColAgua = T01GI3_A3991CalColAgua[0] ;
            Z3992CalTono = T01GI3_A3992CalTono[0] ;
         }
         else
         {
            Z3988CalPorUrd = A3988CalPorUrd ;
            Z3989CalProTra = A3989CalProTra ;
            Z3990CalRodado = A3990CalRodado ;
            Z3991CalColAgua = A3991CalColAgua ;
            Z3992CalTono = A3992CalTono ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z3988CalPorUrd = A3988CalPorUrd ;
         Z3989CalProTra = A3989CalProTra ;
         Z3990CalRodado = A3990CalRodado ;
         Z3991CalColAgua = A3991CalColAgua ;
         Z3992CalTono = A3992CalTono ;
         Z396EmprCod = A396EmprCod ;
         Z3985CalBarCod = A3985CalBarCod ;
         Z3986CalBarCodR = A3986CalBarCodR ;
         Z3987CalBarCodP = A3987CalBarCodP ;
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

   public void load1GI1610( )
   {
      /* Using cursor T01GI6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1610 = (short)(1) ;
         A407EmprNom = T01GI6_A407EmprNom[0] ;
         n407EmprNom = T01GI6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3988CalPorUrd = T01GI6_A3988CalPorUrd[0] ;
         n3988CalPorUrd = T01GI6_n3988CalPorUrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrimstr( A3988CalPorUrd, 6, 2));
         A3989CalProTra = T01GI6_A3989CalProTra[0] ;
         n3989CalProTra = T01GI6_n3989CalProTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrimstr( A3989CalProTra, 6, 2));
         A3990CalRodado = T01GI6_A3990CalRodado[0] ;
         n3990CalRodado = T01GI6_n3990CalRodado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3990CalRodado), 4, 0));
         A3991CalColAgua = T01GI6_A3991CalColAgua[0] ;
         n3991CalColAgua = T01GI6_n3991CalColAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrimstr( A3991CalColAgua, 6, 2));
         A3992CalTono = T01GI6_A3992CalTono[0] ;
         n3992CalTono = T01GI6_n3992CalTono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3992CalTono", A3992CalTono);
         zm1GI1610( -1) ;
      }
      pr_default.close(4);
      onLoadActions1GI1610( ) ;
   }

   public void onLoadActions1GI1610( )
   {
   }

   public void checkExtendedTable1GI1610( )
   {
      nIsDirty_1610 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GI4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GI4_A407EmprNom[0] ;
      n407EmprNom = T01GI4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01GI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidad JBP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CALBARCODP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1GI1610( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01GI7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GI7_A407EmprNom[0] ;
      n407EmprNom = T01GI7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( String A396EmprCod ,
                         int A3985CalBarCod ,
                         byte A3986CalBarCodR ,
                         String A3987CalBarCodP )
   {
      /* Using cursor T01GI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidad JBP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CALBARCODP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1GI1610( )
   {
      /* Using cursor T01GI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1610 = (short)(1) ;
      }
      else
      {
         RcdFound1610 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GI1610( 1) ;
         RcdFound1610 = (short)(1) ;
         A3988CalPorUrd = T01GI3_A3988CalPorUrd[0] ;
         n3988CalPorUrd = T01GI3_n3988CalPorUrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrimstr( A3988CalPorUrd, 6, 2));
         A3989CalProTra = T01GI3_A3989CalProTra[0] ;
         n3989CalProTra = T01GI3_n3989CalProTra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrimstr( A3989CalProTra, 6, 2));
         A3990CalRodado = T01GI3_A3990CalRodado[0] ;
         n3990CalRodado = T01GI3_n3990CalRodado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3990CalRodado), 4, 0));
         A3991CalColAgua = T01GI3_A3991CalColAgua[0] ;
         n3991CalColAgua = T01GI3_n3991CalColAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrimstr( A3991CalColAgua, 6, 2));
         A3992CalTono = T01GI3_A3992CalTono[0] ;
         n3992CalTono = T01GI3_n3992CalTono[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3992CalTono", A3992CalTono);
         A396EmprCod = T01GI3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3985CalBarCod = T01GI3_A3985CalBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         A3986CalBarCodR = T01GI3_A3986CalBarCodR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         A3987CalBarCodP = T01GI3_A3987CalBarCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
         Z396EmprCod = A396EmprCod ;
         Z3985CalBarCod = A3985CalBarCod ;
         Z3986CalBarCodR = A3986CalBarCodR ;
         Z3987CalBarCodP = A3987CalBarCodP ;
         sMode1610 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GI1610( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1610 = (short)(0) ;
            initializeNonKey1GI1610( ) ;
         }
         Gx_mode = sMode1610 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1610 = (short)(0) ;
         initializeNonKey1GI1610( ) ;
         sMode1610 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1610 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GI1610( ) ;
      if ( RcdFound1610 == 0 )
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
      RcdFound1610 = (short)(0) ;
      /* Using cursor T01GI10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A3985CalBarCod), Integer.valueOf(A3985CalBarCod), A396EmprCod, Byte.valueOf(A3986CalBarCodR), Byte.valueOf(A3986CalBarCodR), Integer.valueOf(A3985CalBarCod), A396EmprCod, A3987CalBarCodP});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI10_A3985CalBarCod[0] < A3985CalBarCod ) || ( T01GI10_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI10_A3986CalBarCodR[0] < A3986CalBarCodR ) || ( T01GI10_A3986CalBarCodR[0] == A3986CalBarCodR ) && ( T01GI10_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GI10_A3987CalBarCodP[0], A3987CalBarCodP) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI10_A3985CalBarCod[0] > A3985CalBarCod ) || ( T01GI10_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI10_A3986CalBarCodR[0] > A3986CalBarCodR ) || ( T01GI10_A3986CalBarCodR[0] == A3986CalBarCodR ) && ( T01GI10_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GI10_A3987CalBarCodP[0], A3987CalBarCodP) > 0 ) ) )
         {
            A396EmprCod = T01GI10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3985CalBarCod = T01GI10_A3985CalBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
            A3986CalBarCodR = T01GI10_A3986CalBarCodR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
            A3987CalBarCodP = T01GI10_A3987CalBarCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
            RcdFound1610 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1610 = (short)(0) ;
      /* Using cursor T01GI11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A3985CalBarCod), Integer.valueOf(A3985CalBarCod), A396EmprCod, Byte.valueOf(A3986CalBarCodR), Byte.valueOf(A3986CalBarCodR), Integer.valueOf(A3985CalBarCod), A396EmprCod, A3987CalBarCodP});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI11_A3985CalBarCod[0] > A3985CalBarCod ) || ( T01GI11_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI11_A3986CalBarCodR[0] > A3986CalBarCodR ) || ( T01GI11_A3986CalBarCodR[0] == A3986CalBarCodR ) && ( T01GI11_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GI11_A3987CalBarCodP[0], A3987CalBarCodP) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI11_A3985CalBarCod[0] < A3985CalBarCod ) || ( T01GI11_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GI11_A3986CalBarCodR[0] < A3986CalBarCodR ) || ( T01GI11_A3986CalBarCodR[0] == A3986CalBarCodR ) && ( T01GI11_A3985CalBarCod[0] == A3985CalBarCod ) && ( GXutil.strcmp(T01GI11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GI11_A3987CalBarCodP[0], A3987CalBarCodP) < 0 ) ) )
         {
            A396EmprCod = T01GI11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3985CalBarCod = T01GI11_A3985CalBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
            A3986CalBarCodR = T01GI11_A3986CalBarCodR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
            A3987CalBarCodP = T01GI11_A3987CalBarCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
            RcdFound1610 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GI1610( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GI1610( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1610 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3985CalBarCod != Z3985CalBarCod ) || ( A3986CalBarCodR != Z3986CalBarCodR ) || ( GXutil.strcmp(A3987CalBarCodP, Z3987CalBarCodP) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A3985CalBarCod = Z3985CalBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
               A3986CalBarCodR = Z3986CalBarCodR ;
               httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
               A3987CalBarCodP = Z3987CalBarCodP ;
               httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
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
               update1GI1610( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3985CalBarCod != Z3985CalBarCod ) || ( A3986CalBarCodR != Z3986CalBarCodR ) || ( GXutil.strcmp(A3987CalBarCodP, Z3987CalBarCodP) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GI1610( ) ;
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
                  insert1GI1610( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3985CalBarCod != Z3985CalBarCod ) || ( A3986CalBarCodR != Z3986CalBarCodR ) || ( GXutil.strcmp(A3987CalBarCodP, Z3987CalBarCodP) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3985CalBarCod = Z3985CalBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         A3986CalBarCodR = Z3986CalBarCodR ;
         httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         A3987CalBarCodP = Z3987CalBarCodP ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
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
      getKey1GI1610( ) ;
      if ( RcdFound1610 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3985CalBarCod != Z3985CalBarCod ) || ( A3986CalBarCodR != Z3986CalBarCodR ) || ( GXutil.strcmp(A3987CalBarCodP, Z3987CalBarCodP) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3985CalBarCod = Z3985CalBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
            A3986CalBarCodR = Z3986CalBarCodR ;
            httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
            A3987CalBarCodP = Z3987CalBarCodP ;
            httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3985CalBarCod != Z3985CalBarCod ) || ( A3986CalBarCodR != Z3986CalBarCodR ) || ( GXutil.strcmp(A3987CalBarCodP, Z3987CalBarCodP) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcaljbp");
      GX_FocusControl = edtCalPorUrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GI0( ) ;
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
      if ( RcdFound1610 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCalPorUrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GI1610( ) ;
      if ( RcdFound1610 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCalPorUrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GI1610( ) ;
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
      if ( RcdFound1610 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCalPorUrd_Internalname ;
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
      if ( RcdFound1610 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCalPorUrd_Internalname ;
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
      scanStart1GI1610( ) ;
      if ( RcdFound1610 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1610 != 0 )
         {
            scanNext1GI1610( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCalPorUrd_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GI1610( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GI1610( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALJBP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3988CalPorUrd, T01GI2_A3988CalPorUrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z3989CalProTra, T01GI2_A3989CalProTra[0]) != 0 ) || ( Z3990CalRodado != T01GI2_A3990CalRodado[0] ) || ( DecimalUtil.compareTo(Z3991CalColAgua, T01GI2_A3991CalColAgua[0]) != 0 ) || ( GXutil.strcmp(Z3992CalTono, T01GI2_A3992CalTono[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3988CalPorUrd, T01GI2_A3988CalPorUrd[0]) != 0 )
            {
               GXutil.writeLogln("tcaljbp:[seudo value changed for attri]"+"CalPorUrd");
               GXutil.writeLogRaw("Old: ",Z3988CalPorUrd);
               GXutil.writeLogRaw("Current: ",T01GI2_A3988CalPorUrd[0]);
            }
            if ( DecimalUtil.compareTo(Z3989CalProTra, T01GI2_A3989CalProTra[0]) != 0 )
            {
               GXutil.writeLogln("tcaljbp:[seudo value changed for attri]"+"CalProTra");
               GXutil.writeLogRaw("Old: ",Z3989CalProTra);
               GXutil.writeLogRaw("Current: ",T01GI2_A3989CalProTra[0]);
            }
            if ( Z3990CalRodado != T01GI2_A3990CalRodado[0] )
            {
               GXutil.writeLogln("tcaljbp:[seudo value changed for attri]"+"CalRodado");
               GXutil.writeLogRaw("Old: ",Z3990CalRodado);
               GXutil.writeLogRaw("Current: ",T01GI2_A3990CalRodado[0]);
            }
            if ( DecimalUtil.compareTo(Z3991CalColAgua, T01GI2_A3991CalColAgua[0]) != 0 )
            {
               GXutil.writeLogln("tcaljbp:[seudo value changed for attri]"+"CalColAgua");
               GXutil.writeLogRaw("Old: ",Z3991CalColAgua);
               GXutil.writeLogRaw("Current: ",T01GI2_A3991CalColAgua[0]);
            }
            if ( GXutil.strcmp(Z3992CalTono, T01GI2_A3992CalTono[0]) != 0 )
            {
               GXutil.writeLogln("tcaljbp:[seudo value changed for attri]"+"CalTono");
               GXutil.writeLogRaw("Old: ",Z3992CalTono);
               GXutil.writeLogRaw("Current: ",T01GI2_A3992CalTono[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALJBP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GI1610( )
   {
      beforeValidate1GI1610( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GI1610( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GI1610( 0) ;
         checkOptimisticConcurrency1GI1610( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GI1610( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GI1610( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GI12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n3988CalPorUrd), A3988CalPorUrd, Boolean.valueOf(n3989CalProTra), A3989CalProTra, Boolean.valueOf(n3990CalRodado), Short.valueOf(A3990CalRodado), Boolean.valueOf(n3991CalColAgua), A3991CalColAgua, Boolean.valueOf(n3992CalTono), A3992CalTono, A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALJBP");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption1GI0( ) ;
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
            load1GI1610( ) ;
         }
         endLevel1GI1610( ) ;
      }
      closeExtendedTableCursors1GI1610( ) ;
   }

   public void update1GI1610( )
   {
      beforeValidate1GI1610( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GI1610( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GI1610( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GI1610( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GI1610( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GI13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n3988CalPorUrd), A3988CalPorUrd, Boolean.valueOf(n3989CalProTra), A3989CalProTra, Boolean.valueOf(n3990CalRodado), Short.valueOf(A3990CalRodado), Boolean.valueOf(n3991CalColAgua), A3991CalColAgua, Boolean.valueOf(n3992CalTono), A3992CalTono, A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALJBP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALJBP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GI1610( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GI0( ) ;
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
         endLevel1GI1610( ) ;
      }
      closeExtendedTableCursors1GI1610( ) ;
   }

   public void deferredUpdate1GI1610( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GI1610( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GI1610( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GI1610( ) ;
         afterConfirm1GI1610( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GI1610( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GI14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALJBP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1610 == 0 )
                     {
                        initAll1GI1610( ) ;
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
                     resetCaption1GI0( ) ;
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
      sMode1610 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GI1610( ) ;
      Gx_mode = sMode1610 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GI1610( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GI15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01GI15_A407EmprNom[0] ;
         n407EmprNom = T01GI15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
   }

   public void endLevel1GI1610( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GI1610( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcaljbp");
         if ( AnyError == 0 )
         {
            confirmValues1GI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcaljbp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GI1610( )
   {
      /* Using cursor T01GI16 */
      pr_default.execute(14);
      RcdFound1610 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1610 = (short)(1) ;
         A396EmprCod = T01GI16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3985CalBarCod = T01GI16_A3985CalBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         A3986CalBarCodR = T01GI16_A3986CalBarCodR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         A3987CalBarCodP = T01GI16_A3987CalBarCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GI1610( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1610 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1610 = (short)(1) ;
         A396EmprCod = T01GI16_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3985CalBarCod = T01GI16_A3985CalBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
         A3986CalBarCodR = T01GI16_A3986CalBarCodR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
         A3987CalBarCodP = T01GI16_A3987CalBarCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
      }
   }

   public void scanEnd1GI1610( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1GI1610( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GI1610( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GI1610( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GI1610( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GI1610( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GI1610( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GI1610( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCalBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalBarCod_Enabled), 5, 0), true);
      edtCalBarCodR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalBarCodR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalBarCodR_Enabled), 5, 0), true);
      edtCalBarCodP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalBarCodP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalBarCodP_Enabled), 5, 0), true);
      edtCalPorUrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalPorUrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalPorUrd_Enabled), 5, 0), true);
      edtCalProTra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalProTra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalProTra_Enabled), 5, 0), true);
      edtCalRodado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalRodado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalRodado_Enabled), 5, 0), true);
      edtCalColAgua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalColAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalColAgua_Enabled), 5, 0), true);
      edtCalTono_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCalTono_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCalTono_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GI1610( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GI0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcaljbp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3985CalBarCod", GXutil.ltrim( localUtil.ntoc( Z3985CalBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3986CalBarCodR", GXutil.ltrim( localUtil.ntoc( Z3986CalBarCodR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3987CalBarCodP", GXutil.rtrim( Z3987CalBarCodP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3988CalPorUrd", GXutil.ltrim( localUtil.ntoc( Z3988CalPorUrd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3989CalProTra", GXutil.ltrim( localUtil.ntoc( Z3989CalProTra, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3990CalRodado", GXutil.ltrim( localUtil.ntoc( Z3990CalRodado, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3991CalColAgua", GXutil.ltrim( localUtil.ntoc( Z3991CalColAgua, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3992CalTono", GXutil.rtrim( Z3992CalTono));
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
      return formatLink("app.tcaljbp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCALJBP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Calidad HDR (JBP)", "") ;
   }

   public void initializeNonKey1GI1610( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3988CalPorUrd = DecimalUtil.ZERO ;
      n3988CalPorUrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrimstr( A3988CalPorUrd, 6, 2));
      A3989CalProTra = DecimalUtil.ZERO ;
      n3989CalProTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrimstr( A3989CalProTra, 6, 2));
      A3990CalRodado = (short)(0) ;
      n3990CalRodado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3990CalRodado), 4, 0));
      A3991CalColAgua = DecimalUtil.ZERO ;
      n3991CalColAgua = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrimstr( A3991CalColAgua, 6, 2));
      A3992CalTono = "" ;
      n3992CalTono = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3992CalTono", A3992CalTono);
      Z3988CalPorUrd = DecimalUtil.ZERO ;
      Z3989CalProTra = DecimalUtil.ZERO ;
      Z3990CalRodado = (short)(0) ;
      Z3991CalColAgua = DecimalUtil.ZERO ;
      Z3992CalTono = "" ;
   }

   public void initAll1GI1610( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3985CalBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3985CalBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3985CalBarCod), 8, 0));
      A3986CalBarCodR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3986CalBarCodR", GXutil.str( A3986CalBarCodR, 1, 0));
      A3987CalBarCodP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3987CalBarCodP", A3987CalBarCodP);
      initializeNonKey1GI1610( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241574569", true, true);
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
      httpContext.AddJavascriptSource("tcaljbp.js", "?20268241574569", false, true);
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
      edtCalBarCod_Internalname = "CALBARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCalBarCodR_Internalname = "CALBARCODR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCalBarCodP_Internalname = "CALBARCODP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCalPorUrd_Internalname = "CALPORURD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCalProTra_Internalname = "CALPROTRA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCalRodado_Internalname = "CALRODADO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCalColAgua_Internalname = "CALCOLAGUA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCalTono_Internalname = "CALTONO" ;
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
      Form.setCaption( httpContext.getMessage( "Calidad HDR (JBP)", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCalTono_Jsonclick = "" ;
      edtCalTono_Backcolor = (int)(0xFFFFFF) ;
      edtCalTono_Enabled = 1 ;
      edtCalColAgua_Jsonclick = "" ;
      edtCalColAgua_Backcolor = (int)(0xFFFFFF) ;
      edtCalColAgua_Enabled = 1 ;
      edtCalRodado_Jsonclick = "" ;
      edtCalRodado_Backcolor = (int)(0xFFFFFF) ;
      edtCalRodado_Enabled = 1 ;
      edtCalProTra_Jsonclick = "" ;
      edtCalProTra_Backcolor = (int)(0xFFFFFF) ;
      edtCalProTra_Enabled = 1 ;
      edtCalPorUrd_Jsonclick = "" ;
      edtCalPorUrd_Backcolor = (int)(0xFFFFFF) ;
      edtCalPorUrd_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCalBarCodP_Jsonclick = "" ;
      edtCalBarCodP_Backcolor = (int)(0xFFFFFF) ;
      edtCalBarCodP_Enabled = 1 ;
      edtCalBarCodR_Jsonclick = "" ;
      edtCalBarCodR_Backcolor = (int)(0xFFFFFF) ;
      edtCalBarCodR_Enabled = 1 ;
      edtCalBarCod_Jsonclick = "" ;
      edtCalBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtCalBarCod_Enabled = 1 ;
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
      /* Using cursor T01GI15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01GI15_A407EmprNom[0] ;
      n407EmprNom = T01GI15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01GI17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidad JBP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CALBARCODP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtCalPorUrd_Internalname ;
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
      /* Using cursor T01GI15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01GI15_A407EmprNom[0] ;
      n407EmprNom = T01GI15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Calbarcodp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01GI17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A3985CalBarCod), Byte.valueOf(A3986CalBarCodR), A3987CalBarCodP});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Calidad JBP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CALBARCODP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3988CalPorUrd", GXutil.ltrim( localUtil.ntoc( A3988CalPorUrd, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3989CalProTra", GXutil.ltrim( localUtil.ntoc( A3989CalProTra, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3990CalRodado", GXutil.ltrim( localUtil.ntoc( A3990CalRodado, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3991CalColAgua", GXutil.ltrim( localUtil.ntoc( A3991CalColAgua, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3992CalTono", GXutil.rtrim( A3992CalTono));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3985CalBarCod", GXutil.ltrim( localUtil.ntoc( Z3985CalBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3986CalBarCodR", GXutil.ltrim( localUtil.ntoc( Z3986CalBarCodR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3987CalBarCodP", GXutil.rtrim( Z3987CalBarCodP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3988CalPorUrd", GXutil.ltrim( localUtil.ntoc( Z3988CalPorUrd, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3989CalProTra", GXutil.ltrim( localUtil.ntoc( Z3989CalProTra, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3990CalRodado", GXutil.ltrim( localUtil.ntoc( Z3990CalRodado, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3991CalColAgua", GXutil.ltrim( localUtil.ntoc( Z3991CalColAgua, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3992CalTono", GXutil.rtrim( Z3992CalTono));
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
      setEventMetadata("VALID_CALBARCOD","{handler:'valid_Calbarcod',iparms:[]");
      setEventMetadata("VALID_CALBARCOD",",oparms:[]}");
      setEventMetadata("VALID_CALBARCODR","{handler:'valid_Calbarcodr',iparms:[]");
      setEventMetadata("VALID_CALBARCODR",",oparms:[]}");
      setEventMetadata("VALID_CALBARCODP","{handler:'valid_Calbarcodp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3985CalBarCod',fld:'CALBARCOD',pic:'ZZZZZZZ9'},{av:'A3986CalBarCodR',fld:'CALBARCODR',pic:'9'},{av:'A3987CalBarCodP',fld:'CALBARCODP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CALBARCODP",",oparms:[{av:'A3988CalPorUrd',fld:'CALPORURD',pic:'ZZ9.99'},{av:'A3989CalProTra',fld:'CALPROTRA',pic:'ZZ9.99'},{av:'A3990CalRodado',fld:'CALRODADO',pic:'ZZZ9'},{av:'A3991CalColAgua',fld:'CALCOLAGUA',pic:'ZZ9.99'},{av:'A3992CalTono',fld:'CALTONO',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3985CalBarCod'},{av:'Z3986CalBarCodR'},{av:'Z3987CalBarCodP'},{av:'Z3988CalPorUrd'},{av:'Z3989CalProTra'},{av:'Z3990CalRodado'},{av:'Z3991CalColAgua'},{av:'Z3992CalTono'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(15);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z3987CalBarCodP = "" ;
      Z3988CalPorUrd = DecimalUtil.ZERO ;
      Z3989CalProTra = DecimalUtil.ZERO ;
      Z3991CalColAgua = DecimalUtil.ZERO ;
      Z3992CalTono = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3987CalBarCodP = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A3988CalPorUrd = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A3989CalProTra = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A3991CalColAgua = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A3992CalTono = "" ;
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
      Z407EmprNom = "" ;
      T01GI6_A407EmprNom = new String[] {""} ;
      T01GI6_n407EmprNom = new boolean[] {false} ;
      T01GI6_A3988CalPorUrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI6_n3988CalPorUrd = new boolean[] {false} ;
      T01GI6_A3989CalProTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI6_n3989CalProTra = new boolean[] {false} ;
      T01GI6_A3990CalRodado = new short[1] ;
      T01GI6_n3990CalRodado = new boolean[] {false} ;
      T01GI6_A3991CalColAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI6_n3991CalColAgua = new boolean[] {false} ;
      T01GI6_A3992CalTono = new String[] {""} ;
      T01GI6_n3992CalTono = new boolean[] {false} ;
      T01GI6_A396EmprCod = new String[] {""} ;
      T01GI6_A3985CalBarCod = new int[1] ;
      T01GI6_A3986CalBarCodR = new byte[1] ;
      T01GI6_A3987CalBarCodP = new String[] {""} ;
      T01GI4_A407EmprNom = new String[] {""} ;
      T01GI4_n407EmprNom = new boolean[] {false} ;
      T01GI5_A396EmprCod = new String[] {""} ;
      T01GI7_A407EmprNom = new String[] {""} ;
      T01GI7_n407EmprNom = new boolean[] {false} ;
      T01GI8_A396EmprCod = new String[] {""} ;
      T01GI9_A396EmprCod = new String[] {""} ;
      T01GI9_A3985CalBarCod = new int[1] ;
      T01GI9_A3986CalBarCodR = new byte[1] ;
      T01GI9_A3987CalBarCodP = new String[] {""} ;
      T01GI3_A3988CalPorUrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI3_n3988CalPorUrd = new boolean[] {false} ;
      T01GI3_A3989CalProTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI3_n3989CalProTra = new boolean[] {false} ;
      T01GI3_A3990CalRodado = new short[1] ;
      T01GI3_n3990CalRodado = new boolean[] {false} ;
      T01GI3_A3991CalColAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI3_n3991CalColAgua = new boolean[] {false} ;
      T01GI3_A3992CalTono = new String[] {""} ;
      T01GI3_n3992CalTono = new boolean[] {false} ;
      T01GI3_A396EmprCod = new String[] {""} ;
      T01GI3_A3985CalBarCod = new int[1] ;
      T01GI3_A3986CalBarCodR = new byte[1] ;
      T01GI3_A3987CalBarCodP = new String[] {""} ;
      sMode1610 = "" ;
      T01GI10_A396EmprCod = new String[] {""} ;
      T01GI10_A3985CalBarCod = new int[1] ;
      T01GI10_A3986CalBarCodR = new byte[1] ;
      T01GI10_A3987CalBarCodP = new String[] {""} ;
      T01GI11_A396EmprCod = new String[] {""} ;
      T01GI11_A3985CalBarCod = new int[1] ;
      T01GI11_A3986CalBarCodR = new byte[1] ;
      T01GI11_A3987CalBarCodP = new String[] {""} ;
      T01GI2_A3988CalPorUrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI2_n3988CalPorUrd = new boolean[] {false} ;
      T01GI2_A3989CalProTra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI2_n3989CalProTra = new boolean[] {false} ;
      T01GI2_A3990CalRodado = new short[1] ;
      T01GI2_n3990CalRodado = new boolean[] {false} ;
      T01GI2_A3991CalColAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GI2_n3991CalColAgua = new boolean[] {false} ;
      T01GI2_A3992CalTono = new String[] {""} ;
      T01GI2_n3992CalTono = new boolean[] {false} ;
      T01GI2_A396EmprCod = new String[] {""} ;
      T01GI2_A3985CalBarCod = new int[1] ;
      T01GI2_A3986CalBarCodR = new byte[1] ;
      T01GI2_A3987CalBarCodP = new String[] {""} ;
      T01GI15_A407EmprNom = new String[] {""} ;
      T01GI15_n407EmprNom = new boolean[] {false} ;
      T01GI16_A396EmprCod = new String[] {""} ;
      T01GI16_A3985CalBarCod = new int[1] ;
      T01GI16_A3986CalBarCodR = new byte[1] ;
      T01GI16_A3987CalBarCodP = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01GI17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ3987CalBarCodP = "" ;
      ZZ3988CalPorUrd = DecimalUtil.ZERO ;
      ZZ3989CalProTra = DecimalUtil.ZERO ;
      ZZ3991CalColAgua = DecimalUtil.ZERO ;
      ZZ3992CalTono = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcaljbp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcaljbp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcaljbp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcaljbp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcaljbp__default(),
         new Object[] {
             new Object[] {
            T01GI2_A3988CalPorUrd, T01GI2_n3988CalPorUrd, T01GI2_A3989CalProTra, T01GI2_n3989CalProTra, T01GI2_A3990CalRodado, T01GI2_n3990CalRodado, T01GI2_A3991CalColAgua, T01GI2_n3991CalColAgua, T01GI2_A3992CalTono, T01GI2_n3992CalTono,
            T01GI2_A396EmprCod, T01GI2_A3985CalBarCod, T01GI2_A3986CalBarCodR, T01GI2_A3987CalBarCodP
            }
            , new Object[] {
            T01GI3_A3988CalPorUrd, T01GI3_n3988CalPorUrd, T01GI3_A3989CalProTra, T01GI3_n3989CalProTra, T01GI3_A3990CalRodado, T01GI3_n3990CalRodado, T01GI3_A3991CalColAgua, T01GI3_n3991CalColAgua, T01GI3_A3992CalTono, T01GI3_n3992CalTono,
            T01GI3_A396EmprCod, T01GI3_A3985CalBarCod, T01GI3_A3986CalBarCodR, T01GI3_A3987CalBarCodP
            }
            , new Object[] {
            T01GI4_A407EmprNom, T01GI4_n407EmprNom
            }
            , new Object[] {
            T01GI5_A396EmprCod
            }
            , new Object[] {
            T01GI6_A407EmprNom, T01GI6_n407EmprNom, T01GI6_A3988CalPorUrd, T01GI6_n3988CalPorUrd, T01GI6_A3989CalProTra, T01GI6_n3989CalProTra, T01GI6_A3990CalRodado, T01GI6_n3990CalRodado, T01GI6_A3991CalColAgua, T01GI6_n3991CalColAgua,
            T01GI6_A3992CalTono, T01GI6_n3992CalTono, T01GI6_A396EmprCod, T01GI6_A3985CalBarCod, T01GI6_A3986CalBarCodR, T01GI6_A3987CalBarCodP
            }
            , new Object[] {
            T01GI7_A407EmprNom, T01GI7_n407EmprNom
            }
            , new Object[] {
            T01GI8_A396EmprCod
            }
            , new Object[] {
            T01GI9_A396EmprCod, T01GI9_A3985CalBarCod, T01GI9_A3986CalBarCodR, T01GI9_A3987CalBarCodP
            }
            , new Object[] {
            T01GI10_A396EmprCod, T01GI10_A3985CalBarCod, T01GI10_A3986CalBarCodR, T01GI10_A3987CalBarCodP
            }
            , new Object[] {
            T01GI11_A396EmprCod, T01GI11_A3985CalBarCod, T01GI11_A3986CalBarCodR, T01GI11_A3987CalBarCodP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GI15_A407EmprNom, T01GI15_n407EmprNom
            }
            , new Object[] {
            T01GI16_A396EmprCod, T01GI16_A3985CalBarCod, T01GI16_A3986CalBarCodR, T01GI16_A3987CalBarCodP
            }
            , new Object[] {
            T01GI17_A396EmprCod
            }
         }
      );
   }

   private byte Z3986CalBarCodR ;
   private byte GxWebError ;
   private byte A3986CalBarCodR ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ3986CalBarCodR ;
   private short Z3990CalRodado ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3990CalRodado ;
   private short RcdFound1610 ;
   private short nIsDirty_1610 ;
   private short ZZ3990CalRodado ;
   private int Z3985CalBarCod ;
   private int A3985CalBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCalBarCod_Enabled ;
   private int edtCalBarCodR_Enabled ;
   private int edtCalBarCodP_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCalPorUrd_Enabled ;
   private int edtCalProTra_Enabled ;
   private int edtCalRodado_Enabled ;
   private int edtCalColAgua_Enabled ;
   private int edtCalTono_Enabled ;
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
   private int edtCalTono_Backcolor ;
   private int edtCalColAgua_Backcolor ;
   private int edtCalRodado_Backcolor ;
   private int edtCalProTra_Backcolor ;
   private int edtCalPorUrd_Backcolor ;
   private int edtCalBarCodP_Backcolor ;
   private int edtCalBarCodR_Backcolor ;
   private int edtCalBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ3985CalBarCod ;
   private java.math.BigDecimal Z3988CalPorUrd ;
   private java.math.BigDecimal Z3989CalProTra ;
   private java.math.BigDecimal Z3991CalColAgua ;
   private java.math.BigDecimal A3988CalPorUrd ;
   private java.math.BigDecimal A3989CalProTra ;
   private java.math.BigDecimal A3991CalColAgua ;
   private java.math.BigDecimal ZZ3988CalPorUrd ;
   private java.math.BigDecimal ZZ3989CalProTra ;
   private java.math.BigDecimal ZZ3991CalColAgua ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z3987CalBarCodP ;
   private String Z3992CalTono ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3987CalBarCodP ;
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
   private String edtCalBarCod_Internalname ;
   private String edtCalBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCalBarCodR_Internalname ;
   private String edtCalBarCodR_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCalBarCodP_Internalname ;
   private String edtCalBarCodP_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCalPorUrd_Internalname ;
   private String edtCalPorUrd_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCalProTra_Internalname ;
   private String edtCalProTra_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCalRodado_Internalname ;
   private String edtCalRodado_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCalColAgua_Internalname ;
   private String edtCalColAgua_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCalTono_Internalname ;
   private String A3992CalTono ;
   private String edtCalTono_Jsonclick ;
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
   private String Z407EmprNom ;
   private String sMode1610 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ3987CalBarCodP ;
   private String ZZ3992CalTono ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n3988CalPorUrd ;
   private boolean n3989CalProTra ;
   private boolean n3990CalRodado ;
   private boolean n3991CalColAgua ;
   private boolean n3992CalTono ;
   private IDataStoreProvider pr_default ;
   private String[] T01GI6_A407EmprNom ;
   private boolean[] T01GI6_n407EmprNom ;
   private java.math.BigDecimal[] T01GI6_A3988CalPorUrd ;
   private boolean[] T01GI6_n3988CalPorUrd ;
   private java.math.BigDecimal[] T01GI6_A3989CalProTra ;
   private boolean[] T01GI6_n3989CalProTra ;
   private short[] T01GI6_A3990CalRodado ;
   private boolean[] T01GI6_n3990CalRodado ;
   private java.math.BigDecimal[] T01GI6_A3991CalColAgua ;
   private boolean[] T01GI6_n3991CalColAgua ;
   private String[] T01GI6_A3992CalTono ;
   private boolean[] T01GI6_n3992CalTono ;
   private String[] T01GI6_A396EmprCod ;
   private int[] T01GI6_A3985CalBarCod ;
   private byte[] T01GI6_A3986CalBarCodR ;
   private String[] T01GI6_A3987CalBarCodP ;
   private String[] T01GI4_A407EmprNom ;
   private boolean[] T01GI4_n407EmprNom ;
   private String[] T01GI5_A396EmprCod ;
   private String[] T01GI7_A407EmprNom ;
   private boolean[] T01GI7_n407EmprNom ;
   private String[] T01GI8_A396EmprCod ;
   private String[] T01GI9_A396EmprCod ;
   private int[] T01GI9_A3985CalBarCod ;
   private byte[] T01GI9_A3986CalBarCodR ;
   private String[] T01GI9_A3987CalBarCodP ;
   private java.math.BigDecimal[] T01GI3_A3988CalPorUrd ;
   private boolean[] T01GI3_n3988CalPorUrd ;
   private java.math.BigDecimal[] T01GI3_A3989CalProTra ;
   private boolean[] T01GI3_n3989CalProTra ;
   private short[] T01GI3_A3990CalRodado ;
   private boolean[] T01GI3_n3990CalRodado ;
   private java.math.BigDecimal[] T01GI3_A3991CalColAgua ;
   private boolean[] T01GI3_n3991CalColAgua ;
   private String[] T01GI3_A3992CalTono ;
   private boolean[] T01GI3_n3992CalTono ;
   private String[] T01GI3_A396EmprCod ;
   private int[] T01GI3_A3985CalBarCod ;
   private byte[] T01GI3_A3986CalBarCodR ;
   private String[] T01GI3_A3987CalBarCodP ;
   private String[] T01GI10_A396EmprCod ;
   private int[] T01GI10_A3985CalBarCod ;
   private byte[] T01GI10_A3986CalBarCodR ;
   private String[] T01GI10_A3987CalBarCodP ;
   private String[] T01GI11_A396EmprCod ;
   private int[] T01GI11_A3985CalBarCod ;
   private byte[] T01GI11_A3986CalBarCodR ;
   private String[] T01GI11_A3987CalBarCodP ;
   private java.math.BigDecimal[] T01GI2_A3988CalPorUrd ;
   private boolean[] T01GI2_n3988CalPorUrd ;
   private java.math.BigDecimal[] T01GI2_A3989CalProTra ;
   private boolean[] T01GI2_n3989CalProTra ;
   private short[] T01GI2_A3990CalRodado ;
   private boolean[] T01GI2_n3990CalRodado ;
   private java.math.BigDecimal[] T01GI2_A3991CalColAgua ;
   private boolean[] T01GI2_n3991CalColAgua ;
   private String[] T01GI2_A3992CalTono ;
   private boolean[] T01GI2_n3992CalTono ;
   private String[] T01GI2_A396EmprCod ;
   private int[] T01GI2_A3985CalBarCod ;
   private byte[] T01GI2_A3986CalBarCodR ;
   private String[] T01GI2_A3987CalBarCodP ;
   private String[] T01GI15_A407EmprNom ;
   private boolean[] T01GI15_n407EmprNom ;
   private String[] T01GI16_A396EmprCod ;
   private int[] T01GI16_A3985CalBarCod ;
   private byte[] T01GI16_A3986CalBarCodR ;
   private String[] T01GI16_A3987CalBarCodP ;
   private String[] T01GI17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcaljbp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaljbp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaljbp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaljbp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcaljbp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GI2", "SELECT CalPorUrd, CalProTra, CalRodado, CalColAgua, CalTono, EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?  FOR UPDATE OF CalPorUrd, CalProTra, CalRodado, CalColAgua, CalTono NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI3", "SELECT CalPorUrd, CalProTra, CalRodado, CalColAgua, CalTono, EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI5", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI6", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.CalPorUrd, TM1.CalProTra, TM1.CalRodado, TM1.CalColAgua, TM1.CalTono, TM1.EmprCod, TM1.CalBarCod AS CalBarCod, TM1.CalBarCodR AS CalBarCodR, TM1.CalBarCodP AS CalBarCodP FROM (TXPCALJBP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CalBarCod = ? and TM1.CalBarCodR = ? and TM1.CalBarCodP = ? ORDER BY TM1.EmprCod, TM1.CalBarCod, TM1.CalBarCodR, TM1.CalBarCodP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE ( EmprCod > ? or EmprCod = ? and CalBarCod > ? or CalBarCod = ? and EmprCod = ? and CalBarCodR > ? or CalBarCodR = ? and CalBarCod = ? and EmprCod = ? and CalBarCodP > ?) ORDER BY EmprCod, CalBarCod, CalBarCodR, CalBarCodP) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GI11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE ( EmprCod < ? or EmprCod = ? and CalBarCod < ? or CalBarCod = ? and EmprCod = ? and CalBarCodR < ? or CalBarCodR = ? and CalBarCod = ? and EmprCod = ? and CalBarCodP < ?) ORDER BY EmprCod DESC, CalBarCod DESC, CalBarCodR DESC, CalBarCodP DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GI12", "INSERT INTO TXPCALJBP(CalPorUrd, CalProTra, CalRodado, CalColAgua, CalTono, EmprCod, CalBarCod, CalBarCodR, CalBarCodP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCALJBP")
         ,new UpdateCursor("T01GI13", "UPDATE TXPCALJBP SET CalPorUrd=?, CalProTra=?, CalRodado=?, CalColAgua=?, CalTono=?  WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?", GX_NOMASK, "TXPCALJBP")
         ,new UpdateCursor("T01GI14", "DELETE FROM TXPCALJBP  WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?", GX_NOMASK, "TXPCALJBP")
         ,new ForEachCursor("T01GI15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP ORDER BY EmprCod, CalBarCod, CalBarCodR, CalBarCodP ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GI17", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 3);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 3);
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 10 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setString(5, (String)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               return;
            case 11 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setString(5, (String)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

