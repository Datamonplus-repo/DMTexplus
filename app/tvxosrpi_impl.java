package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxosrpi_impl extends GXDataArea
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
         A7525VxOFabTip = httpContext.GetPar( "VxOFabTip") ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = (int)(GXutil.lval( httpContext.GetPar( "VxOSCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A7525VxOFabTip, A12372VxOSCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A6224VxLotId = (int)(GXutil.lval( httpContext.GetPar( "VxLotId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A6224VxLotId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Estructura OSERPI en Vertex", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tvxosrpi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxosrpi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxosrpi_impl.class ));
   }

   public tvxosrpi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxOSRPI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "O. Fabricación", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOFabTip_Internalname, GXutil.rtrim( A7525VxOFabTip), GXutil.rtrim( localUtil.format( A7525VxOFabTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOFabTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxOFabTip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "OSERVIOSCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12372VxOSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOSCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxOSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nro Rollo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotId_Internalname, GXutil.ltrim( localUtil.ntoc( A6224VxLotId, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6224VxLotId), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6224VxLotId), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotId_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotId_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Etiqueta ya impresa", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsPiEtIm_Internalname, GXutil.rtrim( A12367VxOsPiEtIm), GXutil.rtrim( localUtil.format( A12367VxOsPiEtIm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsPiEtIm_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsPiEtIm_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "N° Pieza dentro de la Tanda", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsPTanPz_Internalname, GXutil.ltrim( localUtil.ntoc( A12368VxOsPTanPz, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsPTanPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12368VxOsPTanPz), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12368VxOsPTanPz), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsPTanPz_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsPTanPz_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cantidad Programada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsPCanPr_Internalname, GXutil.ltrim( localUtil.ntoc( A12369VxOsPCanPr, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsPCanPr_Enabled!=0) ? localUtil.format( A12369VxOsPCanPr, "ZZZ9.99") : localUtil.format( A12369VxOsPCanPr, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsPCanPr_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsPCanPr_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Observaciones de la Pieza", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtVxOsPObs_Internalname, A12370VxOsPObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", (short)(0), 1, edtVxOsPObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N° Pieza dentro del Pedido", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxOsPPzaPe_Internalname, GXutil.ltrim( localUtil.ntoc( A12371VxOsPPzaPe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxOsPPzaPe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxOsPPzaPe_Jsonclick, 0, "", "", "", "", "", 1, edtVxOsPPzaPe_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxOSRPI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxOSRPI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxOSRPI.htm");
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
      e111KB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z7525VxOFabTip = httpContext.cgiGet( "Z7525VxOFabTip") ;
            Z12372VxOSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z12372VxOSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6224VxLotId = (int)(localUtil.ctol( httpContext.cgiGet( "Z6224VxLotId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12367VxOsPiEtIm = httpContext.cgiGet( "Z12367VxOsPiEtIm") ;
            Z12368VxOsPTanPz = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12368VxOsPTanPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12369VxOsPCanPr = localUtil.ctond( httpContext.cgiGet( "Z12369VxOsPCanPr")) ;
            Z12370VxOsPObs = httpContext.cgiGet( "Z12370VxOsPObs") ;
            Z12371VxOsPPzaPe = (short)(localUtil.ctol( httpContext.cgiGet( "Z12371VxOsPPzaPe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A7525VxOFabTip = httpContext.cgiGet( edtVxOFabTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOSCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12372VxOSCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            }
            else
            {
               A12372VxOSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxOSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxLotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6224VxLotId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            }
            else
            {
               A6224VxLotId = (int)(localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            }
            A12367VxOsPiEtIm = httpContext.cgiGet( edtVxOsPiEtIm_Internalname) ;
            n12367VxOsPiEtIm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12367VxOsPiEtIm", A12367VxOsPiEtIm);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsPTanPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsPTanPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSPTANPZ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOsPTanPz_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12368VxOsPTanPz = (byte)(0) ;
               n12368VxOsPTanPz = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12368VxOsPTanPz), 2, 0));
            }
            else
            {
               A12368VxOsPTanPz = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxOsPTanPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12368VxOsPTanPz = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12368VxOsPTanPz), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxOsPCanPr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxOsPCanPr_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSPCANPR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOsPCanPr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12369VxOsPCanPr = DecimalUtil.ZERO ;
               n12369VxOsPCanPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrimstr( A12369VxOsPCanPr, 7, 2));
            }
            else
            {
               A12369VxOsPCanPr = localUtil.ctond( httpContext.cgiGet( edtVxOsPCanPr_Internalname)) ;
               n12369VxOsPCanPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrimstr( A12369VxOsPCanPr, 7, 2));
            }
            A12370VxOsPObs = httpContext.cgiGet( edtVxOsPObs_Internalname) ;
            n12370VxOsPObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12370VxOsPObs", A12370VxOsPObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsPPzaPe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxOsPPzaPe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXOSPPZAPE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOsPPzaPe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12371VxOsPPzaPe = (short)(0) ;
               n12371VxOsPPzaPe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), 4, 0));
            }
            else
            {
               A12371VxOsPPzaPe = (short)(localUtil.ctol( httpContext.cgiGet( edtVxOsPPzaPe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12371VxOsPPzaPe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), 4, 0));
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
               A7525VxOFabTip = httpContext.GetPar( "VxOFabTip") ;
               httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
               A12372VxOSCod = (int)(GXutil.lval( httpContext.GetPar( "VxOSCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
               A6224VxLotId = (int)(GXutil.lval( httpContext.GetPar( "VxLotId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
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
                        e111KB2 ();
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
            initAll1KB1742( ) ;
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
      disableAttributes1KB1742( ) ;
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

   public void confirm_1KB0( )
   {
      beforeValidate1KB1742( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KB1742( ) ;
         }
         else
         {
            checkExtendedTable1KB1742( ) ;
            if ( AnyError == 0 )
            {
               zm1KB1742( 2) ;
               zm1KB1742( 3) ;
            }
            closeExtendedTableCursors1KB1742( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KB0( ) ;
      }
   }

   public void resetCaption1KB0( )
   {
   }

   public void e111KB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1KB1742( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12367VxOsPiEtIm = T01KB3_A12367VxOsPiEtIm[0] ;
            Z12368VxOsPTanPz = T01KB3_A12368VxOsPTanPz[0] ;
            Z12369VxOsPCanPr = T01KB3_A12369VxOsPCanPr[0] ;
            Z12370VxOsPObs = T01KB3_A12370VxOsPObs[0] ;
            Z12371VxOsPPzaPe = T01KB3_A12371VxOsPPzaPe[0] ;
         }
         else
         {
            Z12367VxOsPiEtIm = A12367VxOsPiEtIm ;
            Z12368VxOsPTanPz = A12368VxOsPTanPz ;
            Z12369VxOsPCanPr = A12369VxOsPCanPr ;
            Z12370VxOsPObs = A12370VxOsPObs ;
            Z12371VxOsPPzaPe = A12371VxOsPPzaPe ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12367VxOsPiEtIm = A12367VxOsPiEtIm ;
         Z12368VxOsPTanPz = A12368VxOsPTanPz ;
         Z12369VxOsPCanPr = A12369VxOsPCanPr ;
         Z12370VxOsPObs = A12370VxOsPObs ;
         Z12371VxOsPPzaPe = A12371VxOsPPzaPe ;
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         Z6224VxLotId = A6224VxLotId ;
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

   public void load1KB1742( )
   {
      /* Using cursor T01KB6 */
      pr_default.execute(4, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1742 = (short)(1) ;
         A12367VxOsPiEtIm = T01KB6_A12367VxOsPiEtIm[0] ;
         n12367VxOsPiEtIm = T01KB6_n12367VxOsPiEtIm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12367VxOsPiEtIm", A12367VxOsPiEtIm);
         A12368VxOsPTanPz = T01KB6_A12368VxOsPTanPz[0] ;
         n12368VxOsPTanPz = T01KB6_n12368VxOsPTanPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12368VxOsPTanPz), 2, 0));
         A12369VxOsPCanPr = T01KB6_A12369VxOsPCanPr[0] ;
         n12369VxOsPCanPr = T01KB6_n12369VxOsPCanPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrimstr( A12369VxOsPCanPr, 7, 2));
         A12370VxOsPObs = T01KB6_A12370VxOsPObs[0] ;
         n12370VxOsPObs = T01KB6_n12370VxOsPObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12370VxOsPObs", A12370VxOsPObs);
         A12371VxOsPPzaPe = T01KB6_A12371VxOsPPzaPe[0] ;
         n12371VxOsPPzaPe = T01KB6_n12371VxOsPPzaPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), 4, 0));
         zm1KB1742( -1) ;
      }
      pr_default.close(4);
      onLoadActions1KB1742( ) ;
   }

   public void onLoadActions1KB1742( )
   {
   }

   public void checkExtendedTable1KB1742( )
   {
      nIsDirty_1742 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01KB4 */
      pr_default.execute(2, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01KB5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rollos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1KB1742( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A7525VxOFabTip ,
                         int A12372VxOSCod )
   {
      /* Using cursor T01KB7 */
      pr_default.execute(5, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_3( int A6224VxLotId )
   {
      /* Using cursor T01KB8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rollos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
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

   public void getKey1KB1742( )
   {
      /* Using cursor T01KB9 */
      pr_default.execute(7, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1742 = (short)(1) ;
      }
      else
      {
         RcdFound1742 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KB3 */
      pr_default.execute(1, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KB1742( 1) ;
         RcdFound1742 = (short)(1) ;
         A12367VxOsPiEtIm = T01KB3_A12367VxOsPiEtIm[0] ;
         n12367VxOsPiEtIm = T01KB3_n12367VxOsPiEtIm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12367VxOsPiEtIm", A12367VxOsPiEtIm);
         A12368VxOsPTanPz = T01KB3_A12368VxOsPTanPz[0] ;
         n12368VxOsPTanPz = T01KB3_n12368VxOsPTanPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12368VxOsPTanPz), 2, 0));
         A12369VxOsPCanPr = T01KB3_A12369VxOsPCanPr[0] ;
         n12369VxOsPCanPr = T01KB3_n12369VxOsPCanPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrimstr( A12369VxOsPCanPr, 7, 2));
         A12370VxOsPObs = T01KB3_A12370VxOsPObs[0] ;
         n12370VxOsPObs = T01KB3_n12370VxOsPObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12370VxOsPObs", A12370VxOsPObs);
         A12371VxOsPPzaPe = T01KB3_A12371VxOsPPzaPe[0] ;
         n12371VxOsPPzaPe = T01KB3_n12371VxOsPPzaPe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), 4, 0));
         A7525VxOFabTip = T01KB3_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KB3_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A6224VxLotId = T01KB3_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         Z7525VxOFabTip = A7525VxOFabTip ;
         Z12372VxOSCod = A12372VxOSCod ;
         Z6224VxLotId = A6224VxLotId ;
         sMode1742 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KB1742( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1742 = (short)(0) ;
            initializeNonKey1KB1742( ) ;
         }
         Gx_mode = sMode1742 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1742 = (short)(0) ;
         initializeNonKey1KB1742( ) ;
         sMode1742 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1742 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KB1742( ) ;
      if ( RcdFound1742 == 0 )
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
      RcdFound1742 = (short)(0) ;
      /* Using cursor T01KB10 */
      pr_default.execute(8, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A12372VxOSCod), A7525VxOFabTip, Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB10_A12372VxOSCod[0] < A12372VxOSCod ) || ( T01KB10_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB10_A6224VxLotId[0] < A6224VxLotId ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB10_A12372VxOSCod[0] > A12372VxOSCod ) || ( T01KB10_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KB10_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB10_A6224VxLotId[0] > A6224VxLotId ) ) )
         {
            A7525VxOFabTip = T01KB10_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KB10_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A6224VxLotId = T01KB10_A6224VxLotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            RcdFound1742 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1742 = (short)(0) ;
      /* Using cursor T01KB11 */
      pr_default.execute(9, new Object[] {A7525VxOFabTip, A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A12372VxOSCod), A7525VxOFabTip, Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) > 0 ) || ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB11_A12372VxOSCod[0] > A12372VxOSCod ) || ( T01KB11_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB11_A6224VxLotId[0] > A6224VxLotId ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) < 0 ) || ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB11_A12372VxOSCod[0] < A12372VxOSCod ) || ( T01KB11_A12372VxOSCod[0] == A12372VxOSCod ) && ( GXutil.strcmp(T01KB11_A7525VxOFabTip[0], A7525VxOFabTip) == 0 ) && ( T01KB11_A6224VxLotId[0] < A6224VxLotId ) ) )
         {
            A7525VxOFabTip = T01KB11_A7525VxOFabTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = T01KB11_A12372VxOSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A6224VxLotId = T01KB11_A6224VxLotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            RcdFound1742 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KB1742( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KB1742( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1742 == 1 )
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A6224VxLotId != Z6224VxLotId ) )
            {
               A7525VxOFabTip = Z7525VxOFabTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
               A12372VxOSCod = Z12372VxOSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
               A6224VxLotId = Z6224VxLotId ;
               httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXOFABTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KB1742( ) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A6224VxLotId != Z6224VxLotId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxOFabTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KB1742( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXOFABTIP");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxOFabTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KB1742( ) ;
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
      if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A6224VxLotId != Z6224VxLotId ) )
      {
         A7525VxOFabTip = Z7525VxOFabTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = Z12372VxOSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A6224VxLotId = Z6224VxLotId ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
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
      getKey1KB1742( ) ;
      if ( RcdFound1742 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A6224VxLotId != Z6224VxLotId ) )
         {
            A7525VxOFabTip = Z7525VxOFabTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
            A12372VxOSCod = Z12372VxOSCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
            A6224VxLotId = Z6224VxLotId ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXOFABTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxOFabTip_Internalname ;
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
         if ( ( GXutil.strcmp(A7525VxOFabTip, Z7525VxOFabTip) != 0 ) || ( A12372VxOSCod != Z12372VxOSCod ) || ( A6224VxLotId != Z6224VxLotId ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXOFABTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxOFabTip_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrpi");
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KB0( ) ;
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
      if ( RcdFound1742 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXOFABTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KB1742( ) ;
      if ( RcdFound1742 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KB1742( ) ;
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
      if ( RcdFound1742 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
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
      if ( RcdFound1742 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
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
      scanStart1KB1742( ) ;
      if ( RcdFound1742 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1742 != 0 )
         {
            scanNext1KB1742( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KB1742( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KB1742( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KB2 */
         pr_default.execute(0, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERPI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12367VxOsPiEtIm, T01KB2_A12367VxOsPiEtIm[0]) != 0 ) || ( Z12368VxOsPTanPz != T01KB2_A12368VxOsPTanPz[0] ) || ( DecimalUtil.compareTo(Z12369VxOsPCanPr, T01KB2_A12369VxOsPCanPr[0]) != 0 ) || ( GXutil.strcmp(Z12370VxOsPObs, T01KB2_A12370VxOsPObs[0]) != 0 ) || ( Z12371VxOsPPzaPe != T01KB2_A12371VxOsPPzaPe[0] ) )
         {
            if ( GXutil.strcmp(Z12367VxOsPiEtIm, T01KB2_A12367VxOsPiEtIm[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrpi:[seudo value changed for attri]"+"VxOsPiEtIm");
               GXutil.writeLogRaw("Old: ",Z12367VxOsPiEtIm);
               GXutil.writeLogRaw("Current: ",T01KB2_A12367VxOsPiEtIm[0]);
            }
            if ( Z12368VxOsPTanPz != T01KB2_A12368VxOsPTanPz[0] )
            {
               GXutil.writeLogln("tvxosrpi:[seudo value changed for attri]"+"VxOsPTanPz");
               GXutil.writeLogRaw("Old: ",Z12368VxOsPTanPz);
               GXutil.writeLogRaw("Current: ",T01KB2_A12368VxOsPTanPz[0]);
            }
            if ( DecimalUtil.compareTo(Z12369VxOsPCanPr, T01KB2_A12369VxOsPCanPr[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrpi:[seudo value changed for attri]"+"VxOsPCanPr");
               GXutil.writeLogRaw("Old: ",Z12369VxOsPCanPr);
               GXutil.writeLogRaw("Current: ",T01KB2_A12369VxOsPCanPr[0]);
            }
            if ( GXutil.strcmp(Z12370VxOsPObs, T01KB2_A12370VxOsPObs[0]) != 0 )
            {
               GXutil.writeLogln("tvxosrpi:[seudo value changed for attri]"+"VxOsPObs");
               GXutil.writeLogRaw("Old: ",Z12370VxOsPObs);
               GXutil.writeLogRaw("Current: ",T01KB2_A12370VxOsPObs[0]);
            }
            if ( Z12371VxOsPPzaPe != T01KB2_A12371VxOsPPzaPe[0] )
            {
               GXutil.writeLogln("tvxosrpi:[seudo value changed for attri]"+"VxOsPPzaPe");
               GXutil.writeLogRaw("Old: ",Z12371VxOsPPzaPe);
               GXutil.writeLogRaw("Current: ",T01KB2_A12371VxOsPPzaPe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXOSERPI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KB1742( )
   {
      beforeValidate1KB1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KB1742( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KB1742( 0) ;
         checkOptimisticConcurrency1KB1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KB1742( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KB1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KB12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n12367VxOsPiEtIm), A12367VxOsPiEtIm, Boolean.valueOf(n12368VxOsPTanPz), Byte.valueOf(A12368VxOsPTanPz), Boolean.valueOf(n12369VxOsPCanPr), A12369VxOsPCanPr, Boolean.valueOf(n12370VxOsPObs), A12370VxOsPObs, Boolean.valueOf(n12371VxOsPPzaPe), Short.valueOf(A12371VxOsPPzaPe), A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERPI");
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
                        resetCaption1KB0( ) ;
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
            load1KB1742( ) ;
         }
         endLevel1KB1742( ) ;
      }
      closeExtendedTableCursors1KB1742( ) ;
   }

   public void update1KB1742( )
   {
      beforeValidate1KB1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KB1742( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KB1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KB1742( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KB1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KB13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n12367VxOsPiEtIm), A12367VxOsPiEtIm, Boolean.valueOf(n12368VxOsPTanPz), Byte.valueOf(A12368VxOsPTanPz), Boolean.valueOf(n12369VxOsPCanPr), A12369VxOsPCanPr, Boolean.valueOf(n12370VxOsPObs), A12370VxOsPObs, Boolean.valueOf(n12371VxOsPPzaPe), Short.valueOf(A12371VxOsPPzaPe), A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERPI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXOSERPI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KB1742( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KB0( ) ;
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
         endLevel1KB1742( ) ;
      }
      closeExtendedTableCursors1KB1742( ) ;
   }

   public void deferredUpdate1KB1742( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KB1742( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KB1742( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KB1742( ) ;
         afterConfirm1KB1742( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KB1742( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KB14 */
               pr_default.execute(12, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod), Integer.valueOf(A6224VxLotId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXOSERPI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1742 == 0 )
                     {
                        initAll1KB1742( ) ;
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
                     resetCaption1KB0( ) ;
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
      sMode1742 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KB1742( ) ;
      Gx_mode = sMode1742 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KB1742( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KB1742( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KB1742( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxosrpi");
         if ( AnyError == 0 )
         {
            confirmValues1KB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxosrpi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KB1742( )
   {
      /* Using cursor T01KB15 */
      pr_default.execute(13);
      RcdFound1742 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1742 = (short)(1) ;
         A7525VxOFabTip = T01KB15_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KB15_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A6224VxLotId = T01KB15_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KB1742( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1742 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1742 = (short)(1) ;
         A7525VxOFabTip = T01KB15_A7525VxOFabTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
         A12372VxOSCod = T01KB15_A12372VxOSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
         A6224VxLotId = T01KB15_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      }
   }

   public void scanEnd1KB1742( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1KB1742( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KB1742( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KB1742( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KB1742( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KB1742( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KB1742( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KB1742( )
   {
      edtVxOFabTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOFabTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOFabTip_Enabled), 5, 0), true);
      edtVxOSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOSCod_Enabled), 5, 0), true);
      edtVxLotId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotId_Enabled), 5, 0), true);
      edtVxOsPiEtIm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsPiEtIm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsPiEtIm_Enabled), 5, 0), true);
      edtVxOsPTanPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsPTanPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsPTanPz_Enabled), 5, 0), true);
      edtVxOsPCanPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsPCanPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsPCanPr_Enabled), 5, 0), true);
      edtVxOsPObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsPObs_Enabled), 5, 0), true);
      edtVxOsPPzaPe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxOsPPzaPe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxOsPPzaPe_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KB1742( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KB0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxosrpi", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6224VxLotId", GXutil.ltrim( localUtil.ntoc( Z6224VxLotId, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12367VxOsPiEtIm", GXutil.rtrim( Z12367VxOsPiEtIm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12368VxOsPTanPz", GXutil.ltrim( localUtil.ntoc( Z12368VxOsPTanPz, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12369VxOsPCanPr", GXutil.ltrim( localUtil.ntoc( Z12369VxOsPCanPr, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12370VxOsPObs", Z12370VxOsPObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12371VxOsPPzaPe", GXutil.ltrim( localUtil.ntoc( Z12371VxOsPPzaPe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxosrpi", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxOSRPI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estructura OSERPI en Vertex", "") ;
   }

   public void initializeNonKey1KB1742( )
   {
      A12367VxOsPiEtIm = "" ;
      n12367VxOsPiEtIm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12367VxOsPiEtIm", A12367VxOsPiEtIm);
      A12368VxOsPTanPz = (byte)(0) ;
      n12368VxOsPTanPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12368VxOsPTanPz), 2, 0));
      A12369VxOsPCanPr = DecimalUtil.ZERO ;
      n12369VxOsPCanPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrimstr( A12369VxOsPCanPr, 7, 2));
      A12370VxOsPObs = "" ;
      n12370VxOsPObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12370VxOsPObs", A12370VxOsPObs);
      A12371VxOsPPzaPe = (short)(0) ;
      n12371VxOsPPzaPe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12371VxOsPPzaPe), 4, 0));
      Z12367VxOsPiEtIm = "" ;
      Z12368VxOsPTanPz = (byte)(0) ;
      Z12369VxOsPCanPr = DecimalUtil.ZERO ;
      Z12370VxOsPObs = "" ;
      Z12371VxOsPPzaPe = (short)(0) ;
   }

   public void initAll1KB1742( )
   {
      A7525VxOFabTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7525VxOFabTip", A7525VxOFabTip);
      A12372VxOSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12372VxOSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12372VxOSCod), 8, 0));
      A6224VxLotId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      initializeNonKey1KB1742( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026125195229", true, true);
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
      httpContext.AddJavascriptSource("tvxosrpi.js", "?20261251952210", false, true);
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
      edtVxOFabTip_Internalname = "VXOFABTIP" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxOSCod_Internalname = "VXOSCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxLotId_Internalname = "VXLOTID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxOsPiEtIm_Internalname = "VXOSPIETIM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxOsPTanPz_Internalname = "VXOSPTANPZ" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxOsPCanPr_Internalname = "VXOSPCANPR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxOsPObs_Internalname = "VXOSPOBS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxOsPPzaPe_Internalname = "VXOSPPZAPE" ;
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
      Form.setCaption( httpContext.getMessage( "Estructura OSERPI en Vertex", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtVxOsPPzaPe_Jsonclick = "" ;
      edtVxOsPPzaPe_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsPPzaPe_Enabled = 1 ;
      edtVxOsPObs_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsPObs_Enabled = 1 ;
      edtVxOsPCanPr_Jsonclick = "" ;
      edtVxOsPCanPr_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsPCanPr_Enabled = 1 ;
      edtVxOsPTanPz_Jsonclick = "" ;
      edtVxOsPTanPz_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsPTanPz_Enabled = 1 ;
      edtVxOsPiEtIm_Jsonclick = "" ;
      edtVxOsPiEtIm_Backcolor = (int)(0xFFFFFF) ;
      edtVxOsPiEtIm_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxLotId_Jsonclick = "" ;
      edtVxLotId_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotId_Enabled = 1 ;
      edtVxOSCod_Jsonclick = "" ;
      edtVxOSCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxOSCod_Enabled = 1 ;
      edtVxOFabTip_Jsonclick = "" ;
      edtVxOFabTip_Backcolor = (int)(0xFFFFFF) ;
      edtVxOFabTip_Enabled = 1 ;
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
      /* Using cursor T01KB16 */
      pr_default.execute(14, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(14);
      /* Using cursor T01KB17 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rollos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtVxOsPiEtIm_Internalname ;
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

   public void valid_Vxoscod( )
   {
      /* Using cursor T01KB16 */
      pr_default.execute(14, new Object[] {A7525VxOFabTip, Integer.valueOf(A12372VxOSCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tabla VERTEX.OSERVI", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXOSCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxOFabTip_Internalname ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxlotid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01KB17 */
      pr_default.execute(15, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rollos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12367VxOsPiEtIm", GXutil.rtrim( A12367VxOsPiEtIm));
      httpContext.ajax_rsp_assign_attri("", false, "A12368VxOsPTanPz", GXutil.ltrim( localUtil.ntoc( A12368VxOsPTanPz, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12369VxOsPCanPr", GXutil.ltrim( localUtil.ntoc( A12369VxOsPCanPr, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12370VxOsPObs", A12370VxOsPObs);
      httpContext.ajax_rsp_assign_attri("", false, "A12371VxOsPPzaPe", GXutil.ltrim( localUtil.ntoc( A12371VxOsPPzaPe, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7525VxOFabTip", GXutil.rtrim( Z7525VxOFabTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12372VxOSCod", GXutil.ltrim( localUtil.ntoc( Z12372VxOSCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6224VxLotId", GXutil.ltrim( localUtil.ntoc( Z6224VxLotId, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12367VxOsPiEtIm", GXutil.rtrim( Z12367VxOsPiEtIm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12368VxOsPTanPz", GXutil.ltrim( localUtil.ntoc( Z12368VxOsPTanPz, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12369VxOsPCanPr", GXutil.ltrim( localUtil.ntoc( Z12369VxOsPCanPr, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12370VxOsPObs", Z12370VxOsPObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12371VxOsPPzaPe", GXutil.ltrim( localUtil.ntoc( Z12371VxOsPPzaPe, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_VXOFABTIP","{handler:'valid_Vxofabtip',iparms:[]");
      setEventMetadata("VALID_VXOFABTIP",",oparms:[]}");
      setEventMetadata("VALID_VXOSCOD","{handler:'valid_Vxoscod',iparms:[{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A12372VxOSCod',fld:'VXOSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_VXOSCOD",",oparms:[]}");
      setEventMetadata("VALID_VXLOTID","{handler:'valid_Vxlotid',iparms:[{av:'A7525VxOFabTip',fld:'VXOFABTIP',pic:''},{av:'A12372VxOSCod',fld:'VXOSCOD',pic:'ZZZZZZZ9'},{av:'A6224VxLotId',fld:'VXLOTID',pic:'ZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXLOTID",",oparms:[{av:'A12367VxOsPiEtIm',fld:'VXOSPIETIM',pic:''},{av:'A12368VxOsPTanPz',fld:'VXOSPTANPZ',pic:'Z9'},{av:'A12369VxOsPCanPr',fld:'VXOSPCANPR',pic:'ZZZ9.99'},{av:'A12370VxOsPObs',fld:'VXOSPOBS',pic:''},{av:'A12371VxOsPPzaPe',fld:'VXOSPPZAPE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z7525VxOFabTip'},{av:'Z12372VxOSCod'},{av:'Z6224VxLotId'},{av:'Z12367VxOsPiEtIm'},{av:'Z12368VxOsPTanPz'},{av:'Z12369VxOsPCanPr'},{av:'Z12370VxOsPObs'},{av:'Z12371VxOsPPzaPe'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(14);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z7525VxOFabTip = "" ;
      Z12367VxOsPiEtIm = "" ;
      Z12369VxOsPCanPr = DecimalUtil.ZERO ;
      Z12370VxOsPObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7525VxOFabTip = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12367VxOsPiEtIm = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12369VxOsPCanPr = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A12370VxOsPObs = "" ;
      lblTextblock8_Jsonclick = "" ;
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
      T01KB6_A12367VxOsPiEtIm = new String[] {""} ;
      T01KB6_n12367VxOsPiEtIm = new boolean[] {false} ;
      T01KB6_A12368VxOsPTanPz = new byte[1] ;
      T01KB6_n12368VxOsPTanPz = new boolean[] {false} ;
      T01KB6_A12369VxOsPCanPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KB6_n12369VxOsPCanPr = new boolean[] {false} ;
      T01KB6_A12370VxOsPObs = new String[] {""} ;
      T01KB6_n12370VxOsPObs = new boolean[] {false} ;
      T01KB6_A12371VxOsPPzaPe = new short[1] ;
      T01KB6_n12371VxOsPPzaPe = new boolean[] {false} ;
      T01KB6_A7525VxOFabTip = new String[] {""} ;
      T01KB6_A12372VxOSCod = new int[1] ;
      T01KB6_A6224VxLotId = new int[1] ;
      T01KB4_A7525VxOFabTip = new String[] {""} ;
      T01KB5_A6224VxLotId = new int[1] ;
      T01KB7_A7525VxOFabTip = new String[] {""} ;
      T01KB8_A6224VxLotId = new int[1] ;
      T01KB9_A7525VxOFabTip = new String[] {""} ;
      T01KB9_A12372VxOSCod = new int[1] ;
      T01KB9_A6224VxLotId = new int[1] ;
      T01KB3_A12367VxOsPiEtIm = new String[] {""} ;
      T01KB3_n12367VxOsPiEtIm = new boolean[] {false} ;
      T01KB3_A12368VxOsPTanPz = new byte[1] ;
      T01KB3_n12368VxOsPTanPz = new boolean[] {false} ;
      T01KB3_A12369VxOsPCanPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KB3_n12369VxOsPCanPr = new boolean[] {false} ;
      T01KB3_A12370VxOsPObs = new String[] {""} ;
      T01KB3_n12370VxOsPObs = new boolean[] {false} ;
      T01KB3_A12371VxOsPPzaPe = new short[1] ;
      T01KB3_n12371VxOsPPzaPe = new boolean[] {false} ;
      T01KB3_A7525VxOFabTip = new String[] {""} ;
      T01KB3_A12372VxOSCod = new int[1] ;
      T01KB3_A6224VxLotId = new int[1] ;
      sMode1742 = "" ;
      T01KB10_A7525VxOFabTip = new String[] {""} ;
      T01KB10_A12372VxOSCod = new int[1] ;
      T01KB10_A6224VxLotId = new int[1] ;
      T01KB11_A7525VxOFabTip = new String[] {""} ;
      T01KB11_A12372VxOSCod = new int[1] ;
      T01KB11_A6224VxLotId = new int[1] ;
      T01KB2_A12367VxOsPiEtIm = new String[] {""} ;
      T01KB2_n12367VxOsPiEtIm = new boolean[] {false} ;
      T01KB2_A12368VxOsPTanPz = new byte[1] ;
      T01KB2_n12368VxOsPTanPz = new boolean[] {false} ;
      T01KB2_A12369VxOsPCanPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KB2_n12369VxOsPCanPr = new boolean[] {false} ;
      T01KB2_A12370VxOsPObs = new String[] {""} ;
      T01KB2_n12370VxOsPObs = new boolean[] {false} ;
      T01KB2_A12371VxOsPPzaPe = new short[1] ;
      T01KB2_n12371VxOsPPzaPe = new boolean[] {false} ;
      T01KB2_A7525VxOFabTip = new String[] {""} ;
      T01KB2_A12372VxOSCod = new int[1] ;
      T01KB2_A6224VxLotId = new int[1] ;
      T01KB15_A7525VxOFabTip = new String[] {""} ;
      T01KB15_A12372VxOSCod = new int[1] ;
      T01KB15_A6224VxLotId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01KB16_A7525VxOFabTip = new String[] {""} ;
      T01KB17_A6224VxLotId = new int[1] ;
      ZZ7525VxOFabTip = "" ;
      ZZ12367VxOsPiEtIm = "" ;
      ZZ12369VxOsPCanPr = DecimalUtil.ZERO ;
      ZZ12370VxOsPObs = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxosrpi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxosrpi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxosrpi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxosrpi__default(),
         new Object[] {
             new Object[] {
            T01KB2_A12367VxOsPiEtIm, T01KB2_n12367VxOsPiEtIm, T01KB2_A12368VxOsPTanPz, T01KB2_n12368VxOsPTanPz, T01KB2_A12369VxOsPCanPr, T01KB2_n12369VxOsPCanPr, T01KB2_A12370VxOsPObs, T01KB2_n12370VxOsPObs, T01KB2_A12371VxOsPPzaPe, T01KB2_n12371VxOsPPzaPe,
            T01KB2_A7525VxOFabTip, T01KB2_A12372VxOSCod, T01KB2_A6224VxLotId
            }
            , new Object[] {
            T01KB3_A12367VxOsPiEtIm, T01KB3_n12367VxOsPiEtIm, T01KB3_A12368VxOsPTanPz, T01KB3_n12368VxOsPTanPz, T01KB3_A12369VxOsPCanPr, T01KB3_n12369VxOsPCanPr, T01KB3_A12370VxOsPObs, T01KB3_n12370VxOsPObs, T01KB3_A12371VxOsPPzaPe, T01KB3_n12371VxOsPPzaPe,
            T01KB3_A7525VxOFabTip, T01KB3_A12372VxOSCod, T01KB3_A6224VxLotId
            }
            , new Object[] {
            T01KB4_A7525VxOFabTip
            }
            , new Object[] {
            T01KB5_A6224VxLotId
            }
            , new Object[] {
            T01KB6_A12367VxOsPiEtIm, T01KB6_n12367VxOsPiEtIm, T01KB6_A12368VxOsPTanPz, T01KB6_n12368VxOsPTanPz, T01KB6_A12369VxOsPCanPr, T01KB6_n12369VxOsPCanPr, T01KB6_A12370VxOsPObs, T01KB6_n12370VxOsPObs, T01KB6_A12371VxOsPPzaPe, T01KB6_n12371VxOsPPzaPe,
            T01KB6_A7525VxOFabTip, T01KB6_A12372VxOSCod, T01KB6_A6224VxLotId
            }
            , new Object[] {
            T01KB7_A7525VxOFabTip
            }
            , new Object[] {
            T01KB8_A6224VxLotId
            }
            , new Object[] {
            T01KB9_A7525VxOFabTip, T01KB9_A12372VxOSCod, T01KB9_A6224VxLotId
            }
            , new Object[] {
            T01KB10_A7525VxOFabTip, T01KB10_A12372VxOSCod, T01KB10_A6224VxLotId
            }
            , new Object[] {
            T01KB11_A7525VxOFabTip, T01KB11_A12372VxOSCod, T01KB11_A6224VxLotId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KB15_A7525VxOFabTip, T01KB15_A12372VxOSCod, T01KB15_A6224VxLotId
            }
            , new Object[] {
            T01KB16_A7525VxOFabTip
            }
            , new Object[] {
            T01KB17_A6224VxLotId
            }
         }
      );
   }

   private byte Z12368VxOsPTanPz ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12368VxOsPTanPz ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12368VxOsPTanPz ;
   private short Z12371VxOsPPzaPe ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12371VxOsPPzaPe ;
   private short RcdFound1742 ;
   private short nIsDirty_1742 ;
   private short ZZ12371VxOsPPzaPe ;
   private int Z12372VxOSCod ;
   private int Z6224VxLotId ;
   private int A12372VxOSCod ;
   private int A6224VxLotId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxOFabTip_Enabled ;
   private int edtVxOSCod_Enabled ;
   private int edtVxLotId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVxOsPiEtIm_Enabled ;
   private int edtVxOsPTanPz_Enabled ;
   private int edtVxOsPCanPr_Enabled ;
   private int edtVxOsPObs_Enabled ;
   private int edtVxOsPPzaPe_Enabled ;
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
   private int edtVxOsPPzaPe_Backcolor ;
   private int edtVxOsPObs_Backcolor ;
   private int edtVxOsPCanPr_Backcolor ;
   private int edtVxOsPTanPz_Backcolor ;
   private int edtVxOsPiEtIm_Backcolor ;
   private int edtVxLotId_Backcolor ;
   private int edtVxOSCod_Backcolor ;
   private int edtVxOFabTip_Backcolor ;
   private int ZZ12372VxOSCod ;
   private int ZZ6224VxLotId ;
   private java.math.BigDecimal Z12369VxOsPCanPr ;
   private java.math.BigDecimal A12369VxOsPCanPr ;
   private java.math.BigDecimal ZZ12369VxOsPCanPr ;
   private String sPrefix ;
   private String Z7525VxOFabTip ;
   private String Z12367VxOsPiEtIm ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7525VxOFabTip ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxOFabTip_Internalname ;
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
   private String edtVxOFabTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxOSCod_Internalname ;
   private String edtVxOSCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxLotId_Internalname ;
   private String edtVxLotId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxOsPiEtIm_Internalname ;
   private String A12367VxOsPiEtIm ;
   private String edtVxOsPiEtIm_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxOsPTanPz_Internalname ;
   private String edtVxOsPTanPz_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxOsPCanPr_Internalname ;
   private String edtVxOsPCanPr_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxOsPObs_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxOsPPzaPe_Internalname ;
   private String edtVxOsPPzaPe_Jsonclick ;
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
   private String sMode1742 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ7525VxOFabTip ;
   private String ZZ12367VxOsPiEtIm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12367VxOsPiEtIm ;
   private boolean n12368VxOsPTanPz ;
   private boolean n12369VxOsPCanPr ;
   private boolean n12370VxOsPObs ;
   private boolean n12371VxOsPPzaPe ;
   private boolean returnInSub ;
   private String Z12370VxOsPObs ;
   private String A12370VxOsPObs ;
   private String ZZ12370VxOsPObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01KB6_A12367VxOsPiEtIm ;
   private boolean[] T01KB6_n12367VxOsPiEtIm ;
   private byte[] T01KB6_A12368VxOsPTanPz ;
   private boolean[] T01KB6_n12368VxOsPTanPz ;
   private java.math.BigDecimal[] T01KB6_A12369VxOsPCanPr ;
   private boolean[] T01KB6_n12369VxOsPCanPr ;
   private String[] T01KB6_A12370VxOsPObs ;
   private boolean[] T01KB6_n12370VxOsPObs ;
   private short[] T01KB6_A12371VxOsPPzaPe ;
   private boolean[] T01KB6_n12371VxOsPPzaPe ;
   private String[] T01KB6_A7525VxOFabTip ;
   private int[] T01KB6_A12372VxOSCod ;
   private int[] T01KB6_A6224VxLotId ;
   private String[] T01KB4_A7525VxOFabTip ;
   private int[] T01KB5_A6224VxLotId ;
   private String[] T01KB7_A7525VxOFabTip ;
   private int[] T01KB8_A6224VxLotId ;
   private String[] T01KB9_A7525VxOFabTip ;
   private int[] T01KB9_A12372VxOSCod ;
   private int[] T01KB9_A6224VxLotId ;
   private String[] T01KB3_A12367VxOsPiEtIm ;
   private boolean[] T01KB3_n12367VxOsPiEtIm ;
   private byte[] T01KB3_A12368VxOsPTanPz ;
   private boolean[] T01KB3_n12368VxOsPTanPz ;
   private java.math.BigDecimal[] T01KB3_A12369VxOsPCanPr ;
   private boolean[] T01KB3_n12369VxOsPCanPr ;
   private String[] T01KB3_A12370VxOsPObs ;
   private boolean[] T01KB3_n12370VxOsPObs ;
   private short[] T01KB3_A12371VxOsPPzaPe ;
   private boolean[] T01KB3_n12371VxOsPPzaPe ;
   private String[] T01KB3_A7525VxOFabTip ;
   private int[] T01KB3_A12372VxOSCod ;
   private int[] T01KB3_A6224VxLotId ;
   private String[] T01KB10_A7525VxOFabTip ;
   private int[] T01KB10_A12372VxOSCod ;
   private int[] T01KB10_A6224VxLotId ;
   private String[] T01KB11_A7525VxOFabTip ;
   private int[] T01KB11_A12372VxOSCod ;
   private int[] T01KB11_A6224VxLotId ;
   private String[] T01KB2_A12367VxOsPiEtIm ;
   private boolean[] T01KB2_n12367VxOsPiEtIm ;
   private byte[] T01KB2_A12368VxOsPTanPz ;
   private boolean[] T01KB2_n12368VxOsPTanPz ;
   private java.math.BigDecimal[] T01KB2_A12369VxOsPCanPr ;
   private boolean[] T01KB2_n12369VxOsPCanPr ;
   private String[] T01KB2_A12370VxOsPObs ;
   private boolean[] T01KB2_n12370VxOsPObs ;
   private short[] T01KB2_A12371VxOsPPzaPe ;
   private boolean[] T01KB2_n12371VxOsPPzaPe ;
   private String[] T01KB2_A7525VxOFabTip ;
   private int[] T01KB2_A12372VxOSCod ;
   private int[] T01KB2_A6224VxLotId ;
   private String[] T01KB15_A7525VxOFabTip ;
   private int[] T01KB15_A12372VxOSCod ;
   private int[] T01KB15_A6224VxLotId ;
   private String[] T01KB16_A7525VxOFabTip ;
   private int[] T01KB17_A6224VxLotId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxosrpi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrpi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrpi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxosrpi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KB2", "SELECT OsPiEtIm, OsPTanPza, OsPcanPrg, OsPObs, OsPPzaPed, OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE OFabTip = ? AND OSCod = ? AND STeLotId = ?  FOR UPDATE OF OsPiEtIm, OsPTanPza, OsPcanPrg, OsPObs, OsPPzaPed NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB3", "SELECT OsPiEtIm, OsPTanPza, OsPcanPrg, OsPObs, OsPPzaPed, OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE OFabTip = ? AND OSCod = ? AND STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB4", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB5", "SELECT STeLotId AS VxLotId FROM VTXSTKTE WHERE STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB6", "SELECT /*+ FIRST_ROWS(100) */ TM1.OsPiEtIm, TM1.OsPTanPza, TM1.OsPcanPrg, TM1.OsPObs, TM1.OsPPzaPed, TM1.OFabTip AS VxOFabTip, TM1.OSCod AS VxOSCod, TM1.STeLotId AS VxLotId FROM VTXOSERPI TM1 WHERE TM1.OFabTip = ? and TM1.OSCod = ? and TM1.STeLotId = ? ORDER BY TM1.OFabTip, TM1.OSCod, TM1.STeLotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB7", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB8", "SELECT STeLotId AS VxLotId FROM VTXSTKTE WHERE STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB9", "SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE OFabTip = ? AND OSCod = ? AND STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE ( OFabTip > ? or OFabTip = ? and OSCod > ? or OSCod = ? and OFabTip = ? and STeLotId > ?) ORDER BY OFabTip, OSCod, STeLotId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KB11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE ( OFabTip < ? or OFabTip = ? and OSCod < ? or OSCod = ? and OFabTip = ? and STeLotId < ?) ORDER BY OFabTip DESC, OSCod DESC, STeLotId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KB12", "INSERT INTO VTXOSERPI(OsPiEtIm, OsPTanPza, OsPcanPrg, OsPObs, OsPPzaPed, OFabTip, OSCod, STeLotId) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXOSERPI")
         ,new UpdateCursor("T01KB13", "UPDATE VTXOSERPI SET OsPiEtIm=?, OsPTanPza=?, OsPcanPrg=?, OsPObs=?, OsPPzaPed=?  WHERE OFabTip = ? AND OSCod = ? AND STeLotId = ?", GX_NOMASK, "VTXOSERPI")
         ,new UpdateCursor("T01KB14", "DELETE FROM VTXOSERPI  WHERE OFabTip = ? AND OSCod = ? AND STeLotId = ?", GX_NOMASK, "VTXOSERPI")
         ,new ForEachCursor("T01KB15", "SELECT /*+ FIRST_ROWS(100) */ OFabTip AS VxOFabTip, OSCod AS VxOSCod, STeLotId AS VxLotId FROM VTXOSERPI ORDER BY OFabTip, OSCod, STeLotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB16", "SELECT OFabTip AS VxOFabTip FROM VTXOSERVI WHERE OFabTip = ? AND OSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KB17", "SELECT STeLotId AS VxLotId FROM VTXSTKTE WHERE STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 2);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 2);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 2);
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 1024);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 2);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 1024);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 2);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setInt(8, ((Number) parms[12]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

