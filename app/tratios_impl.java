package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tratios_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
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
         gxload_13( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4228RatTipArt = (short)(GXutil.lval( httpContext.GetPar( "RatTipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
         A4229RatSec = httpContext.GetPar( "RatSec") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
         A4230RatAny = (short)(GXutil.lval( httpContext.GetPar( "RatAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A252CliCod, A4228RatTipArt, A4229RatSec, A4230RatAny) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MTO. RATIOS (H.S.Segura)", ""), (short)(0)) ;
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_90 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_90"))) ;
      nGXsfl_90_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_90_idx"))) ;
      sGXsfl_90_idx = httpContext.GetPar( "sGXsfl_90_idx") ;
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

   public tratios_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tratios_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tratios_impl.class ));
   }

   public tratios_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRATIOS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Tipo Articulo en Ratios HSS", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4228RatTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4228RatTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4228RatTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtRatTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Seccion en Ratios (HSS)", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatSec_Internalname, GXutil.rtrim( A4229RatSec), GXutil.rtrim( localUtil.format( A4229RatSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatSec_Jsonclick, 0, "", "", "", "", "", 1, edtRatSec_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Año en Ratios (HSS)", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatAny_Internalname, GXutil.ltrim( localUtil.ntoc( A4230RatAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4230RatAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4230RatAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatAny_Jsonclick, 0, "", "", "", "", "", 1, edtRatAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion T.Art.Ratios (HSS)", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatTipDsc_Internalname, GXutil.rtrim( A4231RatTipDsc), GXutil.rtrim( localUtil.format( A4231RatTipDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatTipDsc_Jsonclick, 0, "", "", "", "", "", 1, edtRatTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Total Kg.Tint.Año Ratios (HSS)", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatKgmTinA_Internalname, GXutil.ltrim( localUtil.ntoc( A4232RatKgmTinA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatKgmTinA_Enabled!=0) ? localUtil.format( A4232RatKgmTinA, "ZZZZZZZ.ZZ") : localUtil.format( A4232RatKgmTinA, "ZZZZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatKgmTinA_Jsonclick, 0, "", "", "", "", "", 1, edtRatKgmTinA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Total Kg.Fact.Año Ratios (HSS)", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatKgmFacA_Internalname, GXutil.ltrim( localUtil.ntoc( A4233RatKgmFacA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatKgmFacA_Enabled!=0) ? localUtil.format( A4233RatKgmFacA, "ZZZZZZZ.ZZ") : localUtil.format( A4233RatKgmFacA, "ZZZZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatKgmFacA_Jsonclick, 0, "", "", "", "", "", 1, edtRatKgmFacA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Total Coste Tin.Año Ratios HSS", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatCosTinA_Internalname, GXutil.ltrim( localUtil.ntoc( A4234RatCosTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatCosTinA_Enabled!=0) ? localUtil.format( A4234RatCosTinA, "ZZZZZZZZZZ.ZZ") : localUtil.format( A4234RatCosTinA, "ZZZZZZZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatCosTinA_Jsonclick, 0, "", "", "", "", "", 1, edtRatCosTinA_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Total Imp.Fact.Año Ratios HSS", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatImpTinA_Internalname, GXutil.ltrim( localUtil.ntoc( A4235RatImpTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatImpTinA_Enabled!=0) ? localUtil.format( A4235RatImpTinA, "ZZZZZZZZZZ.ZZ") : localUtil.format( A4235RatImpTinA, "ZZZZZZZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatImpTinA_Jsonclick, 0, "", "", "", "", "", 1, edtRatImpTinA_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ratio Anual Tint.(Cos/KgT) HSS", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatAnuTinA_Internalname, GXutil.ltrim( localUtil.ntoc( A4236RatAnuTinA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatAnuTinA_Enabled!=0) ? localUtil.format( A4236RatAnuTinA, "ZZZZ.ZZ") : localUtil.format( A4236RatAnuTinA, "ZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatAnuTinA_Jsonclick, 0, "", "", "", "", "", 1, edtRatAnuTinA_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Ratio Anual Fact.(Imp/KgF) HSS", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRatAnuFacA_Internalname, GXutil.ltrim( localUtil.ntoc( A4237RatAnuFacA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRatAnuFacA_Enabled!=0) ? localUtil.format( A4237RatAnuFacA, "ZZZZ.ZZ") : localUtil.format( A4237RatAnuFacA, "ZZZZ.ZZ"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRatAnuFacA_Jsonclick, 0, "", "", "", "", "", 1, edtRatAnuFacA_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRATIOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol90( ) ;
      nGXsfl_90_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1619 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1619 = (short)(1) ;
            scanStart1GO1619( ) ;
            while ( RcdFound1619 != 0 )
            {
               init_level_properties1619( ) ;
               getByPrimaryKey1GO1619( ) ;
               addRow1GO1619( ) ;
               scanNext1GO1619( ) ;
            }
            scanEnd1GO1619( ) ;
            nBlankRcdCount1619 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4235RatImpTinA = A4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         B4234RatCosTinA = A4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         B4233RatKgmFacA = A4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         B4232RatKgmTinA = A4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         standaloneNotModal1GO1619( ) ;
         standaloneModal1GO1619( ) ;
         sMode1619 = Gx_mode ;
         while ( nGXsfl_90_idx < nRC_GXsfl_90 )
         {
            bGXsfl_90_Refreshing = true ;
            readRow1GO1619( ) ;
            edtavnRcdDeleted_1619_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1619_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1619_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1619_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMES_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMes_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatKgmTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATKGMTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatKgmTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatKgmFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATKGMFAC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatKgmFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmFac_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatCosTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATCOSTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatCosTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatCosTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatImpTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATIMPTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatImpTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatImpTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatMesTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMESTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatMesTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMesTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            edtRatMesFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMESFAC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRatMesFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMesFac_Enabled), 5, 0), !bGXsfl_90_Refreshing);
            if ( ( nRcdExists_1619 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1GO1619( ) ;
            }
            sendRow1GO1619( ) ;
            bGXsfl_90_Refreshing = false ;
         }
         Gx_mode = sMode1619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4235RatImpTinA = B4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         A4234RatCosTinA = B4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4233RatKgmFacA = B4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4232RatKgmTinA = B4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1619 = (short)(5) ;
         nRcdExists_1619 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1GO1619( ) ;
            while ( RcdFound1619 != 0 )
            {
               sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_901619( ) ;
               init_level_properties1619( ) ;
               standaloneNotModal1GO1619( ) ;
               getByPrimaryKey1GO1619( ) ;
               standaloneModal1GO1619( ) ;
               addRow1GO1619( ) ;
               scanNext1GO1619( ) ;
            }
            scanEnd1GO1619( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1619 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_901619( ) ;
      initAll1GO1619( ) ;
      init_level_properties1619( ) ;
      B4235RatImpTinA = A4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      B4234RatCosTinA = A4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      B4233RatKgmFacA = A4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      B4232RatKgmTinA = A4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      nRcdExists_1619 = (short)(0) ;
      nIsMod_1619 = (short)(0) ;
      nRcdDeleted_1619 = (short)(0) ;
      nBlankRcdCount1619 = (short)(nBlankRcdUsr1619+nBlankRcdCount1619) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1619 > 0 )
      {
         standaloneNotModal1GO1619( ) ;
         standaloneModal1GO1619( ) ;
         addRow1GO1619( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRatMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1619 = (short)(nBlankRcdCount1619-1) ;
      }
      Gx_mode = sMode1619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4235RatImpTinA = B4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      A4234RatCosTinA = B4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      A4233RatKgmFacA = B4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      A4232RatKgmTinA = B4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRATIOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRATIOS.htm");
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
      e111GO2 ();
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
            Z4228RatTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4228RatTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4229RatSec = httpContext.cgiGet( "Z4229RatSec") ;
            Z4230RatAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z4230RatAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4231RatTipDsc = httpContext.cgiGet( "Z4231RatTipDsc") ;
            O4235RatImpTinA = localUtil.ctond( httpContext.cgiGet( "O4235RatImpTinA")) ;
            O4234RatCosTinA = localUtil.ctond( httpContext.cgiGet( "O4234RatCosTinA")) ;
            O4233RatKgmFacA = localUtil.ctond( httpContext.cgiGet( "O4233RatKgmFacA")) ;
            O4232RatKgmTinA = localUtil.ctond( httpContext.cgiGet( "O4232RatKgmTinA")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_90 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_90"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRatTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRatTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RATTIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRatTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4228RatTipArt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
            }
            else
            {
               A4228RatTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtRatTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
            }
            A4229RatSec = httpContext.cgiGet( edtRatSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRatAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRatAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RATANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRatAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4230RatAny = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
            }
            else
            {
               A4230RatAny = (short)(localUtil.ctol( httpContext.cgiGet( edtRatAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
            }
            A4231RatTipDsc = httpContext.cgiGet( edtRatTipDsc_Internalname) ;
            n4231RatTipDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4231RatTipDsc", A4231RatTipDsc);
            A4232RatKgmTinA = localUtil.ctond( httpContext.cgiGet( edtRatKgmTinA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            A4233RatKgmFacA = localUtil.ctond( httpContext.cgiGet( edtRatKgmFacA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            A4234RatCosTinA = localUtil.ctond( httpContext.cgiGet( edtRatCosTinA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            A4235RatImpTinA = localUtil.ctond( httpContext.cgiGet( edtRatImpTinA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
            A4236RatAnuTinA = localUtil.ctond( httpContext.cgiGet( edtRatAnuTinA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
            A4237RatAnuFacA = localUtil.ctond( httpContext.cgiGet( edtRatAnuFacA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4228RatTipArt = (short)(GXutil.lval( httpContext.GetPar( "RatTipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
               A4229RatSec = httpContext.GetPar( "RatSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
               A4230RatAny = (short)(GXutil.lval( httpContext.GetPar( "RatAny"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
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
                        e111GO2 ();
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
            initAll1GO1618( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1619_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1619_Enabled), 5, 0), !bGXsfl_90_Refreshing);
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
      disableAttributes1GO1618( ) ;
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

   public void confirm_1GO0( )
   {
      beforeValidate1GO1618( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1GO1618( ) ;
         }
         else
         {
            checkExtendedTable1GO1618( ) ;
            if ( AnyError == 0 )
            {
               zm1GO1618( 12) ;
               zm1GO1618( 13) ;
               zm1GO1618( 14) ;
            }
            closeExtendedTableCursors1GO1618( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1618 = Gx_mode ;
         confirm_1GO1619( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1618 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1618 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1GO0( ) ;
      }
   }

   public void confirm_1GO1619( )
   {
      s4235RatImpTinA = O4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      s4234RatCosTinA = O4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      s4233RatKgmFacA = O4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      s4232RatKgmTinA = O4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      s4237RatAnuFacA = O4237RatAnuFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      s4236RatAnuTinA = O4236RatAnuTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1GO1619( ) ;
         if ( ( nRcdExists_1619 != 0 ) || ( nIsMod_1619 != 0 ) )
         {
            getKey1GO1619( ) ;
            if ( ( nRcdExists_1619 == 0 ) && ( nRcdDeleted_1619 == 0 ) )
            {
               if ( RcdFound1619 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1GO1619( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1GO1619( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1GO1619( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4235RatImpTinA = A4235RatImpTinA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
                     O4234RatCosTinA = A4234RatCosTinA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
                     O4233RatKgmFacA = A4233RatKgmFacA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
                     O4232RatKgmTinA = A4232RatKgmTinA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
                     O4237RatAnuFacA = A4237RatAnuFacA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
                     O4236RatAnuTinA = A4236RatAnuTinA ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
                  }
               }
               else
               {
                  GXCCtl = "RATMES_" + sGXsfl_90_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRatMes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1619 != 0 )
               {
                  if ( nRcdDeleted_1619 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1GO1619( ) ;
                     load1GO1619( ) ;
                     beforeValidate1GO1619( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1GO1619( ) ;
                        O4235RatImpTinA = A4235RatImpTinA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
                        O4234RatCosTinA = A4234RatCosTinA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
                        O4233RatKgmFacA = A4233RatKgmFacA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
                        O4232RatKgmTinA = A4232RatKgmTinA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
                        O4237RatAnuFacA = A4237RatAnuFacA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
                        O4236RatAnuTinA = A4236RatAnuTinA ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1619 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1GO1619( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1GO1619( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1GO1619( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4235RatImpTinA = A4235RatImpTinA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
                           O4234RatCosTinA = A4234RatCosTinA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
                           O4233RatKgmFacA = A4233RatKgmFacA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
                           O4232RatKgmTinA = A4232RatKgmTinA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
                           O4237RatAnuFacA = A4237RatAnuFacA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
                           O4236RatAnuTinA = A4236RatAnuTinA ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1619 == 0 )
                  {
                     GXCCtl = "RATMES_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRatMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1619_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMes_Internalname, GXutil.ltrim( localUtil.ntoc( A4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatKgmTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatKgmFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatCosTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatImpTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMesTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4243RatMesTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMesFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4244RatMesFac, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4238RatMes_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4239RatKgmTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4240RatKgmFac_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4241RatCosTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4242RatImpTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4242RatImpTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4241RatCosTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4240RatKgmFac_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4239RatKgmTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1619 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1619_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1619_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMES_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATKGMTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATKGMFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATCOSTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatCosTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATIMPTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatImpTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMESTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMESFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4235RatImpTinA = s4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      O4234RatCosTinA = s4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      O4233RatKgmFacA = s4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      O4232RatKgmTinA = s4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      O4237RatAnuFacA = s4237RatAnuFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      O4236RatAnuTinA = s4236RatAnuTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1GO0( )
   {
   }

   public void e111GO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV16EmprNom ;
      GXv_char3[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      tratios_impl.this.A396EmprCod = GXv_char1[0] ;
      tratios_impl.this.AV16EmprNom = GXv_char2[0] ;
      tratios_impl.this.AV17UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char4 = AV20LitFe ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
      tratios_impl.this.GXt_char4 = GXv_char3[0] ;
      AV20LitFe = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      GXt_char4 = AV19Lit0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char3) ;
      tratios_impl.this.GXt_char4 = GXv_char3[0] ;
      AV19Lit0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char4 = AV21lit1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
      tratios_impl.this.GXt_char4 = GXv_char3[0] ;
      AV21lit1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21lit1", AV21lit1);
      AV22lit2 = httpContext.getMessage( "Año", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22lit2", AV22lit2);
      GXt_char4 = AV23lit3 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char3) ;
      tratios_impl.this.GXt_char4 = GXv_char3[0] ;
      AV23lit3 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23lit3", AV23lit3);
      AV24lit4 = httpContext.getMessage( "Kilos Fabricados", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24lit4", AV24lit4);
      AV25lit5 = httpContext.getMessage( "Kilos Facturados", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25lit5", AV25lit5);
      AV26lit6 = httpContext.getMessage( "Coste Fabricacion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26lit6", AV26lit6);
      AV27lit7 = httpContext.getMessage( "Importe Facturacion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27lit7", AV27lit7);
      AV28lit8 = httpContext.getMessage( "Ratios Fabricacion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28lit8", AV28lit8);
      AV29lit9 = httpContext.getMessage( "Ratios Facturacion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29lit9", AV29lit9);
      AV30lit10 = httpContext.getMessage( "Seccion", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30lit10", AV30lit10);
      AV31lit32 = httpContext.getMessage( "MANTENIMIENTO DE RATIOS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31lit32", AV31lit32);
   }

   public void zm1GO1618( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4231RatTipDsc = T01GO5_A4231RatTipDsc[0] ;
         }
         else
         {
            Z4231RatTipDsc = A4231RatTipDsc ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z4228RatTipArt = A4228RatTipArt ;
         Z4229RatSec = A4229RatSec ;
         Z4230RatAny = A4230RatAny ;
         Z4231RatTipDsc = A4231RatTipDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z4232RatKgmTinA = A4232RatKgmTinA ;
         Z4233RatKgmFacA = A4233RatKgmFacA ;
         Z4234RatCosTinA = A4234RatCosTinA ;
         Z4235RatImpTinA = A4235RatImpTinA ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01GO6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01GO6_A407EmprNom[0] ;
      n407EmprNom = T01GO6_n407EmprNom[0] ;
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

   public void load1GO1618( )
   {
      /* Using cursor T01GO11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1618 = (short)(1) ;
         A4231RatTipDsc = T01GO11_A4231RatTipDsc[0] ;
         n4231RatTipDsc = T01GO11_n4231RatTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4231RatTipDsc", A4231RatTipDsc);
         A407EmprNom = T01GO11_A407EmprNom[0] ;
         n407EmprNom = T01GO11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01GO11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4232RatKgmTinA = T01GO11_A4232RatKgmTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = T01GO11_A4233RatKgmFacA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = T01GO11_A4234RatCosTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = T01GO11_A4235RatImpTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         zm1GO1618( -11) ;
      }
      pr_default.close(7);
      onLoadActions1GO1618( ) ;
   }

   public void onLoadActions1GO1618( )
   {
      O4235RatImpTinA = A4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      O4234RatCosTinA = A4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      O4233RatKgmFacA = A4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      O4232RatKgmTinA = A4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
      {
         A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      else
      {
         A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
      {
         A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
      else
      {
         A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
   }

   public void checkExtendedTable1GO1618( )
   {
      nIsDirty_1618 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01GO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01GO7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01GO9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A4232RatKgmTinA = T01GO9_A4232RatKgmTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = T01GO9_A4233RatKgmFacA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = T01GO9_A4234RatCosTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = T01GO9_A4235RatImpTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      else
      {
         nIsDirty_1618 = (short)(1) ;
         A4232RatKgmTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         nIsDirty_1618 = (short)(1) ;
         A4233RatKgmFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         nIsDirty_1618 = (short)(1) ;
         A4234RatCosTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         nIsDirty_1618 = (short)(1) ;
         A4235RatImpTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      pr_default.close(6);
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
      {
         nIsDirty_1618 = (short)(1) ;
         A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      else
      {
         nIsDirty_1618 = (short)(1) ;
         A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
      {
         nIsDirty_1618 = (short)(1) ;
         A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
      else
      {
         nIsDirty_1618 = (short)(1) ;
         A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
   }

   public void closeExtendedTableCursors1GO1618( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01GO12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01GO12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_14( String A396EmprCod ,
                          int A252CliCod ,
                          short A4228RatTipArt ,
                          String A4229RatSec ,
                          short A4230RatAny )
   {
      /* Using cursor T01GO14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A4232RatKgmTinA = T01GO14_A4232RatKgmTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = T01GO14_A4233RatKgmFacA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = T01GO14_A4234RatCosTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = T01GO14_A4235RatImpTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      else
      {
         A4232RatKgmTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4232RatKgmTinA, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4233RatKgmFacA, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4234RatCosTinA, (byte)(13), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4235RatImpTinA, (byte)(13), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1GO1618( )
   {
      /* Using cursor T01GO15 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1618 = (short)(1) ;
      }
      else
      {
         RcdFound1618 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01GO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01GO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1GO1618( 11) ;
         RcdFound1618 = (short)(1) ;
         A4228RatTipArt = T01GO5_A4228RatTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
         A4229RatSec = T01GO5_A4229RatSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
         A4230RatAny = T01GO5_A4230RatAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
         A4231RatTipDsc = T01GO5_A4231RatTipDsc[0] ;
         n4231RatTipDsc = T01GO5_n4231RatTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4231RatTipDsc", A4231RatTipDsc);
         A252CliCod = T01GO5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z4228RatTipArt = A4228RatTipArt ;
         Z4229RatSec = A4229RatSec ;
         Z4230RatAny = A4230RatAny ;
         sMode1618 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1GO1618( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1618 = (short)(0) ;
            initializeNonKey1GO1618( ) ;
         }
         Gx_mode = sMode1618 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1618 = (short)(0) ;
         initializeNonKey1GO1618( ) ;
         sMode1618 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1618 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1GO1618( ) ;
      if ( RcdFound1618 == 0 )
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
      RcdFound1618 = (short)(0) ;
      /* Using cursor T01GO16 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), Short.valueOf(A4228RatTipArt), Integer.valueOf(A252CliCod), A4229RatSec, A4229RatSec, Short.valueOf(A4228RatTipArt), Integer.valueOf(A252CliCod), Short.valueOf(A4230RatAny), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01GO16_A252CliCod[0] < A252CliCod ) || ( T01GO16_A252CliCod[0] == A252CliCod ) && ( T01GO16_A4228RatTipArt[0] < A4228RatTipArt ) || ( T01GO16_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01GO16_A4229RatSec[0], A4229RatSec) < 0 ) || ( GXutil.strcmp(T01GO16_A4229RatSec[0], A4229RatSec) == 0 ) && ( T01GO16_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO16_A252CliCod[0] == A252CliCod ) && ( T01GO16_A4230RatAny[0] < A4230RatAny ) ) && ( GXutil.strcmp(T01GO16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01GO16_A252CliCod[0] > A252CliCod ) || ( T01GO16_A252CliCod[0] == A252CliCod ) && ( T01GO16_A4228RatTipArt[0] > A4228RatTipArt ) || ( T01GO16_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO16_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01GO16_A4229RatSec[0], A4229RatSec) > 0 ) || ( GXutil.strcmp(T01GO16_A4229RatSec[0], A4229RatSec) == 0 ) && ( T01GO16_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO16_A252CliCod[0] == A252CliCod ) && ( T01GO16_A4230RatAny[0] > A4230RatAny ) ) && ( GXutil.strcmp(T01GO16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01GO16_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4228RatTipArt = T01GO16_A4228RatTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
            A4229RatSec = T01GO16_A4229RatSec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
            A4230RatAny = T01GO16_A4230RatAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
            RcdFound1618 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1618 = (short)(0) ;
      /* Using cursor T01GO17 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), Short.valueOf(A4228RatTipArt), Integer.valueOf(A252CliCod), A4229RatSec, A4229RatSec, Short.valueOf(A4228RatTipArt), Integer.valueOf(A252CliCod), Short.valueOf(A4230RatAny), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01GO17_A252CliCod[0] > A252CliCod ) || ( T01GO17_A252CliCod[0] == A252CliCod ) && ( T01GO17_A4228RatTipArt[0] > A4228RatTipArt ) || ( T01GO17_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01GO17_A4229RatSec[0], A4229RatSec) > 0 ) || ( GXutil.strcmp(T01GO17_A4229RatSec[0], A4229RatSec) == 0 ) && ( T01GO17_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO17_A252CliCod[0] == A252CliCod ) && ( T01GO17_A4230RatAny[0] > A4230RatAny ) ) && ( GXutil.strcmp(T01GO17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01GO17_A252CliCod[0] < A252CliCod ) || ( T01GO17_A252CliCod[0] == A252CliCod ) && ( T01GO17_A4228RatTipArt[0] < A4228RatTipArt ) || ( T01GO17_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01GO17_A4229RatSec[0], A4229RatSec) < 0 ) || ( GXutil.strcmp(T01GO17_A4229RatSec[0], A4229RatSec) == 0 ) && ( T01GO17_A4228RatTipArt[0] == A4228RatTipArt ) && ( T01GO17_A252CliCod[0] == A252CliCod ) && ( T01GO17_A4230RatAny[0] < A4230RatAny ) ) && ( GXutil.strcmp(T01GO17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01GO17_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4228RatTipArt = T01GO17_A4228RatTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
            A4229RatSec = T01GO17_A4229RatSec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
            A4230RatAny = T01GO17_A4230RatAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
            RcdFound1618 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1GO1618( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4235RatImpTinA = O4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         A4234RatCosTinA = O4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4233RatKgmFacA = O4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4232RatKgmTinA = O4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4237RatAnuFacA = O4237RatAnuFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         A4236RatAnuTinA = O4236RatAnuTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1GO1618( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1618 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4228RatTipArt != Z4228RatTipArt ) || ( GXutil.strcmp(A4229RatSec, Z4229RatSec) != 0 ) || ( A4230RatAny != Z4230RatAny ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A4228RatTipArt = Z4228RatTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
               A4229RatSec = Z4229RatSec ;
               httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
               A4230RatAny = Z4230RatAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4235RatImpTinA = O4235RatImpTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
               A4234RatCosTinA = O4234RatCosTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
               A4233RatKgmFacA = O4233RatKgmFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
               A4232RatKgmTinA = O4232RatKgmTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
               A4237RatAnuFacA = O4237RatAnuFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
               A4236RatAnuTinA = O4236RatAnuTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
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
               A4235RatImpTinA = O4235RatImpTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
               A4234RatCosTinA = O4234RatCosTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
               A4233RatKgmFacA = O4233RatKgmFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
               A4232RatKgmTinA = O4232RatKgmTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
               A4237RatAnuFacA = O4237RatAnuFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
               A4236RatAnuTinA = O4236RatAnuTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
               update1GO1618( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4228RatTipArt != Z4228RatTipArt ) || ( GXutil.strcmp(A4229RatSec, Z4229RatSec) != 0 ) || ( A4230RatAny != Z4230RatAny ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4235RatImpTinA = O4235RatImpTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
               A4234RatCosTinA = O4234RatCosTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
               A4233RatKgmFacA = O4233RatKgmFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
               A4232RatKgmTinA = O4232RatKgmTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
               A4237RatAnuFacA = O4237RatAnuFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
               A4236RatAnuTinA = O4236RatAnuTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1GO1618( ) ;
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
                  A4235RatImpTinA = O4235RatImpTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
                  A4234RatCosTinA = O4234RatCosTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
                  A4233RatKgmFacA = O4233RatKgmFacA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
                  A4232RatKgmTinA = O4232RatKgmTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
                  A4237RatAnuFacA = O4237RatAnuFacA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
                  A4236RatAnuTinA = O4236RatAnuTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1GO1618( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4228RatTipArt != Z4228RatTipArt ) || ( GXutil.strcmp(A4229RatSec, Z4229RatSec) != 0 ) || ( A4230RatAny != Z4230RatAny ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4228RatTipArt = Z4228RatTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
         A4229RatSec = Z4229RatSec ;
         httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
         A4230RatAny = Z4230RatAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4235RatImpTinA = O4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         A4234RatCosTinA = O4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4233RatKgmFacA = O4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4232RatKgmTinA = O4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4237RatAnuFacA = O4237RatAnuFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         A4236RatAnuTinA = O4236RatAnuTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
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
      getKey1GO1618( ) ;
      if ( RcdFound1618 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4228RatTipArt != Z4228RatTipArt ) || ( GXutil.strcmp(A4229RatSec, Z4229RatSec) != 0 ) || ( A4230RatAny != Z4230RatAny ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A4228RatTipArt = Z4228RatTipArt ;
            httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
            A4229RatSec = Z4229RatSec ;
            httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
            A4230RatAny = Z4230RatAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( A4228RatTipArt != Z4228RatTipArt ) || ( GXutil.strcmp(A4229RatSec, Z4229RatSec) != 0 ) || ( A4230RatAny != Z4230RatAny ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tratios");
      GX_FocusControl = edtRatTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1GO0( ) ;
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
      if ( RcdFound1618 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRatTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1GO1618( ) ;
      if ( RcdFound1618 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRatTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GO1618( ) ;
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
      if ( RcdFound1618 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRatTipDsc_Internalname ;
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
      if ( RcdFound1618 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRatTipDsc_Internalname ;
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
      scanStart1GO1618( ) ;
      if ( RcdFound1618 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1618 != 0 )
         {
            scanNext1GO1618( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRatTipDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1GO1618( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1GO1618( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRATIO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4231RatTipDsc, T01GO4_A4231RatTipDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4231RatTipDsc, T01GO4_A4231RatTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("tratios:[seudo value changed for attri]"+"RatTipDsc");
               GXutil.writeLogRaw("Old: ",Z4231RatTipDsc);
               GXutil.writeLogRaw("Current: ",T01GO4_A4231RatTipDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRATIO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GO1618( )
   {
      beforeValidate1GO1618( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GO1618( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GO1618( 0) ;
         checkOptimisticConcurrency1GO1618( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GO1618( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GO1618( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GO18 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Boolean.valueOf(n4231RatTipDsc), A4231RatTipDsc, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRATIO");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1GO1618( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1GO0( ) ;
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
            load1GO1618( ) ;
         }
         endLevel1GO1618( ) ;
      }
      closeExtendedTableCursors1GO1618( ) ;
   }

   public void update1GO1618( )
   {
      beforeValidate1GO1618( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GO1618( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GO1618( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GO1618( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1GO1618( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GO19 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n4231RatTipDsc), A4231RatTipDsc, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRATIO");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRATIO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1GO1618( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1GO1618( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1GO0( ) ;
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
         endLevel1GO1618( ) ;
      }
      closeExtendedTableCursors1GO1618( ) ;
   }

   public void deferredUpdate1GO1618( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GO1618( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GO1618( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GO1618( ) ;
         afterConfirm1GO1618( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GO1618( ) ;
            if ( AnyError == 0 )
            {
               A4235RatImpTinA = O4235RatImpTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
               A4234RatCosTinA = O4234RatCosTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
               A4233RatKgmFacA = O4233RatKgmFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
               A4232RatKgmTinA = O4232RatKgmTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
               A4237RatAnuFacA = O4237RatAnuFacA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
               A4236RatAnuTinA = O4236RatAnuTinA ;
               httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
               scanStart1GO1619( ) ;
               while ( RcdFound1619 != 0 )
               {
                  getByPrimaryKey1GO1619( ) ;
                  delete1GO1619( ) ;
                  scanNext1GO1619( ) ;
                  O4235RatImpTinA = A4235RatImpTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
                  O4234RatCosTinA = A4234RatCosTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
                  O4233RatKgmFacA = A4233RatKgmFacA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
                  O4232RatKgmTinA = A4232RatKgmTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
                  O4237RatAnuFacA = A4237RatAnuFacA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
                  O4236RatAnuTinA = A4236RatAnuTinA ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
               }
               scanEnd1GO1619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GO20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRATIO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1618 == 0 )
                        {
                           initAll1GO1618( ) ;
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
                        resetCaption1GO0( ) ;
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
      sMode1618 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GO1618( ) ;
      Gx_mode = sMode1618 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GO1618( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01GO21 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01GO21_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01GO23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A4232RatKgmTinA = T01GO23_A4232RatKgmTinA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            A4233RatKgmFacA = T01GO23_A4233RatKgmFacA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            A4234RatCosTinA = T01GO23_A4234RatCosTinA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            A4235RatImpTinA = T01GO23_A4235RatImpTinA[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         }
         else
         {
            A4232RatKgmTinA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            A4233RatKgmFacA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            A4234RatCosTinA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            A4235RatImpTinA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         }
         pr_default.close(17);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
         {
            A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         }
         else
         {
            A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
         {
            A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         }
         else
         {
            A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         }
      }
   }

   public void processNestedLevel1GO1619( )
   {
      s4235RatImpTinA = O4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      s4234RatCosTinA = O4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      s4233RatKgmFacA = O4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      s4232RatKgmTinA = O4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      s4237RatAnuFacA = O4237RatAnuFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      s4236RatAnuTinA = O4236RatAnuTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      nGXsfl_90_idx = 0 ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         readRow1GO1619( ) ;
         if ( ( nRcdExists_1619 != 0 ) || ( nIsMod_1619 != 0 ) )
         {
            standaloneNotModal1GO1619( ) ;
            getKey1GO1619( ) ;
            if ( ( nRcdExists_1619 == 0 ) && ( nRcdDeleted_1619 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1GO1619( ) ;
            }
            else
            {
               if ( RcdFound1619 != 0 )
               {
                  if ( ( nRcdDeleted_1619 != 0 ) && ( nRcdExists_1619 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1GO1619( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1619 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1GO1619( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1619 == 0 )
                  {
                     GXCCtl = "RATMES_" + sGXsfl_90_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRatMes_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4235RatImpTinA = A4235RatImpTinA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
            O4234RatCosTinA = A4234RatCosTinA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            O4233RatKgmFacA = A4233RatKgmFacA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            O4232RatKgmTinA = A4232RatKgmTinA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            O4237RatAnuFacA = A4237RatAnuFacA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
            O4236RatAnuTinA = A4236RatAnuTinA ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1619_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMes_Internalname, GXutil.ltrim( localUtil.ntoc( A4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatKgmTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatKgmFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatCosTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatImpTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMesTin_Internalname, GXutil.ltrim( localUtil.ntoc( A4243RatMesTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRatMesFac_Internalname, GXutil.ltrim( localUtil.ntoc( A4244RatMesFac, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4238RatMes_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4239RatKgmTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4240RatKgmFac_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4241RatCosTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4242RatImpTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( Z4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4242RatImpTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4241RatCosTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4240RatKgmFac_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T4239RatKgmTin_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( O4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1619_"+sGXsfl_90_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1619 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1619_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1619_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMES_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATKGMTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATKGMFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATCOSTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatCosTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATIMPTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatImpTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMESTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RATMESFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1GO1619( ) ;
      if ( AnyError != 0 )
      {
         O4235RatImpTinA = s4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         O4234RatCosTinA = s4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         O4233RatKgmFacA = s4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         O4232RatKgmTinA = s4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         O4237RatAnuFacA = s4237RatAnuFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         O4236RatAnuTinA = s4236RatAnuTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      nRcdExists_1619 = (short)(0) ;
      nIsMod_1619 = (short)(0) ;
      nRcdDeleted_1619 = (short)(0) ;
   }

   public void processLevel1GO1618( )
   {
      /* Save parent mode. */
      sMode1618 = Gx_mode ;
      processNestedLevel1GO1619( ) ;
      if ( AnyError != 0 )
      {
         O4235RatImpTinA = s4235RatImpTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         O4234RatCosTinA = s4234RatCosTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         O4233RatKgmFacA = s4233RatKgmFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         O4232RatKgmTinA = s4232RatKgmTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         O4237RatAnuFacA = s4237RatAnuFacA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         O4236RatAnuTinA = s4236RatAnuTinA ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1618 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1GO1618( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1GO1618( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tratios");
         if ( AnyError == 0 )
         {
            confirmValues1GO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tratios");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1GO1618( )
   {
      /* Scan By routine */
      /* Using cursor T01GO24 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound1618 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1618 = (short)(1) ;
         A252CliCod = T01GO24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4228RatTipArt = T01GO24_A4228RatTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
         A4229RatSec = T01GO24_A4229RatSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
         A4230RatAny = T01GO24_A4230RatAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GO1618( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1618 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1618 = (short)(1) ;
         A252CliCod = T01GO24_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A4228RatTipArt = T01GO24_A4228RatTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
         A4229RatSec = T01GO24_A4229RatSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
         A4230RatAny = T01GO24_A4230RatAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
      }
   }

   public void scanEnd1GO1618( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1GO1618( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GO1618( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GO1618( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GO1618( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GO1618( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GO1618( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GO1618( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtRatTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatTipArt_Enabled), 5, 0), true);
      edtRatSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatSec_Enabled), 5, 0), true);
      edtRatAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatAny_Enabled), 5, 0), true);
      edtRatTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatTipDsc_Enabled), 5, 0), true);
      edtRatKgmTinA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatKgmTinA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmTinA_Enabled), 5, 0), true);
      edtRatKgmFacA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatKgmFacA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmFacA_Enabled), 5, 0), true);
      edtRatCosTinA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatCosTinA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatCosTinA_Enabled), 5, 0), true);
      edtRatImpTinA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatImpTinA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatImpTinA_Enabled), 5, 0), true);
      edtRatAnuTinA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatAnuTinA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatAnuTinA_Enabled), 5, 0), true);
      edtRatAnuFacA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatAnuFacA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatAnuFacA_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1GO1619( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4239RatKgmTin = T01GO3_A4239RatKgmTin[0] ;
            Z4240RatKgmFac = T01GO3_A4240RatKgmFac[0] ;
            Z4241RatCosTin = T01GO3_A4241RatCosTin[0] ;
            Z4242RatImpTin = T01GO3_A4242RatImpTin[0] ;
         }
         else
         {
            Z4239RatKgmTin = A4239RatKgmTin ;
            Z4240RatKgmFac = A4240RatKgmFac ;
            Z4241RatCosTin = A4241RatCosTin ;
            Z4242RatImpTin = A4242RatImpTin ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z4228RatTipArt = A4228RatTipArt ;
         Z4229RatSec = A4229RatSec ;
         Z4230RatAny = A4230RatAny ;
         Z4238RatMes = A4238RatMes ;
         Z4239RatKgmTin = A4239RatKgmTin ;
         Z4240RatKgmFac = A4240RatKgmFac ;
         Z4241RatCosTin = A4241RatCosTin ;
         Z4242RatImpTin = A4242RatImpTin ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1GO1619( )
   {
   }

   public void standaloneModal1GO1619( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRatMes_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRatMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMes_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
      else
      {
         edtRatMes_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRatMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMes_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      }
   }

   public void load1GO1619( )
   {
      /* Using cursor T01GO25 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1619 = (short)(1) ;
         A4239RatKgmTin = T01GO25_A4239RatKgmTin[0] ;
         n4239RatKgmTin = T01GO25_n4239RatKgmTin[0] ;
         A4240RatKgmFac = T01GO25_A4240RatKgmFac[0] ;
         n4240RatKgmFac = T01GO25_n4240RatKgmFac[0] ;
         A4241RatCosTin = T01GO25_A4241RatCosTin[0] ;
         n4241RatCosTin = T01GO25_n4241RatCosTin[0] ;
         A4242RatImpTin = T01GO25_A4242RatImpTin[0] ;
         n4242RatImpTin = T01GO25_n4242RatImpTin[0] ;
         zm1GO1619( -15) ;
      }
      pr_default.close(19);
      onLoadActions1GO1619( ) ;
   }

   public void onLoadActions1GO1619( )
   {
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4239RatKgmTin)==0) )
      {
         A4243RatMesTin = GXutil.roundDecimal( A4241RatCosTin.divide(A4239RatKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         A4243RatMesTin = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin).subtract(O4239RatKgmTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4232RatKgmTinA = O4232RatKgmTinA.subtract(O4239RatKgmTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4240RatKgmFac)==0) )
      {
         A4244RatMesFac = GXutil.roundDecimal( A4242RatImpTin.divide(A4240RatKgmFac, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         A4244RatMesFac = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac).subtract(O4240RatKgmFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4233RatKgmFacA = O4233RatKgmFacA.subtract(O4240RatKgmFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin).subtract(O4241RatCosTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4234RatCosTinA = O4234RatCosTinA.subtract(O4241RatCosTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
      {
         A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      else
      {
         A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      if ( isIns( )  )
      {
         A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin).subtract(O4242RatImpTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4235RatImpTinA = O4235RatImpTinA.subtract(O4242RatImpTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
      {
         A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
      else
      {
         A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
   }

   public void checkExtendedTable1GO1619( )
   {
      nIsDirty_1619 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1GO1619( ) ;
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4239RatKgmTin)==0) )
      {
         nIsDirty_1619 = (short)(1) ;
         A4243RatMesTin = GXutil.roundDecimal( A4241RatCosTin.divide(A4239RatKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         nIsDirty_1619 = (short)(1) ;
         A4243RatMesTin = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_1619 = (short)(1) ;
         A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1619 = (short)(1) ;
            A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin).subtract(O4239RatKgmTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1619 = (short)(1) ;
               A4232RatKgmTinA = O4232RatKgmTinA.subtract(O4239RatKgmTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4240RatKgmFac)==0) )
      {
         nIsDirty_1619 = (short)(1) ;
         A4244RatMesFac = GXutil.roundDecimal( A4242RatImpTin.divide(A4240RatKgmFac, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         nIsDirty_1619 = (short)(1) ;
         A4244RatMesFac = DecimalUtil.doubleToDec(0) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_1619 = (short)(1) ;
         A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1619 = (short)(1) ;
            A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac).subtract(O4240RatKgmFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1619 = (short)(1) ;
               A4233RatKgmFacA = O4233RatKgmFacA.subtract(O4240RatKgmFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_1619 = (short)(1) ;
         A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1619 = (short)(1) ;
            A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin).subtract(O4241RatCosTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1619 = (short)(1) ;
               A4234RatCosTinA = O4234RatCosTinA.subtract(O4241RatCosTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
      {
         nIsDirty_1619 = (short)(1) ;
         A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      else
      {
         nIsDirty_1619 = (short)(1) ;
         A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      }
      if ( isIns( )  )
      {
         nIsDirty_1619 = (short)(1) ;
         A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1619 = (short)(1) ;
            A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin).subtract(O4242RatImpTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1619 = (short)(1) ;
               A4235RatImpTinA = O4235RatImpTinA.subtract(O4242RatImpTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
            }
         }
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
      {
         nIsDirty_1619 = (short)(1) ;
         A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
      else
      {
         nIsDirty_1619 = (short)(1) ;
         A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      }
   }

   public void closeExtendedTableCursors1GO1619( )
   {
   }

   public void enableDisable1GO1619( )
   {
   }

   public void getKey1GO1619( )
   {
      /* Using cursor T01GO26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1619 = (short)(1) ;
      }
      else
      {
         RcdFound1619 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1GO1619( )
   {
      /* Using cursor T01GO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01GO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1GO1619( 15) ;
         RcdFound1619 = (short)(1) ;
         initializeNonKey1GO1619( ) ;
         A4238RatMes = T01GO3_A4238RatMes[0] ;
         A4239RatKgmTin = T01GO3_A4239RatKgmTin[0] ;
         n4239RatKgmTin = T01GO3_n4239RatKgmTin[0] ;
         A4240RatKgmFac = T01GO3_A4240RatKgmFac[0] ;
         n4240RatKgmFac = T01GO3_n4240RatKgmFac[0] ;
         A4241RatCosTin = T01GO3_A4241RatCosTin[0] ;
         n4241RatCosTin = T01GO3_n4241RatCosTin[0] ;
         A4242RatImpTin = T01GO3_A4242RatImpTin[0] ;
         n4242RatImpTin = T01GO3_n4242RatImpTin[0] ;
         O4242RatImpTin = A4242RatImpTin ;
         n4242RatImpTin = false ;
         O4241RatCosTin = A4241RatCosTin ;
         n4241RatCosTin = false ;
         O4240RatKgmFac = A4240RatKgmFac ;
         n4240RatKgmFac = false ;
         O4239RatKgmTin = A4239RatKgmTin ;
         n4239RatKgmTin = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z4228RatTipArt = A4228RatTipArt ;
         Z4229RatSec = A4229RatSec ;
         Z4230RatAny = A4230RatAny ;
         Z4238RatMes = A4238RatMes ;
         sMode1619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GO1619( ) ;
         load1GO1619( ) ;
         Gx_mode = sMode1619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1619 = (short)(0) ;
         initializeNonKey1GO1619( ) ;
         sMode1619 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1GO1619( ) ;
         Gx_mode = sMode1619 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1GO1619( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1GO1619( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01GO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRATIO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z4239RatKgmTin, T01GO2_A4239RatKgmTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4240RatKgmFac, T01GO2_A4240RatKgmFac[0]) != 0 ) || ( DecimalUtil.compareTo(Z4241RatCosTin, T01GO2_A4241RatCosTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4242RatImpTin, T01GO2_A4242RatImpTin[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z4239RatKgmTin, T01GO2_A4239RatKgmTin[0]) != 0 )
            {
               GXutil.writeLogln("tratios:[seudo value changed for attri]"+"RatKgmTin");
               GXutil.writeLogRaw("Old: ",Z4239RatKgmTin);
               GXutil.writeLogRaw("Current: ",T01GO2_A4239RatKgmTin[0]);
            }
            if ( DecimalUtil.compareTo(Z4240RatKgmFac, T01GO2_A4240RatKgmFac[0]) != 0 )
            {
               GXutil.writeLogln("tratios:[seudo value changed for attri]"+"RatKgmFac");
               GXutil.writeLogRaw("Old: ",Z4240RatKgmFac);
               GXutil.writeLogRaw("Current: ",T01GO2_A4240RatKgmFac[0]);
            }
            if ( DecimalUtil.compareTo(Z4241RatCosTin, T01GO2_A4241RatCosTin[0]) != 0 )
            {
               GXutil.writeLogln("tratios:[seudo value changed for attri]"+"RatCosTin");
               GXutil.writeLogRaw("Old: ",Z4241RatCosTin);
               GXutil.writeLogRaw("Current: ",T01GO2_A4241RatCosTin[0]);
            }
            if ( DecimalUtil.compareTo(Z4242RatImpTin, T01GO2_A4242RatImpTin[0]) != 0 )
            {
               GXutil.writeLogln("tratios:[seudo value changed for attri]"+"RatImpTin");
               GXutil.writeLogRaw("Old: ",Z4242RatImpTin);
               GXutil.writeLogRaw("Current: ",T01GO2_A4242RatImpTin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRATIO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1GO1619( )
   {
      beforeValidate1GO1619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GO1619( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1GO1619( 0) ;
         checkOptimisticConcurrency1GO1619( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1GO1619( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1GO1619( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01GO27 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes), Boolean.valueOf(n4239RatKgmTin), A4239RatKgmTin, Boolean.valueOf(n4240RatKgmFac), A4240RatKgmFac, Boolean.valueOf(n4241RatCosTin), A4241RatCosTin, Boolean.valueOf(n4242RatImpTin), A4242RatImpTin, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRATIO");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1GO1619( ) ;
         }
         endLevel1GO1619( ) ;
      }
      closeExtendedTableCursors1GO1619( ) ;
   }

   public void update1GO1619( )
   {
      beforeValidate1GO1619( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1GO1619( ) ;
      }
      if ( ( nIsMod_1619 != 0 ) || ( nIsDirty_1619 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1GO1619( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1GO1619( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1GO1619( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01GO28 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n4239RatKgmTin), A4239RatKgmTin, Boolean.valueOf(n4240RatKgmFac), A4240RatKgmFac, Boolean.valueOf(n4241RatCosTin), A4241RatCosTin, Boolean.valueOf(n4242RatImpTin), A4242RatImpTin, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRATIO");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRATIO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1GO1619( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1GO1619( ) ;
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
            endLevel1GO1619( ) ;
         }
      }
      closeExtendedTableCursors1GO1619( ) ;
   }

   public void deferredUpdate1GO1619( )
   {
   }

   public void delete1GO1619( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1GO1619( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1GO1619( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1GO1619( ) ;
         afterConfirm1GO1619( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1GO1619( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01GO29 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny), Byte.valueOf(A4238RatMes)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRATIO");
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
      sMode1619 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1GO1619( ) ;
      Gx_mode = sMode1619 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1GO1619( )
   {
      standaloneModal1GO1619( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4232RatKgmTinA = O4232RatKgmTinA.add(A4239RatKgmTin).subtract(O4239RatKgmTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4232RatKgmTinA = O4232RatKgmTinA.subtract(O4239RatKgmTin) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4233RatKgmFacA = O4233RatKgmFacA.add(A4240RatKgmFac).subtract(O4240RatKgmFac) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4233RatKgmFacA = O4233RatKgmFacA.subtract(O4240RatKgmFac) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4239RatKgmTin)==0) )
         {
            A4243RatMesTin = GXutil.roundDecimal( A4241RatCosTin.divide(A4239RatKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            A4243RatMesTin = DecimalUtil.doubleToDec(0) ;
         }
         if ( isIns( )  )
         {
            A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4234RatCosTinA = O4234RatCosTinA.add(A4241RatCosTin).subtract(O4241RatCosTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4234RatCosTinA = O4234RatCosTinA.subtract(O4241RatCosTin) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
         {
            A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         }
         else
         {
            A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4240RatKgmFac)==0) )
         {
            A4244RatMesFac = GXutil.roundDecimal( A4242RatImpTin.divide(A4240RatKgmFac, 18, java.math.RoundingMode.DOWN), 2) ;
         }
         else
         {
            A4244RatMesFac = DecimalUtil.doubleToDec(0) ;
         }
         if ( isIns( )  )
         {
            A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4235RatImpTinA = O4235RatImpTinA.add(A4242RatImpTin).subtract(O4242RatImpTin) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4235RatImpTinA = O4235RatImpTinA.subtract(O4242RatImpTin) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
               }
            }
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
         {
            A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         }
         else
         {
            A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
         }
      }
   }

   public void endLevel1GO1619( )
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

   public void scanStart1GO1619( )
   {
      /* Scan By routine */
      /* Using cursor T01GO30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      RcdFound1619 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1619 = (short)(1) ;
         A4238RatMes = T01GO30_A4238RatMes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1GO1619( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1619 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1619 = (short)(1) ;
         A4238RatMes = T01GO30_A4238RatMes[0] ;
      }
   }

   public void scanEnd1GO1619( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1GO1619( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1GO1619( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1GO1619( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1GO1619( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1GO1619( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1GO1619( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1GO1619( )
   {
      edtRatMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMes_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatKgmTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatKgmTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatKgmFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatKgmFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatKgmFac_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatCosTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatCosTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatCosTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatImpTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatImpTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatImpTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatMesTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatMesTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMesTin_Enabled), 5, 0), !bGXsfl_90_Refreshing);
      edtRatMesFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatMesFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMesFac_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void send_integrity_lvl_hashes1GO1619( )
   {
   }

   public void send_integrity_lvl_hashes1GO1618( )
   {
   }

   public void subsflControlProps_901619( )
   {
      edtavnRcdDeleted_1619_Internalname = "vNRCDDELETED_1619_"+sGXsfl_90_idx ;
      edtRatMes_Internalname = "RATMES_"+sGXsfl_90_idx ;
      edtRatKgmTin_Internalname = "RATKGMTIN_"+sGXsfl_90_idx ;
      edtRatKgmFac_Internalname = "RATKGMFAC_"+sGXsfl_90_idx ;
      edtRatCosTin_Internalname = "RATCOSTIN_"+sGXsfl_90_idx ;
      edtRatImpTin_Internalname = "RATIMPTIN_"+sGXsfl_90_idx ;
      edtRatMesTin_Internalname = "RATMESTIN_"+sGXsfl_90_idx ;
      edtRatMesFac_Internalname = "RATMESFAC_"+sGXsfl_90_idx ;
   }

   public void subsflControlProps_fel_901619( )
   {
      edtavnRcdDeleted_1619_Internalname = "vNRCDDELETED_1619_"+sGXsfl_90_fel_idx ;
      edtRatMes_Internalname = "RATMES_"+sGXsfl_90_fel_idx ;
      edtRatKgmTin_Internalname = "RATKGMTIN_"+sGXsfl_90_fel_idx ;
      edtRatKgmFac_Internalname = "RATKGMFAC_"+sGXsfl_90_fel_idx ;
      edtRatCosTin_Internalname = "RATCOSTIN_"+sGXsfl_90_fel_idx ;
      edtRatImpTin_Internalname = "RATIMPTIN_"+sGXsfl_90_fel_idx ;
      edtRatMesTin_Internalname = "RATMESTIN_"+sGXsfl_90_fel_idx ;
      edtRatMesFac_Internalname = "RATMESFAC_"+sGXsfl_90_fel_idx ;
   }

   public void addRow1GO1619( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901619( ) ;
      sendRow1GO1619( ) ;
   }

   public void sendRow1GO1619( )
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
         if ( ((int)((nGXsfl_90_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1619_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1619_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1619), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1619), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1619_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1619_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatMes_Internalname,GXutil.ltrim( localUtil.ntoc( A4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4238RatMes), "ZZ"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatMes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatMes_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatKgmTin_Internalname,GXutil.ltrim( localUtil.ntoc( A4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatKgmTin_Enabled!=0) ? localUtil.format( A4239RatKgmTin, "ZZZZZZZ.ZZ") : localUtil.format( A4239RatKgmTin, "ZZZZZZZ.ZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatKgmTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatKgmTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatKgmFac_Internalname,GXutil.ltrim( localUtil.ntoc( A4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatKgmFac_Enabled!=0) ? localUtil.format( A4240RatKgmFac, "ZZZZZZZ.ZZ") : localUtil.format( A4240RatKgmFac, "ZZZZZZZ.ZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatKgmFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatKgmFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatCosTin_Internalname,GXutil.ltrim( localUtil.ntoc( A4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatCosTin_Enabled!=0) ? localUtil.format( A4241RatCosTin, "ZZZZZZZZZZ.ZZ") : localUtil.format( A4241RatCosTin, "ZZZZZZZZZZ.ZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatCosTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatCosTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1619_" + sGXsfl_90_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_90_idx + "',90)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatImpTin_Internalname,GXutil.ltrim( localUtil.ntoc( A4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatImpTin_Enabled!=0) ? localUtil.format( A4242RatImpTin, "ZZZZZZZZZZ.ZZ") : localUtil.format( A4242RatImpTin, "ZZZZZZZZZZ.ZZ"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatImpTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatImpTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatMesTin_Internalname,GXutil.ltrim( localUtil.ntoc( A4243RatMesTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatMesTin_Enabled!=0) ? localUtil.format( A4243RatMesTin, "ZZZZ.ZZ") : localUtil.format( A4243RatMesTin, "ZZZZ.ZZ"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatMesTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatMesTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRatMesFac_Internalname,GXutil.ltrim( localUtil.ntoc( A4244RatMesFac, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRatMesFac_Enabled!=0) ? localUtil.format( A4244RatMesFac, "ZZZZ.ZZ") : localUtil.format( A4244RatMesFac, "ZZZZ.ZZ"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRatMesFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRatMesFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1GO1619( ) ;
      GXCCtl = "Z4238RatMes_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4238RatMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4239RatKgmTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4240RatKgmFac_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4241RatCosTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4242RatImpTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4242RatImpTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4242RatImpTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4241RatCosTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4241RatCosTin, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4240RatKgmFac_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4240RatKgmFac, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O4239RatKgmTin_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4239RatKgmTin, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1619_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1619_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1619_" + sGXsfl_90_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1619, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1619_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1619_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATMES_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATKGMTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATKGMFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATCOSTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatCosTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATIMPTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatImpTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATMESTIN_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RATMESFAC_"+sGXsfl_90_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1GO1619( )
   {
      nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901619( ) ;
      edtavnRcdDeleted_1619_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1619_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatMes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMES_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatKgmTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATKGMTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatKgmFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATKGMFAC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatCosTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATCOSTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatImpTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATIMPTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatMesTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMESTIN_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRatMesFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RATMESFAC_"+sGXsfl_90_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1619_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1619_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1619");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1619_Internalname ;
         wbErr = true ;
         nRcdDeleted_1619 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1619 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1619_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRatMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRatMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "RATMES_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRatMes_Internalname ;
         wbErr = true ;
         A4238RatMes = (byte)(0) ;
      }
      else
      {
         A4238RatMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtRatMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRatKgmTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatKgmTin_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "RATKGMTIN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRatKgmTin_Internalname ;
         wbErr = true ;
         A4239RatKgmTin = DecimalUtil.ZERO ;
         n4239RatKgmTin = false ;
      }
      else
      {
         A4239RatKgmTin = localUtil.ctond( httpContext.cgiGet( edtRatKgmTin_Internalname)) ;
         n4239RatKgmTin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRatKgmFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatKgmFac_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "RATKGMFAC_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRatKgmFac_Internalname ;
         wbErr = true ;
         A4240RatKgmFac = DecimalUtil.ZERO ;
         n4240RatKgmFac = false ;
      }
      else
      {
         A4240RatKgmFac = localUtil.ctond( httpContext.cgiGet( edtRatKgmFac_Internalname)) ;
         n4240RatKgmFac = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatCosTin_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatCosTin_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RATCOSTIN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRatCosTin_Internalname ;
         wbErr = true ;
         A4241RatCosTin = DecimalUtil.ZERO ;
         n4241RatCosTin = false ;
      }
      else
      {
         A4241RatCosTin = localUtil.ctond( httpContext.cgiGet( edtRatCosTin_Internalname)) ;
         n4241RatCosTin = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatImpTin_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRatImpTin_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RATIMPTIN_" + sGXsfl_90_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRatImpTin_Internalname ;
         wbErr = true ;
         A4242RatImpTin = DecimalUtil.ZERO ;
         n4242RatImpTin = false ;
      }
      else
      {
         A4242RatImpTin = localUtil.ctond( httpContext.cgiGet( edtRatImpTin_Internalname)) ;
         n4242RatImpTin = false ;
      }
      A4243RatMesTin = localUtil.ctond( httpContext.cgiGet( edtRatMesTin_Internalname)) ;
      A4244RatMesFac = localUtil.ctond( httpContext.cgiGet( edtRatMesFac_Internalname)) ;
      GXCCtl = "Z4238RatMes_" + sGXsfl_90_idx ;
      Z4238RatMes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4239RatKgmTin_" + sGXsfl_90_idx ;
      Z4239RatKgmTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4240RatKgmFac_" + sGXsfl_90_idx ;
      Z4240RatKgmFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4241RatCosTin_" + sGXsfl_90_idx ;
      Z4241RatCosTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4242RatImpTin_" + sGXsfl_90_idx ;
      Z4242RatImpTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4242RatImpTin_" + sGXsfl_90_idx ;
      O4242RatImpTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4241RatCosTin_" + sGXsfl_90_idx ;
      O4241RatCosTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4240RatKgmFac_" + sGXsfl_90_idx ;
      O4240RatKgmFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O4239RatKgmTin_" + sGXsfl_90_idx ;
      O4239RatKgmTin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1619_" + sGXsfl_90_idx ;
      nRcdDeleted_1619 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1619_" + sGXsfl_90_idx ;
      nRcdExists_1619 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1619_" + sGXsfl_90_idx ;
      nIsMod_1619 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRatMes_Enabled = edtRatMes_Enabled ;
   }

   public void confirmValues1GO0( )
   {
      nGXsfl_90_idx = 0 ;
      sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_901619( ) ;
      while ( nGXsfl_90_idx < nRC_GXsfl_90 )
      {
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901619( ) ;
         httpContext.changePostValue( "Z4238RatMes_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4238RatMes_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4238RatMes_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z4239RatKgmTin_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4239RatKgmTin_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4239RatKgmTin_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z4240RatKgmFac_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4240RatKgmFac_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4240RatKgmFac_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z4241RatCosTin_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4241RatCosTin_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4241RatCosTin_"+sGXsfl_90_idx) ;
         httpContext.changePostValue( "Z4242RatImpTin_"+sGXsfl_90_idx, httpContext.cgiGet( "ZT_"+"Z4242RatImpTin_"+sGXsfl_90_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4242RatImpTin_"+sGXsfl_90_idx) ;
      }
      httpContext.changePostValue( "O4242RatImpTin", httpContext.cgiGet( "T4242RatImpTin")) ;
      httpContext.deletePostValue( "T4242RatImpTin") ;
      httpContext.changePostValue( "O4241RatCosTin", httpContext.cgiGet( "T4241RatCosTin")) ;
      httpContext.deletePostValue( "T4241RatCosTin") ;
      httpContext.changePostValue( "O4240RatKgmFac", httpContext.cgiGet( "T4240RatKgmFac")) ;
      httpContext.deletePostValue( "T4240RatKgmFac") ;
      httpContext.changePostValue( "O4239RatKgmTin", httpContext.cgiGet( "T4239RatKgmTin")) ;
      httpContext.deletePostValue( "T4239RatKgmTin") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tratios", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4228RatTipArt", GXutil.ltrim( localUtil.ntoc( Z4228RatTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4229RatSec", GXutil.rtrim( Z4229RatSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4230RatAny", GXutil.ltrim( localUtil.ntoc( Z4230RatAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4231RatTipDsc", GXutil.rtrim( Z4231RatTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "O4235RatImpTinA", GXutil.ltrim( localUtil.ntoc( O4235RatImpTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4234RatCosTinA", GXutil.ltrim( localUtil.ntoc( O4234RatCosTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4233RatKgmFacA", GXutil.ltrim( localUtil.ntoc( O4233RatKgmFacA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4232RatKgmTinA", GXutil.ltrim( localUtil.ntoc( O4232RatKgmTinA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_90", GXutil.ltrim( localUtil.ntoc( nGXsfl_90_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tratios", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRATIOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MTO. RATIOS (H.S.Segura)", "") ;
   }

   public void initializeNonKey1GO1618( )
   {
      A4237RatAnuFacA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrimstr( A4237RatAnuFacA, 7, 2));
      A4236RatAnuTinA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrimstr( A4236RatAnuTinA, 7, 2));
      A4231RatTipDsc = "" ;
      n4231RatTipDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4231RatTipDsc", A4231RatTipDsc);
      A4232RatKgmTinA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      A4233RatKgmFacA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      A4234RatCosTinA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      A4235RatImpTinA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      O4235RatImpTinA = A4235RatImpTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      O4234RatCosTinA = A4234RatCosTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
      O4233RatKgmFacA = A4233RatKgmFacA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
      O4232RatKgmTinA = A4232RatKgmTinA ;
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
      Z4231RatTipDsc = "" ;
   }

   public void initAll1GO1618( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4228RatTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4228RatTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4228RatTipArt), 4, 0));
      A4229RatSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4229RatSec", A4229RatSec);
      A4230RatAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4230RatAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4230RatAny), 4, 0));
      initializeNonKey1GO1618( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1GO1619( )
   {
      A4244RatMesFac = DecimalUtil.ZERO ;
      A4243RatMesTin = DecimalUtil.ZERO ;
      A4239RatKgmTin = DecimalUtil.ZERO ;
      n4239RatKgmTin = false ;
      A4240RatKgmFac = DecimalUtil.ZERO ;
      n4240RatKgmFac = false ;
      A4241RatCosTin = DecimalUtil.ZERO ;
      n4241RatCosTin = false ;
      A4242RatImpTin = DecimalUtil.ZERO ;
      n4242RatImpTin = false ;
      O4242RatImpTin = A4242RatImpTin ;
      n4242RatImpTin = false ;
      O4241RatCosTin = A4241RatCosTin ;
      n4241RatCosTin = false ;
      O4240RatKgmFac = A4240RatKgmFac ;
      n4240RatKgmFac = false ;
      O4239RatKgmTin = A4239RatKgmTin ;
      n4239RatKgmTin = false ;
      Z4239RatKgmTin = DecimalUtil.ZERO ;
      Z4240RatKgmFac = DecimalUtil.ZERO ;
      Z4241RatCosTin = DecimalUtil.ZERO ;
      Z4242RatImpTin = DecimalUtil.ZERO ;
   }

   public void initAll1GO1619( )
   {
      A4238RatMes = (byte)(0) ;
      initializeNonKey1GO1619( ) ;
   }

   public void standaloneModalInsert1GO1619( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824158028", true, true);
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
      httpContext.AddJavascriptSource("tratios.js", "?2026824158028", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1619( )
   {
      edtRatMes_Enabled = defedtRatMes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRatMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRatMes_Enabled), 5, 0), !bGXsfl_90_Refreshing);
   }

   public void startgridcontrol90( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1619, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1619_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4238RatMes, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4239RatKgmTin, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4240RatKgmFac, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatKgmFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4241RatCosTin, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatCosTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4242RatImpTin, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatImpTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4243RatMesTin, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4244RatMesFac, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRatMesFac_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtRatTipArt_Internalname = "RATTIPART" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRatSec_Internalname = "RATSEC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRatAny_Internalname = "RATANY" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRatTipDsc_Internalname = "RATTIPDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRatKgmTinA_Internalname = "RATKGMTINA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtRatKgmFacA_Internalname = "RATKGMFACA" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtRatCosTinA_Internalname = "RATCOSTINA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtRatImpTinA_Internalname = "RATIMPTINA" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtRatAnuTinA_Internalname = "RATANUTINA" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtRatAnuFacA_Internalname = "RATANUFACA" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_1619_Internalname = "vNRCDDELETED_1619" ;
      edtRatMes_Internalname = "RATMES" ;
      edtRatKgmTin_Internalname = "RATKGMTIN" ;
      edtRatKgmFac_Internalname = "RATKGMFAC" ;
      edtRatCosTin_Internalname = "RATCOSTIN" ;
      edtRatImpTin_Internalname = "RATIMPTIN" ;
      edtRatMesTin_Internalname = "RATMESTIN" ;
      edtRatMesFac_Internalname = "RATMESFAC" ;
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
      Form.setCaption( httpContext.getMessage( "MTO. RATIOS (H.S.Segura)", "") );
      edtRatMesFac_Jsonclick = "" ;
      edtRatMesTin_Jsonclick = "" ;
      edtRatImpTin_Jsonclick = "" ;
      edtRatCosTin_Jsonclick = "" ;
      edtRatKgmFac_Jsonclick = "" ;
      edtRatKgmTin_Jsonclick = "" ;
      edtRatMes_Jsonclick = "" ;
      edtavnRcdDeleted_1619_Jsonclick = "" ;
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
      edtRatMesFac_Enabled = 0 ;
      edtRatMesTin_Enabled = 0 ;
      edtRatImpTin_Enabled = 1 ;
      edtRatCosTin_Enabled = 1 ;
      edtRatKgmFac_Enabled = 1 ;
      edtRatKgmTin_Enabled = 1 ;
      edtRatMes_Enabled = 1 ;
      edtavnRcdDeleted_1619_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtRatAnuFacA_Jsonclick = "" ;
      edtRatAnuFacA_Backcolor = (int)(0xFFFFFF) ;
      edtRatAnuFacA_Enabled = 0 ;
      edtRatAnuTinA_Jsonclick = "" ;
      edtRatAnuTinA_Backcolor = (int)(0xFFFFFF) ;
      edtRatAnuTinA_Enabled = 0 ;
      edtRatImpTinA_Jsonclick = "" ;
      edtRatImpTinA_Backcolor = (int)(0xFFFFFF) ;
      edtRatImpTinA_Enabled = 0 ;
      edtRatCosTinA_Jsonclick = "" ;
      edtRatCosTinA_Backcolor = (int)(0xFFFFFF) ;
      edtRatCosTinA_Enabled = 0 ;
      edtRatKgmFacA_Jsonclick = "" ;
      edtRatKgmFacA_Backcolor = (int)(0xFFFFFF) ;
      edtRatKgmFacA_Enabled = 0 ;
      edtRatKgmTinA_Jsonclick = "" ;
      edtRatKgmTinA_Backcolor = (int)(0xFFFFFF) ;
      edtRatKgmTinA_Enabled = 0 ;
      edtRatTipDsc_Jsonclick = "" ;
      edtRatTipDsc_Backcolor = (int)(0xFFFFFF) ;
      edtRatTipDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRatAny_Jsonclick = "" ;
      edtRatAny_Backcolor = (int)(0xFFFFFF) ;
      edtRatAny_Enabled = 1 ;
      edtRatSec_Jsonclick = "" ;
      edtRatSec_Backcolor = (int)(0xFFFFFF) ;
      edtRatSec_Enabled = 1 ;
      edtRatTipArt_Jsonclick = "" ;
      edtRatTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtRatTipArt_Enabled = 1 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_901619( ) ;
      while ( nGXsfl_90_idx <= nRC_GXsfl_90 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1GO1619( ) ;
         standaloneModal1GO1619( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1GO1619( ) ;
         nGXsfl_90_idx = (int)(nGXsfl_90_idx+1) ;
         sGXsfl_90_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_90_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_901619( ) ;
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
      /* Using cursor T01GO31 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01GO31_A407EmprNom[0] ;
      n407EmprNom = T01GO31_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01GO21 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01GO21_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(16);
      /* Using cursor T01GO23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A4232RatKgmTinA = T01GO23_A4232RatKgmTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = T01GO23_A4233RatKgmFacA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = T01GO23_A4234RatCosTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = T01GO23_A4235RatImpTinA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      else
      {
         A4232RatKgmTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrimstr( A4232RatKgmTinA, 10, 2));
         A4233RatKgmFacA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrimstr( A4233RatKgmFacA, 10, 2));
         A4234RatCosTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrimstr( A4234RatCosTinA, 13, 2));
         A4235RatImpTinA = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrimstr( A4235RatImpTinA, 13, 2));
      }
      pr_default.close(17);
      GX_FocusControl = edtRatTipDsc_Internalname ;
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
      /* Using cursor T01GO21 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01GO21_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Ratany( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01GO23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A4228RatTipArt), A4229RatSec, Short.valueOf(A4230RatAny)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A4232RatKgmTinA = T01GO23_A4232RatKgmTinA[0] ;
         A4233RatKgmFacA = T01GO23_A4233RatKgmFacA[0] ;
         A4234RatCosTinA = T01GO23_A4234RatCosTinA[0] ;
         A4235RatImpTinA = T01GO23_A4235RatImpTinA[0] ;
      }
      else
      {
         A4232RatKgmTinA = DecimalUtil.doubleToDec(0) ;
         A4233RatKgmFacA = DecimalUtil.doubleToDec(0) ;
         A4234RatCosTinA = DecimalUtil.doubleToDec(0) ;
         A4235RatImpTinA = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(17);
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4232RatKgmTinA)==0) )
      {
         A4236RatAnuTinA = GXutil.roundDecimal( A4234RatCosTinA.divide(A4232RatKgmTinA, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         A4236RatAnuTinA = DecimalUtil.doubleToDec(0) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A4233RatKgmFacA)==0) )
      {
         A4237RatAnuFacA = GXutil.roundDecimal( A4235RatImpTinA.divide(A4233RatKgmFacA, 18, java.math.RoundingMode.DOWN), 2) ;
      }
      else
      {
         A4237RatAnuFacA = DecimalUtil.doubleToDec(0) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4231RatTipDsc", GXutil.rtrim( A4231RatTipDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4232RatKgmTinA", GXutil.ltrim( localUtil.ntoc( A4232RatKgmTinA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4233RatKgmFacA", GXutil.ltrim( localUtil.ntoc( A4233RatKgmFacA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4234RatCosTinA", GXutil.ltrim( localUtil.ntoc( A4234RatCosTinA, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4235RatImpTinA", GXutil.ltrim( localUtil.ntoc( A4235RatImpTinA, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4236RatAnuTinA", GXutil.ltrim( localUtil.ntoc( A4236RatAnuTinA, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4237RatAnuFacA", GXutil.ltrim( localUtil.ntoc( A4237RatAnuFacA, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4228RatTipArt", GXutil.ltrim( localUtil.ntoc( Z4228RatTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4229RatSec", GXutil.rtrim( Z4229RatSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4230RatAny", GXutil.ltrim( localUtil.ntoc( Z4230RatAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4231RatTipDsc", GXutil.rtrim( Z4231RatTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4232RatKgmTinA", GXutil.ltrim( localUtil.ntoc( Z4232RatKgmTinA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4233RatKgmFacA", GXutil.ltrim( localUtil.ntoc( Z4233RatKgmFacA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4234RatCosTinA", GXutil.ltrim( localUtil.ntoc( Z4234RatCosTinA, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4235RatImpTinA", GXutil.ltrim( localUtil.ntoc( Z4235RatImpTinA, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4236RatAnuTinA", GXutil.ltrim( localUtil.ntoc( Z4236RatAnuTinA, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4237RatAnuFacA", GXutil.ltrim( localUtil.ntoc( Z4237RatAnuFacA, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4235RatImpTinA", GXutil.ltrim( localUtil.ntoc( O4235RatImpTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4234RatCosTinA", GXutil.ltrim( localUtil.ntoc( O4234RatCosTinA, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4233RatKgmFacA", GXutil.ltrim( localUtil.ntoc( O4233RatKgmFacA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4232RatKgmTinA", GXutil.ltrim( localUtil.ntoc( O4232RatKgmTinA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_RATTIPART","{handler:'valid_Rattipart',iparms:[]");
      setEventMetadata("VALID_RATTIPART",",oparms:[]}");
      setEventMetadata("VALID_RATSEC","{handler:'valid_Ratsec',iparms:[]");
      setEventMetadata("VALID_RATSEC",",oparms:[]}");
      setEventMetadata("VALID_RATANY","{handler:'valid_Ratany',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4228RatTipArt',fld:'RATTIPART',pic:'ZZZ9'},{av:'A4229RatSec',fld:'RATSEC',pic:''},{av:'A4230RatAny',fld:'RATANY',pic:'ZZZ9'},{av:'A4234RatCosTinA',fld:'RATCOSTINA',pic:'ZZZZZZZZZZ.ZZ'},{av:'A4232RatKgmTinA',fld:'RATKGMTINA',pic:'ZZZZZZZ.ZZ'},{av:'A4235RatImpTinA',fld:'RATIMPTINA',pic:'ZZZZZZZZZZ.ZZ'},{av:'A4233RatKgmFacA',fld:'RATKGMFACA',pic:'ZZZZZZZ.ZZ'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RATANY",",oparms:[{av:'A4231RatTipDsc',fld:'RATTIPDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4232RatKgmTinA',fld:'RATKGMTINA',pic:'ZZZZZZZ.ZZ'},{av:'A4233RatKgmFacA',fld:'RATKGMFACA',pic:'ZZZZZZZ.ZZ'},{av:'A4234RatCosTinA',fld:'RATCOSTINA',pic:'ZZZZZZZZZZ.ZZ'},{av:'A4235RatImpTinA',fld:'RATIMPTINA',pic:'ZZZZZZZZZZ.ZZ'},{av:'A4236RatAnuTinA',fld:'RATANUTINA',pic:'ZZZZ.ZZ'},{av:'A4237RatAnuFacA',fld:'RATANUFACA',pic:'ZZZZ.ZZ'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z4228RatTipArt'},{av:'Z4229RatSec'},{av:'Z4230RatAny'},{av:'Z4231RatTipDsc'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z4232RatKgmTinA'},{av:'Z4233RatKgmFacA'},{av:'Z4234RatCosTinA'},{av:'Z4235RatImpTinA'},{av:'Z4236RatAnuTinA'},{av:'Z4237RatAnuFacA'},{av:'O4235RatImpTinA'},{av:'O4234RatCosTinA'},{av:'O4233RatKgmFacA'},{av:'O4232RatKgmTinA'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RATKGMTINA","{handler:'valid_Ratkgmtina',iparms:[]");
      setEventMetadata("VALID_RATKGMTINA",",oparms:[]}");
      setEventMetadata("VALID_RATKGMFACA","{handler:'valid_Ratkgmfaca',iparms:[]");
      setEventMetadata("VALID_RATKGMFACA",",oparms:[]}");
      setEventMetadata("VALID_RATCOSTINA","{handler:'valid_Ratcostina',iparms:[]");
      setEventMetadata("VALID_RATCOSTINA",",oparms:[]}");
      setEventMetadata("VALID_RATIMPTINA","{handler:'valid_Ratimptina',iparms:[]");
      setEventMetadata("VALID_RATIMPTINA",",oparms:[]}");
      setEventMetadata("VALID_RATMES","{handler:'valid_Ratmes',iparms:[]");
      setEventMetadata("VALID_RATMES",",oparms:[]}");
      setEventMetadata("VALID_RATKGMTIN","{handler:'valid_Ratkgmtin',iparms:[]");
      setEventMetadata("VALID_RATKGMTIN",",oparms:[]}");
      setEventMetadata("VALID_RATKGMFAC","{handler:'valid_Ratkgmfac',iparms:[]");
      setEventMetadata("VALID_RATKGMFAC",",oparms:[]}");
      setEventMetadata("VALID_RATCOSTIN","{handler:'valid_Ratcostin',iparms:[]");
      setEventMetadata("VALID_RATCOSTIN",",oparms:[]}");
      setEventMetadata("VALID_RATIMPTIN","{handler:'valid_Ratimptin',iparms:[]");
      setEventMetadata("VALID_RATIMPTIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ratmesfac',iparms:[]");
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
      pr_default.close(16);
      pr_default.close(25);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4229RatSec = "" ;
      Z4231RatTipDsc = "" ;
      O4235RatImpTinA = DecimalUtil.ZERO ;
      O4234RatCosTinA = DecimalUtil.ZERO ;
      O4233RatKgmFacA = DecimalUtil.ZERO ;
      O4232RatKgmTinA = DecimalUtil.ZERO ;
      Z4239RatKgmTin = DecimalUtil.ZERO ;
      Z4240RatKgmFac = DecimalUtil.ZERO ;
      Z4241RatCosTin = DecimalUtil.ZERO ;
      Z4242RatImpTin = DecimalUtil.ZERO ;
      O4242RatImpTin = DecimalUtil.ZERO ;
      O4241RatCosTin = DecimalUtil.ZERO ;
      O4240RatKgmFac = DecimalUtil.ZERO ;
      O4239RatKgmTin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4229RatSec = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A4231RatTipDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4232RatKgmTinA = DecimalUtil.ZERO ;
      lblTextblock8_Jsonclick = "" ;
      A4233RatKgmFacA = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A4234RatCosTinA = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A4235RatImpTinA = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A4236RatAnuTinA = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A4237RatAnuFacA = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B4235RatImpTinA = DecimalUtil.ZERO ;
      B4234RatCosTinA = DecimalUtil.ZERO ;
      B4233RatKgmFacA = DecimalUtil.ZERO ;
      B4232RatKgmTinA = DecimalUtil.ZERO ;
      sMode1619 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1618 = "" ;
      s4235RatImpTinA = DecimalUtil.ZERO ;
      s4234RatCosTinA = DecimalUtil.ZERO ;
      s4233RatKgmFacA = DecimalUtil.ZERO ;
      s4232RatKgmTinA = DecimalUtil.ZERO ;
      s4237RatAnuFacA = DecimalUtil.ZERO ;
      O4237RatAnuFacA = DecimalUtil.ZERO ;
      s4236RatAnuTinA = DecimalUtil.ZERO ;
      O4236RatAnuTinA = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A4239RatKgmTin = DecimalUtil.ZERO ;
      A4240RatKgmFac = DecimalUtil.ZERO ;
      A4241RatCosTin = DecimalUtil.ZERO ;
      A4242RatImpTin = DecimalUtil.ZERO ;
      A4243RatMesTin = DecimalUtil.ZERO ;
      A4244RatMesFac = DecimalUtil.ZERO ;
      T4242RatImpTin = DecimalUtil.ZERO ;
      T4241RatCosTin = DecimalUtil.ZERO ;
      T4240RatKgmFac = DecimalUtil.ZERO ;
      T4239RatKgmTin = DecimalUtil.ZERO ;
      AV18Station = "" ;
      GXv_char1 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV17UsurCod = "" ;
      AV20LitFe = "" ;
      AV19Lit0 = "" ;
      AV21lit1 = "" ;
      AV22lit2 = "" ;
      AV23lit3 = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV24lit4 = "" ;
      AV25lit5 = "" ;
      AV26lit6 = "" ;
      AV27lit7 = "" ;
      AV28lit8 = "" ;
      AV29lit9 = "" ;
      AV30lit10 = "" ;
      AV31lit32 = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z4232RatKgmTinA = DecimalUtil.ZERO ;
      Z4233RatKgmFacA = DecimalUtil.ZERO ;
      Z4234RatCosTinA = DecimalUtil.ZERO ;
      Z4235RatImpTinA = DecimalUtil.ZERO ;
      T01GO6_A407EmprNom = new String[] {""} ;
      T01GO6_n407EmprNom = new boolean[] {false} ;
      T01GO11_A4228RatTipArt = new short[1] ;
      T01GO11_A4229RatSec = new String[] {""} ;
      T01GO11_A4230RatAny = new short[1] ;
      T01GO11_A4231RatTipDsc = new String[] {""} ;
      T01GO11_n4231RatTipDsc = new boolean[] {false} ;
      T01GO11_A407EmprNom = new String[] {""} ;
      T01GO11_n407EmprNom = new boolean[] {false} ;
      T01GO11_A279CliNom = new String[] {""} ;
      T01GO11_A396EmprCod = new String[] {""} ;
      T01GO11_A252CliCod = new int[1] ;
      T01GO11_A4232RatKgmTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO11_A4233RatKgmFacA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO11_A4234RatCosTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO11_A4235RatImpTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO7_A279CliNom = new String[] {""} ;
      T01GO9_A4232RatKgmTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO9_A4233RatKgmFacA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO9_A4234RatCosTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO9_A4235RatImpTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO12_A279CliNom = new String[] {""} ;
      T01GO14_A4232RatKgmTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO14_A4233RatKgmFacA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO14_A4234RatCosTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO14_A4235RatImpTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO15_A396EmprCod = new String[] {""} ;
      T01GO15_A252CliCod = new int[1] ;
      T01GO15_A4228RatTipArt = new short[1] ;
      T01GO15_A4229RatSec = new String[] {""} ;
      T01GO15_A4230RatAny = new short[1] ;
      T01GO5_A4228RatTipArt = new short[1] ;
      T01GO5_A4229RatSec = new String[] {""} ;
      T01GO5_A4230RatAny = new short[1] ;
      T01GO5_A4231RatTipDsc = new String[] {""} ;
      T01GO5_n4231RatTipDsc = new boolean[] {false} ;
      T01GO5_A396EmprCod = new String[] {""} ;
      T01GO5_A252CliCod = new int[1] ;
      T01GO16_A396EmprCod = new String[] {""} ;
      T01GO16_A252CliCod = new int[1] ;
      T01GO16_A4228RatTipArt = new short[1] ;
      T01GO16_A4229RatSec = new String[] {""} ;
      T01GO16_A4230RatAny = new short[1] ;
      T01GO17_A396EmprCod = new String[] {""} ;
      T01GO17_A252CliCod = new int[1] ;
      T01GO17_A4228RatTipArt = new short[1] ;
      T01GO17_A4229RatSec = new String[] {""} ;
      T01GO17_A4230RatAny = new short[1] ;
      T01GO4_A4228RatTipArt = new short[1] ;
      T01GO4_A4229RatSec = new String[] {""} ;
      T01GO4_A4230RatAny = new short[1] ;
      T01GO4_A4231RatTipDsc = new String[] {""} ;
      T01GO4_n4231RatTipDsc = new boolean[] {false} ;
      T01GO4_A396EmprCod = new String[] {""} ;
      T01GO4_A252CliCod = new int[1] ;
      T01GO21_A279CliNom = new String[] {""} ;
      T01GO23_A4232RatKgmTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO23_A4233RatKgmFacA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO23_A4234RatCosTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO23_A4235RatImpTinA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO24_A396EmprCod = new String[] {""} ;
      T01GO24_A252CliCod = new int[1] ;
      T01GO24_A4228RatTipArt = new short[1] ;
      T01GO24_A4229RatSec = new String[] {""} ;
      T01GO24_A4230RatAny = new short[1] ;
      T01GO25_A252CliCod = new int[1] ;
      T01GO25_A4228RatTipArt = new short[1] ;
      T01GO25_A4229RatSec = new String[] {""} ;
      T01GO25_A4230RatAny = new short[1] ;
      T01GO25_A4238RatMes = new byte[1] ;
      T01GO25_A4239RatKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO25_n4239RatKgmTin = new boolean[] {false} ;
      T01GO25_A4240RatKgmFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO25_n4240RatKgmFac = new boolean[] {false} ;
      T01GO25_A4241RatCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO25_n4241RatCosTin = new boolean[] {false} ;
      T01GO25_A4242RatImpTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO25_n4242RatImpTin = new boolean[] {false} ;
      T01GO25_A396EmprCod = new String[] {""} ;
      T01GO26_A396EmprCod = new String[] {""} ;
      T01GO26_A252CliCod = new int[1] ;
      T01GO26_A4228RatTipArt = new short[1] ;
      T01GO26_A4229RatSec = new String[] {""} ;
      T01GO26_A4230RatAny = new short[1] ;
      T01GO26_A4238RatMes = new byte[1] ;
      T01GO3_A252CliCod = new int[1] ;
      T01GO3_A4228RatTipArt = new short[1] ;
      T01GO3_A4229RatSec = new String[] {""} ;
      T01GO3_A4230RatAny = new short[1] ;
      T01GO3_A4238RatMes = new byte[1] ;
      T01GO3_A4239RatKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO3_n4239RatKgmTin = new boolean[] {false} ;
      T01GO3_A4240RatKgmFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO3_n4240RatKgmFac = new boolean[] {false} ;
      T01GO3_A4241RatCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO3_n4241RatCosTin = new boolean[] {false} ;
      T01GO3_A4242RatImpTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO3_n4242RatImpTin = new boolean[] {false} ;
      T01GO3_A396EmprCod = new String[] {""} ;
      T01GO2_A252CliCod = new int[1] ;
      T01GO2_A4228RatTipArt = new short[1] ;
      T01GO2_A4229RatSec = new String[] {""} ;
      T01GO2_A4230RatAny = new short[1] ;
      T01GO2_A4238RatMes = new byte[1] ;
      T01GO2_A4239RatKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO2_n4239RatKgmTin = new boolean[] {false} ;
      T01GO2_A4240RatKgmFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO2_n4240RatKgmFac = new boolean[] {false} ;
      T01GO2_A4241RatCosTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO2_n4241RatCosTin = new boolean[] {false} ;
      T01GO2_A4242RatImpTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01GO2_n4242RatImpTin = new boolean[] {false} ;
      T01GO2_A396EmprCod = new String[] {""} ;
      T01GO30_A396EmprCod = new String[] {""} ;
      T01GO30_A252CliCod = new int[1] ;
      T01GO30_A4228RatTipArt = new short[1] ;
      T01GO30_A4229RatSec = new String[] {""} ;
      T01GO30_A4230RatAny = new short[1] ;
      T01GO30_A4238RatMes = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01GO31_A407EmprNom = new String[] {""} ;
      T01GO31_n407EmprNom = new boolean[] {false} ;
      Z4236RatAnuTinA = DecimalUtil.ZERO ;
      Z4237RatAnuFacA = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ4229RatSec = "" ;
      ZZ4231RatTipDsc = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ4232RatKgmTinA = DecimalUtil.ZERO ;
      ZZ4233RatKgmFacA = DecimalUtil.ZERO ;
      ZZ4234RatCosTinA = DecimalUtil.ZERO ;
      ZZ4235RatImpTinA = DecimalUtil.ZERO ;
      ZZ4236RatAnuTinA = DecimalUtil.ZERO ;
      ZZ4237RatAnuFacA = DecimalUtil.ZERO ;
      ZO4235RatImpTinA = DecimalUtil.ZERO ;
      ZO4234RatCosTinA = DecimalUtil.ZERO ;
      ZO4233RatKgmFacA = DecimalUtil.ZERO ;
      ZO4232RatKgmTinA = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tratios__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tratios__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tratios__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tratios__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tratios__default(),
         new Object[] {
             new Object[] {
            T01GO2_A252CliCod, T01GO2_A4228RatTipArt, T01GO2_A4229RatSec, T01GO2_A4230RatAny, T01GO2_A4238RatMes, T01GO2_A4239RatKgmTin, T01GO2_n4239RatKgmTin, T01GO2_A4240RatKgmFac, T01GO2_n4240RatKgmFac, T01GO2_A4241RatCosTin,
            T01GO2_n4241RatCosTin, T01GO2_A4242RatImpTin, T01GO2_n4242RatImpTin, T01GO2_A396EmprCod
            }
            , new Object[] {
            T01GO3_A252CliCod, T01GO3_A4228RatTipArt, T01GO3_A4229RatSec, T01GO3_A4230RatAny, T01GO3_A4238RatMes, T01GO3_A4239RatKgmTin, T01GO3_n4239RatKgmTin, T01GO3_A4240RatKgmFac, T01GO3_n4240RatKgmFac, T01GO3_A4241RatCosTin,
            T01GO3_n4241RatCosTin, T01GO3_A4242RatImpTin, T01GO3_n4242RatImpTin, T01GO3_A396EmprCod
            }
            , new Object[] {
            T01GO4_A4228RatTipArt, T01GO4_A4229RatSec, T01GO4_A4230RatAny, T01GO4_A4231RatTipDsc, T01GO4_n4231RatTipDsc, T01GO4_A396EmprCod, T01GO4_A252CliCod
            }
            , new Object[] {
            T01GO5_A4228RatTipArt, T01GO5_A4229RatSec, T01GO5_A4230RatAny, T01GO5_A4231RatTipDsc, T01GO5_n4231RatTipDsc, T01GO5_A396EmprCod, T01GO5_A252CliCod
            }
            , new Object[] {
            T01GO6_A407EmprNom, T01GO6_n407EmprNom
            }
            , new Object[] {
            T01GO7_A279CliNom
            }
            , new Object[] {
            T01GO9_A4232RatKgmTinA, T01GO9_A4233RatKgmFacA, T01GO9_A4234RatCosTinA, T01GO9_A4235RatImpTinA
            }
            , new Object[] {
            T01GO11_A4228RatTipArt, T01GO11_A4229RatSec, T01GO11_A4230RatAny, T01GO11_A4231RatTipDsc, T01GO11_n4231RatTipDsc, T01GO11_A407EmprNom, T01GO11_n407EmprNom, T01GO11_A279CliNom, T01GO11_A396EmprCod, T01GO11_A252CliCod,
            T01GO11_A4232RatKgmTinA, T01GO11_A4233RatKgmFacA, T01GO11_A4234RatCosTinA, T01GO11_A4235RatImpTinA
            }
            , new Object[] {
            T01GO12_A279CliNom
            }
            , new Object[] {
            T01GO14_A4232RatKgmTinA, T01GO14_A4233RatKgmFacA, T01GO14_A4234RatCosTinA, T01GO14_A4235RatImpTinA
            }
            , new Object[] {
            T01GO15_A396EmprCod, T01GO15_A252CliCod, T01GO15_A4228RatTipArt, T01GO15_A4229RatSec, T01GO15_A4230RatAny
            }
            , new Object[] {
            T01GO16_A396EmprCod, T01GO16_A252CliCod, T01GO16_A4228RatTipArt, T01GO16_A4229RatSec, T01GO16_A4230RatAny
            }
            , new Object[] {
            T01GO17_A396EmprCod, T01GO17_A252CliCod, T01GO17_A4228RatTipArt, T01GO17_A4229RatSec, T01GO17_A4230RatAny
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GO21_A279CliNom
            }
            , new Object[] {
            T01GO23_A4232RatKgmTinA, T01GO23_A4233RatKgmFacA, T01GO23_A4234RatCosTinA, T01GO23_A4235RatImpTinA
            }
            , new Object[] {
            T01GO24_A396EmprCod, T01GO24_A252CliCod, T01GO24_A4228RatTipArt, T01GO24_A4229RatSec, T01GO24_A4230RatAny
            }
            , new Object[] {
            T01GO25_A252CliCod, T01GO25_A4228RatTipArt, T01GO25_A4229RatSec, T01GO25_A4230RatAny, T01GO25_A4238RatMes, T01GO25_A4239RatKgmTin, T01GO25_n4239RatKgmTin, T01GO25_A4240RatKgmFac, T01GO25_n4240RatKgmFac, T01GO25_A4241RatCosTin,
            T01GO25_n4241RatCosTin, T01GO25_A4242RatImpTin, T01GO25_n4242RatImpTin, T01GO25_A396EmprCod
            }
            , new Object[] {
            T01GO26_A396EmprCod, T01GO26_A252CliCod, T01GO26_A4228RatTipArt, T01GO26_A4229RatSec, T01GO26_A4230RatAny, T01GO26_A4238RatMes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01GO30_A396EmprCod, T01GO30_A252CliCod, T01GO30_A4228RatTipArt, T01GO30_A4229RatSec, T01GO30_A4230RatAny, T01GO30_A4238RatMes
            }
            , new Object[] {
            T01GO31_A407EmprNom, T01GO31_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4238RatMes ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4238RatMes ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z4228RatTipArt ;
   private short Z4230RatAny ;
   private short nRcdDeleted_1619 ;
   private short nRcdExists_1619 ;
   private short nIsMod_1619 ;
   private short A4228RatTipArt ;
   private short A4230RatAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1619 ;
   private short RcdFound1619 ;
   private short nBlankRcdUsr1619 ;
   private short RcdFound1618 ;
   private short nIsDirty_1618 ;
   private short nIsDirty_1619 ;
   private short ZZ4228RatTipArt ;
   private short ZZ4230RatAny ;
   private int Z252CliCod ;
   private int nRC_GXsfl_90 ;
   private int nGXsfl_90_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtRatTipArt_Enabled ;
   private int edtRatSec_Enabled ;
   private int edtRatAny_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRatTipDsc_Enabled ;
   private int edtRatKgmTinA_Enabled ;
   private int edtRatKgmFacA_Enabled ;
   private int edtRatCosTinA_Enabled ;
   private int edtRatImpTinA_Enabled ;
   private int edtRatAnuTinA_Enabled ;
   private int edtRatAnuFacA_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_1619_Enabled ;
   private int edtRatMes_Enabled ;
   private int edtRatKgmTin_Enabled ;
   private int edtRatKgmFac_Enabled ;
   private int edtRatCosTin_Enabled ;
   private int edtRatImpTin_Enabled ;
   private int edtRatMesTin_Enabled ;
   private int edtRatMesFac_Enabled ;
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
   private int defedtRatMes_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtRatAnuFacA_Backcolor ;
   private int edtRatAnuTinA_Backcolor ;
   private int edtRatImpTinA_Backcolor ;
   private int edtRatCosTinA_Backcolor ;
   private int edtRatKgmFacA_Backcolor ;
   private int edtRatKgmTinA_Backcolor ;
   private int edtRatTipDsc_Backcolor ;
   private int edtRatAny_Backcolor ;
   private int edtRatSec_Backcolor ;
   private int edtRatTipArt_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O4235RatImpTinA ;
   private java.math.BigDecimal O4234RatCosTinA ;
   private java.math.BigDecimal O4233RatKgmFacA ;
   private java.math.BigDecimal O4232RatKgmTinA ;
   private java.math.BigDecimal Z4239RatKgmTin ;
   private java.math.BigDecimal Z4240RatKgmFac ;
   private java.math.BigDecimal Z4241RatCosTin ;
   private java.math.BigDecimal Z4242RatImpTin ;
   private java.math.BigDecimal O4242RatImpTin ;
   private java.math.BigDecimal O4241RatCosTin ;
   private java.math.BigDecimal O4240RatKgmFac ;
   private java.math.BigDecimal O4239RatKgmTin ;
   private java.math.BigDecimal A4232RatKgmTinA ;
   private java.math.BigDecimal A4233RatKgmFacA ;
   private java.math.BigDecimal A4234RatCosTinA ;
   private java.math.BigDecimal A4235RatImpTinA ;
   private java.math.BigDecimal A4236RatAnuTinA ;
   private java.math.BigDecimal A4237RatAnuFacA ;
   private java.math.BigDecimal B4235RatImpTinA ;
   private java.math.BigDecimal B4234RatCosTinA ;
   private java.math.BigDecimal B4233RatKgmFacA ;
   private java.math.BigDecimal B4232RatKgmTinA ;
   private java.math.BigDecimal s4235RatImpTinA ;
   private java.math.BigDecimal s4234RatCosTinA ;
   private java.math.BigDecimal s4233RatKgmFacA ;
   private java.math.BigDecimal s4232RatKgmTinA ;
   private java.math.BigDecimal s4237RatAnuFacA ;
   private java.math.BigDecimal O4237RatAnuFacA ;
   private java.math.BigDecimal s4236RatAnuTinA ;
   private java.math.BigDecimal O4236RatAnuTinA ;
   private java.math.BigDecimal A4239RatKgmTin ;
   private java.math.BigDecimal A4240RatKgmFac ;
   private java.math.BigDecimal A4241RatCosTin ;
   private java.math.BigDecimal A4242RatImpTin ;
   private java.math.BigDecimal A4243RatMesTin ;
   private java.math.BigDecimal A4244RatMesFac ;
   private java.math.BigDecimal T4242RatImpTin ;
   private java.math.BigDecimal T4241RatCosTin ;
   private java.math.BigDecimal T4240RatKgmFac ;
   private java.math.BigDecimal T4239RatKgmTin ;
   private java.math.BigDecimal Z4232RatKgmTinA ;
   private java.math.BigDecimal Z4233RatKgmFacA ;
   private java.math.BigDecimal Z4234RatCosTinA ;
   private java.math.BigDecimal Z4235RatImpTinA ;
   private java.math.BigDecimal Z4236RatAnuTinA ;
   private java.math.BigDecimal Z4237RatAnuFacA ;
   private java.math.BigDecimal ZZ4232RatKgmTinA ;
   private java.math.BigDecimal ZZ4233RatKgmFacA ;
   private java.math.BigDecimal ZZ4234RatCosTinA ;
   private java.math.BigDecimal ZZ4235RatImpTinA ;
   private java.math.BigDecimal ZZ4236RatAnuTinA ;
   private java.math.BigDecimal ZZ4237RatAnuFacA ;
   private java.math.BigDecimal ZO4235RatImpTinA ;
   private java.math.BigDecimal ZO4234RatCosTinA ;
   private java.math.BigDecimal ZO4233RatKgmFacA ;
   private java.math.BigDecimal ZO4232RatKgmTinA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4229RatSec ;
   private String Z4231RatTipDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4229RatSec ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_90_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtRatTipArt_Internalname ;
   private String edtRatTipArt_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRatSec_Internalname ;
   private String edtRatSec_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRatAny_Internalname ;
   private String edtRatAny_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRatTipDsc_Internalname ;
   private String A4231RatTipDsc ;
   private String edtRatTipDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRatKgmTinA_Internalname ;
   private String edtRatKgmTinA_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtRatKgmFacA_Internalname ;
   private String edtRatKgmFacA_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtRatCosTinA_Internalname ;
   private String edtRatCosTinA_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtRatImpTinA_Internalname ;
   private String edtRatImpTinA_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtRatAnuTinA_Internalname ;
   private String edtRatAnuTinA_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtRatAnuFacA_Internalname ;
   private String edtRatAnuFacA_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode1619 ;
   private String edtavnRcdDeleted_1619_Internalname ;
   private String edtRatMes_Internalname ;
   private String edtRatKgmTin_Internalname ;
   private String edtRatKgmFac_Internalname ;
   private String edtRatCosTin_Internalname ;
   private String edtRatImpTin_Internalname ;
   private String edtRatMesTin_Internalname ;
   private String edtRatMesFac_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1618 ;
   private String GXCCtl ;
   private String AV18Station ;
   private String GXv_char1[] ;
   private String AV16EmprNom ;
   private String GXv_char2[] ;
   private String AV17UsurCod ;
   private String AV20LitFe ;
   private String AV19Lit0 ;
   private String AV21lit1 ;
   private String AV22lit2 ;
   private String AV23lit3 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV24lit4 ;
   private String AV25lit5 ;
   private String AV26lit6 ;
   private String AV27lit7 ;
   private String AV28lit8 ;
   private String AV29lit9 ;
   private String AV30lit10 ;
   private String AV31lit32 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_90_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1619_Jsonclick ;
   private String edtRatMes_Jsonclick ;
   private String edtRatKgmTin_Jsonclick ;
   private String edtRatKgmFac_Jsonclick ;
   private String edtRatCosTin_Jsonclick ;
   private String edtRatImpTin_Jsonclick ;
   private String edtRatMesTin_Jsonclick ;
   private String edtRatMesFac_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4229RatSec ;
   private String ZZ4231RatTipDsc ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_90_Refreshing=false ;
   private boolean n4231RatTipDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n4239RatKgmTin ;
   private boolean n4240RatKgmFac ;
   private boolean n4241RatCosTin ;
   private boolean n4242RatImpTin ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01GO6_A407EmprNom ;
   private boolean[] T01GO6_n407EmprNom ;
   private short[] T01GO11_A4228RatTipArt ;
   private String[] T01GO11_A4229RatSec ;
   private short[] T01GO11_A4230RatAny ;
   private String[] T01GO11_A4231RatTipDsc ;
   private boolean[] T01GO11_n4231RatTipDsc ;
   private String[] T01GO11_A407EmprNom ;
   private boolean[] T01GO11_n407EmprNom ;
   private String[] T01GO11_A279CliNom ;
   private String[] T01GO11_A396EmprCod ;
   private int[] T01GO11_A252CliCod ;
   private java.math.BigDecimal[] T01GO11_A4232RatKgmTinA ;
   private java.math.BigDecimal[] T01GO11_A4233RatKgmFacA ;
   private java.math.BigDecimal[] T01GO11_A4234RatCosTinA ;
   private java.math.BigDecimal[] T01GO11_A4235RatImpTinA ;
   private String[] T01GO7_A279CliNom ;
   private java.math.BigDecimal[] T01GO9_A4232RatKgmTinA ;
   private java.math.BigDecimal[] T01GO9_A4233RatKgmFacA ;
   private java.math.BigDecimal[] T01GO9_A4234RatCosTinA ;
   private java.math.BigDecimal[] T01GO9_A4235RatImpTinA ;
   private String[] T01GO12_A279CliNom ;
   private java.math.BigDecimal[] T01GO14_A4232RatKgmTinA ;
   private java.math.BigDecimal[] T01GO14_A4233RatKgmFacA ;
   private java.math.BigDecimal[] T01GO14_A4234RatCosTinA ;
   private java.math.BigDecimal[] T01GO14_A4235RatImpTinA ;
   private String[] T01GO15_A396EmprCod ;
   private int[] T01GO15_A252CliCod ;
   private short[] T01GO15_A4228RatTipArt ;
   private String[] T01GO15_A4229RatSec ;
   private short[] T01GO15_A4230RatAny ;
   private short[] T01GO5_A4228RatTipArt ;
   private String[] T01GO5_A4229RatSec ;
   private short[] T01GO5_A4230RatAny ;
   private String[] T01GO5_A4231RatTipDsc ;
   private boolean[] T01GO5_n4231RatTipDsc ;
   private String[] T01GO5_A396EmprCod ;
   private int[] T01GO5_A252CliCod ;
   private String[] T01GO16_A396EmprCod ;
   private int[] T01GO16_A252CliCod ;
   private short[] T01GO16_A4228RatTipArt ;
   private String[] T01GO16_A4229RatSec ;
   private short[] T01GO16_A4230RatAny ;
   private String[] T01GO17_A396EmprCod ;
   private int[] T01GO17_A252CliCod ;
   private short[] T01GO17_A4228RatTipArt ;
   private String[] T01GO17_A4229RatSec ;
   private short[] T01GO17_A4230RatAny ;
   private short[] T01GO4_A4228RatTipArt ;
   private String[] T01GO4_A4229RatSec ;
   private short[] T01GO4_A4230RatAny ;
   private String[] T01GO4_A4231RatTipDsc ;
   private boolean[] T01GO4_n4231RatTipDsc ;
   private String[] T01GO4_A396EmprCod ;
   private int[] T01GO4_A252CliCod ;
   private String[] T01GO21_A279CliNom ;
   private java.math.BigDecimal[] T01GO23_A4232RatKgmTinA ;
   private java.math.BigDecimal[] T01GO23_A4233RatKgmFacA ;
   private java.math.BigDecimal[] T01GO23_A4234RatCosTinA ;
   private java.math.BigDecimal[] T01GO23_A4235RatImpTinA ;
   private String[] T01GO24_A396EmprCod ;
   private int[] T01GO24_A252CliCod ;
   private short[] T01GO24_A4228RatTipArt ;
   private String[] T01GO24_A4229RatSec ;
   private short[] T01GO24_A4230RatAny ;
   private int[] T01GO25_A252CliCod ;
   private short[] T01GO25_A4228RatTipArt ;
   private String[] T01GO25_A4229RatSec ;
   private short[] T01GO25_A4230RatAny ;
   private byte[] T01GO25_A4238RatMes ;
   private java.math.BigDecimal[] T01GO25_A4239RatKgmTin ;
   private boolean[] T01GO25_n4239RatKgmTin ;
   private java.math.BigDecimal[] T01GO25_A4240RatKgmFac ;
   private boolean[] T01GO25_n4240RatKgmFac ;
   private java.math.BigDecimal[] T01GO25_A4241RatCosTin ;
   private boolean[] T01GO25_n4241RatCosTin ;
   private java.math.BigDecimal[] T01GO25_A4242RatImpTin ;
   private boolean[] T01GO25_n4242RatImpTin ;
   private String[] T01GO25_A396EmprCod ;
   private String[] T01GO26_A396EmprCod ;
   private int[] T01GO26_A252CliCod ;
   private short[] T01GO26_A4228RatTipArt ;
   private String[] T01GO26_A4229RatSec ;
   private short[] T01GO26_A4230RatAny ;
   private byte[] T01GO26_A4238RatMes ;
   private int[] T01GO3_A252CliCod ;
   private short[] T01GO3_A4228RatTipArt ;
   private String[] T01GO3_A4229RatSec ;
   private short[] T01GO3_A4230RatAny ;
   private byte[] T01GO3_A4238RatMes ;
   private java.math.BigDecimal[] T01GO3_A4239RatKgmTin ;
   private boolean[] T01GO3_n4239RatKgmTin ;
   private java.math.BigDecimal[] T01GO3_A4240RatKgmFac ;
   private boolean[] T01GO3_n4240RatKgmFac ;
   private java.math.BigDecimal[] T01GO3_A4241RatCosTin ;
   private boolean[] T01GO3_n4241RatCosTin ;
   private java.math.BigDecimal[] T01GO3_A4242RatImpTin ;
   private boolean[] T01GO3_n4242RatImpTin ;
   private String[] T01GO3_A396EmprCod ;
   private int[] T01GO2_A252CliCod ;
   private short[] T01GO2_A4228RatTipArt ;
   private String[] T01GO2_A4229RatSec ;
   private short[] T01GO2_A4230RatAny ;
   private byte[] T01GO2_A4238RatMes ;
   private java.math.BigDecimal[] T01GO2_A4239RatKgmTin ;
   private boolean[] T01GO2_n4239RatKgmTin ;
   private java.math.BigDecimal[] T01GO2_A4240RatKgmFac ;
   private boolean[] T01GO2_n4240RatKgmFac ;
   private java.math.BigDecimal[] T01GO2_A4241RatCosTin ;
   private boolean[] T01GO2_n4241RatCosTin ;
   private java.math.BigDecimal[] T01GO2_A4242RatImpTin ;
   private boolean[] T01GO2_n4242RatImpTin ;
   private String[] T01GO2_A396EmprCod ;
   private String[] T01GO30_A396EmprCod ;
   private int[] T01GO30_A252CliCod ;
   private short[] T01GO30_A4228RatTipArt ;
   private String[] T01GO30_A4229RatSec ;
   private short[] T01GO30_A4230RatAny ;
   private byte[] T01GO30_A4238RatMes ;
   private String[] T01GO31_A407EmprNom ;
   private boolean[] T01GO31_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tratios__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tratios__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tratios__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tratios__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tratios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01GO2", "SELECT CliCod, RatTipArt, RatSec, RatAny, RatMes, RatKgmTin, RatKgmFac, RatCosTin, RatImpTin, EmprCod FROM TXPLRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? AND RatMes = ?  FOR UPDATE OF RatKgmTin, RatKgmFac, RatCosTin, RatImpTin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO3", "SELECT CliCod, RatTipArt, RatSec, RatAny, RatMes, RatKgmTin, RatKgmFac, RatCosTin, RatImpTin, EmprCod FROM TXPLRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? AND RatMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO4", "SELECT RatTipArt, RatSec, RatAny, RatTipDsc, EmprCod, CliCod FROM TXPCRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ?  FOR UPDATE OF RatTipDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO5", "SELECT RatTipArt, RatSec, RatAny, RatTipDsc, EmprCod, CliCod FROM TXPCRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO9", "SELECT COALESCE( T1.RatKgmTinA, 0) AS RatKgmTinA, COALESCE( T1.RatKgmFacA, 0) AS RatKgmFacA, COALESCE( T1.RatCosTinA, 0) AS RatCosTinA, COALESCE( T1.RatImpTinA, 0) AS RatImpTinA FROM (SELECT SUM(RatKgmTin) AS RatKgmTinA, EmprCod, CliCod, RatTipArt, RatSec, RatAny, SUM(RatKgmFac) AS RatKgmFacA, SUM(RatCosTin) AS RatCosTinA, SUM(RatImpTin) AS RatImpTinA FROM TXPLRATIO GROUP BY EmprCod, CliCod, RatTipArt, RatSec, RatAny ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.RatTipArt = ? AND T1.RatSec = ? AND T1.RatAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO11", "SELECT /*+ FIRST_ROWS(100) */ TM1.RatTipArt, TM1.RatSec, TM1.RatAny, TM1.RatTipDsc, T2.EmprNom, T3.CliNom, TM1.EmprCod, TM1.CliCod, COALESCE( T4.RatKgmTinA, 0) AS RatKgmTinA, COALESCE( T4.RatKgmFacA, 0) AS RatKgmFacA, COALESCE( T4.RatCosTinA, 0) AS RatCosTinA, COALESCE( T4.RatImpTinA, 0) AS RatImpTinA FROM (((TXPCRATIO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT SUM(RatKgmTin) AS RatKgmTinA, EmprCod, CliCod, RatTipArt, RatSec, RatAny, SUM(RatKgmFac) AS RatKgmFacA, SUM(RatCosTin) AS RatCosTinA, SUM(RatImpTin) AS RatImpTinA FROM TXPLRATIO GROUP BY EmprCod, CliCod, RatTipArt, RatSec, RatAny ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.RatTipArt = TM1.RatTipArt AND T4.RatSec = TM1.RatSec AND T4.RatAny = TM1.RatAny) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.RatTipArt = ? and TM1.RatSec = ? and TM1.RatAny = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.RatTipArt, TM1.RatSec, TM1.RatAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO14", "SELECT COALESCE( T1.RatKgmTinA, 0) AS RatKgmTinA, COALESCE( T1.RatKgmFacA, 0) AS RatKgmFacA, COALESCE( T1.RatCosTinA, 0) AS RatCosTinA, COALESCE( T1.RatImpTinA, 0) AS RatImpTinA FROM (SELECT SUM(RatKgmTin) AS RatKgmTinA, EmprCod, CliCod, RatTipArt, RatSec, RatAny, SUM(RatKgmFac) AS RatKgmFacA, SUM(RatCosTin) AS RatCosTinA, SUM(RatImpTin) AS RatImpTinA FROM TXPLRATIO GROUP BY EmprCod, CliCod, RatTipArt, RatSec, RatAny ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.RatTipArt = ? AND T1.RatSec = ? AND T1.RatAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, RatTipArt, RatSec, RatAny FROM TXPCRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, RatTipArt, RatSec, RatAny FROM TXPCRATIO WHERE ( CliCod > ? or CliCod = ? and RatTipArt > ? or RatTipArt = ? and CliCod = ? and RatSec > ? or RatSec = ? and RatTipArt = ? and CliCod = ? and RatAny > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, RatTipArt, RatSec, RatAny) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01GO17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, RatTipArt, RatSec, RatAny FROM TXPCRATIO WHERE ( CliCod < ? or CliCod = ? and RatTipArt < ? or RatTipArt = ? and CliCod = ? and RatSec < ? or RatSec = ? and RatTipArt = ? and CliCod = ? and RatAny < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, RatTipArt DESC, RatSec DESC, RatAny DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01GO18", "INSERT INTO TXPCRATIO(RatTipArt, RatSec, RatAny, RatTipDsc, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCRATIO")
         ,new UpdateCursor("T01GO19", "UPDATE TXPCRATIO SET RatTipDsc=?  WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ?", GX_NOMASK, "TXPCRATIO")
         ,new UpdateCursor("T01GO20", "DELETE FROM TXPCRATIO  WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ?", GX_NOMASK, "TXPCRATIO")
         ,new ForEachCursor("T01GO21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO23", "SELECT COALESCE( T1.RatKgmTinA, 0) AS RatKgmTinA, COALESCE( T1.RatKgmFacA, 0) AS RatKgmFacA, COALESCE( T1.RatCosTinA, 0) AS RatCosTinA, COALESCE( T1.RatImpTinA, 0) AS RatImpTinA FROM (SELECT SUM(RatKgmTin) AS RatKgmTinA, EmprCod, CliCod, RatTipArt, RatSec, RatAny, SUM(RatKgmFac) AS RatKgmFacA, SUM(RatCosTin) AS RatCosTinA, SUM(RatImpTin) AS RatImpTinA FROM TXPLRATIO GROUP BY EmprCod, CliCod, RatTipArt, RatSec, RatAny ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.RatTipArt = ? AND T1.RatSec = ? AND T1.RatAny = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, RatTipArt, RatSec, RatAny FROM TXPCRATIO WHERE EmprCod = ? ORDER BY EmprCod, CliCod, RatTipArt, RatSec, RatAny ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO25", "SELECT CliCod, RatTipArt, RatSec, RatAny, RatMes, RatKgmTin, RatKgmFac, RatCosTin, RatImpTin, EmprCod FROM TXPLRATIO WHERE EmprCod = ? and CliCod = ? and RatTipArt = ? and RatSec = ? and RatAny = ? and RatMes = ? ORDER BY EmprCod, CliCod, RatTipArt, RatSec, RatAny, RatMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO26", "SELECT EmprCod, CliCod, RatTipArt, RatSec, RatAny, RatMes FROM TXPLRATIO WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? AND RatMes = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01GO27", "INSERT INTO TXPLRATIO(CliCod, RatTipArt, RatSec, RatAny, RatMes, RatKgmTin, RatKgmFac, RatCosTin, RatImpTin, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLRATIO")
         ,new UpdateCursor("T01GO28", "UPDATE TXPLRATIO SET RatKgmTin=?, RatKgmFac=?, RatCosTin=?, RatImpTin=?  WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? AND RatMes = ?", GX_NOMASK, "TXPLRATIO")
         ,new UpdateCursor("T01GO29", "DELETE FROM TXPLRATIO  WHERE EmprCod = ? AND CliCod = ? AND RatTipArt = ? AND RatSec = ? AND RatAny = ? AND RatMes = ?", GX_NOMASK, "TXPLRATIO")
         ,new ForEachCursor("T01GO30", "SELECT EmprCod, CliCod, RatTipArt, RatSec, RatAny, RatMes FROM TXPLRATIO WHERE EmprCod = ? and CliCod = ? and RatTipArt = ? and RatSec = ? and RatAny = ? ORDER BY EmprCod, CliCod, RatTipArt, RatSec, RatAny, RatMes ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01GO31", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 25 :
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
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 2);
               stmt.setString(7, (String)parms[6], 2);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 2);
               stmt.setString(7, (String)parms[6], 2);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 30);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 2);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[12], 2);
               }
               stmt.setString(10, (String)parms[13], 3);
               return;
            case 22 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
               stmt.setString(8, (String)parms[11], 2);
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

