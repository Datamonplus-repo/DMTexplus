package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrbarpie_impl extends GXDataArea
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
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "BARPIE", ""), (short)(0)) ;
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

   public ttrbarpie_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrbarpie_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrbarpie_impl.class ));
   }

   public ttrbarpie_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrBARPIE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Bruto", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniB_Internalname, GXutil.ltrim( localUtil.ntoc( A6473BarUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarUniB_Enabled!=0) ? localUtil.format( A6473BarUniB, "ZZZZZ9.99") : localUtil.format( A6473BarUniB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniB_Jsonclick, 0, "", "", "", "", "", 1, edtBarUniB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Tara", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6472BarTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTara_Enabled!=0) ? localUtil.format( A6472BarTara, "ZZ9.99") : localUtil.format( A6472BarTara, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTara_Jsonclick, 0, "", "", "", "", "", 1, edtBarTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieObs_Internalname, GXutil.rtrim( A1919BarPieObs), GXutil.rtrim( localUtil.format( A1919BarPieObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieObs_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Pulgadas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPiePda_Internalname, GXutil.ltrim( localUtil.ntoc( A9984BarPiePda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPiePda_Enabled!=0) ? localUtil.format( A9984BarPiePda, "ZZ9.99") : localUtil.format( A9984BarPiePda, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPiePda_Jsonclick, 0, "", "", "", "", "", 1, edtBarPiePda_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAncc_Internalname, GXutil.ltrim( localUtil.ntoc( A9846BarPieAncc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAncc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9846BarPieAncc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9846BarPieAncc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAncc_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieAncc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "N veces Pesadas", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNPes_Internalname, GXutil.ltrim( localUtil.ntoc( A9800BarNPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9800BarNPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A9800BarNPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNPes_Jsonclick, 0, "", "", "", "", "", 1, edtBarNPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Piezas 2", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPz2_Internalname, GXutil.ltrim( localUtil.ntoc( A9799BarPz2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPz2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9799BarPz2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9799BarPz2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPz2_Jsonclick, 0, "", "", "", "", "", 1, edtBarPz2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Piezas 1", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPz1_Internalname, GXutil.ltrim( localUtil.ntoc( A9798BarPz1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPz1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9798BarPz1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9798BarPz1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPz1_Jsonclick, 0, "", "", "", "", "", 1, edtBarPz1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Kilos 2", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieK2_Internalname, GXutil.ltrim( localUtil.ntoc( A9796BarPieK2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieK2_Enabled!=0) ? localUtil.format( A9796BarPieK2, "ZZZZZ9.99") : localUtil.format( A9796BarPieK2, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieK2_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieK2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Kilos 1", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieK1_Internalname, GXutil.ltrim( localUtil.ntoc( A9795BarPieK1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieK1_Enabled!=0) ? localUtil.format( A9795BarPieK1, "ZZZZZ9.99") : localUtil.format( A9795BarPieK1, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieK1_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieK1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Pza B80", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPzaB80_Internalname, GXutil.rtrim( A8907PzaB80), GXutil.rtrim( localUtil.format( A8907PzaB80, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPzaB80_Jsonclick, 0, "", "", "", "", "", 1, edtPzaB80_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "CodigoBarras", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodBarPz_Internalname, GXutil.rtrim( A8838CodBarPz), GXutil.rtrim( localUtil.format( A8838CodBarPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodBarPz_Jsonclick, 0, "", "", "", "", "", 1, edtCodBarPz_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Observaciones Pieza", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBapieObs_Internalname, GXutil.rtrim( A8707BapieObs), GXutil.rtrim( localUtil.format( A8707BapieObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBapieObs_Jsonclick, 0, "", "", "", "", "", 1, edtBapieObs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Identificacion Pieza", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieIdPz_Internalname, GXutil.rtrim( A6489BarPieIdPz), GXutil.rtrim( localUtil.format( A6489BarPieIdPz, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieIdPz_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieIdPz_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Impresa?", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieImp_Internalname, GXutil.rtrim( A6116BarPieImp), GXutil.rtrim( localUtil.format( A6116BarPieImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieImp_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieImp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "BarPieAut", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3277BarPieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAut_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3277BarPieAut), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3277BarPieAut), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAut_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieAut_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "BarMtsAut", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3276BarMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtsAut_Enabled!=0) ? localUtil.format( A3276BarMtsAut, "ZZZZZ9.99") : localUtil.format( A3276BarMtsAut, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtsAut_Jsonclick, 0, "", "", "", "", "", 1, edtBarMtsAut_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "BarKgsAut", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgsAut_Internalname, GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgsAut_Enabled!=0) ? localUtil.format( A3275BarKgsAut, "ZZZZZ9.99") : localUtil.format( A3275BarKgsAut, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgsAut_Jsonclick, 0, "", "", "", "", "", 1, edtBarKgsAut_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Ancho Acabado Pieza", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieAnc_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Localizacion Pieza", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLoc_Internalname, GXutil.rtrim( A2186BarPieLoc), GXutil.rtrim( localUtil.format( A2186BarPieLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLoc_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Piezas no desglose", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1501BarPiePie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPiePie_Jsonclick, 0, "", "", "", "", "", 1, edtBarPiePie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Piezas Lanzadas (no desglose)", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLzd_Internalname, GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieLzd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1271BarPieLzd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLzd_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieLzd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Pieza Original", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPieOriCod_Internalname, GXutil.rtrim( A908PieOriCod), GXutil.rtrim( localUtil.format( A908PieOriCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPieOriCod_Jsonclick, 0, "", "", "", "", "", 1, edtPieOriCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Trozos Pieza", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPConTro_Jsonclick, 0, "", "", "", "", "", 1, edtBarPConTro_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Metros Lanzados", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMetLan_Enabled!=0) ? localUtil.format( A183BarMetLan, "ZZZZZ9.99") : localUtil.format( A183BarMetLan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMetLan_Jsonclick, 0, "", "", "", "", "", 1, edtBarMetLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "BarKilLan", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKilLan_Enabled!=0) ? localUtil.format( A170BarKilLan, "ZZZZZ9.99") : localUtil.format( A170BarKilLan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKilLan_Jsonclick, 0, "", "", "", "", "", 1, edtBarKilLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Estado Pieza", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieMet_Enabled!=0) ? localUtil.format( A205BarPieMet, "ZZZZZ9.99") : localUtil.format( A205BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieMet_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieKil_Enabled!=0) ? localUtil.format( A203BarPieKil, "ZZZZZ9.99") : localUtil.format( A203BarPieKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieKil_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Numero Orden Interno Pieza", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A1642BarPieOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1642BarPieOrd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1642BarPieOrd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieOrd_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieOrd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrBARPIE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrBARPIE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrBARPIE.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
         Z6473BarUniB = localUtil.ctond( httpContext.cgiGet( "Z6473BarUniB")) ;
         Z6472BarTara = localUtil.ctond( httpContext.cgiGet( "Z6472BarTara")) ;
         Z1919BarPieObs = httpContext.cgiGet( "Z1919BarPieObs") ;
         Z9984BarPiePda = localUtil.ctond( httpContext.cgiGet( "Z9984BarPiePda")) ;
         Z9846BarPieAncc = (short)(localUtil.ctol( httpContext.cgiGet( "Z9846BarPieAncc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9800BarNPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9800BarNPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9799BarPz2 = (int)(localUtil.ctol( httpContext.cgiGet( "Z9799BarPz2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9798BarPz1 = (int)(localUtil.ctol( httpContext.cgiGet( "Z9798BarPz1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9796BarPieK2 = localUtil.ctond( httpContext.cgiGet( "Z9796BarPieK2")) ;
         Z9795BarPieK1 = localUtil.ctond( httpContext.cgiGet( "Z9795BarPieK1")) ;
         Z8907PzaB80 = httpContext.cgiGet( "Z8907PzaB80") ;
         Z8838CodBarPz = httpContext.cgiGet( "Z8838CodBarPz") ;
         Z8707BapieObs = httpContext.cgiGet( "Z8707BapieObs") ;
         Z6489BarPieIdPz = httpContext.cgiGet( "Z6489BarPieIdPz") ;
         Z6116BarPieImp = httpContext.cgiGet( "Z6116BarPieImp") ;
         Z3277BarPieAut = (short)(localUtil.ctol( httpContext.cgiGet( "Z3277BarPieAut"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3276BarMtsAut = localUtil.ctond( httpContext.cgiGet( "Z3276BarMtsAut")) ;
         Z3275BarKgsAut = localUtil.ctond( httpContext.cgiGet( "Z3275BarKgsAut")) ;
         Z1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z1691BarPieAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2186BarPieLoc = httpContext.cgiGet( "Z2186BarPieLoc") ;
         Z1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1501BarPiePie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( "Z1271BarPieLzd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z908PieOriCod = httpContext.cgiGet( "Z908PieOriCod") ;
         Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( "Z197BarPConTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z183BarMetLan = localUtil.ctond( httpContext.cgiGet( "Z183BarMetLan")) ;
         Z170BarKilLan = localUtil.ctond( httpContext.cgiGet( "Z170BarKilLan")) ;
         Z201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z201BarPieEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z205BarPieMet = localUtil.ctond( httpContext.cgiGet( "Z205BarPieMet")) ;
         Z203BarPieKil = localUtil.ctond( httpContext.cgiGet( "Z203BarPieKil")) ;
         Z1642BarPieOrd = (int)(localUtil.ctol( httpContext.cgiGet( "Z1642BarPieOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A44AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         else
         {
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARUNIB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarUniB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6473BarUniB = DecimalUtil.ZERO ;
            n6473BarUniB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         }
         else
         {
            A6473BarUniB = localUtil.ctond( httpContext.cgiGet( edtBarUniB_Internalname)) ;
            n6473BarUniB = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTARA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTara_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6472BarTara = DecimalUtil.ZERO ;
            n6472BarTara = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         }
         else
         {
            A6472BarTara = localUtil.ctond( httpContext.cgiGet( edtBarTara_Internalname)) ;
            n6472BarTara = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         }
         A1919BarPieObs = httpContext.cgiGet( edtBarPieObs_Internalname) ;
         n1919BarPieObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEPDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPiePda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9984BarPiePda = DecimalUtil.ZERO ;
            n9984BarPiePda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         }
         else
         {
            A9984BarPiePda = localUtil.ctond( httpContext.cgiGet( edtBarPiePda_Internalname)) ;
            n9984BarPiePda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEANCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAncc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9846BarPieAncc = (short)(0) ;
            n9846BarPieAncc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         }
         else
         {
            A9846BarPieAncc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAncc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9846BarPieAncc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9800BarNPes = (byte)(0) ;
            n9800BarNPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         }
         else
         {
            A9800BarNPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarNPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9800BarNPes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPZ2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPz2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9799BarPz2 = 0 ;
            n9799BarPz2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         }
         else
         {
            A9799BarPz2 = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPz2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9799BarPz2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPZ1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPz1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9798BarPz1 = 0 ;
            n9798BarPz1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         }
         else
         {
            A9798BarPz1 = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPz1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9798BarPz1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEK2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieK2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9796BarPieK2 = DecimalUtil.ZERO ;
            n9796BarPieK2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         }
         else
         {
            A9796BarPieK2 = localUtil.ctond( httpContext.cgiGet( edtBarPieK2_Internalname)) ;
            n9796BarPieK2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEK1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieK1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9795BarPieK1 = DecimalUtil.ZERO ;
            n9795BarPieK1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         }
         else
         {
            A9795BarPieK1 = localUtil.ctond( httpContext.cgiGet( edtBarPieK1_Internalname)) ;
            n9795BarPieK1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         }
         A8907PzaB80 = httpContext.cgiGet( edtPzaB80_Internalname) ;
         n8907PzaB80 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         A8838CodBarPz = httpContext.cgiGet( edtCodBarPz_Internalname) ;
         n8838CodBarPz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8707BapieObs = httpContext.cgiGet( edtBapieObs_Internalname) ;
         n8707BapieObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A6489BarPieIdPz = httpContext.cgiGet( edtBarPieIdPz_Internalname) ;
         n6489BarPieIdPz = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A6116BarPieImp = httpContext.cgiGet( edtBarPieImp_Internalname) ;
         n6116BarPieImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3277BarPieAut = (short)(0) ;
            n3277BarPieAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         }
         else
         {
            A3277BarPieAut = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAut_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3277BarPieAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMTSAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMtsAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3276BarMtsAut = DecimalUtil.ZERO ;
            n3276BarMtsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         }
         else
         {
            A3276BarMtsAut = localUtil.ctond( httpContext.cgiGet( edtBarMtsAut_Internalname)) ;
            n3276BarMtsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKGSAUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKgsAut_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3275BarKgsAut = DecimalUtil.ZERO ;
            n3275BarKgsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         }
         else
         {
            A3275BarKgsAut = localUtil.ctond( httpContext.cgiGet( edtBarKgsAut_Internalname)) ;
            n3275BarKgsAut = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1691BarPieAnc = (short)(0) ;
            n1691BarPieAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         }
         else
         {
            A1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1691BarPieAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         }
         A2186BarPieLoc = httpContext.cgiGet( edtBarPieLoc_Internalname) ;
         n2186BarPieLoc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPiePie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1501BarPiePie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         }
         else
         {
            A1501BarPiePie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIELZD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieLzd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1271BarPieLzd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         }
         else
         {
            A1271BarPieLzd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieLzd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         }
         A908PieOriCod = httpContext.cgiGet( edtPieOriCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPCONTRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPConTro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A197BarPConTro = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         }
         else
         {
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMETLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMetLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A183BarMetLan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         }
         else
         {
            A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKILLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKilLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A170BarKilLan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         }
         else
         {
            A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A201BarPieEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         }
         else
         {
            A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEMET");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieMet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A205BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         }
         else
         {
            A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEKIL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieKil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A203BarPieKil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         }
         else
         {
            A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1642BarPieOrd = 0 ;
            n1642BarPieOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1642BarPieOrd), 8, 0));
         }
         else
         {
            A1642BarPieOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1642BarPieOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1642BarPieOrd), 8, 0));
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
            initAll1HT18( ) ;
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
      disableAttributes1HT18( ) ;
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

   public void confirm_1HT0( )
   {
      beforeValidate1HT18( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HT18( ) ;
         }
         else
         {
            checkExtendedTable1HT18( ) ;
            if ( AnyError == 0 )
            {
               zm1HT18( 2) ;
               zm1HT18( 3) ;
            }
            closeExtendedTableCursors1HT18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1HT0( ) ;
      }
   }

   public void resetCaption1HT0( )
   {
   }

   public void zm1HT18( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6473BarUniB = T01HT3_A6473BarUniB[0] ;
            Z6472BarTara = T01HT3_A6472BarTara[0] ;
            Z1919BarPieObs = T01HT3_A1919BarPieObs[0] ;
            Z9984BarPiePda = T01HT3_A9984BarPiePda[0] ;
            Z9846BarPieAncc = T01HT3_A9846BarPieAncc[0] ;
            Z9800BarNPes = T01HT3_A9800BarNPes[0] ;
            Z9799BarPz2 = T01HT3_A9799BarPz2[0] ;
            Z9798BarPz1 = T01HT3_A9798BarPz1[0] ;
            Z9796BarPieK2 = T01HT3_A9796BarPieK2[0] ;
            Z9795BarPieK1 = T01HT3_A9795BarPieK1[0] ;
            Z8907PzaB80 = T01HT3_A8907PzaB80[0] ;
            Z8838CodBarPz = T01HT3_A8838CodBarPz[0] ;
            Z8707BapieObs = T01HT3_A8707BapieObs[0] ;
            Z6489BarPieIdPz = T01HT3_A6489BarPieIdPz[0] ;
            Z6116BarPieImp = T01HT3_A6116BarPieImp[0] ;
            Z3277BarPieAut = T01HT3_A3277BarPieAut[0] ;
            Z3276BarMtsAut = T01HT3_A3276BarMtsAut[0] ;
            Z3275BarKgsAut = T01HT3_A3275BarKgsAut[0] ;
            Z1691BarPieAnc = T01HT3_A1691BarPieAnc[0] ;
            Z2186BarPieLoc = T01HT3_A2186BarPieLoc[0] ;
            Z1501BarPiePie = T01HT3_A1501BarPiePie[0] ;
            Z1271BarPieLzd = T01HT3_A1271BarPieLzd[0] ;
            Z908PieOriCod = T01HT3_A908PieOriCod[0] ;
            Z197BarPConTro = T01HT3_A197BarPConTro[0] ;
            Z183BarMetLan = T01HT3_A183BarMetLan[0] ;
            Z170BarKilLan = T01HT3_A170BarKilLan[0] ;
            Z201BarPieEst = T01HT3_A201BarPieEst[0] ;
            Z205BarPieMet = T01HT3_A205BarPieMet[0] ;
            Z203BarPieKil = T01HT3_A203BarPieKil[0] ;
            Z1642BarPieOrd = T01HT3_A1642BarPieOrd[0] ;
            Z44AlbRecCod = T01HT3_A44AlbRecCod[0] ;
         }
         else
         {
            Z6473BarUniB = A6473BarUniB ;
            Z6472BarTara = A6472BarTara ;
            Z1919BarPieObs = A1919BarPieObs ;
            Z9984BarPiePda = A9984BarPiePda ;
            Z9846BarPieAncc = A9846BarPieAncc ;
            Z9800BarNPes = A9800BarNPes ;
            Z9799BarPz2 = A9799BarPz2 ;
            Z9798BarPz1 = A9798BarPz1 ;
            Z9796BarPieK2 = A9796BarPieK2 ;
            Z9795BarPieK1 = A9795BarPieK1 ;
            Z8907PzaB80 = A8907PzaB80 ;
            Z8838CodBarPz = A8838CodBarPz ;
            Z8707BapieObs = A8707BapieObs ;
            Z6489BarPieIdPz = A6489BarPieIdPz ;
            Z6116BarPieImp = A6116BarPieImp ;
            Z3277BarPieAut = A3277BarPieAut ;
            Z3276BarMtsAut = A3276BarMtsAut ;
            Z3275BarKgsAut = A3275BarKgsAut ;
            Z1691BarPieAnc = A1691BarPieAnc ;
            Z2186BarPieLoc = A2186BarPieLoc ;
            Z1501BarPiePie = A1501BarPiePie ;
            Z1271BarPieLzd = A1271BarPieLzd ;
            Z908PieOriCod = A908PieOriCod ;
            Z197BarPConTro = A197BarPConTro ;
            Z183BarMetLan = A183BarMetLan ;
            Z170BarKilLan = A170BarKilLan ;
            Z201BarPieEst = A201BarPieEst ;
            Z205BarPieMet = A205BarPieMet ;
            Z203BarPieKil = A203BarPieKil ;
            Z1642BarPieOrd = A1642BarPieOrd ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z6473BarUniB = A6473BarUniB ;
         Z6472BarTara = A6472BarTara ;
         Z1919BarPieObs = A1919BarPieObs ;
         Z9984BarPiePda = A9984BarPiePda ;
         Z9846BarPieAncc = A9846BarPieAncc ;
         Z9800BarNPes = A9800BarNPes ;
         Z9799BarPz2 = A9799BarPz2 ;
         Z9798BarPz1 = A9798BarPz1 ;
         Z9796BarPieK2 = A9796BarPieK2 ;
         Z9795BarPieK1 = A9795BarPieK1 ;
         Z8907PzaB80 = A8907PzaB80 ;
         Z8838CodBarPz = A8838CodBarPz ;
         Z8707BapieObs = A8707BapieObs ;
         Z6489BarPieIdPz = A6489BarPieIdPz ;
         Z6116BarPieImp = A6116BarPieImp ;
         Z3277BarPieAut = A3277BarPieAut ;
         Z3276BarMtsAut = A3276BarMtsAut ;
         Z3275BarKgsAut = A3275BarKgsAut ;
         Z1691BarPieAnc = A1691BarPieAnc ;
         Z2186BarPieLoc = A2186BarPieLoc ;
         Z1501BarPiePie = A1501BarPiePie ;
         Z1271BarPieLzd = A1271BarPieLzd ;
         Z908PieOriCod = A908PieOriCod ;
         Z197BarPConTro = A197BarPConTro ;
         Z183BarMetLan = A183BarMetLan ;
         Z170BarKilLan = A170BarKilLan ;
         Z201BarPieEst = A201BarPieEst ;
         Z205BarPieMet = A205BarPieMet ;
         Z203BarPieKil = A203BarPieKil ;
         Z1642BarPieOrd = A1642BarPieOrd ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
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

   public void load1HT18( )
   {
      /* Using cursor T01HT6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A6473BarUniB = T01HT6_A6473BarUniB[0] ;
         n6473BarUniB = T01HT6_n6473BarUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         A6472BarTara = T01HT6_A6472BarTara[0] ;
         n6472BarTara = T01HT6_n6472BarTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         A1919BarPieObs = T01HT6_A1919BarPieObs[0] ;
         n1919BarPieObs = T01HT6_n1919BarPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         A9984BarPiePda = T01HT6_A9984BarPiePda[0] ;
         n9984BarPiePda = T01HT6_n9984BarPiePda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         A9846BarPieAncc = T01HT6_A9846BarPieAncc[0] ;
         n9846BarPieAncc = T01HT6_n9846BarPieAncc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         A9800BarNPes = T01HT6_A9800BarNPes[0] ;
         n9800BarNPes = T01HT6_n9800BarNPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         A9799BarPz2 = T01HT6_A9799BarPz2[0] ;
         n9799BarPz2 = T01HT6_n9799BarPz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         A9798BarPz1 = T01HT6_A9798BarPz1[0] ;
         n9798BarPz1 = T01HT6_n9798BarPz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         A9796BarPieK2 = T01HT6_A9796BarPieK2[0] ;
         n9796BarPieK2 = T01HT6_n9796BarPieK2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         A9795BarPieK1 = T01HT6_A9795BarPieK1[0] ;
         n9795BarPieK1 = T01HT6_n9795BarPieK1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         A8907PzaB80 = T01HT6_A8907PzaB80[0] ;
         n8907PzaB80 = T01HT6_n8907PzaB80[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         A8838CodBarPz = T01HT6_A8838CodBarPz[0] ;
         n8838CodBarPz = T01HT6_n8838CodBarPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8707BapieObs = T01HT6_A8707BapieObs[0] ;
         n8707BapieObs = T01HT6_n8707BapieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A6489BarPieIdPz = T01HT6_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = T01HT6_n6489BarPieIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A6116BarPieImp = T01HT6_A6116BarPieImp[0] ;
         n6116BarPieImp = T01HT6_n6116BarPieImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         A3277BarPieAut = T01HT6_A3277BarPieAut[0] ;
         n3277BarPieAut = T01HT6_n3277BarPieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         A3276BarMtsAut = T01HT6_A3276BarMtsAut[0] ;
         n3276BarMtsAut = T01HT6_n3276BarMtsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         A3275BarKgsAut = T01HT6_A3275BarKgsAut[0] ;
         n3275BarKgsAut = T01HT6_n3275BarKgsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         A1691BarPieAnc = T01HT6_A1691BarPieAnc[0] ;
         n1691BarPieAnc = T01HT6_n1691BarPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         A2186BarPieLoc = T01HT6_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01HT6_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         A1501BarPiePie = T01HT6_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A1271BarPieLzd = T01HT6_A1271BarPieLzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         A908PieOriCod = T01HT6_A908PieOriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         A197BarPConTro = T01HT6_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A183BarMetLan = T01HT6_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A170BarKilLan = T01HT6_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A201BarPieEst = T01HT6_A201BarPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         A205BarPieMet = T01HT6_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A203BarPieKil = T01HT6_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A1642BarPieOrd = T01HT6_A1642BarPieOrd[0] ;
         n1642BarPieOrd = T01HT6_n1642BarPieOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1642BarPieOrd), 8, 0));
         A44AlbRecCod = T01HT6_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         zm1HT18( -1) ;
      }
      pr_default.close(4);
      onLoadActions1HT18( ) ;
   }

   public void onLoadActions1HT18( )
   {
   }

   public void checkExtendedTable1HT18( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01HT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01HT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1HT18( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         int A44AlbRecCod )
   {
      /* Using cursor T01HT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01HT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
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

   public void getKey1HT18( )
   {
      /* Using cursor T01HT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1HT18( 1) ;
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01HT3_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A6473BarUniB = T01HT3_A6473BarUniB[0] ;
         n6473BarUniB = T01HT3_n6473BarUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
         A6472BarTara = T01HT3_A6472BarTara[0] ;
         n6472BarTara = T01HT3_n6472BarTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
         A1919BarPieObs = T01HT3_A1919BarPieObs[0] ;
         n1919BarPieObs = T01HT3_n1919BarPieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
         A9984BarPiePda = T01HT3_A9984BarPiePda[0] ;
         n9984BarPiePda = T01HT3_n9984BarPiePda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
         A9846BarPieAncc = T01HT3_A9846BarPieAncc[0] ;
         n9846BarPieAncc = T01HT3_n9846BarPieAncc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
         A9800BarNPes = T01HT3_A9800BarNPes[0] ;
         n9800BarNPes = T01HT3_n9800BarNPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
         A9799BarPz2 = T01HT3_A9799BarPz2[0] ;
         n9799BarPz2 = T01HT3_n9799BarPz2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
         A9798BarPz1 = T01HT3_A9798BarPz1[0] ;
         n9798BarPz1 = T01HT3_n9798BarPz1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
         A9796BarPieK2 = T01HT3_A9796BarPieK2[0] ;
         n9796BarPieK2 = T01HT3_n9796BarPieK2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
         A9795BarPieK1 = T01HT3_A9795BarPieK1[0] ;
         n9795BarPieK1 = T01HT3_n9795BarPieK1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
         A8907PzaB80 = T01HT3_A8907PzaB80[0] ;
         n8907PzaB80 = T01HT3_n8907PzaB80[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
         A8838CodBarPz = T01HT3_A8838CodBarPz[0] ;
         n8838CodBarPz = T01HT3_n8838CodBarPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
         A8707BapieObs = T01HT3_A8707BapieObs[0] ;
         n8707BapieObs = T01HT3_n8707BapieObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
         A6489BarPieIdPz = T01HT3_A6489BarPieIdPz[0] ;
         n6489BarPieIdPz = T01HT3_n6489BarPieIdPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
         A6116BarPieImp = T01HT3_A6116BarPieImp[0] ;
         n6116BarPieImp = T01HT3_n6116BarPieImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
         A3277BarPieAut = T01HT3_A3277BarPieAut[0] ;
         n3277BarPieAut = T01HT3_n3277BarPieAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
         A3276BarMtsAut = T01HT3_A3276BarMtsAut[0] ;
         n3276BarMtsAut = T01HT3_n3276BarMtsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
         A3275BarKgsAut = T01HT3_A3275BarKgsAut[0] ;
         n3275BarKgsAut = T01HT3_n3275BarKgsAut[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
         A1691BarPieAnc = T01HT3_A1691BarPieAnc[0] ;
         n1691BarPieAnc = T01HT3_n1691BarPieAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
         A2186BarPieLoc = T01HT3_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01HT3_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         A1501BarPiePie = T01HT3_A1501BarPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
         A1271BarPieLzd = T01HT3_A1271BarPieLzd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
         A908PieOriCod = T01HT3_A908PieOriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
         A197BarPConTro = T01HT3_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A183BarMetLan = T01HT3_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A170BarKilLan = T01HT3_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A201BarPieEst = T01HT3_A201BarPieEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
         A205BarPieMet = T01HT3_A205BarPieMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
         A203BarPieKil = T01HT3_A203BarPieKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
         A1642BarPieOrd = T01HT3_A1642BarPieOrd[0] ;
         n1642BarPieOrd = T01HT3_n1642BarPieOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1642BarPieOrd), 8, 0));
         A396EmprCod = T01HT3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01HT3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A129BarCod = T01HT3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HT3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HT3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HT18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey1HT18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1HT18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1HT18( ) ;
      if ( RcdFound18 == 0 )
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
      RcdFound18 = (short)(0) ;
      /* Using cursor T01HT10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A200BarPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT10_A129BarCod[0] < A129BarCod ) || ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT10_A132BarCodReo[0] < A132BarCodReo ) || ( T01HT10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT10_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01HT10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HT10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT10_A200BarPieCod[0], A200BarPieCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT10_A129BarCod[0] > A129BarCod ) || ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT10_A132BarCodReo[0] > A132BarCodReo ) || ( T01HT10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT10_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01HT10_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HT10_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT10_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT10_A200BarPieCod[0], A200BarPieCod) > 0 ) ) )
         {
            A396EmprCod = T01HT10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01HT10_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01HT10_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01HT10_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01HT10_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01HT11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A200BarPieCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT11_A129BarCod[0] > A129BarCod ) || ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT11_A132BarCodReo[0] > A132BarCodReo ) || ( T01HT11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01HT11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HT11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT11_A200BarPieCod[0], A200BarPieCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT11_A129BarCod[0] < A129BarCod ) || ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01HT11_A132BarCodReo[0] < A132BarCodReo ) || ( T01HT11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01HT11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01HT11_A132BarCodReo[0] == A132BarCodReo ) && ( T01HT11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01HT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01HT11_A200BarPieCod[0], A200BarPieCod) < 0 ) ) )
         {
            A396EmprCod = T01HT11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01HT11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01HT11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01HT11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01HT11_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HT18( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HT18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = Z200BarPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
               update1HT18( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HT18( ) ;
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
                  insert1HT18( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = Z200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
      getKey1HT18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = Z200BarPieCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrbarpie");
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HT0( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HT18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HT18( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      scanStart1HT18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound18 != 0 )
         {
            scanNext1HT18( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HT18( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HT18( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6473BarUniB, T01HT2_A6473BarUniB[0]) != 0 ) || ( DecimalUtil.compareTo(Z6472BarTara, T01HT2_A6472BarTara[0]) != 0 ) || ( GXutil.strcmp(Z1919BarPieObs, T01HT2_A1919BarPieObs[0]) != 0 ) || ( DecimalUtil.compareTo(Z9984BarPiePda, T01HT2_A9984BarPiePda[0]) != 0 ) || ( Z9846BarPieAncc != T01HT2_A9846BarPieAncc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9800BarNPes != T01HT2_A9800BarNPes[0] ) || ( Z9799BarPz2 != T01HT2_A9799BarPz2[0] ) || ( Z9798BarPz1 != T01HT2_A9798BarPz1[0] ) || ( DecimalUtil.compareTo(Z9796BarPieK2, T01HT2_A9796BarPieK2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9795BarPieK1, T01HT2_A9795BarPieK1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8907PzaB80, T01HT2_A8907PzaB80[0]) != 0 ) || ( GXutil.strcmp(Z8838CodBarPz, T01HT2_A8838CodBarPz[0]) != 0 ) || ( GXutil.strcmp(Z8707BapieObs, T01HT2_A8707BapieObs[0]) != 0 ) || ( GXutil.strcmp(Z6489BarPieIdPz, T01HT2_A6489BarPieIdPz[0]) != 0 ) || ( GXutil.strcmp(Z6116BarPieImp, T01HT2_A6116BarPieImp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3277BarPieAut != T01HT2_A3277BarPieAut[0] ) || ( DecimalUtil.compareTo(Z3276BarMtsAut, T01HT2_A3276BarMtsAut[0]) != 0 ) || ( DecimalUtil.compareTo(Z3275BarKgsAut, T01HT2_A3275BarKgsAut[0]) != 0 ) || ( Z1691BarPieAnc != T01HT2_A1691BarPieAnc[0] ) || ( GXutil.strcmp(Z2186BarPieLoc, T01HT2_A2186BarPieLoc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1501BarPiePie != T01HT2_A1501BarPiePie[0] ) || ( Z1271BarPieLzd != T01HT2_A1271BarPieLzd[0] ) || ( GXutil.strcmp(Z908PieOriCod, T01HT2_A908PieOriCod[0]) != 0 ) || ( Z197BarPConTro != T01HT2_A197BarPConTro[0] ) || ( DecimalUtil.compareTo(Z183BarMetLan, T01HT2_A183BarMetLan[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z170BarKilLan, T01HT2_A170BarKilLan[0]) != 0 ) || ( Z201BarPieEst != T01HT2_A201BarPieEst[0] ) || ( DecimalUtil.compareTo(Z205BarPieMet, T01HT2_A205BarPieMet[0]) != 0 ) || ( DecimalUtil.compareTo(Z203BarPieKil, T01HT2_A203BarPieKil[0]) != 0 ) || ( Z1642BarPieOrd != T01HT2_A1642BarPieOrd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z44AlbRecCod != T01HT2_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6473BarUniB, T01HT2_A6473BarUniB[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarUniB");
               GXutil.writeLogRaw("Old: ",Z6473BarUniB);
               GXutil.writeLogRaw("Current: ",T01HT2_A6473BarUniB[0]);
            }
            if ( DecimalUtil.compareTo(Z6472BarTara, T01HT2_A6472BarTara[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarTara");
               GXutil.writeLogRaw("Old: ",Z6472BarTara);
               GXutil.writeLogRaw("Current: ",T01HT2_A6472BarTara[0]);
            }
            if ( GXutil.strcmp(Z1919BarPieObs, T01HT2_A1919BarPieObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieObs");
               GXutil.writeLogRaw("Old: ",Z1919BarPieObs);
               GXutil.writeLogRaw("Current: ",T01HT2_A1919BarPieObs[0]);
            }
            if ( DecimalUtil.compareTo(Z9984BarPiePda, T01HT2_A9984BarPiePda[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPiePda");
               GXutil.writeLogRaw("Old: ",Z9984BarPiePda);
               GXutil.writeLogRaw("Current: ",T01HT2_A9984BarPiePda[0]);
            }
            if ( Z9846BarPieAncc != T01HT2_A9846BarPieAncc[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieAncc");
               GXutil.writeLogRaw("Old: ",Z9846BarPieAncc);
               GXutil.writeLogRaw("Current: ",T01HT2_A9846BarPieAncc[0]);
            }
            if ( Z9800BarNPes != T01HT2_A9800BarNPes[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarNPes");
               GXutil.writeLogRaw("Old: ",Z9800BarNPes);
               GXutil.writeLogRaw("Current: ",T01HT2_A9800BarNPes[0]);
            }
            if ( Z9799BarPz2 != T01HT2_A9799BarPz2[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPz2");
               GXutil.writeLogRaw("Old: ",Z9799BarPz2);
               GXutil.writeLogRaw("Current: ",T01HT2_A9799BarPz2[0]);
            }
            if ( Z9798BarPz1 != T01HT2_A9798BarPz1[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPz1");
               GXutil.writeLogRaw("Old: ",Z9798BarPz1);
               GXutil.writeLogRaw("Current: ",T01HT2_A9798BarPz1[0]);
            }
            if ( DecimalUtil.compareTo(Z9796BarPieK2, T01HT2_A9796BarPieK2[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieK2");
               GXutil.writeLogRaw("Old: ",Z9796BarPieK2);
               GXutil.writeLogRaw("Current: ",T01HT2_A9796BarPieK2[0]);
            }
            if ( DecimalUtil.compareTo(Z9795BarPieK1, T01HT2_A9795BarPieK1[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieK1");
               GXutil.writeLogRaw("Old: ",Z9795BarPieK1);
               GXutil.writeLogRaw("Current: ",T01HT2_A9795BarPieK1[0]);
            }
            if ( GXutil.strcmp(Z8907PzaB80, T01HT2_A8907PzaB80[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"PzaB80");
               GXutil.writeLogRaw("Old: ",Z8907PzaB80);
               GXutil.writeLogRaw("Current: ",T01HT2_A8907PzaB80[0]);
            }
            if ( GXutil.strcmp(Z8838CodBarPz, T01HT2_A8838CodBarPz[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"CodBarPz");
               GXutil.writeLogRaw("Old: ",Z8838CodBarPz);
               GXutil.writeLogRaw("Current: ",T01HT2_A8838CodBarPz[0]);
            }
            if ( GXutil.strcmp(Z8707BapieObs, T01HT2_A8707BapieObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BapieObs");
               GXutil.writeLogRaw("Old: ",Z8707BapieObs);
               GXutil.writeLogRaw("Current: ",T01HT2_A8707BapieObs[0]);
            }
            if ( GXutil.strcmp(Z6489BarPieIdPz, T01HT2_A6489BarPieIdPz[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieIdPz");
               GXutil.writeLogRaw("Old: ",Z6489BarPieIdPz);
               GXutil.writeLogRaw("Current: ",T01HT2_A6489BarPieIdPz[0]);
            }
            if ( GXutil.strcmp(Z6116BarPieImp, T01HT2_A6116BarPieImp[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieImp");
               GXutil.writeLogRaw("Old: ",Z6116BarPieImp);
               GXutil.writeLogRaw("Current: ",T01HT2_A6116BarPieImp[0]);
            }
            if ( Z3277BarPieAut != T01HT2_A3277BarPieAut[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieAut");
               GXutil.writeLogRaw("Old: ",Z3277BarPieAut);
               GXutil.writeLogRaw("Current: ",T01HT2_A3277BarPieAut[0]);
            }
            if ( DecimalUtil.compareTo(Z3276BarMtsAut, T01HT2_A3276BarMtsAut[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarMtsAut");
               GXutil.writeLogRaw("Old: ",Z3276BarMtsAut);
               GXutil.writeLogRaw("Current: ",T01HT2_A3276BarMtsAut[0]);
            }
            if ( DecimalUtil.compareTo(Z3275BarKgsAut, T01HT2_A3275BarKgsAut[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarKgsAut");
               GXutil.writeLogRaw("Old: ",Z3275BarKgsAut);
               GXutil.writeLogRaw("Current: ",T01HT2_A3275BarKgsAut[0]);
            }
            if ( Z1691BarPieAnc != T01HT2_A1691BarPieAnc[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieAnc");
               GXutil.writeLogRaw("Old: ",Z1691BarPieAnc);
               GXutil.writeLogRaw("Current: ",T01HT2_A1691BarPieAnc[0]);
            }
            if ( GXutil.strcmp(Z2186BarPieLoc, T01HT2_A2186BarPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieLoc");
               GXutil.writeLogRaw("Old: ",Z2186BarPieLoc);
               GXutil.writeLogRaw("Current: ",T01HT2_A2186BarPieLoc[0]);
            }
            if ( Z1501BarPiePie != T01HT2_A1501BarPiePie[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPiePie");
               GXutil.writeLogRaw("Old: ",Z1501BarPiePie);
               GXutil.writeLogRaw("Current: ",T01HT2_A1501BarPiePie[0]);
            }
            if ( Z1271BarPieLzd != T01HT2_A1271BarPieLzd[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieLzd");
               GXutil.writeLogRaw("Old: ",Z1271BarPieLzd);
               GXutil.writeLogRaw("Current: ",T01HT2_A1271BarPieLzd[0]);
            }
            if ( GXutil.strcmp(Z908PieOriCod, T01HT2_A908PieOriCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"PieOriCod");
               GXutil.writeLogRaw("Old: ",Z908PieOriCod);
               GXutil.writeLogRaw("Current: ",T01HT2_A908PieOriCod[0]);
            }
            if ( Z197BarPConTro != T01HT2_A197BarPConTro[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01HT2_A197BarPConTro[0]);
            }
            if ( DecimalUtil.compareTo(Z183BarMetLan, T01HT2_A183BarMetLan[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarMetLan");
               GXutil.writeLogRaw("Old: ",Z183BarMetLan);
               GXutil.writeLogRaw("Current: ",T01HT2_A183BarMetLan[0]);
            }
            if ( DecimalUtil.compareTo(Z170BarKilLan, T01HT2_A170BarKilLan[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarKilLan");
               GXutil.writeLogRaw("Old: ",Z170BarKilLan);
               GXutil.writeLogRaw("Current: ",T01HT2_A170BarKilLan[0]);
            }
            if ( Z201BarPieEst != T01HT2_A201BarPieEst[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieEst");
               GXutil.writeLogRaw("Old: ",Z201BarPieEst);
               GXutil.writeLogRaw("Current: ",T01HT2_A201BarPieEst[0]);
            }
            if ( DecimalUtil.compareTo(Z205BarPieMet, T01HT2_A205BarPieMet[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieMet");
               GXutil.writeLogRaw("Old: ",Z205BarPieMet);
               GXutil.writeLogRaw("Current: ",T01HT2_A205BarPieMet[0]);
            }
            if ( DecimalUtil.compareTo(Z203BarPieKil, T01HT2_A203BarPieKil[0]) != 0 )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieKil");
               GXutil.writeLogRaw("Old: ",Z203BarPieKil);
               GXutil.writeLogRaw("Current: ",T01HT2_A203BarPieKil[0]);
            }
            if ( Z1642BarPieOrd != T01HT2_A1642BarPieOrd[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"BarPieOrd");
               GXutil.writeLogRaw("Old: ",Z1642BarPieOrd);
               GXutil.writeLogRaw("Current: ",T01HT2_A1642BarPieOrd[0]);
            }
            if ( Z44AlbRecCod != T01HT2_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("ttrbarpie:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01HT2_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HT18( )
   {
      beforeValidate1HT18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HT18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HT18( 0) ;
         checkOptimisticConcurrency1HT18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HT18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HT18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HT12 */
                  pr_default.execute(10, new Object[] {A200BarPieCod, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Integer.valueOf(A1501BarPiePie), Integer.valueOf(A1271BarPieLzd), A908PieOriCod, Short.valueOf(A197BarPConTro), A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), A205BarPieMet, A203BarPieKil, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
                        resetCaption1HT0( ) ;
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
            load1HT18( ) ;
         }
         endLevel1HT18( ) ;
      }
      closeExtendedTableCursors1HT18( ) ;
   }

   public void update1HT18( )
   {
      beforeValidate1HT18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HT18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HT18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HT18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HT18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HT13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Integer.valueOf(A1501BarPiePie), Integer.valueOf(A1271BarPieLzd), A908PieOriCod, Short.valueOf(A197BarPConTro), A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), A205BarPieMet, A203BarPieKil, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HT18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1HT0( ) ;
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
         endLevel1HT18( ) ;
      }
      closeExtendedTableCursors1HT18( ) ;
   }

   public void deferredUpdate1HT18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HT18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HT18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HT18( ) ;
         afterConfirm1HT18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HT18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HT14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound18 == 0 )
                     {
                        initAll1HT18( ) ;
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
                     resetCaption1HT0( ) ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HT18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HT18( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01HT15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01HT16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01HT17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1HT18( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HT18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrbarpie");
         if ( AnyError == 0 )
         {
            confirmValues1HT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrbarpie");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HT18( )
   {
      /* Using cursor T01HT18 */
      pr_default.execute(16);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01HT18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01HT18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HT18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HT18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01HT18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HT18( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A396EmprCod = T01HT18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01HT18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01HT18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01HT18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01HT18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void scanEnd1HT18( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1HT18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HT18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HT18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HT18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HT18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HT18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HT18( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtBarUniB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniB_Enabled), 5, 0), true);
      edtBarTara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTara_Enabled), 5, 0), true);
      edtBarPieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieObs_Enabled), 5, 0), true);
      edtBarPiePda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePda_Enabled), 5, 0), true);
      edtBarPieAncc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAncc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAncc_Enabled), 5, 0), true);
      edtBarNPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNPes_Enabled), 5, 0), true);
      edtBarPz2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPz2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPz2_Enabled), 5, 0), true);
      edtBarPz1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPz1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPz1_Enabled), 5, 0), true);
      edtBarPieK2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieK2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieK2_Enabled), 5, 0), true);
      edtBarPieK1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieK1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieK1_Enabled), 5, 0), true);
      edtPzaB80_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPzaB80_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPzaB80_Enabled), 5, 0), true);
      edtCodBarPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodBarPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodBarPz_Enabled), 5, 0), true);
      edtBapieObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBapieObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBapieObs_Enabled), 5, 0), true);
      edtBarPieIdPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieIdPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieIdPz_Enabled), 5, 0), true);
      edtBarPieImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieImp_Enabled), 5, 0), true);
      edtBarPieAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAut_Enabled), 5, 0), true);
      edtBarMtsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsAut_Enabled), 5, 0), true);
      edtBarKgsAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgsAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsAut_Enabled), 5, 0), true);
      edtBarPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAnc_Enabled), 5, 0), true);
      edtBarPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLoc_Enabled), 5, 0), true);
      edtBarPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPiePie_Enabled), 5, 0), true);
      edtBarPieLzd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLzd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLzd_Enabled), 5, 0), true);
      edtPieOriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieOriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieOriCod_Enabled), 5, 0), true);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), true);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), true);
      edtBarPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Enabled), 5, 0), true);
      edtBarPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Enabled), 5, 0), true);
      edtBarPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Enabled), 5, 0), true);
      edtBarPieOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieOrd_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1HT18( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1HT0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrbarpie", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6473BarUniB", GXutil.ltrim( localUtil.ntoc( Z6473BarUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6472BarTara", GXutil.ltrim( localUtil.ntoc( Z6472BarTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1919BarPieObs", GXutil.rtrim( Z1919BarPieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9984BarPiePda", GXutil.ltrim( localUtil.ntoc( Z9984BarPiePda, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( Z9846BarPieAncc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9800BarNPes", GXutil.ltrim( localUtil.ntoc( Z9800BarNPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9799BarPz2", GXutil.ltrim( localUtil.ntoc( Z9799BarPz2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9798BarPz1", GXutil.ltrim( localUtil.ntoc( Z9798BarPz1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9796BarPieK2", GXutil.ltrim( localUtil.ntoc( Z9796BarPieK2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9795BarPieK1", GXutil.ltrim( localUtil.ntoc( Z9795BarPieK1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8907PzaB80", GXutil.rtrim( Z8907PzaB80));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8838CodBarPz", GXutil.rtrim( Z8838CodBarPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8707BapieObs", GXutil.rtrim( Z8707BapieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6489BarPieIdPz", GXutil.rtrim( Z6489BarPieIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6116BarPieImp", GXutil.rtrim( Z6116BarPieImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3277BarPieAut", GXutil.ltrim( localUtil.ntoc( Z3277BarPieAut, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( Z3276BarMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( Z3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( Z1691BarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2186BarPieLoc", GXutil.rtrim( Z2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1501BarPiePie", GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z908PieOriCod", GXutil.rtrim( Z908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z201BarPieEst", GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z205BarPieMet", GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z203BarPieKil", GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1642BarPieOrd", GXutil.ltrim( localUtil.ntoc( Z1642BarPieOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrbarpie", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrBARPIE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "BARPIE", "") ;
   }

   public void initializeNonKey1HT18( )
   {
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A6473BarUniB = DecimalUtil.ZERO ;
      n6473BarUniB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrimstr( A6473BarUniB, 9, 2));
      A6472BarTara = DecimalUtil.ZERO ;
      n6472BarTara = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrimstr( A6472BarTara, 6, 2));
      A1919BarPieObs = "" ;
      n1919BarPieObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", A1919BarPieObs);
      A9984BarPiePda = DecimalUtil.ZERO ;
      n9984BarPiePda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrimstr( A9984BarPiePda, 6, 2));
      A9846BarPieAncc = (short)(0) ;
      n9846BarPieAncc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9846BarPieAncc), 4, 0));
      A9800BarNPes = (byte)(0) ;
      n9800BarNPes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.str( A9800BarNPes, 1, 0));
      A9799BarPz2 = 0 ;
      n9799BarPz2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9799BarPz2), 6, 0));
      A9798BarPz1 = 0 ;
      n9798BarPz1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9798BarPz1), 6, 0));
      A9796BarPieK2 = DecimalUtil.ZERO ;
      n9796BarPieK2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrimstr( A9796BarPieK2, 9, 2));
      A9795BarPieK1 = DecimalUtil.ZERO ;
      n9795BarPieK1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrimstr( A9795BarPieK1, 9, 2));
      A8907PzaB80 = "" ;
      n8907PzaB80 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", A8907PzaB80);
      A8838CodBarPz = "" ;
      n8838CodBarPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", A8838CodBarPz);
      A8707BapieObs = "" ;
      n8707BapieObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", A8707BapieObs);
      A6489BarPieIdPz = "" ;
      n6489BarPieIdPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", A6489BarPieIdPz);
      A6116BarPieImp = "" ;
      n6116BarPieImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", A6116BarPieImp);
      A3277BarPieAut = (short)(0) ;
      n3277BarPieAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3277BarPieAut), 4, 0));
      A3276BarMtsAut = DecimalUtil.ZERO ;
      n3276BarMtsAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrimstr( A3276BarMtsAut, 9, 2));
      A3275BarKgsAut = DecimalUtil.ZERO ;
      n3275BarKgsAut = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrimstr( A3275BarKgsAut, 9, 2));
      A1691BarPieAnc = (short)(0) ;
      n1691BarPieAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1691BarPieAnc), 4, 0));
      A2186BarPieLoc = "" ;
      n2186BarPieLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      A1501BarPiePie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1501BarPiePie), 6, 0));
      A1271BarPieLzd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1271BarPieLzd), 6, 0));
      A908PieOriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", A908PieOriCod);
      A197BarPConTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A183BarMetLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A170BarKilLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A201BarPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.str( A201BarPieEst, 1, 0));
      A205BarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrimstr( A205BarPieMet, 9, 2));
      A203BarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrimstr( A203BarPieKil, 9, 2));
      A1642BarPieOrd = 0 ;
      n1642BarPieOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1642BarPieOrd), 8, 0));
      Z6473BarUniB = DecimalUtil.ZERO ;
      Z6472BarTara = DecimalUtil.ZERO ;
      Z1919BarPieObs = "" ;
      Z9984BarPiePda = DecimalUtil.ZERO ;
      Z9846BarPieAncc = (short)(0) ;
      Z9800BarNPes = (byte)(0) ;
      Z9799BarPz2 = 0 ;
      Z9798BarPz1 = 0 ;
      Z9796BarPieK2 = DecimalUtil.ZERO ;
      Z9795BarPieK1 = DecimalUtil.ZERO ;
      Z8907PzaB80 = "" ;
      Z8838CodBarPz = "" ;
      Z8707BapieObs = "" ;
      Z6489BarPieIdPz = "" ;
      Z6116BarPieImp = "" ;
      Z3277BarPieAut = (short)(0) ;
      Z3276BarMtsAut = DecimalUtil.ZERO ;
      Z3275BarKgsAut = DecimalUtil.ZERO ;
      Z1691BarPieAnc = (short)(0) ;
      Z2186BarPieLoc = "" ;
      Z1501BarPiePie = 0 ;
      Z1271BarPieLzd = 0 ;
      Z908PieOriCod = "" ;
      Z197BarPConTro = (short)(0) ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z201BarPieEst = (byte)(0) ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      Z1642BarPieOrd = 0 ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1HT18( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      initializeNonKey1HT18( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026761346541", true, true);
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
      httpContext.AddJavascriptSource("ttrbarpie.js", "?2026761346541", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarUniB_Internalname = "BARUNIB" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarTara_Internalname = "BARTARA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarPieObs_Internalname = "BARPIEOBS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarPiePda_Internalname = "BARPIEPDA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarPieAncc_Internalname = "BARPIEANCC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarNPes_Internalname = "BARNPES" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarPz2_Internalname = "BARPZ2" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarPz1_Internalname = "BARPZ1" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarPieK2_Internalname = "BARPIEK2" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarPieK1_Internalname = "BARPIEK1" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPzaB80_Internalname = "PZAB80" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtCodBarPz_Internalname = "CODBARPZ" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBapieObs_Internalname = "BAPIEOBS" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtBarPieIdPz_Internalname = "BARPIEIDPZ" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarPieImp_Internalname = "BARPIEIMP" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtBarPieAut_Internalname = "BARPIEAUT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarMtsAut_Internalname = "BARMTSAUT" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarKgsAut_Internalname = "BARKGSAUT" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarPieAnc_Internalname = "BARPIEANC" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarPieLoc_Internalname = "BARPIELOC" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarPiePie_Internalname = "BARPIEPIE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarPieLzd_Internalname = "BARPIELZD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtPieOriCod_Internalname = "PIEORICOD" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarMetLan_Internalname = "BARMETLAN" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarKilLan_Internalname = "BARKILLAN" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarPieEst_Internalname = "BARPIEEST" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtBarPieOrd_Internalname = "BARPIEORD" ;
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
      Form.setCaption( httpContext.getMessage( "BARPIE", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarPieOrd_Jsonclick = "" ;
      edtBarPieOrd_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieOrd_Enabled = 1 ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarPieKil_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieKil_Enabled = 1 ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieMet_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieMet_Enabled = 1 ;
      edtBarPieEst_Jsonclick = "" ;
      edtBarPieEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieEst_Enabled = 1 ;
      edtBarKilLan_Jsonclick = "" ;
      edtBarKilLan_Backcolor = (int)(0xFFFFFF) ;
      edtBarKilLan_Enabled = 1 ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarMetLan_Backcolor = (int)(0xFFFFFF) ;
      edtBarMetLan_Enabled = 1 ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarPConTro_Backcolor = (int)(0xFFFFFF) ;
      edtBarPConTro_Enabled = 1 ;
      edtPieOriCod_Jsonclick = "" ;
      edtPieOriCod_Backcolor = (int)(0xFFFFFF) ;
      edtPieOriCod_Enabled = 1 ;
      edtBarPieLzd_Jsonclick = "" ;
      edtBarPieLzd_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieLzd_Enabled = 1 ;
      edtBarPiePie_Jsonclick = "" ;
      edtBarPiePie_Backcolor = (int)(0xFFFFFF) ;
      edtBarPiePie_Enabled = 1 ;
      edtBarPieLoc_Jsonclick = "" ;
      edtBarPieLoc_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieLoc_Enabled = 1 ;
      edtBarPieAnc_Jsonclick = "" ;
      edtBarPieAnc_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieAnc_Enabled = 1 ;
      edtBarKgsAut_Jsonclick = "" ;
      edtBarKgsAut_Backcolor = (int)(0xFFFFFF) ;
      edtBarKgsAut_Enabled = 1 ;
      edtBarMtsAut_Jsonclick = "" ;
      edtBarMtsAut_Backcolor = (int)(0xFFFFFF) ;
      edtBarMtsAut_Enabled = 1 ;
      edtBarPieAut_Jsonclick = "" ;
      edtBarPieAut_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieAut_Enabled = 1 ;
      edtBarPieImp_Jsonclick = "" ;
      edtBarPieImp_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieImp_Enabled = 1 ;
      edtBarPieIdPz_Jsonclick = "" ;
      edtBarPieIdPz_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieIdPz_Enabled = 1 ;
      edtBapieObs_Jsonclick = "" ;
      edtBapieObs_Backcolor = (int)(0xFFFFFF) ;
      edtBapieObs_Enabled = 1 ;
      edtCodBarPz_Jsonclick = "" ;
      edtCodBarPz_Backcolor = (int)(0xFFFFFF) ;
      edtCodBarPz_Enabled = 1 ;
      edtPzaB80_Jsonclick = "" ;
      edtPzaB80_Backcolor = (int)(0xFFFFFF) ;
      edtPzaB80_Enabled = 1 ;
      edtBarPieK1_Jsonclick = "" ;
      edtBarPieK1_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieK1_Enabled = 1 ;
      edtBarPieK2_Jsonclick = "" ;
      edtBarPieK2_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieK2_Enabled = 1 ;
      edtBarPz1_Jsonclick = "" ;
      edtBarPz1_Backcolor = (int)(0xFFFFFF) ;
      edtBarPz1_Enabled = 1 ;
      edtBarPz2_Jsonclick = "" ;
      edtBarPz2_Backcolor = (int)(0xFFFFFF) ;
      edtBarPz2_Enabled = 1 ;
      edtBarNPes_Jsonclick = "" ;
      edtBarNPes_Backcolor = (int)(0xFFFFFF) ;
      edtBarNPes_Enabled = 1 ;
      edtBarPieAncc_Jsonclick = "" ;
      edtBarPieAncc_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieAncc_Enabled = 1 ;
      edtBarPiePda_Jsonclick = "" ;
      edtBarPiePda_Backcolor = (int)(0xFFFFFF) ;
      edtBarPiePda_Enabled = 1 ;
      edtBarPieObs_Jsonclick = "" ;
      edtBarPieObs_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieObs_Enabled = 1 ;
      edtBarTara_Jsonclick = "" ;
      edtBarTara_Backcolor = (int)(0xFFFFFF) ;
      edtBarTara_Enabled = 1 ;
      edtBarUniB_Jsonclick = "" ;
      edtBarUniB_Backcolor = (int)(0xFFFFFF) ;
      edtBarUniB_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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
      /* Using cursor T01HT19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(17);
      GX_FocusControl = edtAlbRecCod_Internalname ;
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01HT19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6473BarUniB", GXutil.ltrim( localUtil.ntoc( A6473BarUniB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6472BarTara", GXutil.ltrim( localUtil.ntoc( A6472BarTara, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1919BarPieObs", GXutil.rtrim( A1919BarPieObs));
      httpContext.ajax_rsp_assign_attri("", false, "A9984BarPiePda", GXutil.ltrim( localUtil.ntoc( A9984BarPiePda, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( A9846BarPieAncc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9800BarNPes", GXutil.ltrim( localUtil.ntoc( A9800BarNPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9799BarPz2", GXutil.ltrim( localUtil.ntoc( A9799BarPz2, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9798BarPz1", GXutil.ltrim( localUtil.ntoc( A9798BarPz1, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9796BarPieK2", GXutil.ltrim( localUtil.ntoc( A9796BarPieK2, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9795BarPieK1", GXutil.ltrim( localUtil.ntoc( A9795BarPieK1, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8907PzaB80", GXutil.rtrim( A8907PzaB80));
      httpContext.ajax_rsp_assign_attri("", false, "A8838CodBarPz", GXutil.rtrim( A8838CodBarPz));
      httpContext.ajax_rsp_assign_attri("", false, "A8707BapieObs", GXutil.rtrim( A8707BapieObs));
      httpContext.ajax_rsp_assign_attri("", false, "A6489BarPieIdPz", GXutil.rtrim( A6489BarPieIdPz));
      httpContext.ajax_rsp_assign_attri("", false, "A6116BarPieImp", GXutil.rtrim( A6116BarPieImp));
      httpContext.ajax_rsp_assign_attri("", false, "A3277BarPieAut", GXutil.ltrim( localUtil.ntoc( A3277BarPieAut, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( A3276BarMtsAut, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", GXutil.rtrim( A2186BarPieLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A1501BarPiePie", GXutil.ltrim( localUtil.ntoc( A1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( A1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A908PieOriCod", GXutil.rtrim( A908PieOriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A201BarPieEst", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A205BarPieMet", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A203BarPieKil", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1642BarPieOrd", GXutil.ltrim( localUtil.ntoc( A1642BarPieOrd, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6473BarUniB", GXutil.ltrim( localUtil.ntoc( Z6473BarUniB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6472BarTara", GXutil.ltrim( localUtil.ntoc( Z6472BarTara, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1919BarPieObs", GXutil.rtrim( Z1919BarPieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9984BarPiePda", GXutil.ltrim( localUtil.ntoc( Z9984BarPiePda, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9846BarPieAncc", GXutil.ltrim( localUtil.ntoc( Z9846BarPieAncc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9800BarNPes", GXutil.ltrim( localUtil.ntoc( Z9800BarNPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9799BarPz2", GXutil.ltrim( localUtil.ntoc( Z9799BarPz2, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9798BarPz1", GXutil.ltrim( localUtil.ntoc( Z9798BarPz1, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9796BarPieK2", GXutil.ltrim( localUtil.ntoc( Z9796BarPieK2, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9795BarPieK1", GXutil.ltrim( localUtil.ntoc( Z9795BarPieK1, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8907PzaB80", GXutil.rtrim( Z8907PzaB80));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8838CodBarPz", GXutil.rtrim( Z8838CodBarPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8707BapieObs", GXutil.rtrim( Z8707BapieObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6489BarPieIdPz", GXutil.rtrim( Z6489BarPieIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6116BarPieImp", GXutil.rtrim( Z6116BarPieImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3277BarPieAut", GXutil.ltrim( localUtil.ntoc( Z3277BarPieAut, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3276BarMtsAut", GXutil.ltrim( localUtil.ntoc( Z3276BarMtsAut, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3275BarKgsAut", GXutil.ltrim( localUtil.ntoc( Z3275BarKgsAut, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1691BarPieAnc", GXutil.ltrim( localUtil.ntoc( Z1691BarPieAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2186BarPieLoc", GXutil.rtrim( Z2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1501BarPiePie", GXutil.ltrim( localUtil.ntoc( Z1501BarPiePie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1271BarPieLzd", GXutil.ltrim( localUtil.ntoc( Z1271BarPieLzd, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z908PieOriCod", GXutil.rtrim( Z908PieOriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z201BarPieEst", GXutil.ltrim( localUtil.ntoc( Z201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z205BarPieMet", GXutil.ltrim( localUtil.ntoc( Z205BarPieMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z203BarPieKil", GXutil.ltrim( localUtil.ntoc( Z203BarPieKil, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1642BarPieOrd", GXutil.ltrim( localUtil.ntoc( Z1642BarPieOrd, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albreccod( )
   {
      /* Using cursor T01HT20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(18);
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A6473BarUniB',fld:'BARUNIB',pic:'ZZZZZ9.99'},{av:'A6472BarTara',fld:'BARTARA',pic:'ZZ9.99'},{av:'A1919BarPieObs',fld:'BARPIEOBS',pic:''},{av:'A9984BarPiePda',fld:'BARPIEPDA',pic:'ZZ9.99'},{av:'A9846BarPieAncc',fld:'BARPIEANCC',pic:'ZZZ9'},{av:'A9800BarNPes',fld:'BARNPES',pic:'9'},{av:'A9799BarPz2',fld:'BARPZ2',pic:'ZZZZZ9'},{av:'A9798BarPz1',fld:'BARPZ1',pic:'ZZZZZ9'},{av:'A9796BarPieK2',fld:'BARPIEK2',pic:'ZZZZZ9.99'},{av:'A9795BarPieK1',fld:'BARPIEK1',pic:'ZZZZZ9.99'},{av:'A8907PzaB80',fld:'PZAB80',pic:''},{av:'A8838CodBarPz',fld:'CODBARPZ',pic:''},{av:'A8707BapieObs',fld:'BAPIEOBS',pic:''},{av:'A6489BarPieIdPz',fld:'BARPIEIDPZ',pic:''},{av:'A6116BarPieImp',fld:'BARPIEIMP',pic:''},{av:'A3277BarPieAut',fld:'BARPIEAUT',pic:'ZZZ9'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A1691BarPieAnc',fld:'BARPIEANC',pic:'ZZZ9'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'A1501BarPiePie',fld:'BARPIEPIE',pic:'ZZZZZ9'},{av:'A1271BarPieLzd',fld:'BARPIELZD',pic:'ZZZ9'},{av:'A908PieOriCod',fld:'PIEORICOD',pic:''},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A1642BarPieOrd',fld:'BARPIEORD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z44AlbRecCod'},{av:'Z6473BarUniB'},{av:'Z6472BarTara'},{av:'Z1919BarPieObs'},{av:'Z9984BarPiePda'},{av:'Z9846BarPieAncc'},{av:'Z9800BarNPes'},{av:'Z9799BarPz2'},{av:'Z9798BarPz1'},{av:'Z9796BarPieK2'},{av:'Z9795BarPieK1'},{av:'Z8907PzaB80'},{av:'Z8838CodBarPz'},{av:'Z8707BapieObs'},{av:'Z6489BarPieIdPz'},{av:'Z6116BarPieImp'},{av:'Z3277BarPieAut'},{av:'Z3276BarMtsAut'},{av:'Z3275BarKgsAut'},{av:'Z1691BarPieAnc'},{av:'Z2186BarPieLoc'},{av:'Z1501BarPiePie'},{av:'Z1271BarPieLzd'},{av:'Z908PieOriCod'},{av:'Z197BarPConTro'},{av:'Z183BarMetLan'},{av:'Z170BarKilLan'},{av:'Z201BarPieEst'},{av:'Z205BarPieMet'},{av:'Z203BarPieKil'},{av:'Z1642BarPieOrd'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z6473BarUniB = DecimalUtil.ZERO ;
      Z6472BarTara = DecimalUtil.ZERO ;
      Z1919BarPieObs = "" ;
      Z9984BarPiePda = DecimalUtil.ZERO ;
      Z9796BarPieK2 = DecimalUtil.ZERO ;
      Z9795BarPieK1 = DecimalUtil.ZERO ;
      Z8907PzaB80 = "" ;
      Z8838CodBarPz = "" ;
      Z8707BapieObs = "" ;
      Z6489BarPieIdPz = "" ;
      Z6116BarPieImp = "" ;
      Z3276BarMtsAut = DecimalUtil.ZERO ;
      Z3275BarKgsAut = DecimalUtil.ZERO ;
      Z2186BarPieLoc = "" ;
      Z908PieOriCod = "" ;
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z205BarPieMet = DecimalUtil.ZERO ;
      Z203BarPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      A200BarPieCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A6473BarUniB = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A6472BarTara = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A1919BarPieObs = "" ;
      lblTextblock10_Jsonclick = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A8907PzaB80 = "" ;
      lblTextblock18_Jsonclick = "" ;
      A8838CodBarPz = "" ;
      lblTextblock19_Jsonclick = "" ;
      A8707BapieObs = "" ;
      lblTextblock20_Jsonclick = "" ;
      A6489BarPieIdPz = "" ;
      lblTextblock21_Jsonclick = "" ;
      A6116BarPieImp = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A2186BarPieLoc = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A908PieOriCod = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      lblTextblock35_Jsonclick = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      lblTextblock36_Jsonclick = "" ;
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
      T01HT6_A200BarPieCod = new String[] {""} ;
      T01HT6_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n6473BarUniB = new boolean[] {false} ;
      T01HT6_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n6472BarTara = new boolean[] {false} ;
      T01HT6_A1919BarPieObs = new String[] {""} ;
      T01HT6_n1919BarPieObs = new boolean[] {false} ;
      T01HT6_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n9984BarPiePda = new boolean[] {false} ;
      T01HT6_A9846BarPieAncc = new short[1] ;
      T01HT6_n9846BarPieAncc = new boolean[] {false} ;
      T01HT6_A9800BarNPes = new byte[1] ;
      T01HT6_n9800BarNPes = new boolean[] {false} ;
      T01HT6_A9799BarPz2 = new int[1] ;
      T01HT6_n9799BarPz2 = new boolean[] {false} ;
      T01HT6_A9798BarPz1 = new int[1] ;
      T01HT6_n9798BarPz1 = new boolean[] {false} ;
      T01HT6_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n9796BarPieK2 = new boolean[] {false} ;
      T01HT6_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n9795BarPieK1 = new boolean[] {false} ;
      T01HT6_A8907PzaB80 = new String[] {""} ;
      T01HT6_n8907PzaB80 = new boolean[] {false} ;
      T01HT6_A8838CodBarPz = new String[] {""} ;
      T01HT6_n8838CodBarPz = new boolean[] {false} ;
      T01HT6_A8707BapieObs = new String[] {""} ;
      T01HT6_n8707BapieObs = new boolean[] {false} ;
      T01HT6_A6489BarPieIdPz = new String[] {""} ;
      T01HT6_n6489BarPieIdPz = new boolean[] {false} ;
      T01HT6_A6116BarPieImp = new String[] {""} ;
      T01HT6_n6116BarPieImp = new boolean[] {false} ;
      T01HT6_A3277BarPieAut = new short[1] ;
      T01HT6_n3277BarPieAut = new boolean[] {false} ;
      T01HT6_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n3276BarMtsAut = new boolean[] {false} ;
      T01HT6_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_n3275BarKgsAut = new boolean[] {false} ;
      T01HT6_A1691BarPieAnc = new short[1] ;
      T01HT6_n1691BarPieAnc = new boolean[] {false} ;
      T01HT6_A2186BarPieLoc = new String[] {""} ;
      T01HT6_n2186BarPieLoc = new boolean[] {false} ;
      T01HT6_A1501BarPiePie = new int[1] ;
      T01HT6_A1271BarPieLzd = new int[1] ;
      T01HT6_A908PieOriCod = new String[] {""} ;
      T01HT6_A197BarPConTro = new short[1] ;
      T01HT6_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_A201BarPieEst = new byte[1] ;
      T01HT6_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT6_A1642BarPieOrd = new int[1] ;
      T01HT6_n1642BarPieOrd = new boolean[] {false} ;
      T01HT6_A396EmprCod = new String[] {""} ;
      T01HT6_A44AlbRecCod = new int[1] ;
      T01HT6_A129BarCod = new int[1] ;
      T01HT6_A132BarCodReo = new byte[1] ;
      T01HT6_A130BarCodPar = new String[] {""} ;
      T01HT4_A396EmprCod = new String[] {""} ;
      T01HT5_A396EmprCod = new String[] {""} ;
      T01HT7_A396EmprCod = new String[] {""} ;
      T01HT8_A396EmprCod = new String[] {""} ;
      T01HT9_A396EmprCod = new String[] {""} ;
      T01HT9_A129BarCod = new int[1] ;
      T01HT9_A132BarCodReo = new byte[1] ;
      T01HT9_A130BarCodPar = new String[] {""} ;
      T01HT9_A200BarPieCod = new String[] {""} ;
      T01HT3_A200BarPieCod = new String[] {""} ;
      T01HT3_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n6473BarUniB = new boolean[] {false} ;
      T01HT3_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n6472BarTara = new boolean[] {false} ;
      T01HT3_A1919BarPieObs = new String[] {""} ;
      T01HT3_n1919BarPieObs = new boolean[] {false} ;
      T01HT3_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n9984BarPiePda = new boolean[] {false} ;
      T01HT3_A9846BarPieAncc = new short[1] ;
      T01HT3_n9846BarPieAncc = new boolean[] {false} ;
      T01HT3_A9800BarNPes = new byte[1] ;
      T01HT3_n9800BarNPes = new boolean[] {false} ;
      T01HT3_A9799BarPz2 = new int[1] ;
      T01HT3_n9799BarPz2 = new boolean[] {false} ;
      T01HT3_A9798BarPz1 = new int[1] ;
      T01HT3_n9798BarPz1 = new boolean[] {false} ;
      T01HT3_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n9796BarPieK2 = new boolean[] {false} ;
      T01HT3_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n9795BarPieK1 = new boolean[] {false} ;
      T01HT3_A8907PzaB80 = new String[] {""} ;
      T01HT3_n8907PzaB80 = new boolean[] {false} ;
      T01HT3_A8838CodBarPz = new String[] {""} ;
      T01HT3_n8838CodBarPz = new boolean[] {false} ;
      T01HT3_A8707BapieObs = new String[] {""} ;
      T01HT3_n8707BapieObs = new boolean[] {false} ;
      T01HT3_A6489BarPieIdPz = new String[] {""} ;
      T01HT3_n6489BarPieIdPz = new boolean[] {false} ;
      T01HT3_A6116BarPieImp = new String[] {""} ;
      T01HT3_n6116BarPieImp = new boolean[] {false} ;
      T01HT3_A3277BarPieAut = new short[1] ;
      T01HT3_n3277BarPieAut = new boolean[] {false} ;
      T01HT3_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n3276BarMtsAut = new boolean[] {false} ;
      T01HT3_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_n3275BarKgsAut = new boolean[] {false} ;
      T01HT3_A1691BarPieAnc = new short[1] ;
      T01HT3_n1691BarPieAnc = new boolean[] {false} ;
      T01HT3_A2186BarPieLoc = new String[] {""} ;
      T01HT3_n2186BarPieLoc = new boolean[] {false} ;
      T01HT3_A1501BarPiePie = new int[1] ;
      T01HT3_A1271BarPieLzd = new int[1] ;
      T01HT3_A908PieOriCod = new String[] {""} ;
      T01HT3_A197BarPConTro = new short[1] ;
      T01HT3_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_A201BarPieEst = new byte[1] ;
      T01HT3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT3_A1642BarPieOrd = new int[1] ;
      T01HT3_n1642BarPieOrd = new boolean[] {false} ;
      T01HT3_A396EmprCod = new String[] {""} ;
      T01HT3_A44AlbRecCod = new int[1] ;
      T01HT3_A129BarCod = new int[1] ;
      T01HT3_A132BarCodReo = new byte[1] ;
      T01HT3_A130BarCodPar = new String[] {""} ;
      sMode18 = "" ;
      T01HT10_A396EmprCod = new String[] {""} ;
      T01HT10_A129BarCod = new int[1] ;
      T01HT10_A132BarCodReo = new byte[1] ;
      T01HT10_A130BarCodPar = new String[] {""} ;
      T01HT10_A200BarPieCod = new String[] {""} ;
      T01HT11_A396EmprCod = new String[] {""} ;
      T01HT11_A129BarCod = new int[1] ;
      T01HT11_A132BarCodReo = new byte[1] ;
      T01HT11_A130BarCodPar = new String[] {""} ;
      T01HT11_A200BarPieCod = new String[] {""} ;
      T01HT2_A200BarPieCod = new String[] {""} ;
      T01HT2_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n6473BarUniB = new boolean[] {false} ;
      T01HT2_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n6472BarTara = new boolean[] {false} ;
      T01HT2_A1919BarPieObs = new String[] {""} ;
      T01HT2_n1919BarPieObs = new boolean[] {false} ;
      T01HT2_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n9984BarPiePda = new boolean[] {false} ;
      T01HT2_A9846BarPieAncc = new short[1] ;
      T01HT2_n9846BarPieAncc = new boolean[] {false} ;
      T01HT2_A9800BarNPes = new byte[1] ;
      T01HT2_n9800BarNPes = new boolean[] {false} ;
      T01HT2_A9799BarPz2 = new int[1] ;
      T01HT2_n9799BarPz2 = new boolean[] {false} ;
      T01HT2_A9798BarPz1 = new int[1] ;
      T01HT2_n9798BarPz1 = new boolean[] {false} ;
      T01HT2_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n9796BarPieK2 = new boolean[] {false} ;
      T01HT2_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n9795BarPieK1 = new boolean[] {false} ;
      T01HT2_A8907PzaB80 = new String[] {""} ;
      T01HT2_n8907PzaB80 = new boolean[] {false} ;
      T01HT2_A8838CodBarPz = new String[] {""} ;
      T01HT2_n8838CodBarPz = new boolean[] {false} ;
      T01HT2_A8707BapieObs = new String[] {""} ;
      T01HT2_n8707BapieObs = new boolean[] {false} ;
      T01HT2_A6489BarPieIdPz = new String[] {""} ;
      T01HT2_n6489BarPieIdPz = new boolean[] {false} ;
      T01HT2_A6116BarPieImp = new String[] {""} ;
      T01HT2_n6116BarPieImp = new boolean[] {false} ;
      T01HT2_A3277BarPieAut = new short[1] ;
      T01HT2_n3277BarPieAut = new boolean[] {false} ;
      T01HT2_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n3276BarMtsAut = new boolean[] {false} ;
      T01HT2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_n3275BarKgsAut = new boolean[] {false} ;
      T01HT2_A1691BarPieAnc = new short[1] ;
      T01HT2_n1691BarPieAnc = new boolean[] {false} ;
      T01HT2_A2186BarPieLoc = new String[] {""} ;
      T01HT2_n2186BarPieLoc = new boolean[] {false} ;
      T01HT2_A1501BarPiePie = new int[1] ;
      T01HT2_A1271BarPieLzd = new int[1] ;
      T01HT2_A908PieOriCod = new String[] {""} ;
      T01HT2_A197BarPConTro = new short[1] ;
      T01HT2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_A201BarPieEst = new byte[1] ;
      T01HT2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HT2_A1642BarPieOrd = new int[1] ;
      T01HT2_n1642BarPieOrd = new boolean[] {false} ;
      T01HT2_A396EmprCod = new String[] {""} ;
      T01HT2_A44AlbRecCod = new int[1] ;
      T01HT2_A129BarCod = new int[1] ;
      T01HT2_A132BarCodReo = new byte[1] ;
      T01HT2_A130BarCodPar = new String[] {""} ;
      T01HT15_A396EmprCod = new String[] {""} ;
      T01HT15_A129BarCod = new int[1] ;
      T01HT15_A132BarCodReo = new byte[1] ;
      T01HT15_A130BarCodPar = new String[] {""} ;
      T01HT15_A200BarPieCod = new String[] {""} ;
      T01HT15_A12913BarPieLDf = new short[1] ;
      T01HT16_A396EmprCod = new String[] {""} ;
      T01HT16_A129BarCod = new int[1] ;
      T01HT16_A132BarCodReo = new byte[1] ;
      T01HT16_A130BarCodPar = new String[] {""} ;
      T01HT16_A200BarPieCod = new String[] {""} ;
      T01HT16_A3858BarTroCod = new short[1] ;
      T01HT17_A396EmprCod = new String[] {""} ;
      T01HT17_A30AlbProCod = new long[1] ;
      T01HT17_A129BarCod = new int[1] ;
      T01HT17_A132BarCodReo = new byte[1] ;
      T01HT17_A130BarCodPar = new String[] {""} ;
      T01HT17_A200BarPieCod = new String[] {""} ;
      T01HT18_A396EmprCod = new String[] {""} ;
      T01HT18_A129BarCod = new int[1] ;
      T01HT18_A132BarCodReo = new byte[1] ;
      T01HT18_A130BarCodPar = new String[] {""} ;
      T01HT18_A200BarPieCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01HT19_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ6473BarUniB = DecimalUtil.ZERO ;
      ZZ6472BarTara = DecimalUtil.ZERO ;
      ZZ1919BarPieObs = "" ;
      ZZ9984BarPiePda = DecimalUtil.ZERO ;
      ZZ9796BarPieK2 = DecimalUtil.ZERO ;
      ZZ9795BarPieK1 = DecimalUtil.ZERO ;
      ZZ8907PzaB80 = "" ;
      ZZ8838CodBarPz = "" ;
      ZZ8707BapieObs = "" ;
      ZZ6489BarPieIdPz = "" ;
      ZZ6116BarPieImp = "" ;
      ZZ3276BarMtsAut = DecimalUtil.ZERO ;
      ZZ3275BarKgsAut = DecimalUtil.ZERO ;
      ZZ2186BarPieLoc = "" ;
      ZZ908PieOriCod = "" ;
      ZZ183BarMetLan = DecimalUtil.ZERO ;
      ZZ170BarKilLan = DecimalUtil.ZERO ;
      ZZ205BarPieMet = DecimalUtil.ZERO ;
      ZZ203BarPieKil = DecimalUtil.ZERO ;
      T01HT20_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrbarpie__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrbarpie__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrbarpie__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrbarpie__default(),
         new Object[] {
             new Object[] {
            T01HT2_A200BarPieCod, T01HT2_A6473BarUniB, T01HT2_n6473BarUniB, T01HT2_A6472BarTara, T01HT2_n6472BarTara, T01HT2_A1919BarPieObs, T01HT2_n1919BarPieObs, T01HT2_A9984BarPiePda, T01HT2_n9984BarPiePda, T01HT2_A9846BarPieAncc,
            T01HT2_n9846BarPieAncc, T01HT2_A9800BarNPes, T01HT2_n9800BarNPes, T01HT2_A9799BarPz2, T01HT2_n9799BarPz2, T01HT2_A9798BarPz1, T01HT2_n9798BarPz1, T01HT2_A9796BarPieK2, T01HT2_n9796BarPieK2, T01HT2_A9795BarPieK1,
            T01HT2_n9795BarPieK1, T01HT2_A8907PzaB80, T01HT2_n8907PzaB80, T01HT2_A8838CodBarPz, T01HT2_n8838CodBarPz, T01HT2_A8707BapieObs, T01HT2_n8707BapieObs, T01HT2_A6489BarPieIdPz, T01HT2_n6489BarPieIdPz, T01HT2_A6116BarPieImp,
            T01HT2_n6116BarPieImp, T01HT2_A3277BarPieAut, T01HT2_n3277BarPieAut, T01HT2_A3276BarMtsAut, T01HT2_n3276BarMtsAut, T01HT2_A3275BarKgsAut, T01HT2_n3275BarKgsAut, T01HT2_A1691BarPieAnc, T01HT2_n1691BarPieAnc, T01HT2_A2186BarPieLoc,
            T01HT2_n2186BarPieLoc, T01HT2_A1501BarPiePie, T01HT2_A1271BarPieLzd, T01HT2_A908PieOriCod, T01HT2_A197BarPConTro, T01HT2_A183BarMetLan, T01HT2_A170BarKilLan, T01HT2_A201BarPieEst, T01HT2_A205BarPieMet, T01HT2_A203BarPieKil,
            T01HT2_A1642BarPieOrd, T01HT2_n1642BarPieOrd, T01HT2_A396EmprCod, T01HT2_A44AlbRecCod, T01HT2_A129BarCod, T01HT2_A132BarCodReo, T01HT2_A130BarCodPar
            }
            , new Object[] {
            T01HT3_A200BarPieCod, T01HT3_A6473BarUniB, T01HT3_n6473BarUniB, T01HT3_A6472BarTara, T01HT3_n6472BarTara, T01HT3_A1919BarPieObs, T01HT3_n1919BarPieObs, T01HT3_A9984BarPiePda, T01HT3_n9984BarPiePda, T01HT3_A9846BarPieAncc,
            T01HT3_n9846BarPieAncc, T01HT3_A9800BarNPes, T01HT3_n9800BarNPes, T01HT3_A9799BarPz2, T01HT3_n9799BarPz2, T01HT3_A9798BarPz1, T01HT3_n9798BarPz1, T01HT3_A9796BarPieK2, T01HT3_n9796BarPieK2, T01HT3_A9795BarPieK1,
            T01HT3_n9795BarPieK1, T01HT3_A8907PzaB80, T01HT3_n8907PzaB80, T01HT3_A8838CodBarPz, T01HT3_n8838CodBarPz, T01HT3_A8707BapieObs, T01HT3_n8707BapieObs, T01HT3_A6489BarPieIdPz, T01HT3_n6489BarPieIdPz, T01HT3_A6116BarPieImp,
            T01HT3_n6116BarPieImp, T01HT3_A3277BarPieAut, T01HT3_n3277BarPieAut, T01HT3_A3276BarMtsAut, T01HT3_n3276BarMtsAut, T01HT3_A3275BarKgsAut, T01HT3_n3275BarKgsAut, T01HT3_A1691BarPieAnc, T01HT3_n1691BarPieAnc, T01HT3_A2186BarPieLoc,
            T01HT3_n2186BarPieLoc, T01HT3_A1501BarPiePie, T01HT3_A1271BarPieLzd, T01HT3_A908PieOriCod, T01HT3_A197BarPConTro, T01HT3_A183BarMetLan, T01HT3_A170BarKilLan, T01HT3_A201BarPieEst, T01HT3_A205BarPieMet, T01HT3_A203BarPieKil,
            T01HT3_A1642BarPieOrd, T01HT3_n1642BarPieOrd, T01HT3_A396EmprCod, T01HT3_A44AlbRecCod, T01HT3_A129BarCod, T01HT3_A132BarCodReo, T01HT3_A130BarCodPar
            }
            , new Object[] {
            T01HT4_A396EmprCod
            }
            , new Object[] {
            T01HT5_A396EmprCod
            }
            , new Object[] {
            T01HT6_A200BarPieCod, T01HT6_A6473BarUniB, T01HT6_n6473BarUniB, T01HT6_A6472BarTara, T01HT6_n6472BarTara, T01HT6_A1919BarPieObs, T01HT6_n1919BarPieObs, T01HT6_A9984BarPiePda, T01HT6_n9984BarPiePda, T01HT6_A9846BarPieAncc,
            T01HT6_n9846BarPieAncc, T01HT6_A9800BarNPes, T01HT6_n9800BarNPes, T01HT6_A9799BarPz2, T01HT6_n9799BarPz2, T01HT6_A9798BarPz1, T01HT6_n9798BarPz1, T01HT6_A9796BarPieK2, T01HT6_n9796BarPieK2, T01HT6_A9795BarPieK1,
            T01HT6_n9795BarPieK1, T01HT6_A8907PzaB80, T01HT6_n8907PzaB80, T01HT6_A8838CodBarPz, T01HT6_n8838CodBarPz, T01HT6_A8707BapieObs, T01HT6_n8707BapieObs, T01HT6_A6489BarPieIdPz, T01HT6_n6489BarPieIdPz, T01HT6_A6116BarPieImp,
            T01HT6_n6116BarPieImp, T01HT6_A3277BarPieAut, T01HT6_n3277BarPieAut, T01HT6_A3276BarMtsAut, T01HT6_n3276BarMtsAut, T01HT6_A3275BarKgsAut, T01HT6_n3275BarKgsAut, T01HT6_A1691BarPieAnc, T01HT6_n1691BarPieAnc, T01HT6_A2186BarPieLoc,
            T01HT6_n2186BarPieLoc, T01HT6_A1501BarPiePie, T01HT6_A1271BarPieLzd, T01HT6_A908PieOriCod, T01HT6_A197BarPConTro, T01HT6_A183BarMetLan, T01HT6_A170BarKilLan, T01HT6_A201BarPieEst, T01HT6_A205BarPieMet, T01HT6_A203BarPieKil,
            T01HT6_A1642BarPieOrd, T01HT6_n1642BarPieOrd, T01HT6_A396EmprCod, T01HT6_A44AlbRecCod, T01HT6_A129BarCod, T01HT6_A132BarCodReo, T01HT6_A130BarCodPar
            }
            , new Object[] {
            T01HT7_A396EmprCod
            }
            , new Object[] {
            T01HT8_A396EmprCod
            }
            , new Object[] {
            T01HT9_A396EmprCod, T01HT9_A129BarCod, T01HT9_A132BarCodReo, T01HT9_A130BarCodPar, T01HT9_A200BarPieCod
            }
            , new Object[] {
            T01HT10_A396EmprCod, T01HT10_A129BarCod, T01HT10_A132BarCodReo, T01HT10_A130BarCodPar, T01HT10_A200BarPieCod
            }
            , new Object[] {
            T01HT11_A396EmprCod, T01HT11_A129BarCod, T01HT11_A132BarCodReo, T01HT11_A130BarCodPar, T01HT11_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HT15_A396EmprCod, T01HT15_A129BarCod, T01HT15_A132BarCodReo, T01HT15_A130BarCodPar, T01HT15_A200BarPieCod, T01HT15_A12913BarPieLDf
            }
            , new Object[] {
            T01HT16_A396EmprCod, T01HT16_A129BarCod, T01HT16_A132BarCodReo, T01HT16_A130BarCodPar, T01HT16_A200BarPieCod, T01HT16_A3858BarTroCod
            }
            , new Object[] {
            T01HT17_A396EmprCod, T01HT17_A30AlbProCod, T01HT17_A129BarCod, T01HT17_A132BarCodReo, T01HT17_A130BarCodPar, T01HT17_A200BarPieCod
            }
            , new Object[] {
            T01HT18_A396EmprCod, T01HT18_A129BarCod, T01HT18_A132BarCodReo, T01HT18_A130BarCodPar, T01HT18_A200BarPieCod
            }
            , new Object[] {
            T01HT19_A396EmprCod
            }
            , new Object[] {
            T01HT20_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z9800BarNPes ;
   private byte Z201BarPieEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ9800BarNPes ;
   private byte ZZ201BarPieEst ;
   private short Z9846BarPieAncc ;
   private short Z3277BarPieAut ;
   private short Z1691BarPieAnc ;
   private short Z197BarPConTro ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short RcdFound18 ;
   private short nIsDirty_18 ;
   private short ZZ9846BarPieAncc ;
   private short ZZ3277BarPieAut ;
   private short ZZ1691BarPieAnc ;
   private short ZZ197BarPConTro ;
   private int Z129BarCod ;
   private int Z9799BarPz2 ;
   private int Z9798BarPz1 ;
   private int Z1501BarPiePie ;
   private int Z1271BarPieLzd ;
   private int Z1642BarPieOrd ;
   private int Z44AlbRecCod ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtBarUniB_Enabled ;
   private int edtBarTara_Enabled ;
   private int edtBarPieObs_Enabled ;
   private int edtBarPiePda_Enabled ;
   private int edtBarPieAncc_Enabled ;
   private int edtBarNPes_Enabled ;
   private int A9799BarPz2 ;
   private int edtBarPz2_Enabled ;
   private int A9798BarPz1 ;
   private int edtBarPz1_Enabled ;
   private int edtBarPieK2_Enabled ;
   private int edtBarPieK1_Enabled ;
   private int edtPzaB80_Enabled ;
   private int edtCodBarPz_Enabled ;
   private int edtBapieObs_Enabled ;
   private int edtBarPieIdPz_Enabled ;
   private int edtBarPieImp_Enabled ;
   private int edtBarPieAut_Enabled ;
   private int edtBarMtsAut_Enabled ;
   private int edtBarKgsAut_Enabled ;
   private int edtBarPieAnc_Enabled ;
   private int edtBarPieLoc_Enabled ;
   private int A1501BarPiePie ;
   private int edtBarPiePie_Enabled ;
   private int A1271BarPieLzd ;
   private int edtBarPieLzd_Enabled ;
   private int edtPieOriCod_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtBarMetLan_Enabled ;
   private int edtBarKilLan_Enabled ;
   private int edtBarPieEst_Enabled ;
   private int edtBarPieMet_Enabled ;
   private int edtBarPieKil_Enabled ;
   private int A1642BarPieOrd ;
   private int edtBarPieOrd_Enabled ;
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
   private int edtBarPieOrd_Backcolor ;
   private int edtBarPieKil_Backcolor ;
   private int edtBarPieMet_Backcolor ;
   private int edtBarPieEst_Backcolor ;
   private int edtBarKilLan_Backcolor ;
   private int edtBarMetLan_Backcolor ;
   private int edtBarPConTro_Backcolor ;
   private int edtPieOriCod_Backcolor ;
   private int edtBarPieLzd_Backcolor ;
   private int edtBarPiePie_Backcolor ;
   private int edtBarPieLoc_Backcolor ;
   private int edtBarPieAnc_Backcolor ;
   private int edtBarKgsAut_Backcolor ;
   private int edtBarMtsAut_Backcolor ;
   private int edtBarPieAut_Backcolor ;
   private int edtBarPieImp_Backcolor ;
   private int edtBarPieIdPz_Backcolor ;
   private int edtBapieObs_Backcolor ;
   private int edtCodBarPz_Backcolor ;
   private int edtPzaB80_Backcolor ;
   private int edtBarPieK1_Backcolor ;
   private int edtBarPieK2_Backcolor ;
   private int edtBarPz1_Backcolor ;
   private int edtBarPz2_Backcolor ;
   private int edtBarNPes_Backcolor ;
   private int edtBarPieAncc_Backcolor ;
   private int edtBarPiePda_Backcolor ;
   private int edtBarPieObs_Backcolor ;
   private int edtBarTara_Backcolor ;
   private int edtBarUniB_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ44AlbRecCod ;
   private int ZZ9799BarPz2 ;
   private int ZZ9798BarPz1 ;
   private int ZZ1501BarPiePie ;
   private int ZZ1271BarPieLzd ;
   private int ZZ1642BarPieOrd ;
   private java.math.BigDecimal Z6473BarUniB ;
   private java.math.BigDecimal Z6472BarTara ;
   private java.math.BigDecimal Z9984BarPiePda ;
   private java.math.BigDecimal Z9796BarPieK2 ;
   private java.math.BigDecimal Z9795BarPieK1 ;
   private java.math.BigDecimal Z3276BarMtsAut ;
   private java.math.BigDecimal Z3275BarKgsAut ;
   private java.math.BigDecimal Z183BarMetLan ;
   private java.math.BigDecimal Z170BarKilLan ;
   private java.math.BigDecimal Z205BarPieMet ;
   private java.math.BigDecimal Z203BarPieKil ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal ZZ6473BarUniB ;
   private java.math.BigDecimal ZZ6472BarTara ;
   private java.math.BigDecimal ZZ9984BarPiePda ;
   private java.math.BigDecimal ZZ9796BarPieK2 ;
   private java.math.BigDecimal ZZ9795BarPieK1 ;
   private java.math.BigDecimal ZZ3276BarMtsAut ;
   private java.math.BigDecimal ZZ3275BarKgsAut ;
   private java.math.BigDecimal ZZ183BarMetLan ;
   private java.math.BigDecimal ZZ170BarKilLan ;
   private java.math.BigDecimal ZZ205BarPieMet ;
   private java.math.BigDecimal ZZ203BarPieKil ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z1919BarPieObs ;
   private String Z8907PzaB80 ;
   private String Z8838CodBarPz ;
   private String Z8707BapieObs ;
   private String Z6489BarPieIdPz ;
   private String Z6116BarPieImp ;
   private String Z2186BarPieLoc ;
   private String Z908PieOriCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarPieCod_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarUniB_Internalname ;
   private String edtBarUniB_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarTara_Internalname ;
   private String edtBarTara_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarPieObs_Internalname ;
   private String A1919BarPieObs ;
   private String edtBarPieObs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarPiePda_Internalname ;
   private String edtBarPiePda_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarPieAncc_Internalname ;
   private String edtBarPieAncc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarNPes_Internalname ;
   private String edtBarNPes_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarPz2_Internalname ;
   private String edtBarPz2_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarPz1_Internalname ;
   private String edtBarPz1_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarPieK2_Internalname ;
   private String edtBarPieK2_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarPieK1_Internalname ;
   private String edtBarPieK1_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPzaB80_Internalname ;
   private String A8907PzaB80 ;
   private String edtPzaB80_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtCodBarPz_Internalname ;
   private String A8838CodBarPz ;
   private String edtCodBarPz_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBapieObs_Internalname ;
   private String A8707BapieObs ;
   private String edtBapieObs_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtBarPieIdPz_Internalname ;
   private String A6489BarPieIdPz ;
   private String edtBarPieIdPz_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarPieImp_Internalname ;
   private String A6116BarPieImp ;
   private String edtBarPieImp_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtBarPieAut_Internalname ;
   private String edtBarPieAut_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarMtsAut_Internalname ;
   private String edtBarMtsAut_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarKgsAut_Internalname ;
   private String edtBarKgsAut_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarPieAnc_Internalname ;
   private String edtBarPieAnc_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarPieLoc_Internalname ;
   private String A2186BarPieLoc ;
   private String edtBarPieLoc_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarPiePie_Internalname ;
   private String edtBarPiePie_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarPieLzd_Internalname ;
   private String edtBarPieLzd_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtPieOriCod_Internalname ;
   private String A908PieOriCod ;
   private String edtPieOriCod_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarPConTro_Internalname ;
   private String edtBarPConTro_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarMetLan_Internalname ;
   private String edtBarMetLan_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarKilLan_Internalname ;
   private String edtBarKilLan_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarPieEst_Internalname ;
   private String edtBarPieEst_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPieMet_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieKil_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtBarPieOrd_Internalname ;
   private String edtBarPieOrd_Jsonclick ;
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
   private String sMode18 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ1919BarPieObs ;
   private String ZZ8907PzaB80 ;
   private String ZZ8838CodBarPz ;
   private String ZZ8707BapieObs ;
   private String ZZ6489BarPieIdPz ;
   private String ZZ6116BarPieImp ;
   private String ZZ2186BarPieLoc ;
   private String ZZ908PieOriCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6473BarUniB ;
   private boolean n6472BarTara ;
   private boolean n1919BarPieObs ;
   private boolean n9984BarPiePda ;
   private boolean n9846BarPieAncc ;
   private boolean n9800BarNPes ;
   private boolean n9799BarPz2 ;
   private boolean n9798BarPz1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9795BarPieK1 ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n8707BapieObs ;
   private boolean n6489BarPieIdPz ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n1691BarPieAnc ;
   private boolean n2186BarPieLoc ;
   private boolean n1642BarPieOrd ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01HT6_A200BarPieCod ;
   private java.math.BigDecimal[] T01HT6_A6473BarUniB ;
   private boolean[] T01HT6_n6473BarUniB ;
   private java.math.BigDecimal[] T01HT6_A6472BarTara ;
   private boolean[] T01HT6_n6472BarTara ;
   private String[] T01HT6_A1919BarPieObs ;
   private boolean[] T01HT6_n1919BarPieObs ;
   private java.math.BigDecimal[] T01HT6_A9984BarPiePda ;
   private boolean[] T01HT6_n9984BarPiePda ;
   private short[] T01HT6_A9846BarPieAncc ;
   private boolean[] T01HT6_n9846BarPieAncc ;
   private byte[] T01HT6_A9800BarNPes ;
   private boolean[] T01HT6_n9800BarNPes ;
   private int[] T01HT6_A9799BarPz2 ;
   private boolean[] T01HT6_n9799BarPz2 ;
   private int[] T01HT6_A9798BarPz1 ;
   private boolean[] T01HT6_n9798BarPz1 ;
   private java.math.BigDecimal[] T01HT6_A9796BarPieK2 ;
   private boolean[] T01HT6_n9796BarPieK2 ;
   private java.math.BigDecimal[] T01HT6_A9795BarPieK1 ;
   private boolean[] T01HT6_n9795BarPieK1 ;
   private String[] T01HT6_A8907PzaB80 ;
   private boolean[] T01HT6_n8907PzaB80 ;
   private String[] T01HT6_A8838CodBarPz ;
   private boolean[] T01HT6_n8838CodBarPz ;
   private String[] T01HT6_A8707BapieObs ;
   private boolean[] T01HT6_n8707BapieObs ;
   private String[] T01HT6_A6489BarPieIdPz ;
   private boolean[] T01HT6_n6489BarPieIdPz ;
   private String[] T01HT6_A6116BarPieImp ;
   private boolean[] T01HT6_n6116BarPieImp ;
   private short[] T01HT6_A3277BarPieAut ;
   private boolean[] T01HT6_n3277BarPieAut ;
   private java.math.BigDecimal[] T01HT6_A3276BarMtsAut ;
   private boolean[] T01HT6_n3276BarMtsAut ;
   private java.math.BigDecimal[] T01HT6_A3275BarKgsAut ;
   private boolean[] T01HT6_n3275BarKgsAut ;
   private short[] T01HT6_A1691BarPieAnc ;
   private boolean[] T01HT6_n1691BarPieAnc ;
   private String[] T01HT6_A2186BarPieLoc ;
   private boolean[] T01HT6_n2186BarPieLoc ;
   private int[] T01HT6_A1501BarPiePie ;
   private int[] T01HT6_A1271BarPieLzd ;
   private String[] T01HT6_A908PieOriCod ;
   private short[] T01HT6_A197BarPConTro ;
   private java.math.BigDecimal[] T01HT6_A183BarMetLan ;
   private java.math.BigDecimal[] T01HT6_A170BarKilLan ;
   private byte[] T01HT6_A201BarPieEst ;
   private java.math.BigDecimal[] T01HT6_A205BarPieMet ;
   private java.math.BigDecimal[] T01HT6_A203BarPieKil ;
   private int[] T01HT6_A1642BarPieOrd ;
   private boolean[] T01HT6_n1642BarPieOrd ;
   private String[] T01HT6_A396EmprCod ;
   private int[] T01HT6_A44AlbRecCod ;
   private int[] T01HT6_A129BarCod ;
   private byte[] T01HT6_A132BarCodReo ;
   private String[] T01HT6_A130BarCodPar ;
   private String[] T01HT4_A396EmprCod ;
   private String[] T01HT5_A396EmprCod ;
   private String[] T01HT7_A396EmprCod ;
   private String[] T01HT8_A396EmprCod ;
   private String[] T01HT9_A396EmprCod ;
   private int[] T01HT9_A129BarCod ;
   private byte[] T01HT9_A132BarCodReo ;
   private String[] T01HT9_A130BarCodPar ;
   private String[] T01HT9_A200BarPieCod ;
   private String[] T01HT3_A200BarPieCod ;
   private java.math.BigDecimal[] T01HT3_A6473BarUniB ;
   private boolean[] T01HT3_n6473BarUniB ;
   private java.math.BigDecimal[] T01HT3_A6472BarTara ;
   private boolean[] T01HT3_n6472BarTara ;
   private String[] T01HT3_A1919BarPieObs ;
   private boolean[] T01HT3_n1919BarPieObs ;
   private java.math.BigDecimal[] T01HT3_A9984BarPiePda ;
   private boolean[] T01HT3_n9984BarPiePda ;
   private short[] T01HT3_A9846BarPieAncc ;
   private boolean[] T01HT3_n9846BarPieAncc ;
   private byte[] T01HT3_A9800BarNPes ;
   private boolean[] T01HT3_n9800BarNPes ;
   private int[] T01HT3_A9799BarPz2 ;
   private boolean[] T01HT3_n9799BarPz2 ;
   private int[] T01HT3_A9798BarPz1 ;
   private boolean[] T01HT3_n9798BarPz1 ;
   private java.math.BigDecimal[] T01HT3_A9796BarPieK2 ;
   private boolean[] T01HT3_n9796BarPieK2 ;
   private java.math.BigDecimal[] T01HT3_A9795BarPieK1 ;
   private boolean[] T01HT3_n9795BarPieK1 ;
   private String[] T01HT3_A8907PzaB80 ;
   private boolean[] T01HT3_n8907PzaB80 ;
   private String[] T01HT3_A8838CodBarPz ;
   private boolean[] T01HT3_n8838CodBarPz ;
   private String[] T01HT3_A8707BapieObs ;
   private boolean[] T01HT3_n8707BapieObs ;
   private String[] T01HT3_A6489BarPieIdPz ;
   private boolean[] T01HT3_n6489BarPieIdPz ;
   private String[] T01HT3_A6116BarPieImp ;
   private boolean[] T01HT3_n6116BarPieImp ;
   private short[] T01HT3_A3277BarPieAut ;
   private boolean[] T01HT3_n3277BarPieAut ;
   private java.math.BigDecimal[] T01HT3_A3276BarMtsAut ;
   private boolean[] T01HT3_n3276BarMtsAut ;
   private java.math.BigDecimal[] T01HT3_A3275BarKgsAut ;
   private boolean[] T01HT3_n3275BarKgsAut ;
   private short[] T01HT3_A1691BarPieAnc ;
   private boolean[] T01HT3_n1691BarPieAnc ;
   private String[] T01HT3_A2186BarPieLoc ;
   private boolean[] T01HT3_n2186BarPieLoc ;
   private int[] T01HT3_A1501BarPiePie ;
   private int[] T01HT3_A1271BarPieLzd ;
   private String[] T01HT3_A908PieOriCod ;
   private short[] T01HT3_A197BarPConTro ;
   private java.math.BigDecimal[] T01HT3_A183BarMetLan ;
   private java.math.BigDecimal[] T01HT3_A170BarKilLan ;
   private byte[] T01HT3_A201BarPieEst ;
   private java.math.BigDecimal[] T01HT3_A205BarPieMet ;
   private java.math.BigDecimal[] T01HT3_A203BarPieKil ;
   private int[] T01HT3_A1642BarPieOrd ;
   private boolean[] T01HT3_n1642BarPieOrd ;
   private String[] T01HT3_A396EmprCod ;
   private int[] T01HT3_A44AlbRecCod ;
   private int[] T01HT3_A129BarCod ;
   private byte[] T01HT3_A132BarCodReo ;
   private String[] T01HT3_A130BarCodPar ;
   private String[] T01HT10_A396EmprCod ;
   private int[] T01HT10_A129BarCod ;
   private byte[] T01HT10_A132BarCodReo ;
   private String[] T01HT10_A130BarCodPar ;
   private String[] T01HT10_A200BarPieCod ;
   private String[] T01HT11_A396EmprCod ;
   private int[] T01HT11_A129BarCod ;
   private byte[] T01HT11_A132BarCodReo ;
   private String[] T01HT11_A130BarCodPar ;
   private String[] T01HT11_A200BarPieCod ;
   private String[] T01HT2_A200BarPieCod ;
   private java.math.BigDecimal[] T01HT2_A6473BarUniB ;
   private boolean[] T01HT2_n6473BarUniB ;
   private java.math.BigDecimal[] T01HT2_A6472BarTara ;
   private boolean[] T01HT2_n6472BarTara ;
   private String[] T01HT2_A1919BarPieObs ;
   private boolean[] T01HT2_n1919BarPieObs ;
   private java.math.BigDecimal[] T01HT2_A9984BarPiePda ;
   private boolean[] T01HT2_n9984BarPiePda ;
   private short[] T01HT2_A9846BarPieAncc ;
   private boolean[] T01HT2_n9846BarPieAncc ;
   private byte[] T01HT2_A9800BarNPes ;
   private boolean[] T01HT2_n9800BarNPes ;
   private int[] T01HT2_A9799BarPz2 ;
   private boolean[] T01HT2_n9799BarPz2 ;
   private int[] T01HT2_A9798BarPz1 ;
   private boolean[] T01HT2_n9798BarPz1 ;
   private java.math.BigDecimal[] T01HT2_A9796BarPieK2 ;
   private boolean[] T01HT2_n9796BarPieK2 ;
   private java.math.BigDecimal[] T01HT2_A9795BarPieK1 ;
   private boolean[] T01HT2_n9795BarPieK1 ;
   private String[] T01HT2_A8907PzaB80 ;
   private boolean[] T01HT2_n8907PzaB80 ;
   private String[] T01HT2_A8838CodBarPz ;
   private boolean[] T01HT2_n8838CodBarPz ;
   private String[] T01HT2_A8707BapieObs ;
   private boolean[] T01HT2_n8707BapieObs ;
   private String[] T01HT2_A6489BarPieIdPz ;
   private boolean[] T01HT2_n6489BarPieIdPz ;
   private String[] T01HT2_A6116BarPieImp ;
   private boolean[] T01HT2_n6116BarPieImp ;
   private short[] T01HT2_A3277BarPieAut ;
   private boolean[] T01HT2_n3277BarPieAut ;
   private java.math.BigDecimal[] T01HT2_A3276BarMtsAut ;
   private boolean[] T01HT2_n3276BarMtsAut ;
   private java.math.BigDecimal[] T01HT2_A3275BarKgsAut ;
   private boolean[] T01HT2_n3275BarKgsAut ;
   private short[] T01HT2_A1691BarPieAnc ;
   private boolean[] T01HT2_n1691BarPieAnc ;
   private String[] T01HT2_A2186BarPieLoc ;
   private boolean[] T01HT2_n2186BarPieLoc ;
   private int[] T01HT2_A1501BarPiePie ;
   private int[] T01HT2_A1271BarPieLzd ;
   private String[] T01HT2_A908PieOriCod ;
   private short[] T01HT2_A197BarPConTro ;
   private java.math.BigDecimal[] T01HT2_A183BarMetLan ;
   private java.math.BigDecimal[] T01HT2_A170BarKilLan ;
   private byte[] T01HT2_A201BarPieEst ;
   private java.math.BigDecimal[] T01HT2_A205BarPieMet ;
   private java.math.BigDecimal[] T01HT2_A203BarPieKil ;
   private int[] T01HT2_A1642BarPieOrd ;
   private boolean[] T01HT2_n1642BarPieOrd ;
   private String[] T01HT2_A396EmprCod ;
   private int[] T01HT2_A44AlbRecCod ;
   private int[] T01HT2_A129BarCod ;
   private byte[] T01HT2_A132BarCodReo ;
   private String[] T01HT2_A130BarCodPar ;
   private String[] T01HT15_A396EmprCod ;
   private int[] T01HT15_A129BarCod ;
   private byte[] T01HT15_A132BarCodReo ;
   private String[] T01HT15_A130BarCodPar ;
   private String[] T01HT15_A200BarPieCod ;
   private short[] T01HT15_A12913BarPieLDf ;
   private String[] T01HT16_A396EmprCod ;
   private int[] T01HT16_A129BarCod ;
   private byte[] T01HT16_A132BarCodReo ;
   private String[] T01HT16_A130BarCodPar ;
   private String[] T01HT16_A200BarPieCod ;
   private short[] T01HT16_A3858BarTroCod ;
   private String[] T01HT17_A396EmprCod ;
   private long[] T01HT17_A30AlbProCod ;
   private int[] T01HT17_A129BarCod ;
   private byte[] T01HT17_A132BarCodReo ;
   private String[] T01HT17_A130BarCodPar ;
   private String[] T01HT17_A200BarPieCod ;
   private String[] T01HT18_A396EmprCod ;
   private int[] T01HT18_A129BarCod ;
   private byte[] T01HT18_A132BarCodReo ;
   private String[] T01HT18_A130BarCodPar ;
   private String[] T01HT18_A200BarPieCod ;
   private String[] T01HT19_A396EmprCod ;
   private String[] T01HT20_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrbarpie__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarpie__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarpie__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrbarpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HT2", "SELECT BarPieCod, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieAnc, BarPieLoc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, BarPieOrd, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieAnc, BarPieLoc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, BarPieOrd, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT3", "SELECT BarPieCod, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieAnc, BarPieLoc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, BarPieOrd, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT4", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT5", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT6", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarPieCod, TM1.BarUniB, TM1.BarTara, TM1.BarPieObs, TM1.BarPiePda, TM1.BarPieAncc, TM1.BarNPes, TM1.BarPz2, TM1.BarPz1, TM1.BarPieK2, TM1.BarPieK1, TM1.PzaB80, TM1.CodBarPz, TM1.BapieObs, TM1.BarPieIdPz, TM1.BarPieImp, TM1.BarPieAut, TM1.BarMtsAut, TM1.BarKgsAut, TM1.BarPieAnc, TM1.BarPieLoc, TM1.BarPiePie, TM1.BarPieLzd, TM1.PieOriCod, TM1.BarPConTro, TM1.BarMetLan, TM1.BarKilLan, TM1.BarPieEst, TM1.BarPieMet, TM1.BarPieKil, TM1.BarPieOrd, TM1.EmprCod, TM1.AlbRecCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM TXPBARPIE TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT7", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT8", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarPieCod > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HT11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarPieCod < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HT12", "INSERT INTO TXPBARPIE(BarPieCod, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieAnc, BarPieLoc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, BarPieOrd, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01HT13", "UPDATE TXPBARPIE SET BarUniB=?, BarTara=?, BarPieObs=?, BarPiePda=?, BarPieAncc=?, BarNPes=?, BarPz2=?, BarPz1=?, BarPieK2=?, BarPieK1=?, PzaB80=?, CodBarPz=?, BapieObs=?, BarPieIdPz=?, BarPieImp=?, BarPieAut=?, BarMtsAut=?, BarKgsAut=?, BarPieAnc=?, BarPieLoc=?, BarPiePie=?, BarPieLzd=?, PieOriCod=?, BarPConTro=?, BarMetLan=?, BarKilLan=?, BarPieEst=?, BarPieMet=?, BarPieKil=?, BarPieOrd=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01HT14", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01HT15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HT16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HT17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HT18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT19", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HT20", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((int[]) buf[42])[0] = rslt.getInt(23);
               ((String[]) buf[43])[0] = rslt.getString(24, 9);
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,2);
               ((byte[]) buf[47])[0] = rslt.getByte(28);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[50])[0] = rslt.getInt(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(32, 3);
               ((int[]) buf[53])[0] = rslt.getInt(33);
               ((int[]) buf[54])[0] = rslt.getInt(34);
               ((byte[]) buf[55])[0] = rslt.getByte(35);
               ((String[]) buf[56])[0] = rslt.getString(36, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((int[]) buf[42])[0] = rslt.getInt(23);
               ((String[]) buf[43])[0] = rslt.getString(24, 9);
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,2);
               ((byte[]) buf[47])[0] = rslt.getByte(28);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[50])[0] = rslt.getInt(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(32, 3);
               ((int[]) buf[53])[0] = rslt.getInt(33);
               ((int[]) buf[54])[0] = rslt.getInt(34);
               ((byte[]) buf[55])[0] = rslt.getByte(35);
               ((String[]) buf[56])[0] = rslt.getString(36, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 9);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((int[]) buf[42])[0] = rslt.getInt(23);
               ((String[]) buf[43])[0] = rslt.getString(24, 9);
               ((short[]) buf[44])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,2);
               ((byte[]) buf[47])[0] = rslt.getByte(28);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(30,2);
               ((int[]) buf[50])[0] = rslt.getInt(31);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(32, 3);
               ((int[]) buf[53])[0] = rslt.getInt(33);
               ((int[]) buf[54])[0] = rslt.getInt(34);
               ((byte[]) buf[55])[0] = rslt.getByte(35);
               ((String[]) buf[56])[0] = rslt.getString(36, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(5, (String)parms[4], 9);
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
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 9);
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
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 9);
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 60);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 9);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 40);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 15);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 10);
               }
               stmt.setInt(22, ((Number) parms[41]).intValue());
               stmt.setInt(23, ((Number) parms[42]).intValue());
               stmt.setString(24, (String)parms[43], 9);
               stmt.setShort(25, ((Number) parms[44]).shortValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[45], 2);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[46], 2);
               stmt.setByte(28, ((Number) parms[47]).byteValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[48], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[49], 2);
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[51]).intValue());
               }
               stmt.setString(32, (String)parms[52], 3);
               stmt.setInt(33, ((Number) parms[53]).intValue());
               stmt.setInt(34, ((Number) parms[54]).intValue());
               stmt.setByte(35, ((Number) parms[55]).byteValue());
               stmt.setString(36, (String)parms[56], 1);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 60);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 9);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 15);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 10);
               }
               stmt.setInt(21, ((Number) parms[40]).intValue());
               stmt.setInt(22, ((Number) parms[41]).intValue());
               stmt.setString(23, (String)parms[42], 9);
               stmt.setShort(24, ((Number) parms[43]).shortValue());
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 2);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[45], 2);
               stmt.setByte(27, ((Number) parms[46]).byteValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[47], 2);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[48], 2);
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[50]).intValue());
               }
               stmt.setInt(31, ((Number) parms[51]).intValue());
               stmt.setString(32, (String)parms[52], 3);
               stmt.setInt(33, ((Number) parms[53]).intValue());
               stmt.setByte(34, ((Number) parms[54]).byteValue());
               stmt.setString(35, (String)parms[55], 1);
               stmt.setString(36, (String)parms[56], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

