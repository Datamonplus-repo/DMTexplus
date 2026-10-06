package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcolpre_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         AV17Nulo16 = httpContext.GetPar( "Nulo16") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", AV17Nulo16);
         A4365NomColor = httpContext.GetPar( "NomColor") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
         A4366NumColor = (int)(GXutil.lval( httpContext.GetPar( "NumColor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
         AV16OKColor = (byte)(GXutil.lval( httpContext.GetPar( "OKColor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.str( AV16OKColor, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_8_1EX1559( A396EmprCod, A252CliCod, AV17Nulo16, A4365NomColor, A4366NumColor, AV16OKColor) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5740TipProd = httpContext.GetPar( "TipProd") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_11_1EX1559( A396EmprCod, A5740TipProd) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A4364GrdTipArt) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO POR COLOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcolpre_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcolpre_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcolpre_impl.class ));
   }

   public tcolpre_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOLPRE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Gran Tipo de Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtGrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNomColor_Internalname, GXutil.rtrim( A4365NomColor), GXutil.rtrim( localUtil.format( A4365NomColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNomColor_Jsonclick, 0, "", "", "", "", "", 1, edtNomColor_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero de Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtNumColor_Internalname, GXutil.ltrim( localUtil.ntoc( A4366NumColor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtNumColor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4366NumColor), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4366NumColor), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNumColor_Jsonclick, 0, "", "", "", "", "", 1, edtNumColor_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColor_Internalname, GXutil.ltrim( localUtil.ntoc( A4367TipColor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4367TipColor), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4367TipColor), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColor_Jsonclick, 0, "", "", "", "", "", 1, edtTipColor_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Tipo de Producción (TIPDIS)", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipProd_Internalname, GXutil.rtrim( A5740TipProd), GXutil.rtrim( localUtil.format( A5740TipProd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipProd_Jsonclick, 0, "", "", "", "", "", 1, edtTipProd_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripcion Gran Tipo de Artic", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipDsc_Internalname, GXutil.rtrim( A4368GrdTipDsc), GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipDsc_Jsonclick, 0, "", "", "", "", "", 1, edtGrdTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Precio Actual", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFecColAct_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFecColAct_Internalname, localUtil.format(A4369FecColAct, "99/99/99"), localUtil.format( A4369FecColAct, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFecColAct_Jsonclick, 0, "", "", "", "", "", 1, edtFecColAct_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFecColAct_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFecColAct_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCOLPRE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Precio Color Actual Kilo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColActK_Internalname, GXutil.ltrim( localUtil.ntoc( A4370PColActK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPColActK_Enabled!=0) ? localUtil.format( A4370PColActK, "ZZZZZ9.999") : localUtil.format( A4370PColActK, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColActK_Jsonclick, 0, "", "", "", "", "", 1, edtPColActK_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Precio Color Actual Metro", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColActM_Internalname, GXutil.ltrim( localUtil.ntoc( A4371PColActM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPColActM_Enabled!=0) ? localUtil.format( A4371PColActM, "ZZZZZ9.999") : localUtil.format( A4371PColActM, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColActM_Jsonclick, 0, "", "", "", "", "", 1, edtPColActM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Definitivo?", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColActD_Internalname, GXutil.rtrim( A4372PColActD), GXutil.rtrim( localUtil.format( A4372PColActD, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColActD_Jsonclick, 0, "", "", "", "", "", 1, edtPColActD_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha Precio Color Anterior", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFecColAnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFecColAnt_Internalname, localUtil.format(A4373FecColAnt, "99/99/99"), localUtil.format( A4373FecColAnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFecColAnt_Jsonclick, 0, "", "", "", "", "", 1, edtFecColAnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFecColAnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFecColAnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCOLPRE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Precio Color Anterior Kilo", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColAntK_Internalname, GXutil.ltrim( localUtil.ntoc( A4374PColAntK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPColAntK_Enabled!=0) ? localUtil.format( A4374PColAntK, "ZZZZZ9.999") : localUtil.format( A4374PColAntK, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColAntK_Jsonclick, 0, "", "", "", "", "", 1, edtPColAntK_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Precio Color Anteriorl Metro", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColAntM_Internalname, GXutil.ltrim( localUtil.ntoc( A4375PColAntM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPColAntM_Enabled!=0) ? localUtil.format( A4375PColAntM, "ZZZZZ9.999") : localUtil.format( A4375PColAntM, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColAntM_Jsonclick, 0, "", "", "", "", "", 1, edtPColAntM_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Bonificar?", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOLPRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPColBoni_Internalname, GXutil.rtrim( A5044PColBoni), GXutil.rtrim( localUtil.format( A5044PColBoni, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPColBoni_Jsonclick, 0, "", "", "", "", "", 1, edtPColBoni_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOLPRE.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOLPRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOLPRE.htm");
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
      e111EX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4364GrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4365NomColor = httpContext.cgiGet( "Z4365NomColor") ;
            Z4366NumColor = (int)(localUtil.ctol( httpContext.cgiGet( "Z4366NumColor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4367TipColor = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4367TipColor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5740TipProd = httpContext.cgiGet( "Z5740TipProd") ;
            Z4369FecColAct = localUtil.ctod( httpContext.cgiGet( "Z4369FecColAct"), 0) ;
            Z4370PColActK = localUtil.ctond( httpContext.cgiGet( "Z4370PColActK")) ;
            Z4371PColActM = localUtil.ctond( httpContext.cgiGet( "Z4371PColActM")) ;
            Z4372PColActD = httpContext.cgiGet( "Z4372PColActD") ;
            Z4373FecColAnt = localUtil.ctod( httpContext.cgiGet( "Z4373FecColAnt"), 0) ;
            Z4374PColAntK = localUtil.ctond( httpContext.cgiGet( "Z4374PColAntK")) ;
            Z4375PColAntM = localUtil.ctond( httpContext.cgiGet( "Z4375PColAntM")) ;
            Z5044PColBoni = httpContext.cgiGet( "Z5044PColBoni") ;
            O4371PColActM = localUtil.ctond( httpContext.cgiGet( "O4371PColActM")) ;
            O4370PColActK = localUtil.ctond( httpContext.cgiGet( "O4370PColActK")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV18InputFec = (byte)(localUtil.ctol( httpContext.cgiGet( "vINPUTFEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            AV16OKColor = (byte)(localUtil.ctol( httpContext.cgiGet( "vOKCOLOR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Nulo16 = httpContext.cgiGet( "vNULO16") ;
            AV19TipDisDsc = httpContext.cgiGet( "vTIPDISDSC") ;
            AV20ExisTProd = (byte)(localUtil.ctol( httpContext.cgiGet( "vEXISTPROD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRDTIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4364GrdTipArt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            }
            else
            {
               A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            }
            A4365NomColor = httpContext.cgiGet( edtNomColor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNumColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNumColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "NUMCOLOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNumColor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4366NumColor = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
            }
            else
            {
               A4366NumColor = (int)(localUtil.ctol( httpContext.cgiGet( edtNumColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4367TipColor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
            }
            else
            {
               A4367TipColor = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
            }
            A5740TipProd = httpContext.cgiGet( edtTipProd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtFecColAct_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FECCOLACT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFecColAct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4369FecColAct = GXutil.nullDate() ;
               n4369FecColAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
            }
            else
            {
               A4369FecColAct = localUtil.ctod( httpContext.cgiGet( edtFecColAct_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4369FecColAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPColActK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPColActK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PCOLACTK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPColActK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4370PColActK = DecimalUtil.ZERO ;
               n4370PColActK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
            }
            else
            {
               A4370PColActK = localUtil.ctond( httpContext.cgiGet( edtPColActK_Internalname)) ;
               n4370PColActK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPColActM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPColActM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PCOLACTM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPColActM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4371PColActM = DecimalUtil.ZERO ;
               n4371PColActM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
            }
            else
            {
               A4371PColActM = localUtil.ctond( httpContext.cgiGet( edtPColActM_Internalname)) ;
               n4371PColActM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
            }
            A4372PColActD = GXutil.upper( httpContext.cgiGet( edtPColActD_Internalname)) ;
            n4372PColActD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
            if ( localUtil.vcdate( httpContext.cgiGet( edtFecColAnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FECCOLANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFecColAnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4373FecColAnt = GXutil.nullDate() ;
               n4373FecColAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
            }
            else
            {
               A4373FecColAnt = localUtil.ctod( httpContext.cgiGet( edtFecColAnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4373FecColAnt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPColAntK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPColAntK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PCOLANTK");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPColAntK_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4374PColAntK = DecimalUtil.ZERO ;
               n4374PColAntK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrimstr( A4374PColAntK, 12, 5));
            }
            else
            {
               A4374PColAntK = localUtil.ctond( httpContext.cgiGet( edtPColAntK_Internalname)) ;
               n4374PColAntK = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrimstr( A4374PColAntK, 12, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPColAntM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPColAntM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PCOLANTM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPColAntM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4375PColAntM = DecimalUtil.ZERO ;
               n4375PColAntM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrimstr( A4375PColAntM, 12, 5));
            }
            else
            {
               A4375PColAntM = localUtil.ctond( httpContext.cgiGet( edtPColAntM_Internalname)) ;
               n4375PColAntM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrimstr( A4375PColAntM, 12, 5));
            }
            A5044PColBoni = GXutil.upper( httpContext.cgiGet( edtPColBoni_Internalname)) ;
            n5044PColBoni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
               A4365NomColor = httpContext.GetPar( "NomColor") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
               A4366NumColor = (int)(GXutil.lval( httpContext.GetPar( "NumColor"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
               A4367TipColor = (byte)(GXutil.lval( httpContext.GetPar( "TipColor"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
               A5740TipProd = httpContext.GetPar( "TipProd") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
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
                     if ( GXutil.strcmp(sEvt, "'COLORES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'COLORES' */
                        e121EX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111EX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'TIPO PRODUCCION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Tipo Produccion' */
                        e131EX2 ();
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
            initAll1EX1559( ) ;
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
      disableAttributes1EX1559( ) ;
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

   public void confirm_1EX0( )
   {
      beforeValidate1EX1559( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EX1559( ) ;
         }
         else
         {
            checkExtendedTable1EX1559( ) ;
            if ( AnyError == 0 )
            {
               zm1EX1559( 14) ;
               zm1EX1559( 15) ;
               zm1EX1559( 16) ;
            }
            closeExtendedTableCursors1EX1559( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1EX0( ) ;
      }
   }

   public void resetCaption1EX0( )
   {
   }

   public void e111EX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcolpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV23Pgmname, (byte)(99), GXv_char2) ;
      tcolpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcolpre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcolpre_impl.this.A396EmprCod = GXv_char2[0] ;
      tcolpre_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcolpre_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV17Nulo16 = GXutil.space( (short)(16)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", AV17Nulo16);
   }

   public void e121EX2( )
   {
      /* 'COLORES' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void e131EX2( )
   {
      /* 'Tipo Produccion' Routine */
      returnInSub = false ;
      /*  Sending Event outputs  */
   }

   public void zm1EX1559( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4369FecColAct = T01EX3_A4369FecColAct[0] ;
            Z4370PColActK = T01EX3_A4370PColActK[0] ;
            Z4371PColActM = T01EX3_A4371PColActM[0] ;
            Z4372PColActD = T01EX3_A4372PColActD[0] ;
            Z4373FecColAnt = T01EX3_A4373FecColAnt[0] ;
            Z4374PColAntK = T01EX3_A4374PColAntK[0] ;
            Z4375PColAntM = T01EX3_A4375PColAntM[0] ;
            Z5044PColBoni = T01EX3_A5044PColBoni[0] ;
         }
         else
         {
            Z4369FecColAct = A4369FecColAct ;
            Z4370PColActK = A4370PColActK ;
            Z4371PColActM = A4371PColActM ;
            Z4372PColActD = A4372PColActD ;
            Z4373FecColAnt = A4373FecColAnt ;
            Z4374PColAntK = A4374PColAntK ;
            Z4375PColAntM = A4375PColAntM ;
            Z5044PColBoni = A5044PColBoni ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z4365NomColor = A4365NomColor ;
         Z4366NumColor = A4366NumColor ;
         Z4367TipColor = A4367TipColor ;
         Z5740TipProd = A5740TipProd ;
         Z4369FecColAct = A4369FecColAct ;
         Z4370PColActK = A4370PColActK ;
         Z4371PColActM = A4371PColActM ;
         Z4372PColActD = A4372PColActD ;
         Z4373FecColAnt = A4373FecColAnt ;
         Z4374PColAntK = A4374PColAntK ;
         Z4375PColAntM = A4375PColAntM ;
         Z5044PColBoni = A5044PColBoni ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFecColAct_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFecColAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFecColAct_Enabled), 5, 0), true);
      AV23Pgmname = "TCOLPRE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Pgmname", AV23Pgmname);
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01EX4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EX4_A407EmprNom[0] ;
      n407EmprNom = T01EX4_n407EmprNom[0] ;
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
      if ( isIns( )  && (GXutil.strcmp("", A4372PColActD)==0) && ( Gx_BScreen == 0 ) )
      {
         A4372PColActD = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n4372PColActD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
      }
      if ( isIns( )  && (GXutil.strcmp("", A5044PColBoni)==0) && ( Gx_BScreen == 0 ) )
      {
         A5044PColBoni = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         n5044PColBoni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
      }
      if ( isIns( )  )
      {
         A4369FecColAct = Gx_date ;
         n4369FecColAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1EX1559( )
   {
      /* Using cursor T01EX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1559 = (short)(1) ;
         A407EmprNom = T01EX7_A407EmprNom[0] ;
         n407EmprNom = T01EX7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4368GrdTipDsc = T01EX7_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A279CliNom = T01EX7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4369FecColAct = T01EX7_A4369FecColAct[0] ;
         n4369FecColAct = T01EX7_n4369FecColAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
         A4370PColActK = T01EX7_A4370PColActK[0] ;
         n4370PColActK = T01EX7_n4370PColActK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
         A4371PColActM = T01EX7_A4371PColActM[0] ;
         n4371PColActM = T01EX7_n4371PColActM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
         A4372PColActD = T01EX7_A4372PColActD[0] ;
         n4372PColActD = T01EX7_n4372PColActD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
         A4373FecColAnt = T01EX7_A4373FecColAnt[0] ;
         n4373FecColAnt = T01EX7_n4373FecColAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
         A4374PColAntK = T01EX7_A4374PColAntK[0] ;
         n4374PColAntK = T01EX7_n4374PColAntK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrimstr( A4374PColAntK, 12, 5));
         A4375PColAntM = T01EX7_A4375PColAntM[0] ;
         n4375PColAntM = T01EX7_n4375PColAntM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrimstr( A4375PColAntM, 12, 5));
         A5044PColBoni = T01EX7_A5044PColBoni[0] ;
         n5044PColBoni = T01EX7_n5044PColBoni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
         zm1EX1559( -13) ;
      }
      pr_default.close(5);
      onLoadActions1EX1559( ) ;
   }

   public void onLoadActions1EX1559( )
   {
   }

   public void checkExtendedTable1EX1559( )
   {
      nIsDirty_1559 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01EX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EX5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01EX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01EX6_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      pr_default.close(4);
      if ( (GXutil.strcmp("", A4365NomColor)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Digite Color", ""), 1, "NOMCOLOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNomColor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A252CliCod ;
      GXv_char3[0] = AV17Nulo16 ;
      GXv_char2[0] = A4365NomColor ;
      GXv_int6[0] = A4366NumColor ;
      GXv_int7[0] = AV16OKColor ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_int6, GXv_int7) ;
      tcolpre_impl.this.A396EmprCod = GXv_char4[0] ;
      tcolpre_impl.this.A252CliCod = GXv_int5[0] ;
      tcolpre_impl.this.AV17Nulo16 = GXv_char3[0] ;
      tcolpre_impl.this.A4365NomColor = GXv_char2[0] ;
      tcolpre_impl.this.A4366NumColor = GXv_int6[0] ;
      tcolpre_impl.this.AV16OKColor = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", AV17Nulo16);
      httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
      httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.str( AV16OKColor, 1, 0));
      if ( AV16OKColor == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Color", ""), 0, "");
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = AV19TipDisDsc ;
         GXv_int7[0] = AV20ExisTProd ;
         new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A5740TipProd, GXv_char4, GXv_int7) ;
         tcolpre_impl.this.AV19TipDisDsc = GXv_char4[0] ;
         tcolpre_impl.this.AV20ExisTProd = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19TipDisDsc", AV19TipDisDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV20ExisTProd", GXutil.str( AV20ExisTProd, 1, 0));
      }
      if ( true /* After */ && ( AV20ExisTProd == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Producción inexistente", ""), 1, "TIPPROD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipProd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4372PColActD, "S") == 0 ) || ( GXutil.strcmp(A4372PColActD, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Definitivo?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PCOLACTD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPColActD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1EX1559( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01EX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EX8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_16( String A396EmprCod ,
                          short A4364GrdTipArt )
   {
      /* Using cursor T01EX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01EX9_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4368GrdTipDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1EX1559( )
   {
      /* Using cursor T01EX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1559 = (short)(1) ;
      }
      else
      {
         RcdFound1559 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EX3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EX1559( 13) ;
         RcdFound1559 = (short)(1) ;
         A4365NomColor = T01EX3_A4365NomColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
         A4366NumColor = T01EX3_A4366NumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
         A4367TipColor = T01EX3_A4367TipColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
         A5740TipProd = T01EX3_A5740TipProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
         A4369FecColAct = T01EX3_A4369FecColAct[0] ;
         n4369FecColAct = T01EX3_n4369FecColAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
         A4370PColActK = T01EX3_A4370PColActK[0] ;
         n4370PColActK = T01EX3_n4370PColActK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
         A4371PColActM = T01EX3_A4371PColActM[0] ;
         n4371PColActM = T01EX3_n4371PColActM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
         A4372PColActD = T01EX3_A4372PColActD[0] ;
         n4372PColActD = T01EX3_n4372PColActD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
         A4373FecColAnt = T01EX3_A4373FecColAnt[0] ;
         n4373FecColAnt = T01EX3_n4373FecColAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
         A4374PColAntK = T01EX3_A4374PColAntK[0] ;
         n4374PColAntK = T01EX3_n4374PColAntK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrimstr( A4374PColAntK, 12, 5));
         A4375PColAntM = T01EX3_A4375PColAntM[0] ;
         n4375PColAntM = T01EX3_n4375PColAntM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrimstr( A4375PColAntM, 12, 5));
         A5044PColBoni = T01EX3_A5044PColBoni[0] ;
         n5044PColBoni = T01EX3_n5044PColBoni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
         A252CliCod = T01EX3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4364GrdTipArt = T01EX3_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         O4371PColActM = A4371PColActM ;
         n4371PColActM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
         O4370PColActK = A4370PColActK ;
         n4370PColActK = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4365NomColor = A4365NomColor ;
         Z4366NumColor = A4366NumColor ;
         Z4367TipColor = A4367TipColor ;
         Z5740TipProd = A5740TipProd ;
         sMode1559 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EX1559( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1559 = (short)(0) ;
            initializeNonKey1EX1559( ) ;
         }
         Gx_mode = sMode1559 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1559 = (short)(0) ;
         initializeNonKey1EX1559( ) ;
         sMode1559 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1559 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1EX1559( ) ;
      if ( RcdFound1559 == 0 )
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
      RcdFound1559 = (short)(0) ;
      /* Using cursor T01EX11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), A4365NomColor, A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), Integer.valueOf(A4366NumColor), Integer.valueOf(A4366NumColor), A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), Byte.valueOf(A4367TipColor), Byte.valueOf(A4367TipColor), Integer.valueOf(A4366NumColor), A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), A5740TipProd, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01EX11_A252CliCod[0] < A252CliCod ) || ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4364GrdTipArt[0] < A4364GrdTipArt ) || ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) < 0 ) || ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4366NumColor[0] < A4366NumColor ) || ( T01EX11_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4367TipColor[0] < A4367TipColor ) || ( T01EX11_A4367TipColor[0] == A4367TipColor ) && ( T01EX11_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX11_A5740TipProd[0], A5740TipProd) < 0 ) ) && ( GXutil.strcmp(T01EX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01EX11_A252CliCod[0] > A252CliCod ) || ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4364GrdTipArt[0] > A4364GrdTipArt ) || ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) > 0 ) || ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4366NumColor[0] > A4366NumColor ) || ( T01EX11_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( T01EX11_A4367TipColor[0] > A4367TipColor ) || ( T01EX11_A4367TipColor[0] == A4367TipColor ) && ( T01EX11_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX11_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX11_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX11_A5740TipProd[0], A5740TipProd) > 0 ) ) && ( GXutil.strcmp(T01EX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01EX11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4364GrdTipArt = T01EX11_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4365NomColor = T01EX11_A4365NomColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
            A4366NumColor = T01EX11_A4366NumColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
            A4367TipColor = T01EX11_A4367TipColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
            A5740TipProd = T01EX11_A5740TipProd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
            RcdFound1559 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1559 = (short)(0) ;
      /* Using cursor T01EX12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), A4365NomColor, A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), Integer.valueOf(A4366NumColor), Integer.valueOf(A4366NumColor), A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), Byte.valueOf(A4367TipColor), Byte.valueOf(A4367TipColor), Integer.valueOf(A4366NumColor), A4365NomColor, Short.valueOf(A4364GrdTipArt), Integer.valueOf(A252CliCod), A5740TipProd, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01EX12_A252CliCod[0] > A252CliCod ) || ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4364GrdTipArt[0] > A4364GrdTipArt ) || ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) > 0 ) || ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4366NumColor[0] > A4366NumColor ) || ( T01EX12_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4367TipColor[0] > A4367TipColor ) || ( T01EX12_A4367TipColor[0] == A4367TipColor ) && ( T01EX12_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX12_A5740TipProd[0], A5740TipProd) > 0 ) ) && ( GXutil.strcmp(T01EX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01EX12_A252CliCod[0] < A252CliCod ) || ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4364GrdTipArt[0] < A4364GrdTipArt ) || ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) < 0 ) || ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4366NumColor[0] < A4366NumColor ) || ( T01EX12_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( T01EX12_A4367TipColor[0] < A4367TipColor ) || ( T01EX12_A4367TipColor[0] == A4367TipColor ) && ( T01EX12_A4366NumColor[0] == A4366NumColor ) && ( GXutil.strcmp(T01EX12_A4365NomColor[0], A4365NomColor) == 0 ) && ( T01EX12_A4364GrdTipArt[0] == A4364GrdTipArt ) && ( T01EX12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01EX12_A5740TipProd[0], A5740TipProd) < 0 ) ) && ( GXutil.strcmp(T01EX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01EX12_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4364GrdTipArt = T01EX12_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4365NomColor = T01EX12_A4365NomColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
            A4366NumColor = T01EX12_A4366NumColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
            A4367TipColor = T01EX12_A4367TipColor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
            A5740TipProd = T01EX12_A5740TipProd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
            RcdFound1559 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EX1559( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1EX1559( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1559 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( GXutil.strcmp(A4365NomColor, Z4365NomColor) != 0 ) || ( A4366NumColor != Z4366NumColor ) || ( A4367TipColor != Z4367TipColor ) || ( GXutil.strcmp(A5740TipProd, Z5740TipProd) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4364GrdTipArt = Z4364GrdTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
               A4365NomColor = Z4365NomColor ;
               httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
               A4366NumColor = Z4366NumColor ;
               httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
               A4367TipColor = Z4367TipColor ;
               httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
               A5740TipProd = Z5740TipProd ;
               httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1EX1559( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( GXutil.strcmp(A4365NomColor, Z4365NomColor) != 0 ) || ( A4366NumColor != Z4366NumColor ) || ( A4367TipColor != Z4367TipColor ) || ( GXutil.strcmp(A5740TipProd, Z5740TipProd) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1EX1559( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1EX1559( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( GXutil.strcmp(A4365NomColor, Z4365NomColor) != 0 ) || ( A4366NumColor != Z4366NumColor ) || ( A4367TipColor != Z4367TipColor ) || ( GXutil.strcmp(A5740TipProd, Z5740TipProd) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4364GrdTipArt = Z4364GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4365NomColor = Z4365NomColor ;
         httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
         A4366NumColor = Z4366NumColor ;
         httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
         A4367TipColor = Z4367TipColor ;
         httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
         A5740TipProd = Z5740TipProd ;
         httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1EX1559( ) ;
      if ( RcdFound1559 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( GXutil.strcmp(A4365NomColor, Z4365NomColor) != 0 ) || ( A4366NumColor != Z4366NumColor ) || ( A4367TipColor != Z4367TipColor ) || ( GXutil.strcmp(A5740TipProd, Z5740TipProd) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4364GrdTipArt = Z4364GrdTipArt ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4365NomColor = Z4365NomColor ;
            httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
            A4366NumColor = Z4366NumColor ;
            httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
            A4367TipColor = Z4367TipColor ;
            httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
            A5740TipProd = Z5740TipProd ;
            httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4364GrdTipArt != Z4364GrdTipArt ) || ( GXutil.strcmp(A4365NomColor, Z4365NomColor) != 0 ) || ( A4366NumColor != Z4366NumColor ) || ( A4367TipColor != Z4367TipColor ) || ( GXutil.strcmp(A5740TipProd, Z5740TipProd) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcolpre");
      GX_FocusControl = edtFecColAct_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1EX0( ) ;
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
      if ( RcdFound1559 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFecColAct_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1EX1559( ) ;
      if ( RcdFound1559 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecColAct_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EX1559( ) ;
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
      if ( RcdFound1559 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecColAct_Internalname ;
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
      if ( RcdFound1559 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecColAct_Internalname ;
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
      scanStart1EX1559( ) ;
      if ( RcdFound1559 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1559 != 0 )
         {
            scanNext1EX1559( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFecColAct_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EX1559( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EX1559( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOLPRE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z4369FecColAct), GXutil.resetTime(T01EX2_A4369FecColAct[0])) ) || ( DecimalUtil.compareTo(Z4370PColActK, T01EX2_A4370PColActK[0]) != 0 ) || ( DecimalUtil.compareTo(Z4371PColActM, T01EX2_A4371PColActM[0]) != 0 ) || ( GXutil.strcmp(Z4372PColActD, T01EX2_A4372PColActD[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4373FecColAnt), GXutil.resetTime(T01EX2_A4373FecColAnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4374PColAntK, T01EX2_A4374PColAntK[0]) != 0 ) || ( DecimalUtil.compareTo(Z4375PColAntM, T01EX2_A4375PColAntM[0]) != 0 ) || ( GXutil.strcmp(Z5044PColBoni, T01EX2_A5044PColBoni[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4369FecColAct), GXutil.resetTime(T01EX2_A4369FecColAct[0])) ) )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"FecColAct");
               GXutil.writeLogRaw("Old: ",Z4369FecColAct);
               GXutil.writeLogRaw("Current: ",T01EX2_A4369FecColAct[0]);
            }
            if ( DecimalUtil.compareTo(Z4370PColActK, T01EX2_A4370PColActK[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColActK");
               GXutil.writeLogRaw("Old: ",Z4370PColActK);
               GXutil.writeLogRaw("Current: ",T01EX2_A4370PColActK[0]);
            }
            if ( DecimalUtil.compareTo(Z4371PColActM, T01EX2_A4371PColActM[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColActM");
               GXutil.writeLogRaw("Old: ",Z4371PColActM);
               GXutil.writeLogRaw("Current: ",T01EX2_A4371PColActM[0]);
            }
            if ( GXutil.strcmp(Z4372PColActD, T01EX2_A4372PColActD[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColActD");
               GXutil.writeLogRaw("Old: ",Z4372PColActD);
               GXutil.writeLogRaw("Current: ",T01EX2_A4372PColActD[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4373FecColAnt), GXutil.resetTime(T01EX2_A4373FecColAnt[0])) ) )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"FecColAnt");
               GXutil.writeLogRaw("Old: ",Z4373FecColAnt);
               GXutil.writeLogRaw("Current: ",T01EX2_A4373FecColAnt[0]);
            }
            if ( DecimalUtil.compareTo(Z4374PColAntK, T01EX2_A4374PColAntK[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColAntK");
               GXutil.writeLogRaw("Old: ",Z4374PColAntK);
               GXutil.writeLogRaw("Current: ",T01EX2_A4374PColAntK[0]);
            }
            if ( DecimalUtil.compareTo(Z4375PColAntM, T01EX2_A4375PColAntM[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColAntM");
               GXutil.writeLogRaw("Old: ",Z4375PColAntM);
               GXutil.writeLogRaw("Current: ",T01EX2_A4375PColAntM[0]);
            }
            if ( GXutil.strcmp(Z5044PColBoni, T01EX2_A5044PColBoni[0]) != 0 )
            {
               GXutil.writeLogln("tcolpre:[seudo value changed for attri]"+"PColBoni");
               GXutil.writeLogRaw("Old: ",Z5044PColBoni);
               GXutil.writeLogRaw("Current: ",T01EX2_A5044PColBoni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOLPRE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EX1559( )
   {
      beforeValidate1EX1559( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EX1559( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EX1559( 0) ;
         checkOptimisticConcurrency1EX1559( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EX1559( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EX1559( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EX13 */
                  pr_default.execute(11, new Object[] {A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd, Boolean.valueOf(n4369FecColAct), A4369FecColAct, Boolean.valueOf(n4370PColActK), A4370PColActK, Boolean.valueOf(n4371PColActM), A4371PColActM, Boolean.valueOf(n4372PColActD), A4372PColActD, Boolean.valueOf(n4373FecColAnt), A4373FecColAnt, Boolean.valueOf(n4374PColAntK), A4374PColAntK, Boolean.valueOf(n4375PColAntM), A4375PColAntM, Boolean.valueOf(n5044PColBoni), A5044PColBoni, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLPRE");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        resetCaption1EX0( ) ;
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
            load1EX1559( ) ;
         }
         endLevel1EX1559( ) ;
      }
      closeExtendedTableCursors1EX1559( ) ;
   }

   public void update1EX1559( )
   {
      beforeValidate1EX1559( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EX1559( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EX1559( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EX1559( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EX1559( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EX14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4369FecColAct), A4369FecColAct, Boolean.valueOf(n4370PColActK), A4370PColActK, Boolean.valueOf(n4371PColActM), A4371PColActM, Boolean.valueOf(n4372PColActD), A4372PColActD, Boolean.valueOf(n4373FecColAnt), A4373FecColAnt, Boolean.valueOf(n4374PColAntK), A4374PColAntK, Boolean.valueOf(n4375PColAntM), A4375PColAntM, Boolean.valueOf(n5044PColBoni), A5044PColBoni, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLPRE");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOLPRE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EX1559( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1EX0( ) ;
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
         endLevel1EX1559( ) ;
      }
      closeExtendedTableCursors1EX1559( ) ;
   }

   public void deferredUpdate1EX1559( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EX1559( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EX1559( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EX1559( ) ;
         afterConfirm1EX1559( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EX1559( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EX15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4364GrdTipArt), A4365NomColor, Integer.valueOf(A4366NumColor), Byte.valueOf(A4367TipColor), A5740TipProd});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOLPRE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1559 == 0 )
                     {
                        initAll1EX1559( ) ;
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
                     resetCaption1EX0( ) ;
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
      sMode1559 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EX1559( ) ;
      Gx_mode = sMode1559 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EX1559( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EX16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01EX16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
         /* Using cursor T01EX17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         A4368GrdTipDsc = T01EX17_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         pr_default.close(15);
      }
   }

   public void endLevel1EX1559( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EX1559( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcolpre");
         if ( AnyError == 0 )
         {
            confirmValues1EX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcolpre");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EX1559( )
   {
      /* Scan By routine */
      /* Using cursor T01EX18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1559 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1559 = (short)(1) ;
         A252CliCod = T01EX18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4364GrdTipArt = T01EX18_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4365NomColor = T01EX18_A4365NomColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
         A4366NumColor = T01EX18_A4366NumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
         A4367TipColor = T01EX18_A4367TipColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
         A5740TipProd = T01EX18_A5740TipProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EX1559( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1559 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1559 = (short)(1) ;
         A252CliCod = T01EX18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4364GrdTipArt = T01EX18_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4365NomColor = T01EX18_A4365NomColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
         A4366NumColor = T01EX18_A4366NumColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
         A4367TipColor = T01EX18_A4367TipColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
         A5740TipProd = T01EX18_A5740TipProd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
      }
   }

   public void scanEnd1EX1559( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1EX1559( )
   {
      /* After Confirm Rules */
      if ( isUpd( )  && ( ( DecimalUtil.compareTo(A4370PColActK, O4370PColActK) != 0 ) || ( DecimalUtil.compareTo(A4371PColActM, O4371PColActM) != 0 ) ) && true /* After */ )
      {
         A4369FecColAct = Gx_date ;
         n4369FecColAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
      }
      if ( isIns( )  && true /* After */ && ( A4371PColActM.doubleValue() == 0 ) && ( A4370PColActK.doubleValue() == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Los precios están en cero", ""), 0, "PCOLACTK");
      }
   }

   public void beforeInsert1EX1559( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EX1559( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EX1559( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EX1559( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EX1559( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EX1559( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtNomColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNomColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNomColor_Enabled), 5, 0), true);
      edtNumColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumColor_Enabled), 5, 0), true);
      edtTipColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColor_Enabled), 5, 0), true);
      edtTipProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipProd_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtFecColAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFecColAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFecColAct_Enabled), 5, 0), true);
      edtPColActK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColActK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColActK_Enabled), 5, 0), true);
      edtPColActM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColActM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColActM_Enabled), 5, 0), true);
      edtPColActD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColActD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColActD_Enabled), 5, 0), true);
      edtFecColAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFecColAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFecColAnt_Enabled), 5, 0), true);
      edtPColAntK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColAntK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColAntK_Enabled), 5, 0), true);
      edtPColAntM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColAntM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColAntM_Enabled), 5, 0), true);
      edtPColBoni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPColBoni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPColBoni_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1EX1559( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1EX0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcolpre", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4365NomColor", GXutil.rtrim( Z4365NomColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4366NumColor", GXutil.ltrim( localUtil.ntoc( Z4366NumColor, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4367TipColor", GXutil.ltrim( localUtil.ntoc( Z4367TipColor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5740TipProd", GXutil.rtrim( Z5740TipProd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4369FecColAct", localUtil.dtoc( Z4369FecColAct, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4370PColActK", GXutil.ltrim( localUtil.ntoc( Z4370PColActK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4371PColActM", GXutil.ltrim( localUtil.ntoc( Z4371PColActM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4372PColActD", GXutil.rtrim( Z4372PColActD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4373FecColAnt", localUtil.dtoc( Z4373FecColAnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4374PColAntK", GXutil.ltrim( localUtil.ntoc( Z4374PColAntK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4375PColAntM", GXutil.ltrim( localUtil.ntoc( Z4375PColAntM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5044PColBoni", GXutil.rtrim( Z5044PColBoni));
      app.GxWebStd.gx_hidden_field( httpContext, "O4371PColActM", GXutil.ltrim( localUtil.ntoc( O4371PColActM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4370PColActK", GXutil.ltrim( localUtil.ntoc( O4370PColActK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV13Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNOMCLI", GXutil.rtrim( AV14ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV15ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINPUTFEC", GXutil.ltrim( localUtil.ntoc( AV18InputFec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKCOLOR", GXutil.ltrim( localUtil.ntoc( AV16OKColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNULO16", GXutil.rtrim( AV17Nulo16));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDISDSC", GXutil.rtrim( AV19TipDisDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTPROD", GXutil.ltrim( localUtil.ntoc( AV20ExisTProd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV23Pgmname));
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
      return formatLink("app.tcolpre", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCOLPRE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO POR COLOR", "") ;
   }

   public void initializeNonKey1EX1559( )
   {
      AV16OKColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.str( AV16OKColor, 1, 0));
      AV19TipDisDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19TipDisDsc", AV19TipDisDsc);
      AV20ExisTProd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ExisTProd", GXutil.str( AV20ExisTProd, 1, 0));
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4369FecColAct = GXutil.nullDate() ;
      n4369FecColAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
      A4370PColActK = DecimalUtil.ZERO ;
      n4370PColActK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
      A4371PColActM = DecimalUtil.ZERO ;
      n4371PColActM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
      A4373FecColAnt = GXutil.nullDate() ;
      n4373FecColAnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
      A4374PColAntK = DecimalUtil.ZERO ;
      n4374PColAntK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrimstr( A4374PColAntK, 12, 5));
      A4375PColAntM = DecimalUtil.ZERO ;
      n4375PColAntM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrimstr( A4375PColAntM, 12, 5));
      A4372PColActD = httpContext.getMessage( "S", "") ;
      n4372PColActD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
      A5044PColBoni = httpContext.getMessage( "S", "") ;
      n5044PColBoni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
      O4371PColActM = A4371PColActM ;
      n4371PColActM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrimstr( A4371PColActM, 12, 5));
      O4370PColActK = A4370PColActK ;
      n4370PColActK = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrimstr( A4370PColActK, 12, 5));
      Z4369FecColAct = GXutil.nullDate() ;
      Z4370PColActK = DecimalUtil.ZERO ;
      Z4371PColActM = DecimalUtil.ZERO ;
      Z4372PColActD = "" ;
      Z4373FecColAnt = GXutil.nullDate() ;
      Z4374PColAntK = DecimalUtil.ZERO ;
      Z4375PColAntM = DecimalUtil.ZERO ;
      Z5044PColBoni = "" ;
   }

   public void initAll1EX1559( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4364GrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      A4365NomColor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
      A4366NumColor = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
      A4367TipColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4367TipColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4367TipColor), 2, 0));
      A5740TipProd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5740TipProd", A5740TipProd);
      initializeNonKey1EX1559( ) ;
   }

   public void standaloneModalInsert( )
   {
      A4372PColActD = i4372PColActD ;
      n4372PColActD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", A4372PColActD);
      A5044PColBoni = i5044PColBoni ;
      n5044PColBoni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", A5044PColBoni);
      A4369FecColAct = i4369FecColAct ;
      n4369FecColAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565967", true, true);
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
      httpContext.AddJavascriptSource("tcolpre.js", "?20268241565968", false, true);
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtNomColor_Internalname = "NOMCOLOR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtNumColor_Internalname = "NUMCOLOR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipColor_Internalname = "TIPCOLOR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipProd_Internalname = "TIPPROD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtGrdTipDsc_Internalname = "GRDTIPDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtFecColAct_Internalname = "FECCOLACT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtPColActK_Internalname = "PCOLACTK" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtPColActM_Internalname = "PCOLACTM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtPColActD_Internalname = "PCOLACTD" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtFecColAnt_Internalname = "FECCOLANT" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtPColAntK_Internalname = "PCOLANTK" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtPColAntM_Internalname = "PCOLANTM" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtPColBoni_Internalname = "PCOLBONI" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO POR COLOR", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPColBoni_Jsonclick = "" ;
      edtPColBoni_Backcolor = (int)(0xFFFFFF) ;
      edtPColBoni_Enabled = 1 ;
      edtPColAntM_Jsonclick = "" ;
      edtPColAntM_Backcolor = (int)(0xFFFFFF) ;
      edtPColAntM_Enabled = 1 ;
      edtPColAntK_Jsonclick = "" ;
      edtPColAntK_Backcolor = (int)(0xFFFFFF) ;
      edtPColAntK_Enabled = 1 ;
      edtFecColAnt_Jsonclick = "" ;
      edtFecColAnt_Backcolor = (int)(0xFFFFFF) ;
      edtFecColAnt_Enabled = 1 ;
      edtPColActD_Jsonclick = "" ;
      edtPColActD_Backcolor = (int)(0xFFFFFF) ;
      edtPColActD_Enabled = 1 ;
      edtPColActM_Jsonclick = "" ;
      edtPColActM_Backcolor = (int)(0xFFFFFF) ;
      edtPColActM_Enabled = 1 ;
      edtPColActK_Jsonclick = "" ;
      edtPColActK_Backcolor = (int)(0xFFFFFF) ;
      edtPColActK_Enabled = 1 ;
      edtFecColAct_Jsonclick = "" ;
      edtFecColAct_Backcolor = (int)(0xFFFFFF) ;
      edtFecColAct_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtGrdTipDsc_Jsonclick = "" ;
      edtGrdTipDsc_Backcolor = (int)(0xFFFFFF) ;
      edtGrdTipDsc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipProd_Jsonclick = "" ;
      edtTipProd_Backcolor = (int)(0xFFFFFF) ;
      edtTipProd_Enabled = 1 ;
      edtTipColor_Jsonclick = "" ;
      edtTipColor_Backcolor = (int)(0xFFFFFF) ;
      edtTipColor_Enabled = 1 ;
      edtNumColor_Jsonclick = "" ;
      edtNumColor_Backcolor = (int)(0xFFFFFF) ;
      edtNumColor_Enabled = 1 ;
      edtNomColor_Jsonclick = "" ;
      edtNomColor_Backcolor = (int)(0xFFFFFF) ;
      edtNomColor_Enabled = 1 ;
      edtGrdTipArt_Jsonclick = "" ;
      edtGrdTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtGrdTipArt_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void xc_8_1EX1559( String A396EmprCod ,
                             int A252CliCod ,
                             String AV17Nulo16 ,
                             String A4365NomColor ,
                             int A4366NumColor ,
                             byte AV16OKColor )
   {
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A252CliCod ;
      GXv_char3[0] = AV17Nulo16 ;
      GXv_char2[0] = A4365NomColor ;
      GXv_int5[0] = A4366NumColor ;
      GXv_int7[0] = AV16OKColor ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int7) ;
      A396EmprCod = GXv_char4[0] ;
      A252CliCod = GXv_int6[0] ;
      AV17Nulo16 = GXv_char3[0] ;
      A4365NomColor = GXv_char2[0] ;
      A4366NumColor = GXv_int5[0] ;
      AV16OKColor = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", AV17Nulo16);
      httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", A4365NomColor);
      httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4366NumColor), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.str( AV16OKColor, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV17Nulo16))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4365NomColor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4366NumColor, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16OKColor, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_11_1EX1559( String A396EmprCod ,
                              String A5740TipProd )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = AV19TipDisDsc ;
         GXv_int7[0] = AV20ExisTProd ;
         new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A5740TipProd, GXv_char4, GXv_int7) ;
         AV19TipDisDsc = GXv_char4[0] ;
         AV20ExisTProd = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19TipDisDsc", AV19TipDisDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV20ExisTProd", GXutil.str( AV20ExisTProd, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV19TipDisDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV20ExisTProd, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      /* Using cursor T01EX19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EX19_A407EmprNom[0] ;
      n407EmprNom = T01EX19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
      /* Using cursor T01EX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01EX16_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(14);
      /* Using cursor T01EX17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T01EX17_A4368GrdTipDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      pr_default.close(15);
      GX_FocusControl = edtFecColAct_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01EX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01EX16_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Grdtipart( )
   {
      /* Using cursor T01EX17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
      }
      A4368GrdTipDsc = T01EX17_A4368GrdTipDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
   }

   public void valid_Numcolor( )
   {
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A252CliCod ;
      GXv_char3[0] = AV17Nulo16 ;
      GXv_char2[0] = A4365NomColor ;
      GXv_int5[0] = A4366NumColor ;
      GXv_int7[0] = AV16OKColor ;
      new app.controlcalidadhtd.pccchkcol(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int5, GXv_int7) ;
      tcolpre_impl.this.A396EmprCod = GXv_char4[0] ;
      A396EmprCod = this.A396EmprCod ;
      tcolpre_impl.this.A252CliCod = GXv_int6[0] ;
      A252CliCod = this.A252CliCod ;
      tcolpre_impl.this.AV17Nulo16 = GXv_char3[0] ;
      AV17Nulo16 = this.AV17Nulo16 ;
      tcolpre_impl.this.A4365NomColor = GXv_char2[0] ;
      A4365NomColor = this.A4365NomColor ;
      tcolpre_impl.this.A4366NumColor = GXv_int5[0] ;
      A4366NumColor = this.A4366NumColor ;
      tcolpre_impl.this.AV16OKColor = GXv_int7[0] ;
      AV16OKColor = this.AV16OKColor ;
      if ( AV16OKColor == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Color", ""), 0, "");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", GXutil.rtrim( AV17Nulo16));
      httpContext.ajax_rsp_assign_attri("", false, "A4365NomColor", GXutil.rtrim( A4365NomColor));
      httpContext.ajax_rsp_assign_attri("", false, "A4366NumColor", GXutil.ltrim( localUtil.ntoc( A4366NumColor, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.ltrim( localUtil.ntoc( AV16OKColor, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Tipprod( )
   {
      n4372PColActD = false ;
      n5044PColBoni = false ;
      n4369FecColAct = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( true /* After */ )
      {
         GXv_char4[0] = AV19TipDisDsc ;
         GXv_int7[0] = AV20ExisTProd ;
         new app.pbustdi(remoteHandle, context).execute( A396EmprCod, A5740TipProd, GXv_char4, GXv_int7) ;
         tcolpre_impl.this.AV19TipDisDsc = GXv_char4[0] ;
         AV19TipDisDsc = this.AV19TipDisDsc ;
         tcolpre_impl.this.AV20ExisTProd = GXv_int7[0] ;
         AV20ExisTProd = this.AV20ExisTProd ;
      }
      if ( true /* After */ && ( AV20ExisTProd == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo Producción inexistente", ""), 1, "TIPPROD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipProd_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4369FecColAct", localUtil.format(A4369FecColAct, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4370PColActK", GXutil.ltrim( localUtil.ntoc( A4370PColActK, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4371PColActM", GXutil.ltrim( localUtil.ntoc( A4371PColActM, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4372PColActD", GXutil.rtrim( A4372PColActD));
      httpContext.ajax_rsp_assign_attri("", false, "A4373FecColAnt", localUtil.format(A4373FecColAnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4374PColAntK", GXutil.ltrim( localUtil.ntoc( A4374PColAntK, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4375PColAntM", GXutil.ltrim( localUtil.ntoc( A4375PColAntM, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5044PColBoni", GXutil.rtrim( A5044PColBoni));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV16OKColor", GXutil.ltrim( localUtil.ntoc( AV16OKColor, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Nulo16", GXutil.rtrim( AV17Nulo16));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4365NomColor", GXutil.rtrim( Z4365NomColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4366NumColor", GXutil.ltrim( localUtil.ntoc( Z4366NumColor, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4367TipColor", GXutil.ltrim( localUtil.ntoc( Z4367TipColor, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5740TipProd", GXutil.rtrim( Z5740TipProd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4369FecColAct", localUtil.format(Z4369FecColAct, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4370PColActK", GXutil.ltrim( localUtil.ntoc( Z4370PColActK, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4371PColActM", GXutil.ltrim( localUtil.ntoc( Z4371PColActM, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4372PColActD", GXutil.rtrim( Z4372PColActD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4373FecColAnt", localUtil.format(Z4373FecColAnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4374PColAntK", GXutil.ltrim( localUtil.ntoc( Z4374PColAntK, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4375PColAntM", GXutil.ltrim( localUtil.ntoc( Z4375PColAntM, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5044PColBoni", GXutil.rtrim( Z5044PColBoni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV16OKColor", GXutil.ltrim( localUtil.ntoc( ZV16OKColor, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17Nulo16", GXutil.rtrim( ZV17Nulo16));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV19TipDisDsc", GXutil.rtrim( ZV19TipDisDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV20ExisTProd", GXutil.ltrim( localUtil.ntoc( ZV20ExisTProd, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4371PColActM", GXutil.ltrim( localUtil.ntoc( O4371PColActM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4370PColActK", GXutil.ltrim( localUtil.ntoc( O4370PColActK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19TipDisDsc", GXutil.rtrim( AV19TipDisDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV20ExisTProd", GXutil.ltrim( localUtil.ntoc( AV20ExisTProd, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("'COLORES'","{handler:'e121EX2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV13Forser',fld:'vFORSER',pic:''},{av:'AV14ForNomCli',fld:'vFORNOMCLI',pic:''},{av:'AV15ForNumCli',fld:'vFORNUMCLI',pic:'ZZZZZ9'},{av:'A4365NomColor',fld:'NOMCOLOR',pic:''},{av:'A4366NumColor',fld:'NUMCOLOR',pic:'ZZZZZ9'},{av:'A4367TipColor',fld:'TIPCOLOR',pic:'Z9'}]");
      setEventMetadata("'COLORES'",",oparms:[{av:'A4367TipColor',fld:'TIPCOLOR',pic:'Z9'},{av:'A4366NumColor',fld:'NUMCOLOR',pic:'ZZZZZ9'},{av:'A4365NomColor',fld:'NOMCOLOR',pic:''},{av:'AV15ForNumCli',fld:'vFORNUMCLI',pic:'ZZZZZ9'},{av:'AV14ForNomCli',fld:'vFORNOMCLI',pic:''},{av:'AV13Forser',fld:'vFORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'TIPO PRODUCCION'","{handler:'e131EX2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5740TipProd',fld:'TIPPROD',pic:''}]");
      setEventMetadata("'TIPO PRODUCCION'",",oparms:[{av:'A5740TipProd',fld:'TIPPROD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]}");
      setEventMetadata("VALID_NOMCOLOR","{handler:'valid_Nomcolor',iparms:[]");
      setEventMetadata("VALID_NOMCOLOR",",oparms:[]}");
      setEventMetadata("VALID_NUMCOLOR","{handler:'valid_Numcolor',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4365NomColor',fld:'NOMCOLOR',pic:''},{av:'A4366NumColor',fld:'NUMCOLOR',pic:'ZZZZZ9'},{av:'AV16OKColor',fld:'vOKCOLOR',pic:'9'},{av:'AV17Nulo16',fld:'vNULO16',pic:''}]");
      setEventMetadata("VALID_NUMCOLOR",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV17Nulo16',fld:'vNULO16',pic:''},{av:'A4365NomColor',fld:'NOMCOLOR',pic:''},{av:'A4366NumColor',fld:'NUMCOLOR',pic:'ZZZZZ9'},{av:'AV16OKColor',fld:'vOKCOLOR',pic:'9'}]}");
      setEventMetadata("VALID_TIPCOLOR","{handler:'valid_Tipcolor',iparms:[]");
      setEventMetadata("VALID_TIPCOLOR",",oparms:[]}");
      setEventMetadata("VALID_TIPPROD","{handler:'valid_Tipprod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4365NomColor',fld:'NOMCOLOR',pic:''},{av:'A4366NumColor',fld:'NUMCOLOR',pic:'ZZZZZ9'},{av:'A4367TipColor',fld:'TIPCOLOR',pic:'Z9'},{av:'A5740TipProd',fld:'TIPPROD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A4372PColActD',fld:'PCOLACTD',pic:'@!'},{av:'A5044PColBoni',fld:'PCOLBONI',pic:'@!'},{av:'A4369FecColAct',fld:'FECCOLACT',pic:''},{av:'AV16OKColor',fld:'vOKCOLOR',pic:'9'},{av:'AV17Nulo16',fld:'vNULO16',pic:''},{av:'AV19TipDisDsc',fld:'vTIPDISDSC',pic:''},{av:'AV20ExisTProd',fld:'vEXISTPROD',pic:'9'}]");
      setEventMetadata("VALID_TIPPROD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4369FecColAct',fld:'FECCOLACT',pic:''},{av:'A4370PColActK',fld:'PCOLACTK',pic:'ZZZZZ9.999'},{av:'A4371PColActM',fld:'PCOLACTM',pic:'ZZZZZ9.999'},{av:'A4372PColActD',fld:'PCOLACTD',pic:'@!'},{av:'A4373FecColAnt',fld:'FECCOLANT',pic:''},{av:'A4374PColAntK',fld:'PCOLANTK',pic:'ZZZZZ9.999'},{av:'A4375PColAntM',fld:'PCOLANTM',pic:'ZZZZZ9.999'},{av:'A5044PColBoni',fld:'PCOLBONI',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''},{av:'AV16OKColor',fld:'vOKCOLOR',pic:'9'},{av:'AV17Nulo16',fld:'vNULO16',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z4364GrdTipArt'},{av:'Z4365NomColor'},{av:'Z4366NumColor'},{av:'Z4367TipColor'},{av:'Z5740TipProd'},{av:'Z407EmprNom'},{av:'Z4369FecColAct'},{av:'Z4370PColActK'},{av:'Z4371PColActM'},{av:'Z4372PColActD'},{av:'Z4373FecColAnt'},{av:'Z4374PColAntK'},{av:'Z4375PColAntM'},{av:'Z5044PColBoni'},{av:'Z279CliNom'},{av:'Z4368GrdTipDsc'},{av:'ZV16OKColor'},{av:'ZV17Nulo16'},{av:'ZV19TipDisDsc'},{av:'ZV20ExisTProd'},{av:'O4371PColActM'},{av:'O4370PColActK'},{av:'AV19TipDisDsc',fld:'vTIPDISDSC',pic:''},{av:'AV20ExisTProd',fld:'vEXISTPROD',pic:'9'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PCOLACTK","{handler:'valid_Pcolactk',iparms:[]");
      setEventMetadata("VALID_PCOLACTK",",oparms:[]}");
      setEventMetadata("VALID_PCOLACTM","{handler:'valid_Pcolactm',iparms:[]");
      setEventMetadata("VALID_PCOLACTM",",oparms:[]}");
      setEventMetadata("VALID_PCOLACTD","{handler:'valid_Pcolactd',iparms:[]");
      setEventMetadata("VALID_PCOLACTD",",oparms:[]}");
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
      pr_default.close(17);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4365NomColor = "" ;
      Z5740TipProd = "" ;
      Z4369FecColAct = GXutil.nullDate() ;
      Z4370PColActK = DecimalUtil.ZERO ;
      Z4371PColActM = DecimalUtil.ZERO ;
      Z4372PColActD = "" ;
      Z4373FecColAnt = GXutil.nullDate() ;
      Z4374PColAntK = DecimalUtil.ZERO ;
      Z4375PColAntM = DecimalUtil.ZERO ;
      Z5044PColBoni = "" ;
      O4371PColActM = DecimalUtil.ZERO ;
      O4370PColActK = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV17Nulo16 = "" ;
      A4365NomColor = "" ;
      A5740TipProd = "" ;
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
      A4368GrdTipDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4369FecColAct = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A4370PColActK = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A4371PColActM = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A4372PColActD = "" ;
      lblTextblock15_Jsonclick = "" ;
      A4373FecColAnt = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      A4374PColAntK = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A4375PColAntM = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A5044PColBoni = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      Gx_date = GXutil.nullDate() ;
      AV19TipDisDsc = "" ;
      AV23Pgmname = "" ;
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
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z4368GrdTipDsc = "" ;
      T01EX4_A407EmprNom = new String[] {""} ;
      T01EX4_n407EmprNom = new boolean[] {false} ;
      T01EX7_A4365NomColor = new String[] {""} ;
      T01EX7_A4366NumColor = new int[1] ;
      T01EX7_A4367TipColor = new byte[1] ;
      T01EX7_A5740TipProd = new String[] {""} ;
      T01EX7_A407EmprNom = new String[] {""} ;
      T01EX7_n407EmprNom = new boolean[] {false} ;
      T01EX7_A4368GrdTipDsc = new String[] {""} ;
      T01EX7_A279CliNom = new String[] {""} ;
      T01EX7_A4369FecColAct = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX7_n4369FecColAct = new boolean[] {false} ;
      T01EX7_A4370PColActK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX7_n4370PColActK = new boolean[] {false} ;
      T01EX7_A4371PColActM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX7_n4371PColActM = new boolean[] {false} ;
      T01EX7_A4372PColActD = new String[] {""} ;
      T01EX7_n4372PColActD = new boolean[] {false} ;
      T01EX7_A4373FecColAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX7_n4373FecColAnt = new boolean[] {false} ;
      T01EX7_A4374PColAntK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX7_n4374PColAntK = new boolean[] {false} ;
      T01EX7_A4375PColAntM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX7_n4375PColAntM = new boolean[] {false} ;
      T01EX7_A5044PColBoni = new String[] {""} ;
      T01EX7_n5044PColBoni = new boolean[] {false} ;
      T01EX7_A396EmprCod = new String[] {""} ;
      T01EX7_A252CliCod = new int[1] ;
      T01EX7_A4364GrdTipArt = new short[1] ;
      T01EX5_A279CliNom = new String[] {""} ;
      T01EX6_A4368GrdTipDsc = new String[] {""} ;
      T01EX8_A279CliNom = new String[] {""} ;
      T01EX9_A4368GrdTipDsc = new String[] {""} ;
      T01EX10_A396EmprCod = new String[] {""} ;
      T01EX10_A252CliCod = new int[1] ;
      T01EX10_A4364GrdTipArt = new short[1] ;
      T01EX10_A4365NomColor = new String[] {""} ;
      T01EX10_A4366NumColor = new int[1] ;
      T01EX10_A4367TipColor = new byte[1] ;
      T01EX10_A5740TipProd = new String[] {""} ;
      T01EX3_A4365NomColor = new String[] {""} ;
      T01EX3_A4366NumColor = new int[1] ;
      T01EX3_A4367TipColor = new byte[1] ;
      T01EX3_A5740TipProd = new String[] {""} ;
      T01EX3_A4369FecColAct = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX3_n4369FecColAct = new boolean[] {false} ;
      T01EX3_A4370PColActK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX3_n4370PColActK = new boolean[] {false} ;
      T01EX3_A4371PColActM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX3_n4371PColActM = new boolean[] {false} ;
      T01EX3_A4372PColActD = new String[] {""} ;
      T01EX3_n4372PColActD = new boolean[] {false} ;
      T01EX3_A4373FecColAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX3_n4373FecColAnt = new boolean[] {false} ;
      T01EX3_A4374PColAntK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX3_n4374PColAntK = new boolean[] {false} ;
      T01EX3_A4375PColAntM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX3_n4375PColAntM = new boolean[] {false} ;
      T01EX3_A5044PColBoni = new String[] {""} ;
      T01EX3_n5044PColBoni = new boolean[] {false} ;
      T01EX3_A396EmprCod = new String[] {""} ;
      T01EX3_A252CliCod = new int[1] ;
      T01EX3_A4364GrdTipArt = new short[1] ;
      sMode1559 = "" ;
      T01EX11_A396EmprCod = new String[] {""} ;
      T01EX11_A252CliCod = new int[1] ;
      T01EX11_A4364GrdTipArt = new short[1] ;
      T01EX11_A4365NomColor = new String[] {""} ;
      T01EX11_A4366NumColor = new int[1] ;
      T01EX11_A4367TipColor = new byte[1] ;
      T01EX11_A5740TipProd = new String[] {""} ;
      T01EX12_A396EmprCod = new String[] {""} ;
      T01EX12_A252CliCod = new int[1] ;
      T01EX12_A4364GrdTipArt = new short[1] ;
      T01EX12_A4365NomColor = new String[] {""} ;
      T01EX12_A4366NumColor = new int[1] ;
      T01EX12_A4367TipColor = new byte[1] ;
      T01EX12_A5740TipProd = new String[] {""} ;
      T01EX2_A4365NomColor = new String[] {""} ;
      T01EX2_A4366NumColor = new int[1] ;
      T01EX2_A4367TipColor = new byte[1] ;
      T01EX2_A5740TipProd = new String[] {""} ;
      T01EX2_A4369FecColAct = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX2_n4369FecColAct = new boolean[] {false} ;
      T01EX2_A4370PColActK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX2_n4370PColActK = new boolean[] {false} ;
      T01EX2_A4371PColActM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX2_n4371PColActM = new boolean[] {false} ;
      T01EX2_A4372PColActD = new String[] {""} ;
      T01EX2_n4372PColActD = new boolean[] {false} ;
      T01EX2_A4373FecColAnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01EX2_n4373FecColAnt = new boolean[] {false} ;
      T01EX2_A4374PColAntK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX2_n4374PColAntK = new boolean[] {false} ;
      T01EX2_A4375PColAntM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EX2_n4375PColAntM = new boolean[] {false} ;
      T01EX2_A5044PColBoni = new String[] {""} ;
      T01EX2_n5044PColBoni = new boolean[] {false} ;
      T01EX2_A396EmprCod = new String[] {""} ;
      T01EX2_A252CliCod = new int[1] ;
      T01EX2_A4364GrdTipArt = new short[1] ;
      T01EX16_A279CliNom = new String[] {""} ;
      T01EX17_A4368GrdTipDsc = new String[] {""} ;
      T01EX18_A396EmprCod = new String[] {""} ;
      T01EX18_A252CliCod = new int[1] ;
      T01EX18_A4364GrdTipArt = new short[1] ;
      T01EX18_A4365NomColor = new String[] {""} ;
      T01EX18_A4366NumColor = new int[1] ;
      T01EX18_A4367TipColor = new byte[1] ;
      T01EX18_A5740TipProd = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV13Forser = "" ;
      AV14ForNomCli = "" ;
      i4372PColActD = "" ;
      i5044PColBoni = "" ;
      i4369FecColAct = GXutil.nullDate() ;
      T01EX19_A407EmprNom = new String[] {""} ;
      T01EX19_n407EmprNom = new boolean[] {false} ;
      ZV17Nulo16 = "" ;
      ZV19TipDisDsc = "" ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new byte[1] ;
      ZZ396EmprCod = "" ;
      ZZ4365NomColor = "" ;
      ZZ5740TipProd = "" ;
      ZZ407EmprNom = "" ;
      ZZ4369FecColAct = GXutil.nullDate() ;
      ZZ4370PColActK = DecimalUtil.ZERO ;
      ZZ4371PColActM = DecimalUtil.ZERO ;
      ZZ4372PColActD = "" ;
      ZZ4373FecColAnt = GXutil.nullDate() ;
      ZZ4374PColAntK = DecimalUtil.ZERO ;
      ZZ4375PColAntM = DecimalUtil.ZERO ;
      ZZ5044PColBoni = "" ;
      ZZ279CliNom = "" ;
      ZZ4368GrdTipDsc = "" ;
      ZZV17Nulo16 = "" ;
      ZZV19TipDisDsc = "" ;
      ZO4371PColActM = DecimalUtil.ZERO ;
      ZO4370PColActK = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcolpre__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcolpre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcolpre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcolpre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcolpre__default(),
         new Object[] {
             new Object[] {
            T01EX2_A4365NomColor, T01EX2_A4366NumColor, T01EX2_A4367TipColor, T01EX2_A5740TipProd, T01EX2_A4369FecColAct, T01EX2_n4369FecColAct, T01EX2_A4370PColActK, T01EX2_n4370PColActK, T01EX2_A4371PColActM, T01EX2_n4371PColActM,
            T01EX2_A4372PColActD, T01EX2_n4372PColActD, T01EX2_A4373FecColAnt, T01EX2_n4373FecColAnt, T01EX2_A4374PColAntK, T01EX2_n4374PColAntK, T01EX2_A4375PColAntM, T01EX2_n4375PColAntM, T01EX2_A5044PColBoni, T01EX2_n5044PColBoni,
            T01EX2_A396EmprCod, T01EX2_A252CliCod, T01EX2_A4364GrdTipArt
            }
            , new Object[] {
            T01EX3_A4365NomColor, T01EX3_A4366NumColor, T01EX3_A4367TipColor, T01EX3_A5740TipProd, T01EX3_A4369FecColAct, T01EX3_n4369FecColAct, T01EX3_A4370PColActK, T01EX3_n4370PColActK, T01EX3_A4371PColActM, T01EX3_n4371PColActM,
            T01EX3_A4372PColActD, T01EX3_n4372PColActD, T01EX3_A4373FecColAnt, T01EX3_n4373FecColAnt, T01EX3_A4374PColAntK, T01EX3_n4374PColAntK, T01EX3_A4375PColAntM, T01EX3_n4375PColAntM, T01EX3_A5044PColBoni, T01EX3_n5044PColBoni,
            T01EX3_A396EmprCod, T01EX3_A252CliCod, T01EX3_A4364GrdTipArt
            }
            , new Object[] {
            T01EX4_A407EmprNom, T01EX4_n407EmprNom
            }
            , new Object[] {
            T01EX5_A279CliNom
            }
            , new Object[] {
            T01EX6_A4368GrdTipDsc
            }
            , new Object[] {
            T01EX7_A4365NomColor, T01EX7_A4366NumColor, T01EX7_A4367TipColor, T01EX7_A5740TipProd, T01EX7_A407EmprNom, T01EX7_n407EmprNom, T01EX7_A4368GrdTipDsc, T01EX7_A279CliNom, T01EX7_A4369FecColAct, T01EX7_n4369FecColAct,
            T01EX7_A4370PColActK, T01EX7_n4370PColActK, T01EX7_A4371PColActM, T01EX7_n4371PColActM, T01EX7_A4372PColActD, T01EX7_n4372PColActD, T01EX7_A4373FecColAnt, T01EX7_n4373FecColAnt, T01EX7_A4374PColAntK, T01EX7_n4374PColAntK,
            T01EX7_A4375PColAntM, T01EX7_n4375PColAntM, T01EX7_A5044PColBoni, T01EX7_n5044PColBoni, T01EX7_A396EmprCod, T01EX7_A252CliCod, T01EX7_A4364GrdTipArt
            }
            , new Object[] {
            T01EX8_A279CliNom
            }
            , new Object[] {
            T01EX9_A4368GrdTipDsc
            }
            , new Object[] {
            T01EX10_A396EmprCod, T01EX10_A252CliCod, T01EX10_A4364GrdTipArt, T01EX10_A4365NomColor, T01EX10_A4366NumColor, T01EX10_A4367TipColor, T01EX10_A5740TipProd
            }
            , new Object[] {
            T01EX11_A396EmprCod, T01EX11_A252CliCod, T01EX11_A4364GrdTipArt, T01EX11_A4365NomColor, T01EX11_A4366NumColor, T01EX11_A4367TipColor, T01EX11_A5740TipProd
            }
            , new Object[] {
            T01EX12_A396EmprCod, T01EX12_A252CliCod, T01EX12_A4364GrdTipArt, T01EX12_A4365NomColor, T01EX12_A4366NumColor, T01EX12_A4367TipColor, T01EX12_A5740TipProd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EX16_A279CliNom
            }
            , new Object[] {
            T01EX17_A4368GrdTipDsc
            }
            , new Object[] {
            T01EX18_A396EmprCod, T01EX18_A252CliCod, T01EX18_A4364GrdTipArt, T01EX18_A4365NomColor, T01EX18_A4366NumColor, T01EX18_A4367TipColor, T01EX18_A5740TipProd
            }
            , new Object[] {
            T01EX19_A407EmprNom, T01EX19_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV23Pgmname = "TCOLPRE" ;
      Gx_date = GXutil.today( ) ;
      Z5044PColBoni = httpContext.getMessage( "S", "") ;
      n5044PColBoni = false ;
      A5044PColBoni = httpContext.getMessage( "S", "") ;
      n5044PColBoni = false ;
      i5044PColBoni = httpContext.getMessage( "S", "") ;
      n5044PColBoni = false ;
      Z4372PColActD = httpContext.getMessage( "S", "") ;
      n4372PColActD = false ;
      A4372PColActD = httpContext.getMessage( "S", "") ;
      n4372PColActD = false ;
      i4372PColActD = httpContext.getMessage( "S", "") ;
      n4372PColActD = false ;
   }

   private byte Z4367TipColor ;
   private byte GxWebError ;
   private byte AV16OKColor ;
   private byte nKeyPressed ;
   private byte A4367TipColor ;
   private byte AV18InputFec ;
   private byte Gx_BScreen ;
   private byte AV20ExisTProd ;
   private byte gxajaxcallmode ;
   private byte ZV16OKColor ;
   private byte ZV20ExisTProd ;
   private byte GXv_int7[] ;
   private byte ZZ4367TipColor ;
   private byte ZZV16OKColor ;
   private byte ZZV20ExisTProd ;
   private short Z4364GrdTipArt ;
   private short A4364GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1559 ;
   private short nIsDirty_1559 ;
   private short ZZ4364GrdTipArt ;
   private int Z252CliCod ;
   private int Z4366NumColor ;
   private int A252CliCod ;
   private int A4366NumColor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtGrdTipArt_Enabled ;
   private int edtNomColor_Enabled ;
   private int edtNumColor_Enabled ;
   private int edtTipColor_Enabled ;
   private int edtTipProd_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtGrdTipDsc_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtFecColAct_Enabled ;
   private int edtPColActK_Enabled ;
   private int edtPColActM_Enabled ;
   private int edtPColActD_Enabled ;
   private int edtFecColAnt_Enabled ;
   private int edtPColAntK_Enabled ;
   private int edtPColAntM_Enabled ;
   private int edtPColBoni_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int AV15ForNumCli ;
   private int idxLst ;
   private int edtPColBoni_Backcolor ;
   private int edtPColAntM_Backcolor ;
   private int edtPColAntK_Backcolor ;
   private int edtFecColAnt_Backcolor ;
   private int edtPColActD_Backcolor ;
   private int edtPColActM_Backcolor ;
   private int edtPColActK_Backcolor ;
   private int edtFecColAct_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtGrdTipDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtTipProd_Backcolor ;
   private int edtTipColor_Backcolor ;
   private int edtNumColor_Backcolor ;
   private int edtNomColor_Backcolor ;
   private int edtGrdTipArt_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int ZZ252CliCod ;
   private int ZZ4366NumColor ;
   private java.math.BigDecimal Z4370PColActK ;
   private java.math.BigDecimal Z4371PColActM ;
   private java.math.BigDecimal Z4374PColAntK ;
   private java.math.BigDecimal Z4375PColAntM ;
   private java.math.BigDecimal O4371PColActM ;
   private java.math.BigDecimal O4370PColActK ;
   private java.math.BigDecimal A4370PColActK ;
   private java.math.BigDecimal A4371PColActM ;
   private java.math.BigDecimal A4374PColAntK ;
   private java.math.BigDecimal A4375PColAntM ;
   private java.math.BigDecimal ZZ4370PColActK ;
   private java.math.BigDecimal ZZ4371PColActM ;
   private java.math.BigDecimal ZZ4374PColAntK ;
   private java.math.BigDecimal ZZ4375PColAntM ;
   private java.math.BigDecimal ZO4371PColActM ;
   private java.math.BigDecimal ZO4370PColActK ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4365NomColor ;
   private String Z5740TipProd ;
   private String Z4372PColActD ;
   private String Z5044PColBoni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV17Nulo16 ;
   private String A4365NomColor ;
   private String A5740TipProd ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtGrdTipArt_Internalname ;
   private String edtGrdTipArt_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtNomColor_Internalname ;
   private String edtNomColor_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtNumColor_Internalname ;
   private String edtNumColor_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipColor_Internalname ;
   private String edtTipColor_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipProd_Internalname ;
   private String edtTipProd_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtGrdTipDsc_Internalname ;
   private String A4368GrdTipDsc ;
   private String edtGrdTipDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtFecColAct_Internalname ;
   private String edtFecColAct_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtPColActK_Internalname ;
   private String edtPColActK_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtPColActM_Internalname ;
   private String edtPColActM_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtPColActD_Internalname ;
   private String A4372PColActD ;
   private String edtPColActD_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtFecColAnt_Internalname ;
   private String edtFecColAnt_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtPColAntK_Internalname ;
   private String edtPColAntK_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtPColAntM_Internalname ;
   private String edtPColAntM_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtPColBoni_Internalname ;
   private String A5044PColBoni ;
   private String edtPColBoni_Jsonclick ;
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
   private String AV19TipDisDsc ;
   private String AV23Pgmname ;
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
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z4368GrdTipDsc ;
   private String sMode1559 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV13Forser ;
   private String AV14ForNomCli ;
   private String i4372PColActD ;
   private String i5044PColBoni ;
   private String ZV17Nulo16 ;
   private String ZV19TipDisDsc ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String ZZ396EmprCod ;
   private String ZZ4365NomColor ;
   private String ZZ5740TipProd ;
   private String ZZ407EmprNom ;
   private String ZZ4372PColActD ;
   private String ZZ5044PColBoni ;
   private String ZZ279CliNom ;
   private String ZZ4368GrdTipDsc ;
   private String ZZV17Nulo16 ;
   private String ZZV19TipDisDsc ;
   private java.util.Date Z4369FecColAct ;
   private java.util.Date Z4373FecColAnt ;
   private java.util.Date A4369FecColAct ;
   private java.util.Date A4373FecColAnt ;
   private java.util.Date Gx_date ;
   private java.util.Date i4369FecColAct ;
   private java.util.Date ZZ4369FecColAct ;
   private java.util.Date ZZ4373FecColAnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n4369FecColAct ;
   private boolean n4370PColActK ;
   private boolean n4371PColActM ;
   private boolean n4372PColActD ;
   private boolean n4373FecColAnt ;
   private boolean n4374PColAntK ;
   private boolean n4375PColAntM ;
   private boolean n5044PColBoni ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01EX4_A407EmprNom ;
   private boolean[] T01EX4_n407EmprNom ;
   private String[] T01EX7_A4365NomColor ;
   private int[] T01EX7_A4366NumColor ;
   private byte[] T01EX7_A4367TipColor ;
   private String[] T01EX7_A5740TipProd ;
   private String[] T01EX7_A407EmprNom ;
   private boolean[] T01EX7_n407EmprNom ;
   private String[] T01EX7_A4368GrdTipDsc ;
   private String[] T01EX7_A279CliNom ;
   private java.util.Date[] T01EX7_A4369FecColAct ;
   private boolean[] T01EX7_n4369FecColAct ;
   private java.math.BigDecimal[] T01EX7_A4370PColActK ;
   private boolean[] T01EX7_n4370PColActK ;
   private java.math.BigDecimal[] T01EX7_A4371PColActM ;
   private boolean[] T01EX7_n4371PColActM ;
   private String[] T01EX7_A4372PColActD ;
   private boolean[] T01EX7_n4372PColActD ;
   private java.util.Date[] T01EX7_A4373FecColAnt ;
   private boolean[] T01EX7_n4373FecColAnt ;
   private java.math.BigDecimal[] T01EX7_A4374PColAntK ;
   private boolean[] T01EX7_n4374PColAntK ;
   private java.math.BigDecimal[] T01EX7_A4375PColAntM ;
   private boolean[] T01EX7_n4375PColAntM ;
   private String[] T01EX7_A5044PColBoni ;
   private boolean[] T01EX7_n5044PColBoni ;
   private String[] T01EX7_A396EmprCod ;
   private int[] T01EX7_A252CliCod ;
   private short[] T01EX7_A4364GrdTipArt ;
   private String[] T01EX5_A279CliNom ;
   private String[] T01EX6_A4368GrdTipDsc ;
   private String[] T01EX8_A279CliNom ;
   private String[] T01EX9_A4368GrdTipDsc ;
   private String[] T01EX10_A396EmprCod ;
   private int[] T01EX10_A252CliCod ;
   private short[] T01EX10_A4364GrdTipArt ;
   private String[] T01EX10_A4365NomColor ;
   private int[] T01EX10_A4366NumColor ;
   private byte[] T01EX10_A4367TipColor ;
   private String[] T01EX10_A5740TipProd ;
   private String[] T01EX3_A4365NomColor ;
   private int[] T01EX3_A4366NumColor ;
   private byte[] T01EX3_A4367TipColor ;
   private String[] T01EX3_A5740TipProd ;
   private java.util.Date[] T01EX3_A4369FecColAct ;
   private boolean[] T01EX3_n4369FecColAct ;
   private java.math.BigDecimal[] T01EX3_A4370PColActK ;
   private boolean[] T01EX3_n4370PColActK ;
   private java.math.BigDecimal[] T01EX3_A4371PColActM ;
   private boolean[] T01EX3_n4371PColActM ;
   private String[] T01EX3_A4372PColActD ;
   private boolean[] T01EX3_n4372PColActD ;
   private java.util.Date[] T01EX3_A4373FecColAnt ;
   private boolean[] T01EX3_n4373FecColAnt ;
   private java.math.BigDecimal[] T01EX3_A4374PColAntK ;
   private boolean[] T01EX3_n4374PColAntK ;
   private java.math.BigDecimal[] T01EX3_A4375PColAntM ;
   private boolean[] T01EX3_n4375PColAntM ;
   private String[] T01EX3_A5044PColBoni ;
   private boolean[] T01EX3_n5044PColBoni ;
   private String[] T01EX3_A396EmprCod ;
   private int[] T01EX3_A252CliCod ;
   private short[] T01EX3_A4364GrdTipArt ;
   private String[] T01EX11_A396EmprCod ;
   private int[] T01EX11_A252CliCod ;
   private short[] T01EX11_A4364GrdTipArt ;
   private String[] T01EX11_A4365NomColor ;
   private int[] T01EX11_A4366NumColor ;
   private byte[] T01EX11_A4367TipColor ;
   private String[] T01EX11_A5740TipProd ;
   private String[] T01EX12_A396EmprCod ;
   private int[] T01EX12_A252CliCod ;
   private short[] T01EX12_A4364GrdTipArt ;
   private String[] T01EX12_A4365NomColor ;
   private int[] T01EX12_A4366NumColor ;
   private byte[] T01EX12_A4367TipColor ;
   private String[] T01EX12_A5740TipProd ;
   private String[] T01EX2_A4365NomColor ;
   private int[] T01EX2_A4366NumColor ;
   private byte[] T01EX2_A4367TipColor ;
   private String[] T01EX2_A5740TipProd ;
   private java.util.Date[] T01EX2_A4369FecColAct ;
   private boolean[] T01EX2_n4369FecColAct ;
   private java.math.BigDecimal[] T01EX2_A4370PColActK ;
   private boolean[] T01EX2_n4370PColActK ;
   private java.math.BigDecimal[] T01EX2_A4371PColActM ;
   private boolean[] T01EX2_n4371PColActM ;
   private String[] T01EX2_A4372PColActD ;
   private boolean[] T01EX2_n4372PColActD ;
   private java.util.Date[] T01EX2_A4373FecColAnt ;
   private boolean[] T01EX2_n4373FecColAnt ;
   private java.math.BigDecimal[] T01EX2_A4374PColAntK ;
   private boolean[] T01EX2_n4374PColAntK ;
   private java.math.BigDecimal[] T01EX2_A4375PColAntM ;
   private boolean[] T01EX2_n4375PColAntM ;
   private String[] T01EX2_A5044PColBoni ;
   private boolean[] T01EX2_n5044PColBoni ;
   private String[] T01EX2_A396EmprCod ;
   private int[] T01EX2_A252CliCod ;
   private short[] T01EX2_A4364GrdTipArt ;
   private String[] T01EX16_A279CliNom ;
   private String[] T01EX17_A4368GrdTipDsc ;
   private String[] T01EX18_A396EmprCod ;
   private int[] T01EX18_A252CliCod ;
   private short[] T01EX18_A4364GrdTipArt ;
   private String[] T01EX18_A4365NomColor ;
   private int[] T01EX18_A4366NumColor ;
   private byte[] T01EX18_A4367TipColor ;
   private String[] T01EX18_A5740TipProd ;
   private String[] T01EX19_A407EmprNom ;
   private boolean[] T01EX19_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcolpre__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolpre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolpre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolpre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcolpre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EX2", "SELECT NomColor, NumColor, TipColor, TipProd, FecColAct, PColActK, PColActM, PColActD, FecColAnt, PColAntK, PColAntM, PColBoni, EmprCod, CliCod, GrdTipArt FROM TXPCOLPRE WHERE EmprCod = ? AND CliCod = ? AND GrdTipArt = ? AND NomColor = ? AND NumColor = ? AND TipColor = ? AND TipProd = ?  FOR UPDATE OF FecColAct, PColActK, PColActM, PColActD, FecColAnt, PColAntK, PColAntM, PColBoni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX3", "SELECT NomColor, NumColor, TipColor, TipProd, FecColAct, PColActK, PColActM, PColActD, FecColAnt, PColAntK, PColAntM, PColBoni, EmprCod, CliCod, GrdTipArt FROM TXPCOLPRE WHERE EmprCod = ? AND CliCod = ? AND GrdTipArt = ? AND NomColor = ? AND NumColor = ? AND TipColor = ? AND TipProd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX6", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX7", "SELECT /*+ FIRST_ROWS(100) */ TM1.NomColor, TM1.NumColor, TM1.TipColor, TM1.TipProd, T2.EmprNom, T4.GrdTipDsc, T3.CliNom, TM1.FecColAct, TM1.PColActK, TM1.PColActM, TM1.PColActD, TM1.FecColAnt, TM1.PColAntK, TM1.PColAntM, TM1.PColBoni, TM1.EmprCod, TM1.CliCod, TM1.GrdTipArt FROM (((TXPCOLPRE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPGRDTIP T4 ON T4.EmprCod = TM1.EmprCod AND T4.GrdTipArt = TM1.GrdTipArt) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.GrdTipArt = ? and TM1.NomColor = ? and TM1.NumColor = ? and TM1.TipColor = ? and TM1.TipProd = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.GrdTipArt, TM1.NomColor, TM1.NumColor, TM1.TipColor, TM1.TipProd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX9", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE EmprCod = ? AND CliCod = ? AND GrdTipArt = ? AND NomColor = ? AND NumColor = ? AND TipColor = ? AND TipProd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE ( CliCod > ? or CliCod = ? and GrdTipArt > ? or GrdTipArt = ? and CliCod = ? and NomColor > ? or NomColor = ? and GrdTipArt = ? and CliCod = ? and NumColor > ? or NumColor = ? and NomColor = ? and GrdTipArt = ? and CliCod = ? and TipColor > ? or TipColor = ? and NumColor = ? and NomColor = ? and GrdTipArt = ? and CliCod = ? and TipProd > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EX12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE ( CliCod < ? or CliCod = ? and GrdTipArt < ? or GrdTipArt = ? and CliCod = ? and NomColor < ? or NomColor = ? and GrdTipArt = ? and CliCod = ? and NumColor < ? or NumColor = ? and NomColor = ? and GrdTipArt = ? and CliCod = ? and TipColor < ? or TipColor = ? and NumColor = ? and NomColor = ? and GrdTipArt = ? and CliCod = ? and TipProd < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, GrdTipArt DESC, NomColor DESC, NumColor DESC, TipColor DESC, TipProd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EX13", "INSERT INTO TXPCOLPRE(NomColor, NumColor, TipColor, TipProd, FecColAct, PColActK, PColActM, PColActD, FecColAnt, PColAntK, PColAntM, PColBoni, EmprCod, CliCod, GrdTipArt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCOLPRE")
         ,new UpdateCursor("T01EX14", "UPDATE TXPCOLPRE SET FecColAct=?, PColActK=?, PColActM=?, PColActD=?, FecColAnt=?, PColAntK=?, PColAntM=?, PColBoni=?  WHERE EmprCod = ? AND CliCod = ? AND GrdTipArt = ? AND NomColor = ? AND NumColor = ? AND TipColor = ? AND TipProd = ?", GX_NOMASK, "TXPCOLPRE")
         ,new UpdateCursor("T01EX15", "DELETE FROM TXPCOLPRE  WHERE EmprCod = ? AND CliCod = ? AND GrdTipArt = ? AND NomColor = ? AND NumColor = ? AND TipColor = ? AND TipProd = ?", GX_NOMASK, "TXPCOLPRE")
         ,new ForEachCursor("T01EX16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX17", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE EmprCod = ? ORDER BY EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EX19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((short[]) buf[22])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((short[]) buf[22])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 3);
               ((int[]) buf[25])[0] = rslt.getInt(17);
               ((short[]) buf[26])[0] = rslt.getShort(18);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 17 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 13);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 13);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 1);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 13);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 13);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 1);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 1);
               }
               stmt.setString(13, (String)parms[20], 3);
               stmt.setInt(14, ((Number) parms[21]).intValue());
               stmt.setShort(15, ((Number) parms[22]).shortValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
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
                  stmt.setString(8, (String)parms[15], 1);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               stmt.setString(12, (String)parms[19], 13);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setByte(14, ((Number) parms[21]).byteValue());
               stmt.setString(15, (String)parms[22], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

