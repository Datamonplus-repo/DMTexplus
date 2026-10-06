package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thretrz_impl extends GXDataArea
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
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV38BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38BarTroCod), 4, 0));
            AV39BarTroIden = httpContext.GetPar( "BarTroIden") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarTroIden", AV39BarTroIden);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MTO.PIEZAS ESTAMPACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public thretrz_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thretrz_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thretrz_impl.class ));
   }

   public thretrz_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THRETRZ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Número de Trozo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros del trozo", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroMet_Enabled!=0) ? localUtil.format( A3860BarTroMet, "ZZZZZ9.99") : localUtil.format( A3860BarTroMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroMet_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroMet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "BarTroKil", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroKil_Enabled!=0) ? localUtil.format( A6556BarTroKil, "ZZZZZ9.99") : localUtil.format( A6556BarTroKil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroKil_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroKil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha del Trozo", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarTroFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroFec_Internalname, localUtil.format(A3859BarTroFec, "99/99/99"), localUtil.format( A3859BarTroFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroFec_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarTroFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarTroFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THRETRZ.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Identificación de la pieza", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroIden_Internalname, GXutil.rtrim( A3862BarTroIden), GXutil.rtrim( localUtil.format( A3862BarTroIden, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroIden_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroIden_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTroEst_Internalname, GXutil.ltrim( localUtil.ntoc( A3864BarTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTroEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3864BarTroEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A3864BarTroEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTroEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarTroEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THRETRZ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THRETRZ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THRETRZ.htm");
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
      e11U72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z3858BarTroCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3860BarTroMet = localUtil.ctond( httpContext.cgiGet( "Z3860BarTroMet")) ;
            Z6556BarTroKil = localUtil.ctond( httpContext.cgiGet( "Z6556BarTroKil")) ;
            Z3859BarTroFec = localUtil.ctod( httpContext.cgiGet( "Z3859BarTroFec"), 0) ;
            Z3862BarTroIden = httpContext.cgiGet( "Z3862BarTroIden") ;
            Z3864BarTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3864BarTroEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV38BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( "vBARTROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39BarTroIden = httpContext.cgiGet( "vBARTROIDEN") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROMET");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroMet_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3860BarTroMet = DecimalUtil.ZERO ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            else
            {
               A3860BarTroMet = localUtil.ctond( httpContext.cgiGet( edtBarTroMet_Internalname)) ;
               n3860BarTroMet = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROKIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroKil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6556BarTroKil = DecimalUtil.ZERO ;
               n6556BarTroKil = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
            }
            else
            {
               A6556BarTroKil = localUtil.ctond( httpContext.cgiGet( edtBarTroKil_Internalname)) ;
               n6556BarTroKil = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBarTroFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARTROFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3859BarTroFec = GXutil.nullDate() ;
               n3859BarTroFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
            }
            else
            {
               A3859BarTroFec = localUtil.ctod( httpContext.cgiGet( edtBarTroFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n3859BarTroFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
            }
            A3862BarTroIden = httpContext.cgiGet( edtBarTroIden_Internalname) ;
            n3862BarTroIden = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTROEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarTroEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3864BarTroEst = (byte)(0) ;
               n3864BarTroEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
            }
            else
            {
               A3864BarTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3864BarTroEst = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"THRETRZ");
            A3858BarTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            forbiddenHiddens.add("BarTroCod", localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"));
            A3862BarTroIden = httpContext.cgiGet( edtBarTroIden_Internalname) ;
            n3862BarTroIden = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
            forbiddenHiddens.add("BarTroIden", GXutil.rtrim( localUtil.format( A3862BarTroIden, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("thretrz:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
               getEqualNoModal( ) ;
               if ( isIns( )  && (0==A3858BarTroCod) && ( Gx_BScreen == 0 ) )
               {
                  A3858BarTroCod = AV38BarTroCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
               }
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
                        e11U72 ();
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
            initAllU7531( ) ;
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
      disableAttributesU7531( ) ;
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

   public void confirm_U70( )
   {
      beforeValidateU7531( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsU7531( ) ;
         }
         else
         {
            checkExtendedTableU7531( ) ;
            if ( AnyError == 0 )
            {
               zmU7531( 13) ;
            }
            closeExtendedTableCursorsU7531( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesU70( ) ;
      }
   }

   public void resetCaptionU70( )
   {
   }

   public void e11U72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thretrz_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thretrz_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV10Lit1 = httpContext.getMessage( "Mto. Piezas Estampacion    ", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN310_", ""), (byte)(99), GXv_char2) ;
      thretrz_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV17Lit5 = "#" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1052_", ""), (byte)(99), GXv_char2) ;
      thretrz_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thretrz_impl.this.A396EmprCod = GXv_char2[0] ;
      thretrz_impl.this.AV11EmprNom = GXv_char3[0] ;
      thretrz_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmU7531( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3860BarTroMet = T00U73_A3860BarTroMet[0] ;
            Z6556BarTroKil = T00U73_A6556BarTroKil[0] ;
            Z3859BarTroFec = T00U73_A3859BarTroFec[0] ;
            Z3862BarTroIden = T00U73_A3862BarTroIden[0] ;
            Z3864BarTroEst = T00U73_A3864BarTroEst[0] ;
         }
         else
         {
            Z3860BarTroMet = A3860BarTroMet ;
            Z6556BarTroKil = A6556BarTroKil ;
            Z3859BarTroFec = A3859BarTroFec ;
            Z3862BarTroIden = A3862BarTroIden ;
            Z3864BarTroEst = A3864BarTroEst ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         Z3860BarTroMet = A3860BarTroMet ;
         Z6556BarTroKil = A6556BarTroKil ;
         Z3859BarTroFec = A3859BarTroFec ;
         Z3862BarTroIden = A3862BarTroIden ;
         Z3864BarTroEst = A3864BarTroEst ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), true);
      edtBarTroIden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroIden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroIden_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), true);
      edtBarTroIden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroIden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroIden_Enabled), 5, 0), true);
      /* Using cursor T00U74 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00U74_A407EmprNom[0] ;
      n407EmprNom = T00U74_n407EmprNom[0] ;
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
      if ( isIns( )  && (0==A3858BarTroCod) && ( Gx_BScreen == 0 ) )
      {
         A3858BarTroCod = AV38BarTroCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3862BarTroIden)==0) && ( Gx_BScreen == 0 ) )
      {
         A3862BarTroIden = AV39BarTroIden ;
         n3862BarTroIden = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
      }
      if ( isIns( )  && (0==A3864BarTroEst) && ( Gx_BScreen == 0 ) )
      {
         A3864BarTroEst = (byte)(0) ;
         n3864BarTroEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3859BarTroFec)) && ( Gx_BScreen == 0 ) )
      {
         A3859BarTroFec = GXutil.today( ) ;
         n3859BarTroFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
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

   public void loadU7531( )
   {
      /* Using cursor T00U75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A3860BarTroMet = T00U75_A3860BarTroMet[0] ;
         n3860BarTroMet = T00U75_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         A6556BarTroKil = T00U75_A6556BarTroKil[0] ;
         n6556BarTroKil = T00U75_n6556BarTroKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
         A407EmprNom = T00U75_A407EmprNom[0] ;
         n407EmprNom = T00U75_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3859BarTroFec = T00U75_A3859BarTroFec[0] ;
         n3859BarTroFec = T00U75_n3859BarTroFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
         A3862BarTroIden = T00U75_A3862BarTroIden[0] ;
         n3862BarTroIden = T00U75_n3862BarTroIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
         A3864BarTroEst = T00U75_A3864BarTroEst[0] ;
         n3864BarTroEst = T00U75_n3864BarTroEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
         zmU7531( -12) ;
      }
      pr_default.close(3);
      onLoadActionsU7531( ) ;
   }

   public void onLoadActionsU7531( )
   {
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3860BarTroMet)==0) && isIns( )  )
      {
         A3860BarTroMet = E3860BarTroMet ;
         n3860BarTroMet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A6556BarTroKil)==0) && isIns( )  )
      {
         A6556BarTroKil = E6556BarTroKil ;
         n6556BarTroKil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
      }
   }

   public void checkExtendedTableU7531( )
   {
      nIsDirty_531 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A200BarPieCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe introducir Pieza", ""), 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A3860BarTroMet)==0) && isIns( )  )
      {
         nIsDirty_531 = (short)(1) ;
         A3860BarTroMet = E3860BarTroMet ;
         n3860BarTroMet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
      }
      if ( A3860BarTroMet.doubleValue() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se han entrado metros", ""), 0, "BARTROMET");
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A6556BarTroKil)==0) && isIns( )  )
      {
         nIsDirty_531 = (short)(1) ;
         A6556BarTroKil = E6556BarTroKil ;
         n6556BarTroKil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
      }
      if ( ( A3860BarTroMet.doubleValue() == 0 ) && ( A6556BarTroKil.doubleValue() == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se han entrado Metros, ni Kilos", ""), 0, "BARTROMET");
      }
   }

   public void closeExtendedTableCursorsU7531( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyU7531( )
   {
      /* Using cursor T00U76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound531 = (short)(1) ;
      }
      else
      {
         RcdFound531 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00U73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00U73_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U73_A129BarCod[0] == A129BarCod ) && ( T00U73_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U73_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zmU7531( 12) ;
         RcdFound531 = (short)(1) ;
         A200BarPieCod = T00U73_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A3858BarTroCod = T00U73_A3858BarTroCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
         A3860BarTroMet = T00U73_A3860BarTroMet[0] ;
         n3860BarTroMet = T00U73_n3860BarTroMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
         A6556BarTroKil = T00U73_A6556BarTroKil[0] ;
         n6556BarTroKil = T00U73_n6556BarTroKil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
         A3859BarTroFec = T00U73_A3859BarTroFec[0] ;
         n3859BarTroFec = T00U73_n3859BarTroFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
         A3862BarTroIden = T00U73_A3862BarTroIden[0] ;
         n3862BarTroIden = T00U73_n3862BarTroIden[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
         A3864BarTroEst = T00U73_A3864BarTroEst[0] ;
         n3864BarTroEst = T00U73_n3864BarTroEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z3858BarTroCod = A3858BarTroCod ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadU7531( ) ;
         if ( AnyError == 1 )
         {
            RcdFound531 = (short)(0) ;
            initializeNonKeyU7531( ) ;
         }
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound531 = (short)(0) ;
         initializeNonKeyU7531( ) ;
         sMode531 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode531 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyU7531( ) ;
      if ( RcdFound531 == 0 )
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
      RcdFound531 = (short)(0) ;
      /* Using cursor T00U77 */
      pr_default.execute(5, new Object[] {A200BarPieCod, A200BarPieCod, Short.valueOf(A3858BarTroCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00U77_A200BarPieCod[0], A200BarPieCod) < 0 ) || ( GXutil.strcmp(T00U77_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U77_A3858BarTroCod[0] < A3858BarTroCod ) ) && ( GXutil.strcmp(T00U77_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U77_A129BarCod[0] == A129BarCod ) && ( T00U77_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U77_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00U77_A200BarPieCod[0], A200BarPieCod) > 0 ) || ( GXutil.strcmp(T00U77_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U77_A3858BarTroCod[0] > A3858BarTroCod ) ) && ( GXutil.strcmp(T00U77_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U77_A129BarCod[0] == A129BarCod ) && ( T00U77_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U77_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A200BarPieCod = T00U77_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = T00U77_A3858BarTroCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound531 = (short)(0) ;
      /* Using cursor T00U78 */
      pr_default.execute(6, new Object[] {A200BarPieCod, A200BarPieCod, Short.valueOf(A3858BarTroCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00U78_A200BarPieCod[0], A200BarPieCod) > 0 ) || ( GXutil.strcmp(T00U78_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U78_A3858BarTroCod[0] > A3858BarTroCod ) ) && ( GXutil.strcmp(T00U78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U78_A129BarCod[0] == A129BarCod ) && ( T00U78_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U78_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00U78_A200BarPieCod[0], A200BarPieCod) < 0 ) || ( GXutil.strcmp(T00U78_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( T00U78_A3858BarTroCod[0] < A3858BarTroCod ) ) && ( GXutil.strcmp(T00U78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00U78_A129BarCod[0] == A129BarCod ) && ( T00U78_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00U78_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A200BarPieCod = T00U78_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = T00U78_A3858BarTroCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
            RcdFound531 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyU7531( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertU7531( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound531 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
            {
               A200BarPieCod = Z200BarPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               A3858BarTroCod = Z3858BarTroCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateU7531( ) ;
               GX_FocusControl = edtBarPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertU7531( ) ;
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
                  GX_FocusControl = edtBarPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertU7531( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
      {
         A200BarPieCod = Z200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A3858BarTroCod = Z3858BarTroCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
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
      getKeyU7531( ) ;
      if ( RcdFound531 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
         {
            A200BarPieCod = Z200BarPieCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A3858BarTroCod = Z3858BarTroCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) || ( A3858BarTroCod != Z3858BarTroCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thretrz");
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_U70( ) ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartU7531( ) ;
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU7531( ) ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
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
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
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
      scanStartU7531( ) ;
      if ( RcdFound531 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound531 != 0 )
         {
            scanNextU7531( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarTroMet_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndU7531( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyU7531( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3860BarTroMet, T00U72_A3860BarTroMet[0]) != 0 ) || ( DecimalUtil.compareTo(Z6556BarTroKil, T00U72_A6556BarTroKil[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T00U72_A3859BarTroFec[0])) ) || ( GXutil.strcmp(Z3862BarTroIden, T00U72_A3862BarTroIden[0]) != 0 ) || ( Z3864BarTroEst != T00U72_A3864BarTroEst[0] ) )
         {
            if ( DecimalUtil.compareTo(Z3860BarTroMet, T00U72_A3860BarTroMet[0]) != 0 )
            {
               GXutil.writeLogln("thretrz:[seudo value changed for attri]"+"BarTroMet");
               GXutil.writeLogRaw("Old: ",Z3860BarTroMet);
               GXutil.writeLogRaw("Current: ",T00U72_A3860BarTroMet[0]);
            }
            if ( DecimalUtil.compareTo(Z6556BarTroKil, T00U72_A6556BarTroKil[0]) != 0 )
            {
               GXutil.writeLogln("thretrz:[seudo value changed for attri]"+"BarTroKil");
               GXutil.writeLogRaw("Old: ",Z6556BarTroKil);
               GXutil.writeLogRaw("Current: ",T00U72_A6556BarTroKil[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3859BarTroFec), GXutil.resetTime(T00U72_A3859BarTroFec[0])) ) )
            {
               GXutil.writeLogln("thretrz:[seudo value changed for attri]"+"BarTroFec");
               GXutil.writeLogRaw("Old: ",Z3859BarTroFec);
               GXutil.writeLogRaw("Current: ",T00U72_A3859BarTroFec[0]);
            }
            if ( GXutil.strcmp(Z3862BarTroIden, T00U72_A3862BarTroIden[0]) != 0 )
            {
               GXutil.writeLogln("thretrz:[seudo value changed for attri]"+"BarTroIden");
               GXutil.writeLogRaw("Old: ",Z3862BarTroIden);
               GXutil.writeLogRaw("Current: ",T00U72_A3862BarTroIden[0]);
            }
            if ( Z3864BarTroEst != T00U72_A3864BarTroEst[0] )
            {
               GXutil.writeLogln("thretrz:[seudo value changed for attri]"+"BarTroEst");
               GXutil.writeLogRaw("Old: ",Z3864BarTroEst);
               GXutil.writeLogRaw("Current: ",T00U72_A3864BarTroEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARTRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU7531( )
   {
      beforeValidateU7531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU7531( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU7531( 0) ;
         checkOptimisticConcurrencyU7531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU7531( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU7531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U79 */
                  pr_default.execute(7, new Object[] {A200BarPieCod, Short.valueOf(A3858BarTroCod), Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
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
                        E6556BarTroKil = A6556BarTroKil ;
                        n6556BarTroKil = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
                        E3860BarTroMet = A3860BarTroMet ;
                        n3860BarTroMet = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionU70( ) ;
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
            loadU7531( ) ;
         }
         endLevelU7531( ) ;
      }
      closeExtendedTableCursorsU7531( ) ;
   }

   public void updateU7531( )
   {
      beforeValidateU7531( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU7531( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU7531( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU7531( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateU7531( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U710 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n3860BarTroMet), A3860BarTroMet, Boolean.valueOf(n6556BarTroKil), A6556BarTroKil, Boolean.valueOf(n3859BarTroFec), A3859BarTroFec, Boolean.valueOf(n3862BarTroIden), A3862BarTroIden, Boolean.valueOf(n3864BarTroEst), Byte.valueOf(A3864BarTroEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateU7531( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionU70( ) ;
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
         endLevelU7531( ) ;
      }
      closeExtendedTableCursorsU7531( ) ;
   }

   public void deferredUpdateU7531( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU7531( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU7531( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU7531( ) ;
         afterConfirmU7531( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU7531( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00U711 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound531 == 0 )
                     {
                        initAllU7531( ) ;
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
                     resetCaptionU70( ) ;
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
      sMode531 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU7531( ) ;
      Gx_mode = sMode531 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU7531( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00U712 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Defectos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00U713 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarTrDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevelU7531( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteU7531( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thretrz");
         if ( AnyError == 0 )
         {
            confirmValuesU70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thretrz");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartU7531( )
   {
      /* Scan By routine */
      /* Using cursor T00U714 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A200BarPieCod = T00U714_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A3858BarTroCod = T00U714_A3858BarTroCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU7531( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound531 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound531 = (short)(1) ;
         A200BarPieCod = T00U714_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A3858BarTroCod = T00U714_A3858BarTroCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
      }
   }

   public void scanEndU7531( )
   {
      pr_default.close(12);
   }

   public void afterConfirmU7531( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU7531( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU7531( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU7531( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU7531( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU7531( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU7531( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroCod_Enabled), 5, 0), true);
      edtBarTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroMet_Enabled), 5, 0), true);
      edtBarTroKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroKil_Enabled), 5, 0), true);
      edtBarTroFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroFec_Enabled), 5, 0), true);
      edtBarTroIden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroIden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroIden_Enabled), 5, 0), true);
      edtBarTroEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTroEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTroEst_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesU7531( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesU70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thretrz", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarTroIden))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarTroCod","BarTroIden"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"THRETRZ");
      forbiddenHiddens.add("BarTroCod", localUtil.format( DecimalUtil.doubleToDec(A3858BarTroCod), "ZZZ9"));
      forbiddenHiddens.add("BarTroIden", GXutil.rtrim( localUtil.format( A3862BarTroIden, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thretrz:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3858BarTroCod", GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3860BarTroMet", GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6556BarTroKil", GXutil.ltrim( localUtil.ntoc( Z6556BarTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3859BarTroFec", localUtil.dtoc( Z3859BarTroFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3862BarTroIden", GXutil.rtrim( Z3862BarTroIden));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3864BarTroEst", GXutil.ltrim( localUtil.ntoc( Z3864BarTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCOD", GXutil.ltrim( localUtil.ntoc( AV38BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROIDEN", GXutil.rtrim( AV39BarTroIden));
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
      return formatLink("app.thretrz", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarTroCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarTroIden))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarTroCod","BarTroIden"})  ;
   }

   public String getPgmname( )
   {
      return "THRETRZ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MTO.PIEZAS ESTAMPACION", "") ;
   }

   public void initializeNonKeyU7531( )
   {
      A3860BarTroMet = DecimalUtil.ZERO ;
      n3860BarTroMet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrimstr( A3860BarTroMet, 9, 2));
      A6556BarTroKil = DecimalUtil.ZERO ;
      n6556BarTroKil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrimstr( A6556BarTroKil, 9, 2));
      A3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
      A3862BarTroIden = AV39BarTroIden ;
      n3862BarTroIden = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
      A3864BarTroEst = (byte)(0) ;
      n3864BarTroEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z6556BarTroKil = DecimalUtil.ZERO ;
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3862BarTroIden = "" ;
      Z3864BarTroEst = (byte)(0) ;
   }

   public void initAllU7531( )
   {
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      A3858BarTroCod = AV38BarTroCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3858BarTroCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3858BarTroCod), 4, 0));
      initializeNonKeyU7531( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3862BarTroIden = i3862BarTroIden ;
      n3862BarTroIden = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", A3862BarTroIden);
      A3864BarTroEst = i3864BarTroEst ;
      n3864BarTroEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.str( A3864BarTroEst, 1, 0));
      A3859BarTroFec = i3859BarTroFec ;
      n3859BarTroFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824153027", true, true);
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
      httpContext.AddJavascriptSource("thretrz.js", "?2026824153028", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarTroCod_Internalname = "BARTROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarTroMet_Internalname = "BARTROMET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarTroKil_Internalname = "BARTROKIL" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarTroFec_Internalname = "BARTROFEC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarTroIden_Internalname = "BARTROIDEN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarTroEst_Internalname = "BARTROEST" ;
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
      Form.setCaption( httpContext.getMessage( "MTO.PIEZAS ESTAMPACION", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBarTroEst_Jsonclick = "" ;
      edtBarTroEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroEst_Enabled = 1 ;
      edtBarTroIden_Jsonclick = "" ;
      edtBarTroIden_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroIden_Enabled = 0 ;
      edtBarTroFec_Jsonclick = "" ;
      edtBarTroFec_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroFec_Enabled = 1 ;
      edtBarTroKil_Jsonclick = "" ;
      edtBarTroKil_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroKil_Enabled = 1 ;
      edtBarTroMet_Jsonclick = "" ;
      edtBarTroMet_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroMet_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarTroCod_Jsonclick = "" ;
      edtBarTroCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarTroCod_Enabled = 0 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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
      /* Using cursor T00U715 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00U715_A407EmprNom[0] ;
      n407EmprNom = T00U715_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      GX_FocusControl = edtBarTroMet_Internalname ;
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

   public void valid_Bartrocod( )
   {
      n3862BarTroIden = false ;
      n3864BarTroEst = false ;
      n3859BarTroFec = false ;
      E6556BarTroKil = A6556BarTroKil ;
      n6556BarTroKil = false ;
      E3860BarTroMet = A3860BarTroMet ;
      n3860BarTroMet = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3859BarTroFec", localUtil.format(A3859BarTroFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3862BarTroIden", GXutil.rtrim( A3862BarTroIden));
      httpContext.ajax_rsp_assign_attri("", false, "A3864BarTroEst", GXutil.ltrim( localUtil.ntoc( A3864BarTroEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3860BarTroMet", GXutil.ltrim( localUtil.ntoc( A3860BarTroMet, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6556BarTroKil", GXutil.ltrim( localUtil.ntoc( A6556BarTroKil, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3858BarTroCod", GXutil.ltrim( localUtil.ntoc( Z3858BarTroCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3859BarTroFec", localUtil.format(Z3859BarTroFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3862BarTroIden", GXutil.rtrim( Z3862BarTroIden));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3864BarTroEst", GXutil.ltrim( localUtil.ntoc( Z3864BarTroEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3860BarTroMet", GXutil.ltrim( localUtil.ntoc( Z3860BarTroMet, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6556BarTroKil", GXutil.ltrim( localUtil.ntoc( Z6556BarTroKil, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV38BarTroCod',fld:'vBARTROCOD',pic:'ZZZ9'},{av:'AV39BarTroIden',fld:'vBARTROIDEN',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A3862BarTroIden',fld:'BARTROIDEN',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("VALID_BARTROCOD","{handler:'valid_Bartrocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'AV38BarTroCod',fld:'vBARTROCOD',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV39BarTroIden',fld:'vBARTROIDEN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A3862BarTroIden',fld:'BARTROIDEN',pic:''},{av:'A3864BarTroEst',fld:'BARTROEST',pic:'9'},{av:'A3859BarTroFec',fld:'BARTROFEC',pic:''}]");
      setEventMetadata("VALID_BARTROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3859BarTroFec',fld:'BARTROFEC',pic:''},{av:'A3862BarTroIden',fld:'BARTROIDEN',pic:''},{av:'A3864BarTroEst',fld:'BARTROEST',pic:'9'},{av:'A3860BarTroMet',fld:'BARTROMET',pic:'ZZZZZ9.99'},{av:'A6556BarTroKil',fld:'BARTROKIL',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z3858BarTroCod'},{av:'Z407EmprNom'},{av:'Z3859BarTroFec'},{av:'Z3862BarTroIden'},{av:'Z3864BarTroEst'},{av:'Z3860BarTroMet'},{av:'Z6556BarTroKil'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARTROMET","{handler:'valid_Bartromet',iparms:[]");
      setEventMetadata("VALID_BARTROMET",",oparms:[]}");
      setEventMetadata("VALID_BARTROKIL","{handler:'valid_Bartrokil',iparms:[]");
      setEventMetadata("VALID_BARTROKIL",",oparms:[]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV39BarTroIden = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z3860BarTroMet = DecimalUtil.ZERO ;
      Z6556BarTroKil = DecimalUtil.ZERO ;
      Z3859BarTroFec = GXutil.nullDate() ;
      Z3862BarTroIden = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV39BarTroIden = "" ;
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
      A200BarPieCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A3860BarTroMet = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A6556BarTroKil = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A3859BarTroFec = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A3862BarTroIden = "" ;
      lblTextblock12_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV10Lit1 = "" ;
      AV14Lit2 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00U74_A407EmprNom = new String[] {""} ;
      T00U74_n407EmprNom = new boolean[] {false} ;
      T00U75_A200BarPieCod = new String[] {""} ;
      T00U75_A3858BarTroCod = new short[1] ;
      T00U75_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U75_n3860BarTroMet = new boolean[] {false} ;
      T00U75_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U75_n6556BarTroKil = new boolean[] {false} ;
      T00U75_A407EmprNom = new String[] {""} ;
      T00U75_n407EmprNom = new boolean[] {false} ;
      T00U75_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00U75_n3859BarTroFec = new boolean[] {false} ;
      T00U75_A3862BarTroIden = new String[] {""} ;
      T00U75_n3862BarTroIden = new boolean[] {false} ;
      T00U75_A3864BarTroEst = new byte[1] ;
      T00U75_n3864BarTroEst = new boolean[] {false} ;
      T00U75_A396EmprCod = new String[] {""} ;
      T00U75_A129BarCod = new int[1] ;
      T00U75_A132BarCodReo = new byte[1] ;
      T00U75_A130BarCodPar = new String[] {""} ;
      E3860BarTroMet = DecimalUtil.ZERO ;
      E6556BarTroKil = DecimalUtil.ZERO ;
      T00U76_A396EmprCod = new String[] {""} ;
      T00U76_A129BarCod = new int[1] ;
      T00U76_A132BarCodReo = new byte[1] ;
      T00U76_A130BarCodPar = new String[] {""} ;
      T00U76_A200BarPieCod = new String[] {""} ;
      T00U76_A3858BarTroCod = new short[1] ;
      T00U73_A200BarPieCod = new String[] {""} ;
      T00U73_A3858BarTroCod = new short[1] ;
      T00U73_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U73_n3860BarTroMet = new boolean[] {false} ;
      T00U73_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U73_n6556BarTroKil = new boolean[] {false} ;
      T00U73_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00U73_n3859BarTroFec = new boolean[] {false} ;
      T00U73_A3862BarTroIden = new String[] {""} ;
      T00U73_n3862BarTroIden = new boolean[] {false} ;
      T00U73_A3864BarTroEst = new byte[1] ;
      T00U73_n3864BarTroEst = new boolean[] {false} ;
      T00U73_A396EmprCod = new String[] {""} ;
      T00U73_A129BarCod = new int[1] ;
      T00U73_A132BarCodReo = new byte[1] ;
      T00U73_A130BarCodPar = new String[] {""} ;
      sMode531 = "" ;
      T00U77_A396EmprCod = new String[] {""} ;
      T00U77_A129BarCod = new int[1] ;
      T00U77_A132BarCodReo = new byte[1] ;
      T00U77_A130BarCodPar = new String[] {""} ;
      T00U77_A200BarPieCod = new String[] {""} ;
      T00U77_A3858BarTroCod = new short[1] ;
      T00U78_A396EmprCod = new String[] {""} ;
      T00U78_A129BarCod = new int[1] ;
      T00U78_A132BarCodReo = new byte[1] ;
      T00U78_A130BarCodPar = new String[] {""} ;
      T00U78_A200BarPieCod = new String[] {""} ;
      T00U78_A3858BarTroCod = new short[1] ;
      T00U72_A200BarPieCod = new String[] {""} ;
      T00U72_A3858BarTroCod = new short[1] ;
      T00U72_A3860BarTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U72_n3860BarTroMet = new boolean[] {false} ;
      T00U72_A6556BarTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U72_n6556BarTroKil = new boolean[] {false} ;
      T00U72_A3859BarTroFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00U72_n3859BarTroFec = new boolean[] {false} ;
      T00U72_A3862BarTroIden = new String[] {""} ;
      T00U72_n3862BarTroIden = new boolean[] {false} ;
      T00U72_A3864BarTroEst = new byte[1] ;
      T00U72_n3864BarTroEst = new boolean[] {false} ;
      T00U72_A396EmprCod = new String[] {""} ;
      T00U72_A129BarCod = new int[1] ;
      T00U72_A132BarCodReo = new byte[1] ;
      T00U72_A130BarCodPar = new String[] {""} ;
      T00U712_A396EmprCod = new String[] {""} ;
      T00U712_A129BarCod = new int[1] ;
      T00U712_A132BarCodReo = new byte[1] ;
      T00U712_A130BarCodPar = new String[] {""} ;
      T00U712_A200BarPieCod = new String[] {""} ;
      T00U712_A3858BarTroCod = new short[1] ;
      T00U712_A12649TRDefcod = new short[1] ;
      T00U712_A12650TRFasCod = new String[] {""} ;
      T00U713_A396EmprCod = new String[] {""} ;
      T00U713_A129BarCod = new int[1] ;
      T00U713_A132BarCodReo = new byte[1] ;
      T00U713_A130BarCodPar = new String[] {""} ;
      T00U713_A200BarPieCod = new String[] {""} ;
      T00U713_A3858BarTroCod = new short[1] ;
      T00U713_A4993BarTroDef = new short[1] ;
      T00U714_A396EmprCod = new String[] {""} ;
      T00U714_A129BarCod = new int[1] ;
      T00U714_A132BarCodReo = new byte[1] ;
      T00U714_A130BarCodPar = new String[] {""} ;
      T00U714_A200BarPieCod = new String[] {""} ;
      T00U714_A3858BarTroCod = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3862BarTroIden = "" ;
      i3859BarTroFec = GXutil.nullDate() ;
      T00U715_A407EmprNom = new String[] {""} ;
      T00U715_n407EmprNom = new boolean[] {false} ;
      Gx_restmethod = "" ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3859BarTroFec = GXutil.nullDate() ;
      ZZ3862BarTroIden = "" ;
      ZZ3860BarTroMet = DecimalUtil.ZERO ;
      ZZ6556BarTroKil = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thretrz__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thretrz__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thretrz__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thretrz__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thretrz__default(),
         new Object[] {
             new Object[] {
            T00U72_A200BarPieCod, T00U72_A3858BarTroCod, T00U72_A3860BarTroMet, T00U72_n3860BarTroMet, T00U72_A6556BarTroKil, T00U72_n6556BarTroKil, T00U72_A3859BarTroFec, T00U72_n3859BarTroFec, T00U72_A3862BarTroIden, T00U72_n3862BarTroIden,
            T00U72_A3864BarTroEst, T00U72_n3864BarTroEst, T00U72_A396EmprCod, T00U72_A129BarCod, T00U72_A132BarCodReo, T00U72_A130BarCodPar
            }
            , new Object[] {
            T00U73_A200BarPieCod, T00U73_A3858BarTroCod, T00U73_A3860BarTroMet, T00U73_n3860BarTroMet, T00U73_A6556BarTroKil, T00U73_n6556BarTroKil, T00U73_A3859BarTroFec, T00U73_n3859BarTroFec, T00U73_A3862BarTroIden, T00U73_n3862BarTroIden,
            T00U73_A3864BarTroEst, T00U73_n3864BarTroEst, T00U73_A396EmprCod, T00U73_A129BarCod, T00U73_A132BarCodReo, T00U73_A130BarCodPar
            }
            , new Object[] {
            T00U74_A407EmprNom, T00U74_n407EmprNom
            }
            , new Object[] {
            T00U75_A200BarPieCod, T00U75_A3858BarTroCod, T00U75_A3860BarTroMet, T00U75_n3860BarTroMet, T00U75_A6556BarTroKil, T00U75_n6556BarTroKil, T00U75_A407EmprNom, T00U75_n407EmprNom, T00U75_A3859BarTroFec, T00U75_n3859BarTroFec,
            T00U75_A3862BarTroIden, T00U75_n3862BarTroIden, T00U75_A3864BarTroEst, T00U75_n3864BarTroEst, T00U75_A396EmprCod, T00U75_A129BarCod, T00U75_A132BarCodReo, T00U75_A130BarCodPar
            }
            , new Object[] {
            T00U76_A396EmprCod, T00U76_A129BarCod, T00U76_A132BarCodReo, T00U76_A130BarCodPar, T00U76_A200BarPieCod, T00U76_A3858BarTroCod
            }
            , new Object[] {
            T00U77_A396EmprCod, T00U77_A129BarCod, T00U77_A132BarCodReo, T00U77_A130BarCodPar, T00U77_A200BarPieCod, T00U77_A3858BarTroCod
            }
            , new Object[] {
            T00U78_A396EmprCod, T00U78_A129BarCod, T00U78_A132BarCodReo, T00U78_A130BarCodPar, T00U78_A200BarPieCod, T00U78_A3858BarTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U712_A396EmprCod, T00U712_A129BarCod, T00U712_A132BarCodReo, T00U712_A130BarCodPar, T00U712_A200BarPieCod, T00U712_A3858BarTroCod, T00U712_A12649TRDefcod, T00U712_A12650TRFasCod
            }
            , new Object[] {
            T00U713_A396EmprCod, T00U713_A129BarCod, T00U713_A132BarCodReo, T00U713_A130BarCodPar, T00U713_A200BarPieCod, T00U713_A3858BarTroCod, T00U713_A4993BarTroDef
            }
            , new Object[] {
            T00U714_A396EmprCod, T00U714_A129BarCod, T00U714_A132BarCodReo, T00U714_A130BarCodPar, T00U714_A200BarPieCod, T00U714_A3858BarTroCod
            }
            , new Object[] {
            T00U715_A407EmprNom, T00U715_n407EmprNom
            }
         }
      );
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      A3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      i3859BarTroFec = GXutil.today( ) ;
      n3859BarTroFec = false ;
      Z3864BarTroEst = (byte)(0) ;
      n3864BarTroEst = false ;
      A3864BarTroEst = (byte)(0) ;
      n3864BarTroEst = false ;
      i3864BarTroEst = (byte)(0) ;
      n3864BarTroEst = false ;
      Z3862BarTroIden = "" ;
      n3862BarTroIden = false ;
      A3862BarTroIden = "" ;
      n3862BarTroIden = false ;
      i3862BarTroIden = "" ;
      n3862BarTroIden = false ;
      Z3858BarTroCod = (short)(0) ;
      A3858BarTroCod = (short)(0) ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z3864BarTroEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3864BarTroEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte i3864BarTroEst ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3864BarTroEst ;
   private short wcpOAV38BarTroCod ;
   private short Z3858BarTroCod ;
   private short AV38BarTroCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3858BarTroCod ;
   private short RcdFound531 ;
   private short nIsDirty_531 ;
   private short ZZ3858BarTroCod ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int edtBarTroCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarTroMet_Enabled ;
   private int edtBarTroKil_Enabled ;
   private int edtBarTroFec_Enabled ;
   private int edtBarTroIden_Enabled ;
   private int edtBarTroEst_Enabled ;
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
   private int edtBarTroEst_Backcolor ;
   private int edtBarTroIden_Backcolor ;
   private int edtBarTroFec_Backcolor ;
   private int edtBarTroKil_Backcolor ;
   private int edtBarTroMet_Backcolor ;
   private int edtBarTroCod_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private java.math.BigDecimal Z3860BarTroMet ;
   private java.math.BigDecimal Z6556BarTroKil ;
   private java.math.BigDecimal A3860BarTroMet ;
   private java.math.BigDecimal A6556BarTroKil ;
   private java.math.BigDecimal E3860BarTroMet ;
   private java.math.BigDecimal E6556BarTroKil ;
   private java.math.BigDecimal ZZ3860BarTroMet ;
   private java.math.BigDecimal ZZ6556BarTroKil ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV39BarTroIden ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z3862BarTroIden ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV39BarTroIden ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarPieCod_Internalname ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarTroCod_Internalname ;
   private String edtBarTroCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarTroMet_Internalname ;
   private String edtBarTroMet_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarTroKil_Internalname ;
   private String edtBarTroKil_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarTroFec_Internalname ;
   private String edtBarTroFec_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarTroIden_Internalname ;
   private String A3862BarTroIden ;
   private String edtBarTroIden_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarTroEst_Internalname ;
   private String edtBarTroEst_Jsonclick ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV10Lit1 ;
   private String AV14Lit2 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sMode531 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3862BarTroIden ;
   private String Gx_restmethod ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ407EmprNom ;
   private String ZZ3862BarTroIden ;
   private java.util.Date Z3859BarTroFec ;
   private java.util.Date A3859BarTroFec ;
   private java.util.Date i3859BarTroFec ;
   private java.util.Date ZZ3859BarTroFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n3860BarTroMet ;
   private boolean n6556BarTroKil ;
   private boolean n3859BarTroFec ;
   private boolean n3862BarTroIden ;
   private boolean n3864BarTroEst ;
   private boolean returnInSub ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00U74_A407EmprNom ;
   private boolean[] T00U74_n407EmprNom ;
   private String[] T00U75_A200BarPieCod ;
   private short[] T00U75_A3858BarTroCod ;
   private java.math.BigDecimal[] T00U75_A3860BarTroMet ;
   private boolean[] T00U75_n3860BarTroMet ;
   private java.math.BigDecimal[] T00U75_A6556BarTroKil ;
   private boolean[] T00U75_n6556BarTroKil ;
   private String[] T00U75_A407EmprNom ;
   private boolean[] T00U75_n407EmprNom ;
   private java.util.Date[] T00U75_A3859BarTroFec ;
   private boolean[] T00U75_n3859BarTroFec ;
   private String[] T00U75_A3862BarTroIden ;
   private boolean[] T00U75_n3862BarTroIden ;
   private byte[] T00U75_A3864BarTroEst ;
   private boolean[] T00U75_n3864BarTroEst ;
   private String[] T00U75_A396EmprCod ;
   private int[] T00U75_A129BarCod ;
   private byte[] T00U75_A132BarCodReo ;
   private String[] T00U75_A130BarCodPar ;
   private String[] T00U76_A396EmprCod ;
   private int[] T00U76_A129BarCod ;
   private byte[] T00U76_A132BarCodReo ;
   private String[] T00U76_A130BarCodPar ;
   private String[] T00U76_A200BarPieCod ;
   private short[] T00U76_A3858BarTroCod ;
   private String[] T00U73_A200BarPieCod ;
   private short[] T00U73_A3858BarTroCod ;
   private java.math.BigDecimal[] T00U73_A3860BarTroMet ;
   private boolean[] T00U73_n3860BarTroMet ;
   private java.math.BigDecimal[] T00U73_A6556BarTroKil ;
   private boolean[] T00U73_n6556BarTroKil ;
   private java.util.Date[] T00U73_A3859BarTroFec ;
   private boolean[] T00U73_n3859BarTroFec ;
   private String[] T00U73_A3862BarTroIden ;
   private boolean[] T00U73_n3862BarTroIden ;
   private byte[] T00U73_A3864BarTroEst ;
   private boolean[] T00U73_n3864BarTroEst ;
   private String[] T00U73_A396EmprCod ;
   private int[] T00U73_A129BarCod ;
   private byte[] T00U73_A132BarCodReo ;
   private String[] T00U73_A130BarCodPar ;
   private String[] T00U77_A396EmprCod ;
   private int[] T00U77_A129BarCod ;
   private byte[] T00U77_A132BarCodReo ;
   private String[] T00U77_A130BarCodPar ;
   private String[] T00U77_A200BarPieCod ;
   private short[] T00U77_A3858BarTroCod ;
   private String[] T00U78_A396EmprCod ;
   private int[] T00U78_A129BarCod ;
   private byte[] T00U78_A132BarCodReo ;
   private String[] T00U78_A130BarCodPar ;
   private String[] T00U78_A200BarPieCod ;
   private short[] T00U78_A3858BarTroCod ;
   private String[] T00U72_A200BarPieCod ;
   private short[] T00U72_A3858BarTroCod ;
   private java.math.BigDecimal[] T00U72_A3860BarTroMet ;
   private boolean[] T00U72_n3860BarTroMet ;
   private java.math.BigDecimal[] T00U72_A6556BarTroKil ;
   private boolean[] T00U72_n6556BarTroKil ;
   private java.util.Date[] T00U72_A3859BarTroFec ;
   private boolean[] T00U72_n3859BarTroFec ;
   private String[] T00U72_A3862BarTroIden ;
   private boolean[] T00U72_n3862BarTroIden ;
   private byte[] T00U72_A3864BarTroEst ;
   private boolean[] T00U72_n3864BarTroEst ;
   private String[] T00U72_A396EmprCod ;
   private int[] T00U72_A129BarCod ;
   private byte[] T00U72_A132BarCodReo ;
   private String[] T00U72_A130BarCodPar ;
   private String[] T00U712_A396EmprCod ;
   private int[] T00U712_A129BarCod ;
   private byte[] T00U712_A132BarCodReo ;
   private String[] T00U712_A130BarCodPar ;
   private String[] T00U712_A200BarPieCod ;
   private short[] T00U712_A3858BarTroCod ;
   private short[] T00U712_A12649TRDefcod ;
   private String[] T00U712_A12650TRFasCod ;
   private String[] T00U713_A396EmprCod ;
   private int[] T00U713_A129BarCod ;
   private byte[] T00U713_A132BarCodReo ;
   private String[] T00U713_A130BarCodPar ;
   private String[] T00U713_A200BarPieCod ;
   private short[] T00U713_A3858BarTroCod ;
   private short[] T00U713_A4993BarTroDef ;
   private String[] T00U714_A396EmprCod ;
   private int[] T00U714_A129BarCod ;
   private byte[] T00U714_A132BarCodReo ;
   private String[] T00U714_A130BarCodPar ;
   private String[] T00U714_A200BarPieCod ;
   private short[] T00U714_A3858BarTroCod ;
   private String[] T00U715_A407EmprNom ;
   private boolean[] T00U715_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thretrz__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thretrz__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thretrz__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thretrz__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thretrz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00U72", "SELECT BarPieCod, BarTroCod, BarTroMet, BarTroKil, BarTroFec, BarTroIden, BarTroEst, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?  FOR UPDATE OF BarTroMet, BarTroKil, BarTroFec, BarTroIden, BarTroEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U73", "SELECT BarPieCod, BarTroCod, BarTroMet, BarTroKil, BarTroFec, BarTroIden, BarTroEst, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U74", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U75", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarPieCod, TM1.BarTroCod, TM1.BarTroMet, TM1.BarTroKil, T2.EmprNom, TM1.BarTroFec, TM1.BarTroIden, TM1.BarTroEst, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPBARTRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? and TM1.BarTroCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod, TM1.BarTroCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U76", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U77", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE ( BarPieCod > ? or BarPieCod = ? and BarTroCod > ?) and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U78", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE ( BarPieCod < ? or BarPieCod = ? and BarTroCod < ?) and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC, BarTroCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U79", "INSERT INTO TXPBARTRO(BarPieCod, BarTroCod, BarTroMet, BarTroKil, BarTroFec, BarTroIden, BarTroEst, EmprCod, BarCod, BarCodReo, BarCodPar, BarTroAnc, AlbTar, BarTroFinP, BarTroCal, BarTroOpeC, BarTroUltD, BarTroJau, BarTroObs, BarTroCarr, BarTroOb, BarTroHor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00U710", "UPDATE TXPBARTRO SET BarTroMet=?, BarTroKil=?, BarTroFec=?, BarTroIden=?, BarTroEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new UpdateCursor("T00U711", "DELETE FROM TXPBARTRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?", GX_NOMASK, "TXPBARTRO")
         ,new ForEachCursor("T00U712", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, TRDefcod, TRFasCod FROM TXPPZTRD0 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U713", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroDef FROM TXPBarTrD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarTroCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U714", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U715", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 15);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               stmt.setString(8, (String)parms[12], 3);
               stmt.setInt(9, ((Number) parms[13]).intValue());
               stmt.setByte(10, ((Number) parms[14]).byteValue());
               stmt.setString(11, (String)parms[15], 1);
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
                  stmt.setString(4, (String)parms[7], 15);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setString(10, (String)parms[14], 9);
               stmt.setShort(11, ((Number) parms[15]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
      }
   }

}

