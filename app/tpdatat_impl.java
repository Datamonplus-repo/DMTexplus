package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpdatat_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"TIPARTNAME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11520TipArtId = (short)(GXutil.lval( httpContext.GetPar( "TipArtId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asatipartname1C71535( A396EmprCod, A11520TipArtId) ;
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
            A4295ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            A4296ClasDsc = httpContext.GetPar( "ClasDsc") ;
            n4296ClasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRENDA mas TIPO ARTICULO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipArtId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tpdatat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpdatat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpdatat_impl.class ));
   }

   public tpdatat_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPDATAT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Tipo Clasificacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtClasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasCod_Jsonclick, 0, "", "", "", "", "", 1, edtClasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc), GXutil.rtrim( localUtil.format( A4296ClasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasDsc_Jsonclick, 0, "", "", "", "", "", 1, edtClasDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtId_Internalname, GXutil.ltrim( localUtil.ntoc( A11520TipArtId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipArtId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11520TipArtId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11520TipArtId), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtId_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtId_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Tipo Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipArtName_Internalname, GXutil.rtrim( A11518TipArtName), GXutil.rtrim( localUtil.format( A11518TipArtName, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipArtName_Jsonclick, 0, "", "", "", "", "", 1, edtTipArtName_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Aumento o descuento %", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPDATAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTpTatPor_Internalname, GXutil.ltrim( localUtil.ntoc( A11519TpTatPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTpTatPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11519TpTatPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11519TpTatPor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpTatPor_Jsonclick, 0, "", "", "", "", "", 1, edtTpTatPor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPDATAT.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPDATAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPDATAT.htm");
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
      e111C72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z4295ClasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11520TipArtId = (short)(localUtil.ctol( httpContext.cgiGet( "Z11520TipArtId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11519TpTatPor = (short)(localUtil.ctol( httpContext.cgiGet( "Z11519TpTatPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            A4296ClasDsc = httpContext.cgiGet( edtClasDsc_Internalname) ;
            n4296ClasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPARTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipArtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11520TipArtId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
            }
            else
            {
               A11520TipArtId = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
            }
            A11518TipArtName = httpContext.cgiGet( edtTipArtName_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTpTatPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -99 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTpTatPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TPTATPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpTatPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11519TpTatPor = (short)(0) ;
               n11519TpTatPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11519TpTatPor), 3, 0));
            }
            else
            {
               A11519TpTatPor = (short)(localUtil.ctol( httpContext.cgiGet( edtTpTatPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11519TpTatPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11519TpTatPor), 3, 0));
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
               A4295ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
               A11520TipArtId = (short)(GXutil.lval( httpContext.GetPar( "TipArtId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
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
                        e111C72 ();
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
            initAll1C71535( ) ;
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
      disableAttributes1C71535( ) ;
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

   public void confirm_1C70( )
   {
      beforeValidate1C71535( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1C71535( ) ;
         }
         else
         {
            checkExtendedTable1C71535( ) ;
            if ( AnyError == 0 )
            {
               zm1C71535( 4) ;
               zm1C71535( 5) ;
            }
            closeExtendedTableCursors1C71535( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1C70( ) ;
      }
   }

   public void resetCaption1C70( )
   {
   }

   public void e111C72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpdatat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tpdatat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpdatat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      tpdatat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Descuento +/-", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      edtTipArtId_Title = AV15Lit3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtId_Internalname, "Title", edtTipArtId_Title, true);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpdatat_impl.this.A396EmprCod = GXv_char2[0] ;
      tpdatat_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpdatat_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1C71535( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11519TpTatPor = T01C73_A11519TpTatPor[0] ;
         }
         else
         {
            Z11519TpTatPor = A11519TpTatPor ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z11520TipArtId = A11520TipArtId ;
         Z11519TpTatPor = A11519TpTatPor ;
         Z396EmprCod = A396EmprCod ;
         Z4295ClasCod = A4295ClasCod ;
         Z407EmprNom = A407EmprNom ;
         Z4296ClasDsc = A4296ClasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TPDATAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01C74 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01C74_A407EmprNom[0] ;
      n407EmprNom = T01C74_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01C75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
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

   public void load1C71535( )
   {
      /* Using cursor T01C76 */
      pr_default.execute(4, new Object[] {Short.valueOf(A11520TipArtId), A396EmprCod, Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1535 = (short)(1) ;
         A407EmprNom = T01C76_A407EmprNom[0] ;
         n407EmprNom = T01C76_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11519TpTatPor = T01C76_A11519TpTatPor[0] ;
         n11519TpTatPor = T01C76_n11519TpTatPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11519TpTatPor), 3, 0));
         zm1C71535( -3) ;
      }
      pr_default.close(4);
      onLoadActions1C71535( ) ;
   }

   public void onLoadActions1C71535( )
   {
      GXt_char1 = A11518TipArtName ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11520TipArtId, GXv_char4) ;
      tpdatat_impl.this.GXt_char1 = GXv_char4[0] ;
      A11518TipArtName = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
   }

   public void checkExtendedTable1C71535( )
   {
      nIsDirty_1535 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_1535 = (short)(1) ;
      GXt_char1 = A11518TipArtName ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11520TipArtId, GXv_char4) ;
      tpdatat_impl.this.GXt_char1 = GXv_char4[0] ;
      A11518TipArtName = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
      if ( ( GXutil.strcmp(A11518TipArtName, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Articulo Inexistente", ""), 1, "TIPARTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1C71535( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1C71535( )
   {
      /* Using cursor T01C77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod), Short.valueOf(A11520TipArtId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1535 = (short)(1) ;
      }
      else
      {
         RcdFound1535 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01C73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod), Short.valueOf(A11520TipArtId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01C73_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01C73_A4295ClasCod[0] == A4295ClasCod ) )
      {
         zm1C71535( 3) ;
         RcdFound1535 = (short)(1) ;
         A11520TipArtId = T01C73_A11520TipArtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
         A11519TpTatPor = T01C73_A11519TpTatPor[0] ;
         n11519TpTatPor = T01C73_n11519TpTatPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11519TpTatPor), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z4295ClasCod = A4295ClasCod ;
         Z11520TipArtId = A11520TipArtId ;
         sMode1535 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1C71535( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1535 = (short)(0) ;
            initializeNonKey1C71535( ) ;
         }
         Gx_mode = sMode1535 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1535 = (short)(0) ;
         initializeNonKey1C71535( ) ;
         sMode1535 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1535 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1C71535( ) ;
      if ( RcdFound1535 == 0 )
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
      RcdFound1535 = (short)(0) ;
      /* Using cursor T01C78 */
      pr_default.execute(6, new Object[] {Short.valueOf(A11520TipArtId), A396EmprCod, Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01C78_A11520TipArtId[0] < A11520TipArtId ) ) && ( GXutil.strcmp(T01C78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01C78_A4295ClasCod[0] == A4295ClasCod ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01C78_A11520TipArtId[0] > A11520TipArtId ) ) && ( GXutil.strcmp(T01C78_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01C78_A4295ClasCod[0] == A4295ClasCod ) )
         {
            A11520TipArtId = T01C78_A11520TipArtId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
            RcdFound1535 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1535 = (short)(0) ;
      /* Using cursor T01C79 */
      pr_default.execute(7, new Object[] {Short.valueOf(A11520TipArtId), A396EmprCod, Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01C79_A11520TipArtId[0] > A11520TipArtId ) ) && ( GXutil.strcmp(T01C79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01C79_A4295ClasCod[0] == A4295ClasCod ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01C79_A11520TipArtId[0] < A11520TipArtId ) ) && ( GXutil.strcmp(T01C79_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01C79_A4295ClasCod[0] == A4295ClasCod ) )
         {
            A11520TipArtId = T01C79_A11520TipArtId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
            RcdFound1535 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1C71535( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipArtId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1C71535( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1535 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) || ( A11520TipArtId != Z11520TipArtId ) )
            {
               A11520TipArtId = Z11520TipArtId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipArtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1C71535( ) ;
               GX_FocusControl = edtTipArtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) || ( A11520TipArtId != Z11520TipArtId ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTipArtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1C71535( ) ;
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
                  GX_FocusControl = edtTipArtId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1C71535( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) || ( A11520TipArtId != Z11520TipArtId ) )
      {
         A11520TipArtId = Z11520TipArtId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipArtId_Internalname ;
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
      getKey1C71535( ) ;
      if ( RcdFound1535 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) || ( A11520TipArtId != Z11520TipArtId ) )
         {
            A11520TipArtId = Z11520TipArtId ;
            httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) || ( A11520TipArtId != Z11520TipArtId ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpdatat");
      GX_FocusControl = edtTpTatPor_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1C70( ) ;
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
      if ( RcdFound1535 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTpTatPor_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1C71535( ) ;
      if ( RcdFound1535 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTpTatPor_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C71535( ) ;
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
      if ( RcdFound1535 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTpTatPor_Internalname ;
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
      if ( RcdFound1535 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTpTatPor_Internalname ;
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
      scanStart1C71535( ) ;
      if ( RcdFound1535 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1535 != 0 )
         {
            scanNext1C71535( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTpTatPor_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1C71535( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1C71535( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01C72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod), Short.valueOf(A11520TipArtId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPDATAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z11519TpTatPor != T01C72_A11519TpTatPor[0] ) )
         {
            if ( Z11519TpTatPor != T01C72_A11519TpTatPor[0] )
            {
               GXutil.writeLogln("tpdatat:[seudo value changed for attri]"+"TpTatPor");
               GXutil.writeLogRaw("Old: ",Z11519TpTatPor);
               GXutil.writeLogRaw("Current: ",T01C72_A11519TpTatPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPDATAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1C71535( )
   {
      beforeValidate1C71535( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C71535( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1C71535( 0) ;
         checkOptimisticConcurrency1C71535( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C71535( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1C71535( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01C710 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A11520TipArtId), Boolean.valueOf(n11519TpTatPor), Short.valueOf(A11519TpTatPor), A396EmprCod, Short.valueOf(A4295ClasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPDATAT");
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
                        resetCaption1C70( ) ;
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
            load1C71535( ) ;
         }
         endLevel1C71535( ) ;
      }
      closeExtendedTableCursors1C71535( ) ;
   }

   public void update1C71535( )
   {
      beforeValidate1C71535( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C71535( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C71535( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C71535( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1C71535( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01C711 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11519TpTatPor), Short.valueOf(A11519TpTatPor), A396EmprCod, Short.valueOf(A4295ClasCod), Short.valueOf(A11520TipArtId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPDATAT");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPDATAT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1C71535( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1C70( ) ;
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
         endLevel1C71535( ) ;
      }
      closeExtendedTableCursors1C71535( ) ;
   }

   public void deferredUpdate1C71535( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1C71535( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C71535( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1C71535( ) ;
         afterConfirm1C71535( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1C71535( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01C712 */
               pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod), Short.valueOf(A11520TipArtId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPDATAT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1535 == 0 )
                     {
                        initAll1C71535( ) ;
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
                     resetCaption1C70( ) ;
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
      sMode1535 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1C71535( ) ;
      Gx_mode = sMode1535 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1C71535( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A11518TipArtName ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11520TipArtId, GXv_char4) ;
         tpdatat_impl.this.GXt_char1 = GXv_char4[0] ;
         A11518TipArtName = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
      }
   }

   public void endLevel1C71535( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1C71535( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpdatat");
         if ( AnyError == 0 )
         {
            confirmValues1C70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpdatat");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1C71535( )
   {
      /* Scan By routine */
      /* Using cursor T01C713 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod)});
      RcdFound1535 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1535 = (short)(1) ;
         A11520TipArtId = T01C713_A11520TipArtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1C71535( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1535 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1535 = (short)(1) ;
         A11520TipArtId = T01C713_A11520TipArtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
      }
   }

   public void scanEnd1C71535( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1C71535( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1C71535( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1C71535( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1C71535( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1C71535( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1C71535( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1C71535( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      edtClasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), true);
      edtTipArtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtId_Enabled), 5, 0), true);
      edtTipArtName_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtName_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtName_Enabled), 5, 0), true);
      edtTpTatPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpTatPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTpTatPor_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1C71535( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1C70( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpdatat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4295ClasCod,4,0)),GXutil.URLEncode(GXutil.rtrim(A4296ClasDsc))}, new String[] {"EmprCod","ClasCod","ClasDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11520TipArtId", GXutil.ltrim( localUtil.ntoc( Z11520TipArtId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11519TpTatPor", GXutil.ltrim( localUtil.ntoc( Z11519TpTatPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpdatat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4295ClasCod,4,0)),GXutil.URLEncode(GXutil.rtrim(A4296ClasDsc))}, new String[] {"EmprCod","ClasCod","ClasDsc"})  ;
   }

   public String getPgmname( )
   {
      return "TPDATAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRENDA mas TIPO ARTICULO", "") ;
   }

   public void initializeNonKey1C71535( )
   {
      A11518TipArtName = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
      A11519TpTatPor = (short)(0) ;
      n11519TpTatPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11519TpTatPor), 3, 0));
      Z11519TpTatPor = (short)(0) ;
   }

   public void initAll1C71535( )
   {
      A11520TipArtId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11520TipArtId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11520TipArtId), 4, 0));
      initializeNonKey1C71535( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564850", true, true);
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
      httpContext.AddJavascriptSource("tpdatat.js", "?20268241564850", false, true);
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
      edtClasCod_Internalname = "CLASCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtClasDsc_Internalname = "CLASDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTipArtId_Internalname = "TIPARTID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipArtName_Internalname = "TIPARTNAME" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTpTatPor_Internalname = "TPTATPOR" ;
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
      Form.setCaption( httpContext.getMessage( "PRENDA mas TIPO ARTICULO", "") );
      edtTipArtId_Title = "" ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTpTatPor_Jsonclick = "" ;
      edtTpTatPor_Backcolor = (int)(0xFFFFFF) ;
      edtTpTatPor_Enabled = 1 ;
      edtTipArtName_Jsonclick = "" ;
      edtTipArtName_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtName_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipArtId_Jsonclick = "" ;
      edtTipArtId_Backcolor = (int)(0xFFFFFF) ;
      edtTipArtId_Enabled = 1 ;
      edtClasDsc_Jsonclick = "" ;
      edtClasDsc_Backcolor = (int)(0xFFFFFF) ;
      edtClasDsc_Enabled = 0 ;
      edtClasCod_Jsonclick = "" ;
      edtClasCod_Backcolor = (int)(0xFFFFFF) ;
      edtClasCod_Enabled = 0 ;
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

   public void gx1asatipartname1C71535( String A396EmprCod ,
                                        short A11520TipArtId )
   {
      GXt_char1 = A11518TipArtName ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11520TipArtId, GXv_char4) ;
      tpdatat_impl.this.GXt_char1 = GXv_char4[0] ;
      A11518TipArtName = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", A11518TipArtName);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11518TipArtName))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01C714 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01C714_A407EmprNom[0] ;
      n407EmprNom = T01C714_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      /* Using cursor T01C715 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLAPEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLASCOD");
         AnyError = (short)(1) ;
      }
      A4296ClasDsc = T01C715_A4296ClasDsc[0] ;
      n4296ClasDsc = T01C715_n4296ClasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      pr_default.close(13);
      GX_FocusControl = edtTpTatPor_Internalname ;
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

   public void valid_Tipartid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      GXt_char1 = A11518TipArtName ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A11520TipArtId, GXv_char4) ;
      tpdatat_impl.this.GXt_char1 = GXv_char4[0] ;
      A11518TipArtName = GXt_char1 ;
      if ( ( GXutil.strcmp(A11518TipArtName, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Articulo Inexistente", ""), 1, "TIPARTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtId_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11519TpTatPor", GXutil.ltrim( localUtil.ntoc( A11519TpTatPor, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", GXutil.rtrim( A4296ClasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A11518TipArtName", GXutil.rtrim( A11518TipArtName));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11520TipArtId", GXutil.ltrim( localUtil.ntoc( Z11520TipArtId, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11519TpTatPor", GXutil.ltrim( localUtil.ntoc( Z11519TpTatPor, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4296ClasDsc", GXutil.rtrim( Z4296ClasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11518TipArtName", GXutil.rtrim( Z11518TipArtName));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLASCOD","{handler:'valid_Clascod',iparms:[]");
      setEventMetadata("VALID_CLASCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPARTID","{handler:'valid_Tipartid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4295ClasCod',fld:'CLASCOD',pic:'ZZZ9'},{av:'A11520TipArtId',fld:'TIPARTID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPARTID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11519TpTatPor',fld:'TPTATPOR',pic:'ZZ9'},{av:'A4296ClasDsc',fld:'CLASDSC',pic:''},{av:'A11518TipArtName',fld:'TIPARTNAME',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4295ClasCod'},{av:'Z11520TipArtId'},{av:'Z407EmprNom'},{av:'Z11519TpTatPor'},{av:'Z4296ClasDsc'},{av:'Z11518TipArtName'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA4296ClasDsc = "" ;
      Z396EmprCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4296ClasDsc = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11518TipArtName = "" ;
      lblTextblock7_Jsonclick = "" ;
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
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z4296ClasDsc = "" ;
      T01C74_A407EmprNom = new String[] {""} ;
      T01C74_n407EmprNom = new boolean[] {false} ;
      T01C75_A4296ClasDsc = new String[] {""} ;
      T01C75_n4296ClasDsc = new boolean[] {false} ;
      T01C76_A4296ClasDsc = new String[] {""} ;
      T01C76_n4296ClasDsc = new boolean[] {false} ;
      T01C76_A11520TipArtId = new short[1] ;
      T01C76_A407EmprNom = new String[] {""} ;
      T01C76_n407EmprNom = new boolean[] {false} ;
      T01C76_A11519TpTatPor = new short[1] ;
      T01C76_n11519TpTatPor = new boolean[] {false} ;
      T01C76_A396EmprCod = new String[] {""} ;
      T01C76_A4295ClasCod = new short[1] ;
      T01C77_A396EmprCod = new String[] {""} ;
      T01C77_A4295ClasCod = new short[1] ;
      T01C77_A11520TipArtId = new short[1] ;
      T01C73_A11520TipArtId = new short[1] ;
      T01C73_A11519TpTatPor = new short[1] ;
      T01C73_n11519TpTatPor = new boolean[] {false} ;
      T01C73_A396EmprCod = new String[] {""} ;
      T01C73_A4295ClasCod = new short[1] ;
      sMode1535 = "" ;
      T01C78_A11520TipArtId = new short[1] ;
      T01C78_A396EmprCod = new String[] {""} ;
      T01C78_A4295ClasCod = new short[1] ;
      T01C79_A11520TipArtId = new short[1] ;
      T01C79_A396EmprCod = new String[] {""} ;
      T01C79_A4295ClasCod = new short[1] ;
      T01C72_A11520TipArtId = new short[1] ;
      T01C72_A11519TpTatPor = new short[1] ;
      T01C72_n11519TpTatPor = new boolean[] {false} ;
      T01C72_A396EmprCod = new String[] {""} ;
      T01C72_A4295ClasCod = new short[1] ;
      T01C713_A396EmprCod = new String[] {""} ;
      T01C713_A4295ClasCod = new short[1] ;
      T01C713_A11520TipArtId = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01C714_A407EmprNom = new String[] {""} ;
      T01C714_n407EmprNom = new boolean[] {false} ;
      T01C715_A4296ClasDsc = new String[] {""} ;
      T01C715_n4296ClasDsc = new boolean[] {false} ;
      Z11518TipArtName = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ4296ClasDsc = "" ;
      ZZ11518TipArtName = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpdatat__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpdatat__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpdatat__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpdatat__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpdatat__default(),
         new Object[] {
             new Object[] {
            T01C72_A11520TipArtId, T01C72_A11519TpTatPor, T01C72_n11519TpTatPor, T01C72_A396EmprCod, T01C72_A4295ClasCod
            }
            , new Object[] {
            T01C73_A11520TipArtId, T01C73_A11519TpTatPor, T01C73_n11519TpTatPor, T01C73_A396EmprCod, T01C73_A4295ClasCod
            }
            , new Object[] {
            T01C74_A407EmprNom, T01C74_n407EmprNom
            }
            , new Object[] {
            T01C75_A4296ClasDsc, T01C75_n4296ClasDsc
            }
            , new Object[] {
            T01C76_A4296ClasDsc, T01C76_n4296ClasDsc, T01C76_A11520TipArtId, T01C76_A407EmprNom, T01C76_n407EmprNom, T01C76_A11519TpTatPor, T01C76_n11519TpTatPor, T01C76_A396EmprCod, T01C76_A4295ClasCod
            }
            , new Object[] {
            T01C77_A396EmprCod, T01C77_A4295ClasCod, T01C77_A11520TipArtId
            }
            , new Object[] {
            T01C78_A11520TipArtId, T01C78_A396EmprCod, T01C78_A4295ClasCod
            }
            , new Object[] {
            T01C79_A11520TipArtId, T01C79_A396EmprCod, T01C79_A4295ClasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01C713_A396EmprCod, T01C713_A4295ClasCod, T01C713_A11520TipArtId
            }
            , new Object[] {
            T01C714_A407EmprNom, T01C714_n407EmprNom
            }
            , new Object[] {
            T01C715_A4296ClasDsc, T01C715_n4296ClasDsc
            }
         }
      );
      Z4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      Z4295ClasCod = (short)(0) ;
      A4295ClasCod = (short)(0) ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TPDATAT" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOA4295ClasCod ;
   private short Z4295ClasCod ;
   private short Z11520TipArtId ;
   private short Z11519TpTatPor ;
   private short A11520TipArtId ;
   private short A4295ClasCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11519TpTatPor ;
   private short RcdFound1535 ;
   private short nIsDirty_1535 ;
   private short ZZ4295ClasCod ;
   private short ZZ11520TipArtId ;
   private short ZZ11519TpTatPor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtClasCod_Enabled ;
   private int edtClasDsc_Enabled ;
   private int edtTipArtId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTipArtName_Enabled ;
   private int edtTpTatPor_Enabled ;
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
   private int edtTpTatPor_Backcolor ;
   private int edtTipArtName_Backcolor ;
   private int edtTipArtId_Backcolor ;
   private int edtClasDsc_Backcolor ;
   private int edtClasCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA4296ClasDsc ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4296ClasDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipArtId_Internalname ;
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
   private String edtClasCod_Internalname ;
   private String edtClasCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtClasDsc_Internalname ;
   private String edtClasDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTipArtId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipArtName_Internalname ;
   private String A11518TipArtName ;
   private String edtTipArtName_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTpTatPor_Internalname ;
   private String edtTpTatPor_Jsonclick ;
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
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String edtTipArtId_Title ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z4296ClasDsc ;
   private String sMode1535 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z11518TipArtName ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ4296ClasDsc ;
   private String ZZ11518TipArtName ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4296ClasDsc ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n11519TpTatPor ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01C74_A407EmprNom ;
   private boolean[] T01C74_n407EmprNom ;
   private String[] T01C75_A4296ClasDsc ;
   private boolean[] T01C75_n4296ClasDsc ;
   private String[] T01C76_A4296ClasDsc ;
   private boolean[] T01C76_n4296ClasDsc ;
   private short[] T01C76_A11520TipArtId ;
   private String[] T01C76_A407EmprNom ;
   private boolean[] T01C76_n407EmprNom ;
   private short[] T01C76_A11519TpTatPor ;
   private boolean[] T01C76_n11519TpTatPor ;
   private String[] T01C76_A396EmprCod ;
   private short[] T01C76_A4295ClasCod ;
   private String[] T01C77_A396EmprCod ;
   private short[] T01C77_A4295ClasCod ;
   private short[] T01C77_A11520TipArtId ;
   private short[] T01C73_A11520TipArtId ;
   private short[] T01C73_A11519TpTatPor ;
   private boolean[] T01C73_n11519TpTatPor ;
   private String[] T01C73_A396EmprCod ;
   private short[] T01C73_A4295ClasCod ;
   private short[] T01C78_A11520TipArtId ;
   private String[] T01C78_A396EmprCod ;
   private short[] T01C78_A4295ClasCod ;
   private short[] T01C79_A11520TipArtId ;
   private String[] T01C79_A396EmprCod ;
   private short[] T01C79_A4295ClasCod ;
   private short[] T01C72_A11520TipArtId ;
   private short[] T01C72_A11519TpTatPor ;
   private boolean[] T01C72_n11519TpTatPor ;
   private String[] T01C72_A396EmprCod ;
   private short[] T01C72_A4295ClasCod ;
   private String[] T01C713_A396EmprCod ;
   private short[] T01C713_A4295ClasCod ;
   private short[] T01C713_A11520TipArtId ;
   private String[] T01C714_A407EmprNom ;
   private boolean[] T01C714_n407EmprNom ;
   private String[] T01C715_A4296ClasDsc ;
   private boolean[] T01C715_n4296ClasDsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpdatat__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdatat__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdatat__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdatat__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdatat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01C72", "SELECT TipArtId, TpTatPor, EmprCod, ClasCod FROM TXPPDATAT WHERE EmprCod = ? AND ClasCod = ? AND TipArtId = ?  FOR UPDATE OF TpTatPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C73", "SELECT TipArtId, TpTatPor, EmprCod, ClasCod FROM TXPPDATAT WHERE EmprCod = ? AND ClasCod = ? AND TipArtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C74", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C75", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C76", "SELECT /*+ FIRST_ROWS(100) */ T3.ClasDsc, TM1.TipArtId, T2.EmprNom, TM1.TpTatPor, TM1.EmprCod, TM1.ClasCod FROM ((TXPPDATAT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLAPEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.ClasCod = TM1.ClasCod) WHERE TM1.TipArtId = ? and TM1.EmprCod = ? and TM1.ClasCod = ? ORDER BY TM1.EmprCod, TM1.ClasCod, TM1.TipArtId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C77", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ClasCod, TipArtId FROM TXPPDATAT WHERE EmprCod = ? AND ClasCod = ? AND TipArtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C78", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TipArtId, EmprCod, ClasCod FROM TXPPDATAT WHERE ( TipArtId > ?) and EmprCod = ? and ClasCod = ? ORDER BY EmprCod, ClasCod, TipArtId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01C79", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ TipArtId, EmprCod, ClasCod FROM TXPPDATAT WHERE ( TipArtId < ?) and EmprCod = ? and ClasCod = ? ORDER BY EmprCod DESC, ClasCod DESC, TipArtId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01C710", "INSERT INTO TXPPDATAT(TipArtId, TpTatPor, EmprCod, ClasCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPDATAT")
         ,new UpdateCursor("T01C711", "UPDATE TXPPDATAT SET TpTatPor=?  WHERE EmprCod = ? AND ClasCod = ? AND TipArtId = ?", GX_NOMASK, "TXPPDATAT")
         ,new UpdateCursor("T01C712", "DELETE FROM TXPPDATAT  WHERE EmprCod = ? AND ClasCod = ? AND TipArtId = ?", GX_NOMASK, "TXPPDATAT")
         ,new ForEachCursor("T01C713", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ClasCod, TipArtId FROM TXPPDATAT WHERE EmprCod = ? and ClasCod = ? ORDER BY EmprCod, ClasCod, TipArtId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C714", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01C715", "SELECT ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

