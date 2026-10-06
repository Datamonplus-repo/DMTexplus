package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdrmat_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action10") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_10_XB986( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_XB986( ) ;
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
            AV34BarSer = httpContext.GetPar( "BarSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarSer", AV34BarSer);
            AV35BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarSerDsc", AV35BarSerDsc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MATERIALES EN HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMat_HdKgs_Internalname ;
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
      nRC_GXsfl_75 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_75"))) ;
      nGXsfl_75_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_75_idx"))) ;
      sGXsfl_75_idx = httpContext.GetPar( "sGXsfl_75_idx") ;
      A6968Mat_HdUl = (short)(GXutil.lval( httpContext.GetPar( "Mat_HdUl"))) ;
      n6968Mat_HdUl = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public thdrmat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdrmat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdrmat_impl.class ));
   }

   public thdrmat_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THDRMAT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hd_Internalname, GXutil.ltrim( localUtil.ntoc( A6965Mat_Hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Hd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6965Mat_Hd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6965Mat_Hd), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hd_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hd_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A6966Mat_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6966Mat_Hdr), "9") : localUtil.format( DecimalUtil.doubleToDec(A6966Mat_Hdr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hdr_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hdr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Hdp_Internalname, GXutil.rtrim( A6967Mat_Hdp), GXutil.rtrim( localUtil.format( A6967Mat_Hdp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Hdp_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Hdp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdUl_Internalname, GXutil.ltrim( localUtil.ntoc( A6968Mat_HdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_HdUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6968Mat_HdUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6968Mat_HdUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdUl_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Kgs Pesados", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A6969Mat_HdKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_HdKgs_Enabled!=0) ? localUtil.format( A6969Mat_HdKgs, "ZZZZZ9.99") : localUtil.format( A6969Mat_HdKgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdKgs_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nº Guia", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdGuia_Internalname, GXutil.rtrim( A6970Mat_HdGuia), GXutil.rtrim( localUtil.format( A6970Mat_HdGuia, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdGuia_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdGuia_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_Pzas_Internalname, GXutil.ltrim( localUtil.ntoc( A6971Mat_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_Pzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6971Mat_Pzas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6971Mat_Pzas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_Pzas_Jsonclick, 0, "", "", "", "", "", 1, edtMat_Pzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Kgs programados", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_HdKPr_Internalname, GXutil.ltrim( localUtil.ntoc( A7396Mat_HdKPr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMat_HdKPr_Enabled!=0) ? localUtil.format( A7396Mat_HdKPr, "ZZZZZ9.99") : localUtil.format( A7396Mat_HdKPr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_HdKPr_Jsonclick, 0, "", "", "", "", "", 1, edtMat_HdKPr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Ingreso Materiales", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THDRMAT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMat_FecIng_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMat_FecIng_Internalname, localUtil.format(A7397Mat_FecIng, "99/99/99"), localUtil.format( A7397Mat_FecIng, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMat_FecIng_Jsonclick, 0, "", "", "", "", "", 1, edtMat_FecIng_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDRMAT.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMat_FecIng_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMat_FecIng_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THDRMAT.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol75( ) ;
      nGXsfl_75_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount986 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_986 = (short)(1) ;
            scanStartXB986( ) ;
            while ( RcdFound986 != 0 )
            {
               init_level_properties986( ) ;
               getByPrimaryKeyXB986( ) ;
               addRowXB986( ) ;
               scanNextXB986( ) ;
            }
            scanEndXB986( ) ;
            nBlankRcdCount986 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6968Mat_HdUl = A6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         standaloneNotModalXB986( ) ;
         standaloneModalXB986( ) ;
         sMode986 = Gx_mode ;
         while ( nGXsfl_75_idx < nRC_GXsfl_75 )
         {
            bGXsfl_75_Refreshing = true ;
            readRowXB986( ) ;
            edtavnRcdDeleted_986_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_986_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_986_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_986_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDEST_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdEst_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDMAT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdMat_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdTor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDTOR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdTor_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdNomc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDNOMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdNomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdNomc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdProv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDPROV_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdProv_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLOTE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLote_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdPorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDPORC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdPorc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdLm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_HdObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDOBS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_HdObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdObs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_MaqTej_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_MAQTEJ_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_MaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_MaqTej_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_CliRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_CLIRM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_CliRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_CliRm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_TraInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_TRAINT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_TraInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_TraInt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            edtMat_RecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_RECM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMat_RecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_RecM_Enabled), 5, 0), !bGXsfl_75_Refreshing);
            if ( ( nRcdExists_986 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalXB986( ) ;
            }
            sendRowXB986( ) ;
            bGXsfl_75_Refreshing = false ;
         }
         Gx_mode = sMode986 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6968Mat_HdUl = B6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount986 = (short)(5) ;
         nRcdExists_986 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartXB986( ) ;
            while ( RcdFound986 != 0 )
            {
               sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_75986( ) ;
               init_level_properties986( ) ;
               standaloneNotModalXB986( ) ;
               getByPrimaryKeyXB986( ) ;
               standaloneModalXB986( ) ;
               addRowXB986( ) ;
               scanNextXB986( ) ;
            }
            scanEndXB986( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode986 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_75986( ) ;
      initAllXB986( ) ;
      init_level_properties986( ) ;
      B6968Mat_HdUl = A6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      nRcdExists_986 = (short)(0) ;
      nIsMod_986 = (short)(0) ;
      nRcdDeleted_986 = (short)(0) ;
      nBlankRcdCount986 = (short)(nBlankRcdUsr986+nBlankRcdCount986) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount986 > 0 )
      {
         standaloneNotModalXB986( ) ;
         standaloneModalXB986( ) ;
         addRowXB986( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMat_HdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount986 = (short)(nBlankRcdCount986-1) ;
      }
      Gx_mode = sMode986 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6968Mat_HdUl = B6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDRMAT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THDRMAT.htm");
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
      e11XB2 ();
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
            Z6970Mat_HdGuia = httpContext.cgiGet( "Z6970Mat_HdGuia") ;
            Z6971Mat_Pzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z6971Mat_Pzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7396Mat_HdKPr = localUtil.ctond( httpContext.cgiGet( "Z7396Mat_HdKPr")) ;
            Z7397Mat_FecIng = localUtil.ctod( httpContext.cgiGet( "Z7397Mat_FecIng"), 0) ;
            O6968Mat_HdUl = (short)(localUtil.ctol( httpContext.cgiGet( "O6968Mat_HdUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_75 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33BarNumUni = localUtil.ctond( httpContext.cgiGet( "vBARNUMUNI")) ;
            AV38Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A6968Mat_HdUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_HdUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6968Mat_HdUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
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
            A6970Mat_HdGuia = httpContext.cgiGet( edtMat_HdGuia_Internalname) ;
            n6970Mat_HdGuia = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6970Mat_HdGuia", A6970Mat_HdGuia);
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
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_HdKPr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_HdKPr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAT_HDKPR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMat_HdKPr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7396Mat_HdKPr = DecimalUtil.ZERO ;
               n7396Mat_HdKPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
            }
            else
            {
               A7396Mat_HdKPr = localUtil.ctond( httpContext.cgiGet( edtMat_HdKPr_Internalname)) ;
               n7396Mat_HdKPr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtMat_FecIng_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "MAT_FECING");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMat_FecIng_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7397Mat_FecIng = GXutil.nullDate() ;
               n7397Mat_FecIng = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
            }
            else
            {
               A7397Mat_FecIng = localUtil.ctod( httpContext.cgiGet( edtMat_FecIng_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n7397Mat_FecIng = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
            }
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
                        e11XB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ENTRADA DETALLE PIEZAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Entrada Detalle Piezas' */
                        e12XB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ENTRADA DE TALLAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Entrada de Tallas' */
                        e13XB2 ();
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
            initAllXB985( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_986_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_986_Enabled), 5, 0), !bGXsfl_75_Refreshing);
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
      disableAttributesXB985( ) ;
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

   public void confirm_XB0( )
   {
      beforeValidateXB985( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsXB985( ) ;
         }
         else
         {
            checkExtendedTableXB985( ) ;
            if ( AnyError == 0 )
            {
               zmXB985( 13) ;
            }
            closeExtendedTableCursorsXB985( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode985 = Gx_mode ;
         confirm_XB986( ) ;
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
         confirmValuesXB0( ) ;
      }
   }

   public void confirm_XB986( )
   {
      s6968Mat_HdUl = O6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowXB986( ) ;
         if ( ( nRcdExists_986 != 0 ) || ( nIsMod_986 != 0 ) )
         {
            getKeyXB986( ) ;
            if ( ( nRcdExists_986 == 0 ) && ( nRcdDeleted_986 == 0 ) )
            {
               if ( RcdFound986 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateXB986( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableXB986( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsXB986( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6968Mat_HdUl = A6968Mat_HdUl ;
                     n6968Mat_HdUl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MAT_HDLIN_" + sGXsfl_75_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMat_HdLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound986 != 0 )
               {
                  if ( nRcdDeleted_986 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyXB986( ) ;
                     loadXB986( ) ;
                     beforeValidateXB986( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsXB986( ) ;
                        O6968Mat_HdUl = A6968Mat_HdUl ;
                        n6968Mat_HdUl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_986 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateXB986( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableXB986( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsXB986( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6968Mat_HdUl = A6968Mat_HdUl ;
                           n6968Mat_HdUl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_986 == 0 )
                  {
                     GXCCtl = "MAT_HDLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_HdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_986_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdEst_Internalname, GXutil.rtrim( A6973Mat_HdEst)) ;
         httpContext.changePostValue( edtMat_HdMat_Internalname, GXutil.rtrim( A6974Mat_HdMat)) ;
         httpContext.changePostValue( edtMat_HdTor_Internalname, GXutil.rtrim( A6975Mat_HdTor)) ;
         httpContext.changePostValue( edtMat_HdNomc_Internalname, GXutil.rtrim( A6976Mat_HdNomc)) ;
         httpContext.changePostValue( edtMat_HdProv_Internalname, GXutil.rtrim( A6977Mat_HdProv)) ;
         httpContext.changePostValue( edtMat_HdLote_Internalname, GXutil.rtrim( A6978Mat_HdLote)) ;
         httpContext.changePostValue( edtMat_HdPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdLm_Internalname, GXutil.ltrim( localUtil.ntoc( A6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdObs_Internalname, A6981Mat_HdObs) ;
         httpContext.changePostValue( edtMat_MaqTej_Internalname, GXutil.rtrim( A7106Mat_MaqTej)) ;
         httpContext.changePostValue( edtMat_CliRm_Internalname, GXutil.rtrim( A7107Mat_CliRm)) ;
         httpContext.changePostValue( edtMat_TraInt_Internalname, GXutil.ltrim( localUtil.ntoc( A7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_RecM_Internalname, GXutil.ltrim( localUtil.ntoc( A7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6972Mat_HdLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6973Mat_HdEst_"+sGXsfl_75_idx, GXutil.rtrim( Z6973Mat_HdEst)) ;
         httpContext.changePostValue( "ZT_"+"Z6974Mat_HdMat_"+sGXsfl_75_idx, GXutil.rtrim( Z6974Mat_HdMat)) ;
         httpContext.changePostValue( "ZT_"+"Z6975Mat_HdTor_"+sGXsfl_75_idx, GXutil.rtrim( Z6975Mat_HdTor)) ;
         httpContext.changePostValue( "ZT_"+"Z6976Mat_HdNomc_"+sGXsfl_75_idx, GXutil.rtrim( Z6976Mat_HdNomc)) ;
         httpContext.changePostValue( "ZT_"+"Z6977Mat_HdProv_"+sGXsfl_75_idx, GXutil.rtrim( Z6977Mat_HdProv)) ;
         httpContext.changePostValue( "ZT_"+"Z6978Mat_HdLote_"+sGXsfl_75_idx, GXutil.rtrim( Z6978Mat_HdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z6979Mat_HdPorc_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6980Mat_HdLm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7106Mat_MaqTej_"+sGXsfl_75_idx, GXutil.rtrim( Z7106Mat_MaqTej)) ;
         httpContext.changePostValue( "ZT_"+"Z7107Mat_CliRm_"+sGXsfl_75_idx, GXutil.rtrim( Z7107Mat_CliRm)) ;
         httpContext.changePostValue( "ZT_"+"Z7108Mat_TraInt_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7238Mat_RecM_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_986 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_986_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_986_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDEST_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDTOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdTor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDNOMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdNomc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDPROV_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdProv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLOTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDPORC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdPorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_MAQTEJ_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_MaqTej_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_CLIRM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_CliRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_TRAINT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_TraInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_RECM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_RecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6968Mat_HdUl = s6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionXB0( )
   {
   }

   public void e11XB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thdrmat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV38Pgmname, (byte)(99), GXv_char2) ;
      thdrmat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thdrmat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Kgs Pesados", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Nº Guia", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Piezas", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Fec Ing Mat", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thdrmat_impl.this.A396EmprCod = GXv_char2[0] ;
      thdrmat_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdrmat_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e12XB2( )
   {
      /* 'Entrada Detalle Piezas' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thdrpzs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e13XB2( )
   {
      /* 'Entrada de Tallas' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thdrtal", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void zmXB985( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6968Mat_HdUl = T00XB5_A6968Mat_HdUl[0] ;
            Z6969Mat_HdKgs = T00XB5_A6969Mat_HdKgs[0] ;
            Z6970Mat_HdGuia = T00XB5_A6970Mat_HdGuia[0] ;
            Z6971Mat_Pzas = T00XB5_A6971Mat_Pzas[0] ;
            Z7396Mat_HdKPr = T00XB5_A7396Mat_HdKPr[0] ;
            Z7397Mat_FecIng = T00XB5_A7397Mat_FecIng[0] ;
         }
         else
         {
            Z6968Mat_HdUl = A6968Mat_HdUl ;
            Z6969Mat_HdKgs = A6969Mat_HdKgs ;
            Z6970Mat_HdGuia = A6970Mat_HdGuia ;
            Z6971Mat_Pzas = A6971Mat_Pzas ;
            Z7396Mat_HdKPr = A7396Mat_HdKPr ;
            Z7397Mat_FecIng = A7397Mat_FecIng ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6968Mat_HdUl = A6968Mat_HdUl ;
         Z6969Mat_HdKgs = A6969Mat_HdKgs ;
         Z6970Mat_HdGuia = A6970Mat_HdGuia ;
         Z6971Mat_Pzas = A6971Mat_Pzas ;
         Z7396Mat_HdKPr = A7396Mat_HdKPr ;
         Z7397Mat_FecIng = A7397Mat_FecIng ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMat_HdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdUl_Enabled), 5, 0), true);
      AV38Pgmname = "THDRMAT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Pgmname", AV38Pgmname);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMat_HdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdUl_Enabled), 5, 0), true);
      /* Using cursor T00XB6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XB6_A407EmprNom[0] ;
      n407EmprNom = T00XB6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A7396Mat_HdKPr)==0) && ( Gx_BScreen == 0 ) )
      {
         A7396Mat_HdKPr = AV33BarNumUni ;
         n7396Mat_HdKPr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A7397Mat_FecIng)) && ( Gx_BScreen == 0 ) )
      {
         A7397Mat_FecIng = Gx_date ;
         n7397Mat_FecIng = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
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

   public void loadXB985( )
   {
      /* Using cursor T00XB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound985 = (short)(1) ;
         A407EmprNom = T00XB7_A407EmprNom[0] ;
         n407EmprNom = T00XB7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A6968Mat_HdUl = T00XB7_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = T00XB7_n6968Mat_HdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         A6969Mat_HdKgs = T00XB7_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = T00XB7_n6969Mat_HdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
         A6970Mat_HdGuia = T00XB7_A6970Mat_HdGuia[0] ;
         n6970Mat_HdGuia = T00XB7_n6970Mat_HdGuia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6970Mat_HdGuia", A6970Mat_HdGuia);
         A6971Mat_Pzas = T00XB7_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = T00XB7_n6971Mat_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
         A7396Mat_HdKPr = T00XB7_A7396Mat_HdKPr[0] ;
         n7396Mat_HdKPr = T00XB7_n7396Mat_HdKPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
         A7397Mat_FecIng = T00XB7_A7397Mat_FecIng[0] ;
         n7397Mat_FecIng = T00XB7_n7397Mat_FecIng[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
         zmXB985( -12) ;
      }
      pr_default.close(5);
      onLoadActionsXB985( ) ;
   }

   public void onLoadActionsXB985( )
   {
   }

   public void checkExtendedTableXB985( )
   {
      nIsDirty_985 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsXB985( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyXB985( )
   {
      /* Using cursor T00XB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
      else
      {
         RcdFound985 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00XB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(3) != 101) && ( T00XB5_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB5_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB5_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) && ( GXutil.strcmp(T00XB5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmXB985( 12) ;
         RcdFound985 = (short)(1) ;
         A6968Mat_HdUl = T00XB5_A6968Mat_HdUl[0] ;
         n6968Mat_HdUl = T00XB5_n6968Mat_HdUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         A6969Mat_HdKgs = T00XB5_A6969Mat_HdKgs[0] ;
         n6969Mat_HdKgs = T00XB5_n6969Mat_HdKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
         A6970Mat_HdGuia = T00XB5_A6970Mat_HdGuia[0] ;
         n6970Mat_HdGuia = T00XB5_n6970Mat_HdGuia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6970Mat_HdGuia", A6970Mat_HdGuia);
         A6971Mat_Pzas = T00XB5_A6971Mat_Pzas[0] ;
         n6971Mat_Pzas = T00XB5_n6971Mat_Pzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
         A7396Mat_HdKPr = T00XB5_A7396Mat_HdKPr[0] ;
         n7396Mat_HdKPr = T00XB5_n7396Mat_HdKPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
         A7397Mat_FecIng = T00XB5_A7397Mat_FecIng[0] ;
         n7397Mat_FecIng = T00XB5_n7397Mat_FecIng[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
         O6968Mat_HdUl = A6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         sMode985 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadXB985( ) ;
         if ( AnyError == 1 )
         {
            RcdFound985 = (short)(0) ;
            initializeNonKeyXB985( ) ;
         }
         Gx_mode = sMode985 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound985 = (short)(0) ;
         initializeNonKeyXB985( ) ;
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
      getKeyXB985( ) ;
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
      /* Using cursor T00XB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00XB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XB9_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB9_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB9_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00XB9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XB9_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB9_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB9_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            RcdFound985 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound985 = (short)(0) ;
      /* Using cursor T00XB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00XB10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XB10_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB10_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB10_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00XB10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XB10_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB10_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB10_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
         {
            RcdFound985 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyXB985( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6968Mat_HdUl = O6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         GX_FocusControl = edtMat_HdKgs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertXB985( ) ;
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
               A6968Mat_HdUl = O6968Mat_HdUl ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMat_HdKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A6968Mat_HdUl = O6968Mat_HdUl ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
               updateXB985( ) ;
               GX_FocusControl = edtMat_HdKgs_Internalname ;
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
               A6968Mat_HdUl = O6968Mat_HdUl ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
               GX_FocusControl = edtMat_HdKgs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertXB985( ) ;
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
                  A6968Mat_HdUl = O6968Mat_HdUl ;
                  n6968Mat_HdUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
                  GX_FocusControl = edtMat_HdKgs_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertXB985( ) ;
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
         A6968Mat_HdUl = O6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMat_HdKgs_Internalname ;
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
      getKeyXB985( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrmat");
      GX_FocusControl = edtMat_HdKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_XB0( ) ;
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
      GX_FocusControl = edtMat_HdKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartXB985( ) ;
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXB985( ) ;
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
      GX_FocusControl = edtMat_HdKgs_Internalname ;
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
      GX_FocusControl = edtMat_HdKgs_Internalname ;
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
      scanStartXB985( ) ;
      if ( RcdFound985 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound985 != 0 )
         {
            scanNextXB985( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMat_HdKgs_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndXB985( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyXB985( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMAT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z6968Mat_HdUl != T00XB4_A6968Mat_HdUl[0] ) || ( DecimalUtil.compareTo(Z6969Mat_HdKgs, T00XB4_A6969Mat_HdKgs[0]) != 0 ) || ( GXutil.strcmp(Z6970Mat_HdGuia, T00XB4_A6970Mat_HdGuia[0]) != 0 ) || ( Z6971Mat_Pzas != T00XB4_A6971Mat_Pzas[0] ) || ( DecimalUtil.compareTo(Z7396Mat_HdKPr, T00XB4_A7396Mat_HdKPr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z7397Mat_FecIng), GXutil.resetTime(T00XB4_A7397Mat_FecIng[0])) ) )
         {
            if ( Z6968Mat_HdUl != T00XB4_A6968Mat_HdUl[0] )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdUl");
               GXutil.writeLogRaw("Old: ",Z6968Mat_HdUl);
               GXutil.writeLogRaw("Current: ",T00XB4_A6968Mat_HdUl[0]);
            }
            if ( DecimalUtil.compareTo(Z6969Mat_HdKgs, T00XB4_A6969Mat_HdKgs[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdKgs");
               GXutil.writeLogRaw("Old: ",Z6969Mat_HdKgs);
               GXutil.writeLogRaw("Current: ",T00XB4_A6969Mat_HdKgs[0]);
            }
            if ( GXutil.strcmp(Z6970Mat_HdGuia, T00XB4_A6970Mat_HdGuia[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdGuia");
               GXutil.writeLogRaw("Old: ",Z6970Mat_HdGuia);
               GXutil.writeLogRaw("Current: ",T00XB4_A6970Mat_HdGuia[0]);
            }
            if ( Z6971Mat_Pzas != T00XB4_A6971Mat_Pzas[0] )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_Pzas");
               GXutil.writeLogRaw("Old: ",Z6971Mat_Pzas);
               GXutil.writeLogRaw("Current: ",T00XB4_A6971Mat_Pzas[0]);
            }
            if ( DecimalUtil.compareTo(Z7396Mat_HdKPr, T00XB4_A7396Mat_HdKPr[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdKPr");
               GXutil.writeLogRaw("Old: ",Z7396Mat_HdKPr);
               GXutil.writeLogRaw("Current: ",T00XB4_A7396Mat_HdKPr[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z7397Mat_FecIng), GXutil.resetTime(T00XB4_A7397Mat_FecIng[0])) ) )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_FecIng");
               GXutil.writeLogRaw("Old: ",Z7397Mat_FecIng);
               GXutil.writeLogRaw("Current: ",T00XB4_A7397Mat_FecIng[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRMAT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXB985( )
   {
      beforeValidateXB985( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXB985( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXB985( 0) ;
         checkOptimisticConcurrencyXB985( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXB985( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXB985( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XB11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6970Mat_HdGuia), A6970Mat_HdGuia, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), Boolean.valueOf(n7396Mat_HdKPr), A7396Mat_HdKPr, Boolean.valueOf(n7397Mat_FecIng), A7397Mat_FecIng, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
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
                        processLevelXB985( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionXB0( ) ;
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
            loadXB985( ) ;
         }
         endLevelXB985( ) ;
      }
      closeExtendedTableCursorsXB985( ) ;
   }

   public void updateXB985( )
   {
      beforeValidateXB985( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXB985( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXB985( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXB985( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateXB985( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XB12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6970Mat_HdGuia), A6970Mat_HdGuia, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), Boolean.valueOf(n7396Mat_HdKPr), A7396Mat_HdKPr, Boolean.valueOf(n7397Mat_FecIng), A7397Mat_FecIng, A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMAT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateXB985( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelXB985( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionXB0( ) ;
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
         endLevelXB985( ) ;
      }
      closeExtendedTableCursorsXB985( ) ;
   }

   public void deferredUpdateXB985( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXB985( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXB985( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXB985( ) ;
         afterConfirmXB985( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXB985( ) ;
            if ( AnyError == 0 )
            {
               A6968Mat_HdUl = O6968Mat_HdUl ;
               n6968Mat_HdUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
               scanStartXB986( ) ;
               while ( RcdFound986 != 0 )
               {
                  getByPrimaryKeyXB986( ) ;
                  deleteXB986( ) ;
                  scanNextXB986( ) ;
                  O6968Mat_HdUl = A6968Mat_HdUl ;
                  n6968Mat_HdUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
               }
               scanEndXB986( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XB13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
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
                           initAllXB985( ) ;
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
                        resetCaptionXB0( ) ;
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
      endLevelXB985( ) ;
      Gx_mode = sMode985 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXB985( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00XB14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00XB15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevelXB986( )
   {
      s6968Mat_HdUl = O6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      nGXsfl_75_idx = 0 ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         readRowXB986( ) ;
         if ( ( nRcdExists_986 != 0 ) || ( nIsMod_986 != 0 ) )
         {
            standaloneNotModalXB986( ) ;
            getKeyXB986( ) ;
            if ( ( nRcdExists_986 == 0 ) && ( nRcdDeleted_986 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertXB986( ) ;
            }
            else
            {
               if ( RcdFound986 != 0 )
               {
                  if ( ( nRcdDeleted_986 != 0 ) && ( nRcdExists_986 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteXB986( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_986 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateXB986( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_986 == 0 )
                  {
                     GXCCtl = "MAT_HDLIN_" + sGXsfl_75_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMat_HdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6968Mat_HdUl = A6968Mat_HdUl ;
            n6968Mat_HdUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_986_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdEst_Internalname, GXutil.rtrim( A6973Mat_HdEst)) ;
         httpContext.changePostValue( edtMat_HdMat_Internalname, GXutil.rtrim( A6974Mat_HdMat)) ;
         httpContext.changePostValue( edtMat_HdTor_Internalname, GXutil.rtrim( A6975Mat_HdTor)) ;
         httpContext.changePostValue( edtMat_HdNomc_Internalname, GXutil.rtrim( A6976Mat_HdNomc)) ;
         httpContext.changePostValue( edtMat_HdProv_Internalname, GXutil.rtrim( A6977Mat_HdProv)) ;
         httpContext.changePostValue( edtMat_HdLote_Internalname, GXutil.rtrim( A6978Mat_HdLote)) ;
         httpContext.changePostValue( edtMat_HdPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdLm_Internalname, GXutil.ltrim( localUtil.ntoc( A6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_HdObs_Internalname, A6981Mat_HdObs) ;
         httpContext.changePostValue( edtMat_MaqTej_Internalname, GXutil.rtrim( A7106Mat_MaqTej)) ;
         httpContext.changePostValue( edtMat_CliRm_Internalname, GXutil.rtrim( A7107Mat_CliRm)) ;
         httpContext.changePostValue( edtMat_TraInt_Internalname, GXutil.ltrim( localUtil.ntoc( A7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMat_RecM_Internalname, GXutil.ltrim( localUtil.ntoc( A7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6972Mat_HdLin_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6973Mat_HdEst_"+sGXsfl_75_idx, GXutil.rtrim( Z6973Mat_HdEst)) ;
         httpContext.changePostValue( "ZT_"+"Z6974Mat_HdMat_"+sGXsfl_75_idx, GXutil.rtrim( Z6974Mat_HdMat)) ;
         httpContext.changePostValue( "ZT_"+"Z6975Mat_HdTor_"+sGXsfl_75_idx, GXutil.rtrim( Z6975Mat_HdTor)) ;
         httpContext.changePostValue( "ZT_"+"Z6976Mat_HdNomc_"+sGXsfl_75_idx, GXutil.rtrim( Z6976Mat_HdNomc)) ;
         httpContext.changePostValue( "ZT_"+"Z6977Mat_HdProv_"+sGXsfl_75_idx, GXutil.rtrim( Z6977Mat_HdProv)) ;
         httpContext.changePostValue( "ZT_"+"Z6978Mat_HdLote_"+sGXsfl_75_idx, GXutil.rtrim( Z6978Mat_HdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z6979Mat_HdPorc_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6980Mat_HdLm_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7106Mat_MaqTej_"+sGXsfl_75_idx, GXutil.rtrim( Z7106Mat_MaqTej)) ;
         httpContext.changePostValue( "ZT_"+"Z7107Mat_CliRm_"+sGXsfl_75_idx, GXutil.rtrim( Z7107Mat_CliRm)) ;
         httpContext.changePostValue( "ZT_"+"Z7108Mat_TraInt_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7238Mat_RecM_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( Z7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_986_"+sGXsfl_75_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_986 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_986_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_986_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDEST_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdMat_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDTOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdTor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDNOMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdNomc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDPROV_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdProv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLOTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDPORC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdPorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDLM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_HDOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_MAQTEJ_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_MaqTej_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_CLIRM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_CliRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_TRAINT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_TraInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAT_RECM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_RecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllXB986( ) ;
      if ( AnyError != 0 )
      {
         O6968Mat_HdUl = s6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      }
      nRcdExists_986 = (short)(0) ;
      nIsMod_986 = (short)(0) ;
      nRcdDeleted_986 = (short)(0) ;
   }

   public void processLevelXB985( )
   {
      /* Save parent mode. */
      sMode985 = Gx_mode ;
      processNestedLevelXB986( ) ;
      if ( AnyError != 0 )
      {
         O6968Mat_HdUl = s6968Mat_HdUl ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode985 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00XB16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
   }

   public void endLevelXB985( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteXB985( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdrmat");
         if ( AnyError == 0 )
         {
            confirmValuesXB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdrmat");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXB985( )
   {
      /* Scan By routine */
      /* Using cursor T00XB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      RcdFound985 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXB985( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound985 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound985 = (short)(1) ;
      }
   }

   public void scanEndXB985( )
   {
      pr_default.close(15);
   }

   public void afterConfirmXB985( )
   {
      /* After Confirm Rules */
      if ( ( A6969Mat_HdKgs.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kgs no pueden ser nulos", ""), 1, "MAT_HDKGS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdKgs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( A6971Mat_Pzas == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Piezas no pueden ser nulos", ""), 1, "MAT_PZAS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_Pzas_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertXB985( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXB985( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXB985( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXB985( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXB985( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXB985( )
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
      edtMat_HdGuia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdGuia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdGuia_Enabled), 5, 0), true);
      edtMat_Pzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_Pzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_Pzas_Enabled), 5, 0), true);
      edtMat_HdKPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdKPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdKPr_Enabled), 5, 0), true);
      edtMat_FecIng_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_FecIng_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_FecIng_Enabled), 5, 0), true);
   }

   public void zmXB986( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6973Mat_HdEst = T00XB3_A6973Mat_HdEst[0] ;
            Z6974Mat_HdMat = T00XB3_A6974Mat_HdMat[0] ;
            Z6975Mat_HdTor = T00XB3_A6975Mat_HdTor[0] ;
            Z6976Mat_HdNomc = T00XB3_A6976Mat_HdNomc[0] ;
            Z6977Mat_HdProv = T00XB3_A6977Mat_HdProv[0] ;
            Z6978Mat_HdLote = T00XB3_A6978Mat_HdLote[0] ;
            Z6979Mat_HdPorc = T00XB3_A6979Mat_HdPorc[0] ;
            Z6980Mat_HdLm = T00XB3_A6980Mat_HdLm[0] ;
            Z7106Mat_MaqTej = T00XB3_A7106Mat_MaqTej[0] ;
            Z7107Mat_CliRm = T00XB3_A7107Mat_CliRm[0] ;
            Z7108Mat_TraInt = T00XB3_A7108Mat_TraInt[0] ;
            Z7238Mat_RecM = T00XB3_A7238Mat_RecM[0] ;
         }
         else
         {
            Z6973Mat_HdEst = A6973Mat_HdEst ;
            Z6974Mat_HdMat = A6974Mat_HdMat ;
            Z6975Mat_HdTor = A6975Mat_HdTor ;
            Z6976Mat_HdNomc = A6976Mat_HdNomc ;
            Z6977Mat_HdProv = A6977Mat_HdProv ;
            Z6978Mat_HdLote = A6978Mat_HdLote ;
            Z6979Mat_HdPorc = A6979Mat_HdPorc ;
            Z6980Mat_HdLm = A6980Mat_HdLm ;
            Z7106Mat_MaqTej = A7106Mat_MaqTej ;
            Z7107Mat_CliRm = A7107Mat_CliRm ;
            Z7108Mat_TraInt = A7108Mat_TraInt ;
            Z7238Mat_RecM = A7238Mat_RecM ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6972Mat_HdLin = A6972Mat_HdLin ;
         Z6973Mat_HdEst = A6973Mat_HdEst ;
         Z6974Mat_HdMat = A6974Mat_HdMat ;
         Z6975Mat_HdTor = A6975Mat_HdTor ;
         Z6976Mat_HdNomc = A6976Mat_HdNomc ;
         Z6977Mat_HdProv = A6977Mat_HdProv ;
         Z6978Mat_HdLote = A6978Mat_HdLote ;
         Z6979Mat_HdPorc = A6979Mat_HdPorc ;
         Z6980Mat_HdLm = A6980Mat_HdLm ;
         Z6981Mat_HdObs = A6981Mat_HdObs ;
         Z7106Mat_MaqTej = A7106Mat_MaqTej ;
         Z7107Mat_CliRm = A7107Mat_CliRm ;
         Z7108Mat_TraInt = A7108Mat_TraInt ;
         Z7238Mat_RecM = A7238Mat_RecM ;
      }
   }

   public void standaloneNotModalXB986( )
   {
      edtMat_RecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_RecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_RecM_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdUl_Enabled), 5, 0), true);
      edtMat_HdUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdUl_Enabled), 5, 0), true);
   }

   public void standaloneModalXB986( )
   {
      if ( isIns( )  )
      {
         A6968Mat_HdUl = (short)(O6968Mat_HdUl+1) ;
         n6968Mat_HdUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A6972Mat_HdLin = A6968Mat_HdUl ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMat_HdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
      else
      {
         edtMat_HdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      }
   }

   public void loadXB986( )
   {
      /* Using cursor T00XB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound986 = (short)(1) ;
         A6981Mat_HdObs = T00XB18_A6981Mat_HdObs[0] ;
         n6981Mat_HdObs = T00XB18_n6981Mat_HdObs[0] ;
         A6973Mat_HdEst = T00XB18_A6973Mat_HdEst[0] ;
         n6973Mat_HdEst = T00XB18_n6973Mat_HdEst[0] ;
         A6974Mat_HdMat = T00XB18_A6974Mat_HdMat[0] ;
         n6974Mat_HdMat = T00XB18_n6974Mat_HdMat[0] ;
         A6975Mat_HdTor = T00XB18_A6975Mat_HdTor[0] ;
         n6975Mat_HdTor = T00XB18_n6975Mat_HdTor[0] ;
         A6976Mat_HdNomc = T00XB18_A6976Mat_HdNomc[0] ;
         n6976Mat_HdNomc = T00XB18_n6976Mat_HdNomc[0] ;
         A6977Mat_HdProv = T00XB18_A6977Mat_HdProv[0] ;
         n6977Mat_HdProv = T00XB18_n6977Mat_HdProv[0] ;
         A6978Mat_HdLote = T00XB18_A6978Mat_HdLote[0] ;
         n6978Mat_HdLote = T00XB18_n6978Mat_HdLote[0] ;
         A6979Mat_HdPorc = T00XB18_A6979Mat_HdPorc[0] ;
         n6979Mat_HdPorc = T00XB18_n6979Mat_HdPorc[0] ;
         A6980Mat_HdLm = T00XB18_A6980Mat_HdLm[0] ;
         n6980Mat_HdLm = T00XB18_n6980Mat_HdLm[0] ;
         A7106Mat_MaqTej = T00XB18_A7106Mat_MaqTej[0] ;
         n7106Mat_MaqTej = T00XB18_n7106Mat_MaqTej[0] ;
         A7107Mat_CliRm = T00XB18_A7107Mat_CliRm[0] ;
         n7107Mat_CliRm = T00XB18_n7107Mat_CliRm[0] ;
         A7108Mat_TraInt = T00XB18_A7108Mat_TraInt[0] ;
         n7108Mat_TraInt = T00XB18_n7108Mat_TraInt[0] ;
         A7238Mat_RecM = T00XB18_A7238Mat_RecM[0] ;
         n7238Mat_RecM = T00XB18_n7238Mat_RecM[0] ;
         zmXB986( -14) ;
      }
      pr_default.close(16);
      onLoadActionsXB986( ) ;
   }

   public void onLoadActionsXB986( )
   {
   }

   public void checkExtendedTableXB986( )
   {
      nIsDirty_986 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalXB986( ) ;
   }

   public void closeExtendedTableCursorsXB986( )
   {
   }

   public void enableDisableXB986( )
   {
   }

   public void getKeyXB986( )
   {
      /* Using cursor T00XB19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound986 = (short)(1) ;
      }
      else
      {
         RcdFound986 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyXB986( )
   {
      /* Using cursor T00XB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00XB3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00XB3_A6965Mat_Hd[0] == A6965Mat_Hd ) && ( T00XB3_A6966Mat_Hdr[0] == A6966Mat_Hdr ) && ( GXutil.strcmp(T00XB3_A6967Mat_Hdp[0], A6967Mat_Hdp) == 0 ) )
      {
         zmXB986( 14) ;
         RcdFound986 = (short)(1) ;
         initializeNonKeyXB986( ) ;
         A6981Mat_HdObs = T00XB3_A6981Mat_HdObs[0] ;
         n6981Mat_HdObs = T00XB3_n6981Mat_HdObs[0] ;
         A6972Mat_HdLin = T00XB3_A6972Mat_HdLin[0] ;
         A6973Mat_HdEst = T00XB3_A6973Mat_HdEst[0] ;
         n6973Mat_HdEst = T00XB3_n6973Mat_HdEst[0] ;
         A6974Mat_HdMat = T00XB3_A6974Mat_HdMat[0] ;
         n6974Mat_HdMat = T00XB3_n6974Mat_HdMat[0] ;
         A6975Mat_HdTor = T00XB3_A6975Mat_HdTor[0] ;
         n6975Mat_HdTor = T00XB3_n6975Mat_HdTor[0] ;
         A6976Mat_HdNomc = T00XB3_A6976Mat_HdNomc[0] ;
         n6976Mat_HdNomc = T00XB3_n6976Mat_HdNomc[0] ;
         A6977Mat_HdProv = T00XB3_A6977Mat_HdProv[0] ;
         n6977Mat_HdProv = T00XB3_n6977Mat_HdProv[0] ;
         A6978Mat_HdLote = T00XB3_A6978Mat_HdLote[0] ;
         n6978Mat_HdLote = T00XB3_n6978Mat_HdLote[0] ;
         A6979Mat_HdPorc = T00XB3_A6979Mat_HdPorc[0] ;
         n6979Mat_HdPorc = T00XB3_n6979Mat_HdPorc[0] ;
         A6980Mat_HdLm = T00XB3_A6980Mat_HdLm[0] ;
         n6980Mat_HdLm = T00XB3_n6980Mat_HdLm[0] ;
         A7106Mat_MaqTej = T00XB3_A7106Mat_MaqTej[0] ;
         n7106Mat_MaqTej = T00XB3_n7106Mat_MaqTej[0] ;
         A7107Mat_CliRm = T00XB3_A7107Mat_CliRm[0] ;
         n7107Mat_CliRm = T00XB3_n7107Mat_CliRm[0] ;
         A7108Mat_TraInt = T00XB3_A7108Mat_TraInt[0] ;
         n7108Mat_TraInt = T00XB3_n7108Mat_TraInt[0] ;
         A7238Mat_RecM = T00XB3_A7238Mat_RecM[0] ;
         n7238Mat_RecM = T00XB3_n7238Mat_RecM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6965Mat_Hd = A6965Mat_Hd ;
         Z6966Mat_Hdr = A6966Mat_Hdr ;
         Z6967Mat_Hdp = A6967Mat_Hdp ;
         Z6972Mat_HdLin = A6972Mat_HdLin ;
         sMode986 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXB986( ) ;
         loadXB986( ) ;
         Gx_mode = sMode986 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound986 = (short)(0) ;
         initializeNonKeyXB986( ) ;
         sMode986 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalXB986( ) ;
         Gx_mode = sMode986 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesXB986( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyXB986( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMA1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6973Mat_HdEst, T00XB2_A6973Mat_HdEst[0]) != 0 ) || ( GXutil.strcmp(Z6974Mat_HdMat, T00XB2_A6974Mat_HdMat[0]) != 0 ) || ( GXutil.strcmp(Z6975Mat_HdTor, T00XB2_A6975Mat_HdTor[0]) != 0 ) || ( GXutil.strcmp(Z6976Mat_HdNomc, T00XB2_A6976Mat_HdNomc[0]) != 0 ) || ( GXutil.strcmp(Z6977Mat_HdProv, T00XB2_A6977Mat_HdProv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6978Mat_HdLote, T00XB2_A6978Mat_HdLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z6979Mat_HdPorc, T00XB2_A6979Mat_HdPorc[0]) != 0 ) || ( DecimalUtil.compareTo(Z6980Mat_HdLm, T00XB2_A6980Mat_HdLm[0]) != 0 ) || ( GXutil.strcmp(Z7106Mat_MaqTej, T00XB2_A7106Mat_MaqTej[0]) != 0 ) || ( GXutil.strcmp(Z7107Mat_CliRm, T00XB2_A7107Mat_CliRm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7108Mat_TraInt != T00XB2_A7108Mat_TraInt[0] ) || ( Z7238Mat_RecM != T00XB2_A7238Mat_RecM[0] ) )
         {
            if ( GXutil.strcmp(Z6973Mat_HdEst, T00XB2_A6973Mat_HdEst[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdEst");
               GXutil.writeLogRaw("Old: ",Z6973Mat_HdEst);
               GXutil.writeLogRaw("Current: ",T00XB2_A6973Mat_HdEst[0]);
            }
            if ( GXutil.strcmp(Z6974Mat_HdMat, T00XB2_A6974Mat_HdMat[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdMat");
               GXutil.writeLogRaw("Old: ",Z6974Mat_HdMat);
               GXutil.writeLogRaw("Current: ",T00XB2_A6974Mat_HdMat[0]);
            }
            if ( GXutil.strcmp(Z6975Mat_HdTor, T00XB2_A6975Mat_HdTor[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdTor");
               GXutil.writeLogRaw("Old: ",Z6975Mat_HdTor);
               GXutil.writeLogRaw("Current: ",T00XB2_A6975Mat_HdTor[0]);
            }
            if ( GXutil.strcmp(Z6976Mat_HdNomc, T00XB2_A6976Mat_HdNomc[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdNomc");
               GXutil.writeLogRaw("Old: ",Z6976Mat_HdNomc);
               GXutil.writeLogRaw("Current: ",T00XB2_A6976Mat_HdNomc[0]);
            }
            if ( GXutil.strcmp(Z6977Mat_HdProv, T00XB2_A6977Mat_HdProv[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdProv");
               GXutil.writeLogRaw("Old: ",Z6977Mat_HdProv);
               GXutil.writeLogRaw("Current: ",T00XB2_A6977Mat_HdProv[0]);
            }
            if ( GXutil.strcmp(Z6978Mat_HdLote, T00XB2_A6978Mat_HdLote[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdLote");
               GXutil.writeLogRaw("Old: ",Z6978Mat_HdLote);
               GXutil.writeLogRaw("Current: ",T00XB2_A6978Mat_HdLote[0]);
            }
            if ( DecimalUtil.compareTo(Z6979Mat_HdPorc, T00XB2_A6979Mat_HdPorc[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdPorc");
               GXutil.writeLogRaw("Old: ",Z6979Mat_HdPorc);
               GXutil.writeLogRaw("Current: ",T00XB2_A6979Mat_HdPorc[0]);
            }
            if ( DecimalUtil.compareTo(Z6980Mat_HdLm, T00XB2_A6980Mat_HdLm[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_HdLm");
               GXutil.writeLogRaw("Old: ",Z6980Mat_HdLm);
               GXutil.writeLogRaw("Current: ",T00XB2_A6980Mat_HdLm[0]);
            }
            if ( GXutil.strcmp(Z7106Mat_MaqTej, T00XB2_A7106Mat_MaqTej[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_MaqTej");
               GXutil.writeLogRaw("Old: ",Z7106Mat_MaqTej);
               GXutil.writeLogRaw("Current: ",T00XB2_A7106Mat_MaqTej[0]);
            }
            if ( GXutil.strcmp(Z7107Mat_CliRm, T00XB2_A7107Mat_CliRm[0]) != 0 )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_CliRm");
               GXutil.writeLogRaw("Old: ",Z7107Mat_CliRm);
               GXutil.writeLogRaw("Current: ",T00XB2_A7107Mat_CliRm[0]);
            }
            if ( Z7108Mat_TraInt != T00XB2_A7108Mat_TraInt[0] )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_TraInt");
               GXutil.writeLogRaw("Old: ",Z7108Mat_TraInt);
               GXutil.writeLogRaw("Current: ",T00XB2_A7108Mat_TraInt[0]);
            }
            if ( Z7238Mat_RecM != T00XB2_A7238Mat_RecM[0] )
            {
               GXutil.writeLogln("thdrmat:[seudo value changed for attri]"+"Mat_RecM");
               GXutil.writeLogRaw("Old: ",Z7238Mat_RecM);
               GXutil.writeLogRaw("Current: ",T00XB2_A7238Mat_RecM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHDRMA1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXB986( )
   {
      beforeValidateXB986( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXB986( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXB986( 0) ;
         checkOptimisticConcurrencyXB986( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXB986( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXB986( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XB20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin), Boolean.valueOf(n6973Mat_HdEst), A6973Mat_HdEst, Boolean.valueOf(n6974Mat_HdMat), A6974Mat_HdMat, Boolean.valueOf(n6975Mat_HdTor), A6975Mat_HdTor, Boolean.valueOf(n6976Mat_HdNomc), A6976Mat_HdNomc, Boolean.valueOf(n6977Mat_HdProv), A6977Mat_HdProv, Boolean.valueOf(n6978Mat_HdLote), A6978Mat_HdLote, Boolean.valueOf(n6979Mat_HdPorc), A6979Mat_HdPorc, Boolean.valueOf(n6980Mat_HdLm), A6980Mat_HdLm, Boolean.valueOf(n6981Mat_HdObs), A6981Mat_HdObs, Boolean.valueOf(n7106Mat_MaqTej), A7106Mat_MaqTej, Boolean.valueOf(n7107Mat_CliRm), A7107Mat_CliRm, Boolean.valueOf(n7108Mat_TraInt), Long.valueOf(A7108Mat_TraInt), Boolean.valueOf(n7238Mat_RecM), Integer.valueOf(A7238Mat_RecM)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
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
            loadXB986( ) ;
         }
         endLevelXB986( ) ;
      }
      closeExtendedTableCursorsXB986( ) ;
   }

   public void updateXB986( )
   {
      beforeValidateXB986( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXB986( ) ;
      }
      if ( ( nIsMod_986 != 0 ) || ( nIsDirty_986 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyXB986( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmXB986( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateXB986( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00XB21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n6973Mat_HdEst), A6973Mat_HdEst, Boolean.valueOf(n6974Mat_HdMat), A6974Mat_HdMat, Boolean.valueOf(n6975Mat_HdTor), A6975Mat_HdTor, Boolean.valueOf(n6976Mat_HdNomc), A6976Mat_HdNomc, Boolean.valueOf(n6977Mat_HdProv), A6977Mat_HdProv, Boolean.valueOf(n6978Mat_HdLote), A6978Mat_HdLote, Boolean.valueOf(n6979Mat_HdPorc), A6979Mat_HdPorc, Boolean.valueOf(n6980Mat_HdLm), A6980Mat_HdLm, Boolean.valueOf(n6981Mat_HdObs), A6981Mat_HdObs, Boolean.valueOf(n7106Mat_MaqTej), A7106Mat_MaqTej, Boolean.valueOf(n7107Mat_CliRm), A7107Mat_CliRm, Boolean.valueOf(n7108Mat_TraInt), Long.valueOf(A7108Mat_TraInt), Boolean.valueOf(n7238Mat_RecM), Integer.valueOf(A7238Mat_RecM), A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHDRMA1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateXB986( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyXB986( ) ;
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
            endLevelXB986( ) ;
         }
      }
      closeExtendedTableCursorsXB986( ) ;
   }

   public void deferredUpdateXB986( )
   {
   }

   public void deleteXB986( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateXB986( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXB986( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXB986( ) ;
         afterConfirmXB986( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXB986( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00XB22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
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
      sMode986 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXB986( ) ;
      Gx_mode = sMode986 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXB986( )
   {
      standaloneModalXB986( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelXB986( )
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

   public void scanStartXB986( )
   {
      /* Scan By routine */
      /* Using cursor T00XB23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp});
      RcdFound986 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound986 = (short)(1) ;
         A6972Mat_HdLin = T00XB23_A6972Mat_HdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXB986( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound986 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound986 = (short)(1) ;
         A6972Mat_HdLin = T00XB23_A6972Mat_HdLin[0] ;
      }
   }

   public void scanEndXB986( )
   {
      pr_default.close(21);
   }

   public void afterConfirmXB986( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertXB986( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateXB986( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXB986( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXB986( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXB986( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXB986( )
   {
      edtMat_HdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdEst_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdMat_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdTor_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdNomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdNomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdNomc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdProv_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLote_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdPorc_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdLm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdObs_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_MaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_MaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_MaqTej_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_CliRm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_CliRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_CliRm_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_TraInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_TraInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_TraInt_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_RecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_RecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_RecM_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void send_integrity_lvl_hashesXB986( )
   {
   }

   public void send_integrity_lvl_hashesXB985( )
   {
   }

   public void subsflControlProps_75986( )
   {
      edtavnRcdDeleted_986_Internalname = "vNRCDDELETED_986_"+sGXsfl_75_idx ;
      edtMat_HdLin_Internalname = "MAT_HDLIN_"+sGXsfl_75_idx ;
      edtMat_HdEst_Internalname = "MAT_HDEST_"+sGXsfl_75_idx ;
      edtMat_HdMat_Internalname = "MAT_HDMAT_"+sGXsfl_75_idx ;
      edtMat_HdTor_Internalname = "MAT_HDTOR_"+sGXsfl_75_idx ;
      edtMat_HdNomc_Internalname = "MAT_HDNOMC_"+sGXsfl_75_idx ;
      edtMat_HdProv_Internalname = "MAT_HDPROV_"+sGXsfl_75_idx ;
      edtMat_HdLote_Internalname = "MAT_HDLOTE_"+sGXsfl_75_idx ;
      edtMat_HdPorc_Internalname = "MAT_HDPORC_"+sGXsfl_75_idx ;
      edtMat_HdLm_Internalname = "MAT_HDLM_"+sGXsfl_75_idx ;
      edtMat_HdObs_Internalname = "MAT_HDOBS_"+sGXsfl_75_idx ;
      edtMat_MaqTej_Internalname = "MAT_MAQTEJ_"+sGXsfl_75_idx ;
      edtMat_CliRm_Internalname = "MAT_CLIRM_"+sGXsfl_75_idx ;
      edtMat_TraInt_Internalname = "MAT_TRAINT_"+sGXsfl_75_idx ;
      edtMat_RecM_Internalname = "MAT_RECM_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_75986( )
   {
      edtavnRcdDeleted_986_Internalname = "vNRCDDELETED_986_"+sGXsfl_75_fel_idx ;
      edtMat_HdLin_Internalname = "MAT_HDLIN_"+sGXsfl_75_fel_idx ;
      edtMat_HdEst_Internalname = "MAT_HDEST_"+sGXsfl_75_fel_idx ;
      edtMat_HdMat_Internalname = "MAT_HDMAT_"+sGXsfl_75_fel_idx ;
      edtMat_HdTor_Internalname = "MAT_HDTOR_"+sGXsfl_75_fel_idx ;
      edtMat_HdNomc_Internalname = "MAT_HDNOMC_"+sGXsfl_75_fel_idx ;
      edtMat_HdProv_Internalname = "MAT_HDPROV_"+sGXsfl_75_fel_idx ;
      edtMat_HdLote_Internalname = "MAT_HDLOTE_"+sGXsfl_75_fel_idx ;
      edtMat_HdPorc_Internalname = "MAT_HDPORC_"+sGXsfl_75_fel_idx ;
      edtMat_HdLm_Internalname = "MAT_HDLM_"+sGXsfl_75_fel_idx ;
      edtMat_HdObs_Internalname = "MAT_HDOBS_"+sGXsfl_75_fel_idx ;
      edtMat_MaqTej_Internalname = "MAT_MAQTEJ_"+sGXsfl_75_fel_idx ;
      edtMat_CliRm_Internalname = "MAT_CLIRM_"+sGXsfl_75_fel_idx ;
      edtMat_TraInt_Internalname = "MAT_TRAINT_"+sGXsfl_75_fel_idx ;
      edtMat_RecM_Internalname = "MAT_RECM_"+sGXsfl_75_fel_idx ;
   }

   public void addRowXB986( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75986( ) ;
      sendRowXB986( ) ;
   }

   public void sendRowXB986( )
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
         if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_986_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_986_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_986), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_986), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_986_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_986_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6972Mat_HdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdEst_Internalname,GXutil.rtrim( A6973Mat_HdEst),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdEst_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdMat_Internalname,GXutil.rtrim( A6974Mat_HdMat),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdMat_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdTor_Internalname,GXutil.rtrim( A6975Mat_HdTor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdTor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdTor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdNomc_Internalname,GXutil.rtrim( A6976Mat_HdNomc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdNomc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdNomc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdProv_Internalname,GXutil.rtrim( A6977Mat_HdProv),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdProv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdProv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdLote_Internalname,GXutil.rtrim( A6978Mat_HdLote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdPorc_Internalname,GXutil.ltrim( localUtil.ntoc( A6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_HdPorc_Enabled!=0) ? localUtil.format( A6979Mat_HdPorc, "ZZ9.99") : localUtil.format( A6979Mat_HdPorc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdLm_Internalname,GXutil.ltrim( localUtil.ntoc( A6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_HdLm_Enabled!=0) ? localUtil.format( A6980Mat_HdLm, "Z9.99") : localUtil.format( A6980Mat_HdLm, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdLm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdLm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_HdObs_Internalname,A6981Mat_HdObs,A6981Mat_HdObs,TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_HdObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_HdObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_MaqTej_Internalname,GXutil.rtrim( A7106Mat_MaqTej),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_MaqTej_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_MaqTej_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_CliRm_Internalname,GXutil.rtrim( A7107Mat_CliRm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_CliRm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_CliRm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_986_" + sGXsfl_75_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_75_idx + "',75)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_TraInt_Internalname,GXutil.ltrim( localUtil.ntoc( A7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_TraInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7108Mat_TraInt), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7108Mat_TraInt), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_TraInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_TraInt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMat_RecM_Internalname,GXutil.ltrim( localUtil.ntoc( A7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMat_RecM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7238Mat_RecM), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7238Mat_RecM), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMat_RecM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMat_RecM_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(75),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesXB986( ) ;
      GXCCtl = "Z6972Mat_HdLin_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6972Mat_HdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6973Mat_HdEst_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6973Mat_HdEst));
      GXCCtl = "Z6974Mat_HdMat_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6974Mat_HdMat));
      GXCCtl = "Z6975Mat_HdTor_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6975Mat_HdTor));
      GXCCtl = "Z6976Mat_HdNomc_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6976Mat_HdNomc));
      GXCCtl = "Z6977Mat_HdProv_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6977Mat_HdProv));
      GXCCtl = "Z6978Mat_HdLote_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6978Mat_HdLote));
      GXCCtl = "Z6979Mat_HdPorc_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6979Mat_HdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6980Mat_HdLm_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6980Mat_HdLm, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7106Mat_MaqTej_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7106Mat_MaqTej));
      GXCCtl = "Z7107Mat_CliRm_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7107Mat_CliRm));
      GXCCtl = "Z7108Mat_TraInt_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7108Mat_TraInt, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7238Mat_RecM_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7238Mat_RecM, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_986_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_986_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_986_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_986, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARNUMUNI_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARSER_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34BarSer));
      GXCCtl = "vBARSERDSC_" + sGXsfl_75_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV35BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_986_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_986_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDLIN_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDEST_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDMAT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDTOR_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdTor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDNOMC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdNomc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDPROV_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdProv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDLOTE_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDPORC_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDLM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_HDOBS_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_MAQTEJ_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_MaqTej_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_CLIRM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_CliRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_TRAINT_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_TraInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAT_RECM_"+sGXsfl_75_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_RecM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowXB986( )
   {
      nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75986( ) ;
      edtavnRcdDeleted_986_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_986_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLIN_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDEST_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdMat_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDMAT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdTor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDTOR_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdNomc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDNOMC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdProv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDPROV_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLOTE_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdPorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDPORC_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdLm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDLM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_HdObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_HDOBS_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_MaqTej_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_MAQTEJ_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_CliRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_CLIRM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_TraInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_TRAINT_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMat_RecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAT_RECM_"+sGXsfl_75_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_986_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_986_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_986");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_986_Internalname ;
         wbErr = true ;
         nRcdDeleted_986 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_986 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_986_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_HdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_HdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MAT_HDLIN_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdLin_Internalname ;
         wbErr = true ;
         A6972Mat_HdLin = (short)(0) ;
      }
      else
      {
         A6972Mat_HdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMat_HdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6973Mat_HdEst = httpContext.cgiGet( edtMat_HdEst_Internalname) ;
      n6973Mat_HdEst = false ;
      A6974Mat_HdMat = httpContext.cgiGet( edtMat_HdMat_Internalname) ;
      n6974Mat_HdMat = false ;
      A6975Mat_HdTor = httpContext.cgiGet( edtMat_HdTor_Internalname) ;
      n6975Mat_HdTor = false ;
      A6976Mat_HdNomc = httpContext.cgiGet( edtMat_HdNomc_Internalname) ;
      n6976Mat_HdNomc = false ;
      A6977Mat_HdProv = httpContext.cgiGet( edtMat_HdProv_Internalname) ;
      n6977Mat_HdProv = false ;
      A6978Mat_HdLote = httpContext.cgiGet( edtMat_HdLote_Internalname) ;
      n6978Mat_HdLote = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_HdPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_HdPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_HDPORC_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdPorc_Internalname ;
         wbErr = true ;
         A6979Mat_HdPorc = DecimalUtil.ZERO ;
         n6979Mat_HdPorc = false ;
      }
      else
      {
         A6979Mat_HdPorc = localUtil.ctond( httpContext.cgiGet( edtMat_HdPorc_Internalname)) ;
         n6979Mat_HdPorc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMat_HdLm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMat_HdLm_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "MAT_HDLM_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_HdLm_Internalname ;
         wbErr = true ;
         A6980Mat_HdLm = DecimalUtil.ZERO ;
         n6980Mat_HdLm = false ;
      }
      else
      {
         A6980Mat_HdLm = localUtil.ctond( httpContext.cgiGet( edtMat_HdLm_Internalname)) ;
         n6980Mat_HdLm = false ;
      }
      A6981Mat_HdObs = httpContext.cgiGet( edtMat_HdObs_Internalname) ;
      n6981Mat_HdObs = false ;
      A7106Mat_MaqTej = httpContext.cgiGet( edtMat_MaqTej_Internalname) ;
      n7106Mat_MaqTej = false ;
      A7107Mat_CliRm = httpContext.cgiGet( edtMat_CliRm_Internalname) ;
      n7107Mat_CliRm = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMat_TraInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMat_TraInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "MAT_TRAINT_" + sGXsfl_75_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMat_TraInt_Internalname ;
         wbErr = true ;
         A7108Mat_TraInt = 0 ;
         n7108Mat_TraInt = false ;
      }
      else
      {
         A7108Mat_TraInt = localUtil.ctol( httpContext.cgiGet( edtMat_TraInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n7108Mat_TraInt = false ;
      }
      A7238Mat_RecM = (int)(localUtil.ctol( httpContext.cgiGet( edtMat_RecM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7238Mat_RecM = false ;
      GXCCtl = "Z6972Mat_HdLin_" + sGXsfl_75_idx ;
      Z6972Mat_HdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6973Mat_HdEst_" + sGXsfl_75_idx ;
      Z6973Mat_HdEst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6974Mat_HdMat_" + sGXsfl_75_idx ;
      Z6974Mat_HdMat = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6975Mat_HdTor_" + sGXsfl_75_idx ;
      Z6975Mat_HdTor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6976Mat_HdNomc_" + sGXsfl_75_idx ;
      Z6976Mat_HdNomc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6977Mat_HdProv_" + sGXsfl_75_idx ;
      Z6977Mat_HdProv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6978Mat_HdLote_" + sGXsfl_75_idx ;
      Z6978Mat_HdLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6979Mat_HdPorc_" + sGXsfl_75_idx ;
      Z6979Mat_HdPorc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6980Mat_HdLm_" + sGXsfl_75_idx ;
      Z6980Mat_HdLm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7106Mat_MaqTej_" + sGXsfl_75_idx ;
      Z7106Mat_MaqTej = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7107Mat_CliRm_" + sGXsfl_75_idx ;
      Z7107Mat_CliRm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7108Mat_TraInt_" + sGXsfl_75_idx ;
      Z7108Mat_TraInt = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z7238Mat_RecM_" + sGXsfl_75_idx ;
      Z7238Mat_RecM = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_986_" + sGXsfl_75_idx ;
      nRcdDeleted_986 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_986_" + sGXsfl_75_idx ;
      nRcdExists_986 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_986_" + sGXsfl_75_idx ;
      nIsMod_986 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMat_RecM_Enabled = edtMat_RecM_Enabled ;
      defedtMat_HdLin_Enabled = edtMat_HdLin_Enabled ;
   }

   public void confirmValuesXB0( )
   {
      nGXsfl_75_idx = 0 ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_75986( ) ;
      while ( nGXsfl_75_idx < nRC_GXsfl_75 )
      {
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75986( ) ;
         httpContext.changePostValue( "Z6972Mat_HdLin_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6972Mat_HdLin_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6972Mat_HdLin_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6973Mat_HdEst_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6973Mat_HdEst_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6973Mat_HdEst_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6974Mat_HdMat_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6974Mat_HdMat_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6974Mat_HdMat_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6975Mat_HdTor_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6975Mat_HdTor_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6975Mat_HdTor_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6976Mat_HdNomc_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6976Mat_HdNomc_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6976Mat_HdNomc_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6977Mat_HdProv_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6977Mat_HdProv_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6977Mat_HdProv_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6978Mat_HdLote_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6978Mat_HdLote_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6978Mat_HdLote_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6979Mat_HdPorc_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6979Mat_HdPorc_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6979Mat_HdPorc_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z6980Mat_HdLm_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z6980Mat_HdLm_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6980Mat_HdLm_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z7106Mat_MaqTej_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z7106Mat_MaqTej_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7106Mat_MaqTej_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z7107Mat_CliRm_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z7107Mat_CliRm_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7107Mat_CliRm_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z7108Mat_TraInt_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z7108Mat_TraInt_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7108Mat_TraInt_"+sGXsfl_75_idx) ;
         httpContext.changePostValue( "Z7238Mat_RecM_"+sGXsfl_75_idx, httpContext.cgiGet( "ZT_"+"Z7238Mat_RecM_"+sGXsfl_75_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7238Mat_RecM_"+sGXsfl_75_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thdrmat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni)),GXutil.URLEncode(GXutil.rtrim(AV34BarSer)),GXutil.URLEncode(GXutil.rtrim(AV35BarSerDsc))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni","BarSer","BarSerDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6970Mat_HdGuia", GXutil.rtrim( Z6970Mat_HdGuia));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( Z6971Mat_Pzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7396Mat_HdKPr", GXutil.ltrim( localUtil.ntoc( Z7396Mat_HdKPr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7397Mat_FecIng", localUtil.dtoc( Z7397Mat_FecIng, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "O6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( O6968Mat_HdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nGXsfl_75_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV34BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV35BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNUMUNI", GXutil.ltrim( localUtil.ntoc( AV33BarNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV38Pgmname));
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
      return formatLink("app.thdrmat", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni)),GXutil.URLEncode(GXutil.rtrim(AV34BarSer)),GXutil.URLEncode(GXutil.rtrim(AV35BarSerDsc))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni","BarSer","BarSerDsc"})  ;
   }

   public String getPgmname( )
   {
      return "THDRMAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MATERIALES EN HDR", "") ;
   }

   public void initializeNonKeyXB985( )
   {
      A6968Mat_HdUl = (short)(0) ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      n6969Mat_HdKgs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrimstr( A6969Mat_HdKgs, 9, 2));
      A6970Mat_HdGuia = "" ;
      n6970Mat_HdGuia = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6970Mat_HdGuia", A6970Mat_HdGuia);
      A6971Mat_Pzas = 0 ;
      n6971Mat_Pzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6971Mat_Pzas), 6, 0));
      A7396Mat_HdKPr = AV33BarNumUni ;
      n7396Mat_HdKPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
      A7397Mat_FecIng = Gx_date ;
      n7397Mat_FecIng = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
      O6968Mat_HdUl = A6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
      Z6968Mat_HdUl = (short)(0) ;
      Z6969Mat_HdKgs = DecimalUtil.ZERO ;
      Z6970Mat_HdGuia = "" ;
      Z6971Mat_Pzas = 0 ;
      Z7396Mat_HdKPr = DecimalUtil.ZERO ;
      Z7397Mat_FecIng = GXutil.nullDate() ;
   }

   public void initAllXB985( )
   {
      initializeNonKeyXB985( ) ;
   }

   public void standaloneModalInsert( )
   {
      A7396Mat_HdKPr = i7396Mat_HdKPr ;
      n7396Mat_HdKPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrimstr( A7396Mat_HdKPr, 9, 2));
      A7397Mat_FecIng = i7397Mat_FecIng ;
      n7397Mat_FecIng = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
   }

   public void initializeNonKeyXB986( )
   {
      A6973Mat_HdEst = "" ;
      n6973Mat_HdEst = false ;
      A6974Mat_HdMat = "" ;
      n6974Mat_HdMat = false ;
      A6975Mat_HdTor = "" ;
      n6975Mat_HdTor = false ;
      A6976Mat_HdNomc = "" ;
      n6976Mat_HdNomc = false ;
      A6977Mat_HdProv = "" ;
      n6977Mat_HdProv = false ;
      A6978Mat_HdLote = "" ;
      n6978Mat_HdLote = false ;
      A6979Mat_HdPorc = DecimalUtil.ZERO ;
      n6979Mat_HdPorc = false ;
      A6980Mat_HdLm = DecimalUtil.ZERO ;
      n6980Mat_HdLm = false ;
      A6981Mat_HdObs = "" ;
      n6981Mat_HdObs = false ;
      A7106Mat_MaqTej = "" ;
      n7106Mat_MaqTej = false ;
      A7107Mat_CliRm = "" ;
      n7107Mat_CliRm = false ;
      A7108Mat_TraInt = 0 ;
      n7108Mat_TraInt = false ;
      A7238Mat_RecM = 0 ;
      n7238Mat_RecM = false ;
      Z6973Mat_HdEst = "" ;
      Z6974Mat_HdMat = "" ;
      Z6975Mat_HdTor = "" ;
      Z6976Mat_HdNomc = "" ;
      Z6977Mat_HdProv = "" ;
      Z6978Mat_HdLote = "" ;
      Z6979Mat_HdPorc = DecimalUtil.ZERO ;
      Z6980Mat_HdLm = DecimalUtil.ZERO ;
      Z7106Mat_MaqTej = "" ;
      Z7107Mat_CliRm = "" ;
      Z7108Mat_TraInt = 0 ;
      Z7238Mat_RecM = 0 ;
   }

   public void initAllXB986( )
   {
      A6972Mat_HdLin = (short)(0) ;
      initializeNonKeyXB986( ) ;
   }

   public void standaloneModalInsertXB986( )
   {
      A6968Mat_HdUl = i6968Mat_HdUl ;
      n6968Mat_HdUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6968Mat_HdUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531751", true, true);
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
      httpContext.AddJavascriptSource("thdrmat.js", "?20268241531751", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties986( )
   {
      edtMat_RecM_Enabled = defedtMat_RecM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_RecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_RecM_Enabled), 5, 0), !bGXsfl_75_Refreshing);
      edtMat_HdLin_Enabled = defedtMat_HdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMat_HdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMat_HdLin_Enabled), 5, 0), !bGXsfl_75_Refreshing);
   }

   public void startgridcontrol75( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_986, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_986_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6972Mat_HdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6973Mat_HdEst));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6974Mat_HdMat));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdMat_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6975Mat_HdTor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdTor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6976Mat_HdNomc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdNomc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6977Mat_HdProv));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdProv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6978Mat_HdLote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6979Mat_HdPorc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6980Mat_HdLm, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdLm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A6981Mat_HdObs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_HdObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7106Mat_MaqTej));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_MaqTej_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7107Mat_CliRm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_CliRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7108Mat_TraInt, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_TraInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7238Mat_RecM, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMat_RecM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMat_HdGuia_Internalname = "MAT_HDGUIA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtMat_Pzas_Internalname = "MAT_PZAS" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtMat_HdKPr_Internalname = "MAT_HDKPR" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtMat_FecIng_Internalname = "MAT_FECING" ;
      edtavnRcdDeleted_986_Internalname = "vNRCDDELETED_986" ;
      edtMat_HdLin_Internalname = "MAT_HDLIN" ;
      edtMat_HdEst_Internalname = "MAT_HDEST" ;
      edtMat_HdMat_Internalname = "MAT_HDMAT" ;
      edtMat_HdTor_Internalname = "MAT_HDTOR" ;
      edtMat_HdNomc_Internalname = "MAT_HDNOMC" ;
      edtMat_HdProv_Internalname = "MAT_HDPROV" ;
      edtMat_HdLote_Internalname = "MAT_HDLOTE" ;
      edtMat_HdPorc_Internalname = "MAT_HDPORC" ;
      edtMat_HdLm_Internalname = "MAT_HDLM" ;
      edtMat_HdObs_Internalname = "MAT_HDOBS" ;
      edtMat_MaqTej_Internalname = "MAT_MAQTEJ" ;
      edtMat_CliRm_Internalname = "MAT_CLIRM" ;
      edtMat_TraInt_Internalname = "MAT_TRAINT" ;
      edtMat_RecM_Internalname = "MAT_RECM" ;
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
      Form.setCaption( httpContext.getMessage( "MATERIALES EN HDR", "") );
      edtMat_RecM_Jsonclick = "" ;
      edtMat_TraInt_Jsonclick = "" ;
      edtMat_CliRm_Jsonclick = "" ;
      edtMat_MaqTej_Jsonclick = "" ;
      edtMat_HdObs_Jsonclick = "" ;
      edtMat_HdLm_Jsonclick = "" ;
      edtMat_HdPorc_Jsonclick = "" ;
      edtMat_HdLote_Jsonclick = "" ;
      edtMat_HdProv_Jsonclick = "" ;
      edtMat_HdNomc_Jsonclick = "" ;
      edtMat_HdTor_Jsonclick = "" ;
      edtMat_HdMat_Jsonclick = "" ;
      edtMat_HdEst_Jsonclick = "" ;
      edtMat_HdLin_Jsonclick = "" ;
      edtavnRcdDeleted_986_Jsonclick = "" ;
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
      edtMat_RecM_Enabled = 0 ;
      edtMat_TraInt_Enabled = 1 ;
      edtMat_CliRm_Enabled = 1 ;
      edtMat_MaqTej_Enabled = 1 ;
      edtMat_HdObs_Enabled = 1 ;
      edtMat_HdLm_Enabled = 1 ;
      edtMat_HdPorc_Enabled = 1 ;
      edtMat_HdLote_Enabled = 1 ;
      edtMat_HdProv_Enabled = 1 ;
      edtMat_HdNomc_Enabled = 1 ;
      edtMat_HdTor_Enabled = 1 ;
      edtMat_HdMat_Enabled = 1 ;
      edtMat_HdEst_Enabled = 1 ;
      edtMat_HdLin_Enabled = 1 ;
      edtavnRcdDeleted_986_Enabled = 1 ;
      edtMat_FecIng_Jsonclick = "" ;
      edtMat_FecIng_Backcolor = (int)(0xFFFFFF) ;
      edtMat_FecIng_Enabled = 1 ;
      edtMat_HdKPr_Jsonclick = "" ;
      edtMat_HdKPr_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdKPr_Enabled = 1 ;
      edtMat_Pzas_Jsonclick = "" ;
      edtMat_Pzas_Backcolor = (int)(0xFFFFFF) ;
      edtMat_Pzas_Enabled = 1 ;
      edtMat_HdGuia_Jsonclick = "" ;
      edtMat_HdGuia_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdGuia_Enabled = 1 ;
      edtMat_HdKgs_Jsonclick = "" ;
      edtMat_HdKgs_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdKgs_Enabled = 1 ;
      edtMat_HdUl_Jsonclick = "" ;
      edtMat_HdUl_Backcolor = (int)(0xFFFFFF) ;
      edtMat_HdUl_Enabled = 0 ;
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

   public void xc_10_XB986( )
   {
      if ( true /* After */ && true /* Level */ )
      {
         httpContext.wjLoc = formatLink("app.thdrpzs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_11_XB986( )
   {
      if ( true /* After */ && true /* Level */ )
      {
         httpContext.wjLoc = formatLink("app.thdrtal", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A6965Mat_Hd,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6966Mat_Hdr,1,0)),GXutil.URLEncode(GXutil.rtrim(A6967Mat_Hdp)),GXutil.URLEncode(DecimalUtil.decToString(AV33BarNumUni))}, new String[] {"EmprCod","Mat_Hd","Mat_Hdr","Mat_Hdp","BarNumUni"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_75986( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalXB986( ) ;
         standaloneModalXB986( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowXB986( ) ;
         nGXsfl_75_idx = (int)(nGXsfl_75_idx+1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_75_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_75986( ) ;
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
      /* Using cursor T00XB24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XB24_A407EmprNom[0] ;
      n407EmprNom = T00XB24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      GX_FocusControl = edtMat_HdKgs_Internalname ;
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
      n6968Mat_HdUl = false ;
      n7396Mat_HdKPr = false ;
      n7397Mat_FecIng = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( A6968Mat_HdUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6969Mat_HdKgs", GXutil.ltrim( localUtil.ntoc( A6969Mat_HdKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6970Mat_HdGuia", GXutil.rtrim( A6970Mat_HdGuia));
      httpContext.ajax_rsp_assign_attri("", false, "A6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( A6971Mat_Pzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7396Mat_HdKPr", GXutil.ltrim( localUtil.ntoc( A7396Mat_HdKPr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7397Mat_FecIng", localUtil.format(A7397Mat_FecIng, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6965Mat_Hd", GXutil.ltrim( localUtil.ntoc( Z6965Mat_Hd, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6966Mat_Hdr", GXutil.ltrim( localUtil.ntoc( Z6966Mat_Hdr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6967Mat_Hdp", GXutil.rtrim( Z6967Mat_Hdp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( Z6968Mat_HdUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6969Mat_HdKgs", GXutil.ltrim( localUtil.ntoc( Z6969Mat_HdKgs, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6970Mat_HdGuia", GXutil.rtrim( Z6970Mat_HdGuia));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6971Mat_Pzas", GXutil.ltrim( localUtil.ntoc( Z6971Mat_Pzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7396Mat_HdKPr", GXutil.ltrim( localUtil.ntoc( Z7396Mat_HdKPr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7397Mat_FecIng", localUtil.format(Z7397Mat_FecIng, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "O6968Mat_HdUl", GXutil.ltrim( localUtil.ntoc( O6968Mat_HdUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'},{av:'AV34BarSer',fld:'vBARSER',pic:''},{av:'AV35BarSerDsc',fld:'vBARSERDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ENTRADA DETALLE PIEZAS'","{handler:'e12XB2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'ENTRADA DETALLE PIEZAS'",",oparms:[{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'ENTRADA DE TALLAS'","{handler:'e13XB2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'ENTRADA DE TALLAS'",",oparms:[{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAT_HD","{handler:'valid_Mat_hd',iparms:[]");
      setEventMetadata("VALID_MAT_HD",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDR","{handler:'valid_Mat_hdr',iparms:[]");
      setEventMetadata("VALID_MAT_HDR",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDP","{handler:'valid_Mat_hdp',iparms:[{av:'A6968Mat_HdUl',fld:'MAT_HDUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6965Mat_Hd',fld:'MAT_HD',pic:'ZZZZZZZ9'},{av:'A6966Mat_Hdr',fld:'MAT_HDR',pic:'9'},{av:'A6967Mat_Hdp',fld:'MAT_HDP',pic:''},{av:'AV33BarNumUni',fld:'vBARNUMUNI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7396Mat_HdKPr',fld:'MAT_HDKPR',pic:'ZZZZZ9.99'},{av:'A7397Mat_FecIng',fld:'MAT_FECING',pic:''}]");
      setEventMetadata("VALID_MAT_HDP",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A6968Mat_HdUl',fld:'MAT_HDUL',pic:'ZZZ9'},{av:'A6969Mat_HdKgs',fld:'MAT_HDKGS',pic:'ZZZZZ9.99'},{av:'A6970Mat_HdGuia',fld:'MAT_HDGUIA',pic:''},{av:'A6971Mat_Pzas',fld:'MAT_PZAS',pic:'ZZZ9'},{av:'A7396Mat_HdKPr',fld:'MAT_HDKPR',pic:'ZZZZZ9.99'},{av:'A7397Mat_FecIng',fld:'MAT_FECING',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6965Mat_Hd'},{av:'Z6966Mat_Hdr'},{av:'Z6967Mat_Hdp'},{av:'Z407EmprNom'},{av:'Z6968Mat_HdUl'},{av:'Z6969Mat_HdKgs'},{av:'Z6970Mat_HdGuia'},{av:'Z6971Mat_Pzas'},{av:'Z7396Mat_HdKPr'},{av:'Z7397Mat_FecIng'},{av:'O6968Mat_HdUl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAT_HDUL","{handler:'valid_Mat_hdul',iparms:[]");
      setEventMetadata("VALID_MAT_HDUL",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDKGS","{handler:'valid_Mat_hdkgs',iparms:[]");
      setEventMetadata("VALID_MAT_HDKGS",",oparms:[]}");
      setEventMetadata("VALID_MAT_PZAS","{handler:'valid_Mat_pzas',iparms:[]");
      setEventMetadata("VALID_MAT_PZAS",",oparms:[]}");
      setEventMetadata("VALID_MAT_HDLIN","{handler:'valid_Mat_hdlin',iparms:[]");
      setEventMetadata("VALID_MAT_HDLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mat_recm',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA6967Mat_Hdp = "" ;
      wcpOAV33BarNumUni = DecimalUtil.ZERO ;
      wcpOAV34BarSer = "" ;
      wcpOAV35BarSerDsc = "" ;
      Z396EmprCod = "" ;
      Z6967Mat_Hdp = "" ;
      Z6969Mat_HdKgs = DecimalUtil.ZERO ;
      Z6970Mat_HdGuia = "" ;
      Z7396Mat_HdKPr = DecimalUtil.ZERO ;
      Z7397Mat_FecIng = GXutil.nullDate() ;
      Z6973Mat_HdEst = "" ;
      Z6974Mat_HdMat = "" ;
      Z6975Mat_HdTor = "" ;
      Z6976Mat_HdNomc = "" ;
      Z6977Mat_HdProv = "" ;
      Z6978Mat_HdLote = "" ;
      Z6979Mat_HdPorc = DecimalUtil.ZERO ;
      Z6980Mat_HdLm = DecimalUtil.ZERO ;
      Z7106Mat_MaqTej = "" ;
      Z7107Mat_CliRm = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6967Mat_Hdp = "" ;
      AV33BarNumUni = DecimalUtil.ZERO ;
      AV34BarSer = "" ;
      AV35BarSerDsc = "" ;
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
      A6970Mat_HdGuia = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A7396Mat_HdKPr = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A7397Mat_FecIng = GXutil.nullDate() ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode986 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_date = GXutil.nullDate() ;
      AV38Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode985 = "" ;
      GXCCtl = "" ;
      A6973Mat_HdEst = "" ;
      A6974Mat_HdMat = "" ;
      A6975Mat_HdTor = "" ;
      A6976Mat_HdNomc = "" ;
      A6977Mat_HdProv = "" ;
      A6978Mat_HdLote = "" ;
      A6979Mat_HdPorc = DecimalUtil.ZERO ;
      A6980Mat_HdLm = DecimalUtil.ZERO ;
      A6981Mat_HdObs = "" ;
      A7106Mat_MaqTej = "" ;
      A7107Mat_CliRm = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00XB6_A407EmprNom = new String[] {""} ;
      T00XB6_n407EmprNom = new boolean[] {false} ;
      T00XB7_A6965Mat_Hd = new int[1] ;
      T00XB7_A6966Mat_Hdr = new byte[1] ;
      T00XB7_A6967Mat_Hdp = new String[] {""} ;
      T00XB7_A407EmprNom = new String[] {""} ;
      T00XB7_n407EmprNom = new boolean[] {false} ;
      T00XB7_A6968Mat_HdUl = new short[1] ;
      T00XB7_n6968Mat_HdUl = new boolean[] {false} ;
      T00XB7_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB7_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XB7_A6970Mat_HdGuia = new String[] {""} ;
      T00XB7_n6970Mat_HdGuia = new boolean[] {false} ;
      T00XB7_A6971Mat_Pzas = new int[1] ;
      T00XB7_n6971Mat_Pzas = new boolean[] {false} ;
      T00XB7_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB7_n7396Mat_HdKPr = new boolean[] {false} ;
      T00XB7_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      T00XB7_n7397Mat_FecIng = new boolean[] {false} ;
      T00XB7_A396EmprCod = new String[] {""} ;
      T00XB8_A396EmprCod = new String[] {""} ;
      T00XB8_A6965Mat_Hd = new int[1] ;
      T00XB8_A6966Mat_Hdr = new byte[1] ;
      T00XB8_A6967Mat_Hdp = new String[] {""} ;
      T00XB5_A6965Mat_Hd = new int[1] ;
      T00XB5_A6966Mat_Hdr = new byte[1] ;
      T00XB5_A6967Mat_Hdp = new String[] {""} ;
      T00XB5_A6968Mat_HdUl = new short[1] ;
      T00XB5_n6968Mat_HdUl = new boolean[] {false} ;
      T00XB5_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB5_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XB5_A6970Mat_HdGuia = new String[] {""} ;
      T00XB5_n6970Mat_HdGuia = new boolean[] {false} ;
      T00XB5_A6971Mat_Pzas = new int[1] ;
      T00XB5_n6971Mat_Pzas = new boolean[] {false} ;
      T00XB5_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB5_n7396Mat_HdKPr = new boolean[] {false} ;
      T00XB5_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      T00XB5_n7397Mat_FecIng = new boolean[] {false} ;
      T00XB5_A396EmprCod = new String[] {""} ;
      T00XB9_A396EmprCod = new String[] {""} ;
      T00XB9_A6965Mat_Hd = new int[1] ;
      T00XB9_A6966Mat_Hdr = new byte[1] ;
      T00XB9_A6967Mat_Hdp = new String[] {""} ;
      T00XB10_A396EmprCod = new String[] {""} ;
      T00XB10_A6965Mat_Hd = new int[1] ;
      T00XB10_A6966Mat_Hdr = new byte[1] ;
      T00XB10_A6967Mat_Hdp = new String[] {""} ;
      T00XB4_A6965Mat_Hd = new int[1] ;
      T00XB4_A6966Mat_Hdr = new byte[1] ;
      T00XB4_A6967Mat_Hdp = new String[] {""} ;
      T00XB4_A6968Mat_HdUl = new short[1] ;
      T00XB4_n6968Mat_HdUl = new boolean[] {false} ;
      T00XB4_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB4_n6969Mat_HdKgs = new boolean[] {false} ;
      T00XB4_A6970Mat_HdGuia = new String[] {""} ;
      T00XB4_n6970Mat_HdGuia = new boolean[] {false} ;
      T00XB4_A6971Mat_Pzas = new int[1] ;
      T00XB4_n6971Mat_Pzas = new boolean[] {false} ;
      T00XB4_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB4_n7396Mat_HdKPr = new boolean[] {false} ;
      T00XB4_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      T00XB4_n7397Mat_FecIng = new boolean[] {false} ;
      T00XB4_A396EmprCod = new String[] {""} ;
      T00XB14_A396EmprCod = new String[] {""} ;
      T00XB14_A6965Mat_Hd = new int[1] ;
      T00XB14_A6966Mat_Hdr = new byte[1] ;
      T00XB14_A6967Mat_Hdp = new String[] {""} ;
      T00XB14_A7007Mat_HdTl = new String[] {""} ;
      T00XB15_A396EmprCod = new String[] {""} ;
      T00XB15_A6965Mat_Hd = new int[1] ;
      T00XB15_A6966Mat_Hdr = new byte[1] ;
      T00XB15_A6967Mat_Hdp = new String[] {""} ;
      T00XB15_A6984Mat_HdCPz = new String[] {""} ;
      T00XB17_A396EmprCod = new String[] {""} ;
      T00XB17_A6965Mat_Hd = new int[1] ;
      T00XB17_A6966Mat_Hdr = new byte[1] ;
      T00XB17_A6967Mat_Hdp = new String[] {""} ;
      Z6981Mat_HdObs = "" ;
      T00XB18_A6981Mat_HdObs = new String[] {""} ;
      T00XB18_n6981Mat_HdObs = new boolean[] {false} ;
      T00XB18_A396EmprCod = new String[] {""} ;
      T00XB18_A6965Mat_Hd = new int[1] ;
      T00XB18_A6966Mat_Hdr = new byte[1] ;
      T00XB18_A6967Mat_Hdp = new String[] {""} ;
      T00XB18_A6972Mat_HdLin = new short[1] ;
      T00XB18_A6973Mat_HdEst = new String[] {""} ;
      T00XB18_n6973Mat_HdEst = new boolean[] {false} ;
      T00XB18_A6974Mat_HdMat = new String[] {""} ;
      T00XB18_n6974Mat_HdMat = new boolean[] {false} ;
      T00XB18_A6975Mat_HdTor = new String[] {""} ;
      T00XB18_n6975Mat_HdTor = new boolean[] {false} ;
      T00XB18_A6976Mat_HdNomc = new String[] {""} ;
      T00XB18_n6976Mat_HdNomc = new boolean[] {false} ;
      T00XB18_A6977Mat_HdProv = new String[] {""} ;
      T00XB18_n6977Mat_HdProv = new boolean[] {false} ;
      T00XB18_A6978Mat_HdLote = new String[] {""} ;
      T00XB18_n6978Mat_HdLote = new boolean[] {false} ;
      T00XB18_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB18_n6979Mat_HdPorc = new boolean[] {false} ;
      T00XB18_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB18_n6980Mat_HdLm = new boolean[] {false} ;
      T00XB18_A7106Mat_MaqTej = new String[] {""} ;
      T00XB18_n7106Mat_MaqTej = new boolean[] {false} ;
      T00XB18_A7107Mat_CliRm = new String[] {""} ;
      T00XB18_n7107Mat_CliRm = new boolean[] {false} ;
      T00XB18_A7108Mat_TraInt = new long[1] ;
      T00XB18_n7108Mat_TraInt = new boolean[] {false} ;
      T00XB18_A7238Mat_RecM = new int[1] ;
      T00XB18_n7238Mat_RecM = new boolean[] {false} ;
      T00XB19_A396EmprCod = new String[] {""} ;
      T00XB19_A6965Mat_Hd = new int[1] ;
      T00XB19_A6966Mat_Hdr = new byte[1] ;
      T00XB19_A6967Mat_Hdp = new String[] {""} ;
      T00XB19_A6972Mat_HdLin = new short[1] ;
      T00XB3_A6981Mat_HdObs = new String[] {""} ;
      T00XB3_n6981Mat_HdObs = new boolean[] {false} ;
      T00XB3_A396EmprCod = new String[] {""} ;
      T00XB3_A6965Mat_Hd = new int[1] ;
      T00XB3_A6966Mat_Hdr = new byte[1] ;
      T00XB3_A6967Mat_Hdp = new String[] {""} ;
      T00XB3_A6972Mat_HdLin = new short[1] ;
      T00XB3_A6973Mat_HdEst = new String[] {""} ;
      T00XB3_n6973Mat_HdEst = new boolean[] {false} ;
      T00XB3_A6974Mat_HdMat = new String[] {""} ;
      T00XB3_n6974Mat_HdMat = new boolean[] {false} ;
      T00XB3_A6975Mat_HdTor = new String[] {""} ;
      T00XB3_n6975Mat_HdTor = new boolean[] {false} ;
      T00XB3_A6976Mat_HdNomc = new String[] {""} ;
      T00XB3_n6976Mat_HdNomc = new boolean[] {false} ;
      T00XB3_A6977Mat_HdProv = new String[] {""} ;
      T00XB3_n6977Mat_HdProv = new boolean[] {false} ;
      T00XB3_A6978Mat_HdLote = new String[] {""} ;
      T00XB3_n6978Mat_HdLote = new boolean[] {false} ;
      T00XB3_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB3_n6979Mat_HdPorc = new boolean[] {false} ;
      T00XB3_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB3_n6980Mat_HdLm = new boolean[] {false} ;
      T00XB3_A7106Mat_MaqTej = new String[] {""} ;
      T00XB3_n7106Mat_MaqTej = new boolean[] {false} ;
      T00XB3_A7107Mat_CliRm = new String[] {""} ;
      T00XB3_n7107Mat_CliRm = new boolean[] {false} ;
      T00XB3_A7108Mat_TraInt = new long[1] ;
      T00XB3_n7108Mat_TraInt = new boolean[] {false} ;
      T00XB3_A7238Mat_RecM = new int[1] ;
      T00XB3_n7238Mat_RecM = new boolean[] {false} ;
      T00XB2_A6981Mat_HdObs = new String[] {""} ;
      T00XB2_n6981Mat_HdObs = new boolean[] {false} ;
      T00XB2_A396EmprCod = new String[] {""} ;
      T00XB2_A6965Mat_Hd = new int[1] ;
      T00XB2_A6966Mat_Hdr = new byte[1] ;
      T00XB2_A6967Mat_Hdp = new String[] {""} ;
      T00XB2_A6972Mat_HdLin = new short[1] ;
      T00XB2_A6973Mat_HdEst = new String[] {""} ;
      T00XB2_n6973Mat_HdEst = new boolean[] {false} ;
      T00XB2_A6974Mat_HdMat = new String[] {""} ;
      T00XB2_n6974Mat_HdMat = new boolean[] {false} ;
      T00XB2_A6975Mat_HdTor = new String[] {""} ;
      T00XB2_n6975Mat_HdTor = new boolean[] {false} ;
      T00XB2_A6976Mat_HdNomc = new String[] {""} ;
      T00XB2_n6976Mat_HdNomc = new boolean[] {false} ;
      T00XB2_A6977Mat_HdProv = new String[] {""} ;
      T00XB2_n6977Mat_HdProv = new boolean[] {false} ;
      T00XB2_A6978Mat_HdLote = new String[] {""} ;
      T00XB2_n6978Mat_HdLote = new boolean[] {false} ;
      T00XB2_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB2_n6979Mat_HdPorc = new boolean[] {false} ;
      T00XB2_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00XB2_n6980Mat_HdLm = new boolean[] {false} ;
      T00XB2_A7106Mat_MaqTej = new String[] {""} ;
      T00XB2_n7106Mat_MaqTej = new boolean[] {false} ;
      T00XB2_A7107Mat_CliRm = new String[] {""} ;
      T00XB2_n7107Mat_CliRm = new boolean[] {false} ;
      T00XB2_A7108Mat_TraInt = new long[1] ;
      T00XB2_n7108Mat_TraInt = new boolean[] {false} ;
      T00XB2_A7238Mat_RecM = new int[1] ;
      T00XB2_n7238Mat_RecM = new boolean[] {false} ;
      T00XB23_A396EmprCod = new String[] {""} ;
      T00XB23_A6965Mat_Hd = new int[1] ;
      T00XB23_A6966Mat_Hdr = new byte[1] ;
      T00XB23_A6967Mat_Hdp = new String[] {""} ;
      T00XB23_A6972Mat_HdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i7396Mat_HdKPr = DecimalUtil.ZERO ;
      i7397Mat_FecIng = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00XB24_A407EmprNom = new String[] {""} ;
      T00XB24_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ6967Mat_Hdp = "" ;
      ZZ407EmprNom = "" ;
      ZZ6969Mat_HdKgs = DecimalUtil.ZERO ;
      ZZ6970Mat_HdGuia = "" ;
      ZZ7396Mat_HdKPr = DecimalUtil.ZERO ;
      ZZ7397Mat_FecIng = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdrmat__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdrmat__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdrmat__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdrmat__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdrmat__default(),
         new Object[] {
             new Object[] {
            T00XB2_A6981Mat_HdObs, T00XB2_n6981Mat_HdObs, T00XB2_A396EmprCod, T00XB2_A6965Mat_Hd, T00XB2_A6966Mat_Hdr, T00XB2_A6967Mat_Hdp, T00XB2_A6972Mat_HdLin, T00XB2_A6973Mat_HdEst, T00XB2_n6973Mat_HdEst, T00XB2_A6974Mat_HdMat,
            T00XB2_n6974Mat_HdMat, T00XB2_A6975Mat_HdTor, T00XB2_n6975Mat_HdTor, T00XB2_A6976Mat_HdNomc, T00XB2_n6976Mat_HdNomc, T00XB2_A6977Mat_HdProv, T00XB2_n6977Mat_HdProv, T00XB2_A6978Mat_HdLote, T00XB2_n6978Mat_HdLote, T00XB2_A6979Mat_HdPorc,
            T00XB2_n6979Mat_HdPorc, T00XB2_A6980Mat_HdLm, T00XB2_n6980Mat_HdLm, T00XB2_A7106Mat_MaqTej, T00XB2_n7106Mat_MaqTej, T00XB2_A7107Mat_CliRm, T00XB2_n7107Mat_CliRm, T00XB2_A7108Mat_TraInt, T00XB2_n7108Mat_TraInt, T00XB2_A7238Mat_RecM,
            T00XB2_n7238Mat_RecM
            }
            , new Object[] {
            T00XB3_A6981Mat_HdObs, T00XB3_n6981Mat_HdObs, T00XB3_A396EmprCod, T00XB3_A6965Mat_Hd, T00XB3_A6966Mat_Hdr, T00XB3_A6967Mat_Hdp, T00XB3_A6972Mat_HdLin, T00XB3_A6973Mat_HdEst, T00XB3_n6973Mat_HdEst, T00XB3_A6974Mat_HdMat,
            T00XB3_n6974Mat_HdMat, T00XB3_A6975Mat_HdTor, T00XB3_n6975Mat_HdTor, T00XB3_A6976Mat_HdNomc, T00XB3_n6976Mat_HdNomc, T00XB3_A6977Mat_HdProv, T00XB3_n6977Mat_HdProv, T00XB3_A6978Mat_HdLote, T00XB3_n6978Mat_HdLote, T00XB3_A6979Mat_HdPorc,
            T00XB3_n6979Mat_HdPorc, T00XB3_A6980Mat_HdLm, T00XB3_n6980Mat_HdLm, T00XB3_A7106Mat_MaqTej, T00XB3_n7106Mat_MaqTej, T00XB3_A7107Mat_CliRm, T00XB3_n7107Mat_CliRm, T00XB3_A7108Mat_TraInt, T00XB3_n7108Mat_TraInt, T00XB3_A7238Mat_RecM,
            T00XB3_n7238Mat_RecM
            }
            , new Object[] {
            T00XB4_A6965Mat_Hd, T00XB4_A6966Mat_Hdr, T00XB4_A6967Mat_Hdp, T00XB4_A6968Mat_HdUl, T00XB4_n6968Mat_HdUl, T00XB4_A6969Mat_HdKgs, T00XB4_n6969Mat_HdKgs, T00XB4_A6970Mat_HdGuia, T00XB4_n6970Mat_HdGuia, T00XB4_A6971Mat_Pzas,
            T00XB4_n6971Mat_Pzas, T00XB4_A7396Mat_HdKPr, T00XB4_n7396Mat_HdKPr, T00XB4_A7397Mat_FecIng, T00XB4_n7397Mat_FecIng, T00XB4_A396EmprCod
            }
            , new Object[] {
            T00XB5_A6965Mat_Hd, T00XB5_A6966Mat_Hdr, T00XB5_A6967Mat_Hdp, T00XB5_A6968Mat_HdUl, T00XB5_n6968Mat_HdUl, T00XB5_A6969Mat_HdKgs, T00XB5_n6969Mat_HdKgs, T00XB5_A6970Mat_HdGuia, T00XB5_n6970Mat_HdGuia, T00XB5_A6971Mat_Pzas,
            T00XB5_n6971Mat_Pzas, T00XB5_A7396Mat_HdKPr, T00XB5_n7396Mat_HdKPr, T00XB5_A7397Mat_FecIng, T00XB5_n7397Mat_FecIng, T00XB5_A396EmprCod
            }
            , new Object[] {
            T00XB6_A407EmprNom, T00XB6_n407EmprNom
            }
            , new Object[] {
            T00XB7_A6965Mat_Hd, T00XB7_A6966Mat_Hdr, T00XB7_A6967Mat_Hdp, T00XB7_A407EmprNom, T00XB7_n407EmprNom, T00XB7_A6968Mat_HdUl, T00XB7_n6968Mat_HdUl, T00XB7_A6969Mat_HdKgs, T00XB7_n6969Mat_HdKgs, T00XB7_A6970Mat_HdGuia,
            T00XB7_n6970Mat_HdGuia, T00XB7_A6971Mat_Pzas, T00XB7_n6971Mat_Pzas, T00XB7_A7396Mat_HdKPr, T00XB7_n7396Mat_HdKPr, T00XB7_A7397Mat_FecIng, T00XB7_n7397Mat_FecIng, T00XB7_A396EmprCod
            }
            , new Object[] {
            T00XB8_A396EmprCod, T00XB8_A6965Mat_Hd, T00XB8_A6966Mat_Hdr, T00XB8_A6967Mat_Hdp
            }
            , new Object[] {
            T00XB9_A396EmprCod, T00XB9_A6965Mat_Hd, T00XB9_A6966Mat_Hdr, T00XB9_A6967Mat_Hdp
            }
            , new Object[] {
            T00XB10_A396EmprCod, T00XB10_A6965Mat_Hd, T00XB10_A6966Mat_Hdr, T00XB10_A6967Mat_Hdp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XB14_A396EmprCod, T00XB14_A6965Mat_Hd, T00XB14_A6966Mat_Hdr, T00XB14_A6967Mat_Hdp, T00XB14_A7007Mat_HdTl
            }
            , new Object[] {
            T00XB15_A396EmprCod, T00XB15_A6965Mat_Hd, T00XB15_A6966Mat_Hdr, T00XB15_A6967Mat_Hdp, T00XB15_A6984Mat_HdCPz
            }
            , new Object[] {
            }
            , new Object[] {
            T00XB17_A396EmprCod, T00XB17_A6965Mat_Hd, T00XB17_A6966Mat_Hdr, T00XB17_A6967Mat_Hdp
            }
            , new Object[] {
            T00XB18_A6981Mat_HdObs, T00XB18_n6981Mat_HdObs, T00XB18_A396EmprCod, T00XB18_A6965Mat_Hd, T00XB18_A6966Mat_Hdr, T00XB18_A6967Mat_Hdp, T00XB18_A6972Mat_HdLin, T00XB18_A6973Mat_HdEst, T00XB18_n6973Mat_HdEst, T00XB18_A6974Mat_HdMat,
            T00XB18_n6974Mat_HdMat, T00XB18_A6975Mat_HdTor, T00XB18_n6975Mat_HdTor, T00XB18_A6976Mat_HdNomc, T00XB18_n6976Mat_HdNomc, T00XB18_A6977Mat_HdProv, T00XB18_n6977Mat_HdProv, T00XB18_A6978Mat_HdLote, T00XB18_n6978Mat_HdLote, T00XB18_A6979Mat_HdPorc,
            T00XB18_n6979Mat_HdPorc, T00XB18_A6980Mat_HdLm, T00XB18_n6980Mat_HdLm, T00XB18_A7106Mat_MaqTej, T00XB18_n7106Mat_MaqTej, T00XB18_A7107Mat_CliRm, T00XB18_n7107Mat_CliRm, T00XB18_A7108Mat_TraInt, T00XB18_n7108Mat_TraInt, T00XB18_A7238Mat_RecM,
            T00XB18_n7238Mat_RecM
            }
            , new Object[] {
            T00XB19_A396EmprCod, T00XB19_A6965Mat_Hd, T00XB19_A6966Mat_Hdr, T00XB19_A6967Mat_Hdp, T00XB19_A6972Mat_HdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XB23_A396EmprCod, T00XB23_A6965Mat_Hd, T00XB23_A6966Mat_Hdr, T00XB23_A6967Mat_Hdp, T00XB23_A6972Mat_HdLin
            }
            , new Object[] {
            T00XB24_A407EmprNom, T00XB24_n407EmprNom
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
      AV38Pgmname = "THDRMAT" ;
      Z7396Mat_HdKPr = DecimalUtil.ZERO ;
      n7396Mat_HdKPr = false ;
      A7396Mat_HdKPr = DecimalUtil.ZERO ;
      n7396Mat_HdKPr = false ;
      i7396Mat_HdKPr = DecimalUtil.ZERO ;
      n7396Mat_HdKPr = false ;
      Z7397Mat_FecIng = GXutil.nullDate() ;
      n7397Mat_FecIng = false ;
      A7397Mat_FecIng = GXutil.nullDate() ;
      n7397Mat_FecIng = false ;
      i7397Mat_FecIng = GXutil.nullDate() ;
      n7397Mat_FecIng = false ;
      Gx_date = GXutil.today( ) ;
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
   private short O6968Mat_HdUl ;
   private short Z6972Mat_HdLin ;
   private short nRcdDeleted_986 ;
   private short nRcdExists_986 ;
   private short nIsMod_986 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6968Mat_HdUl ;
   private short nBlankRcdCount986 ;
   private short RcdFound986 ;
   private short B6968Mat_HdUl ;
   private short nBlankRcdUsr986 ;
   private short s6968Mat_HdUl ;
   private short A6972Mat_HdLin ;
   private short RcdFound985 ;
   private short nIsDirty_985 ;
   private short nIsDirty_986 ;
   private short i6968Mat_HdUl ;
   private short ZZ6968Mat_HdUl ;
   private short ZO6968Mat_HdUl ;
   private int wcpOA6965Mat_Hd ;
   private int Z6965Mat_Hd ;
   private int Z6971Mat_Pzas ;
   private int nRC_GXsfl_75 ;
   private int nGXsfl_75_idx=1 ;
   private int Z7238Mat_RecM ;
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
   private int edtMat_HdGuia_Enabled ;
   private int A6971Mat_Pzas ;
   private int edtMat_Pzas_Enabled ;
   private int edtMat_HdKPr_Enabled ;
   private int edtMat_FecIng_Enabled ;
   private int edtavnRcdDeleted_986_Enabled ;
   private int edtMat_HdLin_Enabled ;
   private int edtMat_HdEst_Enabled ;
   private int edtMat_HdMat_Enabled ;
   private int edtMat_HdTor_Enabled ;
   private int edtMat_HdNomc_Enabled ;
   private int edtMat_HdProv_Enabled ;
   private int edtMat_HdLote_Enabled ;
   private int edtMat_HdPorc_Enabled ;
   private int edtMat_HdLm_Enabled ;
   private int edtMat_HdObs_Enabled ;
   private int edtMat_MaqTej_Enabled ;
   private int edtMat_CliRm_Enabled ;
   private int edtMat_TraInt_Enabled ;
   private int edtMat_RecM_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7238Mat_RecM ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtMat_RecM_Enabled ;
   private int defedtMat_HdLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMat_FecIng_Backcolor ;
   private int edtMat_HdKPr_Backcolor ;
   private int edtMat_Pzas_Backcolor ;
   private int edtMat_HdGuia_Backcolor ;
   private int edtMat_HdKgs_Backcolor ;
   private int edtMat_HdUl_Backcolor ;
   private int edtMat_Hdp_Backcolor ;
   private int edtMat_Hdr_Backcolor ;
   private int edtMat_Hd_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ6965Mat_Hd ;
   private int ZZ6971Mat_Pzas ;
   private long Z7108Mat_TraInt ;
   private long GRID1_nFirstRecordOnPage ;
   private long A7108Mat_TraInt ;
   private java.math.BigDecimal wcpOAV33BarNumUni ;
   private java.math.BigDecimal Z6969Mat_HdKgs ;
   private java.math.BigDecimal Z7396Mat_HdKPr ;
   private java.math.BigDecimal Z6979Mat_HdPorc ;
   private java.math.BigDecimal Z6980Mat_HdLm ;
   private java.math.BigDecimal AV33BarNumUni ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private java.math.BigDecimal A7396Mat_HdKPr ;
   private java.math.BigDecimal A6979Mat_HdPorc ;
   private java.math.BigDecimal A6980Mat_HdLm ;
   private java.math.BigDecimal i7396Mat_HdKPr ;
   private java.math.BigDecimal ZZ6969Mat_HdKgs ;
   private java.math.BigDecimal ZZ7396Mat_HdKPr ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA6967Mat_Hdp ;
   private String wcpOAV34BarSer ;
   private String wcpOAV35BarSerDsc ;
   private String Z396EmprCod ;
   private String Z6967Mat_Hdp ;
   private String Z6970Mat_HdGuia ;
   private String Z6973Mat_HdEst ;
   private String Z6974Mat_HdMat ;
   private String Z6975Mat_HdTor ;
   private String Z6976Mat_HdNomc ;
   private String Z6977Mat_HdProv ;
   private String Z6978Mat_HdLote ;
   private String Z7106Mat_MaqTej ;
   private String Z7107Mat_CliRm ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6967Mat_Hdp ;
   private String AV34BarSer ;
   private String AV35BarSerDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMat_HdKgs_Internalname ;
   private String sGXsfl_75_idx="0001" ;
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
   private String edtMat_HdUl_Internalname ;
   private String edtMat_HdUl_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtMat_HdKgs_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtMat_HdGuia_Internalname ;
   private String A6970Mat_HdGuia ;
   private String edtMat_HdGuia_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtMat_Pzas_Internalname ;
   private String edtMat_Pzas_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtMat_HdKPr_Internalname ;
   private String edtMat_HdKPr_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtMat_FecIng_Internalname ;
   private String edtMat_FecIng_Jsonclick ;
   private String sMode986 ;
   private String edtavnRcdDeleted_986_Internalname ;
   private String edtMat_HdLin_Internalname ;
   private String edtMat_HdEst_Internalname ;
   private String edtMat_HdMat_Internalname ;
   private String edtMat_HdTor_Internalname ;
   private String edtMat_HdNomc_Internalname ;
   private String edtMat_HdProv_Internalname ;
   private String edtMat_HdLote_Internalname ;
   private String edtMat_HdPorc_Internalname ;
   private String edtMat_HdLm_Internalname ;
   private String edtMat_HdObs_Internalname ;
   private String edtMat_MaqTej_Internalname ;
   private String edtMat_CliRm_Internalname ;
   private String edtMat_TraInt_Internalname ;
   private String edtMat_RecM_Internalname ;
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
   private String AV38Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode985 ;
   private String GXCCtl ;
   private String A6973Mat_HdEst ;
   private String A6974Mat_HdMat ;
   private String A6975Mat_HdTor ;
   private String A6976Mat_HdNomc ;
   private String A6977Mat_HdProv ;
   private String A6978Mat_HdLote ;
   private String A7106Mat_MaqTej ;
   private String A7107Mat_CliRm ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_986_Jsonclick ;
   private String edtMat_HdLin_Jsonclick ;
   private String edtMat_HdEst_Jsonclick ;
   private String edtMat_HdMat_Jsonclick ;
   private String edtMat_HdTor_Jsonclick ;
   private String edtMat_HdNomc_Jsonclick ;
   private String edtMat_HdProv_Jsonclick ;
   private String edtMat_HdLote_Jsonclick ;
   private String edtMat_HdPorc_Jsonclick ;
   private String edtMat_HdLm_Jsonclick ;
   private String edtMat_HdObs_Jsonclick ;
   private String edtMat_MaqTej_Jsonclick ;
   private String edtMat_CliRm_Jsonclick ;
   private String edtMat_TraInt_Jsonclick ;
   private String edtMat_RecM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6967Mat_Hdp ;
   private String ZZ407EmprNom ;
   private String ZZ6970Mat_HdGuia ;
   private java.util.Date Z7397Mat_FecIng ;
   private java.util.Date A7397Mat_FecIng ;
   private java.util.Date Gx_date ;
   private java.util.Date i7397Mat_FecIng ;
   private java.util.Date ZZ7397Mat_FecIng ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n6968Mat_HdUl ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6970Mat_HdGuia ;
   private boolean n6971Mat_Pzas ;
   private boolean n7396Mat_HdKPr ;
   private boolean n7397Mat_FecIng ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n6981Mat_HdObs ;
   private boolean n6973Mat_HdEst ;
   private boolean n6974Mat_HdMat ;
   private boolean n6975Mat_HdTor ;
   private boolean n6976Mat_HdNomc ;
   private boolean n6977Mat_HdProv ;
   private boolean n6978Mat_HdLote ;
   private boolean n6979Mat_HdPorc ;
   private boolean n6980Mat_HdLm ;
   private boolean n7106Mat_MaqTej ;
   private boolean n7107Mat_CliRm ;
   private boolean n7108Mat_TraInt ;
   private boolean n7238Mat_RecM ;
   private String A6981Mat_HdObs ;
   private String Z6981Mat_HdObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00XB6_A407EmprNom ;
   private boolean[] T00XB6_n407EmprNom ;
   private int[] T00XB7_A6965Mat_Hd ;
   private byte[] T00XB7_A6966Mat_Hdr ;
   private String[] T00XB7_A6967Mat_Hdp ;
   private String[] T00XB7_A407EmprNom ;
   private boolean[] T00XB7_n407EmprNom ;
   private short[] T00XB7_A6968Mat_HdUl ;
   private boolean[] T00XB7_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XB7_A6969Mat_HdKgs ;
   private boolean[] T00XB7_n6969Mat_HdKgs ;
   private String[] T00XB7_A6970Mat_HdGuia ;
   private boolean[] T00XB7_n6970Mat_HdGuia ;
   private int[] T00XB7_A6971Mat_Pzas ;
   private boolean[] T00XB7_n6971Mat_Pzas ;
   private java.math.BigDecimal[] T00XB7_A7396Mat_HdKPr ;
   private boolean[] T00XB7_n7396Mat_HdKPr ;
   private java.util.Date[] T00XB7_A7397Mat_FecIng ;
   private boolean[] T00XB7_n7397Mat_FecIng ;
   private String[] T00XB7_A396EmprCod ;
   private String[] T00XB8_A396EmprCod ;
   private int[] T00XB8_A6965Mat_Hd ;
   private byte[] T00XB8_A6966Mat_Hdr ;
   private String[] T00XB8_A6967Mat_Hdp ;
   private int[] T00XB5_A6965Mat_Hd ;
   private byte[] T00XB5_A6966Mat_Hdr ;
   private String[] T00XB5_A6967Mat_Hdp ;
   private short[] T00XB5_A6968Mat_HdUl ;
   private boolean[] T00XB5_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XB5_A6969Mat_HdKgs ;
   private boolean[] T00XB5_n6969Mat_HdKgs ;
   private String[] T00XB5_A6970Mat_HdGuia ;
   private boolean[] T00XB5_n6970Mat_HdGuia ;
   private int[] T00XB5_A6971Mat_Pzas ;
   private boolean[] T00XB5_n6971Mat_Pzas ;
   private java.math.BigDecimal[] T00XB5_A7396Mat_HdKPr ;
   private boolean[] T00XB5_n7396Mat_HdKPr ;
   private java.util.Date[] T00XB5_A7397Mat_FecIng ;
   private boolean[] T00XB5_n7397Mat_FecIng ;
   private String[] T00XB5_A396EmprCod ;
   private String[] T00XB9_A396EmprCod ;
   private int[] T00XB9_A6965Mat_Hd ;
   private byte[] T00XB9_A6966Mat_Hdr ;
   private String[] T00XB9_A6967Mat_Hdp ;
   private String[] T00XB10_A396EmprCod ;
   private int[] T00XB10_A6965Mat_Hd ;
   private byte[] T00XB10_A6966Mat_Hdr ;
   private String[] T00XB10_A6967Mat_Hdp ;
   private int[] T00XB4_A6965Mat_Hd ;
   private byte[] T00XB4_A6966Mat_Hdr ;
   private String[] T00XB4_A6967Mat_Hdp ;
   private short[] T00XB4_A6968Mat_HdUl ;
   private boolean[] T00XB4_n6968Mat_HdUl ;
   private java.math.BigDecimal[] T00XB4_A6969Mat_HdKgs ;
   private boolean[] T00XB4_n6969Mat_HdKgs ;
   private String[] T00XB4_A6970Mat_HdGuia ;
   private boolean[] T00XB4_n6970Mat_HdGuia ;
   private int[] T00XB4_A6971Mat_Pzas ;
   private boolean[] T00XB4_n6971Mat_Pzas ;
   private java.math.BigDecimal[] T00XB4_A7396Mat_HdKPr ;
   private boolean[] T00XB4_n7396Mat_HdKPr ;
   private java.util.Date[] T00XB4_A7397Mat_FecIng ;
   private boolean[] T00XB4_n7397Mat_FecIng ;
   private String[] T00XB4_A396EmprCod ;
   private String[] T00XB14_A396EmprCod ;
   private int[] T00XB14_A6965Mat_Hd ;
   private byte[] T00XB14_A6966Mat_Hdr ;
   private String[] T00XB14_A6967Mat_Hdp ;
   private String[] T00XB14_A7007Mat_HdTl ;
   private String[] T00XB15_A396EmprCod ;
   private int[] T00XB15_A6965Mat_Hd ;
   private byte[] T00XB15_A6966Mat_Hdr ;
   private String[] T00XB15_A6967Mat_Hdp ;
   private String[] T00XB15_A6984Mat_HdCPz ;
   private String[] T00XB17_A396EmprCod ;
   private int[] T00XB17_A6965Mat_Hd ;
   private byte[] T00XB17_A6966Mat_Hdr ;
   private String[] T00XB17_A6967Mat_Hdp ;
   private String[] T00XB18_A6981Mat_HdObs ;
   private boolean[] T00XB18_n6981Mat_HdObs ;
   private String[] T00XB18_A396EmprCod ;
   private int[] T00XB18_A6965Mat_Hd ;
   private byte[] T00XB18_A6966Mat_Hdr ;
   private String[] T00XB18_A6967Mat_Hdp ;
   private short[] T00XB18_A6972Mat_HdLin ;
   private String[] T00XB18_A6973Mat_HdEst ;
   private boolean[] T00XB18_n6973Mat_HdEst ;
   private String[] T00XB18_A6974Mat_HdMat ;
   private boolean[] T00XB18_n6974Mat_HdMat ;
   private String[] T00XB18_A6975Mat_HdTor ;
   private boolean[] T00XB18_n6975Mat_HdTor ;
   private String[] T00XB18_A6976Mat_HdNomc ;
   private boolean[] T00XB18_n6976Mat_HdNomc ;
   private String[] T00XB18_A6977Mat_HdProv ;
   private boolean[] T00XB18_n6977Mat_HdProv ;
   private String[] T00XB18_A6978Mat_HdLote ;
   private boolean[] T00XB18_n6978Mat_HdLote ;
   private java.math.BigDecimal[] T00XB18_A6979Mat_HdPorc ;
   private boolean[] T00XB18_n6979Mat_HdPorc ;
   private java.math.BigDecimal[] T00XB18_A6980Mat_HdLm ;
   private boolean[] T00XB18_n6980Mat_HdLm ;
   private String[] T00XB18_A7106Mat_MaqTej ;
   private boolean[] T00XB18_n7106Mat_MaqTej ;
   private String[] T00XB18_A7107Mat_CliRm ;
   private boolean[] T00XB18_n7107Mat_CliRm ;
   private long[] T00XB18_A7108Mat_TraInt ;
   private boolean[] T00XB18_n7108Mat_TraInt ;
   private int[] T00XB18_A7238Mat_RecM ;
   private boolean[] T00XB18_n7238Mat_RecM ;
   private String[] T00XB19_A396EmprCod ;
   private int[] T00XB19_A6965Mat_Hd ;
   private byte[] T00XB19_A6966Mat_Hdr ;
   private String[] T00XB19_A6967Mat_Hdp ;
   private short[] T00XB19_A6972Mat_HdLin ;
   private String[] T00XB3_A6981Mat_HdObs ;
   private boolean[] T00XB3_n6981Mat_HdObs ;
   private String[] T00XB3_A396EmprCod ;
   private int[] T00XB3_A6965Mat_Hd ;
   private byte[] T00XB3_A6966Mat_Hdr ;
   private String[] T00XB3_A6967Mat_Hdp ;
   private short[] T00XB3_A6972Mat_HdLin ;
   private String[] T00XB3_A6973Mat_HdEst ;
   private boolean[] T00XB3_n6973Mat_HdEst ;
   private String[] T00XB3_A6974Mat_HdMat ;
   private boolean[] T00XB3_n6974Mat_HdMat ;
   private String[] T00XB3_A6975Mat_HdTor ;
   private boolean[] T00XB3_n6975Mat_HdTor ;
   private String[] T00XB3_A6976Mat_HdNomc ;
   private boolean[] T00XB3_n6976Mat_HdNomc ;
   private String[] T00XB3_A6977Mat_HdProv ;
   private boolean[] T00XB3_n6977Mat_HdProv ;
   private String[] T00XB3_A6978Mat_HdLote ;
   private boolean[] T00XB3_n6978Mat_HdLote ;
   private java.math.BigDecimal[] T00XB3_A6979Mat_HdPorc ;
   private boolean[] T00XB3_n6979Mat_HdPorc ;
   private java.math.BigDecimal[] T00XB3_A6980Mat_HdLm ;
   private boolean[] T00XB3_n6980Mat_HdLm ;
   private String[] T00XB3_A7106Mat_MaqTej ;
   private boolean[] T00XB3_n7106Mat_MaqTej ;
   private String[] T00XB3_A7107Mat_CliRm ;
   private boolean[] T00XB3_n7107Mat_CliRm ;
   private long[] T00XB3_A7108Mat_TraInt ;
   private boolean[] T00XB3_n7108Mat_TraInt ;
   private int[] T00XB3_A7238Mat_RecM ;
   private boolean[] T00XB3_n7238Mat_RecM ;
   private String[] T00XB2_A6981Mat_HdObs ;
   private boolean[] T00XB2_n6981Mat_HdObs ;
   private String[] T00XB2_A396EmprCod ;
   private int[] T00XB2_A6965Mat_Hd ;
   private byte[] T00XB2_A6966Mat_Hdr ;
   private String[] T00XB2_A6967Mat_Hdp ;
   private short[] T00XB2_A6972Mat_HdLin ;
   private String[] T00XB2_A6973Mat_HdEst ;
   private boolean[] T00XB2_n6973Mat_HdEst ;
   private String[] T00XB2_A6974Mat_HdMat ;
   private boolean[] T00XB2_n6974Mat_HdMat ;
   private String[] T00XB2_A6975Mat_HdTor ;
   private boolean[] T00XB2_n6975Mat_HdTor ;
   private String[] T00XB2_A6976Mat_HdNomc ;
   private boolean[] T00XB2_n6976Mat_HdNomc ;
   private String[] T00XB2_A6977Mat_HdProv ;
   private boolean[] T00XB2_n6977Mat_HdProv ;
   private String[] T00XB2_A6978Mat_HdLote ;
   private boolean[] T00XB2_n6978Mat_HdLote ;
   private java.math.BigDecimal[] T00XB2_A6979Mat_HdPorc ;
   private boolean[] T00XB2_n6979Mat_HdPorc ;
   private java.math.BigDecimal[] T00XB2_A6980Mat_HdLm ;
   private boolean[] T00XB2_n6980Mat_HdLm ;
   private String[] T00XB2_A7106Mat_MaqTej ;
   private boolean[] T00XB2_n7106Mat_MaqTej ;
   private String[] T00XB2_A7107Mat_CliRm ;
   private boolean[] T00XB2_n7107Mat_CliRm ;
   private long[] T00XB2_A7108Mat_TraInt ;
   private boolean[] T00XB2_n7108Mat_TraInt ;
   private int[] T00XB2_A7238Mat_RecM ;
   private boolean[] T00XB2_n7238Mat_RecM ;
   private String[] T00XB23_A396EmprCod ;
   private int[] T00XB23_A6965Mat_Hd ;
   private byte[] T00XB23_A6966Mat_Hdr ;
   private String[] T00XB23_A6967Mat_Hdp ;
   private short[] T00XB23_A6972Mat_HdLin ;
   private String[] T00XB24_A407EmprNom ;
   private boolean[] T00XB24_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thdrmat__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrmat__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrmat__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrmat__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdrmat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00XB2", "SELECT Mat_HdObs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM FROM TXPHDRMA1 WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdLin = ?  FOR UPDATE OF Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_HdObs, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XB3", "SELECT Mat_HdObs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM FROM TXPHDRMA1 WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XB4", "SELECT Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?  FOR UPDATE OF Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB5", "SELECT Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng, EmprCod FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB7", "SELECT /*+ FIRST_ROWS(1) */ TM1.Mat_Hd, TM1.Mat_Hdr, TM1.Mat_Hdp, T2.EmprNom, TM1.Mat_HdUl, TM1.Mat_HdKgs, TM1.Mat_HdGuia, TM1.Mat_Pzas, TM1.Mat_HdKPr, TM1.Mat_FecIng, TM1.EmprCod FROM (TXPHDRMAT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Mat_Hd = ? and TM1.Mat_Hdr = ? and TM1.Mat_Hdp = ? ORDER BY TM1.EmprCod, TM1.Mat_Hd, TM1.Mat_Hdr, TM1.Mat_Hdp ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod DESC, Mat_Hd DESC, Mat_Hdr DESC, Mat_Hdp DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XB11", "INSERT INTO TXPHDRMAT(Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRMAT")
         ,new UpdateCursor("T00XB12", "UPDATE TXPHDRMAT SET Mat_HdUl=?, Mat_HdKgs=?, Mat_HdGuia=?, Mat_Pzas=?, Mat_HdKPr=?, Mat_FecIng=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK, "TXPHDRMAT")
         ,new UpdateCursor("T00XB13", "DELETE FROM TXPHDRMAT  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK, "TXPHDRMAT")
         ,new ForEachCursor("T00XB14", "SELECT * FROM (SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl FROM TXPHDRTAL WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB15", "SELECT * FROM (SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdCPz FROM TXPHDRPZS WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XB16", "UPDATE TXPHDRMAT SET Mat_HdUl=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ?", GX_NOMASK, "TXPHDRMAT")
         ,new ForEachCursor("T00XB17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XB18", "SELECT Mat_HdObs, EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? and Mat_HdLin = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XB19", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00XB20", "INSERT INTO TXPHDRMA1(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_HdObs, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHDRMA1")
         ,new UpdateCursor("T00XB21", "UPDATE TXPHDRMA1 SET Mat_HdEst=?, Mat_HdMat=?, Mat_HdTor=?, Mat_HdNomc=?, Mat_HdProv=?, Mat_HdLote=?, Mat_HdPorc=?, Mat_HdLm=?, Mat_HdObs=?, Mat_MaqTej=?, Mat_CliRm=?, Mat_TraInt=?, Mat_RecM=?  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdLin = ?", GX_NOMASK, "TXPHDRMA1")
         ,new UpdateCursor("T00XB22", "DELETE FROM TXPHDRMA1  WHERE EmprCod = ? AND Mat_Hd = ? AND Mat_Hdr = ? AND Mat_Hdp = ? AND Mat_HdLin = ?", GX_NOMASK, "TXPHDRMA1")
         ,new ForEachCursor("T00XB23", "SELECT EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XB24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[10]).intValue());
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
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[14]);
               }
               stmt.setString(10, (String)parms[15], 3);
               return;
            case 10 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
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
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[11]);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setByte(9, ((Number) parms[14]).byteValue());
               stmt.setString(10, (String)parms[15], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 30);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[28]).longValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
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
                  stmt.setNull( 9 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 30);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setByte(16, ((Number) parms[28]).byteValue());
               stmt.setString(17, (String)parms[29], 1);
               stmt.setShort(18, ((Number) parms[30]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
      }
   }

}

