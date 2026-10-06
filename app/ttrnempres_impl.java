package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrnempres_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", ""), (short)(0)) ;
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

   public ttrnempres_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrnempres_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrnempres_impl.class ));
   }

   public ttrnempres_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrnEMPRES.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Quebra Productos", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpQuePrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3562EmpQuePrd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpQuePrd_Enabled!=0) ? localUtil.format( A3562EmpQuePrd, "ZZ9.99") : localUtil.format( A3562EmpQuePrd, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpQuePrd_Jsonclick, 0, "", "", "", "", "", 1, edtEmpQuePrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Quebra Colorantes", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpQueCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3563EmpQueCol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpQueCol_Enabled!=0) ? localUtil.format( A3563EmpQueCol, "ZZ9.99") : localUtil.format( A3563EmpQueCol, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpQueCol_Jsonclick, 0, "", "", "", "", "", 1, edtEmpQueCol_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Quebra Sodicos", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpQueSod_Internalname, GXutil.ltrim( localUtil.ntoc( A3564EmpQueSod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpQueSod_Enabled!=0) ? localUtil.format( A3564EmpQueSod, "ZZ9.99") : localUtil.format( A3564EmpQueSod, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpQueSod_Jsonclick, 0, "", "", "", "", "", 1, edtEmpQueSod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Coste Industrial", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpCosInd_Internalname, GXutil.ltrim( localUtil.ntoc( A3565EmpCosInd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpCosInd_Enabled!=0) ? localUtil.format( A3565EmpCosInd, "ZZZZZ9.99") : localUtil.format( A3565EmpCosInd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpCosInd_Jsonclick, 0, "", "", "", "", "", 1, edtEmpCosInd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Gastos Generales", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpGasGen_Internalname, GXutil.ltrim( localUtil.ntoc( A3566EmpGasGen, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpGasGen_Enabled!=0) ? localUtil.format( A3566EmpGasGen, "ZZZZZ9.99") : localUtil.format( A3566EmpGasGen, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpGasGen_Jsonclick, 0, "", "", "", "", "", 1, edtEmpGasGen_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Margen Comercial", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpMarCom_Internalname, GXutil.ltrim( localUtil.ntoc( A3567EmpMarCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpMarCom_Enabled!=0) ? localUtil.format( A3567EmpMarCom, "ZZ9.99") : localUtil.format( A3567EmpMarCom, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpMarCom_Jsonclick, 0, "", "", "", "", "", 1, edtEmpMarCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Coste Tintura", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpCosTin_Internalname, GXutil.ltrim( localUtil.ntoc( A3568EmpCosTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpCosTin_Enabled!=0) ? localUtil.format( A3568EmpCosTin, "ZZZZZ9.99") : localUtil.format( A3568EmpCosTin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpCosTin_Jsonclick, 0, "", "", "", "", "", 1, edtEmpCosTin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Relacion de Baño", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnEMPRES.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpRelBan_Internalname, GXutil.ltrim( localUtil.ntoc( A3734EmpRelBan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpRelBan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3734EmpRelBan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3734EmpRelBan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpRelBan_Jsonclick, 0, "", "", "", "", "", 1, edtEmpRelBan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrnEMPRES.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnEMPRES.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrnEMPRES.htm");
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
         Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
         Z3562EmpQuePrd = localUtil.ctond( httpContext.cgiGet( "Z3562EmpQuePrd")) ;
         Z3563EmpQueCol = localUtil.ctond( httpContext.cgiGet( "Z3563EmpQueCol")) ;
         Z3564EmpQueSod = localUtil.ctond( httpContext.cgiGet( "Z3564EmpQueSod")) ;
         Z3565EmpCosInd = localUtil.ctond( httpContext.cgiGet( "Z3565EmpCosInd")) ;
         Z3566EmpGasGen = localUtil.ctond( httpContext.cgiGet( "Z3566EmpGasGen")) ;
         Z3567EmpMarCom = localUtil.ctond( httpContext.cgiGet( "Z3567EmpMarCom")) ;
         Z3568EmpCosTin = localUtil.ctond( httpContext.cgiGet( "Z3568EmpCosTin")) ;
         Z3734EmpRelBan = (short)(localUtil.ctol( httpContext.cgiGet( "Z3734EmpRelBan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpQuePrd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpQuePrd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPQUEPRD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpQuePrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3562EmpQuePrd = DecimalUtil.ZERO ;
            n3562EmpQuePrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrimstr( A3562EmpQuePrd, 6, 2));
         }
         else
         {
            A3562EmpQuePrd = localUtil.ctond( httpContext.cgiGet( edtEmpQuePrd_Internalname)) ;
            n3562EmpQuePrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrimstr( A3562EmpQuePrd, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpQueCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpQueCol_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPQUECOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpQueCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3563EmpQueCol = DecimalUtil.ZERO ;
            n3563EmpQueCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrimstr( A3563EmpQueCol, 6, 2));
         }
         else
         {
            A3563EmpQueCol = localUtil.ctond( httpContext.cgiGet( edtEmpQueCol_Internalname)) ;
            n3563EmpQueCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrimstr( A3563EmpQueCol, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpQueSod_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpQueSod_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPQUESOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpQueSod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3564EmpQueSod = DecimalUtil.ZERO ;
            n3564EmpQueSod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrimstr( A3564EmpQueSod, 6, 2));
         }
         else
         {
            A3564EmpQueSod = localUtil.ctond( httpContext.cgiGet( edtEmpQueSod_Internalname)) ;
            n3564EmpQueSod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrimstr( A3564EmpQueSod, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpCosInd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpCosInd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPCOSIND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpCosInd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3565EmpCosInd = DecimalUtil.ZERO ;
            n3565EmpCosInd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrimstr( A3565EmpCosInd, 9, 2));
         }
         else
         {
            A3565EmpCosInd = localUtil.ctond( httpContext.cgiGet( edtEmpCosInd_Internalname)) ;
            n3565EmpCosInd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrimstr( A3565EmpCosInd, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpGasGen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpGasGen_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPGASGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpGasGen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3566EmpGasGen = DecimalUtil.ZERO ;
            n3566EmpGasGen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrimstr( A3566EmpGasGen, 9, 2));
         }
         else
         {
            A3566EmpGasGen = localUtil.ctond( httpContext.cgiGet( edtEmpGasGen_Internalname)) ;
            n3566EmpGasGen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrimstr( A3566EmpGasGen, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpMarCom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpMarCom_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPMARCOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpMarCom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3567EmpMarCom = DecimalUtil.ZERO ;
            n3567EmpMarCom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrimstr( A3567EmpMarCom, 6, 2));
         }
         else
         {
            A3567EmpMarCom = localUtil.ctond( httpContext.cgiGet( edtEmpMarCom_Internalname)) ;
            n3567EmpMarCom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrimstr( A3567EmpMarCom, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEmpCosTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEmpCosTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPCOSTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpCosTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3568EmpCosTin = DecimalUtil.ZERO ;
            n3568EmpCosTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrimstr( A3568EmpCosTin, 9, 2));
         }
         else
         {
            A3568EmpCosTin = localUtil.ctond( httpContext.cgiGet( edtEmpCosTin_Internalname)) ;
            n3568EmpCosTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrimstr( A3568EmpCosTin, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEmpRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEmpRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "EMPRELBAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmpRelBan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3734EmpRelBan = (short)(0) ;
            n3734EmpRelBan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3734EmpRelBan), 4, 0));
         }
         else
         {
            A3734EmpRelBan = (short)(localUtil.ctol( httpContext.cgiGet( edtEmpRelBan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3734EmpRelBan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3734EmpRelBan), 4, 0));
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
            initAll1FC27( ) ;
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
      disableAttributes1FC27( ) ;
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

   public void confirm_1FC0( )
   {
      beforeValidate1FC27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FC27( ) ;
         }
         else
         {
            checkExtendedTable1FC27( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1FC27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1FC0( ) ;
      }
   }

   public void resetCaption1FC0( )
   {
   }

   public void zm1FC27( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T01FC3_A407EmprNom[0] ;
            Z3562EmpQuePrd = T01FC3_A3562EmpQuePrd[0] ;
            Z3563EmpQueCol = T01FC3_A3563EmpQueCol[0] ;
            Z3564EmpQueSod = T01FC3_A3564EmpQueSod[0] ;
            Z3565EmpCosInd = T01FC3_A3565EmpCosInd[0] ;
            Z3566EmpGasGen = T01FC3_A3566EmpGasGen[0] ;
            Z3567EmpMarCom = T01FC3_A3567EmpMarCom[0] ;
            Z3568EmpCosTin = T01FC3_A3568EmpCosTin[0] ;
            Z3734EmpRelBan = T01FC3_A3734EmpRelBan[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z3562EmpQuePrd = A3562EmpQuePrd ;
            Z3563EmpQueCol = A3563EmpQueCol ;
            Z3564EmpQueSod = A3564EmpQueSod ;
            Z3565EmpCosInd = A3565EmpCosInd ;
            Z3566EmpGasGen = A3566EmpGasGen ;
            Z3567EmpMarCom = A3567EmpMarCom ;
            Z3568EmpCosTin = A3568EmpCosTin ;
            Z3734EmpRelBan = A3734EmpRelBan ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z3562EmpQuePrd = A3562EmpQuePrd ;
         Z3563EmpQueCol = A3563EmpQueCol ;
         Z3564EmpQueSod = A3564EmpQueSod ;
         Z3565EmpCosInd = A3565EmpCosInd ;
         Z3566EmpGasGen = A3566EmpGasGen ;
         Z3567EmpMarCom = A3567EmpMarCom ;
         Z3568EmpCosTin = A3568EmpCosTin ;
         Z3734EmpRelBan = A3734EmpRelBan ;
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

   public void load1FC27( )
   {
      /* Using cursor T01FC4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T01FC4_A407EmprNom[0] ;
         n407EmprNom = T01FC4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3562EmpQuePrd = T01FC4_A3562EmpQuePrd[0] ;
         n3562EmpQuePrd = T01FC4_n3562EmpQuePrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrimstr( A3562EmpQuePrd, 6, 2));
         A3563EmpQueCol = T01FC4_A3563EmpQueCol[0] ;
         n3563EmpQueCol = T01FC4_n3563EmpQueCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrimstr( A3563EmpQueCol, 6, 2));
         A3564EmpQueSod = T01FC4_A3564EmpQueSod[0] ;
         n3564EmpQueSod = T01FC4_n3564EmpQueSod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrimstr( A3564EmpQueSod, 6, 2));
         A3565EmpCosInd = T01FC4_A3565EmpCosInd[0] ;
         n3565EmpCosInd = T01FC4_n3565EmpCosInd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrimstr( A3565EmpCosInd, 9, 2));
         A3566EmpGasGen = T01FC4_A3566EmpGasGen[0] ;
         n3566EmpGasGen = T01FC4_n3566EmpGasGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrimstr( A3566EmpGasGen, 9, 2));
         A3567EmpMarCom = T01FC4_A3567EmpMarCom[0] ;
         n3567EmpMarCom = T01FC4_n3567EmpMarCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrimstr( A3567EmpMarCom, 6, 2));
         A3568EmpCosTin = T01FC4_A3568EmpCosTin[0] ;
         n3568EmpCosTin = T01FC4_n3568EmpCosTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrimstr( A3568EmpCosTin, 9, 2));
         A3734EmpRelBan = T01FC4_A3734EmpRelBan[0] ;
         n3734EmpRelBan = T01FC4_n3734EmpRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3734EmpRelBan), 4, 0));
         zm1FC27( -1) ;
      }
      pr_default.close(2);
      onLoadActions1FC27( ) ;
   }

   public void onLoadActions1FC27( )
   {
   }

   public void checkExtendedTable1FC27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FC27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FC27( )
   {
      /* Using cursor T01FC5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FC3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1FC27( 1) ;
         RcdFound27 = (short)(1) ;
         A396EmprCod = T01FC3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = T01FC3_A407EmprNom[0] ;
         n407EmprNom = T01FC3_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3562EmpQuePrd = T01FC3_A3562EmpQuePrd[0] ;
         n3562EmpQuePrd = T01FC3_n3562EmpQuePrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrimstr( A3562EmpQuePrd, 6, 2));
         A3563EmpQueCol = T01FC3_A3563EmpQueCol[0] ;
         n3563EmpQueCol = T01FC3_n3563EmpQueCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrimstr( A3563EmpQueCol, 6, 2));
         A3564EmpQueSod = T01FC3_A3564EmpQueSod[0] ;
         n3564EmpQueSod = T01FC3_n3564EmpQueSod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrimstr( A3564EmpQueSod, 6, 2));
         A3565EmpCosInd = T01FC3_A3565EmpCosInd[0] ;
         n3565EmpCosInd = T01FC3_n3565EmpCosInd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrimstr( A3565EmpCosInd, 9, 2));
         A3566EmpGasGen = T01FC3_A3566EmpGasGen[0] ;
         n3566EmpGasGen = T01FC3_n3566EmpGasGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrimstr( A3566EmpGasGen, 9, 2));
         A3567EmpMarCom = T01FC3_A3567EmpMarCom[0] ;
         n3567EmpMarCom = T01FC3_n3567EmpMarCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrimstr( A3567EmpMarCom, 6, 2));
         A3568EmpCosTin = T01FC3_A3568EmpCosTin[0] ;
         n3568EmpCosTin = T01FC3_n3568EmpCosTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrimstr( A3568EmpCosTin, 9, 2));
         A3734EmpRelBan = T01FC3_A3734EmpRelBan[0] ;
         n3734EmpRelBan = T01FC3_n3734EmpRelBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3734EmpRelBan), 4, 0));
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FC27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey1FC27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey1FC27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1FC27( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T01FC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01FC6_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T01FC6_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A396EmprCod = T01FC6_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T01FC7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01FC7_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01FC7_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A396EmprCod = T01FC7_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FC27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FC27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               update1FC27( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FC27( ) ;
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
                  insert1FC27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      getKey1FC27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnempres");
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FC0( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FC27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FC27( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      scanStart1FC27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNext1FC27( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FC27( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FC27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FC2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z407EmprNom, T01FC2_A407EmprNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z3562EmpQuePrd, T01FC2_A3562EmpQuePrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z3563EmpQueCol, T01FC2_A3563EmpQueCol[0]) != 0 ) || ( DecimalUtil.compareTo(Z3564EmpQueSod, T01FC2_A3564EmpQueSod[0]) != 0 ) || ( DecimalUtil.compareTo(Z3565EmpCosInd, T01FC2_A3565EmpCosInd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3566EmpGasGen, T01FC2_A3566EmpGasGen[0]) != 0 ) || ( DecimalUtil.compareTo(Z3567EmpMarCom, T01FC2_A3567EmpMarCom[0]) != 0 ) || ( DecimalUtil.compareTo(Z3568EmpCosTin, T01FC2_A3568EmpCosTin[0]) != 0 ) || ( Z3734EmpRelBan != T01FC2_A3734EmpRelBan[0] ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T01FC2_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T01FC2_A407EmprNom[0]);
            }
            if ( DecimalUtil.compareTo(Z3562EmpQuePrd, T01FC2_A3562EmpQuePrd[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpQuePrd");
               GXutil.writeLogRaw("Old: ",Z3562EmpQuePrd);
               GXutil.writeLogRaw("Current: ",T01FC2_A3562EmpQuePrd[0]);
            }
            if ( DecimalUtil.compareTo(Z3563EmpQueCol, T01FC2_A3563EmpQueCol[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpQueCol");
               GXutil.writeLogRaw("Old: ",Z3563EmpQueCol);
               GXutil.writeLogRaw("Current: ",T01FC2_A3563EmpQueCol[0]);
            }
            if ( DecimalUtil.compareTo(Z3564EmpQueSod, T01FC2_A3564EmpQueSod[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpQueSod");
               GXutil.writeLogRaw("Old: ",Z3564EmpQueSod);
               GXutil.writeLogRaw("Current: ",T01FC2_A3564EmpQueSod[0]);
            }
            if ( DecimalUtil.compareTo(Z3565EmpCosInd, T01FC2_A3565EmpCosInd[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpCosInd");
               GXutil.writeLogRaw("Old: ",Z3565EmpCosInd);
               GXutil.writeLogRaw("Current: ",T01FC2_A3565EmpCosInd[0]);
            }
            if ( DecimalUtil.compareTo(Z3566EmpGasGen, T01FC2_A3566EmpGasGen[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpGasGen");
               GXutil.writeLogRaw("Old: ",Z3566EmpGasGen);
               GXutil.writeLogRaw("Current: ",T01FC2_A3566EmpGasGen[0]);
            }
            if ( DecimalUtil.compareTo(Z3567EmpMarCom, T01FC2_A3567EmpMarCom[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpMarCom");
               GXutil.writeLogRaw("Old: ",Z3567EmpMarCom);
               GXutil.writeLogRaw("Current: ",T01FC2_A3567EmpMarCom[0]);
            }
            if ( DecimalUtil.compareTo(Z3568EmpCosTin, T01FC2_A3568EmpCosTin[0]) != 0 )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpCosTin");
               GXutil.writeLogRaw("Old: ",Z3568EmpCosTin);
               GXutil.writeLogRaw("Current: ",T01FC2_A3568EmpCosTin[0]);
            }
            if ( Z3734EmpRelBan != T01FC2_A3734EmpRelBan[0] )
            {
               GXutil.writeLogln("ttrnempres:[seudo value changed for attri]"+"EmpRelBan");
               GXutil.writeLogRaw("Old: ",Z3734EmpRelBan);
               GXutil.writeLogRaw("Current: ",T01FC2_A3734EmpRelBan[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FC27( )
   {
      beforeValidate1FC27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FC27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FC27( 0) ;
         checkOptimisticConcurrency1FC27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FC27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FC27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FC8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n3562EmpQuePrd), A3562EmpQuePrd, Boolean.valueOf(n3563EmpQueCol), A3563EmpQueCol, Boolean.valueOf(n3564EmpQueSod), A3564EmpQueSod, Boolean.valueOf(n3565EmpCosInd), A3565EmpCosInd, Boolean.valueOf(n3566EmpGasGen), A3566EmpGasGen, Boolean.valueOf(n3567EmpMarCom), A3567EmpMarCom, Boolean.valueOf(n3568EmpCosTin), A3568EmpCosTin, Boolean.valueOf(n3734EmpRelBan), Short.valueOf(A3734EmpRelBan)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
                        resetCaption1FC0( ) ;
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
            load1FC27( ) ;
         }
         endLevel1FC27( ) ;
      }
      closeExtendedTableCursors1FC27( ) ;
   }

   public void update1FC27( )
   {
      beforeValidate1FC27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FC27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FC27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FC27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FC27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FC9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n3562EmpQuePrd), A3562EmpQuePrd, Boolean.valueOf(n3563EmpQueCol), A3563EmpQueCol, Boolean.valueOf(n3564EmpQueSod), A3564EmpQueSod, Boolean.valueOf(n3565EmpCosInd), A3565EmpCosInd, Boolean.valueOf(n3566EmpGasGen), A3566EmpGasGen, Boolean.valueOf(n3567EmpMarCom), A3567EmpMarCom, Boolean.valueOf(n3568EmpCosTin), A3568EmpCosTin, Boolean.valueOf(n3734EmpRelBan), Short.valueOf(A3734EmpRelBan), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FC27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1FC0( ) ;
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
         endLevel1FC27( ) ;
      }
      closeExtendedTableCursors1FC27( ) ;
   }

   public void deferredUpdate1FC27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FC27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FC27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FC27( ) ;
         afterConfirm1FC27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FC27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FC10 */
               pr_default.execute(8, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAll1FC27( ) ;
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
                     resetCaption1FC0( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FC27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FC27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FC11 */
         pr_default.execute(9, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T01FC12 */
         pr_default.execute(10, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01FC13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01FC14 */
         pr_default.execute(12, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FC15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01FC16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01FC17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01FC18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01FC19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01FC20 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01FC21 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01FC22 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPRESENTANTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01FC23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01FC24 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maestro de Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01FC25 */
         pr_default.execute(23, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Código de calidad", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01FC26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01FC27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGKSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01FC28 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DKGSLA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01FC29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01FC30 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01FC31 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01FC32 */
         pr_default.execute(30, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01FC33 */
         pr_default.execute(31, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01FC34 */
         pr_default.execute(32, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01FC35 */
         pr_default.execute(33, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01FC36 */
         pr_default.execute(34, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LBOTAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01FC37 */
         pr_default.execute(35, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPBOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01FC38 */
         pr_default.execute(36, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01FC39 */
         pr_default.execute(37, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01FC40 */
         pr_default.execute(38, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01FC41 */
         pr_default.execute(39, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01FC42 */
         pr_default.execute(40, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01FC43 */
         pr_default.execute(41, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01FC44 */
         pr_default.execute(42, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01FC45 */
         pr_default.execute(43, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01FC46 */
         pr_default.execute(44, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NUMTEX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01FC47 */
         pr_default.execute(45, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01FC48 */
         pr_default.execute(46, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01FC49 */
         pr_default.execute(47, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01FC50 */
         pr_default.execute(48, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01FC51 */
         pr_default.execute(49, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENVTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01FC52 */
         pr_default.execute(50, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01FC53 */
         pr_default.execute(51, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01FC54 */
         pr_default.execute(52, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01FC55 */
         pr_default.execute(53, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01FC56 */
         pr_default.execute(54, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01FC57 */
         pr_default.execute(55, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01FC58 */
         pr_default.execute(56, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01FC59 */
         pr_default.execute(57, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01FC60 */
         pr_default.execute(58, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MANUFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01FC61 */
         pr_default.execute(59, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01FC62 */
         pr_default.execute(60, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01FC63 */
         pr_default.execute(61, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01FC64 */
         pr_default.execute(62, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01FC65 */
         pr_default.execute(63, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01FC66 */
         pr_default.execute(64, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01FC67 */
         pr_default.execute(65, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARLAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01FC68 */
         pr_default.execute(66, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01FC69 */
         pr_default.execute(67, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01FC70 */
         pr_default.execute(68, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZONGEO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01FC71 */
         pr_default.execute(69, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01FC72 */
         pr_default.execute(70, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01FC73 */
         pr_default.execute(71, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01FC74 */
         pr_default.execute(72, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTMAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01FC75 */
         pr_default.execute(73, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TUBOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01FC76 */
         pr_default.execute(74, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01FC77 */
         pr_default.execute(75, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01FC78 */
         pr_default.execute(76, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DESTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01FC79 */
         pr_default.execute(77, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTRAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01FC80 */
         pr_default.execute(78, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01FC81 */
         pr_default.execute(79, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECTOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01FC82 */
         pr_default.execute(80, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TURNOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01FC83 */
         pr_default.execute(81, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01FC84 */
         pr_default.execute(82, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01FC85 */
         pr_default.execute(83, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01FC86 */
         pr_default.execute(84, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T01FC87 */
         pr_default.execute(85, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T01FC88 */
         pr_default.execute(86, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T01FC89 */
         pr_default.execute(87, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T01FC90 */
         pr_default.execute(88, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T01FC91 */
         pr_default.execute(89, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UNMEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T01FC92 */
         pr_default.execute(90, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TRANSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T01FC93 */
         pr_default.execute(91, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPVAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T01FC94 */
         pr_default.execute(92, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPUNI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T01FC95 */
         pr_default.execute(93, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T01FC96 */
         pr_default.execute(94, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T01FC97 */
         pr_default.execute(95, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T01FC98 */
         pr_default.execute(96, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T01FC99 */
         pr_default.execute(97, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T01FC100 */
         pr_default.execute(98, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T01FC101 */
         pr_default.execute(99, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T01FC102 */
         pr_default.execute(100, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T01FC103 */
         pr_default.execute(101, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T01FC104 */
         pr_default.execute(102, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T01FC105 */
         pr_default.execute(103, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T01FC106 */
         pr_default.execute(104, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T01FC107 */
         pr_default.execute(105, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T01FC108 */
         pr_default.execute(106, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPERAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T01FC109 */
         pr_default.execute(107, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T01FC110 */
         pr_default.execute(108, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATICE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T01FC111 */
         pr_default.execute(109, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQUIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T01FC112 */
         pr_default.execute(110, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INTENS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T01FC113 */
         pr_default.execute(111, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T01FC114 */
         pr_default.execute(112, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T01FC115 */
         pr_default.execute(113, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T01FC116 */
         pr_default.execute(114, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUFAM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T01FC117 */
         pr_default.execute(115, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T01FC118 */
         pr_default.execute(116, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T01FC119 */
         pr_default.execute(117, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T01FC120 */
         pr_default.execute(118, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EMPLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T01FC121 */
         pr_default.execute(119, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T01FC122 */
         pr_default.execute(120, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T01FC123 */
         pr_default.execute(121, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T01FC124 */
         pr_default.execute(122, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T01FC125 */
         pr_default.execute(123, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T01FC126 */
         pr_default.execute(124, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T01FC127 */
         pr_default.execute(125, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
         /* Using cursor T01FC128 */
         pr_default.execute(126, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(126) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CIETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(126);
         /* Using cursor T01FC129 */
         pr_default.execute(127, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
         /* Using cursor T01FC130 */
         pr_default.execute(128, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(128) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(128);
         /* Using cursor T01FC131 */
         pr_default.execute(129, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(129) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(129);
         /* Using cursor T01FC132 */
         pr_default.execute(130, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor T01FC133 */
         pr_default.execute(131, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
      }
   }

   public void endLevel1FC27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FC27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrnempres");
         if ( AnyError == 0 )
         {
            confirmValues1FC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnempres");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FC27( )
   {
      /* Using cursor T01FC134 */
      pr_default.execute(132);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(132) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T01FC134_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FC27( )
   {
      /* Scan next routine */
      pr_default.readNext(132);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(132) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T01FC134_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void scanEnd1FC27( )
   {
      pr_default.close(132);
   }

   public void afterConfirm1FC27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FC27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FC27( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FC27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FC27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FC27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FC27( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmpQuePrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpQuePrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpQuePrd_Enabled), 5, 0), true);
      edtEmpQueCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpQueCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpQueCol_Enabled), 5, 0), true);
      edtEmpQueSod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpQueSod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpQueSod_Enabled), 5, 0), true);
      edtEmpCosInd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpCosInd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpCosInd_Enabled), 5, 0), true);
      edtEmpGasGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpGasGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpGasGen_Enabled), 5, 0), true);
      edtEmpMarCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpMarCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpMarCom_Enabled), 5, 0), true);
      edtEmpCosTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpCosTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpCosTin_Enabled), 5, 0), true);
      edtEmpRelBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpRelBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpRelBan_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1FC27( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1FC0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrnempres", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3562EmpQuePrd", GXutil.ltrim( localUtil.ntoc( Z3562EmpQuePrd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3563EmpQueCol", GXutil.ltrim( localUtil.ntoc( Z3563EmpQueCol, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3564EmpQueSod", GXutil.ltrim( localUtil.ntoc( Z3564EmpQueSod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3565EmpCosInd", GXutil.ltrim( localUtil.ntoc( Z3565EmpCosInd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3566EmpGasGen", GXutil.ltrim( localUtil.ntoc( Z3566EmpGasGen, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3567EmpMarCom", GXutil.ltrim( localUtil.ntoc( Z3567EmpMarCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3568EmpCosTin", GXutil.ltrim( localUtil.ntoc( Z3568EmpCosTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3734EmpRelBan", GXutil.ltrim( localUtil.ntoc( Z3734EmpRelBan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrnempres", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrnEMPRES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") ;
   }

   public void initializeNonKey1FC27( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3562EmpQuePrd = DecimalUtil.ZERO ;
      n3562EmpQuePrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrimstr( A3562EmpQuePrd, 6, 2));
      A3563EmpQueCol = DecimalUtil.ZERO ;
      n3563EmpQueCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrimstr( A3563EmpQueCol, 6, 2));
      A3564EmpQueSod = DecimalUtil.ZERO ;
      n3564EmpQueSod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrimstr( A3564EmpQueSod, 6, 2));
      A3565EmpCosInd = DecimalUtil.ZERO ;
      n3565EmpCosInd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrimstr( A3565EmpCosInd, 9, 2));
      A3566EmpGasGen = DecimalUtil.ZERO ;
      n3566EmpGasGen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrimstr( A3566EmpGasGen, 9, 2));
      A3567EmpMarCom = DecimalUtil.ZERO ;
      n3567EmpMarCom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrimstr( A3567EmpMarCom, 6, 2));
      A3568EmpCosTin = DecimalUtil.ZERO ;
      n3568EmpCosTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrimstr( A3568EmpCosTin, 9, 2));
      A3734EmpRelBan = (short)(0) ;
      n3734EmpRelBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3734EmpRelBan), 4, 0));
      Z407EmprNom = "" ;
      Z3562EmpQuePrd = DecimalUtil.ZERO ;
      Z3563EmpQueCol = DecimalUtil.ZERO ;
      Z3564EmpQueSod = DecimalUtil.ZERO ;
      Z3565EmpCosInd = DecimalUtil.ZERO ;
      Z3566EmpGasGen = DecimalUtil.ZERO ;
      Z3567EmpMarCom = DecimalUtil.ZERO ;
      Z3568EmpCosTin = DecimalUtil.ZERO ;
      Z3734EmpRelBan = (short)(0) ;
   }

   public void initAll1FC27( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKey1FC27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572679", true, true);
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
      httpContext.AddJavascriptSource("ttrnempres.js", "?20268241572680", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmpQuePrd_Internalname = "EMPQUEPRD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmpQueCol_Internalname = "EMPQUECOL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmpQueSod_Internalname = "EMPQUESOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmpCosInd_Internalname = "EMPCOSIND" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmpGasGen_Internalname = "EMPGASGEN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmpMarCom_Internalname = "EMPMARCOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEmpCosTin_Internalname = "EMPCOSTIN" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEmpRelBan_Internalname = "EMPRELBAN" ;
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
      Form.setCaption( httpContext.getMessage( "CAMPOS QUE SON ELIMINADOS POR ESTAR EN OTRAS TRNS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEmpRelBan_Jsonclick = "" ;
      edtEmpRelBan_Backcolor = (int)(0xFFFFFF) ;
      edtEmpRelBan_Enabled = 1 ;
      edtEmpCosTin_Jsonclick = "" ;
      edtEmpCosTin_Backcolor = (int)(0xFFFFFF) ;
      edtEmpCosTin_Enabled = 1 ;
      edtEmpMarCom_Jsonclick = "" ;
      edtEmpMarCom_Backcolor = (int)(0xFFFFFF) ;
      edtEmpMarCom_Enabled = 1 ;
      edtEmpGasGen_Jsonclick = "" ;
      edtEmpGasGen_Backcolor = (int)(0xFFFFFF) ;
      edtEmpGasGen_Enabled = 1 ;
      edtEmpCosInd_Jsonclick = "" ;
      edtEmpCosInd_Backcolor = (int)(0xFFFFFF) ;
      edtEmpCosInd_Enabled = 1 ;
      edtEmpQueSod_Jsonclick = "" ;
      edtEmpQueSod_Backcolor = (int)(0xFFFFFF) ;
      edtEmpQueSod_Enabled = 1 ;
      edtEmpQueCol_Jsonclick = "" ;
      edtEmpQueCol_Backcolor = (int)(0xFFFFFF) ;
      edtEmpQueCol_Enabled = 1 ;
      edtEmpQuePrd_Jsonclick = "" ;
      edtEmpQuePrd_Backcolor = (int)(0xFFFFFF) ;
      edtEmpQuePrd_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      GX_FocusControl = edtEmprNom_Internalname ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3562EmpQuePrd", GXutil.ltrim( localUtil.ntoc( A3562EmpQuePrd, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3563EmpQueCol", GXutil.ltrim( localUtil.ntoc( A3563EmpQueCol, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3564EmpQueSod", GXutil.ltrim( localUtil.ntoc( A3564EmpQueSod, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3565EmpCosInd", GXutil.ltrim( localUtil.ntoc( A3565EmpCosInd, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3566EmpGasGen", GXutil.ltrim( localUtil.ntoc( A3566EmpGasGen, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3567EmpMarCom", GXutil.ltrim( localUtil.ntoc( A3567EmpMarCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3568EmpCosTin", GXutil.ltrim( localUtil.ntoc( A3568EmpCosTin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3734EmpRelBan", GXutil.ltrim( localUtil.ntoc( A3734EmpRelBan, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3562EmpQuePrd", GXutil.ltrim( localUtil.ntoc( Z3562EmpQuePrd, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3563EmpQueCol", GXutil.ltrim( localUtil.ntoc( Z3563EmpQueCol, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3564EmpQueSod", GXutil.ltrim( localUtil.ntoc( Z3564EmpQueSod, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3565EmpCosInd", GXutil.ltrim( localUtil.ntoc( Z3565EmpCosInd, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3566EmpGasGen", GXutil.ltrim( localUtil.ntoc( Z3566EmpGasGen, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3567EmpMarCom", GXutil.ltrim( localUtil.ntoc( Z3567EmpMarCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3568EmpCosTin", GXutil.ltrim( localUtil.ntoc( Z3568EmpCosTin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3734EmpRelBan", GXutil.ltrim( localUtil.ntoc( Z3734EmpRelBan, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3562EmpQuePrd',fld:'EMPQUEPRD',pic:'ZZ9.99'},{av:'A3563EmpQueCol',fld:'EMPQUECOL',pic:'ZZ9.99'},{av:'A3564EmpQueSod',fld:'EMPQUESOD',pic:'ZZ9.99'},{av:'A3565EmpCosInd',fld:'EMPCOSIND',pic:'ZZZZZ9.99'},{av:'A3566EmpGasGen',fld:'EMPGASGEN',pic:'ZZZZZ9.99'},{av:'A3567EmpMarCom',fld:'EMPMARCOM',pic:'ZZ9.99'},{av:'A3568EmpCosTin',fld:'EMPCOSTIN',pic:'ZZZZZ9.99'},{av:'A3734EmpRelBan',fld:'EMPRELBAN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z3562EmpQuePrd'},{av:'Z3563EmpQueCol'},{av:'Z3564EmpQueSod'},{av:'Z3565EmpCosInd'},{av:'Z3566EmpGasGen'},{av:'Z3567EmpMarCom'},{av:'Z3568EmpCosTin'},{av:'Z3734EmpRelBan'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      Z3562EmpQuePrd = DecimalUtil.ZERO ;
      Z3563EmpQueCol = DecimalUtil.ZERO ;
      Z3564EmpQueSod = DecimalUtil.ZERO ;
      Z3565EmpCosInd = DecimalUtil.ZERO ;
      Z3566EmpGasGen = DecimalUtil.ZERO ;
      Z3567EmpMarCom = DecimalUtil.ZERO ;
      Z3568EmpCosTin = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A3562EmpQuePrd = DecimalUtil.ZERO ;
      lblTextblock4_Jsonclick = "" ;
      A3563EmpQueCol = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A3564EmpQueSod = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A3565EmpCosInd = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A3566EmpGasGen = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A3567EmpMarCom = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A3568EmpCosTin = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
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
      T01FC4_A396EmprCod = new String[] {""} ;
      T01FC4_A407EmprNom = new String[] {""} ;
      T01FC4_n407EmprNom = new boolean[] {false} ;
      T01FC4_A3562EmpQuePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3562EmpQuePrd = new boolean[] {false} ;
      T01FC4_A3563EmpQueCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3563EmpQueCol = new boolean[] {false} ;
      T01FC4_A3564EmpQueSod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3564EmpQueSod = new boolean[] {false} ;
      T01FC4_A3565EmpCosInd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3565EmpCosInd = new boolean[] {false} ;
      T01FC4_A3566EmpGasGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3566EmpGasGen = new boolean[] {false} ;
      T01FC4_A3567EmpMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3567EmpMarCom = new boolean[] {false} ;
      T01FC4_A3568EmpCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC4_n3568EmpCosTin = new boolean[] {false} ;
      T01FC4_A3734EmpRelBan = new short[1] ;
      T01FC4_n3734EmpRelBan = new boolean[] {false} ;
      T01FC5_A396EmprCod = new String[] {""} ;
      T01FC3_A396EmprCod = new String[] {""} ;
      T01FC3_A407EmprNom = new String[] {""} ;
      T01FC3_n407EmprNom = new boolean[] {false} ;
      T01FC3_A3562EmpQuePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3562EmpQuePrd = new boolean[] {false} ;
      T01FC3_A3563EmpQueCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3563EmpQueCol = new boolean[] {false} ;
      T01FC3_A3564EmpQueSod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3564EmpQueSod = new boolean[] {false} ;
      T01FC3_A3565EmpCosInd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3565EmpCosInd = new boolean[] {false} ;
      T01FC3_A3566EmpGasGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3566EmpGasGen = new boolean[] {false} ;
      T01FC3_A3567EmpMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3567EmpMarCom = new boolean[] {false} ;
      T01FC3_A3568EmpCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC3_n3568EmpCosTin = new boolean[] {false} ;
      T01FC3_A3734EmpRelBan = new short[1] ;
      T01FC3_n3734EmpRelBan = new boolean[] {false} ;
      sMode27 = "" ;
      T01FC6_A396EmprCod = new String[] {""} ;
      T01FC7_A396EmprCod = new String[] {""} ;
      T01FC2_A396EmprCod = new String[] {""} ;
      T01FC2_A407EmprNom = new String[] {""} ;
      T01FC2_n407EmprNom = new boolean[] {false} ;
      T01FC2_A3562EmpQuePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3562EmpQuePrd = new boolean[] {false} ;
      T01FC2_A3563EmpQueCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3563EmpQueCol = new boolean[] {false} ;
      T01FC2_A3564EmpQueSod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3564EmpQueSod = new boolean[] {false} ;
      T01FC2_A3565EmpCosInd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3565EmpCosInd = new boolean[] {false} ;
      T01FC2_A3566EmpGasGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3566EmpGasGen = new boolean[] {false} ;
      T01FC2_A3567EmpMarCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3567EmpMarCom = new boolean[] {false} ;
      T01FC2_A3568EmpCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC2_n3568EmpCosTin = new boolean[] {false} ;
      T01FC2_A3734EmpRelBan = new short[1] ;
      T01FC2_n3734EmpRelBan = new boolean[] {false} ;
      T01FC11_A396EmprCod = new String[] {""} ;
      T01FC11_A3331LanBroCod = new byte[1] ;
      T01FC12_A396EmprCod = new String[] {""} ;
      T01FC12_A252CliCod = new int[1] ;
      T01FC12_n252CliCod = new boolean[] {false} ;
      T01FC12_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC13_A396EmprCod = new String[] {""} ;
      T01FC13_A252CliCod = new int[1] ;
      T01FC13_n252CliCod = new boolean[] {false} ;
      T01FC13_A65ArtCod = new String[] {""} ;
      T01FC13_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FC14_A396EmprCod = new String[] {""} ;
      T01FC14_A3316CodSol = new short[1] ;
      T01FC15_A396EmprCod = new String[] {""} ;
      T01FC15_A3288CCalCod = new String[] {""} ;
      T01FC16_A396EmprCod = new String[] {""} ;
      T01FC16_A3253SolTraCod = new int[1] ;
      T01FC16_A3269SolTraLin = new byte[1] ;
      T01FC17_A396EmprCod = new String[] {""} ;
      T01FC17_A3235SolSubCod = new int[1] ;
      T01FC17_A3251SolSubLin = new byte[1] ;
      T01FC18_A396EmprCod = new String[] {""} ;
      T01FC18_A3218SolLuzCod = new int[1] ;
      T01FC18_A3233SolLuzLin = new byte[1] ;
      T01FC19_A396EmprCod = new String[] {""} ;
      T01FC19_A3196SolFriCod = new int[1] ;
      T01FC19_A3216SolFriLin = new byte[1] ;
      T01FC20_A396EmprCod = new String[] {""} ;
      T01FC20_A3165SolPilCod = new int[1] ;
      T01FC20_A3185SolPilLin = new byte[1] ;
      T01FC21_A396EmprCod = new String[] {""} ;
      T01FC21_A3153CodCod = new String[] {""} ;
      T01FC22_A396EmprCod = new String[] {""} ;
      T01FC22_A3073RepCod = new String[] {""} ;
      T01FC23_A396EmprCod = new String[] {""} ;
      T01FC23_A3061Codia = new byte[1] ;
      T01FC23_A3062CoMes = new byte[1] ;
      T01FC23_A3063CoAny = new short[1] ;
      T01FC24_A396EmprCod = new String[] {""} ;
      T01FC24_A3047LOParId = new String[] {""} ;
      T01FC25_A396EmprCod = new String[] {""} ;
      T01FC25_A3033CCCod = new String[] {""} ;
      T01FC26_A396EmprCod = new String[] {""} ;
      T01FC26_A2971SabFacCod = new int[1] ;
      T01FC27_A396EmprCod = new String[] {""} ;
      T01FC27_A2954TiDia = new byte[1] ;
      T01FC27_A2955TiMes = new byte[1] ;
      T01FC27_A2956TiAny = new short[1] ;
      T01FC28_A396EmprCod = new String[] {""} ;
      T01FC28_A2942LzaDia = new byte[1] ;
      T01FC28_A2943LzaMes = new byte[1] ;
      T01FC28_A2944LzaAny = new short[1] ;
      T01FC29_A396EmprCod = new String[] {""} ;
      T01FC29_A252CliCod = new int[1] ;
      T01FC29_n252CliCod = new boolean[] {false} ;
      T01FC29_A65ArtCod = new String[] {""} ;
      T01FC29_A2937RecIntCod = new byte[1] ;
      T01FC30_A396EmprCod = new String[] {""} ;
      T01FC30_A252CliCod = new int[1] ;
      T01FC30_n252CliCod = new boolean[] {false} ;
      T01FC30_A2933RecTipCon = new short[1] ;
      T01FC31_A396EmprCod = new String[] {""} ;
      T01FC31_A252CliCod = new int[1] ;
      T01FC31_n252CliCod = new boolean[] {false} ;
      T01FC31_A65ArtCod = new String[] {""} ;
      T01FC31_A2931Limite2 = new short[1] ;
      T01FC32_A396EmprCod = new String[] {""} ;
      T01FC32_A252CliCod = new int[1] ;
      T01FC32_n252CliCod = new boolean[] {false} ;
      T01FC32_A2927RecProCod = new String[] {""} ;
      T01FC33_A396EmprCod = new String[] {""} ;
      T01FC33_A2921HisProTiCo = new String[] {""} ;
      T01FC33_A2922HisProTiLP = new short[1] ;
      T01FC33_A2913HisProTiFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01FC33_A2923HisProTiL = new short[1] ;
      T01FC34_A396EmprCod = new String[] {""} ;
      T01FC34_A252CliCod = new int[1] ;
      T01FC34_n252CliCod = new boolean[] {false} ;
      T01FC34_A2891HMaForSer = new String[] {""} ;
      T01FC34_A2892HMaForCNom = new String[] {""} ;
      T01FC34_A2893HMaForCNum = new int[1] ;
      T01FC34_A2894HMaTipCCod = new byte[1] ;
      T01FC34_A2895HMaForNumC = new int[1] ;
      T01FC34_A2897HMaColLin = new short[1] ;
      T01FC34_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FC34_A2907HmaLin = new short[1] ;
      T01FC35_A396EmprCod = new String[] {""} ;
      T01FC35_A129BarCod = new int[1] ;
      T01FC35_n129BarCod = new boolean[] {false} ;
      T01FC35_A132BarCodReo = new byte[1] ;
      T01FC35_n132BarCodReo = new boolean[] {false} ;
      T01FC35_A130BarCodPar = new String[] {""} ;
      T01FC35_n130BarCodPar = new boolean[] {false} ;
      T01FC35_A2872HAnRLinMaq = new short[1] ;
      T01FC35_A2873HAnRLinPro = new byte[1] ;
      T01FC35_A2874HAnRLin = new short[1] ;
      T01FC35_A2875HAnNumAny = new byte[1] ;
      T01FC36_A396EmprCod = new String[] {""} ;
      T01FC36_A2855CodBota = new int[1] ;
      T01FC36_A2859BotLin = new short[1] ;
      T01FC37_A396EmprCod = new String[] {""} ;
      T01FC37_A2853TipBotCod = new byte[1] ;
      T01FC38_A396EmprCod = new String[] {""} ;
      T01FC38_A2817PlaTer = new String[] {""} ;
      T01FC38_A2818PlaOrd = new short[1] ;
      T01FC39_A396EmprCod = new String[] {""} ;
      T01FC39_A2809MetTerCod = new String[] {""} ;
      T01FC39_A129BarCod = new int[1] ;
      T01FC39_n129BarCod = new boolean[] {false} ;
      T01FC39_A132BarCodReo = new byte[1] ;
      T01FC39_n132BarCodReo = new boolean[] {false} ;
      T01FC39_A130BarCodPar = new String[] {""} ;
      T01FC39_n130BarCodPar = new boolean[] {false} ;
      T01FC40_A396EmprCod = new String[] {""} ;
      T01FC40_A129BarCod = new int[1] ;
      T01FC40_n129BarCod = new boolean[] {false} ;
      T01FC40_A132BarCodReo = new byte[1] ;
      T01FC40_n132BarCodReo = new boolean[] {false} ;
      T01FC40_A130BarCodPar = new String[] {""} ;
      T01FC40_n130BarCodPar = new boolean[] {false} ;
      T01FC40_A2808RecLinMAL = new short[1] ;
      T01FC40_A1377RecNumAny = new byte[1] ;
      T01FC40_A719PrdNum = new String[] {""} ;
      T01FC41_A396EmprCod = new String[] {""} ;
      T01FC41_A2792TermiCod = new String[] {""} ;
      T01FC41_A129BarCod = new int[1] ;
      T01FC41_n129BarCod = new boolean[] {false} ;
      T01FC41_A132BarCodReo = new byte[1] ;
      T01FC41_n132BarCodReo = new boolean[] {false} ;
      T01FC41_A130BarCodPar = new String[] {""} ;
      T01FC41_n130BarCodPar = new boolean[] {false} ;
      T01FC42_A396EmprCod = new String[] {""} ;
      T01FC42_A30AlbProCod = new long[1] ;
      T01FC42_A129BarCod = new int[1] ;
      T01FC42_n129BarCod = new boolean[] {false} ;
      T01FC42_A132BarCodReo = new byte[1] ;
      T01FC42_n132BarCodReo = new boolean[] {false} ;
      T01FC42_A130BarCodPar = new String[] {""} ;
      T01FC42_n130BarCodPar = new boolean[] {false} ;
      T01FC42_A2764AlbHdrLin = new short[1] ;
      T01FC43_A396EmprCod = new String[] {""} ;
      T01FC43_A252CliCod = new int[1] ;
      T01FC43_n252CliCod = new boolean[] {false} ;
      T01FC43_A65ArtCod = new String[] {""} ;
      T01FC43_A71ArtEstAny = new short[1] ;
      T01FC43_A2756ArtEstSer = new String[] {""} ;
      T01FC44_A396EmprCod = new String[] {""} ;
      T01FC44_A252CliCod = new int[1] ;
      T01FC44_n252CliCod = new boolean[] {false} ;
      T01FC44_A425EstAny = new short[1] ;
      T01FC44_A2755EstSerFac = new String[] {""} ;
      T01FC45_A396EmprCod = new String[] {""} ;
      T01FC45_A2730RecTipCo = new short[1] ;
      T01FC45_A252CliCod = new int[1] ;
      T01FC45_n252CliCod = new boolean[] {false} ;
      T01FC46_A396EmprCod = new String[] {""} ;
      T01FC46_A2707NumTexCod = new String[] {""} ;
      T01FC47_A396EmprCod = new String[] {""} ;
      T01FC47_A129BarCod = new int[1] ;
      T01FC47_n129BarCod = new boolean[] {false} ;
      T01FC47_A132BarCodReo = new byte[1] ;
      T01FC47_n132BarCodReo = new boolean[] {false} ;
      T01FC47_A130BarCodPar = new String[] {""} ;
      T01FC47_n130BarCodPar = new boolean[] {false} ;
      T01FC47_A2494BarDosPro = new String[] {""} ;
      T01FC47_A719PrdNum = new String[] {""} ;
      T01FC48_A396EmprCod = new String[] {""} ;
      T01FC48_A658PedCod = new int[1] ;
      T01FC48_A2501PedObsLin = new byte[1] ;
      T01FC49_A396EmprCod = new String[] {""} ;
      T01FC49_A129BarCod = new int[1] ;
      T01FC49_n129BarCod = new boolean[] {false} ;
      T01FC49_A132BarCodReo = new byte[1] ;
      T01FC49_n132BarCodReo = new boolean[] {false} ;
      T01FC49_A130BarCodPar = new String[] {""} ;
      T01FC49_n130BarCodPar = new boolean[] {false} ;
      T01FC49_A2457BarObLin = new short[1] ;
      T01FC50_A396EmprCod = new String[] {""} ;
      T01FC50_A129BarCod = new int[1] ;
      T01FC50_n129BarCod = new boolean[] {false} ;
      T01FC50_A132BarCodReo = new byte[1] ;
      T01FC50_n132BarCodReo = new boolean[] {false} ;
      T01FC50_A130BarCodPar = new String[] {""} ;
      T01FC50_n130BarCodPar = new boolean[] {false} ;
      T01FC50_A2444BarEnLin = new short[1] ;
      T01FC51_A396EmprCod = new String[] {""} ;
      T01FC51_A2429TerBarCod = new int[1] ;
      T01FC51_A2431TerBarReo = new byte[1] ;
      T01FC51_A2430TerBarPar = new String[] {""} ;
      T01FC52_A396EmprCod = new String[] {""} ;
      T01FC52_A2420OpeAntCod = new int[1] ;
      T01FC53_A396EmprCod = new String[] {""} ;
      T01FC53_A2406ExhAlbCod = new int[1] ;
      T01FC53_A2416ExhObsLin = new short[1] ;
      T01FC54_A396EmprCod = new String[] {""} ;
      T01FC54_A2406ExhAlbCod = new int[1] ;
      T01FC54_A129BarCod = new int[1] ;
      T01FC54_n129BarCod = new boolean[] {false} ;
      T01FC54_A132BarCodReo = new byte[1] ;
      T01FC54_n132BarCodReo = new boolean[] {false} ;
      T01FC54_A130BarCodPar = new String[] {""} ;
      T01FC54_n130BarCodPar = new boolean[] {false} ;
      T01FC55_A396EmprCod = new String[] {""} ;
      T01FC55_A14AlbComCod = new int[1] ;
      T01FC55_A2386AlbCObsLin = new byte[1] ;
      T01FC56_A396EmprCod = new String[] {""} ;
      T01FC56_A2382AbcTerCod = new String[] {""} ;
      T01FC56_A2381AbcSec = new String[] {""} ;
      T01FC56_A252CliCod = new int[1] ;
      T01FC56_n252CliCod = new boolean[] {false} ;
      T01FC57_A396EmprCod = new String[] {""} ;
      T01FC57_A252CliCod = new int[1] ;
      T01FC57_n252CliCod = new boolean[] {false} ;
      T01FC57_A2308CliDesCod = new int[1] ;
      T01FC58_A396EmprCod = new String[] {""} ;
      T01FC58_A2268MovParCod = new String[] {""} ;
      T01FC58_A252CliCod = new int[1] ;
      T01FC58_n252CliCod = new boolean[] {false} ;
      T01FC58_A2276MovParLin = new short[1] ;
      T01FC59_A396EmprCod = new String[] {""} ;
      T01FC59_A2253SalExtAlb = new int[1] ;
      T01FC59_A129BarCod = new int[1] ;
      T01FC59_n129BarCod = new boolean[] {false} ;
      T01FC59_A132BarCodReo = new byte[1] ;
      T01FC59_n132BarCodReo = new boolean[] {false} ;
      T01FC59_A130BarCodPar = new String[] {""} ;
      T01FC59_n130BarCodPar = new boolean[] {false} ;
      T01FC60_A396EmprCod = new String[] {""} ;
      T01FC60_A2248ManCod = new short[1] ;
      T01FC61_A396EmprCod = new String[] {""} ;
      T01FC61_A44AlbRecCod = new int[1] ;
      T01FC61_A2159AlbRecPie = new String[] {""} ;
      T01FC62_A396EmprCod = new String[] {""} ;
      T01FC62_A44AlbRecCod = new int[1] ;
      T01FC62_A2165HisEmpLin = new short[1] ;
      T01FC63_A396EmprCod = new String[] {""} ;
      T01FC63_A1794GruLecMaq = new String[] {""} ;
      T01FC63_A1795GruOrd = new byte[1] ;
      T01FC63_A1791GruBarCod = new int[1] ;
      T01FC63_A1793GruBarReo = new byte[1] ;
      T01FC63_A1792GruBarPar = new String[] {""} ;
      T01FC64_A396EmprCod = new String[] {""} ;
      T01FC64_A1664ParFasCod = new short[1] ;
      T01FC65_A396EmprCod = new String[] {""} ;
      T01FC65_A1514MacProCod = new String[] {""} ;
      T01FC66_A396EmprCod = new String[] {""} ;
      T01FC66_A252CliCod = new int[1] ;
      T01FC66_n252CliCod = new boolean[] {false} ;
      T01FC66_A1504CliProCod = new String[] {""} ;
      T01FC66_A65ArtCod = new String[] {""} ;
      T01FC67_A396EmprCod = new String[] {""} ;
      T01FC67_A1438BarTerCod = new String[] {""} ;
      T01FC67_A172BarLanLin = new short[1] ;
      T01FC68_A396EmprCod = new String[] {""} ;
      T01FC68_A1387AlbPrvCod = new int[1] ;
      T01FC69_A396EmprCod = new String[] {""} ;
      T01FC69_A44AlbRecCod = new int[1] ;
      T01FC69_A1299AlbRLin = new byte[1] ;
      T01FC70_A396EmprCod = new String[] {""} ;
      T01FC70_A858ZonGeoCod = new short[1] ;
      T01FC71_A396EmprCod = new String[] {""} ;
      T01FC71_A1348SolColCod = new int[1] ;
      T01FC71_A1351SolColLin = new byte[1] ;
      T01FC72_A396EmprCod = new String[] {""} ;
      T01FC72_A1333EstDimCod = new int[1] ;
      T01FC72_A1339EstDimLin = new byte[1] ;
      T01FC73_A396EmprCod = new String[] {""} ;
      T01FC73_A1314EnsLabCod = new int[1] ;
      T01FC74_A396EmprCod = new String[] {""} ;
      T01FC74_A252CliCod = new int[1] ;
      T01FC74_n252CliCod = new boolean[] {false} ;
      T01FC74_A1213TalCod = new String[] {""} ;
      T01FC74_A1293EntMarRef = new String[] {""} ;
      T01FC75_A396EmprCod = new String[] {""} ;
      T01FC75_A1206TubCod = new short[1] ;
      T01FC76_A396EmprCod = new String[] {""} ;
      T01FC76_A252CliCod = new int[1] ;
      T01FC76_n252CliCod = new boolean[] {false} ;
      T01FC76_A1213TalCod = new String[] {""} ;
      T01FC76_A1217EntMalLin = new short[1] ;
      T01FC77_A396EmprCod = new String[] {""} ;
      T01FC77_A1199MacCod = new int[1] ;
      T01FC78_A396EmprCod = new String[] {""} ;
      T01FC78_A1209DesCod = new short[1] ;
      T01FC79_A396EmprCod = new String[] {""} ;
      T01FC79_A1211TipEntCod = new short[1] ;
      T01FC80_A396EmprCod = new String[] {""} ;
      T01FC80_A688PrdComCod = new String[] {""} ;
      T01FC81_A396EmprCod = new String[] {""} ;
      T01FC81_A1166LecMaqCod = new String[] {""} ;
      T01FC82_A396EmprCod = new String[] {""} ;
      T01FC82_A1161TurnCod = new byte[1] ;
      T01FC83_A396EmprCod = new String[] {""} ;
      T01FC83_A1146DisDisCod = new int[1] ;
      T01FC83_A1139DisBarCod = new int[1] ;
      T01FC83_A1140DisBarReo = new byte[1] ;
      T01FC83_A1141DisBarPar = new String[] {""} ;
      T01FC84_A396EmprCod = new String[] {""} ;
      T01FC84_A996TipCon = new short[1] ;
      T01FC85_A396EmprCod = new String[] {""} ;
      T01FC85_A970ProceCod = new short[1] ;
      T01FC86_A396EmprCod = new String[] {""} ;
      T01FC86_A30AlbProCod = new long[1] ;
      T01FC86_A915AlbPObsLin = new byte[1] ;
      T01FC87_A396EmprCod = new String[] {""} ;
      T01FC87_A910Workstat = new String[] {""} ;
      T01FC88_A396EmprCod = new String[] {""} ;
      T01FC88_A129BarCod = new int[1] ;
      T01FC88_n129BarCod = new boolean[] {false} ;
      T01FC88_A132BarCodReo = new byte[1] ;
      T01FC88_n132BarCodReo = new boolean[] {false} ;
      T01FC88_A130BarCodPar = new String[] {""} ;
      T01FC88_n130BarCodPar = new boolean[] {false} ;
      T01FC88_A906ObsReoLin = new byte[1] ;
      T01FC89_A396EmprCod = new String[] {""} ;
      T01FC89_A656ParCod = new short[1] ;
      T01FC90_A396EmprCod = new String[] {""} ;
      T01FC90_A859CumCodCont = new int[1] ;
      T01FC91_A396EmprCod = new String[] {""} ;
      T01FC91_A490ForPrdUMe = new byte[1] ;
      T01FC92_A396EmprCod = new String[] {""} ;
      T01FC92_A840TrnCod = new short[1] ;
      T01FC93_A396EmprCod = new String[] {""} ;
      T01FC93_A856ValCod = new byte[1] ;
      T01FC94_A396EmprCod = new String[] {""} ;
      T01FC94_A848UniCod = new byte[1] ;
      T01FC95_A396EmprCod = new String[] {""} ;
      T01FC95_A687PrdCod = new byte[1] ;
      T01FC96_A396EmprCod = new String[] {""} ;
      T01FC96_A835TipDtoCod = new byte[1] ;
      T01FC97_A396EmprCod = new String[] {""} ;
      T01FC97_A833TipDefCod = new short[1] ;
      T01FC98_A396EmprCod = new String[] {""} ;
      T01FC98_A831TipColCod = new byte[1] ;
      T01FC99_A396EmprCod = new String[] {""} ;
      T01FC99_A829TipArtCod = new short[1] ;
      T01FC100_A396EmprCod = new String[] {""} ;
      T01FC100_A719PrdNum = new String[] {""} ;
      T01FC100_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FC101_A396EmprCod = new String[] {""} ;
      T01FC101_A252CliCod = new int[1] ;
      T01FC101_n252CliCod = new boolean[] {false} ;
      T01FC101_A65ArtCod = new String[] {""} ;
      T01FC101_A598LinRec = new byte[1] ;
      T01FC102_A396EmprCod = new String[] {""} ;
      T01FC102_A764ProForCod = new String[] {""} ;
      T01FC103_A396EmprCod = new String[] {""} ;
      T01FC103_A758ProCod = new String[] {""} ;
      T01FC104_A396EmprCod = new String[] {""} ;
      T01FC104_A252CliCod = new int[1] ;
      T01FC104_n252CliCod = new boolean[] {false} ;
      T01FC104_A457FasCod = new String[] {""} ;
      T01FC105_A396EmprCod = new String[] {""} ;
      T01FC105_A719PrdNum = new String[] {""} ;
      T01FC105_A681PrdAny = new short[1] ;
      T01FC106_A396EmprCod = new String[] {""} ;
      T01FC106_A719PrdNum = new String[] {""} ;
      T01FC106_A680PrdAltNum = new String[] {""} ;
      T01FC107_A396EmprCod = new String[] {""} ;
      T01FC107_A658PedCod = new int[1] ;
      T01FC107_A719PrdNum = new String[] {""} ;
      T01FC108_A396EmprCod = new String[] {""} ;
      T01FC108_A652OpeCod = new int[1] ;
      T01FC109_A396EmprCod = new String[] {""} ;
      T01FC109_A629MetCod = new byte[1] ;
      T01FC110_A396EmprCod = new String[] {""} ;
      T01FC110_A626MatCod = new short[1] ;
      T01FC111_A396EmprCod = new String[] {""} ;
      T01FC111_A602MaqCod = new String[] {""} ;
      T01FC112_A396EmprCod = new String[] {""} ;
      T01FC112_A583IntCod = new byte[1] ;
      T01FC113_A396EmprCod = new String[] {""} ;
      T01FC113_A506HbaBarCod = new int[1] ;
      T01FC113_A508HbaBarReo = new byte[1] ;
      T01FC113_A507HbaBarPar = new String[] {""} ;
      T01FC114_A396EmprCod = new String[] {""} ;
      T01FC114_A503GruOpeCod = new int[1] ;
      T01FC115_A396EmprCod = new String[] {""} ;
      T01FC115_A501GruMaqCod = new String[] {""} ;
      T01FC116_A396EmprCod = new String[] {""} ;
      T01FC116_A499GrpFamCod = new byte[1] ;
      T01FC117_A396EmprCod = new String[] {""} ;
      T01FC117_A497FpgCod = new String[] {""} ;
      T01FC118_A396EmprCod = new String[] {""} ;
      T01FC118_A457FasCod = new String[] {""} ;
      T01FC118_A463FasNumLin = new byte[1] ;
      T01FC119_A396EmprCod = new String[] {""} ;
      T01FC119_A430FacCod = new int[1] ;
      T01FC120_A396EmprCod = new String[] {""} ;
      T01FC120_A313ContCod = new String[] {""} ;
      T01FC121_A396EmprCod = new String[] {""} ;
      T01FC121_A361DisCod = new int[1] ;
      T01FC121_A376DisObsLin = new byte[1] ;
      T01FC122_A396EmprCod = new String[] {""} ;
      T01FC122_A361DisCod = new int[1] ;
      T01FC122_A44AlbRecCod = new int[1] ;
      T01FC123_A396EmprCod = new String[] {""} ;
      T01FC123_A486ForNumCol = new int[1] ;
      T01FC124_A396EmprCod = new String[] {""} ;
      T01FC124_A323DevGenCod = new int[1] ;
      T01FC125_A396EmprCod = new String[] {""} ;
      T01FC125_A719PrdNum = new String[] {""} ;
      T01FC125_A647NumCon = new int[1] ;
      T01FC126_A396EmprCod = new String[] {""} ;
      T01FC126_A252CliCod = new int[1] ;
      T01FC126_n252CliCod = new boolean[] {false} ;
      T01FC126_A287CliPagLin = new byte[1] ;
      T01FC127_A396EmprCod = new String[] {""} ;
      T01FC127_A252CliCod = new int[1] ;
      T01FC127_n252CliCod = new boolean[] {false} ;
      T01FC127_A266CliEnvLin = new byte[1] ;
      T01FC128_A396EmprCod = new String[] {""} ;
      T01FC128_A241CieBarCod = new int[1] ;
      T01FC128_A243CieBarReo = new byte[1] ;
      T01FC128_A242CieBarPar = new String[] {""} ;
      T01FC129_A396EmprCod = new String[] {""} ;
      T01FC129_A129BarCod = new int[1] ;
      T01FC129_n129BarCod = new boolean[] {false} ;
      T01FC129_A132BarCodReo = new byte[1] ;
      T01FC129_n132BarCodReo = new boolean[] {false} ;
      T01FC129_A130BarCodPar = new String[] {""} ;
      T01FC129_n130BarCodPar = new boolean[] {false} ;
      T01FC129_A200BarPieCod = new String[] {""} ;
      T01FC130_A396EmprCod = new String[] {""} ;
      T01FC130_A129BarCod = new int[1] ;
      T01FC130_n129BarCod = new boolean[] {false} ;
      T01FC130_A132BarCodReo = new byte[1] ;
      T01FC130_n132BarCodReo = new boolean[] {false} ;
      T01FC130_A130BarCodPar = new String[] {""} ;
      T01FC130_n130BarCodPar = new boolean[] {false} ;
      T01FC130_A188BarNotLin = new byte[1] ;
      T01FC131_A396EmprCod = new String[] {""} ;
      T01FC131_A129BarCod = new int[1] ;
      T01FC131_n129BarCod = new boolean[] {false} ;
      T01FC131_A132BarCodReo = new byte[1] ;
      T01FC131_n132BarCodReo = new boolean[] {false} ;
      T01FC131_A130BarCodPar = new String[] {""} ;
      T01FC131_n130BarCodPar = new boolean[] {false} ;
      T01FC131_A119BarAgrCod = new int[1] ;
      T01FC131_A124BarAgrReo = new byte[1] ;
      T01FC131_A122BarAgrPar = new String[] {""} ;
      T01FC132_A396EmprCod = new String[] {""} ;
      T01FC132_A30AlbProCod = new long[1] ;
      T01FC133_A396EmprCod = new String[] {""} ;
      T01FC133_A14AlbComCod = new int[1] ;
      T01FC133_A20AlbComLin = new short[1] ;
      T01FC134_A396EmprCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3562EmpQuePrd = DecimalUtil.ZERO ;
      ZZ3563EmpQueCol = DecimalUtil.ZERO ;
      ZZ3564EmpQueSod = DecimalUtil.ZERO ;
      ZZ3565EmpCosInd = DecimalUtil.ZERO ;
      ZZ3566EmpGasGen = DecimalUtil.ZERO ;
      ZZ3567EmpMarCom = DecimalUtil.ZERO ;
      ZZ3568EmpCosTin = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrnempres__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrnempres__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrnempres__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrnempres__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrnempres__default(),
         new Object[] {
             new Object[] {
            T01FC2_A396EmprCod, T01FC2_A407EmprNom, T01FC2_n407EmprNom, T01FC2_A3562EmpQuePrd, T01FC2_n3562EmpQuePrd, T01FC2_A3563EmpQueCol, T01FC2_n3563EmpQueCol, T01FC2_A3564EmpQueSod, T01FC2_n3564EmpQueSod, T01FC2_A3565EmpCosInd,
            T01FC2_n3565EmpCosInd, T01FC2_A3566EmpGasGen, T01FC2_n3566EmpGasGen, T01FC2_A3567EmpMarCom, T01FC2_n3567EmpMarCom, T01FC2_A3568EmpCosTin, T01FC2_n3568EmpCosTin, T01FC2_A3734EmpRelBan, T01FC2_n3734EmpRelBan
            }
            , new Object[] {
            T01FC3_A396EmprCod, T01FC3_A407EmprNom, T01FC3_n407EmprNom, T01FC3_A3562EmpQuePrd, T01FC3_n3562EmpQuePrd, T01FC3_A3563EmpQueCol, T01FC3_n3563EmpQueCol, T01FC3_A3564EmpQueSod, T01FC3_n3564EmpQueSod, T01FC3_A3565EmpCosInd,
            T01FC3_n3565EmpCosInd, T01FC3_A3566EmpGasGen, T01FC3_n3566EmpGasGen, T01FC3_A3567EmpMarCom, T01FC3_n3567EmpMarCom, T01FC3_A3568EmpCosTin, T01FC3_n3568EmpCosTin, T01FC3_A3734EmpRelBan, T01FC3_n3734EmpRelBan
            }
            , new Object[] {
            T01FC4_A396EmprCod, T01FC4_A407EmprNom, T01FC4_n407EmprNom, T01FC4_A3562EmpQuePrd, T01FC4_n3562EmpQuePrd, T01FC4_A3563EmpQueCol, T01FC4_n3563EmpQueCol, T01FC4_A3564EmpQueSod, T01FC4_n3564EmpQueSod, T01FC4_A3565EmpCosInd,
            T01FC4_n3565EmpCosInd, T01FC4_A3566EmpGasGen, T01FC4_n3566EmpGasGen, T01FC4_A3567EmpMarCom, T01FC4_n3567EmpMarCom, T01FC4_A3568EmpCosTin, T01FC4_n3568EmpCosTin, T01FC4_A3734EmpRelBan, T01FC4_n3734EmpRelBan
            }
            , new Object[] {
            T01FC5_A396EmprCod
            }
            , new Object[] {
            T01FC6_A396EmprCod
            }
            , new Object[] {
            T01FC7_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FC11_A396EmprCod, T01FC11_A3331LanBroCod
            }
            , new Object[] {
            T01FC12_A396EmprCod, T01FC12_A252CliCod, T01FC12_A3320CliLimKgs
            }
            , new Object[] {
            T01FC13_A396EmprCod, T01FC13_A252CliCod, T01FC13_A65ArtCod, T01FC13_A3319ArtCapKgs
            }
            , new Object[] {
            T01FC14_A396EmprCod, T01FC14_A3316CodSol
            }
            , new Object[] {
            T01FC15_A396EmprCod, T01FC15_A3288CCalCod
            }
            , new Object[] {
            T01FC16_A396EmprCod, T01FC16_A3253SolTraCod, T01FC16_A3269SolTraLin
            }
            , new Object[] {
            T01FC17_A396EmprCod, T01FC17_A3235SolSubCod, T01FC17_A3251SolSubLin
            }
            , new Object[] {
            T01FC18_A396EmprCod, T01FC18_A3218SolLuzCod, T01FC18_A3233SolLuzLin
            }
            , new Object[] {
            T01FC19_A396EmprCod, T01FC19_A3196SolFriCod, T01FC19_A3216SolFriLin
            }
            , new Object[] {
            T01FC20_A396EmprCod, T01FC20_A3165SolPilCod, T01FC20_A3185SolPilLin
            }
            , new Object[] {
            T01FC21_A396EmprCod, T01FC21_A3153CodCod
            }
            , new Object[] {
            T01FC22_A396EmprCod, T01FC22_A3073RepCod
            }
            , new Object[] {
            T01FC23_A396EmprCod, T01FC23_A3061Codia, T01FC23_A3062CoMes, T01FC23_A3063CoAny
            }
            , new Object[] {
            T01FC24_A396EmprCod, T01FC24_A3047LOParId
            }
            , new Object[] {
            T01FC25_A396EmprCod, T01FC25_A3033CCCod
            }
            , new Object[] {
            T01FC26_A396EmprCod, T01FC26_A2971SabFacCod
            }
            , new Object[] {
            T01FC27_A396EmprCod, T01FC27_A2954TiDia, T01FC27_A2955TiMes, T01FC27_A2956TiAny
            }
            , new Object[] {
            T01FC28_A396EmprCod, T01FC28_A2942LzaDia, T01FC28_A2943LzaMes, T01FC28_A2944LzaAny
            }
            , new Object[] {
            T01FC29_A396EmprCod, T01FC29_A252CliCod, T01FC29_A65ArtCod, T01FC29_A2937RecIntCod
            }
            , new Object[] {
            T01FC30_A396EmprCod, T01FC30_A252CliCod, T01FC30_A2933RecTipCon
            }
            , new Object[] {
            T01FC31_A396EmprCod, T01FC31_A252CliCod, T01FC31_A65ArtCod, T01FC31_A2931Limite2
            }
            , new Object[] {
            T01FC32_A396EmprCod, T01FC32_A252CliCod, T01FC32_A2927RecProCod
            }
            , new Object[] {
            T01FC33_A396EmprCod, T01FC33_A2921HisProTiCo, T01FC33_A2922HisProTiLP, T01FC33_A2913HisProTiFe, T01FC33_A2923HisProTiL
            }
            , new Object[] {
            T01FC34_A396EmprCod, T01FC34_A252CliCod, T01FC34_A2891HMaForSer, T01FC34_A2892HMaForCNom, T01FC34_A2893HMaForCNum, T01FC34_A2894HMaTipCCod, T01FC34_A2895HMaForNumC, T01FC34_A2897HMaColLin, T01FC34_A2896HMaFec, T01FC34_A2907HmaLin
            }
            , new Object[] {
            T01FC35_A396EmprCod, T01FC35_A129BarCod, T01FC35_A132BarCodReo, T01FC35_A130BarCodPar, T01FC35_A2872HAnRLinMaq, T01FC35_A2873HAnRLinPro, T01FC35_A2874HAnRLin, T01FC35_A2875HAnNumAny
            }
            , new Object[] {
            T01FC36_A396EmprCod, T01FC36_A2855CodBota, T01FC36_A2859BotLin
            }
            , new Object[] {
            T01FC37_A396EmprCod, T01FC37_A2853TipBotCod
            }
            , new Object[] {
            T01FC38_A396EmprCod, T01FC38_A2817PlaTer, T01FC38_A2818PlaOrd
            }
            , new Object[] {
            T01FC39_A396EmprCod, T01FC39_A2809MetTerCod, T01FC39_A129BarCod, T01FC39_A132BarCodReo, T01FC39_A130BarCodPar
            }
            , new Object[] {
            T01FC40_A396EmprCod, T01FC40_A129BarCod, T01FC40_A132BarCodReo, T01FC40_A130BarCodPar, T01FC40_A2808RecLinMAL, T01FC40_A1377RecNumAny, T01FC40_A719PrdNum
            }
            , new Object[] {
            T01FC41_A396EmprCod, T01FC41_A2792TermiCod, T01FC41_A129BarCod, T01FC41_A132BarCodReo, T01FC41_A130BarCodPar
            }
            , new Object[] {
            T01FC42_A396EmprCod, T01FC42_A30AlbProCod, T01FC42_A129BarCod, T01FC42_A132BarCodReo, T01FC42_A130BarCodPar, T01FC42_A2764AlbHdrLin
            }
            , new Object[] {
            T01FC43_A396EmprCod, T01FC43_A252CliCod, T01FC43_A65ArtCod, T01FC43_A71ArtEstAny, T01FC43_A2756ArtEstSer
            }
            , new Object[] {
            T01FC44_A396EmprCod, T01FC44_A252CliCod, T01FC44_A425EstAny, T01FC44_A2755EstSerFac
            }
            , new Object[] {
            T01FC45_A396EmprCod, T01FC45_A2730RecTipCo, T01FC45_A252CliCod
            }
            , new Object[] {
            T01FC46_A396EmprCod, T01FC46_A2707NumTexCod
            }
            , new Object[] {
            T01FC47_A396EmprCod, T01FC47_A129BarCod, T01FC47_A132BarCodReo, T01FC47_A130BarCodPar, T01FC47_A2494BarDosPro, T01FC47_A719PrdNum
            }
            , new Object[] {
            T01FC48_A396EmprCod, T01FC48_A658PedCod, T01FC48_A2501PedObsLin
            }
            , new Object[] {
            T01FC49_A396EmprCod, T01FC49_A129BarCod, T01FC49_A132BarCodReo, T01FC49_A130BarCodPar, T01FC49_A2457BarObLin
            }
            , new Object[] {
            T01FC50_A396EmprCod, T01FC50_A129BarCod, T01FC50_A132BarCodReo, T01FC50_A130BarCodPar, T01FC50_A2444BarEnLin
            }
            , new Object[] {
            T01FC51_A396EmprCod, T01FC51_A2429TerBarCod, T01FC51_A2431TerBarReo, T01FC51_A2430TerBarPar
            }
            , new Object[] {
            T01FC52_A396EmprCod, T01FC52_A2420OpeAntCod
            }
            , new Object[] {
            T01FC53_A396EmprCod, T01FC53_A2406ExhAlbCod, T01FC53_A2416ExhObsLin
            }
            , new Object[] {
            T01FC54_A396EmprCod, T01FC54_A2406ExhAlbCod, T01FC54_A129BarCod, T01FC54_A132BarCodReo, T01FC54_A130BarCodPar
            }
            , new Object[] {
            T01FC55_A396EmprCod, T01FC55_A14AlbComCod, T01FC55_A2386AlbCObsLin
            }
            , new Object[] {
            T01FC56_A396EmprCod, T01FC56_A2382AbcTerCod, T01FC56_A2381AbcSec, T01FC56_A252CliCod
            }
            , new Object[] {
            T01FC57_A396EmprCod, T01FC57_A252CliCod, T01FC57_A2308CliDesCod
            }
            , new Object[] {
            T01FC58_A396EmprCod, T01FC58_A2268MovParCod, T01FC58_A252CliCod, T01FC58_A2276MovParLin
            }
            , new Object[] {
            T01FC59_A396EmprCod, T01FC59_A2253SalExtAlb, T01FC59_A129BarCod, T01FC59_A132BarCodReo, T01FC59_A130BarCodPar
            }
            , new Object[] {
            T01FC60_A396EmprCod, T01FC60_A2248ManCod
            }
            , new Object[] {
            T01FC61_A396EmprCod, T01FC61_A44AlbRecCod, T01FC61_A2159AlbRecPie
            }
            , new Object[] {
            T01FC62_A396EmprCod, T01FC62_A44AlbRecCod, T01FC62_A2165HisEmpLin
            }
            , new Object[] {
            T01FC63_A396EmprCod, T01FC63_A1794GruLecMaq, T01FC63_A1795GruOrd, T01FC63_A1791GruBarCod, T01FC63_A1793GruBarReo, T01FC63_A1792GruBarPar
            }
            , new Object[] {
            T01FC64_A396EmprCod, T01FC64_A1664ParFasCod
            }
            , new Object[] {
            T01FC65_A396EmprCod, T01FC65_A1514MacProCod
            }
            , new Object[] {
            T01FC66_A396EmprCod, T01FC66_A252CliCod, T01FC66_A1504CliProCod, T01FC66_A65ArtCod
            }
            , new Object[] {
            T01FC67_A396EmprCod, T01FC67_A1438BarTerCod, T01FC67_A172BarLanLin
            }
            , new Object[] {
            T01FC68_A396EmprCod, T01FC68_A1387AlbPrvCod
            }
            , new Object[] {
            T01FC69_A396EmprCod, T01FC69_A44AlbRecCod, T01FC69_A1299AlbRLin
            }
            , new Object[] {
            T01FC70_A396EmprCod, T01FC70_A858ZonGeoCod
            }
            , new Object[] {
            T01FC71_A396EmprCod, T01FC71_A1348SolColCod, T01FC71_A1351SolColLin
            }
            , new Object[] {
            T01FC72_A396EmprCod, T01FC72_A1333EstDimCod, T01FC72_A1339EstDimLin
            }
            , new Object[] {
            T01FC73_A396EmprCod, T01FC73_A1314EnsLabCod
            }
            , new Object[] {
            T01FC74_A396EmprCod, T01FC74_A252CliCod, T01FC74_A1213TalCod, T01FC74_A1293EntMarRef
            }
            , new Object[] {
            T01FC75_A396EmprCod, T01FC75_A1206TubCod
            }
            , new Object[] {
            T01FC76_A396EmprCod, T01FC76_A252CliCod, T01FC76_A1213TalCod, T01FC76_A1217EntMalLin
            }
            , new Object[] {
            T01FC77_A396EmprCod, T01FC77_A1199MacCod
            }
            , new Object[] {
            T01FC78_A396EmprCod, T01FC78_A1209DesCod
            }
            , new Object[] {
            T01FC79_A396EmprCod, T01FC79_A1211TipEntCod
            }
            , new Object[] {
            T01FC80_A396EmprCod, T01FC80_A688PrdComCod
            }
            , new Object[] {
            T01FC81_A396EmprCod, T01FC81_A1166LecMaqCod
            }
            , new Object[] {
            T01FC82_A396EmprCod, T01FC82_A1161TurnCod
            }
            , new Object[] {
            T01FC83_A396EmprCod, T01FC83_A1146DisDisCod, T01FC83_A1139DisBarCod, T01FC83_A1140DisBarReo, T01FC83_A1141DisBarPar
            }
            , new Object[] {
            T01FC84_A396EmprCod, T01FC84_A996TipCon
            }
            , new Object[] {
            T01FC85_A396EmprCod, T01FC85_A970ProceCod
            }
            , new Object[] {
            T01FC86_A396EmprCod, T01FC86_A30AlbProCod, T01FC86_A915AlbPObsLin
            }
            , new Object[] {
            T01FC87_A396EmprCod, T01FC87_A910Workstat
            }
            , new Object[] {
            T01FC88_A396EmprCod, T01FC88_A129BarCod, T01FC88_A132BarCodReo, T01FC88_A130BarCodPar, T01FC88_A906ObsReoLin
            }
            , new Object[] {
            T01FC89_A396EmprCod, T01FC89_A656ParCod
            }
            , new Object[] {
            T01FC90_A396EmprCod, T01FC90_A859CumCodCont
            }
            , new Object[] {
            T01FC91_A396EmprCod, T01FC91_A490ForPrdUMe
            }
            , new Object[] {
            T01FC92_A396EmprCod, T01FC92_A840TrnCod
            }
            , new Object[] {
            T01FC93_A396EmprCod, T01FC93_A856ValCod
            }
            , new Object[] {
            T01FC94_A396EmprCod, T01FC94_A848UniCod
            }
            , new Object[] {
            T01FC95_A396EmprCod, T01FC95_A687PrdCod
            }
            , new Object[] {
            T01FC96_A396EmprCod, T01FC96_A835TipDtoCod
            }
            , new Object[] {
            T01FC97_A396EmprCod, T01FC97_A833TipDefCod
            }
            , new Object[] {
            T01FC98_A396EmprCod, T01FC98_A831TipColCod
            }
            , new Object[] {
            T01FC99_A396EmprCod, T01FC99_A829TipArtCod
            }
            , new Object[] {
            T01FC100_A396EmprCod, T01FC100_A719PrdNum, T01FC100_A810RecFec
            }
            , new Object[] {
            T01FC101_A396EmprCod, T01FC101_A252CliCod, T01FC101_A65ArtCod, T01FC101_A598LinRec
            }
            , new Object[] {
            T01FC102_A396EmprCod, T01FC102_A764ProForCod
            }
            , new Object[] {
            T01FC103_A396EmprCod, T01FC103_A758ProCod
            }
            , new Object[] {
            T01FC104_A396EmprCod, T01FC104_A252CliCod, T01FC104_A457FasCod
            }
            , new Object[] {
            T01FC105_A396EmprCod, T01FC105_A719PrdNum, T01FC105_A681PrdAny
            }
            , new Object[] {
            T01FC106_A396EmprCod, T01FC106_A719PrdNum, T01FC106_A680PrdAltNum
            }
            , new Object[] {
            T01FC107_A396EmprCod, T01FC107_A658PedCod, T01FC107_A719PrdNum
            }
            , new Object[] {
            T01FC108_A396EmprCod, T01FC108_A652OpeCod
            }
            , new Object[] {
            T01FC109_A396EmprCod, T01FC109_A629MetCod
            }
            , new Object[] {
            T01FC110_A396EmprCod, T01FC110_A626MatCod
            }
            , new Object[] {
            T01FC111_A396EmprCod, T01FC111_A602MaqCod
            }
            , new Object[] {
            T01FC112_A396EmprCod, T01FC112_A583IntCod
            }
            , new Object[] {
            T01FC113_A396EmprCod, T01FC113_A506HbaBarCod, T01FC113_A508HbaBarReo, T01FC113_A507HbaBarPar
            }
            , new Object[] {
            T01FC114_A396EmprCod, T01FC114_A503GruOpeCod
            }
            , new Object[] {
            T01FC115_A396EmprCod, T01FC115_A501GruMaqCod
            }
            , new Object[] {
            T01FC116_A396EmprCod, T01FC116_A499GrpFamCod
            }
            , new Object[] {
            T01FC117_A396EmprCod, T01FC117_A497FpgCod
            }
            , new Object[] {
            T01FC118_A396EmprCod, T01FC118_A457FasCod, T01FC118_A463FasNumLin
            }
            , new Object[] {
            T01FC119_A396EmprCod, T01FC119_A430FacCod
            }
            , new Object[] {
            T01FC120_A396EmprCod, T01FC120_A313ContCod
            }
            , new Object[] {
            T01FC121_A396EmprCod, T01FC121_A361DisCod, T01FC121_A376DisObsLin
            }
            , new Object[] {
            T01FC122_A396EmprCod, T01FC122_A361DisCod, T01FC122_A44AlbRecCod
            }
            , new Object[] {
            T01FC123_A396EmprCod, T01FC123_A486ForNumCol
            }
            , new Object[] {
            T01FC124_A396EmprCod, T01FC124_A323DevGenCod
            }
            , new Object[] {
            T01FC125_A396EmprCod, T01FC125_A719PrdNum, T01FC125_A647NumCon
            }
            , new Object[] {
            T01FC126_A396EmprCod, T01FC126_A252CliCod, T01FC126_A287CliPagLin
            }
            , new Object[] {
            T01FC127_A396EmprCod, T01FC127_A252CliCod, T01FC127_A266CliEnvLin
            }
            , new Object[] {
            T01FC128_A396EmprCod, T01FC128_A241CieBarCod, T01FC128_A243CieBarReo, T01FC128_A242CieBarPar
            }
            , new Object[] {
            T01FC129_A396EmprCod, T01FC129_A129BarCod, T01FC129_A132BarCodReo, T01FC129_A130BarCodPar, T01FC129_A200BarPieCod
            }
            , new Object[] {
            T01FC130_A396EmprCod, T01FC130_A129BarCod, T01FC130_A132BarCodReo, T01FC130_A130BarCodPar, T01FC130_A188BarNotLin
            }
            , new Object[] {
            T01FC131_A396EmprCod, T01FC131_A129BarCod, T01FC131_A132BarCodReo, T01FC131_A130BarCodPar, T01FC131_A119BarAgrCod, T01FC131_A124BarAgrReo, T01FC131_A122BarAgrPar
            }
            , new Object[] {
            T01FC132_A396EmprCod, T01FC132_A30AlbProCod
            }
            , new Object[] {
            T01FC133_A396EmprCod, T01FC133_A14AlbComCod, T01FC133_A20AlbComLin
            }
            , new Object[] {
            T01FC134_A396EmprCod
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z3734EmpRelBan ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3734EmpRelBan ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private short ZZ3734EmpRelBan ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmpQuePrd_Enabled ;
   private int edtEmpQueCol_Enabled ;
   private int edtEmpQueSod_Enabled ;
   private int edtEmpCosInd_Enabled ;
   private int edtEmpGasGen_Enabled ;
   private int edtEmpMarCom_Enabled ;
   private int edtEmpCosTin_Enabled ;
   private int edtEmpRelBan_Enabled ;
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
   private int edtEmpRelBan_Backcolor ;
   private int edtEmpCosTin_Backcolor ;
   private int edtEmpMarCom_Backcolor ;
   private int edtEmpGasGen_Backcolor ;
   private int edtEmpCosInd_Backcolor ;
   private int edtEmpQueSod_Backcolor ;
   private int edtEmpQueCol_Backcolor ;
   private int edtEmpQuePrd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private java.math.BigDecimal Z3562EmpQuePrd ;
   private java.math.BigDecimal Z3563EmpQueCol ;
   private java.math.BigDecimal Z3564EmpQueSod ;
   private java.math.BigDecimal Z3565EmpCosInd ;
   private java.math.BigDecimal Z3566EmpGasGen ;
   private java.math.BigDecimal Z3567EmpMarCom ;
   private java.math.BigDecimal Z3568EmpCosTin ;
   private java.math.BigDecimal A3562EmpQuePrd ;
   private java.math.BigDecimal A3563EmpQueCol ;
   private java.math.BigDecimal A3564EmpQueSod ;
   private java.math.BigDecimal A3565EmpCosInd ;
   private java.math.BigDecimal A3566EmpGasGen ;
   private java.math.BigDecimal A3567EmpMarCom ;
   private java.math.BigDecimal A3568EmpCosTin ;
   private java.math.BigDecimal ZZ3562EmpQuePrd ;
   private java.math.BigDecimal ZZ3563EmpQueCol ;
   private java.math.BigDecimal ZZ3564EmpQueSod ;
   private java.math.BigDecimal ZZ3565EmpCosInd ;
   private java.math.BigDecimal ZZ3566EmpGasGen ;
   private java.math.BigDecimal ZZ3567EmpMarCom ;
   private java.math.BigDecimal ZZ3568EmpCosTin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmpQuePrd_Internalname ;
   private String edtEmpQuePrd_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmpQueCol_Internalname ;
   private String edtEmpQueCol_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmpQueSod_Internalname ;
   private String edtEmpQueSod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmpCosInd_Internalname ;
   private String edtEmpCosInd_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmpGasGen_Internalname ;
   private String edtEmpGasGen_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmpMarCom_Internalname ;
   private String edtEmpMarCom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEmpCosTin_Internalname ;
   private String edtEmpCosTin_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEmpRelBan_Internalname ;
   private String edtEmpRelBan_Jsonclick ;
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
   private String sMode27 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n3562EmpQuePrd ;
   private boolean n3563EmpQueCol ;
   private boolean n3564EmpQueSod ;
   private boolean n3565EmpCosInd ;
   private boolean n3566EmpGasGen ;
   private boolean n3567EmpMarCom ;
   private boolean n3568EmpCosTin ;
   private boolean n3734EmpRelBan ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01FC4_A396EmprCod ;
   private String[] T01FC4_A407EmprNom ;
   private boolean[] T01FC4_n407EmprNom ;
   private java.math.BigDecimal[] T01FC4_A3562EmpQuePrd ;
   private boolean[] T01FC4_n3562EmpQuePrd ;
   private java.math.BigDecimal[] T01FC4_A3563EmpQueCol ;
   private boolean[] T01FC4_n3563EmpQueCol ;
   private java.math.BigDecimal[] T01FC4_A3564EmpQueSod ;
   private boolean[] T01FC4_n3564EmpQueSod ;
   private java.math.BigDecimal[] T01FC4_A3565EmpCosInd ;
   private boolean[] T01FC4_n3565EmpCosInd ;
   private java.math.BigDecimal[] T01FC4_A3566EmpGasGen ;
   private boolean[] T01FC4_n3566EmpGasGen ;
   private java.math.BigDecimal[] T01FC4_A3567EmpMarCom ;
   private boolean[] T01FC4_n3567EmpMarCom ;
   private java.math.BigDecimal[] T01FC4_A3568EmpCosTin ;
   private boolean[] T01FC4_n3568EmpCosTin ;
   private short[] T01FC4_A3734EmpRelBan ;
   private boolean[] T01FC4_n3734EmpRelBan ;
   private String[] T01FC5_A396EmprCod ;
   private String[] T01FC3_A396EmprCod ;
   private String[] T01FC3_A407EmprNom ;
   private boolean[] T01FC3_n407EmprNom ;
   private java.math.BigDecimal[] T01FC3_A3562EmpQuePrd ;
   private boolean[] T01FC3_n3562EmpQuePrd ;
   private java.math.BigDecimal[] T01FC3_A3563EmpQueCol ;
   private boolean[] T01FC3_n3563EmpQueCol ;
   private java.math.BigDecimal[] T01FC3_A3564EmpQueSod ;
   private boolean[] T01FC3_n3564EmpQueSod ;
   private java.math.BigDecimal[] T01FC3_A3565EmpCosInd ;
   private boolean[] T01FC3_n3565EmpCosInd ;
   private java.math.BigDecimal[] T01FC3_A3566EmpGasGen ;
   private boolean[] T01FC3_n3566EmpGasGen ;
   private java.math.BigDecimal[] T01FC3_A3567EmpMarCom ;
   private boolean[] T01FC3_n3567EmpMarCom ;
   private java.math.BigDecimal[] T01FC3_A3568EmpCosTin ;
   private boolean[] T01FC3_n3568EmpCosTin ;
   private short[] T01FC3_A3734EmpRelBan ;
   private boolean[] T01FC3_n3734EmpRelBan ;
   private String[] T01FC6_A396EmprCod ;
   private String[] T01FC7_A396EmprCod ;
   private String[] T01FC2_A396EmprCod ;
   private String[] T01FC2_A407EmprNom ;
   private boolean[] T01FC2_n407EmprNom ;
   private java.math.BigDecimal[] T01FC2_A3562EmpQuePrd ;
   private boolean[] T01FC2_n3562EmpQuePrd ;
   private java.math.BigDecimal[] T01FC2_A3563EmpQueCol ;
   private boolean[] T01FC2_n3563EmpQueCol ;
   private java.math.BigDecimal[] T01FC2_A3564EmpQueSod ;
   private boolean[] T01FC2_n3564EmpQueSod ;
   private java.math.BigDecimal[] T01FC2_A3565EmpCosInd ;
   private boolean[] T01FC2_n3565EmpCosInd ;
   private java.math.BigDecimal[] T01FC2_A3566EmpGasGen ;
   private boolean[] T01FC2_n3566EmpGasGen ;
   private java.math.BigDecimal[] T01FC2_A3567EmpMarCom ;
   private boolean[] T01FC2_n3567EmpMarCom ;
   private java.math.BigDecimal[] T01FC2_A3568EmpCosTin ;
   private boolean[] T01FC2_n3568EmpCosTin ;
   private short[] T01FC2_A3734EmpRelBan ;
   private boolean[] T01FC2_n3734EmpRelBan ;
   private String[] T01FC11_A396EmprCod ;
   private byte[] T01FC11_A3331LanBroCod ;
   private String[] T01FC12_A396EmprCod ;
   private int[] T01FC12_A252CliCod ;
   private boolean[] T01FC12_n252CliCod ;
   private java.math.BigDecimal[] T01FC12_A3320CliLimKgs ;
   private String[] T01FC13_A396EmprCod ;
   private int[] T01FC13_A252CliCod ;
   private boolean[] T01FC13_n252CliCod ;
   private String[] T01FC13_A65ArtCod ;
   private java.math.BigDecimal[] T01FC13_A3319ArtCapKgs ;
   private String[] T01FC14_A396EmprCod ;
   private short[] T01FC14_A3316CodSol ;
   private String[] T01FC15_A396EmprCod ;
   private String[] T01FC15_A3288CCalCod ;
   private String[] T01FC16_A396EmprCod ;
   private int[] T01FC16_A3253SolTraCod ;
   private byte[] T01FC16_A3269SolTraLin ;
   private String[] T01FC17_A396EmprCod ;
   private int[] T01FC17_A3235SolSubCod ;
   private byte[] T01FC17_A3251SolSubLin ;
   private String[] T01FC18_A396EmprCod ;
   private int[] T01FC18_A3218SolLuzCod ;
   private byte[] T01FC18_A3233SolLuzLin ;
   private String[] T01FC19_A396EmprCod ;
   private int[] T01FC19_A3196SolFriCod ;
   private byte[] T01FC19_A3216SolFriLin ;
   private String[] T01FC20_A396EmprCod ;
   private int[] T01FC20_A3165SolPilCod ;
   private byte[] T01FC20_A3185SolPilLin ;
   private String[] T01FC21_A396EmprCod ;
   private String[] T01FC21_A3153CodCod ;
   private String[] T01FC22_A396EmprCod ;
   private String[] T01FC22_A3073RepCod ;
   private String[] T01FC23_A396EmprCod ;
   private byte[] T01FC23_A3061Codia ;
   private byte[] T01FC23_A3062CoMes ;
   private short[] T01FC23_A3063CoAny ;
   private String[] T01FC24_A396EmprCod ;
   private String[] T01FC24_A3047LOParId ;
   private String[] T01FC25_A396EmprCod ;
   private String[] T01FC25_A3033CCCod ;
   private String[] T01FC26_A396EmprCod ;
   private int[] T01FC26_A2971SabFacCod ;
   private String[] T01FC27_A396EmprCod ;
   private byte[] T01FC27_A2954TiDia ;
   private byte[] T01FC27_A2955TiMes ;
   private short[] T01FC27_A2956TiAny ;
   private String[] T01FC28_A396EmprCod ;
   private byte[] T01FC28_A2942LzaDia ;
   private byte[] T01FC28_A2943LzaMes ;
   private short[] T01FC28_A2944LzaAny ;
   private String[] T01FC29_A396EmprCod ;
   private int[] T01FC29_A252CliCod ;
   private boolean[] T01FC29_n252CliCod ;
   private String[] T01FC29_A65ArtCod ;
   private byte[] T01FC29_A2937RecIntCod ;
   private String[] T01FC30_A396EmprCod ;
   private int[] T01FC30_A252CliCod ;
   private boolean[] T01FC30_n252CliCod ;
   private short[] T01FC30_A2933RecTipCon ;
   private String[] T01FC31_A396EmprCod ;
   private int[] T01FC31_A252CliCod ;
   private boolean[] T01FC31_n252CliCod ;
   private String[] T01FC31_A65ArtCod ;
   private short[] T01FC31_A2931Limite2 ;
   private String[] T01FC32_A396EmprCod ;
   private int[] T01FC32_A252CliCod ;
   private boolean[] T01FC32_n252CliCod ;
   private String[] T01FC32_A2927RecProCod ;
   private String[] T01FC33_A396EmprCod ;
   private String[] T01FC33_A2921HisProTiCo ;
   private short[] T01FC33_A2922HisProTiLP ;
   private java.util.Date[] T01FC33_A2913HisProTiFe ;
   private short[] T01FC33_A2923HisProTiL ;
   private String[] T01FC34_A396EmprCod ;
   private int[] T01FC34_A252CliCod ;
   private boolean[] T01FC34_n252CliCod ;
   private String[] T01FC34_A2891HMaForSer ;
   private String[] T01FC34_A2892HMaForCNom ;
   private int[] T01FC34_A2893HMaForCNum ;
   private byte[] T01FC34_A2894HMaTipCCod ;
   private int[] T01FC34_A2895HMaForNumC ;
   private short[] T01FC34_A2897HMaColLin ;
   private java.util.Date[] T01FC34_A2896HMaFec ;
   private short[] T01FC34_A2907HmaLin ;
   private String[] T01FC35_A396EmprCod ;
   private int[] T01FC35_A129BarCod ;
   private boolean[] T01FC35_n129BarCod ;
   private byte[] T01FC35_A132BarCodReo ;
   private boolean[] T01FC35_n132BarCodReo ;
   private String[] T01FC35_A130BarCodPar ;
   private boolean[] T01FC35_n130BarCodPar ;
   private short[] T01FC35_A2872HAnRLinMaq ;
   private byte[] T01FC35_A2873HAnRLinPro ;
   private short[] T01FC35_A2874HAnRLin ;
   private byte[] T01FC35_A2875HAnNumAny ;
   private String[] T01FC36_A396EmprCod ;
   private int[] T01FC36_A2855CodBota ;
   private short[] T01FC36_A2859BotLin ;
   private String[] T01FC37_A396EmprCod ;
   private byte[] T01FC37_A2853TipBotCod ;
   private String[] T01FC38_A396EmprCod ;
   private String[] T01FC38_A2817PlaTer ;
   private short[] T01FC38_A2818PlaOrd ;
   private String[] T01FC39_A396EmprCod ;
   private String[] T01FC39_A2809MetTerCod ;
   private int[] T01FC39_A129BarCod ;
   private boolean[] T01FC39_n129BarCod ;
   private byte[] T01FC39_A132BarCodReo ;
   private boolean[] T01FC39_n132BarCodReo ;
   private String[] T01FC39_A130BarCodPar ;
   private boolean[] T01FC39_n130BarCodPar ;
   private String[] T01FC40_A396EmprCod ;
   private int[] T01FC40_A129BarCod ;
   private boolean[] T01FC40_n129BarCod ;
   private byte[] T01FC40_A132BarCodReo ;
   private boolean[] T01FC40_n132BarCodReo ;
   private String[] T01FC40_A130BarCodPar ;
   private boolean[] T01FC40_n130BarCodPar ;
   private short[] T01FC40_A2808RecLinMAL ;
   private byte[] T01FC40_A1377RecNumAny ;
   private String[] T01FC40_A719PrdNum ;
   private String[] T01FC41_A396EmprCod ;
   private String[] T01FC41_A2792TermiCod ;
   private int[] T01FC41_A129BarCod ;
   private boolean[] T01FC41_n129BarCod ;
   private byte[] T01FC41_A132BarCodReo ;
   private boolean[] T01FC41_n132BarCodReo ;
   private String[] T01FC41_A130BarCodPar ;
   private boolean[] T01FC41_n130BarCodPar ;
   private String[] T01FC42_A396EmprCod ;
   private long[] T01FC42_A30AlbProCod ;
   private int[] T01FC42_A129BarCod ;
   private boolean[] T01FC42_n129BarCod ;
   private byte[] T01FC42_A132BarCodReo ;
   private boolean[] T01FC42_n132BarCodReo ;
   private String[] T01FC42_A130BarCodPar ;
   private boolean[] T01FC42_n130BarCodPar ;
   private short[] T01FC42_A2764AlbHdrLin ;
   private String[] T01FC43_A396EmprCod ;
   private int[] T01FC43_A252CliCod ;
   private boolean[] T01FC43_n252CliCod ;
   private String[] T01FC43_A65ArtCod ;
   private short[] T01FC43_A71ArtEstAny ;
   private String[] T01FC43_A2756ArtEstSer ;
   private String[] T01FC44_A396EmprCod ;
   private int[] T01FC44_A252CliCod ;
   private boolean[] T01FC44_n252CliCod ;
   private short[] T01FC44_A425EstAny ;
   private String[] T01FC44_A2755EstSerFac ;
   private String[] T01FC45_A396EmprCod ;
   private short[] T01FC45_A2730RecTipCo ;
   private int[] T01FC45_A252CliCod ;
   private boolean[] T01FC45_n252CliCod ;
   private String[] T01FC46_A396EmprCod ;
   private String[] T01FC46_A2707NumTexCod ;
   private String[] T01FC47_A396EmprCod ;
   private int[] T01FC47_A129BarCod ;
   private boolean[] T01FC47_n129BarCod ;
   private byte[] T01FC47_A132BarCodReo ;
   private boolean[] T01FC47_n132BarCodReo ;
   private String[] T01FC47_A130BarCodPar ;
   private boolean[] T01FC47_n130BarCodPar ;
   private String[] T01FC47_A2494BarDosPro ;
   private String[] T01FC47_A719PrdNum ;
   private String[] T01FC48_A396EmprCod ;
   private int[] T01FC48_A658PedCod ;
   private byte[] T01FC48_A2501PedObsLin ;
   private String[] T01FC49_A396EmprCod ;
   private int[] T01FC49_A129BarCod ;
   private boolean[] T01FC49_n129BarCod ;
   private byte[] T01FC49_A132BarCodReo ;
   private boolean[] T01FC49_n132BarCodReo ;
   private String[] T01FC49_A130BarCodPar ;
   private boolean[] T01FC49_n130BarCodPar ;
   private short[] T01FC49_A2457BarObLin ;
   private String[] T01FC50_A396EmprCod ;
   private int[] T01FC50_A129BarCod ;
   private boolean[] T01FC50_n129BarCod ;
   private byte[] T01FC50_A132BarCodReo ;
   private boolean[] T01FC50_n132BarCodReo ;
   private String[] T01FC50_A130BarCodPar ;
   private boolean[] T01FC50_n130BarCodPar ;
   private short[] T01FC50_A2444BarEnLin ;
   private String[] T01FC51_A396EmprCod ;
   private int[] T01FC51_A2429TerBarCod ;
   private byte[] T01FC51_A2431TerBarReo ;
   private String[] T01FC51_A2430TerBarPar ;
   private String[] T01FC52_A396EmprCod ;
   private int[] T01FC52_A2420OpeAntCod ;
   private String[] T01FC53_A396EmprCod ;
   private int[] T01FC53_A2406ExhAlbCod ;
   private short[] T01FC53_A2416ExhObsLin ;
   private String[] T01FC54_A396EmprCod ;
   private int[] T01FC54_A2406ExhAlbCod ;
   private int[] T01FC54_A129BarCod ;
   private boolean[] T01FC54_n129BarCod ;
   private byte[] T01FC54_A132BarCodReo ;
   private boolean[] T01FC54_n132BarCodReo ;
   private String[] T01FC54_A130BarCodPar ;
   private boolean[] T01FC54_n130BarCodPar ;
   private String[] T01FC55_A396EmprCod ;
   private int[] T01FC55_A14AlbComCod ;
   private byte[] T01FC55_A2386AlbCObsLin ;
   private String[] T01FC56_A396EmprCod ;
   private String[] T01FC56_A2382AbcTerCod ;
   private String[] T01FC56_A2381AbcSec ;
   private int[] T01FC56_A252CliCod ;
   private boolean[] T01FC56_n252CliCod ;
   private String[] T01FC57_A396EmprCod ;
   private int[] T01FC57_A252CliCod ;
   private boolean[] T01FC57_n252CliCod ;
   private int[] T01FC57_A2308CliDesCod ;
   private String[] T01FC58_A396EmprCod ;
   private String[] T01FC58_A2268MovParCod ;
   private int[] T01FC58_A252CliCod ;
   private boolean[] T01FC58_n252CliCod ;
   private short[] T01FC58_A2276MovParLin ;
   private String[] T01FC59_A396EmprCod ;
   private int[] T01FC59_A2253SalExtAlb ;
   private int[] T01FC59_A129BarCod ;
   private boolean[] T01FC59_n129BarCod ;
   private byte[] T01FC59_A132BarCodReo ;
   private boolean[] T01FC59_n132BarCodReo ;
   private String[] T01FC59_A130BarCodPar ;
   private boolean[] T01FC59_n130BarCodPar ;
   private String[] T01FC60_A396EmprCod ;
   private short[] T01FC60_A2248ManCod ;
   private String[] T01FC61_A396EmprCod ;
   private int[] T01FC61_A44AlbRecCod ;
   private String[] T01FC61_A2159AlbRecPie ;
   private String[] T01FC62_A396EmprCod ;
   private int[] T01FC62_A44AlbRecCod ;
   private short[] T01FC62_A2165HisEmpLin ;
   private String[] T01FC63_A396EmprCod ;
   private String[] T01FC63_A1794GruLecMaq ;
   private byte[] T01FC63_A1795GruOrd ;
   private int[] T01FC63_A1791GruBarCod ;
   private byte[] T01FC63_A1793GruBarReo ;
   private String[] T01FC63_A1792GruBarPar ;
   private String[] T01FC64_A396EmprCod ;
   private short[] T01FC64_A1664ParFasCod ;
   private String[] T01FC65_A396EmprCod ;
   private String[] T01FC65_A1514MacProCod ;
   private String[] T01FC66_A396EmprCod ;
   private int[] T01FC66_A252CliCod ;
   private boolean[] T01FC66_n252CliCod ;
   private String[] T01FC66_A1504CliProCod ;
   private String[] T01FC66_A65ArtCod ;
   private String[] T01FC67_A396EmprCod ;
   private String[] T01FC67_A1438BarTerCod ;
   private short[] T01FC67_A172BarLanLin ;
   private String[] T01FC68_A396EmprCod ;
   private int[] T01FC68_A1387AlbPrvCod ;
   private String[] T01FC69_A396EmprCod ;
   private int[] T01FC69_A44AlbRecCod ;
   private byte[] T01FC69_A1299AlbRLin ;
   private String[] T01FC70_A396EmprCod ;
   private short[] T01FC70_A858ZonGeoCod ;
   private String[] T01FC71_A396EmprCod ;
   private int[] T01FC71_A1348SolColCod ;
   private byte[] T01FC71_A1351SolColLin ;
   private String[] T01FC72_A396EmprCod ;
   private int[] T01FC72_A1333EstDimCod ;
   private byte[] T01FC72_A1339EstDimLin ;
   private String[] T01FC73_A396EmprCod ;
   private int[] T01FC73_A1314EnsLabCod ;
   private String[] T01FC74_A396EmprCod ;
   private int[] T01FC74_A252CliCod ;
   private boolean[] T01FC74_n252CliCod ;
   private String[] T01FC74_A1213TalCod ;
   private String[] T01FC74_A1293EntMarRef ;
   private String[] T01FC75_A396EmprCod ;
   private short[] T01FC75_A1206TubCod ;
   private String[] T01FC76_A396EmprCod ;
   private int[] T01FC76_A252CliCod ;
   private boolean[] T01FC76_n252CliCod ;
   private String[] T01FC76_A1213TalCod ;
   private short[] T01FC76_A1217EntMalLin ;
   private String[] T01FC77_A396EmprCod ;
   private int[] T01FC77_A1199MacCod ;
   private String[] T01FC78_A396EmprCod ;
   private short[] T01FC78_A1209DesCod ;
   private String[] T01FC79_A396EmprCod ;
   private short[] T01FC79_A1211TipEntCod ;
   private String[] T01FC80_A396EmprCod ;
   private String[] T01FC80_A688PrdComCod ;
   private String[] T01FC81_A396EmprCod ;
   private String[] T01FC81_A1166LecMaqCod ;
   private String[] T01FC82_A396EmprCod ;
   private byte[] T01FC82_A1161TurnCod ;
   private String[] T01FC83_A396EmprCod ;
   private int[] T01FC83_A1146DisDisCod ;
   private int[] T01FC83_A1139DisBarCod ;
   private byte[] T01FC83_A1140DisBarReo ;
   private String[] T01FC83_A1141DisBarPar ;
   private String[] T01FC84_A396EmprCod ;
   private short[] T01FC84_A996TipCon ;
   private String[] T01FC85_A396EmprCod ;
   private short[] T01FC85_A970ProceCod ;
   private String[] T01FC86_A396EmprCod ;
   private long[] T01FC86_A30AlbProCod ;
   private byte[] T01FC86_A915AlbPObsLin ;
   private String[] T01FC87_A396EmprCod ;
   private String[] T01FC87_A910Workstat ;
   private String[] T01FC88_A396EmprCod ;
   private int[] T01FC88_A129BarCod ;
   private boolean[] T01FC88_n129BarCod ;
   private byte[] T01FC88_A132BarCodReo ;
   private boolean[] T01FC88_n132BarCodReo ;
   private String[] T01FC88_A130BarCodPar ;
   private boolean[] T01FC88_n130BarCodPar ;
   private byte[] T01FC88_A906ObsReoLin ;
   private String[] T01FC89_A396EmprCod ;
   private short[] T01FC89_A656ParCod ;
   private String[] T01FC90_A396EmprCod ;
   private int[] T01FC90_A859CumCodCont ;
   private String[] T01FC91_A396EmprCod ;
   private byte[] T01FC91_A490ForPrdUMe ;
   private String[] T01FC92_A396EmprCod ;
   private short[] T01FC92_A840TrnCod ;
   private String[] T01FC93_A396EmprCod ;
   private byte[] T01FC93_A856ValCod ;
   private String[] T01FC94_A396EmprCod ;
   private byte[] T01FC94_A848UniCod ;
   private String[] T01FC95_A396EmprCod ;
   private byte[] T01FC95_A687PrdCod ;
   private String[] T01FC96_A396EmprCod ;
   private byte[] T01FC96_A835TipDtoCod ;
   private String[] T01FC97_A396EmprCod ;
   private short[] T01FC97_A833TipDefCod ;
   private String[] T01FC98_A396EmprCod ;
   private byte[] T01FC98_A831TipColCod ;
   private String[] T01FC99_A396EmprCod ;
   private short[] T01FC99_A829TipArtCod ;
   private String[] T01FC100_A396EmprCod ;
   private String[] T01FC100_A719PrdNum ;
   private java.util.Date[] T01FC100_A810RecFec ;
   private String[] T01FC101_A396EmprCod ;
   private int[] T01FC101_A252CliCod ;
   private boolean[] T01FC101_n252CliCod ;
   private String[] T01FC101_A65ArtCod ;
   private byte[] T01FC101_A598LinRec ;
   private String[] T01FC102_A396EmprCod ;
   private String[] T01FC102_A764ProForCod ;
   private String[] T01FC103_A396EmprCod ;
   private String[] T01FC103_A758ProCod ;
   private String[] T01FC104_A396EmprCod ;
   private int[] T01FC104_A252CliCod ;
   private boolean[] T01FC104_n252CliCod ;
   private String[] T01FC104_A457FasCod ;
   private String[] T01FC105_A396EmprCod ;
   private String[] T01FC105_A719PrdNum ;
   private short[] T01FC105_A681PrdAny ;
   private String[] T01FC106_A396EmprCod ;
   private String[] T01FC106_A719PrdNum ;
   private String[] T01FC106_A680PrdAltNum ;
   private String[] T01FC107_A396EmprCod ;
   private int[] T01FC107_A658PedCod ;
   private String[] T01FC107_A719PrdNum ;
   private String[] T01FC108_A396EmprCod ;
   private int[] T01FC108_A652OpeCod ;
   private String[] T01FC109_A396EmprCod ;
   private byte[] T01FC109_A629MetCod ;
   private String[] T01FC110_A396EmprCod ;
   private short[] T01FC110_A626MatCod ;
   private String[] T01FC111_A396EmprCod ;
   private String[] T01FC111_A602MaqCod ;
   private String[] T01FC112_A396EmprCod ;
   private byte[] T01FC112_A583IntCod ;
   private String[] T01FC113_A396EmprCod ;
   private int[] T01FC113_A506HbaBarCod ;
   private byte[] T01FC113_A508HbaBarReo ;
   private String[] T01FC113_A507HbaBarPar ;
   private String[] T01FC114_A396EmprCod ;
   private int[] T01FC114_A503GruOpeCod ;
   private String[] T01FC115_A396EmprCod ;
   private String[] T01FC115_A501GruMaqCod ;
   private String[] T01FC116_A396EmprCod ;
   private byte[] T01FC116_A499GrpFamCod ;
   private String[] T01FC117_A396EmprCod ;
   private String[] T01FC117_A497FpgCod ;
   private String[] T01FC118_A396EmprCod ;
   private String[] T01FC118_A457FasCod ;
   private byte[] T01FC118_A463FasNumLin ;
   private String[] T01FC119_A396EmprCod ;
   private int[] T01FC119_A430FacCod ;
   private String[] T01FC120_A396EmprCod ;
   private String[] T01FC120_A313ContCod ;
   private String[] T01FC121_A396EmprCod ;
   private int[] T01FC121_A361DisCod ;
   private byte[] T01FC121_A376DisObsLin ;
   private String[] T01FC122_A396EmprCod ;
   private int[] T01FC122_A361DisCod ;
   private int[] T01FC122_A44AlbRecCod ;
   private String[] T01FC123_A396EmprCod ;
   private int[] T01FC123_A486ForNumCol ;
   private String[] T01FC124_A396EmprCod ;
   private int[] T01FC124_A323DevGenCod ;
   private String[] T01FC125_A396EmprCod ;
   private String[] T01FC125_A719PrdNum ;
   private int[] T01FC125_A647NumCon ;
   private String[] T01FC126_A396EmprCod ;
   private int[] T01FC126_A252CliCod ;
   private boolean[] T01FC126_n252CliCod ;
   private byte[] T01FC126_A287CliPagLin ;
   private String[] T01FC127_A396EmprCod ;
   private int[] T01FC127_A252CliCod ;
   private boolean[] T01FC127_n252CliCod ;
   private byte[] T01FC127_A266CliEnvLin ;
   private String[] T01FC128_A396EmprCod ;
   private int[] T01FC128_A241CieBarCod ;
   private byte[] T01FC128_A243CieBarReo ;
   private String[] T01FC128_A242CieBarPar ;
   private String[] T01FC129_A396EmprCod ;
   private int[] T01FC129_A129BarCod ;
   private boolean[] T01FC129_n129BarCod ;
   private byte[] T01FC129_A132BarCodReo ;
   private boolean[] T01FC129_n132BarCodReo ;
   private String[] T01FC129_A130BarCodPar ;
   private boolean[] T01FC129_n130BarCodPar ;
   private String[] T01FC129_A200BarPieCod ;
   private String[] T01FC130_A396EmprCod ;
   private int[] T01FC130_A129BarCod ;
   private boolean[] T01FC130_n129BarCod ;
   private byte[] T01FC130_A132BarCodReo ;
   private boolean[] T01FC130_n132BarCodReo ;
   private String[] T01FC130_A130BarCodPar ;
   private boolean[] T01FC130_n130BarCodPar ;
   private byte[] T01FC130_A188BarNotLin ;
   private String[] T01FC131_A396EmprCod ;
   private int[] T01FC131_A129BarCod ;
   private boolean[] T01FC131_n129BarCod ;
   private byte[] T01FC131_A132BarCodReo ;
   private boolean[] T01FC131_n132BarCodReo ;
   private String[] T01FC131_A130BarCodPar ;
   private boolean[] T01FC131_n130BarCodPar ;
   private int[] T01FC131_A119BarAgrCod ;
   private byte[] T01FC131_A124BarAgrReo ;
   private String[] T01FC131_A122BarAgrPar ;
   private String[] T01FC132_A396EmprCod ;
   private long[] T01FC132_A30AlbProCod ;
   private String[] T01FC133_A396EmprCod ;
   private int[] T01FC133_A14AlbComCod ;
   private short[] T01FC133_A20AlbComLin ;
   private String[] T01FC134_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrnempres__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnempres__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnempres__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnempres__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnempres__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FC2", "SELECT EmprCod, EmprNom, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FC3", "SELECT EmprCod, EmprNom, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FC4", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod, TM1.EmprNom, TM1.EmpQuePrd, TM1.EmpQueCol, TM1.EmpQueSod, TM1.EmpCosInd, TM1.EmpGasGen, TM1.EmpMarCom, TM1.EmpCosTin, TM1.EmpRelBan FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FC5", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FC6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod > ?) ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod < ?) ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FC8", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T01FC9", "UPDATE TXPEMPRES SET EmprNom=?, EmpQuePrd=?, EmpQueCol=?, EmpQueSod=?, EmpCosInd=?, EmpGasGen=?, EmpMarCom=?, EmpCosTin=?, EmpRelBan=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T01FC10", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T01FC11", "SELECT * FROM (SELECT EmprCod, LanBroCod FROM TXPLANBRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC12", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC13", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC14", "SELECT * FROM (SELECT EmprCod, CodSol FROM TXPSOLIDE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC15", "SELECT * FROM (SELECT EmprCod, CCalCod FROM TXPCONCAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC16", "SELECT * FROM (SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC17", "SELECT * FROM (SELECT EmprCod, SolSubCod, SolSubLin FROM TXPLSUBLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC18", "SELECT * FROM (SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC19", "SELECT * FROM (SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC20", "SELECT * FROM (SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC21", "SELECT * FROM (SELECT EmprCod, CodCod FROM TXPCODFAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC22", "SELECT * FROM (SELECT EmprCod, RepCod FROM TXPREPRES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC23", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny FROM TXPCCOSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC24", "SELECT * FROM (SELECT EmprCod, LOParId FROM TXPLOPara WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC25", "SELECT * FROM (SELECT EmprCod, CCCod FROM TXPCCSer WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC26", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC27", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC28", "SELECT * FROM (SELECT EmprCod, LzaDia, LzaMes, LzaAny FROM TXPCKGSLA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC30", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC32", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC33", "SELECT * FROM (SELECT EmprCod, HisProTiCo, HisProTiLP, HisProTiFe, HisProTiL FROM TXPHISTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC34", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC36", "SELECT * FROM (SELECT EmprCod, CodBota, BotLin FROM TXPLBOTAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC37", "SELECT * FROM (SELECT EmprCod, TipBotCod FROM TXPTIPBOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC38", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC39", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC41", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC42", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC44", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC45", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC46", "SELECT * FROM (SELECT EmprCod, NumTexCod FROM TXPNUMTEX WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC48", "SELECT * FROM (SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC50", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC51", "SELECT * FROM (SELECT EmprCod, TerBarCod, TerBarReo, TerBarPar FROM TXPENVTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC52", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC53", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, ExhObsLin FROM TXPOEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC54", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC55", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC56", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC57", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC58", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod, MovParLin FROM TXPLMOVPD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC59", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC60", "SELECT * FROM (SELECT EmprCod, ManCod FROM TXPMANUFA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC61", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC62", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC63", "SELECT * FROM (SELECT EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar FROM TXPGRULEC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC64", "SELECT * FROM (SELECT EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC65", "SELECT * FROM (SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC66", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC67", "SELECT * FROM (SELECT EmprCod, BarTerCod, BarLanLin FROM TXPBARLAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC68", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC69", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC70", "SELECT * FROM (SELECT EmprCod, ZonGeoCod FROM TXPZONGEO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC71", "SELECT * FROM (SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC72", "SELECT * FROM (SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC73", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC74", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMarRef FROM TXPENTMAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC75", "SELECT * FROM (SELECT EmprCod, TubCod FROM TXPTUBOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC76", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMalLin FROM TXPLENTMA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC77", "SELECT * FROM (SELECT EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC78", "SELECT * FROM (SELECT EmprCod, DesCod FROM TXPDESTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC79", "SELECT * FROM (SELECT EmprCod, TipEntCod FROM TXPENTRAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC80", "SELECT * FROM (SELECT EmprCod, PrdComCod FROM TXPCPRDCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC81", "SELECT * FROM (SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC82", "SELECT * FROM (SELECT EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC83", "SELECT * FROM (SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC84", "SELECT * FROM (SELECT EmprCod, TipCon FROM TXPTIPCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC85", "SELECT * FROM (SELECT EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC86", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC87", "SELECT * FROM (SELECT EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC88", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC89", "SELECT * FROM (SELECT EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC90", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC91", "SELECT * FROM (SELECT EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC92", "SELECT * FROM (SELECT EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC93", "SELECT * FROM (SELECT EmprCod, ValCod FROM TXPTIPVAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC94", "SELECT * FROM (SELECT EmprCod, UniCod FROM TXPTIPUNI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC95", "SELECT * FROM (SELECT EmprCod, PrdCod FROM TXPTIPPRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC96", "SELECT * FROM (SELECT EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC97", "SELECT * FROM (SELECT EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC98", "SELECT * FROM (SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC99", "SELECT * FROM (SELECT EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC100", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC101", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC102", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC103", "SELECT * FROM (SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC104", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC105", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC106", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC107", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC108", "SELECT * FROM (SELECT EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC109", "SELECT * FROM (SELECT EmprCod, MetCod FROM TXPMETPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC110", "SELECT * FROM (SELECT EmprCod, MatCod FROM TXPMATICE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC111", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC112", "SELECT * FROM (SELECT EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC113", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC114", "SELECT * FROM (SELECT EmprCod, GruOpeCod FROM TXPCGRUOP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC115", "SELECT * FROM (SELECT EmprCod, GruMaqCod FROM TXPGRUMAQ WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC116", "SELECT * FROM (SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC117", "SELECT * FROM (SELECT EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC118", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC119", "SELECT * FROM (SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC120", "SELECT * FROM (SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC121", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC122", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC123", "SELECT * FROM (SELECT EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC124", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC125", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC126", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC127", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC128", "SELECT * FROM (SELECT EmprCod, CieBarCod, CieBarReo, CieBarPar FROM TXPCIETIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC129", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC130", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC132", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC133", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FC134", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 127 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 132 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 2);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 127 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 129 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 130 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 131 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

