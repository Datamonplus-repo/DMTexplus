package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thccstks_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
         n3345TipMovCc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A3345TipMovCc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A3839CcoCod = (short)(GXutil.lval( httpContext.GetPar( "CcoCod"))) ;
         n3839CcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A3839CcoCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO MOV PRODUCTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public thccstks_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thccstks_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thccstks_impl.class ));
   }

   public thccstks_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THCCSTKS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stklin_Internalname, GXutil.ltrim( localUtil.ntoc( A11329H_stklin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stklin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11329H_stklin), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11329H_stklin), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stklin_Jsonclick, 0, "", "", "", "", "", 1, edtH_stklin_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cant Entrada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A11330H_stkEnt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkEnt_Enabled!=0) ? localUtil.format( A11330H_stkEnt, "ZZZZZZ9.9999") : localUtil.format( A11330H_stkEnt, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkEnt_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkEnt_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cant Salida", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkSal_Internalname, GXutil.ltrim( localUtil.ntoc( A11331H_stkSal, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkSal_Enabled!=0) ? localUtil.format( A11331H_stkSal, "ZZZZZZ9.9999") : localUtil.format( A11331H_stkSal, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkSal_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkSal_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Codigo Tipo Movimiento", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc), GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCc_Jsonclick, 0, "", "", "", "", "", 1, edtTipMovCc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Tipo Movimiento", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn), GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCn_Jsonclick, 0, "", "", "", "", "", 1, edtTipMovCn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripcion Mov", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkDsc_Internalname, GXutil.rtrim( A11332H_stkDsc), GXutil.rtrim( localUtil.format( A11332H_stkDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkDsc_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkpp_Internalname, GXutil.rtrim( A11333H_stkpp), GXutil.rtrim( localUtil.format( A11333H_stkpp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkpp_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkpp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fecha Mov", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_stkFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkFec_Internalname, localUtil.format(A11334H_stkFec, "99/99/99"), localUtil.format( A11334H_stkFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkFec_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_stkFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_stkFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THCCSTKS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Hora Mov", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkhor_Internalname, GXutil.rtrim( A11335H_stkhor), GXutil.rtrim( localUtil.format( A11335H_stkhor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkhor_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkhor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkUsu_Internalname, GXutil.rtrim( A11336H_stkUsu), GXutil.rtrim( localUtil.format( A11336H_stkUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkUsu_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Precio", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkPre_Internalname, GXutil.ltrim( localUtil.ntoc( A11337H_stkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkPre_Enabled!=0) ? localUtil.format( A11337H_stkPre, "ZZZZZZZ9.99999") : localUtil.format( A11337H_stkPre, "ZZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkPre_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkPed_Internalname, GXutil.ltrim( localUtil.ntoc( A11338H_stkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkPed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11338H_stkPed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11338H_stkPed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkPed_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkPed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Albaran compra", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkAlb_Internalname, GXutil.rtrim( A11339H_stkAlb), GXutil.rtrim( localUtil.format( A11339H_stkAlb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkAlb_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkAlb_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "CcoCod", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCcoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCcoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCcoCod_Jsonclick, 0, "", "", "", "", "", 1, edtCcoCod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stklot_Internalname, GXutil.rtrim( A11340H_stklot), GXutil.rtrim( localUtil.format( A11340H_stklot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stklot_Jsonclick, 0, "", "", "", "", "", 1, edtH_stklot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Exportado", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkexp_Internalname, GXutil.ltrim( localUtil.ntoc( A11341H_stkexp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkexp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11341H_stkexp), "9") : localUtil.format( DecimalUtil.doubleToDec(A11341H_stkexp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkexp_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkexp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Fecha Exportacion", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtH_stkfexp_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkfexp_Internalname, localUtil.format(A11342H_stkfexp, "99/99/99"), localUtil.format( A11342H_stkfexp, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkfexp_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkfexp_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtH_stkfexp_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtH_stkfexp_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THCCSTKS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkprv_Internalname, GXutil.ltrim( localUtil.ntoc( A11343H_stkprv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkprv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11343H_stkprv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11343H_stkprv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkprv_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkprv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkhdr_Internalname, GXutil.ltrim( localUtil.ntoc( A11344H_stkhdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkhdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11344H_stkhdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11344H_stkhdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkhdr_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkhdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkr_Internalname, GXutil.ltrim( localUtil.ntoc( A11345H_stkr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stkr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11345H_stkr), "9") : localUtil.format( DecimalUtil.doubleToDec(A11345H_stkr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkr_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stkp_Internalname, GXutil.rtrim( A11346H_stkp), GXutil.rtrim( localUtil.format( A11346H_stkp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stkp_Jsonclick, 0, "", "", "", "", "", 1, edtH_stkp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Linea Entrada almacen", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_stklen_Internalname, GXutil.ltrim( localUtil.ntoc( A11348H_stklen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_stklen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11348H_stklen), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11348H_stklen), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_stklen_Jsonclick, 0, "", "", "", "", "", 1, edtH_stklen_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THCCSTKS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THCCSTKS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THCCSTKS.htm");
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
      e111BQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z11329H_stklin = localUtil.ctol( httpContext.cgiGet( "Z11329H_stklin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11330H_stkEnt = localUtil.ctond( httpContext.cgiGet( "Z11330H_stkEnt")) ;
            Z11331H_stkSal = localUtil.ctond( httpContext.cgiGet( "Z11331H_stkSal")) ;
            Z11332H_stkDsc = httpContext.cgiGet( "Z11332H_stkDsc") ;
            Z11333H_stkpp = httpContext.cgiGet( "Z11333H_stkpp") ;
            Z11334H_stkFec = localUtil.ctod( httpContext.cgiGet( "Z11334H_stkFec"), 0) ;
            Z11335H_stkhor = httpContext.cgiGet( "Z11335H_stkhor") ;
            Z11336H_stkUsu = httpContext.cgiGet( "Z11336H_stkUsu") ;
            Z11337H_stkPre = localUtil.ctond( httpContext.cgiGet( "Z11337H_stkPre")) ;
            Z11338H_stkPed = (int)(localUtil.ctol( httpContext.cgiGet( "Z11338H_stkPed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11339H_stkAlb = httpContext.cgiGet( "Z11339H_stkAlb") ;
            Z11340H_stklot = httpContext.cgiGet( "Z11340H_stklot") ;
            Z11341H_stkexp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11341H_stkexp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11342H_stkfexp = localUtil.ctod( httpContext.cgiGet( "Z11342H_stkfexp"), 0) ;
            Z11343H_stkprv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11343H_stkprv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11344H_stkhdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z11344H_stkhdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11345H_stkr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11345H_stkr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11346H_stkp = httpContext.cgiGet( "Z11346H_stkp") ;
            Z11348H_stklen = (short)(localUtil.ctol( httpContext.cgiGet( "Z11348H_stklen"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3345TipMovCc = httpContext.cgiGet( "Z3345TipMovCc") ;
            Z3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3839CcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stklin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11329H_stklin = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
            }
            else
            {
               A11329H_stklin = localUtil.ctol( httpContext.cgiGet( edtH_stklin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_stkEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_stkEnt_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11330H_stkEnt = DecimalUtil.ZERO ;
               n11330H_stkEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrimstr( A11330H_stkEnt, 12, 4));
            }
            else
            {
               A11330H_stkEnt = localUtil.ctond( httpContext.cgiGet( edtH_stkEnt_Internalname)) ;
               n11330H_stkEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrimstr( A11330H_stkEnt, 12, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_stkSal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_stkSal_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11331H_stkSal = DecimalUtil.ZERO ;
               n11331H_stkSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrimstr( A11331H_stkSal, 12, 4));
            }
            else
            {
               A11331H_stkSal = localUtil.ctond( httpContext.cgiGet( edtH_stkSal_Internalname)) ;
               n11331H_stkSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrimstr( A11331H_stkSal, 12, 4));
            }
            A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
            n3345TipMovCc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
            A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
            n3346TipMovCn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
            A11332H_stkDsc = httpContext.cgiGet( edtH_stkDsc_Internalname) ;
            n11332H_stkDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11332H_stkDsc", A11332H_stkDsc);
            A11333H_stkpp = httpContext.cgiGet( edtH_stkpp_Internalname) ;
            n11333H_stkpp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11333H_stkpp", A11333H_stkpp);
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_stkFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_STKFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11334H_stkFec = GXutil.nullDate() ;
               n11334H_stkFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
            }
            else
            {
               A11334H_stkFec = localUtil.ctod( httpContext.cgiGet( edtH_stkFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11334H_stkFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
            }
            A11335H_stkhor = httpContext.cgiGet( edtH_stkhor_Internalname) ;
            n11335H_stkhor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11335H_stkhor", A11335H_stkhor);
            A11336H_stkUsu = httpContext.cgiGet( edtH_stkUsu_Internalname) ;
            n11336H_stkUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11336H_stkUsu", A11336H_stkUsu);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtH_stkPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtH_stkPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKPRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkPre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11337H_stkPre = DecimalUtil.ZERO ;
               n11337H_stkPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrimstr( A11337H_stkPre, 14, 5));
            }
            else
            {
               A11337H_stkPre = localUtil.ctond( httpContext.cgiGet( edtH_stkPre_Internalname)) ;
               n11337H_stkPre = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrimstr( A11337H_stkPre, 14, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKPED");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkPed_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11338H_stkPed = 0 ;
               n11338H_stkPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11338H_stkPed), 8, 0));
            }
            else
            {
               A11338H_stkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtH_stkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11338H_stkPed = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11338H_stkPed), 8, 0));
            }
            A11339H_stkAlb = httpContext.cgiGet( edtH_stkAlb_Internalname) ;
            n11339H_stkAlb = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11339H_stkAlb", A11339H_stkAlb);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCOCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCcoCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3839CcoCod = (short)(0) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            else
            {
               A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3839CcoCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
            }
            A11340H_stklot = httpContext.cgiGet( edtH_stklot_Internalname) ;
            n11340H_stklot = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11340H_stklot", A11340H_stklot);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkexp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkexp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKEXP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkexp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11341H_stkexp = (byte)(0) ;
               n11341H_stkexp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.str( A11341H_stkexp, 1, 0));
            }
            else
            {
               A11341H_stkexp = (byte)(localUtil.ctol( httpContext.cgiGet( edtH_stkexp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11341H_stkexp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.str( A11341H_stkexp, 1, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtH_stkfexp_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "H_STKFEXP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkfexp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11342H_stkfexp = GXutil.nullDate() ;
               n11342H_stkfexp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
            }
            else
            {
               A11342H_stkfexp = localUtil.ctod( httpContext.cgiGet( edtH_stkfexp_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11342H_stkfexp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkprv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkprv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKPRV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkprv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11343H_stkprv = 0 ;
               n11343H_stkprv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11343H_stkprv), 6, 0));
            }
            else
            {
               A11343H_stkprv = (int)(localUtil.ctol( httpContext.cgiGet( edtH_stkprv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11343H_stkprv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11343H_stkprv), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkhdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkhdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKHDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkhdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11344H_stkhdr = 0 ;
               n11344H_stkhdr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11344H_stkhdr), 8, 0));
            }
            else
            {
               A11344H_stkhdr = (int)(localUtil.ctol( httpContext.cgiGet( edtH_stkhdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11344H_stkhdr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11344H_stkhdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stkr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stkr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11345H_stkr = (byte)(0) ;
               n11345H_stkr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.str( A11345H_stkr, 1, 0));
            }
            else
            {
               A11345H_stkr = (byte)(localUtil.ctol( httpContext.cgiGet( edtH_stkr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11345H_stkr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.str( A11345H_stkr, 1, 0));
            }
            A11346H_stkp = httpContext.cgiGet( edtH_stkp_Internalname) ;
            n11346H_stkp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11346H_stkp", A11346H_stkp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_stklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_stklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_STKLEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtH_stklen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11348H_stklen = (short)(0) ;
               n11348H_stklen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11348H_stklen), 4, 0));
            }
            else
            {
               A11348H_stklen = (short)(localUtil.ctol( httpContext.cgiGet( edtH_stklen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11348H_stklen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11348H_stklen), 4, 0));
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A11329H_stklin = GXutil.lval( httpContext.GetPar( "H_stklin")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
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
                        e111BQ2 ();
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
            initAll1BQ1513( ) ;
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
      disableAttributes1BQ1513( ) ;
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

   public void confirm_1BQ0( )
   {
      beforeValidate1BQ1513( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BQ1513( ) ;
         }
         else
         {
            checkExtendedTable1BQ1513( ) ;
            if ( AnyError == 0 )
            {
               zm1BQ1513( 2) ;
               zm1BQ1513( 3) ;
               zm1BQ1513( 4) ;
               zm1BQ1513( 5) ;
            }
            closeExtendedTableCursors1BQ1513( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1BQ0( ) ;
      }
   }

   public void resetCaption1BQ0( )
   {
   }

   public void e111BQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thccstks_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thccstks_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thccstks_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thccstks_impl.this.A396EmprCod = GXv_char2[0] ;
      thccstks_impl.this.AV11EmprNom = GXv_char3[0] ;
      thccstks_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1BQ1513( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11330H_stkEnt = T01BQ3_A11330H_stkEnt[0] ;
            Z11331H_stkSal = T01BQ3_A11331H_stkSal[0] ;
            Z11332H_stkDsc = T01BQ3_A11332H_stkDsc[0] ;
            Z11333H_stkpp = T01BQ3_A11333H_stkpp[0] ;
            Z11334H_stkFec = T01BQ3_A11334H_stkFec[0] ;
            Z11335H_stkhor = T01BQ3_A11335H_stkhor[0] ;
            Z11336H_stkUsu = T01BQ3_A11336H_stkUsu[0] ;
            Z11337H_stkPre = T01BQ3_A11337H_stkPre[0] ;
            Z11338H_stkPed = T01BQ3_A11338H_stkPed[0] ;
            Z11339H_stkAlb = T01BQ3_A11339H_stkAlb[0] ;
            Z11340H_stklot = T01BQ3_A11340H_stklot[0] ;
            Z11341H_stkexp = T01BQ3_A11341H_stkexp[0] ;
            Z11342H_stkfexp = T01BQ3_A11342H_stkfexp[0] ;
            Z11343H_stkprv = T01BQ3_A11343H_stkprv[0] ;
            Z11344H_stkhdr = T01BQ3_A11344H_stkhdr[0] ;
            Z11345H_stkr = T01BQ3_A11345H_stkr[0] ;
            Z11346H_stkp = T01BQ3_A11346H_stkp[0] ;
            Z11348H_stklen = T01BQ3_A11348H_stklen[0] ;
            Z3345TipMovCc = T01BQ3_A3345TipMovCc[0] ;
            Z3839CcoCod = T01BQ3_A3839CcoCod[0] ;
         }
         else
         {
            Z11330H_stkEnt = A11330H_stkEnt ;
            Z11331H_stkSal = A11331H_stkSal ;
            Z11332H_stkDsc = A11332H_stkDsc ;
            Z11333H_stkpp = A11333H_stkpp ;
            Z11334H_stkFec = A11334H_stkFec ;
            Z11335H_stkhor = A11335H_stkhor ;
            Z11336H_stkUsu = A11336H_stkUsu ;
            Z11337H_stkPre = A11337H_stkPre ;
            Z11338H_stkPed = A11338H_stkPed ;
            Z11339H_stkAlb = A11339H_stkAlb ;
            Z11340H_stklot = A11340H_stklot ;
            Z11341H_stkexp = A11341H_stkexp ;
            Z11342H_stkfexp = A11342H_stkfexp ;
            Z11343H_stkprv = A11343H_stkprv ;
            Z11344H_stkhdr = A11344H_stkhdr ;
            Z11345H_stkr = A11345H_stkr ;
            Z11346H_stkp = A11346H_stkp ;
            Z11348H_stklen = A11348H_stklen ;
            Z3345TipMovCc = A3345TipMovCc ;
            Z3839CcoCod = A3839CcoCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11329H_stklin = A11329H_stklin ;
         Z11330H_stkEnt = A11330H_stkEnt ;
         Z11331H_stkSal = A11331H_stkSal ;
         Z11332H_stkDsc = A11332H_stkDsc ;
         Z11333H_stkpp = A11333H_stkpp ;
         Z11334H_stkFec = A11334H_stkFec ;
         Z11335H_stkhor = A11335H_stkhor ;
         Z11336H_stkUsu = A11336H_stkUsu ;
         Z11337H_stkPre = A11337H_stkPre ;
         Z11338H_stkPed = A11338H_stkPed ;
         Z11339H_stkAlb = A11339H_stkAlb ;
         Z11340H_stklot = A11340H_stklot ;
         Z11341H_stkexp = A11341H_stkexp ;
         Z11342H_stkfexp = A11342H_stkfexp ;
         Z11343H_stkprv = A11343H_stkprv ;
         Z11344H_stkhdr = A11344H_stkhdr ;
         Z11345H_stkr = A11345H_stkr ;
         Z11346H_stkp = A11346H_stkp ;
         Z11348H_stklen = A11348H_stklen ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z3345TipMovCc = A3345TipMovCc ;
         Z3839CcoCod = A3839CcoCod ;
         Z407EmprNom = A407EmprNom ;
         Z718PrdNom = A718PrdNom ;
         Z3346TipMovCn = A3346TipMovCn ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THCCSTKS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01BQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BQ4_A407EmprNom[0] ;
      n407EmprNom = T01BQ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load1BQ1513( )
   {
      /* Using cursor T01BQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1513 = (short)(1) ;
         A407EmprNom = T01BQ8_A407EmprNom[0] ;
         n407EmprNom = T01BQ8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01BQ8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A11330H_stkEnt = T01BQ8_A11330H_stkEnt[0] ;
         n11330H_stkEnt = T01BQ8_n11330H_stkEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrimstr( A11330H_stkEnt, 12, 4));
         A11331H_stkSal = T01BQ8_A11331H_stkSal[0] ;
         n11331H_stkSal = T01BQ8_n11331H_stkSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrimstr( A11331H_stkSal, 12, 4));
         A3346TipMovCn = T01BQ8_A3346TipMovCn[0] ;
         n3346TipMovCn = T01BQ8_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         A11332H_stkDsc = T01BQ8_A11332H_stkDsc[0] ;
         n11332H_stkDsc = T01BQ8_n11332H_stkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11332H_stkDsc", A11332H_stkDsc);
         A11333H_stkpp = T01BQ8_A11333H_stkpp[0] ;
         n11333H_stkpp = T01BQ8_n11333H_stkpp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11333H_stkpp", A11333H_stkpp);
         A11334H_stkFec = T01BQ8_A11334H_stkFec[0] ;
         n11334H_stkFec = T01BQ8_n11334H_stkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
         A11335H_stkhor = T01BQ8_A11335H_stkhor[0] ;
         n11335H_stkhor = T01BQ8_n11335H_stkhor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11335H_stkhor", A11335H_stkhor);
         A11336H_stkUsu = T01BQ8_A11336H_stkUsu[0] ;
         n11336H_stkUsu = T01BQ8_n11336H_stkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11336H_stkUsu", A11336H_stkUsu);
         A11337H_stkPre = T01BQ8_A11337H_stkPre[0] ;
         n11337H_stkPre = T01BQ8_n11337H_stkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrimstr( A11337H_stkPre, 14, 5));
         A11338H_stkPed = T01BQ8_A11338H_stkPed[0] ;
         n11338H_stkPed = T01BQ8_n11338H_stkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11338H_stkPed), 8, 0));
         A11339H_stkAlb = T01BQ8_A11339H_stkAlb[0] ;
         n11339H_stkAlb = T01BQ8_n11339H_stkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11339H_stkAlb", A11339H_stkAlb);
         A11340H_stklot = T01BQ8_A11340H_stklot[0] ;
         n11340H_stklot = T01BQ8_n11340H_stklot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11340H_stklot", A11340H_stklot);
         A11341H_stkexp = T01BQ8_A11341H_stkexp[0] ;
         n11341H_stkexp = T01BQ8_n11341H_stkexp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.str( A11341H_stkexp, 1, 0));
         A11342H_stkfexp = T01BQ8_A11342H_stkfexp[0] ;
         n11342H_stkfexp = T01BQ8_n11342H_stkfexp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
         A11343H_stkprv = T01BQ8_A11343H_stkprv[0] ;
         n11343H_stkprv = T01BQ8_n11343H_stkprv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11343H_stkprv), 6, 0));
         A11344H_stkhdr = T01BQ8_A11344H_stkhdr[0] ;
         n11344H_stkhdr = T01BQ8_n11344H_stkhdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11344H_stkhdr), 8, 0));
         A11345H_stkr = T01BQ8_A11345H_stkr[0] ;
         n11345H_stkr = T01BQ8_n11345H_stkr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.str( A11345H_stkr, 1, 0));
         A11346H_stkp = T01BQ8_A11346H_stkp[0] ;
         n11346H_stkp = T01BQ8_n11346H_stkp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11346H_stkp", A11346H_stkp);
         A11348H_stklen = T01BQ8_A11348H_stklen[0] ;
         n11348H_stklen = T01BQ8_n11348H_stklen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11348H_stklen), 4, 0));
         A3345TipMovCc = T01BQ8_A3345TipMovCc[0] ;
         n3345TipMovCc = T01BQ8_n3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3839CcoCod = T01BQ8_A3839CcoCod[0] ;
         n3839CcoCod = T01BQ8_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         zm1BQ1513( -1) ;
      }
      pr_default.close(6);
      onLoadActions1BQ1513( ) ;
   }

   public void onLoadActions1BQ1513( )
   {
   }

   public void checkExtendedTable1BQ1513( )
   {
      nIsDirty_1513 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01BQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T01BQ6_A3346TipMovCn[0] ;
      n3346TipMovCn = T01BQ6_n3346TipMovCn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      pr_default.close(4);
      /* Using cursor T01BQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01BQ5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(3);
      /* Using cursor T01BQ7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1BQ1513( )
   {
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A3345TipMovCc )
   {
      /* Using cursor T01BQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T01BQ9_A3346TipMovCn[0] ;
      n3346TipMovCn = T01BQ9_n3346TipMovCn[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3346TipMovCn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_3( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01BQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01BQ10_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_5( short A3839CcoCod )
   {
      /* Using cursor T01BQ11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1BQ1513( )
   {
      /* Using cursor T01BQ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1513 = (short)(1) ;
      }
      else
      {
         RcdFound1513 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BQ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BQ1513( 1) ;
         RcdFound1513 = (short)(1) ;
         A11329H_stklin = T01BQ3_A11329H_stklin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
         A11330H_stkEnt = T01BQ3_A11330H_stkEnt[0] ;
         n11330H_stkEnt = T01BQ3_n11330H_stkEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrimstr( A11330H_stkEnt, 12, 4));
         A11331H_stkSal = T01BQ3_A11331H_stkSal[0] ;
         n11331H_stkSal = T01BQ3_n11331H_stkSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrimstr( A11331H_stkSal, 12, 4));
         A11332H_stkDsc = T01BQ3_A11332H_stkDsc[0] ;
         n11332H_stkDsc = T01BQ3_n11332H_stkDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11332H_stkDsc", A11332H_stkDsc);
         A11333H_stkpp = T01BQ3_A11333H_stkpp[0] ;
         n11333H_stkpp = T01BQ3_n11333H_stkpp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11333H_stkpp", A11333H_stkpp);
         A11334H_stkFec = T01BQ3_A11334H_stkFec[0] ;
         n11334H_stkFec = T01BQ3_n11334H_stkFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
         A11335H_stkhor = T01BQ3_A11335H_stkhor[0] ;
         n11335H_stkhor = T01BQ3_n11335H_stkhor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11335H_stkhor", A11335H_stkhor);
         A11336H_stkUsu = T01BQ3_A11336H_stkUsu[0] ;
         n11336H_stkUsu = T01BQ3_n11336H_stkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11336H_stkUsu", A11336H_stkUsu);
         A11337H_stkPre = T01BQ3_A11337H_stkPre[0] ;
         n11337H_stkPre = T01BQ3_n11337H_stkPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrimstr( A11337H_stkPre, 14, 5));
         A11338H_stkPed = T01BQ3_A11338H_stkPed[0] ;
         n11338H_stkPed = T01BQ3_n11338H_stkPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11338H_stkPed), 8, 0));
         A11339H_stkAlb = T01BQ3_A11339H_stkAlb[0] ;
         n11339H_stkAlb = T01BQ3_n11339H_stkAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11339H_stkAlb", A11339H_stkAlb);
         A11340H_stklot = T01BQ3_A11340H_stklot[0] ;
         n11340H_stklot = T01BQ3_n11340H_stklot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11340H_stklot", A11340H_stklot);
         A11341H_stkexp = T01BQ3_A11341H_stkexp[0] ;
         n11341H_stkexp = T01BQ3_n11341H_stkexp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.str( A11341H_stkexp, 1, 0));
         A11342H_stkfexp = T01BQ3_A11342H_stkfexp[0] ;
         n11342H_stkfexp = T01BQ3_n11342H_stkfexp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
         A11343H_stkprv = T01BQ3_A11343H_stkprv[0] ;
         n11343H_stkprv = T01BQ3_n11343H_stkprv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11343H_stkprv), 6, 0));
         A11344H_stkhdr = T01BQ3_A11344H_stkhdr[0] ;
         n11344H_stkhdr = T01BQ3_n11344H_stkhdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11344H_stkhdr), 8, 0));
         A11345H_stkr = T01BQ3_A11345H_stkr[0] ;
         n11345H_stkr = T01BQ3_n11345H_stkr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.str( A11345H_stkr, 1, 0));
         A11346H_stkp = T01BQ3_A11346H_stkp[0] ;
         n11346H_stkp = T01BQ3_n11346H_stkp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11346H_stkp", A11346H_stkp);
         A11348H_stklen = T01BQ3_A11348H_stklen[0] ;
         n11348H_stklen = T01BQ3_n11348H_stklen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11348H_stklen), 4, 0));
         A719PrdNum = T01BQ3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3345TipMovCc = T01BQ3_A3345TipMovCc[0] ;
         n3345TipMovCc = T01BQ3_n3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3839CcoCod = T01BQ3_A3839CcoCod[0] ;
         n3839CcoCod = T01BQ3_n3839CcoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z11329H_stklin = A11329H_stklin ;
         sMode1513 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BQ1513( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1513 = (short)(0) ;
            initializeNonKey1BQ1513( ) ;
         }
         Gx_mode = sMode1513 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1513 = (short)(0) ;
         initializeNonKey1BQ1513( ) ;
         sMode1513 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1513 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1BQ1513( ) ;
      if ( RcdFound1513 == 0 )
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
      RcdFound1513 = (short)(0) ;
      /* Using cursor T01BQ13 */
      pr_default.execute(11, new Object[] {A719PrdNum, A719PrdNum, Long.valueOf(A11329H_stklin), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01BQ13_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01BQ13_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01BQ13_A11329H_stklin[0] < A11329H_stklin ) ) && ( GXutil.strcmp(T01BQ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01BQ13_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01BQ13_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01BQ13_A11329H_stklin[0] > A11329H_stklin ) ) && ( GXutil.strcmp(T01BQ13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01BQ13_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11329H_stklin = T01BQ13_A11329H_stklin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
            RcdFound1513 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1513 = (short)(0) ;
      /* Using cursor T01BQ14 */
      pr_default.execute(12, new Object[] {A719PrdNum, A719PrdNum, Long.valueOf(A11329H_stklin), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01BQ14_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01BQ14_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01BQ14_A11329H_stklin[0] > A11329H_stklin ) ) && ( GXutil.strcmp(T01BQ14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01BQ14_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01BQ14_A719PrdNum[0], A719PrdNum) == 0 ) && ( T01BQ14_A11329H_stklin[0] < A11329H_stklin ) ) && ( GXutil.strcmp(T01BQ14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01BQ14_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11329H_stklin = T01BQ14_A11329H_stklin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
            RcdFound1513 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BQ1513( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BQ1513( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1513 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A11329H_stklin != Z11329H_stklin ) )
            {
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A11329H_stklin = Z11329H_stklin ;
               httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1BQ1513( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A11329H_stklin != Z11329H_stklin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BQ1513( ) ;
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
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BQ1513( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A11329H_stklin != Z11329H_stklin ) )
      {
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11329H_stklin = Z11329H_stklin ;
         httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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
      getKey1BQ1513( ) ;
      if ( RcdFound1513 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A11329H_stklin != Z11329H_stklin ) )
         {
            A719PrdNum = Z719PrdNum ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11329H_stklin = Z11329H_stklin ;
            httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A11329H_stklin != Z11329H_stklin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thccstks");
      GX_FocusControl = edtH_stkEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1BQ0( ) ;
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
      if ( RcdFound1513 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtH_stkEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1BQ1513( ) ;
      if ( RcdFound1513 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_stkEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BQ1513( ) ;
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
      if ( RcdFound1513 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_stkEnt_Internalname ;
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
      if ( RcdFound1513 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_stkEnt_Internalname ;
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
      scanStart1BQ1513( ) ;
      if ( RcdFound1513 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1513 != 0 )
         {
            scanNext1BQ1513( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtH_stkEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1BQ1513( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BQ1513( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHCCSTK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11330H_stkEnt, T01BQ2_A11330H_stkEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z11331H_stkSal, T01BQ2_A11331H_stkSal[0]) != 0 ) || ( GXutil.strcmp(Z11332H_stkDsc, T01BQ2_A11332H_stkDsc[0]) != 0 ) || ( GXutil.strcmp(Z11333H_stkpp, T01BQ2_A11333H_stkpp[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z11334H_stkFec), GXutil.resetTime(T01BQ2_A11334H_stkFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11335H_stkhor, T01BQ2_A11335H_stkhor[0]) != 0 ) || ( GXutil.strcmp(Z11336H_stkUsu, T01BQ2_A11336H_stkUsu[0]) != 0 ) || ( DecimalUtil.compareTo(Z11337H_stkPre, T01BQ2_A11337H_stkPre[0]) != 0 ) || ( Z11338H_stkPed != T01BQ2_A11338H_stkPed[0] ) || ( GXutil.strcmp(Z11339H_stkAlb, T01BQ2_A11339H_stkAlb[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11340H_stklot, T01BQ2_A11340H_stklot[0]) != 0 ) || ( Z11341H_stkexp != T01BQ2_A11341H_stkexp[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11342H_stkfexp), GXutil.resetTime(T01BQ2_A11342H_stkfexp[0])) ) || ( Z11343H_stkprv != T01BQ2_A11343H_stkprv[0] ) || ( Z11344H_stkhdr != T01BQ2_A11344H_stkhdr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11345H_stkr != T01BQ2_A11345H_stkr[0] ) || ( GXutil.strcmp(Z11346H_stkp, T01BQ2_A11346H_stkp[0]) != 0 ) || ( Z11348H_stklen != T01BQ2_A11348H_stklen[0] ) || ( GXutil.strcmp(Z3345TipMovCc, T01BQ2_A3345TipMovCc[0]) != 0 ) || ( Z3839CcoCod != T01BQ2_A3839CcoCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11330H_stkEnt, T01BQ2_A11330H_stkEnt[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkEnt");
               GXutil.writeLogRaw("Old: ",Z11330H_stkEnt);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11330H_stkEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z11331H_stkSal, T01BQ2_A11331H_stkSal[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkSal");
               GXutil.writeLogRaw("Old: ",Z11331H_stkSal);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11331H_stkSal[0]);
            }
            if ( GXutil.strcmp(Z11332H_stkDsc, T01BQ2_A11332H_stkDsc[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkDsc");
               GXutil.writeLogRaw("Old: ",Z11332H_stkDsc);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11332H_stkDsc[0]);
            }
            if ( GXutil.strcmp(Z11333H_stkpp, T01BQ2_A11333H_stkpp[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkpp");
               GXutil.writeLogRaw("Old: ",Z11333H_stkpp);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11333H_stkpp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11334H_stkFec), GXutil.resetTime(T01BQ2_A11334H_stkFec[0])) ) )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkFec");
               GXutil.writeLogRaw("Old: ",Z11334H_stkFec);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11334H_stkFec[0]);
            }
            if ( GXutil.strcmp(Z11335H_stkhor, T01BQ2_A11335H_stkhor[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkhor");
               GXutil.writeLogRaw("Old: ",Z11335H_stkhor);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11335H_stkhor[0]);
            }
            if ( GXutil.strcmp(Z11336H_stkUsu, T01BQ2_A11336H_stkUsu[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkUsu");
               GXutil.writeLogRaw("Old: ",Z11336H_stkUsu);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11336H_stkUsu[0]);
            }
            if ( DecimalUtil.compareTo(Z11337H_stkPre, T01BQ2_A11337H_stkPre[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkPre");
               GXutil.writeLogRaw("Old: ",Z11337H_stkPre);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11337H_stkPre[0]);
            }
            if ( Z11338H_stkPed != T01BQ2_A11338H_stkPed[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkPed");
               GXutil.writeLogRaw("Old: ",Z11338H_stkPed);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11338H_stkPed[0]);
            }
            if ( GXutil.strcmp(Z11339H_stkAlb, T01BQ2_A11339H_stkAlb[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkAlb");
               GXutil.writeLogRaw("Old: ",Z11339H_stkAlb);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11339H_stkAlb[0]);
            }
            if ( GXutil.strcmp(Z11340H_stklot, T01BQ2_A11340H_stklot[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stklot");
               GXutil.writeLogRaw("Old: ",Z11340H_stklot);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11340H_stklot[0]);
            }
            if ( Z11341H_stkexp != T01BQ2_A11341H_stkexp[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkexp");
               GXutil.writeLogRaw("Old: ",Z11341H_stkexp);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11341H_stkexp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11342H_stkfexp), GXutil.resetTime(T01BQ2_A11342H_stkfexp[0])) ) )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkfexp");
               GXutil.writeLogRaw("Old: ",Z11342H_stkfexp);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11342H_stkfexp[0]);
            }
            if ( Z11343H_stkprv != T01BQ2_A11343H_stkprv[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkprv");
               GXutil.writeLogRaw("Old: ",Z11343H_stkprv);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11343H_stkprv[0]);
            }
            if ( Z11344H_stkhdr != T01BQ2_A11344H_stkhdr[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkhdr");
               GXutil.writeLogRaw("Old: ",Z11344H_stkhdr);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11344H_stkhdr[0]);
            }
            if ( Z11345H_stkr != T01BQ2_A11345H_stkr[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkr");
               GXutil.writeLogRaw("Old: ",Z11345H_stkr);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11345H_stkr[0]);
            }
            if ( GXutil.strcmp(Z11346H_stkp, T01BQ2_A11346H_stkp[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stkp");
               GXutil.writeLogRaw("Old: ",Z11346H_stkp);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11346H_stkp[0]);
            }
            if ( Z11348H_stklen != T01BQ2_A11348H_stklen[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"H_stklen");
               GXutil.writeLogRaw("Old: ",Z11348H_stklen);
               GXutil.writeLogRaw("Current: ",T01BQ2_A11348H_stklen[0]);
            }
            if ( GXutil.strcmp(Z3345TipMovCc, T01BQ2_A3345TipMovCc[0]) != 0 )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"TipMovCc");
               GXutil.writeLogRaw("Old: ",Z3345TipMovCc);
               GXutil.writeLogRaw("Current: ",T01BQ2_A3345TipMovCc[0]);
            }
            if ( Z3839CcoCod != T01BQ2_A3839CcoCod[0] )
            {
               GXutil.writeLogln("thccstks:[seudo value changed for attri]"+"CcoCod");
               GXutil.writeLogRaw("Old: ",Z3839CcoCod);
               GXutil.writeLogRaw("Current: ",T01BQ2_A3839CcoCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHCCSTK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BQ1513( )
   {
      beforeValidate1BQ1513( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BQ1513( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BQ1513( 0) ;
         checkOptimisticConcurrency1BQ1513( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BQ1513( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BQ1513( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BQ15 */
                  pr_default.execute(13, new Object[] {Long.valueOf(A11329H_stklin), Boolean.valueOf(n11330H_stkEnt), A11330H_stkEnt, Boolean.valueOf(n11331H_stkSal), A11331H_stkSal, Boolean.valueOf(n11332H_stkDsc), A11332H_stkDsc, Boolean.valueOf(n11333H_stkpp), A11333H_stkpp, Boolean.valueOf(n11334H_stkFec), A11334H_stkFec, Boolean.valueOf(n11335H_stkhor), A11335H_stkhor, Boolean.valueOf(n11336H_stkUsu), A11336H_stkUsu, Boolean.valueOf(n11337H_stkPre), A11337H_stkPre, Boolean.valueOf(n11338H_stkPed), Integer.valueOf(A11338H_stkPed), Boolean.valueOf(n11339H_stkAlb), A11339H_stkAlb, Boolean.valueOf(n11340H_stklot), A11340H_stklot, Boolean.valueOf(n11341H_stkexp), Byte.valueOf(A11341H_stkexp), Boolean.valueOf(n11342H_stkfexp), A11342H_stkfexp, Boolean.valueOf(n11343H_stkprv), Integer.valueOf(A11343H_stkprv), Boolean.valueOf(n11344H_stkhdr), Integer.valueOf(A11344H_stkhdr), Boolean.valueOf(n11345H_stkr), Byte.valueOf(A11345H_stkr), Boolean.valueOf(n11346H_stkp), A11346H_stkp, Boolean.valueOf(n11348H_stklen), Short.valueOf(A11348H_stklen), A396EmprCod, A719PrdNum, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHCCSTK");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        resetCaption1BQ0( ) ;
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
            load1BQ1513( ) ;
         }
         endLevel1BQ1513( ) ;
      }
      closeExtendedTableCursors1BQ1513( ) ;
   }

   public void update1BQ1513( )
   {
      beforeValidate1BQ1513( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BQ1513( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BQ1513( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BQ1513( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BQ1513( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BQ16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n11330H_stkEnt), A11330H_stkEnt, Boolean.valueOf(n11331H_stkSal), A11331H_stkSal, Boolean.valueOf(n11332H_stkDsc), A11332H_stkDsc, Boolean.valueOf(n11333H_stkpp), A11333H_stkpp, Boolean.valueOf(n11334H_stkFec), A11334H_stkFec, Boolean.valueOf(n11335H_stkhor), A11335H_stkhor, Boolean.valueOf(n11336H_stkUsu), A11336H_stkUsu, Boolean.valueOf(n11337H_stkPre), A11337H_stkPre, Boolean.valueOf(n11338H_stkPed), Integer.valueOf(A11338H_stkPed), Boolean.valueOf(n11339H_stkAlb), A11339H_stkAlb, Boolean.valueOf(n11340H_stklot), A11340H_stklot, Boolean.valueOf(n11341H_stkexp), Byte.valueOf(A11341H_stkexp), Boolean.valueOf(n11342H_stkfexp), A11342H_stkfexp, Boolean.valueOf(n11343H_stkprv), Integer.valueOf(A11343H_stkprv), Boolean.valueOf(n11344H_stkhdr), Integer.valueOf(A11344H_stkhdr), Boolean.valueOf(n11345H_stkr), Byte.valueOf(A11345H_stkr), Boolean.valueOf(n11346H_stkp), A11346H_stkp, Boolean.valueOf(n11348H_stklen), Short.valueOf(A11348H_stklen), Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHCCSTK");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHCCSTK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BQ1513( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1BQ0( ) ;
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
         endLevel1BQ1513( ) ;
      }
      closeExtendedTableCursors1BQ1513( ) ;
   }

   public void deferredUpdate1BQ1513( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BQ1513( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BQ1513( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BQ1513( ) ;
         afterConfirm1BQ1513( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BQ1513( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BQ17 */
               pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A11329H_stklin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHCCSTK");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1513 == 0 )
                     {
                        initAll1BQ1513( ) ;
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
                     resetCaption1BQ0( ) ;
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
      sMode1513 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BQ1513( ) ;
      Gx_mode = sMode1513 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BQ1513( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BQ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01BQ18_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(16);
         /* Using cursor T01BQ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         A3346TipMovCn = T01BQ19_A3346TipMovCn[0] ;
         n3346TipMovCn = T01BQ19_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         pr_default.close(17);
      }
   }

   public void endLevel1BQ1513( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BQ1513( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thccstks");
         if ( AnyError == 0 )
         {
            confirmValues1BQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thccstks");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BQ1513( )
   {
      /* Scan By routine */
      /* Using cursor T01BQ20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound1513 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1513 = (short)(1) ;
         A719PrdNum = T01BQ20_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11329H_stklin = T01BQ20_A11329H_stklin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BQ1513( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1513 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1513 = (short)(1) ;
         A719PrdNum = T01BQ20_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11329H_stklin = T01BQ20_A11329H_stklin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
      }
   }

   public void scanEnd1BQ1513( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1BQ1513( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BQ1513( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BQ1513( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BQ1513( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BQ1513( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BQ1513( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BQ1513( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtH_stklin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stklin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stklin_Enabled), 5, 0), true);
      edtH_stkEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkEnt_Enabled), 5, 0), true);
      edtH_stkSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkSal_Enabled), 5, 0), true);
      edtTipMovCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
      edtTipMovCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Enabled), 5, 0), true);
      edtH_stkDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkDsc_Enabled), 5, 0), true);
      edtH_stkpp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkpp_Enabled), 5, 0), true);
      edtH_stkFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkFec_Enabled), 5, 0), true);
      edtH_stkhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkhor_Enabled), 5, 0), true);
      edtH_stkUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkUsu_Enabled), 5, 0), true);
      edtH_stkPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkPre_Enabled), 5, 0), true);
      edtH_stkPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkPed_Enabled), 5, 0), true);
      edtH_stkAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkAlb_Enabled), 5, 0), true);
      edtCcoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Enabled), 5, 0), true);
      edtH_stklot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stklot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stklot_Enabled), 5, 0), true);
      edtH_stkexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkexp_Enabled), 5, 0), true);
      edtH_stkfexp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkfexp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkfexp_Enabled), 5, 0), true);
      edtH_stkprv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkprv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkprv_Enabled), 5, 0), true);
      edtH_stkhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkhdr_Enabled), 5, 0), true);
      edtH_stkr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkr_Enabled), 5, 0), true);
      edtH_stkp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stkp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stkp_Enabled), 5, 0), true);
      edtH_stklen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_stklen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_stklen_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1BQ1513( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1BQ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thccstks", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11329H_stklin", GXutil.ltrim( localUtil.ntoc( Z11329H_stklin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11330H_stkEnt", GXutil.ltrim( localUtil.ntoc( Z11330H_stkEnt, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11331H_stkSal", GXutil.ltrim( localUtil.ntoc( Z11331H_stkSal, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11332H_stkDsc", GXutil.rtrim( Z11332H_stkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11333H_stkpp", GXutil.rtrim( Z11333H_stkpp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11334H_stkFec", localUtil.dtoc( Z11334H_stkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11335H_stkhor", GXutil.rtrim( Z11335H_stkhor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11336H_stkUsu", GXutil.rtrim( Z11336H_stkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11337H_stkPre", GXutil.ltrim( localUtil.ntoc( Z11337H_stkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11338H_stkPed", GXutil.ltrim( localUtil.ntoc( Z11338H_stkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11339H_stkAlb", GXutil.rtrim( Z11339H_stkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11340H_stklot", GXutil.rtrim( Z11340H_stklot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11341H_stkexp", GXutil.ltrim( localUtil.ntoc( Z11341H_stkexp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11342H_stkfexp", localUtil.dtoc( Z11342H_stkfexp, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11343H_stkprv", GXutil.ltrim( localUtil.ntoc( Z11343H_stkprv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11344H_stkhdr", GXutil.ltrim( localUtil.ntoc( Z11344H_stkhdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11345H_stkr", GXutil.ltrim( localUtil.ntoc( Z11345H_stkr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11346H_stkp", GXutil.rtrim( Z11346H_stkp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11348H_stklen", GXutil.ltrim( localUtil.ntoc( Z11348H_stklen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3345TipMovCc", GXutil.rtrim( Z3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.thccstks", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THCCSTKS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "") ;
   }

   public void initializeNonKey1BQ1513( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A11330H_stkEnt = DecimalUtil.ZERO ;
      n11330H_stkEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrimstr( A11330H_stkEnt, 12, 4));
      A11331H_stkSal = DecimalUtil.ZERO ;
      n11331H_stkSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrimstr( A11331H_stkSal, 12, 4));
      A3345TipMovCc = "" ;
      n3345TipMovCc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      A3346TipMovCn = "" ;
      n3346TipMovCn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      A11332H_stkDsc = "" ;
      n11332H_stkDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11332H_stkDsc", A11332H_stkDsc);
      A11333H_stkpp = "" ;
      n11333H_stkpp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11333H_stkpp", A11333H_stkpp);
      A11334H_stkFec = GXutil.nullDate() ;
      n11334H_stkFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
      A11335H_stkhor = "" ;
      n11335H_stkhor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11335H_stkhor", A11335H_stkhor);
      A11336H_stkUsu = "" ;
      n11336H_stkUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11336H_stkUsu", A11336H_stkUsu);
      A11337H_stkPre = DecimalUtil.ZERO ;
      n11337H_stkPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrimstr( A11337H_stkPre, 14, 5));
      A11338H_stkPed = 0 ;
      n11338H_stkPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11338H_stkPed), 8, 0));
      A11339H_stkAlb = "" ;
      n11339H_stkAlb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11339H_stkAlb", A11339H_stkAlb);
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3839CcoCod), 3, 0));
      A11340H_stklot = "" ;
      n11340H_stklot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11340H_stklot", A11340H_stklot);
      A11341H_stkexp = (byte)(0) ;
      n11341H_stkexp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.str( A11341H_stkexp, 1, 0));
      A11342H_stkfexp = GXutil.nullDate() ;
      n11342H_stkfexp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
      A11343H_stkprv = 0 ;
      n11343H_stkprv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11343H_stkprv), 6, 0));
      A11344H_stkhdr = 0 ;
      n11344H_stkhdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11344H_stkhdr), 8, 0));
      A11345H_stkr = (byte)(0) ;
      n11345H_stkr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.str( A11345H_stkr, 1, 0));
      A11346H_stkp = "" ;
      n11346H_stkp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11346H_stkp", A11346H_stkp);
      A11348H_stklen = (short)(0) ;
      n11348H_stklen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11348H_stklen), 4, 0));
      Z11330H_stkEnt = DecimalUtil.ZERO ;
      Z11331H_stkSal = DecimalUtil.ZERO ;
      Z11332H_stkDsc = "" ;
      Z11333H_stkpp = "" ;
      Z11334H_stkFec = GXutil.nullDate() ;
      Z11335H_stkhor = "" ;
      Z11336H_stkUsu = "" ;
      Z11337H_stkPre = DecimalUtil.ZERO ;
      Z11338H_stkPed = 0 ;
      Z11339H_stkAlb = "" ;
      Z11340H_stklot = "" ;
      Z11341H_stkexp = (byte)(0) ;
      Z11342H_stkfexp = GXutil.nullDate() ;
      Z11343H_stkprv = 0 ;
      Z11344H_stkhdr = 0 ;
      Z11345H_stkr = (byte)(0) ;
      Z11346H_stkp = "" ;
      Z11348H_stklen = (short)(0) ;
      Z3345TipMovCc = "" ;
      Z3839CcoCod = (short)(0) ;
   }

   public void initAll1BQ1513( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A11329H_stklin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11329H_stklin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11329H_stklin), 12, 0));
      initializeNonKey1BQ1513( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564590", true, true);
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
      httpContext.AddJavascriptSource("thccstks.js", "?20268241564590", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtH_stklin_Internalname = "H_STKLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtH_stkEnt_Internalname = "H_STKENT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtH_stkSal_Internalname = "H_STKSAL" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTipMovCc_Internalname = "TIPMOVCC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipMovCn_Internalname = "TIPMOVCN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtH_stkDsc_Internalname = "H_STKDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtH_stkpp_Internalname = "H_STKPP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtH_stkFec_Internalname = "H_STKFEC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtH_stkhor_Internalname = "H_STKHOR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtH_stkUsu_Internalname = "H_STKUSU" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtH_stkPre_Internalname = "H_STKPRE" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtH_stkPed_Internalname = "H_STKPED" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtH_stkAlb_Internalname = "H_STKALB" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtCcoCod_Internalname = "CCOCOD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtH_stklot_Internalname = "H_STKLOT" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtH_stkexp_Internalname = "H_STKEXP" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtH_stkfexp_Internalname = "H_STKFEXP" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtH_stkprv_Internalname = "H_STKPRV" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtH_stkhdr_Internalname = "H_STKHDR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtH_stkr_Internalname = "H_STKR" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtH_stkp_Internalname = "H_STKP" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtH_stklen_Internalname = "H_STKLEN" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtH_stklen_Jsonclick = "" ;
      edtH_stklen_Backcolor = (int)(0xFFFFFF) ;
      edtH_stklen_Enabled = 1 ;
      edtH_stkp_Jsonclick = "" ;
      edtH_stkp_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkp_Enabled = 1 ;
      edtH_stkr_Jsonclick = "" ;
      edtH_stkr_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkr_Enabled = 1 ;
      edtH_stkhdr_Jsonclick = "" ;
      edtH_stkhdr_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkhdr_Enabled = 1 ;
      edtH_stkprv_Jsonclick = "" ;
      edtH_stkprv_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkprv_Enabled = 1 ;
      edtH_stkfexp_Jsonclick = "" ;
      edtH_stkfexp_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkfexp_Enabled = 1 ;
      edtH_stkexp_Jsonclick = "" ;
      edtH_stkexp_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkexp_Enabled = 1 ;
      edtH_stklot_Jsonclick = "" ;
      edtH_stklot_Backcolor = (int)(0xFFFFFF) ;
      edtH_stklot_Enabled = 1 ;
      edtCcoCod_Jsonclick = "" ;
      edtCcoCod_Backcolor = (int)(0xFFFFFF) ;
      edtCcoCod_Enabled = 1 ;
      edtH_stkAlb_Jsonclick = "" ;
      edtH_stkAlb_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkAlb_Enabled = 1 ;
      edtH_stkPed_Jsonclick = "" ;
      edtH_stkPed_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkPed_Enabled = 1 ;
      edtH_stkPre_Jsonclick = "" ;
      edtH_stkPre_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkPre_Enabled = 1 ;
      edtH_stkUsu_Jsonclick = "" ;
      edtH_stkUsu_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkUsu_Enabled = 1 ;
      edtH_stkhor_Jsonclick = "" ;
      edtH_stkhor_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkhor_Enabled = 1 ;
      edtH_stkFec_Jsonclick = "" ;
      edtH_stkFec_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkFec_Enabled = 1 ;
      edtH_stkpp_Jsonclick = "" ;
      edtH_stkpp_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkpp_Enabled = 1 ;
      edtH_stkDsc_Jsonclick = "" ;
      edtH_stkDsc_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkDsc_Enabled = 1 ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCn_Backcolor = (int)(0xFFFFFF) ;
      edtTipMovCn_Enabled = 0 ;
      edtTipMovCc_Jsonclick = "" ;
      edtTipMovCc_Backcolor = (int)(0xFFFFFF) ;
      edtTipMovCc_Enabled = 1 ;
      edtH_stkSal_Jsonclick = "" ;
      edtH_stkSal_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkSal_Enabled = 1 ;
      edtH_stkEnt_Jsonclick = "" ;
      edtH_stkEnt_Backcolor = (int)(0xFFFFFF) ;
      edtH_stkEnt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_stklin_Jsonclick = "" ;
      edtH_stklin_Backcolor = (int)(0xFFFFFF) ;
      edtH_stklin_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
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
      /* Using cursor T01BQ21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BQ21_A407EmprNom[0] ;
      n407EmprNom = T01BQ21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      /* Using cursor T01BQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01BQ18_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(16);
      GX_FocusControl = edtH_stkEnt_Internalname ;
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

   public void valid_Prdnum( )
   {
      /* Using cursor T01BQ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01BQ18_A718PrdNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_H_stklin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11330H_stkEnt", GXutil.ltrim( localUtil.ntoc( A11330H_stkEnt, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11331H_stkSal", GXutil.ltrim( localUtil.ntoc( A11331H_stkSal, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", GXutil.rtrim( A3345TipMovCc));
      httpContext.ajax_rsp_assign_attri("", false, "A11332H_stkDsc", GXutil.rtrim( A11332H_stkDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11333H_stkpp", GXutil.rtrim( A11333H_stkpp));
      httpContext.ajax_rsp_assign_attri("", false, "A11334H_stkFec", localUtil.format(A11334H_stkFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11335H_stkhor", GXutil.rtrim( A11335H_stkhor));
      httpContext.ajax_rsp_assign_attri("", false, "A11336H_stkUsu", GXutil.rtrim( A11336H_stkUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A11337H_stkPre", GXutil.ltrim( localUtil.ntoc( A11337H_stkPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11338H_stkPed", GXutil.ltrim( localUtil.ntoc( A11338H_stkPed, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11339H_stkAlb", GXutil.rtrim( A11339H_stkAlb));
      httpContext.ajax_rsp_assign_attri("", false, "A3839CcoCod", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11340H_stklot", GXutil.rtrim( A11340H_stklot));
      httpContext.ajax_rsp_assign_attri("", false, "A11341H_stkexp", GXutil.ltrim( localUtil.ntoc( A11341H_stkexp, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11342H_stkfexp", localUtil.format(A11342H_stkfexp, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11343H_stkprv", GXutil.ltrim( localUtil.ntoc( A11343H_stkprv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11344H_stkhdr", GXutil.ltrim( localUtil.ntoc( A11344H_stkhdr, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11345H_stkr", GXutil.ltrim( localUtil.ntoc( A11345H_stkr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11346H_stkp", GXutil.rtrim( A11346H_stkp));
      httpContext.ajax_rsp_assign_attri("", false, "A11348H_stklen", GXutil.ltrim( localUtil.ntoc( A11348H_stklen, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", GXutil.rtrim( A3346TipMovCn));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11329H_stklin", GXutil.ltrim( localUtil.ntoc( Z11329H_stklin, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11330H_stkEnt", GXutil.ltrim( localUtil.ntoc( Z11330H_stkEnt, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11331H_stkSal", GXutil.ltrim( localUtil.ntoc( Z11331H_stkSal, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3345TipMovCc", GXutil.rtrim( Z3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11332H_stkDsc", GXutil.rtrim( Z11332H_stkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11333H_stkpp", GXutil.rtrim( Z11333H_stkpp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11334H_stkFec", localUtil.format(Z11334H_stkFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11335H_stkhor", GXutil.rtrim( Z11335H_stkhor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11336H_stkUsu", GXutil.rtrim( Z11336H_stkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11337H_stkPre", GXutil.ltrim( localUtil.ntoc( Z11337H_stkPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11338H_stkPed", GXutil.ltrim( localUtil.ntoc( Z11338H_stkPed, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11339H_stkAlb", GXutil.rtrim( Z11339H_stkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3839CcoCod", GXutil.ltrim( localUtil.ntoc( Z3839CcoCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11340H_stklot", GXutil.rtrim( Z11340H_stklot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11341H_stkexp", GXutil.ltrim( localUtil.ntoc( Z11341H_stkexp, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11342H_stkfexp", localUtil.format(Z11342H_stkfexp, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11343H_stkprv", GXutil.ltrim( localUtil.ntoc( Z11343H_stkprv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11344H_stkhdr", GXutil.ltrim( localUtil.ntoc( Z11344H_stkhdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11345H_stkr", GXutil.ltrim( localUtil.ntoc( Z11345H_stkr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11346H_stkp", GXutil.rtrim( Z11346H_stkp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11348H_stklen", GXutil.ltrim( localUtil.ntoc( Z11348H_stklen, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3346TipMovCn", GXutil.rtrim( Z3346TipMovCn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipmovcc( )
   {
      n3345TipMovCc = false ;
      n3346TipMovCn = false ;
      /* Using cursor T01BQ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
      }
      A3346TipMovCn = T01BQ19_A3346TipMovCn[0] ;
      n3346TipMovCn = T01BQ19_n3346TipMovCn[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", GXutil.rtrim( A3346TipMovCn));
   }

   public void valid_Ccocod( )
   {
      n3839CcoCod = false ;
      /* Using cursor T01BQ22 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCcoCod_Internalname ;
      }
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_H_STKLIN","{handler:'valid_H_stklin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A11329H_stklin',fld:'H_STKLIN',pic:'ZZZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_STKLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11330H_stkEnt',fld:'H_STKENT',pic:'ZZZZZZ9.9999'},{av:'A11331H_stkSal',fld:'H_STKSAL',pic:'ZZZZZZ9.9999'},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A11332H_stkDsc',fld:'H_STKDSC',pic:''},{av:'A11333H_stkpp',fld:'H_STKPP',pic:''},{av:'A11334H_stkFec',fld:'H_STKFEC',pic:''},{av:'A11335H_stkhor',fld:'H_STKHOR',pic:''},{av:'A11336H_stkUsu',fld:'H_STKUSU',pic:''},{av:'A11337H_stkPre',fld:'H_STKPRE',pic:'ZZZZZZZ9.99999'},{av:'A11338H_stkPed',fld:'H_STKPED',pic:'ZZZZZZZ9'},{av:'A11339H_stkAlb',fld:'H_STKALB',pic:''},{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'},{av:'A11340H_stklot',fld:'H_STKLOT',pic:''},{av:'A11341H_stkexp',fld:'H_STKEXP',pic:'9'},{av:'A11342H_stkfexp',fld:'H_STKFEXP',pic:''},{av:'A11343H_stkprv',fld:'H_STKPRV',pic:'ZZZZZ9'},{av:'A11344H_stkhdr',fld:'H_STKHDR',pic:'ZZZZZZZ9'},{av:'A11345H_stkr',fld:'H_STKR',pic:'9'},{av:'A11346H_stkp',fld:'H_STKP',pic:''},{av:'A11348H_stklen',fld:'H_STKLEN',pic:'ZZZ9'},{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z11329H_stklin'},{av:'Z407EmprNom'},{av:'Z11330H_stkEnt'},{av:'Z11331H_stkSal'},{av:'Z3345TipMovCc'},{av:'Z11332H_stkDsc'},{av:'Z11333H_stkpp'},{av:'Z11334H_stkFec'},{av:'Z11335H_stkhor'},{av:'Z11336H_stkUsu'},{av:'Z11337H_stkPre'},{av:'Z11338H_stkPed'},{av:'Z11339H_stkAlb'},{av:'Z3839CcoCod'},{av:'Z11340H_stklot'},{av:'Z11341H_stkexp'},{av:'Z11342H_stkfexp'},{av:'Z11343H_stkprv'},{av:'Z11344H_stkhdr'},{av:'Z11345H_stkr'},{av:'Z11346H_stkp'},{av:'Z11348H_stklen'},{av:'Z3346TipMovCn'},{av:'Z718PrdNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]}");
      setEventMetadata("VALID_CCOCOD","{handler:'valid_Ccocod',iparms:[{av:'A3839CcoCod',fld:'CCOCOD',pic:'ZZ9'}]");
      setEventMetadata("VALID_CCOCOD",",oparms:[]}");
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
      pr_default.close(19);
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z11330H_stkEnt = DecimalUtil.ZERO ;
      Z11331H_stkSal = DecimalUtil.ZERO ;
      Z11332H_stkDsc = "" ;
      Z11333H_stkpp = "" ;
      Z11334H_stkFec = GXutil.nullDate() ;
      Z11335H_stkhor = "" ;
      Z11336H_stkUsu = "" ;
      Z11337H_stkPre = DecimalUtil.ZERO ;
      Z11339H_stkAlb = "" ;
      Z11340H_stklot = "" ;
      Z11342H_stkfexp = GXutil.nullDate() ;
      Z11346H_stkp = "" ;
      Z3345TipMovCc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3345TipMovCc = "" ;
      A719PrdNum = "" ;
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
      A718PrdNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11330H_stkEnt = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A11331H_stkSal = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A3346TipMovCn = "" ;
      lblTextblock10_Jsonclick = "" ;
      A11332H_stkDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A11333H_stkpp = "" ;
      lblTextblock12_Jsonclick = "" ;
      A11334H_stkFec = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      A11335H_stkhor = "" ;
      lblTextblock14_Jsonclick = "" ;
      A11336H_stkUsu = "" ;
      lblTextblock15_Jsonclick = "" ;
      A11337H_stkPre = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A11339H_stkAlb = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A11340H_stklot = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A11342H_stkfexp = GXutil.nullDate() ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A11346H_stkp = "" ;
      lblTextblock26_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      Z3346TipMovCn = "" ;
      T01BQ4_A407EmprNom = new String[] {""} ;
      T01BQ4_n407EmprNom = new boolean[] {false} ;
      T01BQ8_A11329H_stklin = new long[1] ;
      T01BQ8_A407EmprNom = new String[] {""} ;
      T01BQ8_n407EmprNom = new boolean[] {false} ;
      T01BQ8_A718PrdNom = new String[] {""} ;
      T01BQ8_A11330H_stkEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ8_n11330H_stkEnt = new boolean[] {false} ;
      T01BQ8_A11331H_stkSal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ8_n11331H_stkSal = new boolean[] {false} ;
      T01BQ8_A3346TipMovCn = new String[] {""} ;
      T01BQ8_n3346TipMovCn = new boolean[] {false} ;
      T01BQ8_A11332H_stkDsc = new String[] {""} ;
      T01BQ8_n11332H_stkDsc = new boolean[] {false} ;
      T01BQ8_A11333H_stkpp = new String[] {""} ;
      T01BQ8_n11333H_stkpp = new boolean[] {false} ;
      T01BQ8_A11334H_stkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ8_n11334H_stkFec = new boolean[] {false} ;
      T01BQ8_A11335H_stkhor = new String[] {""} ;
      T01BQ8_n11335H_stkhor = new boolean[] {false} ;
      T01BQ8_A11336H_stkUsu = new String[] {""} ;
      T01BQ8_n11336H_stkUsu = new boolean[] {false} ;
      T01BQ8_A11337H_stkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ8_n11337H_stkPre = new boolean[] {false} ;
      T01BQ8_A11338H_stkPed = new int[1] ;
      T01BQ8_n11338H_stkPed = new boolean[] {false} ;
      T01BQ8_A11339H_stkAlb = new String[] {""} ;
      T01BQ8_n11339H_stkAlb = new boolean[] {false} ;
      T01BQ8_A11340H_stklot = new String[] {""} ;
      T01BQ8_n11340H_stklot = new boolean[] {false} ;
      T01BQ8_A11341H_stkexp = new byte[1] ;
      T01BQ8_n11341H_stkexp = new boolean[] {false} ;
      T01BQ8_A11342H_stkfexp = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ8_n11342H_stkfexp = new boolean[] {false} ;
      T01BQ8_A11343H_stkprv = new int[1] ;
      T01BQ8_n11343H_stkprv = new boolean[] {false} ;
      T01BQ8_A11344H_stkhdr = new int[1] ;
      T01BQ8_n11344H_stkhdr = new boolean[] {false} ;
      T01BQ8_A11345H_stkr = new byte[1] ;
      T01BQ8_n11345H_stkr = new boolean[] {false} ;
      T01BQ8_A11346H_stkp = new String[] {""} ;
      T01BQ8_n11346H_stkp = new boolean[] {false} ;
      T01BQ8_A11348H_stklen = new short[1] ;
      T01BQ8_n11348H_stklen = new boolean[] {false} ;
      T01BQ8_A396EmprCod = new String[] {""} ;
      T01BQ8_A719PrdNum = new String[] {""} ;
      T01BQ8_A3345TipMovCc = new String[] {""} ;
      T01BQ8_n3345TipMovCc = new boolean[] {false} ;
      T01BQ8_A3839CcoCod = new short[1] ;
      T01BQ8_n3839CcoCod = new boolean[] {false} ;
      T01BQ6_A3346TipMovCn = new String[] {""} ;
      T01BQ6_n3346TipMovCn = new boolean[] {false} ;
      T01BQ5_A718PrdNom = new String[] {""} ;
      T01BQ7_A3839CcoCod = new short[1] ;
      T01BQ7_n3839CcoCod = new boolean[] {false} ;
      T01BQ9_A3346TipMovCn = new String[] {""} ;
      T01BQ9_n3346TipMovCn = new boolean[] {false} ;
      T01BQ10_A718PrdNom = new String[] {""} ;
      T01BQ11_A3839CcoCod = new short[1] ;
      T01BQ11_n3839CcoCod = new boolean[] {false} ;
      T01BQ12_A396EmprCod = new String[] {""} ;
      T01BQ12_A719PrdNum = new String[] {""} ;
      T01BQ12_A11329H_stklin = new long[1] ;
      T01BQ3_A11329H_stklin = new long[1] ;
      T01BQ3_A11330H_stkEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ3_n11330H_stkEnt = new boolean[] {false} ;
      T01BQ3_A11331H_stkSal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ3_n11331H_stkSal = new boolean[] {false} ;
      T01BQ3_A11332H_stkDsc = new String[] {""} ;
      T01BQ3_n11332H_stkDsc = new boolean[] {false} ;
      T01BQ3_A11333H_stkpp = new String[] {""} ;
      T01BQ3_n11333H_stkpp = new boolean[] {false} ;
      T01BQ3_A11334H_stkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ3_n11334H_stkFec = new boolean[] {false} ;
      T01BQ3_A11335H_stkhor = new String[] {""} ;
      T01BQ3_n11335H_stkhor = new boolean[] {false} ;
      T01BQ3_A11336H_stkUsu = new String[] {""} ;
      T01BQ3_n11336H_stkUsu = new boolean[] {false} ;
      T01BQ3_A11337H_stkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ3_n11337H_stkPre = new boolean[] {false} ;
      T01BQ3_A11338H_stkPed = new int[1] ;
      T01BQ3_n11338H_stkPed = new boolean[] {false} ;
      T01BQ3_A11339H_stkAlb = new String[] {""} ;
      T01BQ3_n11339H_stkAlb = new boolean[] {false} ;
      T01BQ3_A11340H_stklot = new String[] {""} ;
      T01BQ3_n11340H_stklot = new boolean[] {false} ;
      T01BQ3_A11341H_stkexp = new byte[1] ;
      T01BQ3_n11341H_stkexp = new boolean[] {false} ;
      T01BQ3_A11342H_stkfexp = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ3_n11342H_stkfexp = new boolean[] {false} ;
      T01BQ3_A11343H_stkprv = new int[1] ;
      T01BQ3_n11343H_stkprv = new boolean[] {false} ;
      T01BQ3_A11344H_stkhdr = new int[1] ;
      T01BQ3_n11344H_stkhdr = new boolean[] {false} ;
      T01BQ3_A11345H_stkr = new byte[1] ;
      T01BQ3_n11345H_stkr = new boolean[] {false} ;
      T01BQ3_A11346H_stkp = new String[] {""} ;
      T01BQ3_n11346H_stkp = new boolean[] {false} ;
      T01BQ3_A11348H_stklen = new short[1] ;
      T01BQ3_n11348H_stklen = new boolean[] {false} ;
      T01BQ3_A396EmprCod = new String[] {""} ;
      T01BQ3_A719PrdNum = new String[] {""} ;
      T01BQ3_A3345TipMovCc = new String[] {""} ;
      T01BQ3_n3345TipMovCc = new boolean[] {false} ;
      T01BQ3_A3839CcoCod = new short[1] ;
      T01BQ3_n3839CcoCod = new boolean[] {false} ;
      sMode1513 = "" ;
      T01BQ13_A396EmprCod = new String[] {""} ;
      T01BQ13_A719PrdNum = new String[] {""} ;
      T01BQ13_A11329H_stklin = new long[1] ;
      T01BQ14_A396EmprCod = new String[] {""} ;
      T01BQ14_A719PrdNum = new String[] {""} ;
      T01BQ14_A11329H_stklin = new long[1] ;
      T01BQ2_A11329H_stklin = new long[1] ;
      T01BQ2_A11330H_stkEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ2_n11330H_stkEnt = new boolean[] {false} ;
      T01BQ2_A11331H_stkSal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ2_n11331H_stkSal = new boolean[] {false} ;
      T01BQ2_A11332H_stkDsc = new String[] {""} ;
      T01BQ2_n11332H_stkDsc = new boolean[] {false} ;
      T01BQ2_A11333H_stkpp = new String[] {""} ;
      T01BQ2_n11333H_stkpp = new boolean[] {false} ;
      T01BQ2_A11334H_stkFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ2_n11334H_stkFec = new boolean[] {false} ;
      T01BQ2_A11335H_stkhor = new String[] {""} ;
      T01BQ2_n11335H_stkhor = new boolean[] {false} ;
      T01BQ2_A11336H_stkUsu = new String[] {""} ;
      T01BQ2_n11336H_stkUsu = new boolean[] {false} ;
      T01BQ2_A11337H_stkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01BQ2_n11337H_stkPre = new boolean[] {false} ;
      T01BQ2_A11338H_stkPed = new int[1] ;
      T01BQ2_n11338H_stkPed = new boolean[] {false} ;
      T01BQ2_A11339H_stkAlb = new String[] {""} ;
      T01BQ2_n11339H_stkAlb = new boolean[] {false} ;
      T01BQ2_A11340H_stklot = new String[] {""} ;
      T01BQ2_n11340H_stklot = new boolean[] {false} ;
      T01BQ2_A11341H_stkexp = new byte[1] ;
      T01BQ2_n11341H_stkexp = new boolean[] {false} ;
      T01BQ2_A11342H_stkfexp = new java.util.Date[] {GXutil.nullDate()} ;
      T01BQ2_n11342H_stkfexp = new boolean[] {false} ;
      T01BQ2_A11343H_stkprv = new int[1] ;
      T01BQ2_n11343H_stkprv = new boolean[] {false} ;
      T01BQ2_A11344H_stkhdr = new int[1] ;
      T01BQ2_n11344H_stkhdr = new boolean[] {false} ;
      T01BQ2_A11345H_stkr = new byte[1] ;
      T01BQ2_n11345H_stkr = new boolean[] {false} ;
      T01BQ2_A11346H_stkp = new String[] {""} ;
      T01BQ2_n11346H_stkp = new boolean[] {false} ;
      T01BQ2_A11348H_stklen = new short[1] ;
      T01BQ2_n11348H_stklen = new boolean[] {false} ;
      T01BQ2_A396EmprCod = new String[] {""} ;
      T01BQ2_A719PrdNum = new String[] {""} ;
      T01BQ2_A3345TipMovCc = new String[] {""} ;
      T01BQ2_n3345TipMovCc = new boolean[] {false} ;
      T01BQ2_A3839CcoCod = new short[1] ;
      T01BQ2_n3839CcoCod = new boolean[] {false} ;
      T01BQ18_A718PrdNom = new String[] {""} ;
      T01BQ19_A3346TipMovCn = new String[] {""} ;
      T01BQ19_n3346TipMovCn = new boolean[] {false} ;
      T01BQ20_A396EmprCod = new String[] {""} ;
      T01BQ20_A719PrdNum = new String[] {""} ;
      T01BQ20_A11329H_stklin = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01BQ21_A407EmprNom = new String[] {""} ;
      T01BQ21_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ407EmprNom = "" ;
      ZZ11330H_stkEnt = DecimalUtil.ZERO ;
      ZZ11331H_stkSal = DecimalUtil.ZERO ;
      ZZ3345TipMovCc = "" ;
      ZZ11332H_stkDsc = "" ;
      ZZ11333H_stkpp = "" ;
      ZZ11334H_stkFec = GXutil.nullDate() ;
      ZZ11335H_stkhor = "" ;
      ZZ11336H_stkUsu = "" ;
      ZZ11337H_stkPre = DecimalUtil.ZERO ;
      ZZ11339H_stkAlb = "" ;
      ZZ11340H_stklot = "" ;
      ZZ11342H_stkfexp = GXutil.nullDate() ;
      ZZ11346H_stkp = "" ;
      ZZ3346TipMovCn = "" ;
      ZZ718PrdNom = "" ;
      T01BQ22_A3839CcoCod = new short[1] ;
      T01BQ22_n3839CcoCod = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thccstks__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thccstks__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thccstks__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thccstks__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thccstks__default(),
         new Object[] {
             new Object[] {
            T01BQ2_A11329H_stklin, T01BQ2_A11330H_stkEnt, T01BQ2_n11330H_stkEnt, T01BQ2_A11331H_stkSal, T01BQ2_n11331H_stkSal, T01BQ2_A11332H_stkDsc, T01BQ2_n11332H_stkDsc, T01BQ2_A11333H_stkpp, T01BQ2_n11333H_stkpp, T01BQ2_A11334H_stkFec,
            T01BQ2_n11334H_stkFec, T01BQ2_A11335H_stkhor, T01BQ2_n11335H_stkhor, T01BQ2_A11336H_stkUsu, T01BQ2_n11336H_stkUsu, T01BQ2_A11337H_stkPre, T01BQ2_n11337H_stkPre, T01BQ2_A11338H_stkPed, T01BQ2_n11338H_stkPed, T01BQ2_A11339H_stkAlb,
            T01BQ2_n11339H_stkAlb, T01BQ2_A11340H_stklot, T01BQ2_n11340H_stklot, T01BQ2_A11341H_stkexp, T01BQ2_n11341H_stkexp, T01BQ2_A11342H_stkfexp, T01BQ2_n11342H_stkfexp, T01BQ2_A11343H_stkprv, T01BQ2_n11343H_stkprv, T01BQ2_A11344H_stkhdr,
            T01BQ2_n11344H_stkhdr, T01BQ2_A11345H_stkr, T01BQ2_n11345H_stkr, T01BQ2_A11346H_stkp, T01BQ2_n11346H_stkp, T01BQ2_A11348H_stklen, T01BQ2_n11348H_stklen, T01BQ2_A396EmprCod, T01BQ2_A719PrdNum, T01BQ2_A3345TipMovCc,
            T01BQ2_n3345TipMovCc, T01BQ2_A3839CcoCod, T01BQ2_n3839CcoCod
            }
            , new Object[] {
            T01BQ3_A11329H_stklin, T01BQ3_A11330H_stkEnt, T01BQ3_n11330H_stkEnt, T01BQ3_A11331H_stkSal, T01BQ3_n11331H_stkSal, T01BQ3_A11332H_stkDsc, T01BQ3_n11332H_stkDsc, T01BQ3_A11333H_stkpp, T01BQ3_n11333H_stkpp, T01BQ3_A11334H_stkFec,
            T01BQ3_n11334H_stkFec, T01BQ3_A11335H_stkhor, T01BQ3_n11335H_stkhor, T01BQ3_A11336H_stkUsu, T01BQ3_n11336H_stkUsu, T01BQ3_A11337H_stkPre, T01BQ3_n11337H_stkPre, T01BQ3_A11338H_stkPed, T01BQ3_n11338H_stkPed, T01BQ3_A11339H_stkAlb,
            T01BQ3_n11339H_stkAlb, T01BQ3_A11340H_stklot, T01BQ3_n11340H_stklot, T01BQ3_A11341H_stkexp, T01BQ3_n11341H_stkexp, T01BQ3_A11342H_stkfexp, T01BQ3_n11342H_stkfexp, T01BQ3_A11343H_stkprv, T01BQ3_n11343H_stkprv, T01BQ3_A11344H_stkhdr,
            T01BQ3_n11344H_stkhdr, T01BQ3_A11345H_stkr, T01BQ3_n11345H_stkr, T01BQ3_A11346H_stkp, T01BQ3_n11346H_stkp, T01BQ3_A11348H_stklen, T01BQ3_n11348H_stklen, T01BQ3_A396EmprCod, T01BQ3_A719PrdNum, T01BQ3_A3345TipMovCc,
            T01BQ3_n3345TipMovCc, T01BQ3_A3839CcoCod, T01BQ3_n3839CcoCod
            }
            , new Object[] {
            T01BQ4_A407EmprNom, T01BQ4_n407EmprNom
            }
            , new Object[] {
            T01BQ5_A718PrdNom
            }
            , new Object[] {
            T01BQ6_A3346TipMovCn, T01BQ6_n3346TipMovCn
            }
            , new Object[] {
            T01BQ7_A3839CcoCod
            }
            , new Object[] {
            T01BQ8_A11329H_stklin, T01BQ8_A407EmprNom, T01BQ8_n407EmprNom, T01BQ8_A718PrdNom, T01BQ8_A11330H_stkEnt, T01BQ8_n11330H_stkEnt, T01BQ8_A11331H_stkSal, T01BQ8_n11331H_stkSal, T01BQ8_A3346TipMovCn, T01BQ8_n3346TipMovCn,
            T01BQ8_A11332H_stkDsc, T01BQ8_n11332H_stkDsc, T01BQ8_A11333H_stkpp, T01BQ8_n11333H_stkpp, T01BQ8_A11334H_stkFec, T01BQ8_n11334H_stkFec, T01BQ8_A11335H_stkhor, T01BQ8_n11335H_stkhor, T01BQ8_A11336H_stkUsu, T01BQ8_n11336H_stkUsu,
            T01BQ8_A11337H_stkPre, T01BQ8_n11337H_stkPre, T01BQ8_A11338H_stkPed, T01BQ8_n11338H_stkPed, T01BQ8_A11339H_stkAlb, T01BQ8_n11339H_stkAlb, T01BQ8_A11340H_stklot, T01BQ8_n11340H_stklot, T01BQ8_A11341H_stkexp, T01BQ8_n11341H_stkexp,
            T01BQ8_A11342H_stkfexp, T01BQ8_n11342H_stkfexp, T01BQ8_A11343H_stkprv, T01BQ8_n11343H_stkprv, T01BQ8_A11344H_stkhdr, T01BQ8_n11344H_stkhdr, T01BQ8_A11345H_stkr, T01BQ8_n11345H_stkr, T01BQ8_A11346H_stkp, T01BQ8_n11346H_stkp,
            T01BQ8_A11348H_stklen, T01BQ8_n11348H_stklen, T01BQ8_A396EmprCod, T01BQ8_A719PrdNum, T01BQ8_A3345TipMovCc, T01BQ8_n3345TipMovCc, T01BQ8_A3839CcoCod, T01BQ8_n3839CcoCod
            }
            , new Object[] {
            T01BQ9_A3346TipMovCn, T01BQ9_n3346TipMovCn
            }
            , new Object[] {
            T01BQ10_A718PrdNom
            }
            , new Object[] {
            T01BQ11_A3839CcoCod
            }
            , new Object[] {
            T01BQ12_A396EmprCod, T01BQ12_A719PrdNum, T01BQ12_A11329H_stklin
            }
            , new Object[] {
            T01BQ13_A396EmprCod, T01BQ13_A719PrdNum, T01BQ13_A11329H_stklin
            }
            , new Object[] {
            T01BQ14_A396EmprCod, T01BQ14_A719PrdNum, T01BQ14_A11329H_stklin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BQ18_A718PrdNom
            }
            , new Object[] {
            T01BQ19_A3346TipMovCn, T01BQ19_n3346TipMovCn
            }
            , new Object[] {
            T01BQ20_A396EmprCod, T01BQ20_A719PrdNum, T01BQ20_A11329H_stklin
            }
            , new Object[] {
            T01BQ21_A407EmprNom, T01BQ21_n407EmprNom
            }
            , new Object[] {
            T01BQ22_A3839CcoCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THCCSTKS" ;
   }

   private byte Z11341H_stkexp ;
   private byte Z11345H_stkr ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11341H_stkexp ;
   private byte A11345H_stkr ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11341H_stkexp ;
   private byte ZZ11345H_stkr ;
   private short Z11348H_stklen ;
   private short Z3839CcoCod ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11348H_stklen ;
   private short RcdFound1513 ;
   private short nIsDirty_1513 ;
   private short ZZ3839CcoCod ;
   private short ZZ11348H_stklen ;
   private int Z11338H_stkPed ;
   private int Z11343H_stkprv ;
   private int Z11344H_stkhdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtH_stklin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtH_stkEnt_Enabled ;
   private int edtH_stkSal_Enabled ;
   private int edtTipMovCc_Enabled ;
   private int edtTipMovCn_Enabled ;
   private int edtH_stkDsc_Enabled ;
   private int edtH_stkpp_Enabled ;
   private int edtH_stkFec_Enabled ;
   private int edtH_stkhor_Enabled ;
   private int edtH_stkUsu_Enabled ;
   private int edtH_stkPre_Enabled ;
   private int A11338H_stkPed ;
   private int edtH_stkPed_Enabled ;
   private int edtH_stkAlb_Enabled ;
   private int edtCcoCod_Enabled ;
   private int edtH_stklot_Enabled ;
   private int edtH_stkexp_Enabled ;
   private int edtH_stkfexp_Enabled ;
   private int A11343H_stkprv ;
   private int edtH_stkprv_Enabled ;
   private int A11344H_stkhdr ;
   private int edtH_stkhdr_Enabled ;
   private int edtH_stkr_Enabled ;
   private int edtH_stkp_Enabled ;
   private int edtH_stklen_Enabled ;
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
   private int edtH_stklen_Backcolor ;
   private int edtH_stkp_Backcolor ;
   private int edtH_stkr_Backcolor ;
   private int edtH_stkhdr_Backcolor ;
   private int edtH_stkprv_Backcolor ;
   private int edtH_stkfexp_Backcolor ;
   private int edtH_stkexp_Backcolor ;
   private int edtH_stklot_Backcolor ;
   private int edtCcoCod_Backcolor ;
   private int edtH_stkAlb_Backcolor ;
   private int edtH_stkPed_Backcolor ;
   private int edtH_stkPre_Backcolor ;
   private int edtH_stkUsu_Backcolor ;
   private int edtH_stkhor_Backcolor ;
   private int edtH_stkFec_Backcolor ;
   private int edtH_stkpp_Backcolor ;
   private int edtH_stkDsc_Backcolor ;
   private int edtTipMovCn_Backcolor ;
   private int edtTipMovCc_Backcolor ;
   private int edtH_stkSal_Backcolor ;
   private int edtH_stkEnt_Backcolor ;
   private int edtH_stklin_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11338H_stkPed ;
   private int ZZ11343H_stkprv ;
   private int ZZ11344H_stkhdr ;
   private long Z11329H_stklin ;
   private long A11329H_stklin ;
   private long ZZ11329H_stklin ;
   private java.math.BigDecimal Z11330H_stkEnt ;
   private java.math.BigDecimal Z11331H_stkSal ;
   private java.math.BigDecimal Z11337H_stkPre ;
   private java.math.BigDecimal A11330H_stkEnt ;
   private java.math.BigDecimal A11331H_stkSal ;
   private java.math.BigDecimal A11337H_stkPre ;
   private java.math.BigDecimal ZZ11330H_stkEnt ;
   private java.math.BigDecimal ZZ11331H_stkSal ;
   private java.math.BigDecimal ZZ11337H_stkPre ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11332H_stkDsc ;
   private String Z11333H_stkpp ;
   private String Z11335H_stkhor ;
   private String Z11336H_stkUsu ;
   private String Z11339H_stkAlb ;
   private String Z11340H_stklot ;
   private String Z11346H_stkp ;
   private String Z3345TipMovCc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
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
   private String edtPrdNum_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtH_stklin_Internalname ;
   private String edtH_stklin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtH_stkEnt_Internalname ;
   private String edtH_stkEnt_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtH_stkSal_Internalname ;
   private String edtH_stkSal_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTipMovCc_Internalname ;
   private String edtTipMovCc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipMovCn_Internalname ;
   private String A3346TipMovCn ;
   private String edtTipMovCn_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtH_stkDsc_Internalname ;
   private String A11332H_stkDsc ;
   private String edtH_stkDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtH_stkpp_Internalname ;
   private String A11333H_stkpp ;
   private String edtH_stkpp_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtH_stkFec_Internalname ;
   private String edtH_stkFec_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtH_stkhor_Internalname ;
   private String A11335H_stkhor ;
   private String edtH_stkhor_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtH_stkUsu_Internalname ;
   private String A11336H_stkUsu ;
   private String edtH_stkUsu_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtH_stkPre_Internalname ;
   private String edtH_stkPre_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtH_stkPed_Internalname ;
   private String edtH_stkPed_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtH_stkAlb_Internalname ;
   private String A11339H_stkAlb ;
   private String edtH_stkAlb_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtCcoCod_Internalname ;
   private String edtCcoCod_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtH_stklot_Internalname ;
   private String A11340H_stklot ;
   private String edtH_stklot_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtH_stkexp_Internalname ;
   private String edtH_stkexp_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtH_stkfexp_Internalname ;
   private String edtH_stkfexp_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtH_stkprv_Internalname ;
   private String edtH_stkprv_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtH_stkhdr_Internalname ;
   private String edtH_stkhdr_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtH_stkr_Internalname ;
   private String edtH_stkr_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtH_stkp_Internalname ;
   private String A11346H_stkp ;
   private String edtH_stkp_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtH_stklen_Internalname ;
   private String edtH_stklen_Jsonclick ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z3346TipMovCn ;
   private String sMode1513 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ407EmprNom ;
   private String ZZ3345TipMovCc ;
   private String ZZ11332H_stkDsc ;
   private String ZZ11333H_stkpp ;
   private String ZZ11335H_stkhor ;
   private String ZZ11336H_stkUsu ;
   private String ZZ11339H_stkAlb ;
   private String ZZ11340H_stklot ;
   private String ZZ11346H_stkp ;
   private String ZZ3346TipMovCn ;
   private String ZZ718PrdNom ;
   private java.util.Date Z11334H_stkFec ;
   private java.util.Date Z11342H_stkfexp ;
   private java.util.Date A11334H_stkFec ;
   private java.util.Date A11342H_stkfexp ;
   private java.util.Date ZZ11334H_stkFec ;
   private java.util.Date ZZ11342H_stkfexp ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3345TipMovCc ;
   private boolean n3839CcoCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n11330H_stkEnt ;
   private boolean n11331H_stkSal ;
   private boolean n3346TipMovCn ;
   private boolean n11332H_stkDsc ;
   private boolean n11333H_stkpp ;
   private boolean n11334H_stkFec ;
   private boolean n11335H_stkhor ;
   private boolean n11336H_stkUsu ;
   private boolean n11337H_stkPre ;
   private boolean n11338H_stkPed ;
   private boolean n11339H_stkAlb ;
   private boolean n11340H_stklot ;
   private boolean n11341H_stkexp ;
   private boolean n11342H_stkfexp ;
   private boolean n11343H_stkprv ;
   private boolean n11344H_stkhdr ;
   private boolean n11345H_stkr ;
   private boolean n11346H_stkp ;
   private boolean n11348H_stklen ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01BQ4_A407EmprNom ;
   private boolean[] T01BQ4_n407EmprNom ;
   private long[] T01BQ8_A11329H_stklin ;
   private String[] T01BQ8_A407EmprNom ;
   private boolean[] T01BQ8_n407EmprNom ;
   private String[] T01BQ8_A718PrdNom ;
   private java.math.BigDecimal[] T01BQ8_A11330H_stkEnt ;
   private boolean[] T01BQ8_n11330H_stkEnt ;
   private java.math.BigDecimal[] T01BQ8_A11331H_stkSal ;
   private boolean[] T01BQ8_n11331H_stkSal ;
   private String[] T01BQ8_A3346TipMovCn ;
   private boolean[] T01BQ8_n3346TipMovCn ;
   private String[] T01BQ8_A11332H_stkDsc ;
   private boolean[] T01BQ8_n11332H_stkDsc ;
   private String[] T01BQ8_A11333H_stkpp ;
   private boolean[] T01BQ8_n11333H_stkpp ;
   private java.util.Date[] T01BQ8_A11334H_stkFec ;
   private boolean[] T01BQ8_n11334H_stkFec ;
   private String[] T01BQ8_A11335H_stkhor ;
   private boolean[] T01BQ8_n11335H_stkhor ;
   private String[] T01BQ8_A11336H_stkUsu ;
   private boolean[] T01BQ8_n11336H_stkUsu ;
   private java.math.BigDecimal[] T01BQ8_A11337H_stkPre ;
   private boolean[] T01BQ8_n11337H_stkPre ;
   private int[] T01BQ8_A11338H_stkPed ;
   private boolean[] T01BQ8_n11338H_stkPed ;
   private String[] T01BQ8_A11339H_stkAlb ;
   private boolean[] T01BQ8_n11339H_stkAlb ;
   private String[] T01BQ8_A11340H_stklot ;
   private boolean[] T01BQ8_n11340H_stklot ;
   private byte[] T01BQ8_A11341H_stkexp ;
   private boolean[] T01BQ8_n11341H_stkexp ;
   private java.util.Date[] T01BQ8_A11342H_stkfexp ;
   private boolean[] T01BQ8_n11342H_stkfexp ;
   private int[] T01BQ8_A11343H_stkprv ;
   private boolean[] T01BQ8_n11343H_stkprv ;
   private int[] T01BQ8_A11344H_stkhdr ;
   private boolean[] T01BQ8_n11344H_stkhdr ;
   private byte[] T01BQ8_A11345H_stkr ;
   private boolean[] T01BQ8_n11345H_stkr ;
   private String[] T01BQ8_A11346H_stkp ;
   private boolean[] T01BQ8_n11346H_stkp ;
   private short[] T01BQ8_A11348H_stklen ;
   private boolean[] T01BQ8_n11348H_stklen ;
   private String[] T01BQ8_A396EmprCod ;
   private String[] T01BQ8_A719PrdNum ;
   private String[] T01BQ8_A3345TipMovCc ;
   private boolean[] T01BQ8_n3345TipMovCc ;
   private short[] T01BQ8_A3839CcoCod ;
   private boolean[] T01BQ8_n3839CcoCod ;
   private String[] T01BQ6_A3346TipMovCn ;
   private boolean[] T01BQ6_n3346TipMovCn ;
   private String[] T01BQ5_A718PrdNom ;
   private short[] T01BQ7_A3839CcoCod ;
   private boolean[] T01BQ7_n3839CcoCod ;
   private String[] T01BQ9_A3346TipMovCn ;
   private boolean[] T01BQ9_n3346TipMovCn ;
   private String[] T01BQ10_A718PrdNom ;
   private short[] T01BQ11_A3839CcoCod ;
   private boolean[] T01BQ11_n3839CcoCod ;
   private String[] T01BQ12_A396EmprCod ;
   private String[] T01BQ12_A719PrdNum ;
   private long[] T01BQ12_A11329H_stklin ;
   private long[] T01BQ3_A11329H_stklin ;
   private java.math.BigDecimal[] T01BQ3_A11330H_stkEnt ;
   private boolean[] T01BQ3_n11330H_stkEnt ;
   private java.math.BigDecimal[] T01BQ3_A11331H_stkSal ;
   private boolean[] T01BQ3_n11331H_stkSal ;
   private String[] T01BQ3_A11332H_stkDsc ;
   private boolean[] T01BQ3_n11332H_stkDsc ;
   private String[] T01BQ3_A11333H_stkpp ;
   private boolean[] T01BQ3_n11333H_stkpp ;
   private java.util.Date[] T01BQ3_A11334H_stkFec ;
   private boolean[] T01BQ3_n11334H_stkFec ;
   private String[] T01BQ3_A11335H_stkhor ;
   private boolean[] T01BQ3_n11335H_stkhor ;
   private String[] T01BQ3_A11336H_stkUsu ;
   private boolean[] T01BQ3_n11336H_stkUsu ;
   private java.math.BigDecimal[] T01BQ3_A11337H_stkPre ;
   private boolean[] T01BQ3_n11337H_stkPre ;
   private int[] T01BQ3_A11338H_stkPed ;
   private boolean[] T01BQ3_n11338H_stkPed ;
   private String[] T01BQ3_A11339H_stkAlb ;
   private boolean[] T01BQ3_n11339H_stkAlb ;
   private String[] T01BQ3_A11340H_stklot ;
   private boolean[] T01BQ3_n11340H_stklot ;
   private byte[] T01BQ3_A11341H_stkexp ;
   private boolean[] T01BQ3_n11341H_stkexp ;
   private java.util.Date[] T01BQ3_A11342H_stkfexp ;
   private boolean[] T01BQ3_n11342H_stkfexp ;
   private int[] T01BQ3_A11343H_stkprv ;
   private boolean[] T01BQ3_n11343H_stkprv ;
   private int[] T01BQ3_A11344H_stkhdr ;
   private boolean[] T01BQ3_n11344H_stkhdr ;
   private byte[] T01BQ3_A11345H_stkr ;
   private boolean[] T01BQ3_n11345H_stkr ;
   private String[] T01BQ3_A11346H_stkp ;
   private boolean[] T01BQ3_n11346H_stkp ;
   private short[] T01BQ3_A11348H_stklen ;
   private boolean[] T01BQ3_n11348H_stklen ;
   private String[] T01BQ3_A396EmprCod ;
   private String[] T01BQ3_A719PrdNum ;
   private String[] T01BQ3_A3345TipMovCc ;
   private boolean[] T01BQ3_n3345TipMovCc ;
   private short[] T01BQ3_A3839CcoCod ;
   private boolean[] T01BQ3_n3839CcoCod ;
   private String[] T01BQ13_A396EmprCod ;
   private String[] T01BQ13_A719PrdNum ;
   private long[] T01BQ13_A11329H_stklin ;
   private String[] T01BQ14_A396EmprCod ;
   private String[] T01BQ14_A719PrdNum ;
   private long[] T01BQ14_A11329H_stklin ;
   private long[] T01BQ2_A11329H_stklin ;
   private java.math.BigDecimal[] T01BQ2_A11330H_stkEnt ;
   private boolean[] T01BQ2_n11330H_stkEnt ;
   private java.math.BigDecimal[] T01BQ2_A11331H_stkSal ;
   private boolean[] T01BQ2_n11331H_stkSal ;
   private String[] T01BQ2_A11332H_stkDsc ;
   private boolean[] T01BQ2_n11332H_stkDsc ;
   private String[] T01BQ2_A11333H_stkpp ;
   private boolean[] T01BQ2_n11333H_stkpp ;
   private java.util.Date[] T01BQ2_A11334H_stkFec ;
   private boolean[] T01BQ2_n11334H_stkFec ;
   private String[] T01BQ2_A11335H_stkhor ;
   private boolean[] T01BQ2_n11335H_stkhor ;
   private String[] T01BQ2_A11336H_stkUsu ;
   private boolean[] T01BQ2_n11336H_stkUsu ;
   private java.math.BigDecimal[] T01BQ2_A11337H_stkPre ;
   private boolean[] T01BQ2_n11337H_stkPre ;
   private int[] T01BQ2_A11338H_stkPed ;
   private boolean[] T01BQ2_n11338H_stkPed ;
   private String[] T01BQ2_A11339H_stkAlb ;
   private boolean[] T01BQ2_n11339H_stkAlb ;
   private String[] T01BQ2_A11340H_stklot ;
   private boolean[] T01BQ2_n11340H_stklot ;
   private byte[] T01BQ2_A11341H_stkexp ;
   private boolean[] T01BQ2_n11341H_stkexp ;
   private java.util.Date[] T01BQ2_A11342H_stkfexp ;
   private boolean[] T01BQ2_n11342H_stkfexp ;
   private int[] T01BQ2_A11343H_stkprv ;
   private boolean[] T01BQ2_n11343H_stkprv ;
   private int[] T01BQ2_A11344H_stkhdr ;
   private boolean[] T01BQ2_n11344H_stkhdr ;
   private byte[] T01BQ2_A11345H_stkr ;
   private boolean[] T01BQ2_n11345H_stkr ;
   private String[] T01BQ2_A11346H_stkp ;
   private boolean[] T01BQ2_n11346H_stkp ;
   private short[] T01BQ2_A11348H_stklen ;
   private boolean[] T01BQ2_n11348H_stklen ;
   private String[] T01BQ2_A396EmprCod ;
   private String[] T01BQ2_A719PrdNum ;
   private String[] T01BQ2_A3345TipMovCc ;
   private boolean[] T01BQ2_n3345TipMovCc ;
   private short[] T01BQ2_A3839CcoCod ;
   private boolean[] T01BQ2_n3839CcoCod ;
   private String[] T01BQ18_A718PrdNom ;
   private String[] T01BQ19_A3346TipMovCn ;
   private boolean[] T01BQ19_n3346TipMovCn ;
   private String[] T01BQ20_A396EmprCod ;
   private String[] T01BQ20_A719PrdNum ;
   private long[] T01BQ20_A11329H_stklin ;
   private String[] T01BQ21_A407EmprNom ;
   private boolean[] T01BQ21_n407EmprNom ;
   private short[] T01BQ22_A3839CcoCod ;
   private boolean[] T01BQ22_n3839CcoCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thccstks__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thccstks__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thccstks__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thccstks__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thccstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BQ2", "SELECT H_stklin, H_stkEnt, H_stkSal, H_stkDsc, H_stkpp, H_stkFec, H_stkhor, H_stkUsu, H_stkPre, H_stkPed, H_stkAlb, H_stklot, H_stkexp, H_stkfexp, H_stkprv, H_stkhdr, H_stkr, H_stkp, H_stklen, EmprCod, PrdNum, TipMovCc, CcoCod FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ? AND H_stklin = ?  FOR UPDATE OF H_stkEnt, H_stkSal, H_stkDsc, H_stkpp, H_stkFec, H_stkhor, H_stkUsu, H_stkPre, H_stkPed, H_stkAlb, H_stklot, H_stkexp, H_stkfexp, H_stkprv, H_stkhdr, H_stkr, H_stkp, H_stklen, TipMovCc, CcoCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ3", "SELECT H_stklin, H_stkEnt, H_stkSal, H_stkDsc, H_stkpp, H_stkFec, H_stkhor, H_stkUsu, H_stkPre, H_stkPed, H_stkAlb, H_stklot, H_stkexp, H_stkfexp, H_stkprv, H_stkhdr, H_stkr, H_stkp, H_stklen, EmprCod, PrdNum, TipMovCc, CcoCod FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ? AND H_stklin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ5", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ6", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ7", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ8", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_stklin, T2.EmprNom, T3.PrdNom, TM1.H_stkEnt, TM1.H_stkSal, T4.TipMovCn, TM1.H_stkDsc, TM1.H_stkpp, TM1.H_stkFec, TM1.H_stkhor, TM1.H_stkUsu, TM1.H_stkPre, TM1.H_stkPed, TM1.H_stkAlb, TM1.H_stklot, TM1.H_stkexp, TM1.H_stkfexp, TM1.H_stkprv, TM1.H_stkhdr, TM1.H_stkr, TM1.H_stkp, TM1.H_stklen, TM1.EmprCod, TM1.PrdNum, TM1.TipMovCc, TM1.CcoCod FROM (((TXPHCCSTK TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPTIPMOV T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipMovCc = TM1.TipMovCc) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.H_stklin = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.H_stklin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ9", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ10", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ11", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ? AND H_stklin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE ( PrdNum > ? or PrdNum = ? and H_stklin > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum, H_stklin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BQ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE ( PrdNum < ? or PrdNum = ? and H_stklin < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC, H_stklin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BQ15", "INSERT INTO TXPHCCSTK(H_stklin, H_stkEnt, H_stkSal, H_stkDsc, H_stkpp, H_stkFec, H_stkhor, H_stkUsu, H_stkPre, H_stkPed, H_stkAlb, H_stklot, H_stkexp, H_stkfexp, H_stkprv, H_stkhdr, H_stkr, H_stkp, H_stklen, EmprCod, PrdNum, TipMovCc, CcoCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHCCSTK")
         ,new UpdateCursor("T01BQ16", "UPDATE TXPHCCSTK SET H_stkEnt=?, H_stkSal=?, H_stkDsc=?, H_stkpp=?, H_stkFec=?, H_stkhor=?, H_stkUsu=?, H_stkPre=?, H_stkPed=?, H_stkAlb=?, H_stklot=?, H_stkexp=?, H_stkfexp=?, H_stkprv=?, H_stkhdr=?, H_stkr=?, H_stkp=?, H_stklen=?, TipMovCc=?, CcoCod=?  WHERE EmprCod = ? AND PrdNum = ? AND H_stklin = ?", GX_NOMASK, "TXPHCCSTK")
         ,new UpdateCursor("T01BQ17", "DELETE FROM TXPHCCSTK  WHERE EmprCod = ? AND PrdNum = ? AND H_stklin = ?", GX_NOMASK, "TXPHCCSTK")
         ,new ForEachCursor("T01BQ18", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ19", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? ORDER BY EmprCod, PrdNum, H_stklin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BQ22", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((String[]) buf[38])[0] = rslt.getString(21, 6);
               ((String[]) buf[39])[0] = rslt.getString(22, 2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 3);
               ((String[]) buf[38])[0] = rslt.getString(21, 6);
               ((String[]) buf[39])[0] = rslt.getString(22, 2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 3);
               ((String[]) buf[43])[0] = rslt.getString(24, 6);
               ((String[]) buf[44])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 4);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 30);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 8);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 26);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[26]);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[36]).shortValue());
               }
               stmt.setString(20, (String)parms[37], 3);
               stmt.setString(21, (String)parms[38], 6);
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[42]).shortValue());
               }
               return;
            case 14 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 26);
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
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[25]);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               stmt.setString(21, (String)parms[40], 3);
               stmt.setString(22, (String)parms[41], 6);
               stmt.setLong(23, ((Number) parms[42]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
      }
   }

}

