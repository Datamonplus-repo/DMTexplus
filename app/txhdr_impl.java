package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txhdr_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "XHDR", ""), (short)(0)) ;
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

   public txhdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txhdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txhdr_impl.class ));
   }

   public txhdr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXHDR.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "HDR", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4198XHDRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDRCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4198XHDRCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4198XHDRCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRCod_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4199XHDRReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDRReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4199XHDRReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4199XHDRReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRReo_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Partición", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRPar_Internalname, GXutil.rtrim( A4200XHDRPar), GXutil.rtrim( localUtil.format( A4200XHDRPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRPar_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Disp. Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRDisCli_Internalname, GXutil.rtrim( A4201XHDRDisCli), GXutil.rtrim( localUtil.format( A4201XHDRDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRDisCli_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRDisCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRSERCOD_Internalname, GXutil.rtrim( A4202XHDRSERCOD), GXutil.rtrim( localUtil.format( A4202XHDRSERCOD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRSERCOD_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRSERCOD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nom. Color Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRCCLNOM_Internalname, GXutil.rtrim( A4203XHDRCCLNOM), GXutil.rtrim( localUtil.format( A4203XHDRCCLNOM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRCCLNOM_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRCCLNOM_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Núm Color Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRCCLNUM_Internalname, GXutil.ltrim( localUtil.ntoc( A4204XHDRCCLNUM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDRCCLNUM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRCCLNUM_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRCCLNUM_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Color Interno", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRCOLNUM_Internalname, GXutil.ltrim( localUtil.ntoc( A4205XHDRCOLNUM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDRCOLNUM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRCOLNUM_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRCOLNUM_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRKGS_Internalname, GXutil.ltrim( localUtil.ntoc( A4206XHDRKGS, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDRKGS_Enabled!=0) ? localUtil.format( A4206XHDRKGS, "ZZZZZ9.99") : localUtil.format( A4206XHDRKGS, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRKGS_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRKGS_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Generación", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXHDRFECGEN_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRFECGEN_Internalname, localUtil.format(A4207XHDRFECGEN, "99/99/99"), localUtil.format( A4207XHDRFECGEN, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRFECGEN_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRFECGEN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXHDRFECGEN_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXHDRFECGEN_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXHDR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Tinte", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXHDRFECTIN_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRFECTIN_Internalname, localUtil.format(A4208XHDRFECTIN, "99/99/99"), localUtil.format( A4208XHDRFECTIN, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRFECTIN_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRFECTIN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXHDRFECTIN_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXHDRFECTIN_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXHDR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Expedición", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXHDRFECEXP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRFECEXP_Internalname, localUtil.format(A4209XHDRFECEXP, "99/99/99"), localUtil.format( A4209XHDRFECEXP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRFECEXP_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRFECEXP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXHDRFECEXP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXHDRFECEXP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXHDR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Compromiso", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXHDRFECCMP_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRFECCMP_Internalname, localUtil.format(A4210XHDRFECCMP, "99/99/99"), localUtil.format( A4210XHDRFECCMP, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRFECCMP_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRFECCMP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXHDRFECCMP_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXHDRFECCMP_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXHDR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fecha Almacen", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXHDRFECALM_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDRFECALM_Internalname, localUtil.format(A4211XHDRFECALM, "99/99/99"), localUtil.format( A4211XHDRFECALM, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDRFECALM_Jsonclick, 0, "", "", "", "", "", 1, edtXHDRFECALM_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXHDRFECALM_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXHDRFECALM_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXHDR.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXHDR.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXHDREST_Internalname, GXutil.ltrim( localUtil.ntoc( A4212XHDREST, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXHDREST_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4212XHDREST), "9") : localUtil.format( DecimalUtil.doubleToDec(A4212XHDREST), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXHDREST_Jsonclick, 0, "", "", "", "", "", 1, edtXHDREST_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXHDR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXHDR.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXHDR.htm");
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
         Z4198XHDRCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4198XHDRCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4199XHDRReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4199XHDRReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4200XHDRPar = httpContext.cgiGet( "Z4200XHDRPar") ;
         Z4201XHDRDisCli = httpContext.cgiGet( "Z4201XHDRDisCli") ;
         Z4202XHDRSERCOD = httpContext.cgiGet( "Z4202XHDRSERCOD") ;
         Z4203XHDRCCLNOM = httpContext.cgiGet( "Z4203XHDRCCLNOM") ;
         Z4204XHDRCCLNUM = (int)(localUtil.ctol( httpContext.cgiGet( "Z4204XHDRCCLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4205XHDRCOLNUM = (int)(localUtil.ctol( httpContext.cgiGet( "Z4205XHDRCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4206XHDRKGS = localUtil.ctond( httpContext.cgiGet( "Z4206XHDRKGS")) ;
         Z4207XHDRFECGEN = localUtil.ctod( httpContext.cgiGet( "Z4207XHDRFECGEN"), 0) ;
         Z4208XHDRFECTIN = localUtil.ctod( httpContext.cgiGet( "Z4208XHDRFECTIN"), 0) ;
         Z4209XHDRFECEXP = localUtil.ctod( httpContext.cgiGet( "Z4209XHDRFECEXP"), 0) ;
         Z4210XHDRFECCMP = localUtil.ctod( httpContext.cgiGet( "Z4210XHDRFECCMP"), 0) ;
         Z4211XHDRFECALM = localUtil.ctod( httpContext.cgiGet( "Z4211XHDRFECALM"), 0) ;
         Z4212XHDREST = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4212XHDREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4198XHDRCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         }
         else
         {
            A4198XHDRCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXHDRCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDRREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4199XHDRReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         }
         else
         {
            A4199XHDRReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtXHDRReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         }
         A4200XHDRPar = httpContext.cgiGet( edtXHDRPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
         A4201XHDRDisCli = httpContext.cgiGet( edtXHDRDisCli_Internalname) ;
         n4201XHDRDisCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4201XHDRDisCli", A4201XHDRDisCli);
         A4202XHDRSERCOD = httpContext.cgiGet( edtXHDRSERCOD_Internalname) ;
         n4202XHDRSERCOD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4202XHDRSERCOD", A4202XHDRSERCOD);
         A4203XHDRCCLNOM = httpContext.cgiGet( edtXHDRCCLNOM_Internalname) ;
         n4203XHDRCCLNOM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4203XHDRCCLNOM", A4203XHDRCCLNOM);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCCLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCCLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDRCCLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRCCLNUM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4204XHDRCCLNUM = 0 ;
            n4204XHDRCCLNUM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), 6, 0));
         }
         else
         {
            A4204XHDRCCLNUM = (int)(localUtil.ctol( httpContext.cgiGet( edtXHDRCCLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4204XHDRCCLNUM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCOLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHDRCOLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDRCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRCOLNUM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4205XHDRCOLNUM = 0 ;
            n4205XHDRCOLNUM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), 6, 0));
         }
         else
         {
            A4205XHDRCOLNUM = (int)(localUtil.ctol( httpContext.cgiGet( edtXHDRCOLNUM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4205XHDRCOLNUM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXHDRKGS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXHDRKGS_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDRKGS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRKGS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4206XHDRKGS = DecimalUtil.ZERO ;
            n4206XHDRKGS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrimstr( A4206XHDRKGS, 9, 2));
         }
         else
         {
            A4206XHDRKGS = localUtil.ctond( httpContext.cgiGet( edtXHDRKGS_Internalname)) ;
            n4206XHDRKGS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrimstr( A4206XHDRKGS, 9, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtXHDRFECGEN_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XHDRFECGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRFECGEN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4207XHDRFECGEN = GXutil.nullDate() ;
            n4207XHDRFECGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
         }
         else
         {
            A4207XHDRFECGEN = localUtil.ctod( httpContext.cgiGet( edtXHDRFECGEN_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4207XHDRFECGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtXHDRFECTIN_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XHDRFECTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRFECTIN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4208XHDRFECTIN = GXutil.nullDate() ;
            n4208XHDRFECTIN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
         }
         else
         {
            A4208XHDRFECTIN = localUtil.ctod( httpContext.cgiGet( edtXHDRFECTIN_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4208XHDRFECTIN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtXHDRFECEXP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XHDRFECEXP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRFECEXP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4209XHDRFECEXP = GXutil.nullDate() ;
            n4209XHDRFECEXP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
         }
         else
         {
            A4209XHDRFECEXP = localUtil.ctod( httpContext.cgiGet( edtXHDRFECEXP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4209XHDRFECEXP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtXHDRFECCMP_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XHDRFECCMP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRFECCMP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4210XHDRFECCMP = GXutil.nullDate() ;
            n4210XHDRFECCMP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
         }
         else
         {
            A4210XHDRFECCMP = localUtil.ctod( httpContext.cgiGet( edtXHDRFECCMP_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4210XHDRFECCMP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtXHDRFECALM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "XHDRFECALM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDRFECALM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4211XHDRFECALM = GXutil.nullDate() ;
            n4211XHDRFECALM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
         }
         else
         {
            A4211XHDRFECALM = localUtil.ctod( httpContext.cgiGet( edtXHDRFECALM_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4211XHDRFECALM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXHDREST_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXHDREST_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XHDREST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXHDREST_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4212XHDREST = (byte)(0) ;
            n4212XHDREST = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.str( A4212XHDREST, 1, 0));
         }
         else
         {
            A4212XHDREST = (byte)(localUtil.ctol( httpContext.cgiGet( edtXHDREST_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4212XHDREST = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.str( A4212XHDREST, 1, 0));
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
            A4198XHDRCod = (int)(GXutil.lval( httpContext.GetPar( "XHDRCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
            A4199XHDRReo = (byte)(GXutil.lval( httpContext.GetPar( "XHDRReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
            A4200XHDRPar = httpContext.GetPar( "XHDRPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
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
            initAll1GB1604( ) ;
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
      disableAttributes1GB1604( ) ;
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

   public void confirm_1GB0( )
   {
      beforeValidate1GB1604( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GB1604( ) ;
         }
         else
         {
            checkExtendedTable1GB1604( ) ;
            if ( AnyError == 0 )
            {
               zm1GB1604( 2) ;
            }
            closeExtendedTableCursors1GB1604( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1GB0( ) ;
      }
   }

   public void resetCaption1GB0( )
   {
   }

   public void zm1GB1604( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4201XHDRDisCli = T01GB3_A4201XHDRDisCli[0] ;
            Z4202XHDRSERCOD = T01GB3_A4202XHDRSERCOD[0] ;
            Z4203XHDRCCLNOM = T01GB3_A4203XHDRCCLNOM[0] ;
            Z4204XHDRCCLNUM = T01GB3_A4204XHDRCCLNUM[0] ;
            Z4205XHDRCOLNUM = T01GB3_A4205XHDRCOLNUM[0] ;
            Z4206XHDRKGS = T01GB3_A4206XHDRKGS[0] ;
            Z4207XHDRFECGEN = T01GB3_A4207XHDRFECGEN[0] ;
            Z4208XHDRFECTIN = T01GB3_A4208XHDRFECTIN[0] ;
            Z4209XHDRFECEXP = T01GB3_A4209XHDRFECEXP[0] ;
            Z4210XHDRFECCMP = T01GB3_A4210XHDRFECCMP[0] ;
            Z4211XHDRFECALM = T01GB3_A4211XHDRFECALM[0] ;
            Z4212XHDREST = T01GB3_A4212XHDREST[0] ;
            Z252CliCod = T01GB3_A252CliCod[0] ;
         }
         else
         {
            Z4201XHDRDisCli = A4201XHDRDisCli ;
            Z4202XHDRSERCOD = A4202XHDRSERCOD ;
            Z4203XHDRCCLNOM = A4203XHDRCCLNOM ;
            Z4204XHDRCCLNUM = A4204XHDRCCLNUM ;
            Z4205XHDRCOLNUM = A4205XHDRCOLNUM ;
            Z4206XHDRKGS = A4206XHDRKGS ;
            Z4207XHDRFECGEN = A4207XHDRFECGEN ;
            Z4208XHDRFECTIN = A4208XHDRFECTIN ;
            Z4209XHDRFECEXP = A4209XHDRFECEXP ;
            Z4210XHDRFECCMP = A4210XHDRFECCMP ;
            Z4211XHDRFECALM = A4211XHDRFECALM ;
            Z4212XHDREST = A4212XHDREST ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4198XHDRCod = A4198XHDRCod ;
         Z4199XHDRReo = A4199XHDRReo ;
         Z4200XHDRPar = A4200XHDRPar ;
         Z4201XHDRDisCli = A4201XHDRDisCli ;
         Z4202XHDRSERCOD = A4202XHDRSERCOD ;
         Z4203XHDRCCLNOM = A4203XHDRCCLNOM ;
         Z4204XHDRCCLNUM = A4204XHDRCCLNUM ;
         Z4205XHDRCOLNUM = A4205XHDRCOLNUM ;
         Z4206XHDRKGS = A4206XHDRKGS ;
         Z4207XHDRFECGEN = A4207XHDRFECGEN ;
         Z4208XHDRFECTIN = A4208XHDRFECTIN ;
         Z4209XHDRFECEXP = A4209XHDRFECEXP ;
         Z4210XHDRFECCMP = A4210XHDRFECCMP ;
         Z4211XHDRFECALM = A4211XHDRFECALM ;
         Z4212XHDREST = A4212XHDREST ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
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

   public void load1GB1604( )
   {
      /* Using cursor T01GB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1604 = (short)(1) ;
         A4201XHDRDisCli = T01GB5_A4201XHDRDisCli[0] ;
         n4201XHDRDisCli = T01GB5_n4201XHDRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4201XHDRDisCli", A4201XHDRDisCli);
         A4202XHDRSERCOD = T01GB5_A4202XHDRSERCOD[0] ;
         n4202XHDRSERCOD = T01GB5_n4202XHDRSERCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4202XHDRSERCOD", A4202XHDRSERCOD);
         A4203XHDRCCLNOM = T01GB5_A4203XHDRCCLNOM[0] ;
         n4203XHDRCCLNOM = T01GB5_n4203XHDRCCLNOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4203XHDRCCLNOM", A4203XHDRCCLNOM);
         A4204XHDRCCLNUM = T01GB5_A4204XHDRCCLNUM[0] ;
         n4204XHDRCCLNUM = T01GB5_n4204XHDRCCLNUM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), 6, 0));
         A4205XHDRCOLNUM = T01GB5_A4205XHDRCOLNUM[0] ;
         n4205XHDRCOLNUM = T01GB5_n4205XHDRCOLNUM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), 6, 0));
         A4206XHDRKGS = T01GB5_A4206XHDRKGS[0] ;
         n4206XHDRKGS = T01GB5_n4206XHDRKGS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrimstr( A4206XHDRKGS, 9, 2));
         A4207XHDRFECGEN = T01GB5_A4207XHDRFECGEN[0] ;
         n4207XHDRFECGEN = T01GB5_n4207XHDRFECGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
         A4208XHDRFECTIN = T01GB5_A4208XHDRFECTIN[0] ;
         n4208XHDRFECTIN = T01GB5_n4208XHDRFECTIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
         A4209XHDRFECEXP = T01GB5_A4209XHDRFECEXP[0] ;
         n4209XHDRFECEXP = T01GB5_n4209XHDRFECEXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
         A4210XHDRFECCMP = T01GB5_A4210XHDRFECCMP[0] ;
         n4210XHDRFECCMP = T01GB5_n4210XHDRFECCMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
         A4211XHDRFECALM = T01GB5_A4211XHDRFECALM[0] ;
         n4211XHDRFECALM = T01GB5_n4211XHDRFECALM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
         A4212XHDREST = T01GB5_A4212XHDREST[0] ;
         n4212XHDREST = T01GB5_n4212XHDREST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.str( A4212XHDREST, 1, 0));
         A252CliCod = T01GB5_A252CliCod[0] ;
         n252CliCod = T01GB5_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1GB1604( -1) ;
      }
      pr_default.close(3);
      onLoadActions1GB1604( ) ;
   }

   public void onLoadActions1GB1604( )
   {
   }

   public void checkExtendedTable1GB1604( )
   {
      nIsDirty_1604 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1GB1604( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01GB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1GB1604( )
   {
      /* Using cursor T01GB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1604 = (short)(1) ;
      }
      else
      {
         RcdFound1604 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1GB1604( 1) ;
         RcdFound1604 = (short)(1) ;
         A4198XHDRCod = T01GB3_A4198XHDRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         A4199XHDRReo = T01GB3_A4199XHDRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         A4200XHDRPar = T01GB3_A4200XHDRPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
         A4201XHDRDisCli = T01GB3_A4201XHDRDisCli[0] ;
         n4201XHDRDisCli = T01GB3_n4201XHDRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4201XHDRDisCli", A4201XHDRDisCli);
         A4202XHDRSERCOD = T01GB3_A4202XHDRSERCOD[0] ;
         n4202XHDRSERCOD = T01GB3_n4202XHDRSERCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4202XHDRSERCOD", A4202XHDRSERCOD);
         A4203XHDRCCLNOM = T01GB3_A4203XHDRCCLNOM[0] ;
         n4203XHDRCCLNOM = T01GB3_n4203XHDRCCLNOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4203XHDRCCLNOM", A4203XHDRCCLNOM);
         A4204XHDRCCLNUM = T01GB3_A4204XHDRCCLNUM[0] ;
         n4204XHDRCCLNUM = T01GB3_n4204XHDRCCLNUM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), 6, 0));
         A4205XHDRCOLNUM = T01GB3_A4205XHDRCOLNUM[0] ;
         n4205XHDRCOLNUM = T01GB3_n4205XHDRCOLNUM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), 6, 0));
         A4206XHDRKGS = T01GB3_A4206XHDRKGS[0] ;
         n4206XHDRKGS = T01GB3_n4206XHDRKGS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrimstr( A4206XHDRKGS, 9, 2));
         A4207XHDRFECGEN = T01GB3_A4207XHDRFECGEN[0] ;
         n4207XHDRFECGEN = T01GB3_n4207XHDRFECGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
         A4208XHDRFECTIN = T01GB3_A4208XHDRFECTIN[0] ;
         n4208XHDRFECTIN = T01GB3_n4208XHDRFECTIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
         A4209XHDRFECEXP = T01GB3_A4209XHDRFECEXP[0] ;
         n4209XHDRFECEXP = T01GB3_n4209XHDRFECEXP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
         A4210XHDRFECCMP = T01GB3_A4210XHDRFECCMP[0] ;
         n4210XHDRFECCMP = T01GB3_n4210XHDRFECCMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
         A4211XHDRFECALM = T01GB3_A4211XHDRFECALM[0] ;
         n4211XHDRFECALM = T01GB3_n4211XHDRFECALM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
         A4212XHDREST = T01GB3_A4212XHDREST[0] ;
         n4212XHDREST = T01GB3_n4212XHDREST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.str( A4212XHDREST, 1, 0));
         A396EmprCod = T01GB3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01GB3_A252CliCod[0] ;
         n252CliCod = T01GB3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z4198XHDRCod = A4198XHDRCod ;
         Z4199XHDRReo = A4199XHDRReo ;
         Z4200XHDRPar = A4200XHDRPar ;
         sMode1604 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GB1604( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1604 = (short)(0) ;
            initializeNonKey1GB1604( ) ;
         }
         Gx_mode = sMode1604 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1604 = (short)(0) ;
         initializeNonKey1GB1604( ) ;
         sMode1604 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1604 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1GB1604( ) ;
      if ( RcdFound1604 == 0 )
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
      RcdFound1604 = (short)(0) ;
      /* Using cursor T01GB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4198XHDRCod), Integer.valueOf(A4198XHDRCod), A396EmprCod, Byte.valueOf(A4199XHDRReo), Byte.valueOf(A4199XHDRReo), Integer.valueOf(A4198XHDRCod), A396EmprCod, A4200XHDRPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB8_A4198XHDRCod[0] < A4198XHDRCod ) || ( T01GB8_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB8_A4199XHDRReo[0] < A4199XHDRReo ) || ( T01GB8_A4199XHDRReo[0] == A4199XHDRReo ) && ( T01GB8_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GB8_A4200XHDRPar[0], A4200XHDRPar) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB8_A4198XHDRCod[0] > A4198XHDRCod ) || ( T01GB8_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB8_A4199XHDRReo[0] > A4199XHDRReo ) || ( T01GB8_A4199XHDRReo[0] == A4199XHDRReo ) && ( T01GB8_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GB8_A4200XHDRPar[0], A4200XHDRPar) > 0 ) ) )
         {
            A396EmprCod = T01GB8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4198XHDRCod = T01GB8_A4198XHDRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
            A4199XHDRReo = T01GB8_A4199XHDRReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
            A4200XHDRPar = T01GB8_A4200XHDRPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
            RcdFound1604 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1604 = (short)(0) ;
      /* Using cursor T01GB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4198XHDRCod), Integer.valueOf(A4198XHDRCod), A396EmprCod, Byte.valueOf(A4199XHDRReo), Byte.valueOf(A4199XHDRReo), Integer.valueOf(A4198XHDRCod), A396EmprCod, A4200XHDRPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB9_A4198XHDRCod[0] > A4198XHDRCod ) || ( T01GB9_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB9_A4199XHDRReo[0] > A4199XHDRReo ) || ( T01GB9_A4199XHDRReo[0] == A4199XHDRReo ) && ( T01GB9_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GB9_A4200XHDRPar[0], A4200XHDRPar) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB9_A4198XHDRCod[0] < A4198XHDRCod ) || ( T01GB9_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01GB9_A4199XHDRReo[0] < A4199XHDRReo ) || ( T01GB9_A4199XHDRReo[0] == A4199XHDRReo ) && ( T01GB9_A4198XHDRCod[0] == A4198XHDRCod ) && ( GXutil.strcmp(T01GB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01GB9_A4200XHDRPar[0], A4200XHDRPar) < 0 ) ) )
         {
            A396EmprCod = T01GB9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4198XHDRCod = T01GB9_A4198XHDRCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
            A4199XHDRReo = T01GB9_A4199XHDRReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
            A4200XHDRPar = T01GB9_A4200XHDRPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
            RcdFound1604 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GB1604( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GB1604( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1604 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4198XHDRCod != Z4198XHDRCod ) || ( A4199XHDRReo != Z4199XHDRReo ) || ( GXutil.strcmp(A4200XHDRPar, Z4200XHDRPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4198XHDRCod = Z4198XHDRCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
               A4199XHDRReo = Z4199XHDRReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
               A4200XHDRPar = Z4200XHDRPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
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
               update1GB1604( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4198XHDRCod != Z4198XHDRCod ) || ( A4199XHDRReo != Z4199XHDRReo ) || ( GXutil.strcmp(A4200XHDRPar, Z4200XHDRPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GB1604( ) ;
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
                  insert1GB1604( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4198XHDRCod != Z4198XHDRCod ) || ( A4199XHDRReo != Z4199XHDRReo ) || ( GXutil.strcmp(A4200XHDRPar, Z4200XHDRPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4198XHDRCod = Z4198XHDRCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         A4199XHDRReo = Z4199XHDRReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         A4200XHDRPar = Z4200XHDRPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
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
      getKey1GB1604( ) ;
      if ( RcdFound1604 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4198XHDRCod != Z4198XHDRCod ) || ( A4199XHDRReo != Z4199XHDRReo ) || ( GXutil.strcmp(A4200XHDRPar, Z4200XHDRPar) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4198XHDRCod = Z4198XHDRCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
            A4199XHDRReo = Z4199XHDRReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
            A4200XHDRPar = Z4200XHDRPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4198XHDRCod != Z4198XHDRCod ) || ( A4199XHDRReo != Z4199XHDRReo ) || ( GXutil.strcmp(A4200XHDRPar, Z4200XHDRPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txhdr");
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GB0( ) ;
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
      if ( RcdFound1604 == 0 )
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
      scanStart1GB1604( ) ;
      if ( RcdFound1604 == 0 )
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
      scanEnd1GB1604( ) ;
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
      if ( RcdFound1604 == 0 )
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
      if ( RcdFound1604 == 0 )
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
      scanStart1GB1604( ) ;
      if ( RcdFound1604 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1604 != 0 )
         {
            scanNext1GB1604( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GB1604( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GB1604( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXHDR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4201XHDRDisCli, T01GB2_A4201XHDRDisCli[0]) != 0 ) || ( GXutil.strcmp(Z4202XHDRSERCOD, T01GB2_A4202XHDRSERCOD[0]) != 0 ) || ( GXutil.strcmp(Z4203XHDRCCLNOM, T01GB2_A4203XHDRCCLNOM[0]) != 0 ) || ( Z4204XHDRCCLNUM != T01GB2_A4204XHDRCCLNUM[0] ) || ( Z4205XHDRCOLNUM != T01GB2_A4205XHDRCOLNUM[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4206XHDRKGS, T01GB2_A4206XHDRKGS[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4207XHDRFECGEN), GXutil.resetTime(T01GB2_A4207XHDRFECGEN[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4208XHDRFECTIN), GXutil.resetTime(T01GB2_A4208XHDRFECTIN[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4209XHDRFECEXP), GXutil.resetTime(T01GB2_A4209XHDRFECEXP[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4210XHDRFECCMP), GXutil.resetTime(T01GB2_A4210XHDRFECCMP[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4211XHDRFECALM), GXutil.resetTime(T01GB2_A4211XHDRFECALM[0])) ) || ( Z4212XHDREST != T01GB2_A4212XHDREST[0] ) || ( Z252CliCod != T01GB2_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z4201XHDRDisCli, T01GB2_A4201XHDRDisCli[0]) != 0 )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRDisCli");
               GXutil.writeLogRaw("Old: ",Z4201XHDRDisCli);
               GXutil.writeLogRaw("Current: ",T01GB2_A4201XHDRDisCli[0]);
            }
            if ( GXutil.strcmp(Z4202XHDRSERCOD, T01GB2_A4202XHDRSERCOD[0]) != 0 )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRSERCOD");
               GXutil.writeLogRaw("Old: ",Z4202XHDRSERCOD);
               GXutil.writeLogRaw("Current: ",T01GB2_A4202XHDRSERCOD[0]);
            }
            if ( GXutil.strcmp(Z4203XHDRCCLNOM, T01GB2_A4203XHDRCCLNOM[0]) != 0 )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRCCLNOM");
               GXutil.writeLogRaw("Old: ",Z4203XHDRCCLNOM);
               GXutil.writeLogRaw("Current: ",T01GB2_A4203XHDRCCLNOM[0]);
            }
            if ( Z4204XHDRCCLNUM != T01GB2_A4204XHDRCCLNUM[0] )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRCCLNUM");
               GXutil.writeLogRaw("Old: ",Z4204XHDRCCLNUM);
               GXutil.writeLogRaw("Current: ",T01GB2_A4204XHDRCCLNUM[0]);
            }
            if ( Z4205XHDRCOLNUM != T01GB2_A4205XHDRCOLNUM[0] )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRCOLNUM");
               GXutil.writeLogRaw("Old: ",Z4205XHDRCOLNUM);
               GXutil.writeLogRaw("Current: ",T01GB2_A4205XHDRCOLNUM[0]);
            }
            if ( DecimalUtil.compareTo(Z4206XHDRKGS, T01GB2_A4206XHDRKGS[0]) != 0 )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRKGS");
               GXutil.writeLogRaw("Old: ",Z4206XHDRKGS);
               GXutil.writeLogRaw("Current: ",T01GB2_A4206XHDRKGS[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4207XHDRFECGEN), GXutil.resetTime(T01GB2_A4207XHDRFECGEN[0])) ) )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRFECGEN");
               GXutil.writeLogRaw("Old: ",Z4207XHDRFECGEN);
               GXutil.writeLogRaw("Current: ",T01GB2_A4207XHDRFECGEN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4208XHDRFECTIN), GXutil.resetTime(T01GB2_A4208XHDRFECTIN[0])) ) )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRFECTIN");
               GXutil.writeLogRaw("Old: ",Z4208XHDRFECTIN);
               GXutil.writeLogRaw("Current: ",T01GB2_A4208XHDRFECTIN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4209XHDRFECEXP), GXutil.resetTime(T01GB2_A4209XHDRFECEXP[0])) ) )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRFECEXP");
               GXutil.writeLogRaw("Old: ",Z4209XHDRFECEXP);
               GXutil.writeLogRaw("Current: ",T01GB2_A4209XHDRFECEXP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4210XHDRFECCMP), GXutil.resetTime(T01GB2_A4210XHDRFECCMP[0])) ) )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRFECCMP");
               GXutil.writeLogRaw("Old: ",Z4210XHDRFECCMP);
               GXutil.writeLogRaw("Current: ",T01GB2_A4210XHDRFECCMP[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4211XHDRFECALM), GXutil.resetTime(T01GB2_A4211XHDRFECALM[0])) ) )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDRFECALM");
               GXutil.writeLogRaw("Old: ",Z4211XHDRFECALM);
               GXutil.writeLogRaw("Current: ",T01GB2_A4211XHDRFECALM[0]);
            }
            if ( Z4212XHDREST != T01GB2_A4212XHDREST[0] )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"XHDREST");
               GXutil.writeLogRaw("Old: ",Z4212XHDREST);
               GXutil.writeLogRaw("Current: ",T01GB2_A4212XHDREST[0]);
            }
            if ( Z252CliCod != T01GB2_A252CliCod[0] )
            {
               GXutil.writeLogln("txhdr:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01GB2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXHDR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GB1604( )
   {
      beforeValidate1GB1604( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GB1604( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GB1604( 0) ;
         checkOptimisticConcurrency1GB1604( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GB1604( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GB1604( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GB10 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar, Boolean.valueOf(n4201XHDRDisCli), A4201XHDRDisCli, Boolean.valueOf(n4202XHDRSERCOD), A4202XHDRSERCOD, Boolean.valueOf(n4203XHDRCCLNOM), A4203XHDRCCLNOM, Boolean.valueOf(n4204XHDRCCLNUM), Integer.valueOf(A4204XHDRCCLNUM), Boolean.valueOf(n4205XHDRCOLNUM), Integer.valueOf(A4205XHDRCOLNUM), Boolean.valueOf(n4206XHDRKGS), A4206XHDRKGS, Boolean.valueOf(n4207XHDRFECGEN), A4207XHDRFECGEN, Boolean.valueOf(n4208XHDRFECTIN), A4208XHDRFECTIN, Boolean.valueOf(n4209XHDRFECEXP), A4209XHDRFECEXP, Boolean.valueOf(n4210XHDRFECCMP), A4210XHDRFECCMP, Boolean.valueOf(n4211XHDRFECALM), A4211XHDRFECALM, Boolean.valueOf(n4212XHDREST), Byte.valueOf(A4212XHDREST), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXHDR");
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
                        resetCaption1GB0( ) ;
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
            load1GB1604( ) ;
         }
         endLevel1GB1604( ) ;
      }
      closeExtendedTableCursors1GB1604( ) ;
   }

   public void update1GB1604( )
   {
      beforeValidate1GB1604( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GB1604( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GB1604( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GB1604( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GB1604( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GB11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n4201XHDRDisCli), A4201XHDRDisCli, Boolean.valueOf(n4202XHDRSERCOD), A4202XHDRSERCOD, Boolean.valueOf(n4203XHDRCCLNOM), A4203XHDRCCLNOM, Boolean.valueOf(n4204XHDRCCLNUM), Integer.valueOf(A4204XHDRCCLNUM), Boolean.valueOf(n4205XHDRCOLNUM), Integer.valueOf(A4205XHDRCOLNUM), Boolean.valueOf(n4206XHDRKGS), A4206XHDRKGS, Boolean.valueOf(n4207XHDRFECGEN), A4207XHDRFECGEN, Boolean.valueOf(n4208XHDRFECTIN), A4208XHDRFECTIN, Boolean.valueOf(n4209XHDRFECEXP), A4209XHDRFECEXP, Boolean.valueOf(n4210XHDRFECCMP), A4210XHDRFECCMP, Boolean.valueOf(n4211XHDRFECALM), A4211XHDRFECALM, Boolean.valueOf(n4212XHDREST), Byte.valueOf(A4212XHDREST), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXHDR");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXHDR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GB1604( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1GB0( ) ;
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
         endLevel1GB1604( ) ;
      }
      closeExtendedTableCursors1GB1604( ) ;
   }

   public void deferredUpdate1GB1604( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GB1604( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GB1604( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GB1604( ) ;
         afterConfirm1GB1604( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GB1604( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GB12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4198XHDRCod), Byte.valueOf(A4199XHDRReo), A4200XHDRPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXHDR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1604 == 0 )
                     {
                        initAll1GB1604( ) ;
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
                     resetCaption1GB0( ) ;
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
      sMode1604 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GB1604( ) ;
      Gx_mode = sMode1604 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GB1604( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1GB1604( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GB1604( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txhdr");
         if ( AnyError == 0 )
         {
            confirmValues1GB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txhdr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GB1604( )
   {
      /* Using cursor T01GB13 */
      pr_default.execute(11);
      RcdFound1604 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1604 = (short)(1) ;
         A396EmprCod = T01GB13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4198XHDRCod = T01GB13_A4198XHDRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         A4199XHDRReo = T01GB13_A4199XHDRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         A4200XHDRPar = T01GB13_A4200XHDRPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GB1604( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1604 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1604 = (short)(1) ;
         A396EmprCod = T01GB13_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4198XHDRCod = T01GB13_A4198XHDRCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
         A4199XHDRReo = T01GB13_A4199XHDRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
         A4200XHDRPar = T01GB13_A4200XHDRPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
      }
   }

   public void scanEnd1GB1604( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1GB1604( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GB1604( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GB1604( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GB1604( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GB1604( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GB1604( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GB1604( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtXHDRCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRCod_Enabled), 5, 0), true);
      edtXHDRReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRReo_Enabled), 5, 0), true);
      edtXHDRPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRPar_Enabled), 5, 0), true);
      edtXHDRDisCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRDisCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRDisCli_Enabled), 5, 0), true);
      edtXHDRSERCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRSERCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRSERCOD_Enabled), 5, 0), true);
      edtXHDRCCLNOM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRCCLNOM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRCCLNOM_Enabled), 5, 0), true);
      edtXHDRCCLNUM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRCCLNUM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRCCLNUM_Enabled), 5, 0), true);
      edtXHDRCOLNUM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRCOLNUM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRCOLNUM_Enabled), 5, 0), true);
      edtXHDRKGS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRKGS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRKGS_Enabled), 5, 0), true);
      edtXHDRFECGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRFECGEN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRFECGEN_Enabled), 5, 0), true);
      edtXHDRFECTIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRFECTIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRFECTIN_Enabled), 5, 0), true);
      edtXHDRFECEXP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRFECEXP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRFECEXP_Enabled), 5, 0), true);
      edtXHDRFECCMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRFECCMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRFECCMP_Enabled), 5, 0), true);
      edtXHDRFECALM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDRFECALM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDRFECALM_Enabled), 5, 0), true);
      edtXHDREST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXHDREST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXHDREST_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1GB1604( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1GB0( )
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txhdr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4198XHDRCod", GXutil.ltrim( localUtil.ntoc( Z4198XHDRCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4199XHDRReo", GXutil.ltrim( localUtil.ntoc( Z4199XHDRReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4200XHDRPar", GXutil.rtrim( Z4200XHDRPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4201XHDRDisCli", GXutil.rtrim( Z4201XHDRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4202XHDRSERCOD", GXutil.rtrim( Z4202XHDRSERCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4203XHDRCCLNOM", GXutil.rtrim( Z4203XHDRCCLNOM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4204XHDRCCLNUM", GXutil.ltrim( localUtil.ntoc( Z4204XHDRCCLNUM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4205XHDRCOLNUM", GXutil.ltrim( localUtil.ntoc( Z4205XHDRCOLNUM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4206XHDRKGS", GXutil.ltrim( localUtil.ntoc( Z4206XHDRKGS, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4207XHDRFECGEN", localUtil.dtoc( Z4207XHDRFECGEN, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4208XHDRFECTIN", localUtil.dtoc( Z4208XHDRFECTIN, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4209XHDRFECEXP", localUtil.dtoc( Z4209XHDRFECEXP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4210XHDRFECCMP", localUtil.dtoc( Z4210XHDRFECCMP, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4211XHDRFECALM", localUtil.dtoc( Z4211XHDRFECALM, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4212XHDREST", GXutil.ltrim( localUtil.ntoc( Z4212XHDREST, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.txhdr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXHDR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "XHDR", "") ;
   }

   public void initializeNonKey1GB1604( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4201XHDRDisCli = "" ;
      n4201XHDRDisCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4201XHDRDisCli", A4201XHDRDisCli);
      A4202XHDRSERCOD = "" ;
      n4202XHDRSERCOD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4202XHDRSERCOD", A4202XHDRSERCOD);
      A4203XHDRCCLNOM = "" ;
      n4203XHDRCCLNOM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4203XHDRCCLNOM", A4203XHDRCCLNOM);
      A4204XHDRCCLNUM = 0 ;
      n4204XHDRCCLNUM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4204XHDRCCLNUM), 6, 0));
      A4205XHDRCOLNUM = 0 ;
      n4205XHDRCOLNUM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4205XHDRCOLNUM), 6, 0));
      A4206XHDRKGS = DecimalUtil.ZERO ;
      n4206XHDRKGS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrimstr( A4206XHDRKGS, 9, 2));
      A4207XHDRFECGEN = GXutil.nullDate() ;
      n4207XHDRFECGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
      A4208XHDRFECTIN = GXutil.nullDate() ;
      n4208XHDRFECTIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
      A4209XHDRFECEXP = GXutil.nullDate() ;
      n4209XHDRFECEXP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
      A4210XHDRFECCMP = GXutil.nullDate() ;
      n4210XHDRFECCMP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
      A4211XHDRFECALM = GXutil.nullDate() ;
      n4211XHDRFECALM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
      A4212XHDREST = (byte)(0) ;
      n4212XHDREST = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.str( A4212XHDREST, 1, 0));
      Z4201XHDRDisCli = "" ;
      Z4202XHDRSERCOD = "" ;
      Z4203XHDRCCLNOM = "" ;
      Z4204XHDRCCLNUM = 0 ;
      Z4205XHDRCOLNUM = 0 ;
      Z4206XHDRKGS = DecimalUtil.ZERO ;
      Z4207XHDRFECGEN = GXutil.nullDate() ;
      Z4208XHDRFECTIN = GXutil.nullDate() ;
      Z4209XHDRFECEXP = GXutil.nullDate() ;
      Z4210XHDRFECCMP = GXutil.nullDate() ;
      Z4211XHDRFECALM = GXutil.nullDate() ;
      Z4212XHDREST = (byte)(0) ;
      Z252CliCod = 0 ;
   }

   public void initAll1GB1604( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4198XHDRCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4198XHDRCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4198XHDRCod), 8, 0));
      A4199XHDRReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4199XHDRReo", GXutil.str( A4199XHDRReo, 1, 0));
      A4200XHDRPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4200XHDRPar", A4200XHDRPar);
      initializeNonKey1GB1604( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016321965", true, true);
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
      httpContext.AddJavascriptSource("txhdr.js", "?202661016321965", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXHDRCod_Internalname = "XHDRCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXHDRReo_Internalname = "XHDRREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXHDRPar_Internalname = "XHDRPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXHDRDisCli_Internalname = "XHDRDISCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXHDRSERCOD_Internalname = "XHDRSERCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXHDRCCLNOM_Internalname = "XHDRCCLNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXHDRCCLNUM_Internalname = "XHDRCCLNUM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXHDRCOLNUM_Internalname = "XHDRCOLNUM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXHDRKGS_Internalname = "XHDRKGS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXHDRFECGEN_Internalname = "XHDRFECGEN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXHDRFECTIN_Internalname = "XHDRFECTIN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXHDRFECEXP_Internalname = "XHDRFECEXP" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXHDRFECCMP_Internalname = "XHDRFECCMP" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXHDRFECALM_Internalname = "XHDRFECALM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtXHDREST_Internalname = "XHDREST" ;
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
      Form.setCaption( httpContext.getMessage( "XHDR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXHDREST_Jsonclick = "" ;
      edtXHDREST_Backcolor = (int)(0xFFFFFF) ;
      edtXHDREST_Enabled = 1 ;
      edtXHDRFECALM_Jsonclick = "" ;
      edtXHDRFECALM_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRFECALM_Enabled = 1 ;
      edtXHDRFECCMP_Jsonclick = "" ;
      edtXHDRFECCMP_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRFECCMP_Enabled = 1 ;
      edtXHDRFECEXP_Jsonclick = "" ;
      edtXHDRFECEXP_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRFECEXP_Enabled = 1 ;
      edtXHDRFECTIN_Jsonclick = "" ;
      edtXHDRFECTIN_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRFECTIN_Enabled = 1 ;
      edtXHDRFECGEN_Jsonclick = "" ;
      edtXHDRFECGEN_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRFECGEN_Enabled = 1 ;
      edtXHDRKGS_Jsonclick = "" ;
      edtXHDRKGS_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRKGS_Enabled = 1 ;
      edtXHDRCOLNUM_Jsonclick = "" ;
      edtXHDRCOLNUM_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRCOLNUM_Enabled = 1 ;
      edtXHDRCCLNUM_Jsonclick = "" ;
      edtXHDRCCLNUM_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRCCLNUM_Enabled = 1 ;
      edtXHDRCCLNOM_Jsonclick = "" ;
      edtXHDRCCLNOM_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRCCLNOM_Enabled = 1 ;
      edtXHDRSERCOD_Jsonclick = "" ;
      edtXHDRSERCOD_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRSERCOD_Enabled = 1 ;
      edtXHDRDisCli_Jsonclick = "" ;
      edtXHDRDisCli_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRDisCli_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXHDRPar_Jsonclick = "" ;
      edtXHDRPar_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRPar_Enabled = 1 ;
      edtXHDRReo_Jsonclick = "" ;
      edtXHDRReo_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRReo_Enabled = 1 ;
      edtXHDRCod_Jsonclick = "" ;
      edtXHDRCod_Backcolor = (int)(0xFFFFFF) ;
      edtXHDRCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void valid_Xhdrpar( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4201XHDRDisCli", GXutil.rtrim( A4201XHDRDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A4202XHDRSERCOD", GXutil.rtrim( A4202XHDRSERCOD));
      httpContext.ajax_rsp_assign_attri("", false, "A4203XHDRCCLNOM", GXutil.rtrim( A4203XHDRCCLNOM));
      httpContext.ajax_rsp_assign_attri("", false, "A4204XHDRCCLNUM", GXutil.ltrim( localUtil.ntoc( A4204XHDRCCLNUM, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4205XHDRCOLNUM", GXutil.ltrim( localUtil.ntoc( A4205XHDRCOLNUM, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4206XHDRKGS", GXutil.ltrim( localUtil.ntoc( A4206XHDRKGS, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4207XHDRFECGEN", localUtil.format(A4207XHDRFECGEN, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4208XHDRFECTIN", localUtil.format(A4208XHDRFECTIN, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4209XHDRFECEXP", localUtil.format(A4209XHDRFECEXP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4210XHDRFECCMP", localUtil.format(A4210XHDRFECCMP, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4211XHDRFECALM", localUtil.format(A4211XHDRFECALM, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4212XHDREST", GXutil.ltrim( localUtil.ntoc( A4212XHDREST, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4198XHDRCod", GXutil.ltrim( localUtil.ntoc( Z4198XHDRCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4199XHDRReo", GXutil.ltrim( localUtil.ntoc( Z4199XHDRReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4200XHDRPar", GXutil.rtrim( Z4200XHDRPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4201XHDRDisCli", GXutil.rtrim( Z4201XHDRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4202XHDRSERCOD", GXutil.rtrim( Z4202XHDRSERCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4203XHDRCCLNOM", GXutil.rtrim( Z4203XHDRCCLNOM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4204XHDRCCLNUM", GXutil.ltrim( localUtil.ntoc( Z4204XHDRCCLNUM, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4205XHDRCOLNUM", GXutil.ltrim( localUtil.ntoc( Z4205XHDRCOLNUM, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4206XHDRKGS", GXutil.ltrim( localUtil.ntoc( Z4206XHDRKGS, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4207XHDRFECGEN", localUtil.format(Z4207XHDRFECGEN, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4208XHDRFECTIN", localUtil.format(Z4208XHDRFECTIN, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4209XHDRFECEXP", localUtil.format(Z4209XHDRFECEXP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4210XHDRFECCMP", localUtil.format(Z4210XHDRFECCMP, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4211XHDRFECALM", localUtil.format(Z4211XHDRFECALM, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4212XHDREST", GXutil.ltrim( localUtil.ntoc( Z4212XHDREST, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01GB14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(12);
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_XHDRCOD","{handler:'valid_Xhdrcod',iparms:[]");
      setEventMetadata("VALID_XHDRCOD",",oparms:[]}");
      setEventMetadata("VALID_XHDRREO","{handler:'valid_Xhdrreo',iparms:[]");
      setEventMetadata("VALID_XHDRREO",",oparms:[]}");
      setEventMetadata("VALID_XHDRPAR","{handler:'valid_Xhdrpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4198XHDRCod',fld:'XHDRCOD',pic:'ZZZZZZZ9'},{av:'A4199XHDRReo',fld:'XHDRREO',pic:'9'},{av:'A4200XHDRPar',fld:'XHDRPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XHDRPAR",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4201XHDRDisCli',fld:'XHDRDISCLI',pic:''},{av:'A4202XHDRSERCOD',fld:'XHDRSERCOD',pic:''},{av:'A4203XHDRCCLNOM',fld:'XHDRCCLNOM',pic:''},{av:'A4204XHDRCCLNUM',fld:'XHDRCCLNUM',pic:'ZZZZZ9'},{av:'A4205XHDRCOLNUM',fld:'XHDRCOLNUM',pic:'ZZZZZ9'},{av:'A4206XHDRKGS',fld:'XHDRKGS',pic:'ZZZZZ9.99'},{av:'A4207XHDRFECGEN',fld:'XHDRFECGEN',pic:''},{av:'A4208XHDRFECTIN',fld:'XHDRFECTIN',pic:''},{av:'A4209XHDRFECEXP',fld:'XHDRFECEXP',pic:''},{av:'A4210XHDRFECCMP',fld:'XHDRFECCMP',pic:''},{av:'A4211XHDRFECALM',fld:'XHDRFECALM',pic:''},{av:'A4212XHDREST',fld:'XHDREST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4198XHDRCod'},{av:'Z4199XHDRReo'},{av:'Z4200XHDRPar'},{av:'Z252CliCod'},{av:'Z4201XHDRDisCli'},{av:'Z4202XHDRSERCOD'},{av:'Z4203XHDRCCLNOM'},{av:'Z4204XHDRCCLNUM'},{av:'Z4205XHDRCOLNUM'},{av:'Z4206XHDRKGS'},{av:'Z4207XHDRFECGEN'},{av:'Z4208XHDRFECTIN'},{av:'Z4209XHDRFECEXP'},{av:'Z4210XHDRFECCMP'},{av:'Z4211XHDRFECALM'},{av:'Z4212XHDREST'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4200XHDRPar = "" ;
      Z4201XHDRDisCli = "" ;
      Z4202XHDRSERCOD = "" ;
      Z4203XHDRCCLNOM = "" ;
      Z4206XHDRKGS = DecimalUtil.ZERO ;
      Z4207XHDRFECGEN = GXutil.nullDate() ;
      Z4208XHDRFECTIN = GXutil.nullDate() ;
      Z4209XHDRFECEXP = GXutil.nullDate() ;
      Z4210XHDRFECCMP = GXutil.nullDate() ;
      Z4211XHDRFECALM = GXutil.nullDate() ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A4200XHDRPar = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A4201XHDRDisCli = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4202XHDRSERCOD = "" ;
      lblTextblock8_Jsonclick = "" ;
      A4203XHDRCCLNOM = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4206XHDRKGS = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A4207XHDRFECGEN = GXutil.nullDate() ;
      lblTextblock13_Jsonclick = "" ;
      A4208XHDRFECTIN = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A4209XHDRFECEXP = GXutil.nullDate() ;
      lblTextblock15_Jsonclick = "" ;
      A4210XHDRFECCMP = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A4211XHDRFECALM = GXutil.nullDate() ;
      lblTextblock17_Jsonclick = "" ;
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
      T01GB5_A4198XHDRCod = new int[1] ;
      T01GB5_A4199XHDRReo = new byte[1] ;
      T01GB5_A4200XHDRPar = new String[] {""} ;
      T01GB5_A4201XHDRDisCli = new String[] {""} ;
      T01GB5_n4201XHDRDisCli = new boolean[] {false} ;
      T01GB5_A4202XHDRSERCOD = new String[] {""} ;
      T01GB5_n4202XHDRSERCOD = new boolean[] {false} ;
      T01GB5_A4203XHDRCCLNOM = new String[] {""} ;
      T01GB5_n4203XHDRCCLNOM = new boolean[] {false} ;
      T01GB5_A4204XHDRCCLNUM = new int[1] ;
      T01GB5_n4204XHDRCCLNUM = new boolean[] {false} ;
      T01GB5_A4205XHDRCOLNUM = new int[1] ;
      T01GB5_n4205XHDRCOLNUM = new boolean[] {false} ;
      T01GB5_A4206XHDRKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GB5_n4206XHDRKGS = new boolean[] {false} ;
      T01GB5_A4207XHDRFECGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB5_n4207XHDRFECGEN = new boolean[] {false} ;
      T01GB5_A4208XHDRFECTIN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB5_n4208XHDRFECTIN = new boolean[] {false} ;
      T01GB5_A4209XHDRFECEXP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB5_n4209XHDRFECEXP = new boolean[] {false} ;
      T01GB5_A4210XHDRFECCMP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB5_n4210XHDRFECCMP = new boolean[] {false} ;
      T01GB5_A4211XHDRFECALM = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB5_n4211XHDRFECALM = new boolean[] {false} ;
      T01GB5_A4212XHDREST = new byte[1] ;
      T01GB5_n4212XHDREST = new boolean[] {false} ;
      T01GB5_A396EmprCod = new String[] {""} ;
      T01GB5_A252CliCod = new int[1] ;
      T01GB5_n252CliCod = new boolean[] {false} ;
      T01GB4_A396EmprCod = new String[] {""} ;
      T01GB6_A396EmprCod = new String[] {""} ;
      T01GB7_A396EmprCod = new String[] {""} ;
      T01GB7_A4198XHDRCod = new int[1] ;
      T01GB7_A4199XHDRReo = new byte[1] ;
      T01GB7_A4200XHDRPar = new String[] {""} ;
      T01GB3_A4198XHDRCod = new int[1] ;
      T01GB3_A4199XHDRReo = new byte[1] ;
      T01GB3_A4200XHDRPar = new String[] {""} ;
      T01GB3_A4201XHDRDisCli = new String[] {""} ;
      T01GB3_n4201XHDRDisCli = new boolean[] {false} ;
      T01GB3_A4202XHDRSERCOD = new String[] {""} ;
      T01GB3_n4202XHDRSERCOD = new boolean[] {false} ;
      T01GB3_A4203XHDRCCLNOM = new String[] {""} ;
      T01GB3_n4203XHDRCCLNOM = new boolean[] {false} ;
      T01GB3_A4204XHDRCCLNUM = new int[1] ;
      T01GB3_n4204XHDRCCLNUM = new boolean[] {false} ;
      T01GB3_A4205XHDRCOLNUM = new int[1] ;
      T01GB3_n4205XHDRCOLNUM = new boolean[] {false} ;
      T01GB3_A4206XHDRKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GB3_n4206XHDRKGS = new boolean[] {false} ;
      T01GB3_A4207XHDRFECGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB3_n4207XHDRFECGEN = new boolean[] {false} ;
      T01GB3_A4208XHDRFECTIN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB3_n4208XHDRFECTIN = new boolean[] {false} ;
      T01GB3_A4209XHDRFECEXP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB3_n4209XHDRFECEXP = new boolean[] {false} ;
      T01GB3_A4210XHDRFECCMP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB3_n4210XHDRFECCMP = new boolean[] {false} ;
      T01GB3_A4211XHDRFECALM = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB3_n4211XHDRFECALM = new boolean[] {false} ;
      T01GB3_A4212XHDREST = new byte[1] ;
      T01GB3_n4212XHDREST = new boolean[] {false} ;
      T01GB3_A396EmprCod = new String[] {""} ;
      T01GB3_A252CliCod = new int[1] ;
      T01GB3_n252CliCod = new boolean[] {false} ;
      sMode1604 = "" ;
      T01GB8_A396EmprCod = new String[] {""} ;
      T01GB8_A4198XHDRCod = new int[1] ;
      T01GB8_A4199XHDRReo = new byte[1] ;
      T01GB8_A4200XHDRPar = new String[] {""} ;
      T01GB9_A396EmprCod = new String[] {""} ;
      T01GB9_A4198XHDRCod = new int[1] ;
      T01GB9_A4199XHDRReo = new byte[1] ;
      T01GB9_A4200XHDRPar = new String[] {""} ;
      T01GB2_A4198XHDRCod = new int[1] ;
      T01GB2_A4199XHDRReo = new byte[1] ;
      T01GB2_A4200XHDRPar = new String[] {""} ;
      T01GB2_A4201XHDRDisCli = new String[] {""} ;
      T01GB2_n4201XHDRDisCli = new boolean[] {false} ;
      T01GB2_A4202XHDRSERCOD = new String[] {""} ;
      T01GB2_n4202XHDRSERCOD = new boolean[] {false} ;
      T01GB2_A4203XHDRCCLNOM = new String[] {""} ;
      T01GB2_n4203XHDRCCLNOM = new boolean[] {false} ;
      T01GB2_A4204XHDRCCLNUM = new int[1] ;
      T01GB2_n4204XHDRCCLNUM = new boolean[] {false} ;
      T01GB2_A4205XHDRCOLNUM = new int[1] ;
      T01GB2_n4205XHDRCOLNUM = new boolean[] {false} ;
      T01GB2_A4206XHDRKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GB2_n4206XHDRKGS = new boolean[] {false} ;
      T01GB2_A4207XHDRFECGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB2_n4207XHDRFECGEN = new boolean[] {false} ;
      T01GB2_A4208XHDRFECTIN = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB2_n4208XHDRFECTIN = new boolean[] {false} ;
      T01GB2_A4209XHDRFECEXP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB2_n4209XHDRFECEXP = new boolean[] {false} ;
      T01GB2_A4210XHDRFECCMP = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB2_n4210XHDRFECCMP = new boolean[] {false} ;
      T01GB2_A4211XHDRFECALM = new java.util.Date[] {GXutil.nullDate()} ;
      T01GB2_n4211XHDRFECALM = new boolean[] {false} ;
      T01GB2_A4212XHDREST = new byte[1] ;
      T01GB2_n4212XHDREST = new boolean[] {false} ;
      T01GB2_A396EmprCod = new String[] {""} ;
      T01GB2_A252CliCod = new int[1] ;
      T01GB2_n252CliCod = new boolean[] {false} ;
      T01GB13_A396EmprCod = new String[] {""} ;
      T01GB13_A4198XHDRCod = new int[1] ;
      T01GB13_A4199XHDRReo = new byte[1] ;
      T01GB13_A4200XHDRPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ4200XHDRPar = "" ;
      ZZ4201XHDRDisCli = "" ;
      ZZ4202XHDRSERCOD = "" ;
      ZZ4203XHDRCCLNOM = "" ;
      ZZ4206XHDRKGS = DecimalUtil.ZERO ;
      ZZ4207XHDRFECGEN = GXutil.nullDate() ;
      ZZ4208XHDRFECTIN = GXutil.nullDate() ;
      ZZ4209XHDRFECEXP = GXutil.nullDate() ;
      ZZ4210XHDRFECCMP = GXutil.nullDate() ;
      ZZ4211XHDRFECALM = GXutil.nullDate() ;
      T01GB14_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txhdr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txhdr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txhdr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txhdr__default(),
         new Object[] {
             new Object[] {
            T01GB2_A4198XHDRCod, T01GB2_A4199XHDRReo, T01GB2_A4200XHDRPar, T01GB2_A4201XHDRDisCli, T01GB2_n4201XHDRDisCli, T01GB2_A4202XHDRSERCOD, T01GB2_n4202XHDRSERCOD, T01GB2_A4203XHDRCCLNOM, T01GB2_n4203XHDRCCLNOM, T01GB2_A4204XHDRCCLNUM,
            T01GB2_n4204XHDRCCLNUM, T01GB2_A4205XHDRCOLNUM, T01GB2_n4205XHDRCOLNUM, T01GB2_A4206XHDRKGS, T01GB2_n4206XHDRKGS, T01GB2_A4207XHDRFECGEN, T01GB2_n4207XHDRFECGEN, T01GB2_A4208XHDRFECTIN, T01GB2_n4208XHDRFECTIN, T01GB2_A4209XHDRFECEXP,
            T01GB2_n4209XHDRFECEXP, T01GB2_A4210XHDRFECCMP, T01GB2_n4210XHDRFECCMP, T01GB2_A4211XHDRFECALM, T01GB2_n4211XHDRFECALM, T01GB2_A4212XHDREST, T01GB2_n4212XHDREST, T01GB2_A396EmprCod, T01GB2_A252CliCod, T01GB2_n252CliCod
            }
            , new Object[] {
            T01GB3_A4198XHDRCod, T01GB3_A4199XHDRReo, T01GB3_A4200XHDRPar, T01GB3_A4201XHDRDisCli, T01GB3_n4201XHDRDisCli, T01GB3_A4202XHDRSERCOD, T01GB3_n4202XHDRSERCOD, T01GB3_A4203XHDRCCLNOM, T01GB3_n4203XHDRCCLNOM, T01GB3_A4204XHDRCCLNUM,
            T01GB3_n4204XHDRCCLNUM, T01GB3_A4205XHDRCOLNUM, T01GB3_n4205XHDRCOLNUM, T01GB3_A4206XHDRKGS, T01GB3_n4206XHDRKGS, T01GB3_A4207XHDRFECGEN, T01GB3_n4207XHDRFECGEN, T01GB3_A4208XHDRFECTIN, T01GB3_n4208XHDRFECTIN, T01GB3_A4209XHDRFECEXP,
            T01GB3_n4209XHDRFECEXP, T01GB3_A4210XHDRFECCMP, T01GB3_n4210XHDRFECCMP, T01GB3_A4211XHDRFECALM, T01GB3_n4211XHDRFECALM, T01GB3_A4212XHDREST, T01GB3_n4212XHDREST, T01GB3_A396EmprCod, T01GB3_A252CliCod, T01GB3_n252CliCod
            }
            , new Object[] {
            T01GB4_A396EmprCod
            }
            , new Object[] {
            T01GB5_A4198XHDRCod, T01GB5_A4199XHDRReo, T01GB5_A4200XHDRPar, T01GB5_A4201XHDRDisCli, T01GB5_n4201XHDRDisCli, T01GB5_A4202XHDRSERCOD, T01GB5_n4202XHDRSERCOD, T01GB5_A4203XHDRCCLNOM, T01GB5_n4203XHDRCCLNOM, T01GB5_A4204XHDRCCLNUM,
            T01GB5_n4204XHDRCCLNUM, T01GB5_A4205XHDRCOLNUM, T01GB5_n4205XHDRCOLNUM, T01GB5_A4206XHDRKGS, T01GB5_n4206XHDRKGS, T01GB5_A4207XHDRFECGEN, T01GB5_n4207XHDRFECGEN, T01GB5_A4208XHDRFECTIN, T01GB5_n4208XHDRFECTIN, T01GB5_A4209XHDRFECEXP,
            T01GB5_n4209XHDRFECEXP, T01GB5_A4210XHDRFECCMP, T01GB5_n4210XHDRFECCMP, T01GB5_A4211XHDRFECALM, T01GB5_n4211XHDRFECALM, T01GB5_A4212XHDREST, T01GB5_n4212XHDREST, T01GB5_A396EmprCod, T01GB5_A252CliCod, T01GB5_n252CliCod
            }
            , new Object[] {
            T01GB6_A396EmprCod
            }
            , new Object[] {
            T01GB7_A396EmprCod, T01GB7_A4198XHDRCod, T01GB7_A4199XHDRReo, T01GB7_A4200XHDRPar
            }
            , new Object[] {
            T01GB8_A396EmprCod, T01GB8_A4198XHDRCod, T01GB8_A4199XHDRReo, T01GB8_A4200XHDRPar
            }
            , new Object[] {
            T01GB9_A396EmprCod, T01GB9_A4198XHDRCod, T01GB9_A4199XHDRReo, T01GB9_A4200XHDRPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GB13_A396EmprCod, T01GB13_A4198XHDRCod, T01GB13_A4199XHDRReo, T01GB13_A4200XHDRPar
            }
            , new Object[] {
            T01GB14_A396EmprCod
            }
         }
      );
   }

   private byte Z4199XHDRReo ;
   private byte Z4212XHDREST ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4199XHDRReo ;
   private byte A4212XHDREST ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4199XHDRReo ;
   private byte ZZ4212XHDREST ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1604 ;
   private short nIsDirty_1604 ;
   private int Z4198XHDRCod ;
   private int Z4204XHDRCCLNUM ;
   private int Z4205XHDRCOLNUM ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int A4198XHDRCod ;
   private int edtXHDRCod_Enabled ;
   private int edtXHDRReo_Enabled ;
   private int edtXHDRPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXHDRDisCli_Enabled ;
   private int edtXHDRSERCOD_Enabled ;
   private int edtXHDRCCLNOM_Enabled ;
   private int A4204XHDRCCLNUM ;
   private int edtXHDRCCLNUM_Enabled ;
   private int A4205XHDRCOLNUM ;
   private int edtXHDRCOLNUM_Enabled ;
   private int edtXHDRKGS_Enabled ;
   private int edtXHDRFECGEN_Enabled ;
   private int edtXHDRFECTIN_Enabled ;
   private int edtXHDRFECEXP_Enabled ;
   private int edtXHDRFECCMP_Enabled ;
   private int edtXHDRFECALM_Enabled ;
   private int edtXHDREST_Enabled ;
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
   private int edtXHDREST_Backcolor ;
   private int edtXHDRFECALM_Backcolor ;
   private int edtXHDRFECCMP_Backcolor ;
   private int edtXHDRFECEXP_Backcolor ;
   private int edtXHDRFECTIN_Backcolor ;
   private int edtXHDRFECGEN_Backcolor ;
   private int edtXHDRKGS_Backcolor ;
   private int edtXHDRCOLNUM_Backcolor ;
   private int edtXHDRCCLNUM_Backcolor ;
   private int edtXHDRCCLNOM_Backcolor ;
   private int edtXHDRSERCOD_Backcolor ;
   private int edtXHDRDisCli_Backcolor ;
   private int edtXHDRPar_Backcolor ;
   private int edtXHDRReo_Backcolor ;
   private int edtXHDRCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4198XHDRCod ;
   private int ZZ252CliCod ;
   private int ZZ4204XHDRCCLNUM ;
   private int ZZ4205XHDRCOLNUM ;
   private java.math.BigDecimal Z4206XHDRKGS ;
   private java.math.BigDecimal A4206XHDRKGS ;
   private java.math.BigDecimal ZZ4206XHDRKGS ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4200XHDRPar ;
   private String Z4201XHDRDisCli ;
   private String Z4202XHDRSERCOD ;
   private String Z4203XHDRCCLNOM ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXHDRCod_Internalname ;
   private String edtXHDRCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXHDRReo_Internalname ;
   private String edtXHDRReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXHDRPar_Internalname ;
   private String A4200XHDRPar ;
   private String edtXHDRPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXHDRDisCli_Internalname ;
   private String A4201XHDRDisCli ;
   private String edtXHDRDisCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXHDRSERCOD_Internalname ;
   private String A4202XHDRSERCOD ;
   private String edtXHDRSERCOD_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXHDRCCLNOM_Internalname ;
   private String A4203XHDRCCLNOM ;
   private String edtXHDRCCLNOM_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXHDRCCLNUM_Internalname ;
   private String edtXHDRCCLNUM_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXHDRCOLNUM_Internalname ;
   private String edtXHDRCOLNUM_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXHDRKGS_Internalname ;
   private String edtXHDRKGS_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXHDRFECGEN_Internalname ;
   private String edtXHDRFECGEN_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXHDRFECTIN_Internalname ;
   private String edtXHDRFECTIN_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXHDRFECEXP_Internalname ;
   private String edtXHDRFECEXP_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXHDRFECCMP_Internalname ;
   private String edtXHDRFECCMP_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXHDRFECALM_Internalname ;
   private String edtXHDRFECALM_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtXHDREST_Internalname ;
   private String edtXHDREST_Jsonclick ;
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
   private String sMode1604 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ4200XHDRPar ;
   private String ZZ4201XHDRDisCli ;
   private String ZZ4202XHDRSERCOD ;
   private String ZZ4203XHDRCCLNOM ;
   private java.util.Date Z4207XHDRFECGEN ;
   private java.util.Date Z4208XHDRFECTIN ;
   private java.util.Date Z4209XHDRFECEXP ;
   private java.util.Date Z4210XHDRFECCMP ;
   private java.util.Date Z4211XHDRFECALM ;
   private java.util.Date A4207XHDRFECGEN ;
   private java.util.Date A4208XHDRFECTIN ;
   private java.util.Date A4209XHDRFECEXP ;
   private java.util.Date A4210XHDRFECCMP ;
   private java.util.Date A4211XHDRFECALM ;
   private java.util.Date ZZ4207XHDRFECGEN ;
   private java.util.Date ZZ4208XHDRFECTIN ;
   private java.util.Date ZZ4209XHDRFECEXP ;
   private java.util.Date ZZ4210XHDRFECCMP ;
   private java.util.Date ZZ4211XHDRFECALM ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n4201XHDRDisCli ;
   private boolean n4202XHDRSERCOD ;
   private boolean n4203XHDRCCLNOM ;
   private boolean n4204XHDRCCLNUM ;
   private boolean n4205XHDRCOLNUM ;
   private boolean n4206XHDRKGS ;
   private boolean n4207XHDRFECGEN ;
   private boolean n4208XHDRFECTIN ;
   private boolean n4209XHDRFECEXP ;
   private boolean n4210XHDRFECCMP ;
   private boolean n4211XHDRFECALM ;
   private boolean n4212XHDREST ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private int[] T01GB5_A4198XHDRCod ;
   private byte[] T01GB5_A4199XHDRReo ;
   private String[] T01GB5_A4200XHDRPar ;
   private String[] T01GB5_A4201XHDRDisCli ;
   private boolean[] T01GB5_n4201XHDRDisCli ;
   private String[] T01GB5_A4202XHDRSERCOD ;
   private boolean[] T01GB5_n4202XHDRSERCOD ;
   private String[] T01GB5_A4203XHDRCCLNOM ;
   private boolean[] T01GB5_n4203XHDRCCLNOM ;
   private int[] T01GB5_A4204XHDRCCLNUM ;
   private boolean[] T01GB5_n4204XHDRCCLNUM ;
   private int[] T01GB5_A4205XHDRCOLNUM ;
   private boolean[] T01GB5_n4205XHDRCOLNUM ;
   private java.math.BigDecimal[] T01GB5_A4206XHDRKGS ;
   private boolean[] T01GB5_n4206XHDRKGS ;
   private java.util.Date[] T01GB5_A4207XHDRFECGEN ;
   private boolean[] T01GB5_n4207XHDRFECGEN ;
   private java.util.Date[] T01GB5_A4208XHDRFECTIN ;
   private boolean[] T01GB5_n4208XHDRFECTIN ;
   private java.util.Date[] T01GB5_A4209XHDRFECEXP ;
   private boolean[] T01GB5_n4209XHDRFECEXP ;
   private java.util.Date[] T01GB5_A4210XHDRFECCMP ;
   private boolean[] T01GB5_n4210XHDRFECCMP ;
   private java.util.Date[] T01GB5_A4211XHDRFECALM ;
   private boolean[] T01GB5_n4211XHDRFECALM ;
   private byte[] T01GB5_A4212XHDREST ;
   private boolean[] T01GB5_n4212XHDREST ;
   private String[] T01GB5_A396EmprCod ;
   private int[] T01GB5_A252CliCod ;
   private boolean[] T01GB5_n252CliCod ;
   private String[] T01GB4_A396EmprCod ;
   private String[] T01GB6_A396EmprCod ;
   private String[] T01GB7_A396EmprCod ;
   private int[] T01GB7_A4198XHDRCod ;
   private byte[] T01GB7_A4199XHDRReo ;
   private String[] T01GB7_A4200XHDRPar ;
   private int[] T01GB3_A4198XHDRCod ;
   private byte[] T01GB3_A4199XHDRReo ;
   private String[] T01GB3_A4200XHDRPar ;
   private String[] T01GB3_A4201XHDRDisCli ;
   private boolean[] T01GB3_n4201XHDRDisCli ;
   private String[] T01GB3_A4202XHDRSERCOD ;
   private boolean[] T01GB3_n4202XHDRSERCOD ;
   private String[] T01GB3_A4203XHDRCCLNOM ;
   private boolean[] T01GB3_n4203XHDRCCLNOM ;
   private int[] T01GB3_A4204XHDRCCLNUM ;
   private boolean[] T01GB3_n4204XHDRCCLNUM ;
   private int[] T01GB3_A4205XHDRCOLNUM ;
   private boolean[] T01GB3_n4205XHDRCOLNUM ;
   private java.math.BigDecimal[] T01GB3_A4206XHDRKGS ;
   private boolean[] T01GB3_n4206XHDRKGS ;
   private java.util.Date[] T01GB3_A4207XHDRFECGEN ;
   private boolean[] T01GB3_n4207XHDRFECGEN ;
   private java.util.Date[] T01GB3_A4208XHDRFECTIN ;
   private boolean[] T01GB3_n4208XHDRFECTIN ;
   private java.util.Date[] T01GB3_A4209XHDRFECEXP ;
   private boolean[] T01GB3_n4209XHDRFECEXP ;
   private java.util.Date[] T01GB3_A4210XHDRFECCMP ;
   private boolean[] T01GB3_n4210XHDRFECCMP ;
   private java.util.Date[] T01GB3_A4211XHDRFECALM ;
   private boolean[] T01GB3_n4211XHDRFECALM ;
   private byte[] T01GB3_A4212XHDREST ;
   private boolean[] T01GB3_n4212XHDREST ;
   private String[] T01GB3_A396EmprCod ;
   private int[] T01GB3_A252CliCod ;
   private boolean[] T01GB3_n252CliCod ;
   private String[] T01GB8_A396EmprCod ;
   private int[] T01GB8_A4198XHDRCod ;
   private byte[] T01GB8_A4199XHDRReo ;
   private String[] T01GB8_A4200XHDRPar ;
   private String[] T01GB9_A396EmprCod ;
   private int[] T01GB9_A4198XHDRCod ;
   private byte[] T01GB9_A4199XHDRReo ;
   private String[] T01GB9_A4200XHDRPar ;
   private int[] T01GB2_A4198XHDRCod ;
   private byte[] T01GB2_A4199XHDRReo ;
   private String[] T01GB2_A4200XHDRPar ;
   private String[] T01GB2_A4201XHDRDisCli ;
   private boolean[] T01GB2_n4201XHDRDisCli ;
   private String[] T01GB2_A4202XHDRSERCOD ;
   private boolean[] T01GB2_n4202XHDRSERCOD ;
   private String[] T01GB2_A4203XHDRCCLNOM ;
   private boolean[] T01GB2_n4203XHDRCCLNOM ;
   private int[] T01GB2_A4204XHDRCCLNUM ;
   private boolean[] T01GB2_n4204XHDRCCLNUM ;
   private int[] T01GB2_A4205XHDRCOLNUM ;
   private boolean[] T01GB2_n4205XHDRCOLNUM ;
   private java.math.BigDecimal[] T01GB2_A4206XHDRKGS ;
   private boolean[] T01GB2_n4206XHDRKGS ;
   private java.util.Date[] T01GB2_A4207XHDRFECGEN ;
   private boolean[] T01GB2_n4207XHDRFECGEN ;
   private java.util.Date[] T01GB2_A4208XHDRFECTIN ;
   private boolean[] T01GB2_n4208XHDRFECTIN ;
   private java.util.Date[] T01GB2_A4209XHDRFECEXP ;
   private boolean[] T01GB2_n4209XHDRFECEXP ;
   private java.util.Date[] T01GB2_A4210XHDRFECCMP ;
   private boolean[] T01GB2_n4210XHDRFECCMP ;
   private java.util.Date[] T01GB2_A4211XHDRFECALM ;
   private boolean[] T01GB2_n4211XHDRFECALM ;
   private byte[] T01GB2_A4212XHDREST ;
   private boolean[] T01GB2_n4212XHDREST ;
   private String[] T01GB2_A396EmprCod ;
   private int[] T01GB2_A252CliCod ;
   private boolean[] T01GB2_n252CliCod ;
   private String[] T01GB13_A396EmprCod ;
   private int[] T01GB13_A4198XHDRCod ;
   private byte[] T01GB13_A4199XHDRReo ;
   private String[] T01GB13_A4200XHDRPar ;
   private String[] T01GB14_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txhdr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txhdr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txhdr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GB2", "SELECT XHDRCod, XHDRReo, XHDRPar, XHDRDisCli, XHDRSERCOD, XHDRCCLNOM, XHDRCCLNUM, XHDRCOLNUM, XHDRKGS, XHDRFECGEN, XHDRFECTIN, XHDRFECEXP, XHDRFECCMP, XHDRFECALM, XHDREST, EmprCod, CliCod FROM TXPXHDR WHERE EmprCod = ? AND XHDRCod = ? AND XHDRReo = ? AND XHDRPar = ?  FOR UPDATE OF XHDRDisCli, XHDRSERCOD, XHDRCCLNOM, XHDRCCLNUM, XHDRCOLNUM, XHDRKGS, XHDRFECGEN, XHDRFECTIN, XHDRFECEXP, XHDRFECCMP, XHDRFECALM, XHDREST, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB3", "SELECT XHDRCod, XHDRReo, XHDRPar, XHDRDisCli, XHDRSERCOD, XHDRCCLNOM, XHDRCCLNUM, XHDRCOLNUM, XHDRKGS, XHDRFECGEN, XHDRFECTIN, XHDRFECEXP, XHDRFECCMP, XHDRFECALM, XHDREST, EmprCod, CliCod FROM TXPXHDR WHERE EmprCod = ? AND XHDRCod = ? AND XHDRReo = ? AND XHDRPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB4", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB5", "SELECT /*+ FIRST_ROWS(100) */ TM1.XHDRCod, TM1.XHDRReo, TM1.XHDRPar, TM1.XHDRDisCli, TM1.XHDRSERCOD, TM1.XHDRCCLNOM, TM1.XHDRCCLNUM, TM1.XHDRCOLNUM, TM1.XHDRKGS, TM1.XHDRFECGEN, TM1.XHDRFECTIN, TM1.XHDRFECEXP, TM1.XHDRFECCMP, TM1.XHDRFECALM, TM1.XHDREST, TM1.EmprCod, TM1.CliCod FROM TXPXHDR TM1 WHERE TM1.EmprCod = ? and TM1.XHDRCod = ? and TM1.XHDRReo = ? and TM1.XHDRPar = ? ORDER BY TM1.EmprCod, TM1.XHDRCod, TM1.XHDRReo, TM1.XHDRPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB6", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XHDRCod, XHDRReo, XHDRPar FROM TXPXHDR WHERE EmprCod = ? AND XHDRCod = ? AND XHDRReo = ? AND XHDRPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XHDRCod, XHDRReo, XHDRPar FROM TXPXHDR WHERE ( EmprCod > ? or EmprCod = ? and XHDRCod > ? or XHDRCod = ? and EmprCod = ? and XHDRReo > ? or XHDRReo = ? and XHDRCod = ? and EmprCod = ? and XHDRPar > ?) ORDER BY EmprCod, XHDRCod, XHDRReo, XHDRPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GB9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XHDRCod, XHDRReo, XHDRPar FROM TXPXHDR WHERE ( EmprCod < ? or EmprCod = ? and XHDRCod < ? or XHDRCod = ? and EmprCod = ? and XHDRReo < ? or XHDRReo = ? and XHDRCod = ? and EmprCod = ? and XHDRPar < ?) ORDER BY EmprCod DESC, XHDRCod DESC, XHDRReo DESC, XHDRPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GB10", "INSERT INTO TXPXHDR(XHDRCod, XHDRReo, XHDRPar, XHDRDisCli, XHDRSERCOD, XHDRCCLNOM, XHDRCCLNUM, XHDRCOLNUM, XHDRKGS, XHDRFECGEN, XHDRFECTIN, XHDRFECEXP, XHDRFECCMP, XHDRFECALM, XHDREST, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXHDR")
         ,new UpdateCursor("T01GB11", "UPDATE TXPXHDR SET XHDRDisCli=?, XHDRSERCOD=?, XHDRCCLNOM=?, XHDRCCLNUM=?, XHDRCOLNUM=?, XHDRKGS=?, XHDRFECGEN=?, XHDRFECTIN=?, XHDRFECEXP=?, XHDRFECCMP=?, XHDRFECALM=?, XHDREST=?, CliCod=?  WHERE EmprCod = ? AND XHDRCod = ? AND XHDRReo = ? AND XHDRPar = ?", GX_NOMASK, "TXPXHDR")
         ,new UpdateCursor("T01GB12", "DELETE FROM TXPXHDR  WHERE EmprCod = ? AND XHDRCod = ? AND XHDRReo = ? AND XHDRPar = ?", GX_NOMASK, "TXPXHDR")
         ,new ForEachCursor("T01GB13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XHDRCod, XHDRReo, XHDRPar FROM TXPXHDR ORDER BY EmprCod, XHDRCod, XHDRReo, XHDRPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GB14", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 3);
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 3);
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 3);
               ((int[]) buf[28])[0] = rslt.getInt(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 12 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
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
            case 7 :
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
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[24]);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[26]).byteValue());
               }
               stmt.setString(16, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[29]).intValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[9]).intValue());
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
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[21]);
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setByte(16, ((Number) parms[28]).byteValue());
               stmt.setString(17, (String)parms[29], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
      }
   }

}

