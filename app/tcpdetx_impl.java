package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcpdetx_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CABECERA PEDIDOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEtx_Ped_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcpdetx_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcpdetx_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcpdetx_impl.class ));
   }

   public tcpdetx_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCPDETX.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Pedido", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Ped_Internalname, GXutil.rtrim( A8782Etx_Ped), GXutil.rtrim( localUtil.format( A8782Etx_Ped, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Ped_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Ped_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Dib_Internalname, GXutil.rtrim( A8783Etx_Dib), GXutil.rtrim( localUtil.format( A8783Etx_Dib, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Dib_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Dib_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Art_Internalname, GXutil.rtrim( A8784Etx_Art), GXutil.rtrim( localUtil.format( A8784Etx_Art, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Art_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Art_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Pro_Internalname, GXutil.rtrim( A8785Etx_Pro), GXutil.rtrim( localUtil.format( A8785Etx_Pro, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Pro_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Pro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_DibI_Internalname, GXutil.ltrim( localUtil.ntoc( A8786Etx_DibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_DibI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8786Etx_DibI), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8786Etx_DibI), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_DibI_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_DibI_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Comercial", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_DibC_Internalname, GXutil.rtrim( A8787Etx_DibC), GXutil.rtrim( localUtil.format( A8787Etx_DibC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_DibC_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_DibC_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FecP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FecP_Internalname, localUtil.format(A8788Etx_FecP, "99/99/99"), localUtil.format( A8788Etx_FecP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FecP_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FecP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FecP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FecP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FecEnt_Internalname, localUtil.format(A8789Etx_FecEnt, "99/99/99"), localUtil.format( A8789Etx_FecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Coordinado", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Coord_Internalname, GXutil.rtrim( A8790Etx_Coord), GXutil.rtrim( localUtil.format( A8790Etx_Coord, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Coord_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Coord_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Reemplazo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Reemp_Internalname, GXutil.rtrim( A8791Etx_Reemp), GXutil.rtrim( localUtil.format( A8791Etx_Reemp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Reemp_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Reemp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Programadora", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_idprog_Internalname, GXutil.rtrim( A8792Etx_idprog), GXutil.rtrim( localUtil.format( A8792Etx_idprog, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_idprog_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_idprog_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre Programadora", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Nmprog_Internalname, GXutil.rtrim( A8793Etx_Nmprog), GXutil.rtrim( localUtil.format( A8793Etx_Nmprog, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Nmprog_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Nmprog_Enabled, 0, "text", "", 51, "chr", 1, "row", 51, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Clase Pedido", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Claspe_Internalname, GXutil.rtrim( A8794Etx_Claspe), GXutil.rtrim( localUtil.format( A8794Etx_Claspe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Claspe_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Claspe_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Nombre Clase Pedido", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_NmClas_Internalname, GXutil.rtrim( A8795Etx_NmClas), GXutil.rtrim( localUtil.format( A8795Etx_NmClas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_NmClas_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_NmClas_Enabled, 0, "text", "", 51, "chr", 1, "row", 51, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Identificacion", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Id_Internalname, GXutil.rtrim( A8796Etx_Id), GXutil.rtrim( localUtil.format( A8796Etx_Id, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Id_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Nombre Identificacion", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_NmId_Internalname, GXutil.rtrim( A8797Etx_NmId), GXutil.rtrim( localUtil.format( A8797Etx_NmId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_NmId_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_NmId_Enabled, 0, "text", "", 51, "chr", 1, "row", 51, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Agente", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Agente_Internalname, GXutil.rtrim( A8798Etx_Agente), GXutil.rtrim( localUtil.format( A8798Etx_Agente, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Agente_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Agente_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Nombre Agente", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_NmAgen_Internalname, GXutil.rtrim( A8799Etx_NmAgen), GXutil.rtrim( localUtil.format( A8799Etx_NmAgen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_NmAgen_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_NmAgen_Enabled, 0, "text", "", 51, "chr", 1, "row", 51, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "GrupoFamilia", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_GruFam_Internalname, GXutil.ltrim( localUtil.ntoc( A8800Etx_GruFam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_GruFam_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8800Etx_GruFam), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8800Etx_GruFam), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_GruFam_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_GruFam_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "TipoAgencia", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_TipAge_Internalname, GXutil.rtrim( A8801Etx_TipAge), GXutil.rtrim( localUtil.format( A8801Etx_TipAge, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_TipAge_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_TipAge_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Tipo Planta (Progr o Stock)", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_TipPlt_Internalname, GXutil.rtrim( A8802Etx_TipPlt), GXutil.rtrim( localUtil.format( A8802Etx_TipPlt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_TipPlt_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_TipPlt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Obs Pedido", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtEtx_ObsPed_Internalname, A8803Etx_ObsPed, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", (short)(0), 1, edtEtx_ObsPed_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Obs Tejido", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtEtx_ObsTej_Internalname, A8804Etx_ObsTej, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", (short)(0), 1, edtEtx_ObsTej_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "800", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Estado Pedido (0,1)", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Est_Internalname, GXutil.ltrim( localUtil.ntoc( A8805Etx_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_Est_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8805Etx_Est), "9") : localUtil.format( DecimalUtil.doubleToDec(A8805Etx_Est), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Est_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Est_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Estados ??", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Ests_Internalname, GXutil.ltrim( localUtil.ntoc( A8806Etx_Ests, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_Ests_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8806Etx_Ests), "9") : localUtil.format( DecimalUtil.doubleToDec(A8806Etx_Ests), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Ests_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Ests_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Circular o Tricote", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_CiroTr_Internalname, GXutil.rtrim( A8829Etx_CiroTr), GXutil.rtrim( localUtil.format( A8829Etx_CiroTr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_CiroTr_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_CiroTr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Fecha Completo Tejeduria", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FCompT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FCompT_Internalname, localUtil.format(A8870Etx_FCompT, "99/99/99"), localUtil.format( A8870Etx_FCompT, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FCompT_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FCompT_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FCompT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FCompT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Fecha Completo OT", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FCompO_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FCompO_Internalname, localUtil.format(A8871Etx_FCompO, "99/99/99"), localUtil.format( A8871Etx_FCompO, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FCompO_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FCompO_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FCompO_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FCompO_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Programacion Ok?", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Prog_Internalname, GXutil.rtrim( A8872Etx_Prog), GXutil.rtrim( localUtil.format( A8872Etx_Prog, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Prog_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Prog_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Fecha Pedido Completo", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FPedCB_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FPedCB_Internalname, localUtil.ttoc( A8873Etx_FPedCB, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8873Etx_FPedCB, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FPedCB_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FPedCB_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FPedCB_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FPedCB_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Usuario Pedido Completo", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_UsuCBE_Internalname, GXutil.rtrim( A8874Etx_UsuCBE), GXutil.rtrim( localUtil.format( A8874Etx_UsuCBE, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_UsuCBE_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_UsuCBE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Cierre Pedido Tejeduria", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_CloTJ_Internalname, GXutil.rtrim( A8875Etx_CloTJ), GXutil.rtrim( localUtil.format( A8875Etx_CloTJ, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_CloTJ_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_CloTJ_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Cierre Pedido Estampacion", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_CloES_Internalname, GXutil.rtrim( A8876Etx_CloES), GXutil.rtrim( localUtil.format( A8876Etx_CloES, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_CloES_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_CloES_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Muestra So N", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Muestr_Internalname, GXutil.rtrim( A8945Etx_Muestr), GXutil.rtrim( localUtil.format( A8945Etx_Muestr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Muestr_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Muestr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Pedido en OToOE", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_otoe_Internalname, GXutil.ltrim( localUtil.ntoc( A9394Etx_otoe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_otoe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9394Etx_otoe), "9") : localUtil.format( DecimalUtil.doubleToDec(A9394Etx_otoe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_otoe_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_otoe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Usuario Cierre Pedido", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_usuC_Internalname, GXutil.rtrim( A9563Etx_usuC), GXutil.rtrim( localUtil.format( A9563Etx_usuC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_usuC_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_usuC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "DiaHora Cierre", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_DhC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_DhC_Internalname, localUtil.ttoc( A9564Etx_DhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9564Etx_DhC, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_DhC_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_DhC_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_DhC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_DhC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Item 1", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_item1_Internalname, GXutil.rtrim( A9565Etx_item1), GXutil.rtrim( localUtil.format( A9565Etx_item1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_item1_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_item1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Item 4", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_item4_Internalname, GXutil.rtrim( A9567Etx_item4), GXutil.rtrim( localUtil.format( A9567Etx_item4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_item4_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_item4_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Item2", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_item3_Internalname, GXutil.rtrim( A9566Etx_item3), GXutil.rtrim( localUtil.format( A9566Etx_item3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_item3_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_item3_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Etx DibCO", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_DibCO_Internalname, GXutil.rtrim( A9599Etx_DibCO), GXutil.rtrim( localUtil.format( A9599Etx_DibCO, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_DibCO_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_DibCO_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Fecha Competo pedido OE", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEtx_FComOE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_FComOE_Internalname, localUtil.format(A9600Etx_FComOE, "99/99/99"), localUtil.format( A9600Etx_FComOE, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_FComOE_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_FComOE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEtx_FComOE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEtx_FComOE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCPDETX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Usuario cierra pedido", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_usuCOE_Internalname, GXutil.rtrim( A9601Etx_usuCOE), GXutil.rtrim( localUtil.format( A9601Etx_usuCOE, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_usuCOE_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_usuCOE_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Estado control Vertex", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_EstV_Internalname, GXutil.ltrim( localUtil.ntoc( A12207Etx_EstV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEtx_EstV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12207Etx_EstV), "9") : localUtil.format( DecimalUtil.doubleToDec(A12207Etx_EstV), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_EstV_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_EstV_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Inventario", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEtx_Inv_Internalname, GXutil.rtrim( A12958Etx_Inv), GXutil.rtrim( localUtil.format( A12958Etx_Inv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEtx_Inv_Jsonclick, 0, "", "", "", "", "", 1, edtEtx_Inv_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCPDETX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 265,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 267,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCPDETX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 268,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCPDETX.htm");
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
      e1112U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z8782Etx_Ped = httpContext.cgiGet( "Z8782Etx_Ped") ;
            Z8783Etx_Dib = httpContext.cgiGet( "Z8783Etx_Dib") ;
            Z8784Etx_Art = httpContext.cgiGet( "Z8784Etx_Art") ;
            Z8785Etx_Pro = httpContext.cgiGet( "Z8785Etx_Pro") ;
            Z8786Etx_DibI = (int)(localUtil.ctol( httpContext.cgiGet( "Z8786Etx_DibI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8787Etx_DibC = httpContext.cgiGet( "Z8787Etx_DibC") ;
            Z8788Etx_FecP = localUtil.ctod( httpContext.cgiGet( "Z8788Etx_FecP"), 0) ;
            Z8789Etx_FecEnt = localUtil.ctod( httpContext.cgiGet( "Z8789Etx_FecEnt"), 0) ;
            Z8790Etx_Coord = httpContext.cgiGet( "Z8790Etx_Coord") ;
            Z8791Etx_Reemp = httpContext.cgiGet( "Z8791Etx_Reemp") ;
            Z8792Etx_idprog = httpContext.cgiGet( "Z8792Etx_idprog") ;
            Z8793Etx_Nmprog = httpContext.cgiGet( "Z8793Etx_Nmprog") ;
            Z8794Etx_Claspe = httpContext.cgiGet( "Z8794Etx_Claspe") ;
            Z8795Etx_NmClas = httpContext.cgiGet( "Z8795Etx_NmClas") ;
            Z8796Etx_Id = httpContext.cgiGet( "Z8796Etx_Id") ;
            Z8797Etx_NmId = httpContext.cgiGet( "Z8797Etx_NmId") ;
            Z8798Etx_Agente = httpContext.cgiGet( "Z8798Etx_Agente") ;
            Z8799Etx_NmAgen = httpContext.cgiGet( "Z8799Etx_NmAgen") ;
            Z8800Etx_GruFam = (short)(localUtil.ctol( httpContext.cgiGet( "Z8800Etx_GruFam"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8801Etx_TipAge = httpContext.cgiGet( "Z8801Etx_TipAge") ;
            Z8802Etx_TipPlt = httpContext.cgiGet( "Z8802Etx_TipPlt") ;
            Z8803Etx_ObsPed = httpContext.cgiGet( "Z8803Etx_ObsPed") ;
            Z8804Etx_ObsTej = httpContext.cgiGet( "Z8804Etx_ObsTej") ;
            Z8805Etx_Est = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8805Etx_Est"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8806Etx_Ests = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8806Etx_Ests"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8829Etx_CiroTr = httpContext.cgiGet( "Z8829Etx_CiroTr") ;
            Z8870Etx_FCompT = localUtil.ctod( httpContext.cgiGet( "Z8870Etx_FCompT"), 0) ;
            Z8871Etx_FCompO = localUtil.ctod( httpContext.cgiGet( "Z8871Etx_FCompO"), 0) ;
            Z8872Etx_Prog = httpContext.cgiGet( "Z8872Etx_Prog") ;
            Z8873Etx_FPedCB = localUtil.ctot( httpContext.cgiGet( "Z8873Etx_FPedCB"), 0) ;
            Z8874Etx_UsuCBE = httpContext.cgiGet( "Z8874Etx_UsuCBE") ;
            Z8875Etx_CloTJ = httpContext.cgiGet( "Z8875Etx_CloTJ") ;
            Z8876Etx_CloES = httpContext.cgiGet( "Z8876Etx_CloES") ;
            Z8945Etx_Muestr = httpContext.cgiGet( "Z8945Etx_Muestr") ;
            Z9394Etx_otoe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9394Etx_otoe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9563Etx_usuC = httpContext.cgiGet( "Z9563Etx_usuC") ;
            Z9564Etx_DhC = localUtil.ctot( httpContext.cgiGet( "Z9564Etx_DhC"), 0) ;
            Z9565Etx_item1 = httpContext.cgiGet( "Z9565Etx_item1") ;
            Z9567Etx_item4 = httpContext.cgiGet( "Z9567Etx_item4") ;
            Z9566Etx_item3 = httpContext.cgiGet( "Z9566Etx_item3") ;
            Z9599Etx_DibCO = httpContext.cgiGet( "Z9599Etx_DibCO") ;
            Z9600Etx_FComOE = localUtil.ctod( httpContext.cgiGet( "Z9600Etx_FComOE"), 0) ;
            Z9601Etx_usuCOE = httpContext.cgiGet( "Z9601Etx_usuCOE") ;
            Z12207Etx_EstV = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12207Etx_EstV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12958Etx_Inv = httpContext.cgiGet( "Z12958Etx_Inv") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A8782Etx_Ped = httpContext.cgiGet( edtEtx_Ped_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
            A8783Etx_Dib = httpContext.cgiGet( edtEtx_Dib_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A8784Etx_Art = httpContext.cgiGet( edtEtx_Art_Internalname) ;
            n8784Etx_Art = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8784Etx_Art", A8784Etx_Art);
            A8785Etx_Pro = httpContext.cgiGet( edtEtx_Pro_Internalname) ;
            n8785Etx_Pro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8785Etx_Pro", A8785Etx_Pro);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_DibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_DibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_DIBI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_DibI_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8786Etx_DibI = 0 ;
               n8786Etx_DibI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8786Etx_DibI), 8, 0));
            }
            else
            {
               A8786Etx_DibI = (int)(localUtil.ctol( httpContext.cgiGet( edtEtx_DibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8786Etx_DibI = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8786Etx_DibI), 8, 0));
            }
            A8787Etx_DibC = httpContext.cgiGet( edtEtx_DibC_Internalname) ;
            n8787Etx_DibC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8787Etx_DibC", A8787Etx_DibC);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEtx_FecP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETX_FECP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FecP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8788Etx_FecP = GXutil.nullDate() ;
               n8788Etx_FecP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
            }
            else
            {
               A8788Etx_FecP = localUtil.ctod( httpContext.cgiGet( edtEtx_FecP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8788Etx_FecP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEtx_FecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETX_FECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8789Etx_FecEnt = GXutil.nullDate() ;
               n8789Etx_FecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
            }
            else
            {
               A8789Etx_FecEnt = localUtil.ctod( httpContext.cgiGet( edtEtx_FecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8789Etx_FecEnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
            }
            A8790Etx_Coord = httpContext.cgiGet( edtEtx_Coord_Internalname) ;
            n8790Etx_Coord = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8790Etx_Coord", A8790Etx_Coord);
            A8791Etx_Reemp = httpContext.cgiGet( edtEtx_Reemp_Internalname) ;
            n8791Etx_Reemp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8791Etx_Reemp", A8791Etx_Reemp);
            A8792Etx_idprog = httpContext.cgiGet( edtEtx_idprog_Internalname) ;
            n8792Etx_idprog = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8792Etx_idprog", A8792Etx_idprog);
            A8793Etx_Nmprog = httpContext.cgiGet( edtEtx_Nmprog_Internalname) ;
            n8793Etx_Nmprog = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8793Etx_Nmprog", A8793Etx_Nmprog);
            A8794Etx_Claspe = httpContext.cgiGet( edtEtx_Claspe_Internalname) ;
            n8794Etx_Claspe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8794Etx_Claspe", A8794Etx_Claspe);
            A8795Etx_NmClas = httpContext.cgiGet( edtEtx_NmClas_Internalname) ;
            n8795Etx_NmClas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8795Etx_NmClas", A8795Etx_NmClas);
            A8796Etx_Id = httpContext.cgiGet( edtEtx_Id_Internalname) ;
            n8796Etx_Id = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8796Etx_Id", A8796Etx_Id);
            A8797Etx_NmId = httpContext.cgiGet( edtEtx_NmId_Internalname) ;
            n8797Etx_NmId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8797Etx_NmId", A8797Etx_NmId);
            A8798Etx_Agente = httpContext.cgiGet( edtEtx_Agente_Internalname) ;
            n8798Etx_Agente = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8798Etx_Agente", A8798Etx_Agente);
            A8799Etx_NmAgen = httpContext.cgiGet( edtEtx_NmAgen_Internalname) ;
            n8799Etx_NmAgen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8799Etx_NmAgen", A8799Etx_NmAgen);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_GruFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_GruFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_GRUFAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_GruFam_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8800Etx_GruFam = (short)(0) ;
               n8800Etx_GruFam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8800Etx_GruFam), 4, 0));
            }
            else
            {
               A8800Etx_GruFam = (short)(localUtil.ctol( httpContext.cgiGet( edtEtx_GruFam_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8800Etx_GruFam = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8800Etx_GruFam), 4, 0));
            }
            A8801Etx_TipAge = httpContext.cgiGet( edtEtx_TipAge_Internalname) ;
            n8801Etx_TipAge = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8801Etx_TipAge", A8801Etx_TipAge);
            A8802Etx_TipPlt = httpContext.cgiGet( edtEtx_TipPlt_Internalname) ;
            n8802Etx_TipPlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8802Etx_TipPlt", A8802Etx_TipPlt);
            A8803Etx_ObsPed = httpContext.cgiGet( edtEtx_ObsPed_Internalname) ;
            n8803Etx_ObsPed = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8803Etx_ObsPed", A8803Etx_ObsPed);
            A8804Etx_ObsTej = httpContext.cgiGet( edtEtx_ObsTej_Internalname) ;
            n8804Etx_ObsTej = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8804Etx_ObsTej", A8804Etx_ObsTej);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_EST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_Est_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8805Etx_Est = (byte)(0) ;
               n8805Etx_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.str( A8805Etx_Est, 1, 0));
            }
            else
            {
               A8805Etx_Est = (byte)(localUtil.ctol( httpContext.cgiGet( edtEtx_Est_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8805Etx_Est = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.str( A8805Etx_Est, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_Ests_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_Ests_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_ESTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_Ests_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8806Etx_Ests = (byte)(0) ;
               n8806Etx_Ests = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.str( A8806Etx_Ests, 1, 0));
            }
            else
            {
               A8806Etx_Ests = (byte)(localUtil.ctol( httpContext.cgiGet( edtEtx_Ests_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n8806Etx_Ests = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.str( A8806Etx_Ests, 1, 0));
            }
            A8829Etx_CiroTr = httpContext.cgiGet( edtEtx_CiroTr_Internalname) ;
            n8829Etx_CiroTr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8829Etx_CiroTr", A8829Etx_CiroTr);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEtx_FCompT_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETX_FCOMPT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FCompT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8870Etx_FCompT = GXutil.nullDate() ;
               n8870Etx_FCompT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
            }
            else
            {
               A8870Etx_FCompT = localUtil.ctod( httpContext.cgiGet( edtEtx_FCompT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8870Etx_FCompT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEtx_FCompO_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETX_FCOMPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FCompO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8871Etx_FCompO = GXutil.nullDate() ;
               n8871Etx_FCompO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
            }
            else
            {
               A8871Etx_FCompO = localUtil.ctod( httpContext.cgiGet( edtEtx_FCompO_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n8871Etx_FCompO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
            }
            A8872Etx_Prog = httpContext.cgiGet( edtEtx_Prog_Internalname) ;
            n8872Etx_Prog = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8872Etx_Prog", A8872Etx_Prog);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtEtx_FPedCB_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ETX_FPEDCB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FPedCB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
               n8873Etx_FPedCB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A8873Etx_FPedCB = localUtil.ctot( httpContext.cgiGet( edtEtx_FPedCB_Internalname)) ;
               n8873Etx_FPedCB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A8874Etx_UsuCBE = GXutil.upper( httpContext.cgiGet( edtEtx_UsuCBE_Internalname)) ;
            n8874Etx_UsuCBE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8874Etx_UsuCBE", A8874Etx_UsuCBE);
            A8875Etx_CloTJ = httpContext.cgiGet( edtEtx_CloTJ_Internalname) ;
            n8875Etx_CloTJ = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8875Etx_CloTJ", A8875Etx_CloTJ);
            A8876Etx_CloES = httpContext.cgiGet( edtEtx_CloES_Internalname) ;
            n8876Etx_CloES = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8876Etx_CloES", A8876Etx_CloES);
            A8945Etx_Muestr = httpContext.cgiGet( edtEtx_Muestr_Internalname) ;
            n8945Etx_Muestr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8945Etx_Muestr", A8945Etx_Muestr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_otoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_otoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_OTOE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_otoe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9394Etx_otoe = (byte)(0) ;
               n9394Etx_otoe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.str( A9394Etx_otoe, 1, 0));
            }
            else
            {
               A9394Etx_otoe = (byte)(localUtil.ctol( httpContext.cgiGet( edtEtx_otoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9394Etx_otoe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.str( A9394Etx_otoe, 1, 0));
            }
            A9563Etx_usuC = httpContext.cgiGet( edtEtx_usuC_Internalname) ;
            n9563Etx_usuC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9563Etx_usuC", A9563Etx_usuC);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtEtx_DhC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ETX_DHC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_DhC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
               n9564Etx_DhC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9564Etx_DhC = localUtil.ctot( httpContext.cgiGet( edtEtx_DhC_Internalname)) ;
               n9564Etx_DhC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A9565Etx_item1 = httpContext.cgiGet( edtEtx_item1_Internalname) ;
            n9565Etx_item1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9565Etx_item1", A9565Etx_item1);
            A9567Etx_item4 = httpContext.cgiGet( edtEtx_item4_Internalname) ;
            n9567Etx_item4 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9567Etx_item4", A9567Etx_item4);
            A9566Etx_item3 = httpContext.cgiGet( edtEtx_item3_Internalname) ;
            n9566Etx_item3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9566Etx_item3", A9566Etx_item3);
            A9599Etx_DibCO = httpContext.cgiGet( edtEtx_DibCO_Internalname) ;
            n9599Etx_DibCO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9599Etx_DibCO", A9599Etx_DibCO);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEtx_FComOE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETX_FCOMOE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_FComOE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9600Etx_FComOE = GXutil.nullDate() ;
               n9600Etx_FComOE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
            }
            else
            {
               A9600Etx_FComOE = localUtil.ctod( httpContext.cgiGet( edtEtx_FComOE_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9600Etx_FComOE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
            }
            A9601Etx_usuCOE = GXutil.upper( httpContext.cgiGet( edtEtx_usuCOE_Internalname)) ;
            n9601Etx_usuCOE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9601Etx_usuCOE", A9601Etx_usuCOE);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_EstV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEtx_EstV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETX_ESTV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEtx_EstV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12207Etx_EstV = (byte)(0) ;
               n12207Etx_EstV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.str( A12207Etx_EstV, 1, 0));
            }
            else
            {
               A12207Etx_EstV = (byte)(localUtil.ctol( httpContext.cgiGet( edtEtx_EstV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12207Etx_EstV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.str( A12207Etx_EstV, 1, 0));
            }
            A12958Etx_Inv = httpContext.cgiGet( edtEtx_Inv_Internalname) ;
            n12958Etx_Inv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12958Etx_Inv", A12958Etx_Inv);
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
               A8782Etx_Ped = httpContext.GetPar( "Etx_Ped") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
               A8783Etx_Dib = httpContext.GetPar( "Etx_Dib") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
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
                        e1112U2 ();
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
            initAll12U1198( ) ;
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
      disableAttributes12U1198( ) ;
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

   public void confirm_12U0( )
   {
      beforeValidate12U1198( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12U1198( ) ;
         }
         else
         {
            checkExtendedTable12U1198( ) ;
            if ( AnyError == 0 )
            {
               zm12U1198( 2) ;
               zm12U1198( 3) ;
            }
            closeExtendedTableCursors12U1198( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues12U0( ) ;
      }
   }

   public void resetCaption12U0( )
   {
   }

   public void e1112U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcpdetx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tcpdetx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcpdetx_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcpdetx_impl.this.A396EmprCod = GXv_char2[0] ;
      tcpdetx_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcpdetx_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm12U1198( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8784Etx_Art = T012U3_A8784Etx_Art[0] ;
            Z8785Etx_Pro = T012U3_A8785Etx_Pro[0] ;
            Z8786Etx_DibI = T012U3_A8786Etx_DibI[0] ;
            Z8787Etx_DibC = T012U3_A8787Etx_DibC[0] ;
            Z8788Etx_FecP = T012U3_A8788Etx_FecP[0] ;
            Z8789Etx_FecEnt = T012U3_A8789Etx_FecEnt[0] ;
            Z8790Etx_Coord = T012U3_A8790Etx_Coord[0] ;
            Z8791Etx_Reemp = T012U3_A8791Etx_Reemp[0] ;
            Z8792Etx_idprog = T012U3_A8792Etx_idprog[0] ;
            Z8793Etx_Nmprog = T012U3_A8793Etx_Nmprog[0] ;
            Z8794Etx_Claspe = T012U3_A8794Etx_Claspe[0] ;
            Z8795Etx_NmClas = T012U3_A8795Etx_NmClas[0] ;
            Z8796Etx_Id = T012U3_A8796Etx_Id[0] ;
            Z8797Etx_NmId = T012U3_A8797Etx_NmId[0] ;
            Z8798Etx_Agente = T012U3_A8798Etx_Agente[0] ;
            Z8799Etx_NmAgen = T012U3_A8799Etx_NmAgen[0] ;
            Z8800Etx_GruFam = T012U3_A8800Etx_GruFam[0] ;
            Z8801Etx_TipAge = T012U3_A8801Etx_TipAge[0] ;
            Z8802Etx_TipPlt = T012U3_A8802Etx_TipPlt[0] ;
            Z8803Etx_ObsPed = T012U3_A8803Etx_ObsPed[0] ;
            Z8804Etx_ObsTej = T012U3_A8804Etx_ObsTej[0] ;
            Z8805Etx_Est = T012U3_A8805Etx_Est[0] ;
            Z8806Etx_Ests = T012U3_A8806Etx_Ests[0] ;
            Z8829Etx_CiroTr = T012U3_A8829Etx_CiroTr[0] ;
            Z8870Etx_FCompT = T012U3_A8870Etx_FCompT[0] ;
            Z8871Etx_FCompO = T012U3_A8871Etx_FCompO[0] ;
            Z8872Etx_Prog = T012U3_A8872Etx_Prog[0] ;
            Z8873Etx_FPedCB = T012U3_A8873Etx_FPedCB[0] ;
            Z8874Etx_UsuCBE = T012U3_A8874Etx_UsuCBE[0] ;
            Z8875Etx_CloTJ = T012U3_A8875Etx_CloTJ[0] ;
            Z8876Etx_CloES = T012U3_A8876Etx_CloES[0] ;
            Z8945Etx_Muestr = T012U3_A8945Etx_Muestr[0] ;
            Z9394Etx_otoe = T012U3_A9394Etx_otoe[0] ;
            Z9563Etx_usuC = T012U3_A9563Etx_usuC[0] ;
            Z9564Etx_DhC = T012U3_A9564Etx_DhC[0] ;
            Z9565Etx_item1 = T012U3_A9565Etx_item1[0] ;
            Z9567Etx_item4 = T012U3_A9567Etx_item4[0] ;
            Z9566Etx_item3 = T012U3_A9566Etx_item3[0] ;
            Z9599Etx_DibCO = T012U3_A9599Etx_DibCO[0] ;
            Z9600Etx_FComOE = T012U3_A9600Etx_FComOE[0] ;
            Z9601Etx_usuCOE = T012U3_A9601Etx_usuCOE[0] ;
            Z12207Etx_EstV = T012U3_A12207Etx_EstV[0] ;
            Z12958Etx_Inv = T012U3_A12958Etx_Inv[0] ;
            Z252CliCod = T012U3_A252CliCod[0] ;
         }
         else
         {
            Z8784Etx_Art = A8784Etx_Art ;
            Z8785Etx_Pro = A8785Etx_Pro ;
            Z8786Etx_DibI = A8786Etx_DibI ;
            Z8787Etx_DibC = A8787Etx_DibC ;
            Z8788Etx_FecP = A8788Etx_FecP ;
            Z8789Etx_FecEnt = A8789Etx_FecEnt ;
            Z8790Etx_Coord = A8790Etx_Coord ;
            Z8791Etx_Reemp = A8791Etx_Reemp ;
            Z8792Etx_idprog = A8792Etx_idprog ;
            Z8793Etx_Nmprog = A8793Etx_Nmprog ;
            Z8794Etx_Claspe = A8794Etx_Claspe ;
            Z8795Etx_NmClas = A8795Etx_NmClas ;
            Z8796Etx_Id = A8796Etx_Id ;
            Z8797Etx_NmId = A8797Etx_NmId ;
            Z8798Etx_Agente = A8798Etx_Agente ;
            Z8799Etx_NmAgen = A8799Etx_NmAgen ;
            Z8800Etx_GruFam = A8800Etx_GruFam ;
            Z8801Etx_TipAge = A8801Etx_TipAge ;
            Z8802Etx_TipPlt = A8802Etx_TipPlt ;
            Z8803Etx_ObsPed = A8803Etx_ObsPed ;
            Z8804Etx_ObsTej = A8804Etx_ObsTej ;
            Z8805Etx_Est = A8805Etx_Est ;
            Z8806Etx_Ests = A8806Etx_Ests ;
            Z8829Etx_CiroTr = A8829Etx_CiroTr ;
            Z8870Etx_FCompT = A8870Etx_FCompT ;
            Z8871Etx_FCompO = A8871Etx_FCompO ;
            Z8872Etx_Prog = A8872Etx_Prog ;
            Z8873Etx_FPedCB = A8873Etx_FPedCB ;
            Z8874Etx_UsuCBE = A8874Etx_UsuCBE ;
            Z8875Etx_CloTJ = A8875Etx_CloTJ ;
            Z8876Etx_CloES = A8876Etx_CloES ;
            Z8945Etx_Muestr = A8945Etx_Muestr ;
            Z9394Etx_otoe = A9394Etx_otoe ;
            Z9563Etx_usuC = A9563Etx_usuC ;
            Z9564Etx_DhC = A9564Etx_DhC ;
            Z9565Etx_item1 = A9565Etx_item1 ;
            Z9567Etx_item4 = A9567Etx_item4 ;
            Z9566Etx_item3 = A9566Etx_item3 ;
            Z9599Etx_DibCO = A9599Etx_DibCO ;
            Z9600Etx_FComOE = A9600Etx_FComOE ;
            Z9601Etx_usuCOE = A9601Etx_usuCOE ;
            Z12207Etx_EstV = A12207Etx_EstV ;
            Z12958Etx_Inv = A12958Etx_Inv ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z8782Etx_Ped = A8782Etx_Ped ;
         Z8783Etx_Dib = A8783Etx_Dib ;
         Z8784Etx_Art = A8784Etx_Art ;
         Z8785Etx_Pro = A8785Etx_Pro ;
         Z8786Etx_DibI = A8786Etx_DibI ;
         Z8787Etx_DibC = A8787Etx_DibC ;
         Z8788Etx_FecP = A8788Etx_FecP ;
         Z8789Etx_FecEnt = A8789Etx_FecEnt ;
         Z8790Etx_Coord = A8790Etx_Coord ;
         Z8791Etx_Reemp = A8791Etx_Reemp ;
         Z8792Etx_idprog = A8792Etx_idprog ;
         Z8793Etx_Nmprog = A8793Etx_Nmprog ;
         Z8794Etx_Claspe = A8794Etx_Claspe ;
         Z8795Etx_NmClas = A8795Etx_NmClas ;
         Z8796Etx_Id = A8796Etx_Id ;
         Z8797Etx_NmId = A8797Etx_NmId ;
         Z8798Etx_Agente = A8798Etx_Agente ;
         Z8799Etx_NmAgen = A8799Etx_NmAgen ;
         Z8800Etx_GruFam = A8800Etx_GruFam ;
         Z8801Etx_TipAge = A8801Etx_TipAge ;
         Z8802Etx_TipPlt = A8802Etx_TipPlt ;
         Z8803Etx_ObsPed = A8803Etx_ObsPed ;
         Z8804Etx_ObsTej = A8804Etx_ObsTej ;
         Z8805Etx_Est = A8805Etx_Est ;
         Z8806Etx_Ests = A8806Etx_Ests ;
         Z8829Etx_CiroTr = A8829Etx_CiroTr ;
         Z8870Etx_FCompT = A8870Etx_FCompT ;
         Z8871Etx_FCompO = A8871Etx_FCompO ;
         Z8872Etx_Prog = A8872Etx_Prog ;
         Z8873Etx_FPedCB = A8873Etx_FPedCB ;
         Z8874Etx_UsuCBE = A8874Etx_UsuCBE ;
         Z8875Etx_CloTJ = A8875Etx_CloTJ ;
         Z8876Etx_CloES = A8876Etx_CloES ;
         Z8945Etx_Muestr = A8945Etx_Muestr ;
         Z9394Etx_otoe = A9394Etx_otoe ;
         Z9563Etx_usuC = A9563Etx_usuC ;
         Z9564Etx_DhC = A9564Etx_DhC ;
         Z9565Etx_item1 = A9565Etx_item1 ;
         Z9567Etx_item4 = A9567Etx_item4 ;
         Z9566Etx_item3 = A9566Etx_item3 ;
         Z9599Etx_DibCO = A9599Etx_DibCO ;
         Z9600Etx_FComOE = A9600Etx_FComOE ;
         Z9601Etx_usuCOE = A9601Etx_usuCOE ;
         Z12207Etx_EstV = A12207Etx_EstV ;
         Z12958Etx_Inv = A12958Etx_Inv ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCPDETX" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T012U4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012U4_A407EmprNom[0] ;
      n407EmprNom = T012U4_n407EmprNom[0] ;
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

   public void load12U1198( )
   {
      /* Using cursor T012U6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1198 = (short)(1) ;
         A407EmprNom = T012U6_A407EmprNom[0] ;
         n407EmprNom = T012U6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T012U6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8784Etx_Art = T012U6_A8784Etx_Art[0] ;
         n8784Etx_Art = T012U6_n8784Etx_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8784Etx_Art", A8784Etx_Art);
         A8785Etx_Pro = T012U6_A8785Etx_Pro[0] ;
         n8785Etx_Pro = T012U6_n8785Etx_Pro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8785Etx_Pro", A8785Etx_Pro);
         A8786Etx_DibI = T012U6_A8786Etx_DibI[0] ;
         n8786Etx_DibI = T012U6_n8786Etx_DibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8786Etx_DibI), 8, 0));
         A8787Etx_DibC = T012U6_A8787Etx_DibC[0] ;
         n8787Etx_DibC = T012U6_n8787Etx_DibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8787Etx_DibC", A8787Etx_DibC);
         A8788Etx_FecP = T012U6_A8788Etx_FecP[0] ;
         n8788Etx_FecP = T012U6_n8788Etx_FecP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
         A8789Etx_FecEnt = T012U6_A8789Etx_FecEnt[0] ;
         n8789Etx_FecEnt = T012U6_n8789Etx_FecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
         A8790Etx_Coord = T012U6_A8790Etx_Coord[0] ;
         n8790Etx_Coord = T012U6_n8790Etx_Coord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8790Etx_Coord", A8790Etx_Coord);
         A8791Etx_Reemp = T012U6_A8791Etx_Reemp[0] ;
         n8791Etx_Reemp = T012U6_n8791Etx_Reemp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8791Etx_Reemp", A8791Etx_Reemp);
         A8792Etx_idprog = T012U6_A8792Etx_idprog[0] ;
         n8792Etx_idprog = T012U6_n8792Etx_idprog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8792Etx_idprog", A8792Etx_idprog);
         A8793Etx_Nmprog = T012U6_A8793Etx_Nmprog[0] ;
         n8793Etx_Nmprog = T012U6_n8793Etx_Nmprog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8793Etx_Nmprog", A8793Etx_Nmprog);
         A8794Etx_Claspe = T012U6_A8794Etx_Claspe[0] ;
         n8794Etx_Claspe = T012U6_n8794Etx_Claspe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8794Etx_Claspe", A8794Etx_Claspe);
         A8795Etx_NmClas = T012U6_A8795Etx_NmClas[0] ;
         n8795Etx_NmClas = T012U6_n8795Etx_NmClas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8795Etx_NmClas", A8795Etx_NmClas);
         A8796Etx_Id = T012U6_A8796Etx_Id[0] ;
         n8796Etx_Id = T012U6_n8796Etx_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8796Etx_Id", A8796Etx_Id);
         A8797Etx_NmId = T012U6_A8797Etx_NmId[0] ;
         n8797Etx_NmId = T012U6_n8797Etx_NmId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8797Etx_NmId", A8797Etx_NmId);
         A8798Etx_Agente = T012U6_A8798Etx_Agente[0] ;
         n8798Etx_Agente = T012U6_n8798Etx_Agente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8798Etx_Agente", A8798Etx_Agente);
         A8799Etx_NmAgen = T012U6_A8799Etx_NmAgen[0] ;
         n8799Etx_NmAgen = T012U6_n8799Etx_NmAgen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8799Etx_NmAgen", A8799Etx_NmAgen);
         A8800Etx_GruFam = T012U6_A8800Etx_GruFam[0] ;
         n8800Etx_GruFam = T012U6_n8800Etx_GruFam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8800Etx_GruFam), 4, 0));
         A8801Etx_TipAge = T012U6_A8801Etx_TipAge[0] ;
         n8801Etx_TipAge = T012U6_n8801Etx_TipAge[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8801Etx_TipAge", A8801Etx_TipAge);
         A8802Etx_TipPlt = T012U6_A8802Etx_TipPlt[0] ;
         n8802Etx_TipPlt = T012U6_n8802Etx_TipPlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8802Etx_TipPlt", A8802Etx_TipPlt);
         A8803Etx_ObsPed = T012U6_A8803Etx_ObsPed[0] ;
         n8803Etx_ObsPed = T012U6_n8803Etx_ObsPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8803Etx_ObsPed", A8803Etx_ObsPed);
         A8804Etx_ObsTej = T012U6_A8804Etx_ObsTej[0] ;
         n8804Etx_ObsTej = T012U6_n8804Etx_ObsTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8804Etx_ObsTej", A8804Etx_ObsTej);
         A8805Etx_Est = T012U6_A8805Etx_Est[0] ;
         n8805Etx_Est = T012U6_n8805Etx_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.str( A8805Etx_Est, 1, 0));
         A8806Etx_Ests = T012U6_A8806Etx_Ests[0] ;
         n8806Etx_Ests = T012U6_n8806Etx_Ests[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.str( A8806Etx_Ests, 1, 0));
         A8829Etx_CiroTr = T012U6_A8829Etx_CiroTr[0] ;
         n8829Etx_CiroTr = T012U6_n8829Etx_CiroTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8829Etx_CiroTr", A8829Etx_CiroTr);
         A8870Etx_FCompT = T012U6_A8870Etx_FCompT[0] ;
         n8870Etx_FCompT = T012U6_n8870Etx_FCompT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
         A8871Etx_FCompO = T012U6_A8871Etx_FCompO[0] ;
         n8871Etx_FCompO = T012U6_n8871Etx_FCompO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
         A8872Etx_Prog = T012U6_A8872Etx_Prog[0] ;
         n8872Etx_Prog = T012U6_n8872Etx_Prog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8872Etx_Prog", A8872Etx_Prog);
         A8873Etx_FPedCB = T012U6_A8873Etx_FPedCB[0] ;
         n8873Etx_FPedCB = T012U6_n8873Etx_FPedCB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8874Etx_UsuCBE = T012U6_A8874Etx_UsuCBE[0] ;
         n8874Etx_UsuCBE = T012U6_n8874Etx_UsuCBE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8874Etx_UsuCBE", A8874Etx_UsuCBE);
         A8875Etx_CloTJ = T012U6_A8875Etx_CloTJ[0] ;
         n8875Etx_CloTJ = T012U6_n8875Etx_CloTJ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8875Etx_CloTJ", A8875Etx_CloTJ);
         A8876Etx_CloES = T012U6_A8876Etx_CloES[0] ;
         n8876Etx_CloES = T012U6_n8876Etx_CloES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8876Etx_CloES", A8876Etx_CloES);
         A8945Etx_Muestr = T012U6_A8945Etx_Muestr[0] ;
         n8945Etx_Muestr = T012U6_n8945Etx_Muestr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8945Etx_Muestr", A8945Etx_Muestr);
         A9394Etx_otoe = T012U6_A9394Etx_otoe[0] ;
         n9394Etx_otoe = T012U6_n9394Etx_otoe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.str( A9394Etx_otoe, 1, 0));
         A9563Etx_usuC = T012U6_A9563Etx_usuC[0] ;
         n9563Etx_usuC = T012U6_n9563Etx_usuC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9563Etx_usuC", A9563Etx_usuC);
         A9564Etx_DhC = T012U6_A9564Etx_DhC[0] ;
         n9564Etx_DhC = T012U6_n9564Etx_DhC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9565Etx_item1 = T012U6_A9565Etx_item1[0] ;
         n9565Etx_item1 = T012U6_n9565Etx_item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9565Etx_item1", A9565Etx_item1);
         A9567Etx_item4 = T012U6_A9567Etx_item4[0] ;
         n9567Etx_item4 = T012U6_n9567Etx_item4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9567Etx_item4", A9567Etx_item4);
         A9566Etx_item3 = T012U6_A9566Etx_item3[0] ;
         n9566Etx_item3 = T012U6_n9566Etx_item3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9566Etx_item3", A9566Etx_item3);
         A9599Etx_DibCO = T012U6_A9599Etx_DibCO[0] ;
         n9599Etx_DibCO = T012U6_n9599Etx_DibCO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9599Etx_DibCO", A9599Etx_DibCO);
         A9600Etx_FComOE = T012U6_A9600Etx_FComOE[0] ;
         n9600Etx_FComOE = T012U6_n9600Etx_FComOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
         A9601Etx_usuCOE = T012U6_A9601Etx_usuCOE[0] ;
         n9601Etx_usuCOE = T012U6_n9601Etx_usuCOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9601Etx_usuCOE", A9601Etx_usuCOE);
         A12207Etx_EstV = T012U6_A12207Etx_EstV[0] ;
         n12207Etx_EstV = T012U6_n12207Etx_EstV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.str( A12207Etx_EstV, 1, 0));
         A12958Etx_Inv = T012U6_A12958Etx_Inv[0] ;
         n12958Etx_Inv = T012U6_n12958Etx_Inv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12958Etx_Inv", A12958Etx_Inv);
         A252CliCod = T012U6_A252CliCod[0] ;
         n252CliCod = T012U6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm12U1198( -1) ;
      }
      pr_default.close(4);
      onLoadActions12U1198( ) ;
   }

   public void onLoadActions12U1198( )
   {
   }

   public void checkExtendedTable12U1198( )
   {
      nIsDirty_1198 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T012U5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T012U5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors12U1198( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T012U7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T012U7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey12U1198( )
   {
      /* Using cursor T012U8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1198 = (short)(1) ;
      }
      else
      {
         RcdFound1198 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T012U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T012U3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm12U1198( 1) ;
         RcdFound1198 = (short)(1) ;
         A8782Etx_Ped = T012U3_A8782Etx_Ped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
         A8783Etx_Dib = T012U3_A8783Etx_Dib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
         A8784Etx_Art = T012U3_A8784Etx_Art[0] ;
         n8784Etx_Art = T012U3_n8784Etx_Art[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8784Etx_Art", A8784Etx_Art);
         A8785Etx_Pro = T012U3_A8785Etx_Pro[0] ;
         n8785Etx_Pro = T012U3_n8785Etx_Pro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8785Etx_Pro", A8785Etx_Pro);
         A8786Etx_DibI = T012U3_A8786Etx_DibI[0] ;
         n8786Etx_DibI = T012U3_n8786Etx_DibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8786Etx_DibI), 8, 0));
         A8787Etx_DibC = T012U3_A8787Etx_DibC[0] ;
         n8787Etx_DibC = T012U3_n8787Etx_DibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8787Etx_DibC", A8787Etx_DibC);
         A8788Etx_FecP = T012U3_A8788Etx_FecP[0] ;
         n8788Etx_FecP = T012U3_n8788Etx_FecP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
         A8789Etx_FecEnt = T012U3_A8789Etx_FecEnt[0] ;
         n8789Etx_FecEnt = T012U3_n8789Etx_FecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
         A8790Etx_Coord = T012U3_A8790Etx_Coord[0] ;
         n8790Etx_Coord = T012U3_n8790Etx_Coord[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8790Etx_Coord", A8790Etx_Coord);
         A8791Etx_Reemp = T012U3_A8791Etx_Reemp[0] ;
         n8791Etx_Reemp = T012U3_n8791Etx_Reemp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8791Etx_Reemp", A8791Etx_Reemp);
         A8792Etx_idprog = T012U3_A8792Etx_idprog[0] ;
         n8792Etx_idprog = T012U3_n8792Etx_idprog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8792Etx_idprog", A8792Etx_idprog);
         A8793Etx_Nmprog = T012U3_A8793Etx_Nmprog[0] ;
         n8793Etx_Nmprog = T012U3_n8793Etx_Nmprog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8793Etx_Nmprog", A8793Etx_Nmprog);
         A8794Etx_Claspe = T012U3_A8794Etx_Claspe[0] ;
         n8794Etx_Claspe = T012U3_n8794Etx_Claspe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8794Etx_Claspe", A8794Etx_Claspe);
         A8795Etx_NmClas = T012U3_A8795Etx_NmClas[0] ;
         n8795Etx_NmClas = T012U3_n8795Etx_NmClas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8795Etx_NmClas", A8795Etx_NmClas);
         A8796Etx_Id = T012U3_A8796Etx_Id[0] ;
         n8796Etx_Id = T012U3_n8796Etx_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8796Etx_Id", A8796Etx_Id);
         A8797Etx_NmId = T012U3_A8797Etx_NmId[0] ;
         n8797Etx_NmId = T012U3_n8797Etx_NmId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8797Etx_NmId", A8797Etx_NmId);
         A8798Etx_Agente = T012U3_A8798Etx_Agente[0] ;
         n8798Etx_Agente = T012U3_n8798Etx_Agente[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8798Etx_Agente", A8798Etx_Agente);
         A8799Etx_NmAgen = T012U3_A8799Etx_NmAgen[0] ;
         n8799Etx_NmAgen = T012U3_n8799Etx_NmAgen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8799Etx_NmAgen", A8799Etx_NmAgen);
         A8800Etx_GruFam = T012U3_A8800Etx_GruFam[0] ;
         n8800Etx_GruFam = T012U3_n8800Etx_GruFam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8800Etx_GruFam), 4, 0));
         A8801Etx_TipAge = T012U3_A8801Etx_TipAge[0] ;
         n8801Etx_TipAge = T012U3_n8801Etx_TipAge[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8801Etx_TipAge", A8801Etx_TipAge);
         A8802Etx_TipPlt = T012U3_A8802Etx_TipPlt[0] ;
         n8802Etx_TipPlt = T012U3_n8802Etx_TipPlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8802Etx_TipPlt", A8802Etx_TipPlt);
         A8803Etx_ObsPed = T012U3_A8803Etx_ObsPed[0] ;
         n8803Etx_ObsPed = T012U3_n8803Etx_ObsPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8803Etx_ObsPed", A8803Etx_ObsPed);
         A8804Etx_ObsTej = T012U3_A8804Etx_ObsTej[0] ;
         n8804Etx_ObsTej = T012U3_n8804Etx_ObsTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8804Etx_ObsTej", A8804Etx_ObsTej);
         A8805Etx_Est = T012U3_A8805Etx_Est[0] ;
         n8805Etx_Est = T012U3_n8805Etx_Est[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.str( A8805Etx_Est, 1, 0));
         A8806Etx_Ests = T012U3_A8806Etx_Ests[0] ;
         n8806Etx_Ests = T012U3_n8806Etx_Ests[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.str( A8806Etx_Ests, 1, 0));
         A8829Etx_CiroTr = T012U3_A8829Etx_CiroTr[0] ;
         n8829Etx_CiroTr = T012U3_n8829Etx_CiroTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8829Etx_CiroTr", A8829Etx_CiroTr);
         A8870Etx_FCompT = T012U3_A8870Etx_FCompT[0] ;
         n8870Etx_FCompT = T012U3_n8870Etx_FCompT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
         A8871Etx_FCompO = T012U3_A8871Etx_FCompO[0] ;
         n8871Etx_FCompO = T012U3_n8871Etx_FCompO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
         A8872Etx_Prog = T012U3_A8872Etx_Prog[0] ;
         n8872Etx_Prog = T012U3_n8872Etx_Prog[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8872Etx_Prog", A8872Etx_Prog);
         A8873Etx_FPedCB = T012U3_A8873Etx_FPedCB[0] ;
         n8873Etx_FPedCB = T012U3_n8873Etx_FPedCB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8874Etx_UsuCBE = T012U3_A8874Etx_UsuCBE[0] ;
         n8874Etx_UsuCBE = T012U3_n8874Etx_UsuCBE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8874Etx_UsuCBE", A8874Etx_UsuCBE);
         A8875Etx_CloTJ = T012U3_A8875Etx_CloTJ[0] ;
         n8875Etx_CloTJ = T012U3_n8875Etx_CloTJ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8875Etx_CloTJ", A8875Etx_CloTJ);
         A8876Etx_CloES = T012U3_A8876Etx_CloES[0] ;
         n8876Etx_CloES = T012U3_n8876Etx_CloES[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8876Etx_CloES", A8876Etx_CloES);
         A8945Etx_Muestr = T012U3_A8945Etx_Muestr[0] ;
         n8945Etx_Muestr = T012U3_n8945Etx_Muestr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8945Etx_Muestr", A8945Etx_Muestr);
         A9394Etx_otoe = T012U3_A9394Etx_otoe[0] ;
         n9394Etx_otoe = T012U3_n9394Etx_otoe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.str( A9394Etx_otoe, 1, 0));
         A9563Etx_usuC = T012U3_A9563Etx_usuC[0] ;
         n9563Etx_usuC = T012U3_n9563Etx_usuC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9563Etx_usuC", A9563Etx_usuC);
         A9564Etx_DhC = T012U3_A9564Etx_DhC[0] ;
         n9564Etx_DhC = T012U3_n9564Etx_DhC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9565Etx_item1 = T012U3_A9565Etx_item1[0] ;
         n9565Etx_item1 = T012U3_n9565Etx_item1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9565Etx_item1", A9565Etx_item1);
         A9567Etx_item4 = T012U3_A9567Etx_item4[0] ;
         n9567Etx_item4 = T012U3_n9567Etx_item4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9567Etx_item4", A9567Etx_item4);
         A9566Etx_item3 = T012U3_A9566Etx_item3[0] ;
         n9566Etx_item3 = T012U3_n9566Etx_item3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9566Etx_item3", A9566Etx_item3);
         A9599Etx_DibCO = T012U3_A9599Etx_DibCO[0] ;
         n9599Etx_DibCO = T012U3_n9599Etx_DibCO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9599Etx_DibCO", A9599Etx_DibCO);
         A9600Etx_FComOE = T012U3_A9600Etx_FComOE[0] ;
         n9600Etx_FComOE = T012U3_n9600Etx_FComOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
         A9601Etx_usuCOE = T012U3_A9601Etx_usuCOE[0] ;
         n9601Etx_usuCOE = T012U3_n9601Etx_usuCOE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9601Etx_usuCOE", A9601Etx_usuCOE);
         A12207Etx_EstV = T012U3_A12207Etx_EstV[0] ;
         n12207Etx_EstV = T012U3_n12207Etx_EstV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.str( A12207Etx_EstV, 1, 0));
         A12958Etx_Inv = T012U3_A12958Etx_Inv[0] ;
         n12958Etx_Inv = T012U3_n12958Etx_Inv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12958Etx_Inv", A12958Etx_Inv);
         A252CliCod = T012U3_A252CliCod[0] ;
         n252CliCod = T012U3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z8782Etx_Ped = A8782Etx_Ped ;
         Z8783Etx_Dib = A8783Etx_Dib ;
         sMode1198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12U1198( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1198 = (short)(0) ;
            initializeNonKey12U1198( ) ;
         }
         Gx_mode = sMode1198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1198 = (short)(0) ;
         initializeNonKey12U1198( ) ;
         sMode1198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey12U1198( ) ;
      if ( RcdFound1198 == 0 )
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
      RcdFound1198 = (short)(0) ;
      /* Using cursor T012U9 */
      pr_default.execute(7, new Object[] {A8782Etx_Ped, A8782Etx_Ped, A8783Etx_Dib, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T012U9_A8782Etx_Ped[0], A8782Etx_Ped) < 0 ) || ( GXutil.strcmp(T012U9_A8782Etx_Ped[0], A8782Etx_Ped) == 0 ) && ( GXutil.strcmp(T012U9_A8783Etx_Dib[0], A8783Etx_Dib) < 0 ) ) && ( GXutil.strcmp(T012U9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T012U9_A8782Etx_Ped[0], A8782Etx_Ped) > 0 ) || ( GXutil.strcmp(T012U9_A8782Etx_Ped[0], A8782Etx_Ped) == 0 ) && ( GXutil.strcmp(T012U9_A8783Etx_Dib[0], A8783Etx_Dib) > 0 ) ) && ( GXutil.strcmp(T012U9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A8782Etx_Ped = T012U9_A8782Etx_Ped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
            A8783Etx_Dib = T012U9_A8783Etx_Dib[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
            RcdFound1198 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1198 = (short)(0) ;
      /* Using cursor T012U10 */
      pr_default.execute(8, new Object[] {A8782Etx_Ped, A8782Etx_Ped, A8783Etx_Dib, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T012U10_A8782Etx_Ped[0], A8782Etx_Ped) > 0 ) || ( GXutil.strcmp(T012U10_A8782Etx_Ped[0], A8782Etx_Ped) == 0 ) && ( GXutil.strcmp(T012U10_A8783Etx_Dib[0], A8783Etx_Dib) > 0 ) ) && ( GXutil.strcmp(T012U10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T012U10_A8782Etx_Ped[0], A8782Etx_Ped) < 0 ) || ( GXutil.strcmp(T012U10_A8782Etx_Ped[0], A8782Etx_Ped) == 0 ) && ( GXutil.strcmp(T012U10_A8783Etx_Dib[0], A8783Etx_Dib) < 0 ) ) && ( GXutil.strcmp(T012U10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A8782Etx_Ped = T012U10_A8782Etx_Ped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
            A8783Etx_Dib = T012U10_A8783Etx_Dib[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
            RcdFound1198 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12U1198( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEtx_Ped_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12U1198( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1198 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8782Etx_Ped, Z8782Etx_Ped) != 0 ) || ( GXutil.strcmp(A8783Etx_Dib, Z8783Etx_Dib) != 0 ) )
            {
               A8782Etx_Ped = Z8782Etx_Ped ;
               httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
               A8783Etx_Dib = Z8783Etx_Dib ;
               httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEtx_Ped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update12U1198( ) ;
               GX_FocusControl = edtEtx_Ped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8782Etx_Ped, Z8782Etx_Ped) != 0 ) || ( GXutil.strcmp(A8783Etx_Dib, Z8783Etx_Dib) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEtx_Ped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert12U1198( ) ;
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
                  GX_FocusControl = edtEtx_Ped_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert12U1198( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8782Etx_Ped, Z8782Etx_Ped) != 0 ) || ( GXutil.strcmp(A8783Etx_Dib, Z8783Etx_Dib) != 0 ) )
      {
         A8782Etx_Ped = Z8782Etx_Ped ;
         httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
         A8783Etx_Dib = Z8783Etx_Dib ;
         httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEtx_Ped_Internalname ;
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
      getKey12U1198( ) ;
      if ( RcdFound1198 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8782Etx_Ped, Z8782Etx_Ped) != 0 ) || ( GXutil.strcmp(A8783Etx_Dib, Z8783Etx_Dib) != 0 ) )
         {
            A8782Etx_Ped = Z8782Etx_Ped ;
            httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
            A8783Etx_Dib = Z8783Etx_Dib ;
            httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A8782Etx_Ped, Z8782Etx_Ped) != 0 ) || ( GXutil.strcmp(A8783Etx_Dib, Z8783Etx_Dib) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcpdetx");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_12U0( ) ;
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
      if ( RcdFound1198 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart12U1198( ) ;
      if ( RcdFound1198 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12U1198( ) ;
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
      if ( RcdFound1198 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound1198 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStart12U1198( ) ;
      if ( RcdFound1198 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1198 != 0 )
         {
            scanNext12U1198( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12U1198( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12U1198( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T012U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPDETX"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8784Etx_Art, T012U2_A8784Etx_Art[0]) != 0 ) || ( GXutil.strcmp(Z8785Etx_Pro, T012U2_A8785Etx_Pro[0]) != 0 ) || ( Z8786Etx_DibI != T012U2_A8786Etx_DibI[0] ) || ( GXutil.strcmp(Z8787Etx_DibC, T012U2_A8787Etx_DibC[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8788Etx_FecP), GXutil.resetTime(T012U2_A8788Etx_FecP[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z8789Etx_FecEnt), GXutil.resetTime(T012U2_A8789Etx_FecEnt[0])) ) || ( GXutil.strcmp(Z8790Etx_Coord, T012U2_A8790Etx_Coord[0]) != 0 ) || ( GXutil.strcmp(Z8791Etx_Reemp, T012U2_A8791Etx_Reemp[0]) != 0 ) || ( GXutil.strcmp(Z8792Etx_idprog, T012U2_A8792Etx_idprog[0]) != 0 ) || ( GXutil.strcmp(Z8793Etx_Nmprog, T012U2_A8793Etx_Nmprog[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8794Etx_Claspe, T012U2_A8794Etx_Claspe[0]) != 0 ) || ( GXutil.strcmp(Z8795Etx_NmClas, T012U2_A8795Etx_NmClas[0]) != 0 ) || ( GXutil.strcmp(Z8796Etx_Id, T012U2_A8796Etx_Id[0]) != 0 ) || ( GXutil.strcmp(Z8797Etx_NmId, T012U2_A8797Etx_NmId[0]) != 0 ) || ( GXutil.strcmp(Z8798Etx_Agente, T012U2_A8798Etx_Agente[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8799Etx_NmAgen, T012U2_A8799Etx_NmAgen[0]) != 0 ) || ( Z8800Etx_GruFam != T012U2_A8800Etx_GruFam[0] ) || ( GXutil.strcmp(Z8801Etx_TipAge, T012U2_A8801Etx_TipAge[0]) != 0 ) || ( GXutil.strcmp(Z8802Etx_TipPlt, T012U2_A8802Etx_TipPlt[0]) != 0 ) || ( GXutil.strcmp(Z8803Etx_ObsPed, T012U2_A8803Etx_ObsPed[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8804Etx_ObsTej, T012U2_A8804Etx_ObsTej[0]) != 0 ) || ( Z8805Etx_Est != T012U2_A8805Etx_Est[0] ) || ( Z8806Etx_Ests != T012U2_A8806Etx_Ests[0] ) || ( GXutil.strcmp(Z8829Etx_CiroTr, T012U2_A8829Etx_CiroTr[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z8870Etx_FCompT), GXutil.resetTime(T012U2_A8870Etx_FCompT[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z8871Etx_FCompO), GXutil.resetTime(T012U2_A8871Etx_FCompO[0])) ) || ( GXutil.strcmp(Z8872Etx_Prog, T012U2_A8872Etx_Prog[0]) != 0 ) || !( GXutil.dateCompare(Z8873Etx_FPedCB, T012U2_A8873Etx_FPedCB[0]) ) || ( GXutil.strcmp(Z8874Etx_UsuCBE, T012U2_A8874Etx_UsuCBE[0]) != 0 ) || ( GXutil.strcmp(Z8875Etx_CloTJ, T012U2_A8875Etx_CloTJ[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8876Etx_CloES, T012U2_A8876Etx_CloES[0]) != 0 ) || ( GXutil.strcmp(Z8945Etx_Muestr, T012U2_A8945Etx_Muestr[0]) != 0 ) || ( Z9394Etx_otoe != T012U2_A9394Etx_otoe[0] ) || ( GXutil.strcmp(Z9563Etx_usuC, T012U2_A9563Etx_usuC[0]) != 0 ) || !( GXutil.dateCompare(Z9564Etx_DhC, T012U2_A9564Etx_DhC[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9565Etx_item1, T012U2_A9565Etx_item1[0]) != 0 ) || ( GXutil.strcmp(Z9567Etx_item4, T012U2_A9567Etx_item4[0]) != 0 ) || ( GXutil.strcmp(Z9566Etx_item3, T012U2_A9566Etx_item3[0]) != 0 ) || ( GXutil.strcmp(Z9599Etx_DibCO, T012U2_A9599Etx_DibCO[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9600Etx_FComOE), GXutil.resetTime(T012U2_A9600Etx_FComOE[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9601Etx_usuCOE, T012U2_A9601Etx_usuCOE[0]) != 0 ) || ( Z12207Etx_EstV != T012U2_A12207Etx_EstV[0] ) || ( GXutil.strcmp(Z12958Etx_Inv, T012U2_A12958Etx_Inv[0]) != 0 ) || ( Z252CliCod != T012U2_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z8784Etx_Art, T012U2_A8784Etx_Art[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Art");
               GXutil.writeLogRaw("Old: ",Z8784Etx_Art);
               GXutil.writeLogRaw("Current: ",T012U2_A8784Etx_Art[0]);
            }
            if ( GXutil.strcmp(Z8785Etx_Pro, T012U2_A8785Etx_Pro[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Pro");
               GXutil.writeLogRaw("Old: ",Z8785Etx_Pro);
               GXutil.writeLogRaw("Current: ",T012U2_A8785Etx_Pro[0]);
            }
            if ( Z8786Etx_DibI != T012U2_A8786Etx_DibI[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_DibI");
               GXutil.writeLogRaw("Old: ",Z8786Etx_DibI);
               GXutil.writeLogRaw("Current: ",T012U2_A8786Etx_DibI[0]);
            }
            if ( GXutil.strcmp(Z8787Etx_DibC, T012U2_A8787Etx_DibC[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_DibC");
               GXutil.writeLogRaw("Old: ",Z8787Etx_DibC);
               GXutil.writeLogRaw("Current: ",T012U2_A8787Etx_DibC[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8788Etx_FecP), GXutil.resetTime(T012U2_A8788Etx_FecP[0])) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FecP");
               GXutil.writeLogRaw("Old: ",Z8788Etx_FecP);
               GXutil.writeLogRaw("Current: ",T012U2_A8788Etx_FecP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8789Etx_FecEnt), GXutil.resetTime(T012U2_A8789Etx_FecEnt[0])) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FecEnt");
               GXutil.writeLogRaw("Old: ",Z8789Etx_FecEnt);
               GXutil.writeLogRaw("Current: ",T012U2_A8789Etx_FecEnt[0]);
            }
            if ( GXutil.strcmp(Z8790Etx_Coord, T012U2_A8790Etx_Coord[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Coord");
               GXutil.writeLogRaw("Old: ",Z8790Etx_Coord);
               GXutil.writeLogRaw("Current: ",T012U2_A8790Etx_Coord[0]);
            }
            if ( GXutil.strcmp(Z8791Etx_Reemp, T012U2_A8791Etx_Reemp[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Reemp");
               GXutil.writeLogRaw("Old: ",Z8791Etx_Reemp);
               GXutil.writeLogRaw("Current: ",T012U2_A8791Etx_Reemp[0]);
            }
            if ( GXutil.strcmp(Z8792Etx_idprog, T012U2_A8792Etx_idprog[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_idprog");
               GXutil.writeLogRaw("Old: ",Z8792Etx_idprog);
               GXutil.writeLogRaw("Current: ",T012U2_A8792Etx_idprog[0]);
            }
            if ( GXutil.strcmp(Z8793Etx_Nmprog, T012U2_A8793Etx_Nmprog[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Nmprog");
               GXutil.writeLogRaw("Old: ",Z8793Etx_Nmprog);
               GXutil.writeLogRaw("Current: ",T012U2_A8793Etx_Nmprog[0]);
            }
            if ( GXutil.strcmp(Z8794Etx_Claspe, T012U2_A8794Etx_Claspe[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Claspe");
               GXutil.writeLogRaw("Old: ",Z8794Etx_Claspe);
               GXutil.writeLogRaw("Current: ",T012U2_A8794Etx_Claspe[0]);
            }
            if ( GXutil.strcmp(Z8795Etx_NmClas, T012U2_A8795Etx_NmClas[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_NmClas");
               GXutil.writeLogRaw("Old: ",Z8795Etx_NmClas);
               GXutil.writeLogRaw("Current: ",T012U2_A8795Etx_NmClas[0]);
            }
            if ( GXutil.strcmp(Z8796Etx_Id, T012U2_A8796Etx_Id[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Id");
               GXutil.writeLogRaw("Old: ",Z8796Etx_Id);
               GXutil.writeLogRaw("Current: ",T012U2_A8796Etx_Id[0]);
            }
            if ( GXutil.strcmp(Z8797Etx_NmId, T012U2_A8797Etx_NmId[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_NmId");
               GXutil.writeLogRaw("Old: ",Z8797Etx_NmId);
               GXutil.writeLogRaw("Current: ",T012U2_A8797Etx_NmId[0]);
            }
            if ( GXutil.strcmp(Z8798Etx_Agente, T012U2_A8798Etx_Agente[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Agente");
               GXutil.writeLogRaw("Old: ",Z8798Etx_Agente);
               GXutil.writeLogRaw("Current: ",T012U2_A8798Etx_Agente[0]);
            }
            if ( GXutil.strcmp(Z8799Etx_NmAgen, T012U2_A8799Etx_NmAgen[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_NmAgen");
               GXutil.writeLogRaw("Old: ",Z8799Etx_NmAgen);
               GXutil.writeLogRaw("Current: ",T012U2_A8799Etx_NmAgen[0]);
            }
            if ( Z8800Etx_GruFam != T012U2_A8800Etx_GruFam[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_GruFam");
               GXutil.writeLogRaw("Old: ",Z8800Etx_GruFam);
               GXutil.writeLogRaw("Current: ",T012U2_A8800Etx_GruFam[0]);
            }
            if ( GXutil.strcmp(Z8801Etx_TipAge, T012U2_A8801Etx_TipAge[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_TipAge");
               GXutil.writeLogRaw("Old: ",Z8801Etx_TipAge);
               GXutil.writeLogRaw("Current: ",T012U2_A8801Etx_TipAge[0]);
            }
            if ( GXutil.strcmp(Z8802Etx_TipPlt, T012U2_A8802Etx_TipPlt[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_TipPlt");
               GXutil.writeLogRaw("Old: ",Z8802Etx_TipPlt);
               GXutil.writeLogRaw("Current: ",T012U2_A8802Etx_TipPlt[0]);
            }
            if ( GXutil.strcmp(Z8803Etx_ObsPed, T012U2_A8803Etx_ObsPed[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_ObsPed");
               GXutil.writeLogRaw("Old: ",Z8803Etx_ObsPed);
               GXutil.writeLogRaw("Current: ",T012U2_A8803Etx_ObsPed[0]);
            }
            if ( GXutil.strcmp(Z8804Etx_ObsTej, T012U2_A8804Etx_ObsTej[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_ObsTej");
               GXutil.writeLogRaw("Old: ",Z8804Etx_ObsTej);
               GXutil.writeLogRaw("Current: ",T012U2_A8804Etx_ObsTej[0]);
            }
            if ( Z8805Etx_Est != T012U2_A8805Etx_Est[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Est");
               GXutil.writeLogRaw("Old: ",Z8805Etx_Est);
               GXutil.writeLogRaw("Current: ",T012U2_A8805Etx_Est[0]);
            }
            if ( Z8806Etx_Ests != T012U2_A8806Etx_Ests[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Ests");
               GXutil.writeLogRaw("Old: ",Z8806Etx_Ests);
               GXutil.writeLogRaw("Current: ",T012U2_A8806Etx_Ests[0]);
            }
            if ( GXutil.strcmp(Z8829Etx_CiroTr, T012U2_A8829Etx_CiroTr[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_CiroTr");
               GXutil.writeLogRaw("Old: ",Z8829Etx_CiroTr);
               GXutil.writeLogRaw("Current: ",T012U2_A8829Etx_CiroTr[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8870Etx_FCompT), GXutil.resetTime(T012U2_A8870Etx_FCompT[0])) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FCompT");
               GXutil.writeLogRaw("Old: ",Z8870Etx_FCompT);
               GXutil.writeLogRaw("Current: ",T012U2_A8870Etx_FCompT[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8871Etx_FCompO), GXutil.resetTime(T012U2_A8871Etx_FCompO[0])) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FCompO");
               GXutil.writeLogRaw("Old: ",Z8871Etx_FCompO);
               GXutil.writeLogRaw("Current: ",T012U2_A8871Etx_FCompO[0]);
            }
            if ( GXutil.strcmp(Z8872Etx_Prog, T012U2_A8872Etx_Prog[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Prog");
               GXutil.writeLogRaw("Old: ",Z8872Etx_Prog);
               GXutil.writeLogRaw("Current: ",T012U2_A8872Etx_Prog[0]);
            }
            if ( !( GXutil.dateCompare(Z8873Etx_FPedCB, T012U2_A8873Etx_FPedCB[0]) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FPedCB");
               GXutil.writeLogRaw("Old: ",Z8873Etx_FPedCB);
               GXutil.writeLogRaw("Current: ",T012U2_A8873Etx_FPedCB[0]);
            }
            if ( GXutil.strcmp(Z8874Etx_UsuCBE, T012U2_A8874Etx_UsuCBE[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_UsuCBE");
               GXutil.writeLogRaw("Old: ",Z8874Etx_UsuCBE);
               GXutil.writeLogRaw("Current: ",T012U2_A8874Etx_UsuCBE[0]);
            }
            if ( GXutil.strcmp(Z8875Etx_CloTJ, T012U2_A8875Etx_CloTJ[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_CloTJ");
               GXutil.writeLogRaw("Old: ",Z8875Etx_CloTJ);
               GXutil.writeLogRaw("Current: ",T012U2_A8875Etx_CloTJ[0]);
            }
            if ( GXutil.strcmp(Z8876Etx_CloES, T012U2_A8876Etx_CloES[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_CloES");
               GXutil.writeLogRaw("Old: ",Z8876Etx_CloES);
               GXutil.writeLogRaw("Current: ",T012U2_A8876Etx_CloES[0]);
            }
            if ( GXutil.strcmp(Z8945Etx_Muestr, T012U2_A8945Etx_Muestr[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Muestr");
               GXutil.writeLogRaw("Old: ",Z8945Etx_Muestr);
               GXutil.writeLogRaw("Current: ",T012U2_A8945Etx_Muestr[0]);
            }
            if ( Z9394Etx_otoe != T012U2_A9394Etx_otoe[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_otoe");
               GXutil.writeLogRaw("Old: ",Z9394Etx_otoe);
               GXutil.writeLogRaw("Current: ",T012U2_A9394Etx_otoe[0]);
            }
            if ( GXutil.strcmp(Z9563Etx_usuC, T012U2_A9563Etx_usuC[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_usuC");
               GXutil.writeLogRaw("Old: ",Z9563Etx_usuC);
               GXutil.writeLogRaw("Current: ",T012U2_A9563Etx_usuC[0]);
            }
            if ( !( GXutil.dateCompare(Z9564Etx_DhC, T012U2_A9564Etx_DhC[0]) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_DhC");
               GXutil.writeLogRaw("Old: ",Z9564Etx_DhC);
               GXutil.writeLogRaw("Current: ",T012U2_A9564Etx_DhC[0]);
            }
            if ( GXutil.strcmp(Z9565Etx_item1, T012U2_A9565Etx_item1[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_item1");
               GXutil.writeLogRaw("Old: ",Z9565Etx_item1);
               GXutil.writeLogRaw("Current: ",T012U2_A9565Etx_item1[0]);
            }
            if ( GXutil.strcmp(Z9567Etx_item4, T012U2_A9567Etx_item4[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_item4");
               GXutil.writeLogRaw("Old: ",Z9567Etx_item4);
               GXutil.writeLogRaw("Current: ",T012U2_A9567Etx_item4[0]);
            }
            if ( GXutil.strcmp(Z9566Etx_item3, T012U2_A9566Etx_item3[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_item3");
               GXutil.writeLogRaw("Old: ",Z9566Etx_item3);
               GXutil.writeLogRaw("Current: ",T012U2_A9566Etx_item3[0]);
            }
            if ( GXutil.strcmp(Z9599Etx_DibCO, T012U2_A9599Etx_DibCO[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_DibCO");
               GXutil.writeLogRaw("Old: ",Z9599Etx_DibCO);
               GXutil.writeLogRaw("Current: ",T012U2_A9599Etx_DibCO[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9600Etx_FComOE), GXutil.resetTime(T012U2_A9600Etx_FComOE[0])) ) )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_FComOE");
               GXutil.writeLogRaw("Old: ",Z9600Etx_FComOE);
               GXutil.writeLogRaw("Current: ",T012U2_A9600Etx_FComOE[0]);
            }
            if ( GXutil.strcmp(Z9601Etx_usuCOE, T012U2_A9601Etx_usuCOE[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_usuCOE");
               GXutil.writeLogRaw("Old: ",Z9601Etx_usuCOE);
               GXutil.writeLogRaw("Current: ",T012U2_A9601Etx_usuCOE[0]);
            }
            if ( Z12207Etx_EstV != T012U2_A12207Etx_EstV[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_EstV");
               GXutil.writeLogRaw("Old: ",Z12207Etx_EstV);
               GXutil.writeLogRaw("Current: ",T012U2_A12207Etx_EstV[0]);
            }
            if ( GXutil.strcmp(Z12958Etx_Inv, T012U2_A12958Etx_Inv[0]) != 0 )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"Etx_Inv");
               GXutil.writeLogRaw("Old: ",Z12958Etx_Inv);
               GXutil.writeLogRaw("Current: ",T012U2_A12958Etx_Inv[0]);
            }
            if ( Z252CliCod != T012U2_A252CliCod[0] )
            {
               GXutil.writeLogln("tcpdetx:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T012U2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPDETX"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12U1198( )
   {
      beforeValidate12U1198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12U1198( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12U1198( 0) ;
         checkOptimisticConcurrency12U1198( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12U1198( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12U1198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012U11 */
                  pr_default.execute(9, new Object[] {A8782Etx_Ped, A8783Etx_Dib, Boolean.valueOf(n8784Etx_Art), A8784Etx_Art, Boolean.valueOf(n8785Etx_Pro), A8785Etx_Pro, Boolean.valueOf(n8786Etx_DibI), Integer.valueOf(A8786Etx_DibI), Boolean.valueOf(n8787Etx_DibC), A8787Etx_DibC, Boolean.valueOf(n8788Etx_FecP), A8788Etx_FecP, Boolean.valueOf(n8789Etx_FecEnt), A8789Etx_FecEnt, Boolean.valueOf(n8790Etx_Coord), A8790Etx_Coord, Boolean.valueOf(n8791Etx_Reemp), A8791Etx_Reemp, Boolean.valueOf(n8792Etx_idprog), A8792Etx_idprog, Boolean.valueOf(n8793Etx_Nmprog), A8793Etx_Nmprog, Boolean.valueOf(n8794Etx_Claspe), A8794Etx_Claspe, Boolean.valueOf(n8795Etx_NmClas), A8795Etx_NmClas, Boolean.valueOf(n8796Etx_Id), A8796Etx_Id, Boolean.valueOf(n8797Etx_NmId), A8797Etx_NmId, Boolean.valueOf(n8798Etx_Agente), A8798Etx_Agente, Boolean.valueOf(n8799Etx_NmAgen), A8799Etx_NmAgen, Boolean.valueOf(n8800Etx_GruFam), Short.valueOf(A8800Etx_GruFam), Boolean.valueOf(n8801Etx_TipAge), A8801Etx_TipAge, Boolean.valueOf(n8802Etx_TipPlt), A8802Etx_TipPlt, Boolean.valueOf(n8803Etx_ObsPed), A8803Etx_ObsPed, Boolean.valueOf(n8804Etx_ObsTej), A8804Etx_ObsTej, Boolean.valueOf(n8805Etx_Est), Byte.valueOf(A8805Etx_Est), Boolean.valueOf(n8806Etx_Ests), Byte.valueOf(A8806Etx_Ests), Boolean.valueOf(n8829Etx_CiroTr), A8829Etx_CiroTr, Boolean.valueOf(n8870Etx_FCompT), A8870Etx_FCompT, Boolean.valueOf(n8871Etx_FCompO), A8871Etx_FCompO, Boolean.valueOf(n8872Etx_Prog), A8872Etx_Prog, Boolean.valueOf(n8873Etx_FPedCB), A8873Etx_FPedCB, Boolean.valueOf(n8874Etx_UsuCBE), A8874Etx_UsuCBE, Boolean.valueOf(n8875Etx_CloTJ), A8875Etx_CloTJ, Boolean.valueOf(n8876Etx_CloES), A8876Etx_CloES, Boolean.valueOf(n8945Etx_Muestr), A8945Etx_Muestr, Boolean.valueOf(n9394Etx_otoe), Byte.valueOf(A9394Etx_otoe), Boolean.valueOf(n9563Etx_usuC), A9563Etx_usuC, Boolean.valueOf(n9564Etx_DhC), A9564Etx_DhC, Boolean.valueOf(n9565Etx_item1), A9565Etx_item1, Boolean.valueOf(n9567Etx_item4), A9567Etx_item4, Boolean.valueOf(n9566Etx_item3), A9566Etx_item3, Boolean.valueOf(n9599Etx_DibCO), A9599Etx_DibCO, Boolean.valueOf(n9600Etx_FComOE), A9600Etx_FComOE, Boolean.valueOf(n9601Etx_usuCOE), A9601Etx_usuCOE, Boolean.valueOf(n12207Etx_EstV), Byte.valueOf(A12207Etx_EstV), Boolean.valueOf(n12958Etx_Inv), A12958Etx_Inv, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPDETX");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption12U0( ) ;
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
            load12U1198( ) ;
         }
         endLevel12U1198( ) ;
      }
      closeExtendedTableCursors12U1198( ) ;
   }

   public void update12U1198( )
   {
      beforeValidate12U1198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12U1198( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12U1198( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12U1198( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12U1198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012U12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n8784Etx_Art), A8784Etx_Art, Boolean.valueOf(n8785Etx_Pro), A8785Etx_Pro, Boolean.valueOf(n8786Etx_DibI), Integer.valueOf(A8786Etx_DibI), Boolean.valueOf(n8787Etx_DibC), A8787Etx_DibC, Boolean.valueOf(n8788Etx_FecP), A8788Etx_FecP, Boolean.valueOf(n8789Etx_FecEnt), A8789Etx_FecEnt, Boolean.valueOf(n8790Etx_Coord), A8790Etx_Coord, Boolean.valueOf(n8791Etx_Reemp), A8791Etx_Reemp, Boolean.valueOf(n8792Etx_idprog), A8792Etx_idprog, Boolean.valueOf(n8793Etx_Nmprog), A8793Etx_Nmprog, Boolean.valueOf(n8794Etx_Claspe), A8794Etx_Claspe, Boolean.valueOf(n8795Etx_NmClas), A8795Etx_NmClas, Boolean.valueOf(n8796Etx_Id), A8796Etx_Id, Boolean.valueOf(n8797Etx_NmId), A8797Etx_NmId, Boolean.valueOf(n8798Etx_Agente), A8798Etx_Agente, Boolean.valueOf(n8799Etx_NmAgen), A8799Etx_NmAgen, Boolean.valueOf(n8800Etx_GruFam), Short.valueOf(A8800Etx_GruFam), Boolean.valueOf(n8801Etx_TipAge), A8801Etx_TipAge, Boolean.valueOf(n8802Etx_TipPlt), A8802Etx_TipPlt, Boolean.valueOf(n8803Etx_ObsPed), A8803Etx_ObsPed, Boolean.valueOf(n8804Etx_ObsTej), A8804Etx_ObsTej, Boolean.valueOf(n8805Etx_Est), Byte.valueOf(A8805Etx_Est), Boolean.valueOf(n8806Etx_Ests), Byte.valueOf(A8806Etx_Ests), Boolean.valueOf(n8829Etx_CiroTr), A8829Etx_CiroTr, Boolean.valueOf(n8870Etx_FCompT), A8870Etx_FCompT, Boolean.valueOf(n8871Etx_FCompO), A8871Etx_FCompO, Boolean.valueOf(n8872Etx_Prog), A8872Etx_Prog, Boolean.valueOf(n8873Etx_FPedCB), A8873Etx_FPedCB, Boolean.valueOf(n8874Etx_UsuCBE), A8874Etx_UsuCBE, Boolean.valueOf(n8875Etx_CloTJ), A8875Etx_CloTJ, Boolean.valueOf(n8876Etx_CloES), A8876Etx_CloES, Boolean.valueOf(n8945Etx_Muestr), A8945Etx_Muestr, Boolean.valueOf(n9394Etx_otoe), Byte.valueOf(A9394Etx_otoe), Boolean.valueOf(n9563Etx_usuC), A9563Etx_usuC, Boolean.valueOf(n9564Etx_DhC), A9564Etx_DhC, Boolean.valueOf(n9565Etx_item1), A9565Etx_item1, Boolean.valueOf(n9567Etx_item4), A9567Etx_item4, Boolean.valueOf(n9566Etx_item3), A9566Etx_item3, Boolean.valueOf(n9599Etx_DibCO), A9599Etx_DibCO, Boolean.valueOf(n9600Etx_FComOE), A9600Etx_FComOE, Boolean.valueOf(n9601Etx_usuCOE), A9601Etx_usuCOE, Boolean.valueOf(n12207Etx_EstV), Byte.valueOf(A12207Etx_EstV), Boolean.valueOf(n12958Etx_Inv), A12958Etx_Inv, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPDETX");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPDETX"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12U1198( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption12U0( ) ;
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
         endLevel12U1198( ) ;
      }
      closeExtendedTableCursors12U1198( ) ;
   }

   public void deferredUpdate12U1198( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12U1198( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12U1198( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12U1198( ) ;
         afterConfirm12U1198( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12U1198( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012U13 */
               pr_default.execute(11, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPDETX");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1198 == 0 )
                     {
                        initAll12U1198( ) ;
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
                     resetCaption12U0( ) ;
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
      sMode1198 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel12U1198( ) ;
      Gx_mode = sMode1198 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12U1198( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T012U14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T012U14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012U15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HPDETX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T012U16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PPDETX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T012U17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A8782Etx_Ped, A8783Etx_Dib});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPDETX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel12U1198( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12U1198( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcpdetx");
         if ( AnyError == 0 )
         {
            confirmValues12U0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcpdetx");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12U1198( )
   {
      /* Scan By routine */
      /* Using cursor T012U18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1198 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1198 = (short)(1) ;
         A8782Etx_Ped = T012U18_A8782Etx_Ped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
         A8783Etx_Dib = T012U18_A8783Etx_Dib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12U1198( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1198 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1198 = (short)(1) ;
         A8782Etx_Ped = T012U18_A8782Etx_Ped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
         A8783Etx_Dib = T012U18_A8783Etx_Dib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
      }
   }

   public void scanEnd12U1198( )
   {
      pr_default.close(16);
   }

   public void afterConfirm12U1198( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12U1198( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12U1198( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12U1198( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12U1198( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12U1198( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12U1198( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEtx_Ped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Ped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Ped_Enabled), 5, 0), true);
      edtEtx_Dib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Dib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Dib_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEtx_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Art_Enabled), 5, 0), true);
      edtEtx_Pro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Pro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Pro_Enabled), 5, 0), true);
      edtEtx_DibI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_DibI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_DibI_Enabled), 5, 0), true);
      edtEtx_DibC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_DibC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_DibC_Enabled), 5, 0), true);
      edtEtx_FecP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FecP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FecP_Enabled), 5, 0), true);
      edtEtx_FecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FecEnt_Enabled), 5, 0), true);
      edtEtx_Coord_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Coord_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Coord_Enabled), 5, 0), true);
      edtEtx_Reemp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Reemp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Reemp_Enabled), 5, 0), true);
      edtEtx_idprog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_idprog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_idprog_Enabled), 5, 0), true);
      edtEtx_Nmprog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Nmprog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Nmprog_Enabled), 5, 0), true);
      edtEtx_Claspe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Claspe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Claspe_Enabled), 5, 0), true);
      edtEtx_NmClas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_NmClas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_NmClas_Enabled), 5, 0), true);
      edtEtx_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Id_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Id_Enabled), 5, 0), true);
      edtEtx_NmId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_NmId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_NmId_Enabled), 5, 0), true);
      edtEtx_Agente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Agente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Agente_Enabled), 5, 0), true);
      edtEtx_NmAgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_NmAgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_NmAgen_Enabled), 5, 0), true);
      edtEtx_GruFam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_GruFam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_GruFam_Enabled), 5, 0), true);
      edtEtx_TipAge_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_TipAge_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_TipAge_Enabled), 5, 0), true);
      edtEtx_TipPlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_TipPlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_TipPlt_Enabled), 5, 0), true);
      edtEtx_ObsPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_ObsPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_ObsPed_Enabled), 5, 0), true);
      edtEtx_ObsTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_ObsTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_ObsTej_Enabled), 5, 0), true);
      edtEtx_Est_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Est_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Est_Enabled), 5, 0), true);
      edtEtx_Ests_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Ests_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Ests_Enabled), 5, 0), true);
      edtEtx_CiroTr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_CiroTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_CiroTr_Enabled), 5, 0), true);
      edtEtx_FCompT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FCompT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FCompT_Enabled), 5, 0), true);
      edtEtx_FCompO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FCompO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FCompO_Enabled), 5, 0), true);
      edtEtx_Prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Prog_Enabled), 5, 0), true);
      edtEtx_FPedCB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FPedCB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FPedCB_Enabled), 5, 0), true);
      edtEtx_UsuCBE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_UsuCBE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_UsuCBE_Enabled), 5, 0), true);
      edtEtx_CloTJ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_CloTJ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_CloTJ_Enabled), 5, 0), true);
      edtEtx_CloES_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_CloES_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_CloES_Enabled), 5, 0), true);
      edtEtx_Muestr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Muestr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Muestr_Enabled), 5, 0), true);
      edtEtx_otoe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_otoe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_otoe_Enabled), 5, 0), true);
      edtEtx_usuC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_usuC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_usuC_Enabled), 5, 0), true);
      edtEtx_DhC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_DhC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_DhC_Enabled), 5, 0), true);
      edtEtx_item1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_item1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_item1_Enabled), 5, 0), true);
      edtEtx_item4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_item4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_item4_Enabled), 5, 0), true);
      edtEtx_item3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_item3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_item3_Enabled), 5, 0), true);
      edtEtx_DibCO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_DibCO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_DibCO_Enabled), 5, 0), true);
      edtEtx_FComOE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_FComOE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_FComOE_Enabled), 5, 0), true);
      edtEtx_usuCOE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_usuCOE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_usuCOE_Enabled), 5, 0), true);
      edtEtx_EstV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_EstV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_EstV_Enabled), 5, 0), true);
      edtEtx_Inv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEtx_Inv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEtx_Inv_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes12U1198( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues12U0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcpdetx", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8782Etx_Ped", GXutil.rtrim( Z8782Etx_Ped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8783Etx_Dib", GXutil.rtrim( Z8783Etx_Dib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8784Etx_Art", GXutil.rtrim( Z8784Etx_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8785Etx_Pro", GXutil.rtrim( Z8785Etx_Pro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8786Etx_DibI", GXutil.ltrim( localUtil.ntoc( Z8786Etx_DibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8787Etx_DibC", GXutil.rtrim( Z8787Etx_DibC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8788Etx_FecP", localUtil.dtoc( Z8788Etx_FecP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8789Etx_FecEnt", localUtil.dtoc( Z8789Etx_FecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8790Etx_Coord", GXutil.rtrim( Z8790Etx_Coord));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8791Etx_Reemp", GXutil.rtrim( Z8791Etx_Reemp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8792Etx_idprog", GXutil.rtrim( Z8792Etx_idprog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8793Etx_Nmprog", GXutil.rtrim( Z8793Etx_Nmprog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8794Etx_Claspe", GXutil.rtrim( Z8794Etx_Claspe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8795Etx_NmClas", GXutil.rtrim( Z8795Etx_NmClas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8796Etx_Id", GXutil.rtrim( Z8796Etx_Id));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8797Etx_NmId", GXutil.rtrim( Z8797Etx_NmId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8798Etx_Agente", GXutil.rtrim( Z8798Etx_Agente));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8799Etx_NmAgen", GXutil.rtrim( Z8799Etx_NmAgen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8800Etx_GruFam", GXutil.ltrim( localUtil.ntoc( Z8800Etx_GruFam, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8801Etx_TipAge", GXutil.rtrim( Z8801Etx_TipAge));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8802Etx_TipPlt", GXutil.rtrim( Z8802Etx_TipPlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8803Etx_ObsPed", Z8803Etx_ObsPed);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8804Etx_ObsTej", Z8804Etx_ObsTej);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8805Etx_Est", GXutil.ltrim( localUtil.ntoc( Z8805Etx_Est, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8806Etx_Ests", GXutil.ltrim( localUtil.ntoc( Z8806Etx_Ests, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8829Etx_CiroTr", GXutil.rtrim( Z8829Etx_CiroTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8870Etx_FCompT", localUtil.dtoc( Z8870Etx_FCompT, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8871Etx_FCompO", localUtil.dtoc( Z8871Etx_FCompO, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8872Etx_Prog", GXutil.rtrim( Z8872Etx_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8873Etx_FPedCB", localUtil.ttoc( Z8873Etx_FPedCB, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8874Etx_UsuCBE", GXutil.rtrim( Z8874Etx_UsuCBE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8875Etx_CloTJ", GXutil.rtrim( Z8875Etx_CloTJ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8876Etx_CloES", GXutil.rtrim( Z8876Etx_CloES));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8945Etx_Muestr", GXutil.rtrim( Z8945Etx_Muestr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9394Etx_otoe", GXutil.ltrim( localUtil.ntoc( Z9394Etx_otoe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9563Etx_usuC", GXutil.rtrim( Z9563Etx_usuC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9564Etx_DhC", localUtil.ttoc( Z9564Etx_DhC, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9565Etx_item1", GXutil.rtrim( Z9565Etx_item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9567Etx_item4", GXutil.rtrim( Z9567Etx_item4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9566Etx_item3", GXutil.rtrim( Z9566Etx_item3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9599Etx_DibCO", GXutil.rtrim( Z9599Etx_DibCO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9600Etx_FComOE", localUtil.dtoc( Z9600Etx_FComOE, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9601Etx_usuCOE", GXutil.rtrim( Z9601Etx_usuCOE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12207Etx_EstV", GXutil.ltrim( localUtil.ntoc( Z12207Etx_EstV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12958Etx_Inv", GXutil.rtrim( Z12958Etx_Inv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcpdetx", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCPDETX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CABECERA PEDIDOS", "") ;
   }

   public void initializeNonKey12U1198( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8784Etx_Art = "" ;
      n8784Etx_Art = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8784Etx_Art", A8784Etx_Art);
      A8785Etx_Pro = "" ;
      n8785Etx_Pro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8785Etx_Pro", A8785Etx_Pro);
      A8786Etx_DibI = 0 ;
      n8786Etx_DibI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8786Etx_DibI), 8, 0));
      A8787Etx_DibC = "" ;
      n8787Etx_DibC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8787Etx_DibC", A8787Etx_DibC);
      A8788Etx_FecP = GXutil.nullDate() ;
      n8788Etx_FecP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
      A8789Etx_FecEnt = GXutil.nullDate() ;
      n8789Etx_FecEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
      A8790Etx_Coord = "" ;
      n8790Etx_Coord = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8790Etx_Coord", A8790Etx_Coord);
      A8791Etx_Reemp = "" ;
      n8791Etx_Reemp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8791Etx_Reemp", A8791Etx_Reemp);
      A8792Etx_idprog = "" ;
      n8792Etx_idprog = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8792Etx_idprog", A8792Etx_idprog);
      A8793Etx_Nmprog = "" ;
      n8793Etx_Nmprog = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8793Etx_Nmprog", A8793Etx_Nmprog);
      A8794Etx_Claspe = "" ;
      n8794Etx_Claspe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8794Etx_Claspe", A8794Etx_Claspe);
      A8795Etx_NmClas = "" ;
      n8795Etx_NmClas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8795Etx_NmClas", A8795Etx_NmClas);
      A8796Etx_Id = "" ;
      n8796Etx_Id = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8796Etx_Id", A8796Etx_Id);
      A8797Etx_NmId = "" ;
      n8797Etx_NmId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8797Etx_NmId", A8797Etx_NmId);
      A8798Etx_Agente = "" ;
      n8798Etx_Agente = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8798Etx_Agente", A8798Etx_Agente);
      A8799Etx_NmAgen = "" ;
      n8799Etx_NmAgen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8799Etx_NmAgen", A8799Etx_NmAgen);
      A8800Etx_GruFam = (short)(0) ;
      n8800Etx_GruFam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8800Etx_GruFam), 4, 0));
      A8801Etx_TipAge = "" ;
      n8801Etx_TipAge = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8801Etx_TipAge", A8801Etx_TipAge);
      A8802Etx_TipPlt = "" ;
      n8802Etx_TipPlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8802Etx_TipPlt", A8802Etx_TipPlt);
      A8803Etx_ObsPed = "" ;
      n8803Etx_ObsPed = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8803Etx_ObsPed", A8803Etx_ObsPed);
      A8804Etx_ObsTej = "" ;
      n8804Etx_ObsTej = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8804Etx_ObsTej", A8804Etx_ObsTej);
      A8805Etx_Est = (byte)(0) ;
      n8805Etx_Est = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.str( A8805Etx_Est, 1, 0));
      A8806Etx_Ests = (byte)(0) ;
      n8806Etx_Ests = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.str( A8806Etx_Ests, 1, 0));
      A8829Etx_CiroTr = "" ;
      n8829Etx_CiroTr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8829Etx_CiroTr", A8829Etx_CiroTr);
      A8870Etx_FCompT = GXutil.nullDate() ;
      n8870Etx_FCompT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
      A8871Etx_FCompO = GXutil.nullDate() ;
      n8871Etx_FCompO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
      A8872Etx_Prog = "" ;
      n8872Etx_Prog = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8872Etx_Prog", A8872Etx_Prog);
      A8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
      n8873Etx_FPedCB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8874Etx_UsuCBE = "" ;
      n8874Etx_UsuCBE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8874Etx_UsuCBE", A8874Etx_UsuCBE);
      A8875Etx_CloTJ = "" ;
      n8875Etx_CloTJ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8875Etx_CloTJ", A8875Etx_CloTJ);
      A8876Etx_CloES = "" ;
      n8876Etx_CloES = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8876Etx_CloES", A8876Etx_CloES);
      A8945Etx_Muestr = "" ;
      n8945Etx_Muestr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8945Etx_Muestr", A8945Etx_Muestr);
      A9394Etx_otoe = (byte)(0) ;
      n9394Etx_otoe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.str( A9394Etx_otoe, 1, 0));
      A9563Etx_usuC = "" ;
      n9563Etx_usuC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9563Etx_usuC", A9563Etx_usuC);
      A9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
      n9564Etx_DhC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9565Etx_item1 = "" ;
      n9565Etx_item1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9565Etx_item1", A9565Etx_item1);
      A9567Etx_item4 = "" ;
      n9567Etx_item4 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9567Etx_item4", A9567Etx_item4);
      A9566Etx_item3 = "" ;
      n9566Etx_item3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9566Etx_item3", A9566Etx_item3);
      A9599Etx_DibCO = "" ;
      n9599Etx_DibCO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9599Etx_DibCO", A9599Etx_DibCO);
      A9600Etx_FComOE = GXutil.nullDate() ;
      n9600Etx_FComOE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
      A9601Etx_usuCOE = "" ;
      n9601Etx_usuCOE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9601Etx_usuCOE", A9601Etx_usuCOE);
      A12207Etx_EstV = (byte)(0) ;
      n12207Etx_EstV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.str( A12207Etx_EstV, 1, 0));
      A12958Etx_Inv = "" ;
      n12958Etx_Inv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12958Etx_Inv", A12958Etx_Inv);
      Z8784Etx_Art = "" ;
      Z8785Etx_Pro = "" ;
      Z8786Etx_DibI = 0 ;
      Z8787Etx_DibC = "" ;
      Z8788Etx_FecP = GXutil.nullDate() ;
      Z8789Etx_FecEnt = GXutil.nullDate() ;
      Z8790Etx_Coord = "" ;
      Z8791Etx_Reemp = "" ;
      Z8792Etx_idprog = "" ;
      Z8793Etx_Nmprog = "" ;
      Z8794Etx_Claspe = "" ;
      Z8795Etx_NmClas = "" ;
      Z8796Etx_Id = "" ;
      Z8797Etx_NmId = "" ;
      Z8798Etx_Agente = "" ;
      Z8799Etx_NmAgen = "" ;
      Z8800Etx_GruFam = (short)(0) ;
      Z8801Etx_TipAge = "" ;
      Z8802Etx_TipPlt = "" ;
      Z8803Etx_ObsPed = "" ;
      Z8804Etx_ObsTej = "" ;
      Z8805Etx_Est = (byte)(0) ;
      Z8806Etx_Ests = (byte)(0) ;
      Z8829Etx_CiroTr = "" ;
      Z8870Etx_FCompT = GXutil.nullDate() ;
      Z8871Etx_FCompO = GXutil.nullDate() ;
      Z8872Etx_Prog = "" ;
      Z8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
      Z8874Etx_UsuCBE = "" ;
      Z8875Etx_CloTJ = "" ;
      Z8876Etx_CloES = "" ;
      Z8945Etx_Muestr = "" ;
      Z9394Etx_otoe = (byte)(0) ;
      Z9563Etx_usuC = "" ;
      Z9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
      Z9565Etx_item1 = "" ;
      Z9567Etx_item4 = "" ;
      Z9566Etx_item3 = "" ;
      Z9599Etx_DibCO = "" ;
      Z9600Etx_FComOE = GXutil.nullDate() ;
      Z9601Etx_usuCOE = "" ;
      Z12207Etx_EstV = (byte)(0) ;
      Z12958Etx_Inv = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll12U1198( )
   {
      A8782Etx_Ped = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8782Etx_Ped", A8782Etx_Ped);
      A8783Etx_Dib = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8783Etx_Dib", A8783Etx_Dib);
      initializeNonKey12U1198( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241535740", true, true);
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
      httpContext.AddJavascriptSource("tcpdetx.js", "?20268241535741", false, true);
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
      edtEtx_Ped_Internalname = "ETX_PED" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEtx_Dib_Internalname = "ETX_DIB" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEtx_Art_Internalname = "ETX_ART" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEtx_Pro_Internalname = "ETX_PRO" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEtx_DibI_Internalname = "ETX_DIBI" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEtx_DibC_Internalname = "ETX_DIBC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEtx_FecP_Internalname = "ETX_FECP" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEtx_FecEnt_Internalname = "ETX_FECENT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEtx_Coord_Internalname = "ETX_COORD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEtx_Reemp_Internalname = "ETX_REEMP" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEtx_idprog_Internalname = "ETX_IDPROG" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEtx_Nmprog_Internalname = "ETX_NMPROG" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtEtx_Claspe_Internalname = "ETX_CLASPE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEtx_NmClas_Internalname = "ETX_NMCLAS" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtEtx_Id_Internalname = "ETX_ID" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtEtx_NmId_Internalname = "ETX_NMID" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtEtx_Agente_Internalname = "ETX_AGENTE" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtEtx_NmAgen_Internalname = "ETX_NMAGEN" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtEtx_GruFam_Internalname = "ETX_GRUFAM" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtEtx_TipAge_Internalname = "ETX_TIPAGE" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtEtx_TipPlt_Internalname = "ETX_TIPPLT" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtEtx_ObsPed_Internalname = "ETX_OBSPED" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtEtx_ObsTej_Internalname = "ETX_OBSTEJ" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtEtx_Est_Internalname = "ETX_EST" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtEtx_Ests_Internalname = "ETX_ESTS" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtEtx_CiroTr_Internalname = "ETX_CIROTR" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtEtx_FCompT_Internalname = "ETX_FCOMPT" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtEtx_FCompO_Internalname = "ETX_FCOMPO" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtEtx_Prog_Internalname = "ETX_PROG" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtEtx_FPedCB_Internalname = "ETX_FPEDCB" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtEtx_UsuCBE_Internalname = "ETX_USUCBE" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtEtx_CloTJ_Internalname = "ETX_CLOTJ" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtEtx_CloES_Internalname = "ETX_CLOES" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtEtx_Muestr_Internalname = "ETX_MUESTR" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtEtx_otoe_Internalname = "ETX_OTOE" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtEtx_usuC_Internalname = "ETX_USUC" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtEtx_DhC_Internalname = "ETX_DHC" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtEtx_item1_Internalname = "ETX_ITEM1" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtEtx_item4_Internalname = "ETX_ITEM4" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtEtx_item3_Internalname = "ETX_ITEM3" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtEtx_DibCO_Internalname = "ETX_DIBCO" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtEtx_FComOE_Internalname = "ETX_FCOMOE" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtEtx_usuCOE_Internalname = "ETX_USUCOE" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtEtx_EstV_Internalname = "ETX_ESTV" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtEtx_Inv_Internalname = "ETX_INV" ;
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
      Form.setCaption( httpContext.getMessage( "CABECERA PEDIDOS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEtx_Inv_Jsonclick = "" ;
      edtEtx_Inv_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Inv_Enabled = 1 ;
      edtEtx_EstV_Jsonclick = "" ;
      edtEtx_EstV_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_EstV_Enabled = 1 ;
      edtEtx_usuCOE_Jsonclick = "" ;
      edtEtx_usuCOE_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_usuCOE_Enabled = 1 ;
      edtEtx_FComOE_Jsonclick = "" ;
      edtEtx_FComOE_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FComOE_Enabled = 1 ;
      edtEtx_DibCO_Jsonclick = "" ;
      edtEtx_DibCO_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_DibCO_Enabled = 1 ;
      edtEtx_item3_Jsonclick = "" ;
      edtEtx_item3_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_item3_Enabled = 1 ;
      edtEtx_item4_Jsonclick = "" ;
      edtEtx_item4_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_item4_Enabled = 1 ;
      edtEtx_item1_Jsonclick = "" ;
      edtEtx_item1_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_item1_Enabled = 1 ;
      edtEtx_DhC_Jsonclick = "" ;
      edtEtx_DhC_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_DhC_Enabled = 1 ;
      edtEtx_usuC_Jsonclick = "" ;
      edtEtx_usuC_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_usuC_Enabled = 1 ;
      edtEtx_otoe_Jsonclick = "" ;
      edtEtx_otoe_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_otoe_Enabled = 1 ;
      edtEtx_Muestr_Jsonclick = "" ;
      edtEtx_Muestr_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Muestr_Enabled = 1 ;
      edtEtx_CloES_Jsonclick = "" ;
      edtEtx_CloES_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_CloES_Enabled = 1 ;
      edtEtx_CloTJ_Jsonclick = "" ;
      edtEtx_CloTJ_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_CloTJ_Enabled = 1 ;
      edtEtx_UsuCBE_Jsonclick = "" ;
      edtEtx_UsuCBE_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_UsuCBE_Enabled = 1 ;
      edtEtx_FPedCB_Jsonclick = "" ;
      edtEtx_FPedCB_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FPedCB_Enabled = 1 ;
      edtEtx_Prog_Jsonclick = "" ;
      edtEtx_Prog_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Prog_Enabled = 1 ;
      edtEtx_FCompO_Jsonclick = "" ;
      edtEtx_FCompO_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FCompO_Enabled = 1 ;
      edtEtx_FCompT_Jsonclick = "" ;
      edtEtx_FCompT_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FCompT_Enabled = 1 ;
      edtEtx_CiroTr_Jsonclick = "" ;
      edtEtx_CiroTr_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_CiroTr_Enabled = 1 ;
      edtEtx_Ests_Jsonclick = "" ;
      edtEtx_Ests_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Ests_Enabled = 1 ;
      edtEtx_Est_Jsonclick = "" ;
      edtEtx_Est_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Est_Enabled = 1 ;
      edtEtx_ObsTej_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_ObsTej_Enabled = 1 ;
      edtEtx_ObsPed_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_ObsPed_Enabled = 1 ;
      edtEtx_TipPlt_Jsonclick = "" ;
      edtEtx_TipPlt_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_TipPlt_Enabled = 1 ;
      edtEtx_TipAge_Jsonclick = "" ;
      edtEtx_TipAge_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_TipAge_Enabled = 1 ;
      edtEtx_GruFam_Jsonclick = "" ;
      edtEtx_GruFam_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_GruFam_Enabled = 1 ;
      edtEtx_NmAgen_Jsonclick = "" ;
      edtEtx_NmAgen_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_NmAgen_Enabled = 1 ;
      edtEtx_Agente_Jsonclick = "" ;
      edtEtx_Agente_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Agente_Enabled = 1 ;
      edtEtx_NmId_Jsonclick = "" ;
      edtEtx_NmId_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_NmId_Enabled = 1 ;
      edtEtx_Id_Jsonclick = "" ;
      edtEtx_Id_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Id_Enabled = 1 ;
      edtEtx_NmClas_Jsonclick = "" ;
      edtEtx_NmClas_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_NmClas_Enabled = 1 ;
      edtEtx_Claspe_Jsonclick = "" ;
      edtEtx_Claspe_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Claspe_Enabled = 1 ;
      edtEtx_Nmprog_Jsonclick = "" ;
      edtEtx_Nmprog_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Nmprog_Enabled = 1 ;
      edtEtx_idprog_Jsonclick = "" ;
      edtEtx_idprog_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_idprog_Enabled = 1 ;
      edtEtx_Reemp_Jsonclick = "" ;
      edtEtx_Reemp_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Reemp_Enabled = 1 ;
      edtEtx_Coord_Jsonclick = "" ;
      edtEtx_Coord_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Coord_Enabled = 1 ;
      edtEtx_FecEnt_Jsonclick = "" ;
      edtEtx_FecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FecEnt_Enabled = 1 ;
      edtEtx_FecP_Jsonclick = "" ;
      edtEtx_FecP_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_FecP_Enabled = 1 ;
      edtEtx_DibC_Jsonclick = "" ;
      edtEtx_DibC_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_DibC_Enabled = 1 ;
      edtEtx_DibI_Jsonclick = "" ;
      edtEtx_DibI_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_DibI_Enabled = 1 ;
      edtEtx_Pro_Jsonclick = "" ;
      edtEtx_Pro_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Pro_Enabled = 1 ;
      edtEtx_Art_Jsonclick = "" ;
      edtEtx_Art_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Art_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEtx_Dib_Jsonclick = "" ;
      edtEtx_Dib_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Dib_Enabled = 1 ;
      edtEtx_Ped_Jsonclick = "" ;
      edtEtx_Ped_Backcolor = (int)(0xFFFFFF) ;
      edtEtx_Ped_Enabled = 1 ;
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
      /* Using cursor T012U19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T012U19_A407EmprNom[0] ;
      n407EmprNom = T012U19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      GX_FocusControl = edtCliCod_Internalname ;
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

   public void valid_Etx_dib( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8784Etx_Art", GXutil.rtrim( A8784Etx_Art));
      httpContext.ajax_rsp_assign_attri("", false, "A8785Etx_Pro", GXutil.rtrim( A8785Etx_Pro));
      httpContext.ajax_rsp_assign_attri("", false, "A8786Etx_DibI", GXutil.ltrim( localUtil.ntoc( A8786Etx_DibI, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8787Etx_DibC", GXutil.rtrim( A8787Etx_DibC));
      httpContext.ajax_rsp_assign_attri("", false, "A8788Etx_FecP", localUtil.format(A8788Etx_FecP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8789Etx_FecEnt", localUtil.format(A8789Etx_FecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8790Etx_Coord", GXutil.rtrim( A8790Etx_Coord));
      httpContext.ajax_rsp_assign_attri("", false, "A8791Etx_Reemp", GXutil.rtrim( A8791Etx_Reemp));
      httpContext.ajax_rsp_assign_attri("", false, "A8792Etx_idprog", GXutil.rtrim( A8792Etx_idprog));
      httpContext.ajax_rsp_assign_attri("", false, "A8793Etx_Nmprog", GXutil.rtrim( A8793Etx_Nmprog));
      httpContext.ajax_rsp_assign_attri("", false, "A8794Etx_Claspe", GXutil.rtrim( A8794Etx_Claspe));
      httpContext.ajax_rsp_assign_attri("", false, "A8795Etx_NmClas", GXutil.rtrim( A8795Etx_NmClas));
      httpContext.ajax_rsp_assign_attri("", false, "A8796Etx_Id", GXutil.rtrim( A8796Etx_Id));
      httpContext.ajax_rsp_assign_attri("", false, "A8797Etx_NmId", GXutil.rtrim( A8797Etx_NmId));
      httpContext.ajax_rsp_assign_attri("", false, "A8798Etx_Agente", GXutil.rtrim( A8798Etx_Agente));
      httpContext.ajax_rsp_assign_attri("", false, "A8799Etx_NmAgen", GXutil.rtrim( A8799Etx_NmAgen));
      httpContext.ajax_rsp_assign_attri("", false, "A8800Etx_GruFam", GXutil.ltrim( localUtil.ntoc( A8800Etx_GruFam, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8801Etx_TipAge", GXutil.rtrim( A8801Etx_TipAge));
      httpContext.ajax_rsp_assign_attri("", false, "A8802Etx_TipPlt", GXutil.rtrim( A8802Etx_TipPlt));
      httpContext.ajax_rsp_assign_attri("", false, "A8803Etx_ObsPed", A8803Etx_ObsPed);
      httpContext.ajax_rsp_assign_attri("", false, "A8804Etx_ObsTej", A8804Etx_ObsTej);
      httpContext.ajax_rsp_assign_attri("", false, "A8805Etx_Est", GXutil.ltrim( localUtil.ntoc( A8805Etx_Est, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8806Etx_Ests", GXutil.ltrim( localUtil.ntoc( A8806Etx_Ests, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8829Etx_CiroTr", GXutil.rtrim( A8829Etx_CiroTr));
      httpContext.ajax_rsp_assign_attri("", false, "A8870Etx_FCompT", localUtil.format(A8870Etx_FCompT, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8871Etx_FCompO", localUtil.format(A8871Etx_FCompO, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8872Etx_Prog", GXutil.rtrim( A8872Etx_Prog));
      httpContext.ajax_rsp_assign_attri("", false, "A8873Etx_FPedCB", localUtil.ttoc( A8873Etx_FPedCB, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A8874Etx_UsuCBE", GXutil.rtrim( A8874Etx_UsuCBE));
      httpContext.ajax_rsp_assign_attri("", false, "A8875Etx_CloTJ", GXutil.rtrim( A8875Etx_CloTJ));
      httpContext.ajax_rsp_assign_attri("", false, "A8876Etx_CloES", GXutil.rtrim( A8876Etx_CloES));
      httpContext.ajax_rsp_assign_attri("", false, "A8945Etx_Muestr", GXutil.rtrim( A8945Etx_Muestr));
      httpContext.ajax_rsp_assign_attri("", false, "A9394Etx_otoe", GXutil.ltrim( localUtil.ntoc( A9394Etx_otoe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9563Etx_usuC", GXutil.rtrim( A9563Etx_usuC));
      httpContext.ajax_rsp_assign_attri("", false, "A9564Etx_DhC", localUtil.ttoc( A9564Etx_DhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9565Etx_item1", GXutil.rtrim( A9565Etx_item1));
      httpContext.ajax_rsp_assign_attri("", false, "A9567Etx_item4", GXutil.rtrim( A9567Etx_item4));
      httpContext.ajax_rsp_assign_attri("", false, "A9566Etx_item3", GXutil.rtrim( A9566Etx_item3));
      httpContext.ajax_rsp_assign_attri("", false, "A9599Etx_DibCO", GXutil.rtrim( A9599Etx_DibCO));
      httpContext.ajax_rsp_assign_attri("", false, "A9600Etx_FComOE", localUtil.format(A9600Etx_FComOE, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9601Etx_usuCOE", GXutil.rtrim( A9601Etx_usuCOE));
      httpContext.ajax_rsp_assign_attri("", false, "A12207Etx_EstV", GXutil.ltrim( localUtil.ntoc( A12207Etx_EstV, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12958Etx_Inv", GXutil.rtrim( A12958Etx_Inv));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8782Etx_Ped", GXutil.rtrim( Z8782Etx_Ped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8783Etx_Dib", GXutil.rtrim( Z8783Etx_Dib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8784Etx_Art", GXutil.rtrim( Z8784Etx_Art));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8785Etx_Pro", GXutil.rtrim( Z8785Etx_Pro));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8786Etx_DibI", GXutil.ltrim( localUtil.ntoc( Z8786Etx_DibI, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8787Etx_DibC", GXutil.rtrim( Z8787Etx_DibC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8788Etx_FecP", localUtil.format(Z8788Etx_FecP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8789Etx_FecEnt", localUtil.format(Z8789Etx_FecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8790Etx_Coord", GXutil.rtrim( Z8790Etx_Coord));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8791Etx_Reemp", GXutil.rtrim( Z8791Etx_Reemp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8792Etx_idprog", GXutil.rtrim( Z8792Etx_idprog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8793Etx_Nmprog", GXutil.rtrim( Z8793Etx_Nmprog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8794Etx_Claspe", GXutil.rtrim( Z8794Etx_Claspe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8795Etx_NmClas", GXutil.rtrim( Z8795Etx_NmClas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8796Etx_Id", GXutil.rtrim( Z8796Etx_Id));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8797Etx_NmId", GXutil.rtrim( Z8797Etx_NmId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8798Etx_Agente", GXutil.rtrim( Z8798Etx_Agente));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8799Etx_NmAgen", GXutil.rtrim( Z8799Etx_NmAgen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8800Etx_GruFam", GXutil.ltrim( localUtil.ntoc( Z8800Etx_GruFam, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8801Etx_TipAge", GXutil.rtrim( Z8801Etx_TipAge));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8802Etx_TipPlt", GXutil.rtrim( Z8802Etx_TipPlt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8803Etx_ObsPed", Z8803Etx_ObsPed);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8804Etx_ObsTej", Z8804Etx_ObsTej);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8805Etx_Est", GXutil.ltrim( localUtil.ntoc( Z8805Etx_Est, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8806Etx_Ests", GXutil.ltrim( localUtil.ntoc( Z8806Etx_Ests, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8829Etx_CiroTr", GXutil.rtrim( Z8829Etx_CiroTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8870Etx_FCompT", localUtil.format(Z8870Etx_FCompT, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8871Etx_FCompO", localUtil.format(Z8871Etx_FCompO, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8872Etx_Prog", GXutil.rtrim( Z8872Etx_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8873Etx_FPedCB", localUtil.ttoc( Z8873Etx_FPedCB, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8874Etx_UsuCBE", GXutil.rtrim( Z8874Etx_UsuCBE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8875Etx_CloTJ", GXutil.rtrim( Z8875Etx_CloTJ));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8876Etx_CloES", GXutil.rtrim( Z8876Etx_CloES));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8945Etx_Muestr", GXutil.rtrim( Z8945Etx_Muestr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9394Etx_otoe", GXutil.ltrim( localUtil.ntoc( Z9394Etx_otoe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9563Etx_usuC", GXutil.rtrim( Z9563Etx_usuC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9564Etx_DhC", localUtil.ttoc( Z9564Etx_DhC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9565Etx_item1", GXutil.rtrim( Z9565Etx_item1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9567Etx_item4", GXutil.rtrim( Z9567Etx_item4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9566Etx_item3", GXutil.rtrim( Z9566Etx_item3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9599Etx_DibCO", GXutil.rtrim( Z9599Etx_DibCO));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9600Etx_FComOE", localUtil.format(Z9600Etx_FComOE, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9601Etx_usuCOE", GXutil.rtrim( Z9601Etx_usuCOE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12207Etx_EstV", GXutil.ltrim( localUtil.ntoc( Z12207Etx_EstV, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12958Etx_Inv", GXutil.rtrim( Z12958Etx_Inv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T012U14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T012U14_A279CliNom[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("VALID_ETX_PED","{handler:'valid_Etx_ped',iparms:[]");
      setEventMetadata("VALID_ETX_PED",",oparms:[]}");
      setEventMetadata("VALID_ETX_DIB","{handler:'valid_Etx_dib',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8782Etx_Ped',fld:'ETX_PED',pic:''},{av:'A8783Etx_Dib',fld:'ETX_DIB',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ETX_DIB",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A8784Etx_Art',fld:'ETX_ART',pic:''},{av:'A8785Etx_Pro',fld:'ETX_PRO',pic:''},{av:'A8786Etx_DibI',fld:'ETX_DIBI',pic:'ZZZZZZZ9'},{av:'A8787Etx_DibC',fld:'ETX_DIBC',pic:''},{av:'A8788Etx_FecP',fld:'ETX_FECP',pic:''},{av:'A8789Etx_FecEnt',fld:'ETX_FECENT',pic:''},{av:'A8790Etx_Coord',fld:'ETX_COORD',pic:''},{av:'A8791Etx_Reemp',fld:'ETX_REEMP',pic:''},{av:'A8792Etx_idprog',fld:'ETX_IDPROG',pic:''},{av:'A8793Etx_Nmprog',fld:'ETX_NMPROG',pic:''},{av:'A8794Etx_Claspe',fld:'ETX_CLASPE',pic:''},{av:'A8795Etx_NmClas',fld:'ETX_NMCLAS',pic:''},{av:'A8796Etx_Id',fld:'ETX_ID',pic:''},{av:'A8797Etx_NmId',fld:'ETX_NMID',pic:''},{av:'A8798Etx_Agente',fld:'ETX_AGENTE',pic:''},{av:'A8799Etx_NmAgen',fld:'ETX_NMAGEN',pic:''},{av:'A8800Etx_GruFam',fld:'ETX_GRUFAM',pic:'ZZZ9'},{av:'A8801Etx_TipAge',fld:'ETX_TIPAGE',pic:''},{av:'A8802Etx_TipPlt',fld:'ETX_TIPPLT',pic:''},{av:'A8803Etx_ObsPed',fld:'ETX_OBSPED',pic:''},{av:'A8804Etx_ObsTej',fld:'ETX_OBSTEJ',pic:''},{av:'A8805Etx_Est',fld:'ETX_EST',pic:'9'},{av:'A8806Etx_Ests',fld:'ETX_ESTS',pic:'9'},{av:'A8829Etx_CiroTr',fld:'ETX_CIROTR',pic:''},{av:'A8870Etx_FCompT',fld:'ETX_FCOMPT',pic:''},{av:'A8871Etx_FCompO',fld:'ETX_FCOMPO',pic:''},{av:'A8872Etx_Prog',fld:'ETX_PROG',pic:''},{av:'A8873Etx_FPedCB',fld:'ETX_FPEDCB',pic:'99/99/99 99:99'},{av:'A8874Etx_UsuCBE',fld:'ETX_USUCBE',pic:'@!'},{av:'A8875Etx_CloTJ',fld:'ETX_CLOTJ',pic:''},{av:'A8876Etx_CloES',fld:'ETX_CLOES',pic:''},{av:'A8945Etx_Muestr',fld:'ETX_MUESTR',pic:''},{av:'A9394Etx_otoe',fld:'ETX_OTOE',pic:'9'},{av:'A9563Etx_usuC',fld:'ETX_USUC',pic:''},{av:'A9564Etx_DhC',fld:'ETX_DHC',pic:'99/99/99 99:99'},{av:'A9565Etx_item1',fld:'ETX_ITEM1',pic:''},{av:'A9567Etx_item4',fld:'ETX_ITEM4',pic:''},{av:'A9566Etx_item3',fld:'ETX_ITEM3',pic:''},{av:'A9599Etx_DibCO',fld:'ETX_DIBCO',pic:''},{av:'A9600Etx_FComOE',fld:'ETX_FCOMOE',pic:''},{av:'A9601Etx_usuCOE',fld:'ETX_USUCOE',pic:'@!'},{av:'A12207Etx_EstV',fld:'ETX_ESTV',pic:'9'},{av:'A12958Etx_Inv',fld:'ETX_INV',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8782Etx_Ped'},{av:'Z8783Etx_Dib'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z8784Etx_Art'},{av:'Z8785Etx_Pro'},{av:'Z8786Etx_DibI'},{av:'Z8787Etx_DibC'},{av:'Z8788Etx_FecP'},{av:'Z8789Etx_FecEnt'},{av:'Z8790Etx_Coord'},{av:'Z8791Etx_Reemp'},{av:'Z8792Etx_idprog'},{av:'Z8793Etx_Nmprog'},{av:'Z8794Etx_Claspe'},{av:'Z8795Etx_NmClas'},{av:'Z8796Etx_Id'},{av:'Z8797Etx_NmId'},{av:'Z8798Etx_Agente'},{av:'Z8799Etx_NmAgen'},{av:'Z8800Etx_GruFam'},{av:'Z8801Etx_TipAge'},{av:'Z8802Etx_TipPlt'},{av:'Z8803Etx_ObsPed'},{av:'Z8804Etx_ObsTej'},{av:'Z8805Etx_Est'},{av:'Z8806Etx_Ests'},{av:'Z8829Etx_CiroTr'},{av:'Z8870Etx_FCompT'},{av:'Z8871Etx_FCompO'},{av:'Z8872Etx_Prog'},{av:'Z8873Etx_FPedCB'},{av:'Z8874Etx_UsuCBE'},{av:'Z8875Etx_CloTJ'},{av:'Z8876Etx_CloES'},{av:'Z8945Etx_Muestr'},{av:'Z9394Etx_otoe'},{av:'Z9563Etx_usuC'},{av:'Z9564Etx_DhC'},{av:'Z9565Etx_item1'},{av:'Z9567Etx_item4'},{av:'Z9566Etx_item3'},{av:'Z9599Etx_DibCO'},{av:'Z9600Etx_FComOE'},{av:'Z9601Etx_usuCOE'},{av:'Z12207Etx_EstV'},{av:'Z12958Etx_Inv'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
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
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z8782Etx_Ped = "" ;
      Z8783Etx_Dib = "" ;
      Z8784Etx_Art = "" ;
      Z8785Etx_Pro = "" ;
      Z8787Etx_DibC = "" ;
      Z8788Etx_FecP = GXutil.nullDate() ;
      Z8789Etx_FecEnt = GXutil.nullDate() ;
      Z8790Etx_Coord = "" ;
      Z8791Etx_Reemp = "" ;
      Z8792Etx_idprog = "" ;
      Z8793Etx_Nmprog = "" ;
      Z8794Etx_Claspe = "" ;
      Z8795Etx_NmClas = "" ;
      Z8796Etx_Id = "" ;
      Z8797Etx_NmId = "" ;
      Z8798Etx_Agente = "" ;
      Z8799Etx_NmAgen = "" ;
      Z8801Etx_TipAge = "" ;
      Z8802Etx_TipPlt = "" ;
      Z8803Etx_ObsPed = "" ;
      Z8804Etx_ObsTej = "" ;
      Z8829Etx_CiroTr = "" ;
      Z8870Etx_FCompT = GXutil.nullDate() ;
      Z8871Etx_FCompO = GXutil.nullDate() ;
      Z8872Etx_Prog = "" ;
      Z8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
      Z8874Etx_UsuCBE = "" ;
      Z8875Etx_CloTJ = "" ;
      Z8876Etx_CloES = "" ;
      Z8945Etx_Muestr = "" ;
      Z9563Etx_usuC = "" ;
      Z9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
      Z9565Etx_item1 = "" ;
      Z9567Etx_item4 = "" ;
      Z9566Etx_item3 = "" ;
      Z9599Etx_DibCO = "" ;
      Z9600Etx_FComOE = GXutil.nullDate() ;
      Z9601Etx_usuCOE = "" ;
      Z12958Etx_Inv = "" ;
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
      A8782Etx_Ped = "" ;
      lblTextblock4_Jsonclick = "" ;
      A8783Etx_Dib = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A8784Etx_Art = "" ;
      lblTextblock8_Jsonclick = "" ;
      A8785Etx_Pro = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A8787Etx_DibC = "" ;
      lblTextblock11_Jsonclick = "" ;
      A8788Etx_FecP = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A8789Etx_FecEnt = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      A8790Etx_Coord = "" ;
      lblTextblock14_Jsonclick = "" ;
      A8791Etx_Reemp = "" ;
      lblTextblock15_Jsonclick = "" ;
      A8792Etx_idprog = "" ;
      lblTextblock16_Jsonclick = "" ;
      A8793Etx_Nmprog = "" ;
      lblTextblock17_Jsonclick = "" ;
      A8794Etx_Claspe = "" ;
      lblTextblock18_Jsonclick = "" ;
      A8795Etx_NmClas = "" ;
      lblTextblock19_Jsonclick = "" ;
      A8796Etx_Id = "" ;
      lblTextblock20_Jsonclick = "" ;
      A8797Etx_NmId = "" ;
      lblTextblock21_Jsonclick = "" ;
      A8798Etx_Agente = "" ;
      lblTextblock22_Jsonclick = "" ;
      A8799Etx_NmAgen = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A8801Etx_TipAge = "" ;
      lblTextblock25_Jsonclick = "" ;
      A8802Etx_TipPlt = "" ;
      lblTextblock26_Jsonclick = "" ;
      A8803Etx_ObsPed = "" ;
      lblTextblock27_Jsonclick = "" ;
      A8804Etx_ObsTej = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A8829Etx_CiroTr = "" ;
      lblTextblock31_Jsonclick = "" ;
      A8870Etx_FCompT = GXutil.nullDate() ;
      lblTextblock32_Jsonclick = "" ;
      A8871Etx_FCompO = GXutil.nullDate() ;
      lblTextblock33_Jsonclick = "" ;
      A8872Etx_Prog = "" ;
      lblTextblock34_Jsonclick = "" ;
      A8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock35_Jsonclick = "" ;
      A8874Etx_UsuCBE = "" ;
      lblTextblock36_Jsonclick = "" ;
      A8875Etx_CloTJ = "" ;
      lblTextblock37_Jsonclick = "" ;
      A8876Etx_CloES = "" ;
      lblTextblock38_Jsonclick = "" ;
      A8945Etx_Muestr = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A9563Etx_usuC = "" ;
      lblTextblock41_Jsonclick = "" ;
      A9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock42_Jsonclick = "" ;
      A9565Etx_item1 = "" ;
      lblTextblock43_Jsonclick = "" ;
      A9567Etx_item4 = "" ;
      lblTextblock44_Jsonclick = "" ;
      A9566Etx_item3 = "" ;
      lblTextblock45_Jsonclick = "" ;
      A9599Etx_DibCO = "" ;
      lblTextblock46_Jsonclick = "" ;
      A9600Etx_FComOE = GXutil.nullDate() ;
      lblTextblock47_Jsonclick = "" ;
      A9601Etx_usuCOE = "" ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      A12958Etx_Inv = "" ;
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
      Z279CliNom = "" ;
      T012U4_A407EmprNom = new String[] {""} ;
      T012U4_n407EmprNom = new boolean[] {false} ;
      T012U6_A8782Etx_Ped = new String[] {""} ;
      T012U6_A8783Etx_Dib = new String[] {""} ;
      T012U6_A407EmprNom = new String[] {""} ;
      T012U6_n407EmprNom = new boolean[] {false} ;
      T012U6_A279CliNom = new String[] {""} ;
      T012U6_A8784Etx_Art = new String[] {""} ;
      T012U6_n8784Etx_Art = new boolean[] {false} ;
      T012U6_A8785Etx_Pro = new String[] {""} ;
      T012U6_n8785Etx_Pro = new boolean[] {false} ;
      T012U6_A8786Etx_DibI = new int[1] ;
      T012U6_n8786Etx_DibI = new boolean[] {false} ;
      T012U6_A8787Etx_DibC = new String[] {""} ;
      T012U6_n8787Etx_DibC = new boolean[] {false} ;
      T012U6_A8788Etx_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n8788Etx_FecP = new boolean[] {false} ;
      T012U6_A8789Etx_FecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n8789Etx_FecEnt = new boolean[] {false} ;
      T012U6_A8790Etx_Coord = new String[] {""} ;
      T012U6_n8790Etx_Coord = new boolean[] {false} ;
      T012U6_A8791Etx_Reemp = new String[] {""} ;
      T012U6_n8791Etx_Reemp = new boolean[] {false} ;
      T012U6_A8792Etx_idprog = new String[] {""} ;
      T012U6_n8792Etx_idprog = new boolean[] {false} ;
      T012U6_A8793Etx_Nmprog = new String[] {""} ;
      T012U6_n8793Etx_Nmprog = new boolean[] {false} ;
      T012U6_A8794Etx_Claspe = new String[] {""} ;
      T012U6_n8794Etx_Claspe = new boolean[] {false} ;
      T012U6_A8795Etx_NmClas = new String[] {""} ;
      T012U6_n8795Etx_NmClas = new boolean[] {false} ;
      T012U6_A8796Etx_Id = new String[] {""} ;
      T012U6_n8796Etx_Id = new boolean[] {false} ;
      T012U6_A8797Etx_NmId = new String[] {""} ;
      T012U6_n8797Etx_NmId = new boolean[] {false} ;
      T012U6_A8798Etx_Agente = new String[] {""} ;
      T012U6_n8798Etx_Agente = new boolean[] {false} ;
      T012U6_A8799Etx_NmAgen = new String[] {""} ;
      T012U6_n8799Etx_NmAgen = new boolean[] {false} ;
      T012U6_A8800Etx_GruFam = new short[1] ;
      T012U6_n8800Etx_GruFam = new boolean[] {false} ;
      T012U6_A8801Etx_TipAge = new String[] {""} ;
      T012U6_n8801Etx_TipAge = new boolean[] {false} ;
      T012U6_A8802Etx_TipPlt = new String[] {""} ;
      T012U6_n8802Etx_TipPlt = new boolean[] {false} ;
      T012U6_A8803Etx_ObsPed = new String[] {""} ;
      T012U6_n8803Etx_ObsPed = new boolean[] {false} ;
      T012U6_A8804Etx_ObsTej = new String[] {""} ;
      T012U6_n8804Etx_ObsTej = new boolean[] {false} ;
      T012U6_A8805Etx_Est = new byte[1] ;
      T012U6_n8805Etx_Est = new boolean[] {false} ;
      T012U6_A8806Etx_Ests = new byte[1] ;
      T012U6_n8806Etx_Ests = new boolean[] {false} ;
      T012U6_A8829Etx_CiroTr = new String[] {""} ;
      T012U6_n8829Etx_CiroTr = new boolean[] {false} ;
      T012U6_A8870Etx_FCompT = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n8870Etx_FCompT = new boolean[] {false} ;
      T012U6_A8871Etx_FCompO = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n8871Etx_FCompO = new boolean[] {false} ;
      T012U6_A8872Etx_Prog = new String[] {""} ;
      T012U6_n8872Etx_Prog = new boolean[] {false} ;
      T012U6_A8873Etx_FPedCB = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n8873Etx_FPedCB = new boolean[] {false} ;
      T012U6_A8874Etx_UsuCBE = new String[] {""} ;
      T012U6_n8874Etx_UsuCBE = new boolean[] {false} ;
      T012U6_A8875Etx_CloTJ = new String[] {""} ;
      T012U6_n8875Etx_CloTJ = new boolean[] {false} ;
      T012U6_A8876Etx_CloES = new String[] {""} ;
      T012U6_n8876Etx_CloES = new boolean[] {false} ;
      T012U6_A8945Etx_Muestr = new String[] {""} ;
      T012U6_n8945Etx_Muestr = new boolean[] {false} ;
      T012U6_A9394Etx_otoe = new byte[1] ;
      T012U6_n9394Etx_otoe = new boolean[] {false} ;
      T012U6_A9563Etx_usuC = new String[] {""} ;
      T012U6_n9563Etx_usuC = new boolean[] {false} ;
      T012U6_A9564Etx_DhC = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n9564Etx_DhC = new boolean[] {false} ;
      T012U6_A9565Etx_item1 = new String[] {""} ;
      T012U6_n9565Etx_item1 = new boolean[] {false} ;
      T012U6_A9567Etx_item4 = new String[] {""} ;
      T012U6_n9567Etx_item4 = new boolean[] {false} ;
      T012U6_A9566Etx_item3 = new String[] {""} ;
      T012U6_n9566Etx_item3 = new boolean[] {false} ;
      T012U6_A9599Etx_DibCO = new String[] {""} ;
      T012U6_n9599Etx_DibCO = new boolean[] {false} ;
      T012U6_A9600Etx_FComOE = new java.util.Date[] {GXutil.nullDate()} ;
      T012U6_n9600Etx_FComOE = new boolean[] {false} ;
      T012U6_A9601Etx_usuCOE = new String[] {""} ;
      T012U6_n9601Etx_usuCOE = new boolean[] {false} ;
      T012U6_A12207Etx_EstV = new byte[1] ;
      T012U6_n12207Etx_EstV = new boolean[] {false} ;
      T012U6_A12958Etx_Inv = new String[] {""} ;
      T012U6_n12958Etx_Inv = new boolean[] {false} ;
      T012U6_A396EmprCod = new String[] {""} ;
      T012U6_A252CliCod = new int[1] ;
      T012U6_n252CliCod = new boolean[] {false} ;
      T012U5_A279CliNom = new String[] {""} ;
      T012U7_A279CliNom = new String[] {""} ;
      T012U8_A396EmprCod = new String[] {""} ;
      T012U8_A8782Etx_Ped = new String[] {""} ;
      T012U8_A8783Etx_Dib = new String[] {""} ;
      T012U3_A8782Etx_Ped = new String[] {""} ;
      T012U3_A8783Etx_Dib = new String[] {""} ;
      T012U3_A8784Etx_Art = new String[] {""} ;
      T012U3_n8784Etx_Art = new boolean[] {false} ;
      T012U3_A8785Etx_Pro = new String[] {""} ;
      T012U3_n8785Etx_Pro = new boolean[] {false} ;
      T012U3_A8786Etx_DibI = new int[1] ;
      T012U3_n8786Etx_DibI = new boolean[] {false} ;
      T012U3_A8787Etx_DibC = new String[] {""} ;
      T012U3_n8787Etx_DibC = new boolean[] {false} ;
      T012U3_A8788Etx_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n8788Etx_FecP = new boolean[] {false} ;
      T012U3_A8789Etx_FecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n8789Etx_FecEnt = new boolean[] {false} ;
      T012U3_A8790Etx_Coord = new String[] {""} ;
      T012U3_n8790Etx_Coord = new boolean[] {false} ;
      T012U3_A8791Etx_Reemp = new String[] {""} ;
      T012U3_n8791Etx_Reemp = new boolean[] {false} ;
      T012U3_A8792Etx_idprog = new String[] {""} ;
      T012U3_n8792Etx_idprog = new boolean[] {false} ;
      T012U3_A8793Etx_Nmprog = new String[] {""} ;
      T012U3_n8793Etx_Nmprog = new boolean[] {false} ;
      T012U3_A8794Etx_Claspe = new String[] {""} ;
      T012U3_n8794Etx_Claspe = new boolean[] {false} ;
      T012U3_A8795Etx_NmClas = new String[] {""} ;
      T012U3_n8795Etx_NmClas = new boolean[] {false} ;
      T012U3_A8796Etx_Id = new String[] {""} ;
      T012U3_n8796Etx_Id = new boolean[] {false} ;
      T012U3_A8797Etx_NmId = new String[] {""} ;
      T012U3_n8797Etx_NmId = new boolean[] {false} ;
      T012U3_A8798Etx_Agente = new String[] {""} ;
      T012U3_n8798Etx_Agente = new boolean[] {false} ;
      T012U3_A8799Etx_NmAgen = new String[] {""} ;
      T012U3_n8799Etx_NmAgen = new boolean[] {false} ;
      T012U3_A8800Etx_GruFam = new short[1] ;
      T012U3_n8800Etx_GruFam = new boolean[] {false} ;
      T012U3_A8801Etx_TipAge = new String[] {""} ;
      T012U3_n8801Etx_TipAge = new boolean[] {false} ;
      T012U3_A8802Etx_TipPlt = new String[] {""} ;
      T012U3_n8802Etx_TipPlt = new boolean[] {false} ;
      T012U3_A8803Etx_ObsPed = new String[] {""} ;
      T012U3_n8803Etx_ObsPed = new boolean[] {false} ;
      T012U3_A8804Etx_ObsTej = new String[] {""} ;
      T012U3_n8804Etx_ObsTej = new boolean[] {false} ;
      T012U3_A8805Etx_Est = new byte[1] ;
      T012U3_n8805Etx_Est = new boolean[] {false} ;
      T012U3_A8806Etx_Ests = new byte[1] ;
      T012U3_n8806Etx_Ests = new boolean[] {false} ;
      T012U3_A8829Etx_CiroTr = new String[] {""} ;
      T012U3_n8829Etx_CiroTr = new boolean[] {false} ;
      T012U3_A8870Etx_FCompT = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n8870Etx_FCompT = new boolean[] {false} ;
      T012U3_A8871Etx_FCompO = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n8871Etx_FCompO = new boolean[] {false} ;
      T012U3_A8872Etx_Prog = new String[] {""} ;
      T012U3_n8872Etx_Prog = new boolean[] {false} ;
      T012U3_A8873Etx_FPedCB = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n8873Etx_FPedCB = new boolean[] {false} ;
      T012U3_A8874Etx_UsuCBE = new String[] {""} ;
      T012U3_n8874Etx_UsuCBE = new boolean[] {false} ;
      T012U3_A8875Etx_CloTJ = new String[] {""} ;
      T012U3_n8875Etx_CloTJ = new boolean[] {false} ;
      T012U3_A8876Etx_CloES = new String[] {""} ;
      T012U3_n8876Etx_CloES = new boolean[] {false} ;
      T012U3_A8945Etx_Muestr = new String[] {""} ;
      T012U3_n8945Etx_Muestr = new boolean[] {false} ;
      T012U3_A9394Etx_otoe = new byte[1] ;
      T012U3_n9394Etx_otoe = new boolean[] {false} ;
      T012U3_A9563Etx_usuC = new String[] {""} ;
      T012U3_n9563Etx_usuC = new boolean[] {false} ;
      T012U3_A9564Etx_DhC = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n9564Etx_DhC = new boolean[] {false} ;
      T012U3_A9565Etx_item1 = new String[] {""} ;
      T012U3_n9565Etx_item1 = new boolean[] {false} ;
      T012U3_A9567Etx_item4 = new String[] {""} ;
      T012U3_n9567Etx_item4 = new boolean[] {false} ;
      T012U3_A9566Etx_item3 = new String[] {""} ;
      T012U3_n9566Etx_item3 = new boolean[] {false} ;
      T012U3_A9599Etx_DibCO = new String[] {""} ;
      T012U3_n9599Etx_DibCO = new boolean[] {false} ;
      T012U3_A9600Etx_FComOE = new java.util.Date[] {GXutil.nullDate()} ;
      T012U3_n9600Etx_FComOE = new boolean[] {false} ;
      T012U3_A9601Etx_usuCOE = new String[] {""} ;
      T012U3_n9601Etx_usuCOE = new boolean[] {false} ;
      T012U3_A12207Etx_EstV = new byte[1] ;
      T012U3_n12207Etx_EstV = new boolean[] {false} ;
      T012U3_A12958Etx_Inv = new String[] {""} ;
      T012U3_n12958Etx_Inv = new boolean[] {false} ;
      T012U3_A396EmprCod = new String[] {""} ;
      T012U3_A252CliCod = new int[1] ;
      T012U3_n252CliCod = new boolean[] {false} ;
      sMode1198 = "" ;
      T012U9_A396EmprCod = new String[] {""} ;
      T012U9_A8782Etx_Ped = new String[] {""} ;
      T012U9_A8783Etx_Dib = new String[] {""} ;
      T012U10_A396EmprCod = new String[] {""} ;
      T012U10_A8782Etx_Ped = new String[] {""} ;
      T012U10_A8783Etx_Dib = new String[] {""} ;
      T012U2_A8782Etx_Ped = new String[] {""} ;
      T012U2_A8783Etx_Dib = new String[] {""} ;
      T012U2_A8784Etx_Art = new String[] {""} ;
      T012U2_n8784Etx_Art = new boolean[] {false} ;
      T012U2_A8785Etx_Pro = new String[] {""} ;
      T012U2_n8785Etx_Pro = new boolean[] {false} ;
      T012U2_A8786Etx_DibI = new int[1] ;
      T012U2_n8786Etx_DibI = new boolean[] {false} ;
      T012U2_A8787Etx_DibC = new String[] {""} ;
      T012U2_n8787Etx_DibC = new boolean[] {false} ;
      T012U2_A8788Etx_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n8788Etx_FecP = new boolean[] {false} ;
      T012U2_A8789Etx_FecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n8789Etx_FecEnt = new boolean[] {false} ;
      T012U2_A8790Etx_Coord = new String[] {""} ;
      T012U2_n8790Etx_Coord = new boolean[] {false} ;
      T012U2_A8791Etx_Reemp = new String[] {""} ;
      T012U2_n8791Etx_Reemp = new boolean[] {false} ;
      T012U2_A8792Etx_idprog = new String[] {""} ;
      T012U2_n8792Etx_idprog = new boolean[] {false} ;
      T012U2_A8793Etx_Nmprog = new String[] {""} ;
      T012U2_n8793Etx_Nmprog = new boolean[] {false} ;
      T012U2_A8794Etx_Claspe = new String[] {""} ;
      T012U2_n8794Etx_Claspe = new boolean[] {false} ;
      T012U2_A8795Etx_NmClas = new String[] {""} ;
      T012U2_n8795Etx_NmClas = new boolean[] {false} ;
      T012U2_A8796Etx_Id = new String[] {""} ;
      T012U2_n8796Etx_Id = new boolean[] {false} ;
      T012U2_A8797Etx_NmId = new String[] {""} ;
      T012U2_n8797Etx_NmId = new boolean[] {false} ;
      T012U2_A8798Etx_Agente = new String[] {""} ;
      T012U2_n8798Etx_Agente = new boolean[] {false} ;
      T012U2_A8799Etx_NmAgen = new String[] {""} ;
      T012U2_n8799Etx_NmAgen = new boolean[] {false} ;
      T012U2_A8800Etx_GruFam = new short[1] ;
      T012U2_n8800Etx_GruFam = new boolean[] {false} ;
      T012U2_A8801Etx_TipAge = new String[] {""} ;
      T012U2_n8801Etx_TipAge = new boolean[] {false} ;
      T012U2_A8802Etx_TipPlt = new String[] {""} ;
      T012U2_n8802Etx_TipPlt = new boolean[] {false} ;
      T012U2_A8803Etx_ObsPed = new String[] {""} ;
      T012U2_n8803Etx_ObsPed = new boolean[] {false} ;
      T012U2_A8804Etx_ObsTej = new String[] {""} ;
      T012U2_n8804Etx_ObsTej = new boolean[] {false} ;
      T012U2_A8805Etx_Est = new byte[1] ;
      T012U2_n8805Etx_Est = new boolean[] {false} ;
      T012U2_A8806Etx_Ests = new byte[1] ;
      T012U2_n8806Etx_Ests = new boolean[] {false} ;
      T012U2_A8829Etx_CiroTr = new String[] {""} ;
      T012U2_n8829Etx_CiroTr = new boolean[] {false} ;
      T012U2_A8870Etx_FCompT = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n8870Etx_FCompT = new boolean[] {false} ;
      T012U2_A8871Etx_FCompO = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n8871Etx_FCompO = new boolean[] {false} ;
      T012U2_A8872Etx_Prog = new String[] {""} ;
      T012U2_n8872Etx_Prog = new boolean[] {false} ;
      T012U2_A8873Etx_FPedCB = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n8873Etx_FPedCB = new boolean[] {false} ;
      T012U2_A8874Etx_UsuCBE = new String[] {""} ;
      T012U2_n8874Etx_UsuCBE = new boolean[] {false} ;
      T012U2_A8875Etx_CloTJ = new String[] {""} ;
      T012U2_n8875Etx_CloTJ = new boolean[] {false} ;
      T012U2_A8876Etx_CloES = new String[] {""} ;
      T012U2_n8876Etx_CloES = new boolean[] {false} ;
      T012U2_A8945Etx_Muestr = new String[] {""} ;
      T012U2_n8945Etx_Muestr = new boolean[] {false} ;
      T012U2_A9394Etx_otoe = new byte[1] ;
      T012U2_n9394Etx_otoe = new boolean[] {false} ;
      T012U2_A9563Etx_usuC = new String[] {""} ;
      T012U2_n9563Etx_usuC = new boolean[] {false} ;
      T012U2_A9564Etx_DhC = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n9564Etx_DhC = new boolean[] {false} ;
      T012U2_A9565Etx_item1 = new String[] {""} ;
      T012U2_n9565Etx_item1 = new boolean[] {false} ;
      T012U2_A9567Etx_item4 = new String[] {""} ;
      T012U2_n9567Etx_item4 = new boolean[] {false} ;
      T012U2_A9566Etx_item3 = new String[] {""} ;
      T012U2_n9566Etx_item3 = new boolean[] {false} ;
      T012U2_A9599Etx_DibCO = new String[] {""} ;
      T012U2_n9599Etx_DibCO = new boolean[] {false} ;
      T012U2_A9600Etx_FComOE = new java.util.Date[] {GXutil.nullDate()} ;
      T012U2_n9600Etx_FComOE = new boolean[] {false} ;
      T012U2_A9601Etx_usuCOE = new String[] {""} ;
      T012U2_n9601Etx_usuCOE = new boolean[] {false} ;
      T012U2_A12207Etx_EstV = new byte[1] ;
      T012U2_n12207Etx_EstV = new boolean[] {false} ;
      T012U2_A12958Etx_Inv = new String[] {""} ;
      T012U2_n12958Etx_Inv = new boolean[] {false} ;
      T012U2_A396EmprCod = new String[] {""} ;
      T012U2_A252CliCod = new int[1] ;
      T012U2_n252CliCod = new boolean[] {false} ;
      T012U14_A279CliNom = new String[] {""} ;
      T012U15_A396EmprCod = new String[] {""} ;
      T012U15_A8782Etx_Ped = new String[] {""} ;
      T012U15_A8783Etx_Dib = new String[] {""} ;
      T012U15_A8820Etx_ColV = new String[] {""} ;
      T012U15_A8869Etx_ColVN = new int[1] ;
      T012U15_A8821Etx_LinL = new short[1] ;
      T012U16_A396EmprCod = new String[] {""} ;
      T012U16_A8782Etx_Ped = new String[] {""} ;
      T012U16_A8783Etx_Dib = new String[] {""} ;
      T012U16_A8824Etx_Nvar = new String[] {""} ;
      T012U16_A8825Etx_Linh = new short[1] ;
      T012U17_A396EmprCod = new String[] {""} ;
      T012U17_A8782Etx_Ped = new String[] {""} ;
      T012U17_A8783Etx_Dib = new String[] {""} ;
      T012U17_A8808Etx_Lin = new short[1] ;
      T012U18_A396EmprCod = new String[] {""} ;
      T012U18_A8782Etx_Ped = new String[] {""} ;
      T012U18_A8783Etx_Dib = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T012U19_A407EmprNom = new String[] {""} ;
      T012U19_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ8782Etx_Ped = "" ;
      ZZ8783Etx_Dib = "" ;
      ZZ407EmprNom = "" ;
      ZZ8784Etx_Art = "" ;
      ZZ8785Etx_Pro = "" ;
      ZZ8787Etx_DibC = "" ;
      ZZ8788Etx_FecP = GXutil.nullDate() ;
      ZZ8789Etx_FecEnt = GXutil.nullDate() ;
      ZZ8790Etx_Coord = "" ;
      ZZ8791Etx_Reemp = "" ;
      ZZ8792Etx_idprog = "" ;
      ZZ8793Etx_Nmprog = "" ;
      ZZ8794Etx_Claspe = "" ;
      ZZ8795Etx_NmClas = "" ;
      ZZ8796Etx_Id = "" ;
      ZZ8797Etx_NmId = "" ;
      ZZ8798Etx_Agente = "" ;
      ZZ8799Etx_NmAgen = "" ;
      ZZ8801Etx_TipAge = "" ;
      ZZ8802Etx_TipPlt = "" ;
      ZZ8803Etx_ObsPed = "" ;
      ZZ8804Etx_ObsTej = "" ;
      ZZ8829Etx_CiroTr = "" ;
      ZZ8870Etx_FCompT = GXutil.nullDate() ;
      ZZ8871Etx_FCompO = GXutil.nullDate() ;
      ZZ8872Etx_Prog = "" ;
      ZZ8873Etx_FPedCB = GXutil.resetTime( GXutil.nullDate() );
      ZZ8874Etx_UsuCBE = "" ;
      ZZ8875Etx_CloTJ = "" ;
      ZZ8876Etx_CloES = "" ;
      ZZ8945Etx_Muestr = "" ;
      ZZ9563Etx_usuC = "" ;
      ZZ9564Etx_DhC = GXutil.resetTime( GXutil.nullDate() );
      ZZ9565Etx_item1 = "" ;
      ZZ9567Etx_item4 = "" ;
      ZZ9566Etx_item3 = "" ;
      ZZ9599Etx_DibCO = "" ;
      ZZ9600Etx_FComOE = GXutil.nullDate() ;
      ZZ9601Etx_usuCOE = "" ;
      ZZ12958Etx_Inv = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcpdetx__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcpdetx__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcpdetx__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcpdetx__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcpdetx__default(),
         new Object[] {
             new Object[] {
            T012U2_A8782Etx_Ped, T012U2_A8783Etx_Dib, T012U2_A8784Etx_Art, T012U2_n8784Etx_Art, T012U2_A8785Etx_Pro, T012U2_n8785Etx_Pro, T012U2_A8786Etx_DibI, T012U2_n8786Etx_DibI, T012U2_A8787Etx_DibC, T012U2_n8787Etx_DibC,
            T012U2_A8788Etx_FecP, T012U2_n8788Etx_FecP, T012U2_A8789Etx_FecEnt, T012U2_n8789Etx_FecEnt, T012U2_A8790Etx_Coord, T012U2_n8790Etx_Coord, T012U2_A8791Etx_Reemp, T012U2_n8791Etx_Reemp, T012U2_A8792Etx_idprog, T012U2_n8792Etx_idprog,
            T012U2_A8793Etx_Nmprog, T012U2_n8793Etx_Nmprog, T012U2_A8794Etx_Claspe, T012U2_n8794Etx_Claspe, T012U2_A8795Etx_NmClas, T012U2_n8795Etx_NmClas, T012U2_A8796Etx_Id, T012U2_n8796Etx_Id, T012U2_A8797Etx_NmId, T012U2_n8797Etx_NmId,
            T012U2_A8798Etx_Agente, T012U2_n8798Etx_Agente, T012U2_A8799Etx_NmAgen, T012U2_n8799Etx_NmAgen, T012U2_A8800Etx_GruFam, T012U2_n8800Etx_GruFam, T012U2_A8801Etx_TipAge, T012U2_n8801Etx_TipAge, T012U2_A8802Etx_TipPlt, T012U2_n8802Etx_TipPlt,
            T012U2_A8803Etx_ObsPed, T012U2_n8803Etx_ObsPed, T012U2_A8804Etx_ObsTej, T012U2_n8804Etx_ObsTej, T012U2_A8805Etx_Est, T012U2_n8805Etx_Est, T012U2_A8806Etx_Ests, T012U2_n8806Etx_Ests, T012U2_A8829Etx_CiroTr, T012U2_n8829Etx_CiroTr,
            T012U2_A8870Etx_FCompT, T012U2_n8870Etx_FCompT, T012U2_A8871Etx_FCompO, T012U2_n8871Etx_FCompO, T012U2_A8872Etx_Prog, T012U2_n8872Etx_Prog, T012U2_A8873Etx_FPedCB, T012U2_n8873Etx_FPedCB, T012U2_A8874Etx_UsuCBE, T012U2_n8874Etx_UsuCBE,
            T012U2_A8875Etx_CloTJ, T012U2_n8875Etx_CloTJ, T012U2_A8876Etx_CloES, T012U2_n8876Etx_CloES, T012U2_A8945Etx_Muestr, T012U2_n8945Etx_Muestr, T012U2_A9394Etx_otoe, T012U2_n9394Etx_otoe, T012U2_A9563Etx_usuC, T012U2_n9563Etx_usuC,
            T012U2_A9564Etx_DhC, T012U2_n9564Etx_DhC, T012U2_A9565Etx_item1, T012U2_n9565Etx_item1, T012U2_A9567Etx_item4, T012U2_n9567Etx_item4, T012U2_A9566Etx_item3, T012U2_n9566Etx_item3, T012U2_A9599Etx_DibCO, T012U2_n9599Etx_DibCO,
            T012U2_A9600Etx_FComOE, T012U2_n9600Etx_FComOE, T012U2_A9601Etx_usuCOE, T012U2_n9601Etx_usuCOE, T012U2_A12207Etx_EstV, T012U2_n12207Etx_EstV, T012U2_A12958Etx_Inv, T012U2_n12958Etx_Inv, T012U2_A396EmprCod, T012U2_A252CliCod,
            T012U2_n252CliCod
            }
            , new Object[] {
            T012U3_A8782Etx_Ped, T012U3_A8783Etx_Dib, T012U3_A8784Etx_Art, T012U3_n8784Etx_Art, T012U3_A8785Etx_Pro, T012U3_n8785Etx_Pro, T012U3_A8786Etx_DibI, T012U3_n8786Etx_DibI, T012U3_A8787Etx_DibC, T012U3_n8787Etx_DibC,
            T012U3_A8788Etx_FecP, T012U3_n8788Etx_FecP, T012U3_A8789Etx_FecEnt, T012U3_n8789Etx_FecEnt, T012U3_A8790Etx_Coord, T012U3_n8790Etx_Coord, T012U3_A8791Etx_Reemp, T012U3_n8791Etx_Reemp, T012U3_A8792Etx_idprog, T012U3_n8792Etx_idprog,
            T012U3_A8793Etx_Nmprog, T012U3_n8793Etx_Nmprog, T012U3_A8794Etx_Claspe, T012U3_n8794Etx_Claspe, T012U3_A8795Etx_NmClas, T012U3_n8795Etx_NmClas, T012U3_A8796Etx_Id, T012U3_n8796Etx_Id, T012U3_A8797Etx_NmId, T012U3_n8797Etx_NmId,
            T012U3_A8798Etx_Agente, T012U3_n8798Etx_Agente, T012U3_A8799Etx_NmAgen, T012U3_n8799Etx_NmAgen, T012U3_A8800Etx_GruFam, T012U3_n8800Etx_GruFam, T012U3_A8801Etx_TipAge, T012U3_n8801Etx_TipAge, T012U3_A8802Etx_TipPlt, T012U3_n8802Etx_TipPlt,
            T012U3_A8803Etx_ObsPed, T012U3_n8803Etx_ObsPed, T012U3_A8804Etx_ObsTej, T012U3_n8804Etx_ObsTej, T012U3_A8805Etx_Est, T012U3_n8805Etx_Est, T012U3_A8806Etx_Ests, T012U3_n8806Etx_Ests, T012U3_A8829Etx_CiroTr, T012U3_n8829Etx_CiroTr,
            T012U3_A8870Etx_FCompT, T012U3_n8870Etx_FCompT, T012U3_A8871Etx_FCompO, T012U3_n8871Etx_FCompO, T012U3_A8872Etx_Prog, T012U3_n8872Etx_Prog, T012U3_A8873Etx_FPedCB, T012U3_n8873Etx_FPedCB, T012U3_A8874Etx_UsuCBE, T012U3_n8874Etx_UsuCBE,
            T012U3_A8875Etx_CloTJ, T012U3_n8875Etx_CloTJ, T012U3_A8876Etx_CloES, T012U3_n8876Etx_CloES, T012U3_A8945Etx_Muestr, T012U3_n8945Etx_Muestr, T012U3_A9394Etx_otoe, T012U3_n9394Etx_otoe, T012U3_A9563Etx_usuC, T012U3_n9563Etx_usuC,
            T012U3_A9564Etx_DhC, T012U3_n9564Etx_DhC, T012U3_A9565Etx_item1, T012U3_n9565Etx_item1, T012U3_A9567Etx_item4, T012U3_n9567Etx_item4, T012U3_A9566Etx_item3, T012U3_n9566Etx_item3, T012U3_A9599Etx_DibCO, T012U3_n9599Etx_DibCO,
            T012U3_A9600Etx_FComOE, T012U3_n9600Etx_FComOE, T012U3_A9601Etx_usuCOE, T012U3_n9601Etx_usuCOE, T012U3_A12207Etx_EstV, T012U3_n12207Etx_EstV, T012U3_A12958Etx_Inv, T012U3_n12958Etx_Inv, T012U3_A396EmprCod, T012U3_A252CliCod,
            T012U3_n252CliCod
            }
            , new Object[] {
            T012U4_A407EmprNom, T012U4_n407EmprNom
            }
            , new Object[] {
            T012U5_A279CliNom
            }
            , new Object[] {
            T012U6_A8782Etx_Ped, T012U6_A8783Etx_Dib, T012U6_A407EmprNom, T012U6_n407EmprNom, T012U6_A279CliNom, T012U6_A8784Etx_Art, T012U6_n8784Etx_Art, T012U6_A8785Etx_Pro, T012U6_n8785Etx_Pro, T012U6_A8786Etx_DibI,
            T012U6_n8786Etx_DibI, T012U6_A8787Etx_DibC, T012U6_n8787Etx_DibC, T012U6_A8788Etx_FecP, T012U6_n8788Etx_FecP, T012U6_A8789Etx_FecEnt, T012U6_n8789Etx_FecEnt, T012U6_A8790Etx_Coord, T012U6_n8790Etx_Coord, T012U6_A8791Etx_Reemp,
            T012U6_n8791Etx_Reemp, T012U6_A8792Etx_idprog, T012U6_n8792Etx_idprog, T012U6_A8793Etx_Nmprog, T012U6_n8793Etx_Nmprog, T012U6_A8794Etx_Claspe, T012U6_n8794Etx_Claspe, T012U6_A8795Etx_NmClas, T012U6_n8795Etx_NmClas, T012U6_A8796Etx_Id,
            T012U6_n8796Etx_Id, T012U6_A8797Etx_NmId, T012U6_n8797Etx_NmId, T012U6_A8798Etx_Agente, T012U6_n8798Etx_Agente, T012U6_A8799Etx_NmAgen, T012U6_n8799Etx_NmAgen, T012U6_A8800Etx_GruFam, T012U6_n8800Etx_GruFam, T012U6_A8801Etx_TipAge,
            T012U6_n8801Etx_TipAge, T012U6_A8802Etx_TipPlt, T012U6_n8802Etx_TipPlt, T012U6_A8803Etx_ObsPed, T012U6_n8803Etx_ObsPed, T012U6_A8804Etx_ObsTej, T012U6_n8804Etx_ObsTej, T012U6_A8805Etx_Est, T012U6_n8805Etx_Est, T012U6_A8806Etx_Ests,
            T012U6_n8806Etx_Ests, T012U6_A8829Etx_CiroTr, T012U6_n8829Etx_CiroTr, T012U6_A8870Etx_FCompT, T012U6_n8870Etx_FCompT, T012U6_A8871Etx_FCompO, T012U6_n8871Etx_FCompO, T012U6_A8872Etx_Prog, T012U6_n8872Etx_Prog, T012U6_A8873Etx_FPedCB,
            T012U6_n8873Etx_FPedCB, T012U6_A8874Etx_UsuCBE, T012U6_n8874Etx_UsuCBE, T012U6_A8875Etx_CloTJ, T012U6_n8875Etx_CloTJ, T012U6_A8876Etx_CloES, T012U6_n8876Etx_CloES, T012U6_A8945Etx_Muestr, T012U6_n8945Etx_Muestr, T012U6_A9394Etx_otoe,
            T012U6_n9394Etx_otoe, T012U6_A9563Etx_usuC, T012U6_n9563Etx_usuC, T012U6_A9564Etx_DhC, T012U6_n9564Etx_DhC, T012U6_A9565Etx_item1, T012U6_n9565Etx_item1, T012U6_A9567Etx_item4, T012U6_n9567Etx_item4, T012U6_A9566Etx_item3,
            T012U6_n9566Etx_item3, T012U6_A9599Etx_DibCO, T012U6_n9599Etx_DibCO, T012U6_A9600Etx_FComOE, T012U6_n9600Etx_FComOE, T012U6_A9601Etx_usuCOE, T012U6_n9601Etx_usuCOE, T012U6_A12207Etx_EstV, T012U6_n12207Etx_EstV, T012U6_A12958Etx_Inv,
            T012U6_n12958Etx_Inv, T012U6_A396EmprCod, T012U6_A252CliCod, T012U6_n252CliCod
            }
            , new Object[] {
            T012U7_A279CliNom
            }
            , new Object[] {
            T012U8_A396EmprCod, T012U8_A8782Etx_Ped, T012U8_A8783Etx_Dib
            }
            , new Object[] {
            T012U9_A396EmprCod, T012U9_A8782Etx_Ped, T012U9_A8783Etx_Dib
            }
            , new Object[] {
            T012U10_A396EmprCod, T012U10_A8782Etx_Ped, T012U10_A8783Etx_Dib
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012U14_A279CliNom
            }
            , new Object[] {
            T012U15_A396EmprCod, T012U15_A8782Etx_Ped, T012U15_A8783Etx_Dib, T012U15_A8820Etx_ColV, T012U15_A8869Etx_ColVN, T012U15_A8821Etx_LinL
            }
            , new Object[] {
            T012U16_A396EmprCod, T012U16_A8782Etx_Ped, T012U16_A8783Etx_Dib, T012U16_A8824Etx_Nvar, T012U16_A8825Etx_Linh
            }
            , new Object[] {
            T012U17_A396EmprCod, T012U17_A8782Etx_Ped, T012U17_A8783Etx_Dib, T012U17_A8808Etx_Lin
            }
            , new Object[] {
            T012U18_A396EmprCod, T012U18_A8782Etx_Ped, T012U18_A8783Etx_Dib
            }
            , new Object[] {
            T012U19_A407EmprNom, T012U19_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCPDETX" ;
   }

   private byte Z8805Etx_Est ;
   private byte Z8806Etx_Ests ;
   private byte Z9394Etx_otoe ;
   private byte Z12207Etx_EstV ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8805Etx_Est ;
   private byte A8806Etx_Ests ;
   private byte A9394Etx_otoe ;
   private byte A12207Etx_EstV ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ8805Etx_Est ;
   private byte ZZ8806Etx_Ests ;
   private byte ZZ9394Etx_otoe ;
   private byte ZZ12207Etx_EstV ;
   private short Z8800Etx_GruFam ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8800Etx_GruFam ;
   private short RcdFound1198 ;
   private short nIsDirty_1198 ;
   private short ZZ8800Etx_GruFam ;
   private int Z8786Etx_DibI ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEtx_Ped_Enabled ;
   private int edtEtx_Dib_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEtx_Art_Enabled ;
   private int edtEtx_Pro_Enabled ;
   private int A8786Etx_DibI ;
   private int edtEtx_DibI_Enabled ;
   private int edtEtx_DibC_Enabled ;
   private int edtEtx_FecP_Enabled ;
   private int edtEtx_FecEnt_Enabled ;
   private int edtEtx_Coord_Enabled ;
   private int edtEtx_Reemp_Enabled ;
   private int edtEtx_idprog_Enabled ;
   private int edtEtx_Nmprog_Enabled ;
   private int edtEtx_Claspe_Enabled ;
   private int edtEtx_NmClas_Enabled ;
   private int edtEtx_Id_Enabled ;
   private int edtEtx_NmId_Enabled ;
   private int edtEtx_Agente_Enabled ;
   private int edtEtx_NmAgen_Enabled ;
   private int edtEtx_GruFam_Enabled ;
   private int edtEtx_TipAge_Enabled ;
   private int edtEtx_TipPlt_Enabled ;
   private int edtEtx_ObsPed_Enabled ;
   private int edtEtx_ObsTej_Enabled ;
   private int edtEtx_Est_Enabled ;
   private int edtEtx_Ests_Enabled ;
   private int edtEtx_CiroTr_Enabled ;
   private int edtEtx_FCompT_Enabled ;
   private int edtEtx_FCompO_Enabled ;
   private int edtEtx_Prog_Enabled ;
   private int edtEtx_FPedCB_Enabled ;
   private int edtEtx_UsuCBE_Enabled ;
   private int edtEtx_CloTJ_Enabled ;
   private int edtEtx_CloES_Enabled ;
   private int edtEtx_Muestr_Enabled ;
   private int edtEtx_otoe_Enabled ;
   private int edtEtx_usuC_Enabled ;
   private int edtEtx_DhC_Enabled ;
   private int edtEtx_item1_Enabled ;
   private int edtEtx_item4_Enabled ;
   private int edtEtx_item3_Enabled ;
   private int edtEtx_DibCO_Enabled ;
   private int edtEtx_FComOE_Enabled ;
   private int edtEtx_usuCOE_Enabled ;
   private int edtEtx_EstV_Enabled ;
   private int edtEtx_Inv_Enabled ;
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
   private int edtEtx_Inv_Backcolor ;
   private int edtEtx_EstV_Backcolor ;
   private int edtEtx_usuCOE_Backcolor ;
   private int edtEtx_FComOE_Backcolor ;
   private int edtEtx_DibCO_Backcolor ;
   private int edtEtx_item3_Backcolor ;
   private int edtEtx_item4_Backcolor ;
   private int edtEtx_item1_Backcolor ;
   private int edtEtx_DhC_Backcolor ;
   private int edtEtx_usuC_Backcolor ;
   private int edtEtx_otoe_Backcolor ;
   private int edtEtx_Muestr_Backcolor ;
   private int edtEtx_CloES_Backcolor ;
   private int edtEtx_CloTJ_Backcolor ;
   private int edtEtx_UsuCBE_Backcolor ;
   private int edtEtx_FPedCB_Backcolor ;
   private int edtEtx_Prog_Backcolor ;
   private int edtEtx_FCompO_Backcolor ;
   private int edtEtx_FCompT_Backcolor ;
   private int edtEtx_CiroTr_Backcolor ;
   private int edtEtx_Ests_Backcolor ;
   private int edtEtx_Est_Backcolor ;
   private int edtEtx_ObsTej_Backcolor ;
   private int edtEtx_ObsPed_Backcolor ;
   private int edtEtx_TipPlt_Backcolor ;
   private int edtEtx_TipAge_Backcolor ;
   private int edtEtx_GruFam_Backcolor ;
   private int edtEtx_NmAgen_Backcolor ;
   private int edtEtx_Agente_Backcolor ;
   private int edtEtx_NmId_Backcolor ;
   private int edtEtx_Id_Backcolor ;
   private int edtEtx_NmClas_Backcolor ;
   private int edtEtx_Claspe_Backcolor ;
   private int edtEtx_Nmprog_Backcolor ;
   private int edtEtx_idprog_Backcolor ;
   private int edtEtx_Reemp_Backcolor ;
   private int edtEtx_Coord_Backcolor ;
   private int edtEtx_FecEnt_Backcolor ;
   private int edtEtx_FecP_Backcolor ;
   private int edtEtx_DibC_Backcolor ;
   private int edtEtx_DibI_Backcolor ;
   private int edtEtx_Pro_Backcolor ;
   private int edtEtx_Art_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEtx_Dib_Backcolor ;
   private int edtEtx_Ped_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ8786Etx_DibI ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z8782Etx_Ped ;
   private String Z8783Etx_Dib ;
   private String Z8784Etx_Art ;
   private String Z8785Etx_Pro ;
   private String Z8787Etx_DibC ;
   private String Z8790Etx_Coord ;
   private String Z8791Etx_Reemp ;
   private String Z8792Etx_idprog ;
   private String Z8793Etx_Nmprog ;
   private String Z8794Etx_Claspe ;
   private String Z8795Etx_NmClas ;
   private String Z8796Etx_Id ;
   private String Z8797Etx_NmId ;
   private String Z8798Etx_Agente ;
   private String Z8799Etx_NmAgen ;
   private String Z8801Etx_TipAge ;
   private String Z8802Etx_TipPlt ;
   private String Z8829Etx_CiroTr ;
   private String Z8872Etx_Prog ;
   private String Z8874Etx_UsuCBE ;
   private String Z8875Etx_CloTJ ;
   private String Z8876Etx_CloES ;
   private String Z8945Etx_Muestr ;
   private String Z9563Etx_usuC ;
   private String Z9565Etx_item1 ;
   private String Z9567Etx_item4 ;
   private String Z9566Etx_item3 ;
   private String Z9599Etx_DibCO ;
   private String Z9601Etx_usuCOE ;
   private String Z12958Etx_Inv ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEtx_Ped_Internalname ;
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
   private String A8782Etx_Ped ;
   private String edtEtx_Ped_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEtx_Dib_Internalname ;
   private String A8783Etx_Dib ;
   private String edtEtx_Dib_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEtx_Art_Internalname ;
   private String A8784Etx_Art ;
   private String edtEtx_Art_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEtx_Pro_Internalname ;
   private String A8785Etx_Pro ;
   private String edtEtx_Pro_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEtx_DibI_Internalname ;
   private String edtEtx_DibI_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEtx_DibC_Internalname ;
   private String A8787Etx_DibC ;
   private String edtEtx_DibC_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEtx_FecP_Internalname ;
   private String edtEtx_FecP_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEtx_FecEnt_Internalname ;
   private String edtEtx_FecEnt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEtx_Coord_Internalname ;
   private String A8790Etx_Coord ;
   private String edtEtx_Coord_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEtx_Reemp_Internalname ;
   private String A8791Etx_Reemp ;
   private String edtEtx_Reemp_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEtx_idprog_Internalname ;
   private String A8792Etx_idprog ;
   private String edtEtx_idprog_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEtx_Nmprog_Internalname ;
   private String A8793Etx_Nmprog ;
   private String edtEtx_Nmprog_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtEtx_Claspe_Internalname ;
   private String A8794Etx_Claspe ;
   private String edtEtx_Claspe_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEtx_NmClas_Internalname ;
   private String A8795Etx_NmClas ;
   private String edtEtx_NmClas_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtEtx_Id_Internalname ;
   private String A8796Etx_Id ;
   private String edtEtx_Id_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtEtx_NmId_Internalname ;
   private String A8797Etx_NmId ;
   private String edtEtx_NmId_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtEtx_Agente_Internalname ;
   private String A8798Etx_Agente ;
   private String edtEtx_Agente_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtEtx_NmAgen_Internalname ;
   private String A8799Etx_NmAgen ;
   private String edtEtx_NmAgen_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtEtx_GruFam_Internalname ;
   private String edtEtx_GruFam_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtEtx_TipAge_Internalname ;
   private String A8801Etx_TipAge ;
   private String edtEtx_TipAge_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtEtx_TipPlt_Internalname ;
   private String A8802Etx_TipPlt ;
   private String edtEtx_TipPlt_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtEtx_ObsPed_Internalname ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtEtx_ObsTej_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtEtx_Est_Internalname ;
   private String edtEtx_Est_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtEtx_Ests_Internalname ;
   private String edtEtx_Ests_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtEtx_CiroTr_Internalname ;
   private String A8829Etx_CiroTr ;
   private String edtEtx_CiroTr_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtEtx_FCompT_Internalname ;
   private String edtEtx_FCompT_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtEtx_FCompO_Internalname ;
   private String edtEtx_FCompO_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtEtx_Prog_Internalname ;
   private String A8872Etx_Prog ;
   private String edtEtx_Prog_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtEtx_FPedCB_Internalname ;
   private String edtEtx_FPedCB_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtEtx_UsuCBE_Internalname ;
   private String A8874Etx_UsuCBE ;
   private String edtEtx_UsuCBE_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtEtx_CloTJ_Internalname ;
   private String A8875Etx_CloTJ ;
   private String edtEtx_CloTJ_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtEtx_CloES_Internalname ;
   private String A8876Etx_CloES ;
   private String edtEtx_CloES_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtEtx_Muestr_Internalname ;
   private String A8945Etx_Muestr ;
   private String edtEtx_Muestr_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtEtx_otoe_Internalname ;
   private String edtEtx_otoe_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtEtx_usuC_Internalname ;
   private String A9563Etx_usuC ;
   private String edtEtx_usuC_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtEtx_DhC_Internalname ;
   private String edtEtx_DhC_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtEtx_item1_Internalname ;
   private String A9565Etx_item1 ;
   private String edtEtx_item1_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtEtx_item4_Internalname ;
   private String A9567Etx_item4 ;
   private String edtEtx_item4_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtEtx_item3_Internalname ;
   private String A9566Etx_item3 ;
   private String edtEtx_item3_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtEtx_DibCO_Internalname ;
   private String A9599Etx_DibCO ;
   private String edtEtx_DibCO_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtEtx_FComOE_Internalname ;
   private String edtEtx_FComOE_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtEtx_usuCOE_Internalname ;
   private String A9601Etx_usuCOE ;
   private String edtEtx_usuCOE_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtEtx_EstV_Internalname ;
   private String edtEtx_EstV_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtEtx_Inv_Internalname ;
   private String A12958Etx_Inv ;
   private String edtEtx_Inv_Jsonclick ;
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
   private String Z279CliNom ;
   private String sMode1198 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ8782Etx_Ped ;
   private String ZZ8783Etx_Dib ;
   private String ZZ407EmprNom ;
   private String ZZ8784Etx_Art ;
   private String ZZ8785Etx_Pro ;
   private String ZZ8787Etx_DibC ;
   private String ZZ8790Etx_Coord ;
   private String ZZ8791Etx_Reemp ;
   private String ZZ8792Etx_idprog ;
   private String ZZ8793Etx_Nmprog ;
   private String ZZ8794Etx_Claspe ;
   private String ZZ8795Etx_NmClas ;
   private String ZZ8796Etx_Id ;
   private String ZZ8797Etx_NmId ;
   private String ZZ8798Etx_Agente ;
   private String ZZ8799Etx_NmAgen ;
   private String ZZ8801Etx_TipAge ;
   private String ZZ8802Etx_TipPlt ;
   private String ZZ8829Etx_CiroTr ;
   private String ZZ8872Etx_Prog ;
   private String ZZ8874Etx_UsuCBE ;
   private String ZZ8875Etx_CloTJ ;
   private String ZZ8876Etx_CloES ;
   private String ZZ8945Etx_Muestr ;
   private String ZZ9563Etx_usuC ;
   private String ZZ9565Etx_item1 ;
   private String ZZ9567Etx_item4 ;
   private String ZZ9566Etx_item3 ;
   private String ZZ9599Etx_DibCO ;
   private String ZZ9601Etx_usuCOE ;
   private String ZZ12958Etx_Inv ;
   private String ZZ279CliNom ;
   private java.util.Date Z8873Etx_FPedCB ;
   private java.util.Date Z9564Etx_DhC ;
   private java.util.Date A8873Etx_FPedCB ;
   private java.util.Date A9564Etx_DhC ;
   private java.util.Date ZZ8873Etx_FPedCB ;
   private java.util.Date ZZ9564Etx_DhC ;
   private java.util.Date Z8788Etx_FecP ;
   private java.util.Date Z8789Etx_FecEnt ;
   private java.util.Date Z8870Etx_FCompT ;
   private java.util.Date Z8871Etx_FCompO ;
   private java.util.Date Z9600Etx_FComOE ;
   private java.util.Date A8788Etx_FecP ;
   private java.util.Date A8789Etx_FecEnt ;
   private java.util.Date A8870Etx_FCompT ;
   private java.util.Date A8871Etx_FCompO ;
   private java.util.Date A9600Etx_FComOE ;
   private java.util.Date ZZ8788Etx_FecP ;
   private java.util.Date ZZ8789Etx_FecEnt ;
   private java.util.Date ZZ8870Etx_FCompT ;
   private java.util.Date ZZ8871Etx_FCompO ;
   private java.util.Date ZZ9600Etx_FComOE ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n8784Etx_Art ;
   private boolean n8785Etx_Pro ;
   private boolean n8786Etx_DibI ;
   private boolean n8787Etx_DibC ;
   private boolean n8788Etx_FecP ;
   private boolean n8789Etx_FecEnt ;
   private boolean n8790Etx_Coord ;
   private boolean n8791Etx_Reemp ;
   private boolean n8792Etx_idprog ;
   private boolean n8793Etx_Nmprog ;
   private boolean n8794Etx_Claspe ;
   private boolean n8795Etx_NmClas ;
   private boolean n8796Etx_Id ;
   private boolean n8797Etx_NmId ;
   private boolean n8798Etx_Agente ;
   private boolean n8799Etx_NmAgen ;
   private boolean n8800Etx_GruFam ;
   private boolean n8801Etx_TipAge ;
   private boolean n8802Etx_TipPlt ;
   private boolean n8803Etx_ObsPed ;
   private boolean n8804Etx_ObsTej ;
   private boolean n8805Etx_Est ;
   private boolean n8806Etx_Ests ;
   private boolean n8829Etx_CiroTr ;
   private boolean n8870Etx_FCompT ;
   private boolean n8871Etx_FCompO ;
   private boolean n8872Etx_Prog ;
   private boolean n8873Etx_FPedCB ;
   private boolean n8874Etx_UsuCBE ;
   private boolean n8875Etx_CloTJ ;
   private boolean n8876Etx_CloES ;
   private boolean n8945Etx_Muestr ;
   private boolean n9394Etx_otoe ;
   private boolean n9563Etx_usuC ;
   private boolean n9564Etx_DhC ;
   private boolean n9565Etx_item1 ;
   private boolean n9567Etx_item4 ;
   private boolean n9566Etx_item3 ;
   private boolean n9599Etx_DibCO ;
   private boolean n9600Etx_FComOE ;
   private boolean n9601Etx_usuCOE ;
   private boolean n12207Etx_EstV ;
   private boolean n12958Etx_Inv ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z8803Etx_ObsPed ;
   private String Z8804Etx_ObsTej ;
   private String A8803Etx_ObsPed ;
   private String A8804Etx_ObsTej ;
   private String ZZ8803Etx_ObsPed ;
   private String ZZ8804Etx_ObsTej ;
   private IDataStoreProvider pr_default ;
   private String[] T012U4_A407EmprNom ;
   private boolean[] T012U4_n407EmprNom ;
   private String[] T012U6_A8782Etx_Ped ;
   private String[] T012U6_A8783Etx_Dib ;
   private String[] T012U6_A407EmprNom ;
   private boolean[] T012U6_n407EmprNom ;
   private String[] T012U6_A279CliNom ;
   private String[] T012U6_A8784Etx_Art ;
   private boolean[] T012U6_n8784Etx_Art ;
   private String[] T012U6_A8785Etx_Pro ;
   private boolean[] T012U6_n8785Etx_Pro ;
   private int[] T012U6_A8786Etx_DibI ;
   private boolean[] T012U6_n8786Etx_DibI ;
   private String[] T012U6_A8787Etx_DibC ;
   private boolean[] T012U6_n8787Etx_DibC ;
   private java.util.Date[] T012U6_A8788Etx_FecP ;
   private boolean[] T012U6_n8788Etx_FecP ;
   private java.util.Date[] T012U6_A8789Etx_FecEnt ;
   private boolean[] T012U6_n8789Etx_FecEnt ;
   private String[] T012U6_A8790Etx_Coord ;
   private boolean[] T012U6_n8790Etx_Coord ;
   private String[] T012U6_A8791Etx_Reemp ;
   private boolean[] T012U6_n8791Etx_Reemp ;
   private String[] T012U6_A8792Etx_idprog ;
   private boolean[] T012U6_n8792Etx_idprog ;
   private String[] T012U6_A8793Etx_Nmprog ;
   private boolean[] T012U6_n8793Etx_Nmprog ;
   private String[] T012U6_A8794Etx_Claspe ;
   private boolean[] T012U6_n8794Etx_Claspe ;
   private String[] T012U6_A8795Etx_NmClas ;
   private boolean[] T012U6_n8795Etx_NmClas ;
   private String[] T012U6_A8796Etx_Id ;
   private boolean[] T012U6_n8796Etx_Id ;
   private String[] T012U6_A8797Etx_NmId ;
   private boolean[] T012U6_n8797Etx_NmId ;
   private String[] T012U6_A8798Etx_Agente ;
   private boolean[] T012U6_n8798Etx_Agente ;
   private String[] T012U6_A8799Etx_NmAgen ;
   private boolean[] T012U6_n8799Etx_NmAgen ;
   private short[] T012U6_A8800Etx_GruFam ;
   private boolean[] T012U6_n8800Etx_GruFam ;
   private String[] T012U6_A8801Etx_TipAge ;
   private boolean[] T012U6_n8801Etx_TipAge ;
   private String[] T012U6_A8802Etx_TipPlt ;
   private boolean[] T012U6_n8802Etx_TipPlt ;
   private String[] T012U6_A8803Etx_ObsPed ;
   private boolean[] T012U6_n8803Etx_ObsPed ;
   private String[] T012U6_A8804Etx_ObsTej ;
   private boolean[] T012U6_n8804Etx_ObsTej ;
   private byte[] T012U6_A8805Etx_Est ;
   private boolean[] T012U6_n8805Etx_Est ;
   private byte[] T012U6_A8806Etx_Ests ;
   private boolean[] T012U6_n8806Etx_Ests ;
   private String[] T012U6_A8829Etx_CiroTr ;
   private boolean[] T012U6_n8829Etx_CiroTr ;
   private java.util.Date[] T012U6_A8870Etx_FCompT ;
   private boolean[] T012U6_n8870Etx_FCompT ;
   private java.util.Date[] T012U6_A8871Etx_FCompO ;
   private boolean[] T012U6_n8871Etx_FCompO ;
   private String[] T012U6_A8872Etx_Prog ;
   private boolean[] T012U6_n8872Etx_Prog ;
   private java.util.Date[] T012U6_A8873Etx_FPedCB ;
   private boolean[] T012U6_n8873Etx_FPedCB ;
   private String[] T012U6_A8874Etx_UsuCBE ;
   private boolean[] T012U6_n8874Etx_UsuCBE ;
   private String[] T012U6_A8875Etx_CloTJ ;
   private boolean[] T012U6_n8875Etx_CloTJ ;
   private String[] T012U6_A8876Etx_CloES ;
   private boolean[] T012U6_n8876Etx_CloES ;
   private String[] T012U6_A8945Etx_Muestr ;
   private boolean[] T012U6_n8945Etx_Muestr ;
   private byte[] T012U6_A9394Etx_otoe ;
   private boolean[] T012U6_n9394Etx_otoe ;
   private String[] T012U6_A9563Etx_usuC ;
   private boolean[] T012U6_n9563Etx_usuC ;
   private java.util.Date[] T012U6_A9564Etx_DhC ;
   private boolean[] T012U6_n9564Etx_DhC ;
   private String[] T012U6_A9565Etx_item1 ;
   private boolean[] T012U6_n9565Etx_item1 ;
   private String[] T012U6_A9567Etx_item4 ;
   private boolean[] T012U6_n9567Etx_item4 ;
   private String[] T012U6_A9566Etx_item3 ;
   private boolean[] T012U6_n9566Etx_item3 ;
   private String[] T012U6_A9599Etx_DibCO ;
   private boolean[] T012U6_n9599Etx_DibCO ;
   private java.util.Date[] T012U6_A9600Etx_FComOE ;
   private boolean[] T012U6_n9600Etx_FComOE ;
   private String[] T012U6_A9601Etx_usuCOE ;
   private boolean[] T012U6_n9601Etx_usuCOE ;
   private byte[] T012U6_A12207Etx_EstV ;
   private boolean[] T012U6_n12207Etx_EstV ;
   private String[] T012U6_A12958Etx_Inv ;
   private boolean[] T012U6_n12958Etx_Inv ;
   private String[] T012U6_A396EmprCod ;
   private int[] T012U6_A252CliCod ;
   private boolean[] T012U6_n252CliCod ;
   private String[] T012U5_A279CliNom ;
   private String[] T012U7_A279CliNom ;
   private String[] T012U8_A396EmprCod ;
   private String[] T012U8_A8782Etx_Ped ;
   private String[] T012U8_A8783Etx_Dib ;
   private String[] T012U3_A8782Etx_Ped ;
   private String[] T012U3_A8783Etx_Dib ;
   private String[] T012U3_A8784Etx_Art ;
   private boolean[] T012U3_n8784Etx_Art ;
   private String[] T012U3_A8785Etx_Pro ;
   private boolean[] T012U3_n8785Etx_Pro ;
   private int[] T012U3_A8786Etx_DibI ;
   private boolean[] T012U3_n8786Etx_DibI ;
   private String[] T012U3_A8787Etx_DibC ;
   private boolean[] T012U3_n8787Etx_DibC ;
   private java.util.Date[] T012U3_A8788Etx_FecP ;
   private boolean[] T012U3_n8788Etx_FecP ;
   private java.util.Date[] T012U3_A8789Etx_FecEnt ;
   private boolean[] T012U3_n8789Etx_FecEnt ;
   private String[] T012U3_A8790Etx_Coord ;
   private boolean[] T012U3_n8790Etx_Coord ;
   private String[] T012U3_A8791Etx_Reemp ;
   private boolean[] T012U3_n8791Etx_Reemp ;
   private String[] T012U3_A8792Etx_idprog ;
   private boolean[] T012U3_n8792Etx_idprog ;
   private String[] T012U3_A8793Etx_Nmprog ;
   private boolean[] T012U3_n8793Etx_Nmprog ;
   private String[] T012U3_A8794Etx_Claspe ;
   private boolean[] T012U3_n8794Etx_Claspe ;
   private String[] T012U3_A8795Etx_NmClas ;
   private boolean[] T012U3_n8795Etx_NmClas ;
   private String[] T012U3_A8796Etx_Id ;
   private boolean[] T012U3_n8796Etx_Id ;
   private String[] T012U3_A8797Etx_NmId ;
   private boolean[] T012U3_n8797Etx_NmId ;
   private String[] T012U3_A8798Etx_Agente ;
   private boolean[] T012U3_n8798Etx_Agente ;
   private String[] T012U3_A8799Etx_NmAgen ;
   private boolean[] T012U3_n8799Etx_NmAgen ;
   private short[] T012U3_A8800Etx_GruFam ;
   private boolean[] T012U3_n8800Etx_GruFam ;
   private String[] T012U3_A8801Etx_TipAge ;
   private boolean[] T012U3_n8801Etx_TipAge ;
   private String[] T012U3_A8802Etx_TipPlt ;
   private boolean[] T012U3_n8802Etx_TipPlt ;
   private String[] T012U3_A8803Etx_ObsPed ;
   private boolean[] T012U3_n8803Etx_ObsPed ;
   private String[] T012U3_A8804Etx_ObsTej ;
   private boolean[] T012U3_n8804Etx_ObsTej ;
   private byte[] T012U3_A8805Etx_Est ;
   private boolean[] T012U3_n8805Etx_Est ;
   private byte[] T012U3_A8806Etx_Ests ;
   private boolean[] T012U3_n8806Etx_Ests ;
   private String[] T012U3_A8829Etx_CiroTr ;
   private boolean[] T012U3_n8829Etx_CiroTr ;
   private java.util.Date[] T012U3_A8870Etx_FCompT ;
   private boolean[] T012U3_n8870Etx_FCompT ;
   private java.util.Date[] T012U3_A8871Etx_FCompO ;
   private boolean[] T012U3_n8871Etx_FCompO ;
   private String[] T012U3_A8872Etx_Prog ;
   private boolean[] T012U3_n8872Etx_Prog ;
   private java.util.Date[] T012U3_A8873Etx_FPedCB ;
   private boolean[] T012U3_n8873Etx_FPedCB ;
   private String[] T012U3_A8874Etx_UsuCBE ;
   private boolean[] T012U3_n8874Etx_UsuCBE ;
   private String[] T012U3_A8875Etx_CloTJ ;
   private boolean[] T012U3_n8875Etx_CloTJ ;
   private String[] T012U3_A8876Etx_CloES ;
   private boolean[] T012U3_n8876Etx_CloES ;
   private String[] T012U3_A8945Etx_Muestr ;
   private boolean[] T012U3_n8945Etx_Muestr ;
   private byte[] T012U3_A9394Etx_otoe ;
   private boolean[] T012U3_n9394Etx_otoe ;
   private String[] T012U3_A9563Etx_usuC ;
   private boolean[] T012U3_n9563Etx_usuC ;
   private java.util.Date[] T012U3_A9564Etx_DhC ;
   private boolean[] T012U3_n9564Etx_DhC ;
   private String[] T012U3_A9565Etx_item1 ;
   private boolean[] T012U3_n9565Etx_item1 ;
   private String[] T012U3_A9567Etx_item4 ;
   private boolean[] T012U3_n9567Etx_item4 ;
   private String[] T012U3_A9566Etx_item3 ;
   private boolean[] T012U3_n9566Etx_item3 ;
   private String[] T012U3_A9599Etx_DibCO ;
   private boolean[] T012U3_n9599Etx_DibCO ;
   private java.util.Date[] T012U3_A9600Etx_FComOE ;
   private boolean[] T012U3_n9600Etx_FComOE ;
   private String[] T012U3_A9601Etx_usuCOE ;
   private boolean[] T012U3_n9601Etx_usuCOE ;
   private byte[] T012U3_A12207Etx_EstV ;
   private boolean[] T012U3_n12207Etx_EstV ;
   private String[] T012U3_A12958Etx_Inv ;
   private boolean[] T012U3_n12958Etx_Inv ;
   private String[] T012U3_A396EmprCod ;
   private int[] T012U3_A252CliCod ;
   private boolean[] T012U3_n252CliCod ;
   private String[] T012U9_A396EmprCod ;
   private String[] T012U9_A8782Etx_Ped ;
   private String[] T012U9_A8783Etx_Dib ;
   private String[] T012U10_A396EmprCod ;
   private String[] T012U10_A8782Etx_Ped ;
   private String[] T012U10_A8783Etx_Dib ;
   private String[] T012U2_A8782Etx_Ped ;
   private String[] T012U2_A8783Etx_Dib ;
   private String[] T012U2_A8784Etx_Art ;
   private boolean[] T012U2_n8784Etx_Art ;
   private String[] T012U2_A8785Etx_Pro ;
   private boolean[] T012U2_n8785Etx_Pro ;
   private int[] T012U2_A8786Etx_DibI ;
   private boolean[] T012U2_n8786Etx_DibI ;
   private String[] T012U2_A8787Etx_DibC ;
   private boolean[] T012U2_n8787Etx_DibC ;
   private java.util.Date[] T012U2_A8788Etx_FecP ;
   private boolean[] T012U2_n8788Etx_FecP ;
   private java.util.Date[] T012U2_A8789Etx_FecEnt ;
   private boolean[] T012U2_n8789Etx_FecEnt ;
   private String[] T012U2_A8790Etx_Coord ;
   private boolean[] T012U2_n8790Etx_Coord ;
   private String[] T012U2_A8791Etx_Reemp ;
   private boolean[] T012U2_n8791Etx_Reemp ;
   private String[] T012U2_A8792Etx_idprog ;
   private boolean[] T012U2_n8792Etx_idprog ;
   private String[] T012U2_A8793Etx_Nmprog ;
   private boolean[] T012U2_n8793Etx_Nmprog ;
   private String[] T012U2_A8794Etx_Claspe ;
   private boolean[] T012U2_n8794Etx_Claspe ;
   private String[] T012U2_A8795Etx_NmClas ;
   private boolean[] T012U2_n8795Etx_NmClas ;
   private String[] T012U2_A8796Etx_Id ;
   private boolean[] T012U2_n8796Etx_Id ;
   private String[] T012U2_A8797Etx_NmId ;
   private boolean[] T012U2_n8797Etx_NmId ;
   private String[] T012U2_A8798Etx_Agente ;
   private boolean[] T012U2_n8798Etx_Agente ;
   private String[] T012U2_A8799Etx_NmAgen ;
   private boolean[] T012U2_n8799Etx_NmAgen ;
   private short[] T012U2_A8800Etx_GruFam ;
   private boolean[] T012U2_n8800Etx_GruFam ;
   private String[] T012U2_A8801Etx_TipAge ;
   private boolean[] T012U2_n8801Etx_TipAge ;
   private String[] T012U2_A8802Etx_TipPlt ;
   private boolean[] T012U2_n8802Etx_TipPlt ;
   private String[] T012U2_A8803Etx_ObsPed ;
   private boolean[] T012U2_n8803Etx_ObsPed ;
   private String[] T012U2_A8804Etx_ObsTej ;
   private boolean[] T012U2_n8804Etx_ObsTej ;
   private byte[] T012U2_A8805Etx_Est ;
   private boolean[] T012U2_n8805Etx_Est ;
   private byte[] T012U2_A8806Etx_Ests ;
   private boolean[] T012U2_n8806Etx_Ests ;
   private String[] T012U2_A8829Etx_CiroTr ;
   private boolean[] T012U2_n8829Etx_CiroTr ;
   private java.util.Date[] T012U2_A8870Etx_FCompT ;
   private boolean[] T012U2_n8870Etx_FCompT ;
   private java.util.Date[] T012U2_A8871Etx_FCompO ;
   private boolean[] T012U2_n8871Etx_FCompO ;
   private String[] T012U2_A8872Etx_Prog ;
   private boolean[] T012U2_n8872Etx_Prog ;
   private java.util.Date[] T012U2_A8873Etx_FPedCB ;
   private boolean[] T012U2_n8873Etx_FPedCB ;
   private String[] T012U2_A8874Etx_UsuCBE ;
   private boolean[] T012U2_n8874Etx_UsuCBE ;
   private String[] T012U2_A8875Etx_CloTJ ;
   private boolean[] T012U2_n8875Etx_CloTJ ;
   private String[] T012U2_A8876Etx_CloES ;
   private boolean[] T012U2_n8876Etx_CloES ;
   private String[] T012U2_A8945Etx_Muestr ;
   private boolean[] T012U2_n8945Etx_Muestr ;
   private byte[] T012U2_A9394Etx_otoe ;
   private boolean[] T012U2_n9394Etx_otoe ;
   private String[] T012U2_A9563Etx_usuC ;
   private boolean[] T012U2_n9563Etx_usuC ;
   private java.util.Date[] T012U2_A9564Etx_DhC ;
   private boolean[] T012U2_n9564Etx_DhC ;
   private String[] T012U2_A9565Etx_item1 ;
   private boolean[] T012U2_n9565Etx_item1 ;
   private String[] T012U2_A9567Etx_item4 ;
   private boolean[] T012U2_n9567Etx_item4 ;
   private String[] T012U2_A9566Etx_item3 ;
   private boolean[] T012U2_n9566Etx_item3 ;
   private String[] T012U2_A9599Etx_DibCO ;
   private boolean[] T012U2_n9599Etx_DibCO ;
   private java.util.Date[] T012U2_A9600Etx_FComOE ;
   private boolean[] T012U2_n9600Etx_FComOE ;
   private String[] T012U2_A9601Etx_usuCOE ;
   private boolean[] T012U2_n9601Etx_usuCOE ;
   private byte[] T012U2_A12207Etx_EstV ;
   private boolean[] T012U2_n12207Etx_EstV ;
   private String[] T012U2_A12958Etx_Inv ;
   private boolean[] T012U2_n12958Etx_Inv ;
   private String[] T012U2_A396EmprCod ;
   private int[] T012U2_A252CliCod ;
   private boolean[] T012U2_n252CliCod ;
   private String[] T012U14_A279CliNom ;
   private String[] T012U15_A396EmprCod ;
   private String[] T012U15_A8782Etx_Ped ;
   private String[] T012U15_A8783Etx_Dib ;
   private String[] T012U15_A8820Etx_ColV ;
   private int[] T012U15_A8869Etx_ColVN ;
   private short[] T012U15_A8821Etx_LinL ;
   private String[] T012U16_A396EmprCod ;
   private String[] T012U16_A8782Etx_Ped ;
   private String[] T012U16_A8783Etx_Dib ;
   private String[] T012U16_A8824Etx_Nvar ;
   private short[] T012U16_A8825Etx_Linh ;
   private String[] T012U17_A396EmprCod ;
   private String[] T012U17_A8782Etx_Ped ;
   private String[] T012U17_A8783Etx_Dib ;
   private short[] T012U17_A8808Etx_Lin ;
   private String[] T012U18_A396EmprCod ;
   private String[] T012U18_A8782Etx_Ped ;
   private String[] T012U18_A8783Etx_Dib ;
   private String[] T012U19_A407EmprNom ;
   private boolean[] T012U19_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcpdetx__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpdetx__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpdetx__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpdetx__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcpdetx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T012U2", "SELECT Etx_Ped, Etx_Dib, Etx_Art, Etx_Pro, Etx_DibI, Etx_DibC, Etx_FecP, Etx_FecEnt, Etx_Coord, Etx_Reemp, Etx_idprog, Etx_Nmprog, Etx_Claspe, Etx_NmClas, Etx_Id, Etx_NmId, Etx_Agente, Etx_NmAgen, Etx_GruFam, Etx_TipAge, Etx_TipPlt, Etx_ObsPed, Etx_ObsTej, Etx_Est, Etx_Ests, Etx_CiroTr, Etx_FCompT, Etx_FCompO, Etx_Prog, Etx_FPedCB, Etx_UsuCBE, Etx_CloTJ, Etx_CloES, Etx_Muestr, Etx_otoe, Etx_usuC, Etx_DhC, Etx_item1, Etx_item4, Etx_item3, Etx_DibCO, Etx_FComOE, Etx_usuCOE, Etx_EstV, Etx_Inv, EmprCod, CliCod FROM TXPCPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?  FOR UPDATE OF Etx_Art, Etx_Pro, Etx_DibI, Etx_DibC, Etx_FecP, Etx_FecEnt, Etx_Coord, Etx_Reemp, Etx_idprog, Etx_Nmprog, Etx_Claspe, Etx_NmClas, Etx_Id, Etx_NmId, Etx_Agente, Etx_NmAgen, Etx_GruFam, Etx_TipAge, Etx_TipPlt, Etx_ObsPed, Etx_ObsTej, Etx_Est, Etx_Ests, Etx_CiroTr, Etx_FCompT, Etx_FCompO, Etx_Prog, Etx_FPedCB, Etx_UsuCBE, Etx_CloTJ, Etx_CloES, Etx_Muestr, Etx_otoe, Etx_usuC, Etx_DhC, Etx_item1, Etx_item4, Etx_item3, Etx_DibCO, Etx_FComOE, Etx_usuCOE, Etx_EstV, Etx_Inv, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U3", "SELECT Etx_Ped, Etx_Dib, Etx_Art, Etx_Pro, Etx_DibI, Etx_DibC, Etx_FecP, Etx_FecEnt, Etx_Coord, Etx_Reemp, Etx_idprog, Etx_Nmprog, Etx_Claspe, Etx_NmClas, Etx_Id, Etx_NmId, Etx_Agente, Etx_NmAgen, Etx_GruFam, Etx_TipAge, Etx_TipPlt, Etx_ObsPed, Etx_ObsTej, Etx_Est, Etx_Ests, Etx_CiroTr, Etx_FCompT, Etx_FCompO, Etx_Prog, Etx_FPedCB, Etx_UsuCBE, Etx_CloTJ, Etx_CloES, Etx_Muestr, Etx_otoe, Etx_usuC, Etx_DhC, Etx_item1, Etx_item4, Etx_item3, Etx_DibCO, Etx_FComOE, Etx_usuCOE, Etx_EstV, Etx_Inv, EmprCod, CliCod FROM TXPCPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U6", "SELECT /*+ FIRST_ROWS(100) */ TM1.Etx_Ped, TM1.Etx_Dib, T2.EmprNom, T3.CliNom, TM1.Etx_Art, TM1.Etx_Pro, TM1.Etx_DibI, TM1.Etx_DibC, TM1.Etx_FecP, TM1.Etx_FecEnt, TM1.Etx_Coord, TM1.Etx_Reemp, TM1.Etx_idprog, TM1.Etx_Nmprog, TM1.Etx_Claspe, TM1.Etx_NmClas, TM1.Etx_Id, TM1.Etx_NmId, TM1.Etx_Agente, TM1.Etx_NmAgen, TM1.Etx_GruFam, TM1.Etx_TipAge, TM1.Etx_TipPlt, TM1.Etx_ObsPed, TM1.Etx_ObsTej, TM1.Etx_Est, TM1.Etx_Ests, TM1.Etx_CiroTr, TM1.Etx_FCompT, TM1.Etx_FCompO, TM1.Etx_Prog, TM1.Etx_FPedCB, TM1.Etx_UsuCBE, TM1.Etx_CloTJ, TM1.Etx_CloES, TM1.Etx_Muestr, TM1.Etx_otoe, TM1.Etx_usuC, TM1.Etx_DhC, TM1.Etx_item1, TM1.Etx_item4, TM1.Etx_item3, TM1.Etx_DibCO, TM1.Etx_FComOE, TM1.Etx_usuCOE, TM1.Etx_EstV, TM1.Etx_Inv, TM1.EmprCod, TM1.CliCod FROM ((TXPCPDETX TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.Etx_Ped = ? and TM1.Etx_Dib = ? ORDER BY TM1.EmprCod, TM1.Etx_Ped, TM1.Etx_Dib ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Etx_Ped, Etx_Dib FROM TXPCPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Etx_Ped, Etx_Dib FROM TXPCPDETX WHERE ( Etx_Ped > ? or Etx_Ped = ? and Etx_Dib > ?) and EmprCod = ? ORDER BY EmprCod, Etx_Ped, Etx_Dib) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012U10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Etx_Ped, Etx_Dib FROM TXPCPDETX WHERE ( Etx_Ped < ? or Etx_Ped = ? and Etx_Dib < ?) and EmprCod = ? ORDER BY EmprCod DESC, Etx_Ped DESC, Etx_Dib DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012U11", "INSERT INTO TXPCPDETX(Etx_Ped, Etx_Dib, Etx_Art, Etx_Pro, Etx_DibI, Etx_DibC, Etx_FecP, Etx_FecEnt, Etx_Coord, Etx_Reemp, Etx_idprog, Etx_Nmprog, Etx_Claspe, Etx_NmClas, Etx_Id, Etx_NmId, Etx_Agente, Etx_NmAgen, Etx_GruFam, Etx_TipAge, Etx_TipPlt, Etx_ObsPed, Etx_ObsTej, Etx_Est, Etx_Ests, Etx_CiroTr, Etx_FCompT, Etx_FCompO, Etx_Prog, Etx_FPedCB, Etx_UsuCBE, Etx_CloTJ, Etx_CloES, Etx_Muestr, Etx_otoe, Etx_usuC, Etx_DhC, Etx_item1, Etx_item4, Etx_item3, Etx_DibCO, Etx_FComOE, Etx_usuCOE, Etx_EstV, Etx_Inv, EmprCod, CliCod, Etx_Ulin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCPDETX")
         ,new UpdateCursor("T012U12", "UPDATE TXPCPDETX SET Etx_Art=?, Etx_Pro=?, Etx_DibI=?, Etx_DibC=?, Etx_FecP=?, Etx_FecEnt=?, Etx_Coord=?, Etx_Reemp=?, Etx_idprog=?, Etx_Nmprog=?, Etx_Claspe=?, Etx_NmClas=?, Etx_Id=?, Etx_NmId=?, Etx_Agente=?, Etx_NmAgen=?, Etx_GruFam=?, Etx_TipAge=?, Etx_TipPlt=?, Etx_ObsPed=?, Etx_ObsTej=?, Etx_Est=?, Etx_Ests=?, Etx_CiroTr=?, Etx_FCompT=?, Etx_FCompO=?, Etx_Prog=?, Etx_FPedCB=?, Etx_UsuCBE=?, Etx_CloTJ=?, Etx_CloES=?, Etx_Muestr=?, Etx_otoe=?, Etx_usuC=?, Etx_DhC=?, Etx_item1=?, Etx_item4=?, Etx_item3=?, Etx_DibCO=?, Etx_FComOE=?, Etx_usuCOE=?, Etx_EstV=?, Etx_Inv=?, CliCod=?  WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?", GX_NOMASK, "TXPCPDETX")
         ,new UpdateCursor("T012U13", "DELETE FROM TXPCPDETX  WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?", GX_NOMASK, "TXPCPDETX")
         ,new ForEachCursor("T012U14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U15", "SELECT * FROM (SELECT EmprCod, Etx_Ped, Etx_Dib, Etx_ColV, Etx_ColVN, Etx_LinL FROM TXPHPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012U16", "SELECT * FROM (SELECT EmprCod, Etx_Ped, Etx_Dib, Etx_Nvar, Etx_Linh FROM TXPPPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012U17", "SELECT * FROM (SELECT EmprCod, Etx_Ped, Etx_Dib, Etx_Lin FROM TXPLPDETX WHERE EmprCod = ? AND Etx_Ped = ? AND Etx_Dib = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012U18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Etx_Ped, Etx_Dib FROM TXPCPDETX WHERE EmprCod = ? ORDER BY EmprCod, Etx_Ped, Etx_Dib ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012U19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 51);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 11);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 51);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 11);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 51);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 11);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 51);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDateTime(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(38, 11);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(39, 11);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(40, 11);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(41, 16);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[80])[0] = rslt.getGXDate(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(43, 8);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 3);
               ((int[]) buf[89])[0] = rslt.getInt(47);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 51);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 11);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 51);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 11);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 51);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 11);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 51);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((byte[]) buf[66])[0] = rslt.getByte(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDateTime(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(38, 11);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(39, 11);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(40, 11);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(41, 16);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[80])[0] = rslt.getGXDate(42);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(43, 8);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(45, 4);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 3);
               ((int[]) buf[89])[0] = rslt.getInt(47);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 11);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 51);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 11);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 51);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 11);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 51);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 11);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 51);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDateTime(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(33, 8);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((byte[]) buf[69])[0] = rslt.getByte(37);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(38, 8);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDateTime(39);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(40, 11);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(41, 11);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(42, 11);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(43, 16);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[83])[0] = rslt.getGXDate(44);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(45, 8);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(46);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(47, 4);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(48, 3);
               ((int[]) buf[92])[0] = rslt.getInt(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 11);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 17 :
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 11);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 51);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 11);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 51);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[27], 11);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 51);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[31], 11);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[33], 51);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[41], 800);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[43], 800);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DATE );
               }
               else
               {
                  stmt.setDate(27, (java.util.Date)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DATE );
               }
               else
               {
                  stmt.setDate(28, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(30, (java.util.Date)parms[57], false);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[59], 8);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[67]).byteValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[69], 8);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(37, (java.util.Date)parms[71], false);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[73], 11);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[75], 11);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[77], 11);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[79], 16);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DATE );
               }
               else
               {
                  stmt.setDate(42, (java.util.Date)parms[81]);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[83], 8);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[85]).byteValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[87], 4);
               }
               stmt.setString(46, (String)parms[88], 3);
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(47, ((Number) parms[90]).intValue());
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
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
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 11);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 51);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 11);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 51);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 11);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 51);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 11);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 51);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 800);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 800);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[43]).byteValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[51]);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 1);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[55], false);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 8);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(33, ((Number) parms[65]).byteValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 8);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(35, (java.util.Date)parms[69], false);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 11);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 11);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 11);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 16);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[79]);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 8);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[83]).byteValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 4);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[87]).intValue());
               }
               stmt.setString(45, (String)parms[88], 3);
               stmt.setString(46, (String)parms[89], 20);
               stmt.setString(47, (String)parms[90], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

