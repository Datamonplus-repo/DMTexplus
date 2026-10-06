package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdye002_impl extends GXDataArea
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
         A12313Dyelot = httpContext.GetPar( "Dyelot") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = (int)(GXutil.lval( httpContext.GetPar( "ReDye"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A12313Dyelot, A12314ReDye) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DYELOT_RECIPE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdye002_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdye002_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdye002_impl.class ));
   }

   public tdye002_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDYE002.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Dyelot", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDyelot_Internalname, A12313Dyelot, GXutil.rtrim( localUtil.format( A12313Dyelot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDyelot_Jsonclick, 0, "", "", "", "", "", 1, edtDyelot_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Re Dye", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtReDye_Internalname, GXutil.ltrim( localUtil.ntoc( A12314ReDye, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtReDye_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12314ReDye), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12314ReDye), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtReDye_Jsonclick, 0, "", "", "", "", "", 1, edtReDye_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Correction Number", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCorrection_Internalname, GXutil.ltrim( localUtil.ntoc( A12320Correction, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCorrection_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12320Correction), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12320Correction), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCorrection_Jsonclick, 0, "", "", "", "", "", 1, edtCorrection_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Call Off", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCallOff_Internalname, GXutil.ltrim( localUtil.ntoc( A12321CallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCallOff_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12321CallOff), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12321CallOff), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCallOff_Jsonclick, 0, "", "", "", "", "", 1, edtCallOff_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Counter", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCounter_Internalname, GXutil.ltrim( localUtil.ntoc( A12322Counter, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCounter_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12322Counter), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12322Counter), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCounter_Jsonclick, 0, "", "", "", "", "", 1, edtCounter_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Product Code", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProductCod_Internalname, A12315ProductCod, GXutil.rtrim( localUtil.format( A12315ProductCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProductCod_Jsonclick, 0, "", "", "", "", "", 1, edtProductCod_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Product Name", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProductNam_Internalname, A12316ProductNam, GXutil.rtrim( localUtil.format( A12316ProductNam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProductNam_Jsonclick, 0, "", "", "", "", "", 1, edtProductNam_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Amount", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAmount_Internalname, GXutil.ltrim( localUtil.ntoc( A12317Amount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAmount_Enabled!=0) ? localUtil.format( A12317Amount, "ZZZZZZ9.99999") : localUtil.format( A12317Amount, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAmount_Jsonclick, 0, "", "", "", "", "", 1, edtAmount_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Unit", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUnit_Internalname, A12318Unit, GXutil.rtrim( localUtil.format( A12318Unit, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUnit_Jsonclick, 0, "", "", "", "", "", 1, edtUnit_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Kind Of Station", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKindOfStat_Internalname, GXutil.ltrim( localUtil.ntoc( A12319KindOfStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKindOfStat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12319KindOfStat), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12319KindOfStat), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKindOfStat_Jsonclick, 0, "", "", "", "", "", 1, edtKindOfStat_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Amount Per Machine", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAmountPerM_Internalname, GXutil.ltrim( localUtil.ntoc( A12323AmountPerM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAmountPerM_Enabled!=0) ? localUtil.format( A12323AmountPerM, "ZZZZZZ9.99999") : localUtil.format( A12323AmountPerM, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAmountPerM_Jsonclick, 0, "", "", "", "", "", 1, edtAmountPerM_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Actual Amount", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtActualAmou_Internalname, GXutil.ltrim( localUtil.ntoc( A12380ActualAmou, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtActualAmou_Enabled!=0) ? localUtil.format( A12380ActualAmou, "ZZZZZZ9.99999") : localUtil.format( A12380ActualAmou, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtActualAmou_Jsonclick, 0, "", "", "", "", "", 1, edtActualAmou_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Product Short Name", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProductSho_Internalname, A12394ProductSho, GXutil.rtrim( localUtil.format( A12394ProductSho, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProductSho_Jsonclick, 0, "", "", "", "", "", 1, edtProductSho_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Recipe Amount", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecipeAmou_Internalname, GXutil.ltrim( localUtil.ntoc( A12420RecipeAmou, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecipeAmou_Enabled!=0) ? localUtil.format( A12420RecipeAmou, "ZZZZZZ9.99999") : localUtil.format( A12420RecipeAmou, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecipeAmou_Jsonclick, 0, "", "", "", "", "", 1, edtRecipeAmou_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Recipe Unit", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecipeUnit_Internalname, A12421RecipeUnit, GXutil.rtrim( localUtil.format( A12421RecipeUnit, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecipeUnit_Jsonclick, 0, "", "", "", "", "", 1, edtRecipeUnit_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Costs Per Amount", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCostsPerAm_Internalname, GXutil.ltrim( localUtil.ntoc( A12422CostsPerAm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCostsPerAm_Enabled!=0) ? localUtil.format( A12422CostsPerAm, "ZZZZZZ9.99999") : localUtil.format( A12422CostsPerAm, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCostsPerAm_Jsonclick, 0, "", "", "", "", "", 1, edtCostsPerAm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Kind Of Product", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKindOfProd_Internalname, GXutil.ltrim( localUtil.ntoc( A12424KindOfProd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKindOfProd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12424KindOfProd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12424KindOfProd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKindOfProd_Jsonclick, 0, "", "", "", "", "", 1, edtKindOfProd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Texplus_ Reclinpro Key", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTexplus_Re_Internalname, A12575Texplus_Re, GXutil.rtrim( localUtil.format( A12575Texplus_Re, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTexplus_Re_Jsonclick, 0, "", "", "", "", "", 1, edtTexplus_Re_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE002.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE002.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDYE002.htm");
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
      e111JU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z12313Dyelot = httpContext.cgiGet( "Z12313Dyelot") ;
            Z12314ReDye = (int)(localUtil.ctol( httpContext.cgiGet( "Z12314ReDye"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12320Correction = (int)(localUtil.ctol( httpContext.cgiGet( "Z12320Correction"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12321CallOff = (int)(localUtil.ctol( httpContext.cgiGet( "Z12321CallOff"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12322Counter = (int)(localUtil.ctol( httpContext.cgiGet( "Z12322Counter"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12315ProductCod = httpContext.cgiGet( "Z12315ProductCod") ;
            Z12316ProductNam = httpContext.cgiGet( "Z12316ProductNam") ;
            Z12317Amount = localUtil.ctond( httpContext.cgiGet( "Z12317Amount")) ;
            Z12318Unit = httpContext.cgiGet( "Z12318Unit") ;
            Z12319KindOfStat = (int)(localUtil.ctol( httpContext.cgiGet( "Z12319KindOfStat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12323AmountPerM = localUtil.ctond( httpContext.cgiGet( "Z12323AmountPerM")) ;
            Z12380ActualAmou = localUtil.ctond( httpContext.cgiGet( "Z12380ActualAmou")) ;
            Z12394ProductSho = httpContext.cgiGet( "Z12394ProductSho") ;
            Z12420RecipeAmou = localUtil.ctond( httpContext.cgiGet( "Z12420RecipeAmou")) ;
            Z12421RecipeUnit = httpContext.cgiGet( "Z12421RecipeUnit") ;
            Z12422CostsPerAm = localUtil.ctond( httpContext.cgiGet( "Z12422CostsPerAm")) ;
            Z12424KindOfProd = (short)(localUtil.ctol( httpContext.cgiGet( "Z12424KindOfProd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12575Texplus_Re = httpContext.cgiGet( "Z12575Texplus_Re") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A12313Dyelot = httpContext.cgiGet( edtDyelot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtReDye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtReDye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "REDYE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtReDye_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12314ReDye = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            }
            else
            {
               A12314ReDye = (int)(localUtil.ctol( httpContext.cgiGet( edtReDye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCorrection_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCorrection_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CORRECTION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCorrection_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12320Correction = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
            }
            else
            {
               A12320Correction = (int)(localUtil.ctol( httpContext.cgiGet( edtCorrection_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALLOFF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCallOff_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12321CallOff = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
            }
            else
            {
               A12321CallOff = (int)(localUtil.ctol( httpContext.cgiGet( edtCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COUNTER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCounter_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12322Counter = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
            }
            else
            {
               A12322Counter = (int)(localUtil.ctol( httpContext.cgiGet( edtCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
            }
            A12315ProductCod = httpContext.cgiGet( edtProductCod_Internalname) ;
            n12315ProductCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12315ProductCod", A12315ProductCod);
            A12316ProductNam = httpContext.cgiGet( edtProductNam_Internalname) ;
            n12316ProductNam = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12316ProductNam", A12316ProductNam);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAmount_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAmount_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AMOUNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAmount_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12317Amount = DecimalUtil.ZERO ;
               n12317Amount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrimstr( A12317Amount, 13, 5));
            }
            else
            {
               A12317Amount = localUtil.ctond( httpContext.cgiGet( edtAmount_Internalname)) ;
               n12317Amount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrimstr( A12317Amount, 13, 5));
            }
            A12318Unit = httpContext.cgiGet( edtUnit_Internalname) ;
            n12318Unit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12318Unit", A12318Unit);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtKindOfStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtKindOfStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KINDOFSTAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtKindOfStat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12319KindOfStat = 0 ;
               n12319KindOfStat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12319KindOfStat), 5, 0));
            }
            else
            {
               A12319KindOfStat = (int)(localUtil.ctol( httpContext.cgiGet( edtKindOfStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12319KindOfStat = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12319KindOfStat), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAmountPerM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAmountPerM_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "AMOUNTPERM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAmountPerM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12323AmountPerM = DecimalUtil.ZERO ;
               n12323AmountPerM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrimstr( A12323AmountPerM, 13, 5));
            }
            else
            {
               A12323AmountPerM = localUtil.ctond( httpContext.cgiGet( edtAmountPerM_Internalname)) ;
               n12323AmountPerM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrimstr( A12323AmountPerM, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtActualAmou_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtActualAmou_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ACTUALAMOU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtActualAmou_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12380ActualAmou = DecimalUtil.ZERO ;
               n12380ActualAmou = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrimstr( A12380ActualAmou, 13, 5));
            }
            else
            {
               A12380ActualAmou = localUtil.ctond( httpContext.cgiGet( edtActualAmou_Internalname)) ;
               n12380ActualAmou = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrimstr( A12380ActualAmou, 13, 5));
            }
            A12394ProductSho = httpContext.cgiGet( edtProductSho_Internalname) ;
            n12394ProductSho = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12394ProductSho", A12394ProductSho);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecipeAmou_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecipeAmou_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECIPEAMOU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecipeAmou_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12420RecipeAmou = DecimalUtil.ZERO ;
               n12420RecipeAmou = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrimstr( A12420RecipeAmou, 13, 5));
            }
            else
            {
               A12420RecipeAmou = localUtil.ctond( httpContext.cgiGet( edtRecipeAmou_Internalname)) ;
               n12420RecipeAmou = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrimstr( A12420RecipeAmou, 13, 5));
            }
            A12421RecipeUnit = httpContext.cgiGet( edtRecipeUnit_Internalname) ;
            n12421RecipeUnit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12421RecipeUnit", A12421RecipeUnit);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCostsPerAm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCostsPerAm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COSTSPERAM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCostsPerAm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12422CostsPerAm = DecimalUtil.ZERO ;
               n12422CostsPerAm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrimstr( A12422CostsPerAm, 13, 5));
            }
            else
            {
               A12422CostsPerAm = localUtil.ctond( httpContext.cgiGet( edtCostsPerAm_Internalname)) ;
               n12422CostsPerAm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrimstr( A12422CostsPerAm, 13, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtKindOfProd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtKindOfProd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KINDOFPROD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtKindOfProd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12424KindOfProd = (short)(0) ;
               n12424KindOfProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12424KindOfProd), 4, 0));
            }
            else
            {
               A12424KindOfProd = (short)(localUtil.ctol( httpContext.cgiGet( edtKindOfProd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12424KindOfProd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12424KindOfProd), 4, 0));
            }
            A12575Texplus_Re = httpContext.cgiGet( edtTexplus_Re_Internalname) ;
            n12575Texplus_Re = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12575Texplus_Re", A12575Texplus_Re);
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
               A12313Dyelot = httpContext.GetPar( "Dyelot") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
               A12314ReDye = (int)(GXutil.lval( httpContext.GetPar( "ReDye"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
               A12320Correction = (int)(GXutil.lval( httpContext.GetPar( "Correction"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
               A12321CallOff = (int)(GXutil.lval( httpContext.GetPar( "CallOff"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
               A12322Counter = (int)(GXutil.lval( httpContext.GetPar( "Counter"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
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
                        e111JU2 ();
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
            initAll1JU1708( ) ;
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
      disableAttributes1JU1708( ) ;
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

   public void confirm_1JU0( )
   {
      beforeValidate1JU1708( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JU1708( ) ;
         }
         else
         {
            checkExtendedTable1JU1708( ) ;
            if ( AnyError == 0 )
            {
               zm1JU1708( 2) ;
            }
            closeExtendedTableCursors1JU1708( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1JU0( ) ;
      }
   }

   public void resetCaption1JU0( )
   {
   }

   public void e111JU2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1JU1708( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12315ProductCod = T01JU3_A12315ProductCod[0] ;
            Z12316ProductNam = T01JU3_A12316ProductNam[0] ;
            Z12317Amount = T01JU3_A12317Amount[0] ;
            Z12318Unit = T01JU3_A12318Unit[0] ;
            Z12319KindOfStat = T01JU3_A12319KindOfStat[0] ;
            Z12323AmountPerM = T01JU3_A12323AmountPerM[0] ;
            Z12380ActualAmou = T01JU3_A12380ActualAmou[0] ;
            Z12394ProductSho = T01JU3_A12394ProductSho[0] ;
            Z12420RecipeAmou = T01JU3_A12420RecipeAmou[0] ;
            Z12421RecipeUnit = T01JU3_A12421RecipeUnit[0] ;
            Z12422CostsPerAm = T01JU3_A12422CostsPerAm[0] ;
            Z12424KindOfProd = T01JU3_A12424KindOfProd[0] ;
            Z12575Texplus_Re = T01JU3_A12575Texplus_Re[0] ;
         }
         else
         {
            Z12315ProductCod = A12315ProductCod ;
            Z12316ProductNam = A12316ProductNam ;
            Z12317Amount = A12317Amount ;
            Z12318Unit = A12318Unit ;
            Z12319KindOfStat = A12319KindOfStat ;
            Z12323AmountPerM = A12323AmountPerM ;
            Z12380ActualAmou = A12380ActualAmou ;
            Z12394ProductSho = A12394ProductSho ;
            Z12420RecipeAmou = A12420RecipeAmou ;
            Z12421RecipeUnit = A12421RecipeUnit ;
            Z12422CostsPerAm = A12422CostsPerAm ;
            Z12424KindOfProd = A12424KindOfProd ;
            Z12575Texplus_Re = A12575Texplus_Re ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12320Correction = A12320Correction ;
         Z12321CallOff = A12321CallOff ;
         Z12322Counter = A12322Counter ;
         Z12315ProductCod = A12315ProductCod ;
         Z12316ProductNam = A12316ProductNam ;
         Z12317Amount = A12317Amount ;
         Z12318Unit = A12318Unit ;
         Z12319KindOfStat = A12319KindOfStat ;
         Z12323AmountPerM = A12323AmountPerM ;
         Z12380ActualAmou = A12380ActualAmou ;
         Z12394ProductSho = A12394ProductSho ;
         Z12420RecipeAmou = A12420RecipeAmou ;
         Z12421RecipeUnit = A12421RecipeUnit ;
         Z12422CostsPerAm = A12422CostsPerAm ;
         Z12424KindOfProd = A12424KindOfProd ;
         Z12575Texplus_Re = A12575Texplus_Re ;
         Z12313Dyelot = A12313Dyelot ;
         Z12314ReDye = A12314ReDye ;
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

   public void load1JU1708( )
   {
      /* Using cursor T01JU5 */
      pr_default.execute(3, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1708 = (short)(1) ;
         A12315ProductCod = T01JU5_A12315ProductCod[0] ;
         n12315ProductCod = T01JU5_n12315ProductCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12315ProductCod", A12315ProductCod);
         A12316ProductNam = T01JU5_A12316ProductNam[0] ;
         n12316ProductNam = T01JU5_n12316ProductNam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12316ProductNam", A12316ProductNam);
         A12317Amount = T01JU5_A12317Amount[0] ;
         n12317Amount = T01JU5_n12317Amount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrimstr( A12317Amount, 13, 5));
         A12318Unit = T01JU5_A12318Unit[0] ;
         n12318Unit = T01JU5_n12318Unit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12318Unit", A12318Unit);
         A12319KindOfStat = T01JU5_A12319KindOfStat[0] ;
         n12319KindOfStat = T01JU5_n12319KindOfStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12319KindOfStat), 5, 0));
         A12323AmountPerM = T01JU5_A12323AmountPerM[0] ;
         n12323AmountPerM = T01JU5_n12323AmountPerM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrimstr( A12323AmountPerM, 13, 5));
         A12380ActualAmou = T01JU5_A12380ActualAmou[0] ;
         n12380ActualAmou = T01JU5_n12380ActualAmou[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrimstr( A12380ActualAmou, 13, 5));
         A12394ProductSho = T01JU5_A12394ProductSho[0] ;
         n12394ProductSho = T01JU5_n12394ProductSho[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12394ProductSho", A12394ProductSho);
         A12420RecipeAmou = T01JU5_A12420RecipeAmou[0] ;
         n12420RecipeAmou = T01JU5_n12420RecipeAmou[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrimstr( A12420RecipeAmou, 13, 5));
         A12421RecipeUnit = T01JU5_A12421RecipeUnit[0] ;
         n12421RecipeUnit = T01JU5_n12421RecipeUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12421RecipeUnit", A12421RecipeUnit);
         A12422CostsPerAm = T01JU5_A12422CostsPerAm[0] ;
         n12422CostsPerAm = T01JU5_n12422CostsPerAm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrimstr( A12422CostsPerAm, 13, 5));
         A12424KindOfProd = T01JU5_A12424KindOfProd[0] ;
         n12424KindOfProd = T01JU5_n12424KindOfProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12424KindOfProd), 4, 0));
         A12575Texplus_Re = T01JU5_A12575Texplus_Re[0] ;
         n12575Texplus_Re = T01JU5_n12575Texplus_Re[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12575Texplus_Re", A12575Texplus_Re);
         zm1JU1708( -1) ;
      }
      pr_default.close(3);
      onLoadActions1JU1708( ) ;
   }

   public void onLoadActions1JU1708( )
   {
   }

   public void checkExtendedTable1JU1708( )
   {
      nIsDirty_1708 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01JU4 */
      pr_default.execute(2, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DYELOTS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REDYE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1JU1708( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A12313Dyelot ,
                         int A12314ReDye )
   {
      /* Using cursor T01JU6 */
      pr_default.execute(4, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DYELOTS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REDYE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
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

   public void getKey1JU1708( )
   {
      /* Using cursor T01JU7 */
      pr_default.execute(5, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1708 = (short)(1) ;
      }
      else
      {
         RcdFound1708 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JU3 */
      pr_default.execute(1, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1JU1708( 1) ;
         RcdFound1708 = (short)(1) ;
         A12320Correction = T01JU3_A12320Correction[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
         A12321CallOff = T01JU3_A12321CallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
         A12322Counter = T01JU3_A12322Counter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
         A12315ProductCod = T01JU3_A12315ProductCod[0] ;
         n12315ProductCod = T01JU3_n12315ProductCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12315ProductCod", A12315ProductCod);
         A12316ProductNam = T01JU3_A12316ProductNam[0] ;
         n12316ProductNam = T01JU3_n12316ProductNam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12316ProductNam", A12316ProductNam);
         A12317Amount = T01JU3_A12317Amount[0] ;
         n12317Amount = T01JU3_n12317Amount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrimstr( A12317Amount, 13, 5));
         A12318Unit = T01JU3_A12318Unit[0] ;
         n12318Unit = T01JU3_n12318Unit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12318Unit", A12318Unit);
         A12319KindOfStat = T01JU3_A12319KindOfStat[0] ;
         n12319KindOfStat = T01JU3_n12319KindOfStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12319KindOfStat), 5, 0));
         A12323AmountPerM = T01JU3_A12323AmountPerM[0] ;
         n12323AmountPerM = T01JU3_n12323AmountPerM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrimstr( A12323AmountPerM, 13, 5));
         A12380ActualAmou = T01JU3_A12380ActualAmou[0] ;
         n12380ActualAmou = T01JU3_n12380ActualAmou[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrimstr( A12380ActualAmou, 13, 5));
         A12394ProductSho = T01JU3_A12394ProductSho[0] ;
         n12394ProductSho = T01JU3_n12394ProductSho[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12394ProductSho", A12394ProductSho);
         A12420RecipeAmou = T01JU3_A12420RecipeAmou[0] ;
         n12420RecipeAmou = T01JU3_n12420RecipeAmou[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrimstr( A12420RecipeAmou, 13, 5));
         A12421RecipeUnit = T01JU3_A12421RecipeUnit[0] ;
         n12421RecipeUnit = T01JU3_n12421RecipeUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12421RecipeUnit", A12421RecipeUnit);
         A12422CostsPerAm = T01JU3_A12422CostsPerAm[0] ;
         n12422CostsPerAm = T01JU3_n12422CostsPerAm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrimstr( A12422CostsPerAm, 13, 5));
         A12424KindOfProd = T01JU3_A12424KindOfProd[0] ;
         n12424KindOfProd = T01JU3_n12424KindOfProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12424KindOfProd), 4, 0));
         A12575Texplus_Re = T01JU3_A12575Texplus_Re[0] ;
         n12575Texplus_Re = T01JU3_n12575Texplus_Re[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12575Texplus_Re", A12575Texplus_Re);
         A12313Dyelot = T01JU3_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JU3_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         Z12313Dyelot = A12313Dyelot ;
         Z12314ReDye = A12314ReDye ;
         Z12320Correction = A12320Correction ;
         Z12321CallOff = A12321CallOff ;
         Z12322Counter = A12322Counter ;
         sMode1708 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JU1708( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1708 = (short)(0) ;
            initializeNonKey1JU1708( ) ;
         }
         Gx_mode = sMode1708 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1708 = (short)(0) ;
         initializeNonKey1JU1708( ) ;
         sMode1708 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1708 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1JU1708( ) ;
      if ( RcdFound1708 == 0 )
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
      RcdFound1708 = (short)(0) ;
      /* Using cursor T01JU8 */
      pr_default.execute(6, new Object[] {A12313Dyelot, A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12320Correction), Integer.valueOf(A12320Correction), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12321CallOff), Integer.valueOf(A12321CallOff), Integer.valueOf(A12320Correction), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12322Counter)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) < 0 ) || ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12314ReDye[0] < A12314ReDye ) || ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12320Correction[0] < A12320Correction ) || ( T01JU8_A12320Correction[0] == A12320Correction ) && ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12321CallOff[0] < A12321CallOff ) || ( T01JU8_A12321CallOff[0] == A12321CallOff ) && ( T01JU8_A12320Correction[0] == A12320Correction ) && ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12322Counter[0] < A12322Counter ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) > 0 ) || ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12314ReDye[0] > A12314ReDye ) || ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12320Correction[0] > A12320Correction ) || ( T01JU8_A12320Correction[0] == A12320Correction ) && ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12321CallOff[0] > A12321CallOff ) || ( T01JU8_A12321CallOff[0] == A12321CallOff ) && ( T01JU8_A12320Correction[0] == A12320Correction ) && ( T01JU8_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU8_A12322Counter[0] > A12322Counter ) ) )
         {
            A12313Dyelot = T01JU8_A12313Dyelot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = T01JU8_A12314ReDye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            A12320Correction = T01JU8_A12320Correction[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
            A12321CallOff = T01JU8_A12321CallOff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
            A12322Counter = T01JU8_A12322Counter[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
            RcdFound1708 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1708 = (short)(0) ;
      /* Using cursor T01JU9 */
      pr_default.execute(7, new Object[] {A12313Dyelot, A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12320Correction), Integer.valueOf(A12320Correction), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12321CallOff), Integer.valueOf(A12321CallOff), Integer.valueOf(A12320Correction), Integer.valueOf(A12314ReDye), A12313Dyelot, Integer.valueOf(A12322Counter)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) > 0 ) || ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12314ReDye[0] > A12314ReDye ) || ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12320Correction[0] > A12320Correction ) || ( T01JU9_A12320Correction[0] == A12320Correction ) && ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12321CallOff[0] > A12321CallOff ) || ( T01JU9_A12321CallOff[0] == A12321CallOff ) && ( T01JU9_A12320Correction[0] == A12320Correction ) && ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12322Counter[0] > A12322Counter ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) < 0 ) || ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12314ReDye[0] < A12314ReDye ) || ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12320Correction[0] < A12320Correction ) || ( T01JU9_A12320Correction[0] == A12320Correction ) && ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12321CallOff[0] < A12321CallOff ) || ( T01JU9_A12321CallOff[0] == A12321CallOff ) && ( T01JU9_A12320Correction[0] == A12320Correction ) && ( T01JU9_A12314ReDye[0] == A12314ReDye ) && ( GXutil.strcmp(T01JU9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JU9_A12322Counter[0] < A12322Counter ) ) )
         {
            A12313Dyelot = T01JU9_A12313Dyelot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = T01JU9_A12314ReDye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            A12320Correction = T01JU9_A12320Correction[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
            A12321CallOff = T01JU9_A12321CallOff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
            A12322Counter = T01JU9_A12322Counter[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
            RcdFound1708 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JU1708( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JU1708( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1708 == 1 )
         {
            if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) || ( A12320Correction != Z12320Correction ) || ( A12321CallOff != Z12321CallOff ) || ( A12322Counter != Z12322Counter ) )
            {
               A12313Dyelot = Z12313Dyelot ;
               httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
               A12314ReDye = Z12314ReDye ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
               A12320Correction = Z12320Correction ;
               httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
               A12321CallOff = Z12321CallOff ;
               httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
               A12322Counter = Z12322Counter ;
               httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DYELOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1JU1708( ) ;
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) || ( A12320Correction != Z12320Correction ) || ( A12321CallOff != Z12321CallOff ) || ( A12322Counter != Z12322Counter ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JU1708( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DYELOT");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDyelot_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtDyelot_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JU1708( ) ;
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
      if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) || ( A12320Correction != Z12320Correction ) || ( A12321CallOff != Z12321CallOff ) || ( A12322Counter != Z12322Counter ) )
      {
         A12313Dyelot = Z12313Dyelot ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = Z12314ReDye ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         A12320Correction = Z12320Correction ;
         httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
         A12321CallOff = Z12321CallOff ;
         httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
         A12322Counter = Z12322Counter ;
         httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DYELOT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDyelot_Internalname ;
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
      getKey1JU1708( ) ;
      if ( RcdFound1708 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "DYELOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDyelot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) || ( A12320Correction != Z12320Correction ) || ( A12321CallOff != Z12321CallOff ) || ( A12322Counter != Z12322Counter ) )
         {
            A12313Dyelot = Z12313Dyelot ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = Z12314ReDye ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            A12320Correction = Z12320Correction ;
            httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
            A12321CallOff = Z12321CallOff ;
            httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
            A12322Counter = Z12322Counter ;
            httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "DYELOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDyelot_Internalname ;
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
         if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) || ( A12320Correction != Z12320Correction ) || ( A12321CallOff != Z12321CallOff ) || ( A12322Counter != Z12322Counter ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DYELOT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDyelot_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye002");
      GX_FocusControl = edtProductCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JU0( ) ;
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
      if ( RcdFound1708 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DYELOT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtProductCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JU1708( ) ;
      if ( RcdFound1708 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProductCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JU1708( ) ;
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
      if ( RcdFound1708 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProductCod_Internalname ;
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
      if ( RcdFound1708 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProductCod_Internalname ;
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
      scanStart1JU1708( ) ;
      if ( RcdFound1708 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1708 != 0 )
         {
            scanNext1JU1708( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtProductCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JU1708( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JU1708( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JU2 */
         pr_default.execute(0, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE002"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12315ProductCod, T01JU2_A12315ProductCod[0]) != 0 ) || ( GXutil.strcmp(Z12316ProductNam, T01JU2_A12316ProductNam[0]) != 0 ) || ( DecimalUtil.compareTo(Z12317Amount, T01JU2_A12317Amount[0]) != 0 ) || ( GXutil.strcmp(Z12318Unit, T01JU2_A12318Unit[0]) != 0 ) || ( Z12319KindOfStat != T01JU2_A12319KindOfStat[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12323AmountPerM, T01JU2_A12323AmountPerM[0]) != 0 ) || ( DecimalUtil.compareTo(Z12380ActualAmou, T01JU2_A12380ActualAmou[0]) != 0 ) || ( GXutil.strcmp(Z12394ProductSho, T01JU2_A12394ProductSho[0]) != 0 ) || ( DecimalUtil.compareTo(Z12420RecipeAmou, T01JU2_A12420RecipeAmou[0]) != 0 ) || ( GXutil.strcmp(Z12421RecipeUnit, T01JU2_A12421RecipeUnit[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12422CostsPerAm, T01JU2_A12422CostsPerAm[0]) != 0 ) || ( Z12424KindOfProd != T01JU2_A12424KindOfProd[0] ) || ( GXutil.strcmp(Z12575Texplus_Re, T01JU2_A12575Texplus_Re[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12315ProductCod, T01JU2_A12315ProductCod[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"ProductCod");
               GXutil.writeLogRaw("Old: ",Z12315ProductCod);
               GXutil.writeLogRaw("Current: ",T01JU2_A12315ProductCod[0]);
            }
            if ( GXutil.strcmp(Z12316ProductNam, T01JU2_A12316ProductNam[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"ProductNam");
               GXutil.writeLogRaw("Old: ",Z12316ProductNam);
               GXutil.writeLogRaw("Current: ",T01JU2_A12316ProductNam[0]);
            }
            if ( DecimalUtil.compareTo(Z12317Amount, T01JU2_A12317Amount[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"Amount");
               GXutil.writeLogRaw("Old: ",Z12317Amount);
               GXutil.writeLogRaw("Current: ",T01JU2_A12317Amount[0]);
            }
            if ( GXutil.strcmp(Z12318Unit, T01JU2_A12318Unit[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"Unit");
               GXutil.writeLogRaw("Old: ",Z12318Unit);
               GXutil.writeLogRaw("Current: ",T01JU2_A12318Unit[0]);
            }
            if ( Z12319KindOfStat != T01JU2_A12319KindOfStat[0] )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"KindOfStat");
               GXutil.writeLogRaw("Old: ",Z12319KindOfStat);
               GXutil.writeLogRaw("Current: ",T01JU2_A12319KindOfStat[0]);
            }
            if ( DecimalUtil.compareTo(Z12323AmountPerM, T01JU2_A12323AmountPerM[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"AmountPerM");
               GXutil.writeLogRaw("Old: ",Z12323AmountPerM);
               GXutil.writeLogRaw("Current: ",T01JU2_A12323AmountPerM[0]);
            }
            if ( DecimalUtil.compareTo(Z12380ActualAmou, T01JU2_A12380ActualAmou[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"ActualAmou");
               GXutil.writeLogRaw("Old: ",Z12380ActualAmou);
               GXutil.writeLogRaw("Current: ",T01JU2_A12380ActualAmou[0]);
            }
            if ( GXutil.strcmp(Z12394ProductSho, T01JU2_A12394ProductSho[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"ProductSho");
               GXutil.writeLogRaw("Old: ",Z12394ProductSho);
               GXutil.writeLogRaw("Current: ",T01JU2_A12394ProductSho[0]);
            }
            if ( DecimalUtil.compareTo(Z12420RecipeAmou, T01JU2_A12420RecipeAmou[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"RecipeAmou");
               GXutil.writeLogRaw("Old: ",Z12420RecipeAmou);
               GXutil.writeLogRaw("Current: ",T01JU2_A12420RecipeAmou[0]);
            }
            if ( GXutil.strcmp(Z12421RecipeUnit, T01JU2_A12421RecipeUnit[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"RecipeUnit");
               GXutil.writeLogRaw("Old: ",Z12421RecipeUnit);
               GXutil.writeLogRaw("Current: ",T01JU2_A12421RecipeUnit[0]);
            }
            if ( DecimalUtil.compareTo(Z12422CostsPerAm, T01JU2_A12422CostsPerAm[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"CostsPerAm");
               GXutil.writeLogRaw("Old: ",Z12422CostsPerAm);
               GXutil.writeLogRaw("Current: ",T01JU2_A12422CostsPerAm[0]);
            }
            if ( Z12424KindOfProd != T01JU2_A12424KindOfProd[0] )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"KindOfProd");
               GXutil.writeLogRaw("Old: ",Z12424KindOfProd);
               GXutil.writeLogRaw("Current: ",T01JU2_A12424KindOfProd[0]);
            }
            if ( GXutil.strcmp(Z12575Texplus_Re, T01JU2_A12575Texplus_Re[0]) != 0 )
            {
               GXutil.writeLogln("tdye002:[seudo value changed for attri]"+"Texplus_Re");
               GXutil.writeLogRaw("Old: ",Z12575Texplus_Re);
               GXutil.writeLogRaw("Current: ",T01JU2_A12575Texplus_Re[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDYE002"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JU1708( )
   {
      beforeValidate1JU1708( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JU1708( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JU1708( 0) ;
         checkOptimisticConcurrency1JU1708( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JU1708( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JU1708( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JU10 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter), Boolean.valueOf(n12315ProductCod), A12315ProductCod, Boolean.valueOf(n12316ProductNam), A12316ProductNam, Boolean.valueOf(n12317Amount), A12317Amount, Boolean.valueOf(n12318Unit), A12318Unit, Boolean.valueOf(n12319KindOfStat), Integer.valueOf(A12319KindOfStat), Boolean.valueOf(n12323AmountPerM), A12323AmountPerM, Boolean.valueOf(n12380ActualAmou), A12380ActualAmou, Boolean.valueOf(n12394ProductSho), A12394ProductSho, Boolean.valueOf(n12420RecipeAmou), A12420RecipeAmou, Boolean.valueOf(n12421RecipeUnit), A12421RecipeUnit, Boolean.valueOf(n12422CostsPerAm), A12422CostsPerAm, Boolean.valueOf(n12424KindOfProd), Short.valueOf(A12424KindOfProd), Boolean.valueOf(n12575Texplus_Re), A12575Texplus_Re, A12313Dyelot, Integer.valueOf(A12314ReDye)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE002");
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
                        resetCaption1JU0( ) ;
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
            load1JU1708( ) ;
         }
         endLevel1JU1708( ) ;
      }
      closeExtendedTableCursors1JU1708( ) ;
   }

   public void update1JU1708( )
   {
      beforeValidate1JU1708( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JU1708( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JU1708( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JU1708( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JU1708( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JU11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12315ProductCod), A12315ProductCod, Boolean.valueOf(n12316ProductNam), A12316ProductNam, Boolean.valueOf(n12317Amount), A12317Amount, Boolean.valueOf(n12318Unit), A12318Unit, Boolean.valueOf(n12319KindOfStat), Integer.valueOf(A12319KindOfStat), Boolean.valueOf(n12323AmountPerM), A12323AmountPerM, Boolean.valueOf(n12380ActualAmou), A12380ActualAmou, Boolean.valueOf(n12394ProductSho), A12394ProductSho, Boolean.valueOf(n12420RecipeAmou), A12420RecipeAmou, Boolean.valueOf(n12421RecipeUnit), A12421RecipeUnit, Boolean.valueOf(n12422CostsPerAm), A12422CostsPerAm, Boolean.valueOf(n12424KindOfProd), Short.valueOf(A12424KindOfProd), Boolean.valueOf(n12575Texplus_Re), A12575Texplus_Re, A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE002");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE002"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JU1708( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1JU0( ) ;
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
         endLevel1JU1708( ) ;
      }
      closeExtendedTableCursors1JU1708( ) ;
   }

   public void deferredUpdate1JU1708( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JU1708( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JU1708( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JU1708( ) ;
         afterConfirm1JU1708( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JU1708( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JU12 */
               pr_default.execute(10, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), Integer.valueOf(A12320Correction), Integer.valueOf(A12321CallOff), Integer.valueOf(A12322Counter)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE002");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1708 == 0 )
                     {
                        initAll1JU1708( ) ;
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
                     resetCaption1JU0( ) ;
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
      sMode1708 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JU1708( ) ;
      Gx_mode = sMode1708 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JU1708( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1JU1708( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JU1708( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdye002");
         if ( AnyError == 0 )
         {
            confirmValues1JU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye002");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JU1708( )
   {
      /* Using cursor T01JU13 */
      pr_default.execute(11);
      RcdFound1708 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1708 = (short)(1) ;
         A12313Dyelot = T01JU13_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JU13_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         A12320Correction = T01JU13_A12320Correction[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
         A12321CallOff = T01JU13_A12321CallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
         A12322Counter = T01JU13_A12322Counter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JU1708( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1708 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1708 = (short)(1) ;
         A12313Dyelot = T01JU13_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JU13_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         A12320Correction = T01JU13_A12320Correction[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
         A12321CallOff = T01JU13_A12321CallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
         A12322Counter = T01JU13_A12322Counter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
      }
   }

   public void scanEnd1JU1708( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1JU1708( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JU1708( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JU1708( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JU1708( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JU1708( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JU1708( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JU1708( )
   {
      edtDyelot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDyelot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDyelot_Enabled), 5, 0), true);
      edtReDye_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtReDye_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtReDye_Enabled), 5, 0), true);
      edtCorrection_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCorrection_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCorrection_Enabled), 5, 0), true);
      edtCallOff_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCallOff_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCallOff_Enabled), 5, 0), true);
      edtCounter_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCounter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCounter_Enabled), 5, 0), true);
      edtProductCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProductCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProductCod_Enabled), 5, 0), true);
      edtProductNam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProductNam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProductNam_Enabled), 5, 0), true);
      edtAmount_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAmount_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAmount_Enabled), 5, 0), true);
      edtUnit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUnit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUnit_Enabled), 5, 0), true);
      edtKindOfStat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKindOfStat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKindOfStat_Enabled), 5, 0), true);
      edtAmountPerM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAmountPerM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAmountPerM_Enabled), 5, 0), true);
      edtActualAmou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtActualAmou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtActualAmou_Enabled), 5, 0), true);
      edtProductSho_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProductSho_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProductSho_Enabled), 5, 0), true);
      edtRecipeAmou_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecipeAmou_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecipeAmou_Enabled), 5, 0), true);
      edtRecipeUnit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecipeUnit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecipeUnit_Enabled), 5, 0), true);
      edtCostsPerAm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostsPerAm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostsPerAm_Enabled), 5, 0), true);
      edtKindOfProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKindOfProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKindOfProd_Enabled), 5, 0), true);
      edtTexplus_Re_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTexplus_Re_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTexplus_Re_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1JU1708( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1JU0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdye002", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12313Dyelot", Z12313Dyelot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12314ReDye", GXutil.ltrim( localUtil.ntoc( Z12314ReDye, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12320Correction", GXutil.ltrim( localUtil.ntoc( Z12320Correction, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12321CallOff", GXutil.ltrim( localUtil.ntoc( Z12321CallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12322Counter", GXutil.ltrim( localUtil.ntoc( Z12322Counter, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12315ProductCod", Z12315ProductCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12316ProductNam", Z12316ProductNam);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12317Amount", GXutil.ltrim( localUtil.ntoc( Z12317Amount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12318Unit", Z12318Unit);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12319KindOfStat", GXutil.ltrim( localUtil.ntoc( Z12319KindOfStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12323AmountPerM", GXutil.ltrim( localUtil.ntoc( Z12323AmountPerM, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12380ActualAmou", GXutil.ltrim( localUtil.ntoc( Z12380ActualAmou, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12394ProductSho", Z12394ProductSho);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12420RecipeAmou", GXutil.ltrim( localUtil.ntoc( Z12420RecipeAmou, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12421RecipeUnit", Z12421RecipeUnit);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12422CostsPerAm", GXutil.ltrim( localUtil.ntoc( Z12422CostsPerAm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12424KindOfProd", GXutil.ltrim( localUtil.ntoc( Z12424KindOfProd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12575Texplus_Re", Z12575Texplus_Re);
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
      return formatLink("app.tdye002", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDYE002" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DYELOT_RECIPE", "") ;
   }

   public void initializeNonKey1JU1708( )
   {
      A12315ProductCod = "" ;
      n12315ProductCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12315ProductCod", A12315ProductCod);
      A12316ProductNam = "" ;
      n12316ProductNam = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12316ProductNam", A12316ProductNam);
      A12317Amount = DecimalUtil.ZERO ;
      n12317Amount = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrimstr( A12317Amount, 13, 5));
      A12318Unit = "" ;
      n12318Unit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12318Unit", A12318Unit);
      A12319KindOfStat = 0 ;
      n12319KindOfStat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12319KindOfStat), 5, 0));
      A12323AmountPerM = DecimalUtil.ZERO ;
      n12323AmountPerM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrimstr( A12323AmountPerM, 13, 5));
      A12380ActualAmou = DecimalUtil.ZERO ;
      n12380ActualAmou = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrimstr( A12380ActualAmou, 13, 5));
      A12394ProductSho = "" ;
      n12394ProductSho = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12394ProductSho", A12394ProductSho);
      A12420RecipeAmou = DecimalUtil.ZERO ;
      n12420RecipeAmou = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrimstr( A12420RecipeAmou, 13, 5));
      A12421RecipeUnit = "" ;
      n12421RecipeUnit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12421RecipeUnit", A12421RecipeUnit);
      A12422CostsPerAm = DecimalUtil.ZERO ;
      n12422CostsPerAm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrimstr( A12422CostsPerAm, 13, 5));
      A12424KindOfProd = (short)(0) ;
      n12424KindOfProd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12424KindOfProd), 4, 0));
      A12575Texplus_Re = "" ;
      n12575Texplus_Re = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12575Texplus_Re", A12575Texplus_Re);
      Z12315ProductCod = "" ;
      Z12316ProductNam = "" ;
      Z12317Amount = DecimalUtil.ZERO ;
      Z12318Unit = "" ;
      Z12319KindOfStat = 0 ;
      Z12323AmountPerM = DecimalUtil.ZERO ;
      Z12380ActualAmou = DecimalUtil.ZERO ;
      Z12394ProductSho = "" ;
      Z12420RecipeAmou = DecimalUtil.ZERO ;
      Z12421RecipeUnit = "" ;
      Z12422CostsPerAm = DecimalUtil.ZERO ;
      Z12424KindOfProd = (short)(0) ;
      Z12575Texplus_Re = "" ;
   }

   public void initAll1JU1708( )
   {
      A12313Dyelot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
      A12314ReDye = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
      A12320Correction = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12320Correction", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12320Correction), 5, 0));
      A12321CallOff = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12321CallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12321CallOff), 5, 0));
      A12322Counter = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12322Counter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12322Counter), 5, 0));
      initializeNonKey1JU1708( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016331627", true, true);
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
      httpContext.AddJavascriptSource("tdye002.js", "?202661016331627", false, true);
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
      edtDyelot_Internalname = "DYELOT" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtReDye_Internalname = "REDYE" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCorrection_Internalname = "CORRECTION" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCallOff_Internalname = "CALLOFF" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCounter_Internalname = "COUNTER" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtProductCod_Internalname = "PRODUCTCOD" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtProductNam_Internalname = "PRODUCTNAM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAmount_Internalname = "AMOUNT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtUnit_Internalname = "UNIT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtKindOfStat_Internalname = "KINDOFSTAT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAmountPerM_Internalname = "AMOUNTPERM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtActualAmou_Internalname = "ACTUALAMOU" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtProductSho_Internalname = "PRODUCTSHO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtRecipeAmou_Internalname = "RECIPEAMOU" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtRecipeUnit_Internalname = "RECIPEUNIT" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtCostsPerAm_Internalname = "COSTSPERAM" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtKindOfProd_Internalname = "KINDOFPROD" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtTexplus_Re_Internalname = "TEXPLUS_RE" ;
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
      Form.setCaption( httpContext.getMessage( "DYELOT_RECIPE", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTexplus_Re_Jsonclick = "" ;
      edtTexplus_Re_Backcolor = (int)(0xFFFFFF) ;
      edtTexplus_Re_Enabled = 1 ;
      edtKindOfProd_Jsonclick = "" ;
      edtKindOfProd_Backcolor = (int)(0xFFFFFF) ;
      edtKindOfProd_Enabled = 1 ;
      edtCostsPerAm_Jsonclick = "" ;
      edtCostsPerAm_Backcolor = (int)(0xFFFFFF) ;
      edtCostsPerAm_Enabled = 1 ;
      edtRecipeUnit_Jsonclick = "" ;
      edtRecipeUnit_Backcolor = (int)(0xFFFFFF) ;
      edtRecipeUnit_Enabled = 1 ;
      edtRecipeAmou_Jsonclick = "" ;
      edtRecipeAmou_Backcolor = (int)(0xFFFFFF) ;
      edtRecipeAmou_Enabled = 1 ;
      edtProductSho_Jsonclick = "" ;
      edtProductSho_Backcolor = (int)(0xFFFFFF) ;
      edtProductSho_Enabled = 1 ;
      edtActualAmou_Jsonclick = "" ;
      edtActualAmou_Backcolor = (int)(0xFFFFFF) ;
      edtActualAmou_Enabled = 1 ;
      edtAmountPerM_Jsonclick = "" ;
      edtAmountPerM_Backcolor = (int)(0xFFFFFF) ;
      edtAmountPerM_Enabled = 1 ;
      edtKindOfStat_Jsonclick = "" ;
      edtKindOfStat_Backcolor = (int)(0xFFFFFF) ;
      edtKindOfStat_Enabled = 1 ;
      edtUnit_Jsonclick = "" ;
      edtUnit_Backcolor = (int)(0xFFFFFF) ;
      edtUnit_Enabled = 1 ;
      edtAmount_Jsonclick = "" ;
      edtAmount_Backcolor = (int)(0xFFFFFF) ;
      edtAmount_Enabled = 1 ;
      edtProductNam_Jsonclick = "" ;
      edtProductNam_Backcolor = (int)(0xFFFFFF) ;
      edtProductNam_Enabled = 1 ;
      edtProductCod_Jsonclick = "" ;
      edtProductCod_Backcolor = (int)(0xFFFFFF) ;
      edtProductCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCounter_Jsonclick = "" ;
      edtCounter_Backcolor = (int)(0xFFFFFF) ;
      edtCounter_Enabled = 1 ;
      edtCallOff_Jsonclick = "" ;
      edtCallOff_Backcolor = (int)(0xFFFFFF) ;
      edtCallOff_Enabled = 1 ;
      edtCorrection_Jsonclick = "" ;
      edtCorrection_Backcolor = (int)(0xFFFFFF) ;
      edtCorrection_Enabled = 1 ;
      edtReDye_Jsonclick = "" ;
      edtReDye_Backcolor = (int)(0xFFFFFF) ;
      edtReDye_Enabled = 1 ;
      edtDyelot_Jsonclick = "" ;
      edtDyelot_Backcolor = (int)(0xFFFFFF) ;
      edtDyelot_Enabled = 1 ;
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
      /* Using cursor T01JU14 */
      pr_default.execute(12, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DYELOTS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REDYE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtProductCod_Internalname ;
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

   public void valid_Redye( )
   {
      /* Using cursor T01JU14 */
      pr_default.execute(12, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DYELOTS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "REDYE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Counter( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12315ProductCod", A12315ProductCod);
      httpContext.ajax_rsp_assign_attri("", false, "A12316ProductNam", A12316ProductNam);
      httpContext.ajax_rsp_assign_attri("", false, "A12317Amount", GXutil.ltrim( localUtil.ntoc( A12317Amount, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12318Unit", A12318Unit);
      httpContext.ajax_rsp_assign_attri("", false, "A12319KindOfStat", GXutil.ltrim( localUtil.ntoc( A12319KindOfStat, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12323AmountPerM", GXutil.ltrim( localUtil.ntoc( A12323AmountPerM, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12380ActualAmou", GXutil.ltrim( localUtil.ntoc( A12380ActualAmou, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12394ProductSho", A12394ProductSho);
      httpContext.ajax_rsp_assign_attri("", false, "A12420RecipeAmou", GXutil.ltrim( localUtil.ntoc( A12420RecipeAmou, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12421RecipeUnit", A12421RecipeUnit);
      httpContext.ajax_rsp_assign_attri("", false, "A12422CostsPerAm", GXutil.ltrim( localUtil.ntoc( A12422CostsPerAm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12424KindOfProd", GXutil.ltrim( localUtil.ntoc( A12424KindOfProd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12575Texplus_Re", A12575Texplus_Re);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12313Dyelot", Z12313Dyelot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12314ReDye", GXutil.ltrim( localUtil.ntoc( Z12314ReDye, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12320Correction", GXutil.ltrim( localUtil.ntoc( Z12320Correction, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12321CallOff", GXutil.ltrim( localUtil.ntoc( Z12321CallOff, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12322Counter", GXutil.ltrim( localUtil.ntoc( Z12322Counter, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12315ProductCod", Z12315ProductCod);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12316ProductNam", Z12316ProductNam);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12317Amount", GXutil.ltrim( localUtil.ntoc( Z12317Amount, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12318Unit", Z12318Unit);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12319KindOfStat", GXutil.ltrim( localUtil.ntoc( Z12319KindOfStat, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12323AmountPerM", GXutil.ltrim( localUtil.ntoc( Z12323AmountPerM, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12380ActualAmou", GXutil.ltrim( localUtil.ntoc( Z12380ActualAmou, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12394ProductSho", Z12394ProductSho);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12420RecipeAmou", GXutil.ltrim( localUtil.ntoc( Z12420RecipeAmou, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12421RecipeUnit", Z12421RecipeUnit);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12422CostsPerAm", GXutil.ltrim( localUtil.ntoc( Z12422CostsPerAm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12424KindOfProd", GXutil.ltrim( localUtil.ntoc( Z12424KindOfProd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12575Texplus_Re", Z12575Texplus_Re);
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
      setEventMetadata("VALID_DYELOT","{handler:'valid_Dyelot',iparms:[]");
      setEventMetadata("VALID_DYELOT",",oparms:[]}");
      setEventMetadata("VALID_REDYE","{handler:'valid_Redye',iparms:[{av:'A12313Dyelot',fld:'DYELOT',pic:''},{av:'A12314ReDye',fld:'REDYE',pic:'ZZZZ9'}]");
      setEventMetadata("VALID_REDYE",",oparms:[]}");
      setEventMetadata("VALID_CORRECTION","{handler:'valid_Correction',iparms:[]");
      setEventMetadata("VALID_CORRECTION",",oparms:[]}");
      setEventMetadata("VALID_CALLOFF","{handler:'valid_Calloff',iparms:[]");
      setEventMetadata("VALID_CALLOFF",",oparms:[]}");
      setEventMetadata("VALID_COUNTER","{handler:'valid_Counter',iparms:[{av:'A12313Dyelot',fld:'DYELOT',pic:''},{av:'A12314ReDye',fld:'REDYE',pic:'ZZZZ9'},{av:'A12320Correction',fld:'CORRECTION',pic:'ZZZZ9'},{av:'A12321CallOff',fld:'CALLOFF',pic:'ZZZZ9'},{av:'A12322Counter',fld:'COUNTER',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COUNTER",",oparms:[{av:'A12315ProductCod',fld:'PRODUCTCOD',pic:''},{av:'A12316ProductNam',fld:'PRODUCTNAM',pic:''},{av:'A12317Amount',fld:'AMOUNT',pic:'ZZZZZZ9.99999'},{av:'A12318Unit',fld:'UNIT',pic:''},{av:'A12319KindOfStat',fld:'KINDOFSTAT',pic:'ZZZZ9'},{av:'A12323AmountPerM',fld:'AMOUNTPERM',pic:'ZZZZZZ9.99999'},{av:'A12380ActualAmou',fld:'ACTUALAMOU',pic:'ZZZZZZ9.99999'},{av:'A12394ProductSho',fld:'PRODUCTSHO',pic:''},{av:'A12420RecipeAmou',fld:'RECIPEAMOU',pic:'ZZZZZZ9.99999'},{av:'A12421RecipeUnit',fld:'RECIPEUNIT',pic:''},{av:'A12422CostsPerAm',fld:'COSTSPERAM',pic:'ZZZZZZ9.99999'},{av:'A12424KindOfProd',fld:'KINDOFPROD',pic:'ZZZ9'},{av:'A12575Texplus_Re',fld:'TEXPLUS_RE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12313Dyelot'},{av:'Z12314ReDye'},{av:'Z12320Correction'},{av:'Z12321CallOff'},{av:'Z12322Counter'},{av:'Z12315ProductCod'},{av:'Z12316ProductNam'},{av:'Z12317Amount'},{av:'Z12318Unit'},{av:'Z12319KindOfStat'},{av:'Z12323AmountPerM'},{av:'Z12380ActualAmou'},{av:'Z12394ProductSho'},{av:'Z12420RecipeAmou'},{av:'Z12421RecipeUnit'},{av:'Z12422CostsPerAm'},{av:'Z12424KindOfProd'},{av:'Z12575Texplus_Re'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      Z12313Dyelot = "" ;
      Z12315ProductCod = "" ;
      Z12316ProductNam = "" ;
      Z12317Amount = DecimalUtil.ZERO ;
      Z12318Unit = "" ;
      Z12323AmountPerM = DecimalUtil.ZERO ;
      Z12380ActualAmou = DecimalUtil.ZERO ;
      Z12394ProductSho = "" ;
      Z12420RecipeAmou = DecimalUtil.ZERO ;
      Z12421RecipeUnit = "" ;
      Z12422CostsPerAm = DecimalUtil.ZERO ;
      Z12575Texplus_Re = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A12313Dyelot = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A12315ProductCod = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12316ProductNam = "" ;
      lblTextblock8_Jsonclick = "" ;
      A12317Amount = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A12318Unit = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12323AmountPerM = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A12380ActualAmou = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A12394ProductSho = "" ;
      lblTextblock14_Jsonclick = "" ;
      A12420RecipeAmou = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A12421RecipeUnit = "" ;
      lblTextblock16_Jsonclick = "" ;
      A12422CostsPerAm = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12575Texplus_Re = "" ;
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
      T01JU5_A12320Correction = new int[1] ;
      T01JU5_A12321CallOff = new int[1] ;
      T01JU5_A12322Counter = new int[1] ;
      T01JU5_A12315ProductCod = new String[] {""} ;
      T01JU5_n12315ProductCod = new boolean[] {false} ;
      T01JU5_A12316ProductNam = new String[] {""} ;
      T01JU5_n12316ProductNam = new boolean[] {false} ;
      T01JU5_A12317Amount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU5_n12317Amount = new boolean[] {false} ;
      T01JU5_A12318Unit = new String[] {""} ;
      T01JU5_n12318Unit = new boolean[] {false} ;
      T01JU5_A12319KindOfStat = new int[1] ;
      T01JU5_n12319KindOfStat = new boolean[] {false} ;
      T01JU5_A12323AmountPerM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU5_n12323AmountPerM = new boolean[] {false} ;
      T01JU5_A12380ActualAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU5_n12380ActualAmou = new boolean[] {false} ;
      T01JU5_A12394ProductSho = new String[] {""} ;
      T01JU5_n12394ProductSho = new boolean[] {false} ;
      T01JU5_A12420RecipeAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU5_n12420RecipeAmou = new boolean[] {false} ;
      T01JU5_A12421RecipeUnit = new String[] {""} ;
      T01JU5_n12421RecipeUnit = new boolean[] {false} ;
      T01JU5_A12422CostsPerAm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU5_n12422CostsPerAm = new boolean[] {false} ;
      T01JU5_A12424KindOfProd = new short[1] ;
      T01JU5_n12424KindOfProd = new boolean[] {false} ;
      T01JU5_A12575Texplus_Re = new String[] {""} ;
      T01JU5_n12575Texplus_Re = new boolean[] {false} ;
      T01JU5_A12313Dyelot = new String[] {""} ;
      T01JU5_A12314ReDye = new int[1] ;
      T01JU4_A12313Dyelot = new String[] {""} ;
      T01JU6_A12313Dyelot = new String[] {""} ;
      T01JU7_A12313Dyelot = new String[] {""} ;
      T01JU7_A12314ReDye = new int[1] ;
      T01JU7_A12320Correction = new int[1] ;
      T01JU7_A12321CallOff = new int[1] ;
      T01JU7_A12322Counter = new int[1] ;
      T01JU3_A12320Correction = new int[1] ;
      T01JU3_A12321CallOff = new int[1] ;
      T01JU3_A12322Counter = new int[1] ;
      T01JU3_A12315ProductCod = new String[] {""} ;
      T01JU3_n12315ProductCod = new boolean[] {false} ;
      T01JU3_A12316ProductNam = new String[] {""} ;
      T01JU3_n12316ProductNam = new boolean[] {false} ;
      T01JU3_A12317Amount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU3_n12317Amount = new boolean[] {false} ;
      T01JU3_A12318Unit = new String[] {""} ;
      T01JU3_n12318Unit = new boolean[] {false} ;
      T01JU3_A12319KindOfStat = new int[1] ;
      T01JU3_n12319KindOfStat = new boolean[] {false} ;
      T01JU3_A12323AmountPerM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU3_n12323AmountPerM = new boolean[] {false} ;
      T01JU3_A12380ActualAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU3_n12380ActualAmou = new boolean[] {false} ;
      T01JU3_A12394ProductSho = new String[] {""} ;
      T01JU3_n12394ProductSho = new boolean[] {false} ;
      T01JU3_A12420RecipeAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU3_n12420RecipeAmou = new boolean[] {false} ;
      T01JU3_A12421RecipeUnit = new String[] {""} ;
      T01JU3_n12421RecipeUnit = new boolean[] {false} ;
      T01JU3_A12422CostsPerAm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU3_n12422CostsPerAm = new boolean[] {false} ;
      T01JU3_A12424KindOfProd = new short[1] ;
      T01JU3_n12424KindOfProd = new boolean[] {false} ;
      T01JU3_A12575Texplus_Re = new String[] {""} ;
      T01JU3_n12575Texplus_Re = new boolean[] {false} ;
      T01JU3_A12313Dyelot = new String[] {""} ;
      T01JU3_A12314ReDye = new int[1] ;
      sMode1708 = "" ;
      T01JU8_A12313Dyelot = new String[] {""} ;
      T01JU8_A12314ReDye = new int[1] ;
      T01JU8_A12320Correction = new int[1] ;
      T01JU8_A12321CallOff = new int[1] ;
      T01JU8_A12322Counter = new int[1] ;
      T01JU9_A12313Dyelot = new String[] {""} ;
      T01JU9_A12314ReDye = new int[1] ;
      T01JU9_A12320Correction = new int[1] ;
      T01JU9_A12321CallOff = new int[1] ;
      T01JU9_A12322Counter = new int[1] ;
      T01JU2_A12320Correction = new int[1] ;
      T01JU2_A12321CallOff = new int[1] ;
      T01JU2_A12322Counter = new int[1] ;
      T01JU2_A12315ProductCod = new String[] {""} ;
      T01JU2_n12315ProductCod = new boolean[] {false} ;
      T01JU2_A12316ProductNam = new String[] {""} ;
      T01JU2_n12316ProductNam = new boolean[] {false} ;
      T01JU2_A12317Amount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU2_n12317Amount = new boolean[] {false} ;
      T01JU2_A12318Unit = new String[] {""} ;
      T01JU2_n12318Unit = new boolean[] {false} ;
      T01JU2_A12319KindOfStat = new int[1] ;
      T01JU2_n12319KindOfStat = new boolean[] {false} ;
      T01JU2_A12323AmountPerM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU2_n12323AmountPerM = new boolean[] {false} ;
      T01JU2_A12380ActualAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU2_n12380ActualAmou = new boolean[] {false} ;
      T01JU2_A12394ProductSho = new String[] {""} ;
      T01JU2_n12394ProductSho = new boolean[] {false} ;
      T01JU2_A12420RecipeAmou = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU2_n12420RecipeAmou = new boolean[] {false} ;
      T01JU2_A12421RecipeUnit = new String[] {""} ;
      T01JU2_n12421RecipeUnit = new boolean[] {false} ;
      T01JU2_A12422CostsPerAm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JU2_n12422CostsPerAm = new boolean[] {false} ;
      T01JU2_A12424KindOfProd = new short[1] ;
      T01JU2_n12424KindOfProd = new boolean[] {false} ;
      T01JU2_A12575Texplus_Re = new String[] {""} ;
      T01JU2_n12575Texplus_Re = new boolean[] {false} ;
      T01JU2_A12313Dyelot = new String[] {""} ;
      T01JU2_A12314ReDye = new int[1] ;
      T01JU13_A12313Dyelot = new String[] {""} ;
      T01JU13_A12314ReDye = new int[1] ;
      T01JU13_A12320Correction = new int[1] ;
      T01JU13_A12321CallOff = new int[1] ;
      T01JU13_A12322Counter = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01JU14_A12313Dyelot = new String[] {""} ;
      ZZ12313Dyelot = "" ;
      ZZ12315ProductCod = "" ;
      ZZ12316ProductNam = "" ;
      ZZ12317Amount = DecimalUtil.ZERO ;
      ZZ12318Unit = "" ;
      ZZ12323AmountPerM = DecimalUtil.ZERO ;
      ZZ12380ActualAmou = DecimalUtil.ZERO ;
      ZZ12394ProductSho = "" ;
      ZZ12420RecipeAmou = DecimalUtil.ZERO ;
      ZZ12421RecipeUnit = "" ;
      ZZ12422CostsPerAm = DecimalUtil.ZERO ;
      ZZ12575Texplus_Re = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdye002__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdye002__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdye002__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdye002__default(),
         new Object[] {
             new Object[] {
            T01JU2_A12320Correction, T01JU2_A12321CallOff, T01JU2_A12322Counter, T01JU2_A12315ProductCod, T01JU2_n12315ProductCod, T01JU2_A12316ProductNam, T01JU2_n12316ProductNam, T01JU2_A12317Amount, T01JU2_n12317Amount, T01JU2_A12318Unit,
            T01JU2_n12318Unit, T01JU2_A12319KindOfStat, T01JU2_n12319KindOfStat, T01JU2_A12323AmountPerM, T01JU2_n12323AmountPerM, T01JU2_A12380ActualAmou, T01JU2_n12380ActualAmou, T01JU2_A12394ProductSho, T01JU2_n12394ProductSho, T01JU2_A12420RecipeAmou,
            T01JU2_n12420RecipeAmou, T01JU2_A12421RecipeUnit, T01JU2_n12421RecipeUnit, T01JU2_A12422CostsPerAm, T01JU2_n12422CostsPerAm, T01JU2_A12424KindOfProd, T01JU2_n12424KindOfProd, T01JU2_A12575Texplus_Re, T01JU2_n12575Texplus_Re, T01JU2_A12313Dyelot,
            T01JU2_A12314ReDye
            }
            , new Object[] {
            T01JU3_A12320Correction, T01JU3_A12321CallOff, T01JU3_A12322Counter, T01JU3_A12315ProductCod, T01JU3_n12315ProductCod, T01JU3_A12316ProductNam, T01JU3_n12316ProductNam, T01JU3_A12317Amount, T01JU3_n12317Amount, T01JU3_A12318Unit,
            T01JU3_n12318Unit, T01JU3_A12319KindOfStat, T01JU3_n12319KindOfStat, T01JU3_A12323AmountPerM, T01JU3_n12323AmountPerM, T01JU3_A12380ActualAmou, T01JU3_n12380ActualAmou, T01JU3_A12394ProductSho, T01JU3_n12394ProductSho, T01JU3_A12420RecipeAmou,
            T01JU3_n12420RecipeAmou, T01JU3_A12421RecipeUnit, T01JU3_n12421RecipeUnit, T01JU3_A12422CostsPerAm, T01JU3_n12422CostsPerAm, T01JU3_A12424KindOfProd, T01JU3_n12424KindOfProd, T01JU3_A12575Texplus_Re, T01JU3_n12575Texplus_Re, T01JU3_A12313Dyelot,
            T01JU3_A12314ReDye
            }
            , new Object[] {
            T01JU4_A12313Dyelot
            }
            , new Object[] {
            T01JU5_A12320Correction, T01JU5_A12321CallOff, T01JU5_A12322Counter, T01JU5_A12315ProductCod, T01JU5_n12315ProductCod, T01JU5_A12316ProductNam, T01JU5_n12316ProductNam, T01JU5_A12317Amount, T01JU5_n12317Amount, T01JU5_A12318Unit,
            T01JU5_n12318Unit, T01JU5_A12319KindOfStat, T01JU5_n12319KindOfStat, T01JU5_A12323AmountPerM, T01JU5_n12323AmountPerM, T01JU5_A12380ActualAmou, T01JU5_n12380ActualAmou, T01JU5_A12394ProductSho, T01JU5_n12394ProductSho, T01JU5_A12420RecipeAmou,
            T01JU5_n12420RecipeAmou, T01JU5_A12421RecipeUnit, T01JU5_n12421RecipeUnit, T01JU5_A12422CostsPerAm, T01JU5_n12422CostsPerAm, T01JU5_A12424KindOfProd, T01JU5_n12424KindOfProd, T01JU5_A12575Texplus_Re, T01JU5_n12575Texplus_Re, T01JU5_A12313Dyelot,
            T01JU5_A12314ReDye
            }
            , new Object[] {
            T01JU6_A12313Dyelot
            }
            , new Object[] {
            T01JU7_A12313Dyelot, T01JU7_A12314ReDye, T01JU7_A12320Correction, T01JU7_A12321CallOff, T01JU7_A12322Counter
            }
            , new Object[] {
            T01JU8_A12313Dyelot, T01JU8_A12314ReDye, T01JU8_A12320Correction, T01JU8_A12321CallOff, T01JU8_A12322Counter
            }
            , new Object[] {
            T01JU9_A12313Dyelot, T01JU9_A12314ReDye, T01JU9_A12320Correction, T01JU9_A12321CallOff, T01JU9_A12322Counter
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JU13_A12313Dyelot, T01JU13_A12314ReDye, T01JU13_A12320Correction, T01JU13_A12321CallOff, T01JU13_A12322Counter
            }
            , new Object[] {
            T01JU14_A12313Dyelot
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z12424KindOfProd ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12424KindOfProd ;
   private short RcdFound1708 ;
   private short nIsDirty_1708 ;
   private short ZZ12424KindOfProd ;
   private int Z12314ReDye ;
   private int Z12320Correction ;
   private int Z12321CallOff ;
   private int Z12322Counter ;
   private int Z12319KindOfStat ;
   private int A12314ReDye ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDyelot_Enabled ;
   private int edtReDye_Enabled ;
   private int A12320Correction ;
   private int edtCorrection_Enabled ;
   private int A12321CallOff ;
   private int edtCallOff_Enabled ;
   private int A12322Counter ;
   private int edtCounter_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtProductCod_Enabled ;
   private int edtProductNam_Enabled ;
   private int edtAmount_Enabled ;
   private int edtUnit_Enabled ;
   private int A12319KindOfStat ;
   private int edtKindOfStat_Enabled ;
   private int edtAmountPerM_Enabled ;
   private int edtActualAmou_Enabled ;
   private int edtProductSho_Enabled ;
   private int edtRecipeAmou_Enabled ;
   private int edtRecipeUnit_Enabled ;
   private int edtCostsPerAm_Enabled ;
   private int edtKindOfProd_Enabled ;
   private int edtTexplus_Re_Enabled ;
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
   private int edtTexplus_Re_Backcolor ;
   private int edtKindOfProd_Backcolor ;
   private int edtCostsPerAm_Backcolor ;
   private int edtRecipeUnit_Backcolor ;
   private int edtRecipeAmou_Backcolor ;
   private int edtProductSho_Backcolor ;
   private int edtActualAmou_Backcolor ;
   private int edtAmountPerM_Backcolor ;
   private int edtKindOfStat_Backcolor ;
   private int edtUnit_Backcolor ;
   private int edtAmount_Backcolor ;
   private int edtProductNam_Backcolor ;
   private int edtProductCod_Backcolor ;
   private int edtCounter_Backcolor ;
   private int edtCallOff_Backcolor ;
   private int edtCorrection_Backcolor ;
   private int edtReDye_Backcolor ;
   private int edtDyelot_Backcolor ;
   private int ZZ12314ReDye ;
   private int ZZ12320Correction ;
   private int ZZ12321CallOff ;
   private int ZZ12322Counter ;
   private int ZZ12319KindOfStat ;
   private java.math.BigDecimal Z12317Amount ;
   private java.math.BigDecimal Z12323AmountPerM ;
   private java.math.BigDecimal Z12380ActualAmou ;
   private java.math.BigDecimal Z12420RecipeAmou ;
   private java.math.BigDecimal Z12422CostsPerAm ;
   private java.math.BigDecimal A12317Amount ;
   private java.math.BigDecimal A12323AmountPerM ;
   private java.math.BigDecimal A12380ActualAmou ;
   private java.math.BigDecimal A12420RecipeAmou ;
   private java.math.BigDecimal A12422CostsPerAm ;
   private java.math.BigDecimal ZZ12317Amount ;
   private java.math.BigDecimal ZZ12323AmountPerM ;
   private java.math.BigDecimal ZZ12380ActualAmou ;
   private java.math.BigDecimal ZZ12420RecipeAmou ;
   private java.math.BigDecimal ZZ12422CostsPerAm ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDyelot_Internalname ;
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
   private String edtDyelot_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtReDye_Internalname ;
   private String edtReDye_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCorrection_Internalname ;
   private String edtCorrection_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCallOff_Internalname ;
   private String edtCallOff_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCounter_Internalname ;
   private String edtCounter_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtProductCod_Internalname ;
   private String edtProductCod_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtProductNam_Internalname ;
   private String edtProductNam_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAmount_Internalname ;
   private String edtAmount_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtUnit_Internalname ;
   private String edtUnit_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtKindOfStat_Internalname ;
   private String edtKindOfStat_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAmountPerM_Internalname ;
   private String edtAmountPerM_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtActualAmou_Internalname ;
   private String edtActualAmou_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtProductSho_Internalname ;
   private String edtProductSho_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtRecipeAmou_Internalname ;
   private String edtRecipeAmou_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtRecipeUnit_Internalname ;
   private String edtRecipeUnit_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtCostsPerAm_Internalname ;
   private String edtCostsPerAm_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtKindOfProd_Internalname ;
   private String edtKindOfProd_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtTexplus_Re_Internalname ;
   private String edtTexplus_Re_Jsonclick ;
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
   private String sMode1708 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12315ProductCod ;
   private boolean n12316ProductNam ;
   private boolean n12317Amount ;
   private boolean n12318Unit ;
   private boolean n12319KindOfStat ;
   private boolean n12323AmountPerM ;
   private boolean n12380ActualAmou ;
   private boolean n12394ProductSho ;
   private boolean n12420RecipeAmou ;
   private boolean n12421RecipeUnit ;
   private boolean n12422CostsPerAm ;
   private boolean n12424KindOfProd ;
   private boolean n12575Texplus_Re ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z12313Dyelot ;
   private String Z12315ProductCod ;
   private String Z12316ProductNam ;
   private String Z12318Unit ;
   private String Z12394ProductSho ;
   private String Z12421RecipeUnit ;
   private String Z12575Texplus_Re ;
   private String A12313Dyelot ;
   private String A12315ProductCod ;
   private String A12316ProductNam ;
   private String A12318Unit ;
   private String A12394ProductSho ;
   private String A12421RecipeUnit ;
   private String A12575Texplus_Re ;
   private String ZZ12313Dyelot ;
   private String ZZ12315ProductCod ;
   private String ZZ12316ProductNam ;
   private String ZZ12318Unit ;
   private String ZZ12394ProductSho ;
   private String ZZ12421RecipeUnit ;
   private String ZZ12575Texplus_Re ;
   private IDataStoreProvider pr_default ;
   private int[] T01JU5_A12320Correction ;
   private int[] T01JU5_A12321CallOff ;
   private int[] T01JU5_A12322Counter ;
   private String[] T01JU5_A12315ProductCod ;
   private boolean[] T01JU5_n12315ProductCod ;
   private String[] T01JU5_A12316ProductNam ;
   private boolean[] T01JU5_n12316ProductNam ;
   private java.math.BigDecimal[] T01JU5_A12317Amount ;
   private boolean[] T01JU5_n12317Amount ;
   private String[] T01JU5_A12318Unit ;
   private boolean[] T01JU5_n12318Unit ;
   private int[] T01JU5_A12319KindOfStat ;
   private boolean[] T01JU5_n12319KindOfStat ;
   private java.math.BigDecimal[] T01JU5_A12323AmountPerM ;
   private boolean[] T01JU5_n12323AmountPerM ;
   private java.math.BigDecimal[] T01JU5_A12380ActualAmou ;
   private boolean[] T01JU5_n12380ActualAmou ;
   private String[] T01JU5_A12394ProductSho ;
   private boolean[] T01JU5_n12394ProductSho ;
   private java.math.BigDecimal[] T01JU5_A12420RecipeAmou ;
   private boolean[] T01JU5_n12420RecipeAmou ;
   private String[] T01JU5_A12421RecipeUnit ;
   private boolean[] T01JU5_n12421RecipeUnit ;
   private java.math.BigDecimal[] T01JU5_A12422CostsPerAm ;
   private boolean[] T01JU5_n12422CostsPerAm ;
   private short[] T01JU5_A12424KindOfProd ;
   private boolean[] T01JU5_n12424KindOfProd ;
   private String[] T01JU5_A12575Texplus_Re ;
   private boolean[] T01JU5_n12575Texplus_Re ;
   private String[] T01JU5_A12313Dyelot ;
   private int[] T01JU5_A12314ReDye ;
   private String[] T01JU4_A12313Dyelot ;
   private String[] T01JU6_A12313Dyelot ;
   private String[] T01JU7_A12313Dyelot ;
   private int[] T01JU7_A12314ReDye ;
   private int[] T01JU7_A12320Correction ;
   private int[] T01JU7_A12321CallOff ;
   private int[] T01JU7_A12322Counter ;
   private int[] T01JU3_A12320Correction ;
   private int[] T01JU3_A12321CallOff ;
   private int[] T01JU3_A12322Counter ;
   private String[] T01JU3_A12315ProductCod ;
   private boolean[] T01JU3_n12315ProductCod ;
   private String[] T01JU3_A12316ProductNam ;
   private boolean[] T01JU3_n12316ProductNam ;
   private java.math.BigDecimal[] T01JU3_A12317Amount ;
   private boolean[] T01JU3_n12317Amount ;
   private String[] T01JU3_A12318Unit ;
   private boolean[] T01JU3_n12318Unit ;
   private int[] T01JU3_A12319KindOfStat ;
   private boolean[] T01JU3_n12319KindOfStat ;
   private java.math.BigDecimal[] T01JU3_A12323AmountPerM ;
   private boolean[] T01JU3_n12323AmountPerM ;
   private java.math.BigDecimal[] T01JU3_A12380ActualAmou ;
   private boolean[] T01JU3_n12380ActualAmou ;
   private String[] T01JU3_A12394ProductSho ;
   private boolean[] T01JU3_n12394ProductSho ;
   private java.math.BigDecimal[] T01JU3_A12420RecipeAmou ;
   private boolean[] T01JU3_n12420RecipeAmou ;
   private String[] T01JU3_A12421RecipeUnit ;
   private boolean[] T01JU3_n12421RecipeUnit ;
   private java.math.BigDecimal[] T01JU3_A12422CostsPerAm ;
   private boolean[] T01JU3_n12422CostsPerAm ;
   private short[] T01JU3_A12424KindOfProd ;
   private boolean[] T01JU3_n12424KindOfProd ;
   private String[] T01JU3_A12575Texplus_Re ;
   private boolean[] T01JU3_n12575Texplus_Re ;
   private String[] T01JU3_A12313Dyelot ;
   private int[] T01JU3_A12314ReDye ;
   private String[] T01JU8_A12313Dyelot ;
   private int[] T01JU8_A12314ReDye ;
   private int[] T01JU8_A12320Correction ;
   private int[] T01JU8_A12321CallOff ;
   private int[] T01JU8_A12322Counter ;
   private String[] T01JU9_A12313Dyelot ;
   private int[] T01JU9_A12314ReDye ;
   private int[] T01JU9_A12320Correction ;
   private int[] T01JU9_A12321CallOff ;
   private int[] T01JU9_A12322Counter ;
   private int[] T01JU2_A12320Correction ;
   private int[] T01JU2_A12321CallOff ;
   private int[] T01JU2_A12322Counter ;
   private String[] T01JU2_A12315ProductCod ;
   private boolean[] T01JU2_n12315ProductCod ;
   private String[] T01JU2_A12316ProductNam ;
   private boolean[] T01JU2_n12316ProductNam ;
   private java.math.BigDecimal[] T01JU2_A12317Amount ;
   private boolean[] T01JU2_n12317Amount ;
   private String[] T01JU2_A12318Unit ;
   private boolean[] T01JU2_n12318Unit ;
   private int[] T01JU2_A12319KindOfStat ;
   private boolean[] T01JU2_n12319KindOfStat ;
   private java.math.BigDecimal[] T01JU2_A12323AmountPerM ;
   private boolean[] T01JU2_n12323AmountPerM ;
   private java.math.BigDecimal[] T01JU2_A12380ActualAmou ;
   private boolean[] T01JU2_n12380ActualAmou ;
   private String[] T01JU2_A12394ProductSho ;
   private boolean[] T01JU2_n12394ProductSho ;
   private java.math.BigDecimal[] T01JU2_A12420RecipeAmou ;
   private boolean[] T01JU2_n12420RecipeAmou ;
   private String[] T01JU2_A12421RecipeUnit ;
   private boolean[] T01JU2_n12421RecipeUnit ;
   private java.math.BigDecimal[] T01JU2_A12422CostsPerAm ;
   private boolean[] T01JU2_n12422CostsPerAm ;
   private short[] T01JU2_A12424KindOfProd ;
   private boolean[] T01JU2_n12424KindOfProd ;
   private String[] T01JU2_A12575Texplus_Re ;
   private boolean[] T01JU2_n12575Texplus_Re ;
   private String[] T01JU2_A12313Dyelot ;
   private int[] T01JU2_A12314ReDye ;
   private String[] T01JU13_A12313Dyelot ;
   private int[] T01JU13_A12314ReDye ;
   private int[] T01JU13_A12320Correction ;
   private int[] T01JU13_A12321CallOff ;
   private int[] T01JU13_A12322Counter ;
   private String[] T01JU14_A12313Dyelot ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdye002__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye002__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye002__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JU2", "SELECT Correction, CallOff, Counter, ProductCod, ProductNam, Amount, Unit, KindOfStat, AmountPerM, ActualAmou, ProductSho, RecipeAmou, RecipeUnit, CostsPerAm, KindOfProd, Texplus_Re, Dyelot, ReDye FROM TXPDYE002 WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ?  FOR UPDATE OF ProductCod, ProductNam, Amount, Unit, KindOfStat, AmountPerM, ActualAmou, ProductSho, RecipeAmou, RecipeUnit, CostsPerAm, KindOfProd, Texplus_Re NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU3", "SELECT Correction, CallOff, Counter, ProductCod, ProductNam, Amount, Unit, KindOfStat, AmountPerM, ActualAmou, ProductSho, RecipeAmou, RecipeUnit, CostsPerAm, KindOfProd, Texplus_Re, Dyelot, ReDye FROM TXPDYE002 WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU4", "SELECT Dyelot FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Correction, TM1.CallOff, TM1.Counter, TM1.ProductCod, TM1.ProductNam, TM1.Amount, TM1.Unit, TM1.KindOfStat, TM1.AmountPerM, TM1.ActualAmou, TM1.ProductSho, TM1.RecipeAmou, TM1.RecipeUnit, TM1.CostsPerAm, TM1.KindOfProd, TM1.Texplus_Re, TM1.Dyelot, TM1.ReDye FROM TXPDYE002 TM1 WHERE TM1.Dyelot = ? and TM1.ReDye = ? and TM1.Correction = ? and TM1.CallOff = ? and TM1.Counter = ? ORDER BY TM1.Dyelot, TM1.ReDye, TM1.Correction, TM1.CallOff, TM1.Counter ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU6", "SELECT Dyelot FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU7", "SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye, Correction, CallOff, Counter FROM TXPDYE002 WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye, Correction, CallOff, Counter FROM TXPDYE002 WHERE ( Dyelot > ? or Dyelot = ? and ReDye > ? or ReDye = ? and Dyelot = ? and Correction > ? or Correction = ? and ReDye = ? and Dyelot = ? and CallOff > ? or CallOff = ? and Correction = ? and ReDye = ? and Dyelot = ? and Counter > ?) ORDER BY Dyelot, ReDye, Correction, CallOff, Counter) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JU9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye, Correction, CallOff, Counter FROM TXPDYE002 WHERE ( Dyelot < ? or Dyelot = ? and ReDye < ? or ReDye = ? and Dyelot = ? and Correction < ? or Correction = ? and ReDye = ? and Dyelot = ? and CallOff < ? or CallOff = ? and Correction = ? and ReDye = ? and Dyelot = ? and Counter < ?) ORDER BY Dyelot DESC, ReDye DESC, Correction DESC, CallOff DESC, Counter DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JU10", "INSERT INTO TXPDYE002(Correction, CallOff, Counter, ProductCod, ProductNam, Amount, Unit, KindOfStat, AmountPerM, ActualAmou, ProductSho, RecipeAmou, RecipeUnit, CostsPerAm, KindOfProd, Texplus_Re, Dyelot, ReDye) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDYE002")
         ,new UpdateCursor("T01JU11", "UPDATE TXPDYE002 SET ProductCod=?, ProductNam=?, Amount=?, Unit=?, KindOfStat=?, AmountPerM=?, ActualAmou=?, ProductSho=?, RecipeAmou=?, RecipeUnit=?, CostsPerAm=?, KindOfProd=?, Texplus_Re=?  WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ?", GX_NOMASK, "TXPDYE002")
         ,new UpdateCursor("T01JU12", "DELETE FROM TXPDYE002  WHERE Dyelot = ? AND ReDye = ? AND Correction = ? AND CallOff = ? AND Counter = ?", GX_NOMASK, "TXPDYE002")
         ,new ForEachCursor("T01JU13", "SELECT /*+ FIRST_ROWS(100) */ Dyelot, ReDye, Correction, CallOff, Counter FROM TXPDYE002 ORDER BY Dyelot, ReDye, Correction, CallOff, Counter ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JU14", "SELECT Dyelot FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((int[]) buf[30])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((int[]) buf[30])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17);
               ((int[]) buf[30])[0] = rslt.getInt(18);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setVarchar(14, (String)parms[13], 20, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setVarchar(14, (String)parms[13], 20, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 50);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 40);
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
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 5);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 25);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 5);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 20);
               }
               stmt.setVarchar(17, (String)parms[29], 20, false);
               stmt.setInt(18, ((Number) parms[30]).intValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 40);
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
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 25);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 5);
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
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 20);
               }
               stmt.setVarchar(14, (String)parms[26], 20, false);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setInt(16, ((Number) parms[28]).intValue());
               stmt.setInt(17, ((Number) parms[29]).intValue());
               stmt.setInt(18, ((Number) parms[30]).intValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

