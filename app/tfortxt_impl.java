package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfortxt_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3679TipComFor = httpContext.GetPar( "TipComFor") ;
         n3679TipComFor = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A3679TipComFor) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            AV26Acceso = httpContext.GetPar( "Acceso") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Acceso", AV26Acceso);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMENTARIOS FORMULA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A3688ComUltLin = (short)(GXutil.lval( httpContext.GetPar( "ComUltLin"))) ;
      n3688ComUltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV20UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public tfortxt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfortxt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfortxt_impl.class ));
   }

   public tfortxt_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFORTXT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultima Linea Comentarios", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtComUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3688ComUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtComUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3688ComUltLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3688ComUltLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtComUltLin_Jsonclick, 0, "", "", "", "", "", 1, edtComUltLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFORTXT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount518 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_518 = (short)(1) ;
            scanStartTV518( ) ;
            while ( RcdFound518 != 0 )
            {
               init_level_properties518( ) ;
               getByPrimaryKeyTV518( ) ;
               addRowTV518( ) ;
               scanNextTV518( ) ;
            }
            scanEndTV518( ) ;
            nBlankRcdCount518 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3688ComUltLin = A3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         standaloneNotModalTV518( ) ;
         standaloneModalTV518( ) ;
         sMode518 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowTV518( ) ;
            edtavnRcdDeleted_518_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_518_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_518_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_518_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtComForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtTipComFor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOMFOR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipComFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipComFor_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtTipComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOMDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipComDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtComForTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComForTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtComForUsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORUSU_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComForUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForUsu_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtComForFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORFEC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtComForFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForFec_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_518 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalTV518( ) ;
            }
            sendRowTV518( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode518 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3688ComUltLin = B3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount518 = (short)(5) ;
         nRcdExists_518 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartTV518( ) ;
            while ( RcdFound518 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60518( ) ;
               init_level_properties518( ) ;
               standaloneNotModalTV518( ) ;
               getByPrimaryKeyTV518( ) ;
               standaloneModalTV518( ) ;
               addRowTV518( ) ;
               scanNextTV518( ) ;
            }
            scanEndTV518( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode518 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60518( ) ;
      initAllTV518( ) ;
      init_level_properties518( ) ;
      B3688ComUltLin = A3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      nRcdExists_518 = (short)(0) ;
      nIsMod_518 = (short)(0) ;
      nRcdDeleted_518 = (short)(0) ;
      nBlankRcdCount518 = (short)(nBlankRcdUsr518+nBlankRcdCount518) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount518 > 0 )
      {
         standaloneNotModalTV518( ) ;
         standaloneModalTV518( ) ;
         addRowTV518( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtComForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount518 = (short)(nBlankRcdCount518-1) ;
      }
      Gx_mode = sMode518 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3688ComUltLin = B3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFORTXT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFORTXT.htm");
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
      e11TV2 ();
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
            Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
            Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
            Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3688ComUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z3688ComUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3688ComUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O3688ComUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV26Acceso = httpContext.cgiGet( "vACCESO") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            n494ForSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            n482ForColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n483ForColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n831TipColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A3688ComUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtComUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3688ComUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = httpContext.GetPar( "ForSer") ;
               n494ForSer = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               n482ForColNom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               n483ForColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               n831TipColCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
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
                        e11TV2 ();
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
            initAllTV47( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_518_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_518_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributesTV47( ) ;
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

   public void confirm_TV0( )
   {
      beforeValidateTV47( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsTV47( ) ;
         }
         else
         {
            checkExtendedTableTV47( ) ;
            if ( AnyError == 0 )
            {
               zmTV47( 15) ;
               zmTV47( 16) ;
               zmTV47( 17) ;
            }
            closeExtendedTableCursorsTV47( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_TV518( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode47 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesTV0( ) ;
      }
   }

   public void confirm_TV518( )
   {
      s3688ComUltLin = O3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTV518( ) ;
         if ( ( nRcdExists_518 != 0 ) || ( nIsMod_518 != 0 ) )
         {
            getKeyTV518( ) ;
            if ( ( nRcdExists_518 == 0 ) && ( nRcdDeleted_518 == 0 ) )
            {
               if ( RcdFound518 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateTV518( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableTV518( ) ;
                     if ( AnyError == 0 )
                     {
                        zmTV518( 19) ;
                     }
                     closeExtendedTableCursorsTV518( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3688ComUltLin = A3688ComUltLin ;
                     n3688ComUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtComForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound518 != 0 )
               {
                  if ( nRcdDeleted_518 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyTV518( ) ;
                     loadTV518( ) ;
                     beforeValidateTV518( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsTV518( ) ;
                        O3688ComUltLin = A3688ComUltLin ;
                        n3688ComUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_518 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateTV518( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableTV518( ) ;
                           if ( AnyError == 0 )
                           {
                              zmTV518( 19) ;
                           }
                           closeExtendedTableCursorsTV518( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3688ComUltLin = A3688ComUltLin ;
                           n3688ComUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_518 == 0 )
                  {
                     GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtComForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_518_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtComForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipComFor_Internalname, GXutil.rtrim( A3679TipComFor)) ;
         httpContext.changePostValue( edtTipComDsc_Internalname, GXutil.rtrim( A3680TipComDsc)) ;
         httpContext.changePostValue( edtComForTxt_Internalname, GXutil.rtrim( A3690ComForTxt)) ;
         httpContext.changePostValue( edtComForUsu_Internalname, GXutil.rtrim( A3691ComForUsu)) ;
         httpContext.changePostValue( edtComForFec_Internalname, localUtil.format(A3692ComForFec, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z3689ComForLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3691ComForUsu_"+sGXsfl_60_idx, GXutil.rtrim( Z3691ComForUsu)) ;
         httpContext.changePostValue( "ZT_"+"Z3692ComForFec_"+sGXsfl_60_idx, localUtil.dtoc( Z3692ComForFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3690ComForTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z3690ComForTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z3679TipComFor_"+sGXsfl_60_idx, GXutil.rtrim( Z3679TipComFor)) ;
         httpContext.changePostValue( "T3690ComForTxt_"+sGXsfl_60_idx, GXutil.rtrim( O3690ComForTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_518 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_518_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_518_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOMFOR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComFor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOMDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORUSU_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForUsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORFEC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3688ComUltLin = s3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionTV0( )
   {
   }

   public void e11TV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit0", AV16Lit0);
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit1", AV17Lit1);
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit2", AV18Lit2);
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit3", AV19Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1289_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV28Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV30Pgmname, (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit19", AV28Lit19);
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tfortxt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21LitFe", AV21LitFe);
      AV22Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfortxt_impl.this.AV24EmprCod = GXv_char2[0] ;
      tfortxt_impl.this.AV25EmprNom = GXv_char3[0] ;
      tfortxt_impl.this.AV20UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV20UsurCod", AV20UsurCod);
   }

   public void zmTV47( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3688ComUltLin = T00TV6_A3688ComUltLin[0] ;
         }
         else
         {
            Z3688ComUltLin = A3688ComUltLin ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z3688ComUltLin = A3688ComUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtComUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComUltLin_Enabled), 5, 0), true);
      AV30Pgmname = "TFORTXT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Pgmname", AV30Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtComUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComUltLin_Enabled), 5, 0), true);
      /* Using cursor T00TV7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TV7_A407EmprNom[0] ;
      n407EmprNom = T00TV7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00TV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
      /* Using cursor T00TV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
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

   public void loadTV47( )
   {
      /* Using cursor T00TV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A3688ComUltLin = T00TV10_A3688ComUltLin[0] ;
         n3688ComUltLin = T00TV10_n3688ComUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         A407EmprNom = T00TV10_A407EmprNom[0] ;
         n407EmprNom = T00TV10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmTV47( -14) ;
      }
      pr_default.close(8);
      onLoadActionsTV47( ) ;
   }

   public void onLoadActionsTV47( )
   {
   }

   public void checkExtendedTableTV47( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsTV47( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyTV47( )
   {
      /* Using cursor T00TV11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00TV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00TV6_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV6_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV6_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T00TV6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV6_A252CliCod[0] == A252CliCod ) && ( T00TV6_A831TipColCod[0] == A831TipColCod ) )
      {
         zmTV47( 14) ;
         RcdFound47 = (short)(1) ;
         A3688ComUltLin = T00TV6_A3688ComUltLin[0] ;
         n3688ComUltLin = T00TV6_n3688ComUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         O3688ComUltLin = A3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadTV47( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKeyTV47( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKeyTV47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyTV47( ) ;
      if ( RcdFound47 == 0 )
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
      RcdFound47 = (short)(0) ;
      /* Using cursor T00TV12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00TV12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TV12_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV12_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV12_A483ForColNum[0] == A483ForColNum ) && ( T00TV12_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00TV12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TV12_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV12_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV12_A483ForColNum[0] == A483ForColNum ) && ( T00TV12_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T00TV13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00TV13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TV13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV13_A483ForColNum[0] == A483ForColNum ) && ( T00TV13_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00TV13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00TV13_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV13_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV13_A483ForColNum[0] == A483ForColNum ) && ( T00TV13_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyTV47( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3688ComUltLin = O3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         insertTV47( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound47 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3688ComUltLin = O3688ComUltLin ;
               n3688ComUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3688ComUltLin = O3688ComUltLin ;
               n3688ComUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
               updateTV47( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3688ComUltLin = O3688ComUltLin ;
               n3688ComUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
               insertTV47( ) ;
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
                  A3688ComUltLin = O3688ComUltLin ;
                  n3688ComUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
                  insertTV47( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3688ComUltLin = O3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
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
      getKeyTV47( ) ;
      if ( RcdFound47 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tfortxt");
   }

   public void insert_check( )
   {
      confirm_TV0( ) ;
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
      if ( RcdFound47 == 0 )
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
      scanStartTV47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTV47( ) ;
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
      if ( RcdFound47 == 0 )
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
      if ( RcdFound47 == 0 )
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
      scanStartTV47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNextTV47( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndTV47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyTV47( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TV5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z3688ComUltLin != T00TV5_A3688ComUltLin[0] ) )
         {
            if ( Z3688ComUltLin != T00TV5_A3688ComUltLin[0] )
            {
               GXutil.writeLogln("tfortxt:[seudo value changed for attri]"+"ComUltLin");
               GXutil.writeLogRaw("Old: ",Z3688ComUltLin);
               GXutil.writeLogRaw("Current: ",T00TV5_A3688ComUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTV47( )
   {
      beforeValidateTV47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTV47( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTV47( 0) ;
         checkOptimisticConcurrencyTV47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTV47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTV47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TV14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevelTV47( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionTV0( ) ;
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
            loadTV47( ) ;
         }
         endLevelTV47( ) ;
      }
      closeExtendedTableCursorsTV47( ) ;
   }

   public void updateTV47( )
   {
      beforeValidateTV47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTV47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTV47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTV47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateTV47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TV15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateTV47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelTV47( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionTV0( ) ;
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
         endLevelTV47( ) ;
      }
      closeExtendedTableCursorsTV47( ) ;
   }

   public void deferredUpdateTV47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTV47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTV47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTV47( ) ;
         afterConfirmTV47( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTV47( ) ;
            if ( AnyError == 0 )
            {
               A3688ComUltLin = O3688ComUltLin ;
               n3688ComUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
               scanStartTV518( ) ;
               while ( RcdFound518 != 0 )
               {
                  getByPrimaryKeyTV518( ) ;
                  deleteTV518( ) ;
                  scanNextTV518( ) ;
                  O3688ComUltLin = A3688ComUltLin ;
                  n3688ComUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
               }
               scanEndTV518( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TV16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound47 == 0 )
                        {
                           initAllTV47( ) ;
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
                        resetCaptionTV0( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTV47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTV47( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00TV17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00TV18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00TV19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00TV20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00TV21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCACP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00TV22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00TV23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00TV24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00TV25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00TV26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00TV27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00TV28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00TV29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00TV30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevelTV518( )
   {
      s3688ComUltLin = O3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowTV518( ) ;
         if ( ( nRcdExists_518 != 0 ) || ( nIsMod_518 != 0 ) )
         {
            standaloneNotModalTV518( ) ;
            getKeyTV518( ) ;
            if ( ( nRcdExists_518 == 0 ) && ( nRcdDeleted_518 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertTV518( ) ;
            }
            else
            {
               if ( RcdFound518 != 0 )
               {
                  if ( ( nRcdDeleted_518 != 0 ) && ( nRcdExists_518 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteTV518( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_518 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateTV518( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_518 == 0 )
                  {
                     GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtComForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3688ComUltLin = A3688ComUltLin ;
            n3688ComUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_518_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtComForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipComFor_Internalname, GXutil.rtrim( A3679TipComFor)) ;
         httpContext.changePostValue( edtTipComDsc_Internalname, GXutil.rtrim( A3680TipComDsc)) ;
         httpContext.changePostValue( edtComForTxt_Internalname, GXutil.rtrim( A3690ComForTxt)) ;
         httpContext.changePostValue( edtComForUsu_Internalname, GXutil.rtrim( A3691ComForUsu)) ;
         httpContext.changePostValue( edtComForFec_Internalname, localUtil.format(A3692ComForFec, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z3689ComForLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3691ComForUsu_"+sGXsfl_60_idx, GXutil.rtrim( Z3691ComForUsu)) ;
         httpContext.changePostValue( "ZT_"+"Z3692ComForFec_"+sGXsfl_60_idx, localUtil.dtoc( Z3692ComForFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3690ComForTxt_"+sGXsfl_60_idx, GXutil.rtrim( Z3690ComForTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z3679TipComFor_"+sGXsfl_60_idx, GXutil.rtrim( Z3679TipComFor)) ;
         httpContext.changePostValue( "T3690ComForTxt_"+sGXsfl_60_idx, GXutil.rtrim( O3690ComForTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_518_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_518 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_518_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_518_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOMFOR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComFor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPCOMDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORUSU_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForUsu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COMFORFEC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllTV518( ) ;
      if ( AnyError != 0 )
      {
         O3688ComUltLin = s3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      }
      nRcdExists_518 = (short)(0) ;
      nIsMod_518 = (short)(0) ;
      nRcdDeleted_518 = (short)(0) ;
   }

   public void processLevelTV47( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevelTV518( ) ;
      if ( AnyError != 0 )
      {
         O3688ComUltLin = s3688ComUltLin ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00TV31 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n3688ComUltLin), Short.valueOf(A3688ComUltLin), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
   }

   public void endLevelTV47( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteTV47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfortxt");
         if ( AnyError == 0 )
         {
            confirmValuesTV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfortxt");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartTV47( )
   {
      /* Scan By routine */
      /* Using cursor T00TV32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTV47( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
   }

   public void scanEndTV47( )
   {
      pr_default.close(30);
   }

   public void afterConfirmTV47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTV47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTV47( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTV47( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTV47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTV47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTV47( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtComUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComUltLin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmTV518( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3691ComForUsu = T00TV3_A3691ComForUsu[0] ;
            Z3692ComForFec = T00TV3_A3692ComForFec[0] ;
            Z3690ComForTxt = T00TV3_A3690ComForTxt[0] ;
            Z3679TipComFor = T00TV3_A3679TipComFor[0] ;
         }
         else
         {
            Z3691ComForUsu = A3691ComForUsu ;
            Z3692ComForFec = A3692ComForFec ;
            Z3690ComForTxt = A3690ComForTxt ;
            Z3679TipComFor = A3679TipComFor ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z3689ComForLin = A3689ComForLin ;
         Z3691ComForUsu = A3691ComForUsu ;
         Z3692ComForFec = A3692ComForFec ;
         Z3690ComForTxt = A3690ComForTxt ;
         Z396EmprCod = A396EmprCod ;
         Z3679TipComFor = A3679TipComFor ;
         Z252CliCod = A252CliCod ;
         Z3680TipComDsc = A3680TipComDsc ;
      }
   }

   public void standaloneNotModalTV518( )
   {
      edtComForUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForUsu_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForFec_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComUltLin_Enabled), 5, 0), true);
      edtComUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModalTV518( )
   {
      if ( isIns( )  )
      {
         A3688ComUltLin = (short)(O3688ComUltLin+1) ;
         n3688ComUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3689ComForLin = A3688ComUltLin ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3679TipComFor)==0) && ( Gx_BScreen == 0 ) )
      {
         A3679TipComFor = E3679TipComFor ;
         n3679TipComFor = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3691ComForUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A3691ComForUsu = AV20UsurCod ;
         n3691ComForUsu = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3692ComForFec)) && ( Gx_BScreen == 0 ) )
      {
         A3692ComForFec = GXutil.today( ) ;
         n3692ComForFec = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtComForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtComForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtComForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtComForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T00TV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor});
         A3680TipComDsc = T00TV4_A3680TipComDsc[0] ;
         n3680TipComDsc = T00TV4_n3680TipComDsc[0] ;
         pr_default.close(2);
      }
   }

   public void loadTV518( )
   {
      /* Using cursor T00TV33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound518 = (short)(1) ;
         A3691ComForUsu = T00TV33_A3691ComForUsu[0] ;
         n3691ComForUsu = T00TV33_n3691ComForUsu[0] ;
         A3692ComForFec = T00TV33_A3692ComForFec[0] ;
         n3692ComForFec = T00TV33_n3692ComForFec[0] ;
         A3680TipComDsc = T00TV33_A3680TipComDsc[0] ;
         n3680TipComDsc = T00TV33_n3680TipComDsc[0] ;
         A3690ComForTxt = T00TV33_A3690ComForTxt[0] ;
         n3690ComForTxt = T00TV33_n3690ComForTxt[0] ;
         A3679TipComFor = T00TV33_A3679TipComFor[0] ;
         n3679TipComFor = T00TV33_n3679TipComFor[0] ;
         zmTV518( -18) ;
      }
      pr_default.close(31);
      onLoadActionsTV518( ) ;
   }

   public void onLoadActionsTV518( )
   {
   }

   public void checkExtendedTableTV518( )
   {
      nIsDirty_518 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalTV518( ) ;
      /* Using cursor T00TV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPCOMFOR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMFOR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipComFor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3680TipComDsc = T00TV4_A3680TipComDsc[0] ;
      n3680TipComDsc = T00TV4_n3680TipComDsc[0] ;
      pr_default.close(2);
      if ( ( GXutil.strcmp(A3691ComForUsu, AV20UsurCod) != 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) && isUpd( )  && true /* Level */ )
      {
         GXCCtl = "COMFORTXT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizador ERRADO! Impossível Alterar.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV26Acceso, httpContext.getMessage( "a", "")) == 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
      {
         GXCCtl = "COMFORTXT_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem de Serviço Anulada!", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A3688ComUltLin != A3689ComForLin ) && isUpd( )  && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
      {
         GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO! Impossivel Alterar.", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsTV518( )
   {
      pr_default.close(2);
   }

   public void enableDisableTV518( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A3679TipComFor )
   {
      /* Using cursor T00TV34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor});
      if ( (pr_default.getStatus(32) == 101) )
      {
         GXCCtl = "TIPCOMFOR_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMFOR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipComFor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3680TipComDsc = T00TV34_A3680TipComDsc[0] ;
      n3680TipComDsc = T00TV34_n3680TipComDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3680TipComDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKeyTV518( )
   {
      /* Using cursor T00TV35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound518 = (short)(1) ;
      }
      else
      {
         RcdFound518 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKeyTV518( )
   {
      /* Using cursor T00TV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00TV3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T00TV3_A482ForColNom[0], A482ForColNom) == 0 ) && ( T00TV3_A483ForColNum[0] == A483ForColNum ) && ( T00TV3_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T00TV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00TV3_A252CliCod[0] == A252CliCod ) )
      {
         zmTV518( 18) ;
         RcdFound518 = (short)(1) ;
         initializeNonKeyTV518( ) ;
         A3689ComForLin = T00TV3_A3689ComForLin[0] ;
         A3691ComForUsu = T00TV3_A3691ComForUsu[0] ;
         n3691ComForUsu = T00TV3_n3691ComForUsu[0] ;
         A3692ComForFec = T00TV3_A3692ComForFec[0] ;
         n3692ComForFec = T00TV3_n3692ComForFec[0] ;
         A3690ComForTxt = T00TV3_A3690ComForTxt[0] ;
         n3690ComForTxt = T00TV3_n3690ComForTxt[0] ;
         A3679TipComFor = T00TV3_A3679TipComFor[0] ;
         n3679TipComFor = T00TV3_n3679TipComFor[0] ;
         O3690ComForTxt = A3690ComForTxt ;
         n3690ComForTxt = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z3689ComForLin = A3689ComForLin ;
         sMode518 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTV518( ) ;
         loadTV518( ) ;
         Gx_mode = sMode518 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound518 = (short)(0) ;
         initializeNonKeyTV518( ) ;
         sMode518 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalTV518( ) ;
         Gx_mode = sMode518 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesTV518( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyTV518( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00TV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3691ComForUsu, T00TV2_A3691ComForUsu[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3692ComForFec), GXutil.resetTime(T00TV2_A3692ComForFec[0])) ) || ( GXutil.strcmp(Z3690ComForTxt, T00TV2_A3690ComForTxt[0]) != 0 ) || ( GXutil.strcmp(Z3679TipComFor, T00TV2_A3679TipComFor[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3691ComForUsu, T00TV2_A3691ComForUsu[0]) != 0 )
            {
               GXutil.writeLogln("tfortxt:[seudo value changed for attri]"+"ComForUsu");
               GXutil.writeLogRaw("Old: ",Z3691ComForUsu);
               GXutil.writeLogRaw("Current: ",T00TV2_A3691ComForUsu[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3692ComForFec), GXutil.resetTime(T00TV2_A3692ComForFec[0])) ) )
            {
               GXutil.writeLogln("tfortxt:[seudo value changed for attri]"+"ComForFec");
               GXutil.writeLogRaw("Old: ",Z3692ComForFec);
               GXutil.writeLogRaw("Current: ",T00TV2_A3692ComForFec[0]);
            }
            if ( GXutil.strcmp(Z3690ComForTxt, T00TV2_A3690ComForTxt[0]) != 0 )
            {
               GXutil.writeLogln("tfortxt:[seudo value changed for attri]"+"ComForTxt");
               GXutil.writeLogRaw("Old: ",Z3690ComForTxt);
               GXutil.writeLogRaw("Current: ",T00TV2_A3690ComForTxt[0]);
            }
            if ( GXutil.strcmp(Z3679TipComFor, T00TV2_A3679TipComFor[0]) != 0 )
            {
               GXutil.writeLogln("tfortxt:[seudo value changed for attri]"+"TipComFor");
               GXutil.writeLogRaw("Old: ",Z3679TipComFor);
               GXutil.writeLogRaw("Current: ",T00TV2_A3679TipComFor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFORCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertTV518( )
   {
      beforeValidateTV518( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTV518( ) ;
      }
      if ( AnyError == 0 )
      {
         zmTV518( 0) ;
         checkOptimisticConcurrencyTV518( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmTV518( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertTV518( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00TV36 */
                  pr_default.execute(34, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin), Boolean.valueOf(n3691ComForUsu), A3691ComForUsu, Boolean.valueOf(n3692ComForFec), A3692ComForFec, Boolean.valueOf(n3690ComForTxt), A3690ComForTxt, A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORCOM");
                  if ( (pr_default.getStatus(34) == 1) )
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
                        E3679TipComFor = A3679TipComFor ;
                        n3679TipComFor = false ;
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
            loadTV518( ) ;
         }
         endLevelTV518( ) ;
      }
      closeExtendedTableCursorsTV518( ) ;
   }

   public void updateTV518( )
   {
      beforeValidateTV518( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableTV518( ) ;
      }
      if ( ( nIsMod_518 != 0 ) || ( nIsDirty_518 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyTV518( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmTV518( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateTV518( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00TV37 */
                     pr_default.execute(35, new Object[] {Boolean.valueOf(n3691ComForUsu), A3691ComForUsu, Boolean.valueOf(n3692ComForFec), A3692ComForFec, Boolean.valueOf(n3690ComForTxt), A3690ComForTxt, Boolean.valueOf(n3679TipComFor), A3679TipComFor, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORCOM");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFORCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateTV518( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyTV518( ) ;
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
            endLevelTV518( ) ;
         }
      }
      closeExtendedTableCursorsTV518( ) ;
   }

   public void deferredUpdateTV518( )
   {
   }

   public void deleteTV518( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateTV518( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyTV518( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsTV518( ) ;
         afterConfirmTV518( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteTV518( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00TV38 */
               pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), Short.valueOf(A3689ComForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORCOM");
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
      sMode518 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelTV518( ) ;
      Gx_mode = sMode518 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsTV518( )
   {
      standaloneModalTV518( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV26Acceso, httpContext.getMessage( "a", "")) == 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
         {
            GXCCtl = "COMFORTXT_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem de Serviço Anulada!", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtComForTxt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( GXutil.strcmp(A3691ComForUsu, AV20UsurCod) != 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) && isUpd( )  && true /* Level */ )
         {
            GXCCtl = "COMFORTXT_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizador ERRADO! Impossível Alterar.", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtComForTxt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( A3688ComUltLin != A3689ComForLin ) && isUpd( )  && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
         {
            GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO! Impossivel Alterar.", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtComForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T00TV39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor});
         A3680TipComDsc = T00TV39_A3680TipComDsc[0] ;
         n3680TipComDsc = T00TV39_n3680TipComDsc[0] ;
         pr_default.close(37);
         if ( ( GXutil.strcmp(A3691ComForUsu, AV20UsurCod) != 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) && isDlt( )  && true /* Level */ )
         {
            GXCCtl = "COMFORTXT_" + sGXsfl_60_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizador ERRADO! Impossível Eliminar.", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtComForTxt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
   }

   public void endLevelTV518( )
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

   public void scanStartTV518( )
   {
      /* Scan By routine */
      /* Using cursor T00TV40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound518 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound518 = (short)(1) ;
         A3689ComForLin = T00TV40_A3689ComForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextTV518( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound518 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound518 = (short)(1) ;
         A3689ComForLin = T00TV40_A3689ComForLin[0] ;
      }
   }

   public void scanEndTV518( )
   {
      pr_default.close(38);
   }

   public void afterConfirmTV518( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertTV518( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateTV518( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteTV518( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteTV518( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateTV518( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesTV518( )
   {
      edtComForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtTipComFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipComFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipComFor_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtTipComDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipComDsc_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForTxt_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForUsu_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForFec_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashesTV518( )
   {
   }

   public void send_integrity_lvl_hashesTV47( )
   {
   }

   public void subsflControlProps_60518( )
   {
      edtavnRcdDeleted_518_Internalname = "vNRCDDELETED_518_"+sGXsfl_60_idx ;
      edtComForLin_Internalname = "COMFORLIN_"+sGXsfl_60_idx ;
      edtTipComFor_Internalname = "TIPCOMFOR_"+sGXsfl_60_idx ;
      edtTipComDsc_Internalname = "TIPCOMDSC_"+sGXsfl_60_idx ;
      edtComForTxt_Internalname = "COMFORTXT_"+sGXsfl_60_idx ;
      edtComForUsu_Internalname = "COMFORUSU_"+sGXsfl_60_idx ;
      edtComForFec_Internalname = "COMFORFEC_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60518( )
   {
      edtavnRcdDeleted_518_Internalname = "vNRCDDELETED_518_"+sGXsfl_60_fel_idx ;
      edtComForLin_Internalname = "COMFORLIN_"+sGXsfl_60_fel_idx ;
      edtTipComFor_Internalname = "TIPCOMFOR_"+sGXsfl_60_fel_idx ;
      edtTipComDsc_Internalname = "TIPCOMDSC_"+sGXsfl_60_fel_idx ;
      edtComForTxt_Internalname = "COMFORTXT_"+sGXsfl_60_fel_idx ;
      edtComForUsu_Internalname = "COMFORUSU_"+sGXsfl_60_fel_idx ;
      edtComForFec_Internalname = "COMFORFEC_"+sGXsfl_60_fel_idx ;
   }

   public void addRowTV518( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60518( ) ;
      sendRowTV518( ) ;
   }

   public void sendRowTV518( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_518_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_518_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_518_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_518), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_518), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_518_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_518_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_518_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3689ComForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtComForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_518_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipComFor_Internalname,GXutil.rtrim( A3679TipComFor),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipComFor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipComFor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipComDsc_Internalname,GXutil.rtrim( A3680TipComDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipComDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipComDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_518_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComForTxt_Internalname,GXutil.rtrim( A3690ComForTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComForTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtComForTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComForUsu_Internalname,GXutil.rtrim( A3691ComForUsu),GXutil.rtrim( localUtil.format( A3691ComForUsu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComForUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtComForUsu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtComForFec_Internalname,localUtil.format(A3692ComForFec, "99/99/99"),localUtil.format( A3692ComForFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtComForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtComForFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesTV518( ) ;
      GXCCtl = "Z3689ComForLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3689ComForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3691ComForUsu_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3691ComForUsu));
      GXCCtl = "Z3692ComForFec_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3692ComForFec, 0, "/"));
      GXCCtl = "Z3690ComForTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3690ComForTxt));
      GXCCtl = "Z3679TipComFor_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3679TipComFor));
      GXCCtl = "O3690ComForTxt_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O3690ComForTxt));
      GXCCtl = "nRcdDeleted_518_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_518_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_518_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_518, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vACCESO_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV26Acceso));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_518_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_518_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMFORLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOMFOR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComFor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOMDSC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMFORTXT_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMFORUSU_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForUsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMFORFEC_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtComForFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowTV518( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60518( ) ;
      edtavnRcdDeleted_518_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_518_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtComForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipComFor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOMFOR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPCOMDSC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtComForTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORTXT_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtComForUsu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORUSU_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtComForFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COMFORFEC_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_518_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_518_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_518");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_518_Internalname ;
         wbErr = true ;
         nRcdDeleted_518 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_518 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_518_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtComForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtComForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COMFORLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForLin_Internalname ;
         wbErr = true ;
         A3689ComForLin = (short)(0) ;
      }
      else
      {
         A3689ComForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtComForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3679TipComFor = httpContext.cgiGet( edtTipComFor_Internalname) ;
      n3679TipComFor = false ;
      A3680TipComDsc = httpContext.cgiGet( edtTipComDsc_Internalname) ;
      n3680TipComDsc = false ;
      A3690ComForTxt = httpContext.cgiGet( edtComForTxt_Internalname) ;
      n3690ComForTxt = false ;
      A3691ComForUsu = GXutil.upper( httpContext.cgiGet( edtComForUsu_Internalname)) ;
      n3691ComForUsu = false ;
      A3692ComForFec = localUtil.ctod( httpContext.cgiGet( edtComForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      n3692ComForFec = false ;
      GXCCtl = "Z3689ComForLin_" + sGXsfl_60_idx ;
      Z3689ComForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3691ComForUsu_" + sGXsfl_60_idx ;
      Z3691ComForUsu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3692ComForFec_" + sGXsfl_60_idx ;
      Z3692ComForFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3690ComForTxt_" + sGXsfl_60_idx ;
      Z3690ComForTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3679TipComFor_" + sGXsfl_60_idx ;
      Z3679TipComFor = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3690ComForTxt_" + sGXsfl_60_idx ;
      O3690ComForTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_518_" + sGXsfl_60_idx ;
      nRcdDeleted_518 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_518_" + sGXsfl_60_idx ;
      nRcdExists_518 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_518_" + sGXsfl_60_idx ;
      nIsMod_518 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtComForFec_Enabled = edtComForFec_Enabled ;
      defedtComForUsu_Enabled = edtComForUsu_Enabled ;
      defedtComForLin_Enabled = edtComForLin_Enabled ;
   }

   public void confirmValuesTV0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60518( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60518( ) ;
         httpContext.changePostValue( "Z3689ComForLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3689ComForLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3689ComForLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3691ComForUsu_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3691ComForUsu_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3691ComForUsu_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3692ComForFec_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3692ComForFec_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3692ComForFec_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3690ComForTxt_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3690ComForTxt_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3690ComForTxt_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z3679TipComFor_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z3679TipComFor_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3679TipComFor_"+sGXsfl_60_idx) ;
      }
      httpContext.changePostValue( "O3690ComForTxt", httpContext.cgiGet( "T3690ComForTxt")) ;
      httpContext.deletePostValue( "T3690ComForTxt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tfortxt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV26Acceso))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Acceso"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3688ComUltLin", GXutil.ltrim( localUtil.ntoc( Z3688ComUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3688ComUltLin", GXutil.ltrim( localUtil.ntoc( O3688ComUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV30Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV20UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vACCESO", GXutil.rtrim( AV26Acceso));
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
      return formatLink("app.tfortxt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV26Acceso))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Acceso"})  ;
   }

   public String getPgmname( )
   {
      return "TFORTXT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMENTARIOS FORMULA", "") ;
   }

   public void initializeNonKeyTV47( )
   {
      A3688ComUltLin = (short)(0) ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      O3688ComUltLin = A3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      Z3688ComUltLin = (short)(0) ;
   }

   public void initAllTV47( )
   {
      initializeNonKeyTV47( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyTV518( )
   {
      A3680TipComDsc = "" ;
      n3680TipComDsc = false ;
      A3690ComForTxt = "" ;
      n3690ComForTxt = false ;
      A3679TipComFor = E3679TipComFor ;
      n3679TipComFor = false ;
      A3691ComForUsu = AV20UsurCod ;
      n3691ComForUsu = false ;
      A3692ComForFec = GXutil.today( ) ;
      n3692ComForFec = false ;
      O3690ComForTxt = A3690ComForTxt ;
      n3690ComForTxt = false ;
      Z3691ComForUsu = "" ;
      Z3692ComForFec = GXutil.nullDate() ;
      Z3690ComForTxt = "" ;
      Z3679TipComFor = "" ;
   }

   public void initAllTV518( )
   {
      A3689ComForLin = (short)(0) ;
      initializeNonKeyTV518( ) ;
   }

   public void standaloneModalInsertTV518( )
   {
      A3688ComUltLin = i3688ComUltLin ;
      n3688ComUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3688ComUltLin), 4, 0));
      A3679TipComFor = i3679TipComFor ;
      n3679TipComFor = false ;
      A3691ComForUsu = i3691ComForUsu ;
      n3691ComForUsu = false ;
      A3692ComForFec = i3692ComForFec ;
      n3692ComForFec = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525919", true, true);
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
      httpContext.AddJavascriptSource("tfortxt.js", "?20268241525919", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties518( )
   {
      edtComForFec_Enabled = defedtComForFec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForFec_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForUsu_Enabled = defedtComForUsu_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForUsu_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtComForLin_Enabled = defedtComForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtComForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtComForLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_518, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_518_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3689ComForLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3679TipComFor));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComFor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3680TipComDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3690ComForTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComForTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3691ComForUsu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComForUsu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A3692ComForFec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtComForFec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtForSer_Internalname = "FORSER" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtComUltLin_Internalname = "COMULTLIN" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_518_Internalname = "vNRCDDELETED_518" ;
      edtComForLin_Internalname = "COMFORLIN" ;
      edtTipComFor_Internalname = "TIPCOMFOR" ;
      edtTipComDsc_Internalname = "TIPCOMDSC" ;
      edtComForTxt_Internalname = "COMFORTXT" ;
      edtComForUsu_Internalname = "COMFORUSU" ;
      edtComForFec_Internalname = "COMFORFEC" ;
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
      Form.setCaption( httpContext.getMessage( "COMENTARIOS FORMULA", "") );
      edtComForFec_Jsonclick = "" ;
      edtComForUsu_Jsonclick = "" ;
      edtComForTxt_Jsonclick = "" ;
      edtTipComDsc_Jsonclick = "" ;
      edtTipComFor_Jsonclick = "" ;
      edtComForLin_Jsonclick = "" ;
      edtavnRcdDeleted_518_Jsonclick = "" ;
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
      edtComForFec_Enabled = 0 ;
      edtComForUsu_Enabled = 0 ;
      edtComForTxt_Enabled = 1 ;
      edtTipComDsc_Enabled = 0 ;
      edtTipComFor_Enabled = 1 ;
      edtComForLin_Enabled = 1 ;
      edtavnRcdDeleted_518_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtComUltLin_Jsonclick = "" ;
      edtComUltLin_Backcolor = (int)(0xFFFFFF) ;
      edtComUltLin_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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
      subsflControlProps_60518( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalTV518( ) ;
         standaloneModalTV518( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowTV518( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60518( ) ;
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
      /* Using cursor T00TV41 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00TV41_A407EmprNom[0] ;
      n407EmprNom = T00TV41_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(39);
      /* Using cursor T00TV42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(40);
      /* Using cursor T00TV43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(41);
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

   public void valid_Tipcolcod( )
   {
      n3688ComUltLin = false ;
      n252CliCod = false ;
      n494ForSer = false ;
      n482ForColNom = false ;
      n483ForColNum = false ;
      n831TipColCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3688ComUltLin", GXutil.ltrim( localUtil.ntoc( A3688ComUltLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3688ComUltLin", GXutil.ltrim( localUtil.ntoc( Z3688ComUltLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "O3688ComUltLin", GXutil.ltrim( localUtil.ntoc( O3688ComUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tipcomfor( )
   {
      n3679TipComFor = false ;
      n3680TipComDsc = false ;
      /* Using cursor T00TV39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n3679TipComFor), A3679TipComFor});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMFOR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOMFOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipComFor_Internalname ;
      }
      A3680TipComDsc = T00TV39_A3680TipComDsc[0] ;
      n3680TipComDsc = T00TV39_n3680TipComDsc[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3680TipComDsc", GXutil.rtrim( A3680TipComDsc));
   }

   public void valid_Comfortxt( )
   {
      n3691ComForUsu = false ;
      n3690ComForTxt = false ;
      n3688ComUltLin = false ;
      if ( ( GXutil.strcmp(A3691ComForUsu, AV20UsurCod) != 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) && isUpd( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizador ERRADO! Impossível Alterar.", ""), 1, "COMFORTXT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
      }
      if ( ( GXutil.strcmp(A3691ComForUsu, AV20UsurCod) != 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) && isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizador ERRADO! Impossível Eliminar.", ""), 1, "COMFORTXT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
      }
      if ( ( A3688ComUltLin != A3689ComForLin ) && isUpd( )  && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERRO! Impossivel Alterar.", ""), 1, "COMFORTXT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
      }
      if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( GXutil.strcmp(AV26Acceso, httpContext.getMessage( "a", "")) == 0 ) && ( GXutil.strcmp(A3690ComForTxt, O3690ComForTxt) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ordem de Serviço Anulada!", ""), 1, "COMFORTXT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtComForTxt_Internalname ;
      }
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV26Acceso',fld:'vACCESO',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3688ComUltLin',fld:'COMULTLIN',pic:'ZZZ9'},{av:'AV20UsurCod',fld:'vUSURCOD',pic:''},{av:'AV26Acceso',fld:'vACCESO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A3688ComUltLin',fld:'COMULTLIN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z3688ComUltLin'},{av:'Z407EmprNom'},{av:'O3688ComUltLin'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COMULTLIN","{handler:'valid_Comultlin',iparms:[]");
      setEventMetadata("VALID_COMULTLIN",",oparms:[]}");
      setEventMetadata("VALID_COMFORLIN","{handler:'valid_Comforlin',iparms:[]");
      setEventMetadata("VALID_COMFORLIN",",oparms:[]}");
      setEventMetadata("VALID_TIPCOMFOR","{handler:'valid_Tipcomfor',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3679TipComFor',fld:'TIPCOMFOR',pic:''},{av:'A3680TipComDsc',fld:'TIPCOMDSC',pic:''}]");
      setEventMetadata("VALID_TIPCOMFOR",",oparms:[{av:'A3680TipComDsc',fld:'TIPCOMDSC',pic:''}]}");
      setEventMetadata("VALID_COMFORTXT","{handler:'valid_Comfortxt',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O3690ComForTxt'},{av:'A3691ComForUsu',fld:'COMFORUSU',pic:'@!'},{av:'AV20UsurCod',fld:'vUSURCOD',pic:''},{av:'A3690ComForTxt',fld:'COMFORTXT',pic:''},{av:'A3688ComUltLin',fld:'COMULTLIN',pic:'ZZZ9'},{av:'A3689ComForLin',fld:'COMFORLIN',pic:'ZZZ9'},{av:'AV26Acceso',fld:'vACCESO',pic:''}]");
      setEventMetadata("VALID_COMFORTXT",",oparms:[]}");
      setEventMetadata("VALID_COMFORUSU","{handler:'valid_Comforusu',iparms:[]");
      setEventMetadata("VALID_COMFORUSU",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Comforfec',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(40);
      pr_default.close(39);
      pr_default.close(41);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E3679TipComFor = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      wcpOAV26Acceso = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z3691ComForUsu = "" ;
      Z3692ComForFec = GXutil.nullDate() ;
      Z3690ComForTxt = "" ;
      Z3679TipComFor = "" ;
      O3690ComForTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3679TipComFor = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      AV26Acceso = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      AV20UsurCod = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode518 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV30Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode47 = "" ;
      GXCCtl = "" ;
      A3680TipComDsc = "" ;
      A3690ComForTxt = "" ;
      A3691ComForUsu = "" ;
      A3692ComForFec = GXutil.nullDate() ;
      T3690ComForTxt = "" ;
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV23Lit4 = "" ;
      AV28Lit19 = "" ;
      AV21LitFe = "" ;
      GXt_char1 = "" ;
      AV22Station = "" ;
      AV24EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV25EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00TV7_A407EmprNom = new String[] {""} ;
      T00TV7_n407EmprNom = new boolean[] {false} ;
      T00TV8_A396EmprCod = new String[] {""} ;
      T00TV9_A396EmprCod = new String[] {""} ;
      T00TV10_A494ForSer = new String[] {""} ;
      T00TV10_n494ForSer = new boolean[] {false} ;
      T00TV10_A482ForColNom = new String[] {""} ;
      T00TV10_n482ForColNom = new boolean[] {false} ;
      T00TV10_A483ForColNum = new int[1] ;
      T00TV10_n483ForColNum = new boolean[] {false} ;
      T00TV10_A3688ComUltLin = new short[1] ;
      T00TV10_n3688ComUltLin = new boolean[] {false} ;
      T00TV10_A407EmprNom = new String[] {""} ;
      T00TV10_n407EmprNom = new boolean[] {false} ;
      T00TV10_A396EmprCod = new String[] {""} ;
      T00TV10_A252CliCod = new int[1] ;
      T00TV10_n252CliCod = new boolean[] {false} ;
      T00TV10_A831TipColCod = new byte[1] ;
      T00TV10_n831TipColCod = new boolean[] {false} ;
      T00TV11_A396EmprCod = new String[] {""} ;
      T00TV11_A252CliCod = new int[1] ;
      T00TV11_n252CliCod = new boolean[] {false} ;
      T00TV11_A494ForSer = new String[] {""} ;
      T00TV11_n494ForSer = new boolean[] {false} ;
      T00TV11_A482ForColNom = new String[] {""} ;
      T00TV11_n482ForColNom = new boolean[] {false} ;
      T00TV11_A483ForColNum = new int[1] ;
      T00TV11_n483ForColNum = new boolean[] {false} ;
      T00TV11_A831TipColCod = new byte[1] ;
      T00TV11_n831TipColCod = new boolean[] {false} ;
      T00TV6_A494ForSer = new String[] {""} ;
      T00TV6_n494ForSer = new boolean[] {false} ;
      T00TV6_A482ForColNom = new String[] {""} ;
      T00TV6_n482ForColNom = new boolean[] {false} ;
      T00TV6_A483ForColNum = new int[1] ;
      T00TV6_n483ForColNum = new boolean[] {false} ;
      T00TV6_A3688ComUltLin = new short[1] ;
      T00TV6_n3688ComUltLin = new boolean[] {false} ;
      T00TV6_A396EmprCod = new String[] {""} ;
      T00TV6_A252CliCod = new int[1] ;
      T00TV6_n252CliCod = new boolean[] {false} ;
      T00TV6_A831TipColCod = new byte[1] ;
      T00TV6_n831TipColCod = new boolean[] {false} ;
      T00TV12_A396EmprCod = new String[] {""} ;
      T00TV12_A252CliCod = new int[1] ;
      T00TV12_n252CliCod = new boolean[] {false} ;
      T00TV12_A494ForSer = new String[] {""} ;
      T00TV12_n494ForSer = new boolean[] {false} ;
      T00TV12_A482ForColNom = new String[] {""} ;
      T00TV12_n482ForColNom = new boolean[] {false} ;
      T00TV12_A483ForColNum = new int[1] ;
      T00TV12_n483ForColNum = new boolean[] {false} ;
      T00TV12_A831TipColCod = new byte[1] ;
      T00TV12_n831TipColCod = new boolean[] {false} ;
      T00TV13_A396EmprCod = new String[] {""} ;
      T00TV13_A252CliCod = new int[1] ;
      T00TV13_n252CliCod = new boolean[] {false} ;
      T00TV13_A494ForSer = new String[] {""} ;
      T00TV13_n494ForSer = new boolean[] {false} ;
      T00TV13_A482ForColNom = new String[] {""} ;
      T00TV13_n482ForColNom = new boolean[] {false} ;
      T00TV13_A483ForColNum = new int[1] ;
      T00TV13_n483ForColNum = new boolean[] {false} ;
      T00TV13_A831TipColCod = new byte[1] ;
      T00TV13_n831TipColCod = new boolean[] {false} ;
      T00TV5_A494ForSer = new String[] {""} ;
      T00TV5_n494ForSer = new boolean[] {false} ;
      T00TV5_A482ForColNom = new String[] {""} ;
      T00TV5_n482ForColNom = new boolean[] {false} ;
      T00TV5_A483ForColNum = new int[1] ;
      T00TV5_n483ForColNum = new boolean[] {false} ;
      T00TV5_A3688ComUltLin = new short[1] ;
      T00TV5_n3688ComUltLin = new boolean[] {false} ;
      T00TV5_A396EmprCod = new String[] {""} ;
      T00TV5_A252CliCod = new int[1] ;
      T00TV5_n252CliCod = new boolean[] {false} ;
      T00TV5_A831TipColCod = new byte[1] ;
      T00TV5_n831TipColCod = new boolean[] {false} ;
      T00TV17_A396EmprCod = new String[] {""} ;
      T00TV17_A252CliCod = new int[1] ;
      T00TV17_n252CliCod = new boolean[] {false} ;
      T00TV17_A494ForSer = new String[] {""} ;
      T00TV17_n494ForSer = new boolean[] {false} ;
      T00TV17_A482ForColNom = new String[] {""} ;
      T00TV17_n482ForColNom = new boolean[] {false} ;
      T00TV17_A483ForColNum = new int[1] ;
      T00TV17_n483ForColNum = new boolean[] {false} ;
      T00TV17_A831TipColCod = new byte[1] ;
      T00TV17_n831TipColCod = new boolean[] {false} ;
      T00TV17_A13377ForNormaID = new String[] {""} ;
      T00TV18_A396EmprCod = new String[] {""} ;
      T00TV18_A252CliCod = new int[1] ;
      T00TV18_n252CliCod = new boolean[] {false} ;
      T00TV18_A494ForSer = new String[] {""} ;
      T00TV18_n494ForSer = new boolean[] {false} ;
      T00TV18_A482ForColNom = new String[] {""} ;
      T00TV18_n482ForColNom = new boolean[] {false} ;
      T00TV18_A483ForColNum = new int[1] ;
      T00TV18_n483ForColNum = new boolean[] {false} ;
      T00TV18_A831TipColCod = new byte[1] ;
      T00TV18_n831TipColCod = new boolean[] {false} ;
      T00TV18_A3571EnsCod = new String[] {""} ;
      T00TV19_A396EmprCod = new String[] {""} ;
      T00TV19_A252CliCod = new int[1] ;
      T00TV19_n252CliCod = new boolean[] {false} ;
      T00TV19_A494ForSer = new String[] {""} ;
      T00TV19_n494ForSer = new boolean[] {false} ;
      T00TV19_A482ForColNom = new String[] {""} ;
      T00TV19_n482ForColNom = new boolean[] {false} ;
      T00TV19_A483ForColNum = new int[1] ;
      T00TV19_n483ForColNum = new boolean[] {false} ;
      T00TV19_A831TipColCod = new byte[1] ;
      T00TV19_n831TipColCod = new boolean[] {false} ;
      T00TV19_A7270Procod_c = new String[] {""} ;
      T00TV19_A7272CliCod_d = new int[1] ;
      T00TV20_A396EmprCod = new String[] {""} ;
      T00TV20_A252CliCod = new int[1] ;
      T00TV20_n252CliCod = new boolean[] {false} ;
      T00TV20_A494ForSer = new String[] {""} ;
      T00TV20_n494ForSer = new boolean[] {false} ;
      T00TV20_A482ForColNom = new String[] {""} ;
      T00TV20_n482ForColNom = new boolean[] {false} ;
      T00TV20_A483ForColNum = new int[1] ;
      T00TV20_n483ForColNum = new boolean[] {false} ;
      T00TV20_A831TipColCod = new byte[1] ;
      T00TV20_n831TipColCod = new boolean[] {false} ;
      T00TV20_A6525ColAqP = new String[] {""} ;
      T00TV21_A396EmprCod = new String[] {""} ;
      T00TV21_A252CliCod = new int[1] ;
      T00TV21_n252CliCod = new boolean[] {false} ;
      T00TV21_A494ForSer = new String[] {""} ;
      T00TV21_n494ForSer = new boolean[] {false} ;
      T00TV21_A482ForColNom = new String[] {""} ;
      T00TV21_n482ForColNom = new boolean[] {false} ;
      T00TV21_A483ForColNum = new int[1] ;
      T00TV21_n483ForColNum = new boolean[] {false} ;
      T00TV21_A831TipColCod = new byte[1] ;
      T00TV21_n831TipColCod = new boolean[] {false} ;
      T00TV21_A7262CACPP = new String[] {""} ;
      T00TV22_A396EmprCod = new String[] {""} ;
      T00TV22_A252CliCod = new int[1] ;
      T00TV22_n252CliCod = new boolean[] {false} ;
      T00TV22_A494ForSer = new String[] {""} ;
      T00TV22_n494ForSer = new boolean[] {false} ;
      T00TV22_A482ForColNom = new String[] {""} ;
      T00TV22_n482ForColNom = new boolean[] {false} ;
      T00TV22_A483ForColNum = new int[1] ;
      T00TV22_n483ForColNum = new boolean[] {false} ;
      T00TV22_A831TipColCod = new byte[1] ;
      T00TV22_n831TipColCod = new boolean[] {false} ;
      T00TV22_A6037Mq_Grupo = new byte[1] ;
      T00TV23_A396EmprCod = new String[] {""} ;
      T00TV23_A252CliCod = new int[1] ;
      T00TV23_n252CliCod = new boolean[] {false} ;
      T00TV23_A494ForSer = new String[] {""} ;
      T00TV23_n494ForSer = new boolean[] {false} ;
      T00TV23_A482ForColNom = new String[] {""} ;
      T00TV23_n482ForColNom = new boolean[] {false} ;
      T00TV23_A483ForColNum = new int[1] ;
      T00TV23_n483ForColNum = new boolean[] {false} ;
      T00TV23_A831TipColCod = new byte[1] ;
      T00TV23_n831TipColCod = new boolean[] {false} ;
      T00TV23_A853For_ProC = new String[] {""} ;
      T00TV24_A396EmprCod = new String[] {""} ;
      T00TV24_A252CliCod = new int[1] ;
      T00TV24_n252CliCod = new boolean[] {false} ;
      T00TV24_A494ForSer = new String[] {""} ;
      T00TV24_n494ForSer = new boolean[] {false} ;
      T00TV24_A482ForColNom = new String[] {""} ;
      T00TV24_n482ForColNom = new boolean[] {false} ;
      T00TV24_A483ForColNum = new int[1] ;
      T00TV24_n483ForColNum = new boolean[] {false} ;
      T00TV24_A831TipColCod = new byte[1] ;
      T00TV24_n831TipColCod = new boolean[] {false} ;
      T00TV24_A9766ForProC = new String[] {""} ;
      T00TV25_A396EmprCod = new String[] {""} ;
      T00TV25_A252CliCod = new int[1] ;
      T00TV25_n252CliCod = new boolean[] {false} ;
      T00TV25_A494ForSer = new String[] {""} ;
      T00TV25_n494ForSer = new boolean[] {false} ;
      T00TV25_A482ForColNom = new String[] {""} ;
      T00TV25_n482ForColNom = new boolean[] {false} ;
      T00TV25_A483ForColNum = new int[1] ;
      T00TV25_n483ForColNum = new boolean[] {false} ;
      T00TV25_A831TipColCod = new byte[1] ;
      T00TV25_n831TipColCod = new boolean[] {false} ;
      T00TV25_A7797Sim_lin = new short[1] ;
      T00TV26_A396EmprCod = new String[] {""} ;
      T00TV26_A252CliCod = new int[1] ;
      T00TV26_n252CliCod = new boolean[] {false} ;
      T00TV26_A494ForSer = new String[] {""} ;
      T00TV26_n494ForSer = new boolean[] {false} ;
      T00TV26_A482ForColNom = new String[] {""} ;
      T00TV26_n482ForColNom = new boolean[] {false} ;
      T00TV26_A483ForColNum = new int[1] ;
      T00TV26_n483ForColNum = new boolean[] {false} ;
      T00TV26_A831TipColCod = new byte[1] ;
      T00TV26_n831TipColCod = new boolean[] {false} ;
      T00TV26_A7094Acab_Ter = new String[] {""} ;
      T00TV27_A396EmprCod = new String[] {""} ;
      T00TV27_A252CliCod = new int[1] ;
      T00TV27_n252CliCod = new boolean[] {false} ;
      T00TV27_A494ForSer = new String[] {""} ;
      T00TV27_n494ForSer = new boolean[] {false} ;
      T00TV27_A482ForColNom = new String[] {""} ;
      T00TV27_n482ForColNom = new boolean[] {false} ;
      T00TV27_A483ForColNum = new int[1] ;
      T00TV27_n483ForColNum = new boolean[] {false} ;
      T00TV27_A831TipColCod = new byte[1] ;
      T00TV27_n831TipColCod = new boolean[] {false} ;
      T00TV27_A1519RecCorLin = new byte[1] ;
      T00TV28_A396EmprCod = new String[] {""} ;
      T00TV28_A252CliCod = new int[1] ;
      T00TV28_n252CliCod = new boolean[] {false} ;
      T00TV28_A494ForSer = new String[] {""} ;
      T00TV28_n494ForSer = new boolean[] {false} ;
      T00TV28_A482ForColNom = new String[] {""} ;
      T00TV28_n482ForColNom = new boolean[] {false} ;
      T00TV28_A483ForColNum = new int[1] ;
      T00TV28_n483ForColNum = new boolean[] {false} ;
      T00TV28_A831TipColCod = new byte[1] ;
      T00TV28_n831TipColCod = new boolean[] {false} ;
      T00TV28_A1160ProForL = new short[1] ;
      T00TV29_A396EmprCod = new String[] {""} ;
      T00TV29_A910Workstat = new String[] {""} ;
      T00TV29_A880EscLin = new short[1] ;
      T00TV30_A396EmprCod = new String[] {""} ;
      T00TV30_A252CliCod = new int[1] ;
      T00TV30_n252CliCod = new boolean[] {false} ;
      T00TV30_A494ForSer = new String[] {""} ;
      T00TV30_n494ForSer = new boolean[] {false} ;
      T00TV30_A482ForColNom = new String[] {""} ;
      T00TV30_n482ForColNom = new boolean[] {false} ;
      T00TV30_A483ForColNum = new int[1] ;
      T00TV30_n483ForColNum = new boolean[] {false} ;
      T00TV30_A831TipColCod = new byte[1] ;
      T00TV30_n831TipColCod = new boolean[] {false} ;
      T00TV30_A650ObsLin = new short[1] ;
      T00TV32_A396EmprCod = new String[] {""} ;
      T00TV32_A252CliCod = new int[1] ;
      T00TV32_n252CliCod = new boolean[] {false} ;
      T00TV32_A494ForSer = new String[] {""} ;
      T00TV32_n494ForSer = new boolean[] {false} ;
      T00TV32_A482ForColNom = new String[] {""} ;
      T00TV32_n482ForColNom = new boolean[] {false} ;
      T00TV32_A483ForColNum = new int[1] ;
      T00TV32_n483ForColNum = new boolean[] {false} ;
      T00TV32_A831TipColCod = new byte[1] ;
      T00TV32_n831TipColCod = new boolean[] {false} ;
      Z3680TipComDsc = "" ;
      E3679TipComFor = "" ;
      T00TV4_A3680TipComDsc = new String[] {""} ;
      T00TV4_n3680TipComDsc = new boolean[] {false} ;
      T00TV33_A494ForSer = new String[] {""} ;
      T00TV33_n494ForSer = new boolean[] {false} ;
      T00TV33_A482ForColNom = new String[] {""} ;
      T00TV33_n482ForColNom = new boolean[] {false} ;
      T00TV33_A483ForColNum = new int[1] ;
      T00TV33_n483ForColNum = new boolean[] {false} ;
      T00TV33_A831TipColCod = new byte[1] ;
      T00TV33_n831TipColCod = new boolean[] {false} ;
      T00TV33_A3689ComForLin = new short[1] ;
      T00TV33_A3691ComForUsu = new String[] {""} ;
      T00TV33_n3691ComForUsu = new boolean[] {false} ;
      T00TV33_A3692ComForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00TV33_n3692ComForFec = new boolean[] {false} ;
      T00TV33_A3680TipComDsc = new String[] {""} ;
      T00TV33_n3680TipComDsc = new boolean[] {false} ;
      T00TV33_A3690ComForTxt = new String[] {""} ;
      T00TV33_n3690ComForTxt = new boolean[] {false} ;
      T00TV33_A396EmprCod = new String[] {""} ;
      T00TV33_A3679TipComFor = new String[] {""} ;
      T00TV33_n3679TipComFor = new boolean[] {false} ;
      T00TV33_A252CliCod = new int[1] ;
      T00TV33_n252CliCod = new boolean[] {false} ;
      T00TV34_A3680TipComDsc = new String[] {""} ;
      T00TV34_n3680TipComDsc = new boolean[] {false} ;
      T00TV35_A396EmprCod = new String[] {""} ;
      T00TV35_A252CliCod = new int[1] ;
      T00TV35_n252CliCod = new boolean[] {false} ;
      T00TV35_A494ForSer = new String[] {""} ;
      T00TV35_n494ForSer = new boolean[] {false} ;
      T00TV35_A482ForColNom = new String[] {""} ;
      T00TV35_n482ForColNom = new boolean[] {false} ;
      T00TV35_A483ForColNum = new int[1] ;
      T00TV35_n483ForColNum = new boolean[] {false} ;
      T00TV35_A831TipColCod = new byte[1] ;
      T00TV35_n831TipColCod = new boolean[] {false} ;
      T00TV35_A3689ComForLin = new short[1] ;
      T00TV3_A494ForSer = new String[] {""} ;
      T00TV3_n494ForSer = new boolean[] {false} ;
      T00TV3_A482ForColNom = new String[] {""} ;
      T00TV3_n482ForColNom = new boolean[] {false} ;
      T00TV3_A483ForColNum = new int[1] ;
      T00TV3_n483ForColNum = new boolean[] {false} ;
      T00TV3_A831TipColCod = new byte[1] ;
      T00TV3_n831TipColCod = new boolean[] {false} ;
      T00TV3_A3689ComForLin = new short[1] ;
      T00TV3_A3691ComForUsu = new String[] {""} ;
      T00TV3_n3691ComForUsu = new boolean[] {false} ;
      T00TV3_A3692ComForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00TV3_n3692ComForFec = new boolean[] {false} ;
      T00TV3_A3690ComForTxt = new String[] {""} ;
      T00TV3_n3690ComForTxt = new boolean[] {false} ;
      T00TV3_A396EmprCod = new String[] {""} ;
      T00TV3_A3679TipComFor = new String[] {""} ;
      T00TV3_n3679TipComFor = new boolean[] {false} ;
      T00TV3_A252CliCod = new int[1] ;
      T00TV3_n252CliCod = new boolean[] {false} ;
      T00TV2_A494ForSer = new String[] {""} ;
      T00TV2_n494ForSer = new boolean[] {false} ;
      T00TV2_A482ForColNom = new String[] {""} ;
      T00TV2_n482ForColNom = new boolean[] {false} ;
      T00TV2_A483ForColNum = new int[1] ;
      T00TV2_n483ForColNum = new boolean[] {false} ;
      T00TV2_A831TipColCod = new byte[1] ;
      T00TV2_n831TipColCod = new boolean[] {false} ;
      T00TV2_A3689ComForLin = new short[1] ;
      T00TV2_A3691ComForUsu = new String[] {""} ;
      T00TV2_n3691ComForUsu = new boolean[] {false} ;
      T00TV2_A3692ComForFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00TV2_n3692ComForFec = new boolean[] {false} ;
      T00TV2_A3690ComForTxt = new String[] {""} ;
      T00TV2_n3690ComForTxt = new boolean[] {false} ;
      T00TV2_A396EmprCod = new String[] {""} ;
      T00TV2_A3679TipComFor = new String[] {""} ;
      T00TV2_n3679TipComFor = new boolean[] {false} ;
      T00TV2_A252CliCod = new int[1] ;
      T00TV2_n252CliCod = new boolean[] {false} ;
      T00TV39_A3680TipComDsc = new String[] {""} ;
      T00TV39_n3680TipComDsc = new boolean[] {false} ;
      T00TV40_A396EmprCod = new String[] {""} ;
      T00TV40_A252CliCod = new int[1] ;
      T00TV40_n252CliCod = new boolean[] {false} ;
      T00TV40_A494ForSer = new String[] {""} ;
      T00TV40_n494ForSer = new boolean[] {false} ;
      T00TV40_A482ForColNom = new String[] {""} ;
      T00TV40_n482ForColNom = new boolean[] {false} ;
      T00TV40_A483ForColNum = new int[1] ;
      T00TV40_n483ForColNum = new boolean[] {false} ;
      T00TV40_A831TipColCod = new byte[1] ;
      T00TV40_n831TipColCod = new boolean[] {false} ;
      T00TV40_A3689ComForLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i3679TipComFor = "" ;
      i3691ComForUsu = "" ;
      i3692ComForFec = GXutil.nullDate() ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00TV41_A407EmprNom = new String[] {""} ;
      T00TV41_n407EmprNom = new boolean[] {false} ;
      T00TV42_A396EmprCod = new String[] {""} ;
      T00TV43_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfortxt__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfortxt__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfortxt__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfortxt__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfortxt__default(),
         new Object[] {
             new Object[] {
            T00TV2_A494ForSer, T00TV2_A482ForColNom, T00TV2_A483ForColNum, T00TV2_A831TipColCod, T00TV2_A3689ComForLin, T00TV2_A3691ComForUsu, T00TV2_n3691ComForUsu, T00TV2_A3692ComForFec, T00TV2_n3692ComForFec, T00TV2_A3690ComForTxt,
            T00TV2_n3690ComForTxt, T00TV2_A396EmprCod, T00TV2_A3679TipComFor, T00TV2_n3679TipComFor, T00TV2_A252CliCod
            }
            , new Object[] {
            T00TV3_A494ForSer, T00TV3_A482ForColNom, T00TV3_A483ForColNum, T00TV3_A831TipColCod, T00TV3_A3689ComForLin, T00TV3_A3691ComForUsu, T00TV3_n3691ComForUsu, T00TV3_A3692ComForFec, T00TV3_n3692ComForFec, T00TV3_A3690ComForTxt,
            T00TV3_n3690ComForTxt, T00TV3_A396EmprCod, T00TV3_A3679TipComFor, T00TV3_n3679TipComFor, T00TV3_A252CliCod
            }
            , new Object[] {
            T00TV4_A3680TipComDsc, T00TV4_n3680TipComDsc
            }
            , new Object[] {
            T00TV5_A494ForSer, T00TV5_A482ForColNom, T00TV5_A483ForColNum, T00TV5_A3688ComUltLin, T00TV5_n3688ComUltLin, T00TV5_A396EmprCod, T00TV5_A252CliCod, T00TV5_A831TipColCod
            }
            , new Object[] {
            T00TV6_A494ForSer, T00TV6_A482ForColNom, T00TV6_A483ForColNum, T00TV6_A3688ComUltLin, T00TV6_n3688ComUltLin, T00TV6_A396EmprCod, T00TV6_A252CliCod, T00TV6_A831TipColCod
            }
            , new Object[] {
            T00TV7_A407EmprNom, T00TV7_n407EmprNom
            }
            , new Object[] {
            T00TV8_A396EmprCod
            }
            , new Object[] {
            T00TV9_A396EmprCod
            }
            , new Object[] {
            T00TV10_A494ForSer, T00TV10_A482ForColNom, T00TV10_A483ForColNum, T00TV10_A3688ComUltLin, T00TV10_n3688ComUltLin, T00TV10_A407EmprNom, T00TV10_n407EmprNom, T00TV10_A396EmprCod, T00TV10_A252CliCod, T00TV10_A831TipColCod
            }
            , new Object[] {
            T00TV11_A396EmprCod, T00TV11_A252CliCod, T00TV11_A494ForSer, T00TV11_A482ForColNom, T00TV11_A483ForColNum, T00TV11_A831TipColCod
            }
            , new Object[] {
            T00TV12_A396EmprCod, T00TV12_A252CliCod, T00TV12_A494ForSer, T00TV12_A482ForColNom, T00TV12_A483ForColNum, T00TV12_A831TipColCod
            }
            , new Object[] {
            T00TV13_A396EmprCod, T00TV13_A252CliCod, T00TV13_A494ForSer, T00TV13_A482ForColNom, T00TV13_A483ForColNum, T00TV13_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TV17_A396EmprCod, T00TV17_A252CliCod, T00TV17_A494ForSer, T00TV17_A482ForColNom, T00TV17_A483ForColNum, T00TV17_A831TipColCod, T00TV17_A13377ForNormaID
            }
            , new Object[] {
            T00TV18_A396EmprCod, T00TV18_A252CliCod, T00TV18_A494ForSer, T00TV18_A482ForColNom, T00TV18_A483ForColNum, T00TV18_A831TipColCod, T00TV18_A3571EnsCod
            }
            , new Object[] {
            T00TV19_A396EmprCod, T00TV19_A252CliCod, T00TV19_A494ForSer, T00TV19_A482ForColNom, T00TV19_A483ForColNum, T00TV19_A831TipColCod, T00TV19_A7270Procod_c, T00TV19_A7272CliCod_d
            }
            , new Object[] {
            T00TV20_A396EmprCod, T00TV20_A252CliCod, T00TV20_A494ForSer, T00TV20_A482ForColNom, T00TV20_A483ForColNum, T00TV20_A831TipColCod, T00TV20_A6525ColAqP
            }
            , new Object[] {
            T00TV21_A396EmprCod, T00TV21_A252CliCod, T00TV21_A494ForSer, T00TV21_A482ForColNom, T00TV21_A483ForColNum, T00TV21_A831TipColCod, T00TV21_A7262CACPP
            }
            , new Object[] {
            T00TV22_A396EmprCod, T00TV22_A252CliCod, T00TV22_A494ForSer, T00TV22_A482ForColNom, T00TV22_A483ForColNum, T00TV22_A831TipColCod, T00TV22_A6037Mq_Grupo
            }
            , new Object[] {
            T00TV23_A396EmprCod, T00TV23_A252CliCod, T00TV23_A494ForSer, T00TV23_A482ForColNom, T00TV23_A483ForColNum, T00TV23_A831TipColCod, T00TV23_A853For_ProC
            }
            , new Object[] {
            T00TV24_A396EmprCod, T00TV24_A252CliCod, T00TV24_A494ForSer, T00TV24_A482ForColNom, T00TV24_A483ForColNum, T00TV24_A831TipColCod, T00TV24_A9766ForProC
            }
            , new Object[] {
            T00TV25_A396EmprCod, T00TV25_A252CliCod, T00TV25_A494ForSer, T00TV25_A482ForColNom, T00TV25_A483ForColNum, T00TV25_A831TipColCod, T00TV25_A7797Sim_lin
            }
            , new Object[] {
            T00TV26_A396EmprCod, T00TV26_A252CliCod, T00TV26_A494ForSer, T00TV26_A482ForColNom, T00TV26_A483ForColNum, T00TV26_A831TipColCod, T00TV26_A7094Acab_Ter
            }
            , new Object[] {
            T00TV27_A396EmprCod, T00TV27_A252CliCod, T00TV27_A494ForSer, T00TV27_A482ForColNom, T00TV27_A483ForColNum, T00TV27_A831TipColCod, T00TV27_A1519RecCorLin
            }
            , new Object[] {
            T00TV28_A396EmprCod, T00TV28_A252CliCod, T00TV28_A494ForSer, T00TV28_A482ForColNom, T00TV28_A483ForColNum, T00TV28_A831TipColCod, T00TV28_A1160ProForL
            }
            , new Object[] {
            T00TV29_A396EmprCod, T00TV29_A910Workstat, T00TV29_A880EscLin
            }
            , new Object[] {
            T00TV30_A396EmprCod, T00TV30_A252CliCod, T00TV30_A494ForSer, T00TV30_A482ForColNom, T00TV30_A483ForColNum, T00TV30_A831TipColCod, T00TV30_A650ObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            T00TV32_A396EmprCod, T00TV32_A252CliCod, T00TV32_A494ForSer, T00TV32_A482ForColNom, T00TV32_A483ForColNum, T00TV32_A831TipColCod
            }
            , new Object[] {
            T00TV33_A494ForSer, T00TV33_A482ForColNom, T00TV33_A483ForColNum, T00TV33_A831TipColCod, T00TV33_A3689ComForLin, T00TV33_A3691ComForUsu, T00TV33_n3691ComForUsu, T00TV33_A3692ComForFec, T00TV33_n3692ComForFec, T00TV33_A3680TipComDsc,
            T00TV33_n3680TipComDsc, T00TV33_A3690ComForTxt, T00TV33_n3690ComForTxt, T00TV33_A396EmprCod, T00TV33_A3679TipComFor, T00TV33_n3679TipComFor, T00TV33_A252CliCod
            }
            , new Object[] {
            T00TV34_A3680TipComDsc, T00TV34_n3680TipComDsc
            }
            , new Object[] {
            T00TV35_A396EmprCod, T00TV35_A252CliCod, T00TV35_A494ForSer, T00TV35_A482ForColNom, T00TV35_A483ForColNum, T00TV35_A831TipColCod, T00TV35_A3689ComForLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00TV39_A3680TipComDsc, T00TV39_n3680TipComDsc
            }
            , new Object[] {
            T00TV40_A396EmprCod, T00TV40_A252CliCod, T00TV40_A494ForSer, T00TV40_A482ForColNom, T00TV40_A483ForColNum, T00TV40_A831TipColCod, T00TV40_A3689ComForLin
            }
            , new Object[] {
            T00TV41_A407EmprNom, T00TV41_n407EmprNom
            }
            , new Object[] {
            T00TV42_A396EmprCod
            }
            , new Object[] {
            T00TV43_A396EmprCod
            }
         }
      );
      Z831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      A831TipColCod = (byte)(0) ;
      n831TipColCod = false ;
      Z483ForColNum = 0 ;
      n483ForColNum = false ;
      A483ForColNum = 0 ;
      n483ForColNum = false ;
      Z482ForColNom = "" ;
      n482ForColNom = false ;
      A482ForColNom = "" ;
      n482ForColNom = false ;
      Z494ForSer = "" ;
      n494ForSer = false ;
      A494ForSer = "" ;
      n494ForSer = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV30Pgmname = "TFORTXT" ;
      Z3692ComForFec = GXutil.today( ) ;
      n3692ComForFec = false ;
      A3692ComForFec = GXutil.today( ) ;
      n3692ComForFec = false ;
      i3692ComForFec = GXutil.today( ) ;
      n3692ComForFec = false ;
      Z3691ComForUsu = "" ;
      n3691ComForUsu = false ;
      A3691ComForUsu = "" ;
      n3691ComForUsu = false ;
      i3691ComForUsu = "" ;
      n3691ComForUsu = false ;
      Z3679TipComFor = "" ;
      n3679TipComFor = false ;
      E3679TipComFor = "" ;
      n3679TipComFor = false ;
      i3679TipComFor = "" ;
      n3679TipComFor = false ;
      A3679TipComFor = "" ;
      n3679TipComFor = false ;
   }

   private byte wcpOA831TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ831TipColCod ;
   private short Z3688ComUltLin ;
   private short O3688ComUltLin ;
   private short Z3689ComForLin ;
   private short nRcdDeleted_518 ;
   private short nRcdExists_518 ;
   private short nIsMod_518 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3688ComUltLin ;
   private short nBlankRcdCount518 ;
   private short RcdFound518 ;
   private short B3688ComUltLin ;
   private short nBlankRcdUsr518 ;
   private short s3688ComUltLin ;
   private short A3689ComForLin ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_518 ;
   private short i3688ComUltLin ;
   private short ZZ3688ComUltLin ;
   private short ZO3688ComUltLin ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtComUltLin_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_518_Enabled ;
   private int edtComForLin_Enabled ;
   private int edtTipComFor_Enabled ;
   private int edtTipComDsc_Enabled ;
   private int edtComForTxt_Enabled ;
   private int edtComForUsu_Enabled ;
   private int edtComForFec_Enabled ;
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
   private int defedtComForFec_Enabled ;
   private int defedtComForUsu_Enabled ;
   private int defedtComForLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtComUltLin_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOAV26Acceso ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z3691ComForUsu ;
   private String Z3690ComForTxt ;
   private String Z3679TipComFor ;
   private String O3690ComForTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3679TipComFor ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV26Acceso ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
   private String AV20UsurCod ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtComUltLin_Internalname ;
   private String edtComUltLin_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode518 ;
   private String edtavnRcdDeleted_518_Internalname ;
   private String edtComForLin_Internalname ;
   private String edtTipComFor_Internalname ;
   private String edtTipComDsc_Internalname ;
   private String edtComForTxt_Internalname ;
   private String edtComForUsu_Internalname ;
   private String edtComForFec_Internalname ;
   private String GX_FocusControl ;
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
   private String AV30Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode47 ;
   private String GXCCtl ;
   private String A3680TipComDsc ;
   private String A3690ComForTxt ;
   private String A3691ComForUsu ;
   private String T3690ComForTxt ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV23Lit4 ;
   private String AV28Lit19 ;
   private String AV21LitFe ;
   private String GXt_char1 ;
   private String AV22Station ;
   private String AV24EmprCod ;
   private String GXv_char2[] ;
   private String AV25EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z3680TipComDsc ;
   private String E3679TipComFor ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_518_Jsonclick ;
   private String edtComForLin_Jsonclick ;
   private String edtTipComFor_Jsonclick ;
   private String edtTipComDsc_Jsonclick ;
   private String edtComForTxt_Jsonclick ;
   private String edtComForUsu_Jsonclick ;
   private String edtComForFec_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3679TipComFor ;
   private String i3691ComForUsu ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ407EmprNom ;
   private java.util.Date Z3692ComForFec ;
   private java.util.Date A3692ComForFec ;
   private java.util.Date i3692ComForFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3679TipComFor ;
   private boolean n252CliCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean n3688ComUltLin ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n3691ComForUsu ;
   private boolean n3692ComForFec ;
   private boolean n3680TipComDsc ;
   private boolean n3690ComForTxt ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00TV7_A407EmprNom ;
   private boolean[] T00TV7_n407EmprNom ;
   private String[] T00TV8_A396EmprCod ;
   private String[] T00TV9_A396EmprCod ;
   private String[] T00TV10_A494ForSer ;
   private boolean[] T00TV10_n494ForSer ;
   private String[] T00TV10_A482ForColNom ;
   private boolean[] T00TV10_n482ForColNom ;
   private int[] T00TV10_A483ForColNum ;
   private boolean[] T00TV10_n483ForColNum ;
   private short[] T00TV10_A3688ComUltLin ;
   private boolean[] T00TV10_n3688ComUltLin ;
   private String[] T00TV10_A407EmprNom ;
   private boolean[] T00TV10_n407EmprNom ;
   private String[] T00TV10_A396EmprCod ;
   private int[] T00TV10_A252CliCod ;
   private boolean[] T00TV10_n252CliCod ;
   private byte[] T00TV10_A831TipColCod ;
   private boolean[] T00TV10_n831TipColCod ;
   private String[] T00TV11_A396EmprCod ;
   private int[] T00TV11_A252CliCod ;
   private boolean[] T00TV11_n252CliCod ;
   private String[] T00TV11_A494ForSer ;
   private boolean[] T00TV11_n494ForSer ;
   private String[] T00TV11_A482ForColNom ;
   private boolean[] T00TV11_n482ForColNom ;
   private int[] T00TV11_A483ForColNum ;
   private boolean[] T00TV11_n483ForColNum ;
   private byte[] T00TV11_A831TipColCod ;
   private boolean[] T00TV11_n831TipColCod ;
   private String[] T00TV6_A494ForSer ;
   private boolean[] T00TV6_n494ForSer ;
   private String[] T00TV6_A482ForColNom ;
   private boolean[] T00TV6_n482ForColNom ;
   private int[] T00TV6_A483ForColNum ;
   private boolean[] T00TV6_n483ForColNum ;
   private short[] T00TV6_A3688ComUltLin ;
   private boolean[] T00TV6_n3688ComUltLin ;
   private String[] T00TV6_A396EmprCod ;
   private int[] T00TV6_A252CliCod ;
   private boolean[] T00TV6_n252CliCod ;
   private byte[] T00TV6_A831TipColCod ;
   private boolean[] T00TV6_n831TipColCod ;
   private String[] T00TV12_A396EmprCod ;
   private int[] T00TV12_A252CliCod ;
   private boolean[] T00TV12_n252CliCod ;
   private String[] T00TV12_A494ForSer ;
   private boolean[] T00TV12_n494ForSer ;
   private String[] T00TV12_A482ForColNom ;
   private boolean[] T00TV12_n482ForColNom ;
   private int[] T00TV12_A483ForColNum ;
   private boolean[] T00TV12_n483ForColNum ;
   private byte[] T00TV12_A831TipColCod ;
   private boolean[] T00TV12_n831TipColCod ;
   private String[] T00TV13_A396EmprCod ;
   private int[] T00TV13_A252CliCod ;
   private boolean[] T00TV13_n252CliCod ;
   private String[] T00TV13_A494ForSer ;
   private boolean[] T00TV13_n494ForSer ;
   private String[] T00TV13_A482ForColNom ;
   private boolean[] T00TV13_n482ForColNom ;
   private int[] T00TV13_A483ForColNum ;
   private boolean[] T00TV13_n483ForColNum ;
   private byte[] T00TV13_A831TipColCod ;
   private boolean[] T00TV13_n831TipColCod ;
   private String[] T00TV5_A494ForSer ;
   private boolean[] T00TV5_n494ForSer ;
   private String[] T00TV5_A482ForColNom ;
   private boolean[] T00TV5_n482ForColNom ;
   private int[] T00TV5_A483ForColNum ;
   private boolean[] T00TV5_n483ForColNum ;
   private short[] T00TV5_A3688ComUltLin ;
   private boolean[] T00TV5_n3688ComUltLin ;
   private String[] T00TV5_A396EmprCod ;
   private int[] T00TV5_A252CliCod ;
   private boolean[] T00TV5_n252CliCod ;
   private byte[] T00TV5_A831TipColCod ;
   private boolean[] T00TV5_n831TipColCod ;
   private String[] T00TV17_A396EmprCod ;
   private int[] T00TV17_A252CliCod ;
   private boolean[] T00TV17_n252CliCod ;
   private String[] T00TV17_A494ForSer ;
   private boolean[] T00TV17_n494ForSer ;
   private String[] T00TV17_A482ForColNom ;
   private boolean[] T00TV17_n482ForColNom ;
   private int[] T00TV17_A483ForColNum ;
   private boolean[] T00TV17_n483ForColNum ;
   private byte[] T00TV17_A831TipColCod ;
   private boolean[] T00TV17_n831TipColCod ;
   private String[] T00TV17_A13377ForNormaID ;
   private String[] T00TV18_A396EmprCod ;
   private int[] T00TV18_A252CliCod ;
   private boolean[] T00TV18_n252CliCod ;
   private String[] T00TV18_A494ForSer ;
   private boolean[] T00TV18_n494ForSer ;
   private String[] T00TV18_A482ForColNom ;
   private boolean[] T00TV18_n482ForColNom ;
   private int[] T00TV18_A483ForColNum ;
   private boolean[] T00TV18_n483ForColNum ;
   private byte[] T00TV18_A831TipColCod ;
   private boolean[] T00TV18_n831TipColCod ;
   private String[] T00TV18_A3571EnsCod ;
   private String[] T00TV19_A396EmprCod ;
   private int[] T00TV19_A252CliCod ;
   private boolean[] T00TV19_n252CliCod ;
   private String[] T00TV19_A494ForSer ;
   private boolean[] T00TV19_n494ForSer ;
   private String[] T00TV19_A482ForColNom ;
   private boolean[] T00TV19_n482ForColNom ;
   private int[] T00TV19_A483ForColNum ;
   private boolean[] T00TV19_n483ForColNum ;
   private byte[] T00TV19_A831TipColCod ;
   private boolean[] T00TV19_n831TipColCod ;
   private String[] T00TV19_A7270Procod_c ;
   private int[] T00TV19_A7272CliCod_d ;
   private String[] T00TV20_A396EmprCod ;
   private int[] T00TV20_A252CliCod ;
   private boolean[] T00TV20_n252CliCod ;
   private String[] T00TV20_A494ForSer ;
   private boolean[] T00TV20_n494ForSer ;
   private String[] T00TV20_A482ForColNom ;
   private boolean[] T00TV20_n482ForColNom ;
   private int[] T00TV20_A483ForColNum ;
   private boolean[] T00TV20_n483ForColNum ;
   private byte[] T00TV20_A831TipColCod ;
   private boolean[] T00TV20_n831TipColCod ;
   private String[] T00TV20_A6525ColAqP ;
   private String[] T00TV21_A396EmprCod ;
   private int[] T00TV21_A252CliCod ;
   private boolean[] T00TV21_n252CliCod ;
   private String[] T00TV21_A494ForSer ;
   private boolean[] T00TV21_n494ForSer ;
   private String[] T00TV21_A482ForColNom ;
   private boolean[] T00TV21_n482ForColNom ;
   private int[] T00TV21_A483ForColNum ;
   private boolean[] T00TV21_n483ForColNum ;
   private byte[] T00TV21_A831TipColCod ;
   private boolean[] T00TV21_n831TipColCod ;
   private String[] T00TV21_A7262CACPP ;
   private String[] T00TV22_A396EmprCod ;
   private int[] T00TV22_A252CliCod ;
   private boolean[] T00TV22_n252CliCod ;
   private String[] T00TV22_A494ForSer ;
   private boolean[] T00TV22_n494ForSer ;
   private String[] T00TV22_A482ForColNom ;
   private boolean[] T00TV22_n482ForColNom ;
   private int[] T00TV22_A483ForColNum ;
   private boolean[] T00TV22_n483ForColNum ;
   private byte[] T00TV22_A831TipColCod ;
   private boolean[] T00TV22_n831TipColCod ;
   private byte[] T00TV22_A6037Mq_Grupo ;
   private String[] T00TV23_A396EmprCod ;
   private int[] T00TV23_A252CliCod ;
   private boolean[] T00TV23_n252CliCod ;
   private String[] T00TV23_A494ForSer ;
   private boolean[] T00TV23_n494ForSer ;
   private String[] T00TV23_A482ForColNom ;
   private boolean[] T00TV23_n482ForColNom ;
   private int[] T00TV23_A483ForColNum ;
   private boolean[] T00TV23_n483ForColNum ;
   private byte[] T00TV23_A831TipColCod ;
   private boolean[] T00TV23_n831TipColCod ;
   private String[] T00TV23_A853For_ProC ;
   private String[] T00TV24_A396EmprCod ;
   private int[] T00TV24_A252CliCod ;
   private boolean[] T00TV24_n252CliCod ;
   private String[] T00TV24_A494ForSer ;
   private boolean[] T00TV24_n494ForSer ;
   private String[] T00TV24_A482ForColNom ;
   private boolean[] T00TV24_n482ForColNom ;
   private int[] T00TV24_A483ForColNum ;
   private boolean[] T00TV24_n483ForColNum ;
   private byte[] T00TV24_A831TipColCod ;
   private boolean[] T00TV24_n831TipColCod ;
   private String[] T00TV24_A9766ForProC ;
   private String[] T00TV25_A396EmprCod ;
   private int[] T00TV25_A252CliCod ;
   private boolean[] T00TV25_n252CliCod ;
   private String[] T00TV25_A494ForSer ;
   private boolean[] T00TV25_n494ForSer ;
   private String[] T00TV25_A482ForColNom ;
   private boolean[] T00TV25_n482ForColNom ;
   private int[] T00TV25_A483ForColNum ;
   private boolean[] T00TV25_n483ForColNum ;
   private byte[] T00TV25_A831TipColCod ;
   private boolean[] T00TV25_n831TipColCod ;
   private short[] T00TV25_A7797Sim_lin ;
   private String[] T00TV26_A396EmprCod ;
   private int[] T00TV26_A252CliCod ;
   private boolean[] T00TV26_n252CliCod ;
   private String[] T00TV26_A494ForSer ;
   private boolean[] T00TV26_n494ForSer ;
   private String[] T00TV26_A482ForColNom ;
   private boolean[] T00TV26_n482ForColNom ;
   private int[] T00TV26_A483ForColNum ;
   private boolean[] T00TV26_n483ForColNum ;
   private byte[] T00TV26_A831TipColCod ;
   private boolean[] T00TV26_n831TipColCod ;
   private String[] T00TV26_A7094Acab_Ter ;
   private String[] T00TV27_A396EmprCod ;
   private int[] T00TV27_A252CliCod ;
   private boolean[] T00TV27_n252CliCod ;
   private String[] T00TV27_A494ForSer ;
   private boolean[] T00TV27_n494ForSer ;
   private String[] T00TV27_A482ForColNom ;
   private boolean[] T00TV27_n482ForColNom ;
   private int[] T00TV27_A483ForColNum ;
   private boolean[] T00TV27_n483ForColNum ;
   private byte[] T00TV27_A831TipColCod ;
   private boolean[] T00TV27_n831TipColCod ;
   private byte[] T00TV27_A1519RecCorLin ;
   private String[] T00TV28_A396EmprCod ;
   private int[] T00TV28_A252CliCod ;
   private boolean[] T00TV28_n252CliCod ;
   private String[] T00TV28_A494ForSer ;
   private boolean[] T00TV28_n494ForSer ;
   private String[] T00TV28_A482ForColNom ;
   private boolean[] T00TV28_n482ForColNom ;
   private int[] T00TV28_A483ForColNum ;
   private boolean[] T00TV28_n483ForColNum ;
   private byte[] T00TV28_A831TipColCod ;
   private boolean[] T00TV28_n831TipColCod ;
   private short[] T00TV28_A1160ProForL ;
   private String[] T00TV29_A396EmprCod ;
   private String[] T00TV29_A910Workstat ;
   private short[] T00TV29_A880EscLin ;
   private String[] T00TV30_A396EmprCod ;
   private int[] T00TV30_A252CliCod ;
   private boolean[] T00TV30_n252CliCod ;
   private String[] T00TV30_A494ForSer ;
   private boolean[] T00TV30_n494ForSer ;
   private String[] T00TV30_A482ForColNom ;
   private boolean[] T00TV30_n482ForColNom ;
   private int[] T00TV30_A483ForColNum ;
   private boolean[] T00TV30_n483ForColNum ;
   private byte[] T00TV30_A831TipColCod ;
   private boolean[] T00TV30_n831TipColCod ;
   private short[] T00TV30_A650ObsLin ;
   private String[] T00TV32_A396EmprCod ;
   private int[] T00TV32_A252CliCod ;
   private boolean[] T00TV32_n252CliCod ;
   private String[] T00TV32_A494ForSer ;
   private boolean[] T00TV32_n494ForSer ;
   private String[] T00TV32_A482ForColNom ;
   private boolean[] T00TV32_n482ForColNom ;
   private int[] T00TV32_A483ForColNum ;
   private boolean[] T00TV32_n483ForColNum ;
   private byte[] T00TV32_A831TipColCod ;
   private boolean[] T00TV32_n831TipColCod ;
   private String[] T00TV4_A3680TipComDsc ;
   private boolean[] T00TV4_n3680TipComDsc ;
   private String[] T00TV33_A494ForSer ;
   private boolean[] T00TV33_n494ForSer ;
   private String[] T00TV33_A482ForColNom ;
   private boolean[] T00TV33_n482ForColNom ;
   private int[] T00TV33_A483ForColNum ;
   private boolean[] T00TV33_n483ForColNum ;
   private byte[] T00TV33_A831TipColCod ;
   private boolean[] T00TV33_n831TipColCod ;
   private short[] T00TV33_A3689ComForLin ;
   private String[] T00TV33_A3691ComForUsu ;
   private boolean[] T00TV33_n3691ComForUsu ;
   private java.util.Date[] T00TV33_A3692ComForFec ;
   private boolean[] T00TV33_n3692ComForFec ;
   private String[] T00TV33_A3680TipComDsc ;
   private boolean[] T00TV33_n3680TipComDsc ;
   private String[] T00TV33_A3690ComForTxt ;
   private boolean[] T00TV33_n3690ComForTxt ;
   private String[] T00TV33_A396EmprCod ;
   private String[] T00TV33_A3679TipComFor ;
   private boolean[] T00TV33_n3679TipComFor ;
   private int[] T00TV33_A252CliCod ;
   private boolean[] T00TV33_n252CliCod ;
   private String[] T00TV34_A3680TipComDsc ;
   private boolean[] T00TV34_n3680TipComDsc ;
   private String[] T00TV35_A396EmprCod ;
   private int[] T00TV35_A252CliCod ;
   private boolean[] T00TV35_n252CliCod ;
   private String[] T00TV35_A494ForSer ;
   private boolean[] T00TV35_n494ForSer ;
   private String[] T00TV35_A482ForColNom ;
   private boolean[] T00TV35_n482ForColNom ;
   private int[] T00TV35_A483ForColNum ;
   private boolean[] T00TV35_n483ForColNum ;
   private byte[] T00TV35_A831TipColCod ;
   private boolean[] T00TV35_n831TipColCod ;
   private short[] T00TV35_A3689ComForLin ;
   private String[] T00TV3_A494ForSer ;
   private boolean[] T00TV3_n494ForSer ;
   private String[] T00TV3_A482ForColNom ;
   private boolean[] T00TV3_n482ForColNom ;
   private int[] T00TV3_A483ForColNum ;
   private boolean[] T00TV3_n483ForColNum ;
   private byte[] T00TV3_A831TipColCod ;
   private boolean[] T00TV3_n831TipColCod ;
   private short[] T00TV3_A3689ComForLin ;
   private String[] T00TV3_A3691ComForUsu ;
   private boolean[] T00TV3_n3691ComForUsu ;
   private java.util.Date[] T00TV3_A3692ComForFec ;
   private boolean[] T00TV3_n3692ComForFec ;
   private String[] T00TV3_A3690ComForTxt ;
   private boolean[] T00TV3_n3690ComForTxt ;
   private String[] T00TV3_A396EmprCod ;
   private String[] T00TV3_A3679TipComFor ;
   private boolean[] T00TV3_n3679TipComFor ;
   private int[] T00TV3_A252CliCod ;
   private boolean[] T00TV3_n252CliCod ;
   private String[] T00TV2_A494ForSer ;
   private boolean[] T00TV2_n494ForSer ;
   private String[] T00TV2_A482ForColNom ;
   private boolean[] T00TV2_n482ForColNom ;
   private int[] T00TV2_A483ForColNum ;
   private boolean[] T00TV2_n483ForColNum ;
   private byte[] T00TV2_A831TipColCod ;
   private boolean[] T00TV2_n831TipColCod ;
   private short[] T00TV2_A3689ComForLin ;
   private String[] T00TV2_A3691ComForUsu ;
   private boolean[] T00TV2_n3691ComForUsu ;
   private java.util.Date[] T00TV2_A3692ComForFec ;
   private boolean[] T00TV2_n3692ComForFec ;
   private String[] T00TV2_A3690ComForTxt ;
   private boolean[] T00TV2_n3690ComForTxt ;
   private String[] T00TV2_A396EmprCod ;
   private String[] T00TV2_A3679TipComFor ;
   private boolean[] T00TV2_n3679TipComFor ;
   private int[] T00TV2_A252CliCod ;
   private boolean[] T00TV2_n252CliCod ;
   private String[] T00TV39_A3680TipComDsc ;
   private boolean[] T00TV39_n3680TipComDsc ;
   private String[] T00TV40_A396EmprCod ;
   private int[] T00TV40_A252CliCod ;
   private boolean[] T00TV40_n252CliCod ;
   private String[] T00TV40_A494ForSer ;
   private boolean[] T00TV40_n494ForSer ;
   private String[] T00TV40_A482ForColNom ;
   private boolean[] T00TV40_n482ForColNom ;
   private int[] T00TV40_A483ForColNum ;
   private boolean[] T00TV40_n483ForColNum ;
   private byte[] T00TV40_A831TipColCod ;
   private boolean[] T00TV40_n831TipColCod ;
   private short[] T00TV40_A3689ComForLin ;
   private String[] T00TV41_A407EmprNom ;
   private boolean[] T00TV41_n407EmprNom ;
   private String[] T00TV42_A396EmprCod ;
   private String[] T00TV43_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfortxt__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfortxt__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfortxt__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfortxt__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfortxt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00TV2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ComForLin, ComForUsu, ComForFec, ComForTxt, EmprCod, TipComFor, CliCod FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ComForLin = ?  FOR UPDATE OF ComForUsu, ComForFec, ComForTxt, TipComFor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ComForLin, ComForUsu, ComForFec, ComForTxt, EmprCod, TipComFor, CliCod FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ComForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV4", "SELECT TipComDsc FROM TXPCOMFOR WHERE EmprCod = ? AND TipComFor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV5", "SELECT ForSer, ForColNom, ForColNum, ComUltLin, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ComUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV6", "SELECT ForSer, ForColNom, ForColNum, ComUltLin, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV8", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV9", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV10", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ComUltLin, T2.EmprNom, TM1.EmprCod, TM1.CliCod, TM1.TipColCod FROM (TXPCFORMU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TV14", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ComUltLin, EmprCod, CliCod, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForSerDsc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T00TV15", "UPDATE TXPCFORMU SET ComUltLin=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T00TV16", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T00TV17", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV18", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV19", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV20", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV21", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV22", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV23", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV25", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV26", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV27", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV28", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV29", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV30", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00TV31", "UPDATE TXPCFORMU SET ComUltLin=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T00TV32", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00TV33", "SELECT T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ComForLin, T1.ComForUsu, T1.ComForFec, T2.TipComDsc, T1.ComForTxt, T1.EmprCod, T1.TipComFor, T1.CliCod FROM (TXPFORCOM T1 LEFT JOIN TXPCOMFOR T2 ON T2.EmprCod = T1.EmprCod AND T2.TipComFor = T1.TipComFor) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? and T1.ComForLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ComForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV34", "SELECT TipComDsc FROM TXPCOMFOR WHERE EmprCod = ? AND TipComFor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV35", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ComForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00TV36", "INSERT INTO TXPFORCOM(ForSer, ForColNom, ForColNum, TipColCod, ComForLin, ComForUsu, ComForFec, ComForTxt, EmprCod, TipComFor, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFORCOM")
         ,new UpdateCursor("T00TV37", "UPDATE TXPFORCOM SET ComForUsu=?, ComForFec=?, ComForTxt=?, TipComFor=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ComForLin = ?", GX_NOMASK, "TXPFORCOM")
         ,new UpdateCursor("T00TV38", "DELETE FROM TXPFORCOM  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ComForLin = ?", GX_NOMASK, "TXPFORCOM")
         ,new ForEachCursor("T00TV39", "SELECT TipComDsc FROM TXPCOMFOR WHERE EmprCod = ? AND TipComFor = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV40", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV41", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV42", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00TV43", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 60);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 3);
               ((String[]) buf[14])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 15);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 13);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 15);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 13);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 60);
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 15);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 60);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 15);
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 15);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
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
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

