package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbccomp_impl extends GXDataArea
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
         A13478BCProducto = httpContext.GetPar( "BCProducto") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A13478BCProducto) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Compras Recepcion envio", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBCCPPedido_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbccomp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbccomp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbccomp_impl.class ));
   }

   public tbccomp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBCCOMP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPPedido_Internalname, GXutil.ltrim( localUtil.ntoc( A13488BCCPPedido, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPPedido_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13488BCCPPedido), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13488BCCPPedido), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPPedido_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPPedido_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCProducto_Internalname, GXutil.rtrim( A13478BCProducto), GXutil.rtrim( localUtil.format( A13478BCProducto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCProducto_Jsonclick, 0, "", "", "", "", "", 1, edtBCProducto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCDescripc_Internalname, GXutil.rtrim( A13479BCDescripc), GXutil.rtrim( localUtil.format( A13479BCDescripc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCDescripc_Jsonclick, 0, "", "", "", "", "", 1, edtBCDescripc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPCantid_Internalname, GXutil.ltrim( localUtil.ntoc( A13489BCCPCantid, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPCantid_Enabled!=0) ? localUtil.format( A13489BCCPCantid, "ZZZZZ9.99") : localUtil.format( A13489BCCPCantid, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPCantid_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPCantid_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Precios", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPPrecio_Internalname, GXutil.ltrim( localUtil.ntoc( A13490BCCPPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPPrecio_Enabled!=0) ? localUtil.format( A13490BCCPPrecio, "ZZZZZZ9.99999") : localUtil.format( A13490BCCPPrecio, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPPrecio_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPPrecio_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Fecha Recepcion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCCPFecRec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPFecRec_Internalname, localUtil.format(A13491BCCPFecRec, "99/99/99"), localUtil.format( A13491BCCPFecRec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPFecRec_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPFecRec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCCPFecRec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCCPFecRec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBCCOMP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nalbaran", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPNalbar_Internalname, GXutil.rtrim( A13492BCCPNalbar), GXutil.rtrim( localUtil.format( A13492BCCPNalbar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPNalbar_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPNalbar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Parcial_Total", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPParcia_Internalname, GXutil.rtrim( A13493BCCPParcia), GXutil.rtrim( localUtil.format( A13493BCCPParcia, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPParcia_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPParcia_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "NIF proveedor", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPProvee_Internalname, GXutil.rtrim( A13494BCCPProvee), GXutil.rtrim( localUtil.format( A13494BCCPProvee, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPProvee_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPProvee_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Procesado", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPProces_Internalname, GXutil.ltrim( localUtil.ntoc( A13495BCCPProces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPProces_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13495BCCPProces), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13495BCCPProces), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPProces_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPProces_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Error", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPError_Internalname, GXutil.ltrim( localUtil.ntoc( A13496BCCPError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPError_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13496BCCPError), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13496BCCPError), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPError_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPError_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Descripción error", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBCCPDescEr_Internalname, A13497BCCPDescEr, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", (short)(0), 1, edtBCCPDescEr_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha y hora error", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCCPFecErr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPFecErr_Internalname, localUtil.ttoc( A13498BCCPFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A13498BCCPFecErr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPFecErr_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPFecErr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCCPFecErr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCCPFecErr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBCCOMP.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Pila error", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBCCOMP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCCPPilaEr_Internalname, GXutil.ltrim( localUtil.ntoc( A13499BCCPPilaEr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCCPPilaEr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13499BCCPPilaEr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13499BCCPPilaEr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCCPPilaEr_Jsonclick, 0, "", "", "", "", "", 1, edtBCCPPilaEr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBCCOMP.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBCCOMP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBCCOMP.htm");
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
      e111OE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13488BCCPPedido = (int)(localUtil.ctol( httpContext.cgiGet( "Z13488BCCPPedido"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13478BCProducto = httpContext.cgiGet( "Z13478BCProducto") ;
            Z13489BCCPCantid = localUtil.ctond( httpContext.cgiGet( "Z13489BCCPCantid")) ;
            Z13490BCCPPrecio = localUtil.ctond( httpContext.cgiGet( "Z13490BCCPPrecio")) ;
            Z13491BCCPFecRec = localUtil.ctod( httpContext.cgiGet( "Z13491BCCPFecRec"), 0) ;
            Z13492BCCPNalbar = httpContext.cgiGet( "Z13492BCCPNalbar") ;
            Z13493BCCPParcia = httpContext.cgiGet( "Z13493BCCPParcia") ;
            Z13494BCCPProvee = httpContext.cgiGet( "Z13494BCCPProvee") ;
            Z13495BCCPProces = (short)(localUtil.ctol( httpContext.cgiGet( "Z13495BCCPProces"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13496BCCPError = (short)(localUtil.ctol( httpContext.cgiGet( "Z13496BCCPError"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13497BCCPDescEr = httpContext.cgiGet( "Z13497BCCPDescEr") ;
            Z13498BCCPFecErr = localUtil.ctot( httpContext.cgiGet( "Z13498BCCPFecErr"), 0) ;
            Z13499BCCPPilaEr = (short)(localUtil.ctol( httpContext.cgiGet( "Z13499BCCPPilaEr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPPedido_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPPedido_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPPEDIDO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPPedido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13488BCCPPedido = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
            }
            else
            {
               A13488BCCPPedido = (int)(localUtil.ctol( httpContext.cgiGet( edtBCCPPedido_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13478BCProducto = httpContext.cgiGet( edtBCProducto_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            A13479BCDescripc = httpContext.cgiGet( edtBCDescripc_Internalname) ;
            n13479BCDescripc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCCPCantid_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCCPCantid_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPCANTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPCantid_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13489BCCPCantid = DecimalUtil.ZERO ;
               n13489BCCPCantid = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrimstr( A13489BCCPCantid, 9, 2));
            }
            else
            {
               A13489BCCPCantid = localUtil.ctond( httpContext.cgiGet( edtBCCPCantid_Internalname)) ;
               n13489BCCPCantid = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrimstr( A13489BCCPCantid, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCCPPrecio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCCPPrecio_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPPRECIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPPrecio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13490BCCPPrecio = DecimalUtil.ZERO ;
               n13490BCCPPrecio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrimstr( A13490BCCPPrecio, 13, 5));
            }
            else
            {
               A13490BCCPPrecio = localUtil.ctond( httpContext.cgiGet( edtBCCPPrecio_Internalname)) ;
               n13490BCCPPrecio = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrimstr( A13490BCCPPrecio, 13, 5));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBCCPFecRec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BCCPFECREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPFecRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13491BCCPFecRec = GXutil.nullDate() ;
               n13491BCCPFecRec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
            }
            else
            {
               A13491BCCPFecRec = localUtil.ctod( httpContext.cgiGet( edtBCCPFecRec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n13491BCCPFecRec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
            }
            A13492BCCPNalbar = httpContext.cgiGet( edtBCCPNalbar_Internalname) ;
            n13492BCCPNalbar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13492BCCPNalbar", A13492BCCPNalbar);
            A13493BCCPParcia = httpContext.cgiGet( edtBCCPParcia_Internalname) ;
            n13493BCCPParcia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13493BCCPParcia", A13493BCCPParcia);
            A13494BCCPProvee = httpContext.cgiGet( edtBCCPProvee_Internalname) ;
            n13494BCCPProvee = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13494BCCPProvee", A13494BCCPProvee);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPPROCES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPProces_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13495BCCPProces = (short)(0) ;
               n13495BCCPProces = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13495BCCPProces), 4, 0));
            }
            else
            {
               A13495BCCPProces = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCPProces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13495BCCPProces = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13495BCCPProces), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPERROR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPError_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13496BCCPError = (short)(0) ;
               n13496BCCPError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13496BCCPError), 4, 0));
            }
            else
            {
               A13496BCCPError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCPError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13496BCCPError = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13496BCCPError), 4, 0));
            }
            A13497BCCPDescEr = httpContext.cgiGet( edtBCCPDescEr_Internalname) ;
            n13497BCCPDescEr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13497BCCPDescEr", A13497BCCPDescEr);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtBCCPFecErr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BCCPFECERR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPFecErr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
               n13498BCCPFecErr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A13498BCCPFecErr = localUtil.ctot( httpContext.cgiGet( edtBCCPFecErr_Internalname)) ;
               n13498BCCPFecErr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPPilaEr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCPPilaEr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCCPPILAER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCCPPilaEr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13499BCCPPilaEr = (short)(0) ;
               n13499BCCPPilaEr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13499BCCPPilaEr), 4, 0));
            }
            else
            {
               A13499BCCPPilaEr = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCPPilaEr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13499BCCPPilaEr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13499BCCPPilaEr), 4, 0));
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
               A13488BCCPPedido = (int)(GXutil.lval( httpContext.GetPar( "BCCPPedido"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
               A13478BCProducto = httpContext.GetPar( "BCProducto") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
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
                        e111OE2 ();
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
            initAll1OE1845( ) ;
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
      disableAttributes1OE1845( ) ;
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

   public void confirm_1OE0( )
   {
      beforeValidate1OE1845( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OE1845( ) ;
         }
         else
         {
            checkExtendedTable1OE1845( ) ;
            if ( AnyError == 0 )
            {
               zm1OE1845( 3) ;
               zm1OE1845( 4) ;
            }
            closeExtendedTableCursors1OE1845( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1OE0( ) ;
      }
   }

   public void resetCaption1OE0( )
   {
   }

   public void e111OE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tbccomp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tbccomp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tbccomp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbccomp_impl.this.A396EmprCod = GXv_char2[0] ;
      tbccomp_impl.this.AV11EmprNom = GXv_char3[0] ;
      tbccomp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OE1845( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13489BCCPCantid = T01OE3_A13489BCCPCantid[0] ;
            Z13490BCCPPrecio = T01OE3_A13490BCCPPrecio[0] ;
            Z13491BCCPFecRec = T01OE3_A13491BCCPFecRec[0] ;
            Z13492BCCPNalbar = T01OE3_A13492BCCPNalbar[0] ;
            Z13493BCCPParcia = T01OE3_A13493BCCPParcia[0] ;
            Z13494BCCPProvee = T01OE3_A13494BCCPProvee[0] ;
            Z13495BCCPProces = T01OE3_A13495BCCPProces[0] ;
            Z13496BCCPError = T01OE3_A13496BCCPError[0] ;
            Z13497BCCPDescEr = T01OE3_A13497BCCPDescEr[0] ;
            Z13498BCCPFecErr = T01OE3_A13498BCCPFecErr[0] ;
            Z13499BCCPPilaEr = T01OE3_A13499BCCPPilaEr[0] ;
         }
         else
         {
            Z13489BCCPCantid = A13489BCCPCantid ;
            Z13490BCCPPrecio = A13490BCCPPrecio ;
            Z13491BCCPFecRec = A13491BCCPFecRec ;
            Z13492BCCPNalbar = A13492BCCPNalbar ;
            Z13493BCCPParcia = A13493BCCPParcia ;
            Z13494BCCPProvee = A13494BCCPProvee ;
            Z13495BCCPProces = A13495BCCPProces ;
            Z13496BCCPError = A13496BCCPError ;
            Z13497BCCPDescEr = A13497BCCPDescEr ;
            Z13498BCCPFecErr = A13498BCCPFecErr ;
            Z13499BCCPPilaEr = A13499BCCPPilaEr ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z13488BCCPPedido = A13488BCCPPedido ;
         Z13489BCCPCantid = A13489BCCPCantid ;
         Z13490BCCPPrecio = A13490BCCPPrecio ;
         Z13491BCCPFecRec = A13491BCCPFecRec ;
         Z13492BCCPNalbar = A13492BCCPNalbar ;
         Z13493BCCPParcia = A13493BCCPParcia ;
         Z13494BCCPProvee = A13494BCCPProvee ;
         Z13495BCCPProces = A13495BCCPProces ;
         Z13496BCCPError = A13496BCCPError ;
         Z13497BCCPDescEr = A13497BCCPDescEr ;
         Z13498BCCPFecErr = A13498BCCPFecErr ;
         Z13499BCCPPilaEr = A13499BCCPPilaEr ;
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TBCCOMP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01OE4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OE4_A407EmprNom[0] ;
      n407EmprNom = T01OE4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no Permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load1OE1845( )
   {
      /* Using cursor T01OE6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1845 = (short)(1) ;
         A407EmprNom = T01OE6_A407EmprNom[0] ;
         n407EmprNom = T01OE6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13489BCCPCantid = T01OE6_A13489BCCPCantid[0] ;
         n13489BCCPCantid = T01OE6_n13489BCCPCantid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrimstr( A13489BCCPCantid, 9, 2));
         A13490BCCPPrecio = T01OE6_A13490BCCPPrecio[0] ;
         n13490BCCPPrecio = T01OE6_n13490BCCPPrecio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrimstr( A13490BCCPPrecio, 13, 5));
         A13491BCCPFecRec = T01OE6_A13491BCCPFecRec[0] ;
         n13491BCCPFecRec = T01OE6_n13491BCCPFecRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
         A13492BCCPNalbar = T01OE6_A13492BCCPNalbar[0] ;
         n13492BCCPNalbar = T01OE6_n13492BCCPNalbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13492BCCPNalbar", A13492BCCPNalbar);
         A13493BCCPParcia = T01OE6_A13493BCCPParcia[0] ;
         n13493BCCPParcia = T01OE6_n13493BCCPParcia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13493BCCPParcia", A13493BCCPParcia);
         A13494BCCPProvee = T01OE6_A13494BCCPProvee[0] ;
         n13494BCCPProvee = T01OE6_n13494BCCPProvee[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13494BCCPProvee", A13494BCCPProvee);
         A13495BCCPProces = T01OE6_A13495BCCPProces[0] ;
         n13495BCCPProces = T01OE6_n13495BCCPProces[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13495BCCPProces), 4, 0));
         A13496BCCPError = T01OE6_A13496BCCPError[0] ;
         n13496BCCPError = T01OE6_n13496BCCPError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13496BCCPError), 4, 0));
         A13497BCCPDescEr = T01OE6_A13497BCCPDescEr[0] ;
         n13497BCCPDescEr = T01OE6_n13497BCCPDescEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13497BCCPDescEr", A13497BCCPDescEr);
         A13498BCCPFecErr = T01OE6_A13498BCCPFecErr[0] ;
         n13498BCCPFecErr = T01OE6_n13498BCCPFecErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13499BCCPPilaEr = T01OE6_A13499BCCPPilaEr[0] ;
         n13499BCCPPilaEr = T01OE6_n13499BCCPPilaEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13499BCCPPilaEr), 4, 0));
         zm1OE1845( -2) ;
      }
      pr_default.close(3);
      onLoadActions1OE1845( ) ;
   }

   public void onLoadActions1OE1845( )
   {
      /* Using cursor T01OE5 */
      pr_ekamat.execute(0, new Object[] {A396EmprCod, A13478BCProducto});
      A13479BCDescripc = T01OE5_A13479BCDescripc[0] ;
      n13479BCDescripc = T01OE5_n13479BCDescripc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      pr_ekamat.close(0);
   }

   public void checkExtendedTable1OE1845( )
   {
      nIsDirty_1845 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01OE5 */
      pr_ekamat.execute(0, new Object[] {A396EmprCod, A13478BCProducto});
      if ( (pr_ekamat.getStatus(0) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCPRODUCTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13479BCDescripc = T01OE5_A13479BCDescripc[0] ;
      n13479BCDescripc = T01OE5_n13479BCDescripc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      pr_ekamat.close(0);
   }

   public void closeExtendedTableCursors1OE1845( )
   {
      pr_ekamat.close(0);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A13478BCProducto )
   {
      /* Using cursor T01OE7 */
      pr_ekamat.execute(1, new Object[] {A396EmprCod, A13478BCProducto});
      if ( (pr_ekamat.getStatus(1) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCPRODUCTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13479BCDescripc = T01OE7_A13479BCDescripc[0] ;
      n13479BCDescripc = T01OE7_n13479BCDescripc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13479BCDescripc))+"\"") ;
      addString( "]") ;
      if ( (pr_ekamat.getStatus(1) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_ekamat.close(1);
   }

   public void getKey1OE1845( )
   {
      /* Using cursor T01OE8 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1845 = (short)(1) ;
      }
      else
      {
         RcdFound1845 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OE1845( 2) ;
         RcdFound1845 = (short)(1) ;
         A13488BCCPPedido = T01OE3_A13488BCCPPedido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
         A13489BCCPCantid = T01OE3_A13489BCCPCantid[0] ;
         n13489BCCPCantid = T01OE3_n13489BCCPCantid[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrimstr( A13489BCCPCantid, 9, 2));
         A13490BCCPPrecio = T01OE3_A13490BCCPPrecio[0] ;
         n13490BCCPPrecio = T01OE3_n13490BCCPPrecio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrimstr( A13490BCCPPrecio, 13, 5));
         A13491BCCPFecRec = T01OE3_A13491BCCPFecRec[0] ;
         n13491BCCPFecRec = T01OE3_n13491BCCPFecRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
         A13492BCCPNalbar = T01OE3_A13492BCCPNalbar[0] ;
         n13492BCCPNalbar = T01OE3_n13492BCCPNalbar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13492BCCPNalbar", A13492BCCPNalbar);
         A13493BCCPParcia = T01OE3_A13493BCCPParcia[0] ;
         n13493BCCPParcia = T01OE3_n13493BCCPParcia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13493BCCPParcia", A13493BCCPParcia);
         A13494BCCPProvee = T01OE3_A13494BCCPProvee[0] ;
         n13494BCCPProvee = T01OE3_n13494BCCPProvee[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13494BCCPProvee", A13494BCCPProvee);
         A13495BCCPProces = T01OE3_A13495BCCPProces[0] ;
         n13495BCCPProces = T01OE3_n13495BCCPProces[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13495BCCPProces), 4, 0));
         A13496BCCPError = T01OE3_A13496BCCPError[0] ;
         n13496BCCPError = T01OE3_n13496BCCPError[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13496BCCPError), 4, 0));
         A13497BCCPDescEr = T01OE3_A13497BCCPDescEr[0] ;
         n13497BCCPDescEr = T01OE3_n13497BCCPDescEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13497BCCPDescEr", A13497BCCPDescEr);
         A13498BCCPFecErr = T01OE3_A13498BCCPFecErr[0] ;
         n13498BCCPFecErr = T01OE3_n13498BCCPFecErr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13499BCCPPilaEr = T01OE3_A13499BCCPPilaEr[0] ;
         n13499BCCPPilaEr = T01OE3_n13499BCCPPilaEr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13499BCCPPilaEr), 4, 0));
         A13478BCProducto = T01OE3_A13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
         Z396EmprCod = A396EmprCod ;
         Z13488BCCPPedido = A13488BCCPPedido ;
         Z13478BCProducto = A13478BCProducto ;
         sMode1845 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OE1845( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1845 = (short)(0) ;
            initializeNonKey1OE1845( ) ;
         }
         Gx_mode = sMode1845 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1845 = (short)(0) ;
         initializeNonKey1OE1845( ) ;
         sMode1845 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1845 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1OE1845( ) ;
      if ( RcdFound1845 == 0 )
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
      RcdFound1845 = (short)(0) ;
      /* Using cursor T01OE9 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A13488BCCPPedido), Integer.valueOf(A13488BCCPPedido), A13478BCProducto, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01OE9_A13488BCCPPedido[0] < A13488BCCPPedido ) || ( T01OE9_A13488BCCPPedido[0] == A13488BCCPPedido ) && ( GXutil.strcmp(T01OE9_A13478BCProducto[0], A13478BCProducto) < 0 ) ) && ( GXutil.strcmp(T01OE9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01OE9_A13488BCCPPedido[0] > A13488BCCPPedido ) || ( T01OE9_A13488BCCPPedido[0] == A13488BCCPPedido ) && ( GXutil.strcmp(T01OE9_A13478BCProducto[0], A13478BCProducto) > 0 ) ) && ( GXutil.strcmp(T01OE9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13488BCCPPedido = T01OE9_A13488BCCPPedido[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
            A13478BCProducto = T01OE9_A13478BCProducto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            RcdFound1845 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1845 = (short)(0) ;
      /* Using cursor T01OE10 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A13488BCCPPedido), Integer.valueOf(A13488BCCPPedido), A13478BCProducto, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01OE10_A13488BCCPPedido[0] > A13488BCCPPedido ) || ( T01OE10_A13488BCCPPedido[0] == A13488BCCPPedido ) && ( GXutil.strcmp(T01OE10_A13478BCProducto[0], A13478BCProducto) > 0 ) ) && ( GXutil.strcmp(T01OE10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01OE10_A13488BCCPPedido[0] < A13488BCCPPedido ) || ( T01OE10_A13488BCCPPedido[0] == A13488BCCPPedido ) && ( GXutil.strcmp(T01OE10_A13478BCProducto[0], A13478BCProducto) < 0 ) ) && ( GXutil.strcmp(T01OE10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13488BCCPPedido = T01OE10_A13488BCCPPedido[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
            A13478BCProducto = T01OE10_A13478BCProducto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
            RcdFound1845 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OE1845( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBCCPPedido_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OE1845( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1845 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13488BCCPPedido != Z13488BCCPPedido ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
            {
               A13488BCCPPedido = Z13488BCCPPedido ;
               httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
               A13478BCProducto = Z13478BCProducto ;
               httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBCCPPedido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OE1845( ) ;
               GX_FocusControl = edtBCCPPedido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13488BCCPPedido != Z13488BCCPPedido ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBCCPPedido_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OE1845( ) ;
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
                  GX_FocusControl = edtBCCPPedido_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OE1845( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13488BCCPPedido != Z13488BCCPPedido ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
      {
         A13488BCCPPedido = Z13488BCCPPedido ;
         httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
         A13478BCProducto = Z13478BCProducto ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBCCPPedido_Internalname ;
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
      getKey1OE1845( ) ;
      if ( RcdFound1845 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13488BCCPPedido != Z13488BCCPPedido ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
         {
            A13488BCCPPedido = Z13488BCCPPedido ;
            httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
            A13478BCProducto = Z13478BCProducto ;
            httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13488BCCPPedido != Z13488BCCPPedido ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbccomp");
      GX_FocusControl = edtBCCPCantid_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1OE0( ) ;
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
      if ( RcdFound1845 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBCCPCantid_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OE1845( ) ;
      if ( RcdFound1845 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCPCantid_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OE1845( ) ;
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
      if ( RcdFound1845 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCPCantid_Internalname ;
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
      if ( RcdFound1845 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCPCantid_Internalname ;
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
      scanStart1OE1845( ) ;
      if ( RcdFound1845 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1845 != 0 )
         {
            scanNext1OE1845( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBCCPCantid_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OE1845( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OE1845( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBCCOMP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13489BCCPCantid, T01OE2_A13489BCCPCantid[0]) != 0 ) || ( DecimalUtil.compareTo(Z13490BCCPPrecio, T01OE2_A13490BCCPPrecio[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13491BCCPFecRec), GXutil.resetTime(T01OE2_A13491BCCPFecRec[0])) ) || ( GXutil.strcmp(Z13492BCCPNalbar, T01OE2_A13492BCCPNalbar[0]) != 0 ) || ( GXutil.strcmp(Z13493BCCPParcia, T01OE2_A13493BCCPParcia[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13494BCCPProvee, T01OE2_A13494BCCPProvee[0]) != 0 ) || ( Z13495BCCPProces != T01OE2_A13495BCCPProces[0] ) || ( Z13496BCCPError != T01OE2_A13496BCCPError[0] ) || ( GXutil.strcmp(Z13497BCCPDescEr, T01OE2_A13497BCCPDescEr[0]) != 0 ) || !( GXutil.dateCompare(Z13498BCCPFecErr, T01OE2_A13498BCCPFecErr[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13499BCCPPilaEr != T01OE2_A13499BCCPPilaEr[0] ) )
         {
            if ( DecimalUtil.compareTo(Z13489BCCPCantid, T01OE2_A13489BCCPCantid[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPCantid");
               GXutil.writeLogRaw("Old: ",Z13489BCCPCantid);
               GXutil.writeLogRaw("Current: ",T01OE2_A13489BCCPCantid[0]);
            }
            if ( DecimalUtil.compareTo(Z13490BCCPPrecio, T01OE2_A13490BCCPPrecio[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPPrecio");
               GXutil.writeLogRaw("Old: ",Z13490BCCPPrecio);
               GXutil.writeLogRaw("Current: ",T01OE2_A13490BCCPPrecio[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13491BCCPFecRec), GXutil.resetTime(T01OE2_A13491BCCPFecRec[0])) ) )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPFecRec");
               GXutil.writeLogRaw("Old: ",Z13491BCCPFecRec);
               GXutil.writeLogRaw("Current: ",T01OE2_A13491BCCPFecRec[0]);
            }
            if ( GXutil.strcmp(Z13492BCCPNalbar, T01OE2_A13492BCCPNalbar[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPNalbar");
               GXutil.writeLogRaw("Old: ",Z13492BCCPNalbar);
               GXutil.writeLogRaw("Current: ",T01OE2_A13492BCCPNalbar[0]);
            }
            if ( GXutil.strcmp(Z13493BCCPParcia, T01OE2_A13493BCCPParcia[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPParcia");
               GXutil.writeLogRaw("Old: ",Z13493BCCPParcia);
               GXutil.writeLogRaw("Current: ",T01OE2_A13493BCCPParcia[0]);
            }
            if ( GXutil.strcmp(Z13494BCCPProvee, T01OE2_A13494BCCPProvee[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPProvee");
               GXutil.writeLogRaw("Old: ",Z13494BCCPProvee);
               GXutil.writeLogRaw("Current: ",T01OE2_A13494BCCPProvee[0]);
            }
            if ( Z13495BCCPProces != T01OE2_A13495BCCPProces[0] )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPProces");
               GXutil.writeLogRaw("Old: ",Z13495BCCPProces);
               GXutil.writeLogRaw("Current: ",T01OE2_A13495BCCPProces[0]);
            }
            if ( Z13496BCCPError != T01OE2_A13496BCCPError[0] )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPError");
               GXutil.writeLogRaw("Old: ",Z13496BCCPError);
               GXutil.writeLogRaw("Current: ",T01OE2_A13496BCCPError[0]);
            }
            if ( GXutil.strcmp(Z13497BCCPDescEr, T01OE2_A13497BCCPDescEr[0]) != 0 )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPDescEr");
               GXutil.writeLogRaw("Old: ",Z13497BCCPDescEr);
               GXutil.writeLogRaw("Current: ",T01OE2_A13497BCCPDescEr[0]);
            }
            if ( !( GXutil.dateCompare(Z13498BCCPFecErr, T01OE2_A13498BCCPFecErr[0]) ) )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPFecErr");
               GXutil.writeLogRaw("Old: ",Z13498BCCPFecErr);
               GXutil.writeLogRaw("Current: ",T01OE2_A13498BCCPFecErr[0]);
            }
            if ( Z13499BCCPPilaEr != T01OE2_A13499BCCPPilaEr[0] )
            {
               GXutil.writeLogln("tbccomp:[seudo value changed for attri]"+"BCCPPilaEr");
               GXutil.writeLogRaw("Old: ",Z13499BCCPPilaEr);
               GXutil.writeLogRaw("Current: ",T01OE2_A13499BCCPPilaEr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBCCOMP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OE1845( )
   {
      beforeValidate1OE1845( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OE1845( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OE1845( 0) ;
         checkOptimisticConcurrency1OE1845( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OE1845( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OE1845( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OE11 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A13488BCCPPedido), Boolean.valueOf(n13489BCCPCantid), A13489BCCPCantid, Boolean.valueOf(n13490BCCPPrecio), A13490BCCPPrecio, Boolean.valueOf(n13491BCCPFecRec), A13491BCCPFecRec, Boolean.valueOf(n13492BCCPNalbar), A13492BCCPNalbar, Boolean.valueOf(n13493BCCPParcia), A13493BCCPParcia, Boolean.valueOf(n13494BCCPProvee), A13494BCCPProvee, Boolean.valueOf(n13495BCCPProces), Short.valueOf(A13495BCCPProces), Boolean.valueOf(n13496BCCPError), Short.valueOf(A13496BCCPError), Boolean.valueOf(n13497BCCPDescEr), A13497BCCPDescEr, Boolean.valueOf(n13498BCCPFecErr), A13498BCCPFecErr, Boolean.valueOf(n13499BCCPPilaEr), Short.valueOf(A13499BCCPPilaEr), A396EmprCod, A13478BCProducto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBCCOMP");
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
                        resetCaption1OE0( ) ;
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
            load1OE1845( ) ;
         }
         endLevel1OE1845( ) ;
      }
      closeExtendedTableCursors1OE1845( ) ;
   }

   public void update1OE1845( )
   {
      beforeValidate1OE1845( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OE1845( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OE1845( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OE1845( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OE1845( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OE12 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n13489BCCPCantid), A13489BCCPCantid, Boolean.valueOf(n13490BCCPPrecio), A13490BCCPPrecio, Boolean.valueOf(n13491BCCPFecRec), A13491BCCPFecRec, Boolean.valueOf(n13492BCCPNalbar), A13492BCCPNalbar, Boolean.valueOf(n13493BCCPParcia), A13493BCCPParcia, Boolean.valueOf(n13494BCCPProvee), A13494BCCPProvee, Boolean.valueOf(n13495BCCPProces), Short.valueOf(A13495BCCPProces), Boolean.valueOf(n13496BCCPError), Short.valueOf(A13496BCCPError), Boolean.valueOf(n13497BCCPDescEr), A13497BCCPDescEr, Boolean.valueOf(n13498BCCPFecErr), A13498BCCPFecErr, Boolean.valueOf(n13499BCCPPilaEr), Short.valueOf(A13499BCCPPilaEr), A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBCCOMP");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBCCOMP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OE1845( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1OE0( ) ;
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
         endLevel1OE1845( ) ;
      }
      closeExtendedTableCursors1OE1845( ) ;
   }

   public void deferredUpdate1OE1845( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OE1845( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OE1845( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OE1845( ) ;
         afterConfirm1OE1845( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OE1845( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OE13 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13488BCCPPedido), A13478BCProducto});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBCCOMP");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1845 == 0 )
                     {
                        initAll1OE1845( ) ;
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
                     resetCaption1OE0( ) ;
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
      sMode1845 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OE1845( ) ;
      Gx_mode = sMode1845 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OE1845( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OE14 */
         pr_ekamat.execute(2, new Object[] {A396EmprCod, A13478BCProducto});
         A13479BCDescripc = T01OE14_A13479BCDescripc[0] ;
         n13479BCDescripc = T01OE14_n13479BCDescripc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
         pr_ekamat.close(2);
      }
   }

   public void endLevel1OE1845( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OE1845( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbccomp");
         if ( AnyError == 0 )
         {
            confirmValues1OE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbccomp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OE1845( )
   {
      /* Scan By routine */
      /* Using cursor T01OE15 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1845 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1845 = (short)(1) ;
         A13488BCCPPedido = T01OE15_A13488BCCPPedido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
         A13478BCProducto = T01OE15_A13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OE1845( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1845 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1845 = (short)(1) ;
         A13488BCCPPedido = T01OE15_A13488BCCPPedido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
         A13478BCProducto = T01OE15_A13478BCProducto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      }
   }

   public void scanEnd1OE1845( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1OE1845( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OE1845( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OE1845( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OE1845( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OE1845( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OE1845( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OE1845( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBCCPPedido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPPedido_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPPedido_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBCProducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), true);
      edtBCDescripc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCDescripc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCDescripc_Enabled), 5, 0), true);
      edtBCCPCantid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPCantid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPCantid_Enabled), 5, 0), true);
      edtBCCPPrecio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPPrecio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPPrecio_Enabled), 5, 0), true);
      edtBCCPFecRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPFecRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPFecRec_Enabled), 5, 0), true);
      edtBCCPNalbar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPNalbar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPNalbar_Enabled), 5, 0), true);
      edtBCCPParcia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPParcia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPParcia_Enabled), 5, 0), true);
      edtBCCPProvee_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPProvee_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPProvee_Enabled), 5, 0), true);
      edtBCCPProces_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPProces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPProces_Enabled), 5, 0), true);
      edtBCCPError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPError_Enabled), 5, 0), true);
      edtBCCPDescEr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPDescEr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPDescEr_Enabled), 5, 0), true);
      edtBCCPFecErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPFecErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPFecErr_Enabled), 5, 0), true);
      edtBCCPPilaEr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPPilaEr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPPilaEr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1OE1845( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1OE0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbccomp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13488BCCPPedido", GXutil.ltrim( localUtil.ntoc( Z13488BCCPPedido, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13478BCProducto", GXutil.rtrim( Z13478BCProducto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13489BCCPCantid", GXutil.ltrim( localUtil.ntoc( Z13489BCCPCantid, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13490BCCPPrecio", GXutil.ltrim( localUtil.ntoc( Z13490BCCPPrecio, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13491BCCPFecRec", localUtil.dtoc( Z13491BCCPFecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13492BCCPNalbar", GXutil.rtrim( Z13492BCCPNalbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13493BCCPParcia", GXutil.rtrim( Z13493BCCPParcia));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13494BCCPProvee", GXutil.rtrim( Z13494BCCPProvee));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13495BCCPProces", GXutil.ltrim( localUtil.ntoc( Z13495BCCPProces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13496BCCPError", GXutil.ltrim( localUtil.ntoc( Z13496BCCPError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13497BCCPDescEr", Z13497BCCPDescEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13498BCCPFecErr", localUtil.ttoc( Z13498BCCPFecErr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13499BCCPPilaEr", GXutil.ltrim( localUtil.ntoc( Z13499BCCPPilaEr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tbccomp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBCCOMP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Compras Recepcion envio", "") ;
   }

   public void initializeNonKey1OE1845( )
   {
      A13479BCDescripc = "" ;
      n13479BCDescripc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      A13489BCCPCantid = DecimalUtil.ZERO ;
      n13489BCCPCantid = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrimstr( A13489BCCPCantid, 9, 2));
      A13490BCCPPrecio = DecimalUtil.ZERO ;
      n13490BCCPPrecio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrimstr( A13490BCCPPrecio, 13, 5));
      A13491BCCPFecRec = GXutil.nullDate() ;
      n13491BCCPFecRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
      A13492BCCPNalbar = "" ;
      n13492BCCPNalbar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13492BCCPNalbar", A13492BCCPNalbar);
      A13493BCCPParcia = "" ;
      n13493BCCPParcia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13493BCCPParcia", A13493BCCPParcia);
      A13494BCCPProvee = "" ;
      n13494BCCPProvee = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13494BCCPProvee", A13494BCCPProvee);
      A13495BCCPProces = (short)(0) ;
      n13495BCCPProces = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13495BCCPProces), 4, 0));
      A13496BCCPError = (short)(0) ;
      n13496BCCPError = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13496BCCPError), 4, 0));
      A13497BCCPDescEr = "" ;
      n13497BCCPDescEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13497BCCPDescEr", A13497BCCPDescEr);
      A13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      n13498BCCPFecErr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13499BCCPPilaEr = (short)(0) ;
      n13499BCCPPilaEr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13499BCCPPilaEr), 4, 0));
      Z13489BCCPCantid = DecimalUtil.ZERO ;
      Z13490BCCPPrecio = DecimalUtil.ZERO ;
      Z13491BCCPFecRec = GXutil.nullDate() ;
      Z13492BCCPNalbar = "" ;
      Z13493BCCPParcia = "" ;
      Z13494BCCPProvee = "" ;
      Z13495BCCPProces = (short)(0) ;
      Z13496BCCPError = (short)(0) ;
      Z13497BCCPDescEr = "" ;
      Z13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      Z13499BCCPPilaEr = (short)(0) ;
   }

   public void initAll1OE1845( )
   {
      A13488BCCPPedido = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13488BCCPPedido", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13488BCCPPedido), 8, 0));
      A13478BCProducto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13478BCProducto", A13478BCProducto);
      initializeNonKey1OE1845( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104321", true, true);
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
      httpContext.AddJavascriptSource("tbccomp.js", "?202682415104322", false, true);
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
      edtBCCPPedido_Internalname = "BCCPPEDIDO" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBCProducto_Internalname = "BCPRODUCTO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBCDescripc_Internalname = "BCDESCRIPC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBCCPCantid_Internalname = "BCCPCANTID" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBCCPPrecio_Internalname = "BCCPPRECIO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBCCPFecRec_Internalname = "BCCPFECREC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBCCPNalbar_Internalname = "BCCPNALBAR" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBCCPParcia_Internalname = "BCCPPARCIA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBCCPProvee_Internalname = "BCCPPROVEE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBCCPProces_Internalname = "BCCPPROCES" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBCCPError_Internalname = "BCCPERROR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBCCPDescEr_Internalname = "BCCPDESCER" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBCCPFecErr_Internalname = "BCCPFECERR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBCCPPilaEr_Internalname = "BCCPPILAER" ;
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
      Form.setCaption( httpContext.getMessage( "Compras Recepcion envio", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBCCPPilaEr_Jsonclick = "" ;
      edtBCCPPilaEr_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPPilaEr_Enabled = 1 ;
      edtBCCPFecErr_Jsonclick = "" ;
      edtBCCPFecErr_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPFecErr_Enabled = 1 ;
      edtBCCPDescEr_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPDescEr_Enabled = 1 ;
      edtBCCPError_Jsonclick = "" ;
      edtBCCPError_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPError_Enabled = 1 ;
      edtBCCPProces_Jsonclick = "" ;
      edtBCCPProces_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPProces_Enabled = 1 ;
      edtBCCPProvee_Jsonclick = "" ;
      edtBCCPProvee_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPProvee_Enabled = 1 ;
      edtBCCPParcia_Jsonclick = "" ;
      edtBCCPParcia_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPParcia_Enabled = 1 ;
      edtBCCPNalbar_Jsonclick = "" ;
      edtBCCPNalbar_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPNalbar_Enabled = 1 ;
      edtBCCPFecRec_Jsonclick = "" ;
      edtBCCPFecRec_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPFecRec_Enabled = 1 ;
      edtBCCPPrecio_Jsonclick = "" ;
      edtBCCPPrecio_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPPrecio_Enabled = 1 ;
      edtBCCPCantid_Jsonclick = "" ;
      edtBCCPCantid_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPCantid_Enabled = 1 ;
      edtBCDescripc_Jsonclick = "" ;
      edtBCDescripc_Backcolor = (int)(0xFFFFFF) ;
      edtBCDescripc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBCProducto_Jsonclick = "" ;
      edtBCProducto_Backcolor = (int)(0xFFFFFF) ;
      edtBCProducto_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBCCPPedido_Jsonclick = "" ;
      edtBCCPPedido_Backcolor = (int)(0xFFFFFF) ;
      edtBCCPPedido_Enabled = 1 ;
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
      /* Using cursor T01OE16 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OE16_A407EmprNom[0] ;
      n407EmprNom = T01OE16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      /* Using cursor T01OE14 */
      pr_ekamat.execute(2, new Object[] {A396EmprCod, A13478BCProducto});
      if ( (pr_ekamat.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCPRODUCTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13479BCDescripc = T01OE14_A13479BCDescripc[0] ;
      n13479BCDescripc = T01OE14_n13479BCDescripc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", A13479BCDescripc);
      pr_ekamat.close(2);
      GX_FocusControl = edtBCCPCantid_Internalname ;
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

   public void valid_Bcproducto( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01OE14 */
      pr_ekamat.execute(2, new Object[] {A396EmprCod, A13478BCProducto});
      if ( (pr_ekamat.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCPRODUCTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
      }
      A13479BCDescripc = T01OE14_A13479BCDescripc[0] ;
      n13479BCDescripc = T01OE14_n13479BCDescripc[0] ;
      pr_ekamat.close(2);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13489BCCPCantid", GXutil.ltrim( localUtil.ntoc( A13489BCCPCantid, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13490BCCPPrecio", GXutil.ltrim( localUtil.ntoc( A13490BCCPPrecio, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13491BCCPFecRec", localUtil.format(A13491BCCPFecRec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13492BCCPNalbar", GXutil.rtrim( A13492BCCPNalbar));
      httpContext.ajax_rsp_assign_attri("", false, "A13493BCCPParcia", GXutil.rtrim( A13493BCCPParcia));
      httpContext.ajax_rsp_assign_attri("", false, "A13494BCCPProvee", GXutil.rtrim( A13494BCCPProvee));
      httpContext.ajax_rsp_assign_attri("", false, "A13495BCCPProces", GXutil.ltrim( localUtil.ntoc( A13495BCCPProces, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13496BCCPError", GXutil.ltrim( localUtil.ntoc( A13496BCCPError, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13497BCCPDescEr", A13497BCCPDescEr);
      httpContext.ajax_rsp_assign_attri("", false, "A13498BCCPFecErr", localUtil.ttoc( A13498BCCPFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13499BCCPPilaEr", GXutil.ltrim( localUtil.ntoc( A13499BCCPPilaEr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13479BCDescripc", GXutil.rtrim( A13479BCDescripc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13488BCCPPedido", GXutil.ltrim( localUtil.ntoc( Z13488BCCPPedido, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13478BCProducto", GXutil.rtrim( Z13478BCProducto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13489BCCPCantid", GXutil.ltrim( localUtil.ntoc( Z13489BCCPCantid, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13490BCCPPrecio", GXutil.ltrim( localUtil.ntoc( Z13490BCCPPrecio, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13491BCCPFecRec", localUtil.format(Z13491BCCPFecRec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13492BCCPNalbar", GXutil.rtrim( Z13492BCCPNalbar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13493BCCPParcia", GXutil.rtrim( Z13493BCCPParcia));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13494BCCPProvee", GXutil.rtrim( Z13494BCCPProvee));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13495BCCPProces", GXutil.ltrim( localUtil.ntoc( Z13495BCCPProces, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13496BCCPError", GXutil.ltrim( localUtil.ntoc( Z13496BCCPError, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13497BCCPDescEr", Z13497BCCPDescEr);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13498BCCPFecErr", localUtil.ttoc( Z13498BCCPFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13499BCCPPilaEr", GXutil.ltrim( localUtil.ntoc( Z13499BCCPPilaEr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13479BCDescripc", GXutil.rtrim( Z13479BCDescripc));
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
      setEventMetadata("VALID_BCCPPEDIDO","{handler:'valid_Bccppedido',iparms:[]");
      setEventMetadata("VALID_BCCPPEDIDO",",oparms:[]}");
      setEventMetadata("VALID_BCPRODUCTO","{handler:'valid_Bcproducto',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13488BCCPPedido',fld:'BCCPPEDIDO',pic:'ZZZZZZZ9'},{av:'A13478BCProducto',fld:'BCPRODUCTO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BCPRODUCTO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13489BCCPCantid',fld:'BCCPCANTID',pic:'ZZZZZ9.99'},{av:'A13490BCCPPrecio',fld:'BCCPPRECIO',pic:'ZZZZZZ9.99999'},{av:'A13491BCCPFecRec',fld:'BCCPFECREC',pic:''},{av:'A13492BCCPNalbar',fld:'BCCPNALBAR',pic:''},{av:'A13493BCCPParcia',fld:'BCCPPARCIA',pic:''},{av:'A13494BCCPProvee',fld:'BCCPPROVEE',pic:''},{av:'A13495BCCPProces',fld:'BCCPPROCES',pic:'ZZZ9'},{av:'A13496BCCPError',fld:'BCCPERROR',pic:'ZZZ9'},{av:'A13497BCCPDescEr',fld:'BCCPDESCER',pic:''},{av:'A13498BCCPFecErr',fld:'BCCPFECERR',pic:'99/99/99 99:99'},{av:'A13499BCCPPilaEr',fld:'BCCPPILAER',pic:'ZZZ9'},{av:'A13479BCDescripc',fld:'BCDESCRIPC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13488BCCPPedido'},{av:'Z13478BCProducto'},{av:'Z407EmprNom'},{av:'Z13489BCCPCantid'},{av:'Z13490BCCPPrecio'},{av:'Z13491BCCPFecRec'},{av:'Z13492BCCPNalbar'},{av:'Z13493BCCPParcia'},{av:'Z13494BCCPProvee'},{av:'Z13495BCCPProces'},{av:'Z13496BCCPError'},{av:'Z13497BCCPDescEr'},{av:'Z13498BCCPFecErr'},{av:'Z13499BCCPPilaEr'},{av:'Z13479BCDescripc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_ekamat.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13478BCProducto = "" ;
      Z13489BCCPCantid = DecimalUtil.ZERO ;
      Z13490BCCPPrecio = DecimalUtil.ZERO ;
      Z13491BCCPFecRec = GXutil.nullDate() ;
      Z13492BCCPNalbar = "" ;
      Z13493BCCPParcia = "" ;
      Z13494BCCPProvee = "" ;
      Z13497BCCPDescEr = "" ;
      Z13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13478BCProducto = "" ;
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
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A13479BCDescripc = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13489BCCPCantid = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A13490BCCPPrecio = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A13491BCCPFecRec = GXutil.nullDate() ;
      lblTextblock9_Jsonclick = "" ;
      A13492BCCPNalbar = "" ;
      lblTextblock10_Jsonclick = "" ;
      A13493BCCPParcia = "" ;
      lblTextblock11_Jsonclick = "" ;
      A13494BCCPProvee = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A13497BCCPDescEr = "" ;
      lblTextblock15_Jsonclick = "" ;
      A13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock16_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
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
      T01OE4_A407EmprNom = new String[] {""} ;
      T01OE4_n407EmprNom = new boolean[] {false} ;
      T01OE6_A13488BCCPPedido = new int[1] ;
      T01OE6_A407EmprNom = new String[] {""} ;
      T01OE6_n407EmprNom = new boolean[] {false} ;
      T01OE6_A13489BCCPCantid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE6_n13489BCCPCantid = new boolean[] {false} ;
      T01OE6_A13490BCCPPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE6_n13490BCCPPrecio = new boolean[] {false} ;
      T01OE6_A13491BCCPFecRec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE6_n13491BCCPFecRec = new boolean[] {false} ;
      T01OE6_A13492BCCPNalbar = new String[] {""} ;
      T01OE6_n13492BCCPNalbar = new boolean[] {false} ;
      T01OE6_A13493BCCPParcia = new String[] {""} ;
      T01OE6_n13493BCCPParcia = new boolean[] {false} ;
      T01OE6_A13494BCCPProvee = new String[] {""} ;
      T01OE6_n13494BCCPProvee = new boolean[] {false} ;
      T01OE6_A13495BCCPProces = new short[1] ;
      T01OE6_n13495BCCPProces = new boolean[] {false} ;
      T01OE6_A13496BCCPError = new short[1] ;
      T01OE6_n13496BCCPError = new boolean[] {false} ;
      T01OE6_A13497BCCPDescEr = new String[] {""} ;
      T01OE6_n13497BCCPDescEr = new boolean[] {false} ;
      T01OE6_A13498BCCPFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE6_n13498BCCPFecErr = new boolean[] {false} ;
      T01OE6_A13499BCCPPilaEr = new short[1] ;
      T01OE6_n13499BCCPPilaEr = new boolean[] {false} ;
      T01OE6_A396EmprCod = new String[] {""} ;
      T01OE6_A13478BCProducto = new String[] {""} ;
      T01OE5_A13479BCDescripc = new String[] {""} ;
      T01OE5_n13479BCDescripc = new boolean[] {false} ;
      T01OE7_A13479BCDescripc = new String[] {""} ;
      T01OE7_n13479BCDescripc = new boolean[] {false} ;
      T01OE8_A396EmprCod = new String[] {""} ;
      T01OE8_A13488BCCPPedido = new int[1] ;
      T01OE8_A13478BCProducto = new String[] {""} ;
      T01OE3_A13488BCCPPedido = new int[1] ;
      T01OE3_A13489BCCPCantid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE3_n13489BCCPCantid = new boolean[] {false} ;
      T01OE3_A13490BCCPPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE3_n13490BCCPPrecio = new boolean[] {false} ;
      T01OE3_A13491BCCPFecRec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE3_n13491BCCPFecRec = new boolean[] {false} ;
      T01OE3_A13492BCCPNalbar = new String[] {""} ;
      T01OE3_n13492BCCPNalbar = new boolean[] {false} ;
      T01OE3_A13493BCCPParcia = new String[] {""} ;
      T01OE3_n13493BCCPParcia = new boolean[] {false} ;
      T01OE3_A13494BCCPProvee = new String[] {""} ;
      T01OE3_n13494BCCPProvee = new boolean[] {false} ;
      T01OE3_A13495BCCPProces = new short[1] ;
      T01OE3_n13495BCCPProces = new boolean[] {false} ;
      T01OE3_A13496BCCPError = new short[1] ;
      T01OE3_n13496BCCPError = new boolean[] {false} ;
      T01OE3_A13497BCCPDescEr = new String[] {""} ;
      T01OE3_n13497BCCPDescEr = new boolean[] {false} ;
      T01OE3_A13498BCCPFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE3_n13498BCCPFecErr = new boolean[] {false} ;
      T01OE3_A13499BCCPPilaEr = new short[1] ;
      T01OE3_n13499BCCPPilaEr = new boolean[] {false} ;
      T01OE3_A396EmprCod = new String[] {""} ;
      T01OE3_A13478BCProducto = new String[] {""} ;
      sMode1845 = "" ;
      T01OE9_A396EmprCod = new String[] {""} ;
      T01OE9_A13488BCCPPedido = new int[1] ;
      T01OE9_A13478BCProducto = new String[] {""} ;
      T01OE10_A396EmprCod = new String[] {""} ;
      T01OE10_A13488BCCPPedido = new int[1] ;
      T01OE10_A13478BCProducto = new String[] {""} ;
      T01OE2_A13488BCCPPedido = new int[1] ;
      T01OE2_A13489BCCPCantid = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE2_n13489BCCPCantid = new boolean[] {false} ;
      T01OE2_A13490BCCPPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OE2_n13490BCCPPrecio = new boolean[] {false} ;
      T01OE2_A13491BCCPFecRec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE2_n13491BCCPFecRec = new boolean[] {false} ;
      T01OE2_A13492BCCPNalbar = new String[] {""} ;
      T01OE2_n13492BCCPNalbar = new boolean[] {false} ;
      T01OE2_A13493BCCPParcia = new String[] {""} ;
      T01OE2_n13493BCCPParcia = new boolean[] {false} ;
      T01OE2_A13494BCCPProvee = new String[] {""} ;
      T01OE2_n13494BCCPProvee = new boolean[] {false} ;
      T01OE2_A13495BCCPProces = new short[1] ;
      T01OE2_n13495BCCPProces = new boolean[] {false} ;
      T01OE2_A13496BCCPError = new short[1] ;
      T01OE2_n13496BCCPError = new boolean[] {false} ;
      T01OE2_A13497BCCPDescEr = new String[] {""} ;
      T01OE2_n13497BCCPDescEr = new boolean[] {false} ;
      T01OE2_A13498BCCPFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OE2_n13498BCCPFecErr = new boolean[] {false} ;
      T01OE2_A13499BCCPPilaEr = new short[1] ;
      T01OE2_n13499BCCPPilaEr = new boolean[] {false} ;
      T01OE2_A396EmprCod = new String[] {""} ;
      T01OE2_A13478BCProducto = new String[] {""} ;
      T01OE14_A13479BCDescripc = new String[] {""} ;
      T01OE14_n13479BCDescripc = new boolean[] {false} ;
      T01OE15_A396EmprCod = new String[] {""} ;
      T01OE15_A13488BCCPPedido = new int[1] ;
      T01OE15_A13478BCProducto = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01OE16_A407EmprNom = new String[] {""} ;
      T01OE16_n407EmprNom = new boolean[] {false} ;
      Z13479BCDescripc = "" ;
      ZZ396EmprCod = "" ;
      ZZ13478BCProducto = "" ;
      ZZ407EmprNom = "" ;
      ZZ13489BCCPCantid = DecimalUtil.ZERO ;
      ZZ13490BCCPPrecio = DecimalUtil.ZERO ;
      ZZ13491BCCPFecRec = GXutil.nullDate() ;
      ZZ13492BCCPNalbar = "" ;
      ZZ13493BCCPParcia = "" ;
      ZZ13494BCCPProvee = "" ;
      ZZ13497BCCPDescEr = "" ;
      ZZ13498BCCPFecErr = GXutil.resetTime( GXutil.nullDate() );
      ZZ13479BCDescripc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbccomp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbccomp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbccomp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbccomp__ekamat(),
         new Object[] {
             new Object[] {
            T01OE5_A13479BCDescripc, T01OE5_n13479BCDescripc
            }
            , new Object[] {
            T01OE7_A13479BCDescripc, T01OE7_n13479BCDescripc
            }
            , new Object[] {
            T01OE14_A13479BCDescripc, T01OE14_n13479BCDescripc
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbccomp__default(),
         new Object[] {
             new Object[] {
            T01OE2_A13488BCCPPedido, T01OE2_A13489BCCPCantid, T01OE2_n13489BCCPCantid, T01OE2_A13490BCCPPrecio, T01OE2_n13490BCCPPrecio, T01OE2_A13491BCCPFecRec, T01OE2_n13491BCCPFecRec, T01OE2_A13492BCCPNalbar, T01OE2_n13492BCCPNalbar, T01OE2_A13493BCCPParcia,
            T01OE2_n13493BCCPParcia, T01OE2_A13494BCCPProvee, T01OE2_n13494BCCPProvee, T01OE2_A13495BCCPProces, T01OE2_n13495BCCPProces, T01OE2_A13496BCCPError, T01OE2_n13496BCCPError, T01OE2_A13497BCCPDescEr, T01OE2_n13497BCCPDescEr, T01OE2_A13498BCCPFecErr,
            T01OE2_n13498BCCPFecErr, T01OE2_A13499BCCPPilaEr, T01OE2_n13499BCCPPilaEr, T01OE2_A396EmprCod, T01OE2_A13478BCProducto
            }
            , new Object[] {
            T01OE3_A13488BCCPPedido, T01OE3_A13489BCCPCantid, T01OE3_n13489BCCPCantid, T01OE3_A13490BCCPPrecio, T01OE3_n13490BCCPPrecio, T01OE3_A13491BCCPFecRec, T01OE3_n13491BCCPFecRec, T01OE3_A13492BCCPNalbar, T01OE3_n13492BCCPNalbar, T01OE3_A13493BCCPParcia,
            T01OE3_n13493BCCPParcia, T01OE3_A13494BCCPProvee, T01OE3_n13494BCCPProvee, T01OE3_A13495BCCPProces, T01OE3_n13495BCCPProces, T01OE3_A13496BCCPError, T01OE3_n13496BCCPError, T01OE3_A13497BCCPDescEr, T01OE3_n13497BCCPDescEr, T01OE3_A13498BCCPFecErr,
            T01OE3_n13498BCCPFecErr, T01OE3_A13499BCCPPilaEr, T01OE3_n13499BCCPPilaEr, T01OE3_A396EmprCod, T01OE3_A13478BCProducto
            }
            , new Object[] {
            T01OE4_A407EmprNom, T01OE4_n407EmprNom
            }
            , new Object[] {
            T01OE6_A13488BCCPPedido, T01OE6_A407EmprNom, T01OE6_n407EmprNom, T01OE6_A13489BCCPCantid, T01OE6_n13489BCCPCantid, T01OE6_A13490BCCPPrecio, T01OE6_n13490BCCPPrecio, T01OE6_A13491BCCPFecRec, T01OE6_n13491BCCPFecRec, T01OE6_A13492BCCPNalbar,
            T01OE6_n13492BCCPNalbar, T01OE6_A13493BCCPParcia, T01OE6_n13493BCCPParcia, T01OE6_A13494BCCPProvee, T01OE6_n13494BCCPProvee, T01OE6_A13495BCCPProces, T01OE6_n13495BCCPProces, T01OE6_A13496BCCPError, T01OE6_n13496BCCPError, T01OE6_A13497BCCPDescEr,
            T01OE6_n13497BCCPDescEr, T01OE6_A13498BCCPFecErr, T01OE6_n13498BCCPFecErr, T01OE6_A13499BCCPPilaEr, T01OE6_n13499BCCPPilaEr, T01OE6_A396EmprCod, T01OE6_A13478BCProducto
            }
            , new Object[] {
            T01OE8_A396EmprCod, T01OE8_A13488BCCPPedido, T01OE8_A13478BCProducto
            }
            , new Object[] {
            T01OE9_A396EmprCod, T01OE9_A13488BCCPPedido, T01OE9_A13478BCProducto
            }
            , new Object[] {
            T01OE10_A396EmprCod, T01OE10_A13488BCCPPedido, T01OE10_A13478BCProducto
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OE15_A396EmprCod, T01OE15_A13488BCCPPedido, T01OE15_A13478BCProducto
            }
            , new Object[] {
            T01OE16_A407EmprNom, T01OE16_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TBCCOMP" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z13495BCCPProces ;
   private short Z13496BCCPError ;
   private short Z13499BCCPPilaEr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13495BCCPProces ;
   private short A13496BCCPError ;
   private short A13499BCCPPilaEr ;
   private short RcdFound1845 ;
   private short nIsDirty_1845 ;
   private short ZZ13495BCCPProces ;
   private short ZZ13496BCCPError ;
   private short ZZ13499BCCPPilaEr ;
   private int Z13488BCCPPedido ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A13488BCCPPedido ;
   private int edtBCCPPedido_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBCProducto_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBCDescripc_Enabled ;
   private int edtBCCPCantid_Enabled ;
   private int edtBCCPPrecio_Enabled ;
   private int edtBCCPFecRec_Enabled ;
   private int edtBCCPNalbar_Enabled ;
   private int edtBCCPParcia_Enabled ;
   private int edtBCCPProvee_Enabled ;
   private int edtBCCPProces_Enabled ;
   private int edtBCCPError_Enabled ;
   private int edtBCCPDescEr_Enabled ;
   private int edtBCCPFecErr_Enabled ;
   private int edtBCCPPilaEr_Enabled ;
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
   private int edtBCCPPilaEr_Backcolor ;
   private int edtBCCPFecErr_Backcolor ;
   private int edtBCCPDescEr_Backcolor ;
   private int edtBCCPError_Backcolor ;
   private int edtBCCPProces_Backcolor ;
   private int edtBCCPProvee_Backcolor ;
   private int edtBCCPParcia_Backcolor ;
   private int edtBCCPNalbar_Backcolor ;
   private int edtBCCPFecRec_Backcolor ;
   private int edtBCCPPrecio_Backcolor ;
   private int edtBCCPCantid_Backcolor ;
   private int edtBCDescripc_Backcolor ;
   private int edtBCProducto_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBCCPPedido_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13488BCCPPedido ;
   private java.math.BigDecimal Z13489BCCPCantid ;
   private java.math.BigDecimal Z13490BCCPPrecio ;
   private java.math.BigDecimal A13489BCCPCantid ;
   private java.math.BigDecimal A13490BCCPPrecio ;
   private java.math.BigDecimal ZZ13489BCCPCantid ;
   private java.math.BigDecimal ZZ13490BCCPPrecio ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13478BCProducto ;
   private String Z13492BCCPNalbar ;
   private String Z13493BCCPParcia ;
   private String Z13494BCCPProvee ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13478BCProducto ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBCCPPedido_Internalname ;
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
   private String edtBCCPPedido_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBCProducto_Internalname ;
   private String edtBCProducto_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBCDescripc_Internalname ;
   private String A13479BCDescripc ;
   private String edtBCDescripc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBCCPCantid_Internalname ;
   private String edtBCCPCantid_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBCCPPrecio_Internalname ;
   private String edtBCCPPrecio_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBCCPFecRec_Internalname ;
   private String edtBCCPFecRec_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBCCPNalbar_Internalname ;
   private String A13492BCCPNalbar ;
   private String edtBCCPNalbar_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBCCPParcia_Internalname ;
   private String A13493BCCPParcia ;
   private String edtBCCPParcia_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBCCPProvee_Internalname ;
   private String A13494BCCPProvee ;
   private String edtBCCPProvee_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBCCPProces_Internalname ;
   private String edtBCCPProces_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBCCPError_Internalname ;
   private String edtBCCPError_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBCCPDescEr_Internalname ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBCCPFecErr_Internalname ;
   private String edtBCCPFecErr_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBCCPPilaEr_Internalname ;
   private String edtBCCPPilaEr_Jsonclick ;
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
   private String AV33Pgmname ;
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
   private String sMode1845 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13479BCDescripc ;
   private String ZZ396EmprCod ;
   private String ZZ13478BCProducto ;
   private String ZZ407EmprNom ;
   private String ZZ13492BCCPNalbar ;
   private String ZZ13493BCCPParcia ;
   private String ZZ13494BCCPProvee ;
   private String ZZ13479BCDescripc ;
   private java.util.Date Z13498BCCPFecErr ;
   private java.util.Date A13498BCCPFecErr ;
   private java.util.Date ZZ13498BCCPFecErr ;
   private java.util.Date Z13491BCCPFecRec ;
   private java.util.Date A13491BCCPFecRec ;
   private java.util.Date ZZ13491BCCPFecRec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n13479BCDescripc ;
   private boolean n13489BCCPCantid ;
   private boolean n13490BCCPPrecio ;
   private boolean n13491BCCPFecRec ;
   private boolean n13492BCCPNalbar ;
   private boolean n13493BCCPParcia ;
   private boolean n13494BCCPProvee ;
   private boolean n13495BCCPProces ;
   private boolean n13496BCCPError ;
   private boolean n13497BCCPDescEr ;
   private boolean n13498BCCPFecErr ;
   private boolean n13499BCCPPilaEr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z13497BCCPDescEr ;
   private String A13497BCCPDescEr ;
   private String ZZ13497BCCPDescEr ;
   private IDataStoreProvider pr_default ;
   private String[] T01OE4_A407EmprNom ;
   private boolean[] T01OE4_n407EmprNom ;
   private int[] T01OE6_A13488BCCPPedido ;
   private String[] T01OE6_A407EmprNom ;
   private boolean[] T01OE6_n407EmprNom ;
   private java.math.BigDecimal[] T01OE6_A13489BCCPCantid ;
   private boolean[] T01OE6_n13489BCCPCantid ;
   private java.math.BigDecimal[] T01OE6_A13490BCCPPrecio ;
   private boolean[] T01OE6_n13490BCCPPrecio ;
   private java.util.Date[] T01OE6_A13491BCCPFecRec ;
   private boolean[] T01OE6_n13491BCCPFecRec ;
   private String[] T01OE6_A13492BCCPNalbar ;
   private boolean[] T01OE6_n13492BCCPNalbar ;
   private String[] T01OE6_A13493BCCPParcia ;
   private boolean[] T01OE6_n13493BCCPParcia ;
   private String[] T01OE6_A13494BCCPProvee ;
   private boolean[] T01OE6_n13494BCCPProvee ;
   private short[] T01OE6_A13495BCCPProces ;
   private boolean[] T01OE6_n13495BCCPProces ;
   private short[] T01OE6_A13496BCCPError ;
   private boolean[] T01OE6_n13496BCCPError ;
   private String[] T01OE6_A13497BCCPDescEr ;
   private boolean[] T01OE6_n13497BCCPDescEr ;
   private java.util.Date[] T01OE6_A13498BCCPFecErr ;
   private boolean[] T01OE6_n13498BCCPFecErr ;
   private short[] T01OE6_A13499BCCPPilaEr ;
   private boolean[] T01OE6_n13499BCCPPilaEr ;
   private String[] T01OE6_A396EmprCod ;
   private String[] T01OE6_A13478BCProducto ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01OE5_A13479BCDescripc ;
   private boolean[] T01OE5_n13479BCDescripc ;
   private String[] T01OE7_A13479BCDescripc ;
   private boolean[] T01OE7_n13479BCDescripc ;
   private String[] T01OE8_A396EmprCod ;
   private int[] T01OE8_A13488BCCPPedido ;
   private String[] T01OE8_A13478BCProducto ;
   private int[] T01OE3_A13488BCCPPedido ;
   private java.math.BigDecimal[] T01OE3_A13489BCCPCantid ;
   private boolean[] T01OE3_n13489BCCPCantid ;
   private java.math.BigDecimal[] T01OE3_A13490BCCPPrecio ;
   private boolean[] T01OE3_n13490BCCPPrecio ;
   private java.util.Date[] T01OE3_A13491BCCPFecRec ;
   private boolean[] T01OE3_n13491BCCPFecRec ;
   private String[] T01OE3_A13492BCCPNalbar ;
   private boolean[] T01OE3_n13492BCCPNalbar ;
   private String[] T01OE3_A13493BCCPParcia ;
   private boolean[] T01OE3_n13493BCCPParcia ;
   private String[] T01OE3_A13494BCCPProvee ;
   private boolean[] T01OE3_n13494BCCPProvee ;
   private short[] T01OE3_A13495BCCPProces ;
   private boolean[] T01OE3_n13495BCCPProces ;
   private short[] T01OE3_A13496BCCPError ;
   private boolean[] T01OE3_n13496BCCPError ;
   private String[] T01OE3_A13497BCCPDescEr ;
   private boolean[] T01OE3_n13497BCCPDescEr ;
   private java.util.Date[] T01OE3_A13498BCCPFecErr ;
   private boolean[] T01OE3_n13498BCCPFecErr ;
   private short[] T01OE3_A13499BCCPPilaEr ;
   private boolean[] T01OE3_n13499BCCPPilaEr ;
   private String[] T01OE3_A396EmprCod ;
   private String[] T01OE3_A13478BCProducto ;
   private String[] T01OE9_A396EmprCod ;
   private int[] T01OE9_A13488BCCPPedido ;
   private String[] T01OE9_A13478BCProducto ;
   private String[] T01OE10_A396EmprCod ;
   private int[] T01OE10_A13488BCCPPedido ;
   private String[] T01OE10_A13478BCProducto ;
   private int[] T01OE2_A13488BCCPPedido ;
   private java.math.BigDecimal[] T01OE2_A13489BCCPCantid ;
   private boolean[] T01OE2_n13489BCCPCantid ;
   private java.math.BigDecimal[] T01OE2_A13490BCCPPrecio ;
   private boolean[] T01OE2_n13490BCCPPrecio ;
   private java.util.Date[] T01OE2_A13491BCCPFecRec ;
   private boolean[] T01OE2_n13491BCCPFecRec ;
   private String[] T01OE2_A13492BCCPNalbar ;
   private boolean[] T01OE2_n13492BCCPNalbar ;
   private String[] T01OE2_A13493BCCPParcia ;
   private boolean[] T01OE2_n13493BCCPParcia ;
   private String[] T01OE2_A13494BCCPProvee ;
   private boolean[] T01OE2_n13494BCCPProvee ;
   private short[] T01OE2_A13495BCCPProces ;
   private boolean[] T01OE2_n13495BCCPProces ;
   private short[] T01OE2_A13496BCCPError ;
   private boolean[] T01OE2_n13496BCCPError ;
   private String[] T01OE2_A13497BCCPDescEr ;
   private boolean[] T01OE2_n13497BCCPDescEr ;
   private java.util.Date[] T01OE2_A13498BCCPFecErr ;
   private boolean[] T01OE2_n13498BCCPFecErr ;
   private short[] T01OE2_A13499BCCPPilaEr ;
   private boolean[] T01OE2_n13499BCCPPilaEr ;
   private String[] T01OE2_A396EmprCod ;
   private String[] T01OE2_A13478BCProducto ;
   private String[] T01OE14_A13479BCDescripc ;
   private boolean[] T01OE14_n13479BCDescripc ;
   private String[] T01OE15_A396EmprCod ;
   private int[] T01OE15_A13488BCCPPedido ;
   private String[] T01OE15_A13478BCProducto ;
   private String[] T01OE16_A407EmprNom ;
   private boolean[] T01OE16_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbccomp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbccomp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbccomp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbccomp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OE5", "SELECT [Descripción] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE7", "SELECT [Descripción] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE14", "SELECT [Descripción] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tbccomp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OE2", "SELECT BCCPPedido, BCCPCantid, BCCPPrecio, BCCPFecRec, BCCPNalbar, BCCPParcia, BCCPProvee, BCCPProces, BCCPError, BCCPDescEr, BCCPFecErr, BCCPPilaEr, EmprCod, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? AND BCCPPedido = ? AND BCProducto = ?  FOR UPDATE OF BCCPCantid, BCCPPrecio, BCCPFecRec, BCCPNalbar, BCCPParcia, BCCPProvee, BCCPProces, BCCPError, BCCPDescEr, BCCPFecErr, BCCPPilaEr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE3", "SELECT BCCPPedido, BCCPCantid, BCCPPrecio, BCCPFecRec, BCCPNalbar, BCCPParcia, BCCPProvee, BCCPProces, BCCPError, BCCPDescEr, BCCPFecErr, BCCPPilaEr, EmprCod, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? AND BCCPPedido = ? AND BCProducto = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE6", "SELECT /*+ FIRST_ROWS(100) */ TM1.BCCPPedido, T2.EmprNom, TM1.BCCPCantid, TM1.BCCPPrecio, TM1.BCCPFecRec, TM1.BCCPNalbar, TM1.BCCPParcia, TM1.BCCPProvee, TM1.BCCPProces, TM1.BCCPError, TM1.BCCPDescEr, TM1.BCCPFecErr, TM1.BCCPPilaEr, TM1.EmprCod, TM1.BCProducto FROM (TXPBCCOMP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BCCPPedido = ? and TM1.BCProducto = ? ORDER BY TM1.EmprCod, TM1.BCCPPedido, TM1.BCProducto ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? AND BCCPPedido = ? AND BCProducto = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE ( BCCPPedido > ? or BCCPPedido = ? and BCProducto > ?) and EmprCod = ? ORDER BY EmprCod, BCCPPedido, BCProducto) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OE10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE ( BCCPPedido < ? or BCCPPedido = ? and BCProducto < ?) and EmprCod = ? ORDER BY EmprCod DESC, BCCPPedido DESC, BCProducto DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OE11", "INSERT INTO TXPBCCOMP(BCCPPedido, BCCPCantid, BCCPPrecio, BCCPFecRec, BCCPNalbar, BCCPParcia, BCCPProvee, BCCPProces, BCCPError, BCCPDescEr, BCCPFecErr, BCCPPilaEr, EmprCod, BCProducto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBCCOMP")
         ,new UpdateCursor("T01OE12", "UPDATE TXPBCCOMP SET BCCPCantid=?, BCCPPrecio=?, BCCPFecRec=?, BCCPNalbar=?, BCCPParcia=?, BCCPProvee=?, BCCPProces=?, BCCPError=?, BCCPDescEr=?, BCCPFecErr=?, BCCPPilaEr=?  WHERE EmprCod = ? AND BCCPPedido = ? AND BCProducto = ?", GX_NOMASK, "TXPBCCOMP")
         ,new UpdateCursor("T01OE13", "DELETE FROM TXPBCCOMP  WHERE EmprCod = ? AND BCCPPedido = ? AND BCProducto = ?", GX_NOMASK, "TXPBCCOMP")
         ,new ForEachCursor("T01OE15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? ORDER BY EmprCod, BCCPPedido, BCProducto ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OE16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((String[]) buf[24])[0] = rslt.getString(14, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((String[]) buf[24])[0] = rslt.getString(14, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((String[]) buf[26])[0] = rslt.getString(15, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 20);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 200);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[22]).shortValue());
               }
               stmt.setString(13, (String)parms[23], 3);
               stmt.setString(14, (String)parms[24], 6);
               return;
            case 8 :
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setString(14, (String)parms[24], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

