package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txtoocq_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ord Compra Totvs Cola de Mensa", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXToOCQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public txtoocq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txtoocq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txtoocq_impl.class ));
   }

   public txtoocq_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbXToOCQTpo = new HTMLChoice();
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
      if ( cmbXToOCQTpo.getItemCount() > 0 )
      {
         A10220XToOCQTpo = cmbXToOCQTpo.getValidValue(A10220XToOCQTpo) ;
         n10220XToOCQTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCQTpo.setValue( GXutil.rtrim( A10220XToOCQTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbXToOCQTpo.getInternalname(), "Values", cmbXToOCQTpo.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXToOCQ.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Id Msg de Orden de Compra", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQId_Internalname, GXutil.ltrim( localUtil.ntoc( A10219XToOCQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCQId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10219XToOCQId), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10219XToOCQId), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQId_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQId_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbXToOCQTpo, cmbXToOCQTpo.getInternalname(), GXutil.rtrim( A10220XToOCQTpo), 1, cmbXToOCQTpo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbXToOCQTpo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, (byte)(0), "HLP_TXToOCQ.htm");
      cmbXToOCQTpo.setValue( GXutil.rtrim( A10220XToOCQTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCQTpo.getInternalname(), "Values", cmbXToOCQTpo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Naturaleza", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQNat_Internalname, GXutil.rtrim( A10221XToOCQNat), GXutil.rtrim( localUtil.format( A10221XToOCQNat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQNat_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQNat_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Comprobante", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQCmp_Internalname, GXutil.rtrim( A10222XToOCQCmp), GXutil.rtrim( localUtil.format( A10222XToOCQCmp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQCmp_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQCmp_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha Emisión", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQFch_Internalname, GXutil.rtrim( A10223XToOCQFch), GXutil.rtrim( localUtil.format( A10223XToOCQFch, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQFch_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Item", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQItm_Internalname, GXutil.rtrim( A10224XToOCQItm), GXutil.rtrim( localUtil.format( A10224XToOCQItm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQItm_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQItm_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQPrd_Internalname, GXutil.rtrim( A10225XToOCQPrd), GXutil.rtrim( localUtil.format( A10225XToOCQPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQPrd_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQPrd_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Descripción", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQDsc_Internalname, GXutil.rtrim( A10226XToOCQDsc), GXutil.rtrim( localUtil.format( A10226XToOCQDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQDsc_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cantidad", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A10227XToOCQCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXToOCQCnt_Enabled!=0) ? localUtil.format( A10227XToOCQCnt, "ZZZZZZZ9.999") : localUtil.format( A10227XToOCQCnt, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQCnt_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQCnt_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Prevista", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQFchP_Internalname, GXutil.rtrim( A10228XToOCQFchP), GXutil.rtrim( localUtil.format( A10228XToOCQFchP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQFchP_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQFchP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQPrv_Internalname, GXutil.rtrim( A10229XToOCQPrv), GXutil.rtrim( localUtil.format( A10229XToOCQPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQPrv_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQPrv_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tienda", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQTda_Internalname, GXutil.rtrim( A10230XToOCQTda), GXutil.rtrim( localUtil.format( A10230XToOCQTda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQTda_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQTda_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQPrvN_Internalname, GXutil.rtrim( A10231XToOCQPrvN), GXutil.rtrim( localUtil.format( A10231XToOCQPrvN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQPrvN_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQPrvN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Gpo Economico", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQGE_Internalname, GXutil.rtrim( A10232XToOCQGE), GXutil.rtrim( localUtil.format( A10232XToOCQGE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQGE_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQGE_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQCli_Internalname, GXutil.rtrim( A10233XToOCQCli), GXutil.rtrim( localUtil.format( A10233XToOCQCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQCli_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQCli_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Tienda Cliente", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQCliT_Internalname, GXutil.rtrim( A10234XToOCQCliT), GXutil.rtrim( localUtil.format( A10234XToOCQCliT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQCliT_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQCliT_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXToOCQCliN_Internalname, GXutil.rtrim( A10235XToOCQCliN), GXutil.rtrim( localUtil.format( A10235XToOCQCliN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXToOCQCliN_Jsonclick, 0, "", "", "", "", "", 1, edtXToOCQCliN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXToOCQ.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXToOCQ.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXToOCQ.htm");
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
      e1117E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z10219XToOCQId = localUtil.ctol( httpContext.cgiGet( "Z10219XToOCQId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z10220XToOCQTpo = httpContext.cgiGet( "Z10220XToOCQTpo") ;
            Z10221XToOCQNat = httpContext.cgiGet( "Z10221XToOCQNat") ;
            Z10222XToOCQCmp = httpContext.cgiGet( "Z10222XToOCQCmp") ;
            Z10223XToOCQFch = httpContext.cgiGet( "Z10223XToOCQFch") ;
            Z10224XToOCQItm = httpContext.cgiGet( "Z10224XToOCQItm") ;
            Z10225XToOCQPrd = httpContext.cgiGet( "Z10225XToOCQPrd") ;
            Z10226XToOCQDsc = httpContext.cgiGet( "Z10226XToOCQDsc") ;
            Z10227XToOCQCnt = localUtil.ctond( httpContext.cgiGet( "Z10227XToOCQCnt")) ;
            Z10228XToOCQFchP = httpContext.cgiGet( "Z10228XToOCQFchP") ;
            Z10229XToOCQPrv = httpContext.cgiGet( "Z10229XToOCQPrv") ;
            Z10230XToOCQTda = httpContext.cgiGet( "Z10230XToOCQTda") ;
            Z10231XToOCQPrvN = httpContext.cgiGet( "Z10231XToOCQPrvN") ;
            Z10232XToOCQGE = httpContext.cgiGet( "Z10232XToOCQGE") ;
            Z10233XToOCQCli = httpContext.cgiGet( "Z10233XToOCQCli") ;
            Z10234XToOCQCliT = httpContext.cgiGet( "Z10234XToOCQCliT") ;
            Z10235XToOCQCliN = httpContext.cgiGet( "Z10235XToOCQCliN") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV14Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXToOCQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10219XToOCQId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
            }
            else
            {
               A10219XToOCQId = localUtil.ctol( httpContext.cgiGet( edtXToOCQId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
            }
            cmbXToOCQTpo.setValue( httpContext.cgiGet( cmbXToOCQTpo.getInternalname()) );
            A10220XToOCQTpo = httpContext.cgiGet( cmbXToOCQTpo.getInternalname()) ;
            n10220XToOCQTpo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
            A10221XToOCQNat = httpContext.cgiGet( edtXToOCQNat_Internalname) ;
            n10221XToOCQNat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10221XToOCQNat", A10221XToOCQNat);
            A10222XToOCQCmp = httpContext.cgiGet( edtXToOCQCmp_Internalname) ;
            n10222XToOCQCmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10222XToOCQCmp", A10222XToOCQCmp);
            A10223XToOCQFch = httpContext.cgiGet( edtXToOCQFch_Internalname) ;
            n10223XToOCQFch = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10223XToOCQFch", A10223XToOCQFch);
            A10224XToOCQItm = httpContext.cgiGet( edtXToOCQItm_Internalname) ;
            n10224XToOCQItm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10224XToOCQItm", A10224XToOCQItm);
            A10225XToOCQPrd = httpContext.cgiGet( edtXToOCQPrd_Internalname) ;
            n10225XToOCQPrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10225XToOCQPrd", A10225XToOCQPrd);
            A10226XToOCQDsc = httpContext.cgiGet( edtXToOCQDsc_Internalname) ;
            n10226XToOCQDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10226XToOCQDsc", A10226XToOCQDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXToOCQCnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXToOCQCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XTOOCQCNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCQCnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10227XToOCQCnt = DecimalUtil.ZERO ;
               n10227XToOCQCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrimstr( A10227XToOCQCnt, 12, 3));
            }
            else
            {
               A10227XToOCQCnt = localUtil.ctond( httpContext.cgiGet( edtXToOCQCnt_Internalname)) ;
               n10227XToOCQCnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrimstr( A10227XToOCQCnt, 12, 3));
            }
            A10228XToOCQFchP = httpContext.cgiGet( edtXToOCQFchP_Internalname) ;
            n10228XToOCQFchP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10228XToOCQFchP", A10228XToOCQFchP);
            A10229XToOCQPrv = httpContext.cgiGet( edtXToOCQPrv_Internalname) ;
            n10229XToOCQPrv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10229XToOCQPrv", A10229XToOCQPrv);
            A10230XToOCQTda = httpContext.cgiGet( edtXToOCQTda_Internalname) ;
            n10230XToOCQTda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10230XToOCQTda", A10230XToOCQTda);
            A10231XToOCQPrvN = httpContext.cgiGet( edtXToOCQPrvN_Internalname) ;
            n10231XToOCQPrvN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10231XToOCQPrvN", A10231XToOCQPrvN);
            A10232XToOCQGE = httpContext.cgiGet( edtXToOCQGE_Internalname) ;
            n10232XToOCQGE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10232XToOCQGE", A10232XToOCQGE);
            A10233XToOCQCli = httpContext.cgiGet( edtXToOCQCli_Internalname) ;
            n10233XToOCQCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10233XToOCQCli", A10233XToOCQCli);
            A10234XToOCQCliT = httpContext.cgiGet( edtXToOCQCliT_Internalname) ;
            n10234XToOCQCliT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10234XToOCQCliT", A10234XToOCQCliT);
            A10235XToOCQCliN = httpContext.cgiGet( edtXToOCQCliN_Internalname) ;
            n10235XToOCQCliN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10235XToOCQCliN", A10235XToOCQCliN);
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
               A10219XToOCQId = GXutil.lval( httpContext.GetPar( "XToOCQId")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
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
                        e1117E2 ();
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
            initAll17E1384( ) ;
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
      disableAttributes17E1384( ) ;
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

   public void confirm_17E0( )
   {
      beforeValidate17E1384( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17E1384( ) ;
         }
         else
         {
            checkExtendedTable17E1384( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors17E1384( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues17E0( ) ;
      }
   }

   public void resetCaption17E0( )
   {
   }

   public void e1117E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      txtoocq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV14Pgmname, (byte)(99), GXv_char2) ;
      txtoocq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      txtoocq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      txtoocq_impl.this.AV13EmprCod = GXv_char2[0] ;
      txtoocq_impl.this.AV11EmprNom = GXv_char3[0] ;
      txtoocq_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17E1384( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10220XToOCQTpo = T017E3_A10220XToOCQTpo[0] ;
            Z10221XToOCQNat = T017E3_A10221XToOCQNat[0] ;
            Z10222XToOCQCmp = T017E3_A10222XToOCQCmp[0] ;
            Z10223XToOCQFch = T017E3_A10223XToOCQFch[0] ;
            Z10224XToOCQItm = T017E3_A10224XToOCQItm[0] ;
            Z10225XToOCQPrd = T017E3_A10225XToOCQPrd[0] ;
            Z10226XToOCQDsc = T017E3_A10226XToOCQDsc[0] ;
            Z10227XToOCQCnt = T017E3_A10227XToOCQCnt[0] ;
            Z10228XToOCQFchP = T017E3_A10228XToOCQFchP[0] ;
            Z10229XToOCQPrv = T017E3_A10229XToOCQPrv[0] ;
            Z10230XToOCQTda = T017E3_A10230XToOCQTda[0] ;
            Z10231XToOCQPrvN = T017E3_A10231XToOCQPrvN[0] ;
            Z10232XToOCQGE = T017E3_A10232XToOCQGE[0] ;
            Z10233XToOCQCli = T017E3_A10233XToOCQCli[0] ;
            Z10234XToOCQCliT = T017E3_A10234XToOCQCliT[0] ;
            Z10235XToOCQCliN = T017E3_A10235XToOCQCliN[0] ;
         }
         else
         {
            Z10220XToOCQTpo = A10220XToOCQTpo ;
            Z10221XToOCQNat = A10221XToOCQNat ;
            Z10222XToOCQCmp = A10222XToOCQCmp ;
            Z10223XToOCQFch = A10223XToOCQFch ;
            Z10224XToOCQItm = A10224XToOCQItm ;
            Z10225XToOCQPrd = A10225XToOCQPrd ;
            Z10226XToOCQDsc = A10226XToOCQDsc ;
            Z10227XToOCQCnt = A10227XToOCQCnt ;
            Z10228XToOCQFchP = A10228XToOCQFchP ;
            Z10229XToOCQPrv = A10229XToOCQPrv ;
            Z10230XToOCQTda = A10230XToOCQTda ;
            Z10231XToOCQPrvN = A10231XToOCQPrvN ;
            Z10232XToOCQGE = A10232XToOCQGE ;
            Z10233XToOCQCli = A10233XToOCQCli ;
            Z10234XToOCQCliT = A10234XToOCQCliT ;
            Z10235XToOCQCliN = A10235XToOCQCliN ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z10219XToOCQId = A10219XToOCQId ;
         Z10220XToOCQTpo = A10220XToOCQTpo ;
         Z10221XToOCQNat = A10221XToOCQNat ;
         Z10222XToOCQCmp = A10222XToOCQCmp ;
         Z10223XToOCQFch = A10223XToOCQFch ;
         Z10224XToOCQItm = A10224XToOCQItm ;
         Z10225XToOCQPrd = A10225XToOCQPrd ;
         Z10226XToOCQDsc = A10226XToOCQDsc ;
         Z10227XToOCQCnt = A10227XToOCQCnt ;
         Z10228XToOCQFchP = A10228XToOCQFchP ;
         Z10229XToOCQPrv = A10229XToOCQPrv ;
         Z10230XToOCQTda = A10230XToOCQTda ;
         Z10231XToOCQPrvN = A10231XToOCQPrvN ;
         Z10232XToOCQGE = A10232XToOCQGE ;
         Z10233XToOCQCli = A10233XToOCQCli ;
         Z10234XToOCQCliT = A10234XToOCQCliT ;
         Z10235XToOCQCliN = A10235XToOCQCliN ;
      }
   }

   public void standaloneNotModal( )
   {
      AV14Pgmname = "TXToOCQ" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Pgmname", AV14Pgmname);
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

   public void load17E1384( )
   {
      /* Using cursor T017E4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A10219XToOCQId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1384 = (short)(1) ;
         A10220XToOCQTpo = T017E4_A10220XToOCQTpo[0] ;
         n10220XToOCQTpo = T017E4_n10220XToOCQTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
         A10221XToOCQNat = T017E4_A10221XToOCQNat[0] ;
         n10221XToOCQNat = T017E4_n10221XToOCQNat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10221XToOCQNat", A10221XToOCQNat);
         A10222XToOCQCmp = T017E4_A10222XToOCQCmp[0] ;
         n10222XToOCQCmp = T017E4_n10222XToOCQCmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10222XToOCQCmp", A10222XToOCQCmp);
         A10223XToOCQFch = T017E4_A10223XToOCQFch[0] ;
         n10223XToOCQFch = T017E4_n10223XToOCQFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10223XToOCQFch", A10223XToOCQFch);
         A10224XToOCQItm = T017E4_A10224XToOCQItm[0] ;
         n10224XToOCQItm = T017E4_n10224XToOCQItm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10224XToOCQItm", A10224XToOCQItm);
         A10225XToOCQPrd = T017E4_A10225XToOCQPrd[0] ;
         n10225XToOCQPrd = T017E4_n10225XToOCQPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10225XToOCQPrd", A10225XToOCQPrd);
         A10226XToOCQDsc = T017E4_A10226XToOCQDsc[0] ;
         n10226XToOCQDsc = T017E4_n10226XToOCQDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10226XToOCQDsc", A10226XToOCQDsc);
         A10227XToOCQCnt = T017E4_A10227XToOCQCnt[0] ;
         n10227XToOCQCnt = T017E4_n10227XToOCQCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrimstr( A10227XToOCQCnt, 12, 3));
         A10228XToOCQFchP = T017E4_A10228XToOCQFchP[0] ;
         n10228XToOCQFchP = T017E4_n10228XToOCQFchP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10228XToOCQFchP", A10228XToOCQFchP);
         A10229XToOCQPrv = T017E4_A10229XToOCQPrv[0] ;
         n10229XToOCQPrv = T017E4_n10229XToOCQPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10229XToOCQPrv", A10229XToOCQPrv);
         A10230XToOCQTda = T017E4_A10230XToOCQTda[0] ;
         n10230XToOCQTda = T017E4_n10230XToOCQTda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10230XToOCQTda", A10230XToOCQTda);
         A10231XToOCQPrvN = T017E4_A10231XToOCQPrvN[0] ;
         n10231XToOCQPrvN = T017E4_n10231XToOCQPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10231XToOCQPrvN", A10231XToOCQPrvN);
         A10232XToOCQGE = T017E4_A10232XToOCQGE[0] ;
         n10232XToOCQGE = T017E4_n10232XToOCQGE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10232XToOCQGE", A10232XToOCQGE);
         A10233XToOCQCli = T017E4_A10233XToOCQCli[0] ;
         n10233XToOCQCli = T017E4_n10233XToOCQCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10233XToOCQCli", A10233XToOCQCli);
         A10234XToOCQCliT = T017E4_A10234XToOCQCliT[0] ;
         n10234XToOCQCliT = T017E4_n10234XToOCQCliT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10234XToOCQCliT", A10234XToOCQCliT);
         A10235XToOCQCliN = T017E4_A10235XToOCQCliN[0] ;
         n10235XToOCQCliN = T017E4_n10235XToOCQCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10235XToOCQCliN", A10235XToOCQCliN);
         zm17E1384( -2) ;
      }
      pr_default.close(2);
      onLoadActions17E1384( ) ;
   }

   public void onLoadActions17E1384( )
   {
   }

   public void checkExtendedTable17E1384( )
   {
      nIsDirty_1384 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A10220XToOCQTpo, "A") == 0 ) || ( GXutil.strcmp(A10220XToOCQTpo, "M") == 0 ) || ( GXutil.strcmp(A10220XToOCQTpo, "B") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "XTOOCQTPO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors17E1384( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17E1384( )
   {
      /* Using cursor T017E5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A10219XToOCQId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1384 = (short)(1) ;
      }
      else
      {
         RcdFound1384 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017E3 */
      pr_default.execute(1, new Object[] {Long.valueOf(A10219XToOCQId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm17E1384( 2) ;
         RcdFound1384 = (short)(1) ;
         A10219XToOCQId = T017E3_A10219XToOCQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
         A10220XToOCQTpo = T017E3_A10220XToOCQTpo[0] ;
         n10220XToOCQTpo = T017E3_n10220XToOCQTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
         A10221XToOCQNat = T017E3_A10221XToOCQNat[0] ;
         n10221XToOCQNat = T017E3_n10221XToOCQNat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10221XToOCQNat", A10221XToOCQNat);
         A10222XToOCQCmp = T017E3_A10222XToOCQCmp[0] ;
         n10222XToOCQCmp = T017E3_n10222XToOCQCmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10222XToOCQCmp", A10222XToOCQCmp);
         A10223XToOCQFch = T017E3_A10223XToOCQFch[0] ;
         n10223XToOCQFch = T017E3_n10223XToOCQFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10223XToOCQFch", A10223XToOCQFch);
         A10224XToOCQItm = T017E3_A10224XToOCQItm[0] ;
         n10224XToOCQItm = T017E3_n10224XToOCQItm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10224XToOCQItm", A10224XToOCQItm);
         A10225XToOCQPrd = T017E3_A10225XToOCQPrd[0] ;
         n10225XToOCQPrd = T017E3_n10225XToOCQPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10225XToOCQPrd", A10225XToOCQPrd);
         A10226XToOCQDsc = T017E3_A10226XToOCQDsc[0] ;
         n10226XToOCQDsc = T017E3_n10226XToOCQDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10226XToOCQDsc", A10226XToOCQDsc);
         A10227XToOCQCnt = T017E3_A10227XToOCQCnt[0] ;
         n10227XToOCQCnt = T017E3_n10227XToOCQCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrimstr( A10227XToOCQCnt, 12, 3));
         A10228XToOCQFchP = T017E3_A10228XToOCQFchP[0] ;
         n10228XToOCQFchP = T017E3_n10228XToOCQFchP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10228XToOCQFchP", A10228XToOCQFchP);
         A10229XToOCQPrv = T017E3_A10229XToOCQPrv[0] ;
         n10229XToOCQPrv = T017E3_n10229XToOCQPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10229XToOCQPrv", A10229XToOCQPrv);
         A10230XToOCQTda = T017E3_A10230XToOCQTda[0] ;
         n10230XToOCQTda = T017E3_n10230XToOCQTda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10230XToOCQTda", A10230XToOCQTda);
         A10231XToOCQPrvN = T017E3_A10231XToOCQPrvN[0] ;
         n10231XToOCQPrvN = T017E3_n10231XToOCQPrvN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10231XToOCQPrvN", A10231XToOCQPrvN);
         A10232XToOCQGE = T017E3_A10232XToOCQGE[0] ;
         n10232XToOCQGE = T017E3_n10232XToOCQGE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10232XToOCQGE", A10232XToOCQGE);
         A10233XToOCQCli = T017E3_A10233XToOCQCli[0] ;
         n10233XToOCQCli = T017E3_n10233XToOCQCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10233XToOCQCli", A10233XToOCQCli);
         A10234XToOCQCliT = T017E3_A10234XToOCQCliT[0] ;
         n10234XToOCQCliT = T017E3_n10234XToOCQCliT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10234XToOCQCliT", A10234XToOCQCliT);
         A10235XToOCQCliN = T017E3_A10235XToOCQCliN[0] ;
         n10235XToOCQCliN = T017E3_n10235XToOCQCliN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10235XToOCQCliN", A10235XToOCQCliN);
         Z10219XToOCQId = A10219XToOCQId ;
         sMode1384 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17E1384( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1384 = (short)(0) ;
            initializeNonKey17E1384( ) ;
         }
         Gx_mode = sMode1384 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1384 = (short)(0) ;
         initializeNonKey17E1384( ) ;
         sMode1384 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1384 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey17E1384( ) ;
      if ( RcdFound1384 == 0 )
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
      RcdFound1384 = (short)(0) ;
      /* Using cursor T017E6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A10219XToOCQId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T017E6_A10219XToOCQId[0] < A10219XToOCQId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T017E6_A10219XToOCQId[0] > A10219XToOCQId ) ) )
         {
            A10219XToOCQId = T017E6_A10219XToOCQId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
            RcdFound1384 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1384 = (short)(0) ;
      /* Using cursor T017E7 */
      pr_default.execute(5, new Object[] {Long.valueOf(A10219XToOCQId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T017E7_A10219XToOCQId[0] > A10219XToOCQId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T017E7_A10219XToOCQId[0] < A10219XToOCQId ) ) )
         {
            A10219XToOCQId = T017E7_A10219XToOCQId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
            RcdFound1384 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17E1384( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXToOCQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17E1384( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1384 == 1 )
         {
            if ( A10219XToOCQId != Z10219XToOCQId )
            {
               A10219XToOCQId = Z10219XToOCQId ;
               httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "XTOOCQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXToOCQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17E1384( ) ;
               GX_FocusControl = edtXToOCQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A10219XToOCQId != Z10219XToOCQId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtXToOCQId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17E1384( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XTOOCQID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXToOCQId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtXToOCQId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17E1384( ) ;
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
      if ( A10219XToOCQId != Z10219XToOCQId )
      {
         A10219XToOCQId = Z10219XToOCQId ;
         httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "XTOOCQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXToOCQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXToOCQId_Internalname ;
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
      getKey17E1384( ) ;
      if ( RcdFound1384 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "XTOOCQID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXToOCQId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A10219XToOCQId != Z10219XToOCQId )
         {
            A10219XToOCQId = Z10219XToOCQId ;
            httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "XTOOCQID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXToOCQId_Internalname ;
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
         if ( A10219XToOCQId != Z10219XToOCQId )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XTOOCQID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXToOCQId_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txtoocq");
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17E0( ) ;
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
      if ( RcdFound1384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "XTOOCQID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXToOCQId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17E1384( ) ;
      if ( RcdFound1384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17E1384( ) ;
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
      if ( RcdFound1384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
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
      if ( RcdFound1384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
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
      scanStart17E1384( ) ;
      if ( RcdFound1384 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1384 != 0 )
         {
            scanNext17E1384( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17E1384( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17E1384( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017E2 */
         pr_default.execute(0, new Object[] {Long.valueOf(A10219XToOCQId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXToOCQ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10220XToOCQTpo, T017E2_A10220XToOCQTpo[0]) != 0 ) || ( GXutil.strcmp(Z10221XToOCQNat, T017E2_A10221XToOCQNat[0]) != 0 ) || ( GXutil.strcmp(Z10222XToOCQCmp, T017E2_A10222XToOCQCmp[0]) != 0 ) || ( GXutil.strcmp(Z10223XToOCQFch, T017E2_A10223XToOCQFch[0]) != 0 ) || ( GXutil.strcmp(Z10224XToOCQItm, T017E2_A10224XToOCQItm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10225XToOCQPrd, T017E2_A10225XToOCQPrd[0]) != 0 ) || ( GXutil.strcmp(Z10226XToOCQDsc, T017E2_A10226XToOCQDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z10227XToOCQCnt, T017E2_A10227XToOCQCnt[0]) != 0 ) || ( GXutil.strcmp(Z10228XToOCQFchP, T017E2_A10228XToOCQFchP[0]) != 0 ) || ( GXutil.strcmp(Z10229XToOCQPrv, T017E2_A10229XToOCQPrv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10230XToOCQTda, T017E2_A10230XToOCQTda[0]) != 0 ) || ( GXutil.strcmp(Z10231XToOCQPrvN, T017E2_A10231XToOCQPrvN[0]) != 0 ) || ( GXutil.strcmp(Z10232XToOCQGE, T017E2_A10232XToOCQGE[0]) != 0 ) || ( GXutil.strcmp(Z10233XToOCQCli, T017E2_A10233XToOCQCli[0]) != 0 ) || ( GXutil.strcmp(Z10234XToOCQCliT, T017E2_A10234XToOCQCliT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10235XToOCQCliN, T017E2_A10235XToOCQCliN[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10220XToOCQTpo, T017E2_A10220XToOCQTpo[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQTpo");
               GXutil.writeLogRaw("Old: ",Z10220XToOCQTpo);
               GXutil.writeLogRaw("Current: ",T017E2_A10220XToOCQTpo[0]);
            }
            if ( GXutil.strcmp(Z10221XToOCQNat, T017E2_A10221XToOCQNat[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQNat");
               GXutil.writeLogRaw("Old: ",Z10221XToOCQNat);
               GXutil.writeLogRaw("Current: ",T017E2_A10221XToOCQNat[0]);
            }
            if ( GXutil.strcmp(Z10222XToOCQCmp, T017E2_A10222XToOCQCmp[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQCmp");
               GXutil.writeLogRaw("Old: ",Z10222XToOCQCmp);
               GXutil.writeLogRaw("Current: ",T017E2_A10222XToOCQCmp[0]);
            }
            if ( GXutil.strcmp(Z10223XToOCQFch, T017E2_A10223XToOCQFch[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQFch");
               GXutil.writeLogRaw("Old: ",Z10223XToOCQFch);
               GXutil.writeLogRaw("Current: ",T017E2_A10223XToOCQFch[0]);
            }
            if ( GXutil.strcmp(Z10224XToOCQItm, T017E2_A10224XToOCQItm[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQItm");
               GXutil.writeLogRaw("Old: ",Z10224XToOCQItm);
               GXutil.writeLogRaw("Current: ",T017E2_A10224XToOCQItm[0]);
            }
            if ( GXutil.strcmp(Z10225XToOCQPrd, T017E2_A10225XToOCQPrd[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQPrd");
               GXutil.writeLogRaw("Old: ",Z10225XToOCQPrd);
               GXutil.writeLogRaw("Current: ",T017E2_A10225XToOCQPrd[0]);
            }
            if ( GXutil.strcmp(Z10226XToOCQDsc, T017E2_A10226XToOCQDsc[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQDsc");
               GXutil.writeLogRaw("Old: ",Z10226XToOCQDsc);
               GXutil.writeLogRaw("Current: ",T017E2_A10226XToOCQDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z10227XToOCQCnt, T017E2_A10227XToOCQCnt[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQCnt");
               GXutil.writeLogRaw("Old: ",Z10227XToOCQCnt);
               GXutil.writeLogRaw("Current: ",T017E2_A10227XToOCQCnt[0]);
            }
            if ( GXutil.strcmp(Z10228XToOCQFchP, T017E2_A10228XToOCQFchP[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQFchP");
               GXutil.writeLogRaw("Old: ",Z10228XToOCQFchP);
               GXutil.writeLogRaw("Current: ",T017E2_A10228XToOCQFchP[0]);
            }
            if ( GXutil.strcmp(Z10229XToOCQPrv, T017E2_A10229XToOCQPrv[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQPrv");
               GXutil.writeLogRaw("Old: ",Z10229XToOCQPrv);
               GXutil.writeLogRaw("Current: ",T017E2_A10229XToOCQPrv[0]);
            }
            if ( GXutil.strcmp(Z10230XToOCQTda, T017E2_A10230XToOCQTda[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQTda");
               GXutil.writeLogRaw("Old: ",Z10230XToOCQTda);
               GXutil.writeLogRaw("Current: ",T017E2_A10230XToOCQTda[0]);
            }
            if ( GXutil.strcmp(Z10231XToOCQPrvN, T017E2_A10231XToOCQPrvN[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQPrvN");
               GXutil.writeLogRaw("Old: ",Z10231XToOCQPrvN);
               GXutil.writeLogRaw("Current: ",T017E2_A10231XToOCQPrvN[0]);
            }
            if ( GXutil.strcmp(Z10232XToOCQGE, T017E2_A10232XToOCQGE[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQGE");
               GXutil.writeLogRaw("Old: ",Z10232XToOCQGE);
               GXutil.writeLogRaw("Current: ",T017E2_A10232XToOCQGE[0]);
            }
            if ( GXutil.strcmp(Z10233XToOCQCli, T017E2_A10233XToOCQCli[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQCli");
               GXutil.writeLogRaw("Old: ",Z10233XToOCQCli);
               GXutil.writeLogRaw("Current: ",T017E2_A10233XToOCQCli[0]);
            }
            if ( GXutil.strcmp(Z10234XToOCQCliT, T017E2_A10234XToOCQCliT[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQCliT");
               GXutil.writeLogRaw("Old: ",Z10234XToOCQCliT);
               GXutil.writeLogRaw("Current: ",T017E2_A10234XToOCQCliT[0]);
            }
            if ( GXutil.strcmp(Z10235XToOCQCliN, T017E2_A10235XToOCQCliN[0]) != 0 )
            {
               GXutil.writeLogln("txtoocq:[seudo value changed for attri]"+"XToOCQCliN");
               GXutil.writeLogRaw("Old: ",Z10235XToOCQCliN);
               GXutil.writeLogRaw("Current: ",T017E2_A10235XToOCQCliN[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXToOCQ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17E1384( )
   {
      beforeValidate17E1384( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17E1384( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17E1384( 0) ;
         checkOptimisticConcurrency17E1384( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17E1384( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17E1384( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017E8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A10219XToOCQId), Boolean.valueOf(n10220XToOCQTpo), A10220XToOCQTpo, Boolean.valueOf(n10221XToOCQNat), A10221XToOCQNat, Boolean.valueOf(n10222XToOCQCmp), A10222XToOCQCmp, Boolean.valueOf(n10223XToOCQFch), A10223XToOCQFch, Boolean.valueOf(n10224XToOCQItm), A10224XToOCQItm, Boolean.valueOf(n10225XToOCQPrd), A10225XToOCQPrd, Boolean.valueOf(n10226XToOCQDsc), A10226XToOCQDsc, Boolean.valueOf(n10227XToOCQCnt), A10227XToOCQCnt, Boolean.valueOf(n10228XToOCQFchP), A10228XToOCQFchP, Boolean.valueOf(n10229XToOCQPrv), A10229XToOCQPrv, Boolean.valueOf(n10230XToOCQTda), A10230XToOCQTda, Boolean.valueOf(n10231XToOCQPrvN), A10231XToOCQPrvN, Boolean.valueOf(n10232XToOCQGE), A10232XToOCQGE, Boolean.valueOf(n10233XToOCQCli), A10233XToOCQCli, Boolean.valueOf(n10234XToOCQCliT), A10234XToOCQCliT, Boolean.valueOf(n10235XToOCQCliN), A10235XToOCQCliN});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCQ");
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
                        resetCaption17E0( ) ;
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
            load17E1384( ) ;
         }
         endLevel17E1384( ) ;
      }
      closeExtendedTableCursors17E1384( ) ;
   }

   public void update17E1384( )
   {
      beforeValidate17E1384( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17E1384( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17E1384( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17E1384( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17E1384( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017E9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n10220XToOCQTpo), A10220XToOCQTpo, Boolean.valueOf(n10221XToOCQNat), A10221XToOCQNat, Boolean.valueOf(n10222XToOCQCmp), A10222XToOCQCmp, Boolean.valueOf(n10223XToOCQFch), A10223XToOCQFch, Boolean.valueOf(n10224XToOCQItm), A10224XToOCQItm, Boolean.valueOf(n10225XToOCQPrd), A10225XToOCQPrd, Boolean.valueOf(n10226XToOCQDsc), A10226XToOCQDsc, Boolean.valueOf(n10227XToOCQCnt), A10227XToOCQCnt, Boolean.valueOf(n10228XToOCQFchP), A10228XToOCQFchP, Boolean.valueOf(n10229XToOCQPrv), A10229XToOCQPrv, Boolean.valueOf(n10230XToOCQTda), A10230XToOCQTda, Boolean.valueOf(n10231XToOCQPrvN), A10231XToOCQPrvN, Boolean.valueOf(n10232XToOCQGE), A10232XToOCQGE, Boolean.valueOf(n10233XToOCQCli), A10233XToOCQCli, Boolean.valueOf(n10234XToOCQCliT), A10234XToOCQCliT, Boolean.valueOf(n10235XToOCQCliN), A10235XToOCQCliN, Long.valueOf(A10219XToOCQId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCQ");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXToOCQ"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17E1384( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption17E0( ) ;
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
         endLevel17E1384( ) ;
      }
      closeExtendedTableCursors17E1384( ) ;
   }

   public void deferredUpdate17E1384( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17E1384( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17E1384( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17E1384( ) ;
         afterConfirm17E1384( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17E1384( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017E10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A10219XToOCQId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXToOCQ");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1384 == 0 )
                     {
                        initAll17E1384( ) ;
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
                     resetCaption17E0( ) ;
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
      sMode1384 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17E1384( ) ;
      Gx_mode = sMode1384 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17E1384( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17E1384( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17E1384( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txtoocq");
         if ( AnyError == 0 )
         {
            confirmValues17E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txtoocq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17E1384( )
   {
      /* Scan By routine */
      /* Using cursor T017E11 */
      pr_default.execute(9);
      RcdFound1384 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1384 = (short)(1) ;
         A10219XToOCQId = T017E11_A10219XToOCQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17E1384( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1384 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1384 = (short)(1) ;
         A10219XToOCQId = T017E11_A10219XToOCQId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
      }
   }

   public void scanEnd17E1384( )
   {
      pr_default.close(9);
   }

   public void afterConfirm17E1384( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17E1384( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17E1384( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17E1384( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17E1384( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17E1384( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17E1384( )
   {
      edtXToOCQId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQId_Enabled), 5, 0), true);
      cmbXToOCQTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCQTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbXToOCQTpo.getEnabled(), 5, 0), true);
      edtXToOCQNat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQNat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQNat_Enabled), 5, 0), true);
      edtXToOCQCmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQCmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQCmp_Enabled), 5, 0), true);
      edtXToOCQFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQFch_Enabled), 5, 0), true);
      edtXToOCQItm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQItm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQItm_Enabled), 5, 0), true);
      edtXToOCQPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQPrd_Enabled), 5, 0), true);
      edtXToOCQDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQDsc_Enabled), 5, 0), true);
      edtXToOCQCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQCnt_Enabled), 5, 0), true);
      edtXToOCQFchP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQFchP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQFchP_Enabled), 5, 0), true);
      edtXToOCQPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQPrv_Enabled), 5, 0), true);
      edtXToOCQTda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQTda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQTda_Enabled), 5, 0), true);
      edtXToOCQPrvN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQPrvN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQPrvN_Enabled), 5, 0), true);
      edtXToOCQGE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQGE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQGE_Enabled), 5, 0), true);
      edtXToOCQCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQCli_Enabled), 5, 0), true);
      edtXToOCQCliT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQCliT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQCliT_Enabled), 5, 0), true);
      edtXToOCQCliN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXToOCQCliN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXToOCQCliN_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes17E1384( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues17E0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txtoocq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10219XToOCQId", GXutil.ltrim( localUtil.ntoc( Z10219XToOCQId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10220XToOCQTpo", GXutil.rtrim( Z10220XToOCQTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10221XToOCQNat", GXutil.rtrim( Z10221XToOCQNat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10222XToOCQCmp", GXutil.rtrim( Z10222XToOCQCmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10223XToOCQFch", GXutil.rtrim( Z10223XToOCQFch));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10224XToOCQItm", GXutil.rtrim( Z10224XToOCQItm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10225XToOCQPrd", GXutil.rtrim( Z10225XToOCQPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10226XToOCQDsc", GXutil.rtrim( Z10226XToOCQDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10227XToOCQCnt", GXutil.ltrim( localUtil.ntoc( Z10227XToOCQCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10228XToOCQFchP", GXutil.rtrim( Z10228XToOCQFchP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10229XToOCQPrv", GXutil.rtrim( Z10229XToOCQPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10230XToOCQTda", GXutil.rtrim( Z10230XToOCQTda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10231XToOCQPrvN", GXutil.rtrim( Z10231XToOCQPrvN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10232XToOCQGE", GXutil.rtrim( Z10232XToOCQGE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10233XToOCQCli", GXutil.rtrim( Z10233XToOCQCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10234XToOCQCliT", GXutil.rtrim( Z10234XToOCQCliT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10235XToOCQCliN", GXutil.rtrim( Z10235XToOCQCliN));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV14Pgmname));
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
      return formatLink("app.txtoocq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TXToOCQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ord Compra Totvs Cola de Mensa", "") ;
   }

   public void initializeNonKey17E1384( )
   {
      A10220XToOCQTpo = "" ;
      n10220XToOCQTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
      A10221XToOCQNat = "" ;
      n10221XToOCQNat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10221XToOCQNat", A10221XToOCQNat);
      A10222XToOCQCmp = "" ;
      n10222XToOCQCmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10222XToOCQCmp", A10222XToOCQCmp);
      A10223XToOCQFch = "" ;
      n10223XToOCQFch = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10223XToOCQFch", A10223XToOCQFch);
      A10224XToOCQItm = "" ;
      n10224XToOCQItm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10224XToOCQItm", A10224XToOCQItm);
      A10225XToOCQPrd = "" ;
      n10225XToOCQPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10225XToOCQPrd", A10225XToOCQPrd);
      A10226XToOCQDsc = "" ;
      n10226XToOCQDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10226XToOCQDsc", A10226XToOCQDsc);
      A10227XToOCQCnt = DecimalUtil.ZERO ;
      n10227XToOCQCnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrimstr( A10227XToOCQCnt, 12, 3));
      A10228XToOCQFchP = "" ;
      n10228XToOCQFchP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10228XToOCQFchP", A10228XToOCQFchP);
      A10229XToOCQPrv = "" ;
      n10229XToOCQPrv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10229XToOCQPrv", A10229XToOCQPrv);
      A10230XToOCQTda = "" ;
      n10230XToOCQTda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10230XToOCQTda", A10230XToOCQTda);
      A10231XToOCQPrvN = "" ;
      n10231XToOCQPrvN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10231XToOCQPrvN", A10231XToOCQPrvN);
      A10232XToOCQGE = "" ;
      n10232XToOCQGE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10232XToOCQGE", A10232XToOCQGE);
      A10233XToOCQCli = "" ;
      n10233XToOCQCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10233XToOCQCli", A10233XToOCQCli);
      A10234XToOCQCliT = "" ;
      n10234XToOCQCliT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10234XToOCQCliT", A10234XToOCQCliT);
      A10235XToOCQCliN = "" ;
      n10235XToOCQCliN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10235XToOCQCliN", A10235XToOCQCliN);
      Z10220XToOCQTpo = "" ;
      Z10221XToOCQNat = "" ;
      Z10222XToOCQCmp = "" ;
      Z10223XToOCQFch = "" ;
      Z10224XToOCQItm = "" ;
      Z10225XToOCQPrd = "" ;
      Z10226XToOCQDsc = "" ;
      Z10227XToOCQCnt = DecimalUtil.ZERO ;
      Z10228XToOCQFchP = "" ;
      Z10229XToOCQPrv = "" ;
      Z10230XToOCQTda = "" ;
      Z10231XToOCQPrvN = "" ;
      Z10232XToOCQGE = "" ;
      Z10233XToOCQCli = "" ;
      Z10234XToOCQCliT = "" ;
      Z10235XToOCQCliN = "" ;
   }

   public void initAll17E1384( )
   {
      A10219XToOCQId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10219XToOCQId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10219XToOCQId), 10, 0));
      initializeNonKey17E1384( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101629293", true, true);
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
      httpContext.AddJavascriptSource("txtoocq.js", "?20266101629293", false, true);
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
      edtXToOCQId_Internalname = "XTOOCQID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      cmbXToOCQTpo.setInternalname( "XTOOCQTPO" );
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXToOCQNat_Internalname = "XTOOCQNAT" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXToOCQCmp_Internalname = "XTOOCQCMP" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXToOCQFch_Internalname = "XTOOCQFCH" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXToOCQItm_Internalname = "XTOOCQITM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXToOCQPrd_Internalname = "XTOOCQPRD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXToOCQDsc_Internalname = "XTOOCQDSC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXToOCQCnt_Internalname = "XTOOCQCNT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXToOCQFchP_Internalname = "XTOOCQFCHP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXToOCQPrv_Internalname = "XTOOCQPRV" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXToOCQTda_Internalname = "XTOOCQTDA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXToOCQPrvN_Internalname = "XTOOCQPRVN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXToOCQGE_Internalname = "XTOOCQGE" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXToOCQCli_Internalname = "XTOOCQCLI" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXToOCQCliT_Internalname = "XTOOCQCLIT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtXToOCQCliN_Internalname = "XTOOCQCLIN" ;
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
      Form.setCaption( httpContext.getMessage( "Ord Compra Totvs Cola de Mensa", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXToOCQCliN_Jsonclick = "" ;
      edtXToOCQCliN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQCliN_Enabled = 1 ;
      edtXToOCQCliT_Jsonclick = "" ;
      edtXToOCQCliT_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQCliT_Enabled = 1 ;
      edtXToOCQCli_Jsonclick = "" ;
      edtXToOCQCli_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQCli_Enabled = 1 ;
      edtXToOCQGE_Jsonclick = "" ;
      edtXToOCQGE_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQGE_Enabled = 1 ;
      edtXToOCQPrvN_Jsonclick = "" ;
      edtXToOCQPrvN_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQPrvN_Enabled = 1 ;
      edtXToOCQTda_Jsonclick = "" ;
      edtXToOCQTda_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQTda_Enabled = 1 ;
      edtXToOCQPrv_Jsonclick = "" ;
      edtXToOCQPrv_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQPrv_Enabled = 1 ;
      edtXToOCQFchP_Jsonclick = "" ;
      edtXToOCQFchP_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQFchP_Enabled = 1 ;
      edtXToOCQCnt_Jsonclick = "" ;
      edtXToOCQCnt_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQCnt_Enabled = 1 ;
      edtXToOCQDsc_Jsonclick = "" ;
      edtXToOCQDsc_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQDsc_Enabled = 1 ;
      edtXToOCQPrd_Jsonclick = "" ;
      edtXToOCQPrd_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQPrd_Enabled = 1 ;
      edtXToOCQItm_Jsonclick = "" ;
      edtXToOCQItm_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQItm_Enabled = 1 ;
      edtXToOCQFch_Jsonclick = "" ;
      edtXToOCQFch_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQFch_Enabled = 1 ;
      edtXToOCQCmp_Jsonclick = "" ;
      edtXToOCQCmp_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQCmp_Enabled = 1 ;
      edtXToOCQNat_Jsonclick = "" ;
      edtXToOCQNat_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQNat_Enabled = 1 ;
      cmbXToOCQTpo.setJsonclick( "" );
      cmbXToOCQTpo.setEnabled( 1 );
      cmbXToOCQTpo.setIBackground( (int)(0xFFFFFF) );
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXToOCQId_Jsonclick = "" ;
      edtXToOCQId_Backcolor = (int)(0xFFFFFF) ;
      edtXToOCQId_Enabled = 1 ;
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
      cmbXToOCQTpo.setName( "XTOOCQTPO" );
      cmbXToOCQTpo.setWebtags( "" );
      cmbXToOCQTpo.addItem("A", httpContext.getMessage( "Alta", ""), (short)(0));
      cmbXToOCQTpo.addItem("M", httpContext.getMessage( "Modificacion", ""), (short)(0));
      cmbXToOCQTpo.addItem("B", httpContext.getMessage( "Baja", ""), (short)(0));
      if ( cmbXToOCQTpo.getItemCount() > 0 )
      {
         A10220XToOCQTpo = cmbXToOCQTpo.getValidValue(A10220XToOCQTpo) ;
         n10220XToOCQTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", A10220XToOCQTpo);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = cmbXToOCQTpo.getInternalname() ;
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

   public void valid_Xtoocqid( )
   {
      n10220XToOCQTpo = false ;
      A10220XToOCQTpo = cmbXToOCQTpo.getValue() ;
      n10220XToOCQTpo = false ;
      cmbXToOCQTpo.setValue( A10220XToOCQTpo );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbXToOCQTpo.getItemCount() > 0 )
      {
         A10220XToOCQTpo = cmbXToOCQTpo.getValidValue(A10220XToOCQTpo) ;
         n10220XToOCQTpo = false ;
         cmbXToOCQTpo.setValue( A10220XToOCQTpo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbXToOCQTpo.setValue( GXutil.rtrim( A10220XToOCQTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10220XToOCQTpo", GXutil.rtrim( A10220XToOCQTpo));
      cmbXToOCQTpo.setValue( GXutil.rtrim( A10220XToOCQTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbXToOCQTpo.getInternalname(), "Values", cmbXToOCQTpo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10221XToOCQNat", GXutil.rtrim( A10221XToOCQNat));
      httpContext.ajax_rsp_assign_attri("", false, "A10222XToOCQCmp", GXutil.rtrim( A10222XToOCQCmp));
      httpContext.ajax_rsp_assign_attri("", false, "A10223XToOCQFch", GXutil.rtrim( A10223XToOCQFch));
      httpContext.ajax_rsp_assign_attri("", false, "A10224XToOCQItm", GXutil.rtrim( A10224XToOCQItm));
      httpContext.ajax_rsp_assign_attri("", false, "A10225XToOCQPrd", GXutil.rtrim( A10225XToOCQPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A10226XToOCQDsc", GXutil.rtrim( A10226XToOCQDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10227XToOCQCnt", GXutil.ltrim( localUtil.ntoc( A10227XToOCQCnt, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10228XToOCQFchP", GXutil.rtrim( A10228XToOCQFchP));
      httpContext.ajax_rsp_assign_attri("", false, "A10229XToOCQPrv", GXutil.rtrim( A10229XToOCQPrv));
      httpContext.ajax_rsp_assign_attri("", false, "A10230XToOCQTda", GXutil.rtrim( A10230XToOCQTda));
      httpContext.ajax_rsp_assign_attri("", false, "A10231XToOCQPrvN", GXutil.rtrim( A10231XToOCQPrvN));
      httpContext.ajax_rsp_assign_attri("", false, "A10232XToOCQGE", GXutil.rtrim( A10232XToOCQGE));
      httpContext.ajax_rsp_assign_attri("", false, "A10233XToOCQCli", GXutil.rtrim( A10233XToOCQCli));
      httpContext.ajax_rsp_assign_attri("", false, "A10234XToOCQCliT", GXutil.rtrim( A10234XToOCQCliT));
      httpContext.ajax_rsp_assign_attri("", false, "A10235XToOCQCliN", GXutil.rtrim( A10235XToOCQCliN));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10219XToOCQId", GXutil.ltrim( localUtil.ntoc( Z10219XToOCQId, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10220XToOCQTpo", GXutil.rtrim( Z10220XToOCQTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10221XToOCQNat", GXutil.rtrim( Z10221XToOCQNat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10222XToOCQCmp", GXutil.rtrim( Z10222XToOCQCmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10223XToOCQFch", GXutil.rtrim( Z10223XToOCQFch));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10224XToOCQItm", GXutil.rtrim( Z10224XToOCQItm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10225XToOCQPrd", GXutil.rtrim( Z10225XToOCQPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10226XToOCQDsc", GXutil.rtrim( Z10226XToOCQDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10227XToOCQCnt", GXutil.ltrim( localUtil.ntoc( Z10227XToOCQCnt, (byte)(12), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10228XToOCQFchP", GXutil.rtrim( Z10228XToOCQFchP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10229XToOCQPrv", GXutil.rtrim( Z10229XToOCQPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10230XToOCQTda", GXutil.rtrim( Z10230XToOCQTda));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10231XToOCQPrvN", GXutil.rtrim( Z10231XToOCQPrvN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10232XToOCQGE", GXutil.rtrim( Z10232XToOCQGE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10233XToOCQCli", GXutil.rtrim( Z10233XToOCQCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10234XToOCQCliT", GXutil.rtrim( Z10234XToOCQCliT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10235XToOCQCliN", GXutil.rtrim( Z10235XToOCQCliN));
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
      setEventMetadata("VALID_XTOOCQID","{handler:'valid_Xtoocqid',iparms:[{av:'cmbXToOCQTpo'},{av:'A10220XToOCQTpo',fld:'XTOOCQTPO',pic:''},{av:'A10219XToOCQId',fld:'XTOOCQID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XTOOCQID",",oparms:[{av:'cmbXToOCQTpo'},{av:'A10220XToOCQTpo',fld:'XTOOCQTPO',pic:''},{av:'A10221XToOCQNat',fld:'XTOOCQNAT',pic:''},{av:'A10222XToOCQCmp',fld:'XTOOCQCMP',pic:''},{av:'A10223XToOCQFch',fld:'XTOOCQFCH',pic:''},{av:'A10224XToOCQItm',fld:'XTOOCQITM',pic:''},{av:'A10225XToOCQPrd',fld:'XTOOCQPRD',pic:''},{av:'A10226XToOCQDsc',fld:'XTOOCQDSC',pic:''},{av:'A10227XToOCQCnt',fld:'XTOOCQCNT',pic:'ZZZZZZZ9.999'},{av:'A10228XToOCQFchP',fld:'XTOOCQFCHP',pic:''},{av:'A10229XToOCQPrv',fld:'XTOOCQPRV',pic:''},{av:'A10230XToOCQTda',fld:'XTOOCQTDA',pic:''},{av:'A10231XToOCQPrvN',fld:'XTOOCQPRVN',pic:''},{av:'A10232XToOCQGE',fld:'XTOOCQGE',pic:''},{av:'A10233XToOCQCli',fld:'XTOOCQCLI',pic:''},{av:'A10234XToOCQCliT',fld:'XTOOCQCLIT',pic:''},{av:'A10235XToOCQCliN',fld:'XTOOCQCLIN',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z10219XToOCQId'},{av:'Z10220XToOCQTpo'},{av:'Z10221XToOCQNat'},{av:'Z10222XToOCQCmp'},{av:'Z10223XToOCQFch'},{av:'Z10224XToOCQItm'},{av:'Z10225XToOCQPrd'},{av:'Z10226XToOCQDsc'},{av:'Z10227XToOCQCnt'},{av:'Z10228XToOCQFchP'},{av:'Z10229XToOCQPrv'},{av:'Z10230XToOCQTda'},{av:'Z10231XToOCQPrvN'},{av:'Z10232XToOCQGE'},{av:'Z10233XToOCQCli'},{av:'Z10234XToOCQCliT'},{av:'Z10235XToOCQCliN'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XTOOCQTPO","{handler:'valid_Xtoocqtpo',iparms:[]");
      setEventMetadata("VALID_XTOOCQTPO",",oparms:[]}");
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
      Z10220XToOCQTpo = "" ;
      Z10221XToOCQNat = "" ;
      Z10222XToOCQCmp = "" ;
      Z10223XToOCQFch = "" ;
      Z10224XToOCQItm = "" ;
      Z10225XToOCQPrd = "" ;
      Z10226XToOCQDsc = "" ;
      Z10227XToOCQCnt = DecimalUtil.ZERO ;
      Z10228XToOCQFchP = "" ;
      Z10229XToOCQPrv = "" ;
      Z10230XToOCQTda = "" ;
      Z10231XToOCQPrvN = "" ;
      Z10232XToOCQGE = "" ;
      Z10233XToOCQCli = "" ;
      Z10234XToOCQCliT = "" ;
      Z10235XToOCQCliN = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10220XToOCQTpo = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      A10221XToOCQNat = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10222XToOCQCmp = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10223XToOCQFch = "" ;
      lblTextblock6_Jsonclick = "" ;
      A10224XToOCQItm = "" ;
      lblTextblock7_Jsonclick = "" ;
      A10225XToOCQPrd = "" ;
      lblTextblock8_Jsonclick = "" ;
      A10226XToOCQDsc = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10227XToOCQCnt = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A10228XToOCQFchP = "" ;
      lblTextblock11_Jsonclick = "" ;
      A10229XToOCQPrv = "" ;
      lblTextblock12_Jsonclick = "" ;
      A10230XToOCQTda = "" ;
      lblTextblock13_Jsonclick = "" ;
      A10231XToOCQPrvN = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10232XToOCQGE = "" ;
      lblTextblock15_Jsonclick = "" ;
      A10233XToOCQCli = "" ;
      lblTextblock16_Jsonclick = "" ;
      A10234XToOCQCliT = "" ;
      lblTextblock17_Jsonclick = "" ;
      A10235XToOCQCliN = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV14Pgmname = "" ;
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
      AV13EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T017E4_A10219XToOCQId = new long[1] ;
      T017E4_A10220XToOCQTpo = new String[] {""} ;
      T017E4_n10220XToOCQTpo = new boolean[] {false} ;
      T017E4_A10221XToOCQNat = new String[] {""} ;
      T017E4_n10221XToOCQNat = new boolean[] {false} ;
      T017E4_A10222XToOCQCmp = new String[] {""} ;
      T017E4_n10222XToOCQCmp = new boolean[] {false} ;
      T017E4_A10223XToOCQFch = new String[] {""} ;
      T017E4_n10223XToOCQFch = new boolean[] {false} ;
      T017E4_A10224XToOCQItm = new String[] {""} ;
      T017E4_n10224XToOCQItm = new boolean[] {false} ;
      T017E4_A10225XToOCQPrd = new String[] {""} ;
      T017E4_n10225XToOCQPrd = new boolean[] {false} ;
      T017E4_A10226XToOCQDsc = new String[] {""} ;
      T017E4_n10226XToOCQDsc = new boolean[] {false} ;
      T017E4_A10227XToOCQCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017E4_n10227XToOCQCnt = new boolean[] {false} ;
      T017E4_A10228XToOCQFchP = new String[] {""} ;
      T017E4_n10228XToOCQFchP = new boolean[] {false} ;
      T017E4_A10229XToOCQPrv = new String[] {""} ;
      T017E4_n10229XToOCQPrv = new boolean[] {false} ;
      T017E4_A10230XToOCQTda = new String[] {""} ;
      T017E4_n10230XToOCQTda = new boolean[] {false} ;
      T017E4_A10231XToOCQPrvN = new String[] {""} ;
      T017E4_n10231XToOCQPrvN = new boolean[] {false} ;
      T017E4_A10232XToOCQGE = new String[] {""} ;
      T017E4_n10232XToOCQGE = new boolean[] {false} ;
      T017E4_A10233XToOCQCli = new String[] {""} ;
      T017E4_n10233XToOCQCli = new boolean[] {false} ;
      T017E4_A10234XToOCQCliT = new String[] {""} ;
      T017E4_n10234XToOCQCliT = new boolean[] {false} ;
      T017E4_A10235XToOCQCliN = new String[] {""} ;
      T017E4_n10235XToOCQCliN = new boolean[] {false} ;
      T017E5_A10219XToOCQId = new long[1] ;
      T017E3_A10219XToOCQId = new long[1] ;
      T017E3_A10220XToOCQTpo = new String[] {""} ;
      T017E3_n10220XToOCQTpo = new boolean[] {false} ;
      T017E3_A10221XToOCQNat = new String[] {""} ;
      T017E3_n10221XToOCQNat = new boolean[] {false} ;
      T017E3_A10222XToOCQCmp = new String[] {""} ;
      T017E3_n10222XToOCQCmp = new boolean[] {false} ;
      T017E3_A10223XToOCQFch = new String[] {""} ;
      T017E3_n10223XToOCQFch = new boolean[] {false} ;
      T017E3_A10224XToOCQItm = new String[] {""} ;
      T017E3_n10224XToOCQItm = new boolean[] {false} ;
      T017E3_A10225XToOCQPrd = new String[] {""} ;
      T017E3_n10225XToOCQPrd = new boolean[] {false} ;
      T017E3_A10226XToOCQDsc = new String[] {""} ;
      T017E3_n10226XToOCQDsc = new boolean[] {false} ;
      T017E3_A10227XToOCQCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017E3_n10227XToOCQCnt = new boolean[] {false} ;
      T017E3_A10228XToOCQFchP = new String[] {""} ;
      T017E3_n10228XToOCQFchP = new boolean[] {false} ;
      T017E3_A10229XToOCQPrv = new String[] {""} ;
      T017E3_n10229XToOCQPrv = new boolean[] {false} ;
      T017E3_A10230XToOCQTda = new String[] {""} ;
      T017E3_n10230XToOCQTda = new boolean[] {false} ;
      T017E3_A10231XToOCQPrvN = new String[] {""} ;
      T017E3_n10231XToOCQPrvN = new boolean[] {false} ;
      T017E3_A10232XToOCQGE = new String[] {""} ;
      T017E3_n10232XToOCQGE = new boolean[] {false} ;
      T017E3_A10233XToOCQCli = new String[] {""} ;
      T017E3_n10233XToOCQCli = new boolean[] {false} ;
      T017E3_A10234XToOCQCliT = new String[] {""} ;
      T017E3_n10234XToOCQCliT = new boolean[] {false} ;
      T017E3_A10235XToOCQCliN = new String[] {""} ;
      T017E3_n10235XToOCQCliN = new boolean[] {false} ;
      sMode1384 = "" ;
      T017E6_A10219XToOCQId = new long[1] ;
      T017E7_A10219XToOCQId = new long[1] ;
      T017E2_A10219XToOCQId = new long[1] ;
      T017E2_A10220XToOCQTpo = new String[] {""} ;
      T017E2_n10220XToOCQTpo = new boolean[] {false} ;
      T017E2_A10221XToOCQNat = new String[] {""} ;
      T017E2_n10221XToOCQNat = new boolean[] {false} ;
      T017E2_A10222XToOCQCmp = new String[] {""} ;
      T017E2_n10222XToOCQCmp = new boolean[] {false} ;
      T017E2_A10223XToOCQFch = new String[] {""} ;
      T017E2_n10223XToOCQFch = new boolean[] {false} ;
      T017E2_A10224XToOCQItm = new String[] {""} ;
      T017E2_n10224XToOCQItm = new boolean[] {false} ;
      T017E2_A10225XToOCQPrd = new String[] {""} ;
      T017E2_n10225XToOCQPrd = new boolean[] {false} ;
      T017E2_A10226XToOCQDsc = new String[] {""} ;
      T017E2_n10226XToOCQDsc = new boolean[] {false} ;
      T017E2_A10227XToOCQCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017E2_n10227XToOCQCnt = new boolean[] {false} ;
      T017E2_A10228XToOCQFchP = new String[] {""} ;
      T017E2_n10228XToOCQFchP = new boolean[] {false} ;
      T017E2_A10229XToOCQPrv = new String[] {""} ;
      T017E2_n10229XToOCQPrv = new boolean[] {false} ;
      T017E2_A10230XToOCQTda = new String[] {""} ;
      T017E2_n10230XToOCQTda = new boolean[] {false} ;
      T017E2_A10231XToOCQPrvN = new String[] {""} ;
      T017E2_n10231XToOCQPrvN = new boolean[] {false} ;
      T017E2_A10232XToOCQGE = new String[] {""} ;
      T017E2_n10232XToOCQGE = new boolean[] {false} ;
      T017E2_A10233XToOCQCli = new String[] {""} ;
      T017E2_n10233XToOCQCli = new boolean[] {false} ;
      T017E2_A10234XToOCQCliT = new String[] {""} ;
      T017E2_n10234XToOCQCliT = new boolean[] {false} ;
      T017E2_A10235XToOCQCliN = new String[] {""} ;
      T017E2_n10235XToOCQCliN = new boolean[] {false} ;
      T017E11_A10219XToOCQId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ10220XToOCQTpo = "" ;
      ZZ10221XToOCQNat = "" ;
      ZZ10222XToOCQCmp = "" ;
      ZZ10223XToOCQFch = "" ;
      ZZ10224XToOCQItm = "" ;
      ZZ10225XToOCQPrd = "" ;
      ZZ10226XToOCQDsc = "" ;
      ZZ10227XToOCQCnt = DecimalUtil.ZERO ;
      ZZ10228XToOCQFchP = "" ;
      ZZ10229XToOCQPrv = "" ;
      ZZ10230XToOCQTda = "" ;
      ZZ10231XToOCQPrvN = "" ;
      ZZ10232XToOCQGE = "" ;
      ZZ10233XToOCQCli = "" ;
      ZZ10234XToOCQCliT = "" ;
      ZZ10235XToOCQCliN = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txtoocq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txtoocq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txtoocq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txtoocq__default(),
         new Object[] {
             new Object[] {
            T017E2_A10219XToOCQId, T017E2_A10220XToOCQTpo, T017E2_n10220XToOCQTpo, T017E2_A10221XToOCQNat, T017E2_n10221XToOCQNat, T017E2_A10222XToOCQCmp, T017E2_n10222XToOCQCmp, T017E2_A10223XToOCQFch, T017E2_n10223XToOCQFch, T017E2_A10224XToOCQItm,
            T017E2_n10224XToOCQItm, T017E2_A10225XToOCQPrd, T017E2_n10225XToOCQPrd, T017E2_A10226XToOCQDsc, T017E2_n10226XToOCQDsc, T017E2_A10227XToOCQCnt, T017E2_n10227XToOCQCnt, T017E2_A10228XToOCQFchP, T017E2_n10228XToOCQFchP, T017E2_A10229XToOCQPrv,
            T017E2_n10229XToOCQPrv, T017E2_A10230XToOCQTda, T017E2_n10230XToOCQTda, T017E2_A10231XToOCQPrvN, T017E2_n10231XToOCQPrvN, T017E2_A10232XToOCQGE, T017E2_n10232XToOCQGE, T017E2_A10233XToOCQCli, T017E2_n10233XToOCQCli, T017E2_A10234XToOCQCliT,
            T017E2_n10234XToOCQCliT, T017E2_A10235XToOCQCliN, T017E2_n10235XToOCQCliN
            }
            , new Object[] {
            T017E3_A10219XToOCQId, T017E3_A10220XToOCQTpo, T017E3_n10220XToOCQTpo, T017E3_A10221XToOCQNat, T017E3_n10221XToOCQNat, T017E3_A10222XToOCQCmp, T017E3_n10222XToOCQCmp, T017E3_A10223XToOCQFch, T017E3_n10223XToOCQFch, T017E3_A10224XToOCQItm,
            T017E3_n10224XToOCQItm, T017E3_A10225XToOCQPrd, T017E3_n10225XToOCQPrd, T017E3_A10226XToOCQDsc, T017E3_n10226XToOCQDsc, T017E3_A10227XToOCQCnt, T017E3_n10227XToOCQCnt, T017E3_A10228XToOCQFchP, T017E3_n10228XToOCQFchP, T017E3_A10229XToOCQPrv,
            T017E3_n10229XToOCQPrv, T017E3_A10230XToOCQTda, T017E3_n10230XToOCQTda, T017E3_A10231XToOCQPrvN, T017E3_n10231XToOCQPrvN, T017E3_A10232XToOCQGE, T017E3_n10232XToOCQGE, T017E3_A10233XToOCQCli, T017E3_n10233XToOCQCli, T017E3_A10234XToOCQCliT,
            T017E3_n10234XToOCQCliT, T017E3_A10235XToOCQCliN, T017E3_n10235XToOCQCliN
            }
            , new Object[] {
            T017E4_A10219XToOCQId, T017E4_A10220XToOCQTpo, T017E4_n10220XToOCQTpo, T017E4_A10221XToOCQNat, T017E4_n10221XToOCQNat, T017E4_A10222XToOCQCmp, T017E4_n10222XToOCQCmp, T017E4_A10223XToOCQFch, T017E4_n10223XToOCQFch, T017E4_A10224XToOCQItm,
            T017E4_n10224XToOCQItm, T017E4_A10225XToOCQPrd, T017E4_n10225XToOCQPrd, T017E4_A10226XToOCQDsc, T017E4_n10226XToOCQDsc, T017E4_A10227XToOCQCnt, T017E4_n10227XToOCQCnt, T017E4_A10228XToOCQFchP, T017E4_n10228XToOCQFchP, T017E4_A10229XToOCQPrv,
            T017E4_n10229XToOCQPrv, T017E4_A10230XToOCQTda, T017E4_n10230XToOCQTda, T017E4_A10231XToOCQPrvN, T017E4_n10231XToOCQPrvN, T017E4_A10232XToOCQGE, T017E4_n10232XToOCQGE, T017E4_A10233XToOCQCli, T017E4_n10233XToOCQCli, T017E4_A10234XToOCQCliT,
            T017E4_n10234XToOCQCliT, T017E4_A10235XToOCQCliN, T017E4_n10235XToOCQCliN
            }
            , new Object[] {
            T017E5_A10219XToOCQId
            }
            , new Object[] {
            T017E6_A10219XToOCQId
            }
            , new Object[] {
            T017E7_A10219XToOCQId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017E11_A10219XToOCQId
            }
         }
      );
      AV14Pgmname = "TXToOCQ" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1384 ;
   private short nIsDirty_1384 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtXToOCQId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXToOCQNat_Enabled ;
   private int edtXToOCQCmp_Enabled ;
   private int edtXToOCQFch_Enabled ;
   private int edtXToOCQItm_Enabled ;
   private int edtXToOCQPrd_Enabled ;
   private int edtXToOCQDsc_Enabled ;
   private int edtXToOCQCnt_Enabled ;
   private int edtXToOCQFchP_Enabled ;
   private int edtXToOCQPrv_Enabled ;
   private int edtXToOCQTda_Enabled ;
   private int edtXToOCQPrvN_Enabled ;
   private int edtXToOCQGE_Enabled ;
   private int edtXToOCQCli_Enabled ;
   private int edtXToOCQCliT_Enabled ;
   private int edtXToOCQCliN_Enabled ;
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
   private int edtXToOCQCliN_Backcolor ;
   private int edtXToOCQCliT_Backcolor ;
   private int edtXToOCQCli_Backcolor ;
   private int edtXToOCQGE_Backcolor ;
   private int edtXToOCQPrvN_Backcolor ;
   private int edtXToOCQTda_Backcolor ;
   private int edtXToOCQPrv_Backcolor ;
   private int edtXToOCQFchP_Backcolor ;
   private int edtXToOCQCnt_Backcolor ;
   private int edtXToOCQDsc_Backcolor ;
   private int edtXToOCQPrd_Backcolor ;
   private int edtXToOCQItm_Backcolor ;
   private int edtXToOCQFch_Backcolor ;
   private int edtXToOCQCmp_Backcolor ;
   private int edtXToOCQNat_Backcolor ;
   private int edtXToOCQId_Backcolor ;
   private long Z10219XToOCQId ;
   private long A10219XToOCQId ;
   private long ZZ10219XToOCQId ;
   private java.math.BigDecimal Z10227XToOCQCnt ;
   private java.math.BigDecimal A10227XToOCQCnt ;
   private java.math.BigDecimal ZZ10227XToOCQCnt ;
   private String sPrefix ;
   private String Z10220XToOCQTpo ;
   private String Z10221XToOCQNat ;
   private String Z10222XToOCQCmp ;
   private String Z10223XToOCQFch ;
   private String Z10224XToOCQItm ;
   private String Z10225XToOCQPrd ;
   private String Z10226XToOCQDsc ;
   private String Z10228XToOCQFchP ;
   private String Z10229XToOCQPrv ;
   private String Z10230XToOCQTda ;
   private String Z10231XToOCQPrvN ;
   private String Z10232XToOCQGE ;
   private String Z10233XToOCQCli ;
   private String Z10234XToOCQCliT ;
   private String Z10235XToOCQCliN ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXToOCQId_Internalname ;
   private String A10220XToOCQTpo ;
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
   private String edtXToOCQId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXToOCQNat_Internalname ;
   private String A10221XToOCQNat ;
   private String edtXToOCQNat_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXToOCQCmp_Internalname ;
   private String A10222XToOCQCmp ;
   private String edtXToOCQCmp_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXToOCQFch_Internalname ;
   private String A10223XToOCQFch ;
   private String edtXToOCQFch_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXToOCQItm_Internalname ;
   private String A10224XToOCQItm ;
   private String edtXToOCQItm_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXToOCQPrd_Internalname ;
   private String A10225XToOCQPrd ;
   private String edtXToOCQPrd_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXToOCQDsc_Internalname ;
   private String A10226XToOCQDsc ;
   private String edtXToOCQDsc_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXToOCQCnt_Internalname ;
   private String edtXToOCQCnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXToOCQFchP_Internalname ;
   private String A10228XToOCQFchP ;
   private String edtXToOCQFchP_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXToOCQPrv_Internalname ;
   private String A10229XToOCQPrv ;
   private String edtXToOCQPrv_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXToOCQTda_Internalname ;
   private String A10230XToOCQTda ;
   private String edtXToOCQTda_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXToOCQPrvN_Internalname ;
   private String A10231XToOCQPrvN ;
   private String edtXToOCQPrvN_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXToOCQGE_Internalname ;
   private String A10232XToOCQGE ;
   private String edtXToOCQGE_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXToOCQCli_Internalname ;
   private String A10233XToOCQCli ;
   private String edtXToOCQCli_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXToOCQCliT_Internalname ;
   private String A10234XToOCQCliT ;
   private String edtXToOCQCliT_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtXToOCQCliN_Internalname ;
   private String A10235XToOCQCliN ;
   private String edtXToOCQCliN_Jsonclick ;
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
   private String AV14Pgmname ;
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
   private String AV13EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sMode1384 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ10220XToOCQTpo ;
   private String ZZ10221XToOCQNat ;
   private String ZZ10222XToOCQCmp ;
   private String ZZ10223XToOCQFch ;
   private String ZZ10224XToOCQItm ;
   private String ZZ10225XToOCQPrd ;
   private String ZZ10226XToOCQDsc ;
   private String ZZ10228XToOCQFchP ;
   private String ZZ10229XToOCQPrv ;
   private String ZZ10230XToOCQTda ;
   private String ZZ10231XToOCQPrvN ;
   private String ZZ10232XToOCQGE ;
   private String ZZ10233XToOCQCli ;
   private String ZZ10234XToOCQCliT ;
   private String ZZ10235XToOCQCliN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n10220XToOCQTpo ;
   private boolean n10221XToOCQNat ;
   private boolean n10222XToOCQCmp ;
   private boolean n10223XToOCQFch ;
   private boolean n10224XToOCQItm ;
   private boolean n10225XToOCQPrd ;
   private boolean n10226XToOCQDsc ;
   private boolean n10227XToOCQCnt ;
   private boolean n10228XToOCQFchP ;
   private boolean n10229XToOCQPrv ;
   private boolean n10230XToOCQTda ;
   private boolean n10231XToOCQPrvN ;
   private boolean n10232XToOCQGE ;
   private boolean n10233XToOCQCli ;
   private boolean n10234XToOCQCliT ;
   private boolean n10235XToOCQCliN ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private HTMLChoice cmbXToOCQTpo ;
   private IDataStoreProvider pr_default ;
   private long[] T017E4_A10219XToOCQId ;
   private String[] T017E4_A10220XToOCQTpo ;
   private boolean[] T017E4_n10220XToOCQTpo ;
   private String[] T017E4_A10221XToOCQNat ;
   private boolean[] T017E4_n10221XToOCQNat ;
   private String[] T017E4_A10222XToOCQCmp ;
   private boolean[] T017E4_n10222XToOCQCmp ;
   private String[] T017E4_A10223XToOCQFch ;
   private boolean[] T017E4_n10223XToOCQFch ;
   private String[] T017E4_A10224XToOCQItm ;
   private boolean[] T017E4_n10224XToOCQItm ;
   private String[] T017E4_A10225XToOCQPrd ;
   private boolean[] T017E4_n10225XToOCQPrd ;
   private String[] T017E4_A10226XToOCQDsc ;
   private boolean[] T017E4_n10226XToOCQDsc ;
   private java.math.BigDecimal[] T017E4_A10227XToOCQCnt ;
   private boolean[] T017E4_n10227XToOCQCnt ;
   private String[] T017E4_A10228XToOCQFchP ;
   private boolean[] T017E4_n10228XToOCQFchP ;
   private String[] T017E4_A10229XToOCQPrv ;
   private boolean[] T017E4_n10229XToOCQPrv ;
   private String[] T017E4_A10230XToOCQTda ;
   private boolean[] T017E4_n10230XToOCQTda ;
   private String[] T017E4_A10231XToOCQPrvN ;
   private boolean[] T017E4_n10231XToOCQPrvN ;
   private String[] T017E4_A10232XToOCQGE ;
   private boolean[] T017E4_n10232XToOCQGE ;
   private String[] T017E4_A10233XToOCQCli ;
   private boolean[] T017E4_n10233XToOCQCli ;
   private String[] T017E4_A10234XToOCQCliT ;
   private boolean[] T017E4_n10234XToOCQCliT ;
   private String[] T017E4_A10235XToOCQCliN ;
   private boolean[] T017E4_n10235XToOCQCliN ;
   private long[] T017E5_A10219XToOCQId ;
   private long[] T017E3_A10219XToOCQId ;
   private String[] T017E3_A10220XToOCQTpo ;
   private boolean[] T017E3_n10220XToOCQTpo ;
   private String[] T017E3_A10221XToOCQNat ;
   private boolean[] T017E3_n10221XToOCQNat ;
   private String[] T017E3_A10222XToOCQCmp ;
   private boolean[] T017E3_n10222XToOCQCmp ;
   private String[] T017E3_A10223XToOCQFch ;
   private boolean[] T017E3_n10223XToOCQFch ;
   private String[] T017E3_A10224XToOCQItm ;
   private boolean[] T017E3_n10224XToOCQItm ;
   private String[] T017E3_A10225XToOCQPrd ;
   private boolean[] T017E3_n10225XToOCQPrd ;
   private String[] T017E3_A10226XToOCQDsc ;
   private boolean[] T017E3_n10226XToOCQDsc ;
   private java.math.BigDecimal[] T017E3_A10227XToOCQCnt ;
   private boolean[] T017E3_n10227XToOCQCnt ;
   private String[] T017E3_A10228XToOCQFchP ;
   private boolean[] T017E3_n10228XToOCQFchP ;
   private String[] T017E3_A10229XToOCQPrv ;
   private boolean[] T017E3_n10229XToOCQPrv ;
   private String[] T017E3_A10230XToOCQTda ;
   private boolean[] T017E3_n10230XToOCQTda ;
   private String[] T017E3_A10231XToOCQPrvN ;
   private boolean[] T017E3_n10231XToOCQPrvN ;
   private String[] T017E3_A10232XToOCQGE ;
   private boolean[] T017E3_n10232XToOCQGE ;
   private String[] T017E3_A10233XToOCQCli ;
   private boolean[] T017E3_n10233XToOCQCli ;
   private String[] T017E3_A10234XToOCQCliT ;
   private boolean[] T017E3_n10234XToOCQCliT ;
   private String[] T017E3_A10235XToOCQCliN ;
   private boolean[] T017E3_n10235XToOCQCliN ;
   private long[] T017E6_A10219XToOCQId ;
   private long[] T017E7_A10219XToOCQId ;
   private long[] T017E2_A10219XToOCQId ;
   private String[] T017E2_A10220XToOCQTpo ;
   private boolean[] T017E2_n10220XToOCQTpo ;
   private String[] T017E2_A10221XToOCQNat ;
   private boolean[] T017E2_n10221XToOCQNat ;
   private String[] T017E2_A10222XToOCQCmp ;
   private boolean[] T017E2_n10222XToOCQCmp ;
   private String[] T017E2_A10223XToOCQFch ;
   private boolean[] T017E2_n10223XToOCQFch ;
   private String[] T017E2_A10224XToOCQItm ;
   private boolean[] T017E2_n10224XToOCQItm ;
   private String[] T017E2_A10225XToOCQPrd ;
   private boolean[] T017E2_n10225XToOCQPrd ;
   private String[] T017E2_A10226XToOCQDsc ;
   private boolean[] T017E2_n10226XToOCQDsc ;
   private java.math.BigDecimal[] T017E2_A10227XToOCQCnt ;
   private boolean[] T017E2_n10227XToOCQCnt ;
   private String[] T017E2_A10228XToOCQFchP ;
   private boolean[] T017E2_n10228XToOCQFchP ;
   private String[] T017E2_A10229XToOCQPrv ;
   private boolean[] T017E2_n10229XToOCQPrv ;
   private String[] T017E2_A10230XToOCQTda ;
   private boolean[] T017E2_n10230XToOCQTda ;
   private String[] T017E2_A10231XToOCQPrvN ;
   private boolean[] T017E2_n10231XToOCQPrvN ;
   private String[] T017E2_A10232XToOCQGE ;
   private boolean[] T017E2_n10232XToOCQGE ;
   private String[] T017E2_A10233XToOCQCli ;
   private boolean[] T017E2_n10233XToOCQCli ;
   private String[] T017E2_A10234XToOCQCliT ;
   private boolean[] T017E2_n10234XToOCQCliT ;
   private String[] T017E2_A10235XToOCQCliN ;
   private boolean[] T017E2_n10235XToOCQCliN ;
   private long[] T017E11_A10219XToOCQId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txtoocq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtoocq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtoocq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txtoocq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017E2", "SELECT XToOCQId, XToOCQTpo, XToOCQNat, XToOCQCmp, XToOCQFch, XToOCQItm, XToOCQPrd, XToOCQDsc, XToOCQCnt, XToOCQFchP, XToOCQPrv, XToOCQTda, XToOCQPrvN, XToOCQGE, XToOCQCli, XToOCQCliT, XToOCQCliN FROM TXPXToOCQ WHERE XToOCQId = ?  FOR UPDATE OF XToOCQTpo, XToOCQNat, XToOCQCmp, XToOCQFch, XToOCQItm, XToOCQPrd, XToOCQDsc, XToOCQCnt, XToOCQFchP, XToOCQPrv, XToOCQTda, XToOCQPrvN, XToOCQGE, XToOCQCli, XToOCQCliT, XToOCQCliN NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017E3", "SELECT XToOCQId, XToOCQTpo, XToOCQNat, XToOCQCmp, XToOCQFch, XToOCQItm, XToOCQPrd, XToOCQDsc, XToOCQCnt, XToOCQFchP, XToOCQPrv, XToOCQTda, XToOCQPrvN, XToOCQGE, XToOCQCli, XToOCQCliT, XToOCQCliN FROM TXPXToOCQ WHERE XToOCQId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017E4", "SELECT /*+ FIRST_ROWS(100) */ TM1.XToOCQId, TM1.XToOCQTpo, TM1.XToOCQNat, TM1.XToOCQCmp, TM1.XToOCQFch, TM1.XToOCQItm, TM1.XToOCQPrd, TM1.XToOCQDsc, TM1.XToOCQCnt, TM1.XToOCQFchP, TM1.XToOCQPrv, TM1.XToOCQTda, TM1.XToOCQPrvN, TM1.XToOCQGE, TM1.XToOCQCli, TM1.XToOCQCliT, TM1.XToOCQCliN FROM TXPXToOCQ TM1 WHERE TM1.XToOCQId = ? ORDER BY TM1.XToOCQId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017E5", "SELECT /*+ FIRST_ROWS(1) */ XToOCQId FROM TXPXToOCQ WHERE XToOCQId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017E6", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XToOCQId FROM TXPXToOCQ WHERE ( XToOCQId > ?) ORDER BY XToOCQId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017E7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ XToOCQId FROM TXPXToOCQ WHERE ( XToOCQId < ?) ORDER BY XToOCQId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017E8", "INSERT INTO TXPXToOCQ(XToOCQId, XToOCQTpo, XToOCQNat, XToOCQCmp, XToOCQFch, XToOCQItm, XToOCQPrd, XToOCQDsc, XToOCQCnt, XToOCQFchP, XToOCQPrv, XToOCQTda, XToOCQPrvN, XToOCQGE, XToOCQCli, XToOCQCliT, XToOCQCliN) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXToOCQ")
         ,new UpdateCursor("T017E9", "UPDATE TXPXToOCQ SET XToOCQTpo=?, XToOCQNat=?, XToOCQCmp=?, XToOCQFch=?, XToOCQItm=?, XToOCQPrd=?, XToOCQDsc=?, XToOCQCnt=?, XToOCQFchP=?, XToOCQPrv=?, XToOCQTda=?, XToOCQPrvN=?, XToOCQGE=?, XToOCQCli=?, XToOCQCliT=?, XToOCQCliN=?  WHERE XToOCQId = ?", GX_NOMASK, "TXPXToOCQ")
         ,new UpdateCursor("T017E10", "DELETE FROM TXPXToOCQ  WHERE XToOCQId = ?", GX_NOMASK, "TXPXToOCQ")
         ,new ForEachCursor("T017E11", "SELECT /*+ FIRST_ROWS(100) */ XToOCQId FROM TXPXToOCQ ORDER BY XToOCQId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 15);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 30);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 8);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 6);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 30);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 30);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 15);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 30);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 30);
               }
               stmt.setLong(17, ((Number) parms[32]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

