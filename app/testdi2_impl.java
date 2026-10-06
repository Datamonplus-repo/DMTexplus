package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testdi2_impl extends GXDataArea
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
            A1333EstDimCod = (int)(GXutil.lval( httpContext.GetPar( "EstDimCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAS INFORMACION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEstSanfAnc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public testdi2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public testdi2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testdi2_impl.class ));
   }

   public testdi2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TESTDI2.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1333EstDimCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1333EstDimCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1333EstDimCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimCod_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "EstSanfAnc", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3737EstSanfAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3737EstSanfAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3737EstSanfAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "EstSanfGrm", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3738EstSanfGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3738EstSanfGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3738EstSanfGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "EstCalAnc", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3739EstCalAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3739EstCalAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3739EstCalAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "EstCalGrm", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3740EstCalGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3740EstCalGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3740EstCalGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "EstRamAnc", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3741EstRamAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3741EstRamAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3741EstRamAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "EstRamGrm", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3742EstRamGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3742EstRamGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3742EstRamGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "EstSanfEA", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3872EstSanfEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfEA_Enabled!=0) ? localUtil.format( A3872EstSanfEA, "ZZ9.99") : localUtil.format( A3872EstSanfEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "EstSanfEL", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3873EstSanfEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfEL_Enabled!=0) ? localUtil.format( A3873EstSanfEL, "ZZ9.99") : localUtil.format( A3873EstSanfEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "EstCalEA", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3874EstCalEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalEA_Enabled!=0) ? localUtil.format( A3874EstCalEA, "ZZ9.99") : localUtil.format( A3874EstCalEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "EstCalEL", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3875EstCalEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalEL_Enabled!=0) ? localUtil.format( A3875EstCalEL, "ZZ9.99") : localUtil.format( A3875EstCalEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "EstRamEA", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3876EstRamEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamEA_Enabled!=0) ? localUtil.format( A3876EstRamEA, "ZZ9.99") : localUtil.format( A3876EstRamEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "EstRamEL", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3877EstRamEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamEL_Enabled!=0) ? localUtil.format( A3877EstRamEL, "ZZ9.99") : localUtil.format( A3877EstRamEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TESTDI2.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TESTDI2.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TESTDI2.htm");
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
      e11EO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1333EstDimCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1333EstDimCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3737EstSanfAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3737EstSanfAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3738EstSanfGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3738EstSanfGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3739EstCalAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3739EstCalAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3740EstCalGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3740EstCalGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3741EstRamAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3741EstRamAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3742EstRamGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3742EstRamGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3872EstSanfEA = localUtil.ctond( httpContext.cgiGet( "Z3872EstSanfEA")) ;
            Z3873EstSanfEL = localUtil.ctond( httpContext.cgiGet( "Z3873EstSanfEL")) ;
            Z3874EstCalEA = localUtil.ctond( httpContext.cgiGet( "Z3874EstCalEA")) ;
            Z3875EstCalEL = localUtil.ctond( httpContext.cgiGet( "Z3875EstCalEL")) ;
            Z3876EstRamEA = localUtil.ctond( httpContext.cgiGet( "Z3876EstRamEA")) ;
            Z3877EstRamEL = localUtil.ctond( httpContext.cgiGet( "Z3877EstRamEL")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1333EstDimCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEstDimCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstSanfAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3737EstSanfAnc = (short)(0) ;
               n3737EstSanfAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
            }
            else
            {
               A3737EstSanfAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3737EstSanfAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFGRM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstSanfGrm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3738EstSanfGrm = (short)(0) ;
               n3738EstSanfGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
            }
            else
            {
               A3738EstSanfGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3738EstSanfGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstCalAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3739EstCalAnc = (short)(0) ;
               n3739EstCalAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
            }
            else
            {
               A3739EstCalAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3739EstCalAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALGRM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstCalGrm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3740EstCalGrm = (short)(0) ;
               n3740EstCalGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
            }
            else
            {
               A3740EstCalGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3740EstCalGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstRamAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3741EstRamAnc = (short)(0) ;
               n3741EstRamAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
            }
            else
            {
               A3741EstRamAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3741EstRamAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMGRM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstRamGrm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3742EstRamGrm = (short)(0) ;
               n3742EstRamGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
            }
            else
            {
               A3742EstRamGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3742EstRamGrm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFEA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstSanfEA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3872EstSanfEA = DecimalUtil.ZERO ;
               n3872EstSanfEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
            }
            else
            {
               A3872EstSanfEA = localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)) ;
               n3872EstSanfEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstSanfEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3873EstSanfEL = DecimalUtil.ZERO ;
               n3873EstSanfEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
            }
            else
            {
               A3873EstSanfEL = localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)) ;
               n3873EstSanfEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALEA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstCalEA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3874EstCalEA = DecimalUtil.ZERO ;
               n3874EstCalEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
            }
            else
            {
               A3874EstCalEA = localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)) ;
               n3874EstCalEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstCalEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3875EstCalEL = DecimalUtil.ZERO ;
               n3875EstCalEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
            }
            else
            {
               A3875EstCalEL = localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)) ;
               n3875EstCalEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMEA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstRamEA_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3876EstRamEA = DecimalUtil.ZERO ;
               n3876EstRamEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
            }
            else
            {
               A3876EstRamEA = localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)) ;
               n3876EstRamEA = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstRamEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3877EstRamEL = DecimalUtil.ZERO ;
               n3877EstRamEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
            }
            else
            {
               A3877EstRamEL = localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)) ;
               n3877EstRamEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
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
               A1333EstDimCod = (int)(GXutil.lval( httpContext.GetPar( "EstDimCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               getEqualNoModal( ) ;
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
                        e11EO2 ();
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
            initAllEO186( ) ;
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
      disableAttributesEO186( ) ;
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

   public void confirm_EO0( )
   {
      beforeValidateEO186( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsEO186( ) ;
         }
         else
         {
            checkExtendedTableEO186( ) ;
            if ( AnyError == 0 )
            {
               zmEO186( 4) ;
            }
            closeExtendedTableCursorsEO186( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesEO0( ) ;
      }
   }

   public void resetCaptionEO0( )
   {
   }

   public void e11EO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      testdi2_impl.this.A396EmprCod = GXv_char1[0] ;
      testdi2_impl.this.AV16EmprNom = GXv_char2[0] ;
      testdi2_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV21LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      GXt_char4 = AV20Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char4 = AV41LitNTest ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT374_", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV41LitNTest = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41LitNTest", AV41LitNTest);
      GXt_char4 = AV43LitAncho ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1023_", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV43LitAncho = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43LitAncho", AV43LitAncho);
      AV46LitAnchoE = AV43LitAncho ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46LitAnchoE", AV46LitAnchoE);
      GXt_char4 = AV44LitLargo ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA018", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV44LitLargo = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44LitLargo", AV44LitLargo);
      GXt_char4 = AV45LitEnco ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ADA016", ""), (byte)(99), GXv_char3) ;
      testdi2_impl.this.GXt_char4 = GXv_char3[0] ;
      AV45LitEnco = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45LitEnco", AV45LitEnco);
   }

   public void zmEO186( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3737EstSanfAnc = T00EO3_A3737EstSanfAnc[0] ;
            Z3738EstSanfGrm = T00EO3_A3738EstSanfGrm[0] ;
            Z3739EstCalAnc = T00EO3_A3739EstCalAnc[0] ;
            Z3740EstCalGrm = T00EO3_A3740EstCalGrm[0] ;
            Z3741EstRamAnc = T00EO3_A3741EstRamAnc[0] ;
            Z3742EstRamGrm = T00EO3_A3742EstRamGrm[0] ;
            Z3872EstSanfEA = T00EO3_A3872EstSanfEA[0] ;
            Z3873EstSanfEL = T00EO3_A3873EstSanfEL[0] ;
            Z3874EstCalEA = T00EO3_A3874EstCalEA[0] ;
            Z3875EstCalEL = T00EO3_A3875EstCalEL[0] ;
            Z3876EstRamEA = T00EO3_A3876EstRamEA[0] ;
            Z3877EstRamEL = T00EO3_A3877EstRamEL[0] ;
         }
         else
         {
            Z3737EstSanfAnc = A3737EstSanfAnc ;
            Z3738EstSanfGrm = A3738EstSanfGrm ;
            Z3739EstCalAnc = A3739EstCalAnc ;
            Z3740EstCalGrm = A3740EstCalGrm ;
            Z3741EstRamAnc = A3741EstRamAnc ;
            Z3742EstRamGrm = A3742EstRamGrm ;
            Z3872EstSanfEA = A3872EstSanfEA ;
            Z3873EstSanfEL = A3873EstSanfEL ;
            Z3874EstCalEA = A3874EstCalEA ;
            Z3875EstCalEL = A3875EstCalEL ;
            Z3876EstRamEA = A3876EstRamEA ;
            Z3877EstRamEL = A3877EstRamEL ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z1333EstDimCod = A1333EstDimCod ;
         Z3737EstSanfAnc = A3737EstSanfAnc ;
         Z3738EstSanfGrm = A3738EstSanfGrm ;
         Z3739EstCalAnc = A3739EstCalAnc ;
         Z3740EstCalGrm = A3740EstCalGrm ;
         Z3741EstRamAnc = A3741EstRamAnc ;
         Z3742EstRamGrm = A3742EstRamGrm ;
         Z3872EstSanfEA = A3872EstSanfEA ;
         Z3873EstSanfEL = A3873EstSanfEL ;
         Z3874EstCalEA = A3874EstCalEA ;
         Z3875EstCalEL = A3875EstCalEL ;
         Z3876EstRamEA = A3876EstRamEA ;
         Z3877EstRamEL = A3877EstRamEL ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      /* Using cursor T00EO4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00EO4_A407EmprNom[0] ;
      n407EmprNom = T00EO4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar", ""), 1, "");
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

   public void loadEO186( )
   {
      /* Using cursor T00EO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound186 = (short)(1) ;
         A407EmprNom = T00EO5_A407EmprNom[0] ;
         n407EmprNom = T00EO5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3737EstSanfAnc = T00EO5_A3737EstSanfAnc[0] ;
         n3737EstSanfAnc = T00EO5_n3737EstSanfAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         A3738EstSanfGrm = T00EO5_A3738EstSanfGrm[0] ;
         n3738EstSanfGrm = T00EO5_n3738EstSanfGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         A3739EstCalAnc = T00EO5_A3739EstCalAnc[0] ;
         n3739EstCalAnc = T00EO5_n3739EstCalAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         A3740EstCalGrm = T00EO5_A3740EstCalGrm[0] ;
         n3740EstCalGrm = T00EO5_n3740EstCalGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         A3741EstRamAnc = T00EO5_A3741EstRamAnc[0] ;
         n3741EstRamAnc = T00EO5_n3741EstRamAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         A3742EstRamGrm = T00EO5_A3742EstRamGrm[0] ;
         n3742EstRamGrm = T00EO5_n3742EstRamGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         A3872EstSanfEA = T00EO5_A3872EstSanfEA[0] ;
         n3872EstSanfEA = T00EO5_n3872EstSanfEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         A3873EstSanfEL = T00EO5_A3873EstSanfEL[0] ;
         n3873EstSanfEL = T00EO5_n3873EstSanfEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         A3874EstCalEA = T00EO5_A3874EstCalEA[0] ;
         n3874EstCalEA = T00EO5_n3874EstCalEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         A3875EstCalEL = T00EO5_A3875EstCalEL[0] ;
         n3875EstCalEL = T00EO5_n3875EstCalEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         A3876EstRamEA = T00EO5_A3876EstRamEA[0] ;
         n3876EstRamEA = T00EO5_n3876EstRamEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         A3877EstRamEL = T00EO5_A3877EstRamEL[0] ;
         n3877EstRamEL = T00EO5_n3877EstRamEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         zmEO186( -3) ;
      }
      pr_default.close(3);
      onLoadActionsEO186( ) ;
   }

   public void onLoadActionsEO186( )
   {
   }

   public void checkExtendedTableEO186( )
   {
      nIsDirty_186 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsEO186( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyEO186( )
   {
      /* Using cursor T00EO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound186 = (short)(1) ;
      }
      else
      {
         RcdFound186 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00EO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T00EO3_A1333EstDimCod[0] == A1333EstDimCod ) && ( GXutil.strcmp(T00EO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmEO186( 3) ;
         RcdFound186 = (short)(1) ;
         A3737EstSanfAnc = T00EO3_A3737EstSanfAnc[0] ;
         n3737EstSanfAnc = T00EO3_n3737EstSanfAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         A3738EstSanfGrm = T00EO3_A3738EstSanfGrm[0] ;
         n3738EstSanfGrm = T00EO3_n3738EstSanfGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         A3739EstCalAnc = T00EO3_A3739EstCalAnc[0] ;
         n3739EstCalAnc = T00EO3_n3739EstCalAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         A3740EstCalGrm = T00EO3_A3740EstCalGrm[0] ;
         n3740EstCalGrm = T00EO3_n3740EstCalGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         A3741EstRamAnc = T00EO3_A3741EstRamAnc[0] ;
         n3741EstRamAnc = T00EO3_n3741EstRamAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         A3742EstRamGrm = T00EO3_A3742EstRamGrm[0] ;
         n3742EstRamGrm = T00EO3_n3742EstRamGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         A3872EstSanfEA = T00EO3_A3872EstSanfEA[0] ;
         n3872EstSanfEA = T00EO3_n3872EstSanfEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         A3873EstSanfEL = T00EO3_A3873EstSanfEL[0] ;
         n3873EstSanfEL = T00EO3_n3873EstSanfEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         A3874EstCalEA = T00EO3_A3874EstCalEA[0] ;
         n3874EstCalEA = T00EO3_n3874EstCalEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         A3875EstCalEL = T00EO3_A3875EstCalEL[0] ;
         n3875EstCalEL = T00EO3_n3875EstCalEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         A3876EstRamEA = T00EO3_A3876EstRamEA[0] ;
         n3876EstRamEA = T00EO3_n3876EstRamEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         A3877EstRamEL = T00EO3_A3877EstRamEL[0] ;
         n3877EstRamEL = T00EO3_n3877EstRamEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         Z396EmprCod = A396EmprCod ;
         Z1333EstDimCod = A1333EstDimCod ;
         sMode186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadEO186( ) ;
         if ( AnyError == 1 )
         {
            RcdFound186 = (short)(0) ;
            initializeNonKeyEO186( ) ;
         }
         Gx_mode = sMode186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound186 = (short)(0) ;
         initializeNonKeyEO186( ) ;
         sMode186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyEO186( ) ;
      if ( RcdFound186 == 0 )
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
      RcdFound186 = (short)(0) ;
      /* Using cursor T00EO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00EO7_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EO7_A1333EstDimCod[0] == A1333EstDimCod ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00EO7_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EO7_A1333EstDimCod[0] == A1333EstDimCod ) )
         {
            RcdFound186 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound186 = (short)(0) ;
      /* Using cursor T00EO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00EO8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EO8_A1333EstDimCod[0] == A1333EstDimCod ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T00EO8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00EO8_A1333EstDimCod[0] == A1333EstDimCod ) )
         {
            RcdFound186 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyEO186( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEstSanfAnc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertEO186( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound186 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEstSanfAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateEO186( ) ;
               GX_FocusControl = edtEstSanfAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEstSanfAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertEO186( ) ;
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
                  GX_FocusControl = edtEstSanfAnc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertEO186( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEstSanfAnc_Internalname ;
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
      getKeyEO186( ) ;
      if ( RcdFound186 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
         {
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "testdi2");
      GX_FocusControl = edtEstSanfAnc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_EO0( ) ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEstSanfAnc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartEO186( ) ;
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstSanfAnc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndEO186( ) ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstSanfAnc_Internalname ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstSanfAnc_Internalname ;
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
      scanStartEO186( ) ;
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound186 != 0 )
         {
            scanNextEO186( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEstSanfAnc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndEO186( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyEO186( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00EO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESDIM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z3737EstSanfAnc != T00EO2_A3737EstSanfAnc[0] ) || ( Z3738EstSanfGrm != T00EO2_A3738EstSanfGrm[0] ) || ( Z3739EstCalAnc != T00EO2_A3739EstCalAnc[0] ) || ( Z3740EstCalGrm != T00EO2_A3740EstCalGrm[0] ) || ( Z3741EstRamAnc != T00EO2_A3741EstRamAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3742EstRamGrm != T00EO2_A3742EstRamGrm[0] ) || ( DecimalUtil.compareTo(Z3872EstSanfEA, T00EO2_A3872EstSanfEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3873EstSanfEL, T00EO2_A3873EstSanfEL[0]) != 0 ) || ( DecimalUtil.compareTo(Z3874EstCalEA, T00EO2_A3874EstCalEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3875EstCalEL, T00EO2_A3875EstCalEL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3876EstRamEA, T00EO2_A3876EstRamEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3877EstRamEL, T00EO2_A3877EstRamEL[0]) != 0 ) )
         {
            if ( Z3737EstSanfAnc != T00EO2_A3737EstSanfAnc[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstSanfAnc");
               GXutil.writeLogRaw("Old: ",Z3737EstSanfAnc);
               GXutil.writeLogRaw("Current: ",T00EO2_A3737EstSanfAnc[0]);
            }
            if ( Z3738EstSanfGrm != T00EO2_A3738EstSanfGrm[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstSanfGrm");
               GXutil.writeLogRaw("Old: ",Z3738EstSanfGrm);
               GXutil.writeLogRaw("Current: ",T00EO2_A3738EstSanfGrm[0]);
            }
            if ( Z3739EstCalAnc != T00EO2_A3739EstCalAnc[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstCalAnc");
               GXutil.writeLogRaw("Old: ",Z3739EstCalAnc);
               GXutil.writeLogRaw("Current: ",T00EO2_A3739EstCalAnc[0]);
            }
            if ( Z3740EstCalGrm != T00EO2_A3740EstCalGrm[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstCalGrm");
               GXutil.writeLogRaw("Old: ",Z3740EstCalGrm);
               GXutil.writeLogRaw("Current: ",T00EO2_A3740EstCalGrm[0]);
            }
            if ( Z3741EstRamAnc != T00EO2_A3741EstRamAnc[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstRamAnc");
               GXutil.writeLogRaw("Old: ",Z3741EstRamAnc);
               GXutil.writeLogRaw("Current: ",T00EO2_A3741EstRamAnc[0]);
            }
            if ( Z3742EstRamGrm != T00EO2_A3742EstRamGrm[0] )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstRamGrm");
               GXutil.writeLogRaw("Old: ",Z3742EstRamGrm);
               GXutil.writeLogRaw("Current: ",T00EO2_A3742EstRamGrm[0]);
            }
            if ( DecimalUtil.compareTo(Z3872EstSanfEA, T00EO2_A3872EstSanfEA[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstSanfEA");
               GXutil.writeLogRaw("Old: ",Z3872EstSanfEA);
               GXutil.writeLogRaw("Current: ",T00EO2_A3872EstSanfEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3873EstSanfEL, T00EO2_A3873EstSanfEL[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstSanfEL");
               GXutil.writeLogRaw("Old: ",Z3873EstSanfEL);
               GXutil.writeLogRaw("Current: ",T00EO2_A3873EstSanfEL[0]);
            }
            if ( DecimalUtil.compareTo(Z3874EstCalEA, T00EO2_A3874EstCalEA[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstCalEA");
               GXutil.writeLogRaw("Old: ",Z3874EstCalEA);
               GXutil.writeLogRaw("Current: ",T00EO2_A3874EstCalEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3875EstCalEL, T00EO2_A3875EstCalEL[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstCalEL");
               GXutil.writeLogRaw("Old: ",Z3875EstCalEL);
               GXutil.writeLogRaw("Current: ",T00EO2_A3875EstCalEL[0]);
            }
            if ( DecimalUtil.compareTo(Z3876EstRamEA, T00EO2_A3876EstRamEA[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstRamEA");
               GXutil.writeLogRaw("Old: ",Z3876EstRamEA);
               GXutil.writeLogRaw("Current: ",T00EO2_A3876EstRamEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3877EstRamEL, T00EO2_A3877EstRamEL[0]) != 0 )
            {
               GXutil.writeLogln("testdi2:[seudo value changed for attri]"+"EstRamEL");
               GXutil.writeLogRaw("Old: ",Z3877EstRamEL);
               GXutil.writeLogRaw("Current: ",T00EO2_A3877EstRamEL[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESDIM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertEO186( )
   {
      beforeValidateEO186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableEO186( ) ;
      }
      if ( AnyError == 0 )
      {
         zmEO186( 0) ;
         checkOptimisticConcurrencyEO186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmEO186( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertEO186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00EO9 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A1333EstDimCod), Boolean.valueOf(n3737EstSanfAnc), Short.valueOf(A3737EstSanfAnc), Boolean.valueOf(n3738EstSanfGrm), Short.valueOf(A3738EstSanfGrm), Boolean.valueOf(n3739EstCalAnc), Short.valueOf(A3739EstCalAnc), Boolean.valueOf(n3740EstCalGrm), Short.valueOf(A3740EstCalGrm), Boolean.valueOf(n3741EstRamAnc), Short.valueOf(A3741EstRamAnc), Boolean.valueOf(n3742EstRamGrm), Short.valueOf(A3742EstRamGrm), Boolean.valueOf(n3872EstSanfEA), A3872EstSanfEA, Boolean.valueOf(n3873EstSanfEL), A3873EstSanfEL, Boolean.valueOf(n3874EstCalEA), A3874EstCalEA, Boolean.valueOf(n3875EstCalEL), A3875EstCalEL, Boolean.valueOf(n3876EstRamEA), A3876EstRamEA, Boolean.valueOf(n3877EstRamEL), A3877EstRamEL, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
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
                        resetCaptionEO0( ) ;
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
            loadEO186( ) ;
         }
         endLevelEO186( ) ;
      }
      closeExtendedTableCursorsEO186( ) ;
   }

   public void updateEO186( )
   {
      beforeValidateEO186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableEO186( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyEO186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmEO186( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateEO186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00EO10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n3737EstSanfAnc), Short.valueOf(A3737EstSanfAnc), Boolean.valueOf(n3738EstSanfGrm), Short.valueOf(A3738EstSanfGrm), Boolean.valueOf(n3739EstCalAnc), Short.valueOf(A3739EstCalAnc), Boolean.valueOf(n3740EstCalGrm), Short.valueOf(A3740EstCalGrm), Boolean.valueOf(n3741EstRamAnc), Short.valueOf(A3741EstRamAnc), Boolean.valueOf(n3742EstRamGrm), Short.valueOf(A3742EstRamGrm), Boolean.valueOf(n3872EstSanfEA), A3872EstSanfEA, Boolean.valueOf(n3873EstSanfEL), A3873EstSanfEL, Boolean.valueOf(n3874EstCalEA), A3874EstCalEA, Boolean.valueOf(n3875EstCalEL), A3875EstCalEL, Boolean.valueOf(n3876EstRamEA), A3876EstRamEA, Boolean.valueOf(n3877EstRamEL), A3877EstRamEL, A396EmprCod, Integer.valueOf(A1333EstDimCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESDIM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateEO186( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionEO0( ) ;
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
         endLevelEO186( ) ;
      }
      closeExtendedTableCursorsEO186( ) ;
   }

   public void deferredUpdateEO186( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateEO186( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyEO186( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsEO186( ) ;
         afterConfirmEO186( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteEO186( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00EO11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound186 == 0 )
                     {
                        initAllEO186( ) ;
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
                     resetCaptionEO0( ) ;
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
      sMode186 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelEO186( ) ;
      Gx_mode = sMode186 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsEO186( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelEO186( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteEO186( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "testdi2");
         if ( AnyError == 0 )
         {
            confirmValuesEO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "testdi2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartEO186( )
   {
      /* Scan By routine */
      /* Using cursor T00EO12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      RcdFound186 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound186 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextEO186( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound186 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound186 = (short)(1) ;
      }
   }

   public void scanEndEO186( )
   {
      pr_default.close(10);
   }

   public void afterConfirmEO186( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertEO186( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateEO186( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteEO186( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteEO186( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateEO186( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesEO186( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEstDimCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstSanfAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfAnc_Enabled), 5, 0), true);
      edtEstSanfGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfGrm_Enabled), 5, 0), true);
      edtEstCalAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalAnc_Enabled), 5, 0), true);
      edtEstCalGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalGrm_Enabled), 5, 0), true);
      edtEstRamAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamAnc_Enabled), 5, 0), true);
      edtEstRamGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamGrm_Enabled), 5, 0), true);
      edtEstSanfEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfEA_Enabled), 5, 0), true);
      edtEstSanfEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfEL_Enabled), 5, 0), true);
      edtEstCalEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalEA_Enabled), 5, 0), true);
      edtEstCalEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalEL_Enabled), 5, 0), true);
      edtEstRamEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamEA_Enabled), 5, 0), true);
      edtEstRamEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamEL_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesEO186( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesEO0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.testdi2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A1333EstDimCod,8,0))}, new String[] {"EmprCod","EstDimCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1333EstDimCod", GXutil.ltrim( localUtil.ntoc( Z1333EstDimCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( Z3737EstSanfAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( Z3738EstSanfGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( Z3739EstCalAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( Z3740EstCalGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( Z3741EstRamAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( Z3742EstRamGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( Z3872EstSanfEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( Z3873EstSanfEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3874EstCalEA", GXutil.ltrim( localUtil.ntoc( Z3874EstCalEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3875EstCalEL", GXutil.ltrim( localUtil.ntoc( Z3875EstCalEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3876EstRamEA", GXutil.ltrim( localUtil.ntoc( Z3876EstRamEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3877EstRamEL", GXutil.ltrim( localUtil.ntoc( Z3877EstRamEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.testdi2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A1333EstDimCod,8,0))}, new String[] {"EmprCod","EstDimCod"})  ;
   }

   public String getPgmname( )
   {
      return "TESTDI2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAS INFORMACION", "") ;
   }

   public void initializeNonKeyEO186( )
   {
      A3737EstSanfAnc = (short)(0) ;
      n3737EstSanfAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
      A3738EstSanfGrm = (short)(0) ;
      n3738EstSanfGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
      A3739EstCalAnc = (short)(0) ;
      n3739EstCalAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
      A3740EstCalGrm = (short)(0) ;
      n3740EstCalGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
      A3741EstRamAnc = (short)(0) ;
      n3741EstRamAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
      A3742EstRamGrm = (short)(0) ;
      n3742EstRamGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
      A3872EstSanfEA = DecimalUtil.ZERO ;
      n3872EstSanfEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
      A3873EstSanfEL = DecimalUtil.ZERO ;
      n3873EstSanfEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
      A3874EstCalEA = DecimalUtil.ZERO ;
      n3874EstCalEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
      A3875EstCalEL = DecimalUtil.ZERO ;
      n3875EstCalEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
      A3876EstRamEA = DecimalUtil.ZERO ;
      n3876EstRamEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
      A3877EstRamEL = DecimalUtil.ZERO ;
      n3877EstRamEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
      Z3737EstSanfAnc = (short)(0) ;
      Z3738EstSanfGrm = (short)(0) ;
      Z3739EstCalAnc = (short)(0) ;
      Z3740EstCalGrm = (short)(0) ;
      Z3741EstRamAnc = (short)(0) ;
      Z3742EstRamGrm = (short)(0) ;
      Z3872EstSanfEA = DecimalUtil.ZERO ;
      Z3873EstSanfEL = DecimalUtil.ZERO ;
      Z3874EstCalEA = DecimalUtil.ZERO ;
      Z3875EstCalEL = DecimalUtil.ZERO ;
      Z3876EstRamEA = DecimalUtil.ZERO ;
      Z3877EstRamEL = DecimalUtil.ZERO ;
   }

   public void initAllEO186( )
   {
      initializeNonKeyEO186( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241514036", true, true);
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
      httpContext.AddJavascriptSource("testdi2.js", "?20268241514036", false, true);
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
      edtEstDimCod_Internalname = "ESTDIMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstSanfAnc_Internalname = "ESTSANFANC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstSanfGrm_Internalname = "ESTSANFGRM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEstCalAnc_Internalname = "ESTCALANC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEstCalGrm_Internalname = "ESTCALGRM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEstRamAnc_Internalname = "ESTRAMANC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEstRamGrm_Internalname = "ESTRAMGRM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEstSanfEA_Internalname = "ESTSANFEA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEstSanfEL_Internalname = "ESTSANFEL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEstCalEA_Internalname = "ESTCALEA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEstCalEL_Internalname = "ESTCALEL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEstRamEA_Internalname = "ESTRAMEA" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEstRamEL_Internalname = "ESTRAMEL" ;
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
      Form.setCaption( httpContext.getMessage( "MAS INFORMACION", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtEstRamEL_Jsonclick = "" ;
      edtEstRamEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamEL_Enabled = 1 ;
      edtEstRamEA_Jsonclick = "" ;
      edtEstRamEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamEA_Enabled = 1 ;
      edtEstCalEL_Jsonclick = "" ;
      edtEstCalEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalEL_Enabled = 1 ;
      edtEstCalEA_Jsonclick = "" ;
      edtEstCalEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalEA_Enabled = 1 ;
      edtEstSanfEL_Jsonclick = "" ;
      edtEstSanfEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfEL_Enabled = 1 ;
      edtEstSanfEA_Jsonclick = "" ;
      edtEstSanfEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfEA_Enabled = 1 ;
      edtEstRamGrm_Jsonclick = "" ;
      edtEstRamGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamGrm_Enabled = 1 ;
      edtEstRamAnc_Jsonclick = "" ;
      edtEstRamAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamAnc_Enabled = 1 ;
      edtEstCalGrm_Jsonclick = "" ;
      edtEstCalGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalGrm_Enabled = 1 ;
      edtEstCalAnc_Jsonclick = "" ;
      edtEstCalAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalAnc_Enabled = 1 ;
      edtEstSanfGrm_Jsonclick = "" ;
      edtEstSanfGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfGrm_Enabled = 1 ;
      edtEstSanfAnc_Jsonclick = "" ;
      edtEstSanfAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfAnc_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstDimCod_Jsonclick = "" ;
      edtEstDimCod_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimCod_Enabled = 0 ;
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
      /* Using cursor T00EO13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00EO13_A407EmprNom[0] ;
      n407EmprNom = T00EO13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtEstSanfAnc_Internalname ;
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

   public void valid_Estdimcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( A3737EstSanfAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( A3738EstSanfGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( A3739EstCalAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( A3740EstCalGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( A3741EstRamAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( A3742EstRamGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( A3872EstSanfEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( A3873EstSanfEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrim( localUtil.ntoc( A3874EstCalEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrim( localUtil.ntoc( A3875EstCalEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrim( localUtil.ntoc( A3876EstRamEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrim( localUtil.ntoc( A3877EstRamEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1333EstDimCod", GXutil.ltrim( localUtil.ntoc( Z1333EstDimCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( Z3737EstSanfAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( Z3738EstSanfGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( Z3739EstCalAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( Z3740EstCalGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( Z3741EstRamAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( Z3742EstRamGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( Z3872EstSanfEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( Z3873EstSanfEL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3874EstCalEA", GXutil.ltrim( localUtil.ntoc( Z3874EstCalEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3875EstCalEL", GXutil.ltrim( localUtil.ntoc( Z3875EstCalEL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3876EstRamEA", GXutil.ltrim( localUtil.ntoc( Z3876EstRamEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3877EstRamEL", GXutil.ltrim( localUtil.ntoc( Z3877EstRamEL, (byte)(6), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1333EstDimCod',fld:'ESTDIMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTDIMCOD","{handler:'valid_Estdimcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1333EstDimCod',fld:'ESTDIMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTDIMCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3737EstSanfAnc',fld:'ESTSANFANC',pic:'ZZZ9'},{av:'A3738EstSanfGrm',fld:'ESTSANFGRM',pic:'ZZZ9'},{av:'A3739EstCalAnc',fld:'ESTCALANC',pic:'ZZZ9'},{av:'A3740EstCalGrm',fld:'ESTCALGRM',pic:'ZZZ9'},{av:'A3741EstRamAnc',fld:'ESTRAMANC',pic:'ZZZ9'},{av:'A3742EstRamGrm',fld:'ESTRAMGRM',pic:'ZZZ9'},{av:'A3872EstSanfEA',fld:'ESTSANFEA',pic:'ZZ9.99'},{av:'A3873EstSanfEL',fld:'ESTSANFEL',pic:'ZZ9.99'},{av:'A3874EstCalEA',fld:'ESTCALEA',pic:'ZZ9.99'},{av:'A3875EstCalEL',fld:'ESTCALEL',pic:'ZZ9.99'},{av:'A3876EstRamEA',fld:'ESTRAMEA',pic:'ZZ9.99'},{av:'A3877EstRamEL',fld:'ESTRAMEL',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1333EstDimCod'},{av:'Z407EmprNom'},{av:'Z3737EstSanfAnc'},{av:'Z3738EstSanfGrm'},{av:'Z3739EstCalAnc'},{av:'Z3740EstCalGrm'},{av:'Z3741EstRamAnc'},{av:'Z3742EstRamGrm'},{av:'Z3872EstSanfEA'},{av:'Z3873EstSanfEL'},{av:'Z3874EstCalEA'},{av:'Z3875EstCalEL'},{av:'Z3876EstRamEA'},{av:'Z3877EstRamEL'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z3872EstSanfEA = DecimalUtil.ZERO ;
      Z3873EstSanfEL = DecimalUtil.ZERO ;
      Z3874EstCalEA = DecimalUtil.ZERO ;
      Z3875EstCalEL = DecimalUtil.ZERO ;
      Z3876EstRamEA = DecimalUtil.ZERO ;
      Z3877EstRamEL = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A3872EstSanfEA = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A3873EstSanfEL = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A3874EstCalEA = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A3875EstCalEL = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A3876EstRamEA = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A3877EstRamEL = DecimalUtil.ZERO ;
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
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      AV21LitFe = "" ;
      AV20Lit0 = "" ;
      AV41LitNTest = "" ;
      AV43LitAncho = "" ;
      AV46LitAnchoE = "" ;
      AV44LitLargo = "" ;
      AV45LitEnco = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T00EO4_A407EmprNom = new String[] {""} ;
      T00EO4_n407EmprNom = new boolean[] {false} ;
      T00EO5_A1333EstDimCod = new int[1] ;
      T00EO5_A407EmprNom = new String[] {""} ;
      T00EO5_n407EmprNom = new boolean[] {false} ;
      T00EO5_A3737EstSanfAnc = new short[1] ;
      T00EO5_n3737EstSanfAnc = new boolean[] {false} ;
      T00EO5_A3738EstSanfGrm = new short[1] ;
      T00EO5_n3738EstSanfGrm = new boolean[] {false} ;
      T00EO5_A3739EstCalAnc = new short[1] ;
      T00EO5_n3739EstCalAnc = new boolean[] {false} ;
      T00EO5_A3740EstCalGrm = new short[1] ;
      T00EO5_n3740EstCalGrm = new boolean[] {false} ;
      T00EO5_A3741EstRamAnc = new short[1] ;
      T00EO5_n3741EstRamAnc = new boolean[] {false} ;
      T00EO5_A3742EstRamGrm = new short[1] ;
      T00EO5_n3742EstRamGrm = new boolean[] {false} ;
      T00EO5_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3872EstSanfEA = new boolean[] {false} ;
      T00EO5_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3873EstSanfEL = new boolean[] {false} ;
      T00EO5_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3874EstCalEA = new boolean[] {false} ;
      T00EO5_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3875EstCalEL = new boolean[] {false} ;
      T00EO5_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3876EstRamEA = new boolean[] {false} ;
      T00EO5_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO5_n3877EstRamEL = new boolean[] {false} ;
      T00EO5_A396EmprCod = new String[] {""} ;
      T00EO6_A396EmprCod = new String[] {""} ;
      T00EO6_A1333EstDimCod = new int[1] ;
      T00EO3_A1333EstDimCod = new int[1] ;
      T00EO3_A3737EstSanfAnc = new short[1] ;
      T00EO3_n3737EstSanfAnc = new boolean[] {false} ;
      T00EO3_A3738EstSanfGrm = new short[1] ;
      T00EO3_n3738EstSanfGrm = new boolean[] {false} ;
      T00EO3_A3739EstCalAnc = new short[1] ;
      T00EO3_n3739EstCalAnc = new boolean[] {false} ;
      T00EO3_A3740EstCalGrm = new short[1] ;
      T00EO3_n3740EstCalGrm = new boolean[] {false} ;
      T00EO3_A3741EstRamAnc = new short[1] ;
      T00EO3_n3741EstRamAnc = new boolean[] {false} ;
      T00EO3_A3742EstRamGrm = new short[1] ;
      T00EO3_n3742EstRamGrm = new boolean[] {false} ;
      T00EO3_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3872EstSanfEA = new boolean[] {false} ;
      T00EO3_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3873EstSanfEL = new boolean[] {false} ;
      T00EO3_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3874EstCalEA = new boolean[] {false} ;
      T00EO3_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3875EstCalEL = new boolean[] {false} ;
      T00EO3_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3876EstRamEA = new boolean[] {false} ;
      T00EO3_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO3_n3877EstRamEL = new boolean[] {false} ;
      T00EO3_A396EmprCod = new String[] {""} ;
      sMode186 = "" ;
      T00EO7_A396EmprCod = new String[] {""} ;
      T00EO7_A1333EstDimCod = new int[1] ;
      T00EO8_A396EmprCod = new String[] {""} ;
      T00EO8_A1333EstDimCod = new int[1] ;
      T00EO2_A1333EstDimCod = new int[1] ;
      T00EO2_A3737EstSanfAnc = new short[1] ;
      T00EO2_n3737EstSanfAnc = new boolean[] {false} ;
      T00EO2_A3738EstSanfGrm = new short[1] ;
      T00EO2_n3738EstSanfGrm = new boolean[] {false} ;
      T00EO2_A3739EstCalAnc = new short[1] ;
      T00EO2_n3739EstCalAnc = new boolean[] {false} ;
      T00EO2_A3740EstCalGrm = new short[1] ;
      T00EO2_n3740EstCalGrm = new boolean[] {false} ;
      T00EO2_A3741EstRamAnc = new short[1] ;
      T00EO2_n3741EstRamAnc = new boolean[] {false} ;
      T00EO2_A3742EstRamGrm = new short[1] ;
      T00EO2_n3742EstRamGrm = new boolean[] {false} ;
      T00EO2_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3872EstSanfEA = new boolean[] {false} ;
      T00EO2_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3873EstSanfEL = new boolean[] {false} ;
      T00EO2_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3874EstCalEA = new boolean[] {false} ;
      T00EO2_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3875EstCalEL = new boolean[] {false} ;
      T00EO2_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3876EstRamEA = new boolean[] {false} ;
      T00EO2_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00EO2_n3877EstRamEL = new boolean[] {false} ;
      T00EO2_A396EmprCod = new String[] {""} ;
      T00EO12_A396EmprCod = new String[] {""} ;
      T00EO12_A1333EstDimCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00EO13_A407EmprNom = new String[] {""} ;
      T00EO13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ3872EstSanfEA = DecimalUtil.ZERO ;
      ZZ3873EstSanfEL = DecimalUtil.ZERO ;
      ZZ3874EstCalEA = DecimalUtil.ZERO ;
      ZZ3875EstCalEL = DecimalUtil.ZERO ;
      ZZ3876EstRamEA = DecimalUtil.ZERO ;
      ZZ3877EstRamEL = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.testdi2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.testdi2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.testdi2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.testdi2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testdi2__default(),
         new Object[] {
             new Object[] {
            T00EO2_A1333EstDimCod, T00EO2_A3737EstSanfAnc, T00EO2_n3737EstSanfAnc, T00EO2_A3738EstSanfGrm, T00EO2_n3738EstSanfGrm, T00EO2_A3739EstCalAnc, T00EO2_n3739EstCalAnc, T00EO2_A3740EstCalGrm, T00EO2_n3740EstCalGrm, T00EO2_A3741EstRamAnc,
            T00EO2_n3741EstRamAnc, T00EO2_A3742EstRamGrm, T00EO2_n3742EstRamGrm, T00EO2_A3872EstSanfEA, T00EO2_n3872EstSanfEA, T00EO2_A3873EstSanfEL, T00EO2_n3873EstSanfEL, T00EO2_A3874EstCalEA, T00EO2_n3874EstCalEA, T00EO2_A3875EstCalEL,
            T00EO2_n3875EstCalEL, T00EO2_A3876EstRamEA, T00EO2_n3876EstRamEA, T00EO2_A3877EstRamEL, T00EO2_n3877EstRamEL, T00EO2_A396EmprCod
            }
            , new Object[] {
            T00EO3_A1333EstDimCod, T00EO3_A3737EstSanfAnc, T00EO3_n3737EstSanfAnc, T00EO3_A3738EstSanfGrm, T00EO3_n3738EstSanfGrm, T00EO3_A3739EstCalAnc, T00EO3_n3739EstCalAnc, T00EO3_A3740EstCalGrm, T00EO3_n3740EstCalGrm, T00EO3_A3741EstRamAnc,
            T00EO3_n3741EstRamAnc, T00EO3_A3742EstRamGrm, T00EO3_n3742EstRamGrm, T00EO3_A3872EstSanfEA, T00EO3_n3872EstSanfEA, T00EO3_A3873EstSanfEL, T00EO3_n3873EstSanfEL, T00EO3_A3874EstCalEA, T00EO3_n3874EstCalEA, T00EO3_A3875EstCalEL,
            T00EO3_n3875EstCalEL, T00EO3_A3876EstRamEA, T00EO3_n3876EstRamEA, T00EO3_A3877EstRamEL, T00EO3_n3877EstRamEL, T00EO3_A396EmprCod
            }
            , new Object[] {
            T00EO4_A407EmprNom, T00EO4_n407EmprNom
            }
            , new Object[] {
            T00EO5_A1333EstDimCod, T00EO5_A407EmprNom, T00EO5_n407EmprNom, T00EO5_A3737EstSanfAnc, T00EO5_n3737EstSanfAnc, T00EO5_A3738EstSanfGrm, T00EO5_n3738EstSanfGrm, T00EO5_A3739EstCalAnc, T00EO5_n3739EstCalAnc, T00EO5_A3740EstCalGrm,
            T00EO5_n3740EstCalGrm, T00EO5_A3741EstRamAnc, T00EO5_n3741EstRamAnc, T00EO5_A3742EstRamGrm, T00EO5_n3742EstRamGrm, T00EO5_A3872EstSanfEA, T00EO5_n3872EstSanfEA, T00EO5_A3873EstSanfEL, T00EO5_n3873EstSanfEL, T00EO5_A3874EstCalEA,
            T00EO5_n3874EstCalEA, T00EO5_A3875EstCalEL, T00EO5_n3875EstCalEL, T00EO5_A3876EstRamEA, T00EO5_n3876EstRamEA, T00EO5_A3877EstRamEL, T00EO5_n3877EstRamEL, T00EO5_A396EmprCod
            }
            , new Object[] {
            T00EO6_A396EmprCod, T00EO6_A1333EstDimCod
            }
            , new Object[] {
            T00EO7_A396EmprCod, T00EO7_A1333EstDimCod
            }
            , new Object[] {
            T00EO8_A396EmprCod, T00EO8_A1333EstDimCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00EO12_A396EmprCod, T00EO12_A1333EstDimCod
            }
            , new Object[] {
            T00EO13_A407EmprNom, T00EO13_n407EmprNom
            }
         }
      );
      Z1333EstDimCod = 0 ;
      A1333EstDimCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z3737EstSanfAnc ;
   private short Z3738EstSanfGrm ;
   private short Z3739EstCalAnc ;
   private short Z3740EstCalGrm ;
   private short Z3741EstRamAnc ;
   private short Z3742EstRamGrm ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3737EstSanfAnc ;
   private short A3738EstSanfGrm ;
   private short A3739EstCalAnc ;
   private short A3740EstCalGrm ;
   private short A3741EstRamAnc ;
   private short A3742EstRamGrm ;
   private short RcdFound186 ;
   private short nIsDirty_186 ;
   private short ZZ3737EstSanfAnc ;
   private short ZZ3738EstSanfGrm ;
   private short ZZ3739EstCalAnc ;
   private short ZZ3740EstCalGrm ;
   private short ZZ3741EstRamAnc ;
   private short ZZ3742EstRamGrm ;
   private int wcpOA1333EstDimCod ;
   private int Z1333EstDimCod ;
   private int A1333EstDimCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEstDimCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstSanfAnc_Enabled ;
   private int edtEstSanfGrm_Enabled ;
   private int edtEstCalAnc_Enabled ;
   private int edtEstCalGrm_Enabled ;
   private int edtEstRamAnc_Enabled ;
   private int edtEstRamGrm_Enabled ;
   private int edtEstSanfEA_Enabled ;
   private int edtEstSanfEL_Enabled ;
   private int edtEstCalEA_Enabled ;
   private int edtEstCalEL_Enabled ;
   private int edtEstRamEA_Enabled ;
   private int edtEstRamEL_Enabled ;
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
   private int edtEstRamEL_Backcolor ;
   private int edtEstRamEA_Backcolor ;
   private int edtEstCalEL_Backcolor ;
   private int edtEstCalEA_Backcolor ;
   private int edtEstSanfEL_Backcolor ;
   private int edtEstSanfEA_Backcolor ;
   private int edtEstRamGrm_Backcolor ;
   private int edtEstRamAnc_Backcolor ;
   private int edtEstCalGrm_Backcolor ;
   private int edtEstCalAnc_Backcolor ;
   private int edtEstSanfGrm_Backcolor ;
   private int edtEstSanfAnc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstDimCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ1333EstDimCod ;
   private java.math.BigDecimal Z3872EstSanfEA ;
   private java.math.BigDecimal Z3873EstSanfEL ;
   private java.math.BigDecimal Z3874EstCalEA ;
   private java.math.BigDecimal Z3875EstCalEL ;
   private java.math.BigDecimal Z3876EstRamEA ;
   private java.math.BigDecimal Z3877EstRamEL ;
   private java.math.BigDecimal A3872EstSanfEA ;
   private java.math.BigDecimal A3873EstSanfEL ;
   private java.math.BigDecimal A3874EstCalEA ;
   private java.math.BigDecimal A3875EstCalEL ;
   private java.math.BigDecimal A3876EstRamEA ;
   private java.math.BigDecimal A3877EstRamEL ;
   private java.math.BigDecimal ZZ3872EstSanfEA ;
   private java.math.BigDecimal ZZ3873EstSanfEL ;
   private java.math.BigDecimal ZZ3874EstCalEA ;
   private java.math.BigDecimal ZZ3875EstCalEL ;
   private java.math.BigDecimal ZZ3876EstRamEA ;
   private java.math.BigDecimal ZZ3877EstRamEL ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEstSanfAnc_Internalname ;
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
   private String edtEstDimCod_Internalname ;
   private String edtEstDimCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstSanfAnc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstSanfGrm_Internalname ;
   private String edtEstSanfGrm_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEstCalAnc_Internalname ;
   private String edtEstCalAnc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEstCalGrm_Internalname ;
   private String edtEstCalGrm_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEstRamAnc_Internalname ;
   private String edtEstRamAnc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEstRamGrm_Internalname ;
   private String edtEstRamGrm_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEstSanfEA_Internalname ;
   private String edtEstSanfEA_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEstSanfEL_Internalname ;
   private String edtEstSanfEL_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEstCalEA_Internalname ;
   private String edtEstCalEA_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEstCalEL_Internalname ;
   private String edtEstCalEL_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEstRamEA_Internalname ;
   private String edtEstRamEA_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEstRamEL_Internalname ;
   private String edtEstRamEL_Jsonclick ;
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
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String AV21LitFe ;
   private String AV20Lit0 ;
   private String AV41LitNTest ;
   private String AV43LitAncho ;
   private String AV46LitAnchoE ;
   private String AV44LitLargo ;
   private String AV45LitEnco ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sMode186 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n3737EstSanfAnc ;
   private boolean n3738EstSanfGrm ;
   private boolean n3739EstCalAnc ;
   private boolean n3740EstCalGrm ;
   private boolean n3741EstRamAnc ;
   private boolean n3742EstRamGrm ;
   private boolean n3872EstSanfEA ;
   private boolean n3873EstSanfEL ;
   private boolean n3874EstCalEA ;
   private boolean n3875EstCalEL ;
   private boolean n3876EstRamEA ;
   private boolean n3877EstRamEL ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T00EO4_A407EmprNom ;
   private boolean[] T00EO4_n407EmprNom ;
   private int[] T00EO5_A1333EstDimCod ;
   private String[] T00EO5_A407EmprNom ;
   private boolean[] T00EO5_n407EmprNom ;
   private short[] T00EO5_A3737EstSanfAnc ;
   private boolean[] T00EO5_n3737EstSanfAnc ;
   private short[] T00EO5_A3738EstSanfGrm ;
   private boolean[] T00EO5_n3738EstSanfGrm ;
   private short[] T00EO5_A3739EstCalAnc ;
   private boolean[] T00EO5_n3739EstCalAnc ;
   private short[] T00EO5_A3740EstCalGrm ;
   private boolean[] T00EO5_n3740EstCalGrm ;
   private short[] T00EO5_A3741EstRamAnc ;
   private boolean[] T00EO5_n3741EstRamAnc ;
   private short[] T00EO5_A3742EstRamGrm ;
   private boolean[] T00EO5_n3742EstRamGrm ;
   private java.math.BigDecimal[] T00EO5_A3872EstSanfEA ;
   private boolean[] T00EO5_n3872EstSanfEA ;
   private java.math.BigDecimal[] T00EO5_A3873EstSanfEL ;
   private boolean[] T00EO5_n3873EstSanfEL ;
   private java.math.BigDecimal[] T00EO5_A3874EstCalEA ;
   private boolean[] T00EO5_n3874EstCalEA ;
   private java.math.BigDecimal[] T00EO5_A3875EstCalEL ;
   private boolean[] T00EO5_n3875EstCalEL ;
   private java.math.BigDecimal[] T00EO5_A3876EstRamEA ;
   private boolean[] T00EO5_n3876EstRamEA ;
   private java.math.BigDecimal[] T00EO5_A3877EstRamEL ;
   private boolean[] T00EO5_n3877EstRamEL ;
   private String[] T00EO5_A396EmprCod ;
   private String[] T00EO6_A396EmprCod ;
   private int[] T00EO6_A1333EstDimCod ;
   private int[] T00EO3_A1333EstDimCod ;
   private short[] T00EO3_A3737EstSanfAnc ;
   private boolean[] T00EO3_n3737EstSanfAnc ;
   private short[] T00EO3_A3738EstSanfGrm ;
   private boolean[] T00EO3_n3738EstSanfGrm ;
   private short[] T00EO3_A3739EstCalAnc ;
   private boolean[] T00EO3_n3739EstCalAnc ;
   private short[] T00EO3_A3740EstCalGrm ;
   private boolean[] T00EO3_n3740EstCalGrm ;
   private short[] T00EO3_A3741EstRamAnc ;
   private boolean[] T00EO3_n3741EstRamAnc ;
   private short[] T00EO3_A3742EstRamGrm ;
   private boolean[] T00EO3_n3742EstRamGrm ;
   private java.math.BigDecimal[] T00EO3_A3872EstSanfEA ;
   private boolean[] T00EO3_n3872EstSanfEA ;
   private java.math.BigDecimal[] T00EO3_A3873EstSanfEL ;
   private boolean[] T00EO3_n3873EstSanfEL ;
   private java.math.BigDecimal[] T00EO3_A3874EstCalEA ;
   private boolean[] T00EO3_n3874EstCalEA ;
   private java.math.BigDecimal[] T00EO3_A3875EstCalEL ;
   private boolean[] T00EO3_n3875EstCalEL ;
   private java.math.BigDecimal[] T00EO3_A3876EstRamEA ;
   private boolean[] T00EO3_n3876EstRamEA ;
   private java.math.BigDecimal[] T00EO3_A3877EstRamEL ;
   private boolean[] T00EO3_n3877EstRamEL ;
   private String[] T00EO3_A396EmprCod ;
   private String[] T00EO7_A396EmprCod ;
   private int[] T00EO7_A1333EstDimCod ;
   private String[] T00EO8_A396EmprCod ;
   private int[] T00EO8_A1333EstDimCod ;
   private int[] T00EO2_A1333EstDimCod ;
   private short[] T00EO2_A3737EstSanfAnc ;
   private boolean[] T00EO2_n3737EstSanfAnc ;
   private short[] T00EO2_A3738EstSanfGrm ;
   private boolean[] T00EO2_n3738EstSanfGrm ;
   private short[] T00EO2_A3739EstCalAnc ;
   private boolean[] T00EO2_n3739EstCalAnc ;
   private short[] T00EO2_A3740EstCalGrm ;
   private boolean[] T00EO2_n3740EstCalGrm ;
   private short[] T00EO2_A3741EstRamAnc ;
   private boolean[] T00EO2_n3741EstRamAnc ;
   private short[] T00EO2_A3742EstRamGrm ;
   private boolean[] T00EO2_n3742EstRamGrm ;
   private java.math.BigDecimal[] T00EO2_A3872EstSanfEA ;
   private boolean[] T00EO2_n3872EstSanfEA ;
   private java.math.BigDecimal[] T00EO2_A3873EstSanfEL ;
   private boolean[] T00EO2_n3873EstSanfEL ;
   private java.math.BigDecimal[] T00EO2_A3874EstCalEA ;
   private boolean[] T00EO2_n3874EstCalEA ;
   private java.math.BigDecimal[] T00EO2_A3875EstCalEL ;
   private boolean[] T00EO2_n3875EstCalEL ;
   private java.math.BigDecimal[] T00EO2_A3876EstRamEA ;
   private boolean[] T00EO2_n3876EstRamEA ;
   private java.math.BigDecimal[] T00EO2_A3877EstRamEL ;
   private boolean[] T00EO2_n3877EstRamEL ;
   private String[] T00EO2_A396EmprCod ;
   private String[] T00EO12_A396EmprCod ;
   private int[] T00EO12_A1333EstDimCod ;
   private String[] T00EO13_A407EmprNom ;
   private boolean[] T00EO13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class testdi2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testdi2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testdi2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testdi2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class testdi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00EO2", "SELECT EstDimCod, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EmprCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ?  FOR UPDATE OF EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO3", "SELECT EstDimCod, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EmprCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO5", "SELECT /*+ FIRST_ROWS(1) */ TM1.EstDimCod, T2.EmprNom, TM1.EstSanfAnc, TM1.EstSanfGrm, TM1.EstCalAnc, TM1.EstCalGrm, TM1.EstRamAnc, TM1.EstRamGrm, TM1.EstSanfEA, TM1.EstSanfEL, TM1.EstCalEA, TM1.EstCalEL, TM1.EstRamEA, TM1.EstRamEL, TM1.EmprCod FROM (TXPCESDIM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.EstDimCod = ? ORDER BY TM1.EmprCod, TM1.EstDimCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? and EstDimCod = ? ORDER BY EmprCod, EstDimCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? and EstDimCod = ? ORDER BY EmprCod DESC, EstDimCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00EO9", "INSERT INTO TXPCESDIM(EstDimCod, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EmprCod, BarCod, BarCodReo, BarCodPar, EstDimMat, EstDimSer, EstDimTip, EstDimDisN, EstColNom, EstColNum, EstDimFec, EstDimAnc, OpeCod, EstCliCod, EstCliNom, EstDimEncA, EstDimEncL, EstDimGrm2, EstDimUlin, EstDimAni, EstDimGmi, EstDimNor, EstDimMaq, EstDimTAc, EstDimMan, EstDimPal, EstDimEsp, EstDimTN, EstDimRef, EstNorEsp, EstInclin, EstRqMnL, EstRqMnC, EstEncASt, EstEncLSt, EstRqMnG, EstAvGr, EstRqMnE, EstEspBef, EstEspBSt, EstEspAft, EstEspASt, EstTpLv, EstMet, EstDimGrm3, EstMetod3, EstMetod2, EstMetod1, EstDimGrm1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCESDIM")
         ,new UpdateCursor("T00EO10", "UPDATE TXPCESDIM SET EstSanfAnc=?, EstSanfGrm=?, EstCalAnc=?, EstCalGrm=?, EstRamAnc=?, EstRamGrm=?, EstSanfEA=?, EstSanfEL=?, EstCalEA=?, EstCalEL=?, EstRamEA=?, EstRamEL=?  WHERE EmprCod = ? AND EstDimCod = ?", GX_NOMASK, "TXPCESDIM")
         ,new UpdateCursor("T00EO11", "DELETE FROM TXPCESDIM  WHERE EmprCod = ? AND EstDimCod = ?", GX_NOMASK, "TXPCESDIM")
         ,new ForEachCursor("T00EO12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? and EstDimCod = ? ORDER BY EmprCod, EstDimCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00EO13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
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
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 2);
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setString(14, (String)parms[25], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
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
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
               stmt.setString(13, (String)parms[24], 3);
               stmt.setInt(14, ((Number) parms[25]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

