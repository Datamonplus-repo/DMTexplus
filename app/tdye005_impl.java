package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdye005_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ProductConsumption", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAutoKey_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdye005_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdye005_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdye005_impl.class ));
   }

   public tdye005_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDYE005.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Auto Key", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAutoKey_Internalname, GXutil.ltrim( localUtil.ntoc( A12605AutoKey, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAutoKey_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12605AutoKey), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12605AutoKey), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAutoKey_Jsonclick, 0, "", "", "", "", "", 1, edtAutoKey_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Remark", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtRemark_Internalname, A12606Remark, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), 1, edtRemark_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "254", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Consumption Time", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtConsumptio_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtConsumptio_Internalname, localUtil.ttoc( A12607Consumptio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12607Consumptio, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtConsumptio_Jsonclick, 0, "", "", "", "", "", 1, edtConsumptio_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE005.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtConsumptio_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtConsumptio_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDYE005.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "ProductName", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProductNm_Internalname, A12608ProductNm, GXutil.rtrim( localUtil.format( A12608ProductNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProductNm_Jsonclick, 0, "", "", "", "", "", 1, edtProductNm_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "ActualAMout", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAmountActu_Internalname, GXutil.ltrim( localUtil.ntoc( A12609AmountActu, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAmountActu_Enabled!=0) ? localUtil.format( A12609AmountActu, "ZZZZZZ9.99999") : localUtil.format( A12609AmountActu, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAmountActu_Jsonclick, 0, "", "", "", "", "", 1, edtAmountActu_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Unit", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUnit2_Internalname, A12610Unit2, GXutil.rtrim( localUtil.format( A12610Unit2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUnit2_Jsonclick, 0, "", "", "", "", "", 1, edtUnit2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Product ID", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProductID_Internalname, GXutil.ltrim( localUtil.ntoc( A12711ProductID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProductID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12711ProductID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12711ProductID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProductID_Jsonclick, 0, "", "", "", "", "", 1, edtProductID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE005.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE005.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDYE005.htm");
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
         Z12605AutoKey = (int)(localUtil.ctol( httpContext.cgiGet( "Z12605AutoKey"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12606Remark = httpContext.cgiGet( "Z12606Remark") ;
         Z12607Consumptio = localUtil.ctot( httpContext.cgiGet( "Z12607Consumptio"), 0) ;
         Z12608ProductNm = httpContext.cgiGet( "Z12608ProductNm") ;
         Z12609AmountActu = localUtil.ctond( httpContext.cgiGet( "Z12609AmountActu")) ;
         Z12610Unit2 = httpContext.cgiGet( "Z12610Unit2") ;
         Z12711ProductID = (int)(localUtil.ctol( httpContext.cgiGet( "Z12711ProductID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAutoKey_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAutoKey_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AUTOKEY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAutoKey_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12605AutoKey = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
         }
         else
         {
            A12605AutoKey = (int)(localUtil.ctol( httpContext.cgiGet( edtAutoKey_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
         }
         A12606Remark = httpContext.cgiGet( edtRemark_Internalname) ;
         n12606Remark = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12606Remark", A12606Remark);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtConsumptio_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CONSUMPTIO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtConsumptio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
            n12607Consumptio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A12607Consumptio = localUtil.ctot( httpContext.cgiGet( edtConsumptio_Internalname)) ;
            n12607Consumptio = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A12608ProductNm = httpContext.cgiGet( edtProductNm_Internalname) ;
         n12608ProductNm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12608ProductNm", A12608ProductNm);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAmountActu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAmountActu_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AMOUNTACTU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAmountActu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12609AmountActu = DecimalUtil.ZERO ;
            n12609AmountActu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrimstr( A12609AmountActu, 13, 5));
         }
         else
         {
            A12609AmountActu = localUtil.ctond( httpContext.cgiGet( edtAmountActu_Internalname)) ;
            n12609AmountActu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrimstr( A12609AmountActu, 13, 5));
         }
         A12610Unit2 = httpContext.cgiGet( edtUnit2_Internalname) ;
         n12610Unit2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12610Unit2", A12610Unit2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProductID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProductID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRODUCTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProductID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12711ProductID = 0 ;
            n12711ProductID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12711ProductID), 8, 0));
         }
         else
         {
            A12711ProductID = (int)(localUtil.ctol( httpContext.cgiGet( edtProductID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12711ProductID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12711ProductID), 8, 0));
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
            A12605AutoKey = (int)(GXutil.lval( httpContext.GetPar( "AutoKey"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
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
            initAll1KP1735( ) ;
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
      disableAttributes1KP1735( ) ;
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

   public void confirm_1KP0( )
   {
      beforeValidate1KP1735( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KP1735( ) ;
         }
         else
         {
            checkExtendedTable1KP1735( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1KP1735( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KP0( ) ;
      }
   }

   public void resetCaption1KP0( )
   {
   }

   public void zm1KP1735( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12606Remark = T01KP3_A12606Remark[0] ;
            Z12607Consumptio = T01KP3_A12607Consumptio[0] ;
            Z12608ProductNm = T01KP3_A12608ProductNm[0] ;
            Z12609AmountActu = T01KP3_A12609AmountActu[0] ;
            Z12610Unit2 = T01KP3_A12610Unit2[0] ;
            Z12711ProductID = T01KP3_A12711ProductID[0] ;
         }
         else
         {
            Z12606Remark = A12606Remark ;
            Z12607Consumptio = A12607Consumptio ;
            Z12608ProductNm = A12608ProductNm ;
            Z12609AmountActu = A12609AmountActu ;
            Z12610Unit2 = A12610Unit2 ;
            Z12711ProductID = A12711ProductID ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12605AutoKey = A12605AutoKey ;
         Z12606Remark = A12606Remark ;
         Z12607Consumptio = A12607Consumptio ;
         Z12608ProductNm = A12608ProductNm ;
         Z12609AmountActu = A12609AmountActu ;
         Z12610Unit2 = A12610Unit2 ;
         Z12711ProductID = A12711ProductID ;
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

   public void load1KP1735( )
   {
      /* Using cursor T01KP4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A12605AutoKey)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1735 = (short)(1) ;
         A12606Remark = T01KP4_A12606Remark[0] ;
         n12606Remark = T01KP4_n12606Remark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12606Remark", A12606Remark);
         A12607Consumptio = T01KP4_A12607Consumptio[0] ;
         n12607Consumptio = T01KP4_n12607Consumptio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12608ProductNm = T01KP4_A12608ProductNm[0] ;
         n12608ProductNm = T01KP4_n12608ProductNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12608ProductNm", A12608ProductNm);
         A12609AmountActu = T01KP4_A12609AmountActu[0] ;
         n12609AmountActu = T01KP4_n12609AmountActu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrimstr( A12609AmountActu, 13, 5));
         A12610Unit2 = T01KP4_A12610Unit2[0] ;
         n12610Unit2 = T01KP4_n12610Unit2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12610Unit2", A12610Unit2);
         A12711ProductID = T01KP4_A12711ProductID[0] ;
         n12711ProductID = T01KP4_n12711ProductID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12711ProductID), 8, 0));
         zm1KP1735( -1) ;
      }
      pr_default.close(2);
      onLoadActions1KP1735( ) ;
   }

   public void onLoadActions1KP1735( )
   {
   }

   public void checkExtendedTable1KP1735( )
   {
      nIsDirty_1735 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KP1735( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KP1735( )
   {
      /* Using cursor T01KP5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A12605AutoKey)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1735 = (short)(1) ;
      }
      else
      {
         RcdFound1735 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KP3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A12605AutoKey)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1KP1735( 1) ;
         RcdFound1735 = (short)(1) ;
         A12605AutoKey = T01KP3_A12605AutoKey[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
         A12606Remark = T01KP3_A12606Remark[0] ;
         n12606Remark = T01KP3_n12606Remark[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12606Remark", A12606Remark);
         A12607Consumptio = T01KP3_A12607Consumptio[0] ;
         n12607Consumptio = T01KP3_n12607Consumptio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12608ProductNm = T01KP3_A12608ProductNm[0] ;
         n12608ProductNm = T01KP3_n12608ProductNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12608ProductNm", A12608ProductNm);
         A12609AmountActu = T01KP3_A12609AmountActu[0] ;
         n12609AmountActu = T01KP3_n12609AmountActu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrimstr( A12609AmountActu, 13, 5));
         A12610Unit2 = T01KP3_A12610Unit2[0] ;
         n12610Unit2 = T01KP3_n12610Unit2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12610Unit2", A12610Unit2);
         A12711ProductID = T01KP3_A12711ProductID[0] ;
         n12711ProductID = T01KP3_n12711ProductID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12711ProductID), 8, 0));
         Z12605AutoKey = A12605AutoKey ;
         sMode1735 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KP1735( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1735 = (short)(0) ;
            initializeNonKey1KP1735( ) ;
         }
         Gx_mode = sMode1735 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1735 = (short)(0) ;
         initializeNonKey1KP1735( ) ;
         sMode1735 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1735 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KP1735( ) ;
      if ( RcdFound1735 == 0 )
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
      RcdFound1735 = (short)(0) ;
      /* Using cursor T01KP6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A12605AutoKey)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T01KP6_A12605AutoKey[0] < A12605AutoKey ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T01KP6_A12605AutoKey[0] > A12605AutoKey ) ) )
         {
            A12605AutoKey = T01KP6_A12605AutoKey[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
            RcdFound1735 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1735 = (short)(0) ;
      /* Using cursor T01KP7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A12605AutoKey)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01KP7_A12605AutoKey[0] > A12605AutoKey ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01KP7_A12605AutoKey[0] < A12605AutoKey ) ) )
         {
            A12605AutoKey = T01KP7_A12605AutoKey[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
            RcdFound1735 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KP1735( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAutoKey_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KP1735( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1735 == 1 )
         {
            if ( A12605AutoKey != Z12605AutoKey )
            {
               A12605AutoKey = Z12605AutoKey ;
               httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "AUTOKEY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAutoKey_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAutoKey_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KP1735( ) ;
               GX_FocusControl = edtAutoKey_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A12605AutoKey != Z12605AutoKey )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAutoKey_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KP1735( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "AUTOKEY");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAutoKey_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtAutoKey_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KP1735( ) ;
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
      if ( A12605AutoKey != Z12605AutoKey )
      {
         A12605AutoKey = Z12605AutoKey ;
         httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "AUTOKEY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAutoKey_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAutoKey_Internalname ;
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
      getKey1KP1735( ) ;
      if ( RcdFound1735 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "AUTOKEY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAutoKey_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A12605AutoKey != Z12605AutoKey )
         {
            A12605AutoKey = Z12605AutoKey ;
            httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "AUTOKEY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAutoKey_Internalname ;
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
         if ( A12605AutoKey != Z12605AutoKey )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "AUTOKEY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAutoKey_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye005");
      GX_FocusControl = edtRemark_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KP0( ) ;
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
      if ( RcdFound1735 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "AUTOKEY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAutoKey_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRemark_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KP1735( ) ;
      if ( RcdFound1735 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRemark_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KP1735( ) ;
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
      if ( RcdFound1735 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRemark_Internalname ;
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
      if ( RcdFound1735 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRemark_Internalname ;
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
      scanStart1KP1735( ) ;
      if ( RcdFound1735 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1735 != 0 )
         {
            scanNext1KP1735( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRemark_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KP1735( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KP1735( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KP2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A12605AutoKey)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE005"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12606Remark, T01KP2_A12606Remark[0]) != 0 ) || !( GXutil.dateCompare(Z12607Consumptio, T01KP2_A12607Consumptio[0]) ) || ( GXutil.strcmp(Z12608ProductNm, T01KP2_A12608ProductNm[0]) != 0 ) || ( DecimalUtil.compareTo(Z12609AmountActu, T01KP2_A12609AmountActu[0]) != 0 ) || ( GXutil.strcmp(Z12610Unit2, T01KP2_A12610Unit2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12711ProductID != T01KP2_A12711ProductID[0] ) )
         {
            if ( GXutil.strcmp(Z12606Remark, T01KP2_A12606Remark[0]) != 0 )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"Remark");
               GXutil.writeLogRaw("Old: ",Z12606Remark);
               GXutil.writeLogRaw("Current: ",T01KP2_A12606Remark[0]);
            }
            if ( !( GXutil.dateCompare(Z12607Consumptio, T01KP2_A12607Consumptio[0]) ) )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"Consumptio");
               GXutil.writeLogRaw("Old: ",Z12607Consumptio);
               GXutil.writeLogRaw("Current: ",T01KP2_A12607Consumptio[0]);
            }
            if ( GXutil.strcmp(Z12608ProductNm, T01KP2_A12608ProductNm[0]) != 0 )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"ProductNm");
               GXutil.writeLogRaw("Old: ",Z12608ProductNm);
               GXutil.writeLogRaw("Current: ",T01KP2_A12608ProductNm[0]);
            }
            if ( DecimalUtil.compareTo(Z12609AmountActu, T01KP2_A12609AmountActu[0]) != 0 )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"AmountActu");
               GXutil.writeLogRaw("Old: ",Z12609AmountActu);
               GXutil.writeLogRaw("Current: ",T01KP2_A12609AmountActu[0]);
            }
            if ( GXutil.strcmp(Z12610Unit2, T01KP2_A12610Unit2[0]) != 0 )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"Unit2");
               GXutil.writeLogRaw("Old: ",Z12610Unit2);
               GXutil.writeLogRaw("Current: ",T01KP2_A12610Unit2[0]);
            }
            if ( Z12711ProductID != T01KP2_A12711ProductID[0] )
            {
               GXutil.writeLogln("tdye005:[seudo value changed for attri]"+"ProductID");
               GXutil.writeLogRaw("Old: ",Z12711ProductID);
               GXutil.writeLogRaw("Current: ",T01KP2_A12711ProductID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDYE005"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KP1735( )
   {
      beforeValidate1KP1735( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KP1735( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KP1735( 0) ;
         checkOptimisticConcurrency1KP1735( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KP1735( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KP1735( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KP8 */
                  pr_default.execute(6, new Object[] {Integer.valueOf(A12605AutoKey), Boolean.valueOf(n12606Remark), A12606Remark, Boolean.valueOf(n12607Consumptio), A12607Consumptio, Boolean.valueOf(n12608ProductNm), A12608ProductNm, Boolean.valueOf(n12609AmountActu), A12609AmountActu, Boolean.valueOf(n12610Unit2), A12610Unit2, Boolean.valueOf(n12711ProductID), Integer.valueOf(A12711ProductID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE005");
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
                        resetCaption1KP0( ) ;
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
            load1KP1735( ) ;
         }
         endLevel1KP1735( ) ;
      }
      closeExtendedTableCursors1KP1735( ) ;
   }

   public void update1KP1735( )
   {
      beforeValidate1KP1735( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KP1735( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KP1735( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KP1735( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KP1735( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KP9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n12606Remark), A12606Remark, Boolean.valueOf(n12607Consumptio), A12607Consumptio, Boolean.valueOf(n12608ProductNm), A12608ProductNm, Boolean.valueOf(n12609AmountActu), A12609AmountActu, Boolean.valueOf(n12610Unit2), A12610Unit2, Boolean.valueOf(n12711ProductID), Integer.valueOf(A12711ProductID), Integer.valueOf(A12605AutoKey)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE005");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE005"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KP1735( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KP0( ) ;
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
         endLevel1KP1735( ) ;
      }
      closeExtendedTableCursors1KP1735( ) ;
   }

   public void deferredUpdate1KP1735( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KP1735( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KP1735( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KP1735( ) ;
         afterConfirm1KP1735( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KP1735( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KP10 */
               pr_default.execute(8, new Object[] {Integer.valueOf(A12605AutoKey)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE005");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1735 == 0 )
                     {
                        initAll1KP1735( ) ;
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
                     resetCaption1KP0( ) ;
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
      sMode1735 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KP1735( ) ;
      Gx_mode = sMode1735 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KP1735( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KP1735( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KP1735( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdye005");
         if ( AnyError == 0 )
         {
            confirmValues1KP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye005");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KP1735( )
   {
      /* Using cursor T01KP11 */
      pr_default.execute(9);
      RcdFound1735 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1735 = (short)(1) ;
         A12605AutoKey = T01KP11_A12605AutoKey[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KP1735( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1735 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1735 = (short)(1) ;
         A12605AutoKey = T01KP11_A12605AutoKey[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
      }
   }

   public void scanEnd1KP1735( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1KP1735( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KP1735( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KP1735( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KP1735( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KP1735( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KP1735( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KP1735( )
   {
      edtAutoKey_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAutoKey_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAutoKey_Enabled), 5, 0), true);
      edtRemark_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRemark_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRemark_Enabled), 5, 0), true);
      edtConsumptio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtConsumptio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtConsumptio_Enabled), 5, 0), true);
      edtProductNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProductNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProductNm_Enabled), 5, 0), true);
      edtAmountActu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAmountActu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAmountActu_Enabled), 5, 0), true);
      edtUnit2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUnit2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUnit2_Enabled), 5, 0), true);
      edtProductID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProductID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProductID_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KP1735( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdye005", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12605AutoKey", GXutil.ltrim( localUtil.ntoc( Z12605AutoKey, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12606Remark", Z12606Remark);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12607Consumptio", localUtil.ttoc( Z12607Consumptio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12608ProductNm", Z12608ProductNm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12609AmountActu", GXutil.ltrim( localUtil.ntoc( Z12609AmountActu, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12610Unit2", Z12610Unit2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12711ProductID", GXutil.ltrim( localUtil.ntoc( Z12711ProductID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdye005", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDYE005" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ProductConsumption", "") ;
   }

   public void initializeNonKey1KP1735( )
   {
      A12606Remark = "" ;
      n12606Remark = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12606Remark", A12606Remark);
      A12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
      n12607Consumptio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12608ProductNm = "" ;
      n12608ProductNm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12608ProductNm", A12608ProductNm);
      A12609AmountActu = DecimalUtil.ZERO ;
      n12609AmountActu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrimstr( A12609AmountActu, 13, 5));
      A12610Unit2 = "" ;
      n12610Unit2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12610Unit2", A12610Unit2);
      A12711ProductID = 0 ;
      n12711ProductID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12711ProductID), 8, 0));
      Z12606Remark = "" ;
      Z12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
      Z12608ProductNm = "" ;
      Z12609AmountActu = DecimalUtil.ZERO ;
      Z12610Unit2 = "" ;
      Z12711ProductID = 0 ;
   }

   public void initAll1KP1735( )
   {
      A12605AutoKey = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12605AutoKey", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12605AutoKey), 8, 0));
      initializeNonKey1KP1735( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251953339", true, true);
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
      httpContext.AddJavascriptSource("tdye005.js", "?20261251953340", false, true);
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
      edtAutoKey_Internalname = "AUTOKEY" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtRemark_Internalname = "REMARK" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtConsumptio_Internalname = "CONSUMPTIO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtProductNm_Internalname = "PRODUCTNM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtAmountActu_Internalname = "AMOUNTACTU" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtUnit2_Internalname = "UNIT2" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProductID_Internalname = "PRODUCTID" ;
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
      Form.setCaption( httpContext.getMessage( "ProductConsumption", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProductID_Jsonclick = "" ;
      edtProductID_Backcolor = (int)(0xFFFFFF) ;
      edtProductID_Enabled = 1 ;
      edtUnit2_Jsonclick = "" ;
      edtUnit2_Backcolor = (int)(0xFFFFFF) ;
      edtUnit2_Enabled = 1 ;
      edtAmountActu_Jsonclick = "" ;
      edtAmountActu_Backcolor = (int)(0xFFFFFF) ;
      edtAmountActu_Enabled = 1 ;
      edtProductNm_Jsonclick = "" ;
      edtProductNm_Backcolor = (int)(0xFFFFFF) ;
      edtProductNm_Enabled = 1 ;
      edtConsumptio_Jsonclick = "" ;
      edtConsumptio_Backcolor = (int)(0xFFFFFF) ;
      edtConsumptio_Enabled = 1 ;
      edtRemark_Backcolor = (int)(0xFFFFFF) ;
      edtRemark_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAutoKey_Jsonclick = "" ;
      edtAutoKey_Backcolor = (int)(0xFFFFFF) ;
      edtAutoKey_Enabled = 1 ;
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
      GX_FocusControl = edtRemark_Internalname ;
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

   public void valid_Autokey( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12606Remark", A12606Remark);
      httpContext.ajax_rsp_assign_attri("", false, "A12607Consumptio", localUtil.ttoc( A12607Consumptio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12608ProductNm", A12608ProductNm);
      httpContext.ajax_rsp_assign_attri("", false, "A12609AmountActu", GXutil.ltrim( localUtil.ntoc( A12609AmountActu, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12610Unit2", A12610Unit2);
      httpContext.ajax_rsp_assign_attri("", false, "A12711ProductID", GXutil.ltrim( localUtil.ntoc( A12711ProductID, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12605AutoKey", GXutil.ltrim( localUtil.ntoc( Z12605AutoKey, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12606Remark", Z12606Remark);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12607Consumptio", localUtil.ttoc( Z12607Consumptio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12608ProductNm", Z12608ProductNm);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12609AmountActu", GXutil.ltrim( localUtil.ntoc( Z12609AmountActu, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12610Unit2", Z12610Unit2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12711ProductID", GXutil.ltrim( localUtil.ntoc( Z12711ProductID, (byte)(8), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_AUTOKEY","{handler:'valid_Autokey',iparms:[{av:'A12605AutoKey',fld:'AUTOKEY',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_AUTOKEY",",oparms:[{av:'A12606Remark',fld:'REMARK',pic:''},{av:'A12607Consumptio',fld:'CONSUMPTIO',pic:'99/99/99 99:99'},{av:'A12608ProductNm',fld:'PRODUCTNM',pic:''},{av:'A12609AmountActu',fld:'AMOUNTACTU',pic:'ZZZZZZ9.99999'},{av:'A12610Unit2',fld:'UNIT2',pic:''},{av:'A12711ProductID',fld:'PRODUCTID',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12605AutoKey'},{av:'Z12606Remark'},{av:'Z12607Consumptio'},{av:'Z12608ProductNm'},{av:'Z12609AmountActu'},{av:'Z12610Unit2'},{av:'Z12711ProductID'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z12606Remark = "" ;
      Z12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
      Z12608ProductNm = "" ;
      Z12609AmountActu = DecimalUtil.ZERO ;
      Z12610Unit2 = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A12606Remark = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock4_Jsonclick = "" ;
      A12608ProductNm = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12609AmountActu = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A12610Unit2 = "" ;
      lblTextblock7_Jsonclick = "" ;
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
      T01KP4_A12605AutoKey = new int[1] ;
      T01KP4_A12606Remark = new String[] {""} ;
      T01KP4_n12606Remark = new boolean[] {false} ;
      T01KP4_A12607Consumptio = new java.util.Date[] {GXutil.nullDate()} ;
      T01KP4_n12607Consumptio = new boolean[] {false} ;
      T01KP4_A12608ProductNm = new String[] {""} ;
      T01KP4_n12608ProductNm = new boolean[] {false} ;
      T01KP4_A12609AmountActu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KP4_n12609AmountActu = new boolean[] {false} ;
      T01KP4_A12610Unit2 = new String[] {""} ;
      T01KP4_n12610Unit2 = new boolean[] {false} ;
      T01KP4_A12711ProductID = new int[1] ;
      T01KP4_n12711ProductID = new boolean[] {false} ;
      T01KP5_A12605AutoKey = new int[1] ;
      T01KP3_A12605AutoKey = new int[1] ;
      T01KP3_A12606Remark = new String[] {""} ;
      T01KP3_n12606Remark = new boolean[] {false} ;
      T01KP3_A12607Consumptio = new java.util.Date[] {GXutil.nullDate()} ;
      T01KP3_n12607Consumptio = new boolean[] {false} ;
      T01KP3_A12608ProductNm = new String[] {""} ;
      T01KP3_n12608ProductNm = new boolean[] {false} ;
      T01KP3_A12609AmountActu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KP3_n12609AmountActu = new boolean[] {false} ;
      T01KP3_A12610Unit2 = new String[] {""} ;
      T01KP3_n12610Unit2 = new boolean[] {false} ;
      T01KP3_A12711ProductID = new int[1] ;
      T01KP3_n12711ProductID = new boolean[] {false} ;
      sMode1735 = "" ;
      T01KP6_A12605AutoKey = new int[1] ;
      T01KP7_A12605AutoKey = new int[1] ;
      T01KP2_A12605AutoKey = new int[1] ;
      T01KP2_A12606Remark = new String[] {""} ;
      T01KP2_n12606Remark = new boolean[] {false} ;
      T01KP2_A12607Consumptio = new java.util.Date[] {GXutil.nullDate()} ;
      T01KP2_n12607Consumptio = new boolean[] {false} ;
      T01KP2_A12608ProductNm = new String[] {""} ;
      T01KP2_n12608ProductNm = new boolean[] {false} ;
      T01KP2_A12609AmountActu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KP2_n12609AmountActu = new boolean[] {false} ;
      T01KP2_A12610Unit2 = new String[] {""} ;
      T01KP2_n12610Unit2 = new boolean[] {false} ;
      T01KP2_A12711ProductID = new int[1] ;
      T01KP2_n12711ProductID = new boolean[] {false} ;
      T01KP11_A12605AutoKey = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ12606Remark = "" ;
      ZZ12607Consumptio = GXutil.resetTime( GXutil.nullDate() );
      ZZ12608ProductNm = "" ;
      ZZ12609AmountActu = DecimalUtil.ZERO ;
      ZZ12610Unit2 = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdye005__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdye005__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdye005__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdye005__default(),
         new Object[] {
             new Object[] {
            T01KP2_A12605AutoKey, T01KP2_A12606Remark, T01KP2_n12606Remark, T01KP2_A12607Consumptio, T01KP2_n12607Consumptio, T01KP2_A12608ProductNm, T01KP2_n12608ProductNm, T01KP2_A12609AmountActu, T01KP2_n12609AmountActu, T01KP2_A12610Unit2,
            T01KP2_n12610Unit2, T01KP2_A12711ProductID, T01KP2_n12711ProductID
            }
            , new Object[] {
            T01KP3_A12605AutoKey, T01KP3_A12606Remark, T01KP3_n12606Remark, T01KP3_A12607Consumptio, T01KP3_n12607Consumptio, T01KP3_A12608ProductNm, T01KP3_n12608ProductNm, T01KP3_A12609AmountActu, T01KP3_n12609AmountActu, T01KP3_A12610Unit2,
            T01KP3_n12610Unit2, T01KP3_A12711ProductID, T01KP3_n12711ProductID
            }
            , new Object[] {
            T01KP4_A12605AutoKey, T01KP4_A12606Remark, T01KP4_n12606Remark, T01KP4_A12607Consumptio, T01KP4_n12607Consumptio, T01KP4_A12608ProductNm, T01KP4_n12608ProductNm, T01KP4_A12609AmountActu, T01KP4_n12609AmountActu, T01KP4_A12610Unit2,
            T01KP4_n12610Unit2, T01KP4_A12711ProductID, T01KP4_n12711ProductID
            }
            , new Object[] {
            T01KP5_A12605AutoKey
            }
            , new Object[] {
            T01KP6_A12605AutoKey
            }
            , new Object[] {
            T01KP7_A12605AutoKey
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KP11_A12605AutoKey
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1735 ;
   private short nIsDirty_1735 ;
   private int Z12605AutoKey ;
   private int Z12711ProductID ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int A12605AutoKey ;
   private int edtAutoKey_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRemark_Enabled ;
   private int edtConsumptio_Enabled ;
   private int edtProductNm_Enabled ;
   private int edtAmountActu_Enabled ;
   private int edtUnit2_Enabled ;
   private int A12711ProductID ;
   private int edtProductID_Enabled ;
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
   private int edtProductID_Backcolor ;
   private int edtUnit2_Backcolor ;
   private int edtAmountActu_Backcolor ;
   private int edtProductNm_Backcolor ;
   private int edtConsumptio_Backcolor ;
   private int edtRemark_Backcolor ;
   private int edtAutoKey_Backcolor ;
   private int ZZ12605AutoKey ;
   private int ZZ12711ProductID ;
   private java.math.BigDecimal Z12609AmountActu ;
   private java.math.BigDecimal A12609AmountActu ;
   private java.math.BigDecimal ZZ12609AmountActu ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAutoKey_Internalname ;
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
   private String edtAutoKey_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtRemark_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtConsumptio_Internalname ;
   private String edtConsumptio_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtProductNm_Internalname ;
   private String edtProductNm_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtAmountActu_Internalname ;
   private String edtAmountActu_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtUnit2_Internalname ;
   private String edtUnit2_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProductID_Internalname ;
   private String edtProductID_Jsonclick ;
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
   private String sMode1735 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z12607Consumptio ;
   private java.util.Date A12607Consumptio ;
   private java.util.Date ZZ12607Consumptio ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12606Remark ;
   private boolean n12607Consumptio ;
   private boolean n12608ProductNm ;
   private boolean n12609AmountActu ;
   private boolean n12610Unit2 ;
   private boolean n12711ProductID ;
   private boolean Gx_longc ;
   private String Z12606Remark ;
   private String Z12608ProductNm ;
   private String Z12610Unit2 ;
   private String A12606Remark ;
   private String A12608ProductNm ;
   private String A12610Unit2 ;
   private String ZZ12606Remark ;
   private String ZZ12608ProductNm ;
   private String ZZ12610Unit2 ;
   private IDataStoreProvider pr_default ;
   private int[] T01KP4_A12605AutoKey ;
   private String[] T01KP4_A12606Remark ;
   private boolean[] T01KP4_n12606Remark ;
   private java.util.Date[] T01KP4_A12607Consumptio ;
   private boolean[] T01KP4_n12607Consumptio ;
   private String[] T01KP4_A12608ProductNm ;
   private boolean[] T01KP4_n12608ProductNm ;
   private java.math.BigDecimal[] T01KP4_A12609AmountActu ;
   private boolean[] T01KP4_n12609AmountActu ;
   private String[] T01KP4_A12610Unit2 ;
   private boolean[] T01KP4_n12610Unit2 ;
   private int[] T01KP4_A12711ProductID ;
   private boolean[] T01KP4_n12711ProductID ;
   private int[] T01KP5_A12605AutoKey ;
   private int[] T01KP3_A12605AutoKey ;
   private String[] T01KP3_A12606Remark ;
   private boolean[] T01KP3_n12606Remark ;
   private java.util.Date[] T01KP3_A12607Consumptio ;
   private boolean[] T01KP3_n12607Consumptio ;
   private String[] T01KP3_A12608ProductNm ;
   private boolean[] T01KP3_n12608ProductNm ;
   private java.math.BigDecimal[] T01KP3_A12609AmountActu ;
   private boolean[] T01KP3_n12609AmountActu ;
   private String[] T01KP3_A12610Unit2 ;
   private boolean[] T01KP3_n12610Unit2 ;
   private int[] T01KP3_A12711ProductID ;
   private boolean[] T01KP3_n12711ProductID ;
   private int[] T01KP6_A12605AutoKey ;
   private int[] T01KP7_A12605AutoKey ;
   private int[] T01KP2_A12605AutoKey ;
   private String[] T01KP2_A12606Remark ;
   private boolean[] T01KP2_n12606Remark ;
   private java.util.Date[] T01KP2_A12607Consumptio ;
   private boolean[] T01KP2_n12607Consumptio ;
   private String[] T01KP2_A12608ProductNm ;
   private boolean[] T01KP2_n12608ProductNm ;
   private java.math.BigDecimal[] T01KP2_A12609AmountActu ;
   private boolean[] T01KP2_n12609AmountActu ;
   private String[] T01KP2_A12610Unit2 ;
   private boolean[] T01KP2_n12610Unit2 ;
   private int[] T01KP2_A12711ProductID ;
   private boolean[] T01KP2_n12711ProductID ;
   private int[] T01KP11_A12605AutoKey ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdye005__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye005__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye005__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KP2", "SELECT AutoKey, Remark, Consumptio, ProductNm, AmountActu, Unit2, ProductID FROM TXPDYE005 WHERE AutoKey = ?  FOR UPDATE OF Remark, Consumptio, ProductNm, AmountActu, Unit2, ProductID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KP3", "SELECT AutoKey, Remark, Consumptio, ProductNm, AmountActu, Unit2, ProductID FROM TXPDYE005 WHERE AutoKey = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KP4", "SELECT /*+ FIRST_ROWS(100) */ TM1.AutoKey, TM1.Remark, TM1.Consumptio, TM1.ProductNm, TM1.AmountActu, TM1.Unit2, TM1.ProductID FROM TXPDYE005 TM1 WHERE TM1.AutoKey = ? ORDER BY TM1.AutoKey ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KP5", "SELECT /*+ FIRST_ROWS(1) */ AutoKey FROM TXPDYE005 WHERE AutoKey = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KP6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AutoKey FROM TXPDYE005 WHERE ( AutoKey > ?) ORDER BY AutoKey) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KP7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AutoKey FROM TXPDYE005 WHERE ( AutoKey < ?) ORDER BY AutoKey DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KP8", "INSERT INTO TXPDYE005(AutoKey, Remark, Consumptio, ProductNm, AmountActu, Unit2, ProductID) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDYE005")
         ,new UpdateCursor("T01KP9", "UPDATE TXPDYE005 SET Remark=?, Consumptio=?, ProductNm=?, AmountActu=?, Unit2=?, ProductID=?  WHERE AutoKey = ?", GX_NOMASK, "TXPDYE005")
         ,new UpdateCursor("T01KP10", "DELETE FROM TXPDYE005  WHERE AutoKey = ?", GX_NOMASK, "TXPDYE005")
         ,new ForEachCursor("T01KP11", "SELECT /*+ FIRST_ROWS(100) */ AutoKey FROM TXPDYE005 ORDER BY AutoKey ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 9 :
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 254);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 50);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 254);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 50);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setInt(7, ((Number) parms[12]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

