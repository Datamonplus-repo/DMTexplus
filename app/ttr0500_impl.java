package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0500_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRODUCCION DIARIA TOSA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPdt_dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttr0500_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0500_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0500_impl.class ));
   }

   public ttr0500_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0500.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPdt_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_dia_Internalname, localUtil.format(A10303Pdt_dia, "99/99/99"), localUtil.format( A10303Pdt_dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_dia_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPdt_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPdt_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0500.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_maq_Internalname, GXutil.rtrim( A10304Pdt_maq), GXutil.rtrim( localUtil.format( A10304Pdt_maq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_maq_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_maq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kgs", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10305Pdt_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_kgs_Enabled!=0) ? localUtil.format( A10305Pdt_kgs, "ZZZZZ9.99") : localUtil.format( A10305Pdt_kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_kgs_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Mts", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_mts_Internalname, GXutil.ltrim( localUtil.ntoc( A10306Pdt_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_mts_Enabled!=0) ? localUtil.format( A10306Pdt_mts, "ZZZZZ9.99") : localUtil.format( A10306Pdt_mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_mts_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_pzas_Internalname, GXutil.ltrim( localUtil.ntoc( A10307Pdt_pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_pzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10307Pdt_pzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10307Pdt_pzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_pzas_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_pzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Hmmr", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_hmmr_Internalname, GXutil.ltrim( localUtil.ntoc( A10308Pdt_hmmr, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_hmmr_Enabled!=0) ? localUtil.format( A10308Pdt_hmmr, "ZZZZ9.99") : localUtil.format( A10308Pdt_hmmr, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_hmmr_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_hmmr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Hh Maq Parada", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_hmp_Internalname, GXutil.ltrim( localUtil.ntoc( A10309Pdt_hmp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_hmp_Enabled!=0) ? localUtil.format( A10309Pdt_hmp, "ZZZZZ9.99") : localUtil.format( A10309Pdt_hmp, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_hmp_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_hmp_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Hh Perm Ord", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_hpo_Internalname, GXutil.ltrim( localUtil.ntoc( A10310Pdt_hpo, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_hpo_Enabled!=0) ? localUtil.format( A10310Pdt_hpo, "ZZZZZ9.99") : localUtil.format( A10310Pdt_hpo, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_hpo_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_hpo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Hh Varios", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_Hv_Internalname, GXutil.ltrim( localUtil.ntoc( A10311Pdt_Hv, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_Hv_Enabled!=0) ? localUtil.format( A10311Pdt_Hv, "ZZZZZ9.99") : localUtil.format( A10311Pdt_Hv, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_Hv_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_Hv_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Kgs Mojados", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgM_Internalname, GXutil.ltrim( localUtil.ntoc( A10312Pdt_KgM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgM_Enabled!=0) ? localUtil.format( A10312Pdt_KgM, "ZZZZZ9.99") : localUtil.format( A10312Pdt_KgM, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgM_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgM_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Kilos Blanco", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgB_Internalname, GXutil.ltrim( localUtil.ntoc( A10313Pdt_KgB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgB_Enabled!=0) ? localUtil.format( A10313Pdt_KgB, "ZZZZZ9.99") : localUtil.format( A10313Pdt_KgB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgB_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kgs Reop", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgR_Internalname, GXutil.ltrim( localUtil.ntoc( A10314Pdt_KgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgR_Enabled!=0) ? localUtil.format( A10314Pdt_KgR, "ZZZZZ9.99") : localUtil.format( A10314Pdt_KgR, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgR_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgR_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Kgs Tint Color", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgTC_Internalname, GXutil.ltrim( localUtil.ntoc( A10315Pdt_KgTC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgTC_Enabled!=0) ? localUtil.format( A10315Pdt_KgTC, "ZZZZZ9.99") : localUtil.format( A10315Pdt_KgTC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgTC_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgTC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Kgs Tint Blanco", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgTB_Internalname, GXutil.ltrim( localUtil.ntoc( A10316Pdt_KgTB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgTB_Enabled!=0) ? localUtil.format( A10316Pdt_KgTB, "ZZZZZ9.99") : localUtil.format( A10316Pdt_KgTB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgTB_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgTB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Kgs Acabado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgA_Internalname, GXutil.ltrim( localUtil.ntoc( A10317Pdt_KgA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgA_Enabled!=0) ? localUtil.format( A10317Pdt_KgA, "ZZZZZ9.99") : localUtil.format( A10317Pdt_KgA, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgA_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgA_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Kilos PR", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgPr_Internalname, GXutil.ltrim( localUtil.ntoc( A10318Pdt_KgPr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgPr_Enabled!=0) ? localUtil.format( A10318Pdt_KgPr, "ZZZZZ9.99") : localUtil.format( A10318Pdt_KgPr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgPr_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgPr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Kilos GI", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgGi_Internalname, GXutil.ltrim( localUtil.ntoc( A10319Pdt_KgGi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgGi_Enabled!=0) ? localUtil.format( A10319Pdt_KgGi, "ZZZZZ9.99") : localUtil.format( A10319Pdt_KgGi, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgGi_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgGi_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Kilos DE", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgDe_Internalname, GXutil.ltrim( localUtil.ntoc( A10320Pdt_KgDe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgDe_Enabled!=0) ? localUtil.format( A10320Pdt_KgDe, "ZZZZZ9.99") : localUtil.format( A10320Pdt_KgDe, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgDe_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgDe_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Kgs Coser TINTE", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgCn_Internalname, GXutil.ltrim( localUtil.ntoc( A10321Pdt_KgCn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgCn_Enabled!=0) ? localUtil.format( A10321Pdt_KgCn, "ZZZZZ9.99") : localUtil.format( A10321Pdt_KgCn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgCn_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgCn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Kgs Coser BLANCO", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPdt_KgCj_Internalname, GXutil.ltrim( localUtil.ntoc( A10322Pdt_KgCj, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPdt_KgCj_Enabled!=0) ? localUtil.format( A10322Pdt_KgCj, "ZZZZZ9.99") : localUtil.format( A10322Pdt_KgCj, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPdt_KgCj_Jsonclick, 0, "", "", "", "", "", 1, edtPdt_KgCj_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0500.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0500.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0500.htm");
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
      e1117U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10303Pdt_dia = localUtil.ctod( httpContext.cgiGet( "Z10303Pdt_dia"), 0) ;
            Z10304Pdt_maq = httpContext.cgiGet( "Z10304Pdt_maq") ;
            Z10305Pdt_kgs = localUtil.ctond( httpContext.cgiGet( "Z10305Pdt_kgs")) ;
            Z10306Pdt_mts = localUtil.ctond( httpContext.cgiGet( "Z10306Pdt_mts")) ;
            Z10307Pdt_pzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z10307Pdt_pzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10308Pdt_hmmr = localUtil.ctond( httpContext.cgiGet( "Z10308Pdt_hmmr")) ;
            Z10309Pdt_hmp = localUtil.ctond( httpContext.cgiGet( "Z10309Pdt_hmp")) ;
            Z10310Pdt_hpo = localUtil.ctond( httpContext.cgiGet( "Z10310Pdt_hpo")) ;
            Z10311Pdt_Hv = localUtil.ctond( httpContext.cgiGet( "Z10311Pdt_Hv")) ;
            Z10312Pdt_KgM = localUtil.ctond( httpContext.cgiGet( "Z10312Pdt_KgM")) ;
            Z10313Pdt_KgB = localUtil.ctond( httpContext.cgiGet( "Z10313Pdt_KgB")) ;
            Z10314Pdt_KgR = localUtil.ctond( httpContext.cgiGet( "Z10314Pdt_KgR")) ;
            Z10315Pdt_KgTC = localUtil.ctond( httpContext.cgiGet( "Z10315Pdt_KgTC")) ;
            Z10316Pdt_KgTB = localUtil.ctond( httpContext.cgiGet( "Z10316Pdt_KgTB")) ;
            Z10317Pdt_KgA = localUtil.ctond( httpContext.cgiGet( "Z10317Pdt_KgA")) ;
            Z10318Pdt_KgPr = localUtil.ctond( httpContext.cgiGet( "Z10318Pdt_KgPr")) ;
            Z10319Pdt_KgGi = localUtil.ctond( httpContext.cgiGet( "Z10319Pdt_KgGi")) ;
            Z10320Pdt_KgDe = localUtil.ctond( httpContext.cgiGet( "Z10320Pdt_KgDe")) ;
            Z10321Pdt_KgCn = localUtil.ctond( httpContext.cgiGet( "Z10321Pdt_KgCn")) ;
            Z10322Pdt_KgCj = localUtil.ctond( httpContext.cgiGet( "Z10322Pdt_KgCj")) ;
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
            if ( localUtil.vcdate( httpContext.cgiGet( edtPdt_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PDT_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10303Pdt_dia = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
            }
            else
            {
               A10303Pdt_dia = localUtil.ctod( httpContext.cgiGet( edtPdt_dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
            }
            A10304Pdt_maq = httpContext.cgiGet( edtPdt_maq_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_kgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10305Pdt_kgs = DecimalUtil.ZERO ;
               n10305Pdt_kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrimstr( A10305Pdt_kgs, 9, 2));
            }
            else
            {
               A10305Pdt_kgs = localUtil.ctond( httpContext.cgiGet( edtPdt_kgs_Internalname)) ;
               n10305Pdt_kgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrimstr( A10305Pdt_kgs, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_MTS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_mts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10306Pdt_mts = DecimalUtil.ZERO ;
               n10306Pdt_mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrimstr( A10306Pdt_mts, 9, 2));
            }
            else
            {
               A10306Pdt_mts = localUtil.ctond( httpContext.cgiGet( edtPdt_mts_Internalname)) ;
               n10306Pdt_mts = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrimstr( A10306Pdt_mts, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPdt_pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPdt_pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_PZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_pzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10307Pdt_pzas = 0 ;
               n10307Pdt_pzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10307Pdt_pzas), 6, 0));
            }
            else
            {
               A10307Pdt_pzas = (int)(localUtil.ctol( httpContext.cgiGet( edtPdt_pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10307Pdt_pzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10307Pdt_pzas), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_hmmr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_hmmr_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_HMMR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_hmmr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10308Pdt_hmmr = DecimalUtil.ZERO ;
               n10308Pdt_hmmr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrimstr( A10308Pdt_hmmr, 8, 2));
            }
            else
            {
               A10308Pdt_hmmr = localUtil.ctond( httpContext.cgiGet( edtPdt_hmmr_Internalname)) ;
               n10308Pdt_hmmr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrimstr( A10308Pdt_hmmr, 8, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_hmp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_hmp_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_HMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_hmp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10309Pdt_hmp = DecimalUtil.ZERO ;
               n10309Pdt_hmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrimstr( A10309Pdt_hmp, 9, 2));
            }
            else
            {
               A10309Pdt_hmp = localUtil.ctond( httpContext.cgiGet( edtPdt_hmp_Internalname)) ;
               n10309Pdt_hmp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrimstr( A10309Pdt_hmp, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_hpo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_hpo_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_HPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_hpo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10310Pdt_hpo = DecimalUtil.ZERO ;
               n10310Pdt_hpo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrimstr( A10310Pdt_hpo, 9, 2));
            }
            else
            {
               A10310Pdt_hpo = localUtil.ctond( httpContext.cgiGet( edtPdt_hpo_Internalname)) ;
               n10310Pdt_hpo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrimstr( A10310Pdt_hpo, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_Hv_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_Hv_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_HV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_Hv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10311Pdt_Hv = DecimalUtil.ZERO ;
               n10311Pdt_Hv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrimstr( A10311Pdt_Hv, 9, 2));
            }
            else
            {
               A10311Pdt_Hv = localUtil.ctond( httpContext.cgiGet( edtPdt_Hv_Internalname)) ;
               n10311Pdt_Hv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrimstr( A10311Pdt_Hv, 9, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgM_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10312Pdt_KgM = DecimalUtil.ZERO ;
               n10312Pdt_KgM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrimstr( A10312Pdt_KgM, 9, 2));
            }
            else
            {
               A10312Pdt_KgM = localUtil.ctond( httpContext.cgiGet( edtPdt_KgM_Internalname)) ;
               n10312Pdt_KgM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrimstr( A10312Pdt_KgM, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10313Pdt_KgB = DecimalUtil.ZERO ;
               n10313Pdt_KgB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrimstr( A10313Pdt_KgB, 9, 2));
            }
            else
            {
               A10313Pdt_KgB = localUtil.ctond( httpContext.cgiGet( edtPdt_KgB_Internalname)) ;
               n10313Pdt_KgB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrimstr( A10313Pdt_KgB, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10314Pdt_KgR = DecimalUtil.ZERO ;
               n10314Pdt_KgR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrimstr( A10314Pdt_KgR, 9, 2));
            }
            else
            {
               A10314Pdt_KgR = localUtil.ctond( httpContext.cgiGet( edtPdt_KgR_Internalname)) ;
               n10314Pdt_KgR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrimstr( A10314Pdt_KgR, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgTC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgTC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGTC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgTC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10315Pdt_KgTC = DecimalUtil.ZERO ;
               n10315Pdt_KgTC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrimstr( A10315Pdt_KgTC, 9, 2));
            }
            else
            {
               A10315Pdt_KgTC = localUtil.ctond( httpContext.cgiGet( edtPdt_KgTC_Internalname)) ;
               n10315Pdt_KgTC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrimstr( A10315Pdt_KgTC, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgTB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgTB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGTB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgTB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10316Pdt_KgTB = DecimalUtil.ZERO ;
               n10316Pdt_KgTB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrimstr( A10316Pdt_KgTB, 9, 2));
            }
            else
            {
               A10316Pdt_KgTB = localUtil.ctond( httpContext.cgiGet( edtPdt_KgTB_Internalname)) ;
               n10316Pdt_KgTB = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrimstr( A10316Pdt_KgTB, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgA_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10317Pdt_KgA = DecimalUtil.ZERO ;
               n10317Pdt_KgA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrimstr( A10317Pdt_KgA, 9, 2));
            }
            else
            {
               A10317Pdt_KgA = localUtil.ctond( httpContext.cgiGet( edtPdt_KgA_Internalname)) ;
               n10317Pdt_KgA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrimstr( A10317Pdt_KgA, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgPr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgPr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGPR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgPr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10318Pdt_KgPr = DecimalUtil.ZERO ;
               n10318Pdt_KgPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrimstr( A10318Pdt_KgPr, 9, 2));
            }
            else
            {
               A10318Pdt_KgPr = localUtil.ctond( httpContext.cgiGet( edtPdt_KgPr_Internalname)) ;
               n10318Pdt_KgPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrimstr( A10318Pdt_KgPr, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgGi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgGi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGGI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgGi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10319Pdt_KgGi = DecimalUtil.ZERO ;
               n10319Pdt_KgGi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrimstr( A10319Pdt_KgGi, 9, 2));
            }
            else
            {
               A10319Pdt_KgGi = localUtil.ctond( httpContext.cgiGet( edtPdt_KgGi_Internalname)) ;
               n10319Pdt_KgGi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrimstr( A10319Pdt_KgGi, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgDe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgDe_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGDE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgDe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10320Pdt_KgDe = DecimalUtil.ZERO ;
               n10320Pdt_KgDe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrimstr( A10320Pdt_KgDe, 9, 2));
            }
            else
            {
               A10320Pdt_KgDe = localUtil.ctond( httpContext.cgiGet( edtPdt_KgDe_Internalname)) ;
               n10320Pdt_KgDe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrimstr( A10320Pdt_KgDe, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgCn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgCn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGCN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgCn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10321Pdt_KgCn = DecimalUtil.ZERO ;
               n10321Pdt_KgCn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrimstr( A10321Pdt_KgCn, 9, 2));
            }
            else
            {
               A10321Pdt_KgCn = localUtil.ctond( httpContext.cgiGet( edtPdt_KgCn_Internalname)) ;
               n10321Pdt_KgCn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrimstr( A10321Pdt_KgCn, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPdt_KgCj_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPdt_KgCj_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PDT_KGCJ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPdt_KgCj_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10322Pdt_KgCj = DecimalUtil.ZERO ;
               n10322Pdt_KgCj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrimstr( A10322Pdt_KgCj, 9, 2));
            }
            else
            {
               A10322Pdt_KgCj = localUtil.ctond( httpContext.cgiGet( edtPdt_KgCj_Internalname)) ;
               n10322Pdt_KgCj = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrimstr( A10322Pdt_KgCj, 9, 2));
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
               A10303Pdt_dia = localUtil.parseDateParm( httpContext.GetPar( "Pdt_dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
               A10304Pdt_maq = httpContext.GetPar( "Pdt_maq") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
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
                        e1117U2 ();
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
            initAll17U1400( ) ;
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
      disableAttributes17U1400( ) ;
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

   public void confirm_17U0( )
   {
      beforeValidate17U1400( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17U1400( ) ;
         }
         else
         {
            checkExtendedTable17U1400( ) ;
            if ( AnyError == 0 )
            {
               zm17U1400( 3) ;
            }
            closeExtendedTableCursors17U1400( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17U0( ) ;
      }
   }

   public void resetCaption17U0( )
   {
   }

   public void e1117U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0500_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr0500_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0500_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0500_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0500_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0500_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17U1400( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10305Pdt_kgs = T017U3_A10305Pdt_kgs[0] ;
            Z10306Pdt_mts = T017U3_A10306Pdt_mts[0] ;
            Z10307Pdt_pzas = T017U3_A10307Pdt_pzas[0] ;
            Z10308Pdt_hmmr = T017U3_A10308Pdt_hmmr[0] ;
            Z10309Pdt_hmp = T017U3_A10309Pdt_hmp[0] ;
            Z10310Pdt_hpo = T017U3_A10310Pdt_hpo[0] ;
            Z10311Pdt_Hv = T017U3_A10311Pdt_Hv[0] ;
            Z10312Pdt_KgM = T017U3_A10312Pdt_KgM[0] ;
            Z10313Pdt_KgB = T017U3_A10313Pdt_KgB[0] ;
            Z10314Pdt_KgR = T017U3_A10314Pdt_KgR[0] ;
            Z10315Pdt_KgTC = T017U3_A10315Pdt_KgTC[0] ;
            Z10316Pdt_KgTB = T017U3_A10316Pdt_KgTB[0] ;
            Z10317Pdt_KgA = T017U3_A10317Pdt_KgA[0] ;
            Z10318Pdt_KgPr = T017U3_A10318Pdt_KgPr[0] ;
            Z10319Pdt_KgGi = T017U3_A10319Pdt_KgGi[0] ;
            Z10320Pdt_KgDe = T017U3_A10320Pdt_KgDe[0] ;
            Z10321Pdt_KgCn = T017U3_A10321Pdt_KgCn[0] ;
            Z10322Pdt_KgCj = T017U3_A10322Pdt_KgCj[0] ;
         }
         else
         {
            Z10305Pdt_kgs = A10305Pdt_kgs ;
            Z10306Pdt_mts = A10306Pdt_mts ;
            Z10307Pdt_pzas = A10307Pdt_pzas ;
            Z10308Pdt_hmmr = A10308Pdt_hmmr ;
            Z10309Pdt_hmp = A10309Pdt_hmp ;
            Z10310Pdt_hpo = A10310Pdt_hpo ;
            Z10311Pdt_Hv = A10311Pdt_Hv ;
            Z10312Pdt_KgM = A10312Pdt_KgM ;
            Z10313Pdt_KgB = A10313Pdt_KgB ;
            Z10314Pdt_KgR = A10314Pdt_KgR ;
            Z10315Pdt_KgTC = A10315Pdt_KgTC ;
            Z10316Pdt_KgTB = A10316Pdt_KgTB ;
            Z10317Pdt_KgA = A10317Pdt_KgA ;
            Z10318Pdt_KgPr = A10318Pdt_KgPr ;
            Z10319Pdt_KgGi = A10319Pdt_KgGi ;
            Z10320Pdt_KgDe = A10320Pdt_KgDe ;
            Z10321Pdt_KgCn = A10321Pdt_KgCn ;
            Z10322Pdt_KgCj = A10322Pdt_KgCj ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z10303Pdt_dia = A10303Pdt_dia ;
         Z10304Pdt_maq = A10304Pdt_maq ;
         Z10305Pdt_kgs = A10305Pdt_kgs ;
         Z10306Pdt_mts = A10306Pdt_mts ;
         Z10307Pdt_pzas = A10307Pdt_pzas ;
         Z10308Pdt_hmmr = A10308Pdt_hmmr ;
         Z10309Pdt_hmp = A10309Pdt_hmp ;
         Z10310Pdt_hpo = A10310Pdt_hpo ;
         Z10311Pdt_Hv = A10311Pdt_Hv ;
         Z10312Pdt_KgM = A10312Pdt_KgM ;
         Z10313Pdt_KgB = A10313Pdt_KgB ;
         Z10314Pdt_KgR = A10314Pdt_KgR ;
         Z10315Pdt_KgTC = A10315Pdt_KgTC ;
         Z10316Pdt_KgTB = A10316Pdt_KgTB ;
         Z10317Pdt_KgA = A10317Pdt_KgA ;
         Z10318Pdt_KgPr = A10318Pdt_KgPr ;
         Z10319Pdt_KgGi = A10319Pdt_KgGi ;
         Z10320Pdt_KgDe = A10320Pdt_KgDe ;
         Z10321Pdt_KgCn = A10321Pdt_KgCn ;
         Z10322Pdt_KgCj = A10322Pdt_KgCj ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR0500" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T017U4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017U4_A407EmprNom[0] ;
      n407EmprNom = T017U4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  || isIns( )  || isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
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

   public void load17U1400( )
   {
      /* Using cursor T017U5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1400 = (short)(1) ;
         A407EmprNom = T017U5_A407EmprNom[0] ;
         n407EmprNom = T017U5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10305Pdt_kgs = T017U5_A10305Pdt_kgs[0] ;
         n10305Pdt_kgs = T017U5_n10305Pdt_kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrimstr( A10305Pdt_kgs, 9, 2));
         A10306Pdt_mts = T017U5_A10306Pdt_mts[0] ;
         n10306Pdt_mts = T017U5_n10306Pdt_mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrimstr( A10306Pdt_mts, 9, 2));
         A10307Pdt_pzas = T017U5_A10307Pdt_pzas[0] ;
         n10307Pdt_pzas = T017U5_n10307Pdt_pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10307Pdt_pzas), 6, 0));
         A10308Pdt_hmmr = T017U5_A10308Pdt_hmmr[0] ;
         n10308Pdt_hmmr = T017U5_n10308Pdt_hmmr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrimstr( A10308Pdt_hmmr, 8, 2));
         A10309Pdt_hmp = T017U5_A10309Pdt_hmp[0] ;
         n10309Pdt_hmp = T017U5_n10309Pdt_hmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrimstr( A10309Pdt_hmp, 9, 2));
         A10310Pdt_hpo = T017U5_A10310Pdt_hpo[0] ;
         n10310Pdt_hpo = T017U5_n10310Pdt_hpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrimstr( A10310Pdt_hpo, 9, 2));
         A10311Pdt_Hv = T017U5_A10311Pdt_Hv[0] ;
         n10311Pdt_Hv = T017U5_n10311Pdt_Hv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrimstr( A10311Pdt_Hv, 9, 2));
         A10312Pdt_KgM = T017U5_A10312Pdt_KgM[0] ;
         n10312Pdt_KgM = T017U5_n10312Pdt_KgM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrimstr( A10312Pdt_KgM, 9, 2));
         A10313Pdt_KgB = T017U5_A10313Pdt_KgB[0] ;
         n10313Pdt_KgB = T017U5_n10313Pdt_KgB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrimstr( A10313Pdt_KgB, 9, 2));
         A10314Pdt_KgR = T017U5_A10314Pdt_KgR[0] ;
         n10314Pdt_KgR = T017U5_n10314Pdt_KgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrimstr( A10314Pdt_KgR, 9, 2));
         A10315Pdt_KgTC = T017U5_A10315Pdt_KgTC[0] ;
         n10315Pdt_KgTC = T017U5_n10315Pdt_KgTC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrimstr( A10315Pdt_KgTC, 9, 2));
         A10316Pdt_KgTB = T017U5_A10316Pdt_KgTB[0] ;
         n10316Pdt_KgTB = T017U5_n10316Pdt_KgTB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrimstr( A10316Pdt_KgTB, 9, 2));
         A10317Pdt_KgA = T017U5_A10317Pdt_KgA[0] ;
         n10317Pdt_KgA = T017U5_n10317Pdt_KgA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrimstr( A10317Pdt_KgA, 9, 2));
         A10318Pdt_KgPr = T017U5_A10318Pdt_KgPr[0] ;
         n10318Pdt_KgPr = T017U5_n10318Pdt_KgPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrimstr( A10318Pdt_KgPr, 9, 2));
         A10319Pdt_KgGi = T017U5_A10319Pdt_KgGi[0] ;
         n10319Pdt_KgGi = T017U5_n10319Pdt_KgGi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrimstr( A10319Pdt_KgGi, 9, 2));
         A10320Pdt_KgDe = T017U5_A10320Pdt_KgDe[0] ;
         n10320Pdt_KgDe = T017U5_n10320Pdt_KgDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrimstr( A10320Pdt_KgDe, 9, 2));
         A10321Pdt_KgCn = T017U5_A10321Pdt_KgCn[0] ;
         n10321Pdt_KgCn = T017U5_n10321Pdt_KgCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrimstr( A10321Pdt_KgCn, 9, 2));
         A10322Pdt_KgCj = T017U5_A10322Pdt_KgCj[0] ;
         n10322Pdt_KgCj = T017U5_n10322Pdt_KgCj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrimstr( A10322Pdt_KgCj, 9, 2));
         zm17U1400( -2) ;
      }
      pr_default.close(3);
      onLoadActions17U1400( ) ;
   }

   public void onLoadActions17U1400( )
   {
   }

   public void checkExtendedTable17U1400( )
   {
      nIsDirty_1400 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17U1400( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17U1400( )
   {
      /* Using cursor T017U6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1400 = (short)(1) ;
      }
      else
      {
         RcdFound1400 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017U3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017U3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17U1400( 2) ;
         RcdFound1400 = (short)(1) ;
         A10303Pdt_dia = T017U3_A10303Pdt_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
         A10304Pdt_maq = T017U3_A10304Pdt_maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
         A10305Pdt_kgs = T017U3_A10305Pdt_kgs[0] ;
         n10305Pdt_kgs = T017U3_n10305Pdt_kgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrimstr( A10305Pdt_kgs, 9, 2));
         A10306Pdt_mts = T017U3_A10306Pdt_mts[0] ;
         n10306Pdt_mts = T017U3_n10306Pdt_mts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrimstr( A10306Pdt_mts, 9, 2));
         A10307Pdt_pzas = T017U3_A10307Pdt_pzas[0] ;
         n10307Pdt_pzas = T017U3_n10307Pdt_pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10307Pdt_pzas), 6, 0));
         A10308Pdt_hmmr = T017U3_A10308Pdt_hmmr[0] ;
         n10308Pdt_hmmr = T017U3_n10308Pdt_hmmr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrimstr( A10308Pdt_hmmr, 8, 2));
         A10309Pdt_hmp = T017U3_A10309Pdt_hmp[0] ;
         n10309Pdt_hmp = T017U3_n10309Pdt_hmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrimstr( A10309Pdt_hmp, 9, 2));
         A10310Pdt_hpo = T017U3_A10310Pdt_hpo[0] ;
         n10310Pdt_hpo = T017U3_n10310Pdt_hpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrimstr( A10310Pdt_hpo, 9, 2));
         A10311Pdt_Hv = T017U3_A10311Pdt_Hv[0] ;
         n10311Pdt_Hv = T017U3_n10311Pdt_Hv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrimstr( A10311Pdt_Hv, 9, 2));
         A10312Pdt_KgM = T017U3_A10312Pdt_KgM[0] ;
         n10312Pdt_KgM = T017U3_n10312Pdt_KgM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrimstr( A10312Pdt_KgM, 9, 2));
         A10313Pdt_KgB = T017U3_A10313Pdt_KgB[0] ;
         n10313Pdt_KgB = T017U3_n10313Pdt_KgB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrimstr( A10313Pdt_KgB, 9, 2));
         A10314Pdt_KgR = T017U3_A10314Pdt_KgR[0] ;
         n10314Pdt_KgR = T017U3_n10314Pdt_KgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrimstr( A10314Pdt_KgR, 9, 2));
         A10315Pdt_KgTC = T017U3_A10315Pdt_KgTC[0] ;
         n10315Pdt_KgTC = T017U3_n10315Pdt_KgTC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrimstr( A10315Pdt_KgTC, 9, 2));
         A10316Pdt_KgTB = T017U3_A10316Pdt_KgTB[0] ;
         n10316Pdt_KgTB = T017U3_n10316Pdt_KgTB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrimstr( A10316Pdt_KgTB, 9, 2));
         A10317Pdt_KgA = T017U3_A10317Pdt_KgA[0] ;
         n10317Pdt_KgA = T017U3_n10317Pdt_KgA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrimstr( A10317Pdt_KgA, 9, 2));
         A10318Pdt_KgPr = T017U3_A10318Pdt_KgPr[0] ;
         n10318Pdt_KgPr = T017U3_n10318Pdt_KgPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrimstr( A10318Pdt_KgPr, 9, 2));
         A10319Pdt_KgGi = T017U3_A10319Pdt_KgGi[0] ;
         n10319Pdt_KgGi = T017U3_n10319Pdt_KgGi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrimstr( A10319Pdt_KgGi, 9, 2));
         A10320Pdt_KgDe = T017U3_A10320Pdt_KgDe[0] ;
         n10320Pdt_KgDe = T017U3_n10320Pdt_KgDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrimstr( A10320Pdt_KgDe, 9, 2));
         A10321Pdt_KgCn = T017U3_A10321Pdt_KgCn[0] ;
         n10321Pdt_KgCn = T017U3_n10321Pdt_KgCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrimstr( A10321Pdt_KgCn, 9, 2));
         A10322Pdt_KgCj = T017U3_A10322Pdt_KgCj[0] ;
         n10322Pdt_KgCj = T017U3_n10322Pdt_KgCj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrimstr( A10322Pdt_KgCj, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z10303Pdt_dia = A10303Pdt_dia ;
         Z10304Pdt_maq = A10304Pdt_maq ;
         sMode1400 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17U1400( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1400 = (short)(0) ;
            initializeNonKey17U1400( ) ;
         }
         Gx_mode = sMode1400 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1400 = (short)(0) ;
         initializeNonKey17U1400( ) ;
         sMode1400 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1400 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17U1400( ) ;
      if ( RcdFound1400 == 0 )
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
      RcdFound1400 = (short)(0) ;
      /* Using cursor T017U7 */
      pr_default.execute(5, new Object[] {A10303Pdt_dia, A10303Pdt_dia, A10304Pdt_maq, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.resetTime(T017U7_A10303Pdt_dia[0]).before( GXutil.resetTime( A10303Pdt_dia )) || GXutil.dateCompare(GXutil.resetTime(T017U7_A10303Pdt_dia[0]), GXutil.resetTime(A10303Pdt_dia)) && ( GXutil.strcmp(T017U7_A10304Pdt_maq[0], A10304Pdt_maq) < 0 ) ) && ( GXutil.strcmp(T017U7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( GXutil.resetTime(T017U7_A10303Pdt_dia[0]).after( GXutil.resetTime( A10303Pdt_dia )) || GXutil.dateCompare(GXutil.resetTime(T017U7_A10303Pdt_dia[0]), GXutil.resetTime(A10303Pdt_dia)) && ( GXutil.strcmp(T017U7_A10304Pdt_maq[0], A10304Pdt_maq) > 0 ) ) && ( GXutil.strcmp(T017U7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10303Pdt_dia = T017U7_A10303Pdt_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
            A10304Pdt_maq = T017U7_A10304Pdt_maq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
            RcdFound1400 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1400 = (short)(0) ;
      /* Using cursor T017U8 */
      pr_default.execute(6, new Object[] {A10303Pdt_dia, A10303Pdt_dia, A10304Pdt_maq, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.resetTime(T017U8_A10303Pdt_dia[0]).after( GXutil.resetTime( A10303Pdt_dia )) || GXutil.dateCompare(GXutil.resetTime(T017U8_A10303Pdt_dia[0]), GXutil.resetTime(A10303Pdt_dia)) && ( GXutil.strcmp(T017U8_A10304Pdt_maq[0], A10304Pdt_maq) > 0 ) ) && ( GXutil.strcmp(T017U8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.resetTime(T017U8_A10303Pdt_dia[0]).before( GXutil.resetTime( A10303Pdt_dia )) || GXutil.dateCompare(GXutil.resetTime(T017U8_A10303Pdt_dia[0]), GXutil.resetTime(A10303Pdt_dia)) && ( GXutil.strcmp(T017U8_A10304Pdt_maq[0], A10304Pdt_maq) < 0 ) ) && ( GXutil.strcmp(T017U8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10303Pdt_dia = T017U8_A10303Pdt_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
            A10304Pdt_maq = T017U8_A10304Pdt_maq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
            RcdFound1400 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17U1400( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPdt_dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17U1400( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1400 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10303Pdt_dia), GXutil.resetTime(Z10303Pdt_dia)) ) || ( GXutil.strcmp(A10304Pdt_maq, Z10304Pdt_maq) != 0 ) )
            {
               A10303Pdt_dia = Z10303Pdt_dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
               A10304Pdt_maq = Z10304Pdt_maq ;
               httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPdt_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17U1400( ) ;
               GX_FocusControl = edtPdt_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10303Pdt_dia), GXutil.resetTime(Z10303Pdt_dia)) ) || ( GXutil.strcmp(A10304Pdt_maq, Z10304Pdt_maq) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPdt_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17U1400( ) ;
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
                  GX_FocusControl = edtPdt_dia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17U1400( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10303Pdt_dia), GXutil.resetTime(Z10303Pdt_dia)) ) || ( GXutil.strcmp(A10304Pdt_maq, Z10304Pdt_maq) != 0 ) )
      {
         A10303Pdt_dia = Z10303Pdt_dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
         A10304Pdt_maq = Z10304Pdt_maq ;
         httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPdt_dia_Internalname ;
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
      getKey17U1400( ) ;
      if ( RcdFound1400 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10303Pdt_dia), GXutil.resetTime(Z10303Pdt_dia)) ) || ( GXutil.strcmp(A10304Pdt_maq, Z10304Pdt_maq) != 0 ) )
         {
            A10303Pdt_dia = Z10303Pdt_dia ;
            httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
            A10304Pdt_maq = Z10304Pdt_maq ;
            httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10303Pdt_dia), GXutil.resetTime(Z10303Pdt_dia)) ) || ( GXutil.strcmp(A10304Pdt_maq, Z10304Pdt_maq) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0500");
      GX_FocusControl = edtPdt_kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17U0( ) ;
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
      if ( RcdFound1400 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPdt_kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17U1400( ) ;
      if ( RcdFound1400 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPdt_kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17U1400( ) ;
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
      if ( RcdFound1400 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPdt_kgs_Internalname ;
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
      if ( RcdFound1400 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPdt_kgs_Internalname ;
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
      scanStart17U1400( ) ;
      if ( RcdFound1400 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1400 != 0 )
         {
            scanNext17U1400( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPdt_kgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17U1400( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17U1400( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017U2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0500"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10305Pdt_kgs, T017U2_A10305Pdt_kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10306Pdt_mts, T017U2_A10306Pdt_mts[0]) != 0 ) || ( Z10307Pdt_pzas != T017U2_A10307Pdt_pzas[0] ) || ( DecimalUtil.compareTo(Z10308Pdt_hmmr, T017U2_A10308Pdt_hmmr[0]) != 0 ) || ( DecimalUtil.compareTo(Z10309Pdt_hmp, T017U2_A10309Pdt_hmp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10310Pdt_hpo, T017U2_A10310Pdt_hpo[0]) != 0 ) || ( DecimalUtil.compareTo(Z10311Pdt_Hv, T017U2_A10311Pdt_Hv[0]) != 0 ) || ( DecimalUtil.compareTo(Z10312Pdt_KgM, T017U2_A10312Pdt_KgM[0]) != 0 ) || ( DecimalUtil.compareTo(Z10313Pdt_KgB, T017U2_A10313Pdt_KgB[0]) != 0 ) || ( DecimalUtil.compareTo(Z10314Pdt_KgR, T017U2_A10314Pdt_KgR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10315Pdt_KgTC, T017U2_A10315Pdt_KgTC[0]) != 0 ) || ( DecimalUtil.compareTo(Z10316Pdt_KgTB, T017U2_A10316Pdt_KgTB[0]) != 0 ) || ( DecimalUtil.compareTo(Z10317Pdt_KgA, T017U2_A10317Pdt_KgA[0]) != 0 ) || ( DecimalUtil.compareTo(Z10318Pdt_KgPr, T017U2_A10318Pdt_KgPr[0]) != 0 ) || ( DecimalUtil.compareTo(Z10319Pdt_KgGi, T017U2_A10319Pdt_KgGi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10320Pdt_KgDe, T017U2_A10320Pdt_KgDe[0]) != 0 ) || ( DecimalUtil.compareTo(Z10321Pdt_KgCn, T017U2_A10321Pdt_KgCn[0]) != 0 ) || ( DecimalUtil.compareTo(Z10322Pdt_KgCj, T017U2_A10322Pdt_KgCj[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10305Pdt_kgs, T017U2_A10305Pdt_kgs[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_kgs");
               GXutil.writeLogRaw("Old: ",Z10305Pdt_kgs);
               GXutil.writeLogRaw("Current: ",T017U2_A10305Pdt_kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z10306Pdt_mts, T017U2_A10306Pdt_mts[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_mts");
               GXutil.writeLogRaw("Old: ",Z10306Pdt_mts);
               GXutil.writeLogRaw("Current: ",T017U2_A10306Pdt_mts[0]);
            }
            if ( Z10307Pdt_pzas != T017U2_A10307Pdt_pzas[0] )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_pzas");
               GXutil.writeLogRaw("Old: ",Z10307Pdt_pzas);
               GXutil.writeLogRaw("Current: ",T017U2_A10307Pdt_pzas[0]);
            }
            if ( DecimalUtil.compareTo(Z10308Pdt_hmmr, T017U2_A10308Pdt_hmmr[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_hmmr");
               GXutil.writeLogRaw("Old: ",Z10308Pdt_hmmr);
               GXutil.writeLogRaw("Current: ",T017U2_A10308Pdt_hmmr[0]);
            }
            if ( DecimalUtil.compareTo(Z10309Pdt_hmp, T017U2_A10309Pdt_hmp[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_hmp");
               GXutil.writeLogRaw("Old: ",Z10309Pdt_hmp);
               GXutil.writeLogRaw("Current: ",T017U2_A10309Pdt_hmp[0]);
            }
            if ( DecimalUtil.compareTo(Z10310Pdt_hpo, T017U2_A10310Pdt_hpo[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_hpo");
               GXutil.writeLogRaw("Old: ",Z10310Pdt_hpo);
               GXutil.writeLogRaw("Current: ",T017U2_A10310Pdt_hpo[0]);
            }
            if ( DecimalUtil.compareTo(Z10311Pdt_Hv, T017U2_A10311Pdt_Hv[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_Hv");
               GXutil.writeLogRaw("Old: ",Z10311Pdt_Hv);
               GXutil.writeLogRaw("Current: ",T017U2_A10311Pdt_Hv[0]);
            }
            if ( DecimalUtil.compareTo(Z10312Pdt_KgM, T017U2_A10312Pdt_KgM[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgM");
               GXutil.writeLogRaw("Old: ",Z10312Pdt_KgM);
               GXutil.writeLogRaw("Current: ",T017U2_A10312Pdt_KgM[0]);
            }
            if ( DecimalUtil.compareTo(Z10313Pdt_KgB, T017U2_A10313Pdt_KgB[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgB");
               GXutil.writeLogRaw("Old: ",Z10313Pdt_KgB);
               GXutil.writeLogRaw("Current: ",T017U2_A10313Pdt_KgB[0]);
            }
            if ( DecimalUtil.compareTo(Z10314Pdt_KgR, T017U2_A10314Pdt_KgR[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgR");
               GXutil.writeLogRaw("Old: ",Z10314Pdt_KgR);
               GXutil.writeLogRaw("Current: ",T017U2_A10314Pdt_KgR[0]);
            }
            if ( DecimalUtil.compareTo(Z10315Pdt_KgTC, T017U2_A10315Pdt_KgTC[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgTC");
               GXutil.writeLogRaw("Old: ",Z10315Pdt_KgTC);
               GXutil.writeLogRaw("Current: ",T017U2_A10315Pdt_KgTC[0]);
            }
            if ( DecimalUtil.compareTo(Z10316Pdt_KgTB, T017U2_A10316Pdt_KgTB[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgTB");
               GXutil.writeLogRaw("Old: ",Z10316Pdt_KgTB);
               GXutil.writeLogRaw("Current: ",T017U2_A10316Pdt_KgTB[0]);
            }
            if ( DecimalUtil.compareTo(Z10317Pdt_KgA, T017U2_A10317Pdt_KgA[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgA");
               GXutil.writeLogRaw("Old: ",Z10317Pdt_KgA);
               GXutil.writeLogRaw("Current: ",T017U2_A10317Pdt_KgA[0]);
            }
            if ( DecimalUtil.compareTo(Z10318Pdt_KgPr, T017U2_A10318Pdt_KgPr[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgPr");
               GXutil.writeLogRaw("Old: ",Z10318Pdt_KgPr);
               GXutil.writeLogRaw("Current: ",T017U2_A10318Pdt_KgPr[0]);
            }
            if ( DecimalUtil.compareTo(Z10319Pdt_KgGi, T017U2_A10319Pdt_KgGi[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgGi");
               GXutil.writeLogRaw("Old: ",Z10319Pdt_KgGi);
               GXutil.writeLogRaw("Current: ",T017U2_A10319Pdt_KgGi[0]);
            }
            if ( DecimalUtil.compareTo(Z10320Pdt_KgDe, T017U2_A10320Pdt_KgDe[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgDe");
               GXutil.writeLogRaw("Old: ",Z10320Pdt_KgDe);
               GXutil.writeLogRaw("Current: ",T017U2_A10320Pdt_KgDe[0]);
            }
            if ( DecimalUtil.compareTo(Z10321Pdt_KgCn, T017U2_A10321Pdt_KgCn[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgCn");
               GXutil.writeLogRaw("Old: ",Z10321Pdt_KgCn);
               GXutil.writeLogRaw("Current: ",T017U2_A10321Pdt_KgCn[0]);
            }
            if ( DecimalUtil.compareTo(Z10322Pdt_KgCj, T017U2_A10322Pdt_KgCj[0]) != 0 )
            {
               GXutil.writeLogln("ttr0500:[seudo value changed for attri]"+"Pdt_KgCj");
               GXutil.writeLogRaw("Old: ",Z10322Pdt_KgCj);
               GXutil.writeLogRaw("Current: ",T017U2_A10322Pdt_KgCj[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0500"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17U1400( )
   {
      beforeValidate17U1400( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17U1400( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17U1400( 0) ;
         checkOptimisticConcurrency17U1400( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17U1400( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17U1400( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017U9 */
                  pr_default.execute(7, new Object[] {A10303Pdt_dia, A10304Pdt_maq, Boolean.valueOf(n10305Pdt_kgs), A10305Pdt_kgs, Boolean.valueOf(n10306Pdt_mts), A10306Pdt_mts, Boolean.valueOf(n10307Pdt_pzas), Integer.valueOf(A10307Pdt_pzas), Boolean.valueOf(n10308Pdt_hmmr), A10308Pdt_hmmr, Boolean.valueOf(n10309Pdt_hmp), A10309Pdt_hmp, Boolean.valueOf(n10310Pdt_hpo), A10310Pdt_hpo, Boolean.valueOf(n10311Pdt_Hv), A10311Pdt_Hv, Boolean.valueOf(n10312Pdt_KgM), A10312Pdt_KgM, Boolean.valueOf(n10313Pdt_KgB), A10313Pdt_KgB, Boolean.valueOf(n10314Pdt_KgR), A10314Pdt_KgR, Boolean.valueOf(n10315Pdt_KgTC), A10315Pdt_KgTC, Boolean.valueOf(n10316Pdt_KgTB), A10316Pdt_KgTB, Boolean.valueOf(n10317Pdt_KgA), A10317Pdt_KgA, Boolean.valueOf(n10318Pdt_KgPr), A10318Pdt_KgPr, Boolean.valueOf(n10319Pdt_KgGi), A10319Pdt_KgGi, Boolean.valueOf(n10320Pdt_KgDe), A10320Pdt_KgDe, Boolean.valueOf(n10321Pdt_KgCn), A10321Pdt_KgCn, Boolean.valueOf(n10322Pdt_KgCj), A10322Pdt_KgCj, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0500");
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
                        resetCaption17U0( ) ;
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
            load17U1400( ) ;
         }
         endLevel17U1400( ) ;
      }
      closeExtendedTableCursors17U1400( ) ;
   }

   public void update17U1400( )
   {
      beforeValidate17U1400( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17U1400( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17U1400( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17U1400( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17U1400( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017U10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n10305Pdt_kgs), A10305Pdt_kgs, Boolean.valueOf(n10306Pdt_mts), A10306Pdt_mts, Boolean.valueOf(n10307Pdt_pzas), Integer.valueOf(A10307Pdt_pzas), Boolean.valueOf(n10308Pdt_hmmr), A10308Pdt_hmmr, Boolean.valueOf(n10309Pdt_hmp), A10309Pdt_hmp, Boolean.valueOf(n10310Pdt_hpo), A10310Pdt_hpo, Boolean.valueOf(n10311Pdt_Hv), A10311Pdt_Hv, Boolean.valueOf(n10312Pdt_KgM), A10312Pdt_KgM, Boolean.valueOf(n10313Pdt_KgB), A10313Pdt_KgB, Boolean.valueOf(n10314Pdt_KgR), A10314Pdt_KgR, Boolean.valueOf(n10315Pdt_KgTC), A10315Pdt_KgTC, Boolean.valueOf(n10316Pdt_KgTB), A10316Pdt_KgTB, Boolean.valueOf(n10317Pdt_KgA), A10317Pdt_KgA, Boolean.valueOf(n10318Pdt_KgPr), A10318Pdt_KgPr, Boolean.valueOf(n10319Pdt_KgGi), A10319Pdt_KgGi, Boolean.valueOf(n10320Pdt_KgDe), A10320Pdt_KgDe, Boolean.valueOf(n10321Pdt_KgCn), A10321Pdt_KgCn, Boolean.valueOf(n10322Pdt_KgCj), A10322Pdt_KgCj, A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0500");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0500"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17U1400( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17U0( ) ;
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
         endLevel17U1400( ) ;
      }
      closeExtendedTableCursors17U1400( ) ;
   }

   public void deferredUpdate17U1400( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17U1400( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17U1400( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17U1400( ) ;
         afterConfirm17U1400( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17U1400( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017U11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A10303Pdt_dia, A10304Pdt_maq});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0500");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1400 == 0 )
                     {
                        initAll17U1400( ) ;
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
                     resetCaption17U0( ) ;
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
      sMode1400 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17U1400( ) ;
      Gx_mode = sMode1400 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17U1400( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17U1400( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17U1400( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0500");
         if ( AnyError == 0 )
         {
            confirmValues17U0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0500");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17U1400( )
   {
      /* Scan By routine */
      /* Using cursor T017U12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1400 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1400 = (short)(1) ;
         A10303Pdt_dia = T017U12_A10303Pdt_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
         A10304Pdt_maq = T017U12_A10304Pdt_maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17U1400( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1400 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1400 = (short)(1) ;
         A10303Pdt_dia = T017U12_A10303Pdt_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
         A10304Pdt_maq = T017U12_A10304Pdt_maq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
      }
   }

   public void scanEnd17U1400( )
   {
      pr_default.close(10);
   }

   public void afterConfirm17U1400( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17U1400( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17U1400( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17U1400( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17U1400( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17U1400( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17U1400( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPdt_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_dia_Enabled), 5, 0), true);
      edtPdt_maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_maq_Enabled), 5, 0), true);
      edtPdt_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_kgs_Enabled), 5, 0), true);
      edtPdt_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_mts_Enabled), 5, 0), true);
      edtPdt_pzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_pzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_pzas_Enabled), 5, 0), true);
      edtPdt_hmmr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_hmmr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_hmmr_Enabled), 5, 0), true);
      edtPdt_hmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_hmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_hmp_Enabled), 5, 0), true);
      edtPdt_hpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_hpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_hpo_Enabled), 5, 0), true);
      edtPdt_Hv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_Hv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_Hv_Enabled), 5, 0), true);
      edtPdt_KgM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgM_Enabled), 5, 0), true);
      edtPdt_KgB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgB_Enabled), 5, 0), true);
      edtPdt_KgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgR_Enabled), 5, 0), true);
      edtPdt_KgTC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgTC_Enabled), 5, 0), true);
      edtPdt_KgTB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgTB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgTB_Enabled), 5, 0), true);
      edtPdt_KgA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgA_Enabled), 5, 0), true);
      edtPdt_KgPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgPr_Enabled), 5, 0), true);
      edtPdt_KgGi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgGi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgGi_Enabled), 5, 0), true);
      edtPdt_KgDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgDe_Enabled), 5, 0), true);
      edtPdt_KgCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgCn_Enabled), 5, 0), true);
      edtPdt_KgCj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPdt_KgCj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPdt_KgCj_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17U1400( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17U0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0500", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10303Pdt_dia", localUtil.dtoc( Z10303Pdt_dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10304Pdt_maq", GXutil.rtrim( Z10304Pdt_maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10305Pdt_kgs", GXutil.ltrim( localUtil.ntoc( Z10305Pdt_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10306Pdt_mts", GXutil.ltrim( localUtil.ntoc( Z10306Pdt_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10307Pdt_pzas", GXutil.ltrim( localUtil.ntoc( Z10307Pdt_pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10308Pdt_hmmr", GXutil.ltrim( localUtil.ntoc( Z10308Pdt_hmmr, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10309Pdt_hmp", GXutil.ltrim( localUtil.ntoc( Z10309Pdt_hmp, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10310Pdt_hpo", GXutil.ltrim( localUtil.ntoc( Z10310Pdt_hpo, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10311Pdt_Hv", GXutil.ltrim( localUtil.ntoc( Z10311Pdt_Hv, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10312Pdt_KgM", GXutil.ltrim( localUtil.ntoc( Z10312Pdt_KgM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10313Pdt_KgB", GXutil.ltrim( localUtil.ntoc( Z10313Pdt_KgB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10314Pdt_KgR", GXutil.ltrim( localUtil.ntoc( Z10314Pdt_KgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10315Pdt_KgTC", GXutil.ltrim( localUtil.ntoc( Z10315Pdt_KgTC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10316Pdt_KgTB", GXutil.ltrim( localUtil.ntoc( Z10316Pdt_KgTB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10317Pdt_KgA", GXutil.ltrim( localUtil.ntoc( Z10317Pdt_KgA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10318Pdt_KgPr", GXutil.ltrim( localUtil.ntoc( Z10318Pdt_KgPr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10319Pdt_KgGi", GXutil.ltrim( localUtil.ntoc( Z10319Pdt_KgGi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10320Pdt_KgDe", GXutil.ltrim( localUtil.ntoc( Z10320Pdt_KgDe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10321Pdt_KgCn", GXutil.ltrim( localUtil.ntoc( Z10321Pdt_KgCn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10322Pdt_KgCj", GXutil.ltrim( localUtil.ntoc( Z10322Pdt_KgCj, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttr0500", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTR0500" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRODUCCION DIARIA TOSA", "") ;
   }

   public void initializeNonKey17U1400( )
   {
      A10305Pdt_kgs = DecimalUtil.ZERO ;
      n10305Pdt_kgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrimstr( A10305Pdt_kgs, 9, 2));
      A10306Pdt_mts = DecimalUtil.ZERO ;
      n10306Pdt_mts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrimstr( A10306Pdt_mts, 9, 2));
      A10307Pdt_pzas = 0 ;
      n10307Pdt_pzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10307Pdt_pzas), 6, 0));
      A10308Pdt_hmmr = DecimalUtil.ZERO ;
      n10308Pdt_hmmr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrimstr( A10308Pdt_hmmr, 8, 2));
      A10309Pdt_hmp = DecimalUtil.ZERO ;
      n10309Pdt_hmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrimstr( A10309Pdt_hmp, 9, 2));
      A10310Pdt_hpo = DecimalUtil.ZERO ;
      n10310Pdt_hpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrimstr( A10310Pdt_hpo, 9, 2));
      A10311Pdt_Hv = DecimalUtil.ZERO ;
      n10311Pdt_Hv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrimstr( A10311Pdt_Hv, 9, 2));
      A10312Pdt_KgM = DecimalUtil.ZERO ;
      n10312Pdt_KgM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrimstr( A10312Pdt_KgM, 9, 2));
      A10313Pdt_KgB = DecimalUtil.ZERO ;
      n10313Pdt_KgB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrimstr( A10313Pdt_KgB, 9, 2));
      A10314Pdt_KgR = DecimalUtil.ZERO ;
      n10314Pdt_KgR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrimstr( A10314Pdt_KgR, 9, 2));
      A10315Pdt_KgTC = DecimalUtil.ZERO ;
      n10315Pdt_KgTC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrimstr( A10315Pdt_KgTC, 9, 2));
      A10316Pdt_KgTB = DecimalUtil.ZERO ;
      n10316Pdt_KgTB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrimstr( A10316Pdt_KgTB, 9, 2));
      A10317Pdt_KgA = DecimalUtil.ZERO ;
      n10317Pdt_KgA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrimstr( A10317Pdt_KgA, 9, 2));
      A10318Pdt_KgPr = DecimalUtil.ZERO ;
      n10318Pdt_KgPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrimstr( A10318Pdt_KgPr, 9, 2));
      A10319Pdt_KgGi = DecimalUtil.ZERO ;
      n10319Pdt_KgGi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrimstr( A10319Pdt_KgGi, 9, 2));
      A10320Pdt_KgDe = DecimalUtil.ZERO ;
      n10320Pdt_KgDe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrimstr( A10320Pdt_KgDe, 9, 2));
      A10321Pdt_KgCn = DecimalUtil.ZERO ;
      n10321Pdt_KgCn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrimstr( A10321Pdt_KgCn, 9, 2));
      A10322Pdt_KgCj = DecimalUtil.ZERO ;
      n10322Pdt_KgCj = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrimstr( A10322Pdt_KgCj, 9, 2));
      Z10305Pdt_kgs = DecimalUtil.ZERO ;
      Z10306Pdt_mts = DecimalUtil.ZERO ;
      Z10307Pdt_pzas = 0 ;
      Z10308Pdt_hmmr = DecimalUtil.ZERO ;
      Z10309Pdt_hmp = DecimalUtil.ZERO ;
      Z10310Pdt_hpo = DecimalUtil.ZERO ;
      Z10311Pdt_Hv = DecimalUtil.ZERO ;
      Z10312Pdt_KgM = DecimalUtil.ZERO ;
      Z10313Pdt_KgB = DecimalUtil.ZERO ;
      Z10314Pdt_KgR = DecimalUtil.ZERO ;
      Z10315Pdt_KgTC = DecimalUtil.ZERO ;
      Z10316Pdt_KgTB = DecimalUtil.ZERO ;
      Z10317Pdt_KgA = DecimalUtil.ZERO ;
      Z10318Pdt_KgPr = DecimalUtil.ZERO ;
      Z10319Pdt_KgGi = DecimalUtil.ZERO ;
      Z10320Pdt_KgDe = DecimalUtil.ZERO ;
      Z10321Pdt_KgCn = DecimalUtil.ZERO ;
      Z10322Pdt_KgCj = DecimalUtil.ZERO ;
   }

   public void initAll17U1400( )
   {
      A10303Pdt_dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10303Pdt_dia", localUtil.format(A10303Pdt_dia, "99/99/99"));
      A10304Pdt_maq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10304Pdt_maq", A10304Pdt_maq);
      initializeNonKey17U1400( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241552365", true, true);
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
      httpContext.AddJavascriptSource("ttr0500.js", "?20268241552365", false, true);
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
      edtPdt_dia_Internalname = "PDT_DIA" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPdt_maq_Internalname = "PDT_MAQ" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPdt_kgs_Internalname = "PDT_KGS" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPdt_mts_Internalname = "PDT_MTS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtPdt_pzas_Internalname = "PDT_PZAS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPdt_hmmr_Internalname = "PDT_HMMR" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPdt_hmp_Internalname = "PDT_HMP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtPdt_hpo_Internalname = "PDT_HPO" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtPdt_Hv_Internalname = "PDT_HV" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPdt_KgM_Internalname = "PDT_KGM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPdt_KgB_Internalname = "PDT_KGB" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPdt_KgR_Internalname = "PDT_KGR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtPdt_KgTC_Internalname = "PDT_KGTC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPdt_KgTB_Internalname = "PDT_KGTB" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPdt_KgA_Internalname = "PDT_KGA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPdt_KgPr_Internalname = "PDT_KGPR" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtPdt_KgGi_Internalname = "PDT_KGGI" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtPdt_KgDe_Internalname = "PDT_KGDE" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtPdt_KgCn_Internalname = "PDT_KGCN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtPdt_KgCj_Internalname = "PDT_KGCJ" ;
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
      Form.setCaption( httpContext.getMessage( "PRODUCCION DIARIA TOSA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPdt_KgCj_Jsonclick = "" ;
      edtPdt_KgCj_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgCj_Enabled = 1 ;
      edtPdt_KgCn_Jsonclick = "" ;
      edtPdt_KgCn_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgCn_Enabled = 1 ;
      edtPdt_KgDe_Jsonclick = "" ;
      edtPdt_KgDe_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgDe_Enabled = 1 ;
      edtPdt_KgGi_Jsonclick = "" ;
      edtPdt_KgGi_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgGi_Enabled = 1 ;
      edtPdt_KgPr_Jsonclick = "" ;
      edtPdt_KgPr_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgPr_Enabled = 1 ;
      edtPdt_KgA_Jsonclick = "" ;
      edtPdt_KgA_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgA_Enabled = 1 ;
      edtPdt_KgTB_Jsonclick = "" ;
      edtPdt_KgTB_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgTB_Enabled = 1 ;
      edtPdt_KgTC_Jsonclick = "" ;
      edtPdt_KgTC_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgTC_Enabled = 1 ;
      edtPdt_KgR_Jsonclick = "" ;
      edtPdt_KgR_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgR_Enabled = 1 ;
      edtPdt_KgB_Jsonclick = "" ;
      edtPdt_KgB_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgB_Enabled = 1 ;
      edtPdt_KgM_Jsonclick = "" ;
      edtPdt_KgM_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_KgM_Enabled = 1 ;
      edtPdt_Hv_Jsonclick = "" ;
      edtPdt_Hv_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_Hv_Enabled = 1 ;
      edtPdt_hpo_Jsonclick = "" ;
      edtPdt_hpo_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_hpo_Enabled = 1 ;
      edtPdt_hmp_Jsonclick = "" ;
      edtPdt_hmp_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_hmp_Enabled = 1 ;
      edtPdt_hmmr_Jsonclick = "" ;
      edtPdt_hmmr_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_hmmr_Enabled = 1 ;
      edtPdt_pzas_Jsonclick = "" ;
      edtPdt_pzas_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_pzas_Enabled = 1 ;
      edtPdt_mts_Jsonclick = "" ;
      edtPdt_mts_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_mts_Enabled = 1 ;
      edtPdt_kgs_Jsonclick = "" ;
      edtPdt_kgs_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_kgs_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPdt_maq_Jsonclick = "" ;
      edtPdt_maq_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_maq_Enabled = 1 ;
      edtPdt_dia_Jsonclick = "" ;
      edtPdt_dia_Backcolor = (int)(0xFFFFFF) ;
      edtPdt_dia_Enabled = 1 ;
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
      /* Using cursor T017U13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017U13_A407EmprNom[0] ;
      n407EmprNom = T017U13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtPdt_kgs_Internalname ;
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

   public void valid_Pdt_maq( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10305Pdt_kgs", GXutil.ltrim( localUtil.ntoc( A10305Pdt_kgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10306Pdt_mts", GXutil.ltrim( localUtil.ntoc( A10306Pdt_mts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10307Pdt_pzas", GXutil.ltrim( localUtil.ntoc( A10307Pdt_pzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10308Pdt_hmmr", GXutil.ltrim( localUtil.ntoc( A10308Pdt_hmmr, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10309Pdt_hmp", GXutil.ltrim( localUtil.ntoc( A10309Pdt_hmp, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10310Pdt_hpo", GXutil.ltrim( localUtil.ntoc( A10310Pdt_hpo, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10311Pdt_Hv", GXutil.ltrim( localUtil.ntoc( A10311Pdt_Hv, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10312Pdt_KgM", GXutil.ltrim( localUtil.ntoc( A10312Pdt_KgM, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10313Pdt_KgB", GXutil.ltrim( localUtil.ntoc( A10313Pdt_KgB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10314Pdt_KgR", GXutil.ltrim( localUtil.ntoc( A10314Pdt_KgR, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10315Pdt_KgTC", GXutil.ltrim( localUtil.ntoc( A10315Pdt_KgTC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10316Pdt_KgTB", GXutil.ltrim( localUtil.ntoc( A10316Pdt_KgTB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10317Pdt_KgA", GXutil.ltrim( localUtil.ntoc( A10317Pdt_KgA, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10318Pdt_KgPr", GXutil.ltrim( localUtil.ntoc( A10318Pdt_KgPr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10319Pdt_KgGi", GXutil.ltrim( localUtil.ntoc( A10319Pdt_KgGi, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10320Pdt_KgDe", GXutil.ltrim( localUtil.ntoc( A10320Pdt_KgDe, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10321Pdt_KgCn", GXutil.ltrim( localUtil.ntoc( A10321Pdt_KgCn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10322Pdt_KgCj", GXutil.ltrim( localUtil.ntoc( A10322Pdt_KgCj, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10303Pdt_dia", localUtil.format(Z10303Pdt_dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10304Pdt_maq", GXutil.rtrim( Z10304Pdt_maq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10305Pdt_kgs", GXutil.ltrim( localUtil.ntoc( Z10305Pdt_kgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10306Pdt_mts", GXutil.ltrim( localUtil.ntoc( Z10306Pdt_mts, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10307Pdt_pzas", GXutil.ltrim( localUtil.ntoc( Z10307Pdt_pzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10308Pdt_hmmr", GXutil.ltrim( localUtil.ntoc( Z10308Pdt_hmmr, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10309Pdt_hmp", GXutil.ltrim( localUtil.ntoc( Z10309Pdt_hmp, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10310Pdt_hpo", GXutil.ltrim( localUtil.ntoc( Z10310Pdt_hpo, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10311Pdt_Hv", GXutil.ltrim( localUtil.ntoc( Z10311Pdt_Hv, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10312Pdt_KgM", GXutil.ltrim( localUtil.ntoc( Z10312Pdt_KgM, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10313Pdt_KgB", GXutil.ltrim( localUtil.ntoc( Z10313Pdt_KgB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10314Pdt_KgR", GXutil.ltrim( localUtil.ntoc( Z10314Pdt_KgR, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10315Pdt_KgTC", GXutil.ltrim( localUtil.ntoc( Z10315Pdt_KgTC, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10316Pdt_KgTB", GXutil.ltrim( localUtil.ntoc( Z10316Pdt_KgTB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10317Pdt_KgA", GXutil.ltrim( localUtil.ntoc( Z10317Pdt_KgA, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10318Pdt_KgPr", GXutil.ltrim( localUtil.ntoc( Z10318Pdt_KgPr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10319Pdt_KgGi", GXutil.ltrim( localUtil.ntoc( Z10319Pdt_KgGi, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10320Pdt_KgDe", GXutil.ltrim( localUtil.ntoc( Z10320Pdt_KgDe, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10321Pdt_KgCn", GXutil.ltrim( localUtil.ntoc( Z10321Pdt_KgCn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10322Pdt_KgCj", GXutil.ltrim( localUtil.ntoc( Z10322Pdt_KgCj, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_PDT_DIA","{handler:'valid_Pdt_dia',iparms:[]");
      setEventMetadata("VALID_PDT_DIA",",oparms:[]}");
      setEventMetadata("VALID_PDT_MAQ","{handler:'valid_Pdt_maq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10303Pdt_dia',fld:'PDT_DIA',pic:''},{av:'A10304Pdt_maq',fld:'PDT_MAQ',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PDT_MAQ",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10305Pdt_kgs',fld:'PDT_KGS',pic:'ZZZZZ9.99'},{av:'A10306Pdt_mts',fld:'PDT_MTS',pic:'ZZZZZ9.99'},{av:'A10307Pdt_pzas',fld:'PDT_PZAS',pic:'ZZZZZ9'},{av:'A10308Pdt_hmmr',fld:'PDT_HMMR',pic:'ZZZZ9.99'},{av:'A10309Pdt_hmp',fld:'PDT_HMP',pic:'ZZZZZ9.99'},{av:'A10310Pdt_hpo',fld:'PDT_HPO',pic:'ZZZZZ9.99'},{av:'A10311Pdt_Hv',fld:'PDT_HV',pic:'ZZZZZ9.99'},{av:'A10312Pdt_KgM',fld:'PDT_KGM',pic:'ZZZZZ9.99'},{av:'A10313Pdt_KgB',fld:'PDT_KGB',pic:'ZZZZZ9.99'},{av:'A10314Pdt_KgR',fld:'PDT_KGR',pic:'ZZZZZ9.99'},{av:'A10315Pdt_KgTC',fld:'PDT_KGTC',pic:'ZZZZZ9.99'},{av:'A10316Pdt_KgTB',fld:'PDT_KGTB',pic:'ZZZZZ9.99'},{av:'A10317Pdt_KgA',fld:'PDT_KGA',pic:'ZZZZZ9.99'},{av:'A10318Pdt_KgPr',fld:'PDT_KGPR',pic:'ZZZZZ9.99'},{av:'A10319Pdt_KgGi',fld:'PDT_KGGI',pic:'ZZZZZ9.99'},{av:'A10320Pdt_KgDe',fld:'PDT_KGDE',pic:'ZZZZZ9.99'},{av:'A10321Pdt_KgCn',fld:'PDT_KGCN',pic:'ZZZZZ9.99'},{av:'A10322Pdt_KgCj',fld:'PDT_KGCJ',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10303Pdt_dia'},{av:'Z10304Pdt_maq'},{av:'Z407EmprNom'},{av:'Z10305Pdt_kgs'},{av:'Z10306Pdt_mts'},{av:'Z10307Pdt_pzas'},{av:'Z10308Pdt_hmmr'},{av:'Z10309Pdt_hmp'},{av:'Z10310Pdt_hpo'},{av:'Z10311Pdt_Hv'},{av:'Z10312Pdt_KgM'},{av:'Z10313Pdt_KgB'},{av:'Z10314Pdt_KgR'},{av:'Z10315Pdt_KgTC'},{av:'Z10316Pdt_KgTB'},{av:'Z10317Pdt_KgA'},{av:'Z10318Pdt_KgPr'},{av:'Z10319Pdt_KgGi'},{av:'Z10320Pdt_KgDe'},{av:'Z10321Pdt_KgCn'},{av:'Z10322Pdt_KgCj'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10303Pdt_dia = GXutil.nullDate() ;
      Z10304Pdt_maq = "" ;
      Z10305Pdt_kgs = DecimalUtil.ZERO ;
      Z10306Pdt_mts = DecimalUtil.ZERO ;
      Z10308Pdt_hmmr = DecimalUtil.ZERO ;
      Z10309Pdt_hmp = DecimalUtil.ZERO ;
      Z10310Pdt_hpo = DecimalUtil.ZERO ;
      Z10311Pdt_Hv = DecimalUtil.ZERO ;
      Z10312Pdt_KgM = DecimalUtil.ZERO ;
      Z10313Pdt_KgB = DecimalUtil.ZERO ;
      Z10314Pdt_KgR = DecimalUtil.ZERO ;
      Z10315Pdt_KgTC = DecimalUtil.ZERO ;
      Z10316Pdt_KgTB = DecimalUtil.ZERO ;
      Z10317Pdt_KgA = DecimalUtil.ZERO ;
      Z10318Pdt_KgPr = DecimalUtil.ZERO ;
      Z10319Pdt_KgGi = DecimalUtil.ZERO ;
      Z10320Pdt_KgDe = DecimalUtil.ZERO ;
      Z10321Pdt_KgCn = DecimalUtil.ZERO ;
      Z10322Pdt_KgCj = DecimalUtil.ZERO ;
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
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A10303Pdt_dia = GXutil.nullDate() ;
      lblTextblock4_Jsonclick = "" ;
      A10304Pdt_maq = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10305Pdt_kgs = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A10306Pdt_mts = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10308Pdt_hmmr = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A10309Pdt_hmp = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A10310Pdt_hpo = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A10311Pdt_Hv = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A10312Pdt_KgM = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A10313Pdt_KgB = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A10314Pdt_KgR = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A10315Pdt_KgTC = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A10316Pdt_KgTB = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A10317Pdt_KgA = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A10318Pdt_KgPr = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A10319Pdt_KgGi = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      A10320Pdt_KgDe = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A10321Pdt_KgCn = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A10322Pdt_KgCj = DecimalUtil.ZERO ;
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
      T017U4_A407EmprNom = new String[] {""} ;
      T017U4_n407EmprNom = new boolean[] {false} ;
      T017U5_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U5_A10304Pdt_maq = new String[] {""} ;
      T017U5_A407EmprNom = new String[] {""} ;
      T017U5_n407EmprNom = new boolean[] {false} ;
      T017U5_A10305Pdt_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10305Pdt_kgs = new boolean[] {false} ;
      T017U5_A10306Pdt_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10306Pdt_mts = new boolean[] {false} ;
      T017U5_A10307Pdt_pzas = new int[1] ;
      T017U5_n10307Pdt_pzas = new boolean[] {false} ;
      T017U5_A10308Pdt_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10308Pdt_hmmr = new boolean[] {false} ;
      T017U5_A10309Pdt_hmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10309Pdt_hmp = new boolean[] {false} ;
      T017U5_A10310Pdt_hpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10310Pdt_hpo = new boolean[] {false} ;
      T017U5_A10311Pdt_Hv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10311Pdt_Hv = new boolean[] {false} ;
      T017U5_A10312Pdt_KgM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10312Pdt_KgM = new boolean[] {false} ;
      T017U5_A10313Pdt_KgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10313Pdt_KgB = new boolean[] {false} ;
      T017U5_A10314Pdt_KgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10314Pdt_KgR = new boolean[] {false} ;
      T017U5_A10315Pdt_KgTC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10315Pdt_KgTC = new boolean[] {false} ;
      T017U5_A10316Pdt_KgTB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10316Pdt_KgTB = new boolean[] {false} ;
      T017U5_A10317Pdt_KgA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10317Pdt_KgA = new boolean[] {false} ;
      T017U5_A10318Pdt_KgPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10318Pdt_KgPr = new boolean[] {false} ;
      T017U5_A10319Pdt_KgGi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10319Pdt_KgGi = new boolean[] {false} ;
      T017U5_A10320Pdt_KgDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10320Pdt_KgDe = new boolean[] {false} ;
      T017U5_A10321Pdt_KgCn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10321Pdt_KgCn = new boolean[] {false} ;
      T017U5_A10322Pdt_KgCj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U5_n10322Pdt_KgCj = new boolean[] {false} ;
      T017U5_A396EmprCod = new String[] {""} ;
      T017U6_A396EmprCod = new String[] {""} ;
      T017U6_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U6_A10304Pdt_maq = new String[] {""} ;
      T017U3_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U3_A10304Pdt_maq = new String[] {""} ;
      T017U3_A10305Pdt_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10305Pdt_kgs = new boolean[] {false} ;
      T017U3_A10306Pdt_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10306Pdt_mts = new boolean[] {false} ;
      T017U3_A10307Pdt_pzas = new int[1] ;
      T017U3_n10307Pdt_pzas = new boolean[] {false} ;
      T017U3_A10308Pdt_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10308Pdt_hmmr = new boolean[] {false} ;
      T017U3_A10309Pdt_hmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10309Pdt_hmp = new boolean[] {false} ;
      T017U3_A10310Pdt_hpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10310Pdt_hpo = new boolean[] {false} ;
      T017U3_A10311Pdt_Hv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10311Pdt_Hv = new boolean[] {false} ;
      T017U3_A10312Pdt_KgM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10312Pdt_KgM = new boolean[] {false} ;
      T017U3_A10313Pdt_KgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10313Pdt_KgB = new boolean[] {false} ;
      T017U3_A10314Pdt_KgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10314Pdt_KgR = new boolean[] {false} ;
      T017U3_A10315Pdt_KgTC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10315Pdt_KgTC = new boolean[] {false} ;
      T017U3_A10316Pdt_KgTB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10316Pdt_KgTB = new boolean[] {false} ;
      T017U3_A10317Pdt_KgA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10317Pdt_KgA = new boolean[] {false} ;
      T017U3_A10318Pdt_KgPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10318Pdt_KgPr = new boolean[] {false} ;
      T017U3_A10319Pdt_KgGi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10319Pdt_KgGi = new boolean[] {false} ;
      T017U3_A10320Pdt_KgDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10320Pdt_KgDe = new boolean[] {false} ;
      T017U3_A10321Pdt_KgCn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10321Pdt_KgCn = new boolean[] {false} ;
      T017U3_A10322Pdt_KgCj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U3_n10322Pdt_KgCj = new boolean[] {false} ;
      T017U3_A396EmprCod = new String[] {""} ;
      sMode1400 = "" ;
      T017U7_A396EmprCod = new String[] {""} ;
      T017U7_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U7_A10304Pdt_maq = new String[] {""} ;
      T017U8_A396EmprCod = new String[] {""} ;
      T017U8_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U8_A10304Pdt_maq = new String[] {""} ;
      T017U2_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U2_A10304Pdt_maq = new String[] {""} ;
      T017U2_A10305Pdt_kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10305Pdt_kgs = new boolean[] {false} ;
      T017U2_A10306Pdt_mts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10306Pdt_mts = new boolean[] {false} ;
      T017U2_A10307Pdt_pzas = new int[1] ;
      T017U2_n10307Pdt_pzas = new boolean[] {false} ;
      T017U2_A10308Pdt_hmmr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10308Pdt_hmmr = new boolean[] {false} ;
      T017U2_A10309Pdt_hmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10309Pdt_hmp = new boolean[] {false} ;
      T017U2_A10310Pdt_hpo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10310Pdt_hpo = new boolean[] {false} ;
      T017U2_A10311Pdt_Hv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10311Pdt_Hv = new boolean[] {false} ;
      T017U2_A10312Pdt_KgM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10312Pdt_KgM = new boolean[] {false} ;
      T017U2_A10313Pdt_KgB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10313Pdt_KgB = new boolean[] {false} ;
      T017U2_A10314Pdt_KgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10314Pdt_KgR = new boolean[] {false} ;
      T017U2_A10315Pdt_KgTC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10315Pdt_KgTC = new boolean[] {false} ;
      T017U2_A10316Pdt_KgTB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10316Pdt_KgTB = new boolean[] {false} ;
      T017U2_A10317Pdt_KgA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10317Pdt_KgA = new boolean[] {false} ;
      T017U2_A10318Pdt_KgPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10318Pdt_KgPr = new boolean[] {false} ;
      T017U2_A10319Pdt_KgGi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10319Pdt_KgGi = new boolean[] {false} ;
      T017U2_A10320Pdt_KgDe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10320Pdt_KgDe = new boolean[] {false} ;
      T017U2_A10321Pdt_KgCn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10321Pdt_KgCn = new boolean[] {false} ;
      T017U2_A10322Pdt_KgCj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017U2_n10322Pdt_KgCj = new boolean[] {false} ;
      T017U2_A396EmprCod = new String[] {""} ;
      T017U12_A396EmprCod = new String[] {""} ;
      T017U12_A10303Pdt_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017U12_A10304Pdt_maq = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T017U13_A407EmprNom = new String[] {""} ;
      T017U13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10303Pdt_dia = GXutil.nullDate() ;
      ZZ10304Pdt_maq = "" ;
      ZZ407EmprNom = "" ;
      ZZ10305Pdt_kgs = DecimalUtil.ZERO ;
      ZZ10306Pdt_mts = DecimalUtil.ZERO ;
      ZZ10308Pdt_hmmr = DecimalUtil.ZERO ;
      ZZ10309Pdt_hmp = DecimalUtil.ZERO ;
      ZZ10310Pdt_hpo = DecimalUtil.ZERO ;
      ZZ10311Pdt_Hv = DecimalUtil.ZERO ;
      ZZ10312Pdt_KgM = DecimalUtil.ZERO ;
      ZZ10313Pdt_KgB = DecimalUtil.ZERO ;
      ZZ10314Pdt_KgR = DecimalUtil.ZERO ;
      ZZ10315Pdt_KgTC = DecimalUtil.ZERO ;
      ZZ10316Pdt_KgTB = DecimalUtil.ZERO ;
      ZZ10317Pdt_KgA = DecimalUtil.ZERO ;
      ZZ10318Pdt_KgPr = DecimalUtil.ZERO ;
      ZZ10319Pdt_KgGi = DecimalUtil.ZERO ;
      ZZ10320Pdt_KgDe = DecimalUtil.ZERO ;
      ZZ10321Pdt_KgCn = DecimalUtil.ZERO ;
      ZZ10322Pdt_KgCj = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0500__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0500__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0500__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0500__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0500__default(),
         new Object[] {
             new Object[] {
            T017U2_A10303Pdt_dia, T017U2_A10304Pdt_maq, T017U2_A10305Pdt_kgs, T017U2_n10305Pdt_kgs, T017U2_A10306Pdt_mts, T017U2_n10306Pdt_mts, T017U2_A10307Pdt_pzas, T017U2_n10307Pdt_pzas, T017U2_A10308Pdt_hmmr, T017U2_n10308Pdt_hmmr,
            T017U2_A10309Pdt_hmp, T017U2_n10309Pdt_hmp, T017U2_A10310Pdt_hpo, T017U2_n10310Pdt_hpo, T017U2_A10311Pdt_Hv, T017U2_n10311Pdt_Hv, T017U2_A10312Pdt_KgM, T017U2_n10312Pdt_KgM, T017U2_A10313Pdt_KgB, T017U2_n10313Pdt_KgB,
            T017U2_A10314Pdt_KgR, T017U2_n10314Pdt_KgR, T017U2_A10315Pdt_KgTC, T017U2_n10315Pdt_KgTC, T017U2_A10316Pdt_KgTB, T017U2_n10316Pdt_KgTB, T017U2_A10317Pdt_KgA, T017U2_n10317Pdt_KgA, T017U2_A10318Pdt_KgPr, T017U2_n10318Pdt_KgPr,
            T017U2_A10319Pdt_KgGi, T017U2_n10319Pdt_KgGi, T017U2_A10320Pdt_KgDe, T017U2_n10320Pdt_KgDe, T017U2_A10321Pdt_KgCn, T017U2_n10321Pdt_KgCn, T017U2_A10322Pdt_KgCj, T017U2_n10322Pdt_KgCj, T017U2_A396EmprCod
            }
            , new Object[] {
            T017U3_A10303Pdt_dia, T017U3_A10304Pdt_maq, T017U3_A10305Pdt_kgs, T017U3_n10305Pdt_kgs, T017U3_A10306Pdt_mts, T017U3_n10306Pdt_mts, T017U3_A10307Pdt_pzas, T017U3_n10307Pdt_pzas, T017U3_A10308Pdt_hmmr, T017U3_n10308Pdt_hmmr,
            T017U3_A10309Pdt_hmp, T017U3_n10309Pdt_hmp, T017U3_A10310Pdt_hpo, T017U3_n10310Pdt_hpo, T017U3_A10311Pdt_Hv, T017U3_n10311Pdt_Hv, T017U3_A10312Pdt_KgM, T017U3_n10312Pdt_KgM, T017U3_A10313Pdt_KgB, T017U3_n10313Pdt_KgB,
            T017U3_A10314Pdt_KgR, T017U3_n10314Pdt_KgR, T017U3_A10315Pdt_KgTC, T017U3_n10315Pdt_KgTC, T017U3_A10316Pdt_KgTB, T017U3_n10316Pdt_KgTB, T017U3_A10317Pdt_KgA, T017U3_n10317Pdt_KgA, T017U3_A10318Pdt_KgPr, T017U3_n10318Pdt_KgPr,
            T017U3_A10319Pdt_KgGi, T017U3_n10319Pdt_KgGi, T017U3_A10320Pdt_KgDe, T017U3_n10320Pdt_KgDe, T017U3_A10321Pdt_KgCn, T017U3_n10321Pdt_KgCn, T017U3_A10322Pdt_KgCj, T017U3_n10322Pdt_KgCj, T017U3_A396EmprCod
            }
            , new Object[] {
            T017U4_A407EmprNom, T017U4_n407EmprNom
            }
            , new Object[] {
            T017U5_A10303Pdt_dia, T017U5_A10304Pdt_maq, T017U5_A407EmprNom, T017U5_n407EmprNom, T017U5_A10305Pdt_kgs, T017U5_n10305Pdt_kgs, T017U5_A10306Pdt_mts, T017U5_n10306Pdt_mts, T017U5_A10307Pdt_pzas, T017U5_n10307Pdt_pzas,
            T017U5_A10308Pdt_hmmr, T017U5_n10308Pdt_hmmr, T017U5_A10309Pdt_hmp, T017U5_n10309Pdt_hmp, T017U5_A10310Pdt_hpo, T017U5_n10310Pdt_hpo, T017U5_A10311Pdt_Hv, T017U5_n10311Pdt_Hv, T017U5_A10312Pdt_KgM, T017U5_n10312Pdt_KgM,
            T017U5_A10313Pdt_KgB, T017U5_n10313Pdt_KgB, T017U5_A10314Pdt_KgR, T017U5_n10314Pdt_KgR, T017U5_A10315Pdt_KgTC, T017U5_n10315Pdt_KgTC, T017U5_A10316Pdt_KgTB, T017U5_n10316Pdt_KgTB, T017U5_A10317Pdt_KgA, T017U5_n10317Pdt_KgA,
            T017U5_A10318Pdt_KgPr, T017U5_n10318Pdt_KgPr, T017U5_A10319Pdt_KgGi, T017U5_n10319Pdt_KgGi, T017U5_A10320Pdt_KgDe, T017U5_n10320Pdt_KgDe, T017U5_A10321Pdt_KgCn, T017U5_n10321Pdt_KgCn, T017U5_A10322Pdt_KgCj, T017U5_n10322Pdt_KgCj,
            T017U5_A396EmprCod
            }
            , new Object[] {
            T017U6_A396EmprCod, T017U6_A10303Pdt_dia, T017U6_A10304Pdt_maq
            }
            , new Object[] {
            T017U7_A396EmprCod, T017U7_A10303Pdt_dia, T017U7_A10304Pdt_maq
            }
            , new Object[] {
            T017U8_A396EmprCod, T017U8_A10303Pdt_dia, T017U8_A10304Pdt_maq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017U12_A396EmprCod, T017U12_A10303Pdt_dia, T017U12_A10304Pdt_maq
            }
            , new Object[] {
            T017U13_A407EmprNom, T017U13_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR0500" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1400 ;
   private short nIsDirty_1400 ;
   private int Z10307Pdt_pzas ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPdt_dia_Enabled ;
   private int edtPdt_maq_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPdt_kgs_Enabled ;
   private int edtPdt_mts_Enabled ;
   private int A10307Pdt_pzas ;
   private int edtPdt_pzas_Enabled ;
   private int edtPdt_hmmr_Enabled ;
   private int edtPdt_hmp_Enabled ;
   private int edtPdt_hpo_Enabled ;
   private int edtPdt_Hv_Enabled ;
   private int edtPdt_KgM_Enabled ;
   private int edtPdt_KgB_Enabled ;
   private int edtPdt_KgR_Enabled ;
   private int edtPdt_KgTC_Enabled ;
   private int edtPdt_KgTB_Enabled ;
   private int edtPdt_KgA_Enabled ;
   private int edtPdt_KgPr_Enabled ;
   private int edtPdt_KgGi_Enabled ;
   private int edtPdt_KgDe_Enabled ;
   private int edtPdt_KgCn_Enabled ;
   private int edtPdt_KgCj_Enabled ;
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
   private int edtPdt_KgCj_Backcolor ;
   private int edtPdt_KgCn_Backcolor ;
   private int edtPdt_KgDe_Backcolor ;
   private int edtPdt_KgGi_Backcolor ;
   private int edtPdt_KgPr_Backcolor ;
   private int edtPdt_KgA_Backcolor ;
   private int edtPdt_KgTB_Backcolor ;
   private int edtPdt_KgTC_Backcolor ;
   private int edtPdt_KgR_Backcolor ;
   private int edtPdt_KgB_Backcolor ;
   private int edtPdt_KgM_Backcolor ;
   private int edtPdt_Hv_Backcolor ;
   private int edtPdt_hpo_Backcolor ;
   private int edtPdt_hmp_Backcolor ;
   private int edtPdt_hmmr_Backcolor ;
   private int edtPdt_pzas_Backcolor ;
   private int edtPdt_mts_Backcolor ;
   private int edtPdt_kgs_Backcolor ;
   private int edtPdt_maq_Backcolor ;
   private int edtPdt_dia_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10307Pdt_pzas ;
   private java.math.BigDecimal Z10305Pdt_kgs ;
   private java.math.BigDecimal Z10306Pdt_mts ;
   private java.math.BigDecimal Z10308Pdt_hmmr ;
   private java.math.BigDecimal Z10309Pdt_hmp ;
   private java.math.BigDecimal Z10310Pdt_hpo ;
   private java.math.BigDecimal Z10311Pdt_Hv ;
   private java.math.BigDecimal Z10312Pdt_KgM ;
   private java.math.BigDecimal Z10313Pdt_KgB ;
   private java.math.BigDecimal Z10314Pdt_KgR ;
   private java.math.BigDecimal Z10315Pdt_KgTC ;
   private java.math.BigDecimal Z10316Pdt_KgTB ;
   private java.math.BigDecimal Z10317Pdt_KgA ;
   private java.math.BigDecimal Z10318Pdt_KgPr ;
   private java.math.BigDecimal Z10319Pdt_KgGi ;
   private java.math.BigDecimal Z10320Pdt_KgDe ;
   private java.math.BigDecimal Z10321Pdt_KgCn ;
   private java.math.BigDecimal Z10322Pdt_KgCj ;
   private java.math.BigDecimal A10305Pdt_kgs ;
   private java.math.BigDecimal A10306Pdt_mts ;
   private java.math.BigDecimal A10308Pdt_hmmr ;
   private java.math.BigDecimal A10309Pdt_hmp ;
   private java.math.BigDecimal A10310Pdt_hpo ;
   private java.math.BigDecimal A10311Pdt_Hv ;
   private java.math.BigDecimal A10312Pdt_KgM ;
   private java.math.BigDecimal A10313Pdt_KgB ;
   private java.math.BigDecimal A10314Pdt_KgR ;
   private java.math.BigDecimal A10315Pdt_KgTC ;
   private java.math.BigDecimal A10316Pdt_KgTB ;
   private java.math.BigDecimal A10317Pdt_KgA ;
   private java.math.BigDecimal A10318Pdt_KgPr ;
   private java.math.BigDecimal A10319Pdt_KgGi ;
   private java.math.BigDecimal A10320Pdt_KgDe ;
   private java.math.BigDecimal A10321Pdt_KgCn ;
   private java.math.BigDecimal A10322Pdt_KgCj ;
   private java.math.BigDecimal ZZ10305Pdt_kgs ;
   private java.math.BigDecimal ZZ10306Pdt_mts ;
   private java.math.BigDecimal ZZ10308Pdt_hmmr ;
   private java.math.BigDecimal ZZ10309Pdt_hmp ;
   private java.math.BigDecimal ZZ10310Pdt_hpo ;
   private java.math.BigDecimal ZZ10311Pdt_Hv ;
   private java.math.BigDecimal ZZ10312Pdt_KgM ;
   private java.math.BigDecimal ZZ10313Pdt_KgB ;
   private java.math.BigDecimal ZZ10314Pdt_KgR ;
   private java.math.BigDecimal ZZ10315Pdt_KgTC ;
   private java.math.BigDecimal ZZ10316Pdt_KgTB ;
   private java.math.BigDecimal ZZ10317Pdt_KgA ;
   private java.math.BigDecimal ZZ10318Pdt_KgPr ;
   private java.math.BigDecimal ZZ10319Pdt_KgGi ;
   private java.math.BigDecimal ZZ10320Pdt_KgDe ;
   private java.math.BigDecimal ZZ10321Pdt_KgCn ;
   private java.math.BigDecimal ZZ10322Pdt_KgCj ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10304Pdt_maq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPdt_dia_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPdt_dia_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPdt_maq_Internalname ;
   private String A10304Pdt_maq ;
   private String edtPdt_maq_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPdt_kgs_Internalname ;
   private String edtPdt_kgs_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPdt_mts_Internalname ;
   private String edtPdt_mts_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtPdt_pzas_Internalname ;
   private String edtPdt_pzas_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPdt_hmmr_Internalname ;
   private String edtPdt_hmmr_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPdt_hmp_Internalname ;
   private String edtPdt_hmp_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtPdt_hpo_Internalname ;
   private String edtPdt_hpo_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtPdt_Hv_Internalname ;
   private String edtPdt_Hv_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPdt_KgM_Internalname ;
   private String edtPdt_KgM_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPdt_KgB_Internalname ;
   private String edtPdt_KgB_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPdt_KgR_Internalname ;
   private String edtPdt_KgR_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtPdt_KgTC_Internalname ;
   private String edtPdt_KgTC_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPdt_KgTB_Internalname ;
   private String edtPdt_KgTB_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPdt_KgA_Internalname ;
   private String edtPdt_KgA_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPdt_KgPr_Internalname ;
   private String edtPdt_KgPr_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtPdt_KgGi_Internalname ;
   private String edtPdt_KgGi_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtPdt_KgDe_Internalname ;
   private String edtPdt_KgDe_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtPdt_KgCn_Internalname ;
   private String edtPdt_KgCn_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtPdt_KgCj_Internalname ;
   private String edtPdt_KgCj_Jsonclick ;
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
   private String sMode1400 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ10304Pdt_maq ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10303Pdt_dia ;
   private java.util.Date A10303Pdt_dia ;
   private java.util.Date ZZ10303Pdt_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n10305Pdt_kgs ;
   private boolean n10306Pdt_mts ;
   private boolean n10307Pdt_pzas ;
   private boolean n10308Pdt_hmmr ;
   private boolean n10309Pdt_hmp ;
   private boolean n10310Pdt_hpo ;
   private boolean n10311Pdt_Hv ;
   private boolean n10312Pdt_KgM ;
   private boolean n10313Pdt_KgB ;
   private boolean n10314Pdt_KgR ;
   private boolean n10315Pdt_KgTC ;
   private boolean n10316Pdt_KgTB ;
   private boolean n10317Pdt_KgA ;
   private boolean n10318Pdt_KgPr ;
   private boolean n10319Pdt_KgGi ;
   private boolean n10320Pdt_KgDe ;
   private boolean n10321Pdt_KgCn ;
   private boolean n10322Pdt_KgCj ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T017U4_A407EmprNom ;
   private boolean[] T017U4_n407EmprNom ;
   private java.util.Date[] T017U5_A10303Pdt_dia ;
   private String[] T017U5_A10304Pdt_maq ;
   private String[] T017U5_A407EmprNom ;
   private boolean[] T017U5_n407EmprNom ;
   private java.math.BigDecimal[] T017U5_A10305Pdt_kgs ;
   private boolean[] T017U5_n10305Pdt_kgs ;
   private java.math.BigDecimal[] T017U5_A10306Pdt_mts ;
   private boolean[] T017U5_n10306Pdt_mts ;
   private int[] T017U5_A10307Pdt_pzas ;
   private boolean[] T017U5_n10307Pdt_pzas ;
   private java.math.BigDecimal[] T017U5_A10308Pdt_hmmr ;
   private boolean[] T017U5_n10308Pdt_hmmr ;
   private java.math.BigDecimal[] T017U5_A10309Pdt_hmp ;
   private boolean[] T017U5_n10309Pdt_hmp ;
   private java.math.BigDecimal[] T017U5_A10310Pdt_hpo ;
   private boolean[] T017U5_n10310Pdt_hpo ;
   private java.math.BigDecimal[] T017U5_A10311Pdt_Hv ;
   private boolean[] T017U5_n10311Pdt_Hv ;
   private java.math.BigDecimal[] T017U5_A10312Pdt_KgM ;
   private boolean[] T017U5_n10312Pdt_KgM ;
   private java.math.BigDecimal[] T017U5_A10313Pdt_KgB ;
   private boolean[] T017U5_n10313Pdt_KgB ;
   private java.math.BigDecimal[] T017U5_A10314Pdt_KgR ;
   private boolean[] T017U5_n10314Pdt_KgR ;
   private java.math.BigDecimal[] T017U5_A10315Pdt_KgTC ;
   private boolean[] T017U5_n10315Pdt_KgTC ;
   private java.math.BigDecimal[] T017U5_A10316Pdt_KgTB ;
   private boolean[] T017U5_n10316Pdt_KgTB ;
   private java.math.BigDecimal[] T017U5_A10317Pdt_KgA ;
   private boolean[] T017U5_n10317Pdt_KgA ;
   private java.math.BigDecimal[] T017U5_A10318Pdt_KgPr ;
   private boolean[] T017U5_n10318Pdt_KgPr ;
   private java.math.BigDecimal[] T017U5_A10319Pdt_KgGi ;
   private boolean[] T017U5_n10319Pdt_KgGi ;
   private java.math.BigDecimal[] T017U5_A10320Pdt_KgDe ;
   private boolean[] T017U5_n10320Pdt_KgDe ;
   private java.math.BigDecimal[] T017U5_A10321Pdt_KgCn ;
   private boolean[] T017U5_n10321Pdt_KgCn ;
   private java.math.BigDecimal[] T017U5_A10322Pdt_KgCj ;
   private boolean[] T017U5_n10322Pdt_KgCj ;
   private String[] T017U5_A396EmprCod ;
   private String[] T017U6_A396EmprCod ;
   private java.util.Date[] T017U6_A10303Pdt_dia ;
   private String[] T017U6_A10304Pdt_maq ;
   private java.util.Date[] T017U3_A10303Pdt_dia ;
   private String[] T017U3_A10304Pdt_maq ;
   private java.math.BigDecimal[] T017U3_A10305Pdt_kgs ;
   private boolean[] T017U3_n10305Pdt_kgs ;
   private java.math.BigDecimal[] T017U3_A10306Pdt_mts ;
   private boolean[] T017U3_n10306Pdt_mts ;
   private int[] T017U3_A10307Pdt_pzas ;
   private boolean[] T017U3_n10307Pdt_pzas ;
   private java.math.BigDecimal[] T017U3_A10308Pdt_hmmr ;
   private boolean[] T017U3_n10308Pdt_hmmr ;
   private java.math.BigDecimal[] T017U3_A10309Pdt_hmp ;
   private boolean[] T017U3_n10309Pdt_hmp ;
   private java.math.BigDecimal[] T017U3_A10310Pdt_hpo ;
   private boolean[] T017U3_n10310Pdt_hpo ;
   private java.math.BigDecimal[] T017U3_A10311Pdt_Hv ;
   private boolean[] T017U3_n10311Pdt_Hv ;
   private java.math.BigDecimal[] T017U3_A10312Pdt_KgM ;
   private boolean[] T017U3_n10312Pdt_KgM ;
   private java.math.BigDecimal[] T017U3_A10313Pdt_KgB ;
   private boolean[] T017U3_n10313Pdt_KgB ;
   private java.math.BigDecimal[] T017U3_A10314Pdt_KgR ;
   private boolean[] T017U3_n10314Pdt_KgR ;
   private java.math.BigDecimal[] T017U3_A10315Pdt_KgTC ;
   private boolean[] T017U3_n10315Pdt_KgTC ;
   private java.math.BigDecimal[] T017U3_A10316Pdt_KgTB ;
   private boolean[] T017U3_n10316Pdt_KgTB ;
   private java.math.BigDecimal[] T017U3_A10317Pdt_KgA ;
   private boolean[] T017U3_n10317Pdt_KgA ;
   private java.math.BigDecimal[] T017U3_A10318Pdt_KgPr ;
   private boolean[] T017U3_n10318Pdt_KgPr ;
   private java.math.BigDecimal[] T017U3_A10319Pdt_KgGi ;
   private boolean[] T017U3_n10319Pdt_KgGi ;
   private java.math.BigDecimal[] T017U3_A10320Pdt_KgDe ;
   private boolean[] T017U3_n10320Pdt_KgDe ;
   private java.math.BigDecimal[] T017U3_A10321Pdt_KgCn ;
   private boolean[] T017U3_n10321Pdt_KgCn ;
   private java.math.BigDecimal[] T017U3_A10322Pdt_KgCj ;
   private boolean[] T017U3_n10322Pdt_KgCj ;
   private String[] T017U3_A396EmprCod ;
   private String[] T017U7_A396EmprCod ;
   private java.util.Date[] T017U7_A10303Pdt_dia ;
   private String[] T017U7_A10304Pdt_maq ;
   private String[] T017U8_A396EmprCod ;
   private java.util.Date[] T017U8_A10303Pdt_dia ;
   private String[] T017U8_A10304Pdt_maq ;
   private java.util.Date[] T017U2_A10303Pdt_dia ;
   private String[] T017U2_A10304Pdt_maq ;
   private java.math.BigDecimal[] T017U2_A10305Pdt_kgs ;
   private boolean[] T017U2_n10305Pdt_kgs ;
   private java.math.BigDecimal[] T017U2_A10306Pdt_mts ;
   private boolean[] T017U2_n10306Pdt_mts ;
   private int[] T017U2_A10307Pdt_pzas ;
   private boolean[] T017U2_n10307Pdt_pzas ;
   private java.math.BigDecimal[] T017U2_A10308Pdt_hmmr ;
   private boolean[] T017U2_n10308Pdt_hmmr ;
   private java.math.BigDecimal[] T017U2_A10309Pdt_hmp ;
   private boolean[] T017U2_n10309Pdt_hmp ;
   private java.math.BigDecimal[] T017U2_A10310Pdt_hpo ;
   private boolean[] T017U2_n10310Pdt_hpo ;
   private java.math.BigDecimal[] T017U2_A10311Pdt_Hv ;
   private boolean[] T017U2_n10311Pdt_Hv ;
   private java.math.BigDecimal[] T017U2_A10312Pdt_KgM ;
   private boolean[] T017U2_n10312Pdt_KgM ;
   private java.math.BigDecimal[] T017U2_A10313Pdt_KgB ;
   private boolean[] T017U2_n10313Pdt_KgB ;
   private java.math.BigDecimal[] T017U2_A10314Pdt_KgR ;
   private boolean[] T017U2_n10314Pdt_KgR ;
   private java.math.BigDecimal[] T017U2_A10315Pdt_KgTC ;
   private boolean[] T017U2_n10315Pdt_KgTC ;
   private java.math.BigDecimal[] T017U2_A10316Pdt_KgTB ;
   private boolean[] T017U2_n10316Pdt_KgTB ;
   private java.math.BigDecimal[] T017U2_A10317Pdt_KgA ;
   private boolean[] T017U2_n10317Pdt_KgA ;
   private java.math.BigDecimal[] T017U2_A10318Pdt_KgPr ;
   private boolean[] T017U2_n10318Pdt_KgPr ;
   private java.math.BigDecimal[] T017U2_A10319Pdt_KgGi ;
   private boolean[] T017U2_n10319Pdt_KgGi ;
   private java.math.BigDecimal[] T017U2_A10320Pdt_KgDe ;
   private boolean[] T017U2_n10320Pdt_KgDe ;
   private java.math.BigDecimal[] T017U2_A10321Pdt_KgCn ;
   private boolean[] T017U2_n10321Pdt_KgCn ;
   private java.math.BigDecimal[] T017U2_A10322Pdt_KgCj ;
   private boolean[] T017U2_n10322Pdt_KgCj ;
   private String[] T017U2_A396EmprCod ;
   private String[] T017U12_A396EmprCod ;
   private java.util.Date[] T017U12_A10303Pdt_dia ;
   private String[] T017U12_A10304Pdt_maq ;
   private String[] T017U13_A407EmprNom ;
   private boolean[] T017U13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0500__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0500__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0500__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0500__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0500__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017U2", "SELECT Pdt_dia, Pdt_maq, Pdt_kgs, Pdt_mts, Pdt_pzas, Pdt_hmmr, Pdt_hmp, Pdt_hpo, Pdt_Hv, Pdt_KgM, Pdt_KgB, Pdt_KgR, Pdt_KgTC, Pdt_KgTB, Pdt_KgA, Pdt_KgPr, Pdt_KgGi, Pdt_KgDe, Pdt_KgCn, Pdt_KgCj, EmprCod FROM TXPTR0500 WHERE EmprCod = ? AND Pdt_dia = ? AND Pdt_maq = ?  FOR UPDATE OF Pdt_kgs, Pdt_mts, Pdt_pzas, Pdt_hmmr, Pdt_hmp, Pdt_hpo, Pdt_Hv, Pdt_KgM, Pdt_KgB, Pdt_KgR, Pdt_KgTC, Pdt_KgTB, Pdt_KgA, Pdt_KgPr, Pdt_KgGi, Pdt_KgDe, Pdt_KgCn, Pdt_KgCj NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U3", "SELECT Pdt_dia, Pdt_maq, Pdt_kgs, Pdt_mts, Pdt_pzas, Pdt_hmmr, Pdt_hmp, Pdt_hpo, Pdt_Hv, Pdt_KgM, Pdt_KgB, Pdt_KgR, Pdt_KgTC, Pdt_KgTB, Pdt_KgA, Pdt_KgPr, Pdt_KgGi, Pdt_KgDe, Pdt_KgCn, Pdt_KgCj, EmprCod FROM TXPTR0500 WHERE EmprCod = ? AND Pdt_dia = ? AND Pdt_maq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Pdt_dia, TM1.Pdt_maq, T2.EmprNom, TM1.Pdt_kgs, TM1.Pdt_mts, TM1.Pdt_pzas, TM1.Pdt_hmmr, TM1.Pdt_hmp, TM1.Pdt_hpo, TM1.Pdt_Hv, TM1.Pdt_KgM, TM1.Pdt_KgB, TM1.Pdt_KgR, TM1.Pdt_KgTC, TM1.Pdt_KgTB, TM1.Pdt_KgA, TM1.Pdt_KgPr, TM1.Pdt_KgGi, TM1.Pdt_KgDe, TM1.Pdt_KgCn, TM1.Pdt_KgCj, TM1.EmprCod FROM (TXPTR0500 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Pdt_dia = ? and TM1.Pdt_maq = ? ORDER BY TM1.EmprCod, TM1.Pdt_dia, TM1.Pdt_maq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pdt_dia, Pdt_maq FROM TXPTR0500 WHERE EmprCod = ? AND Pdt_dia = ? AND Pdt_maq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pdt_dia, Pdt_maq FROM TXPTR0500 WHERE ( Pdt_dia > ? or Pdt_dia = ? and Pdt_maq > ?) and EmprCod = ? ORDER BY EmprCod, Pdt_dia, Pdt_maq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017U8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Pdt_dia, Pdt_maq FROM TXPTR0500 WHERE ( Pdt_dia < ? or Pdt_dia = ? and Pdt_maq < ?) and EmprCod = ? ORDER BY EmprCod DESC, Pdt_dia DESC, Pdt_maq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017U9", "INSERT INTO TXPTR0500(Pdt_dia, Pdt_maq, Pdt_kgs, Pdt_mts, Pdt_pzas, Pdt_hmmr, Pdt_hmp, Pdt_hpo, Pdt_Hv, Pdt_KgM, Pdt_KgB, Pdt_KgR, Pdt_KgTC, Pdt_KgTB, Pdt_KgA, Pdt_KgPr, Pdt_KgGi, Pdt_KgDe, Pdt_KgCn, Pdt_KgCj, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0500")
         ,new UpdateCursor("T017U10", "UPDATE TXPTR0500 SET Pdt_kgs=?, Pdt_mts=?, Pdt_pzas=?, Pdt_hmmr=?, Pdt_hmp=?, Pdt_hpo=?, Pdt_Hv=?, Pdt_KgM=?, Pdt_KgB=?, Pdt_KgR=?, Pdt_KgTC=?, Pdt_KgTB=?, Pdt_KgA=?, Pdt_KgPr=?, Pdt_KgGi=?, Pdt_KgDe=?, Pdt_KgCn=?, Pdt_KgCj=?  WHERE EmprCod = ? AND Pdt_dia = ? AND Pdt_maq = ?", GX_NOMASK, "TXPTR0500")
         ,new UpdateCursor("T017U11", "DELETE FROM TXPTR0500  WHERE EmprCod = ? AND Pdt_dia = ? AND Pdt_maq = ?", GX_NOMASK, "TXPTR0500")
         ,new ForEachCursor("T017U12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Pdt_dia, Pdt_maq FROM TXPTR0500 WHERE EmprCod = ? ORDER BY EmprCod, Pdt_dia, Pdt_maq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017U13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 5 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 6 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 7 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 6);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[37], 2);
               }
               stmt.setString(21, (String)parms[38], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
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
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
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
               stmt.setString(19, (String)parms[36], 3);
               stmt.setDate(20, (java.util.Date)parms[37]);
               stmt.setString(21, (String)parms[38], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
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

