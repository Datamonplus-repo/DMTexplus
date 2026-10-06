package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdye001_impl extends GXDataArea
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
         A12324RecipeNo = httpContext.GetPar( "RecipeNo") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A12324RecipeNo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DYELOTS", ""), (short)(0)) ;
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

   public tdye001_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdye001_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdye001_impl.class ));
   }

   public tdye001_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDYE001.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Dyelot", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDyelot_Internalname, A12313Dyelot, GXutil.rtrim( localUtil.format( A12313Dyelot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDyelot_Jsonclick, 0, "", "", "", "", "", 1, edtDyelot_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Re Dye", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtReDye_Internalname, GXutil.ltrim( localUtil.ntoc( A12314ReDye, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtReDye_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12314ReDye), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12314ReDye), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtReDye_Jsonclick, 0, "", "", "", "", "", 1, edtReDye_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Machine", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMachine_Internalname, A12309Machine, GXutil.rtrim( localUtil.format( A12309Machine, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMachine_Jsonclick, 0, "", "", "", "", "", 1, edtMachine_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Weight", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtWeight_Internalname, GXutil.ltrim( localUtil.ntoc( A12310Weight, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtWeight_Enabled!=0) ? localUtil.format( A12310Weight, "ZZZZZZ9.99") : localUtil.format( A12310Weight, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtWeight_Jsonclick, 0, "", "", "", "", "", 1, edtWeight_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Set Time", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSetTime_Internalname, GXutil.ltrim( localUtil.ntoc( A12311SetTime, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSetTime_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12311SetTime), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12311SetTime), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSetTime_Jsonclick, 0, "", "", "", "", "", 1, edtSetTime_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Import State", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtImportStat_Internalname, GXutil.ltrim( localUtil.ntoc( A12312ImportStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtImportStat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12312ImportStat), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12312ImportStat), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtImportStat_Jsonclick, 0, "", "", "", "", "", 1, edtImportStat_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Recipe No", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecipeNo_Internalname, A12324RecipeNo, GXutil.rtrim( localUtil.format( A12324RecipeNo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecipeNo_Jsonclick, 0, "", "", "", "", "", 1, edtRecipeNo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Recipe State", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecipeStat_Internalname, GXutil.ltrim( localUtil.ntoc( A12331RecipeStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecipeStat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12331RecipeStat), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12331RecipeStat), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecipeStat_Jsonclick, 0, "", "", "", "", "", 1, edtRecipeStat_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Program Creation Type", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProgramCre_Internalname, GXutil.ltrim( localUtil.ntoc( A12332ProgramCre, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProgramCre_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12332ProgramCre), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12332ProgramCre), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProgramCre_Jsonclick, 0, "", "", "", "", "", 1, edtProgramCre_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Liquor Ratio", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLiquorRati_Internalname, GXutil.ltrim( localUtil.ntoc( A12333LiquorRati, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLiquorRati_Enabled!=0) ? localUtil.format( A12333LiquorRati, "ZZZZZZ9.99") : localUtil.format( A12333LiquorRati, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLiquorRati_Jsonclick, 0, "", "", "", "", "", 1, edtLiquorRati_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColor_Internalname, GXutil.ltrim( localUtil.ntoc( A12336Color, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12336Color), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12336Color), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColor_Jsonclick, 0, "", "", "", "", "", 1, edtColor_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Customer", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCustomer_Internalname, A12347Customer, GXutil.rtrim( localUtil.format( A12347Customer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCustomer_Jsonclick, 0, "", "", "", "", "", 1, edtCustomer_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Article", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArticle_Internalname, A12348Article, GXutil.rtrim( localUtil.format( A12348Article, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArticle_Jsonclick, 0, "", "", "", "", "", 1, edtArticle_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Colour No", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColourNo_Internalname, A12349ColourNo, GXutil.rtrim( localUtil.format( A12349ColourNo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColourNo_Jsonclick, 0, "", "", "", "", "", 1, edtColourNo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Colour Descript", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColourDesc_Internalname, A12350ColourDesc, GXutil.rtrim( localUtil.format( A12350ColourDesc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColourDesc_Jsonclick, 0, "", "", "", "", "", 1, edtColourDesc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Length", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLength_Internalname, GXutil.ltrim( localUtil.ntoc( A12351Length, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLength_Enabled!=0) ? localUtil.format( A12351Length, "ZZZZZZ9.99") : localUtil.format( A12351Length, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLength_Jsonclick, 0, "", "", "", "", "", 1, edtLength_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "State", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtState_Internalname, GXutil.ltrim( localUtil.ntoc( A12381State, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtState_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12381State), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12381State), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtState_Jsonclick, 0, "", "", "", "", "", 1, edtState_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Start Time", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtStartTime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtStartTime_Internalname, localUtil.ttoc( A12395StartTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12395StartTime, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtStartTime_Jsonclick, 0, "", "", "", "", "", 1, edtStartTime_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtStartTime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtStartTime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDYE001.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "End Time", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEndTime_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEndTime_Internalname, localUtil.ttoc( A12396EndTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12396EndTime, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEndTime_Jsonclick, 0, "", "", "", "", "", 1, edtEndTime_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEndTime_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEndTime_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDYE001.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "TypeOfProcedureNo", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTypeOfProc_Internalname, GXutil.ltrim( localUtil.ntoc( A12405TypeOfProc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTypeOfProc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12405TypeOfProc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12405TypeOfProc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTypeOfProc_Jsonclick, 0, "", "", "", "", "", 1, edtTypeOfProc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Procedure No", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcedureN_Internalname, GXutil.ltrim( localUtil.ntoc( A12406ProcedureN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProcedureN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12406ProcedureN), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12406ProcedureN), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcedureN_Jsonclick, 0, "", "", "", "", "", 1, edtProcedureN_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Process Type1", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcessTp1_Internalname, GXutil.ltrim( localUtil.ntoc( A12408ProcessTp1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProcessTp1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12408ProcessTp1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12408ProcessTp1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcessTp1_Jsonclick, 0, "", "", "", "", "", 1, edtProcessTp1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "ProcessType2", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcessTp2_Internalname, GXutil.ltrim( localUtil.ntoc( A12409ProcessTp2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProcessTp2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12409ProcessTp2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12409ProcessTp2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcessTp2_Jsonclick, 0, "", "", "", "", "", 1, edtProcessTp2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Parameter5", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet5_Internalname, GXutil.ltrim( localUtil.ntoc( A12538Paramet5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12538Paramet5), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12538Paramet5), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet5_Jsonclick, 0, "", "", "", "", "", 1, edtParamet5_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Parameter6", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet6_Internalname, GXutil.ltrim( localUtil.ntoc( A12539Paramet6, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet6_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12539Paramet6), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12539Paramet6), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet6_Jsonclick, 0, "", "", "", "", "", 1, edtParamet6_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Parameter7", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet7_Internalname, GXutil.ltrim( localUtil.ntoc( A12410Paramet7, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet7_Enabled!=0) ? localUtil.format( A12410Paramet7, "ZZZZZZ9.99") : localUtil.format( A12410Paramet7, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet7_Jsonclick, 0, "", "", "", "", "", 1, edtParamet7_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Parameter8", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet8_Internalname, GXutil.ltrim( localUtil.ntoc( A12532Paramet8, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet8_Enabled!=0) ? localUtil.format( A12532Paramet8, "ZZZZZZ9.99") : localUtil.format( A12532Paramet8, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet8_Jsonclick, 0, "", "", "", "", "", 1, edtParamet8_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Parameter9", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet9_Internalname, GXutil.ltrim( localUtil.ntoc( A12533Paramet9, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet9_Enabled!=0) ? localUtil.format( A12533Paramet9, "ZZZZZZ9.99") : localUtil.format( A12533Paramet9, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet9_Jsonclick, 0, "", "", "", "", "", 1, edtParamet9_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Parameter10", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet10_Internalname, GXutil.ltrim( localUtil.ntoc( A12425Paramet10, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet10_Enabled!=0) ? localUtil.format( A12425Paramet10, "ZZZZZZ9.99") : localUtil.format( A12425Paramet10, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet10_Jsonclick, 0, "", "", "", "", "", 1, edtParamet10_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Parameter11", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet11_Internalname, GXutil.ltrim( localUtil.ntoc( A12334Paramet11, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet11_Enabled!=0) ? localUtil.format( A12334Paramet11, "ZZZZZZ9.99") : localUtil.format( A12334Paramet11, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet11_Jsonclick, 0, "", "", "", "", "", 1, edtParamet11_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Parameter12", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet12_Internalname, GXutil.ltrim( localUtil.ntoc( A12411Paramet12, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet12_Enabled!=0) ? localUtil.format( A12411Paramet12, "ZZZZZZ9.99") : localUtil.format( A12411Paramet12, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet12_Jsonclick, 0, "", "", "", "", "", 1, edtParamet12_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Parameter13", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet13_Internalname, GXutil.ltrim( localUtil.ntoc( A12412Paramet13, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet13_Enabled!=0) ? localUtil.format( A12412Paramet13, "ZZZZZZ9.99") : localUtil.format( A12412Paramet13, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet13_Jsonclick, 0, "", "", "", "", "", 1, edtParamet13_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Parameter14", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet14_Internalname, GXutil.ltrim( localUtil.ntoc( A12413Paramet14, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet14_Enabled!=0) ? localUtil.format( A12413Paramet14, "ZZZZZZ9.99") : localUtil.format( A12413Paramet14, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet14_Jsonclick, 0, "", "", "", "", "", 1, edtParamet14_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Parameter15", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet15_Internalname, GXutil.ltrim( localUtil.ntoc( A12414Paramet15, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet15_Enabled!=0) ? localUtil.format( A12414Paramet15, "ZZZZZZ9.99") : localUtil.format( A12414Paramet15, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet15_Jsonclick, 0, "", "", "", "", "", 1, edtParamet15_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Parameter16", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet16_Internalname, GXutil.ltrim( localUtil.ntoc( A12527Paramet16, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet16_Enabled!=0) ? localUtil.format( A12527Paramet16, "ZZZZZZ9.99") : localUtil.format( A12527Paramet16, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet16_Jsonclick, 0, "", "", "", "", "", 1, edtParamet16_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Parameter12", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet17_Internalname, GXutil.ltrim( localUtil.ntoc( A12335Paramet17, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet17_Enabled!=0) ? localUtil.format( A12335Paramet17, "ZZZZZZ9.99") : localUtil.format( A12335Paramet17, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet17_Jsonclick, 0, "", "", "", "", "", 1, edtParamet17_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Parameter18", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet18_Internalname, GXutil.ltrim( localUtil.ntoc( A12415Paramet18, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet18_Enabled!=0) ? localUtil.format( A12415Paramet18, "ZZZZZZ9.99") : localUtil.format( A12415Paramet18, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet18_Jsonclick, 0, "", "", "", "", "", 1, edtParamet18_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Parameter19", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet19_Internalname, GXutil.ltrim( localUtil.ntoc( A12528Paramet19, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet19_Enabled!=0) ? localUtil.format( A12528Paramet19, "ZZZZZZ9.99") : localUtil.format( A12528Paramet19, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet19_Jsonclick, 0, "", "", "", "", "", 1, edtParamet19_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Parameter20", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParamet20_Internalname, GXutil.ltrim( localUtil.ntoc( A12416Paramet20, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParamet20_Enabled!=0) ? localUtil.format( A12416Paramet20, "ZZZZZZ9.99") : localUtil.format( A12416Paramet20, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParamet20_Jsonclick, 0, "", "", "", "", "", 1, edtParamet20_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Order No", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOrderNo_Internalname, A12417OrderNo, GXutil.rtrim( localUtil.format( A12417OrderNo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOrderNo_Jsonclick, 0, "", "", "", "", "", 1, edtOrderNo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Liquor Quantity", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLiquorQuan_Internalname, GXutil.ltrim( localUtil.ntoc( A12418LiquorQuan, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLiquorQuan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12418LiquorQuan), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12418LiquorQuan), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLiquorQuan_Jsonclick, 0, "", "", "", "", "", 1, edtLiquorQuan_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Text10", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtText10_Internalname, A12419Text10, GXutil.rtrim( localUtil.format( A12419Text10, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtText10_Jsonclick, 0, "", "", "", "", "", 1, edtText10_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Text11", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtText11_Internalname, A12423Text11, GXutil.rtrim( localUtil.format( A12423Text11, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtText11_Jsonclick, 0, "", "", "", "", "", 1, edtText11_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Text12", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtText12_Internalname, A12529Text12, GXutil.rtrim( localUtil.format( A12529Text12, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtText12_Jsonclick, 0, "", "", "", "", "", 1, edtText12_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Text13", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtText13_Internalname, A12530Text13, GXutil.rtrim( localUtil.format( A12530Text13, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtText13_Jsonclick, 0, "", "", "", "", "", 1, edtText13_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Text14", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtText14_Internalname, A12531Text14, GXutil.rtrim( localUtil.format( A12531Text14, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtText14_Jsonclick, 0, "", "", "", "", "", 1, edtText14_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Note1", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNote1_Internalname, A12426Note1, GXutil.rtrim( localUtil.format( A12426Note1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNote1_Jsonclick, 0, "", "", "", "", "", 1, edtNote1_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Required By", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYE001.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRequiredBy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRequiredBy_Internalname, localUtil.ttoc( A12537RequiredBy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12537RequiredBy, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRequiredBy_Jsonclick, 0, "", "", "", "", "", 1, edtRequiredBy_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYE001.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRequiredBy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRequiredBy_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDYE001.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 260,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 262,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYE001.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 263,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDYE001.htm");
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
      e111JT2 ();
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
            Z12309Machine = httpContext.cgiGet( "Z12309Machine") ;
            Z12310Weight = localUtil.ctond( httpContext.cgiGet( "Z12310Weight")) ;
            Z12311SetTime = (short)(localUtil.ctol( httpContext.cgiGet( "Z12311SetTime"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12312ImportStat = (int)(localUtil.ctol( httpContext.cgiGet( "Z12312ImportStat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12331RecipeStat = (int)(localUtil.ctol( httpContext.cgiGet( "Z12331RecipeStat"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12332ProgramCre = (int)(localUtil.ctol( httpContext.cgiGet( "Z12332ProgramCre"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12333LiquorRati = localUtil.ctond( httpContext.cgiGet( "Z12333LiquorRati")) ;
            Z12336Color = localUtil.ctol( httpContext.cgiGet( "Z12336Color"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12347Customer = httpContext.cgiGet( "Z12347Customer") ;
            Z12348Article = httpContext.cgiGet( "Z12348Article") ;
            Z12349ColourNo = httpContext.cgiGet( "Z12349ColourNo") ;
            Z12350ColourDesc = httpContext.cgiGet( "Z12350ColourDesc") ;
            Z12351Length = localUtil.ctond( httpContext.cgiGet( "Z12351Length")) ;
            Z12381State = (int)(localUtil.ctol( httpContext.cgiGet( "Z12381State"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12395StartTime = localUtil.ctot( httpContext.cgiGet( "Z12395StartTime"), 0) ;
            Z12396EndTime = localUtil.ctot( httpContext.cgiGet( "Z12396EndTime"), 0) ;
            Z12405TypeOfProc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12405TypeOfProc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12406ProcedureN = (short)(localUtil.ctol( httpContext.cgiGet( "Z12406ProcedureN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12408ProcessTp1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12408ProcessTp1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12409ProcessTp2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12409ProcessTp2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12538Paramet5 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12538Paramet5"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12539Paramet6 = (short)(localUtil.ctol( httpContext.cgiGet( "Z12539Paramet6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12410Paramet7 = localUtil.ctond( httpContext.cgiGet( "Z12410Paramet7")) ;
            Z12532Paramet8 = localUtil.ctond( httpContext.cgiGet( "Z12532Paramet8")) ;
            Z12533Paramet9 = localUtil.ctond( httpContext.cgiGet( "Z12533Paramet9")) ;
            Z12425Paramet10 = localUtil.ctond( httpContext.cgiGet( "Z12425Paramet10")) ;
            Z12334Paramet11 = localUtil.ctond( httpContext.cgiGet( "Z12334Paramet11")) ;
            Z12411Paramet12 = localUtil.ctond( httpContext.cgiGet( "Z12411Paramet12")) ;
            Z12412Paramet13 = localUtil.ctond( httpContext.cgiGet( "Z12412Paramet13")) ;
            Z12413Paramet14 = localUtil.ctond( httpContext.cgiGet( "Z12413Paramet14")) ;
            Z12414Paramet15 = localUtil.ctond( httpContext.cgiGet( "Z12414Paramet15")) ;
            Z12527Paramet16 = localUtil.ctond( httpContext.cgiGet( "Z12527Paramet16")) ;
            Z12335Paramet17 = localUtil.ctond( httpContext.cgiGet( "Z12335Paramet17")) ;
            Z12415Paramet18 = localUtil.ctond( httpContext.cgiGet( "Z12415Paramet18")) ;
            Z12528Paramet19 = localUtil.ctond( httpContext.cgiGet( "Z12528Paramet19")) ;
            Z12416Paramet20 = localUtil.ctond( httpContext.cgiGet( "Z12416Paramet20")) ;
            Z12417OrderNo = httpContext.cgiGet( "Z12417OrderNo") ;
            Z12418LiquorQuan = localUtil.ctol( httpContext.cgiGet( "Z12418LiquorQuan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z12419Text10 = httpContext.cgiGet( "Z12419Text10") ;
            Z12423Text11 = httpContext.cgiGet( "Z12423Text11") ;
            Z12529Text12 = httpContext.cgiGet( "Z12529Text12") ;
            Z12530Text13 = httpContext.cgiGet( "Z12530Text13") ;
            Z12531Text14 = httpContext.cgiGet( "Z12531Text14") ;
            Z12426Note1 = httpContext.cgiGet( "Z12426Note1") ;
            Z12537RequiredBy = localUtil.ctot( httpContext.cgiGet( "Z12537RequiredBy"), 0) ;
            Z12324RecipeNo = httpContext.cgiGet( "Z12324RecipeNo") ;
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
            A12309Machine = httpContext.cgiGet( edtMachine_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12309Machine", A12309Machine);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtWeight_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtWeight_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "WEIGHT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtWeight_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12310Weight = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrimstr( A12310Weight, 10, 2));
            }
            else
            {
               A12310Weight = localUtil.ctond( httpContext.cgiGet( edtWeight_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrimstr( A12310Weight, 10, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSetTime_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSetTime_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SETTIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSetTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12311SetTime = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12311SetTime), 4, 0));
            }
            else
            {
               A12311SetTime = (short)(localUtil.ctol( httpContext.cgiGet( edtSetTime_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12311SetTime), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtImportStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtImportStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "IMPORTSTAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtImportStat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12312ImportStat = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12312ImportStat), 5, 0));
            }
            else
            {
               A12312ImportStat = (int)(localUtil.ctol( httpContext.cgiGet( edtImportStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12312ImportStat), 5, 0));
            }
            A12324RecipeNo = httpContext.cgiGet( edtRecipeNo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecipeStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecipeStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECIPESTAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecipeStat_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12331RecipeStat = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12331RecipeStat), 5, 0));
            }
            else
            {
               A12331RecipeStat = (int)(localUtil.ctol( httpContext.cgiGet( edtRecipeStat_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12331RecipeStat), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProgramCre_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProgramCre_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROGRAMCRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProgramCre_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12332ProgramCre = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12332ProgramCre), 5, 0));
            }
            else
            {
               A12332ProgramCre = (int)(localUtil.ctol( httpContext.cgiGet( edtProgramCre_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12332ProgramCre), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLiquorRati_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLiquorRati_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LIQUORRATI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLiquorRati_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12333LiquorRati = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrimstr( A12333LiquorRati, 10, 2));
            }
            else
            {
               A12333LiquorRati = localUtil.ctond( httpContext.cgiGet( edtLiquorRati_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrimstr( A12333LiquorRati, 10, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtColor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12336Color = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12336Color), 10, 0));
            }
            else
            {
               A12336Color = localUtil.ctol( httpContext.cgiGet( edtColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12336Color), 10, 0));
            }
            A12347Customer = httpContext.cgiGet( edtCustomer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12347Customer", A12347Customer);
            A12348Article = httpContext.cgiGet( edtArticle_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12348Article", A12348Article);
            A12349ColourNo = httpContext.cgiGet( edtColourNo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12349ColourNo", A12349ColourNo);
            A12350ColourDesc = httpContext.cgiGet( edtColourDesc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12350ColourDesc", A12350ColourDesc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLength_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLength_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LENGTH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLength_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12351Length = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrimstr( A12351Length, 10, 2));
            }
            else
            {
               A12351Length = localUtil.ctond( httpContext.cgiGet( edtLength_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrimstr( A12351Length, 10, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtState_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtState_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "STATE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtState_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12381State = 0 ;
               n12381State = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12381State), 5, 0));
            }
            else
            {
               A12381State = (int)(localUtil.ctol( httpContext.cgiGet( edtState_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12381State = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12381State), 5, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtStartTime_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "STARTTIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtStartTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12395StartTime = GXutil.resetTime( GXutil.nullDate() );
               n12395StartTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A12395StartTime = localUtil.ctot( httpContext.cgiGet( edtStartTime_Internalname)) ;
               n12395StartTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtEndTime_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ENDTIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEndTime_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12396EndTime = GXutil.resetTime( GXutil.nullDate() );
               n12396EndTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A12396EndTime = localUtil.ctot( httpContext.cgiGet( edtEndTime_Internalname)) ;
               n12396EndTime = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTypeOfProc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTypeOfProc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TYPEOFPROC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTypeOfProc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12405TypeOfProc = (short)(0) ;
               n12405TypeOfProc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12405TypeOfProc), 4, 0));
            }
            else
            {
               A12405TypeOfProc = (short)(localUtil.ctol( httpContext.cgiGet( edtTypeOfProc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12405TypeOfProc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12405TypeOfProc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProcedureN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProcedureN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCEDUREN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProcedureN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12406ProcedureN = (short)(0) ;
               n12406ProcedureN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12406ProcedureN), 4, 0));
            }
            else
            {
               A12406ProcedureN = (short)(localUtil.ctol( httpContext.cgiGet( edtProcedureN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12406ProcedureN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12406ProcedureN), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProcessTp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProcessTp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCESSTP1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProcessTp1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12408ProcessTp1 = (short)(0) ;
               n12408ProcessTp1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12408ProcessTp1), 4, 0));
            }
            else
            {
               A12408ProcessTp1 = (short)(localUtil.ctol( httpContext.cgiGet( edtProcessTp1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12408ProcessTp1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12408ProcessTp1), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProcessTp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProcessTp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCESSTP2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProcessTp2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12409ProcessTp2 = (short)(0) ;
               n12409ProcessTp2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12409ProcessTp2), 4, 0));
            }
            else
            {
               A12409ProcessTp2 = (short)(localUtil.ctol( httpContext.cgiGet( edtProcessTp2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12409ProcessTp2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12409ProcessTp2), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParamet5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParamet5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET5");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet5_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12538Paramet5 = (short)(0) ;
               n12538Paramet5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12538Paramet5), 4, 0));
            }
            else
            {
               A12538Paramet5 = (short)(localUtil.ctol( httpContext.cgiGet( edtParamet5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12538Paramet5 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12538Paramet5), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParamet6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParamet6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET6");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet6_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12539Paramet6 = (short)(0) ;
               n12539Paramet6 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12539Paramet6), 4, 0));
            }
            else
            {
               A12539Paramet6 = (short)(localUtil.ctol( httpContext.cgiGet( edtParamet6_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12539Paramet6 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12539Paramet6), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet7_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet7_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET7");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet7_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12410Paramet7 = DecimalUtil.ZERO ;
               n12410Paramet7 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrimstr( A12410Paramet7, 10, 2));
            }
            else
            {
               A12410Paramet7 = localUtil.ctond( httpContext.cgiGet( edtParamet7_Internalname)) ;
               n12410Paramet7 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrimstr( A12410Paramet7, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet8_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet8_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET8");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet8_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12532Paramet8 = DecimalUtil.ZERO ;
               n12532Paramet8 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrimstr( A12532Paramet8, 10, 2));
            }
            else
            {
               A12532Paramet8 = localUtil.ctond( httpContext.cgiGet( edtParamet8_Internalname)) ;
               n12532Paramet8 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrimstr( A12532Paramet8, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet9_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet9_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET9");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet9_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12533Paramet9 = DecimalUtil.ZERO ;
               n12533Paramet9 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrimstr( A12533Paramet9, 10, 2));
            }
            else
            {
               A12533Paramet9 = localUtil.ctond( httpContext.cgiGet( edtParamet9_Internalname)) ;
               n12533Paramet9 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrimstr( A12533Paramet9, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet10_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet10_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET10");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet10_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12425Paramet10 = DecimalUtil.ZERO ;
               n12425Paramet10 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrimstr( A12425Paramet10, 10, 2));
            }
            else
            {
               A12425Paramet10 = localUtil.ctond( httpContext.cgiGet( edtParamet10_Internalname)) ;
               n12425Paramet10 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrimstr( A12425Paramet10, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet11_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet11_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET11");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet11_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12334Paramet11 = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrimstr( A12334Paramet11, 10, 2));
            }
            else
            {
               A12334Paramet11 = localUtil.ctond( httpContext.cgiGet( edtParamet11_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrimstr( A12334Paramet11, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet12_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet12_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET12");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet12_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12411Paramet12 = DecimalUtil.ZERO ;
               n12411Paramet12 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrimstr( A12411Paramet12, 10, 2));
            }
            else
            {
               A12411Paramet12 = localUtil.ctond( httpContext.cgiGet( edtParamet12_Internalname)) ;
               n12411Paramet12 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrimstr( A12411Paramet12, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet13_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet13_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET13");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet13_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12412Paramet13 = DecimalUtil.ZERO ;
               n12412Paramet13 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrimstr( A12412Paramet13, 10, 2));
            }
            else
            {
               A12412Paramet13 = localUtil.ctond( httpContext.cgiGet( edtParamet13_Internalname)) ;
               n12412Paramet13 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrimstr( A12412Paramet13, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet14_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet14_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET14");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet14_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12413Paramet14 = DecimalUtil.ZERO ;
               n12413Paramet14 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrimstr( A12413Paramet14, 10, 2));
            }
            else
            {
               A12413Paramet14 = localUtil.ctond( httpContext.cgiGet( edtParamet14_Internalname)) ;
               n12413Paramet14 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrimstr( A12413Paramet14, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet15_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet15_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET15");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet15_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12414Paramet15 = DecimalUtil.ZERO ;
               n12414Paramet15 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrimstr( A12414Paramet15, 10, 2));
            }
            else
            {
               A12414Paramet15 = localUtil.ctond( httpContext.cgiGet( edtParamet15_Internalname)) ;
               n12414Paramet15 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrimstr( A12414Paramet15, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet16_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet16_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET16");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet16_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12527Paramet16 = DecimalUtil.ZERO ;
               n12527Paramet16 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrimstr( A12527Paramet16, 10, 2));
            }
            else
            {
               A12527Paramet16 = localUtil.ctond( httpContext.cgiGet( edtParamet16_Internalname)) ;
               n12527Paramet16 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrimstr( A12527Paramet16, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet17_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet17_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET17");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet17_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12335Paramet17 = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrimstr( A12335Paramet17, 10, 2));
            }
            else
            {
               A12335Paramet17 = localUtil.ctond( httpContext.cgiGet( edtParamet17_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrimstr( A12335Paramet17, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet18_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet18_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET18");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet18_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12415Paramet18 = DecimalUtil.ZERO ;
               n12415Paramet18 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrimstr( A12415Paramet18, 10, 2));
            }
            else
            {
               A12415Paramet18 = localUtil.ctond( httpContext.cgiGet( edtParamet18_Internalname)) ;
               n12415Paramet18 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrimstr( A12415Paramet18, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet19_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet19_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET19");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet19_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12528Paramet19 = DecimalUtil.ZERO ;
               n12528Paramet19 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrimstr( A12528Paramet19, 10, 2));
            }
            else
            {
               A12528Paramet19 = localUtil.ctond( httpContext.cgiGet( edtParamet19_Internalname)) ;
               n12528Paramet19 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrimstr( A12528Paramet19, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtParamet20_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtParamet20_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARAMET20");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParamet20_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12416Paramet20 = DecimalUtil.ZERO ;
               n12416Paramet20 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrimstr( A12416Paramet20, 10, 2));
            }
            else
            {
               A12416Paramet20 = localUtil.ctond( httpContext.cgiGet( edtParamet20_Internalname)) ;
               n12416Paramet20 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrimstr( A12416Paramet20, 10, 2));
            }
            A12417OrderNo = httpContext.cgiGet( edtOrderNo_Internalname) ;
            n12417OrderNo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12417OrderNo", A12417OrderNo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLiquorQuan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLiquorQuan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LIQUORQUAN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLiquorQuan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12418LiquorQuan = 0 ;
               n12418LiquorQuan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12418LiquorQuan), 10, 0));
            }
            else
            {
               A12418LiquorQuan = localUtil.ctol( httpContext.cgiGet( edtLiquorQuan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n12418LiquorQuan = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12418LiquorQuan), 10, 0));
            }
            A12419Text10 = httpContext.cgiGet( edtText10_Internalname) ;
            n12419Text10 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12419Text10", A12419Text10);
            A12423Text11 = httpContext.cgiGet( edtText11_Internalname) ;
            n12423Text11 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12423Text11", A12423Text11);
            A12529Text12 = httpContext.cgiGet( edtText12_Internalname) ;
            n12529Text12 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12529Text12", A12529Text12);
            A12530Text13 = httpContext.cgiGet( edtText13_Internalname) ;
            n12530Text13 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12530Text13", A12530Text13);
            A12531Text14 = httpContext.cgiGet( edtText14_Internalname) ;
            n12531Text14 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12531Text14", A12531Text14);
            A12426Note1 = httpContext.cgiGet( edtNote1_Internalname) ;
            n12426Note1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12426Note1", A12426Note1);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtRequiredBy_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "REQUIREDBY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRequiredBy_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
               n12537RequiredBy = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A12537RequiredBy = localUtil.ctot( httpContext.cgiGet( edtRequiredBy_Internalname)) ;
               n12537RequiredBy = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
               A12313Dyelot = httpContext.GetPar( "Dyelot") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
               A12314ReDye = (int)(GXutil.lval( httpContext.GetPar( "ReDye"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
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
                        e111JT2 ();
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
            initAll1JT1707( ) ;
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
      disableAttributes1JT1707( ) ;
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

   public void confirm_1JT0( )
   {
      beforeValidate1JT1707( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JT1707( ) ;
         }
         else
         {
            checkExtendedTable1JT1707( ) ;
            if ( AnyError == 0 )
            {
               zm1JT1707( 2) ;
            }
            closeExtendedTableCursors1JT1707( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1JT0( ) ;
      }
   }

   public void resetCaption1JT0( )
   {
   }

   public void e111JT2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1JT1707( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12309Machine = T01JT3_A12309Machine[0] ;
            Z12310Weight = T01JT3_A12310Weight[0] ;
            Z12311SetTime = T01JT3_A12311SetTime[0] ;
            Z12312ImportStat = T01JT3_A12312ImportStat[0] ;
            Z12331RecipeStat = T01JT3_A12331RecipeStat[0] ;
            Z12332ProgramCre = T01JT3_A12332ProgramCre[0] ;
            Z12333LiquorRati = T01JT3_A12333LiquorRati[0] ;
            Z12336Color = T01JT3_A12336Color[0] ;
            Z12347Customer = T01JT3_A12347Customer[0] ;
            Z12348Article = T01JT3_A12348Article[0] ;
            Z12349ColourNo = T01JT3_A12349ColourNo[0] ;
            Z12350ColourDesc = T01JT3_A12350ColourDesc[0] ;
            Z12351Length = T01JT3_A12351Length[0] ;
            Z12381State = T01JT3_A12381State[0] ;
            Z12395StartTime = T01JT3_A12395StartTime[0] ;
            Z12396EndTime = T01JT3_A12396EndTime[0] ;
            Z12405TypeOfProc = T01JT3_A12405TypeOfProc[0] ;
            Z12406ProcedureN = T01JT3_A12406ProcedureN[0] ;
            Z12408ProcessTp1 = T01JT3_A12408ProcessTp1[0] ;
            Z12409ProcessTp2 = T01JT3_A12409ProcessTp2[0] ;
            Z12538Paramet5 = T01JT3_A12538Paramet5[0] ;
            Z12539Paramet6 = T01JT3_A12539Paramet6[0] ;
            Z12410Paramet7 = T01JT3_A12410Paramet7[0] ;
            Z12532Paramet8 = T01JT3_A12532Paramet8[0] ;
            Z12533Paramet9 = T01JT3_A12533Paramet9[0] ;
            Z12425Paramet10 = T01JT3_A12425Paramet10[0] ;
            Z12334Paramet11 = T01JT3_A12334Paramet11[0] ;
            Z12411Paramet12 = T01JT3_A12411Paramet12[0] ;
            Z12412Paramet13 = T01JT3_A12412Paramet13[0] ;
            Z12413Paramet14 = T01JT3_A12413Paramet14[0] ;
            Z12414Paramet15 = T01JT3_A12414Paramet15[0] ;
            Z12527Paramet16 = T01JT3_A12527Paramet16[0] ;
            Z12335Paramet17 = T01JT3_A12335Paramet17[0] ;
            Z12415Paramet18 = T01JT3_A12415Paramet18[0] ;
            Z12528Paramet19 = T01JT3_A12528Paramet19[0] ;
            Z12416Paramet20 = T01JT3_A12416Paramet20[0] ;
            Z12417OrderNo = T01JT3_A12417OrderNo[0] ;
            Z12418LiquorQuan = T01JT3_A12418LiquorQuan[0] ;
            Z12419Text10 = T01JT3_A12419Text10[0] ;
            Z12423Text11 = T01JT3_A12423Text11[0] ;
            Z12529Text12 = T01JT3_A12529Text12[0] ;
            Z12530Text13 = T01JT3_A12530Text13[0] ;
            Z12531Text14 = T01JT3_A12531Text14[0] ;
            Z12426Note1 = T01JT3_A12426Note1[0] ;
            Z12537RequiredBy = T01JT3_A12537RequiredBy[0] ;
            Z12324RecipeNo = T01JT3_A12324RecipeNo[0] ;
         }
         else
         {
            Z12309Machine = A12309Machine ;
            Z12310Weight = A12310Weight ;
            Z12311SetTime = A12311SetTime ;
            Z12312ImportStat = A12312ImportStat ;
            Z12331RecipeStat = A12331RecipeStat ;
            Z12332ProgramCre = A12332ProgramCre ;
            Z12333LiquorRati = A12333LiquorRati ;
            Z12336Color = A12336Color ;
            Z12347Customer = A12347Customer ;
            Z12348Article = A12348Article ;
            Z12349ColourNo = A12349ColourNo ;
            Z12350ColourDesc = A12350ColourDesc ;
            Z12351Length = A12351Length ;
            Z12381State = A12381State ;
            Z12395StartTime = A12395StartTime ;
            Z12396EndTime = A12396EndTime ;
            Z12405TypeOfProc = A12405TypeOfProc ;
            Z12406ProcedureN = A12406ProcedureN ;
            Z12408ProcessTp1 = A12408ProcessTp1 ;
            Z12409ProcessTp2 = A12409ProcessTp2 ;
            Z12538Paramet5 = A12538Paramet5 ;
            Z12539Paramet6 = A12539Paramet6 ;
            Z12410Paramet7 = A12410Paramet7 ;
            Z12532Paramet8 = A12532Paramet8 ;
            Z12533Paramet9 = A12533Paramet9 ;
            Z12425Paramet10 = A12425Paramet10 ;
            Z12334Paramet11 = A12334Paramet11 ;
            Z12411Paramet12 = A12411Paramet12 ;
            Z12412Paramet13 = A12412Paramet13 ;
            Z12413Paramet14 = A12413Paramet14 ;
            Z12414Paramet15 = A12414Paramet15 ;
            Z12527Paramet16 = A12527Paramet16 ;
            Z12335Paramet17 = A12335Paramet17 ;
            Z12415Paramet18 = A12415Paramet18 ;
            Z12528Paramet19 = A12528Paramet19 ;
            Z12416Paramet20 = A12416Paramet20 ;
            Z12417OrderNo = A12417OrderNo ;
            Z12418LiquorQuan = A12418LiquorQuan ;
            Z12419Text10 = A12419Text10 ;
            Z12423Text11 = A12423Text11 ;
            Z12529Text12 = A12529Text12 ;
            Z12530Text13 = A12530Text13 ;
            Z12531Text14 = A12531Text14 ;
            Z12426Note1 = A12426Note1 ;
            Z12537RequiredBy = A12537RequiredBy ;
            Z12324RecipeNo = A12324RecipeNo ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12313Dyelot = A12313Dyelot ;
         Z12314ReDye = A12314ReDye ;
         Z12309Machine = A12309Machine ;
         Z12310Weight = A12310Weight ;
         Z12311SetTime = A12311SetTime ;
         Z12312ImportStat = A12312ImportStat ;
         Z12331RecipeStat = A12331RecipeStat ;
         Z12332ProgramCre = A12332ProgramCre ;
         Z12333LiquorRati = A12333LiquorRati ;
         Z12336Color = A12336Color ;
         Z12347Customer = A12347Customer ;
         Z12348Article = A12348Article ;
         Z12349ColourNo = A12349ColourNo ;
         Z12350ColourDesc = A12350ColourDesc ;
         Z12351Length = A12351Length ;
         Z12381State = A12381State ;
         Z12395StartTime = A12395StartTime ;
         Z12396EndTime = A12396EndTime ;
         Z12405TypeOfProc = A12405TypeOfProc ;
         Z12406ProcedureN = A12406ProcedureN ;
         Z12408ProcessTp1 = A12408ProcessTp1 ;
         Z12409ProcessTp2 = A12409ProcessTp2 ;
         Z12538Paramet5 = A12538Paramet5 ;
         Z12539Paramet6 = A12539Paramet6 ;
         Z12410Paramet7 = A12410Paramet7 ;
         Z12532Paramet8 = A12532Paramet8 ;
         Z12533Paramet9 = A12533Paramet9 ;
         Z12425Paramet10 = A12425Paramet10 ;
         Z12334Paramet11 = A12334Paramet11 ;
         Z12411Paramet12 = A12411Paramet12 ;
         Z12412Paramet13 = A12412Paramet13 ;
         Z12413Paramet14 = A12413Paramet14 ;
         Z12414Paramet15 = A12414Paramet15 ;
         Z12527Paramet16 = A12527Paramet16 ;
         Z12335Paramet17 = A12335Paramet17 ;
         Z12415Paramet18 = A12415Paramet18 ;
         Z12528Paramet19 = A12528Paramet19 ;
         Z12416Paramet20 = A12416Paramet20 ;
         Z12417OrderNo = A12417OrderNo ;
         Z12418LiquorQuan = A12418LiquorQuan ;
         Z12419Text10 = A12419Text10 ;
         Z12423Text11 = A12423Text11 ;
         Z12529Text12 = A12529Text12 ;
         Z12530Text13 = A12530Text13 ;
         Z12531Text14 = A12531Text14 ;
         Z12426Note1 = A12426Note1 ;
         Z12537RequiredBy = A12537RequiredBy ;
         Z12324RecipeNo = A12324RecipeNo ;
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

   public void load1JT1707( )
   {
      /* Using cursor T01JT5 */
      pr_default.execute(3, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1707 = (short)(1) ;
         A12309Machine = T01JT5_A12309Machine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12309Machine", A12309Machine);
         A12310Weight = T01JT5_A12310Weight[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrimstr( A12310Weight, 10, 2));
         A12311SetTime = T01JT5_A12311SetTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12311SetTime), 4, 0));
         A12312ImportStat = T01JT5_A12312ImportStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12312ImportStat), 5, 0));
         A12331RecipeStat = T01JT5_A12331RecipeStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12331RecipeStat), 5, 0));
         A12332ProgramCre = T01JT5_A12332ProgramCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12332ProgramCre), 5, 0));
         A12333LiquorRati = T01JT5_A12333LiquorRati[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrimstr( A12333LiquorRati, 10, 2));
         A12336Color = T01JT5_A12336Color[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12336Color), 10, 0));
         A12347Customer = T01JT5_A12347Customer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12347Customer", A12347Customer);
         A12348Article = T01JT5_A12348Article[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12348Article", A12348Article);
         A12349ColourNo = T01JT5_A12349ColourNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12349ColourNo", A12349ColourNo);
         A12350ColourDesc = T01JT5_A12350ColourDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12350ColourDesc", A12350ColourDesc);
         A12351Length = T01JT5_A12351Length[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrimstr( A12351Length, 10, 2));
         A12381State = T01JT5_A12381State[0] ;
         n12381State = T01JT5_n12381State[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12381State), 5, 0));
         A12395StartTime = T01JT5_A12395StartTime[0] ;
         n12395StartTime = T01JT5_n12395StartTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12396EndTime = T01JT5_A12396EndTime[0] ;
         n12396EndTime = T01JT5_n12396EndTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12405TypeOfProc = T01JT5_A12405TypeOfProc[0] ;
         n12405TypeOfProc = T01JT5_n12405TypeOfProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12405TypeOfProc), 4, 0));
         A12406ProcedureN = T01JT5_A12406ProcedureN[0] ;
         n12406ProcedureN = T01JT5_n12406ProcedureN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12406ProcedureN), 4, 0));
         A12408ProcessTp1 = T01JT5_A12408ProcessTp1[0] ;
         n12408ProcessTp1 = T01JT5_n12408ProcessTp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12408ProcessTp1), 4, 0));
         A12409ProcessTp2 = T01JT5_A12409ProcessTp2[0] ;
         n12409ProcessTp2 = T01JT5_n12409ProcessTp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12409ProcessTp2), 4, 0));
         A12538Paramet5 = T01JT5_A12538Paramet5[0] ;
         n12538Paramet5 = T01JT5_n12538Paramet5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12538Paramet5), 4, 0));
         A12539Paramet6 = T01JT5_A12539Paramet6[0] ;
         n12539Paramet6 = T01JT5_n12539Paramet6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12539Paramet6), 4, 0));
         A12410Paramet7 = T01JT5_A12410Paramet7[0] ;
         n12410Paramet7 = T01JT5_n12410Paramet7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrimstr( A12410Paramet7, 10, 2));
         A12532Paramet8 = T01JT5_A12532Paramet8[0] ;
         n12532Paramet8 = T01JT5_n12532Paramet8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrimstr( A12532Paramet8, 10, 2));
         A12533Paramet9 = T01JT5_A12533Paramet9[0] ;
         n12533Paramet9 = T01JT5_n12533Paramet9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrimstr( A12533Paramet9, 10, 2));
         A12425Paramet10 = T01JT5_A12425Paramet10[0] ;
         n12425Paramet10 = T01JT5_n12425Paramet10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrimstr( A12425Paramet10, 10, 2));
         A12334Paramet11 = T01JT5_A12334Paramet11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrimstr( A12334Paramet11, 10, 2));
         A12411Paramet12 = T01JT5_A12411Paramet12[0] ;
         n12411Paramet12 = T01JT5_n12411Paramet12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrimstr( A12411Paramet12, 10, 2));
         A12412Paramet13 = T01JT5_A12412Paramet13[0] ;
         n12412Paramet13 = T01JT5_n12412Paramet13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrimstr( A12412Paramet13, 10, 2));
         A12413Paramet14 = T01JT5_A12413Paramet14[0] ;
         n12413Paramet14 = T01JT5_n12413Paramet14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrimstr( A12413Paramet14, 10, 2));
         A12414Paramet15 = T01JT5_A12414Paramet15[0] ;
         n12414Paramet15 = T01JT5_n12414Paramet15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrimstr( A12414Paramet15, 10, 2));
         A12527Paramet16 = T01JT5_A12527Paramet16[0] ;
         n12527Paramet16 = T01JT5_n12527Paramet16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrimstr( A12527Paramet16, 10, 2));
         A12335Paramet17 = T01JT5_A12335Paramet17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrimstr( A12335Paramet17, 10, 2));
         A12415Paramet18 = T01JT5_A12415Paramet18[0] ;
         n12415Paramet18 = T01JT5_n12415Paramet18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrimstr( A12415Paramet18, 10, 2));
         A12528Paramet19 = T01JT5_A12528Paramet19[0] ;
         n12528Paramet19 = T01JT5_n12528Paramet19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrimstr( A12528Paramet19, 10, 2));
         A12416Paramet20 = T01JT5_A12416Paramet20[0] ;
         n12416Paramet20 = T01JT5_n12416Paramet20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrimstr( A12416Paramet20, 10, 2));
         A12417OrderNo = T01JT5_A12417OrderNo[0] ;
         n12417OrderNo = T01JT5_n12417OrderNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12417OrderNo", A12417OrderNo);
         A12418LiquorQuan = T01JT5_A12418LiquorQuan[0] ;
         n12418LiquorQuan = T01JT5_n12418LiquorQuan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12418LiquorQuan), 10, 0));
         A12419Text10 = T01JT5_A12419Text10[0] ;
         n12419Text10 = T01JT5_n12419Text10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12419Text10", A12419Text10);
         A12423Text11 = T01JT5_A12423Text11[0] ;
         n12423Text11 = T01JT5_n12423Text11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12423Text11", A12423Text11);
         A12529Text12 = T01JT5_A12529Text12[0] ;
         n12529Text12 = T01JT5_n12529Text12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12529Text12", A12529Text12);
         A12530Text13 = T01JT5_A12530Text13[0] ;
         n12530Text13 = T01JT5_n12530Text13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12530Text13", A12530Text13);
         A12531Text14 = T01JT5_A12531Text14[0] ;
         n12531Text14 = T01JT5_n12531Text14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12531Text14", A12531Text14);
         A12426Note1 = T01JT5_A12426Note1[0] ;
         n12426Note1 = T01JT5_n12426Note1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12426Note1", A12426Note1);
         A12537RequiredBy = T01JT5_A12537RequiredBy[0] ;
         n12537RequiredBy = T01JT5_n12537RequiredBy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12324RecipeNo = T01JT5_A12324RecipeNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
         zm1JT1707( -1) ;
      }
      pr_default.close(3);
      onLoadActions1JT1707( ) ;
   }

   public void onLoadActions1JT1707( )
   {
   }

   public void checkExtendedTable1JT1707( )
   {
      nIsDirty_1707 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01JT4 */
      pr_default.execute(2, new Object[] {A12324RecipeNo});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECIPES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECIPENO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecipeNo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1JT1707( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A12324RecipeNo )
   {
      /* Using cursor T01JT6 */
      pr_default.execute(4, new Object[] {A12324RecipeNo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECIPES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECIPENO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecipeNo_Internalname ;
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

   public void getKey1JT1707( )
   {
      /* Using cursor T01JT7 */
      pr_default.execute(5, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1707 = (short)(1) ;
      }
      else
      {
         RcdFound1707 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JT3 */
      pr_default.execute(1, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1JT1707( 1) ;
         RcdFound1707 = (short)(1) ;
         A12313Dyelot = T01JT3_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JT3_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
         A12309Machine = T01JT3_A12309Machine[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12309Machine", A12309Machine);
         A12310Weight = T01JT3_A12310Weight[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrimstr( A12310Weight, 10, 2));
         A12311SetTime = T01JT3_A12311SetTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12311SetTime), 4, 0));
         A12312ImportStat = T01JT3_A12312ImportStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12312ImportStat), 5, 0));
         A12331RecipeStat = T01JT3_A12331RecipeStat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12331RecipeStat), 5, 0));
         A12332ProgramCre = T01JT3_A12332ProgramCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12332ProgramCre), 5, 0));
         A12333LiquorRati = T01JT3_A12333LiquorRati[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrimstr( A12333LiquorRati, 10, 2));
         A12336Color = T01JT3_A12336Color[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12336Color), 10, 0));
         A12347Customer = T01JT3_A12347Customer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12347Customer", A12347Customer);
         A12348Article = T01JT3_A12348Article[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12348Article", A12348Article);
         A12349ColourNo = T01JT3_A12349ColourNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12349ColourNo", A12349ColourNo);
         A12350ColourDesc = T01JT3_A12350ColourDesc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12350ColourDesc", A12350ColourDesc);
         A12351Length = T01JT3_A12351Length[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrimstr( A12351Length, 10, 2));
         A12381State = T01JT3_A12381State[0] ;
         n12381State = T01JT3_n12381State[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12381State), 5, 0));
         A12395StartTime = T01JT3_A12395StartTime[0] ;
         n12395StartTime = T01JT3_n12395StartTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12396EndTime = T01JT3_A12396EndTime[0] ;
         n12396EndTime = T01JT3_n12396EndTime[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12405TypeOfProc = T01JT3_A12405TypeOfProc[0] ;
         n12405TypeOfProc = T01JT3_n12405TypeOfProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12405TypeOfProc), 4, 0));
         A12406ProcedureN = T01JT3_A12406ProcedureN[0] ;
         n12406ProcedureN = T01JT3_n12406ProcedureN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12406ProcedureN), 4, 0));
         A12408ProcessTp1 = T01JT3_A12408ProcessTp1[0] ;
         n12408ProcessTp1 = T01JT3_n12408ProcessTp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12408ProcessTp1), 4, 0));
         A12409ProcessTp2 = T01JT3_A12409ProcessTp2[0] ;
         n12409ProcessTp2 = T01JT3_n12409ProcessTp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12409ProcessTp2), 4, 0));
         A12538Paramet5 = T01JT3_A12538Paramet5[0] ;
         n12538Paramet5 = T01JT3_n12538Paramet5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12538Paramet5), 4, 0));
         A12539Paramet6 = T01JT3_A12539Paramet6[0] ;
         n12539Paramet6 = T01JT3_n12539Paramet6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12539Paramet6), 4, 0));
         A12410Paramet7 = T01JT3_A12410Paramet7[0] ;
         n12410Paramet7 = T01JT3_n12410Paramet7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrimstr( A12410Paramet7, 10, 2));
         A12532Paramet8 = T01JT3_A12532Paramet8[0] ;
         n12532Paramet8 = T01JT3_n12532Paramet8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrimstr( A12532Paramet8, 10, 2));
         A12533Paramet9 = T01JT3_A12533Paramet9[0] ;
         n12533Paramet9 = T01JT3_n12533Paramet9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrimstr( A12533Paramet9, 10, 2));
         A12425Paramet10 = T01JT3_A12425Paramet10[0] ;
         n12425Paramet10 = T01JT3_n12425Paramet10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrimstr( A12425Paramet10, 10, 2));
         A12334Paramet11 = T01JT3_A12334Paramet11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrimstr( A12334Paramet11, 10, 2));
         A12411Paramet12 = T01JT3_A12411Paramet12[0] ;
         n12411Paramet12 = T01JT3_n12411Paramet12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrimstr( A12411Paramet12, 10, 2));
         A12412Paramet13 = T01JT3_A12412Paramet13[0] ;
         n12412Paramet13 = T01JT3_n12412Paramet13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrimstr( A12412Paramet13, 10, 2));
         A12413Paramet14 = T01JT3_A12413Paramet14[0] ;
         n12413Paramet14 = T01JT3_n12413Paramet14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrimstr( A12413Paramet14, 10, 2));
         A12414Paramet15 = T01JT3_A12414Paramet15[0] ;
         n12414Paramet15 = T01JT3_n12414Paramet15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrimstr( A12414Paramet15, 10, 2));
         A12527Paramet16 = T01JT3_A12527Paramet16[0] ;
         n12527Paramet16 = T01JT3_n12527Paramet16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrimstr( A12527Paramet16, 10, 2));
         A12335Paramet17 = T01JT3_A12335Paramet17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrimstr( A12335Paramet17, 10, 2));
         A12415Paramet18 = T01JT3_A12415Paramet18[0] ;
         n12415Paramet18 = T01JT3_n12415Paramet18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrimstr( A12415Paramet18, 10, 2));
         A12528Paramet19 = T01JT3_A12528Paramet19[0] ;
         n12528Paramet19 = T01JT3_n12528Paramet19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrimstr( A12528Paramet19, 10, 2));
         A12416Paramet20 = T01JT3_A12416Paramet20[0] ;
         n12416Paramet20 = T01JT3_n12416Paramet20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrimstr( A12416Paramet20, 10, 2));
         A12417OrderNo = T01JT3_A12417OrderNo[0] ;
         n12417OrderNo = T01JT3_n12417OrderNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12417OrderNo", A12417OrderNo);
         A12418LiquorQuan = T01JT3_A12418LiquorQuan[0] ;
         n12418LiquorQuan = T01JT3_n12418LiquorQuan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12418LiquorQuan), 10, 0));
         A12419Text10 = T01JT3_A12419Text10[0] ;
         n12419Text10 = T01JT3_n12419Text10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12419Text10", A12419Text10);
         A12423Text11 = T01JT3_A12423Text11[0] ;
         n12423Text11 = T01JT3_n12423Text11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12423Text11", A12423Text11);
         A12529Text12 = T01JT3_A12529Text12[0] ;
         n12529Text12 = T01JT3_n12529Text12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12529Text12", A12529Text12);
         A12530Text13 = T01JT3_A12530Text13[0] ;
         n12530Text13 = T01JT3_n12530Text13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12530Text13", A12530Text13);
         A12531Text14 = T01JT3_A12531Text14[0] ;
         n12531Text14 = T01JT3_n12531Text14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12531Text14", A12531Text14);
         A12426Note1 = T01JT3_A12426Note1[0] ;
         n12426Note1 = T01JT3_n12426Note1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12426Note1", A12426Note1);
         A12537RequiredBy = T01JT3_A12537RequiredBy[0] ;
         n12537RequiredBy = T01JT3_n12537RequiredBy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12324RecipeNo = T01JT3_A12324RecipeNo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
         Z12313Dyelot = A12313Dyelot ;
         Z12314ReDye = A12314ReDye ;
         sMode1707 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JT1707( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1707 = (short)(0) ;
            initializeNonKey1JT1707( ) ;
         }
         Gx_mode = sMode1707 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1707 = (short)(0) ;
         initializeNonKey1JT1707( ) ;
         sMode1707 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1707 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1JT1707( ) ;
      if ( RcdFound1707 == 0 )
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
      RcdFound1707 = (short)(0) ;
      /* Using cursor T01JT8 */
      pr_default.execute(6, new Object[] {A12313Dyelot, A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JT8_A12313Dyelot[0], A12313Dyelot) < 0 ) || ( GXutil.strcmp(T01JT8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JT8_A12314ReDye[0] < A12314ReDye ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JT8_A12313Dyelot[0], A12313Dyelot) > 0 ) || ( GXutil.strcmp(T01JT8_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JT8_A12314ReDye[0] > A12314ReDye ) ) )
         {
            A12313Dyelot = T01JT8_A12313Dyelot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = T01JT8_A12314ReDye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            RcdFound1707 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1707 = (short)(0) ;
      /* Using cursor T01JT9 */
      pr_default.execute(7, new Object[] {A12313Dyelot, A12313Dyelot, Integer.valueOf(A12314ReDye)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JT9_A12313Dyelot[0], A12313Dyelot) > 0 ) || ( GXutil.strcmp(T01JT9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JT9_A12314ReDye[0] > A12314ReDye ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JT9_A12313Dyelot[0], A12313Dyelot) < 0 ) || ( GXutil.strcmp(T01JT9_A12313Dyelot[0], A12313Dyelot) == 0 ) && ( T01JT9_A12314ReDye[0] < A12314ReDye ) ) )
         {
            A12313Dyelot = T01JT9_A12313Dyelot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = T01JT9_A12314ReDye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
            RcdFound1707 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JT1707( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JT1707( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1707 == 1 )
         {
            if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) )
            {
               A12313Dyelot = Z12313Dyelot ;
               httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
               A12314ReDye = Z12314ReDye ;
               httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
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
               update1JT1707( ) ;
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtDyelot_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JT1707( ) ;
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
                  insert1JT1707( ) ;
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
      if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) )
      {
         A12313Dyelot = Z12313Dyelot ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = Z12314ReDye ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
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
      getKey1JT1707( ) ;
      if ( RcdFound1707 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "DYELOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDyelot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) )
         {
            A12313Dyelot = Z12313Dyelot ;
            httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
            A12314ReDye = Z12314ReDye ;
            httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
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
         if ( ( GXutil.strcmp(A12313Dyelot, Z12313Dyelot) != 0 ) || ( A12314ReDye != Z12314ReDye ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye001");
      GX_FocusControl = edtMachine_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JT0( ) ;
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
      if ( RcdFound1707 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DYELOT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDyelot_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMachine_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JT1707( ) ;
      if ( RcdFound1707 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMachine_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JT1707( ) ;
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
      if ( RcdFound1707 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMachine_Internalname ;
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
      if ( RcdFound1707 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMachine_Internalname ;
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
      scanStart1JT1707( ) ;
      if ( RcdFound1707 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1707 != 0 )
         {
            scanNext1JT1707( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMachine_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JT1707( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JT1707( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JT2 */
         pr_default.execute(0, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12309Machine, T01JT2_A12309Machine[0]) != 0 ) || ( DecimalUtil.compareTo(Z12310Weight, T01JT2_A12310Weight[0]) != 0 ) || ( Z12311SetTime != T01JT2_A12311SetTime[0] ) || ( Z12312ImportStat != T01JT2_A12312ImportStat[0] ) || ( Z12331RecipeStat != T01JT2_A12331RecipeStat[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12332ProgramCre != T01JT2_A12332ProgramCre[0] ) || ( DecimalUtil.compareTo(Z12333LiquorRati, T01JT2_A12333LiquorRati[0]) != 0 ) || ( Z12336Color != T01JT2_A12336Color[0] ) || ( GXutil.strcmp(Z12347Customer, T01JT2_A12347Customer[0]) != 0 ) || ( GXutil.strcmp(Z12348Article, T01JT2_A12348Article[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12349ColourNo, T01JT2_A12349ColourNo[0]) != 0 ) || ( GXutil.strcmp(Z12350ColourDesc, T01JT2_A12350ColourDesc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12351Length, T01JT2_A12351Length[0]) != 0 ) || ( Z12381State != T01JT2_A12381State[0] ) || !( GXutil.dateCompare(Z12395StartTime, T01JT2_A12395StartTime[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z12396EndTime, T01JT2_A12396EndTime[0]) ) || ( Z12405TypeOfProc != T01JT2_A12405TypeOfProc[0] ) || ( Z12406ProcedureN != T01JT2_A12406ProcedureN[0] ) || ( Z12408ProcessTp1 != T01JT2_A12408ProcessTp1[0] ) || ( Z12409ProcessTp2 != T01JT2_A12409ProcessTp2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12538Paramet5 != T01JT2_A12538Paramet5[0] ) || ( Z12539Paramet6 != T01JT2_A12539Paramet6[0] ) || ( DecimalUtil.compareTo(Z12410Paramet7, T01JT2_A12410Paramet7[0]) != 0 ) || ( DecimalUtil.compareTo(Z12532Paramet8, T01JT2_A12532Paramet8[0]) != 0 ) || ( DecimalUtil.compareTo(Z12533Paramet9, T01JT2_A12533Paramet9[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12425Paramet10, T01JT2_A12425Paramet10[0]) != 0 ) || ( DecimalUtil.compareTo(Z12334Paramet11, T01JT2_A12334Paramet11[0]) != 0 ) || ( DecimalUtil.compareTo(Z12411Paramet12, T01JT2_A12411Paramet12[0]) != 0 ) || ( DecimalUtil.compareTo(Z12412Paramet13, T01JT2_A12412Paramet13[0]) != 0 ) || ( DecimalUtil.compareTo(Z12413Paramet14, T01JT2_A12413Paramet14[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12414Paramet15, T01JT2_A12414Paramet15[0]) != 0 ) || ( DecimalUtil.compareTo(Z12527Paramet16, T01JT2_A12527Paramet16[0]) != 0 ) || ( DecimalUtil.compareTo(Z12335Paramet17, T01JT2_A12335Paramet17[0]) != 0 ) || ( DecimalUtil.compareTo(Z12415Paramet18, T01JT2_A12415Paramet18[0]) != 0 ) || ( DecimalUtil.compareTo(Z12528Paramet19, T01JT2_A12528Paramet19[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12416Paramet20, T01JT2_A12416Paramet20[0]) != 0 ) || ( GXutil.strcmp(Z12417OrderNo, T01JT2_A12417OrderNo[0]) != 0 ) || ( Z12418LiquorQuan != T01JT2_A12418LiquorQuan[0] ) || ( GXutil.strcmp(Z12419Text10, T01JT2_A12419Text10[0]) != 0 ) || ( GXutil.strcmp(Z12423Text11, T01JT2_A12423Text11[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12529Text12, T01JT2_A12529Text12[0]) != 0 ) || ( GXutil.strcmp(Z12530Text13, T01JT2_A12530Text13[0]) != 0 ) || ( GXutil.strcmp(Z12531Text14, T01JT2_A12531Text14[0]) != 0 ) || ( GXutil.strcmp(Z12426Note1, T01JT2_A12426Note1[0]) != 0 ) || !( GXutil.dateCompare(Z12537RequiredBy, T01JT2_A12537RequiredBy[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12324RecipeNo, T01JT2_A12324RecipeNo[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12309Machine, T01JT2_A12309Machine[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Machine");
               GXutil.writeLogRaw("Old: ",Z12309Machine);
               GXutil.writeLogRaw("Current: ",T01JT2_A12309Machine[0]);
            }
            if ( DecimalUtil.compareTo(Z12310Weight, T01JT2_A12310Weight[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Weight");
               GXutil.writeLogRaw("Old: ",Z12310Weight);
               GXutil.writeLogRaw("Current: ",T01JT2_A12310Weight[0]);
            }
            if ( Z12311SetTime != T01JT2_A12311SetTime[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"SetTime");
               GXutil.writeLogRaw("Old: ",Z12311SetTime);
               GXutil.writeLogRaw("Current: ",T01JT2_A12311SetTime[0]);
            }
            if ( Z12312ImportStat != T01JT2_A12312ImportStat[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ImportStat");
               GXutil.writeLogRaw("Old: ",Z12312ImportStat);
               GXutil.writeLogRaw("Current: ",T01JT2_A12312ImportStat[0]);
            }
            if ( Z12331RecipeStat != T01JT2_A12331RecipeStat[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"RecipeStat");
               GXutil.writeLogRaw("Old: ",Z12331RecipeStat);
               GXutil.writeLogRaw("Current: ",T01JT2_A12331RecipeStat[0]);
            }
            if ( Z12332ProgramCre != T01JT2_A12332ProgramCre[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ProgramCre");
               GXutil.writeLogRaw("Old: ",Z12332ProgramCre);
               GXutil.writeLogRaw("Current: ",T01JT2_A12332ProgramCre[0]);
            }
            if ( DecimalUtil.compareTo(Z12333LiquorRati, T01JT2_A12333LiquorRati[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"LiquorRati");
               GXutil.writeLogRaw("Old: ",Z12333LiquorRati);
               GXutil.writeLogRaw("Current: ",T01JT2_A12333LiquorRati[0]);
            }
            if ( Z12336Color != T01JT2_A12336Color[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Color");
               GXutil.writeLogRaw("Old: ",Z12336Color);
               GXutil.writeLogRaw("Current: ",T01JT2_A12336Color[0]);
            }
            if ( GXutil.strcmp(Z12347Customer, T01JT2_A12347Customer[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Customer");
               GXutil.writeLogRaw("Old: ",Z12347Customer);
               GXutil.writeLogRaw("Current: ",T01JT2_A12347Customer[0]);
            }
            if ( GXutil.strcmp(Z12348Article, T01JT2_A12348Article[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Article");
               GXutil.writeLogRaw("Old: ",Z12348Article);
               GXutil.writeLogRaw("Current: ",T01JT2_A12348Article[0]);
            }
            if ( GXutil.strcmp(Z12349ColourNo, T01JT2_A12349ColourNo[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ColourNo");
               GXutil.writeLogRaw("Old: ",Z12349ColourNo);
               GXutil.writeLogRaw("Current: ",T01JT2_A12349ColourNo[0]);
            }
            if ( GXutil.strcmp(Z12350ColourDesc, T01JT2_A12350ColourDesc[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ColourDesc");
               GXutil.writeLogRaw("Old: ",Z12350ColourDesc);
               GXutil.writeLogRaw("Current: ",T01JT2_A12350ColourDesc[0]);
            }
            if ( DecimalUtil.compareTo(Z12351Length, T01JT2_A12351Length[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Length");
               GXutil.writeLogRaw("Old: ",Z12351Length);
               GXutil.writeLogRaw("Current: ",T01JT2_A12351Length[0]);
            }
            if ( Z12381State != T01JT2_A12381State[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"State");
               GXutil.writeLogRaw("Old: ",Z12381State);
               GXutil.writeLogRaw("Current: ",T01JT2_A12381State[0]);
            }
            if ( !( GXutil.dateCompare(Z12395StartTime, T01JT2_A12395StartTime[0]) ) )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"StartTime");
               GXutil.writeLogRaw("Old: ",Z12395StartTime);
               GXutil.writeLogRaw("Current: ",T01JT2_A12395StartTime[0]);
            }
            if ( !( GXutil.dateCompare(Z12396EndTime, T01JT2_A12396EndTime[0]) ) )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"EndTime");
               GXutil.writeLogRaw("Old: ",Z12396EndTime);
               GXutil.writeLogRaw("Current: ",T01JT2_A12396EndTime[0]);
            }
            if ( Z12405TypeOfProc != T01JT2_A12405TypeOfProc[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"TypeOfProc");
               GXutil.writeLogRaw("Old: ",Z12405TypeOfProc);
               GXutil.writeLogRaw("Current: ",T01JT2_A12405TypeOfProc[0]);
            }
            if ( Z12406ProcedureN != T01JT2_A12406ProcedureN[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ProcedureN");
               GXutil.writeLogRaw("Old: ",Z12406ProcedureN);
               GXutil.writeLogRaw("Current: ",T01JT2_A12406ProcedureN[0]);
            }
            if ( Z12408ProcessTp1 != T01JT2_A12408ProcessTp1[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ProcessTp1");
               GXutil.writeLogRaw("Old: ",Z12408ProcessTp1);
               GXutil.writeLogRaw("Current: ",T01JT2_A12408ProcessTp1[0]);
            }
            if ( Z12409ProcessTp2 != T01JT2_A12409ProcessTp2[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"ProcessTp2");
               GXutil.writeLogRaw("Old: ",Z12409ProcessTp2);
               GXutil.writeLogRaw("Current: ",T01JT2_A12409ProcessTp2[0]);
            }
            if ( Z12538Paramet5 != T01JT2_A12538Paramet5[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet5");
               GXutil.writeLogRaw("Old: ",Z12538Paramet5);
               GXutil.writeLogRaw("Current: ",T01JT2_A12538Paramet5[0]);
            }
            if ( Z12539Paramet6 != T01JT2_A12539Paramet6[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet6");
               GXutil.writeLogRaw("Old: ",Z12539Paramet6);
               GXutil.writeLogRaw("Current: ",T01JT2_A12539Paramet6[0]);
            }
            if ( DecimalUtil.compareTo(Z12410Paramet7, T01JT2_A12410Paramet7[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet7");
               GXutil.writeLogRaw("Old: ",Z12410Paramet7);
               GXutil.writeLogRaw("Current: ",T01JT2_A12410Paramet7[0]);
            }
            if ( DecimalUtil.compareTo(Z12532Paramet8, T01JT2_A12532Paramet8[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet8");
               GXutil.writeLogRaw("Old: ",Z12532Paramet8);
               GXutil.writeLogRaw("Current: ",T01JT2_A12532Paramet8[0]);
            }
            if ( DecimalUtil.compareTo(Z12533Paramet9, T01JT2_A12533Paramet9[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet9");
               GXutil.writeLogRaw("Old: ",Z12533Paramet9);
               GXutil.writeLogRaw("Current: ",T01JT2_A12533Paramet9[0]);
            }
            if ( DecimalUtil.compareTo(Z12425Paramet10, T01JT2_A12425Paramet10[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet10");
               GXutil.writeLogRaw("Old: ",Z12425Paramet10);
               GXutil.writeLogRaw("Current: ",T01JT2_A12425Paramet10[0]);
            }
            if ( DecimalUtil.compareTo(Z12334Paramet11, T01JT2_A12334Paramet11[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet11");
               GXutil.writeLogRaw("Old: ",Z12334Paramet11);
               GXutil.writeLogRaw("Current: ",T01JT2_A12334Paramet11[0]);
            }
            if ( DecimalUtil.compareTo(Z12411Paramet12, T01JT2_A12411Paramet12[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet12");
               GXutil.writeLogRaw("Old: ",Z12411Paramet12);
               GXutil.writeLogRaw("Current: ",T01JT2_A12411Paramet12[0]);
            }
            if ( DecimalUtil.compareTo(Z12412Paramet13, T01JT2_A12412Paramet13[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet13");
               GXutil.writeLogRaw("Old: ",Z12412Paramet13);
               GXutil.writeLogRaw("Current: ",T01JT2_A12412Paramet13[0]);
            }
            if ( DecimalUtil.compareTo(Z12413Paramet14, T01JT2_A12413Paramet14[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet14");
               GXutil.writeLogRaw("Old: ",Z12413Paramet14);
               GXutil.writeLogRaw("Current: ",T01JT2_A12413Paramet14[0]);
            }
            if ( DecimalUtil.compareTo(Z12414Paramet15, T01JT2_A12414Paramet15[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet15");
               GXutil.writeLogRaw("Old: ",Z12414Paramet15);
               GXutil.writeLogRaw("Current: ",T01JT2_A12414Paramet15[0]);
            }
            if ( DecimalUtil.compareTo(Z12527Paramet16, T01JT2_A12527Paramet16[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet16");
               GXutil.writeLogRaw("Old: ",Z12527Paramet16);
               GXutil.writeLogRaw("Current: ",T01JT2_A12527Paramet16[0]);
            }
            if ( DecimalUtil.compareTo(Z12335Paramet17, T01JT2_A12335Paramet17[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet17");
               GXutil.writeLogRaw("Old: ",Z12335Paramet17);
               GXutil.writeLogRaw("Current: ",T01JT2_A12335Paramet17[0]);
            }
            if ( DecimalUtil.compareTo(Z12415Paramet18, T01JT2_A12415Paramet18[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet18");
               GXutil.writeLogRaw("Old: ",Z12415Paramet18);
               GXutil.writeLogRaw("Current: ",T01JT2_A12415Paramet18[0]);
            }
            if ( DecimalUtil.compareTo(Z12528Paramet19, T01JT2_A12528Paramet19[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet19");
               GXutil.writeLogRaw("Old: ",Z12528Paramet19);
               GXutil.writeLogRaw("Current: ",T01JT2_A12528Paramet19[0]);
            }
            if ( DecimalUtil.compareTo(Z12416Paramet20, T01JT2_A12416Paramet20[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Paramet20");
               GXutil.writeLogRaw("Old: ",Z12416Paramet20);
               GXutil.writeLogRaw("Current: ",T01JT2_A12416Paramet20[0]);
            }
            if ( GXutil.strcmp(Z12417OrderNo, T01JT2_A12417OrderNo[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"OrderNo");
               GXutil.writeLogRaw("Old: ",Z12417OrderNo);
               GXutil.writeLogRaw("Current: ",T01JT2_A12417OrderNo[0]);
            }
            if ( Z12418LiquorQuan != T01JT2_A12418LiquorQuan[0] )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"LiquorQuan");
               GXutil.writeLogRaw("Old: ",Z12418LiquorQuan);
               GXutil.writeLogRaw("Current: ",T01JT2_A12418LiquorQuan[0]);
            }
            if ( GXutil.strcmp(Z12419Text10, T01JT2_A12419Text10[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Text10");
               GXutil.writeLogRaw("Old: ",Z12419Text10);
               GXutil.writeLogRaw("Current: ",T01JT2_A12419Text10[0]);
            }
            if ( GXutil.strcmp(Z12423Text11, T01JT2_A12423Text11[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Text11");
               GXutil.writeLogRaw("Old: ",Z12423Text11);
               GXutil.writeLogRaw("Current: ",T01JT2_A12423Text11[0]);
            }
            if ( GXutil.strcmp(Z12529Text12, T01JT2_A12529Text12[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Text12");
               GXutil.writeLogRaw("Old: ",Z12529Text12);
               GXutil.writeLogRaw("Current: ",T01JT2_A12529Text12[0]);
            }
            if ( GXutil.strcmp(Z12530Text13, T01JT2_A12530Text13[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Text13");
               GXutil.writeLogRaw("Old: ",Z12530Text13);
               GXutil.writeLogRaw("Current: ",T01JT2_A12530Text13[0]);
            }
            if ( GXutil.strcmp(Z12531Text14, T01JT2_A12531Text14[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Text14");
               GXutil.writeLogRaw("Old: ",Z12531Text14);
               GXutil.writeLogRaw("Current: ",T01JT2_A12531Text14[0]);
            }
            if ( GXutil.strcmp(Z12426Note1, T01JT2_A12426Note1[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"Note1");
               GXutil.writeLogRaw("Old: ",Z12426Note1);
               GXutil.writeLogRaw("Current: ",T01JT2_A12426Note1[0]);
            }
            if ( !( GXutil.dateCompare(Z12537RequiredBy, T01JT2_A12537RequiredBy[0]) ) )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"RequiredBy");
               GXutil.writeLogRaw("Old: ",Z12537RequiredBy);
               GXutil.writeLogRaw("Current: ",T01JT2_A12537RequiredBy[0]);
            }
            if ( GXutil.strcmp(Z12324RecipeNo, T01JT2_A12324RecipeNo[0]) != 0 )
            {
               GXutil.writeLogln("tdye001:[seudo value changed for attri]"+"RecipeNo");
               GXutil.writeLogRaw("Old: ",Z12324RecipeNo);
               GXutil.writeLogRaw("Current: ",T01JT2_A12324RecipeNo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDYE001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JT1707( )
   {
      beforeValidate1JT1707( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JT1707( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JT1707( 0) ;
         checkOptimisticConcurrency1JT1707( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JT1707( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JT1707( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JT10 */
                  pr_default.execute(8, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye), A12309Machine, A12310Weight, Short.valueOf(A12311SetTime), Integer.valueOf(A12312ImportStat), Integer.valueOf(A12331RecipeStat), Integer.valueOf(A12332ProgramCre), A12333LiquorRati, Long.valueOf(A12336Color), A12347Customer, A12348Article, A12349ColourNo, A12350ColourDesc, A12351Length, Boolean.valueOf(n12381State), Integer.valueOf(A12381State), Boolean.valueOf(n12395StartTime), A12395StartTime, Boolean.valueOf(n12396EndTime), A12396EndTime, Boolean.valueOf(n12405TypeOfProc), Short.valueOf(A12405TypeOfProc), Boolean.valueOf(n12406ProcedureN), Short.valueOf(A12406ProcedureN), Boolean.valueOf(n12408ProcessTp1), Short.valueOf(A12408ProcessTp1), Boolean.valueOf(n12409ProcessTp2), Short.valueOf(A12409ProcessTp2), Boolean.valueOf(n12538Paramet5), Short.valueOf(A12538Paramet5), Boolean.valueOf(n12539Paramet6), Short.valueOf(A12539Paramet6), Boolean.valueOf(n12410Paramet7), A12410Paramet7, Boolean.valueOf(n12532Paramet8), A12532Paramet8, Boolean.valueOf(n12533Paramet9), A12533Paramet9, Boolean.valueOf(n12425Paramet10), A12425Paramet10, A12334Paramet11, Boolean.valueOf(n12411Paramet12), A12411Paramet12, Boolean.valueOf(n12412Paramet13), A12412Paramet13, Boolean.valueOf(n12413Paramet14), A12413Paramet14, Boolean.valueOf(n12414Paramet15), A12414Paramet15, Boolean.valueOf(n12527Paramet16), A12527Paramet16, A12335Paramet17, Boolean.valueOf(n12415Paramet18), A12415Paramet18, Boolean.valueOf(n12528Paramet19), A12528Paramet19, Boolean.valueOf(n12416Paramet20), A12416Paramet20, Boolean.valueOf(n12417OrderNo), A12417OrderNo, Boolean.valueOf(n12418LiquorQuan), Long.valueOf(A12418LiquorQuan), Boolean.valueOf(n12419Text10), A12419Text10, Boolean.valueOf(n12423Text11), A12423Text11, Boolean.valueOf(n12529Text12), A12529Text12, Boolean.valueOf(n12530Text13), A12530Text13, Boolean.valueOf(n12531Text14), A12531Text14, Boolean.valueOf(n12426Note1), A12426Note1, Boolean.valueOf(n12537RequiredBy), A12537RequiredBy, A12324RecipeNo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE001");
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
                        resetCaption1JT0( ) ;
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
            load1JT1707( ) ;
         }
         endLevel1JT1707( ) ;
      }
      closeExtendedTableCursors1JT1707( ) ;
   }

   public void update1JT1707( )
   {
      beforeValidate1JT1707( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JT1707( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JT1707( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JT1707( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JT1707( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JT11 */
                  pr_default.execute(9, new Object[] {A12309Machine, A12310Weight, Short.valueOf(A12311SetTime), Integer.valueOf(A12312ImportStat), Integer.valueOf(A12331RecipeStat), Integer.valueOf(A12332ProgramCre), A12333LiquorRati, Long.valueOf(A12336Color), A12347Customer, A12348Article, A12349ColourNo, A12350ColourDesc, A12351Length, Boolean.valueOf(n12381State), Integer.valueOf(A12381State), Boolean.valueOf(n12395StartTime), A12395StartTime, Boolean.valueOf(n12396EndTime), A12396EndTime, Boolean.valueOf(n12405TypeOfProc), Short.valueOf(A12405TypeOfProc), Boolean.valueOf(n12406ProcedureN), Short.valueOf(A12406ProcedureN), Boolean.valueOf(n12408ProcessTp1), Short.valueOf(A12408ProcessTp1), Boolean.valueOf(n12409ProcessTp2), Short.valueOf(A12409ProcessTp2), Boolean.valueOf(n12538Paramet5), Short.valueOf(A12538Paramet5), Boolean.valueOf(n12539Paramet6), Short.valueOf(A12539Paramet6), Boolean.valueOf(n12410Paramet7), A12410Paramet7, Boolean.valueOf(n12532Paramet8), A12532Paramet8, Boolean.valueOf(n12533Paramet9), A12533Paramet9, Boolean.valueOf(n12425Paramet10), A12425Paramet10, A12334Paramet11, Boolean.valueOf(n12411Paramet12), A12411Paramet12, Boolean.valueOf(n12412Paramet13), A12412Paramet13, Boolean.valueOf(n12413Paramet14), A12413Paramet14, Boolean.valueOf(n12414Paramet15), A12414Paramet15, Boolean.valueOf(n12527Paramet16), A12527Paramet16, A12335Paramet17, Boolean.valueOf(n12415Paramet18), A12415Paramet18, Boolean.valueOf(n12528Paramet19), A12528Paramet19, Boolean.valueOf(n12416Paramet20), A12416Paramet20, Boolean.valueOf(n12417OrderNo), A12417OrderNo, Boolean.valueOf(n12418LiquorQuan), Long.valueOf(A12418LiquorQuan), Boolean.valueOf(n12419Text10), A12419Text10, Boolean.valueOf(n12423Text11), A12423Text11, Boolean.valueOf(n12529Text12), A12529Text12, Boolean.valueOf(n12530Text13), A12530Text13, Boolean.valueOf(n12531Text14), A12531Text14, Boolean.valueOf(n12426Note1), A12426Note1, Boolean.valueOf(n12537RequiredBy), A12537RequiredBy, A12324RecipeNo, A12313Dyelot, Integer.valueOf(A12314ReDye)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE001");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYE001"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JT1707( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1JT0( ) ;
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
         endLevel1JT1707( ) ;
      }
      closeExtendedTableCursors1JT1707( ) ;
   }

   public void deferredUpdate1JT1707( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JT1707( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JT1707( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JT1707( ) ;
         afterConfirm1JT1707( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JT1707( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JT12 */
               pr_default.execute(10, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYE001");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1707 == 0 )
                     {
                        initAll1JT1707( ) ;
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
                     resetCaption1JT0( ) ;
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
      sMode1707 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JT1707( ) ;
      Gx_mode = sMode1707 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JT1707( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01JT13 */
         pr_default.execute(11, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DYELOT_PROCEDURE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01JT14 */
         pr_default.execute(12, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DYELOT_RECIPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1JT1707( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JT1707( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdye001");
         if ( AnyError == 0 )
         {
            confirmValues1JT0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdye001");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JT1707( )
   {
      /* Using cursor T01JT15 */
      pr_default.execute(13);
      RcdFound1707 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1707 = (short)(1) ;
         A12313Dyelot = T01JT15_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JT15_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JT1707( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1707 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1707 = (short)(1) ;
         A12313Dyelot = T01JT15_A12313Dyelot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
         A12314ReDye = T01JT15_A12314ReDye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
      }
   }

   public void scanEnd1JT1707( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1JT1707( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JT1707( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JT1707( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JT1707( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JT1707( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JT1707( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JT1707( )
   {
      edtDyelot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDyelot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDyelot_Enabled), 5, 0), true);
      edtReDye_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtReDye_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtReDye_Enabled), 5, 0), true);
      edtMachine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMachine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMachine_Enabled), 5, 0), true);
      edtWeight_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtWeight_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtWeight_Enabled), 5, 0), true);
      edtSetTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSetTime_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSetTime_Enabled), 5, 0), true);
      edtImportStat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtImportStat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtImportStat_Enabled), 5, 0), true);
      edtRecipeNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecipeNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecipeNo_Enabled), 5, 0), true);
      edtRecipeStat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecipeStat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecipeStat_Enabled), 5, 0), true);
      edtProgramCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProgramCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProgramCre_Enabled), 5, 0), true);
      edtLiquorRati_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLiquorRati_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLiquorRati_Enabled), 5, 0), true);
      edtColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColor_Enabled), 5, 0), true);
      edtCustomer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCustomer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCustomer_Enabled), 5, 0), true);
      edtArticle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArticle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArticle_Enabled), 5, 0), true);
      edtColourNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColourNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColourNo_Enabled), 5, 0), true);
      edtColourDesc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColourDesc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColourDesc_Enabled), 5, 0), true);
      edtLength_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLength_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLength_Enabled), 5, 0), true);
      edtState_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtState_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtState_Enabled), 5, 0), true);
      edtStartTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtStartTime_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStartTime_Enabled), 5, 0), true);
      edtEndTime_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEndTime_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEndTime_Enabled), 5, 0), true);
      edtTypeOfProc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTypeOfProc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTypeOfProc_Enabled), 5, 0), true);
      edtProcedureN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcedureN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcedureN_Enabled), 5, 0), true);
      edtProcessTp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcessTp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcessTp1_Enabled), 5, 0), true);
      edtProcessTp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcessTp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcessTp2_Enabled), 5, 0), true);
      edtParamet5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet5_Enabled), 5, 0), true);
      edtParamet6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet6_Enabled), 5, 0), true);
      edtParamet7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet7_Enabled), 5, 0), true);
      edtParamet8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet8_Enabled), 5, 0), true);
      edtParamet9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet9_Enabled), 5, 0), true);
      edtParamet10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet10_Enabled), 5, 0), true);
      edtParamet11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet11_Enabled), 5, 0), true);
      edtParamet12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet12_Enabled), 5, 0), true);
      edtParamet13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet13_Enabled), 5, 0), true);
      edtParamet14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet14_Enabled), 5, 0), true);
      edtParamet15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet15_Enabled), 5, 0), true);
      edtParamet16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet16_Enabled), 5, 0), true);
      edtParamet17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet17_Enabled), 5, 0), true);
      edtParamet18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet18_Enabled), 5, 0), true);
      edtParamet19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet19_Enabled), 5, 0), true);
      edtParamet20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParamet20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParamet20_Enabled), 5, 0), true);
      edtOrderNo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrderNo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOrderNo_Enabled), 5, 0), true);
      edtLiquorQuan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLiquorQuan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLiquorQuan_Enabled), 5, 0), true);
      edtText10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtText10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtText10_Enabled), 5, 0), true);
      edtText11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtText11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtText11_Enabled), 5, 0), true);
      edtText12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtText12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtText12_Enabled), 5, 0), true);
      edtText13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtText13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtText13_Enabled), 5, 0), true);
      edtText14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtText14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtText14_Enabled), 5, 0), true);
      edtNote1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNote1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNote1_Enabled), 5, 0), true);
      edtRequiredBy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRequiredBy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRequiredBy_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1JT1707( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1JT0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdye001", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12309Machine", Z12309Machine);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12310Weight", GXutil.ltrim( localUtil.ntoc( Z12310Weight, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12311SetTime", GXutil.ltrim( localUtil.ntoc( Z12311SetTime, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12312ImportStat", GXutil.ltrim( localUtil.ntoc( Z12312ImportStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12331RecipeStat", GXutil.ltrim( localUtil.ntoc( Z12331RecipeStat, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12332ProgramCre", GXutil.ltrim( localUtil.ntoc( Z12332ProgramCre, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12333LiquorRati", GXutil.ltrim( localUtil.ntoc( Z12333LiquorRati, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12336Color", GXutil.ltrim( localUtil.ntoc( Z12336Color, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12347Customer", Z12347Customer);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12348Article", Z12348Article);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12349ColourNo", Z12349ColourNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12350ColourDesc", Z12350ColourDesc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12351Length", GXutil.ltrim( localUtil.ntoc( Z12351Length, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12381State", GXutil.ltrim( localUtil.ntoc( Z12381State, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12395StartTime", localUtil.ttoc( Z12395StartTime, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12396EndTime", localUtil.ttoc( Z12396EndTime, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12405TypeOfProc", GXutil.ltrim( localUtil.ntoc( Z12405TypeOfProc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12406ProcedureN", GXutil.ltrim( localUtil.ntoc( Z12406ProcedureN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12408ProcessTp1", GXutil.ltrim( localUtil.ntoc( Z12408ProcessTp1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12409ProcessTp2", GXutil.ltrim( localUtil.ntoc( Z12409ProcessTp2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12538Paramet5", GXutil.ltrim( localUtil.ntoc( Z12538Paramet5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12539Paramet6", GXutil.ltrim( localUtil.ntoc( Z12539Paramet6, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12410Paramet7", GXutil.ltrim( localUtil.ntoc( Z12410Paramet7, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12532Paramet8", GXutil.ltrim( localUtil.ntoc( Z12532Paramet8, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12533Paramet9", GXutil.ltrim( localUtil.ntoc( Z12533Paramet9, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12425Paramet10", GXutil.ltrim( localUtil.ntoc( Z12425Paramet10, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12334Paramet11", GXutil.ltrim( localUtil.ntoc( Z12334Paramet11, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12411Paramet12", GXutil.ltrim( localUtil.ntoc( Z12411Paramet12, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12412Paramet13", GXutil.ltrim( localUtil.ntoc( Z12412Paramet13, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12413Paramet14", GXutil.ltrim( localUtil.ntoc( Z12413Paramet14, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12414Paramet15", GXutil.ltrim( localUtil.ntoc( Z12414Paramet15, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12527Paramet16", GXutil.ltrim( localUtil.ntoc( Z12527Paramet16, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12335Paramet17", GXutil.ltrim( localUtil.ntoc( Z12335Paramet17, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12415Paramet18", GXutil.ltrim( localUtil.ntoc( Z12415Paramet18, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12528Paramet19", GXutil.ltrim( localUtil.ntoc( Z12528Paramet19, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12416Paramet20", GXutil.ltrim( localUtil.ntoc( Z12416Paramet20, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12417OrderNo", Z12417OrderNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12418LiquorQuan", GXutil.ltrim( localUtil.ntoc( Z12418LiquorQuan, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12419Text10", Z12419Text10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12423Text11", Z12423Text11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12529Text12", Z12529Text12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12530Text13", Z12530Text13);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12531Text14", Z12531Text14);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12426Note1", Z12426Note1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12537RequiredBy", localUtil.ttoc( Z12537RequiredBy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12324RecipeNo", Z12324RecipeNo);
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
      return formatLink("app.tdye001", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDYE001" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DYELOTS", "") ;
   }

   public void initializeNonKey1JT1707( )
   {
      A12309Machine = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12309Machine", A12309Machine);
      A12310Weight = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrimstr( A12310Weight, 10, 2));
      A12311SetTime = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12311SetTime), 4, 0));
      A12312ImportStat = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12312ImportStat), 5, 0));
      A12324RecipeNo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
      A12331RecipeStat = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12331RecipeStat), 5, 0));
      A12332ProgramCre = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12332ProgramCre), 5, 0));
      A12333LiquorRati = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrimstr( A12333LiquorRati, 10, 2));
      A12336Color = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12336Color), 10, 0));
      A12347Customer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12347Customer", A12347Customer);
      A12348Article = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12348Article", A12348Article);
      A12349ColourNo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12349ColourNo", A12349ColourNo);
      A12350ColourDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12350ColourDesc", A12350ColourDesc);
      A12351Length = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrimstr( A12351Length, 10, 2));
      A12381State = 0 ;
      n12381State = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12381State), 5, 0));
      A12395StartTime = GXutil.resetTime( GXutil.nullDate() );
      n12395StartTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      n12396EndTime = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12405TypeOfProc = (short)(0) ;
      n12405TypeOfProc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12405TypeOfProc), 4, 0));
      A12406ProcedureN = (short)(0) ;
      n12406ProcedureN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12406ProcedureN), 4, 0));
      A12408ProcessTp1 = (short)(0) ;
      n12408ProcessTp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12408ProcessTp1), 4, 0));
      A12409ProcessTp2 = (short)(0) ;
      n12409ProcessTp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12409ProcessTp2), 4, 0));
      A12538Paramet5 = (short)(0) ;
      n12538Paramet5 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12538Paramet5), 4, 0));
      A12539Paramet6 = (short)(0) ;
      n12539Paramet6 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12539Paramet6), 4, 0));
      A12410Paramet7 = DecimalUtil.ZERO ;
      n12410Paramet7 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrimstr( A12410Paramet7, 10, 2));
      A12532Paramet8 = DecimalUtil.ZERO ;
      n12532Paramet8 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrimstr( A12532Paramet8, 10, 2));
      A12533Paramet9 = DecimalUtil.ZERO ;
      n12533Paramet9 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrimstr( A12533Paramet9, 10, 2));
      A12425Paramet10 = DecimalUtil.ZERO ;
      n12425Paramet10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrimstr( A12425Paramet10, 10, 2));
      A12334Paramet11 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrimstr( A12334Paramet11, 10, 2));
      A12411Paramet12 = DecimalUtil.ZERO ;
      n12411Paramet12 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrimstr( A12411Paramet12, 10, 2));
      A12412Paramet13 = DecimalUtil.ZERO ;
      n12412Paramet13 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrimstr( A12412Paramet13, 10, 2));
      A12413Paramet14 = DecimalUtil.ZERO ;
      n12413Paramet14 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrimstr( A12413Paramet14, 10, 2));
      A12414Paramet15 = DecimalUtil.ZERO ;
      n12414Paramet15 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrimstr( A12414Paramet15, 10, 2));
      A12527Paramet16 = DecimalUtil.ZERO ;
      n12527Paramet16 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrimstr( A12527Paramet16, 10, 2));
      A12335Paramet17 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrimstr( A12335Paramet17, 10, 2));
      A12415Paramet18 = DecimalUtil.ZERO ;
      n12415Paramet18 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrimstr( A12415Paramet18, 10, 2));
      A12528Paramet19 = DecimalUtil.ZERO ;
      n12528Paramet19 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrimstr( A12528Paramet19, 10, 2));
      A12416Paramet20 = DecimalUtil.ZERO ;
      n12416Paramet20 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrimstr( A12416Paramet20, 10, 2));
      A12417OrderNo = "" ;
      n12417OrderNo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12417OrderNo", A12417OrderNo);
      A12418LiquorQuan = 0 ;
      n12418LiquorQuan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12418LiquorQuan), 10, 0));
      A12419Text10 = "" ;
      n12419Text10 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12419Text10", A12419Text10);
      A12423Text11 = "" ;
      n12423Text11 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12423Text11", A12423Text11);
      A12529Text12 = "" ;
      n12529Text12 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12529Text12", A12529Text12);
      A12530Text13 = "" ;
      n12530Text13 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12530Text13", A12530Text13);
      A12531Text14 = "" ;
      n12531Text14 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12531Text14", A12531Text14);
      A12426Note1 = "" ;
      n12426Note1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12426Note1", A12426Note1);
      A12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
      n12537RequiredBy = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z12309Machine = "" ;
      Z12310Weight = DecimalUtil.ZERO ;
      Z12311SetTime = (short)(0) ;
      Z12312ImportStat = 0 ;
      Z12331RecipeStat = 0 ;
      Z12332ProgramCre = 0 ;
      Z12333LiquorRati = DecimalUtil.ZERO ;
      Z12336Color = 0 ;
      Z12347Customer = "" ;
      Z12348Article = "" ;
      Z12349ColourNo = "" ;
      Z12350ColourDesc = "" ;
      Z12351Length = DecimalUtil.ZERO ;
      Z12381State = 0 ;
      Z12395StartTime = GXutil.resetTime( GXutil.nullDate() );
      Z12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      Z12405TypeOfProc = (short)(0) ;
      Z12406ProcedureN = (short)(0) ;
      Z12408ProcessTp1 = (short)(0) ;
      Z12409ProcessTp2 = (short)(0) ;
      Z12538Paramet5 = (short)(0) ;
      Z12539Paramet6 = (short)(0) ;
      Z12410Paramet7 = DecimalUtil.ZERO ;
      Z12532Paramet8 = DecimalUtil.ZERO ;
      Z12533Paramet9 = DecimalUtil.ZERO ;
      Z12425Paramet10 = DecimalUtil.ZERO ;
      Z12334Paramet11 = DecimalUtil.ZERO ;
      Z12411Paramet12 = DecimalUtil.ZERO ;
      Z12412Paramet13 = DecimalUtil.ZERO ;
      Z12413Paramet14 = DecimalUtil.ZERO ;
      Z12414Paramet15 = DecimalUtil.ZERO ;
      Z12527Paramet16 = DecimalUtil.ZERO ;
      Z12335Paramet17 = DecimalUtil.ZERO ;
      Z12415Paramet18 = DecimalUtil.ZERO ;
      Z12528Paramet19 = DecimalUtil.ZERO ;
      Z12416Paramet20 = DecimalUtil.ZERO ;
      Z12417OrderNo = "" ;
      Z12418LiquorQuan = 0 ;
      Z12419Text10 = "" ;
      Z12423Text11 = "" ;
      Z12529Text12 = "" ;
      Z12530Text13 = "" ;
      Z12531Text14 = "" ;
      Z12426Note1 = "" ;
      Z12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
      Z12324RecipeNo = "" ;
   }

   public void initAll1JT1707( )
   {
      A12313Dyelot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12313Dyelot", A12313Dyelot);
      A12314ReDye = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12314ReDye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12314ReDye), 5, 0));
      initializeNonKey1JT1707( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016331799", true, true);
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
      httpContext.AddJavascriptSource("tdye001.js", "?202661016331799", false, true);
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMachine_Internalname = "MACHINE" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtWeight_Internalname = "WEIGHT" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtSetTime_Internalname = "SETTIME" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtImportStat_Internalname = "IMPORTSTAT" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRecipeNo_Internalname = "RECIPENO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtRecipeStat_Internalname = "RECIPESTAT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtProgramCre_Internalname = "PROGRAMCRE" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtLiquorRati_Internalname = "LIQUORRATI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtColor_Internalname = "COLOR" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtCustomer_Internalname = "CUSTOMER" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtArticle_Internalname = "ARTICLE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtColourNo_Internalname = "COLOURNO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtColourDesc_Internalname = "COLOURDESC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtLength_Internalname = "LENGTH" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtState_Internalname = "STATE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtStartTime_Internalname = "STARTTIME" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtEndTime_Internalname = "ENDTIME" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtTypeOfProc_Internalname = "TYPEOFPROC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtProcedureN_Internalname = "PROCEDUREN" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtProcessTp1_Internalname = "PROCESSTP1" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtProcessTp2_Internalname = "PROCESSTP2" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtParamet5_Internalname = "PARAMET5" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtParamet6_Internalname = "PARAMET6" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtParamet7_Internalname = "PARAMET7" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtParamet8_Internalname = "PARAMET8" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtParamet9_Internalname = "PARAMET9" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtParamet10_Internalname = "PARAMET10" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtParamet11_Internalname = "PARAMET11" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtParamet12_Internalname = "PARAMET12" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtParamet13_Internalname = "PARAMET13" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtParamet14_Internalname = "PARAMET14" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtParamet15_Internalname = "PARAMET15" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtParamet16_Internalname = "PARAMET16" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtParamet17_Internalname = "PARAMET17" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtParamet18_Internalname = "PARAMET18" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtParamet19_Internalname = "PARAMET19" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtParamet20_Internalname = "PARAMET20" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtOrderNo_Internalname = "ORDERNO" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtLiquorQuan_Internalname = "LIQUORQUAN" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtText10_Internalname = "TEXT10" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtText11_Internalname = "TEXT11" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtText12_Internalname = "TEXT12" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtText13_Internalname = "TEXT13" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtText14_Internalname = "TEXT14" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtNote1_Internalname = "NOTE1" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtRequiredBy_Internalname = "REQUIREDBY" ;
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
      Form.setCaption( httpContext.getMessage( "DYELOTS", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRequiredBy_Jsonclick = "" ;
      edtRequiredBy_Backcolor = (int)(0xFFFFFF) ;
      edtRequiredBy_Enabled = 1 ;
      edtNote1_Jsonclick = "" ;
      edtNote1_Backcolor = (int)(0xFFFFFF) ;
      edtNote1_Enabled = 1 ;
      edtText14_Jsonclick = "" ;
      edtText14_Backcolor = (int)(0xFFFFFF) ;
      edtText14_Enabled = 1 ;
      edtText13_Jsonclick = "" ;
      edtText13_Backcolor = (int)(0xFFFFFF) ;
      edtText13_Enabled = 1 ;
      edtText12_Jsonclick = "" ;
      edtText12_Backcolor = (int)(0xFFFFFF) ;
      edtText12_Enabled = 1 ;
      edtText11_Jsonclick = "" ;
      edtText11_Backcolor = (int)(0xFFFFFF) ;
      edtText11_Enabled = 1 ;
      edtText10_Jsonclick = "" ;
      edtText10_Backcolor = (int)(0xFFFFFF) ;
      edtText10_Enabled = 1 ;
      edtLiquorQuan_Jsonclick = "" ;
      edtLiquorQuan_Backcolor = (int)(0xFFFFFF) ;
      edtLiquorQuan_Enabled = 1 ;
      edtOrderNo_Jsonclick = "" ;
      edtOrderNo_Backcolor = (int)(0xFFFFFF) ;
      edtOrderNo_Enabled = 1 ;
      edtParamet20_Jsonclick = "" ;
      edtParamet20_Backcolor = (int)(0xFFFFFF) ;
      edtParamet20_Enabled = 1 ;
      edtParamet19_Jsonclick = "" ;
      edtParamet19_Backcolor = (int)(0xFFFFFF) ;
      edtParamet19_Enabled = 1 ;
      edtParamet18_Jsonclick = "" ;
      edtParamet18_Backcolor = (int)(0xFFFFFF) ;
      edtParamet18_Enabled = 1 ;
      edtParamet17_Jsonclick = "" ;
      edtParamet17_Backcolor = (int)(0xFFFFFF) ;
      edtParamet17_Enabled = 1 ;
      edtParamet16_Jsonclick = "" ;
      edtParamet16_Backcolor = (int)(0xFFFFFF) ;
      edtParamet16_Enabled = 1 ;
      edtParamet15_Jsonclick = "" ;
      edtParamet15_Backcolor = (int)(0xFFFFFF) ;
      edtParamet15_Enabled = 1 ;
      edtParamet14_Jsonclick = "" ;
      edtParamet14_Backcolor = (int)(0xFFFFFF) ;
      edtParamet14_Enabled = 1 ;
      edtParamet13_Jsonclick = "" ;
      edtParamet13_Backcolor = (int)(0xFFFFFF) ;
      edtParamet13_Enabled = 1 ;
      edtParamet12_Jsonclick = "" ;
      edtParamet12_Backcolor = (int)(0xFFFFFF) ;
      edtParamet12_Enabled = 1 ;
      edtParamet11_Jsonclick = "" ;
      edtParamet11_Backcolor = (int)(0xFFFFFF) ;
      edtParamet11_Enabled = 1 ;
      edtParamet10_Jsonclick = "" ;
      edtParamet10_Backcolor = (int)(0xFFFFFF) ;
      edtParamet10_Enabled = 1 ;
      edtParamet9_Jsonclick = "" ;
      edtParamet9_Backcolor = (int)(0xFFFFFF) ;
      edtParamet9_Enabled = 1 ;
      edtParamet8_Jsonclick = "" ;
      edtParamet8_Backcolor = (int)(0xFFFFFF) ;
      edtParamet8_Enabled = 1 ;
      edtParamet7_Jsonclick = "" ;
      edtParamet7_Backcolor = (int)(0xFFFFFF) ;
      edtParamet7_Enabled = 1 ;
      edtParamet6_Jsonclick = "" ;
      edtParamet6_Backcolor = (int)(0xFFFFFF) ;
      edtParamet6_Enabled = 1 ;
      edtParamet5_Jsonclick = "" ;
      edtParamet5_Backcolor = (int)(0xFFFFFF) ;
      edtParamet5_Enabled = 1 ;
      edtProcessTp2_Jsonclick = "" ;
      edtProcessTp2_Backcolor = (int)(0xFFFFFF) ;
      edtProcessTp2_Enabled = 1 ;
      edtProcessTp1_Jsonclick = "" ;
      edtProcessTp1_Backcolor = (int)(0xFFFFFF) ;
      edtProcessTp1_Enabled = 1 ;
      edtProcedureN_Jsonclick = "" ;
      edtProcedureN_Backcolor = (int)(0xFFFFFF) ;
      edtProcedureN_Enabled = 1 ;
      edtTypeOfProc_Jsonclick = "" ;
      edtTypeOfProc_Backcolor = (int)(0xFFFFFF) ;
      edtTypeOfProc_Enabled = 1 ;
      edtEndTime_Jsonclick = "" ;
      edtEndTime_Backcolor = (int)(0xFFFFFF) ;
      edtEndTime_Enabled = 1 ;
      edtStartTime_Jsonclick = "" ;
      edtStartTime_Backcolor = (int)(0xFFFFFF) ;
      edtStartTime_Enabled = 1 ;
      edtState_Jsonclick = "" ;
      edtState_Backcolor = (int)(0xFFFFFF) ;
      edtState_Enabled = 1 ;
      edtLength_Jsonclick = "" ;
      edtLength_Backcolor = (int)(0xFFFFFF) ;
      edtLength_Enabled = 1 ;
      edtColourDesc_Jsonclick = "" ;
      edtColourDesc_Backcolor = (int)(0xFFFFFF) ;
      edtColourDesc_Enabled = 1 ;
      edtColourNo_Jsonclick = "" ;
      edtColourNo_Backcolor = (int)(0xFFFFFF) ;
      edtColourNo_Enabled = 1 ;
      edtArticle_Jsonclick = "" ;
      edtArticle_Backcolor = (int)(0xFFFFFF) ;
      edtArticle_Enabled = 1 ;
      edtCustomer_Jsonclick = "" ;
      edtCustomer_Backcolor = (int)(0xFFFFFF) ;
      edtCustomer_Enabled = 1 ;
      edtColor_Jsonclick = "" ;
      edtColor_Backcolor = (int)(0xFFFFFF) ;
      edtColor_Enabled = 1 ;
      edtLiquorRati_Jsonclick = "" ;
      edtLiquorRati_Backcolor = (int)(0xFFFFFF) ;
      edtLiquorRati_Enabled = 1 ;
      edtProgramCre_Jsonclick = "" ;
      edtProgramCre_Backcolor = (int)(0xFFFFFF) ;
      edtProgramCre_Enabled = 1 ;
      edtRecipeStat_Jsonclick = "" ;
      edtRecipeStat_Backcolor = (int)(0xFFFFFF) ;
      edtRecipeStat_Enabled = 1 ;
      edtRecipeNo_Jsonclick = "" ;
      edtRecipeNo_Backcolor = (int)(0xFFFFFF) ;
      edtRecipeNo_Enabled = 1 ;
      edtImportStat_Jsonclick = "" ;
      edtImportStat_Backcolor = (int)(0xFFFFFF) ;
      edtImportStat_Enabled = 1 ;
      edtSetTime_Jsonclick = "" ;
      edtSetTime_Backcolor = (int)(0xFFFFFF) ;
      edtSetTime_Enabled = 1 ;
      edtWeight_Jsonclick = "" ;
      edtWeight_Backcolor = (int)(0xFFFFFF) ;
      edtWeight_Enabled = 1 ;
      edtMachine_Jsonclick = "" ;
      edtMachine_Backcolor = (int)(0xFFFFFF) ;
      edtMachine_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      GX_FocusControl = edtMachine_Internalname ;
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
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12309Machine", A12309Machine);
      httpContext.ajax_rsp_assign_attri("", false, "A12310Weight", GXutil.ltrim( localUtil.ntoc( A12310Weight, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12311SetTime", GXutil.ltrim( localUtil.ntoc( A12311SetTime, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12312ImportStat", GXutil.ltrim( localUtil.ntoc( A12312ImportStat, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12324RecipeNo", A12324RecipeNo);
      httpContext.ajax_rsp_assign_attri("", false, "A12331RecipeStat", GXutil.ltrim( localUtil.ntoc( A12331RecipeStat, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12332ProgramCre", GXutil.ltrim( localUtil.ntoc( A12332ProgramCre, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12333LiquorRati", GXutil.ltrim( localUtil.ntoc( A12333LiquorRati, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12336Color", GXutil.ltrim( localUtil.ntoc( A12336Color, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12347Customer", A12347Customer);
      httpContext.ajax_rsp_assign_attri("", false, "A12348Article", A12348Article);
      httpContext.ajax_rsp_assign_attri("", false, "A12349ColourNo", A12349ColourNo);
      httpContext.ajax_rsp_assign_attri("", false, "A12350ColourDesc", A12350ColourDesc);
      httpContext.ajax_rsp_assign_attri("", false, "A12351Length", GXutil.ltrim( localUtil.ntoc( A12351Length, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12381State", GXutil.ltrim( localUtil.ntoc( A12381State, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12395StartTime", localUtil.ttoc( A12395StartTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12396EndTime", localUtil.ttoc( A12396EndTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12405TypeOfProc", GXutil.ltrim( localUtil.ntoc( A12405TypeOfProc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12406ProcedureN", GXutil.ltrim( localUtil.ntoc( A12406ProcedureN, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12408ProcessTp1", GXutil.ltrim( localUtil.ntoc( A12408ProcessTp1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12409ProcessTp2", GXutil.ltrim( localUtil.ntoc( A12409ProcessTp2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12538Paramet5", GXutil.ltrim( localUtil.ntoc( A12538Paramet5, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12539Paramet6", GXutil.ltrim( localUtil.ntoc( A12539Paramet6, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12410Paramet7", GXutil.ltrim( localUtil.ntoc( A12410Paramet7, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12532Paramet8", GXutil.ltrim( localUtil.ntoc( A12532Paramet8, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12533Paramet9", GXutil.ltrim( localUtil.ntoc( A12533Paramet9, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12425Paramet10", GXutil.ltrim( localUtil.ntoc( A12425Paramet10, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12334Paramet11", GXutil.ltrim( localUtil.ntoc( A12334Paramet11, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12411Paramet12", GXutil.ltrim( localUtil.ntoc( A12411Paramet12, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12412Paramet13", GXutil.ltrim( localUtil.ntoc( A12412Paramet13, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12413Paramet14", GXutil.ltrim( localUtil.ntoc( A12413Paramet14, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12414Paramet15", GXutil.ltrim( localUtil.ntoc( A12414Paramet15, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12527Paramet16", GXutil.ltrim( localUtil.ntoc( A12527Paramet16, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12335Paramet17", GXutil.ltrim( localUtil.ntoc( A12335Paramet17, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12415Paramet18", GXutil.ltrim( localUtil.ntoc( A12415Paramet18, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12528Paramet19", GXutil.ltrim( localUtil.ntoc( A12528Paramet19, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12416Paramet20", GXutil.ltrim( localUtil.ntoc( A12416Paramet20, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12417OrderNo", A12417OrderNo);
      httpContext.ajax_rsp_assign_attri("", false, "A12418LiquorQuan", GXutil.ltrim( localUtil.ntoc( A12418LiquorQuan, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12419Text10", A12419Text10);
      httpContext.ajax_rsp_assign_attri("", false, "A12423Text11", A12423Text11);
      httpContext.ajax_rsp_assign_attri("", false, "A12529Text12", A12529Text12);
      httpContext.ajax_rsp_assign_attri("", false, "A12530Text13", A12530Text13);
      httpContext.ajax_rsp_assign_attri("", false, "A12531Text14", A12531Text14);
      httpContext.ajax_rsp_assign_attri("", false, "A12426Note1", A12426Note1);
      httpContext.ajax_rsp_assign_attri("", false, "A12537RequiredBy", localUtil.ttoc( A12537RequiredBy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12313Dyelot", Z12313Dyelot);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12314ReDye", GXutil.ltrim( localUtil.ntoc( Z12314ReDye, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12309Machine", Z12309Machine);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12310Weight", GXutil.ltrim( localUtil.ntoc( Z12310Weight, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12311SetTime", GXutil.ltrim( localUtil.ntoc( Z12311SetTime, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12312ImportStat", GXutil.ltrim( localUtil.ntoc( Z12312ImportStat, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12324RecipeNo", Z12324RecipeNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12331RecipeStat", GXutil.ltrim( localUtil.ntoc( Z12331RecipeStat, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12332ProgramCre", GXutil.ltrim( localUtil.ntoc( Z12332ProgramCre, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12333LiquorRati", GXutil.ltrim( localUtil.ntoc( Z12333LiquorRati, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12336Color", GXutil.ltrim( localUtil.ntoc( Z12336Color, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12347Customer", Z12347Customer);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12348Article", Z12348Article);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12349ColourNo", Z12349ColourNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12350ColourDesc", Z12350ColourDesc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12351Length", GXutil.ltrim( localUtil.ntoc( Z12351Length, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12381State", GXutil.ltrim( localUtil.ntoc( Z12381State, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12395StartTime", localUtil.ttoc( Z12395StartTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12396EndTime", localUtil.ttoc( Z12396EndTime, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12405TypeOfProc", GXutil.ltrim( localUtil.ntoc( Z12405TypeOfProc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12406ProcedureN", GXutil.ltrim( localUtil.ntoc( Z12406ProcedureN, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12408ProcessTp1", GXutil.ltrim( localUtil.ntoc( Z12408ProcessTp1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12409ProcessTp2", GXutil.ltrim( localUtil.ntoc( Z12409ProcessTp2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12538Paramet5", GXutil.ltrim( localUtil.ntoc( Z12538Paramet5, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12539Paramet6", GXutil.ltrim( localUtil.ntoc( Z12539Paramet6, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12410Paramet7", GXutil.ltrim( localUtil.ntoc( Z12410Paramet7, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12532Paramet8", GXutil.ltrim( localUtil.ntoc( Z12532Paramet8, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12533Paramet9", GXutil.ltrim( localUtil.ntoc( Z12533Paramet9, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12425Paramet10", GXutil.ltrim( localUtil.ntoc( Z12425Paramet10, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12334Paramet11", GXutil.ltrim( localUtil.ntoc( Z12334Paramet11, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12411Paramet12", GXutil.ltrim( localUtil.ntoc( Z12411Paramet12, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12412Paramet13", GXutil.ltrim( localUtil.ntoc( Z12412Paramet13, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12413Paramet14", GXutil.ltrim( localUtil.ntoc( Z12413Paramet14, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12414Paramet15", GXutil.ltrim( localUtil.ntoc( Z12414Paramet15, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12527Paramet16", GXutil.ltrim( localUtil.ntoc( Z12527Paramet16, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12335Paramet17", GXutil.ltrim( localUtil.ntoc( Z12335Paramet17, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12415Paramet18", GXutil.ltrim( localUtil.ntoc( Z12415Paramet18, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12528Paramet19", GXutil.ltrim( localUtil.ntoc( Z12528Paramet19, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12416Paramet20", GXutil.ltrim( localUtil.ntoc( Z12416Paramet20, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12417OrderNo", Z12417OrderNo);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12418LiquorQuan", GXutil.ltrim( localUtil.ntoc( Z12418LiquorQuan, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12419Text10", Z12419Text10);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12423Text11", Z12423Text11);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12529Text12", Z12529Text12);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12530Text13", Z12530Text13);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12531Text14", Z12531Text14);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12426Note1", Z12426Note1);
      app.GxWebStd.gx_hidden_field( httpContext, "Z12537RequiredBy", localUtil.ttoc( Z12537RequiredBy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Recipeno( )
   {
      /* Using cursor T01JT16 */
      pr_default.execute(14, new Object[] {A12324RecipeNo});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECIPES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECIPENO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecipeNo_Internalname ;
      }
      pr_default.close(14);
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
      setEventMetadata("VALID_DYELOT","{handler:'valid_Dyelot',iparms:[]");
      setEventMetadata("VALID_DYELOT",",oparms:[]}");
      setEventMetadata("VALID_REDYE","{handler:'valid_Redye',iparms:[{av:'A12313Dyelot',fld:'DYELOT',pic:''},{av:'A12314ReDye',fld:'REDYE',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_REDYE",",oparms:[{av:'A12309Machine',fld:'MACHINE',pic:''},{av:'A12310Weight',fld:'WEIGHT',pic:'ZZZZZZ9.99'},{av:'A12311SetTime',fld:'SETTIME',pic:'ZZZ9'},{av:'A12312ImportStat',fld:'IMPORTSTAT',pic:'ZZZZ9'},{av:'A12324RecipeNo',fld:'RECIPENO',pic:''},{av:'A12331RecipeStat',fld:'RECIPESTAT',pic:'ZZZZ9'},{av:'A12332ProgramCre',fld:'PROGRAMCRE',pic:'ZZZZ9'},{av:'A12333LiquorRati',fld:'LIQUORRATI',pic:'ZZZZZZ9.99'},{av:'A12336Color',fld:'COLOR',pic:'ZZZZZZZZZ9'},{av:'A12347Customer',fld:'CUSTOMER',pic:''},{av:'A12348Article',fld:'ARTICLE',pic:''},{av:'A12349ColourNo',fld:'COLOURNO',pic:''},{av:'A12350ColourDesc',fld:'COLOURDESC',pic:''},{av:'A12351Length',fld:'LENGTH',pic:'ZZZZZZ9.99'},{av:'A12381State',fld:'STATE',pic:'ZZZZ9'},{av:'A12395StartTime',fld:'STARTTIME',pic:'99/99/99 99:99'},{av:'A12396EndTime',fld:'ENDTIME',pic:'99/99/99 99:99'},{av:'A12405TypeOfProc',fld:'TYPEOFPROC',pic:'ZZZ9'},{av:'A12406ProcedureN',fld:'PROCEDUREN',pic:'ZZZ9'},{av:'A12408ProcessTp1',fld:'PROCESSTP1',pic:'ZZZ9'},{av:'A12409ProcessTp2',fld:'PROCESSTP2',pic:'ZZZ9'},{av:'A12538Paramet5',fld:'PARAMET5',pic:'ZZZ9'},{av:'A12539Paramet6',fld:'PARAMET6',pic:'ZZZ9'},{av:'A12410Paramet7',fld:'PARAMET7',pic:'ZZZZZZ9.99'},{av:'A12532Paramet8',fld:'PARAMET8',pic:'ZZZZZZ9.99'},{av:'A12533Paramet9',fld:'PARAMET9',pic:'ZZZZZZ9.99'},{av:'A12425Paramet10',fld:'PARAMET10',pic:'ZZZZZZ9.99'},{av:'A12334Paramet11',fld:'PARAMET11',pic:'ZZZZZZ9.99'},{av:'A12411Paramet12',fld:'PARAMET12',pic:'ZZZZZZ9.99'},{av:'A12412Paramet13',fld:'PARAMET13',pic:'ZZZZZZ9.99'},{av:'A12413Paramet14',fld:'PARAMET14',pic:'ZZZZZZ9.99'},{av:'A12414Paramet15',fld:'PARAMET15',pic:'ZZZZZZ9.99'},{av:'A12527Paramet16',fld:'PARAMET16',pic:'ZZZZZZ9.99'},{av:'A12335Paramet17',fld:'PARAMET17',pic:'ZZZZZZ9.99'},{av:'A12415Paramet18',fld:'PARAMET18',pic:'ZZZZZZ9.99'},{av:'A12528Paramet19',fld:'PARAMET19',pic:'ZZZZZZ9.99'},{av:'A12416Paramet20',fld:'PARAMET20',pic:'ZZZZZZ9.99'},{av:'A12417OrderNo',fld:'ORDERNO',pic:''},{av:'A12418LiquorQuan',fld:'LIQUORQUAN',pic:'ZZZZZZZZZ9'},{av:'A12419Text10',fld:'TEXT10',pic:''},{av:'A12423Text11',fld:'TEXT11',pic:''},{av:'A12529Text12',fld:'TEXT12',pic:''},{av:'A12530Text13',fld:'TEXT13',pic:''},{av:'A12531Text14',fld:'TEXT14',pic:''},{av:'A12426Note1',fld:'NOTE1',pic:''},{av:'A12537RequiredBy',fld:'REQUIREDBY',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12313Dyelot'},{av:'Z12314ReDye'},{av:'Z12309Machine'},{av:'Z12310Weight'},{av:'Z12311SetTime'},{av:'Z12312ImportStat'},{av:'Z12324RecipeNo'},{av:'Z12331RecipeStat'},{av:'Z12332ProgramCre'},{av:'Z12333LiquorRati'},{av:'Z12336Color'},{av:'Z12347Customer'},{av:'Z12348Article'},{av:'Z12349ColourNo'},{av:'Z12350ColourDesc'},{av:'Z12351Length'},{av:'Z12381State'},{av:'Z12395StartTime'},{av:'Z12396EndTime'},{av:'Z12405TypeOfProc'},{av:'Z12406ProcedureN'},{av:'Z12408ProcessTp1'},{av:'Z12409ProcessTp2'},{av:'Z12538Paramet5'},{av:'Z12539Paramet6'},{av:'Z12410Paramet7'},{av:'Z12532Paramet8'},{av:'Z12533Paramet9'},{av:'Z12425Paramet10'},{av:'Z12334Paramet11'},{av:'Z12411Paramet12'},{av:'Z12412Paramet13'},{av:'Z12413Paramet14'},{av:'Z12414Paramet15'},{av:'Z12527Paramet16'},{av:'Z12335Paramet17'},{av:'Z12415Paramet18'},{av:'Z12528Paramet19'},{av:'Z12416Paramet20'},{av:'Z12417OrderNo'},{av:'Z12418LiquorQuan'},{av:'Z12419Text10'},{av:'Z12423Text11'},{av:'Z12529Text12'},{av:'Z12530Text13'},{av:'Z12531Text14'},{av:'Z12426Note1'},{av:'Z12537RequiredBy'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECIPENO","{handler:'valid_Recipeno',iparms:[{av:'A12324RecipeNo',fld:'RECIPENO',pic:''}]");
      setEventMetadata("VALID_RECIPENO",",oparms:[]}");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z12313Dyelot = "" ;
      Z12309Machine = "" ;
      Z12310Weight = DecimalUtil.ZERO ;
      Z12333LiquorRati = DecimalUtil.ZERO ;
      Z12347Customer = "" ;
      Z12348Article = "" ;
      Z12349ColourNo = "" ;
      Z12350ColourDesc = "" ;
      Z12351Length = DecimalUtil.ZERO ;
      Z12395StartTime = GXutil.resetTime( GXutil.nullDate() );
      Z12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      Z12410Paramet7 = DecimalUtil.ZERO ;
      Z12532Paramet8 = DecimalUtil.ZERO ;
      Z12533Paramet9 = DecimalUtil.ZERO ;
      Z12425Paramet10 = DecimalUtil.ZERO ;
      Z12334Paramet11 = DecimalUtil.ZERO ;
      Z12411Paramet12 = DecimalUtil.ZERO ;
      Z12412Paramet13 = DecimalUtil.ZERO ;
      Z12413Paramet14 = DecimalUtil.ZERO ;
      Z12414Paramet15 = DecimalUtil.ZERO ;
      Z12527Paramet16 = DecimalUtil.ZERO ;
      Z12335Paramet17 = DecimalUtil.ZERO ;
      Z12415Paramet18 = DecimalUtil.ZERO ;
      Z12528Paramet19 = DecimalUtil.ZERO ;
      Z12416Paramet20 = DecimalUtil.ZERO ;
      Z12417OrderNo = "" ;
      Z12419Text10 = "" ;
      Z12423Text11 = "" ;
      Z12529Text12 = "" ;
      Z12530Text13 = "" ;
      Z12531Text14 = "" ;
      Z12426Note1 = "" ;
      Z12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
      Z12324RecipeNo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A12324RecipeNo = "" ;
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
      A12313Dyelot = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12309Machine = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12310Weight = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12333LiquorRati = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12347Customer = "" ;
      lblTextblock13_Jsonclick = "" ;
      A12348Article = "" ;
      lblTextblock14_Jsonclick = "" ;
      A12349ColourNo = "" ;
      lblTextblock15_Jsonclick = "" ;
      A12350ColourDesc = "" ;
      lblTextblock16_Jsonclick = "" ;
      A12351Length = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12395StartTime = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock19_Jsonclick = "" ;
      A12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A12410Paramet7 = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A12532Paramet8 = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      A12533Paramet9 = DecimalUtil.ZERO ;
      lblTextblock29_Jsonclick = "" ;
      A12425Paramet10 = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      A12334Paramet11 = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      A12411Paramet12 = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A12412Paramet13 = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A12413Paramet14 = DecimalUtil.ZERO ;
      lblTextblock34_Jsonclick = "" ;
      A12414Paramet15 = DecimalUtil.ZERO ;
      lblTextblock35_Jsonclick = "" ;
      A12527Paramet16 = DecimalUtil.ZERO ;
      lblTextblock36_Jsonclick = "" ;
      A12335Paramet17 = DecimalUtil.ZERO ;
      lblTextblock37_Jsonclick = "" ;
      A12415Paramet18 = DecimalUtil.ZERO ;
      lblTextblock38_Jsonclick = "" ;
      A12528Paramet19 = DecimalUtil.ZERO ;
      lblTextblock39_Jsonclick = "" ;
      A12416Paramet20 = DecimalUtil.ZERO ;
      lblTextblock40_Jsonclick = "" ;
      A12417OrderNo = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      A12419Text10 = "" ;
      lblTextblock43_Jsonclick = "" ;
      A12423Text11 = "" ;
      lblTextblock44_Jsonclick = "" ;
      A12529Text12 = "" ;
      lblTextblock45_Jsonclick = "" ;
      A12530Text13 = "" ;
      lblTextblock46_Jsonclick = "" ;
      A12531Text14 = "" ;
      lblTextblock47_Jsonclick = "" ;
      A12426Note1 = "" ;
      lblTextblock48_Jsonclick = "" ;
      A12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
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
      T01JT5_A12313Dyelot = new String[] {""} ;
      T01JT5_A12314ReDye = new int[1] ;
      T01JT5_A12309Machine = new String[] {""} ;
      T01JT5_A12310Weight = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_A12311SetTime = new short[1] ;
      T01JT5_A12312ImportStat = new int[1] ;
      T01JT5_A12331RecipeStat = new int[1] ;
      T01JT5_A12332ProgramCre = new int[1] ;
      T01JT5_A12333LiquorRati = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_A12336Color = new long[1] ;
      T01JT5_A12347Customer = new String[] {""} ;
      T01JT5_A12348Article = new String[] {""} ;
      T01JT5_A12349ColourNo = new String[] {""} ;
      T01JT5_A12350ColourDesc = new String[] {""} ;
      T01JT5_A12351Length = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_A12381State = new int[1] ;
      T01JT5_n12381State = new boolean[] {false} ;
      T01JT5_A12395StartTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT5_n12395StartTime = new boolean[] {false} ;
      T01JT5_A12396EndTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT5_n12396EndTime = new boolean[] {false} ;
      T01JT5_A12405TypeOfProc = new short[1] ;
      T01JT5_n12405TypeOfProc = new boolean[] {false} ;
      T01JT5_A12406ProcedureN = new short[1] ;
      T01JT5_n12406ProcedureN = new boolean[] {false} ;
      T01JT5_A12408ProcessTp1 = new short[1] ;
      T01JT5_n12408ProcessTp1 = new boolean[] {false} ;
      T01JT5_A12409ProcessTp2 = new short[1] ;
      T01JT5_n12409ProcessTp2 = new boolean[] {false} ;
      T01JT5_A12538Paramet5 = new short[1] ;
      T01JT5_n12538Paramet5 = new boolean[] {false} ;
      T01JT5_A12539Paramet6 = new short[1] ;
      T01JT5_n12539Paramet6 = new boolean[] {false} ;
      T01JT5_A12410Paramet7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12410Paramet7 = new boolean[] {false} ;
      T01JT5_A12532Paramet8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12532Paramet8 = new boolean[] {false} ;
      T01JT5_A12533Paramet9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12533Paramet9 = new boolean[] {false} ;
      T01JT5_A12425Paramet10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12425Paramet10 = new boolean[] {false} ;
      T01JT5_A12334Paramet11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_A12411Paramet12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12411Paramet12 = new boolean[] {false} ;
      T01JT5_A12412Paramet13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12412Paramet13 = new boolean[] {false} ;
      T01JT5_A12413Paramet14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12413Paramet14 = new boolean[] {false} ;
      T01JT5_A12414Paramet15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12414Paramet15 = new boolean[] {false} ;
      T01JT5_A12527Paramet16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12527Paramet16 = new boolean[] {false} ;
      T01JT5_A12335Paramet17 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_A12415Paramet18 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12415Paramet18 = new boolean[] {false} ;
      T01JT5_A12528Paramet19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12528Paramet19 = new boolean[] {false} ;
      T01JT5_A12416Paramet20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT5_n12416Paramet20 = new boolean[] {false} ;
      T01JT5_A12417OrderNo = new String[] {""} ;
      T01JT5_n12417OrderNo = new boolean[] {false} ;
      T01JT5_A12418LiquorQuan = new long[1] ;
      T01JT5_n12418LiquorQuan = new boolean[] {false} ;
      T01JT5_A12419Text10 = new String[] {""} ;
      T01JT5_n12419Text10 = new boolean[] {false} ;
      T01JT5_A12423Text11 = new String[] {""} ;
      T01JT5_n12423Text11 = new boolean[] {false} ;
      T01JT5_A12529Text12 = new String[] {""} ;
      T01JT5_n12529Text12 = new boolean[] {false} ;
      T01JT5_A12530Text13 = new String[] {""} ;
      T01JT5_n12530Text13 = new boolean[] {false} ;
      T01JT5_A12531Text14 = new String[] {""} ;
      T01JT5_n12531Text14 = new boolean[] {false} ;
      T01JT5_A12426Note1 = new String[] {""} ;
      T01JT5_n12426Note1 = new boolean[] {false} ;
      T01JT5_A12537RequiredBy = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT5_n12537RequiredBy = new boolean[] {false} ;
      T01JT5_A12324RecipeNo = new String[] {""} ;
      T01JT4_A12324RecipeNo = new String[] {""} ;
      T01JT6_A12324RecipeNo = new String[] {""} ;
      T01JT7_A12313Dyelot = new String[] {""} ;
      T01JT7_A12314ReDye = new int[1] ;
      T01JT3_A12313Dyelot = new String[] {""} ;
      T01JT3_A12314ReDye = new int[1] ;
      T01JT3_A12309Machine = new String[] {""} ;
      T01JT3_A12310Weight = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_A12311SetTime = new short[1] ;
      T01JT3_A12312ImportStat = new int[1] ;
      T01JT3_A12331RecipeStat = new int[1] ;
      T01JT3_A12332ProgramCre = new int[1] ;
      T01JT3_A12333LiquorRati = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_A12336Color = new long[1] ;
      T01JT3_A12347Customer = new String[] {""} ;
      T01JT3_A12348Article = new String[] {""} ;
      T01JT3_A12349ColourNo = new String[] {""} ;
      T01JT3_A12350ColourDesc = new String[] {""} ;
      T01JT3_A12351Length = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_A12381State = new int[1] ;
      T01JT3_n12381State = new boolean[] {false} ;
      T01JT3_A12395StartTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT3_n12395StartTime = new boolean[] {false} ;
      T01JT3_A12396EndTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT3_n12396EndTime = new boolean[] {false} ;
      T01JT3_A12405TypeOfProc = new short[1] ;
      T01JT3_n12405TypeOfProc = new boolean[] {false} ;
      T01JT3_A12406ProcedureN = new short[1] ;
      T01JT3_n12406ProcedureN = new boolean[] {false} ;
      T01JT3_A12408ProcessTp1 = new short[1] ;
      T01JT3_n12408ProcessTp1 = new boolean[] {false} ;
      T01JT3_A12409ProcessTp2 = new short[1] ;
      T01JT3_n12409ProcessTp2 = new boolean[] {false} ;
      T01JT3_A12538Paramet5 = new short[1] ;
      T01JT3_n12538Paramet5 = new boolean[] {false} ;
      T01JT3_A12539Paramet6 = new short[1] ;
      T01JT3_n12539Paramet6 = new boolean[] {false} ;
      T01JT3_A12410Paramet7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12410Paramet7 = new boolean[] {false} ;
      T01JT3_A12532Paramet8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12532Paramet8 = new boolean[] {false} ;
      T01JT3_A12533Paramet9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12533Paramet9 = new boolean[] {false} ;
      T01JT3_A12425Paramet10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12425Paramet10 = new boolean[] {false} ;
      T01JT3_A12334Paramet11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_A12411Paramet12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12411Paramet12 = new boolean[] {false} ;
      T01JT3_A12412Paramet13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12412Paramet13 = new boolean[] {false} ;
      T01JT3_A12413Paramet14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12413Paramet14 = new boolean[] {false} ;
      T01JT3_A12414Paramet15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12414Paramet15 = new boolean[] {false} ;
      T01JT3_A12527Paramet16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12527Paramet16 = new boolean[] {false} ;
      T01JT3_A12335Paramet17 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_A12415Paramet18 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12415Paramet18 = new boolean[] {false} ;
      T01JT3_A12528Paramet19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12528Paramet19 = new boolean[] {false} ;
      T01JT3_A12416Paramet20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT3_n12416Paramet20 = new boolean[] {false} ;
      T01JT3_A12417OrderNo = new String[] {""} ;
      T01JT3_n12417OrderNo = new boolean[] {false} ;
      T01JT3_A12418LiquorQuan = new long[1] ;
      T01JT3_n12418LiquorQuan = new boolean[] {false} ;
      T01JT3_A12419Text10 = new String[] {""} ;
      T01JT3_n12419Text10 = new boolean[] {false} ;
      T01JT3_A12423Text11 = new String[] {""} ;
      T01JT3_n12423Text11 = new boolean[] {false} ;
      T01JT3_A12529Text12 = new String[] {""} ;
      T01JT3_n12529Text12 = new boolean[] {false} ;
      T01JT3_A12530Text13 = new String[] {""} ;
      T01JT3_n12530Text13 = new boolean[] {false} ;
      T01JT3_A12531Text14 = new String[] {""} ;
      T01JT3_n12531Text14 = new boolean[] {false} ;
      T01JT3_A12426Note1 = new String[] {""} ;
      T01JT3_n12426Note1 = new boolean[] {false} ;
      T01JT3_A12537RequiredBy = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT3_n12537RequiredBy = new boolean[] {false} ;
      T01JT3_A12324RecipeNo = new String[] {""} ;
      sMode1707 = "" ;
      T01JT8_A12313Dyelot = new String[] {""} ;
      T01JT8_A12314ReDye = new int[1] ;
      T01JT9_A12313Dyelot = new String[] {""} ;
      T01JT9_A12314ReDye = new int[1] ;
      T01JT2_A12313Dyelot = new String[] {""} ;
      T01JT2_A12314ReDye = new int[1] ;
      T01JT2_A12309Machine = new String[] {""} ;
      T01JT2_A12310Weight = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_A12311SetTime = new short[1] ;
      T01JT2_A12312ImportStat = new int[1] ;
      T01JT2_A12331RecipeStat = new int[1] ;
      T01JT2_A12332ProgramCre = new int[1] ;
      T01JT2_A12333LiquorRati = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_A12336Color = new long[1] ;
      T01JT2_A12347Customer = new String[] {""} ;
      T01JT2_A12348Article = new String[] {""} ;
      T01JT2_A12349ColourNo = new String[] {""} ;
      T01JT2_A12350ColourDesc = new String[] {""} ;
      T01JT2_A12351Length = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_A12381State = new int[1] ;
      T01JT2_n12381State = new boolean[] {false} ;
      T01JT2_A12395StartTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT2_n12395StartTime = new boolean[] {false} ;
      T01JT2_A12396EndTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT2_n12396EndTime = new boolean[] {false} ;
      T01JT2_A12405TypeOfProc = new short[1] ;
      T01JT2_n12405TypeOfProc = new boolean[] {false} ;
      T01JT2_A12406ProcedureN = new short[1] ;
      T01JT2_n12406ProcedureN = new boolean[] {false} ;
      T01JT2_A12408ProcessTp1 = new short[1] ;
      T01JT2_n12408ProcessTp1 = new boolean[] {false} ;
      T01JT2_A12409ProcessTp2 = new short[1] ;
      T01JT2_n12409ProcessTp2 = new boolean[] {false} ;
      T01JT2_A12538Paramet5 = new short[1] ;
      T01JT2_n12538Paramet5 = new boolean[] {false} ;
      T01JT2_A12539Paramet6 = new short[1] ;
      T01JT2_n12539Paramet6 = new boolean[] {false} ;
      T01JT2_A12410Paramet7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12410Paramet7 = new boolean[] {false} ;
      T01JT2_A12532Paramet8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12532Paramet8 = new boolean[] {false} ;
      T01JT2_A12533Paramet9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12533Paramet9 = new boolean[] {false} ;
      T01JT2_A12425Paramet10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12425Paramet10 = new boolean[] {false} ;
      T01JT2_A12334Paramet11 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_A12411Paramet12 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12411Paramet12 = new boolean[] {false} ;
      T01JT2_A12412Paramet13 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12412Paramet13 = new boolean[] {false} ;
      T01JT2_A12413Paramet14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12413Paramet14 = new boolean[] {false} ;
      T01JT2_A12414Paramet15 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12414Paramet15 = new boolean[] {false} ;
      T01JT2_A12527Paramet16 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12527Paramet16 = new boolean[] {false} ;
      T01JT2_A12335Paramet17 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_A12415Paramet18 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12415Paramet18 = new boolean[] {false} ;
      T01JT2_A12528Paramet19 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12528Paramet19 = new boolean[] {false} ;
      T01JT2_A12416Paramet20 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JT2_n12416Paramet20 = new boolean[] {false} ;
      T01JT2_A12417OrderNo = new String[] {""} ;
      T01JT2_n12417OrderNo = new boolean[] {false} ;
      T01JT2_A12418LiquorQuan = new long[1] ;
      T01JT2_n12418LiquorQuan = new boolean[] {false} ;
      T01JT2_A12419Text10 = new String[] {""} ;
      T01JT2_n12419Text10 = new boolean[] {false} ;
      T01JT2_A12423Text11 = new String[] {""} ;
      T01JT2_n12423Text11 = new boolean[] {false} ;
      T01JT2_A12529Text12 = new String[] {""} ;
      T01JT2_n12529Text12 = new boolean[] {false} ;
      T01JT2_A12530Text13 = new String[] {""} ;
      T01JT2_n12530Text13 = new boolean[] {false} ;
      T01JT2_A12531Text14 = new String[] {""} ;
      T01JT2_n12531Text14 = new boolean[] {false} ;
      T01JT2_A12426Note1 = new String[] {""} ;
      T01JT2_n12426Note1 = new boolean[] {false} ;
      T01JT2_A12537RequiredBy = new java.util.Date[] {GXutil.nullDate()} ;
      T01JT2_n12537RequiredBy = new boolean[] {false} ;
      T01JT2_A12324RecipeNo = new String[] {""} ;
      T01JT13_A12313Dyelot = new String[] {""} ;
      T01JT13_A12314ReDye = new int[1] ;
      T01JT13_A12325TreatmentC = new int[1] ;
      T01JT14_A12313Dyelot = new String[] {""} ;
      T01JT14_A12314ReDye = new int[1] ;
      T01JT14_A12320Correction = new int[1] ;
      T01JT14_A12321CallOff = new int[1] ;
      T01JT14_A12322Counter = new int[1] ;
      T01JT15_A12313Dyelot = new String[] {""} ;
      T01JT15_A12314ReDye = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ12313Dyelot = "" ;
      ZZ12309Machine = "" ;
      ZZ12310Weight = DecimalUtil.ZERO ;
      ZZ12324RecipeNo = "" ;
      ZZ12333LiquorRati = DecimalUtil.ZERO ;
      ZZ12347Customer = "" ;
      ZZ12348Article = "" ;
      ZZ12349ColourNo = "" ;
      ZZ12350ColourDesc = "" ;
      ZZ12351Length = DecimalUtil.ZERO ;
      ZZ12395StartTime = GXutil.resetTime( GXutil.nullDate() );
      ZZ12396EndTime = GXutil.resetTime( GXutil.nullDate() );
      ZZ12410Paramet7 = DecimalUtil.ZERO ;
      ZZ12532Paramet8 = DecimalUtil.ZERO ;
      ZZ12533Paramet9 = DecimalUtil.ZERO ;
      ZZ12425Paramet10 = DecimalUtil.ZERO ;
      ZZ12334Paramet11 = DecimalUtil.ZERO ;
      ZZ12411Paramet12 = DecimalUtil.ZERO ;
      ZZ12412Paramet13 = DecimalUtil.ZERO ;
      ZZ12413Paramet14 = DecimalUtil.ZERO ;
      ZZ12414Paramet15 = DecimalUtil.ZERO ;
      ZZ12527Paramet16 = DecimalUtil.ZERO ;
      ZZ12335Paramet17 = DecimalUtil.ZERO ;
      ZZ12415Paramet18 = DecimalUtil.ZERO ;
      ZZ12528Paramet19 = DecimalUtil.ZERO ;
      ZZ12416Paramet20 = DecimalUtil.ZERO ;
      ZZ12417OrderNo = "" ;
      ZZ12419Text10 = "" ;
      ZZ12423Text11 = "" ;
      ZZ12529Text12 = "" ;
      ZZ12530Text13 = "" ;
      ZZ12531Text14 = "" ;
      ZZ12426Note1 = "" ;
      ZZ12537RequiredBy = GXutil.resetTime( GXutil.nullDate() );
      T01JT16_A12324RecipeNo = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdye001__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdye001__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdye001__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdye001__default(),
         new Object[] {
             new Object[] {
            T01JT2_A12313Dyelot, T01JT2_A12314ReDye, T01JT2_A12309Machine, T01JT2_A12310Weight, T01JT2_A12311SetTime, T01JT2_A12312ImportStat, T01JT2_A12331RecipeStat, T01JT2_A12332ProgramCre, T01JT2_A12333LiquorRati, T01JT2_A12336Color,
            T01JT2_A12347Customer, T01JT2_A12348Article, T01JT2_A12349ColourNo, T01JT2_A12350ColourDesc, T01JT2_A12351Length, T01JT2_A12381State, T01JT2_n12381State, T01JT2_A12395StartTime, T01JT2_n12395StartTime, T01JT2_A12396EndTime,
            T01JT2_n12396EndTime, T01JT2_A12405TypeOfProc, T01JT2_n12405TypeOfProc, T01JT2_A12406ProcedureN, T01JT2_n12406ProcedureN, T01JT2_A12408ProcessTp1, T01JT2_n12408ProcessTp1, T01JT2_A12409ProcessTp2, T01JT2_n12409ProcessTp2, T01JT2_A12538Paramet5,
            T01JT2_n12538Paramet5, T01JT2_A12539Paramet6, T01JT2_n12539Paramet6, T01JT2_A12410Paramet7, T01JT2_n12410Paramet7, T01JT2_A12532Paramet8, T01JT2_n12532Paramet8, T01JT2_A12533Paramet9, T01JT2_n12533Paramet9, T01JT2_A12425Paramet10,
            T01JT2_n12425Paramet10, T01JT2_A12334Paramet11, T01JT2_A12411Paramet12, T01JT2_n12411Paramet12, T01JT2_A12412Paramet13, T01JT2_n12412Paramet13, T01JT2_A12413Paramet14, T01JT2_n12413Paramet14, T01JT2_A12414Paramet15, T01JT2_n12414Paramet15,
            T01JT2_A12527Paramet16, T01JT2_n12527Paramet16, T01JT2_A12335Paramet17, T01JT2_A12415Paramet18, T01JT2_n12415Paramet18, T01JT2_A12528Paramet19, T01JT2_n12528Paramet19, T01JT2_A12416Paramet20, T01JT2_n12416Paramet20, T01JT2_A12417OrderNo,
            T01JT2_n12417OrderNo, T01JT2_A12418LiquorQuan, T01JT2_n12418LiquorQuan, T01JT2_A12419Text10, T01JT2_n12419Text10, T01JT2_A12423Text11, T01JT2_n12423Text11, T01JT2_A12529Text12, T01JT2_n12529Text12, T01JT2_A12530Text13,
            T01JT2_n12530Text13, T01JT2_A12531Text14, T01JT2_n12531Text14, T01JT2_A12426Note1, T01JT2_n12426Note1, T01JT2_A12537RequiredBy, T01JT2_n12537RequiredBy, T01JT2_A12324RecipeNo
            }
            , new Object[] {
            T01JT3_A12313Dyelot, T01JT3_A12314ReDye, T01JT3_A12309Machine, T01JT3_A12310Weight, T01JT3_A12311SetTime, T01JT3_A12312ImportStat, T01JT3_A12331RecipeStat, T01JT3_A12332ProgramCre, T01JT3_A12333LiquorRati, T01JT3_A12336Color,
            T01JT3_A12347Customer, T01JT3_A12348Article, T01JT3_A12349ColourNo, T01JT3_A12350ColourDesc, T01JT3_A12351Length, T01JT3_A12381State, T01JT3_n12381State, T01JT3_A12395StartTime, T01JT3_n12395StartTime, T01JT3_A12396EndTime,
            T01JT3_n12396EndTime, T01JT3_A12405TypeOfProc, T01JT3_n12405TypeOfProc, T01JT3_A12406ProcedureN, T01JT3_n12406ProcedureN, T01JT3_A12408ProcessTp1, T01JT3_n12408ProcessTp1, T01JT3_A12409ProcessTp2, T01JT3_n12409ProcessTp2, T01JT3_A12538Paramet5,
            T01JT3_n12538Paramet5, T01JT3_A12539Paramet6, T01JT3_n12539Paramet6, T01JT3_A12410Paramet7, T01JT3_n12410Paramet7, T01JT3_A12532Paramet8, T01JT3_n12532Paramet8, T01JT3_A12533Paramet9, T01JT3_n12533Paramet9, T01JT3_A12425Paramet10,
            T01JT3_n12425Paramet10, T01JT3_A12334Paramet11, T01JT3_A12411Paramet12, T01JT3_n12411Paramet12, T01JT3_A12412Paramet13, T01JT3_n12412Paramet13, T01JT3_A12413Paramet14, T01JT3_n12413Paramet14, T01JT3_A12414Paramet15, T01JT3_n12414Paramet15,
            T01JT3_A12527Paramet16, T01JT3_n12527Paramet16, T01JT3_A12335Paramet17, T01JT3_A12415Paramet18, T01JT3_n12415Paramet18, T01JT3_A12528Paramet19, T01JT3_n12528Paramet19, T01JT3_A12416Paramet20, T01JT3_n12416Paramet20, T01JT3_A12417OrderNo,
            T01JT3_n12417OrderNo, T01JT3_A12418LiquorQuan, T01JT3_n12418LiquorQuan, T01JT3_A12419Text10, T01JT3_n12419Text10, T01JT3_A12423Text11, T01JT3_n12423Text11, T01JT3_A12529Text12, T01JT3_n12529Text12, T01JT3_A12530Text13,
            T01JT3_n12530Text13, T01JT3_A12531Text14, T01JT3_n12531Text14, T01JT3_A12426Note1, T01JT3_n12426Note1, T01JT3_A12537RequiredBy, T01JT3_n12537RequiredBy, T01JT3_A12324RecipeNo
            }
            , new Object[] {
            T01JT4_A12324RecipeNo
            }
            , new Object[] {
            T01JT5_A12313Dyelot, T01JT5_A12314ReDye, T01JT5_A12309Machine, T01JT5_A12310Weight, T01JT5_A12311SetTime, T01JT5_A12312ImportStat, T01JT5_A12331RecipeStat, T01JT5_A12332ProgramCre, T01JT5_A12333LiquorRati, T01JT5_A12336Color,
            T01JT5_A12347Customer, T01JT5_A12348Article, T01JT5_A12349ColourNo, T01JT5_A12350ColourDesc, T01JT5_A12351Length, T01JT5_A12381State, T01JT5_n12381State, T01JT5_A12395StartTime, T01JT5_n12395StartTime, T01JT5_A12396EndTime,
            T01JT5_n12396EndTime, T01JT5_A12405TypeOfProc, T01JT5_n12405TypeOfProc, T01JT5_A12406ProcedureN, T01JT5_n12406ProcedureN, T01JT5_A12408ProcessTp1, T01JT5_n12408ProcessTp1, T01JT5_A12409ProcessTp2, T01JT5_n12409ProcessTp2, T01JT5_A12538Paramet5,
            T01JT5_n12538Paramet5, T01JT5_A12539Paramet6, T01JT5_n12539Paramet6, T01JT5_A12410Paramet7, T01JT5_n12410Paramet7, T01JT5_A12532Paramet8, T01JT5_n12532Paramet8, T01JT5_A12533Paramet9, T01JT5_n12533Paramet9, T01JT5_A12425Paramet10,
            T01JT5_n12425Paramet10, T01JT5_A12334Paramet11, T01JT5_A12411Paramet12, T01JT5_n12411Paramet12, T01JT5_A12412Paramet13, T01JT5_n12412Paramet13, T01JT5_A12413Paramet14, T01JT5_n12413Paramet14, T01JT5_A12414Paramet15, T01JT5_n12414Paramet15,
            T01JT5_A12527Paramet16, T01JT5_n12527Paramet16, T01JT5_A12335Paramet17, T01JT5_A12415Paramet18, T01JT5_n12415Paramet18, T01JT5_A12528Paramet19, T01JT5_n12528Paramet19, T01JT5_A12416Paramet20, T01JT5_n12416Paramet20, T01JT5_A12417OrderNo,
            T01JT5_n12417OrderNo, T01JT5_A12418LiquorQuan, T01JT5_n12418LiquorQuan, T01JT5_A12419Text10, T01JT5_n12419Text10, T01JT5_A12423Text11, T01JT5_n12423Text11, T01JT5_A12529Text12, T01JT5_n12529Text12, T01JT5_A12530Text13,
            T01JT5_n12530Text13, T01JT5_A12531Text14, T01JT5_n12531Text14, T01JT5_A12426Note1, T01JT5_n12426Note1, T01JT5_A12537RequiredBy, T01JT5_n12537RequiredBy, T01JT5_A12324RecipeNo
            }
            , new Object[] {
            T01JT6_A12324RecipeNo
            }
            , new Object[] {
            T01JT7_A12313Dyelot, T01JT7_A12314ReDye
            }
            , new Object[] {
            T01JT8_A12313Dyelot, T01JT8_A12314ReDye
            }
            , new Object[] {
            T01JT9_A12313Dyelot, T01JT9_A12314ReDye
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JT13_A12313Dyelot, T01JT13_A12314ReDye, T01JT13_A12325TreatmentC
            }
            , new Object[] {
            T01JT14_A12313Dyelot, T01JT14_A12314ReDye, T01JT14_A12320Correction, T01JT14_A12321CallOff, T01JT14_A12322Counter
            }
            , new Object[] {
            T01JT15_A12313Dyelot, T01JT15_A12314ReDye
            }
            , new Object[] {
            T01JT16_A12324RecipeNo
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z12311SetTime ;
   private short Z12405TypeOfProc ;
   private short Z12406ProcedureN ;
   private short Z12408ProcessTp1 ;
   private short Z12409ProcessTp2 ;
   private short Z12538Paramet5 ;
   private short Z12539Paramet6 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12311SetTime ;
   private short A12405TypeOfProc ;
   private short A12406ProcedureN ;
   private short A12408ProcessTp1 ;
   private short A12409ProcessTp2 ;
   private short A12538Paramet5 ;
   private short A12539Paramet6 ;
   private short RcdFound1707 ;
   private short nIsDirty_1707 ;
   private short ZZ12311SetTime ;
   private short ZZ12405TypeOfProc ;
   private short ZZ12406ProcedureN ;
   private short ZZ12408ProcessTp1 ;
   private short ZZ12409ProcessTp2 ;
   private short ZZ12538Paramet5 ;
   private short ZZ12539Paramet6 ;
   private int Z12314ReDye ;
   private int Z12312ImportStat ;
   private int Z12331RecipeStat ;
   private int Z12332ProgramCre ;
   private int Z12381State ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDyelot_Enabled ;
   private int A12314ReDye ;
   private int edtReDye_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMachine_Enabled ;
   private int edtWeight_Enabled ;
   private int edtSetTime_Enabled ;
   private int A12312ImportStat ;
   private int edtImportStat_Enabled ;
   private int edtRecipeNo_Enabled ;
   private int A12331RecipeStat ;
   private int edtRecipeStat_Enabled ;
   private int A12332ProgramCre ;
   private int edtProgramCre_Enabled ;
   private int edtLiquorRati_Enabled ;
   private int edtColor_Enabled ;
   private int edtCustomer_Enabled ;
   private int edtArticle_Enabled ;
   private int edtColourNo_Enabled ;
   private int edtColourDesc_Enabled ;
   private int edtLength_Enabled ;
   private int A12381State ;
   private int edtState_Enabled ;
   private int edtStartTime_Enabled ;
   private int edtEndTime_Enabled ;
   private int edtTypeOfProc_Enabled ;
   private int edtProcedureN_Enabled ;
   private int edtProcessTp1_Enabled ;
   private int edtProcessTp2_Enabled ;
   private int edtParamet5_Enabled ;
   private int edtParamet6_Enabled ;
   private int edtParamet7_Enabled ;
   private int edtParamet8_Enabled ;
   private int edtParamet9_Enabled ;
   private int edtParamet10_Enabled ;
   private int edtParamet11_Enabled ;
   private int edtParamet12_Enabled ;
   private int edtParamet13_Enabled ;
   private int edtParamet14_Enabled ;
   private int edtParamet15_Enabled ;
   private int edtParamet16_Enabled ;
   private int edtParamet17_Enabled ;
   private int edtParamet18_Enabled ;
   private int edtParamet19_Enabled ;
   private int edtParamet20_Enabled ;
   private int edtOrderNo_Enabled ;
   private int edtLiquorQuan_Enabled ;
   private int edtText10_Enabled ;
   private int edtText11_Enabled ;
   private int edtText12_Enabled ;
   private int edtText13_Enabled ;
   private int edtText14_Enabled ;
   private int edtNote1_Enabled ;
   private int edtRequiredBy_Enabled ;
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
   private int edtRequiredBy_Backcolor ;
   private int edtNote1_Backcolor ;
   private int edtText14_Backcolor ;
   private int edtText13_Backcolor ;
   private int edtText12_Backcolor ;
   private int edtText11_Backcolor ;
   private int edtText10_Backcolor ;
   private int edtLiquorQuan_Backcolor ;
   private int edtOrderNo_Backcolor ;
   private int edtParamet20_Backcolor ;
   private int edtParamet19_Backcolor ;
   private int edtParamet18_Backcolor ;
   private int edtParamet17_Backcolor ;
   private int edtParamet16_Backcolor ;
   private int edtParamet15_Backcolor ;
   private int edtParamet14_Backcolor ;
   private int edtParamet13_Backcolor ;
   private int edtParamet12_Backcolor ;
   private int edtParamet11_Backcolor ;
   private int edtParamet10_Backcolor ;
   private int edtParamet9_Backcolor ;
   private int edtParamet8_Backcolor ;
   private int edtParamet7_Backcolor ;
   private int edtParamet6_Backcolor ;
   private int edtParamet5_Backcolor ;
   private int edtProcessTp2_Backcolor ;
   private int edtProcessTp1_Backcolor ;
   private int edtProcedureN_Backcolor ;
   private int edtTypeOfProc_Backcolor ;
   private int edtEndTime_Backcolor ;
   private int edtStartTime_Backcolor ;
   private int edtState_Backcolor ;
   private int edtLength_Backcolor ;
   private int edtColourDesc_Backcolor ;
   private int edtColourNo_Backcolor ;
   private int edtArticle_Backcolor ;
   private int edtCustomer_Backcolor ;
   private int edtColor_Backcolor ;
   private int edtLiquorRati_Backcolor ;
   private int edtProgramCre_Backcolor ;
   private int edtRecipeStat_Backcolor ;
   private int edtRecipeNo_Backcolor ;
   private int edtImportStat_Backcolor ;
   private int edtSetTime_Backcolor ;
   private int edtWeight_Backcolor ;
   private int edtMachine_Backcolor ;
   private int edtReDye_Backcolor ;
   private int edtDyelot_Backcolor ;
   private int ZZ12314ReDye ;
   private int ZZ12312ImportStat ;
   private int ZZ12331RecipeStat ;
   private int ZZ12332ProgramCre ;
   private int ZZ12381State ;
   private long Z12336Color ;
   private long Z12418LiquorQuan ;
   private long A12336Color ;
   private long A12418LiquorQuan ;
   private long ZZ12336Color ;
   private long ZZ12418LiquorQuan ;
   private java.math.BigDecimal Z12310Weight ;
   private java.math.BigDecimal Z12333LiquorRati ;
   private java.math.BigDecimal Z12351Length ;
   private java.math.BigDecimal Z12410Paramet7 ;
   private java.math.BigDecimal Z12532Paramet8 ;
   private java.math.BigDecimal Z12533Paramet9 ;
   private java.math.BigDecimal Z12425Paramet10 ;
   private java.math.BigDecimal Z12334Paramet11 ;
   private java.math.BigDecimal Z12411Paramet12 ;
   private java.math.BigDecimal Z12412Paramet13 ;
   private java.math.BigDecimal Z12413Paramet14 ;
   private java.math.BigDecimal Z12414Paramet15 ;
   private java.math.BigDecimal Z12527Paramet16 ;
   private java.math.BigDecimal Z12335Paramet17 ;
   private java.math.BigDecimal Z12415Paramet18 ;
   private java.math.BigDecimal Z12528Paramet19 ;
   private java.math.BigDecimal Z12416Paramet20 ;
   private java.math.BigDecimal A12310Weight ;
   private java.math.BigDecimal A12333LiquorRati ;
   private java.math.BigDecimal A12351Length ;
   private java.math.BigDecimal A12410Paramet7 ;
   private java.math.BigDecimal A12532Paramet8 ;
   private java.math.BigDecimal A12533Paramet9 ;
   private java.math.BigDecimal A12425Paramet10 ;
   private java.math.BigDecimal A12334Paramet11 ;
   private java.math.BigDecimal A12411Paramet12 ;
   private java.math.BigDecimal A12412Paramet13 ;
   private java.math.BigDecimal A12413Paramet14 ;
   private java.math.BigDecimal A12414Paramet15 ;
   private java.math.BigDecimal A12527Paramet16 ;
   private java.math.BigDecimal A12335Paramet17 ;
   private java.math.BigDecimal A12415Paramet18 ;
   private java.math.BigDecimal A12528Paramet19 ;
   private java.math.BigDecimal A12416Paramet20 ;
   private java.math.BigDecimal ZZ12310Weight ;
   private java.math.BigDecimal ZZ12333LiquorRati ;
   private java.math.BigDecimal ZZ12351Length ;
   private java.math.BigDecimal ZZ12410Paramet7 ;
   private java.math.BigDecimal ZZ12532Paramet8 ;
   private java.math.BigDecimal ZZ12533Paramet9 ;
   private java.math.BigDecimal ZZ12425Paramet10 ;
   private java.math.BigDecimal ZZ12334Paramet11 ;
   private java.math.BigDecimal ZZ12411Paramet12 ;
   private java.math.BigDecimal ZZ12412Paramet13 ;
   private java.math.BigDecimal ZZ12413Paramet14 ;
   private java.math.BigDecimal ZZ12414Paramet15 ;
   private java.math.BigDecimal ZZ12527Paramet16 ;
   private java.math.BigDecimal ZZ12335Paramet17 ;
   private java.math.BigDecimal ZZ12415Paramet18 ;
   private java.math.BigDecimal ZZ12528Paramet19 ;
   private java.math.BigDecimal ZZ12416Paramet20 ;
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
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMachine_Internalname ;
   private String edtMachine_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtWeight_Internalname ;
   private String edtWeight_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtSetTime_Internalname ;
   private String edtSetTime_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtImportStat_Internalname ;
   private String edtImportStat_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRecipeNo_Internalname ;
   private String edtRecipeNo_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtRecipeStat_Internalname ;
   private String edtRecipeStat_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtProgramCre_Internalname ;
   private String edtProgramCre_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtLiquorRati_Internalname ;
   private String edtLiquorRati_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtColor_Internalname ;
   private String edtColor_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtCustomer_Internalname ;
   private String edtCustomer_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtArticle_Internalname ;
   private String edtArticle_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtColourNo_Internalname ;
   private String edtColourNo_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtColourDesc_Internalname ;
   private String edtColourDesc_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtLength_Internalname ;
   private String edtLength_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtState_Internalname ;
   private String edtState_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtStartTime_Internalname ;
   private String edtStartTime_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtEndTime_Internalname ;
   private String edtEndTime_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtTypeOfProc_Internalname ;
   private String edtTypeOfProc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtProcedureN_Internalname ;
   private String edtProcedureN_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtProcessTp1_Internalname ;
   private String edtProcessTp1_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtProcessTp2_Internalname ;
   private String edtProcessTp2_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtParamet5_Internalname ;
   private String edtParamet5_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtParamet6_Internalname ;
   private String edtParamet6_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtParamet7_Internalname ;
   private String edtParamet7_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtParamet8_Internalname ;
   private String edtParamet8_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtParamet9_Internalname ;
   private String edtParamet9_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtParamet10_Internalname ;
   private String edtParamet10_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtParamet11_Internalname ;
   private String edtParamet11_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtParamet12_Internalname ;
   private String edtParamet12_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtParamet13_Internalname ;
   private String edtParamet13_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtParamet14_Internalname ;
   private String edtParamet14_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtParamet15_Internalname ;
   private String edtParamet15_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtParamet16_Internalname ;
   private String edtParamet16_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtParamet17_Internalname ;
   private String edtParamet17_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtParamet18_Internalname ;
   private String edtParamet18_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtParamet19_Internalname ;
   private String edtParamet19_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtParamet20_Internalname ;
   private String edtParamet20_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtOrderNo_Internalname ;
   private String edtOrderNo_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtLiquorQuan_Internalname ;
   private String edtLiquorQuan_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtText10_Internalname ;
   private String edtText10_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtText11_Internalname ;
   private String edtText11_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtText12_Internalname ;
   private String edtText12_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtText13_Internalname ;
   private String edtText13_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtText14_Internalname ;
   private String edtText14_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtNote1_Internalname ;
   private String edtNote1_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtRequiredBy_Internalname ;
   private String edtRequiredBy_Jsonclick ;
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
   private String sMode1707 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z12395StartTime ;
   private java.util.Date Z12396EndTime ;
   private java.util.Date Z12537RequiredBy ;
   private java.util.Date A12395StartTime ;
   private java.util.Date A12396EndTime ;
   private java.util.Date A12537RequiredBy ;
   private java.util.Date ZZ12395StartTime ;
   private java.util.Date ZZ12396EndTime ;
   private java.util.Date ZZ12537RequiredBy ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12381State ;
   private boolean n12395StartTime ;
   private boolean n12396EndTime ;
   private boolean n12405TypeOfProc ;
   private boolean n12406ProcedureN ;
   private boolean n12408ProcessTp1 ;
   private boolean n12409ProcessTp2 ;
   private boolean n12538Paramet5 ;
   private boolean n12539Paramet6 ;
   private boolean n12410Paramet7 ;
   private boolean n12532Paramet8 ;
   private boolean n12533Paramet9 ;
   private boolean n12425Paramet10 ;
   private boolean n12411Paramet12 ;
   private boolean n12412Paramet13 ;
   private boolean n12413Paramet14 ;
   private boolean n12414Paramet15 ;
   private boolean n12527Paramet16 ;
   private boolean n12415Paramet18 ;
   private boolean n12528Paramet19 ;
   private boolean n12416Paramet20 ;
   private boolean n12417OrderNo ;
   private boolean n12418LiquorQuan ;
   private boolean n12419Text10 ;
   private boolean n12423Text11 ;
   private boolean n12529Text12 ;
   private boolean n12530Text13 ;
   private boolean n12531Text14 ;
   private boolean n12426Note1 ;
   private boolean n12537RequiredBy ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z12313Dyelot ;
   private String Z12309Machine ;
   private String Z12347Customer ;
   private String Z12348Article ;
   private String Z12349ColourNo ;
   private String Z12350ColourDesc ;
   private String Z12417OrderNo ;
   private String Z12419Text10 ;
   private String Z12423Text11 ;
   private String Z12529Text12 ;
   private String Z12530Text13 ;
   private String Z12531Text14 ;
   private String Z12426Note1 ;
   private String Z12324RecipeNo ;
   private String A12324RecipeNo ;
   private String A12313Dyelot ;
   private String A12309Machine ;
   private String A12347Customer ;
   private String A12348Article ;
   private String A12349ColourNo ;
   private String A12350ColourDesc ;
   private String A12417OrderNo ;
   private String A12419Text10 ;
   private String A12423Text11 ;
   private String A12529Text12 ;
   private String A12530Text13 ;
   private String A12531Text14 ;
   private String A12426Note1 ;
   private String ZZ12313Dyelot ;
   private String ZZ12309Machine ;
   private String ZZ12324RecipeNo ;
   private String ZZ12347Customer ;
   private String ZZ12348Article ;
   private String ZZ12349ColourNo ;
   private String ZZ12350ColourDesc ;
   private String ZZ12417OrderNo ;
   private String ZZ12419Text10 ;
   private String ZZ12423Text11 ;
   private String ZZ12529Text12 ;
   private String ZZ12530Text13 ;
   private String ZZ12531Text14 ;
   private String ZZ12426Note1 ;
   private IDataStoreProvider pr_default ;
   private String[] T01JT5_A12313Dyelot ;
   private int[] T01JT5_A12314ReDye ;
   private String[] T01JT5_A12309Machine ;
   private java.math.BigDecimal[] T01JT5_A12310Weight ;
   private short[] T01JT5_A12311SetTime ;
   private int[] T01JT5_A12312ImportStat ;
   private int[] T01JT5_A12331RecipeStat ;
   private int[] T01JT5_A12332ProgramCre ;
   private java.math.BigDecimal[] T01JT5_A12333LiquorRati ;
   private long[] T01JT5_A12336Color ;
   private String[] T01JT5_A12347Customer ;
   private String[] T01JT5_A12348Article ;
   private String[] T01JT5_A12349ColourNo ;
   private String[] T01JT5_A12350ColourDesc ;
   private java.math.BigDecimal[] T01JT5_A12351Length ;
   private int[] T01JT5_A12381State ;
   private boolean[] T01JT5_n12381State ;
   private java.util.Date[] T01JT5_A12395StartTime ;
   private boolean[] T01JT5_n12395StartTime ;
   private java.util.Date[] T01JT5_A12396EndTime ;
   private boolean[] T01JT5_n12396EndTime ;
   private short[] T01JT5_A12405TypeOfProc ;
   private boolean[] T01JT5_n12405TypeOfProc ;
   private short[] T01JT5_A12406ProcedureN ;
   private boolean[] T01JT5_n12406ProcedureN ;
   private short[] T01JT5_A12408ProcessTp1 ;
   private boolean[] T01JT5_n12408ProcessTp1 ;
   private short[] T01JT5_A12409ProcessTp2 ;
   private boolean[] T01JT5_n12409ProcessTp2 ;
   private short[] T01JT5_A12538Paramet5 ;
   private boolean[] T01JT5_n12538Paramet5 ;
   private short[] T01JT5_A12539Paramet6 ;
   private boolean[] T01JT5_n12539Paramet6 ;
   private java.math.BigDecimal[] T01JT5_A12410Paramet7 ;
   private boolean[] T01JT5_n12410Paramet7 ;
   private java.math.BigDecimal[] T01JT5_A12532Paramet8 ;
   private boolean[] T01JT5_n12532Paramet8 ;
   private java.math.BigDecimal[] T01JT5_A12533Paramet9 ;
   private boolean[] T01JT5_n12533Paramet9 ;
   private java.math.BigDecimal[] T01JT5_A12425Paramet10 ;
   private boolean[] T01JT5_n12425Paramet10 ;
   private java.math.BigDecimal[] T01JT5_A12334Paramet11 ;
   private java.math.BigDecimal[] T01JT5_A12411Paramet12 ;
   private boolean[] T01JT5_n12411Paramet12 ;
   private java.math.BigDecimal[] T01JT5_A12412Paramet13 ;
   private boolean[] T01JT5_n12412Paramet13 ;
   private java.math.BigDecimal[] T01JT5_A12413Paramet14 ;
   private boolean[] T01JT5_n12413Paramet14 ;
   private java.math.BigDecimal[] T01JT5_A12414Paramet15 ;
   private boolean[] T01JT5_n12414Paramet15 ;
   private java.math.BigDecimal[] T01JT5_A12527Paramet16 ;
   private boolean[] T01JT5_n12527Paramet16 ;
   private java.math.BigDecimal[] T01JT5_A12335Paramet17 ;
   private java.math.BigDecimal[] T01JT5_A12415Paramet18 ;
   private boolean[] T01JT5_n12415Paramet18 ;
   private java.math.BigDecimal[] T01JT5_A12528Paramet19 ;
   private boolean[] T01JT5_n12528Paramet19 ;
   private java.math.BigDecimal[] T01JT5_A12416Paramet20 ;
   private boolean[] T01JT5_n12416Paramet20 ;
   private String[] T01JT5_A12417OrderNo ;
   private boolean[] T01JT5_n12417OrderNo ;
   private long[] T01JT5_A12418LiquorQuan ;
   private boolean[] T01JT5_n12418LiquorQuan ;
   private String[] T01JT5_A12419Text10 ;
   private boolean[] T01JT5_n12419Text10 ;
   private String[] T01JT5_A12423Text11 ;
   private boolean[] T01JT5_n12423Text11 ;
   private String[] T01JT5_A12529Text12 ;
   private boolean[] T01JT5_n12529Text12 ;
   private String[] T01JT5_A12530Text13 ;
   private boolean[] T01JT5_n12530Text13 ;
   private String[] T01JT5_A12531Text14 ;
   private boolean[] T01JT5_n12531Text14 ;
   private String[] T01JT5_A12426Note1 ;
   private boolean[] T01JT5_n12426Note1 ;
   private java.util.Date[] T01JT5_A12537RequiredBy ;
   private boolean[] T01JT5_n12537RequiredBy ;
   private String[] T01JT5_A12324RecipeNo ;
   private String[] T01JT4_A12324RecipeNo ;
   private String[] T01JT6_A12324RecipeNo ;
   private String[] T01JT7_A12313Dyelot ;
   private int[] T01JT7_A12314ReDye ;
   private String[] T01JT3_A12313Dyelot ;
   private int[] T01JT3_A12314ReDye ;
   private String[] T01JT3_A12309Machine ;
   private java.math.BigDecimal[] T01JT3_A12310Weight ;
   private short[] T01JT3_A12311SetTime ;
   private int[] T01JT3_A12312ImportStat ;
   private int[] T01JT3_A12331RecipeStat ;
   private int[] T01JT3_A12332ProgramCre ;
   private java.math.BigDecimal[] T01JT3_A12333LiquorRati ;
   private long[] T01JT3_A12336Color ;
   private String[] T01JT3_A12347Customer ;
   private String[] T01JT3_A12348Article ;
   private String[] T01JT3_A12349ColourNo ;
   private String[] T01JT3_A12350ColourDesc ;
   private java.math.BigDecimal[] T01JT3_A12351Length ;
   private int[] T01JT3_A12381State ;
   private boolean[] T01JT3_n12381State ;
   private java.util.Date[] T01JT3_A12395StartTime ;
   private boolean[] T01JT3_n12395StartTime ;
   private java.util.Date[] T01JT3_A12396EndTime ;
   private boolean[] T01JT3_n12396EndTime ;
   private short[] T01JT3_A12405TypeOfProc ;
   private boolean[] T01JT3_n12405TypeOfProc ;
   private short[] T01JT3_A12406ProcedureN ;
   private boolean[] T01JT3_n12406ProcedureN ;
   private short[] T01JT3_A12408ProcessTp1 ;
   private boolean[] T01JT3_n12408ProcessTp1 ;
   private short[] T01JT3_A12409ProcessTp2 ;
   private boolean[] T01JT3_n12409ProcessTp2 ;
   private short[] T01JT3_A12538Paramet5 ;
   private boolean[] T01JT3_n12538Paramet5 ;
   private short[] T01JT3_A12539Paramet6 ;
   private boolean[] T01JT3_n12539Paramet6 ;
   private java.math.BigDecimal[] T01JT3_A12410Paramet7 ;
   private boolean[] T01JT3_n12410Paramet7 ;
   private java.math.BigDecimal[] T01JT3_A12532Paramet8 ;
   private boolean[] T01JT3_n12532Paramet8 ;
   private java.math.BigDecimal[] T01JT3_A12533Paramet9 ;
   private boolean[] T01JT3_n12533Paramet9 ;
   private java.math.BigDecimal[] T01JT3_A12425Paramet10 ;
   private boolean[] T01JT3_n12425Paramet10 ;
   private java.math.BigDecimal[] T01JT3_A12334Paramet11 ;
   private java.math.BigDecimal[] T01JT3_A12411Paramet12 ;
   private boolean[] T01JT3_n12411Paramet12 ;
   private java.math.BigDecimal[] T01JT3_A12412Paramet13 ;
   private boolean[] T01JT3_n12412Paramet13 ;
   private java.math.BigDecimal[] T01JT3_A12413Paramet14 ;
   private boolean[] T01JT3_n12413Paramet14 ;
   private java.math.BigDecimal[] T01JT3_A12414Paramet15 ;
   private boolean[] T01JT3_n12414Paramet15 ;
   private java.math.BigDecimal[] T01JT3_A12527Paramet16 ;
   private boolean[] T01JT3_n12527Paramet16 ;
   private java.math.BigDecimal[] T01JT3_A12335Paramet17 ;
   private java.math.BigDecimal[] T01JT3_A12415Paramet18 ;
   private boolean[] T01JT3_n12415Paramet18 ;
   private java.math.BigDecimal[] T01JT3_A12528Paramet19 ;
   private boolean[] T01JT3_n12528Paramet19 ;
   private java.math.BigDecimal[] T01JT3_A12416Paramet20 ;
   private boolean[] T01JT3_n12416Paramet20 ;
   private String[] T01JT3_A12417OrderNo ;
   private boolean[] T01JT3_n12417OrderNo ;
   private long[] T01JT3_A12418LiquorQuan ;
   private boolean[] T01JT3_n12418LiquorQuan ;
   private String[] T01JT3_A12419Text10 ;
   private boolean[] T01JT3_n12419Text10 ;
   private String[] T01JT3_A12423Text11 ;
   private boolean[] T01JT3_n12423Text11 ;
   private String[] T01JT3_A12529Text12 ;
   private boolean[] T01JT3_n12529Text12 ;
   private String[] T01JT3_A12530Text13 ;
   private boolean[] T01JT3_n12530Text13 ;
   private String[] T01JT3_A12531Text14 ;
   private boolean[] T01JT3_n12531Text14 ;
   private String[] T01JT3_A12426Note1 ;
   private boolean[] T01JT3_n12426Note1 ;
   private java.util.Date[] T01JT3_A12537RequiredBy ;
   private boolean[] T01JT3_n12537RequiredBy ;
   private String[] T01JT3_A12324RecipeNo ;
   private String[] T01JT8_A12313Dyelot ;
   private int[] T01JT8_A12314ReDye ;
   private String[] T01JT9_A12313Dyelot ;
   private int[] T01JT9_A12314ReDye ;
   private String[] T01JT2_A12313Dyelot ;
   private int[] T01JT2_A12314ReDye ;
   private String[] T01JT2_A12309Machine ;
   private java.math.BigDecimal[] T01JT2_A12310Weight ;
   private short[] T01JT2_A12311SetTime ;
   private int[] T01JT2_A12312ImportStat ;
   private int[] T01JT2_A12331RecipeStat ;
   private int[] T01JT2_A12332ProgramCre ;
   private java.math.BigDecimal[] T01JT2_A12333LiquorRati ;
   private long[] T01JT2_A12336Color ;
   private String[] T01JT2_A12347Customer ;
   private String[] T01JT2_A12348Article ;
   private String[] T01JT2_A12349ColourNo ;
   private String[] T01JT2_A12350ColourDesc ;
   private java.math.BigDecimal[] T01JT2_A12351Length ;
   private int[] T01JT2_A12381State ;
   private boolean[] T01JT2_n12381State ;
   private java.util.Date[] T01JT2_A12395StartTime ;
   private boolean[] T01JT2_n12395StartTime ;
   private java.util.Date[] T01JT2_A12396EndTime ;
   private boolean[] T01JT2_n12396EndTime ;
   private short[] T01JT2_A12405TypeOfProc ;
   private boolean[] T01JT2_n12405TypeOfProc ;
   private short[] T01JT2_A12406ProcedureN ;
   private boolean[] T01JT2_n12406ProcedureN ;
   private short[] T01JT2_A12408ProcessTp1 ;
   private boolean[] T01JT2_n12408ProcessTp1 ;
   private short[] T01JT2_A12409ProcessTp2 ;
   private boolean[] T01JT2_n12409ProcessTp2 ;
   private short[] T01JT2_A12538Paramet5 ;
   private boolean[] T01JT2_n12538Paramet5 ;
   private short[] T01JT2_A12539Paramet6 ;
   private boolean[] T01JT2_n12539Paramet6 ;
   private java.math.BigDecimal[] T01JT2_A12410Paramet7 ;
   private boolean[] T01JT2_n12410Paramet7 ;
   private java.math.BigDecimal[] T01JT2_A12532Paramet8 ;
   private boolean[] T01JT2_n12532Paramet8 ;
   private java.math.BigDecimal[] T01JT2_A12533Paramet9 ;
   private boolean[] T01JT2_n12533Paramet9 ;
   private java.math.BigDecimal[] T01JT2_A12425Paramet10 ;
   private boolean[] T01JT2_n12425Paramet10 ;
   private java.math.BigDecimal[] T01JT2_A12334Paramet11 ;
   private java.math.BigDecimal[] T01JT2_A12411Paramet12 ;
   private boolean[] T01JT2_n12411Paramet12 ;
   private java.math.BigDecimal[] T01JT2_A12412Paramet13 ;
   private boolean[] T01JT2_n12412Paramet13 ;
   private java.math.BigDecimal[] T01JT2_A12413Paramet14 ;
   private boolean[] T01JT2_n12413Paramet14 ;
   private java.math.BigDecimal[] T01JT2_A12414Paramet15 ;
   private boolean[] T01JT2_n12414Paramet15 ;
   private java.math.BigDecimal[] T01JT2_A12527Paramet16 ;
   private boolean[] T01JT2_n12527Paramet16 ;
   private java.math.BigDecimal[] T01JT2_A12335Paramet17 ;
   private java.math.BigDecimal[] T01JT2_A12415Paramet18 ;
   private boolean[] T01JT2_n12415Paramet18 ;
   private java.math.BigDecimal[] T01JT2_A12528Paramet19 ;
   private boolean[] T01JT2_n12528Paramet19 ;
   private java.math.BigDecimal[] T01JT2_A12416Paramet20 ;
   private boolean[] T01JT2_n12416Paramet20 ;
   private String[] T01JT2_A12417OrderNo ;
   private boolean[] T01JT2_n12417OrderNo ;
   private long[] T01JT2_A12418LiquorQuan ;
   private boolean[] T01JT2_n12418LiquorQuan ;
   private String[] T01JT2_A12419Text10 ;
   private boolean[] T01JT2_n12419Text10 ;
   private String[] T01JT2_A12423Text11 ;
   private boolean[] T01JT2_n12423Text11 ;
   private String[] T01JT2_A12529Text12 ;
   private boolean[] T01JT2_n12529Text12 ;
   private String[] T01JT2_A12530Text13 ;
   private boolean[] T01JT2_n12530Text13 ;
   private String[] T01JT2_A12531Text14 ;
   private boolean[] T01JT2_n12531Text14 ;
   private String[] T01JT2_A12426Note1 ;
   private boolean[] T01JT2_n12426Note1 ;
   private java.util.Date[] T01JT2_A12537RequiredBy ;
   private boolean[] T01JT2_n12537RequiredBy ;
   private String[] T01JT2_A12324RecipeNo ;
   private String[] T01JT13_A12313Dyelot ;
   private int[] T01JT13_A12314ReDye ;
   private int[] T01JT13_A12325TreatmentC ;
   private String[] T01JT14_A12313Dyelot ;
   private int[] T01JT14_A12314ReDye ;
   private int[] T01JT14_A12320Correction ;
   private int[] T01JT14_A12321CallOff ;
   private int[] T01JT14_A12322Counter ;
   private String[] T01JT15_A12313Dyelot ;
   private int[] T01JT15_A12314ReDye ;
   private String[] T01JT16_A12324RecipeNo ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdye001__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye001__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye001__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdye001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JT2", "SELECT Dyelot, ReDye, Machine, Weight, SetTime, ImportStat, RecipeStat, ProgramCre, LiquorRati, Color, Customer, Article, ColourNo, ColourDesc, Length, State, StartTime, EndTime, TypeOfProc, ProcedureN, ProcessTp1, ProcessTp2, Paramet5, Paramet6, Paramet7, Paramet8, Paramet9, Paramet10, Paramet11, Paramet12, Paramet13, Paramet14, Paramet15, Paramet16, Paramet17, Paramet18, Paramet19, Paramet20, OrderNo, LiquorQuan, Text10, Text11, Text12, Text13, Text14, Note1, RequiredBy, RecipeNo FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ?  FOR UPDATE OF Machine, Weight, SetTime, ImportStat, RecipeStat, ProgramCre, LiquorRati, Color, Customer, Article, ColourNo, ColourDesc, Length, State, StartTime, EndTime, TypeOfProc, ProcedureN, ProcessTp1, ProcessTp2, Paramet5, Paramet6, Paramet7, Paramet8, Paramet9, Paramet10, Paramet11, Paramet12, Paramet13, Paramet14, Paramet15, Paramet16, Paramet17, Paramet18, Paramet19, Paramet20, OrderNo, LiquorQuan, Text10, Text11, Text12, Text13, Text14, Note1, RequiredBy, RecipeNo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT3", "SELECT Dyelot, ReDye, Machine, Weight, SetTime, ImportStat, RecipeStat, ProgramCre, LiquorRati, Color, Customer, Article, ColourNo, ColourDesc, Length, State, StartTime, EndTime, TypeOfProc, ProcedureN, ProcessTp1, ProcessTp2, Paramet5, Paramet6, Paramet7, Paramet8, Paramet9, Paramet10, Paramet11, Paramet12, Paramet13, Paramet14, Paramet15, Paramet16, Paramet17, Paramet18, Paramet19, Paramet20, OrderNo, LiquorQuan, Text10, Text11, Text12, Text13, Text14, Note1, RequiredBy, RecipeNo FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT4", "SELECT RecipeNo FROM TXPDYE004 WHERE RecipeNo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Dyelot, TM1.ReDye, TM1.Machine, TM1.Weight, TM1.SetTime, TM1.ImportStat, TM1.RecipeStat, TM1.ProgramCre, TM1.LiquorRati, TM1.Color, TM1.Customer, TM1.Article, TM1.ColourNo, TM1.ColourDesc, TM1.Length, TM1.State, TM1.StartTime, TM1.EndTime, TM1.TypeOfProc, TM1.ProcedureN, TM1.ProcessTp1, TM1.ProcessTp2, TM1.Paramet5, TM1.Paramet6, TM1.Paramet7, TM1.Paramet8, TM1.Paramet9, TM1.Paramet10, TM1.Paramet11, TM1.Paramet12, TM1.Paramet13, TM1.Paramet14, TM1.Paramet15, TM1.Paramet16, TM1.Paramet17, TM1.Paramet18, TM1.Paramet19, TM1.Paramet20, TM1.OrderNo, TM1.LiquorQuan, TM1.Text10, TM1.Text11, TM1.Text12, TM1.Text13, TM1.Text14, TM1.Note1, TM1.RequiredBy, TM1.RecipeNo FROM TXPDYE001 TM1 WHERE TM1.Dyelot = ? and TM1.ReDye = ? ORDER BY TM1.Dyelot, TM1.ReDye ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT6", "SELECT RecipeNo FROM TXPDYE004 WHERE RecipeNo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT7", "SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye FROM TXPDYE001 WHERE Dyelot = ? AND ReDye = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye FROM TXPDYE001 WHERE ( Dyelot > ? or Dyelot = ? and ReDye > ?) ORDER BY Dyelot, ReDye) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JT9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Dyelot, ReDye FROM TXPDYE001 WHERE ( Dyelot < ? or Dyelot = ? and ReDye < ?) ORDER BY Dyelot DESC, ReDye DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JT10", "INSERT INTO TXPDYE001(Dyelot, ReDye, Machine, Weight, SetTime, ImportStat, RecipeStat, ProgramCre, LiquorRati, Color, Customer, Article, ColourNo, ColourDesc, Length, State, StartTime, EndTime, TypeOfProc, ProcedureN, ProcessTp1, ProcessTp2, Paramet5, Paramet6, Paramet7, Paramet8, Paramet9, Paramet10, Paramet11, Paramet12, Paramet13, Paramet14, Paramet15, Paramet16, Paramet17, Paramet18, Paramet19, Paramet20, OrderNo, LiquorQuan, Text10, Text11, Text12, Text13, Text14, Note1, RequiredBy, RecipeNo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDYE001")
         ,new UpdateCursor("T01JT11", "UPDATE TXPDYE001 SET Machine=?, Weight=?, SetTime=?, ImportStat=?, RecipeStat=?, ProgramCre=?, LiquorRati=?, Color=?, Customer=?, Article=?, ColourNo=?, ColourDesc=?, Length=?, State=?, StartTime=?, EndTime=?, TypeOfProc=?, ProcedureN=?, ProcessTp1=?, ProcessTp2=?, Paramet5=?, Paramet6=?, Paramet7=?, Paramet8=?, Paramet9=?, Paramet10=?, Paramet11=?, Paramet12=?, Paramet13=?, Paramet14=?, Paramet15=?, Paramet16=?, Paramet17=?, Paramet18=?, Paramet19=?, Paramet20=?, OrderNo=?, LiquorQuan=?, Text10=?, Text11=?, Text12=?, Text13=?, Text14=?, Note1=?, RequiredBy=?, RecipeNo=?  WHERE Dyelot = ? AND ReDye = ?", GX_NOMASK, "TXPDYE001")
         ,new UpdateCursor("T01JT12", "DELETE FROM TXPDYE001  WHERE Dyelot = ? AND ReDye = ?", GX_NOMASK, "TXPDYE001")
         ,new ForEachCursor("T01JT13", "SELECT * FROM (SELECT Dyelot, ReDye, TreatmentC FROM TXPDYE003 WHERE Dyelot = ? AND ReDye = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JT14", "SELECT * FROM (SELECT Dyelot, ReDye, Correction, CallOff, Counter FROM TXPDYE002 WHERE Dyelot = ? AND ReDye = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JT15", "SELECT /*+ FIRST_ROWS(100) */ Dyelot, ReDye FROM TXPDYE001 ORDER BY Dyelot, ReDye ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JT16", "SELECT RecipeNo FROM TXPDYE004 WHERE RecipeNo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(22);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(23);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(40);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(47);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(48);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(22);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(23);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(40);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(47);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(48);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(22);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(23);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(40);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(42);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(43);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(46);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(47);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(48);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 4, false);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setVarchar(11, (String)parms[10], 20, false);
               stmt.setVarchar(12, (String)parms[11], 20, false);
               stmt.setVarchar(13, (String)parms[12], 20, false);
               stmt.setVarchar(14, (String)parms[13], 20, false);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[40], 2);
               }
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[41], 2);
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[51], 2);
               }
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[52], 2);
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[60], 20);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(40, ((Number) parms[62]).longValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[64], 20);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[66], 20);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[68], 20);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[70], 20);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[72], 20);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[74], 60);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(47, (java.util.Date)parms[76], false);
               }
               stmt.setVarchar(48, (String)parms[77], 50, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 4, false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setVarchar(9, (String)parms[8], 20, false);
               stmt.setVarchar(10, (String)parms[9], 20, false);
               stmt.setVarchar(11, (String)parms[10], 20, false);
               stmt.setVarchar(12, (String)parms[11], 20, false);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[16], false);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[38], 2);
               }
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[39], 2);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[49], 2);
               }
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[50], 2);
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[58], 20);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(38, ((Number) parms[60]).longValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[62], 20);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[64], 20);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[66], 20);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[68], 20);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[70], 20);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[72], 60);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(45, (java.util.Date)parms[74], false);
               }
               stmt.setVarchar(46, (String)parms[75], 50, false);
               stmt.setVarchar(47, (String)parms[76], 20, false);
               stmt.setInt(48, ((Number) parms[77]).intValue());
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               return;
      }
   }

}

