package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdrpzs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
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
            A6965Mat_Hd = (int)(GXutil.lval( httpContext.GetPar( "Mat_Hd"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6965Mat_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6965Mat_Hd), 8, 0));
            A6966Mat_Hdr = (byte)(GXutil.lval( httpContext.GetPar( "Mat_Hdr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6966Mat_Hdr", GXutil.str( A6966Mat_Hdr, 1, 0));
            A6967Mat_Hdp = httpContext.GetPar( "Mat_Hdp") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6967Mat_Hdp", A6967Mat_Hdp);
            AV33BarNumUni = CommonUtil.decimalVal( httpContext.GetPar( "BarNumUni"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarNumUni", GXutil.ltrimstr( AV33BarNumUni, 9, 2));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INFORME DETALLE DE PIEZAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMat_HdUl_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public thdrpzs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdrpzs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdrpzs_impl.class ));
   }

   public thdrpzs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDRPZS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hd_Internalname, GXutil.ltrim( localUtil.ntoc( A6965Mat_Hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Hd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6965Mat_Hd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6965Mat_Hd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hd_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A6966Mat_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6966Mat_Hdr), "9") : localUtil.format( DecimalUtil.doubleToDec(A6966Mat_Hdr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hdr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hdp_Internalname, GXutil.rtrim( A6967Mat_Hdp), GXutil.rtrim( localUtil.format( A6967Mat_Hdp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hdp_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hdp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdUl_Internalname, GXutil.ltrim( localUtil.ntoc( A6968Mat_HdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_HdUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6968Mat_HdUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6968Mat_HdUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdUl_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kgs Pesados", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6969Mat_HdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_HdKgs_Enabled!=0) ? localUtil.format( A6969Mat_HdKgs, "ZZZZZ9.99") : localUtil.format( A6969Mat_HdKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Pzas_Internalname, GXutil.ltrim( localUtil.ntoc( A6971Mat_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Pzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6971Mat_Pzas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6971Mat_Pzas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Pzas_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Pzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Sumo Kgs", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_SumKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6982Mat_SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_SumKgs_Enabled!=0) ? localUtil.format( A6982Mat_SumKgs, "ZZZZZ9.99") : localUtil.format( A6982Mat_SumKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_SumKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMat_SumKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Sumo Piezas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_SumPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A6983Mat_SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_SumPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6983Mat_SumPzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6983Mat_SumPzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_SumPzs_Jsonclick, 0, "", "", "", "", "", 1, edtMat_SumPzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol70( ) ;
      nGXsfl_70_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount987 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_987 = (short)(1) ;
            scanStartXC987( ) ;
            while ( RcdFound987 != 0 )
            {
               init_level_properties987( ) ;
               getByPrimaryKeyXC987( ) ;
               addRowXC987( ) ;
               scanNextXC987( ) ;
            }
            scanEndXC987( ) ;
            nBlankRcdCount987 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6982Mat_SumKgs = A6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         B6983Mat_SumPzs = A6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         standaloneNotModalXC987( ) ;
         standaloneModalXC987( ) ;
         sMode987 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRowXC987( ) ;
            edtavnRcdDeleted_987_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_987_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_987_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_987_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMat_HdCPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDCPZ_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdCPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdCPz_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMat_HdKgP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDKGP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdKgP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdKgP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtMat_Numcr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NUMCR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_Numcr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Numcr_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_987 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalXC987( ) ;
            }
            sendRowXC987( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode987 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6982Mat_SumKgs = B6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = B6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount987 = (short)(5) ;
         nRcdExists_987 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartXC987( ) ;
            while ( RcdFound987 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_70987( ) ;
               init_level_properties987( ) ;
               standaloneNotModalXC987( ) ;
               getByPrimaryKeyXC987( ) ;
               standaloneModalXC987( ) ;
               addRowXC987( ) ;
               scanNextXC987( ) ;
            }
            scanEndXC987( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode987 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_70987( ) ;
      initAllXC987( ) ;
      init_level_properties987( ) ;
      B6982Mat_SumKgs = A6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      B6983Mat_SumPzs = A6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      nRcdExists_987 = (short)(0) ;
      nIsMod_987 = (short)(0) ;
      nRcdDeleted_987 = (short)(0) ;
      nBlankRcdCount987 = (short)(nBlankRcdUsr987+nBlankRcdCount987) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount987 > 0 )
      {
         standaloneNotModalXC987( ) ;
         standaloneModalXC987( ) ;
         addRowXC987( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMat_HdCPz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount987 = (short)(nBlankRcdCount987-1) ;
      }
      Gx_mode = sMode987 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6982Mat_SumKgs = B6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      A6983Mat_SumPzs = B6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDRPZS.htm");
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
      e11XC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z6965Mat_Hd = (int)(localUtil.ctol( httpContext.cgiGet( "Z6965Mat_Hd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6966Mat_Hdr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6966Mat_Hdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6967Mat_Hdp = httpContext.cgiGet( "Z6967Mat_Hdp") ;
            Z6968Mat_HdUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z6968Mat_HdUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6969Mat_HdKgs = localUtil.ctond( httpContext.cgiGet( "Z6969Mat_HdKgs")) ;
            Z6971Mat_Pzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z6971Mat_Pzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6982Mat_SumKgs = localUtil.ctond( httpContext.cgiGet( "O6982Mat_SumKgs")) ;
            O6983Mat_SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( "O6983Mat_SumPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Msg_p = httpContext.cgiGet( "vMSG_P") ;
            AV35Msg_k = httpContext.cgiGet( "vMSG_K") ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A6965Mat_Hd = (int)(localUtil.ctol( httpContext.cgiGet( edtMat_Hd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6965Mat_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6965Mat_Hd), 8, 0));
            A6966Mat_Hdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtMat_Hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6966Mat_Hdr", GXutil.str( A6966Mat_Hdr, 1, 0));
            A6967Mat_Hdp = httpContext.cgiGet( edtMat_Hdp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6967Mat_Hdp", A6967Mat_Hdp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_HdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_HdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAT_HDUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMat_HdUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6968Mat_HdUl = (short)(0) ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
            }
            else
            {
               A6968Mat_HdUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_HdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_HdKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_HdKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAT_HDKGS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMat_HdKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6969Mat_HdKgs = DecimalUtil.ZERO ;
               n6969Mat_HdKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
            }
            else
            {
               A6969Mat_HdKgs = localUtil.ctond( httpContext.cgiGet( edtMat_HdKgs_Internalname)) ;
               n6969Mat_HdKgs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAT_PZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMat_Pzas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6971Mat_Pzas = 0 ;
               n6971Mat_Pzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
            }
            else
            {
               A6971Mat_Pzas = (int)(localUtil.ctol( httpContext.cgiGet( edtMat_Pzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6971Mat_Pzas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
            }
            A6982Mat_SumKgs = localUtil.ctond( httpContext.cgiGet( edtMat_SumKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
            A6983Mat_SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_SumPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A6965Mat_Hd = (int)(GXutil.lval( httpContext.GetPar( "Mat_Hd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6965Mat_Hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6965Mat_Hd), 8, 0));
               A6966Mat_Hdr = (byte)(GXutil.lval( httpContext.GetPar( "Mat_Hdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6966Mat_Hdr", GXutil.str( A6966Mat_Hdr, 1, 0));
               A6967Mat_Hdp = httpContext.GetPar( "Mat_Hdp") ;
               httpContext.ajax_rsp_assign_attri("", false, "A6967Mat_Hdp", A6967Mat_Hdp);
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
                        e11XC2 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
            initAllXC985( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_987_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_987_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributesXC985( ) ;
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

   public void confirm_XC0( )
   {
      beforeValidateXC985( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsXC985( ) ;
         }
         else
         {
            checkExtendedTableXC985( ) ;
            if ( AnyError == 0 )
            {
               zmXC985( 9) ;
               zmXC985( 10) ;
            }
            closeExtendedTableCursorsXC985( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode985 = Gx_mode ;
         confirm_XC987( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode985 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode985 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesXC0( ) ;
      }
   }

   public void confirm_XC987( )
   {
      s6982Mat_SumKgs = O6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      s6983Mat_SumPzs = O6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowXC987( ) ;
         if ( ( nRcdExists_987 != 0 ) || ( nIsMod_987 != 0 ) )
         {
            getKeyXC987( ) ;
            if ( ( nRcdExists_987 == 0 ) && ( nRcdDeleted_987 == 0 ) )
            {
               if ( RcdFound987 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateXC987( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableXC987( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsXC987( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6982Mat_SumKgs = A6982Mat_SumKgs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
                     O6983Mat_SumPzs = A6983Mat_SumPzs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MAT_HDCPZ_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMat_HdCPz_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound987 != 0 )
               {
                  if ( nRcdDeleted_987 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyXC987( ) ;
                     loadXC987( ) ;
                     beforeValidateXC987( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsXC987( ) ;
                        O6982Mat_SumKgs = A6982Mat_SumKgs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
                        O6983Mat_SumPzs = A6983Mat_SumPzs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_987 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateXC987( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableXC987( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsXC987( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6982Mat_SumKgs = A6982Mat_SumKgs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
                           O6983Mat_SumPzs = A6983Mat_SumPzs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_987 == 0 )
                  {
                     GXCCtl = "MAT_HDCPZ_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_HdCPz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_987_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdCPz_Internalname, GXutil.rtrim( A6984Mat_HdCPz)) ;
         httpContext.changePostValue( edtMat_HdKgP_Internalname, GXutil.ltrim( localUtil.ntoc( A6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_Numcr_Internalname, GXutil.ltrim( localUtil.ntoc( A7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6984Mat_HdCPz_"+sGXsfl_70_idx, GXutil.rtrim( Z6984Mat_HdCPz)) ;
         httpContext.changePostValue( "ZT_"+"Z6985Mat_HdKgP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7109Mat_Numcr_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6985Mat_HdKgP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_987 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_987_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_987_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDCPZ_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdCPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDKGP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdKgP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NUMCR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Numcr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6982Mat_SumKgs = s6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      O6983Mat_SumPzs = s6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionXC0( )
   {
   }

   public void e11XC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thdrpzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      thdrpzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thdrpzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Kgs Pesados", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Nº Guia", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thdrpzs_impl.this.A396EmprCod = GXv_char2[0] ;
      thdrpzs_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdrpzs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV34Msg_p = httpContext.getMessage( "Atencion. El sistema ha detectado que", "") + GXutil.newLine( ) + httpContext.getMessage( "el total de Piezas entradas no es igual", "") + httpContext.getMessage( "al detalle de piezas entradas", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msg_p", AV34Msg_p);
      AV35Msg_k = httpContext.getMessage( "Atencion. El sistema ha detectado que", "") + GXutil.newLine( ) + httpContext.getMessage( "el total de Kgs entrados no es igual", "") + httpContext.getMessage( "al detalle de Kgs entrados", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Msg_k", AV35Msg_k);
   }

   public void zmXC985( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6968Mat_HdUl = T00XC5_A6968Mat_HdUl[0] ;
            Z6969Mat_HdKgs = T00XC5_A6969Mat_HdKgs[0] ;
            Z6971Mat_Pzas = T00XC5_A6971Mat_Pzas[0] ;
         }
         else
         {
            Z6968Mat_HdUl = A6968Mat_HdUl ;
            Z6969Mat_HdKgs = A6969Mat_HdKgs ;
            Z6971Mat_Pzas = A6971Mat_Pzas ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6968Mat_HdUl = A6968Mat_HdUl ;
         Z6969Mat_HdKgs = A6969Mat_HdKgs ;
         Z6971Mat_Pzas = A6971Mat_Pzas ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z6982Mat_SumKgs = A6982Mat_SumKgs ;
         Z6983Mat_SumPzs = A6983Mat_SumPzs ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "THDRPZS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      /* Using cursor T00XC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XC6_A407EmprNom[0] ;
      n407EmprNom = T00XC6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00XC8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A6982Mat_SumKgs = T00XC8_A6982Mat_SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = T00XC8_A6983Mat_SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      else
      {
         A6982Mat_SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      O6982Mat_SumKgs = A6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      O6983Mat_SumPzs = A6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      pr_default.close(5);
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

   public void loadXC985( )
   {
      /* Using cursor T00XC10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound985 = (short)(1) ;
         A407EmprNom = T00XC10_A407EmprNom[0] ;
         n407EmprNom = T00XC10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A6968Mat_HdUl = T00XC10_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = T00XC10_n6968Mat_HdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         A6969Mat_HdKgs = T00XC10_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = T00XC10_n6969Mat_HdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
         A6971Mat_Pzas = T00XC10_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = T00XC10_n6971Mat_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
         A6982Mat_SumKgs = T00XC10_A6982Mat_SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = T00XC10_A6983Mat_SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         zmXC985( -8) ;
      }
      pr_default.close(6);
      onLoadActionsXC985( ) ;
   }

   public void onLoadActionsXC985( )
   {
      O6982Mat_SumKgs = A6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      O6983Mat_SumPzs = A6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
   }

   public void checkExtendedTableXC985( )
   {
      nIsDirty_985 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsXC985( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyXC985( )
   {
      /* Using cursor T00XC11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
      else
      {
         RcdFound985 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00XC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(3) != 101) && ( T00XC5_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC5_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC5_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) && ( GXutil.strcmp(T00XC5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmXC985( 8) ;
         RcdFound985 = (short)(1) ;
         A6968Mat_HdUl = T00XC5_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = T00XC5_n6968Mat_HdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         A6969Mat_HdKgs = T00XC5_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = T00XC5_n6969Mat_HdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
         A6971Mat_Pzas = T00XC5_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = T00XC5_n6971Mat_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         sMode985 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadXC985( ) ;
         if ( AnyError == 1 )
         {
            RcdFound985 = (short)(0) ;
            initializeNonKeyXC985( ) ;
         }
         Gx_mode = sMode985 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound985 = (short)(0) ;
         initializeNonKeyXC985( ) ;
         sMode985 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode985 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyXC985( ) ;
      if ( RcdFound985 == 0 )
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
      RcdFound985 = (short)(0) ;
      /* Using cursor T00XC12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00XC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XC12_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC12_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC12_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00XC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XC12_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC12_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC12_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            RcdFound985 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound985 = (short)(0) ;
      /* Using cursor T00XC13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00XC13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XC13_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC13_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC13_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00XC13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XC13_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC13_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC13_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            RcdFound985 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyXC985( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6982Mat_SumKgs = O6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = O6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         GX_FocusControl = edtMat_HdUl_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertXC985( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound985 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6965Mat_Hd != Z6965Mat_Hd ) || ( A6966Mat_Hdr != Z6966Mat_Hdr ) || ( GXutil.strcmp(A6967Mat_Hdp, Z6967Mat_Hdp) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A6982Mat_SumKgs = O6982Mat_SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
               A6983Mat_SumPzs = O6983Mat_SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMat_HdUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6982Mat_SumKgs = O6982Mat_SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
               A6983Mat_SumPzs = O6983Mat_SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               updateXC985( ) ;
               GX_FocusControl = edtMat_HdUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6965Mat_Hd != Z6965Mat_Hd ) || ( A6966Mat_Hdr != Z6966Mat_Hdr ) || ( GXutil.strcmp(A6967Mat_Hdp, Z6967Mat_Hdp) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A6982Mat_SumKgs = O6982Mat_SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
               A6983Mat_SumPzs = O6983Mat_SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               GX_FocusControl = edtMat_HdUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertXC985( ) ;
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
                  A6982Mat_SumKgs = O6982Mat_SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
                  A6983Mat_SumPzs = O6983Mat_SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
                  GX_FocusControl = edtMat_HdUl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertXC985( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6965Mat_Hd != Z6965Mat_Hd ) || ( A6966Mat_Hdr != Z6966Mat_Hdr ) || ( GXutil.strcmp(A6967Mat_Hdp, Z6967Mat_Hdp) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A6982Mat_SumKgs = O6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = O6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMat_HdUl_Internalname ;
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
      getKeyXC985( ) ;
      if ( RcdFound985 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6965Mat_Hd != Z6965Mat_Hd ) || ( A6966Mat_Hdr != Z6966Mat_Hdr ) || ( GXutil.strcmp(A6967Mat_Hdp, Z6967Mat_Hdp) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A6965Mat_Hd != Z6965Mat_Hd ) || ( A6966Mat_Hdr != Z6966Mat_Hdr ) || ( GXutil.strcmp(A6967Mat_Hdp, Z6967Mat_Hdp) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrpzs");
      GX_FocusControl = edtMat_HdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_XC0( ) ;
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
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMat_HdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartXC985( ) ;
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXC985( ) ;
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
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdUl_Internalname ;
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
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdUl_Internalname ;
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
      scanStartXC985( ) ;
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound985 != 0 )
         {
            scanNextXC985( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXC985( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyXC985( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z6968Mat_HdUl != T00XC4_A6968Mat_HdUl[0] ) || ( DecimalUtil.compareTo(Z6969Mat_HdKgs, T00XC4_A6969Mat_HdKgs[0]) != 0 ) || ( Z6971Mat_Pzas != T00XC4_A6971Mat_Pzas[0] ) )
         {
            if ( Z6968Mat_HdUl != T00XC4_A6968Mat_HdUl[0] )
            {
               GXutil.writeLogln("thdrpzs:[seudo value changed for attri]"+"Mat_HdUl");
               GXutil.writeLogRaw("Old: ",Z6968Mat_HdUl);
               GXutil.writeLogRaw("Current: ",T00XC4_A6968Mat_HdUl[0]);
            }
            if ( DecimalUtil.compareTo(Z6969Mat_HdKgs, T00XC4_A6969Mat_HdKgs[0]) != 0 )
            {
               GXutil.writeLogln("thdrpzs:[seudo value changed for attri]"+"Mat_HdKgs");
               GXutil.writeLogRaw("Old: ",Z6969Mat_HdKgs);
               GXutil.writeLogRaw("Current: ",T00XC4_A6969Mat_HdKgs[0]);
            }
            if ( Z6971Mat_Pzas != T00XC4_A6971Mat_Pzas[0] )
            {
               GXutil.writeLogln("thdrpzs:[seudo value changed for attri]"+"Mat_Pzas");
               GXutil.writeLogRaw("Old: ",Z6971Mat_Pzas);
               GXutil.writeLogRaw("Current: ",T00XC4_A6971Mat_Pzas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRMAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXC985( )
   {
      beforeValidateXC985( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXC985( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXC985( 0) ;
         checkOptimisticConcurrencyXC985( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXC985( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXC985( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XC14 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevelXC985( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionXC0( ) ;
                        }
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
            loadXC985( ) ;
         }
         endLevelXC985( ) ;
      }
      closeExtendedTableCursorsXC985( ) ;
   }

   public void updateXC985( )
   {
      beforeValidateXC985( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXC985( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXC985( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXC985( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateXC985( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XC15 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMAT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateXC985( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelXC985( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionXC0( ) ;
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
         }
         endLevelXC985( ) ;
      }
      closeExtendedTableCursorsXC985( ) ;
   }

   public void deferredUpdateXC985( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXC985( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXC985( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXC985( ) ;
         afterConfirmXC985( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXC985( ) ;
            if ( AnyError == 0 )
            {
               A6982Mat_SumKgs = O6982Mat_SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
               A6983Mat_SumPzs = O6983Mat_SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               scanStartXC987( ) ;
               while ( RcdFound987 != 0 )
               {
                  getByPrimaryKeyXC987( ) ;
                  deleteXC987( ) ;
                  scanNextXC987( ) ;
                  O6982Mat_SumKgs = A6982Mat_SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
                  O6983Mat_SumPzs = A6983Mat_SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               }
               scanEndXC987( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XC16 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound985 == 0 )
                        {
                           initAllXC985( ) ;
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
                        resetCaptionXC0( ) ;
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
      }
      sMode985 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXC985( ) ;
      Gx_mode = sMode985 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXC985( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00XC17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00XC18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevelXC987( )
   {
      s6982Mat_SumKgs = O6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      s6983Mat_SumPzs = O6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRowXC987( ) ;
         if ( ( nRcdExists_987 != 0 ) || ( nIsMod_987 != 0 ) )
         {
            standaloneNotModalXC987( ) ;
            getKeyXC987( ) ;
            if ( ( nRcdExists_987 == 0 ) && ( nRcdDeleted_987 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertXC987( ) ;
            }
            else
            {
               if ( RcdFound987 != 0 )
               {
                  if ( ( nRcdDeleted_987 != 0 ) && ( nRcdExists_987 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteXC987( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_987 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateXC987( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_987 == 0 )
                  {
                     GXCCtl = "MAT_HDCPZ_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_HdCPz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6982Mat_SumKgs = A6982Mat_SumKgs ;
            httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
            O6983Mat_SumPzs = A6983Mat_SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_987_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdCPz_Internalname, GXutil.rtrim( A6984Mat_HdCPz)) ;
         httpContext.changePostValue( edtMat_HdKgP_Internalname, GXutil.ltrim( localUtil.ntoc( A6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_Numcr_Internalname, GXutil.ltrim( localUtil.ntoc( A7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6984Mat_HdCPz_"+sGXsfl_70_idx, GXutil.rtrim( Z6984Mat_HdCPz)) ;
         httpContext.changePostValue( "ZT_"+"Z6985Mat_HdKgP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7109Mat_Numcr_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6985Mat_HdKgP_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( O6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_987_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_987 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_987_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_987_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDCPZ_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdCPz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDKGP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdKgP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_NUMCR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Numcr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllXC987( ) ;
      if ( AnyError != 0 )
      {
         O6982Mat_SumKgs = s6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         O6983Mat_SumPzs = s6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      nRcdExists_987 = (short)(0) ;
      nIsMod_987 = (short)(0) ;
      nRcdDeleted_987 = (short)(0) ;
   }

   public void processLevelXC985( )
   {
      /* Save parent mode. */
      sMode985 = Gx_mode ;
      processNestedLevelXC987( ) ;
      if ( AnyError != 0 )
      {
         O6982Mat_SumKgs = s6982Mat_SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         O6983Mat_SumPzs = s6983Mat_SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode985 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelXC985( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteXC985( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdrpzs");
         if ( AnyError == 0 )
         {
            confirmValuesXC0( ) ;
         }
         /* After transaction rules */
         if ( ( DecimalUtil.compareTo(A6969Mat_HdKgs, A6982Mat_SumKgs) != 0 ) && ( A6969Mat_HdKgs.doubleValue() > 0 ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(AV35Msg_k, 0, "MAT_HDKGS");
         }
         if ( ( A6971Mat_Pzas != A6983Mat_SumPzs ) && ( A6971Mat_Pzas > 0 ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(AV34Msg_p, 0, "MAT_PZAS");
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrpzs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXC985( )
   {
      /* Scan By routine */
      /* Using cursor T00XC19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      RcdFound985 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXC985( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound985 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
   }

   public void scanEndXC985( )
   {
      pr_default.close(15);
   }

   public void afterConfirmXC985( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertXC985( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXC985( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXC985( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXC985( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXC985( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXC985( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMat_Hd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Hd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Hd_Enabled), 5, 0), true);
      edtMat_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Hdr_Enabled), 5, 0), true);
      edtMat_Hdp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Hdp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Hdp_Enabled), 5, 0), true);
      edtMat_HdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdUl_Enabled), 5, 0), true);
      edtMat_HdKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdKgs_Enabled), 5, 0), true);
      edtMat_Pzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Pzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Pzas_Enabled), 5, 0), true);
      edtMat_SumKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_SumKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_SumKgs_Enabled), 5, 0), true);
      edtMat_SumPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_SumPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_SumPzs_Enabled), 5, 0), true);
   }

   public void zmXC987( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6985Mat_HdKgP = T00XC3_A6985Mat_HdKgP[0] ;
            Z7109Mat_Numcr = T00XC3_A7109Mat_Numcr[0] ;
         }
         else
         {
            Z6985Mat_HdKgP = A6985Mat_HdKgP ;
            Z7109Mat_Numcr = A7109Mat_Numcr ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6984Mat_HdCPz = A6984Mat_HdCPz ;
         Z6985Mat_HdKgP = A6985Mat_HdKgP ;
         Z7109Mat_Numcr = A7109Mat_Numcr ;
      }
   }

   public void standaloneNotModalXC987( )
   {
   }

   public void standaloneModalXC987( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMat_HdCPz_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_HdCPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdCPz_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtMat_HdCPz_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_HdCPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdCPz_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void loadXC987( )
   {
      /* Using cursor T00XC20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound987 = (short)(1) ;
         A6985Mat_HdKgP = T00XC20_A6985Mat_HdKgP[0] ;
         n6985Mat_HdKgP = T00XC20_n6985Mat_HdKgP[0] ;
         A7109Mat_Numcr = T00XC20_A7109Mat_Numcr[0] ;
         n7109Mat_Numcr = T00XC20_n7109Mat_Numcr[0] ;
         zmXC987( -11) ;
      }
      pr_default.close(16);
      onLoadActionsXC987( ) ;
   }

   public void onLoadActionsXC987( )
   {
      if ( isIns( )  )
      {
         A6983Mat_SumPzs = (short)(O6983Mat_SumPzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6983Mat_SumPzs = O6983Mat_SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6983Mat_SumPzs = (short)(O6983Mat_SumPzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP).subtract(O6985Mat_HdKgP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6982Mat_SumKgs = O6982Mat_SumKgs.subtract(O6985Mat_HdKgP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTableXC987( )
   {
      nIsDirty_987 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalXC987( ) ;
      if ( isIns( )  )
      {
         nIsDirty_987 = (short)(1) ;
         A6983Mat_SumPzs = (short)(O6983Mat_SumPzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_987 = (short)(1) ;
            A6983Mat_SumPzs = O6983Mat_SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_987 = (short)(1) ;
               A6983Mat_SumPzs = (short)(O6983Mat_SumPzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_987 = (short)(1) ;
         A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_987 = (short)(1) ;
            A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP).subtract(O6985Mat_HdKgP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_987 = (short)(1) ;
               A6982Mat_SumKgs = O6982Mat_SumKgs.subtract(O6985Mat_HdKgP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursorsXC987( )
   {
   }

   public void enableDisableXC987( )
   {
   }

   public void getKeyXC987( )
   {
      /* Using cursor T00XC21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound987 = (short)(1) ;
      }
      else
      {
         RcdFound987 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyXC987( )
   {
      /* Using cursor T00XC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00XC3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XC3_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XC3_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XC3_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
      {
         zmXC987( 11) ;
         RcdFound987 = (short)(1) ;
         initializeNonKeyXC987( ) ;
         A6984Mat_HdCPz = T00XC3_A6984Mat_HdCPz[0] ;
         A6985Mat_HdKgP = T00XC3_A6985Mat_HdKgP[0] ;
         n6985Mat_HdKgP = T00XC3_n6985Mat_HdKgP[0] ;
         A7109Mat_Numcr = T00XC3_A7109Mat_Numcr[0] ;
         n7109Mat_Numcr = T00XC3_n7109Mat_Numcr[0] ;
         O6985Mat_HdKgP = A6985Mat_HdKgP ;
         n6985Mat_HdKgP = false ;
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6984Mat_HdCPz = A6984Mat_HdCPz ;
         sMode987 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXC987( ) ;
         loadXC987( ) ;
         Gx_mode = sMode987 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound987 = (short)(0) ;
         initializeNonKeyXC987( ) ;
         sMode987 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXC987( ) ;
         Gx_mode = sMode987 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesXC987( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyXC987( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRPZS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6985Mat_HdKgP, T00XC2_A6985Mat_HdKgP[0]) != 0 ) || ( Z7109Mat_Numcr != T00XC2_A7109Mat_Numcr[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6985Mat_HdKgP, T00XC2_A6985Mat_HdKgP[0]) != 0 )
            {
               GXutil.writeLogln("thdrpzs:[seudo value changed for attri]"+"Mat_HdKgP");
               GXutil.writeLogRaw("Old: ",Z6985Mat_HdKgP);
               GXutil.writeLogRaw("Current: ",T00XC2_A6985Mat_HdKgP[0]);
            }
            if ( Z7109Mat_Numcr != T00XC2_A7109Mat_Numcr[0] )
            {
               GXutil.writeLogln("thdrpzs:[seudo value changed for attri]"+"Mat_Numcr");
               GXutil.writeLogRaw("Old: ",Z7109Mat_Numcr);
               GXutil.writeLogRaw("Current: ",T00XC2_A7109Mat_Numcr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRPZS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXC987( )
   {
      beforeValidateXC987( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXC987( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXC987( 0) ;
         checkOptimisticConcurrencyXC987( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXC987( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXC987( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XC22 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz, Boolean.valueOf(n6985Mat_HdKgP), A6985Mat_HdKgP, Boolean.valueOf(n7109Mat_Numcr), Long.valueOf(A7109Mat_Numcr)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRPZS");
                  if ( (pr_default.getStatus(18) == 1) )
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
            loadXC987( ) ;
         }
         endLevelXC987( ) ;
      }
      closeExtendedTableCursorsXC987( ) ;
   }

   public void updateXC987( )
   {
      beforeValidateXC987( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXC987( ) ;
      }
      if ( ( nIsMod_987 != 0 ) || ( nIsDirty_987 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyXC987( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmXC987( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateXC987( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00XC23 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n6985Mat_HdKgP), A6985Mat_HdKgP, Boolean.valueOf(n7109Mat_Numcr), Long.valueOf(A7109Mat_Numcr), A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRPZS");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRPZS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateXC987( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyXC987( ) ;
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
            endLevelXC987( ) ;
         }
      }
      closeExtendedTableCursorsXC987( ) ;
   }

   public void deferredUpdateXC987( )
   {
   }

   public void deleteXC987( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXC987( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXC987( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXC987( ) ;
         afterConfirmXC987( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXC987( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00XC24 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A6984Mat_HdCPz});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRPZS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode987 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXC987( ) ;
      Gx_mode = sMode987 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXC987( )
   {
      standaloneModalXC987( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A6983Mat_SumPzs = (short)(O6983Mat_SumPzs+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6983Mat_SumPzs = O6983Mat_SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6983Mat_SumPzs = (short)(O6983Mat_SumPzs-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6982Mat_SumKgs = O6982Mat_SumKgs.add(A6985Mat_HdKgP).subtract(O6985Mat_HdKgP) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6982Mat_SumKgs = O6982Mat_SumKgs.subtract(O6985Mat_HdKgP) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
               }
            }
         }
      }
   }

   public void endLevelXC987( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXC987( )
   {
      /* Scan By routine */
      /* Using cursor T00XC25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      RcdFound987 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound987 = (short)(1) ;
         A6984Mat_HdCPz = T00XC25_A6984Mat_HdCPz[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXC987( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound987 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound987 = (short)(1) ;
         A6984Mat_HdCPz = T00XC25_A6984Mat_HdCPz[0] ;
      }
   }

   public void scanEndXC987( )
   {
      pr_default.close(21);
   }

   public void afterConfirmXC987( )
   {
      /* After Confirm Rules */
      if ( ( A6985Mat_HdKgP.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "MAT_HDKGP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos=0", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdKgP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertXC987( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXC987( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXC987( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXC987( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXC987( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXC987( )
   {
      edtMat_HdCPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdCPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdCPz_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMat_HdKgP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdKgP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdKgP_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtMat_Numcr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Numcr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Numcr_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashesXC987( )
   {
   }

   public void send_integrity_lvl_hashesXC985( )
   {
   }

   public void subsflControlProps_70987( )
   {
      edtavnRcdDeleted_987_Internalname = "vNRCDDELETED_987_"+sGXsfl_70_idx ;
      edtMat_HdCPz_Internalname = "MAT_HDCPZ_"+sGXsfl_70_idx ;
      edtMat_HdKgP_Internalname = "MAT_HDKGP_"+sGXsfl_70_idx ;
      edtMat_Numcr_Internalname = "MAT_NUMCR_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_70987( )
   {
      edtavnRcdDeleted_987_Internalname = "vNRCDDELETED_987_"+sGXsfl_70_fel_idx ;
      edtMat_HdCPz_Internalname = "MAT_HDCPZ_"+sGXsfl_70_fel_idx ;
      edtMat_HdKgP_Internalname = "MAT_HDKGP_"+sGXsfl_70_fel_idx ;
      edtMat_Numcr_Internalname = "MAT_NUMCR_"+sGXsfl_70_fel_idx ;
   }

   public void addRowXC987( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70987( ) ;
      sendRowXC987( ) ;
   }

   public void sendRowXC987( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_987_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_987_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_987_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_987), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_987), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_987_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_987_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_987_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdCPz_Internalname,GXutil.rtrim( A6984Mat_HdCPz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdCPz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdCPz_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_987_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdKgP_Internalname,GXutil.ltrim( localUtil.ntoc( A6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_HdKgP_Enabled!=0) ? localUtil.format( A6985Mat_HdKgP, "ZZZZZ9.99") : localUtil.format( A6985Mat_HdKgP, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdKgP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdKgP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_987_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_Numcr_Internalname,GXutil.ltrim( localUtil.ntoc( A7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_Numcr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7109Mat_Numcr), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7109Mat_Numcr), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_Numcr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_Numcr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesXC987( ) ;
      GXCCtl = "Z6984Mat_HdCPz_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6984Mat_HdCPz));
      GXCCtl = "Z6985Mat_HdKgP_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7109Mat_Numcr_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7109Mat_Numcr, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6985Mat_HdKgP_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6985Mat_HdKgP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_987_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_987_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_987_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_987, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARNUMUNI_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_987_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_987_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDCPZ_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdCPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDKGP_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdKgP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_NUMCR_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Numcr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowXC987( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70987( ) ;
      edtavnRcdDeleted_987_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_987_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdCPz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDCPZ_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdKgP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDKGP_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_Numcr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_NUMCR_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_987_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_987_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_987");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_987_Internalname ;
         wbErr = true ;
         nRcdDeleted_987 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_987 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_987_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6984Mat_HdCPz = httpContext.cgiGet( edtMat_HdCPz_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_HdKgP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_HdKgP_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_HDKGP_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdKgP_Internalname ;
         wbErr = true ;
         A6985Mat_HdKgP = DecimalUtil.ZERO ;
         n6985Mat_HdKgP = false ;
      }
      else
      {
         A6985Mat_HdKgP = localUtil.ctond( httpContext.cgiGet( edtMat_HdKgP_Internalname)) ;
         n6985Mat_HdKgP = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_Numcr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_Numcr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "MAT_NUMCR_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_Numcr_Internalname ;
         wbErr = true ;
         A7109Mat_Numcr = 0 ;
         n7109Mat_Numcr = false ;
      }
      else
      {
         A7109Mat_Numcr = localUtil.ctol( httpContext.cgiGet( edtMat_Numcr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n7109Mat_Numcr = false ;
      }
      GXCCtl = "Z6984Mat_HdCPz_" + sGXsfl_70_idx ;
      Z6984Mat_HdCPz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6985Mat_HdKgP_" + sGXsfl_70_idx ;
      Z6985Mat_HdKgP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7109Mat_Numcr_" + sGXsfl_70_idx ;
      Z7109Mat_Numcr = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "O6985Mat_HdKgP_" + sGXsfl_70_idx ;
      O6985Mat_HdKgP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_987_" + sGXsfl_70_idx ;
      nRcdDeleted_987 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_987_" + sGXsfl_70_idx ;
      nRcdExists_987 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_987_" + sGXsfl_70_idx ;
      nIsMod_987 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMat_HdCPz_Enabled = edtMat_HdCPz_Enabled ;
   }

   public void confirmValuesXC0( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_70987( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70987( ) ;
         httpContext.changePostValue( "Z6984Mat_HdCPz_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z6984Mat_HdCPz_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6984Mat_HdCPz_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z6985Mat_HdKgP_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z6985Mat_HdKgP_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6985Mat_HdKgP_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z7109Mat_Numcr_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z7109Mat_Numcr_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7109Mat_Numcr_"+sGXsfl_70_idx) ;
      }
      httpContext.changePostValue( "O6985Mat_HdKgP", httpContext.cgiGet( "T6985Mat_HdKgP")) ;
      httpContext.deletePostValue( "T6985Mat_HdKgP") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdrpzs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6965Mat_Hd", GXutil.ltrim( localUtil.ntoc( Z6965Mat_Hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6966Mat_Hdr", GXutil.ltrim( localUtil.ntoc( Z6966Mat_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6967Mat_Hdp", GXutil.rtrim( Z6967Mat_Hdp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( Z6968Mat_HdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6969Mat_HdKgs", GXutil.ltrim( localUtil.ntoc( Z6969Mat_HdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( Z6971Mat_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6982Mat_SumKgs", GXutil.ltrim( localUtil.ntoc( O6982Mat_SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6983Mat_SumPzs", GXutil.ltrim( localUtil.ntoc( O6983Mat_SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMUNI", GXutil.ltrim( localUtil.ntoc( AV33BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_P", GXutil.rtrim( AV34Msg_p));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_K", GXutil.rtrim( AV35Msg_k));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.thdrpzs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"})  ;
   }

   public String getPgmname( )
   {
      return "THDRPZS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INFORME DETALLE DE PIEZAS", "") ;
   }

   public void initializeNonKeyXC985( )
   {
      A6968Mat_HdUl = (short)(0) ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      n6969Mat_HdKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
      A6971Mat_Pzas = 0 ;
      n6971Mat_Pzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
      O6982Mat_SumKgs = A6982Mat_SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
      O6983Mat_SumPzs = A6983Mat_SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      Z6968Mat_HdUl = (short)(0) ;
      Z6969Mat_HdKgs = DecimalUtil.ZERO ;
      Z6971Mat_Pzas = 0 ;
   }

   public void initAllXC985( )
   {
      initializeNonKeyXC985( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyXC987( )
   {
      A6985Mat_HdKgP = DecimalUtil.ZERO ;
      n6985Mat_HdKgP = false ;
      A7109Mat_Numcr = 0 ;
      n7109Mat_Numcr = false ;
      O6985Mat_HdKgP = A6985Mat_HdKgP ;
      n6985Mat_HdKgP = false ;
      Z6985Mat_HdKgP = DecimalUtil.ZERO ;
      Z7109Mat_Numcr = 0 ;
   }

   public void initAllXC987( )
   {
      A6984Mat_HdCPz = "" ;
      initializeNonKeyXC987( ) ;
   }

   public void standaloneModalInsertXC987( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532293", true, true);
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
      httpContext.AddJavascriptSource("thdrpzs.js", "?20268241532293", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties987( )
   {
      edtMat_HdCPz_Enabled = defedtMat_HdCPz_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdCPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdCPz_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void startgridcontrol70( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_987, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_987_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6984Mat_HdCPz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdCPz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6985Mat_HdKgP, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdKgP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7109Mat_Numcr, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_Numcr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMat_Hd_Internalname = "MAT_HD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMat_Hdr_Internalname = "MAT_HDR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMat_Hdp_Internalname = "MAT_HDP" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMat_HdUl_Internalname = "MAT_HDUL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtMat_HdKgs_Internalname = "MAT_HDKGS" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtMat_Pzas_Internalname = "MAT_PZAS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMat_SumKgs_Internalname = "MAT_SUMKGS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMat_SumPzs_Internalname = "MAT_SUMPZS" ;
      edtavnRcdDeleted_987_Internalname = "vNRCDDELETED_987" ;
      edtMat_HdCPz_Internalname = "MAT_HDCPZ" ;
      edtMat_HdKgP_Internalname = "MAT_HDKGP" ;
      edtMat_Numcr_Internalname = "MAT_NUMCR" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "INFORME DETALLE DE PIEZAS", "") );
      edtMat_Numcr_Jsonclick = "" ;
      edtMat_HdKgP_Jsonclick = "" ;
      edtMat_HdCPz_Jsonclick = "" ;
      edtavnRcdDeleted_987_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMat_Numcr_Enabled = 1 ;
      edtMat_HdKgP_Enabled = 1 ;
      edtMat_HdCPz_Enabled = 1 ;
      edtavnRcdDeleted_987_Enabled = 1 ;
      edtMat_SumPzs_Jsonclick = "" ;
      edtMat_SumPzs_Backcolor = (int)(0xFFFFFF) ;
      edtMat_SumPzs_Enabled = 0 ;
      edtMat_SumKgs_Jsonclick = "" ;
      edtMat_SumKgs_Backcolor = (int)(0xFFFFFF) ;
      edtMat_SumKgs_Enabled = 0 ;
      edtMat_Pzas_Jsonclick = "" ;
      edtMat_Pzas_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Pzas_Enabled = 1 ;
      edtMat_HdKgs_Jsonclick = "" ;
      edtMat_HdKgs_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdKgs_Enabled = 1 ;
      edtMat_HdUl_Jsonclick = "" ;
      edtMat_HdUl_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdUl_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMat_Hdp_Jsonclick = "" ;
      edtMat_Hdp_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Hdp_Enabled = 0 ;
      edtMat_Hdr_Jsonclick = "" ;
      edtMat_Hdr_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Hdr_Enabled = 0 ;
      edtMat_Hd_Jsonclick = "" ;
      edtMat_Hd_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Hd_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_70987( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalXC987( ) ;
         standaloneModalXC987( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowXC987( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_70987( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
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
      /* Using cursor T00XC26 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XC26_A407EmprNom[0] ;
      n407EmprNom = T00XC26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T00XC28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A6982Mat_SumKgs = T00XC28_A6982Mat_SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = T00XC28_A6983Mat_SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      else
      {
         A6982Mat_SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrimstr( A6982Mat_SumKgs, 9, 2));
         A6983Mat_SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6983Mat_SumPzs), 4, 0));
      }
      pr_default.close(23);
      GX_FocusControl = edtMat_HdUl_Internalname ;
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

   public void valid_Mat_hdp( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( A6968Mat_HdUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrim( localUtil.ntoc( A6969Mat_HdKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( A6971Mat_Pzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6982Mat_SumKgs", GXutil.ltrim( localUtil.ntoc( A6982Mat_SumKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6983Mat_SumPzs", GXutil.ltrim( localUtil.ntoc( A6983Mat_SumPzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6965Mat_Hd", GXutil.ltrim( localUtil.ntoc( Z6965Mat_Hd, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6966Mat_Hdr", GXutil.ltrim( localUtil.ntoc( Z6966Mat_Hdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6967Mat_Hdp", GXutil.rtrim( Z6967Mat_Hdp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( Z6968Mat_HdUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6969Mat_HdKgs", GXutil.ltrim( localUtil.ntoc( Z6969Mat_HdKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( Z6971Mat_Pzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6982Mat_SumKgs", GXutil.ltrim( localUtil.ntoc( Z6982Mat_SumKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6983Mat_SumPzs", GXutil.ltrim( localUtil.ntoc( Z6983Mat_SumPzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6982Mat_SumKgs", GXutil.ltrim( localUtil.ntoc( O6982Mat_SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O6983Mat_SumPzs", GXutil.ltrim( localUtil.ntoc( O6983Mat_SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAT_HD","{handler:'valid_Mat_hd',iparms:[]");
      setEventMetadata("VALID_MAT_HD",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDR","{handler:'valid_Mat_hdr',iparms:[]");
      setEventMetadata("VALID_MAT_HDR",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDP","{handler:'valid_Mat_hdp',iparms:[{av:'AV35Msg_k',fld:'vMSG_K',pic:''},{av:'AV34Msg_p',fld:'vMSG_P',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAT_HDP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A6968Mat_HdUl',fld:'MAT_HDUL',pic:'ZZZ9'},{av:'A6969Mat_HdKgs',fld:'MAT_HDKGS',pic:'ZZZZZ9.99'},{av:'A6971Mat_Pzas',fld:'MAT_PZAS',pic:'ZZZ9'},{av:'A6982Mat_SumKgs',fld:'MAT_SUMKGS',pic:'ZZZZZ9.99'},{av:'A6983Mat_SumPzs',fld:'MAT_SUMPZS',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6965Mat_Hd'},{av:'Z6966Mat_Hdr'},{av:'Z6967Mat_Hdp'},{av:'Z407EmprNom'},{av:'Z6968Mat_HdUl'},{av:'Z6969Mat_HdKgs'},{av:'Z6971Mat_Pzas'},{av:'Z6982Mat_SumKgs'},{av:'Z6983Mat_SumPzs'},{av:'O6982Mat_SumKgs'},{av:'O6983Mat_SumPzs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAT_HDKGS","{handler:'valid_Mat_hdkgs',iparms:[]");
      setEventMetadata("VALID_MAT_HDKGS",",oparms:[]}");
      setEventMetadata("VALID_MAT_PZAS","{handler:'valid_Mat_pzas',iparms:[]");
      setEventMetadata("VALID_MAT_PZAS",",oparms:[]}");
      setEventMetadata("VALID_MAT_SUMKGS","{handler:'valid_Mat_sumkgs',iparms:[]");
      setEventMetadata("VALID_MAT_SUMKGS",",oparms:[]}");
      setEventMetadata("VALID_MAT_SUMPZS","{handler:'valid_Mat_sumpzs',iparms:[]");
      setEventMetadata("VALID_MAT_SUMPZS",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDCPZ","{handler:'valid_Mat_hdcpz',iparms:[]");
      setEventMetadata("VALID_MAT_HDCPZ",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDKGP","{handler:'valid_Mat_hdkgp',iparms:[]");
      setEventMetadata("VALID_MAT_HDKGP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mat_numcr',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA6967Mat_Hdp = "" ;
      wcpOAV33BarNumUni = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z6967Mat_Hdp = "" ;
      Z6969Mat_HdKgs = DecimalUtil.ZERO ;
      O6982Mat_SumKgs = DecimalUtil.ZERO ;
      Z6984Mat_HdCPz = "" ;
      Z6985Mat_HdKgP = DecimalUtil.ZERO ;
      O6985Mat_HdKgP = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6967Mat_Hdp = "" ;
      AV33BarNumUni = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
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
      lblTextblock7_Jsonclick = "" ;
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A6982Mat_SumKgs = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B6982Mat_SumKgs = DecimalUtil.ZERO ;
      sMode987 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Msg_p = "" ;
      AV35Msg_k = "" ;
      AV36Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode985 = "" ;
      s6982Mat_SumKgs = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A6984Mat_HdCPz = "" ;
      A6985Mat_HdKgP = DecimalUtil.ZERO ;
      T6985Mat_HdKgP = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z6982Mat_SumKgs = DecimalUtil.ZERO ;
      T00XC6_A407EmprNom = new String[] {""} ;
      T00XC6_n407EmprNom = new boolean[] {false} ;
      T00XC8_A6982Mat_SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC8_A6983Mat_SumPzs = new short[1] ;
      T00XC10_A6965Mat_Hd = new int[1] ;
      T00XC10_A6966Mat_Hdr = new byte[1] ;
      T00XC10_A6967Mat_Hdp = new String[] {""} ;
      T00XC10_A407EmprNom = new String[] {""} ;
      T00XC10_n407EmprNom = new boolean[] {false} ;
      T00XC10_A6968Mat_HdUl = new short[1] ;
      T00XC10_n6968Mat_HdUl = new boolean[] {false} ;
      T00XC10_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC10_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XC10_A6971Mat_Pzas = new int[1] ;
      T00XC10_n6971Mat_Pzas = new boolean[] {false} ;
      T00XC10_A396EmprCod = new String[] {""} ;
      T00XC10_A6982Mat_SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC10_A6983Mat_SumPzs = new short[1] ;
      T00XC11_A396EmprCod = new String[] {""} ;
      T00XC11_A6965Mat_Hd = new int[1] ;
      T00XC11_A6966Mat_Hdr = new byte[1] ;
      T00XC11_A6967Mat_Hdp = new String[] {""} ;
      T00XC5_A6965Mat_Hd = new int[1] ;
      T00XC5_A6966Mat_Hdr = new byte[1] ;
      T00XC5_A6967Mat_Hdp = new String[] {""} ;
      T00XC5_A6968Mat_HdUl = new short[1] ;
      T00XC5_n6968Mat_HdUl = new boolean[] {false} ;
      T00XC5_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC5_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XC5_A6971Mat_Pzas = new int[1] ;
      T00XC5_n6971Mat_Pzas = new boolean[] {false} ;
      T00XC5_A396EmprCod = new String[] {""} ;
      T00XC12_A396EmprCod = new String[] {""} ;
      T00XC12_A6965Mat_Hd = new int[1] ;
      T00XC12_A6966Mat_Hdr = new byte[1] ;
      T00XC12_A6967Mat_Hdp = new String[] {""} ;
      T00XC13_A396EmprCod = new String[] {""} ;
      T00XC13_A6965Mat_Hd = new int[1] ;
      T00XC13_A6966Mat_Hdr = new byte[1] ;
      T00XC13_A6967Mat_Hdp = new String[] {""} ;
      T00XC4_A6965Mat_Hd = new int[1] ;
      T00XC4_A6966Mat_Hdr = new byte[1] ;
      T00XC4_A6967Mat_Hdp = new String[] {""} ;
      T00XC4_A6968Mat_HdUl = new short[1] ;
      T00XC4_n6968Mat_HdUl = new boolean[] {false} ;
      T00XC4_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC4_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XC4_A6971Mat_Pzas = new int[1] ;
      T00XC4_n6971Mat_Pzas = new boolean[] {false} ;
      T00XC4_A396EmprCod = new String[] {""} ;
      T00XC17_A396EmprCod = new String[] {""} ;
      T00XC17_A6965Mat_Hd = new int[1] ;
      T00XC17_A6966Mat_Hdr = new byte[1] ;
      T00XC17_A6967Mat_Hdp = new String[] {""} ;
      T00XC17_A7007Mat_HdTl = new String[] {""} ;
      T00XC18_A396EmprCod = new String[] {""} ;
      T00XC18_A6965Mat_Hd = new int[1] ;
      T00XC18_A6966Mat_Hdr = new byte[1] ;
      T00XC18_A6967Mat_Hdp = new String[] {""} ;
      T00XC18_A6972Mat_HdLin = new short[1] ;
      T00XC19_A396EmprCod = new String[] {""} ;
      T00XC19_A6965Mat_Hd = new int[1] ;
      T00XC19_A6966Mat_Hdr = new byte[1] ;
      T00XC19_A6967Mat_Hdp = new String[] {""} ;
      T00XC20_A396EmprCod = new String[] {""} ;
      T00XC20_A6965Mat_Hd = new int[1] ;
      T00XC20_A6966Mat_Hdr = new byte[1] ;
      T00XC20_A6967Mat_Hdp = new String[] {""} ;
      T00XC20_A6984Mat_HdCPz = new String[] {""} ;
      T00XC20_A6985Mat_HdKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC20_n6985Mat_HdKgP = new boolean[] {false} ;
      T00XC20_A7109Mat_Numcr = new long[1] ;
      T00XC20_n7109Mat_Numcr = new boolean[] {false} ;
      T00XC21_A396EmprCod = new String[] {""} ;
      T00XC21_A6965Mat_Hd = new int[1] ;
      T00XC21_A6966Mat_Hdr = new byte[1] ;
      T00XC21_A6967Mat_Hdp = new String[] {""} ;
      T00XC21_A6984Mat_HdCPz = new String[] {""} ;
      T00XC3_A396EmprCod = new String[] {""} ;
      T00XC3_A6965Mat_Hd = new int[1] ;
      T00XC3_A6966Mat_Hdr = new byte[1] ;
      T00XC3_A6967Mat_Hdp = new String[] {""} ;
      T00XC3_A6984Mat_HdCPz = new String[] {""} ;
      T00XC3_A6985Mat_HdKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC3_n6985Mat_HdKgP = new boolean[] {false} ;
      T00XC3_A7109Mat_Numcr = new long[1] ;
      T00XC3_n7109Mat_Numcr = new boolean[] {false} ;
      T00XC2_A396EmprCod = new String[] {""} ;
      T00XC2_A6965Mat_Hd = new int[1] ;
      T00XC2_A6966Mat_Hdr = new byte[1] ;
      T00XC2_A6967Mat_Hdp = new String[] {""} ;
      T00XC2_A6984Mat_HdCPz = new String[] {""} ;
      T00XC2_A6985Mat_HdKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC2_n6985Mat_HdKgP = new boolean[] {false} ;
      T00XC2_A7109Mat_Numcr = new long[1] ;
      T00XC2_n7109Mat_Numcr = new boolean[] {false} ;
      T00XC25_A396EmprCod = new String[] {""} ;
      T00XC25_A6965Mat_Hd = new int[1] ;
      T00XC25_A6966Mat_Hdr = new byte[1] ;
      T00XC25_A6967Mat_Hdp = new String[] {""} ;
      T00XC25_A6984Mat_HdCPz = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00XC26_A407EmprNom = new String[] {""} ;
      T00XC26_n407EmprNom = new boolean[] {false} ;
      T00XC28_A6982Mat_SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XC28_A6983Mat_SumPzs = new short[1] ;
      ZZ396EmprCod = "" ;
      ZZ6967Mat_Hdp = "" ;
      ZZ407EmprNom = "" ;
      ZZ6969Mat_HdKgs = DecimalUtil.ZERO ;
      ZZ6982Mat_SumKgs = DecimalUtil.ZERO ;
      ZO6982Mat_SumKgs = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdrpzs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdrpzs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdrpzs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdrpzs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdrpzs__default(),
         new Object[] {
             new Object[] {
            T00XC2_A396EmprCod, T00XC2_A6965Mat_Hd, T00XC2_A6966Mat_Hdr, T00XC2_A6967Mat_Hdp, T00XC2_A6984Mat_HdCPz, T00XC2_A6985Mat_HdKgP, T00XC2_n6985Mat_HdKgP, T00XC2_A7109Mat_Numcr, T00XC2_n7109Mat_Numcr
            }
            , new Object[] {
            T00XC3_A396EmprCod, T00XC3_A6965Mat_Hd, T00XC3_A6966Mat_Hdr, T00XC3_A6967Mat_Hdp, T00XC3_A6984Mat_HdCPz, T00XC3_A6985Mat_HdKgP, T00XC3_n6985Mat_HdKgP, T00XC3_A7109Mat_Numcr, T00XC3_n7109Mat_Numcr
            }
            , new Object[] {
            T00XC4_A6965Mat_Hd, T00XC4_A6966Mat_Hdr, T00XC4_A6967Mat_Hdp, T00XC4_A6968Mat_HdUl, T00XC4_n6968Mat_HdUl, T00XC4_A6969Mat_HdKgs, T00XC4_n6969Mat_HdKgs, T00XC4_A6971Mat_Pzas, T00XC4_n6971Mat_Pzas, T00XC4_A396EmprCod
            }
            , new Object[] {
            T00XC5_A6965Mat_Hd, T00XC5_A6966Mat_Hdr, T00XC5_A6967Mat_Hdp, T00XC5_A6968Mat_HdUl, T00XC5_n6968Mat_HdUl, T00XC5_A6969Mat_HdKgs, T00XC5_n6969Mat_HdKgs, T00XC5_A6971Mat_Pzas, T00XC5_n6971Mat_Pzas, T00XC5_A396EmprCod
            }
            , new Object[] {
            T00XC6_A407EmprNom, T00XC6_n407EmprNom
            }
            , new Object[] {
            T00XC8_A6982Mat_SumKgs, T00XC8_A6983Mat_SumPzs
            }
            , new Object[] {
            T00XC10_A6965Mat_Hd, T00XC10_A6966Mat_Hdr, T00XC10_A6967Mat_Hdp, T00XC10_A407EmprNom, T00XC10_n407EmprNom, T00XC10_A6968Mat_HdUl, T00XC10_n6968Mat_HdUl, T00XC10_A6969Mat_HdKgs, T00XC10_n6969Mat_HdKgs, T00XC10_A6971Mat_Pzas,
            T00XC10_n6971Mat_Pzas, T00XC10_A396EmprCod, T00XC10_A6982Mat_SumKgs, T00XC10_A6983Mat_SumPzs
            }
            , new Object[] {
            T00XC11_A396EmprCod, T00XC11_A6965Mat_Hd, T00XC11_A6966Mat_Hdr, T00XC11_A6967Mat_Hdp
            }
            , new Object[] {
            T00XC12_A396EmprCod, T00XC12_A6965Mat_Hd, T00XC12_A6966Mat_Hdr, T00XC12_A6967Mat_Hdp
            }
            , new Object[] {
            T00XC13_A396EmprCod, T00XC13_A6965Mat_Hd, T00XC13_A6966Mat_Hdr, T00XC13_A6967Mat_Hdp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XC17_A396EmprCod, T00XC17_A6965Mat_Hd, T00XC17_A6966Mat_Hdr, T00XC17_A6967Mat_Hdp, T00XC17_A7007Mat_HdTl
            }
            , new Object[] {
            T00XC18_A396EmprCod, T00XC18_A6965Mat_Hd, T00XC18_A6966Mat_Hdr, T00XC18_A6967Mat_Hdp, T00XC18_A6972Mat_HdLin
            }
            , new Object[] {
            T00XC19_A396EmprCod, T00XC19_A6965Mat_Hd, T00XC19_A6966Mat_Hdr, T00XC19_A6967Mat_Hdp
            }
            , new Object[] {
            T00XC20_A396EmprCod, T00XC20_A6965Mat_Hd, T00XC20_A6966Mat_Hdr, T00XC20_A6967Mat_Hdp, T00XC20_A6984Mat_HdCPz, T00XC20_A6985Mat_HdKgP, T00XC20_n6985Mat_HdKgP, T00XC20_A7109Mat_Numcr, T00XC20_n7109Mat_Numcr
            }
            , new Object[] {
            T00XC21_A396EmprCod, T00XC21_A6965Mat_Hd, T00XC21_A6966Mat_Hdr, T00XC21_A6967Mat_Hdp, T00XC21_A6984Mat_HdCPz
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XC25_A396EmprCod, T00XC25_A6965Mat_Hd, T00XC25_A6966Mat_Hdr, T00XC25_A6967Mat_Hdp, T00XC25_A6984Mat_HdCPz
            }
            , new Object[] {
            T00XC26_A407EmprNom, T00XC26_n407EmprNom
            }
            , new Object[] {
            T00XC28_A6982Mat_SumKgs, T00XC28_A6983Mat_SumPzs
            }
         }
      );
      Z6967Mat_Hdp = "" ;
      A6967Mat_Hdp = "" ;
      Z6966Mat_Hdr = (byte)(0) ;
      A6966Mat_Hdr = (byte)(0) ;
      Z6965Mat_Hd = 0 ;
      A6965Mat_Hd = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "THDRPZS" ;
   }

   private byte wcpOA6966Mat_Hdr ;
   private byte Z6966Mat_Hdr ;
   private byte GxWebError ;
   private byte A6966Mat_Hdr ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ6966Mat_Hdr ;
   private short Z6968Mat_HdUl ;
   private short O6983Mat_SumPzs ;
   private short nRcdDeleted_987 ;
   private short nRcdExists_987 ;
   private short nIsMod_987 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6968Mat_HdUl ;
   private short A6983Mat_SumPzs ;
   private short nBlankRcdCount987 ;
   private short RcdFound987 ;
   private short B6983Mat_SumPzs ;
   private short nBlankRcdUsr987 ;
   private short s6983Mat_SumPzs ;
   private short Z6983Mat_SumPzs ;
   private short RcdFound985 ;
   private short nIsDirty_985 ;
   private short nIsDirty_987 ;
   private short ZZ6968Mat_HdUl ;
   private short ZZ6983Mat_SumPzs ;
   private short ZO6983Mat_SumPzs ;
   private int wcpOA6965Mat_Hd ;
   private int Z6965Mat_Hd ;
   private int Z6971Mat_Pzas ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A6965Mat_Hd ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMat_Hd_Enabled ;
   private int edtMat_Hdr_Enabled ;
   private int edtMat_Hdp_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMat_HdUl_Enabled ;
   private int edtMat_HdKgs_Enabled ;
   private int A6971Mat_Pzas ;
   private int edtMat_Pzas_Enabled ;
   private int edtMat_SumKgs_Enabled ;
   private int edtMat_SumPzs_Enabled ;
   private int edtavnRcdDeleted_987_Enabled ;
   private int edtMat_HdCPz_Enabled ;
   private int edtMat_HdKgP_Enabled ;
   private int edtMat_Numcr_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMat_HdCPz_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMat_SumPzs_Backcolor ;
   private int edtMat_SumKgs_Backcolor ;
   private int edtMat_Pzas_Backcolor ;
   private int edtMat_HdKgs_Backcolor ;
   private int edtMat_HdUl_Backcolor ;
   private int edtMat_Hdp_Backcolor ;
   private int edtMat_Hdr_Backcolor ;
   private int edtMat_Hd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ6965Mat_Hd ;
   private int ZZ6971Mat_Pzas ;
   private long Z7109Mat_Numcr ;
   private long GRID1_nFirstRecordOnPage ;
   private long A7109Mat_Numcr ;
   private java.math.BigDecimal wcpOAV33BarNumUni ;
   private java.math.BigDecimal Z6969Mat_HdKgs ;
   private java.math.BigDecimal O6982Mat_SumKgs ;
   private java.math.BigDecimal Z6985Mat_HdKgP ;
   private java.math.BigDecimal O6985Mat_HdKgP ;
   private java.math.BigDecimal AV33BarNumUni ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private java.math.BigDecimal A6982Mat_SumKgs ;
   private java.math.BigDecimal B6982Mat_SumKgs ;
   private java.math.BigDecimal s6982Mat_SumKgs ;
   private java.math.BigDecimal A6985Mat_HdKgP ;
   private java.math.BigDecimal T6985Mat_HdKgP ;
   private java.math.BigDecimal Z6982Mat_SumKgs ;
   private java.math.BigDecimal ZZ6969Mat_HdKgs ;
   private java.math.BigDecimal ZZ6982Mat_SumKgs ;
   private java.math.BigDecimal ZO6982Mat_SumKgs ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA6967Mat_Hdp ;
   private String Z396EmprCod ;
   private String Z6967Mat_Hdp ;
   private String Z6984Mat_HdCPz ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6967Mat_Hdp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMat_HdUl_Internalname ;
   private String sGXsfl_70_idx="0001" ;
   private String Gx_mode ;
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
   private String edtMat_Hd_Internalname ;
   private String edtMat_Hd_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMat_Hdr_Internalname ;
   private String edtMat_Hdr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMat_Hdp_Internalname ;
   private String edtMat_Hdp_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtMat_HdUl_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMat_HdKgs_Internalname ;
   private String edtMat_HdKgs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMat_Pzas_Internalname ;
   private String edtMat_Pzas_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMat_SumKgs_Internalname ;
   private String edtMat_SumKgs_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMat_SumPzs_Internalname ;
   private String edtMat_SumPzs_Jsonclick ;
   private String sMode987 ;
   private String edtavnRcdDeleted_987_Internalname ;
   private String edtMat_HdCPz_Internalname ;
   private String edtMat_HdKgP_Internalname ;
   private String edtMat_Numcr_Internalname ;
   private String subGrid1_Internalname ;
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
   private String AV34Msg_p ;
   private String AV35Msg_k ;
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode985 ;
   private String GXCCtl ;
   private String A6984Mat_HdCPz ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_987_Jsonclick ;
   private String edtMat_HdCPz_Jsonclick ;
   private String edtMat_HdKgP_Jsonclick ;
   private String edtMat_Numcr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6967Mat_Hdp ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6968Mat_HdUl ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6971Mat_Pzas ;
   private boolean returnInSub ;
   private boolean n6985Mat_HdKgP ;
   private boolean n7109Mat_Numcr ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00XC6_A407EmprNom ;
   private boolean[] T00XC6_n407EmprNom ;
   private java.math.BigDecimal[] T00XC8_A6982Mat_SumKgs ;
   private short[] T00XC8_A6983Mat_SumPzs ;
   private int[] T00XC10_A6965Mat_Hd ;
   private byte[] T00XC10_A6966Mat_Hdr ;
   private String[] T00XC10_A6967Mat_Hdp ;
   private String[] T00XC10_A407EmprNom ;
   private boolean[] T00XC10_n407EmprNom ;
   private short[] T00XC10_A6968Mat_HdUl ;
   private boolean[] T00XC10_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XC10_A6969Mat_HdKgs ;
   private boolean[] T00XC10_n6969Mat_HdKgs ;
   private int[] T00XC10_A6971Mat_Pzas ;
   private boolean[] T00XC10_n6971Mat_Pzas ;
   private String[] T00XC10_A396EmprCod ;
   private java.math.BigDecimal[] T00XC10_A6982Mat_SumKgs ;
   private short[] T00XC10_A6983Mat_SumPzs ;
   private String[] T00XC11_A396EmprCod ;
   private int[] T00XC11_A6965Mat_Hd ;
   private byte[] T00XC11_A6966Mat_Hdr ;
   private String[] T00XC11_A6967Mat_Hdp ;
   private int[] T00XC5_A6965Mat_Hd ;
   private byte[] T00XC5_A6966Mat_Hdr ;
   private String[] T00XC5_A6967Mat_Hdp ;
   private short[] T00XC5_A6968Mat_HdUl ;
   private boolean[] T00XC5_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XC5_A6969Mat_HdKgs ;
   private boolean[] T00XC5_n6969Mat_HdKgs ;
   private int[] T00XC5_A6971Mat_Pzas ;
   private boolean[] T00XC5_n6971Mat_Pzas ;
   private String[] T00XC5_A396EmprCod ;
   private String[] T00XC12_A396EmprCod ;
   private int[] T00XC12_A6965Mat_Hd ;
   private byte[] T00XC12_A6966Mat_Hdr ;
   private String[] T00XC12_A6967Mat_Hdp ;
   private String[] T00XC13_A396EmprCod ;
   private int[] T00XC13_A6965Mat_Hd ;
   private byte[] T00XC13_A6966Mat_Hdr ;
   private String[] T00XC13_A6967Mat_Hdp ;
   private int[] T00XC4_A6965Mat_Hd ;
   private byte[] T00XC4_A6966Mat_Hdr ;
   private String[] T00XC4_A6967Mat_Hdp ;
   private short[] T00XC4_A6968Mat_HdUl ;
   private boolean[] T00XC4_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XC4_A6969Mat_HdKgs ;
   private boolean[] T00XC4_n6969Mat_HdKgs ;
   private int[] T00XC4_A6971Mat_Pzas ;
   private boolean[] T00XC4_n6971Mat_Pzas ;
   private String[] T00XC4_A396EmprCod ;
   private String[] T00XC17_A396EmprCod ;
   private int[] T00XC17_A6965Mat_Hd ;
   private byte[] T00XC17_A6966Mat_Hdr ;
   private String[] T00XC17_A6967Mat_Hdp ;
   private String[] T00XC17_A7007Mat_HdTl ;
   private String[] T00XC18_A396EmprCod ;
   private int[] T00XC18_A6965Mat_Hd ;
   private byte[] T00XC18_A6966Mat_Hdr ;
   private String[] T00XC18_A6967Mat_Hdp ;
   private short[] T00XC18_A6972Mat_HdLin ;
   private String[] T00XC19_A396EmprCod ;
   private int[] T00XC19_A6965Mat_Hd ;
   private byte[] T00XC19_A6966Mat_Hdr ;
   private String[] T00XC19_A6967Mat_Hdp ;
   private String[] T00XC20_A396EmprCod ;
   private int[] T00XC20_A6965Mat_Hd ;
   private byte[] T00XC20_A6966Mat_Hdr ;
   private String[] T00XC20_A6967Mat_Hdp ;
   private String[] T00XC20_A6984Mat_HdCPz ;
   private java.math.BigDecimal[] T00XC20_A6985Mat_HdKgP ;
   private boolean[] T00XC20_n6985Mat_HdKgP ;
   private long[] T00XC20_A7109Mat_Numcr ;
   private boolean[] T00XC20_n7109Mat_Numcr ;
   private String[] T00XC21_A396EmprCod ;
   private int[] T00XC21_A6965Mat_Hd ;
   private byte[] T00XC21_A6966Mat_Hdr ;
   private String[] T00XC21_A6967Mat_Hdp ;
   private String[] T00XC21_A6984Mat_HdCPz ;
   private String[] T00XC3_A396EmprCod ;
   private int[] T00XC3_A6965Mat_Hd ;
   private byte[] T00XC3_A6966Mat_Hdr ;
   private String[] T00XC3_A6967Mat_Hdp ;
   private String[] T00XC3_A6984Mat_HdCPz ;
   private java.math.BigDecimal[] T00XC3_A6985Mat_HdKgP ;
   private boolean[] T00XC3_n6985Mat_HdKgP ;
   private long[] T00XC3_A7109Mat_Numcr ;
   private boolean[] T00XC3_n7109Mat_Numcr ;
   private String[] T00XC2_A396EmprCod ;
   private int[] T00XC2_A6965Mat_Hd ;
   private byte[] T00XC2_A6966Mat_Hdr ;
   private String[] T00XC2_A6967Mat_Hdp ;
   private String[] T00XC2_A6984Mat_HdCPz ;
   private java.math.BigDecimal[] T00XC2_A6985Mat_HdKgP ;
   private boolean[] T00XC2_n6985Mat_HdKgP ;
   private long[] T00XC2_A7109Mat_Numcr ;
   private boolean[] T00XC2_n7109Mat_Numcr ;
   private String[] T00XC25_A396EmprCod ;
   private int[] T00XC25_A6965Mat_Hd ;
   private byte[] T00XC25_A6966Mat_Hdr ;
   private String[] T00XC25_A6967Mat_Hdp ;
   private String[] T00XC25_A6984Mat_HdCPz ;
   private String[] T00XC26_A407EmprNom ;
   private boolean[] T00XC26_n407EmprNom ;
   private java.math.BigDecimal[] T00XC28_A6982Mat_SumKgs ;
   private short[] T00XC28_A6983Mat_SumPzs ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdrpzs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrpzs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrpzs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrpzs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrpzs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00XC2", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz, Mat_HdKgP, Mat_Numcr FROM TXPHDRPZS WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdCPz = ?  FOR UPDATE OF Mat_HdKgP, Mat_Numcr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XC3", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz, Mat_HdKgP, Mat_Numcr FROM TXPHDRPZS WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdCPz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XC4", "SELECT Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_Pzas, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?  FOR UPDATE OF Mat_HdUl, Mat_HdKgs, Mat_Pzas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC5", "SELECT Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_Pzas, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC8", "SELECT COALESCE( T1.Mat_SumKgs, 0) AS Mat_SumKgs, COALESCE( T1.Mat_SumPzs, 0) AS Mat_SumPzs FROM (SELECT SUM(Mat_HdKgP) AS Mat_SumKgs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, COUNT(*) AS Mat_SumPzs FROM TXPHDRPZS GROUP BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ) T1 WHERE T1.EmprCod = ? AND T1.Mat_Hd = ? AND T1.Mat_Hdr = ? AND T1.Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC10", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mat_Hd, TM1.Mat_Hdr, TM1.Mat_Hdp, T2.EmprNom, TM1.Mat_HdUl, TM1.Mat_HdKgs, TM1.Mat_Pzas, TM1.EmprCod, COALESCE( T3.Mat_SumKgs, 0) AS Mat_SumKgs, COALESCE( T3.Mat_SumPzs, 0) AS Mat_SumPzs FROM ((TXPHDRMAT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(Mat_HdKgP) AS Mat_SumKgs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, COUNT(*) AS Mat_SumPzs FROM TXPHDRPZS GROUP BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.Mat_Hd = TM1.Mat_Hd AND T3.Mat_Hdr = TM1.Mat_Hdr AND T3.Mat_Hdp = TM1.Mat_Hdp) WHERE TM1.EmprCod = ? and TM1.Mat_Hd = ? and TM1.Mat_Hdr = ? and TM1.Mat_Hdp = ? ORDER BY TM1.EmprCod, TM1.Mat_Hd, TM1.Mat_Hdr, TM1.Mat_Hdp ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod DESC, Mat_Hd DESC, Mat_Hdr DESC, Mat_Hdp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XC14", "INSERT INTO TXPHDRMAT(Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_Pzas, EmprCod, Mat_HdGuia, Mat_HdKPr, Mat_FecIng) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPHDRMAT")
         ,new UpdateCursor("T00XC15", "UPDATE TXPHDRMAT SET Mat_HdUl=?, Mat_HdKgs=?, Mat_Pzas=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK, "TXPHDRMAT")
         ,new UpdateCursor("T00XC16", "DELETE FROM TXPHDRMAT  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK, "TXPHDRMAT")
         ,new ForEachCursor("T00XC17", "SELECT * FROM (SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl FROM TXPHDRTAL WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC18", "SELECT * FROM (SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XC20", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz, Mat_HdKgP, Mat_Numcr FROM TXPHDRPZS WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? and Mat_HdCPz = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XC21", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz FROM TXPHDRPZS WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdCPz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00XC22", "INSERT INTO TXPHDRPZS(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz, Mat_HdKgP, Mat_Numcr) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRPZS")
         ,new UpdateCursor("T00XC23", "UPDATE TXPHDRPZS SET Mat_HdKgP=?, Mat_Numcr=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdCPz = ?", GX_NOMASK, "TXPHDRPZS")
         ,new UpdateCursor("T00XC24", "DELETE FROM TXPHDRPZS  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdCPz = ?", GX_NOMASK, "TXPHDRPZS")
         ,new ForEachCursor("T00XC25", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz FROM TXPHDRPZS WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XC26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XC28", "SELECT COALESCE( T1.Mat_SumKgs, 0) AS Mat_SumKgs, COALESCE( T1.Mat_SumPzs, 0) AS Mat_SumPzs FROM (SELECT SUM(Mat_HdKgP) AS Mat_SumKgs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, COUNT(*) AS Mat_SumPzs FROM TXPHDRPZS GROUP BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ) T1 WHERE T1.EmprCod = ? AND T1.Mat_Hd = ? AND T1.Mat_Hdr = ? AND T1.Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               stmt.setString(7, (String)parms[9], 3);
               return;
            case 11 :
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[8]).longValue());
               }
               return;
            case 19 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[3]).longValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setString(7, (String)parms[8], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

