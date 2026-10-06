package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpcacp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"CACPPD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7262CACPP = httpContext.GetPar( "CACPP") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asacacppd1F71565( A396EmprCod, A7262CACPP) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-COR-PROC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtForSerDsc_Internalname ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
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

   public tpcacp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpcacp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpcacp_impl.class ));
   }

   public tpcacp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPCACP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPCACP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1565 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1565 = (short)(1) ;
            scanStart1F71565( ) ;
            while ( RcdFound1565 != 0 )
            {
               init_level_properties1565( ) ;
               getByPrimaryKey1F71565( ) ;
               addRow1F71565( ) ;
               scanNext1F71565( ) ;
            }
            scanEnd1F71565( ) ;
            nBlankRcdCount1565 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1F71565( ) ;
         standaloneModal1F71565( ) ;
         sMode1565 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRow1F71565( ) ;
            edtavnRcdDeleted_1565_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1565_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1565_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1565_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCACPP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPP_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCACPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCACPPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCACPPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCACPPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPRK_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCACPPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPrK_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtCACPPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPRM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCACPPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPrM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_1565 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1F71565( ) ;
            }
            sendRow1F71565( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode1565 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1565 = (short)(5) ;
         nRcdExists_1565 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1F71565( ) ;
            while ( RcdFound1565 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_651565( ) ;
               init_level_properties1565( ) ;
               standaloneNotModal1F71565( ) ;
               getByPrimaryKey1F71565( ) ;
               standaloneModal1F71565( ) ;
               addRow1F71565( ) ;
               scanNext1F71565( ) ;
            }
            scanEnd1F71565( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1565 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_651565( ) ;
      initAll1F71565( ) ;
      init_level_properties1565( ) ;
      nRcdExists_1565 = (short)(0) ;
      nIsMod_1565 = (short)(0) ;
      nRcdDeleted_1565 = (short)(0) ;
      nBlankRcdCount1565 = (short)(nBlankRcdUsr1565+nBlankRcdCount1565) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1565 > 0 )
      {
         standaloneNotModal1F71565( ) ;
         standaloneModal1F71565( ) ;
         addRow1F71565( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCACPP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1565 = (short)(nBlankRcdCount1565-1) ;
      }
      Gx_mode = sMode1565 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPCACP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPCACP.htm");
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
      e111F72 ();
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
            Z5742ForSerDsc = httpContext.cgiGet( "Z5742ForSerDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
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
                        e111F72 ();
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
            initAll1F747( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1565_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1565_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributes1F747( ) ;
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

   public void confirm_1F70( )
   {
      beforeValidate1F747( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1F747( ) ;
         }
         else
         {
            checkExtendedTable1F747( ) ;
            if ( AnyError == 0 )
            {
               zm1F747( 4) ;
               zm1F747( 5) ;
            }
            closeExtendedTableCursors1F747( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode47 = Gx_mode ;
         confirm_1F71565( ) ;
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
         confirmValues1F70( ) ;
      }
   }

   public void confirm_1F71565( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1F71565( ) ;
         if ( ( nRcdExists_1565 != 0 ) || ( nIsMod_1565 != 0 ) )
         {
            getKey1F71565( ) ;
            if ( ( nRcdExists_1565 == 0 ) && ( nRcdDeleted_1565 == 0 ) )
            {
               if ( RcdFound1565 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1F71565( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1F71565( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1F71565( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CACPP_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCACPP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1565 != 0 )
               {
                  if ( nRcdDeleted_1565 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1F71565( ) ;
                     load1F71565( ) ;
                     beforeValidate1F71565( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1F71565( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1565 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1F71565( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1F71565( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1F71565( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1565 == 0 )
                  {
                     GXCCtl = "CACPP_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCACPP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1565_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCACPP_Internalname, GXutil.rtrim( A7262CACPP)) ;
         httpContext.changePostValue( edtCACPPD_Internalname, GXutil.rtrim( A7263CACPPD)) ;
         httpContext.changePostValue( edtCACPPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCACPPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7262CACPP_"+sGXsfl_65_idx, GXutil.rtrim( Z7262CACPP)) ;
         httpContext.changePostValue( "ZT_"+"Z7264CACPPrK_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7265CACPPrM_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1565 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1565_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1565_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPRK_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPRM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1F70( )
   {
   }

   public void e111F72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      tpcacp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpcacp_impl.this.A396EmprCod = GXv_char2[0] ;
      tpcacp_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpcacp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1F747( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5742ForSerDsc = T01F75_A5742ForSerDsc[0] ;
         }
         else
         {
            Z5742ForSerDsc = A5742ForSerDsc ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TPCACP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01F76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01F76_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T01F77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01F77_A832TipColDsc[0] ;
      n832TipColDsc = T01F77_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
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

   public void load1F747( )
   {
      /* Using cursor T01F78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A5742ForSerDsc = T01F78_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01F78_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A279CliNom = T01F78_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A832TipColDsc = T01F78_A832TipColDsc[0] ;
         n832TipColDsc = T01F78_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         zm1F747( -3) ;
      }
      pr_default.close(6);
      onLoadActions1F747( ) ;
   }

   public void onLoadActions1F747( )
   {
   }

   public void checkExtendedTable1F747( )
   {
      nIsDirty_47 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1F747( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1F747( )
   {
      /* Using cursor T01F79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01F75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01F75_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F75_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F75_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01F75_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F75_A252CliCod[0] == A252CliCod ) && ( T01F75_A831TipColCod[0] == A831TipColCod ) )
      {
         zm1F747( 3) ;
         RcdFound47 = (short)(1) ;
         A5742ForSerDsc = T01F75_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T01F75_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
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
         load1F747( ) ;
         if ( AnyError == 1 )
         {
            RcdFound47 = (short)(0) ;
            initializeNonKey1F747( ) ;
         }
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1F747( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1F747( ) ;
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
      /* Using cursor T01F710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F710_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F710_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F710_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F710_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F710_A483ForColNum[0] == A483ForColNum ) && ( T01F710_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01F710_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F710_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F710_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F710_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F710_A483ForColNum[0] == A483ForColNum ) && ( T01F710_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T01F711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F711_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F711_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F711_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F711_A483ForColNum[0] == A483ForColNum ) && ( T01F711_A831TipColCod[0] == A831TipColCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01F711_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F711_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01F711_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F711_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F711_A483ForColNum[0] == A483ForColNum ) && ( T01F711_A831TipColCod[0] == A831TipColCod ) )
         {
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1F747( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtForSerDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1F747( ) ;
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
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1F747( ) ;
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtForSerDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1F747( ) ;
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
                  GX_FocusControl = edtForSerDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1F747( ) ;
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
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtForSerDsc_Internalname ;
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
      getKey1F747( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcacp");
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1F70( ) ;
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
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1F747( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F747( ) ;
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
      GX_FocusControl = edtForSerDsc_Internalname ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
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
      scanStart1F747( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1F747( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForSerDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1F747( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1F747( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z5742ForSerDsc, T01F74_A5742ForSerDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z5742ForSerDsc, T01F74_A5742ForSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpcacp:[seudo value changed for attri]"+"ForSerDsc");
               GXutil.writeLogRaw("Old: ",Z5742ForSerDsc);
               GXutil.writeLogRaw("Current: ",T01F74_A5742ForSerDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F747( )
   {
      beforeValidate1F747( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F747( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F747( 0) ;
         checkOptimisticConcurrency1F747( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F747( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F747( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F712 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
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
                        processLevel1F747( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1F70( ) ;
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
            load1F747( ) ;
         }
         endLevel1F747( ) ;
      }
      closeExtendedTableCursors1F747( ) ;
   }

   public void update1F747( )
   {
      beforeValidate1F747( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F747( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F747( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F747( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1F747( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F713 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n5742ForSerDsc), A5742ForSerDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1F747( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1F747( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1F70( ) ;
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
         endLevel1F747( ) ;
      }
      closeExtendedTableCursors1F747( ) ;
   }

   public void deferredUpdate1F747( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F747( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F747( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F747( ) ;
         afterConfirm1F747( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F747( ) ;
            if ( AnyError == 0 )
            {
               scanStart1F71565( ) ;
               while ( RcdFound1565 != 0 )
               {
                  getByPrimaryKey1F71565( ) ;
                  delete1F71565( ) ;
                  scanNext1F71565( ) ;
               }
               scanEnd1F71565( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F714 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
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
                           initAll1F747( ) ;
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
                        resetCaption1F70( ) ;
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
      endLevel1F747( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F747( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01F715 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01F716 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CABECERA ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01F717 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOPCD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01F718 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCOLAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01F719 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORMQPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01F720 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01F721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLARPDCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01F722 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01F723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01F724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01F725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01F726 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01F727 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01F728 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOBFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel1F71565( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRow1F71565( ) ;
         if ( ( nRcdExists_1565 != 0 ) || ( nIsMod_1565 != 0 ) )
         {
            standaloneNotModal1F71565( ) ;
            getKey1F71565( ) ;
            if ( ( nRcdExists_1565 == 0 ) && ( nRcdDeleted_1565 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1F71565( ) ;
            }
            else
            {
               if ( RcdFound1565 != 0 )
               {
                  if ( ( nRcdDeleted_1565 != 0 ) && ( nRcdExists_1565 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1F71565( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1565 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1F71565( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1565 == 0 )
                  {
                     GXCCtl = "CACPP_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCACPP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1565_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCACPP_Internalname, GXutil.rtrim( A7262CACPP)) ;
         httpContext.changePostValue( edtCACPPD_Internalname, GXutil.rtrim( A7263CACPPD)) ;
         httpContext.changePostValue( edtCACPPrK_Internalname, GXutil.ltrim( localUtil.ntoc( A7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCACPPrM_Internalname, GXutil.ltrim( localUtil.ntoc( A7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7262CACPP_"+sGXsfl_65_idx, GXutil.rtrim( Z7262CACPP)) ;
         httpContext.changePostValue( "ZT_"+"Z7264CACPPrK_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7265CACPPrM_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1565_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1565 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1565_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1565_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPRK_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CACPPRM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1F71565( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1565 = (short)(0) ;
      nIsMod_1565 = (short)(0) ;
      nRcdDeleted_1565 = (short)(0) ;
   }

   public void processLevel1F747( )
   {
      /* Save parent mode. */
      sMode47 = Gx_mode ;
      processNestedLevel1F71565( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1F747( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1F747( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpcacp");
         if ( AnyError == 0 )
         {
            confirmValues1F70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpcacp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1F747( )
   {
      /* Scan By routine */
      /* Using cursor T01F729 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F747( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
   }

   public void scanEnd1F747( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1F747( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F747( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F747( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F747( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F747( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F747( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F747( )
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
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
   }

   public void zm1F71565( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7264CACPPrK = T01F73_A7264CACPPrK[0] ;
            Z7265CACPPrM = T01F73_A7265CACPPrM[0] ;
         }
         else
         {
            Z7264CACPPrK = A7264CACPPrK ;
            Z7265CACPPrM = A7265CACPPrM ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7262CACPP = A7262CACPP ;
         Z7264CACPPrK = A7264CACPPrK ;
         Z7265CACPPrM = A7265CACPPrM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1F71565( )
   {
   }

   public void standaloneModal1F71565( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCACPP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCACPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtCACPP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCACPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void load1F71565( )
   {
      /* Using cursor T01F730 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1565 = (short)(1) ;
         A7264CACPPrK = T01F730_A7264CACPPrK[0] ;
         n7264CACPPrK = T01F730_n7264CACPPrK[0] ;
         A7265CACPPrM = T01F730_A7265CACPPrM[0] ;
         n7265CACPPrM = T01F730_n7265CACPPrM[0] ;
         zm1F71565( -6) ;
      }
      pr_default.close(28);
      onLoadActions1F71565( ) ;
   }

   public void onLoadActions1F71565( )
   {
      GXt_char1 = A7263CACPPD ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7262CACPP, GXv_char4) ;
      tpcacp_impl.this.GXt_char1 = GXv_char4[0] ;
      A7263CACPPD = GXt_char1 ;
   }

   public void checkExtendedTable1F71565( )
   {
      nIsDirty_1565 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1F71565( ) ;
      nIsDirty_1565 = (short)(1) ;
      GXt_char1 = A7263CACPPD ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7262CACPP, GXv_char4) ;
      tpcacp_impl.this.GXt_char1 = GXv_char4[0] ;
      A7263CACPPD = GXt_char1 ;
   }

   public void closeExtendedTableCursors1F71565( )
   {
   }

   public void enableDisable1F71565( )
   {
   }

   public void getKey1F71565( )
   {
      /* Using cursor T01F731 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1565 = (short)(1) ;
      }
      else
      {
         RcdFound1565 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1F71565( )
   {
      /* Using cursor T01F73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01F73_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01F73_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01F73_A483ForColNum[0] == A483ForColNum ) && ( T01F73_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01F73_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01F73_A252CliCod[0] == A252CliCod ) )
      {
         zm1F71565( 6) ;
         RcdFound1565 = (short)(1) ;
         initializeNonKey1F71565( ) ;
         A7262CACPP = T01F73_A7262CACPP[0] ;
         A7264CACPPrK = T01F73_A7264CACPPrK[0] ;
         n7264CACPPrK = T01F73_n7264CACPPrK[0] ;
         A7265CACPPrM = T01F73_A7265CACPPrM[0] ;
         n7265CACPPrM = T01F73_n7265CACPPrM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z7262CACPP = A7262CACPP ;
         sMode1565 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F71565( ) ;
         load1F71565( ) ;
         Gx_mode = sMode1565 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1565 = (short)(0) ;
         initializeNonKey1F71565( ) ;
         sMode1565 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1F71565( ) ;
         Gx_mode = sMode1565 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1F71565( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1F71565( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01F72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCACP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7264CACPPrK, T01F72_A7264CACPPrK[0]) != 0 ) || ( DecimalUtil.compareTo(Z7265CACPPrM, T01F72_A7265CACPPrM[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7264CACPPrK, T01F72_A7264CACPPrK[0]) != 0 )
            {
               GXutil.writeLogln("tpcacp:[seudo value changed for attri]"+"CACPPrK");
               GXutil.writeLogRaw("Old: ",Z7264CACPPrK);
               GXutil.writeLogRaw("Current: ",T01F72_A7264CACPPrK[0]);
            }
            if ( DecimalUtil.compareTo(Z7265CACPPrM, T01F72_A7265CACPPrM[0]) != 0 )
            {
               GXutil.writeLogln("tpcacp:[seudo value changed for attri]"+"CACPPrM");
               GXutil.writeLogRaw("Old: ",Z7265CACPPrM);
               GXutil.writeLogRaw("Current: ",T01F72_A7265CACPPrM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPCACP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1F71565( )
   {
      beforeValidate1F71565( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F71565( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1F71565( 0) ;
         checkOptimisticConcurrency1F71565( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1F71565( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1F71565( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01F732 */
                  pr_default.execute(30, new Object[] {Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP, Boolean.valueOf(n7264CACPPrK), A7264CACPPrK, Boolean.valueOf(n7265CACPPrM), A7265CACPPrM, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCACP");
                  if ( (pr_default.getStatus(30) == 1) )
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
            load1F71565( ) ;
         }
         endLevel1F71565( ) ;
      }
      closeExtendedTableCursors1F71565( ) ;
   }

   public void update1F71565( )
   {
      beforeValidate1F71565( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1F71565( ) ;
      }
      if ( ( nIsMod_1565 != 0 ) || ( nIsDirty_1565 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1F71565( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1F71565( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1F71565( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01F733 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n7264CACPPrK), A7264CACPPrK, Boolean.valueOf(n7265CACPPrM), A7265CACPPrM, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCACP");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPCACP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1F71565( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1F71565( ) ;
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
            endLevel1F71565( ) ;
         }
      }
      closeExtendedTableCursors1F71565( ) ;
   }

   public void deferredUpdate1F71565( )
   {
   }

   public void delete1F71565( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1F71565( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1F71565( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1F71565( ) ;
         afterConfirm1F71565( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1F71565( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01F734 */
               pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod), A7262CACPP});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPCACP");
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
      sMode1565 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1F71565( ) ;
      Gx_mode = sMode1565 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1F71565( )
   {
      standaloneModal1F71565( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A7263CACPPD ;
         GXv_char4[0] = GXt_char1 ;
         new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7262CACPP, GXv_char4) ;
         tpcacp_impl.this.GXt_char1 = GXv_char4[0] ;
         A7263CACPPD = GXt_char1 ;
      }
   }

   public void endLevel1F71565( )
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

   public void scanStart1F71565( )
   {
      /* Scan By routine */
      /* Using cursor T01F735 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n494ForSer), A494ForSer, Boolean.valueOf(n482ForColNom), A482ForColNom, Boolean.valueOf(n483ForColNum), Integer.valueOf(A483ForColNum), Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      RcdFound1565 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1565 = (short)(1) ;
         A7262CACPP = T01F735_A7262CACPP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1F71565( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1565 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1565 = (short)(1) ;
         A7262CACPP = T01F735_A7262CACPP[0] ;
      }
   }

   public void scanEnd1F71565( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1F71565( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1F71565( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1F71565( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1F71565( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1F71565( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1F71565( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1F71565( )
   {
      edtCACPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCACPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCACPPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCACPPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPD_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCACPPrK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCACPPrK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPrK_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtCACPPrM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCACPPrM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPPrM_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashes1F71565( )
   {
   }

   public void send_integrity_lvl_hashes1F747( )
   {
   }

   public void subsflControlProps_651565( )
   {
      edtavnRcdDeleted_1565_Internalname = "vNRCDDELETED_1565_"+sGXsfl_65_idx ;
      edtCACPP_Internalname = "CACPP_"+sGXsfl_65_idx ;
      edtCACPPD_Internalname = "CACPPD_"+sGXsfl_65_idx ;
      edtCACPPrK_Internalname = "CACPPRK_"+sGXsfl_65_idx ;
      edtCACPPrM_Internalname = "CACPPRM_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_651565( )
   {
      edtavnRcdDeleted_1565_Internalname = "vNRCDDELETED_1565_"+sGXsfl_65_fel_idx ;
      edtCACPP_Internalname = "CACPP_"+sGXsfl_65_fel_idx ;
      edtCACPPD_Internalname = "CACPPD_"+sGXsfl_65_fel_idx ;
      edtCACPPrK_Internalname = "CACPPRK_"+sGXsfl_65_fel_idx ;
      edtCACPPrM_Internalname = "CACPPRM_"+sGXsfl_65_fel_idx ;
   }

   public void addRow1F71565( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651565( ) ;
      sendRow1F71565( ) ;
   }

   public void sendRow1F71565( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1565_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1565_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1565_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1565), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1565), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1565_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1565_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1565_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCACPP_Internalname,GXutil.rtrim( A7262CACPP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCACPP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCACPP_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCACPPD_Internalname,GXutil.rtrim( A7263CACPPD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCACPPD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCACPPD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1565_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCACPPrK_Internalname,GXutil.ltrim( localUtil.ntoc( A7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCACPPrK_Enabled!=0) ? localUtil.format( A7264CACPPrK, "ZZZZZ9.99999") : localUtil.format( A7264CACPPrK, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCACPPrK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCACPPrK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1565_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCACPPrM_Internalname,GXutil.ltrim( localUtil.ntoc( A7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCACPPrM_Enabled!=0) ? localUtil.format( A7265CACPPrM, "ZZZZZ9.99999") : localUtil.format( A7265CACPPrM, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCACPPrM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCACPPrM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1F71565( ) ;
      GXCCtl = "Z7262CACPP_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7262CACPP));
      GXCCtl = "Z7264CACPPrK_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7264CACPPrK, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7265CACPPrM_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7265CACPPrM, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1565_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1565_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1565_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1565, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1565_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1565_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CACPP_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CACPPD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CACPPRK_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CACPPRM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1F71565( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651565( ) ;
      edtavnRcdDeleted_1565_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1565_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCACPP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPP_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCACPPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCACPPrK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPRK_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCACPPrM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CACPPRM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1565_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1565_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1565");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1565_Internalname ;
         wbErr = true ;
         nRcdDeleted_1565 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1565 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1565_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7262CACPP = httpContext.cgiGet( edtCACPP_Internalname) ;
      A7263CACPPD = httpContext.cgiGet( edtCACPPD_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCACPPrK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCACPPrK_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CACPPRK_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCACPPrK_Internalname ;
         wbErr = true ;
         A7264CACPPrK = DecimalUtil.ZERO ;
         n7264CACPPrK = false ;
      }
      else
      {
         A7264CACPPrK = localUtil.ctond( httpContext.cgiGet( edtCACPPrK_Internalname)) ;
         n7264CACPPrK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCACPPrM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCACPPrM_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CACPPRM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCACPPrM_Internalname ;
         wbErr = true ;
         A7265CACPPrM = DecimalUtil.ZERO ;
         n7265CACPPrM = false ;
      }
      else
      {
         A7265CACPPrM = localUtil.ctond( httpContext.cgiGet( edtCACPPrM_Internalname)) ;
         n7265CACPPrM = false ;
      }
      GXCCtl = "Z7262CACPP_" + sGXsfl_65_idx ;
      Z7262CACPP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7264CACPPrK_" + sGXsfl_65_idx ;
      Z7264CACPPrK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7265CACPPrM_" + sGXsfl_65_idx ;
      Z7265CACPPrM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1565_" + sGXsfl_65_idx ;
      nRcdDeleted_1565 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1565_" + sGXsfl_65_idx ;
      nRcdExists_1565 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1565_" + sGXsfl_65_idx ;
      nIsMod_1565 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCACPP_Enabled = edtCACPP_Enabled ;
   }

   public void confirmValues1F70( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_651565( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651565( ) ;
         httpContext.changePostValue( "Z7262CACPP_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7262CACPP_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7262CACPP_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7264CACPPrK_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7264CACPPrK_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7264CACPPrK_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z7265CACPPrM_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z7265CACPPrM_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7265CACPPrM_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpcacp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpcacp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPCACP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-COR-PROC", "") ;
   }

   public void initializeNonKey1F747( )
   {
      A5742ForSerDsc = "" ;
      n5742ForSerDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      Z5742ForSerDsc = "" ;
   }

   public void initAll1F747( )
   {
      initializeNonKey1F747( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1F71565( )
   {
      A7263CACPPD = "" ;
      A7264CACPPrK = DecimalUtil.ZERO ;
      n7264CACPPrK = false ;
      A7265CACPPrM = DecimalUtil.ZERO ;
      n7265CACPPrM = false ;
      Z7264CACPPrK = DecimalUtil.ZERO ;
      Z7265CACPPrM = DecimalUtil.ZERO ;
   }

   public void initAll1F71565( )
   {
      A7262CACPP = "" ;
      initializeNonKey1F71565( ) ;
   }

   public void standaloneModalInsert1F71565( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016313545", true, true);
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
      httpContext.AddJavascriptSource("tpcacp.js", "?202661016313545", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1565( )
   {
      edtCACPP_Enabled = defedtCACPP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCACPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCACPP_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1565, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1565_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7262CACPP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7263CACPPD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7264CACPPrK, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7265CACPPrM, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCACPPrM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtavnRcdDeleted_1565_Internalname = "vNRCDDELETED_1565" ;
      edtCACPP_Internalname = "CACPP" ;
      edtCACPPD_Internalname = "CACPPD" ;
      edtCACPPrK_Internalname = "CACPPRK" ;
      edtCACPPrM_Internalname = "CACPPRM" ;
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
      Form.setCaption( httpContext.getMessage( "PRECIO CLIENTE-ARTIGO-COR-PROC", "") );
      edtCACPPrM_Jsonclick = "" ;
      edtCACPPrK_Jsonclick = "" ;
      edtCACPPD_Jsonclick = "" ;
      edtCACPP_Jsonclick = "" ;
      edtavnRcdDeleted_1565_Jsonclick = "" ;
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
      edtCACPPrM_Enabled = 1 ;
      edtCACPPrK_Enabled = 1 ;
      edtCACPPD_Enabled = 0 ;
      edtCACPP_Enabled = 1 ;
      edtavnRcdDeleted_1565_Enabled = 1 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 1 ;
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

   public void gx2asacacppd1F71565( String A396EmprCod ,
                                    String A7262CACPP )
   {
      GXt_char1 = A7263CACPPD ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7262CACPP, GXv_char4) ;
      tpcacp_impl.this.GXt_char1 = GXv_char4[0] ;
      A7263CACPPD = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7263CACPPD))+"\"") ;
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
      subsflControlProps_651565( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1F71565( ) ;
         standaloneModal1F71565( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1F71565( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_651565( ) ;
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
      /* Using cursor T01F736 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01F736_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(34);
      /* Using cursor T01F737 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n831TipColCod), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01F737_A832TipColDsc[0] ;
      n832TipColDsc = T01F737_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(35);
      GX_FocusControl = edtForSerDsc_Internalname ;
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

   public void valid_Tipcolcod( )
   {
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
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cacpp( )
   {
      GXt_char1 = A7263CACPPD ;
      GXv_char4[0] = GXt_char1 ;
      new app.pdscprd(remoteHandle, context).execute( A396EmprCod, A7262CACPP, GXv_char4) ;
      tpcacp_impl.this.GXt_char1 = GXv_char4[0] ;
      A7263CACPPD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7263CACPPD", GXutil.rtrim( A7263CACPPD));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
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
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z5742ForSerDsc'},{av:'Z279CliNom'},{av:'Z832TipColDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CACPP","{handler:'valid_Cacpp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7262CACPP',fld:'CACPP',pic:''},{av:'A7263CACPPD',fld:'CACPPD',pic:''}]");
      setEventMetadata("VALID_CACPP",",oparms:[{av:'A7263CACPPD',fld:'CACPPD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cacpprm',iparms:[]");
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
      pr_default.close(34);
      pr_default.close(35);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z5742ForSerDsc = "" ;
      Z7262CACPP = "" ;
      Z7264CACPPrK = DecimalUtil.ZERO ;
      Z7265CACPPrM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A7262CACPP = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A832TipColDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1565 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode47 = "" ;
      GXCCtl = "" ;
      A7263CACPPD = "" ;
      A7264CACPPrK = DecimalUtil.ZERO ;
      A7265CACPPrM = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      T01F76_A279CliNom = new String[] {""} ;
      T01F77_A832TipColDsc = new String[] {""} ;
      T01F77_n832TipColDsc = new boolean[] {false} ;
      T01F78_A494ForSer = new String[] {""} ;
      T01F78_n494ForSer = new boolean[] {false} ;
      T01F78_A482ForColNom = new String[] {""} ;
      T01F78_n482ForColNom = new boolean[] {false} ;
      T01F78_A483ForColNum = new int[1] ;
      T01F78_n483ForColNum = new boolean[] {false} ;
      T01F78_A5742ForSerDsc = new String[] {""} ;
      T01F78_n5742ForSerDsc = new boolean[] {false} ;
      T01F78_A279CliNom = new String[] {""} ;
      T01F78_A832TipColDsc = new String[] {""} ;
      T01F78_n832TipColDsc = new boolean[] {false} ;
      T01F78_A396EmprCod = new String[] {""} ;
      T01F78_A252CliCod = new int[1] ;
      T01F78_n252CliCod = new boolean[] {false} ;
      T01F78_A831TipColCod = new byte[1] ;
      T01F78_n831TipColCod = new boolean[] {false} ;
      T01F79_A396EmprCod = new String[] {""} ;
      T01F79_A252CliCod = new int[1] ;
      T01F79_n252CliCod = new boolean[] {false} ;
      T01F79_A494ForSer = new String[] {""} ;
      T01F79_n494ForSer = new boolean[] {false} ;
      T01F79_A482ForColNom = new String[] {""} ;
      T01F79_n482ForColNom = new boolean[] {false} ;
      T01F79_A483ForColNum = new int[1] ;
      T01F79_n483ForColNum = new boolean[] {false} ;
      T01F79_A831TipColCod = new byte[1] ;
      T01F79_n831TipColCod = new boolean[] {false} ;
      T01F75_A494ForSer = new String[] {""} ;
      T01F75_n494ForSer = new boolean[] {false} ;
      T01F75_A482ForColNom = new String[] {""} ;
      T01F75_n482ForColNom = new boolean[] {false} ;
      T01F75_A483ForColNum = new int[1] ;
      T01F75_n483ForColNum = new boolean[] {false} ;
      T01F75_A5742ForSerDsc = new String[] {""} ;
      T01F75_n5742ForSerDsc = new boolean[] {false} ;
      T01F75_A396EmprCod = new String[] {""} ;
      T01F75_A252CliCod = new int[1] ;
      T01F75_n252CliCod = new boolean[] {false} ;
      T01F75_A831TipColCod = new byte[1] ;
      T01F75_n831TipColCod = new boolean[] {false} ;
      T01F710_A396EmprCod = new String[] {""} ;
      T01F710_A252CliCod = new int[1] ;
      T01F710_n252CliCod = new boolean[] {false} ;
      T01F710_A494ForSer = new String[] {""} ;
      T01F710_n494ForSer = new boolean[] {false} ;
      T01F710_A482ForColNom = new String[] {""} ;
      T01F710_n482ForColNom = new boolean[] {false} ;
      T01F710_A483ForColNum = new int[1] ;
      T01F710_n483ForColNum = new boolean[] {false} ;
      T01F710_A831TipColCod = new byte[1] ;
      T01F710_n831TipColCod = new boolean[] {false} ;
      T01F711_A396EmprCod = new String[] {""} ;
      T01F711_A252CliCod = new int[1] ;
      T01F711_n252CliCod = new boolean[] {false} ;
      T01F711_A494ForSer = new String[] {""} ;
      T01F711_n494ForSer = new boolean[] {false} ;
      T01F711_A482ForColNom = new String[] {""} ;
      T01F711_n482ForColNom = new boolean[] {false} ;
      T01F711_A483ForColNum = new int[1] ;
      T01F711_n483ForColNum = new boolean[] {false} ;
      T01F711_A831TipColCod = new byte[1] ;
      T01F711_n831TipColCod = new boolean[] {false} ;
      T01F74_A494ForSer = new String[] {""} ;
      T01F74_n494ForSer = new boolean[] {false} ;
      T01F74_A482ForColNom = new String[] {""} ;
      T01F74_n482ForColNom = new boolean[] {false} ;
      T01F74_A483ForColNum = new int[1] ;
      T01F74_n483ForColNum = new boolean[] {false} ;
      T01F74_A5742ForSerDsc = new String[] {""} ;
      T01F74_n5742ForSerDsc = new boolean[] {false} ;
      T01F74_A396EmprCod = new String[] {""} ;
      T01F74_A252CliCod = new int[1] ;
      T01F74_n252CliCod = new boolean[] {false} ;
      T01F74_A831TipColCod = new byte[1] ;
      T01F74_n831TipColCod = new boolean[] {false} ;
      T01F715_A396EmprCod = new String[] {""} ;
      T01F715_A252CliCod = new int[1] ;
      T01F715_n252CliCod = new boolean[] {false} ;
      T01F715_A494ForSer = new String[] {""} ;
      T01F715_n494ForSer = new boolean[] {false} ;
      T01F715_A482ForColNom = new String[] {""} ;
      T01F715_n482ForColNom = new boolean[] {false} ;
      T01F715_A483ForColNum = new int[1] ;
      T01F715_n483ForColNum = new boolean[] {false} ;
      T01F715_A831TipColCod = new byte[1] ;
      T01F715_n831TipColCod = new boolean[] {false} ;
      T01F715_A13377ForNormaID = new String[] {""} ;
      T01F716_A396EmprCod = new String[] {""} ;
      T01F716_A252CliCod = new int[1] ;
      T01F716_n252CliCod = new boolean[] {false} ;
      T01F716_A494ForSer = new String[] {""} ;
      T01F716_n494ForSer = new boolean[] {false} ;
      T01F716_A482ForColNom = new String[] {""} ;
      T01F716_n482ForColNom = new boolean[] {false} ;
      T01F716_A483ForColNum = new int[1] ;
      T01F716_n483ForColNum = new boolean[] {false} ;
      T01F716_A831TipColCod = new byte[1] ;
      T01F716_n831TipColCod = new boolean[] {false} ;
      T01F716_A3571EnsCod = new String[] {""} ;
      T01F717_A396EmprCod = new String[] {""} ;
      T01F717_A252CliCod = new int[1] ;
      T01F717_n252CliCod = new boolean[] {false} ;
      T01F717_A494ForSer = new String[] {""} ;
      T01F717_n494ForSer = new boolean[] {false} ;
      T01F717_A482ForColNom = new String[] {""} ;
      T01F717_n482ForColNom = new boolean[] {false} ;
      T01F717_A483ForColNum = new int[1] ;
      T01F717_n483ForColNum = new boolean[] {false} ;
      T01F717_A831TipColCod = new byte[1] ;
      T01F717_n831TipColCod = new boolean[] {false} ;
      T01F717_A7270Procod_c = new String[] {""} ;
      T01F717_A7272CliCod_d = new int[1] ;
      T01F718_A396EmprCod = new String[] {""} ;
      T01F718_A252CliCod = new int[1] ;
      T01F718_n252CliCod = new boolean[] {false} ;
      T01F718_A494ForSer = new String[] {""} ;
      T01F718_n494ForSer = new boolean[] {false} ;
      T01F718_A482ForColNom = new String[] {""} ;
      T01F718_n482ForColNom = new boolean[] {false} ;
      T01F718_A483ForColNum = new int[1] ;
      T01F718_n483ForColNum = new boolean[] {false} ;
      T01F718_A831TipColCod = new byte[1] ;
      T01F718_n831TipColCod = new boolean[] {false} ;
      T01F718_A6525ColAqP = new String[] {""} ;
      T01F719_A396EmprCod = new String[] {""} ;
      T01F719_A252CliCod = new int[1] ;
      T01F719_n252CliCod = new boolean[] {false} ;
      T01F719_A494ForSer = new String[] {""} ;
      T01F719_n494ForSer = new boolean[] {false} ;
      T01F719_A482ForColNom = new String[] {""} ;
      T01F719_n482ForColNom = new boolean[] {false} ;
      T01F719_A483ForColNum = new int[1] ;
      T01F719_n483ForColNum = new boolean[] {false} ;
      T01F719_A831TipColCod = new byte[1] ;
      T01F719_n831TipColCod = new boolean[] {false} ;
      T01F719_A6037Mq_Grupo = new byte[1] ;
      T01F720_A396EmprCod = new String[] {""} ;
      T01F720_A252CliCod = new int[1] ;
      T01F720_n252CliCod = new boolean[] {false} ;
      T01F720_A494ForSer = new String[] {""} ;
      T01F720_n494ForSer = new boolean[] {false} ;
      T01F720_A482ForColNom = new String[] {""} ;
      T01F720_n482ForColNom = new boolean[] {false} ;
      T01F720_A483ForColNum = new int[1] ;
      T01F720_n483ForColNum = new boolean[] {false} ;
      T01F720_A831TipColCod = new byte[1] ;
      T01F720_n831TipColCod = new boolean[] {false} ;
      T01F720_A853For_ProC = new String[] {""} ;
      T01F721_A396EmprCod = new String[] {""} ;
      T01F721_A252CliCod = new int[1] ;
      T01F721_n252CliCod = new boolean[] {false} ;
      T01F721_A494ForSer = new String[] {""} ;
      T01F721_n494ForSer = new boolean[] {false} ;
      T01F721_A482ForColNom = new String[] {""} ;
      T01F721_n482ForColNom = new boolean[] {false} ;
      T01F721_A483ForColNum = new int[1] ;
      T01F721_n483ForColNum = new boolean[] {false} ;
      T01F721_A831TipColCod = new byte[1] ;
      T01F721_n831TipColCod = new boolean[] {false} ;
      T01F721_A9766ForProC = new String[] {""} ;
      T01F722_A396EmprCod = new String[] {""} ;
      T01F722_A252CliCod = new int[1] ;
      T01F722_n252CliCod = new boolean[] {false} ;
      T01F722_A494ForSer = new String[] {""} ;
      T01F722_n494ForSer = new boolean[] {false} ;
      T01F722_A482ForColNom = new String[] {""} ;
      T01F722_n482ForColNom = new boolean[] {false} ;
      T01F722_A483ForColNum = new int[1] ;
      T01F722_n483ForColNum = new boolean[] {false} ;
      T01F722_A831TipColCod = new byte[1] ;
      T01F722_n831TipColCod = new boolean[] {false} ;
      T01F722_A7797Sim_lin = new short[1] ;
      T01F723_A396EmprCod = new String[] {""} ;
      T01F723_A252CliCod = new int[1] ;
      T01F723_n252CliCod = new boolean[] {false} ;
      T01F723_A494ForSer = new String[] {""} ;
      T01F723_n494ForSer = new boolean[] {false} ;
      T01F723_A482ForColNom = new String[] {""} ;
      T01F723_n482ForColNom = new boolean[] {false} ;
      T01F723_A483ForColNum = new int[1] ;
      T01F723_n483ForColNum = new boolean[] {false} ;
      T01F723_A831TipColCod = new byte[1] ;
      T01F723_n831TipColCod = new boolean[] {false} ;
      T01F723_A7094Acab_Ter = new String[] {""} ;
      T01F724_A396EmprCod = new String[] {""} ;
      T01F724_A252CliCod = new int[1] ;
      T01F724_n252CliCod = new boolean[] {false} ;
      T01F724_A494ForSer = new String[] {""} ;
      T01F724_n494ForSer = new boolean[] {false} ;
      T01F724_A482ForColNom = new String[] {""} ;
      T01F724_n482ForColNom = new boolean[] {false} ;
      T01F724_A483ForColNum = new int[1] ;
      T01F724_n483ForColNum = new boolean[] {false} ;
      T01F724_A831TipColCod = new byte[1] ;
      T01F724_n831TipColCod = new boolean[] {false} ;
      T01F724_A3689ComForLin = new short[1] ;
      T01F725_A396EmprCod = new String[] {""} ;
      T01F725_A252CliCod = new int[1] ;
      T01F725_n252CliCod = new boolean[] {false} ;
      T01F725_A494ForSer = new String[] {""} ;
      T01F725_n494ForSer = new boolean[] {false} ;
      T01F725_A482ForColNom = new String[] {""} ;
      T01F725_n482ForColNom = new boolean[] {false} ;
      T01F725_A483ForColNum = new int[1] ;
      T01F725_n483ForColNum = new boolean[] {false} ;
      T01F725_A831TipColCod = new byte[1] ;
      T01F725_n831TipColCod = new boolean[] {false} ;
      T01F725_A1519RecCorLin = new byte[1] ;
      T01F726_A396EmprCod = new String[] {""} ;
      T01F726_A252CliCod = new int[1] ;
      T01F726_n252CliCod = new boolean[] {false} ;
      T01F726_A494ForSer = new String[] {""} ;
      T01F726_n494ForSer = new boolean[] {false} ;
      T01F726_A482ForColNom = new String[] {""} ;
      T01F726_n482ForColNom = new boolean[] {false} ;
      T01F726_A483ForColNum = new int[1] ;
      T01F726_n483ForColNum = new boolean[] {false} ;
      T01F726_A831TipColCod = new byte[1] ;
      T01F726_n831TipColCod = new boolean[] {false} ;
      T01F726_A1160ProForL = new short[1] ;
      T01F727_A396EmprCod = new String[] {""} ;
      T01F727_A910Workstat = new String[] {""} ;
      T01F727_A880EscLin = new short[1] ;
      T01F728_A396EmprCod = new String[] {""} ;
      T01F728_A252CliCod = new int[1] ;
      T01F728_n252CliCod = new boolean[] {false} ;
      T01F728_A494ForSer = new String[] {""} ;
      T01F728_n494ForSer = new boolean[] {false} ;
      T01F728_A482ForColNom = new String[] {""} ;
      T01F728_n482ForColNom = new boolean[] {false} ;
      T01F728_A483ForColNum = new int[1] ;
      T01F728_n483ForColNum = new boolean[] {false} ;
      T01F728_A831TipColCod = new byte[1] ;
      T01F728_n831TipColCod = new boolean[] {false} ;
      T01F728_A650ObsLin = new short[1] ;
      T01F729_A396EmprCod = new String[] {""} ;
      T01F729_A252CliCod = new int[1] ;
      T01F729_n252CliCod = new boolean[] {false} ;
      T01F729_A494ForSer = new String[] {""} ;
      T01F729_n494ForSer = new boolean[] {false} ;
      T01F729_A482ForColNom = new String[] {""} ;
      T01F729_n482ForColNom = new boolean[] {false} ;
      T01F729_A483ForColNum = new int[1] ;
      T01F729_n483ForColNum = new boolean[] {false} ;
      T01F729_A831TipColCod = new byte[1] ;
      T01F729_n831TipColCod = new boolean[] {false} ;
      T01F730_A494ForSer = new String[] {""} ;
      T01F730_n494ForSer = new boolean[] {false} ;
      T01F730_A482ForColNom = new String[] {""} ;
      T01F730_n482ForColNom = new boolean[] {false} ;
      T01F730_A483ForColNum = new int[1] ;
      T01F730_n483ForColNum = new boolean[] {false} ;
      T01F730_A831TipColCod = new byte[1] ;
      T01F730_n831TipColCod = new boolean[] {false} ;
      T01F730_A7262CACPP = new String[] {""} ;
      T01F730_A7264CACPPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F730_n7264CACPPrK = new boolean[] {false} ;
      T01F730_A7265CACPPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F730_n7265CACPPrM = new boolean[] {false} ;
      T01F730_A396EmprCod = new String[] {""} ;
      T01F730_A252CliCod = new int[1] ;
      T01F730_n252CliCod = new boolean[] {false} ;
      T01F731_A396EmprCod = new String[] {""} ;
      T01F731_A252CliCod = new int[1] ;
      T01F731_n252CliCod = new boolean[] {false} ;
      T01F731_A494ForSer = new String[] {""} ;
      T01F731_n494ForSer = new boolean[] {false} ;
      T01F731_A482ForColNom = new String[] {""} ;
      T01F731_n482ForColNom = new boolean[] {false} ;
      T01F731_A483ForColNum = new int[1] ;
      T01F731_n483ForColNum = new boolean[] {false} ;
      T01F731_A831TipColCod = new byte[1] ;
      T01F731_n831TipColCod = new boolean[] {false} ;
      T01F731_A7262CACPP = new String[] {""} ;
      T01F73_A494ForSer = new String[] {""} ;
      T01F73_n494ForSer = new boolean[] {false} ;
      T01F73_A482ForColNom = new String[] {""} ;
      T01F73_n482ForColNom = new boolean[] {false} ;
      T01F73_A483ForColNum = new int[1] ;
      T01F73_n483ForColNum = new boolean[] {false} ;
      T01F73_A831TipColCod = new byte[1] ;
      T01F73_n831TipColCod = new boolean[] {false} ;
      T01F73_A7262CACPP = new String[] {""} ;
      T01F73_A7264CACPPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F73_n7264CACPPrK = new boolean[] {false} ;
      T01F73_A7265CACPPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F73_n7265CACPPrM = new boolean[] {false} ;
      T01F73_A396EmprCod = new String[] {""} ;
      T01F73_A252CliCod = new int[1] ;
      T01F73_n252CliCod = new boolean[] {false} ;
      T01F72_A494ForSer = new String[] {""} ;
      T01F72_n494ForSer = new boolean[] {false} ;
      T01F72_A482ForColNom = new String[] {""} ;
      T01F72_n482ForColNom = new boolean[] {false} ;
      T01F72_A483ForColNum = new int[1] ;
      T01F72_n483ForColNum = new boolean[] {false} ;
      T01F72_A831TipColCod = new byte[1] ;
      T01F72_n831TipColCod = new boolean[] {false} ;
      T01F72_A7262CACPP = new String[] {""} ;
      T01F72_A7264CACPPrK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F72_n7264CACPPrK = new boolean[] {false} ;
      T01F72_A7265CACPPrM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01F72_n7265CACPPrM = new boolean[] {false} ;
      T01F72_A396EmprCod = new String[] {""} ;
      T01F72_A252CliCod = new int[1] ;
      T01F72_n252CliCod = new boolean[] {false} ;
      T01F735_A396EmprCod = new String[] {""} ;
      T01F735_A252CliCod = new int[1] ;
      T01F735_n252CliCod = new boolean[] {false} ;
      T01F735_A494ForSer = new String[] {""} ;
      T01F735_n494ForSer = new boolean[] {false} ;
      T01F735_A482ForColNom = new String[] {""} ;
      T01F735_n482ForColNom = new boolean[] {false} ;
      T01F735_A483ForColNum = new int[1] ;
      T01F735_n483ForColNum = new boolean[] {false} ;
      T01F735_A831TipColCod = new byte[1] ;
      T01F735_n831TipColCod = new boolean[] {false} ;
      T01F735_A7262CACPP = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01F736_A279CliNom = new String[] {""} ;
      T01F737_A832TipColDsc = new String[] {""} ;
      T01F737_n832TipColDsc = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ279CliNom = "" ;
      ZZ832TipColDsc = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z7263CACPPD = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpcacp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpcacp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpcacp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpcacp__default(),
         new Object[] {
             new Object[] {
            T01F72_A494ForSer, T01F72_A482ForColNom, T01F72_A483ForColNum, T01F72_A831TipColCod, T01F72_A7262CACPP, T01F72_A7264CACPPrK, T01F72_n7264CACPPrK, T01F72_A7265CACPPrM, T01F72_n7265CACPPrM, T01F72_A396EmprCod,
            T01F72_A252CliCod
            }
            , new Object[] {
            T01F73_A494ForSer, T01F73_A482ForColNom, T01F73_A483ForColNum, T01F73_A831TipColCod, T01F73_A7262CACPP, T01F73_A7264CACPPrK, T01F73_n7264CACPPrK, T01F73_A7265CACPPrM, T01F73_n7265CACPPrM, T01F73_A396EmprCod,
            T01F73_A252CliCod
            }
            , new Object[] {
            T01F74_A494ForSer, T01F74_A482ForColNom, T01F74_A483ForColNum, T01F74_A5742ForSerDsc, T01F74_n5742ForSerDsc, T01F74_A396EmprCod, T01F74_A252CliCod, T01F74_A831TipColCod
            }
            , new Object[] {
            T01F75_A494ForSer, T01F75_A482ForColNom, T01F75_A483ForColNum, T01F75_A5742ForSerDsc, T01F75_n5742ForSerDsc, T01F75_A396EmprCod, T01F75_A252CliCod, T01F75_A831TipColCod
            }
            , new Object[] {
            T01F76_A279CliNom
            }
            , new Object[] {
            T01F77_A832TipColDsc, T01F77_n832TipColDsc
            }
            , new Object[] {
            T01F78_A494ForSer, T01F78_A482ForColNom, T01F78_A483ForColNum, T01F78_A5742ForSerDsc, T01F78_n5742ForSerDsc, T01F78_A279CliNom, T01F78_A832TipColDsc, T01F78_n832TipColDsc, T01F78_A396EmprCod, T01F78_A252CliCod,
            T01F78_A831TipColCod
            }
            , new Object[] {
            T01F79_A396EmprCod, T01F79_A252CliCod, T01F79_A494ForSer, T01F79_A482ForColNom, T01F79_A483ForColNum, T01F79_A831TipColCod
            }
            , new Object[] {
            T01F710_A396EmprCod, T01F710_A252CliCod, T01F710_A494ForSer, T01F710_A482ForColNom, T01F710_A483ForColNum, T01F710_A831TipColCod
            }
            , new Object[] {
            T01F711_A396EmprCod, T01F711_A252CliCod, T01F711_A494ForSer, T01F711_A482ForColNom, T01F711_A483ForColNum, T01F711_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F715_A396EmprCod, T01F715_A252CliCod, T01F715_A494ForSer, T01F715_A482ForColNom, T01F715_A483ForColNum, T01F715_A831TipColCod, T01F715_A13377ForNormaID
            }
            , new Object[] {
            T01F716_A396EmprCod, T01F716_A252CliCod, T01F716_A494ForSer, T01F716_A482ForColNom, T01F716_A483ForColNum, T01F716_A831TipColCod, T01F716_A3571EnsCod
            }
            , new Object[] {
            T01F717_A396EmprCod, T01F717_A252CliCod, T01F717_A494ForSer, T01F717_A482ForColNom, T01F717_A483ForColNum, T01F717_A831TipColCod, T01F717_A7270Procod_c, T01F717_A7272CliCod_d
            }
            , new Object[] {
            T01F718_A396EmprCod, T01F718_A252CliCod, T01F718_A494ForSer, T01F718_A482ForColNom, T01F718_A483ForColNum, T01F718_A831TipColCod, T01F718_A6525ColAqP
            }
            , new Object[] {
            T01F719_A396EmprCod, T01F719_A252CliCod, T01F719_A494ForSer, T01F719_A482ForColNom, T01F719_A483ForColNum, T01F719_A831TipColCod, T01F719_A6037Mq_Grupo
            }
            , new Object[] {
            T01F720_A396EmprCod, T01F720_A252CliCod, T01F720_A494ForSer, T01F720_A482ForColNom, T01F720_A483ForColNum, T01F720_A831TipColCod, T01F720_A853For_ProC
            }
            , new Object[] {
            T01F721_A396EmprCod, T01F721_A252CliCod, T01F721_A494ForSer, T01F721_A482ForColNom, T01F721_A483ForColNum, T01F721_A831TipColCod, T01F721_A9766ForProC
            }
            , new Object[] {
            T01F722_A396EmprCod, T01F722_A252CliCod, T01F722_A494ForSer, T01F722_A482ForColNom, T01F722_A483ForColNum, T01F722_A831TipColCod, T01F722_A7797Sim_lin
            }
            , new Object[] {
            T01F723_A396EmprCod, T01F723_A252CliCod, T01F723_A494ForSer, T01F723_A482ForColNom, T01F723_A483ForColNum, T01F723_A831TipColCod, T01F723_A7094Acab_Ter
            }
            , new Object[] {
            T01F724_A396EmprCod, T01F724_A252CliCod, T01F724_A494ForSer, T01F724_A482ForColNom, T01F724_A483ForColNum, T01F724_A831TipColCod, T01F724_A3689ComForLin
            }
            , new Object[] {
            T01F725_A396EmprCod, T01F725_A252CliCod, T01F725_A494ForSer, T01F725_A482ForColNom, T01F725_A483ForColNum, T01F725_A831TipColCod, T01F725_A1519RecCorLin
            }
            , new Object[] {
            T01F726_A396EmprCod, T01F726_A252CliCod, T01F726_A494ForSer, T01F726_A482ForColNom, T01F726_A483ForColNum, T01F726_A831TipColCod, T01F726_A1160ProForL
            }
            , new Object[] {
            T01F727_A396EmprCod, T01F727_A910Workstat, T01F727_A880EscLin
            }
            , new Object[] {
            T01F728_A396EmprCod, T01F728_A252CliCod, T01F728_A494ForSer, T01F728_A482ForColNom, T01F728_A483ForColNum, T01F728_A831TipColCod, T01F728_A650ObsLin
            }
            , new Object[] {
            T01F729_A396EmprCod, T01F729_A252CliCod, T01F729_A494ForSer, T01F729_A482ForColNom, T01F729_A483ForColNum, T01F729_A831TipColCod
            }
            , new Object[] {
            T01F730_A494ForSer, T01F730_A482ForColNom, T01F730_A483ForColNum, T01F730_A831TipColCod, T01F730_A7262CACPP, T01F730_A7264CACPPrK, T01F730_n7264CACPPrK, T01F730_A7265CACPPrM, T01F730_n7265CACPPrM, T01F730_A396EmprCod,
            T01F730_A252CliCod
            }
            , new Object[] {
            T01F731_A396EmprCod, T01F731_A252CliCod, T01F731_A494ForSer, T01F731_A482ForColNom, T01F731_A483ForColNum, T01F731_A831TipColCod, T01F731_A7262CACPP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01F735_A396EmprCod, T01F735_A252CliCod, T01F735_A494ForSer, T01F735_A482ForColNom, T01F735_A483ForColNum, T01F735_A831TipColCod, T01F735_A7262CACPP
            }
            , new Object[] {
            T01F736_A279CliNom
            }
            , new Object[] {
            T01F737_A832TipColDsc, T01F737_n832TipColDsc
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
      AV32Pgmname = "TPCACP" ;
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
   private short nRcdDeleted_1565 ;
   private short nRcdExists_1565 ;
   private short nIsMod_1565 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1565 ;
   private short RcdFound1565 ;
   private short nBlankRcdUsr1565 ;
   private short RcdFound47 ;
   private short nIsDirty_47 ;
   private short nIsDirty_1565 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
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
   private int edtForSerDsc_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtavnRcdDeleted_1565_Enabled ;
   private int edtCACPP_Enabled ;
   private int edtCACPPD_Enabled ;
   private int edtCACPPrK_Enabled ;
   private int edtCACPPrM_Enabled ;
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
   private int defedtCACPP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtForSerDsc_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7264CACPPrK ;
   private java.math.BigDecimal Z7265CACPPrM ;
   private java.math.BigDecimal A7264CACPPrK ;
   private java.math.BigDecimal A7265CACPPrM ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z5742ForSerDsc ;
   private String Z7262CACPP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A7262CACPP ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtForSerDsc_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String sMode1565 ;
   private String edtavnRcdDeleted_1565_Internalname ;
   private String edtCACPP_Internalname ;
   private String edtCACPPD_Internalname ;
   private String edtCACPPrK_Internalname ;
   private String edtCACPPrM_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode47 ;
   private String GXCCtl ;
   private String A7263CACPPD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1565_Jsonclick ;
   private String edtCACPP_Jsonclick ;
   private String edtCACPPD_Jsonclick ;
   private String edtCACPPrK_Jsonclick ;
   private String edtCACPPrM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ5742ForSerDsc ;
   private String ZZ279CliNom ;
   private String ZZ832TipColDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z7263CACPPD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n494ForSer ;
   private boolean n482ForColNom ;
   private boolean n483ForColNum ;
   private boolean n831TipColCod ;
   private boolean wbErr ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean returnInSub ;
   private boolean n7264CACPPrK ;
   private boolean n7265CACPPrM ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01F76_A279CliNom ;
   private String[] T01F77_A832TipColDsc ;
   private boolean[] T01F77_n832TipColDsc ;
   private String[] T01F78_A494ForSer ;
   private boolean[] T01F78_n494ForSer ;
   private String[] T01F78_A482ForColNom ;
   private boolean[] T01F78_n482ForColNom ;
   private int[] T01F78_A483ForColNum ;
   private boolean[] T01F78_n483ForColNum ;
   private String[] T01F78_A5742ForSerDsc ;
   private boolean[] T01F78_n5742ForSerDsc ;
   private String[] T01F78_A279CliNom ;
   private String[] T01F78_A832TipColDsc ;
   private boolean[] T01F78_n832TipColDsc ;
   private String[] T01F78_A396EmprCod ;
   private int[] T01F78_A252CliCod ;
   private boolean[] T01F78_n252CliCod ;
   private byte[] T01F78_A831TipColCod ;
   private boolean[] T01F78_n831TipColCod ;
   private String[] T01F79_A396EmprCod ;
   private int[] T01F79_A252CliCod ;
   private boolean[] T01F79_n252CliCod ;
   private String[] T01F79_A494ForSer ;
   private boolean[] T01F79_n494ForSer ;
   private String[] T01F79_A482ForColNom ;
   private boolean[] T01F79_n482ForColNom ;
   private int[] T01F79_A483ForColNum ;
   private boolean[] T01F79_n483ForColNum ;
   private byte[] T01F79_A831TipColCod ;
   private boolean[] T01F79_n831TipColCod ;
   private String[] T01F75_A494ForSer ;
   private boolean[] T01F75_n494ForSer ;
   private String[] T01F75_A482ForColNom ;
   private boolean[] T01F75_n482ForColNom ;
   private int[] T01F75_A483ForColNum ;
   private boolean[] T01F75_n483ForColNum ;
   private String[] T01F75_A5742ForSerDsc ;
   private boolean[] T01F75_n5742ForSerDsc ;
   private String[] T01F75_A396EmprCod ;
   private int[] T01F75_A252CliCod ;
   private boolean[] T01F75_n252CliCod ;
   private byte[] T01F75_A831TipColCod ;
   private boolean[] T01F75_n831TipColCod ;
   private String[] T01F710_A396EmprCod ;
   private int[] T01F710_A252CliCod ;
   private boolean[] T01F710_n252CliCod ;
   private String[] T01F710_A494ForSer ;
   private boolean[] T01F710_n494ForSer ;
   private String[] T01F710_A482ForColNom ;
   private boolean[] T01F710_n482ForColNom ;
   private int[] T01F710_A483ForColNum ;
   private boolean[] T01F710_n483ForColNum ;
   private byte[] T01F710_A831TipColCod ;
   private boolean[] T01F710_n831TipColCod ;
   private String[] T01F711_A396EmprCod ;
   private int[] T01F711_A252CliCod ;
   private boolean[] T01F711_n252CliCod ;
   private String[] T01F711_A494ForSer ;
   private boolean[] T01F711_n494ForSer ;
   private String[] T01F711_A482ForColNom ;
   private boolean[] T01F711_n482ForColNom ;
   private int[] T01F711_A483ForColNum ;
   private boolean[] T01F711_n483ForColNum ;
   private byte[] T01F711_A831TipColCod ;
   private boolean[] T01F711_n831TipColCod ;
   private String[] T01F74_A494ForSer ;
   private boolean[] T01F74_n494ForSer ;
   private String[] T01F74_A482ForColNom ;
   private boolean[] T01F74_n482ForColNom ;
   private int[] T01F74_A483ForColNum ;
   private boolean[] T01F74_n483ForColNum ;
   private String[] T01F74_A5742ForSerDsc ;
   private boolean[] T01F74_n5742ForSerDsc ;
   private String[] T01F74_A396EmprCod ;
   private int[] T01F74_A252CliCod ;
   private boolean[] T01F74_n252CliCod ;
   private byte[] T01F74_A831TipColCod ;
   private boolean[] T01F74_n831TipColCod ;
   private String[] T01F715_A396EmprCod ;
   private int[] T01F715_A252CliCod ;
   private boolean[] T01F715_n252CliCod ;
   private String[] T01F715_A494ForSer ;
   private boolean[] T01F715_n494ForSer ;
   private String[] T01F715_A482ForColNom ;
   private boolean[] T01F715_n482ForColNom ;
   private int[] T01F715_A483ForColNum ;
   private boolean[] T01F715_n483ForColNum ;
   private byte[] T01F715_A831TipColCod ;
   private boolean[] T01F715_n831TipColCod ;
   private String[] T01F715_A13377ForNormaID ;
   private String[] T01F716_A396EmprCod ;
   private int[] T01F716_A252CliCod ;
   private boolean[] T01F716_n252CliCod ;
   private String[] T01F716_A494ForSer ;
   private boolean[] T01F716_n494ForSer ;
   private String[] T01F716_A482ForColNom ;
   private boolean[] T01F716_n482ForColNom ;
   private int[] T01F716_A483ForColNum ;
   private boolean[] T01F716_n483ForColNum ;
   private byte[] T01F716_A831TipColCod ;
   private boolean[] T01F716_n831TipColCod ;
   private String[] T01F716_A3571EnsCod ;
   private String[] T01F717_A396EmprCod ;
   private int[] T01F717_A252CliCod ;
   private boolean[] T01F717_n252CliCod ;
   private String[] T01F717_A494ForSer ;
   private boolean[] T01F717_n494ForSer ;
   private String[] T01F717_A482ForColNom ;
   private boolean[] T01F717_n482ForColNom ;
   private int[] T01F717_A483ForColNum ;
   private boolean[] T01F717_n483ForColNum ;
   private byte[] T01F717_A831TipColCod ;
   private boolean[] T01F717_n831TipColCod ;
   private String[] T01F717_A7270Procod_c ;
   private int[] T01F717_A7272CliCod_d ;
   private String[] T01F718_A396EmprCod ;
   private int[] T01F718_A252CliCod ;
   private boolean[] T01F718_n252CliCod ;
   private String[] T01F718_A494ForSer ;
   private boolean[] T01F718_n494ForSer ;
   private String[] T01F718_A482ForColNom ;
   private boolean[] T01F718_n482ForColNom ;
   private int[] T01F718_A483ForColNum ;
   private boolean[] T01F718_n483ForColNum ;
   private byte[] T01F718_A831TipColCod ;
   private boolean[] T01F718_n831TipColCod ;
   private String[] T01F718_A6525ColAqP ;
   private String[] T01F719_A396EmprCod ;
   private int[] T01F719_A252CliCod ;
   private boolean[] T01F719_n252CliCod ;
   private String[] T01F719_A494ForSer ;
   private boolean[] T01F719_n494ForSer ;
   private String[] T01F719_A482ForColNom ;
   private boolean[] T01F719_n482ForColNom ;
   private int[] T01F719_A483ForColNum ;
   private boolean[] T01F719_n483ForColNum ;
   private byte[] T01F719_A831TipColCod ;
   private boolean[] T01F719_n831TipColCod ;
   private byte[] T01F719_A6037Mq_Grupo ;
   private String[] T01F720_A396EmprCod ;
   private int[] T01F720_A252CliCod ;
   private boolean[] T01F720_n252CliCod ;
   private String[] T01F720_A494ForSer ;
   private boolean[] T01F720_n494ForSer ;
   private String[] T01F720_A482ForColNom ;
   private boolean[] T01F720_n482ForColNom ;
   private int[] T01F720_A483ForColNum ;
   private boolean[] T01F720_n483ForColNum ;
   private byte[] T01F720_A831TipColCod ;
   private boolean[] T01F720_n831TipColCod ;
   private String[] T01F720_A853For_ProC ;
   private String[] T01F721_A396EmprCod ;
   private int[] T01F721_A252CliCod ;
   private boolean[] T01F721_n252CliCod ;
   private String[] T01F721_A494ForSer ;
   private boolean[] T01F721_n494ForSer ;
   private String[] T01F721_A482ForColNom ;
   private boolean[] T01F721_n482ForColNom ;
   private int[] T01F721_A483ForColNum ;
   private boolean[] T01F721_n483ForColNum ;
   private byte[] T01F721_A831TipColCod ;
   private boolean[] T01F721_n831TipColCod ;
   private String[] T01F721_A9766ForProC ;
   private String[] T01F722_A396EmprCod ;
   private int[] T01F722_A252CliCod ;
   private boolean[] T01F722_n252CliCod ;
   private String[] T01F722_A494ForSer ;
   private boolean[] T01F722_n494ForSer ;
   private String[] T01F722_A482ForColNom ;
   private boolean[] T01F722_n482ForColNom ;
   private int[] T01F722_A483ForColNum ;
   private boolean[] T01F722_n483ForColNum ;
   private byte[] T01F722_A831TipColCod ;
   private boolean[] T01F722_n831TipColCod ;
   private short[] T01F722_A7797Sim_lin ;
   private String[] T01F723_A396EmprCod ;
   private int[] T01F723_A252CliCod ;
   private boolean[] T01F723_n252CliCod ;
   private String[] T01F723_A494ForSer ;
   private boolean[] T01F723_n494ForSer ;
   private String[] T01F723_A482ForColNom ;
   private boolean[] T01F723_n482ForColNom ;
   private int[] T01F723_A483ForColNum ;
   private boolean[] T01F723_n483ForColNum ;
   private byte[] T01F723_A831TipColCod ;
   private boolean[] T01F723_n831TipColCod ;
   private String[] T01F723_A7094Acab_Ter ;
   private String[] T01F724_A396EmprCod ;
   private int[] T01F724_A252CliCod ;
   private boolean[] T01F724_n252CliCod ;
   private String[] T01F724_A494ForSer ;
   private boolean[] T01F724_n494ForSer ;
   private String[] T01F724_A482ForColNom ;
   private boolean[] T01F724_n482ForColNom ;
   private int[] T01F724_A483ForColNum ;
   private boolean[] T01F724_n483ForColNum ;
   private byte[] T01F724_A831TipColCod ;
   private boolean[] T01F724_n831TipColCod ;
   private short[] T01F724_A3689ComForLin ;
   private String[] T01F725_A396EmprCod ;
   private int[] T01F725_A252CliCod ;
   private boolean[] T01F725_n252CliCod ;
   private String[] T01F725_A494ForSer ;
   private boolean[] T01F725_n494ForSer ;
   private String[] T01F725_A482ForColNom ;
   private boolean[] T01F725_n482ForColNom ;
   private int[] T01F725_A483ForColNum ;
   private boolean[] T01F725_n483ForColNum ;
   private byte[] T01F725_A831TipColCod ;
   private boolean[] T01F725_n831TipColCod ;
   private byte[] T01F725_A1519RecCorLin ;
   private String[] T01F726_A396EmprCod ;
   private int[] T01F726_A252CliCod ;
   private boolean[] T01F726_n252CliCod ;
   private String[] T01F726_A494ForSer ;
   private boolean[] T01F726_n494ForSer ;
   private String[] T01F726_A482ForColNom ;
   private boolean[] T01F726_n482ForColNom ;
   private int[] T01F726_A483ForColNum ;
   private boolean[] T01F726_n483ForColNum ;
   private byte[] T01F726_A831TipColCod ;
   private boolean[] T01F726_n831TipColCod ;
   private short[] T01F726_A1160ProForL ;
   private String[] T01F727_A396EmprCod ;
   private String[] T01F727_A910Workstat ;
   private short[] T01F727_A880EscLin ;
   private String[] T01F728_A396EmprCod ;
   private int[] T01F728_A252CliCod ;
   private boolean[] T01F728_n252CliCod ;
   private String[] T01F728_A494ForSer ;
   private boolean[] T01F728_n494ForSer ;
   private String[] T01F728_A482ForColNom ;
   private boolean[] T01F728_n482ForColNom ;
   private int[] T01F728_A483ForColNum ;
   private boolean[] T01F728_n483ForColNum ;
   private byte[] T01F728_A831TipColCod ;
   private boolean[] T01F728_n831TipColCod ;
   private short[] T01F728_A650ObsLin ;
   private String[] T01F729_A396EmprCod ;
   private int[] T01F729_A252CliCod ;
   private boolean[] T01F729_n252CliCod ;
   private String[] T01F729_A494ForSer ;
   private boolean[] T01F729_n494ForSer ;
   private String[] T01F729_A482ForColNom ;
   private boolean[] T01F729_n482ForColNom ;
   private int[] T01F729_A483ForColNum ;
   private boolean[] T01F729_n483ForColNum ;
   private byte[] T01F729_A831TipColCod ;
   private boolean[] T01F729_n831TipColCod ;
   private String[] T01F730_A494ForSer ;
   private boolean[] T01F730_n494ForSer ;
   private String[] T01F730_A482ForColNom ;
   private boolean[] T01F730_n482ForColNom ;
   private int[] T01F730_A483ForColNum ;
   private boolean[] T01F730_n483ForColNum ;
   private byte[] T01F730_A831TipColCod ;
   private boolean[] T01F730_n831TipColCod ;
   private String[] T01F730_A7262CACPP ;
   private java.math.BigDecimal[] T01F730_A7264CACPPrK ;
   private boolean[] T01F730_n7264CACPPrK ;
   private java.math.BigDecimal[] T01F730_A7265CACPPrM ;
   private boolean[] T01F730_n7265CACPPrM ;
   private String[] T01F730_A396EmprCod ;
   private int[] T01F730_A252CliCod ;
   private boolean[] T01F730_n252CliCod ;
   private String[] T01F731_A396EmprCod ;
   private int[] T01F731_A252CliCod ;
   private boolean[] T01F731_n252CliCod ;
   private String[] T01F731_A494ForSer ;
   private boolean[] T01F731_n494ForSer ;
   private String[] T01F731_A482ForColNom ;
   private boolean[] T01F731_n482ForColNom ;
   private int[] T01F731_A483ForColNum ;
   private boolean[] T01F731_n483ForColNum ;
   private byte[] T01F731_A831TipColCod ;
   private boolean[] T01F731_n831TipColCod ;
   private String[] T01F731_A7262CACPP ;
   private String[] T01F73_A494ForSer ;
   private boolean[] T01F73_n494ForSer ;
   private String[] T01F73_A482ForColNom ;
   private boolean[] T01F73_n482ForColNom ;
   private int[] T01F73_A483ForColNum ;
   private boolean[] T01F73_n483ForColNum ;
   private byte[] T01F73_A831TipColCod ;
   private boolean[] T01F73_n831TipColCod ;
   private String[] T01F73_A7262CACPP ;
   private java.math.BigDecimal[] T01F73_A7264CACPPrK ;
   private boolean[] T01F73_n7264CACPPrK ;
   private java.math.BigDecimal[] T01F73_A7265CACPPrM ;
   private boolean[] T01F73_n7265CACPPrM ;
   private String[] T01F73_A396EmprCod ;
   private int[] T01F73_A252CliCod ;
   private boolean[] T01F73_n252CliCod ;
   private String[] T01F72_A494ForSer ;
   private boolean[] T01F72_n494ForSer ;
   private String[] T01F72_A482ForColNom ;
   private boolean[] T01F72_n482ForColNom ;
   private int[] T01F72_A483ForColNum ;
   private boolean[] T01F72_n483ForColNum ;
   private byte[] T01F72_A831TipColCod ;
   private boolean[] T01F72_n831TipColCod ;
   private String[] T01F72_A7262CACPP ;
   private java.math.BigDecimal[] T01F72_A7264CACPPrK ;
   private boolean[] T01F72_n7264CACPPrK ;
   private java.math.BigDecimal[] T01F72_A7265CACPPrM ;
   private boolean[] T01F72_n7265CACPPrM ;
   private String[] T01F72_A396EmprCod ;
   private int[] T01F72_A252CliCod ;
   private boolean[] T01F72_n252CliCod ;
   private String[] T01F735_A396EmprCod ;
   private int[] T01F735_A252CliCod ;
   private boolean[] T01F735_n252CliCod ;
   private String[] T01F735_A494ForSer ;
   private boolean[] T01F735_n494ForSer ;
   private String[] T01F735_A482ForColNom ;
   private boolean[] T01F735_n482ForColNom ;
   private int[] T01F735_A483ForColNum ;
   private boolean[] T01F735_n483ForColNum ;
   private byte[] T01F735_A831TipColCod ;
   private boolean[] T01F735_n831TipColCod ;
   private String[] T01F735_A7262CACPP ;
   private String[] T01F736_A279CliNom ;
   private String[] T01F737_A832TipColDsc ;
   private boolean[] T01F737_n832TipColDsc ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpcacp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcacp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcacp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpcacp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01F72", "SELECT ForSer, ForColNom, ForColNum, TipColCod, CACPP, CACPPrK, CACPPrM, EmprCod, CliCod FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND CACPP = ?  FOR UPDATE OF CACPPrK, CACPPrM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F73", "SELECT ForSer, ForColNom, ForColNum, TipColCod, CACPP, CACPPrK, CACPPrM, EmprCod, CliCod FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND CACPP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F74", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?  FOR UPDATE OF ForSerDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F75", "SELECT ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F76", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F77", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F78", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ForSerDsc, T2.CliNom, T3.TipColDsc, TM1.EmprCod, TM1.CliCod, TM1.TipColCod FROM ((TXPCFORMU TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipColCod = TM1.TipColCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F79", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F710", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F711", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01F712", "INSERT INTO TXPCFORMU(ForSer, ForColNom, ForColNum, ForSerDsc, EmprCod, CliCod, TipColCod, ForNumCol, BarCod, BarCodReo, BarCodPar, ForFec, ForUltMod, IntCod, MatCod, ForUltUti, ForPreKgm, ForPreMtr, ForPreDef, ForCon, ObsUltLin, ForUltLin, ForNomCli, ForNumCli, RecCorULin, ForPro, ForRelBan, PrecioA, PrecioM, ForTonal, ForNumArc, CodSol, ForFecApr, ForSitCom, ForOpcCli, ForEst, ComUltLin, MacProCod, ForCosUti, ForRGB, ForCosForm, ForTipArt, ForCodExt, IntCodF, ForUsrCod, ForFecHor, ForObsM, ForPInc, ForNomCli2, ForUsrCre, ForFecCre, ForNomCli3, ForOpNum, ForBlo, Sim_Ulin, ForTipT, Fam_Cod, For_item1, Lb_CodL, Lb_CodC, For_Reo, ForFecCtrl, ForFecCtrf, ForcosH20, ForCosFab, ForCosFin, ForKgUTin, ForKgTTin, ForCosTTi, UltEnsCod, ForPreFec, ForPreAnt, ForFecAnt, For_item2, ForObs2, ForPanto, ForCurva, ForMT, ForTRabs, ForKgMn, ForLotHil2, ForLotHil3, ForObsFac, ForLbTalao, ForSerDsc2, ForAlterna, ForPlanta) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0)", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01F713", "UPDATE TXPCFORMU SET ForSerDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new UpdateCursor("T01F714", "DELETE FROM TXPCFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK, "TXPCFORMU")
         ,new ForEachCursor("T01F715", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F716", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod FROM TXPENSCAB WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F717", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Procod_c, CliCod_d FROM TXPPCOPCD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F718", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ColAqP FROM TXPPCOLAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F719", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Mq_Grupo FROM TXPFORMQP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F720", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC FROM TXPTAB000 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F721", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F722", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F723", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F724", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ComForLin FROM TXPFORCOM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F725", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F726", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F727", "SELECT * FROM (SELECT EmprCod, Workstat, EscLin FROM TXPLESCAN WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F728", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F729", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01F730", "SELECT ForSer, ForColNom, ForColNum, TipColCod, CACPP, CACPPrK, CACPPrM, EmprCod, CliCod FROM TXPPCACP WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and CACPP = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F731", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND CACPP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01F732", "INSERT INTO TXPPCACP(ForSer, ForColNom, ForColNum, TipColCod, CACPP, CACPPrK, CACPPrM, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPCACP")
         ,new UpdateCursor("T01F733", "UPDATE TXPPCACP SET CACPPrK=?, CACPPrM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND CACPP = ?", GX_NOMASK, "TXPPCACP")
         ,new UpdateCursor("T01F734", "DELETE FROM TXPPCACP  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND CACPP = ?", GX_NOMASK, "TXPPCACP")
         ,new ForEachCursor("T01F735", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP FROM TXPPCACP WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, CACPP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F736", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01F737", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 35 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(7, (String)parms[11], 8);
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
               return;
            case 5 :
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
            case 7 :
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 26);
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
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
            case 12 :
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
            case 13 :
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
               stmt.setString(7, (String)parms[11], 8);
               return;
            case 29 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               stmt.setString(5, (String)parms[8], 8);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               stmt.setString(8, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 13);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               stmt.setString(9, (String)parms[15], 8);
               return;
            case 32 :
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
               stmt.setString(7, (String)parms[11], 8);
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
               return;
            case 34 :
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
            case 35 :
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

