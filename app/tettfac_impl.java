package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tettfac_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DATOS ESTABILIDAD,TERMOF,ACABAR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEta_hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tettfac_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tettfac_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tettfac_impl.class ));
   }

   public tettfac_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TETTFAC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A11213Eta_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11213Eta_hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11213Eta_hdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_hdr_Jsonclick, 0, "", "", "", "", "", 1, edtEta_hdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A11214Eta_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11214Eta_hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A11214Eta_hdrr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_hdrr_Jsonclick, 0, "", "", "", "", "", 1, edtEta_hdrr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_hdrp_Internalname, GXutil.rtrim( A11215Eta_hdrp), GXutil.rtrim( localUtil.format( A11215Eta_hdrp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_hdrp_Jsonclick, 0, "", "", "", "", "", 1, edtEta_hdrp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Estabillidad", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEta_fec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_fec_Internalname, localUtil.format(A11243Eta_fec, "99/99/99"), localUtil.format( A11243Eta_fec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_fec_Jsonclick, 0, "", "", "", "", "", 1, edtEta_fec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEta_fec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEta_fec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TETTFAC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Medida Inicial", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_mi_Internalname, GXutil.ltrim( localUtil.ntoc( A11216Eta_mi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_mi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11216Eta_mi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11216Eta_mi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_mi_Jsonclick, 0, "", "", "", "", "", 1, edtEta_mi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Largura", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_l_Internalname, GXutil.ltrim( localUtil.ntoc( A11217Eta_l, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_l_Enabled!=0) ? localUtil.format( A11217Eta_l, "ZZZ9.99") : localUtil.format( A11217Eta_l, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_l_Jsonclick, 0, "", "", "", "", "", 1, edtEta_l_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Calculo =((Eta_l-50)/50)*100", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_lc_Internalname, GXutil.ltrim( localUtil.ntoc( A11218Eta_lc, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_lc_Enabled!=0) ? localUtil.format( A11218Eta_lc, "ZZZZZ9.99") : localUtil.format( A11218Eta_lc, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_lc_Jsonclick, 0, "", "", "", "", "", 1, edtEta_lc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Comprimento", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_cp_Internalname, GXutil.ltrim( localUtil.ntoc( A11219Eta_cp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_cp_Enabled!=0) ? localUtil.format( A11219Eta_cp, "ZZZ9.99") : localUtil.format( A11219Eta_cp, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_cp_Jsonclick, 0, "", "", "", "", "", 1, edtEta_cp_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Calculo =((Eta_cp-50)/50)*100", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_cpc_Internalname, GXutil.ltrim( localUtil.ntoc( A11220Eta_cpc, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_cpc_Enabled!=0) ? localUtil.format( A11220Eta_cpc, "ZZZZZ9.99") : localUtil.format( A11220Eta_cpc, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_cpc_Jsonclick, 0, "", "", "", "", "", 1, edtEta_cpc_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Medida Final", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_mf_Internalname, GXutil.ltrim( localUtil.ntoc( A11221Eta_mf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_mf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11221Eta_mf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11221Eta_mf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_mf_Jsonclick, 0, "", "", "", "", "", 1, edtEta_mf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Termofixacion", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEta_tfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tfec_Internalname, localUtil.format(A11244Eta_tfec, "99/99/99"), localUtil.format( A11244Eta_tfec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tfec_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEta_tfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEta_tfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TETTFAC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Termof Alimentacao superior", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tas_Internalname, GXutil.ltrim( localUtil.ntoc( A11222Eta_tas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11222Eta_tas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11222Eta_tas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tas_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Termof Largura em cru", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tlc_Internalname, GXutil.ltrim( localUtil.ntoc( A11223Eta_tlc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tlc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11223Eta_tlc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11223Eta_tlc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tlc_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tlc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Termof Gramagem em cru", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tgmc_Internalname, GXutil.ltrim( localUtil.ntoc( A11224Eta_tgmc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tgmc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11224Eta_tgmc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11224Eta_tgmc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tgmc_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tgmc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Termof Largura final", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tlf_Internalname, GXutil.ltrim( localUtil.ntoc( A11225Eta_tlf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tlf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11225Eta_tlf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11225Eta_tlf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tlf_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tlf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Termof Gramagem final", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tgf_Internalname, GXutil.ltrim( localUtil.ntoc( A11226Eta_tgf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tgf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11226Eta_tgf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11226Eta_tgf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tgf_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tgf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Termof AI", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tai_Internalname, GXutil.ltrim( localUtil.ntoc( A11227Eta_tai, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tai_Enabled!=0) ? localUtil.format( A11227Eta_tai, "ZZZ9.99") : localUtil.format( A11227Eta_tai, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tai_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tai_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Termof Ext", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_text_Internalname, GXutil.ltrim( localUtil.ntoc( A11228Eta_text, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_text_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11228Eta_text), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11228Eta_text), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_text_Jsonclick, 0, "", "", "", "", "", 1, edtEta_text_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Termof Vt", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tvt_Internalname, GXutil.ltrim( localUtil.ntoc( A11229Eta_tvt, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tvt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11229Eta_tvt), "ZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11229Eta_tvt), "ZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tvt_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tvt_Enabled, 0, "text", "1", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Termof Vt final", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tvtf_Internalname, GXutil.ltrim( localUtil.ntoc( A12694Eta_tvtf, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tvtf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12694Eta_tvtf), "ZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12694Eta_tvtf), "ZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tvtf_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tvtf_Enabled, 0, "text", "1", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Termof Vm", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_tvm_Internalname, GXutil.ltrim( localUtil.ntoc( A11230Eta_tvm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_tvm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11230Eta_tvm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11230Eta_tvm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_tvm_Jsonclick, 0, "", "", "", "", "", 1, edtEta_tvm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Fecha Acabado", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEta_afec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_afec_Internalname, localUtil.format(A11245Eta_afec, "99/99/99"), localUtil.format( A11245Eta_afec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_afec_Jsonclick, 0, "", "", "", "", "", 1, edtEta_afec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEta_afec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEta_afec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TETTFAC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Acabar As", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_aas_Internalname, GXutil.ltrim( localUtil.ntoc( A11231Eta_aas, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_aas_Enabled!=0) ? localUtil.format( A11231Eta_aas, "ZZZ9.99") : localUtil.format( A11231Eta_aas, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_aas_Jsonclick, 0, "", "", "", "", "", 1, edtEta_aas_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Acabar Ai", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_aai_Internalname, GXutil.ltrim( localUtil.ntoc( A11232Eta_aai, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_aai_Enabled!=0) ? localUtil.format( A11232Eta_aai, "ZZZ9.99") : localUtil.format( A11232Eta_aai, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_aai_Jsonclick, 0, "", "", "", "", "", 1, edtEta_aai_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Acabar Tr", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_atr_Internalname, GXutil.ltrim( localUtil.ntoc( A11233Eta_atr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_atr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11233Eta_atr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11233Eta_atr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_atr_Jsonclick, 0, "", "", "", "", "", 1, edtEta_atr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Acabar Vm", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_avm_Internalname, GXutil.ltrim( localUtil.ntoc( A11234Eta_avm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_avm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11234Eta_avm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11234Eta_avm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_avm_Jsonclick, 0, "", "", "", "", "", 1, edtEta_avm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Acabar Ext", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_aext_Internalname, GXutil.ltrim( localUtil.ntoc( A11235Eta_aext, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_aext_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11235Eta_aext), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11235Eta_aext), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_aext_Jsonclick, 0, "", "", "", "", "", 1, edtEta_aext_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Acabar Vti", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_avt_Internalname, GXutil.ltrim( localUtil.ntoc( A11236Eta_avt, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_avt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11236Eta_avt), "ZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11236Eta_avt), "ZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_avt_Jsonclick, 0, "", "", "", "", "", 1, edtEta_avt_Enabled, 0, "text", "1", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Acabar Vtf", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_aar_Internalname, GXutil.ltrim( localUtil.ntoc( A11237Eta_aar, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_aar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11237Eta_aar), "ZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11237Eta_aar), "ZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_aar_Jsonclick, 0, "", "", "", "", "", 1, edtEta_aar_Enabled, 0, "text", "1", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Acabar Medida", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_am_Internalname, GXutil.ltrim( localUtil.ntoc( A11238Eta_am, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_am_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11238Eta_am), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11238Eta_am), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_am_Jsonclick, 0, "", "", "", "", "", 1, edtEta_am_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Acabar Gramagem", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_ag_Internalname, GXutil.ltrim( localUtil.ntoc( A11239Eta_ag, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_ag_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11239Eta_ag), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11239Eta_ag), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_ag_Jsonclick, 0, "", "", "", "", "", 1, edtEta_ag_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Acabar Enc Comprimento", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_acp_Internalname, GXutil.ltrim( localUtil.ntoc( A11240Eta_acp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_acp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11240Eta_acp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11240Eta_acp), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_acp_Jsonclick, 0, "", "", "", "", "", 1, edtEta_acp_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Acabar Enc Largura", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_acl_Internalname, GXutil.ltrim( localUtil.ntoc( A11241Eta_acl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_acl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11241Eta_acl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11241Eta_acl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_acl_Jsonclick, 0, "", "", "", "", "", 1, edtEta_acl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Acabar Torcao", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TETTFAC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEta_at_Internalname, GXutil.ltrim( localUtil.ntoc( A11242Eta_at, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEta_at_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11242Eta_at), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11242Eta_at), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEta_at_Jsonclick, 0, "", "", "", "", "", 1, edtEta_at_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TETTFAC.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TETTFAC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TETTFAC.htm");
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
      e111B92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11213Eta_hdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z11213Eta_hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11214Eta_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11214Eta_hdrr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11215Eta_hdrp = httpContext.cgiGet( "Z11215Eta_hdrp") ;
            Z11243Eta_fec = localUtil.ctod( httpContext.cgiGet( "Z11243Eta_fec"), 0) ;
            Z11216Eta_mi = (short)(localUtil.ctol( httpContext.cgiGet( "Z11216Eta_mi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11217Eta_l = localUtil.ctond( httpContext.cgiGet( "Z11217Eta_l")) ;
            Z11218Eta_lc = localUtil.ctond( httpContext.cgiGet( "Z11218Eta_lc")) ;
            Z11219Eta_cp = localUtil.ctond( httpContext.cgiGet( "Z11219Eta_cp")) ;
            Z11220Eta_cpc = localUtil.ctond( httpContext.cgiGet( "Z11220Eta_cpc")) ;
            Z11221Eta_mf = (short)(localUtil.ctol( httpContext.cgiGet( "Z11221Eta_mf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11244Eta_tfec = localUtil.ctod( httpContext.cgiGet( "Z11244Eta_tfec"), 0) ;
            Z11222Eta_tas = (short)(localUtil.ctol( httpContext.cgiGet( "Z11222Eta_tas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11223Eta_tlc = (short)(localUtil.ctol( httpContext.cgiGet( "Z11223Eta_tlc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11224Eta_tgmc = (short)(localUtil.ctol( httpContext.cgiGet( "Z11224Eta_tgmc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11225Eta_tlf = (short)(localUtil.ctol( httpContext.cgiGet( "Z11225Eta_tlf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11226Eta_tgf = (short)(localUtil.ctol( httpContext.cgiGet( "Z11226Eta_tgf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11227Eta_tai = localUtil.ctond( httpContext.cgiGet( "Z11227Eta_tai")) ;
            Z11228Eta_text = (short)(localUtil.ctol( httpContext.cgiGet( "Z11228Eta_text"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11229Eta_tvt = localUtil.ctol( httpContext.cgiGet( "Z11229Eta_tvt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12694Eta_tvtf = localUtil.ctol( httpContext.cgiGet( "Z12694Eta_tvtf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11230Eta_tvm = (short)(localUtil.ctol( httpContext.cgiGet( "Z11230Eta_tvm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11245Eta_afec = localUtil.ctod( httpContext.cgiGet( "Z11245Eta_afec"), 0) ;
            Z11231Eta_aas = localUtil.ctond( httpContext.cgiGet( "Z11231Eta_aas")) ;
            Z11232Eta_aai = localUtil.ctond( httpContext.cgiGet( "Z11232Eta_aai")) ;
            Z11233Eta_atr = (short)(localUtil.ctol( httpContext.cgiGet( "Z11233Eta_atr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11234Eta_avm = (short)(localUtil.ctol( httpContext.cgiGet( "Z11234Eta_avm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11235Eta_aext = (short)(localUtil.ctol( httpContext.cgiGet( "Z11235Eta_aext"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11236Eta_avt = localUtil.ctol( httpContext.cgiGet( "Z11236Eta_avt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11237Eta_aar = localUtil.ctol( httpContext.cgiGet( "Z11237Eta_aar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z11238Eta_am = (short)(localUtil.ctol( httpContext.cgiGet( "Z11238Eta_am"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11239Eta_ag = (short)(localUtil.ctol( httpContext.cgiGet( "Z11239Eta_ag"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11240Eta_acp = (short)(localUtil.ctol( httpContext.cgiGet( "Z11240Eta_acp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11241Eta_acl = (short)(localUtil.ctol( httpContext.cgiGet( "Z11241Eta_acl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11242Eta_at = (short)(localUtil.ctol( httpContext.cgiGet( "Z11242Eta_at"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_HDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11213Eta_hdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
            }
            else
            {
               A11213Eta_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtEta_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_HDRR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_hdrr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11214Eta_hdrr = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
            }
            else
            {
               A11214Eta_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtEta_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
            }
            A11215Eta_hdrp = httpContext.cgiGet( edtEta_hdrp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
            if ( localUtil.vcdate( httpContext.cgiGet( edtEta_fec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETA_FEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_fec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11243Eta_fec = GXutil.nullDate() ;
               n11243Eta_fec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
            }
            else
            {
               A11243Eta_fec = localUtil.ctod( httpContext.cgiGet( edtEta_fec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11243Eta_fec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_mi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_mi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_MI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_mi_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11216Eta_mi = (short)(0) ;
               n11216Eta_mi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11216Eta_mi), 4, 0));
            }
            else
            {
               A11216Eta_mi = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_mi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11216Eta_mi = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11216Eta_mi), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEta_l_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_l_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_L");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_l_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11217Eta_l = DecimalUtil.ZERO ;
               n11217Eta_l = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrimstr( A11217Eta_l, 7, 2));
            }
            else
            {
               A11217Eta_l = localUtil.ctond( httpContext.cgiGet( edtEta_l_Internalname)) ;
               n11217Eta_l = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrimstr( A11217Eta_l, 7, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_lc_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_lc_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_LC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_lc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11218Eta_lc = DecimalUtil.ZERO ;
               n11218Eta_lc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrimstr( A11218Eta_lc, 9, 2));
            }
            else
            {
               A11218Eta_lc = localUtil.ctond( httpContext.cgiGet( edtEta_lc_Internalname)) ;
               n11218Eta_lc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrimstr( A11218Eta_lc, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEta_cp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_cp_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_CP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_cp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11219Eta_cp = DecimalUtil.ZERO ;
               n11219Eta_cp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrimstr( A11219Eta_cp, 7, 2));
            }
            else
            {
               A11219Eta_cp = localUtil.ctond( httpContext.cgiGet( edtEta_cp_Internalname)) ;
               n11219Eta_cp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrimstr( A11219Eta_cp, 7, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_cpc_Internalname)), DecimalUtil.stringToDec("-99999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_cpc_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_CPC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_cpc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11220Eta_cpc = DecimalUtil.ZERO ;
               n11220Eta_cpc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrimstr( A11220Eta_cpc, 9, 2));
            }
            else
            {
               A11220Eta_cpc = localUtil.ctond( httpContext.cgiGet( edtEta_cpc_Internalname)) ;
               n11220Eta_cpc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrimstr( A11220Eta_cpc, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_mf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_mf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_MF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_mf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11221Eta_mf = (short)(0) ;
               n11221Eta_mf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11221Eta_mf), 4, 0));
            }
            else
            {
               A11221Eta_mf = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_mf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11221Eta_mf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11221Eta_mf), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEta_tfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETA_TFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tfec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11244Eta_tfec = GXutil.nullDate() ;
               n11244Eta_tfec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
            }
            else
            {
               A11244Eta_tfec = localUtil.ctod( httpContext.cgiGet( edtEta_tfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11244Eta_tfec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11222Eta_tas = (short)(0) ;
               n11222Eta_tas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11222Eta_tas), 4, 0));
            }
            else
            {
               A11222Eta_tas = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11222Eta_tas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11222Eta_tas), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tlc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tlc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TLC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tlc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11223Eta_tlc = (short)(0) ;
               n11223Eta_tlc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11223Eta_tlc), 4, 0));
            }
            else
            {
               A11223Eta_tlc = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tlc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11223Eta_tlc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11223Eta_tlc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tgmc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tgmc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TGMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tgmc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11224Eta_tgmc = (short)(0) ;
               n11224Eta_tgmc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11224Eta_tgmc), 4, 0));
            }
            else
            {
               A11224Eta_tgmc = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tgmc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11224Eta_tgmc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11224Eta_tgmc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tlf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tlf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TLF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tlf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11225Eta_tlf = (short)(0) ;
               n11225Eta_tlf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11225Eta_tlf), 4, 0));
            }
            else
            {
               A11225Eta_tlf = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tlf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11225Eta_tlf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11225Eta_tlf), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tgf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tgf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TGF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tgf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11226Eta_tgf = (short)(0) ;
               n11226Eta_tgf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11226Eta_tgf), 4, 0));
            }
            else
            {
               A11226Eta_tgf = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tgf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11226Eta_tgf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11226Eta_tgf), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEta_tai_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_tai_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TAI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tai_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11227Eta_tai = DecimalUtil.ZERO ;
               n11227Eta_tai = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrimstr( A11227Eta_tai, 7, 2));
            }
            else
            {
               A11227Eta_tai = localUtil.ctond( httpContext.cgiGet( edtEta_tai_Internalname)) ;
               n11227Eta_tai = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrimstr( A11227Eta_tai, 7, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_text_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_text_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TEXT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_text_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11228Eta_text = (short)(0) ;
               n11228Eta_text = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11228Eta_text), 4, 0));
            }
            else
            {
               A11228Eta_text = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_text_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11228Eta_text = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11228Eta_text), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TVT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tvt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11229Eta_tvt = 0 ;
               n11229Eta_tvt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11229Eta_tvt), 14, 0));
            }
            else
            {
               A11229Eta_tvt = localUtil.ctol( httpContext.cgiGet( edtEta_tvt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n11229Eta_tvt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11229Eta_tvt), 14, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvtf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvtf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TVTF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tvtf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12694Eta_tvtf = 0 ;
               n12694Eta_tvtf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12694Eta_tvtf), 14, 0));
            }
            else
            {
               A12694Eta_tvtf = localUtil.ctol( httpContext.cgiGet( edtEta_tvtf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n12694Eta_tvtf = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12694Eta_tvtf), 14, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_tvm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_TVM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_tvm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11230Eta_tvm = (short)(0) ;
               n11230Eta_tvm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11230Eta_tvm), 4, 0));
            }
            else
            {
               A11230Eta_tvm = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_tvm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11230Eta_tvm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11230Eta_tvm), 4, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtEta_afec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ETA_AFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_afec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11245Eta_afec = GXutil.nullDate() ;
               n11245Eta_afec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
            }
            else
            {
               A11245Eta_afec = localUtil.ctod( httpContext.cgiGet( edtEta_afec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n11245Eta_afec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEta_aas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_aas_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_aas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11231Eta_aas = DecimalUtil.ZERO ;
               n11231Eta_aas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrimstr( A11231Eta_aas, 7, 2));
            }
            else
            {
               A11231Eta_aas = localUtil.ctond( httpContext.cgiGet( edtEta_aas_Internalname)) ;
               n11231Eta_aas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrimstr( A11231Eta_aas, 7, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEta_aai_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEta_aai_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AAI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_aai_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11232Eta_aai = DecimalUtil.ZERO ;
               n11232Eta_aai = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrimstr( A11232Eta_aai, 7, 2));
            }
            else
            {
               A11232Eta_aai = localUtil.ctond( httpContext.cgiGet( edtEta_aai_Internalname)) ;
               n11232Eta_aai = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrimstr( A11232Eta_aai, 7, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_atr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_atr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_ATR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_atr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11233Eta_atr = (short)(0) ;
               n11233Eta_atr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11233Eta_atr), 4, 0));
            }
            else
            {
               A11233Eta_atr = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_atr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11233Eta_atr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11233Eta_atr), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_avm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_avm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AVM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_avm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11234Eta_avm = (short)(0) ;
               n11234Eta_avm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11234Eta_avm), 4, 0));
            }
            else
            {
               A11234Eta_avm = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_avm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11234Eta_avm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11234Eta_avm), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_aext_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_aext_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AEXT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_aext_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11235Eta_aext = (short)(0) ;
               n11235Eta_aext = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11235Eta_aext), 4, 0));
            }
            else
            {
               A11235Eta_aext = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_aext_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11235Eta_aext = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11235Eta_aext), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_avt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_avt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AVT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_avt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11236Eta_avt = 0 ;
               n11236Eta_avt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11236Eta_avt), 14, 0));
            }
            else
            {
               A11236Eta_avt = localUtil.ctol( httpContext.cgiGet( edtEta_avt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n11236Eta_avt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11236Eta_avt), 14, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_aar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_aar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_aar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11237Eta_aar = 0 ;
               n11237Eta_aar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11237Eta_aar), 14, 0));
            }
            else
            {
               A11237Eta_aar = localUtil.ctol( httpContext.cgiGet( edtEta_aar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n11237Eta_aar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11237Eta_aar), 14, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_am_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_am_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_am_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11238Eta_am = (short)(0) ;
               n11238Eta_am = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11238Eta_am), 4, 0));
            }
            else
            {
               A11238Eta_am = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_am_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11238Eta_am = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11238Eta_am), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_ag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_ag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_ag_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11239Eta_ag = (short)(0) ;
               n11239Eta_ag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11239Eta_ag), 4, 0));
            }
            else
            {
               A11239Eta_ag = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_ag_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11239Eta_ag = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11239Eta_ag), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_acp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_acp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_ACP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_acp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11240Eta_acp = (short)(0) ;
               n11240Eta_acp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11240Eta_acp), 4, 0));
            }
            else
            {
               A11240Eta_acp = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_acp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11240Eta_acp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11240Eta_acp), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_acl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_acl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_ACL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_acl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11241Eta_acl = (short)(0) ;
               n11241Eta_acl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11241Eta_acl), 4, 0));
            }
            else
            {
               A11241Eta_acl = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_acl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11241Eta_acl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11241Eta_acl), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEta_at_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEta_at_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ETA_AT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEta_at_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11242Eta_at = (short)(0) ;
               n11242Eta_at = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11242Eta_at), 4, 0));
            }
            else
            {
               A11242Eta_at = (short)(localUtil.ctol( httpContext.cgiGet( edtEta_at_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11242Eta_at = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11242Eta_at), 4, 0));
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
               A11213Eta_hdr = (int)(GXutil.lval( httpContext.GetPar( "Eta_hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
               A11214Eta_hdrr = (byte)(GXutil.lval( httpContext.GetPar( "Eta_hdrr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
               A11215Eta_hdrp = httpContext.GetPar( "Eta_hdrp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
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
                        e111B92 ();
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
            initAll1B91496( ) ;
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
      disableAttributes1B91496( ) ;
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

   public void confirm_1B90( )
   {
      beforeValidate1B91496( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1B91496( ) ;
         }
         else
         {
            checkExtendedTable1B91496( ) ;
            if ( AnyError == 0 )
            {
               zm1B91496( 2) ;
            }
            closeExtendedTableCursors1B91496( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1B90( ) ;
      }
   }

   public void resetCaption1B90( )
   {
   }

   public void e111B92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tettfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tettfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tettfac_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tettfac_impl.this.A396EmprCod = GXv_char2[0] ;
      tettfac_impl.this.AV11EmprNom = GXv_char3[0] ;
      tettfac_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1B91496( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11243Eta_fec = T01B93_A11243Eta_fec[0] ;
            Z11216Eta_mi = T01B93_A11216Eta_mi[0] ;
            Z11217Eta_l = T01B93_A11217Eta_l[0] ;
            Z11218Eta_lc = T01B93_A11218Eta_lc[0] ;
            Z11219Eta_cp = T01B93_A11219Eta_cp[0] ;
            Z11220Eta_cpc = T01B93_A11220Eta_cpc[0] ;
            Z11221Eta_mf = T01B93_A11221Eta_mf[0] ;
            Z11244Eta_tfec = T01B93_A11244Eta_tfec[0] ;
            Z11222Eta_tas = T01B93_A11222Eta_tas[0] ;
            Z11223Eta_tlc = T01B93_A11223Eta_tlc[0] ;
            Z11224Eta_tgmc = T01B93_A11224Eta_tgmc[0] ;
            Z11225Eta_tlf = T01B93_A11225Eta_tlf[0] ;
            Z11226Eta_tgf = T01B93_A11226Eta_tgf[0] ;
            Z11227Eta_tai = T01B93_A11227Eta_tai[0] ;
            Z11228Eta_text = T01B93_A11228Eta_text[0] ;
            Z11229Eta_tvt = T01B93_A11229Eta_tvt[0] ;
            Z12694Eta_tvtf = T01B93_A12694Eta_tvtf[0] ;
            Z11230Eta_tvm = T01B93_A11230Eta_tvm[0] ;
            Z11245Eta_afec = T01B93_A11245Eta_afec[0] ;
            Z11231Eta_aas = T01B93_A11231Eta_aas[0] ;
            Z11232Eta_aai = T01B93_A11232Eta_aai[0] ;
            Z11233Eta_atr = T01B93_A11233Eta_atr[0] ;
            Z11234Eta_avm = T01B93_A11234Eta_avm[0] ;
            Z11235Eta_aext = T01B93_A11235Eta_aext[0] ;
            Z11236Eta_avt = T01B93_A11236Eta_avt[0] ;
            Z11237Eta_aar = T01B93_A11237Eta_aar[0] ;
            Z11238Eta_am = T01B93_A11238Eta_am[0] ;
            Z11239Eta_ag = T01B93_A11239Eta_ag[0] ;
            Z11240Eta_acp = T01B93_A11240Eta_acp[0] ;
            Z11241Eta_acl = T01B93_A11241Eta_acl[0] ;
            Z11242Eta_at = T01B93_A11242Eta_at[0] ;
         }
         else
         {
            Z11243Eta_fec = A11243Eta_fec ;
            Z11216Eta_mi = A11216Eta_mi ;
            Z11217Eta_l = A11217Eta_l ;
            Z11218Eta_lc = A11218Eta_lc ;
            Z11219Eta_cp = A11219Eta_cp ;
            Z11220Eta_cpc = A11220Eta_cpc ;
            Z11221Eta_mf = A11221Eta_mf ;
            Z11244Eta_tfec = A11244Eta_tfec ;
            Z11222Eta_tas = A11222Eta_tas ;
            Z11223Eta_tlc = A11223Eta_tlc ;
            Z11224Eta_tgmc = A11224Eta_tgmc ;
            Z11225Eta_tlf = A11225Eta_tlf ;
            Z11226Eta_tgf = A11226Eta_tgf ;
            Z11227Eta_tai = A11227Eta_tai ;
            Z11228Eta_text = A11228Eta_text ;
            Z11229Eta_tvt = A11229Eta_tvt ;
            Z12694Eta_tvtf = A12694Eta_tvtf ;
            Z11230Eta_tvm = A11230Eta_tvm ;
            Z11245Eta_afec = A11245Eta_afec ;
            Z11231Eta_aas = A11231Eta_aas ;
            Z11232Eta_aai = A11232Eta_aai ;
            Z11233Eta_atr = A11233Eta_atr ;
            Z11234Eta_avm = A11234Eta_avm ;
            Z11235Eta_aext = A11235Eta_aext ;
            Z11236Eta_avt = A11236Eta_avt ;
            Z11237Eta_aar = A11237Eta_aar ;
            Z11238Eta_am = A11238Eta_am ;
            Z11239Eta_ag = A11239Eta_ag ;
            Z11240Eta_acp = A11240Eta_acp ;
            Z11241Eta_acl = A11241Eta_acl ;
            Z11242Eta_at = A11242Eta_at ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11213Eta_hdr = A11213Eta_hdr ;
         Z11214Eta_hdrr = A11214Eta_hdrr ;
         Z11215Eta_hdrp = A11215Eta_hdrp ;
         Z11243Eta_fec = A11243Eta_fec ;
         Z11216Eta_mi = A11216Eta_mi ;
         Z11217Eta_l = A11217Eta_l ;
         Z11218Eta_lc = A11218Eta_lc ;
         Z11219Eta_cp = A11219Eta_cp ;
         Z11220Eta_cpc = A11220Eta_cpc ;
         Z11221Eta_mf = A11221Eta_mf ;
         Z11244Eta_tfec = A11244Eta_tfec ;
         Z11222Eta_tas = A11222Eta_tas ;
         Z11223Eta_tlc = A11223Eta_tlc ;
         Z11224Eta_tgmc = A11224Eta_tgmc ;
         Z11225Eta_tlf = A11225Eta_tlf ;
         Z11226Eta_tgf = A11226Eta_tgf ;
         Z11227Eta_tai = A11227Eta_tai ;
         Z11228Eta_text = A11228Eta_text ;
         Z11229Eta_tvt = A11229Eta_tvt ;
         Z12694Eta_tvtf = A12694Eta_tvtf ;
         Z11230Eta_tvm = A11230Eta_tvm ;
         Z11245Eta_afec = A11245Eta_afec ;
         Z11231Eta_aas = A11231Eta_aas ;
         Z11232Eta_aai = A11232Eta_aai ;
         Z11233Eta_atr = A11233Eta_atr ;
         Z11234Eta_avm = A11234Eta_avm ;
         Z11235Eta_aext = A11235Eta_aext ;
         Z11236Eta_avt = A11236Eta_avt ;
         Z11237Eta_aar = A11237Eta_aar ;
         Z11238Eta_am = A11238Eta_am ;
         Z11239Eta_ag = A11239Eta_ag ;
         Z11240Eta_acp = A11240Eta_acp ;
         Z11241Eta_acl = A11241Eta_acl ;
         Z11242Eta_at = A11242Eta_at ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TETTFAC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01B94 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01B94_A407EmprNom[0] ;
      n407EmprNom = T01B94_n407EmprNom[0] ;
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

   public void load1B91496( )
   {
      /* Using cursor T01B95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1496 = (short)(1) ;
         A407EmprNom = T01B95_A407EmprNom[0] ;
         n407EmprNom = T01B95_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11243Eta_fec = T01B95_A11243Eta_fec[0] ;
         n11243Eta_fec = T01B95_n11243Eta_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
         A11216Eta_mi = T01B95_A11216Eta_mi[0] ;
         n11216Eta_mi = T01B95_n11216Eta_mi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11216Eta_mi), 4, 0));
         A11217Eta_l = T01B95_A11217Eta_l[0] ;
         n11217Eta_l = T01B95_n11217Eta_l[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrimstr( A11217Eta_l, 7, 2));
         A11218Eta_lc = T01B95_A11218Eta_lc[0] ;
         n11218Eta_lc = T01B95_n11218Eta_lc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrimstr( A11218Eta_lc, 9, 2));
         A11219Eta_cp = T01B95_A11219Eta_cp[0] ;
         n11219Eta_cp = T01B95_n11219Eta_cp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrimstr( A11219Eta_cp, 7, 2));
         A11220Eta_cpc = T01B95_A11220Eta_cpc[0] ;
         n11220Eta_cpc = T01B95_n11220Eta_cpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrimstr( A11220Eta_cpc, 9, 2));
         A11221Eta_mf = T01B95_A11221Eta_mf[0] ;
         n11221Eta_mf = T01B95_n11221Eta_mf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11221Eta_mf), 4, 0));
         A11244Eta_tfec = T01B95_A11244Eta_tfec[0] ;
         n11244Eta_tfec = T01B95_n11244Eta_tfec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
         A11222Eta_tas = T01B95_A11222Eta_tas[0] ;
         n11222Eta_tas = T01B95_n11222Eta_tas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11222Eta_tas), 4, 0));
         A11223Eta_tlc = T01B95_A11223Eta_tlc[0] ;
         n11223Eta_tlc = T01B95_n11223Eta_tlc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11223Eta_tlc), 4, 0));
         A11224Eta_tgmc = T01B95_A11224Eta_tgmc[0] ;
         n11224Eta_tgmc = T01B95_n11224Eta_tgmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11224Eta_tgmc), 4, 0));
         A11225Eta_tlf = T01B95_A11225Eta_tlf[0] ;
         n11225Eta_tlf = T01B95_n11225Eta_tlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11225Eta_tlf), 4, 0));
         A11226Eta_tgf = T01B95_A11226Eta_tgf[0] ;
         n11226Eta_tgf = T01B95_n11226Eta_tgf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11226Eta_tgf), 4, 0));
         A11227Eta_tai = T01B95_A11227Eta_tai[0] ;
         n11227Eta_tai = T01B95_n11227Eta_tai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrimstr( A11227Eta_tai, 7, 2));
         A11228Eta_text = T01B95_A11228Eta_text[0] ;
         n11228Eta_text = T01B95_n11228Eta_text[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11228Eta_text), 4, 0));
         A11229Eta_tvt = T01B95_A11229Eta_tvt[0] ;
         n11229Eta_tvt = T01B95_n11229Eta_tvt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11229Eta_tvt), 14, 0));
         A12694Eta_tvtf = T01B95_A12694Eta_tvtf[0] ;
         n12694Eta_tvtf = T01B95_n12694Eta_tvtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12694Eta_tvtf), 14, 0));
         A11230Eta_tvm = T01B95_A11230Eta_tvm[0] ;
         n11230Eta_tvm = T01B95_n11230Eta_tvm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11230Eta_tvm), 4, 0));
         A11245Eta_afec = T01B95_A11245Eta_afec[0] ;
         n11245Eta_afec = T01B95_n11245Eta_afec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
         A11231Eta_aas = T01B95_A11231Eta_aas[0] ;
         n11231Eta_aas = T01B95_n11231Eta_aas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrimstr( A11231Eta_aas, 7, 2));
         A11232Eta_aai = T01B95_A11232Eta_aai[0] ;
         n11232Eta_aai = T01B95_n11232Eta_aai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrimstr( A11232Eta_aai, 7, 2));
         A11233Eta_atr = T01B95_A11233Eta_atr[0] ;
         n11233Eta_atr = T01B95_n11233Eta_atr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11233Eta_atr), 4, 0));
         A11234Eta_avm = T01B95_A11234Eta_avm[0] ;
         n11234Eta_avm = T01B95_n11234Eta_avm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11234Eta_avm), 4, 0));
         A11235Eta_aext = T01B95_A11235Eta_aext[0] ;
         n11235Eta_aext = T01B95_n11235Eta_aext[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11235Eta_aext), 4, 0));
         A11236Eta_avt = T01B95_A11236Eta_avt[0] ;
         n11236Eta_avt = T01B95_n11236Eta_avt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11236Eta_avt), 14, 0));
         A11237Eta_aar = T01B95_A11237Eta_aar[0] ;
         n11237Eta_aar = T01B95_n11237Eta_aar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11237Eta_aar), 14, 0));
         A11238Eta_am = T01B95_A11238Eta_am[0] ;
         n11238Eta_am = T01B95_n11238Eta_am[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11238Eta_am), 4, 0));
         A11239Eta_ag = T01B95_A11239Eta_ag[0] ;
         n11239Eta_ag = T01B95_n11239Eta_ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11239Eta_ag), 4, 0));
         A11240Eta_acp = T01B95_A11240Eta_acp[0] ;
         n11240Eta_acp = T01B95_n11240Eta_acp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11240Eta_acp), 4, 0));
         A11241Eta_acl = T01B95_A11241Eta_acl[0] ;
         n11241Eta_acl = T01B95_n11241Eta_acl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11241Eta_acl), 4, 0));
         A11242Eta_at = T01B95_A11242Eta_at[0] ;
         n11242Eta_at = T01B95_n11242Eta_at[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11242Eta_at), 4, 0));
         zm1B91496( -1) ;
      }
      pr_default.close(3);
      onLoadActions1B91496( ) ;
   }

   public void onLoadActions1B91496( )
   {
   }

   public void checkExtendedTable1B91496( )
   {
      nIsDirty_1496 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1B91496( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1B91496( )
   {
      /* Using cursor T01B96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1496 = (short)(1) ;
      }
      else
      {
         RcdFound1496 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01B93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01B93_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1B91496( 1) ;
         RcdFound1496 = (short)(1) ;
         A11213Eta_hdr = T01B93_A11213Eta_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
         A11214Eta_hdrr = T01B93_A11214Eta_hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
         A11215Eta_hdrp = T01B93_A11215Eta_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
         A11243Eta_fec = T01B93_A11243Eta_fec[0] ;
         n11243Eta_fec = T01B93_n11243Eta_fec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
         A11216Eta_mi = T01B93_A11216Eta_mi[0] ;
         n11216Eta_mi = T01B93_n11216Eta_mi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11216Eta_mi), 4, 0));
         A11217Eta_l = T01B93_A11217Eta_l[0] ;
         n11217Eta_l = T01B93_n11217Eta_l[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrimstr( A11217Eta_l, 7, 2));
         A11218Eta_lc = T01B93_A11218Eta_lc[0] ;
         n11218Eta_lc = T01B93_n11218Eta_lc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrimstr( A11218Eta_lc, 9, 2));
         A11219Eta_cp = T01B93_A11219Eta_cp[0] ;
         n11219Eta_cp = T01B93_n11219Eta_cp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrimstr( A11219Eta_cp, 7, 2));
         A11220Eta_cpc = T01B93_A11220Eta_cpc[0] ;
         n11220Eta_cpc = T01B93_n11220Eta_cpc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrimstr( A11220Eta_cpc, 9, 2));
         A11221Eta_mf = T01B93_A11221Eta_mf[0] ;
         n11221Eta_mf = T01B93_n11221Eta_mf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11221Eta_mf), 4, 0));
         A11244Eta_tfec = T01B93_A11244Eta_tfec[0] ;
         n11244Eta_tfec = T01B93_n11244Eta_tfec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
         A11222Eta_tas = T01B93_A11222Eta_tas[0] ;
         n11222Eta_tas = T01B93_n11222Eta_tas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11222Eta_tas), 4, 0));
         A11223Eta_tlc = T01B93_A11223Eta_tlc[0] ;
         n11223Eta_tlc = T01B93_n11223Eta_tlc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11223Eta_tlc), 4, 0));
         A11224Eta_tgmc = T01B93_A11224Eta_tgmc[0] ;
         n11224Eta_tgmc = T01B93_n11224Eta_tgmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11224Eta_tgmc), 4, 0));
         A11225Eta_tlf = T01B93_A11225Eta_tlf[0] ;
         n11225Eta_tlf = T01B93_n11225Eta_tlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11225Eta_tlf), 4, 0));
         A11226Eta_tgf = T01B93_A11226Eta_tgf[0] ;
         n11226Eta_tgf = T01B93_n11226Eta_tgf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11226Eta_tgf), 4, 0));
         A11227Eta_tai = T01B93_A11227Eta_tai[0] ;
         n11227Eta_tai = T01B93_n11227Eta_tai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrimstr( A11227Eta_tai, 7, 2));
         A11228Eta_text = T01B93_A11228Eta_text[0] ;
         n11228Eta_text = T01B93_n11228Eta_text[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11228Eta_text), 4, 0));
         A11229Eta_tvt = T01B93_A11229Eta_tvt[0] ;
         n11229Eta_tvt = T01B93_n11229Eta_tvt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11229Eta_tvt), 14, 0));
         A12694Eta_tvtf = T01B93_A12694Eta_tvtf[0] ;
         n12694Eta_tvtf = T01B93_n12694Eta_tvtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12694Eta_tvtf), 14, 0));
         A11230Eta_tvm = T01B93_A11230Eta_tvm[0] ;
         n11230Eta_tvm = T01B93_n11230Eta_tvm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11230Eta_tvm), 4, 0));
         A11245Eta_afec = T01B93_A11245Eta_afec[0] ;
         n11245Eta_afec = T01B93_n11245Eta_afec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
         A11231Eta_aas = T01B93_A11231Eta_aas[0] ;
         n11231Eta_aas = T01B93_n11231Eta_aas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrimstr( A11231Eta_aas, 7, 2));
         A11232Eta_aai = T01B93_A11232Eta_aai[0] ;
         n11232Eta_aai = T01B93_n11232Eta_aai[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrimstr( A11232Eta_aai, 7, 2));
         A11233Eta_atr = T01B93_A11233Eta_atr[0] ;
         n11233Eta_atr = T01B93_n11233Eta_atr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11233Eta_atr), 4, 0));
         A11234Eta_avm = T01B93_A11234Eta_avm[0] ;
         n11234Eta_avm = T01B93_n11234Eta_avm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11234Eta_avm), 4, 0));
         A11235Eta_aext = T01B93_A11235Eta_aext[0] ;
         n11235Eta_aext = T01B93_n11235Eta_aext[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11235Eta_aext), 4, 0));
         A11236Eta_avt = T01B93_A11236Eta_avt[0] ;
         n11236Eta_avt = T01B93_n11236Eta_avt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11236Eta_avt), 14, 0));
         A11237Eta_aar = T01B93_A11237Eta_aar[0] ;
         n11237Eta_aar = T01B93_n11237Eta_aar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11237Eta_aar), 14, 0));
         A11238Eta_am = T01B93_A11238Eta_am[0] ;
         n11238Eta_am = T01B93_n11238Eta_am[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11238Eta_am), 4, 0));
         A11239Eta_ag = T01B93_A11239Eta_ag[0] ;
         n11239Eta_ag = T01B93_n11239Eta_ag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11239Eta_ag), 4, 0));
         A11240Eta_acp = T01B93_A11240Eta_acp[0] ;
         n11240Eta_acp = T01B93_n11240Eta_acp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11240Eta_acp), 4, 0));
         A11241Eta_acl = T01B93_A11241Eta_acl[0] ;
         n11241Eta_acl = T01B93_n11241Eta_acl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11241Eta_acl), 4, 0));
         A11242Eta_at = T01B93_A11242Eta_at[0] ;
         n11242Eta_at = T01B93_n11242Eta_at[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11242Eta_at), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11213Eta_hdr = A11213Eta_hdr ;
         Z11214Eta_hdrr = A11214Eta_hdrr ;
         Z11215Eta_hdrp = A11215Eta_hdrp ;
         sMode1496 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1B91496( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1496 = (short)(0) ;
            initializeNonKey1B91496( ) ;
         }
         Gx_mode = sMode1496 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1496 = (short)(0) ;
         initializeNonKey1B91496( ) ;
         sMode1496 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1496 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1B91496( ) ;
      if ( RcdFound1496 == 0 )
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
      RcdFound1496 = (short)(0) ;
      /* Using cursor T01B97 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A11213Eta_hdr), Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), Byte.valueOf(A11214Eta_hdrr), Integer.valueOf(A11213Eta_hdr), A11215Eta_hdrp, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01B97_A11213Eta_hdr[0] < A11213Eta_hdr ) || ( T01B97_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( T01B97_A11214Eta_hdrr[0] < A11214Eta_hdrr ) || ( T01B97_A11214Eta_hdrr[0] == A11214Eta_hdrr ) && ( T01B97_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( GXutil.strcmp(T01B97_A11215Eta_hdrp[0], A11215Eta_hdrp) < 0 ) ) && ( GXutil.strcmp(T01B97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01B97_A11213Eta_hdr[0] > A11213Eta_hdr ) || ( T01B97_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( T01B97_A11214Eta_hdrr[0] > A11214Eta_hdrr ) || ( T01B97_A11214Eta_hdrr[0] == A11214Eta_hdrr ) && ( T01B97_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( GXutil.strcmp(T01B97_A11215Eta_hdrp[0], A11215Eta_hdrp) > 0 ) ) && ( GXutil.strcmp(T01B97_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11213Eta_hdr = T01B97_A11213Eta_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
            A11214Eta_hdrr = T01B97_A11214Eta_hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
            A11215Eta_hdrp = T01B97_A11215Eta_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
            RcdFound1496 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1496 = (short)(0) ;
      /* Using cursor T01B98 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A11213Eta_hdr), Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), Byte.valueOf(A11214Eta_hdrr), Integer.valueOf(A11213Eta_hdr), A11215Eta_hdrp, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01B98_A11213Eta_hdr[0] > A11213Eta_hdr ) || ( T01B98_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( T01B98_A11214Eta_hdrr[0] > A11214Eta_hdrr ) || ( T01B98_A11214Eta_hdrr[0] == A11214Eta_hdrr ) && ( T01B98_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( GXutil.strcmp(T01B98_A11215Eta_hdrp[0], A11215Eta_hdrp) > 0 ) ) && ( GXutil.strcmp(T01B98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01B98_A11213Eta_hdr[0] < A11213Eta_hdr ) || ( T01B98_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( T01B98_A11214Eta_hdrr[0] < A11214Eta_hdrr ) || ( T01B98_A11214Eta_hdrr[0] == A11214Eta_hdrr ) && ( T01B98_A11213Eta_hdr[0] == A11213Eta_hdr ) && ( GXutil.strcmp(T01B98_A11215Eta_hdrp[0], A11215Eta_hdrp) < 0 ) ) && ( GXutil.strcmp(T01B98_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11213Eta_hdr = T01B98_A11213Eta_hdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
            A11214Eta_hdrr = T01B98_A11214Eta_hdrr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
            A11215Eta_hdrp = T01B98_A11215Eta_hdrp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
            RcdFound1496 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1B91496( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEta_hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1B91496( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1496 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11213Eta_hdr != Z11213Eta_hdr ) || ( A11214Eta_hdrr != Z11214Eta_hdrr ) || ( GXutil.strcmp(A11215Eta_hdrp, Z11215Eta_hdrp) != 0 ) )
            {
               A11213Eta_hdr = Z11213Eta_hdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
               A11214Eta_hdrr = Z11214Eta_hdrr ;
               httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
               A11215Eta_hdrp = Z11215Eta_hdrp ;
               httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEta_hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1B91496( ) ;
               GX_FocusControl = edtEta_hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11213Eta_hdr != Z11213Eta_hdr ) || ( A11214Eta_hdrr != Z11214Eta_hdrr ) || ( GXutil.strcmp(A11215Eta_hdrp, Z11215Eta_hdrp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEta_hdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1B91496( ) ;
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
                  GX_FocusControl = edtEta_hdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1B91496( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11213Eta_hdr != Z11213Eta_hdr ) || ( A11214Eta_hdrr != Z11214Eta_hdrr ) || ( GXutil.strcmp(A11215Eta_hdrp, Z11215Eta_hdrp) != 0 ) )
      {
         A11213Eta_hdr = Z11213Eta_hdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
         A11214Eta_hdrr = Z11214Eta_hdrr ;
         httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
         A11215Eta_hdrp = Z11215Eta_hdrp ;
         httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEta_hdr_Internalname ;
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
      getKey1B91496( ) ;
      if ( RcdFound1496 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11213Eta_hdr != Z11213Eta_hdr ) || ( A11214Eta_hdrr != Z11214Eta_hdrr ) || ( GXutil.strcmp(A11215Eta_hdrp, Z11215Eta_hdrp) != 0 ) )
         {
            A11213Eta_hdr = Z11213Eta_hdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
            A11214Eta_hdrr = Z11214Eta_hdrr ;
            httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
            A11215Eta_hdrp = Z11215Eta_hdrp ;
            httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11213Eta_hdr != Z11213Eta_hdr ) || ( A11214Eta_hdrr != Z11214Eta_hdrr ) || ( GXutil.strcmp(A11215Eta_hdrp, Z11215Eta_hdrp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tettfac");
      GX_FocusControl = edtEta_fec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1B90( ) ;
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
      if ( RcdFound1496 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEta_fec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1B91496( ) ;
      if ( RcdFound1496 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEta_fec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B91496( ) ;
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
      if ( RcdFound1496 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEta_fec_Internalname ;
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
      if ( RcdFound1496 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEta_fec_Internalname ;
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
      scanStart1B91496( ) ;
      if ( RcdFound1496 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1496 != 0 )
         {
            scanNext1B91496( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEta_fec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B91496( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1B91496( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01B92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPETTFAC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11243Eta_fec), GXutil.resetTime(T01B92_A11243Eta_fec[0])) ) || ( Z11216Eta_mi != T01B92_A11216Eta_mi[0] ) || ( DecimalUtil.compareTo(Z11217Eta_l, T01B92_A11217Eta_l[0]) != 0 ) || ( DecimalUtil.compareTo(Z11218Eta_lc, T01B92_A11218Eta_lc[0]) != 0 ) || ( DecimalUtil.compareTo(Z11219Eta_cp, T01B92_A11219Eta_cp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11220Eta_cpc, T01B92_A11220Eta_cpc[0]) != 0 ) || ( Z11221Eta_mf != T01B92_A11221Eta_mf[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11244Eta_tfec), GXutil.resetTime(T01B92_A11244Eta_tfec[0])) ) || ( Z11222Eta_tas != T01B92_A11222Eta_tas[0] ) || ( Z11223Eta_tlc != T01B92_A11223Eta_tlc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11224Eta_tgmc != T01B92_A11224Eta_tgmc[0] ) || ( Z11225Eta_tlf != T01B92_A11225Eta_tlf[0] ) || ( Z11226Eta_tgf != T01B92_A11226Eta_tgf[0] ) || ( DecimalUtil.compareTo(Z11227Eta_tai, T01B92_A11227Eta_tai[0]) != 0 ) || ( Z11228Eta_text != T01B92_A11228Eta_text[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11229Eta_tvt != T01B92_A11229Eta_tvt[0] ) || ( Z12694Eta_tvtf != T01B92_A12694Eta_tvtf[0] ) || ( Z11230Eta_tvm != T01B92_A11230Eta_tvm[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z11245Eta_afec), GXutil.resetTime(T01B92_A11245Eta_afec[0])) ) || ( DecimalUtil.compareTo(Z11231Eta_aas, T01B92_A11231Eta_aas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11232Eta_aai, T01B92_A11232Eta_aai[0]) != 0 ) || ( Z11233Eta_atr != T01B92_A11233Eta_atr[0] ) || ( Z11234Eta_avm != T01B92_A11234Eta_avm[0] ) || ( Z11235Eta_aext != T01B92_A11235Eta_aext[0] ) || ( Z11236Eta_avt != T01B92_A11236Eta_avt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11237Eta_aar != T01B92_A11237Eta_aar[0] ) || ( Z11238Eta_am != T01B92_A11238Eta_am[0] ) || ( Z11239Eta_ag != T01B92_A11239Eta_ag[0] ) || ( Z11240Eta_acp != T01B92_A11240Eta_acp[0] ) || ( Z11241Eta_acl != T01B92_A11241Eta_acl[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11242Eta_at != T01B92_A11242Eta_at[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11243Eta_fec), GXutil.resetTime(T01B92_A11243Eta_fec[0])) ) )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_fec");
               GXutil.writeLogRaw("Old: ",Z11243Eta_fec);
               GXutil.writeLogRaw("Current: ",T01B92_A11243Eta_fec[0]);
            }
            if ( Z11216Eta_mi != T01B92_A11216Eta_mi[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_mi");
               GXutil.writeLogRaw("Old: ",Z11216Eta_mi);
               GXutil.writeLogRaw("Current: ",T01B92_A11216Eta_mi[0]);
            }
            if ( DecimalUtil.compareTo(Z11217Eta_l, T01B92_A11217Eta_l[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_l");
               GXutil.writeLogRaw("Old: ",Z11217Eta_l);
               GXutil.writeLogRaw("Current: ",T01B92_A11217Eta_l[0]);
            }
            if ( DecimalUtil.compareTo(Z11218Eta_lc, T01B92_A11218Eta_lc[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_lc");
               GXutil.writeLogRaw("Old: ",Z11218Eta_lc);
               GXutil.writeLogRaw("Current: ",T01B92_A11218Eta_lc[0]);
            }
            if ( DecimalUtil.compareTo(Z11219Eta_cp, T01B92_A11219Eta_cp[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_cp");
               GXutil.writeLogRaw("Old: ",Z11219Eta_cp);
               GXutil.writeLogRaw("Current: ",T01B92_A11219Eta_cp[0]);
            }
            if ( DecimalUtil.compareTo(Z11220Eta_cpc, T01B92_A11220Eta_cpc[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_cpc");
               GXutil.writeLogRaw("Old: ",Z11220Eta_cpc);
               GXutil.writeLogRaw("Current: ",T01B92_A11220Eta_cpc[0]);
            }
            if ( Z11221Eta_mf != T01B92_A11221Eta_mf[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_mf");
               GXutil.writeLogRaw("Old: ",Z11221Eta_mf);
               GXutil.writeLogRaw("Current: ",T01B92_A11221Eta_mf[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11244Eta_tfec), GXutil.resetTime(T01B92_A11244Eta_tfec[0])) ) )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tfec");
               GXutil.writeLogRaw("Old: ",Z11244Eta_tfec);
               GXutil.writeLogRaw("Current: ",T01B92_A11244Eta_tfec[0]);
            }
            if ( Z11222Eta_tas != T01B92_A11222Eta_tas[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tas");
               GXutil.writeLogRaw("Old: ",Z11222Eta_tas);
               GXutil.writeLogRaw("Current: ",T01B92_A11222Eta_tas[0]);
            }
            if ( Z11223Eta_tlc != T01B92_A11223Eta_tlc[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tlc");
               GXutil.writeLogRaw("Old: ",Z11223Eta_tlc);
               GXutil.writeLogRaw("Current: ",T01B92_A11223Eta_tlc[0]);
            }
            if ( Z11224Eta_tgmc != T01B92_A11224Eta_tgmc[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tgmc");
               GXutil.writeLogRaw("Old: ",Z11224Eta_tgmc);
               GXutil.writeLogRaw("Current: ",T01B92_A11224Eta_tgmc[0]);
            }
            if ( Z11225Eta_tlf != T01B92_A11225Eta_tlf[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tlf");
               GXutil.writeLogRaw("Old: ",Z11225Eta_tlf);
               GXutil.writeLogRaw("Current: ",T01B92_A11225Eta_tlf[0]);
            }
            if ( Z11226Eta_tgf != T01B92_A11226Eta_tgf[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tgf");
               GXutil.writeLogRaw("Old: ",Z11226Eta_tgf);
               GXutil.writeLogRaw("Current: ",T01B92_A11226Eta_tgf[0]);
            }
            if ( DecimalUtil.compareTo(Z11227Eta_tai, T01B92_A11227Eta_tai[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tai");
               GXutil.writeLogRaw("Old: ",Z11227Eta_tai);
               GXutil.writeLogRaw("Current: ",T01B92_A11227Eta_tai[0]);
            }
            if ( Z11228Eta_text != T01B92_A11228Eta_text[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_text");
               GXutil.writeLogRaw("Old: ",Z11228Eta_text);
               GXutil.writeLogRaw("Current: ",T01B92_A11228Eta_text[0]);
            }
            if ( Z11229Eta_tvt != T01B92_A11229Eta_tvt[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tvt");
               GXutil.writeLogRaw("Old: ",Z11229Eta_tvt);
               GXutil.writeLogRaw("Current: ",T01B92_A11229Eta_tvt[0]);
            }
            if ( Z12694Eta_tvtf != T01B92_A12694Eta_tvtf[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tvtf");
               GXutil.writeLogRaw("Old: ",Z12694Eta_tvtf);
               GXutil.writeLogRaw("Current: ",T01B92_A12694Eta_tvtf[0]);
            }
            if ( Z11230Eta_tvm != T01B92_A11230Eta_tvm[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_tvm");
               GXutil.writeLogRaw("Old: ",Z11230Eta_tvm);
               GXutil.writeLogRaw("Current: ",T01B92_A11230Eta_tvm[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11245Eta_afec), GXutil.resetTime(T01B92_A11245Eta_afec[0])) ) )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_afec");
               GXutil.writeLogRaw("Old: ",Z11245Eta_afec);
               GXutil.writeLogRaw("Current: ",T01B92_A11245Eta_afec[0]);
            }
            if ( DecimalUtil.compareTo(Z11231Eta_aas, T01B92_A11231Eta_aas[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_aas");
               GXutil.writeLogRaw("Old: ",Z11231Eta_aas);
               GXutil.writeLogRaw("Current: ",T01B92_A11231Eta_aas[0]);
            }
            if ( DecimalUtil.compareTo(Z11232Eta_aai, T01B92_A11232Eta_aai[0]) != 0 )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_aai");
               GXutil.writeLogRaw("Old: ",Z11232Eta_aai);
               GXutil.writeLogRaw("Current: ",T01B92_A11232Eta_aai[0]);
            }
            if ( Z11233Eta_atr != T01B92_A11233Eta_atr[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_atr");
               GXutil.writeLogRaw("Old: ",Z11233Eta_atr);
               GXutil.writeLogRaw("Current: ",T01B92_A11233Eta_atr[0]);
            }
            if ( Z11234Eta_avm != T01B92_A11234Eta_avm[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_avm");
               GXutil.writeLogRaw("Old: ",Z11234Eta_avm);
               GXutil.writeLogRaw("Current: ",T01B92_A11234Eta_avm[0]);
            }
            if ( Z11235Eta_aext != T01B92_A11235Eta_aext[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_aext");
               GXutil.writeLogRaw("Old: ",Z11235Eta_aext);
               GXutil.writeLogRaw("Current: ",T01B92_A11235Eta_aext[0]);
            }
            if ( Z11236Eta_avt != T01B92_A11236Eta_avt[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_avt");
               GXutil.writeLogRaw("Old: ",Z11236Eta_avt);
               GXutil.writeLogRaw("Current: ",T01B92_A11236Eta_avt[0]);
            }
            if ( Z11237Eta_aar != T01B92_A11237Eta_aar[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_aar");
               GXutil.writeLogRaw("Old: ",Z11237Eta_aar);
               GXutil.writeLogRaw("Current: ",T01B92_A11237Eta_aar[0]);
            }
            if ( Z11238Eta_am != T01B92_A11238Eta_am[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_am");
               GXutil.writeLogRaw("Old: ",Z11238Eta_am);
               GXutil.writeLogRaw("Current: ",T01B92_A11238Eta_am[0]);
            }
            if ( Z11239Eta_ag != T01B92_A11239Eta_ag[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_ag");
               GXutil.writeLogRaw("Old: ",Z11239Eta_ag);
               GXutil.writeLogRaw("Current: ",T01B92_A11239Eta_ag[0]);
            }
            if ( Z11240Eta_acp != T01B92_A11240Eta_acp[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_acp");
               GXutil.writeLogRaw("Old: ",Z11240Eta_acp);
               GXutil.writeLogRaw("Current: ",T01B92_A11240Eta_acp[0]);
            }
            if ( Z11241Eta_acl != T01B92_A11241Eta_acl[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_acl");
               GXutil.writeLogRaw("Old: ",Z11241Eta_acl);
               GXutil.writeLogRaw("Current: ",T01B92_A11241Eta_acl[0]);
            }
            if ( Z11242Eta_at != T01B92_A11242Eta_at[0] )
            {
               GXutil.writeLogln("tettfac:[seudo value changed for attri]"+"Eta_at");
               GXutil.writeLogRaw("Old: ",Z11242Eta_at);
               GXutil.writeLogRaw("Current: ",T01B92_A11242Eta_at[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPETTFAC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1B91496( )
   {
      beforeValidate1B91496( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B91496( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1B91496( 0) ;
         checkOptimisticConcurrency1B91496( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B91496( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1B91496( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B99 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp, Boolean.valueOf(n11243Eta_fec), A11243Eta_fec, Boolean.valueOf(n11216Eta_mi), Short.valueOf(A11216Eta_mi), Boolean.valueOf(n11217Eta_l), A11217Eta_l, Boolean.valueOf(n11218Eta_lc), A11218Eta_lc, Boolean.valueOf(n11219Eta_cp), A11219Eta_cp, Boolean.valueOf(n11220Eta_cpc), A11220Eta_cpc, Boolean.valueOf(n11221Eta_mf), Short.valueOf(A11221Eta_mf), Boolean.valueOf(n11244Eta_tfec), A11244Eta_tfec, Boolean.valueOf(n11222Eta_tas), Short.valueOf(A11222Eta_tas), Boolean.valueOf(n11223Eta_tlc), Short.valueOf(A11223Eta_tlc), Boolean.valueOf(n11224Eta_tgmc), Short.valueOf(A11224Eta_tgmc), Boolean.valueOf(n11225Eta_tlf), Short.valueOf(A11225Eta_tlf), Boolean.valueOf(n11226Eta_tgf), Short.valueOf(A11226Eta_tgf), Boolean.valueOf(n11227Eta_tai), A11227Eta_tai, Boolean.valueOf(n11228Eta_text), Short.valueOf(A11228Eta_text), Boolean.valueOf(n11229Eta_tvt), Long.valueOf(A11229Eta_tvt), Boolean.valueOf(n12694Eta_tvtf), Long.valueOf(A12694Eta_tvtf), Boolean.valueOf(n11230Eta_tvm), Short.valueOf(A11230Eta_tvm), Boolean.valueOf(n11245Eta_afec), A11245Eta_afec, Boolean.valueOf(n11231Eta_aas), A11231Eta_aas, Boolean.valueOf(n11232Eta_aai), A11232Eta_aai, Boolean.valueOf(n11233Eta_atr), Short.valueOf(A11233Eta_atr), Boolean.valueOf(n11234Eta_avm), Short.valueOf(A11234Eta_avm), Boolean.valueOf(n11235Eta_aext), Short.valueOf(A11235Eta_aext), Boolean.valueOf(n11236Eta_avt), Long.valueOf(A11236Eta_avt), Boolean.valueOf(n11237Eta_aar), Long.valueOf(A11237Eta_aar), Boolean.valueOf(n11238Eta_am), Short.valueOf(A11238Eta_am), Boolean.valueOf(n11239Eta_ag), Short.valueOf(A11239Eta_ag), Boolean.valueOf(n11240Eta_acp), Short.valueOf(A11240Eta_acp), Boolean.valueOf(n11241Eta_acl), Short.valueOf(A11241Eta_acl), Boolean.valueOf(n11242Eta_at), Short.valueOf(A11242Eta_at), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPETTFAC");
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
                        resetCaption1B90( ) ;
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
            load1B91496( ) ;
         }
         endLevel1B91496( ) ;
      }
      closeExtendedTableCursors1B91496( ) ;
   }

   public void update1B91496( )
   {
      beforeValidate1B91496( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B91496( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B91496( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B91496( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1B91496( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01B910 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n11243Eta_fec), A11243Eta_fec, Boolean.valueOf(n11216Eta_mi), Short.valueOf(A11216Eta_mi), Boolean.valueOf(n11217Eta_l), A11217Eta_l, Boolean.valueOf(n11218Eta_lc), A11218Eta_lc, Boolean.valueOf(n11219Eta_cp), A11219Eta_cp, Boolean.valueOf(n11220Eta_cpc), A11220Eta_cpc, Boolean.valueOf(n11221Eta_mf), Short.valueOf(A11221Eta_mf), Boolean.valueOf(n11244Eta_tfec), A11244Eta_tfec, Boolean.valueOf(n11222Eta_tas), Short.valueOf(A11222Eta_tas), Boolean.valueOf(n11223Eta_tlc), Short.valueOf(A11223Eta_tlc), Boolean.valueOf(n11224Eta_tgmc), Short.valueOf(A11224Eta_tgmc), Boolean.valueOf(n11225Eta_tlf), Short.valueOf(A11225Eta_tlf), Boolean.valueOf(n11226Eta_tgf), Short.valueOf(A11226Eta_tgf), Boolean.valueOf(n11227Eta_tai), A11227Eta_tai, Boolean.valueOf(n11228Eta_text), Short.valueOf(A11228Eta_text), Boolean.valueOf(n11229Eta_tvt), Long.valueOf(A11229Eta_tvt), Boolean.valueOf(n12694Eta_tvtf), Long.valueOf(A12694Eta_tvtf), Boolean.valueOf(n11230Eta_tvm), Short.valueOf(A11230Eta_tvm), Boolean.valueOf(n11245Eta_afec), A11245Eta_afec, Boolean.valueOf(n11231Eta_aas), A11231Eta_aas, Boolean.valueOf(n11232Eta_aai), A11232Eta_aai, Boolean.valueOf(n11233Eta_atr), Short.valueOf(A11233Eta_atr), Boolean.valueOf(n11234Eta_avm), Short.valueOf(A11234Eta_avm), Boolean.valueOf(n11235Eta_aext), Short.valueOf(A11235Eta_aext), Boolean.valueOf(n11236Eta_avt), Long.valueOf(A11236Eta_avt), Boolean.valueOf(n11237Eta_aar), Long.valueOf(A11237Eta_aar), Boolean.valueOf(n11238Eta_am), Short.valueOf(A11238Eta_am), Boolean.valueOf(n11239Eta_ag), Short.valueOf(A11239Eta_ag), Boolean.valueOf(n11240Eta_acp), Short.valueOf(A11240Eta_acp), Boolean.valueOf(n11241Eta_acl), Short.valueOf(A11241Eta_acl), Boolean.valueOf(n11242Eta_at), Short.valueOf(A11242Eta_at), A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPETTFAC");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPETTFAC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1B91496( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1B90( ) ;
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
         endLevel1B91496( ) ;
      }
      closeExtendedTableCursors1B91496( ) ;
   }

   public void deferredUpdate1B91496( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1B91496( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B91496( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1B91496( ) ;
         afterConfirm1B91496( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1B91496( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01B911 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11213Eta_hdr), Byte.valueOf(A11214Eta_hdrr), A11215Eta_hdrp});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPETTFAC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1496 == 0 )
                     {
                        initAll1B91496( ) ;
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
                     resetCaption1B90( ) ;
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
      sMode1496 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1B91496( ) ;
      Gx_mode = sMode1496 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1B91496( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1B91496( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1B91496( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tettfac");
         if ( AnyError == 0 )
         {
            confirmValues1B90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tettfac");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1B91496( )
   {
      /* Scan By routine */
      /* Using cursor T01B912 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1496 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1496 = (short)(1) ;
         A11213Eta_hdr = T01B912_A11213Eta_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
         A11214Eta_hdrr = T01B912_A11214Eta_hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
         A11215Eta_hdrp = T01B912_A11215Eta_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1B91496( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1496 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1496 = (short)(1) ;
         A11213Eta_hdr = T01B912_A11213Eta_hdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
         A11214Eta_hdrr = T01B912_A11214Eta_hdrr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
         A11215Eta_hdrp = T01B912_A11215Eta_hdrp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
      }
   }

   public void scanEnd1B91496( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1B91496( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1B91496( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1B91496( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1B91496( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1B91496( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1B91496( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1B91496( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEta_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_hdr_Enabled), 5, 0), true);
      edtEta_hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_hdrr_Enabled), 5, 0), true);
      edtEta_hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_hdrp_Enabled), 5, 0), true);
      edtEta_fec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_fec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_fec_Enabled), 5, 0), true);
      edtEta_mi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_mi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_mi_Enabled), 5, 0), true);
      edtEta_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_l_Enabled), 5, 0), true);
      edtEta_lc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_lc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_lc_Enabled), 5, 0), true);
      edtEta_cp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_cp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_cp_Enabled), 5, 0), true);
      edtEta_cpc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_cpc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_cpc_Enabled), 5, 0), true);
      edtEta_mf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_mf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_mf_Enabled), 5, 0), true);
      edtEta_tfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tfec_Enabled), 5, 0), true);
      edtEta_tas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tas_Enabled), 5, 0), true);
      edtEta_tlc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tlc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tlc_Enabled), 5, 0), true);
      edtEta_tgmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tgmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tgmc_Enabled), 5, 0), true);
      edtEta_tlf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tlf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tlf_Enabled), 5, 0), true);
      edtEta_tgf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tgf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tgf_Enabled), 5, 0), true);
      edtEta_tai_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tai_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tai_Enabled), 5, 0), true);
      edtEta_text_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_text_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_text_Enabled), 5, 0), true);
      edtEta_tvt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tvt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tvt_Enabled), 5, 0), true);
      edtEta_tvtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tvtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tvtf_Enabled), 5, 0), true);
      edtEta_tvm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_tvm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_tvm_Enabled), 5, 0), true);
      edtEta_afec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_afec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_afec_Enabled), 5, 0), true);
      edtEta_aas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_aas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_aas_Enabled), 5, 0), true);
      edtEta_aai_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_aai_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_aai_Enabled), 5, 0), true);
      edtEta_atr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_atr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_atr_Enabled), 5, 0), true);
      edtEta_avm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_avm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_avm_Enabled), 5, 0), true);
      edtEta_aext_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_aext_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_aext_Enabled), 5, 0), true);
      edtEta_avt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_avt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_avt_Enabled), 5, 0), true);
      edtEta_aar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_aar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_aar_Enabled), 5, 0), true);
      edtEta_am_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_am_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_am_Enabled), 5, 0), true);
      edtEta_ag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_ag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_ag_Enabled), 5, 0), true);
      edtEta_acp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_acp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_acp_Enabled), 5, 0), true);
      edtEta_acl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_acl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_acl_Enabled), 5, 0), true);
      edtEta_at_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEta_at_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEta_at_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1B91496( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1B90( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tettfac", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11213Eta_hdr", GXutil.ltrim( localUtil.ntoc( Z11213Eta_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11214Eta_hdrr", GXutil.ltrim( localUtil.ntoc( Z11214Eta_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11215Eta_hdrp", GXutil.rtrim( Z11215Eta_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11243Eta_fec", localUtil.dtoc( Z11243Eta_fec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11216Eta_mi", GXutil.ltrim( localUtil.ntoc( Z11216Eta_mi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11217Eta_l", GXutil.ltrim( localUtil.ntoc( Z11217Eta_l, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11218Eta_lc", GXutil.ltrim( localUtil.ntoc( Z11218Eta_lc, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11219Eta_cp", GXutil.ltrim( localUtil.ntoc( Z11219Eta_cp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11220Eta_cpc", GXutil.ltrim( localUtil.ntoc( Z11220Eta_cpc, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11221Eta_mf", GXutil.ltrim( localUtil.ntoc( Z11221Eta_mf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11244Eta_tfec", localUtil.dtoc( Z11244Eta_tfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11222Eta_tas", GXutil.ltrim( localUtil.ntoc( Z11222Eta_tas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11223Eta_tlc", GXutil.ltrim( localUtil.ntoc( Z11223Eta_tlc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11224Eta_tgmc", GXutil.ltrim( localUtil.ntoc( Z11224Eta_tgmc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11225Eta_tlf", GXutil.ltrim( localUtil.ntoc( Z11225Eta_tlf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11226Eta_tgf", GXutil.ltrim( localUtil.ntoc( Z11226Eta_tgf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11227Eta_tai", GXutil.ltrim( localUtil.ntoc( Z11227Eta_tai, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11228Eta_text", GXutil.ltrim( localUtil.ntoc( Z11228Eta_text, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11229Eta_tvt", GXutil.ltrim( localUtil.ntoc( Z11229Eta_tvt, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12694Eta_tvtf", GXutil.ltrim( localUtil.ntoc( Z12694Eta_tvtf, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11230Eta_tvm", GXutil.ltrim( localUtil.ntoc( Z11230Eta_tvm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11245Eta_afec", localUtil.dtoc( Z11245Eta_afec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11231Eta_aas", GXutil.ltrim( localUtil.ntoc( Z11231Eta_aas, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11232Eta_aai", GXutil.ltrim( localUtil.ntoc( Z11232Eta_aai, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11233Eta_atr", GXutil.ltrim( localUtil.ntoc( Z11233Eta_atr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11234Eta_avm", GXutil.ltrim( localUtil.ntoc( Z11234Eta_avm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11235Eta_aext", GXutil.ltrim( localUtil.ntoc( Z11235Eta_aext, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11236Eta_avt", GXutil.ltrim( localUtil.ntoc( Z11236Eta_avt, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11237Eta_aar", GXutil.ltrim( localUtil.ntoc( Z11237Eta_aar, (byte)(14), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11238Eta_am", GXutil.ltrim( localUtil.ntoc( Z11238Eta_am, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11239Eta_ag", GXutil.ltrim( localUtil.ntoc( Z11239Eta_ag, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11240Eta_acp", GXutil.ltrim( localUtil.ntoc( Z11240Eta_acp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11241Eta_acl", GXutil.ltrim( localUtil.ntoc( Z11241Eta_acl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11242Eta_at", GXutil.ltrim( localUtil.ntoc( Z11242Eta_at, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tettfac", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TETTFAC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DATOS ESTABILIDAD,TERMOF,ACABAR", "") ;
   }

   public void initializeNonKey1B91496( )
   {
      A11243Eta_fec = GXutil.nullDate() ;
      n11243Eta_fec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
      A11216Eta_mi = (short)(0) ;
      n11216Eta_mi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11216Eta_mi), 4, 0));
      A11217Eta_l = DecimalUtil.ZERO ;
      n11217Eta_l = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrimstr( A11217Eta_l, 7, 2));
      A11218Eta_lc = DecimalUtil.ZERO ;
      n11218Eta_lc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrimstr( A11218Eta_lc, 9, 2));
      A11219Eta_cp = DecimalUtil.ZERO ;
      n11219Eta_cp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrimstr( A11219Eta_cp, 7, 2));
      A11220Eta_cpc = DecimalUtil.ZERO ;
      n11220Eta_cpc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrimstr( A11220Eta_cpc, 9, 2));
      A11221Eta_mf = (short)(0) ;
      n11221Eta_mf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11221Eta_mf), 4, 0));
      A11244Eta_tfec = GXutil.nullDate() ;
      n11244Eta_tfec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
      A11222Eta_tas = (short)(0) ;
      n11222Eta_tas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11222Eta_tas), 4, 0));
      A11223Eta_tlc = (short)(0) ;
      n11223Eta_tlc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11223Eta_tlc), 4, 0));
      A11224Eta_tgmc = (short)(0) ;
      n11224Eta_tgmc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11224Eta_tgmc), 4, 0));
      A11225Eta_tlf = (short)(0) ;
      n11225Eta_tlf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11225Eta_tlf), 4, 0));
      A11226Eta_tgf = (short)(0) ;
      n11226Eta_tgf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11226Eta_tgf), 4, 0));
      A11227Eta_tai = DecimalUtil.ZERO ;
      n11227Eta_tai = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrimstr( A11227Eta_tai, 7, 2));
      A11228Eta_text = (short)(0) ;
      n11228Eta_text = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11228Eta_text), 4, 0));
      A11229Eta_tvt = 0 ;
      n11229Eta_tvt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11229Eta_tvt), 14, 0));
      A12694Eta_tvtf = 0 ;
      n12694Eta_tvtf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12694Eta_tvtf), 14, 0));
      A11230Eta_tvm = (short)(0) ;
      n11230Eta_tvm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11230Eta_tvm), 4, 0));
      A11245Eta_afec = GXutil.nullDate() ;
      n11245Eta_afec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
      A11231Eta_aas = DecimalUtil.ZERO ;
      n11231Eta_aas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrimstr( A11231Eta_aas, 7, 2));
      A11232Eta_aai = DecimalUtil.ZERO ;
      n11232Eta_aai = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrimstr( A11232Eta_aai, 7, 2));
      A11233Eta_atr = (short)(0) ;
      n11233Eta_atr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11233Eta_atr), 4, 0));
      A11234Eta_avm = (short)(0) ;
      n11234Eta_avm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11234Eta_avm), 4, 0));
      A11235Eta_aext = (short)(0) ;
      n11235Eta_aext = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11235Eta_aext), 4, 0));
      A11236Eta_avt = 0 ;
      n11236Eta_avt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11236Eta_avt), 14, 0));
      A11237Eta_aar = 0 ;
      n11237Eta_aar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11237Eta_aar), 14, 0));
      A11238Eta_am = (short)(0) ;
      n11238Eta_am = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11238Eta_am), 4, 0));
      A11239Eta_ag = (short)(0) ;
      n11239Eta_ag = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11239Eta_ag), 4, 0));
      A11240Eta_acp = (short)(0) ;
      n11240Eta_acp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11240Eta_acp), 4, 0));
      A11241Eta_acl = (short)(0) ;
      n11241Eta_acl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11241Eta_acl), 4, 0));
      A11242Eta_at = (short)(0) ;
      n11242Eta_at = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11242Eta_at), 4, 0));
      Z11243Eta_fec = GXutil.nullDate() ;
      Z11216Eta_mi = (short)(0) ;
      Z11217Eta_l = DecimalUtil.ZERO ;
      Z11218Eta_lc = DecimalUtil.ZERO ;
      Z11219Eta_cp = DecimalUtil.ZERO ;
      Z11220Eta_cpc = DecimalUtil.ZERO ;
      Z11221Eta_mf = (short)(0) ;
      Z11244Eta_tfec = GXutil.nullDate() ;
      Z11222Eta_tas = (short)(0) ;
      Z11223Eta_tlc = (short)(0) ;
      Z11224Eta_tgmc = (short)(0) ;
      Z11225Eta_tlf = (short)(0) ;
      Z11226Eta_tgf = (short)(0) ;
      Z11227Eta_tai = DecimalUtil.ZERO ;
      Z11228Eta_text = (short)(0) ;
      Z11229Eta_tvt = 0 ;
      Z12694Eta_tvtf = 0 ;
      Z11230Eta_tvm = (short)(0) ;
      Z11245Eta_afec = GXutil.nullDate() ;
      Z11231Eta_aas = DecimalUtil.ZERO ;
      Z11232Eta_aai = DecimalUtil.ZERO ;
      Z11233Eta_atr = (short)(0) ;
      Z11234Eta_avm = (short)(0) ;
      Z11235Eta_aext = (short)(0) ;
      Z11236Eta_avt = 0 ;
      Z11237Eta_aar = 0 ;
      Z11238Eta_am = (short)(0) ;
      Z11239Eta_ag = (short)(0) ;
      Z11240Eta_acp = (short)(0) ;
      Z11241Eta_acl = (short)(0) ;
      Z11242Eta_at = (short)(0) ;
   }

   public void initAll1B91496( )
   {
      A11213Eta_hdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11213Eta_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11213Eta_hdr), 8, 0));
      A11214Eta_hdrr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11214Eta_hdrr", GXutil.str( A11214Eta_hdrr, 1, 0));
      A11215Eta_hdrp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11215Eta_hdrp", A11215Eta_hdrp);
      initializeNonKey1B91496( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241563584", true, true);
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
      httpContext.AddJavascriptSource("tettfac.js", "?20268241563584", false, true);
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
      edtEta_hdr_Internalname = "ETA_HDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEta_hdrr_Internalname = "ETA_HDRR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEta_hdrp_Internalname = "ETA_HDRP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEta_fec_Internalname = "ETA_FEC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEta_mi_Internalname = "ETA_MI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEta_l_Internalname = "ETA_L" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEta_lc_Internalname = "ETA_LC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEta_cp_Internalname = "ETA_CP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEta_cpc_Internalname = "ETA_CPC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEta_mf_Internalname = "ETA_MF" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEta_tfec_Internalname = "ETA_TFEC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEta_tas_Internalname = "ETA_TAS" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEta_tlc_Internalname = "ETA_TLC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEta_tgmc_Internalname = "ETA_TGMC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtEta_tlf_Internalname = "ETA_TLF" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEta_tgf_Internalname = "ETA_TGF" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtEta_tai_Internalname = "ETA_TAI" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtEta_text_Internalname = "ETA_TEXT" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtEta_tvt_Internalname = "ETA_TVT" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtEta_tvtf_Internalname = "ETA_TVTF" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtEta_tvm_Internalname = "ETA_TVM" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtEta_afec_Internalname = "ETA_AFEC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtEta_aas_Internalname = "ETA_AAS" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtEta_aai_Internalname = "ETA_AAI" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtEta_atr_Internalname = "ETA_ATR" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtEta_avm_Internalname = "ETA_AVM" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtEta_aext_Internalname = "ETA_AEXT" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtEta_avt_Internalname = "ETA_AVT" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtEta_aar_Internalname = "ETA_AAR" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtEta_am_Internalname = "ETA_AM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtEta_ag_Internalname = "ETA_AG" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtEta_acp_Internalname = "ETA_ACP" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtEta_acl_Internalname = "ETA_ACL" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtEta_at_Internalname = "ETA_AT" ;
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
      Form.setCaption( httpContext.getMessage( "DATOS ESTABILIDAD,TERMOF,ACABAR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEta_at_Jsonclick = "" ;
      edtEta_at_Backcolor = (int)(0xFFFFFF) ;
      edtEta_at_Enabled = 1 ;
      edtEta_acl_Jsonclick = "" ;
      edtEta_acl_Backcolor = (int)(0xFFFFFF) ;
      edtEta_acl_Enabled = 1 ;
      edtEta_acp_Jsonclick = "" ;
      edtEta_acp_Backcolor = (int)(0xFFFFFF) ;
      edtEta_acp_Enabled = 1 ;
      edtEta_ag_Jsonclick = "" ;
      edtEta_ag_Backcolor = (int)(0xFFFFFF) ;
      edtEta_ag_Enabled = 1 ;
      edtEta_am_Jsonclick = "" ;
      edtEta_am_Backcolor = (int)(0xFFFFFF) ;
      edtEta_am_Enabled = 1 ;
      edtEta_aar_Jsonclick = "" ;
      edtEta_aar_Backcolor = (int)(0xFFFFFF) ;
      edtEta_aar_Enabled = 1 ;
      edtEta_avt_Jsonclick = "" ;
      edtEta_avt_Backcolor = (int)(0xFFFFFF) ;
      edtEta_avt_Enabled = 1 ;
      edtEta_aext_Jsonclick = "" ;
      edtEta_aext_Backcolor = (int)(0xFFFFFF) ;
      edtEta_aext_Enabled = 1 ;
      edtEta_avm_Jsonclick = "" ;
      edtEta_avm_Backcolor = (int)(0xFFFFFF) ;
      edtEta_avm_Enabled = 1 ;
      edtEta_atr_Jsonclick = "" ;
      edtEta_atr_Backcolor = (int)(0xFFFFFF) ;
      edtEta_atr_Enabled = 1 ;
      edtEta_aai_Jsonclick = "" ;
      edtEta_aai_Backcolor = (int)(0xFFFFFF) ;
      edtEta_aai_Enabled = 1 ;
      edtEta_aas_Jsonclick = "" ;
      edtEta_aas_Backcolor = (int)(0xFFFFFF) ;
      edtEta_aas_Enabled = 1 ;
      edtEta_afec_Jsonclick = "" ;
      edtEta_afec_Backcolor = (int)(0xFFFFFF) ;
      edtEta_afec_Enabled = 1 ;
      edtEta_tvm_Jsonclick = "" ;
      edtEta_tvm_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tvm_Enabled = 1 ;
      edtEta_tvtf_Jsonclick = "" ;
      edtEta_tvtf_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tvtf_Enabled = 1 ;
      edtEta_tvt_Jsonclick = "" ;
      edtEta_tvt_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tvt_Enabled = 1 ;
      edtEta_text_Jsonclick = "" ;
      edtEta_text_Backcolor = (int)(0xFFFFFF) ;
      edtEta_text_Enabled = 1 ;
      edtEta_tai_Jsonclick = "" ;
      edtEta_tai_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tai_Enabled = 1 ;
      edtEta_tgf_Jsonclick = "" ;
      edtEta_tgf_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tgf_Enabled = 1 ;
      edtEta_tlf_Jsonclick = "" ;
      edtEta_tlf_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tlf_Enabled = 1 ;
      edtEta_tgmc_Jsonclick = "" ;
      edtEta_tgmc_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tgmc_Enabled = 1 ;
      edtEta_tlc_Jsonclick = "" ;
      edtEta_tlc_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tlc_Enabled = 1 ;
      edtEta_tas_Jsonclick = "" ;
      edtEta_tas_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tas_Enabled = 1 ;
      edtEta_tfec_Jsonclick = "" ;
      edtEta_tfec_Backcolor = (int)(0xFFFFFF) ;
      edtEta_tfec_Enabled = 1 ;
      edtEta_mf_Jsonclick = "" ;
      edtEta_mf_Backcolor = (int)(0xFFFFFF) ;
      edtEta_mf_Enabled = 1 ;
      edtEta_cpc_Jsonclick = "" ;
      edtEta_cpc_Backcolor = (int)(0xFFFFFF) ;
      edtEta_cpc_Enabled = 1 ;
      edtEta_cp_Jsonclick = "" ;
      edtEta_cp_Backcolor = (int)(0xFFFFFF) ;
      edtEta_cp_Enabled = 1 ;
      edtEta_lc_Jsonclick = "" ;
      edtEta_lc_Backcolor = (int)(0xFFFFFF) ;
      edtEta_lc_Enabled = 1 ;
      edtEta_l_Jsonclick = "" ;
      edtEta_l_Backcolor = (int)(0xFFFFFF) ;
      edtEta_l_Enabled = 1 ;
      edtEta_mi_Jsonclick = "" ;
      edtEta_mi_Backcolor = (int)(0xFFFFFF) ;
      edtEta_mi_Enabled = 1 ;
      edtEta_fec_Jsonclick = "" ;
      edtEta_fec_Backcolor = (int)(0xFFFFFF) ;
      edtEta_fec_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEta_hdrp_Jsonclick = "" ;
      edtEta_hdrp_Backcolor = (int)(0xFFFFFF) ;
      edtEta_hdrp_Enabled = 1 ;
      edtEta_hdrr_Jsonclick = "" ;
      edtEta_hdrr_Backcolor = (int)(0xFFFFFF) ;
      edtEta_hdrr_Enabled = 1 ;
      edtEta_hdr_Jsonclick = "" ;
      edtEta_hdr_Backcolor = (int)(0xFFFFFF) ;
      edtEta_hdr_Enabled = 1 ;
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
      /* Using cursor T01B913 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01B913_A407EmprNom[0] ;
      n407EmprNom = T01B913_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtEta_fec_Internalname ;
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

   public void valid_Eta_hdrp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11243Eta_fec", localUtil.format(A11243Eta_fec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11216Eta_mi", GXutil.ltrim( localUtil.ntoc( A11216Eta_mi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11217Eta_l", GXutil.ltrim( localUtil.ntoc( A11217Eta_l, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11218Eta_lc", GXutil.ltrim( localUtil.ntoc( A11218Eta_lc, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11219Eta_cp", GXutil.ltrim( localUtil.ntoc( A11219Eta_cp, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11220Eta_cpc", GXutil.ltrim( localUtil.ntoc( A11220Eta_cpc, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11221Eta_mf", GXutil.ltrim( localUtil.ntoc( A11221Eta_mf, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11244Eta_tfec", localUtil.format(A11244Eta_tfec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11222Eta_tas", GXutil.ltrim( localUtil.ntoc( A11222Eta_tas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11223Eta_tlc", GXutil.ltrim( localUtil.ntoc( A11223Eta_tlc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11224Eta_tgmc", GXutil.ltrim( localUtil.ntoc( A11224Eta_tgmc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11225Eta_tlf", GXutil.ltrim( localUtil.ntoc( A11225Eta_tlf, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11226Eta_tgf", GXutil.ltrim( localUtil.ntoc( A11226Eta_tgf, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11227Eta_tai", GXutil.ltrim( localUtil.ntoc( A11227Eta_tai, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11228Eta_text", GXutil.ltrim( localUtil.ntoc( A11228Eta_text, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11229Eta_tvt", GXutil.ltrim( localUtil.ntoc( A11229Eta_tvt, (byte)(14), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12694Eta_tvtf", GXutil.ltrim( localUtil.ntoc( A12694Eta_tvtf, (byte)(14), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11230Eta_tvm", GXutil.ltrim( localUtil.ntoc( A11230Eta_tvm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11245Eta_afec", localUtil.format(A11245Eta_afec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11231Eta_aas", GXutil.ltrim( localUtil.ntoc( A11231Eta_aas, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11232Eta_aai", GXutil.ltrim( localUtil.ntoc( A11232Eta_aai, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11233Eta_atr", GXutil.ltrim( localUtil.ntoc( A11233Eta_atr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11234Eta_avm", GXutil.ltrim( localUtil.ntoc( A11234Eta_avm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11235Eta_aext", GXutil.ltrim( localUtil.ntoc( A11235Eta_aext, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11236Eta_avt", GXutil.ltrim( localUtil.ntoc( A11236Eta_avt, (byte)(14), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11237Eta_aar", GXutil.ltrim( localUtil.ntoc( A11237Eta_aar, (byte)(14), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11238Eta_am", GXutil.ltrim( localUtil.ntoc( A11238Eta_am, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11239Eta_ag", GXutil.ltrim( localUtil.ntoc( A11239Eta_ag, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11240Eta_acp", GXutil.ltrim( localUtil.ntoc( A11240Eta_acp, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11241Eta_acl", GXutil.ltrim( localUtil.ntoc( A11241Eta_acl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11242Eta_at", GXutil.ltrim( localUtil.ntoc( A11242Eta_at, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11213Eta_hdr", GXutil.ltrim( localUtil.ntoc( Z11213Eta_hdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11214Eta_hdrr", GXutil.ltrim( localUtil.ntoc( Z11214Eta_hdrr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11215Eta_hdrp", GXutil.rtrim( Z11215Eta_hdrp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11243Eta_fec", localUtil.format(Z11243Eta_fec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11216Eta_mi", GXutil.ltrim( localUtil.ntoc( Z11216Eta_mi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11217Eta_l", GXutil.ltrim( localUtil.ntoc( Z11217Eta_l, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11218Eta_lc", GXutil.ltrim( localUtil.ntoc( Z11218Eta_lc, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11219Eta_cp", GXutil.ltrim( localUtil.ntoc( Z11219Eta_cp, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11220Eta_cpc", GXutil.ltrim( localUtil.ntoc( Z11220Eta_cpc, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11221Eta_mf", GXutil.ltrim( localUtil.ntoc( Z11221Eta_mf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11244Eta_tfec", localUtil.format(Z11244Eta_tfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11222Eta_tas", GXutil.ltrim( localUtil.ntoc( Z11222Eta_tas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11223Eta_tlc", GXutil.ltrim( localUtil.ntoc( Z11223Eta_tlc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11224Eta_tgmc", GXutil.ltrim( localUtil.ntoc( Z11224Eta_tgmc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11225Eta_tlf", GXutil.ltrim( localUtil.ntoc( Z11225Eta_tlf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11226Eta_tgf", GXutil.ltrim( localUtil.ntoc( Z11226Eta_tgf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11227Eta_tai", GXutil.ltrim( localUtil.ntoc( Z11227Eta_tai, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11228Eta_text", GXutil.ltrim( localUtil.ntoc( Z11228Eta_text, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11229Eta_tvt", GXutil.ltrim( localUtil.ntoc( Z11229Eta_tvt, (byte)(14), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12694Eta_tvtf", GXutil.ltrim( localUtil.ntoc( Z12694Eta_tvtf, (byte)(14), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11230Eta_tvm", GXutil.ltrim( localUtil.ntoc( Z11230Eta_tvm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11245Eta_afec", localUtil.format(Z11245Eta_afec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11231Eta_aas", GXutil.ltrim( localUtil.ntoc( Z11231Eta_aas, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11232Eta_aai", GXutil.ltrim( localUtil.ntoc( Z11232Eta_aai, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11233Eta_atr", GXutil.ltrim( localUtil.ntoc( Z11233Eta_atr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11234Eta_avm", GXutil.ltrim( localUtil.ntoc( Z11234Eta_avm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11235Eta_aext", GXutil.ltrim( localUtil.ntoc( Z11235Eta_aext, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11236Eta_avt", GXutil.ltrim( localUtil.ntoc( Z11236Eta_avt, (byte)(14), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11237Eta_aar", GXutil.ltrim( localUtil.ntoc( Z11237Eta_aar, (byte)(14), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11238Eta_am", GXutil.ltrim( localUtil.ntoc( Z11238Eta_am, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11239Eta_ag", GXutil.ltrim( localUtil.ntoc( Z11239Eta_ag, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11240Eta_acp", GXutil.ltrim( localUtil.ntoc( Z11240Eta_acp, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11241Eta_acl", GXutil.ltrim( localUtil.ntoc( Z11241Eta_acl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11242Eta_at", GXutil.ltrim( localUtil.ntoc( Z11242Eta_at, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_ETA_HDR","{handler:'valid_Eta_hdr',iparms:[]");
      setEventMetadata("VALID_ETA_HDR",",oparms:[]}");
      setEventMetadata("VALID_ETA_HDRR","{handler:'valid_Eta_hdrr',iparms:[]");
      setEventMetadata("VALID_ETA_HDRR",",oparms:[]}");
      setEventMetadata("VALID_ETA_HDRP","{handler:'valid_Eta_hdrp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11213Eta_hdr',fld:'ETA_HDR',pic:'ZZZZZZZ9'},{av:'A11214Eta_hdrr',fld:'ETA_HDRR',pic:'9'},{av:'A11215Eta_hdrp',fld:'ETA_HDRP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ETA_HDRP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11243Eta_fec',fld:'ETA_FEC',pic:''},{av:'A11216Eta_mi',fld:'ETA_MI',pic:'ZZZ9'},{av:'A11217Eta_l',fld:'ETA_L',pic:'ZZZ9.99'},{av:'A11218Eta_lc',fld:'ETA_LC',pic:'ZZZZZ9.99'},{av:'A11219Eta_cp',fld:'ETA_CP',pic:'ZZZ9.99'},{av:'A11220Eta_cpc',fld:'ETA_CPC',pic:'ZZZZZ9.99'},{av:'A11221Eta_mf',fld:'ETA_MF',pic:'ZZZ9'},{av:'A11244Eta_tfec',fld:'ETA_TFEC',pic:''},{av:'A11222Eta_tas',fld:'ETA_TAS',pic:'ZZZ9'},{av:'A11223Eta_tlc',fld:'ETA_TLC',pic:'ZZZ9'},{av:'A11224Eta_tgmc',fld:'ETA_TGMC',pic:'ZZZ9'},{av:'A11225Eta_tlf',fld:'ETA_TLF',pic:'ZZZ9'},{av:'A11226Eta_tgf',fld:'ETA_TGF',pic:'ZZZ9'},{av:'A11227Eta_tai',fld:'ETA_TAI',pic:'ZZZ9.99'},{av:'A11228Eta_text',fld:'ETA_TEXT',pic:'ZZZ9'},{av:'A11229Eta_tvt',fld:'ETA_TVT',pic:'ZZZZZZZZZZZZZ9'},{av:'A12694Eta_tvtf',fld:'ETA_TVTF',pic:'ZZZZZZZZZZZZZ9'},{av:'A11230Eta_tvm',fld:'ETA_TVM',pic:'ZZZ9'},{av:'A11245Eta_afec',fld:'ETA_AFEC',pic:''},{av:'A11231Eta_aas',fld:'ETA_AAS',pic:'ZZZ9.99'},{av:'A11232Eta_aai',fld:'ETA_AAI',pic:'ZZZ9.99'},{av:'A11233Eta_atr',fld:'ETA_ATR',pic:'ZZZ9'},{av:'A11234Eta_avm',fld:'ETA_AVM',pic:'ZZZ9'},{av:'A11235Eta_aext',fld:'ETA_AEXT',pic:'ZZZ9'},{av:'A11236Eta_avt',fld:'ETA_AVT',pic:'ZZZZZZZZZZZZZ9'},{av:'A11237Eta_aar',fld:'ETA_AAR',pic:'ZZZZZZZZZZZZZ9'},{av:'A11238Eta_am',fld:'ETA_AM',pic:'ZZZ9'},{av:'A11239Eta_ag',fld:'ETA_AG',pic:'ZZZ9'},{av:'A11240Eta_acp',fld:'ETA_ACP',pic:'ZZZ9'},{av:'A11241Eta_acl',fld:'ETA_ACL',pic:'ZZZ9'},{av:'A11242Eta_at',fld:'ETA_AT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11213Eta_hdr'},{av:'Z11214Eta_hdrr'},{av:'Z11215Eta_hdrp'},{av:'Z407EmprNom'},{av:'Z11243Eta_fec'},{av:'Z11216Eta_mi'},{av:'Z11217Eta_l'},{av:'Z11218Eta_lc'},{av:'Z11219Eta_cp'},{av:'Z11220Eta_cpc'},{av:'Z11221Eta_mf'},{av:'Z11244Eta_tfec'},{av:'Z11222Eta_tas'},{av:'Z11223Eta_tlc'},{av:'Z11224Eta_tgmc'},{av:'Z11225Eta_tlf'},{av:'Z11226Eta_tgf'},{av:'Z11227Eta_tai'},{av:'Z11228Eta_text'},{av:'Z11229Eta_tvt'},{av:'Z12694Eta_tvtf'},{av:'Z11230Eta_tvm'},{av:'Z11245Eta_afec'},{av:'Z11231Eta_aas'},{av:'Z11232Eta_aai'},{av:'Z11233Eta_atr'},{av:'Z11234Eta_avm'},{av:'Z11235Eta_aext'},{av:'Z11236Eta_avt'},{av:'Z11237Eta_aar'},{av:'Z11238Eta_am'},{av:'Z11239Eta_ag'},{av:'Z11240Eta_acp'},{av:'Z11241Eta_acl'},{av:'Z11242Eta_at'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z11215Eta_hdrp = "" ;
      Z11243Eta_fec = GXutil.nullDate() ;
      Z11217Eta_l = DecimalUtil.ZERO ;
      Z11218Eta_lc = DecimalUtil.ZERO ;
      Z11219Eta_cp = DecimalUtil.ZERO ;
      Z11220Eta_cpc = DecimalUtil.ZERO ;
      Z11244Eta_tfec = GXutil.nullDate() ;
      Z11227Eta_tai = DecimalUtil.ZERO ;
      Z11245Eta_afec = GXutil.nullDate() ;
      Z11231Eta_aas = DecimalUtil.ZERO ;
      Z11232Eta_aai = DecimalUtil.ZERO ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11215Eta_hdrp = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11243Eta_fec = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11217Eta_l = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A11218Eta_lc = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A11219Eta_cp = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A11220Eta_cpc = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A11244Eta_tfec = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A11227Eta_tai = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A11245Eta_afec = GXutil.nullDate() ;
      lblTextblock25_Jsonclick = "" ;
      A11231Eta_aas = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A11232Eta_aai = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
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
      T01B94_A407EmprNom = new String[] {""} ;
      T01B94_n407EmprNom = new boolean[] {false} ;
      T01B95_A11213Eta_hdr = new int[1] ;
      T01B95_A11214Eta_hdrr = new byte[1] ;
      T01B95_A11215Eta_hdrp = new String[] {""} ;
      T01B95_A407EmprNom = new String[] {""} ;
      T01B95_n407EmprNom = new boolean[] {false} ;
      T01B95_A11243Eta_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B95_n11243Eta_fec = new boolean[] {false} ;
      T01B95_A11216Eta_mi = new short[1] ;
      T01B95_n11216Eta_mi = new boolean[] {false} ;
      T01B95_A11217Eta_l = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11217Eta_l = new boolean[] {false} ;
      T01B95_A11218Eta_lc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11218Eta_lc = new boolean[] {false} ;
      T01B95_A11219Eta_cp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11219Eta_cp = new boolean[] {false} ;
      T01B95_A11220Eta_cpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11220Eta_cpc = new boolean[] {false} ;
      T01B95_A11221Eta_mf = new short[1] ;
      T01B95_n11221Eta_mf = new boolean[] {false} ;
      T01B95_A11244Eta_tfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B95_n11244Eta_tfec = new boolean[] {false} ;
      T01B95_A11222Eta_tas = new short[1] ;
      T01B95_n11222Eta_tas = new boolean[] {false} ;
      T01B95_A11223Eta_tlc = new short[1] ;
      T01B95_n11223Eta_tlc = new boolean[] {false} ;
      T01B95_A11224Eta_tgmc = new short[1] ;
      T01B95_n11224Eta_tgmc = new boolean[] {false} ;
      T01B95_A11225Eta_tlf = new short[1] ;
      T01B95_n11225Eta_tlf = new boolean[] {false} ;
      T01B95_A11226Eta_tgf = new short[1] ;
      T01B95_n11226Eta_tgf = new boolean[] {false} ;
      T01B95_A11227Eta_tai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11227Eta_tai = new boolean[] {false} ;
      T01B95_A11228Eta_text = new short[1] ;
      T01B95_n11228Eta_text = new boolean[] {false} ;
      T01B95_A11229Eta_tvt = new long[1] ;
      T01B95_n11229Eta_tvt = new boolean[] {false} ;
      T01B95_A12694Eta_tvtf = new long[1] ;
      T01B95_n12694Eta_tvtf = new boolean[] {false} ;
      T01B95_A11230Eta_tvm = new short[1] ;
      T01B95_n11230Eta_tvm = new boolean[] {false} ;
      T01B95_A11245Eta_afec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B95_n11245Eta_afec = new boolean[] {false} ;
      T01B95_A11231Eta_aas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11231Eta_aas = new boolean[] {false} ;
      T01B95_A11232Eta_aai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B95_n11232Eta_aai = new boolean[] {false} ;
      T01B95_A11233Eta_atr = new short[1] ;
      T01B95_n11233Eta_atr = new boolean[] {false} ;
      T01B95_A11234Eta_avm = new short[1] ;
      T01B95_n11234Eta_avm = new boolean[] {false} ;
      T01B95_A11235Eta_aext = new short[1] ;
      T01B95_n11235Eta_aext = new boolean[] {false} ;
      T01B95_A11236Eta_avt = new long[1] ;
      T01B95_n11236Eta_avt = new boolean[] {false} ;
      T01B95_A11237Eta_aar = new long[1] ;
      T01B95_n11237Eta_aar = new boolean[] {false} ;
      T01B95_A11238Eta_am = new short[1] ;
      T01B95_n11238Eta_am = new boolean[] {false} ;
      T01B95_A11239Eta_ag = new short[1] ;
      T01B95_n11239Eta_ag = new boolean[] {false} ;
      T01B95_A11240Eta_acp = new short[1] ;
      T01B95_n11240Eta_acp = new boolean[] {false} ;
      T01B95_A11241Eta_acl = new short[1] ;
      T01B95_n11241Eta_acl = new boolean[] {false} ;
      T01B95_A11242Eta_at = new short[1] ;
      T01B95_n11242Eta_at = new boolean[] {false} ;
      T01B95_A396EmprCod = new String[] {""} ;
      T01B96_A396EmprCod = new String[] {""} ;
      T01B96_A11213Eta_hdr = new int[1] ;
      T01B96_A11214Eta_hdrr = new byte[1] ;
      T01B96_A11215Eta_hdrp = new String[] {""} ;
      T01B93_A11213Eta_hdr = new int[1] ;
      T01B93_A11214Eta_hdrr = new byte[1] ;
      T01B93_A11215Eta_hdrp = new String[] {""} ;
      T01B93_A11243Eta_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B93_n11243Eta_fec = new boolean[] {false} ;
      T01B93_A11216Eta_mi = new short[1] ;
      T01B93_n11216Eta_mi = new boolean[] {false} ;
      T01B93_A11217Eta_l = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11217Eta_l = new boolean[] {false} ;
      T01B93_A11218Eta_lc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11218Eta_lc = new boolean[] {false} ;
      T01B93_A11219Eta_cp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11219Eta_cp = new boolean[] {false} ;
      T01B93_A11220Eta_cpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11220Eta_cpc = new boolean[] {false} ;
      T01B93_A11221Eta_mf = new short[1] ;
      T01B93_n11221Eta_mf = new boolean[] {false} ;
      T01B93_A11244Eta_tfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B93_n11244Eta_tfec = new boolean[] {false} ;
      T01B93_A11222Eta_tas = new short[1] ;
      T01B93_n11222Eta_tas = new boolean[] {false} ;
      T01B93_A11223Eta_tlc = new short[1] ;
      T01B93_n11223Eta_tlc = new boolean[] {false} ;
      T01B93_A11224Eta_tgmc = new short[1] ;
      T01B93_n11224Eta_tgmc = new boolean[] {false} ;
      T01B93_A11225Eta_tlf = new short[1] ;
      T01B93_n11225Eta_tlf = new boolean[] {false} ;
      T01B93_A11226Eta_tgf = new short[1] ;
      T01B93_n11226Eta_tgf = new boolean[] {false} ;
      T01B93_A11227Eta_tai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11227Eta_tai = new boolean[] {false} ;
      T01B93_A11228Eta_text = new short[1] ;
      T01B93_n11228Eta_text = new boolean[] {false} ;
      T01B93_A11229Eta_tvt = new long[1] ;
      T01B93_n11229Eta_tvt = new boolean[] {false} ;
      T01B93_A12694Eta_tvtf = new long[1] ;
      T01B93_n12694Eta_tvtf = new boolean[] {false} ;
      T01B93_A11230Eta_tvm = new short[1] ;
      T01B93_n11230Eta_tvm = new boolean[] {false} ;
      T01B93_A11245Eta_afec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B93_n11245Eta_afec = new boolean[] {false} ;
      T01B93_A11231Eta_aas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11231Eta_aas = new boolean[] {false} ;
      T01B93_A11232Eta_aai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B93_n11232Eta_aai = new boolean[] {false} ;
      T01B93_A11233Eta_atr = new short[1] ;
      T01B93_n11233Eta_atr = new boolean[] {false} ;
      T01B93_A11234Eta_avm = new short[1] ;
      T01B93_n11234Eta_avm = new boolean[] {false} ;
      T01B93_A11235Eta_aext = new short[1] ;
      T01B93_n11235Eta_aext = new boolean[] {false} ;
      T01B93_A11236Eta_avt = new long[1] ;
      T01B93_n11236Eta_avt = new boolean[] {false} ;
      T01B93_A11237Eta_aar = new long[1] ;
      T01B93_n11237Eta_aar = new boolean[] {false} ;
      T01B93_A11238Eta_am = new short[1] ;
      T01B93_n11238Eta_am = new boolean[] {false} ;
      T01B93_A11239Eta_ag = new short[1] ;
      T01B93_n11239Eta_ag = new boolean[] {false} ;
      T01B93_A11240Eta_acp = new short[1] ;
      T01B93_n11240Eta_acp = new boolean[] {false} ;
      T01B93_A11241Eta_acl = new short[1] ;
      T01B93_n11241Eta_acl = new boolean[] {false} ;
      T01B93_A11242Eta_at = new short[1] ;
      T01B93_n11242Eta_at = new boolean[] {false} ;
      T01B93_A396EmprCod = new String[] {""} ;
      sMode1496 = "" ;
      T01B97_A396EmprCod = new String[] {""} ;
      T01B97_A11213Eta_hdr = new int[1] ;
      T01B97_A11214Eta_hdrr = new byte[1] ;
      T01B97_A11215Eta_hdrp = new String[] {""} ;
      T01B98_A396EmprCod = new String[] {""} ;
      T01B98_A11213Eta_hdr = new int[1] ;
      T01B98_A11214Eta_hdrr = new byte[1] ;
      T01B98_A11215Eta_hdrp = new String[] {""} ;
      T01B92_A11213Eta_hdr = new int[1] ;
      T01B92_A11214Eta_hdrr = new byte[1] ;
      T01B92_A11215Eta_hdrp = new String[] {""} ;
      T01B92_A11243Eta_fec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B92_n11243Eta_fec = new boolean[] {false} ;
      T01B92_A11216Eta_mi = new short[1] ;
      T01B92_n11216Eta_mi = new boolean[] {false} ;
      T01B92_A11217Eta_l = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11217Eta_l = new boolean[] {false} ;
      T01B92_A11218Eta_lc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11218Eta_lc = new boolean[] {false} ;
      T01B92_A11219Eta_cp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11219Eta_cp = new boolean[] {false} ;
      T01B92_A11220Eta_cpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11220Eta_cpc = new boolean[] {false} ;
      T01B92_A11221Eta_mf = new short[1] ;
      T01B92_n11221Eta_mf = new boolean[] {false} ;
      T01B92_A11244Eta_tfec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B92_n11244Eta_tfec = new boolean[] {false} ;
      T01B92_A11222Eta_tas = new short[1] ;
      T01B92_n11222Eta_tas = new boolean[] {false} ;
      T01B92_A11223Eta_tlc = new short[1] ;
      T01B92_n11223Eta_tlc = new boolean[] {false} ;
      T01B92_A11224Eta_tgmc = new short[1] ;
      T01B92_n11224Eta_tgmc = new boolean[] {false} ;
      T01B92_A11225Eta_tlf = new short[1] ;
      T01B92_n11225Eta_tlf = new boolean[] {false} ;
      T01B92_A11226Eta_tgf = new short[1] ;
      T01B92_n11226Eta_tgf = new boolean[] {false} ;
      T01B92_A11227Eta_tai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11227Eta_tai = new boolean[] {false} ;
      T01B92_A11228Eta_text = new short[1] ;
      T01B92_n11228Eta_text = new boolean[] {false} ;
      T01B92_A11229Eta_tvt = new long[1] ;
      T01B92_n11229Eta_tvt = new boolean[] {false} ;
      T01B92_A12694Eta_tvtf = new long[1] ;
      T01B92_n12694Eta_tvtf = new boolean[] {false} ;
      T01B92_A11230Eta_tvm = new short[1] ;
      T01B92_n11230Eta_tvm = new boolean[] {false} ;
      T01B92_A11245Eta_afec = new java.util.Date[] {GXutil.nullDate()} ;
      T01B92_n11245Eta_afec = new boolean[] {false} ;
      T01B92_A11231Eta_aas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11231Eta_aas = new boolean[] {false} ;
      T01B92_A11232Eta_aai = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01B92_n11232Eta_aai = new boolean[] {false} ;
      T01B92_A11233Eta_atr = new short[1] ;
      T01B92_n11233Eta_atr = new boolean[] {false} ;
      T01B92_A11234Eta_avm = new short[1] ;
      T01B92_n11234Eta_avm = new boolean[] {false} ;
      T01B92_A11235Eta_aext = new short[1] ;
      T01B92_n11235Eta_aext = new boolean[] {false} ;
      T01B92_A11236Eta_avt = new long[1] ;
      T01B92_n11236Eta_avt = new boolean[] {false} ;
      T01B92_A11237Eta_aar = new long[1] ;
      T01B92_n11237Eta_aar = new boolean[] {false} ;
      T01B92_A11238Eta_am = new short[1] ;
      T01B92_n11238Eta_am = new boolean[] {false} ;
      T01B92_A11239Eta_ag = new short[1] ;
      T01B92_n11239Eta_ag = new boolean[] {false} ;
      T01B92_A11240Eta_acp = new short[1] ;
      T01B92_n11240Eta_acp = new boolean[] {false} ;
      T01B92_A11241Eta_acl = new short[1] ;
      T01B92_n11241Eta_acl = new boolean[] {false} ;
      T01B92_A11242Eta_at = new short[1] ;
      T01B92_n11242Eta_at = new boolean[] {false} ;
      T01B92_A396EmprCod = new String[] {""} ;
      T01B912_A396EmprCod = new String[] {""} ;
      T01B912_A11213Eta_hdr = new int[1] ;
      T01B912_A11214Eta_hdrr = new byte[1] ;
      T01B912_A11215Eta_hdrp = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01B913_A407EmprNom = new String[] {""} ;
      T01B913_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11215Eta_hdrp = "" ;
      ZZ407EmprNom = "" ;
      ZZ11243Eta_fec = GXutil.nullDate() ;
      ZZ11217Eta_l = DecimalUtil.ZERO ;
      ZZ11218Eta_lc = DecimalUtil.ZERO ;
      ZZ11219Eta_cp = DecimalUtil.ZERO ;
      ZZ11220Eta_cpc = DecimalUtil.ZERO ;
      ZZ11244Eta_tfec = GXutil.nullDate() ;
      ZZ11227Eta_tai = DecimalUtil.ZERO ;
      ZZ11245Eta_afec = GXutil.nullDate() ;
      ZZ11231Eta_aas = DecimalUtil.ZERO ;
      ZZ11232Eta_aai = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tettfac__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tettfac__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tettfac__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tettfac__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tettfac__default(),
         new Object[] {
             new Object[] {
            T01B92_A11213Eta_hdr, T01B92_A11214Eta_hdrr, T01B92_A11215Eta_hdrp, T01B92_A11243Eta_fec, T01B92_n11243Eta_fec, T01B92_A11216Eta_mi, T01B92_n11216Eta_mi, T01B92_A11217Eta_l, T01B92_n11217Eta_l, T01B92_A11218Eta_lc,
            T01B92_n11218Eta_lc, T01B92_A11219Eta_cp, T01B92_n11219Eta_cp, T01B92_A11220Eta_cpc, T01B92_n11220Eta_cpc, T01B92_A11221Eta_mf, T01B92_n11221Eta_mf, T01B92_A11244Eta_tfec, T01B92_n11244Eta_tfec, T01B92_A11222Eta_tas,
            T01B92_n11222Eta_tas, T01B92_A11223Eta_tlc, T01B92_n11223Eta_tlc, T01B92_A11224Eta_tgmc, T01B92_n11224Eta_tgmc, T01B92_A11225Eta_tlf, T01B92_n11225Eta_tlf, T01B92_A11226Eta_tgf, T01B92_n11226Eta_tgf, T01B92_A11227Eta_tai,
            T01B92_n11227Eta_tai, T01B92_A11228Eta_text, T01B92_n11228Eta_text, T01B92_A11229Eta_tvt, T01B92_n11229Eta_tvt, T01B92_A12694Eta_tvtf, T01B92_n12694Eta_tvtf, T01B92_A11230Eta_tvm, T01B92_n11230Eta_tvm, T01B92_A11245Eta_afec,
            T01B92_n11245Eta_afec, T01B92_A11231Eta_aas, T01B92_n11231Eta_aas, T01B92_A11232Eta_aai, T01B92_n11232Eta_aai, T01B92_A11233Eta_atr, T01B92_n11233Eta_atr, T01B92_A11234Eta_avm, T01B92_n11234Eta_avm, T01B92_A11235Eta_aext,
            T01B92_n11235Eta_aext, T01B92_A11236Eta_avt, T01B92_n11236Eta_avt, T01B92_A11237Eta_aar, T01B92_n11237Eta_aar, T01B92_A11238Eta_am, T01B92_n11238Eta_am, T01B92_A11239Eta_ag, T01B92_n11239Eta_ag, T01B92_A11240Eta_acp,
            T01B92_n11240Eta_acp, T01B92_A11241Eta_acl, T01B92_n11241Eta_acl, T01B92_A11242Eta_at, T01B92_n11242Eta_at, T01B92_A396EmprCod
            }
            , new Object[] {
            T01B93_A11213Eta_hdr, T01B93_A11214Eta_hdrr, T01B93_A11215Eta_hdrp, T01B93_A11243Eta_fec, T01B93_n11243Eta_fec, T01B93_A11216Eta_mi, T01B93_n11216Eta_mi, T01B93_A11217Eta_l, T01B93_n11217Eta_l, T01B93_A11218Eta_lc,
            T01B93_n11218Eta_lc, T01B93_A11219Eta_cp, T01B93_n11219Eta_cp, T01B93_A11220Eta_cpc, T01B93_n11220Eta_cpc, T01B93_A11221Eta_mf, T01B93_n11221Eta_mf, T01B93_A11244Eta_tfec, T01B93_n11244Eta_tfec, T01B93_A11222Eta_tas,
            T01B93_n11222Eta_tas, T01B93_A11223Eta_tlc, T01B93_n11223Eta_tlc, T01B93_A11224Eta_tgmc, T01B93_n11224Eta_tgmc, T01B93_A11225Eta_tlf, T01B93_n11225Eta_tlf, T01B93_A11226Eta_tgf, T01B93_n11226Eta_tgf, T01B93_A11227Eta_tai,
            T01B93_n11227Eta_tai, T01B93_A11228Eta_text, T01B93_n11228Eta_text, T01B93_A11229Eta_tvt, T01B93_n11229Eta_tvt, T01B93_A12694Eta_tvtf, T01B93_n12694Eta_tvtf, T01B93_A11230Eta_tvm, T01B93_n11230Eta_tvm, T01B93_A11245Eta_afec,
            T01B93_n11245Eta_afec, T01B93_A11231Eta_aas, T01B93_n11231Eta_aas, T01B93_A11232Eta_aai, T01B93_n11232Eta_aai, T01B93_A11233Eta_atr, T01B93_n11233Eta_atr, T01B93_A11234Eta_avm, T01B93_n11234Eta_avm, T01B93_A11235Eta_aext,
            T01B93_n11235Eta_aext, T01B93_A11236Eta_avt, T01B93_n11236Eta_avt, T01B93_A11237Eta_aar, T01B93_n11237Eta_aar, T01B93_A11238Eta_am, T01B93_n11238Eta_am, T01B93_A11239Eta_ag, T01B93_n11239Eta_ag, T01B93_A11240Eta_acp,
            T01B93_n11240Eta_acp, T01B93_A11241Eta_acl, T01B93_n11241Eta_acl, T01B93_A11242Eta_at, T01B93_n11242Eta_at, T01B93_A396EmprCod
            }
            , new Object[] {
            T01B94_A407EmprNom, T01B94_n407EmprNom
            }
            , new Object[] {
            T01B95_A11213Eta_hdr, T01B95_A11214Eta_hdrr, T01B95_A11215Eta_hdrp, T01B95_A407EmprNom, T01B95_n407EmprNom, T01B95_A11243Eta_fec, T01B95_n11243Eta_fec, T01B95_A11216Eta_mi, T01B95_n11216Eta_mi, T01B95_A11217Eta_l,
            T01B95_n11217Eta_l, T01B95_A11218Eta_lc, T01B95_n11218Eta_lc, T01B95_A11219Eta_cp, T01B95_n11219Eta_cp, T01B95_A11220Eta_cpc, T01B95_n11220Eta_cpc, T01B95_A11221Eta_mf, T01B95_n11221Eta_mf, T01B95_A11244Eta_tfec,
            T01B95_n11244Eta_tfec, T01B95_A11222Eta_tas, T01B95_n11222Eta_tas, T01B95_A11223Eta_tlc, T01B95_n11223Eta_tlc, T01B95_A11224Eta_tgmc, T01B95_n11224Eta_tgmc, T01B95_A11225Eta_tlf, T01B95_n11225Eta_tlf, T01B95_A11226Eta_tgf,
            T01B95_n11226Eta_tgf, T01B95_A11227Eta_tai, T01B95_n11227Eta_tai, T01B95_A11228Eta_text, T01B95_n11228Eta_text, T01B95_A11229Eta_tvt, T01B95_n11229Eta_tvt, T01B95_A12694Eta_tvtf, T01B95_n12694Eta_tvtf, T01B95_A11230Eta_tvm,
            T01B95_n11230Eta_tvm, T01B95_A11245Eta_afec, T01B95_n11245Eta_afec, T01B95_A11231Eta_aas, T01B95_n11231Eta_aas, T01B95_A11232Eta_aai, T01B95_n11232Eta_aai, T01B95_A11233Eta_atr, T01B95_n11233Eta_atr, T01B95_A11234Eta_avm,
            T01B95_n11234Eta_avm, T01B95_A11235Eta_aext, T01B95_n11235Eta_aext, T01B95_A11236Eta_avt, T01B95_n11236Eta_avt, T01B95_A11237Eta_aar, T01B95_n11237Eta_aar, T01B95_A11238Eta_am, T01B95_n11238Eta_am, T01B95_A11239Eta_ag,
            T01B95_n11239Eta_ag, T01B95_A11240Eta_acp, T01B95_n11240Eta_acp, T01B95_A11241Eta_acl, T01B95_n11241Eta_acl, T01B95_A11242Eta_at, T01B95_n11242Eta_at, T01B95_A396EmprCod
            }
            , new Object[] {
            T01B96_A396EmprCod, T01B96_A11213Eta_hdr, T01B96_A11214Eta_hdrr, T01B96_A11215Eta_hdrp
            }
            , new Object[] {
            T01B97_A396EmprCod, T01B97_A11213Eta_hdr, T01B97_A11214Eta_hdrr, T01B97_A11215Eta_hdrp
            }
            , new Object[] {
            T01B98_A396EmprCod, T01B98_A11213Eta_hdr, T01B98_A11214Eta_hdrr, T01B98_A11215Eta_hdrp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01B912_A396EmprCod, T01B912_A11213Eta_hdr, T01B912_A11214Eta_hdrr, T01B912_A11215Eta_hdrp
            }
            , new Object[] {
            T01B913_A407EmprNom, T01B913_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TETTFAC" ;
   }

   private byte Z11214Eta_hdrr ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11214Eta_hdrr ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ11214Eta_hdrr ;
   private short Z11216Eta_mi ;
   private short Z11221Eta_mf ;
   private short Z11222Eta_tas ;
   private short Z11223Eta_tlc ;
   private short Z11224Eta_tgmc ;
   private short Z11225Eta_tlf ;
   private short Z11226Eta_tgf ;
   private short Z11228Eta_text ;
   private short Z11230Eta_tvm ;
   private short Z11233Eta_atr ;
   private short Z11234Eta_avm ;
   private short Z11235Eta_aext ;
   private short Z11238Eta_am ;
   private short Z11239Eta_ag ;
   private short Z11240Eta_acp ;
   private short Z11241Eta_acl ;
   private short Z11242Eta_at ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11216Eta_mi ;
   private short A11221Eta_mf ;
   private short A11222Eta_tas ;
   private short A11223Eta_tlc ;
   private short A11224Eta_tgmc ;
   private short A11225Eta_tlf ;
   private short A11226Eta_tgf ;
   private short A11228Eta_text ;
   private short A11230Eta_tvm ;
   private short A11233Eta_atr ;
   private short A11234Eta_avm ;
   private short A11235Eta_aext ;
   private short A11238Eta_am ;
   private short A11239Eta_ag ;
   private short A11240Eta_acp ;
   private short A11241Eta_acl ;
   private short A11242Eta_at ;
   private short RcdFound1496 ;
   private short nIsDirty_1496 ;
   private short ZZ11216Eta_mi ;
   private short ZZ11221Eta_mf ;
   private short ZZ11222Eta_tas ;
   private short ZZ11223Eta_tlc ;
   private short ZZ11224Eta_tgmc ;
   private short ZZ11225Eta_tlf ;
   private short ZZ11226Eta_tgf ;
   private short ZZ11228Eta_text ;
   private short ZZ11230Eta_tvm ;
   private short ZZ11233Eta_atr ;
   private short ZZ11234Eta_avm ;
   private short ZZ11235Eta_aext ;
   private short ZZ11238Eta_am ;
   private short ZZ11239Eta_ag ;
   private short ZZ11240Eta_acp ;
   private short ZZ11241Eta_acl ;
   private short ZZ11242Eta_at ;
   private int Z11213Eta_hdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A11213Eta_hdr ;
   private int edtEta_hdr_Enabled ;
   private int edtEta_hdrr_Enabled ;
   private int edtEta_hdrp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEta_fec_Enabled ;
   private int edtEta_mi_Enabled ;
   private int edtEta_l_Enabled ;
   private int edtEta_lc_Enabled ;
   private int edtEta_cp_Enabled ;
   private int edtEta_cpc_Enabled ;
   private int edtEta_mf_Enabled ;
   private int edtEta_tfec_Enabled ;
   private int edtEta_tas_Enabled ;
   private int edtEta_tlc_Enabled ;
   private int edtEta_tgmc_Enabled ;
   private int edtEta_tlf_Enabled ;
   private int edtEta_tgf_Enabled ;
   private int edtEta_tai_Enabled ;
   private int edtEta_text_Enabled ;
   private int edtEta_tvt_Enabled ;
   private int edtEta_tvtf_Enabled ;
   private int edtEta_tvm_Enabled ;
   private int edtEta_afec_Enabled ;
   private int edtEta_aas_Enabled ;
   private int edtEta_aai_Enabled ;
   private int edtEta_atr_Enabled ;
   private int edtEta_avm_Enabled ;
   private int edtEta_aext_Enabled ;
   private int edtEta_avt_Enabled ;
   private int edtEta_aar_Enabled ;
   private int edtEta_am_Enabled ;
   private int edtEta_ag_Enabled ;
   private int edtEta_acp_Enabled ;
   private int edtEta_acl_Enabled ;
   private int edtEta_at_Enabled ;
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
   private int edtEta_at_Backcolor ;
   private int edtEta_acl_Backcolor ;
   private int edtEta_acp_Backcolor ;
   private int edtEta_ag_Backcolor ;
   private int edtEta_am_Backcolor ;
   private int edtEta_aar_Backcolor ;
   private int edtEta_avt_Backcolor ;
   private int edtEta_aext_Backcolor ;
   private int edtEta_avm_Backcolor ;
   private int edtEta_atr_Backcolor ;
   private int edtEta_aai_Backcolor ;
   private int edtEta_aas_Backcolor ;
   private int edtEta_afec_Backcolor ;
   private int edtEta_tvm_Backcolor ;
   private int edtEta_tvtf_Backcolor ;
   private int edtEta_tvt_Backcolor ;
   private int edtEta_text_Backcolor ;
   private int edtEta_tai_Backcolor ;
   private int edtEta_tgf_Backcolor ;
   private int edtEta_tlf_Backcolor ;
   private int edtEta_tgmc_Backcolor ;
   private int edtEta_tlc_Backcolor ;
   private int edtEta_tas_Backcolor ;
   private int edtEta_tfec_Backcolor ;
   private int edtEta_mf_Backcolor ;
   private int edtEta_cpc_Backcolor ;
   private int edtEta_cp_Backcolor ;
   private int edtEta_lc_Backcolor ;
   private int edtEta_l_Backcolor ;
   private int edtEta_mi_Backcolor ;
   private int edtEta_fec_Backcolor ;
   private int edtEta_hdrp_Backcolor ;
   private int edtEta_hdrr_Backcolor ;
   private int edtEta_hdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ11213Eta_hdr ;
   private long Z11229Eta_tvt ;
   private long Z12694Eta_tvtf ;
   private long Z11236Eta_avt ;
   private long Z11237Eta_aar ;
   private long A11229Eta_tvt ;
   private long A12694Eta_tvtf ;
   private long A11236Eta_avt ;
   private long A11237Eta_aar ;
   private long ZZ11229Eta_tvt ;
   private long ZZ12694Eta_tvtf ;
   private long ZZ11236Eta_avt ;
   private long ZZ11237Eta_aar ;
   private java.math.BigDecimal Z11217Eta_l ;
   private java.math.BigDecimal Z11218Eta_lc ;
   private java.math.BigDecimal Z11219Eta_cp ;
   private java.math.BigDecimal Z11220Eta_cpc ;
   private java.math.BigDecimal Z11227Eta_tai ;
   private java.math.BigDecimal Z11231Eta_aas ;
   private java.math.BigDecimal Z11232Eta_aai ;
   private java.math.BigDecimal A11217Eta_l ;
   private java.math.BigDecimal A11218Eta_lc ;
   private java.math.BigDecimal A11219Eta_cp ;
   private java.math.BigDecimal A11220Eta_cpc ;
   private java.math.BigDecimal A11227Eta_tai ;
   private java.math.BigDecimal A11231Eta_aas ;
   private java.math.BigDecimal A11232Eta_aai ;
   private java.math.BigDecimal ZZ11217Eta_l ;
   private java.math.BigDecimal ZZ11218Eta_lc ;
   private java.math.BigDecimal ZZ11219Eta_cp ;
   private java.math.BigDecimal ZZ11220Eta_cpc ;
   private java.math.BigDecimal ZZ11227Eta_tai ;
   private java.math.BigDecimal ZZ11231Eta_aas ;
   private java.math.BigDecimal ZZ11232Eta_aai ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11215Eta_hdrp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEta_hdr_Internalname ;
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
   private String edtEta_hdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEta_hdrr_Internalname ;
   private String edtEta_hdrr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEta_hdrp_Internalname ;
   private String A11215Eta_hdrp ;
   private String edtEta_hdrp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEta_fec_Internalname ;
   private String edtEta_fec_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEta_mi_Internalname ;
   private String edtEta_mi_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEta_l_Internalname ;
   private String edtEta_l_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEta_lc_Internalname ;
   private String edtEta_lc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEta_cp_Internalname ;
   private String edtEta_cp_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEta_cpc_Internalname ;
   private String edtEta_cpc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEta_mf_Internalname ;
   private String edtEta_mf_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEta_tfec_Internalname ;
   private String edtEta_tfec_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEta_tas_Internalname ;
   private String edtEta_tas_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEta_tlc_Internalname ;
   private String edtEta_tlc_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEta_tgmc_Internalname ;
   private String edtEta_tgmc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtEta_tlf_Internalname ;
   private String edtEta_tlf_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEta_tgf_Internalname ;
   private String edtEta_tgf_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtEta_tai_Internalname ;
   private String edtEta_tai_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtEta_text_Internalname ;
   private String edtEta_text_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtEta_tvt_Internalname ;
   private String edtEta_tvt_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtEta_tvtf_Internalname ;
   private String edtEta_tvtf_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtEta_tvm_Internalname ;
   private String edtEta_tvm_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtEta_afec_Internalname ;
   private String edtEta_afec_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtEta_aas_Internalname ;
   private String edtEta_aas_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtEta_aai_Internalname ;
   private String edtEta_aai_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtEta_atr_Internalname ;
   private String edtEta_atr_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtEta_avm_Internalname ;
   private String edtEta_avm_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtEta_aext_Internalname ;
   private String edtEta_aext_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtEta_avt_Internalname ;
   private String edtEta_avt_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtEta_aar_Internalname ;
   private String edtEta_aar_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtEta_am_Internalname ;
   private String edtEta_am_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtEta_ag_Internalname ;
   private String edtEta_ag_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtEta_acp_Internalname ;
   private String edtEta_acp_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtEta_acl_Internalname ;
   private String edtEta_acl_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtEta_at_Internalname ;
   private String edtEta_at_Jsonclick ;
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
   private String sMode1496 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ11215Eta_hdrp ;
   private String ZZ407EmprNom ;
   private java.util.Date Z11243Eta_fec ;
   private java.util.Date Z11244Eta_tfec ;
   private java.util.Date Z11245Eta_afec ;
   private java.util.Date A11243Eta_fec ;
   private java.util.Date A11244Eta_tfec ;
   private java.util.Date A11245Eta_afec ;
   private java.util.Date ZZ11243Eta_fec ;
   private java.util.Date ZZ11244Eta_tfec ;
   private java.util.Date ZZ11245Eta_afec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n11243Eta_fec ;
   private boolean n11216Eta_mi ;
   private boolean n11217Eta_l ;
   private boolean n11218Eta_lc ;
   private boolean n11219Eta_cp ;
   private boolean n11220Eta_cpc ;
   private boolean n11221Eta_mf ;
   private boolean n11244Eta_tfec ;
   private boolean n11222Eta_tas ;
   private boolean n11223Eta_tlc ;
   private boolean n11224Eta_tgmc ;
   private boolean n11225Eta_tlf ;
   private boolean n11226Eta_tgf ;
   private boolean n11227Eta_tai ;
   private boolean n11228Eta_text ;
   private boolean n11229Eta_tvt ;
   private boolean n12694Eta_tvtf ;
   private boolean n11230Eta_tvm ;
   private boolean n11245Eta_afec ;
   private boolean n11231Eta_aas ;
   private boolean n11232Eta_aai ;
   private boolean n11233Eta_atr ;
   private boolean n11234Eta_avm ;
   private boolean n11235Eta_aext ;
   private boolean n11236Eta_avt ;
   private boolean n11237Eta_aar ;
   private boolean n11238Eta_am ;
   private boolean n11239Eta_ag ;
   private boolean n11240Eta_acp ;
   private boolean n11241Eta_acl ;
   private boolean n11242Eta_at ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01B94_A407EmprNom ;
   private boolean[] T01B94_n407EmprNom ;
   private int[] T01B95_A11213Eta_hdr ;
   private byte[] T01B95_A11214Eta_hdrr ;
   private String[] T01B95_A11215Eta_hdrp ;
   private String[] T01B95_A407EmprNom ;
   private boolean[] T01B95_n407EmprNom ;
   private java.util.Date[] T01B95_A11243Eta_fec ;
   private boolean[] T01B95_n11243Eta_fec ;
   private short[] T01B95_A11216Eta_mi ;
   private boolean[] T01B95_n11216Eta_mi ;
   private java.math.BigDecimal[] T01B95_A11217Eta_l ;
   private boolean[] T01B95_n11217Eta_l ;
   private java.math.BigDecimal[] T01B95_A11218Eta_lc ;
   private boolean[] T01B95_n11218Eta_lc ;
   private java.math.BigDecimal[] T01B95_A11219Eta_cp ;
   private boolean[] T01B95_n11219Eta_cp ;
   private java.math.BigDecimal[] T01B95_A11220Eta_cpc ;
   private boolean[] T01B95_n11220Eta_cpc ;
   private short[] T01B95_A11221Eta_mf ;
   private boolean[] T01B95_n11221Eta_mf ;
   private java.util.Date[] T01B95_A11244Eta_tfec ;
   private boolean[] T01B95_n11244Eta_tfec ;
   private short[] T01B95_A11222Eta_tas ;
   private boolean[] T01B95_n11222Eta_tas ;
   private short[] T01B95_A11223Eta_tlc ;
   private boolean[] T01B95_n11223Eta_tlc ;
   private short[] T01B95_A11224Eta_tgmc ;
   private boolean[] T01B95_n11224Eta_tgmc ;
   private short[] T01B95_A11225Eta_tlf ;
   private boolean[] T01B95_n11225Eta_tlf ;
   private short[] T01B95_A11226Eta_tgf ;
   private boolean[] T01B95_n11226Eta_tgf ;
   private java.math.BigDecimal[] T01B95_A11227Eta_tai ;
   private boolean[] T01B95_n11227Eta_tai ;
   private short[] T01B95_A11228Eta_text ;
   private boolean[] T01B95_n11228Eta_text ;
   private long[] T01B95_A11229Eta_tvt ;
   private boolean[] T01B95_n11229Eta_tvt ;
   private long[] T01B95_A12694Eta_tvtf ;
   private boolean[] T01B95_n12694Eta_tvtf ;
   private short[] T01B95_A11230Eta_tvm ;
   private boolean[] T01B95_n11230Eta_tvm ;
   private java.util.Date[] T01B95_A11245Eta_afec ;
   private boolean[] T01B95_n11245Eta_afec ;
   private java.math.BigDecimal[] T01B95_A11231Eta_aas ;
   private boolean[] T01B95_n11231Eta_aas ;
   private java.math.BigDecimal[] T01B95_A11232Eta_aai ;
   private boolean[] T01B95_n11232Eta_aai ;
   private short[] T01B95_A11233Eta_atr ;
   private boolean[] T01B95_n11233Eta_atr ;
   private short[] T01B95_A11234Eta_avm ;
   private boolean[] T01B95_n11234Eta_avm ;
   private short[] T01B95_A11235Eta_aext ;
   private boolean[] T01B95_n11235Eta_aext ;
   private long[] T01B95_A11236Eta_avt ;
   private boolean[] T01B95_n11236Eta_avt ;
   private long[] T01B95_A11237Eta_aar ;
   private boolean[] T01B95_n11237Eta_aar ;
   private short[] T01B95_A11238Eta_am ;
   private boolean[] T01B95_n11238Eta_am ;
   private short[] T01B95_A11239Eta_ag ;
   private boolean[] T01B95_n11239Eta_ag ;
   private short[] T01B95_A11240Eta_acp ;
   private boolean[] T01B95_n11240Eta_acp ;
   private short[] T01B95_A11241Eta_acl ;
   private boolean[] T01B95_n11241Eta_acl ;
   private short[] T01B95_A11242Eta_at ;
   private boolean[] T01B95_n11242Eta_at ;
   private String[] T01B95_A396EmprCod ;
   private String[] T01B96_A396EmprCod ;
   private int[] T01B96_A11213Eta_hdr ;
   private byte[] T01B96_A11214Eta_hdrr ;
   private String[] T01B96_A11215Eta_hdrp ;
   private int[] T01B93_A11213Eta_hdr ;
   private byte[] T01B93_A11214Eta_hdrr ;
   private String[] T01B93_A11215Eta_hdrp ;
   private java.util.Date[] T01B93_A11243Eta_fec ;
   private boolean[] T01B93_n11243Eta_fec ;
   private short[] T01B93_A11216Eta_mi ;
   private boolean[] T01B93_n11216Eta_mi ;
   private java.math.BigDecimal[] T01B93_A11217Eta_l ;
   private boolean[] T01B93_n11217Eta_l ;
   private java.math.BigDecimal[] T01B93_A11218Eta_lc ;
   private boolean[] T01B93_n11218Eta_lc ;
   private java.math.BigDecimal[] T01B93_A11219Eta_cp ;
   private boolean[] T01B93_n11219Eta_cp ;
   private java.math.BigDecimal[] T01B93_A11220Eta_cpc ;
   private boolean[] T01B93_n11220Eta_cpc ;
   private short[] T01B93_A11221Eta_mf ;
   private boolean[] T01B93_n11221Eta_mf ;
   private java.util.Date[] T01B93_A11244Eta_tfec ;
   private boolean[] T01B93_n11244Eta_tfec ;
   private short[] T01B93_A11222Eta_tas ;
   private boolean[] T01B93_n11222Eta_tas ;
   private short[] T01B93_A11223Eta_tlc ;
   private boolean[] T01B93_n11223Eta_tlc ;
   private short[] T01B93_A11224Eta_tgmc ;
   private boolean[] T01B93_n11224Eta_tgmc ;
   private short[] T01B93_A11225Eta_tlf ;
   private boolean[] T01B93_n11225Eta_tlf ;
   private short[] T01B93_A11226Eta_tgf ;
   private boolean[] T01B93_n11226Eta_tgf ;
   private java.math.BigDecimal[] T01B93_A11227Eta_tai ;
   private boolean[] T01B93_n11227Eta_tai ;
   private short[] T01B93_A11228Eta_text ;
   private boolean[] T01B93_n11228Eta_text ;
   private long[] T01B93_A11229Eta_tvt ;
   private boolean[] T01B93_n11229Eta_tvt ;
   private long[] T01B93_A12694Eta_tvtf ;
   private boolean[] T01B93_n12694Eta_tvtf ;
   private short[] T01B93_A11230Eta_tvm ;
   private boolean[] T01B93_n11230Eta_tvm ;
   private java.util.Date[] T01B93_A11245Eta_afec ;
   private boolean[] T01B93_n11245Eta_afec ;
   private java.math.BigDecimal[] T01B93_A11231Eta_aas ;
   private boolean[] T01B93_n11231Eta_aas ;
   private java.math.BigDecimal[] T01B93_A11232Eta_aai ;
   private boolean[] T01B93_n11232Eta_aai ;
   private short[] T01B93_A11233Eta_atr ;
   private boolean[] T01B93_n11233Eta_atr ;
   private short[] T01B93_A11234Eta_avm ;
   private boolean[] T01B93_n11234Eta_avm ;
   private short[] T01B93_A11235Eta_aext ;
   private boolean[] T01B93_n11235Eta_aext ;
   private long[] T01B93_A11236Eta_avt ;
   private boolean[] T01B93_n11236Eta_avt ;
   private long[] T01B93_A11237Eta_aar ;
   private boolean[] T01B93_n11237Eta_aar ;
   private short[] T01B93_A11238Eta_am ;
   private boolean[] T01B93_n11238Eta_am ;
   private short[] T01B93_A11239Eta_ag ;
   private boolean[] T01B93_n11239Eta_ag ;
   private short[] T01B93_A11240Eta_acp ;
   private boolean[] T01B93_n11240Eta_acp ;
   private short[] T01B93_A11241Eta_acl ;
   private boolean[] T01B93_n11241Eta_acl ;
   private short[] T01B93_A11242Eta_at ;
   private boolean[] T01B93_n11242Eta_at ;
   private String[] T01B93_A396EmprCod ;
   private String[] T01B97_A396EmprCod ;
   private int[] T01B97_A11213Eta_hdr ;
   private byte[] T01B97_A11214Eta_hdrr ;
   private String[] T01B97_A11215Eta_hdrp ;
   private String[] T01B98_A396EmprCod ;
   private int[] T01B98_A11213Eta_hdr ;
   private byte[] T01B98_A11214Eta_hdrr ;
   private String[] T01B98_A11215Eta_hdrp ;
   private int[] T01B92_A11213Eta_hdr ;
   private byte[] T01B92_A11214Eta_hdrr ;
   private String[] T01B92_A11215Eta_hdrp ;
   private java.util.Date[] T01B92_A11243Eta_fec ;
   private boolean[] T01B92_n11243Eta_fec ;
   private short[] T01B92_A11216Eta_mi ;
   private boolean[] T01B92_n11216Eta_mi ;
   private java.math.BigDecimal[] T01B92_A11217Eta_l ;
   private boolean[] T01B92_n11217Eta_l ;
   private java.math.BigDecimal[] T01B92_A11218Eta_lc ;
   private boolean[] T01B92_n11218Eta_lc ;
   private java.math.BigDecimal[] T01B92_A11219Eta_cp ;
   private boolean[] T01B92_n11219Eta_cp ;
   private java.math.BigDecimal[] T01B92_A11220Eta_cpc ;
   private boolean[] T01B92_n11220Eta_cpc ;
   private short[] T01B92_A11221Eta_mf ;
   private boolean[] T01B92_n11221Eta_mf ;
   private java.util.Date[] T01B92_A11244Eta_tfec ;
   private boolean[] T01B92_n11244Eta_tfec ;
   private short[] T01B92_A11222Eta_tas ;
   private boolean[] T01B92_n11222Eta_tas ;
   private short[] T01B92_A11223Eta_tlc ;
   private boolean[] T01B92_n11223Eta_tlc ;
   private short[] T01B92_A11224Eta_tgmc ;
   private boolean[] T01B92_n11224Eta_tgmc ;
   private short[] T01B92_A11225Eta_tlf ;
   private boolean[] T01B92_n11225Eta_tlf ;
   private short[] T01B92_A11226Eta_tgf ;
   private boolean[] T01B92_n11226Eta_tgf ;
   private java.math.BigDecimal[] T01B92_A11227Eta_tai ;
   private boolean[] T01B92_n11227Eta_tai ;
   private short[] T01B92_A11228Eta_text ;
   private boolean[] T01B92_n11228Eta_text ;
   private long[] T01B92_A11229Eta_tvt ;
   private boolean[] T01B92_n11229Eta_tvt ;
   private long[] T01B92_A12694Eta_tvtf ;
   private boolean[] T01B92_n12694Eta_tvtf ;
   private short[] T01B92_A11230Eta_tvm ;
   private boolean[] T01B92_n11230Eta_tvm ;
   private java.util.Date[] T01B92_A11245Eta_afec ;
   private boolean[] T01B92_n11245Eta_afec ;
   private java.math.BigDecimal[] T01B92_A11231Eta_aas ;
   private boolean[] T01B92_n11231Eta_aas ;
   private java.math.BigDecimal[] T01B92_A11232Eta_aai ;
   private boolean[] T01B92_n11232Eta_aai ;
   private short[] T01B92_A11233Eta_atr ;
   private boolean[] T01B92_n11233Eta_atr ;
   private short[] T01B92_A11234Eta_avm ;
   private boolean[] T01B92_n11234Eta_avm ;
   private short[] T01B92_A11235Eta_aext ;
   private boolean[] T01B92_n11235Eta_aext ;
   private long[] T01B92_A11236Eta_avt ;
   private boolean[] T01B92_n11236Eta_avt ;
   private long[] T01B92_A11237Eta_aar ;
   private boolean[] T01B92_n11237Eta_aar ;
   private short[] T01B92_A11238Eta_am ;
   private boolean[] T01B92_n11238Eta_am ;
   private short[] T01B92_A11239Eta_ag ;
   private boolean[] T01B92_n11239Eta_ag ;
   private short[] T01B92_A11240Eta_acp ;
   private boolean[] T01B92_n11240Eta_acp ;
   private short[] T01B92_A11241Eta_acl ;
   private boolean[] T01B92_n11241Eta_acl ;
   private short[] T01B92_A11242Eta_at ;
   private boolean[] T01B92_n11242Eta_at ;
   private String[] T01B92_A396EmprCod ;
   private String[] T01B912_A396EmprCod ;
   private int[] T01B912_A11213Eta_hdr ;
   private byte[] T01B912_A11214Eta_hdrr ;
   private String[] T01B912_A11215Eta_hdrp ;
   private String[] T01B913_A407EmprNom ;
   private boolean[] T01B913_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tettfac__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tettfac__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tettfac__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tettfac__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tettfac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01B92", "SELECT Eta_hdr, Eta_hdrr, Eta_hdrp, Eta_fec, Eta_mi, Eta_l, Eta_lc, Eta_cp, Eta_cpc, Eta_mf, Eta_tfec, Eta_tas, Eta_tlc, Eta_tgmc, Eta_tlf, Eta_tgf, Eta_tai, Eta_text, Eta_tvt, Eta_tvtf, Eta_tvm, Eta_afec, Eta_aas, Eta_aai, Eta_atr, Eta_avm, Eta_aext, Eta_avt, Eta_aar, Eta_am, Eta_ag, Eta_acp, Eta_acl, Eta_at, EmprCod FROM TXPETTFAC WHERE EmprCod = ? AND Eta_hdr = ? AND Eta_hdrr = ? AND Eta_hdrp = ?  FOR UPDATE OF Eta_fec, Eta_mi, Eta_l, Eta_lc, Eta_cp, Eta_cpc, Eta_mf, Eta_tfec, Eta_tas, Eta_tlc, Eta_tgmc, Eta_tlf, Eta_tgf, Eta_tai, Eta_text, Eta_tvt, Eta_tvtf, Eta_tvm, Eta_afec, Eta_aas, Eta_aai, Eta_atr, Eta_avm, Eta_aext, Eta_avt, Eta_aar, Eta_am, Eta_ag, Eta_acp, Eta_acl, Eta_at NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B93", "SELECT Eta_hdr, Eta_hdrr, Eta_hdrp, Eta_fec, Eta_mi, Eta_l, Eta_lc, Eta_cp, Eta_cpc, Eta_mf, Eta_tfec, Eta_tas, Eta_tlc, Eta_tgmc, Eta_tlf, Eta_tgf, Eta_tai, Eta_text, Eta_tvt, Eta_tvtf, Eta_tvm, Eta_afec, Eta_aas, Eta_aai, Eta_atr, Eta_avm, Eta_aext, Eta_avt, Eta_aar, Eta_am, Eta_ag, Eta_acp, Eta_acl, Eta_at, EmprCod FROM TXPETTFAC WHERE EmprCod = ? AND Eta_hdr = ? AND Eta_hdrr = ? AND Eta_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B94", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B95", "SELECT /*+ FIRST_ROWS(100) */ TM1.Eta_hdr, TM1.Eta_hdrr, TM1.Eta_hdrp, T2.EmprNom, TM1.Eta_fec, TM1.Eta_mi, TM1.Eta_l, TM1.Eta_lc, TM1.Eta_cp, TM1.Eta_cpc, TM1.Eta_mf, TM1.Eta_tfec, TM1.Eta_tas, TM1.Eta_tlc, TM1.Eta_tgmc, TM1.Eta_tlf, TM1.Eta_tgf, TM1.Eta_tai, TM1.Eta_text, TM1.Eta_tvt, TM1.Eta_tvtf, TM1.Eta_tvm, TM1.Eta_afec, TM1.Eta_aas, TM1.Eta_aai, TM1.Eta_atr, TM1.Eta_avm, TM1.Eta_aext, TM1.Eta_avt, TM1.Eta_aar, TM1.Eta_am, TM1.Eta_ag, TM1.Eta_acp, TM1.Eta_acl, TM1.Eta_at, TM1.EmprCod FROM (TXPETTFAC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Eta_hdr = ? and TM1.Eta_hdrr = ? and TM1.Eta_hdrp = ? ORDER BY TM1.EmprCod, TM1.Eta_hdr, TM1.Eta_hdrr, TM1.Eta_hdrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B96", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp FROM TXPETTFAC WHERE EmprCod = ? AND Eta_hdr = ? AND Eta_hdrr = ? AND Eta_hdrp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B97", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp FROM TXPETTFAC WHERE ( Eta_hdr > ? or Eta_hdr = ? and Eta_hdrr > ? or Eta_hdrr = ? and Eta_hdr = ? and Eta_hdrp > ?) and EmprCod = ? ORDER BY EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01B98", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp FROM TXPETTFAC WHERE ( Eta_hdr < ? or Eta_hdr = ? and Eta_hdrr < ? or Eta_hdrr = ? and Eta_hdr = ? and Eta_hdrp < ?) and EmprCod = ? ORDER BY EmprCod DESC, Eta_hdr DESC, Eta_hdrr DESC, Eta_hdrp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01B99", "INSERT INTO TXPETTFAC(Eta_hdr, Eta_hdrr, Eta_hdrp, Eta_fec, Eta_mi, Eta_l, Eta_lc, Eta_cp, Eta_cpc, Eta_mf, Eta_tfec, Eta_tas, Eta_tlc, Eta_tgmc, Eta_tlf, Eta_tgf, Eta_tai, Eta_text, Eta_tvt, Eta_tvtf, Eta_tvm, Eta_afec, Eta_aas, Eta_aai, Eta_atr, Eta_avm, Eta_aext, Eta_avt, Eta_aar, Eta_am, Eta_ag, Eta_acp, Eta_acl, Eta_at, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPETTFAC")
         ,new UpdateCursor("T01B910", "UPDATE TXPETTFAC SET Eta_fec=?, Eta_mi=?, Eta_l=?, Eta_lc=?, Eta_cp=?, Eta_cpc=?, Eta_mf=?, Eta_tfec=?, Eta_tas=?, Eta_tlc=?, Eta_tgmc=?, Eta_tlf=?, Eta_tgf=?, Eta_tai=?, Eta_text=?, Eta_tvt=?, Eta_tvtf=?, Eta_tvm=?, Eta_afec=?, Eta_aas=?, Eta_aai=?, Eta_atr=?, Eta_avm=?, Eta_aext=?, Eta_avt=?, Eta_aar=?, Eta_am=?, Eta_ag=?, Eta_acp=?, Eta_acl=?, Eta_at=?  WHERE EmprCod = ? AND Eta_hdr = ? AND Eta_hdrr = ? AND Eta_hdrp = ?", GX_NOMASK, "TXPETTFAC")
         ,new UpdateCursor("T01B911", "DELETE FROM TXPETTFAC  WHERE EmprCod = ? AND Eta_hdr = ? AND Eta_hdrr = ? AND Eta_hdrp = ?", GX_NOMASK, "TXPETTFAC")
         ,new ForEachCursor("T01B912", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp FROM TXPETTFAC WHERE EmprCod = ? ORDER BY EmprCod, Eta_hdr, Eta_hdrr, Eta_hdrp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01B913", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((long[]) buf[33])[0] = rslt.getLong(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((long[]) buf[51])[0] = rslt.getLong(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(35, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(32);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(35);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(36, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(19, ((Number) parms[34]).longValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(20, ((Number) parms[36]).longValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[40]);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(28, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(29, ((Number) parms[54]).longValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[64]).shortValue());
               }
               stmt.setString(35, (String)parms[65], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(16, ((Number) parms[31]).longValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[33]).longValue());
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
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[37]);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(25, ((Number) parms[49]).longValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[51]).longValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               stmt.setString(32, (String)parms[62], 3);
               stmt.setInt(33, ((Number) parms[63]).intValue());
               stmt.setByte(34, ((Number) parms[64]).byteValue());
               stmt.setString(35, (String)parms[65], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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

