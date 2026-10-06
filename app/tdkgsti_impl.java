package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdkgsti_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2959TiBarCod = (int)(GXutil.lval( httpContext.GetPar( "TiBarCod"))) ;
         A2960TiBarReo = (byte)(GXutil.lval( httpContext.GetPar( "TiBarReo"))) ;
         A2961TiBarPar = httpContext.GetPar( "TiBarPar") ;
         A2962TiKgs = CommonUtil.decimalVal( httpContext.GetPar( "TiKgs"), ".") ;
         n2962TiKgs = false ;
         A2963TiConos = (short)(GXutil.lval( httpContext.GetPar( "TiConos"))) ;
         n2963TiConos = false ;
         A2964TiTipDis = httpContext.GetPar( "TiTipDis") ;
         n2964TiTipDis = false ;
         A2965TiMaqCod = httpContext.GetPar( "TiMaqCod") ;
         n2965TiMaqCod = false ;
         A2967TiReoper = (byte)(GXutil.lval( httpContext.GetPar( "TiReoper"))) ;
         n2967TiReoper = false ;
         A2968TiAgrupa = httpContext.GetPar( "TiAgrupa") ;
         n2968TiAgrupa = false ;
         A2969TiCosteP = CommonUtil.decimalVal( httpContext.GetPar( "TiCosteP"), ".") ;
         n2969TiCosteP = false ;
         A2970TiCosteA = CommonUtil.decimalVal( httpContext.GetPar( "TiCosteA"), ".") ;
         n2970TiCosteA = false ;
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_AB438( Gx_mode, A396EmprCod, A2959TiBarCod, A2960TiBarReo, A2961TiBarPar, A2962TiKgs, A2963TiConos, A2964TiTipDis, A2965TiMaqCod, A2967TiReoper, A2968TiAgrupa, A2969TiCosteP, A2970TiCosteA, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "KILOS TINTADOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTiDia_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A2957TiUltLin = (byte)(GXutil.lval( httpContext.GetPar( "TiUltLin"))) ;
      n2957TiUltLin = false ;
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

   public tdkgsti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdkgsti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdkgsti_impl.class ));
   }

   public tdkgsti_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDKGSTI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTiDia_Internalname, GXutil.ltrim( localUtil.ntoc( A2954TiDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTiDia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2954TiDia), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2954TiDia), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTiDia_Jsonclick, 0, "", "", "", "", "", 1, edtTiDia_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTiMes_Internalname, GXutil.ltrim( localUtil.ntoc( A2955TiMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTiMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2955TiMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2955TiMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTiMes_Jsonclick, 0, "", "", "", "", "", 1, edtTiMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Any", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTiAny_Internalname, GXutil.ltrim( localUtil.ntoc( A2956TiAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTiAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2956TiAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2956TiAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTiAny_Jsonclick, 0, "", "", "", "", "", 1, edtTiAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTiUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2957TiUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTiUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2957TiUltLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2957TiUltLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTiUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtTiUltLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDKGSTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount438 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_438 = (short)(1) ;
            scanStartAB438( ) ;
            while ( RcdFound438 != 0 )
            {
               init_level_properties438( ) ;
               getByPrimaryKeyAB438( ) ;
               addRowAB438( ) ;
               scanNextAB438( ) ;
            }
            scanEndAB438( ) ;
            nBlankRcdCount438 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2957TiUltLin = A2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         standaloneNotModalAB438( ) ;
         standaloneModalAB438( ) ;
         sMode438 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRowAB438( ) ;
            edtavnRcdDeleted_438_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_438_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_438_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_438_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TILIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARREO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARPAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIKGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiKgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiConos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICONOS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiConos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiConos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiTipDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TITIPDIS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiTipDis_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIMAQCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiMaqCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TITIPART_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiTipArt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiReoper_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIREOPER_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiReoper_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiReoper_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiAgrupa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIAGRUPA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiAgrupa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiAgrupa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiCosteP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICOSTEP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiCosteP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiCosteP_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTiCosteA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICOSTEA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTiCosteA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiCosteA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_438 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalAB438( ) ;
            }
            sendRowAB438( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode438 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2957TiUltLin = B2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount438 = (short)(5) ;
         nRcdExists_438 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartAB438( ) ;
            while ( RcdFound438 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_50438( ) ;
               init_level_properties438( ) ;
               standaloneNotModalAB438( ) ;
               getByPrimaryKeyAB438( ) ;
               standaloneModalAB438( ) ;
               addRowAB438( ) ;
               scanNextAB438( ) ;
            }
            scanEndAB438( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode438 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_50438( ) ;
      initAllAB438( ) ;
      init_level_properties438( ) ;
      B2957TiUltLin = A2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      nRcdExists_438 = (short)(0) ;
      nIsMod_438 = (short)(0) ;
      nRcdDeleted_438 = (short)(0) ;
      nBlankRcdCount438 = (short)(nBlankRcdUsr438+nBlankRcdCount438) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount438 > 0 )
      {
         standaloneNotModalAB438( ) ;
         standaloneModalAB438( ) ;
         addRowAB438( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTiLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount438 = (short)(nBlankRcdCount438-1) ;
      }
      Gx_mode = sMode438 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A2957TiUltLin = B2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDKGSTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDKGSTI.htm");
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
      e11AB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2954TiDia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2954TiDia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2955TiMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2955TiMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2956TiAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z2956TiAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2957TiUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2957TiUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O2957TiUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "O2957TiUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIDIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTiDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2954TiDia = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
            }
            else
            {
               A2954TiDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIMES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTiMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2955TiMes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
            }
            else
            {
               A2955TiMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTiAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2956TiAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
            }
            else
            {
               A2956TiAny = (short)(localUtil.ctol( httpContext.cgiGet( edtTiAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
            }
            A2957TiUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2957TiUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A2954TiDia = (byte)(GXutil.lval( httpContext.GetPar( "TiDia"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
               A2955TiMes = (byte)(GXutil.lval( httpContext.GetPar( "TiMes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
               A2956TiAny = (short)(GXutil.lval( httpContext.GetPar( "TiAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
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
                        e11AB2 ();
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
            initAllAB437( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_438_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_438_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributesAB437( ) ;
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

   public void confirm_AB0( )
   {
      beforeValidateAB437( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsAB437( ) ;
         }
         else
         {
            checkExtendedTableAB437( ) ;
            if ( AnyError == 0 )
            {
               zmAB437( 9) ;
            }
            closeExtendedTableCursorsAB437( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode437 = Gx_mode ;
         confirm_AB438( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode437 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode437 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesAB0( ) ;
      }
   }

   public void confirm_AB438( )
   {
      s2957TiUltLin = O2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowAB438( ) ;
         if ( ( nRcdExists_438 != 0 ) || ( nIsMod_438 != 0 ) )
         {
            getKeyAB438( ) ;
            if ( ( nRcdExists_438 == 0 ) && ( nRcdDeleted_438 == 0 ) )
            {
               if ( RcdFound438 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateAB438( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableAB438( ) ;
                     if ( AnyError == 0 )
                     {
                        zmAB438( 11) ;
                     }
                     closeExtendedTableCursorsAB438( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2957TiUltLin = A2957TiUltLin ;
                     n2957TiUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "TILIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTiLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound438 != 0 )
               {
                  if ( nRcdDeleted_438 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyAB438( ) ;
                     loadAB438( ) ;
                     beforeValidateAB438( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsAB438( ) ;
                        O2957TiUltLin = A2957TiUltLin ;
                        n2957TiUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_438 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateAB438( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableAB438( ) ;
                           if ( AnyError == 0 )
                           {
                              zmAB438( 11) ;
                           }
                           closeExtendedTableCursorsAB438( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2957TiUltLin = A2957TiUltLin ;
                           n2957TiUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_438 == 0 )
                  {
                     GXCCtl = "TILIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTiLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_438_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarPar_Internalname, GXutil.rtrim( A2961TiBarPar)) ;
         httpContext.changePostValue( edtTiKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiConos_Internalname, GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiTipDis_Internalname, GXutil.rtrim( A2964TiTipDis)) ;
         httpContext.changePostValue( edtTiMaqCod_Internalname, GXutil.rtrim( A2965TiMaqCod)) ;
         httpContext.changePostValue( edtTiTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiReoper_Internalname, GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiAgrupa_Internalname, GXutil.rtrim( A2968TiAgrupa)) ;
         httpContext.changePostValue( edtTiCosteP_Internalname, GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiCosteA_Internalname, GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2958TiLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2959TiBarCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2960TiBarReo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2961TiBarPar_"+sGXsfl_50_idx, GXutil.rtrim( Z2961TiBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2962TiKgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2963TiConos_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2964TiTipDis_"+sGXsfl_50_idx, GXutil.rtrim( Z2964TiTipDis)) ;
         httpContext.changePostValue( "ZT_"+"Z2965TiMaqCod_"+sGXsfl_50_idx, GXutil.rtrim( Z2965TiMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2966TiTipArt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2967TiReoper_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2968TiAgrupa_"+sGXsfl_50_idx, GXutil.rtrim( Z2968TiAgrupa)) ;
         httpContext.changePostValue( "ZT_"+"Z2969TiCosteP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2970TiCosteA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_438 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_438_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_438_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TILIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICONOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiConos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TITIPDIS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIMAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TITIPART_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIREOPER_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiReoper_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIAGRUPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiAgrupa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICOSTEP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICOSTEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2957TiUltLin = s2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionAB0( )
   {
   }

   public void e11AB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV30EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char1, GXv_char2, GXv_char3) ;
      tdkgsti_impl.this.A396EmprCod = GXv_char1[0] ;
      tdkgsti_impl.this.AV30EmprNom = GXv_char2[0] ;
      tdkgsti_impl.this.AV8UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char4 = AV7Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tdkgsti_impl.this.GXt_char4 = GXv_char3[0] ;
      AV7Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "ESTADISTICA KILOS TINTADOS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char4 = AV9LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tdkgsti_impl.this.GXt_char4 = GXv_char3[0] ;
      AV9LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
   }

   public void zmAB437( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2957TiUltLin = T00AB6_A2957TiUltLin[0] ;
         }
         else
         {
            Z2957TiUltLin = A2957TiUltLin ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z2954TiDia = A2954TiDia ;
         Z2955TiMes = A2955TiMes ;
         Z2956TiAny = A2956TiAny ;
         Z2957TiUltLin = A2957TiUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTiUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiUltLin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTiUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiUltLin_Enabled), 5, 0), true);
      /* Using cursor T00AB7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00AB7_A407EmprNom[0] ;
      n407EmprNom = T00AB7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void loadAB437( )
   {
      /* Using cursor T00AB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound437 = (short)(1) ;
         A2957TiUltLin = T00AB8_A2957TiUltLin[0] ;
         n2957TiUltLin = T00AB8_n2957TiUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         A407EmprNom = T00AB8_A407EmprNom[0] ;
         n407EmprNom = T00AB8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmAB437( -8) ;
      }
      pr_default.close(6);
      onLoadActionsAB437( ) ;
   }

   public void onLoadActionsAB437( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTableAB437( )
   {
      nIsDirty_437 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
      if ( A2956TiAny == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "valor Incorrecto", ""), 1, "TIANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiAny_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsAB437( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyAB437( )
   {
      /* Using cursor T00AB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound437 = (short)(1) ;
      }
      else
      {
         RcdFound437 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00AB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00AB6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmAB437( 8) ;
         RcdFound437 = (short)(1) ;
         A2954TiDia = T00AB6_A2954TiDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
         A2955TiMes = T00AB6_A2955TiMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
         A2956TiAny = T00AB6_A2956TiAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
         A2957TiUltLin = T00AB6_A2957TiUltLin[0] ;
         n2957TiUltLin = T00AB6_n2957TiUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         O2957TiUltLin = A2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z2954TiDia = A2954TiDia ;
         Z2955TiMes = A2955TiMes ;
         Z2956TiAny = A2956TiAny ;
         sMode437 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadAB437( ) ;
         if ( AnyError == 1 )
         {
            RcdFound437 = (short)(0) ;
            initializeNonKeyAB437( ) ;
         }
         Gx_mode = sMode437 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound437 = (short)(0) ;
         initializeNonKeyAB437( ) ;
         sMode437 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode437 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyAB437( ) ;
      if ( RcdFound437 == 0 )
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
      RcdFound437 = (short)(0) ;
      /* Using cursor T00AB10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A2954TiDia), Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Byte.valueOf(A2955TiMes), Byte.valueOf(A2954TiDia), Short.valueOf(A2956TiAny), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T00AB10_A2954TiDia[0] < A2954TiDia ) || ( T00AB10_A2954TiDia[0] == A2954TiDia ) && ( T00AB10_A2955TiMes[0] < A2955TiMes ) || ( T00AB10_A2955TiMes[0] == A2955TiMes ) && ( T00AB10_A2954TiDia[0] == A2954TiDia ) && ( T00AB10_A2956TiAny[0] < A2956TiAny ) ) && ( GXutil.strcmp(T00AB10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T00AB10_A2954TiDia[0] > A2954TiDia ) || ( T00AB10_A2954TiDia[0] == A2954TiDia ) && ( T00AB10_A2955TiMes[0] > A2955TiMes ) || ( T00AB10_A2955TiMes[0] == A2955TiMes ) && ( T00AB10_A2954TiDia[0] == A2954TiDia ) && ( T00AB10_A2956TiAny[0] > A2956TiAny ) ) && ( GXutil.strcmp(T00AB10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2954TiDia = T00AB10_A2954TiDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
            A2955TiMes = T00AB10_A2955TiMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
            A2956TiAny = T00AB10_A2956TiAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
            RcdFound437 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound437 = (short)(0) ;
      /* Using cursor T00AB11 */
      pr_default.execute(9, new Object[] {Byte.valueOf(A2954TiDia), Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Byte.valueOf(A2955TiMes), Byte.valueOf(A2954TiDia), Short.valueOf(A2956TiAny), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00AB11_A2954TiDia[0] > A2954TiDia ) || ( T00AB11_A2954TiDia[0] == A2954TiDia ) && ( T00AB11_A2955TiMes[0] > A2955TiMes ) || ( T00AB11_A2955TiMes[0] == A2955TiMes ) && ( T00AB11_A2954TiDia[0] == A2954TiDia ) && ( T00AB11_A2956TiAny[0] > A2956TiAny ) ) && ( GXutil.strcmp(T00AB11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00AB11_A2954TiDia[0] < A2954TiDia ) || ( T00AB11_A2954TiDia[0] == A2954TiDia ) && ( T00AB11_A2955TiMes[0] < A2955TiMes ) || ( T00AB11_A2955TiMes[0] == A2955TiMes ) && ( T00AB11_A2954TiDia[0] == A2954TiDia ) && ( T00AB11_A2956TiAny[0] < A2956TiAny ) ) && ( GXutil.strcmp(T00AB11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A2954TiDia = T00AB11_A2954TiDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
            A2955TiMes = T00AB11_A2955TiMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
            A2956TiAny = T00AB11_A2956TiAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
            RcdFound437 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyAB437( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2957TiUltLin = O2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         GX_FocusControl = edtTiDia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertAB437( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound437 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2954TiDia != Z2954TiDia ) || ( A2955TiMes != Z2955TiMes ) || ( A2956TiAny != Z2956TiAny ) )
            {
               A2954TiDia = Z2954TiDia ;
               httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
               A2955TiMes = Z2955TiMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
               A2956TiAny = Z2956TiAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2957TiUltLin = O2957TiUltLin ;
               n2957TiUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTiDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A2957TiUltLin = O2957TiUltLin ;
               n2957TiUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
               updateAB437( ) ;
               GX_FocusControl = edtTiDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2954TiDia != Z2954TiDia ) || ( A2955TiMes != Z2955TiMes ) || ( A2956TiAny != Z2956TiAny ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2957TiUltLin = O2957TiUltLin ;
               n2957TiUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
               GX_FocusControl = edtTiDia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertAB437( ) ;
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
                  A2957TiUltLin = O2957TiUltLin ;
                  n2957TiUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
                  GX_FocusControl = edtTiDia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertAB437( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2954TiDia != Z2954TiDia ) || ( A2955TiMes != Z2955TiMes ) || ( A2956TiAny != Z2956TiAny ) )
      {
         A2954TiDia = Z2954TiDia ;
         httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
         A2955TiMes = Z2955TiMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
         A2956TiAny = Z2956TiAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2957TiUltLin = O2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTiDia_Internalname ;
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
      getKeyAB437( ) ;
      if ( RcdFound437 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2954TiDia != Z2954TiDia ) || ( A2955TiMes != Z2955TiMes ) || ( A2956TiAny != Z2956TiAny ) )
         {
            A2954TiDia = Z2954TiDia ;
            httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
            A2955TiMes = Z2955TiMes ;
            httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
            A2956TiAny = Z2956TiAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2954TiDia != Z2954TiDia ) || ( A2955TiMes != Z2955TiMes ) || ( A2956TiAny != Z2956TiAny ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdkgsti");
   }

   public void insert_check( )
   {
      confirm_AB0( ) ;
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
      if ( RcdFound437 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartAB437( ) ;
      if ( RcdFound437 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndAB437( ) ;
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
      if ( RcdFound437 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound437 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartAB437( ) ;
      if ( RcdFound437 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound437 != 0 )
         {
            scanNextAB437( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndAB437( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyAB437( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00AB5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCKGSTI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z2957TiUltLin != T00AB5_A2957TiUltLin[0] ) )
         {
            if ( Z2957TiUltLin != T00AB5_A2957TiUltLin[0] )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiUltLin");
               GXutil.writeLogRaw("Old: ",Z2957TiUltLin);
               GXutil.writeLogRaw("Current: ",T00AB5_A2957TiUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCKGSTI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertAB437( )
   {
      beforeValidateAB437( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAB437( ) ;
      }
      if ( AnyError == 0 )
      {
         zmAB437( 0) ;
         checkOptimisticConcurrencyAB437( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAB437( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertAB437( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AB12 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Boolean.valueOf(n2957TiUltLin), Byte.valueOf(A2957TiUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSTI");
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
                        processLevelAB437( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionAB0( ) ;
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
            loadAB437( ) ;
         }
         endLevelAB437( ) ;
      }
      closeExtendedTableCursorsAB437( ) ;
   }

   public void updateAB437( )
   {
      beforeValidateAB437( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAB437( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAB437( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAB437( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateAB437( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AB13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n2957TiUltLin), Byte.valueOf(A2957TiUltLin), A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSTI");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCKGSTI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateAB437( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelAB437( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionAB0( ) ;
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
         endLevelAB437( ) ;
      }
      closeExtendedTableCursorsAB437( ) ;
   }

   public void deferredUpdateAB437( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateAB437( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAB437( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsAB437( ) ;
         afterConfirmAB437( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteAB437( ) ;
            if ( AnyError == 0 )
            {
               A2957TiUltLin = O2957TiUltLin ;
               n2957TiUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
               scanStartAB438( ) ;
               while ( RcdFound438 != 0 )
               {
                  getByPrimaryKeyAB438( ) ;
                  deleteAB438( ) ;
                  scanNextAB438( ) ;
                  O2957TiUltLin = A2957TiUltLin ;
                  n2957TiUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
               }
               scanEndAB438( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AB14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSTI");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound437 == 0 )
                        {
                           initAllAB437( ) ;
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
                        resetCaptionAB0( ) ;
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
      sMode437 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelAB437( ) ;
      Gx_mode = sMode437 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsAB437( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
   }

   public void processNestedLevelAB438( )
   {
      s2957TiUltLin = O2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRowAB438( ) ;
         if ( ( nRcdExists_438 != 0 ) || ( nIsMod_438 != 0 ) )
         {
            standaloneNotModalAB438( ) ;
            getKeyAB438( ) ;
            if ( ( nRcdExists_438 == 0 ) && ( nRcdDeleted_438 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertAB438( ) ;
            }
            else
            {
               if ( RcdFound438 != 0 )
               {
                  if ( ( nRcdDeleted_438 != 0 ) && ( nRcdExists_438 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteAB438( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_438 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateAB438( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_438 == 0 )
                  {
                     GXCCtl = "TILIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTiLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2957TiUltLin = A2957TiUltLin ;
            n2957TiUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_438_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiBarPar_Internalname, GXutil.rtrim( A2961TiBarPar)) ;
         httpContext.changePostValue( edtTiKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiConos_Internalname, GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiTipDis_Internalname, GXutil.rtrim( A2964TiTipDis)) ;
         httpContext.changePostValue( edtTiMaqCod_Internalname, GXutil.rtrim( A2965TiMaqCod)) ;
         httpContext.changePostValue( edtTiTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiReoper_Internalname, GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiAgrupa_Internalname, GXutil.rtrim( A2968TiAgrupa)) ;
         httpContext.changePostValue( edtTiCosteP_Internalname, GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTiCosteA_Internalname, GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2958TiLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2959TiBarCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2960TiBarReo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2961TiBarPar_"+sGXsfl_50_idx, GXutil.rtrim( Z2961TiBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2962TiKgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2963TiConos_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2964TiTipDis_"+sGXsfl_50_idx, GXutil.rtrim( Z2964TiTipDis)) ;
         httpContext.changePostValue( "ZT_"+"Z2965TiMaqCod_"+sGXsfl_50_idx, GXutil.rtrim( Z2965TiMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z2966TiTipArt_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2967TiReoper_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2968TiAgrupa_"+sGXsfl_50_idx, GXutil.rtrim( Z2968TiAgrupa)) ;
         httpContext.changePostValue( "ZT_"+"Z2969TiCosteP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2970TiCosteA_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_438_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_438 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_438_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_438_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TILIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIBARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICONOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiConos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TITIPDIS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIMAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TITIPART_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIREOPER_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiReoper_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIAGRUPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiAgrupa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICOSTEP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TICOSTEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllAB438( ) ;
      if ( AnyError != 0 )
      {
         O2957TiUltLin = s2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      }
      nRcdExists_438 = (short)(0) ;
      nIsMod_438 = (short)(0) ;
      nRcdDeleted_438 = (short)(0) ;
   }

   public void processLevelAB437( )
   {
      /* Save parent mode. */
      sMode437 = Gx_mode ;
      processNestedLevelAB438( ) ;
      if ( AnyError != 0 )
      {
         O2957TiUltLin = s2957TiUltLin ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode437 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00AB15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n2957TiUltLin), Byte.valueOf(A2957TiUltLin), A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCKGSTI");
   }

   public void endLevelAB437( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteAB437( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdkgsti");
         if ( AnyError == 0 )
         {
            confirmValuesAB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdkgsti");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartAB437( )
   {
      /* Scan By routine */
      /* Using cursor T00AB16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound437 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound437 = (short)(1) ;
         A2954TiDia = T00AB16_A2954TiDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
         A2955TiMes = T00AB16_A2955TiMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
         A2956TiAny = T00AB16_A2956TiAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextAB437( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound437 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound437 = (short)(1) ;
         A2954TiDia = T00AB16_A2954TiDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
         A2955TiMes = T00AB16_A2955TiMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
         A2956TiAny = T00AB16_A2956TiAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
      }
   }

   public void scanEndAB437( )
   {
      pr_default.close(14);
   }

   public void afterConfirmAB437( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertAB437( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateAB437( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteAB437( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteAB437( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateAB437( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesAB437( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtTiDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiDia_Enabled), 5, 0), true);
      edtTiMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiMes_Enabled), 5, 0), true);
      edtTiAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiAny_Enabled), 5, 0), true);
      edtTiUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiUltLin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmAB438( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2962TiKgs = T00AB3_A2962TiKgs[0] ;
            Z2963TiConos = T00AB3_A2963TiConos[0] ;
            Z2964TiTipDis = T00AB3_A2964TiTipDis[0] ;
            Z2965TiMaqCod = T00AB3_A2965TiMaqCod[0] ;
            Z2966TiTipArt = T00AB3_A2966TiTipArt[0] ;
            Z2967TiReoper = T00AB3_A2967TiReoper[0] ;
            Z2968TiAgrupa = T00AB3_A2968TiAgrupa[0] ;
            Z2969TiCosteP = T00AB3_A2969TiCosteP[0] ;
            Z2970TiCosteA = T00AB3_A2970TiCosteA[0] ;
            Z252CliCod = T00AB3_A252CliCod[0] ;
         }
         else
         {
            Z2962TiKgs = A2962TiKgs ;
            Z2963TiConos = A2963TiConos ;
            Z2964TiTipDis = A2964TiTipDis ;
            Z2965TiMaqCod = A2965TiMaqCod ;
            Z2966TiTipArt = A2966TiTipArt ;
            Z2967TiReoper = A2967TiReoper ;
            Z2968TiAgrupa = A2968TiAgrupa ;
            Z2969TiCosteP = A2969TiCosteP ;
            Z2970TiCosteA = A2970TiCosteA ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z2954TiDia = A2954TiDia ;
         Z2955TiMes = A2955TiMes ;
         Z2956TiAny = A2956TiAny ;
         Z2958TiLin = A2958TiLin ;
         Z2959TiBarCod = A2959TiBarCod ;
         Z2960TiBarReo = A2960TiBarReo ;
         Z2961TiBarPar = A2961TiBarPar ;
         Z2962TiKgs = A2962TiKgs ;
         Z2963TiConos = A2963TiConos ;
         Z2964TiTipDis = A2964TiTipDis ;
         Z2965TiMaqCod = A2965TiMaqCod ;
         Z2966TiTipArt = A2966TiTipArt ;
         Z2967TiReoper = A2967TiReoper ;
         Z2968TiAgrupa = A2968TiAgrupa ;
         Z2969TiCosteP = A2969TiCosteP ;
         Z2970TiCosteA = A2970TiCosteA ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModalAB438( )
   {
      edtTiUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiUltLin_Enabled), 5, 0), true);
      edtTiUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModalAB438( )
   {
      if ( isIns( )  )
      {
         A2957TiUltLin = (byte)(O2957TiUltLin+1) ;
         n2957TiUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2958TiLin = A2957TiUltLin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTiLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtTiLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTiBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtTiBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTiBarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtTiBarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTiBarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtTiBarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTiBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void loadAB438( )
   {
      /* Using cursor T00AB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound438 = (short)(1) ;
         A2962TiKgs = T00AB17_A2962TiKgs[0] ;
         n2962TiKgs = T00AB17_n2962TiKgs[0] ;
         A2963TiConos = T00AB17_A2963TiConos[0] ;
         n2963TiConos = T00AB17_n2963TiConos[0] ;
         A2964TiTipDis = T00AB17_A2964TiTipDis[0] ;
         n2964TiTipDis = T00AB17_n2964TiTipDis[0] ;
         A2965TiMaqCod = T00AB17_A2965TiMaqCod[0] ;
         n2965TiMaqCod = T00AB17_n2965TiMaqCod[0] ;
         A2966TiTipArt = T00AB17_A2966TiTipArt[0] ;
         n2966TiTipArt = T00AB17_n2966TiTipArt[0] ;
         A2967TiReoper = T00AB17_A2967TiReoper[0] ;
         n2967TiReoper = T00AB17_n2967TiReoper[0] ;
         A2968TiAgrupa = T00AB17_A2968TiAgrupa[0] ;
         n2968TiAgrupa = T00AB17_n2968TiAgrupa[0] ;
         A2969TiCosteP = T00AB17_A2969TiCosteP[0] ;
         n2969TiCosteP = T00AB17_n2969TiCosteP[0] ;
         A2970TiCosteA = T00AB17_A2970TiCosteA[0] ;
         n2970TiCosteA = T00AB17_n2970TiCosteA[0] ;
         A252CliCod = T00AB17_A252CliCod[0] ;
         n252CliCod = T00AB17_n252CliCod[0] ;
         zmAB438( -10) ;
      }
      pr_default.close(15);
      onLoadActionsAB438( ) ;
   }

   public void onLoadActionsAB438( )
   {
   }

   public void checkExtendedTableAB438( )
   {
      nIsDirty_438 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalAB438( ) ;
      /* Using cursor T00AB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( isIns( )  && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int5[0] = A2959TiBarCod ;
         GXv_int6[0] = A2960TiBarReo ;
         GXv_char2[0] = A2961TiBarPar ;
         GXv_decimal7[0] = A2962TiKgs ;
         GXv_int8[0] = A2963TiConos ;
         GXv_char1[0] = A2964TiTipDis ;
         GXv_char9[0] = A2965TiMaqCod ;
         GXv_int10[0] = A2967TiReoper ;
         GXv_char11[0] = A2968TiAgrupa ;
         GXv_decimal12[0] = A2969TiCosteP ;
         GXv_decimal13[0] = A2970TiCosteA ;
         GXv_int14[0] = A252CliCod ;
         new app.pordexg(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_decimal7, GXv_int8, GXv_char1, GXv_char9, GXv_int10, GXv_char11, GXv_decimal12, GXv_decimal13, GXv_int14) ;
         tdkgsti_impl.this.A396EmprCod = GXv_char3[0] ;
         tdkgsti_impl.this.A2959TiBarCod = GXv_int5[0] ;
         tdkgsti_impl.this.A2960TiBarReo = GXv_int6[0] ;
         tdkgsti_impl.this.A2961TiBarPar = GXv_char2[0] ;
         tdkgsti_impl.this.A2962TiKgs = GXv_decimal7[0] ;
         tdkgsti_impl.this.A2963TiConos = GXv_int8[0] ;
         tdkgsti_impl.this.A2964TiTipDis = GXv_char1[0] ;
         tdkgsti_impl.this.A2965TiMaqCod = GXv_char9[0] ;
         tdkgsti_impl.this.A2967TiReoper = GXv_int10[0] ;
         tdkgsti_impl.this.A2968TiAgrupa = GXv_char11[0] ;
         tdkgsti_impl.this.A2969TiCosteP = GXv_decimal12[0] ;
         tdkgsti_impl.this.A2970TiCosteA = GXv_decimal13[0] ;
         tdkgsti_impl.this.A252CliCod = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void closeExtendedTableCursorsAB438( )
   {
      pr_default.close(2);
   }

   public void enableDisableAB438( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00AB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKeyAB438( )
   {
      /* Using cursor T00AB19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound438 = (short)(1) ;
      }
      else
      {
         RcdFound438 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyAB438( )
   {
      /* Using cursor T00AB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00AB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmAB438( 10) ;
         RcdFound438 = (short)(1) ;
         initializeNonKeyAB438( ) ;
         A2958TiLin = T00AB3_A2958TiLin[0] ;
         A2959TiBarCod = T00AB3_A2959TiBarCod[0] ;
         A2960TiBarReo = T00AB3_A2960TiBarReo[0] ;
         A2961TiBarPar = T00AB3_A2961TiBarPar[0] ;
         A2962TiKgs = T00AB3_A2962TiKgs[0] ;
         n2962TiKgs = T00AB3_n2962TiKgs[0] ;
         A2963TiConos = T00AB3_A2963TiConos[0] ;
         n2963TiConos = T00AB3_n2963TiConos[0] ;
         A2964TiTipDis = T00AB3_A2964TiTipDis[0] ;
         n2964TiTipDis = T00AB3_n2964TiTipDis[0] ;
         A2965TiMaqCod = T00AB3_A2965TiMaqCod[0] ;
         n2965TiMaqCod = T00AB3_n2965TiMaqCod[0] ;
         A2966TiTipArt = T00AB3_A2966TiTipArt[0] ;
         n2966TiTipArt = T00AB3_n2966TiTipArt[0] ;
         A2967TiReoper = T00AB3_A2967TiReoper[0] ;
         n2967TiReoper = T00AB3_n2967TiReoper[0] ;
         A2968TiAgrupa = T00AB3_A2968TiAgrupa[0] ;
         n2968TiAgrupa = T00AB3_n2968TiAgrupa[0] ;
         A2969TiCosteP = T00AB3_A2969TiCosteP[0] ;
         n2969TiCosteP = T00AB3_n2969TiCosteP[0] ;
         A2970TiCosteA = T00AB3_A2970TiCosteA[0] ;
         n2970TiCosteA = T00AB3_n2970TiCosteA[0] ;
         A252CliCod = T00AB3_A252CliCod[0] ;
         n252CliCod = T00AB3_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z2954TiDia = A2954TiDia ;
         Z2955TiMes = A2955TiMes ;
         Z2956TiAny = A2956TiAny ;
         Z2958TiLin = A2958TiLin ;
         Z2959TiBarCod = A2959TiBarCod ;
         Z2960TiBarReo = A2960TiBarReo ;
         Z2961TiBarPar = A2961TiBarPar ;
         sMode438 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalAB438( ) ;
         loadAB438( ) ;
         Gx_mode = sMode438 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound438 = (short)(0) ;
         initializeNonKeyAB438( ) ;
         sMode438 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalAB438( ) ;
         Gx_mode = sMode438 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesAB438( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyAB438( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00AB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLKGSTI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2962TiKgs, T00AB2_A2962TiKgs[0]) != 0 ) || ( Z2963TiConos != T00AB2_A2963TiConos[0] ) || ( GXutil.strcmp(Z2964TiTipDis, T00AB2_A2964TiTipDis[0]) != 0 ) || ( GXutil.strcmp(Z2965TiMaqCod, T00AB2_A2965TiMaqCod[0]) != 0 ) || ( Z2966TiTipArt != T00AB2_A2966TiTipArt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2967TiReoper != T00AB2_A2967TiReoper[0] ) || ( GXutil.strcmp(Z2968TiAgrupa, T00AB2_A2968TiAgrupa[0]) != 0 ) || ( DecimalUtil.compareTo(Z2969TiCosteP, T00AB2_A2969TiCosteP[0]) != 0 ) || ( DecimalUtil.compareTo(Z2970TiCosteA, T00AB2_A2970TiCosteA[0]) != 0 ) || ( Z252CliCod != T00AB2_A252CliCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z2962TiKgs, T00AB2_A2962TiKgs[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiKgs");
               GXutil.writeLogRaw("Old: ",Z2962TiKgs);
               GXutil.writeLogRaw("Current: ",T00AB2_A2962TiKgs[0]);
            }
            if ( Z2963TiConos != T00AB2_A2963TiConos[0] )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiConos");
               GXutil.writeLogRaw("Old: ",Z2963TiConos);
               GXutil.writeLogRaw("Current: ",T00AB2_A2963TiConos[0]);
            }
            if ( GXutil.strcmp(Z2964TiTipDis, T00AB2_A2964TiTipDis[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiTipDis");
               GXutil.writeLogRaw("Old: ",Z2964TiTipDis);
               GXutil.writeLogRaw("Current: ",T00AB2_A2964TiTipDis[0]);
            }
            if ( GXutil.strcmp(Z2965TiMaqCod, T00AB2_A2965TiMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiMaqCod");
               GXutil.writeLogRaw("Old: ",Z2965TiMaqCod);
               GXutil.writeLogRaw("Current: ",T00AB2_A2965TiMaqCod[0]);
            }
            if ( Z2966TiTipArt != T00AB2_A2966TiTipArt[0] )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiTipArt");
               GXutil.writeLogRaw("Old: ",Z2966TiTipArt);
               GXutil.writeLogRaw("Current: ",T00AB2_A2966TiTipArt[0]);
            }
            if ( Z2967TiReoper != T00AB2_A2967TiReoper[0] )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiReoper");
               GXutil.writeLogRaw("Old: ",Z2967TiReoper);
               GXutil.writeLogRaw("Current: ",T00AB2_A2967TiReoper[0]);
            }
            if ( GXutil.strcmp(Z2968TiAgrupa, T00AB2_A2968TiAgrupa[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiAgrupa");
               GXutil.writeLogRaw("Old: ",Z2968TiAgrupa);
               GXutil.writeLogRaw("Current: ",T00AB2_A2968TiAgrupa[0]);
            }
            if ( DecimalUtil.compareTo(Z2969TiCosteP, T00AB2_A2969TiCosteP[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiCosteP");
               GXutil.writeLogRaw("Old: ",Z2969TiCosteP);
               GXutil.writeLogRaw("Current: ",T00AB2_A2969TiCosteP[0]);
            }
            if ( DecimalUtil.compareTo(Z2970TiCosteA, T00AB2_A2970TiCosteA[0]) != 0 )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"TiCosteA");
               GXutil.writeLogRaw("Old: ",Z2970TiCosteA);
               GXutil.writeLogRaw("Current: ",T00AB2_A2970TiCosteA[0]);
            }
            if ( Z252CliCod != T00AB2_A252CliCod[0] )
            {
               GXutil.writeLogln("tdkgsti:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00AB2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLKGSTI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertAB438( )
   {
      beforeValidateAB438( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAB438( ) ;
      }
      if ( AnyError == 0 )
      {
         zmAB438( 0) ;
         checkOptimisticConcurrencyAB438( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmAB438( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertAB438( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00AB20 */
                  pr_default.execute(18, new Object[] {Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar, Boolean.valueOf(n2962TiKgs), A2962TiKgs, Boolean.valueOf(n2963TiConos), Short.valueOf(A2963TiConos), Boolean.valueOf(n2964TiTipDis), A2964TiTipDis, Boolean.valueOf(n2965TiMaqCod), A2965TiMaqCod, Boolean.valueOf(n2966TiTipArt), Short.valueOf(A2966TiTipArt), Boolean.valueOf(n2967TiReoper), Byte.valueOf(A2967TiReoper), Boolean.valueOf(n2968TiAgrupa), A2968TiAgrupa, Boolean.valueOf(n2969TiCosteP), A2969TiCosteP, Boolean.valueOf(n2970TiCosteA), A2970TiCosteA, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSTI");
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
            loadAB438( ) ;
         }
         endLevelAB438( ) ;
      }
      closeExtendedTableCursorsAB438( ) ;
   }

   public void updateAB438( )
   {
      beforeValidateAB438( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableAB438( ) ;
      }
      if ( ( nIsMod_438 != 0 ) || ( nIsDirty_438 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyAB438( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmAB438( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateAB438( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00AB21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n2962TiKgs), A2962TiKgs, Boolean.valueOf(n2963TiConos), Short.valueOf(A2963TiConos), Boolean.valueOf(n2964TiTipDis), A2964TiTipDis, Boolean.valueOf(n2965TiMaqCod), A2965TiMaqCod, Boolean.valueOf(n2966TiTipArt), Short.valueOf(A2966TiTipArt), Boolean.valueOf(n2967TiReoper), Byte.valueOf(A2967TiReoper), Boolean.valueOf(n2968TiAgrupa), A2968TiAgrupa, Boolean.valueOf(n2969TiCosteP), A2969TiCosteP, Boolean.valueOf(n2970TiCosteA), A2970TiCosteA, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSTI");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLKGSTI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateAB438( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyAB438( ) ;
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
            endLevelAB438( ) ;
         }
      }
      closeExtendedTableCursorsAB438( ) ;
   }

   public void deferredUpdateAB438( )
   {
   }

   public void deleteAB438( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateAB438( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyAB438( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsAB438( ) ;
         afterConfirmAB438( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteAB438( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00AB22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny), Byte.valueOf(A2958TiLin), Integer.valueOf(A2959TiBarCod), Byte.valueOf(A2960TiBarReo), A2961TiBarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLKGSTI");
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
      sMode438 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelAB438( ) ;
      Gx_mode = sMode438 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsAB438( )
   {
      standaloneModalAB438( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int14[0] = A2959TiBarCod ;
            GXv_int10[0] = A2960TiBarReo ;
            GXv_char9[0] = A2961TiBarPar ;
            GXv_decimal13[0] = A2962TiKgs ;
            GXv_int8[0] = A2963TiConos ;
            GXv_char3[0] = A2964TiTipDis ;
            GXv_char2[0] = A2965TiMaqCod ;
            GXv_int6[0] = A2967TiReoper ;
            GXv_char1[0] = A2968TiAgrupa ;
            GXv_decimal12[0] = A2969TiCosteP ;
            GXv_decimal7[0] = A2970TiCosteA ;
            GXv_int5[0] = A252CliCod ;
            new app.pordexg(remoteHandle, context).execute( GXv_char11, GXv_int14, GXv_int10, GXv_char9, GXv_decimal13, GXv_int8, GXv_char3, GXv_char2, GXv_int6, GXv_char1, GXv_decimal12, GXv_decimal7, GXv_int5) ;
            tdkgsti_impl.this.A396EmprCod = GXv_char11[0] ;
            tdkgsti_impl.this.A2959TiBarCod = GXv_int14[0] ;
            tdkgsti_impl.this.A2960TiBarReo = GXv_int10[0] ;
            tdkgsti_impl.this.A2961TiBarPar = GXv_char9[0] ;
            tdkgsti_impl.this.A2962TiKgs = GXv_decimal13[0] ;
            tdkgsti_impl.this.A2963TiConos = GXv_int8[0] ;
            tdkgsti_impl.this.A2964TiTipDis = GXv_char3[0] ;
            tdkgsti_impl.this.A2965TiMaqCod = GXv_char2[0] ;
            tdkgsti_impl.this.A2967TiReoper = GXv_int6[0] ;
            tdkgsti_impl.this.A2968TiAgrupa = GXv_char1[0] ;
            tdkgsti_impl.this.A2969TiCosteP = GXv_decimal12[0] ;
            tdkgsti_impl.this.A2970TiCosteA = GXv_decimal7[0] ;
            tdkgsti_impl.this.A252CliCod = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
      }
   }

   public void endLevelAB438( )
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

   public void scanStartAB438( )
   {
      /* Scan By routine */
      /* Using cursor T00AB23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(A2954TiDia), Byte.valueOf(A2955TiMes), Short.valueOf(A2956TiAny)});
      RcdFound438 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound438 = (short)(1) ;
         A2958TiLin = T00AB23_A2958TiLin[0] ;
         A2959TiBarCod = T00AB23_A2959TiBarCod[0] ;
         A2960TiBarReo = T00AB23_A2960TiBarReo[0] ;
         A2961TiBarPar = T00AB23_A2961TiBarPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextAB438( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound438 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound438 = (short)(1) ;
         A2958TiLin = T00AB23_A2958TiLin[0] ;
         A2959TiBarCod = T00AB23_A2959TiBarCod[0] ;
         A2960TiBarReo = T00AB23_A2960TiBarReo[0] ;
         A2961TiBarPar = T00AB23_A2961TiBarPar[0] ;
      }
   }

   public void scanEndAB438( )
   {
      pr_default.close(21);
   }

   public void afterConfirmAB438( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertAB438( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateAB438( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteAB438( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteAB438( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateAB438( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesAB438( )
   {
      edtTiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiKgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiConos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiConos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiConos_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiTipDis_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiMaqCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiTipArt_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiReoper_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiReoper_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiReoper_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiAgrupa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiAgrupa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiAgrupa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiCosteP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiCosteP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiCosteP_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiCosteA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiCosteA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiCosteA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashesAB438( )
   {
   }

   public void send_integrity_lvl_hashesAB437( )
   {
   }

   public void subsflControlProps_50438( )
   {
      edtavnRcdDeleted_438_Internalname = "vNRCDDELETED_438_"+sGXsfl_50_idx ;
      edtTiLin_Internalname = "TILIN_"+sGXsfl_50_idx ;
      edtTiBarCod_Internalname = "TIBARCOD_"+sGXsfl_50_idx ;
      edtTiBarReo_Internalname = "TIBARREO_"+sGXsfl_50_idx ;
      edtTiBarPar_Internalname = "TIBARPAR_"+sGXsfl_50_idx ;
      edtTiKgs_Internalname = "TIKGS_"+sGXsfl_50_idx ;
      edtTiConos_Internalname = "TICONOS_"+sGXsfl_50_idx ;
      edtTiTipDis_Internalname = "TITIPDIS_"+sGXsfl_50_idx ;
      edtTiMaqCod_Internalname = "TIMAQCOD_"+sGXsfl_50_idx ;
      edtTiTipArt_Internalname = "TITIPART_"+sGXsfl_50_idx ;
      edtTiReoper_Internalname = "TIREOPER_"+sGXsfl_50_idx ;
      edtTiAgrupa_Internalname = "TIAGRUPA_"+sGXsfl_50_idx ;
      edtTiCosteP_Internalname = "TICOSTEP_"+sGXsfl_50_idx ;
      edtTiCosteA_Internalname = "TICOSTEA_"+sGXsfl_50_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_50438( )
   {
      edtavnRcdDeleted_438_Internalname = "vNRCDDELETED_438_"+sGXsfl_50_fel_idx ;
      edtTiLin_Internalname = "TILIN_"+sGXsfl_50_fel_idx ;
      edtTiBarCod_Internalname = "TIBARCOD_"+sGXsfl_50_fel_idx ;
      edtTiBarReo_Internalname = "TIBARREO_"+sGXsfl_50_fel_idx ;
      edtTiBarPar_Internalname = "TIBARPAR_"+sGXsfl_50_fel_idx ;
      edtTiKgs_Internalname = "TIKGS_"+sGXsfl_50_fel_idx ;
      edtTiConos_Internalname = "TICONOS_"+sGXsfl_50_fel_idx ;
      edtTiTipDis_Internalname = "TITIPDIS_"+sGXsfl_50_fel_idx ;
      edtTiMaqCod_Internalname = "TIMAQCOD_"+sGXsfl_50_fel_idx ;
      edtTiTipArt_Internalname = "TITIPART_"+sGXsfl_50_fel_idx ;
      edtTiReoper_Internalname = "TIREOPER_"+sGXsfl_50_fel_idx ;
      edtTiAgrupa_Internalname = "TIAGRUPA_"+sGXsfl_50_fel_idx ;
      edtTiCosteP_Internalname = "TICOSTEP_"+sGXsfl_50_fel_idx ;
      edtTiCosteA_Internalname = "TICOSTEA_"+sGXsfl_50_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_fel_idx ;
   }

   public void addRowAB438( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50438( ) ;
      sendRowAB438( ) ;
   }

   public void sendRowAB438( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_438_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_438_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_438), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_438), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_438_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_438_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2958TiLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2959TiBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2960TiBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiBarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiBarPar_Internalname,GXutil.rtrim( A2961TiBarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiBarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiKgs_Enabled!=0) ? localUtil.format( A2962TiKgs, "ZZZZZ9.99") : localUtil.format( A2962TiKgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiConos_Internalname,GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiConos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2963TiConos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2963TiConos), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiConos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiConos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiTipDis_Internalname,GXutil.rtrim( A2964TiTipDis),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiTipDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiTipDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiMaqCod_Internalname,GXutil.rtrim( A2965TiMaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2966TiTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2966TiTipArt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiTipArt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiReoper_Internalname,GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiReoper_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2967TiReoper), "9") : localUtil.format( DecimalUtil.doubleToDec(A2967TiReoper), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiReoper_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiReoper_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiAgrupa_Internalname,GXutil.rtrim( A2968TiAgrupa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiAgrupa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiAgrupa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiCosteP_Internalname,GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiCosteP_Enabled!=0) ? localUtil.format( A2969TiCosteP, "ZZZZZZ9.99") : localUtil.format( A2969TiCosteP, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiCosteP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiCosteP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTiCosteA_Internalname,GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTiCosteA_Enabled!=0) ? localUtil.format( A2970TiCosteA, "ZZZZZZ9.99") : localUtil.format( A2970TiCosteA, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTiCosteA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTiCosteA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_438_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesAB438( ) ;
      GXCCtl = "Z2958TiLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2958TiLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2959TiBarCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2959TiBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2960TiBarReo_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2960TiBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2961TiBarPar_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2961TiBarPar));
      GXCCtl = "Z2962TiKgs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2962TiKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2963TiConos_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2963TiConos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2964TiTipDis_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2964TiTipDis));
      GXCCtl = "Z2965TiMaqCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2965TiMaqCod));
      GXCCtl = "Z2966TiTipArt_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2966TiTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2967TiReoper_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2967TiReoper, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2968TiAgrupa_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2968TiAgrupa));
      GXCCtl = "Z2969TiCosteP_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2969TiCosteP, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2970TiCosteA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2970TiCosteA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_438_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_438_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_438_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_438, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_438_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_438_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TILIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIBARCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIBARREO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIBARPAR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIKGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TICONOS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiConos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TITIPDIS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIMAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TITIPART_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIREOPER_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiReoper_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIAGRUPA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiAgrupa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TICOSTEP_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TICOSTEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowAB438( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50438( ) ;
      edtavnRcdDeleted_438_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_438_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TILIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARREO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIBARPAR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIKGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiConos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICONOS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiTipDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TITIPDIS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIMAQCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TITIPART_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiReoper_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIREOPER_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiAgrupa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIAGRUPA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiCosteP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICOSTEP_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTiCosteA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TICOSTEA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_438_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_438_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_438");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_438_Internalname ;
         wbErr = true ;
         nRcdDeleted_438 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_438 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_438_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "TILIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiLin_Internalname ;
         wbErr = true ;
         A2958TiLin = (byte)(0) ;
      }
      else
      {
         A2958TiLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TIBARCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiBarCod_Internalname ;
         wbErr = true ;
         A2959TiBarCod = 0 ;
      }
      else
      {
         A2959TiBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTiBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "TIBARREO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiBarReo_Internalname ;
         wbErr = true ;
         A2960TiBarReo = (byte)(0) ;
      }
      else
      {
         A2960TiBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2961TiBarPar = httpContext.cgiGet( edtTiBarPar_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTiKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTiKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "TIKGS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiKgs_Internalname ;
         wbErr = true ;
         A2962TiKgs = DecimalUtil.ZERO ;
         n2962TiKgs = false ;
      }
      else
      {
         A2962TiKgs = localUtil.ctond( httpContext.cgiGet( edtTiKgs_Internalname)) ;
         n2962TiKgs = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TICONOS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiConos_Internalname ;
         wbErr = true ;
         A2963TiConos = (short)(0) ;
         n2963TiConos = false ;
      }
      else
      {
         A2963TiConos = (short)(localUtil.ctol( httpContext.cgiGet( edtTiConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2963TiConos = false ;
      }
      A2964TiTipDis = httpContext.cgiGet( edtTiTipDis_Internalname) ;
      n2964TiTipDis = false ;
      A2965TiMaqCod = httpContext.cgiGet( edtTiMaqCod_Internalname) ;
      n2965TiMaqCod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TITIPART_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiTipArt_Internalname ;
         wbErr = true ;
         A2966TiTipArt = (short)(0) ;
         n2966TiTipArt = false ;
      }
      else
      {
         A2966TiTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtTiTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2966TiTipArt = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTiReoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTiReoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "TIREOPER_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiReoper_Internalname ;
         wbErr = true ;
         A2967TiReoper = (byte)(0) ;
         n2967TiReoper = false ;
      }
      else
      {
         A2967TiReoper = (byte)(localUtil.ctol( httpContext.cgiGet( edtTiReoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2967TiReoper = false ;
      }
      A2968TiAgrupa = httpContext.cgiGet( edtTiAgrupa_Internalname) ;
      n2968TiAgrupa = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTiCosteP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTiCosteP_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "TICOSTEP_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiCosteP_Internalname ;
         wbErr = true ;
         A2969TiCosteP = DecimalUtil.ZERO ;
         n2969TiCosteP = false ;
      }
      else
      {
         A2969TiCosteP = localUtil.ctond( httpContext.cgiGet( edtTiCosteP_Internalname)) ;
         n2969TiCosteP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTiCosteA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTiCosteA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "TICOSTEA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiCosteA_Internalname ;
         wbErr = true ;
         A2970TiCosteA = DecimalUtil.ZERO ;
         n2970TiCosteA = false ;
      }
      else
      {
         A2970TiCosteA = localUtil.ctond( httpContext.cgiGet( edtTiCosteA_Internalname)) ;
         n2970TiCosteA = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         wbErr = true ;
         A252CliCod = 0 ;
         n252CliCod = false ;
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
      }
      GXCCtl = "Z2958TiLin_" + sGXsfl_50_idx ;
      Z2958TiLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2959TiBarCod_" + sGXsfl_50_idx ;
      Z2959TiBarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2960TiBarReo_" + sGXsfl_50_idx ;
      Z2960TiBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2961TiBarPar_" + sGXsfl_50_idx ;
      Z2961TiBarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2962TiKgs_" + sGXsfl_50_idx ;
      Z2962TiKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2963TiConos_" + sGXsfl_50_idx ;
      Z2963TiConos = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2964TiTipDis_" + sGXsfl_50_idx ;
      Z2964TiTipDis = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2965TiMaqCod_" + sGXsfl_50_idx ;
      Z2965TiMaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2966TiTipArt_" + sGXsfl_50_idx ;
      Z2966TiTipArt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2967TiReoper_" + sGXsfl_50_idx ;
      Z2967TiReoper = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2968TiAgrupa_" + sGXsfl_50_idx ;
      Z2968TiAgrupa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2969TiCosteP_" + sGXsfl_50_idx ;
      Z2969TiCosteP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2970TiCosteA_" + sGXsfl_50_idx ;
      Z2970TiCosteA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_438_" + sGXsfl_50_idx ;
      nRcdDeleted_438 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_438_" + sGXsfl_50_idx ;
      nRcdExists_438 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_438_" + sGXsfl_50_idx ;
      nIsMod_438 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTiBarPar_Enabled = edtTiBarPar_Enabled ;
      defedtTiBarReo_Enabled = edtTiBarReo_Enabled ;
      defedtTiBarCod_Enabled = edtTiBarCod_Enabled ;
      defedtTiLin_Enabled = edtTiLin_Enabled ;
   }

   public void confirmValuesAB0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_50438( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50438( ) ;
         httpContext.changePostValue( "Z2958TiLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2958TiLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2958TiLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2959TiBarCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2959TiBarCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2959TiBarCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2960TiBarReo_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2960TiBarReo_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2960TiBarReo_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2961TiBarPar_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2961TiBarPar_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2961TiBarPar_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2962TiKgs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2962TiKgs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2962TiKgs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2963TiConos_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2963TiConos_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2963TiConos_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2964TiTipDis_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2964TiTipDis_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2964TiTipDis_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2965TiMaqCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2965TiMaqCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2965TiMaqCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2966TiTipArt_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2966TiTipArt_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2966TiTipArt_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2967TiReoper_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2967TiReoper_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2967TiReoper_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2968TiAgrupa_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2968TiAgrupa_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2968TiAgrupa_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2969TiCosteP_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2969TiCosteP_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2969TiCosteP_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z2970TiCosteA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z2970TiCosteA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2970TiCosteA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdkgsti", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2954TiDia", GXutil.ltrim( localUtil.ntoc( Z2954TiDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2955TiMes", GXutil.ltrim( localUtil.ntoc( Z2955TiMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2956TiAny", GXutil.ltrim( localUtil.ntoc( Z2956TiAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2957TiUltLin", GXutil.ltrim( localUtil.ntoc( Z2957TiUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2957TiUltLin", GXutil.ltrim( localUtil.ntoc( O2957TiUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdkgsti", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDKGSTI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "KILOS TINTADOS", "") ;
   }

   public void initializeNonKeyAB437( )
   {
      A2957TiUltLin = (byte)(0) ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      O2957TiUltLin = A2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
      Z2957TiUltLin = (byte)(0) ;
   }

   public void initAllAB437( )
   {
      A2954TiDia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2954TiDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2954TiDia), 2, 0));
      A2955TiMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2955TiMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2955TiMes), 2, 0));
      A2956TiAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2956TiAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2956TiAny), 4, 0));
      initializeNonKeyAB437( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyAB438( )
   {
      A2962TiKgs = DecimalUtil.ZERO ;
      n2962TiKgs = false ;
      A2963TiConos = (short)(0) ;
      n2963TiConos = false ;
      A2964TiTipDis = "" ;
      n2964TiTipDis = false ;
      A2965TiMaqCod = "" ;
      n2965TiMaqCod = false ;
      A2966TiTipArt = (short)(0) ;
      n2966TiTipArt = false ;
      A2967TiReoper = (byte)(0) ;
      n2967TiReoper = false ;
      A2968TiAgrupa = "" ;
      n2968TiAgrupa = false ;
      A2969TiCosteP = DecimalUtil.ZERO ;
      n2969TiCosteP = false ;
      A2970TiCosteA = DecimalUtil.ZERO ;
      n2970TiCosteA = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z2962TiKgs = DecimalUtil.ZERO ;
      Z2963TiConos = (short)(0) ;
      Z2964TiTipDis = "" ;
      Z2965TiMaqCod = "" ;
      Z2966TiTipArt = (short)(0) ;
      Z2967TiReoper = (byte)(0) ;
      Z2968TiAgrupa = "" ;
      Z2969TiCosteP = DecimalUtil.ZERO ;
      Z2970TiCosteA = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
   }

   public void initAllAB438( )
   {
      A2958TiLin = (byte)(0) ;
      A2959TiBarCod = 0 ;
      A2960TiBarReo = (byte)(0) ;
      A2961TiBarPar = "" ;
      initializeNonKeyAB438( ) ;
   }

   public void standaloneModalInsertAB438( )
   {
      A2957TiUltLin = i2957TiUltLin ;
      n2957TiUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2957TiUltLin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511028", true, true);
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
      httpContext.AddJavascriptSource("tdkgsti.js", "?20268241511028", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties438( )
   {
      edtTiBarPar_Enabled = defedtTiBarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarPar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiBarReo_Enabled = defedtTiBarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarReo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiBarCod_Enabled = defedtTiBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiBarCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTiLin_Enabled = defedtTiLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTiLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_438, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_438_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2958TiLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2961TiBarPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiConos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2964TiTipDis));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2965TiMaqCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2966TiTipArt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiReoper_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2968TiAgrupa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiAgrupa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTiCosteA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTiDia_Internalname = "TIDIA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtTiMes_Internalname = "TIMES" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTiAny_Internalname = "TIANY" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTiUltLin_Internalname = "TIULTLIN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_438_Internalname = "vNRCDDELETED_438" ;
      edtTiLin_Internalname = "TILIN" ;
      edtTiBarCod_Internalname = "TIBARCOD" ;
      edtTiBarReo_Internalname = "TIBARREO" ;
      edtTiBarPar_Internalname = "TIBARPAR" ;
      edtTiKgs_Internalname = "TIKGS" ;
      edtTiConos_Internalname = "TICONOS" ;
      edtTiTipDis_Internalname = "TITIPDIS" ;
      edtTiMaqCod_Internalname = "TIMAQCOD" ;
      edtTiTipArt_Internalname = "TITIPART" ;
      edtTiReoper_Internalname = "TIREOPER" ;
      edtTiAgrupa_Internalname = "TIAGRUPA" ;
      edtTiCosteP_Internalname = "TICOSTEP" ;
      edtTiCosteA_Internalname = "TICOSTEA" ;
      edtCliCod_Internalname = "CLICOD" ;
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
      Form.setCaption( httpContext.getMessage( "KILOS TINTADOS", "") );
      edtCliCod_Jsonclick = "" ;
      edtTiCosteA_Jsonclick = "" ;
      edtTiCosteP_Jsonclick = "" ;
      edtTiAgrupa_Jsonclick = "" ;
      edtTiReoper_Jsonclick = "" ;
      edtTiTipArt_Jsonclick = "" ;
      edtTiMaqCod_Jsonclick = "" ;
      edtTiTipDis_Jsonclick = "" ;
      edtTiConos_Jsonclick = "" ;
      edtTiKgs_Jsonclick = "" ;
      edtTiBarPar_Jsonclick = "" ;
      edtTiBarReo_Jsonclick = "" ;
      edtTiBarCod_Jsonclick = "" ;
      edtTiLin_Jsonclick = "" ;
      edtavnRcdDeleted_438_Jsonclick = "" ;
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
      edtCliCod_Enabled = 1 ;
      edtTiCosteA_Enabled = 1 ;
      edtTiCosteP_Enabled = 1 ;
      edtTiAgrupa_Enabled = 1 ;
      edtTiReoper_Enabled = 1 ;
      edtTiTipArt_Enabled = 1 ;
      edtTiMaqCod_Enabled = 1 ;
      edtTiTipDis_Enabled = 1 ;
      edtTiConos_Enabled = 1 ;
      edtTiKgs_Enabled = 1 ;
      edtTiBarPar_Enabled = 1 ;
      edtTiBarReo_Enabled = 1 ;
      edtTiBarCod_Enabled = 1 ;
      edtTiLin_Enabled = 1 ;
      edtavnRcdDeleted_438_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtTiUltLin_Jsonclick = "" ;
      edtTiUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtTiUltLin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTiAny_Jsonclick = "" ;
      edtTiAny_Backcolor = (int)(0xFFFFFF) ;
      edtTiAny_Enabled = 1 ;
      edtTiMes_Jsonclick = "" ;
      edtTiMes_Backcolor = (int)(0xFFFFFF) ;
      edtTiMes_Enabled = 1 ;
      edtTiDia_Jsonclick = "" ;
      edtTiDia_Backcolor = (int)(0xFFFFFF) ;
      edtTiDia_Enabled = 1 ;
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

   public void xc_7_AB438( String Gx_mode ,
                           String A396EmprCod ,
                           int A2959TiBarCod ,
                           byte A2960TiBarReo ,
                           String A2961TiBarPar ,
                           java.math.BigDecimal A2962TiKgs ,
                           short A2963TiConos ,
                           String A2964TiTipDis ,
                           String A2965TiMaqCod ,
                           byte A2967TiReoper ,
                           String A2968TiAgrupa ,
                           java.math.BigDecimal A2969TiCosteP ,
                           java.math.BigDecimal A2970TiCosteA ,
                           int A252CliCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int14[0] = A2959TiBarCod ;
         GXv_int10[0] = A2960TiBarReo ;
         GXv_char9[0] = A2961TiBarPar ;
         GXv_decimal13[0] = A2962TiKgs ;
         GXv_int8[0] = A2963TiConos ;
         GXv_char3[0] = A2964TiTipDis ;
         GXv_char2[0] = A2965TiMaqCod ;
         GXv_int6[0] = A2967TiReoper ;
         GXv_char1[0] = A2968TiAgrupa ;
         GXv_decimal12[0] = A2969TiCosteP ;
         GXv_decimal7[0] = A2970TiCosteA ;
         GXv_int5[0] = A252CliCod ;
         new app.pordexg(remoteHandle, context).execute( GXv_char11, GXv_int14, GXv_int10, GXv_char9, GXv_decimal13, GXv_int8, GXv_char3, GXv_char2, GXv_int6, GXv_char1, GXv_decimal12, GXv_decimal7, GXv_int5) ;
         A396EmprCod = GXv_char11[0] ;
         A2959TiBarCod = GXv_int14[0] ;
         A2960TiBarReo = GXv_int10[0] ;
         A2961TiBarPar = GXv_char9[0] ;
         A2962TiKgs = GXv_decimal13[0] ;
         A2963TiConos = GXv_int8[0] ;
         A2964TiTipDis = GXv_char3[0] ;
         A2965TiMaqCod = GXv_char2[0] ;
         A2967TiReoper = GXv_int6[0] ;
         A2968TiAgrupa = GXv_char1[0] ;
         A2969TiCosteP = GXv_decimal12[0] ;
         A2970TiCosteA = GXv_decimal7[0] ;
         A252CliCod = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2961TiBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2964TiTipDis))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2965TiMaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2968TiAgrupa))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_50438( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalAB438( ) ;
         standaloneModalAB438( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowAB438( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_50438( ) ;
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
      /* Using cursor T00AB24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00AB24_A407EmprNom[0] ;
      n407EmprNom = T00AB24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Tiany( )
   {
      n2957TiUltLin = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( A2956TiAny == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "valor Incorrecto", ""), 1, "TIANY");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTiAny_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2957TiUltLin", GXutil.ltrim( localUtil.ntoc( A2957TiUltLin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2954TiDia", GXutil.ltrim( localUtil.ntoc( Z2954TiDia, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2955TiMes", GXutil.ltrim( localUtil.ntoc( Z2955TiMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2956TiAny", GXutil.ltrim( localUtil.ntoc( Z2956TiAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2957TiUltLin", GXutil.ltrim( localUtil.ntoc( Z2957TiUltLin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O2957TiUltLin", GXutil.ltrim( localUtil.ntoc( O2957TiUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tibarpar( )
   {
      n252CliCod = false ;
      n2970TiCosteA = false ;
      n2969TiCosteP = false ;
      n2968TiAgrupa = false ;
      n2967TiReoper = false ;
      n2965TiMaqCod = false ;
      n2964TiTipDis = false ;
      n2963TiConos = false ;
      n2962TiKgs = false ;
      if ( isIns( )  && true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int14[0] = A2959TiBarCod ;
         GXv_int10[0] = A2960TiBarReo ;
         GXv_char9[0] = A2961TiBarPar ;
         GXv_decimal13[0] = A2962TiKgs ;
         GXv_int8[0] = A2963TiConos ;
         GXv_char3[0] = A2964TiTipDis ;
         GXv_char2[0] = A2965TiMaqCod ;
         GXv_int6[0] = A2967TiReoper ;
         GXv_char1[0] = A2968TiAgrupa ;
         GXv_decimal12[0] = A2969TiCosteP ;
         GXv_decimal7[0] = A2970TiCosteA ;
         GXv_int5[0] = A252CliCod ;
         new app.pordexg(remoteHandle, context).execute( GXv_char11, GXv_int14, GXv_int10, GXv_char9, GXv_decimal13, GXv_int8, GXv_char3, GXv_char2, GXv_int6, GXv_char1, GXv_decimal12, GXv_decimal7, GXv_int5) ;
         tdkgsti_impl.this.A396EmprCod = GXv_char11[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdkgsti_impl.this.A2959TiBarCod = GXv_int14[0] ;
         A2959TiBarCod = this.A2959TiBarCod ;
         tdkgsti_impl.this.A2960TiBarReo = GXv_int10[0] ;
         A2960TiBarReo = this.A2960TiBarReo ;
         tdkgsti_impl.this.A2961TiBarPar = GXv_char9[0] ;
         A2961TiBarPar = this.A2961TiBarPar ;
         tdkgsti_impl.this.A2962TiKgs = GXv_decimal13[0] ;
         A2962TiKgs = this.A2962TiKgs ;
         tdkgsti_impl.this.A2963TiConos = GXv_int8[0] ;
         A2963TiConos = this.A2963TiConos ;
         tdkgsti_impl.this.A2964TiTipDis = GXv_char3[0] ;
         A2964TiTipDis = this.A2964TiTipDis ;
         tdkgsti_impl.this.A2965TiMaqCod = GXv_char2[0] ;
         A2965TiMaqCod = this.A2965TiMaqCod ;
         tdkgsti_impl.this.A2967TiReoper = GXv_int6[0] ;
         A2967TiReoper = this.A2967TiReoper ;
         tdkgsti_impl.this.A2968TiAgrupa = GXv_char1[0] ;
         A2968TiAgrupa = this.A2968TiAgrupa ;
         tdkgsti_impl.this.A2969TiCosteP = GXv_decimal12[0] ;
         A2969TiCosteP = this.A2969TiCosteP ;
         tdkgsti_impl.this.A2970TiCosteA = GXv_decimal7[0] ;
         A2970TiCosteA = this.A2970TiCosteA ;
         tdkgsti_impl.this.A252CliCod = GXv_int5[0] ;
         A252CliCod = this.A252CliCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2959TiBarCod", GXutil.ltrim( localUtil.ntoc( A2959TiBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2960TiBarReo", GXutil.ltrim( localUtil.ntoc( A2960TiBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2961TiBarPar", GXutil.rtrim( A2961TiBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "A2962TiKgs", GXutil.ltrim( localUtil.ntoc( A2962TiKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2963TiConos", GXutil.ltrim( localUtil.ntoc( A2963TiConos, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2964TiTipDis", GXutil.rtrim( A2964TiTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A2965TiMaqCod", GXutil.rtrim( A2965TiMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2967TiReoper", GXutil.ltrim( localUtil.ntoc( A2967TiReoper, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2968TiAgrupa", GXutil.rtrim( A2968TiAgrupa));
      httpContext.ajax_rsp_assign_attri("", false, "A2969TiCosteP", GXutil.ltrim( localUtil.ntoc( A2969TiCosteP, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2970TiCosteA", GXutil.ltrim( localUtil.ntoc( A2970TiCosteA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Clicod( )
   {
      n2957TiUltLin = false ;
      n252CliCod = false ;
      /* Using cursor T00AB25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(23);
      O2957TiUltLin = A2957TiUltLin ;
      n2957TiUltLin = false ;
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TIDIA","{handler:'valid_Tidia',iparms:[]");
      setEventMetadata("VALID_TIDIA",",oparms:[]}");
      setEventMetadata("VALID_TIMES","{handler:'valid_Times',iparms:[]");
      setEventMetadata("VALID_TIMES",",oparms:[]}");
      setEventMetadata("VALID_TIANY","{handler:'valid_Tiany',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2957TiUltLin',fld:'TIULTLIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2954TiDia',fld:'TIDIA',pic:'Z9'},{av:'A2955TiMes',fld:'TIMES',pic:'Z9'},{av:'A2956TiAny',fld:'TIANY',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_TIANY",",oparms:[{av:'A2957TiUltLin',fld:'TIULTLIN',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z2954TiDia'},{av:'Z2955TiMes'},{av:'Z2956TiAny'},{av:'Z2957TiUltLin'},{av:'Z407EmprNom'},{av:'ZV8UsurCod'},{av:'O2957TiUltLin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TIULTLIN","{handler:'valid_Tiultlin',iparms:[]");
      setEventMetadata("VALID_TIULTLIN",",oparms:[]}");
      setEventMetadata("VALID_TILIN","{handler:'valid_Tilin',iparms:[]");
      setEventMetadata("VALID_TILIN",",oparms:[]}");
      setEventMetadata("VALID_TIBARCOD","{handler:'valid_Tibarcod',iparms:[]");
      setEventMetadata("VALID_TIBARCOD",",oparms:[]}");
      setEventMetadata("VALID_TIBARREO","{handler:'valid_Tibarreo',iparms:[]");
      setEventMetadata("VALID_TIBARREO",",oparms:[]}");
      setEventMetadata("VALID_TIBARPAR","{handler:'valid_Tibarpar',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2970TiCosteA',fld:'TICOSTEA',pic:'ZZZZZZ9.99'},{av:'A2969TiCosteP',fld:'TICOSTEP',pic:'ZZZZZZ9.99'},{av:'A2968TiAgrupa',fld:'TIAGRUPA',pic:''},{av:'A2967TiReoper',fld:'TIREOPER',pic:'9'},{av:'A2965TiMaqCod',fld:'TIMAQCOD',pic:''},{av:'A2964TiTipDis',fld:'TITIPDIS',pic:''},{av:'A2963TiConos',fld:'TICONOS',pic:'ZZZ9'},{av:'A2962TiKgs',fld:'TIKGS',pic:'ZZZZZ9.99'},{av:'A2960TiBarReo',fld:'TIBARREO',pic:'9'},{av:'A2959TiBarCod',fld:'TIBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2961TiBarPar',fld:'TIBARPAR',pic:''}]");
      setEventMetadata("VALID_TIBARPAR",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2959TiBarCod',fld:'TIBARCOD',pic:'ZZZZZZZ9'},{av:'A2960TiBarReo',fld:'TIBARREO',pic:'9'},{av:'A2961TiBarPar',fld:'TIBARPAR',pic:''},{av:'A2962TiKgs',fld:'TIKGS',pic:'ZZZZZ9.99'},{av:'A2963TiConos',fld:'TICONOS',pic:'ZZZ9'},{av:'A2964TiTipDis',fld:'TITIPDIS',pic:''},{av:'A2965TiMaqCod',fld:'TIMAQCOD',pic:''},{av:'A2967TiReoper',fld:'TIREOPER',pic:'9'},{av:'A2968TiAgrupa',fld:'TIAGRUPA',pic:''},{av:'A2969TiCosteP',fld:'TICOSTEP',pic:'ZZZZZZ9.99'},{av:'A2970TiCosteA',fld:'TICOSTEA',pic:'ZZZZZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A2957TiUltLin',fld:'TIULTLIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
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
      pr_default.close(23);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2961TiBarPar = "" ;
      Z2962TiKgs = DecimalUtil.ZERO ;
      Z2964TiTipDis = "" ;
      Z2965TiMaqCod = "" ;
      Z2968TiAgrupa = "" ;
      Z2969TiCosteP = DecimalUtil.ZERO ;
      Z2970TiCosteA = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2961TiBarPar = "" ;
      A2962TiKgs = DecimalUtil.ZERO ;
      A2964TiTipDis = "" ;
      A2965TiMaqCod = "" ;
      A2968TiAgrupa = "" ;
      A2969TiCosteP = DecimalUtil.ZERO ;
      A2970TiCosteA = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode438 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode437 = "" ;
      GXCCtl = "" ;
      AV29Station = "" ;
      AV30EmprNom = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char4 = "" ;
      Z407EmprNom = "" ;
      T00AB7_A407EmprNom = new String[] {""} ;
      T00AB7_n407EmprNom = new boolean[] {false} ;
      T00AB8_A2954TiDia = new byte[1] ;
      T00AB8_A2955TiMes = new byte[1] ;
      T00AB8_A2956TiAny = new short[1] ;
      T00AB8_A2957TiUltLin = new byte[1] ;
      T00AB8_n2957TiUltLin = new boolean[] {false} ;
      T00AB8_A407EmprNom = new String[] {""} ;
      T00AB8_n407EmprNom = new boolean[] {false} ;
      T00AB8_A396EmprCod = new String[] {""} ;
      T00AB9_A396EmprCod = new String[] {""} ;
      T00AB9_A2954TiDia = new byte[1] ;
      T00AB9_A2955TiMes = new byte[1] ;
      T00AB9_A2956TiAny = new short[1] ;
      T00AB6_A2954TiDia = new byte[1] ;
      T00AB6_A2955TiMes = new byte[1] ;
      T00AB6_A2956TiAny = new short[1] ;
      T00AB6_A2957TiUltLin = new byte[1] ;
      T00AB6_n2957TiUltLin = new boolean[] {false} ;
      T00AB6_A396EmprCod = new String[] {""} ;
      T00AB10_A396EmprCod = new String[] {""} ;
      T00AB10_A2954TiDia = new byte[1] ;
      T00AB10_A2955TiMes = new byte[1] ;
      T00AB10_A2956TiAny = new short[1] ;
      T00AB11_A396EmprCod = new String[] {""} ;
      T00AB11_A2954TiDia = new byte[1] ;
      T00AB11_A2955TiMes = new byte[1] ;
      T00AB11_A2956TiAny = new short[1] ;
      T00AB5_A2954TiDia = new byte[1] ;
      T00AB5_A2955TiMes = new byte[1] ;
      T00AB5_A2956TiAny = new short[1] ;
      T00AB5_A2957TiUltLin = new byte[1] ;
      T00AB5_n2957TiUltLin = new boolean[] {false} ;
      T00AB5_A396EmprCod = new String[] {""} ;
      T00AB16_A396EmprCod = new String[] {""} ;
      T00AB16_A2954TiDia = new byte[1] ;
      T00AB16_A2955TiMes = new byte[1] ;
      T00AB16_A2956TiAny = new short[1] ;
      T00AB17_A2954TiDia = new byte[1] ;
      T00AB17_A2955TiMes = new byte[1] ;
      T00AB17_A2956TiAny = new short[1] ;
      T00AB17_A2958TiLin = new byte[1] ;
      T00AB17_A2959TiBarCod = new int[1] ;
      T00AB17_A2960TiBarReo = new byte[1] ;
      T00AB17_A2961TiBarPar = new String[] {""} ;
      T00AB17_A2962TiKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB17_n2962TiKgs = new boolean[] {false} ;
      T00AB17_A2963TiConos = new short[1] ;
      T00AB17_n2963TiConos = new boolean[] {false} ;
      T00AB17_A2964TiTipDis = new String[] {""} ;
      T00AB17_n2964TiTipDis = new boolean[] {false} ;
      T00AB17_A2965TiMaqCod = new String[] {""} ;
      T00AB17_n2965TiMaqCod = new boolean[] {false} ;
      T00AB17_A2966TiTipArt = new short[1] ;
      T00AB17_n2966TiTipArt = new boolean[] {false} ;
      T00AB17_A2967TiReoper = new byte[1] ;
      T00AB17_n2967TiReoper = new boolean[] {false} ;
      T00AB17_A2968TiAgrupa = new String[] {""} ;
      T00AB17_n2968TiAgrupa = new boolean[] {false} ;
      T00AB17_A2969TiCosteP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB17_n2969TiCosteP = new boolean[] {false} ;
      T00AB17_A2970TiCosteA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB17_n2970TiCosteA = new boolean[] {false} ;
      T00AB17_A396EmprCod = new String[] {""} ;
      T00AB17_A252CliCod = new int[1] ;
      T00AB17_n252CliCod = new boolean[] {false} ;
      T00AB4_A396EmprCod = new String[] {""} ;
      T00AB18_A396EmprCod = new String[] {""} ;
      T00AB19_A396EmprCod = new String[] {""} ;
      T00AB19_A2954TiDia = new byte[1] ;
      T00AB19_A2955TiMes = new byte[1] ;
      T00AB19_A2956TiAny = new short[1] ;
      T00AB19_A2958TiLin = new byte[1] ;
      T00AB19_A2959TiBarCod = new int[1] ;
      T00AB19_A2960TiBarReo = new byte[1] ;
      T00AB19_A2961TiBarPar = new String[] {""} ;
      T00AB3_A2954TiDia = new byte[1] ;
      T00AB3_A2955TiMes = new byte[1] ;
      T00AB3_A2956TiAny = new short[1] ;
      T00AB3_A2958TiLin = new byte[1] ;
      T00AB3_A2959TiBarCod = new int[1] ;
      T00AB3_A2960TiBarReo = new byte[1] ;
      T00AB3_A2961TiBarPar = new String[] {""} ;
      T00AB3_A2962TiKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB3_n2962TiKgs = new boolean[] {false} ;
      T00AB3_A2963TiConos = new short[1] ;
      T00AB3_n2963TiConos = new boolean[] {false} ;
      T00AB3_A2964TiTipDis = new String[] {""} ;
      T00AB3_n2964TiTipDis = new boolean[] {false} ;
      T00AB3_A2965TiMaqCod = new String[] {""} ;
      T00AB3_n2965TiMaqCod = new boolean[] {false} ;
      T00AB3_A2966TiTipArt = new short[1] ;
      T00AB3_n2966TiTipArt = new boolean[] {false} ;
      T00AB3_A2967TiReoper = new byte[1] ;
      T00AB3_n2967TiReoper = new boolean[] {false} ;
      T00AB3_A2968TiAgrupa = new String[] {""} ;
      T00AB3_n2968TiAgrupa = new boolean[] {false} ;
      T00AB3_A2969TiCosteP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB3_n2969TiCosteP = new boolean[] {false} ;
      T00AB3_A2970TiCosteA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB3_n2970TiCosteA = new boolean[] {false} ;
      T00AB3_A396EmprCod = new String[] {""} ;
      T00AB3_A252CliCod = new int[1] ;
      T00AB3_n252CliCod = new boolean[] {false} ;
      T00AB2_A2954TiDia = new byte[1] ;
      T00AB2_A2955TiMes = new byte[1] ;
      T00AB2_A2956TiAny = new short[1] ;
      T00AB2_A2958TiLin = new byte[1] ;
      T00AB2_A2959TiBarCod = new int[1] ;
      T00AB2_A2960TiBarReo = new byte[1] ;
      T00AB2_A2961TiBarPar = new String[] {""} ;
      T00AB2_A2962TiKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB2_n2962TiKgs = new boolean[] {false} ;
      T00AB2_A2963TiConos = new short[1] ;
      T00AB2_n2963TiConos = new boolean[] {false} ;
      T00AB2_A2964TiTipDis = new String[] {""} ;
      T00AB2_n2964TiTipDis = new boolean[] {false} ;
      T00AB2_A2965TiMaqCod = new String[] {""} ;
      T00AB2_n2965TiMaqCod = new boolean[] {false} ;
      T00AB2_A2966TiTipArt = new short[1] ;
      T00AB2_n2966TiTipArt = new boolean[] {false} ;
      T00AB2_A2967TiReoper = new byte[1] ;
      T00AB2_n2967TiReoper = new boolean[] {false} ;
      T00AB2_A2968TiAgrupa = new String[] {""} ;
      T00AB2_n2968TiAgrupa = new boolean[] {false} ;
      T00AB2_A2969TiCosteP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB2_n2969TiCosteP = new boolean[] {false} ;
      T00AB2_A2970TiCosteA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00AB2_n2970TiCosteA = new boolean[] {false} ;
      T00AB2_A396EmprCod = new String[] {""} ;
      T00AB2_A252CliCod = new int[1] ;
      T00AB2_n252CliCod = new boolean[] {false} ;
      T00AB23_A396EmprCod = new String[] {""} ;
      T00AB23_A2954TiDia = new byte[1] ;
      T00AB23_A2955TiMes = new byte[1] ;
      T00AB23_A2956TiAny = new short[1] ;
      T00AB23_A2958TiLin = new byte[1] ;
      T00AB23_A2959TiBarCod = new int[1] ;
      T00AB23_A2960TiBarReo = new byte[1] ;
      T00AB23_A2961TiBarPar = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00AB24_A407EmprNom = new String[] {""} ;
      T00AB24_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZV8UsurCod = "" ;
      GXv_char11 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      T00AB25_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdkgsti__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdkgsti__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdkgsti__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdkgsti__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdkgsti__default(),
         new Object[] {
             new Object[] {
            T00AB2_A2954TiDia, T00AB2_A2955TiMes, T00AB2_A2956TiAny, T00AB2_A2958TiLin, T00AB2_A2959TiBarCod, T00AB2_A2960TiBarReo, T00AB2_A2961TiBarPar, T00AB2_A2962TiKgs, T00AB2_n2962TiKgs, T00AB2_A2963TiConos,
            T00AB2_n2963TiConos, T00AB2_A2964TiTipDis, T00AB2_n2964TiTipDis, T00AB2_A2965TiMaqCod, T00AB2_n2965TiMaqCod, T00AB2_A2966TiTipArt, T00AB2_n2966TiTipArt, T00AB2_A2967TiReoper, T00AB2_n2967TiReoper, T00AB2_A2968TiAgrupa,
            T00AB2_n2968TiAgrupa, T00AB2_A2969TiCosteP, T00AB2_n2969TiCosteP, T00AB2_A2970TiCosteA, T00AB2_n2970TiCosteA, T00AB2_A396EmprCod, T00AB2_A252CliCod, T00AB2_n252CliCod
            }
            , new Object[] {
            T00AB3_A2954TiDia, T00AB3_A2955TiMes, T00AB3_A2956TiAny, T00AB3_A2958TiLin, T00AB3_A2959TiBarCod, T00AB3_A2960TiBarReo, T00AB3_A2961TiBarPar, T00AB3_A2962TiKgs, T00AB3_n2962TiKgs, T00AB3_A2963TiConos,
            T00AB3_n2963TiConos, T00AB3_A2964TiTipDis, T00AB3_n2964TiTipDis, T00AB3_A2965TiMaqCod, T00AB3_n2965TiMaqCod, T00AB3_A2966TiTipArt, T00AB3_n2966TiTipArt, T00AB3_A2967TiReoper, T00AB3_n2967TiReoper, T00AB3_A2968TiAgrupa,
            T00AB3_n2968TiAgrupa, T00AB3_A2969TiCosteP, T00AB3_n2969TiCosteP, T00AB3_A2970TiCosteA, T00AB3_n2970TiCosteA, T00AB3_A396EmprCod, T00AB3_A252CliCod, T00AB3_n252CliCod
            }
            , new Object[] {
            T00AB4_A396EmprCod
            }
            , new Object[] {
            T00AB5_A2954TiDia, T00AB5_A2955TiMes, T00AB5_A2956TiAny, T00AB5_A2957TiUltLin, T00AB5_n2957TiUltLin, T00AB5_A396EmprCod
            }
            , new Object[] {
            T00AB6_A2954TiDia, T00AB6_A2955TiMes, T00AB6_A2956TiAny, T00AB6_A2957TiUltLin, T00AB6_n2957TiUltLin, T00AB6_A396EmprCod
            }
            , new Object[] {
            T00AB7_A407EmprNom, T00AB7_n407EmprNom
            }
            , new Object[] {
            T00AB8_A2954TiDia, T00AB8_A2955TiMes, T00AB8_A2956TiAny, T00AB8_A2957TiUltLin, T00AB8_n2957TiUltLin, T00AB8_A407EmprNom, T00AB8_n407EmprNom, T00AB8_A396EmprCod
            }
            , new Object[] {
            T00AB9_A396EmprCod, T00AB9_A2954TiDia, T00AB9_A2955TiMes, T00AB9_A2956TiAny
            }
            , new Object[] {
            T00AB10_A396EmprCod, T00AB10_A2954TiDia, T00AB10_A2955TiMes, T00AB10_A2956TiAny
            }
            , new Object[] {
            T00AB11_A396EmprCod, T00AB11_A2954TiDia, T00AB11_A2955TiMes, T00AB11_A2956TiAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00AB16_A396EmprCod, T00AB16_A2954TiDia, T00AB16_A2955TiMes, T00AB16_A2956TiAny
            }
            , new Object[] {
            T00AB17_A2954TiDia, T00AB17_A2955TiMes, T00AB17_A2956TiAny, T00AB17_A2958TiLin, T00AB17_A2959TiBarCod, T00AB17_A2960TiBarReo, T00AB17_A2961TiBarPar, T00AB17_A2962TiKgs, T00AB17_n2962TiKgs, T00AB17_A2963TiConos,
            T00AB17_n2963TiConos, T00AB17_A2964TiTipDis, T00AB17_n2964TiTipDis, T00AB17_A2965TiMaqCod, T00AB17_n2965TiMaqCod, T00AB17_A2966TiTipArt, T00AB17_n2966TiTipArt, T00AB17_A2967TiReoper, T00AB17_n2967TiReoper, T00AB17_A2968TiAgrupa,
            T00AB17_n2968TiAgrupa, T00AB17_A2969TiCosteP, T00AB17_n2969TiCosteP, T00AB17_A2970TiCosteA, T00AB17_n2970TiCosteA, T00AB17_A396EmprCod, T00AB17_A252CliCod, T00AB17_n252CliCod
            }
            , new Object[] {
            T00AB18_A396EmprCod
            }
            , new Object[] {
            T00AB19_A396EmprCod, T00AB19_A2954TiDia, T00AB19_A2955TiMes, T00AB19_A2956TiAny, T00AB19_A2958TiLin, T00AB19_A2959TiBarCod, T00AB19_A2960TiBarReo, T00AB19_A2961TiBarPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00AB23_A396EmprCod, T00AB23_A2954TiDia, T00AB23_A2955TiMes, T00AB23_A2956TiAny, T00AB23_A2958TiLin, T00AB23_A2959TiBarCod, T00AB23_A2960TiBarReo, T00AB23_A2961TiBarPar
            }
            , new Object[] {
            T00AB24_A407EmprNom, T00AB24_n407EmprNom
            }
            , new Object[] {
            T00AB25_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z2954TiDia ;
   private byte Z2955TiMes ;
   private byte Z2957TiUltLin ;
   private byte O2957TiUltLin ;
   private byte Z2958TiLin ;
   private byte Z2960TiBarReo ;
   private byte Z2967TiReoper ;
   private byte GxWebError ;
   private byte A2960TiBarReo ;
   private byte A2967TiReoper ;
   private byte nKeyPressed ;
   private byte A2957TiUltLin ;
   private byte Gx_BScreen ;
   private byte A2954TiDia ;
   private byte A2955TiMes ;
   private byte B2957TiUltLin ;
   private byte s2957TiUltLin ;
   private byte A2958TiLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2957TiUltLin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ2954TiDia ;
   private byte ZZ2955TiMes ;
   private byte ZZ2957TiUltLin ;
   private byte ZO2957TiUltLin ;
   private byte GXv_int10[] ;
   private byte GXv_int6[] ;
   private short Z2956TiAny ;
   private short Z2963TiConos ;
   private short Z2966TiTipArt ;
   private short nRcdDeleted_438 ;
   private short nRcdExists_438 ;
   private short nIsMod_438 ;
   private short A2963TiConos ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2956TiAny ;
   private short nBlankRcdCount438 ;
   private short RcdFound438 ;
   private short nBlankRcdUsr438 ;
   private short A2966TiTipArt ;
   private short RcdFound437 ;
   private short nIsDirty_437 ;
   private short nIsDirty_438 ;
   private short ZZ2956TiAny ;
   private short GXv_int8[] ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z2959TiBarCod ;
   private int Z252CliCod ;
   private int A2959TiBarCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtTiDia_Enabled ;
   private int edtTiMes_Enabled ;
   private int edtTiAny_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTiUltLin_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_438_Enabled ;
   private int edtTiLin_Enabled ;
   private int edtTiBarCod_Enabled ;
   private int edtTiBarReo_Enabled ;
   private int edtTiBarPar_Enabled ;
   private int edtTiKgs_Enabled ;
   private int edtTiConos_Enabled ;
   private int edtTiTipDis_Enabled ;
   private int edtTiMaqCod_Enabled ;
   private int edtTiTipArt_Enabled ;
   private int edtTiReoper_Enabled ;
   private int edtTiAgrupa_Enabled ;
   private int edtTiCosteP_Enabled ;
   private int edtTiCosteA_Enabled ;
   private int edtCliCod_Enabled ;
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
   private int defedtTiBarPar_Enabled ;
   private int defedtTiBarReo_Enabled ;
   private int defedtTiBarCod_Enabled ;
   private int defedtTiLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtTiUltLin_Backcolor ;
   private int edtTiAny_Backcolor ;
   private int edtTiMes_Backcolor ;
   private int edtTiDia_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int14[] ;
   private int GXv_int5[] ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z2962TiKgs ;
   private java.math.BigDecimal Z2969TiCosteP ;
   private java.math.BigDecimal Z2970TiCosteA ;
   private java.math.BigDecimal A2962TiKgs ;
   private java.math.BigDecimal A2969TiCosteP ;
   private java.math.BigDecimal A2970TiCosteA ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2961TiBarPar ;
   private String Z2964TiTipDis ;
   private String Z2965TiMaqCod ;
   private String Z2968TiAgrupa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A2961TiBarPar ;
   private String A2964TiTipDis ;
   private String A2965TiMaqCod ;
   private String A2968TiAgrupa ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTiDia_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtTiDia_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtTiMes_Internalname ;
   private String edtTiMes_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTiAny_Internalname ;
   private String edtTiAny_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTiUltLin_Internalname ;
   private String edtTiUltLin_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode438 ;
   private String edtavnRcdDeleted_438_Internalname ;
   private String edtTiLin_Internalname ;
   private String edtTiBarCod_Internalname ;
   private String edtTiBarReo_Internalname ;
   private String edtTiBarPar_Internalname ;
   private String edtTiKgs_Internalname ;
   private String edtTiConos_Internalname ;
   private String edtTiTipDis_Internalname ;
   private String edtTiMaqCod_Internalname ;
   private String edtTiTipArt_Internalname ;
   private String edtTiReoper_Internalname ;
   private String edtTiAgrupa_Internalname ;
   private String edtTiCosteP_Internalname ;
   private String edtTiCosteA_Internalname ;
   private String edtCliCod_Internalname ;
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
   private String AV8UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode437 ;
   private String GXCCtl ;
   private String AV29Station ;
   private String AV30EmprNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char4 ;
   private String Z407EmprNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_438_Jsonclick ;
   private String edtTiLin_Jsonclick ;
   private String edtTiBarCod_Jsonclick ;
   private String edtTiBarReo_Jsonclick ;
   private String edtTiBarPar_Jsonclick ;
   private String edtTiKgs_Jsonclick ;
   private String edtTiConos_Jsonclick ;
   private String edtTiTipDis_Jsonclick ;
   private String edtTiMaqCod_Jsonclick ;
   private String edtTiTipArt_Jsonclick ;
   private String edtTiReoper_Jsonclick ;
   private String edtTiAgrupa_Jsonclick ;
   private String edtTiCosteP_Jsonclick ;
   private String edtTiCosteA_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZV8UsurCod ;
   private String GXv_char11[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n2962TiKgs ;
   private boolean n2963TiConos ;
   private boolean n2964TiTipDis ;
   private boolean n2965TiMaqCod ;
   private boolean n2967TiReoper ;
   private boolean n2968TiAgrupa ;
   private boolean n2969TiCosteP ;
   private boolean n2970TiCosteA ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n2957TiUltLin ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n2966TiTipArt ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00AB7_A407EmprNom ;
   private boolean[] T00AB7_n407EmprNom ;
   private byte[] T00AB8_A2954TiDia ;
   private byte[] T00AB8_A2955TiMes ;
   private short[] T00AB8_A2956TiAny ;
   private byte[] T00AB8_A2957TiUltLin ;
   private boolean[] T00AB8_n2957TiUltLin ;
   private String[] T00AB8_A407EmprNom ;
   private boolean[] T00AB8_n407EmprNom ;
   private String[] T00AB8_A396EmprCod ;
   private String[] T00AB9_A396EmprCod ;
   private byte[] T00AB9_A2954TiDia ;
   private byte[] T00AB9_A2955TiMes ;
   private short[] T00AB9_A2956TiAny ;
   private byte[] T00AB6_A2954TiDia ;
   private byte[] T00AB6_A2955TiMes ;
   private short[] T00AB6_A2956TiAny ;
   private byte[] T00AB6_A2957TiUltLin ;
   private boolean[] T00AB6_n2957TiUltLin ;
   private String[] T00AB6_A396EmprCod ;
   private String[] T00AB10_A396EmprCod ;
   private byte[] T00AB10_A2954TiDia ;
   private byte[] T00AB10_A2955TiMes ;
   private short[] T00AB10_A2956TiAny ;
   private String[] T00AB11_A396EmprCod ;
   private byte[] T00AB11_A2954TiDia ;
   private byte[] T00AB11_A2955TiMes ;
   private short[] T00AB11_A2956TiAny ;
   private byte[] T00AB5_A2954TiDia ;
   private byte[] T00AB5_A2955TiMes ;
   private short[] T00AB5_A2956TiAny ;
   private byte[] T00AB5_A2957TiUltLin ;
   private boolean[] T00AB5_n2957TiUltLin ;
   private String[] T00AB5_A396EmprCod ;
   private String[] T00AB16_A396EmprCod ;
   private byte[] T00AB16_A2954TiDia ;
   private byte[] T00AB16_A2955TiMes ;
   private short[] T00AB16_A2956TiAny ;
   private byte[] T00AB17_A2954TiDia ;
   private byte[] T00AB17_A2955TiMes ;
   private short[] T00AB17_A2956TiAny ;
   private byte[] T00AB17_A2958TiLin ;
   private int[] T00AB17_A2959TiBarCod ;
   private byte[] T00AB17_A2960TiBarReo ;
   private String[] T00AB17_A2961TiBarPar ;
   private java.math.BigDecimal[] T00AB17_A2962TiKgs ;
   private boolean[] T00AB17_n2962TiKgs ;
   private short[] T00AB17_A2963TiConos ;
   private boolean[] T00AB17_n2963TiConos ;
   private String[] T00AB17_A2964TiTipDis ;
   private boolean[] T00AB17_n2964TiTipDis ;
   private String[] T00AB17_A2965TiMaqCod ;
   private boolean[] T00AB17_n2965TiMaqCod ;
   private short[] T00AB17_A2966TiTipArt ;
   private boolean[] T00AB17_n2966TiTipArt ;
   private byte[] T00AB17_A2967TiReoper ;
   private boolean[] T00AB17_n2967TiReoper ;
   private String[] T00AB17_A2968TiAgrupa ;
   private boolean[] T00AB17_n2968TiAgrupa ;
   private java.math.BigDecimal[] T00AB17_A2969TiCosteP ;
   private boolean[] T00AB17_n2969TiCosteP ;
   private java.math.BigDecimal[] T00AB17_A2970TiCosteA ;
   private boolean[] T00AB17_n2970TiCosteA ;
   private String[] T00AB17_A396EmprCod ;
   private int[] T00AB17_A252CliCod ;
   private boolean[] T00AB17_n252CliCod ;
   private String[] T00AB4_A396EmprCod ;
   private String[] T00AB18_A396EmprCod ;
   private String[] T00AB19_A396EmprCod ;
   private byte[] T00AB19_A2954TiDia ;
   private byte[] T00AB19_A2955TiMes ;
   private short[] T00AB19_A2956TiAny ;
   private byte[] T00AB19_A2958TiLin ;
   private int[] T00AB19_A2959TiBarCod ;
   private byte[] T00AB19_A2960TiBarReo ;
   private String[] T00AB19_A2961TiBarPar ;
   private byte[] T00AB3_A2954TiDia ;
   private byte[] T00AB3_A2955TiMes ;
   private short[] T00AB3_A2956TiAny ;
   private byte[] T00AB3_A2958TiLin ;
   private int[] T00AB3_A2959TiBarCod ;
   private byte[] T00AB3_A2960TiBarReo ;
   private String[] T00AB3_A2961TiBarPar ;
   private java.math.BigDecimal[] T00AB3_A2962TiKgs ;
   private boolean[] T00AB3_n2962TiKgs ;
   private short[] T00AB3_A2963TiConos ;
   private boolean[] T00AB3_n2963TiConos ;
   private String[] T00AB3_A2964TiTipDis ;
   private boolean[] T00AB3_n2964TiTipDis ;
   private String[] T00AB3_A2965TiMaqCod ;
   private boolean[] T00AB3_n2965TiMaqCod ;
   private short[] T00AB3_A2966TiTipArt ;
   private boolean[] T00AB3_n2966TiTipArt ;
   private byte[] T00AB3_A2967TiReoper ;
   private boolean[] T00AB3_n2967TiReoper ;
   private String[] T00AB3_A2968TiAgrupa ;
   private boolean[] T00AB3_n2968TiAgrupa ;
   private java.math.BigDecimal[] T00AB3_A2969TiCosteP ;
   private boolean[] T00AB3_n2969TiCosteP ;
   private java.math.BigDecimal[] T00AB3_A2970TiCosteA ;
   private boolean[] T00AB3_n2970TiCosteA ;
   private String[] T00AB3_A396EmprCod ;
   private int[] T00AB3_A252CliCod ;
   private boolean[] T00AB3_n252CliCod ;
   private byte[] T00AB2_A2954TiDia ;
   private byte[] T00AB2_A2955TiMes ;
   private short[] T00AB2_A2956TiAny ;
   private byte[] T00AB2_A2958TiLin ;
   private int[] T00AB2_A2959TiBarCod ;
   private byte[] T00AB2_A2960TiBarReo ;
   private String[] T00AB2_A2961TiBarPar ;
   private java.math.BigDecimal[] T00AB2_A2962TiKgs ;
   private boolean[] T00AB2_n2962TiKgs ;
   private short[] T00AB2_A2963TiConos ;
   private boolean[] T00AB2_n2963TiConos ;
   private String[] T00AB2_A2964TiTipDis ;
   private boolean[] T00AB2_n2964TiTipDis ;
   private String[] T00AB2_A2965TiMaqCod ;
   private boolean[] T00AB2_n2965TiMaqCod ;
   private short[] T00AB2_A2966TiTipArt ;
   private boolean[] T00AB2_n2966TiTipArt ;
   private byte[] T00AB2_A2967TiReoper ;
   private boolean[] T00AB2_n2967TiReoper ;
   private String[] T00AB2_A2968TiAgrupa ;
   private boolean[] T00AB2_n2968TiAgrupa ;
   private java.math.BigDecimal[] T00AB2_A2969TiCosteP ;
   private boolean[] T00AB2_n2969TiCosteP ;
   private java.math.BigDecimal[] T00AB2_A2970TiCosteA ;
   private boolean[] T00AB2_n2970TiCosteA ;
   private String[] T00AB2_A396EmprCod ;
   private int[] T00AB2_A252CliCod ;
   private boolean[] T00AB2_n252CliCod ;
   private String[] T00AB23_A396EmprCod ;
   private byte[] T00AB23_A2954TiDia ;
   private byte[] T00AB23_A2955TiMes ;
   private short[] T00AB23_A2956TiAny ;
   private byte[] T00AB23_A2958TiLin ;
   private int[] T00AB23_A2959TiBarCod ;
   private byte[] T00AB23_A2960TiBarReo ;
   private String[] T00AB23_A2961TiBarPar ;
   private String[] T00AB24_A407EmprNom ;
   private boolean[] T00AB24_n407EmprNom ;
   private String[] T00AB25_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdkgsti__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdkgsti__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdkgsti__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdkgsti__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdkgsti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00AB2", "SELECT TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar, TiKgs, TiConos, TiTipDis, TiMaqCod, TiTipArt, TiReoper, TiAgrupa, TiCosteP, TiCosteA, EmprCod, CliCod FROM TXPLKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? AND TiLin = ? AND TiBarCod = ? AND TiBarReo = ? AND TiBarPar = ?  FOR UPDATE OF TiKgs, TiConos, TiTipDis, TiMaqCod, TiTipArt, TiReoper, TiAgrupa, TiCosteP, TiCosteA, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB3", "SELECT TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar, TiKgs, TiConos, TiTipDis, TiMaqCod, TiTipArt, TiReoper, TiAgrupa, TiCosteP, TiCosteA, EmprCod, CliCod FROM TXPLKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? AND TiLin = ? AND TiBarCod = ? AND TiBarReo = ? AND TiBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB4", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB5", "SELECT TiDia, TiMes, TiAny, TiUltLin, EmprCod FROM TXPCKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ?  FOR UPDATE OF TiUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB6", "SELECT TiDia, TiMes, TiAny, TiUltLin, EmprCod FROM TXPCKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB8", "SELECT /*+ FIRST_ROWS(100) */ TM1.TiDia, TM1.TiMes, TM1.TiAny, TM1.TiUltLin, T2.EmprNom, TM1.EmprCod FROM (TXPCKGSTI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TiDia = ? and TM1.TiMes = ? and TM1.TiAny = ? ORDER BY TM1.EmprCod, TM1.TiDia, TM1.TiMes, TM1.TiAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE ( TiDia > ? or TiDia = ? and TiMes > ? or TiMes = ? and TiDia = ? and TiAny > ?) and EmprCod = ? ORDER BY EmprCod, TiDia, TiMes, TiAny) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00AB11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE ( TiDia < ? or TiDia = ? and TiMes < ? or TiMes = ? and TiDia = ? and TiAny < ?) and EmprCod = ? ORDER BY EmprCod DESC, TiDia DESC, TiMes DESC, TiAny DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00AB12", "INSERT INTO TXPCKGSTI(TiDia, TiMes, TiAny, TiUltLin, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCKGSTI")
         ,new UpdateCursor("T00AB13", "UPDATE TXPCKGSTI SET TiUltLin=?  WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ?", GX_NOMASK, "TXPCKGSTI")
         ,new UpdateCursor("T00AB14", "DELETE FROM TXPCKGSTI  WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ?", GX_NOMASK, "TXPCKGSTI")
         ,new UpdateCursor("T00AB15", "UPDATE TXPCKGSTI SET TiUltLin=?  WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ?", GX_NOMASK, "TXPCKGSTI")
         ,new ForEachCursor("T00AB16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ? ORDER BY EmprCod, TiDia, TiMes, TiAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB17", "SELECT TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar, TiKgs, TiConos, TiTipDis, TiMaqCod, TiTipArt, TiReoper, TiAgrupa, TiCosteP, TiCosteA, EmprCod, CliCod FROM TXPLKGSTI WHERE EmprCod = ? and TiDia = ? and TiMes = ? and TiAny = ? and TiLin = ? and TiBarCod = ? and TiBarReo = ? and TiBarPar = ? ORDER BY EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB18", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB19", "SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? AND TiLin = ? AND TiBarCod = ? AND TiBarReo = ? AND TiBarPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00AB20", "INSERT INTO TXPLKGSTI(TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar, TiKgs, TiConos, TiTipDis, TiMaqCod, TiTipArt, TiReoper, TiAgrupa, TiCosteP, TiCosteA, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLKGSTI")
         ,new UpdateCursor("T00AB21", "UPDATE TXPLKGSTI SET TiKgs=?, TiConos=?, TiTipDis=?, TiMaqCod=?, TiTipArt=?, TiReoper=?, TiAgrupa=?, TiCosteP=?, TiCosteA=?, CliCod=?  WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? AND TiLin = ? AND TiBarCod = ? AND TiBarReo = ? AND TiBarPar = ?", GX_NOMASK, "TXPLKGSTI")
         ,new UpdateCursor("T00AB22", "DELETE FROM TXPLKGSTI  WHERE EmprCod = ? AND TiDia = ? AND TiMes = ? AND TiAny = ? AND TiLin = ? AND TiBarCod = ? AND TiBarReo = ? AND TiBarPar = ?", GX_NOMASK, "TXPLKGSTI")
         ,new ForEachCursor("T00AB23", "SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? and TiDia = ? and TiMes = ? and TiAny = ? ORDER BY EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00AB25", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 3);
               ((int[]) buf[26])[0] = rslt.getInt(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 3);
               ((int[]) buf[26])[0] = rslt.getInt(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 3);
               ((int[]) buf[26])[0] = rslt.getInt(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setString(17, (String)parms[25], 3);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[27]).intValue());
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
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 6);
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
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 10);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               stmt.setString(11, (String)parms[20], 3);
               stmt.setByte(12, ((Number) parms[21]).byteValue());
               stmt.setByte(13, ((Number) parms[22]).byteValue());
               stmt.setShort(14, ((Number) parms[23]).shortValue());
               stmt.setByte(15, ((Number) parms[24]).byteValue());
               stmt.setInt(16, ((Number) parms[25]).intValue());
               stmt.setByte(17, ((Number) parms[26]).byteValue());
               stmt.setString(18, (String)parms[27], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

