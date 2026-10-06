package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmqcos_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
            A606MaqDsc = httpContext.GetPar( "MaqDsc") ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Costes Maquina por Año/Mes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMqCAnyo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmqcos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmqcos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmqcos_impl.class ));
   }

   public tmqcos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_CostesBasicos\\TMQCOS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Año", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCAnyo_Internalname, GXutil.ltrim( localUtil.ntoc( A14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCAnyo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14529MqCAnyo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14529MqCAnyo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCAnyo_Jsonclick, 0, "", "", "", "", "", 1, edtMqCAnyo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCMes_Internalname, GXutil.ltrim( localUtil.ntoc( A14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14530MqCMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A14530MqCMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCMes_Jsonclick, 0, "", "", "", "", "", 1, edtMqCMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Amortizaciones", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCAmo_Internalname, GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCAmo_Enabled!=0) ? localUtil.format( A14541MqCAmo, "ZZZZ9.9999") : localUtil.format( A14541MqCAmo, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCAmo_Jsonclick, 0, "", "", "", "", "", 1, edtMqCAmo_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Administracion Cebtral", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCAdCt_Internalname, GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCAdCt_Enabled!=0) ? localUtil.format( A14540MqCAdCt, "ZZZZ9.9999") : localUtil.format( A14540MqCAdCt, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCAdCt_Jsonclick, 0, "", "", "", "", "", 1, edtMqCAdCt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Agua", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCAgua_Internalname, GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCAgua_Enabled!=0) ? localUtil.format( A14539MqCAgua, "ZZZZ9.9999") : localUtil.format( A14539MqCAgua, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCAgua_Jsonclick, 0, "", "", "", "", "", 1, edtMqCAgua_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Gas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCGas_Internalname, GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCGas_Enabled!=0) ? localUtil.format( A14538MqCGas, "ZZZZ9.9999") : localUtil.format( A14538MqCGas, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCGas_Jsonclick, 0, "", "", "", "", "", 1, edtMqCGas_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Energia", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCEner_Internalname, GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCEner_Enabled!=0) ? localUtil.format( A14537MqCEner, "ZZZZ9.9999") : localUtil.format( A14537MqCEner, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCEner_Jsonclick, 0, "", "", "", "", "", 1, edtMqCEner_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "MOI", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCMoi_Internalname, GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCMoi_Enabled!=0) ? localUtil.format( A14536MqCMoi, "ZZZZ9.9999") : localUtil.format( A14536MqCMoi, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCMoi_Jsonclick, 0, "", "", "", "", "", 1, edtMqCMoi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "MOD", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCMod_Internalname, GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCMod_Enabled!=0) ? localUtil.format( A14535MqCMod, "ZZZZ9.9999") : localUtil.format( A14535MqCMod, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCMod_Jsonclick, 0, "", "", "", "", "", 1, edtMqCMod_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Coste Minuto", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCMin_Internalname, GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCMin_Enabled!=0) ? localUtil.format( A14534MqCMin, "ZZZZ9.9999") : localUtil.format( A14534MqCMin, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCMin_Jsonclick, 0, "", "", "", "", "", 1, edtMqCMin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Gastos Indirectos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCgi_Internalname, GXutil.ltrim( localUtil.ntoc( A14543MqCgi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCgi_Enabled!=0) ? localUtil.format( A14543MqCgi, "ZZZZ9.9999") : localUtil.format( A14543MqCgi, "ZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCgi_Jsonclick, 0, "", "", "", "", "", 1, edtMqCgi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Coste Total", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMqCTotal_Internalname, GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMqCTotal_Enabled!=0) ? localUtil.format( A14542MqCTotal, "ZZZZ9.9999") : localUtil.format( A14542MqCTotal, "ZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMqCTotal_Jsonclick, 0, "", "", "", "", "", 1, edtMqCTotal_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesBasicos\\TMQCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesBasicos\\TMQCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_CostesBasicos\\TMQCOS.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z14529MqCAnyo = (short)(localUtil.ctol( httpContext.cgiGet( "Z14529MqCAnyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14530MqCMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14530MqCMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14541MqCAmo = localUtil.ctond( httpContext.cgiGet( "Z14541MqCAmo")) ;
         Z14540MqCAdCt = localUtil.ctond( httpContext.cgiGet( "Z14540MqCAdCt")) ;
         Z14539MqCAgua = localUtil.ctond( httpContext.cgiGet( "Z14539MqCAgua")) ;
         Z14538MqCGas = localUtil.ctond( httpContext.cgiGet( "Z14538MqCGas")) ;
         Z14537MqCEner = localUtil.ctond( httpContext.cgiGet( "Z14537MqCEner")) ;
         Z14536MqCMoi = localUtil.ctond( httpContext.cgiGet( "Z14536MqCMoi")) ;
         Z14535MqCMod = localUtil.ctond( httpContext.cgiGet( "Z14535MqCMod")) ;
         Z14534MqCMin = localUtil.ctond( httpContext.cgiGet( "Z14534MqCMin")) ;
         Z14543MqCgi = localUtil.ctond( httpContext.cgiGet( "Z14543MqCgi")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCANYO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCAnyo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14529MqCAnyo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         }
         else
         {
            A14529MqCAnyo = (short)(localUtil.ctol( httpContext.cgiGet( edtMqCAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCMES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14530MqCMes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
         }
         else
         {
            A14530MqCMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtMqCMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCAMO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCAmo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14541MqCAmo = DecimalUtil.ZERO ;
            n14541MqCAmo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrimstr( A14541MqCAmo, 10, 4));
         }
         else
         {
            A14541MqCAmo = localUtil.ctond( httpContext.cgiGet( edtMqCAmo_Internalname)) ;
            n14541MqCAmo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrimstr( A14541MqCAmo, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCADCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCAdCt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14540MqCAdCt = DecimalUtil.ZERO ;
            n14540MqCAdCt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrimstr( A14540MqCAdCt, 10, 4));
         }
         else
         {
            A14540MqCAdCt = localUtil.ctond( httpContext.cgiGet( edtMqCAdCt_Internalname)) ;
            n14540MqCAdCt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrimstr( A14540MqCAdCt, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCAGUA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCAgua_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14539MqCAgua = DecimalUtil.ZERO ;
            n14539MqCAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrimstr( A14539MqCAgua, 10, 4));
         }
         else
         {
            A14539MqCAgua = localUtil.ctond( httpContext.cgiGet( edtMqCAgua_Internalname)) ;
            n14539MqCAgua = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrimstr( A14539MqCAgua, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCGAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCGas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14538MqCGas = DecimalUtil.ZERO ;
            n14538MqCGas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrimstr( A14538MqCGas, 10, 4));
         }
         else
         {
            A14538MqCGas = localUtil.ctond( httpContext.cgiGet( edtMqCGas_Internalname)) ;
            n14538MqCGas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrimstr( A14538MqCGas, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCENER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCEner_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14537MqCEner = DecimalUtil.ZERO ;
            n14537MqCEner = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrimstr( A14537MqCEner, 10, 4));
         }
         else
         {
            A14537MqCEner = localUtil.ctond( httpContext.cgiGet( edtMqCEner_Internalname)) ;
            n14537MqCEner = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrimstr( A14537MqCEner, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCMOI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCMoi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14536MqCMoi = DecimalUtil.ZERO ;
            n14536MqCMoi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrimstr( A14536MqCMoi, 10, 4));
         }
         else
         {
            A14536MqCMoi = localUtil.ctond( httpContext.cgiGet( edtMqCMoi_Internalname)) ;
            n14536MqCMoi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrimstr( A14536MqCMoi, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCMOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCMod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14535MqCMod = DecimalUtil.ZERO ;
            n14535MqCMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrimstr( A14535MqCMod, 10, 4));
         }
         else
         {
            A14535MqCMod = localUtil.ctond( httpContext.cgiGet( edtMqCMod_Internalname)) ;
            n14535MqCMod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrimstr( A14535MqCMod, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14534MqCMin = DecimalUtil.ZERO ;
            n14534MqCMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrimstr( A14534MqCMin, 10, 4));
         }
         else
         {
            A14534MqCMin = localUtil.ctond( httpContext.cgiGet( edtMqCMin_Internalname)) ;
            n14534MqCMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrimstr( A14534MqCMin, 10, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMqCgi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMqCgi_Internalname)), DecimalUtil.stringToDec("99999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MQCGI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMqCgi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14543MqCgi = DecimalUtil.ZERO ;
            n14543MqCgi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrimstr( A14543MqCgi, 10, 4));
         }
         else
         {
            A14543MqCgi = localUtil.ctond( httpContext.cgiGet( edtMqCgi_Internalname)) ;
            n14543MqCgi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrimstr( A14543MqCgi, 10, 4));
         }
         A14542MqCTotal = localUtil.ctond( httpContext.cgiGet( edtMqCTotal_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrimstr( A14542MqCTotal, 10, 4));
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
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
            A14529MqCAnyo = (short)(GXutil.lval( httpContext.GetPar( "MqCAnyo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
            A14530MqCMes = (byte)(GXutil.lval( httpContext.GetPar( "MqCMes"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
            getEqualNoModal( ) ;
            if ( isIns( )  && (0==A14529MqCAnyo) && ( Gx_BScreen == 0 ) )
            {
               A14529MqCAnyo = (short)(GXutil.year( Gx_date)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
            }
            if ( isIns( )  && (0==A14530MqCMes) && ( Gx_BScreen == 0 ) )
            {
               A14530MqCMes = (byte)(GXutil.month( Gx_date)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
            }
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
            initAll1W11913( ) ;
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
      disableAttributes1W11913( ) ;
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

   public void confirm_1W10( )
   {
      beforeValidate1W11913( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1W11913( ) ;
         }
         else
         {
            checkExtendedTable1W11913( ) ;
            if ( AnyError == 0 )
            {
               zm1W11913( 7) ;
               zm1W11913( 8) ;
            }
            closeExtendedTableCursors1W11913( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1W10( ) ;
      }
   }

   public void resetCaption1W10( )
   {
   }

   public void zm1W11913( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14541MqCAmo = T01W13_A14541MqCAmo[0] ;
            Z14540MqCAdCt = T01W13_A14540MqCAdCt[0] ;
            Z14539MqCAgua = T01W13_A14539MqCAgua[0] ;
            Z14538MqCGas = T01W13_A14538MqCGas[0] ;
            Z14537MqCEner = T01W13_A14537MqCEner[0] ;
            Z14536MqCMoi = T01W13_A14536MqCMoi[0] ;
            Z14535MqCMod = T01W13_A14535MqCMod[0] ;
            Z14534MqCMin = T01W13_A14534MqCMin[0] ;
            Z14543MqCgi = T01W13_A14543MqCgi[0] ;
         }
         else
         {
            Z14541MqCAmo = A14541MqCAmo ;
            Z14540MqCAdCt = A14540MqCAdCt ;
            Z14539MqCAgua = A14539MqCAgua ;
            Z14538MqCGas = A14538MqCGas ;
            Z14537MqCEner = A14537MqCEner ;
            Z14536MqCMoi = A14536MqCMoi ;
            Z14535MqCMod = A14535MqCMod ;
            Z14534MqCMin = A14534MqCMin ;
            Z14543MqCgi = A14543MqCgi ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z14529MqCAnyo = A14529MqCAnyo ;
         Z14530MqCMes = A14530MqCMes ;
         Z14541MqCAmo = A14541MqCAmo ;
         Z14540MqCAdCt = A14540MqCAdCt ;
         Z14539MqCAgua = A14539MqCAgua ;
         Z14538MqCGas = A14538MqCGas ;
         Z14537MqCEner = A14537MqCEner ;
         Z14536MqCMoi = A14536MqCMoi ;
         Z14535MqCMod = A14535MqCMod ;
         Z14534MqCMin = A14534MqCMin ;
         Z14543MqCgi = A14543MqCgi ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z606MaqDsc = A606MaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      /* Using cursor T01W14 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01W14_A407EmprNom[0] ;
      n407EmprNom = T01W14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01W15 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
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
      if ( isIns( )  && (0==A14529MqCAnyo) && ( Gx_BScreen == 0 ) )
      {
         A14529MqCAnyo = (short)(GXutil.year( Gx_date)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
      }
      if ( isIns( )  && (0==A14530MqCMes) && ( Gx_BScreen == 0 ) )
      {
         A14530MqCMes = (byte)(GXutil.month( Gx_date)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
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

   public void load1W11913( )
   {
      /* Using cursor T01W16 */
      pr_default.execute(4, new Object[] {Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes), A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A407EmprNom = T01W16_A407EmprNom[0] ;
         n407EmprNom = T01W16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A14541MqCAmo = T01W16_A14541MqCAmo[0] ;
         n14541MqCAmo = T01W16_n14541MqCAmo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrimstr( A14541MqCAmo, 10, 4));
         A14540MqCAdCt = T01W16_A14540MqCAdCt[0] ;
         n14540MqCAdCt = T01W16_n14540MqCAdCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrimstr( A14540MqCAdCt, 10, 4));
         A14539MqCAgua = T01W16_A14539MqCAgua[0] ;
         n14539MqCAgua = T01W16_n14539MqCAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrimstr( A14539MqCAgua, 10, 4));
         A14538MqCGas = T01W16_A14538MqCGas[0] ;
         n14538MqCGas = T01W16_n14538MqCGas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrimstr( A14538MqCGas, 10, 4));
         A14537MqCEner = T01W16_A14537MqCEner[0] ;
         n14537MqCEner = T01W16_n14537MqCEner[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrimstr( A14537MqCEner, 10, 4));
         A14536MqCMoi = T01W16_A14536MqCMoi[0] ;
         n14536MqCMoi = T01W16_n14536MqCMoi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrimstr( A14536MqCMoi, 10, 4));
         A14535MqCMod = T01W16_A14535MqCMod[0] ;
         n14535MqCMod = T01W16_n14535MqCMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrimstr( A14535MqCMod, 10, 4));
         A14534MqCMin = T01W16_A14534MqCMin[0] ;
         n14534MqCMin = T01W16_n14534MqCMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrimstr( A14534MqCMin, 10, 4));
         A14543MqCgi = T01W16_A14543MqCgi[0] ;
         n14543MqCgi = T01W16_n14543MqCgi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrimstr( A14543MqCgi, 10, 4));
         zm1W11913( -6) ;
      }
      pr_default.close(4);
      onLoadActions1W11913( ) ;
   }

   public void onLoadActions1W11913( )
   {
      A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrimstr( A14542MqCTotal, 10, 4));
   }

   public void checkExtendedTable1W11913( )
   {
      nIsDirty_1913 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( A14530MqCMes < 1 ) || ( A14530MqCMes > 12 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Mes incorrecto", ""), 1, "MQCMES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1913 = (short)(1) ;
      A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrimstr( A14542MqCTotal, 10, 4));
   }

   public void closeExtendedTableCursors1W11913( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1W11913( )
   {
      /* Using cursor T01W17 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1913 = (short)(1) ;
      }
      else
      {
         RcdFound1913 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01W13 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01W13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W13_A602MaqCod[0], A602MaqCod) == 0 ) )
      {
         zm1W11913( 6) ;
         RcdFound1913 = (short)(1) ;
         A14529MqCAnyo = T01W13_A14529MqCAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         A14530MqCMes = T01W13_A14530MqCMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
         A14541MqCAmo = T01W13_A14541MqCAmo[0] ;
         n14541MqCAmo = T01W13_n14541MqCAmo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrimstr( A14541MqCAmo, 10, 4));
         A14540MqCAdCt = T01W13_A14540MqCAdCt[0] ;
         n14540MqCAdCt = T01W13_n14540MqCAdCt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrimstr( A14540MqCAdCt, 10, 4));
         A14539MqCAgua = T01W13_A14539MqCAgua[0] ;
         n14539MqCAgua = T01W13_n14539MqCAgua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrimstr( A14539MqCAgua, 10, 4));
         A14538MqCGas = T01W13_A14538MqCGas[0] ;
         n14538MqCGas = T01W13_n14538MqCGas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrimstr( A14538MqCGas, 10, 4));
         A14537MqCEner = T01W13_A14537MqCEner[0] ;
         n14537MqCEner = T01W13_n14537MqCEner[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrimstr( A14537MqCEner, 10, 4));
         A14536MqCMoi = T01W13_A14536MqCMoi[0] ;
         n14536MqCMoi = T01W13_n14536MqCMoi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrimstr( A14536MqCMoi, 10, 4));
         A14535MqCMod = T01W13_A14535MqCMod[0] ;
         n14535MqCMod = T01W13_n14535MqCMod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrimstr( A14535MqCMod, 10, 4));
         A14534MqCMin = T01W13_A14534MqCMin[0] ;
         n14534MqCMin = T01W13_n14534MqCMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrimstr( A14534MqCMin, 10, 4));
         A14543MqCgi = T01W13_A14543MqCgi[0] ;
         n14543MqCgi = T01W13_n14543MqCgi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrimstr( A14543MqCgi, 10, 4));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z14529MqCAnyo = A14529MqCAnyo ;
         Z14530MqCMes = A14530MqCMes ;
         sMode1913 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1W11913( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1913 = (short)(0) ;
            initializeNonKey1W11913( ) ;
         }
         Gx_mode = sMode1913 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1913 = (short)(0) ;
         initializeNonKey1W11913( ) ;
         sMode1913 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1913 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1W11913( ) ;
      if ( RcdFound1913 == 0 )
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
      RcdFound1913 = (short)(0) ;
      /* Using cursor T01W18 */
      pr_default.execute(6, new Object[] {Short.valueOf(A14529MqCAnyo), Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes), A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01W18_A14529MqCAnyo[0] < A14529MqCAnyo ) || ( T01W18_A14529MqCAnyo[0] == A14529MqCAnyo ) && ( T01W18_A14530MqCMes[0] < A14530MqCMes ) ) && ( GXutil.strcmp(T01W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W18_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01W18_A14529MqCAnyo[0] > A14529MqCAnyo ) || ( T01W18_A14529MqCAnyo[0] == A14529MqCAnyo ) && ( T01W18_A14530MqCMes[0] > A14530MqCMes ) ) && ( GXutil.strcmp(T01W18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W18_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            A14529MqCAnyo = T01W18_A14529MqCAnyo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
            A14530MqCMes = T01W18_A14530MqCMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
            RcdFound1913 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1913 = (short)(0) ;
      /* Using cursor T01W19 */
      pr_default.execute(7, new Object[] {Short.valueOf(A14529MqCAnyo), Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes), A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01W19_A14529MqCAnyo[0] > A14529MqCAnyo ) || ( T01W19_A14529MqCAnyo[0] == A14529MqCAnyo ) && ( T01W19_A14530MqCMes[0] > A14530MqCMes ) ) && ( GXutil.strcmp(T01W19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W19_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01W19_A14529MqCAnyo[0] < A14529MqCAnyo ) || ( T01W19_A14529MqCAnyo[0] == A14529MqCAnyo ) && ( T01W19_A14530MqCMes[0] < A14530MqCMes ) ) && ( GXutil.strcmp(T01W19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01W19_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            A14529MqCAnyo = T01W19_A14529MqCAnyo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
            A14530MqCMes = T01W19_A14530MqCMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
            RcdFound1913 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1W11913( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMqCAnyo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1W11913( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1913 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A14529MqCAnyo != Z14529MqCAnyo ) || ( A14530MqCMes != Z14530MqCMes ) )
            {
               A14529MqCAnyo = Z14529MqCAnyo ;
               httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
               A14530MqCMes = Z14530MqCMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMqCAnyo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1W11913( ) ;
               GX_FocusControl = edtMqCAnyo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A14529MqCAnyo != Z14529MqCAnyo ) || ( A14530MqCMes != Z14530MqCMes ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMqCAnyo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1W11913( ) ;
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
                  GX_FocusControl = edtMqCAnyo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1W11913( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A14529MqCAnyo != Z14529MqCAnyo ) || ( A14530MqCMes != Z14530MqCMes ) )
      {
         A14529MqCAnyo = Z14529MqCAnyo ;
         httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         A14530MqCMes = Z14530MqCMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMqCAnyo_Internalname ;
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
      getKey1W11913( ) ;
      if ( RcdFound1913 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A14529MqCAnyo != Z14529MqCAnyo ) || ( A14530MqCMes != Z14530MqCMes ) )
         {
            A14529MqCAnyo = Z14529MqCAnyo ;
            httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
            A14530MqCMes = Z14530MqCMes ;
            httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || ( A14529MqCAnyo != Z14529MqCAnyo ) || ( A14530MqCMes != Z14530MqCMes ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "costesbasicos.tmqcos");
      GX_FocusControl = edtMqCAmo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1W10( ) ;
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
      if ( RcdFound1913 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMqCAmo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1W11913( ) ;
      if ( RcdFound1913 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMqCAmo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W11913( ) ;
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
      if ( RcdFound1913 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMqCAmo_Internalname ;
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
      if ( RcdFound1913 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMqCAmo_Internalname ;
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
      scanStart1W11913( ) ;
      if ( RcdFound1913 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1913 != 0 )
         {
            scanNext1W11913( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMqCAmo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1W11913( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1W11913( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01W12 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQCOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z14541MqCAmo, T01W12_A14541MqCAmo[0]) != 0 ) || ( DecimalUtil.compareTo(Z14540MqCAdCt, T01W12_A14540MqCAdCt[0]) != 0 ) || ( DecimalUtil.compareTo(Z14539MqCAgua, T01W12_A14539MqCAgua[0]) != 0 ) || ( DecimalUtil.compareTo(Z14538MqCGas, T01W12_A14538MqCGas[0]) != 0 ) || ( DecimalUtil.compareTo(Z14537MqCEner, T01W12_A14537MqCEner[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14536MqCMoi, T01W12_A14536MqCMoi[0]) != 0 ) || ( DecimalUtil.compareTo(Z14535MqCMod, T01W12_A14535MqCMod[0]) != 0 ) || ( DecimalUtil.compareTo(Z14534MqCMin, T01W12_A14534MqCMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z14543MqCgi, T01W12_A14543MqCgi[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z14541MqCAmo, T01W12_A14541MqCAmo[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCAmo");
               GXutil.writeLogRaw("Old: ",Z14541MqCAmo);
               GXutil.writeLogRaw("Current: ",T01W12_A14541MqCAmo[0]);
            }
            if ( DecimalUtil.compareTo(Z14540MqCAdCt, T01W12_A14540MqCAdCt[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCAdCt");
               GXutil.writeLogRaw("Old: ",Z14540MqCAdCt);
               GXutil.writeLogRaw("Current: ",T01W12_A14540MqCAdCt[0]);
            }
            if ( DecimalUtil.compareTo(Z14539MqCAgua, T01W12_A14539MqCAgua[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCAgua");
               GXutil.writeLogRaw("Old: ",Z14539MqCAgua);
               GXutil.writeLogRaw("Current: ",T01W12_A14539MqCAgua[0]);
            }
            if ( DecimalUtil.compareTo(Z14538MqCGas, T01W12_A14538MqCGas[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCGas");
               GXutil.writeLogRaw("Old: ",Z14538MqCGas);
               GXutil.writeLogRaw("Current: ",T01W12_A14538MqCGas[0]);
            }
            if ( DecimalUtil.compareTo(Z14537MqCEner, T01W12_A14537MqCEner[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCEner");
               GXutil.writeLogRaw("Old: ",Z14537MqCEner);
               GXutil.writeLogRaw("Current: ",T01W12_A14537MqCEner[0]);
            }
            if ( DecimalUtil.compareTo(Z14536MqCMoi, T01W12_A14536MqCMoi[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCMoi");
               GXutil.writeLogRaw("Old: ",Z14536MqCMoi);
               GXutil.writeLogRaw("Current: ",T01W12_A14536MqCMoi[0]);
            }
            if ( DecimalUtil.compareTo(Z14535MqCMod, T01W12_A14535MqCMod[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCMod");
               GXutil.writeLogRaw("Old: ",Z14535MqCMod);
               GXutil.writeLogRaw("Current: ",T01W12_A14535MqCMod[0]);
            }
            if ( DecimalUtil.compareTo(Z14534MqCMin, T01W12_A14534MqCMin[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCMin");
               GXutil.writeLogRaw("Old: ",Z14534MqCMin);
               GXutil.writeLogRaw("Current: ",T01W12_A14534MqCMin[0]);
            }
            if ( DecimalUtil.compareTo(Z14543MqCgi, T01W12_A14543MqCgi[0]) != 0 )
            {
               GXutil.writeLogln("costesbasicos.tmqcos:[seudo value changed for attri]"+"MqCgi");
               GXutil.writeLogRaw("Old: ",Z14543MqCgi);
               GXutil.writeLogRaw("Current: ",T01W12_A14543MqCgi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQCOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1W11913( )
   {
      beforeValidate1W11913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W11913( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1W11913( 0) ;
         checkOptimisticConcurrency1W11913( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W11913( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1W11913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W110 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes), Boolean.valueOf(n14541MqCAmo), A14541MqCAmo, Boolean.valueOf(n14540MqCAdCt), A14540MqCAdCt, Boolean.valueOf(n14539MqCAgua), A14539MqCAgua, Boolean.valueOf(n14538MqCGas), A14538MqCGas, Boolean.valueOf(n14537MqCEner), A14537MqCEner, Boolean.valueOf(n14536MqCMoi), A14536MqCMoi, Boolean.valueOf(n14535MqCMod), A14535MqCMod, Boolean.valueOf(n14534MqCMin), A14534MqCMin, Boolean.valueOf(n14543MqCgi), A14543MqCgi, A396EmprCod, A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
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
                        resetCaption1W10( ) ;
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
            load1W11913( ) ;
         }
         endLevel1W11913( ) ;
      }
      closeExtendedTableCursors1W11913( ) ;
   }

   public void update1W11913( )
   {
      beforeValidate1W11913( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1W11913( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W11913( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1W11913( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1W11913( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01W111 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n14541MqCAmo), A14541MqCAmo, Boolean.valueOf(n14540MqCAdCt), A14540MqCAdCt, Boolean.valueOf(n14539MqCAgua), A14539MqCAgua, Boolean.valueOf(n14538MqCGas), A14538MqCGas, Boolean.valueOf(n14537MqCEner), A14537MqCEner, Boolean.valueOf(n14536MqCMoi), A14536MqCMoi, Boolean.valueOf(n14535MqCMod), A14535MqCMod, Boolean.valueOf(n14534MqCMin), A14534MqCMin, Boolean.valueOf(n14543MqCgi), A14543MqCgi, A396EmprCod, A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQCOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1W11913( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1W10( ) ;
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
         endLevel1W11913( ) ;
      }
      closeExtendedTableCursors1W11913( ) ;
   }

   public void deferredUpdate1W11913( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1W11913( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1W11913( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1W11913( ) ;
         afterConfirm1W11913( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1W11913( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01W112 */
               pr_default.execute(10, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A14529MqCAnyo), Byte.valueOf(A14530MqCMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQCOS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1913 == 0 )
                     {
                        initAll1W11913( ) ;
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
                     resetCaption1W10( ) ;
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
      sMode1913 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1W11913( ) ;
      Gx_mode = sMode1913 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1W11913( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14542MqCTotal = A14540MqCAdCt.add(A14539MqCAgua).add(A14541MqCAmo).add(A14537MqCEner).add(A14538MqCGas).add(A14535MqCMod).add(A14536MqCMoi) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrimstr( A14542MqCTotal, 10, 4));
      }
   }

   public void endLevel1W11913( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1W11913( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "costesbasicos.tmqcos");
         if ( AnyError == 0 )
         {
            confirmValues1W10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "costesbasicos.tmqcos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1W11913( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A602MaqCod = A602MaqCod ;
      this.A606MaqDsc = A606MaqDsc ;
      /* Scan By routine */
      /* Using cursor T01W113 */
      pr_default.execute(11, new Object[] {A396EmprCod, A602MaqCod});
      RcdFound1913 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A14529MqCAnyo = T01W113_A14529MqCAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         A14530MqCMes = T01W113_A14530MqCMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1W11913( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1913 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1913 = (short)(1) ;
         A14529MqCAnyo = T01W113_A14529MqCAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
         A14530MqCMes = T01W113_A14530MqCMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
      }
   }

   public void scanEnd1W11913( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1W11913( )
   {
      /* After Confirm Rules */
      if ( (0==A14529MqCAnyo) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Año incorrecto", ""), 1, "MQCANYO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCAnyo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1W11913( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1W11913( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1W11913( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1W11913( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1W11913( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1W11913( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMqCAnyo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAnyo_Enabled), 5, 0), true);
      edtMqCMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMes_Enabled), 5, 0), true);
      edtMqCAmo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAmo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAmo_Enabled), 5, 0), true);
      edtMqCAdCt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAdCt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAdCt_Enabled), 5, 0), true);
      edtMqCAgua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCAgua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCAgua_Enabled), 5, 0), true);
      edtMqCGas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCGas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCGas_Enabled), 5, 0), true);
      edtMqCEner_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCEner_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCEner_Enabled), 5, 0), true);
      edtMqCMoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMoi_Enabled), 5, 0), true);
      edtMqCMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMod_Enabled), 5, 0), true);
      edtMqCMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCMin_Enabled), 5, 0), true);
      edtMqCgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCgi_Enabled), 5, 0), true);
      edtMqCTotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMqCTotal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMqCTotal_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1W11913( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1W10( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.costesbasicos.tmqcos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(A606MaqDsc))}, new String[] {"EmprCod","MaqCod","MaqDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14529MqCAnyo", GXutil.ltrim( localUtil.ntoc( Z14529MqCAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14530MqCMes", GXutil.ltrim( localUtil.ntoc( Z14530MqCMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14541MqCAmo", GXutil.ltrim( localUtil.ntoc( Z14541MqCAmo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14540MqCAdCt", GXutil.ltrim( localUtil.ntoc( Z14540MqCAdCt, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14539MqCAgua", GXutil.ltrim( localUtil.ntoc( Z14539MqCAgua, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14538MqCGas", GXutil.ltrim( localUtil.ntoc( Z14538MqCGas, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14537MqCEner", GXutil.ltrim( localUtil.ntoc( Z14537MqCEner, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14536MqCMoi", GXutil.ltrim( localUtil.ntoc( Z14536MqCMoi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14535MqCMod", GXutil.ltrim( localUtil.ntoc( Z14535MqCMod, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14534MqCMin", GXutil.ltrim( localUtil.ntoc( Z14534MqCMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14543MqCgi", GXutil.ltrim( localUtil.ntoc( Z14543MqCgi, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.costesbasicos.tmqcos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.rtrim(A606MaqDsc))}, new String[] {"EmprCod","MaqCod","MaqDsc"})  ;
   }

   public String getPgmname( )
   {
      return "CostesBasicos.TMQCOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Maquina por Año/Mes", "") ;
   }

   public void initializeNonKey1W11913( )
   {
      A14542MqCTotal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrimstr( A14542MqCTotal, 10, 4));
      A14541MqCAmo = DecimalUtil.ZERO ;
      n14541MqCAmo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrimstr( A14541MqCAmo, 10, 4));
      A14540MqCAdCt = DecimalUtil.ZERO ;
      n14540MqCAdCt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrimstr( A14540MqCAdCt, 10, 4));
      A14539MqCAgua = DecimalUtil.ZERO ;
      n14539MqCAgua = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrimstr( A14539MqCAgua, 10, 4));
      A14538MqCGas = DecimalUtil.ZERO ;
      n14538MqCGas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrimstr( A14538MqCGas, 10, 4));
      A14537MqCEner = DecimalUtil.ZERO ;
      n14537MqCEner = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrimstr( A14537MqCEner, 10, 4));
      A14536MqCMoi = DecimalUtil.ZERO ;
      n14536MqCMoi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrimstr( A14536MqCMoi, 10, 4));
      A14535MqCMod = DecimalUtil.ZERO ;
      n14535MqCMod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrimstr( A14535MqCMod, 10, 4));
      A14534MqCMin = DecimalUtil.ZERO ;
      n14534MqCMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrimstr( A14534MqCMin, 10, 4));
      A14543MqCgi = DecimalUtil.ZERO ;
      n14543MqCgi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrimstr( A14543MqCgi, 10, 4));
      Z14541MqCAmo = DecimalUtil.ZERO ;
      Z14540MqCAdCt = DecimalUtil.ZERO ;
      Z14539MqCAgua = DecimalUtil.ZERO ;
      Z14538MqCGas = DecimalUtil.ZERO ;
      Z14537MqCEner = DecimalUtil.ZERO ;
      Z14536MqCMoi = DecimalUtil.ZERO ;
      Z14535MqCMod = DecimalUtil.ZERO ;
      Z14534MqCMin = DecimalUtil.ZERO ;
      Z14543MqCgi = DecimalUtil.ZERO ;
   }

   public void initAll1W11913( )
   {
      A14529MqCAnyo = (short)(GXutil.year( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14529MqCAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14529MqCAnyo), 4, 0));
      A14530MqCMes = (byte)(GXutil.month( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14530MqCMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14530MqCMes), 2, 0));
      initializeNonKey1W11913( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124946", true, true);
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
      httpContext.AddJavascriptSource("costesbasicos/tmqcos.js", "?202682415124946", false, true);
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMqCAnyo_Internalname = "MQCANYO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMqCMes_Internalname = "MQCMES" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMqCAmo_Internalname = "MQCAMO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMqCAdCt_Internalname = "MQCADCT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMqCAgua_Internalname = "MQCAGUA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMqCGas_Internalname = "MQCGAS" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMqCEner_Internalname = "MQCENER" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtMqCMoi_Internalname = "MQCMOI" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtMqCMod_Internalname = "MQCMOD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtMqCMin_Internalname = "MQCMIN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtMqCgi_Internalname = "MQCGI" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtMqCTotal_Internalname = "MQCTOTAL" ;
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
      Form.setCaption( httpContext.getMessage( "Costes Maquina por Año/Mes", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMqCTotal_Jsonclick = "" ;
      edtMqCTotal_Backcolor = (int)(0xFFFFFF) ;
      edtMqCTotal_Enabled = 0 ;
      edtMqCgi_Jsonclick = "" ;
      edtMqCgi_Backcolor = (int)(0xFFFFFF) ;
      edtMqCgi_Enabled = 1 ;
      edtMqCMin_Jsonclick = "" ;
      edtMqCMin_Backcolor = (int)(0xFFFFFF) ;
      edtMqCMin_Enabled = 1 ;
      edtMqCMod_Jsonclick = "" ;
      edtMqCMod_Backcolor = (int)(0xFFFFFF) ;
      edtMqCMod_Enabled = 1 ;
      edtMqCMoi_Jsonclick = "" ;
      edtMqCMoi_Backcolor = (int)(0xFFFFFF) ;
      edtMqCMoi_Enabled = 1 ;
      edtMqCEner_Jsonclick = "" ;
      edtMqCEner_Backcolor = (int)(0xFFFFFF) ;
      edtMqCEner_Enabled = 1 ;
      edtMqCGas_Jsonclick = "" ;
      edtMqCGas_Backcolor = (int)(0xFFFFFF) ;
      edtMqCGas_Enabled = 1 ;
      edtMqCAgua_Jsonclick = "" ;
      edtMqCAgua_Backcolor = (int)(0xFFFFFF) ;
      edtMqCAgua_Enabled = 1 ;
      edtMqCAdCt_Jsonclick = "" ;
      edtMqCAdCt_Backcolor = (int)(0xFFFFFF) ;
      edtMqCAdCt_Enabled = 1 ;
      edtMqCAmo_Jsonclick = "" ;
      edtMqCAmo_Backcolor = (int)(0xFFFFFF) ;
      edtMqCAmo_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMqCMes_Jsonclick = "" ;
      edtMqCMes_Backcolor = (int)(0xFFFFFF) ;
      edtMqCMes_Enabled = 1 ;
      edtMqCAnyo_Jsonclick = "" ;
      edtMqCAnyo_Backcolor = (int)(0xFFFFFF) ;
      edtMqCAnyo_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 0 ;
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
      /* Using cursor T01W114 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01W114_A407EmprNom[0] ;
      n407EmprNom = T01W114_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T01W115 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
      }
      A606MaqDsc = T01W115_A606MaqDsc[0] ;
      n606MaqDsc = T01W115_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(13);
      GX_FocusControl = edtMqCAmo_Internalname ;
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

   public void valid_Mqcmes( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( ( A14530MqCMes < 1 ) || ( A14530MqCMes > 12 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Mes incorrecto", ""), 1, "MQCMES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMqCMes_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A14541MqCAmo", GXutil.ltrim( localUtil.ntoc( A14541MqCAmo, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14540MqCAdCt", GXutil.ltrim( localUtil.ntoc( A14540MqCAdCt, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14539MqCAgua", GXutil.ltrim( localUtil.ntoc( A14539MqCAgua, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14538MqCGas", GXutil.ltrim( localUtil.ntoc( A14538MqCGas, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14537MqCEner", GXutil.ltrim( localUtil.ntoc( A14537MqCEner, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14536MqCMoi", GXutil.ltrim( localUtil.ntoc( A14536MqCMoi, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14535MqCMod", GXutil.ltrim( localUtil.ntoc( A14535MqCMod, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14534MqCMin", GXutil.ltrim( localUtil.ntoc( A14534MqCMin, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14543MqCgi", GXutil.ltrim( localUtil.ntoc( A14543MqCgi, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14542MqCTotal", GXutil.ltrim( localUtil.ntoc( A14542MqCTotal, (byte)(10), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14529MqCAnyo", GXutil.ltrim( localUtil.ntoc( Z14529MqCAnyo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14530MqCMes", GXutil.ltrim( localUtil.ntoc( Z14530MqCMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14541MqCAmo", GXutil.ltrim( localUtil.ntoc( Z14541MqCAmo, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14540MqCAdCt", GXutil.ltrim( localUtil.ntoc( Z14540MqCAdCt, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14539MqCAgua", GXutil.ltrim( localUtil.ntoc( Z14539MqCAgua, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14538MqCGas", GXutil.ltrim( localUtil.ntoc( Z14538MqCGas, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14537MqCEner", GXutil.ltrim( localUtil.ntoc( Z14537MqCEner, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14536MqCMoi", GXutil.ltrim( localUtil.ntoc( Z14536MqCMoi, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14535MqCMod", GXutil.ltrim( localUtil.ntoc( Z14535MqCMod, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14534MqCMin", GXutil.ltrim( localUtil.ntoc( Z14534MqCMin, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14543MqCgi", GXutil.ltrim( localUtil.ntoc( Z14543MqCgi, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14542MqCTotal", GXutil.ltrim( localUtil.ntoc( Z14542MqCTotal, (byte)(10), (byte)(4), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MQCANYO","{handler:'valid_Mqcanyo',iparms:[]");
      setEventMetadata("VALID_MQCANYO",",oparms:[]}");
      setEventMetadata("VALID_MQCMES","{handler:'valid_Mqcmes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true},{av:'A14529MqCAnyo',fld:'MQCANYO',pic:'ZZZ9'},{av:'A14530MqCMes',fld:'MQCMES',pic:'Z9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MQCMES",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A14541MqCAmo',fld:'MQCAMO',pic:'ZZZZ9.9999'},{av:'A14540MqCAdCt',fld:'MQCADCT',pic:'ZZZZ9.9999'},{av:'A14539MqCAgua',fld:'MQCAGUA',pic:'ZZZZ9.9999'},{av:'A14538MqCGas',fld:'MQCGAS',pic:'ZZZZ9.9999'},{av:'A14537MqCEner',fld:'MQCENER',pic:'ZZZZ9.9999'},{av:'A14536MqCMoi',fld:'MQCMOI',pic:'ZZZZ9.9999'},{av:'A14535MqCMod',fld:'MQCMOD',pic:'ZZZZ9.9999'},{av:'A14534MqCMin',fld:'MQCMIN',pic:'ZZZZ9.9999'},{av:'A14543MqCgi',fld:'MQCGI',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A14542MqCTotal',fld:'MQCTOTAL',pic:'ZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z14529MqCAnyo'},{av:'Z14530MqCMes'},{av:'Z407EmprNom'},{av:'Z14541MqCAmo'},{av:'Z14540MqCAdCt'},{av:'Z14539MqCAgua'},{av:'Z14538MqCGas'},{av:'Z14537MqCEner'},{av:'Z14536MqCMoi'},{av:'Z14535MqCMod'},{av:'Z14534MqCMin'},{av:'Z14543MqCgi'},{av:'Z606MaqDsc'},{av:'Z14542MqCTotal'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MQCAMO","{handler:'valid_Mqcamo',iparms:[]");
      setEventMetadata("VALID_MQCAMO",",oparms:[]}");
      setEventMetadata("VALID_MQCADCT","{handler:'valid_Mqcadct',iparms:[]");
      setEventMetadata("VALID_MQCADCT",",oparms:[]}");
      setEventMetadata("VALID_MQCAGUA","{handler:'valid_Mqcagua',iparms:[]");
      setEventMetadata("VALID_MQCAGUA",",oparms:[]}");
      setEventMetadata("VALID_MQCGAS","{handler:'valid_Mqcgas',iparms:[]");
      setEventMetadata("VALID_MQCGAS",",oparms:[]}");
      setEventMetadata("VALID_MQCENER","{handler:'valid_Mqcener',iparms:[]");
      setEventMetadata("VALID_MQCENER",",oparms:[]}");
      setEventMetadata("VALID_MQCMOI","{handler:'valid_Mqcmoi',iparms:[]");
      setEventMetadata("VALID_MQCMOI",",oparms:[]}");
      setEventMetadata("VALID_MQCMOD","{handler:'valid_Mqcmod',iparms:[]");
      setEventMetadata("VALID_MQCMOD",",oparms:[]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA602MaqCod = "" ;
      wcpOA606MaqDsc = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z14541MqCAmo = DecimalUtil.ZERO ;
      Z14540MqCAdCt = DecimalUtil.ZERO ;
      Z14539MqCAgua = DecimalUtil.ZERO ;
      Z14538MqCGas = DecimalUtil.ZERO ;
      Z14537MqCEner = DecimalUtil.ZERO ;
      Z14536MqCMoi = DecimalUtil.ZERO ;
      Z14535MqCMod = DecimalUtil.ZERO ;
      Z14534MqCMin = DecimalUtil.ZERO ;
      Z14543MqCgi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A14541MqCAmo = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A14540MqCAdCt = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A14539MqCAgua = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A14538MqCGas = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A14537MqCEner = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A14536MqCMoi = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A14535MqCMod = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A14534MqCMin = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A14543MqCgi = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A14542MqCTotal = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      Gx_date = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z606MaqDsc = "" ;
      T01W14_A407EmprNom = new String[] {""} ;
      T01W14_n407EmprNom = new boolean[] {false} ;
      T01W15_A606MaqDsc = new String[] {""} ;
      T01W15_n606MaqDsc = new boolean[] {false} ;
      T01W16_A606MaqDsc = new String[] {""} ;
      T01W16_n606MaqDsc = new boolean[] {false} ;
      T01W16_A14529MqCAnyo = new short[1] ;
      T01W16_A14530MqCMes = new byte[1] ;
      T01W16_A407EmprNom = new String[] {""} ;
      T01W16_n407EmprNom = new boolean[] {false} ;
      T01W16_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14541MqCAmo = new boolean[] {false} ;
      T01W16_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14540MqCAdCt = new boolean[] {false} ;
      T01W16_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14539MqCAgua = new boolean[] {false} ;
      T01W16_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14538MqCGas = new boolean[] {false} ;
      T01W16_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14537MqCEner = new boolean[] {false} ;
      T01W16_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14536MqCMoi = new boolean[] {false} ;
      T01W16_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14535MqCMod = new boolean[] {false} ;
      T01W16_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14534MqCMin = new boolean[] {false} ;
      T01W16_A14543MqCgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W16_n14543MqCgi = new boolean[] {false} ;
      T01W16_A396EmprCod = new String[] {""} ;
      T01W16_A602MaqCod = new String[] {""} ;
      T01W17_A396EmprCod = new String[] {""} ;
      T01W17_A602MaqCod = new String[] {""} ;
      T01W17_A14529MqCAnyo = new short[1] ;
      T01W17_A14530MqCMes = new byte[1] ;
      T01W13_A14529MqCAnyo = new short[1] ;
      T01W13_A14530MqCMes = new byte[1] ;
      T01W13_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14541MqCAmo = new boolean[] {false} ;
      T01W13_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14540MqCAdCt = new boolean[] {false} ;
      T01W13_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14539MqCAgua = new boolean[] {false} ;
      T01W13_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14538MqCGas = new boolean[] {false} ;
      T01W13_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14537MqCEner = new boolean[] {false} ;
      T01W13_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14536MqCMoi = new boolean[] {false} ;
      T01W13_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14535MqCMod = new boolean[] {false} ;
      T01W13_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14534MqCMin = new boolean[] {false} ;
      T01W13_A14543MqCgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W13_n14543MqCgi = new boolean[] {false} ;
      T01W13_A396EmprCod = new String[] {""} ;
      T01W13_A602MaqCod = new String[] {""} ;
      sMode1913 = "" ;
      T01W18_A14529MqCAnyo = new short[1] ;
      T01W18_A14530MqCMes = new byte[1] ;
      T01W18_A396EmprCod = new String[] {""} ;
      T01W18_A602MaqCod = new String[] {""} ;
      T01W19_A14529MqCAnyo = new short[1] ;
      T01W19_A14530MqCMes = new byte[1] ;
      T01W19_A396EmprCod = new String[] {""} ;
      T01W19_A602MaqCod = new String[] {""} ;
      T01W12_A14529MqCAnyo = new short[1] ;
      T01W12_A14530MqCMes = new byte[1] ;
      T01W12_A14541MqCAmo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14541MqCAmo = new boolean[] {false} ;
      T01W12_A14540MqCAdCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14540MqCAdCt = new boolean[] {false} ;
      T01W12_A14539MqCAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14539MqCAgua = new boolean[] {false} ;
      T01W12_A14538MqCGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14538MqCGas = new boolean[] {false} ;
      T01W12_A14537MqCEner = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14537MqCEner = new boolean[] {false} ;
      T01W12_A14536MqCMoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14536MqCMoi = new boolean[] {false} ;
      T01W12_A14535MqCMod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14535MqCMod = new boolean[] {false} ;
      T01W12_A14534MqCMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14534MqCMin = new boolean[] {false} ;
      T01W12_A14543MqCgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01W12_n14543MqCgi = new boolean[] {false} ;
      T01W12_A396EmprCod = new String[] {""} ;
      T01W12_A602MaqCod = new String[] {""} ;
      T01W113_A396EmprCod = new String[] {""} ;
      T01W113_A602MaqCod = new String[] {""} ;
      T01W113_A14529MqCAnyo = new short[1] ;
      T01W113_A14530MqCMes = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01W114_A407EmprNom = new String[] {""} ;
      T01W114_n407EmprNom = new boolean[] {false} ;
      T01W115_A606MaqDsc = new String[] {""} ;
      T01W115_n606MaqDsc = new boolean[] {false} ;
      Z14542MqCTotal = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ14541MqCAmo = DecimalUtil.ZERO ;
      ZZ14540MqCAdCt = DecimalUtil.ZERO ;
      ZZ14539MqCAgua = DecimalUtil.ZERO ;
      ZZ14538MqCGas = DecimalUtil.ZERO ;
      ZZ14537MqCEner = DecimalUtil.ZERO ;
      ZZ14536MqCMoi = DecimalUtil.ZERO ;
      ZZ14535MqCMod = DecimalUtil.ZERO ;
      ZZ14534MqCMin = DecimalUtil.ZERO ;
      ZZ14543MqCgi = DecimalUtil.ZERO ;
      ZZ606MaqDsc = "" ;
      ZZ14542MqCTotal = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmqcos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmqcos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmqcos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmqcos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.tmqcos__default(),
         new Object[] {
             new Object[] {
            T01W12_A14529MqCAnyo, T01W12_A14530MqCMes, T01W12_A14541MqCAmo, T01W12_n14541MqCAmo, T01W12_A14540MqCAdCt, T01W12_n14540MqCAdCt, T01W12_A14539MqCAgua, T01W12_n14539MqCAgua, T01W12_A14538MqCGas, T01W12_n14538MqCGas,
            T01W12_A14537MqCEner, T01W12_n14537MqCEner, T01W12_A14536MqCMoi, T01W12_n14536MqCMoi, T01W12_A14535MqCMod, T01W12_n14535MqCMod, T01W12_A14534MqCMin, T01W12_n14534MqCMin, T01W12_A14543MqCgi, T01W12_n14543MqCgi,
            T01W12_A396EmprCod, T01W12_A602MaqCod
            }
            , new Object[] {
            T01W13_A14529MqCAnyo, T01W13_A14530MqCMes, T01W13_A14541MqCAmo, T01W13_n14541MqCAmo, T01W13_A14540MqCAdCt, T01W13_n14540MqCAdCt, T01W13_A14539MqCAgua, T01W13_n14539MqCAgua, T01W13_A14538MqCGas, T01W13_n14538MqCGas,
            T01W13_A14537MqCEner, T01W13_n14537MqCEner, T01W13_A14536MqCMoi, T01W13_n14536MqCMoi, T01W13_A14535MqCMod, T01W13_n14535MqCMod, T01W13_A14534MqCMin, T01W13_n14534MqCMin, T01W13_A14543MqCgi, T01W13_n14543MqCgi,
            T01W13_A396EmprCod, T01W13_A602MaqCod
            }
            , new Object[] {
            T01W14_A407EmprNom, T01W14_n407EmprNom
            }
            , new Object[] {
            T01W15_A606MaqDsc, T01W15_n606MaqDsc
            }
            , new Object[] {
            T01W16_A606MaqDsc, T01W16_n606MaqDsc, T01W16_A14529MqCAnyo, T01W16_A14530MqCMes, T01W16_A407EmprNom, T01W16_n407EmprNom, T01W16_A14541MqCAmo, T01W16_n14541MqCAmo, T01W16_A14540MqCAdCt, T01W16_n14540MqCAdCt,
            T01W16_A14539MqCAgua, T01W16_n14539MqCAgua, T01W16_A14538MqCGas, T01W16_n14538MqCGas, T01W16_A14537MqCEner, T01W16_n14537MqCEner, T01W16_A14536MqCMoi, T01W16_n14536MqCMoi, T01W16_A14535MqCMod, T01W16_n14535MqCMod,
            T01W16_A14534MqCMin, T01W16_n14534MqCMin, T01W16_A14543MqCgi, T01W16_n14543MqCgi, T01W16_A396EmprCod, T01W16_A602MaqCod
            }
            , new Object[] {
            T01W17_A396EmprCod, T01W17_A602MaqCod, T01W17_A14529MqCAnyo, T01W17_A14530MqCMes
            }
            , new Object[] {
            T01W18_A14529MqCAnyo, T01W18_A14530MqCMes, T01W18_A396EmprCod, T01W18_A602MaqCod
            }
            , new Object[] {
            T01W19_A14529MqCAnyo, T01W19_A14530MqCMes, T01W19_A396EmprCod, T01W19_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01W113_A396EmprCod, T01W113_A602MaqCod, T01W113_A14529MqCAnyo, T01W113_A14530MqCMes
            }
            , new Object[] {
            T01W114_A407EmprNom, T01W114_n407EmprNom
            }
            , new Object[] {
            T01W115_A606MaqDsc, T01W115_n606MaqDsc
            }
         }
      );
      Z606MaqDsc = "" ;
      n606MaqDsc = false ;
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      Z602MaqCod = "" ;
      A602MaqCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z14530MqCMes = (byte)(0) ;
      A14530MqCMes = (byte)(0) ;
      Z14529MqCAnyo = (short)(0) ;
      A14529MqCAnyo = (short)(0) ;
      Gx_date = GXutil.today( ) ;
   }

   private byte Z14530MqCMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A14530MqCMes ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ14530MqCMes ;
   private short Z14529MqCAnyo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14529MqCAnyo ;
   private short RcdFound1913 ;
   private short nIsDirty_1913 ;
   private short ZZ14529MqCAnyo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMqCAnyo_Enabled ;
   private int edtMqCMes_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMqCAmo_Enabled ;
   private int edtMqCAdCt_Enabled ;
   private int edtMqCAgua_Enabled ;
   private int edtMqCGas_Enabled ;
   private int edtMqCEner_Enabled ;
   private int edtMqCMoi_Enabled ;
   private int edtMqCMod_Enabled ;
   private int edtMqCMin_Enabled ;
   private int edtMqCgi_Enabled ;
   private int edtMqCTotal_Enabled ;
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
   private int edtMqCTotal_Backcolor ;
   private int edtMqCgi_Backcolor ;
   private int edtMqCMin_Backcolor ;
   private int edtMqCMod_Backcolor ;
   private int edtMqCMoi_Backcolor ;
   private int edtMqCEner_Backcolor ;
   private int edtMqCGas_Backcolor ;
   private int edtMqCAgua_Backcolor ;
   private int edtMqCAdCt_Backcolor ;
   private int edtMqCAmo_Backcolor ;
   private int edtMqCMes_Backcolor ;
   private int edtMqCAnyo_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z14541MqCAmo ;
   private java.math.BigDecimal Z14540MqCAdCt ;
   private java.math.BigDecimal Z14539MqCAgua ;
   private java.math.BigDecimal Z14538MqCGas ;
   private java.math.BigDecimal Z14537MqCEner ;
   private java.math.BigDecimal Z14536MqCMoi ;
   private java.math.BigDecimal Z14535MqCMod ;
   private java.math.BigDecimal Z14534MqCMin ;
   private java.math.BigDecimal Z14543MqCgi ;
   private java.math.BigDecimal A14541MqCAmo ;
   private java.math.BigDecimal A14540MqCAdCt ;
   private java.math.BigDecimal A14539MqCAgua ;
   private java.math.BigDecimal A14538MqCGas ;
   private java.math.BigDecimal A14537MqCEner ;
   private java.math.BigDecimal A14536MqCMoi ;
   private java.math.BigDecimal A14535MqCMod ;
   private java.math.BigDecimal A14534MqCMin ;
   private java.math.BigDecimal A14543MqCgi ;
   private java.math.BigDecimal A14542MqCTotal ;
   private java.math.BigDecimal Z14542MqCTotal ;
   private java.math.BigDecimal ZZ14541MqCAmo ;
   private java.math.BigDecimal ZZ14540MqCAdCt ;
   private java.math.BigDecimal ZZ14539MqCAgua ;
   private java.math.BigDecimal ZZ14538MqCGas ;
   private java.math.BigDecimal ZZ14537MqCEner ;
   private java.math.BigDecimal ZZ14536MqCMoi ;
   private java.math.BigDecimal ZZ14535MqCMod ;
   private java.math.BigDecimal ZZ14534MqCMin ;
   private java.math.BigDecimal ZZ14543MqCgi ;
   private java.math.BigDecimal ZZ14542MqCTotal ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA602MaqCod ;
   private String wcpOA606MaqDsc ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMqCAnyo_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMqCAnyo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMqCMes_Internalname ;
   private String edtMqCMes_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMqCAmo_Internalname ;
   private String edtMqCAmo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMqCAdCt_Internalname ;
   private String edtMqCAdCt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMqCAgua_Internalname ;
   private String edtMqCAgua_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMqCGas_Internalname ;
   private String edtMqCGas_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMqCEner_Internalname ;
   private String edtMqCEner_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtMqCMoi_Internalname ;
   private String edtMqCMoi_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtMqCMod_Internalname ;
   private String edtMqCMod_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtMqCMin_Internalname ;
   private String edtMqCMin_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtMqCgi_Internalname ;
   private String edtMqCgi_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtMqCTotal_Internalname ;
   private String edtMqCTotal_Jsonclick ;
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
   private String Z606MaqDsc ;
   private String sMode1913 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n606MaqDsc ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n14541MqCAmo ;
   private boolean n14540MqCAdCt ;
   private boolean n14539MqCAgua ;
   private boolean n14538MqCGas ;
   private boolean n14537MqCEner ;
   private boolean n14536MqCMoi ;
   private boolean n14535MqCMod ;
   private boolean n14534MqCMin ;
   private boolean n14543MqCgi ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01W14_A407EmprNom ;
   private boolean[] T01W14_n407EmprNom ;
   private String[] T01W15_A606MaqDsc ;
   private boolean[] T01W15_n606MaqDsc ;
   private String[] T01W16_A606MaqDsc ;
   private boolean[] T01W16_n606MaqDsc ;
   private short[] T01W16_A14529MqCAnyo ;
   private byte[] T01W16_A14530MqCMes ;
   private String[] T01W16_A407EmprNom ;
   private boolean[] T01W16_n407EmprNom ;
   private java.math.BigDecimal[] T01W16_A14541MqCAmo ;
   private boolean[] T01W16_n14541MqCAmo ;
   private java.math.BigDecimal[] T01W16_A14540MqCAdCt ;
   private boolean[] T01W16_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W16_A14539MqCAgua ;
   private boolean[] T01W16_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W16_A14538MqCGas ;
   private boolean[] T01W16_n14538MqCGas ;
   private java.math.BigDecimal[] T01W16_A14537MqCEner ;
   private boolean[] T01W16_n14537MqCEner ;
   private java.math.BigDecimal[] T01W16_A14536MqCMoi ;
   private boolean[] T01W16_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W16_A14535MqCMod ;
   private boolean[] T01W16_n14535MqCMod ;
   private java.math.BigDecimal[] T01W16_A14534MqCMin ;
   private boolean[] T01W16_n14534MqCMin ;
   private java.math.BigDecimal[] T01W16_A14543MqCgi ;
   private boolean[] T01W16_n14543MqCgi ;
   private String[] T01W16_A396EmprCod ;
   private String[] T01W16_A602MaqCod ;
   private String[] T01W17_A396EmprCod ;
   private String[] T01W17_A602MaqCod ;
   private short[] T01W17_A14529MqCAnyo ;
   private byte[] T01W17_A14530MqCMes ;
   private short[] T01W13_A14529MqCAnyo ;
   private byte[] T01W13_A14530MqCMes ;
   private java.math.BigDecimal[] T01W13_A14541MqCAmo ;
   private boolean[] T01W13_n14541MqCAmo ;
   private java.math.BigDecimal[] T01W13_A14540MqCAdCt ;
   private boolean[] T01W13_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W13_A14539MqCAgua ;
   private boolean[] T01W13_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W13_A14538MqCGas ;
   private boolean[] T01W13_n14538MqCGas ;
   private java.math.BigDecimal[] T01W13_A14537MqCEner ;
   private boolean[] T01W13_n14537MqCEner ;
   private java.math.BigDecimal[] T01W13_A14536MqCMoi ;
   private boolean[] T01W13_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W13_A14535MqCMod ;
   private boolean[] T01W13_n14535MqCMod ;
   private java.math.BigDecimal[] T01W13_A14534MqCMin ;
   private boolean[] T01W13_n14534MqCMin ;
   private java.math.BigDecimal[] T01W13_A14543MqCgi ;
   private boolean[] T01W13_n14543MqCgi ;
   private String[] T01W13_A396EmprCod ;
   private String[] T01W13_A602MaqCod ;
   private short[] T01W18_A14529MqCAnyo ;
   private byte[] T01W18_A14530MqCMes ;
   private String[] T01W18_A396EmprCod ;
   private String[] T01W18_A602MaqCod ;
   private short[] T01W19_A14529MqCAnyo ;
   private byte[] T01W19_A14530MqCMes ;
   private String[] T01W19_A396EmprCod ;
   private String[] T01W19_A602MaqCod ;
   private short[] T01W12_A14529MqCAnyo ;
   private byte[] T01W12_A14530MqCMes ;
   private java.math.BigDecimal[] T01W12_A14541MqCAmo ;
   private boolean[] T01W12_n14541MqCAmo ;
   private java.math.BigDecimal[] T01W12_A14540MqCAdCt ;
   private boolean[] T01W12_n14540MqCAdCt ;
   private java.math.BigDecimal[] T01W12_A14539MqCAgua ;
   private boolean[] T01W12_n14539MqCAgua ;
   private java.math.BigDecimal[] T01W12_A14538MqCGas ;
   private boolean[] T01W12_n14538MqCGas ;
   private java.math.BigDecimal[] T01W12_A14537MqCEner ;
   private boolean[] T01W12_n14537MqCEner ;
   private java.math.BigDecimal[] T01W12_A14536MqCMoi ;
   private boolean[] T01W12_n14536MqCMoi ;
   private java.math.BigDecimal[] T01W12_A14535MqCMod ;
   private boolean[] T01W12_n14535MqCMod ;
   private java.math.BigDecimal[] T01W12_A14534MqCMin ;
   private boolean[] T01W12_n14534MqCMin ;
   private java.math.BigDecimal[] T01W12_A14543MqCgi ;
   private boolean[] T01W12_n14543MqCgi ;
   private String[] T01W12_A396EmprCod ;
   private String[] T01W12_A602MaqCod ;
   private String[] T01W113_A396EmprCod ;
   private String[] T01W113_A602MaqCod ;
   private short[] T01W113_A14529MqCAnyo ;
   private byte[] T01W113_A14530MqCMes ;
   private String[] T01W114_A407EmprNom ;
   private boolean[] T01W114_n407EmprNom ;
   private String[] T01W115_A606MaqDsc ;
   private boolean[] T01W115_n606MaqDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmqcos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqcos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqcos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqcos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmqcos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01W12", "SELECT MqCAnyo, MqCMes, MqCAmo, MqCAdCt, MqCAgua, MqCGas, MqCEner, MqCMoi, MqCMod, MqCMin, MqCgi, EmprCod, MaqCod FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?  FOR UPDATE OF MqCAmo, MqCAdCt, MqCAgua, MqCGas, MqCEner, MqCMoi, MqCMod, MqCMin, MqCgi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W13", "SELECT MqCAnyo, MqCMes, MqCAmo, MqCAdCt, MqCAgua, MqCGas, MqCEner, MqCMoi, MqCMod, MqCMin, MqCgi, EmprCod, MaqCod FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W15", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W16", "SELECT /*+ FIRST_ROWS(100) */ T3.MaqDsc, TM1.MqCAnyo, TM1.MqCMes, T2.EmprNom, TM1.MqCAmo, TM1.MqCAdCt, TM1.MqCAgua, TM1.MqCGas, TM1.MqCEner, TM1.MqCMoi, TM1.MqCMod, TM1.MqCMin, TM1.MqCgi, TM1.EmprCod, TM1.MaqCod FROM ((TXPMAQCOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MaqCod) WHERE TM1.MqCAnyo = ? and TM1.MqCMes = ? and TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.MqCAnyo, TM1.MqCMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MqCAnyo, MqCMes, EmprCod, MaqCod FROM TXPMAQCOS WHERE ( MqCAnyo > ? or MqCAnyo = ? and MqCMes > ?) and EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01W19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MqCAnyo, MqCMes, EmprCod, MaqCod FROM TXPMAQCOS WHERE ( MqCAnyo < ? or MqCAnyo = ? and MqCMes < ?) and EmprCod = ? and MaqCod = ? ORDER BY EmprCod DESC, MaqCod DESC, MqCAnyo DESC, MqCMes DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01W110", "INSERT INTO TXPMAQCOS(MqCAnyo, MqCMes, MqCAmo, MqCAdCt, MqCAgua, MqCGas, MqCEner, MqCMoi, MqCMod, MqCMin, MqCgi, EmprCod, MaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQCOS")
         ,new UpdateCursor("T01W111", "UPDATE TXPMAQCOS SET MqCAmo=?, MqCAdCt=?, MqCAgua=?, MqCGas=?, MqCEner=?, MqCMoi=?, MqCMod=?, MqCMin=?, MqCgi=?  WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?", GX_NOMASK, "TXPMAQCOS")
         ,new UpdateCursor("T01W112", "DELETE FROM TXPMAQCOS  WHERE EmprCod = ? AND MaqCod = ? AND MqCAnyo = ? AND MqCMes = ?", GX_NOMASK, "TXPMAQCOS")
         ,new ForEachCursor("T01W113", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MqCAnyo, MqCMes ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W114", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01W115", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((String[]) buf[21])[0] = rslt.getString(13, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               ((String[]) buf[25])[0] = rslt.getString(15, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 4);
               }
               stmt.setString(12, (String)parms[20], 3);
               stmt.setString(13, (String)parms[21], 6);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 4);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setString(11, (String)parms[19], 6);
               stmt.setShort(12, ((Number) parms[20]).shortValue());
               stmt.setByte(13, ((Number) parms[21]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

