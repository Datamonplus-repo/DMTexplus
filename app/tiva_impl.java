package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tiva_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO IVA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tiva_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tiva_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiva_impl.class ));
   }

   public tiva_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TIVA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Codigo IVA", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaCod_Internalname, GXutil.rtrim( A953IvaCod), GXutil.rtrim( localUtil.format( A953IvaCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaCod_Jsonclick, 0, "", "", "", "", "", 1, edtIvaCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Descripcion IVA", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaDsc_Internalname, GXutil.rtrim( A954IvaDsc), GXutil.rtrim( localUtil.format( A954IvaDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIvaDsc_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "IVA General", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaPor_Internalname, GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIvaPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A588IvaPor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaPor_Jsonclick, 0, "", "", "", "", "", 1, edtIvaPor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Rec. Equiv. IVA", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaRec_Internalname, GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIvaRec_Enabled!=0) ? localUtil.format( A589IvaRec, "ZZ9.999") : localUtil.format( A589IvaRec, "ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaRec_Jsonclick, 0, "", "", "", "", "", 1, edtIvaRec_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha Inicio", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtIvaFecIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaFecIni_Internalname, localUtil.format(A7255IvaFecIni, "99/99/99"), localUtil.format( A7255IvaFecIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaFecIni_Jsonclick, 0, "", "", "", "", "", 1, edtIvaFecIni_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIVA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtIvaFecIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtIvaFecIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIVA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Fim", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TIVA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtIvaFecFim_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIvaFecFim_Internalname, localUtil.format(A7256IvaFecFim, "99/99/99"), localUtil.format( A7256IvaFecFim, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIvaFecFim_Jsonclick, 0, "", "", "", "", "", 1, edtIvaFecFim_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TIVA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtIvaFecFim_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtIvaFecFim_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TIVA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TIVA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TIVA.htm");
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
      e11322 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z953IvaCod = httpContext.cgiGet( "Z953IvaCod") ;
            Z954IvaDsc = httpContext.cgiGet( "Z954IvaDsc") ;
            Z588IvaPor = (byte)(localUtil.ctol( httpContext.cgiGet( "Z588IvaPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z589IvaRec = localUtil.ctond( httpContext.cgiGet( "Z589IvaRec")) ;
            Z7255IvaFecIni = localUtil.ctod( httpContext.cgiGet( "Z7255IvaFecIni"), 0) ;
            Z7256IvaFecFim = localUtil.ctod( httpContext.cgiGet( "Z7256IvaFecFim"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A953IvaCod = GXutil.upper( httpContext.cgiGet( edtIvaCod_Internalname)) ;
            n953IvaCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
            A954IvaDsc = httpContext.cgiGet( edtIvaDsc_Internalname) ;
            n954IvaDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtIvaPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtIvaPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IVAPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A588IvaPor = (byte)(0) ;
               n588IvaPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
            }
            else
            {
               A588IvaPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtIvaPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n588IvaPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtIvaRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtIvaRec_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IVAREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A589IvaRec = DecimalUtil.ZERO ;
               n589IvaRec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
            }
            else
            {
               A589IvaRec = localUtil.ctond( httpContext.cgiGet( edtIvaRec_Internalname)) ;
               n589IvaRec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtIvaFecIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "IVAFECINI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaFecIni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7255IvaFecIni = GXutil.nullDate() ;
               n7255IvaFecIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
            }
            else
            {
               A7255IvaFecIni = localUtil.ctod( httpContext.cgiGet( edtIvaFecIni_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n7255IvaFecIni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtIvaFecFim_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "IVAFECFIM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaFecFim_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7256IvaFecFim = GXutil.nullDate() ;
               n7256IvaFecFim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
            }
            else
            {
               A7256IvaFecFim = localUtil.ctod( httpContext.cgiGet( edtIvaFecFim_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n7256IvaFecFim = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
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
               A953IvaCod = httpContext.GetPar( "IvaCod") ;
               n953IvaCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
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
                        e11322 ();
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
            initAll32150( ) ;
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
      disableAttributes32150( ) ;
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

   public void confirm_320( )
   {
      beforeValidate32150( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls32150( ) ;
         }
         else
         {
            checkExtendedTable32150( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors32150( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues320( ) ;
      }
   }

   public void resetCaption320( )
   {
   }

   public void e11322( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN363_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1197_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV20Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1338_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit4", AV20Lit4);
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1243_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit5", AV23Lit5);
      GXt_char1 = AV27Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5000_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit6", AV27Lit6);
      GXt_char1 = AV28Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT5001_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit7", AV28Lit7);
      GXt_char1 = AV22LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tiva_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22LitFe", AV22LitFe);
      AV26Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      tiva_impl.this.AV24EmprCod = GXv_char2[0] ;
      tiva_impl.this.AV25EmprNom = GXv_char3[0] ;
      tiva_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
   }

   public void zm32150( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z954IvaDsc = T00323_A954IvaDsc[0] ;
            Z588IvaPor = T00323_A588IvaPor[0] ;
            Z589IvaRec = T00323_A589IvaRec[0] ;
            Z7255IvaFecIni = T00323_A7255IvaFecIni[0] ;
            Z7256IvaFecFim = T00323_A7256IvaFecFim[0] ;
         }
         else
         {
            Z954IvaDsc = A954IvaDsc ;
            Z588IvaPor = A588IvaPor ;
            Z589IvaRec = A589IvaRec ;
            Z7255IvaFecIni = A7255IvaFecIni ;
            Z7256IvaFecFim = A7256IvaFecFim ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z953IvaCod = A953IvaCod ;
         Z954IvaDsc = A954IvaDsc ;
         Z588IvaPor = A588IvaPor ;
         Z589IvaRec = A589IvaRec ;
         Z7255IvaFecIni = A7255IvaFecIni ;
         Z7256IvaFecFim = A7256IvaFecFim ;
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

   public void load32150( )
   {
      /* Using cursor T00324 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound150 = (short)(1) ;
         A954IvaDsc = T00324_A954IvaDsc[0] ;
         n954IvaDsc = T00324_n954IvaDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
         A588IvaPor = T00324_A588IvaPor[0] ;
         n588IvaPor = T00324_n588IvaPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
         A589IvaRec = T00324_A589IvaRec[0] ;
         n589IvaRec = T00324_n589IvaRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
         A7255IvaFecIni = T00324_A7255IvaFecIni[0] ;
         n7255IvaFecIni = T00324_n7255IvaFecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
         A7256IvaFecFim = T00324_A7256IvaFecFim[0] ;
         n7256IvaFecFim = T00324_n7256IvaFecFim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
         zm32150( -1) ;
      }
      pr_default.close(2);
      onLoadActions32150( ) ;
   }

   public void onLoadActions32150( )
   {
   }

   public void checkExtendedTable32150( )
   {
      nIsDirty_150 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors32150( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey32150( )
   {
      /* Using cursor T00325 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound150 = (short)(1) ;
      }
      else
      {
         RcdFound150 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00323 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm32150( 1) ;
         RcdFound150 = (short)(1) ;
         A953IvaCod = T00323_A953IvaCod[0] ;
         n953IvaCod = T00323_n953IvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
         A954IvaDsc = T00323_A954IvaDsc[0] ;
         n954IvaDsc = T00323_n954IvaDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
         A588IvaPor = T00323_A588IvaPor[0] ;
         n588IvaPor = T00323_n588IvaPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
         A589IvaRec = T00323_A589IvaRec[0] ;
         n589IvaRec = T00323_n589IvaRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
         A7255IvaFecIni = T00323_A7255IvaFecIni[0] ;
         n7255IvaFecIni = T00323_n7255IvaFecIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
         A7256IvaFecFim = T00323_A7256IvaFecFim[0] ;
         n7256IvaFecFim = T00323_n7256IvaFecFim[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
         Z953IvaCod = A953IvaCod ;
         sMode150 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load32150( ) ;
         if ( AnyError == 1 )
         {
            RcdFound150 = (short)(0) ;
            initializeNonKey32150( ) ;
         }
         Gx_mode = sMode150 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound150 = (short)(0) ;
         initializeNonKey32150( ) ;
         sMode150 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode150 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey32150( ) ;
      if ( RcdFound150 == 0 )
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
      RcdFound150 = (short)(0) ;
      /* Using cursor T00326 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00326_A953IvaCod[0], A953IvaCod) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00326_A953IvaCod[0], A953IvaCod) > 0 ) ) )
         {
            A953IvaCod = T00326_A953IvaCod[0] ;
            n953IvaCod = T00326_n953IvaCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
            RcdFound150 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound150 = (short)(0) ;
      /* Using cursor T00327 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00327_A953IvaCod[0], A953IvaCod) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00327_A953IvaCod[0], A953IvaCod) < 0 ) ) )
         {
            A953IvaCod = T00327_A953IvaCod[0] ;
            n953IvaCod = T00327_n953IvaCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
            RcdFound150 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey32150( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert32150( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound150 == 1 )
         {
            if ( GXutil.strcmp(A953IvaCod, Z953IvaCod) != 0 )
            {
               A953IvaCod = Z953IvaCod ;
               n953IvaCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "IVACOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtIvaCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update32150( ) ;
               GX_FocusControl = edtIvaCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A953IvaCod, Z953IvaCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtIvaCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert32150( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "IVACOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtIvaCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtIvaCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert32150( ) ;
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
      if ( GXutil.strcmp(A953IvaCod, Z953IvaCod) != 0 )
      {
         A953IvaCod = Z953IvaCod ;
         n953IvaCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "IVACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtIvaCod_Internalname ;
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
      getKey32150( ) ;
      if ( RcdFound150 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "IVACOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtIvaCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A953IvaCod, Z953IvaCod) != 0 )
         {
            A953IvaCod = Z953IvaCod ;
            n953IvaCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "IVACOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtIvaCod_Internalname ;
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
         if ( GXutil.strcmp(A953IvaCod, Z953IvaCod) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "IVACOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtIvaCod_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tiva");
      GX_FocusControl = edtIvaDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_320( ) ;
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
      if ( RcdFound150 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "IVACOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIvaCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtIvaDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart32150( ) ;
      if ( RcdFound150 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIvaDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd32150( ) ;
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
      if ( RcdFound150 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIvaDsc_Internalname ;
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
      if ( RcdFound150 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIvaDsc_Internalname ;
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
      scanStart32150( ) ;
      if ( RcdFound150 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound150 != 0 )
         {
            scanNext32150( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtIvaDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd32150( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency32150( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00322 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPIVA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z954IvaDsc, T00322_A954IvaDsc[0]) != 0 ) || ( Z588IvaPor != T00322_A588IvaPor[0] ) || ( DecimalUtil.compareTo(Z589IvaRec, T00322_A589IvaRec[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z7255IvaFecIni), GXutil.resetTime(T00322_A7255IvaFecIni[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z7256IvaFecFim), GXutil.resetTime(T00322_A7256IvaFecFim[0])) ) )
         {
            if ( GXutil.strcmp(Z954IvaDsc, T00322_A954IvaDsc[0]) != 0 )
            {
               GXutil.writeLogln("tiva:[seudo value changed for attri]"+"IvaDsc");
               GXutil.writeLogRaw("Old: ",Z954IvaDsc);
               GXutil.writeLogRaw("Current: ",T00322_A954IvaDsc[0]);
            }
            if ( Z588IvaPor != T00322_A588IvaPor[0] )
            {
               GXutil.writeLogln("tiva:[seudo value changed for attri]"+"IvaPor");
               GXutil.writeLogRaw("Old: ",Z588IvaPor);
               GXutil.writeLogRaw("Current: ",T00322_A588IvaPor[0]);
            }
            if ( DecimalUtil.compareTo(Z589IvaRec, T00322_A589IvaRec[0]) != 0 )
            {
               GXutil.writeLogln("tiva:[seudo value changed for attri]"+"IvaRec");
               GXutil.writeLogRaw("Old: ",Z589IvaRec);
               GXutil.writeLogRaw("Current: ",T00322_A589IvaRec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7255IvaFecIni), GXutil.resetTime(T00322_A7255IvaFecIni[0])) ) )
            {
               GXutil.writeLogln("tiva:[seudo value changed for attri]"+"IvaFecIni");
               GXutil.writeLogRaw("Old: ",Z7255IvaFecIni);
               GXutil.writeLogRaw("Current: ",T00322_A7255IvaFecIni[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7256IvaFecFim), GXutil.resetTime(T00322_A7256IvaFecFim[0])) ) )
            {
               GXutil.writeLogln("tiva:[seudo value changed for attri]"+"IvaFecFim");
               GXutil.writeLogRaw("Old: ",Z7256IvaFecFim);
               GXutil.writeLogRaw("Current: ",T00322_A7256IvaFecFim[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPIVA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert32150( )
   {
      beforeValidate32150( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable32150( ) ;
      }
      if ( AnyError == 0 )
      {
         zm32150( 0) ;
         checkOptimisticConcurrency32150( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm32150( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert32150( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00328 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod, Boolean.valueOf(n954IvaDsc), A954IvaDsc, Boolean.valueOf(n588IvaPor), Byte.valueOf(A588IvaPor), Boolean.valueOf(n589IvaRec), A589IvaRec, Boolean.valueOf(n7255IvaFecIni), A7255IvaFecIni, Boolean.valueOf(n7256IvaFecFim), A7256IvaFecFim});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPIVA");
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
                        resetCaption320( ) ;
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
            load32150( ) ;
         }
         endLevel32150( ) ;
      }
      closeExtendedTableCursors32150( ) ;
   }

   public void update32150( )
   {
      beforeValidate32150( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable32150( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency32150( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm32150( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate32150( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00329 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n954IvaDsc), A954IvaDsc, Boolean.valueOf(n588IvaPor), Byte.valueOf(A588IvaPor), Boolean.valueOf(n589IvaRec), A589IvaRec, Boolean.valueOf(n7255IvaFecIni), A7255IvaFecIni, Boolean.valueOf(n7256IvaFecFim), A7256IvaFecFim, Boolean.valueOf(n953IvaCod), A953IvaCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPIVA");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPIVA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate32150( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption320( ) ;
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
         endLevel32150( ) ;
      }
      closeExtendedTableCursors32150( ) ;
   }

   public void deferredUpdate32150( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate32150( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency32150( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls32150( ) ;
         afterConfirm32150( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete32150( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T003210 */
               pr_default.execute(8, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPIVA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound150 == 0 )
                     {
                        initAll32150( ) ;
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
                     resetCaption320( ) ;
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
      sMode150 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel32150( ) ;
      Gx_mode = sMode150 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls32150( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T003211 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EMPRESAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel32150( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete32150( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tiva");
         if ( AnyError == 0 )
         {
            confirmValues320( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tiva");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart32150( )
   {
      /* Scan By routine */
      /* Using cursor T003212 */
      pr_default.execute(10);
      RcdFound150 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound150 = (short)(1) ;
         A953IvaCod = T003212_A953IvaCod[0] ;
         n953IvaCod = T003212_n953IvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext32150( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound150 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound150 = (short)(1) ;
         A953IvaCod = T003212_A953IvaCod[0] ;
         n953IvaCod = T003212_n953IvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
      }
   }

   public void scanEnd32150( )
   {
      pr_default.close(10);
   }

   public void afterConfirm32150( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert32150( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate32150( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete32150( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete32150( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate32150( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes32150( )
   {
      edtIvaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaCod_Enabled), 5, 0), true);
      edtIvaDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaDsc_Enabled), 5, 0), true);
      edtIvaPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaPor_Enabled), 5, 0), true);
      edtIvaRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaRec_Enabled), 5, 0), true);
      edtIvaFecIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaFecIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaFecIni_Enabled), 5, 0), true);
      edtIvaFecFim_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIvaFecFim_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIvaFecFim_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes32150( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues320( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tiva", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z953IvaCod", GXutil.rtrim( Z953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z954IvaDsc", GXutil.rtrim( Z954IvaDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z588IvaPor", GXutil.ltrim( localUtil.ntoc( Z588IvaPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z589IvaRec", GXutil.ltrim( localUtil.ntoc( Z589IvaRec, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7255IvaFecIni", localUtil.dtoc( Z7255IvaFecIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7256IvaFecFim", localUtil.dtoc( Z7256IvaFecFim, 0, "/"));
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
      return formatLink("app.tiva", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TIVA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO IVA", "") ;
   }

   public void initializeNonKey32150( )
   {
      A954IvaDsc = "" ;
      n954IvaDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", A954IvaDsc);
      A588IvaPor = (byte)(0) ;
      n588IvaPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A588IvaPor), 2, 0));
      A589IvaRec = DecimalUtil.ZERO ;
      n589IvaRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrimstr( A589IvaRec, 7, 3));
      A7255IvaFecIni = GXutil.nullDate() ;
      n7255IvaFecIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
      A7256IvaFecFim = GXutil.nullDate() ;
      n7256IvaFecFim = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
      Z954IvaDsc = "" ;
      Z588IvaPor = (byte)(0) ;
      Z589IvaRec = DecimalUtil.ZERO ;
      Z7255IvaFecIni = GXutil.nullDate() ;
      Z7256IvaFecFim = GXutil.nullDate() ;
   }

   public void initAll32150( )
   {
      A953IvaCod = "" ;
      n953IvaCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A953IvaCod", A953IvaCod);
      initializeNonKey32150( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241503160", true, true);
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
      httpContext.AddJavascriptSource("tiva.js", "?20268241503160", false, true);
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
      edtIvaCod_Internalname = "IVACOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtIvaDsc_Internalname = "IVADSC" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtIvaPor_Internalname = "IVAPOR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtIvaRec_Internalname = "IVAREC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtIvaFecIni_Internalname = "IVAFECINI" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtIvaFecFim_Internalname = "IVAFECFIM" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO IVA", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtIvaFecFim_Jsonclick = "" ;
      edtIvaFecFim_Backcolor = (int)(0xFFFFFF) ;
      edtIvaFecFim_Enabled = 1 ;
      edtIvaFecIni_Jsonclick = "" ;
      edtIvaFecIni_Backcolor = (int)(0xFFFFFF) ;
      edtIvaFecIni_Enabled = 1 ;
      edtIvaRec_Jsonclick = "" ;
      edtIvaRec_Backcolor = (int)(0xFFFFFF) ;
      edtIvaRec_Enabled = 1 ;
      edtIvaPor_Jsonclick = "" ;
      edtIvaPor_Backcolor = (int)(0xFFFFFF) ;
      edtIvaPor_Enabled = 1 ;
      edtIvaDsc_Jsonclick = "" ;
      edtIvaDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIvaDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtIvaCod_Jsonclick = "" ;
      edtIvaCod_Backcolor = (int)(0xFFFFFF) ;
      edtIvaCod_Enabled = 1 ;
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
      GX_FocusControl = edtIvaDsc_Internalname ;
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

   public void valid_Ivacod( )
   {
      n953IvaCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A954IvaDsc", GXutil.rtrim( A954IvaDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A588IvaPor", GXutil.ltrim( localUtil.ntoc( A588IvaPor, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A589IvaRec", GXutil.ltrim( localUtil.ntoc( A589IvaRec, (byte)(7), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7255IvaFecIni", localUtil.format(A7255IvaFecIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A7256IvaFecFim", localUtil.format(A7256IvaFecFim, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z953IvaCod", GXutil.rtrim( Z953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z954IvaDsc", GXutil.rtrim( Z954IvaDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z588IvaPor", GXutil.ltrim( localUtil.ntoc( Z588IvaPor, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z589IvaRec", GXutil.ltrim( localUtil.ntoc( Z589IvaRec, (byte)(7), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7255IvaFecIni", localUtil.format(Z7255IvaFecIni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7256IvaFecFim", localUtil.format(Z7256IvaFecFim, "99/99/99"));
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
      setEventMetadata("VALID_IVACOD","{handler:'valid_Ivacod',iparms:[{av:'A953IvaCod',fld:'IVACOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_IVACOD",",oparms:[{av:'A954IvaDsc',fld:'IVADSC',pic:''},{av:'A588IvaPor',fld:'IVAPOR',pic:'Z9'},{av:'A589IvaRec',fld:'IVAREC',pic:'ZZ9.999'},{av:'A7255IvaFecIni',fld:'IVAFECINI',pic:''},{av:'A7256IvaFecFim',fld:'IVAFECFIM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z953IvaCod'},{av:'Z954IvaDsc'},{av:'Z588IvaPor'},{av:'Z589IvaRec'},{av:'Z7255IvaFecIni'},{av:'Z7256IvaFecFim'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z953IvaCod = "" ;
      Z954IvaDsc = "" ;
      Z589IvaRec = DecimalUtil.ZERO ;
      Z7255IvaFecIni = GXutil.nullDate() ;
      Z7256IvaFecFim = GXutil.nullDate() ;
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
      A953IvaCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A954IvaDsc = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A589IvaRec = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A7255IvaFecIni = GXutil.nullDate() ;
      lblTextblock6_Jsonclick = "" ;
      A7256IvaFecFim = GXutil.nullDate() ;
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
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV20Lit4 = "" ;
      AV23Lit5 = "" ;
      AV27Lit6 = "" ;
      AV28Lit7 = "" ;
      AV22LitFe = "" ;
      GXt_char1 = "" ;
      AV26Station = "" ;
      AV24EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV21UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T00324_A953IvaCod = new String[] {""} ;
      T00324_n953IvaCod = new boolean[] {false} ;
      T00324_A954IvaDsc = new String[] {""} ;
      T00324_n954IvaDsc = new boolean[] {false} ;
      T00324_A588IvaPor = new byte[1] ;
      T00324_n588IvaPor = new boolean[] {false} ;
      T00324_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00324_n589IvaRec = new boolean[] {false} ;
      T00324_A7255IvaFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00324_n7255IvaFecIni = new boolean[] {false} ;
      T00324_A7256IvaFecFim = new java.util.Date[] {GXutil.nullDate()} ;
      T00324_n7256IvaFecFim = new boolean[] {false} ;
      T00325_A953IvaCod = new String[] {""} ;
      T00325_n953IvaCod = new boolean[] {false} ;
      T00323_A953IvaCod = new String[] {""} ;
      T00323_n953IvaCod = new boolean[] {false} ;
      T00323_A954IvaDsc = new String[] {""} ;
      T00323_n954IvaDsc = new boolean[] {false} ;
      T00323_A588IvaPor = new byte[1] ;
      T00323_n588IvaPor = new boolean[] {false} ;
      T00323_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00323_n589IvaRec = new boolean[] {false} ;
      T00323_A7255IvaFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00323_n7255IvaFecIni = new boolean[] {false} ;
      T00323_A7256IvaFecFim = new java.util.Date[] {GXutil.nullDate()} ;
      T00323_n7256IvaFecFim = new boolean[] {false} ;
      sMode150 = "" ;
      T00326_A953IvaCod = new String[] {""} ;
      T00326_n953IvaCod = new boolean[] {false} ;
      T00327_A953IvaCod = new String[] {""} ;
      T00327_n953IvaCod = new boolean[] {false} ;
      T00322_A953IvaCod = new String[] {""} ;
      T00322_n953IvaCod = new boolean[] {false} ;
      T00322_A954IvaDsc = new String[] {""} ;
      T00322_n954IvaDsc = new boolean[] {false} ;
      T00322_A588IvaPor = new byte[1] ;
      T00322_n588IvaPor = new boolean[] {false} ;
      T00322_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00322_n589IvaRec = new boolean[] {false} ;
      T00322_A7255IvaFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00322_n7255IvaFecIni = new boolean[] {false} ;
      T00322_A7256IvaFecFim = new java.util.Date[] {GXutil.nullDate()} ;
      T00322_n7256IvaFecFim = new boolean[] {false} ;
      T003211_A396EmprCod = new String[] {""} ;
      T003212_A953IvaCod = new String[] {""} ;
      T003212_n953IvaCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ953IvaCod = "" ;
      ZZ954IvaDsc = "" ;
      ZZ589IvaRec = DecimalUtil.ZERO ;
      ZZ7255IvaFecIni = GXutil.nullDate() ;
      ZZ7256IvaFecFim = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tiva__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tiva__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tiva__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tiva__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tiva__default(),
         new Object[] {
             new Object[] {
            T00322_A953IvaCod, T00322_A954IvaDsc, T00322_n954IvaDsc, T00322_A588IvaPor, T00322_n588IvaPor, T00322_A589IvaRec, T00322_n589IvaRec, T00322_A7255IvaFecIni, T00322_n7255IvaFecIni, T00322_A7256IvaFecFim,
            T00322_n7256IvaFecFim
            }
            , new Object[] {
            T00323_A953IvaCod, T00323_A954IvaDsc, T00323_n954IvaDsc, T00323_A588IvaPor, T00323_n588IvaPor, T00323_A589IvaRec, T00323_n589IvaRec, T00323_A7255IvaFecIni, T00323_n7255IvaFecIni, T00323_A7256IvaFecFim,
            T00323_n7256IvaFecFim
            }
            , new Object[] {
            T00324_A953IvaCod, T00324_A954IvaDsc, T00324_n954IvaDsc, T00324_A588IvaPor, T00324_n588IvaPor, T00324_A589IvaRec, T00324_n589IvaRec, T00324_A7255IvaFecIni, T00324_n7255IvaFecIni, T00324_A7256IvaFecFim,
            T00324_n7256IvaFecFim
            }
            , new Object[] {
            T00325_A953IvaCod
            }
            , new Object[] {
            T00326_A953IvaCod
            }
            , new Object[] {
            T00327_A953IvaCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003211_A396EmprCod
            }
            , new Object[] {
            T003212_A953IvaCod
            }
         }
      );
   }

   private byte Z588IvaPor ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A588IvaPor ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ588IvaPor ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound150 ;
   private short nIsDirty_150 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtIvaCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtIvaDsc_Enabled ;
   private int edtIvaPor_Enabled ;
   private int edtIvaRec_Enabled ;
   private int edtIvaFecIni_Enabled ;
   private int edtIvaFecFim_Enabled ;
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
   private int edtIvaFecFim_Backcolor ;
   private int edtIvaFecIni_Backcolor ;
   private int edtIvaRec_Backcolor ;
   private int edtIvaPor_Backcolor ;
   private int edtIvaDsc_Backcolor ;
   private int edtIvaCod_Backcolor ;
   private java.math.BigDecimal Z589IvaRec ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal ZZ589IvaRec ;
   private String sPrefix ;
   private String Z953IvaCod ;
   private String Z954IvaDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtIvaCod_Internalname ;
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
   private String A953IvaCod ;
   private String edtIvaCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtIvaDsc_Internalname ;
   private String A954IvaDsc ;
   private String edtIvaDsc_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtIvaPor_Internalname ;
   private String edtIvaPor_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtIvaRec_Internalname ;
   private String edtIvaRec_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtIvaFecIni_Internalname ;
   private String edtIvaFecIni_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtIvaFecFim_Internalname ;
   private String edtIvaFecFim_Jsonclick ;
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
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV20Lit4 ;
   private String AV23Lit5 ;
   private String AV27Lit6 ;
   private String AV28Lit7 ;
   private String AV22LitFe ;
   private String GXt_char1 ;
   private String AV26Station ;
   private String AV24EmprCod ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String GXv_char3[] ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String sMode150 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ953IvaCod ;
   private String ZZ954IvaDsc ;
   private java.util.Date Z7255IvaFecIni ;
   private java.util.Date Z7256IvaFecFim ;
   private java.util.Date A7255IvaFecIni ;
   private java.util.Date A7256IvaFecFim ;
   private java.util.Date ZZ7255IvaFecIni ;
   private java.util.Date ZZ7256IvaFecFim ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n953IvaCod ;
   private boolean n954IvaDsc ;
   private boolean n588IvaPor ;
   private boolean n589IvaRec ;
   private boolean n7255IvaFecIni ;
   private boolean n7256IvaFecFim ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T00324_A953IvaCod ;
   private boolean[] T00324_n953IvaCod ;
   private String[] T00324_A954IvaDsc ;
   private boolean[] T00324_n954IvaDsc ;
   private byte[] T00324_A588IvaPor ;
   private boolean[] T00324_n588IvaPor ;
   private java.math.BigDecimal[] T00324_A589IvaRec ;
   private boolean[] T00324_n589IvaRec ;
   private java.util.Date[] T00324_A7255IvaFecIni ;
   private boolean[] T00324_n7255IvaFecIni ;
   private java.util.Date[] T00324_A7256IvaFecFim ;
   private boolean[] T00324_n7256IvaFecFim ;
   private String[] T00325_A953IvaCod ;
   private boolean[] T00325_n953IvaCod ;
   private String[] T00323_A953IvaCod ;
   private boolean[] T00323_n953IvaCod ;
   private String[] T00323_A954IvaDsc ;
   private boolean[] T00323_n954IvaDsc ;
   private byte[] T00323_A588IvaPor ;
   private boolean[] T00323_n588IvaPor ;
   private java.math.BigDecimal[] T00323_A589IvaRec ;
   private boolean[] T00323_n589IvaRec ;
   private java.util.Date[] T00323_A7255IvaFecIni ;
   private boolean[] T00323_n7255IvaFecIni ;
   private java.util.Date[] T00323_A7256IvaFecFim ;
   private boolean[] T00323_n7256IvaFecFim ;
   private String[] T00326_A953IvaCod ;
   private boolean[] T00326_n953IvaCod ;
   private String[] T00327_A953IvaCod ;
   private boolean[] T00327_n953IvaCod ;
   private String[] T00322_A953IvaCod ;
   private boolean[] T00322_n953IvaCod ;
   private String[] T00322_A954IvaDsc ;
   private boolean[] T00322_n954IvaDsc ;
   private byte[] T00322_A588IvaPor ;
   private boolean[] T00322_n588IvaPor ;
   private java.math.BigDecimal[] T00322_A589IvaRec ;
   private boolean[] T00322_n589IvaRec ;
   private java.util.Date[] T00322_A7255IvaFecIni ;
   private boolean[] T00322_n7255IvaFecIni ;
   private java.util.Date[] T00322_A7256IvaFecFim ;
   private boolean[] T00322_n7256IvaFecFim ;
   private String[] T003211_A396EmprCod ;
   private String[] T003212_A953IvaCod ;
   private boolean[] T003212_n953IvaCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tiva__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tiva__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tiva__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tiva__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tiva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00322", "SELECT IvaCod, IvaDsc, IvaPor, IvaRec, IvaFecIni, IvaFecFim FROM TXPTIPIVA WHERE IvaCod = ?  FOR UPDATE OF IvaDsc, IvaPor, IvaRec, IvaFecIni, IvaFecFim NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00323", "SELECT IvaCod, IvaDsc, IvaPor, IvaRec, IvaFecIni, IvaFecFim FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00324", "SELECT /*+ FIRST_ROWS(100) */ TM1.IvaCod, TM1.IvaDsc, TM1.IvaPor, TM1.IvaRec, TM1.IvaFecIni, TM1.IvaFecFim FROM TXPTIPIVA TM1 WHERE TM1.IvaCod = ? ORDER BY TM1.IvaCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00325", "SELECT /*+ FIRST_ROWS(1) */ IvaCod FROM TXPTIPIVA WHERE IvaCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00326", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ IvaCod FROM TXPTIPIVA WHERE ( IvaCod > ?) ORDER BY IvaCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00327", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ IvaCod FROM TXPTIPIVA WHERE ( IvaCod < ?) ORDER BY IvaCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00328", "INSERT INTO TXPTIPIVA(IvaCod, IvaDsc, IvaPor, IvaRec, IvaFecIni, IvaFecFim) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTIPIVA")
         ,new UpdateCursor("T00329", "UPDATE TXPTIPIVA SET IvaDsc=?, IvaPor=?, IvaRec=?, IvaFecIni=?, IvaFecFim=?  WHERE IvaCod = ?", GX_NOMASK, "TXPTIPIVA")
         ,new UpdateCursor("T003210", "DELETE FROM TXPTIPIVA  WHERE IvaCod = ?", GX_NOMASK, "TXPTIPIVA")
         ,new ForEachCursor("T003211", "SELECT * FROM (SELECT EmprCod FROM TXPEMPRES WHERE IvaCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003212", "SELECT /*+ FIRST_ROWS(100) */ IvaCod FROM TXPTIPIVA ORDER BY IvaCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               return;
            case 10 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 25);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
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
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
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
                  stmt.setString(6, (String)parms[11], 3);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

