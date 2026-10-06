package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thhdrsq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8956HBarCod = (int)(GXutil.lval( httpContext.GetPar( "HBarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
         A8957HBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HBarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
         A8958HBarCodPar = httpContext.GetPar( "HBarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
         A9208HProCod = httpContext.GetPar( "HProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
         A9210HBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "HBarOrdLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A8956HBarCod, A8957HBarCodReo, A8958HBarCodPar, A9208HProCod, A9210HBarOrdLin) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO IGUAL A CC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtHBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public thhdrsq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thhdrsq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thhdrsq_impl.class ));
   }

   public thhdrsq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THHDRSQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8956HBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8956HBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8956HBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "BarCodReo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A8957HBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8957HBarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A8957HBarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtHBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "HBarCodPar", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHBarCodPar_Internalname, GXutil.rtrim( A8958HBarCodPar), GXutil.rtrim( localUtil.format( A8958HBarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtHBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "HProCod", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHProCod_Internalname, GXutil.rtrim( A9208HProCod), GXutil.rtrim( localUtil.format( A9208HProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHProCod_Jsonclick, 0, "", "", "", "", "", 1, edtHProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "HBarOrdLin", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A9210HBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9210HBarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9210HBarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHBarOrdLin_Jsonclick, 0, "", "", "", "", "", 1, edtHBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "HCCTCod", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9295HCCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHCCTCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9295HCCTCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9295HCCTCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCTCod_Jsonclick, 0, "", "", "", "", "", 1, edtHCCTCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "HCCOpeCod", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9296HCCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHCCOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9296HCCOpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9296HCCOpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtHCCOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "HCCFch", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHCCFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCFch_Internalname, localUtil.format(A9297HCCFch, "99/99/99"), localUtil.format( A9297HCCFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCFch_Jsonclick, 0, "", "", "", "", "", 1, edtHCCFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHCCFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHCCFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THHDRSQ.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "HCcObs", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHCcObs_Internalname, A9298HCcObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtHCcObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "HCcDisp", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCcDisp_Internalname, GXutil.rtrim( A9299HCcDisp), GXutil.rtrim( localUtil.format( A9299HCcDisp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCcDisp_Jsonclick, 0, "", "", "", "", "", 1, edtHCcDisp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "HCCFch Uti", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHCCFchUti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCFchUti_Internalname, localUtil.format(A9300HCCFchUti, "99/99/99"), localUtil.format( A9300HCCFchUti, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCFchUti_Jsonclick, 0, "", "", "", "", "", 1, edtHCCFchUti_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHCCFchUti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHCCFchUti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THHDRSQ.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Descripcion Codigo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCTDsc_Internalname, GXutil.rtrim( A9349HCCTDsc), GXutil.rtrim( localUtil.format( A9349HCCTDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCTDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Ultimo Test", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCUltn_Internalname, GXutil.ltrim( localUtil.ntoc( A12744HCCUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHCCUltn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12744HCCUltn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12744HCCUltn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCUltn_Jsonclick, 0, "", "", "", "", "", 1, edtHCCUltn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "OK", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCOk_Internalname, GXutil.ltrim( localUtil.ntoc( A12745HCCOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHCCOk_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12745HCCOk), "9") : localUtil.format( DecimalUtil.doubleToDec(A12745HCCOk), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCOk_Jsonclick, 0, "", "", "", "", "", 1, edtHCCOk_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Fecha-Hora", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHCCOkFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCOkFch_Internalname, localUtil.ttoc( A12746HCCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12746HCCOkFch, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCOkFch_Jsonclick, 0, "", "", "", "", "", 1, edtHCCOkFch_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THHDRSQ.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHCCOkFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHCCOkFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THHDRSQ.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Usuario", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHCCOkUsu_Internalname, GXutil.rtrim( A12747HCCOkUsu), GXutil.rtrim( localUtil.format( A12747HCCOkUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHCCOkUsu_Jsonclick, 0, "", "", "", "", "", 1, edtHCCOkUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Ovservaciones", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtHCCobs2_Internalname, A12748HCCobs2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", (short)(0), 1, edtHCCobs2_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_THHDRSQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THHDRSQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THHDRSQ.htm");
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
      e1113J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z8956HBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z8956HBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8957HBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8957HBarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8958HBarCodPar = httpContext.cgiGet( "Z8958HBarCodPar") ;
            Z9208HProCod = httpContext.cgiGet( "Z9208HProCod") ;
            Z9210HBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z9210HBarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9295HCCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9295HCCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9296HCCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9296HCCOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9297HCCFch = localUtil.ctod( httpContext.cgiGet( "Z9297HCCFch"), 0) ;
            Z9299HCcDisp = httpContext.cgiGet( "Z9299HCcDisp") ;
            Z9300HCCFchUti = localUtil.ctod( httpContext.cgiGet( "Z9300HCCFchUti"), 0) ;
            Z9349HCCTDsc = httpContext.cgiGet( "Z9349HCCTDsc") ;
            Z12744HCCUltn = (short)(localUtil.ctol( httpContext.cgiGet( "Z12744HCCUltn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12745HCCOk = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12745HCCOk"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12746HCCOkFch = localUtil.ctot( httpContext.cgiGet( "Z12746HCCOkFch"), 0) ;
            Z12747HCCOkUsu = httpContext.cgiGet( "Z12747HCCOkUsu") ;
            Z12748HCCobs2 = httpContext.cgiGet( "Z12748HCCobs2") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HBARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8956HBarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
            }
            else
            {
               A8956HBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HBARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8957HBarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
            }
            else
            {
               A8957HBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
            }
            A8958HBarCodPar = httpContext.cgiGet( edtHBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
            A9208HProCod = httpContext.cgiGet( edtHProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HBARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9210HBarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
            }
            else
            {
               A9210HBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HCCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9295HCCTCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
            }
            else
            {
               A9295HCCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HCCOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9296HCCOpeCod = 0 ;
               n9296HCCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9296HCCOpeCod), 6, 0));
            }
            else
            {
               A9296HCCOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHCCOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9296HCCOpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9296HCCOpeCod), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHCCFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HCCFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9297HCCFch = GXutil.nullDate() ;
               n9297HCCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
            }
            else
            {
               A9297HCCFch = localUtil.ctod( httpContext.cgiGet( edtHCCFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9297HCCFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
            }
            A9298HCcObs = httpContext.cgiGet( edtHCcObs_Internalname) ;
            n9298HCcObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9298HCcObs", A9298HCcObs);
            A9299HCcDisp = httpContext.cgiGet( edtHCcDisp_Internalname) ;
            n9299HCcDisp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9299HCcDisp", A9299HCcDisp);
            if ( localUtil.vcdate( httpContext.cgiGet( edtHCCFchUti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HCCFCHUTI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCFchUti_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9300HCCFchUti = GXutil.nullDate() ;
               n9300HCCFchUti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
            }
            else
            {
               A9300HCCFchUti = localUtil.ctod( httpContext.cgiGet( edtHCCFchUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n9300HCCFchUti = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
            }
            A9349HCCTDsc = httpContext.cgiGet( edtHCCTDsc_Internalname) ;
            n9349HCCTDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9349HCCTDsc", A9349HCCTDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHCCUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHCCUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HCCULTN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCUltn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12744HCCUltn = (short)(0) ;
               n12744HCCUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12744HCCUltn), 4, 0));
            }
            else
            {
               A12744HCCUltn = (short)(localUtil.ctol( httpContext.cgiGet( edtHCCUltn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12744HCCUltn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12744HCCUltn), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HCCOK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCOk_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12745HCCOk = (byte)(0) ;
               n12745HCCOk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.str( A12745HCCOk, 1, 0));
            }
            else
            {
               A12745HCCOk = (byte)(localUtil.ctol( httpContext.cgiGet( edtHCCOk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12745HCCOk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.str( A12745HCCOk, 1, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtHCCOkFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "HCCOKFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHCCOkFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
               n12746HCCOkFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A12746HCCOkFch = localUtil.ctot( httpContext.cgiGet( edtHCCOkFch_Internalname)) ;
               n12746HCCOkFch = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A12747HCCOkUsu = httpContext.cgiGet( edtHCCOkUsu_Internalname) ;
            n12747HCCOkUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12747HCCOkUsu", A12747HCCOkUsu);
            A12748HCCobs2 = httpContext.cgiGet( edtHCCobs2_Internalname) ;
            n12748HCCobs2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12748HCCobs2", A12748HCCobs2);
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
               A8956HBarCod = (int)(GXutil.lval( httpContext.GetPar( "HBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
               A8957HBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
               A8958HBarCodPar = httpContext.GetPar( "HBarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
               A9208HProCod = httpContext.GetPar( "HProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
               A9210HBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "HBarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
               A9295HCCTCod = (int)(GXutil.lval( httpContext.GetPar( "HCCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
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
                        e1113J2 ();
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
            initAll13J1220( ) ;
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
      disableAttributes13J1220( ) ;
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

   public void confirm_13J0( )
   {
      beforeValidate13J1220( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13J1220( ) ;
         }
         else
         {
            checkExtendedTable13J1220( ) ;
            if ( AnyError == 0 )
            {
               zm13J1220( 2) ;
               zm13J1220( 3) ;
            }
            closeExtendedTableCursors13J1220( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues13J0( ) ;
      }
   }

   public void resetCaption13J0( )
   {
   }

   public void e1113J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thhdrsq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thhdrsq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thhdrsq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thhdrsq_impl.this.A396EmprCod = GXv_char2[0] ;
      thhdrsq_impl.this.AV11EmprNom = GXv_char3[0] ;
      thhdrsq_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm13J1220( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9296HCCOpeCod = T013J3_A9296HCCOpeCod[0] ;
            Z9297HCCFch = T013J3_A9297HCCFch[0] ;
            Z9299HCcDisp = T013J3_A9299HCcDisp[0] ;
            Z9300HCCFchUti = T013J3_A9300HCCFchUti[0] ;
            Z9349HCCTDsc = T013J3_A9349HCCTDsc[0] ;
            Z12744HCCUltn = T013J3_A12744HCCUltn[0] ;
            Z12745HCCOk = T013J3_A12745HCCOk[0] ;
            Z12746HCCOkFch = T013J3_A12746HCCOkFch[0] ;
            Z12747HCCOkUsu = T013J3_A12747HCCOkUsu[0] ;
            Z12748HCCobs2 = T013J3_A12748HCCobs2[0] ;
         }
         else
         {
            Z9296HCCOpeCod = A9296HCCOpeCod ;
            Z9297HCCFch = A9297HCCFch ;
            Z9299HCcDisp = A9299HCcDisp ;
            Z9300HCCFchUti = A9300HCCFchUti ;
            Z9349HCCTDsc = A9349HCCTDsc ;
            Z12744HCCUltn = A12744HCCUltn ;
            Z12745HCCOk = A12745HCCOk ;
            Z12746HCCOkFch = A12746HCCOkFch ;
            Z12747HCCOkUsu = A12747HCCOkUsu ;
            Z12748HCCobs2 = A12748HCCobs2 ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z9295HCCTCod = A9295HCCTCod ;
         Z9296HCCOpeCod = A9296HCCOpeCod ;
         Z9297HCCFch = A9297HCCFch ;
         Z9298HCcObs = A9298HCcObs ;
         Z9299HCcDisp = A9299HCcDisp ;
         Z9300HCCFchUti = A9300HCCFchUti ;
         Z9349HCCTDsc = A9349HCCTDsc ;
         Z12744HCCUltn = A12744HCCUltn ;
         Z12745HCCOk = A12745HCCOk ;
         Z12746HCCOkFch = A12746HCCOkFch ;
         Z12747HCCOkUsu = A12747HCCOkUsu ;
         Z12748HCCobs2 = A12748HCCobs2 ;
         Z396EmprCod = A396EmprCod ;
         Z8956HBarCod = A8956HBarCod ;
         Z8957HBarCodReo = A8957HBarCodReo ;
         Z8958HBarCodPar = A8958HBarCodPar ;
         Z9208HProCod = A9208HProCod ;
         Z9210HBarOrdLin = A9210HBarOrdLin ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THHDRSQ" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T013J4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013J4_A407EmprNom[0] ;
      n407EmprNom = T013J4_n407EmprNom[0] ;
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

   public void load13J1220( )
   {
      /* Using cursor T013J6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1220 = (short)(1) ;
         A9298HCcObs = T013J6_A9298HCcObs[0] ;
         n9298HCcObs = T013J6_n9298HCcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9298HCcObs", A9298HCcObs);
         A407EmprNom = T013J6_A407EmprNom[0] ;
         n407EmprNom = T013J6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9296HCCOpeCod = T013J6_A9296HCCOpeCod[0] ;
         n9296HCCOpeCod = T013J6_n9296HCCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9296HCCOpeCod), 6, 0));
         A9297HCCFch = T013J6_A9297HCCFch[0] ;
         n9297HCCFch = T013J6_n9297HCCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
         A9299HCcDisp = T013J6_A9299HCcDisp[0] ;
         n9299HCcDisp = T013J6_n9299HCcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9299HCcDisp", A9299HCcDisp);
         A9300HCCFchUti = T013J6_A9300HCCFchUti[0] ;
         n9300HCCFchUti = T013J6_n9300HCCFchUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
         A9349HCCTDsc = T013J6_A9349HCCTDsc[0] ;
         n9349HCCTDsc = T013J6_n9349HCCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9349HCCTDsc", A9349HCCTDsc);
         A12744HCCUltn = T013J6_A12744HCCUltn[0] ;
         n12744HCCUltn = T013J6_n12744HCCUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12744HCCUltn), 4, 0));
         A12745HCCOk = T013J6_A12745HCCOk[0] ;
         n12745HCCOk = T013J6_n12745HCCOk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.str( A12745HCCOk, 1, 0));
         A12746HCCOkFch = T013J6_A12746HCCOkFch[0] ;
         n12746HCCOkFch = T013J6_n12746HCCOkFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12747HCCOkUsu = T013J6_A12747HCCOkUsu[0] ;
         n12747HCCOkUsu = T013J6_n12747HCCOkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12747HCCOkUsu", A12747HCCOkUsu);
         A12748HCCobs2 = T013J6_A12748HCCobs2[0] ;
         n12748HCCobs2 = T013J6_n12748HCCobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12748HCCobs2", A12748HCCobs2);
         zm13J1220( -1) ;
      }
      pr_default.close(4);
      onLoadActions13J1220( ) ;
   }

   public void onLoadActions13J1220( )
   {
   }

   public void checkExtendedTable13J1220( )
   {
      nIsDirty_1220 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T013J5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HHDRSF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HBARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors13J1220( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A8956HBarCod ,
                         byte A8957HBarCodReo ,
                         String A8958HBarCodPar ,
                         String A9208HProCod ,
                         short A9210HBarOrdLin )
   {
      /* Using cursor T013J7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HHDRSF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HBARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHBarCod_Internalname ;
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

   public void getKey13J1220( )
   {
      /* Using cursor T013J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1220 = (short)(1) ;
      }
      else
      {
         RcdFound1220 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T013J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13J1220( 1) ;
         RcdFound1220 = (short)(1) ;
         A9298HCcObs = T013J3_A9298HCcObs[0] ;
         n9298HCcObs = T013J3_n9298HCcObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9298HCcObs", A9298HCcObs);
         A9295HCCTCod = T013J3_A9295HCCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
         A9296HCCOpeCod = T013J3_A9296HCCOpeCod[0] ;
         n9296HCCOpeCod = T013J3_n9296HCCOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9296HCCOpeCod), 6, 0));
         A9297HCCFch = T013J3_A9297HCCFch[0] ;
         n9297HCCFch = T013J3_n9297HCCFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
         A9299HCcDisp = T013J3_A9299HCcDisp[0] ;
         n9299HCcDisp = T013J3_n9299HCcDisp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9299HCcDisp", A9299HCcDisp);
         A9300HCCFchUti = T013J3_A9300HCCFchUti[0] ;
         n9300HCCFchUti = T013J3_n9300HCCFchUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
         A9349HCCTDsc = T013J3_A9349HCCTDsc[0] ;
         n9349HCCTDsc = T013J3_n9349HCCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9349HCCTDsc", A9349HCCTDsc);
         A12744HCCUltn = T013J3_A12744HCCUltn[0] ;
         n12744HCCUltn = T013J3_n12744HCCUltn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12744HCCUltn), 4, 0));
         A12745HCCOk = T013J3_A12745HCCOk[0] ;
         n12745HCCOk = T013J3_n12745HCCOk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.str( A12745HCCOk, 1, 0));
         A12746HCCOkFch = T013J3_A12746HCCOkFch[0] ;
         n12746HCCOkFch = T013J3_n12746HCCOkFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12747HCCOkUsu = T013J3_A12747HCCOkUsu[0] ;
         n12747HCCOkUsu = T013J3_n12747HCCOkUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12747HCCOkUsu", A12747HCCOkUsu);
         A12748HCCobs2 = T013J3_A12748HCCobs2[0] ;
         n12748HCCobs2 = T013J3_n12748HCCobs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12748HCCobs2", A12748HCCobs2);
         A8956HBarCod = T013J3_A8956HBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
         A8957HBarCodReo = T013J3_A8957HBarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
         A8958HBarCodPar = T013J3_A8958HBarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
         A9208HProCod = T013J3_A9208HProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
         A9210HBarOrdLin = T013J3_A9210HBarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z8956HBarCod = A8956HBarCod ;
         Z8957HBarCodReo = A8957HBarCodReo ;
         Z8958HBarCodPar = A8958HBarCodPar ;
         Z9208HProCod = A9208HProCod ;
         Z9210HBarOrdLin = A9210HBarOrdLin ;
         Z9295HCCTCod = A9295HCCTCod ;
         sMode1220 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load13J1220( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1220 = (short)(0) ;
            initializeNonKey13J1220( ) ;
         }
         Gx_mode = sMode1220 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1220 = (short)(0) ;
         initializeNonKey13J1220( ) ;
         sMode1220 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1220 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey13J1220( ) ;
      if ( RcdFound1220 == 0 )
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
      RcdFound1220 = (short)(0) ;
      /* Using cursor T013J9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A8956HBarCod), Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), A8958HBarCodPar, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), A9208HProCod, A9208HProCod, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), Short.valueOf(A9210HBarOrdLin), Short.valueOf(A9210HBarOrdLin), A9208HProCod, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), Integer.valueOf(A9295HCCTCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T013J9_A8956HBarCod[0] < A8956HBarCod ) || ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A8957HBarCodReo[0] < A8957HBarCodReo ) || ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) < 0 ) || ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) < 0 ) || ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A9210HBarOrdLin[0] < A9210HBarOrdLin ) || ( T013J9_A9210HBarOrdLin[0] == A9210HBarOrdLin ) && ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A9295HCCTCod[0] < A9295HCCTCod ) ) && ( GXutil.strcmp(T013J9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T013J9_A8956HBarCod[0] > A8956HBarCod ) || ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A8957HBarCodReo[0] > A8957HBarCodReo ) || ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) > 0 ) || ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) > 0 ) || ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A9210HBarOrdLin[0] > A9210HBarOrdLin ) || ( T013J9_A9210HBarOrdLin[0] == A9210HBarOrdLin ) && ( GXutil.strcmp(T013J9_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J9_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J9_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J9_A8956HBarCod[0] == A8956HBarCod ) && ( T013J9_A9295HCCTCod[0] > A9295HCCTCod ) ) && ( GXutil.strcmp(T013J9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A8956HBarCod = T013J9_A8956HBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
            A8957HBarCodReo = T013J9_A8957HBarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
            A8958HBarCodPar = T013J9_A8958HBarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
            A9208HProCod = T013J9_A9208HProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
            A9210HBarOrdLin = T013J9_A9210HBarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
            A9295HCCTCod = T013J9_A9295HCCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
            RcdFound1220 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1220 = (short)(0) ;
      /* Using cursor T013J10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A8956HBarCod), Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), A8958HBarCodPar, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), A9208HProCod, A9208HProCod, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), Short.valueOf(A9210HBarOrdLin), Short.valueOf(A9210HBarOrdLin), A9208HProCod, A8958HBarCodPar, Byte.valueOf(A8957HBarCodReo), Integer.valueOf(A8956HBarCod), Integer.valueOf(A9295HCCTCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T013J10_A8956HBarCod[0] > A8956HBarCod ) || ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A8957HBarCodReo[0] > A8957HBarCodReo ) || ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) > 0 ) || ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) > 0 ) || ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A9210HBarOrdLin[0] > A9210HBarOrdLin ) || ( T013J10_A9210HBarOrdLin[0] == A9210HBarOrdLin ) && ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A9295HCCTCod[0] > A9295HCCTCod ) ) && ( GXutil.strcmp(T013J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T013J10_A8956HBarCod[0] < A8956HBarCod ) || ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A8957HBarCodReo[0] < A8957HBarCodReo ) || ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) < 0 ) || ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) < 0 ) || ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A9210HBarOrdLin[0] < A9210HBarOrdLin ) || ( T013J10_A9210HBarOrdLin[0] == A9210HBarOrdLin ) && ( GXutil.strcmp(T013J10_A9208HProCod[0], A9208HProCod) == 0 ) && ( GXutil.strcmp(T013J10_A8958HBarCodPar[0], A8958HBarCodPar) == 0 ) && ( T013J10_A8957HBarCodReo[0] == A8957HBarCodReo ) && ( T013J10_A8956HBarCod[0] == A8956HBarCod ) && ( T013J10_A9295HCCTCod[0] < A9295HCCTCod ) ) && ( GXutil.strcmp(T013J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A8956HBarCod = T013J10_A8956HBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
            A8957HBarCodReo = T013J10_A8957HBarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
            A8958HBarCodPar = T013J10_A8958HBarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
            A9208HProCod = T013J10_A9208HProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
            A9210HBarOrdLin = T013J10_A9210HBarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
            A9295HCCTCod = T013J10_A9295HCCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
            RcdFound1220 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13J1220( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13J1220( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1220 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8956HBarCod != Z8956HBarCod ) || ( A8957HBarCodReo != Z8957HBarCodReo ) || ( GXutil.strcmp(A8958HBarCodPar, Z8958HBarCodPar) != 0 ) || ( GXutil.strcmp(A9208HProCod, Z9208HProCod) != 0 ) || ( A9210HBarOrdLin != Z9210HBarOrdLin ) || ( A9295HCCTCod != Z9295HCCTCod ) )
            {
               A8956HBarCod = Z8956HBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
               A8957HBarCodReo = Z8957HBarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
               A8958HBarCodPar = Z8958HBarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
               A9208HProCod = Z9208HProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
               A9210HBarOrdLin = Z9210HBarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
               A9295HCCTCod = Z9295HCCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtHBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update13J1220( ) ;
               GX_FocusControl = edtHBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8956HBarCod != Z8956HBarCod ) || ( A8957HBarCodReo != Z8957HBarCodReo ) || ( GXutil.strcmp(A8958HBarCodPar, Z8958HBarCodPar) != 0 ) || ( GXutil.strcmp(A9208HProCod, Z9208HProCod) != 0 ) || ( A9210HBarOrdLin != Z9210HBarOrdLin ) || ( A9295HCCTCod != Z9295HCCTCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13J1220( ) ;
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
                  GX_FocusControl = edtHBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13J1220( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8956HBarCod != Z8956HBarCod ) || ( A8957HBarCodReo != Z8957HBarCodReo ) || ( GXutil.strcmp(A8958HBarCodPar, Z8958HBarCodPar) != 0 ) || ( GXutil.strcmp(A9208HProCod, Z9208HProCod) != 0 ) || ( A9210HBarOrdLin != Z9210HBarOrdLin ) || ( A9295HCCTCod != Z9295HCCTCod ) )
      {
         A8956HBarCod = Z8956HBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
         A8957HBarCodReo = Z8957HBarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
         A8958HBarCodPar = Z8958HBarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
         A9208HProCod = Z9208HProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
         A9210HBarOrdLin = Z9210HBarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
         A9295HCCTCod = Z9295HCCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtHBarCod_Internalname ;
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
      getKey13J1220( ) ;
      if ( RcdFound1220 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8956HBarCod != Z8956HBarCod ) || ( A8957HBarCodReo != Z8957HBarCodReo ) || ( GXutil.strcmp(A8958HBarCodPar, Z8958HBarCodPar) != 0 ) || ( GXutil.strcmp(A9208HProCod, Z9208HProCod) != 0 ) || ( A9210HBarOrdLin != Z9210HBarOrdLin ) || ( A9295HCCTCod != Z9295HCCTCod ) )
         {
            A8956HBarCod = Z8956HBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
            A8957HBarCodReo = Z8957HBarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
            A8958HBarCodPar = Z8958HBarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
            A9208HProCod = Z9208HProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
            A9210HBarOrdLin = Z9210HBarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
            A9295HCCTCod = Z9295HCCTCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A8956HBarCod != Z8956HBarCod ) || ( A8957HBarCodReo != Z8957HBarCodReo ) || ( GXutil.strcmp(A8958HBarCodPar, Z8958HBarCodPar) != 0 ) || ( GXutil.strcmp(A9208HProCod, Z9208HProCod) != 0 ) || ( A9210HBarOrdLin != Z9210HBarOrdLin ) || ( A9295HCCTCod != Z9295HCCTCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thhdrsq");
      GX_FocusControl = edtHCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_13J0( ) ;
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
      if ( RcdFound1220 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart13J1220( ) ;
      if ( RcdFound1220 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13J1220( ) ;
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
      if ( RcdFound1220 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHCCOpeCod_Internalname ;
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
      if ( RcdFound1220 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHCCOpeCod_Internalname ;
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
      scanStart13J1220( ) ;
      if ( RcdFound1220 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1220 != 0 )
         {
            scanNext13J1220( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHCCOpeCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13J1220( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency13J1220( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHHDRSQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z9296HCCOpeCod != T013J2_A9296HCCOpeCod[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z9297HCCFch), GXutil.resetTime(T013J2_A9297HCCFch[0])) ) || ( GXutil.strcmp(Z9299HCcDisp, T013J2_A9299HCcDisp[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9300HCCFchUti), GXutil.resetTime(T013J2_A9300HCCFchUti[0])) ) || ( GXutil.strcmp(Z9349HCCTDsc, T013J2_A9349HCCTDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12744HCCUltn != T013J2_A12744HCCUltn[0] ) || ( Z12745HCCOk != T013J2_A12745HCCOk[0] ) || !( GXutil.dateCompare(Z12746HCCOkFch, T013J2_A12746HCCOkFch[0]) ) || ( GXutil.strcmp(Z12747HCCOkUsu, T013J2_A12747HCCOkUsu[0]) != 0 ) || ( GXutil.strcmp(Z12748HCCobs2, T013J2_A12748HCCobs2[0]) != 0 ) )
         {
            if ( Z9296HCCOpeCod != T013J2_A9296HCCOpeCod[0] )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCOpeCod");
               GXutil.writeLogRaw("Old: ",Z9296HCCOpeCod);
               GXutil.writeLogRaw("Current: ",T013J2_A9296HCCOpeCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9297HCCFch), GXutil.resetTime(T013J2_A9297HCCFch[0])) ) )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCFch");
               GXutil.writeLogRaw("Old: ",Z9297HCCFch);
               GXutil.writeLogRaw("Current: ",T013J2_A9297HCCFch[0]);
            }
            if ( GXutil.strcmp(Z9299HCcDisp, T013J2_A9299HCcDisp[0]) != 0 )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCcDisp");
               GXutil.writeLogRaw("Old: ",Z9299HCcDisp);
               GXutil.writeLogRaw("Current: ",T013J2_A9299HCcDisp[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9300HCCFchUti), GXutil.resetTime(T013J2_A9300HCCFchUti[0])) ) )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCFchUti");
               GXutil.writeLogRaw("Old: ",Z9300HCCFchUti);
               GXutil.writeLogRaw("Current: ",T013J2_A9300HCCFchUti[0]);
            }
            if ( GXutil.strcmp(Z9349HCCTDsc, T013J2_A9349HCCTDsc[0]) != 0 )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCTDsc");
               GXutil.writeLogRaw("Old: ",Z9349HCCTDsc);
               GXutil.writeLogRaw("Current: ",T013J2_A9349HCCTDsc[0]);
            }
            if ( Z12744HCCUltn != T013J2_A12744HCCUltn[0] )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCUltn");
               GXutil.writeLogRaw("Old: ",Z12744HCCUltn);
               GXutil.writeLogRaw("Current: ",T013J2_A12744HCCUltn[0]);
            }
            if ( Z12745HCCOk != T013J2_A12745HCCOk[0] )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCOk");
               GXutil.writeLogRaw("Old: ",Z12745HCCOk);
               GXutil.writeLogRaw("Current: ",T013J2_A12745HCCOk[0]);
            }
            if ( !( GXutil.dateCompare(Z12746HCCOkFch, T013J2_A12746HCCOkFch[0]) ) )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCOkFch");
               GXutil.writeLogRaw("Old: ",Z12746HCCOkFch);
               GXutil.writeLogRaw("Current: ",T013J2_A12746HCCOkFch[0]);
            }
            if ( GXutil.strcmp(Z12747HCCOkUsu, T013J2_A12747HCCOkUsu[0]) != 0 )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCOkUsu");
               GXutil.writeLogRaw("Old: ",Z12747HCCOkUsu);
               GXutil.writeLogRaw("Current: ",T013J2_A12747HCCOkUsu[0]);
            }
            if ( GXutil.strcmp(Z12748HCCobs2, T013J2_A12748HCCobs2[0]) != 0 )
            {
               GXutil.writeLogln("thhdrsq:[seudo value changed for attri]"+"HCCobs2");
               GXutil.writeLogRaw("Old: ",Z12748HCCobs2);
               GXutil.writeLogRaw("Current: ",T013J2_A12748HCCobs2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHHDRSQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13J1220( )
   {
      beforeValidate13J1220( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13J1220( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13J1220( 0) ;
         checkOptimisticConcurrency13J1220( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13J1220( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13J1220( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013J11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A9295HCCTCod), Boolean.valueOf(n9296HCCOpeCod), Integer.valueOf(A9296HCCOpeCod), Boolean.valueOf(n9297HCCFch), A9297HCCFch, Boolean.valueOf(n9298HCcObs), A9298HCcObs, Boolean.valueOf(n9299HCcDisp), A9299HCcDisp, Boolean.valueOf(n9300HCCFchUti), A9300HCCFchUti, Boolean.valueOf(n9349HCCTDsc), A9349HCCTDsc, Boolean.valueOf(n12744HCCUltn), Short.valueOf(A12744HCCUltn), Boolean.valueOf(n12745HCCOk), Byte.valueOf(A12745HCCOk), Boolean.valueOf(n12746HCCOkFch), A12746HCCOkFch, Boolean.valueOf(n12747HCCOkUsu), A12747HCCOkUsu, Boolean.valueOf(n12748HCCobs2), A12748HCCobs2, A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHHDRSQ");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption13J0( ) ;
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
            load13J1220( ) ;
         }
         endLevel13J1220( ) ;
      }
      closeExtendedTableCursors13J1220( ) ;
   }

   public void update13J1220( )
   {
      beforeValidate13J1220( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13J1220( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13J1220( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13J1220( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13J1220( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013J12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n9296HCCOpeCod), Integer.valueOf(A9296HCCOpeCod), Boolean.valueOf(n9297HCCFch), A9297HCCFch, Boolean.valueOf(n9298HCcObs), A9298HCcObs, Boolean.valueOf(n9299HCcDisp), A9299HCcDisp, Boolean.valueOf(n9300HCCFchUti), A9300HCCFchUti, Boolean.valueOf(n9349HCCTDsc), A9349HCCTDsc, Boolean.valueOf(n12744HCCUltn), Short.valueOf(A12744HCCUltn), Boolean.valueOf(n12745HCCOk), Byte.valueOf(A12745HCCOk), Boolean.valueOf(n12746HCCOkFch), A12746HCCOkFch, Boolean.valueOf(n12747HCCOkUsu), A12747HCCOkUsu, Boolean.valueOf(n12748HCCobs2), A12748HCCobs2, A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHHDRSQ");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHHDRSQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13J1220( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption13J0( ) ;
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
         endLevel13J1220( ) ;
      }
      closeExtendedTableCursors13J1220( ) ;
   }

   public void deferredUpdate13J1220( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13J1220( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13J1220( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13J1220( ) ;
         afterConfirm13J1220( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13J1220( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013J13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHHDRSQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1220 == 0 )
                     {
                        initAll13J1220( ) ;
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
                     resetCaption13J0( ) ;
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
      sMode1220 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13J1220( ) ;
      Gx_mode = sMode1220 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13J1220( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T013J14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin), Integer.valueOf(A9295HCCTCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HHDRS1Q", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel13J1220( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13J1220( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thhdrsq");
         if ( AnyError == 0 )
         {
            confirmValues13J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thhdrsq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13J1220( )
   {
      /* Scan By routine */
      /* Using cursor T013J15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1220 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1220 = (short)(1) ;
         A8956HBarCod = T013J15_A8956HBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
         A8957HBarCodReo = T013J15_A8957HBarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
         A8958HBarCodPar = T013J15_A8958HBarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
         A9208HProCod = T013J15_A9208HProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
         A9210HBarOrdLin = T013J15_A9210HBarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
         A9295HCCTCod = T013J15_A9295HCCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13J1220( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1220 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1220 = (short)(1) ;
         A8956HBarCod = T013J15_A8956HBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
         A8957HBarCodReo = T013J15_A8957HBarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
         A8958HBarCodPar = T013J15_A8958HBarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
         A9208HProCod = T013J15_A9208HProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
         A9210HBarOrdLin = T013J15_A9210HBarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
         A9295HCCTCod = T013J15_A9295HCCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
      }
   }

   public void scanEnd13J1220( )
   {
      pr_default.close(13);
   }

   public void afterConfirm13J1220( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13J1220( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13J1220( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13J1220( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13J1220( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13J1220( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13J1220( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHBarCod_Enabled), 5, 0), true);
      edtHBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHBarCodReo_Enabled), 5, 0), true);
      edtHBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHBarCodPar_Enabled), 5, 0), true);
      edtHProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHProCod_Enabled), 5, 0), true);
      edtHBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHBarOrdLin_Enabled), 5, 0), true);
      edtHCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCTCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHCCOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCOpeCod_Enabled), 5, 0), true);
      edtHCCFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCFch_Enabled), 5, 0), true);
      edtHCcObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCcObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCcObs_Enabled), 5, 0), true);
      edtHCcDisp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCcDisp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCcDisp_Enabled), 5, 0), true);
      edtHCCFchUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCFchUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCFchUti_Enabled), 5, 0), true);
      edtHCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCTDsc_Enabled), 5, 0), true);
      edtHCCUltn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCUltn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCUltn_Enabled), 5, 0), true);
      edtHCCOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCOk_Enabled), 5, 0), true);
      edtHCCOkFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCOkFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCOkFch_Enabled), 5, 0), true);
      edtHCCOkUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCOkUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCOkUsu_Enabled), 5, 0), true);
      edtHCCobs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHCCobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHCCobs2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes13J1220( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues13J0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thhdrsq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8956HBarCod", GXutil.ltrim( localUtil.ntoc( Z8956HBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8957HBarCodReo", GXutil.ltrim( localUtil.ntoc( Z8957HBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8958HBarCodPar", GXutil.rtrim( Z8958HBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9208HProCod", GXutil.rtrim( Z9208HProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9210HBarOrdLin", GXutil.ltrim( localUtil.ntoc( Z9210HBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9295HCCTCod", GXutil.ltrim( localUtil.ntoc( Z9295HCCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9296HCCOpeCod", GXutil.ltrim( localUtil.ntoc( Z9296HCCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9297HCCFch", localUtil.dtoc( Z9297HCCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9299HCcDisp", GXutil.rtrim( Z9299HCcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9300HCCFchUti", localUtil.dtoc( Z9300HCCFchUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9349HCCTDsc", GXutil.rtrim( Z9349HCCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12744HCCUltn", GXutil.ltrim( localUtil.ntoc( Z12744HCCUltn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12745HCCOk", GXutil.ltrim( localUtil.ntoc( Z12745HCCOk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12746HCCOkFch", localUtil.ttoc( Z12746HCCOkFch, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12747HCCOkUsu", GXutil.rtrim( Z12747HCCOkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12748HCCobs2", Z12748HCCobs2);
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
      return formatLink("app.thhdrsq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THHDRSQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO IGUAL A CC", "") ;
   }

   public void initializeNonKey13J1220( )
   {
      A9296HCCOpeCod = 0 ;
      n9296HCCOpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9296HCCOpeCod), 6, 0));
      A9297HCCFch = GXutil.nullDate() ;
      n9297HCCFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
      A9298HCcObs = "" ;
      n9298HCcObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9298HCcObs", A9298HCcObs);
      A9299HCcDisp = "" ;
      n9299HCcDisp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9299HCcDisp", A9299HCcDisp);
      A9300HCCFchUti = GXutil.nullDate() ;
      n9300HCCFchUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
      A9349HCCTDsc = "" ;
      n9349HCCTDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9349HCCTDsc", A9349HCCTDsc);
      A12744HCCUltn = (short)(0) ;
      n12744HCCUltn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12744HCCUltn), 4, 0));
      A12745HCCOk = (byte)(0) ;
      n12745HCCOk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.str( A12745HCCOk, 1, 0));
      A12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
      n12746HCCOkFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12747HCCOkUsu = "" ;
      n12747HCCOkUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12747HCCOkUsu", A12747HCCOkUsu);
      A12748HCCobs2 = "" ;
      n12748HCCobs2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12748HCCobs2", A12748HCCobs2);
      Z9296HCCOpeCod = 0 ;
      Z9297HCCFch = GXutil.nullDate() ;
      Z9299HCcDisp = "" ;
      Z9300HCCFchUti = GXutil.nullDate() ;
      Z9349HCCTDsc = "" ;
      Z12744HCCUltn = (short)(0) ;
      Z12745HCCOk = (byte)(0) ;
      Z12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
      Z12747HCCOkUsu = "" ;
      Z12748HCCobs2 = "" ;
   }

   public void initAll13J1220( )
   {
      A8956HBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8956HBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8956HBarCod), 8, 0));
      A8957HBarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8957HBarCodReo", GXutil.str( A8957HBarCodReo, 1, 0));
      A8958HBarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8958HBarCodPar", A8958HBarCodPar);
      A9208HProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9208HProCod", A9208HProCod);
      A9210HBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9210HBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9210HBarOrdLin), 4, 0));
      A9295HCCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9295HCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9295HCCTCod), 6, 0));
      initializeNonKey13J1220( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154349", true, true);
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
      httpContext.AddJavascriptSource("thhdrsq.js", "?2026824154349", false, true);
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
      edtHBarCod_Internalname = "HBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHBarCodReo_Internalname = "HBARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHBarCodPar_Internalname = "HBARCODPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHProCod_Internalname = "HPROCOD" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtHBarOrdLin_Internalname = "HBARORDLIN" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHCCTCod_Internalname = "HCCTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtHCCOpeCod_Internalname = "HCCOPECOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHCCFch_Internalname = "HCCFCH" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtHCcObs_Internalname = "HCCOBS" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtHCcDisp_Internalname = "HCCDISP" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtHCCFchUti_Internalname = "HCCFCHUTI" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtHCCTDsc_Internalname = "HCCTDSC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtHCCUltn_Internalname = "HCCULTN" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtHCCOk_Internalname = "HCCOK" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtHCCOkFch_Internalname = "HCCOKFCH" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtHCCOkUsu_Internalname = "HCCOKUSU" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtHCCobs2_Internalname = "HCCOBS2" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO IGUAL A CC", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHCCobs2_Backcolor = (int)(0xFFFFFF) ;
      edtHCCobs2_Enabled = 1 ;
      edtHCCOkUsu_Jsonclick = "" ;
      edtHCCOkUsu_Backcolor = (int)(0xFFFFFF) ;
      edtHCCOkUsu_Enabled = 1 ;
      edtHCCOkFch_Jsonclick = "" ;
      edtHCCOkFch_Backcolor = (int)(0xFFFFFF) ;
      edtHCCOkFch_Enabled = 1 ;
      edtHCCOk_Jsonclick = "" ;
      edtHCCOk_Backcolor = (int)(0xFFFFFF) ;
      edtHCCOk_Enabled = 1 ;
      edtHCCUltn_Jsonclick = "" ;
      edtHCCUltn_Backcolor = (int)(0xFFFFFF) ;
      edtHCCUltn_Enabled = 1 ;
      edtHCCTDsc_Jsonclick = "" ;
      edtHCCTDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHCCTDsc_Enabled = 1 ;
      edtHCCFchUti_Jsonclick = "" ;
      edtHCCFchUti_Backcolor = (int)(0xFFFFFF) ;
      edtHCCFchUti_Enabled = 1 ;
      edtHCcDisp_Jsonclick = "" ;
      edtHCcDisp_Backcolor = (int)(0xFFFFFF) ;
      edtHCcDisp_Enabled = 1 ;
      edtHCcObs_Backcolor = (int)(0xFFFFFF) ;
      edtHCcObs_Enabled = 1 ;
      edtHCCFch_Jsonclick = "" ;
      edtHCCFch_Backcolor = (int)(0xFFFFFF) ;
      edtHCCFch_Enabled = 1 ;
      edtHCCOpeCod_Jsonclick = "" ;
      edtHCCOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtHCCOpeCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHCCTCod_Jsonclick = "" ;
      edtHCCTCod_Backcolor = (int)(0xFFFFFF) ;
      edtHCCTCod_Enabled = 1 ;
      edtHBarOrdLin_Jsonclick = "" ;
      edtHBarOrdLin_Backcolor = (int)(0xFFFFFF) ;
      edtHBarOrdLin_Enabled = 1 ;
      edtHProCod_Jsonclick = "" ;
      edtHProCod_Backcolor = (int)(0xFFFFFF) ;
      edtHProCod_Enabled = 1 ;
      edtHBarCodPar_Jsonclick = "" ;
      edtHBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtHBarCodPar_Enabled = 1 ;
      edtHBarCodReo_Jsonclick = "" ;
      edtHBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtHBarCodReo_Enabled = 1 ;
      edtHBarCod_Jsonclick = "" ;
      edtHBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHBarCod_Enabled = 1 ;
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
      /* Using cursor T013J16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013J16_A407EmprNom[0] ;
      n407EmprNom = T013J16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T013J17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HHDRSF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HBARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      GX_FocusControl = edtHCCOpeCod_Internalname ;
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

   public void valid_Hbarordlin( )
   {
      /* Using cursor T013J17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A8956HBarCod), Byte.valueOf(A8957HBarCodReo), A8958HBarCodPar, A9208HProCod, Short.valueOf(A9210HBarOrdLin)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HHDRSF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HBARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHBarCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hcctcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9296HCCOpeCod", GXutil.ltrim( localUtil.ntoc( A9296HCCOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9297HCCFch", localUtil.format(A9297HCCFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9298HCcObs", A9298HCcObs);
      httpContext.ajax_rsp_assign_attri("", false, "A9299HCcDisp", GXutil.rtrim( A9299HCcDisp));
      httpContext.ajax_rsp_assign_attri("", false, "A9300HCCFchUti", localUtil.format(A9300HCCFchUti, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9349HCCTDsc", GXutil.rtrim( A9349HCCTDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A12744HCCUltn", GXutil.ltrim( localUtil.ntoc( A12744HCCUltn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12745HCCOk", GXutil.ltrim( localUtil.ntoc( A12745HCCOk, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12746HCCOkFch", localUtil.ttoc( A12746HCCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12747HCCOkUsu", GXutil.rtrim( A12747HCCOkUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A12748HCCobs2", A12748HCCobs2);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8956HBarCod", GXutil.ltrim( localUtil.ntoc( Z8956HBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8957HBarCodReo", GXutil.ltrim( localUtil.ntoc( Z8957HBarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8958HBarCodPar", GXutil.rtrim( Z8958HBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9208HProCod", GXutil.rtrim( Z9208HProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9210HBarOrdLin", GXutil.ltrim( localUtil.ntoc( Z9210HBarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9295HCCTCod", GXutil.ltrim( localUtil.ntoc( Z9295HCCTCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9296HCCOpeCod", GXutil.ltrim( localUtil.ntoc( Z9296HCCOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9297HCCFch", localUtil.format(Z9297HCCFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9298HCcObs", Z9298HCcObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9299HCcDisp", GXutil.rtrim( Z9299HCcDisp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9300HCCFchUti", localUtil.format(Z9300HCCFchUti, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9349HCCTDsc", GXutil.rtrim( Z9349HCCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12744HCCUltn", GXutil.ltrim( localUtil.ntoc( Z12744HCCUltn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12745HCCOk", GXutil.ltrim( localUtil.ntoc( Z12745HCCOk, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12746HCCOkFch", localUtil.ttoc( Z12746HCCOkFch, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12747HCCOkUsu", GXutil.rtrim( Z12747HCCOkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12748HCCobs2", Z12748HCCobs2);
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
      setEventMetadata("VALID_HBARCOD","{handler:'valid_Hbarcod',iparms:[]");
      setEventMetadata("VALID_HBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HBARCODREO","{handler:'valid_Hbarcodreo',iparms:[]");
      setEventMetadata("VALID_HBARCODREO",",oparms:[]}");
      setEventMetadata("VALID_HBARCODPAR","{handler:'valid_Hbarcodpar',iparms:[]");
      setEventMetadata("VALID_HBARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_HPROCOD","{handler:'valid_Hprocod',iparms:[]");
      setEventMetadata("VALID_HPROCOD",",oparms:[]}");
      setEventMetadata("VALID_HBARORDLIN","{handler:'valid_Hbarordlin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8956HBarCod',fld:'HBARCOD',pic:'ZZZZZZZ9'},{av:'A8957HBarCodReo',fld:'HBARCODREO',pic:'9'},{av:'A8958HBarCodPar',fld:'HBARCODPAR',pic:''},{av:'A9208HProCod',fld:'HPROCOD',pic:''},{av:'A9210HBarOrdLin',fld:'HBARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_HBARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_HCCTCOD","{handler:'valid_Hcctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8956HBarCod',fld:'HBARCOD',pic:'ZZZZZZZ9'},{av:'A8957HBarCodReo',fld:'HBARCODREO',pic:'9'},{av:'A8958HBarCodPar',fld:'HBARCODPAR',pic:''},{av:'A9208HProCod',fld:'HPROCOD',pic:''},{av:'A9210HBarOrdLin',fld:'HBARORDLIN',pic:'ZZZ9'},{av:'A9295HCCTCod',fld:'HCCTCOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HCCTCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9296HCCOpeCod',fld:'HCCOPECOD',pic:'ZZZZZ9'},{av:'A9297HCCFch',fld:'HCCFCH',pic:''},{av:'A9298HCcObs',fld:'HCCOBS',pic:''},{av:'A9299HCcDisp',fld:'HCCDISP',pic:''},{av:'A9300HCCFchUti',fld:'HCCFCHUTI',pic:''},{av:'A9349HCCTDsc',fld:'HCCTDSC',pic:''},{av:'A12744HCCUltn',fld:'HCCULTN',pic:'ZZZ9'},{av:'A12745HCCOk',fld:'HCCOK',pic:'9'},{av:'A12746HCCOkFch',fld:'HCCOKFCH',pic:'99/99/99 99:99'},{av:'A12747HCCOkUsu',fld:'HCCOKUSU',pic:''},{av:'A12748HCCobs2',fld:'HCCOBS2',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z8956HBarCod'},{av:'Z8957HBarCodReo'},{av:'Z8958HBarCodPar'},{av:'Z9208HProCod'},{av:'Z9210HBarOrdLin'},{av:'Z9295HCCTCod'},{av:'Z407EmprNom'},{av:'Z9296HCCOpeCod'},{av:'Z9297HCCFch'},{av:'Z9298HCcObs'},{av:'Z9299HCcDisp'},{av:'Z9300HCCFchUti'},{av:'Z9349HCCTDsc'},{av:'Z12744HCCUltn'},{av:'Z12745HCCOk'},{av:'Z12746HCCOkFch'},{av:'Z12747HCCOkUsu'},{av:'Z12748HCCobs2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z8958HBarCodPar = "" ;
      Z9208HProCod = "" ;
      Z9297HCCFch = GXutil.nullDate() ;
      Z9299HCcDisp = "" ;
      Z9300HCCFchUti = GXutil.nullDate() ;
      Z9349HCCTDsc = "" ;
      Z12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
      Z12747HCCOkUsu = "" ;
      Z12748HCCobs2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A8958HBarCodPar = "" ;
      A9208HProCod = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A9297HCCFch = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A9298HCcObs = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9299HCcDisp = "" ;
      lblTextblock13_Jsonclick = "" ;
      A9300HCCFchUti = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A9349HCCTDsc = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock18_Jsonclick = "" ;
      A12747HCCOkUsu = "" ;
      lblTextblock19_Jsonclick = "" ;
      A12748HCCobs2 = "" ;
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
      Z9298HCcObs = "" ;
      Z407EmprNom = "" ;
      T013J4_A407EmprNom = new String[] {""} ;
      T013J4_n407EmprNom = new boolean[] {false} ;
      T013J6_A9298HCcObs = new String[] {""} ;
      T013J6_n9298HCcObs = new boolean[] {false} ;
      T013J6_A9295HCCTCod = new int[1] ;
      T013J6_A407EmprNom = new String[] {""} ;
      T013J6_n407EmprNom = new boolean[] {false} ;
      T013J6_A9296HCCOpeCod = new int[1] ;
      T013J6_n9296HCCOpeCod = new boolean[] {false} ;
      T013J6_A9297HCCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J6_n9297HCCFch = new boolean[] {false} ;
      T013J6_A9299HCcDisp = new String[] {""} ;
      T013J6_n9299HCcDisp = new boolean[] {false} ;
      T013J6_A9300HCCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T013J6_n9300HCCFchUti = new boolean[] {false} ;
      T013J6_A9349HCCTDsc = new String[] {""} ;
      T013J6_n9349HCCTDsc = new boolean[] {false} ;
      T013J6_A12744HCCUltn = new short[1] ;
      T013J6_n12744HCCUltn = new boolean[] {false} ;
      T013J6_A12745HCCOk = new byte[1] ;
      T013J6_n12745HCCOk = new boolean[] {false} ;
      T013J6_A12746HCCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J6_n12746HCCOkFch = new boolean[] {false} ;
      T013J6_A12747HCCOkUsu = new String[] {""} ;
      T013J6_n12747HCCOkUsu = new boolean[] {false} ;
      T013J6_A12748HCCobs2 = new String[] {""} ;
      T013J6_n12748HCCobs2 = new boolean[] {false} ;
      T013J6_A396EmprCod = new String[] {""} ;
      T013J6_A8956HBarCod = new int[1] ;
      T013J6_A8957HBarCodReo = new byte[1] ;
      T013J6_A8958HBarCodPar = new String[] {""} ;
      T013J6_A9208HProCod = new String[] {""} ;
      T013J6_A9210HBarOrdLin = new short[1] ;
      T013J5_A396EmprCod = new String[] {""} ;
      T013J7_A396EmprCod = new String[] {""} ;
      T013J8_A396EmprCod = new String[] {""} ;
      T013J8_A8956HBarCod = new int[1] ;
      T013J8_A8957HBarCodReo = new byte[1] ;
      T013J8_A8958HBarCodPar = new String[] {""} ;
      T013J8_A9208HProCod = new String[] {""} ;
      T013J8_A9210HBarOrdLin = new short[1] ;
      T013J8_A9295HCCTCod = new int[1] ;
      T013J3_A9298HCcObs = new String[] {""} ;
      T013J3_n9298HCcObs = new boolean[] {false} ;
      T013J3_A9295HCCTCod = new int[1] ;
      T013J3_A9296HCCOpeCod = new int[1] ;
      T013J3_n9296HCCOpeCod = new boolean[] {false} ;
      T013J3_A9297HCCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J3_n9297HCCFch = new boolean[] {false} ;
      T013J3_A9299HCcDisp = new String[] {""} ;
      T013J3_n9299HCcDisp = new boolean[] {false} ;
      T013J3_A9300HCCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T013J3_n9300HCCFchUti = new boolean[] {false} ;
      T013J3_A9349HCCTDsc = new String[] {""} ;
      T013J3_n9349HCCTDsc = new boolean[] {false} ;
      T013J3_A12744HCCUltn = new short[1] ;
      T013J3_n12744HCCUltn = new boolean[] {false} ;
      T013J3_A12745HCCOk = new byte[1] ;
      T013J3_n12745HCCOk = new boolean[] {false} ;
      T013J3_A12746HCCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J3_n12746HCCOkFch = new boolean[] {false} ;
      T013J3_A12747HCCOkUsu = new String[] {""} ;
      T013J3_n12747HCCOkUsu = new boolean[] {false} ;
      T013J3_A12748HCCobs2 = new String[] {""} ;
      T013J3_n12748HCCobs2 = new boolean[] {false} ;
      T013J3_A396EmprCod = new String[] {""} ;
      T013J3_A8956HBarCod = new int[1] ;
      T013J3_A8957HBarCodReo = new byte[1] ;
      T013J3_A8958HBarCodPar = new String[] {""} ;
      T013J3_A9208HProCod = new String[] {""} ;
      T013J3_A9210HBarOrdLin = new short[1] ;
      sMode1220 = "" ;
      T013J9_A396EmprCod = new String[] {""} ;
      T013J9_A8956HBarCod = new int[1] ;
      T013J9_A8957HBarCodReo = new byte[1] ;
      T013J9_A8958HBarCodPar = new String[] {""} ;
      T013J9_A9208HProCod = new String[] {""} ;
      T013J9_A9210HBarOrdLin = new short[1] ;
      T013J9_A9295HCCTCod = new int[1] ;
      T013J10_A396EmprCod = new String[] {""} ;
      T013J10_A8956HBarCod = new int[1] ;
      T013J10_A8957HBarCodReo = new byte[1] ;
      T013J10_A8958HBarCodPar = new String[] {""} ;
      T013J10_A9208HProCod = new String[] {""} ;
      T013J10_A9210HBarOrdLin = new short[1] ;
      T013J10_A9295HCCTCod = new int[1] ;
      T013J2_A9298HCcObs = new String[] {""} ;
      T013J2_n9298HCcObs = new boolean[] {false} ;
      T013J2_A9295HCCTCod = new int[1] ;
      T013J2_A9296HCCOpeCod = new int[1] ;
      T013J2_n9296HCCOpeCod = new boolean[] {false} ;
      T013J2_A9297HCCFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J2_n9297HCCFch = new boolean[] {false} ;
      T013J2_A9299HCcDisp = new String[] {""} ;
      T013J2_n9299HCcDisp = new boolean[] {false} ;
      T013J2_A9300HCCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      T013J2_n9300HCCFchUti = new boolean[] {false} ;
      T013J2_A9349HCCTDsc = new String[] {""} ;
      T013J2_n9349HCCTDsc = new boolean[] {false} ;
      T013J2_A12744HCCUltn = new short[1] ;
      T013J2_n12744HCCUltn = new boolean[] {false} ;
      T013J2_A12745HCCOk = new byte[1] ;
      T013J2_n12745HCCOk = new boolean[] {false} ;
      T013J2_A12746HCCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      T013J2_n12746HCCOkFch = new boolean[] {false} ;
      T013J2_A12747HCCOkUsu = new String[] {""} ;
      T013J2_n12747HCCOkUsu = new boolean[] {false} ;
      T013J2_A12748HCCobs2 = new String[] {""} ;
      T013J2_n12748HCCobs2 = new boolean[] {false} ;
      T013J2_A396EmprCod = new String[] {""} ;
      T013J2_A8956HBarCod = new int[1] ;
      T013J2_A8957HBarCodReo = new byte[1] ;
      T013J2_A8958HBarCodPar = new String[] {""} ;
      T013J2_A9208HProCod = new String[] {""} ;
      T013J2_A9210HBarOrdLin = new short[1] ;
      T013J14_A396EmprCod = new String[] {""} ;
      T013J14_A8956HBarCod = new int[1] ;
      T013J14_A8957HBarCodReo = new byte[1] ;
      T013J14_A8958HBarCodPar = new String[] {""} ;
      T013J14_A9208HProCod = new String[] {""} ;
      T013J14_A9210HBarOrdLin = new short[1] ;
      T013J14_A9295HCCTCod = new int[1] ;
      T013J14_A9301HCCTLin = new short[1] ;
      T013J15_A396EmprCod = new String[] {""} ;
      T013J15_A8956HBarCod = new int[1] ;
      T013J15_A8957HBarCodReo = new byte[1] ;
      T013J15_A8958HBarCodPar = new String[] {""} ;
      T013J15_A9208HProCod = new String[] {""} ;
      T013J15_A9210HBarOrdLin = new short[1] ;
      T013J15_A9295HCCTCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T013J16_A407EmprNom = new String[] {""} ;
      T013J16_n407EmprNom = new boolean[] {false} ;
      T013J17_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ8958HBarCodPar = "" ;
      ZZ9208HProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ9297HCCFch = GXutil.nullDate() ;
      ZZ9298HCcObs = "" ;
      ZZ9299HCcDisp = "" ;
      ZZ9300HCCFchUti = GXutil.nullDate() ;
      ZZ9349HCCTDsc = "" ;
      ZZ12746HCCOkFch = GXutil.resetTime( GXutil.nullDate() );
      ZZ12747HCCOkUsu = "" ;
      ZZ12748HCCobs2 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thhdrsq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thhdrsq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thhdrsq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thhdrsq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thhdrsq__default(),
         new Object[] {
             new Object[] {
            T013J2_A9298HCcObs, T013J2_n9298HCcObs, T013J2_A9295HCCTCod, T013J2_A9296HCCOpeCod, T013J2_n9296HCCOpeCod, T013J2_A9297HCCFch, T013J2_n9297HCCFch, T013J2_A9299HCcDisp, T013J2_n9299HCcDisp, T013J2_A9300HCCFchUti,
            T013J2_n9300HCCFchUti, T013J2_A9349HCCTDsc, T013J2_n9349HCCTDsc, T013J2_A12744HCCUltn, T013J2_n12744HCCUltn, T013J2_A12745HCCOk, T013J2_n12745HCCOk, T013J2_A12746HCCOkFch, T013J2_n12746HCCOkFch, T013J2_A12747HCCOkUsu,
            T013J2_n12747HCCOkUsu, T013J2_A12748HCCobs2, T013J2_n12748HCCobs2, T013J2_A396EmprCod, T013J2_A8956HBarCod, T013J2_A8957HBarCodReo, T013J2_A8958HBarCodPar, T013J2_A9208HProCod, T013J2_A9210HBarOrdLin
            }
            , new Object[] {
            T013J3_A9298HCcObs, T013J3_n9298HCcObs, T013J3_A9295HCCTCod, T013J3_A9296HCCOpeCod, T013J3_n9296HCCOpeCod, T013J3_A9297HCCFch, T013J3_n9297HCCFch, T013J3_A9299HCcDisp, T013J3_n9299HCcDisp, T013J3_A9300HCCFchUti,
            T013J3_n9300HCCFchUti, T013J3_A9349HCCTDsc, T013J3_n9349HCCTDsc, T013J3_A12744HCCUltn, T013J3_n12744HCCUltn, T013J3_A12745HCCOk, T013J3_n12745HCCOk, T013J3_A12746HCCOkFch, T013J3_n12746HCCOkFch, T013J3_A12747HCCOkUsu,
            T013J3_n12747HCCOkUsu, T013J3_A12748HCCobs2, T013J3_n12748HCCobs2, T013J3_A396EmprCod, T013J3_A8956HBarCod, T013J3_A8957HBarCodReo, T013J3_A8958HBarCodPar, T013J3_A9208HProCod, T013J3_A9210HBarOrdLin
            }
            , new Object[] {
            T013J4_A407EmprNom, T013J4_n407EmprNom
            }
            , new Object[] {
            T013J5_A396EmprCod
            }
            , new Object[] {
            T013J6_A9298HCcObs, T013J6_n9298HCcObs, T013J6_A9295HCCTCod, T013J6_A407EmprNom, T013J6_n407EmprNom, T013J6_A9296HCCOpeCod, T013J6_n9296HCCOpeCod, T013J6_A9297HCCFch, T013J6_n9297HCCFch, T013J6_A9299HCcDisp,
            T013J6_n9299HCcDisp, T013J6_A9300HCCFchUti, T013J6_n9300HCCFchUti, T013J6_A9349HCCTDsc, T013J6_n9349HCCTDsc, T013J6_A12744HCCUltn, T013J6_n12744HCCUltn, T013J6_A12745HCCOk, T013J6_n12745HCCOk, T013J6_A12746HCCOkFch,
            T013J6_n12746HCCOkFch, T013J6_A12747HCCOkUsu, T013J6_n12747HCCOkUsu, T013J6_A12748HCCobs2, T013J6_n12748HCCobs2, T013J6_A396EmprCod, T013J6_A8956HBarCod, T013J6_A8957HBarCodReo, T013J6_A8958HBarCodPar, T013J6_A9208HProCod,
            T013J6_A9210HBarOrdLin
            }
            , new Object[] {
            T013J7_A396EmprCod
            }
            , new Object[] {
            T013J8_A396EmprCod, T013J8_A8956HBarCod, T013J8_A8957HBarCodReo, T013J8_A8958HBarCodPar, T013J8_A9208HProCod, T013J8_A9210HBarOrdLin, T013J8_A9295HCCTCod
            }
            , new Object[] {
            T013J9_A396EmprCod, T013J9_A8956HBarCod, T013J9_A8957HBarCodReo, T013J9_A8958HBarCodPar, T013J9_A9208HProCod, T013J9_A9210HBarOrdLin, T013J9_A9295HCCTCod
            }
            , new Object[] {
            T013J10_A396EmprCod, T013J10_A8956HBarCod, T013J10_A8957HBarCodReo, T013J10_A8958HBarCodPar, T013J10_A9208HProCod, T013J10_A9210HBarOrdLin, T013J10_A9295HCCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013J14_A396EmprCod, T013J14_A8956HBarCod, T013J14_A8957HBarCodReo, T013J14_A8958HBarCodPar, T013J14_A9208HProCod, T013J14_A9210HBarOrdLin, T013J14_A9295HCCTCod, T013J14_A9301HCCTLin
            }
            , new Object[] {
            T013J15_A396EmprCod, T013J15_A8956HBarCod, T013J15_A8957HBarCodReo, T013J15_A8958HBarCodPar, T013J15_A9208HProCod, T013J15_A9210HBarOrdLin, T013J15_A9295HCCTCod
            }
            , new Object[] {
            T013J16_A407EmprNom, T013J16_n407EmprNom
            }
            , new Object[] {
            T013J17_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THHDRSQ" ;
   }

   private byte Z8957HBarCodReo ;
   private byte Z12745HCCOk ;
   private byte GxWebError ;
   private byte A8957HBarCodReo ;
   private byte nKeyPressed ;
   private byte A12745HCCOk ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ8957HBarCodReo ;
   private byte ZZ12745HCCOk ;
   private short Z9210HBarOrdLin ;
   private short Z12744HCCUltn ;
   private short A9210HBarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12744HCCUltn ;
   private short RcdFound1220 ;
   private short nIsDirty_1220 ;
   private short ZZ9210HBarOrdLin ;
   private short ZZ12744HCCUltn ;
   private int Z8956HBarCod ;
   private int Z9295HCCTCod ;
   private int Z9296HCCOpeCod ;
   private int A8956HBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtHBarCod_Enabled ;
   private int edtHBarCodReo_Enabled ;
   private int edtHBarCodPar_Enabled ;
   private int edtHProCod_Enabled ;
   private int edtHBarOrdLin_Enabled ;
   private int A9295HCCTCod ;
   private int edtHCCTCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A9296HCCOpeCod ;
   private int edtHCCOpeCod_Enabled ;
   private int edtHCCFch_Enabled ;
   private int edtHCcObs_Enabled ;
   private int edtHCcDisp_Enabled ;
   private int edtHCCFchUti_Enabled ;
   private int edtHCCTDsc_Enabled ;
   private int edtHCCUltn_Enabled ;
   private int edtHCCOk_Enabled ;
   private int edtHCCOkFch_Enabled ;
   private int edtHCCOkUsu_Enabled ;
   private int edtHCCobs2_Enabled ;
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
   private int edtHCCobs2_Backcolor ;
   private int edtHCCOkUsu_Backcolor ;
   private int edtHCCOkFch_Backcolor ;
   private int edtHCCOk_Backcolor ;
   private int edtHCCUltn_Backcolor ;
   private int edtHCCTDsc_Backcolor ;
   private int edtHCCFchUti_Backcolor ;
   private int edtHCcDisp_Backcolor ;
   private int edtHCcObs_Backcolor ;
   private int edtHCCFch_Backcolor ;
   private int edtHCCOpeCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHCCTCod_Backcolor ;
   private int edtHBarOrdLin_Backcolor ;
   private int edtHProCod_Backcolor ;
   private int edtHBarCodPar_Backcolor ;
   private int edtHBarCodReo_Backcolor ;
   private int edtHBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ8956HBarCod ;
   private int ZZ9295HCCTCod ;
   private int ZZ9296HCCOpeCod ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z8958HBarCodPar ;
   private String Z9208HProCod ;
   private String Z9299HCcDisp ;
   private String Z9349HCCTDsc ;
   private String Z12747HCCOkUsu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A8958HBarCodPar ;
   private String A9208HProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHBarCod_Internalname ;
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
   private String edtHBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHBarCodReo_Internalname ;
   private String edtHBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHBarCodPar_Internalname ;
   private String edtHBarCodPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHProCod_Internalname ;
   private String edtHProCod_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHBarOrdLin_Internalname ;
   private String edtHBarOrdLin_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHCCTCod_Internalname ;
   private String edtHCCTCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtHCCOpeCod_Internalname ;
   private String edtHCCOpeCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHCCFch_Internalname ;
   private String edtHCCFch_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtHCcObs_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtHCcDisp_Internalname ;
   private String A9299HCcDisp ;
   private String edtHCcDisp_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtHCCFchUti_Internalname ;
   private String edtHCCFchUti_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtHCCTDsc_Internalname ;
   private String A9349HCCTDsc ;
   private String edtHCCTDsc_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtHCCUltn_Internalname ;
   private String edtHCCUltn_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtHCCOk_Internalname ;
   private String edtHCCOk_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtHCCOkFch_Internalname ;
   private String edtHCCOkFch_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtHCCOkUsu_Internalname ;
   private String A12747HCCOkUsu ;
   private String edtHCCOkUsu_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtHCCobs2_Internalname ;
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
   private String sMode1220 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ8958HBarCodPar ;
   private String ZZ9208HProCod ;
   private String ZZ407EmprNom ;
   private String ZZ9299HCcDisp ;
   private String ZZ9349HCCTDsc ;
   private String ZZ12747HCCOkUsu ;
   private java.util.Date Z12746HCCOkFch ;
   private java.util.Date A12746HCCOkFch ;
   private java.util.Date ZZ12746HCCOkFch ;
   private java.util.Date Z9297HCCFch ;
   private java.util.Date Z9300HCCFchUti ;
   private java.util.Date A9297HCCFch ;
   private java.util.Date A9300HCCFchUti ;
   private java.util.Date ZZ9297HCCFch ;
   private java.util.Date ZZ9300HCCFchUti ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9296HCCOpeCod ;
   private boolean n9297HCCFch ;
   private boolean n9298HCcObs ;
   private boolean n9299HCcDisp ;
   private boolean n9300HCCFchUti ;
   private boolean n9349HCCTDsc ;
   private boolean n12744HCCUltn ;
   private boolean n12745HCCOk ;
   private boolean n12746HCCOkFch ;
   private boolean n12747HCCOkUsu ;
   private boolean n12748HCCobs2 ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A9298HCcObs ;
   private String Z9298HCcObs ;
   private String ZZ9298HCcObs ;
   private String Z12748HCCobs2 ;
   private String A12748HCCobs2 ;
   private String ZZ12748HCCobs2 ;
   private IDataStoreProvider pr_default ;
   private String[] T013J4_A407EmprNom ;
   private boolean[] T013J4_n407EmprNom ;
   private String[] T013J6_A9298HCcObs ;
   private boolean[] T013J6_n9298HCcObs ;
   private int[] T013J6_A9295HCCTCod ;
   private String[] T013J6_A407EmprNom ;
   private boolean[] T013J6_n407EmprNom ;
   private int[] T013J6_A9296HCCOpeCod ;
   private boolean[] T013J6_n9296HCCOpeCod ;
   private java.util.Date[] T013J6_A9297HCCFch ;
   private boolean[] T013J6_n9297HCCFch ;
   private String[] T013J6_A9299HCcDisp ;
   private boolean[] T013J6_n9299HCcDisp ;
   private java.util.Date[] T013J6_A9300HCCFchUti ;
   private boolean[] T013J6_n9300HCCFchUti ;
   private String[] T013J6_A9349HCCTDsc ;
   private boolean[] T013J6_n9349HCCTDsc ;
   private short[] T013J6_A12744HCCUltn ;
   private boolean[] T013J6_n12744HCCUltn ;
   private byte[] T013J6_A12745HCCOk ;
   private boolean[] T013J6_n12745HCCOk ;
   private java.util.Date[] T013J6_A12746HCCOkFch ;
   private boolean[] T013J6_n12746HCCOkFch ;
   private String[] T013J6_A12747HCCOkUsu ;
   private boolean[] T013J6_n12747HCCOkUsu ;
   private String[] T013J6_A12748HCCobs2 ;
   private boolean[] T013J6_n12748HCCobs2 ;
   private String[] T013J6_A396EmprCod ;
   private int[] T013J6_A8956HBarCod ;
   private byte[] T013J6_A8957HBarCodReo ;
   private String[] T013J6_A8958HBarCodPar ;
   private String[] T013J6_A9208HProCod ;
   private short[] T013J6_A9210HBarOrdLin ;
   private String[] T013J5_A396EmprCod ;
   private String[] T013J7_A396EmprCod ;
   private String[] T013J8_A396EmprCod ;
   private int[] T013J8_A8956HBarCod ;
   private byte[] T013J8_A8957HBarCodReo ;
   private String[] T013J8_A8958HBarCodPar ;
   private String[] T013J8_A9208HProCod ;
   private short[] T013J8_A9210HBarOrdLin ;
   private int[] T013J8_A9295HCCTCod ;
   private String[] T013J3_A9298HCcObs ;
   private boolean[] T013J3_n9298HCcObs ;
   private int[] T013J3_A9295HCCTCod ;
   private int[] T013J3_A9296HCCOpeCod ;
   private boolean[] T013J3_n9296HCCOpeCod ;
   private java.util.Date[] T013J3_A9297HCCFch ;
   private boolean[] T013J3_n9297HCCFch ;
   private String[] T013J3_A9299HCcDisp ;
   private boolean[] T013J3_n9299HCcDisp ;
   private java.util.Date[] T013J3_A9300HCCFchUti ;
   private boolean[] T013J3_n9300HCCFchUti ;
   private String[] T013J3_A9349HCCTDsc ;
   private boolean[] T013J3_n9349HCCTDsc ;
   private short[] T013J3_A12744HCCUltn ;
   private boolean[] T013J3_n12744HCCUltn ;
   private byte[] T013J3_A12745HCCOk ;
   private boolean[] T013J3_n12745HCCOk ;
   private java.util.Date[] T013J3_A12746HCCOkFch ;
   private boolean[] T013J3_n12746HCCOkFch ;
   private String[] T013J3_A12747HCCOkUsu ;
   private boolean[] T013J3_n12747HCCOkUsu ;
   private String[] T013J3_A12748HCCobs2 ;
   private boolean[] T013J3_n12748HCCobs2 ;
   private String[] T013J3_A396EmprCod ;
   private int[] T013J3_A8956HBarCod ;
   private byte[] T013J3_A8957HBarCodReo ;
   private String[] T013J3_A8958HBarCodPar ;
   private String[] T013J3_A9208HProCod ;
   private short[] T013J3_A9210HBarOrdLin ;
   private String[] T013J9_A396EmprCod ;
   private int[] T013J9_A8956HBarCod ;
   private byte[] T013J9_A8957HBarCodReo ;
   private String[] T013J9_A8958HBarCodPar ;
   private String[] T013J9_A9208HProCod ;
   private short[] T013J9_A9210HBarOrdLin ;
   private int[] T013J9_A9295HCCTCod ;
   private String[] T013J10_A396EmprCod ;
   private int[] T013J10_A8956HBarCod ;
   private byte[] T013J10_A8957HBarCodReo ;
   private String[] T013J10_A8958HBarCodPar ;
   private String[] T013J10_A9208HProCod ;
   private short[] T013J10_A9210HBarOrdLin ;
   private int[] T013J10_A9295HCCTCod ;
   private String[] T013J2_A9298HCcObs ;
   private boolean[] T013J2_n9298HCcObs ;
   private int[] T013J2_A9295HCCTCod ;
   private int[] T013J2_A9296HCCOpeCod ;
   private boolean[] T013J2_n9296HCCOpeCod ;
   private java.util.Date[] T013J2_A9297HCCFch ;
   private boolean[] T013J2_n9297HCCFch ;
   private String[] T013J2_A9299HCcDisp ;
   private boolean[] T013J2_n9299HCcDisp ;
   private java.util.Date[] T013J2_A9300HCCFchUti ;
   private boolean[] T013J2_n9300HCCFchUti ;
   private String[] T013J2_A9349HCCTDsc ;
   private boolean[] T013J2_n9349HCCTDsc ;
   private short[] T013J2_A12744HCCUltn ;
   private boolean[] T013J2_n12744HCCUltn ;
   private byte[] T013J2_A12745HCCOk ;
   private boolean[] T013J2_n12745HCCOk ;
   private java.util.Date[] T013J2_A12746HCCOkFch ;
   private boolean[] T013J2_n12746HCCOkFch ;
   private String[] T013J2_A12747HCCOkUsu ;
   private boolean[] T013J2_n12747HCCOkUsu ;
   private String[] T013J2_A12748HCCobs2 ;
   private boolean[] T013J2_n12748HCCobs2 ;
   private String[] T013J2_A396EmprCod ;
   private int[] T013J2_A8956HBarCod ;
   private byte[] T013J2_A8957HBarCodReo ;
   private String[] T013J2_A8958HBarCodPar ;
   private String[] T013J2_A9208HProCod ;
   private short[] T013J2_A9210HBarOrdLin ;
   private String[] T013J14_A396EmprCod ;
   private int[] T013J14_A8956HBarCod ;
   private byte[] T013J14_A8957HBarCodReo ;
   private String[] T013J14_A8958HBarCodPar ;
   private String[] T013J14_A9208HProCod ;
   private short[] T013J14_A9210HBarOrdLin ;
   private int[] T013J14_A9295HCCTCod ;
   private short[] T013J14_A9301HCCTLin ;
   private String[] T013J15_A396EmprCod ;
   private int[] T013J15_A8956HBarCod ;
   private byte[] T013J15_A8957HBarCodReo ;
   private String[] T013J15_A8958HBarCodPar ;
   private String[] T013J15_A9208HProCod ;
   private short[] T013J15_A9210HBarOrdLin ;
   private int[] T013J15_A9295HCCTCod ;
   private String[] T013J16_A407EmprNom ;
   private boolean[] T013J16_n407EmprNom ;
   private String[] T013J17_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thhdrsq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thhdrsq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thhdrsq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thhdrsq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thhdrsq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013J2", "SELECT HCcObs, HCCTCod, HCCOpeCod, HCCFch, HCcDisp, HCCFchUti, HCCTDsc, HCCUltn, HCCOk, HCCOkFch, HCCOkUsu, HCCobs2, EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin FROM TXPHHDRSQ WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ?  FOR UPDATE OF HCCOpeCod, HCCFch, HCcObs, HCcDisp, HCCFchUti, HCCTDsc, HCCUltn, HCCOk, HCCOkFch, HCCOkUsu, HCCobs2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J3", "SELECT HCcObs, HCCTCod, HCCOpeCod, HCCFch, HCcDisp, HCCFchUti, HCCTDsc, HCCUltn, HCCOk, HCCOkFch, HCCOkUsu, HCCobs2, EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin FROM TXPHHDRSQ WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J5", "SELECT EmprCod FROM TXPHHDRSF WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J6", "SELECT /*+ FIRST_ROWS(100) */ TM1.HCcObs, TM1.HCCTCod, T2.EmprNom, TM1.HCCOpeCod, TM1.HCCFch, TM1.HCcDisp, TM1.HCCFchUti, TM1.HCCTDsc, TM1.HCCUltn, TM1.HCCOk, TM1.HCCOkFch, TM1.HCCOkUsu, TM1.HCCobs2, TM1.EmprCod, TM1.HBarCod, TM1.HBarCodReo, TM1.HBarCodPar, TM1.HProCod, TM1.HBarOrdLin FROM (TXPHHDRSQ TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HBarCod = ? and TM1.HBarCodReo = ? and TM1.HBarCodPar = ? and TM1.HProCod = ? and TM1.HBarOrdLin = ? and TM1.HCCTCod = ? ORDER BY TM1.EmprCod, TM1.HBarCod, TM1.HBarCodReo, TM1.HBarCodPar, TM1.HProCod, TM1.HBarOrdLin, TM1.HCCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J7", "SELECT EmprCod FROM TXPHHDRSF WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod FROM TXPHHDRSQ WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod FROM TXPHHDRSQ WHERE ( HBarCod > ? or HBarCod = ? and HBarCodReo > ? or HBarCodReo = ? and HBarCod = ? and HBarCodPar > ? or HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HProCod > ? or HProCod = ? and HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HBarOrdLin > ? or HBarOrdLin = ? and HProCod = ? and HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HCCTCod > ?) and EmprCod = ? ORDER BY EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013J10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod FROM TXPHHDRSQ WHERE ( HBarCod < ? or HBarCod = ? and HBarCodReo < ? or HBarCodReo = ? and HBarCod = ? and HBarCodPar < ? or HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HProCod < ? or HProCod = ? and HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HBarOrdLin < ? or HBarOrdLin = ? and HProCod = ? and HBarCodPar = ? and HBarCodReo = ? and HBarCod = ? and HCCTCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, HBarCod DESC, HBarCodReo DESC, HBarCodPar DESC, HProCod DESC, HBarOrdLin DESC, HCCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013J11", "INSERT INTO TXPHHDRSQ(HCCTCod, HCCOpeCod, HCCFch, HCcObs, HCcDisp, HCCFchUti, HCCTDsc, HCCUltn, HCCOk, HCCOkFch, HCCOkUsu, HCCobs2, EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHHDRSQ")
         ,new UpdateCursor("T013J12", "UPDATE TXPHHDRSQ SET HCCOpeCod=?, HCCFch=?, HCcObs=?, HCcDisp=?, HCCFchUti=?, HCCTDsc=?, HCCUltn=?, HCCOk=?, HCCOkFch=?, HCCOkUsu=?, HCCobs2=?  WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ?", GX_NOMASK, "TXPHHDRSQ")
         ,new UpdateCursor("T013J13", "DELETE FROM TXPHHDRSQ  WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ?", GX_NOMASK, "TXPHHDRSQ")
         ,new ForEachCursor("T013J14", "SELECT * FROM (SELECT EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod, HCCTLin FROM TXPHHDRS1 WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? AND HCCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013J15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod FROM TXPHHDRSQ WHERE EmprCod = ? ORDER BY EmprCod, HBarCod, HBarCodReo, HBarCodPar, HProCod, HBarOrdLin, HCCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013J17", "SELECT EmprCod FROM TXPHHDRSF WHERE EmprCod = ? AND HBarCod = ? AND HBarCodReo = ? AND HBarCodPar = ? AND HProCod = ? AND HBarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((String[]) buf[27])[0] = rslt.getString(17, 8);
               ((short[]) buf[28])[0] = rslt.getShort(18);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((String[]) buf[27])[0] = rslt.getString(17, 8);
               ((short[]) buf[28])[0] = rslt.getShort(18);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((String[]) buf[29])[0] = rslt.getString(18, 8);
               ((short[]) buf[30])[0] = rslt.getShort(19);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(4, (String)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 30);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 300);
               }
               stmt.setString(13, (String)parms[23], 3);
               stmt.setInt(14, ((Number) parms[24]).intValue());
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               stmt.setString(16, (String)parms[26], 1);
               stmt.setString(17, (String)parms[27], 8);
               stmt.setShort(18, ((Number) parms[28]).shortValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
                  stmt.setString(6, (String)parms[11], 30);
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 300);
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setByte(14, ((Number) parms[24]).byteValue());
               stmt.setString(15, (String)parms[25], 1);
               stmt.setString(16, (String)parms[26], 8);
               stmt.setShort(17, ((Number) parms[27]).shortValue());
               stmt.setInt(18, ((Number) parms[28]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

